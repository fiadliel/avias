package org.lyranthe.araethura.stepfunctions
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteActivityInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DeleteActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson)
  }
  final implicit val DescribeActivityInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson)
  }
  final implicit val InvalidArnEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.InvalidArn] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteStateMachineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DeleteStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson)
  }
  final implicit val SendTaskHeartbeatInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.SendTaskHeartbeatInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson)
  }
  final implicit val ExecutionLimitExceededEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SendTaskFailureInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.SendTaskFailureInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val InvalidNameEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.InvalidName] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateActivityOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.CreateActivityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val SendTaskSuccessOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.SendTaskSuccessOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TaskTimedOutEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.TaskTimedOut] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StopExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StopExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val LambdaFunctionTimedOutEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StateMachineLimitExceededEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateMachineLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExecutionStartedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionStartedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("input" -> o.input.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val ExecutionFailedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ExecutionTimedOutEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StartExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StartExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "startDate" -> o.startDate.asJson)
  }
  final implicit val LambdaFunctionScheduleFailedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val DescribeStateMachineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "creationDate" -> o.creationDate.asJson, "name" -> o.name.asJson, "definition" -> o.definition.asJson, "status" -> o.status.asJson)
  }
  final implicit val InvalidTokenEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.InvalidToken] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "stateMachineArn" -> o.stateMachineArn.asJson, "startDate" -> o.startDate.asJson, "status" -> o.status.asJson, "input" -> o.input.asJson, "stopDate" -> o.stopDate.asJson, "name" -> o.name.asJson, "output" -> o.output.asJson)
  }
  final implicit val ActivityListItemEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityListItem] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val DescribeStateMachineForExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineForExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson)
  }
  final implicit val LambdaFunctionStartFailedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionStartFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val GetExecutionHistoryOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.GetExecutionHistoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidDefinitionEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.InvalidDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExecutionAbortedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionAbortedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val TaskDoesNotExistEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.TaskDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StateMachineDoesNotExistEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateMachineDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StateMachineDeletingEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateMachineDeleting] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateStateMachineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.UpdateStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("updateDate" -> o.updateDate.asJson)
  }
  final implicit val ExecutionDoesNotExistEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.InvalidExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivityScheduledEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityScheduledEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("resource" -> o.resource.asJson, "input" -> o.input.asJson, "timeoutInSeconds" -> o.timeoutInSeconds.asJson, "heartbeatInSeconds" -> o.heartbeatInSeconds.asJson)
  }
  final implicit val CreateStateMachineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.CreateStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val ListActivitiesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ListActivitiesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activities" -> o.activities.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ActivityWorkerLimitExceededEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityWorkerLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateStateMachineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.UpdateStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "definition" -> o.definition.asJson)
  }
  final implicit val ActivityFailedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ListStateMachinesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ListStateMachinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateStateMachineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.CreateStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "definition" -> o.definition.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val ExecutionAlreadyExistsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MissingRequiredParameterEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.MissingRequiredParameter] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SendTaskFailureOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.SendTaskFailureOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LambdaFunctionFailedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ActivityScheduleFailedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityScheduleFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StartExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StartExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "input" -> o.input.asJson)
  }
  final implicit val DeleteActivityOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DeleteActivityOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetActivityTaskInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.GetActivityTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "workerName" -> o.workerName.asJson)
  }
  final implicit val ActivityLimitExceededEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeActivityOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeActivityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val StopExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StopExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stopDate" -> o.stopDate.asJson)
  }
  final implicit val InvalidOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.InvalidOutput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivitySucceededEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivitySucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val ActivityTimedOutEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StateMachineAlreadyExistsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateMachineAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateActivityInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.CreateActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val SendTaskSuccessInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.SendTaskSuccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "output" -> o.output.asJson)
  }
  final implicit val ActivityDoesNotExistEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListExecutionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ListExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executions" -> o.executions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StateExitedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateExitedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "output" -> o.output.asJson)
  }
  final implicit val DescribeStateMachineForExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineForExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "name" -> o.name.asJson, "definition" -> o.definition.asJson, "updateDate" -> o.updateDate.asJson)
  }
  final implicit val DeleteStateMachineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DeleteStateMachineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListExecutionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ListExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "statusFilter" -> o.statusFilter.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListActivitiesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ListActivitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetActivityTaskOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.GetActivityTaskOutput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "input" -> o.input.asJson)
  }
  final implicit val LambdaFunctionScheduledEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduledEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("resource" -> o.resource.asJson, "input" -> o.input.asJson, "timeoutInSeconds" -> o.timeoutInSeconds.asJson)
  }
  final implicit val HistoryEventEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.HistoryEvent] = io.circe.Encoder.instance { o => 
    Json.obj("timestamp" -> o.timestamp.asJson, "id" -> o.id.asJson, "type" -> o.`type`.asJson, "lambdaFunctionTimedOutEventDetails" -> o.lambdaFunctionTimedOutEventDetails.asJson, "executionStartedEventDetails" -> o.executionStartedEventDetails.asJson, "executionFailedEventDetails" -> o.executionFailedEventDetails.asJson, "executionTimedOutEventDetails" -> o.executionTimedOutEventDetails.asJson, "lambdaFunctionScheduleFailedEventDetails" -> o.lambdaFunctionScheduleFailedEventDetails.asJson, "lambdaFunctionStartFailedEventDetails" -> o.lambdaFunctionStartFailedEventDetails.asJson, "executionAbortedEventDetails" -> o.executionAbortedEventDetails.asJson, "previousEventId" -> o.previousEventId.asJson, "activityScheduledEventDetails" -> o.activityScheduledEventDetails.asJson, "activityFailedEventDetails" -> o.activityFailedEventDetails.asJson, "lambdaFunctionFailedEventDetails" -> o.lambdaFunctionFailedEventDetails.asJson, "activityScheduleFailedEventDetails" -> o.activityScheduleFailedEventDetails.asJson, "activitySucceededEventDetails" -> o.activitySucceededEventDetails.asJson, "activityTimedOutEventDetails" -> o.activityTimedOutEventDetails.asJson, "stateExitedEventDetails" -> o.stateExitedEventDetails.asJson, "lambdaFunctionScheduledEventDetails" -> o.lambdaFunctionScheduledEventDetails.asJson, "executionSucceededEventDetails" -> o.executionSucceededEventDetails.asJson, "lambdaFunctionSucceededEventDetails" -> o.lambdaFunctionSucceededEventDetails.asJson, "stateEnteredEventDetails" -> o.stateEnteredEventDetails.asJson, "activityStartedEventDetails" -> o.activityStartedEventDetails.asJson)
  }
  final implicit val DescribeStateMachineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson)
  }
  final implicit val DescribeExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.DescribeExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson)
  }
  final implicit val ExecutionSucceededEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionSucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val SendTaskHeartbeatOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.SendTaskHeartbeatOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LambdaFunctionSucceededEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionSucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val StateEnteredEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateEnteredEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "input" -> o.input.asJson)
  }
  final implicit val StateMachineListItemEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.StateMachineListItem] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val ListStateMachinesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ListStateMachinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachines" -> o.stateMachines.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ActivityStartedEventDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ActivityStartedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("workerName" -> o.workerName.asJson)
  }
  final implicit val GetExecutionHistoryInputEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.GetExecutionHistoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "maxResults" -> o.maxResults.asJson, "reverseOrder" -> o.reverseOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ExecutionListItemEncoder: io.circe.Encoder[org.lyranthe.araethura.stepfunctions.models.ExecutionListItem] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "status" -> o.status.asJson, "startDate" -> o.startDate.asJson, "stopDate" -> o.stopDate.asJson)
  }
  final implicit val DeleteActivityInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DeleteActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityArn").map(org.lyranthe.araethura.stepfunctions.models.DeleteActivityInput.apply _)
  }
  final implicit val DescribeActivityInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityArn").map(org.lyranthe.araethura.stepfunctions.models.DescribeActivityInput.apply _)
  }
  final implicit val InvalidArnDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.InvalidArn] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.InvalidArn.apply _)
  }
  final implicit val DeleteStateMachineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DeleteStateMachineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("stateMachineArn").map(org.lyranthe.araethura.stepfunctions.models.DeleteStateMachineInput.apply _)
  }
  final implicit val SendTaskHeartbeatInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.SendTaskHeartbeatInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskToken").map(org.lyranthe.araethura.stepfunctions.models.SendTaskHeartbeatInput.apply _)
  }
  final implicit val ExecutionLimitExceededDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.ExecutionLimitExceeded.apply _)
  }
  final implicit val SendTaskFailureInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.SendTaskFailureInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.SendTaskFailureInput.apply _)
  }
  final implicit val InvalidNameDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.InvalidName] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.InvalidName.apply _)
  }
  final implicit val CreateActivityOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.CreateActivityOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.time.Instant]("creationDate")).mapN(org.lyranthe.araethura.stepfunctions.models.CreateActivityOutput.apply _)
  }
  final implicit val SendTaskSuccessOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.SendTaskSuccessOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.stepfunctions.models.SendTaskSuccessOutput)
  final implicit val TaskTimedOutDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.TaskTimedOut] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.TaskTimedOut.apply _)
  }
  final implicit val StopExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StopExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.StopExecutionInput.apply _)
  }
  final implicit val LambdaFunctionTimedOutEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.LambdaFunctionTimedOutEventDetails.apply _)
  }
  final implicit val StateMachineLimitExceededDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateMachineLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.StateMachineLimitExceeded.apply _)
  }
  final implicit val ExecutionStartedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionStartedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("roleArn")).mapN(org.lyranthe.araethura.stepfunctions.models.ExecutionStartedEventDetails.apply _)
  }
  final implicit val ExecutionFailedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.ExecutionFailedEventDetails.apply _)
  }
  final implicit val ExecutionTimedOutEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.ExecutionTimedOutEventDetails.apply _)
  }
  final implicit val StartExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StartExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.time.Instant]("startDate")).mapN(org.lyranthe.araethura.stepfunctions.models.StartExecutionOutput.apply _)
  }
  final implicit val LambdaFunctionScheduleFailedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails.apply _)
  }
  final implicit val DescribeStateMachineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("roleArn"), o.get[java.time.Instant]("creationDate"), o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[scala.Option[java.lang.String]]("status")).mapN(org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineOutput.apply _)
  }
  final implicit val InvalidTokenDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.InvalidToken] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.InvalidToken.apply _)
  }
  final implicit val DescribeExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.lang.String]("stateMachineArn"), o.get[java.time.Instant]("startDate"), o.get[java.lang.String]("status"), o.get[java.lang.String]("input"), o.get[scala.Option[java.time.Instant]]("stopDate"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("output")).mapN(org.lyranthe.araethura.stepfunctions.models.DescribeExecutionOutput.apply _)
  }
  final implicit val ActivityListItemDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(org.lyranthe.araethura.stepfunctions.models.ActivityListItem.apply _)
  }
  final implicit val DescribeStateMachineForExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineForExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("executionArn").map(org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineForExecutionInput.apply _)
  }
  final implicit val LambdaFunctionStartFailedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionStartFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.LambdaFunctionStartFailedEventDetails.apply _)
  }
  final implicit val GetExecutionHistoryOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.GetExecutionHistoryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.stepfunctions.models.HistoryEvent]]("events"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.GetExecutionHistoryOutput.apply _)
  }
  final implicit val InvalidDefinitionDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.InvalidDefinition] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.InvalidDefinition.apply _)
  }
  final implicit val ExecutionAbortedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionAbortedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.ExecutionAbortedEventDetails.apply _)
  }
  final implicit val TaskDoesNotExistDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.TaskDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.TaskDoesNotExist.apply _)
  }
  final implicit val StateMachineDoesNotExistDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateMachineDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.StateMachineDoesNotExist.apply _)
  }
  final implicit val StateMachineDeletingDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateMachineDeleting] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.StateMachineDeleting.apply _)
  }
  final implicit val UpdateStateMachineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.UpdateStateMachineOutput] = io.circe.Decoder.instance { o => 
    o.get[java.time.Instant]("updateDate").map(org.lyranthe.araethura.stepfunctions.models.UpdateStateMachineOutput.apply _)
  }
  final implicit val ExecutionDoesNotExistDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.ExecutionDoesNotExist.apply _)
  }
  final implicit val InvalidExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.InvalidExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.InvalidExecutionInput.apply _)
  }
  final implicit val ActivityScheduledEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityScheduledEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resource"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[scala.Long]]("timeoutInSeconds"), o.get[scala.Option[scala.Long]]("heartbeatInSeconds")).mapN(org.lyranthe.araethura.stepfunctions.models.ActivityScheduledEventDetails.apply _)
  }
  final implicit val CreateStateMachineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.CreateStateMachineOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.time.Instant]("creationDate")).mapN(org.lyranthe.araethura.stepfunctions.models.CreateStateMachineOutput.apply _)
  }
  final implicit val ListActivitiesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ListActivitiesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.stepfunctions.models.ActivityListItem]]("activities"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.ListActivitiesOutput.apply _)
  }
  final implicit val ActivityWorkerLimitExceededDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityWorkerLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.ActivityWorkerLimitExceeded.apply _)
  }
  final implicit val UpdateStateMachineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.UpdateStateMachineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("definition")).mapN(org.lyranthe.araethura.stepfunctions.models.UpdateStateMachineInput.apply _)
  }
  final implicit val ActivityFailedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.ActivityFailedEventDetails.apply _)
  }
  final implicit val ListStateMachinesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ListStateMachinesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.ListStateMachinesInput.apply _)
  }
  final implicit val CreateStateMachineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.CreateStateMachineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[java.lang.String]("roleArn")).mapN(org.lyranthe.araethura.stepfunctions.models.CreateStateMachineInput.apply _)
  }
  final implicit val ExecutionAlreadyExistsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.ExecutionAlreadyExists.apply _)
  }
  final implicit val MissingRequiredParameterDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.MissingRequiredParameter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.MissingRequiredParameter.apply _)
  }
  final implicit val SendTaskFailureOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.SendTaskFailureOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.stepfunctions.models.SendTaskFailureOutput)
  final implicit val LambdaFunctionFailedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.LambdaFunctionFailedEventDetails.apply _)
  }
  final implicit val ActivityScheduleFailedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityScheduleFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.ActivityScheduleFailedEventDetails.apply _)
  }
  final implicit val StartExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StartExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("input")).mapN(org.lyranthe.araethura.stepfunctions.models.StartExecutionInput.apply _)
  }
  final implicit val DeleteActivityOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DeleteActivityOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.stepfunctions.models.DeleteActivityOutput)
  final implicit val GetActivityTaskInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.GetActivityTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[scala.Option[java.lang.String]]("workerName")).mapN(org.lyranthe.araethura.stepfunctions.models.GetActivityTaskInput.apply _)
  }
  final implicit val ActivityLimitExceededDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.ActivityLimitExceeded.apply _)
  }
  final implicit val DescribeActivityOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeActivityOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(org.lyranthe.araethura.stepfunctions.models.DescribeActivityOutput.apply _)
  }
  final implicit val StopExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StopExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[java.time.Instant]("stopDate").map(org.lyranthe.araethura.stepfunctions.models.StopExecutionOutput.apply _)
  }
  final implicit val InvalidOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.InvalidOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.InvalidOutput.apply _)
  }
  final implicit val ActivitySucceededEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivitySucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(org.lyranthe.araethura.stepfunctions.models.ActivitySucceededEventDetails.apply _)
  }
  final implicit val ActivityTimedOutEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(org.lyranthe.araethura.stepfunctions.models.ActivityTimedOutEventDetails.apply _)
  }
  final implicit val StateMachineAlreadyExistsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateMachineAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.StateMachineAlreadyExists.apply _)
  }
  final implicit val CreateActivityInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.CreateActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.stepfunctions.models.CreateActivityInput.apply _)
  }
  final implicit val SendTaskSuccessInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.SendTaskSuccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[java.lang.String]("output")).mapN(org.lyranthe.araethura.stepfunctions.models.SendTaskSuccessInput.apply _)
  }
  final implicit val ActivityDoesNotExistDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.stepfunctions.models.ActivityDoesNotExist.apply _)
  }
  final implicit val ListExecutionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ListExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.stepfunctions.models.ExecutionListItem]]("executions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.ListExecutionsOutput.apply _)
  }
  final implicit val StateExitedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateExitedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("output")).mapN(org.lyranthe.araethura.stepfunctions.models.StateExitedEventDetails.apply _)
  }
  final implicit val DescribeStateMachineForExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineForExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("roleArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[java.time.Instant]("updateDate")).mapN(org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineForExecutionOutput.apply _)
  }
  final implicit val DeleteStateMachineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DeleteStateMachineOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.stepfunctions.models.DeleteStateMachineOutput)
  final implicit val ListExecutionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ListExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("statusFilter"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.ListExecutionsInput.apply _)
  }
  final implicit val ListActivitiesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ListActivitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.ListActivitiesInput.apply _)
  }
  final implicit val GetActivityTaskOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.GetActivityTaskOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskToken"), o.get[scala.Option[java.lang.String]]("input")).mapN(org.lyranthe.araethura.stepfunctions.models.GetActivityTaskOutput.apply _)
  }
  final implicit val LambdaFunctionScheduledEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduledEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resource"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[scala.Long]]("timeoutInSeconds")).mapN(org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduledEventDetails.apply _)
  }
  final implicit val HistoryEventDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.HistoryEvent] = io.circe.Decoder.instance { o => 
    for (`timestamp` <- o.get[java.time.Instant]("timestamp"); `id` <- o.get[scala.Long]("id"); `type` <- o.get[java.lang.String]("type"); `lambdaFunctionTimedOutEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionTimedOutEventDetails]]("lambdaFunctionTimedOutEventDetails"); `executionStartedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ExecutionStartedEventDetails]]("executionStartedEventDetails"); `executionFailedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ExecutionFailedEventDetails]]("executionFailedEventDetails"); `executionTimedOutEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ExecutionTimedOutEventDetails]]("executionTimedOutEventDetails"); `lambdaFunctionScheduleFailedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduleFailedEventDetails]]("lambdaFunctionScheduleFailedEventDetails"); `lambdaFunctionStartFailedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionStartFailedEventDetails]]("lambdaFunctionStartFailedEventDetails"); `executionAbortedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ExecutionAbortedEventDetails]]("executionAbortedEventDetails"); `previousEventId` <- o.get[scala.Option[scala.Long]]("previousEventId"); `activityScheduledEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ActivityScheduledEventDetails]]("activityScheduledEventDetails"); `activityFailedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ActivityFailedEventDetails]]("activityFailedEventDetails"); `lambdaFunctionFailedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionFailedEventDetails]]("lambdaFunctionFailedEventDetails"); `activityScheduleFailedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ActivityScheduleFailedEventDetails]]("activityScheduleFailedEventDetails"); `activitySucceededEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ActivitySucceededEventDetails]]("activitySucceededEventDetails"); `activityTimedOutEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ActivityTimedOutEventDetails]]("activityTimedOutEventDetails"); `stateExitedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.StateExitedEventDetails]]("stateExitedEventDetails"); `lambdaFunctionScheduledEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionScheduledEventDetails]]("lambdaFunctionScheduledEventDetails"); `executionSucceededEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ExecutionSucceededEventDetails]]("executionSucceededEventDetails"); `lambdaFunctionSucceededEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionSucceededEventDetails]]("lambdaFunctionSucceededEventDetails"); `stateEnteredEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.StateEnteredEventDetails]]("stateEnteredEventDetails"); `activityStartedEventDetails` <- o.get[scala.Option[org.lyranthe.araethura.stepfunctions.models.ActivityStartedEventDetails]]("activityStartedEventDetails")) yield org.lyranthe.araethura.stepfunctions.models.HistoryEvent(timestamp, id, `type`, lambdaFunctionTimedOutEventDetails, executionStartedEventDetails, executionFailedEventDetails, executionTimedOutEventDetails, lambdaFunctionScheduleFailedEventDetails, lambdaFunctionStartFailedEventDetails, executionAbortedEventDetails, previousEventId, activityScheduledEventDetails, activityFailedEventDetails, lambdaFunctionFailedEventDetails, activityScheduleFailedEventDetails, activitySucceededEventDetails, activityTimedOutEventDetails, stateExitedEventDetails, lambdaFunctionScheduledEventDetails, executionSucceededEventDetails, lambdaFunctionSucceededEventDetails, stateEnteredEventDetails, activityStartedEventDetails)
  }
  final implicit val DescribeStateMachineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("stateMachineArn").map(org.lyranthe.araethura.stepfunctions.models.DescribeStateMachineInput.apply _)
  }
  final implicit val DescribeExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.DescribeExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("executionArn").map(org.lyranthe.araethura.stepfunctions.models.DescribeExecutionInput.apply _)
  }
  final implicit val ExecutionSucceededEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionSucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(org.lyranthe.araethura.stepfunctions.models.ExecutionSucceededEventDetails.apply _)
  }
  final implicit val SendTaskHeartbeatOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.SendTaskHeartbeatOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.stepfunctions.models.SendTaskHeartbeatOutput)
  final implicit val LambdaFunctionSucceededEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.LambdaFunctionSucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(org.lyranthe.araethura.stepfunctions.models.LambdaFunctionSucceededEventDetails.apply _)
  }
  final implicit val StateEnteredEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateEnteredEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("input")).mapN(org.lyranthe.araethura.stepfunctions.models.StateEnteredEventDetails.apply _)
  }
  final implicit val StateMachineListItemDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.StateMachineListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(org.lyranthe.araethura.stepfunctions.models.StateMachineListItem.apply _)
  }
  final implicit val ListStateMachinesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ListStateMachinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.stepfunctions.models.StateMachineListItem]]("stateMachines"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.ListStateMachinesOutput.apply _)
  }
  final implicit val ActivityStartedEventDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ActivityStartedEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("workerName").map(org.lyranthe.araethura.stepfunctions.models.ActivityStartedEventDetails.apply _)
  }
  final implicit val GetExecutionHistoryInputDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.GetExecutionHistoryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.stepfunctions.models.GetExecutionHistoryInput.apply _)
  }
  final implicit val ExecutionListItemDecoder: io.circe.Decoder[org.lyranthe.araethura.stepfunctions.models.ExecutionListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("status"), o.get[java.time.Instant]("startDate"), o.get[scala.Option[java.time.Instant]]("stopDate")).mapN(org.lyranthe.araethura.stepfunctions.models.ExecutionListItem.apply _)
  }
}