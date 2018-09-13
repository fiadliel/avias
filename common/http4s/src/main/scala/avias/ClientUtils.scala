package avias.common.http4s

import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec

import cats._
import cats.effect.Sync
import cats.implicits._
import io.circe.{Decoder, Encoder}
import avias.common._
import org.http4s.{EntityDecoder, EntityEncoder, Header, Method, Request, Uri}
import org.http4s.client.Client
import tsec.common._
import tsec.mac.imports._
import tsec.messagedigests.imports._

import scala.language.higherKinds

private[avias] object ClientUtils {
  implicit def entityEncoder[F[_]: Applicative, A: Encoder] =
    org.http4s.circe.jsonEncoderOf[F, A] //.withContentType(jsonContentType)
  implicit def entityDecoder[F[_]: Sync, A: Decoder] =
    org.http4s.circe.jsonOf[F, A]

  private def HmacSHA256[F[_]](data: String, key: Array[Byte])(implicit F: Sync[F]): F[Array[Byte]] = {
    val algorithm = "HmacSHA256"
    F.delay {
      val mac = Mac.getInstance(algorithm)
      mac.init(new SecretKeySpec(key, algorithm))
      mac.doFinal(data.getBytes("UTF8"))
    }
  }

  private def mkSigningKey[F[_]: Sync](currentTime: CurrentTime, service: String,
  awsData: AwsData[F]): F[MacSigningKey[HMACSHA256]] = {
    val kSecret = ("AWS4" + awsData.secretAccessKey).getBytes("UTF8")
    for {
      kDate    <- HmacSHA256(currentTime.date, kSecret)
      kRegion  <- HmacSHA256(awsData.region, kDate)
      kService <- HmacSHA256(service, kRegion)
      kSigning <- HmacSHA256("aws4_request", kService)
    } yield HMACSHA256.buildKeyUnsafe(kSigning)
  }


  private[http4s] def mkRequest[F[_]: Functor](currentTime: CurrentTime,
  awsData: AwsData[F],
                                                          serviceType: String,
                                                          serviceAndPrefix: Option[String],
                                                          requestType: String,
                                                          method: Method,
                                                          path: Uri.Path): Request[F] = {
    val uri =
      Uri(scheme = Some(Uri.Scheme.https),
          authority = Some(Uri.Authority(host = Uri.RegName(s"$serviceType.${awsData.region}.amazonaws.com"))))
        .withPath(path)

    val addedHeaders = Header("X-Amz-Date", currentTime.basicTime) :: serviceAndPrefix
      .map(sp => Header("X-Amz-Target", sp + "." + requestType))
      .toList

    Request[F](method = method, uri = uri)
      .putHeaders(addedHeaders: _*)
  }

  def doRequestCommon[F[_] : Sync, O](currentTime: CurrentTime,
                                      request: Request[F],
                                      client: Client[F],
                                      awsData: AwsData[F],
                                      serviceType: String)
                                     (implicit entityDecoder: EntityDecoder[F, O]): F[O] = {
    for {
      canonicalRequest <- CanonicalRequest.fromRequest[F, SHA256](request)
      credentialScope = CredentialScope(currentTime, serviceType, awsData.region)
      signingKey <- mkSigningKey[F](currentTime, serviceType, awsData)
      stringToSign = SigningString.stringToSign("SHA256", currentTime, credentialScope, canonicalRequest.hash)
      stringSigned <- JCAMac
        .sign(stringToSign.getBytes(), signingKey)
        .map(_.toHexString)
      sessionHeader = awsData.sessionToken.map { t =>
        Header("X-Amz-Security-Token", t)
      }
      auth = sessionHeader.toList ::: List(
        Header(
          "Authorization",
          s"AWS4-HMAC-SHA256 Credential=${awsData.accessKeyId}/$credentialScope, SignedHeaders=${canonicalRequest.signedHeaders}, Signature=$stringSigned"
        ))
      result <- client.expect[O](request.withHeaders(request.headers.put(auth: _*)))
    } yield result
  }

  def doRequestWithoutBody[F[_] : Sync, O](client: Client[F],
                                           awsData: AwsData[F],
                                           serviceType: String,
                                           serviceAndPrefix: Option[String],
                                           requestType: String,
                                           method: Method,
                                           path: Uri.Path)
                                          (implicit entityDecoder: EntityDecoder[F, O]): F[O] = {
    for {
      currentTime <- CurrentTime.fromNow[F]
      request = mkRequest(currentTime, awsData, serviceType, serviceAndPrefix, requestType, method, path)
      result <- doRequestCommon(currentTime, request, client, awsData, serviceType)
    } yield result
  }

  def doRequest[F[_] : Sync, O, I](client: Client[F],
                                   awsData: AwsData[F],
                                   serviceType: String,
                                   serviceAndPrefix: Option[String],
                                   requestType: String,
                                   method: Method,
                                   requestUri: Uri.Path,
                                   body: I)
                                  (implicit entityEncoder: EntityEncoder[F, I],
                                   entityDecoder: EntityDecoder[F, O]): F[O] = {
    for {
      currentTime <- CurrentTime.fromNow[F]
      request <- mkRequest(currentTime, awsData, serviceType, serviceAndPrefix, requestType, method, requestUri).withBody(body)
      result <- doRequestCommon(currentTime, request, client, awsData, serviceType)
    } yield result
  }
}
