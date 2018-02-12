package org.lyranthe.araethura.common.http4s

import cats.effect.IO
import org.http4s._
import org.scalacheck._
import org.scalacheck.Prop._
import tsec.common._
import tsec.mac.imports._
import tsec.messagedigests.imports._

object CanonicalRequestSuite extends PureTestSuite {
  testIO("appropriate signed headers are included") {
    val request = Request[IO](
      method = Method.GET,
      uri = Uri.uri("https://iam.amazonaws.com/?Action=ListUsers&Version=2010-05-08"))
        .putHeaders(
          Header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"),
          Header("X-Amz-Date", "20150830T123600Z")
        )

      CanonicalRequest.fromRequest[IO, SHA256](request).map { req =>
        "content-type;host;x-amz-date" =? req.signedHeaders
      }
  }

  testIO("correct canonical request contents is calculated") {
    val request = Request[IO](
      method = Method.GET,
      uri = Uri.uri("https://iam.amazonaws.com/?Action=ListUsers&Version=2010-05-08"))
        .putHeaders(
          Header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"),
          Header("X-Amz-Date", "20150830T123600Z")
        )

      CanonicalRequest.fromRequest[IO, SHA256](request).map { req =>
        """|GET
           |/
           |Action=ListUsers&Version=2010-05-08
           |content-type:application/x-www-form-urlencoded; charset=utf-8
           |host:iam.amazonaws.com
           |x-amz-date:20150830T123600Z
           |
           |content-type;host;x-amz-date
           |e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855""".stripMargin =? req.canonicalRequest
      }
  }

  testIO("correct hash is calculated") {
    val request = Request[IO](
      method = Method.GET,
      uri = Uri.uri("https://iam.amazonaws.com/?Action=ListUsers&Version=2010-05-08"))
        .putHeaders(
          Header("Content-Type", "application/x-www-form-urlencoded; charset=utf-8"),
          Header("X-Amz-Date", "20150830T123600Z")
        )

      CanonicalRequest.fromRequest[IO, SHA256](request).map { req =>
        "f536975d06c0309214f805bb90ccff089219ecd68b2577efef23edd43b7e1a59" =? req.hash
      }
  }
}