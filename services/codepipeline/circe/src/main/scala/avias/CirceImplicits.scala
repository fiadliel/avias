package avias.codepipeline
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val AcknowledgeThirdPartyJobOutputEncoder: io.circe.Encoder[avias.codepipeline.models.AcknowledgeThirdPartyJobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val PipelineNameInUseExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineNameInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobDetailsOutputEncoder: io.circe.Encoder[avias.codepipeline.models.GetJobDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobDetails" -> o.jobDetails.asJson)
  }
  final implicit val BlockerDeclarationEncoder: io.circe.Encoder[avias.codepipeline.models.BlockerDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val StartPipelineExecutionOutputEncoder: io.circe.Encoder[avias.codepipeline.models.StartPipelineExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val CreateCustomActionTypeOutputEncoder: io.circe.Encoder[avias.codepipeline.models.CreateCustomActionTypeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("actionType" -> o.actionType.asJson)
  }
  final implicit val ListPipelinesOutputEncoder: io.circe.Encoder[avias.codepipeline.models.ListPipelinesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelines" -> o.pipelines.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AcknowledgeJobInputEncoder: io.circe.Encoder[avias.codepipeline.models.AcknowledgeJobInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "nonce" -> o.nonce.asJson)
  }
  final implicit val StageExecutionEncoder: io.circe.Encoder[avias.codepipeline.models.StageExecution] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson, "status" -> o.status.asJson)
  }
  final implicit val StageNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.StageNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionConfigurationEncoder: io.circe.Encoder[avias.codepipeline.models.ActionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("configuration" -> o.configuration.asJson)
  }
  final implicit val InvalidNonceExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidNonceException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PollForJobsOutputEncoder: io.circe.Encoder[avias.codepipeline.models.PollForJobsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson)
  }
  final implicit val InputArtifactEncoder: io.circe.Encoder[avias.codepipeline.models.InputArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val InvalidApprovalTokenExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidApprovalTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateCustomActionTypeInputEncoder: io.circe.Encoder[avias.codepipeline.models.CreateCustomActionTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("provider" -> o.provider.asJson, "version" -> o.version.asJson, "inputArtifactDetails" -> o.inputArtifactDetails.asJson, "outputArtifactDetails" -> o.outputArtifactDetails.asJson, "category" -> o.category.asJson, "configurationProperties" -> o.configurationProperties.asJson, "settings" -> o.settings.asJson)
  }
  final implicit val StageNotRetryableExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.StageNotRetryableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CurrentRevisionEncoder: io.circe.Encoder[avias.codepipeline.models.CurrentRevision] = io.circe.Encoder.instance { o => 
    Json.obj("revision" -> o.revision.asJson, "changeIdentifier" -> o.changeIdentifier.asJson, "created" -> o.created.asJson, "revisionSummary" -> o.revisionSummary.asJson)
  }
  final implicit val JobEncoder: io.circe.Encoder[avias.codepipeline.models.Job] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "nonce" -> o.nonce.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val ThirdPartyJobDetailsEncoder: io.circe.Encoder[avias.codepipeline.models.ThirdPartyJobDetails] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "nonce" -> o.nonce.asJson)
  }
  final implicit val UpdatePipelineOutputEncoder: io.circe.Encoder[avias.codepipeline.models.UpdatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ListActionTypesOutputEncoder: io.circe.Encoder[avias.codepipeline.models.ListActionTypesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypes" -> o.actionTypes.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.ValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineExecutionEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineExecution] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "status" -> o.status.asJson, "artifactRevisions" -> o.artifactRevisions.asJson, "pipelineVersion" -> o.pipelineVersion.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val EnableStageTransitionInputEncoder: io.circe.Encoder[avias.codepipeline.models.EnableStageTransitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "transitionType" -> o.transitionType.asJson)
  }
  final implicit val ArtifactLocationEncoder: io.circe.Encoder[avias.codepipeline.models.ArtifactLocation] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "s3Location" -> o.s3Location.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidBlockerDeclarationExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidBlockerDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartPipelineExecutionInputEncoder: io.circe.Encoder[avias.codepipeline.models.StartPipelineExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val InvalidClientTokenExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidClientTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StageStateEncoder: io.circe.Encoder[avias.codepipeline.models.StageState] = io.circe.Encoder.instance { o => 
    Json.obj("stageName" -> o.stageName.asJson, "inboundTransitionState" -> o.inboundTransitionState.asJson, "actionStates" -> o.actionStates.asJson, "latestExecution" -> o.latestExecution.asJson)
  }
  final implicit val JobDetailsEncoder: io.circe.Encoder[avias.codepipeline.models.JobDetails] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "data" -> o.data.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val InvalidJobExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidJobException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutJobSuccessResultInputEncoder: io.circe.Encoder[avias.codepipeline.models.PutJobSuccessResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "currentRevision" -> o.currentRevision.asJson, "continuationToken" -> o.continuationToken.asJson, "executionDetails" -> o.executionDetails.asJson)
  }
  final implicit val ActionContextEncoder: io.circe.Encoder[avias.codepipeline.models.ActionContext] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val DeletePipelineInputEncoder: io.circe.Encoder[avias.codepipeline.models.DeletePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val ActionExecutionEncoder: io.circe.Encoder[avias.codepipeline.models.ActionExecution] = io.circe.Encoder.instance { o => 
    Json.obj("lastUpdatedBy" -> o.lastUpdatedBy.asJson, "lastStatusChange" -> o.lastStatusChange.asJson, "summary" -> o.summary.asJson, "externalExecutionUrl" -> o.externalExecutionUrl.asJson, "token" -> o.token.asJson, "status" -> o.status.asJson, "errorDetails" -> o.errorDetails.asJson, "externalExecutionId" -> o.externalExecutionId.asJson, "percentComplete" -> o.percentComplete.asJson)
  }
  final implicit val ThirdPartyJobEncoder: io.circe.Encoder[avias.codepipeline.models.ThirdPartyJob] = io.circe.Encoder.instance { o => 
    Json.obj("clientId" -> o.clientId.asJson, "jobId" -> o.jobId.asJson)
  }
  final implicit val AWSSessionCredentialsEncoder: io.circe.Encoder[avias.codepipeline.models.AWSSessionCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("accessKeyId" -> o.accessKeyId.asJson, "secretAccessKey" -> o.secretAccessKey.asJson, "sessionToken" -> o.sessionToken.asJson)
  }
  final implicit val AcknowledgeJobOutputEncoder: io.circe.Encoder[avias.codepipeline.models.AcknowledgeJobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val GetPipelineExecutionOutputEncoder: io.circe.Encoder[avias.codepipeline.models.GetPipelineExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecution" -> o.pipelineExecution.asJson)
  }
  final implicit val InvalidStructureExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidStructureException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineVersionNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineVersionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionDeclarationEncoder: io.circe.Encoder[avias.codepipeline.models.ActionDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "actionTypeId" -> o.actionTypeId.asJson, "roleArn" -> o.roleArn.asJson, "runOrder" -> o.runOrder.asJson, "configuration" -> o.configuration.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson)
  }
  final implicit val GetPipelineExecutionInputEncoder: io.circe.Encoder[avias.codepipeline.models.GetPipelineExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val ErrorDetailsEncoder: io.circe.Encoder[avias.codepipeline.models.ErrorDetails] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "message" -> o.message.asJson)
  }
  final implicit val ApprovalAlreadyCompletedExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.ApprovalAlreadyCompletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePipelineOutputEncoder: io.circe.Encoder[avias.codepipeline.models.CreatePipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ApprovalResultEncoder: io.circe.Encoder[avias.codepipeline.models.ApprovalResult] = io.circe.Encoder.instance { o => 
    Json.obj("summary" -> o.summary.asJson, "status" -> o.status.asJson)
  }
  final implicit val ThirdPartyJobDataEncoder: io.circe.Encoder[avias.codepipeline.models.ThirdPartyJobData] = io.circe.Encoder.instance { o => 
    Json.obj("actionConfiguration" -> o.actionConfiguration.asJson, "artifactCredentials" -> o.artifactCredentials.asJson, "encryptionKey" -> o.encryptionKey.asJson, "actionTypeId" -> o.actionTypeId.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson, "continuationToken" -> o.continuationToken.asJson, "pipelineContext" -> o.pipelineContext.asJson)
  }
  final implicit val ActionRevisionEncoder: io.circe.Encoder[avias.codepipeline.models.ActionRevision] = io.circe.Encoder.instance { o => 
    Json.obj("revisionId" -> o.revisionId.asJson, "revisionChangeId" -> o.revisionChangeId.asJson, "created" -> o.created.asJson)
  }
  final implicit val StageContextEncoder: io.circe.Encoder[avias.codepipeline.models.StageContext] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val PipelineMetadataEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineArn" -> o.pipelineArn.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val PutJobFailureResultInputEncoder: io.circe.Encoder[avias.codepipeline.models.PutJobFailureResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "failureDetails" -> o.failureDetails.asJson)
  }
  final implicit val PutApprovalResultInputEncoder: io.circe.Encoder[avias.codepipeline.models.PutApprovalResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("stageName" -> o.stageName.asJson, "pipelineName" -> o.pipelineName.asJson, "actionName" -> o.actionName.asJson, "result" -> o.result.asJson, "token" -> o.token.asJson)
  }
  final implicit val DisableStageTransitionInputEncoder: io.circe.Encoder[avias.codepipeline.models.DisableStageTransitionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "transitionType" -> o.transitionType.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val ListActionTypesInputEncoder: io.circe.Encoder[avias.codepipeline.models.ListActionTypesInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionOwnerFilter" -> o.actionOwnerFilter.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidActionDeclarationExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidActionDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetThirdPartyJobDetailsInputEncoder: io.circe.Encoder[avias.codepipeline.models.GetThirdPartyJobDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "clientToken" -> o.clientToken.asJson)
  }
  final implicit val JobNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.JobNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionStateEncoder: io.circe.Encoder[avias.codepipeline.models.ActionState] = io.circe.Encoder.instance { o => 
    Json.obj("actionName" -> o.actionName.asJson, "currentRevision" -> o.currentRevision.asJson, "latestExecution" -> o.latestExecution.asJson, "entityUrl" -> o.entityUrl.asJson, "revisionUrl" -> o.revisionUrl.asJson)
  }
  final implicit val ActionConfigurationPropertyEncoder: io.circe.Encoder[avias.codepipeline.models.ActionConfigurationProperty] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "required" -> o.required.asJson, "key" -> o.key.asJson, "secret" -> o.secret.asJson, "queryable" -> o.queryable.asJson, "description" -> o.description.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val JobDataEncoder: io.circe.Encoder[avias.codepipeline.models.JobData] = io.circe.Encoder.instance { o => 
    Json.obj("actionConfiguration" -> o.actionConfiguration.asJson, "artifactCredentials" -> o.artifactCredentials.asJson, "encryptionKey" -> o.encryptionKey.asJson, "actionTypeId" -> o.actionTypeId.asJson, "inputArtifacts" -> o.inputArtifacts.asJson, "outputArtifacts" -> o.outputArtifacts.asJson, "continuationToken" -> o.continuationToken.asJson, "pipelineContext" -> o.pipelineContext.asJson)
  }
  final implicit val EncryptionKeyEncoder: io.circe.Encoder[avias.codepipeline.models.EncryptionKey] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val PutThirdPartyJobSuccessResultInputEncoder: io.circe.Encoder[avias.codepipeline.models.PutThirdPartyJobSuccessResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("clientToken" -> o.clientToken.asJson, "jobId" -> o.jobId.asJson, "currentRevision" -> o.currentRevision.asJson, "continuationToken" -> o.continuationToken.asJson, "executionDetails" -> o.executionDetails.asJson)
  }
  final implicit val GetPipelineStateOutputEncoder: io.circe.Encoder[avias.codepipeline.models.GetPipelineStateOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "pipelineVersion" -> o.pipelineVersion.asJson, "stageStates" -> o.stageStates.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val ActionTypeEncoder: io.circe.Encoder[avias.codepipeline.models.ActionType] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "inputArtifactDetails" -> o.inputArtifactDetails.asJson, "outputArtifactDetails" -> o.outputArtifactDetails.asJson, "settings" -> o.settings.asJson, "actionConfigurationProperties" -> o.actionConfigurationProperties.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StageDeclarationEncoder: io.circe.Encoder[avias.codepipeline.models.StageDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "actions" -> o.actions.asJson, "blockers" -> o.blockers.asJson)
  }
  final implicit val PipelineExecutionNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineExecutionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineExecutionSummaryEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineExecutionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson, "status" -> o.status.asJson, "startTime" -> o.startTime.asJson, "lastUpdateTime" -> o.lastUpdateTime.asJson)
  }
  final implicit val S3ArtifactLocationEncoder: io.circe.Encoder[avias.codepipeline.models.S3ArtifactLocation] = io.circe.Encoder.instance { o => 
    Json.obj("bucketName" -> o.bucketName.asJson, "objectKey" -> o.objectKey.asJson)
  }
  final implicit val GetThirdPartyJobDetailsOutputEncoder: io.circe.Encoder[avias.codepipeline.models.GetThirdPartyJobDetailsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobDetails" -> o.jobDetails.asJson)
  }
  final implicit val PutActionRevisionOutputEncoder: io.circe.Encoder[avias.codepipeline.models.PutActionRevisionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("newRevision" -> o.newRevision.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val ActionTypeIdEncoder: io.circe.Encoder[avias.codepipeline.models.ActionTypeId] = io.circe.Encoder.instance { o => 
    Json.obj("category" -> o.category.asJson, "owner" -> o.owner.asJson, "provider" -> o.provider.asJson, "version" -> o.version.asJson)
  }
  final implicit val DeleteCustomActionTypeInputEncoder: io.circe.Encoder[avias.codepipeline.models.DeleteCustomActionTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("category" -> o.category.asJson, "provider" -> o.provider.asJson, "version" -> o.version.asJson)
  }
  final implicit val GetPipelineStateInputEncoder: io.circe.Encoder[avias.codepipeline.models.GetPipelineStateInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val PutApprovalResultOutputEncoder: io.circe.Encoder[avias.codepipeline.models.PutApprovalResultOutput] = io.circe.Encoder.instance { o => 
    Json.obj("approvedAt" -> o.approvedAt.asJson)
  }
  final implicit val ActionTypeSettingsEncoder: io.circe.Encoder[avias.codepipeline.models.ActionTypeSettings] = io.circe.Encoder.instance { o => 
    Json.obj("thirdPartyConfigurationUrl" -> o.thirdPartyConfigurationUrl.asJson, "entityUrlTemplate" -> o.entityUrlTemplate.asJson, "executionUrlTemplate" -> o.executionUrlTemplate.asJson, "revisionUrlTemplate" -> o.revisionUrlTemplate.asJson)
  }
  final implicit val ListPipelineExecutionsInputEncoder: io.circe.Encoder[avias.codepipeline.models.ListPipelineExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListPipelineExecutionsOutputEncoder: io.circe.Encoder[avias.codepipeline.models.ListPipelineExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionSummaries" -> o.pipelineExecutionSummaries.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidStageDeclarationExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidStageDeclarationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ArtifactEncoder: io.circe.Encoder[avias.codepipeline.models.Artifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "revision" -> o.revision.asJson, "location" -> o.location.asJson)
  }
  final implicit val OutputArtifactEncoder: io.circe.Encoder[avias.codepipeline.models.OutputArtifact] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val GetPipelineOutputEncoder: io.circe.Encoder[avias.codepipeline.models.GetPipelineOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson, "metadata" -> o.metadata.asJson)
  }
  final implicit val NotLatestPipelineExecutionExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.NotLatestPipelineExecutionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreatePipelineInputEncoder: io.circe.Encoder[avias.codepipeline.models.CreatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val AcknowledgeThirdPartyJobInputEncoder: io.circe.Encoder[avias.codepipeline.models.AcknowledgeThirdPartyJobInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "nonce" -> o.nonce.asJson, "clientToken" -> o.clientToken.asJson)
  }
  final implicit val PipelineSummaryEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineSummary] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson, "created" -> o.created.asJson, "updated" -> o.updated.asJson)
  }
  final implicit val RetryStageExecutionInputEncoder: io.circe.Encoder[avias.codepipeline.models.RetryStageExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "pipelineExecutionId" -> o.pipelineExecutionId.asJson, "retryMode" -> o.retryMode.asJson)
  }
  final implicit val UpdatePipelineInputEncoder: io.circe.Encoder[avias.codepipeline.models.UpdatePipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipeline" -> o.pipeline.asJson)
  }
  final implicit val ExecutionDetailsEncoder: io.circe.Encoder[avias.codepipeline.models.ExecutionDetails] = io.circe.Encoder.instance { o => 
    Json.obj("summary" -> o.summary.asJson, "externalExecutionId" -> o.externalExecutionId.asJson, "percentComplete" -> o.percentComplete.asJson)
  }
  final implicit val ArtifactRevisionEncoder: io.circe.Encoder[avias.codepipeline.models.ArtifactRevision] = io.circe.Encoder.instance { o => 
    Json.obj("created" -> o.created.asJson, "revisionUrl" -> o.revisionUrl.asJson, "revisionSummary" -> o.revisionSummary.asJson, "revisionChangeIdentifier" -> o.revisionChangeIdentifier.asJson, "revisionId" -> o.revisionId.asJson, "name" -> o.name.asJson)
  }
  final implicit val PollForThirdPartyJobsInputEncoder: io.circe.Encoder[avias.codepipeline.models.PollForThirdPartyJobsInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypeId" -> o.actionTypeId.asJson, "maxBatchSize" -> o.maxBatchSize.asJson)
  }
  final implicit val PollForThirdPartyJobsOutputEncoder: io.circe.Encoder[avias.codepipeline.models.PollForThirdPartyJobsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson)
  }
  final implicit val PutThirdPartyJobFailureResultInputEncoder: io.circe.Encoder[avias.codepipeline.models.PutThirdPartyJobFailureResultInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson, "clientToken" -> o.clientToken.asJson, "failureDetails" -> o.failureDetails.asJson)
  }
  final implicit val RetryStageExecutionOutputEncoder: io.circe.Encoder[avias.codepipeline.models.RetryStageExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineExecutionId" -> o.pipelineExecutionId.asJson)
  }
  final implicit val TransitionStateEncoder: io.circe.Encoder[avias.codepipeline.models.TransitionState] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "lastChangedBy" -> o.lastChangedBy.asJson, "lastChangedAt" -> o.lastChangedAt.asJson, "disabledReason" -> o.disabledReason.asJson)
  }
  final implicit val PollForJobsInputEncoder: io.circe.Encoder[avias.codepipeline.models.PollForJobsInput] = io.circe.Encoder.instance { o => 
    Json.obj("actionTypeId" -> o.actionTypeId.asJson, "maxBatchSize" -> o.maxBatchSize.asJson, "queryParam" -> o.queryParam.asJson)
  }
  final implicit val PipelineDeclarationEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineDeclaration] = io.circe.Encoder.instance { o => 
    Json.obj("roleArn" -> o.roleArn.asJson, "name" -> o.name.asJson, "stages" -> o.stages.asJson, "artifactStore" -> o.artifactStore.asJson, "version" -> o.version.asJson)
  }
  final implicit val InvalidJobStateExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.InvalidJobStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobDetailsInputEncoder: io.circe.Encoder[avias.codepipeline.models.GetJobDetailsInput] = io.circe.Encoder.instance { o => 
    Json.obj("jobId" -> o.jobId.asJson)
  }
  final implicit val GetPipelineInputEncoder: io.circe.Encoder[avias.codepipeline.models.GetPipelineInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "version" -> o.version.asJson)
  }
  final implicit val ActionTypeNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.ActionTypeNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActionNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.ActionNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineNotFoundExceptionEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PipelineContextEncoder: io.circe.Encoder[avias.codepipeline.models.PipelineContext] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stage" -> o.stage.asJson, "action" -> o.action.asJson)
  }
  final implicit val FailureDetailsEncoder: io.circe.Encoder[avias.codepipeline.models.FailureDetails] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "message" -> o.message.asJson, "externalExecutionId" -> o.externalExecutionId.asJson)
  }
  final implicit val ListPipelinesInputEncoder: io.circe.Encoder[avias.codepipeline.models.ListPipelinesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val ArtifactDetailsEncoder: io.circe.Encoder[avias.codepipeline.models.ArtifactDetails] = io.circe.Encoder.instance { o => 
    Json.obj("minimumCount" -> o.minimumCount.asJson, "maximumCount" -> o.maximumCount.asJson)
  }
  final implicit val PutActionRevisionInputEncoder: io.circe.Encoder[avias.codepipeline.models.PutActionRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pipelineName" -> o.pipelineName.asJson, "stageName" -> o.stageName.asJson, "actionName" -> o.actionName.asJson, "actionRevision" -> o.actionRevision.asJson)
  }
  final implicit val ArtifactStoreEncoder: io.circe.Encoder[avias.codepipeline.models.ArtifactStore] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "encryptionKey" -> o.encryptionKey.asJson)
  }
  final implicit val AcknowledgeThirdPartyJobOutputDecoder: io.circe.Decoder[avias.codepipeline.models.AcknowledgeThirdPartyJobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("status").map(avias.codepipeline.models.AcknowledgeThirdPartyJobOutput.apply _)
  }
  final implicit val PipelineNameInUseExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineNameInUseException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.PipelineNameInUseException)
  final implicit val GetJobDetailsOutputDecoder: io.circe.Decoder[avias.codepipeline.models.GetJobDetailsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codepipeline.models.JobDetails]]("jobDetails").map(avias.codepipeline.models.GetJobDetailsOutput.apply _)
  }
  final implicit val BlockerDeclarationDecoder: io.circe.Decoder[avias.codepipeline.models.BlockerDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("type")).mapN(avias.codepipeline.models.BlockerDeclaration.apply _)
  }
  final implicit val StartPipelineExecutionOutputDecoder: io.circe.Decoder[avias.codepipeline.models.StartPipelineExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pipelineExecutionId").map(avias.codepipeline.models.StartPipelineExecutionOutput.apply _)
  }
  final implicit val CreateCustomActionTypeOutputDecoder: io.circe.Decoder[avias.codepipeline.models.CreateCustomActionTypeOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codepipeline.models.ActionType]("actionType").map(avias.codepipeline.models.CreateCustomActionTypeOutput.apply _)
  }
  final implicit val ListPipelinesOutputDecoder: io.circe.Decoder[avias.codepipeline.models.ListPipelinesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codepipeline.models.PipelineSummary]]]("pipelines"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codepipeline.models.ListPipelinesOutput.apply _)
  }
  final implicit val AcknowledgeJobInputDecoder: io.circe.Decoder[avias.codepipeline.models.AcknowledgeJobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("nonce")).mapN(avias.codepipeline.models.AcknowledgeJobInput.apply _)
  }
  final implicit val StageExecutionDecoder: io.circe.Decoder[avias.codepipeline.models.StageExecution] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineExecutionId"), o.get[java.lang.String]("status")).mapN(avias.codepipeline.models.StageExecution.apply _)
  }
  final implicit val StageNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.StageNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.StageNotFoundException)
  final implicit val ActionConfigurationDecoder: io.circe.Decoder[avias.codepipeline.models.ActionConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("configuration").map(avias.codepipeline.models.ActionConfiguration.apply _)
  }
  final implicit val InvalidNonceExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidNonceException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidNonceException)
  final implicit val PollForJobsOutputDecoder: io.circe.Decoder[avias.codepipeline.models.PollForJobsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codepipeline.models.Job]]]("jobs").map(avias.codepipeline.models.PollForJobsOutput.apply _)
  }
  final implicit val InputArtifactDecoder: io.circe.Decoder[avias.codepipeline.models.InputArtifact] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(avias.codepipeline.models.InputArtifact.apply _)
  }
  final implicit val InvalidApprovalTokenExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidApprovalTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidApprovalTokenException)
  final implicit val CreateCustomActionTypeInputDecoder: io.circe.Decoder[avias.codepipeline.models.CreateCustomActionTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("provider"), o.get[java.lang.String]("version"), o.get[avias.codepipeline.models.ArtifactDetails]("inputArtifactDetails"), o.get[avias.codepipeline.models.ArtifactDetails]("outputArtifactDetails"), o.get[java.lang.String]("category"), o.get[scala.Option[scala.List[avias.codepipeline.models.ActionConfigurationProperty]]]("configurationProperties"), o.get[scala.Option[avias.codepipeline.models.ActionTypeSettings]]("settings")).mapN(avias.codepipeline.models.CreateCustomActionTypeInput.apply _)
  }
  final implicit val StageNotRetryableExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.StageNotRetryableException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.StageNotRetryableException)
  final implicit val CurrentRevisionDecoder: io.circe.Decoder[avias.codepipeline.models.CurrentRevision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("revision"), o.get[java.lang.String]("changeIdentifier"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("revisionSummary")).mapN(avias.codepipeline.models.CurrentRevision.apply _)
  }
  final implicit val JobDecoder: io.circe.Decoder[avias.codepipeline.models.Job] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[avias.codepipeline.models.JobData]]("data"), o.get[scala.Option[java.lang.String]]("nonce"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(avias.codepipeline.models.Job.apply _)
  }
  final implicit val ThirdPartyJobDetailsDecoder: io.circe.Decoder[avias.codepipeline.models.ThirdPartyJobDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[avias.codepipeline.models.ThirdPartyJobData]]("data"), o.get[scala.Option[java.lang.String]]("nonce")).mapN(avias.codepipeline.models.ThirdPartyJobDetails.apply _)
  }
  final implicit val UpdatePipelineOutputDecoder: io.circe.Decoder[avias.codepipeline.models.UpdatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codepipeline.models.PipelineDeclaration]]("pipeline").map(avias.codepipeline.models.UpdatePipelineOutput.apply _)
  }
  final implicit val ListActionTypesOutputDecoder: io.circe.Decoder[avias.codepipeline.models.ListActionTypesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.codepipeline.models.ActionType]]("actionTypes"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codepipeline.models.ListActionTypesOutput.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.ValidationException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.ValidationException)
  final implicit val PipelineExecutionDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.List[avias.codepipeline.models.ArtifactRevision]]]("artifactRevisions"), o.get[scala.Option[scala.Int]]("pipelineVersion"), o.get[scala.Option[java.lang.String]]("pipelineExecutionId")).mapN(avias.codepipeline.models.PipelineExecution.apply _)
  }
  final implicit val EnableStageTransitionInputDecoder: io.circe.Decoder[avias.codepipeline.models.EnableStageTransitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("transitionType")).mapN(avias.codepipeline.models.EnableStageTransitionInput.apply _)
  }
  final implicit val ArtifactLocationDecoder: io.circe.Decoder[avias.codepipeline.models.ArtifactLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[avias.codepipeline.models.S3ArtifactLocation]]("s3Location")).mapN(avias.codepipeline.models.ArtifactLocation.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidNextTokenException)
  final implicit val InvalidBlockerDeclarationExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidBlockerDeclarationException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidBlockerDeclarationException)
  final implicit val StartPipelineExecutionInputDecoder: io.circe.Decoder[avias.codepipeline.models.StartPipelineExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(avias.codepipeline.models.StartPipelineExecutionInput.apply _)
  }
  final implicit val InvalidClientTokenExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidClientTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidClientTokenException)
  final implicit val StageStateDecoder: io.circe.Decoder[avias.codepipeline.models.StageState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("stageName"), o.get[scala.Option[avias.codepipeline.models.TransitionState]]("inboundTransitionState"), o.get[scala.Option[scala.List[avias.codepipeline.models.ActionState]]]("actionStates"), o.get[scala.Option[avias.codepipeline.models.StageExecution]]("latestExecution")).mapN(avias.codepipeline.models.StageState.apply _)
  }
  final implicit val JobDetailsDecoder: io.circe.Decoder[avias.codepipeline.models.JobDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[avias.codepipeline.models.JobData]]("data"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(avias.codepipeline.models.JobDetails.apply _)
  }
  final implicit val InvalidJobExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidJobException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidJobException)
  final implicit val PutJobSuccessResultInputDecoder: io.circe.Decoder[avias.codepipeline.models.PutJobSuccessResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[scala.Option[avias.codepipeline.models.CurrentRevision]]("currentRevision"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[avias.codepipeline.models.ExecutionDetails]]("executionDetails")).mapN(avias.codepipeline.models.PutJobSuccessResultInput.apply _)
  }
  final implicit val ActionContextDecoder: io.circe.Decoder[avias.codepipeline.models.ActionContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(avias.codepipeline.models.ActionContext.apply _)
  }
  final implicit val DeletePipelineInputDecoder: io.circe.Decoder[avias.codepipeline.models.DeletePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(avias.codepipeline.models.DeletePipelineInput.apply _)
  }
  final implicit val ActionExecutionDecoder: io.circe.Decoder[avias.codepipeline.models.ActionExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lastUpdatedBy"), o.get[scala.Option[java.time.Instant]]("lastStatusChange"), o.get[scala.Option[java.lang.String]]("summary"), o.get[scala.Option[java.lang.String]]("externalExecutionUrl"), o.get[scala.Option[java.lang.String]]("token"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[avias.codepipeline.models.ErrorDetails]]("errorDetails"), o.get[scala.Option[java.lang.String]]("externalExecutionId"), o.get[scala.Option[scala.Int]]("percentComplete")).mapN(avias.codepipeline.models.ActionExecution.apply _)
  }
  final implicit val ThirdPartyJobDecoder: io.circe.Decoder[avias.codepipeline.models.ThirdPartyJob] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("clientId"), o.get[scala.Option[java.lang.String]]("jobId")).mapN(avias.codepipeline.models.ThirdPartyJob.apply _)
  }
  final implicit val AWSSessionCredentialsDecoder: io.circe.Decoder[avias.codepipeline.models.AWSSessionCredentials] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("accessKeyId"), o.get[java.lang.String]("secretAccessKey"), o.get[java.lang.String]("sessionToken")).mapN(avias.codepipeline.models.AWSSessionCredentials.apply _)
  }
  final implicit val AcknowledgeJobOutputDecoder: io.circe.Decoder[avias.codepipeline.models.AcknowledgeJobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("status").map(avias.codepipeline.models.AcknowledgeJobOutput.apply _)
  }
  final implicit val GetPipelineExecutionOutputDecoder: io.circe.Decoder[avias.codepipeline.models.GetPipelineExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codepipeline.models.PipelineExecution]]("pipelineExecution").map(avias.codepipeline.models.GetPipelineExecutionOutput.apply _)
  }
  final implicit val InvalidStructureExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidStructureException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidStructureException)
  final implicit val PipelineVersionNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineVersionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.PipelineVersionNotFoundException)
  final implicit val ActionDeclarationDecoder: io.circe.Decoder[avias.codepipeline.models.ActionDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[avias.codepipeline.models.ActionTypeId]("actionTypeId"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[scala.Int]]("runOrder"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("configuration"), o.get[scala.Option[scala.List[avias.codepipeline.models.InputArtifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[avias.codepipeline.models.OutputArtifact]]]("outputArtifacts")).mapN(avias.codepipeline.models.ActionDeclaration.apply _)
  }
  final implicit val GetPipelineExecutionInputDecoder: io.circe.Decoder[avias.codepipeline.models.GetPipelineExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("pipelineExecutionId")).mapN(avias.codepipeline.models.GetPipelineExecutionInput.apply _)
  }
  final implicit val ErrorDetailsDecoder: io.circe.Decoder[avias.codepipeline.models.ErrorDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("message")).mapN(avias.codepipeline.models.ErrorDetails.apply _)
  }
  final implicit val ApprovalAlreadyCompletedExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.ApprovalAlreadyCompletedException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.ApprovalAlreadyCompletedException)
  final implicit val CreatePipelineOutputDecoder: io.circe.Decoder[avias.codepipeline.models.CreatePipelineOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codepipeline.models.PipelineDeclaration]]("pipeline").map(avias.codepipeline.models.CreatePipelineOutput.apply _)
  }
  final implicit val ApprovalResultDecoder: io.circe.Decoder[avias.codepipeline.models.ApprovalResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("summary"), o.get[java.lang.String]("status")).mapN(avias.codepipeline.models.ApprovalResult.apply _)
  }
  final implicit val ThirdPartyJobDataDecoder: io.circe.Decoder[avias.codepipeline.models.ThirdPartyJobData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codepipeline.models.ActionConfiguration]]("actionConfiguration"), o.get[scala.Option[avias.codepipeline.models.AWSSessionCredentials]]("artifactCredentials"), o.get[scala.Option[avias.codepipeline.models.EncryptionKey]]("encryptionKey"), o.get[scala.Option[avias.codepipeline.models.ActionTypeId]]("actionTypeId"), o.get[scala.Option[scala.List[avias.codepipeline.models.Artifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[avias.codepipeline.models.Artifact]]]("outputArtifacts"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[avias.codepipeline.models.PipelineContext]]("pipelineContext")).mapN(avias.codepipeline.models.ThirdPartyJobData.apply _)
  }
  final implicit val ActionRevisionDecoder: io.circe.Decoder[avias.codepipeline.models.ActionRevision] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("revisionId"), o.get[java.lang.String]("revisionChangeId"), o.get[java.time.Instant]("created")).mapN(avias.codepipeline.models.ActionRevision.apply _)
  }
  final implicit val StageContextDecoder: io.circe.Decoder[avias.codepipeline.models.StageContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(avias.codepipeline.models.StageContext.apply _)
  }
  final implicit val PipelineMetadataDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineArn"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(avias.codepipeline.models.PipelineMetadata.apply _)
  }
  final implicit val PutJobFailureResultInputDecoder: io.circe.Decoder[avias.codepipeline.models.PutJobFailureResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[avias.codepipeline.models.FailureDetails]("failureDetails")).mapN(avias.codepipeline.models.PutJobFailureResultInput.apply _)
  }
  final implicit val PutApprovalResultInputDecoder: io.circe.Decoder[avias.codepipeline.models.PutApprovalResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("stageName"), o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("actionName"), o.get[avias.codepipeline.models.ApprovalResult]("result"), o.get[java.lang.String]("token")).mapN(avias.codepipeline.models.PutApprovalResultInput.apply _)
  }
  final implicit val DisableStageTransitionInputDecoder: io.circe.Decoder[avias.codepipeline.models.DisableStageTransitionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("transitionType"), o.get[java.lang.String]("reason")).mapN(avias.codepipeline.models.DisableStageTransitionInput.apply _)
  }
  final implicit val ListActionTypesInputDecoder: io.circe.Decoder[avias.codepipeline.models.ListActionTypesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionOwnerFilter"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codepipeline.models.ListActionTypesInput.apply _)
  }
  final implicit val InvalidActionDeclarationExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidActionDeclarationException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidActionDeclarationException)
  final implicit val GetThirdPartyJobDetailsInputDecoder: io.circe.Decoder[avias.codepipeline.models.GetThirdPartyJobDetailsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("clientToken")).mapN(avias.codepipeline.models.GetThirdPartyJobDetailsInput.apply _)
  }
  final implicit val JobNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.JobNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.JobNotFoundException)
  final implicit val ActionStateDecoder: io.circe.Decoder[avias.codepipeline.models.ActionState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionName"), o.get[scala.Option[avias.codepipeline.models.ActionRevision]]("currentRevision"), o.get[scala.Option[avias.codepipeline.models.ActionExecution]]("latestExecution"), o.get[scala.Option[java.lang.String]]("entityUrl"), o.get[scala.Option[java.lang.String]]("revisionUrl")).mapN(avias.codepipeline.models.ActionState.apply _)
  }
  final implicit val ActionConfigurationPropertyDecoder: io.circe.Decoder[avias.codepipeline.models.ActionConfigurationProperty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Boolean]("required"), o.get[scala.Boolean]("key"), o.get[scala.Boolean]("secret"), o.get[scala.Option[scala.Boolean]]("queryable"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("type")).mapN(avias.codepipeline.models.ActionConfigurationProperty.apply _)
  }
  final implicit val JobDataDecoder: io.circe.Decoder[avias.codepipeline.models.JobData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codepipeline.models.ActionConfiguration]]("actionConfiguration"), o.get[scala.Option[avias.codepipeline.models.AWSSessionCredentials]]("artifactCredentials"), o.get[scala.Option[avias.codepipeline.models.EncryptionKey]]("encryptionKey"), o.get[scala.Option[avias.codepipeline.models.ActionTypeId]]("actionTypeId"), o.get[scala.Option[scala.List[avias.codepipeline.models.Artifact]]]("inputArtifacts"), o.get[scala.Option[scala.List[avias.codepipeline.models.Artifact]]]("outputArtifacts"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[avias.codepipeline.models.PipelineContext]]("pipelineContext")).mapN(avias.codepipeline.models.JobData.apply _)
  }
  final implicit val EncryptionKeyDecoder: io.circe.Decoder[avias.codepipeline.models.EncryptionKey] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("type")).mapN(avias.codepipeline.models.EncryptionKey.apply _)
  }
  final implicit val PutThirdPartyJobSuccessResultInputDecoder: io.circe.Decoder[avias.codepipeline.models.PutThirdPartyJobSuccessResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("clientToken"), o.get[java.lang.String]("jobId"), o.get[scala.Option[avias.codepipeline.models.CurrentRevision]]("currentRevision"), o.get[scala.Option[java.lang.String]]("continuationToken"), o.get[scala.Option[avias.codepipeline.models.ExecutionDetails]]("executionDetails")).mapN(avias.codepipeline.models.PutThirdPartyJobSuccessResultInput.apply _)
  }
  final implicit val GetPipelineStateOutputDecoder: io.circe.Decoder[avias.codepipeline.models.GetPipelineStateOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[scala.Int]]("pipelineVersion"), o.get[scala.Option[scala.List[avias.codepipeline.models.StageState]]]("stageStates"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(avias.codepipeline.models.GetPipelineStateOutput.apply _)
  }
  final implicit val ActionTypeDecoder: io.circe.Decoder[avias.codepipeline.models.ActionType] = io.circe.Decoder.instance { o => 
    (o.get[avias.codepipeline.models.ActionTypeId]("id"), o.get[avias.codepipeline.models.ArtifactDetails]("inputArtifactDetails"), o.get[avias.codepipeline.models.ArtifactDetails]("outputArtifactDetails"), o.get[scala.Option[avias.codepipeline.models.ActionTypeSettings]]("settings"), o.get[scala.Option[scala.List[avias.codepipeline.models.ActionConfigurationProperty]]]("actionConfigurationProperties")).mapN(avias.codepipeline.models.ActionType.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.LimitExceededException)
  final implicit val StageDeclarationDecoder: io.circe.Decoder[avias.codepipeline.models.StageDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.List[avias.codepipeline.models.ActionDeclaration]]("actions"), o.get[scala.Option[scala.List[avias.codepipeline.models.BlockerDeclaration]]]("blockers")).mapN(avias.codepipeline.models.StageDeclaration.apply _)
  }
  final implicit val PipelineExecutionNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineExecutionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.PipelineExecutionNotFoundException)
  final implicit val PipelineExecutionSummaryDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineExecutionSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineExecutionId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("lastUpdateTime")).mapN(avias.codepipeline.models.PipelineExecutionSummary.apply _)
  }
  final implicit val S3ArtifactLocationDecoder: io.circe.Decoder[avias.codepipeline.models.S3ArtifactLocation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("bucketName"), o.get[java.lang.String]("objectKey")).mapN(avias.codepipeline.models.S3ArtifactLocation.apply _)
  }
  final implicit val GetThirdPartyJobDetailsOutputDecoder: io.circe.Decoder[avias.codepipeline.models.GetThirdPartyJobDetailsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codepipeline.models.ThirdPartyJobDetails]]("jobDetails").map(avias.codepipeline.models.GetThirdPartyJobDetailsOutput.apply _)
  }
  final implicit val PutActionRevisionOutputDecoder: io.circe.Decoder[avias.codepipeline.models.PutActionRevisionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("newRevision"), o.get[scala.Option[java.lang.String]]("pipelineExecutionId")).mapN(avias.codepipeline.models.PutActionRevisionOutput.apply _)
  }
  final implicit val ActionTypeIdDecoder: io.circe.Decoder[avias.codepipeline.models.ActionTypeId] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("category"), o.get[java.lang.String]("owner"), o.get[java.lang.String]("provider"), o.get[java.lang.String]("version")).mapN(avias.codepipeline.models.ActionTypeId.apply _)
  }
  final implicit val DeleteCustomActionTypeInputDecoder: io.circe.Decoder[avias.codepipeline.models.DeleteCustomActionTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("category"), o.get[java.lang.String]("provider"), o.get[java.lang.String]("version")).mapN(avias.codepipeline.models.DeleteCustomActionTypeInput.apply _)
  }
  final implicit val GetPipelineStateInputDecoder: io.circe.Decoder[avias.codepipeline.models.GetPipelineStateInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(avias.codepipeline.models.GetPipelineStateInput.apply _)
  }
  final implicit val PutApprovalResultOutputDecoder: io.circe.Decoder[avias.codepipeline.models.PutApprovalResultOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.time.Instant]]("approvedAt").map(avias.codepipeline.models.PutApprovalResultOutput.apply _)
  }
  final implicit val ActionTypeSettingsDecoder: io.circe.Decoder[avias.codepipeline.models.ActionTypeSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("thirdPartyConfigurationUrl"), o.get[scala.Option[java.lang.String]]("entityUrlTemplate"), o.get[scala.Option[java.lang.String]]("executionUrlTemplate"), o.get[scala.Option[java.lang.String]]("revisionUrlTemplate")).mapN(avias.codepipeline.models.ActionTypeSettings.apply _)
  }
  final implicit val ListPipelineExecutionsInputDecoder: io.circe.Decoder[avias.codepipeline.models.ListPipelineExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codepipeline.models.ListPipelineExecutionsInput.apply _)
  }
  final implicit val ListPipelineExecutionsOutputDecoder: io.circe.Decoder[avias.codepipeline.models.ListPipelineExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codepipeline.models.PipelineExecutionSummary]]]("pipelineExecutionSummaries"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codepipeline.models.ListPipelineExecutionsOutput.apply _)
  }
  final implicit val InvalidStageDeclarationExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidStageDeclarationException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidStageDeclarationException)
  final implicit val ArtifactDecoder: io.circe.Decoder[avias.codepipeline.models.Artifact] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("revision"), o.get[scala.Option[avias.codepipeline.models.ArtifactLocation]]("location")).mapN(avias.codepipeline.models.Artifact.apply _)
  }
  final implicit val OutputArtifactDecoder: io.circe.Decoder[avias.codepipeline.models.OutputArtifact] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(avias.codepipeline.models.OutputArtifact.apply _)
  }
  final implicit val GetPipelineOutputDecoder: io.circe.Decoder[avias.codepipeline.models.GetPipelineOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codepipeline.models.PipelineDeclaration]]("pipeline"), o.get[scala.Option[avias.codepipeline.models.PipelineMetadata]]("metadata")).mapN(avias.codepipeline.models.GetPipelineOutput.apply _)
  }
  final implicit val NotLatestPipelineExecutionExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.NotLatestPipelineExecutionException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.NotLatestPipelineExecutionException)
  final implicit val CreatePipelineInputDecoder: io.circe.Decoder[avias.codepipeline.models.CreatePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[avias.codepipeline.models.PipelineDeclaration]("pipeline").map(avias.codepipeline.models.CreatePipelineInput.apply _)
  }
  final implicit val AcknowledgeThirdPartyJobInputDecoder: io.circe.Decoder[avias.codepipeline.models.AcknowledgeThirdPartyJobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("nonce"), o.get[java.lang.String]("clientToken")).mapN(avias.codepipeline.models.AcknowledgeThirdPartyJobInput.apply _)
  }
  final implicit val PipelineSummaryDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Int]]("version"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("updated")).mapN(avias.codepipeline.models.PipelineSummary.apply _)
  }
  final implicit val RetryStageExecutionInputDecoder: io.circe.Decoder[avias.codepipeline.models.RetryStageExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("pipelineExecutionId"), o.get[java.lang.String]("retryMode")).mapN(avias.codepipeline.models.RetryStageExecutionInput.apply _)
  }
  final implicit val UpdatePipelineInputDecoder: io.circe.Decoder[avias.codepipeline.models.UpdatePipelineInput] = io.circe.Decoder.instance { o => 
    o.get[avias.codepipeline.models.PipelineDeclaration]("pipeline").map(avias.codepipeline.models.UpdatePipelineInput.apply _)
  }
  final implicit val ExecutionDetailsDecoder: io.circe.Decoder[avias.codepipeline.models.ExecutionDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("summary"), o.get[scala.Option[java.lang.String]]("externalExecutionId"), o.get[scala.Option[scala.Int]]("percentComplete")).mapN(avias.codepipeline.models.ExecutionDetails.apply _)
  }
  final implicit val ArtifactRevisionDecoder: io.circe.Decoder[avias.codepipeline.models.ArtifactRevision] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("revisionUrl"), o.get[scala.Option[java.lang.String]]("revisionSummary"), o.get[scala.Option[java.lang.String]]("revisionChangeIdentifier"), o.get[scala.Option[java.lang.String]]("revisionId"), o.get[scala.Option[java.lang.String]]("name")).mapN(avias.codepipeline.models.ArtifactRevision.apply _)
  }
  final implicit val PollForThirdPartyJobsInputDecoder: io.circe.Decoder[avias.codepipeline.models.PollForThirdPartyJobsInput] = io.circe.Decoder.instance { o => 
    (o.get[avias.codepipeline.models.ActionTypeId]("actionTypeId"), o.get[scala.Option[scala.Int]]("maxBatchSize")).mapN(avias.codepipeline.models.PollForThirdPartyJobsInput.apply _)
  }
  final implicit val PollForThirdPartyJobsOutputDecoder: io.circe.Decoder[avias.codepipeline.models.PollForThirdPartyJobsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codepipeline.models.ThirdPartyJob]]]("jobs").map(avias.codepipeline.models.PollForThirdPartyJobsOutput.apply _)
  }
  final implicit val PutThirdPartyJobFailureResultInputDecoder: io.circe.Decoder[avias.codepipeline.models.PutThirdPartyJobFailureResultInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("jobId"), o.get[java.lang.String]("clientToken"), o.get[avias.codepipeline.models.FailureDetails]("failureDetails")).mapN(avias.codepipeline.models.PutThirdPartyJobFailureResultInput.apply _)
  }
  final implicit val RetryStageExecutionOutputDecoder: io.circe.Decoder[avias.codepipeline.models.RetryStageExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pipelineExecutionId").map(avias.codepipeline.models.RetryStageExecutionOutput.apply _)
  }
  final implicit val TransitionStateDecoder: io.circe.Decoder[avias.codepipeline.models.TransitionState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[java.lang.String]]("lastChangedBy"), o.get[scala.Option[java.time.Instant]]("lastChangedAt"), o.get[scala.Option[java.lang.String]]("disabledReason")).mapN(avias.codepipeline.models.TransitionState.apply _)
  }
  final implicit val PollForJobsInputDecoder: io.circe.Decoder[avias.codepipeline.models.PollForJobsInput] = io.circe.Decoder.instance { o => 
    (o.get[avias.codepipeline.models.ActionTypeId]("actionTypeId"), o.get[scala.Option[scala.Int]]("maxBatchSize"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("queryParam")).mapN(avias.codepipeline.models.PollForJobsInput.apply _)
  }
  final implicit val PipelineDeclarationDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineDeclaration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("roleArn"), o.get[java.lang.String]("name"), o.get[scala.List[avias.codepipeline.models.StageDeclaration]]("stages"), o.get[avias.codepipeline.models.ArtifactStore]("artifactStore"), o.get[scala.Option[scala.Int]]("version")).mapN(avias.codepipeline.models.PipelineDeclaration.apply _)
  }
  final implicit val InvalidJobStateExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.InvalidJobStateException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.InvalidJobStateException)
  final implicit val GetJobDetailsInputDecoder: io.circe.Decoder[avias.codepipeline.models.GetJobDetailsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("jobId").map(avias.codepipeline.models.GetJobDetailsInput.apply _)
  }
  final implicit val GetPipelineInputDecoder: io.circe.Decoder[avias.codepipeline.models.GetPipelineInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[scala.Int]]("version")).mapN(avias.codepipeline.models.GetPipelineInput.apply _)
  }
  final implicit val ActionTypeNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.ActionTypeNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.ActionTypeNotFoundException)
  final implicit val ActionNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.ActionNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.ActionNotFoundException)
  final implicit val PipelineNotFoundExceptionDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codepipeline.models.PipelineNotFoundException)
  final implicit val PipelineContextDecoder: io.circe.Decoder[avias.codepipeline.models.PipelineContext] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("pipelineName"), o.get[scala.Option[avias.codepipeline.models.StageContext]]("stage"), o.get[scala.Option[avias.codepipeline.models.ActionContext]]("action")).mapN(avias.codepipeline.models.PipelineContext.apply _)
  }
  final implicit val FailureDetailsDecoder: io.circe.Decoder[avias.codepipeline.models.FailureDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[java.lang.String]("message"), o.get[scala.Option[java.lang.String]]("externalExecutionId")).mapN(avias.codepipeline.models.FailureDetails.apply _)
  }
  final implicit val ListPipelinesInputDecoder: io.circe.Decoder[avias.codepipeline.models.ListPipelinesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.codepipeline.models.ListPipelinesInput.apply _)
  }
  final implicit val ArtifactDetailsDecoder: io.circe.Decoder[avias.codepipeline.models.ArtifactDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("minimumCount"), o.get[scala.Int]("maximumCount")).mapN(avias.codepipeline.models.ArtifactDetails.apply _)
  }
  final implicit val PutActionRevisionInputDecoder: io.circe.Decoder[avias.codepipeline.models.PutActionRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pipelineName"), o.get[java.lang.String]("stageName"), o.get[java.lang.String]("actionName"), o.get[avias.codepipeline.models.ActionRevision]("actionRevision")).mapN(avias.codepipeline.models.PutActionRevisionInput.apply _)
  }
  final implicit val ArtifactStoreDecoder: io.circe.Decoder[avias.codepipeline.models.ArtifactStore] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[java.lang.String]("location"), o.get[scala.Option[avias.codepipeline.models.EncryptionKey]]("encryptionKey")).mapN(avias.codepipeline.models.ArtifactStore.apply _)
  }
}