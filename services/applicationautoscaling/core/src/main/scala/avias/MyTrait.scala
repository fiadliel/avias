package avias.applicationautoscaling
trait Amazonapplicationautoscaling[F[_]] {
  def deregisterScalableTarget(input: avias.applicationautoscaling.models.DeregisterScalableTargetRequest): F[scala.Unit]
  def registerScalableTarget(input: avias.applicationautoscaling.models.RegisterScalableTargetRequest): F[scala.Unit]
  def describeScalingActivities(input: avias.applicationautoscaling.models.DescribeScalingActivitiesRequest): F[avias.applicationautoscaling.models.DescribeScalingActivitiesResponse]
  def deleteScalingPolicy(input: avias.applicationautoscaling.models.DeleteScalingPolicyRequest): F[scala.Unit]
  def deleteScheduledAction(input: avias.applicationautoscaling.models.DeleteScheduledActionRequest): F[scala.Unit]
  def putScalingPolicy(input: avias.applicationautoscaling.models.PutScalingPolicyRequest): F[avias.applicationautoscaling.models.PutScalingPolicyResponse]
  def describeScalableTargets(input: avias.applicationautoscaling.models.DescribeScalableTargetsRequest): F[avias.applicationautoscaling.models.DescribeScalableTargetsResponse]
  def putScheduledAction(input: avias.applicationautoscaling.models.PutScheduledActionRequest): F[scala.Unit]
  def describeScalingPolicies(input: avias.applicationautoscaling.models.DescribeScalingPoliciesRequest): F[avias.applicationautoscaling.models.DescribeScalingPoliciesResponse]
  def describeScheduledActions(input: avias.applicationautoscaling.models.DescribeScheduledActionsRequest): F[avias.applicationautoscaling.models.DescribeScheduledActionsResponse]
}