package org.lyranthe.araethura.events.models
import org.lyranthe.araethura.events.models
final case class PutRuleRequest(name: java.lang.String, eventPattern: scala.Option[java.lang.String] = None, roleArn: scala.Option[java.lang.String] = None, scheduleExpression: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class PutEventsResponse(failedEntryCount: scala.Option[scala.Int] = None, entries: scala.Option[scala.List[models.PutEventsResultEntry]] = None)
case object LimitExceededException
final case class EnableRuleRequest(name: java.lang.String)
final case class DeleteRuleRequest(name: java.lang.String)
final case class TestEventPatternRequest(eventPattern: java.lang.String, event: java.lang.String)
final case class RunCommandTarget(key: java.lang.String, values: scala.List[java.lang.String])
final case class ListRulesRequest(namePrefix: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, limit: scala.Option[scala.Int] = None)
case object DescribeEventBusRequest
final case class RunCommandParameters(runCommandTargets: scala.List[models.RunCommandTarget])
case object PolicyLengthExceededException
final case class DescribeEventBusResponse(name: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, policy: scala.Option[java.lang.String] = None)
final case class PutRuleResponse(ruleArn: scala.Option[java.lang.String] = None)
final case class DescribeRuleResponse(eventPattern: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, roleArn: scala.Option[java.lang.String] = None, scheduleExpression: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class TestEventPatternResponse(result: scala.Option[scala.Boolean] = None)
final case class RemoveTargetsRequest(rule: java.lang.String, ids: scala.List[java.lang.String])
final case class DescribeRuleRequest(name: java.lang.String)
final case class ListRuleNamesByTargetResponse(ruleNames: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
case object ConcurrentModificationException
final case class RemoveTargetsResultEntry(targetId: scala.Option[java.lang.String] = None, errorCode: scala.Option[java.lang.String] = None, errorMessage: scala.Option[java.lang.String] = None)
case object ResourceNotFoundException
final case class DisableRuleRequest(name: java.lang.String)
final case class ListRulesResponse(rules: scala.Option[scala.List[models.Rule]] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidEventPatternException
final case class PutEventsRequest(entries: scala.List[models.PutEventsRequestEntry])
final case class ListTargetsByRuleRequest(rule: java.lang.String, nextToken: scala.Option[java.lang.String] = None, limit: scala.Option[scala.Int] = None)
final case class Target(arn: java.lang.String, id: java.lang.String, runCommandParameters: scala.Option[models.RunCommandParameters] = None, input: scala.Option[java.lang.String] = None, roleArn: scala.Option[java.lang.String] = None, inputPath: scala.Option[java.lang.String] = None, ecsParameters: scala.Option[models.EcsParameters] = None, inputTransformer: scala.Option[models.InputTransformer] = None, kinesisParameters: scala.Option[models.KinesisParameters] = None)
final case class Rule(eventPattern: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, roleArn: scala.Option[java.lang.String] = None, scheduleExpression: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class PutEventsRequestEntry(time: scala.Option[java.time.Instant] = None, source: scala.Option[java.lang.String] = None, detailType: scala.Option[java.lang.String] = None, detail: scala.Option[java.lang.String] = None, resources: scala.Option[scala.List[java.lang.String]] = None)
final case class ListTargetsByRuleResponse(targets: scala.Option[scala.List[models.Target]] = None, nextToken: scala.Option[java.lang.String] = None)
case object InternalException
final case class RemovePermissionRequest(statementId: java.lang.String)
final case class PutTargetsResultEntry(targetId: scala.Option[java.lang.String] = None, errorCode: scala.Option[java.lang.String] = None, errorMessage: scala.Option[java.lang.String] = None)
final case class PutTargetsRequest(rule: java.lang.String, targets: scala.List[models.Target])
final case class PutPermissionRequest(action: java.lang.String, principal: java.lang.String, statementId: java.lang.String)
final case class PutEventsResultEntry(eventId: scala.Option[java.lang.String] = None, errorCode: scala.Option[java.lang.String] = None, errorMessage: scala.Option[java.lang.String] = None)
final case class RemoveTargetsResponse(failedEntryCount: scala.Option[scala.Int] = None, failedEntries: scala.Option[scala.List[models.RemoveTargetsResultEntry]] = None)
final case class EcsParameters(taskDefinitionArn: java.lang.String, taskCount: scala.Option[scala.Int] = None)
final case class ListRuleNamesByTargetRequest(targetArn: java.lang.String, nextToken: scala.Option[java.lang.String] = None, limit: scala.Option[scala.Int] = None)
final case class InputTransformer(inputTemplate: java.lang.String, inputPathsMap: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None)
final case class PutTargetsResponse(failedEntryCount: scala.Option[scala.Int] = None, failedEntries: scala.Option[scala.List[models.PutTargetsResultEntry]] = None)
final case class KinesisParameters(partitionKeyPath: java.lang.String)