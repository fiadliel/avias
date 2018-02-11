package org.lyranthe.araethura.codebuild
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val LogsLocationEncoder: io.circe.Encoder[models.LogsLocation] = io.circe.Encoder.instance { o => 
    Json.obj("groupName" -> o.groupName.asJson, "streamName" -> o.streamName.asJson, "deepLink" -> o.deepLink.asJson)
  }
  final implicit val ListCuratedEnvironmentImagesOutputEncoder: io.circe.Encoder[models.ListCuratedEnvironmentImagesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("platforms" -> o.platforms.asJson)
  }
  final implicit val EnvironmentImageEncoder: io.circe.Encoder[models.EnvironmentImage] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val StartBuildInputEncoder: io.circe.Encoder[models.StartBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson, "sourceVersion" -> o.sourceVersion.asJson, "buildspecOverride" -> o.buildspecOverride.asJson, "artifactsOverride" -> o.artifactsOverride.asJson, "timeoutInMinutesOverride" -> o.timeoutInMinutesOverride.asJson, "environmentVariablesOverride" -> o.environmentVariablesOverride.asJson)
  }
  final implicit val StopBuildInputEncoder: io.circe.Encoder[models.StopBuildInput] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson)
  }
  final implicit val DeleteWebhookInputEncoder: io.circe.Encoder[models.DeleteWebhookInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson)
  }
  final implicit val BatchDeleteBuildsInputEncoder: io.circe.Encoder[models.BatchDeleteBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson)
  }
  final implicit val CreateProjectOutputEncoder: io.circe.Encoder[models.CreateProjectOutput] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val BatchGetProjectsOutputEncoder: io.circe.Encoder[models.BatchGetProjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("projects" -> o.projects.asJson, "projectsNotFound" -> o.projectsNotFound.asJson)
  }
  final implicit val ListBuildsForProjectInputEncoder: io.circe.Encoder[models.ListBuildsForProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson, "sortOrder" -> o.sortOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BuildPhaseEncoder: io.circe.Encoder[models.BuildPhase] = io.circe.Encoder.instance { o => 
    Json.obj("startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "contexts" -> o.contexts.asJson, "phaseType" -> o.phaseType.asJson, "phaseStatus" -> o.phaseStatus.asJson, "durationInSeconds" -> o.durationInSeconds.asJson)
  }
  final implicit val SourceAuthEncoder: io.circe.Encoder[models.SourceAuth] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "resource" -> o.resource.asJson)
  }
  final implicit val EnvironmentPlatformEncoder: io.circe.Encoder[models.EnvironmentPlatform] = io.circe.Encoder.instance { o => 
    Json.obj("platform" -> o.platform.asJson, "languages" -> o.languages.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListCuratedEnvironmentImagesInputEncoder: io.circe.Encoder[models.ListCuratedEnvironmentImagesInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateWebhookInputEncoder: io.circe.Encoder[models.CreateWebhookInput] = io.circe.Encoder.instance { o => 
    Json.obj("projectName" -> o.projectName.asJson)
  }
  final implicit val ProjectEnvironmentEncoder: io.circe.Encoder[models.ProjectEnvironment] = io.circe.Encoder.instance { o => 
    Json.obj("image" -> o.image.asJson, "computeType" -> o.computeType.asJson, "type" -> o.`type`.asJson, "privilegedMode" -> o.privilegedMode.asJson, "environmentVariables" -> o.environmentVariables.asJson)
  }
  final implicit val BuildNotDeletedEncoder: io.circe.Encoder[models.BuildNotDeleted] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "statusCode" -> o.statusCode.asJson)
  }
  final implicit val ListBuildsForProjectOutputEncoder: io.circe.Encoder[models.ListBuildsForProjectOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteProjectInputEncoder: io.circe.Encoder[models.DeleteProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val UpdateProjectOutputEncoder: io.circe.Encoder[models.UpdateProjectOutput] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val EnvironmentLanguageEncoder: io.circe.Encoder[models.EnvironmentLanguage] = io.circe.Encoder.instance { o => 
    Json.obj("language" -> o.language.asJson, "images" -> o.images.asJson)
  }
  final implicit val StopBuildOutputEncoder: io.circe.Encoder[models.StopBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("build" -> o.build.asJson)
  }
  final implicit val DeleteProjectOutputEncoder: io.circe.Encoder[models.DeleteProjectOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProjectArtifactsEncoder: io.circe.Encoder[models.ProjectArtifacts] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "path" -> o.path.asJson, "name" -> o.name.asJson, "namespaceType" -> o.namespaceType.asJson, "packaging" -> o.packaging.asJson)
  }
  final implicit val ProjectSourceEncoder: io.circe.Encoder[models.ProjectSource] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "location" -> o.location.asJson, "buildspec" -> o.buildspec.asJson, "auth" -> o.auth.asJson)
  }
  final implicit val BatchGetBuildsInputEncoder: io.circe.Encoder[models.BatchGetBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson)
  }
  final implicit val DeleteWebhookOutputEncoder: io.circe.Encoder[models.DeleteWebhookOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchDeleteBuildsOutputEncoder: io.circe.Encoder[models.BatchDeleteBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("buildsDeleted" -> o.buildsDeleted.asJson, "buildsNotDeleted" -> o.buildsNotDeleted.asJson)
  }
  final implicit val BuildArtifactsEncoder: io.circe.Encoder[models.BuildArtifacts] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "sha256sum" -> o.sha256sum.asJson, "md5sum" -> o.md5sum.asJson)
  }
  final implicit val StartBuildOutputEncoder: io.circe.Encoder[models.StartBuildOutput] = io.circe.Encoder.instance { o => 
    Json.obj("build" -> o.build.asJson)
  }
  final implicit val BatchGetBuildsOutputEncoder: io.circe.Encoder[models.BatchGetBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("builds" -> o.builds.asJson, "buildsNotFound" -> o.buildsNotFound.asJson)
  }
  final implicit val CreateProjectInputEncoder: io.circe.Encoder[models.CreateProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("environment" -> o.environment.asJson, "artifacts" -> o.artifacts.asJson, "source" -> o.source.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson, "serviceRole" -> o.serviceRole.asJson, "encryptionKey" -> o.encryptionKey.asJson, "tags" -> o.tags.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[models.InvalidInputException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetProjectsInputEncoder: io.circe.Encoder[models.BatchGetProjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("names" -> o.names.asJson)
  }
  final implicit val ListBuildsOutputEncoder: io.circe.Encoder[models.ListBuildsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ids" -> o.ids.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListProjectsOutputEncoder: io.circe.Encoder[models.ListProjectsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "projects" -> o.projects.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[models.ResourceAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val AccountLimitExceededExceptionEncoder: io.circe.Encoder[models.AccountLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PhaseContextEncoder: io.circe.Encoder[models.PhaseContext] = io.circe.Encoder.instance { o => 
    Json.obj("statusCode" -> o.statusCode.asJson, "message" -> o.message.asJson)
  }
  final implicit val UpdateProjectInputEncoder: io.circe.Encoder[models.UpdateProjectInput] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "description" -> o.description.asJson, "serviceRole" -> o.serviceRole.asJson, "encryptionKey" -> o.encryptionKey.asJson, "tags" -> o.tags.asJson, "environment" -> o.environment.asJson, "artifacts" -> o.artifacts.asJson, "source" -> o.source.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson)
  }
  final implicit val ProjectEncoder: io.circe.Encoder[models.Project] = io.circe.Encoder.instance { o => 
    Json.obj("created" -> o.created.asJson, "lastModified" -> o.lastModified.asJson, "description" -> o.description.asJson, "serviceRole" -> o.serviceRole.asJson, "encryptionKey" -> o.encryptionKey.asJson, "tags" -> o.tags.asJson, "arn" -> o.arn.asJson, "environment" -> o.environment.asJson, "artifacts" -> o.artifacts.asJson, "source" -> o.source.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson, "webhook" -> o.webhook.asJson, "name" -> o.name.asJson)
  }
  final implicit val ListProjectsInputEncoder: io.circe.Encoder[models.ListProjectsInput] = io.circe.Encoder.instance { o => 
    Json.obj("sortBy" -> o.sortBy.asJson, "sortOrder" -> o.sortOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val WebhookEncoder: io.circe.Encoder[models.Webhook] = io.circe.Encoder.instance { o => 
    Json.obj("url" -> o.url.asJson)
  }
  final implicit val EnvironmentVariableEncoder: io.circe.Encoder[models.EnvironmentVariable] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "value" -> o.value.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val OAuthProviderExceptionEncoder: io.circe.Encoder[models.OAuthProviderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateWebhookOutputEncoder: io.circe.Encoder[models.CreateWebhookOutput] = io.circe.Encoder.instance { o => 
    Json.obj("webhook" -> o.webhook.asJson)
  }
  final implicit val ListBuildsInputEncoder: io.circe.Encoder[models.ListBuildsInput] = io.circe.Encoder.instance { o => 
    Json.obj("sortOrder" -> o.sortOrder.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BuildEncoder: io.circe.Encoder[models.Build] = io.circe.Encoder.instance { o => 
    Json.obj("logs" -> o.logs.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "id" -> o.id.asJson, "arn" -> o.arn.asJson, "sourceVersion" -> o.sourceVersion.asJson, "projectName" -> o.projectName.asJson, "currentPhase" -> o.currentPhase.asJson, "initiator" -> o.initiator.asJson, "timeoutInMinutes" -> o.timeoutInMinutes.asJson, "environment" -> o.environment.asJson, "buildStatus" -> o.buildStatus.asJson, "source" -> o.source.asJson, "artifacts" -> o.artifacts.asJson, "phases" -> o.phases.asJson, "buildComplete" -> o.buildComplete.asJson)
  }
  final implicit val LogsLocationDecoder: io.circe.Decoder[models.LogsLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("groupName"), o.get[scala.Option[java.lang.String]]("streamName"), o.get[scala.Option[java.lang.String]]("deepLink")).mapN(models.LogsLocation.apply _)
  }
  final implicit val ListCuratedEnvironmentImagesOutputDecoder: io.circe.Decoder[models.ListCuratedEnvironmentImagesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.EnvironmentPlatform]]]("platforms").map(models.ListCuratedEnvironmentImagesOutput.apply _)
  }
  final implicit val EnvironmentImageDecoder: io.circe.Decoder[models.EnvironmentImage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.EnvironmentImage.apply _)
  }
  final implicit val StartBuildInputDecoder: io.circe.Decoder[models.StartBuildInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectName"), o.get[scala.Option[java.lang.String]]("sourceVersion"), o.get[scala.Option[java.lang.String]]("buildspecOverride"), o.get[scala.Option[models.ProjectArtifacts]]("artifactsOverride"), o.get[scala.Option[scala.Int]]("timeoutInMinutesOverride"), o.get[scala.Option[scala.List[models.EnvironmentVariable]]]("environmentVariablesOverride")).mapN(models.StartBuildInput.apply _)
  }
  final implicit val StopBuildInputDecoder: io.circe.Decoder[models.StopBuildInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("id").map(models.StopBuildInput.apply _)
  }
  final implicit val DeleteWebhookInputDecoder: io.circe.Decoder[models.DeleteWebhookInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("projectName").map(models.DeleteWebhookInput.apply _)
  }
  final implicit val BatchDeleteBuildsInputDecoder: io.circe.Decoder[models.BatchDeleteBuildsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("ids").map(models.BatchDeleteBuildsInput.apply _)
  }
  final implicit val CreateProjectOutputDecoder: io.circe.Decoder[models.CreateProjectOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Project]]("project").map(models.CreateProjectOutput.apply _)
  }
  final implicit val BatchGetProjectsOutputDecoder: io.circe.Decoder[models.BatchGetProjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Project]]]("projects"), o.get[scala.Option[scala.List[java.lang.String]]]("projectsNotFound")).mapN(models.BatchGetProjectsOutput.apply _)
  }
  final implicit val ListBuildsForProjectInputDecoder: io.circe.Decoder[models.ListBuildsForProjectInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectName"), o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListBuildsForProjectInput.apply _)
  }
  final implicit val BuildPhaseDecoder: io.circe.Decoder[models.BuildPhase] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[scala.List[models.PhaseContext]]]("contexts"), o.get[scala.Option[java.lang.String]]("phaseType"), o.get[scala.Option[java.lang.String]]("phaseStatus"), o.get[scala.Option[scala.Long]]("durationInSeconds")).mapN(models.BuildPhase.apply _)
  }
  final implicit val SourceAuthDecoder: io.circe.Decoder[models.SourceAuth] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("resource")).mapN(models.SourceAuth.apply _)
  }
  final implicit val EnvironmentPlatformDecoder: io.circe.Decoder[models.EnvironmentPlatform] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[scala.List[models.EnvironmentLanguage]]]("languages")).mapN(models.EnvironmentPlatform.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceNotFoundException)
  final implicit val ListCuratedEnvironmentImagesInputDecoder: io.circe.Decoder[models.ListCuratedEnvironmentImagesInput.type] = io.circe.Decoder.decodeUnit.as(models.ListCuratedEnvironmentImagesInput)
  final implicit val CreateWebhookInputDecoder: io.circe.Decoder[models.CreateWebhookInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("projectName").map(models.CreateWebhookInput.apply _)
  }
  final implicit val ProjectEnvironmentDecoder: io.circe.Decoder[models.ProjectEnvironment] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("image"), o.get[java.lang.String]("computeType"), o.get[java.lang.String]("type"), o.get[scala.Option[scala.Boolean]]("privilegedMode"), o.get[scala.Option[scala.List[models.EnvironmentVariable]]]("environmentVariables")).mapN(models.ProjectEnvironment.apply _)
  }
  final implicit val BuildNotDeletedDecoder: io.circe.Decoder[models.BuildNotDeleted] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("statusCode")).mapN(models.BuildNotDeleted.apply _)
  }
  final implicit val ListBuildsForProjectOutputDecoder: io.circe.Decoder[models.ListBuildsForProjectOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ids"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListBuildsForProjectOutput.apply _)
  }
  final implicit val DeleteProjectInputDecoder: io.circe.Decoder[models.DeleteProjectInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("name").map(models.DeleteProjectInput.apply _)
  }
  final implicit val UpdateProjectOutputDecoder: io.circe.Decoder[models.UpdateProjectOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Project]]("project").map(models.UpdateProjectOutput.apply _)
  }
  final implicit val EnvironmentLanguageDecoder: io.circe.Decoder[models.EnvironmentLanguage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[scala.List[models.EnvironmentImage]]]("images")).mapN(models.EnvironmentLanguage.apply _)
  }
  final implicit val StopBuildOutputDecoder: io.circe.Decoder[models.StopBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Build]]("build").map(models.StopBuildOutput.apply _)
  }
  final implicit val DeleteProjectOutputDecoder: io.circe.Decoder[models.DeleteProjectOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteProjectOutput)
  final implicit val ProjectArtifactsDecoder: io.circe.Decoder[models.ProjectArtifacts] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("path"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("namespaceType"), o.get[scala.Option[java.lang.String]]("packaging")).mapN(models.ProjectArtifacts.apply _)
  }
  final implicit val ProjectSourceDecoder: io.circe.Decoder[models.ProjectSource] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("buildspec"), o.get[scala.Option[models.SourceAuth]]("auth")).mapN(models.ProjectSource.apply _)
  }
  final implicit val BatchGetBuildsInputDecoder: io.circe.Decoder[models.BatchGetBuildsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("ids").map(models.BatchGetBuildsInput.apply _)
  }
  final implicit val DeleteWebhookOutputDecoder: io.circe.Decoder[models.DeleteWebhookOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteWebhookOutput)
  final implicit val BatchDeleteBuildsOutputDecoder: io.circe.Decoder[models.BatchDeleteBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("buildsDeleted"), o.get[scala.Option[scala.List[models.BuildNotDeleted]]]("buildsNotDeleted")).mapN(models.BatchDeleteBuildsOutput.apply _)
  }
  final implicit val BuildArtifactsDecoder: io.circe.Decoder[models.BuildArtifacts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("location"), o.get[scala.Option[java.lang.String]]("sha256sum"), o.get[scala.Option[java.lang.String]]("md5sum")).mapN(models.BuildArtifacts.apply _)
  }
  final implicit val StartBuildOutputDecoder: io.circe.Decoder[models.StartBuildOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Build]]("build").map(models.StartBuildOutput.apply _)
  }
  final implicit val BatchGetBuildsOutputDecoder: io.circe.Decoder[models.BatchGetBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Build]]]("builds"), o.get[scala.Option[scala.List[java.lang.String]]]("buildsNotFound")).mapN(models.BatchGetBuildsOutput.apply _)
  }
  final implicit val CreateProjectInputDecoder: io.circe.Decoder[models.CreateProjectInput] = io.circe.Decoder.instance { o => 
    (o.get[models.ProjectEnvironment]("environment"), o.get[models.ProjectArtifacts]("artifacts"), o.get[models.ProjectSource]("source"), o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("serviceRole"), o.get[scala.Option[java.lang.String]]("encryptionKey"), o.get[scala.Option[scala.List[models.Tag]]]("tags"), o.get[scala.Option[scala.Int]]("timeoutInMinutes")).mapN(models.CreateProjectInput.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[models.InvalidInputException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidInputException)
  final implicit val BatchGetProjectsInputDecoder: io.circe.Decoder[models.BatchGetProjectsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("names").map(models.BatchGetProjectsInput.apply _)
  }
  final implicit val ListBuildsOutputDecoder: io.circe.Decoder[models.ListBuildsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ids"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListBuildsOutput.apply _)
  }
  final implicit val ListProjectsOutputDecoder: io.circe.Decoder[models.ListProjectsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.List[java.lang.String]]]("projects")).mapN(models.ListProjectsOutput.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[models.ResourceAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceAlreadyExistsException)
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(models.Tag.apply _)
  }
  final implicit val AccountLimitExceededExceptionDecoder: io.circe.Decoder[models.AccountLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.AccountLimitExceededException)
  final implicit val PhaseContextDecoder: io.circe.Decoder[models.PhaseContext] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("statusCode"), o.get[scala.Option[java.lang.String]]("message")).mapN(models.PhaseContext.apply _)
  }
  final implicit val UpdateProjectInputDecoder: io.circe.Decoder[models.UpdateProjectInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("serviceRole"), o.get[scala.Option[java.lang.String]]("encryptionKey"), o.get[scala.Option[scala.List[models.Tag]]]("tags"), o.get[scala.Option[models.ProjectEnvironment]]("environment"), o.get[scala.Option[models.ProjectArtifacts]]("artifacts"), o.get[scala.Option[models.ProjectSource]]("source"), o.get[scala.Option[scala.Int]]("timeoutInMinutes")).mapN(models.UpdateProjectInput.apply _)
  }
  final implicit val ProjectDecoder: io.circe.Decoder[models.Project] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("lastModified"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("serviceRole"), o.get[scala.Option[java.lang.String]]("encryptionKey"), o.get[scala.Option[scala.List[models.Tag]]]("tags"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[models.ProjectEnvironment]]("environment"), o.get[scala.Option[models.ProjectArtifacts]]("artifacts"), o.get[scala.Option[models.ProjectSource]]("source"), o.get[scala.Option[scala.Int]]("timeoutInMinutes"), o.get[scala.Option[models.Webhook]]("webhook"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.Project.apply _)
  }
  final implicit val ListProjectsInputDecoder: io.circe.Decoder[models.ListProjectsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sortBy"), o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListProjectsInput.apply _)
  }
  final implicit val WebhookDecoder: io.circe.Decoder[models.Webhook] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("url").map(models.Webhook.apply _)
  }
  final implicit val EnvironmentVariableDecoder: io.circe.Decoder[models.EnvironmentVariable] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("value"), o.get[scala.Option[java.lang.String]]("type")).mapN(models.EnvironmentVariable.apply _)
  }
  final implicit val OAuthProviderExceptionDecoder: io.circe.Decoder[models.OAuthProviderException.type] = io.circe.Decoder.decodeUnit.as(models.OAuthProviderException)
  final implicit val CreateWebhookOutputDecoder: io.circe.Decoder[models.CreateWebhookOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Webhook]]("webhook").map(models.CreateWebhookOutput.apply _)
  }
  final implicit val ListBuildsInputDecoder: io.circe.Decoder[models.ListBuildsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListBuildsInput.apply _)
  }
  final implicit val BuildDecoder: io.circe.Decoder[models.Build] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.LogsLocation]]("logs"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("sourceVersion"), o.get[scala.Option[java.lang.String]]("projectName"), o.get[scala.Option[java.lang.String]]("currentPhase"), o.get[scala.Option[java.lang.String]]("initiator"), o.get[scala.Option[scala.Int]]("timeoutInMinutes"), o.get[scala.Option[models.ProjectEnvironment]]("environment"), o.get[scala.Option[java.lang.String]]("buildStatus"), o.get[scala.Option[models.ProjectSource]]("source"), o.get[scala.Option[models.BuildArtifacts]]("artifacts"), o.get[scala.Option[scala.List[models.BuildPhase]]]("phases"), o.get[scala.Option[scala.Boolean]]("buildComplete")).mapN(models.Build.apply _)
  }
}