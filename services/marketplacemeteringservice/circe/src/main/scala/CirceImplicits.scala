package org.lyranthe.araethura.marketplacemeteringservice
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val TimestampOutOfBoundsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.TimestampOutOfBoundsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UsageRecordEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecord] = io.circe.Encoder.instance { o => 
    Json.obj("Timestamp" -> o.timestamp.asJson, "CustomerIdentifier" -> o.customerIdentifier.asJson, "Dimension" -> o.dimension.asJson, "Quantity" -> o.quantity.asJson)
  }
  final implicit val InvalidUsageDimensionExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidUsageDimensionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidCustomerIdentifierExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidCustomerIdentifierException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExpiredTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.ExpiredTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MeterUsageRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Timestamp" -> o.timestamp.asJson, "UsageQuantity" -> o.usageQuantity.asJson, "DryRun" -> o.dryRun.asJson, "UsageDimension" -> o.usageDimension.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val ResolveCustomerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RegistrationToken" -> o.registrationToken.asJson)
  }
  final implicit val BatchMeterUsageResultEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageResult] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "UnprocessedRecords" -> o.unprocessedRecords.asJson)
  }
  final implicit val InternalServiceErrorExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.InternalServiceErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DuplicateRequestExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.DuplicateRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ThrottlingExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.ThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val BatchMeterUsageRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UsageRecords" -> o.usageRecords.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val InvalidTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidProductCodeExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidProductCodeException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResolveCustomerResultEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerResult] = io.circe.Encoder.instance { o => 
    Json.obj("CustomerIdentifier" -> o.customerIdentifier.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val MeterUsageResultEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageResult] = io.circe.Encoder.instance { o => 
    Json.obj("MeteringRecordId" -> o.meteringRecordId.asJson)
  }
  final implicit val InvalidEndpointRegionExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidEndpointRegionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UsageRecordResultEncoder: io.circe.Encoder[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecordResult] = io.circe.Encoder.instance { o => 
    Json.obj("UsageRecord" -> o.usageRecord.asJson, "MeteringRecordId" -> o.meteringRecordId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val TimestampOutOfBoundsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.TimestampOutOfBoundsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.TimestampOutOfBoundsException.apply _)
  }
  final implicit val UsageRecordDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecord] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Timestamp"), o.get[java.lang.String]("CustomerIdentifier"), o.get[java.lang.String]("Dimension"), o.get[scala.Int]("Quantity")).mapN(org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecord.apply _)
  }
  final implicit val InvalidUsageDimensionExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidUsageDimensionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.InvalidUsageDimensionException.apply _)
  }
  final implicit val InvalidCustomerIdentifierExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidCustomerIdentifierException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.InvalidCustomerIdentifierException.apply _)
  }
  final implicit val ExpiredTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.ExpiredTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.ExpiredTokenException.apply _)
  }
  final implicit val MeterUsageRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Timestamp"), o.get[scala.Int]("UsageQuantity"), o.get[scala.Boolean]("DryRun"), o.get[java.lang.String]("UsageDimension"), o.get[java.lang.String]("ProductCode")).mapN(org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageRequest.apply _)
  }
  final implicit val ResolveCustomerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RegistrationToken").map(org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerRequest.apply _)
  }
  final implicit val BatchMeterUsageResultDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecordResult]]]("Results"), o.get[scala.Option[scala.List[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecord]]]("UnprocessedRecords")).mapN(org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageResult.apply _)
  }
  final implicit val InternalServiceErrorExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.InternalServiceErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.InternalServiceErrorException.apply _)
  }
  final implicit val DuplicateRequestExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.DuplicateRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.DuplicateRequestException.apply _)
  }
  final implicit val ThrottlingExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.ThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.ThrottlingException.apply _)
  }
  final implicit val BatchMeterUsageRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecord]]("UsageRecords"), o.get[java.lang.String]("ProductCode")).mapN(org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageRequest.apply _)
  }
  final implicit val InvalidTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.InvalidTokenException.apply _)
  }
  final implicit val InvalidProductCodeExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidProductCodeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.InvalidProductCodeException.apply _)
  }
  final implicit val ResolveCustomerResultDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CustomerIdentifier"), o.get[scala.Option[java.lang.String]]("ProductCode")).mapN(org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerResult.apply _)
  }
  final implicit val MeterUsageResultDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MeteringRecordId").map(org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageResult.apply _)
  }
  final implicit val InvalidEndpointRegionExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.InvalidEndpointRegionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.marketplacemeteringservice.models.InvalidEndpointRegionException.apply _)
  }
  final implicit val UsageRecordResultDecoder: io.circe.Decoder[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecordResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecord]]("UsageRecord"), o.get[scala.Option[java.lang.String]]("MeteringRecordId"), o.get[scala.Option[java.lang.String]]("Status")).mapN(org.lyranthe.araethura.marketplacemeteringservice.models.UsageRecordResult.apply _)
  }
}