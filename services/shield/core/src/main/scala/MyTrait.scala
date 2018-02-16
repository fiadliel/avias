package org.lyranthe.araethura.shield
trait Amazonshield[F[_]] {
  def describeSubscription: F[org.lyranthe.araethura.shield.models.DescribeSubscriptionResponse]
  def describeAttack(input: org.lyranthe.araethura.shield.models.DescribeAttackRequest): F[org.lyranthe.araethura.shield.models.DescribeAttackResponse]
  def deleteSubscription: F[scala.Unit]
  def createSubscription: F[scala.Unit]
  def createProtection(input: org.lyranthe.araethura.shield.models.CreateProtectionRequest): F[org.lyranthe.araethura.shield.models.CreateProtectionResponse]
  def describeProtection(input: org.lyranthe.araethura.shield.models.DescribeProtectionRequest): F[org.lyranthe.araethura.shield.models.DescribeProtectionResponse]
  def listProtections(input: org.lyranthe.araethura.shield.models.ListProtectionsRequest): F[org.lyranthe.araethura.shield.models.ListProtectionsResponse]
  def deleteProtection(input: org.lyranthe.araethura.shield.models.DeleteProtectionRequest): F[scala.Unit]
  def listAttacks(input: org.lyranthe.araethura.shield.models.ListAttacksRequest): F[org.lyranthe.araethura.shield.models.ListAttacksResponse]
}