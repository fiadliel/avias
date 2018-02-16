package org.lyranthe.araethura.directory
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DirectoryLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val SchemaExtensionInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.SchemaExtensionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("EndDateTime" -> o.endDateTime.asJson, "SchemaExtensionStatusReason" -> o.schemaExtensionStatusReason.asJson, "StartDateTime" -> o.startDateTime.asJson, "SchemaExtensionStatus" -> o.schemaExtensionStatus.asJson, "Description" -> o.description.asJson, "SchemaExtensionId" -> o.schemaExtensionId.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val RegisterEventTopicResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RegisterEventTopicResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDirectoriesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeDirectoriesResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryDescriptions" -> o.directoryDescriptions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val RemoveIpRoutesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RemoveIpRoutesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateTrustRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustDirection" -> o.trustDirection.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "TrustPassword" -> o.trustPassword.asJson, "DirectoryId" -> o.directoryId.asJson, "TrustType" -> o.trustType.asJson, "ConditionalForwarderIpAddrs" -> o.conditionalForwarderIpAddrs.asJson)
  }
  final implicit val DescribeConditionalForwardersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeConditionalForwardersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainNames" -> o.remoteDomainNames.asJson)
  }
  final implicit val EnableRadiusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EnableRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RadiusSettings" -> o.radiusSettings.asJson)
  }
  final implicit val CreateDirectoryRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "Size" -> o.size.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson, "VpcSettings" -> o.vpcSettings.asJson)
  }
  final implicit val ClientExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ClientException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val CreateAliasRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Alias" -> o.alias.asJson)
  }
  final implicit val AddIpRoutesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.AddIpRoutesResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartSchemaExtensionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.StartSchemaExtensionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "CreateSnapshotBeforeSchemaExtension" -> o.createSnapshotBeforeSchemaExtension.asJson, "LdifContent" -> o.ldifContent.asJson, "Description" -> o.description.asJson)
  }
  final implicit val EventTopicEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EventTopic] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedDateTime" -> o.createdDateTime.asJson, "TopicArn" -> o.topicArn.asJson, "TopicName" -> o.topicName.asJson, "Status" -> o.status.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val RegisterEventTopicRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RegisterEventTopicRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicName" -> o.topicName.asJson)
  }
  final implicit val EnableSsoResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EnableSsoResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AuthenticationFailedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.AuthenticationFailedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DeregisterEventTopicResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeregisterEventTopicResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DescribeDomainControllersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeDomainControllersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "DomainControllerIds" -> o.domainControllerIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeConditionalForwardersResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeConditionalForwardersResult] = io.circe.Encoder.instance { o => 
    Json.obj("ConditionalForwarders" -> o.conditionalForwarders.asJson)
  }
  final implicit val DescribeTrustsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeTrustsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Trusts" -> o.trusts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConditionalForwarderEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ConditionalForwarder] = io.circe.Encoder.instance { o => 
    Json.obj("RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson, "ReplicationScope" -> o.replicationScope.asJson)
  }
  final implicit val UpdateRadiusResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UpdateRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UnsupportedOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ConnectDirectoryResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ConnectDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CancelSchemaExtensionResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CancelSchemaExtensionResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDirectoryResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateConditionalForwarderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson)
  }
  final implicit val DeleteTrustRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson, "DeleteAssociatedConditionalForwarder" -> o.deleteAssociatedConditionalForwarder.asJson)
  }
  final implicit val DirectoryLimitsEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryLimits] = io.circe.Encoder.instance { o => 
    Json.obj("CloudOnlyDirectoriesLimit" -> o.cloudOnlyDirectoriesLimit.asJson, "CloudOnlyMicrosoftADCurrentCount" -> o.cloudOnlyMicrosoftADCurrentCount.asJson, "ConnectedDirectoriesCurrentCount" -> o.connectedDirectoriesCurrentCount.asJson, "CloudOnlyDirectoriesCurrentCount" -> o.cloudOnlyDirectoriesCurrentCount.asJson, "CloudOnlyMicrosoftADLimit" -> o.cloudOnlyMicrosoftADLimit.asJson, "ConnectedDirectoriesLimit" -> o.connectedDirectoriesLimit.asJson, "CloudOnlyDirectoriesLimitReached" -> o.cloudOnlyDirectoriesLimitReached.asJson, "CloudOnlyMicrosoftADLimitReached" -> o.cloudOnlyMicrosoftADLimitReached.asJson, "ConnectedDirectoriesLimitReached" -> o.connectedDirectoriesLimitReached.asJson)
  }
  final implicit val DeleteSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeDomainControllersResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeDomainControllersResult] = io.circe.Encoder.instance { o => 
    Json.obj("DomainControllers" -> o.domainControllers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DisableRadiusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DisableRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val AttributeEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.Attribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InsufficientPermissionsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.InsufficientPermissionsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val RadiusSettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RadiusSettings] = io.circe.Encoder.instance { o => 
    Json.obj("AuthenticationProtocol" -> o.authenticationProtocol.asJson, "UseSameUsername" -> o.useSameUsername.asJson, "RadiusTimeout" -> o.radiusTimeout.asJson, "DisplayLabel" -> o.displayLabel.asJson, "SharedSecret" -> o.sharedSecret.asJson, "RadiusServers" -> o.radiusServers.asJson, "RadiusPort" -> o.radiusPort.asJson, "RadiusRetries" -> o.radiusRetries.asJson)
  }
  final implicit val SnapshotLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.SnapshotLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val DomainControllerEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DomainController] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "LaunchTime" -> o.launchTime.asJson, "StatusLastUpdatedDateTime" -> o.statusLastUpdatedDateTime.asJson, "SubnetId" -> o.subnetId.asJson, "DomainControllerId" -> o.domainControllerId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "Status" -> o.status.asJson, "DnsIpAddr" -> o.dnsIpAddr.asJson, "StatusReason" -> o.statusReason.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateComputerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateComputerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Password" -> o.password.asJson, "ComputerName" -> o.computerName.asJson, "DirectoryId" -> o.directoryId.asJson, "ComputerAttributes" -> o.computerAttributes.asJson, "OrganizationalUnitDistinguishedName" -> o.organizationalUnitDistinguishedName.asJson)
  }
  final implicit val CreateTrustResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val DomainControllerLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DomainControllerLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateConditionalForwarderResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UpdateConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DirectoryVpcSettingsDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryVpcSettingsDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "SecurityGroupId" -> o.securityGroupId.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val VerifyTrustRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.VerifyTrustRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val DeleteTrustResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val AddTagsToResourceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.AddTagsToResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventTopicsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeEventTopicsResult] = io.circe.Encoder.instance { o => 
    Json.obj("EventTopics" -> o.eventTopics.asJson)
  }
  final implicit val RemoveTagsFromResourceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RemoveTagsFromResourceResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDirectoriesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeDirectoriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryIds" -> o.directoryIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DisableSsoResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DisableSsoResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveIpRoutesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RemoveIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "CidrIps" -> o.cidrIps.asJson)
  }
  final implicit val GetSnapshotLimitsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.GetSnapshotLimitsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val DescribeSnapshotsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("Snapshots" -> o.snapshots.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetSnapshotLimitsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.GetSnapshotLimitsResult] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotLimits" -> o.snapshotLimits.asJson)
  }
  final implicit val DeleteSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val CreateAliasResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateAliasResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Alias" -> o.alias.asJson)
  }
  final implicit val SnapshotEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.Snapshot] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "Name" -> o.name.asJson, "StartTime" -> o.startTime.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val AddTagsToResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.AddTagsToResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val GetDirectoryLimitsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.GetDirectoryLimitsResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryLimits" -> o.directoryLimits.asJson)
  }
  final implicit val EntityDoesNotExistExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EntityDoesNotExistException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ListIpRoutesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ListIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListSchemaExtensionsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ListSchemaExtensionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaExtensionsInfo" -> o.schemaExtensionsInfo.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDirectoryResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateDirectoryResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val GetDirectoryLimitsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.GetDirectoryLimitsRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EntityAlreadyExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EntityAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val ListSchemaExtensionsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ListSchemaExtensionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val ConnectDirectoryRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ConnectDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "Size" -> o.size.asJson, "ConnectSettings" -> o.connectSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DeleteConditionalForwarderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson)
  }
  final implicit val TrustEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.Trust] = io.circe.Encoder.instance { o => 
    Json.obj("TrustDirection" -> o.trustDirection.asJson, "CreatedDateTime" -> o.createdDateTime.asJson, "TrustStateReason" -> o.trustStateReason.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "LastUpdatedDateTime" -> o.lastUpdatedDateTime.asJson, "TrustId" -> o.trustId.asJson, "TrustState" -> o.trustState.asJson, "StateLastUpdatedDateTime" -> o.stateLastUpdatedDateTime.asJson, "TrustType" -> o.trustType.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val CreateMicrosoftADRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateMicrosoftADRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Password" -> o.password.asJson, "VpcSettings" -> o.vpcSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeSnapshotsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "SnapshotIds" -> o.snapshotIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val VerifyTrustResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.VerifyTrustResult] = io.circe.Encoder.instance { o => 
    Json.obj("TrustId" -> o.trustId.asJson)
  }
  final implicit val CreateConditionalForwarderResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SnapshotLimitsEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.SnapshotLimits] = io.circe.Encoder.instance { o => 
    Json.obj("ManualSnapshotsLimit" -> o.manualSnapshotsLimit.asJson, "ManualSnapshotsCurrentCount" -> o.manualSnapshotsCurrentCount.asJson, "ManualSnapshotsLimitReached" -> o.manualSnapshotsLimitReached.asJson)
  }
  final implicit val DisableRadiusResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DisableRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateComputerResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateComputerResult] = io.circe.Encoder.instance { o => 
    Json.obj("Computer" -> o.computer.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeTrustsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeTrustsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TrustIds" -> o.trustIds.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeEventTopicsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DescribeEventTopicsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicNames" -> o.topicNames.asJson)
  }
  final implicit val DeleteConditionalForwarderResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteConditionalForwarderResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DirectoryConnectSettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryConnectSettings] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "CustomerDnsIps" -> o.customerDnsIps.asJson, "CustomerUserName" -> o.customerUserName.asJson)
  }
  final implicit val UpdateNumberOfDomainControllersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UpdateNumberOfDomainControllersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "DesiredNumber" -> o.desiredNumber.asJson)
  }
  final implicit val DirectoryConnectSettingsDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryConnectSettingsDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson, "CustomerUserName" -> o.customerUserName.asJson, "ConnectIps" -> o.connectIps.asJson, "SecurityGroupId" -> o.securityGroupId.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val ListTagsForResourceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ListTagsForResourceResult] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DirectoryUnavailableExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateNumberOfDomainControllersResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UpdateNumberOfDomainControllersResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeregisterEventTopicRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeregisterEventTopicRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "TopicName" -> o.topicName.asJson)
  }
  final implicit val RestoreFromSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RestoreFromSnapshotResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComputerEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.Computer] = io.circe.Encoder.instance { o => 
    Json.obj("ComputerId" -> o.computerId.asJson, "ComputerName" -> o.computerName.asJson, "ComputerAttributes" -> o.computerAttributes.asJson)
  }
  final implicit val DirectoryDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Alias" -> o.alias.asJson, "StageReason" -> o.stageReason.asJson, "Name" -> o.name.asJson, "SsoEnabled" -> o.ssoEnabled.asJson, "LaunchTime" -> o.launchTime.asJson, "StageLastUpdatedDateTime" -> o.stageLastUpdatedDateTime.asJson, "RadiusSettings" -> o.radiusSettings.asJson, "Stage" -> o.stage.asJson, "VpcSettings" -> o.vpcSettings.asJson, "RadiusStatus" -> o.radiusStatus.asJson, "Type" -> o.`type`.asJson, "Size" -> o.size.asJson, "ConnectSettings" -> o.connectSettings.asJson, "ShortName" -> o.shortName.asJson, "Description" -> o.description.asJson, "DesiredNumberOfDomainControllers" -> o.desiredNumberOfDomainControllers.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson, "AccessUrl" -> o.accessUrl.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val UpdateConditionalForwarderRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UpdateConditionalForwarderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RemoteDomainName" -> o.remoteDomainName.asJson, "DnsIpAddrs" -> o.dnsIpAddrs.asJson)
  }
  final implicit val DirectoryVpcSettingsEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DirectoryVpcSettings] = io.circe.Encoder.instance { o => 
    Json.obj("VpcId" -> o.vpcId.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val UpdateRadiusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.UpdateRadiusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "RadiusSettings" -> o.radiusSettings.asJson)
  }
  final implicit val ListIpRoutesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.ListIpRoutesResult] = io.circe.Encoder.instance { o => 
    Json.obj("IpRoutesInfo" -> o.ipRoutesInfo.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddIpRoutesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.AddIpRoutesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "IpRoutes" -> o.ipRoutes.asJson, "UpdateSecurityGroupForDirectoryControllers" -> o.updateSecurityGroupForDirectoryControllers.asJson)
  }
  final implicit val CreateMicrosoftADResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CreateMicrosoftADResult] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val IpRouteInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.IpRouteInfo] = io.circe.Encoder.instance { o => 
    Json.obj("IpRouteStatusMsg" -> o.ipRouteStatusMsg.asJson, "AddedDateTime" -> o.addedDateTime.asJson, "Description" -> o.description.asJson, "IpRouteStatusReason" -> o.ipRouteStatusReason.asJson, "CidrIp" -> o.cidrIp.asJson, "DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val StartSchemaExtensionResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.StartSchemaExtensionResult] = io.circe.Encoder.instance { o => 
    Json.obj("SchemaExtensionId" -> o.schemaExtensionId.asJson)
  }
  final implicit val TagLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.TagLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val IpRouteEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.IpRoute] = io.circe.Encoder.instance { o => 
    Json.obj("CidrIp" -> o.cidrIp.asJson, "Description" -> o.description.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CancelSchemaExtensionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.CancelSchemaExtensionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "SchemaExtensionId" -> o.schemaExtensionId.asJson)
  }
  final implicit val DisableSsoRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DisableSsoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "UserName" -> o.userName.asJson, "Password" -> o.password.asJson)
  }
  final implicit val IpRouteLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.IpRouteLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val RestoreFromSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RestoreFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DeleteDirectoryRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.DeleteDirectoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "RequestId" -> o.requestId.asJson)
  }
  final implicit val EnableRadiusResultEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EnableRadiusResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableSsoRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.EnableSsoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DirectoryId" -> o.directoryId.asJson, "UserName" -> o.userName.asJson, "Password" -> o.password.asJson)
  }
  final implicit val RemoveTagsFromResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.directory.models.RemoveTagsFromResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val DirectoryLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.DirectoryLimitExceededException.apply _)
  }
  final implicit val SchemaExtensionInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.SchemaExtensionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("SchemaExtensionStatusReason"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.lang.String]]("SchemaExtensionStatus"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("SchemaExtensionId"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.SchemaExtensionInfo.apply _)
  }
  final implicit val RegisterEventTopicResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RegisterEventTopicResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.RegisterEventTopicResult)
  final implicit val DescribeDirectoriesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeDirectoriesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.DirectoryDescription]]]("DirectoryDescriptions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.DescribeDirectoriesResult.apply _)
  }
  final implicit val CreateSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SnapshotId").map(org.lyranthe.araethura.directory.models.CreateSnapshotResult.apply _)
  }
  final implicit val RemoveIpRoutesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RemoveIpRoutesResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.RemoveIpRoutesResult)
  final implicit val CreateTrustRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateTrustRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrustDirection"), o.get[java.lang.String]("RemoteDomainName"), o.get[java.lang.String]("TrustPassword"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("TrustType"), o.get[scala.Option[scala.List[java.lang.String]]]("ConditionalForwarderIpAddrs")).mapN(org.lyranthe.araethura.directory.models.CreateTrustRequest.apply _)
  }
  final implicit val DescribeConditionalForwardersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeConditionalForwardersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("RemoteDomainNames")).mapN(org.lyranthe.araethura.directory.models.DescribeConditionalForwardersRequest.apply _)
  }
  final implicit val EnableRadiusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EnableRadiusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[org.lyranthe.araethura.directory.models.RadiusSettings]("RadiusSettings")).mapN(org.lyranthe.araethura.directory.models.EnableRadiusRequest.apply _)
  }
  final implicit val CreateDirectoryRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateDirectoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("Size"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[org.lyranthe.araethura.directory.models.DirectoryVpcSettings]]("VpcSettings")).mapN(org.lyranthe.araethura.directory.models.CreateDirectoryRequest.apply _)
  }
  final implicit val ClientExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ClientException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.ClientException.apply _)
  }
  final implicit val CreateAliasRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("Alias")).mapN(org.lyranthe.araethura.directory.models.CreateAliasRequest.apply _)
  }
  final implicit val AddIpRoutesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.AddIpRoutesResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.AddIpRoutesResult)
  final implicit val StartSchemaExtensionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.StartSchemaExtensionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Boolean]("CreateSnapshotBeforeSchemaExtension"), o.get[java.lang.String]("LdifContent"), o.get[java.lang.String]("Description")).mapN(org.lyranthe.araethura.directory.models.StartSchemaExtensionRequest.apply _)
  }
  final implicit val EventTopicDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EventTopic] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedDateTime"), o.get[scala.Option[java.lang.String]]("TopicArn"), o.get[scala.Option[java.lang.String]]("TopicName"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.EventTopic.apply _)
  }
  final implicit val RegisterEventTopicRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RegisterEventTopicRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("TopicName")).mapN(org.lyranthe.araethura.directory.models.RegisterEventTopicRequest.apply _)
  }
  final implicit val EnableSsoResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EnableSsoResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.EnableSsoResult)
  final implicit val AuthenticationFailedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.AuthenticationFailedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.AuthenticationFailedException.apply _)
  }
  final implicit val DeregisterEventTopicResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeregisterEventTopicResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.DeregisterEventTopicResult)
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.InvalidNextTokenException.apply _)
  }
  final implicit val DescribeDomainControllersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeDomainControllersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("DomainControllerIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.DescribeDomainControllersRequest.apply _)
  }
  final implicit val DescribeConditionalForwardersResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeConditionalForwardersResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.ConditionalForwarder]]]("ConditionalForwarders").map(org.lyranthe.araethura.directory.models.DescribeConditionalForwardersResult.apply _)
  }
  final implicit val DescribeTrustsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeTrustsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.Trust]]]("Trusts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.DescribeTrustsResult.apply _)
  }
  final implicit val ConditionalForwarderDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ConditionalForwarder] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RemoteDomainName"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddrs"), o.get[scala.Option[java.lang.String]]("ReplicationScope")).mapN(org.lyranthe.araethura.directory.models.ConditionalForwarder.apply _)
  }
  final implicit val UpdateRadiusResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UpdateRadiusResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.UpdateRadiusResult)
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UnsupportedOperationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.UnsupportedOperationException.apply _)
  }
  final implicit val ConnectDirectoryResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ConnectDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(org.lyranthe.araethura.directory.models.ConnectDirectoryResult.apply _)
  }
  final implicit val CancelSchemaExtensionResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CancelSchemaExtensionResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.CancelSchemaExtensionResult)
  final implicit val DeleteDirectoryResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(org.lyranthe.araethura.directory.models.DeleteDirectoryResult.apply _)
  }
  final implicit val CreateConditionalForwarderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName"), o.get[scala.List[java.lang.String]]("DnsIpAddrs")).mapN(org.lyranthe.araethura.directory.models.CreateConditionalForwarderRequest.apply _)
  }
  final implicit val DeleteTrustRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteTrustRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrustId"), o.get[scala.Option[scala.Boolean]]("DeleteAssociatedConditionalForwarder")).mapN(org.lyranthe.araethura.directory.models.DeleteTrustRequest.apply _)
  }
  final implicit val DirectoryLimitsDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryLimits] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("CloudOnlyDirectoriesLimit"), o.get[scala.Option[scala.Int]]("CloudOnlyMicrosoftADCurrentCount"), o.get[scala.Option[scala.Int]]("ConnectedDirectoriesCurrentCount"), o.get[scala.Option[scala.Int]]("CloudOnlyDirectoriesCurrentCount"), o.get[scala.Option[scala.Int]]("CloudOnlyMicrosoftADLimit"), o.get[scala.Option[scala.Int]]("ConnectedDirectoriesLimit"), o.get[scala.Option[scala.Boolean]]("CloudOnlyDirectoriesLimitReached"), o.get[scala.Option[scala.Boolean]]("CloudOnlyMicrosoftADLimitReached"), o.get[scala.Option[scala.Boolean]]("ConnectedDirectoriesLimitReached")).mapN(org.lyranthe.araethura.directory.models.DirectoryLimits.apply _)
  }
  final implicit val DeleteSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SnapshotId").map(org.lyranthe.araethura.directory.models.DeleteSnapshotResult.apply _)
  }
  final implicit val DescribeDomainControllersResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeDomainControllersResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.DomainController]]]("DomainControllers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.DescribeDomainControllersResult.apply _)
  }
  final implicit val DisableRadiusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DisableRadiusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(org.lyranthe.araethura.directory.models.DisableRadiusRequest.apply _)
  }
  final implicit val AttributeDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.Attribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.directory.models.Attribute.apply _)
  }
  final implicit val InsufficientPermissionsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.InsufficientPermissionsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.InsufficientPermissionsException.apply _)
  }
  final implicit val RadiusSettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RadiusSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AuthenticationProtocol"), o.get[scala.Option[scala.Boolean]]("UseSameUsername"), o.get[scala.Option[scala.Int]]("RadiusTimeout"), o.get[scala.Option[java.lang.String]]("DisplayLabel"), o.get[scala.Option[java.lang.String]]("SharedSecret"), o.get[scala.Option[scala.List[java.lang.String]]]("RadiusServers"), o.get[scala.Option[scala.Int]]("RadiusPort"), o.get[scala.Option[scala.Int]]("RadiusRetries")).mapN(org.lyranthe.araethura.directory.models.RadiusSettings.apply _)
  }
  final implicit val SnapshotLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.SnapshotLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.SnapshotLimitExceededException.apply _)
  }
  final implicit val DomainControllerDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DomainController] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.time.Instant]]("LaunchTime"), o.get[scala.Option[java.time.Instant]]("StatusLastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("DomainControllerId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DnsIpAddr"), o.get[scala.Option[java.lang.String]]("StatusReason"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.DomainController.apply _)
  }
  final implicit val CreateComputerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateComputerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Password"), o.get[java.lang.String]("ComputerName"), o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.Attribute]]]("ComputerAttributes"), o.get[scala.Option[java.lang.String]]("OrganizationalUnitDistinguishedName")).mapN(org.lyranthe.araethura.directory.models.CreateComputerRequest.apply _)
  }
  final implicit val CreateTrustResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(org.lyranthe.araethura.directory.models.CreateTrustResult.apply _)
  }
  final implicit val DomainControllerLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DomainControllerLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.DomainControllerLimitExceededException.apply _)
  }
  final implicit val UpdateConditionalForwarderResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UpdateConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.UpdateConditionalForwarderResult)
  final implicit val DirectoryVpcSettingsDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryVpcSettingsDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("SecurityGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(org.lyranthe.araethura.directory.models.DirectoryVpcSettingsDescription.apply _)
  }
  final implicit val VerifyTrustRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.VerifyTrustRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TrustId").map(org.lyranthe.araethura.directory.models.VerifyTrustRequest.apply _)
  }
  final implicit val DeleteTrustResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(org.lyranthe.araethura.directory.models.DeleteTrustResult.apply _)
  }
  final implicit val AddTagsToResourceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.AddTagsToResourceResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.AddTagsToResourceResult)
  final implicit val DescribeEventTopicsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeEventTopicsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.EventTopic]]]("EventTopics").map(org.lyranthe.araethura.directory.models.DescribeEventTopicsResult.apply _)
  }
  final implicit val RemoveTagsFromResourceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RemoveTagsFromResourceResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.RemoveTagsFromResourceResult)
  final implicit val DescribeDirectoriesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeDirectoriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("DirectoryIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.DescribeDirectoriesRequest.apply _)
  }
  final implicit val DisableSsoResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DisableSsoResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.DisableSsoResult)
  final implicit val RemoveIpRoutesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RemoveIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.List[java.lang.String]]("CidrIps")).mapN(org.lyranthe.araethura.directory.models.RemoveIpRoutesRequest.apply _)
  }
  final implicit val GetSnapshotLimitsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.GetSnapshotLimitsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(org.lyranthe.araethura.directory.models.GetSnapshotLimitsRequest.apply _)
  }
  final implicit val DescribeSnapshotsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.Snapshot]]]("Snapshots"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.DescribeSnapshotsResult.apply _)
  }
  final implicit val GetSnapshotLimitsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.GetSnapshotLimitsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directory.models.SnapshotLimits]]("SnapshotLimits").map(org.lyranthe.araethura.directory.models.GetSnapshotLimitsResult.apply _)
  }
  final implicit val DeleteSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SnapshotId").map(org.lyranthe.araethura.directory.models.DeleteSnapshotRequest.apply _)
  }
  final implicit val CreateAliasResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateAliasResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[java.lang.String]]("Alias")).mapN(org.lyranthe.araethura.directory.models.CreateAliasResult.apply _)
  }
  final implicit val SnapshotDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.Snapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.Snapshot.apply _)
  }
  final implicit val AddTagsToResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.AddTagsToResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[org.lyranthe.araethura.directory.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.directory.models.AddTagsToResourceRequest.apply _)
  }
  final implicit val GetDirectoryLimitsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.GetDirectoryLimitsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directory.models.DirectoryLimits]]("DirectoryLimits").map(org.lyranthe.araethura.directory.models.GetDirectoryLimitsResult.apply _)
  }
  final implicit val EntityDoesNotExistExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EntityDoesNotExistException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.EntityDoesNotExistException.apply _)
  }
  final implicit val ListIpRoutesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ListIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.ListIpRoutesRequest.apply _)
  }
  final implicit val ListSchemaExtensionsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ListSchemaExtensionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.SchemaExtensionInfo]]]("SchemaExtensionsInfo"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.ListSchemaExtensionsResult.apply _)
  }
  final implicit val CreateDirectoryResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateDirectoryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(org.lyranthe.araethura.directory.models.CreateDirectoryResult.apply _)
  }
  final implicit val GetDirectoryLimitsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.GetDirectoryLimitsRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.GetDirectoryLimitsRequest)
  final implicit val EntityAlreadyExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EntityAlreadyExistsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.EntityAlreadyExistsException.apply _)
  }
  final implicit val ListSchemaExtensionsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ListSchemaExtensionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.ListSchemaExtensionsRequest.apply _)
  }
  final implicit val CreateSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("Name")).mapN(org.lyranthe.araethura.directory.models.CreateSnapshotRequest.apply _)
  }
  final implicit val ConnectDirectoryRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ConnectDirectoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("Size"), o.get[org.lyranthe.araethura.directory.models.DirectoryConnectSettings]("ConnectSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.directory.models.ConnectDirectoryRequest.apply _)
  }
  final implicit val DeleteConditionalForwarderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName")).mapN(org.lyranthe.araethura.directory.models.DeleteConditionalForwarderRequest.apply _)
  }
  final implicit val TrustDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.Trust] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrustDirection"), o.get[scala.Option[java.time.Instant]]("CreatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustStateReason"), o.get[scala.Option[java.lang.String]]("RemoteDomainName"), o.get[scala.Option[java.time.Instant]]("LastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustId"), o.get[scala.Option[java.lang.String]]("TrustState"), o.get[scala.Option[java.time.Instant]]("StateLastUpdatedDateTime"), o.get[scala.Option[java.lang.String]]("TrustType"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.Trust.apply _)
  }
  final implicit val CreateMicrosoftADRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateMicrosoftADRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Password"), o.get[org.lyranthe.araethura.directory.models.DirectoryVpcSettings]("VpcSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.directory.models.CreateMicrosoftADRequest.apply _)
  }
  final implicit val DescribeSnapshotsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeSnapshotsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("SnapshotIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.DescribeSnapshotsRequest.apply _)
  }
  final implicit val VerifyTrustResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.VerifyTrustResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TrustId").map(org.lyranthe.araethura.directory.models.VerifyTrustResult.apply _)
  }
  final implicit val CreateConditionalForwarderResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.CreateConditionalForwarderResult)
  final implicit val SnapshotLimitsDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.SnapshotLimits] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ManualSnapshotsLimit"), o.get[scala.Option[scala.Int]]("ManualSnapshotsCurrentCount"), o.get[scala.Option[scala.Boolean]]("ManualSnapshotsLimitReached")).mapN(org.lyranthe.araethura.directory.models.SnapshotLimits.apply _)
  }
  final implicit val DisableRadiusResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DisableRadiusResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.DisableRadiusResult)
  final implicit val CreateComputerResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateComputerResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.directory.models.Computer]]("Computer").map(org.lyranthe.araethura.directory.models.CreateComputerResult.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.ListTagsForResourceRequest.apply _)
  }
  final implicit val DescribeTrustsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeTrustsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("TrustIds"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.directory.models.DescribeTrustsRequest.apply _)
  }
  final implicit val DescribeEventTopicsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DescribeEventTopicsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DirectoryId"), o.get[scala.Option[scala.List[java.lang.String]]]("TopicNames")).mapN(org.lyranthe.araethura.directory.models.DescribeEventTopicsRequest.apply _)
  }
  final implicit val DeleteConditionalForwarderResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteConditionalForwarderResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.DeleteConditionalForwarderResult)
  final implicit val DirectoryConnectSettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryConnectSettings] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VpcId"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.List[java.lang.String]]("CustomerDnsIps"), o.get[java.lang.String]("CustomerUserName")).mapN(org.lyranthe.araethura.directory.models.DirectoryConnectSettings.apply _)
  }
  final implicit val UpdateNumberOfDomainControllersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UpdateNumberOfDomainControllersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Int]("DesiredNumber")).mapN(org.lyranthe.araethura.directory.models.UpdateNumberOfDomainControllersRequest.apply _)
  }
  final implicit val DirectoryConnectSettingsDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryConnectSettingsDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("CustomerUserName"), o.get[scala.Option[scala.List[java.lang.String]]]("ConnectIps"), o.get[scala.Option[java.lang.String]]("SecurityGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(org.lyranthe.araethura.directory.models.DirectoryConnectSettingsDescription.apply _)
  }
  final implicit val ListTagsForResourceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ListTagsForResourceResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.ListTagsForResourceResult.apply _)
  }
  final implicit val DirectoryUnavailableExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryUnavailableException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.DirectoryUnavailableException.apply _)
  }
  final implicit val UpdateNumberOfDomainControllersResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UpdateNumberOfDomainControllersResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.UpdateNumberOfDomainControllersResult)
  final implicit val DeregisterEventTopicRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeregisterEventTopicRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("TopicName")).mapN(org.lyranthe.araethura.directory.models.DeregisterEventTopicRequest.apply _)
  }
  final implicit val RestoreFromSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RestoreFromSnapshotResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.RestoreFromSnapshotResult)
  final implicit val ComputerDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.Computer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComputerId"), o.get[scala.Option[java.lang.String]]("ComputerName"), o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.Attribute]]]("ComputerAttributes")).mapN(org.lyranthe.araethura.directory.models.Computer.apply _)
  }
  final implicit val DirectoryDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Alias"), o.get[scala.Option[java.lang.String]]("StageReason"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Boolean]]("SsoEnabled"), o.get[scala.Option[java.time.Instant]]("LaunchTime"), o.get[scala.Option[java.time.Instant]]("StageLastUpdatedDateTime"), o.get[scala.Option[org.lyranthe.araethura.directory.models.RadiusSettings]]("RadiusSettings"), o.get[scala.Option[java.lang.String]]("Stage"), o.get[scala.Option[org.lyranthe.araethura.directory.models.DirectoryVpcSettingsDescription]]("VpcSettings"), o.get[scala.Option[java.lang.String]]("RadiusStatus"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Size"), o.get[scala.Option[org.lyranthe.araethura.directory.models.DirectoryConnectSettingsDescription]]("ConnectSettings"), o.get[scala.Option[java.lang.String]]("ShortName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("DesiredNumberOfDomainControllers"), o.get[scala.Option[scala.List[java.lang.String]]]("DnsIpAddrs"), o.get[scala.Option[java.lang.String]]("AccessUrl"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.DirectoryDescription.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.ServiceException.apply _)
  }
  final implicit val UpdateConditionalForwarderRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UpdateConditionalForwarderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("RemoteDomainName"), o.get[scala.List[java.lang.String]]("DnsIpAddrs")).mapN(org.lyranthe.araethura.directory.models.UpdateConditionalForwarderRequest.apply _)
  }
  final implicit val DirectoryVpcSettingsDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DirectoryVpcSettings] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VpcId"), o.get[scala.List[java.lang.String]]("SubnetIds")).mapN(org.lyranthe.araethura.directory.models.DirectoryVpcSettings.apply _)
  }
  final implicit val UpdateRadiusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.UpdateRadiusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[org.lyranthe.araethura.directory.models.RadiusSettings]("RadiusSettings")).mapN(org.lyranthe.araethura.directory.models.UpdateRadiusRequest.apply _)
  }
  final implicit val ListIpRoutesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.ListIpRoutesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.directory.models.IpRouteInfo]]]("IpRoutesInfo"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.directory.models.ListIpRoutesResult.apply _)
  }
  final implicit val AddIpRoutesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.AddIpRoutesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.List[org.lyranthe.araethura.directory.models.IpRoute]]("IpRoutes"), o.get[scala.Option[scala.Boolean]]("UpdateSecurityGroupForDirectoryControllers")).mapN(org.lyranthe.araethura.directory.models.AddIpRoutesRequest.apply _)
  }
  final implicit val CreateMicrosoftADResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CreateMicrosoftADResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DirectoryId").map(org.lyranthe.araethura.directory.models.CreateMicrosoftADResult.apply _)
  }
  final implicit val IpRouteInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.IpRouteInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IpRouteStatusMsg"), o.get[scala.Option[java.time.Instant]]("AddedDateTime"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("IpRouteStatusReason"), o.get[scala.Option[java.lang.String]]("CidrIp"), o.get[scala.Option[java.lang.String]]("DirectoryId")).mapN(org.lyranthe.araethura.directory.models.IpRouteInfo.apply _)
  }
  final implicit val StartSchemaExtensionResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.StartSchemaExtensionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("SchemaExtensionId").map(org.lyranthe.araethura.directory.models.StartSchemaExtensionResult.apply _)
  }
  final implicit val TagLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.TagLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.TagLimitExceededException.apply _)
  }
  final implicit val IpRouteDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.IpRoute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CidrIp"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.directory.models.IpRoute.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(org.lyranthe.araethura.directory.models.Tag.apply _)
  }
  final implicit val CancelSchemaExtensionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.CancelSchemaExtensionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[java.lang.String]("SchemaExtensionId")).mapN(org.lyranthe.araethura.directory.models.CancelSchemaExtensionRequest.apply _)
  }
  final implicit val DisableSsoRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DisableSsoRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Password")).mapN(org.lyranthe.araethura.directory.models.DisableSsoRequest.apply _)
  }
  final implicit val IpRouteLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.IpRouteLimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.IpRouteLimitExceededException.apply _)
  }
  final implicit val RestoreFromSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RestoreFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SnapshotId").map(org.lyranthe.araethura.directory.models.RestoreFromSnapshotRequest.apply _)
  }
  final implicit val DeleteDirectoryRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.DeleteDirectoryRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DirectoryId").map(org.lyranthe.araethura.directory.models.DeleteDirectoryRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("RequestId")).mapN(org.lyranthe.araethura.directory.models.InvalidParameterException.apply _)
  }
  final implicit val EnableRadiusResultDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EnableRadiusResult.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.directory.models.EnableRadiusResult)
  final implicit val EnableSsoRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.EnableSsoRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DirectoryId"), o.get[scala.Option[java.lang.String]]("UserName"), o.get[scala.Option[java.lang.String]]("Password")).mapN(org.lyranthe.araethura.directory.models.EnableSsoRequest.apply _)
  }
  final implicit val RemoveTagsFromResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.directory.models.RemoveTagsFromResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(org.lyranthe.araethura.directory.models.RemoveTagsFromResourceRequest.apply _)
  }
}