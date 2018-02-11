package org.lyranthe.araethura.marketplaceentitlement.http4s
import org.http4s.Method._
import org.lyranthe.araethura.marketplaceentitlement.circe._
import org.lyranthe.araethura.marketplaceentitlement.models
class AmazonmarketplaceentitlementClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.marketplaceentitlement.Amazonmarketplaceentitlement[F] {
  private[this] final val ServiceType: String = "entitlement.marketplace"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSMPEntitlementService")
  override def getEntitlements(input: models.GetEntitlementsRequest): F[models.GetEntitlementsResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetEntitlementsResult, models.GetEntitlementsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetEntitlements", POST, "/", input)
}