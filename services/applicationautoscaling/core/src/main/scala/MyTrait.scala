package org.lyranthe.araethura.applicationautoscaling
trait Amazonapplicationautoscaling[F[_]] {
  def deregisterScalableTarget(input: models.DeregisterScalableTargetRequest): F[scala.Unit]
  def registerScalableTarget(input: models.RegisterScalableTargetRequest): F[scala.Unit]
  def describeScalingActivities(input: models.DescribeScalingActivitiesRequest): F[models.DescribeScalingActivitiesResponse]
  def deleteScalingPolicy(input: models.DeleteScalingPolicyRequest): F[scala.Unit]
  def deleteScheduledAction(input: models.DeleteScheduledActionRequest): F[scala.Unit]
  def putScalingPolicy(input: models.PutScalingPolicyRequest): F[models.PutScalingPolicyResponse]
  def describeScalableTargets(input: models.DescribeScalableTargetsRequest): F[models.DescribeScalableTargetsResponse]
  def putScheduledAction(input: models.PutScheduledActionRequest): F[scala.Unit]
  def describeScalingPolicies(input: models.DescribeScalingPoliciesRequest): F[models.DescribeScalingPoliciesResponse]
  def describeScheduledActions(input: models.DescribeScheduledActionsRequest): F[models.DescribeScheduledActionsResponse]
}