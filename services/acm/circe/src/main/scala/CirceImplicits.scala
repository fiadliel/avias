package org.lyranthe.araethura.acm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DescribeCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.DescribeCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson)
  }
  final implicit val RemoveTagsFromCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.RemoveTagsFromCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val ListTagsForCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ListTagsForCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val InvalidTagExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.InvalidTagException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.DescribeCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ResendValidationEmailRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ResendValidationEmailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Domain" -> o.domain.asJson, "ValidationDomain" -> o.validationDomain.asJson)
  }
  final implicit val ListCertificatesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ListCertificatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "CertificateSummaryList" -> o.certificateSummaryList.asJson)
  }
  final implicit val RequestCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.RequestCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "SubjectAlternativeNames" -> o.subjectAlternativeNames.asJson, "IdempotencyToken" -> o.idempotencyToken.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson)
  }
  final implicit val ListCertificatesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ListCertificatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateStatuses" -> o.certificateStatuses.asJson, "NextToken" -> o.nextToken.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val DomainValidationOptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.DomainValidationOption] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "ValidationDomain" -> o.validationDomain.asJson)
  }
  final implicit val AddTagsToCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.AddTagsToCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.GetCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "CertificateChain" -> o.certificateChain.asJson)
  }
  final implicit val InvalidArnExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.InvalidArnException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TooManyTagsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.TooManyTagsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestInProgressExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.RequestInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.GetCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.InvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidDomainValidationOptionsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.InvalidDomainValidationOptionsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.RequestCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ImportCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ImportCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "PrivateKey" -> o.privateKey.asJson, "CertificateArn" -> o.certificateArn.asJson, "CertificateChain" -> o.certificateChain.asJson)
  }
  final implicit val CertificateDetailEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.CertificateDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "KeyAlgorithm" -> o.keyAlgorithm.asJson, "RevocationReason" -> o.revocationReason.asJson, "CertificateArn" -> o.certificateArn.asJson, "Serial" -> o.serial.asJson, "Subject" -> o.subject.asJson, "Issuer" -> o.issuer.asJson, "SignatureAlgorithm" -> o.signatureAlgorithm.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson, "DomainName" -> o.domainName.asJson, "InUseBy" -> o.inUseBy.asJson, "SubjectAlternativeNames" -> o.subjectAlternativeNames.asJson, "FailureReason" -> o.failureReason.asJson, "Status" -> o.status.asJson, "NotBefore" -> o.notBefore.asJson, "RevokedAt" -> o.revokedAt.asJson, "IssuedAt" -> o.issuedAt.asJson, "CreatedAt" -> o.createdAt.asJson, "ImportedAt" -> o.importedAt.asJson, "NotAfter" -> o.notAfter.asJson, "RenewalSummary" -> o.renewalSummary.asJson)
  }
  final implicit val DeleteCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.DeleteCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListTagsForCertificateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ListTagsForCertificateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val DomainValidationEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.DomainValidation] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "ValidationDomain" -> o.validationDomain.asJson, "ValidationEmails" -> o.validationEmails.asJson, "ValidationStatus" -> o.validationStatus.asJson)
  }
  final implicit val ImportCertificateResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.ImportCertificateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson)
  }
  final implicit val CertificateSummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.CertificateSummary] = io.circe.Encoder.instance { o => 
    Json.obj("CertificateArn" -> o.certificateArn.asJson, "DomainName" -> o.domainName.asJson)
  }
  final implicit val RenewalSummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.acm.models.RenewalSummary] = io.circe.Encoder.instance { o => 
    Json.obj("RenewalStatus" -> o.renewalStatus.asJson, "DomainValidationOptions" -> o.domainValidationOptions.asJson)
  }
  final implicit val DescribeCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.DescribeCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.acm.models.CertificateDetail]]("Certificate").map(org.lyranthe.araethura.acm.models.DescribeCertificateResponse.apply _)
  }
  final implicit val RemoveTagsFromCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.RemoveTagsFromCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[scala.List[org.lyranthe.araethura.acm.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.acm.models.RemoveTagsFromCertificateRequest.apply _)
  }
  final implicit val ListTagsForCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ListTagsForCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.acm.models.Tag]]]("Tags").map(org.lyranthe.araethura.acm.models.ListTagsForCertificateResponse.apply _)
  }
  final implicit val InvalidTagExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.InvalidTagException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.InvalidTagException.apply _)
  }
  final implicit val DescribeCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.DescribeCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(org.lyranthe.araethura.acm.models.DescribeCertificateRequest.apply _)
  }
  final implicit val ResendValidationEmailRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ResendValidationEmailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[java.lang.String]("Domain"), o.get[java.lang.String]("ValidationDomain")).mapN(org.lyranthe.araethura.acm.models.ResendValidationEmailRequest.apply _)
  }
  final implicit val ListCertificatesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ListCertificatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.acm.models.CertificateSummary]]]("CertificateSummaryList")).mapN(org.lyranthe.araethura.acm.models.ListCertificatesResponse.apply _)
  }
  final implicit val RequestCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.RequestCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("SubjectAlternativeNames"), o.get[scala.Option[java.lang.String]]("IdempotencyToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.acm.models.DomainValidationOption]]]("DomainValidationOptions")).mapN(org.lyranthe.araethura.acm.models.RequestCertificateRequest.apply _)
  }
  final implicit val ListCertificatesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ListCertificatesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("CertificateStatuses"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(org.lyranthe.araethura.acm.models.ListCertificatesRequest.apply _)
  }
  final implicit val DomainValidationOptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.DomainValidationOption] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[java.lang.String]("ValidationDomain")).mapN(org.lyranthe.araethura.acm.models.DomainValidationOption.apply _)
  }
  final implicit val AddTagsToCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.AddTagsToCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CertificateArn"), o.get[scala.List[org.lyranthe.araethura.acm.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.acm.models.AddTagsToCertificateRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.acm.models.Tag.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.ResourceNotFoundException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.LimitExceededException.apply _)
  }
  final implicit val GetCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.GetCertificateResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Certificate"), o.get[scala.Option[java.lang.String]]("CertificateChain")).mapN(org.lyranthe.araethura.acm.models.GetCertificateResponse.apply _)
  }
  final implicit val InvalidArnExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.InvalidArnException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.InvalidArnException.apply _)
  }
  final implicit val TooManyTagsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.TooManyTagsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.TooManyTagsException.apply _)
  }
  final implicit val RequestInProgressExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.RequestInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.RequestInProgressException.apply _)
  }
  final implicit val GetCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.GetCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(org.lyranthe.araethura.acm.models.GetCertificateRequest.apply _)
  }
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.InvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.InvalidStateException.apply _)
  }
  final implicit val InvalidDomainValidationOptionsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.InvalidDomainValidationOptionsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.InvalidDomainValidationOptionsException.apply _)
  }
  final implicit val RequestCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.RequestCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CertificateArn").map(org.lyranthe.araethura.acm.models.RequestCertificateResponse.apply _)
  }
  final implicit val ImportCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ImportCertificateRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("Certificate"), o.get[scala.Array[scala.Byte]]("PrivateKey"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[scala.Array[scala.Byte]]]("CertificateChain")).mapN(org.lyranthe.araethura.acm.models.ImportCertificateRequest.apply _)
  }
  final implicit val CertificateDetailDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.CertificateDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("KeyAlgorithm"), o.get[scala.Option[java.lang.String]]("RevocationReason"), o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("Serial"), o.get[scala.Option[java.lang.String]]("Subject"), o.get[scala.Option[java.lang.String]]("Issuer"), o.get[scala.Option[java.lang.String]]("SignatureAlgorithm"), o.get[scala.Option[scala.List[org.lyranthe.araethura.acm.models.DomainValidation]]]("DomainValidationOptions"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("InUseBy"), o.get[scala.Option[scala.List[java.lang.String]]]("SubjectAlternativeNames"), o.get[scala.Option[java.lang.String]]("FailureReason"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.time.Instant]]("NotBefore"), o.get[scala.Option[java.time.Instant]]("RevokedAt"), o.get[scala.Option[java.time.Instant]]("IssuedAt"), o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.time.Instant]]("ImportedAt"), o.get[scala.Option[java.time.Instant]]("NotAfter"), o.get[scala.Option[org.lyranthe.araethura.acm.models.RenewalSummary]]("RenewalSummary")).mapN(org.lyranthe.araethura.acm.models.CertificateDetail.apply _)
  }
  final implicit val DeleteCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.DeleteCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(org.lyranthe.araethura.acm.models.DeleteCertificateRequest.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.acm.models.ResourceInUseException.apply _)
  }
  final implicit val ListTagsForCertificateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ListTagsForCertificateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CertificateArn").map(org.lyranthe.araethura.acm.models.ListTagsForCertificateRequest.apply _)
  }
  final implicit val DomainValidationDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.DomainValidation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("ValidationDomain"), o.get[scala.Option[scala.List[java.lang.String]]]("ValidationEmails"), o.get[scala.Option[java.lang.String]]("ValidationStatus")).mapN(org.lyranthe.araethura.acm.models.DomainValidation.apply _)
  }
  final implicit val ImportCertificateResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.ImportCertificateResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("CertificateArn").map(org.lyranthe.araethura.acm.models.ImportCertificateResponse.apply _)
  }
  final implicit val CertificateSummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.CertificateSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CertificateArn"), o.get[scala.Option[java.lang.String]]("DomainName")).mapN(org.lyranthe.araethura.acm.models.CertificateSummary.apply _)
  }
  final implicit val RenewalSummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.acm.models.RenewalSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RenewalStatus"), o.get[scala.List[org.lyranthe.araethura.acm.models.DomainValidation]]("DomainValidationOptions")).mapN(org.lyranthe.araethura.acm.models.RenewalSummary.apply _)
  }
}