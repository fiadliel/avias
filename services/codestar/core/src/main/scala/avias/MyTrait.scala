package avias.codestar
trait Amazoncodestar[F[_]] {
  def associateTeamMember(input: avias.codestar.models.AssociateTeamMemberRequest): F[avias.codestar.models.AssociateTeamMemberResult]
  def updateTeamMember(input: avias.codestar.models.UpdateTeamMemberRequest): F[avias.codestar.models.UpdateTeamMemberResult]
  def createUserProfile(input: avias.codestar.models.CreateUserProfileRequest): F[avias.codestar.models.CreateUserProfileResult]
  def tagProject(input: avias.codestar.models.TagProjectRequest): F[avias.codestar.models.TagProjectResult]
  def listUserProfiles(input: avias.codestar.models.ListUserProfilesRequest): F[avias.codestar.models.ListUserProfilesResult]
  def listResources(input: avias.codestar.models.ListResourcesRequest): F[avias.codestar.models.ListResourcesResult]
  def describeUserProfile(input: avias.codestar.models.DescribeUserProfileRequest): F[avias.codestar.models.DescribeUserProfileResult]
  def listTagsForProject(input: avias.codestar.models.ListTagsForProjectRequest): F[avias.codestar.models.ListTagsForProjectResult]
  def describeProject(input: avias.codestar.models.DescribeProjectRequest): F[avias.codestar.models.DescribeProjectResult]
  def deleteProject(input: avias.codestar.models.DeleteProjectRequest): F[avias.codestar.models.DeleteProjectResult]
  def listProjects(input: avias.codestar.models.ListProjectsRequest): F[avias.codestar.models.ListProjectsResult]
  def updateProject(input: avias.codestar.models.UpdateProjectRequest): F[scala.Unit]
  def createProject(input: avias.codestar.models.CreateProjectRequest): F[avias.codestar.models.CreateProjectResult]
  def untagProject(input: avias.codestar.models.UntagProjectRequest): F[scala.Unit]
  def listTeamMembers(input: avias.codestar.models.ListTeamMembersRequest): F[avias.codestar.models.ListTeamMembersResult]
  def updateUserProfile(input: avias.codestar.models.UpdateUserProfileRequest): F[avias.codestar.models.UpdateUserProfileResult]
  def disassociateTeamMember(input: avias.codestar.models.DisassociateTeamMemberRequest): F[scala.Unit]
  def deleteUserProfile(input: avias.codestar.models.DeleteUserProfileRequest): F[avias.codestar.models.DeleteUserProfileResult]
}