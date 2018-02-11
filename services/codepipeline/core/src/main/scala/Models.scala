package org.lyranthe.araethura.codepipeline.models
import org.lyranthe.araethura.codepipeline.models
final case class AcknowledgeThirdPartyJobOutput(status: scala.Option[java.lang.String] = None)
case object PipelineNameInUseException
final case class GetJobDetailsOutput(jobDetails: scala.Option[models.JobDetails] = None)
final case class BlockerDeclaration(name: java.lang.String, `type`: java.lang.String)
final case class StartPipelineExecutionOutput(pipelineExecutionId: scala.Option[java.lang.String] = None)
final case class CreateCustomActionTypeOutput(actionType: models.ActionType)
final case class ListPipelinesOutput(pipelines: scala.Option[scala.List[models.PipelineSummary]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class AcknowledgeJobInput(jobId: java.lang.String, nonce: java.lang.String)
final case class StageExecution(pipelineExecutionId: java.lang.String, status: java.lang.String)
case object StageNotFoundException
final case class ActionConfiguration(configuration: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None)
case object InvalidNonceException
final case class PollForJobsOutput(jobs: scala.Option[scala.List[models.Job]] = None)
final case class InputArtifact(name: java.lang.String)
case object InvalidApprovalTokenException
final case class CreateCustomActionTypeInput(provider: java.lang.String, version: java.lang.String, inputArtifactDetails: models.ArtifactDetails, outputArtifactDetails: models.ArtifactDetails, category: java.lang.String, configurationProperties: scala.Option[scala.List[models.ActionConfigurationProperty]] = None, settings: scala.Option[models.ActionTypeSettings] = None)
case object StageNotRetryableException
final case class CurrentRevision(revision: java.lang.String, changeIdentifier: java.lang.String, created: scala.Option[java.time.Instant] = None, revisionSummary: scala.Option[java.lang.String] = None)
final case class Job(id: scala.Option[java.lang.String] = None, data: scala.Option[models.JobData] = None, nonce: scala.Option[java.lang.String] = None, accountId: scala.Option[java.lang.String] = None)
final case class ThirdPartyJobDetails(id: scala.Option[java.lang.String] = None, data: scala.Option[models.ThirdPartyJobData] = None, nonce: scala.Option[java.lang.String] = None)
final case class UpdatePipelineOutput(pipeline: scala.Option[models.PipelineDeclaration] = None)
final case class ListActionTypesOutput(actionTypes: scala.List[models.ActionType], nextToken: scala.Option[java.lang.String] = None)
case object ValidationException
final case class PipelineExecution(pipelineName: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, artifactRevisions: scala.Option[scala.List[models.ArtifactRevision]] = None, pipelineVersion: scala.Option[scala.Int] = None, pipelineExecutionId: scala.Option[java.lang.String] = None)
final case class EnableStageTransitionInput(pipelineName: java.lang.String, stageName: java.lang.String, transitionType: java.lang.String)
final case class ArtifactLocation(`type`: scala.Option[java.lang.String] = None, s3Location: scala.Option[models.S3ArtifactLocation] = None)
case object InvalidNextTokenException
case object InvalidBlockerDeclarationException
final case class StartPipelineExecutionInput(name: java.lang.String)
case object InvalidClientTokenException
final case class StageState(stageName: scala.Option[java.lang.String] = None, inboundTransitionState: scala.Option[models.TransitionState] = None, actionStates: scala.Option[scala.List[models.ActionState]] = None, latestExecution: scala.Option[models.StageExecution] = None)
final case class JobDetails(id: scala.Option[java.lang.String] = None, data: scala.Option[models.JobData] = None, accountId: scala.Option[java.lang.String] = None)
case object InvalidJobException
final case class PutJobSuccessResultInput(jobId: java.lang.String, currentRevision: scala.Option[models.CurrentRevision] = None, continuationToken: scala.Option[java.lang.String] = None, executionDetails: scala.Option[models.ExecutionDetails] = None)
final case class ActionContext(name: scala.Option[java.lang.String] = None)
final case class DeletePipelineInput(name: java.lang.String)
final case class ActionExecution(lastUpdatedBy: scala.Option[java.lang.String] = None, lastStatusChange: scala.Option[java.time.Instant] = None, summary: scala.Option[java.lang.String] = None, externalExecutionUrl: scala.Option[java.lang.String] = None, token: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, errorDetails: scala.Option[models.ErrorDetails] = None, externalExecutionId: scala.Option[java.lang.String] = None, percentComplete: scala.Option[scala.Int] = None)
final case class ThirdPartyJob(clientId: scala.Option[java.lang.String] = None, jobId: scala.Option[java.lang.String] = None)
final case class AWSSessionCredentials(accessKeyId: java.lang.String, secretAccessKey: java.lang.String, sessionToken: java.lang.String)
final case class AcknowledgeJobOutput(status: scala.Option[java.lang.String] = None)
final case class GetPipelineExecutionOutput(pipelineExecution: scala.Option[models.PipelineExecution] = None)
case object InvalidStructureException
case object PipelineVersionNotFoundException
final case class ActionDeclaration(name: java.lang.String, actionTypeId: models.ActionTypeId, roleArn: scala.Option[java.lang.String] = None, runOrder: scala.Option[scala.Int] = None, configuration: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None, inputArtifacts: scala.Option[scala.List[models.InputArtifact]] = None, outputArtifacts: scala.Option[scala.List[models.OutputArtifact]] = None)
final case class GetPipelineExecutionInput(pipelineName: java.lang.String, pipelineExecutionId: java.lang.String)
final case class ErrorDetails(code: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None)
case object ApprovalAlreadyCompletedException
final case class CreatePipelineOutput(pipeline: scala.Option[models.PipelineDeclaration] = None)
final case class ApprovalResult(summary: java.lang.String, status: java.lang.String)
final case class ThirdPartyJobData(actionConfiguration: scala.Option[models.ActionConfiguration] = None, artifactCredentials: scala.Option[models.AWSSessionCredentials] = None, encryptionKey: scala.Option[models.EncryptionKey] = None, actionTypeId: scala.Option[models.ActionTypeId] = None, inputArtifacts: scala.Option[scala.List[models.Artifact]] = None, outputArtifacts: scala.Option[scala.List[models.Artifact]] = None, continuationToken: scala.Option[java.lang.String] = None, pipelineContext: scala.Option[models.PipelineContext] = None)
final case class ActionRevision(revisionId: java.lang.String, revisionChangeId: java.lang.String, created: java.time.Instant)
final case class StageContext(name: scala.Option[java.lang.String] = None)
final case class PipelineMetadata(pipelineArn: scala.Option[java.lang.String] = None, created: scala.Option[java.time.Instant] = None, updated: scala.Option[java.time.Instant] = None)
final case class PutJobFailureResultInput(jobId: java.lang.String, failureDetails: models.FailureDetails)
final case class PutApprovalResultInput(stageName: java.lang.String, pipelineName: java.lang.String, actionName: java.lang.String, result: models.ApprovalResult, token: java.lang.String)
final case class DisableStageTransitionInput(pipelineName: java.lang.String, stageName: java.lang.String, transitionType: java.lang.String, reason: java.lang.String)
final case class ListActionTypesInput(actionOwnerFilter: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidActionDeclarationException
final case class GetThirdPartyJobDetailsInput(jobId: java.lang.String, clientToken: java.lang.String)
case object JobNotFoundException
final case class ActionState(actionName: scala.Option[java.lang.String] = None, currentRevision: scala.Option[models.ActionRevision] = None, latestExecution: scala.Option[models.ActionExecution] = None, entityUrl: scala.Option[java.lang.String] = None, revisionUrl: scala.Option[java.lang.String] = None)
final case class ActionConfigurationProperty(name: java.lang.String, required: scala.Boolean, key: scala.Boolean, secret: scala.Boolean, queryable: scala.Option[scala.Boolean] = None, description: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None)
final case class JobData(actionConfiguration: scala.Option[models.ActionConfiguration] = None, artifactCredentials: scala.Option[models.AWSSessionCredentials] = None, encryptionKey: scala.Option[models.EncryptionKey] = None, actionTypeId: scala.Option[models.ActionTypeId] = None, inputArtifacts: scala.Option[scala.List[models.Artifact]] = None, outputArtifacts: scala.Option[scala.List[models.Artifact]] = None, continuationToken: scala.Option[java.lang.String] = None, pipelineContext: scala.Option[models.PipelineContext] = None)
final case class EncryptionKey(id: java.lang.String, `type`: java.lang.String)
final case class PutThirdPartyJobSuccessResultInput(clientToken: java.lang.String, jobId: java.lang.String, currentRevision: scala.Option[models.CurrentRevision] = None, continuationToken: scala.Option[java.lang.String] = None, executionDetails: scala.Option[models.ExecutionDetails] = None)
final case class GetPipelineStateOutput(pipelineName: scala.Option[java.lang.String] = None, pipelineVersion: scala.Option[scala.Int] = None, stageStates: scala.Option[scala.List[models.StageState]] = None, created: scala.Option[java.time.Instant] = None, updated: scala.Option[java.time.Instant] = None)
final case class ActionType(id: models.ActionTypeId, inputArtifactDetails: models.ArtifactDetails, outputArtifactDetails: models.ArtifactDetails, settings: scala.Option[models.ActionTypeSettings] = None, actionConfigurationProperties: scala.Option[scala.List[models.ActionConfigurationProperty]] = None)
case object LimitExceededException
final case class StageDeclaration(name: java.lang.String, actions: scala.List[models.ActionDeclaration], blockers: scala.Option[scala.List[models.BlockerDeclaration]] = None)
case object PipelineExecutionNotFoundException
final case class PipelineExecutionSummary(pipelineExecutionId: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, startTime: scala.Option[java.time.Instant] = None, lastUpdateTime: scala.Option[java.time.Instant] = None)
final case class S3ArtifactLocation(bucketName: java.lang.String, objectKey: java.lang.String)
final case class GetThirdPartyJobDetailsOutput(jobDetails: scala.Option[models.ThirdPartyJobDetails] = None)
final case class PutActionRevisionOutput(newRevision: scala.Option[scala.Boolean] = None, pipelineExecutionId: scala.Option[java.lang.String] = None)
final case class ActionTypeId(category: java.lang.String, owner: java.lang.String, provider: java.lang.String, version: java.lang.String)
final case class DeleteCustomActionTypeInput(category: java.lang.String, provider: java.lang.String, version: java.lang.String)
final case class GetPipelineStateInput(name: java.lang.String)
final case class PutApprovalResultOutput(approvedAt: scala.Option[java.time.Instant] = None)
final case class ActionTypeSettings(thirdPartyConfigurationUrl: scala.Option[java.lang.String] = None, entityUrlTemplate: scala.Option[java.lang.String] = None, executionUrlTemplate: scala.Option[java.lang.String] = None, revisionUrlTemplate: scala.Option[java.lang.String] = None)
final case class ListPipelineExecutionsInput(pipelineName: java.lang.String, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListPipelineExecutionsOutput(pipelineExecutionSummaries: scala.Option[scala.List[models.PipelineExecutionSummary]] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidStageDeclarationException
final case class Artifact(name: scala.Option[java.lang.String] = None, revision: scala.Option[java.lang.String] = None, location: scala.Option[models.ArtifactLocation] = None)
final case class OutputArtifact(name: java.lang.String)
final case class GetPipelineOutput(pipeline: scala.Option[models.PipelineDeclaration] = None, metadata: scala.Option[models.PipelineMetadata] = None)
case object NotLatestPipelineExecutionException
final case class CreatePipelineInput(pipeline: models.PipelineDeclaration)
final case class AcknowledgeThirdPartyJobInput(jobId: java.lang.String, nonce: java.lang.String, clientToken: java.lang.String)
final case class PipelineSummary(name: scala.Option[java.lang.String] = None, version: scala.Option[scala.Int] = None, created: scala.Option[java.time.Instant] = None, updated: scala.Option[java.time.Instant] = None)
final case class RetryStageExecutionInput(pipelineName: java.lang.String, stageName: java.lang.String, pipelineExecutionId: java.lang.String, retryMode: java.lang.String)
final case class UpdatePipelineInput(pipeline: models.PipelineDeclaration)
final case class ExecutionDetails(summary: scala.Option[java.lang.String] = None, externalExecutionId: scala.Option[java.lang.String] = None, percentComplete: scala.Option[scala.Int] = None)
final case class ArtifactRevision(created: scala.Option[java.time.Instant] = None, revisionUrl: scala.Option[java.lang.String] = None, revisionSummary: scala.Option[java.lang.String] = None, revisionChangeIdentifier: scala.Option[java.lang.String] = None, revisionId: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None)
final case class PollForThirdPartyJobsInput(actionTypeId: models.ActionTypeId, maxBatchSize: scala.Option[scala.Int] = None)
final case class PollForThirdPartyJobsOutput(jobs: scala.Option[scala.List[models.ThirdPartyJob]] = None)
final case class PutThirdPartyJobFailureResultInput(jobId: java.lang.String, clientToken: java.lang.String, failureDetails: models.FailureDetails)
final case class RetryStageExecutionOutput(pipelineExecutionId: scala.Option[java.lang.String] = None)
final case class TransitionState(enabled: scala.Option[scala.Boolean] = None, lastChangedBy: scala.Option[java.lang.String] = None, lastChangedAt: scala.Option[java.time.Instant] = None, disabledReason: scala.Option[java.lang.String] = None)
final case class PollForJobsInput(actionTypeId: models.ActionTypeId, maxBatchSize: scala.Option[scala.Int] = None, queryParam: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None)
final case class PipelineDeclaration(roleArn: java.lang.String, name: java.lang.String, stages: scala.List[models.StageDeclaration], artifactStore: models.ArtifactStore, version: scala.Option[scala.Int] = None)
case object InvalidJobStateException
final case class GetJobDetailsInput(jobId: java.lang.String)
final case class GetPipelineInput(name: java.lang.String, version: scala.Option[scala.Int] = None)
case object ActionTypeNotFoundException
case object ActionNotFoundException
case object PipelineNotFoundException
final case class PipelineContext(pipelineName: scala.Option[java.lang.String] = None, stage: scala.Option[models.StageContext] = None, action: scala.Option[models.ActionContext] = None)
final case class FailureDetails(`type`: java.lang.String, message: java.lang.String, externalExecutionId: scala.Option[java.lang.String] = None)
final case class ListPipelinesInput(nextToken: scala.Option[java.lang.String] = None)
final case class ArtifactDetails(minimumCount: scala.Int, maximumCount: scala.Int)
final case class PutActionRevisionInput(pipelineName: java.lang.String, stageName: java.lang.String, actionName: java.lang.String, actionRevision: models.ActionRevision)
final case class ArtifactStore(`type`: java.lang.String, location: java.lang.String, encryptionKey: scala.Option[models.EncryptionKey] = None)