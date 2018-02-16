package org.lyranthe.araethura.events.models
final case class PutRuleRequest(name: java.lang.String, eventPattern: scala.Option[java.lang.String] = scala.None, roleArn: scala.Option[java.lang.String] = scala.None, scheduleExpression: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class PutEventsResponse(failedEntryCount: scala.Option[scala.Int] = scala.None, entries: scala.Option[scala.List[org.lyranthe.araethura.events.models.PutEventsResultEntry]] = scala.None)
case object LimitExceededException
final case class EnableRuleRequest(name: java.lang.String)
final case class DeleteRuleRequest(name: java.lang.String)
final case class TestEventPatternRequest(eventPattern: java.lang.String, event: java.lang.String)
final case class RunCommandTarget(key: java.lang.String, values: scala.List[java.lang.String])
final case class ListRulesRequest(namePrefix: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Int] = scala.None)
case object DescribeEventBusRequest
final case class RunCommandParameters(runCommandTargets: scala.List[org.lyranthe.araethura.events.models.RunCommandTarget])
case object PolicyLengthExceededException
final case class DescribeEventBusResponse(name: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, policy: scala.Option[java.lang.String] = scala.None)
final case class PutRuleResponse(ruleArn: scala.Option[java.lang.String] = scala.None)
final case class DescribeRuleResponse(eventPattern: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, roleArn: scala.Option[java.lang.String] = scala.None, scheduleExpression: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class TestEventPatternResponse(result: scala.Option[scala.Boolean] = scala.None)
final case class RemoveTargetsRequest(rule: java.lang.String, ids: scala.List[java.lang.String])
final case class DescribeRuleRequest(name: java.lang.String)
final case class ListRuleNamesByTargetResponse(ruleNames: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object ConcurrentModificationException
final case class RemoveTargetsResultEntry(targetId: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
case object ResourceNotFoundException
final case class DisableRuleRequest(name: java.lang.String)
final case class ListRulesResponse(rules: scala.Option[scala.List[org.lyranthe.araethura.events.models.Rule]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidEventPatternException
final case class PutEventsRequest(entries: scala.List[org.lyranthe.araethura.events.models.PutEventsRequestEntry])
final case class ListTargetsByRuleRequest(rule: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Int] = scala.None)
final case class Target(arn: java.lang.String, id: java.lang.String, runCommandParameters: scala.Option[org.lyranthe.araethura.events.models.RunCommandParameters] = scala.None, input: scala.Option[java.lang.String] = scala.None, roleArn: scala.Option[java.lang.String] = scala.None, inputPath: scala.Option[java.lang.String] = scala.None, ecsParameters: scala.Option[org.lyranthe.araethura.events.models.EcsParameters] = scala.None, inputTransformer: scala.Option[org.lyranthe.araethura.events.models.InputTransformer] = scala.None, kinesisParameters: scala.Option[org.lyranthe.araethura.events.models.KinesisParameters] = scala.None)
final case class Rule(eventPattern: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, roleArn: scala.Option[java.lang.String] = scala.None, scheduleExpression: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class PutEventsRequestEntry(time: scala.Option[java.time.Instant] = scala.None, source: scala.Option[java.lang.String] = scala.None, detailType: scala.Option[java.lang.String] = scala.None, detail: scala.Option[java.lang.String] = scala.None, resources: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ListTargetsByRuleResponse(targets: scala.Option[scala.List[org.lyranthe.araethura.events.models.Target]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InternalException
final case class RemovePermissionRequest(statementId: java.lang.String)
final case class PutTargetsResultEntry(targetId: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class PutTargetsRequest(rule: java.lang.String, targets: scala.List[org.lyranthe.araethura.events.models.Target])
final case class PutPermissionRequest(action: java.lang.String, principal: java.lang.String, statementId: java.lang.String)
final case class PutEventsResultEntry(eventId: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class RemoveTargetsResponse(failedEntryCount: scala.Option[scala.Int] = scala.None, failedEntries: scala.Option[scala.List[org.lyranthe.araethura.events.models.RemoveTargetsResultEntry]] = scala.None)
final case class EcsParameters(taskDefinitionArn: java.lang.String, taskCount: scala.Option[scala.Int] = scala.None)
final case class ListRuleNamesByTargetRequest(targetArn: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Int] = scala.None)
final case class InputTransformer(inputTemplate: java.lang.String, inputPathsMap: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class PutTargetsResponse(failedEntryCount: scala.Option[scala.Int] = scala.None, failedEntries: scala.Option[scala.List[org.lyranthe.araethura.events.models.PutTargetsResultEntry]] = scala.None)
final case class KinesisParameters(partitionKeyPath: java.lang.String)