package avias.ssm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ListAssociationsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListAssociationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationFilterList" -> o.associationFilterList.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeMaintenanceWindowsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowsResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowIdentities" -> o.windowIdentities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CancelCommandResultEncoder: io.circe.Encoder[avias.ssm.models.CancelCommandResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeMaintenanceWindowExecutionTaskInvocationsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TaskId" -> o.taskId.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceDataSyncNotFoundExceptionEncoder: io.circe.Encoder[avias.ssm.models.ResourceDataSyncNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("SyncName" -> o.syncName.asJson)
  }
  final implicit val DeleteParametersRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson)
  }
  final implicit val GetParametersResultEncoder: io.circe.Encoder[avias.ssm.models.GetParametersResult] = io.circe.Encoder.instance { o => 
    Json.obj("Parameters" -> o.parameters.asJson, "InvalidParameters" -> o.invalidParameters.asJson)
  }
  final implicit val SendCommandRequestEncoder: io.circe.Encoder[avias.ssm.models.SendCommandRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentName" -> o.documentName.asJson, "Targets" -> o.targets.asJson, "DocumentHash" -> o.documentHash.asJson, "TimeoutSeconds" -> o.timeoutSeconds.asJson, "Comment" -> o.comment.asJson, "DocumentHashType" -> o.documentHashType.asJson, "OutputS3KeyPrefix" -> o.outputS3KeyPrefix.asJson, "Parameters" -> o.parameters.asJson, "OutputS3BucketName" -> o.outputS3BucketName.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "OutputS3Region" -> o.outputS3Region.asJson, "InstanceIds" -> o.instanceIds.asJson, "NotificationConfig" -> o.notificationConfig.asJson, "MaxErrors" -> o.maxErrors.asJson)
  }
  final implicit val InventoryResultEntityEncoder: io.circe.Encoder[avias.ssm.models.InventoryResultEntity] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Data" -> o.data.asJson)
  }
  final implicit val DescribePatchGroupStateResultEncoder: io.circe.Encoder[avias.ssm.models.DescribePatchGroupStateResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstancesWithMissingPatches" -> o.instancesWithMissingPatches.asJson, "Instances" -> o.instances.asJson, "InstancesWithInstalledPatches" -> o.instancesWithInstalledPatches.asJson, "InstancesWithInstalledOtherPatches" -> o.instancesWithInstalledOtherPatches.asJson, "InstancesWithFailedPatches" -> o.instancesWithFailedPatches.asJson, "InstancesWithNotApplicablePatches" -> o.instancesWithNotApplicablePatches.asJson)
  }
  final implicit val DescribeDocumentResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeDocumentResult] = io.circe.Encoder.instance { o => 
    Json.obj("Document" -> o.document.asJson)
  }
  final implicit val MaintenanceWindowExecutionEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowExecution] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "WindowId" -> o.windowId.asJson, "StatusDetails" -> o.statusDetails.asJson)
  }
  final implicit val DocumentVersionLimitExceededEncoder: io.circe.Encoder[avias.ssm.models.DocumentVersionLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PutComplianceItemsResultEncoder: io.circe.Encoder[avias.ssm.models.PutComplianceItemsResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson)
  }
  final implicit val DeleteParametersResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteParametersResult] = io.circe.Encoder.instance { o => 
    Json.obj("DeletedParameters" -> o.deletedParameters.asJson, "InvalidParameters" -> o.invalidParameters.asJson)
  }
  final implicit val UpdateMaintenanceWindowTargetResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateMaintenanceWindowTargetResult] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "Name" -> o.name.asJson, "OwnerInformation" -> o.ownerInformation.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "WindowTargetId" -> o.windowTargetId.asJson)
  }
  final implicit val PatchBaselineIdentityEncoder: io.circe.Encoder[avias.ssm.models.PatchBaselineIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("DefaultBaseline" -> o.defaultBaseline.asJson, "BaselineName" -> o.baselineName.asJson, "BaselineDescription" -> o.baselineDescription.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "BaselineId" -> o.baselineId.asJson)
  }
  final implicit val InvalidResourceIdEncoder: io.circe.Encoder[avias.ssm.models.InvalidResourceId.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SeveritySummaryEncoder: io.circe.Encoder[avias.ssm.models.SeveritySummary] = io.circe.Encoder.instance { o => 
    Json.obj("UnspecifiedCount" -> o.unspecifiedCount.asJson, "LowCount" -> o.lowCount.asJson, "HighCount" -> o.highCount.asJson, "MediumCount" -> o.mediumCount.asJson, "CriticalCount" -> o.criticalCount.asJson, "InformationalCount" -> o.informationalCount.asJson)
  }
  final implicit val InvalidRoleEncoder: io.circe.Encoder[avias.ssm.models.InvalidRole] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ResourceComplianceSummaryItemEncoder: io.circe.Encoder[avias.ssm.models.ResourceComplianceSummaryItem] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "NonCompliantSummary" -> o.nonCompliantSummary.asJson, "ExecutionSummary" -> o.executionSummary.asJson, "OverallSeverity" -> o.overallSeverity.asJson, "Status" -> o.status.asJson, "ComplianceType" -> o.complianceType.asJson, "CompliantSummary" -> o.compliantSummary.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val CreateAssociationBatchRequestEntryEncoder: io.circe.Encoder[avias.ssm.models.CreateAssociationBatchRequestEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "InstanceId" -> o.instanceId.asJson, "Targets" -> o.targets.asJson, "AssociationName" -> o.associationName.asJson, "OutputLocation" -> o.outputLocation.asJson, "Parameters" -> o.parameters.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val ParametersFilterEncoder: io.circe.Encoder[avias.ssm.models.ParametersFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val UpdateAssociationRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationId" -> o.associationId.asJson, "Name" -> o.name.asJson, "Targets" -> o.targets.asJson, "AssociationName" -> o.associationName.asJson, "OutputLocation" -> o.outputLocation.asJson, "Parameters" -> o.parameters.asJson, "AssociationVersion" -> o.associationVersion.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val ResourceDataSyncInvalidConfigurationExceptionEncoder: io.circe.Encoder[avias.ssm.models.ResourceDataSyncInvalidConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val NonCompliantSummaryEncoder: io.circe.Encoder[avias.ssm.models.NonCompliantSummary] = io.circe.Encoder.instance { o => 
    Json.obj("NonCompliantCount" -> o.nonCompliantCount.asJson, "SeveritySummary" -> o.severitySummary.asJson)
  }
  final implicit val AssociationLimitExceededEncoder: io.circe.Encoder[avias.ssm.models.AssociationLimitExceeded.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidAutomationExecutionParametersExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidAutomationExecutionParametersException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeAssociationResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationDescription" -> o.associationDescription.asJson)
  }
  final implicit val CreateAssociationRequestEncoder: io.circe.Encoder[avias.ssm.models.CreateAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "InstanceId" -> o.instanceId.asJson, "Targets" -> o.targets.asJson, "AssociationName" -> o.associationName.asJson, "OutputLocation" -> o.outputLocation.asJson, "Parameters" -> o.parameters.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val RegisterTaskWithMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.RegisterTaskWithMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "TaskArn" -> o.taskArn.asJson, "WindowId" -> o.windowId.asJson, "TaskType" -> o.taskType.asJson, "MaxErrors" -> o.maxErrors.asJson, "ClientToken" -> o.clientToken.asJson, "Name" -> o.name.asJson, "TaskInvocationParameters" -> o.taskInvocationParameters.asJson, "Description" -> o.description.asJson, "TaskParameters" -> o.taskParameters.asJson, "LoggingInfo" -> o.loggingInfo.asJson, "Priority" -> o.priority.asJson)
  }
  final implicit val DescribeParametersRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "ParameterFilters" -> o.parameterFilters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AutomationDefinitionNotFoundExceptionEncoder: io.circe.Encoder[avias.ssm.models.AutomationDefinitionNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidDocumentSchemaVersionEncoder: io.circe.Encoder[avias.ssm.models.InvalidDocumentSchemaVersion] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AutomationExecutionLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.AutomationExecutionLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AutomationExecutionEncoder: io.circe.Encoder[avias.ssm.models.AutomationExecution] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentName" -> o.documentName.asJson, "StepExecutions" -> o.stepExecutions.asJson, "FailureMessage" -> o.failureMessage.asJson, "AutomationExecutionStatus" -> o.automationExecutionStatus.asJson, "Parameters" -> o.parameters.asJson, "Outputs" -> o.outputs.asJson, "ExecutionStartTime" -> o.executionStartTime.asJson, "ExecutionEndTime" -> o.executionEndTime.asJson, "AutomationExecutionId" -> o.automationExecutionId.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val HierarchyTypeMismatchExceptionEncoder: io.circe.Encoder[avias.ssm.models.HierarchyTypeMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AssociationFilterEncoder: io.circe.Encoder[avias.ssm.models.AssociationFilter] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val DocumentLimitExceededEncoder: io.circe.Encoder[avias.ssm.models.DocumentLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMaintenanceWindowTasksResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowTasksResult] = io.circe.Encoder.instance { o => 
    Json.obj("Tasks" -> o.tasks.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetAutomationExecutionResultEncoder: io.circe.Encoder[avias.ssm.models.GetAutomationExecutionResult] = io.circe.Encoder.instance { o => 
    Json.obj("AutomationExecution" -> o.automationExecution.asJson)
  }
  final implicit val S3OutputLocationEncoder: io.circe.Encoder[avias.ssm.models.S3OutputLocation] = io.circe.Encoder.instance { o => 
    Json.obj("OutputS3Region" -> o.outputS3Region.asJson, "OutputS3BucketName" -> o.outputS3BucketName.asJson, "OutputS3KeyPrefix" -> o.outputS3KeyPrefix.asJson)
  }
  final implicit val DescribeInstancePatchesResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstancePatchesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Patches" -> o.patches.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteDocumentResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteDocumentResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutParameterResultEncoder: io.circe.Encoder[avias.ssm.models.PutParameterResult] = io.circe.Encoder.instance { o => 
    Json.obj("Version" -> o.version.asJson)
  }
  final implicit val InvalidFilterEncoder: io.circe.Encoder[avias.ssm.models.InvalidFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ModifyDocumentPermissionResponseEncoder: io.circe.Encoder[avias.ssm.models.ModifyDocumentPermissionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommandInvocationRequestEncoder: io.circe.Encoder[avias.ssm.models.GetCommandInvocationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CommandId" -> o.commandId.asJson, "InstanceId" -> o.instanceId.asJson, "PluginName" -> o.pluginName.asJson)
  }
  final implicit val CommandPluginEncoder: io.circe.Encoder[avias.ssm.models.CommandPlugin] = io.circe.Encoder.instance { o => 
    Json.obj("ResponseCode" -> o.responseCode.asJson, "OutputS3KeyPrefix" -> o.outputS3KeyPrefix.asJson, "Output" -> o.output.asJson, "OutputS3BucketName" -> o.outputS3BucketName.asJson, "StatusDetails" -> o.statusDetails.asJson, "Name" -> o.name.asJson, "Status" -> o.status.asJson, "OutputS3Region" -> o.outputS3Region.asJson, "ResponseStartDateTime" -> o.responseStartDateTime.asJson, "ResponseFinishDateTime" -> o.responseFinishDateTime.asJson, "StandardOutputUrl" -> o.standardOutputUrl.asJson, "StandardErrorUrl" -> o.standardErrorUrl.asJson)
  }
  final implicit val DeleteActivationResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteActivationResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceDataSyncItemEncoder: io.circe.Encoder[avias.ssm.models.ResourceDataSyncItem] = io.circe.Encoder.instance { o => 
    Json.obj("SyncCreatedTime" -> o.syncCreatedTime.asJson, "LastStatus" -> o.lastStatus.asJson, "LastSyncTime" -> o.lastSyncTime.asJson, "S3Destination" -> o.s3Destination.asJson, "SyncName" -> o.syncName.asJson, "LastSuccessfulSyncTime" -> o.lastSuccessfulSyncTime.asJson)
  }
  final implicit val InvalidDocumentVersionEncoder: io.circe.Encoder[avias.ssm.models.InvalidDocumentVersion] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val StopAutomationExecutionResultEncoder: io.circe.Encoder[avias.ssm.models.StopAutomationExecutionResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateAssociationBatchRequestEncoder: io.circe.Encoder[avias.ssm.models.CreateAssociationBatchRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Entries" -> o.entries.asJson)
  }
  final implicit val GetDocumentResultEncoder: io.circe.Encoder[avias.ssm.models.GetDocumentResult] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DocumentVersion" -> o.documentVersion.asJson, "Content" -> o.content.asJson, "DocumentType" -> o.documentType.asJson)
  }
  final implicit val ResourceDataSyncCountExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.ResourceDataSyncCountExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeInstanceAssociationsStatusRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstanceAssociationsStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteResourceDataSyncRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteResourceDataSyncRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SyncName" -> o.syncName.asJson)
  }
  final implicit val DeletePatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.DeletePatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson)
  }
  final implicit val MaintenanceWindowTaskInvocationParametersEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowTaskInvocationParameters] = io.circe.Encoder.instance { o => 
    Json.obj("RunCommand" -> o.runCommand.asJson, "Automation" -> o.automation.asJson, "StepFunctions" -> o.stepFunctions.asJson, "Lambda" -> o.lambda.asJson)
  }
  final implicit val PatchRuleGroupEncoder: io.circe.Encoder[avias.ssm.models.PatchRuleGroup] = io.circe.Encoder.instance { o => 
    Json.obj("PatchRules" -> o.patchRules.asJson)
  }
  final implicit val GetMaintenanceWindowExecutionTaskInvocationRequestEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutionId" -> o.windowExecutionId.asJson, "TaskId" -> o.taskId.asJson, "InvocationId" -> o.invocationId.asJson)
  }
  final implicit val InvalidActivationEncoder: io.circe.Encoder[avias.ssm.models.InvalidActivation] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ActivationEncoder: io.circe.Encoder[avias.ssm.models.Activation] = io.circe.Encoder.instance { o => 
    Json.obj("DefaultInstanceName" -> o.defaultInstanceName.asJson, "Description" -> o.description.asJson, "IamRole" -> o.iamRole.asJson, "CreatedDate" -> o.createdDate.asJson, "ExpirationDate" -> o.expirationDate.asJson, "ActivationId" -> o.activationId.asJson, "RegistrationsCount" -> o.registrationsCount.asJson, "Expired" -> o.expired.asJson, "RegistrationLimit" -> o.registrationLimit.asJson)
  }
  final implicit val DescribeInstanceInformationRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstanceInformationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceInformationFilterList" -> o.instanceInformationFilterList.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeDocumentPermissionResponseEncoder: io.circe.Encoder[avias.ssm.models.DescribeDocumentPermissionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AccountIds" -> o.accountIds.asJson)
  }
  final implicit val MaintenanceWindowExecutionTaskInvocationIdentityEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowExecutionTaskInvocationIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("OwnerInformation" -> o.ownerInformation.asJson, "WindowTargetId" -> o.windowTargetId.asJson, "Status" -> o.status.asJson, "TaskExecutionId" -> o.taskExecutionId.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "TaskType" -> o.taskType.asJson, "InvocationId" -> o.invocationId.asJson, "ExecutionId" -> o.executionId.asJson, "StatusDetails" -> o.statusDetails.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val CreatePatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.CreatePatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson)
  }
  final implicit val UpdatePatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdatePatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "ApprovalRules" -> o.approvalRules.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "ApprovedPatchesComplianceLevel" -> o.approvedPatchesComplianceLevel.asJson, "GlobalFilters" -> o.globalFilters.asJson, "ApprovedPatches" -> o.approvedPatches.asJson, "RejectedPatches" -> o.rejectedPatches.asJson)
  }
  final implicit val CreateAssociationResultEncoder: io.circe.Encoder[avias.ssm.models.CreateAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationDescription" -> o.associationDescription.asJson)
  }
  final implicit val DescribeEffectivePatchesForPatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeEffectivePatchesForPatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateDocumentDefaultVersionResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateDocumentDefaultVersionResult] = io.circe.Encoder.instance { o => 
    Json.obj("Description" -> o.description.asJson)
  }
  final implicit val ListCommandInvocationsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListCommandInvocationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "MaxResults" -> o.maxResults.asJson, "CommandId" -> o.commandId.asJson, "Filters" -> o.filters.asJson, "Details" -> o.details.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListInventoryEntriesResultEncoder: io.circe.Encoder[avias.ssm.models.ListInventoryEntriesResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "SchemaVersion" -> o.schemaVersion.asJson, "CaptureTime" -> o.captureTime.asJson, "TypeName" -> o.typeName.asJson, "Entries" -> o.entries.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RegisterTargetWithMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.RegisterTargetWithMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "ResourceType" -> o.resourceType.asJson, "WindowId" -> o.windowId.asJson, "ClientToken" -> o.clientToken.asJson, "Name" -> o.name.asJson, "OwnerInformation" -> o.ownerInformation.asJson, "Description" -> o.description.asJson)
  }
  final implicit val UpdateAssociationStatusResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateAssociationStatusResult] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationDescription" -> o.associationDescription.asJson)
  }
  final implicit val ParameterEncoder: io.circe.Encoder[avias.ssm.models.Parameter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "Value" -> o.value.asJson, "Version" -> o.version.asJson)
  }
  final implicit val GetMaintenanceWindowExecutionTaskRequestEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutionId" -> o.windowExecutionId.asJson, "TaskId" -> o.taskId.asJson)
  }
  final implicit val StartAutomationExecutionResultEncoder: io.circe.Encoder[avias.ssm.models.StartAutomationExecutionResult] = io.circe.Encoder.instance { o => 
    Json.obj("AutomationExecutionId" -> o.automationExecutionId.asJson)
  }
  final implicit val ParameterMaxVersionLimitExceededEncoder: io.circe.Encoder[avias.ssm.models.ParameterMaxVersionLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidAutomationSignalExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidAutomationSignalException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateActivationResultEncoder: io.circe.Encoder[avias.ssm.models.CreateActivationResult] = io.circe.Encoder.instance { o => 
    Json.obj("ActivationId" -> o.activationId.asJson, "ActivationCode" -> o.activationCode.asJson)
  }
  final implicit val UnsupportedInventoryItemContextExceptionEncoder: io.circe.Encoder[avias.ssm.models.UnsupportedInventoryItemContextException] = io.circe.Encoder.instance { o => 
    Json.obj("TypeName" -> o.typeName.asJson, "Message" -> o.message.asJson)
  }
  final implicit val GetPatchBaselineForPatchGroupRequestEncoder: io.circe.Encoder[avias.ssm.models.GetPatchBaselineForPatchGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PatchGroup" -> o.patchGroup.asJson, "OperatingSystem" -> o.operatingSystem.asJson)
  }
  final implicit val InvalidDocumentEncoder: io.circe.Encoder[avias.ssm.models.InvalidDocument] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.CreateMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AllowUnassociatedTargets" -> o.allowUnassociatedTargets.asJson, "Name" -> o.name.asJson, "Cutoff" -> o.cutoff.asJson, "Schedule" -> o.schedule.asJson, "Duration" -> o.duration.asJson, "ClientToken" -> o.clientToken.asJson, "Description" -> o.description.asJson)
  }
  final implicit val AutomationExecutionNotFoundExceptionEncoder: io.circe.Encoder[avias.ssm.models.AutomationExecutionNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ParameterAlreadyExistsEncoder: io.circe.Encoder[avias.ssm.models.ParameterAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ParameterHistoryEncoder: io.circe.Encoder[avias.ssm.models.ParameterHistory] = io.circe.Encoder.instance { o => 
    Json.obj("Version" -> o.version.asJson, "Type" -> o.`type`.asJson, "LastModifiedUser" -> o.lastModifiedUser.asJson, "Description" -> o.description.asJson, "AllowedPattern" -> o.allowedPattern.asJson, "KeyId" -> o.keyId.asJson, "Name" -> o.name.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListAssociationsResultEncoder: io.circe.Encoder[avias.ssm.models.ListAssociationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Associations" -> o.associations.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PatchGroupPatchBaselineMappingEncoder: io.circe.Encoder[avias.ssm.models.PatchGroupPatchBaselineMapping] = io.circe.Encoder.instance { o => 
    Json.obj("PatchGroup" -> o.patchGroup.asJson, "BaselineIdentity" -> o.baselineIdentity.asJson)
  }
  final implicit val DescribeMaintenanceWindowExecutionsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowExecutionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutions" -> o.windowExecutions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InstanceAssociationOutputLocationEncoder: io.circe.Encoder[avias.ssm.models.InstanceAssociationOutputLocation] = io.circe.Encoder.instance { o => 
    Json.obj("S3Location" -> o.s3Location.asJson)
  }
  final implicit val AutomationExecutionFilterEncoder: io.circe.Encoder[avias.ssm.models.AutomationExecutionFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val GetPatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.GetPatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("ApprovalRules" -> o.approvalRules.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "PatchGroups" -> o.patchGroups.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "ApprovedPatchesComplianceLevel" -> o.approvedPatchesComplianceLevel.asJson, "BaselineId" -> o.baselineId.asJson, "GlobalFilters" -> o.globalFilters.asJson, "CreatedDate" -> o.createdDate.asJson, "ModifiedDate" -> o.modifiedDate.asJson, "ApprovedPatches" -> o.approvedPatches.asJson, "RejectedPatches" -> o.rejectedPatches.asJson)
  }
  final implicit val SendAutomationSignalResultEncoder: io.circe.Encoder[avias.ssm.models.SendAutomationSignalResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("AllowUnassociatedTargets" -> o.allowUnassociatedTargets.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "Cutoff" -> o.cutoff.asJson, "Schedule" -> o.schedule.asJson, "Duration" -> o.duration.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val DescribePatchBaselinesRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribePatchBaselinesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidTypeNameExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidTypeNameException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InstanceInformationStringFilterEncoder: io.circe.Encoder[avias.ssm.models.InstanceInformationStringFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val DocumentDescriptionEncoder: io.circe.Encoder[avias.ssm.models.DocumentDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "DocumentType" -> o.documentType.asJson, "PlatformTypes" -> o.platformTypes.asJson, "Hash" -> o.hash.asJson, "HashType" -> o.hashType.asJson, "Name" -> o.name.asJson, "Owner" -> o.owner.asJson, "Sha1" -> o.sha1.asJson, "Tags" -> o.tags.asJson, "CreatedDate" -> o.createdDate.asJson, "SchemaVersion" -> o.schemaVersion.asJson, "Parameters" -> o.parameters.asJson, "DocumentVersion" -> o.documentVersion.asJson, "LatestVersion" -> o.latestVersion.asJson, "DefaultVersion" -> o.defaultVersion.asJson, "Description" -> o.description.asJson)
  }
  final implicit val FailedCreateAssociationEncoder: io.circe.Encoder[avias.ssm.models.FailedCreateAssociation] = io.circe.Encoder.instance { o => 
    Json.obj("Entry" -> o.entry.asJson, "Message" -> o.message.asJson, "Fault" -> o.fault.asJson)
  }
  final implicit val ComplianceItemEncoder: io.circe.Encoder[avias.ssm.models.ComplianceItem] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Details" -> o.details.asJson, "ExecutionSummary" -> o.executionSummary.asJson, "Title" -> o.title.asJson, "Severity" -> o.severity.asJson, "Status" -> o.status.asJson, "Id" -> o.id.asJson, "ComplianceType" -> o.complianceType.asJson, "ResourceType" -> o.resourceType.asJson)
  }
  final implicit val DeleteParameterRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteParameterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val GetMaintenanceWindowExecutionTaskInvocationResultEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationResult] = io.circe.Encoder.instance { o => 
    Json.obj("OwnerInformation" -> o.ownerInformation.asJson, "WindowTargetId" -> o.windowTargetId.asJson, "Status" -> o.status.asJson, "TaskExecutionId" -> o.taskExecutionId.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "TaskType" -> o.taskType.asJson, "InvocationId" -> o.invocationId.asJson, "ExecutionId" -> o.executionId.asJson, "StatusDetails" -> o.statusDetails.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val ItemSizeLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.ItemSizeLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("TypeName" -> o.typeName.asJson, "Message" -> o.message.asJson)
  }
  final implicit val DescribeInstanceInformationResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstanceInformationResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceInformationList" -> o.instanceInformationList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CommandFilterEncoder: io.circe.Encoder[avias.ssm.models.CommandFilter] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.ssm.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMaintenanceWindowExecutionsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowExecutionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidFilterOptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidFilterOption] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutInventoryRequestEncoder: io.circe.Encoder[avias.ssm.models.PutInventoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "Items" -> o.items.asJson)
  }
  final implicit val CreateActivationRequestEncoder: io.circe.Encoder[avias.ssm.models.CreateActivationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("IamRole" -> o.iamRole.asJson, "DefaultInstanceName" -> o.defaultInstanceName.asJson, "Description" -> o.description.asJson, "ExpirationDate" -> o.expirationDate.asJson, "RegistrationLimit" -> o.registrationLimit.asJson)
  }
  final implicit val CustomSchemaCountLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.CustomSchemaCountLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListResourceDataSyncResultEncoder: io.circe.Encoder[avias.ssm.models.ListResourceDataSyncResult] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceDataSyncItems" -> o.resourceDataSyncItems.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RegisterTargetWithMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.RegisterTargetWithMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowTargetId" -> o.windowTargetId.asJson)
  }
  final implicit val InventoryFilterEncoder: io.circe.Encoder[avias.ssm.models.InventoryFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListInventoryEntriesRequestEncoder: io.circe.Encoder[avias.ssm.models.ListInventoryEntriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "TypeName" -> o.typeName.asJson, "MaxResults" -> o.maxResults.asJson, "Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetParametersByPathRequestEncoder: io.circe.Encoder[avias.ssm.models.GetParametersByPathRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Path" -> o.path.asJson, "MaxResults" -> o.maxResults.asJson, "ParameterFilters" -> o.parameterFilters.asJson, "Recursive" -> o.recursive.asJson, "WithDecryption" -> o.withDecryption.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ParameterMetadataEncoder: io.circe.Encoder[avias.ssm.models.ParameterMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("Version" -> o.version.asJson, "Type" -> o.`type`.asJson, "LastModifiedUser" -> o.lastModifiedUser.asJson, "Description" -> o.description.asJson, "AllowedPattern" -> o.allowedPattern.asJson, "KeyId" -> o.keyId.asJson, "Name" -> o.name.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson)
  }
  final implicit val InstancePatchStateEncoder: io.circe.Encoder[avias.ssm.models.InstancePatchState] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "BaselineId" -> o.baselineId.asJson, "Operation" -> o.operation.asJson, "OperationStartTime" -> o.operationStartTime.asJson, "OperationEndTime" -> o.operationEndTime.asJson, "PatchGroup" -> o.patchGroup.asJson, "OwnerInformation" -> o.ownerInformation.asJson, "NotApplicableCount" -> o.notApplicableCount.asJson, "InstalledCount" -> o.installedCount.asJson, "FailedCount" -> o.failedCount.asJson, "MissingCount" -> o.missingCount.asJson, "InstalledOtherCount" -> o.installedOtherCount.asJson, "SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val ListAssociationVersionsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListAssociationVersionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationId" -> o.associationId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DuplicateDocumentContentEncoder: io.circe.Encoder[avias.ssm.models.DuplicateDocumentContent] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteParameterResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteParameterResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TotalSizeLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.TotalSizeLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val FeatureNotAvailableExceptionEncoder: io.circe.Encoder[avias.ssm.models.FeatureNotAvailableException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DocumentDefaultVersionDescriptionEncoder: io.circe.Encoder[avias.ssm.models.DocumentDefaultVersionDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DefaultVersion" -> o.defaultVersion.asJson)
  }
  final implicit val TooManyUpdatesEncoder: io.circe.Encoder[avias.ssm.models.TooManyUpdates] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListDocumentsResultEncoder: io.circe.Encoder[avias.ssm.models.ListDocumentsResult] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentIdentifiers" -> o.documentIdentifiers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.ssm.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val TargetEncoder: io.circe.Encoder[avias.ssm.models.Target] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val GetDeployablePatchSnapshotForInstanceResultEncoder: io.circe.Encoder[avias.ssm.models.GetDeployablePatchSnapshotForInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "SnapshotId" -> o.snapshotId.asJson, "SnapshotDownloadUrl" -> o.snapshotDownloadUrl.asJson, "Product" -> o.product.asJson)
  }
  final implicit val GetCommandInvocationResultEncoder: io.circe.Encoder[avias.ssm.models.GetCommandInvocationResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "DocumentName" -> o.documentName.asJson, "StandardErrorContent" -> o.standardErrorContent.asJson, "Comment" -> o.comment.asJson, "ResponseCode" -> o.responseCode.asJson, "StatusDetails" -> o.statusDetails.asJson, "StandardOutputContent" -> o.standardOutputContent.asJson, "PluginName" -> o.pluginName.asJson, "Status" -> o.status.asJson, "ExecutionStartDateTime" -> o.executionStartDateTime.asJson, "ExecutionElapsedTime" -> o.executionElapsedTime.asJson, "ExecutionEndDateTime" -> o.executionEndDateTime.asJson, "CommandId" -> o.commandId.asJson, "StandardOutputUrl" -> o.standardOutputUrl.asJson, "StandardErrorUrl" -> o.standardErrorUrl.asJson)
  }
  final implicit val MaintenanceWindowTargetEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowTarget] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "ResourceType" -> o.resourceType.asJson, "Name" -> o.name.asJson, "OwnerInformation" -> o.ownerInformation.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "WindowTargetId" -> o.windowTargetId.asJson)
  }
  final implicit val ListResourceComplianceSummariesRequestEncoder: io.circe.Encoder[avias.ssm.models.ListResourceComplianceSummariesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ResourceDataSyncS3DestinationEncoder: io.circe.Encoder[avias.ssm.models.ResourceDataSyncS3Destination] = io.circe.Encoder.instance { o => 
    Json.obj("BucketName" -> o.bucketName.asJson, "SyncFormat" -> o.syncFormat.asJson, "Region" -> o.region.asJson, "AWSKMSKeyARN" -> o.awskmskeyARN.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val ComplianceExecutionSummaryEncoder: io.circe.Encoder[avias.ssm.models.ComplianceExecutionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("ExecutionTime" -> o.executionTime.asJson, "ExecutionId" -> o.executionId.asJson, "ExecutionType" -> o.executionType.asJson)
  }
  final implicit val TooManyTagsErrorEncoder: io.circe.Encoder[avias.ssm.models.TooManyTagsError.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListCommandInvocationsResultEncoder: io.circe.Encoder[avias.ssm.models.ListCommandInvocationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("CommandInvocations" -> o.commandInvocations.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateResourceDataSyncRequestEncoder: io.circe.Encoder[avias.ssm.models.CreateResourceDataSyncRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SyncName" -> o.syncName.asJson, "S3Destination" -> o.s3Destination.asJson)
  }
  final implicit val DeleteAssociationRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "InstanceId" -> o.instanceId.asJson, "AssociationId" -> o.associationId.asJson)
  }
  final implicit val ListResourceDataSyncRequestEncoder: io.circe.Encoder[avias.ssm.models.ListResourceDataSyncRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ParameterLimitExceededEncoder: io.circe.Encoder[avias.ssm.models.ParameterLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val FailureDetailsEncoder: io.circe.Encoder[avias.ssm.models.FailureDetails] = io.circe.Encoder.instance { o => 
    Json.obj("FailureStage" -> o.failureStage.asJson, "FailureType" -> o.failureType.asJson, "Details" -> o.details.asJson)
  }
  final implicit val UpdateMaintenanceWindowTaskRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateMaintenanceWindowTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowTaskId" -> o.windowTaskId.asJson, "WindowId" -> o.windowId.asJson, "Targets" -> o.targets.asJson, "Name" -> o.name.asJson, "TaskInvocationParameters" -> o.taskInvocationParameters.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "TaskArn" -> o.taskArn.asJson, "Description" -> o.description.asJson, "TaskParameters" -> o.taskParameters.asJson, "LoggingInfo" -> o.loggingInfo.asJson, "Replace" -> o.replace.asJson, "Priority" -> o.priority.asJson, "MaxErrors" -> o.maxErrors.asJson)
  }
  final implicit val RegisterTaskWithMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.RegisterTaskWithMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowTaskId" -> o.windowTaskId.asJson)
  }
  final implicit val UnsupportedParameterTypeEncoder: io.circe.Encoder[avias.ssm.models.UnsupportedParameterType] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidNotificationConfigEncoder: io.circe.Encoder[avias.ssm.models.InvalidNotificationConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateManagedInstanceRoleRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateManagedInstanceRoleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "IamRole" -> o.iamRole.asJson)
  }
  final implicit val DeleteResourceDataSyncResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteResourceDataSyncResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDocumentRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateDocumentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Content" -> o.content.asJson, "Name" -> o.name.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val RegisterDefaultPatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.RegisterDefaultPatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson)
  }
  final implicit val MaintenanceWindowIdentityEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "Cutoff" -> o.cutoff.asJson, "Duration" -> o.duration.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val UnsupportedOperatingSystemEncoder: io.circe.Encoder[avias.ssm.models.UnsupportedOperatingSystem] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InstanceAssociationOutputUrlEncoder: io.circe.Encoder[avias.ssm.models.InstanceAssociationOutputUrl] = io.circe.Encoder.instance { o => 
    Json.obj("S3OutputUrl" -> o.s3OutputUrl.asJson)
  }
  final implicit val GetParameterRequestEncoder: io.circe.Encoder[avias.ssm.models.GetParameterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "WithDecryption" -> o.withDecryption.asJson)
  }
  final implicit val S3OutputUrlEncoder: io.circe.Encoder[avias.ssm.models.S3OutputUrl] = io.circe.Encoder.instance { o => 
    Json.obj("OutputUrl" -> o.outputUrl.asJson)
  }
  final implicit val IdempotentParameterMismatchEncoder: io.circe.Encoder[avias.ssm.models.IdempotentParameterMismatch] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EffectivePatchEncoder: io.circe.Encoder[avias.ssm.models.EffectivePatch] = io.circe.Encoder.instance { o => 
    Json.obj("Patch" -> o.patch.asJson, "PatchStatus" -> o.patchStatus.asJson)
  }
  final implicit val DescribeMaintenanceWindowTargetsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowTargetsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsToResourceResultEncoder: io.circe.Encoder[avias.ssm.models.AddTagsToResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PatchFilterGroupEncoder: io.circe.Encoder[avias.ssm.models.PatchFilterGroup] = io.circe.Encoder.instance { o => 
    Json.obj("PatchFilters" -> o.patchFilters.asJson)
  }
  final implicit val InvalidFilterValueEncoder: io.circe.Encoder[avias.ssm.models.InvalidFilterValue] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val StartAutomationExecutionRequestEncoder: io.circe.Encoder[avias.ssm.models.StartAutomationExecutionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentName" -> o.documentName.asJson, "DocumentVersion" -> o.documentVersion.asJson, "Parameters" -> o.parameters.asJson, "ClientToken" -> o.clientToken.asJson)
  }
  final implicit val InvalidOutputLocationEncoder: io.circe.Encoder[avias.ssm.models.InvalidOutputLocation.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CancelCommandRequestEncoder: io.circe.Encoder[avias.ssm.models.CancelCommandRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CommandId" -> o.commandId.asJson, "InstanceIds" -> o.instanceIds.asJson)
  }
  final implicit val RemoveTagsFromResourceResultEncoder: io.circe.Encoder[avias.ssm.models.RemoveTagsFromResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComplianceStringFilterEncoder: io.circe.Encoder[avias.ssm.models.ComplianceStringFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val InvalidPluginNameEncoder: io.circe.Encoder[avias.ssm.models.InvalidPluginName.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeAvailablePatchesResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeAvailablePatchesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Patches" -> o.patches.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AutomationExecutionMetadataEncoder: io.circe.Encoder[avias.ssm.models.AutomationExecutionMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentName" -> o.documentName.asJson, "ExecutedBy" -> o.executedBy.asJson, "LogFile" -> o.logFile.asJson, "AutomationExecutionStatus" -> o.automationExecutionStatus.asJson, "Outputs" -> o.outputs.asJson, "ExecutionStartTime" -> o.executionStartTime.asJson, "ExecutionEndTime" -> o.executionEndTime.asJson, "AutomationExecutionId" -> o.automationExecutionId.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val AssociationVersionInfoEncoder: io.circe.Encoder[avias.ssm.models.AssociationVersionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Targets" -> o.targets.asJson, "AssociationId" -> o.associationId.asJson, "AssociationName" -> o.associationName.asJson, "OutputLocation" -> o.outputLocation.asJson, "Parameters" -> o.parameters.asJson, "AssociationVersion" -> o.associationVersion.asJson, "CreatedDate" -> o.createdDate.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val CreateDocumentResultEncoder: io.circe.Encoder[avias.ssm.models.CreateDocumentResult] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentDescription" -> o.documentDescription.asJson)
  }
  final implicit val DuplicateInstanceIdEncoder: io.circe.Encoder[avias.ssm.models.DuplicateInstanceId.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetParametersByPathResultEncoder: io.circe.Encoder[avias.ssm.models.GetParametersByPathResult] = io.circe.Encoder.instance { o => 
    Json.obj("Parameters" -> o.parameters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val MaintenanceWindowLambdaParametersEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowLambdaParameters] = io.circe.Encoder.instance { o => 
    Json.obj("ClientContext" -> o.clientContext.asJson, "Qualifier" -> o.qualifier.asJson, "Payload" -> o.payload.asJson)
  }
  final implicit val MaintenanceWindowTaskEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowTask] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "WindowTaskId" -> o.windowTaskId.asJson, "Name" -> o.name.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "TaskArn" -> o.taskArn.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "Type" -> o.`type`.asJson, "TaskParameters" -> o.taskParameters.asJson, "LoggingInfo" -> o.loggingInfo.asJson, "Priority" -> o.priority.asJson, "MaxErrors" -> o.maxErrors.asJson)
  }
  final implicit val DeregisterPatchBaselineForPatchGroupRequestEncoder: io.circe.Encoder[avias.ssm.models.DeregisterPatchBaselineForPatchGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "PatchGroup" -> o.patchGroup.asJson)
  }
  final implicit val GetAutomationExecutionRequestEncoder: io.circe.Encoder[avias.ssm.models.GetAutomationExecutionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AutomationExecutionId" -> o.automationExecutionId.asJson)
  }
  final implicit val AssociationVersionLimitExceededEncoder: io.circe.Encoder[avias.ssm.models.AssociationVersionLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val GetDocumentRequestEncoder: io.circe.Encoder[avias.ssm.models.GetDocumentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val DescribePatchGroupsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribePatchGroupsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Mappings" -> o.mappings.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CommandEncoder: io.circe.Encoder[avias.ssm.models.Command] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentName" -> o.documentName.asJson, "Targets" -> o.targets.asJson, "Comment" -> o.comment.asJson, "OutputS3KeyPrefix" -> o.outputS3KeyPrefix.asJson, "Parameters" -> o.parameters.asJson, "OutputS3BucketName" -> o.outputS3BucketName.asJson, "StatusDetails" -> o.statusDetails.asJson, "ServiceRole" -> o.serviceRole.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "OutputS3Region" -> o.outputS3Region.asJson, "TargetCount" -> o.targetCount.asJson, "ExpiresAfter" -> o.expiresAfter.asJson, "RequestedDateTime" -> o.requestedDateTime.asJson, "CommandId" -> o.commandId.asJson, "InstanceIds" -> o.instanceIds.asJson, "NotificationConfig" -> o.notificationConfig.asJson, "Status" -> o.status.asJson, "CompletedCount" -> o.completedCount.asJson, "MaxErrors" -> o.maxErrors.asJson, "ErrorCount" -> o.errorCount.asJson)
  }
  final implicit val UpdateManagedInstanceRoleResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateManagedInstanceRoleResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("AllowUnassociatedTargets" -> o.allowUnassociatedTargets.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "CreatedDate" -> o.createdDate.asJson, "ModifiedDate" -> o.modifiedDate.asJson, "WindowId" -> o.windowId.asJson, "Cutoff" -> o.cutoff.asJson, "Schedule" -> o.schedule.asJson, "Duration" -> o.duration.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val ComplianceTypeCountLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.ComplianceTypeCountLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListDocumentVersionsResultEncoder: io.circe.Encoder[avias.ssm.models.ListDocumentVersionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentVersions" -> o.documentVersions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InstanceInformationEncoder: io.circe.Encoder[avias.ssm.models.InstanceInformation] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "IamRole" -> o.iamRole.asJson, "PlatformName" -> o.platformName.asJson, "PlatformVersion" -> o.platformVersion.asJson, "Name" -> o.name.asJson, "IPAddress" -> o.ipaddress.asJson, "ActivationId" -> o.activationId.asJson, "AssociationStatus" -> o.associationStatus.asJson, "AssociationOverview" -> o.associationOverview.asJson, "PingStatus" -> o.pingStatus.asJson, "ResourceType" -> o.resourceType.asJson, "LastPingDateTime" -> o.lastPingDateTime.asJson, "RegistrationDate" -> o.registrationDate.asJson, "LastAssociationExecutionDate" -> o.lastAssociationExecutionDate.asJson, "LastSuccessfulAssociationExecutionDate" -> o.lastSuccessfulAssociationExecutionDate.asJson, "PlatformType" -> o.platformType.asJson, "IsLatestVersion" -> o.isLatestVersion.asJson, "AgentVersion" -> o.agentVersion.asJson, "ComputerName" -> o.computerName.asJson)
  }
  final implicit val CreateMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.CreateMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson)
  }
  final implicit val GetPatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.GetPatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson)
  }
  final implicit val DescribeActivationsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeActivationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("ActivationList" -> o.activationList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetPatchBaselineForPatchGroupResultEncoder: io.circe.Encoder[avias.ssm.models.GetPatchBaselineForPatchGroupResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "PatchGroup" -> o.patchGroup.asJson, "OperatingSystem" -> o.operatingSystem.asJson)
  }
  final implicit val ResourceDataSyncAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.ssm.models.ResourceDataSyncAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("SyncName" -> o.syncName.asJson)
  }
  final implicit val InvalidAllowedPatternExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidAllowedPatternException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeMaintenanceWindowTasksRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidOutputFolderEncoder: io.circe.Encoder[avias.ssm.models.InvalidOutputFolder.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateAssociationStatusRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateAssociationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "InstanceId" -> o.instanceId.asJson, "AssociationStatus" -> o.associationStatus.asJson)
  }
  final implicit val PatchComplianceDataEncoder: io.circe.Encoder[avias.ssm.models.PatchComplianceData] = io.circe.Encoder.instance { o => 
    Json.obj("KBId" -> o.kbid.asJson, "Severity" -> o.severity.asJson, "Title" -> o.title.asJson, "InstalledTime" -> o.installedTime.asJson, "Classification" -> o.classification.asJson, "State" -> o.state.asJson)
  }
  final implicit val InvalidCommandIdEncoder: io.circe.Encoder[avias.ssm.models.InvalidCommandId.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MaintenanceWindowTaskParameterValueExpressionEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowTaskParameterValueExpression] = io.circe.Encoder.instance { o => 
    Json.obj("Values" -> o.values.asJson)
  }
  final implicit val SendAutomationSignalRequestEncoder: io.circe.Encoder[avias.ssm.models.SendAutomationSignalRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AutomationExecutionId" -> o.automationExecutionId.asJson, "SignalType" -> o.signalType.asJson, "Payload" -> o.payload.asJson)
  }
  final implicit val InstanceAggregatedAssociationOverviewEncoder: io.circe.Encoder[avias.ssm.models.InstanceAggregatedAssociationOverview] = io.circe.Encoder.instance { o => 
    Json.obj("DetailedStatus" -> o.detailedStatus.asJson, "InstanceAssociationStatusAggregatedCount" -> o.instanceAssociationStatusAggregatedCount.asJson)
  }
  final implicit val GetMaintenanceWindowExecutionResultEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowExecutionResult] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "StatusDetails" -> o.statusDetails.asJson, "TaskIds" -> o.taskIds.asJson)
  }
  final implicit val AddTagsToResourceRequestEncoder: io.circe.Encoder[avias.ssm.models.AddTagsToResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val PutParameterRequestEncoder: io.circe.Encoder[avias.ssm.models.PutParameterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Name" -> o.name.asJson, "Value" -> o.value.asJson, "Description" -> o.description.asJson, "AllowedPattern" -> o.allowedPattern.asJson, "KeyId" -> o.keyId.asJson, "Overwrite" -> o.overwrite.asJson)
  }
  final implicit val DeregisterTaskFromMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.DeregisterTaskFromMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "WindowTaskId" -> o.windowTaskId.asJson)
  }
  final implicit val DescribeMaintenanceWindowExecutionTasksRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutionId" -> o.windowExecutionId.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeDocumentPermissionRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeDocumentPermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "PermissionType" -> o.permissionType.asJson)
  }
  final implicit val InvalidParametersEncoder: io.circe.Encoder[avias.ssm.models.InvalidParameters] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PatchFilterEncoder: io.circe.Encoder[avias.ssm.models.PatchFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val InventoryItemSchemaEncoder: io.circe.Encoder[avias.ssm.models.InventoryItemSchema] = io.circe.Encoder.instance { o => 
    Json.obj("TypeName" -> o.typeName.asJson, "Attributes" -> o.attributes.asJson, "Version" -> o.version.asJson, "DisplayName" -> o.displayName.asJson)
  }
  final implicit val DocumentFilterEncoder: io.circe.Encoder[avias.ssm.models.DocumentFilter] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val GetMaintenanceWindowTaskResultEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowTaskResult] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "WindowTaskId" -> o.windowTaskId.asJson, "Name" -> o.name.asJson, "TaskInvocationParameters" -> o.taskInvocationParameters.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "TaskArn" -> o.taskArn.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "TaskType" -> o.taskType.asJson, "TaskParameters" -> o.taskParameters.asJson, "LoggingInfo" -> o.loggingInfo.asJson, "Priority" -> o.priority.asJson, "MaxErrors" -> o.maxErrors.asJson)
  }
  final implicit val GetParameterHistoryResultEncoder: io.circe.Encoder[avias.ssm.models.GetParameterHistoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("Parameters" -> o.parameters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeregisterTaskFromMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.DeregisterTaskFromMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "WindowTaskId" -> o.windowTaskId.asJson)
  }
  final implicit val DeleteDocumentRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteDocumentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val GetDefaultPatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.GetDefaultPatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "OperatingSystem" -> o.operatingSystem.asJson)
  }
  final implicit val MaxDocumentSizeExceededEncoder: io.circe.Encoder[avias.ssm.models.MaxDocumentSizeExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DocumentVersionInfoEncoder: io.circe.Encoder[avias.ssm.models.DocumentVersionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DocumentVersion" -> o.documentVersion.asJson, "CreatedDate" -> o.createdDate.asJson, "IsDefaultVersion" -> o.isDefaultVersion.asJson)
  }
  final implicit val ListAssociationVersionsResultEncoder: io.circe.Encoder[avias.ssm.models.ListAssociationVersionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationVersions" -> o.associationVersions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeEffectivePatchesForPatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeEffectivePatchesForPatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("EffectivePatches" -> o.effectivePatches.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InventoryResultItemEncoder: io.circe.Encoder[avias.ssm.models.InventoryResultItem] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaVersion" -> o.schemaVersion.asJson, "TypeName" -> o.typeName.asJson, "Content" -> o.content.asJson, "ContentHash" -> o.contentHash.asJson, "CaptureTime" -> o.captureTime.asJson)
  }
  final implicit val RegisterDefaultPatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.RegisterDefaultPatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson)
  }
  final implicit val DeregisterManagedInstanceRequestEncoder: io.circe.Encoder[avias.ssm.models.DeregisterManagedInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson)
  }
  final implicit val StopAutomationExecutionRequestEncoder: io.circe.Encoder[avias.ssm.models.StopAutomationExecutionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AutomationExecutionId" -> o.automationExecutionId.asJson)
  }
  final implicit val DescribePatchGroupStateRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribePatchGroupStateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PatchGroup" -> o.patchGroup.asJson)
  }
  final implicit val PatchEncoder: io.circe.Encoder[avias.ssm.models.Patch] = io.circe.Encoder.instance { o => 
    Json.obj("Description" -> o.description.asJson, "Language" -> o.language.asJson, "KbNumber" -> o.kbNumber.asJson, "ProductFamily" -> o.productFamily.asJson, "MsrcSeverity" -> o.msrcSeverity.asJson, "Vendor" -> o.vendor.asJson, "Title" -> o.title.asJson, "ContentUrl" -> o.contentUrl.asJson, "ReleaseDate" -> o.releaseDate.asJson, "MsrcNumber" -> o.msrcNumber.asJson, "Classification" -> o.classification.asJson, "Id" -> o.id.asJson, "Product" -> o.product.asJson)
  }
  final implicit val GetMaintenanceWindowTaskRequestEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "WindowTaskId" -> o.windowTaskId.asJson)
  }
  final implicit val GetMaintenanceWindowExecutionRequestEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowExecutionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutionId" -> o.windowExecutionId.asJson)
  }
  final implicit val DescribeAvailablePatchesRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeAvailablePatchesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AlreadyExistsExceptionEncoder: io.circe.Encoder[avias.ssm.models.AlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MaintenanceWindowStepFunctionsParametersEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowStepFunctionsParameters] = io.circe.Encoder.instance { o => 
    Json.obj("Input" -> o.input.asJson, "Name" -> o.name.asJson)
  }
  final implicit val GetInventorySchemaResultEncoder: io.circe.Encoder[avias.ssm.models.GetInventorySchemaResult] = io.circe.Encoder.instance { o => 
    Json.obj("Schemas" -> o.schemas.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociationDoesNotExistEncoder: io.circe.Encoder[avias.ssm.models.AssociationDoesNotExist] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson)
  }
  final implicit val GetDefaultPatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.GetDefaultPatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OperatingSystem" -> o.operatingSystem.asJson)
  }
  final implicit val InvalidInstanceInformationFilterValueEncoder: io.circe.Encoder[avias.ssm.models.InvalidInstanceInformationFilterValue] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeAssociationRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeAssociationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "InstanceId" -> o.instanceId.asJson, "AssociationId" -> o.associationId.asJson, "AssociationVersion" -> o.associationVersion.asJson)
  }
  final implicit val AssociationDescriptionEncoder: io.circe.Encoder[avias.ssm.models.AssociationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "Name" -> o.name.asJson, "Targets" -> o.targets.asJson, "AssociationId" -> o.associationId.asJson, "AssociationName" -> o.associationName.asJson, "OutputLocation" -> o.outputLocation.asJson, "Parameters" -> o.parameters.asJson, "AssociationVersion" -> o.associationVersion.asJson, "Date" -> o.date.asJson, "LastUpdateAssociationDate" -> o.lastUpdateAssociationDate.asJson, "LastExecutionDate" -> o.lastExecutionDate.asJson, "LastSuccessfulExecutionDate" -> o.lastSuccessfulExecutionDate.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "Overview" -> o.overview.asJson, "Status" -> o.status.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val DescribePatchBaselinesResultEncoder: io.circe.Encoder[avias.ssm.models.DescribePatchBaselinesResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineIdentities" -> o.baselineIdentities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson)
  }
  final implicit val ComplianceItemEntryEncoder: io.circe.Encoder[avias.ssm.models.ComplianceItemEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Severity" -> o.severity.asJson, "Status" -> o.status.asJson, "Details" -> o.details.asJson, "Title" -> o.title.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ListComplianceItemsResultEncoder: io.circe.Encoder[avias.ssm.models.ListComplianceItemsResult] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceItems" -> o.complianceItems.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociationOverviewEncoder: io.circe.Encoder[avias.ssm.models.AssociationOverview] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "DetailedStatus" -> o.detailedStatus.asJson, "AssociationStatusAggregatedCount" -> o.associationStatusAggregatedCount.asJson)
  }
  final implicit val DocumentKeyValuesFilterEncoder: io.circe.Encoder[avias.ssm.models.DocumentKeyValuesFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val DescribeInstancePatchesRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstancePatchesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val GetMaintenanceWindowExecutionTaskResultEncoder: io.circe.Encoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskResult] = io.circe.Encoder.instance { o => 
    Json.obj("TaskParameters" -> o.taskParameters.asJson, "Status" -> o.status.asJson, "TaskExecutionId" -> o.taskExecutionId.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "ServiceRole" -> o.serviceRole.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "TaskArn" -> o.taskArn.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Type" -> o.`type`.asJson, "StatusDetails" -> o.statusDetails.asJson, "Priority" -> o.priority.asJson, "MaxErrors" -> o.maxErrors.asJson)
  }
  final implicit val PatchOrchestratorFilterEncoder: io.circe.Encoder[avias.ssm.models.PatchOrchestratorFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val DescribeInstanceAssociationsStatusResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstanceAssociationsStatusResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceAssociationStatusInfos" -> o.instanceAssociationStatusInfos.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdatePatchBaselineResultEncoder: io.circe.Encoder[avias.ssm.models.UpdatePatchBaselineResult] = io.circe.Encoder.instance { o => 
    Json.obj("ApprovalRules" -> o.approvalRules.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "ApprovedPatchesComplianceLevel" -> o.approvedPatchesComplianceLevel.asJson, "BaselineId" -> o.baselineId.asJson, "GlobalFilters" -> o.globalFilters.asJson, "CreatedDate" -> o.createdDate.asJson, "ModifiedDate" -> o.modifiedDate.asJson, "ApprovedPatches" -> o.approvedPatches.asJson, "RejectedPatches" -> o.rejectedPatches.asJson)
  }
  final implicit val InvalidInstanceIdEncoder: io.circe.Encoder[avias.ssm.models.InvalidInstanceId] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InventoryItemAttributeEncoder: io.circe.Encoder[avias.ssm.models.InventoryItemAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DataType" -> o.dataType.asJson)
  }
  final implicit val DescribeAutomationExecutionsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeAutomationExecutionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociationAlreadyExistsEncoder: io.circe.Encoder[avias.ssm.models.AssociationAlreadyExists.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDocumentOperationEncoder: io.circe.Encoder[avias.ssm.models.InvalidDocumentOperation] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[avias.ssm.models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceId" -> o.resourceId.asJson)
  }
  final implicit val AssociationStatusEncoder: io.circe.Encoder[avias.ssm.models.AssociationStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Date" -> o.date.asJson, "Name" -> o.name.asJson, "Message" -> o.message.asJson, "AdditionalInfo" -> o.additionalInfo.asJson)
  }
  final implicit val GetInventorySchemaRequestEncoder: io.circe.Encoder[avias.ssm.models.GetInventorySchemaRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Aggregator" -> o.aggregator.asJson, "MaxResults" -> o.maxResults.asJson, "TypeName" -> o.typeName.asJson, "SubType" -> o.subType.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteActivationRequestEncoder: io.circe.Encoder[avias.ssm.models.DeleteActivationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ActivationId" -> o.activationId.asJson)
  }
  final implicit val InvalidPermissionTypeEncoder: io.circe.Encoder[avias.ssm.models.InvalidPermissionType] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InstancePatchStateFilterEncoder: io.circe.Encoder[avias.ssm.models.InstancePatchStateFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val InvalidInventoryItemContextExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidInventoryItemContextException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeMaintenanceWindowExecutionTaskInvocationsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutionTaskInvocationIdentities" -> o.windowExecutionTaskInvocationIdentities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DocumentAlreadyExistsEncoder: io.circe.Encoder[avias.ssm.models.DocumentAlreadyExists] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeEffectiveInstanceAssociationsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeEffectiveInstanceAssociationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Associations" -> o.associations.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetInventoryResultEncoder: io.circe.Encoder[avias.ssm.models.GetInventoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("Entities" -> o.entities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PatchStatusEncoder: io.circe.Encoder[avias.ssm.models.PatchStatus] = io.circe.Encoder.instance { o => 
    Json.obj("DeploymentStatus" -> o.deploymentStatus.asJson, "ComplianceLevel" -> o.complianceLevel.asJson, "ApprovalDate" -> o.approvalDate.asJson)
  }
  final implicit val InstanceAssociationStatusInfoEncoder: io.circe.Encoder[avias.ssm.models.InstanceAssociationStatusInfo] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "Name" -> o.name.asJson, "AssociationId" -> o.associationId.asJson, "AssociationName" -> o.associationName.asJson, "OutputUrl" -> o.outputUrl.asJson, "AssociationVersion" -> o.associationVersion.asJson, "Status" -> o.status.asJson, "DetailedStatus" -> o.detailedStatus.asJson, "ExecutionDate" -> o.executionDate.asJson, "ExecutionSummary" -> o.executionSummary.asJson, "DocumentVersion" -> o.documentVersion.asJson, "ErrorCode" -> o.errorCode.asJson)
  }
  final implicit val GetDeployablePatchSnapshotForInstanceRequestEncoder: io.circe.Encoder[avias.ssm.models.GetDeployablePatchSnapshotForInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val MaintenanceWindowExecutionTaskIdentityEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowExecutionTaskIdentity] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "TaskExecutionId" -> o.taskExecutionId.asJson, "WindowExecutionId" -> o.windowExecutionId.asJson, "TaskArn" -> o.taskArn.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "TaskType" -> o.taskType.asJson, "StatusDetails" -> o.statusDetails.asJson)
  }
  final implicit val ListTagsForResourceResultEncoder: io.circe.Encoder[avias.ssm.models.ListTagsForResourceResult] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val InvalidDocumentContentEncoder: io.circe.Encoder[avias.ssm.models.InvalidDocumentContent] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListCommandsResultEncoder: io.circe.Encoder[avias.ssm.models.ListCommandsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Commands" -> o.commands.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeInstancePatchStatesForPatchGroupResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstancePatchStatesForPatchGroupResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstancePatchStates" -> o.instancePatchStates.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StatusUnchangedEncoder: io.circe.Encoder[avias.ssm.models.StatusUnchanged.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RegisterPatchBaselineForPatchGroupRequestEncoder: io.circe.Encoder[avias.ssm.models.RegisterPatchBaselineForPatchGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "PatchGroup" -> o.patchGroup.asJson)
  }
  final implicit val DescribeMaintenanceWindowTargetsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListDocumentVersionsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListDocumentVersionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InventoryAggregatorEncoder: io.circe.Encoder[avias.ssm.models.InventoryAggregator] = io.circe.Encoder.instance { o => 
    Json.obj("Expression" -> o.expression.asJson, "Aggregators" -> o.aggregators.asJson)
  }
  final implicit val ResourceLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.ResourceLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateMaintenanceWindowTargetRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateMaintenanceWindowTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "WindowTargetId" -> o.windowTargetId.asJson, "Targets" -> o.targets.asJson, "Name" -> o.name.asJson, "OwnerInformation" -> o.ownerInformation.asJson, "Description" -> o.description.asJson, "Replace" -> o.replace.asJson)
  }
  final implicit val DocumentParameterEncoder: io.circe.Encoder[avias.ssm.models.DocumentParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "Description" -> o.description.asJson, "DefaultValue" -> o.defaultValue.asJson)
  }
  final implicit val ItemContentMismatchExceptionEncoder: io.circe.Encoder[avias.ssm.models.ItemContentMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("TypeName" -> o.typeName.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ListComplianceSummariesRequestEncoder: io.circe.Encoder[avias.ssm.models.ListComplianceSummariesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val GetParameterHistoryRequestEncoder: io.circe.Encoder[avias.ssm.models.GetParameterHistoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "WithDecryption" -> o.withDecryption.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InstanceInformationFilterEncoder: io.circe.Encoder[avias.ssm.models.InstanceInformationFilter] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "valueSet" -> o.valueSet.asJson)
  }
  final implicit val NotificationConfigEncoder: io.circe.Encoder[avias.ssm.models.NotificationConfig] = io.circe.Encoder.instance { o => 
    Json.obj("NotificationArn" -> o.notificationArn.asJson, "NotificationEvents" -> o.notificationEvents.asJson, "NotificationType" -> o.notificationType.asJson)
  }
  final implicit val DescribeActivationsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeActivationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDocumentRequestEncoder: io.circe.Encoder[avias.ssm.models.CreateDocumentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Content" -> o.content.asJson, "Name" -> o.name.asJson, "DocumentType" -> o.documentType.asJson)
  }
  final implicit val DescribeParametersResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeParametersResult] = io.circe.Encoder.instance { o => 
    Json.obj("Parameters" -> o.parameters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DoesNotExistExceptionEncoder: io.circe.Encoder[avias.ssm.models.DoesNotExistException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val SubTypeCountLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.SubTypeCountLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListDocumentsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListDocumentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentFilterList" -> o.documentFilterList.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidItemContentExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidItemContentException] = io.circe.Encoder.instance { o => 
    Json.obj("TypeName" -> o.typeName.asJson, "Message" -> o.message.asJson)
  }
  final implicit val DescribeEffectiveInstanceAssociationsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeEffectiveInstanceAssociationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidAssociationVersionEncoder: io.circe.Encoder[avias.ssm.models.InvalidAssociationVersion] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateAssociationResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateAssociationResult] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationDescription" -> o.associationDescription.asJson)
  }
  final implicit val DescribeInstancePatchStatesForPatchGroupRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstancePatchStatesForPatchGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PatchGroup" -> o.patchGroup.asJson, "Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val InvalidResultAttributeExceptionEncoder: io.circe.Encoder[avias.ssm.models.InvalidResultAttributeException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeAutomationExecutionsResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeAutomationExecutionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("AutomationExecutionMetadataList" -> o.automationExecutionMetadataList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeregisterPatchBaselineForPatchGroupResultEncoder: io.circe.Encoder[avias.ssm.models.DeregisterPatchBaselineForPatchGroupResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "PatchGroup" -> o.patchGroup.asJson)
  }
  final implicit val DescribePatchGroupsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribePatchGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateDocumentDefaultVersionRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateDocumentDefaultVersionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val GetInventoryRequestEncoder: io.circe.Encoder[avias.ssm.models.GetInventoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResultAttributes" -> o.resultAttributes.asJson, "MaxResults" -> o.maxResults.asJson, "Aggregators" -> o.aggregators.asJson, "Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val LoggingInfoEncoder: io.circe.Encoder[avias.ssm.models.LoggingInfo] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3Region" -> o.s3Region.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson)
  }
  final implicit val AssociationEncoder: io.circe.Encoder[avias.ssm.models.Association] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "Name" -> o.name.asJson, "Targets" -> o.targets.asJson, "AssociationId" -> o.associationId.asJson, "AssociationName" -> o.associationName.asJson, "AssociationVersion" -> o.associationVersion.asJson, "LastExecutionDate" -> o.lastExecutionDate.asJson, "ScheduleExpression" -> o.scheduleExpression.asJson, "Overview" -> o.overview.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val ResultAttributeEncoder: io.circe.Encoder[avias.ssm.models.ResultAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("TypeName" -> o.typeName.asJson)
  }
  final implicit val DeregisterManagedInstanceResultEncoder: io.circe.Encoder[avias.ssm.models.DeregisterManagedInstanceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.CreatePatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ClientToken" -> o.clientToken.asJson, "ApprovalRules" -> o.approvalRules.asJson, "Description" -> o.description.asJson, "OperatingSystem" -> o.operatingSystem.asJson, "ApprovedPatchesComplianceLevel" -> o.approvedPatchesComplianceLevel.asJson, "GlobalFilters" -> o.globalFilters.asJson, "ApprovedPatches" -> o.approvedPatches.asJson, "RejectedPatches" -> o.rejectedPatches.asJson)
  }
  final implicit val AutomationDefinitionVersionNotFoundExceptionEncoder: io.circe.Encoder[avias.ssm.models.AutomationDefinitionVersionNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvocationDoesNotExistEncoder: io.circe.Encoder[avias.ssm.models.InvocationDoesNotExist.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SendCommandResultEncoder: io.circe.Encoder[avias.ssm.models.SendCommandResult] = io.circe.Encoder.instance { o => 
    Json.obj("Command" -> o.command.asJson)
  }
  final implicit val HierarchyLevelLimitExceededExceptionEncoder: io.circe.Encoder[avias.ssm.models.HierarchyLevelLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeregisterTargetFromMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.DeregisterTargetFromMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "WindowTargetId" -> o.windowTargetId.asJson, "Safe" -> o.safe.asJson)
  }
  final implicit val ComplianceSummaryItemEncoder: io.circe.Encoder[avias.ssm.models.ComplianceSummaryItem] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceType" -> o.complianceType.asJson, "CompliantSummary" -> o.compliantSummary.asJson, "NonCompliantSummary" -> o.nonCompliantSummary.asJson)
  }
  final implicit val DeletePatchBaselineRequestEncoder: io.circe.Encoder[avias.ssm.models.DeletePatchBaselineRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson)
  }
  final implicit val InventoryItemEncoder: io.circe.Encoder[avias.ssm.models.InventoryItem] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaVersion" -> o.schemaVersion.asJson, "CaptureTime" -> o.captureTime.asJson, "TypeName" -> o.typeName.asJson, "ContentHash" -> o.contentHash.asJson, "Content" -> o.content.asJson, "Context" -> o.context.asJson)
  }
  final implicit val ParameterVersionNotFoundEncoder: io.circe.Encoder[avias.ssm.models.ParameterVersionNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DocumentPermissionLimitEncoder: io.circe.Encoder[avias.ssm.models.DocumentPermissionLimit] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeDocumentRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeDocumentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val DocumentIdentifierEncoder: io.circe.Encoder[avias.ssm.models.DocumentIdentifier] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentType" -> o.documentType.asJson, "PlatformTypes" -> o.platformTypes.asJson, "Name" -> o.name.asJson, "Owner" -> o.owner.asJson, "Tags" -> o.tags.asJson, "SchemaVersion" -> o.schemaVersion.asJson, "DocumentVersion" -> o.documentVersion.asJson)
  }
  final implicit val PutComplianceItemsRequestEncoder: io.circe.Encoder[avias.ssm.models.PutComplianceItemsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ExecutionSummary" -> o.executionSummary.asJson, "Items" -> o.items.asJson, "ComplianceType" -> o.complianceType.asJson, "ResourceType" -> o.resourceType.asJson, "ItemContentHash" -> o.itemContentHash.asJson)
  }
  final implicit val UpdateMaintenanceWindowTaskResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateMaintenanceWindowTaskResult] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "WindowTaskId" -> o.windowTaskId.asJson, "Name" -> o.name.asJson, "TaskInvocationParameters" -> o.taskInvocationParameters.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "MaxConcurrency" -> o.maxConcurrency.asJson, "TaskArn" -> o.taskArn.asJson, "Description" -> o.description.asJson, "WindowId" -> o.windowId.asJson, "TaskParameters" -> o.taskParameters.asJson, "LoggingInfo" -> o.loggingInfo.asJson, "Priority" -> o.priority.asJson, "MaxErrors" -> o.maxErrors.asJson)
  }
  final implicit val ListComplianceItemsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListComplianceItemsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceTypes" -> o.resourceTypes.asJson, "Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "ResourceIds" -> o.resourceIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeregisterTargetFromMaintenanceWindowResultEncoder: io.circe.Encoder[avias.ssm.models.DeregisterTargetFromMaintenanceWindowResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "WindowTargetId" -> o.windowTargetId.asJson)
  }
  final implicit val RegisterPatchBaselineForPatchGroupResultEncoder: io.circe.Encoder[avias.ssm.models.RegisterPatchBaselineForPatchGroupResult] = io.circe.Encoder.instance { o => 
    Json.obj("BaselineId" -> o.baselineId.asJson, "PatchGroup" -> o.patchGroup.asJson)
  }
  final implicit val CompliantSummaryEncoder: io.circe.Encoder[avias.ssm.models.CompliantSummary] = io.circe.Encoder.instance { o => 
    Json.obj("CompliantCount" -> o.compliantCount.asJson, "SeveritySummary" -> o.severitySummary.asJson)
  }
  final implicit val DescribeActivationsFilterEncoder: io.circe.Encoder[avias.ssm.models.DescribeActivationsFilter] = io.circe.Encoder.instance { o => 
    Json.obj("FilterKey" -> o.filterKey.asJson, "FilterValues" -> o.filterValues.asJson)
  }
  final implicit val InvalidResourceTypeEncoder: io.circe.Encoder[avias.ssm.models.InvalidResourceType.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListResourceComplianceSummariesResultEncoder: io.circe.Encoder[avias.ssm.models.ListResourceComplianceSummariesResult] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceComplianceSummaryItems" -> o.resourceComplianceSummaryItems.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateResourceDataSyncResultEncoder: io.circe.Encoder[avias.ssm.models.CreateResourceDataSyncResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteAssociationResultEncoder: io.circe.Encoder[avias.ssm.models.DeleteAssociationResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedPlatformTypeEncoder: io.circe.Encoder[avias.ssm.models.UnsupportedPlatformType] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidTargetEncoder: io.circe.Encoder[avias.ssm.models.InvalidTarget] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateDocumentResultEncoder: io.circe.Encoder[avias.ssm.models.UpdateDocumentResult] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentDescription" -> o.documentDescription.asJson)
  }
  final implicit val MaintenanceWindowFilterEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val CommandInvocationEncoder: io.circe.Encoder[avias.ssm.models.CommandInvocation] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "DocumentName" -> o.documentName.asJson, "InstanceName" -> o.instanceName.asJson, "Comment" -> o.comment.asJson, "StatusDetails" -> o.statusDetails.asJson, "TraceOutput" -> o.traceOutput.asJson, "ServiceRole" -> o.serviceRole.asJson, "CommandPlugins" -> o.commandPlugins.asJson, "RequestedDateTime" -> o.requestedDateTime.asJson, "Status" -> o.status.asJson, "CommandId" -> o.commandId.asJson, "NotificationConfig" -> o.notificationConfig.asJson, "StandardOutputUrl" -> o.standardOutputUrl.asJson, "StandardErrorUrl" -> o.standardErrorUrl.asJson)
  }
  final implicit val ModifyDocumentPermissionRequestEncoder: io.circe.Encoder[avias.ssm.models.ModifyDocumentPermissionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "PermissionType" -> o.permissionType.asJson, "AccountIdsToAdd" -> o.accountIdsToAdd.asJson, "AccountIdsToRemove" -> o.accountIdsToRemove.asJson)
  }
  final implicit val AssociatedInstancesEncoder: io.circe.Encoder[avias.ssm.models.AssociatedInstances.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateAssociationBatchResultEncoder: io.circe.Encoder[avias.ssm.models.CreateAssociationBatchResult] = io.circe.Encoder.instance { o => 
    Json.obj("Successful" -> o.successful.asJson, "Failed" -> o.failed.asJson)
  }
  final implicit val ParameterStringFilterEncoder: io.circe.Encoder[avias.ssm.models.ParameterStringFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Option" -> o.option.asJson, "Values" -> o.values.asJson)
  }
  final implicit val ListComplianceSummariesResultEncoder: io.circe.Encoder[avias.ssm.models.ListComplianceSummariesResult] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceSummaryItems" -> o.complianceSummaryItems.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidFilterKeyEncoder: io.circe.Encoder[avias.ssm.models.InvalidFilterKey.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetParametersRequestEncoder: io.circe.Encoder[avias.ssm.models.GetParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "WithDecryption" -> o.withDecryption.asJson)
  }
  final implicit val PatchRuleEncoder: io.circe.Encoder[avias.ssm.models.PatchRule] = io.circe.Encoder.instance { o => 
    Json.obj("PatchFilterGroup" -> o.patchFilterGroup.asJson, "ApproveAfterDays" -> o.approveAfterDays.asJson, "ComplianceLevel" -> o.complianceLevel.asJson)
  }
  final implicit val InvalidUpdateEncoder: io.circe.Encoder[avias.ssm.models.InvalidUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ParameterPatternMismatchExceptionEncoder: io.circe.Encoder[avias.ssm.models.ParameterPatternMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[avias.ssm.models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val StepExecutionEncoder: io.circe.Encoder[avias.ssm.models.StepExecution] = io.circe.Encoder.instance { o => 
    Json.obj("StepName" -> o.stepName.asJson, "ResponseCode" -> o.responseCode.asJson, "Response" -> o.response.asJson, "FailureMessage" -> o.failureMessage.asJson, "StepStatus" -> o.stepStatus.asJson, "Outputs" -> o.outputs.asJson, "FailureDetails" -> o.failureDetails.asJson, "Action" -> o.action.asJson, "ExecutionStartTime" -> o.executionStartTime.asJson, "ExecutionEndTime" -> o.executionEndTime.asJson, "Inputs" -> o.inputs.asJson)
  }
  final implicit val MaintenanceWindowAutomationParametersEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowAutomationParameters] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentVersion" -> o.documentVersion.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val DescribeMaintenanceWindowExecutionTasksResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTasksResult] = io.circe.Encoder.instance { o => 
    Json.obj("WindowExecutionTaskIdentities" -> o.windowExecutionTaskIdentities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ParameterNotFoundEncoder: io.circe.Encoder[avias.ssm.models.ParameterNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UnsupportedInventorySchemaVersionExceptionEncoder: io.circe.Encoder[avias.ssm.models.UnsupportedInventorySchemaVersionException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InstanceAssociationEncoder: io.circe.Encoder[avias.ssm.models.InstanceAssociation] = io.circe.Encoder.instance { o => 
    Json.obj("AssociationId" -> o.associationId.asJson, "InstanceId" -> o.instanceId.asJson, "Content" -> o.content.asJson, "AssociationVersion" -> o.associationVersion.asJson)
  }
  final implicit val MaintenanceWindowRunCommandParametersEncoder: io.circe.Encoder[avias.ssm.models.MaintenanceWindowRunCommandParameters] = io.circe.Encoder.instance { o => 
    Json.obj("DocumentHash" -> o.documentHash.asJson, "TimeoutSeconds" -> o.timeoutSeconds.asJson, "Comment" -> o.comment.asJson, "DocumentHashType" -> o.documentHashType.asJson, "OutputS3KeyPrefix" -> o.outputS3KeyPrefix.asJson, "Parameters" -> o.parameters.asJson, "OutputS3BucketName" -> o.outputS3BucketName.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "NotificationConfig" -> o.notificationConfig.asJson)
  }
  final implicit val ListCommandsRequestEncoder: io.circe.Encoder[avias.ssm.models.ListCommandsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceId" -> o.instanceId.asJson, "MaxResults" -> o.maxResults.asJson, "CommandId" -> o.commandId.asJson, "Filters" -> o.filters.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetParameterResultEncoder: io.circe.Encoder[avias.ssm.models.GetParameterResult] = io.circe.Encoder.instance { o => 
    Json.obj("Parameter" -> o.parameter.asJson)
  }
  final implicit val InvalidScheduleEncoder: io.circe.Encoder[avias.ssm.models.InvalidSchedule] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateMaintenanceWindowRequestEncoder: io.circe.Encoder[avias.ssm.models.UpdateMaintenanceWindowRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WindowId" -> o.windowId.asJson, "AllowUnassociatedTargets" -> o.allowUnassociatedTargets.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Cutoff" -> o.cutoff.asJson, "Schedule" -> o.schedule.asJson, "Replace" -> o.replace.asJson, "Duration" -> o.duration.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val PutInventoryResultEncoder: io.circe.Encoder[avias.ssm.models.PutInventoryResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeInstancePatchStatesRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstancePatchStatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceIds" -> o.instanceIds.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val TargetInUseExceptionEncoder: io.circe.Encoder[avias.ssm.models.TargetInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidKeyIdEncoder: io.circe.Encoder[avias.ssm.models.InvalidKeyId] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidActivationIdEncoder: io.circe.Encoder[avias.ssm.models.InvalidActivationId] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeInstancePatchStatesResultEncoder: io.circe.Encoder[avias.ssm.models.DescribeInstancePatchStatesResult] = io.circe.Encoder.instance { o => 
    Json.obj("InstancePatchStates" -> o.instancePatchStates.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeMaintenanceWindowsRequestEncoder: io.circe.Encoder[avias.ssm.models.DescribeMaintenanceWindowsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filters" -> o.filters.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidNextTokenEncoder: io.circe.Encoder[avias.ssm.models.InvalidNextToken] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RemoveTagsFromResourceRequestEncoder: io.circe.Encoder[avias.ssm.models.RemoveTagsFromResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val ListAssociationsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListAssociationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.AssociationFilter]]]("AssociationFilterList"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListAssociationsRequest.apply _)
  }
  final implicit val DescribeMaintenanceWindowsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowIdentity]]]("WindowIdentities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowsResult.apply _)
  }
  final implicit val CancelCommandResultDecoder: io.circe.Decoder[avias.ssm.models.CancelCommandResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.CancelCommandResult)
  final implicit val DescribeMaintenanceWindowExecutionTaskInvocationsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TaskId"), o.get[java.lang.String]("WindowExecutionId"), o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsRequest.apply _)
  }
  final implicit val ResourceDataSyncNotFoundExceptionDecoder: io.circe.Decoder[avias.ssm.models.ResourceDataSyncNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SyncName").map(avias.ssm.models.ResourceDataSyncNotFoundException.apply _)
  }
  final implicit val DeleteParametersRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteParametersRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("Names").map(avias.ssm.models.DeleteParametersRequest.apply _)
  }
  final implicit val GetParametersResultDecoder: io.circe.Decoder[avias.ssm.models.GetParametersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Parameter]]]("Parameters"), o.get[scala.Option[scala.List[java.lang.String]]]("InvalidParameters")).mapN(avias.ssm.models.GetParametersResult.apply _)
  }
  final implicit val SendCommandRequestDecoder: io.circe.Decoder[avias.ssm.models.SendCommandRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DocumentName"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("DocumentHash"), o.get[scala.Option[scala.Int]]("TimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[java.lang.String]]("DocumentHashType"), o.get[scala.Option[java.lang.String]]("OutputS3KeyPrefix"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("OutputS3BucketName"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("OutputS3Region"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceIds"), o.get[scala.Option[avias.ssm.models.NotificationConfig]]("NotificationConfig"), o.get[scala.Option[java.lang.String]]("MaxErrors")).mapN(avias.ssm.models.SendCommandRequest.apply _)
  }
  final implicit val InventoryResultEntityDecoder: io.circe.Decoder[avias.ssm.models.InventoryResultEntity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.InventoryResultItem]]]("Data")).mapN(avias.ssm.models.InventoryResultEntity.apply _)
  }
  final implicit val DescribePatchGroupStateResultDecoder: io.circe.Decoder[avias.ssm.models.DescribePatchGroupStateResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("InstancesWithMissingPatches"), o.get[scala.Option[scala.Int]]("Instances"), o.get[scala.Option[scala.Int]]("InstancesWithInstalledPatches"), o.get[scala.Option[scala.Int]]("InstancesWithInstalledOtherPatches"), o.get[scala.Option[scala.Int]]("InstancesWithFailedPatches"), o.get[scala.Option[scala.Int]]("InstancesWithNotApplicablePatches")).mapN(avias.ssm.models.DescribePatchGroupStateResult.apply _)
  }
  final implicit val DescribeDocumentResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeDocumentResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.DocumentDescription]]("Document").map(avias.ssm.models.DescribeDocumentResult.apply _)
  }
  final implicit val MaintenanceWindowExecutionDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("WindowExecutionId"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("StatusDetails")).mapN(avias.ssm.models.MaintenanceWindowExecution.apply _)
  }
  final implicit val DocumentVersionLimitExceededDecoder: io.circe.Decoder[avias.ssm.models.DocumentVersionLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.DocumentVersionLimitExceeded.apply _)
  }
  final implicit val PutComplianceItemsResultDecoder: io.circe.Decoder[avias.ssm.models.PutComplianceItemsResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.PutComplianceItemsResult)
  final implicit val GetMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WindowId").map(avias.ssm.models.GetMaintenanceWindowRequest.apply _)
  }
  final implicit val DeleteParametersResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteParametersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DeletedParameters"), o.get[scala.Option[scala.List[java.lang.String]]]("InvalidParameters")).mapN(avias.ssm.models.DeleteParametersResult.apply _)
  }
  final implicit val UpdateMaintenanceWindowTargetResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateMaintenanceWindowTargetResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("WindowTargetId")).mapN(avias.ssm.models.UpdateMaintenanceWindowTargetResult.apply _)
  }
  final implicit val PatchBaselineIdentityDecoder: io.circe.Decoder[avias.ssm.models.PatchBaselineIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("DefaultBaseline"), o.get[scala.Option[java.lang.String]]("BaselineName"), o.get[scala.Option[java.lang.String]]("BaselineDescription"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("BaselineId")).mapN(avias.ssm.models.PatchBaselineIdentity.apply _)
  }
  final implicit val InvalidResourceIdDecoder: io.circe.Decoder[avias.ssm.models.InvalidResourceId.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidResourceId)
  final implicit val SeveritySummaryDecoder: io.circe.Decoder[avias.ssm.models.SeveritySummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("UnspecifiedCount"), o.get[scala.Option[scala.Int]]("LowCount"), o.get[scala.Option[scala.Int]]("HighCount"), o.get[scala.Option[scala.Int]]("MediumCount"), o.get[scala.Option[scala.Int]]("CriticalCount"), o.get[scala.Option[scala.Int]]("InformationalCount")).mapN(avias.ssm.models.SeveritySummary.apply _)
  }
  final implicit val InvalidRoleDecoder: io.circe.Decoder[avias.ssm.models.InvalidRole] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidRole.apply _)
  }
  final implicit val ResourceComplianceSummaryItemDecoder: io.circe.Decoder[avias.ssm.models.ResourceComplianceSummaryItem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[avias.ssm.models.NonCompliantSummary]]("NonCompliantSummary"), o.get[scala.Option[avias.ssm.models.ComplianceExecutionSummary]]("ExecutionSummary"), o.get[scala.Option[java.lang.String]]("OverallSeverity"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ComplianceType"), o.get[scala.Option[avias.ssm.models.CompliantSummary]]("CompliantSummary"), o.get[scala.Option[java.lang.String]]("ResourceType")).mapN(avias.ssm.models.ResourceComplianceSummaryItem.apply _)
  }
  final implicit val CreateAssociationBatchRequestEntryDecoder: io.circe.Decoder[avias.ssm.models.CreateAssociationBatchRequestEntry] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[avias.ssm.models.InstanceAssociationOutputLocation]]("OutputLocation"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.CreateAssociationBatchRequestEntry.apply _)
  }
  final implicit val ParametersFilterDecoder: io.circe.Decoder[avias.ssm.models.ParametersFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values")).mapN(avias.ssm.models.ParametersFilter.apply _)
  }
  final implicit val UpdateAssociationRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssociationId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[avias.ssm.models.InstanceAssociationOutputLocation]]("OutputLocation"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("AssociationVersion"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.UpdateAssociationRequest.apply _)
  }
  final implicit val ResourceDataSyncInvalidConfigurationExceptionDecoder: io.circe.Decoder[avias.ssm.models.ResourceDataSyncInvalidConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.ResourceDataSyncInvalidConfigurationException.apply _)
  }
  final implicit val NonCompliantSummaryDecoder: io.circe.Decoder[avias.ssm.models.NonCompliantSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NonCompliantCount"), o.get[scala.Option[avias.ssm.models.SeveritySummary]]("SeveritySummary")).mapN(avias.ssm.models.NonCompliantSummary.apply _)
  }
  final implicit val AssociationLimitExceededDecoder: io.circe.Decoder[avias.ssm.models.AssociationLimitExceeded.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.AssociationLimitExceeded)
  final implicit val InvalidAutomationExecutionParametersExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidAutomationExecutionParametersException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidAutomationExecutionParametersException.apply _)
  }
  final implicit val DescribeAssociationResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.AssociationDescription]]("AssociationDescription").map(avias.ssm.models.DescribeAssociationResult.apply _)
  }
  final implicit val CreateAssociationRequestDecoder: io.circe.Decoder[avias.ssm.models.CreateAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[avias.ssm.models.InstanceAssociationOutputLocation]]("OutputLocation"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.CreateAssociationRequest.apply _)
  }
  final implicit val RegisterTaskWithMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.RegisterTaskWithMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.ssm.models.Target]]("Targets"), o.get[java.lang.String]("ServiceRoleArn"), o.get[java.lang.String]("MaxConcurrency"), o.get[java.lang.String]("TaskArn"), o.get[java.lang.String]("WindowId"), o.get[java.lang.String]("TaskType"), o.get[java.lang.String]("MaxErrors"), o.get[scala.Option[java.lang.String]]("ClientToken"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowTaskInvocationParameters]]("TaskInvocationParameters"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.MaintenanceWindowTaskParameterValueExpression]]]("TaskParameters"), o.get[scala.Option[avias.ssm.models.LoggingInfo]]("LoggingInfo"), o.get[scala.Option[scala.Int]]("Priority")).mapN(avias.ssm.models.RegisterTaskWithMaintenanceWindowRequest.apply _)
  }
  final implicit val DescribeParametersRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeParametersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ParametersFilter]]]("Filters"), o.get[scala.Option[scala.List[avias.ssm.models.ParameterStringFilter]]]("ParameterFilters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeParametersRequest.apply _)
  }
  final implicit val AutomationDefinitionNotFoundExceptionDecoder: io.circe.Decoder[avias.ssm.models.AutomationDefinitionNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AutomationDefinitionNotFoundException.apply _)
  }
  final implicit val InvalidDocumentSchemaVersionDecoder: io.circe.Decoder[avias.ssm.models.InvalidDocumentSchemaVersion] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidDocumentSchemaVersion.apply _)
  }
  final implicit val AutomationExecutionLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.AutomationExecutionLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AutomationExecutionLimitExceededException.apply _)
  }
  final implicit val AutomationExecutionDecoder: io.circe.Decoder[avias.ssm.models.AutomationExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DocumentName"), o.get[scala.Option[scala.List[avias.ssm.models.StepExecution]]]("StepExecutions"), o.get[scala.Option[java.lang.String]]("FailureMessage"), o.get[scala.Option[java.lang.String]]("AutomationExecutionStatus"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Outputs"), o.get[scala.Option[java.time.Instant]]("ExecutionStartTime"), o.get[scala.Option[java.time.Instant]]("ExecutionEndTime"), o.get[scala.Option[java.lang.String]]("AutomationExecutionId"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.AutomationExecution.apply _)
  }
  final implicit val HierarchyTypeMismatchExceptionDecoder: io.circe.Decoder[avias.ssm.models.HierarchyTypeMismatchException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.HierarchyTypeMismatchException.apply _)
  }
  final implicit val AssociationFilterDecoder: io.circe.Decoder[avias.ssm.models.AssociationFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("value")).mapN(avias.ssm.models.AssociationFilter.apply _)
  }
  final implicit val DocumentLimitExceededDecoder: io.circe.Decoder[avias.ssm.models.DocumentLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.DocumentLimitExceeded.apply _)
  }
  final implicit val DescribeMaintenanceWindowTasksResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowTasksResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowTask]]]("Tasks"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowTasksResult.apply _)
  }
  final implicit val GetAutomationExecutionResultDecoder: io.circe.Decoder[avias.ssm.models.GetAutomationExecutionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.AutomationExecution]]("AutomationExecution").map(avias.ssm.models.GetAutomationExecutionResult.apply _)
  }
  final implicit val S3OutputLocationDecoder: io.circe.Decoder[avias.ssm.models.S3OutputLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("OutputS3Region"), o.get[scala.Option[java.lang.String]]("OutputS3BucketName"), o.get[scala.Option[java.lang.String]]("OutputS3KeyPrefix")).mapN(avias.ssm.models.S3OutputLocation.apply _)
  }
  final implicit val DescribeInstancePatchesResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstancePatchesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.PatchComplianceData]]]("Patches"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstancePatchesResult.apply _)
  }
  final implicit val DeleteDocumentResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteDocumentResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DeleteDocumentResult)
  final implicit val PutParameterResultDecoder: io.circe.Decoder[avias.ssm.models.PutParameterResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Long]]("Version").map(avias.ssm.models.PutParameterResult.apply _)
  }
  final implicit val InvalidFilterDecoder: io.circe.Decoder[avias.ssm.models.InvalidFilter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidFilter.apply _)
  }
  final implicit val ModifyDocumentPermissionResponseDecoder: io.circe.Decoder[avias.ssm.models.ModifyDocumentPermissionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.ModifyDocumentPermissionResponse)
  final implicit val GetCommandInvocationRequestDecoder: io.circe.Decoder[avias.ssm.models.GetCommandInvocationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CommandId"), o.get[java.lang.String]("InstanceId"), o.get[scala.Option[java.lang.String]]("PluginName")).mapN(avias.ssm.models.GetCommandInvocationRequest.apply _)
  }
  final implicit val CommandPluginDecoder: io.circe.Decoder[avias.ssm.models.CommandPlugin] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ResponseCode"), o.get[scala.Option[java.lang.String]]("OutputS3KeyPrefix"), o.get[scala.Option[java.lang.String]]("Output"), o.get[scala.Option[java.lang.String]]("OutputS3BucketName"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("OutputS3Region"), o.get[scala.Option[java.time.Instant]]("ResponseStartDateTime"), o.get[scala.Option[java.time.Instant]]("ResponseFinishDateTime"), o.get[scala.Option[java.lang.String]]("StandardOutputUrl"), o.get[scala.Option[java.lang.String]]("StandardErrorUrl")).mapN(avias.ssm.models.CommandPlugin.apply _)
  }
  final implicit val DeleteActivationResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteActivationResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DeleteActivationResult)
  final implicit val ResourceDataSyncItemDecoder: io.circe.Decoder[avias.ssm.models.ResourceDataSyncItem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("SyncCreatedTime"), o.get[scala.Option[java.lang.String]]("LastStatus"), o.get[scala.Option[java.time.Instant]]("LastSyncTime"), o.get[scala.Option[avias.ssm.models.ResourceDataSyncS3Destination]]("S3Destination"), o.get[scala.Option[java.lang.String]]("SyncName"), o.get[scala.Option[java.time.Instant]]("LastSuccessfulSyncTime")).mapN(avias.ssm.models.ResourceDataSyncItem.apply _)
  }
  final implicit val InvalidDocumentVersionDecoder: io.circe.Decoder[avias.ssm.models.InvalidDocumentVersion] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidDocumentVersion.apply _)
  }
  final implicit val StopAutomationExecutionResultDecoder: io.circe.Decoder[avias.ssm.models.StopAutomationExecutionResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.StopAutomationExecutionResult)
  final implicit val CreateAssociationBatchRequestDecoder: io.circe.Decoder[avias.ssm.models.CreateAssociationBatchRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.ssm.models.CreateAssociationBatchRequestEntry]]("Entries").map(avias.ssm.models.CreateAssociationBatchRequest.apply _)
  }
  final implicit val GetDocumentResultDecoder: io.circe.Decoder[avias.ssm.models.GetDocumentResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("DocumentVersion"), o.get[scala.Option[java.lang.String]]("Content"), o.get[scala.Option[java.lang.String]]("DocumentType")).mapN(avias.ssm.models.GetDocumentResult.apply _)
  }
  final implicit val ResourceDataSyncCountExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.ResourceDataSyncCountExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.ResourceDataSyncCountExceededException.apply _)
  }
  final implicit val DescribeInstanceAssociationsStatusRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstanceAssociationsStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstanceAssociationsStatusRequest.apply _)
  }
  final implicit val DeleteResourceDataSyncRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteResourceDataSyncRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SyncName").map(avias.ssm.models.DeleteResourceDataSyncRequest.apply _)
  }
  final implicit val DeletePatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.DeletePatchBaselineResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("BaselineId").map(avias.ssm.models.DeletePatchBaselineResult.apply _)
  }
  final implicit val MaintenanceWindowTaskInvocationParametersDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowTaskInvocationParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ssm.models.MaintenanceWindowRunCommandParameters]]("RunCommand"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowAutomationParameters]]("Automation"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowStepFunctionsParameters]]("StepFunctions"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowLambdaParameters]]("Lambda")).mapN(avias.ssm.models.MaintenanceWindowTaskInvocationParameters.apply _)
  }
  final implicit val PatchRuleGroupDecoder: io.circe.Decoder[avias.ssm.models.PatchRuleGroup] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.ssm.models.PatchRule]]("PatchRules").map(avias.ssm.models.PatchRuleGroup.apply _)
  }
  final implicit val GetMaintenanceWindowExecutionTaskInvocationRequestDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowExecutionId"), o.get[java.lang.String]("TaskId"), o.get[java.lang.String]("InvocationId")).mapN(avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationRequest.apply _)
  }
  final implicit val InvalidActivationDecoder: io.circe.Decoder[avias.ssm.models.InvalidActivation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidActivation.apply _)
  }
  final implicit val ActivationDecoder: io.circe.Decoder[avias.ssm.models.Activation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DefaultInstanceName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("IamRole"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[java.time.Instant]]("ExpirationDate"), o.get[scala.Option[java.lang.String]]("ActivationId"), o.get[scala.Option[scala.Int]]("RegistrationsCount"), o.get[scala.Option[scala.Boolean]]("Expired"), o.get[scala.Option[scala.Int]]("RegistrationLimit")).mapN(avias.ssm.models.Activation.apply _)
  }
  final implicit val DescribeInstanceInformationRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstanceInformationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InstanceInformationFilter]]]("InstanceInformationFilterList"), o.get[scala.Option[scala.List[avias.ssm.models.InstanceInformationStringFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstanceInformationRequest.apply _)
  }
  final implicit val DescribeDocumentPermissionResponseDecoder: io.circe.Decoder[avias.ssm.models.DescribeDocumentPermissionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("AccountIds").map(avias.ssm.models.DescribeDocumentPermissionResponse.apply _)
  }
  final implicit val MaintenanceWindowExecutionTaskInvocationIdentityDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowExecutionTaskInvocationIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[java.lang.String]]("WindowTargetId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("TaskExecutionId"), o.get[scala.Option[java.lang.String]]("WindowExecutionId"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("TaskType"), o.get[scala.Option[java.lang.String]]("InvocationId"), o.get[scala.Option[java.lang.String]]("ExecutionId"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("Parameters")).mapN(avias.ssm.models.MaintenanceWindowExecutionTaskInvocationIdentity.apply _)
  }
  final implicit val CreatePatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.CreatePatchBaselineResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("BaselineId").map(avias.ssm.models.CreatePatchBaselineResult.apply _)
  }
  final implicit val UpdatePatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdatePatchBaselineRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BaselineId"), o.get[scala.Option[avias.ssm.models.PatchRuleGroup]]("ApprovalRules"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("ApprovedPatchesComplianceLevel"), o.get[scala.Option[avias.ssm.models.PatchFilterGroup]]("GlobalFilters"), o.get[scala.Option[scala.List[java.lang.String]]]("ApprovedPatches"), o.get[scala.Option[scala.List[java.lang.String]]]("RejectedPatches")).mapN(avias.ssm.models.UpdatePatchBaselineRequest.apply _)
  }
  final implicit val CreateAssociationResultDecoder: io.circe.Decoder[avias.ssm.models.CreateAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.AssociationDescription]]("AssociationDescription").map(avias.ssm.models.CreateAssociationResult.apply _)
  }
  final implicit val DescribeEffectivePatchesForPatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeEffectivePatchesForPatchBaselineRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BaselineId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeEffectivePatchesForPatchBaselineRequest.apply _)
  }
  final implicit val UpdateDocumentDefaultVersionResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateDocumentDefaultVersionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.DocumentDefaultVersionDescription]]("Description").map(avias.ssm.models.UpdateDocumentDefaultVersionResult.apply _)
  }
  final implicit val ListCommandInvocationsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListCommandInvocationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("CommandId"), o.get[scala.Option[scala.List[avias.ssm.models.CommandFilter]]]("Filters"), o.get[scala.Option[scala.Boolean]]("Details"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListCommandInvocationsRequest.apply _)
  }
  final implicit val ListInventoryEntriesResultDecoder: io.circe.Decoder[avias.ssm.models.ListInventoryEntriesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("SchemaVersion"), o.get[scala.Option[java.lang.String]]("CaptureTime"), o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("Entries"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListInventoryEntriesResult.apply _)
  }
  final implicit val RegisterTargetWithMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.RegisterTargetWithMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.ssm.models.Target]]("Targets"), o.get[java.lang.String]("ResourceType"), o.get[java.lang.String]("WindowId"), o.get[scala.Option[java.lang.String]]("ClientToken"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.ssm.models.RegisterTargetWithMaintenanceWindowRequest.apply _)
  }
  final implicit val UpdateAssociationStatusResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateAssociationStatusResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.AssociationDescription]]("AssociationDescription").map(avias.ssm.models.UpdateAssociationStatusResult.apply _)
  }
  final implicit val ParameterDecoder: io.circe.Decoder[avias.ssm.models.Parameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Long]]("Version")).mapN(avias.ssm.models.Parameter.apply _)
  }
  final implicit val GetMaintenanceWindowExecutionTaskRequestDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowExecutionId"), o.get[java.lang.String]("TaskId")).mapN(avias.ssm.models.GetMaintenanceWindowExecutionTaskRequest.apply _)
  }
  final implicit val StartAutomationExecutionResultDecoder: io.circe.Decoder[avias.ssm.models.StartAutomationExecutionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("AutomationExecutionId").map(avias.ssm.models.StartAutomationExecutionResult.apply _)
  }
  final implicit val ParameterMaxVersionLimitExceededDecoder: io.circe.Decoder[avias.ssm.models.ParameterMaxVersionLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.ParameterMaxVersionLimitExceeded.apply _)
  }
  final implicit val InvalidAutomationSignalExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidAutomationSignalException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidAutomationSignalException.apply _)
  }
  final implicit val CreateActivationResultDecoder: io.circe.Decoder[avias.ssm.models.CreateActivationResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActivationId"), o.get[scala.Option[java.lang.String]]("ActivationCode")).mapN(avias.ssm.models.CreateActivationResult.apply _)
  }
  final implicit val UnsupportedInventoryItemContextExceptionDecoder: io.circe.Decoder[avias.ssm.models.UnsupportedInventoryItemContextException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.ssm.models.UnsupportedInventoryItemContextException.apply _)
  }
  final implicit val GetPatchBaselineForPatchGroupRequestDecoder: io.circe.Decoder[avias.ssm.models.GetPatchBaselineForPatchGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PatchGroup"), o.get[scala.Option[java.lang.String]]("OperatingSystem")).mapN(avias.ssm.models.GetPatchBaselineForPatchGroupRequest.apply _)
  }
  final implicit val InvalidDocumentDecoder: io.circe.Decoder[avias.ssm.models.InvalidDocument] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidDocument.apply _)
  }
  final implicit val CreateMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.CreateMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("AllowUnassociatedTargets"), o.get[java.lang.String]("Name"), o.get[scala.Int]("Cutoff"), o.get[java.lang.String]("Schedule"), o.get[scala.Int]("Duration"), o.get[scala.Option[java.lang.String]]("ClientToken"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.ssm.models.CreateMaintenanceWindowRequest.apply _)
  }
  final implicit val AutomationExecutionNotFoundExceptionDecoder: io.circe.Decoder[avias.ssm.models.AutomationExecutionNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AutomationExecutionNotFoundException.apply _)
  }
  final implicit val ParameterAlreadyExistsDecoder: io.circe.Decoder[avias.ssm.models.ParameterAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.ParameterAlreadyExists.apply _)
  }
  final implicit val ParameterHistoryDecoder: io.circe.Decoder[avias.ssm.models.ParameterHistory] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("Version"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("LastModifiedUser"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AllowedPattern"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.ssm.models.ParameterHistory.apply _)
  }
  final implicit val ListAssociationsResultDecoder: io.circe.Decoder[avias.ssm.models.ListAssociationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Association]]]("Associations"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListAssociationsResult.apply _)
  }
  final implicit val PatchGroupPatchBaselineMappingDecoder: io.circe.Decoder[avias.ssm.models.PatchGroupPatchBaselineMapping] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PatchGroup"), o.get[scala.Option[avias.ssm.models.PatchBaselineIdentity]]("BaselineIdentity")).mapN(avias.ssm.models.PatchGroupPatchBaselineMapping.apply _)
  }
  final implicit val DescribeMaintenanceWindowExecutionsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowExecutionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowExecution]]]("WindowExecutions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowExecutionsResult.apply _)
  }
  final implicit val InstanceAssociationOutputLocationDecoder: io.circe.Decoder[avias.ssm.models.InstanceAssociationOutputLocation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.S3OutputLocation]]("S3Location").map(avias.ssm.models.InstanceAssociationOutputLocation.apply _)
  }
  final implicit val AutomationExecutionFilterDecoder: io.circe.Decoder[avias.ssm.models.AutomationExecutionFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values")).mapN(avias.ssm.models.AutomationExecutionFilter.apply _)
  }
  final implicit val GetPatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.GetPatchBaselineResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ssm.models.PatchRuleGroup]]("ApprovalRules"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[java.lang.String]]]("PatchGroups"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("ApprovedPatchesComplianceLevel"), o.get[scala.Option[java.lang.String]]("BaselineId"), o.get[scala.Option[avias.ssm.models.PatchFilterGroup]]("GlobalFilters"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[java.time.Instant]]("ModifiedDate"), o.get[scala.Option[scala.List[java.lang.String]]]("ApprovedPatches"), o.get[scala.Option[scala.List[java.lang.String]]]("RejectedPatches")).mapN(avias.ssm.models.GetPatchBaselineResult.apply _)
  }
  final implicit val SendAutomationSignalResultDecoder: io.circe.Decoder[avias.ssm.models.SendAutomationSignalResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.SendAutomationSignalResult)
  final implicit val UpdateMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AllowUnassociatedTargets"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[scala.Int]]("Cutoff"), o.get[scala.Option[java.lang.String]]("Schedule"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(avias.ssm.models.UpdateMaintenanceWindowResult.apply _)
  }
  final implicit val DescribePatchBaselinesRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribePatchBaselinesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.PatchOrchestratorFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribePatchBaselinesRequest.apply _)
  }
  final implicit val InvalidTypeNameExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidTypeNameException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidTypeNameException.apply _)
  }
  final implicit val InstanceInformationStringFilterDecoder: io.circe.Decoder[avias.ssm.models.InstanceInformationStringFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values")).mapN(avias.ssm.models.InstanceInformationStringFilter.apply _)
  }
  final implicit val DocumentDescriptionDecoder: io.circe.Decoder[avias.ssm.models.DocumentDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DocumentType"), o.get[scala.Option[scala.List[java.lang.String]]]("PlatformTypes"), o.get[scala.Option[java.lang.String]]("Hash"), o.get[scala.Option[java.lang.String]]("HashType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("Sha1"), o.get[scala.Option[scala.List[avias.ssm.models.Tag]]]("Tags"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[java.lang.String]]("SchemaVersion"), o.get[scala.Option[scala.List[avias.ssm.models.DocumentParameter]]]("Parameters"), o.get[scala.Option[java.lang.String]]("DocumentVersion"), o.get[scala.Option[java.lang.String]]("LatestVersion"), o.get[scala.Option[java.lang.String]]("DefaultVersion"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.ssm.models.DocumentDescription.apply _)
  }
  final implicit val FailedCreateAssociationDecoder: io.circe.Decoder[avias.ssm.models.FailedCreateAssociation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ssm.models.CreateAssociationBatchRequestEntry]]("Entry"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Fault")).mapN(avias.ssm.models.FailedCreateAssociation.apply _)
  }
  final implicit val ComplianceItemDecoder: io.circe.Decoder[avias.ssm.models.ComplianceItem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Details"), o.get[scala.Option[avias.ssm.models.ComplianceExecutionSummary]]("ExecutionSummary"), o.get[scala.Option[java.lang.String]]("Title"), o.get[scala.Option[java.lang.String]]("Severity"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("ComplianceType"), o.get[scala.Option[java.lang.String]]("ResourceType")).mapN(avias.ssm.models.ComplianceItem.apply _)
  }
  final implicit val DeleteParameterRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteParameterRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.ssm.models.DeleteParameterRequest.apply _)
  }
  final implicit val GetMaintenanceWindowExecutionTaskInvocationResultDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[java.lang.String]]("WindowTargetId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("TaskExecutionId"), o.get[scala.Option[java.lang.String]]("WindowExecutionId"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("TaskType"), o.get[scala.Option[java.lang.String]]("InvocationId"), o.get[scala.Option[java.lang.String]]("ExecutionId"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("Parameters")).mapN(avias.ssm.models.GetMaintenanceWindowExecutionTaskInvocationResult.apply _)
  }
  final implicit val ItemSizeLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.ItemSizeLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.ssm.models.ItemSizeLimitExceededException.apply _)
  }
  final implicit val DescribeInstanceInformationResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstanceInformationResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InstanceInformation]]]("InstanceInformationList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstanceInformationResult.apply _)
  }
  final implicit val CommandFilterDecoder: io.circe.Decoder[avias.ssm.models.CommandFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("value")).mapN(avias.ssm.models.CommandFilter.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.ssm.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.ResourceInUseException.apply _)
  }
  final implicit val DescribeMaintenanceWindowExecutionsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowExecutionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowExecutionsRequest.apply _)
  }
  final implicit val InvalidFilterOptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidFilterOption] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.InvalidFilterOption.apply _)
  }
  final implicit val PutInventoryRequestDecoder: io.circe.Decoder[avias.ssm.models.PutInventoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.List[avias.ssm.models.InventoryItem]]("Items")).mapN(avias.ssm.models.PutInventoryRequest.apply _)
  }
  final implicit val CreateActivationRequestDecoder: io.circe.Decoder[avias.ssm.models.CreateActivationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IamRole"), o.get[scala.Option[java.lang.String]]("DefaultInstanceName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.time.Instant]]("ExpirationDate"), o.get[scala.Option[scala.Int]]("RegistrationLimit")).mapN(avias.ssm.models.CreateActivationRequest.apply _)
  }
  final implicit val CustomSchemaCountLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.CustomSchemaCountLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.CustomSchemaCountLimitExceededException.apply _)
  }
  final implicit val ListResourceDataSyncResultDecoder: io.circe.Decoder[avias.ssm.models.ListResourceDataSyncResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ResourceDataSyncItem]]]("ResourceDataSyncItems"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListResourceDataSyncResult.apply _)
  }
  final implicit val RegisterTargetWithMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.RegisterTargetWithMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WindowTargetId").map(avias.ssm.models.RegisterTargetWithMaintenanceWindowResult.apply _)
  }
  final implicit val InventoryFilterDecoder: io.circe.Decoder[avias.ssm.models.InventoryFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.ssm.models.InventoryFilter.apply _)
  }
  final implicit val ListInventoryEntriesRequestDecoder: io.circe.Decoder[avias.ssm.models.ListInventoryEntriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[java.lang.String]("TypeName"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[avias.ssm.models.InventoryFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListInventoryEntriesRequest.apply _)
  }
  final implicit val GetParametersByPathRequestDecoder: io.circe.Decoder[avias.ssm.models.GetParametersByPathRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Path"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[avias.ssm.models.ParameterStringFilter]]]("ParameterFilters"), o.get[scala.Option[scala.Boolean]]("Recursive"), o.get[scala.Option[scala.Boolean]]("WithDecryption"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetParametersByPathRequest.apply _)
  }
  final implicit val ParameterMetadataDecoder: io.circe.Decoder[avias.ssm.models.ParameterMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("Version"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("LastModifiedUser"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AllowedPattern"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate")).mapN(avias.ssm.models.ParameterMetadata.apply _)
  }
  final implicit val InstancePatchStateDecoder: io.circe.Decoder[avias.ssm.models.InstancePatchState] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[java.lang.String]("BaselineId"), o.get[java.lang.String]("Operation"), o.get[java.time.Instant]("OperationStartTime"), o.get[java.time.Instant]("OperationEndTime"), o.get[java.lang.String]("PatchGroup"), o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[scala.Int]]("NotApplicableCount"), o.get[scala.Option[scala.Int]]("InstalledCount"), o.get[scala.Option[scala.Int]]("FailedCount"), o.get[scala.Option[scala.Int]]("MissingCount"), o.get[scala.Option[scala.Int]]("InstalledOtherCount"), o.get[scala.Option[java.lang.String]]("SnapshotId")).mapN(avias.ssm.models.InstancePatchState.apply _)
  }
  final implicit val ListAssociationVersionsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListAssociationVersionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssociationId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListAssociationVersionsRequest.apply _)
  }
  final implicit val DuplicateDocumentContentDecoder: io.circe.Decoder[avias.ssm.models.DuplicateDocumentContent] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.DuplicateDocumentContent.apply _)
  }
  final implicit val DeleteParameterResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteParameterResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DeleteParameterResult)
  final implicit val TotalSizeLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.TotalSizeLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.TotalSizeLimitExceededException.apply _)
  }
  final implicit val FeatureNotAvailableExceptionDecoder: io.circe.Decoder[avias.ssm.models.FeatureNotAvailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.FeatureNotAvailableException.apply _)
  }
  final implicit val DocumentDefaultVersionDescriptionDecoder: io.circe.Decoder[avias.ssm.models.DocumentDefaultVersionDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("DefaultVersion")).mapN(avias.ssm.models.DocumentDefaultVersionDescription.apply _)
  }
  final implicit val TooManyUpdatesDecoder: io.circe.Decoder[avias.ssm.models.TooManyUpdates] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.TooManyUpdates.apply _)
  }
  final implicit val ListDocumentsResultDecoder: io.circe.Decoder[avias.ssm.models.ListDocumentsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.DocumentIdentifier]]]("DocumentIdentifiers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListDocumentsResult.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.ssm.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.ssm.models.Tag.apply _)
  }
  final implicit val TargetDecoder: io.circe.Decoder[avias.ssm.models.Target] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.ssm.models.Target.apply _)
  }
  final implicit val GetDeployablePatchSnapshotForInstanceResultDecoder: io.circe.Decoder[avias.ssm.models.GetDeployablePatchSnapshotForInstanceResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("SnapshotDownloadUrl"), o.get[scala.Option[java.lang.String]]("Product")).mapN(avias.ssm.models.GetDeployablePatchSnapshotForInstanceResult.apply _)
  }
  final implicit val GetCommandInvocationResultDecoder: io.circe.Decoder[avias.ssm.models.GetCommandInvocationResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("DocumentName"), o.get[scala.Option[java.lang.String]]("StandardErrorContent"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[scala.Int]]("ResponseCode"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("StandardOutputContent"), o.get[scala.Option[java.lang.String]]("PluginName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("ExecutionStartDateTime"), o.get[scala.Option[java.lang.String]]("ExecutionElapsedTime"), o.get[scala.Option[java.lang.String]]("ExecutionEndDateTime"), o.get[scala.Option[java.lang.String]]("CommandId"), o.get[scala.Option[java.lang.String]]("StandardOutputUrl"), o.get[scala.Option[java.lang.String]]("StandardErrorUrl")).mapN(avias.ssm.models.GetCommandInvocationResult.apply _)
  }
  final implicit val MaintenanceWindowTargetDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowTarget] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("WindowTargetId")).mapN(avias.ssm.models.MaintenanceWindowTarget.apply _)
  }
  final implicit val ListResourceComplianceSummariesRequestDecoder: io.circe.Decoder[avias.ssm.models.ListResourceComplianceSummariesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ComplianceStringFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.ssm.models.ListResourceComplianceSummariesRequest.apply _)
  }
  final implicit val ResourceDataSyncS3DestinationDecoder: io.circe.Decoder[avias.ssm.models.ResourceDataSyncS3Destination] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BucketName"), o.get[java.lang.String]("SyncFormat"), o.get[java.lang.String]("Region"), o.get[scala.Option[java.lang.String]]("AWSKMSKeyARN"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.ssm.models.ResourceDataSyncS3Destination.apply _)
  }
  final implicit val ComplianceExecutionSummaryDecoder: io.circe.Decoder[avias.ssm.models.ComplianceExecutionSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("ExecutionTime"), o.get[scala.Option[java.lang.String]]("ExecutionId"), o.get[scala.Option[java.lang.String]]("ExecutionType")).mapN(avias.ssm.models.ComplianceExecutionSummary.apply _)
  }
  final implicit val TooManyTagsErrorDecoder: io.circe.Decoder[avias.ssm.models.TooManyTagsError.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.TooManyTagsError)
  final implicit val ListCommandInvocationsResultDecoder: io.circe.Decoder[avias.ssm.models.ListCommandInvocationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.CommandInvocation]]]("CommandInvocations"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListCommandInvocationsResult.apply _)
  }
  final implicit val CreateResourceDataSyncRequestDecoder: io.circe.Decoder[avias.ssm.models.CreateResourceDataSyncRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SyncName"), o.get[avias.ssm.models.ResourceDataSyncS3Destination]("S3Destination")).mapN(avias.ssm.models.CreateResourceDataSyncRequest.apply _)
  }
  final implicit val DeleteAssociationRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("AssociationId")).mapN(avias.ssm.models.DeleteAssociationRequest.apply _)
  }
  final implicit val ListResourceDataSyncRequestDecoder: io.circe.Decoder[avias.ssm.models.ListResourceDataSyncRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.ssm.models.ListResourceDataSyncRequest.apply _)
  }
  final implicit val ParameterLimitExceededDecoder: io.circe.Decoder[avias.ssm.models.ParameterLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.ParameterLimitExceeded.apply _)
  }
  final implicit val FailureDetailsDecoder: io.circe.Decoder[avias.ssm.models.FailureDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FailureStage"), o.get[scala.Option[java.lang.String]]("FailureType"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Details")).mapN(avias.ssm.models.FailureDetails.apply _)
  }
  final implicit val UpdateMaintenanceWindowTaskRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateMaintenanceWindowTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowTaskId"), o.get[java.lang.String]("WindowId"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowTaskInvocationParameters]]("TaskInvocationParameters"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("TaskArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.MaintenanceWindowTaskParameterValueExpression]]]("TaskParameters"), o.get[scala.Option[avias.ssm.models.LoggingInfo]]("LoggingInfo"), o.get[scala.Option[scala.Boolean]]("Replace"), o.get[scala.Option[scala.Int]]("Priority"), o.get[scala.Option[java.lang.String]]("MaxErrors")).mapN(avias.ssm.models.UpdateMaintenanceWindowTaskRequest.apply _)
  }
  final implicit val RegisterTaskWithMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.RegisterTaskWithMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WindowTaskId").map(avias.ssm.models.RegisterTaskWithMaintenanceWindowResult.apply _)
  }
  final implicit val UnsupportedParameterTypeDecoder: io.circe.Decoder[avias.ssm.models.UnsupportedParameterType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.UnsupportedParameterType.apply _)
  }
  final implicit val InvalidNotificationConfigDecoder: io.circe.Decoder[avias.ssm.models.InvalidNotificationConfig] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidNotificationConfig.apply _)
  }
  final implicit val UpdateManagedInstanceRoleRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateManagedInstanceRoleRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[java.lang.String]("IamRole")).mapN(avias.ssm.models.UpdateManagedInstanceRoleRequest.apply _)
  }
  final implicit val DeleteResourceDataSyncResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteResourceDataSyncResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DeleteResourceDataSyncResult)
  final implicit val UpdateDocumentRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateDocumentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Content"), o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.UpdateDocumentRequest.apply _)
  }
  final implicit val RegisterDefaultPatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.RegisterDefaultPatchBaselineRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BaselineId").map(avias.ssm.models.RegisterDefaultPatchBaselineRequest.apply _)
  }
  final implicit val MaintenanceWindowIdentityDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[scala.Int]]("Cutoff"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(avias.ssm.models.MaintenanceWindowIdentity.apply _)
  }
  final implicit val UnsupportedOperatingSystemDecoder: io.circe.Decoder[avias.ssm.models.UnsupportedOperatingSystem] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.UnsupportedOperatingSystem.apply _)
  }
  final implicit val InstanceAssociationOutputUrlDecoder: io.circe.Decoder[avias.ssm.models.InstanceAssociationOutputUrl] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.S3OutputUrl]]("S3OutputUrl").map(avias.ssm.models.InstanceAssociationOutputUrl.apply _)
  }
  final implicit val GetParameterRequestDecoder: io.circe.Decoder[avias.ssm.models.GetParameterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Boolean]]("WithDecryption")).mapN(avias.ssm.models.GetParameterRequest.apply _)
  }
  final implicit val S3OutputUrlDecoder: io.circe.Decoder[avias.ssm.models.S3OutputUrl] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("OutputUrl").map(avias.ssm.models.S3OutputUrl.apply _)
  }
  final implicit val IdempotentParameterMismatchDecoder: io.circe.Decoder[avias.ssm.models.IdempotentParameterMismatch] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.IdempotentParameterMismatch.apply _)
  }
  final implicit val EffectivePatchDecoder: io.circe.Decoder[avias.ssm.models.EffectivePatch] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ssm.models.Patch]]("Patch"), o.get[scala.Option[avias.ssm.models.PatchStatus]]("PatchStatus")).mapN(avias.ssm.models.EffectivePatch.apply _)
  }
  final implicit val DescribeMaintenanceWindowTargetsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowTargetsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowTarget]]]("Targets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowTargetsResult.apply _)
  }
  final implicit val AddTagsToResourceResultDecoder: io.circe.Decoder[avias.ssm.models.AddTagsToResourceResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.AddTagsToResourceResult)
  final implicit val PatchFilterGroupDecoder: io.circe.Decoder[avias.ssm.models.PatchFilterGroup] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.ssm.models.PatchFilter]]("PatchFilters").map(avias.ssm.models.PatchFilterGroup.apply _)
  }
  final implicit val InvalidFilterValueDecoder: io.circe.Decoder[avias.ssm.models.InvalidFilterValue] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidFilterValue.apply _)
  }
  final implicit val StartAutomationExecutionRequestDecoder: io.circe.Decoder[avias.ssm.models.StartAutomationExecutionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DocumentName"), o.get[scala.Option[java.lang.String]]("DocumentVersion"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("ClientToken")).mapN(avias.ssm.models.StartAutomationExecutionRequest.apply _)
  }
  final implicit val InvalidOutputLocationDecoder: io.circe.Decoder[avias.ssm.models.InvalidOutputLocation.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidOutputLocation)
  final implicit val CancelCommandRequestDecoder: io.circe.Decoder[avias.ssm.models.CancelCommandRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CommandId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceIds")).mapN(avias.ssm.models.CancelCommandRequest.apply _)
  }
  final implicit val RemoveTagsFromResourceResultDecoder: io.circe.Decoder[avias.ssm.models.RemoveTagsFromResourceResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.RemoveTagsFromResourceResult)
  final implicit val ComplianceStringFilterDecoder: io.circe.Decoder[avias.ssm.models.ComplianceStringFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.ssm.models.ComplianceStringFilter.apply _)
  }
  final implicit val InvalidPluginNameDecoder: io.circe.Decoder[avias.ssm.models.InvalidPluginName.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidPluginName)
  final implicit val DescribeAvailablePatchesResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeAvailablePatchesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Patch]]]("Patches"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeAvailablePatchesResult.apply _)
  }
  final implicit val AutomationExecutionMetadataDecoder: io.circe.Decoder[avias.ssm.models.AutomationExecutionMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DocumentName"), o.get[scala.Option[java.lang.String]]("ExecutedBy"), o.get[scala.Option[java.lang.String]]("LogFile"), o.get[scala.Option[java.lang.String]]("AutomationExecutionStatus"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Outputs"), o.get[scala.Option[java.time.Instant]]("ExecutionStartTime"), o.get[scala.Option[java.time.Instant]]("ExecutionEndTime"), o.get[scala.Option[java.lang.String]]("AutomationExecutionId"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.AutomationExecutionMetadata.apply _)
  }
  final implicit val AssociationVersionInfoDecoder: io.circe.Decoder[avias.ssm.models.AssociationVersionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("AssociationId"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[avias.ssm.models.InstanceAssociationOutputLocation]]("OutputLocation"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("AssociationVersion"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.AssociationVersionInfo.apply _)
  }
  final implicit val CreateDocumentResultDecoder: io.circe.Decoder[avias.ssm.models.CreateDocumentResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.DocumentDescription]]("DocumentDescription").map(avias.ssm.models.CreateDocumentResult.apply _)
  }
  final implicit val DuplicateInstanceIdDecoder: io.circe.Decoder[avias.ssm.models.DuplicateInstanceId.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DuplicateInstanceId)
  final implicit val GetParametersByPathResultDecoder: io.circe.Decoder[avias.ssm.models.GetParametersByPathResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Parameter]]]("Parameters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetParametersByPathResult.apply _)
  }
  final implicit val MaintenanceWindowLambdaParametersDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowLambdaParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClientContext"), o.get[scala.Option[java.lang.String]]("Qualifier"), o.get[scala.Option[scala.Array[scala.Byte]]]("Payload")).mapN(avias.ssm.models.MaintenanceWindowLambdaParameters.apply _)
  }
  final implicit val MaintenanceWindowTaskDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowTask] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("WindowTaskId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("TaskArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.MaintenanceWindowTaskParameterValueExpression]]]("TaskParameters"), o.get[scala.Option[avias.ssm.models.LoggingInfo]]("LoggingInfo"), o.get[scala.Option[scala.Int]]("Priority"), o.get[scala.Option[java.lang.String]]("MaxErrors")).mapN(avias.ssm.models.MaintenanceWindowTask.apply _)
  }
  final implicit val DeregisterPatchBaselineForPatchGroupRequestDecoder: io.circe.Decoder[avias.ssm.models.DeregisterPatchBaselineForPatchGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BaselineId"), o.get[java.lang.String]("PatchGroup")).mapN(avias.ssm.models.DeregisterPatchBaselineForPatchGroupRequest.apply _)
  }
  final implicit val GetAutomationExecutionRequestDecoder: io.circe.Decoder[avias.ssm.models.GetAutomationExecutionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AutomationExecutionId").map(avias.ssm.models.GetAutomationExecutionRequest.apply _)
  }
  final implicit val AssociationVersionLimitExceededDecoder: io.circe.Decoder[avias.ssm.models.AssociationVersionLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AssociationVersionLimitExceeded.apply _)
  }
  final implicit val GetDocumentRequestDecoder: io.circe.Decoder[avias.ssm.models.GetDocumentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.GetDocumentRequest.apply _)
  }
  final implicit val DescribePatchGroupsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribePatchGroupsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.PatchGroupPatchBaselineMapping]]]("Mappings"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribePatchGroupsResult.apply _)
  }
  final implicit val CommandDecoder: io.circe.Decoder[avias.ssm.models.Command] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DocumentName"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[java.lang.String]]("OutputS3KeyPrefix"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("OutputS3BucketName"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("OutputS3Region"), o.get[scala.Option[scala.Int]]("TargetCount"), o.get[scala.Option[java.time.Instant]]("ExpiresAfter"), o.get[scala.Option[java.time.Instant]]("RequestedDateTime"), o.get[scala.Option[java.lang.String]]("CommandId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceIds"), o.get[scala.Option[avias.ssm.models.NotificationConfig]]("NotificationConfig"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("CompletedCount"), o.get[scala.Option[java.lang.String]]("MaxErrors"), o.get[scala.Option[scala.Int]]("ErrorCount")).mapN(avias.ssm.models.Command.apply _)
  }
  final implicit val UpdateManagedInstanceRoleResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateManagedInstanceRoleResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.UpdateManagedInstanceRoleResult)
  final implicit val GetMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AllowUnassociatedTargets"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[java.time.Instant]]("ModifiedDate"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[scala.Int]]("Cutoff"), o.get[scala.Option[java.lang.String]]("Schedule"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(avias.ssm.models.GetMaintenanceWindowResult.apply _)
  }
  final implicit val ComplianceTypeCountLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.ComplianceTypeCountLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.ComplianceTypeCountLimitExceededException.apply _)
  }
  final implicit val ListDocumentVersionsResultDecoder: io.circe.Decoder[avias.ssm.models.ListDocumentVersionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.DocumentVersionInfo]]]("DocumentVersions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListDocumentVersionsResult.apply _)
  }
  final implicit val InstanceInformationDecoder: io.circe.Decoder[avias.ssm.models.InstanceInformation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("IamRole"), o.get[scala.Option[java.lang.String]]("PlatformName"), o.get[scala.Option[java.lang.String]]("PlatformVersion"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("IPAddress"), o.get[scala.Option[java.lang.String]]("ActivationId"), o.get[scala.Option[java.lang.String]]("AssociationStatus"), o.get[scala.Option[avias.ssm.models.InstanceAggregatedAssociationOverview]]("AssociationOverview"), o.get[scala.Option[java.lang.String]]("PingStatus"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[java.time.Instant]]("LastPingDateTime"), o.get[scala.Option[java.time.Instant]]("RegistrationDate"), o.get[scala.Option[java.time.Instant]]("LastAssociationExecutionDate"), o.get[scala.Option[java.time.Instant]]("LastSuccessfulAssociationExecutionDate"), o.get[scala.Option[java.lang.String]]("PlatformType"), o.get[scala.Option[scala.Boolean]]("IsLatestVersion"), o.get[scala.Option[java.lang.String]]("AgentVersion"), o.get[scala.Option[java.lang.String]]("ComputerName")).mapN(avias.ssm.models.InstanceInformation.apply _)
  }
  final implicit val CreateMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.CreateMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WindowId").map(avias.ssm.models.CreateMaintenanceWindowResult.apply _)
  }
  final implicit val GetPatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.GetPatchBaselineRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BaselineId").map(avias.ssm.models.GetPatchBaselineRequest.apply _)
  }
  final implicit val DescribeActivationsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeActivationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Activation]]]("ActivationList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeActivationsResult.apply _)
  }
  final implicit val GetPatchBaselineForPatchGroupResultDecoder: io.circe.Decoder[avias.ssm.models.GetPatchBaselineForPatchGroupResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BaselineId"), o.get[scala.Option[java.lang.String]]("PatchGroup"), o.get[scala.Option[java.lang.String]]("OperatingSystem")).mapN(avias.ssm.models.GetPatchBaselineForPatchGroupResult.apply _)
  }
  final implicit val ResourceDataSyncAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.ssm.models.ResourceDataSyncAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SyncName").map(avias.ssm.models.ResourceDataSyncAlreadyExistsException.apply _)
  }
  final implicit val InvalidAllowedPatternExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidAllowedPatternException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.InvalidAllowedPatternException.apply _)
  }
  final implicit val DescribeMaintenanceWindowTasksRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowTasksRequest.apply _)
  }
  final implicit val InvalidOutputFolderDecoder: io.circe.Decoder[avias.ssm.models.InvalidOutputFolder.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidOutputFolder)
  final implicit val UpdateAssociationStatusRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateAssociationStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("InstanceId"), o.get[avias.ssm.models.AssociationStatus]("AssociationStatus")).mapN(avias.ssm.models.UpdateAssociationStatusRequest.apply _)
  }
  final implicit val PatchComplianceDataDecoder: io.circe.Decoder[avias.ssm.models.PatchComplianceData] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KBId"), o.get[java.lang.String]("Severity"), o.get[java.lang.String]("Title"), o.get[java.time.Instant]("InstalledTime"), o.get[java.lang.String]("Classification"), o.get[java.lang.String]("State")).mapN(avias.ssm.models.PatchComplianceData.apply _)
  }
  final implicit val InvalidCommandIdDecoder: io.circe.Decoder[avias.ssm.models.InvalidCommandId.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidCommandId)
  final implicit val MaintenanceWindowTaskParameterValueExpressionDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowTaskParameterValueExpression] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("Values").map(avias.ssm.models.MaintenanceWindowTaskParameterValueExpression.apply _)
  }
  final implicit val SendAutomationSignalRequestDecoder: io.circe.Decoder[avias.ssm.models.SendAutomationSignalRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AutomationExecutionId"), o.get[java.lang.String]("SignalType"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Payload")).mapN(avias.ssm.models.SendAutomationSignalRequest.apply _)
  }
  final implicit val InstanceAggregatedAssociationOverviewDecoder: io.circe.Decoder[avias.ssm.models.InstanceAggregatedAssociationOverview] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DetailedStatus"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("InstanceAssociationStatusAggregatedCount")).mapN(avias.ssm.models.InstanceAggregatedAssociationOverview.apply _)
  }
  final implicit val GetMaintenanceWindowExecutionResultDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowExecutionResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("WindowExecutionId"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[scala.List[java.lang.String]]]("TaskIds")).mapN(avias.ssm.models.GetMaintenanceWindowExecutionResult.apply _)
  }
  final implicit val AddTagsToResourceRequestDecoder: io.circe.Decoder[avias.ssm.models.AddTagsToResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceType"), o.get[java.lang.String]("ResourceId"), o.get[scala.List[avias.ssm.models.Tag]]("Tags")).mapN(avias.ssm.models.AddTagsToResourceRequest.apply _)
  }
  final implicit val PutParameterRequestDecoder: io.circe.Decoder[avias.ssm.models.PutParameterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Type"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Value"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("AllowedPattern"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.Boolean]]("Overwrite")).mapN(avias.ssm.models.PutParameterRequest.apply _)
  }
  final implicit val DeregisterTaskFromMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.DeregisterTaskFromMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[java.lang.String]("WindowTaskId")).mapN(avias.ssm.models.DeregisterTaskFromMaintenanceWindowRequest.apply _)
  }
  final implicit val DescribeMaintenanceWindowExecutionTasksRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowExecutionId"), o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowExecutionTasksRequest.apply _)
  }
  final implicit val DescribeDocumentPermissionRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeDocumentPermissionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("PermissionType")).mapN(avias.ssm.models.DescribeDocumentPermissionRequest.apply _)
  }
  final implicit val InvalidParametersDecoder: io.circe.Decoder[avias.ssm.models.InvalidParameters] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidParameters.apply _)
  }
  final implicit val PatchFilterDecoder: io.circe.Decoder[avias.ssm.models.PatchFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values")).mapN(avias.ssm.models.PatchFilter.apply _)
  }
  final implicit val InventoryItemSchemaDecoder: io.circe.Decoder[avias.ssm.models.InventoryItemSchema] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TypeName"), o.get[scala.List[avias.ssm.models.InventoryItemAttribute]]("Attributes"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[java.lang.String]]("DisplayName")).mapN(avias.ssm.models.InventoryItemSchema.apply _)
  }
  final implicit val DocumentFilterDecoder: io.circe.Decoder[avias.ssm.models.DocumentFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("value")).mapN(avias.ssm.models.DocumentFilter.apply _)
  }
  final implicit val GetMaintenanceWindowTaskResultDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowTaskResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("WindowTaskId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowTaskInvocationParameters]]("TaskInvocationParameters"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("TaskArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("TaskType"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.MaintenanceWindowTaskParameterValueExpression]]]("TaskParameters"), o.get[scala.Option[avias.ssm.models.LoggingInfo]]("LoggingInfo"), o.get[scala.Option[scala.Int]]("Priority"), o.get[scala.Option[java.lang.String]]("MaxErrors")).mapN(avias.ssm.models.GetMaintenanceWindowTaskResult.apply _)
  }
  final implicit val GetParameterHistoryResultDecoder: io.circe.Decoder[avias.ssm.models.GetParameterHistoryResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ParameterHistory]]]("Parameters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetParameterHistoryResult.apply _)
  }
  final implicit val DeregisterTaskFromMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.DeregisterTaskFromMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("WindowTaskId")).mapN(avias.ssm.models.DeregisterTaskFromMaintenanceWindowResult.apply _)
  }
  final implicit val DeleteDocumentRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteDocumentRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.ssm.models.DeleteDocumentRequest.apply _)
  }
  final implicit val GetDefaultPatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.GetDefaultPatchBaselineResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BaselineId"), o.get[scala.Option[java.lang.String]]("OperatingSystem")).mapN(avias.ssm.models.GetDefaultPatchBaselineResult.apply _)
  }
  final implicit val MaxDocumentSizeExceededDecoder: io.circe.Decoder[avias.ssm.models.MaxDocumentSizeExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.MaxDocumentSizeExceeded.apply _)
  }
  final implicit val DocumentVersionInfoDecoder: io.circe.Decoder[avias.ssm.models.DocumentVersionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("DocumentVersion"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[scala.Boolean]]("IsDefaultVersion")).mapN(avias.ssm.models.DocumentVersionInfo.apply _)
  }
  final implicit val ListAssociationVersionsResultDecoder: io.circe.Decoder[avias.ssm.models.ListAssociationVersionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.AssociationVersionInfo]]]("AssociationVersions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListAssociationVersionsResult.apply _)
  }
  final implicit val DescribeEffectivePatchesForPatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeEffectivePatchesForPatchBaselineResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.EffectivePatch]]]("EffectivePatches"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeEffectivePatchesForPatchBaselineResult.apply _)
  }
  final implicit val InventoryResultItemDecoder: io.circe.Decoder[avias.ssm.models.InventoryResultItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SchemaVersion"), o.get[java.lang.String]("TypeName"), o.get[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Content"), o.get[scala.Option[java.lang.String]]("ContentHash"), o.get[scala.Option[java.lang.String]]("CaptureTime")).mapN(avias.ssm.models.InventoryResultItem.apply _)
  }
  final implicit val RegisterDefaultPatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.RegisterDefaultPatchBaselineResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("BaselineId").map(avias.ssm.models.RegisterDefaultPatchBaselineResult.apply _)
  }
  final implicit val DeregisterManagedInstanceRequestDecoder: io.circe.Decoder[avias.ssm.models.DeregisterManagedInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("InstanceId").map(avias.ssm.models.DeregisterManagedInstanceRequest.apply _)
  }
  final implicit val StopAutomationExecutionRequestDecoder: io.circe.Decoder[avias.ssm.models.StopAutomationExecutionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AutomationExecutionId").map(avias.ssm.models.StopAutomationExecutionRequest.apply _)
  }
  final implicit val DescribePatchGroupStateRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribePatchGroupStateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PatchGroup").map(avias.ssm.models.DescribePatchGroupStateRequest.apply _)
  }
  final implicit val PatchDecoder: io.circe.Decoder[avias.ssm.models.Patch] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Language"), o.get[scala.Option[java.lang.String]]("KbNumber"), o.get[scala.Option[java.lang.String]]("ProductFamily"), o.get[scala.Option[java.lang.String]]("MsrcSeverity"), o.get[scala.Option[java.lang.String]]("Vendor"), o.get[scala.Option[java.lang.String]]("Title"), o.get[scala.Option[java.lang.String]]("ContentUrl"), o.get[scala.Option[java.time.Instant]]("ReleaseDate"), o.get[scala.Option[java.lang.String]]("MsrcNumber"), o.get[scala.Option[java.lang.String]]("Classification"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Product")).mapN(avias.ssm.models.Patch.apply _)
  }
  final implicit val GetMaintenanceWindowTaskRequestDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[java.lang.String]("WindowTaskId")).mapN(avias.ssm.models.GetMaintenanceWindowTaskRequest.apply _)
  }
  final implicit val GetMaintenanceWindowExecutionRequestDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowExecutionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WindowExecutionId").map(avias.ssm.models.GetMaintenanceWindowExecutionRequest.apply _)
  }
  final implicit val DescribeAvailablePatchesRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeAvailablePatchesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.PatchOrchestratorFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeAvailablePatchesRequest.apply _)
  }
  final implicit val AlreadyExistsExceptionDecoder: io.circe.Decoder[avias.ssm.models.AlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AlreadyExistsException.apply _)
  }
  final implicit val MaintenanceWindowStepFunctionsParametersDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowStepFunctionsParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Input"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.ssm.models.MaintenanceWindowStepFunctionsParameters.apply _)
  }
  final implicit val GetInventorySchemaResultDecoder: io.circe.Decoder[avias.ssm.models.GetInventorySchemaResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InventoryItemSchema]]]("Schemas"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetInventorySchemaResult.apply _)
  }
  final implicit val AssociationDoesNotExistDecoder: io.circe.Decoder[avias.ssm.models.AssociationDoesNotExist] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AssociationDoesNotExist.apply _)
  }
  final implicit val DeleteMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WindowId").map(avias.ssm.models.DeleteMaintenanceWindowResult.apply _)
  }
  final implicit val GetDefaultPatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.GetDefaultPatchBaselineRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("OperatingSystem").map(avias.ssm.models.GetDefaultPatchBaselineRequest.apply _)
  }
  final implicit val InvalidInstanceInformationFilterValueDecoder: io.circe.Decoder[avias.ssm.models.InvalidInstanceInformationFilterValue] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.InvalidInstanceInformationFilterValue.apply _)
  }
  final implicit val DescribeAssociationRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeAssociationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("AssociationId"), o.get[scala.Option[java.lang.String]]("AssociationVersion")).mapN(avias.ssm.models.DescribeAssociationRequest.apply _)
  }
  final implicit val AssociationDescriptionDecoder: io.circe.Decoder[avias.ssm.models.AssociationDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("AssociationId"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[avias.ssm.models.InstanceAssociationOutputLocation]]("OutputLocation"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("AssociationVersion"), o.get[scala.Option[java.time.Instant]]("Date"), o.get[scala.Option[java.time.Instant]]("LastUpdateAssociationDate"), o.get[scala.Option[java.time.Instant]]("LastExecutionDate"), o.get[scala.Option[java.time.Instant]]("LastSuccessfulExecutionDate"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[avias.ssm.models.AssociationOverview]]("Overview"), o.get[scala.Option[avias.ssm.models.AssociationStatus]]("Status"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.AssociationDescription.apply _)
  }
  final implicit val DescribePatchBaselinesResultDecoder: io.circe.Decoder[avias.ssm.models.DescribePatchBaselinesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.PatchBaselineIdentity]]]("BaselineIdentities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribePatchBaselinesResult.apply _)
  }
  final implicit val DeleteMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WindowId").map(avias.ssm.models.DeleteMaintenanceWindowRequest.apply _)
  }
  final implicit val ComplianceItemEntryDecoder: io.circe.Decoder[avias.ssm.models.ComplianceItemEntry] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Severity"), o.get[java.lang.String]("Status"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Details"), o.get[scala.Option[java.lang.String]]("Title"), o.get[scala.Option[java.lang.String]]("Id")).mapN(avias.ssm.models.ComplianceItemEntry.apply _)
  }
  final implicit val ListComplianceItemsResultDecoder: io.circe.Decoder[avias.ssm.models.ListComplianceItemsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ComplianceItem]]]("ComplianceItems"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListComplianceItemsResult.apply _)
  }
  final implicit val AssociationOverviewDecoder: io.circe.Decoder[avias.ssm.models.AssociationOverview] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DetailedStatus"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("AssociationStatusAggregatedCount")).mapN(avias.ssm.models.AssociationOverview.apply _)
  }
  final implicit val DocumentKeyValuesFilterDecoder: io.circe.Decoder[avias.ssm.models.DocumentKeyValuesFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.ssm.models.DocumentKeyValuesFilter.apply _)
  }
  final implicit val DescribeInstancePatchesRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstancePatchesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[scala.List[avias.ssm.models.PatchOrchestratorFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.ssm.models.DescribeInstancePatchesRequest.apply _)
  }
  final implicit val GetMaintenanceWindowExecutionTaskResultDecoder: io.circe.Decoder[avias.ssm.models.GetMaintenanceWindowExecutionTaskResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.MaintenanceWindowTaskParameterValueExpression]]]]("TaskParameters"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("TaskExecutionId"), o.get[scala.Option[java.lang.String]]("WindowExecutionId"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("TaskArn"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[scala.Int]]("Priority"), o.get[scala.Option[java.lang.String]]("MaxErrors")).mapN(avias.ssm.models.GetMaintenanceWindowExecutionTaskResult.apply _)
  }
  final implicit val PatchOrchestratorFilterDecoder: io.circe.Decoder[avias.ssm.models.PatchOrchestratorFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.ssm.models.PatchOrchestratorFilter.apply _)
  }
  final implicit val DescribeInstanceAssociationsStatusResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstanceAssociationsStatusResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InstanceAssociationStatusInfo]]]("InstanceAssociationStatusInfos"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstanceAssociationsStatusResult.apply _)
  }
  final implicit val UpdatePatchBaselineResultDecoder: io.circe.Decoder[avias.ssm.models.UpdatePatchBaselineResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ssm.models.PatchRuleGroup]]("ApprovalRules"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("ApprovedPatchesComplianceLevel"), o.get[scala.Option[java.lang.String]]("BaselineId"), o.get[scala.Option[avias.ssm.models.PatchFilterGroup]]("GlobalFilters"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[java.time.Instant]]("ModifiedDate"), o.get[scala.Option[scala.List[java.lang.String]]]("ApprovedPatches"), o.get[scala.Option[scala.List[java.lang.String]]]("RejectedPatches")).mapN(avias.ssm.models.UpdatePatchBaselineResult.apply _)
  }
  final implicit val InvalidInstanceIdDecoder: io.circe.Decoder[avias.ssm.models.InvalidInstanceId] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidInstanceId.apply _)
  }
  final implicit val InventoryItemAttributeDecoder: io.circe.Decoder[avias.ssm.models.InventoryItemAttribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("DataType")).mapN(avias.ssm.models.InventoryItemAttribute.apply _)
  }
  final implicit val DescribeAutomationExecutionsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeAutomationExecutionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.AutomationExecutionFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeAutomationExecutionsRequest.apply _)
  }
  final implicit val AssociationAlreadyExistsDecoder: io.circe.Decoder[avias.ssm.models.AssociationAlreadyExists.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.AssociationAlreadyExists)
  final implicit val InvalidDocumentOperationDecoder: io.circe.Decoder[avias.ssm.models.InvalidDocumentOperation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidDocumentOperation.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[avias.ssm.models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceType"), o.get[java.lang.String]("ResourceId")).mapN(avias.ssm.models.ListTagsForResourceRequest.apply _)
  }
  final implicit val AssociationStatusDecoder: io.circe.Decoder[avias.ssm.models.AssociationStatus] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Date"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Message"), o.get[scala.Option[java.lang.String]]("AdditionalInfo")).mapN(avias.ssm.models.AssociationStatus.apply _)
  }
  final implicit val GetInventorySchemaRequestDecoder: io.circe.Decoder[avias.ssm.models.GetInventorySchemaRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Aggregator"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[scala.Boolean]]("SubType"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetInventorySchemaRequest.apply _)
  }
  final implicit val DeleteActivationRequestDecoder: io.circe.Decoder[avias.ssm.models.DeleteActivationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ActivationId").map(avias.ssm.models.DeleteActivationRequest.apply _)
  }
  final implicit val InvalidPermissionTypeDecoder: io.circe.Decoder[avias.ssm.models.InvalidPermissionType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidPermissionType.apply _)
  }
  final implicit val InstancePatchStateFilterDecoder: io.circe.Decoder[avias.ssm.models.InstancePatchStateFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.List[java.lang.String]]("Values"), o.get[java.lang.String]("Type")).mapN(avias.ssm.models.InstancePatchStateFilter.apply _)
  }
  final implicit val InvalidInventoryItemContextExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidInventoryItemContextException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidInventoryItemContextException.apply _)
  }
  final implicit val DescribeMaintenanceWindowExecutionTaskInvocationsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowExecutionTaskInvocationIdentity]]]("WindowExecutionTaskInvocationIdentities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowExecutionTaskInvocationsResult.apply _)
  }
  final implicit val DocumentAlreadyExistsDecoder: io.circe.Decoder[avias.ssm.models.DocumentAlreadyExists] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.DocumentAlreadyExists.apply _)
  }
  final implicit val DescribeEffectiveInstanceAssociationsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeEffectiveInstanceAssociationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InstanceAssociation]]]("Associations"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeEffectiveInstanceAssociationsResult.apply _)
  }
  final implicit val GetInventoryResultDecoder: io.circe.Decoder[avias.ssm.models.GetInventoryResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InventoryResultEntity]]]("Entities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetInventoryResult.apply _)
  }
  final implicit val PatchStatusDecoder: io.circe.Decoder[avias.ssm.models.PatchStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeploymentStatus"), o.get[scala.Option[java.lang.String]]("ComplianceLevel"), o.get[scala.Option[java.time.Instant]]("ApprovalDate")).mapN(avias.ssm.models.PatchStatus.apply _)
  }
  final implicit val InstanceAssociationStatusInfoDecoder: io.circe.Decoder[avias.ssm.models.InstanceAssociationStatusInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("AssociationId"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[avias.ssm.models.InstanceAssociationOutputUrl]]("OutputUrl"), o.get[scala.Option[java.lang.String]]("AssociationVersion"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DetailedStatus"), o.get[scala.Option[java.time.Instant]]("ExecutionDate"), o.get[scala.Option[java.lang.String]]("ExecutionSummary"), o.get[scala.Option[java.lang.String]]("DocumentVersion"), o.get[scala.Option[java.lang.String]]("ErrorCode")).mapN(avias.ssm.models.InstanceAssociationStatusInfo.apply _)
  }
  final implicit val GetDeployablePatchSnapshotForInstanceRequestDecoder: io.circe.Decoder[avias.ssm.models.GetDeployablePatchSnapshotForInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[java.lang.String]("SnapshotId")).mapN(avias.ssm.models.GetDeployablePatchSnapshotForInstanceRequest.apply _)
  }
  final implicit val MaintenanceWindowExecutionTaskIdentityDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowExecutionTaskIdentity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("TaskExecutionId"), o.get[scala.Option[java.lang.String]]("WindowExecutionId"), o.get[scala.Option[java.lang.String]]("TaskArn"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("TaskType"), o.get[scala.Option[java.lang.String]]("StatusDetails")).mapN(avias.ssm.models.MaintenanceWindowExecutionTaskIdentity.apply _)
  }
  final implicit val ListTagsForResourceResultDecoder: io.circe.Decoder[avias.ssm.models.ListTagsForResourceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.ssm.models.Tag]]]("TagList").map(avias.ssm.models.ListTagsForResourceResult.apply _)
  }
  final implicit val InvalidDocumentContentDecoder: io.circe.Decoder[avias.ssm.models.InvalidDocumentContent] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidDocumentContent.apply _)
  }
  final implicit val ListCommandsResultDecoder: io.circe.Decoder[avias.ssm.models.ListCommandsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Command]]]("Commands"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListCommandsResult.apply _)
  }
  final implicit val DescribeInstancePatchStatesForPatchGroupResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstancePatchStatesForPatchGroupResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InstancePatchState]]]("InstancePatchStates"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstancePatchStatesForPatchGroupResult.apply _)
  }
  final implicit val StatusUnchangedDecoder: io.circe.Decoder[avias.ssm.models.StatusUnchanged.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.StatusUnchanged)
  final implicit val RegisterPatchBaselineForPatchGroupRequestDecoder: io.circe.Decoder[avias.ssm.models.RegisterPatchBaselineForPatchGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BaselineId"), o.get[java.lang.String]("PatchGroup")).mapN(avias.ssm.models.RegisterPatchBaselineForPatchGroupRequest.apply _)
  }
  final implicit val DescribeMaintenanceWindowTargetsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowTargetsRequest.apply _)
  }
  final implicit val ListDocumentVersionsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListDocumentVersionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListDocumentVersionsRequest.apply _)
  }
  final implicit val InventoryAggregatorDecoder: io.circe.Decoder[avias.ssm.models.InventoryAggregator] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Expression"), o.get[scala.Option[scala.List[avias.ssm.models.InventoryAggregator]]]("Aggregators")).mapN(avias.ssm.models.InventoryAggregator.apply _)
  }
  final implicit val ResourceLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.ResourceLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.ResourceLimitExceededException.apply _)
  }
  final implicit val UpdateMaintenanceWindowTargetRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateMaintenanceWindowTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[java.lang.String]("WindowTargetId"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("OwnerInformation"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Boolean]]("Replace")).mapN(avias.ssm.models.UpdateMaintenanceWindowTargetRequest.apply _)
  }
  final implicit val DocumentParameterDecoder: io.circe.Decoder[avias.ssm.models.DocumentParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("DefaultValue")).mapN(avias.ssm.models.DocumentParameter.apply _)
  }
  final implicit val ItemContentMismatchExceptionDecoder: io.circe.Decoder[avias.ssm.models.ItemContentMismatchException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.ssm.models.ItemContentMismatchException.apply _)
  }
  final implicit val ListComplianceSummariesRequestDecoder: io.circe.Decoder[avias.ssm.models.ListComplianceSummariesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ComplianceStringFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.ssm.models.ListComplianceSummariesRequest.apply _)
  }
  final implicit val GetParameterHistoryRequestDecoder: io.circe.Decoder[avias.ssm.models.GetParameterHistoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Boolean]]("WithDecryption"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetParameterHistoryRequest.apply _)
  }
  final implicit val InstanceInformationFilterDecoder: io.circe.Decoder[avias.ssm.models.InstanceInformationFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.List[java.lang.String]]("valueSet")).mapN(avias.ssm.models.InstanceInformationFilter.apply _)
  }
  final implicit val NotificationConfigDecoder: io.circe.Decoder[avias.ssm.models.NotificationConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NotificationArn"), o.get[scala.Option[scala.List[java.lang.String]]]("NotificationEvents"), o.get[scala.Option[java.lang.String]]("NotificationType")).mapN(avias.ssm.models.NotificationConfig.apply _)
  }
  final implicit val DescribeActivationsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeActivationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.DescribeActivationsFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeActivationsRequest.apply _)
  }
  final implicit val CreateDocumentRequestDecoder: io.circe.Decoder[avias.ssm.models.CreateDocumentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Content"), o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DocumentType")).mapN(avias.ssm.models.CreateDocumentRequest.apply _)
  }
  final implicit val DescribeParametersResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeParametersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ParameterMetadata]]]("Parameters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeParametersResult.apply _)
  }
  final implicit val DoesNotExistExceptionDecoder: io.circe.Decoder[avias.ssm.models.DoesNotExistException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.DoesNotExistException.apply _)
  }
  final implicit val SubTypeCountLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.SubTypeCountLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.SubTypeCountLimitExceededException.apply _)
  }
  final implicit val ListDocumentsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListDocumentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.DocumentFilter]]]("DocumentFilterList"), o.get[scala.Option[scala.List[avias.ssm.models.DocumentKeyValuesFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListDocumentsRequest.apply _)
  }
  final implicit val InvalidItemContentExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidItemContentException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.ssm.models.InvalidItemContentException.apply _)
  }
  final implicit val DescribeEffectiveInstanceAssociationsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeEffectiveInstanceAssociationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeEffectiveInstanceAssociationsRequest.apply _)
  }
  final implicit val InvalidAssociationVersionDecoder: io.circe.Decoder[avias.ssm.models.InvalidAssociationVersion] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidAssociationVersion.apply _)
  }
  final implicit val UpdateAssociationResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateAssociationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.AssociationDescription]]("AssociationDescription").map(avias.ssm.models.UpdateAssociationResult.apply _)
  }
  final implicit val DescribeInstancePatchStatesForPatchGroupRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstancePatchStatesForPatchGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PatchGroup"), o.get[scala.Option[scala.List[avias.ssm.models.InstancePatchStateFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.ssm.models.DescribeInstancePatchStatesForPatchGroupRequest.apply _)
  }
  final implicit val InvalidResultAttributeExceptionDecoder: io.circe.Decoder[avias.ssm.models.InvalidResultAttributeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidResultAttributeException.apply _)
  }
  final implicit val DescribeAutomationExecutionsResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeAutomationExecutionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.AutomationExecutionMetadata]]]("AutomationExecutionMetadataList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeAutomationExecutionsResult.apply _)
  }
  final implicit val DeregisterPatchBaselineForPatchGroupResultDecoder: io.circe.Decoder[avias.ssm.models.DeregisterPatchBaselineForPatchGroupResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BaselineId"), o.get[scala.Option[java.lang.String]]("PatchGroup")).mapN(avias.ssm.models.DeregisterPatchBaselineForPatchGroupResult.apply _)
  }
  final implicit val DescribePatchGroupsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribePatchGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[avias.ssm.models.PatchOrchestratorFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribePatchGroupsRequest.apply _)
  }
  final implicit val UpdateDocumentDefaultVersionRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateDocumentDefaultVersionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("DocumentVersion")).mapN(avias.ssm.models.UpdateDocumentDefaultVersionRequest.apply _)
  }
  final implicit val GetInventoryRequestDecoder: io.circe.Decoder[avias.ssm.models.GetInventoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ResultAttribute]]]("ResultAttributes"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[avias.ssm.models.InventoryAggregator]]]("Aggregators"), o.get[scala.Option[scala.List[avias.ssm.models.InventoryFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.GetInventoryRequest.apply _)
  }
  final implicit val LoggingInfoDecoder: io.circe.Decoder[avias.ssm.models.LoggingInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("S3BucketName"), o.get[java.lang.String]("S3Region"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix")).mapN(avias.ssm.models.LoggingInfo.apply _)
  }
  final implicit val AssociationDecoder: io.circe.Decoder[avias.ssm.models.Association] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("AssociationId"), o.get[scala.Option[java.lang.String]]("AssociationName"), o.get[scala.Option[java.lang.String]]("AssociationVersion"), o.get[scala.Option[java.time.Instant]]("LastExecutionDate"), o.get[scala.Option[java.lang.String]]("ScheduleExpression"), o.get[scala.Option[avias.ssm.models.AssociationOverview]]("Overview"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.Association.apply _)
  }
  final implicit val ResultAttributeDecoder: io.circe.Decoder[avias.ssm.models.ResultAttribute] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TypeName").map(avias.ssm.models.ResultAttribute.apply _)
  }
  final implicit val DeregisterManagedInstanceResultDecoder: io.circe.Decoder[avias.ssm.models.DeregisterManagedInstanceResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DeregisterManagedInstanceResult)
  final implicit val CreatePatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.CreatePatchBaselineRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("ClientToken"), o.get[scala.Option[avias.ssm.models.PatchRuleGroup]]("ApprovalRules"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("OperatingSystem"), o.get[scala.Option[java.lang.String]]("ApprovedPatchesComplianceLevel"), o.get[scala.Option[avias.ssm.models.PatchFilterGroup]]("GlobalFilters"), o.get[scala.Option[scala.List[java.lang.String]]]("ApprovedPatches"), o.get[scala.Option[scala.List[java.lang.String]]]("RejectedPatches")).mapN(avias.ssm.models.CreatePatchBaselineRequest.apply _)
  }
  final implicit val AutomationDefinitionVersionNotFoundExceptionDecoder: io.circe.Decoder[avias.ssm.models.AutomationDefinitionVersionNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.AutomationDefinitionVersionNotFoundException.apply _)
  }
  final implicit val InvocationDoesNotExistDecoder: io.circe.Decoder[avias.ssm.models.InvocationDoesNotExist.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvocationDoesNotExist)
  final implicit val SendCommandResultDecoder: io.circe.Decoder[avias.ssm.models.SendCommandResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.Command]]("Command").map(avias.ssm.models.SendCommandResult.apply _)
  }
  final implicit val HierarchyLevelLimitExceededExceptionDecoder: io.circe.Decoder[avias.ssm.models.HierarchyLevelLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.HierarchyLevelLimitExceededException.apply _)
  }
  final implicit val DeregisterTargetFromMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.DeregisterTargetFromMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[java.lang.String]("WindowTargetId"), o.get[scala.Option[scala.Boolean]]("Safe")).mapN(avias.ssm.models.DeregisterTargetFromMaintenanceWindowRequest.apply _)
  }
  final implicit val ComplianceSummaryItemDecoder: io.circe.Decoder[avias.ssm.models.ComplianceSummaryItem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComplianceType"), o.get[scala.Option[avias.ssm.models.CompliantSummary]]("CompliantSummary"), o.get[scala.Option[avias.ssm.models.NonCompliantSummary]]("NonCompliantSummary")).mapN(avias.ssm.models.ComplianceSummaryItem.apply _)
  }
  final implicit val DeletePatchBaselineRequestDecoder: io.circe.Decoder[avias.ssm.models.DeletePatchBaselineRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BaselineId").map(avias.ssm.models.DeletePatchBaselineRequest.apply _)
  }
  final implicit val InventoryItemDecoder: io.circe.Decoder[avias.ssm.models.InventoryItem] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SchemaVersion"), o.get[java.lang.String]("CaptureTime"), o.get[java.lang.String]("TypeName"), o.get[scala.Option[java.lang.String]]("ContentHash"), o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("Content"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Context")).mapN(avias.ssm.models.InventoryItem.apply _)
  }
  final implicit val ParameterVersionNotFoundDecoder: io.circe.Decoder[avias.ssm.models.ParameterVersionNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.ParameterVersionNotFound.apply _)
  }
  final implicit val DocumentPermissionLimitDecoder: io.circe.Decoder[avias.ssm.models.DocumentPermissionLimit] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.DocumentPermissionLimit.apply _)
  }
  final implicit val DescribeDocumentRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeDocumentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.DescribeDocumentRequest.apply _)
  }
  final implicit val DocumentIdentifierDecoder: io.circe.Decoder[avias.ssm.models.DocumentIdentifier] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DocumentType"), o.get[scala.Option[scala.List[java.lang.String]]]("PlatformTypes"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[scala.List[avias.ssm.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("SchemaVersion"), o.get[scala.Option[java.lang.String]]("DocumentVersion")).mapN(avias.ssm.models.DocumentIdentifier.apply _)
  }
  final implicit val PutComplianceItemsRequestDecoder: io.circe.Decoder[avias.ssm.models.PutComplianceItemsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[avias.ssm.models.ComplianceExecutionSummary]("ExecutionSummary"), o.get[scala.List[avias.ssm.models.ComplianceItemEntry]]("Items"), o.get[java.lang.String]("ComplianceType"), o.get[java.lang.String]("ResourceType"), o.get[scala.Option[java.lang.String]]("ItemContentHash")).mapN(avias.ssm.models.PutComplianceItemsRequest.apply _)
  }
  final implicit val UpdateMaintenanceWindowTaskResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateMaintenanceWindowTaskResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.Target]]]("Targets"), o.get[scala.Option[java.lang.String]]("WindowTaskId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.ssm.models.MaintenanceWindowTaskInvocationParameters]]("TaskInvocationParameters"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[java.lang.String]]("MaxConcurrency"), o.get[scala.Option[java.lang.String]]("TaskArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.ssm.models.MaintenanceWindowTaskParameterValueExpression]]]("TaskParameters"), o.get[scala.Option[avias.ssm.models.LoggingInfo]]("LoggingInfo"), o.get[scala.Option[scala.Int]]("Priority"), o.get[scala.Option[java.lang.String]]("MaxErrors")).mapN(avias.ssm.models.UpdateMaintenanceWindowTaskResult.apply _)
  }
  final implicit val ListComplianceItemsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListComplianceItemsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ResourceTypes"), o.get[scala.Option[scala.List[avias.ssm.models.ComplianceStringFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[java.lang.String]]]("ResourceIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListComplianceItemsRequest.apply _)
  }
  final implicit val DeregisterTargetFromMaintenanceWindowResultDecoder: io.circe.Decoder[avias.ssm.models.DeregisterTargetFromMaintenanceWindowResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WindowId"), o.get[scala.Option[java.lang.String]]("WindowTargetId")).mapN(avias.ssm.models.DeregisterTargetFromMaintenanceWindowResult.apply _)
  }
  final implicit val RegisterPatchBaselineForPatchGroupResultDecoder: io.circe.Decoder[avias.ssm.models.RegisterPatchBaselineForPatchGroupResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BaselineId"), o.get[scala.Option[java.lang.String]]("PatchGroup")).mapN(avias.ssm.models.RegisterPatchBaselineForPatchGroupResult.apply _)
  }
  final implicit val CompliantSummaryDecoder: io.circe.Decoder[avias.ssm.models.CompliantSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("CompliantCount"), o.get[scala.Option[avias.ssm.models.SeveritySummary]]("SeveritySummary")).mapN(avias.ssm.models.CompliantSummary.apply _)
  }
  final implicit val DescribeActivationsFilterDecoder: io.circe.Decoder[avias.ssm.models.DescribeActivationsFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FilterKey"), o.get[scala.Option[scala.List[java.lang.String]]]("FilterValues")).mapN(avias.ssm.models.DescribeActivationsFilter.apply _)
  }
  final implicit val InvalidResourceTypeDecoder: io.circe.Decoder[avias.ssm.models.InvalidResourceType.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidResourceType)
  final implicit val ListResourceComplianceSummariesResultDecoder: io.circe.Decoder[avias.ssm.models.ListResourceComplianceSummariesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ResourceComplianceSummaryItem]]]("ResourceComplianceSummaryItems"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListResourceComplianceSummariesResult.apply _)
  }
  final implicit val CreateResourceDataSyncResultDecoder: io.circe.Decoder[avias.ssm.models.CreateResourceDataSyncResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.CreateResourceDataSyncResult)
  final implicit val DeleteAssociationResultDecoder: io.circe.Decoder[avias.ssm.models.DeleteAssociationResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.DeleteAssociationResult)
  final implicit val UnsupportedPlatformTypeDecoder: io.circe.Decoder[avias.ssm.models.UnsupportedPlatformType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.UnsupportedPlatformType.apply _)
  }
  final implicit val InvalidTargetDecoder: io.circe.Decoder[avias.ssm.models.InvalidTarget] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidTarget.apply _)
  }
  final implicit val UpdateDocumentResultDecoder: io.circe.Decoder[avias.ssm.models.UpdateDocumentResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.DocumentDescription]]("DocumentDescription").map(avias.ssm.models.UpdateDocumentResult.apply _)
  }
  final implicit val MaintenanceWindowFilterDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.ssm.models.MaintenanceWindowFilter.apply _)
  }
  final implicit val CommandInvocationDecoder: io.circe.Decoder[avias.ssm.models.CommandInvocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("DocumentName"), o.get[scala.Option[java.lang.String]]("InstanceName"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("TraceOutput"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[scala.List[avias.ssm.models.CommandPlugin]]]("CommandPlugins"), o.get[scala.Option[java.time.Instant]]("RequestedDateTime"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("CommandId"), o.get[scala.Option[avias.ssm.models.NotificationConfig]]("NotificationConfig"), o.get[scala.Option[java.lang.String]]("StandardOutputUrl"), o.get[scala.Option[java.lang.String]]("StandardErrorUrl")).mapN(avias.ssm.models.CommandInvocation.apply _)
  }
  final implicit val ModifyDocumentPermissionRequestDecoder: io.circe.Decoder[avias.ssm.models.ModifyDocumentPermissionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("PermissionType"), o.get[scala.Option[scala.List[java.lang.String]]]("AccountIdsToAdd"), o.get[scala.Option[scala.List[java.lang.String]]]("AccountIdsToRemove")).mapN(avias.ssm.models.ModifyDocumentPermissionRequest.apply _)
  }
  final implicit val AssociatedInstancesDecoder: io.circe.Decoder[avias.ssm.models.AssociatedInstances.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.AssociatedInstances)
  final implicit val CreateAssociationBatchResultDecoder: io.circe.Decoder[avias.ssm.models.CreateAssociationBatchResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.AssociationDescription]]]("Successful"), o.get[scala.Option[scala.List[avias.ssm.models.FailedCreateAssociation]]]("Failed")).mapN(avias.ssm.models.CreateAssociationBatchResult.apply _)
  }
  final implicit val ParameterStringFilterDecoder: io.circe.Decoder[avias.ssm.models.ParameterStringFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Option"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.ssm.models.ParameterStringFilter.apply _)
  }
  final implicit val ListComplianceSummariesResultDecoder: io.circe.Decoder[avias.ssm.models.ListComplianceSummariesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.ComplianceSummaryItem]]]("ComplianceSummaryItems"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListComplianceSummariesResult.apply _)
  }
  final implicit val InvalidFilterKeyDecoder: io.circe.Decoder[avias.ssm.models.InvalidFilterKey.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.InvalidFilterKey)
  final implicit val GetParametersRequestDecoder: io.circe.Decoder[avias.ssm.models.GetParametersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("Names"), o.get[scala.Option[scala.Boolean]]("WithDecryption")).mapN(avias.ssm.models.GetParametersRequest.apply _)
  }
  final implicit val PatchRuleDecoder: io.circe.Decoder[avias.ssm.models.PatchRule] = io.circe.Decoder.instance { o => 
    (o.get[avias.ssm.models.PatchFilterGroup]("PatchFilterGroup"), o.get[scala.Int]("ApproveAfterDays"), o.get[scala.Option[java.lang.String]]("ComplianceLevel")).mapN(avias.ssm.models.PatchRule.apply _)
  }
  final implicit val InvalidUpdateDecoder: io.circe.Decoder[avias.ssm.models.InvalidUpdate] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidUpdate.apply _)
  }
  final implicit val ParameterPatternMismatchExceptionDecoder: io.circe.Decoder[avias.ssm.models.ParameterPatternMismatchException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.ParameterPatternMismatchException.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[avias.ssm.models.InternalServerError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InternalServerError.apply _)
  }
  final implicit val StepExecutionDecoder: io.circe.Decoder[avias.ssm.models.StepExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StepName"), o.get[scala.Option[java.lang.String]]("ResponseCode"), o.get[scala.Option[java.lang.String]]("Response"), o.get[scala.Option[java.lang.String]]("FailureMessage"), o.get[scala.Option[java.lang.String]]("StepStatus"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Outputs"), o.get[scala.Option[avias.ssm.models.FailureDetails]]("FailureDetails"), o.get[scala.Option[java.lang.String]]("Action"), o.get[scala.Option[java.time.Instant]]("ExecutionStartTime"), o.get[scala.Option[java.time.Instant]]("ExecutionEndTime"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Inputs")).mapN(avias.ssm.models.StepExecution.apply _)
  }
  final implicit val MaintenanceWindowAutomationParametersDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowAutomationParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DocumentVersion"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters")).mapN(avias.ssm.models.MaintenanceWindowAutomationParameters.apply _)
  }
  final implicit val DescribeMaintenanceWindowExecutionTasksResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowExecutionTasksResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowExecutionTaskIdentity]]]("WindowExecutionTaskIdentities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowExecutionTasksResult.apply _)
  }
  final implicit val ParameterNotFoundDecoder: io.circe.Decoder[avias.ssm.models.ParameterNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.ParameterNotFound.apply _)
  }
  final implicit val UnsupportedInventorySchemaVersionExceptionDecoder: io.circe.Decoder[avias.ssm.models.UnsupportedInventorySchemaVersionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.UnsupportedInventorySchemaVersionException.apply _)
  }
  final implicit val InstanceAssociationDecoder: io.circe.Decoder[avias.ssm.models.InstanceAssociation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AssociationId"), o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[java.lang.String]]("Content"), o.get[scala.Option[java.lang.String]]("AssociationVersion")).mapN(avias.ssm.models.InstanceAssociation.apply _)
  }
  final implicit val MaintenanceWindowRunCommandParametersDecoder: io.circe.Decoder[avias.ssm.models.MaintenanceWindowRunCommandParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DocumentHash"), o.get[scala.Option[scala.Int]]("TimeoutSeconds"), o.get[scala.Option[java.lang.String]]("Comment"), o.get[scala.Option[java.lang.String]]("DocumentHashType"), o.get[scala.Option[java.lang.String]]("OutputS3KeyPrefix"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("Parameters"), o.get[scala.Option[java.lang.String]]("OutputS3BucketName"), o.get[scala.Option[java.lang.String]]("ServiceRoleArn"), o.get[scala.Option[avias.ssm.models.NotificationConfig]]("NotificationConfig")).mapN(avias.ssm.models.MaintenanceWindowRunCommandParameters.apply _)
  }
  final implicit val ListCommandsRequestDecoder: io.circe.Decoder[avias.ssm.models.ListCommandsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("CommandId"), o.get[scala.Option[scala.List[avias.ssm.models.CommandFilter]]]("Filters"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.ListCommandsRequest.apply _)
  }
  final implicit val GetParameterResultDecoder: io.circe.Decoder[avias.ssm.models.GetParameterResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ssm.models.Parameter]]("Parameter").map(avias.ssm.models.GetParameterResult.apply _)
  }
  final implicit val InvalidScheduleDecoder: io.circe.Decoder[avias.ssm.models.InvalidSchedule] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidSchedule.apply _)
  }
  final implicit val UpdateMaintenanceWindowRequestDecoder: io.circe.Decoder[avias.ssm.models.UpdateMaintenanceWindowRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WindowId"), o.get[scala.Option[scala.Boolean]]("AllowUnassociatedTargets"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("Cutoff"), o.get[scala.Option[java.lang.String]]("Schedule"), o.get[scala.Option[scala.Boolean]]("Replace"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(avias.ssm.models.UpdateMaintenanceWindowRequest.apply _)
  }
  final implicit val PutInventoryResultDecoder: io.circe.Decoder[avias.ssm.models.PutInventoryResult.type] = io.circe.Decoder.decodeUnit.as(avias.ssm.models.PutInventoryResult)
  final implicit val DescribeInstancePatchStatesRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstancePatchStatesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("InstanceIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.ssm.models.DescribeInstancePatchStatesRequest.apply _)
  }
  final implicit val TargetInUseExceptionDecoder: io.circe.Decoder[avias.ssm.models.TargetInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.TargetInUseException.apply _)
  }
  final implicit val InvalidKeyIdDecoder: io.circe.Decoder[avias.ssm.models.InvalidKeyId] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ssm.models.InvalidKeyId.apply _)
  }
  final implicit val InvalidActivationIdDecoder: io.circe.Decoder[avias.ssm.models.InvalidActivationId] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidActivationId.apply _)
  }
  final implicit val DescribeInstancePatchStatesResultDecoder: io.circe.Decoder[avias.ssm.models.DescribeInstancePatchStatesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.InstancePatchState]]]("InstancePatchStates"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeInstancePatchStatesResult.apply _)
  }
  final implicit val DescribeMaintenanceWindowsRequestDecoder: io.circe.Decoder[avias.ssm.models.DescribeMaintenanceWindowsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ssm.models.MaintenanceWindowFilter]]]("Filters"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.ssm.models.DescribeMaintenanceWindowsRequest.apply _)
  }
  final implicit val InvalidNextTokenDecoder: io.circe.Decoder[avias.ssm.models.InvalidNextToken] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.ssm.models.InvalidNextToken.apply _)
  }
  final implicit val RemoveTagsFromResourceRequestDecoder: io.circe.Decoder[avias.ssm.models.RemoveTagsFromResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceType"), o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.ssm.models.RemoveTagsFromResourceRequest.apply _)
  }
}