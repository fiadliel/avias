package org.lyranthe.araethura.directory
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DirectoryLimitExceededExceptionEncoder: io.circe.Encoder[models.DirectoryLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val SchemaExtensionInfoEncoder: io.circe.Encoder[models.SchemaExtensionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("EndDateTime" -> o.endDateTime.asJson, "SchemaExtensionStatusReason" -> o.schemaExtensionStatusReason.asJson, "StartDateTime" -> o.startDateTime.asJson, "SchemaExtensionStatus" -> o.schemaExtensionStatus.asJson, "Description" -> o.description.asJson, "SchemaExtensionId" -> o.schemaExtensionId.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val RegisterEventTopicResultEncoder: io.circe.Encoder[models.RegisterEventTopicResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDirectoriesResultEncoder: io.circe.Encoder[models.DescribeDirectoriesResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryDescriptions" -> o.directoryDescriptions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateSnapshotResultEncoder: io.circe.Encoder[models.CreateSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val RemoveIpRoutesResultEncoder: io.circe.Encoder[models.RemoveIpRoutesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateTrustRequestEncoder: io.circe.Encoder[models.CreateTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustDirection" -> o.trustDirection.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "TrustPassword" -> o.trustPassword.asJson, "DirectoryId" -> o.directoryId.asJson, "TrustType" -> o.trustType.asJson, "ConditionalForwarderIpAddrs" -> o.conditionalForwarderIpAddrs.asJson)
  }
  final implicit val DescribeConditionalForwardersRequestEncoder: io.circe.Encoder[models.DescribeConditionalForwardersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainNames" -> o.remoteDomainNames.asJson)
  }
  final implicit val EnableRadiusRequestEncoder: io.circe.Encoder[models.EnableRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RadiusSettings" -> o.radiusSettings.asJson)
  }
  final implicit val CreateDirectoryRequestEncoder: io.circe.Encoder[models.CreateDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "Size" -> o.size.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson, "VpcSettings" -> o.vpcSettings.asJson)
  }
  final implicit val ClientExceptionEncoder: io.circe.Encoder[models.ClientException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val CreateAliasRequestEncoder: io.circe.Encoder[models.CreateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Alias" -> o.alias.asJson)
  }
  final implicit val AddIpRoutesResultEncoder: io.circe.Encoder[models.AddIpRoutesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartSchemaExtensionRequestEncoder: io.circe.Encoder[models.StartSchemaExtensionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "CreateSnapshotBeforeSchemaExtension" -> o.createSnapshotBeforeSchemaExtension.asJson, "LdifContent" -> o.ldifContent.asJson, "Description" -> o.description.asJson)
  }
  final implicit val EventTopicEncoder: io.circe.Encoder[models.EventTopic] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedDateTime" -> o.createdDateTime.asJson, "TopicArn" -> o.topicArn.asJson, "TopicName" -> o.topicName.asJson, "Status" -> o.status.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val RegisterEventTopicRequestEncoder: io.circe.Encoder[models.RegisterEventTopicRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicName" -> o.topicName.asJson)
  }
  final implicit val EnableSsoResultEncoder: io.circe.Encoder[models.EnableSsoResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AuthenticationFailedExceptionEncoder: io.circe.Encoder[models.AuthenticationFailedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DeregisterEventTopicResultEncoder: io.circe.Encoder[models.DeregisterEventTopicResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DescribeDomainControllersRequestEncoder: io.circe.Encoder[models.DescribeDomainControllersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "DomainControllerIds" -> o.domainControllerIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeConditionalForwardersResultEncoder: io.circe.Encoder[models.DescribeConditionalForwardersResult] = io.circe.Encoder.instance { o => 
    Json.obj("ConditionalForwarders" -> o.conditionalForwarders.asJson)
  }
  final implicit val DescribeTrustsResultEncoder: io.circe.Encoder[models.DescribeTrustsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Trusts" -> o.trusts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConditionalForwarderEncoder: io.circe.Encoder[models.ConditionalForwarder] = io.circe.Encoder.instance { o => 
    Json.obj("RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson, "ReplicationScope" -> o.replicationScope.asJson)
  }
  final implicit val UpdateRadiusResultEncoder: io.circe.Encoder[models.UpdateRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[models.UnsupportedOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ConnectDirectoryResultEncoder: io.circe.Encoder[models.ConnectDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CancelSchemaExtensionResultEncoder: io.circe.Encoder[models.CancelSchemaExtensionResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDirectoryResultEncoder: io.circe.Encoder[models.DeleteDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateConditionalForwarderRequestEncoder: io.circe.Encoder[models.CreateConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson)
  }
  final implicit val DeleteTrustRequestEncoder: io.circe.Encoder[models.DeleteTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson, "DeleteAssociatedConditionalForwarder" -> o.deleteAssociatedConditionalForwarder.asJson)
  }
  final implicit val DirectoryLimitsEncoder: io.circe.Encoder[models.DirectoryLimits] = io.circe.Encoder.instance { o => 
    Json.obj("CloudOnlyDirectoriesLimit" -> o.cloudOnlyDirectoriesLimit.asJson, "CloudOnlyMicrosoftADCurrentCount" -> o.cloudOnlyMicrosoftADCurrentCount.asJson, "ConnectedDirectoriesCurrentCount" -> o.connectedDirectoriesCurrentCount.asJson, "CloudOnlyDirectoriesCurrentCount" -> o.cloudOnlyDirectoriesCurrentCount.asJson, "CloudOnlyMicrosoftADLimit" -> o.cloudOnlyMicrosoftADLimit.asJson, "ConnectedDirectoriesLimit" -> o.connectedDirectoriesLimit.asJson, "CloudOnlyDirectoriesLimitReached" -> o.cloudOnlyDirectoriesLimitReached.asJson, "CloudOnlyMicrosoftADLimitReached" -> o.cloudOnlyMicrosoftADLimitReached.asJson, "ConnectedDirectoriesLimitReached" -> o.connectedDirectoriesLimitReached.asJson)
  }
  final implicit val DeleteSnapshotResultEncoder: io.circe.Encoder[models.DeleteSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeDomainControllersResultEncoder: io.circe.Encoder[models.DescribeDomainControllersResult] = io.circe.Encoder.instance { o => 
    Json.obj("DomainControllers" -> o.domainControllers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DisableRadiusRequestEncoder: io.circe.Encoder[models.DisableRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val AttributeEncoder: io.circe.Encoder[models.Attribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InsufficientPermissionsExceptionEncoder: io.circe.Encoder[models.InsufficientPermissionsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val RadiusSettingsEncoder: io.circe.Encoder[models.RadiusSettings] = io.circe.Encoder.instance { o => 
    Json.obj("AuthenticationProtocol" -> o.authenticationProtocol.asJson, "UseSameUsername" -> o.useSameUsername.asJson, "RadiusTimeout" -> o.radiusTimeout.asJson, "DisplayLabel" -> o.displayLabel.asJson, "SharedSecret" -> o.sharedSecret.asJson, "RadiusServers" -> o.radiusServers.asJson, "RadiusPort" -> o.radiusPort.asJson, "RadiusRetries" -> o.radiusRetries.asJson)
  }
  final implicit val SnapshotLimitExceededExceptionEncoder: io.circe.Encoder[models.SnapshotLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DomainControllerEncoder: io.circe.Encoder[models.DomainController] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "LaunchTime" -> o.launchTime.asJson, "StatusLastUpdatedDateTime" -> o.statusLastUpdatedDateTime.asJson, "SubnetId" -> o.subnetId.asJson, "DomainControllerId" -> o.domainControllerId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "Status" -> o.status.asJson, "DnsIpAddr" -> o.dnsIpAddr.asJson, "StatusReason" -> o.statusReason.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateComputerRequestEncoder: io.circe.Encoder[models.CreateComputerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Password" -> o.password.asJson, "ComputerName" -> o.computerName.asJson, "DirectoryId" -> o.directoryId.asJson, "ComputerAttributes" -> o.computerAttributes.asJson, "OrganizationalUnitDistinguishedName" -> o.organizationalUnitDistinguishedName.asJson)
  }
  final implicit val CreateTrustResultEncoder: io.circe.Encoder[models.CreateTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val DomainControllerLimitExceededExceptionEncoder: io.circe.Encoder[models.DomainControllerLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateConditionalForwarderResultEncoder: io.circe.Encoder[models.UpdateConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DirectoryVpcSettingsDescriptionEncoder: io.circe.Encoder[models.DirectoryVpcSettingsDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "SecurityGroupId" -> o.securityGroupId.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val VerifyTrustRequestEncoder: io.circe.Encoder[models.VerifyTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val DeleteTrustResultEncoder: io.circe.Encoder[models.DeleteTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val AddTagsToResourceResultEncoder: io.circe.Encoder[models.AddTagsToResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventTopicsResultEncoder: io.circe.Encoder[models.DescribeEventTopicsResult] = io.circe.Encoder.instance { o => 
    Json.obj("EventTopics" -> o.eventTopics.asJson)
  }
  final implicit val RemoveTagsFromResourceResultEncoder: io.circe.Encoder[models.RemoveTagsFromResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDirectoriesRequestEncoder: io.circe.Encoder[models.DescribeDirectoriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryIds" -> o.directoryIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DisableSsoResultEncoder: io.circe.Encoder[models.DisableSsoResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveIpRoutesRequestEncoder: io.circe.Encoder[models.RemoveIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "CidrIps" -> o.cidrIps.asJson)
  }
  final implicit val GetSnapshotLimitsRequestEncoder: io.circe.Encoder[models.GetSnapshotLimitsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val DescribeSnapshotsResultEncoder: io.circe.Encoder[models.DescribeSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Snapshots" -> o.snapshots.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetSnapshotLimitsResultEncoder: io.circe.Encoder[models.GetSnapshotLimitsResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotLimits" -> o.snapshotLimits.asJson)
  }
  final implicit val DeleteSnapshotRequestEncoder: io.circe.Encoder[models.DeleteSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val CreateAliasResultEncoder: io.circe.Encoder[models.CreateAliasResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Alias" -> o.alias.asJson)
  }
  final implicit val SnapshotEncoder: io.circe.Encoder[models.Snapshot] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "Name" -> o.name.asJson, "StartTime" -> o.startTime.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val AddTagsToResourceRequestEncoder: io.circe.Encoder[models.AddTagsToResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val GetDirectoryLimitsResultEncoder: io.circe.Encoder[models.GetDirectoryLimitsResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryLimits" -> o.directoryLimits.asJson)
  }
  final implicit val EntityDoesNotExistExceptionEncoder: io.circe.Encoder[models.EntityDoesNotExistException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ListIpRoutesRequestEncoder: io.circe.Encoder[models.ListIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListSchemaExtensionsResultEncoder: io.circe.Encoder[models.ListSchemaExtensionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaExtensionsInfo" -> o.schemaExtensionsInfo.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDirectoryResultEncoder: io.circe.Encoder[models.CreateDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val GetDirectoryLimitsRequestEncoder: io.circe.Encoder[models.GetDirectoryLimitsRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EntityAlreadyExistsExceptionEncoder: io.circe.Encoder[models.EntityAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ListSchemaExtensionsRequestEncoder: io.circe.Encoder[models.ListSchemaExtensionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateSnapshotRequestEncoder: io.circe.Encoder[models.CreateSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val ConnectDirectoryRequestEncoder: io.circe.Encoder[models.ConnectDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "Size" -> o.size.asJson, "ConnectSettings" -> o.connectSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DeleteConditionalForwarderRequestEncoder: io.circe.Encoder[models.DeleteConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson)
  }
  final implicit val TrustEncoder: io.circe.Encoder[models.Trust] = io.circe.Encoder.instance { o => 
    Json.obj("TrustDirection" -> o.trustDirection.asJson, "CreatedDateTime" -> o.createdDateTime.asJson, "TrustStateReason" -> o.trustStateReason.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "LastUpdatedDateTime" -> o.lastUpdatedDateTime.asJson, "TrustId" -> o.trustId.asJson, "TrustState" -> o.trustState.asJson, "StateLastUpdatedDateTime" -> o.stateLastUpdatedDateTime.asJson, "TrustType" -> o.trustType.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateMicrosoftADRequestEncoder: io.circe.Encoder[models.CreateMicrosoftADRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "VpcSettings" -> o.vpcSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeSnapshotsRequestEncoder: io.circe.Encoder[models.DescribeSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "SnapshotIds" -> o.snapshotIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val VerifyTrustResultEncoder: io.circe.Encoder[models.VerifyTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val CreateConditionalForwarderResultEncoder: io.circe.Encoder[models.CreateConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SnapshotLimitsEncoder: io.circe.Encoder[models.SnapshotLimits] = io.circe.Encoder.instance { o => 
    Json.obj("ManualSnapshotsLimit" -> o.manualSnapshotsLimit.asJson, "ManualSnapshotsCurrentCount" -> o.manualSnapshotsCurrentCount.asJson, "ManualSnapshotsLimitReached" -> o.manualSnapshotsLimitReached.asJson)
  }
  final implicit val DisableRadiusResultEncoder: io.circe.Encoder[models.DisableRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateComputerResultEncoder: io.circe.Encoder[models.CreateComputerResult] = io.circe.Encoder.instance { o => 
    Json.obj("Computer" -> o.computer.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeTrustsRequestEncoder: io.circe.Encoder[models.DescribeTrustsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TrustIds" -> o.trustIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeEventTopicsRequestEncoder: io.circe.Encoder[models.DescribeEventTopicsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicNames" -> o.topicNames.asJson)
  }
  final implicit val DeleteConditionalForwarderResultEncoder: io.circe.Encoder[models.DeleteConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DirectoryConnectSettingsEncoder: io.circe.Encoder[models.DirectoryConnectSettings] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "CustomerDnsIps" -> o.customerDnsIps.asJson, "CustomerUserName" -> o.customerUserName.asJson)
  }
  final implicit val UpdateNumberOfDomainControllersRequestEncoder: io.circe.Encoder[models.UpdateNumberOfDomainControllersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "DesiredNumber" -> o.desiredNumber.asJson)
  }
  final implicit val DirectoryConnectSettingsDescriptionEncoder: io.circe.Encoder[models.DirectoryConnectSettingsDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "CustomerUserName" -> o.customerUserName.asJson, "ConnectIps" -> o.connectIps.asJson, "SecurityGroupId" -> o.securityGroupId.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val ListTagsForResourceResultEncoder: io.circe.Encoder[models.ListTagsForResourceResult] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DirectoryUnavailableExceptionEncoder: io.circe.Encoder[models.DirectoryUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateNumberOfDomainControllersResultEncoder: io.circe.Encoder[models.UpdateNumberOfDomainControllersResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeregisterEventTopicRequestEncoder: io.circe.Encoder[models.DeregisterEventTopicRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicName" -> o.topicName.asJson)
  }
  final implicit val RestoreFromSnapshotResultEncoder: io.circe.Encoder[models.RestoreFromSnapshotResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComputerEncoder: io.circe.Encoder[models.Computer] = io.circe.Encoder.instance { o => 
    Json.obj("ComputerId" -> o.computerId.asJson, "ComputerName" -> o.computerName.asJson, "ComputerAttributes" -> o.computerAttributes.asJson)
  }
  final implicit val DirectoryDescriptionEncoder: io.circe.Encoder[models.DirectoryDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson, "StageReason" -> o.stageReason.asJson, "Name" -> o.name.asJson, "SsoEnabled" -> o.ssoEnabled.asJson, "LaunchTime" -> o.launchTime.asJson, "StageLastUpdatedDateTime" -> o.stageLastUpdatedDateTime.asJson, "RadiusSettings" -> o.radiusSettings.asJson, "Stage" -> o.stage.asJson, "VpcSettings" -> o.vpcSettings.asJson, "RadiusStatus" -> o.radiusStatus.asJson, "Type" -> o.`type`.asJson, "Size" -> o.size.asJson, "ConnectSettings" -> o.connectSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson, "DesiredNumberOfDomainControllers" -> o.desiredNumberOfDomainControllers.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson, "AccessUrl" -> o.accessUrl.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateConditionalForwarderRequestEncoder: io.circe.Encoder[models.UpdateConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson)
  }
  final implicit val DirectoryVpcSettingsEncoder: io.circe.Encoder[models.DirectoryVpcSettings] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val UpdateRadiusRequestEncoder: io.circe.Encoder[models.UpdateRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RadiusSettings" -> o.radiusSettings.asJson)
  }
  final implicit val ListIpRoutesResultEncoder: io.circe.Encoder[models.ListIpRoutesResult] = io.circe.Encoder.instance { o => 
    Json.obj("IpRoutesInfo" -> o.ipRoutesInfo.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddIpRoutesRequestEncoder: io.circe.Encoder[models.AddIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "IpRoutes" -> o.ipRoutes.asJson, "UpdateSecurityGroupForDirectoryControllers" -> o.updateSecurityGroupForDirectoryControllers.asJson)
  }
  final implicit val CreateMicrosoftADResultEncoder: io.circe.Encoder[models.CreateMicrosoftADResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val IpRouteInfoEncoder: io.circe.Encoder[models.IpRouteInfo] = io.circe.Encoder.instance { o => 
    Json.obj("IpRouteStatusMsg" -> o.ipRouteStatusMsg.asJson, "AddedDateTime" -> o.addedDateTime.asJson, "Description" -> o.description.asJson, "IpRouteStatusReason" -> o.ipRouteStatusReason.asJson, "CidrIp" -> o.cidrIp.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val StartSchemaExtensionResultEncoder: io.circe.Encoder[models.StartSchemaExtensionResult] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaExtensionId" -> o.schemaExtensionId.asJson)
  }
  final implicit val TagLimitExceededExceptionEncoder: io.circe.Encoder[models.TagLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val IpRouteEncoder: io.circe.Encoder[models.IpRoute] = io.circe.Encoder.instance { o => 
    Json.obj("CidrIp" -> o.cidrIp.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CancelSchemaExtensionRequestEncoder: io.circe.Encoder[models.CancelSchemaExtensionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "SchemaExtensionId" -> o.schemaExtensionId.asJson)
  }
  final implicit val DisableSsoRequestEncoder: io.circe.Encoder[models.DisableSsoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "UserName" -> o.userName.asJson, "Password" -> o.password.asJson)
  }
  final implicit val IpRouteLimitExceededExceptionEncoder: io.circe.Encoder[models.IpRouteLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val RestoreFromSnapshotRequestEncoder: io.circe.Encoder[models.RestoreFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DeleteDirectoryRequestEncoder: io.circe.Encoder[models.DeleteDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val EnableRadiusResultEncoder: io.circe.Encoder[models.EnableRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableSsoRequestEncoder: io.circe.Encoder[models.EnableSsoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "UserName" -> o.userName.asJson, "Password" -> o.password.asJson)
  }
  final implicit val RemoveTagsFromResourceRequestEncoder: io.circe.Encoder[models.RemoveTagsFromResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val DirectoryLimitExceededExceptionDecoder: io.circe.Decoder[models.DirectoryLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.DirectoryLimitExceededException.apply _)
  }
  final implicit val SchemaExtensionInfoDecoder: io.circe.Decoder[models.SchemaExtensionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("SchemaExtensionStatusReason"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.lang.String]]("SchemaExtensionStatus"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SchemaExtensionId"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.SchemaExtensionInfo.apply _)
  }
  final implicit val RegisterEventTopicResultDecoder: io.circe.Decoder[models.RegisterEventTopicResult.type] = io.circe.Decoder.decodeUnit.as(models.RegisterEventTopicResult)
  final implicit val DescribeDirectoriesResultDecoder: io.circe.Decoder[models.DescribeDirectoriesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.DirectoryDescription]]]("DirectoryDescriptions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeDirectoriesResult.apply _)
  }
  final implicit val CreateSnapshotResultDecoder: io.circe.Decoder[models.CreateSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SnapshotId").map(models.CreateSnapshotResult.apply _)
  }
  final implicit val RemoveIpRoutesResultDecoder: io.circe.Decoder[models.RemoveIpRoutesResult.type] = io.circe.Decoder.decodeUnit.as(models.RemoveIpRoutesResult)
  final implicit val CreateTrustRequestDecoder: io.circe.Decoder[models.CreateTrustRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrustDirection"), o.get[java.lang.String]("RemoteDomainName"), o.get[java.lang.String]("TrustPassword"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("TrustType"), o.get[scala.Option[scala.List[java.lang.String]]]("ConditionalForwarderIpAddrs")).mapN(models.CreateTrustRequest.apply _)
  }
  final implicit val DescribeConditionalForwardersRequestDecoder: io.circe.Decoder[models.DescribeConditionalForwardersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoteDomainNames")).mapN(models.DescribeConditionalForwardersRequest.apply _)
  }
  final implicit val EnableRadiusRequestDecoder: io.circe.Decoder[models.EnableRadiusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[models.RadiusSettings]("RadiusSettings")).mapN(models.EnableRadiusRequest.apply _)
  }
  final implicit val CreateDirectoryRequestDecoder: io.circe.Decoder[models.CreateDirectoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("Size"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[models.DirectoryVpcSettings]]("VpcSettings")).mapN(models.CreateDirectoryRequest.apply _)
  }
  final implicit val ClientExceptionDecoder: io.circe.Decoder[models.ClientException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.ClientException.apply _)
  }
  final implicit val CreateAliasRequestDecoder: io.circe.Decoder[models.CreateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("Alias")).mapN(models.CreateAliasRequest.apply _)
  }
  final implicit val AddIpRoutesResultDecoder: io.circe.Decoder[models.AddIpRoutesResult.type] = io.circe.Decoder.decodeUnit.as(models.AddIpRoutesResult)
  final implicit val StartSchemaExtensionRequestDecoder: io.circe.Decoder[models.StartSchemaExtensionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Boolean]("CreateSnapshotBeforeSchemaExtension"), o.get[java.lang.String]("LdifContent"), o.get[java.lang.String]("Description")).mapN(models.StartSchemaExtensionRequest.apply _)
  }
  final implicit val EventTopicDecoder: io.circe.Decoder[models.EventTopic] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedDateTime"), o.get[scala.Option[java.lang.String]]("TopicArn"), o.get[scala.Option[java.lang.String]]("TopicName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.EventTopic.apply _)
  }
  final implicit val RegisterEventTopicRequestDecoder: io.circe.Decoder[models.RegisterEventTopicRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("TopicName")).mapN(models.RegisterEventTopicRequest.apply _)
  }
  final implicit val EnableSsoResultDecoder: io.circe.Decoder[models.EnableSsoResult.type] = io.circe.Decoder.decodeUnit.as(models.EnableSsoResult)
  final implicit val AuthenticationFailedExceptionDecoder: io.circe.Decoder[models.AuthenticationFailedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.AuthenticationFailedException.apply _)
  }
  final implicit val DeregisterEventTopicResultDecoder: io.circe.Decoder[models.DeregisterEventTopicResult.type] = io.circe.Decoder.decodeUnit.as(models.DeregisterEventTopicResult)
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.InvalidNextTokenException.apply _)
  }
  final implicit val DescribeDomainControllersRequestDecoder: io.circe.Decoder[models.DescribeDomainControllersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("DomainControllerIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeDomainControllersRequest.apply _)
  }
  final implicit val DescribeConditionalForwardersResultDecoder: io.circe.Decoder[models.DescribeConditionalForwardersResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ConditionalForwarder]]]("ConditionalForwarders").map(models.DescribeConditionalForwardersResult.apply _)
  }
  final implicit val DescribeTrustsResultDecoder: io.circe.Decoder[models.DescribeTrustsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Trust]]]("Trusts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeTrustsResult.apply _)
  }
  final implicit val ConditionalForwarderDecoder: io.circe.Decoder[models.ConditionalForwarder] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RemoteDomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddrs"), o.get[scala.Option[java.lang.String]]("ReplicationScope")).mapN(models.ConditionalForwarder.apply _)
  }
  final implicit val UpdateRadiusResultDecoder: io.circe.Decoder[models.UpdateRadiusResult.type] = io.circe.Decoder.decodeUnit.as(models.UpdateRadiusResult)
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[models.UnsupportedOperationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.UnsupportedOperationException.apply _)
  }
  final implicit val ConnectDirectoryResultDecoder: io.circe.Decoder[models.ConnectDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(models.ConnectDirectoryResult.apply _)
  }
  final implicit val CancelSchemaExtensionResultDecoder: io.circe.Decoder[models.CancelSchemaExtensionResult.type] = io.circe.Decoder.decodeUnit.as(models.CancelSchemaExtensionResult)
  final implicit val DeleteDirectoryResultDecoder: io.circe.Decoder[models.DeleteDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(models.DeleteDirectoryResult.apply _)
  }
  final implicit val CreateConditionalForwarderRequestDecoder: io.circe.Decoder[models.CreateConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName"), o.get[scala.List[java.lang.String]]("DnsIpAddrs")).mapN(models.CreateConditionalForwarderRequest.apply _)
  }
  final implicit val DeleteTrustRequestDecoder: io.circe.Decoder[models.DeleteTrustRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrustId"), o.get[scala.Option[scala.Boolean]]("DeleteAssociatedConditionalForwarder")).mapN(models.DeleteTrustRequest.apply _)
  }
  final implicit val DirectoryLimitsDecoder: io.circe.Decoder[models.DirectoryLimits] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("CloudOnlyDirectoriesLimit"), o.get[scala.Option[scala.Int]]("CloudOnlyMicrosoftADCurrentCount"), o.get[scala.Option[scala.Int]]("ConnectedDirectoriesCurrentCount"), o.get[scala.Option[scala.Int]]("CloudOnlyDirectoriesCurrentCount"), o.get[scala.Option[scala.Int]]("CloudOnlyMicrosoftADLimit"), o.get[scala.Option[scala.Int]]("ConnectedDirectoriesLimit"), o.get[scala.Option[scala.Boolean]]("CloudOnlyDirectoriesLimitReached"), o.get[scala.Option[scala.Boolean]]("CloudOnlyMicrosoftADLimitReached"), o.get[scala.Option[scala.Boolean]]("ConnectedDirectoriesLimitReached")).mapN(models.DirectoryLimits.apply _)
  }
  final implicit val DeleteSnapshotResultDecoder: io.circe.Decoder[models.DeleteSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SnapshotId").map(models.DeleteSnapshotResult.apply _)
  }
  final implicit val DescribeDomainControllersResultDecoder: io.circe.Decoder[models.DescribeDomainControllersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.DomainController]]]("DomainControllers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeDomainControllersResult.apply _)
  }
  final implicit val DisableRadiusRequestDecoder: io.circe.Decoder[models.DisableRadiusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(models.DisableRadiusRequest.apply _)
  }
  final implicit val AttributeDecoder: io.circe.Decoder[models.Attribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Attribute.apply _)
  }
  final implicit val InsufficientPermissionsExceptionDecoder: io.circe.Decoder[models.InsufficientPermissionsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.InsufficientPermissionsException.apply _)
  }
  final implicit val RadiusSettingsDecoder: io.circe.Decoder[models.RadiusSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AuthenticationProtocol"), o.get[scala.Option[scala.Boolean]]("UseSameUsername"), o.get[scala.Option[scala.Int]]("RadiusTimeout"), o.get[scala.Option[java.lang.String]]("DisplayLabel"), o.get[scala.Option[java.lang.String]]("SharedSecret"), o.get[scala.Option[scala.List[java.lang.String]]]("RadiusServers"), o.get[scala.Option[scala.Int]]("RadiusPort"), o.get[scala.Option[scala.Int]]("RadiusRetries")).mapN(models.RadiusSettings.apply _)
  }
  final implicit val SnapshotLimitExceededExceptionDecoder: io.circe.Decoder[models.SnapshotLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.SnapshotLimitExceededException.apply _)
  }
  final implicit val DomainControllerDecoder: io.circe.Decoder[models.DomainController] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.time.Instant]]("LaunchTime"), o.get[scala.Option[java.time.Instant]]("StatusLastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("DomainControllerId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DnsIpAddr"), o.get[scala.Option[java.lang.String]]("StatusReason"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.DomainController.apply _)
  }
  final implicit val CreateComputerRequestDecoder: io.circe.Decoder[models.CreateComputerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Password"), o.get[java.lang.String]("ComputerName"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[models.Attribute]]]("ComputerAttributes"), o.get[scala.Option[java.lang.String]]("OrganizationalUnitDistinguishedName")).mapN(models.CreateComputerRequest.apply _)
  }
  final implicit val CreateTrustResultDecoder: io.circe.Decoder[models.CreateTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(models.CreateTrustResult.apply _)
  }
  final implicit val DomainControllerLimitExceededExceptionDecoder: io.circe.Decoder[models.DomainControllerLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.DomainControllerLimitExceededException.apply _)
  }
  final implicit val UpdateConditionalForwarderResultDecoder: io.circe.Decoder[models.UpdateConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(models.UpdateConditionalForwarderResult)
  final implicit val DirectoryVpcSettingsDescriptionDecoder: io.circe.Decoder[models.DirectoryVpcSettingsDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("SecurityGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(models.DirectoryVpcSettingsDescription.apply _)
  }
  final implicit val VerifyTrustRequestDecoder: io.circe.Decoder[models.VerifyTrustRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TrustId").map(models.VerifyTrustRequest.apply _)
  }
  final implicit val DeleteTrustResultDecoder: io.circe.Decoder[models.DeleteTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(models.DeleteTrustResult.apply _)
  }
  final implicit val AddTagsToResourceResultDecoder: io.circe.Decoder[models.AddTagsToResourceResult.type] = io.circe.Decoder.decodeUnit.as(models.AddTagsToResourceResult)
  final implicit val DescribeEventTopicsResultDecoder: io.circe.Decoder[models.DescribeEventTopicsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.EventTopic]]]("EventTopics").map(models.DescribeEventTopicsResult.apply _)
  }
  final implicit val RemoveTagsFromResourceResultDecoder: io.circe.Decoder[models.RemoveTagsFromResourceResult.type] = io.circe.Decoder.decodeUnit.as(models.RemoveTagsFromResourceResult)
  final implicit val DescribeDirectoriesRequestDecoder: io.circe.Decoder[models.DescribeDirectoriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DirectoryIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeDirectoriesRequest.apply _)
  }
  final implicit val DisableSsoResultDecoder: io.circe.Decoder[models.DisableSsoResult.type] = io.circe.Decoder.decodeUnit.as(models.DisableSsoResult)
  final implicit val RemoveIpRoutesRequestDecoder: io.circe.Decoder[models.RemoveIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.List[java.lang.String]]("CidrIps")).mapN(models.RemoveIpRoutesRequest.apply _)
  }
  final implicit val GetSnapshotLimitsRequestDecoder: io.circe.Decoder[models.GetSnapshotLimitsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(models.GetSnapshotLimitsRequest.apply _)
  }
  final implicit val DescribeSnapshotsResultDecoder: io.circe.Decoder[models.DescribeSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Snapshot]]]("Snapshots"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeSnapshotsResult.apply _)
  }
  final implicit val GetSnapshotLimitsResultDecoder: io.circe.Decoder[models.GetSnapshotLimitsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.SnapshotLimits]]("SnapshotLimits").map(models.GetSnapshotLimitsResult.apply _)
  }
  final implicit val DeleteSnapshotRequestDecoder: io.circe.Decoder[models.DeleteSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SnapshotId").map(models.DeleteSnapshotRequest.apply _)
  }
  final implicit val CreateAliasResultDecoder: io.circe.Decoder[models.CreateAliasResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[java.lang.String]]("Alias")).mapN(models.CreateAliasResult.apply _)
  }
  final implicit val SnapshotDecoder: io.circe.Decoder[models.Snapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.Snapshot.apply _)
  }
  final implicit val AddTagsToResourceRequestDecoder: io.circe.Decoder[models.AddTagsToResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.AddTagsToResourceRequest.apply _)
  }
  final implicit val GetDirectoryLimitsResultDecoder: io.circe.Decoder[models.GetDirectoryLimitsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.DirectoryLimits]]("DirectoryLimits").map(models.GetDirectoryLimitsResult.apply _)
  }
  final implicit val EntityDoesNotExistExceptionDecoder: io.circe.Decoder[models.EntityDoesNotExistException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.EntityDoesNotExistException.apply _)
  }
  final implicit val ListIpRoutesRequestDecoder: io.circe.Decoder[models.ListIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListIpRoutesRequest.apply _)
  }
  final implicit val ListSchemaExtensionsResultDecoder: io.circe.Decoder[models.ListSchemaExtensionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.SchemaExtensionInfo]]]("SchemaExtensionsInfo"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListSchemaExtensionsResult.apply _)
  }
  final implicit val CreateDirectoryResultDecoder: io.circe.Decoder[models.CreateDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(models.CreateDirectoryResult.apply _)
  }
  final implicit val GetDirectoryLimitsRequestDecoder: io.circe.Decoder[models.GetDirectoryLimitsRequest.type] = io.circe.Decoder.decodeUnit.as(models.GetDirectoryLimitsRequest)
  final implicit val EntityAlreadyExistsExceptionDecoder: io.circe.Decoder[models.EntityAlreadyExistsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.EntityAlreadyExistsException.apply _)
  }
  final implicit val ListSchemaExtensionsRequestDecoder: io.circe.Decoder[models.ListSchemaExtensionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListSchemaExtensionsRequest.apply _)
  }
  final implicit val CreateSnapshotRequestDecoder: io.circe.Decoder[models.CreateSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("Name")).mapN(models.CreateSnapshotRequest.apply _)
  }
  final implicit val ConnectDirectoryRequestDecoder: io.circe.Decoder[models.ConnectDirectoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("Size"), o.get[models.DirectoryConnectSettings]("ConnectSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.ConnectDirectoryRequest.apply _)
  }
  final implicit val DeleteConditionalForwarderRequestDecoder: io.circe.Decoder[models.DeleteConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName")).mapN(models.DeleteConditionalForwarderRequest.apply _)
  }
  final implicit val TrustDecoder: io.circe.Decoder[models.Trust] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrustDirection"), o.get[scala.Option[java.time.Instant]]("CreatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustStateReason"), o.get[scala.Option[java.lang.String]]("RemoteDomainName"), o.get[scala.Option[java.time.Instant]]("LastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustId"), o.get[scala.Option[java.lang.String]]("TrustState"), o.get[scala.Option[java.time.Instant]]("StateLastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustType"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.Trust.apply _)
  }
  final implicit val CreateMicrosoftADRequestDecoder: io.circe.Decoder[models.CreateMicrosoftADRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[models.DirectoryVpcSettings]("VpcSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.CreateMicrosoftADRequest.apply _)
  }
  final implicit val DescribeSnapshotsRequestDecoder: io.circe.Decoder[models.DescribeSnapshotsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("SnapshotIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeSnapshotsRequest.apply _)
  }
  final implicit val VerifyTrustResultDecoder: io.circe.Decoder[models.VerifyTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(models.VerifyTrustResult.apply _)
  }
  final implicit val CreateConditionalForwarderResultDecoder: io.circe.Decoder[models.CreateConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(models.CreateConditionalForwarderResult)
  final implicit val SnapshotLimitsDecoder: io.circe.Decoder[models.SnapshotLimits] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ManualSnapshotsLimit"), o.get[scala.Option[scala.Int]]("ManualSnapshotsCurrentCount"), o.get[scala.Option[scala.Boolean]]("ManualSnapshotsLimitReached")).mapN(models.SnapshotLimits.apply _)
  }
  final implicit val DisableRadiusResultDecoder: io.circe.Decoder[models.DisableRadiusResult.type] = io.circe.Decoder.decodeUnit.as(models.DisableRadiusResult)
  final implicit val CreateComputerResultDecoder: io.circe.Decoder[models.CreateComputerResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Computer]]("Computer").map(models.CreateComputerResult.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListTagsForResourceRequest.apply _)
  }
  final implicit val DescribeTrustsRequestDecoder: io.circe.Decoder[models.DescribeTrustsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("TrustIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeTrustsRequest.apply _)
  }
  final implicit val DescribeEventTopicsRequestDecoder: io.circe.Decoder[models.DescribeEventTopicsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("TopicNames")).mapN(models.DescribeEventTopicsRequest.apply _)
  }
  final implicit val DeleteConditionalForwarderResultDecoder: io.circe.Decoder[models.DeleteConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(models.DeleteConditionalForwarderResult)
  final implicit val DirectoryConnectSettingsDecoder: io.circe.Decoder[models.DirectoryConnectSettings] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VpcId"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.List[java.lang.String]]("CustomerDnsIps"), o.get[java.lang.String]("CustomerUserName")).mapN(models.DirectoryConnectSettings.apply _)
  }
  final implicit val UpdateNumberOfDomainControllersRequestDecoder: io.circe.Decoder[models.UpdateNumberOfDomainControllersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Int]("DesiredNumber")).mapN(models.UpdateNumberOfDomainControllersRequest.apply _)
  }
  final implicit val DirectoryConnectSettingsDescriptionDecoder: io.circe.Decoder[models.DirectoryConnectSettingsDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("CustomerUserName"), o.get[scala.Option[scala.List[java.lang.String]]]("ConnectIps"), o.get[scala.Option[java.lang.String]]("SecurityGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(models.DirectoryConnectSettingsDescription.apply _)
  }
  final implicit val ListTagsForResourceResultDecoder: io.circe.Decoder[models.ListTagsForResourceResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsForResourceResult.apply _)
  }
  final implicit val DirectoryUnavailableExceptionDecoder: io.circe.Decoder[models.DirectoryUnavailableException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.DirectoryUnavailableException.apply _)
  }
  final implicit val UpdateNumberOfDomainControllersResultDecoder: io.circe.Decoder[models.UpdateNumberOfDomainControllersResult.type] = io.circe.Decoder.decodeUnit.as(models.UpdateNumberOfDomainControllersResult)
  final implicit val DeregisterEventTopicRequestDecoder: io.circe.Decoder[models.DeregisterEventTopicRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("TopicName")).mapN(models.DeregisterEventTopicRequest.apply _)
  }
  final implicit val RestoreFromSnapshotResultDecoder: io.circe.Decoder[models.RestoreFromSnapshotResult.type] = io.circe.Decoder.decodeUnit.as(models.RestoreFromSnapshotResult)
  final implicit val ComputerDecoder: io.circe.Decoder[models.Computer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComputerId"), o.get[scala.Option[java.lang.String]]("ComputerName"), o.get[scala.Option[scala.List[models.Attribute]]]("ComputerAttributes")).mapN(models.Computer.apply _)
  }
  final implicit val DirectoryDescriptionDecoder: io.circe.Decoder[models.DirectoryDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Alias"), o.get[scala.Option[java.lang.String]]("StageReason"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Boolean]]("SsoEnabled"), o.get[scala.Option[java.time.Instant]]("LaunchTime"), o.get[scala.Option[java.time.Instant]]("StageLastUpdatedDateTime"), o.get[scala.Option[models.RadiusSettings]]("RadiusSettings"), o.get[scala.Option[java.lang.String]]("Stage"), o.get[scala.Option[models.DirectoryVpcSettingsDescription]]("VpcSettings"), o.get[scala.Option[java.lang.String]]("RadiusStatus"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Size"), o.get[scala.Option[models.DirectoryConnectSettingsDescription]]("ConnectSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("DesiredNumberOfDomainControllers"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddrs"), o.get[scala.Option[java.lang.String]]("AccessUrl"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.DirectoryDescription.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[models.ServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.ServiceException.apply _)
  }
  final implicit val UpdateConditionalForwarderRequestDecoder: io.circe.Decoder[models.UpdateConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName"), o.get[scala.List[java.lang.String]]("DnsIpAddrs")).mapN(models.UpdateConditionalForwarderRequest.apply _)
  }
  final implicit val DirectoryVpcSettingsDecoder: io.circe.Decoder[models.DirectoryVpcSettings] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VpcId"), o.get[scala.List[java.lang.String]]("SubnetIds")).mapN(models.DirectoryVpcSettings.apply _)
  }
  final implicit val UpdateRadiusRequestDecoder: io.circe.Decoder[models.UpdateRadiusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[models.RadiusSettings]("RadiusSettings")).mapN(models.UpdateRadiusRequest.apply _)
  }
  final implicit val ListIpRoutesResultDecoder: io.circe.Decoder[models.ListIpRoutesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.IpRouteInfo]]]("IpRoutesInfo"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListIpRoutesResult.apply _)
  }
  final implicit val AddIpRoutesRequestDecoder: io.circe.Decoder[models.AddIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.List[models.IpRoute]]("IpRoutes"), o.get[scala.Option[scala.Boolean]]("UpdateSecurityGroupForDirectoryControllers")).mapN(models.AddIpRoutesRequest.apply _)
  }
  final implicit val CreateMicrosoftADResultDecoder: io.circe.Decoder[models.CreateMicrosoftADResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(models.CreateMicrosoftADResult.apply _)
  }
  final implicit val IpRouteInfoDecoder: io.circe.Decoder[models.IpRouteInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IpRouteStatusMsg"), o.get[scala.Option[java.time.Instant]]("AddedDateTime"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("IpRouteStatusReason"), o.get[scala.Option[java.lang.String]]("CidrIp"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(models.IpRouteInfo.apply _)
  }
  final implicit val StartSchemaExtensionResultDecoder: io.circe.Decoder[models.StartSchemaExtensionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SchemaExtensionId").map(models.StartSchemaExtensionResult.apply _)
  }
  final implicit val TagLimitExceededExceptionDecoder: io.circe.Decoder[models.TagLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.TagLimitExceededException.apply _)
  }
  final implicit val IpRouteDecoder: io.circe.Decoder[models.IpRoute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CidrIp"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.IpRoute.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val CancelSchemaExtensionRequestDecoder: io.circe.Decoder[models.CancelSchemaExtensionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("SchemaExtensionId")).mapN(models.CancelSchemaExtensionRequest.apply _)
  }
  final implicit val DisableSsoRequestDecoder: io.circe.Decoder[models.DisableSsoRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Password")).mapN(models.DisableSsoRequest.apply _)
  }
  final implicit val IpRouteLimitExceededExceptionDecoder: io.circe.Decoder[models.IpRouteLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.IpRouteLimitExceededException.apply _)
  }
  final implicit val RestoreFromSnapshotRequestDecoder: io.circe.Decoder[models.RestoreFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SnapshotId").map(models.RestoreFromSnapshotRequest.apply _)
  }
  final implicit val DeleteDirectoryRequestDecoder: io.circe.Decoder[models.DeleteDirectoryRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(models.DeleteDirectoryRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(models.InvalidParameterException.apply _)
  }
  final implicit val EnableRadiusResultDecoder: io.circe.Decoder[models.EnableRadiusResult.type] = io.circe.Decoder.decodeUnit.as(models.EnableRadiusResult)
  final implicit val EnableSsoRequestDecoder: io.circe.Decoder[models.EnableSsoRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Password")).mapN(models.EnableSsoRequest.apply _)
  }
  final implicit val RemoveTagsFromResourceRequestDecoder: io.circe.Decoder[models.RemoveTagsFromResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.RemoveTagsFromResourceRequest.apply _)
  }
}