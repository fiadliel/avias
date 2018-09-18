package avias.events.http4s
import org.http4s.Method._
import avias.events.circe._
import avias.events.models
import avias.common.http4s.ClientUtils._
class AmazoneventsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.events.Amazonevents[F] {
  private[this] final val ServiceType: String = "events"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSEvents")
  override def putEvents(input: avias.events.models.PutEventsRequest): F[avias.events.models.PutEventsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.PutEventsResponse, avias.events.models.PutEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutEvents", POST, "/", input)
  override def removePermission(input: avias.events.models.RemovePermissionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.events.models.RemovePermissionRequest](client, awsData, ServiceType, ServiceAndPrefix, "RemovePermission", POST, "/", input)
  override def describeEventBus: F[avias.events.models.DescribeEventBusResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.DescribeEventBusResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventBus", POST, "/", ())
  override def describeRule(input: avias.events.models.DescribeRuleRequest): F[avias.events.models.DescribeRuleResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.DescribeRuleResponse, avias.events.models.DescribeRuleRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeRule", POST, "/", input)
  override def disableRule(input: avias.events.models.DisableRuleRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.events.models.DisableRuleRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisableRule", POST, "/", input)
  override def testEventPattern(input: avias.events.models.TestEventPatternRequest): F[avias.events.models.TestEventPatternResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.TestEventPatternResponse, avias.events.models.TestEventPatternRequest](client, awsData, ServiceType, ServiceAndPrefix, "TestEventPattern", POST, "/", input)
  override def enableRule(input: avias.events.models.EnableRuleRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.events.models.EnableRuleRequest](client, awsData, ServiceType, ServiceAndPrefix, "EnableRule", POST, "/", input)
  override def listTargetsByRule(input: avias.events.models.ListTargetsByRuleRequest): F[avias.events.models.ListTargetsByRuleResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.ListTargetsByRuleResponse, avias.events.models.ListTargetsByRuleRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTargetsByRule", POST, "/", input)
  override def deleteRule(input: avias.events.models.DeleteRuleRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.events.models.DeleteRuleRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteRule", POST, "/", input)
  override def removeTargets(input: avias.events.models.RemoveTargetsRequest): F[avias.events.models.RemoveTargetsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.RemoveTargetsResponse, avias.events.models.RemoveTargetsRequest](client, awsData, ServiceType, ServiceAndPrefix, "RemoveTargets", POST, "/", input)
  override def putRule(input: avias.events.models.PutRuleRequest): F[avias.events.models.PutRuleResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.PutRuleResponse, avias.events.models.PutRuleRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutRule", POST, "/", input)
  override def putPermission(input: avias.events.models.PutPermissionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.events.models.PutPermissionRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutPermission", POST, "/", input)
  override def listRuleNamesByTarget(input: avias.events.models.ListRuleNamesByTargetRequest): F[avias.events.models.ListRuleNamesByTargetResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.ListRuleNamesByTargetResponse, avias.events.models.ListRuleNamesByTargetRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListRuleNamesByTarget", POST, "/", input)
  override def putTargets(input: avias.events.models.PutTargetsRequest): F[avias.events.models.PutTargetsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.PutTargetsResponse, avias.events.models.PutTargetsRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutTargets", POST, "/", input)
  override def listRules(input: avias.events.models.ListRulesRequest): F[avias.events.models.ListRulesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.events.models.ListRulesResponse, avias.events.models.ListRulesRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListRules", POST, "/", input)
}