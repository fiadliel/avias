package avias.shield
trait Amazonshield[F[_]] {
  def describeSubscription: F[avias.shield.models.DescribeSubscriptionResponse]
  def describeAttack(input: avias.shield.models.DescribeAttackRequest): F[avias.shield.models.DescribeAttackResponse]
  def deleteSubscription: F[scala.Unit]
  def createSubscription: F[scala.Unit]
  def createProtection(input: avias.shield.models.CreateProtectionRequest): F[avias.shield.models.CreateProtectionResponse]
  def describeProtection(input: avias.shield.models.DescribeProtectionRequest): F[avias.shield.models.DescribeProtectionResponse]
  def listProtections(input: avias.shield.models.ListProtectionsRequest): F[avias.shield.models.ListProtectionsResponse]
  def deleteProtection(input: avias.shield.models.DeleteProtectionRequest): F[scala.Unit]
  def listAttacks(input: avias.shield.models.ListAttacksRequest): F[avias.shield.models.ListAttacksResponse]
}