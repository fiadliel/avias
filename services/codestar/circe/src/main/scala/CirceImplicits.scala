package org.lyranthe.araethura.codestar
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DescribeUserProfileRequestEncoder: io.circe.Encoder[models.DescribeUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson)
  }
  final implicit val TeamMemberNotFoundExceptionEncoder: io.circe.Encoder[models.TeamMemberNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteProjectResultEncoder: io.circe.Encoder[models.DeleteProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("stackId" -> o.stackId.asJson, "projectArn" -> o.projectArn.asJson)
  }
  final implicit val InvalidServiceRoleExceptionEncoder: io.circe.Encoder[models.InvalidServiceRoleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListTagsForProjectResultEncoder: io.circe.Encoder[models.ListTagsForProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteUserProfileResultEncoder: io.circe.Encoder[models.DeleteUserProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson)
  }
  final implicit val DeleteProjectRequestEncoder: io.circe.Encoder[models.DeleteProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "deleteStack" -> o.deleteStack.asJson)
  }
  final implicit val UntagProjectRequestEncoder: io.circe.Encoder[models.UntagProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val UserProfileNotFoundExceptionEncoder: io.circe.Encoder[models.UserProfileNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeProjectResultEncoder: io.circe.Encoder[models.DescribeProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "createdTimeStamp" -> o.createdTimeStamp.asJson, "id" -> o.id.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "projectTemplateId" -> o.projectTemplateId.asJson, "stackId" -> o.stackId.asJson, "arn" -> o.arn.asJson, "description" -> o.description.asJson)
  }
  final implicit val CreateProjectResultEncoder: io.circe.Encoder[models.CreateProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "arn" -> o.arn.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "projectTemplateId" -> o.projectTemplateId.asJson)
  }
  final implicit val DescribeUserProfileResultEncoder: io.circe.Encoder[models.DescribeUserProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("createdTimestamp" -> o.createdTimestamp.asJson, "userArn" -> o.userArn.asJson, "lastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "displayName" -> o.displayName.asJson, "emailAddress" -> o.emailAddress.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val ProjectAlreadyExistsExceptionEncoder: io.circe.Encoder[models.ProjectAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListTeamMembersResultEncoder: io.circe.Encoder[models.ListTeamMembersResult] = io.circe.Encoder.instance { o => 
    Json.obj("teamMembers" -> o.teamMembers.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListResourcesRequestEncoder: io.circe.Encoder[models.ListResourcesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectId" -> o.projectId.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ResourceEncoder: io.circe.Encoder[models.Resource] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson)
  }
  final implicit val ProjectConfigurationExceptionEncoder: io.circe.Encoder[models.ProjectConfigurationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TeamMemberEncoder: io.circe.Encoder[models.TeamMember] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "projectRole" -> o.projectRole.asJson, "remoteAccessAllowed" -> o.remoteAccessAllowed.asJson)
  }
  final implicit val ListProjectsResultEncoder: io.circe.Encoder[models.ListProjectsResult] = io.circe.Encoder.instance { o => 
    Json.obj("projects" -> o.projects.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val UserProfileAlreadyExistsExceptionEncoder: io.circe.Encoder[models.UserProfileAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateUserProfileResultEncoder: io.circe.Encoder[models.UpdateUserProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "createdTimestamp" -> o.createdTimestamp.asJson, "displayName" -> o.displayName.asJson, "emailAddress" -> o.emailAddress.asJson, "lastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val TeamMemberAlreadyAssociatedExceptionEncoder: io.circe.Encoder[models.TeamMemberAlreadyAssociatedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProjectCreationFailedExceptionEncoder: io.circe.Encoder[models.ProjectCreationFailedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[models.ValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListUserProfilesRequestEncoder: io.circe.Encoder[models.ListUserProfilesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ListResourcesResultEncoder: io.circe.Encoder[models.ListResourcesResult] = io.circe.Encoder.instance { o => 
    Json.obj("resources" -> o.resources.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociateTeamMemberRequestEncoder: io.circe.Encoder[models.AssociateTeamMemberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectId" -> o.projectId.asJson, "userArn" -> o.userArn.asJson, "projectRole" -> o.projectRole.asJson, "remoteAccessAllowed" -> o.remoteAccessAllowed.asJson, "clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val ListProjectsRequestEncoder: io.circe.Encoder[models.ListProjectsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DisassociateTeamMemberRequestEncoder: io.circe.Encoder[models.DisassociateTeamMemberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectId" -> o.projectId.asJson, "userArn" -> o.userArn.asJson)
  }
  final implicit val TagProjectResultEncoder: io.circe.Encoder[models.TagProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson)
  }
  final implicit val CreateUserProfileResultEncoder: io.circe.Encoder[models.CreateUserProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "createdTimestamp" -> o.createdTimestamp.asJson, "displayName" -> o.displayName.asJson, "emailAddress" -> o.emailAddress.asJson, "lastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val DescribeProjectRequestEncoder: io.circe.Encoder[models.DescribeProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson)
  }
  final implicit val ProjectSummaryEncoder: io.circe.Encoder[models.ProjectSummary] = io.circe.Encoder.instance { o => 
    Json.obj("projectId" -> o.projectId.asJson, "projectArn" -> o.projectArn.asJson)
  }
  final implicit val ListUserProfilesResultEncoder: io.circe.Encoder[models.ListUserProfilesResult] = io.circe.Encoder.instance { o => 
    Json.obj("userProfiles" -> o.userProfiles.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val TagProjectRequestEncoder: io.circe.Encoder[models.TagProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val DisassociateTeamMemberResultEncoder: io.circe.Encoder[models.DisassociateTeamMemberResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateUserProfileRequestEncoder: io.circe.Encoder[models.UpdateUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "displayName" -> o.displayName.asJson, "emailAddress" -> o.emailAddress.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val ListTeamMembersRequestEncoder: io.circe.Encoder[models.ListTeamMembersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectId" -> o.projectId.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val UpdateTeamMemberRequestEncoder: io.circe.Encoder[models.UpdateTeamMemberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectId" -> o.projectId.asJson, "userArn" -> o.userArn.asJson, "projectRole" -> o.projectRole.asJson, "remoteAccessAllowed" -> o.remoteAccessAllowed.asJson)
  }
  final implicit val UntagProjectResultEncoder: io.circe.Encoder[models.UntagProjectResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateUserProfileRequestEncoder: io.circe.Encoder[models.CreateUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "displayName" -> o.displayName.asJson, "emailAddress" -> o.emailAddress.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val UpdateProjectRequestEncoder: io.circe.Encoder[models.UpdateProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val ListTagsForProjectRequestEncoder: io.circe.Encoder[models.ListTagsForProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateProjectResultEncoder: io.circe.Encoder[models.UpdateProjectResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProjectNotFoundExceptionEncoder: io.circe.Encoder[models.ProjectNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[models.ConcurrentModificationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateProjectRequestEncoder: io.circe.Encoder[models.CreateProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "id" -> o.id.asJson, "description" -> o.description.asJson, "clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val DeleteUserProfileRequestEncoder: io.circe.Encoder[models.DeleteUserProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson)
  }
  final implicit val UpdateTeamMemberResultEncoder: io.circe.Encoder[models.UpdateTeamMemberResult] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "projectRole" -> o.projectRole.asJson, "remoteAccessAllowed" -> o.remoteAccessAllowed.asJson)
  }
  final implicit val UserProfileSummaryEncoder: io.circe.Encoder[models.UserProfileSummary] = io.circe.Encoder.instance { o => 
    Json.obj("userArn" -> o.userArn.asJson, "displayName" -> o.displayName.asJson, "emailAddress" -> o.emailAddress.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val AssociateTeamMemberResultEncoder: io.circe.Encoder[models.AssociateTeamMemberResult] = io.circe.Encoder.instance { o => 
    Json.obj("clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val DescribeUserProfileRequestDecoder: io.circe.Decoder[models.DescribeUserProfileRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("userArn").map(models.DescribeUserProfileRequest.apply _)
  }
  final implicit val TeamMemberNotFoundExceptionDecoder: io.circe.Decoder[models.TeamMemberNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.TeamMemberNotFoundException)
  final implicit val DeleteProjectResultDecoder: io.circe.Decoder[models.DeleteProjectResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("stackId"), o.get[scala.Option[java.lang.String]]("projectArn")).mapN(models.DeleteProjectResult.apply _)
  }
  final implicit val InvalidServiceRoleExceptionDecoder: io.circe.Decoder[models.InvalidServiceRoleException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidServiceRoleException)
  final implicit val ListTagsForProjectResultDecoder: io.circe.Decoder[models.ListTagsForProjectResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("tags"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListTagsForProjectResult.apply _)
  }
  final implicit val DeleteUserProfileResultDecoder: io.circe.Decoder[models.DeleteUserProfileResult] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("userArn").map(models.DeleteUserProfileResult.apply _)
  }
  final implicit val DeleteProjectRequestDecoder: io.circe.Decoder[models.DeleteProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[scala.Boolean]]("deleteStack")).mapN(models.DeleteProjectRequest.apply _)
  }
  final implicit val UntagProjectRequestDecoder: io.circe.Decoder[models.UntagProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.List[java.lang.String]]("tags")).mapN(models.UntagProjectRequest.apply _)
  }
  final implicit val UserProfileNotFoundExceptionDecoder: io.circe.Decoder[models.UserProfileNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.UserProfileNotFoundException)
  final implicit val DescribeProjectResultDecoder: io.circe.Decoder[models.DescribeProjectResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.time.Instant]]("createdTimeStamp"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.lang.String]]("projectTemplateId"), o.get[scala.Option[java.lang.String]]("stackId"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.DescribeProjectResult.apply _)
  }
  final implicit val CreateProjectResultDecoder: io.circe.Decoder[models.CreateProjectResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.lang.String]]("projectTemplateId")).mapN(models.CreateProjectResult.apply _)
  }
  final implicit val DescribeUserProfileResultDecoder: io.circe.Decoder[models.DescribeUserProfileResult] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("createdTimestamp"), o.get[java.lang.String]("userArn"), o.get[java.time.Instant]("lastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(models.DescribeUserProfileResult.apply _)
  }
  final implicit val ProjectAlreadyExistsExceptionDecoder: io.circe.Decoder[models.ProjectAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.ProjectAlreadyExistsException)
  final implicit val ListTeamMembersResultDecoder: io.circe.Decoder[models.ListTeamMembersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.TeamMember]]("teamMembers"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListTeamMembersResult.apply _)
  }
  final implicit val ListResourcesRequestDecoder: io.circe.Decoder[models.ListResourcesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListResourcesRequest.apply _)
  }
  final implicit val ResourceDecoder: io.circe.Decoder[models.Resource] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("id").map(models.Resource.apply _)
  }
  final implicit val ProjectConfigurationExceptionDecoder: io.circe.Decoder[models.ProjectConfigurationException.type] = io.circe.Decoder.decodeUnit.as(models.ProjectConfigurationException)
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.LimitExceededException)
  final implicit val TeamMemberDecoder: io.circe.Decoder[models.TeamMember] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("userArn"), o.get[java.lang.String]("projectRole"), o.get[scala.Option[scala.Boolean]]("remoteAccessAllowed")).mapN(models.TeamMember.apply _)
  }
  final implicit val ListProjectsResultDecoder: io.circe.Decoder[models.ListProjectsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.ProjectSummary]]("projects"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListProjectsResult.apply _)
  }
  final implicit val UserProfileAlreadyExistsExceptionDecoder: io.circe.Decoder[models.UserProfileAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.UserProfileAlreadyExistsException)
  final implicit val UpdateUserProfileResultDecoder: io.circe.Decoder[models.UpdateUserProfileResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("userArn"), o.get[scala.Option[java.time.Instant]]("createdTimestamp"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[java.time.Instant]]("lastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(models.UpdateUserProfileResult.apply _)
  }
  final implicit val TeamMemberAlreadyAssociatedExceptionDecoder: io.circe.Decoder[models.TeamMemberAlreadyAssociatedException.type] = io.circe.Decoder.decodeUnit.as(models.TeamMemberAlreadyAssociatedException)
  final implicit val ProjectCreationFailedExceptionDecoder: io.circe.Decoder[models.ProjectCreationFailedException.type] = io.circe.Decoder.decodeUnit.as(models.ProjectCreationFailedException)
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[models.ValidationException.type] = io.circe.Decoder.decodeUnit.as(models.ValidationException)
  final implicit val ListUserProfilesRequestDecoder: io.circe.Decoder[models.ListUserProfilesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListUserProfilesRequest.apply _)
  }
  final implicit val ListResourcesResultDecoder: io.circe.Decoder[models.ListResourcesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Resource]]]("resources"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListResourcesResult.apply _)
  }
  final implicit val AssociateTeamMemberRequestDecoder: io.circe.Decoder[models.AssociateTeamMemberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectId"), o.get[java.lang.String]("userArn"), o.get[java.lang.String]("projectRole"), o.get[scala.Option[scala.Boolean]]("remoteAccessAllowed"), o.get[scala.Option[java.lang.String]]("clientRequestToken")).mapN(models.AssociateTeamMemberRequest.apply _)
  }
  final implicit val ListProjectsRequestDecoder: io.circe.Decoder[models.ListProjectsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListProjectsRequest.apply _)
  }
  final implicit val DisassociateTeamMemberRequestDecoder: io.circe.Decoder[models.DisassociateTeamMemberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectId"), o.get[java.lang.String]("userArn")).mapN(models.DisassociateTeamMemberRequest.apply _)
  }
  final implicit val TagProjectResultDecoder: io.circe.Decoder[models.TagProjectResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("tags").map(models.TagProjectResult.apply _)
  }
  final implicit val CreateUserProfileResultDecoder: io.circe.Decoder[models.CreateUserProfileResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("userArn"), o.get[scala.Option[java.time.Instant]]("createdTimestamp"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[java.time.Instant]]("lastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(models.CreateUserProfileResult.apply _)
  }
  final implicit val DescribeProjectRequestDecoder: io.circe.Decoder[models.DescribeProjectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("id").map(models.DescribeProjectRequest.apply _)
  }
  final implicit val ProjectSummaryDecoder: io.circe.Decoder[models.ProjectSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("projectId"), o.get[scala.Option[java.lang.String]]("projectArn")).mapN(models.ProjectSummary.apply _)
  }
  final implicit val ListUserProfilesResultDecoder: io.circe.Decoder[models.ListUserProfilesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.UserProfileSummary]]("userProfiles"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListUserProfilesResult.apply _)
  }
  final implicit val TagProjectRequestDecoder: io.circe.Decoder[models.TagProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("tags")).mapN(models.TagProjectRequest.apply _)
  }
  final implicit val DisassociateTeamMemberResultDecoder: io.circe.Decoder[models.DisassociateTeamMemberResult.type] = io.circe.Decoder.decodeUnit.as(models.DisassociateTeamMemberResult)
  final implicit val UpdateUserProfileRequestDecoder: io.circe.Decoder[models.UpdateUserProfileRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("userArn"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(models.UpdateUserProfileRequest.apply _)
  }
  final implicit val ListTeamMembersRequestDecoder: io.circe.Decoder[models.ListTeamMembersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListTeamMembersRequest.apply _)
  }
  final implicit val UpdateTeamMemberRequestDecoder: io.circe.Decoder[models.UpdateTeamMemberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectId"), o.get[java.lang.String]("userArn"), o.get[scala.Option[java.lang.String]]("projectRole"), o.get[scala.Option[scala.Boolean]]("remoteAccessAllowed")).mapN(models.UpdateTeamMemberRequest.apply _)
  }
  final implicit val UntagProjectResultDecoder: io.circe.Decoder[models.UntagProjectResult.type] = io.circe.Decoder.decodeUnit.as(models.UntagProjectResult)
  final implicit val CreateUserProfileRequestDecoder: io.circe.Decoder[models.CreateUserProfileRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("userArn"), o.get[java.lang.String]("displayName"), o.get[java.lang.String]("emailAddress"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(models.CreateUserProfileRequest.apply _)
  }
  final implicit val UpdateProjectRequestDecoder: io.circe.Decoder[models.UpdateProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.UpdateProjectRequest.apply _)
  }
  final implicit val ListTagsForProjectRequestDecoder: io.circe.Decoder[models.ListTagsForProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListTagsForProjectRequest.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidNextTokenException)
  final implicit val UpdateProjectResultDecoder: io.circe.Decoder[models.UpdateProjectResult.type] = io.circe.Decoder.decodeUnit.as(models.UpdateProjectResult)
  final implicit val ProjectNotFoundExceptionDecoder: io.circe.Decoder[models.ProjectNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ProjectNotFoundException)
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[models.ConcurrentModificationException.type] = io.circe.Decoder.decodeUnit.as(models.ConcurrentModificationException)
  final implicit val CreateProjectRequestDecoder: io.circe.Decoder[models.CreateProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("id"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("clientRequestToken")).mapN(models.CreateProjectRequest.apply _)
  }
  final implicit val DeleteUserProfileRequestDecoder: io.circe.Decoder[models.DeleteUserProfileRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("userArn").map(models.DeleteUserProfileRequest.apply _)
  }
  final implicit val UpdateTeamMemberResultDecoder: io.circe.Decoder[models.UpdateTeamMemberResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("userArn"), o.get[scala.Option[java.lang.String]]("projectRole"), o.get[scala.Option[scala.Boolean]]("remoteAccessAllowed")).mapN(models.UpdateTeamMemberResult.apply _)
  }
  final implicit val UserProfileSummaryDecoder: io.circe.Decoder[models.UserProfileSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("userArn"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(models.UserProfileSummary.apply _)
  }
  final implicit val AssociateTeamMemberResultDecoder: io.circe.Decoder[models.AssociateTeamMemberResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("clientRequestToken").map(models.AssociateTeamMemberResult.apply _)
  }
}