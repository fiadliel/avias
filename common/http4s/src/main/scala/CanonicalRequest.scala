package org.lyranthe.araethura.common.http4s

import cats.effect.Sync
import cats.implicits._
import org.http4s._
import scodec.bits.ByteVector
import tsec.common._
import tsec.messagedigests._
import tsec.messagedigests.core._

case class CanonicalRequest(signedHeaders: String, hash: String)

object CanonicalRequest {
  private def getBodyHash[F[_]: Sync, H: DigestTag](req: Request[F]): F[String] =
    req.body.chunks.compile.fold(ByteVector.empty) {
      case (bv, bytes) => bv ++ ByteVector(bytes.toArray)
    } map (_.toArray.hash[H].toHexString)

  def fromRequest[F[_]: Sync, H: DigestTag](
      request: Request[F],
      charset: java.nio.charset.Charset = java.nio.charset.StandardCharsets.UTF_8
  ): F[CanonicalRequest] = {
    val requestMethod        = request.method.name
    val canonicalUri         = request.uri.path
    val canonicalQueryString = request.queryString
    val headers =
      (request.uri.host
        .map(h => Header("host", h.value))
        .toList ::: request.headers.toList).sortBy(_.name)

    val canonicalHeaders =
      headers
        .map(h => s"${h.name.value.toLowerCase}:${h.value.split(" +").mkString(" ")}")
        .mkString("", "\n", "\n")

    val signedHeaders: String =
      headers.map(_.name.value.toLowerCase).mkString(";")

    getBodyHash[F, H](request) map { bodyHash: String =>
      val canonicalRequest =
        requestMethod + "\n" +
          canonicalUri + "\n" +
          canonicalQueryString + "\n" +
          canonicalHeaders + "\n" +
          signedHeaders + "\n" +
          bodyHash

      CanonicalRequest(
        signedHeaders,
        canonicalRequest.getBytes(charset).hash[H].toHexString
      )
    }
  }
}
