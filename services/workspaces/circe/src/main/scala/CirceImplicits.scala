package org.lyranthe.araethura.workspaces
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteTagsResultEncoder: io.circe.Encoder[models.DeleteTagsResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RebootWorkspacesResultEncoder: io.circe.Encoder[models.RebootWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val DescribeWorkspacesRequestEncoder: io.circe.Encoder[models.DescribeWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserName" -> o.userName.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson, "WorkspaceIds" -> o.workspaceIds.asJson, "BundleId" -> o.bundleId.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val WorkspaceDirectoryEncoder: io.circe.Encoder[models.WorkspaceDirectory] = io.circe.Encoder.instance { o => 
    Json.obj("CustomerUserName" -> o.customerUserName.asJson, "DirectoryName" -> o.directoryName.asJson, "DnsIpAddresses" -> o.dnsIpAddresses.asJson, "SubnetIds" -> o.subnetIds.asJson, "State" -> o.state.asJson, "WorkspaceCreationProperties" -> o.workspaceCreationProperties.asJson, "WorkspaceSecurityGroupId" -> o.workspaceSecurityGroupId.asJson, "Alias" -> o.alias.asJson, "IamRoleId" -> o.iamRoleId.asJson, "RegistrationCode" -> o.registrationCode.asJson, "DirectoryType" -> o.directoryType.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val TerminateWorkspacesRequestEncoder: io.circe.Encoder[models.TerminateWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TerminateWorkspaceRequests" -> o.terminateWorkspaceRequests.asJson)
  }
  final implicit val WorkspaceBundleEncoder: io.circe.Encoder[models.WorkspaceBundle] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ComputeType" -> o.computeType.asJson, "UserStorage" -> o.userStorage.asJson, "Owner" -> o.owner.asJson, "Description" -> o.description.asJson, "BundleId" -> o.bundleId.asJson)
  }
  final implicit val RebootWorkspacesRequestEncoder: io.circe.Encoder[models.RebootWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RebootWorkspaceRequests" -> o.rebootWorkspaceRequests.asJson)
  }
  final implicit val ModifyWorkspacePropertiesRequestEncoder: io.circe.Encoder[models.ModifyWorkspacePropertiesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson, "WorkspaceProperties" -> o.workspaceProperties.asJson)
  }
  final implicit val WorkspaceEncoder: io.circe.Encoder[models.Workspace] = io.circe.Encoder.instance { o => 
    Json.obj("ComputerName" -> o.computerName.asJson, "WorkspaceId" -> o.workspaceId.asJson, "UserName" -> o.userName.asJson, "SubnetId" -> o.subnetId.asJson, "VolumeEncryptionKey" -> o.volumeEncryptionKey.asJson, "UserVolumeEncryptionEnabled" -> o.userVolumeEncryptionEnabled.asJson, "RootVolumeEncryptionEnabled" -> o.rootVolumeEncryptionEnabled.asJson, "State" -> o.state.asJson, "ErrorMessage" -> o.errorMessage.asJson, "ErrorCode" -> o.errorCode.asJson, "BundleId" -> o.bundleId.asJson, "WorkspaceProperties" -> o.workspaceProperties.asJson, "DirectoryId" -> o.directoryId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val FailedCreateWorkspaceRequestEncoder: io.circe.Encoder[models.FailedCreateWorkspaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceRequest" -> o.workspaceRequest.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val DescribeTagsResultEncoder: io.circe.Encoder[models.DescribeTagsResult] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val StartWorkspacesRequestEncoder: io.circe.Encoder[models.StartWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StartWorkspaceRequests" -> o.startWorkspaceRequests.asJson)
  }
  final implicit val ComputeTypeEncoder: io.circe.Encoder[models.ComputeType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val UserStorageEncoder: io.circe.Encoder[models.UserStorage] = io.circe.Encoder.instance { o => 
    Json.obj("Capacity" -> o.capacity.asJson)
  }
  final implicit val CreateWorkspacesResultEncoder: io.circe.Encoder[models.CreateWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson, "PendingRequests" -> o.pendingRequests.asJson)
  }
  final implicit val UnsupportedWorkspaceConfigurationExceptionEncoder: io.circe.Encoder[models.UnsupportedWorkspaceConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeWorkspaceBundlesRequestEncoder: io.circe.Encoder[models.DescribeWorkspaceBundlesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BundleIds" -> o.bundleIds.asJson, "Owner" -> o.owner.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeWorkspacesConnectionStatusResultEncoder: io.circe.Encoder[models.DescribeWorkspacesConnectionStatusResult] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspacesConnectionStatus" -> o.workspacesConnectionStatus.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RebootRequestEncoder: io.circe.Encoder[models.RebootRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val DescribeTagsRequestEncoder: io.circe.Encoder[models.DescribeTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val TerminateRequestEncoder: io.circe.Encoder[models.TerminateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val RebuildWorkspacesRequestEncoder: io.circe.Encoder[models.RebuildWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RebuildWorkspaceRequests" -> o.rebuildWorkspaceRequests.asJson)
  }
  final implicit val CreateTagsRequestEncoder: io.circe.Encoder[models.CreateTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val DescribeWorkspaceDirectoriesResultEncoder: io.circe.Encoder[models.DescribeWorkspaceDirectoriesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Directories" -> o.directories.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "ResourceId" -> o.resourceId.asJson)
  }
  final implicit val StartWorkspacesResultEncoder: io.circe.Encoder[models.StartWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val ModifyWorkspacePropertiesResultEncoder: io.circe.Encoder[models.ModifyWorkspacePropertiesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeWorkspacesResultEncoder: io.circe.Encoder[models.DescribeWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Workspaces" -> o.workspaces.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidResourceStateExceptionEncoder: io.circe.Encoder[models.InvalidResourceStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RebuildWorkspacesResultEncoder: io.circe.Encoder[models.RebuildWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val DefaultWorkspaceCreationPropertiesEncoder: io.circe.Encoder[models.DefaultWorkspaceCreationProperties] = io.circe.Encoder.instance { o => 
    Json.obj("EnableWorkDocs" -> o.enableWorkDocs.asJson, "EnableInternetAccess" -> o.enableInternetAccess.asJson, "UserEnabledAsLocalAdministrator" -> o.userEnabledAsLocalAdministrator.asJson, "DefaultOu" -> o.defaultOu.asJson, "CustomSecurityGroupId" -> o.customSecurityGroupId.asJson)
  }
  final implicit val FailedWorkspaceChangeRequestEncoder: io.circe.Encoder[models.FailedWorkspaceChangeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val WorkspaceConnectionStatusEncoder: io.circe.Encoder[models.WorkspaceConnectionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson, "ConnectionState" -> o.connectionState.asJson, "ConnectionStateCheckTimestamp" -> o.connectionStateCheckTimestamp.asJson, "LastKnownUserConnectionTimestamp" -> o.lastKnownUserConnectionTimestamp.asJson)
  }
  final implicit val ResourceUnavailableExceptionEncoder: io.circe.Encoder[models.ResourceUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "ResourceId" -> o.resourceId.asJson)
  }
  final implicit val StopRequestEncoder: io.circe.Encoder[models.StopRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val OperationInProgressExceptionEncoder: io.circe.Encoder[models.OperationInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StopWorkspacesResultEncoder: io.circe.Encoder[models.StopWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val TerminateWorkspacesResultEncoder: io.circe.Encoder[models.TerminateWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val StopWorkspacesRequestEncoder: io.circe.Encoder[models.StopWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StopWorkspaceRequests" -> o.stopWorkspaceRequests.asJson)
  }
  final implicit val RebuildRequestEncoder: io.circe.Encoder[models.RebuildRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val DescribeWorkspaceBundlesResultEncoder: io.circe.Encoder[models.DescribeWorkspaceBundlesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Bundles" -> o.bundles.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateWorkspacesRequestEncoder: io.circe.Encoder[models.CreateWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Workspaces" -> o.workspaces.asJson)
  }
  final implicit val ResourceLimitExceededExceptionEncoder: io.circe.Encoder[models.ResourceLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidParameterValuesExceptionEncoder: io.circe.Encoder[models.InvalidParameterValuesException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeWorkspaceDirectoriesRequestEncoder: io.circe.Encoder[models.DescribeWorkspaceDirectoriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryIds" -> o.directoryIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateTagsResultEncoder: io.circe.Encoder[models.CreateTagsResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val WorkspacePropertiesEncoder: io.circe.Encoder[models.WorkspaceProperties] = io.circe.Encoder.instance { o => 
    Json.obj("RunningMode" -> o.runningMode.asJson, "RunningModeAutoStopTimeoutInMinutes" -> o.runningModeAutoStopTimeoutInMinutes.asJson)
  }
  final implicit val WorkspaceRequestEncoder: io.circe.Encoder[models.WorkspaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserName" -> o.userName.asJson, "BundleId" -> o.bundleId.asJson, "DirectoryId" -> o.directoryId.asJson, "VolumeEncryptionKey" -> o.volumeEncryptionKey.asJson, "Tags" -> o.tags.asJson, "UserVolumeEncryptionEnabled" -> o.userVolumeEncryptionEnabled.asJson, "RootVolumeEncryptionEnabled" -> o.rootVolumeEncryptionEnabled.asJson, "WorkspaceProperties" -> o.workspaceProperties.asJson)
  }
  final implicit val DeleteTagsRequestEncoder: io.circe.Encoder[models.DeleteTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val StartRequestEncoder: io.circe.Encoder[models.StartRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val DescribeWorkspacesConnectionStatusRequestEncoder: io.circe.Encoder[models.DescribeWorkspacesConnectionStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceIds" -> o.workspaceIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteTagsResultDecoder: io.circe.Decoder[models.DeleteTagsResult.type] = io.circe.Decoder.decodeUnit.as(models.DeleteTagsResult)
  final implicit val RebootWorkspacesResultDecoder: io.circe.Decoder[models.RebootWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(models.RebootWorkspacesResult.apply _)
  }
  final implicit val DescribeWorkspacesRequestDecoder: io.circe.Decoder[models.DescribeWorkspacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[scala.List[java.lang.String]]]("WorkspaceIds"), o.get[scala.Option[java.lang.String]]("BundleId"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.DescribeWorkspacesRequest.apply _)
  }
  final implicit val WorkspaceDirectoryDecoder: io.circe.Decoder[models.WorkspaceDirectory] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CustomerUserName"), o.get[scala.Option[java.lang.String]]("DirectoryName"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddresses"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.DefaultWorkspaceCreationProperties]]("WorkspaceCreationProperties"), o.get[scala.Option[java.lang.String]]("WorkspaceSecurityGroupId"), o.get[scala.Option[java.lang.String]]("Alias"), o.get[scala.Option[java.lang.String]]("IamRoleId"), o.get[scala.Option[java.lang.String]]("RegistrationCode"), o.get[scala.Option[java.lang.String]]("DirectoryType"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.WorkspaceDirectory.apply _)
  }
  final implicit val TerminateWorkspacesRequestDecoder: io.circe.Decoder[models.TerminateWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.TerminateRequest]]("TerminateWorkspaceRequests").map(models.TerminateWorkspacesRequest.apply _)
  }
  final implicit val WorkspaceBundleDecoder: io.circe.Decoder[models.WorkspaceBundle] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[models.ComputeType]]("ComputeType"), o.get[scala.Option[models.UserStorage]]("UserStorage"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("BundleId")).mapN(models.WorkspaceBundle.apply _)
  }
  final implicit val RebootWorkspacesRequestDecoder: io.circe.Decoder[models.RebootWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.RebootRequest]]("RebootWorkspaceRequests").map(models.RebootWorkspacesRequest.apply _)
  }
  final implicit val ModifyWorkspacePropertiesRequestDecoder: io.circe.Decoder[models.ModifyWorkspacePropertiesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkspaceId"), o.get[models.WorkspaceProperties]("WorkspaceProperties")).mapN(models.ModifyWorkspacePropertiesRequest.apply _)
  }
  final implicit val WorkspaceDecoder: io.circe.Decoder[models.Workspace] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComputerName"), o.get[scala.Option[java.lang.String]]("WorkspaceId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("VolumeEncryptionKey"), o.get[scala.Option[scala.Boolean]]("UserVolumeEncryptionEnabled"), o.get[scala.Option[scala.Boolean]]("RootVolumeEncryptionEnabled"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("ErrorMessage"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("BundleId"), o.get[scala.Option[models.WorkspaceProperties]]("WorkspaceProperties"), o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(models.Workspace.apply _)
  }
  final implicit val FailedCreateWorkspaceRequestDecoder: io.circe.Decoder[models.FailedCreateWorkspaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.WorkspaceRequest]]("WorkspaceRequest"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(models.FailedCreateWorkspaceRequest.apply _)
  }
  final implicit val DescribeTagsResultDecoder: io.circe.Decoder[models.DescribeTagsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Tag]]]("TagList").map(models.DescribeTagsResult.apply _)
  }
  final implicit val StartWorkspacesRequestDecoder: io.circe.Decoder[models.StartWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.StartRequest]]("StartWorkspaceRequests").map(models.StartWorkspacesRequest.apply _)
  }
  final implicit val ComputeTypeDecoder: io.circe.Decoder[models.ComputeType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Name").map(models.ComputeType.apply _)
  }
  final implicit val UserStorageDecoder: io.circe.Decoder[models.UserStorage] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Capacity").map(models.UserStorage.apply _)
  }
  final implicit val CreateWorkspacesResultDecoder: io.circe.Decoder[models.CreateWorkspacesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.FailedCreateWorkspaceRequest]]]("FailedRequests"), o.get[scala.Option[scala.List[models.Workspace]]]("PendingRequests")).mapN(models.CreateWorkspacesResult.apply _)
  }
  final implicit val UnsupportedWorkspaceConfigurationExceptionDecoder: io.circe.Decoder[models.UnsupportedWorkspaceConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.UnsupportedWorkspaceConfigurationException.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AccessDeniedException.apply _)
  }
  final implicit val DescribeWorkspaceBundlesRequestDecoder: io.circe.Decoder[models.DescribeWorkspaceBundlesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("BundleIds"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspaceBundlesRequest.apply _)
  }
  final implicit val DescribeWorkspacesConnectionStatusResultDecoder: io.circe.Decoder[models.DescribeWorkspacesConnectionStatusResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.WorkspaceConnectionStatus]]]("WorkspacesConnectionStatus"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspacesConnectionStatusResult.apply _)
  }
  final implicit val RebootRequestDecoder: io.circe.Decoder[models.RebootRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WorkspaceId").map(models.RebootRequest.apply _)
  }
  final implicit val DescribeTagsRequestDecoder: io.circe.Decoder[models.DescribeTagsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ResourceId").map(models.DescribeTagsRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val TerminateRequestDecoder: io.circe.Decoder[models.TerminateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WorkspaceId").map(models.TerminateRequest.apply _)
  }
  final implicit val RebuildWorkspacesRequestDecoder: io.circe.Decoder[models.RebuildWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.RebuildRequest]]("RebuildWorkspaceRequests").map(models.RebuildWorkspacesRequest.apply _)
  }
  final implicit val CreateTagsRequestDecoder: io.circe.Decoder[models.CreateTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.CreateTagsRequest.apply _)
  }
  final implicit val DescribeWorkspaceDirectoriesResultDecoder: io.circe.Decoder[models.DescribeWorkspaceDirectoriesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.WorkspaceDirectory]]]("Directories"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspaceDirectoriesResult.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("ResourceId")).mapN(models.ResourceNotFoundException.apply _)
  }
  final implicit val StartWorkspacesResultDecoder: io.circe.Decoder[models.StartWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(models.StartWorkspacesResult.apply _)
  }
  final implicit val ModifyWorkspacePropertiesResultDecoder: io.circe.Decoder[models.ModifyWorkspacePropertiesResult.type] = io.circe.Decoder.decodeUnit.as(models.ModifyWorkspacePropertiesResult)
  final implicit val DescribeWorkspacesResultDecoder: io.circe.Decoder[models.DescribeWorkspacesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Workspace]]]("Workspaces"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspacesResult.apply _)
  }
  final implicit val InvalidResourceStateExceptionDecoder: io.circe.Decoder[models.InvalidResourceStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidResourceStateException.apply _)
  }
  final implicit val RebuildWorkspacesResultDecoder: io.circe.Decoder[models.RebuildWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(models.RebuildWorkspacesResult.apply _)
  }
  final implicit val DefaultWorkspaceCreationPropertiesDecoder: io.circe.Decoder[models.DefaultWorkspaceCreationProperties] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("EnableWorkDocs"), o.get[scala.Option[scala.Boolean]]("EnableInternetAccess"), o.get[scala.Option[scala.Boolean]]("UserEnabledAsLocalAdministrator"), o.get[scala.Option[java.lang.String]]("DefaultOu"), o.get[scala.Option[java.lang.String]]("CustomSecurityGroupId")).mapN(models.DefaultWorkspaceCreationProperties.apply _)
  }
  final implicit val FailedWorkspaceChangeRequestDecoder: io.circe.Decoder[models.FailedWorkspaceChangeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkspaceId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(models.FailedWorkspaceChangeRequest.apply _)
  }
  final implicit val WorkspaceConnectionStatusDecoder: io.circe.Decoder[models.WorkspaceConnectionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkspaceId"), o.get[scala.Option[java.lang.String]]("ConnectionState"), o.get[scala.Option[java.time.Instant]]("ConnectionStateCheckTimestamp"), o.get[scala.Option[java.time.Instant]]("LastKnownUserConnectionTimestamp")).mapN(models.WorkspaceConnectionStatus.apply _)
  }
  final implicit val ResourceUnavailableExceptionDecoder: io.circe.Decoder[models.ResourceUnavailableException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("ResourceId")).mapN(models.ResourceUnavailableException.apply _)
  }
  final implicit val StopRequestDecoder: io.circe.Decoder[models.StopRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WorkspaceId").map(models.StopRequest.apply _)
  }
  final implicit val OperationInProgressExceptionDecoder: io.circe.Decoder[models.OperationInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.OperationInProgressException.apply _)
  }
  final implicit val StopWorkspacesResultDecoder: io.circe.Decoder[models.StopWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(models.StopWorkspacesResult.apply _)
  }
  final implicit val TerminateWorkspacesResultDecoder: io.circe.Decoder[models.TerminateWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(models.TerminateWorkspacesResult.apply _)
  }
  final implicit val StopWorkspacesRequestDecoder: io.circe.Decoder[models.StopWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.StopRequest]]("StopWorkspaceRequests").map(models.StopWorkspacesRequest.apply _)
  }
  final implicit val RebuildRequestDecoder: io.circe.Decoder[models.RebuildRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WorkspaceId").map(models.RebuildRequest.apply _)
  }
  final implicit val DescribeWorkspaceBundlesResultDecoder: io.circe.Decoder[models.DescribeWorkspaceBundlesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.WorkspaceBundle]]]("Bundles"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspaceBundlesResult.apply _)
  }
  final implicit val CreateWorkspacesRequestDecoder: io.circe.Decoder[models.CreateWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.WorkspaceRequest]]("Workspaces").map(models.CreateWorkspacesRequest.apply _)
  }
  final implicit val ResourceLimitExceededExceptionDecoder: io.circe.Decoder[models.ResourceLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceLimitExceededException.apply _)
  }
  final implicit val InvalidParameterValuesExceptionDecoder: io.circe.Decoder[models.InvalidParameterValuesException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterValuesException.apply _)
  }
  final implicit val DescribeWorkspaceDirectoriesRequestDecoder: io.circe.Decoder[models.DescribeWorkspaceDirectoriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DirectoryIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspaceDirectoriesRequest.apply _)
  }
  final implicit val CreateTagsResultDecoder: io.circe.Decoder[models.CreateTagsResult.type] = io.circe.Decoder.decodeUnit.as(models.CreateTagsResult)
  final implicit val WorkspacePropertiesDecoder: io.circe.Decoder[models.WorkspaceProperties] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RunningMode"), o.get[scala.Option[scala.Int]]("RunningModeAutoStopTimeoutInMinutes")).mapN(models.WorkspaceProperties.apply _)
  }
  final implicit val WorkspaceRequestDecoder: io.circe.Decoder[models.WorkspaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserName"), o.get[java.lang.String]("BundleId"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("VolumeEncryptionKey"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[scala.Boolean]]("UserVolumeEncryptionEnabled"), o.get[scala.Option[scala.Boolean]]("RootVolumeEncryptionEnabled"), o.get[scala.Option[models.WorkspaceProperties]]("WorkspaceProperties")).mapN(models.WorkspaceRequest.apply _)
  }
  final implicit val DeleteTagsRequestDecoder: io.circe.Decoder[models.DeleteTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.DeleteTagsRequest.apply _)
  }
  final implicit val StartRequestDecoder: io.circe.Decoder[models.StartRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WorkspaceId").map(models.StartRequest.apply _)
  }
  final implicit val DescribeWorkspacesConnectionStatusRequestDecoder: io.circe.Decoder[models.DescribeWorkspacesConnectionStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("WorkspaceIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeWorkspacesConnectionStatusRequest.apply _)
  }
}