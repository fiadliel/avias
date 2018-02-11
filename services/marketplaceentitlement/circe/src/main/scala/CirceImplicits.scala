package org.lyranthe.araethura.marketplaceentitlement
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val EntitlementEncoder: io.circe.Encoder[models.Entitlement] = io.circe.Encoder.instance { o => 
    Json.obj("ProductCode" -> o.productCode.asJson, "Dimension" -> o.dimension.asJson, "CustomerIdentifier" -> o.customerIdentifier.asJson, "Value" -> o.value.asJson, "ExpirationDate" -> o.expirationDate.asJson)
  }
  final implicit val GetEntitlementsRequestEncoder: io.circe.Encoder[models.GetEntitlementsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProductCode" -> o.productCode.asJson, "Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val InternalServiceErrorExceptionEncoder: io.circe.Encoder[models.InternalServiceErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val EntitlementValueEncoder: io.circe.Encoder[models.EntitlementValue] = io.circe.Encoder.instance { o => 
    Json.obj("IntegerValue" -> o.integerValue.asJson, "DoubleValue" -> o.doubleValue.asJson, "BooleanValue" -> o.booleanValue.asJson, "StringValue" -> o.stringValue.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ThrottlingExceptionEncoder: io.circe.Encoder[models.ThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetEntitlementsResultEncoder: io.circe.Encoder[models.GetEntitlementsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Entitlements" -> o.entitlements.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EntitlementDecoder: io.circe.Decoder[models.Entitlement] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProductCode"), o.get[scala.Option[java.lang.String]]("Dimension"), o.get[scala.Option[java.lang.String]]("CustomerIdentifier"), o.get[scala.Option[models.EntitlementValue]]("Value"), o.get[scala.Option[java.time.Instant]]("ExpirationDate")).mapN(models.Entitlement.apply _)
  }
  final implicit val GetEntitlementsRequestDecoder: io.circe.Decoder[models.GetEntitlementsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProductCode"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.GetEntitlementsRequest.apply _)
  }
  final implicit val InternalServiceErrorExceptionDecoder: io.circe.Decoder[models.InternalServiceErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalServiceErrorException.apply _)
  }
  final implicit val EntitlementValueDecoder: io.circe.Decoder[models.EntitlementValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("IntegerValue"), o.get[scala.Option[scala.Double]]("DoubleValue"), o.get[scala.Option[scala.Boolean]]("BooleanValue"), o.get[scala.Option[java.lang.String]]("StringValue")).mapN(models.EntitlementValue.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterException.apply _)
  }
  final implicit val ThrottlingExceptionDecoder: io.circe.Decoder[models.ThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ThrottlingException.apply _)
  }
  final implicit val GetEntitlementsResultDecoder: io.circe.Decoder[models.GetEntitlementsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Entitlement]]]("Entitlements"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetEntitlementsResult.apply _)
  }
}