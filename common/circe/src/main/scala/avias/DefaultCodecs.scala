package avias.common

import io.circe._
import java.time.Instant
import java.util.Base64

trait DefaultCodecs {
//  implicit val byteBufferEncoder: Encoder[ByteBuffer] =
//    Encoder[String].contramap((b: ByteBuffer) => ???)
//  implicit val byteBufferDecoder: Decoder[ByteBuffer] =
//    Decoder[String].emap((s: String) =>
//      for {
//        bytes <- Either.fromTry(Try(s.getBytes("UTF-8"))).leftMap(_.getMessage)
//
//      }
//      DefaultCodecs.b64Encoder.encode(s.getBytes("UTF-8")).asRight[String]
//      ByteVector.fromBase64(s).toRight("Invalid Base64 for binary"))

  implicit val instantEncoder: Encoder[Instant] =
    Encoder[Double].contramap((i: Instant) => i.toEpochMilli.toDouble / 1000)

  implicit val instantDecoder: Decoder[Instant] = Decoder[Double]
    .map((d: Double) => Instant.ofEpochSecond(d.toLong))
    .or(Decoder[String].map((s: String) => Instant.parse(s)))
}

object DefaultCodecs {
  final val b64Encoder = Base64.getEncoder
  final val b64Decoder = Base64.getDecoder
}
