package org.lyranthe.araethura.workspaces
trait Amazonworkspaces[F[_]] {
  def terminateWorkspaces(input: models.TerminateWorkspacesRequest): F[models.TerminateWorkspacesResult]
  def stopWorkspaces(input: models.StopWorkspacesRequest): F[models.StopWorkspacesResult]
  def rebootWorkspaces(input: models.RebootWorkspacesRequest): F[models.RebootWorkspacesResult]
  def describeTags(input: models.DescribeTagsRequest): F[models.DescribeTagsResult]
  def describeWorkspaceBundles(input: models.DescribeWorkspaceBundlesRequest): F[models.DescribeWorkspaceBundlesResult]
  def describeWorkspacesConnectionStatus(input: models.DescribeWorkspacesConnectionStatusRequest): F[models.DescribeWorkspacesConnectionStatusResult]
  def describeWorkspaceDirectories(input: models.DescribeWorkspaceDirectoriesRequest): F[models.DescribeWorkspaceDirectoriesResult]
  def deleteTags(input: models.DeleteTagsRequest): F[scala.Unit]
  def createTags(input: models.CreateTagsRequest): F[scala.Unit]
  def describeWorkspaces(input: models.DescribeWorkspacesRequest): F[models.DescribeWorkspacesResult]
  def rebuildWorkspaces(input: models.RebuildWorkspacesRequest): F[models.RebuildWorkspacesResult]
  def createWorkspaces(input: models.CreateWorkspacesRequest): F[models.CreateWorkspacesResult]
  def startWorkspaces(input: models.StartWorkspacesRequest): F[models.StartWorkspacesResult]
  def modifyWorkspaceProperties(input: models.ModifyWorkspacePropertiesRequest): F[scala.Unit]
}