package org.lyranthe.araethura.codepipeline
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val AcknowledgeThirdPartyJobOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeThirdPartyJobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val PipelineNameInUseExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineNameInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobDetailsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetJobDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobDetails" -> o.jobDetails.asJson)
  }
  final implicit val BlockerDeclarationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.BlockerDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val StartPipelineExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StartPipelineExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val CreateCustomActionTypeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.CreateCustomActionTypeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("actionType" -> o.actionType.asJson)
  }
  final implicit val ListPipelinesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ListPipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelines" -> o.pipelines.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AcknowledgeJobInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeJobInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "nonce" -> o.nonce.asJson)
  }
  final implicit val StageExecutionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StageExecution] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson, "status" -> o.status.asJson)
  }
  final implicit val StageNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StageNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionConfigurationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("configuration" -> o.configuration.asJson)
  }
  final implicit val InvalidNonceExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidNonceException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForJobsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PollForJobsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson)
  }
  final implicit val InputArtifactEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InputArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val InvalidApprovalTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidApprovalTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateCustomActionTypeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.CreateCustomActionTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("provider" -> o.provider.asJson, "version" -> o.version.asJson, "inputArtifactDetails" -> o.inputArtifactDetails.asJson, "outputArtifactDetails" -> o.outputArtifactDetails.asJson, "category" -> o.category.asJson, "configurationProperties" -> o.configurationProperties.asJson, "settings" -> o.settings.asJson)
  }
  final implicit val StageNotRetryableExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StageNotRetryableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CurrentRevisionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.CurrentRevision] = io.circe.Encoder.instance { o => 
    Json.obj("revision" -> o.revision.asJson, "changeIdentifier" -> o.changeIdentifier.asJson, "created" -> o.created.asJson, "revisionSummary" -> o.revisionSummary.asJson)
  }
  final implicit val JobEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.Job] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "nonce" -> o.nonce.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val ThirdPartyJobDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobDetails] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "nonce" -> o.nonce.asJson)
  }
  final implicit val UpdatePipelineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.UpdatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ListActionTypesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ListActionTypesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypes" -> o.actionTypes.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineExecutionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineExecution] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "status" -> o.status.asJson, "artifactRevisions" -> o.artifactRevisions.asJson, "pipelineVersion" -> o.pipelineVersion.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val EnableStageTransitionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.EnableStageTransitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "transitionType" -> o.transitionType.asJson)
  }
  final implicit val ArtifactLocationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ArtifactLocation] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "s3Location" -> o.s3Location.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidBlockerDeclarationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidBlockerDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartPipelineExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StartPipelineExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val InvalidClientTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidClientTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StageStateEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StageState] = io.circe.Encoder.instance { o => 
    Json.obj("stageName" -> o.stageName.asJson, "inboundTransitionState" -> o.inboundTransitionState.asJson, "actionStates" -> o.actionStates.asJson, "latestExecution" -> o.latestExecution.asJson)
  }
  final implicit val JobDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.JobDetails] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val InvalidJobExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidJobException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutJobSuccessResultInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutJobSuccessResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "currentRevision" -> o.currentRevision.asJson, "continuationToken" -> o.continuationToken.asJson, "executionDetails" -> o.executionDetails.asJson)
  }
  final implicit val ActionContextEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionContext] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val DeletePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.DeletePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val ActionExecutionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionExecution] = io.circe.Encoder.instance { o => 
    Json.obj("lastUpdatedBy" -> o.lastUpdatedBy.asJson, "lastStatusChange" -> o.lastStatusChange.asJson, "summary" -> o.summary.asJson, "externalExecutionUrl" -> o.externalExecutionUrl.asJson, "token" -> o.token.asJson, "status" -> o.status.asJson, "errorDetails" -> o.errorDetails.asJson, "externalExecutionId" -> o.externalExecutionId.asJson, "percentComplete" -> o.percentComplete.asJson)
  }
  final implicit val ThirdPartyJobEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ThirdPartyJob] = io.circe.Encoder.instance { o => 
    Json.obj("clientId" -> o.clientId.asJson, "jobId" -> o.jobId.asJson)
  }
  final implicit val AWSSessionCredentialsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("accessKeyId" -> o.accessKeyId.asJson, "secretAccessKey" -> o.secretAccessKey.asJson, "sessionToken" -> o.sessionToken.asJson)
  }
  final implicit val AcknowledgeJobOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeJobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val GetPipelineExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetPipelineExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecution" -> o.pipelineExecution.asJson)
  }
  final implicit val InvalidStructureExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidStructureException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineVersionNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineVersionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionDeclarationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "actionTypeId" -> o.actionTypeId.asJson, "roleArn" -> o.roleArn.asJson, "runOrder" -> o.runOrder.asJson, "configuration" -> o.configuration.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson)
  }
  final implicit val GetPipelineExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetPipelineExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val ErrorDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ErrorDetails] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "message" -> o.message.asJson)
  }
  final implicit val ApprovalAlreadyCompletedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ApprovalAlreadyCompletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePipelineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.CreatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ApprovalResultEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ApprovalResult] = io.circe.Encoder.instance { o => 
    Json.obj("summary" -> o.summary.asJson, "status" -> o.status.asJson)
  }
  final implicit val ThirdPartyJobDataEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobData] = io.circe.Encoder.instance { o => 
    Json.obj("actionConfiguration" -> o.actionConfiguration.asJson, "artifactCredentials" -> o.artifactCredentials.asJson, "encryptionKey" -> o.encryptionKey.asJson, "actionTypeId" -> o.actionTypeId.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson, "continuationToken" -> o.continuationToken.asJson, "pipelineContext" -> o.pipelineContext.asJson)
  }
  final implicit val ActionRevisionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionRevision] = io.circe.Encoder.instance { o => 
    Json.obj("revisionId" -> o.revisionId.asJson, "revisionChangeId" -> o.revisionChangeId.asJson, "created" -> o.created.asJson)
  }
  final implicit val StageContextEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StageContext] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val PipelineMetadataEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineArn" -> o.pipelineArn.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val PutJobFailureResultInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutJobFailureResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "failureDetails" -> o.failureDetails.asJson)
  }
  final implicit val PutApprovalResultInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutApprovalResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("stageName" -> o.stageName.asJson, "pipelineName" -> o.pipelineName.asJson, "actionName" -> o.actionName.asJson, "result" -> o.result.asJson, "token" -> o.token.asJson)
  }
  final implicit val DisableStageTransitionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.DisableStageTransitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "transitionType" -> o.transitionType.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val ListActionTypesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ListActionTypesInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionOwnerFilter" -> o.actionOwnerFilter.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidActionDeclarationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidActionDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetThirdPartyJobDetailsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetThirdPartyJobDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "clientToken" -> o.clientToken.asJson)
  }
  final implicit val JobNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.JobNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionStateEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionState] = io.circe.Encoder.instance { o => 
    Json.obj("actionName" -> o.actionName.asJson, "currentRevision" -> o.currentRevision.asJson, "latestExecution" -> o.latestExecution.asJson, "entityUrl" -> o.entityUrl.asJson, "revisionUrl" -> o.revisionUrl.asJson)
  }
  final implicit val ActionConfigurationPropertyEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "required" -> o.required.asJson, "key" -> o.key.asJson, "secret" -> o.secret.asJson, "queryable" -> o.queryable.asJson, "description" -> o.description.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val JobDataEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.JobData] = io.circe.Encoder.instance { o => 
    Json.obj("actionConfiguration" -> o.actionConfiguration.asJson, "artifactCredentials" -> o.artifactCredentials.asJson, "encryptionKey" -> o.encryptionKey.asJson, "actionTypeId" -> o.actionTypeId.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson, "continuationToken" -> o.continuationToken.asJson, "pipelineContext" -> o.pipelineContext.asJson)
  }
  final implicit val EncryptionKeyEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.EncryptionKey] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val PutThirdPartyJobSuccessResultInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutThirdPartyJobSuccessResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("clientToken" -> o.clientToken.asJson, "jobId" -> o.jobId.asJson, "currentRevision" -> o.currentRevision.asJson, "continuationToken" -> o.continuationToken.asJson, "executionDetails" -> o.executionDetails.asJson)
  }
  final implicit val GetPipelineStateOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetPipelineStateOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "pipelineVersion" -> o.pipelineVersion.asJson, "stageStates" -> o.stageStates.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val ActionTypeEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionType] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "inputArtifactDetails" -> o.inputArtifactDetails.asJson, "outputArtifactDetails" -> o.outputArtifactDetails.asJson, "settings" -> o.settings.asJson, "actionConfigurationProperties" -> o.actionConfigurationProperties.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StageDeclarationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.StageDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "actions" -> o.actions.asJson, "blockers" -> o.blockers.asJson)
  }
  final implicit val PipelineExecutionNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineExecutionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineExecutionSummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineExecutionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson, "status" -> o.status.asJson, "startTime" -> o.startTime.asJson, "lastUpdateTime" -> o.lastUpdateTime.asJson)
  }
  final implicit val S3ArtifactLocationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.S3ArtifactLocation] = io.circe.Encoder.instance { o => 
    Json.obj("bucketName" -> o.bucketName.asJson, "objectKey" -> o.objectKey.asJson)
  }
  final implicit val GetThirdPartyJobDetailsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetThirdPartyJobDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobDetails" -> o.jobDetails.asJson)
  }
  final implicit val PutActionRevisionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutActionRevisionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("newRevision" -> o.newRevision.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val ActionTypeIdEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionTypeId] = io.circe.Encoder.instance { o => 
    Json.obj("category" -> o.category.asJson, "owner" -> o.owner.asJson, "provider" -> o.provider.asJson, "version" -> o.version.asJson)
  }
  final implicit val DeleteCustomActionTypeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.DeleteCustomActionTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("category" -> o.category.asJson, "provider" -> o.provider.asJson, "version" -> o.version.asJson)
  }
  final implicit val GetPipelineStateInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetPipelineStateInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val PutApprovalResultOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutApprovalResultOutput] = io.circe.Encoder.instance { o => 
    Json.obj("approvedAt" -> o.approvedAt.asJson)
  }
  final implicit val ActionTypeSettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionTypeSettings] = io.circe.Encoder.instance { o => 
    Json.obj("thirdPartyConfigurationUrl" -> o.thirdPartyConfigurationUrl.asJson, "entityUrlTemplate" -> o.entityUrlTemplate.asJson, "executionUrlTemplate" -> o.executionUrlTemplate.asJson, "revisionUrlTemplate" -> o.revisionUrlTemplate.asJson)
  }
  final implicit val ListPipelineExecutionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ListPipelineExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListPipelineExecutionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ListPipelineExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionSummaries" -> o.pipelineExecutionSummaries.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidStageDeclarationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidStageDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ArtifactEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.Artifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "revision" -> o.revision.asJson, "location" -> o.location.asJson)
  }
  final implicit val OutputArtifactEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.OutputArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val GetPipelineOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetPipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson, "metadata" -> o.metadata.asJson)
  }
  final implicit val NotLatestPipelineExecutionExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.NotLatestPipelineExecutionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.CreatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val AcknowledgeThirdPartyJobInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeThirdPartyJobInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "nonce" -> o.nonce.asJson, "clientToken" -> o.clientToken.asJson)
  }
  final implicit val PipelineSummaryEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineSummary] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val RetryStageExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.RetryStageExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson, "retryMode" -> o.retryMode.asJson)
  }
  final implicit val UpdatePipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.UpdatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ExecutionDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ExecutionDetails] = io.circe.Encoder.instance { o => 
    Json.obj("summary" -> o.summary.asJson, "externalExecutionId" -> o.externalExecutionId.asJson, "percentComplete" -> o.percentComplete.asJson)
  }
  final implicit val ArtifactRevisionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ArtifactRevision] = io.circe.Encoder.instance { o => 
    Json.obj("created" -> o.created.asJson, "revisionUrl" -> o.revisionUrl.asJson, "revisionSummary" -> o.revisionSummary.asJson, "revisionChangeIdentifier" -> o.revisionChangeIdentifier.asJson, "revisionId" -> o.revisionId.asJson, "name" -> o.name.asJson)
  }
  final implicit val PollForThirdPartyJobsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PollForThirdPartyJobsInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypeId" -> o.actionTypeId.asJson, "maxBatchSize" -> o.maxBatchSize.asJson)
  }
  final implicit val PollForThirdPartyJobsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PollForThirdPartyJobsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson)
  }
  final implicit val PutThirdPartyJobFailureResultInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutThirdPartyJobFailureResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "clientToken" -> o.clientToken.asJson, "failureDetails" -> o.failureDetails.asJson)
  }
  final implicit val RetryStageExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.RetryStageExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val TransitionStateEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.TransitionState] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "lastChangedBy" -> o.lastChangedBy.asJson, "lastChangedAt" -> o.lastChangedAt.asJson, "disabledReason" -> o.disabledReason.asJson)
  }
  final implicit val PollForJobsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PollForJobsInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypeId" -> o.actionTypeId.asJson, "maxBatchSize" -> o.maxBatchSize.asJson, "queryParam" -> o.queryParam.asJson)
  }
  final implicit val PipelineDeclarationEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("roleArn" -> o.roleArn.asJson, "name" -> o.name.asJson, "stages" -> o.stages.asJson, "artifactStore" -> o.artifactStore.asJson, "version" -> o.version.asJson)
  }
  final implicit val InvalidJobStateExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.InvalidJobStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobDetailsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetJobDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson)
  }
  final implicit val GetPipelineInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.GetPipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson)
  }
  final implicit val ActionTypeNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionTypeNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ActionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineContextEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PipelineContext] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stage" -> o.stage.asJson, "action" -> o.action.asJson)
  }
  final implicit val FailureDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.FailureDetails] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "message" -> o.message.asJson, "externalExecutionId" -> o.externalExecutionId.asJson)
  }
  final implicit val ListPipelinesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ListPipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val ArtifactDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ArtifactDetails] = io.circe.Encoder.instance { o => 
    Json.obj("minimumCount" -> o.minimumCount.asJson, "maximumCount" -> o.maximumCount.asJson)
  }
  final implicit val PutActionRevisionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.PutActionRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "actionName" -> o.actionName.asJson, "actionRevision" -> o.actionRevision.asJson)
  }
  final implicit val ArtifactStoreEncoder: io.circe.Encoder[org.lyranthe.araethura.codepipeline.models.ArtifactStore] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "encryptionKey" -> o.encryptionKey.asJson)
  }
  final implicit val AcknowledgeThirdPartyJobOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeThirdPartyJobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("status").map(org.lyranthe.araethura.codepipeline.models.AcknowledgeThirdPartyJobOutput.apply _)
  }
  final implicit val PipelineNameInUseExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineNameInUseException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.PipelineNameInUseException)
  final implicit val GetJobDetailsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetJobDetailsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.JobDetails]]("jobDetails").map(org.lyranthe.araethura.codepipeline.models.GetJobDetailsOutput.apply _)
  }
  final implicit val BlockerDeclarationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.BlockerDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("type")).mapN(org.lyranthe.araethura.codepipeline.models.BlockerDeclaration.apply _)
  }
  final implicit val StartPipelineExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StartPipelineExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pipelineExecutionId").map(org.lyranthe.araethura.codepipeline.models.StartPipelineExecutionOutput.apply _)
  }
  final implicit val CreateCustomActionTypeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.CreateCustomActionTypeOutput] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.codepipeline.models.ActionType]("actionType").map(org.lyranthe.araethura.codepipeline.models.CreateCustomActionTypeOutput.apply _)
  }
  final implicit val ListPipelinesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ListPipelinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.PipelineSummary]]]("pipelines"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codepipeline.models.ListPipelinesOutput.apply _)
  }
  final implicit val AcknowledgeJobInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeJobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("nonce")).mapN(org.lyranthe.araethura.codepipeline.models.AcknowledgeJobInput.apply _)
  }
  final implicit val StageExecutionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StageExecution] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineExecutionId"), o.get[java.lang.String]("status")).mapN(org.lyranthe.araethura.codepipeline.models.StageExecution.apply _)
  }
  final implicit val StageNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StageNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.StageNotFoundException)
  final implicit val ActionConfigurationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("configuration").map(org.lyranthe.araethura.codepipeline.models.ActionConfiguration.apply _)
  }
  final implicit val InvalidNonceExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidNonceException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidNonceException)
  final implicit val PollForJobsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PollForJobsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Job]]]("jobs").map(org.lyranthe.araethura.codepipeline.models.PollForJobsOutput.apply _)
  }
  final implicit val InputArtifactDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InputArtifact] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.codepipeline.models.InputArtifact.apply _)
  }
  final implicit val InvalidApprovalTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidApprovalTokenException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidApprovalTokenException)
  final implicit val CreateCustomActionTypeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.CreateCustomActionTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("provider"), o.get[java.lang.String]("version"), o.get[org.lyranthe.araethura.codepipeline.models.ArtifactDetails]("inputArtifactDetails"), o.get[org.lyranthe.araethura.codepipeline.models.ArtifactDetails]("outputArtifactDetails"), o.get[java.lang.String]("category"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty]]]("configurationProperties"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeSettings]]("settings")).mapN(org.lyranthe.araethura.codepipeline.models.CreateCustomActionTypeInput.apply _)
  }
  final implicit val StageNotRetryableExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StageNotRetryableException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.StageNotRetryableException)
  final implicit val CurrentRevisionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.CurrentRevision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("revision"), o.get[java.lang.String]("changeIdentifier"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("revisionSummary")).mapN(org.lyranthe.araethura.codepipeline.models.CurrentRevision.apply _)
  }
  final implicit val JobDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.Job] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.JobData]]("data"), o.get[scala.Option[java.lang.String]]("nonce"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(org.lyranthe.araethura.codepipeline.models.Job.apply _)
  }
  final implicit val ThirdPartyJobDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobData]]("data"), o.get[scala.Option[java.lang.String]]("nonce")).mapN(org.lyranthe.araethura.codepipeline.models.ThirdPartyJobDetails.apply _)
  }
  final implicit val UpdatePipelineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.UpdatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration]]("pipeline").map(org.lyranthe.araethura.codepipeline.models.UpdatePipelineOutput.apply _)
  }
  final implicit val ListActionTypesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ListActionTypesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.codepipeline.models.ActionType]]("actionTypes"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codepipeline.models.ListActionTypesOutput.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ValidationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.ValidationException)
  final implicit val PipelineExecutionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ArtifactRevision]]]("artifactRevisions"), o.get[scala.Option[scala.Int]]("pipelineVersion"), o.get[scala.Option[java.lang.String]]("pipelineExecutionId")).mapN(org.lyranthe.araethura.codepipeline.models.PipelineExecution.apply _)
  }
  final implicit val EnableStageTransitionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.EnableStageTransitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("transitionType")).mapN(org.lyranthe.araethura.codepipeline.models.EnableStageTransitionInput.apply _)
  }
  final implicit val ArtifactLocationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ArtifactLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.S3ArtifactLocation]]("s3Location")).mapN(org.lyranthe.araethura.codepipeline.models.ArtifactLocation.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidNextTokenException)
  final implicit val InvalidBlockerDeclarationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidBlockerDeclarationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidBlockerDeclarationException)
  final implicit val StartPipelineExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StartPipelineExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.codepipeline.models.StartPipelineExecutionInput.apply _)
  }
  final implicit val InvalidClientTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidClientTokenException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidClientTokenException)
  final implicit val StageStateDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StageState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("stageName"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.TransitionState]]("inboundTransitionState"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ActionState]]]("actionStates"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.StageExecution]]("latestExecution")).mapN(org.lyranthe.araethura.codepipeline.models.StageState.apply _)
  }
  final implicit val JobDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.JobDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.JobData]]("data"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(org.lyranthe.araethura.codepipeline.models.JobDetails.apply _)
  }
  final implicit val InvalidJobExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidJobException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidJobException)
  final implicit val PutJobSuccessResultInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutJobSuccessResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.CurrentRevision]]("currentRevision"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ExecutionDetails]]("executionDetails")).mapN(org.lyranthe.araethura.codepipeline.models.PutJobSuccessResultInput.apply _)
  }
  final implicit val ActionContextDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(org.lyranthe.araethura.codepipeline.models.ActionContext.apply _)
  }
  final implicit val DeletePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.DeletePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.codepipeline.models.DeletePipelineInput.apply _)
  }
  final implicit val ActionExecutionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lastUpdatedBy"), o.get[scala.Option[java.time.Instant]]("lastStatusChange"), o.get[scala.Option[java.lang.String]]("summary"), o.get[scala.Option[java.lang.String]]("externalExecutionUrl"), o.get[scala.Option[java.lang.String]]("token"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ErrorDetails]]("errorDetails"), o.get[scala.Option[java.lang.String]]("externalExecutionId"), o.get[scala.Option[scala.Int]]("percentComplete")).mapN(org.lyranthe.araethura.codepipeline.models.ActionExecution.apply _)
  }
  final implicit val ThirdPartyJobDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ThirdPartyJob] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("clientId"), o.get[scala.Option[java.lang.String]]("jobId")).mapN(org.lyranthe.araethura.codepipeline.models.ThirdPartyJob.apply _)
  }
  final implicit val AWSSessionCredentialsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("accessKeyId"), o.get[java.lang.String]("secretAccessKey"), o.get[java.lang.String]("sessionToken")).mapN(org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials.apply _)
  }
  final implicit val AcknowledgeJobOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeJobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("status").map(org.lyranthe.araethura.codepipeline.models.AcknowledgeJobOutput.apply _)
  }
  final implicit val GetPipelineExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetPipelineExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineExecution]]("pipelineExecution").map(org.lyranthe.araethura.codepipeline.models.GetPipelineExecutionOutput.apply _)
  }
  final implicit val InvalidStructureExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidStructureException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidStructureException)
  final implicit val PipelineVersionNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineVersionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.PipelineVersionNotFoundException)
  final implicit val ActionDeclarationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[org.lyranthe.araethura.codepipeline.models.ActionTypeId]("actionTypeId"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[scala.Int]]("runOrder"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("configuration"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.InputArtifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.OutputArtifact]]]("outputArtifacts")).mapN(org.lyranthe.araethura.codepipeline.models.ActionDeclaration.apply _)
  }
  final implicit val GetPipelineExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetPipelineExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("pipelineExecutionId")).mapN(org.lyranthe.araethura.codepipeline.models.GetPipelineExecutionInput.apply _)
  }
  final implicit val ErrorDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ErrorDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("message")).mapN(org.lyranthe.araethura.codepipeline.models.ErrorDetails.apply _)
  }
  final implicit val ApprovalAlreadyCompletedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ApprovalAlreadyCompletedException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.ApprovalAlreadyCompletedException)
  final implicit val CreatePipelineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.CreatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration]]("pipeline").map(org.lyranthe.araethura.codepipeline.models.CreatePipelineOutput.apply _)
  }
  final implicit val ApprovalResultDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ApprovalResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("summary"), o.get[java.lang.String]("status")).mapN(org.lyranthe.araethura.codepipeline.models.ApprovalResult.apply _)
  }
  final implicit val ThirdPartyJobDataDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionConfiguration]]("actionConfiguration"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials]]("artifactCredentials"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.EncryptionKey]]("encryptionKey"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeId]]("actionTypeId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]]]("outputArtifacts"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineContext]]("pipelineContext")).mapN(org.lyranthe.araethura.codepipeline.models.ThirdPartyJobData.apply _)
  }
  final implicit val ActionRevisionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionRevision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("revisionId"), o.get[java.lang.String]("revisionChangeId"), o.get[java.time.Instant]("created")).mapN(org.lyranthe.araethura.codepipeline.models.ActionRevision.apply _)
  }
  final implicit val StageContextDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StageContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(org.lyranthe.araethura.codepipeline.models.StageContext.apply _)
  }
  final implicit val PipelineMetadataDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineArn"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(org.lyranthe.araethura.codepipeline.models.PipelineMetadata.apply _)
  }
  final implicit val PutJobFailureResultInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutJobFailureResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[org.lyranthe.araethura.codepipeline.models.FailureDetails]("failureDetails")).mapN(org.lyranthe.araethura.codepipeline.models.PutJobFailureResultInput.apply _)
  }
  final implicit val PutApprovalResultInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutApprovalResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stageName"), o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("actionName"), o.get[org.lyranthe.araethura.codepipeline.models.ApprovalResult]("result"), o.get[java.lang.String]("token")).mapN(org.lyranthe.araethura.codepipeline.models.PutApprovalResultInput.apply _)
  }
  final implicit val DisableStageTransitionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.DisableStageTransitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("transitionType"), o.get[java.lang.String]("reason")).mapN(org.lyranthe.araethura.codepipeline.models.DisableStageTransitionInput.apply _)
  }
  final implicit val ListActionTypesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ListActionTypesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionOwnerFilter"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codepipeline.models.ListActionTypesInput.apply _)
  }
  final implicit val InvalidActionDeclarationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidActionDeclarationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidActionDeclarationException)
  final implicit val GetThirdPartyJobDetailsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetThirdPartyJobDetailsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("clientToken")).mapN(org.lyranthe.araethura.codepipeline.models.GetThirdPartyJobDetailsInput.apply _)
  }
  final implicit val JobNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.JobNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.JobNotFoundException)
  final implicit val ActionStateDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionName"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionRevision]]("currentRevision"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionExecution]]("latestExecution"), o.get[scala.Option[java.lang.String]]("entityUrl"), o.get[scala.Option[java.lang.String]]("revisionUrl")).mapN(org.lyranthe.araethura.codepipeline.models.ActionState.apply _)
  }
  final implicit val ActionConfigurationPropertyDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Boolean]("required"), o.get[scala.Boolean]("key"), o.get[scala.Boolean]("secret"), o.get[scala.Option[scala.Boolean]]("queryable"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("type")).mapN(org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty.apply _)
  }
  final implicit val JobDataDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.JobData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionConfiguration]]("actionConfiguration"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials]]("artifactCredentials"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.EncryptionKey]]("encryptionKey"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeId]]("actionTypeId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]]]("outputArtifacts"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineContext]]("pipelineContext")).mapN(org.lyranthe.araethura.codepipeline.models.JobData.apply _)
  }
  final implicit val EncryptionKeyDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.EncryptionKey] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("type")).mapN(org.lyranthe.araethura.codepipeline.models.EncryptionKey.apply _)
  }
  final implicit val PutThirdPartyJobSuccessResultInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutThirdPartyJobSuccessResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("clientToken"), o.get[java.lang.String]("jobId"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.CurrentRevision]]("currentRevision"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ExecutionDetails]]("executionDetails")).mapN(org.lyranthe.araethura.codepipeline.models.PutThirdPartyJobSuccessResultInput.apply _)
  }
  final implicit val GetPipelineStateOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetPipelineStateOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[scala.Int]]("pipelineVersion"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.StageState]]]("stageStates"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(org.lyranthe.araethura.codepipeline.models.GetPipelineStateOutput.apply _)
  }
  final implicit val ActionTypeDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionType] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.codepipeline.models.ActionTypeId]("id"), o.get[org.lyranthe.araethura.codepipeline.models.ArtifactDetails]("inputArtifactDetails"), o.get[org.lyranthe.araethura.codepipeline.models.ArtifactDetails]("outputArtifactDetails"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeSettings]]("settings"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty]]]("actionConfigurationProperties")).mapN(org.lyranthe.araethura.codepipeline.models.ActionType.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.LimitExceededException)
  final implicit val StageDeclarationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.StageDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.List[org.lyranthe.araethura.codepipeline.models.ActionDeclaration]]("actions"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.BlockerDeclaration]]]("blockers")).mapN(org.lyranthe.araethura.codepipeline.models.StageDeclaration.apply _)
  }
  final implicit val PipelineExecutionNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineExecutionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.PipelineExecutionNotFoundException)
  final implicit val PipelineExecutionSummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineExecutionSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineExecutionId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("lastUpdateTime")).mapN(org.lyranthe.araethura.codepipeline.models.PipelineExecutionSummary.apply _)
  }
  final implicit val S3ArtifactLocationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.S3ArtifactLocation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("bucketName"), o.get[java.lang.String]("objectKey")).mapN(org.lyranthe.araethura.codepipeline.models.S3ArtifactLocation.apply _)
  }
  final implicit val GetThirdPartyJobDetailsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetThirdPartyJobDetailsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobDetails]]("jobDetails").map(org.lyranthe.araethura.codepipeline.models.GetThirdPartyJobDetailsOutput.apply _)
  }
  final implicit val PutActionRevisionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutActionRevisionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("newRevision"), o.get[scala.Option[java.lang.String]]("pipelineExecutionId")).mapN(org.lyranthe.araethura.codepipeline.models.PutActionRevisionOutput.apply _)
  }
  final implicit val ActionTypeIdDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionTypeId] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("category"), o.get[java.lang.String]("owner"), o.get[java.lang.String]("provider"), o.get[java.lang.String]("version")).mapN(org.lyranthe.araethura.codepipeline.models.ActionTypeId.apply _)
  }
  final implicit val DeleteCustomActionTypeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.DeleteCustomActionTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("category"), o.get[java.lang.String]("provider"), o.get[java.lang.String]("version")).mapN(org.lyranthe.araethura.codepipeline.models.DeleteCustomActionTypeInput.apply _)
  }
  final implicit val GetPipelineStateInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetPipelineStateInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.codepipeline.models.GetPipelineStateInput.apply _)
  }
  final implicit val PutApprovalResultOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutApprovalResultOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.time.Instant]]("approvedAt").map(org.lyranthe.araethura.codepipeline.models.PutApprovalResultOutput.apply _)
  }
  final implicit val ActionTypeSettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionTypeSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("thirdPartyConfigurationUrl"), o.get[scala.Option[java.lang.String]]("entityUrlTemplate"), o.get[scala.Option[java.lang.String]]("executionUrlTemplate"), o.get[scala.Option[java.lang.String]]("revisionUrlTemplate")).mapN(org.lyranthe.araethura.codepipeline.models.ActionTypeSettings.apply _)
  }
  final implicit val ListPipelineExecutionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ListPipelineExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codepipeline.models.ListPipelineExecutionsInput.apply _)
  }
  final implicit val ListPipelineExecutionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ListPipelineExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.PipelineExecutionSummary]]]("pipelineExecutionSummaries"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codepipeline.models.ListPipelineExecutionsOutput.apply _)
  }
  final implicit val InvalidStageDeclarationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidStageDeclarationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidStageDeclarationException)
  final implicit val ArtifactDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.Artifact] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("revision"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ArtifactLocation]]("location")).mapN(org.lyranthe.araethura.codepipeline.models.Artifact.apply _)
  }
  final implicit val OutputArtifactDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.OutputArtifact] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.codepipeline.models.OutputArtifact.apply _)
  }
  final implicit val GetPipelineOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetPipelineOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration]]("pipeline"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineMetadata]]("metadata")).mapN(org.lyranthe.araethura.codepipeline.models.GetPipelineOutput.apply _)
  }
  final implicit val NotLatestPipelineExecutionExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.NotLatestPipelineExecutionException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.NotLatestPipelineExecutionException)
  final implicit val CreatePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.CreatePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration]("pipeline").map(org.lyranthe.araethura.codepipeline.models.CreatePipelineInput.apply _)
  }
  final implicit val AcknowledgeThirdPartyJobInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.AcknowledgeThirdPartyJobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("nonce"), o.get[java.lang.String]("clientToken")).mapN(org.lyranthe.araethura.codepipeline.models.AcknowledgeThirdPartyJobInput.apply _)
  }
  final implicit val PipelineSummaryDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Int]]("version"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(org.lyranthe.araethura.codepipeline.models.PipelineSummary.apply _)
  }
  final implicit val RetryStageExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.RetryStageExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("pipelineExecutionId"), o.get[java.lang.String]("retryMode")).mapN(org.lyranthe.araethura.codepipeline.models.RetryStageExecutionInput.apply _)
  }
  final implicit val UpdatePipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.UpdatePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration]("pipeline").map(org.lyranthe.araethura.codepipeline.models.UpdatePipelineInput.apply _)
  }
  final implicit val ExecutionDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ExecutionDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("summary"), o.get[scala.Option[java.lang.String]]("externalExecutionId"), o.get[scala.Option[scala.Int]]("percentComplete")).mapN(org.lyranthe.araethura.codepipeline.models.ExecutionDetails.apply _)
  }
  final implicit val ArtifactRevisionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ArtifactRevision] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("revisionUrl"), o.get[scala.Option[java.lang.String]]("revisionSummary"), o.get[scala.Option[java.lang.String]]("revisionChangeIdentifier"), o.get[scala.Option[java.lang.String]]("revisionId"), o.get[scala.Option[java.lang.String]]("name")).mapN(org.lyranthe.araethura.codepipeline.models.ArtifactRevision.apply _)
  }
  final implicit val PollForThirdPartyJobsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PollForThirdPartyJobsInput] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.codepipeline.models.ActionTypeId]("actionTypeId"), o.get[scala.Option[scala.Int]]("maxBatchSize")).mapN(org.lyranthe.araethura.codepipeline.models.PollForThirdPartyJobsInput.apply _)
  }
  final implicit val PollForThirdPartyJobsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PollForThirdPartyJobsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ThirdPartyJob]]]("jobs").map(org.lyranthe.araethura.codepipeline.models.PollForThirdPartyJobsOutput.apply _)
  }
  final implicit val PutThirdPartyJobFailureResultInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutThirdPartyJobFailureResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("clientToken"), o.get[org.lyranthe.araethura.codepipeline.models.FailureDetails]("failureDetails")).mapN(org.lyranthe.araethura.codepipeline.models.PutThirdPartyJobFailureResultInput.apply _)
  }
  final implicit val RetryStageExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.RetryStageExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pipelineExecutionId").map(org.lyranthe.araethura.codepipeline.models.RetryStageExecutionOutput.apply _)
  }
  final implicit val TransitionStateDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.TransitionState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[java.lang.String]]("lastChangedBy"), o.get[scala.Option[java.time.Instant]]("lastChangedAt"), o.get[scala.Option[java.lang.String]]("disabledReason")).mapN(org.lyranthe.araethura.codepipeline.models.TransitionState.apply _)
  }
  final implicit val PollForJobsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PollForJobsInput] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.codepipeline.models.ActionTypeId]("actionTypeId"), o.get[scala.Option[scala.Int]]("maxBatchSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("queryParam")).mapN(org.lyranthe.araethura.codepipeline.models.PollForJobsInput.apply _)
  }
  final implicit val PipelineDeclarationDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("roleArn"), o.get[java.lang.String]("name"), o.get[scala.List[org.lyranthe.araethura.codepipeline.models.StageDeclaration]]("stages"), o.get[org.lyranthe.araethura.codepipeline.models.ArtifactStore]("artifactStore"), o.get[scala.Option[scala.Int]]("version")).mapN(org.lyranthe.araethura.codepipeline.models.PipelineDeclaration.apply _)
  }
  final implicit val InvalidJobStateExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.InvalidJobStateException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.InvalidJobStateException)
  final implicit val GetJobDetailsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetJobDetailsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("jobId").map(org.lyranthe.araethura.codepipeline.models.GetJobDetailsInput.apply _)
  }
  final implicit val GetPipelineInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.GetPipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[scala.Int]]("version")).mapN(org.lyranthe.araethura.codepipeline.models.GetPipelineInput.apply _)
  }
  final implicit val ActionTypeNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionTypeNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.ActionTypeNotFoundException)
  final implicit val ActionNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ActionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.ActionNotFoundException)
  final implicit val PipelineNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codepipeline.models.PipelineNotFoundException)
  final implicit val PipelineContextDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PipelineContext] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.StageContext]]("stage"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.ActionContext]]("action")).mapN(org.lyranthe.araethura.codepipeline.models.PipelineContext.apply _)
  }
  final implicit val FailureDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.FailureDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[java.lang.String]("message"), o.get[scala.Option[java.lang.String]]("externalExecutionId")).mapN(org.lyranthe.araethura.codepipeline.models.FailureDetails.apply _)
  }
  final implicit val ListPipelinesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ListPipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(org.lyranthe.araethura.codepipeline.models.ListPipelinesInput.apply _)
  }
  final implicit val ArtifactDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ArtifactDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("minimumCount"), o.get[scala.Int]("maximumCount")).mapN(org.lyranthe.araethura.codepipeline.models.ArtifactDetails.apply _)
  }
  final implicit val PutActionRevisionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.PutActionRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("actionName"), o.get[org.lyranthe.araethura.codepipeline.models.ActionRevision]("actionRevision")).mapN(org.lyranthe.araethura.codepipeline.models.PutActionRevisionInput.apply _)
  }
  final implicit val ArtifactStoreDecoder: io.circe.Decoder[org.lyranthe.araethura.codepipeline.models.ArtifactStore] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[java.lang.String]("location"), o.get[scala.Option[org.lyranthe.araethura.codepipeline.models.EncryptionKey]]("encryptionKey")).mapN(org.lyranthe.araethura.codepipeline.models.ArtifactStore.apply _)
  }
}