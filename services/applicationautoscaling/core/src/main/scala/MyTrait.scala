package org.lyranthe.araethura.applicationautoscaling
trait Amazonapplicationautoscaling[F[_]] {
  def deregisterScalableTarget(input: org.lyranthe.araethura.applicationautoscaling.models.DeregisterScalableTargetRequest): F[scala.Unit]
  def registerScalableTarget(input: org.lyranthe.araethura.applicationautoscaling.models.RegisterScalableTargetRequest): F[scala.Unit]
  def describeScalingActivities(input: org.lyranthe.araethura.applicationautoscaling.models.DescribeScalingActivitiesRequest): F[org.lyranthe.araethura.applicationautoscaling.models.DescribeScalingActivitiesResponse]
  def deleteScalingPolicy(input: org.lyranthe.araethura.applicationautoscaling.models.DeleteScalingPolicyRequest): F[scala.Unit]
  def deleteScheduledAction(input: org.lyranthe.araethura.applicationautoscaling.models.DeleteScheduledActionRequest): F[scala.Unit]
  def putScalingPolicy(input: org.lyranthe.araethura.applicationautoscaling.models.PutScalingPolicyRequest): F[org.lyranthe.araethura.applicationautoscaling.models.PutScalingPolicyResponse]
  def describeScalableTargets(input: org.lyranthe.araethura.applicationautoscaling.models.DescribeScalableTargetsRequest): F[org.lyranthe.araethura.applicationautoscaling.models.DescribeScalableTargetsResponse]
  def putScheduledAction(input: org.lyranthe.araethura.applicationautoscaling.models.PutScheduledActionRequest): F[scala.Unit]
  def describeScalingPolicies(input: org.lyranthe.araethura.applicationautoscaling.models.DescribeScalingPoliciesRequest): F[org.lyranthe.araethura.applicationautoscaling.models.DescribeScalingPoliciesResponse]
  def describeScheduledActions(input: org.lyranthe.araethura.applicationautoscaling.models.DescribeScheduledActionsRequest): F[org.lyranthe.araethura.applicationautoscaling.models.DescribeScheduledActionsResponse]
}