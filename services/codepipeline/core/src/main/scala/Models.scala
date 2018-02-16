package org.lyranthe.araethura.codepipeline.models
final case class AcknowledgeThirdPartyJobOutput(status: scala.Option[java.lang.String] = scala.None)
case object PipelineNameInUseException
final case class GetJobDetailsOutput(jobDetails: scala.Option[org.lyranthe.araethura.codepipeline.models.JobDetails] = scala.None)
final case class BlockerDeclaration(name: java.lang.String, `type`: java.lang.String)
final case class StartPipelineExecutionOutput(pipelineExecutionId: scala.Option[java.lang.String] = scala.None)
final case class CreateCustomActionTypeOutput(actionType: org.lyranthe.araethura.codepipeline.models.ActionType)
final case class ListPipelinesOutput(pipelines: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.PipelineSummary]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AcknowledgeJobInput(jobId: java.lang.String, nonce: java.lang.String)
final case class StageExecution(pipelineExecutionId: java.lang.String, status: java.lang.String)
case object StageNotFoundException
final case class ActionConfiguration(configuration: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
case object InvalidNonceException
final case class PollForJobsOutput(jobs: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Job]] = scala.None)
final case class InputArtifact(name: java.lang.String)
case object InvalidApprovalTokenException
final case class CreateCustomActionTypeInput(provider: java.lang.String, version: java.lang.String, inputArtifactDetails: org.lyranthe.araethura.codepipeline.models.ArtifactDetails, outputArtifactDetails: org.lyranthe.araethura.codepipeline.models.ArtifactDetails, category: java.lang.String, configurationProperties: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty]] = scala.None, settings: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeSettings] = scala.None)
case object StageNotRetryableException
final case class CurrentRevision(revision: java.lang.String, changeIdentifier: java.lang.String, created: scala.Option[java.time.Instant] = scala.None, revisionSummary: scala.Option[java.lang.String] = scala.None)
final case class Job(id: scala.Option[java.lang.String] = scala.None, data: scala.Option[org.lyranthe.araethura.codepipeline.models.JobData] = scala.None, nonce: scala.Option[java.lang.String] = scala.None, accountId: scala.Option[java.lang.String] = scala.None)
final case class ThirdPartyJobDetails(id: scala.Option[java.lang.String] = scala.None, data: scala.Option[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobData] = scala.None, nonce: scala.Option[java.lang.String] = scala.None)
final case class UpdatePipelineOutput(pipeline: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration] = scala.None)
final case class ListActionTypesOutput(actionTypes: scala.List[org.lyranthe.araethura.codepipeline.models.ActionType], nextToken: scala.Option[java.lang.String] = scala.None)
case object ValidationException
final case class PipelineExecution(pipelineName: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, artifactRevisions: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ArtifactRevision]] = scala.None, pipelineVersion: scala.Option[scala.Int] = scala.None, pipelineExecutionId: scala.Option[java.lang.String] = scala.None)
final case class EnableStageTransitionInput(pipelineName: java.lang.String, stageName: java.lang.String, transitionType: java.lang.String)
final case class ArtifactLocation(`type`: scala.Option[java.lang.String] = scala.None, s3Location: scala.Option[org.lyranthe.araethura.codepipeline.models.S3ArtifactLocation] = scala.None)
case object InvalidNextTokenException
case object InvalidBlockerDeclarationException
final case class StartPipelineExecutionInput(name: java.lang.String)
case object InvalidClientTokenException
final case class StageState(stageName: scala.Option[java.lang.String] = scala.None, inboundTransitionState: scala.Option[org.lyranthe.araethura.codepipeline.models.TransitionState] = scala.None, actionStates: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ActionState]] = scala.None, latestExecution: scala.Option[org.lyranthe.araethura.codepipeline.models.StageExecution] = scala.None)
final case class JobDetails(id: scala.Option[java.lang.String] = scala.None, data: scala.Option[org.lyranthe.araethura.codepipeline.models.JobData] = scala.None, accountId: scala.Option[java.lang.String] = scala.None)
case object InvalidJobException
final case class PutJobSuccessResultInput(jobId: java.lang.String, currentRevision: scala.Option[org.lyranthe.araethura.codepipeline.models.CurrentRevision] = scala.None, continuationToken: scala.Option[java.lang.String] = scala.None, executionDetails: scala.Option[org.lyranthe.araethura.codepipeline.models.ExecutionDetails] = scala.None)
final case class ActionContext(name: scala.Option[java.lang.String] = scala.None)
final case class DeletePipelineInput(name: java.lang.String)
final case class ActionExecution(lastUpdatedBy: scala.Option[java.lang.String] = scala.None, lastStatusChange: scala.Option[java.time.Instant] = scala.None, summary: scala.Option[java.lang.String] = scala.None, externalExecutionUrl: scala.Option[java.lang.String] = scala.None, token: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, errorDetails: scala.Option[org.lyranthe.araethura.codepipeline.models.ErrorDetails] = scala.None, externalExecutionId: scala.Option[java.lang.String] = scala.None, percentComplete: scala.Option[scala.Int] = scala.None)
final case class ThirdPartyJob(clientId: scala.Option[java.lang.String] = scala.None, jobId: scala.Option[java.lang.String] = scala.None)
final case class AWSSessionCredentials(accessKeyId: java.lang.String, secretAccessKey: java.lang.String, sessionToken: java.lang.String)
final case class AcknowledgeJobOutput(status: scala.Option[java.lang.String] = scala.None)
final case class GetPipelineExecutionOutput(pipelineExecution: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineExecution] = scala.None)
case object InvalidStructureException
case object PipelineVersionNotFoundException
final case class ActionDeclaration(name: java.lang.String, actionTypeId: org.lyranthe.araethura.codepipeline.models.ActionTypeId, roleArn: scala.Option[java.lang.String] = scala.None, runOrder: scala.Option[scala.Int] = scala.None, configuration: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, inputArtifacts: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.InputArtifact]] = scala.None, outputArtifacts: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.OutputArtifact]] = scala.None)
final case class GetPipelineExecutionInput(pipelineName: java.lang.String, pipelineExecutionId: java.lang.String)
final case class ErrorDetails(code: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None)
case object ApprovalAlreadyCompletedException
final case class CreatePipelineOutput(pipeline: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration] = scala.None)
final case class ApprovalResult(summary: java.lang.String, status: java.lang.String)
final case class ThirdPartyJobData(actionConfiguration: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionConfiguration] = scala.None, artifactCredentials: scala.Option[org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials] = scala.None, encryptionKey: scala.Option[org.lyranthe.araethura.codepipeline.models.EncryptionKey] = scala.None, actionTypeId: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeId] = scala.None, inputArtifacts: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]] = scala.None, outputArtifacts: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]] = scala.None, continuationToken: scala.Option[java.lang.String] = scala.None, pipelineContext: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineContext] = scala.None)
final case class ActionRevision(revisionId: java.lang.String, revisionChangeId: java.lang.String, created: java.time.Instant)
final case class StageContext(name: scala.Option[java.lang.String] = scala.None)
final case class PipelineMetadata(pipelineArn: scala.Option[java.lang.String] = scala.None, created: scala.Option[java.time.Instant] = scala.None, updated: scala.Option[java.time.Instant] = scala.None)
final case class PutJobFailureResultInput(jobId: java.lang.String, failureDetails: org.lyranthe.araethura.codepipeline.models.FailureDetails)
final case class PutApprovalResultInput(stageName: java.lang.String, pipelineName: java.lang.String, actionName: java.lang.String, result: org.lyranthe.araethura.codepipeline.models.ApprovalResult, token: java.lang.String)
final case class DisableStageTransitionInput(pipelineName: java.lang.String, stageName: java.lang.String, transitionType: java.lang.String, reason: java.lang.String)
final case class ListActionTypesInput(actionOwnerFilter: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidActionDeclarationException
final case class GetThirdPartyJobDetailsInput(jobId: java.lang.String, clientToken: java.lang.String)
case object JobNotFoundException
final case class ActionState(actionName: scala.Option[java.lang.String] = scala.None, currentRevision: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionRevision] = scala.None, latestExecution: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionExecution] = scala.None, entityUrl: scala.Option[java.lang.String] = scala.None, revisionUrl: scala.Option[java.lang.String] = scala.None)
final case class ActionConfigurationProperty(name: java.lang.String, required: scala.Boolean, key: scala.Boolean, secret: scala.Boolean, queryable: scala.Option[scala.Boolean] = scala.None, description: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class JobData(actionConfiguration: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionConfiguration] = scala.None, artifactCredentials: scala.Option[org.lyranthe.araethura.codepipeline.models.AWSSessionCredentials] = scala.None, encryptionKey: scala.Option[org.lyranthe.araethura.codepipeline.models.EncryptionKey] = scala.None, actionTypeId: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeId] = scala.None, inputArtifacts: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]] = scala.None, outputArtifacts: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.Artifact]] = scala.None, continuationToken: scala.Option[java.lang.String] = scala.None, pipelineContext: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineContext] = scala.None)
final case class EncryptionKey(id: java.lang.String, `type`: java.lang.String)
final case class PutThirdPartyJobSuccessResultInput(clientToken: java.lang.String, jobId: java.lang.String, currentRevision: scala.Option[org.lyranthe.araethura.codepipeline.models.CurrentRevision] = scala.None, continuationToken: scala.Option[java.lang.String] = scala.None, executionDetails: scala.Option[org.lyranthe.araethura.codepipeline.models.ExecutionDetails] = scala.None)
final case class GetPipelineStateOutput(pipelineName: scala.Option[java.lang.String] = scala.None, pipelineVersion: scala.Option[scala.Int] = scala.None, stageStates: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.StageState]] = scala.None, created: scala.Option[java.time.Instant] = scala.None, updated: scala.Option[java.time.Instant] = scala.None)
final case class ActionType(id: org.lyranthe.araethura.codepipeline.models.ActionTypeId, inputArtifactDetails: org.lyranthe.araethura.codepipeline.models.ArtifactDetails, outputArtifactDetails: org.lyranthe.araethura.codepipeline.models.ArtifactDetails, settings: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionTypeSettings] = scala.None, actionConfigurationProperties: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ActionConfigurationProperty]] = scala.None)
case object LimitExceededException
final case class StageDeclaration(name: java.lang.String, actions: scala.List[org.lyranthe.araethura.codepipeline.models.ActionDeclaration], blockers: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.BlockerDeclaration]] = scala.None)
case object PipelineExecutionNotFoundException
final case class PipelineExecutionSummary(pipelineExecutionId: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, lastUpdateTime: scala.Option[java.time.Instant] = scala.None)
final case class S3ArtifactLocation(bucketName: java.lang.String, objectKey: java.lang.String)
final case class GetThirdPartyJobDetailsOutput(jobDetails: scala.Option[org.lyranthe.araethura.codepipeline.models.ThirdPartyJobDetails] = scala.None)
final case class PutActionRevisionOutput(newRevision: scala.Option[scala.Boolean] = scala.None, pipelineExecutionId: scala.Option[java.lang.String] = scala.None)
final case class ActionTypeId(category: java.lang.String, owner: java.lang.String, provider: java.lang.String, version: java.lang.String)
final case class DeleteCustomActionTypeInput(category: java.lang.String, provider: java.lang.String, version: java.lang.String)
final case class GetPipelineStateInput(name: java.lang.String)
final case class PutApprovalResultOutput(approvedAt: scala.Option[java.time.Instant] = scala.None)
final case class ActionTypeSettings(thirdPartyConfigurationUrl: scala.Option[java.lang.String] = scala.None, entityUrlTemplate: scala.Option[java.lang.String] = scala.None, executionUrlTemplate: scala.Option[java.lang.String] = scala.None, revisionUrlTemplate: scala.Option[java.lang.String] = scala.None)
final case class ListPipelineExecutionsInput(pipelineName: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListPipelineExecutionsOutput(pipelineExecutionSummaries: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.PipelineExecutionSummary]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidStageDeclarationException
final case class Artifact(name: scala.Option[java.lang.String] = scala.None, revision: scala.Option[java.lang.String] = scala.None, location: scala.Option[org.lyranthe.araethura.codepipeline.models.ArtifactLocation] = scala.None)
final case class OutputArtifact(name: java.lang.String)
final case class GetPipelineOutput(pipeline: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineDeclaration] = scala.None, metadata: scala.Option[org.lyranthe.araethura.codepipeline.models.PipelineMetadata] = scala.None)
case object NotLatestPipelineExecutionException
final case class CreatePipelineInput(pipeline: org.lyranthe.araethura.codepipeline.models.PipelineDeclaration)
final case class AcknowledgeThirdPartyJobInput(jobId: java.lang.String, nonce: java.lang.String, clientToken: java.lang.String)
final case class PipelineSummary(name: scala.Option[java.lang.String] = scala.None, version: scala.Option[scala.Int] = scala.None, created: scala.Option[java.time.Instant] = scala.None, updated: scala.Option[java.time.Instant] = scala.None)
final case class RetryStageExecutionInput(pipelineName: java.lang.String, stageName: java.lang.String, pipelineExecutionId: java.lang.String, retryMode: java.lang.String)
final case class UpdatePipelineInput(pipeline: org.lyranthe.araethura.codepipeline.models.PipelineDeclaration)
final case class ExecutionDetails(summary: scala.Option[java.lang.String] = scala.None, externalExecutionId: scala.Option[java.lang.String] = scala.None, percentComplete: scala.Option[scala.Int] = scala.None)
final case class ArtifactRevision(created: scala.Option[java.time.Instant] = scala.None, revisionUrl: scala.Option[java.lang.String] = scala.None, revisionSummary: scala.Option[java.lang.String] = scala.None, revisionChangeIdentifier: scala.Option[java.lang.String] = scala.None, revisionId: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class PollForThirdPartyJobsInput(actionTypeId: org.lyranthe.araethura.codepipeline.models.ActionTypeId, maxBatchSize: scala.Option[scala.Int] = scala.None)
final case class PollForThirdPartyJobsOutput(jobs: scala.Option[scala.List[org.lyranthe.araethura.codepipeline.models.ThirdPartyJob]] = scala.None)
final case class PutThirdPartyJobFailureResultInput(jobId: java.lang.String, clientToken: java.lang.String, failureDetails: org.lyranthe.araethura.codepipeline.models.FailureDetails)
final case class RetryStageExecutionOutput(pipelineExecutionId: scala.Option[java.lang.String] = scala.None)
final case class TransitionState(enabled: scala.Option[scala.Boolean] = scala.None, lastChangedBy: scala.Option[java.lang.String] = scala.None, lastChangedAt: scala.Option[java.time.Instant] = scala.None, disabledReason: scala.Option[java.lang.String] = scala.None)
final case class PollForJobsInput(actionTypeId: org.lyranthe.araethura.codepipeline.models.ActionTypeId, maxBatchSize: scala.Option[scala.Int] = scala.None, queryParam: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class PipelineDeclaration(roleArn: java.lang.String, name: java.lang.String, stages: scala.List[org.lyranthe.araethura.codepipeline.models.StageDeclaration], artifactStore: org.lyranthe.araethura.codepipeline.models.ArtifactStore, version: scala.Option[scala.Int] = scala.None)
case object InvalidJobStateException
final case class GetJobDetailsInput(jobId: java.lang.String)
final case class GetPipelineInput(name: java.lang.String, version: scala.Option[scala.Int] = scala.None)
case object ActionTypeNotFoundException
case object ActionNotFoundException
case object PipelineNotFoundException
final case class PipelineContext(pipelineName: scala.Option[java.lang.String] = scala.None, stage: scala.Option[org.lyranthe.araethura.codepipeline.models.StageContext] = scala.None, action: scala.Option[org.lyranthe.araethura.codepipeline.models.ActionContext] = scala.None)
final case class FailureDetails(`type`: java.lang.String, message: java.lang.String, externalExecutionId: scala.Option[java.lang.String] = scala.None)
final case class ListPipelinesInput(nextToken: scala.Option[java.lang.String] = scala.None)
final case class ArtifactDetails(minimumCount: scala.Int, maximumCount: scala.Int)
final case class PutActionRevisionInput(pipelineName: java.lang.String, stageName: java.lang.String, actionName: java.lang.String, actionRevision: org.lyranthe.araethura.codepipeline.models.ActionRevision)
final case class ArtifactStore(`type`: java.lang.String, location: java.lang.String, encryptionKey: scala.Option[org.lyranthe.araethura.codepipeline.models.EncryptionKey] = scala.None)