package org.lyranthe.araethura.shield
trait Amazonshield[F[_]] {
  def describeSubscription: F[models.DescribeSubscriptionResponse]
  def describeAttack(input: models.DescribeAttackRequest): F[models.DescribeAttackResponse]
  def deleteSubscription: F[scala.Unit]
  def createSubscription: F[scala.Unit]
  def createProtection(input: models.CreateProtectionRequest): F[models.CreateProtectionResponse]
  def describeProtection(input: models.DescribeProtectionRequest): F[models.DescribeProtectionResponse]
  def listProtections(input: models.ListProtectionsRequest): F[models.ListProtectionsResponse]
  def deleteProtection(input: models.DeleteProtectionRequest): F[scala.Unit]
  def listAttacks(input: models.ListAttacksRequest): F[models.ListAttacksResponse]
}