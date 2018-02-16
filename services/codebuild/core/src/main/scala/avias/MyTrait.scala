package avias.codebuild
trait Amazoncodebuild[F[_]] {
  def listCuratedEnvironmentImages: F[avias.codebuild.models.ListCuratedEnvironmentImagesOutput]
  def createProject(input: avias.codebuild.models.CreateProjectInput): F[avias.codebuild.models.CreateProjectOutput]
  def listProjects(input: avias.codebuild.models.ListProjectsInput): F[avias.codebuild.models.ListProjectsOutput]
  def batchGetBuilds(input: avias.codebuild.models.BatchGetBuildsInput): F[avias.codebuild.models.BatchGetBuildsOutput]
  def createWebhook(input: avias.codebuild.models.CreateWebhookInput): F[avias.codebuild.models.CreateWebhookOutput]
  def listBuildsForProject(input: avias.codebuild.models.ListBuildsForProjectInput): F[avias.codebuild.models.ListBuildsForProjectOutput]
  def batchGetProjects(input: avias.codebuild.models.BatchGetProjectsInput): F[avias.codebuild.models.BatchGetProjectsOutput]
  def listBuilds(input: avias.codebuild.models.ListBuildsInput): F[avias.codebuild.models.ListBuildsOutput]
  def deleteWebhook(input: avias.codebuild.models.DeleteWebhookInput): F[scala.Unit]
  def stopBuild(input: avias.codebuild.models.StopBuildInput): F[avias.codebuild.models.StopBuildOutput]
  def deleteProject(input: avias.codebuild.models.DeleteProjectInput): F[scala.Unit]
  def batchDeleteBuilds(input: avias.codebuild.models.BatchDeleteBuildsInput): F[avias.codebuild.models.BatchDeleteBuildsOutput]
  def startBuild(input: avias.codebuild.models.StartBuildInput): F[avias.codebuild.models.StartBuildOutput]
  def updateProject(input: avias.codebuild.models.UpdateProjectInput): F[avias.codebuild.models.UpdateProjectOutput]
}