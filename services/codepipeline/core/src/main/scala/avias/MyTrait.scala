package avias.codepipeline
trait Amazoncodepipeline[F[_]] {
  def listPipelineExecutions(input: avias.codepipeline.models.ListPipelineExecutionsInput): F[avias.codepipeline.models.ListPipelineExecutionsOutput]
  def createCustomActionType(input: avias.codepipeline.models.CreateCustomActionTypeInput): F[avias.codepipeline.models.CreateCustomActionTypeOutput]
  def putActionRevision(input: avias.codepipeline.models.PutActionRevisionInput): F[avias.codepipeline.models.PutActionRevisionOutput]
  def acknowledgeJob(input: avias.codepipeline.models.AcknowledgeJobInput): F[avias.codepipeline.models.AcknowledgeJobOutput]
  def putApprovalResult(input: avias.codepipeline.models.PutApprovalResultInput): F[avias.codepipeline.models.PutApprovalResultOutput]
  def putJobFailureResult(input: avias.codepipeline.models.PutJobFailureResultInput): F[scala.Unit]
  def listActionTypes(input: avias.codepipeline.models.ListActionTypesInput): F[avias.codepipeline.models.ListActionTypesOutput]
  def putThirdPartyJobSuccessResult(input: avias.codepipeline.models.PutThirdPartyJobSuccessResultInput): F[scala.Unit]
  def pollForJobs(input: avias.codepipeline.models.PollForJobsInput): F[avias.codepipeline.models.PollForJobsOutput]
  def acknowledgeThirdPartyJob(input: avias.codepipeline.models.AcknowledgeThirdPartyJobInput): F[avias.codepipeline.models.AcknowledgeThirdPartyJobOutput]
  def deleteCustomActionType(input: avias.codepipeline.models.DeleteCustomActionTypeInput): F[scala.Unit]
  def putThirdPartyJobFailureResult(input: avias.codepipeline.models.PutThirdPartyJobFailureResultInput): F[scala.Unit]
  def listPipelines(input: avias.codepipeline.models.ListPipelinesInput): F[avias.codepipeline.models.ListPipelinesOutput]
  def startPipelineExecution(input: avias.codepipeline.models.StartPipelineExecutionInput): F[avias.codepipeline.models.StartPipelineExecutionOutput]
  def getThirdPartyJobDetails(input: avias.codepipeline.models.GetThirdPartyJobDetailsInput): F[avias.codepipeline.models.GetThirdPartyJobDetailsOutput]
  def deletePipeline(input: avias.codepipeline.models.DeletePipelineInput): F[scala.Unit]
  def enableStageTransition(input: avias.codepipeline.models.EnableStageTransitionInput): F[scala.Unit]
  def createPipeline(input: avias.codepipeline.models.CreatePipelineInput): F[avias.codepipeline.models.CreatePipelineOutput]
  def getPipeline(input: avias.codepipeline.models.GetPipelineInput): F[avias.codepipeline.models.GetPipelineOutput]
  def pollForThirdPartyJobs(input: avias.codepipeline.models.PollForThirdPartyJobsInput): F[avias.codepipeline.models.PollForThirdPartyJobsOutput]
  def getPipelineExecution(input: avias.codepipeline.models.GetPipelineExecutionInput): F[avias.codepipeline.models.GetPipelineExecutionOutput]
  def updatePipeline(input: avias.codepipeline.models.UpdatePipelineInput): F[avias.codepipeline.models.UpdatePipelineOutput]
  def retryStageExecution(input: avias.codepipeline.models.RetryStageExecutionInput): F[avias.codepipeline.models.RetryStageExecutionOutput]
  def getJobDetails(input: avias.codepipeline.models.GetJobDetailsInput): F[avias.codepipeline.models.GetJobDetailsOutput]
  def disableStageTransition(input: avias.codepipeline.models.DisableStageTransitionInput): F[scala.Unit]
  def getPipelineState(input: avias.codepipeline.models.GetPipelineStateInput): F[avias.codepipeline.models.GetPipelineStateOutput]
  def putJobSuccessResult(input: avias.codepipeline.models.PutJobSuccessResultInput): F[scala.Unit]
}