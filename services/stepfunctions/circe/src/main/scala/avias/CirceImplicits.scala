package avias.stepfunctions
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteActivityInputEncoder: io.circe.Encoder[avias.stepfunctions.models.DeleteActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson)
  }
  final implicit val DescribeActivityInputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson)
  }
  final implicit val InvalidArnEncoder: io.circe.Encoder[avias.stepfunctions.models.InvalidArn] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteStateMachineInputEncoder: io.circe.Encoder[avias.stepfunctions.models.DeleteStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson)
  }
  final implicit val SendTaskHeartbeatInputEncoder: io.circe.Encoder[avias.stepfunctions.models.SendTaskHeartbeatInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson)
  }
  final implicit val ExecutionLimitExceededEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SendTaskFailureInputEncoder: io.circe.Encoder[avias.stepfunctions.models.SendTaskFailureInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val InvalidNameEncoder: io.circe.Encoder[avias.stepfunctions.models.InvalidName] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateActivityOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.CreateActivityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val SendTaskSuccessOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.SendTaskSuccessOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TaskTimedOutEncoder: io.circe.Encoder[avias.stepfunctions.models.TaskTimedOut] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StopExecutionInputEncoder: io.circe.Encoder[avias.stepfunctions.models.StopExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val LambdaFunctionTimedOutEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.LambdaFunctionTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StateMachineLimitExceededEncoder: io.circe.Encoder[avias.stepfunctions.models.StateMachineLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExecutionStartedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionStartedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("input" -> o.input.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val ExecutionFailedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ExecutionTimedOutEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StartExecutionOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.StartExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "startDate" -> o.startDate.asJson)
  }
  final implicit val LambdaFunctionScheduleFailedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val DescribeStateMachineOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "creationDate" -> o.creationDate.asJson, "name" -> o.name.asJson, "definition" -> o.definition.asJson, "status" -> o.status.asJson)
  }
  final implicit val InvalidTokenEncoder: io.circe.Encoder[avias.stepfunctions.models.InvalidToken] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeExecutionOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "stateMachineArn" -> o.stateMachineArn.asJson, "startDate" -> o.startDate.asJson, "status" -> o.status.asJson, "input" -> o.input.asJson, "stopDate" -> o.stopDate.asJson, "name" -> o.name.asJson, "output" -> o.output.asJson)
  }
  final implicit val ActivityListItemEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityListItem] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val DescribeStateMachineForExecutionInputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeStateMachineForExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson)
  }
  final implicit val LambdaFunctionStartFailedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.LambdaFunctionStartFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val GetExecutionHistoryOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.GetExecutionHistoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidDefinitionEncoder: io.circe.Encoder[avias.stepfunctions.models.InvalidDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExecutionAbortedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionAbortedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val TaskDoesNotExistEncoder: io.circe.Encoder[avias.stepfunctions.models.TaskDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StateMachineDoesNotExistEncoder: io.circe.Encoder[avias.stepfunctions.models.StateMachineDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StateMachineDeletingEncoder: io.circe.Encoder[avias.stepfunctions.models.StateMachineDeleting] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateStateMachineOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.UpdateStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("updateDate" -> o.updateDate.asJson)
  }
  final implicit val ExecutionDoesNotExistEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidExecutionInputEncoder: io.circe.Encoder[avias.stepfunctions.models.InvalidExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivityScheduledEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityScheduledEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("resource" -> o.resource.asJson, "input" -> o.input.asJson, "timeoutInSeconds" -> o.timeoutInSeconds.asJson, "heartbeatInSeconds" -> o.heartbeatInSeconds.asJson)
  }
  final implicit val CreateStateMachineOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.CreateStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val ListActivitiesOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.ListActivitiesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activities" -> o.activities.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ActivityWorkerLimitExceededEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityWorkerLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateStateMachineInputEncoder: io.circe.Encoder[avias.stepfunctions.models.UpdateStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "definition" -> o.definition.asJson)
  }
  final implicit val ActivityFailedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ListStateMachinesInputEncoder: io.circe.Encoder[avias.stepfunctions.models.ListStateMachinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateStateMachineInputEncoder: io.circe.Encoder[avias.stepfunctions.models.CreateStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "definition" -> o.definition.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val ExecutionAlreadyExistsEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MissingRequiredParameterEncoder: io.circe.Encoder[avias.stepfunctions.models.MissingRequiredParameter] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SendTaskFailureOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.SendTaskFailureOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LambdaFunctionFailedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.LambdaFunctionFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ActivityScheduleFailedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityScheduleFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StartExecutionInputEncoder: io.circe.Encoder[avias.stepfunctions.models.StartExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "input" -> o.input.asJson)
  }
  final implicit val DeleteActivityOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.DeleteActivityOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetActivityTaskInputEncoder: io.circe.Encoder[avias.stepfunctions.models.GetActivityTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "workerName" -> o.workerName.asJson)
  }
  final implicit val ActivityLimitExceededEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeActivityOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeActivityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val StopExecutionOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.StopExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stopDate" -> o.stopDate.asJson)
  }
  final implicit val InvalidOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.InvalidOutput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivitySucceededEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivitySucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val ActivityTimedOutEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StateMachineAlreadyExistsEncoder: io.circe.Encoder[avias.stepfunctions.models.StateMachineAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateActivityInputEncoder: io.circe.Encoder[avias.stepfunctions.models.CreateActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val SendTaskSuccessInputEncoder: io.circe.Encoder[avias.stepfunctions.models.SendTaskSuccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "output" -> o.output.asJson)
  }
  final implicit val ActivityDoesNotExistEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListExecutionsOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.ListExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executions" -> o.executions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StateExitedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.StateExitedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "output" -> o.output.asJson)
  }
  final implicit val DescribeStateMachineForExecutionOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeStateMachineForExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "name" -> o.name.asJson, "definition" -> o.definition.asJson, "updateDate" -> o.updateDate.asJson)
  }
  final implicit val DeleteStateMachineOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.DeleteStateMachineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListExecutionsInputEncoder: io.circe.Encoder[avias.stepfunctions.models.ListExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "statusFilter" -> o.statusFilter.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListActivitiesInputEncoder: io.circe.Encoder[avias.stepfunctions.models.ListActivitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetActivityTaskOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.GetActivityTaskOutput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "input" -> o.input.asJson)
  }
  final implicit val LambdaFunctionScheduledEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.LambdaFunctionScheduledEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("resource" -> o.resource.asJson, "input" -> o.input.asJson, "timeoutInSeconds" -> o.timeoutInSeconds.asJson)
  }
  final implicit val HistoryEventEncoder: io.circe.Encoder[avias.stepfunctions.models.HistoryEvent] = io.circe.Encoder.instance { o => 
    Json.obj("timestamp" -> o.timestamp.asJson, "id" -> o.id.asJson, "type" -> o.`type`.asJson, "lambdaFunctionTimedOutEventDetails" -> o.lambdaFunctionTimedOutEventDetails.asJson, "executionStartedEventDetails" -> o.executionStartedEventDetails.asJson, "executionFailedEventDetails" -> o.executionFailedEventDetails.asJson, "executionTimedOutEventDetails" -> o.executionTimedOutEventDetails.asJson, "lambdaFunctionScheduleFailedEventDetails" -> o.lambdaFunctionScheduleFailedEventDetails.asJson, "lambdaFunctionStartFailedEventDetails" -> o.lambdaFunctionStartFailedEventDetails.asJson, "executionAbortedEventDetails" -> o.executionAbortedEventDetails.asJson, "previousEventId" -> o.previousEventId.asJson, "activityScheduledEventDetails" -> o.activityScheduledEventDetails.asJson, "activityFailedEventDetails" -> o.activityFailedEventDetails.asJson, "lambdaFunctionFailedEventDetails" -> o.lambdaFunctionFailedEventDetails.asJson, "activityScheduleFailedEventDetails" -> o.activityScheduleFailedEventDetails.asJson, "activitySucceededEventDetails" -> o.activitySucceededEventDetails.asJson, "activityTimedOutEventDetails" -> o.activityTimedOutEventDetails.asJson, "stateExitedEventDetails" -> o.stateExitedEventDetails.asJson, "lambdaFunctionScheduledEventDetails" -> o.lambdaFunctionScheduledEventDetails.asJson, "executionSucceededEventDetails" -> o.executionSucceededEventDetails.asJson, "lambdaFunctionSucceededEventDetails" -> o.lambdaFunctionSucceededEventDetails.asJson, "stateEnteredEventDetails" -> o.stateEnteredEventDetails.asJson, "activityStartedEventDetails" -> o.activityStartedEventDetails.asJson)
  }
  final implicit val DescribeStateMachineInputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson)
  }
  final implicit val DescribeExecutionInputEncoder: io.circe.Encoder[avias.stepfunctions.models.DescribeExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson)
  }
  final implicit val ExecutionSucceededEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionSucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val SendTaskHeartbeatOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.SendTaskHeartbeatOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LambdaFunctionSucceededEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.LambdaFunctionSucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val StateEnteredEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.StateEnteredEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "input" -> o.input.asJson)
  }
  final implicit val StateMachineListItemEncoder: io.circe.Encoder[avias.stepfunctions.models.StateMachineListItem] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val ListStateMachinesOutputEncoder: io.circe.Encoder[avias.stepfunctions.models.ListStateMachinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachines" -> o.stateMachines.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ActivityStartedEventDetailsEncoder: io.circe.Encoder[avias.stepfunctions.models.ActivityStartedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("workerName" -> o.workerName.asJson)
  }
  final implicit val GetExecutionHistoryInputEncoder: io.circe.Encoder[avias.stepfunctions.models.GetExecutionHistoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "maxResults" -> o.maxResults.asJson, "reverseOrder" -> o.reverseOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ExecutionListItemEncoder: io.circe.Encoder[avias.stepfunctions.models.ExecutionListItem] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "status" -> o.status.asJson, "startDate" -> o.startDate.asJson, "stopDate" -> o.stopDate.asJson)
  }
  final implicit val DeleteActivityInputDecoder: io.circe.Decoder[avias.stepfunctions.models.DeleteActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityArn").map(avias.stepfunctions.models.DeleteActivityInput.apply _)
  }
  final implicit val DescribeActivityInputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityArn").map(avias.stepfunctions.models.DescribeActivityInput.apply _)
  }
  final implicit val InvalidArnDecoder: io.circe.Decoder[avias.stepfunctions.models.InvalidArn] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.InvalidArn.apply _)
  }
  final implicit val DeleteStateMachineInputDecoder: io.circe.Decoder[avias.stepfunctions.models.DeleteStateMachineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("stateMachineArn").map(avias.stepfunctions.models.DeleteStateMachineInput.apply _)
  }
  final implicit val SendTaskHeartbeatInputDecoder: io.circe.Decoder[avias.stepfunctions.models.SendTaskHeartbeatInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskToken").map(avias.stepfunctions.models.SendTaskHeartbeatInput.apply _)
  }
  final implicit val ExecutionLimitExceededDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.ExecutionLimitExceeded.apply _)
  }
  final implicit val SendTaskFailureInputDecoder: io.circe.Decoder[avias.stepfunctions.models.SendTaskFailureInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.SendTaskFailureInput.apply _)
  }
  final implicit val InvalidNameDecoder: io.circe.Decoder[avias.stepfunctions.models.InvalidName] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.InvalidName.apply _)
  }
  final implicit val CreateActivityOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.CreateActivityOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.time.Instant]("creationDate")).mapN(avias.stepfunctions.models.CreateActivityOutput.apply _)
  }
  final implicit val SendTaskSuccessOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.SendTaskSuccessOutput.type] = io.circe.Decoder.decodeUnit.as(avias.stepfunctions.models.SendTaskSuccessOutput)
  final implicit val TaskTimedOutDecoder: io.circe.Decoder[avias.stepfunctions.models.TaskTimedOut] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.TaskTimedOut.apply _)
  }
  final implicit val StopExecutionInputDecoder: io.circe.Decoder[avias.stepfunctions.models.StopExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.StopExecutionInput.apply _)
  }
  final implicit val LambdaFunctionTimedOutEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.LambdaFunctionTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.LambdaFunctionTimedOutEventDetails.apply _)
  }
  final implicit val StateMachineLimitExceededDecoder: io.circe.Decoder[avias.stepfunctions.models.StateMachineLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.StateMachineLimitExceeded.apply _)
  }
  final implicit val ExecutionStartedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionStartedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("roleArn")).mapN(avias.stepfunctions.models.ExecutionStartedEventDetails.apply _)
  }
  final implicit val ExecutionFailedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.ExecutionFailedEventDetails.apply _)
  }
  final implicit val ExecutionTimedOutEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.ExecutionTimedOutEventDetails.apply _)
  }
  final implicit val StartExecutionOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.StartExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.time.Instant]("startDate")).mapN(avias.stepfunctions.models.StartExecutionOutput.apply _)
  }
  final implicit val LambdaFunctionScheduleFailedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails.apply _)
  }
  final implicit val DescribeStateMachineOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeStateMachineOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("roleArn"), o.get[java.time.Instant]("creationDate"), o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[scala.Option[java.lang.String]]("status")).mapN(avias.stepfunctions.models.DescribeStateMachineOutput.apply _)
  }
  final implicit val InvalidTokenDecoder: io.circe.Decoder[avias.stepfunctions.models.InvalidToken] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.InvalidToken.apply _)
  }
  final implicit val DescribeExecutionOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.lang.String]("stateMachineArn"), o.get[java.time.Instant]("startDate"), o.get[java.lang.String]("status"), o.get[java.lang.String]("input"), o.get[scala.Option[java.time.Instant]]("stopDate"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("output")).mapN(avias.stepfunctions.models.DescribeExecutionOutput.apply _)
  }
  final implicit val ActivityListItemDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(avias.stepfunctions.models.ActivityListItem.apply _)
  }
  final implicit val DescribeStateMachineForExecutionInputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeStateMachineForExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("executionArn").map(avias.stepfunctions.models.DescribeStateMachineForExecutionInput.apply _)
  }
  final implicit val LambdaFunctionStartFailedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.LambdaFunctionStartFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.LambdaFunctionStartFailedEventDetails.apply _)
  }
  final implicit val GetExecutionHistoryOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.GetExecutionHistoryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.stepfunctions.models.HistoryEvent]]("events"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.GetExecutionHistoryOutput.apply _)
  }
  final implicit val InvalidDefinitionDecoder: io.circe.Decoder[avias.stepfunctions.models.InvalidDefinition] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.InvalidDefinition.apply _)
  }
  final implicit val ExecutionAbortedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionAbortedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.ExecutionAbortedEventDetails.apply _)
  }
  final implicit val TaskDoesNotExistDecoder: io.circe.Decoder[avias.stepfunctions.models.TaskDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.TaskDoesNotExist.apply _)
  }
  final implicit val StateMachineDoesNotExistDecoder: io.circe.Decoder[avias.stepfunctions.models.StateMachineDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.StateMachineDoesNotExist.apply _)
  }
  final implicit val StateMachineDeletingDecoder: io.circe.Decoder[avias.stepfunctions.models.StateMachineDeleting] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.StateMachineDeleting.apply _)
  }
  final implicit val UpdateStateMachineOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.UpdateStateMachineOutput] = io.circe.Decoder.instance { o => 
    o.get[java.time.Instant]("updateDate").map(avias.stepfunctions.models.UpdateStateMachineOutput.apply _)
  }
  final implicit val ExecutionDoesNotExistDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.ExecutionDoesNotExist.apply _)
  }
  final implicit val InvalidExecutionInputDecoder: io.circe.Decoder[avias.stepfunctions.models.InvalidExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.InvalidExecutionInput.apply _)
  }
  final implicit val ActivityScheduledEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityScheduledEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resource"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[scala.Long]]("timeoutInSeconds"), o.get[scala.Option[scala.Long]]("heartbeatInSeconds")).mapN(avias.stepfunctions.models.ActivityScheduledEventDetails.apply _)
  }
  final implicit val CreateStateMachineOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.CreateStateMachineOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.time.Instant]("creationDate")).mapN(avias.stepfunctions.models.CreateStateMachineOutput.apply _)
  }
  final implicit val ListActivitiesOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.ListActivitiesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.stepfunctions.models.ActivityListItem]]("activities"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.ListActivitiesOutput.apply _)
  }
  final implicit val ActivityWorkerLimitExceededDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityWorkerLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.ActivityWorkerLimitExceeded.apply _)
  }
  final implicit val UpdateStateMachineInputDecoder: io.circe.Decoder[avias.stepfunctions.models.UpdateStateMachineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("definition")).mapN(avias.stepfunctions.models.UpdateStateMachineInput.apply _)
  }
  final implicit val ActivityFailedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.ActivityFailedEventDetails.apply _)
  }
  final implicit val ListStateMachinesInputDecoder: io.circe.Decoder[avias.stepfunctions.models.ListStateMachinesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.ListStateMachinesInput.apply _)
  }
  final implicit val CreateStateMachineInputDecoder: io.circe.Decoder[avias.stepfunctions.models.CreateStateMachineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[java.lang.String]("roleArn")).mapN(avias.stepfunctions.models.CreateStateMachineInput.apply _)
  }
  final implicit val ExecutionAlreadyExistsDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.ExecutionAlreadyExists.apply _)
  }
  final implicit val MissingRequiredParameterDecoder: io.circe.Decoder[avias.stepfunctions.models.MissingRequiredParameter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.MissingRequiredParameter.apply _)
  }
  final implicit val SendTaskFailureOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.SendTaskFailureOutput.type] = io.circe.Decoder.decodeUnit.as(avias.stepfunctions.models.SendTaskFailureOutput)
  final implicit val LambdaFunctionFailedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.LambdaFunctionFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.LambdaFunctionFailedEventDetails.apply _)
  }
  final implicit val ActivityScheduleFailedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityScheduleFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.ActivityScheduleFailedEventDetails.apply _)
  }
  final implicit val StartExecutionInputDecoder: io.circe.Decoder[avias.stepfunctions.models.StartExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("input")).mapN(avias.stepfunctions.models.StartExecutionInput.apply _)
  }
  final implicit val DeleteActivityOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.DeleteActivityOutput.type] = io.circe.Decoder.decodeUnit.as(avias.stepfunctions.models.DeleteActivityOutput)
  final implicit val GetActivityTaskInputDecoder: io.circe.Decoder[avias.stepfunctions.models.GetActivityTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[scala.Option[java.lang.String]]("workerName")).mapN(avias.stepfunctions.models.GetActivityTaskInput.apply _)
  }
  final implicit val ActivityLimitExceededDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.ActivityLimitExceeded.apply _)
  }
  final implicit val DescribeActivityOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeActivityOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(avias.stepfunctions.models.DescribeActivityOutput.apply _)
  }
  final implicit val StopExecutionOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.StopExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[java.time.Instant]("stopDate").map(avias.stepfunctions.models.StopExecutionOutput.apply _)
  }
  final implicit val InvalidOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.InvalidOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.InvalidOutput.apply _)
  }
  final implicit val ActivitySucceededEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivitySucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(avias.stepfunctions.models.ActivitySucceededEventDetails.apply _)
  }
  final implicit val ActivityTimedOutEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(avias.stepfunctions.models.ActivityTimedOutEventDetails.apply _)
  }
  final implicit val StateMachineAlreadyExistsDecoder: io.circe.Decoder[avias.stepfunctions.models.StateMachineAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.StateMachineAlreadyExists.apply _)
  }
  final implicit val CreateActivityInputDecoder: io.circe.Decoder[avias.stepfunctions.models.CreateActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(avias.stepfunctions.models.CreateActivityInput.apply _)
  }
  final implicit val SendTaskSuccessInputDecoder: io.circe.Decoder[avias.stepfunctions.models.SendTaskSuccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[java.lang.String]("output")).mapN(avias.stepfunctions.models.SendTaskSuccessInput.apply _)
  }
  final implicit val ActivityDoesNotExistDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.stepfunctions.models.ActivityDoesNotExist.apply _)
  }
  final implicit val ListExecutionsOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.ListExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.stepfunctions.models.ExecutionListItem]]("executions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.ListExecutionsOutput.apply _)
  }
  final implicit val StateExitedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.StateExitedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("output")).mapN(avias.stepfunctions.models.StateExitedEventDetails.apply _)
  }
  final implicit val DescribeStateMachineForExecutionOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeStateMachineForExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("roleArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[java.time.Instant]("updateDate")).mapN(avias.stepfunctions.models.DescribeStateMachineForExecutionOutput.apply _)
  }
  final implicit val DeleteStateMachineOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.DeleteStateMachineOutput.type] = io.circe.Decoder.decodeUnit.as(avias.stepfunctions.models.DeleteStateMachineOutput)
  final implicit val ListExecutionsInputDecoder: io.circe.Decoder[avias.stepfunctions.models.ListExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("statusFilter"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.ListExecutionsInput.apply _)
  }
  final implicit val ListActivitiesInputDecoder: io.circe.Decoder[avias.stepfunctions.models.ListActivitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.ListActivitiesInput.apply _)
  }
  final implicit val GetActivityTaskOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.GetActivityTaskOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskToken"), o.get[scala.Option[java.lang.String]]("input")).mapN(avias.stepfunctions.models.GetActivityTaskOutput.apply _)
  }
  final implicit val LambdaFunctionScheduledEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.LambdaFunctionScheduledEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resource"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[scala.Long]]("timeoutInSeconds")).mapN(avias.stepfunctions.models.LambdaFunctionScheduledEventDetails.apply _)
  }
  final implicit val HistoryEventDecoder: io.circe.Decoder[avias.stepfunctions.models.HistoryEvent] = io.circe.Decoder.instance { o => 
    for (`timestamp` <- o.get[java.time.Instant]("timestamp"); `id` <- o.get[scala.Long]("id"); `type` <- o.get[java.lang.String]("type"); `lambdaFunctionTimedOutEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.LambdaFunctionTimedOutEventDetails]]("lambdaFunctionTimedOutEventDetails"); `executionStartedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ExecutionStartedEventDetails]]("executionStartedEventDetails"); `executionFailedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ExecutionFailedEventDetails]]("executionFailedEventDetails"); `executionTimedOutEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ExecutionTimedOutEventDetails]]("executionTimedOutEventDetails"); `lambdaFunctionScheduleFailedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails]]("lambdaFunctionScheduleFailedEventDetails"); `lambdaFunctionStartFailedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.LambdaFunctionStartFailedEventDetails]]("lambdaFunctionStartFailedEventDetails"); `executionAbortedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ExecutionAbortedEventDetails]]("executionAbortedEventDetails"); `previousEventId` <- o.get[scala.Option[scala.Long]]("previousEventId"); `activityScheduledEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ActivityScheduledEventDetails]]("activityScheduledEventDetails"); `activityFailedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ActivityFailedEventDetails]]("activityFailedEventDetails"); `lambdaFunctionFailedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.LambdaFunctionFailedEventDetails]]("lambdaFunctionFailedEventDetails"); `activityScheduleFailedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ActivityScheduleFailedEventDetails]]("activityScheduleFailedEventDetails"); `activitySucceededEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ActivitySucceededEventDetails]]("activitySucceededEventDetails"); `activityTimedOutEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ActivityTimedOutEventDetails]]("activityTimedOutEventDetails"); `stateExitedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.StateExitedEventDetails]]("stateExitedEventDetails"); `lambdaFunctionScheduledEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.LambdaFunctionScheduledEventDetails]]("lambdaFunctionScheduledEventDetails"); `executionSucceededEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ExecutionSucceededEventDetails]]("executionSucceededEventDetails"); `lambdaFunctionSucceededEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.LambdaFunctionSucceededEventDetails]]("lambdaFunctionSucceededEventDetails"); `stateEnteredEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.StateEnteredEventDetails]]("stateEnteredEventDetails"); `activityStartedEventDetails` <- o.get[scala.Option[avias.stepfunctions.models.ActivityStartedEventDetails]]("activityStartedEventDetails")) yield avias.stepfunctions.models.HistoryEvent(timestamp, id, `type`, lambdaFunctionTimedOutEventDetails, executionStartedEventDetails, executionFailedEventDetails, executionTimedOutEventDetails, lambdaFunctionScheduleFailedEventDetails, lambdaFunctionStartFailedEventDetails, executionAbortedEventDetails, previousEventId, activityScheduledEventDetails, activityFailedEventDetails, lambdaFunctionFailedEventDetails, activityScheduleFailedEventDetails, activitySucceededEventDetails, activityTimedOutEventDetails, stateExitedEventDetails, lambdaFunctionScheduledEventDetails, executionSucceededEventDetails, lambdaFunctionSucceededEventDetails, stateEnteredEventDetails, activityStartedEventDetails)
  }
  final implicit val DescribeStateMachineInputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeStateMachineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("stateMachineArn").map(avias.stepfunctions.models.DescribeStateMachineInput.apply _)
  }
  final implicit val DescribeExecutionInputDecoder: io.circe.Decoder[avias.stepfunctions.models.DescribeExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("executionArn").map(avias.stepfunctions.models.DescribeExecutionInput.apply _)
  }
  final implicit val ExecutionSucceededEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionSucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(avias.stepfunctions.models.ExecutionSucceededEventDetails.apply _)
  }
  final implicit val SendTaskHeartbeatOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.SendTaskHeartbeatOutput.type] = io.circe.Decoder.decodeUnit.as(avias.stepfunctions.models.SendTaskHeartbeatOutput)
  final implicit val LambdaFunctionSucceededEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.LambdaFunctionSucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(avias.stepfunctions.models.LambdaFunctionSucceededEventDetails.apply _)
  }
  final implicit val StateEnteredEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.StateEnteredEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("input")).mapN(avias.stepfunctions.models.StateEnteredEventDetails.apply _)
  }
  final implicit val StateMachineListItemDecoder: io.circe.Decoder[avias.stepfunctions.models.StateMachineListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(avias.stepfunctions.models.StateMachineListItem.apply _)
  }
  final implicit val ListStateMachinesOutputDecoder: io.circe.Decoder[avias.stepfunctions.models.ListStateMachinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.stepfunctions.models.StateMachineListItem]]("stateMachines"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.ListStateMachinesOutput.apply _)
  }
  final implicit val ActivityStartedEventDetailsDecoder: io.circe.Decoder[avias.stepfunctions.models.ActivityStartedEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("workerName").map(avias.stepfunctions.models.ActivityStartedEventDetails.apply _)
  }
  final implicit val GetExecutionHistoryInputDecoder: io.circe.Decoder[avias.stepfunctions.models.GetExecutionHistoryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.stepfunctions.models.GetExecutionHistoryInput.apply _)
  }
  final implicit val ExecutionListItemDecoder: io.circe.Decoder[avias.stepfunctions.models.ExecutionListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("status"), o.get[java.time.Instant]("startDate"), o.get[scala.Option[java.time.Instant]]("stopDate")).mapN(avias.stepfunctions.models.ExecutionListItem.apply _)
  }
}