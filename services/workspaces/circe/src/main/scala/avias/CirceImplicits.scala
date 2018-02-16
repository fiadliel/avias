package avias.workspaces
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteTagsResultEncoder: io.circe.Encoder[avias.workspaces.models.DeleteTagsResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RebootWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.RebootWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val DescribeWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserName" -> o.userName.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson, "WorkspaceIds" -> o.workspaceIds.asJson, "BundleId" -> o.bundleId.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val WorkspaceDirectoryEncoder: io.circe.Encoder[avias.workspaces.models.WorkspaceDirectory] = io.circe.Encoder.instance { o => 
    Json.obj("CustomerUserName" -> o.customerUserName.asJson, "DirectoryName" -> o.directoryName.asJson, "DnsIpAddresses" -> o.dnsIpAddresses.asJson, "SubnetIds" -> o.subnetIds.asJson, "State" -> o.state.asJson, "WorkspaceCreationProperties" -> o.workspaceCreationProperties.asJson, "WorkspaceSecurityGroupId" -> o.workspaceSecurityGroupId.asJson, "Alias" -> o.alias.asJson, "IamRoleId" -> o.iamRoleId.asJson, "RegistrationCode" -> o.registrationCode.asJson, "DirectoryType" -> o.directoryType.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val TerminateWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.TerminateWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TerminateWorkspaceRequests" -> o.terminateWorkspaceRequests.asJson)
  }
  final implicit val WorkspaceBundleEncoder: io.circe.Encoder[avias.workspaces.models.WorkspaceBundle] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ComputeType" -> o.computeType.asJson, "UserStorage" -> o.userStorage.asJson, "Owner" -> o.owner.asJson, "Description" -> o.description.asJson, "BundleId" -> o.bundleId.asJson)
  }
  final implicit val RebootWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.RebootWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RebootWorkspaceRequests" -> o.rebootWorkspaceRequests.asJson)
  }
  final implicit val ModifyWorkspacePropertiesRequestEncoder: io.circe.Encoder[avias.workspaces.models.ModifyWorkspacePropertiesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson, "WorkspaceProperties" -> o.workspaceProperties.asJson)
  }
  final implicit val WorkspaceEncoder: io.circe.Encoder[avias.workspaces.models.Workspace] = io.circe.Encoder.instance { o => 
    Json.obj("ComputerName" -> o.computerName.asJson, "WorkspaceId" -> o.workspaceId.asJson, "UserName" -> o.userName.asJson, "SubnetId" -> o.subnetId.asJson, "VolumeEncryptionKey" -> o.volumeEncryptionKey.asJson, "UserVolumeEncryptionEnabled" -> o.userVolumeEncryptionEnabled.asJson, "RootVolumeEncryptionEnabled" -> o.rootVolumeEncryptionEnabled.asJson, "State" -> o.state.asJson, "ErrorMessage" -> o.errorMessage.asJson, "ErrorCode" -> o.errorCode.asJson, "BundleId" -> o.bundleId.asJson, "WorkspaceProperties" -> o.workspaceProperties.asJson, "DirectoryId" -> o.directoryId.asJson, "IpAddress" -> o.ipAddress.asJson)
  }
  final implicit val FailedCreateWorkspaceRequestEncoder: io.circe.Encoder[avias.workspaces.models.FailedCreateWorkspaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceRequest" -> o.workspaceRequest.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val DescribeTagsResultEncoder: io.circe.Encoder[avias.workspaces.models.DescribeTagsResult] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val StartWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.StartWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StartWorkspaceRequests" -> o.startWorkspaceRequests.asJson)
  }
  final implicit val ComputeTypeEncoder: io.circe.Encoder[avias.workspaces.models.ComputeType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val UserStorageEncoder: io.circe.Encoder[avias.workspaces.models.UserStorage] = io.circe.Encoder.instance { o => 
    Json.obj("Capacity" -> o.capacity.asJson)
  }
  final implicit val CreateWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.CreateWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson, "PendingRequests" -> o.pendingRequests.asJson)
  }
  final implicit val UnsupportedWorkspaceConfigurationExceptionEncoder: io.circe.Encoder[avias.workspaces.models.UnsupportedWorkspaceConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[avias.workspaces.models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeWorkspaceBundlesRequestEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspaceBundlesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BundleIds" -> o.bundleIds.asJson, "Owner" -> o.owner.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeWorkspacesConnectionStatusResultEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspacesConnectionStatusResult] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspacesConnectionStatus" -> o.workspacesConnectionStatus.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RebootRequestEncoder: io.circe.Encoder[avias.workspaces.models.RebootRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val DescribeTagsRequestEncoder: io.circe.Encoder[avias.workspaces.models.DescribeTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.workspaces.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val TerminateRequestEncoder: io.circe.Encoder[avias.workspaces.models.TerminateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val RebuildWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.RebuildWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RebuildWorkspaceRequests" -> o.rebuildWorkspaceRequests.asJson)
  }
  final implicit val CreateTagsRequestEncoder: io.circe.Encoder[avias.workspaces.models.CreateTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val DescribeWorkspaceDirectoriesResultEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspaceDirectoriesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Directories" -> o.directories.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.workspaces.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "ResourceId" -> o.resourceId.asJson)
  }
  final implicit val StartWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.StartWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val ModifyWorkspacePropertiesResultEncoder: io.circe.Encoder[avias.workspaces.models.ModifyWorkspacePropertiesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Workspaces" -> o.workspaces.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidResourceStateExceptionEncoder: io.circe.Encoder[avias.workspaces.models.InvalidResourceStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RebuildWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.RebuildWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val DefaultWorkspaceCreationPropertiesEncoder: io.circe.Encoder[avias.workspaces.models.DefaultWorkspaceCreationProperties] = io.circe.Encoder.instance { o => 
    Json.obj("EnableWorkDocs" -> o.enableWorkDocs.asJson, "EnableInternetAccess" -> o.enableInternetAccess.asJson, "UserEnabledAsLocalAdministrator" -> o.userEnabledAsLocalAdministrator.asJson, "DefaultOu" -> o.defaultOu.asJson, "CustomSecurityGroupId" -> o.customSecurityGroupId.asJson)
  }
  final implicit val FailedWorkspaceChangeRequestEncoder: io.circe.Encoder[avias.workspaces.models.FailedWorkspaceChangeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val WorkspaceConnectionStatusEncoder: io.circe.Encoder[avias.workspaces.models.WorkspaceConnectionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson, "ConnectionState" -> o.connectionState.asJson, "ConnectionStateCheckTimestamp" -> o.connectionStateCheckTimestamp.asJson, "LastKnownUserConnectionTimestamp" -> o.lastKnownUserConnectionTimestamp.asJson)
  }
  final implicit val ResourceUnavailableExceptionEncoder: io.circe.Encoder[avias.workspaces.models.ResourceUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "ResourceId" -> o.resourceId.asJson)
  }
  final implicit val StopRequestEncoder: io.circe.Encoder[avias.workspaces.models.StopRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val OperationInProgressExceptionEncoder: io.circe.Encoder[avias.workspaces.models.OperationInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StopWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.StopWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val TerminateWorkspacesResultEncoder: io.circe.Encoder[avias.workspaces.models.TerminateWorkspacesResult] = io.circe.Encoder.instance { o => 
    Json.obj("FailedRequests" -> o.failedRequests.asJson)
  }
  final implicit val StopWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.StopWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StopWorkspaceRequests" -> o.stopWorkspaceRequests.asJson)
  }
  final implicit val RebuildRequestEncoder: io.circe.Encoder[avias.workspaces.models.RebuildRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val DescribeWorkspaceBundlesResultEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspaceBundlesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Bundles" -> o.bundles.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateWorkspacesRequestEncoder: io.circe.Encoder[avias.workspaces.models.CreateWorkspacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Workspaces" -> o.workspaces.asJson)
  }
  final implicit val ResourceLimitExceededExceptionEncoder: io.circe.Encoder[avias.workspaces.models.ResourceLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidParameterValuesExceptionEncoder: io.circe.Encoder[avias.workspaces.models.InvalidParameterValuesException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeWorkspaceDirectoriesRequestEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspaceDirectoriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryIds" -> o.directoryIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateTagsResultEncoder: io.circe.Encoder[avias.workspaces.models.CreateTagsResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val WorkspacePropertiesEncoder: io.circe.Encoder[avias.workspaces.models.WorkspaceProperties] = io.circe.Encoder.instance { o => 
    Json.obj("RunningMode" -> o.runningMode.asJson, "RunningModeAutoStopTimeoutInMinutes" -> o.runningModeAutoStopTimeoutInMinutes.asJson)
  }
  final implicit val WorkspaceRequestEncoder: io.circe.Encoder[avias.workspaces.models.WorkspaceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserName" -> o.userName.asJson, "BundleId" -> o.bundleId.asJson, "DirectoryId" -> o.directoryId.asJson, "VolumeEncryptionKey" -> o.volumeEncryptionKey.asJson, "Tags" -> o.tags.asJson, "UserVolumeEncryptionEnabled" -> o.userVolumeEncryptionEnabled.asJson, "RootVolumeEncryptionEnabled" -> o.rootVolumeEncryptionEnabled.asJson, "WorkspaceProperties" -> o.workspaceProperties.asJson)
  }
  final implicit val DeleteTagsRequestEncoder: io.circe.Encoder[avias.workspaces.models.DeleteTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val StartRequestEncoder: io.circe.Encoder[avias.workspaces.models.StartRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceId" -> o.workspaceId.asJson)
  }
  final implicit val DescribeWorkspacesConnectionStatusRequestEncoder: io.circe.Encoder[avias.workspaces.models.DescribeWorkspacesConnectionStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkspaceIds" -> o.workspaceIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteTagsResultDecoder: io.circe.Decoder[avias.workspaces.models.DeleteTagsResult.type] = io.circe.Decoder.decodeUnit.as(avias.workspaces.models.DeleteTagsResult)
  final implicit val RebootWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.RebootWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(avias.workspaces.models.RebootWorkspacesResult.apply _)
  }
  final implicit val DescribeWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[scala.List[java.lang.String]]]("WorkspaceIds"), o.get[scala.Option[java.lang.String]]("BundleId"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.workspaces.models.DescribeWorkspacesRequest.apply _)
  }
  final implicit val WorkspaceDirectoryDecoder: io.circe.Decoder[avias.workspaces.models.WorkspaceDirectory] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CustomerUserName"), o.get[scala.Option[java.lang.String]]("DirectoryName"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddresses"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[avias.workspaces.models.DefaultWorkspaceCreationProperties]]("WorkspaceCreationProperties"), o.get[scala.Option[java.lang.String]]("WorkspaceSecurityGroupId"), o.get[scala.Option[java.lang.String]]("Alias"), o.get[scala.Option[java.lang.String]]("IamRoleId"), o.get[scala.Option[java.lang.String]]("RegistrationCode"), o.get[scala.Option[java.lang.String]]("DirectoryType"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.workspaces.models.WorkspaceDirectory.apply _)
  }
  final implicit val TerminateWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.TerminateWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.workspaces.models.TerminateRequest]]("TerminateWorkspaceRequests").map(avias.workspaces.models.TerminateWorkspacesRequest.apply _)
  }
  final implicit val WorkspaceBundleDecoder: io.circe.Decoder[avias.workspaces.models.WorkspaceBundle] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[avias.workspaces.models.ComputeType]]("ComputeType"), o.get[scala.Option[avias.workspaces.models.UserStorage]]("UserStorage"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("BundleId")).mapN(avias.workspaces.models.WorkspaceBundle.apply _)
  }
  final implicit val RebootWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.RebootWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.workspaces.models.RebootRequest]]("RebootWorkspaceRequests").map(avias.workspaces.models.RebootWorkspacesRequest.apply _)
  }
  final implicit val ModifyWorkspacePropertiesRequestDecoder: io.circe.Decoder[avias.workspaces.models.ModifyWorkspacePropertiesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkspaceId"), o.get[avias.workspaces.models.WorkspaceProperties]("WorkspaceProperties")).mapN(avias.workspaces.models.ModifyWorkspacePropertiesRequest.apply _)
  }
  final implicit val WorkspaceDecoder: io.circe.Decoder[avias.workspaces.models.Workspace] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComputerName"), o.get[scala.Option[java.lang.String]]("WorkspaceId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("VolumeEncryptionKey"), o.get[scala.Option[scala.Boolean]]("UserVolumeEncryptionEnabled"), o.get[scala.Option[scala.Boolean]]("RootVolumeEncryptionEnabled"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("ErrorMessage"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("BundleId"), o.get[scala.Option[avias.workspaces.models.WorkspaceProperties]]("WorkspaceProperties"), o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[java.lang.String]]("IpAddress")).mapN(avias.workspaces.models.Workspace.apply _)
  }
  final implicit val FailedCreateWorkspaceRequestDecoder: io.circe.Decoder[avias.workspaces.models.FailedCreateWorkspaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.workspaces.models.WorkspaceRequest]]("WorkspaceRequest"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.workspaces.models.FailedCreateWorkspaceRequest.apply _)
  }
  final implicit val DescribeTagsResultDecoder: io.circe.Decoder[avias.workspaces.models.DescribeTagsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.workspaces.models.Tag]]]("TagList").map(avias.workspaces.models.DescribeTagsResult.apply _)
  }
  final implicit val StartWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.StartWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.workspaces.models.StartRequest]]("StartWorkspaceRequests").map(avias.workspaces.models.StartWorkspacesRequest.apply _)
  }
  final implicit val ComputeTypeDecoder: io.circe.Decoder[avias.workspaces.models.ComputeType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Name").map(avias.workspaces.models.ComputeType.apply _)
  }
  final implicit val UserStorageDecoder: io.circe.Decoder[avias.workspaces.models.UserStorage] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Capacity").map(avias.workspaces.models.UserStorage.apply _)
  }
  final implicit val CreateWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.CreateWorkspacesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.workspaces.models.FailedCreateWorkspaceRequest]]]("FailedRequests"), o.get[scala.Option[scala.List[avias.workspaces.models.Workspace]]]("PendingRequests")).mapN(avias.workspaces.models.CreateWorkspacesResult.apply _)
  }
  final implicit val UnsupportedWorkspaceConfigurationExceptionDecoder: io.circe.Decoder[avias.workspaces.models.UnsupportedWorkspaceConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.workspaces.models.UnsupportedWorkspaceConfigurationException.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[avias.workspaces.models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.workspaces.models.AccessDeniedException.apply _)
  }
  final implicit val DescribeWorkspaceBundlesRequestDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspaceBundlesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("BundleIds"), o.get[scala.Option[java.lang.String]]("Owner"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspaceBundlesRequest.apply _)
  }
  final implicit val DescribeWorkspacesConnectionStatusResultDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspacesConnectionStatusResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.workspaces.models.WorkspaceConnectionStatus]]]("WorkspacesConnectionStatus"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspacesConnectionStatusResult.apply _)
  }
  final implicit val RebootRequestDecoder: io.circe.Decoder[avias.workspaces.models.RebootRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WorkspaceId").map(avias.workspaces.models.RebootRequest.apply _)
  }
  final implicit val DescribeTagsRequestDecoder: io.circe.Decoder[avias.workspaces.models.DescribeTagsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ResourceId").map(avias.workspaces.models.DescribeTagsRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.workspaces.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.workspaces.models.Tag.apply _)
  }
  final implicit val TerminateRequestDecoder: io.circe.Decoder[avias.workspaces.models.TerminateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WorkspaceId").map(avias.workspaces.models.TerminateRequest.apply _)
  }
  final implicit val RebuildWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.RebuildWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.workspaces.models.RebuildRequest]]("RebuildWorkspaceRequests").map(avias.workspaces.models.RebuildWorkspacesRequest.apply _)
  }
  final implicit val CreateTagsRequestDecoder: io.circe.Decoder[avias.workspaces.models.CreateTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[avias.workspaces.models.Tag]]("Tags")).mapN(avias.workspaces.models.CreateTagsRequest.apply _)
  }
  final implicit val DescribeWorkspaceDirectoriesResultDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspaceDirectoriesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.workspaces.models.WorkspaceDirectory]]]("Directories"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspaceDirectoriesResult.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.workspaces.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("ResourceId")).mapN(avias.workspaces.models.ResourceNotFoundException.apply _)
  }
  final implicit val StartWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.StartWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(avias.workspaces.models.StartWorkspacesResult.apply _)
  }
  final implicit val ModifyWorkspacePropertiesResultDecoder: io.circe.Decoder[avias.workspaces.models.ModifyWorkspacePropertiesResult.type] = io.circe.Decoder.decodeUnit.as(avias.workspaces.models.ModifyWorkspacePropertiesResult)
  final implicit val DescribeWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspacesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.workspaces.models.Workspace]]]("Workspaces"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspacesResult.apply _)
  }
  final implicit val InvalidResourceStateExceptionDecoder: io.circe.Decoder[avias.workspaces.models.InvalidResourceStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.workspaces.models.InvalidResourceStateException.apply _)
  }
  final implicit val RebuildWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.RebuildWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(avias.workspaces.models.RebuildWorkspacesResult.apply _)
  }
  final implicit val DefaultWorkspaceCreationPropertiesDecoder: io.circe.Decoder[avias.workspaces.models.DefaultWorkspaceCreationProperties] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("EnableWorkDocs"), o.get[scala.Option[scala.Boolean]]("EnableInternetAccess"), o.get[scala.Option[scala.Boolean]]("UserEnabledAsLocalAdministrator"), o.get[scala.Option[java.lang.String]]("DefaultOu"), o.get[scala.Option[java.lang.String]]("CustomSecurityGroupId")).mapN(avias.workspaces.models.DefaultWorkspaceCreationProperties.apply _)
  }
  final implicit val FailedWorkspaceChangeRequestDecoder: io.circe.Decoder[avias.workspaces.models.FailedWorkspaceChangeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkspaceId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.workspaces.models.FailedWorkspaceChangeRequest.apply _)
  }
  final implicit val WorkspaceConnectionStatusDecoder: io.circe.Decoder[avias.workspaces.models.WorkspaceConnectionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkspaceId"), o.get[scala.Option[java.lang.String]]("ConnectionState"), o.get[scala.Option[java.time.Instant]]("ConnectionStateCheckTimestamp"), o.get[scala.Option[java.time.Instant]]("LastKnownUserConnectionTimestamp")).mapN(avias.workspaces.models.WorkspaceConnectionStatus.apply _)
  }
  final implicit val ResourceUnavailableExceptionDecoder: io.circe.Decoder[avias.workspaces.models.ResourceUnavailableException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("ResourceId")).mapN(avias.workspaces.models.ResourceUnavailableException.apply _)
  }
  final implicit val StopRequestDecoder: io.circe.Decoder[avias.workspaces.models.StopRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WorkspaceId").map(avias.workspaces.models.StopRequest.apply _)
  }
  final implicit val OperationInProgressExceptionDecoder: io.circe.Decoder[avias.workspaces.models.OperationInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.workspaces.models.OperationInProgressException.apply _)
  }
  final implicit val StopWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.StopWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(avias.workspaces.models.StopWorkspacesResult.apply _)
  }
  final implicit val TerminateWorkspacesResultDecoder: io.circe.Decoder[avias.workspaces.models.TerminateWorkspacesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]]]("FailedRequests").map(avias.workspaces.models.TerminateWorkspacesResult.apply _)
  }
  final implicit val StopWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.StopWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.workspaces.models.StopRequest]]("StopWorkspaceRequests").map(avias.workspaces.models.StopWorkspacesRequest.apply _)
  }
  final implicit val RebuildRequestDecoder: io.circe.Decoder[avias.workspaces.models.RebuildRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("WorkspaceId").map(avias.workspaces.models.RebuildRequest.apply _)
  }
  final implicit val DescribeWorkspaceBundlesResultDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspaceBundlesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.workspaces.models.WorkspaceBundle]]]("Bundles"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspaceBundlesResult.apply _)
  }
  final implicit val CreateWorkspacesRequestDecoder: io.circe.Decoder[avias.workspaces.models.CreateWorkspacesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.workspaces.models.WorkspaceRequest]]("Workspaces").map(avias.workspaces.models.CreateWorkspacesRequest.apply _)
  }
  final implicit val ResourceLimitExceededExceptionDecoder: io.circe.Decoder[avias.workspaces.models.ResourceLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.workspaces.models.ResourceLimitExceededException.apply _)
  }
  final implicit val InvalidParameterValuesExceptionDecoder: io.circe.Decoder[avias.workspaces.models.InvalidParameterValuesException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.workspaces.models.InvalidParameterValuesException.apply _)
  }
  final implicit val DescribeWorkspaceDirectoriesRequestDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspaceDirectoriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DirectoryIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspaceDirectoriesRequest.apply _)
  }
  final implicit val CreateTagsResultDecoder: io.circe.Decoder[avias.workspaces.models.CreateTagsResult.type] = io.circe.Decoder.decodeUnit.as(avias.workspaces.models.CreateTagsResult)
  final implicit val WorkspacePropertiesDecoder: io.circe.Decoder[avias.workspaces.models.WorkspaceProperties] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RunningMode"), o.get[scala.Option[scala.Int]]("RunningModeAutoStopTimeoutInMinutes")).mapN(avias.workspaces.models.WorkspaceProperties.apply _)
  }
  final implicit val WorkspaceRequestDecoder: io.circe.Decoder[avias.workspaces.models.WorkspaceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserName"), o.get[java.lang.String]("BundleId"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("VolumeEncryptionKey"), o.get[scala.Option[scala.List[avias.workspaces.models.Tag]]]("Tags"), o.get[scala.Option[scala.Boolean]]("UserVolumeEncryptionEnabled"), o.get[scala.Option[scala.Boolean]]("RootVolumeEncryptionEnabled"), o.get[scala.Option[avias.workspaces.models.WorkspaceProperties]]("WorkspaceProperties")).mapN(avias.workspaces.models.WorkspaceRequest.apply _)
  }
  final implicit val DeleteTagsRequestDecoder: io.circe.Decoder[avias.workspaces.models.DeleteTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.workspaces.models.DeleteTagsRequest.apply _)
  }
  final implicit val StartRequestDecoder: io.circe.Decoder[avias.workspaces.models.StartRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("WorkspaceId").map(avias.workspaces.models.StartRequest.apply _)
  }
  final implicit val DescribeWorkspacesConnectionStatusRequestDecoder: io.circe.Decoder[avias.workspaces.models.DescribeWorkspacesConnectionStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("WorkspaceIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.workspaces.models.DescribeWorkspacesConnectionStatusRequest.apply _)
  }
}