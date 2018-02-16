package avias.gen.parse.service

import cats.implicits._
import io.circe._
import io.circe.generic.auto._
import io.circe.parser._
import io.circe.syntax._
import java.nio.file.Path

import cats.effect.Sync

case class StructureInstance(shape: String, documentation: Option[String])

case class Service(version: Option[String],
                   metadata: ServiceMetadata,
                   operations: Map[String, ServiceOperation],
                   shapes: Map[String, ServiceShape],
                   documentation: Option[String])

object Service {
  def fromFile[F[_]](f: Path)(implicit F: Sync[F]): F[Service] = {
    for {
      contents <- fs2.io.file
        .readAll(f, 4096)
        .through(fs2.text.utf8Decode)
        .compile
        .foldMonoid
      serviceOrError = F.pure(decode[Service](contents))
      serviceOrException = serviceOrError.map(_.leftMap(err =>
        new Throwable(s"Failed decode file: $f: ${err.toString}")))
      service <- F.rethrow(serviceOrException)
    } yield service
  }
}
