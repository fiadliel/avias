package org.lyranthe.araethura.events
trait Amazonevents[F[_]] {
  def putEvents(input: models.PutEventsRequest): F[models.PutEventsResponse]
  def removePermission(input: models.RemovePermissionRequest): F[Unit]
  def describeEventBus: F[models.DescribeEventBusResponse]
  def describeRule(input: models.DescribeRuleRequest): F[models.DescribeRuleResponse]
  def disableRule(input: models.DisableRuleRequest): F[Unit]
  def testEventPattern(input: models.TestEventPatternRequest): F[models.TestEventPatternResponse]
  def enableRule(input: models.EnableRuleRequest): F[Unit]
  def listTargetsByRule(input: models.ListTargetsByRuleRequest): F[models.ListTargetsByRuleResponse]
  def deleteRule(input: models.DeleteRuleRequest): F[Unit]
  def removeTargets(input: models.RemoveTargetsRequest): F[models.RemoveTargetsResponse]
  def putRule(input: models.PutRuleRequest): F[models.PutRuleResponse]
  def putPermission(input: models.PutPermissionRequest): F[Unit]
  def listRuleNamesByTarget(input: models.ListRuleNamesByTargetRequest): F[models.ListRuleNamesByTargetResponse]
  def putTargets(input: models.PutTargetsRequest): F[models.PutTargetsResponse]
  def listRules(input: models.ListRulesRequest): F[models.ListRulesResponse]
}