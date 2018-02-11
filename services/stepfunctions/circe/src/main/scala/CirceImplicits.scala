package org.lyranthe.araethura.stepfunctions
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteActivityInputEncoder: io.circe.Encoder[models.DeleteActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson)
  }
  final implicit val DescribeActivityInputEncoder: io.circe.Encoder[models.DescribeActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson)
  }
  final implicit val InvalidArnEncoder: io.circe.Encoder[models.InvalidArn] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteStateMachineInputEncoder: io.circe.Encoder[models.DeleteStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson)
  }
  final implicit val SendTaskHeartbeatInputEncoder: io.circe.Encoder[models.SendTaskHeartbeatInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson)
  }
  final implicit val ExecutionLimitExceededEncoder: io.circe.Encoder[models.ExecutionLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SendTaskFailureInputEncoder: io.circe.Encoder[models.SendTaskFailureInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val InvalidNameEncoder: io.circe.Encoder[models.InvalidName] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateActivityOutputEncoder: io.circe.Encoder[models.CreateActivityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val SendTaskSuccessOutputEncoder: io.circe.Encoder[models.SendTaskSuccessOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TaskTimedOutEncoder: io.circe.Encoder[models.TaskTimedOut] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StopExecutionInputEncoder: io.circe.Encoder[models.StopExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val LambdaFunctionTimedOutEventDetailsEncoder: io.circe.Encoder[models.LambdaFunctionTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StateMachineLimitExceededEncoder: io.circe.Encoder[models.StateMachineLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExecutionStartedEventDetailsEncoder: io.circe.Encoder[models.ExecutionStartedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("input" -> o.input.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val ExecutionFailedEventDetailsEncoder: io.circe.Encoder[models.ExecutionFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ExecutionTimedOutEventDetailsEncoder: io.circe.Encoder[models.ExecutionTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StartExecutionOutputEncoder: io.circe.Encoder[models.StartExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "startDate" -> o.startDate.asJson)
  }
  final implicit val LambdaFunctionScheduleFailedEventDetailsEncoder: io.circe.Encoder[models.LambdaFunctionScheduleFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val DescribeStateMachineOutputEncoder: io.circe.Encoder[models.DescribeStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "creationDate" -> o.creationDate.asJson, "name" -> o.name.asJson, "definition" -> o.definition.asJson, "status" -> o.status.asJson)
  }
  final implicit val InvalidTokenEncoder: io.circe.Encoder[models.InvalidToken] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeExecutionOutputEncoder: io.circe.Encoder[models.DescribeExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "stateMachineArn" -> o.stateMachineArn.asJson, "startDate" -> o.startDate.asJson, "status" -> o.status.asJson, "input" -> o.input.asJson, "stopDate" -> o.stopDate.asJson, "name" -> o.name.asJson, "output" -> o.output.asJson)
  }
  final implicit val ActivityListItemEncoder: io.circe.Encoder[models.ActivityListItem] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val DescribeStateMachineForExecutionInputEncoder: io.circe.Encoder[models.DescribeStateMachineForExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson)
  }
  final implicit val LambdaFunctionStartFailedEventDetailsEncoder: io.circe.Encoder[models.LambdaFunctionStartFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val GetExecutionHistoryOutputEncoder: io.circe.Encoder[models.GetExecutionHistoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidDefinitionEncoder: io.circe.Encoder[models.InvalidDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExecutionAbortedEventDetailsEncoder: io.circe.Encoder[models.ExecutionAbortedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val TaskDoesNotExistEncoder: io.circe.Encoder[models.TaskDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StateMachineDoesNotExistEncoder: io.circe.Encoder[models.StateMachineDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StateMachineDeletingEncoder: io.circe.Encoder[models.StateMachineDeleting] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateStateMachineOutputEncoder: io.circe.Encoder[models.UpdateStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("updateDate" -> o.updateDate.asJson)
  }
  final implicit val ExecutionDoesNotExistEncoder: io.circe.Encoder[models.ExecutionDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidExecutionInputEncoder: io.circe.Encoder[models.InvalidExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivityScheduledEventDetailsEncoder: io.circe.Encoder[models.ActivityScheduledEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("resource" -> o.resource.asJson, "input" -> o.input.asJson, "timeoutInSeconds" -> o.timeoutInSeconds.asJson, "heartbeatInSeconds" -> o.heartbeatInSeconds.asJson)
  }
  final implicit val CreateStateMachineOutputEncoder: io.circe.Encoder[models.CreateStateMachineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val ListActivitiesOutputEncoder: io.circe.Encoder[models.ListActivitiesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activities" -> o.activities.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ActivityWorkerLimitExceededEncoder: io.circe.Encoder[models.ActivityWorkerLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateStateMachineInputEncoder: io.circe.Encoder[models.UpdateStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "definition" -> o.definition.asJson)
  }
  final implicit val ActivityFailedEventDetailsEncoder: io.circe.Encoder[models.ActivityFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ListStateMachinesInputEncoder: io.circe.Encoder[models.ListStateMachinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateStateMachineInputEncoder: io.circe.Encoder[models.CreateStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "definition" -> o.definition.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val ExecutionAlreadyExistsEncoder: io.circe.Encoder[models.ExecutionAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MissingRequiredParameterEncoder: io.circe.Encoder[models.MissingRequiredParameter] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SendTaskFailureOutputEncoder: io.circe.Encoder[models.SendTaskFailureOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LambdaFunctionFailedEventDetailsEncoder: io.circe.Encoder[models.LambdaFunctionFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ActivityScheduleFailedEventDetailsEncoder: io.circe.Encoder[models.ActivityScheduleFailedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StartExecutionInputEncoder: io.circe.Encoder[models.StartExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "input" -> o.input.asJson)
  }
  final implicit val DeleteActivityOutputEncoder: io.circe.Encoder[models.DeleteActivityOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetActivityTaskInputEncoder: io.circe.Encoder[models.GetActivityTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "workerName" -> o.workerName.asJson)
  }
  final implicit val ActivityLimitExceededEncoder: io.circe.Encoder[models.ActivityLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeActivityOutputEncoder: io.circe.Encoder[models.DescribeActivityOutput] = io.circe.Encoder.instance { o => 
    Json.obj("activityArn" -> o.activityArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val StopExecutionOutputEncoder: io.circe.Encoder[models.StopExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stopDate" -> o.stopDate.asJson)
  }
  final implicit val InvalidOutputEncoder: io.circe.Encoder[models.InvalidOutput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivitySucceededEventDetailsEncoder: io.circe.Encoder[models.ActivitySucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val ActivityTimedOutEventDetailsEncoder: io.circe.Encoder[models.ActivityTimedOutEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("error" -> o.error.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val StateMachineAlreadyExistsEncoder: io.circe.Encoder[models.StateMachineAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateActivityInputEncoder: io.circe.Encoder[models.CreateActivityInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val SendTaskSuccessInputEncoder: io.circe.Encoder[models.SendTaskSuccessInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "output" -> o.output.asJson)
  }
  final implicit val ActivityDoesNotExistEncoder: io.circe.Encoder[models.ActivityDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListExecutionsOutputEncoder: io.circe.Encoder[models.ListExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("executions" -> o.executions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StateExitedEventDetailsEncoder: io.circe.Encoder[models.StateExitedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "output" -> o.output.asJson)
  }
  final implicit val DescribeStateMachineForExecutionOutputEncoder: io.circe.Encoder[models.DescribeStateMachineForExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "roleArn" -> o.roleArn.asJson, "name" -> o.name.asJson, "definition" -> o.definition.asJson, "updateDate" -> o.updateDate.asJson)
  }
  final implicit val DeleteStateMachineOutputEncoder: io.circe.Encoder[models.DeleteStateMachineOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListExecutionsInputEncoder: io.circe.Encoder[models.ListExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "statusFilter" -> o.statusFilter.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListActivitiesInputEncoder: io.circe.Encoder[models.ListActivitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetActivityTaskOutputEncoder: io.circe.Encoder[models.GetActivityTaskOutput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "input" -> o.input.asJson)
  }
  final implicit val LambdaFunctionScheduledEventDetailsEncoder: io.circe.Encoder[models.LambdaFunctionScheduledEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("resource" -> o.resource.asJson, "input" -> o.input.asJson, "timeoutInSeconds" -> o.timeoutInSeconds.asJson)
  }
  final implicit val HistoryEventEncoder: io.circe.Encoder[models.HistoryEvent] = io.circe.Encoder.instance { o => 
    Json.obj("timestamp" -> o.timestamp.asJson, "id" -> o.id.asJson, "type" -> o.`type`.asJson, "lambdaFunctionTimedOutEventDetails" -> o.lambdaFunctionTimedOutEventDetails.asJson, "executionStartedEventDetails" -> o.executionStartedEventDetails.asJson, "executionFailedEventDetails" -> o.executionFailedEventDetails.asJson, "executionTimedOutEventDetails" -> o.executionTimedOutEventDetails.asJson, "lambdaFunctionScheduleFailedEventDetails" -> o.lambdaFunctionScheduleFailedEventDetails.asJson, "lambdaFunctionStartFailedEventDetails" -> o.lambdaFunctionStartFailedEventDetails.asJson, "executionAbortedEventDetails" -> o.executionAbortedEventDetails.asJson, "previousEventId" -> o.previousEventId.asJson, "activityScheduledEventDetails" -> o.activityScheduledEventDetails.asJson, "activityFailedEventDetails" -> o.activityFailedEventDetails.asJson, "lambdaFunctionFailedEventDetails" -> o.lambdaFunctionFailedEventDetails.asJson, "activityScheduleFailedEventDetails" -> o.activityScheduleFailedEventDetails.asJson, "activitySucceededEventDetails" -> o.activitySucceededEventDetails.asJson, "activityTimedOutEventDetails" -> o.activityTimedOutEventDetails.asJson, "stateExitedEventDetails" -> o.stateExitedEventDetails.asJson, "lambdaFunctionScheduledEventDetails" -> o.lambdaFunctionScheduledEventDetails.asJson, "executionSucceededEventDetails" -> o.executionSucceededEventDetails.asJson, "lambdaFunctionSucceededEventDetails" -> o.lambdaFunctionSucceededEventDetails.asJson, "stateEnteredEventDetails" -> o.stateEnteredEventDetails.asJson, "activityStartedEventDetails" -> o.activityStartedEventDetails.asJson)
  }
  final implicit val DescribeStateMachineInputEncoder: io.circe.Encoder[models.DescribeStateMachineInput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson)
  }
  final implicit val DescribeExecutionInputEncoder: io.circe.Encoder[models.DescribeExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson)
  }
  final implicit val ExecutionSucceededEventDetailsEncoder: io.circe.Encoder[models.ExecutionSucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val SendTaskHeartbeatOutputEncoder: io.circe.Encoder[models.SendTaskHeartbeatOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LambdaFunctionSucceededEventDetailsEncoder: io.circe.Encoder[models.LambdaFunctionSucceededEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("output" -> o.output.asJson)
  }
  final implicit val StateEnteredEventDetailsEncoder: io.circe.Encoder[models.StateEnteredEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "input" -> o.input.asJson)
  }
  final implicit val StateMachineListItemEncoder: io.circe.Encoder[models.StateMachineListItem] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val ListStateMachinesOutputEncoder: io.circe.Encoder[models.ListStateMachinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("stateMachines" -> o.stateMachines.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ActivityStartedEventDetailsEncoder: io.circe.Encoder[models.ActivityStartedEventDetails] = io.circe.Encoder.instance { o => 
    Json.obj("workerName" -> o.workerName.asJson)
  }
  final implicit val GetExecutionHistoryInputEncoder: io.circe.Encoder[models.GetExecutionHistoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "maxResults" -> o.maxResults.asJson, "reverseOrder" -> o.reverseOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ExecutionListItemEncoder: io.circe.Encoder[models.ExecutionListItem] = io.circe.Encoder.instance { o => 
    Json.obj("executionArn" -> o.executionArn.asJson, "stateMachineArn" -> o.stateMachineArn.asJson, "name" -> o.name.asJson, "status" -> o.status.asJson, "startDate" -> o.startDate.asJson, "stopDate" -> o.stopDate.asJson)
  }
  final implicit val DeleteActivityInputDecoder: io.circe.Decoder[models.DeleteActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityArn").map(models.DeleteActivityInput.apply _)
  }
  final implicit val DescribeActivityInputDecoder: io.circe.Decoder[models.DescribeActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityArn").map(models.DescribeActivityInput.apply _)
  }
  final implicit val InvalidArnDecoder: io.circe.Decoder[models.InvalidArn] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidArn.apply _)
  }
  final implicit val DeleteStateMachineInputDecoder: io.circe.Decoder[models.DeleteStateMachineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("stateMachineArn").map(models.DeleteStateMachineInput.apply _)
  }
  final implicit val SendTaskHeartbeatInputDecoder: io.circe.Decoder[models.SendTaskHeartbeatInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskToken").map(models.SendTaskHeartbeatInput.apply _)
  }
  final implicit val ExecutionLimitExceededDecoder: io.circe.Decoder[models.ExecutionLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExecutionLimitExceeded.apply _)
  }
  final implicit val SendTaskFailureInputDecoder: io.circe.Decoder[models.SendTaskFailureInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.SendTaskFailureInput.apply _)
  }
  final implicit val InvalidNameDecoder: io.circe.Decoder[models.InvalidName] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidName.apply _)
  }
  final implicit val CreateActivityOutputDecoder: io.circe.Decoder[models.CreateActivityOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.time.Instant]("creationDate")).mapN(models.CreateActivityOutput.apply _)
  }
  final implicit val SendTaskSuccessOutputDecoder: io.circe.Decoder[models.SendTaskSuccessOutput.type] = io.circe.Decoder.decodeUnit.as(models.SendTaskSuccessOutput)
  final implicit val TaskTimedOutDecoder: io.circe.Decoder[models.TaskTimedOut] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TaskTimedOut.apply _)
  }
  final implicit val StopExecutionInputDecoder: io.circe.Decoder[models.StopExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.StopExecutionInput.apply _)
  }
  final implicit val LambdaFunctionTimedOutEventDetailsDecoder: io.circe.Decoder[models.LambdaFunctionTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.LambdaFunctionTimedOutEventDetails.apply _)
  }
  final implicit val StateMachineLimitExceededDecoder: io.circe.Decoder[models.StateMachineLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.StateMachineLimitExceeded.apply _)
  }
  final implicit val ExecutionStartedEventDetailsDecoder: io.circe.Decoder[models.ExecutionStartedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("roleArn")).mapN(models.ExecutionStartedEventDetails.apply _)
  }
  final implicit val ExecutionFailedEventDetailsDecoder: io.circe.Decoder[models.ExecutionFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.ExecutionFailedEventDetails.apply _)
  }
  final implicit val ExecutionTimedOutEventDetailsDecoder: io.circe.Decoder[models.ExecutionTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.ExecutionTimedOutEventDetails.apply _)
  }
  final implicit val StartExecutionOutputDecoder: io.circe.Decoder[models.StartExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.time.Instant]("startDate")).mapN(models.StartExecutionOutput.apply _)
  }
  final implicit val LambdaFunctionScheduleFailedEventDetailsDecoder: io.circe.Decoder[models.LambdaFunctionScheduleFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.LambdaFunctionScheduleFailedEventDetails.apply _)
  }
  final implicit val DescribeStateMachineOutputDecoder: io.circe.Decoder[models.DescribeStateMachineOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("roleArn"), o.get[java.time.Instant]("creationDate"), o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[scala.Option[java.lang.String]]("status")).mapN(models.DescribeStateMachineOutput.apply _)
  }
  final implicit val InvalidTokenDecoder: io.circe.Decoder[models.InvalidToken] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidToken.apply _)
  }
  final implicit val DescribeExecutionOutputDecoder: io.circe.Decoder[models.DescribeExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.lang.String]("stateMachineArn"), o.get[java.time.Instant]("startDate"), o.get[java.lang.String]("status"), o.get[java.lang.String]("input"), o.get[scala.Option[java.time.Instant]]("stopDate"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("output")).mapN(models.DescribeExecutionOutput.apply _)
  }
  final implicit val ActivityListItemDecoder: io.circe.Decoder[models.ActivityListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(models.ActivityListItem.apply _)
  }
  final implicit val DescribeStateMachineForExecutionInputDecoder: io.circe.Decoder[models.DescribeStateMachineForExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("executionArn").map(models.DescribeStateMachineForExecutionInput.apply _)
  }
  final implicit val LambdaFunctionStartFailedEventDetailsDecoder: io.circe.Decoder[models.LambdaFunctionStartFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.LambdaFunctionStartFailedEventDetails.apply _)
  }
  final implicit val GetExecutionHistoryOutputDecoder: io.circe.Decoder[models.GetExecutionHistoryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.HistoryEvent]]("events"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetExecutionHistoryOutput.apply _)
  }
  final implicit val InvalidDefinitionDecoder: io.circe.Decoder[models.InvalidDefinition] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidDefinition.apply _)
  }
  final implicit val ExecutionAbortedEventDetailsDecoder: io.circe.Decoder[models.ExecutionAbortedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.ExecutionAbortedEventDetails.apply _)
  }
  final implicit val TaskDoesNotExistDecoder: io.circe.Decoder[models.TaskDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TaskDoesNotExist.apply _)
  }
  final implicit val StateMachineDoesNotExistDecoder: io.circe.Decoder[models.StateMachineDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.StateMachineDoesNotExist.apply _)
  }
  final implicit val StateMachineDeletingDecoder: io.circe.Decoder[models.StateMachineDeleting] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.StateMachineDeleting.apply _)
  }
  final implicit val UpdateStateMachineOutputDecoder: io.circe.Decoder[models.UpdateStateMachineOutput] = io.circe.Decoder.instance { o => 
    o.get[java.time.Instant]("updateDate").map(models.UpdateStateMachineOutput.apply _)
  }
  final implicit val ExecutionDoesNotExistDecoder: io.circe.Decoder[models.ExecutionDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExecutionDoesNotExist.apply _)
  }
  final implicit val InvalidExecutionInputDecoder: io.circe.Decoder[models.InvalidExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidExecutionInput.apply _)
  }
  final implicit val ActivityScheduledEventDetailsDecoder: io.circe.Decoder[models.ActivityScheduledEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resource"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[scala.Long]]("timeoutInSeconds"), o.get[scala.Option[scala.Long]]("heartbeatInSeconds")).mapN(models.ActivityScheduledEventDetails.apply _)
  }
  final implicit val CreateStateMachineOutputDecoder: io.circe.Decoder[models.CreateStateMachineOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.time.Instant]("creationDate")).mapN(models.CreateStateMachineOutput.apply _)
  }
  final implicit val ListActivitiesOutputDecoder: io.circe.Decoder[models.ListActivitiesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.ActivityListItem]]("activities"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListActivitiesOutput.apply _)
  }
  final implicit val ActivityWorkerLimitExceededDecoder: io.circe.Decoder[models.ActivityWorkerLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ActivityWorkerLimitExceeded.apply _)
  }
  final implicit val UpdateStateMachineInputDecoder: io.circe.Decoder[models.UpdateStateMachineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("definition")).mapN(models.UpdateStateMachineInput.apply _)
  }
  final implicit val ActivityFailedEventDetailsDecoder: io.circe.Decoder[models.ActivityFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.ActivityFailedEventDetails.apply _)
  }
  final implicit val ListStateMachinesInputDecoder: io.circe.Decoder[models.ListStateMachinesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListStateMachinesInput.apply _)
  }
  final implicit val CreateStateMachineInputDecoder: io.circe.Decoder[models.CreateStateMachineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[java.lang.String]("roleArn")).mapN(models.CreateStateMachineInput.apply _)
  }
  final implicit val ExecutionAlreadyExistsDecoder: io.circe.Decoder[models.ExecutionAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExecutionAlreadyExists.apply _)
  }
  final implicit val MissingRequiredParameterDecoder: io.circe.Decoder[models.MissingRequiredParameter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.MissingRequiredParameter.apply _)
  }
  final implicit val SendTaskFailureOutputDecoder: io.circe.Decoder[models.SendTaskFailureOutput.type] = io.circe.Decoder.decodeUnit.as(models.SendTaskFailureOutput)
  final implicit val LambdaFunctionFailedEventDetailsDecoder: io.circe.Decoder[models.LambdaFunctionFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.LambdaFunctionFailedEventDetails.apply _)
  }
  final implicit val ActivityScheduleFailedEventDetailsDecoder: io.circe.Decoder[models.ActivityScheduleFailedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.ActivityScheduleFailedEventDetails.apply _)
  }
  final implicit val StartExecutionInputDecoder: io.circe.Decoder[models.StartExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("input")).mapN(models.StartExecutionInput.apply _)
  }
  final implicit val DeleteActivityOutputDecoder: io.circe.Decoder[models.DeleteActivityOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteActivityOutput)
  final implicit val GetActivityTaskInputDecoder: io.circe.Decoder[models.GetActivityTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[scala.Option[java.lang.String]]("workerName")).mapN(models.GetActivityTaskInput.apply _)
  }
  final implicit val ActivityLimitExceededDecoder: io.circe.Decoder[models.ActivityLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ActivityLimitExceeded.apply _)
  }
  final implicit val DescribeActivityOutputDecoder: io.circe.Decoder[models.DescribeActivityOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(models.DescribeActivityOutput.apply _)
  }
  final implicit val StopExecutionOutputDecoder: io.circe.Decoder[models.StopExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[java.time.Instant]("stopDate").map(models.StopExecutionOutput.apply _)
  }
  final implicit val InvalidOutputDecoder: io.circe.Decoder[models.InvalidOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidOutput.apply _)
  }
  final implicit val ActivitySucceededEventDetailsDecoder: io.circe.Decoder[models.ActivitySucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(models.ActivitySucceededEventDetails.apply _)
  }
  final implicit val ActivityTimedOutEventDetailsDecoder: io.circe.Decoder[models.ActivityTimedOutEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("error"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.ActivityTimedOutEventDetails.apply _)
  }
  final implicit val StateMachineAlreadyExistsDecoder: io.circe.Decoder[models.StateMachineAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.StateMachineAlreadyExists.apply _)
  }
  final implicit val CreateActivityInputDecoder: io.circe.Decoder[models.CreateActivityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.CreateActivityInput.apply _)
  }
  final implicit val SendTaskSuccessInputDecoder: io.circe.Decoder[models.SendTaskSuccessInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[java.lang.String]("output")).mapN(models.SendTaskSuccessInput.apply _)
  }
  final implicit val ActivityDoesNotExistDecoder: io.circe.Decoder[models.ActivityDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ActivityDoesNotExist.apply _)
  }
  final implicit val ListExecutionsOutputDecoder: io.circe.Decoder[models.ListExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.ExecutionListItem]]("executions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListExecutionsOutput.apply _)
  }
  final implicit val StateExitedEventDetailsDecoder: io.circe.Decoder[models.StateExitedEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("output")).mapN(models.StateExitedEventDetails.apply _)
  }
  final implicit val DescribeStateMachineForExecutionOutputDecoder: io.circe.Decoder[models.DescribeStateMachineForExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("roleArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("definition"), o.get[java.time.Instant]("updateDate")).mapN(models.DescribeStateMachineForExecutionOutput.apply _)
  }
  final implicit val DeleteStateMachineOutputDecoder: io.circe.Decoder[models.DeleteStateMachineOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteStateMachineOutput)
  final implicit val ListExecutionsInputDecoder: io.circe.Decoder[models.ListExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[scala.Option[java.lang.String]]("statusFilter"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListExecutionsInput.apply _)
  }
  final implicit val ListActivitiesInputDecoder: io.circe.Decoder[models.ListActivitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListActivitiesInput.apply _)
  }
  final implicit val GetActivityTaskOutputDecoder: io.circe.Decoder[models.GetActivityTaskOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskToken"), o.get[scala.Option[java.lang.String]]("input")).mapN(models.GetActivityTaskOutput.apply _)
  }
  final implicit val LambdaFunctionScheduledEventDetailsDecoder: io.circe.Decoder[models.LambdaFunctionScheduledEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resource"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[scala.Long]]("timeoutInSeconds")).mapN(models.LambdaFunctionScheduledEventDetails.apply _)
  }
  final implicit val HistoryEventDecoder: io.circe.Decoder[models.HistoryEvent] = io.circe.Decoder.instance { o => 
    for (`timestamp` <- o.get[java.time.Instant]("timestamp"); `id` <- o.get[scala.Long]("id"); `type` <- o.get[java.lang.String]("type"); `lambdaFunctionTimedOutEventDetails` <- o.get[scala.Option[models.LambdaFunctionTimedOutEventDetails]]("lambdaFunctionTimedOutEventDetails"); `executionStartedEventDetails` <- o.get[scala.Option[models.ExecutionStartedEventDetails]]("executionStartedEventDetails"); `executionFailedEventDetails` <- o.get[scala.Option[models.ExecutionFailedEventDetails]]("executionFailedEventDetails"); `executionTimedOutEventDetails` <- o.get[scala.Option[models.ExecutionTimedOutEventDetails]]("executionTimedOutEventDetails"); `lambdaFunctionScheduleFailedEventDetails` <- o.get[scala.Option[models.LambdaFunctionScheduleFailedEventDetails]]("lambdaFunctionScheduleFailedEventDetails"); `lambdaFunctionStartFailedEventDetails` <- o.get[scala.Option[models.LambdaFunctionStartFailedEventDetails]]("lambdaFunctionStartFailedEventDetails"); `executionAbortedEventDetails` <- o.get[scala.Option[models.ExecutionAbortedEventDetails]]("executionAbortedEventDetails"); `previousEventId` <- o.get[scala.Option[scala.Long]]("previousEventId"); `activityScheduledEventDetails` <- o.get[scala.Option[models.ActivityScheduledEventDetails]]("activityScheduledEventDetails"); `activityFailedEventDetails` <- o.get[scala.Option[models.ActivityFailedEventDetails]]("activityFailedEventDetails"); `lambdaFunctionFailedEventDetails` <- o.get[scala.Option[models.LambdaFunctionFailedEventDetails]]("lambdaFunctionFailedEventDetails"); `activityScheduleFailedEventDetails` <- o.get[scala.Option[models.ActivityScheduleFailedEventDetails]]("activityScheduleFailedEventDetails"); `activitySucceededEventDetails` <- o.get[scala.Option[models.ActivitySucceededEventDetails]]("activitySucceededEventDetails"); `activityTimedOutEventDetails` <- o.get[scala.Option[models.ActivityTimedOutEventDetails]]("activityTimedOutEventDetails"); `stateExitedEventDetails` <- o.get[scala.Option[models.StateExitedEventDetails]]("stateExitedEventDetails"); `lambdaFunctionScheduledEventDetails` <- o.get[scala.Option[models.LambdaFunctionScheduledEventDetails]]("lambdaFunctionScheduledEventDetails"); `executionSucceededEventDetails` <- o.get[scala.Option[models.ExecutionSucceededEventDetails]]("executionSucceededEventDetails"); `lambdaFunctionSucceededEventDetails` <- o.get[scala.Option[models.LambdaFunctionSucceededEventDetails]]("lambdaFunctionSucceededEventDetails"); `stateEnteredEventDetails` <- o.get[scala.Option[models.StateEnteredEventDetails]]("stateEnteredEventDetails"); `activityStartedEventDetails` <- o.get[scala.Option[models.ActivityStartedEventDetails]]("activityStartedEventDetails")) yield models.HistoryEvent(timestamp, id, `type`, lambdaFunctionTimedOutEventDetails, executionStartedEventDetails, executionFailedEventDetails, executionTimedOutEventDetails, lambdaFunctionScheduleFailedEventDetails, lambdaFunctionStartFailedEventDetails, executionAbortedEventDetails, previousEventId, activityScheduledEventDetails, activityFailedEventDetails, lambdaFunctionFailedEventDetails, activityScheduleFailedEventDetails, activitySucceededEventDetails, activityTimedOutEventDetails, stateExitedEventDetails, lambdaFunctionScheduledEventDetails, executionSucceededEventDetails, lambdaFunctionSucceededEventDetails, stateEnteredEventDetails, activityStartedEventDetails)
  }
  final implicit val DescribeStateMachineInputDecoder: io.circe.Decoder[models.DescribeStateMachineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("stateMachineArn").map(models.DescribeStateMachineInput.apply _)
  }
  final implicit val DescribeExecutionInputDecoder: io.circe.Decoder[models.DescribeExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("executionArn").map(models.DescribeExecutionInput.apply _)
  }
  final implicit val ExecutionSucceededEventDetailsDecoder: io.circe.Decoder[models.ExecutionSucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(models.ExecutionSucceededEventDetails.apply _)
  }
  final implicit val SendTaskHeartbeatOutputDecoder: io.circe.Decoder[models.SendTaskHeartbeatOutput.type] = io.circe.Decoder.decodeUnit.as(models.SendTaskHeartbeatOutput)
  final implicit val LambdaFunctionSucceededEventDetailsDecoder: io.circe.Decoder[models.LambdaFunctionSucceededEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("output").map(models.LambdaFunctionSucceededEventDetails.apply _)
  }
  final implicit val StateEnteredEventDetailsDecoder: io.circe.Decoder[models.StateEnteredEventDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("input")).mapN(models.StateEnteredEventDetails.apply _)
  }
  final implicit val StateMachineListItemDecoder: io.circe.Decoder[models.StateMachineListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("creationDate")).mapN(models.StateMachineListItem.apply _)
  }
  final implicit val ListStateMachinesOutputDecoder: io.circe.Decoder[models.ListStateMachinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.StateMachineListItem]]("stateMachines"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListStateMachinesOutput.apply _)
  }
  final implicit val ActivityStartedEventDetailsDecoder: io.circe.Decoder[models.ActivityStartedEventDetails] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("workerName").map(models.ActivityStartedEventDetails.apply _)
  }
  final implicit val GetExecutionHistoryInputDecoder: io.circe.Decoder[models.GetExecutionHistoryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetExecutionHistoryInput.apply _)
  }
  final implicit val ExecutionListItemDecoder: io.circe.Decoder[models.ExecutionListItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("executionArn"), o.get[java.lang.String]("stateMachineArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("status"), o.get[java.time.Instant]("startDate"), o.get[scala.Option[java.time.Instant]]("stopDate")).mapN(models.ExecutionListItem.apply _)
  }
}