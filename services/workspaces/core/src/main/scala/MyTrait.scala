package org.lyranthe.araethura.workspaces
trait Amazonworkspaces[F[_]] {
  def terminateWorkspaces(input: org.lyranthe.araethura.workspaces.models.TerminateWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.TerminateWorkspacesResult]
  def stopWorkspaces(input: org.lyranthe.araethura.workspaces.models.StopWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.StopWorkspacesResult]
  def rebootWorkspaces(input: org.lyranthe.araethura.workspaces.models.RebootWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.RebootWorkspacesResult]
  def describeTags(input: org.lyranthe.araethura.workspaces.models.DescribeTagsRequest): F[org.lyranthe.araethura.workspaces.models.DescribeTagsResult]
  def describeWorkspaceBundles(input: org.lyranthe.araethura.workspaces.models.DescribeWorkspaceBundlesRequest): F[org.lyranthe.araethura.workspaces.models.DescribeWorkspaceBundlesResult]
  def describeWorkspacesConnectionStatus(input: org.lyranthe.araethura.workspaces.models.DescribeWorkspacesConnectionStatusRequest): F[org.lyranthe.araethura.workspaces.models.DescribeWorkspacesConnectionStatusResult]
  def describeWorkspaceDirectories(input: org.lyranthe.araethura.workspaces.models.DescribeWorkspaceDirectoriesRequest): F[org.lyranthe.araethura.workspaces.models.DescribeWorkspaceDirectoriesResult]
  def deleteTags(input: org.lyranthe.araethura.workspaces.models.DeleteTagsRequest): F[scala.Unit]
  def createTags(input: org.lyranthe.araethura.workspaces.models.CreateTagsRequest): F[scala.Unit]
  def describeWorkspaces(input: org.lyranthe.araethura.workspaces.models.DescribeWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.DescribeWorkspacesResult]
  def rebuildWorkspaces(input: org.lyranthe.araethura.workspaces.models.RebuildWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.RebuildWorkspacesResult]
  def createWorkspaces(input: org.lyranthe.araethura.workspaces.models.CreateWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.CreateWorkspacesResult]
  def startWorkspaces(input: org.lyranthe.araethura.workspaces.models.StartWorkspacesRequest): F[org.lyranthe.araethura.workspaces.models.StartWorkspacesResult]
  def modifyWorkspaceProperties(input: org.lyranthe.araethura.workspaces.models.ModifyWorkspacePropertiesRequest): F[scala.Unit]
}