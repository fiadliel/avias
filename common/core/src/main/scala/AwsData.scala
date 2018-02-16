package avias.common

case class AwsData[F[_]](region: String, accessKeyId: String, secretAccessKey: String, sessionToken: Option[String])
