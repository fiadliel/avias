package org.lyranthe.araethura.codestar.models
final case class DescribeUserProfileRequest(userArn: java.lang.String)
case object TeamMemberNotFoundException
final case class DeleteProjectResult(stackId: scala.Option[java.lang.String] = scala.None, projectArn: scala.Option[java.lang.String] = scala.None)
case object InvalidServiceRoleException
final case class ListTagsForProjectResult(tags: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteUserProfileResult(userArn: java.lang.String)
final case class DeleteProjectRequest(id: java.lang.String, clientRequestToken: scala.Option[java.lang.String] = scala.None, deleteStack: scala.Option[scala.Boolean] = scala.None)
final case class UntagProjectRequest(id: java.lang.String, tags: scala.List[java.lang.String])
case object UserProfileNotFoundException
final case class DescribeProjectResult(name: scala.Option[java.lang.String] = scala.None, createdTimeStamp: scala.Option[java.time.Instant] = scala.None, id: scala.Option[java.lang.String] = scala.None, clientRequestToken: scala.Option[java.lang.String] = scala.None, projectTemplateId: scala.Option[java.lang.String] = scala.None, stackId: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class CreateProjectResult(id: java.lang.String, arn: java.lang.String, clientRequestToken: scala.Option[java.lang.String] = scala.None, projectTemplateId: scala.Option[java.lang.String] = scala.None)
final case class DescribeUserProfileResult(createdTimestamp: java.time.Instant, userArn: java.lang.String, lastModifiedTimestamp: java.time.Instant, displayName: scala.Option[java.lang.String] = scala.None, emailAddress: scala.Option[java.lang.String] = scala.None, sshPublicKey: scala.Option[java.lang.String] = scala.None)
case object ProjectAlreadyExistsException
final case class ListTeamMembersResult(teamMembers: scala.List[org.lyranthe.araethura.codestar.models.TeamMember], nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListResourcesRequest(projectId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class Resource(id: java.lang.String)
case object ProjectConfigurationException
case object LimitExceededException
final case class TeamMember(userArn: java.lang.String, projectRole: java.lang.String, remoteAccessAllowed: scala.Option[scala.Boolean] = scala.None)
final case class ListProjectsResult(projects: scala.List[org.lyranthe.araethura.codestar.models.ProjectSummary], nextToken: scala.Option[java.lang.String] = scala.None)
case object UserProfileAlreadyExistsException
final case class UpdateUserProfileResult(userArn: java.lang.String, createdTimestamp: scala.Option[java.time.Instant] = scala.None, displayName: scala.Option[java.lang.String] = scala.None, emailAddress: scala.Option[java.lang.String] = scala.None, lastModifiedTimestamp: scala.Option[java.time.Instant] = scala.None, sshPublicKey: scala.Option[java.lang.String] = scala.None)
case object TeamMemberAlreadyAssociatedException
case object ProjectCreationFailedException
case object ValidationException
final case class ListUserProfilesRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ListResourcesResult(resources: scala.Option[scala.List[org.lyranthe.araethura.codestar.models.Resource]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AssociateTeamMemberRequest(projectId: java.lang.String, userArn: java.lang.String, projectRole: java.lang.String, remoteAccessAllowed: scala.Option[scala.Boolean] = scala.None, clientRequestToken: scala.Option[java.lang.String] = scala.None)
final case class ListProjectsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DisassociateTeamMemberRequest(projectId: java.lang.String, userArn: java.lang.String)
final case class TagProjectResult(tags: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class CreateUserProfileResult(userArn: java.lang.String, createdTimestamp: scala.Option[java.time.Instant] = scala.None, displayName: scala.Option[java.lang.String] = scala.None, emailAddress: scala.Option[java.lang.String] = scala.None, lastModifiedTimestamp: scala.Option[java.time.Instant] = scala.None, sshPublicKey: scala.Option[java.lang.String] = scala.None)
final case class DescribeProjectRequest(id: java.lang.String)
final case class ProjectSummary(projectId: scala.Option[java.lang.String] = scala.None, projectArn: scala.Option[java.lang.String] = scala.None)
final case class ListUserProfilesResult(userProfiles: scala.List[org.lyranthe.araethura.codestar.models.UserProfileSummary], nextToken: scala.Option[java.lang.String] = scala.None)
final case class TagProjectRequest(id: java.lang.String, tags: scala.collection.immutable.Map[java.lang.String, java.lang.String])
case object DisassociateTeamMemberResult
final case class UpdateUserProfileRequest(userArn: java.lang.String, displayName: scala.Option[java.lang.String] = scala.None, emailAddress: scala.Option[java.lang.String] = scala.None, sshPublicKey: scala.Option[java.lang.String] = scala.None)
final case class ListTeamMembersRequest(projectId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class UpdateTeamMemberRequest(projectId: java.lang.String, userArn: java.lang.String, projectRole: scala.Option[java.lang.String] = scala.None, remoteAccessAllowed: scala.Option[scala.Boolean] = scala.None)
case object UntagProjectResult
final case class CreateUserProfileRequest(userArn: java.lang.String, displayName: java.lang.String, emailAddress: java.lang.String, sshPublicKey: scala.Option[java.lang.String] = scala.None)
final case class UpdateProjectRequest(id: java.lang.String, name: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class ListTagsForProjectRequest(id: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object InvalidNextTokenException
case object UpdateProjectResult
case object ProjectNotFoundException
case object ConcurrentModificationException
final case class CreateProjectRequest(name: java.lang.String, id: java.lang.String, description: scala.Option[java.lang.String] = scala.None, clientRequestToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteUserProfileRequest(userArn: java.lang.String)
final case class UpdateTeamMemberResult(userArn: scala.Option[java.lang.String] = scala.None, projectRole: scala.Option[java.lang.String] = scala.None, remoteAccessAllowed: scala.Option[scala.Boolean] = scala.None)
final case class UserProfileSummary(userArn: scala.Option[java.lang.String] = scala.None, displayName: scala.Option[java.lang.String] = scala.None, emailAddress: scala.Option[java.lang.String] = scala.None, sshPublicKey: scala.Option[java.lang.String] = scala.None)
final case class AssociateTeamMemberResult(clientRequestToken: scala.Option[java.lang.String] = scala.None)