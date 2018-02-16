package avias.appstream
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ImageBuilderStateChangeReasonEncoder: io.circe.Encoder[avias.appstream.models.ImageBuilderStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val DisassociateFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.DisassociateFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("FleetName" -> o.fleetName.asJson, "StackName" -> o.stackName.asJson)
  }
  final implicit val DirectoryConfigEncoder: io.circe.Encoder[avias.appstream.models.DirectoryConfig] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryName" -> o.directoryName.asJson, "OrganizationalUnitDistinguishedNames" -> o.organizationalUnitDistinguishedNames.asJson, "ServiceAccountCredentials" -> o.serviceAccountCredentials.asJson, "CreatedTime" -> o.createdTime.asJson)
  }
  final implicit val ListAssociatedFleetsRequestEncoder: io.circe.Encoder[avias.appstream.models.ListAssociatedFleetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackName" -> o.stackName.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.appstream.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.appstream.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val StopFleetResultEncoder: io.circe.Encoder[avias.appstream.models.StopFleetResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSessionsRequestEncoder: io.circe.Encoder[avias.appstream.models.DescribeSessionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackName" -> o.stackName.asJson, "FleetName" -> o.fleetName.asJson, "NextToken" -> o.nextToken.asJson, "UserId" -> o.userId.asJson, "Limit" -> o.limit.asJson, "AuthenticationType" -> o.authenticationType.asJson)
  }
  final implicit val DeleteFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.DeleteFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val StorageConnectorEncoder: io.circe.Encoder[avias.appstream.models.StorageConnector] = io.circe.Encoder.instance { o => 
    Json.obj("ConnectorType" -> o.connectorType.asJson, "ResourceIdentifier" -> o.resourceIdentifier.asJson)
  }
  final implicit val DomainJoinInfoEncoder: io.circe.Encoder[avias.appstream.models.DomainJoinInfo] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryName" -> o.directoryName.asJson, "OrganizationalUnitDistinguishedName" -> o.organizationalUnitDistinguishedName.asJson)
  }
  final implicit val ImageEncoder: io.circe.Encoder[avias.appstream.models.Image] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Platform" -> o.platform.asJson, "CreatedTime" -> o.createdTime.asJson, "PublicBaseImageReleasedDate" -> o.publicBaseImageReleasedDate.asJson, "Arn" -> o.arn.asJson, "BaseImageArn" -> o.baseImageArn.asJson, "DisplayName" -> o.displayName.asJson, "Description" -> o.description.asJson, "State" -> o.state.asJson, "Applications" -> o.applications.asJson, "Visibility" -> o.visibility.asJson, "ImageBuilderSupported" -> o.imageBuilderSupported.asJson, "StateChangeReason" -> o.stateChangeReason.asJson)
  }
  final implicit val StopFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.StopFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DescribeImagesResultEncoder: io.circe.Encoder[avias.appstream.models.DescribeImagesResult] = io.circe.Encoder.instance { o => 
    Json.obj("Images" -> o.images.asJson)
  }
  final implicit val UpdateDirectoryConfigResultEncoder: io.circe.Encoder[avias.appstream.models.UpdateDirectoryConfigResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryConfig" -> o.directoryConfig.asJson)
  }
  final implicit val DescribeStacksRequestEncoder: io.circe.Encoder[avias.appstream.models.DescribeStacksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateStreamingURLRequestEncoder: io.circe.Encoder[avias.appstream.models.CreateStreamingURLRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StackName" -> o.stackName.asJson, "FleetName" -> o.fleetName.asJson, "UserId" -> o.userId.asJson, "ApplicationId" -> o.applicationId.asJson, "SessionContext" -> o.sessionContext.asJson, "Validity" -> o.validity.asJson)
  }
  final implicit val ListAssociatedStacksResultEncoder: io.circe.Encoder[avias.appstream.models.ListAssociatedStacksResult] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteImageRequestEncoder: io.circe.Encoder[avias.appstream.models.DeleteImageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val CreateDirectoryConfigRequestEncoder: io.circe.Encoder[avias.appstream.models.CreateDirectoryConfigRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryName" -> o.directoryName.asJson, "OrganizationalUnitDistinguishedNames" -> o.organizationalUnitDistinguishedNames.asJson, "ServiceAccountCredentials" -> o.serviceAccountCredentials.asJson)
  }
  final implicit val StartImageBuilderRequestEncoder: io.circe.Encoder[avias.appstream.models.StartImageBuilderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.appstream.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateStackResultEncoder: io.circe.Encoder[avias.appstream.models.UpdateStackResult] = io.circe.Encoder.instance { o => 
    Json.obj("Stack" -> o.stack.asJson)
  }
  final implicit val DeleteFleetResultEncoder: io.circe.Encoder[avias.appstream.models.DeleteFleetResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListAssociatedStacksRequestEncoder: io.circe.Encoder[avias.appstream.models.ListAssociatedStacksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("FleetName" -> o.fleetName.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateImageBuilderResultEncoder: io.circe.Encoder[avias.appstream.models.CreateImageBuilderResult] = io.circe.Encoder.instance { o => 
    Json.obj("ImageBuilder" -> o.imageBuilder.asJson)
  }
  final implicit val FleetErrorEncoder: io.circe.Encoder[avias.appstream.models.FleetError] = io.circe.Encoder.instance { o => 
    Json.obj("ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val CreateStackResultEncoder: io.circe.Encoder[avias.appstream.models.CreateStackResult] = io.circe.Encoder.instance { o => 
    Json.obj("Stack" -> o.stack.asJson)
  }
  final implicit val CreateStreamingURLResultEncoder: io.circe.Encoder[avias.appstream.models.CreateStreamingURLResult] = io.circe.Encoder.instance { o => 
    Json.obj("StreamingURL" -> o.streamingURL.asJson, "Expires" -> o.expires.asJson)
  }
  final implicit val ComputeCapacityEncoder: io.circe.Encoder[avias.appstream.models.ComputeCapacity] = io.circe.Encoder.instance { o => 
    Json.obj("DesiredInstances" -> o.desiredInstances.asJson)
  }
  final implicit val InvalidRoleExceptionEncoder: io.circe.Encoder[avias.appstream.models.InvalidRoleException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteImageBuilderResultEncoder: io.circe.Encoder[avias.appstream.models.DeleteImageBuilderResult] = io.circe.Encoder.instance { o => 
    Json.obj("ImageBuilder" -> o.imageBuilder.asJson)
  }
  final implicit val ImageBuilderEncoder: io.circe.Encoder[avias.appstream.models.ImageBuilder] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Platform" -> o.platform.asJson, "CreatedTime" -> o.createdTime.asJson, "DomainJoinInfo" -> o.domainJoinInfo.asJson, "Arn" -> o.arn.asJson, "ImageArn" -> o.imageArn.asJson, "Description" -> o.description.asJson, "DisplayName" -> o.displayName.asJson, "InstanceType" -> o.instanceType.asJson, "ImageBuilderErrors" -> o.imageBuilderErrors.asJson, "State" -> o.state.asJson, "EnableDefaultInternetAccess" -> o.enableDefaultInternetAccess.asJson, "VpcConfig" -> o.vpcConfig.asJson)
  }
  final implicit val DeleteDirectoryConfigRequestEncoder: io.circe.Encoder[avias.appstream.models.DeleteDirectoryConfigRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryName" -> o.directoryName.asJson)
  }
  final implicit val CreateImageBuilderRequestEncoder: io.circe.Encoder[avias.appstream.models.CreateImageBuilderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ImageName" -> o.imageName.asJson, "InstanceType" -> o.instanceType.asJson, "Name" -> o.name.asJson, "DisplayName" -> o.displayName.asJson, "DomainJoinInfo" -> o.domainJoinInfo.asJson, "EnableDefaultInternetAccess" -> o.enableDefaultInternetAccess.asJson, "VpcConfig" -> o.vpcConfig.asJson, "Description" -> o.description.asJson)
  }
  final implicit val UpdateFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.UpdateFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DisplayName" -> o.displayName.asJson, "DomainJoinInfo" -> o.domainJoinInfo.asJson, "ImageName" -> o.imageName.asJson, "InstanceType" -> o.instanceType.asJson, "ComputeCapacity" -> o.computeCapacity.asJson, "EnableDefaultInternetAccess" -> o.enableDefaultInternetAccess.asJson, "AttributesToDelete" -> o.attributesToDelete.asJson, "MaxUserDurationInSeconds" -> o.maxUserDurationInSeconds.asJson, "DisconnectTimeoutInSeconds" -> o.disconnectTimeoutInSeconds.asJson, "DeleteVpcConfig" -> o.deleteVpcConfig.asJson, "VpcConfig" -> o.vpcConfig.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ExpireSessionRequestEncoder: io.circe.Encoder[avias.appstream.models.ExpireSessionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SessionId" -> o.sessionId.asJson)
  }
  final implicit val CreateImageBuilderStreamingURLResultEncoder: io.circe.Encoder[avias.appstream.models.CreateImageBuilderStreamingURLResult] = io.circe.Encoder.instance { o => 
    Json.obj("StreamingURL" -> o.streamingURL.asJson, "Expires" -> o.expires.asJson)
  }
  final implicit val ComputeCapacityStatusEncoder: io.circe.Encoder[avias.appstream.models.ComputeCapacityStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Desired" -> o.desired.asJson, "Running" -> o.running.asJson, "InUse" -> o.inUse.asJson, "Available" -> o.available.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.appstream.models.ResourceAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteImageBuilderRequestEncoder: io.circe.Encoder[avias.appstream.models.DeleteImageBuilderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val ResourceNotAvailableExceptionEncoder: io.circe.Encoder[avias.appstream.models.ResourceNotAvailableException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidParameterCombinationExceptionEncoder: io.circe.Encoder[avias.appstream.models.InvalidParameterCombinationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val SessionEncoder: io.circe.Encoder[avias.appstream.models.Session] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "StackName" -> o.stackName.asJson, "FleetName" -> o.fleetName.asJson, "UserId" -> o.userId.asJson, "State" -> o.state.asJson, "AuthenticationType" -> o.authenticationType.asJson)
  }
  final implicit val ExpireSessionResultEncoder: io.circe.Encoder[avias.appstream.models.ExpireSessionResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSessionsResultEncoder: io.circe.Encoder[avias.appstream.models.DescribeSessionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Sessions" -> o.sessions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.appstream.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AssociateFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.AssociateFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("FleetName" -> o.fleetName.asJson, "StackName" -> o.stackName.asJson)
  }
  final implicit val CreateStackRequestEncoder: io.circe.Encoder[avias.appstream.models.CreateStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Description" -> o.description.asJson, "DisplayName" -> o.displayName.asJson, "StorageConnectors" -> o.storageConnectors.asJson)
  }
  final implicit val ServiceAccountCredentialsEncoder: io.circe.Encoder[avias.appstream.models.ServiceAccountCredentials] = io.circe.Encoder.instance { o => 
    Json.obj("AccountName" -> o.accountName.asJson, "AccountPassword" -> o.accountPassword.asJson)
  }
  final implicit val StartFleetResultEncoder: io.circe.Encoder[avias.appstream.models.StartFleetResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateDirectoryConfigResultEncoder: io.circe.Encoder[avias.appstream.models.CreateDirectoryConfigResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryConfig" -> o.directoryConfig.asJson)
  }
  final implicit val FleetEncoder: io.circe.Encoder[avias.appstream.models.Fleet] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "ImageName" -> o.imageName.asJson, "InstanceType" -> o.instanceType.asJson, "ComputeCapacityStatus" -> o.computeCapacityStatus.asJson, "State" -> o.state.asJson, "CreatedTime" -> o.createdTime.asJson, "FleetErrors" -> o.fleetErrors.asJson, "DomainJoinInfo" -> o.domainJoinInfo.asJson, "DisplayName" -> o.displayName.asJson, "Description" -> o.description.asJson, "FleetType" -> o.fleetType.asJson, "EnableDefaultInternetAccess" -> o.enableDefaultInternetAccess.asJson, "MaxUserDurationInSeconds" -> o.maxUserDurationInSeconds.asJson, "DisconnectTimeoutInSeconds" -> o.disconnectTimeoutInSeconds.asJson, "VpcConfig" -> o.vpcConfig.asJson)
  }
  final implicit val DisassociateFleetResultEncoder: io.circe.Encoder[avias.appstream.models.DisassociateFleetResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val OperationNotPermittedExceptionEncoder: io.circe.Encoder[avias.appstream.models.OperationNotPermittedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val IncompatibleImageExceptionEncoder: io.circe.Encoder[avias.appstream.models.IncompatibleImageException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val StackEncoder: io.circe.Encoder[avias.appstream.models.Stack] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "CreatedTime" -> o.createdTime.asJson, "StorageConnectors" -> o.storageConnectors.asJson, "Arn" -> o.arn.asJson, "Description" -> o.description.asJson, "DisplayName" -> o.displayName.asJson, "StackErrors" -> o.stackErrors.asJson)
  }
  final implicit val UpdateDirectoryConfigRequestEncoder: io.circe.Encoder[avias.appstream.models.UpdateDirectoryConfigRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryName" -> o.directoryName.asJson, "OrganizationalUnitDistinguishedNames" -> o.organizationalUnitDistinguishedNames.asJson, "ServiceAccountCredentials" -> o.serviceAccountCredentials.asJson)
  }
  final implicit val DescribeImagesRequestEncoder: io.circe.Encoder[avias.appstream.models.DescribeImagesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson)
  }
  final implicit val ApplicationEncoder: io.circe.Encoder[avias.appstream.models.Application] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DisplayName" -> o.displayName.asJson, "IconURL" -> o.iconURL.asJson, "LaunchParameters" -> o.launchParameters.asJson, "LaunchPath" -> o.launchPath.asJson, "Enabled" -> o.enabled.asJson, "Metadata" -> o.metadata.asJson)
  }
  final implicit val DescribeImageBuildersResultEncoder: io.circe.Encoder[avias.appstream.models.DescribeImageBuildersResult] = io.circe.Encoder.instance { o => 
    Json.obj("ImageBuilders" -> o.imageBuilders.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StopImageBuilderRequestEncoder: io.circe.Encoder[avias.appstream.models.StopImageBuilderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val UpdateStackRequestEncoder: io.circe.Encoder[avias.appstream.models.UpdateStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "DisplayName" -> o.displayName.asJson, "StorageConnectors" -> o.storageConnectors.asJson, "DeleteStorageConnectors" -> o.deleteStorageConnectors.asJson, "Description" -> o.description.asJson)
  }
  final implicit val UpdateFleetResultEncoder: io.circe.Encoder[avias.appstream.models.UpdateFleetResult] = io.circe.Encoder.instance { o => 
    Json.obj("Fleet" -> o.fleet.asJson)
  }
  final implicit val CreateFleetResultEncoder: io.circe.Encoder[avias.appstream.models.CreateFleetResult] = io.circe.Encoder.instance { o => 
    Json.obj("Fleet" -> o.fleet.asJson)
  }
  final implicit val StopImageBuilderResultEncoder: io.circe.Encoder[avias.appstream.models.StopImageBuilderResult] = io.circe.Encoder.instance { o => 
    Json.obj("ImageBuilder" -> o.imageBuilder.asJson)
  }
  final implicit val CreateImageBuilderStreamingURLRequestEncoder: io.circe.Encoder[avias.appstream.models.CreateImageBuilderStreamingURLRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Validity" -> o.validity.asJson)
  }
  final implicit val ResourceErrorEncoder: io.circe.Encoder[avias.appstream.models.ResourceError] = io.circe.Encoder.instance { o => 
    Json.obj("ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson, "ErrorTimestamp" -> o.errorTimestamp.asJson)
  }
  final implicit val ImageStateChangeReasonEncoder: io.circe.Encoder[avias.appstream.models.ImageStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val DescribeImageBuildersRequestEncoder: io.circe.Encoder[avias.appstream.models.DescribeImageBuildersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteImageResultEncoder: io.circe.Encoder[avias.appstream.models.DeleteImageResult] = io.circe.Encoder.instance { o => 
    Json.obj("Image" -> o.image.asJson)
  }
  final implicit val AssociateFleetResultEncoder: io.circe.Encoder[avias.appstream.models.AssociateFleetResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val VpcConfigEncoder: io.circe.Encoder[avias.appstream.models.VpcConfig] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetIds" -> o.subnetIds.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson)
  }
  final implicit val CreateFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.CreateFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ImageName" -> o.imageName.asJson, "InstanceType" -> o.instanceType.asJson, "ComputeCapacity" -> o.computeCapacity.asJson, "Name" -> o.name.asJson, "DisplayName" -> o.displayName.asJson, "DomainJoinInfo" -> o.domainJoinInfo.asJson, "FleetType" -> o.fleetType.asJson, "EnableDefaultInternetAccess" -> o.enableDefaultInternetAccess.asJson, "MaxUserDurationInSeconds" -> o.maxUserDurationInSeconds.asJson, "DisconnectTimeoutInSeconds" -> o.disconnectTimeoutInSeconds.asJson, "VpcConfig" -> o.vpcConfig.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeDirectoryConfigsRequestEncoder: io.circe.Encoder[avias.appstream.models.DescribeDirectoryConfigsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryNames" -> o.directoryNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeStacksResultEncoder: io.circe.Encoder[avias.appstream.models.DescribeStacksResult] = io.circe.Encoder.instance { o => 
    Json.obj("Stacks" -> o.stacks.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeFleetsResultEncoder: io.circe.Encoder[avias.appstream.models.DescribeFleetsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Fleets" -> o.fleets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StartImageBuilderResultEncoder: io.circe.Encoder[avias.appstream.models.StartImageBuilderResult] = io.circe.Encoder.instance { o => 
    Json.obj("ImageBuilder" -> o.imageBuilder.asJson)
  }
  final implicit val DeleteStackRequestEncoder: io.circe.Encoder[avias.appstream.models.DeleteStackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DescribeFleetsRequestEncoder: io.circe.Encoder[avias.appstream.models.DescribeFleetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListAssociatedFleetsResultEncoder: io.circe.Encoder[avias.appstream.models.ListAssociatedFleetsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Names" -> o.names.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StackErrorEncoder: io.circe.Encoder[avias.appstream.models.StackError] = io.circe.Encoder.instance { o => 
    Json.obj("ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val DescribeDirectoryConfigsResultEncoder: io.circe.Encoder[avias.appstream.models.DescribeDirectoryConfigsResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryConfigs" -> o.directoryConfigs.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteStackResultEncoder: io.circe.Encoder[avias.appstream.models.DeleteStackResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDirectoryConfigResultEncoder: io.circe.Encoder[avias.appstream.models.DeleteDirectoryConfigResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartFleetRequestEncoder: io.circe.Encoder[avias.appstream.models.StartFleetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val ImageBuilderStateChangeReasonDecoder: io.circe.Decoder[avias.appstream.models.ImageBuilderStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.appstream.models.ImageBuilderStateChangeReason.apply _)
  }
  final implicit val DisassociateFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.DisassociateFleetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetName"), o.get[java.lang.String]("StackName")).mapN(avias.appstream.models.DisassociateFleetRequest.apply _)
  }
  final implicit val DirectoryConfigDecoder: io.circe.Decoder[avias.appstream.models.DirectoryConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryName"), o.get[scala.Option[scala.List[java.lang.String]]]("OrganizationalUnitDistinguishedNames"), o.get[scala.Option[avias.appstream.models.ServiceAccountCredentials]]("ServiceAccountCredentials"), o.get[scala.Option[java.time.Instant]]("CreatedTime")).mapN(avias.appstream.models.DirectoryConfig.apply _)
  }
  final implicit val ListAssociatedFleetsRequestDecoder: io.circe.Decoder[avias.appstream.models.ListAssociatedFleetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackName"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.ListAssociatedFleetsRequest.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.appstream.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.ResourceInUseException.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.appstream.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.ConcurrentModificationException.apply _)
  }
  final implicit val StopFleetResultDecoder: io.circe.Decoder[avias.appstream.models.StopFleetResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.StopFleetResult)
  final implicit val DescribeSessionsRequestDecoder: io.circe.Decoder[avias.appstream.models.DescribeSessionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackName"), o.get[java.lang.String]("FleetName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("UserId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("AuthenticationType")).mapN(avias.appstream.models.DescribeSessionsRequest.apply _)
  }
  final implicit val DeleteFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.DeleteFleetRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.DeleteFleetRequest.apply _)
  }
  final implicit val StorageConnectorDecoder: io.circe.Decoder[avias.appstream.models.StorageConnector] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ConnectorType"), o.get[scala.Option[java.lang.String]]("ResourceIdentifier")).mapN(avias.appstream.models.StorageConnector.apply _)
  }
  final implicit val DomainJoinInfoDecoder: io.circe.Decoder[avias.appstream.models.DomainJoinInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryName"), o.get[scala.Option[java.lang.String]]("OrganizationalUnitDistinguishedName")).mapN(avias.appstream.models.DomainJoinInfo.apply _)
  }
  final implicit val ImageDecoder: io.circe.Decoder[avias.appstream.models.Image] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("Platform"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[java.time.Instant]]("PublicBaseImageReleasedDate"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("BaseImageArn"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[scala.List[avias.appstream.models.Application]]]("Applications"), o.get[scala.Option[java.lang.String]]("Visibility"), o.get[scala.Option[scala.Boolean]]("ImageBuilderSupported"), o.get[scala.Option[avias.appstream.models.ImageStateChangeReason]]("StateChangeReason")).mapN(avias.appstream.models.Image.apply _)
  }
  final implicit val StopFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.StopFleetRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.StopFleetRequest.apply _)
  }
  final implicit val DescribeImagesResultDecoder: io.circe.Decoder[avias.appstream.models.DescribeImagesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.appstream.models.Image]]]("Images").map(avias.appstream.models.DescribeImagesResult.apply _)
  }
  final implicit val UpdateDirectoryConfigResultDecoder: io.circe.Decoder[avias.appstream.models.UpdateDirectoryConfigResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.DirectoryConfig]]("DirectoryConfig").map(avias.appstream.models.UpdateDirectoryConfigResult.apply _)
  }
  final implicit val DescribeStacksRequestDecoder: io.circe.Decoder[avias.appstream.models.DescribeStacksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeStacksRequest.apply _)
  }
  final implicit val CreateStreamingURLRequestDecoder: io.circe.Decoder[avias.appstream.models.CreateStreamingURLRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StackName"), o.get[java.lang.String]("FleetName"), o.get[java.lang.String]("UserId"), o.get[scala.Option[java.lang.String]]("ApplicationId"), o.get[scala.Option[java.lang.String]]("SessionContext"), o.get[scala.Option[scala.Long]]("Validity")).mapN(avias.appstream.models.CreateStreamingURLRequest.apply _)
  }
  final implicit val ListAssociatedStacksResultDecoder: io.circe.Decoder[avias.appstream.models.ListAssociatedStacksResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.ListAssociatedStacksResult.apply _)
  }
  final implicit val DeleteImageRequestDecoder: io.circe.Decoder[avias.appstream.models.DeleteImageRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.DeleteImageRequest.apply _)
  }
  final implicit val CreateDirectoryConfigRequestDecoder: io.circe.Decoder[avias.appstream.models.CreateDirectoryConfigRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryName"), o.get[scala.List[java.lang.String]]("OrganizationalUnitDistinguishedNames"), o.get[avias.appstream.models.ServiceAccountCredentials]("ServiceAccountCredentials")).mapN(avias.appstream.models.CreateDirectoryConfigRequest.apply _)
  }
  final implicit val StartImageBuilderRequestDecoder: io.circe.Decoder[avias.appstream.models.StartImageBuilderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.StartImageBuilderRequest.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.appstream.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.LimitExceededException.apply _)
  }
  final implicit val UpdateStackResultDecoder: io.circe.Decoder[avias.appstream.models.UpdateStackResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.Stack]]("Stack").map(avias.appstream.models.UpdateStackResult.apply _)
  }
  final implicit val DeleteFleetResultDecoder: io.circe.Decoder[avias.appstream.models.DeleteFleetResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.DeleteFleetResult)
  final implicit val ListAssociatedStacksRequestDecoder: io.circe.Decoder[avias.appstream.models.ListAssociatedStacksRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetName"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.ListAssociatedStacksRequest.apply _)
  }
  final implicit val CreateImageBuilderResultDecoder: io.circe.Decoder[avias.appstream.models.CreateImageBuilderResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.ImageBuilder]]("ImageBuilder").map(avias.appstream.models.CreateImageBuilderResult.apply _)
  }
  final implicit val FleetErrorDecoder: io.circe.Decoder[avias.appstream.models.FleetError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.appstream.models.FleetError.apply _)
  }
  final implicit val CreateStackResultDecoder: io.circe.Decoder[avias.appstream.models.CreateStackResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.Stack]]("Stack").map(avias.appstream.models.CreateStackResult.apply _)
  }
  final implicit val CreateStreamingURLResultDecoder: io.circe.Decoder[avias.appstream.models.CreateStreamingURLResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamingURL"), o.get[scala.Option[java.time.Instant]]("Expires")).mapN(avias.appstream.models.CreateStreamingURLResult.apply _)
  }
  final implicit val ComputeCapacityDecoder: io.circe.Decoder[avias.appstream.models.ComputeCapacity] = io.circe.Decoder.instance { o => 
    o.get[scala.Int]("DesiredInstances").map(avias.appstream.models.ComputeCapacity.apply _)
  }
  final implicit val InvalidRoleExceptionDecoder: io.circe.Decoder[avias.appstream.models.InvalidRoleException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.InvalidRoleException.apply _)
  }
  final implicit val DeleteImageBuilderResultDecoder: io.circe.Decoder[avias.appstream.models.DeleteImageBuilderResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.ImageBuilder]]("ImageBuilder").map(avias.appstream.models.DeleteImageBuilderResult.apply _)
  }
  final implicit val ImageBuilderDecoder: io.circe.Decoder[avias.appstream.models.ImageBuilder] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[avias.appstream.models.ImageBuilderStateChangeReason]]("StateChangeReason"), o.get[scala.Option[java.lang.String]]("Platform"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[avias.appstream.models.DomainJoinInfo]]("DomainJoinInfo"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("ImageArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[scala.List[avias.appstream.models.ResourceError]]]("ImageBuilderErrors"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[scala.Boolean]]("EnableDefaultInternetAccess"), o.get[scala.Option[avias.appstream.models.VpcConfig]]("VpcConfig")).mapN(avias.appstream.models.ImageBuilder.apply _)
  }
  final implicit val DeleteDirectoryConfigRequestDecoder: io.circe.Decoder[avias.appstream.models.DeleteDirectoryConfigRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryName").map(avias.appstream.models.DeleteDirectoryConfigRequest.apply _)
  }
  final implicit val CreateImageBuilderRequestDecoder: io.circe.Decoder[avias.appstream.models.CreateImageBuilderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ImageName"), o.get[java.lang.String]("InstanceType"), o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[avias.appstream.models.DomainJoinInfo]]("DomainJoinInfo"), o.get[scala.Option[scala.Boolean]]("EnableDefaultInternetAccess"), o.get[scala.Option[avias.appstream.models.VpcConfig]]("VpcConfig"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.appstream.models.CreateImageBuilderRequest.apply _)
  }
  final implicit val UpdateFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.UpdateFleetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[avias.appstream.models.DomainJoinInfo]]("DomainJoinInfo"), o.get[scala.Option[java.lang.String]]("ImageName"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[avias.appstream.models.ComputeCapacity]]("ComputeCapacity"), o.get[scala.Option[scala.Boolean]]("EnableDefaultInternetAccess"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToDelete"), o.get[scala.Option[scala.Int]]("MaxUserDurationInSeconds"), o.get[scala.Option[scala.Int]]("DisconnectTimeoutInSeconds"), o.get[scala.Option[scala.Boolean]]("DeleteVpcConfig"), o.get[scala.Option[avias.appstream.models.VpcConfig]]("VpcConfig"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.appstream.models.UpdateFleetRequest.apply _)
  }
  final implicit val ExpireSessionRequestDecoder: io.circe.Decoder[avias.appstream.models.ExpireSessionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SessionId").map(avias.appstream.models.ExpireSessionRequest.apply _)
  }
  final implicit val CreateImageBuilderStreamingURLResultDecoder: io.circe.Decoder[avias.appstream.models.CreateImageBuilderStreamingURLResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamingURL"), o.get[scala.Option[java.time.Instant]]("Expires")).mapN(avias.appstream.models.CreateImageBuilderStreamingURLResult.apply _)
  }
  final implicit val ComputeCapacityStatusDecoder: io.circe.Decoder[avias.appstream.models.ComputeCapacityStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("Desired"), o.get[scala.Option[scala.Int]]("Running"), o.get[scala.Option[scala.Int]]("InUse"), o.get[scala.Option[scala.Int]]("Available")).mapN(avias.appstream.models.ComputeCapacityStatus.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.appstream.models.ResourceAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.ResourceAlreadyExistsException.apply _)
  }
  final implicit val DeleteImageBuilderRequestDecoder: io.circe.Decoder[avias.appstream.models.DeleteImageBuilderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.DeleteImageBuilderRequest.apply _)
  }
  final implicit val ResourceNotAvailableExceptionDecoder: io.circe.Decoder[avias.appstream.models.ResourceNotAvailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.ResourceNotAvailableException.apply _)
  }
  final implicit val InvalidParameterCombinationExceptionDecoder: io.circe.Decoder[avias.appstream.models.InvalidParameterCombinationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.InvalidParameterCombinationException.apply _)
  }
  final implicit val SessionDecoder: io.circe.Decoder[avias.appstream.models.Session] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[java.lang.String]("StackName"), o.get[java.lang.String]("FleetName"), o.get[java.lang.String]("UserId"), o.get[java.lang.String]("State"), o.get[scala.Option[java.lang.String]]("AuthenticationType")).mapN(avias.appstream.models.Session.apply _)
  }
  final implicit val ExpireSessionResultDecoder: io.circe.Decoder[avias.appstream.models.ExpireSessionResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.ExpireSessionResult)
  final implicit val DescribeSessionsResultDecoder: io.circe.Decoder[avias.appstream.models.DescribeSessionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.appstream.models.Session]]]("Sessions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeSessionsResult.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.appstream.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.ResourceNotFoundException.apply _)
  }
  final implicit val AssociateFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.AssociateFleetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FleetName"), o.get[java.lang.String]("StackName")).mapN(avias.appstream.models.AssociateFleetRequest.apply _)
  }
  final implicit val CreateStackRequestDecoder: io.circe.Decoder[avias.appstream.models.CreateStackRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[scala.List[avias.appstream.models.StorageConnector]]]("StorageConnectors")).mapN(avias.appstream.models.CreateStackRequest.apply _)
  }
  final implicit val ServiceAccountCredentialsDecoder: io.circe.Decoder[avias.appstream.models.ServiceAccountCredentials] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountName"), o.get[java.lang.String]("AccountPassword")).mapN(avias.appstream.models.ServiceAccountCredentials.apply _)
  }
  final implicit val StartFleetResultDecoder: io.circe.Decoder[avias.appstream.models.StartFleetResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.StartFleetResult)
  final implicit val CreateDirectoryConfigResultDecoder: io.circe.Decoder[avias.appstream.models.CreateDirectoryConfigResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.DirectoryConfig]]("DirectoryConfig").map(avias.appstream.models.CreateDirectoryConfigResult.apply _)
  }
  final implicit val FleetDecoder: io.circe.Decoder[avias.appstream.models.Fleet] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Arn"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("ImageName"), o.get[java.lang.String]("InstanceType"), o.get[avias.appstream.models.ComputeCapacityStatus]("ComputeCapacityStatus"), o.get[java.lang.String]("State"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[scala.List[avias.appstream.models.FleetError]]]("FleetErrors"), o.get[scala.Option[avias.appstream.models.DomainJoinInfo]]("DomainJoinInfo"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("FleetType"), o.get[scala.Option[scala.Boolean]]("EnableDefaultInternetAccess"), o.get[scala.Option[scala.Int]]("MaxUserDurationInSeconds"), o.get[scala.Option[scala.Int]]("DisconnectTimeoutInSeconds"), o.get[scala.Option[avias.appstream.models.VpcConfig]]("VpcConfig")).mapN(avias.appstream.models.Fleet.apply _)
  }
  final implicit val DisassociateFleetResultDecoder: io.circe.Decoder[avias.appstream.models.DisassociateFleetResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.DisassociateFleetResult)
  final implicit val OperationNotPermittedExceptionDecoder: io.circe.Decoder[avias.appstream.models.OperationNotPermittedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.OperationNotPermittedException.apply _)
  }
  final implicit val IncompatibleImageExceptionDecoder: io.circe.Decoder[avias.appstream.models.IncompatibleImageException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.appstream.models.IncompatibleImageException.apply _)
  }
  final implicit val StackDecoder: io.circe.Decoder[avias.appstream.models.Stack] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.time.Instant]]("CreatedTime"), o.get[scala.Option[scala.List[avias.appstream.models.StorageConnector]]]("StorageConnectors"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[scala.List[avias.appstream.models.StackError]]]("StackErrors")).mapN(avias.appstream.models.Stack.apply _)
  }
  final implicit val UpdateDirectoryConfigRequestDecoder: io.circe.Decoder[avias.appstream.models.UpdateDirectoryConfigRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryName"), o.get[scala.Option[scala.List[java.lang.String]]]("OrganizationalUnitDistinguishedNames"), o.get[scala.Option[avias.appstream.models.ServiceAccountCredentials]]("ServiceAccountCredentials")).mapN(avias.appstream.models.UpdateDirectoryConfigRequest.apply _)
  }
  final implicit val DescribeImagesRequestDecoder: io.circe.Decoder[avias.appstream.models.DescribeImagesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("Names").map(avias.appstream.models.DescribeImagesRequest.apply _)
  }
  final implicit val ApplicationDecoder: io.circe.Decoder[avias.appstream.models.Application] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[java.lang.String]]("IconURL"), o.get[scala.Option[java.lang.String]]("LaunchParameters"), o.get[scala.Option[java.lang.String]]("LaunchPath"), o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Metadata")).mapN(avias.appstream.models.Application.apply _)
  }
  final implicit val DescribeImageBuildersResultDecoder: io.circe.Decoder[avias.appstream.models.DescribeImageBuildersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.appstream.models.ImageBuilder]]]("ImageBuilders"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeImageBuildersResult.apply _)
  }
  final implicit val StopImageBuilderRequestDecoder: io.circe.Decoder[avias.appstream.models.StopImageBuilderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.StopImageBuilderRequest.apply _)
  }
  final implicit val UpdateStackRequestDecoder: io.circe.Decoder[avias.appstream.models.UpdateStackRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[scala.List[avias.appstream.models.StorageConnector]]]("StorageConnectors"), o.get[scala.Option[scala.Boolean]]("DeleteStorageConnectors"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.appstream.models.UpdateStackRequest.apply _)
  }
  final implicit val UpdateFleetResultDecoder: io.circe.Decoder[avias.appstream.models.UpdateFleetResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.Fleet]]("Fleet").map(avias.appstream.models.UpdateFleetResult.apply _)
  }
  final implicit val CreateFleetResultDecoder: io.circe.Decoder[avias.appstream.models.CreateFleetResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.Fleet]]("Fleet").map(avias.appstream.models.CreateFleetResult.apply _)
  }
  final implicit val StopImageBuilderResultDecoder: io.circe.Decoder[avias.appstream.models.StopImageBuilderResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.ImageBuilder]]("ImageBuilder").map(avias.appstream.models.StopImageBuilderResult.apply _)
  }
  final implicit val CreateImageBuilderStreamingURLRequestDecoder: io.circe.Decoder[avias.appstream.models.CreateImageBuilderStreamingURLRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.Long]]("Validity")).mapN(avias.appstream.models.CreateImageBuilderStreamingURLRequest.apply _)
  }
  final implicit val ResourceErrorDecoder: io.circe.Decoder[avias.appstream.models.ResourceError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage"), o.get[scala.Option[java.time.Instant]]("ErrorTimestamp")).mapN(avias.appstream.models.ResourceError.apply _)
  }
  final implicit val ImageStateChangeReasonDecoder: io.circe.Decoder[avias.appstream.models.ImageStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.appstream.models.ImageStateChangeReason.apply _)
  }
  final implicit val DescribeImageBuildersRequestDecoder: io.circe.Decoder[avias.appstream.models.DescribeImageBuildersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeImageBuildersRequest.apply _)
  }
  final implicit val DeleteImageResultDecoder: io.circe.Decoder[avias.appstream.models.DeleteImageResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.Image]]("Image").map(avias.appstream.models.DeleteImageResult.apply _)
  }
  final implicit val AssociateFleetResultDecoder: io.circe.Decoder[avias.appstream.models.AssociateFleetResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.AssociateFleetResult)
  final implicit val VpcConfigDecoder: io.circe.Decoder[avias.appstream.models.VpcConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds")).mapN(avias.appstream.models.VpcConfig.apply _)
  }
  final implicit val CreateFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.CreateFleetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ImageName"), o.get[java.lang.String]("InstanceType"), o.get[avias.appstream.models.ComputeCapacity]("ComputeCapacity"), o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("DisplayName"), o.get[scala.Option[avias.appstream.models.DomainJoinInfo]]("DomainJoinInfo"), o.get[scala.Option[java.lang.String]]("FleetType"), o.get[scala.Option[scala.Boolean]]("EnableDefaultInternetAccess"), o.get[scala.Option[scala.Int]]("MaxUserDurationInSeconds"), o.get[scala.Option[scala.Int]]("DisconnectTimeoutInSeconds"), o.get[scala.Option[avias.appstream.models.VpcConfig]]("VpcConfig"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.appstream.models.CreateFleetRequest.apply _)
  }
  final implicit val DescribeDirectoryConfigsRequestDecoder: io.circe.Decoder[avias.appstream.models.DescribeDirectoryConfigsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DirectoryNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeDirectoryConfigsRequest.apply _)
  }
  final implicit val DescribeStacksResultDecoder: io.circe.Decoder[avias.appstream.models.DescribeStacksResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.appstream.models.Stack]]]("Stacks"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeStacksResult.apply _)
  }
  final implicit val DescribeFleetsResultDecoder: io.circe.Decoder[avias.appstream.models.DescribeFleetsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.appstream.models.Fleet]]]("Fleets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeFleetsResult.apply _)
  }
  final implicit val StartImageBuilderResultDecoder: io.circe.Decoder[avias.appstream.models.StartImageBuilderResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.appstream.models.ImageBuilder]]("ImageBuilder").map(avias.appstream.models.StartImageBuilderResult.apply _)
  }
  final implicit val DeleteStackRequestDecoder: io.circe.Decoder[avias.appstream.models.DeleteStackRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.DeleteStackRequest.apply _)
  }
  final implicit val DescribeFleetsRequestDecoder: io.circe.Decoder[avias.appstream.models.DescribeFleetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeFleetsRequest.apply _)
  }
  final implicit val ListAssociatedFleetsResultDecoder: io.circe.Decoder[avias.appstream.models.ListAssociatedFleetsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Names"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.ListAssociatedFleetsResult.apply _)
  }
  final implicit val StackErrorDecoder: io.circe.Decoder[avias.appstream.models.StackError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.appstream.models.StackError.apply _)
  }
  final implicit val DescribeDirectoryConfigsResultDecoder: io.circe.Decoder[avias.appstream.models.DescribeDirectoryConfigsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.appstream.models.DirectoryConfig]]]("DirectoryConfigs"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.appstream.models.DescribeDirectoryConfigsResult.apply _)
  }
  final implicit val DeleteStackResultDecoder: io.circe.Decoder[avias.appstream.models.DeleteStackResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.DeleteStackResult)
  final implicit val DeleteDirectoryConfigResultDecoder: io.circe.Decoder[avias.appstream.models.DeleteDirectoryConfigResult.type] = io.circe.Decoder.decodeUnit.as(avias.appstream.models.DeleteDirectoryConfigResult)
  final implicit val StartFleetRequestDecoder: io.circe.Decoder[avias.appstream.models.StartFleetRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(avias.appstream.models.StartFleetRequest.apply _)
  }
}