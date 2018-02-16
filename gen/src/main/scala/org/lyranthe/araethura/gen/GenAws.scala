package org.lyranthe.araethura.gen

import java.nio.file._

import fs2._
import cats._
import cats.effect._
import cats.implicits._
import fs2.StreamApp.ExitCode
import org.lyranthe.araethura.gen.generator.{Structures, Trait}
import org.lyranthe.araethura.gen.graph.ServiceGraph
import org.lyranthe.araethura.gen.parse.service.{JsonProtocol, Service}

case class ServiceDetails(serviceName: String, service: Service)

object GenAws extends StreamApp[IO] {
  def writeFile(path: Path, contents: String): IO[Unit] = {
    Stream.emit(contents).covary[IO].through(fs2.text.utf8Encode).to(fs2.io.file.writeAll[IO](path)).compile.drain
  }

  def writeTrait(baseDir: Path, traits: Trait): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("core/src/main/scala")))
      fileContents = traits.definition.toString()
      _ <- writeFile(dir.resolve("MyTrait.scala"), fileContents)
    } yield ()
  }

  def writeHttp4s(baseDir: Path, traits: Trait): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("http4s/src/main/scala")))
      fileContents = traits.http4sImplementation.toString()
      _ <- writeFile(dir.resolve("Http4sImpl.scala"), fileContents)
    } yield ()
  }

  def writeModels(baseDir: Path, structures: Structures): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("core/src/main/scala")))
      fileContents = structures.modelDefinitions.toString()
      _ <- writeFile(dir.resolve("Models.scala"), fileContents)
    } yield ()
  }

  def writeCirce(baseDir: Path, structures: Structures): IO[Unit] = {
    for {
      dir <- IO(Files.createDirectories(baseDir.resolve("circe/src/main/scala")))
      fileContents = structures.circeImplicits.toString()
      _ <- writeFile(dir.resolve("CirceImplicits.scala"), fileContents)
    } yield ()
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
      _ <- writeCirce(baseDir, structures)
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
      service <- Stream.eval(Service.fromFile(serviceFile)).filter(_.metadata.protocol == JsonProtocol)
    } yield ServiceDetails(serviceDir._1, service)
  }

  def runProgram: Stream[IO, Unit] = {
    for {
      _ <- Stream.eval(
        IO(
          Files.write(
            Paths.get(s"../projects.sbt"),
            s"""
               |lazy val `common-core` = project.in(file("common/core"))
               |lazy val `common-circe` = project.in(file("common/circe")).settings(Dependencies.circe).dependsOn(`common-core`)
               |lazy val `common-http4s` = project.in(file("common/http4s")).settings(Dependencies.http4s).dependsOn(`common-circe`)
               |""".stripMargin.getBytes(),
            StandardOpenOption.TRUNCATE_EXISTING
          )))
      service <- getServices[IO]
      _ <- Stream.eval(generateFromSources(service))
      sbtFile = s"""
           |lazy val `${service.serviceName}` = project.in(file("services/${service.serviceName}/core"))
           |lazy val `${service.serviceName}-circe` = project.in(file("services/${service.serviceName}/circe")).dependsOn(`common-circe`, `${service.serviceName}`)
           |lazy val `${service.serviceName}-http4s` = project.in(file("services/${service.serviceName}/http4s")).dependsOn(`common-http4s`, `${service.serviceName}-circe`)
           |""".stripMargin
      _ <- Stream.eval(
        IO(
          Files.write(Paths.get(s"../projects.sbt"),
                      sbtFile.getBytes,
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
