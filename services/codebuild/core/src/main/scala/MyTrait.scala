package org.lyranthe.araethura.codebuild
trait Amazoncodebuild[F[_]] {
  def listCuratedEnvironmentImages: F[org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesOutput]
  def createProject(input: org.lyranthe.araethura.codebuild.models.CreateProjectInput): F[org.lyranthe.araethura.codebuild.models.CreateProjectOutput]
  def listProjects(input: org.lyranthe.araethura.codebuild.models.ListProjectsInput): F[org.lyranthe.araethura.codebuild.models.ListProjectsOutput]
  def batchGetBuilds(input: org.lyranthe.araethura.codebuild.models.BatchGetBuildsInput): F[org.lyranthe.araethura.codebuild.models.BatchGetBuildsOutput]
  def createWebhook(input: org.lyranthe.araethura.codebuild.models.CreateWebhookInput): F[org.lyranthe.araethura.codebuild.models.CreateWebhookOutput]
  def listBuildsForProject(input: org.lyranthe.araethura.codebuild.models.ListBuildsForProjectInput): F[org.lyranthe.araethura.codebuild.models.ListBuildsForProjectOutput]
  def batchGetProjects(input: org.lyranthe.araethura.codebuild.models.BatchGetProjectsInput): F[org.lyranthe.araethura.codebuild.models.BatchGetProjectsOutput]
  def listBuilds(input: org.lyranthe.araethura.codebuild.models.ListBuildsInput): F[org.lyranthe.araethura.codebuild.models.ListBuildsOutput]
  def deleteWebhook(input: org.lyranthe.araethura.codebuild.models.DeleteWebhookInput): F[scala.Unit]
  def stopBuild(input: org.lyranthe.araethura.codebuild.models.StopBuildInput): F[org.lyranthe.araethura.codebuild.models.StopBuildOutput]
  def deleteProject(input: org.lyranthe.araethura.codebuild.models.DeleteProjectInput): F[scala.Unit]
  def batchDeleteBuilds(input: org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsInput): F[org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsOutput]
  def startBuild(input: org.lyranthe.araethura.codebuild.models.StartBuildInput): F[org.lyranthe.araethura.codebuild.models.StartBuildOutput]
  def updateProject(input: org.lyranthe.araethura.codebuild.models.UpdateProjectInput): F[org.lyranthe.araethura.codebuild.models.UpdateProjectOutput]
}