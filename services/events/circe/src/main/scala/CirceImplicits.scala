package org.lyranthe.araethura.events
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val PutRuleRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "EventPattern" -> o.eventPattern.asJson, "RoleArn" -> o.roleArn.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "State" -> o.state.asJson, "Description" -> o.description.asJson)
  }
  final implicit val PutEventsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEntryCount" -> o.failedEntryCount.asJson, "Entries" -> o.entries.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableRuleRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.EnableRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DeleteRuleRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.DeleteRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val TestEventPatternRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.TestEventPatternRequest] = io.circe.Encoder.instance { o => 
    Json.obj("EventPattern" -> o.eventPattern.asJson, "Event" -> o.event.asJson)
  }
  final implicit val RunCommandTargetEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.RunCommandTarget] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val ListRulesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ListRulesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NamePrefix" -> o.namePrefix.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeEventBusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.DescribeEventBusRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RunCommandParametersEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.RunCommandParameters] = io.circe.Encoder.instance { o => 
    Json.obj("RunCommandTargets" -> o.runCommandTargets.asJson)
  }
  final implicit val PolicyLengthExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PolicyLengthExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventBusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.DescribeEventBusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Arn" -> o.arn.asJson, "Policy" -> o.policy.asJson)
  }
  final implicit val PutRuleResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("RuleArn" -> o.ruleArn.asJson)
  }
  final implicit val DescribeRuleResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.DescribeRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EventPattern" -> o.eventPattern.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "RoleArn" -> o.roleArn.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "State" -> o.state.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TestEventPatternResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.TestEventPatternResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Result" -> o.result.asJson)
  }
  final implicit val RemoveTargetsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.RemoveTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Rule" -> o.rule.asJson, "Ids" -> o.ids.asJson)
  }
  final implicit val DescribeRuleRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.DescribeRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val ListRuleNamesByTargetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ListRuleNamesByTargetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("RuleNames" -> o.ruleNames.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ConcurrentModificationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTargetsResultEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.RemoveTargetsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DisableRuleRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.DisableRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val ListRulesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ListRulesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Rules" -> o.rules.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidEventPatternExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.InvalidEventPatternException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutEventsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Entries" -> o.entries.asJson)
  }
  final implicit val ListTargetsByRuleRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ListTargetsByRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Rule" -> o.rule.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val TargetEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.Target] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "Id" -> o.id.asJson, "RunCommandParameters" -> o.runCommandParameters.asJson, "Input" -> o.input.asJson, "RoleArn" -> o.roleArn.asJson, "InputPath" -> o.inputPath.asJson, "EcsParameters" -> o.ecsParameters.asJson, "InputTransformer" -> o.inputTransformer.asJson, "KinesisParameters" -> o.kinesisParameters.asJson)
  }
  final implicit val RuleEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.Rule] = io.circe.Encoder.instance { o => 
    Json.obj("EventPattern" -> o.eventPattern.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "RoleArn" -> o.roleArn.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "State" -> o.state.asJson, "Description" -> o.description.asJson)
  }
  final implicit val PutEventsRequestEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutEventsRequestEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Time" -> o.time.asJson, "Source" -> o.source.asJson, "DetailType" -> o.detailType.asJson, "Detail" -> o.detail.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val ListTargetsByRuleResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ListTargetsByRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InternalExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.InternalException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemovePermissionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.RemovePermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StatementId" -> o.statementId.asJson)
  }
  final implicit val PutTargetsResultEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutTargetsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val PutTargetsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Rule" -> o.rule.asJson, "Targets" -> o.targets.asJson)
  }
  final implicit val PutPermissionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutPermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Action" -> o.action.asJson, "Principal" -> o.principal.asJson, "StatementId" -> o.statementId.asJson)
  }
  final implicit val PutEventsResultEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutEventsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("EventId" -> o.eventId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val RemoveTargetsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.RemoveTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEntryCount" -> o.failedEntryCount.asJson, "FailedEntries" -> o.failedEntries.asJson)
  }
  final implicit val EcsParametersEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.EcsParameters] = io.circe.Encoder.instance { o => 
    Json.obj("TaskDefinitionArn" -> o.taskDefinitionArn.asJson, "TaskCount" -> o.taskCount.asJson)
  }
  final implicit val ListRuleNamesByTargetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.ListRuleNamesByTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TargetArn" -> o.targetArn.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val InputTransformerEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.InputTransformer] = io.circe.Encoder.instance { o => 
    Json.obj("InputTemplate" -> o.inputTemplate.asJson, "InputPathsMap" -> o.inputPathsMap.asJson)
  }
  final implicit val PutTargetsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.PutTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEntryCount" -> o.failedEntryCount.asJson, "FailedEntries" -> o.failedEntries.asJson)
  }
  final implicit val KinesisParametersEncoder: io.circe.Encoder[org.lyranthe.araethura.events.models.KinesisParameters] = io.circe.Encoder.instance { o => 
    Json.obj("PartitionKeyPath" -> o.partitionKeyPath.asJson)
  }
  final implicit val PutRuleRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutRuleRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("EventPattern"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.events.models.PutRuleRequest.apply _)
  }
  final implicit val PutEventsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("FailedEntryCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.events.models.PutEventsResultEntry]]]("Entries")).mapN(org.lyranthe.araethura.events.models.PutEventsResponse.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.LimitExceededException)
  final implicit val EnableRuleRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.EnableRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.events.models.EnableRuleRequest.apply _)
  }
  final implicit val DeleteRuleRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.DeleteRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.events.models.DeleteRuleRequest.apply _)
  }
  final implicit val TestEventPatternRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.TestEventPatternRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EventPattern"), o.get[java.lang.String]("Event")).mapN(org.lyranthe.araethura.events.models.TestEventPatternRequest.apply _)
  }
  final implicit val RunCommandTargetDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.RunCommandTarget] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values")).mapN(org.lyranthe.araethura.events.models.RunCommandTarget.apply _)
  }
  final implicit val ListRulesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ListRulesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NamePrefix"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.events.models.ListRulesRequest.apply _)
  }
  final implicit val DescribeEventBusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.DescribeEventBusRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.DescribeEventBusRequest)
  final implicit val RunCommandParametersDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.RunCommandParameters] = io.circe.Decoder.instance { o => 
    o.get[scala.List[org.lyranthe.araethura.events.models.RunCommandTarget]]("RunCommandTargets").map(org.lyranthe.araethura.events.models.RunCommandParameters.apply _)
  }
  final implicit val PolicyLengthExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PolicyLengthExceededException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.PolicyLengthExceededException)
  final implicit val DescribeEventBusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.DescribeEventBusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Policy")).mapN(org.lyranthe.araethura.events.models.DescribeEventBusResponse.apply _)
  }
  final implicit val PutRuleResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutRuleResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("RuleArn").map(org.lyranthe.araethura.events.models.PutRuleResponse.apply _)
  }
  final implicit val DescribeRuleResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.DescribeRuleResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventPattern"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.events.models.DescribeRuleResponse.apply _)
  }
  final implicit val TestEventPatternResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.TestEventPatternResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("Result").map(org.lyranthe.araethura.events.models.TestEventPatternResponse.apply _)
  }
  final implicit val RemoveTargetsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.RemoveTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Rule"), o.get[scala.List[java.lang.String]]("Ids")).mapN(org.lyranthe.araethura.events.models.RemoveTargetsRequest.apply _)
  }
  final implicit val DescribeRuleRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.DescribeRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.events.models.DescribeRuleRequest.apply _)
  }
  final implicit val ListRuleNamesByTargetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ListRuleNamesByTargetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("RuleNames"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.events.models.ListRuleNamesByTargetResponse.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ConcurrentModificationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.ConcurrentModificationException)
  final implicit val RemoveTargetsResultEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.RemoveTargetsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(org.lyranthe.araethura.events.models.RemoveTargetsResultEntry.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.ResourceNotFoundException)
  final implicit val DisableRuleRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.DisableRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.events.models.DisableRuleRequest.apply _)
  }
  final implicit val ListRulesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ListRulesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.events.models.Rule]]]("Rules"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.events.models.ListRulesResponse.apply _)
  }
  final implicit val InvalidEventPatternExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.InvalidEventPatternException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.InvalidEventPatternException)
  final implicit val PutEventsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutEventsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[org.lyranthe.araethura.events.models.PutEventsRequestEntry]]("Entries").map(org.lyranthe.araethura.events.models.PutEventsRequest.apply _)
  }
  final implicit val ListTargetsByRuleRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ListTargetsByRuleRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Rule"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.events.models.ListTargetsByRuleRequest.apply _)
  }
  final implicit val TargetDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.Target] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Arn"), o.get[java.lang.String]("Id"), o.get[scala.Option[org.lyranthe.araethura.events.models.RunCommandParameters]]("RunCommandParameters"), o.get[scala.Option[java.lang.String]]("Input"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("InputPath"), o.get[scala.Option[org.lyranthe.araethura.events.models.EcsParameters]]("EcsParameters"), o.get[scala.Option[org.lyranthe.araethura.events.models.InputTransformer]]("InputTransformer"), o.get[scala.Option[org.lyranthe.araethura.events.models.KinesisParameters]]("KinesisParameters")).mapN(org.lyranthe.araethura.events.models.Target.apply _)
  }
  final implicit val RuleDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.Rule] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventPattern"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.events.models.Rule.apply _)
  }
  final implicit val PutEventsRequestEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutEventsRequestEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("Time"), o.get[scala.Option[java.lang.String]]("Source"), o.get[scala.Option[java.lang.String]]("DetailType"), o.get[scala.Option[java.lang.String]]("Detail"), o.get[scala.Option[scala.List[java.lang.String]]]("Resources")).mapN(org.lyranthe.araethura.events.models.PutEventsRequestEntry.apply _)
  }
  final implicit val ListTargetsByRuleResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ListTargetsByRuleResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.events.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.events.models.ListTargetsByRuleResponse.apply _)
  }
  final implicit val InternalExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.InternalException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.events.models.InternalException)
  final implicit val RemovePermissionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.RemovePermissionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StatementId").map(org.lyranthe.araethura.events.models.RemovePermissionRequest.apply _)
  }
  final implicit val PutTargetsResultEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutTargetsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(org.lyranthe.araethura.events.models.PutTargetsResultEntry.apply _)
  }
  final implicit val PutTargetsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Rule"), o.get[scala.List[org.lyranthe.araethura.events.models.Target]]("Targets")).mapN(org.lyranthe.araethura.events.models.PutTargetsRequest.apply _)
  }
  final implicit val PutPermissionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutPermissionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Action"), o.get[java.lang.String]("Principal"), o.get[java.lang.String]("StatementId")).mapN(org.lyranthe.araethura.events.models.PutPermissionRequest.apply _)
  }
  final implicit val PutEventsResultEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutEventsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(org.lyranthe.araethura.events.models.PutEventsResultEntry.apply _)
  }
  final implicit val RemoveTargetsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.RemoveTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("FailedEntryCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.events.models.RemoveTargetsResultEntry]]]("FailedEntries")).mapN(org.lyranthe.araethura.events.models.RemoveTargetsResponse.apply _)
  }
  final implicit val EcsParametersDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.EcsParameters] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TaskDefinitionArn"), o.get[scala.Option[scala.Int]]("TaskCount")).mapN(org.lyranthe.araethura.events.models.EcsParameters.apply _)
  }
  final implicit val ListRuleNamesByTargetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.ListRuleNamesByTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetArn"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.events.models.ListRuleNamesByTargetRequest.apply _)
  }
  final implicit val InputTransformerDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.InputTransformer] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InputTemplate"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("InputPathsMap")).mapN(org.lyranthe.araethura.events.models.InputTransformer.apply _)
  }
  final implicit val PutTargetsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.PutTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("FailedEntryCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.events.models.PutTargetsResultEntry]]]("FailedEntries")).mapN(org.lyranthe.araethura.events.models.PutTargetsResponse.apply _)
  }
  final implicit val KinesisParametersDecoder: io.circe.Decoder[org.lyranthe.araethura.events.models.KinesisParameters] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PartitionKeyPath").map(org.lyranthe.araethura.events.models.KinesisParameters.apply _)
  }
}