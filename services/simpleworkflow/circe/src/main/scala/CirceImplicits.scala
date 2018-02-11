package org.lyranthe.araethura.simpleworkflow
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val StartChildWorkflowExecutionInitiatedEventAttributesEncoder: io.circe.Encoder[models.StartChildWorkflowExecutionInitiatedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "taskList" -> o.taskList.asJson, "workflowId" -> o.workflowId.asJson, "childPolicy" -> o.childPolicy.asJson, "workflowType" -> o.workflowType.asJson, "executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "tagList" -> o.tagList.asJson, "control" -> o.control.asJson, "input" -> o.input.asJson, "lambdaRole" -> o.lambdaRole.asJson)
  }
  final implicit val ActivityTypeInfosEncoder: io.circe.Encoder[models.ActivityTypeInfos] = io.circe.Encoder.instance { o => 
    Json.obj("typeInfos" -> o.typeInfos.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val WorkflowExecutionCountEncoder: io.circe.Encoder[models.WorkflowExecutionCount] = io.circe.Encoder.instance { o => 
    Json.obj("count" -> o.count.asJson, "truncated" -> o.truncated.asJson)
  }
  final implicit val RequestCancelWorkflowExecutionInputEncoder: io.circe.Encoder[models.RequestCancelWorkflowExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "workflowId" -> o.workflowId.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val DecisionTaskTimedOutEventAttributesEncoder: io.circe.Encoder[models.DecisionTaskTimedOutEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timeoutType" -> o.timeoutType.asJson, "scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson)
  }
  final implicit val ActivityTaskCanceledEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskCanceledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "latestCancelRequestedEventId" -> o.latestCancelRequestedEventId.asJson, "details" -> o.details.asJson)
  }
  final implicit val CountClosedWorkflowExecutionsInputEncoder: io.circe.Encoder[models.CountClosedWorkflowExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "startTimeFilter" -> o.startTimeFilter.asJson, "closeTimeFilter" -> o.closeTimeFilter.asJson, "tagFilter" -> o.tagFilter.asJson, "closeStatusFilter" -> o.closeStatusFilter.asJson, "typeFilter" -> o.typeFilter.asJson, "executionFilter" -> o.executionFilter.asJson)
  }
  final implicit val ChildWorkflowExecutionTerminatedEventAttributesEncoder: io.circe.Encoder[models.ChildWorkflowExecutionTerminatedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "workflowType" -> o.workflowType.asJson, "initiatedEventId" -> o.initiatedEventId.asJson, "startedEventId" -> o.startedEventId.asJson)
  }
  final implicit val ScheduleLambdaFunctionFailedEventAttributesEncoder: io.circe.Encoder[models.ScheduleLambdaFunctionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val ListWorkflowTypesInputEncoder: io.circe.Encoder[models.ListWorkflowTypesInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "registrationStatus" -> o.registrationStatus.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson, "name" -> o.name.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ExecutionTimeFilterEncoder: io.circe.Encoder[models.ExecutionTimeFilter] = io.circe.Encoder.instance { o => 
    Json.obj("oldestDate" -> o.oldestDate.asJson, "latestDate" -> o.latestDate.asJson)
  }
  final implicit val SignalExternalWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.SignalExternalWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowId" -> o.workflowId.asJson, "signalName" -> o.signalName.asJson, "runId" -> o.runId.asJson, "input" -> o.input.asJson, "control" -> o.control.asJson)
  }
  final implicit val LimitExceededFaultEncoder: io.circe.Encoder[models.LimitExceededFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RequestCancelActivityTaskDecisionAttributesEncoder: io.circe.Encoder[models.RequestCancelActivityTaskDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("activityId" -> o.activityId.asJson)
  }
  final implicit val RegisterWorkflowTypeInputEncoder: io.circe.Encoder[models.RegisterWorkflowTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson, "domain" -> o.domain.asJson, "defaultTaskStartToCloseTimeout" -> o.defaultTaskStartToCloseTimeout.asJson, "defaultExecutionStartToCloseTimeout" -> o.defaultExecutionStartToCloseTimeout.asJson, "defaultTaskPriority" -> o.defaultTaskPriority.asJson, "defaultTaskList" -> o.defaultTaskList.asJson, "defaultChildPolicy" -> o.defaultChildPolicy.asJson, "defaultLambdaRole" -> o.defaultLambdaRole.asJson, "description" -> o.description.asJson)
  }
  final implicit val ExternalWorkflowExecutionSignaledEventAttributesEncoder: io.circe.Encoder[models.ExternalWorkflowExecutionSignaledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "initiatedEventId" -> o.initiatedEventId.asJson)
  }
  final implicit val ActivityTaskStartedEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskStartedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "identity" -> o.identity.asJson)
  }
  final implicit val RequestCancelExternalWorkflowExecutionInitiatedEventAttributesEncoder: io.circe.Encoder[models.RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowId" -> o.workflowId.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "runId" -> o.runId.asJson, "control" -> o.control.asJson)
  }
  final implicit val RequestCancelActivityTaskFailedEventAttributesEncoder: io.circe.Encoder[models.RequestCancelActivityTaskFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("activityId" -> o.activityId.asJson, "cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val FailWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.FailWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val LambdaFunctionCompletedEventAttributesEncoder: io.circe.Encoder[models.LambdaFunctionCompletedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "result" -> o.result.asJson)
  }
  final implicit val DomainInfoEncoder: io.circe.Encoder[models.DomainInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "status" -> o.status.asJson, "description" -> o.description.asJson)
  }
  final implicit val DefaultUndefinedFaultEncoder: io.circe.Encoder[models.DefaultUndefinedFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val WorkflowExecutionSignaledEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionSignaledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("signalName" -> o.signalName.asJson, "input" -> o.input.asJson, "externalWorkflowExecution" -> o.externalWorkflowExecution.asJson, "externalInitiatedEventId" -> o.externalInitiatedEventId.asJson)
  }
  final implicit val WorkflowExecutionInfoEncoder: io.circe.Encoder[models.WorkflowExecutionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("startTimestamp" -> o.startTimestamp.asJson, "executionStatus" -> o.executionStatus.asJson, "execution" -> o.execution.asJson, "workflowType" -> o.workflowType.asJson, "closeTimestamp" -> o.closeTimestamp.asJson, "tagList" -> o.tagList.asJson, "closeStatus" -> o.closeStatus.asJson, "parent" -> o.parent.asJson, "cancelRequested" -> o.cancelRequested.asJson)
  }
  final implicit val WorkflowExecutionStartedEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionStartedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("taskList" -> o.taskList.asJson, "childPolicy" -> o.childPolicy.asJson, "workflowType" -> o.workflowType.asJson, "executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "parentInitiatedEventId" -> o.parentInitiatedEventId.asJson, "tagList" -> o.tagList.asJson, "parentWorkflowExecution" -> o.parentWorkflowExecution.asJson, "input" -> o.input.asJson, "lambdaRole" -> o.lambdaRole.asJson, "continuedExecutionRunId" -> o.continuedExecutionRunId.asJson)
  }
  final implicit val StartLambdaFunctionFailedEventAttributesEncoder: io.circe.Encoder[models.StartLambdaFunctionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "cause" -> o.cause.asJson, "message" -> o.message.asJson)
  }
  final implicit val DomainDeprecatedFaultEncoder: io.circe.Encoder[models.DomainDeprecatedFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ActivityTypeConfigurationEncoder: io.circe.Encoder[models.ActivityTypeConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("defaultTaskStartToCloseTimeout" -> o.defaultTaskStartToCloseTimeout.asJson, "defaultTaskHeartbeatTimeout" -> o.defaultTaskHeartbeatTimeout.asJson, "defaultTaskScheduleToStartTimeout" -> o.defaultTaskScheduleToStartTimeout.asJson, "defaultTaskScheduleToCloseTimeout" -> o.defaultTaskScheduleToCloseTimeout.asJson, "defaultTaskList" -> o.defaultTaskList.asJson, "defaultTaskPriority" -> o.defaultTaskPriority.asJson)
  }
  final implicit val RecordActivityTaskHeartbeatInputEncoder: io.circe.Encoder[models.RecordActivityTaskHeartbeatInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "details" -> o.details.asJson)
  }
  final implicit val WorkflowExecutionTerminatedEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionTerminatedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("childPolicy" -> o.childPolicy.asJson, "reason" -> o.reason.asJson, "details" -> o.details.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val TagFilterEncoder: io.circe.Encoder[models.TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("tag" -> o.tag.asJson)
  }
  final implicit val WorkflowExecutionCompletedEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionCompletedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "result" -> o.result.asJson)
  }
  final implicit val ListActivityTypesInputEncoder: io.circe.Encoder[models.ListActivityTypesInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "registrationStatus" -> o.registrationStatus.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson, "name" -> o.name.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val MarkerRecordedEventAttributesEncoder: io.circe.Encoder[models.MarkerRecordedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("markerName" -> o.markerName.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "details" -> o.details.asJson)
  }
  final implicit val CancelTimerFailedEventAttributesEncoder: io.circe.Encoder[models.CancelTimerFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson, "cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val WorkflowExecutionCanceledEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionCanceledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "details" -> o.details.asJson)
  }
  final implicit val StartTimerFailedEventAttributesEncoder: io.circe.Encoder[models.StartTimerFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson, "cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val ActivityTypeDetailEncoder: io.circe.Encoder[models.ActivityTypeDetail] = io.circe.Encoder.instance { o => 
    Json.obj("typeInfo" -> o.typeInfo.asJson, "configuration" -> o.configuration.asJson)
  }
  final implicit val RegisterActivityTypeInputEncoder: io.circe.Encoder[models.RegisterActivityTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson, "domain" -> o.domain.asJson, "defaultTaskStartToCloseTimeout" -> o.defaultTaskStartToCloseTimeout.asJson, "defaultTaskHeartbeatTimeout" -> o.defaultTaskHeartbeatTimeout.asJson, "defaultTaskScheduleToStartTimeout" -> o.defaultTaskScheduleToStartTimeout.asJson, "defaultTaskScheduleToCloseTimeout" -> o.defaultTaskScheduleToCloseTimeout.asJson, "defaultTaskPriority" -> o.defaultTaskPriority.asJson, "defaultTaskList" -> o.defaultTaskList.asJson, "description" -> o.description.asJson)
  }
  final implicit val TimerFiredEventAttributesEncoder: io.circe.Encoder[models.TimerFiredEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson, "startedEventId" -> o.startedEventId.asJson)
  }
  final implicit val WorkflowExecutionOpenCountsEncoder: io.circe.Encoder[models.WorkflowExecutionOpenCounts] = io.circe.Encoder.instance { o => 
    Json.obj("openActivityTasks" -> o.openActivityTasks.asJson, "openTimers" -> o.openTimers.asJson, "openChildWorkflowExecutions" -> o.openChildWorkflowExecutions.asJson, "openDecisionTasks" -> o.openDecisionTasks.asJson, "openLambdaFunctions" -> o.openLambdaFunctions.asJson)
  }
  final implicit val CountPendingDecisionTasksInputEncoder: io.circe.Encoder[models.CountPendingDecisionTasksInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "taskList" -> o.taskList.asJson)
  }
  final implicit val ActivityTaskCompletedEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskCompletedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "result" -> o.result.asJson)
  }
  final implicit val HistoryEventEncoder: io.circe.Encoder[models.HistoryEvent] = io.circe.Encoder.instance { o => 
    Json.obj("eventTimestamp" -> o.eventTimestamp.asJson, "eventType" -> o.eventType.asJson, "eventId" -> o.eventId.asJson, "startChildWorkflowExecutionInitiatedEventAttributes" -> o.startChildWorkflowExecutionInitiatedEventAttributes.asJson, "decisionTaskTimedOutEventAttributes" -> o.decisionTaskTimedOutEventAttributes.asJson, "activityTaskCanceledEventAttributes" -> o.activityTaskCanceledEventAttributes.asJson, "childWorkflowExecutionTerminatedEventAttributes" -> o.childWorkflowExecutionTerminatedEventAttributes.asJson, "scheduleLambdaFunctionFailedEventAttributes" -> o.scheduleLambdaFunctionFailedEventAttributes.asJson, "externalWorkflowExecutionSignaledEventAttributes" -> o.externalWorkflowExecutionSignaledEventAttributes.asJson, "activityTaskStartedEventAttributes" -> o.activityTaskStartedEventAttributes.asJson, "requestCancelExternalWorkflowExecutionInitiatedEventAttributes" -> o.requestCancelExternalWorkflowExecutionInitiatedEventAttributes.asJson, "requestCancelActivityTaskFailedEventAttributes" -> o.requestCancelActivityTaskFailedEventAttributes.asJson, "failWorkflowExecutionFailedEventAttributes" -> o.failWorkflowExecutionFailedEventAttributes.asJson, "lambdaFunctionCompletedEventAttributes" -> o.lambdaFunctionCompletedEventAttributes.asJson, "workflowExecutionSignaledEventAttributes" -> o.workflowExecutionSignaledEventAttributes.asJson, "workflowExecutionStartedEventAttributes" -> o.workflowExecutionStartedEventAttributes.asJson, "startLambdaFunctionFailedEventAttributes" -> o.startLambdaFunctionFailedEventAttributes.asJson, "workflowExecutionTerminatedEventAttributes" -> o.workflowExecutionTerminatedEventAttributes.asJson, "workflowExecutionCompletedEventAttributes" -> o.workflowExecutionCompletedEventAttributes.asJson, "markerRecordedEventAttributes" -> o.markerRecordedEventAttributes.asJson, "cancelTimerFailedEventAttributes" -> o.cancelTimerFailedEventAttributes.asJson, "workflowExecutionCanceledEventAttributes" -> o.workflowExecutionCanceledEventAttributes.asJson, "startTimerFailedEventAttributes" -> o.startTimerFailedEventAttributes.asJson, "timerFiredEventAttributes" -> o.timerFiredEventAttributes.asJson, "activityTaskCompletedEventAttributes" -> o.activityTaskCompletedEventAttributes.asJson, "workflowExecutionFailedEventAttributes" -> o.workflowExecutionFailedEventAttributes.asJson, "cancelWorkflowExecutionFailedEventAttributes" -> o.cancelWorkflowExecutionFailedEventAttributes.asJson, "externalWorkflowExecutionCancelRequestedEventAttributes" -> o.externalWorkflowExecutionCancelRequestedEventAttributes.asJson, "timerCanceledEventAttributes" -> o.timerCanceledEventAttributes.asJson, "signalExternalWorkflowExecutionFailedEventAttributes" -> o.signalExternalWorkflowExecutionFailedEventAttributes.asJson, "workflowExecutionContinuedAsNewEventAttributes" -> o.workflowExecutionContinuedAsNewEventAttributes.asJson, "lambdaFunctionFailedEventAttributes" -> o.lambdaFunctionFailedEventAttributes.asJson, "decisionTaskCompletedEventAttributes" -> o.decisionTaskCompletedEventAttributes.asJson, "childWorkflowExecutionTimedOutEventAttributes" -> o.childWorkflowExecutionTimedOutEventAttributes.asJson, "decisionTaskStartedEventAttributes" -> o.decisionTaskStartedEventAttributes.asJson, "completeWorkflowExecutionFailedEventAttributes" -> o.completeWorkflowExecutionFailedEventAttributes.asJson, "childWorkflowExecutionCanceledEventAttributes" -> o.childWorkflowExecutionCanceledEventAttributes.asJson, "timerStartedEventAttributes" -> o.timerStartedEventAttributes.asJson, "workflowExecutionCancelRequestedEventAttributes" -> o.workflowExecutionCancelRequestedEventAttributes.asJson, "workflowExecutionTimedOutEventAttributes" -> o.workflowExecutionTimedOutEventAttributes.asJson, "scheduleActivityTaskFailedEventAttributes" -> o.scheduleActivityTaskFailedEventAttributes.asJson, "requestCancelExternalWorkflowExecutionFailedEventAttributes" -> o.requestCancelExternalWorkflowExecutionFailedEventAttributes.asJson, "startChildWorkflowExecutionFailedEventAttributes" -> o.startChildWorkflowExecutionFailedEventAttributes.asJson, "recordMarkerFailedEventAttributes" -> o.recordMarkerFailedEventAttributes.asJson, "childWorkflowExecutionFailedEventAttributes" -> o.childWorkflowExecutionFailedEventAttributes.asJson, "activityTaskScheduledEventAttributes" -> o.activityTaskScheduledEventAttributes.asJson, "lambdaFunctionStartedEventAttributes" -> o.lambdaFunctionStartedEventAttributes.asJson, "activityTaskFailedEventAttributes" -> o.activityTaskFailedEventAttributes.asJson, "lambdaFunctionTimedOutEventAttributes" -> o.lambdaFunctionTimedOutEventAttributes.asJson, "activityTaskCancelRequestedEventAttributes" -> o.activityTaskCancelRequestedEventAttributes.asJson, "childWorkflowExecutionCompletedEventAttributes" -> o.childWorkflowExecutionCompletedEventAttributes.asJson, "childWorkflowExecutionStartedEventAttributes" -> o.childWorkflowExecutionStartedEventAttributes.asJson, "continueAsNewWorkflowExecutionFailedEventAttributes" -> o.continueAsNewWorkflowExecutionFailedEventAttributes.asJson, "signalExternalWorkflowExecutionInitiatedEventAttributes" -> o.signalExternalWorkflowExecutionInitiatedEventAttributes.asJson, "decisionTaskScheduledEventAttributes" -> o.decisionTaskScheduledEventAttributes.asJson, "activityTaskTimedOutEventAttributes" -> o.activityTaskTimedOutEventAttributes.asJson, "lambdaFunctionScheduledEventAttributes" -> o.lambdaFunctionScheduledEventAttributes.asJson)
  }
  final implicit val HistoryEncoder: io.circe.Encoder[models.History] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val SignalWorkflowExecutionInputEncoder: io.circe.Encoder[models.SignalWorkflowExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "workflowId" -> o.workflowId.asJson, "signalName" -> o.signalName.asJson, "input" -> o.input.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val WorkflowTypeInfosEncoder: io.circe.Encoder[models.WorkflowTypeInfos] = io.circe.Encoder.instance { o => 
    Json.obj("typeInfos" -> o.typeInfos.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val StartWorkflowExecutionInputEncoder: io.circe.Encoder[models.StartWorkflowExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "workflowId" -> o.workflowId.asJson, "workflowType" -> o.workflowType.asJson, "executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "taskList" -> o.taskList.asJson, "tagList" -> o.tagList.asJson, "childPolicy" -> o.childPolicy.asJson, "input" -> o.input.asJson, "lambdaRole" -> o.lambdaRole.asJson)
  }
  final implicit val WorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "reason" -> o.reason.asJson, "details" -> o.details.asJson)
  }
  final implicit val CancelWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.CancelWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val TypeDeprecatedFaultEncoder: io.circe.Encoder[models.TypeDeprecatedFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExternalWorkflowExecutionCancelRequestedEventAttributesEncoder: io.circe.Encoder[models.ExternalWorkflowExecutionCancelRequestedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "initiatedEventId" -> o.initiatedEventId.asJson)
  }
  final implicit val DescribeActivityTypeInputEncoder: io.circe.Encoder[models.DescribeActivityTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "activityType" -> o.activityType.asJson)
  }
  final implicit val TimerCanceledEventAttributesEncoder: io.circe.Encoder[models.TimerCanceledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson, "startedEventId" -> o.startedEventId.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val DescribeWorkflowExecutionInputEncoder: io.circe.Encoder[models.DescribeWorkflowExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "execution" -> o.execution.asJson)
  }
  final implicit val StartChildWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.StartChildWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowId" -> o.workflowId.asJson, "workflowType" -> o.workflowType.asJson, "executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "taskList" -> o.taskList.asJson, "tagList" -> o.tagList.asJson, "childPolicy" -> o.childPolicy.asJson, "control" -> o.control.asJson, "input" -> o.input.asJson, "lambdaRole" -> o.lambdaRole.asJson)
  }
  final implicit val GetWorkflowExecutionHistoryInputEncoder: io.circe.Encoder[models.GetWorkflowExecutionHistoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "execution" -> o.execution.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DomainInfosEncoder: io.circe.Encoder[models.DomainInfos] = io.circe.Encoder.instance { o => 
    Json.obj("domainInfos" -> o.domainInfos.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val CompleteWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.CompleteWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("result" -> o.result.asJson)
  }
  final implicit val WorkflowTypeInfoEncoder: io.circe.Encoder[models.WorkflowTypeInfo] = io.circe.Encoder.instance { o => 
    Json.obj("workflowType" -> o.workflowType.asJson, "status" -> o.status.asJson, "creationDate" -> o.creationDate.asJson, "deprecationDate" -> o.deprecationDate.asJson, "description" -> o.description.asJson)
  }
  final implicit val SignalExternalWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.SignalExternalWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("cause" -> o.cause.asJson, "initiatedEventId" -> o.initiatedEventId.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "workflowId" -> o.workflowId.asJson, "control" -> o.control.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val WorkflowExecutionContinuedAsNewEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionContinuedAsNewEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "taskList" -> o.taskList.asJson, "childPolicy" -> o.childPolicy.asJson, "newExecutionRunId" -> o.newExecutionRunId.asJson, "workflowType" -> o.workflowType.asJson, "executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "tagList" -> o.tagList.asJson, "input" -> o.input.asJson, "lambdaRole" -> o.lambdaRole.asJson)
  }
  final implicit val LambdaFunctionFailedEventAttributesEncoder: io.circe.Encoder[models.LambdaFunctionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "reason" -> o.reason.asJson, "details" -> o.details.asJson)
  }
  final implicit val TypeAlreadyExistsFaultEncoder: io.circe.Encoder[models.TypeAlreadyExistsFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeWorkflowTypeInputEncoder: io.circe.Encoder[models.DescribeWorkflowTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "workflowType" -> o.workflowType.asJson)
  }
  final implicit val DecisionTaskCompletedEventAttributesEncoder: io.circe.Encoder[models.DecisionTaskCompletedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "executionContext" -> o.executionContext.asJson)
  }
  final implicit val PendingTaskCountEncoder: io.circe.Encoder[models.PendingTaskCount] = io.circe.Encoder.instance { o => 
    Json.obj("count" -> o.count.asJson, "truncated" -> o.truncated.asJson)
  }
  final implicit val DomainDetailEncoder: io.circe.Encoder[models.DomainDetail] = io.circe.Encoder.instance { o => 
    Json.obj("domainInfo" -> o.domainInfo.asJson, "configuration" -> o.configuration.asJson)
  }
  final implicit val ScheduleLambdaFunctionDecisionAttributesEncoder: io.circe.Encoder[models.ScheduleLambdaFunctionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "startToCloseTimeout" -> o.startToCloseTimeout.asJson, "input" -> o.input.asJson, "control" -> o.control.asJson)
  }
  final implicit val OperationNotPermittedFaultEncoder: io.circe.Encoder[models.OperationNotPermittedFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TaskListEncoder: io.circe.Encoder[models.TaskList] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val ListOpenWorkflowExecutionsInputEncoder: io.circe.Encoder[models.ListOpenWorkflowExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("startTimeFilter" -> o.startTimeFilter.asJson, "domain" -> o.domain.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson, "tagFilter" -> o.tagFilter.asJson, "typeFilter" -> o.typeFilter.asJson, "executionFilter" -> o.executionFilter.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ChildWorkflowExecutionTimedOutEventAttributesEncoder: io.circe.Encoder[models.ChildWorkflowExecutionTimedOutEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "workflowType" -> o.workflowType.asJson, "timeoutType" -> o.timeoutType.asJson, "initiatedEventId" -> o.initiatedEventId.asJson, "startedEventId" -> o.startedEventId.asJson)
  }
  final implicit val DecisionTaskStartedEventAttributesEncoder: io.circe.Encoder[models.DecisionTaskStartedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "identity" -> o.identity.asJson)
  }
  final implicit val ListClosedWorkflowExecutionsInputEncoder: io.circe.Encoder[models.ListClosedWorkflowExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "startTimeFilter" -> o.startTimeFilter.asJson, "closeTimeFilter" -> o.closeTimeFilter.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson, "tagFilter" -> o.tagFilter.asJson, "closeStatusFilter" -> o.closeStatusFilter.asJson, "typeFilter" -> o.typeFilter.asJson, "executionFilter" -> o.executionFilter.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DomainConfigurationEncoder: io.circe.Encoder[models.DomainConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecutionRetentionPeriodInDays" -> o.workflowExecutionRetentionPeriodInDays.asJson)
  }
  final implicit val ListDomainsInputEncoder: io.circe.Encoder[models.ListDomainsInput] = io.circe.Encoder.instance { o => 
    Json.obj("registrationStatus" -> o.registrationStatus.asJson, "nextPageToken" -> o.nextPageToken.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson)
  }
  final implicit val DomainAlreadyExistsFaultEncoder: io.circe.Encoder[models.DomainAlreadyExistsFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CompleteWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.CompleteWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val ChildWorkflowExecutionCanceledEventAttributesEncoder: io.circe.Encoder[models.ChildWorkflowExecutionCanceledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "workflowType" -> o.workflowType.asJson, "initiatedEventId" -> o.initiatedEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "details" -> o.details.asJson)
  }
  final implicit val TimerStartedEventAttributesEncoder: io.circe.Encoder[models.TimerStartedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson, "startToFireTimeout" -> o.startToFireTimeout.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "control" -> o.control.asJson)
  }
  final implicit val CloseStatusFilterEncoder: io.circe.Encoder[models.CloseStatusFilter] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val RecordMarkerDecisionAttributesEncoder: io.circe.Encoder[models.RecordMarkerDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("markerName" -> o.markerName.asJson, "details" -> o.details.asJson)
  }
  final implicit val WorkflowExecutionCancelRequestedEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionCancelRequestedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("externalWorkflowExecution" -> o.externalWorkflowExecution.asJson, "externalInitiatedEventId" -> o.externalInitiatedEventId.asJson, "cause" -> o.cause.asJson)
  }
  final implicit val ActivityTypeInfoEncoder: io.circe.Encoder[models.ActivityTypeInfo] = io.circe.Encoder.instance { o => 
    Json.obj("activityType" -> o.activityType.asJson, "status" -> o.status.asJson, "creationDate" -> o.creationDate.asJson, "deprecationDate" -> o.deprecationDate.asJson, "description" -> o.description.asJson)
  }
  final implicit val WorkflowExecutionTimedOutEventAttributesEncoder: io.circe.Encoder[models.WorkflowExecutionTimedOutEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timeoutType" -> o.timeoutType.asJson, "childPolicy" -> o.childPolicy.asJson)
  }
  final implicit val ScheduleActivityTaskFailedEventAttributesEncoder: io.circe.Encoder[models.ScheduleActivityTaskFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("activityType" -> o.activityType.asJson, "activityId" -> o.activityId.asJson, "cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val DescribeDomainInputEncoder: io.circe.Encoder[models.DescribeDomainInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val DecisionTaskEncoder: io.circe.Encoder[models.DecisionTask] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "startedEventId" -> o.startedEventId.asJson, "workflowExecution" -> o.workflowExecution.asJson, "taskToken" -> o.taskToken.asJson, "workflowType" -> o.workflowType.asJson, "previousStartedEventId" -> o.previousStartedEventId.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val ContinueAsNewWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.ContinueAsNewWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "workflowTypeVersion" -> o.workflowTypeVersion.asJson, "taskList" -> o.taskList.asJson, "tagList" -> o.tagList.asJson, "childPolicy" -> o.childPolicy.asJson, "input" -> o.input.asJson, "lambdaRole" -> o.lambdaRole.asJson)
  }
  final implicit val WorkflowTypeFilterEncoder: io.circe.Encoder[models.WorkflowTypeFilter] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson)
  }
  final implicit val RequestCancelExternalWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.RequestCancelExternalWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("initiatedEventId" -> o.initiatedEventId.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "workflowId" -> o.workflowId.asJson, "cause" -> o.cause.asJson, "control" -> o.control.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val PollForActivityTaskInputEncoder: io.circe.Encoder[models.PollForActivityTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "taskList" -> o.taskList.asJson, "identity" -> o.identity.asJson)
  }
  final implicit val WorkflowExecutionFilterEncoder: io.circe.Encoder[models.WorkflowExecutionFilter] = io.circe.Encoder.instance { o => 
    Json.obj("workflowId" -> o.workflowId.asJson)
  }
  final implicit val StartChildWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.StartChildWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("cause" -> o.cause.asJson, "initiatedEventId" -> o.initiatedEventId.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "workflowId" -> o.workflowId.asJson, "workflowType" -> o.workflowType.asJson, "control" -> o.control.asJson)
  }
  final implicit val WorkflowTypeDetailEncoder: io.circe.Encoder[models.WorkflowTypeDetail] = io.circe.Encoder.instance { o => 
    Json.obj("typeInfo" -> o.typeInfo.asJson, "configuration" -> o.configuration.asJson)
  }
  final implicit val WorkflowExecutionConfigurationEncoder: io.circe.Encoder[models.WorkflowExecutionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("taskList" -> o.taskList.asJson, "taskStartToCloseTimeout" -> o.taskStartToCloseTimeout.asJson, "executionStartToCloseTimeout" -> o.executionStartToCloseTimeout.asJson, "childPolicy" -> o.childPolicy.asJson, "taskPriority" -> o.taskPriority.asJson, "lambdaRole" -> o.lambdaRole.asJson)
  }
  final implicit val FailWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.FailWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("reason" -> o.reason.asJson, "details" -> o.details.asJson)
  }
  final implicit val RespondActivityTaskFailedInputEncoder: io.circe.Encoder[models.RespondActivityTaskFailedInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "reason" -> o.reason.asJson, "details" -> o.details.asJson)
  }
  final implicit val WorkflowExecutionEncoder: io.circe.Encoder[models.WorkflowExecution] = io.circe.Encoder.instance { o => 
    Json.obj("workflowId" -> o.workflowId.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val WorkflowTypeConfigurationEncoder: io.circe.Encoder[models.WorkflowTypeConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("defaultTaskStartToCloseTimeout" -> o.defaultTaskStartToCloseTimeout.asJson, "defaultExecutionStartToCloseTimeout" -> o.defaultExecutionStartToCloseTimeout.asJson, "defaultTaskPriority" -> o.defaultTaskPriority.asJson, "defaultTaskList" -> o.defaultTaskList.asJson, "defaultChildPolicy" -> o.defaultChildPolicy.asJson, "defaultLambdaRole" -> o.defaultLambdaRole.asJson)
  }
  final implicit val UnknownResourceFaultEncoder: io.circe.Encoder[models.UnknownResourceFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RecordMarkerFailedEventAttributesEncoder: io.circe.Encoder[models.RecordMarkerFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("markerName" -> o.markerName.asJson, "cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val WorkflowExecutionAlreadyStartedFaultEncoder: io.circe.Encoder[models.WorkflowExecutionAlreadyStartedFault] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ChildWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.ChildWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("initiatedEventId" -> o.initiatedEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "workflowExecution" -> o.workflowExecution.asJson, "workflowType" -> o.workflowType.asJson, "reason" -> o.reason.asJson, "details" -> o.details.asJson)
  }
  final implicit val ActivityTaskScheduledEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskScheduledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "taskList" -> o.taskList.asJson, "activityId" -> o.activityId.asJson, "activityType" -> o.activityType.asJson, "scheduleToStartTimeout" -> o.scheduleToStartTimeout.asJson, "scheduleToCloseTimeout" -> o.scheduleToCloseTimeout.asJson, "startToCloseTimeout" -> o.startToCloseTimeout.asJson, "heartbeatTimeout" -> o.heartbeatTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "input" -> o.input.asJson, "control" -> o.control.asJson)
  }
  final implicit val ActivityTaskStatusEncoder: io.circe.Encoder[models.ActivityTaskStatus] = io.circe.Encoder.instance { o => 
    Json.obj("cancelRequested" -> o.cancelRequested.asJson)
  }
  final implicit val DeprecateDomainInputEncoder: io.circe.Encoder[models.DeprecateDomainInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val DecisionEncoder: io.circe.Encoder[models.Decision] = io.circe.Encoder.instance { o => 
    Json.obj("decisionType" -> o.decisionType.asJson, "signalExternalWorkflowExecutionDecisionAttributes" -> o.signalExternalWorkflowExecutionDecisionAttributes.asJson, "requestCancelActivityTaskDecisionAttributes" -> o.requestCancelActivityTaskDecisionAttributes.asJson, "startChildWorkflowExecutionDecisionAttributes" -> o.startChildWorkflowExecutionDecisionAttributes.asJson, "completeWorkflowExecutionDecisionAttributes" -> o.completeWorkflowExecutionDecisionAttributes.asJson, "scheduleLambdaFunctionDecisionAttributes" -> o.scheduleLambdaFunctionDecisionAttributes.asJson, "recordMarkerDecisionAttributes" -> o.recordMarkerDecisionAttributes.asJson, "continueAsNewWorkflowExecutionDecisionAttributes" -> o.continueAsNewWorkflowExecutionDecisionAttributes.asJson, "failWorkflowExecutionDecisionAttributes" -> o.failWorkflowExecutionDecisionAttributes.asJson, "requestCancelExternalWorkflowExecutionDecisionAttributes" -> o.requestCancelExternalWorkflowExecutionDecisionAttributes.asJson, "scheduleActivityTaskDecisionAttributes" -> o.scheduleActivityTaskDecisionAttributes.asJson, "cancelTimerDecisionAttributes" -> o.cancelTimerDecisionAttributes.asJson, "cancelWorkflowExecutionDecisionAttributes" -> o.cancelWorkflowExecutionDecisionAttributes.asJson, "startTimerDecisionAttributes" -> o.startTimerDecisionAttributes.asJson)
  }
  final implicit val RequestCancelExternalWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.RequestCancelExternalWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowId" -> o.workflowId.asJson, "runId" -> o.runId.asJson, "control" -> o.control.asJson)
  }
  final implicit val LambdaFunctionStartedEventAttributesEncoder: io.circe.Encoder[models.LambdaFunctionStartedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson)
  }
  final implicit val ActivityTaskFailedEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "reason" -> o.reason.asJson, "details" -> o.details.asJson)
  }
  final implicit val DeprecateWorkflowTypeInputEncoder: io.circe.Encoder[models.DeprecateWorkflowTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "workflowType" -> o.workflowType.asJson)
  }
  final implicit val LambdaFunctionTimedOutEventAttributesEncoder: io.circe.Encoder[models.LambdaFunctionTimedOutEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "timeoutType" -> o.timeoutType.asJson)
  }
  final implicit val RegisterDomainInputEncoder: io.circe.Encoder[models.RegisterDomainInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "workflowExecutionRetentionPeriodInDays" -> o.workflowExecutionRetentionPeriodInDays.asJson, "description" -> o.description.asJson)
  }
  final implicit val ActivityTaskEncoder: io.circe.Encoder[models.ActivityTask] = io.circe.Encoder.instance { o => 
    Json.obj("startedEventId" -> o.startedEventId.asJson, "workflowExecution" -> o.workflowExecution.asJson, "activityId" -> o.activityId.asJson, "activityType" -> o.activityType.asJson, "taskToken" -> o.taskToken.asJson, "input" -> o.input.asJson)
  }
  final implicit val ActivityTypeEncoder: io.circe.Encoder[models.ActivityType] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson)
  }
  final implicit val TerminateWorkflowExecutionInputEncoder: io.circe.Encoder[models.TerminateWorkflowExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "workflowId" -> o.workflowId.asJson, "childPolicy" -> o.childPolicy.asJson, "details" -> o.details.asJson, "reason" -> o.reason.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val RespondActivityTaskCanceledInputEncoder: io.circe.Encoder[models.RespondActivityTaskCanceledInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "details" -> o.details.asJson)
  }
  final implicit val WorkflowExecutionDetailEncoder: io.circe.Encoder[models.WorkflowExecutionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("executionInfo" -> o.executionInfo.asJson, "openCounts" -> o.openCounts.asJson, "executionConfiguration" -> o.executionConfiguration.asJson, "latestActivityTaskTimestamp" -> o.latestActivityTaskTimestamp.asJson, "latestExecutionContext" -> o.latestExecutionContext.asJson)
  }
  final implicit val ScheduleActivityTaskDecisionAttributesEncoder: io.circe.Encoder[models.ScheduleActivityTaskDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("activityId" -> o.activityId.asJson, "activityType" -> o.activityType.asJson, "scheduleToCloseTimeout" -> o.scheduleToCloseTimeout.asJson, "scheduleToStartTimeout" -> o.scheduleToStartTimeout.asJson, "startToCloseTimeout" -> o.startToCloseTimeout.asJson, "heartbeatTimeout" -> o.heartbeatTimeout.asJson, "taskPriority" -> o.taskPriority.asJson, "taskList" -> o.taskList.asJson, "control" -> o.control.asJson, "input" -> o.input.asJson)
  }
  final implicit val ActivityTaskCancelRequestedEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskCancelRequestedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "activityId" -> o.activityId.asJson)
  }
  final implicit val ChildWorkflowExecutionCompletedEventAttributesEncoder: io.circe.Encoder[models.ChildWorkflowExecutionCompletedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "workflowType" -> o.workflowType.asJson, "initiatedEventId" -> o.initiatedEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "result" -> o.result.asJson)
  }
  final implicit val ChildWorkflowExecutionStartedEventAttributesEncoder: io.circe.Encoder[models.ChildWorkflowExecutionStartedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("workflowExecution" -> o.workflowExecution.asJson, "workflowType" -> o.workflowType.asJson, "initiatedEventId" -> o.initiatedEventId.asJson)
  }
  final implicit val RunEncoder: io.circe.Encoder[models.Run] = io.circe.Encoder.instance { o => 
    Json.obj("runId" -> o.runId.asJson)
  }
  final implicit val ContinueAsNewWorkflowExecutionFailedEventAttributesEncoder: io.circe.Encoder[models.ContinueAsNewWorkflowExecutionFailedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("cause" -> o.cause.asJson, "decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson)
  }
  final implicit val SignalExternalWorkflowExecutionInitiatedEventAttributesEncoder: io.circe.Encoder[models.SignalExternalWorkflowExecutionInitiatedEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "workflowId" -> o.workflowId.asJson, "signalName" -> o.signalName.asJson, "input" -> o.input.asJson, "control" -> o.control.asJson, "runId" -> o.runId.asJson)
  }
  final implicit val RespondActivityTaskCompletedInputEncoder: io.circe.Encoder[models.RespondActivityTaskCompletedInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "result" -> o.result.asJson)
  }
  final implicit val DeprecateActivityTypeInputEncoder: io.circe.Encoder[models.DeprecateActivityTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "activityType" -> o.activityType.asJson)
  }
  final implicit val PollForDecisionTaskInputEncoder: io.circe.Encoder[models.PollForDecisionTaskInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "taskList" -> o.taskList.asJson, "maximumPageSize" -> o.maximumPageSize.asJson, "reverseOrder" -> o.reverseOrder.asJson, "identity" -> o.identity.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DecisionTaskScheduledEventAttributesEncoder: io.circe.Encoder[models.DecisionTaskScheduledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("taskList" -> o.taskList.asJson, "taskPriority" -> o.taskPriority.asJson, "startToCloseTimeout" -> o.startToCloseTimeout.asJson)
  }
  final implicit val CancelTimerDecisionAttributesEncoder: io.circe.Encoder[models.CancelTimerDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson)
  }
  final implicit val CancelWorkflowExecutionDecisionAttributesEncoder: io.circe.Encoder[models.CancelWorkflowExecutionDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("details" -> o.details.asJson)
  }
  final implicit val ActivityTaskTimedOutEventAttributesEncoder: io.circe.Encoder[models.ActivityTaskTimedOutEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timeoutType" -> o.timeoutType.asJson, "scheduledEventId" -> o.scheduledEventId.asJson, "startedEventId" -> o.startedEventId.asJson, "details" -> o.details.asJson)
  }
  final implicit val CountPendingActivityTasksInputEncoder: io.circe.Encoder[models.CountPendingActivityTasksInput] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson, "taskList" -> o.taskList.asJson)
  }
  final implicit val StartTimerDecisionAttributesEncoder: io.circe.Encoder[models.StartTimerDecisionAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("timerId" -> o.timerId.asJson, "startToFireTimeout" -> o.startToFireTimeout.asJson, "control" -> o.control.asJson)
  }
  final implicit val RespondDecisionTaskCompletedInputEncoder: io.circe.Encoder[models.RespondDecisionTaskCompletedInput] = io.circe.Encoder.instance { o => 
    Json.obj("taskToken" -> o.taskToken.asJson, "decisions" -> o.decisions.asJson, "executionContext" -> o.executionContext.asJson)
  }
  final implicit val WorkflowTypeEncoder: io.circe.Encoder[models.WorkflowType] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson)
  }
  final implicit val CountOpenWorkflowExecutionsInputEncoder: io.circe.Encoder[models.CountOpenWorkflowExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("startTimeFilter" -> o.startTimeFilter.asJson, "domain" -> o.domain.asJson, "tagFilter" -> o.tagFilter.asJson, "typeFilter" -> o.typeFilter.asJson, "executionFilter" -> o.executionFilter.asJson)
  }
  final implicit val WorkflowExecutionInfosEncoder: io.circe.Encoder[models.WorkflowExecutionInfos] = io.circe.Encoder.instance { o => 
    Json.obj("executionInfos" -> o.executionInfos.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val LambdaFunctionScheduledEventAttributesEncoder: io.circe.Encoder[models.LambdaFunctionScheduledEventAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("decisionTaskCompletedEventId" -> o.decisionTaskCompletedEventId.asJson, "id" -> o.id.asJson, "name" -> o.name.asJson, "startToCloseTimeout" -> o.startToCloseTimeout.asJson, "input" -> o.input.asJson, "control" -> o.control.asJson)
  }
  final implicit val StartChildWorkflowExecutionInitiatedEventAttributesDecoder: io.circe.Decoder[models.StartChildWorkflowExecutionInitiatedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[models.TaskList]("taskList"), o.get[java.lang.String]("workflowId"), o.get[java.lang.String]("childPolicy"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("executionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[java.lang.String]]("control"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("lambdaRole")).mapN(models.StartChildWorkflowExecutionInitiatedEventAttributes.apply _)
  }
  final implicit val ActivityTypeInfosDecoder: io.circe.Decoder[models.ActivityTypeInfos] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.ActivityTypeInfo]]("typeInfos"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.ActivityTypeInfos.apply _)
  }
  final implicit val WorkflowExecutionCountDecoder: io.circe.Decoder[models.WorkflowExecutionCount] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("count"), o.get[scala.Option[scala.Boolean]]("truncated")).mapN(models.WorkflowExecutionCount.apply _)
  }
  final implicit val RequestCancelWorkflowExecutionInputDecoder: io.circe.Decoder[models.RequestCancelWorkflowExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[java.lang.String]("workflowId"), o.get[scala.Option[java.lang.String]]("runId")).mapN(models.RequestCancelWorkflowExecutionInput.apply _)
  }
  final implicit val DecisionTaskTimedOutEventAttributesDecoder: io.circe.Decoder[models.DecisionTaskTimedOutEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timeoutType"), o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId")).mapN(models.DecisionTaskTimedOutEventAttributes.apply _)
  }
  final implicit val ActivityTaskCanceledEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskCanceledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[scala.Long]]("latestCancelRequestedEventId"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.ActivityTaskCanceledEventAttributes.apply _)
  }
  final implicit val CountClosedWorkflowExecutionsInputDecoder: io.circe.Decoder[models.CountClosedWorkflowExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[scala.Option[models.ExecutionTimeFilter]]("startTimeFilter"), o.get[scala.Option[models.ExecutionTimeFilter]]("closeTimeFilter"), o.get[scala.Option[models.TagFilter]]("tagFilter"), o.get[scala.Option[models.CloseStatusFilter]]("closeStatusFilter"), o.get[scala.Option[models.WorkflowTypeFilter]]("typeFilter"), o.get[scala.Option[models.WorkflowExecutionFilter]]("executionFilter")).mapN(models.CountClosedWorkflowExecutionsInput.apply _)
  }
  final implicit val ChildWorkflowExecutionTerminatedEventAttributesDecoder: io.circe.Decoder[models.ChildWorkflowExecutionTerminatedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("startedEventId")).mapN(models.ChildWorkflowExecutionTerminatedEventAttributes.apply _)
  }
  final implicit val ScheduleLambdaFunctionFailedEventAttributesDecoder: io.circe.Decoder[models.ScheduleLambdaFunctionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.ScheduleLambdaFunctionFailedEventAttributes.apply _)
  }
  final implicit val ListWorkflowTypesInputDecoder: io.circe.Decoder[models.ListWorkflowTypesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[java.lang.String]("registrationStatus"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.ListWorkflowTypesInput.apply _)
  }
  final implicit val ExecutionTimeFilterDecoder: io.circe.Decoder[models.ExecutionTimeFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("oldestDate"), o.get[scala.Option[java.time.Instant]]("latestDate")).mapN(models.ExecutionTimeFilter.apply _)
  }
  final implicit val SignalExternalWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.SignalExternalWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workflowId"), o.get[java.lang.String]("signalName"), o.get[scala.Option[java.lang.String]]("runId"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.SignalExternalWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val LimitExceededFaultDecoder: io.circe.Decoder[models.LimitExceededFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LimitExceededFault.apply _)
  }
  final implicit val RequestCancelActivityTaskDecisionAttributesDecoder: io.circe.Decoder[models.RequestCancelActivityTaskDecisionAttributes] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("activityId").map(models.RequestCancelActivityTaskDecisionAttributes.apply _)
  }
  final implicit val RegisterWorkflowTypeInputDecoder: io.circe.Decoder[models.RegisterWorkflowTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("version"), o.get[java.lang.String]("domain"), o.get[scala.Option[java.lang.String]]("defaultTaskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultExecutionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskPriority"), o.get[scala.Option[models.TaskList]]("defaultTaskList"), o.get[scala.Option[java.lang.String]]("defaultChildPolicy"), o.get[scala.Option[java.lang.String]]("defaultLambdaRole"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.RegisterWorkflowTypeInput.apply _)
  }
  final implicit val ExternalWorkflowExecutionSignaledEventAttributesDecoder: io.circe.Decoder[models.ExternalWorkflowExecutionSignaledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[scala.Long]("initiatedEventId")).mapN(models.ExternalWorkflowExecutionSignaledEventAttributes.apply _)
  }
  final implicit val ActivityTaskStartedEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskStartedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Option[java.lang.String]]("identity")).mapN(models.ActivityTaskStartedEventAttributes.apply _)
  }
  final implicit val RequestCancelExternalWorkflowExecutionInitiatedEventAttributesDecoder: io.circe.Decoder[models.RequestCancelExternalWorkflowExecutionInitiatedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workflowId"), o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[scala.Option[java.lang.String]]("runId"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.RequestCancelExternalWorkflowExecutionInitiatedEventAttributes.apply _)
  }
  final implicit val RequestCancelActivityTaskFailedEventAttributesDecoder: io.circe.Decoder[models.RequestCancelActivityTaskFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityId"), o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.RequestCancelActivityTaskFailedEventAttributes.apply _)
  }
  final implicit val FailWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.FailWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.FailWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val LambdaFunctionCompletedEventAttributesDecoder: io.circe.Decoder[models.LambdaFunctionCompletedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("result")).mapN(models.LambdaFunctionCompletedEventAttributes.apply _)
  }
  final implicit val DomainInfoDecoder: io.circe.Decoder[models.DomainInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("status"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.DomainInfo.apply _)
  }
  final implicit val DefaultUndefinedFaultDecoder: io.circe.Decoder[models.DefaultUndefinedFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DefaultUndefinedFault.apply _)
  }
  final implicit val WorkflowExecutionSignaledEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionSignaledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("signalName"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[models.WorkflowExecution]]("externalWorkflowExecution"), o.get[scala.Option[scala.Long]]("externalInitiatedEventId")).mapN(models.WorkflowExecutionSignaledEventAttributes.apply _)
  }
  final implicit val WorkflowExecutionInfoDecoder: io.circe.Decoder[models.WorkflowExecutionInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("startTimestamp"), o.get[java.lang.String]("executionStatus"), o.get[models.WorkflowExecution]("execution"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.time.Instant]]("closeTimestamp"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[java.lang.String]]("closeStatus"), o.get[scala.Option[models.WorkflowExecution]]("parent"), o.get[scala.Option[scala.Boolean]]("cancelRequested")).mapN(models.WorkflowExecutionInfo.apply _)
  }
  final implicit val WorkflowExecutionStartedEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionStartedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.TaskList]("taskList"), o.get[java.lang.String]("childPolicy"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("executionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[scala.Long]]("parentInitiatedEventId"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[models.WorkflowExecution]]("parentWorkflowExecution"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("lambdaRole"), o.get[scala.Option[java.lang.String]]("continuedExecutionRunId")).mapN(models.WorkflowExecutionStartedEventAttributes.apply _)
  }
  final implicit val StartLambdaFunctionFailedEventAttributesDecoder: io.circe.Decoder[models.StartLambdaFunctionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("scheduledEventId"), o.get[scala.Option[java.lang.String]]("cause"), o.get[scala.Option[java.lang.String]]("message")).mapN(models.StartLambdaFunctionFailedEventAttributes.apply _)
  }
  final implicit val DomainDeprecatedFaultDecoder: io.circe.Decoder[models.DomainDeprecatedFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DomainDeprecatedFault.apply _)
  }
  final implicit val ActivityTypeConfigurationDecoder: io.circe.Decoder[models.ActivityTypeConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("defaultTaskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskHeartbeatTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskScheduleToStartTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskScheduleToCloseTimeout"), o.get[scala.Option[models.TaskList]]("defaultTaskList"), o.get[scala.Option[java.lang.String]]("defaultTaskPriority")).mapN(models.ActivityTypeConfiguration.apply _)
  }
  final implicit val RecordActivityTaskHeartbeatInputDecoder: io.circe.Decoder[models.RecordActivityTaskHeartbeatInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.RecordActivityTaskHeartbeatInput.apply _)
  }
  final implicit val WorkflowExecutionTerminatedEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionTerminatedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("childPolicy"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.WorkflowExecutionTerminatedEventAttributes.apply _)
  }
  final implicit val TagFilterDecoder: io.circe.Decoder[models.TagFilter] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("tag").map(models.TagFilter.apply _)
  }
  final implicit val WorkflowExecutionCompletedEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionCompletedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[scala.Option[java.lang.String]]("result")).mapN(models.WorkflowExecutionCompletedEventAttributes.apply _)
  }
  final implicit val ListActivityTypesInputDecoder: io.circe.Decoder[models.ListActivityTypesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[java.lang.String]("registrationStatus"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.ListActivityTypesInput.apply _)
  }
  final implicit val MarkerRecordedEventAttributesDecoder: io.circe.Decoder[models.MarkerRecordedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("markerName"), o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.MarkerRecordedEventAttributes.apply _)
  }
  final implicit val CancelTimerFailedEventAttributesDecoder: io.circe.Decoder[models.CancelTimerFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timerId"), o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.CancelTimerFailedEventAttributes.apply _)
  }
  final implicit val WorkflowExecutionCanceledEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionCanceledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.WorkflowExecutionCanceledEventAttributes.apply _)
  }
  final implicit val StartTimerFailedEventAttributesDecoder: io.circe.Decoder[models.StartTimerFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timerId"), o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.StartTimerFailedEventAttributes.apply _)
  }
  final implicit val ActivityTypeDetailDecoder: io.circe.Decoder[models.ActivityTypeDetail] = io.circe.Decoder.instance { o => 
    (o.get[models.ActivityTypeInfo]("typeInfo"), o.get[models.ActivityTypeConfiguration]("configuration")).mapN(models.ActivityTypeDetail.apply _)
  }
  final implicit val RegisterActivityTypeInputDecoder: io.circe.Decoder[models.RegisterActivityTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("version"), o.get[java.lang.String]("domain"), o.get[scala.Option[java.lang.String]]("defaultTaskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskHeartbeatTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskScheduleToStartTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskScheduleToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskPriority"), o.get[scala.Option[models.TaskList]]("defaultTaskList"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.RegisterActivityTypeInput.apply _)
  }
  final implicit val TimerFiredEventAttributesDecoder: io.circe.Decoder[models.TimerFiredEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timerId"), o.get[scala.Long]("startedEventId")).mapN(models.TimerFiredEventAttributes.apply _)
  }
  final implicit val WorkflowExecutionOpenCountsDecoder: io.circe.Decoder[models.WorkflowExecutionOpenCounts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("openActivityTasks"), o.get[scala.Int]("openTimers"), o.get[scala.Int]("openChildWorkflowExecutions"), o.get[scala.Int]("openDecisionTasks"), o.get[scala.Option[scala.Int]]("openLambdaFunctions")).mapN(models.WorkflowExecutionOpenCounts.apply _)
  }
  final implicit val CountPendingDecisionTasksInputDecoder: io.circe.Decoder[models.CountPendingDecisionTasksInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.TaskList]("taskList")).mapN(models.CountPendingDecisionTasksInput.apply _)
  }
  final implicit val ActivityTaskCompletedEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskCompletedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("result")).mapN(models.ActivityTaskCompletedEventAttributes.apply _)
  }
  final implicit val HistoryEventDecoder: io.circe.Decoder[models.HistoryEvent] = io.circe.Decoder.instance { o => 
    for (`eventTimestamp` <- o.get[java.time.Instant]("eventTimestamp"); `eventType` <- o.get[java.lang.String]("eventType"); `eventId` <- o.get[scala.Long]("eventId"); `startChildWorkflowExecutionInitiatedEventAttributes` <- o.get[scala.Option[models.StartChildWorkflowExecutionInitiatedEventAttributes]]("startChildWorkflowExecutionInitiatedEventAttributes"); `decisionTaskTimedOutEventAttributes` <- o.get[scala.Option[models.DecisionTaskTimedOutEventAttributes]]("decisionTaskTimedOutEventAttributes"); `activityTaskCanceledEventAttributes` <- o.get[scala.Option[models.ActivityTaskCanceledEventAttributes]]("activityTaskCanceledEventAttributes"); `childWorkflowExecutionTerminatedEventAttributes` <- o.get[scala.Option[models.ChildWorkflowExecutionTerminatedEventAttributes]]("childWorkflowExecutionTerminatedEventAttributes"); `scheduleLambdaFunctionFailedEventAttributes` <- o.get[scala.Option[models.ScheduleLambdaFunctionFailedEventAttributes]]("scheduleLambdaFunctionFailedEventAttributes"); `externalWorkflowExecutionSignaledEventAttributes` <- o.get[scala.Option[models.ExternalWorkflowExecutionSignaledEventAttributes]]("externalWorkflowExecutionSignaledEventAttributes"); `activityTaskStartedEventAttributes` <- o.get[scala.Option[models.ActivityTaskStartedEventAttributes]]("activityTaskStartedEventAttributes"); `requestCancelExternalWorkflowExecutionInitiatedEventAttributes` <- o.get[scala.Option[models.RequestCancelExternalWorkflowExecutionInitiatedEventAttributes]]("requestCancelExternalWorkflowExecutionInitiatedEventAttributes"); `requestCancelActivityTaskFailedEventAttributes` <- o.get[scala.Option[models.RequestCancelActivityTaskFailedEventAttributes]]("requestCancelActivityTaskFailedEventAttributes"); `failWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.FailWorkflowExecutionFailedEventAttributes]]("failWorkflowExecutionFailedEventAttributes"); `lambdaFunctionCompletedEventAttributes` <- o.get[scala.Option[models.LambdaFunctionCompletedEventAttributes]]("lambdaFunctionCompletedEventAttributes"); `workflowExecutionSignaledEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionSignaledEventAttributes]]("workflowExecutionSignaledEventAttributes"); `workflowExecutionStartedEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionStartedEventAttributes]]("workflowExecutionStartedEventAttributes"); `startLambdaFunctionFailedEventAttributes` <- o.get[scala.Option[models.StartLambdaFunctionFailedEventAttributes]]("startLambdaFunctionFailedEventAttributes"); `workflowExecutionTerminatedEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionTerminatedEventAttributes]]("workflowExecutionTerminatedEventAttributes"); `workflowExecutionCompletedEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionCompletedEventAttributes]]("workflowExecutionCompletedEventAttributes"); `markerRecordedEventAttributes` <- o.get[scala.Option[models.MarkerRecordedEventAttributes]]("markerRecordedEventAttributes"); `cancelTimerFailedEventAttributes` <- o.get[scala.Option[models.CancelTimerFailedEventAttributes]]("cancelTimerFailedEventAttributes"); `workflowExecutionCanceledEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionCanceledEventAttributes]]("workflowExecutionCanceledEventAttributes"); `startTimerFailedEventAttributes` <- o.get[scala.Option[models.StartTimerFailedEventAttributes]]("startTimerFailedEventAttributes"); `timerFiredEventAttributes` <- o.get[scala.Option[models.TimerFiredEventAttributes]]("timerFiredEventAttributes"); `activityTaskCompletedEventAttributes` <- o.get[scala.Option[models.ActivityTaskCompletedEventAttributes]]("activityTaskCompletedEventAttributes"); `workflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionFailedEventAttributes]]("workflowExecutionFailedEventAttributes"); `cancelWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.CancelWorkflowExecutionFailedEventAttributes]]("cancelWorkflowExecutionFailedEventAttributes"); `externalWorkflowExecutionCancelRequestedEventAttributes` <- o.get[scala.Option[models.ExternalWorkflowExecutionCancelRequestedEventAttributes]]("externalWorkflowExecutionCancelRequestedEventAttributes"); `timerCanceledEventAttributes` <- o.get[scala.Option[models.TimerCanceledEventAttributes]]("timerCanceledEventAttributes"); `signalExternalWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.SignalExternalWorkflowExecutionFailedEventAttributes]]("signalExternalWorkflowExecutionFailedEventAttributes"); `workflowExecutionContinuedAsNewEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionContinuedAsNewEventAttributes]]("workflowExecutionContinuedAsNewEventAttributes"); `lambdaFunctionFailedEventAttributes` <- o.get[scala.Option[models.LambdaFunctionFailedEventAttributes]]("lambdaFunctionFailedEventAttributes"); `decisionTaskCompletedEventAttributes` <- o.get[scala.Option[models.DecisionTaskCompletedEventAttributes]]("decisionTaskCompletedEventAttributes"); `childWorkflowExecutionTimedOutEventAttributes` <- o.get[scala.Option[models.ChildWorkflowExecutionTimedOutEventAttributes]]("childWorkflowExecutionTimedOutEventAttributes"); `decisionTaskStartedEventAttributes` <- o.get[scala.Option[models.DecisionTaskStartedEventAttributes]]("decisionTaskStartedEventAttributes"); `completeWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.CompleteWorkflowExecutionFailedEventAttributes]]("completeWorkflowExecutionFailedEventAttributes"); `childWorkflowExecutionCanceledEventAttributes` <- o.get[scala.Option[models.ChildWorkflowExecutionCanceledEventAttributes]]("childWorkflowExecutionCanceledEventAttributes"); `timerStartedEventAttributes` <- o.get[scala.Option[models.TimerStartedEventAttributes]]("timerStartedEventAttributes"); `workflowExecutionCancelRequestedEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionCancelRequestedEventAttributes]]("workflowExecutionCancelRequestedEventAttributes"); `workflowExecutionTimedOutEventAttributes` <- o.get[scala.Option[models.WorkflowExecutionTimedOutEventAttributes]]("workflowExecutionTimedOutEventAttributes"); `scheduleActivityTaskFailedEventAttributes` <- o.get[scala.Option[models.ScheduleActivityTaskFailedEventAttributes]]("scheduleActivityTaskFailedEventAttributes"); `requestCancelExternalWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.RequestCancelExternalWorkflowExecutionFailedEventAttributes]]("requestCancelExternalWorkflowExecutionFailedEventAttributes"); `startChildWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.StartChildWorkflowExecutionFailedEventAttributes]]("startChildWorkflowExecutionFailedEventAttributes"); `recordMarkerFailedEventAttributes` <- o.get[scala.Option[models.RecordMarkerFailedEventAttributes]]("recordMarkerFailedEventAttributes"); `childWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.ChildWorkflowExecutionFailedEventAttributes]]("childWorkflowExecutionFailedEventAttributes"); `activityTaskScheduledEventAttributes` <- o.get[scala.Option[models.ActivityTaskScheduledEventAttributes]]("activityTaskScheduledEventAttributes"); `lambdaFunctionStartedEventAttributes` <- o.get[scala.Option[models.LambdaFunctionStartedEventAttributes]]("lambdaFunctionStartedEventAttributes"); `activityTaskFailedEventAttributes` <- o.get[scala.Option[models.ActivityTaskFailedEventAttributes]]("activityTaskFailedEventAttributes"); `lambdaFunctionTimedOutEventAttributes` <- o.get[scala.Option[models.LambdaFunctionTimedOutEventAttributes]]("lambdaFunctionTimedOutEventAttributes"); `activityTaskCancelRequestedEventAttributes` <- o.get[scala.Option[models.ActivityTaskCancelRequestedEventAttributes]]("activityTaskCancelRequestedEventAttributes"); `childWorkflowExecutionCompletedEventAttributes` <- o.get[scala.Option[models.ChildWorkflowExecutionCompletedEventAttributes]]("childWorkflowExecutionCompletedEventAttributes"); `childWorkflowExecutionStartedEventAttributes` <- o.get[scala.Option[models.ChildWorkflowExecutionStartedEventAttributes]]("childWorkflowExecutionStartedEventAttributes"); `continueAsNewWorkflowExecutionFailedEventAttributes` <- o.get[scala.Option[models.ContinueAsNewWorkflowExecutionFailedEventAttributes]]("continueAsNewWorkflowExecutionFailedEventAttributes"); `signalExternalWorkflowExecutionInitiatedEventAttributes` <- o.get[scala.Option[models.SignalExternalWorkflowExecutionInitiatedEventAttributes]]("signalExternalWorkflowExecutionInitiatedEventAttributes"); `decisionTaskScheduledEventAttributes` <- o.get[scala.Option[models.DecisionTaskScheduledEventAttributes]]("decisionTaskScheduledEventAttributes"); `activityTaskTimedOutEventAttributes` <- o.get[scala.Option[models.ActivityTaskTimedOutEventAttributes]]("activityTaskTimedOutEventAttributes"); `lambdaFunctionScheduledEventAttributes` <- o.get[scala.Option[models.LambdaFunctionScheduledEventAttributes]]("lambdaFunctionScheduledEventAttributes")) yield models.HistoryEvent(eventTimestamp, eventType, eventId, startChildWorkflowExecutionInitiatedEventAttributes, decisionTaskTimedOutEventAttributes, activityTaskCanceledEventAttributes, childWorkflowExecutionTerminatedEventAttributes, scheduleLambdaFunctionFailedEventAttributes, externalWorkflowExecutionSignaledEventAttributes, activityTaskStartedEventAttributes, requestCancelExternalWorkflowExecutionInitiatedEventAttributes, requestCancelActivityTaskFailedEventAttributes, failWorkflowExecutionFailedEventAttributes, lambdaFunctionCompletedEventAttributes, workflowExecutionSignaledEventAttributes, workflowExecutionStartedEventAttributes, startLambdaFunctionFailedEventAttributes, workflowExecutionTerminatedEventAttributes, workflowExecutionCompletedEventAttributes, markerRecordedEventAttributes, cancelTimerFailedEventAttributes, workflowExecutionCanceledEventAttributes, startTimerFailedEventAttributes, timerFiredEventAttributes, activityTaskCompletedEventAttributes, workflowExecutionFailedEventAttributes, cancelWorkflowExecutionFailedEventAttributes, externalWorkflowExecutionCancelRequestedEventAttributes, timerCanceledEventAttributes, signalExternalWorkflowExecutionFailedEventAttributes, workflowExecutionContinuedAsNewEventAttributes, lambdaFunctionFailedEventAttributes, decisionTaskCompletedEventAttributes, childWorkflowExecutionTimedOutEventAttributes, decisionTaskStartedEventAttributes, completeWorkflowExecutionFailedEventAttributes, childWorkflowExecutionCanceledEventAttributes, timerStartedEventAttributes, workflowExecutionCancelRequestedEventAttributes, workflowExecutionTimedOutEventAttributes, scheduleActivityTaskFailedEventAttributes, requestCancelExternalWorkflowExecutionFailedEventAttributes, startChildWorkflowExecutionFailedEventAttributes, recordMarkerFailedEventAttributes, childWorkflowExecutionFailedEventAttributes, activityTaskScheduledEventAttributes, lambdaFunctionStartedEventAttributes, activityTaskFailedEventAttributes, lambdaFunctionTimedOutEventAttributes, activityTaskCancelRequestedEventAttributes, childWorkflowExecutionCompletedEventAttributes, childWorkflowExecutionStartedEventAttributes, continueAsNewWorkflowExecutionFailedEventAttributes, signalExternalWorkflowExecutionInitiatedEventAttributes, decisionTaskScheduledEventAttributes, activityTaskTimedOutEventAttributes, lambdaFunctionScheduledEventAttributes)
  }
  final implicit val HistoryDecoder: io.circe.Decoder[models.History] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.HistoryEvent]]("events"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.History.apply _)
  }
  final implicit val SignalWorkflowExecutionInputDecoder: io.circe.Decoder[models.SignalWorkflowExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[java.lang.String]("workflowId"), o.get[java.lang.String]("signalName"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("runId")).mapN(models.SignalWorkflowExecutionInput.apply _)
  }
  final implicit val WorkflowTypeInfosDecoder: io.circe.Decoder[models.WorkflowTypeInfos] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.WorkflowTypeInfo]]("typeInfos"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.WorkflowTypeInfos.apply _)
  }
  final implicit val StartWorkflowExecutionInputDecoder: io.circe.Decoder[models.StartWorkflowExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[java.lang.String]("workflowId"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("executionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[models.TaskList]]("taskList"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[java.lang.String]]("childPolicy"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("lambdaRole")).mapN(models.StartWorkflowExecutionInput.apply _)
  }
  final implicit val WorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.WorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val CancelWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.CancelWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.CancelWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val TypeDeprecatedFaultDecoder: io.circe.Decoder[models.TypeDeprecatedFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TypeDeprecatedFault.apply _)
  }
  final implicit val ExternalWorkflowExecutionCancelRequestedEventAttributesDecoder: io.circe.Decoder[models.ExternalWorkflowExecutionCancelRequestedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[scala.Long]("initiatedEventId")).mapN(models.ExternalWorkflowExecutionCancelRequestedEventAttributes.apply _)
  }
  final implicit val DescribeActivityTypeInputDecoder: io.circe.Decoder[models.DescribeActivityTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.ActivityType]("activityType")).mapN(models.DescribeActivityTypeInput.apply _)
  }
  final implicit val TimerCanceledEventAttributesDecoder: io.circe.Decoder[models.TimerCanceledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timerId"), o.get[scala.Long]("startedEventId"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.TimerCanceledEventAttributes.apply _)
  }
  final implicit val DescribeWorkflowExecutionInputDecoder: io.circe.Decoder[models.DescribeWorkflowExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.WorkflowExecution]("execution")).mapN(models.DescribeWorkflowExecutionInput.apply _)
  }
  final implicit val StartChildWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.StartChildWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workflowId"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("executionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[models.TaskList]]("taskList"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[java.lang.String]]("childPolicy"), o.get[scala.Option[java.lang.String]]("control"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("lambdaRole")).mapN(models.StartChildWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val GetWorkflowExecutionHistoryInputDecoder: io.circe.Decoder[models.GetWorkflowExecutionHistoryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.WorkflowExecution]("execution"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetWorkflowExecutionHistoryInput.apply _)
  }
  final implicit val DomainInfosDecoder: io.circe.Decoder[models.DomainInfos] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.DomainInfo]]("domainInfos"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.DomainInfos.apply _)
  }
  final implicit val CompleteWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.CompleteWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("result").map(models.CompleteWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val WorkflowTypeInfoDecoder: io.circe.Decoder[models.WorkflowTypeInfo] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowType]("workflowType"), o.get[java.lang.String]("status"), o.get[java.time.Instant]("creationDate"), o.get[scala.Option[java.time.Instant]]("deprecationDate"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.WorkflowTypeInfo.apply _)
  }
  final implicit val SignalExternalWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.SignalExternalWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("cause"), o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[java.lang.String]("workflowId"), o.get[scala.Option[java.lang.String]]("control"), o.get[scala.Option[java.lang.String]]("runId")).mapN(models.SignalExternalWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val WorkflowExecutionContinuedAsNewEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionContinuedAsNewEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[models.TaskList]("taskList"), o.get[java.lang.String]("childPolicy"), o.get[java.lang.String]("newExecutionRunId"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("executionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("lambdaRole")).mapN(models.WorkflowExecutionContinuedAsNewEventAttributes.apply _)
  }
  final implicit val LambdaFunctionFailedEventAttributesDecoder: io.circe.Decoder[models.LambdaFunctionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.LambdaFunctionFailedEventAttributes.apply _)
  }
  final implicit val TypeAlreadyExistsFaultDecoder: io.circe.Decoder[models.TypeAlreadyExistsFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TypeAlreadyExistsFault.apply _)
  }
  final implicit val DescribeWorkflowTypeInputDecoder: io.circe.Decoder[models.DescribeWorkflowTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.WorkflowType]("workflowType")).mapN(models.DescribeWorkflowTypeInput.apply _)
  }
  final implicit val DecisionTaskCompletedEventAttributesDecoder: io.circe.Decoder[models.DecisionTaskCompletedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("executionContext")).mapN(models.DecisionTaskCompletedEventAttributes.apply _)
  }
  final implicit val PendingTaskCountDecoder: io.circe.Decoder[models.PendingTaskCount] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("count"), o.get[scala.Option[scala.Boolean]]("truncated")).mapN(models.PendingTaskCount.apply _)
  }
  final implicit val DomainDetailDecoder: io.circe.Decoder[models.DomainDetail] = io.circe.Decoder.instance { o => 
    (o.get[models.DomainInfo]("domainInfo"), o.get[models.DomainConfiguration]("configuration")).mapN(models.DomainDetail.apply _)
  }
  final implicit val ScheduleLambdaFunctionDecisionAttributesDecoder: io.circe.Decoder[models.ScheduleLambdaFunctionDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("startToCloseTimeout"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.ScheduleLambdaFunctionDecisionAttributes.apply _)
  }
  final implicit val OperationNotPermittedFaultDecoder: io.circe.Decoder[models.OperationNotPermittedFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.OperationNotPermittedFault.apply _)
  }
  final implicit val TaskListDecoder: io.circe.Decoder[models.TaskList] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.TaskList.apply _)
  }
  final implicit val ListOpenWorkflowExecutionsInputDecoder: io.circe.Decoder[models.ListOpenWorkflowExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[models.ExecutionTimeFilter]("startTimeFilter"), o.get[java.lang.String]("domain"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[models.TagFilter]]("tagFilter"), o.get[scala.Option[models.WorkflowTypeFilter]]("typeFilter"), o.get[scala.Option[models.WorkflowExecutionFilter]]("executionFilter"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.ListOpenWorkflowExecutionsInput.apply _)
  }
  final implicit val ChildWorkflowExecutionTimedOutEventAttributesDecoder: io.circe.Decoder[models.ChildWorkflowExecutionTimedOutEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[models.WorkflowType]("workflowType"), o.get[java.lang.String]("timeoutType"), o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("startedEventId")).mapN(models.ChildWorkflowExecutionTimedOutEventAttributes.apply _)
  }
  final implicit val DecisionTaskStartedEventAttributesDecoder: io.circe.Decoder[models.DecisionTaskStartedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Option[java.lang.String]]("identity")).mapN(models.DecisionTaskStartedEventAttributes.apply _)
  }
  final implicit val ListClosedWorkflowExecutionsInputDecoder: io.circe.Decoder[models.ListClosedWorkflowExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[scala.Option[models.ExecutionTimeFilter]]("startTimeFilter"), o.get[scala.Option[models.ExecutionTimeFilter]]("closeTimeFilter"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[models.TagFilter]]("tagFilter"), o.get[scala.Option[models.CloseStatusFilter]]("closeStatusFilter"), o.get[scala.Option[models.WorkflowTypeFilter]]("typeFilter"), o.get[scala.Option[models.WorkflowExecutionFilter]]("executionFilter"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.ListClosedWorkflowExecutionsInput.apply _)
  }
  final implicit val DomainConfigurationDecoder: io.circe.Decoder[models.DomainConfiguration] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("workflowExecutionRetentionPeriodInDays").map(models.DomainConfiguration.apply _)
  }
  final implicit val ListDomainsInputDecoder: io.circe.Decoder[models.ListDomainsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("registrationStatus"), o.get[scala.Option[java.lang.String]]("nextPageToken"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder")).mapN(models.ListDomainsInput.apply _)
  }
  final implicit val DomainAlreadyExistsFaultDecoder: io.circe.Decoder[models.DomainAlreadyExistsFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DomainAlreadyExistsFault.apply _)
  }
  final implicit val CompleteWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.CompleteWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.CompleteWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val ChildWorkflowExecutionCanceledEventAttributesDecoder: io.circe.Decoder[models.ChildWorkflowExecutionCanceledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.ChildWorkflowExecutionCanceledEventAttributes.apply _)
  }
  final implicit val TimerStartedEventAttributesDecoder: io.circe.Decoder[models.TimerStartedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timerId"), o.get[java.lang.String]("startToFireTimeout"), o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.TimerStartedEventAttributes.apply _)
  }
  final implicit val CloseStatusFilterDecoder: io.circe.Decoder[models.CloseStatusFilter] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("status").map(models.CloseStatusFilter.apply _)
  }
  final implicit val RecordMarkerDecisionAttributesDecoder: io.circe.Decoder[models.RecordMarkerDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("markerName"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.RecordMarkerDecisionAttributes.apply _)
  }
  final implicit val WorkflowExecutionCancelRequestedEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionCancelRequestedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.WorkflowExecution]]("externalWorkflowExecution"), o.get[scala.Option[scala.Long]]("externalInitiatedEventId"), o.get[scala.Option[java.lang.String]]("cause")).mapN(models.WorkflowExecutionCancelRequestedEventAttributes.apply _)
  }
  final implicit val ActivityTypeInfoDecoder: io.circe.Decoder[models.ActivityTypeInfo] = io.circe.Decoder.instance { o => 
    (o.get[models.ActivityType]("activityType"), o.get[java.lang.String]("status"), o.get[java.time.Instant]("creationDate"), o.get[scala.Option[java.time.Instant]]("deprecationDate"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.ActivityTypeInfo.apply _)
  }
  final implicit val WorkflowExecutionTimedOutEventAttributesDecoder: io.circe.Decoder[models.WorkflowExecutionTimedOutEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timeoutType"), o.get[java.lang.String]("childPolicy")).mapN(models.WorkflowExecutionTimedOutEventAttributes.apply _)
  }
  final implicit val ScheduleActivityTaskFailedEventAttributesDecoder: io.circe.Decoder[models.ScheduleActivityTaskFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.ActivityType]("activityType"), o.get[java.lang.String]("activityId"), o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.ScheduleActivityTaskFailedEventAttributes.apply _)
  }
  final implicit val DescribeDomainInputDecoder: io.circe.Decoder[models.DescribeDomainInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.DescribeDomainInput.apply _)
  }
  final implicit val DecisionTaskDecoder: io.circe.Decoder[models.DecisionTask] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.HistoryEvent]]("events"), o.get[scala.Long]("startedEventId"), o.get[models.WorkflowExecution]("workflowExecution"), o.get[java.lang.String]("taskToken"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[scala.Long]]("previousStartedEventId"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.DecisionTask.apply _)
  }
  final implicit val ContinueAsNewWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.ContinueAsNewWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("executionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[java.lang.String]]("workflowTypeVersion"), o.get[scala.Option[models.TaskList]]("taskList"), o.get[scala.Option[scala.List[java.lang.String]]]("tagList"), o.get[scala.Option[java.lang.String]]("childPolicy"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("lambdaRole")).mapN(models.ContinueAsNewWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val WorkflowTypeFilterDecoder: io.circe.Decoder[models.WorkflowTypeFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("version")).mapN(models.WorkflowTypeFilter.apply _)
  }
  final implicit val RequestCancelExternalWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.RequestCancelExternalWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[java.lang.String]("workflowId"), o.get[java.lang.String]("cause"), o.get[scala.Option[java.lang.String]]("control"), o.get[scala.Option[java.lang.String]]("runId")).mapN(models.RequestCancelExternalWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val PollForActivityTaskInputDecoder: io.circe.Decoder[models.PollForActivityTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.TaskList]("taskList"), o.get[scala.Option[java.lang.String]]("identity")).mapN(models.PollForActivityTaskInput.apply _)
  }
  final implicit val WorkflowExecutionFilterDecoder: io.circe.Decoder[models.WorkflowExecutionFilter] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("workflowId").map(models.WorkflowExecutionFilter.apply _)
  }
  final implicit val StartChildWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.StartChildWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("cause"), o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[java.lang.String]("workflowId"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.StartChildWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val WorkflowTypeDetailDecoder: io.circe.Decoder[models.WorkflowTypeDetail] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowTypeInfo]("typeInfo"), o.get[models.WorkflowTypeConfiguration]("configuration")).mapN(models.WorkflowTypeDetail.apply _)
  }
  final implicit val WorkflowExecutionConfigurationDecoder: io.circe.Decoder[models.WorkflowExecutionConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[models.TaskList]("taskList"), o.get[java.lang.String]("taskStartToCloseTimeout"), o.get[java.lang.String]("executionStartToCloseTimeout"), o.get[java.lang.String]("childPolicy"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[java.lang.String]]("lambdaRole")).mapN(models.WorkflowExecutionConfiguration.apply _)
  }
  final implicit val FailWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.FailWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.FailWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val RespondActivityTaskFailedInputDecoder: io.circe.Decoder[models.RespondActivityTaskFailedInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.RespondActivityTaskFailedInput.apply _)
  }
  final implicit val WorkflowExecutionDecoder: io.circe.Decoder[models.WorkflowExecution] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workflowId"), o.get[java.lang.String]("runId")).mapN(models.WorkflowExecution.apply _)
  }
  final implicit val WorkflowTypeConfigurationDecoder: io.circe.Decoder[models.WorkflowTypeConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("defaultTaskStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultExecutionStartToCloseTimeout"), o.get[scala.Option[java.lang.String]]("defaultTaskPriority"), o.get[scala.Option[models.TaskList]]("defaultTaskList"), o.get[scala.Option[java.lang.String]]("defaultChildPolicy"), o.get[scala.Option[java.lang.String]]("defaultLambdaRole")).mapN(models.WorkflowTypeConfiguration.apply _)
  }
  final implicit val UnknownResourceFaultDecoder: io.circe.Decoder[models.UnknownResourceFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.UnknownResourceFault.apply _)
  }
  final implicit val RecordMarkerFailedEventAttributesDecoder: io.circe.Decoder[models.RecordMarkerFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("markerName"), o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.RecordMarkerFailedEventAttributes.apply _)
  }
  final implicit val WorkflowExecutionAlreadyStartedFaultDecoder: io.circe.Decoder[models.WorkflowExecutionAlreadyStartedFault] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.WorkflowExecutionAlreadyStartedFault.apply _)
  }
  final implicit val ChildWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.ChildWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("startedEventId"), o.get[models.WorkflowExecution]("workflowExecution"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.ChildWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val ActivityTaskScheduledEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskScheduledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[models.TaskList]("taskList"), o.get[java.lang.String]("activityId"), o.get[models.ActivityType]("activityType"), o.get[scala.Option[java.lang.String]]("scheduleToStartTimeout"), o.get[scala.Option[java.lang.String]]("scheduleToCloseTimeout"), o.get[scala.Option[java.lang.String]]("startToCloseTimeout"), o.get[scala.Option[java.lang.String]]("heartbeatTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.ActivityTaskScheduledEventAttributes.apply _)
  }
  final implicit val ActivityTaskStatusDecoder: io.circe.Decoder[models.ActivityTaskStatus] = io.circe.Decoder.instance { o => 
    o.get[scala.Boolean]("cancelRequested").map(models.ActivityTaskStatus.apply _)
  }
  final implicit val DeprecateDomainInputDecoder: io.circe.Decoder[models.DeprecateDomainInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.DeprecateDomainInput.apply _)
  }
  final implicit val DecisionDecoder: io.circe.Decoder[models.Decision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("decisionType"), o.get[scala.Option[models.SignalExternalWorkflowExecutionDecisionAttributes]]("signalExternalWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.RequestCancelActivityTaskDecisionAttributes]]("requestCancelActivityTaskDecisionAttributes"), o.get[scala.Option[models.StartChildWorkflowExecutionDecisionAttributes]]("startChildWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.CompleteWorkflowExecutionDecisionAttributes]]("completeWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.ScheduleLambdaFunctionDecisionAttributes]]("scheduleLambdaFunctionDecisionAttributes"), o.get[scala.Option[models.RecordMarkerDecisionAttributes]]("recordMarkerDecisionAttributes"), o.get[scala.Option[models.ContinueAsNewWorkflowExecutionDecisionAttributes]]("continueAsNewWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.FailWorkflowExecutionDecisionAttributes]]("failWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.RequestCancelExternalWorkflowExecutionDecisionAttributes]]("requestCancelExternalWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.ScheduleActivityTaskDecisionAttributes]]("scheduleActivityTaskDecisionAttributes"), o.get[scala.Option[models.CancelTimerDecisionAttributes]]("cancelTimerDecisionAttributes"), o.get[scala.Option[models.CancelWorkflowExecutionDecisionAttributes]]("cancelWorkflowExecutionDecisionAttributes"), o.get[scala.Option[models.StartTimerDecisionAttributes]]("startTimerDecisionAttributes")).mapN(models.Decision.apply _)
  }
  final implicit val RequestCancelExternalWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.RequestCancelExternalWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("workflowId"), o.get[scala.Option[java.lang.String]]("runId"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.RequestCancelExternalWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val LambdaFunctionStartedEventAttributesDecoder: io.circe.Decoder[models.LambdaFunctionStartedEventAttributes] = io.circe.Decoder.instance { o => 
    o.get[scala.Long]("scheduledEventId").map(models.LambdaFunctionStartedEventAttributes.apply _)
  }
  final implicit val ActivityTaskFailedEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.ActivityTaskFailedEventAttributes.apply _)
  }
  final implicit val DeprecateWorkflowTypeInputDecoder: io.circe.Decoder[models.DeprecateWorkflowTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.WorkflowType]("workflowType")).mapN(models.DeprecateWorkflowTypeInput.apply _)
  }
  final implicit val LambdaFunctionTimedOutEventAttributesDecoder: io.circe.Decoder[models.LambdaFunctionTimedOutEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("timeoutType")).mapN(models.LambdaFunctionTimedOutEventAttributes.apply _)
  }
  final implicit val RegisterDomainInputDecoder: io.circe.Decoder[models.RegisterDomainInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("workflowExecutionRetentionPeriodInDays"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.RegisterDomainInput.apply _)
  }
  final implicit val ActivityTaskDecoder: io.circe.Decoder[models.ActivityTask] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("startedEventId"), o.get[models.WorkflowExecution]("workflowExecution"), o.get[java.lang.String]("activityId"), o.get[models.ActivityType]("activityType"), o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("input")).mapN(models.ActivityTask.apply _)
  }
  final implicit val ActivityTypeDecoder: io.circe.Decoder[models.ActivityType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("version")).mapN(models.ActivityType.apply _)
  }
  final implicit val TerminateWorkflowExecutionInputDecoder: io.circe.Decoder[models.TerminateWorkflowExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[java.lang.String]("workflowId"), o.get[scala.Option[java.lang.String]]("childPolicy"), o.get[scala.Option[java.lang.String]]("details"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("runId")).mapN(models.TerminateWorkflowExecutionInput.apply _)
  }
  final implicit val RespondActivityTaskCanceledInputDecoder: io.circe.Decoder[models.RespondActivityTaskCanceledInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.RespondActivityTaskCanceledInput.apply _)
  }
  final implicit val WorkflowExecutionDetailDecoder: io.circe.Decoder[models.WorkflowExecutionDetail] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecutionInfo]("executionInfo"), o.get[models.WorkflowExecutionOpenCounts]("openCounts"), o.get[models.WorkflowExecutionConfiguration]("executionConfiguration"), o.get[scala.Option[java.time.Instant]]("latestActivityTaskTimestamp"), o.get[scala.Option[java.lang.String]]("latestExecutionContext")).mapN(models.WorkflowExecutionDetail.apply _)
  }
  final implicit val ScheduleActivityTaskDecisionAttributesDecoder: io.circe.Decoder[models.ScheduleActivityTaskDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("activityId"), o.get[models.ActivityType]("activityType"), o.get[scala.Option[java.lang.String]]("scheduleToCloseTimeout"), o.get[scala.Option[java.lang.String]]("scheduleToStartTimeout"), o.get[scala.Option[java.lang.String]]("startToCloseTimeout"), o.get[scala.Option[java.lang.String]]("heartbeatTimeout"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[models.TaskList]]("taskList"), o.get[scala.Option[java.lang.String]]("control"), o.get[scala.Option[java.lang.String]]("input")).mapN(models.ScheduleActivityTaskDecisionAttributes.apply _)
  }
  final implicit val ActivityTaskCancelRequestedEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskCancelRequestedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[java.lang.String]("activityId")).mapN(models.ActivityTaskCancelRequestedEventAttributes.apply _)
  }
  final implicit val ChildWorkflowExecutionCompletedEventAttributesDecoder: io.circe.Decoder[models.ChildWorkflowExecutionCompletedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Long]("initiatedEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("result")).mapN(models.ChildWorkflowExecutionCompletedEventAttributes.apply _)
  }
  final implicit val ChildWorkflowExecutionStartedEventAttributesDecoder: io.circe.Decoder[models.ChildWorkflowExecutionStartedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.WorkflowExecution]("workflowExecution"), o.get[models.WorkflowType]("workflowType"), o.get[scala.Long]("initiatedEventId")).mapN(models.ChildWorkflowExecutionStartedEventAttributes.apply _)
  }
  final implicit val RunDecoder: io.circe.Decoder[models.Run] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("runId").map(models.Run.apply _)
  }
  final implicit val ContinueAsNewWorkflowExecutionFailedEventAttributesDecoder: io.circe.Decoder[models.ContinueAsNewWorkflowExecutionFailedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("cause"), o.get[scala.Long]("decisionTaskCompletedEventId")).mapN(models.ContinueAsNewWorkflowExecutionFailedEventAttributes.apply _)
  }
  final implicit val SignalExternalWorkflowExecutionInitiatedEventAttributesDecoder: io.circe.Decoder[models.SignalExternalWorkflowExecutionInitiatedEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[java.lang.String]("workflowId"), o.get[java.lang.String]("signalName"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("control"), o.get[scala.Option[java.lang.String]]("runId")).mapN(models.SignalExternalWorkflowExecutionInitiatedEventAttributes.apply _)
  }
  final implicit val RespondActivityTaskCompletedInputDecoder: io.circe.Decoder[models.RespondActivityTaskCompletedInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[java.lang.String]]("result")).mapN(models.RespondActivityTaskCompletedInput.apply _)
  }
  final implicit val DeprecateActivityTypeInputDecoder: io.circe.Decoder[models.DeprecateActivityTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.ActivityType]("activityType")).mapN(models.DeprecateActivityTypeInput.apply _)
  }
  final implicit val PollForDecisionTaskInputDecoder: io.circe.Decoder[models.PollForDecisionTaskInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.TaskList]("taskList"), o.get[scala.Option[scala.Int]]("maximumPageSize"), o.get[scala.Option[scala.Boolean]]("reverseOrder"), o.get[scala.Option[java.lang.String]]("identity"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.PollForDecisionTaskInput.apply _)
  }
  final implicit val DecisionTaskScheduledEventAttributesDecoder: io.circe.Decoder[models.DecisionTaskScheduledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[models.TaskList]("taskList"), o.get[scala.Option[java.lang.String]]("taskPriority"), o.get[scala.Option[java.lang.String]]("startToCloseTimeout")).mapN(models.DecisionTaskScheduledEventAttributes.apply _)
  }
  final implicit val CancelTimerDecisionAttributesDecoder: io.circe.Decoder[models.CancelTimerDecisionAttributes] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("timerId").map(models.CancelTimerDecisionAttributes.apply _)
  }
  final implicit val CancelWorkflowExecutionDecisionAttributesDecoder: io.circe.Decoder[models.CancelWorkflowExecutionDecisionAttributes] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("details").map(models.CancelWorkflowExecutionDecisionAttributes.apply _)
  }
  final implicit val ActivityTaskTimedOutEventAttributesDecoder: io.circe.Decoder[models.ActivityTaskTimedOutEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timeoutType"), o.get[scala.Long]("scheduledEventId"), o.get[scala.Long]("startedEventId"), o.get[scala.Option[java.lang.String]]("details")).mapN(models.ActivityTaskTimedOutEventAttributes.apply _)
  }
  final implicit val CountPendingActivityTasksInputDecoder: io.circe.Decoder[models.CountPendingActivityTasksInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domain"), o.get[models.TaskList]("taskList")).mapN(models.CountPendingActivityTasksInput.apply _)
  }
  final implicit val StartTimerDecisionAttributesDecoder: io.circe.Decoder[models.StartTimerDecisionAttributes] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("timerId"), o.get[java.lang.String]("startToFireTimeout"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.StartTimerDecisionAttributes.apply _)
  }
  final implicit val RespondDecisionTaskCompletedInputDecoder: io.circe.Decoder[models.RespondDecisionTaskCompletedInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskToken"), o.get[scala.Option[scala.List[models.Decision]]]("decisions"), o.get[scala.Option[java.lang.String]]("executionContext")).mapN(models.RespondDecisionTaskCompletedInput.apply _)
  }
  final implicit val WorkflowTypeDecoder: io.circe.Decoder[models.WorkflowType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("version")).mapN(models.WorkflowType.apply _)
  }
  final implicit val CountOpenWorkflowExecutionsInputDecoder: io.circe.Decoder[models.CountOpenWorkflowExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[models.ExecutionTimeFilter]("startTimeFilter"), o.get[java.lang.String]("domain"), o.get[scala.Option[models.TagFilter]]("tagFilter"), o.get[scala.Option[models.WorkflowTypeFilter]]("typeFilter"), o.get[scala.Option[models.WorkflowExecutionFilter]]("executionFilter")).mapN(models.CountOpenWorkflowExecutionsInput.apply _)
  }
  final implicit val WorkflowExecutionInfosDecoder: io.circe.Decoder[models.WorkflowExecutionInfos] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.WorkflowExecutionInfo]]("executionInfos"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.WorkflowExecutionInfos.apply _)
  }
  final implicit val LambdaFunctionScheduledEventAttributesDecoder: io.circe.Decoder[models.LambdaFunctionScheduledEventAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("decisionTaskCompletedEventId"), o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("startToCloseTimeout"), o.get[scala.Option[java.lang.String]]("input"), o.get[scala.Option[java.lang.String]]("control")).mapN(models.LambdaFunctionScheduledEventAttributes.apply _)
  }
}