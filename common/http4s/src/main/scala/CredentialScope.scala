package avias.common.http4s

case class CredentialScope(currentTime: CurrentTime, serviceType: String, awsRegion: String) {
  override val toString = s"${currentTime.date}/${awsRegion.toLowerCase}/${serviceType.toLowerCase}/aws4_request"
}
