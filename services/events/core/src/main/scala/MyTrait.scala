package avias.events
trait Amazonevents[F[_]] {
  def putEvents(input: avias.events.models.PutEventsRequest): F[avias.events.models.PutEventsResponse]
  def removePermission(input: avias.events.models.RemovePermissionRequest): F[scala.Unit]
  def describeEventBus: F[avias.events.models.DescribeEventBusResponse]
  def describeRule(input: avias.events.models.DescribeRuleRequest): F[avias.events.models.DescribeRuleResponse]
  def disableRule(input: avias.events.models.DisableRuleRequest): F[scala.Unit]
  def testEventPattern(input: avias.events.models.TestEventPatternRequest): F[avias.events.models.TestEventPatternResponse]
  def enableRule(input: avias.events.models.EnableRuleRequest): F[scala.Unit]
  def listTargetsByRule(input: avias.events.models.ListTargetsByRuleRequest): F[avias.events.models.ListTargetsByRuleResponse]
  def deleteRule(input: avias.events.models.DeleteRuleRequest): F[scala.Unit]
  def removeTargets(input: avias.events.models.RemoveTargetsRequest): F[avias.events.models.RemoveTargetsResponse]
  def putRule(input: avias.events.models.PutRuleRequest): F[avias.events.models.PutRuleResponse]
  def putPermission(input: avias.events.models.PutPermissionRequest): F[scala.Unit]
  def listRuleNamesByTarget(input: avias.events.models.ListRuleNamesByTargetRequest): F[avias.events.models.ListRuleNamesByTargetResponse]
  def putTargets(input: avias.events.models.PutTargetsRequest): F[avias.events.models.PutTargetsResponse]
  def listRules(input: avias.events.models.ListRulesRequest): F[avias.events.models.ListRulesResponse]
}