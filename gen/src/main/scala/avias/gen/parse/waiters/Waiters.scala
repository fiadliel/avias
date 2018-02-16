package avias.gen.parse.waiters

import java.nio.file.Path

import io.circe._
import io.circe.generic.auto._
import io.circe.parser._

import scala.io.Source

case class Acceptor(expected: Boolean,
                    matcher: String,
                    state: String,
                    argument: Option[String])

case class Waiter(delay: Int,
                  operation: String,
                  maxAttempts: Int,
                  acceptors: List[Acceptor])

case class Waiters(version: Int, waiters: Map[String, Waiter])

object Waiters {
  def fromFile(f: Path): Either[Error, Option[Waiters]] = {
    if (f.toFile.canRead) {
      val s = Source.fromFile(f.toFile)

      try {
        decode[Waiters](s.mkString).map(Option.apply)
      } finally {
        s.close()
      }
    } else Right(None)
  }
}
