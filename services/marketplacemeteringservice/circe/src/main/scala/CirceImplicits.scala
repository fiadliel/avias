package org.lyranthe.araethura.marketplacemeteringservice
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val TimestampOutOfBoundsExceptionEncoder: io.circe.Encoder[models.TimestampOutOfBoundsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UsageRecordEncoder: io.circe.Encoder[models.UsageRecord] = io.circe.Encoder.instance { o => 
    Json.obj("Timestamp" -> o.timestamp.asJson, "CustomerIdentifier" -> o.customerIdentifier.asJson, "Dimension" -> o.dimension.asJson, "Quantity" -> o.quantity.asJson)
  }
  final implicit val InvalidUsageDimensionExceptionEncoder: io.circe.Encoder[models.InvalidUsageDimensionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidCustomerIdentifierExceptionEncoder: io.circe.Encoder[models.InvalidCustomerIdentifierException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExpiredTokenExceptionEncoder: io.circe.Encoder[models.ExpiredTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MeterUsageRequestEncoder: io.circe.Encoder[models.MeterUsageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Timestamp" -> o.timestamp.asJson, "UsageQuantity" -> o.usageQuantity.asJson, "DryRun" -> o.dryRun.asJson, "UsageDimension" -> o.usageDimension.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val ResolveCustomerRequestEncoder: io.circe.Encoder[models.ResolveCustomerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RegistrationToken" -> o.registrationToken.asJson)
  }
  final implicit val BatchMeterUsageResultEncoder: io.circe.Encoder[models.BatchMeterUsageResult] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "UnprocessedRecords" -> o.unprocessedRecords.asJson)
  }
  final implicit val InternalServiceErrorExceptionEncoder: io.circe.Encoder[models.InternalServiceErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DuplicateRequestExceptionEncoder: io.circe.Encoder[models.DuplicateRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ThrottlingExceptionEncoder: io.circe.Encoder[models.ThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val BatchMeterUsageRequestEncoder: io.circe.Encoder[models.BatchMeterUsageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UsageRecords" -> o.usageRecords.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val InvalidTokenExceptionEncoder: io.circe.Encoder[models.InvalidTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidProductCodeExceptionEncoder: io.circe.Encoder[models.InvalidProductCodeException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResolveCustomerResultEncoder: io.circe.Encoder[models.ResolveCustomerResult] = io.circe.Encoder.instance { o => 
    Json.obj("CustomerIdentifier" -> o.customerIdentifier.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val MeterUsageResultEncoder: io.circe.Encoder[models.MeterUsageResult] = io.circe.Encoder.instance { o => 
    Json.obj("MeteringRecordId" -> o.meteringRecordId.asJson)
  }
  final implicit val InvalidEndpointRegionExceptionEncoder: io.circe.Encoder[models.InvalidEndpointRegionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UsageRecordResultEncoder: io.circe.Encoder[models.UsageRecordResult] = io.circe.Encoder.instance { o => 
    Json.obj("UsageRecord" -> o.usageRecord.asJson, "MeteringRecordId" -> o.meteringRecordId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val TimestampOutOfBoundsExceptionDecoder: io.circe.Decoder[models.TimestampOutOfBoundsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TimestampOutOfBoundsException.apply _)
  }
  final implicit val UsageRecordDecoder: io.circe.Decoder[models.UsageRecord] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Timestamp"), o.get[java.lang.String]("CustomerIdentifier"), o.get[java.lang.String]("Dimension"), o.get[scala.Int]("Quantity")).mapN(models.UsageRecord.apply _)
  }
  final implicit val InvalidUsageDimensionExceptionDecoder: io.circe.Decoder[models.InvalidUsageDimensionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidUsageDimensionException.apply _)
  }
  final implicit val InvalidCustomerIdentifierExceptionDecoder: io.circe.Decoder[models.InvalidCustomerIdentifierException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidCustomerIdentifierException.apply _)
  }
  final implicit val ExpiredTokenExceptionDecoder: io.circe.Decoder[models.ExpiredTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExpiredTokenException.apply _)
  }
  final implicit val MeterUsageRequestDecoder: io.circe.Decoder[models.MeterUsageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Timestamp"), o.get[scala.Int]("UsageQuantity"), o.get[scala.Boolean]("DryRun"), o.get[java.lang.String]("UsageDimension"), o.get[java.lang.String]("ProductCode")).mapN(models.MeterUsageRequest.apply _)
  }
  final implicit val ResolveCustomerRequestDecoder: io.circe.Decoder[models.ResolveCustomerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RegistrationToken").map(models.ResolveCustomerRequest.apply _)
  }
  final implicit val BatchMeterUsageResultDecoder: io.circe.Decoder[models.BatchMeterUsageResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.UsageRecordResult]]]("Results"), o.get[scala.Option[scala.List[models.UsageRecord]]]("UnprocessedRecords")).mapN(models.BatchMeterUsageResult.apply _)
  }
  final implicit val InternalServiceErrorExceptionDecoder: io.circe.Decoder[models.InternalServiceErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalServiceErrorException.apply _)
  }
  final implicit val DuplicateRequestExceptionDecoder: io.circe.Decoder[models.DuplicateRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DuplicateRequestException.apply _)
  }
  final implicit val ThrottlingExceptionDecoder: io.circe.Decoder[models.ThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ThrottlingException.apply _)
  }
  final implicit val BatchMeterUsageRequestDecoder: io.circe.Decoder[models.BatchMeterUsageRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.UsageRecord]]("UsageRecords"), o.get[java.lang.String]("ProductCode")).mapN(models.BatchMeterUsageRequest.apply _)
  }
  final implicit val InvalidTokenExceptionDecoder: io.circe.Decoder[models.InvalidTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidTokenException.apply _)
  }
  final implicit val InvalidProductCodeExceptionDecoder: io.circe.Decoder[models.InvalidProductCodeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidProductCodeException.apply _)
  }
  final implicit val ResolveCustomerResultDecoder: io.circe.Decoder[models.ResolveCustomerResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CustomerIdentifier"), o.get[scala.Option[java.lang.String]]("ProductCode")).mapN(models.ResolveCustomerResult.apply _)
  }
  final implicit val MeterUsageResultDecoder: io.circe.Decoder[models.MeterUsageResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MeteringRecordId").map(models.MeterUsageResult.apply _)
  }
  final implicit val InvalidEndpointRegionExceptionDecoder: io.circe.Decoder[models.InvalidEndpointRegionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidEndpointRegionException.apply _)
  }
  final implicit val UsageRecordResultDecoder: io.circe.Decoder[models.UsageRecordResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.UsageRecord]]("UsageRecord"), o.get[scala.Option[java.lang.String]]("MeteringRecordId"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.UsageRecordResult.apply _)
  }
}