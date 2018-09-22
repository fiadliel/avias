package avias.gen

import java.nio.file._

import fs2._
import cats._
import cats.effect._
import cats.implicits._
import fs2.StreamApp.ExitCode
import avias.gen.generator._
import avias.gen.graph.ServiceGraph
import avias.gen.parse.service._

case class ServiceDetails(serviceName: String, service: Service)

object GenAws extends StreamApp[IO] {
  def writeFile(path: Path, contents: String): IO[Unit] = {
    Stream.emit(contents).covary[IO].through(fs2.text.utf8Encode).to(fs2.io.file.writeAll[IO](path)).compile.drain
  }

  def writeTrait(baseDir: Path, traits: Trait): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("core/src/main/scala/avias")))
      fileContents = traits.definition.toString()
      _ <- writeFile(dir.resolve("MyTrait.scala"), fileContents)
    } yield ()
  }

  def writeHttp4s(baseDir: Path, traits: Trait): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("http4s/src/main/scala/avias")))
      fileContents = traits.http4sImplementation.toString()
      _ <- writeFile(dir.resolve("Http4sImpl.scala"), fileContents)
    } yield ()
  }

  def writeModels(baseDir: Path, structures: Structures): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("core/src/main/scala/avias")))
      fileContents = structures.modelDefinitions.toString()
      _ <- writeFile(dir.resolve("Models.scala"), fileContents)
    } yield ()
  }

  def writeCirce(baseDir: Path, structures: Structures): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("circe/src/main/scala/avias")))
      fileContents = structures.circeImplicits.toString()
      _ <- writeFile(dir.resolve("CirceImplicits.scala"), fileContents)
    } yield ()
  }

  def writeEc2(baseDir: Path, structures: Structures): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("ec2-protocol/src/main/scala/avias")))
      fileContents = structures.ec2Implicits.toString()
      _ <- writeFile(dir.resolve("Ec2Implicits.scala"), fileContents)
    } yield ()
  }

  def writeEntityCodecs(baseDir: Path, structures: Structures, serviceProtocol: ServiceProtocol): IO[Unit] = serviceProtocol match {
    case JsonProtocol ⇒ writeCirce(baseDir, structures)
    case Ec2Protocol ⇒ writeEc2(baseDir, structures)
    case _ ⇒ IO.unit
  }

  def generateFromSources(serviceDetails: ServiceDetails): IO[Unit] = {
    val graph = ServiceGraph(serviceDetails.service)

    val baseDir =
      Files.createDirectories(
        Paths
          .get("../services")
          .resolve(serviceDetails.serviceName))

    val gen = CodeGen(serviceDetails.serviceName,
                      serviceDetails.service.metadata,
                      graph)

    val traits = gen.traits
    val structures = gen.structures

    for {
      _ <- writeTrait(baseDir, traits)
      _ <- writeHttp4s(baseDir, traits)
      _ <- writeModels(baseDir, structures)
      _ <- writeEntityCodecs(baseDir, structures, serviceDetails.service.metadata.protocol)
    } yield ()
  }

  def listFiles[F[_]](path: Path)(implicit F: Sync[F]): Stream[F, Path] = {
    import scala.collection.JavaConverters._

    Stream.bracket(F.delay(Files.list(path)))(
      d => Stream.fromIterator(d.iterator().asScala),
      d => F.delay(d.close()))
  }

  def getServiceDirs[F[_]](parent: Path, defaultServiceName: String)(
      implicit F: Sync[F]): Stream[F, (String, Path)] = {
    if (parent.toFile.isDirectory) {
      println("Parent is dir")
      val service = parent.resolve("service-2.json")
      
      for {
        ex <- Stream.eval(F.delay(service.toFile.exists()))
        result <- {
          if (ex)
            Stream.emit((defaultServiceName, parent)).covary[F]
          else
            listFiles(parent)
              .filter(_.toFile.isDirectory)
              .map(f => (f.getFileName.toString, f))
        }
      } yield result
    } else {
      println("Parent is not dir")
      Stream.empty
    }
  }

  def getServices[F[_]](implicit F: Sync[F]): Stream[F, ServiceDetails] = {
    for {
      ///cloudwatch/src/main/resources/codegen-resources/"))
      serviceParentDir <- listFiles(Paths.get("aws-sdk-java-v2", "services"))
        .filter(_.toFile.isDirectory)
        //.filter(f => wantedServices.contains(f.getFileName.toString))
        .filter(_.getFileName.toString != "waf")
        .filter(_.getFileName.toString != "api-gateway")
        .filter(_.getFileName.toString != "cognito-idp") // field notify
        .filter(_.getFileName.toString != "snowball") // field notifyAll
      serviceName = serviceParentDir.getFileName.toString
      maybeServiceDir = serviceParentDir.resolve(
        "src/main/resources/codegen-resources")
              _ = { println(maybeServiceDir) }
      serviceDir <- getServiceDirs(maybeServiceDir, serviceName)
      _ = { println(serviceDir) }
      serviceFile = serviceDir._2.resolve("service-2.json")
      service <- Stream.eval(Service.fromFile(serviceFile)).filter(service ⇒ Set[ServiceProtocol](JsonProtocol, Ec2Protocol).contains(service.metadata.protocol))
    } yield ServiceDetails(serviceDir._1, service)
  }

  private def projects(service: ServiceDetails) = service.service.metadata.protocol match {
    case JsonProtocol ⇒
      s"""
         |val `${service.serviceName}-core` = project.in(file("services/${service.serviceName}/core"))
         |val `${service.serviceName}-circe` = project.in(file("services/${service.serviceName}/circe")).dependsOn(`common-circe`, `${service.serviceName}-core`)
         |val `${service.serviceName}-http4s` = project.in(file("services/${service.serviceName}/http4s")).dependsOn(`common-http4s`, `${service.serviceName}-circe`)
         |""".stripMargin
    case Ec2Protocol ⇒
      s"""
         |val `${service.serviceName}-core` = project.in(file("services/${service.serviceName}/core"))
         |val `${service.serviceName}-ec2-protocol` = project.in(file("services/${service.serviceName}/ec2-protocol")).settings(Dependencies.http4s).dependsOn(`common-ec2-protocol`, `${service.serviceName}-core`)
         |val `${service.serviceName}-http4s` = project.in(file("services/${service.serviceName}/http4s")).dependsOn(`common-http4s`, `${service.serviceName}-ec2-protocol`)
       """.stripMargin
  }

  def runProgram: Stream[IO, Unit] = {
    for {
      _ <- Stream.eval(
        IO(
          Files.write(
            Paths.get(s"../projects.sbt"),
            s"""
               |val `common-core` = project.in(file("common/core"))
               |val `common-circe` = project.in(file("common/circe")).settings(Dependencies.circe).dependsOn(`common-core`)
               |val `common-ec2-protocol` = project.in(file("common/ec2-protocol")).settings(Dependencies.simulacrum)
               |val `common-http4s` = project.in(file("common/http4s")).settings(Dependencies.http4s).dependsOn(`common-circe`)
               |""".stripMargin.getBytes(),
            StandardOpenOption.TRUNCATE_EXISTING
          )))
      service <- getServices[IO]
      _ <- Stream.eval(generateFromSources(service))
      _ <- Stream.eval(
        IO(
          Files.write(Paths.get(s"../projects.sbt"),
                      projects(service).getBytes,
                      StandardOpenOption.APPEND)))
    } yield ()
  }

  def stream(args: List[String],
             requestShutdown: IO[Unit]): Stream[IO, StreamApp.ExitCode] = {
    for {
      _ <- Stream.eval(runProgram.run)
    } yield ExitCode.Success
  }
}
