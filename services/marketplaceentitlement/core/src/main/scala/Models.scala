package org.lyranthe.araethura.marketplaceentitlement.models
import org.lyranthe.araethura.marketplaceentitlement.models
final case class Entitlement(productCode: scala.Option[java.lang.String] = None, dimension: scala.Option[java.lang.String] = None, customerIdentifier: scala.Option[java.lang.String] = None, value: scala.Option[models.EntitlementValue] = None, expirationDate: scala.Option[java.time.Instant] = None)
final case class GetEntitlementsRequest(productCode: java.lang.String, filter: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class InternalServiceErrorException(message: scala.Option[java.lang.String] = None)
final case class EntitlementValue(integerValue: scala.Option[scala.Int] = None, doubleValue: scala.Option[scala.Double] = None, booleanValue: scala.Option[scala.Boolean] = None, stringValue: scala.Option[java.lang.String] = None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = None)
final case class ThrottlingException(message: scala.Option[java.lang.String] = None)
final case class GetEntitlementsResult(entitlements: scala.Option[scala.List[models.Entitlement]] = None, nextToken: scala.Option[java.lang.String] = None)