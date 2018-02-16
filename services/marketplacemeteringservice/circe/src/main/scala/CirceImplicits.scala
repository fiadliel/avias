package avias.marketplacemeteringservice
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val TimestampOutOfBoundsExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.TimestampOutOfBoundsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UsageRecordEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.UsageRecord] = io.circe.Encoder.instance { o => 
    Json.obj("Timestamp" -> o.timestamp.asJson, "CustomerIdentifier" -> o.customerIdentifier.asJson, "Dimension" -> o.dimension.asJson, "Quantity" -> o.quantity.asJson)
  }
  final implicit val InvalidUsageDimensionExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.InvalidUsageDimensionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidCustomerIdentifierExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.InvalidCustomerIdentifierException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExpiredTokenExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.ExpiredTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MeterUsageRequestEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.MeterUsageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Timestamp" -> o.timestamp.asJson, "UsageQuantity" -> o.usageQuantity.asJson, "DryRun" -> o.dryRun.asJson, "UsageDimension" -> o.usageDimension.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val ResolveCustomerRequestEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.ResolveCustomerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RegistrationToken" -> o.registrationToken.asJson)
  }
  final implicit val BatchMeterUsageResultEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.BatchMeterUsageResult] = io.circe.Encoder.instance { o => 
    Json.obj("Results" -> o.results.asJson, "UnprocessedRecords" -> o.unprocessedRecords.asJson)
  }
  final implicit val InternalServiceErrorExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.InternalServiceErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DuplicateRequestExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.DuplicateRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ThrottlingExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.ThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val BatchMeterUsageRequestEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.BatchMeterUsageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UsageRecords" -> o.usageRecords.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val InvalidTokenExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.InvalidTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidProductCodeExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.InvalidProductCodeException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResolveCustomerResultEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.ResolveCustomerResult] = io.circe.Encoder.instance { o => 
    Json.obj("CustomerIdentifier" -> o.customerIdentifier.asJson, "ProductCode" -> o.productCode.asJson)
  }
  final implicit val MeterUsageResultEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.MeterUsageResult] = io.circe.Encoder.instance { o => 
    Json.obj("MeteringRecordId" -> o.meteringRecordId.asJson)
  }
  final implicit val InvalidEndpointRegionExceptionEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.InvalidEndpointRegionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UsageRecordResultEncoder: io.circe.Encoder[avias.marketplacemeteringservice.models.UsageRecordResult] = io.circe.Encoder.instance { o => 
    Json.obj("UsageRecord" -> o.usageRecord.asJson, "MeteringRecordId" -> o.meteringRecordId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val TimestampOutOfBoundsExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.TimestampOutOfBoundsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.TimestampOutOfBoundsException.apply _)
  }
  final implicit val UsageRecordDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.UsageRecord] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Timestamp"), o.get[java.lang.String]("CustomerIdentifier"), o.get[java.lang.String]("Dimension"), o.get[scala.Int]("Quantity")).mapN(avias.marketplacemeteringservice.models.UsageRecord.apply _)
  }
  final implicit val InvalidUsageDimensionExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.InvalidUsageDimensionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.InvalidUsageDimensionException.apply _)
  }
  final implicit val InvalidCustomerIdentifierExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.InvalidCustomerIdentifierException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.InvalidCustomerIdentifierException.apply _)
  }
  final implicit val ExpiredTokenExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.ExpiredTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.ExpiredTokenException.apply _)
  }
  final implicit val MeterUsageRequestDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.MeterUsageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Timestamp"), o.get[scala.Int]("UsageQuantity"), o.get[scala.Boolean]("DryRun"), o.get[java.lang.String]("UsageDimension"), o.get[java.lang.String]("ProductCode")).mapN(avias.marketplacemeteringservice.models.MeterUsageRequest.apply _)
  }
  final implicit val ResolveCustomerRequestDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.ResolveCustomerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RegistrationToken").map(avias.marketplacemeteringservice.models.ResolveCustomerRequest.apply _)
  }
  final implicit val BatchMeterUsageResultDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.BatchMeterUsageResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.marketplacemeteringservice.models.UsageRecordResult]]]("Results"), o.get[scala.Option[scala.List[avias.marketplacemeteringservice.models.UsageRecord]]]("UnprocessedRecords")).mapN(avias.marketplacemeteringservice.models.BatchMeterUsageResult.apply _)
  }
  final implicit val InternalServiceErrorExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.InternalServiceErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.InternalServiceErrorException.apply _)
  }
  final implicit val DuplicateRequestExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.DuplicateRequestException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.DuplicateRequestException.apply _)
  }
  final implicit val ThrottlingExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.ThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.ThrottlingException.apply _)
  }
  final implicit val BatchMeterUsageRequestDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.BatchMeterUsageRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.marketplacemeteringservice.models.UsageRecord]]("UsageRecords"), o.get[java.lang.String]("ProductCode")).mapN(avias.marketplacemeteringservice.models.BatchMeterUsageRequest.apply _)
  }
  final implicit val InvalidTokenExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.InvalidTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.InvalidTokenException.apply _)
  }
  final implicit val InvalidProductCodeExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.InvalidProductCodeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.InvalidProductCodeException.apply _)
  }
  final implicit val ResolveCustomerResultDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.ResolveCustomerResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CustomerIdentifier"), o.get[scala.Option[java.lang.String]]("ProductCode")).mapN(avias.marketplacemeteringservice.models.ResolveCustomerResult.apply _)
  }
  final implicit val MeterUsageResultDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.MeterUsageResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MeteringRecordId").map(avias.marketplacemeteringservice.models.MeterUsageResult.apply _)
  }
  final implicit val InvalidEndpointRegionExceptionDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.InvalidEndpointRegionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplacemeteringservice.models.InvalidEndpointRegionException.apply _)
  }
  final implicit val UsageRecordResultDecoder: io.circe.Decoder[avias.marketplacemeteringservice.models.UsageRecordResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.marketplacemeteringservice.models.UsageRecord]]("UsageRecord"), o.get[scala.Option[java.lang.String]]("MeteringRecordId"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.marketplacemeteringservice.models.UsageRecordResult.apply _)
  }
}