package org.lyranthe.araethura.codebuild.models
import org.lyranthe.araethura.codebuild.models
final case class LogsLocation(groupName: scala.Option[java.lang.String] = None, streamName: scala.Option[java.lang.String] = None, deepLink: scala.Option[java.lang.String] = None)
final case class ListCuratedEnvironmentImagesOutput(platforms: scala.Option[scala.List[models.EnvironmentPlatform]] = None)
final case class EnvironmentImage(name: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class StartBuildInput(projectName: java.lang.String, sourceVersion: scala.Option[java.lang.String] = None, buildspecOverride: scala.Option[java.lang.String] = None, artifactsOverride: scala.Option[models.ProjectArtifacts] = None, timeoutInMinutesOverride: scala.Option[scala.Int] = None, environmentVariablesOverride: scala.Option[scala.List[models.EnvironmentVariable]] = None)
final case class StopBuildInput(id: java.lang.String)
final case class DeleteWebhookInput(projectName: java.lang.String)
final case class BatchDeleteBuildsInput(ids: scala.List[java.lang.String])
final case class CreateProjectOutput(project: scala.Option[models.Project] = None)
final case class BatchGetProjectsOutput(projects: scala.Option[scala.List[models.Project]] = None, projectsNotFound: scala.Option[scala.List[java.lang.String]] = None)
final case class ListBuildsForProjectInput(projectName: java.lang.String, sortOrder: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class BuildPhase(startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, contexts: scala.Option[scala.List[models.PhaseContext]] = None, phaseType: scala.Option[java.lang.String] = None, phaseStatus: scala.Option[java.lang.String] = None, durationInSeconds: scala.Option[scala.Long] = None)
final case class SourceAuth(`type`: java.lang.String, resource: scala.Option[java.lang.String] = None)
final case class EnvironmentPlatform(platform: scala.Option[java.lang.String] = None, languages: scala.Option[scala.List[models.EnvironmentLanguage]] = None)
case object ResourceNotFoundException
case object ListCuratedEnvironmentImagesInput
final case class CreateWebhookInput(projectName: java.lang.String)
final case class ProjectEnvironment(image: java.lang.String, computeType: java.lang.String, `type`: java.lang.String, privilegedMode: scala.Option[scala.Boolean] = None, environmentVariables: scala.Option[scala.List[models.EnvironmentVariable]] = None)
final case class BuildNotDeleted(id: scala.Option[java.lang.String] = None, statusCode: scala.Option[java.lang.String] = None)
final case class ListBuildsForProjectOutput(ids: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DeleteProjectInput(name: java.lang.String)
final case class UpdateProjectOutput(project: scala.Option[models.Project] = None)
final case class EnvironmentLanguage(language: scala.Option[java.lang.String] = None, images: scala.Option[scala.List[models.EnvironmentImage]] = None)
final case class StopBuildOutput(build: scala.Option[models.Build] = None)
case object DeleteProjectOutput
final case class ProjectArtifacts(`type`: java.lang.String, location: scala.Option[java.lang.String] = None, path: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, namespaceType: scala.Option[java.lang.String] = None, packaging: scala.Option[java.lang.String] = None)
final case class ProjectSource(`type`: java.lang.String, location: scala.Option[java.lang.String] = None, buildspec: scala.Option[java.lang.String] = None, auth: scala.Option[models.SourceAuth] = None)
final case class BatchGetBuildsInput(ids: scala.List[java.lang.String])
case object DeleteWebhookOutput
final case class BatchDeleteBuildsOutput(buildsDeleted: scala.Option[scala.List[java.lang.String]] = None, buildsNotDeleted: scala.Option[scala.List[models.BuildNotDeleted]] = None)
final case class BuildArtifacts(location: scala.Option[java.lang.String] = None, sha256sum: scala.Option[java.lang.String] = None, md5sum: scala.Option[java.lang.String] = None)
final case class StartBuildOutput(build: scala.Option[models.Build] = None)
final case class BatchGetBuildsOutput(builds: scala.Option[scala.List[models.Build]] = None, buildsNotFound: scala.Option[scala.List[java.lang.String]] = None)
final case class CreateProjectInput(environment: models.ProjectEnvironment, artifacts: models.ProjectArtifacts, source: models.ProjectSource, name: java.lang.String, description: scala.Option[java.lang.String] = None, serviceRole: scala.Option[java.lang.String] = None, encryptionKey: scala.Option[java.lang.String] = None, tags: scala.Option[scala.List[models.Tag]] = None, timeoutInMinutes: scala.Option[scala.Int] = None)
case object InvalidInputException
final case class BatchGetProjectsInput(names: scala.List[java.lang.String])
final case class ListBuildsOutput(ids: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListProjectsOutput(nextToken: scala.Option[java.lang.String] = None, projects: scala.Option[scala.List[java.lang.String]] = None)
case object ResourceAlreadyExistsException
final case class Tag(key: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None)
case object AccountLimitExceededException
final case class PhaseContext(statusCode: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None)
final case class UpdateProjectInput(name: java.lang.String, description: scala.Option[java.lang.String] = None, serviceRole: scala.Option[java.lang.String] = None, encryptionKey: scala.Option[java.lang.String] = None, tags: scala.Option[scala.List[models.Tag]] = None, environment: scala.Option[models.ProjectEnvironment] = None, artifacts: scala.Option[models.ProjectArtifacts] = None, source: scala.Option[models.ProjectSource] = None, timeoutInMinutes: scala.Option[scala.Int] = None)
final case class Project(created: scala.Option[java.time.Instant] = None, lastModified: scala.Option[java.time.Instant] = None, description: scala.Option[java.lang.String] = None, serviceRole: scala.Option[java.lang.String] = None, encryptionKey: scala.Option[java.lang.String] = None, tags: scala.Option[scala.List[models.Tag]] = None, arn: scala.Option[java.lang.String] = None, environment: scala.Option[models.ProjectEnvironment] = None, artifacts: scala.Option[models.ProjectArtifacts] = None, source: scala.Option[models.ProjectSource] = None, timeoutInMinutes: scala.Option[scala.Int] = None, webhook: scala.Option[models.Webhook] = None, name: scala.Option[java.lang.String] = None)
final case class ListProjectsInput(sortBy: scala.Option[java.lang.String] = None, sortOrder: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Webhook(url: scala.Option[java.lang.String] = None)
final case class EnvironmentVariable(name: java.lang.String, value: java.lang.String, `type`: scala.Option[java.lang.String] = None)
case object OAuthProviderException
final case class CreateWebhookOutput(webhook: scala.Option[models.Webhook] = None)
final case class ListBuildsInput(sortOrder: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Build(logs: scala.Option[models.LogsLocation] = None, startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, id: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, sourceVersion: scala.Option[java.lang.String] = None, projectName: scala.Option[java.lang.String] = None, currentPhase: scala.Option[java.lang.String] = None, initiator: scala.Option[java.lang.String] = None, timeoutInMinutes: scala.Option[scala.Int] = None, environment: scala.Option[models.ProjectEnvironment] = None, buildStatus: scala.Option[java.lang.String] = None, source: scala.Option[models.ProjectSource] = None, artifacts: scala.Option[models.BuildArtifacts] = None, phases: scala.Option[scala.List[models.BuildPhase]] = None, buildComplete: scala.Option[scala.Boolean] = None)