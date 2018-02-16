package avias.workspaces
trait Amazonworkspaces[F[_]] {
  def terminateWorkspaces(input: avias.workspaces.models.TerminateWorkspacesRequest): F[avias.workspaces.models.TerminateWorkspacesResult]
  def stopWorkspaces(input: avias.workspaces.models.StopWorkspacesRequest): F[avias.workspaces.models.StopWorkspacesResult]
  def rebootWorkspaces(input: avias.workspaces.models.RebootWorkspacesRequest): F[avias.workspaces.models.RebootWorkspacesResult]
  def describeTags(input: avias.workspaces.models.DescribeTagsRequest): F[avias.workspaces.models.DescribeTagsResult]
  def describeWorkspaceBundles(input: avias.workspaces.models.DescribeWorkspaceBundlesRequest): F[avias.workspaces.models.DescribeWorkspaceBundlesResult]
  def describeWorkspacesConnectionStatus(input: avias.workspaces.models.DescribeWorkspacesConnectionStatusRequest): F[avias.workspaces.models.DescribeWorkspacesConnectionStatusResult]
  def describeWorkspaceDirectories(input: avias.workspaces.models.DescribeWorkspaceDirectoriesRequest): F[avias.workspaces.models.DescribeWorkspaceDirectoriesResult]
  def deleteTags(input: avias.workspaces.models.DeleteTagsRequest): F[scala.Unit]
  def createTags(input: avias.workspaces.models.CreateTagsRequest): F[scala.Unit]
  def describeWorkspaces(input: avias.workspaces.models.DescribeWorkspacesRequest): F[avias.workspaces.models.DescribeWorkspacesResult]
  def rebuildWorkspaces(input: avias.workspaces.models.RebuildWorkspacesRequest): F[avias.workspaces.models.RebuildWorkspacesResult]
  def createWorkspaces(input: avias.workspaces.models.CreateWorkspacesRequest): F[avias.workspaces.models.CreateWorkspacesResult]
  def startWorkspaces(input: avias.workspaces.models.StartWorkspacesRequest): F[avias.workspaces.models.StartWorkspacesResult]
  def modifyWorkspaceProperties(input: avias.workspaces.models.ModifyWorkspacePropertiesRequest): F[scala.Unit]
}