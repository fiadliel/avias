package org.lyranthe.araethura.codepipeline
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val AcknowledgeThirdPartyJobOutputEncoder: io.circe.Encoder[models.AcknowledgeThirdPartyJobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val PipelineNameInUseExceptionEncoder: io.circe.Encoder[models.PipelineNameInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobDetailsOutputEncoder: io.circe.Encoder[models.GetJobDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobDetails" -> o.jobDetails.asJson)
  }
  final implicit val BlockerDeclarationEncoder: io.circe.Encoder[models.BlockerDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val StartPipelineExecutionOutputEncoder: io.circe.Encoder[models.StartPipelineExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val CreateCustomActionTypeOutputEncoder: io.circe.Encoder[models.CreateCustomActionTypeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("actionType" -> o.actionType.asJson)
  }
  final implicit val ListPipelinesOutputEncoder: io.circe.Encoder[models.ListPipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelines" -> o.pipelines.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AcknowledgeJobInputEncoder: io.circe.Encoder[models.AcknowledgeJobInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "nonce" -> o.nonce.asJson)
  }
  final implicit val StageExecutionEncoder: io.circe.Encoder[models.StageExecution] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson, "status" -> o.status.asJson)
  }
  final implicit val StageNotFoundExceptionEncoder: io.circe.Encoder[models.StageNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionConfigurationEncoder: io.circe.Encoder[models.ActionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("configuration" -> o.configuration.asJson)
  }
  final implicit val InvalidNonceExceptionEncoder: io.circe.Encoder[models.InvalidNonceException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForJobsOutputEncoder: io.circe.Encoder[models.PollForJobsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson)
  }
  final implicit val InputArtifactEncoder: io.circe.Encoder[models.InputArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val InvalidApprovalTokenExceptionEncoder: io.circe.Encoder[models.InvalidApprovalTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateCustomActionTypeInputEncoder: io.circe.Encoder[models.CreateCustomActionTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("provider" -> o.provider.asJson, "version" -> o.version.asJson, "inputArtifactDetails" -> o.inputArtifactDetails.asJson, "outputArtifactDetails" -> o.outputArtifactDetails.asJson, "category" -> o.category.asJson, "configurationProperties" -> o.configurationProperties.asJson, "settings" -> o.settings.asJson)
  }
  final implicit val StageNotRetryableExceptionEncoder: io.circe.Encoder[models.StageNotRetryableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CurrentRevisionEncoder: io.circe.Encoder[models.CurrentRevision] = io.circe.Encoder.instance { o => 
    Json.obj("revision" -> o.revision.asJson, "changeIdentifier" -> o.changeIdentifier.asJson, "created" -> o.created.asJson, "revisionSummary" -> o.revisionSummary.asJson)
  }
  final implicit val JobEncoder: io.circe.Encoder[models.Job] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "nonce" -> o.nonce.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val ThirdPartyJobDetailsEncoder: io.circe.Encoder[models.ThirdPartyJobDetails] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "nonce" -> o.nonce.asJson)
  }
  final implicit val UpdatePipelineOutputEncoder: io.circe.Encoder[models.UpdatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ListActionTypesOutputEncoder: io.circe.Encoder[models.ListActionTypesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypes" -> o.actionTypes.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[models.ValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineExecutionEncoder: io.circe.Encoder[models.PipelineExecution] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "status" -> o.status.asJson, "artifactRevisions" -> o.artifactRevisions.asJson, "pipelineVersion" -> o.pipelineVersion.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val EnableStageTransitionInputEncoder: io.circe.Encoder[models.EnableStageTransitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "transitionType" -> o.transitionType.asJson)
  }
  final implicit val ArtifactLocationEncoder: io.circe.Encoder[models.ArtifactLocation] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "s3Location" -> o.s3Location.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidBlockerDeclarationExceptionEncoder: io.circe.Encoder[models.InvalidBlockerDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartPipelineExecutionInputEncoder: io.circe.Encoder[models.StartPipelineExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val InvalidClientTokenExceptionEncoder: io.circe.Encoder[models.InvalidClientTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StageStateEncoder: io.circe.Encoder[models.StageState] = io.circe.Encoder.instance { o => 
    Json.obj("stageName" -> o.stageName.asJson, "inboundTransitionState" -> o.inboundTransitionState.asJson, "actionStates" -> o.actionStates.asJson, "latestExecution" -> o.latestExecution.asJson)
  }
  final implicit val JobDetailsEncoder: io.circe.Encoder[models.JobDetails] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val InvalidJobExceptionEncoder: io.circe.Encoder[models.InvalidJobException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutJobSuccessResultInputEncoder: io.circe.Encoder[models.PutJobSuccessResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "currentRevision" -> o.currentRevision.asJson, "continuationToken" -> o.continuationToken.asJson, "executionDetails" -> o.executionDetails.asJson)
  }
  final implicit val ActionContextEncoder: io.circe.Encoder[models.ActionContext] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val DeletePipelineInputEncoder: io.circe.Encoder[models.DeletePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val ActionExecutionEncoder: io.circe.Encoder[models.ActionExecution] = io.circe.Encoder.instance { o => 
    Json.obj("lastUpdatedBy" -> o.lastUpdatedBy.asJson, "lastStatusChange" -> o.lastStatusChange.asJson, "summary" -> o.summary.asJson, "externalExecutionUrl" -> o.externalExecutionUrl.asJson, "token" -> o.token.asJson, "status" -> o.status.asJson, "errorDetails" -> o.errorDetails.asJson, "externalExecutionId" -> o.externalExecutionId.asJson, "percentComplete" -> o.percentComplete.asJson)
  }
  final implicit val ThirdPartyJobEncoder: io.circe.Encoder[models.ThirdPartyJob] = io.circe.Encoder.instance { o => 
    Json.obj("clientId" -> o.clientId.asJson, "jobId" -> o.jobId.asJson)
  }
  final implicit val AWSSessionCredentialsEncoder: io.circe.Encoder[models.AWSSessionCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("accessKeyId" -> o.accessKeyId.asJson, "secretAccessKey" -> o.secretAccessKey.asJson, "sessionToken" -> o.sessionToken.asJson)
  }
  final implicit val AcknowledgeJobOutputEncoder: io.circe.Encoder[models.AcknowledgeJobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val GetPipelineExecutionOutputEncoder: io.circe.Encoder[models.GetPipelineExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecution" -> o.pipelineExecution.asJson)
  }
  final implicit val InvalidStructureExceptionEncoder: io.circe.Encoder[models.InvalidStructureException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineVersionNotFoundExceptionEncoder: io.circe.Encoder[models.PipelineVersionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionDeclarationEncoder: io.circe.Encoder[models.ActionDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "actionTypeId" -> o.actionTypeId.asJson, "roleArn" -> o.roleArn.asJson, "runOrder" -> o.runOrder.asJson, "configuration" -> o.configuration.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson)
  }
  final implicit val GetPipelineExecutionInputEncoder: io.circe.Encoder[models.GetPipelineExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val ErrorDetailsEncoder: io.circe.Encoder[models.ErrorDetails] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "message" -> o.message.asJson)
  }
  final implicit val ApprovalAlreadyCompletedExceptionEncoder: io.circe.Encoder[models.ApprovalAlreadyCompletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePipelineOutputEncoder: io.circe.Encoder[models.CreatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ApprovalResultEncoder: io.circe.Encoder[models.ApprovalResult] = io.circe.Encoder.instance { o => 
    Json.obj("summary" -> o.summary.asJson, "status" -> o.status.asJson)
  }
  final implicit val ThirdPartyJobDataEncoder: io.circe.Encoder[models.ThirdPartyJobData] = io.circe.Encoder.instance { o => 
    Json.obj("actionConfiguration" -> o.actionConfiguration.asJson, "artifactCredentials" -> o.artifactCredentials.asJson, "encryptionKey" -> o.encryptionKey.asJson, "actionTypeId" -> o.actionTypeId.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson, "continuationToken" -> o.continuationToken.asJson, "pipelineContext" -> o.pipelineContext.asJson)
  }
  final implicit val ActionRevisionEncoder: io.circe.Encoder[models.ActionRevision] = io.circe.Encoder.instance { o => 
    Json.obj("revisionId" -> o.revisionId.asJson, "revisionChangeId" -> o.revisionChangeId.asJson, "created" -> o.created.asJson)
  }
  final implicit val StageContextEncoder: io.circe.Encoder[models.StageContext] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val PipelineMetadataEncoder: io.circe.Encoder[models.PipelineMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineArn" -> o.pipelineArn.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val PutJobFailureResultInputEncoder: io.circe.Encoder[models.PutJobFailureResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "failureDetails" -> o.failureDetails.asJson)
  }
  final implicit val PutApprovalResultInputEncoder: io.circe.Encoder[models.PutApprovalResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("stageName" -> o.stageName.asJson, "pipelineName" -> o.pipelineName.asJson, "actionName" -> o.actionName.asJson, "result" -> o.result.asJson, "token" -> o.token.asJson)
  }
  final implicit val DisableStageTransitionInputEncoder: io.circe.Encoder[models.DisableStageTransitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "transitionType" -> o.transitionType.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val ListActionTypesInputEncoder: io.circe.Encoder[models.ListActionTypesInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionOwnerFilter" -> o.actionOwnerFilter.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidActionDeclarationExceptionEncoder: io.circe.Encoder[models.InvalidActionDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetThirdPartyJobDetailsInputEncoder: io.circe.Encoder[models.GetThirdPartyJobDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "clientToken" -> o.clientToken.asJson)
  }
  final implicit val JobNotFoundExceptionEncoder: io.circe.Encoder[models.JobNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionStateEncoder: io.circe.Encoder[models.ActionState] = io.circe.Encoder.instance { o => 
    Json.obj("actionName" -> o.actionName.asJson, "currentRevision" -> o.currentRevision.asJson, "latestExecution" -> o.latestExecution.asJson, "entityUrl" -> o.entityUrl.asJson, "revisionUrl" -> o.revisionUrl.asJson)
  }
  final implicit val ActionConfigurationPropertyEncoder: io.circe.Encoder[models.ActionConfigurationProperty] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "required" -> o.required.asJson, "key" -> o.key.asJson, "secret" -> o.secret.asJson, "queryable" -> o.queryable.asJson, "description" -> o.description.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val JobDataEncoder: io.circe.Encoder[models.JobData] = io.circe.Encoder.instance { o => 
    Json.obj("actionConfiguration" -> o.actionConfiguration.asJson, "artifactCredentials" -> o.artifactCredentials.asJson, "encryptionKey" -> o.encryptionKey.asJson, "actionTypeId" -> o.actionTypeId.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson, "continuationToken" -> o.continuationToken.asJson, "pipelineContext" -> o.pipelineContext.asJson)
  }
  final implicit val EncryptionKeyEncoder: io.circe.Encoder[models.EncryptionKey] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val PutThirdPartyJobSuccessResultInputEncoder: io.circe.Encoder[models.PutThirdPartyJobSuccessResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("clientToken" -> o.clientToken.asJson, "jobId" -> o.jobId.asJson, "currentRevision" -> o.currentRevision.asJson, "continuationToken" -> o.continuationToken.asJson, "executionDetails" -> o.executionDetails.asJson)
  }
  final implicit val GetPipelineStateOutputEncoder: io.circe.Encoder[models.GetPipelineStateOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "pipelineVersion" -> o.pipelineVersion.asJson, "stageStates" -> o.stageStates.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val ActionTypeEncoder: io.circe.Encoder[models.ActionType] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "inputArtifactDetails" -> o.inputArtifactDetails.asJson, "outputArtifactDetails" -> o.outputArtifactDetails.asJson, "settings" -> o.settings.asJson, "actionConfigurationProperties" -> o.actionConfigurationProperties.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StageDeclarationEncoder: io.circe.Encoder[models.StageDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "actions" -> o.actions.asJson, "blockers" -> o.blockers.asJson)
  }
  final implicit val PipelineExecutionNotFoundExceptionEncoder: io.circe.Encoder[models.PipelineExecutionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineExecutionSummaryEncoder: io.circe.Encoder[models.PipelineExecutionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson, "status" -> o.status.asJson, "startTime" -> o.startTime.asJson, "lastUpdateTime" -> o.lastUpdateTime.asJson)
  }
  final implicit val S3ArtifactLocationEncoder: io.circe.Encoder[models.S3ArtifactLocation] = io.circe.Encoder.instance { o => 
    Json.obj("bucketName" -> o.bucketName.asJson, "objectKey" -> o.objectKey.asJson)
  }
  final implicit val GetThirdPartyJobDetailsOutputEncoder: io.circe.Encoder[models.GetThirdPartyJobDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobDetails" -> o.jobDetails.asJson)
  }
  final implicit val PutActionRevisionOutputEncoder: io.circe.Encoder[models.PutActionRevisionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("newRevision" -> o.newRevision.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val ActionTypeIdEncoder: io.circe.Encoder[models.ActionTypeId] = io.circe.Encoder.instance { o => 
    Json.obj("category" -> o.category.asJson, "owner" -> o.owner.asJson, "provider" -> o.provider.asJson, "version" -> o.version.asJson)
  }
  final implicit val DeleteCustomActionTypeInputEncoder: io.circe.Encoder[models.DeleteCustomActionTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("category" -> o.category.asJson, "provider" -> o.provider.asJson, "version" -> o.version.asJson)
  }
  final implicit val GetPipelineStateInputEncoder: io.circe.Encoder[models.GetPipelineStateInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val PutApprovalResultOutputEncoder: io.circe.Encoder[models.PutApprovalResultOutput] = io.circe.Encoder.instance { o => 
    Json.obj("approvedAt" -> o.approvedAt.asJson)
  }
  final implicit val ActionTypeSettingsEncoder: io.circe.Encoder[models.ActionTypeSettings] = io.circe.Encoder.instance { o => 
    Json.obj("thirdPartyConfigurationUrl" -> o.thirdPartyConfigurationUrl.asJson, "entityUrlTemplate" -> o.entityUrlTemplate.asJson, "executionUrlTemplate" -> o.executionUrlTemplate.asJson, "revisionUrlTemplate" -> o.revisionUrlTemplate.asJson)
  }
  final implicit val ListPipelineExecutionsInputEncoder: io.circe.Encoder[models.ListPipelineExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListPipelineExecutionsOutputEncoder: io.circe.Encoder[models.ListPipelineExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionSummaries" -> o.pipelineExecutionSummaries.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidStageDeclarationExceptionEncoder: io.circe.Encoder[models.InvalidStageDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ArtifactEncoder: io.circe.Encoder[models.Artifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "revision" -> o.revision.asJson, "location" -> o.location.asJson)
  }
  final implicit val OutputArtifactEncoder: io.circe.Encoder[models.OutputArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val GetPipelineOutputEncoder: io.circe.Encoder[models.GetPipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson, "metadata" -> o.metadata.asJson)
  }
  final implicit val NotLatestPipelineExecutionExceptionEncoder: io.circe.Encoder[models.NotLatestPipelineExecutionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePipelineInputEncoder: io.circe.Encoder[models.CreatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val AcknowledgeThirdPartyJobInputEncoder: io.circe.Encoder[models.AcknowledgeThirdPartyJobInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "nonce" -> o.nonce.asJson, "clientToken" -> o.clientToken.asJson)
  }
  final implicit val PipelineSummaryEncoder: io.circe.Encoder[models.PipelineSummary] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val RetryStageExecutionInputEncoder: io.circe.Encoder[models.RetryStageExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson, "retryMode" -> o.retryMode.asJson)
  }
  final implicit val UpdatePipelineInputEncoder: io.circe.Encoder[models.UpdatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ExecutionDetailsEncoder: io.circe.Encoder[models.ExecutionDetails] = io.circe.Encoder.instance { o => 
    Json.obj("summary" -> o.summary.asJson, "externalExecutionId" -> o.externalExecutionId.asJson, "percentComplete" -> o.percentComplete.asJson)
  }
  final implicit val ArtifactRevisionEncoder: io.circe.Encoder[models.ArtifactRevision] = io.circe.Encoder.instance { o => 
    Json.obj("created" -> o.created.asJson, "revisionUrl" -> o.revisionUrl.asJson, "revisionSummary" -> o.revisionSummary.asJson, "revisionChangeIdentifier" -> o.revisionChangeIdentifier.asJson, "revisionId" -> o.revisionId.asJson, "name" -> o.name.asJson)
  }
  final implicit val PollForThirdPartyJobsInputEncoder: io.circe.Encoder[models.PollForThirdPartyJobsInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypeId" -> o.actionTypeId.asJson, "maxBatchSize" -> o.maxBatchSize.asJson)
  }
  final implicit val PollForThirdPartyJobsOutputEncoder: io.circe.Encoder[models.PollForThirdPartyJobsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson)
  }
  final implicit val PutThirdPartyJobFailureResultInputEncoder: io.circe.Encoder[models.PutThirdPartyJobFailureResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "clientToken" -> o.clientToken.asJson, "failureDetails" -> o.failureDetails.asJson)
  }
  final implicit val RetryStageExecutionOutputEncoder: io.circe.Encoder[models.RetryStageExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val TransitionStateEncoder: io.circe.Encoder[models.TransitionState] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "lastChangedBy" -> o.lastChangedBy.asJson, "lastChangedAt" -> o.lastChangedAt.asJson, "disabledReason" -> o.disabledReason.asJson)
  }
  final implicit val PollForJobsInputEncoder: io.circe.Encoder[models.PollForJobsInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypeId" -> o.actionTypeId.asJson, "maxBatchSize" -> o.maxBatchSize.asJson, "queryParam" -> o.queryParam.asJson)
  }
  final implicit val PipelineDeclarationEncoder: io.circe.Encoder[models.PipelineDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("roleArn" -> o.roleArn.asJson, "name" -> o.name.asJson, "stages" -> o.stages.asJson, "artifactStore" -> o.artifactStore.asJson, "version" -> o.version.asJson)
  }
  final implicit val InvalidJobStateExceptionEncoder: io.circe.Encoder[models.InvalidJobStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobDetailsInputEncoder: io.circe.Encoder[models.GetJobDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson)
  }
  final implicit val GetPipelineInputEncoder: io.circe.Encoder[models.GetPipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson)
  }
  final implicit val ActionTypeNotFoundExceptionEncoder: io.circe.Encoder[models.ActionTypeNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionNotFoundExceptionEncoder: io.circe.Encoder[models.ActionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineNotFoundExceptionEncoder: io.circe.Encoder[models.PipelineNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineContextEncoder: io.circe.Encoder[models.PipelineContext] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stage" -> o.stage.asJson, "action" -> o.action.asJson)
  }
  final implicit val FailureDetailsEncoder: io.circe.Encoder[models.FailureDetails] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "message" -> o.message.asJson, "externalExecutionId" -> o.externalExecutionId.asJson)
  }
  final implicit val ListPipelinesInputEncoder: io.circe.Encoder[models.ListPipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val ArtifactDetailsEncoder: io.circe.Encoder[models.ArtifactDetails] = io.circe.Encoder.instance { o => 
    Json.obj("minimumCount" -> o.minimumCount.asJson, "maximumCount" -> o.maximumCount.asJson)
  }
  final implicit val PutActionRevisionInputEncoder: io.circe.Encoder[models.PutActionRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "actionName" -> o.actionName.asJson, "actionRevision" -> o.actionRevision.asJson)
  }
  final implicit val ArtifactStoreEncoder: io.circe.Encoder[models.ArtifactStore] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "encryptionKey" -> o.encryptionKey.asJson)
  }
  final implicit val AcknowledgeThirdPartyJobOutputDecoder: io.circe.Decoder[models.AcknowledgeThirdPartyJobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("status").map(models.AcknowledgeThirdPartyJobOutput.apply _)
  }
  final implicit val PipelineNameInUseExceptionDecoder: io.circe.Decoder[models.PipelineNameInUseException.type] = io.circe.Decoder.decodeUnit.as(models.PipelineNameInUseException)
  final implicit val GetJobDetailsOutputDecoder: io.circe.Decoder[models.GetJobDetailsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.JobDetails]]("jobDetails").map(models.GetJobDetailsOutput.apply _)
  }
  final implicit val BlockerDeclarationDecoder: io.circe.Decoder[models.BlockerDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("type")).mapN(models.BlockerDeclaration.apply _)
  }
  final implicit val StartPipelineExecutionOutputDecoder: io.circe.Decoder[models.StartPipelineExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pipelineExecutionId").map(models.StartPipelineExecutionOutput.apply _)
  }
  final implicit val CreateCustomActionTypeOutputDecoder: io.circe.Decoder[models.CreateCustomActionTypeOutput] = io.circe.Decoder.instance { o => 
    o.get[models.ActionType]("actionType").map(models.CreateCustomActionTypeOutput.apply _)
  }
  final implicit val ListPipelinesOutputDecoder: io.circe.Decoder[models.ListPipelinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PipelineSummary]]]("pipelines"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListPipelinesOutput.apply _)
  }
  final implicit val AcknowledgeJobInputDecoder: io.circe.Decoder[models.AcknowledgeJobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("nonce")).mapN(models.AcknowledgeJobInput.apply _)
  }
  final implicit val StageExecutionDecoder: io.circe.Decoder[models.StageExecution] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineExecutionId"), o.get[java.lang.String]("status")).mapN(models.StageExecution.apply _)
  }
  final implicit val StageNotFoundExceptionDecoder: io.circe.Decoder[models.StageNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.StageNotFoundException)
  final implicit val ActionConfigurationDecoder: io.circe.Decoder[models.ActionConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("configuration").map(models.ActionConfiguration.apply _)
  }
  final implicit val InvalidNonceExceptionDecoder: io.circe.Decoder[models.InvalidNonceException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidNonceException)
  final implicit val PollForJobsOutputDecoder: io.circe.Decoder[models.PollForJobsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Job]]]("jobs").map(models.PollForJobsOutput.apply _)
  }
  final implicit val InputArtifactDecoder: io.circe.Decoder[models.InputArtifact] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.InputArtifact.apply _)
  }
  final implicit val InvalidApprovalTokenExceptionDecoder: io.circe.Decoder[models.InvalidApprovalTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidApprovalTokenException)
  final implicit val CreateCustomActionTypeInputDecoder: io.circe.Decoder[models.CreateCustomActionTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("provider"), o.get[java.lang.String]("version"), o.get[models.ArtifactDetails]("inputArtifactDetails"), o.get[models.ArtifactDetails]("outputArtifactDetails"), o.get[java.lang.String]("category"), o.get[scala.Option[scala.List[models.ActionConfigurationProperty]]]("configurationProperties"), o.get[scala.Option[models.ActionTypeSettings]]("settings")).mapN(models.CreateCustomActionTypeInput.apply _)
  }
  final implicit val StageNotRetryableExceptionDecoder: io.circe.Decoder[models.StageNotRetryableException.type] = io.circe.Decoder.decodeUnit.as(models.StageNotRetryableException)
  final implicit val CurrentRevisionDecoder: io.circe.Decoder[models.CurrentRevision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("revision"), o.get[java.lang.String]("changeIdentifier"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("revisionSummary")).mapN(models.CurrentRevision.apply _)
  }
  final implicit val JobDecoder: io.circe.Decoder[models.Job] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[models.JobData]]("data"), o.get[scala.Option[java.lang.String]]("nonce"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(models.Job.apply _)
  }
  final implicit val ThirdPartyJobDetailsDecoder: io.circe.Decoder[models.ThirdPartyJobDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[models.ThirdPartyJobData]]("data"), o.get[scala.Option[java.lang.String]]("nonce")).mapN(models.ThirdPartyJobDetails.apply _)
  }
  final implicit val UpdatePipelineOutputDecoder: io.circe.Decoder[models.UpdatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.PipelineDeclaration]]("pipeline").map(models.UpdatePipelineOutput.apply _)
  }
  final implicit val ListActionTypesOutputDecoder: io.circe.Decoder[models.ListActionTypesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.ActionType]]("actionTypes"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListActionTypesOutput.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[models.ValidationException.type] = io.circe.Decoder.decodeUnit.as(models.ValidationException)
  final implicit val PipelineExecutionDecoder: io.circe.Decoder[models.PipelineExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.List[models.ArtifactRevision]]]("artifactRevisions"), o.get[scala.Option[scala.Int]]("pipelineVersion"), o.get[scala.Option[java.lang.String]]("pipelineExecutionId")).mapN(models.PipelineExecution.apply _)
  }
  final implicit val EnableStageTransitionInputDecoder: io.circe.Decoder[models.EnableStageTransitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("transitionType")).mapN(models.EnableStageTransitionInput.apply _)
  }
  final implicit val ArtifactLocationDecoder: io.circe.Decoder[models.ArtifactLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[models.S3ArtifactLocation]]("s3Location")).mapN(models.ArtifactLocation.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidNextTokenException)
  final implicit val InvalidBlockerDeclarationExceptionDecoder: io.circe.Decoder[models.InvalidBlockerDeclarationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidBlockerDeclarationException)
  final implicit val StartPipelineExecutionInputDecoder: io.circe.Decoder[models.StartPipelineExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.StartPipelineExecutionInput.apply _)
  }
  final implicit val InvalidClientTokenExceptionDecoder: io.circe.Decoder[models.InvalidClientTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidClientTokenException)
  final implicit val StageStateDecoder: io.circe.Decoder[models.StageState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("stageName"), o.get[scala.Option[models.TransitionState]]("inboundTransitionState"), o.get[scala.Option[scala.List[models.ActionState]]]("actionStates"), o.get[scala.Option[models.StageExecution]]("latestExecution")).mapN(models.StageState.apply _)
  }
  final implicit val JobDetailsDecoder: io.circe.Decoder[models.JobDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[models.JobData]]("data"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(models.JobDetails.apply _)
  }
  final implicit val InvalidJobExceptionDecoder: io.circe.Decoder[models.InvalidJobException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidJobException)
  final implicit val PutJobSuccessResultInputDecoder: io.circe.Decoder[models.PutJobSuccessResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[scala.Option[models.CurrentRevision]]("currentRevision"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[models.ExecutionDetails]]("executionDetails")).mapN(models.PutJobSuccessResultInput.apply _)
  }
  final implicit val ActionContextDecoder: io.circe.Decoder[models.ActionContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(models.ActionContext.apply _)
  }
  final implicit val DeletePipelineInputDecoder: io.circe.Decoder[models.DeletePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.DeletePipelineInput.apply _)
  }
  final implicit val ActionExecutionDecoder: io.circe.Decoder[models.ActionExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lastUpdatedBy"), o.get[scala.Option[java.time.Instant]]("lastStatusChange"), o.get[scala.Option[java.lang.String]]("summary"), o.get[scala.Option[java.lang.String]]("externalExecutionUrl"), o.get[scala.Option[java.lang.String]]("token"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[models.ErrorDetails]]("errorDetails"), o.get[scala.Option[java.lang.String]]("externalExecutionId"), o.get[scala.Option[scala.Int]]("percentComplete")).mapN(models.ActionExecution.apply _)
  }
  final implicit val ThirdPartyJobDecoder: io.circe.Decoder[models.ThirdPartyJob] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("clientId"), o.get[scala.Option[java.lang.String]]("jobId")).mapN(models.ThirdPartyJob.apply _)
  }
  final implicit val AWSSessionCredentialsDecoder: io.circe.Decoder[models.AWSSessionCredentials] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("accessKeyId"), o.get[java.lang.String]("secretAccessKey"), o.get[java.lang.String]("sessionToken")).mapN(models.AWSSessionCredentials.apply _)
  }
  final implicit val AcknowledgeJobOutputDecoder: io.circe.Decoder[models.AcknowledgeJobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("status").map(models.AcknowledgeJobOutput.apply _)
  }
  final implicit val GetPipelineExecutionOutputDecoder: io.circe.Decoder[models.GetPipelineExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.PipelineExecution]]("pipelineExecution").map(models.GetPipelineExecutionOutput.apply _)
  }
  final implicit val InvalidStructureExceptionDecoder: io.circe.Decoder[models.InvalidStructureException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidStructureException)
  final implicit val PipelineVersionNotFoundExceptionDecoder: io.circe.Decoder[models.PipelineVersionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.PipelineVersionNotFoundException)
  final implicit val ActionDeclarationDecoder: io.circe.Decoder[models.ActionDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[models.ActionTypeId]("actionTypeId"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[scala.Int]]("runOrder"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("configuration"), o.get[scala.Option[scala.List[models.InputArtifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[models.OutputArtifact]]]("outputArtifacts")).mapN(models.ActionDeclaration.apply _)
  }
  final implicit val GetPipelineExecutionInputDecoder: io.circe.Decoder[models.GetPipelineExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("pipelineExecutionId")).mapN(models.GetPipelineExecutionInput.apply _)
  }
  final implicit val ErrorDetailsDecoder: io.circe.Decoder[models.ErrorDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("message")).mapN(models.ErrorDetails.apply _)
  }
  final implicit val ApprovalAlreadyCompletedExceptionDecoder: io.circe.Decoder[models.ApprovalAlreadyCompletedException.type] = io.circe.Decoder.decodeUnit.as(models.ApprovalAlreadyCompletedException)
  final implicit val CreatePipelineOutputDecoder: io.circe.Decoder[models.CreatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.PipelineDeclaration]]("pipeline").map(models.CreatePipelineOutput.apply _)
  }
  final implicit val ApprovalResultDecoder: io.circe.Decoder[models.ApprovalResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("summary"), o.get[java.lang.String]("status")).mapN(models.ApprovalResult.apply _)
  }
  final implicit val ThirdPartyJobDataDecoder: io.circe.Decoder[models.ThirdPartyJobData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ActionConfiguration]]("actionConfiguration"), o.get[scala.Option[models.AWSSessionCredentials]]("artifactCredentials"), o.get[scala.Option[models.EncryptionKey]]("encryptionKey"), o.get[scala.Option[models.ActionTypeId]]("actionTypeId"), o.get[scala.Option[scala.List[models.Artifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[models.Artifact]]]("outputArtifacts"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[models.PipelineContext]]("pipelineContext")).mapN(models.ThirdPartyJobData.apply _)
  }
  final implicit val ActionRevisionDecoder: io.circe.Decoder[models.ActionRevision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("revisionId"), o.get[java.lang.String]("revisionChangeId"), o.get[java.time.Instant]("created")).mapN(models.ActionRevision.apply _)
  }
  final implicit val StageContextDecoder: io.circe.Decoder[models.StageContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(models.StageContext.apply _)
  }
  final implicit val PipelineMetadataDecoder: io.circe.Decoder[models.PipelineMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineArn"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(models.PipelineMetadata.apply _)
  }
  final implicit val PutJobFailureResultInputDecoder: io.circe.Decoder[models.PutJobFailureResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[models.FailureDetails]("failureDetails")).mapN(models.PutJobFailureResultInput.apply _)
  }
  final implicit val PutApprovalResultInputDecoder: io.circe.Decoder[models.PutApprovalResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stageName"), o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("actionName"), o.get[models.ApprovalResult]("result"), o.get[java.lang.String]("token")).mapN(models.PutApprovalResultInput.apply _)
  }
  final implicit val DisableStageTransitionInputDecoder: io.circe.Decoder[models.DisableStageTransitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("transitionType"), o.get[java.lang.String]("reason")).mapN(models.DisableStageTransitionInput.apply _)
  }
  final implicit val ListActionTypesInputDecoder: io.circe.Decoder[models.ListActionTypesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionOwnerFilter"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListActionTypesInput.apply _)
  }
  final implicit val InvalidActionDeclarationExceptionDecoder: io.circe.Decoder[models.InvalidActionDeclarationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidActionDeclarationException)
  final implicit val GetThirdPartyJobDetailsInputDecoder: io.circe.Decoder[models.GetThirdPartyJobDetailsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("clientToken")).mapN(models.GetThirdPartyJobDetailsInput.apply _)
  }
  final implicit val JobNotFoundExceptionDecoder: io.circe.Decoder[models.JobNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.JobNotFoundException)
  final implicit val ActionStateDecoder: io.circe.Decoder[models.ActionState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionName"), o.get[scala.Option[models.ActionRevision]]("currentRevision"), o.get[scala.Option[models.ActionExecution]]("latestExecution"), o.get[scala.Option[java.lang.String]]("entityUrl"), o.get[scala.Option[java.lang.String]]("revisionUrl")).mapN(models.ActionState.apply _)
  }
  final implicit val ActionConfigurationPropertyDecoder: io.circe.Decoder[models.ActionConfigurationProperty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Boolean]("required"), o.get[scala.Boolean]("key"), o.get[scala.Boolean]("secret"), o.get[scala.Option[scala.Boolean]]("queryable"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("type")).mapN(models.ActionConfigurationProperty.apply _)
  }
  final implicit val JobDataDecoder: io.circe.Decoder[models.JobData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ActionConfiguration]]("actionConfiguration"), o.get[scala.Option[models.AWSSessionCredentials]]("artifactCredentials"), o.get[scala.Option[models.EncryptionKey]]("encryptionKey"), o.get[scala.Option[models.ActionTypeId]]("actionTypeId"), o.get[scala.Option[scala.List[models.Artifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[models.Artifact]]]("outputArtifacts"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[models.PipelineContext]]("pipelineContext")).mapN(models.JobData.apply _)
  }
  final implicit val EncryptionKeyDecoder: io.circe.Decoder[models.EncryptionKey] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("type")).mapN(models.EncryptionKey.apply _)
  }
  final implicit val PutThirdPartyJobSuccessResultInputDecoder: io.circe.Decoder[models.PutThirdPartyJobSuccessResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("clientToken"), o.get[java.lang.String]("jobId"), o.get[scala.Option[models.CurrentRevision]]("currentRevision"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[models.ExecutionDetails]]("executionDetails")).mapN(models.PutThirdPartyJobSuccessResultInput.apply _)
  }
  final implicit val GetPipelineStateOutputDecoder: io.circe.Decoder[models.GetPipelineStateOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[scala.Int]]("pipelineVersion"), o.get[scala.Option[scala.List[models.StageState]]]("stageStates"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(models.GetPipelineStateOutput.apply _)
  }
  final implicit val ActionTypeDecoder: io.circe.Decoder[models.ActionType] = io.circe.Decoder.instance { o => 
    (o.get[models.ActionTypeId]("id"), o.get[models.ArtifactDetails]("inputArtifactDetails"), o.get[models.ArtifactDetails]("outputArtifactDetails"), o.get[scala.Option[models.ActionTypeSettings]]("settings"), o.get[scala.Option[scala.List[models.ActionConfigurationProperty]]]("actionConfigurationProperties")).mapN(models.ActionType.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.LimitExceededException)
  final implicit val StageDeclarationDecoder: io.circe.Decoder[models.StageDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.List[models.ActionDeclaration]]("actions"), o.get[scala.Option[scala.List[models.BlockerDeclaration]]]("blockers")).mapN(models.StageDeclaration.apply _)
  }
  final implicit val PipelineExecutionNotFoundExceptionDecoder: io.circe.Decoder[models.PipelineExecutionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.PipelineExecutionNotFoundException)
  final implicit val PipelineExecutionSummaryDecoder: io.circe.Decoder[models.PipelineExecutionSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineExecutionId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("lastUpdateTime")).mapN(models.PipelineExecutionSummary.apply _)
  }
  final implicit val S3ArtifactLocationDecoder: io.circe.Decoder[models.S3ArtifactLocation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("bucketName"), o.get[java.lang.String]("objectKey")).mapN(models.S3ArtifactLocation.apply _)
  }
  final implicit val GetThirdPartyJobDetailsOutputDecoder: io.circe.Decoder[models.GetThirdPartyJobDetailsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ThirdPartyJobDetails]]("jobDetails").map(models.GetThirdPartyJobDetailsOutput.apply _)
  }
  final implicit val PutActionRevisionOutputDecoder: io.circe.Decoder[models.PutActionRevisionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("newRevision"), o.get[scala.Option[java.lang.String]]("pipelineExecutionId")).mapN(models.PutActionRevisionOutput.apply _)
  }
  final implicit val ActionTypeIdDecoder: io.circe.Decoder[models.ActionTypeId] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("category"), o.get[java.lang.String]("owner"), o.get[java.lang.String]("provider"), o.get[java.lang.String]("version")).mapN(models.ActionTypeId.apply _)
  }
  final implicit val DeleteCustomActionTypeInputDecoder: io.circe.Decoder[models.DeleteCustomActionTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("category"), o.get[java.lang.String]("provider"), o.get[java.lang.String]("version")).mapN(models.DeleteCustomActionTypeInput.apply _)
  }
  final implicit val GetPipelineStateInputDecoder: io.circe.Decoder[models.GetPipelineStateInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.GetPipelineStateInput.apply _)
  }
  final implicit val PutApprovalResultOutputDecoder: io.circe.Decoder[models.PutApprovalResultOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.time.Instant]]("approvedAt").map(models.PutApprovalResultOutput.apply _)
  }
  final implicit val ActionTypeSettingsDecoder: io.circe.Decoder[models.ActionTypeSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("thirdPartyConfigurationUrl"), o.get[scala.Option[java.lang.String]]("entityUrlTemplate"), o.get[scala.Option[java.lang.String]]("executionUrlTemplate"), o.get[scala.Option[java.lang.String]]("revisionUrlTemplate")).mapN(models.ActionTypeSettings.apply _)
  }
  final implicit val ListPipelineExecutionsInputDecoder: io.circe.Decoder[models.ListPipelineExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListPipelineExecutionsInput.apply _)
  }
  final implicit val ListPipelineExecutionsOutputDecoder: io.circe.Decoder[models.ListPipelineExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PipelineExecutionSummary]]]("pipelineExecutionSummaries"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListPipelineExecutionsOutput.apply _)
  }
  final implicit val InvalidStageDeclarationExceptionDecoder: io.circe.Decoder[models.InvalidStageDeclarationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidStageDeclarationException)
  final implicit val ArtifactDecoder: io.circe.Decoder[models.Artifact] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("revision"), o.get[scala.Option[models.ArtifactLocation]]("location")).mapN(models.Artifact.apply _)
  }
  final implicit val OutputArtifactDecoder: io.circe.Decoder[models.OutputArtifact] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.OutputArtifact.apply _)
  }
  final implicit val GetPipelineOutputDecoder: io.circe.Decoder[models.GetPipelineOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.PipelineDeclaration]]("pipeline"), o.get[scala.Option[models.PipelineMetadata]]("metadata")).mapN(models.GetPipelineOutput.apply _)
  }
  final implicit val NotLatestPipelineExecutionExceptionDecoder: io.circe.Decoder[models.NotLatestPipelineExecutionException.type] = io.circe.Decoder.decodeUnit.as(models.NotLatestPipelineExecutionException)
  final implicit val CreatePipelineInputDecoder: io.circe.Decoder[models.CreatePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[models.PipelineDeclaration]("pipeline").map(models.CreatePipelineInput.apply _)
  }
  final implicit val AcknowledgeThirdPartyJobInputDecoder: io.circe.Decoder[models.AcknowledgeThirdPartyJobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("nonce"), o.get[java.lang.String]("clientToken")).mapN(models.AcknowledgeThirdPartyJobInput.apply _)
  }
  final implicit val PipelineSummaryDecoder: io.circe.Decoder[models.PipelineSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Int]]("version"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(models.PipelineSummary.apply _)
  }
  final implicit val RetryStageExecutionInputDecoder: io.circe.Decoder[models.RetryStageExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("pipelineExecutionId"), o.get[java.lang.String]("retryMode")).mapN(models.RetryStageExecutionInput.apply _)
  }
  final implicit val UpdatePipelineInputDecoder: io.circe.Decoder[models.UpdatePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[models.PipelineDeclaration]("pipeline").map(models.UpdatePipelineInput.apply _)
  }
  final implicit val ExecutionDetailsDecoder: io.circe.Decoder[models.ExecutionDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("summary"), o.get[scala.Option[java.lang.String]]("externalExecutionId"), o.get[scala.Option[scala.Int]]("percentComplete")).mapN(models.ExecutionDetails.apply _)
  }
  final implicit val ArtifactRevisionDecoder: io.circe.Decoder[models.ArtifactRevision] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("revisionUrl"), o.get[scala.Option[java.lang.String]]("revisionSummary"), o.get[scala.Option[java.lang.String]]("revisionChangeIdentifier"), o.get[scala.Option[java.lang.String]]("revisionId"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.ArtifactRevision.apply _)
  }
  final implicit val PollForThirdPartyJobsInputDecoder: io.circe.Decoder[models.PollForThirdPartyJobsInput] = io.circe.Decoder.instance { o => 
    (o.get[models.ActionTypeId]("actionTypeId"), o.get[scala.Option[scala.Int]]("maxBatchSize")).mapN(models.PollForThirdPartyJobsInput.apply _)
  }
  final implicit val PollForThirdPartyJobsOutputDecoder: io.circe.Decoder[models.PollForThirdPartyJobsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ThirdPartyJob]]]("jobs").map(models.PollForThirdPartyJobsOutput.apply _)
  }
  final implicit val PutThirdPartyJobFailureResultInputDecoder: io.circe.Decoder[models.PutThirdPartyJobFailureResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("clientToken"), o.get[models.FailureDetails]("failureDetails")).mapN(models.PutThirdPartyJobFailureResultInput.apply _)
  }
  final implicit val RetryStageExecutionOutputDecoder: io.circe.Decoder[models.RetryStageExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pipelineExecutionId").map(models.RetryStageExecutionOutput.apply _)
  }
  final implicit val TransitionStateDecoder: io.circe.Decoder[models.TransitionState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[java.lang.String]]("lastChangedBy"), o.get[scala.Option[java.time.Instant]]("lastChangedAt"), o.get[scala.Option[java.lang.String]]("disabledReason")).mapN(models.TransitionState.apply _)
  }
  final implicit val PollForJobsInputDecoder: io.circe.Decoder[models.PollForJobsInput] = io.circe.Decoder.instance { o => 
    (o.get[models.ActionTypeId]("actionTypeId"), o.get[scala.Option[scala.Int]]("maxBatchSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("queryParam")).mapN(models.PollForJobsInput.apply _)
  }
  final implicit val PipelineDeclarationDecoder: io.circe.Decoder[models.PipelineDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("roleArn"), o.get[java.lang.String]("name"), o.get[scala.List[models.StageDeclaration]]("stages"), o.get[models.ArtifactStore]("artifactStore"), o.get[scala.Option[scala.Int]]("version")).mapN(models.PipelineDeclaration.apply _)
  }
  final implicit val InvalidJobStateExceptionDecoder: io.circe.Decoder[models.InvalidJobStateException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidJobStateException)
  final implicit val GetJobDetailsInputDecoder: io.circe.Decoder[models.GetJobDetailsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("jobId").map(models.GetJobDetailsInput.apply _)
  }
  final implicit val GetPipelineInputDecoder: io.circe.Decoder[models.GetPipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[scala.Int]]("version")).mapN(models.GetPipelineInput.apply _)
  }
  final implicit val ActionTypeNotFoundExceptionDecoder: io.circe.Decoder[models.ActionTypeNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ActionTypeNotFoundException)
  final implicit val ActionNotFoundExceptionDecoder: io.circe.Decoder[models.ActionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ActionNotFoundException)
  final implicit val PipelineNotFoundExceptionDecoder: io.circe.Decoder[models.PipelineNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.PipelineNotFoundException)
  final implicit val PipelineContextDecoder: io.circe.Decoder[models.PipelineContext] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[models.StageContext]]("stage"), o.get[scala.Option[models.ActionContext]]("action")).mapN(models.PipelineContext.apply _)
  }
  final implicit val FailureDetailsDecoder: io.circe.Decoder[models.FailureDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[java.lang.String]("message"), o.get[scala.Option[java.lang.String]]("externalExecutionId")).mapN(models.FailureDetails.apply _)
  }
  final implicit val ListPipelinesInputDecoder: io.circe.Decoder[models.ListPipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(models.ListPipelinesInput.apply _)
  }
  final implicit val ArtifactDetailsDecoder: io.circe.Decoder[models.ArtifactDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("minimumCount"), o.get[scala.Int]("maximumCount")).mapN(models.ArtifactDetails.apply _)
  }
  final implicit val PutActionRevisionInputDecoder: io.circe.Decoder[models.PutActionRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("actionName"), o.get[models.ActionRevision]("actionRevision")).mapN(models.PutActionRevisionInput.apply _)
  }
  final implicit val ArtifactStoreDecoder: io.circe.Decoder[models.ArtifactStore] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[java.lang.String]("location"), o.get[scala.Option[models.EncryptionKey]]("encryptionKey")).mapN(models.ArtifactStore.apply _)
  }
}