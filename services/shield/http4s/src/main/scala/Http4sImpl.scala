package org.lyranthe.araethura.shield.http4s
import org.http4s.Method._
import org.lyranthe.araethura.shield.circe._
import org.lyranthe.araethura.shield.models
class AmazonshieldClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.shield.Amazonshield[F] {
  private[this] final val ServiceType: String = "shield"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSShield_20160616")
  override def describeSubscription: F[models.DescribeSubscriptionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeSubscriptionResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSubscription", POST, "/", ())
  override def describeAttack(input: models.DescribeAttackRequest): F[models.DescribeAttackResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAttackResponse, models.DescribeAttackRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAttack", POST, "/", input)
  override def deleteSubscription: F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DeleteSubscription", POST, "/", ())
  override def createSubscription: F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "CreateSubscription", POST, "/", ())
  override def createProtection(input: models.CreateProtectionRequest): F[models.CreateProtectionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateProtectionResponse, models.CreateProtectionRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateProtection", POST, "/", input)
  override def describeProtection(input: models.DescribeProtectionRequest): F[models.DescribeProtectionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeProtectionResponse, models.DescribeProtectionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeProtection", POST, "/", input)
  override def listProtections(input: models.ListProtectionsRequest): F[models.ListProtectionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListProtectionsResponse, models.ListProtectionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListProtections", POST, "/", input)
  override def deleteProtection(input: models.DeleteProtectionRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteProtectionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteProtection", POST, "/", input)
  override def listAttacks(input: models.ListAttacksRequest): F[models.ListAttacksResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListAttacksResponse, models.ListAttacksRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListAttacks", POST, "/", input)
}