package org.lyranthe.araethura.events
trait Amazonevents[F[_]] {
  def putEvents(input: org.lyranthe.araethura.events.models.PutEventsRequest): F[org.lyranthe.araethura.events.models.PutEventsResponse]
  def removePermission(input: org.lyranthe.araethura.events.models.RemovePermissionRequest): F[scala.Unit]
  def describeEventBus: F[org.lyranthe.araethura.events.models.DescribeEventBusResponse]
  def describeRule(input: org.lyranthe.araethura.events.models.DescribeRuleRequest): F[org.lyranthe.araethura.events.models.DescribeRuleResponse]
  def disableRule(input: org.lyranthe.araethura.events.models.DisableRuleRequest): F[scala.Unit]
  def testEventPattern(input: org.lyranthe.araethura.events.models.TestEventPatternRequest): F[org.lyranthe.araethura.events.models.TestEventPatternResponse]
  def enableRule(input: org.lyranthe.araethura.events.models.EnableRuleRequest): F[scala.Unit]
  def listTargetsByRule(input: org.lyranthe.araethura.events.models.ListTargetsByRuleRequest): F[org.lyranthe.araethura.events.models.ListTargetsByRuleResponse]
  def deleteRule(input: org.lyranthe.araethura.events.models.DeleteRuleRequest): F[scala.Unit]
  def removeTargets(input: org.lyranthe.araethura.events.models.RemoveTargetsRequest): F[org.lyranthe.araethura.events.models.RemoveTargetsResponse]
  def putRule(input: org.lyranthe.araethura.events.models.PutRuleRequest): F[org.lyranthe.araethura.events.models.PutRuleResponse]
  def putPermission(input: org.lyranthe.araethura.events.models.PutPermissionRequest): F[scala.Unit]
  def listRuleNamesByTarget(input: org.lyranthe.araethura.events.models.ListRuleNamesByTargetRequest): F[org.lyranthe.araethura.events.models.ListRuleNamesByTargetResponse]
  def putTargets(input: org.lyranthe.araethura.events.models.PutTargetsRequest): F[org.lyranthe.araethura.events.models.PutTargetsResponse]
  def listRules(input: org.lyranthe.araethura.events.models.ListRulesRequest): F[org.lyranthe.araethura.events.models.ListRulesResponse]
}