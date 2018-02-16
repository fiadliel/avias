package avias.acm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DescribeCertificateResponseEncoder: io.circe.Encoder[avias.acm.models.DescribeCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson)
  }
  final implicit val RemoveTagsFromCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.RemoveTagsFromCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ListTagsForCertificateResponseEncoder: io.circe.Encoder[avias.acm.models.ListTagsForCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val InvalidTagExceptionEncoder: io.circe.Encoder[avias.acm.models.InvalidTagException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.DescribeCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ResendValidationEmailRequestEncoder: io.circe.Encoder[avias.acm.models.ResendValidationEmailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Domain" -> o.domain.asJson, "ValidationDomain" -> o.validationDomain.asJson)
  }
  final implicit val ListCertificatesResponseEncoder: io.circe.Encoder[avias.acm.models.ListCertificatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "CertificateSummaryList" -> o.certificateSummaryList.asJson)
  }
  final implicit val RequestCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.RequestCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "SubjectAlternativeNames" -> o.subjectAlternativeNames.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson)
  }
  final implicit val ListCertificatesRequestEncoder: io.circe.Encoder[avias.acm.models.ListCertificatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateStatuses" -> o.certificateStatuses.asJson, "NextToken" -> o.nextToken.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val DomainValidationOptionEncoder: io.circe.Encoder[avias.acm.models.DomainValidationOption] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "ValidationDomain" -> o.validationDomain.asJson)
  }
  final implicit val AddTagsToCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.AddTagsToCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.acm.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.acm.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.acm.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetCertificateResponseEncoder: io.circe.Encoder[avias.acm.models.GetCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "CertificateChain" -> o.certificateChain.asJson)
  }
  final implicit val InvalidArnExceptionEncoder: io.circe.Encoder[avias.acm.models.InvalidArnException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TooManyTagsExceptionEncoder: io.circe.Encoder[avias.acm.models.TooManyTagsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestInProgressExceptionEncoder: io.circe.Encoder[avias.acm.models.RequestInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.GetCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[avias.acm.models.InvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidDomainValidationOptionsExceptionEncoder: io.circe.Encoder[avias.acm.models.InvalidDomainValidationOptionsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestCertificateResponseEncoder: io.circe.Encoder[avias.acm.models.RequestCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ImportCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.ImportCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "PrivateKey" -> o.privateKey.asJson, "CertificateArn" -> o.certificateArn.asJson, "CertificateChain" -> o.certificateChain.asJson)
  }
  final implicit val CertificateDetailEncoder: io.circe.Encoder[avias.acm.models.CertificateDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "KeyAlgorithm" -> o.keyAlgorithm.asJson, "RevocationReason" -> o.revocationReason.asJson, "CertificateArn" -> o.certificateArn.asJson, "Serial" -> o.serial.asJson, "Subject" -> o.subject.asJson, "Issuer" -> o.issuer.asJson, "SignatureAlgorithm" -> o.signatureAlgorithm.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson, "DomainName" -> o.domainName.asJson, "InUseBy" -> o.inUseBy.asJson, "SubjectAlternativeNames" -> o.subjectAlternativeNames.asJson, "FailureReason" -> o.failureReason.asJson, "Status" -> o.status.asJson, "NotBefore" -> o.notBefore.asJson, "RevokedAt" -> o.revokedAt.asJson, "IssuedAt" -> o.issuedAt.asJson, "CreatedAt" -> o.createdAt.asJson, "ImportedAt" -> o.importedAt.asJson, "NotAfter" -> o.notAfter.asJson, "RenewalSummary" -> o.renewalSummary.asJson)
  }
  final implicit val DeleteCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.DeleteCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.acm.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListTagsForCertificateRequestEncoder: io.circe.Encoder[avias.acm.models.ListTagsForCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val DomainValidationEncoder: io.circe.Encoder[avias.acm.models.DomainValidation] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "ValidationDomain" -> o.validationDomain.asJson, "ValidationEmails" -> o.validationEmails.asJson, "ValidationStatus" -> o.validationStatus.asJson)
  }
  final implicit val ImportCertificateResponseEncoder: io.circe.Encoder[avias.acm.models.ImportCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val CertificateSummaryEncoder: io.circe.Encoder[avias.acm.models.CertificateSummary] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "DomainName" -> o.domainName.asJson)
  }
  final implicit val RenewalSummaryEncoder: io.circe.Encoder[avias.acm.models.RenewalSummary] = io.circe.Encoder.instance { o => 
    Json.obj("RenewalStatus" -> o.renewalStatus.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson)
  }
  final implicit val DescribeCertificateResponseDecoder: io.circe.Decoder[avias.acm.models.DescribeCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.acm.models.CertificateDetail]]("Certificate").map(avias.acm.models.DescribeCertificateResponse.apply _)
  }
  final implicit val RemoveTagsFromCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.RemoveTagsFromCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[scala.List[avias.acm.models.Tag]]("Tags")).mapN(avias.acm.models.RemoveTagsFromCertificateRequest.apply _)
  }
  final implicit val ListTagsForCertificateResponseDecoder: io.circe.Decoder[avias.acm.models.ListTagsForCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.acm.models.Tag]]]("Tags").map(avias.acm.models.ListTagsForCertificateResponse.apply _)
  }
  final implicit val InvalidTagExceptionDecoder: io.circe.Decoder[avias.acm.models.InvalidTagException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.InvalidTagException.apply _)
  }
  final implicit val DescribeCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.DescribeCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(avias.acm.models.DescribeCertificateRequest.apply _)
  }
  final implicit val ResendValidationEmailRequestDecoder: io.circe.Decoder[avias.acm.models.ResendValidationEmailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[java.lang.String]("Domain"), o.get[java.lang.String]("ValidationDomain")).mapN(avias.acm.models.ResendValidationEmailRequest.apply _)
  }
  final implicit val ListCertificatesResponseDecoder: io.circe.Decoder[avias.acm.models.ListCertificatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[avias.acm.models.CertificateSummary]]]("CertificateSummaryList")).mapN(avias.acm.models.ListCertificatesResponse.apply _)
  }
  final implicit val RequestCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.RequestCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("SubjectAlternativeNames"), o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[scala.List[avias.acm.models.DomainValidationOption]]]("DomainValidationOptions")).mapN(avias.acm.models.RequestCertificateRequest.apply _)
  }
  final implicit val ListCertificatesRequestDecoder: io.circe.Decoder[avias.acm.models.ListCertificatesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("CertificateStatuses"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(avias.acm.models.ListCertificatesRequest.apply _)
  }
  final implicit val DomainValidationOptionDecoder: io.circe.Decoder[avias.acm.models.DomainValidationOption] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[java.lang.String]("ValidationDomain")).mapN(avias.acm.models.DomainValidationOption.apply _)
  }
  final implicit val AddTagsToCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.AddTagsToCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[scala.List[avias.acm.models.Tag]]("Tags")).mapN(avias.acm.models.AddTagsToCertificateRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.acm.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.acm.models.Tag.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.acm.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.ResourceNotFoundException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.acm.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.LimitExceededException.apply _)
  }
  final implicit val GetCertificateResponseDecoder: io.circe.Decoder[avias.acm.models.GetCertificateResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Certificate"), o.get[scala.Option[java.lang.String]]("CertificateChain")).mapN(avias.acm.models.GetCertificateResponse.apply _)
  }
  final implicit val InvalidArnExceptionDecoder: io.circe.Decoder[avias.acm.models.InvalidArnException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.InvalidArnException.apply _)
  }
  final implicit val TooManyTagsExceptionDecoder: io.circe.Decoder[avias.acm.models.TooManyTagsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.TooManyTagsException.apply _)
  }
  final implicit val RequestInProgressExceptionDecoder: io.circe.Decoder[avias.acm.models.RequestInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.RequestInProgressException.apply _)
  }
  final implicit val GetCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.GetCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(avias.acm.models.GetCertificateRequest.apply _)
  }
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[avias.acm.models.InvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.InvalidStateException.apply _)
  }
  final implicit val InvalidDomainValidationOptionsExceptionDecoder: io.circe.Decoder[avias.acm.models.InvalidDomainValidationOptionsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.InvalidDomainValidationOptionsException.apply _)
  }
  final implicit val RequestCertificateResponseDecoder: io.circe.Decoder[avias.acm.models.RequestCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CertificateArn").map(avias.acm.models.RequestCertificateResponse.apply _)
  }
  final implicit val ImportCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.ImportCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("Certificate"), o.get[scala.Array[scala.Byte]]("PrivateKey"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[scala.Array[scala.Byte]]]("CertificateChain")).mapN(avias.acm.models.ImportCertificateRequest.apply _)
  }
  final implicit val CertificateDetailDecoder: io.circe.Decoder[avias.acm.models.CertificateDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("KeyAlgorithm"), o.get[scala.Option[java.lang.String]]("RevocationReason"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("Serial"), o.get[scala.Option[java.lang.String]]("Subject"), o.get[scala.Option[java.lang.String]]("Issuer"), o.get[scala.Option[java.lang.String]]("SignatureAlgorithm"), o.get[scala.Option[scala.List[avias.acm.models.DomainValidation]]]("DomainValidationOptions"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("InUseBy"), o.get[scala.Option[scala.List[java.lang.String]]]("SubjectAlternativeNames"), o.get[scala.Option[java.lang.String]]("FailureReason"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.time.Instant]]("NotBefore"), o.get[scala.Option[java.time.Instant]]("RevokedAt"), o.get[scala.Option[java.time.Instant]]("IssuedAt"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("ImportedAt"), o.get[scala.Option[java.time.Instant]]("NotAfter"), o.get[scala.Option[avias.acm.models.RenewalSummary]]("RenewalSummary")).mapN(avias.acm.models.CertificateDetail.apply _)
  }
  final implicit val DeleteCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.DeleteCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(avias.acm.models.DeleteCertificateRequest.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.acm.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.acm.models.ResourceInUseException.apply _)
  }
  final implicit val ListTagsForCertificateRequestDecoder: io.circe.Decoder[avias.acm.models.ListTagsForCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(avias.acm.models.ListTagsForCertificateRequest.apply _)
  }
  final implicit val DomainValidationDecoder: io.circe.Decoder[avias.acm.models.DomainValidation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("ValidationDomain"), o.get[scala.Option[scala.List[java.lang.String]]]("ValidationEmails"), o.get[scala.Option[java.lang.String]]("ValidationStatus")).mapN(avias.acm.models.DomainValidation.apply _)
  }
  final implicit val ImportCertificateResponseDecoder: io.circe.Decoder[avias.acm.models.ImportCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CertificateArn").map(avias.acm.models.ImportCertificateResponse.apply _)
  }
  final implicit val CertificateSummaryDecoder: io.circe.Decoder[avias.acm.models.CertificateSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("DomainName")).mapN(avias.acm.models.CertificateSummary.apply _)
  }
  final implicit val RenewalSummaryDecoder: io.circe.Decoder[avias.acm.models.RenewalSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RenewalStatus"), o.get[scala.List[avias.acm.models.DomainValidation]]("DomainValidationOptions")).mapN(avias.acm.models.RenewalSummary.apply _)
  }
}