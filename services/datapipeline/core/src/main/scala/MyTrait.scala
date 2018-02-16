package avias.datapipeline
trait Amazondatapipeline[F[_]] {
  def deactivatePipeline(input: avias.datapipeline.models.DeactivatePipelineInput): F[scala.Unit]
  def queryObjects(input: avias.datapipeline.models.QueryObjectsInput): F[avias.datapipeline.models.QueryObjectsOutput]
  def putPipelineDefinition(input: avias.datapipeline.models.PutPipelineDefinitionInput): F[avias.datapipeline.models.PutPipelineDefinitionOutput]
  def evaluateExpression(input: avias.datapipeline.models.EvaluateExpressionInput): F[avias.datapipeline.models.EvaluateExpressionOutput]
  def reportTaskRunnerHeartbeat(input: avias.datapipeline.models.ReportTaskRunnerHeartbeatInput): F[avias.datapipeline.models.ReportTaskRunnerHeartbeatOutput]
  def getPipelineDefinition(input: avias.datapipeline.models.GetPipelineDefinitionInput): F[avias.datapipeline.models.GetPipelineDefinitionOutput]
  def reportTaskProgress(input: avias.datapipeline.models.ReportTaskProgressInput): F[avias.datapipeline.models.ReportTaskProgressOutput]
  def validatePipelineDefinition(input: avias.datapipeline.models.ValidatePipelineDefinitionInput): F[avias.datapipeline.models.ValidatePipelineDefinitionOutput]
  def deletePipeline(input: avias.datapipeline.models.DeletePipelineInput): F[scala.Unit]
  def pollForTask(input: avias.datapipeline.models.PollForTaskInput): F[avias.datapipeline.models.PollForTaskOutput]
  def activatePipeline(input: avias.datapipeline.models.ActivatePipelineInput): F[scala.Unit]
  def setStatus(input: avias.datapipeline.models.SetStatusInput): F[scala.Unit]
  def setTaskStatus(input: avias.datapipeline.models.SetTaskStatusInput): F[scala.Unit]
  def describeObjects(input: avias.datapipeline.models.DescribeObjectsInput): F[avias.datapipeline.models.DescribeObjectsOutput]
  def removeTags(input: avias.datapipeline.models.RemoveTagsInput): F[scala.Unit]
  def addTags(input: avias.datapipeline.models.AddTagsInput): F[scala.Unit]
  def describePipelines(input: avias.datapipeline.models.DescribePipelinesInput): F[avias.datapipeline.models.DescribePipelinesOutput]
  def listPipelines(input: avias.datapipeline.models.ListPipelinesInput): F[avias.datapipeline.models.ListPipelinesOutput]
  def createPipeline(input: avias.datapipeline.models.CreatePipelineInput): F[avias.datapipeline.models.CreatePipelineOutput]
}