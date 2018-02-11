package org.lyranthe.araethura.acm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DescribeCertificateResponseEncoder: io.circe.Encoder[models.DescribeCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson)
  }
  final implicit val RemoveTagsFromCertificateRequestEncoder: io.circe.Encoder[models.RemoveTagsFromCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ListTagsForCertificateResponseEncoder: io.circe.Encoder[models.ListTagsForCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val InvalidTagExceptionEncoder: io.circe.Encoder[models.InvalidTagException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeCertificateRequestEncoder: io.circe.Encoder[models.DescribeCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ResendValidationEmailRequestEncoder: io.circe.Encoder[models.ResendValidationEmailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Domain" -> o.domain.asJson, "ValidationDomain" -> o.validationDomain.asJson)
  }
  final implicit val ListCertificatesResponseEncoder: io.circe.Encoder[models.ListCertificatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "CertificateSummaryList" -> o.certificateSummaryList.asJson)
  }
  final implicit val RequestCertificateRequestEncoder: io.circe.Encoder[models.RequestCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "SubjectAlternativeNames" -> o.subjectAlternativeNames.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson)
  }
  final implicit val ListCertificatesRequestEncoder: io.circe.Encoder[models.ListCertificatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateStatuses" -> o.certificateStatuses.asJson, "NextToken" -> o.nextToken.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val DomainValidationOptionEncoder: io.circe.Encoder[models.DomainValidationOption] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "ValidationDomain" -> o.validationDomain.asJson)
  }
  final implicit val AddTagsToCertificateRequestEncoder: io.circe.Encoder[models.AddTagsToCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetCertificateResponseEncoder: io.circe.Encoder[models.GetCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "CertificateChain" -> o.certificateChain.asJson)
  }
  final implicit val InvalidArnExceptionEncoder: io.circe.Encoder[models.InvalidArnException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TooManyTagsExceptionEncoder: io.circe.Encoder[models.TooManyTagsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestInProgressExceptionEncoder: io.circe.Encoder[models.RequestInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetCertificateRequestEncoder: io.circe.Encoder[models.GetCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[models.InvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidDomainValidationOptionsExceptionEncoder: io.circe.Encoder[models.InvalidDomainValidationOptionsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestCertificateResponseEncoder: io.circe.Encoder[models.RequestCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ImportCertificateRequestEncoder: io.circe.Encoder[models.ImportCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "PrivateKey" -> o.privateKey.asJson, "CertificateArn" -> o.certificateArn.asJson, "CertificateChain" -> o.certificateChain.asJson)
  }
  final implicit val CertificateDetailEncoder: io.circe.Encoder[models.CertificateDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "KeyAlgorithm" -> o.keyAlgorithm.asJson, "RevocationReason" -> o.revocationReason.asJson, "CertificateArn" -> o.certificateArn.asJson, "Serial" -> o.serial.asJson, "Subject" -> o.subject.asJson, "Issuer" -> o.issuer.asJson, "SignatureAlgorithm" -> o.signatureAlgorithm.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson, "DomainName" -> o.domainName.asJson, "InUseBy" -> o.inUseBy.asJson, "SubjectAlternativeNames" -> o.subjectAlternativeNames.asJson, "FailureReason" -> o.failureReason.asJson, "Status" -> o.status.asJson, "NotBefore" -> o.notBefore.asJson, "RevokedAt" -> o.revokedAt.asJson, "IssuedAt" -> o.issuedAt.asJson, "CreatedAt" -> o.createdAt.asJson, "ImportedAt" -> o.importedAt.asJson, "NotAfter" -> o.notAfter.asJson, "RenewalSummary" -> o.renewalSummary.asJson)
  }
  final implicit val DeleteCertificateRequestEncoder: io.circe.Encoder[models.DeleteCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListTagsForCertificateRequestEncoder: io.circe.Encoder[models.ListTagsForCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val DomainValidationEncoder: io.circe.Encoder[models.DomainValidation] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "ValidationDomain" -> o.validationDomain.asJson, "ValidationEmails" -> o.validationEmails.asJson, "ValidationStatus" -> o.validationStatus.asJson)
  }
  final implicit val ImportCertificateResponseEncoder: io.circe.Encoder[models.ImportCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val CertificateSummaryEncoder: io.circe.Encoder[models.CertificateSummary] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "DomainName" -> o.domainName.asJson)
  }
  final implicit val RenewalSummaryEncoder: io.circe.Encoder[models.RenewalSummary] = io.circe.Encoder.instance { o => 
    Json.obj("RenewalStatus" -> o.renewalStatus.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson)
  }
  final implicit val DescribeCertificateResponseDecoder: io.circe.Decoder[models.DescribeCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.CertificateDetail]]("Certificate").map(models.DescribeCertificateResponse.apply _)
  }
  final implicit val RemoveTagsFromCertificateRequestDecoder: io.circe.Decoder[models.RemoveTagsFromCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.RemoveTagsFromCertificateRequest.apply _)
  }
  final implicit val ListTagsForCertificateResponseDecoder: io.circe.Decoder[models.ListTagsForCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Tag]]]("Tags").map(models.ListTagsForCertificateResponse.apply _)
  }
  final implicit val InvalidTagExceptionDecoder: io.circe.Decoder[models.InvalidTagException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidTagException.apply _)
  }
  final implicit val DescribeCertificateRequestDecoder: io.circe.Decoder[models.DescribeCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(models.DescribeCertificateRequest.apply _)
  }
  final implicit val ResendValidationEmailRequestDecoder: io.circe.Decoder[models.ResendValidationEmailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[java.lang.String]("Domain"), o.get[java.lang.String]("ValidationDomain")).mapN(models.ResendValidationEmailRequest.apply _)
  }
  final implicit val ListCertificatesResponseDecoder: io.circe.Decoder[models.ListCertificatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.CertificateSummary]]]("CertificateSummaryList")).mapN(models.ListCertificatesResponse.apply _)
  }
  final implicit val RequestCertificateRequestDecoder: io.circe.Decoder[models.RequestCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("SubjectAlternativeNames"), o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[scala.List[models.DomainValidationOption]]]("DomainValidationOptions")).mapN(models.RequestCertificateRequest.apply _)
  }
  final implicit val ListCertificatesRequestDecoder: io.circe.Decoder[models.ListCertificatesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("CertificateStatuses"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(models.ListCertificatesRequest.apply _)
  }
  final implicit val DomainValidationOptionDecoder: io.circe.Decoder[models.DomainValidationOption] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[java.lang.String]("ValidationDomain")).mapN(models.DomainValidationOption.apply _)
  }
  final implicit val AddTagsToCertificateRequestDecoder: io.circe.Decoder[models.AddTagsToCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.AddTagsToCertificateRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LimitExceededException.apply _)
  }
  final implicit val GetCertificateResponseDecoder: io.circe.Decoder[models.GetCertificateResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Certificate"), o.get[scala.Option[java.lang.String]]("CertificateChain")).mapN(models.GetCertificateResponse.apply _)
  }
  final implicit val InvalidArnExceptionDecoder: io.circe.Decoder[models.InvalidArnException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidArnException.apply _)
  }
  final implicit val TooManyTagsExceptionDecoder: io.circe.Decoder[models.TooManyTagsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TooManyTagsException.apply _)
  }
  final implicit val RequestInProgressExceptionDecoder: io.circe.Decoder[models.RequestInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.RequestInProgressException.apply _)
  }
  final implicit val GetCertificateRequestDecoder: io.circe.Decoder[models.GetCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(models.GetCertificateRequest.apply _)
  }
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[models.InvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidStateException.apply _)
  }
  final implicit val InvalidDomainValidationOptionsExceptionDecoder: io.circe.Decoder[models.InvalidDomainValidationOptionsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidDomainValidationOptionsException.apply _)
  }
  final implicit val RequestCertificateResponseDecoder: io.circe.Decoder[models.RequestCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CertificateArn").map(models.RequestCertificateResponse.apply _)
  }
  final implicit val ImportCertificateRequestDecoder: io.circe.Decoder[models.ImportCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("Certificate"), o.get[scala.Array[scala.Byte]]("PrivateKey"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[scala.Array[scala.Byte]]]("CertificateChain")).mapN(models.ImportCertificateRequest.apply _)
  }
  final implicit val CertificateDetailDecoder: io.circe.Decoder[models.CertificateDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("KeyAlgorithm"), o.get[scala.Option[java.lang.String]]("RevocationReason"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("Serial"), o.get[scala.Option[java.lang.String]]("Subject"), o.get[scala.Option[java.lang.String]]("Issuer"), o.get[scala.Option[java.lang.String]]("SignatureAlgorithm"), o.get[scala.Option[scala.List[models.DomainValidation]]]("DomainValidationOptions"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("InUseBy"), o.get[scala.Option[scala.List[java.lang.String]]]("SubjectAlternativeNames"), o.get[scala.Option[java.lang.String]]("FailureReason"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.time.Instant]]("NotBefore"), o.get[scala.Option[java.time.Instant]]("RevokedAt"), o.get[scala.Option[java.time.Instant]]("IssuedAt"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("ImportedAt"), o.get[scala.Option[java.time.Instant]]("NotAfter"), o.get[scala.Option[models.RenewalSummary]]("RenewalSummary")).mapN(models.CertificateDetail.apply _)
  }
  final implicit val DeleteCertificateRequestDecoder: io.circe.Decoder[models.DeleteCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(models.DeleteCertificateRequest.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceInUseException.apply _)
  }
  final implicit val ListTagsForCertificateRequestDecoder: io.circe.Decoder[models.ListTagsForCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(models.ListTagsForCertificateRequest.apply _)
  }
  final implicit val DomainValidationDecoder: io.circe.Decoder[models.DomainValidation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("ValidationDomain"), o.get[scala.Option[scala.List[java.lang.String]]]("ValidationEmails"), o.get[scala.Option[java.lang.String]]("ValidationStatus")).mapN(models.DomainValidation.apply _)
  }
  final implicit val ImportCertificateResponseDecoder: io.circe.Decoder[models.ImportCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CertificateArn").map(models.ImportCertificateResponse.apply _)
  }
  final implicit val CertificateSummaryDecoder: io.circe.Decoder[models.CertificateSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("DomainName")).mapN(models.CertificateSummary.apply _)
  }
  final implicit val RenewalSummaryDecoder: io.circe.Decoder[models.RenewalSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RenewalStatus"), o.get[scala.List[models.DomainValidation]]("DomainValidationOptions")).mapN(models.RenewalSummary.apply _)
  }
}