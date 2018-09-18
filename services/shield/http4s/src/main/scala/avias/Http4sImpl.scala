package avias.shield.http4s
import org.http4s.Method._
import avias.shield.circe._
import avias.shield.models
import avias.common.http4s.ClientUtils._
class AmazonshieldClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.shield.Amazonshield[F] {
  private[this] final val ServiceType: String = "shield"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSShield_20160616")
  override def describeSubscription: F[avias.shield.models.DescribeSubscriptionResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.shield.models.DescribeSubscriptionResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSubscription", POST, "/", ())
  override def describeAttack(input: avias.shield.models.DescribeAttackRequest): F[avias.shield.models.DescribeAttackResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.shield.models.DescribeAttackResponse, avias.shield.models.DescribeAttackRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAttack", POST, "/", input)
  override def deleteSubscription: F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DeleteSubscription", POST, "/", ())
  override def createSubscription: F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "CreateSubscription", POST, "/", ())
  override def createProtection(input: avias.shield.models.CreateProtectionRequest): F[avias.shield.models.CreateProtectionResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.shield.models.CreateProtectionResponse, avias.shield.models.CreateProtectionRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateProtection", POST, "/", input)
  override def describeProtection(input: avias.shield.models.DescribeProtectionRequest): F[avias.shield.models.DescribeProtectionResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.shield.models.DescribeProtectionResponse, avias.shield.models.DescribeProtectionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeProtection", POST, "/", input)
  override def listProtections(input: avias.shield.models.ListProtectionsRequest): F[avias.shield.models.ListProtectionsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.shield.models.ListProtectionsResponse, avias.shield.models.ListProtectionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListProtections", POST, "/", input)
  override def deleteProtection(input: avias.shield.models.DeleteProtectionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.shield.models.DeleteProtectionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteProtection", POST, "/", input)
  override def listAttacks(input: avias.shield.models.ListAttacksRequest): F[avias.shield.models.ListAttacksResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.shield.models.ListAttacksResponse, avias.shield.models.ListAttacksRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAttacks", POST, "/", input)
}