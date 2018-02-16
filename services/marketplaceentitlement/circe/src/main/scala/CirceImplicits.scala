package avias.marketplaceentitlement
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val EntitlementEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.Entitlement] = io.circe.Encoder.instance { o => 
    Json.obj("ProductCode" -> o.productCode.asJson, "Dimension" -> o.dimension.asJson, "CustomerIdentifier" -> o.customerIdentifier.asJson, "Value" -> o.value.asJson, "ExpirationDate" -> o.expirationDate.asJson)
  }
  final implicit val GetEntitlementsRequestEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.GetEntitlementsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProductCode" -> o.productCode.asJson, "Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val InternalServiceErrorExceptionEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.InternalServiceErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val EntitlementValueEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.EntitlementValue] = io.circe.Encoder.instance { o => 
    Json.obj("IntegerValue" -> o.integerValue.asJson, "DoubleValue" -> o.doubleValue.asJson, "BooleanValue" -> o.booleanValue.asJson, "StringValue" -> o.stringValue.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ThrottlingExceptionEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.ThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetEntitlementsResultEncoder: io.circe.Encoder[avias.marketplaceentitlement.models.GetEntitlementsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Entitlements" -> o.entitlements.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EntitlementDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.Entitlement] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProductCode"), o.get[scala.Option[java.lang.String]]("Dimension"), o.get[scala.Option[java.lang.String]]("CustomerIdentifier"), o.get[scala.Option[avias.marketplaceentitlement.models.EntitlementValue]]("Value"), o.get[scala.Option[java.time.Instant]]("ExpirationDate")).mapN(avias.marketplaceentitlement.models.Entitlement.apply _)
  }
  final implicit val GetEntitlementsRequestDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.GetEntitlementsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductCode"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.marketplaceentitlement.models.GetEntitlementsRequest.apply _)
  }
  final implicit val InternalServiceErrorExceptionDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.InternalServiceErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplaceentitlement.models.InternalServiceErrorException.apply _)
  }
  final implicit val EntitlementValueDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.EntitlementValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("IntegerValue"), o.get[scala.Option[scala.Double]]("DoubleValue"), o.get[scala.Option[scala.Boolean]]("BooleanValue"), o.get[scala.Option[java.lang.String]]("StringValue")).mapN(avias.marketplaceentitlement.models.EntitlementValue.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplaceentitlement.models.InvalidParameterException.apply _)
  }
  final implicit val ThrottlingExceptionDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.ThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.marketplaceentitlement.models.ThrottlingException.apply _)
  }
  final implicit val GetEntitlementsResultDecoder: io.circe.Decoder[avias.marketplaceentitlement.models.GetEntitlementsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.marketplaceentitlement.models.Entitlement]]]("Entitlements"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.marketplaceentitlement.models.GetEntitlementsResult.apply _)
  }
}