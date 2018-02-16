package avias.directory
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DirectoryLimitExceededExceptionEncoder: io.circe.Encoder[avias.directory.models.DirectoryLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val SchemaExtensionInfoEncoder: io.circe.Encoder[avias.directory.models.SchemaExtensionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("EndDateTime" -> o.endDateTime.asJson, "SchemaExtensionStatusReason" -> o.schemaExtensionStatusReason.asJson, "StartDateTime" -> o.startDateTime.asJson, "SchemaExtensionStatus" -> o.schemaExtensionStatus.asJson, "Description" -> o.description.asJson, "SchemaExtensionId" -> o.schemaExtensionId.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val RegisterEventTopicResultEncoder: io.circe.Encoder[avias.directory.models.RegisterEventTopicResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDirectoriesResultEncoder: io.circe.Encoder[avias.directory.models.DescribeDirectoriesResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryDescriptions" -> o.directoryDescriptions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateSnapshotResultEncoder: io.circe.Encoder[avias.directory.models.CreateSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val RemoveIpRoutesResultEncoder: io.circe.Encoder[avias.directory.models.RemoveIpRoutesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateTrustRequestEncoder: io.circe.Encoder[avias.directory.models.CreateTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustDirection" -> o.trustDirection.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "TrustPassword" -> o.trustPassword.asJson, "DirectoryId" -> o.directoryId.asJson, "TrustType" -> o.trustType.asJson, "ConditionalForwarderIpAddrs" -> o.conditionalForwarderIpAddrs.asJson)
  }
  final implicit val DescribeConditionalForwardersRequestEncoder: io.circe.Encoder[avias.directory.models.DescribeConditionalForwardersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainNames" -> o.remoteDomainNames.asJson)
  }
  final implicit val EnableRadiusRequestEncoder: io.circe.Encoder[avias.directory.models.EnableRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RadiusSettings" -> o.radiusSettings.asJson)
  }
  final implicit val CreateDirectoryRequestEncoder: io.circe.Encoder[avias.directory.models.CreateDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "Size" -> o.size.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson, "VpcSettings" -> o.vpcSettings.asJson)
  }
  final implicit val ClientExceptionEncoder: io.circe.Encoder[avias.directory.models.ClientException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val CreateAliasRequestEncoder: io.circe.Encoder[avias.directory.models.CreateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Alias" -> o.alias.asJson)
  }
  final implicit val AddIpRoutesResultEncoder: io.circe.Encoder[avias.directory.models.AddIpRoutesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartSchemaExtensionRequestEncoder: io.circe.Encoder[avias.directory.models.StartSchemaExtensionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "CreateSnapshotBeforeSchemaExtension" -> o.createSnapshotBeforeSchemaExtension.asJson, "LdifContent" -> o.ldifContent.asJson, "Description" -> o.description.asJson)
  }
  final implicit val EventTopicEncoder: io.circe.Encoder[avias.directory.models.EventTopic] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedDateTime" -> o.createdDateTime.asJson, "TopicArn" -> o.topicArn.asJson, "TopicName" -> o.topicName.asJson, "Status" -> o.status.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val RegisterEventTopicRequestEncoder: io.circe.Encoder[avias.directory.models.RegisterEventTopicRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicName" -> o.topicName.asJson)
  }
  final implicit val EnableSsoResultEncoder: io.circe.Encoder[avias.directory.models.EnableSsoResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AuthenticationFailedExceptionEncoder: io.circe.Encoder[avias.directory.models.AuthenticationFailedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DeregisterEventTopicResultEncoder: io.circe.Encoder[avias.directory.models.DeregisterEventTopicResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[avias.directory.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DescribeDomainControllersRequestEncoder: io.circe.Encoder[avias.directory.models.DescribeDomainControllersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "DomainControllerIds" -> o.domainControllerIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeConditionalForwardersResultEncoder: io.circe.Encoder[avias.directory.models.DescribeConditionalForwardersResult] = io.circe.Encoder.instance { o => 
    Json.obj("ConditionalForwarders" -> o.conditionalForwarders.asJson)
  }
  final implicit val DescribeTrustsResultEncoder: io.circe.Encoder[avias.directory.models.DescribeTrustsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Trusts" -> o.trusts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConditionalForwarderEncoder: io.circe.Encoder[avias.directory.models.ConditionalForwarder] = io.circe.Encoder.instance { o => 
    Json.obj("RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson, "ReplicationScope" -> o.replicationScope.asJson)
  }
  final implicit val UpdateRadiusResultEncoder: io.circe.Encoder[avias.directory.models.UpdateRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[avias.directory.models.UnsupportedOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ConnectDirectoryResultEncoder: io.circe.Encoder[avias.directory.models.ConnectDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CancelSchemaExtensionResultEncoder: io.circe.Encoder[avias.directory.models.CancelSchemaExtensionResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDirectoryResultEncoder: io.circe.Encoder[avias.directory.models.DeleteDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateConditionalForwarderRequestEncoder: io.circe.Encoder[avias.directory.models.CreateConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson)
  }
  final implicit val DeleteTrustRequestEncoder: io.circe.Encoder[avias.directory.models.DeleteTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson, "DeleteAssociatedConditionalForwarder" -> o.deleteAssociatedConditionalForwarder.asJson)
  }
  final implicit val DirectoryLimitsEncoder: io.circe.Encoder[avias.directory.models.DirectoryLimits] = io.circe.Encoder.instance { o => 
    Json.obj("CloudOnlyDirectoriesLimit" -> o.cloudOnlyDirectoriesLimit.asJson, "CloudOnlyMicrosoftADCurrentCount" -> o.cloudOnlyMicrosoftADCurrentCount.asJson, "ConnectedDirectoriesCurrentCount" -> o.connectedDirectoriesCurrentCount.asJson, "CloudOnlyDirectoriesCurrentCount" -> o.cloudOnlyDirectoriesCurrentCount.asJson, "CloudOnlyMicrosoftADLimit" -> o.cloudOnlyMicrosoftADLimit.asJson, "ConnectedDirectoriesLimit" -> o.connectedDirectoriesLimit.asJson, "CloudOnlyDirectoriesLimitReached" -> o.cloudOnlyDirectoriesLimitReached.asJson, "CloudOnlyMicrosoftADLimitReached" -> o.cloudOnlyMicrosoftADLimitReached.asJson, "ConnectedDirectoriesLimitReached" -> o.connectedDirectoriesLimitReached.asJson)
  }
  final implicit val DeleteSnapshotResultEncoder: io.circe.Encoder[avias.directory.models.DeleteSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeDomainControllersResultEncoder: io.circe.Encoder[avias.directory.models.DescribeDomainControllersResult] = io.circe.Encoder.instance { o => 
    Json.obj("DomainControllers" -> o.domainControllers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DisableRadiusRequestEncoder: io.circe.Encoder[avias.directory.models.DisableRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val AttributeEncoder: io.circe.Encoder[avias.directory.models.Attribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InsufficientPermissionsExceptionEncoder: io.circe.Encoder[avias.directory.models.InsufficientPermissionsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val RadiusSettingsEncoder: io.circe.Encoder[avias.directory.models.RadiusSettings] = io.circe.Encoder.instance { o => 
    Json.obj("AuthenticationProtocol" -> o.authenticationProtocol.asJson, "UseSameUsername" -> o.useSameUsername.asJson, "RadiusTimeout" -> o.radiusTimeout.asJson, "DisplayLabel" -> o.displayLabel.asJson, "SharedSecret" -> o.sharedSecret.asJson, "RadiusServers" -> o.radiusServers.asJson, "RadiusPort" -> o.radiusPort.asJson, "RadiusRetries" -> o.radiusRetries.asJson)
  }
  final implicit val SnapshotLimitExceededExceptionEncoder: io.circe.Encoder[avias.directory.models.SnapshotLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DomainControllerEncoder: io.circe.Encoder[avias.directory.models.DomainController] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "LaunchTime" -> o.launchTime.asJson, "StatusLastUpdatedDateTime" -> o.statusLastUpdatedDateTime.asJson, "SubnetId" -> o.subnetId.asJson, "DomainControllerId" -> o.domainControllerId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "Status" -> o.status.asJson, "DnsIpAddr" -> o.dnsIpAddr.asJson, "StatusReason" -> o.statusReason.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateComputerRequestEncoder: io.circe.Encoder[avias.directory.models.CreateComputerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Password" -> o.password.asJson, "ComputerName" -> o.computerName.asJson, "DirectoryId" -> o.directoryId.asJson, "ComputerAttributes" -> o.computerAttributes.asJson, "OrganizationalUnitDistinguishedName" -> o.organizationalUnitDistinguishedName.asJson)
  }
  final implicit val CreateTrustResultEncoder: io.circe.Encoder[avias.directory.models.CreateTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val DomainControllerLimitExceededExceptionEncoder: io.circe.Encoder[avias.directory.models.DomainControllerLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateConditionalForwarderResultEncoder: io.circe.Encoder[avias.directory.models.UpdateConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DirectoryVpcSettingsDescriptionEncoder: io.circe.Encoder[avias.directory.models.DirectoryVpcSettingsDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "SecurityGroupId" -> o.securityGroupId.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val VerifyTrustRequestEncoder: io.circe.Encoder[avias.directory.models.VerifyTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val DeleteTrustResultEncoder: io.circe.Encoder[avias.directory.models.DeleteTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val AddTagsToResourceResultEncoder: io.circe.Encoder[avias.directory.models.AddTagsToResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventTopicsResultEncoder: io.circe.Encoder[avias.directory.models.DescribeEventTopicsResult] = io.circe.Encoder.instance { o => 
    Json.obj("EventTopics" -> o.eventTopics.asJson)
  }
  final implicit val RemoveTagsFromResourceResultEncoder: io.circe.Encoder[avias.directory.models.RemoveTagsFromResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDirectoriesRequestEncoder: io.circe.Encoder[avias.directory.models.DescribeDirectoriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryIds" -> o.directoryIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DisableSsoResultEncoder: io.circe.Encoder[avias.directory.models.DisableSsoResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveIpRoutesRequestEncoder: io.circe.Encoder[avias.directory.models.RemoveIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "CidrIps" -> o.cidrIps.asJson)
  }
  final implicit val GetSnapshotLimitsRequestEncoder: io.circe.Encoder[avias.directory.models.GetSnapshotLimitsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val DescribeSnapshotsResultEncoder: io.circe.Encoder[avias.directory.models.DescribeSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Snapshots" -> o.snapshots.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetSnapshotLimitsResultEncoder: io.circe.Encoder[avias.directory.models.GetSnapshotLimitsResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotLimits" -> o.snapshotLimits.asJson)
  }
  final implicit val DeleteSnapshotRequestEncoder: io.circe.Encoder[avias.directory.models.DeleteSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val CreateAliasResultEncoder: io.circe.Encoder[avias.directory.models.CreateAliasResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Alias" -> o.alias.asJson)
  }
  final implicit val SnapshotEncoder: io.circe.Encoder[avias.directory.models.Snapshot] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "Name" -> o.name.asJson, "StartTime" -> o.startTime.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val AddTagsToResourceRequestEncoder: io.circe.Encoder[avias.directory.models.AddTagsToResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val GetDirectoryLimitsResultEncoder: io.circe.Encoder[avias.directory.models.GetDirectoryLimitsResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryLimits" -> o.directoryLimits.asJson)
  }
  final implicit val EntityDoesNotExistExceptionEncoder: io.circe.Encoder[avias.directory.models.EntityDoesNotExistException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ListIpRoutesRequestEncoder: io.circe.Encoder[avias.directory.models.ListIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListSchemaExtensionsResultEncoder: io.circe.Encoder[avias.directory.models.ListSchemaExtensionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaExtensionsInfo" -> o.schemaExtensionsInfo.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDirectoryResultEncoder: io.circe.Encoder[avias.directory.models.CreateDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val GetDirectoryLimitsRequestEncoder: io.circe.Encoder[avias.directory.models.GetDirectoryLimitsRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EntityAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.directory.models.EntityAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ListSchemaExtensionsRequestEncoder: io.circe.Encoder[avias.directory.models.ListSchemaExtensionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateSnapshotRequestEncoder: io.circe.Encoder[avias.directory.models.CreateSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val ConnectDirectoryRequestEncoder: io.circe.Encoder[avias.directory.models.ConnectDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "Size" -> o.size.asJson, "ConnectSettings" -> o.connectSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DeleteConditionalForwarderRequestEncoder: io.circe.Encoder[avias.directory.models.DeleteConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson)
  }
  final implicit val TrustEncoder: io.circe.Encoder[avias.directory.models.Trust] = io.circe.Encoder.instance { o => 
    Json.obj("TrustDirection" -> o.trustDirection.asJson, "CreatedDateTime" -> o.createdDateTime.asJson, "TrustStateReason" -> o.trustStateReason.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "LastUpdatedDateTime" -> o.lastUpdatedDateTime.asJson, "TrustId" -> o.trustId.asJson, "TrustState" -> o.trustState.asJson, "StateLastUpdatedDateTime" -> o.stateLastUpdatedDateTime.asJson, "TrustType" -> o.trustType.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateMicrosoftADRequestEncoder: io.circe.Encoder[avias.directory.models.CreateMicrosoftADRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "VpcSettings" -> o.vpcSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeSnapshotsRequestEncoder: io.circe.Encoder[avias.directory.models.DescribeSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "SnapshotIds" -> o.snapshotIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val VerifyTrustResultEncoder: io.circe.Encoder[avias.directory.models.VerifyTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val CreateConditionalForwarderResultEncoder: io.circe.Encoder[avias.directory.models.CreateConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SnapshotLimitsEncoder: io.circe.Encoder[avias.directory.models.SnapshotLimits] = io.circe.Encoder.instance { o => 
    Json.obj("ManualSnapshotsLimit" -> o.manualSnapshotsLimit.asJson, "ManualSnapshotsCurrentCount" -> o.manualSnapshotsCurrentCount.asJson, "ManualSnapshotsLimitReached" -> o.manualSnapshotsLimitReached.asJson)
  }
  final implicit val DisableRadiusResultEncoder: io.circe.Encoder[avias.directory.models.DisableRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateComputerResultEncoder: io.circe.Encoder[avias.directory.models.CreateComputerResult] = io.circe.Encoder.instance { o => 
    Json.obj("Computer" -> o.computer.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[avias.directory.models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeTrustsRequestEncoder: io.circe.Encoder[avias.directory.models.DescribeTrustsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TrustIds" -> o.trustIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeEventTopicsRequestEncoder: io.circe.Encoder[avias.directory.models.DescribeEventTopicsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicNames" -> o.topicNames.asJson)
  }
  final implicit val DeleteConditionalForwarderResultEncoder: io.circe.Encoder[avias.directory.models.DeleteConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DirectoryConnectSettingsEncoder: io.circe.Encoder[avias.directory.models.DirectoryConnectSettings] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "CustomerDnsIps" -> o.customerDnsIps.asJson, "CustomerUserName" -> o.customerUserName.asJson)
  }
  final implicit val UpdateNumberOfDomainControllersRequestEncoder: io.circe.Encoder[avias.directory.models.UpdateNumberOfDomainControllersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "DesiredNumber" -> o.desiredNumber.asJson)
  }
  final implicit val DirectoryConnectSettingsDescriptionEncoder: io.circe.Encoder[avias.directory.models.DirectoryConnectSettingsDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "CustomerUserName" -> o.customerUserName.asJson, "ConnectIps" -> o.connectIps.asJson, "SecurityGroupId" -> o.securityGroupId.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val ListTagsForResourceResultEncoder: io.circe.Encoder[avias.directory.models.ListTagsForResourceResult] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DirectoryUnavailableExceptionEncoder: io.circe.Encoder[avias.directory.models.DirectoryUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateNumberOfDomainControllersResultEncoder: io.circe.Encoder[avias.directory.models.UpdateNumberOfDomainControllersResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeregisterEventTopicRequestEncoder: io.circe.Encoder[avias.directory.models.DeregisterEventTopicRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicName" -> o.topicName.asJson)
  }
  final implicit val RestoreFromSnapshotResultEncoder: io.circe.Encoder[avias.directory.models.RestoreFromSnapshotResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComputerEncoder: io.circe.Encoder[avias.directory.models.Computer] = io.circe.Encoder.instance { o => 
    Json.obj("ComputerId" -> o.computerId.asJson, "ComputerName" -> o.computerName.asJson, "ComputerAttributes" -> o.computerAttributes.asJson)
  }
  final implicit val DirectoryDescriptionEncoder: io.circe.Encoder[avias.directory.models.DirectoryDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson, "StageReason" -> o.stageReason.asJson, "Name" -> o.name.asJson, "SsoEnabled" -> o.ssoEnabled.asJson, "LaunchTime" -> o.launchTime.asJson, "StageLastUpdatedDateTime" -> o.stageLastUpdatedDateTime.asJson, "RadiusSettings" -> o.radiusSettings.asJson, "Stage" -> o.stage.asJson, "VpcSettings" -> o.vpcSettings.asJson, "RadiusStatus" -> o.radiusStatus.asJson, "Type" -> o.`type`.asJson, "Size" -> o.size.asJson, "ConnectSettings" -> o.connectSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson, "DesiredNumberOfDomainControllers" -> o.desiredNumberOfDomainControllers.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson, "AccessUrl" -> o.accessUrl.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[avias.directory.models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateConditionalForwarderRequestEncoder: io.circe.Encoder[avias.directory.models.UpdateConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson)
  }
  final implicit val DirectoryVpcSettingsEncoder: io.circe.Encoder[avias.directory.models.DirectoryVpcSettings] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val UpdateRadiusRequestEncoder: io.circe.Encoder[avias.directory.models.UpdateRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RadiusSettings" -> o.radiusSettings.asJson)
  }
  final implicit val ListIpRoutesResultEncoder: io.circe.Encoder[avias.directory.models.ListIpRoutesResult] = io.circe.Encoder.instance { o => 
    Json.obj("IpRoutesInfo" -> o.ipRoutesInfo.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddIpRoutesRequestEncoder: io.circe.Encoder[avias.directory.models.AddIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "IpRoutes" -> o.ipRoutes.asJson, "UpdateSecurityGroupForDirectoryControllers" -> o.updateSecurityGroupForDirectoryControllers.asJson)
  }
  final implicit val CreateMicrosoftADResultEncoder: io.circe.Encoder[avias.directory.models.CreateMicrosoftADResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val IpRouteInfoEncoder: io.circe.Encoder[avias.directory.models.IpRouteInfo] = io.circe.Encoder.instance { o => 
    Json.obj("IpRouteStatusMsg" -> o.ipRouteStatusMsg.asJson, "AddedDateTime" -> o.addedDateTime.asJson, "Description" -> o.description.asJson, "IpRouteStatusReason" -> o.ipRouteStatusReason.asJson, "CidrIp" -> o.cidrIp.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val StartSchemaExtensionResultEncoder: io.circe.Encoder[avias.directory.models.StartSchemaExtensionResult] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaExtensionId" -> o.schemaExtensionId.asJson)
  }
  final implicit val TagLimitExceededExceptionEncoder: io.circe.Encoder[avias.directory.models.TagLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val IpRouteEncoder: io.circe.Encoder[avias.directory.models.IpRoute] = io.circe.Encoder.instance { o => 
    Json.obj("CidrIp" -> o.cidrIp.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.directory.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CancelSchemaExtensionRequestEncoder: io.circe.Encoder[avias.directory.models.CancelSchemaExtensionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "SchemaExtensionId" -> o.schemaExtensionId.asJson)
  }
  final implicit val DisableSsoRequestEncoder: io.circe.Encoder[avias.directory.models.DisableSsoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "UserName" -> o.userName.asJson, "Password" -> o.password.asJson)
  }
  final implicit val IpRouteLimitExceededExceptionEncoder: io.circe.Encoder[avias.directory.models.IpRouteLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val RestoreFromSnapshotRequestEncoder: io.circe.Encoder[avias.directory.models.RestoreFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DeleteDirectoryRequestEncoder: io.circe.Encoder[avias.directory.models.DeleteDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.directory.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val EnableRadiusResultEncoder: io.circe.Encoder[avias.directory.models.EnableRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableSsoRequestEncoder: io.circe.Encoder[avias.directory.models.EnableSsoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "UserName" -> o.userName.asJson, "Password" -> o.password.asJson)
  }
  final implicit val RemoveTagsFromResourceRequestEncoder: io.circe.Encoder[avias.directory.models.RemoveTagsFromResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val DirectoryLimitExceededExceptionDecoder: io.circe.Decoder[avias.directory.models.DirectoryLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.DirectoryLimitExceededException.apply _)
  }
  final implicit val SchemaExtensionInfoDecoder: io.circe.Decoder[avias.directory.models.SchemaExtensionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("SchemaExtensionStatusReason"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.lang.String]]("SchemaExtensionStatus"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SchemaExtensionId"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.SchemaExtensionInfo.apply _)
  }
  final implicit val RegisterEventTopicResultDecoder: io.circe.Decoder[avias.directory.models.RegisterEventTopicResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.RegisterEventTopicResult)
  final implicit val DescribeDirectoriesResultDecoder: io.circe.Decoder[avias.directory.models.DescribeDirectoriesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.DirectoryDescription]]]("DirectoryDescriptions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.DescribeDirectoriesResult.apply _)
  }
  final implicit val CreateSnapshotResultDecoder: io.circe.Decoder[avias.directory.models.CreateSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SnapshotId").map(avias.directory.models.CreateSnapshotResult.apply _)
  }
  final implicit val RemoveIpRoutesResultDecoder: io.circe.Decoder[avias.directory.models.RemoveIpRoutesResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.RemoveIpRoutesResult)
  final implicit val CreateTrustRequestDecoder: io.circe.Decoder[avias.directory.models.CreateTrustRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrustDirection"), o.get[java.lang.String]("RemoteDomainName"), o.get[java.lang.String]("TrustPassword"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("TrustType"), o.get[scala.Option[scala.List[java.lang.String]]]("ConditionalForwarderIpAddrs")).mapN(avias.directory.models.CreateTrustRequest.apply _)
  }
  final implicit val DescribeConditionalForwardersRequestDecoder: io.circe.Decoder[avias.directory.models.DescribeConditionalForwardersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoteDomainNames")).mapN(avias.directory.models.DescribeConditionalForwardersRequest.apply _)
  }
  final implicit val EnableRadiusRequestDecoder: io.circe.Decoder[avias.directory.models.EnableRadiusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[avias.directory.models.RadiusSettings]("RadiusSettings")).mapN(avias.directory.models.EnableRadiusRequest.apply _)
  }
  final implicit val CreateDirectoryRequestDecoder: io.circe.Decoder[avias.directory.models.CreateDirectoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("Size"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[avias.directory.models.DirectoryVpcSettings]]("VpcSettings")).mapN(avias.directory.models.CreateDirectoryRequest.apply _)
  }
  final implicit val ClientExceptionDecoder: io.circe.Decoder[avias.directory.models.ClientException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.ClientException.apply _)
  }
  final implicit val CreateAliasRequestDecoder: io.circe.Decoder[avias.directory.models.CreateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("Alias")).mapN(avias.directory.models.CreateAliasRequest.apply _)
  }
  final implicit val AddIpRoutesResultDecoder: io.circe.Decoder[avias.directory.models.AddIpRoutesResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.AddIpRoutesResult)
  final implicit val StartSchemaExtensionRequestDecoder: io.circe.Decoder[avias.directory.models.StartSchemaExtensionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Boolean]("CreateSnapshotBeforeSchemaExtension"), o.get[java.lang.String]("LdifContent"), o.get[java.lang.String]("Description")).mapN(avias.directory.models.StartSchemaExtensionRequest.apply _)
  }
  final implicit val EventTopicDecoder: io.circe.Decoder[avias.directory.models.EventTopic] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedDateTime"), o.get[scala.Option[java.lang.String]]("TopicArn"), o.get[scala.Option[java.lang.String]]("TopicName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.EventTopic.apply _)
  }
  final implicit val RegisterEventTopicRequestDecoder: io.circe.Decoder[avias.directory.models.RegisterEventTopicRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("TopicName")).mapN(avias.directory.models.RegisterEventTopicRequest.apply _)
  }
  final implicit val EnableSsoResultDecoder: io.circe.Decoder[avias.directory.models.EnableSsoResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.EnableSsoResult)
  final implicit val AuthenticationFailedExceptionDecoder: io.circe.Decoder[avias.directory.models.AuthenticationFailedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.AuthenticationFailedException.apply _)
  }
  final implicit val DeregisterEventTopicResultDecoder: io.circe.Decoder[avias.directory.models.DeregisterEventTopicResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.DeregisterEventTopicResult)
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[avias.directory.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.InvalidNextTokenException.apply _)
  }
  final implicit val DescribeDomainControllersRequestDecoder: io.circe.Decoder[avias.directory.models.DescribeDomainControllersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("DomainControllerIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.DescribeDomainControllersRequest.apply _)
  }
  final implicit val DescribeConditionalForwardersResultDecoder: io.circe.Decoder[avias.directory.models.DescribeConditionalForwardersResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directory.models.ConditionalForwarder]]]("ConditionalForwarders").map(avias.directory.models.DescribeConditionalForwardersResult.apply _)
  }
  final implicit val DescribeTrustsResultDecoder: io.circe.Decoder[avias.directory.models.DescribeTrustsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.Trust]]]("Trusts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.DescribeTrustsResult.apply _)
  }
  final implicit val ConditionalForwarderDecoder: io.circe.Decoder[avias.directory.models.ConditionalForwarder] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RemoteDomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddrs"), o.get[scala.Option[java.lang.String]]("ReplicationScope")).mapN(avias.directory.models.ConditionalForwarder.apply _)
  }
  final implicit val UpdateRadiusResultDecoder: io.circe.Decoder[avias.directory.models.UpdateRadiusResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.UpdateRadiusResult)
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[avias.directory.models.UnsupportedOperationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.UnsupportedOperationException.apply _)
  }
  final implicit val ConnectDirectoryResultDecoder: io.circe.Decoder[avias.directory.models.ConnectDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(avias.directory.models.ConnectDirectoryResult.apply _)
  }
  final implicit val CancelSchemaExtensionResultDecoder: io.circe.Decoder[avias.directory.models.CancelSchemaExtensionResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.CancelSchemaExtensionResult)
  final implicit val DeleteDirectoryResultDecoder: io.circe.Decoder[avias.directory.models.DeleteDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(avias.directory.models.DeleteDirectoryResult.apply _)
  }
  final implicit val CreateConditionalForwarderRequestDecoder: io.circe.Decoder[avias.directory.models.CreateConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName"), o.get[scala.List[java.lang.String]]("DnsIpAddrs")).mapN(avias.directory.models.CreateConditionalForwarderRequest.apply _)
  }
  final implicit val DeleteTrustRequestDecoder: io.circe.Decoder[avias.directory.models.DeleteTrustRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrustId"), o.get[scala.Option[scala.Boolean]]("DeleteAssociatedConditionalForwarder")).mapN(avias.directory.models.DeleteTrustRequest.apply _)
  }
  final implicit val DirectoryLimitsDecoder: io.circe.Decoder[avias.directory.models.DirectoryLimits] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("CloudOnlyDirectoriesLimit"), o.get[scala.Option[scala.Int]]("CloudOnlyMicrosoftADCurrentCount"), o.get[scala.Option[scala.Int]]("ConnectedDirectoriesCurrentCount"), o.get[scala.Option[scala.Int]]("CloudOnlyDirectoriesCurrentCount"), o.get[scala.Option[scala.Int]]("CloudOnlyMicrosoftADLimit"), o.get[scala.Option[scala.Int]]("ConnectedDirectoriesLimit"), o.get[scala.Option[scala.Boolean]]("CloudOnlyDirectoriesLimitReached"), o.get[scala.Option[scala.Boolean]]("CloudOnlyMicrosoftADLimitReached"), o.get[scala.Option[scala.Boolean]]("ConnectedDirectoriesLimitReached")).mapN(avias.directory.models.DirectoryLimits.apply _)
  }
  final implicit val DeleteSnapshotResultDecoder: io.circe.Decoder[avias.directory.models.DeleteSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SnapshotId").map(avias.directory.models.DeleteSnapshotResult.apply _)
  }
  final implicit val DescribeDomainControllersResultDecoder: io.circe.Decoder[avias.directory.models.DescribeDomainControllersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.DomainController]]]("DomainControllers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.DescribeDomainControllersResult.apply _)
  }
  final implicit val DisableRadiusRequestDecoder: io.circe.Decoder[avias.directory.models.DisableRadiusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(avias.directory.models.DisableRadiusRequest.apply _)
  }
  final implicit val AttributeDecoder: io.circe.Decoder[avias.directory.models.Attribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.directory.models.Attribute.apply _)
  }
  final implicit val InsufficientPermissionsExceptionDecoder: io.circe.Decoder[avias.directory.models.InsufficientPermissionsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.InsufficientPermissionsException.apply _)
  }
  final implicit val RadiusSettingsDecoder: io.circe.Decoder[avias.directory.models.RadiusSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AuthenticationProtocol"), o.get[scala.Option[scala.Boolean]]("UseSameUsername"), o.get[scala.Option[scala.Int]]("RadiusTimeout"), o.get[scala.Option[java.lang.String]]("DisplayLabel"), o.get[scala.Option[java.lang.String]]("SharedSecret"), o.get[scala.Option[scala.List[java.lang.String]]]("RadiusServers"), o.get[scala.Option[scala.Int]]("RadiusPort"), o.get[scala.Option[scala.Int]]("RadiusRetries")).mapN(avias.directory.models.RadiusSettings.apply _)
  }
  final implicit val SnapshotLimitExceededExceptionDecoder: io.circe.Decoder[avias.directory.models.SnapshotLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.SnapshotLimitExceededException.apply _)
  }
  final implicit val DomainControllerDecoder: io.circe.Decoder[avias.directory.models.DomainController] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.time.Instant]]("LaunchTime"), o.get[scala.Option[java.time.Instant]]("StatusLastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("DomainControllerId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DnsIpAddr"), o.get[scala.Option[java.lang.String]]("StatusReason"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.DomainController.apply _)
  }
  final implicit val CreateComputerRequestDecoder: io.circe.Decoder[avias.directory.models.CreateComputerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Password"), o.get[java.lang.String]("ComputerName"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[avias.directory.models.Attribute]]]("ComputerAttributes"), o.get[scala.Option[java.lang.String]]("OrganizationalUnitDistinguishedName")).mapN(avias.directory.models.CreateComputerRequest.apply _)
  }
  final implicit val CreateTrustResultDecoder: io.circe.Decoder[avias.directory.models.CreateTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(avias.directory.models.CreateTrustResult.apply _)
  }
  final implicit val DomainControllerLimitExceededExceptionDecoder: io.circe.Decoder[avias.directory.models.DomainControllerLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.DomainControllerLimitExceededException.apply _)
  }
  final implicit val UpdateConditionalForwarderResultDecoder: io.circe.Decoder[avias.directory.models.UpdateConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.UpdateConditionalForwarderResult)
  final implicit val DirectoryVpcSettingsDescriptionDecoder: io.circe.Decoder[avias.directory.models.DirectoryVpcSettingsDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("SecurityGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(avias.directory.models.DirectoryVpcSettingsDescription.apply _)
  }
  final implicit val VerifyTrustRequestDecoder: io.circe.Decoder[avias.directory.models.VerifyTrustRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TrustId").map(avias.directory.models.VerifyTrustRequest.apply _)
  }
  final implicit val DeleteTrustResultDecoder: io.circe.Decoder[avias.directory.models.DeleteTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(avias.directory.models.DeleteTrustResult.apply _)
  }
  final implicit val AddTagsToResourceResultDecoder: io.circe.Decoder[avias.directory.models.AddTagsToResourceResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.AddTagsToResourceResult)
  final implicit val DescribeEventTopicsResultDecoder: io.circe.Decoder[avias.directory.models.DescribeEventTopicsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.directory.models.EventTopic]]]("EventTopics").map(avias.directory.models.DescribeEventTopicsResult.apply _)
  }
  final implicit val RemoveTagsFromResourceResultDecoder: io.circe.Decoder[avias.directory.models.RemoveTagsFromResourceResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.RemoveTagsFromResourceResult)
  final implicit val DescribeDirectoriesRequestDecoder: io.circe.Decoder[avias.directory.models.DescribeDirectoriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DirectoryIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.DescribeDirectoriesRequest.apply _)
  }
  final implicit val DisableSsoResultDecoder: io.circe.Decoder[avias.directory.models.DisableSsoResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.DisableSsoResult)
  final implicit val RemoveIpRoutesRequestDecoder: io.circe.Decoder[avias.directory.models.RemoveIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.List[java.lang.String]]("CidrIps")).mapN(avias.directory.models.RemoveIpRoutesRequest.apply _)
  }
  final implicit val GetSnapshotLimitsRequestDecoder: io.circe.Decoder[avias.directory.models.GetSnapshotLimitsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(avias.directory.models.GetSnapshotLimitsRequest.apply _)
  }
  final implicit val DescribeSnapshotsResultDecoder: io.circe.Decoder[avias.directory.models.DescribeSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.Snapshot]]]("Snapshots"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.DescribeSnapshotsResult.apply _)
  }
  final implicit val GetSnapshotLimitsResultDecoder: io.circe.Decoder[avias.directory.models.GetSnapshotLimitsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directory.models.SnapshotLimits]]("SnapshotLimits").map(avias.directory.models.GetSnapshotLimitsResult.apply _)
  }
  final implicit val DeleteSnapshotRequestDecoder: io.circe.Decoder[avias.directory.models.DeleteSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SnapshotId").map(avias.directory.models.DeleteSnapshotRequest.apply _)
  }
  final implicit val CreateAliasResultDecoder: io.circe.Decoder[avias.directory.models.CreateAliasResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[java.lang.String]]("Alias")).mapN(avias.directory.models.CreateAliasResult.apply _)
  }
  final implicit val SnapshotDecoder: io.circe.Decoder[avias.directory.models.Snapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.Snapshot.apply _)
  }
  final implicit val AddTagsToResourceRequestDecoder: io.circe.Decoder[avias.directory.models.AddTagsToResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[avias.directory.models.Tag]]("Tags")).mapN(avias.directory.models.AddTagsToResourceRequest.apply _)
  }
  final implicit val GetDirectoryLimitsResultDecoder: io.circe.Decoder[avias.directory.models.GetDirectoryLimitsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directory.models.DirectoryLimits]]("DirectoryLimits").map(avias.directory.models.GetDirectoryLimitsResult.apply _)
  }
  final implicit val EntityDoesNotExistExceptionDecoder: io.circe.Decoder[avias.directory.models.EntityDoesNotExistException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.EntityDoesNotExistException.apply _)
  }
  final implicit val ListIpRoutesRequestDecoder: io.circe.Decoder[avias.directory.models.ListIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.ListIpRoutesRequest.apply _)
  }
  final implicit val ListSchemaExtensionsResultDecoder: io.circe.Decoder[avias.directory.models.ListSchemaExtensionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.SchemaExtensionInfo]]]("SchemaExtensionsInfo"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.ListSchemaExtensionsResult.apply _)
  }
  final implicit val CreateDirectoryResultDecoder: io.circe.Decoder[avias.directory.models.CreateDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(avias.directory.models.CreateDirectoryResult.apply _)
  }
  final implicit val GetDirectoryLimitsRequestDecoder: io.circe.Decoder[avias.directory.models.GetDirectoryLimitsRequest.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.GetDirectoryLimitsRequest)
  final implicit val EntityAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.directory.models.EntityAlreadyExistsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.EntityAlreadyExistsException.apply _)
  }
  final implicit val ListSchemaExtensionsRequestDecoder: io.circe.Decoder[avias.directory.models.ListSchemaExtensionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.ListSchemaExtensionsRequest.apply _)
  }
  final implicit val CreateSnapshotRequestDecoder: io.circe.Decoder[avias.directory.models.CreateSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.directory.models.CreateSnapshotRequest.apply _)
  }
  final implicit val ConnectDirectoryRequestDecoder: io.circe.Decoder[avias.directory.models.ConnectDirectoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("Size"), o.get[avias.directory.models.DirectoryConnectSettings]("ConnectSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.directory.models.ConnectDirectoryRequest.apply _)
  }
  final implicit val DeleteConditionalForwarderRequestDecoder: io.circe.Decoder[avias.directory.models.DeleteConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName")).mapN(avias.directory.models.DeleteConditionalForwarderRequest.apply _)
  }
  final implicit val TrustDecoder: io.circe.Decoder[avias.directory.models.Trust] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrustDirection"), o.get[scala.Option[java.time.Instant]]("CreatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustStateReason"), o.get[scala.Option[java.lang.String]]("RemoteDomainName"), o.get[scala.Option[java.time.Instant]]("LastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustId"), o.get[scala.Option[java.lang.String]]("TrustState"), o.get[scala.Option[java.time.Instant]]("StateLastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustType"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.Trust.apply _)
  }
  final implicit val CreateMicrosoftADRequestDecoder: io.circe.Decoder[avias.directory.models.CreateMicrosoftADRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[avias.directory.models.DirectoryVpcSettings]("VpcSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.directory.models.CreateMicrosoftADRequest.apply _)
  }
  final implicit val DescribeSnapshotsRequestDecoder: io.circe.Decoder[avias.directory.models.DescribeSnapshotsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("SnapshotIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.DescribeSnapshotsRequest.apply _)
  }
  final implicit val VerifyTrustResultDecoder: io.circe.Decoder[avias.directory.models.VerifyTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(avias.directory.models.VerifyTrustResult.apply _)
  }
  final implicit val CreateConditionalForwarderResultDecoder: io.circe.Decoder[avias.directory.models.CreateConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.CreateConditionalForwarderResult)
  final implicit val SnapshotLimitsDecoder: io.circe.Decoder[avias.directory.models.SnapshotLimits] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ManualSnapshotsLimit"), o.get[scala.Option[scala.Int]]("ManualSnapshotsCurrentCount"), o.get[scala.Option[scala.Boolean]]("ManualSnapshotsLimitReached")).mapN(avias.directory.models.SnapshotLimits.apply _)
  }
  final implicit val DisableRadiusResultDecoder: io.circe.Decoder[avias.directory.models.DisableRadiusResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.DisableRadiusResult)
  final implicit val CreateComputerResultDecoder: io.circe.Decoder[avias.directory.models.CreateComputerResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.directory.models.Computer]]("Computer").map(avias.directory.models.CreateComputerResult.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[avias.directory.models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.ListTagsForResourceRequest.apply _)
  }
  final implicit val DescribeTrustsRequestDecoder: io.circe.Decoder[avias.directory.models.DescribeTrustsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("TrustIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.directory.models.DescribeTrustsRequest.apply _)
  }
  final implicit val DescribeEventTopicsRequestDecoder: io.circe.Decoder[avias.directory.models.DescribeEventTopicsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("TopicNames")).mapN(avias.directory.models.DescribeEventTopicsRequest.apply _)
  }
  final implicit val DeleteConditionalForwarderResultDecoder: io.circe.Decoder[avias.directory.models.DeleteConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.DeleteConditionalForwarderResult)
  final implicit val DirectoryConnectSettingsDecoder: io.circe.Decoder[avias.directory.models.DirectoryConnectSettings] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VpcId"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.List[java.lang.String]]("CustomerDnsIps"), o.get[java.lang.String]("CustomerUserName")).mapN(avias.directory.models.DirectoryConnectSettings.apply _)
  }
  final implicit val UpdateNumberOfDomainControllersRequestDecoder: io.circe.Decoder[avias.directory.models.UpdateNumberOfDomainControllersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Int]("DesiredNumber")).mapN(avias.directory.models.UpdateNumberOfDomainControllersRequest.apply _)
  }
  final implicit val DirectoryConnectSettingsDescriptionDecoder: io.circe.Decoder[avias.directory.models.DirectoryConnectSettingsDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("CustomerUserName"), o.get[scala.Option[scala.List[java.lang.String]]]("ConnectIps"), o.get[scala.Option[java.lang.String]]("SecurityGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(avias.directory.models.DirectoryConnectSettingsDescription.apply _)
  }
  final implicit val ListTagsForResourceResultDecoder: io.circe.Decoder[avias.directory.models.ListTagsForResourceResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.ListTagsForResourceResult.apply _)
  }
  final implicit val DirectoryUnavailableExceptionDecoder: io.circe.Decoder[avias.directory.models.DirectoryUnavailableException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.DirectoryUnavailableException.apply _)
  }
  final implicit val UpdateNumberOfDomainControllersResultDecoder: io.circe.Decoder[avias.directory.models.UpdateNumberOfDomainControllersResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.UpdateNumberOfDomainControllersResult)
  final implicit val DeregisterEventTopicRequestDecoder: io.circe.Decoder[avias.directory.models.DeregisterEventTopicRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("TopicName")).mapN(avias.directory.models.DeregisterEventTopicRequest.apply _)
  }
  final implicit val RestoreFromSnapshotResultDecoder: io.circe.Decoder[avias.directory.models.RestoreFromSnapshotResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.RestoreFromSnapshotResult)
  final implicit val ComputerDecoder: io.circe.Decoder[avias.directory.models.Computer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComputerId"), o.get[scala.Option[java.lang.String]]("ComputerName"), o.get[scala.Option[scala.List[avias.directory.models.Attribute]]]("ComputerAttributes")).mapN(avias.directory.models.Computer.apply _)
  }
  final implicit val DirectoryDescriptionDecoder: io.circe.Decoder[avias.directory.models.DirectoryDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Alias"), o.get[scala.Option[java.lang.String]]("StageReason"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Boolean]]("SsoEnabled"), o.get[scala.Option[java.time.Instant]]("LaunchTime"), o.get[scala.Option[java.time.Instant]]("StageLastUpdatedDateTime"), o.get[scala.Option[avias.directory.models.RadiusSettings]]("RadiusSettings"), o.get[scala.Option[java.lang.String]]("Stage"), o.get[scala.Option[avias.directory.models.DirectoryVpcSettingsDescription]]("VpcSettings"), o.get[scala.Option[java.lang.String]]("RadiusStatus"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Size"), o.get[scala.Option[avias.directory.models.DirectoryConnectSettingsDescription]]("ConnectSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("DesiredNumberOfDomainControllers"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddrs"), o.get[scala.Option[java.lang.String]]("AccessUrl"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.DirectoryDescription.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[avias.directory.models.ServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.ServiceException.apply _)
  }
  final implicit val UpdateConditionalForwarderRequestDecoder: io.circe.Decoder[avias.directory.models.UpdateConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName"), o.get[scala.List[java.lang.String]]("DnsIpAddrs")).mapN(avias.directory.models.UpdateConditionalForwarderRequest.apply _)
  }
  final implicit val DirectoryVpcSettingsDecoder: io.circe.Decoder[avias.directory.models.DirectoryVpcSettings] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VpcId"), o.get[scala.List[java.lang.String]]("SubnetIds")).mapN(avias.directory.models.DirectoryVpcSettings.apply _)
  }
  final implicit val UpdateRadiusRequestDecoder: io.circe.Decoder[avias.directory.models.UpdateRadiusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[avias.directory.models.RadiusSettings]("RadiusSettings")).mapN(avias.directory.models.UpdateRadiusRequest.apply _)
  }
  final implicit val ListIpRoutesResultDecoder: io.circe.Decoder[avias.directory.models.ListIpRoutesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.directory.models.IpRouteInfo]]]("IpRoutesInfo"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.directory.models.ListIpRoutesResult.apply _)
  }
  final implicit val AddIpRoutesRequestDecoder: io.circe.Decoder[avias.directory.models.AddIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.List[avias.directory.models.IpRoute]]("IpRoutes"), o.get[scala.Option[scala.Boolean]]("UpdateSecurityGroupForDirectoryControllers")).mapN(avias.directory.models.AddIpRoutesRequest.apply _)
  }
  final implicit val CreateMicrosoftADResultDecoder: io.circe.Decoder[avias.directory.models.CreateMicrosoftADResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(avias.directory.models.CreateMicrosoftADResult.apply _)
  }
  final implicit val IpRouteInfoDecoder: io.circe.Decoder[avias.directory.models.IpRouteInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IpRouteStatusMsg"), o.get[scala.Option[java.time.Instant]]("AddedDateTime"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("IpRouteStatusReason"), o.get[scala.Option[java.lang.String]]("CidrIp"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(avias.directory.models.IpRouteInfo.apply _)
  }
  final implicit val StartSchemaExtensionResultDecoder: io.circe.Decoder[avias.directory.models.StartSchemaExtensionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SchemaExtensionId").map(avias.directory.models.StartSchemaExtensionResult.apply _)
  }
  final implicit val TagLimitExceededExceptionDecoder: io.circe.Decoder[avias.directory.models.TagLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.TagLimitExceededException.apply _)
  }
  final implicit val IpRouteDecoder: io.circe.Decoder[avias.directory.models.IpRoute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CidrIp"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.directory.models.IpRoute.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.directory.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.directory.models.Tag.apply _)
  }
  final implicit val CancelSchemaExtensionRequestDecoder: io.circe.Decoder[avias.directory.models.CancelSchemaExtensionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("SchemaExtensionId")).mapN(avias.directory.models.CancelSchemaExtensionRequest.apply _)
  }
  final implicit val DisableSsoRequestDecoder: io.circe.Decoder[avias.directory.models.DisableSsoRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Password")).mapN(avias.directory.models.DisableSsoRequest.apply _)
  }
  final implicit val IpRouteLimitExceededExceptionDecoder: io.circe.Decoder[avias.directory.models.IpRouteLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.IpRouteLimitExceededException.apply _)
  }
  final implicit val RestoreFromSnapshotRequestDecoder: io.circe.Decoder[avias.directory.models.RestoreFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SnapshotId").map(avias.directory.models.RestoreFromSnapshotRequest.apply _)
  }
  final implicit val DeleteDirectoryRequestDecoder: io.circe.Decoder[avias.directory.models.DeleteDirectoryRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(avias.directory.models.DeleteDirectoryRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.directory.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(avias.directory.models.InvalidParameterException.apply _)
  }
  final implicit val EnableRadiusResultDecoder: io.circe.Decoder[avias.directory.models.EnableRadiusResult.type] = io.circe.Decoder.decodeUnit.as(avias.directory.models.EnableRadiusResult)
  final implicit val EnableSsoRequestDecoder: io.circe.Decoder[avias.directory.models.EnableSsoRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Password")).mapN(avias.directory.models.EnableSsoRequest.apply _)
  }
  final implicit val RemoveTagsFromResourceRequestDecoder: io.circe.Decoder[avias.directory.models.RemoveTagsFromResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.directory.models.RemoveTagsFromResourceRequest.apply _)
  }
}