package avias.events
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val PutRuleRequestEncoder: io.circe.Encoder[avias.events.models.PutRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "EventPattern" -> o.eventPattern.asJson, "RoleArn" -> o.roleArn.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "State" -> o.state.asJson, "Description" -> o.description.asJson)
  }
  final implicit val PutEventsResponseEncoder: io.circe.Encoder[avias.events.models.PutEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEntryCount" -> o.failedEntryCount.asJson, "Entries" -> o.entries.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.events.models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableRuleRequestEncoder: io.circe.Encoder[avias.events.models.EnableRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DeleteRuleRequestEncoder: io.circe.Encoder[avias.events.models.DeleteRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val TestEventPatternRequestEncoder: io.circe.Encoder[avias.events.models.TestEventPatternRequest] = io.circe.Encoder.instance { o => 
    Json.obj("EventPattern" -> o.eventPattern.asJson, "Event" -> o.event.asJson)
  }
  final implicit val RunCommandTargetEncoder: io.circe.Encoder[avias.events.models.RunCommandTarget] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val ListRulesRequestEncoder: io.circe.Encoder[avias.events.models.ListRulesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NamePrefix" -> o.namePrefix.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeEventBusRequestEncoder: io.circe.Encoder[avias.events.models.DescribeEventBusRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RunCommandParametersEncoder: io.circe.Encoder[avias.events.models.RunCommandParameters] = io.circe.Encoder.instance { o => 
    Json.obj("RunCommandTargets" -> o.runCommandTargets.asJson)
  }
  final implicit val PolicyLengthExceededExceptionEncoder: io.circe.Encoder[avias.events.models.PolicyLengthExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventBusResponseEncoder: io.circe.Encoder[avias.events.models.DescribeEventBusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Arn" -> o.arn.asJson, "Policy" -> o.policy.asJson)
  }
  final implicit val PutRuleResponseEncoder: io.circe.Encoder[avias.events.models.PutRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("RuleArn" -> o.ruleArn.asJson)
  }
  final implicit val DescribeRuleResponseEncoder: io.circe.Encoder[avias.events.models.DescribeRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EventPattern" -> o.eventPattern.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "RoleArn" -> o.roleArn.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "State" -> o.state.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TestEventPatternResponseEncoder: io.circe.Encoder[avias.events.models.TestEventPatternResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Result" -> o.result.asJson)
  }
  final implicit val RemoveTargetsRequestEncoder: io.circe.Encoder[avias.events.models.RemoveTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Rule" -> o.rule.asJson, "Ids" -> o.ids.asJson)
  }
  final implicit val DescribeRuleRequestEncoder: io.circe.Encoder[avias.events.models.DescribeRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val ListRuleNamesByTargetResponseEncoder: io.circe.Encoder[avias.events.models.ListRuleNamesByTargetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("RuleNames" -> o.ruleNames.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.events.models.ConcurrentModificationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTargetsResultEntryEncoder: io.circe.Encoder[avias.events.models.RemoveTargetsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.events.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DisableRuleRequestEncoder: io.circe.Encoder[avias.events.models.DisableRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val ListRulesResponseEncoder: io.circe.Encoder[avias.events.models.ListRulesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Rules" -> o.rules.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidEventPatternExceptionEncoder: io.circe.Encoder[avias.events.models.InvalidEventPatternException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutEventsRequestEncoder: io.circe.Encoder[avias.events.models.PutEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Entries" -> o.entries.asJson)
  }
  final implicit val ListTargetsByRuleRequestEncoder: io.circe.Encoder[avias.events.models.ListTargetsByRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Rule" -> o.rule.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val TargetEncoder: io.circe.Encoder[avias.events.models.Target] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "Id" -> o.id.asJson, "RunCommandParameters" -> o.runCommandParameters.asJson, "Input" -> o.input.asJson, "RoleArn" -> o.roleArn.asJson, "InputPath" -> o.inputPath.asJson, "EcsParameters" -> o.ecsParameters.asJson, "InputTransformer" -> o.inputTransformer.asJson, "KinesisParameters" -> o.kinesisParameters.asJson)
  }
  final implicit val RuleEncoder: io.circe.Encoder[avias.events.models.Rule] = io.circe.Encoder.instance { o => 
    Json.obj("EventPattern" -> o.eventPattern.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "RoleArn" -> o.roleArn.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "State" -> o.state.asJson, "Description" -> o.description.asJson)
  }
  final implicit val PutEventsRequestEntryEncoder: io.circe.Encoder[avias.events.models.PutEventsRequestEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Time" -> o.time.asJson, "Source" -> o.source.asJson, "DetailType" -> o.detailType.asJson, "Detail" -> o.detail.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val ListTargetsByRuleResponseEncoder: io.circe.Encoder[avias.events.models.ListTargetsByRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InternalExceptionEncoder: io.circe.Encoder[avias.events.models.InternalException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemovePermissionRequestEncoder: io.circe.Encoder[avias.events.models.RemovePermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StatementId" -> o.statementId.asJson)
  }
  final implicit val PutTargetsResultEntryEncoder: io.circe.Encoder[avias.events.models.PutTargetsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val PutTargetsRequestEncoder: io.circe.Encoder[avias.events.models.PutTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Rule" -> o.rule.asJson, "Targets" -> o.targets.asJson)
  }
  final implicit val PutPermissionRequestEncoder: io.circe.Encoder[avias.events.models.PutPermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Action" -> o.action.asJson, "Principal" -> o.principal.asJson, "StatementId" -> o.statementId.asJson)
  }
  final implicit val PutEventsResultEntryEncoder: io.circe.Encoder[avias.events.models.PutEventsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("EventId" -> o.eventId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val RemoveTargetsResponseEncoder: io.circe.Encoder[avias.events.models.RemoveTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEntryCount" -> o.failedEntryCount.asJson, "FailedEntries" -> o.failedEntries.asJson)
  }
  final implicit val EcsParametersEncoder: io.circe.Encoder[avias.events.models.EcsParameters] = io.circe.Encoder.instance { o => 
    Json.obj("TaskDefinitionArn" -> o.taskDefinitionArn.asJson, "TaskCount" -> o.taskCount.asJson)
  }
  final implicit val ListRuleNamesByTargetRequestEncoder: io.circe.Encoder[avias.events.models.ListRuleNamesByTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TargetArn" -> o.targetArn.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val InputTransformerEncoder: io.circe.Encoder[avias.events.models.InputTransformer] = io.circe.Encoder.instance { o => 
    Json.obj("InputTemplate" -> o.inputTemplate.asJson, "InputPathsMap" -> o.inputPathsMap.asJson)
  }
  final implicit val PutTargetsResponseEncoder: io.circe.Encoder[avias.events.models.PutTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEntryCount" -> o.failedEntryCount.asJson, "FailedEntries" -> o.failedEntries.asJson)
  }
  final implicit val KinesisParametersEncoder: io.circe.Encoder[avias.events.models.KinesisParameters] = io.circe.Encoder.instance { o => 
    Json.obj("PartitionKeyPath" -> o.partitionKeyPath.asJson)
  }
  final implicit val PutRuleRequestDecoder: io.circe.Decoder[avias.events.models.PutRuleRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("EventPattern"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.events.models.PutRuleRequest.apply _)
  }
  final implicit val PutEventsResponseDecoder: io.circe.Decoder[avias.events.models.PutEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("FailedEntryCount"), o.get[scala.Option[scala.List[avias.events.models.PutEventsResultEntry]]]("Entries")).mapN(avias.events.models.PutEventsResponse.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.events.models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.LimitExceededException)
  final implicit val EnableRuleRequestDecoder: io.circe.Decoder[avias.events.models.EnableRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.events.models.EnableRuleRequest.apply _)
  }
  final implicit val DeleteRuleRequestDecoder: io.circe.Decoder[avias.events.models.DeleteRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.events.models.DeleteRuleRequest.apply _)
  }
  final implicit val TestEventPatternRequestDecoder: io.circe.Decoder[avias.events.models.TestEventPatternRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EventPattern"), o.get[java.lang.String]("Event")).mapN(avias.events.models.TestEventPatternRequest.apply _)
  }
  final implicit val RunCommandTargetDecoder: io.circe.Decoder[avias.events.models.RunCommandTarget] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values")).mapN(avias.events.models.RunCommandTarget.apply _)
  }
  final implicit val ListRulesRequestDecoder: io.circe.Decoder[avias.events.models.ListRulesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NamePrefix"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.events.models.ListRulesRequest.apply _)
  }
  final implicit val DescribeEventBusRequestDecoder: io.circe.Decoder[avias.events.models.DescribeEventBusRequest.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.DescribeEventBusRequest)
  final implicit val RunCommandParametersDecoder: io.circe.Decoder[avias.events.models.RunCommandParameters] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.events.models.RunCommandTarget]]("RunCommandTargets").map(avias.events.models.RunCommandParameters.apply _)
  }
  final implicit val PolicyLengthExceededExceptionDecoder: io.circe.Decoder[avias.events.models.PolicyLengthExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.PolicyLengthExceededException)
  final implicit val DescribeEventBusResponseDecoder: io.circe.Decoder[avias.events.models.DescribeEventBusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Policy")).mapN(avias.events.models.DescribeEventBusResponse.apply _)
  }
  final implicit val PutRuleResponseDecoder: io.circe.Decoder[avias.events.models.PutRuleResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("RuleArn").map(avias.events.models.PutRuleResponse.apply _)
  }
  final implicit val DescribeRuleResponseDecoder: io.circe.Decoder[avias.events.models.DescribeRuleResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventPattern"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.events.models.DescribeRuleResponse.apply _)
  }
  final implicit val TestEventPatternResponseDecoder: io.circe.Decoder[avias.events.models.TestEventPatternResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("Result").map(avias.events.models.TestEventPatternResponse.apply _)
  }
  final implicit val RemoveTargetsRequestDecoder: io.circe.Decoder[avias.events.models.RemoveTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Rule"), o.get[scala.List[java.lang.String]]("Ids")).mapN(avias.events.models.RemoveTargetsRequest.apply _)
  }
  final implicit val DescribeRuleRequestDecoder: io.circe.Decoder[avias.events.models.DescribeRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.events.models.DescribeRuleRequest.apply _)
  }
  final implicit val ListRuleNamesByTargetResponseDecoder: io.circe.Decoder[avias.events.models.ListRuleNamesByTargetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("RuleNames"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.events.models.ListRuleNamesByTargetResponse.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.events.models.ConcurrentModificationException.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.ConcurrentModificationException)
  final implicit val RemoveTargetsResultEntryDecoder: io.circe.Decoder[avias.events.models.RemoveTargetsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.events.models.RemoveTargetsResultEntry.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.events.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.ResourceNotFoundException)
  final implicit val DisableRuleRequestDecoder: io.circe.Decoder[avias.events.models.DisableRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.events.models.DisableRuleRequest.apply _)
  }
  final implicit val ListRulesResponseDecoder: io.circe.Decoder[avias.events.models.ListRulesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.events.models.Rule]]]("Rules"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.events.models.ListRulesResponse.apply _)
  }
  final implicit val InvalidEventPatternExceptionDecoder: io.circe.Decoder[avias.events.models.InvalidEventPatternException.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.InvalidEventPatternException)
  final implicit val PutEventsRequestDecoder: io.circe.Decoder[avias.events.models.PutEventsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.events.models.PutEventsRequestEntry]]("Entries").map(avias.events.models.PutEventsRequest.apply _)
  }
  final implicit val ListTargetsByRuleRequestDecoder: io.circe.Decoder[avias.events.models.ListTargetsByRuleRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Rule"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.events.models.ListTargetsByRuleRequest.apply _)
  }
  final implicit val TargetDecoder: io.circe.Decoder[avias.events.models.Target] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Arn"), o.get[java.lang.String]("Id"), o.get[scala.Option[avias.events.models.RunCommandParameters]]("RunCommandParameters"), o.get[scala.Option[java.lang.String]]("Input"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("InputPath"), o.get[scala.Option[avias.events.models.EcsParameters]]("EcsParameters"), o.get[scala.Option[avias.events.models.InputTransformer]]("InputTransformer"), o.get[scala.Option[avias.events.models.KinesisParameters]]("KinesisParameters")).mapN(avias.events.models.Target.apply _)
  }
  final implicit val RuleDecoder: io.circe.Decoder[avias.events.models.Rule] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventPattern"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.events.models.Rule.apply _)
  }
  final implicit val PutEventsRequestEntryDecoder: io.circe.Decoder[avias.events.models.PutEventsRequestEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("Time"), o.get[scala.Option[java.lang.String]]("Source"), o.get[scala.Option[java.lang.String]]("DetailType"), o.get[scala.Option[java.lang.String]]("Detail"), o.get[scala.Option[scala.List[java.lang.String]]]("Resources")).mapN(avias.events.models.PutEventsRequestEntry.apply _)
  }
  final implicit val ListTargetsByRuleResponseDecoder: io.circe.Decoder[avias.events.models.ListTargetsByRuleResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.events.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.events.models.ListTargetsByRuleResponse.apply _)
  }
  final implicit val InternalExceptionDecoder: io.circe.Decoder[avias.events.models.InternalException.type] = io.circe.Decoder.decodeUnit.as(avias.events.models.InternalException)
  final implicit val RemovePermissionRequestDecoder: io.circe.Decoder[avias.events.models.RemovePermissionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StatementId").map(avias.events.models.RemovePermissionRequest.apply _)
  }
  final implicit val PutTargetsResultEntryDecoder: io.circe.Decoder[avias.events.models.PutTargetsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.events.models.PutTargetsResultEntry.apply _)
  }
  final implicit val PutTargetsRequestDecoder: io.circe.Decoder[avias.events.models.PutTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Rule"), o.get[scala.List[avias.events.models.Target]]("Targets")).mapN(avias.events.models.PutTargetsRequest.apply _)
  }
  final implicit val PutPermissionRequestDecoder: io.circe.Decoder[avias.events.models.PutPermissionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Action"), o.get[java.lang.String]("Principal"), o.get[java.lang.String]("StatementId")).mapN(avias.events.models.PutPermissionRequest.apply _)
  }
  final implicit val PutEventsResultEntryDecoder: io.circe.Decoder[avias.events.models.PutEventsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.events.models.PutEventsResultEntry.apply _)
  }
  final implicit val RemoveTargetsResponseDecoder: io.circe.Decoder[avias.events.models.RemoveTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("FailedEntryCount"), o.get[scala.Option[scala.List[avias.events.models.RemoveTargetsResultEntry]]]("FailedEntries")).mapN(avias.events.models.RemoveTargetsResponse.apply _)
  }
  final implicit val EcsParametersDecoder: io.circe.Decoder[avias.events.models.EcsParameters] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TaskDefinitionArn"), o.get[scala.Option[scala.Int]]("TaskCount")).mapN(avias.events.models.EcsParameters.apply _)
  }
  final implicit val ListRuleNamesByTargetRequestDecoder: io.circe.Decoder[avias.events.models.ListRuleNamesByTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetArn"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.events.models.ListRuleNamesByTargetRequest.apply _)
  }
  final implicit val InputTransformerDecoder: io.circe.Decoder[avias.events.models.InputTransformer] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InputTemplate"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("InputPathsMap")).mapN(avias.events.models.InputTransformer.apply _)
  }
  final implicit val PutTargetsResponseDecoder: io.circe.Decoder[avias.events.models.PutTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("FailedEntryCount"), o.get[scala.Option[scala.List[avias.events.models.PutTargetsResultEntry]]]("FailedEntries")).mapN(avias.events.models.PutTargetsResponse.apply _)
  }
  final implicit val KinesisParametersDecoder: io.circe.Decoder[avias.events.models.KinesisParameters] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PartitionKeyPath").map(avias.events.models.KinesisParameters.apply _)
  }
}