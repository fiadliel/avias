package avias.marketplaceentitlement.http4s
import org.http4s.Method._
import avias.marketplaceentitlement.circe._
import avias.marketplaceentitlement.models
class AmazonmarketplaceentitlementClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.marketplaceentitlement.Amazonmarketplaceentitlement[F] {
  private[this] final val ServiceType: String = "entitlement.marketplace"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSMPEntitlementService")
  override def getEntitlements(input: avias.marketplaceentitlement.models.GetEntitlementsRequest): F[avias.marketplaceentitlement.models.GetEntitlementsResult] = avias.common.http4s.ClientUtils.doRequest[F, avias.marketplaceentitlement.models.GetEntitlementsResult, avias.marketplaceentitlement.models.GetEntitlementsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetEntitlements", POST, "/", input)
}