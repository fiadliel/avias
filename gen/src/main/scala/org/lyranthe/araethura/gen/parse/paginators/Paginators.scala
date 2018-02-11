package org.lyranthe.araethura.gen.parse.paginators

import java.nio.file.Path

import io.circe._
import io.circe.generic.auto._
import io.circe.parser._

import scala.io.Source

case class Paginator(input_token: String,
                     limit_key: Option[String],
                     output_token: String,
                     result_key: String)

case class Paginators(pagination: Map[String, Paginator])

object Paginators {
  def fromFile(f: Path): Either[Error, Option[Paginators]] = {
    if (f.toFile.canRead) {
      val s = Source.fromFile(f.toFile)
      try {
        decode[Paginators](s.mkString).map(Option.apply)
      } finally {
        s.close()
      }
    } else Right(None)
  }
}
