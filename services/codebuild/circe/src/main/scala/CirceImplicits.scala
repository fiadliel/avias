package org.lyranthe.araethura.codebuild
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val LogsLocationEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.LogsLocation] = io.circe.Encoder.instance { o => 
    Json.obj("groupName" -> o.groupName.asJson, "streamName" -> o.streamName.asJson, "deepLink" -> o.deepLink.asJson)
  }
  final implicit val ListCuratedEnvironmentImagesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("platforms" -> o.platforms.asJson)
  }
  final implicit val EnvironmentImageEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.EnvironmentImage] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val StartBuildInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.StartBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson, "sourceVersion" -> o.sourceVersion.asJson, "buildspecOverride" -> o.buildspecOverride.asJson, "artifactsOverride" -> o.artifactsOverride.asJson, "timeoutInMinutesOverride" -> o.timeoutInMinutesOverride.asJson, "environmentVariablesOverride" -> o.environmentVariablesOverride.asJson)
  }
  final implicit val StopBuildInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.StopBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson)
  }
  final implicit val DeleteWebhookInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.DeleteWebhookInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson)
  }
  final implicit val BatchDeleteBuildsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson)
  }
  final implicit val CreateProjectOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.CreateProjectOutput] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val BatchGetProjectsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BatchGetProjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("projects" -> o.projects.asJson, "projectsNotFound" -> o.projectsNotFound.asJson)
  }
  final implicit val ListBuildsForProjectInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListBuildsForProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson, "sortOrder" -> o.sortOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BuildPhaseEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BuildPhase] = io.circe.Encoder.instance { o => 
    Json.obj("startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "contexts" -> o.contexts.asJson, "phaseType" -> o.phaseType.asJson, "phaseStatus" -> o.phaseStatus.asJson, "durationInSeconds" -> o.durationInSeconds.asJson)
  }
  final implicit val SourceAuthEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.SourceAuth] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "resource" -> o.resource.asJson)
  }
  final implicit val EnvironmentPlatformEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.EnvironmentPlatform] = io.circe.Encoder.instance { o => 
    Json.obj("platform" -> o.platform.asJson, "languages" -> o.languages.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListCuratedEnvironmentImagesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateWebhookInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.CreateWebhookInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson)
  }
  final implicit val ProjectEnvironmentEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ProjectEnvironment] = io.circe.Encoder.instance { o => 
    Json.obj("image" -> o.image.asJson, "computeType" -> o.computeType.asJson, "type" -> o.`type`.asJson, "privilegedMode" -> o.privilegedMode.asJson, "environmentVariables" -> o.environmentVariables.asJson)
  }
  final implicit val BuildNotDeletedEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BuildNotDeleted] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "statusCode" -> o.statusCode.asJson)
  }
  final implicit val ListBuildsForProjectOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListBuildsForProjectOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteProjectInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.DeleteProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val UpdateProjectOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.UpdateProjectOutput] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val EnvironmentLanguageEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.EnvironmentLanguage] = io.circe.Encoder.instance { o => 
    Json.obj("language" -> o.language.asJson, "images" -> o.images.asJson)
  }
  final implicit val StopBuildOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.StopBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("build" -> o.build.asJson)
  }
  final implicit val DeleteProjectOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.DeleteProjectOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProjectArtifactsEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ProjectArtifacts] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "path" -> o.path.asJson, "name" -> o.name.asJson, "namespaceType" -> o.namespaceType.asJson, "packaging" -> o.packaging.asJson)
  }
  final implicit val ProjectSourceEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ProjectSource] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "buildspec" -> o.buildspec.asJson, "auth" -> o.auth.asJson)
  }
  final implicit val BatchGetBuildsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BatchGetBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson)
  }
  final implicit val DeleteWebhookOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.DeleteWebhookOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchDeleteBuildsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("buildsDeleted" -> o.buildsDeleted.asJson, "buildsNotDeleted" -> o.buildsNotDeleted.asJson)
  }
  final implicit val BuildArtifactsEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BuildArtifacts] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "sha256sum" -> o.sha256sum.asJson, "md5sum" -> o.md5sum.asJson)
  }
  final implicit val StartBuildOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.StartBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("build" -> o.build.asJson)
  }
  final implicit val BatchGetBuildsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BatchGetBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("builds" -> o.builds.asJson, "buildsNotFound" -> o.buildsNotFound.asJson)
  }
  final implicit val CreateProjectInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.CreateProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("environment" -> o.environment.asJson, "artifacts" -> o.artifacts.asJson, "source" -> o.source.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson, "serviceRole" -> o.serviceRole.asJson, "encryptionKey" -> o.encryptionKey.asJson, "tags" -> o.tags.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.InvalidInputException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetProjectsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.BatchGetProjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("names" -> o.names.asJson)
  }
  final implicit val ListBuildsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListProjectsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListProjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "projects" -> o.projects.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ResourceAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val AccountLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.AccountLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PhaseContextEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.PhaseContext] = io.circe.Encoder.instance { o => 
    Json.obj("statusCode" -> o.statusCode.asJson, "message" -> o.message.asJson)
  }
  final implicit val UpdateProjectInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.UpdateProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "description" -> o.description.asJson, "serviceRole" -> o.serviceRole.asJson, "encryptionKey" -> o.encryptionKey.asJson, "tags" -> o.tags.asJson, "environment" -> o.environment.asJson, "artifacts" -> o.artifacts.asJson, "source" -> o.source.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson)
  }
  final implicit val ProjectEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.Project] = io.circe.Encoder.instance { o => 
    Json.obj("created" -> o.created.asJson, "lastModified" -> o.lastModified.asJson, "description" -> o.description.asJson, "serviceRole" -> o.serviceRole.asJson, "encryptionKey" -> o.encryptionKey.asJson, "tags" -> o.tags.asJson, "arn" -> o.arn.asJson, "environment" -> o.environment.asJson, "artifacts" -> o.artifacts.asJson, "source" -> o.source.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson, "webhook" -> o.webhook.asJson, "name" -> o.name.asJson)
  }
  final implicit val ListProjectsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListProjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("sortBy" -> o.sortBy.asJson, "sortOrder" -> o.sortOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val WebhookEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.Webhook] = io.circe.Encoder.instance { o => 
    Json.obj("url" -> o.url.asJson)
  }
  final implicit val EnvironmentVariableEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.EnvironmentVariable] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "value" -> o.value.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val OAuthProviderExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.OAuthProviderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateWebhookOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.CreateWebhookOutput] = io.circe.Encoder.instance { o => 
    Json.obj("webhook" -> o.webhook.asJson)
  }
  final implicit val ListBuildsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.ListBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("sortOrder" -> o.sortOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BuildEncoder: io.circe.Encoder[org.lyranthe.araethura.codebuild.models.Build] = io.circe.Encoder.instance { o => 
    Json.obj("logs" -> o.logs.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "id" -> o.id.asJson, "arn" -> o.arn.asJson, "sourceVersion" -> o.sourceVersion.asJson, "projectName" -> o.projectName.asJson, "currentPhase" -> o.currentPhase.asJson, "initiator" -> o.initiator.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson, "environment" -> o.environment.asJson, "buildStatus" -> o.buildStatus.asJson, "source" -> o.source.asJson, "artifacts" -> o.artifacts.asJson, "phases" -> o.phases.asJson, "buildComplete" -> o.buildComplete.asJson)
  }
  final implicit val LogsLocationDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.LogsLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("groupName"), o.get[scala.Option[java.lang.String]]("streamName"), o.get[scala.Option[java.lang.String]]("deepLink")).mapN(org.lyranthe.araethura.codebuild.models.LogsLocation.apply _)
  }
  final implicit val ListCuratedEnvironmentImagesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentPlatform]]]("platforms").map(org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesOutput.apply _)
  }
  final implicit val EnvironmentImageDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.EnvironmentImage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(org.lyranthe.araethura.codebuild.models.EnvironmentImage.apply _)
  }
  final implicit val StartBuildInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.StartBuildInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectName"), o.get[scala.Option[java.lang.String]]("sourceVersion"), o.get[scala.Option[java.lang.String]]("buildspecOverride"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectArtifacts]]("artifactsOverride"), o.get[scala.Option[scala.Int]]("timeoutInMinutesOverride"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentVariable]]]("environmentVariablesOverride")).mapN(org.lyranthe.araethura.codebuild.models.StartBuildInput.apply _)
  }
  final implicit val StopBuildInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.StopBuildInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("id").map(org.lyranthe.araethura.codebuild.models.StopBuildInput.apply _)
  }
  final implicit val DeleteWebhookInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.DeleteWebhookInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("projectName").map(org.lyranthe.araethura.codebuild.models.DeleteWebhookInput.apply _)
  }
  final implicit val BatchDeleteBuildsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("ids").map(org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsInput.apply _)
  }
  final implicit val CreateProjectOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.CreateProjectOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codebuild.models.Project]]("project").map(org.lyranthe.araethura.codebuild.models.CreateProjectOutput.apply _)
  }
  final implicit val BatchGetProjectsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BatchGetProjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Project]]]("projects"), o.get[scala.Option[scala.List[java.lang.String]]]("projectsNotFound")).mapN(org.lyranthe.araethura.codebuild.models.BatchGetProjectsOutput.apply _)
  }
  final implicit val ListBuildsForProjectInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListBuildsForProjectInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectName"), o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codebuild.models.ListBuildsForProjectInput.apply _)
  }
  final implicit val BuildPhaseDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BuildPhase] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.PhaseContext]]]("contexts"), o.get[scala.Option[java.lang.String]]("phaseType"), o.get[scala.Option[java.lang.String]]("phaseStatus"), o.get[scala.Option[scala.Long]]("durationInSeconds")).mapN(org.lyranthe.araethura.codebuild.models.BuildPhase.apply _)
  }
  final implicit val SourceAuthDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.SourceAuth] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("resource")).mapN(org.lyranthe.araethura.codebuild.models.SourceAuth.apply _)
  }
  final implicit val EnvironmentPlatformDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.EnvironmentPlatform] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentLanguage]]]("languages")).mapN(org.lyranthe.araethura.codebuild.models.EnvironmentPlatform.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.ResourceNotFoundException)
  final implicit val ListCuratedEnvironmentImagesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesInput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.ListCuratedEnvironmentImagesInput)
  final implicit val CreateWebhookInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.CreateWebhookInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("projectName").map(org.lyranthe.araethura.codebuild.models.CreateWebhookInput.apply _)
  }
  final implicit val ProjectEnvironmentDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ProjectEnvironment] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("image"), o.get[java.lang.String]("computeType"), o.get[java.lang.String]("type"), o.get[scala.Option[scala.Boolean]]("privilegedMode"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentVariable]]]("environmentVariables")).mapN(org.lyranthe.araethura.codebuild.models.ProjectEnvironment.apply _)
  }
  final implicit val BuildNotDeletedDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BuildNotDeleted] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("statusCode")).mapN(org.lyranthe.araethura.codebuild.models.BuildNotDeleted.apply _)
  }
  final implicit val ListBuildsForProjectOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListBuildsForProjectOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ids"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codebuild.models.ListBuildsForProjectOutput.apply _)
  }
  final implicit val DeleteProjectInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.DeleteProjectInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(org.lyranthe.araethura.codebuild.models.DeleteProjectInput.apply _)
  }
  final implicit val UpdateProjectOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.UpdateProjectOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codebuild.models.Project]]("project").map(org.lyranthe.araethura.codebuild.models.UpdateProjectOutput.apply _)
  }
  final implicit val EnvironmentLanguageDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.EnvironmentLanguage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.EnvironmentImage]]]("images")).mapN(org.lyranthe.araethura.codebuild.models.EnvironmentLanguage.apply _)
  }
  final implicit val StopBuildOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.StopBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codebuild.models.Build]]("build").map(org.lyranthe.araethura.codebuild.models.StopBuildOutput.apply _)
  }
  final implicit val DeleteProjectOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.DeleteProjectOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.DeleteProjectOutput)
  final implicit val ProjectArtifactsDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ProjectArtifacts] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("path"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("namespaceType"), o.get[scala.Option[java.lang.String]]("packaging")).mapN(org.lyranthe.araethura.codebuild.models.ProjectArtifacts.apply _)
  }
  final implicit val ProjectSourceDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ProjectSource] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("buildspec"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.SourceAuth]]("auth")).mapN(org.lyranthe.araethura.codebuild.models.ProjectSource.apply _)
  }
  final implicit val BatchGetBuildsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BatchGetBuildsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("ids").map(org.lyranthe.araethura.codebuild.models.BatchGetBuildsInput.apply _)
  }
  final implicit val DeleteWebhookOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.DeleteWebhookOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.DeleteWebhookOutput)
  final implicit val BatchDeleteBuildsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("buildsDeleted"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.BuildNotDeleted]]]("buildsNotDeleted")).mapN(org.lyranthe.araethura.codebuild.models.BatchDeleteBuildsOutput.apply _)
  }
  final implicit val BuildArtifactsDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BuildArtifacts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("sha256sum"), o.get[scala.Option[java.lang.String]]("md5sum")).mapN(org.lyranthe.araethura.codebuild.models.BuildArtifacts.apply _)
  }
  final implicit val StartBuildOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.StartBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codebuild.models.Build]]("build").map(org.lyranthe.araethura.codebuild.models.StartBuildOutput.apply _)
  }
  final implicit val BatchGetBuildsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BatchGetBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Build]]]("builds"), o.get[scala.Option[scala.List[java.lang.String]]]("buildsNotFound")).mapN(org.lyranthe.araethura.codebuild.models.BatchGetBuildsOutput.apply _)
  }
  final implicit val CreateProjectInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.CreateProjectInput] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.codebuild.models.ProjectEnvironment]("environment"), o.get[org.lyranthe.araethura.codebuild.models.ProjectArtifacts]("artifacts"), o.get[org.lyranthe.araethura.codebuild.models.ProjectSource]("source"), o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("serviceRole"), o.get[scala.Option[java.lang.String]]("encryptionKey"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Tag]]]("tags"), o.get[scala.Option[scala.Int]]("timeoutInMinutes")).mapN(org.lyranthe.araethura.codebuild.models.CreateProjectInput.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.InvalidInputException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.InvalidInputException)
  final implicit val BatchGetProjectsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.BatchGetProjectsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("names").map(org.lyranthe.araethura.codebuild.models.BatchGetProjectsInput.apply _)
  }
  final implicit val ListBuildsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ids"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codebuild.models.ListBuildsOutput.apply _)
  }
  final implicit val ListProjectsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListProjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.List[java.lang.String]]]("projects")).mapN(org.lyranthe.araethura.codebuild.models.ListProjectsOutput.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ResourceAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.ResourceAlreadyExistsException)
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(org.lyranthe.araethura.codebuild.models.Tag.apply _)
  }
  final implicit val AccountLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.AccountLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.AccountLimitExceededException)
  final implicit val PhaseContextDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.PhaseContext] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("statusCode"), o.get[scala.Option[java.lang.String]]("message")).mapN(org.lyranthe.araethura.codebuild.models.PhaseContext.apply _)
  }
  final implicit val UpdateProjectInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.UpdateProjectInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("serviceRole"), o.get[scala.Option[java.lang.String]]("encryptionKey"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Tag]]]("tags"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectEnvironment]]("environment"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectArtifacts]]("artifacts"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectSource]]("source"), o.get[scala.Option[scala.Int]]("timeoutInMinutes")).mapN(org.lyranthe.araethura.codebuild.models.UpdateProjectInput.apply _)
  }
  final implicit val ProjectDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.Project] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("lastModified"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("serviceRole"), o.get[scala.Option[java.lang.String]]("encryptionKey"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.Tag]]]("tags"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectEnvironment]]("environment"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectArtifacts]]("artifacts"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectSource]]("source"), o.get[scala.Option[scala.Int]]("timeoutInMinutes"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.Webhook]]("webhook"), o.get[scala.Option[java.lang.String]]("name")).mapN(org.lyranthe.araethura.codebuild.models.Project.apply _)
  }
  final implicit val ListProjectsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListProjectsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sortBy"), o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codebuild.models.ListProjectsInput.apply _)
  }
  final implicit val WebhookDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.Webhook] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("url").map(org.lyranthe.araethura.codebuild.models.Webhook.apply _)
  }
  final implicit val EnvironmentVariableDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.EnvironmentVariable] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("value"), o.get[scala.Option[java.lang.String]]("type")).mapN(org.lyranthe.araethura.codebuild.models.EnvironmentVariable.apply _)
  }
  final implicit val OAuthProviderExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.OAuthProviderException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.codebuild.models.OAuthProviderException)
  final implicit val CreateWebhookOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.CreateWebhookOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.codebuild.models.Webhook]]("webhook").map(org.lyranthe.araethura.codebuild.models.CreateWebhookOutput.apply _)
  }
  final implicit val ListBuildsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.ListBuildsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(org.lyranthe.araethura.codebuild.models.ListBuildsInput.apply _)
  }
  final implicit val BuildDecoder: io.circe.Decoder[org.lyranthe.araethura.codebuild.models.Build] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.codebuild.models.LogsLocation]]("logs"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("sourceVersion"), o.get[scala.Option[java.lang.String]]("projectName"), o.get[scala.Option[java.lang.String]]("currentPhase"), o.get[scala.Option[java.lang.String]]("initiator"), o.get[scala.Option[scala.Int]]("timeoutInMinutes"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectEnvironment]]("environment"), o.get[scala.Option[java.lang.String]]("buildStatus"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.ProjectSource]]("source"), o.get[scala.Option[org.lyranthe.araethura.codebuild.models.BuildArtifacts]]("artifacts"), o.get[scala.Option[scala.List[org.lyranthe.araethura.codebuild.models.BuildPhase]]]("phases"), o.get[scala.Option[scala.Boolean]]("buildComplete")).mapN(org.lyranthe.araethura.codebuild.models.Build.apply _)
  }
}