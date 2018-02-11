package org.lyranthe.araethura.codebuild
trait Amazoncodebuild[F[_]] {
  def listCuratedEnvironmentImages: F[models.ListCuratedEnvironmentImagesOutput]
  def createProject(input: models.CreateProjectInput): F[models.CreateProjectOutput]
  def listProjects(input: models.ListProjectsInput): F[models.ListProjectsOutput]
  def batchGetBuilds(input: models.BatchGetBuildsInput): F[models.BatchGetBuildsOutput]
  def createWebhook(input: models.CreateWebhookInput): F[models.CreateWebhookOutput]
  def listBuildsForProject(input: models.ListBuildsForProjectInput): F[models.ListBuildsForProjectOutput]
  def batchGetProjects(input: models.BatchGetProjectsInput): F[models.BatchGetProjectsOutput]
  def listBuilds(input: models.ListBuildsInput): F[models.ListBuildsOutput]
  def deleteWebhook(input: models.DeleteWebhookInput): F[scala.Unit]
  def stopBuild(input: models.StopBuildInput): F[models.StopBuildOutput]
  def deleteProject(input: models.DeleteProjectInput): F[scala.Unit]
  def batchDeleteBuilds(input: models.BatchDeleteBuildsInput): F[models.BatchDeleteBuildsOutput]
  def startBuild(input: models.StartBuildInput): F[models.StartBuildOutput]
  def updateProject(input: models.UpdateProjectInput): F[models.UpdateProjectOutput]
}