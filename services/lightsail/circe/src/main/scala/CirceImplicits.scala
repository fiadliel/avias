package org.lyranthe.araethura.lightsail
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetStaticIpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val GetRegionsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetRegionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("includeAvailabilityZones" -> o.includeAvailabilityZones.asJson)
  }
  final implicit val GetDomainResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDomainResult] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson)
  }
  final implicit val AccountSetupInProgressExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AccountSetupInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val DiskMapEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DiskMap] = io.circe.Encoder.instance { o => 
    Json.obj("originalDiskPath" -> o.originalDiskPath.asJson, "newDiskName" -> o.newDiskName.asJson)
  }
  final implicit val GetInstancePortStatesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstancePortStatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val DeleteInstanceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val ResourceLocationEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.ResourceLocation] = io.circe.Encoder.instance { o => 
    Json.obj("availabilityZone" -> o.availabilityZone.asJson, "regionName" -> o.regionName.asJson)
  }
  final implicit val DomainEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Domain] = io.circe.Encoder.instance { o => 
    Json.obj("domainEntries" -> o.domainEntries.asJson, "location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "name" -> o.name.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val GetKeyPairsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetKeyPairsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val CreateDiskSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDiskSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "diskSnapshotName" -> o.diskSnapshotName.asJson)
  }
  final implicit val GetStaticIpResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("staticIp" -> o.staticIp.asJson)
  }
  final implicit val DeleteKeyPairRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val StopInstanceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.StopInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val DiskEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Disk] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "path" -> o.path.asJson, "attachmentState" -> o.attachmentState.asJson, "isSystemDisk" -> o.isSystemDisk.asJson, "isAttached" -> o.isAttached.asJson, "sizeInGb" -> o.sizeInGb.asJson, "iops" -> o.iops.asJson, "gbInUse" -> o.gbInUse.asJson, "name" -> o.name.asJson, "attachedTo" -> o.attachedTo.asJson, "createdAt" -> o.createdAt.asJson, "state" -> o.state.asJson)
  }
  final implicit val IsVpcPeeredResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.IsVpcPeeredResult] = io.circe.Encoder.instance { o => 
    Json.obj("isPeered" -> o.isPeered.asJson)
  }
  final implicit val GetDiskResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("disk" -> o.disk.asJson)
  }
  final implicit val GetDomainRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val DetachDiskResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DetachDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val CloseInstancePublicPortsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CloseInstancePublicPortsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val CloseInstancePublicPortsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CloseInstancePublicPortsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("portInfo" -> o.portInfo.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetActiveNamesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetActiveNamesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val UnpeerVpcRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.UnpeerVpcRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDiskSnapshotsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val OperationEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Operation] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "id" -> o.id.asJson, "resourceType" -> o.resourceType.asJson, "operationDetails" -> o.operationDetails.asJson, "errorCode" -> o.errorCode.asJson, "errorDetails" -> o.errorDetails.asJson, "isTerminal" -> o.isTerminal.asJson, "resourceName" -> o.resourceName.asJson, "createdAt" -> o.createdAt.asJson, "statusChangedAt" -> o.statusChangedAt.asJson, "operationType" -> o.operationType.asJson, "status" -> o.status.asJson)
  }
  final implicit val ReleaseStaticIpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.ReleaseStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val IsVpcPeeredRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.IsVpcPeeredRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetInstanceSnapshotsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshots" -> o.instanceSnapshots.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val InstancePortStateEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstancePortState] = io.circe.Encoder.instance { o => 
    Json.obj("fromPort" -> o.fromPort.asJson, "toPort" -> o.toPort.asJson, "protocol" -> o.protocol.asJson, "state" -> o.state.asJson)
  }
  final implicit val GetInstancePortStatesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstancePortStatesResult] = io.circe.Encoder.instance { o => 
    Json.obj("portStates" -> o.portStates.asJson)
  }
  final implicit val GetBlueprintsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetBlueprintsResult] = io.circe.Encoder.instance { o => 
    Json.obj("blueprints" -> o.blueprints.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val StaticIpEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.StaticIp] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "isAttached" -> o.isAttached.asJson, "name" -> o.name.asJson, "attachedTo" -> o.attachedTo.asJson, "createdAt" -> o.createdAt.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val InstanceHardwareEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstanceHardware] = io.circe.Encoder.instance { o => 
    Json.obj("cpuCount" -> o.cpuCount.asJson, "disks" -> o.disks.asJson, "ramSizeInGb" -> o.ramSizeInGb.asJson)
  }
  final implicit val GetInstanceStateRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceStateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val RebootInstanceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.RebootInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetInstancesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstancesResult] = io.circe.Encoder.instance { o => 
    Json.obj("instances" -> o.instances.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val AvailabilityZoneEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AvailabilityZone] = io.circe.Encoder.instance { o => 
    Json.obj("zoneName" -> o.zoneName.asJson, "state" -> o.state.asJson)
  }
  final implicit val GetRegionsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetRegionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("regions" -> o.regions.asJson)
  }
  final implicit val GetInstanceAccessDetailsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceAccessDetailsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val ImportKeyPairRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.ImportKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson, "publicKeyBase64" -> o.publicKeyBase64.asJson)
  }
  final implicit val CreateDiskSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDiskSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val InstanceStateEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstanceState] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson)
  }
  final implicit val GetInstanceMetricDataResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceMetricDataResult] = io.circe.Encoder.instance { o => 
    Json.obj("metricName" -> o.metricName.asJson, "metricData" -> o.metricData.asJson)
  }
  final implicit val GetDiskSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshot" -> o.diskSnapshot.asJson)
  }
  final implicit val CreateInstancesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceNames" -> o.instanceNames.asJson, "availabilityZone" -> o.availabilityZone.asJson, "blueprintId" -> o.blueprintId.asJson, "bundleId" -> o.bundleId.asJson, "userData" -> o.userData.asJson, "customImageName" -> o.customImageName.asJson, "keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val GetBundlesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetBundlesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("includeInactive" -> o.includeInactive.asJson, "pageToken" -> o.pageToken.asJson)
  }
  final implicit val DeleteInstanceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetStaticIpsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetStaticIpsResult] = io.circe.Encoder.instance { o => 
    Json.obj("staticIps" -> o.staticIps.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DeleteDomainEntryRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDomainEntryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "domainEntry" -> o.domainEntry.asJson)
  }
  final implicit val DeleteDomainRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val GetInstanceMetricDataRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceMetricDataRequest] = io.circe.Encoder.instance { o => 
    Json.obj("metricName" -> o.metricName.asJson, "unit" -> o.unit.asJson, "statistics" -> o.statistics.asJson, "instanceName" -> o.instanceName.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "period" -> o.period.asJson)
  }
  final implicit val CreateKeyPairResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("keyPair" -> o.keyPair.asJson, "publicKeyBase64" -> o.publicKeyBase64.asJson, "privateKeyBase64" -> o.privateKeyBase64.asJson, "operation" -> o.operation.asJson)
  }
  final implicit val CreateDomainResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDomainResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val RegionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Region] = io.circe.Encoder.instance { o => 
    Json.obj("continentCode" -> o.continentCode.asJson, "description" -> o.description.asJson, "displayName" -> o.displayName.asJson, "name" -> o.name.asJson, "availabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val DomainEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DomainEntry] = io.circe.Encoder.instance { o => 
    Json.obj("options" -> o.options.asJson, "id" -> o.id.asJson, "target" -> o.target.asJson, "type" -> o.`type`.asJson, "name" -> o.name.asJson)
  }
  final implicit val GetActiveNamesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetActiveNamesResult] = io.circe.Encoder.instance { o => 
    Json.obj("activeNames" -> o.activeNames.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val CreateKeyPairRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val AttachStaticIpResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AttachStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetDisksRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDisksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val UpdateDomainEntryResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.UpdateDomainEntryResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val CreateInstanceSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateInstanceSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val CreateInstanceSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateInstanceSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshotName" -> o.instanceSnapshotName.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val DeleteDomainEntryResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDomainEntryResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val DeleteDomainResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDomainResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val DeleteInstanceSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshotName" -> o.instanceSnapshotName.asJson)
  }
  final implicit val AttachDiskResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AttachDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val OpenInstancePublicPortsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.OpenInstancePublicPortsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetInstanceSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshot" -> o.instanceSnapshot.asJson)
  }
  final implicit val DownloadDefaultKeyPairRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DownloadDefaultKeyPairRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetKeyPairsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetKeyPairsResult] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairs" -> o.keyPairs.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val CreateInstancesFromSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateInstancesFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("bundleId" -> o.bundleId.asJson, "availabilityZone" -> o.availabilityZone.asJson, "instanceNames" -> o.instanceNames.asJson, "instanceSnapshotName" -> o.instanceSnapshotName.asJson, "userData" -> o.userData.asJson, "keyPairName" -> o.keyPairName.asJson, "attachedDiskMapping" -> o.attachedDiskMapping.asJson)
  }
  final implicit val StartInstanceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.StartInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val CreateDomainEntryResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDomainEntryResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetOperationsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetOperationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val StopInstanceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.StopInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson, "force" -> o.force.asJson)
  }
  final implicit val ReleaseStaticIpResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.ReleaseStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val DeleteDiskResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val RebootInstanceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.RebootInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val UpdateDomainEntryRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.UpdateDomainEntryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "domainEntry" -> o.domainEntry.asJson)
  }
  final implicit val GetBlueprintsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetBlueprintsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("includeInactive" -> o.includeInactive.asJson, "pageToken" -> o.pageToken.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val GetKeyPairRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val CreateDomainRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val GetDiskSnapshotsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshots" -> o.diskSnapshots.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val GetOperationResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetOperationResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetInstanceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("instance" -> o.instance.asJson)
  }
  final implicit val GetInstancesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val CreateDiskRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "availabilityZone" -> o.availabilityZone.asJson, "sizeInGb" -> o.sizeInGb.asJson)
  }
  final implicit val CreateDomainEntryRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDomainEntryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "domainEntry" -> o.domainEntry.asJson)
  }
  final implicit val CreateDiskResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetStaticIpsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetStaticIpsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val OpenInstancePublicPortsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.OpenInstancePublicPortsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("portInfo" -> o.portInfo.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val KeyPairEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.KeyPair] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "name" -> o.name.asJson, "createdAt" -> o.createdAt.asJson, "fingerprint" -> o.fingerprint.asJson)
  }
  final implicit val GetOperationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetOperationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("operationId" -> o.operationId.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val GetOperationsForResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetOperationsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceName" -> o.resourceName.asJson, "pageToken" -> o.pageToken.asJson)
  }
  final implicit val UnauthenticatedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.UnauthenticatedException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val DeleteInstanceSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val MonthlyTransferEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.MonthlyTransfer] = io.circe.Encoder.instance { o => 
    Json.obj("gbPerMonthAllocated" -> o.gbPerMonthAllocated.asJson)
  }
  final implicit val CreateInstancesFromSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateInstancesFromSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val DownloadDefaultKeyPairResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DownloadDefaultKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("publicKeyBase64" -> o.publicKeyBase64.asJson, "privateKeyBase64" -> o.privateKeyBase64.asJson)
  }
  final implicit val DeleteDiskRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson)
  }
  final implicit val DetachStaticIpResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DetachStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val InstanceSnapshotEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstanceSnapshot] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "fromInstanceArn" -> o.fromInstanceArn.asJson, "resourceType" -> o.resourceType.asJson, "state" -> o.state.asJson, "supportCode" -> o.supportCode.asJson, "progress" -> o.progress.asJson, "fromBlueprintId" -> o.fromBlueprintId.asJson, "fromBundleId" -> o.fromBundleId.asJson, "sizeInGb" -> o.sizeInGb.asJson, "name" -> o.name.asJson, "fromInstanceName" -> o.fromInstanceName.asJson, "createdAt" -> o.createdAt.asJson, "fromAttachedDisks" -> o.fromAttachedDisks.asJson)
  }
  final implicit val DetachStaticIpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DetachStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val StartInstanceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.StartInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetInstanceSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshotName" -> o.instanceSnapshotName.asJson)
  }
  final implicit val AllocateStaticIpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AllocateStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val PeerVpcRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.PeerVpcRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PortInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.PortInfo] = io.circe.Encoder.instance { o => 
    Json.obj("fromPort" -> o.fromPort.asJson, "toPort" -> o.toPort.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val DetachDiskRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DetachDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson)
  }
  final implicit val BlueprintEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Blueprint] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "blueprintId" -> o.blueprintId.asJson, "group" -> o.group.asJson, "versionCode" -> o.versionCode.asJson, "description" -> o.description.asJson, "productUrl" -> o.productUrl.asJson, "licenseUrl" -> o.licenseUrl.asJson, "version" -> o.version.asJson, "platform" -> o.platform.asJson, "isActive" -> o.isActive.asJson, "minPower" -> o.minPower.asJson, "name" -> o.name.asJson)
  }
  final implicit val GetDomainsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDomainsResult] = io.circe.Encoder.instance { o => 
    Json.obj("domains" -> o.domains.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val InstancePortInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstancePortInfo] = io.circe.Encoder.instance { o => 
    Json.obj("fromPort" -> o.fromPort.asJson, "toPort" -> o.toPort.asJson, "accessFrom" -> o.accessFrom.asJson, "commonName" -> o.commonName.asJson, "accessDirection" -> o.accessDirection.asJson, "accessType" -> o.accessType.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val CreateDiskFromSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDiskFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "diskSnapshotName" -> o.diskSnapshotName.asJson, "availabilityZone" -> o.availabilityZone.asJson, "sizeInGb" -> o.sizeInGb.asJson)
  }
  final implicit val GetDomainsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDomainsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val GetInstanceStateResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceStateResult] = io.circe.Encoder.instance { o => 
    Json.obj("state" -> o.state.asJson)
  }
  final implicit val DeleteKeyPairResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val PutInstancePublicPortsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.PutInstancePublicPortsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("portInfos" -> o.portInfos.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val AttachDiskRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AttachDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "instanceName" -> o.instanceName.asJson, "diskPath" -> o.diskPath.asJson)
  }
  final implicit val BundleEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Bundle] = io.circe.Encoder.instance { o => 
    Json.obj("price" -> o.price.asJson, "ramSizeInGb" -> o.ramSizeInGb.asJson, "supportedPlatforms" -> o.supportedPlatforms.asJson, "bundleId" -> o.bundleId.asJson, "instanceType" -> o.instanceType.asJson, "name" -> o.name.asJson, "isActive" -> o.isActive.asJson, "cpuCount" -> o.cpuCount.asJson, "diskSizeInGb" -> o.diskSizeInGb.asJson, "power" -> o.power.asJson, "transferPerMonthInGb" -> o.transferPerMonthInGb.asJson)
  }
  final implicit val GetBundlesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetBundlesResult] = io.circe.Encoder.instance { o => 
    Json.obj("bundles" -> o.bundles.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val GetInstanceSnapshotsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val UnpeerVpcResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.UnpeerVpcResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val CreateInstancesResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateInstancesResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val PutInstancePublicPortsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.PutInstancePublicPortsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("ipv6Address" -> o.ipv6Address.asJson, "location" -> o.location.asJson, "bundleId" -> o.bundleId.asJson, "arn" -> o.arn.asJson, "username" -> o.username.asJson, "blueprintName" -> o.blueprintName.asJson, "blueprintId" -> o.blueprintId.asJson, "hardware" -> o.hardware.asJson, "state" -> o.state.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "isStaticIp" -> o.isStaticIp.asJson, "name" -> o.name.asJson, "sshKeyName" -> o.sshKeyName.asJson, "createdAt" -> o.createdAt.asJson, "networking" -> o.networking.asJson, "privateIpAddress" -> o.privateIpAddress.asJson, "publicIpAddress" -> o.publicIpAddress.asJson)
  }
  final implicit val GetOperationsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetOperationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val OperationFailureExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.OperationFailureException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val DeleteDiskSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDiskSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetOperationsForResourceResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetOperationsForResourceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson, "nextPageCount" -> o.nextPageCount.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val PasswordDataEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.PasswordData] = io.circe.Encoder.instance { o => 
    Json.obj("ciphertext" -> o.ciphertext.asJson, "keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val ImportKeyPairResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.ImportKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetKeyPairResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("keyPair" -> o.keyPair.asJson)
  }
  final implicit val AllocateStaticIpResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AllocateStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val InstanceNetworkingEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstanceNetworking] = io.circe.Encoder.instance { o => 
    Json.obj("monthlyTransfer" -> o.monthlyTransfer.asJson, "ports" -> o.ports.asJson)
  }
  final implicit val GetDisksResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDisksResult] = io.circe.Encoder.instance { o => 
    Json.obj("disks" -> o.disks.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val MetricDatapointEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.MetricDatapoint] = io.circe.Encoder.instance { o => 
    Json.obj("minimum" -> o.minimum.asJson, "average" -> o.average.asJson, "sum" -> o.sum.asJson, "sampleCount" -> o.sampleCount.asJson, "maximum" -> o.maximum.asJson, "timestamp" -> o.timestamp.asJson, "unit" -> o.unit.asJson)
  }
  final implicit val AttachStaticIpRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.AttachStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetInstanceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val PeerVpcResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.PeerVpcResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetDiskRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson)
  }
  final implicit val InstanceAccessDetailsEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.InstanceAccessDetails] = io.circe.Encoder.instance { o => 
    Json.obj("certKey" -> o.certKey.asJson, "password" -> o.password.asJson, "privateKey" -> o.privateKey.asJson, "username" -> o.username.asJson, "protocol" -> o.protocol.asJson, "instanceName" -> o.instanceName.asJson, "expiresAt" -> o.expiresAt.asJson, "passwordData" -> o.passwordData.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val GetInstanceAccessDetailsResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetInstanceAccessDetailsResult] = io.circe.Encoder.instance { o => 
    Json.obj("accessDetails" -> o.accessDetails.asJson)
  }
  final implicit val DiskSnapshotEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DiskSnapshot] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "state" -> o.state.asJson, "arn" -> o.arn.asJson, "fromDiskArn" -> o.fromDiskArn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "progress" -> o.progress.asJson, "sizeInGb" -> o.sizeInGb.asJson, "name" -> o.name.asJson, "fromDiskName" -> o.fromDiskName.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val DeleteDiskSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.DeleteDiskSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshotName" -> o.diskSnapshotName.asJson)
  }
  final implicit val CreateDiskFromSnapshotResultEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.CreateDiskFromSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetDiskSnapshotRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshotName" -> o.diskSnapshotName.asJson)
  }
  final implicit val GetStaticIpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(org.lyranthe.araethura.lightsail.models.GetStaticIpRequest.apply _)
  }
  final implicit val GetRegionsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetRegionsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("includeAvailabilityZones").map(org.lyranthe.araethura.lightsail.models.GetRegionsRequest.apply _)
  }
  final implicit val GetDomainResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDomainResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Domain]]("domain").map(org.lyranthe.araethura.lightsail.models.GetDomainResult.apply _)
  }
  final implicit val AccountSetupInProgressExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AccountSetupInProgressException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.AccountSetupInProgressException.apply _)
  }
  final implicit val DiskMapDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DiskMap] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("originalDiskPath"), o.get[scala.Option[java.lang.String]]("newDiskName")).mapN(org.lyranthe.araethura.lightsail.models.DiskMap.apply _)
  }
  final implicit val GetInstancePortStatesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstancePortStatesRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(org.lyranthe.araethura.lightsail.models.GetInstancePortStatesRequest.apply _)
  }
  final implicit val DeleteInstanceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(org.lyranthe.araethura.lightsail.models.DeleteInstanceRequest.apply _)
  }
  final implicit val ResourceLocationDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.ResourceLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("availabilityZone"), o.get[scala.Option[java.lang.String]]("regionName")).mapN(org.lyranthe.araethura.lightsail.models.ResourceLocation.apply _)
  }
  final implicit val DomainDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Domain] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.DomainEntry]]]("domainEntries"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.time.Instant]]("createdAt")).mapN(org.lyranthe.araethura.lightsail.models.Domain.apply _)
  }
  final implicit val GetKeyPairsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetKeyPairsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetKeyPairsRequest.apply _)
  }
  final implicit val CreateDiskSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDiskSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("diskSnapshotName")).mapN(org.lyranthe.araethura.lightsail.models.CreateDiskSnapshotRequest.apply _)
  }
  final implicit val GetStaticIpResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.StaticIp]]("staticIp").map(org.lyranthe.araethura.lightsail.models.GetStaticIpResult.apply _)
  }
  final implicit val DeleteKeyPairRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteKeyPairRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("keyPairName").map(org.lyranthe.araethura.lightsail.models.DeleteKeyPairRequest.apply _)
  }
  final implicit val StopInstanceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.StopInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.StopInstanceResult.apply _)
  }
  final implicit val DiskDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Disk] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("path"), o.get[scala.Option[java.lang.String]]("attachmentState"), o.get[scala.Option[scala.Boolean]]("isSystemDisk"), o.get[scala.Option[scala.Boolean]]("isAttached"), o.get[scala.Option[scala.Int]]("sizeInGb"), o.get[scala.Option[scala.Int]]("iops"), o.get[scala.Option[scala.Int]]("gbInUse"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("attachedTo"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("state")).mapN(org.lyranthe.araethura.lightsail.models.Disk.apply _)
  }
  final implicit val IsVpcPeeredResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.IsVpcPeeredResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("isPeered").map(org.lyranthe.araethura.lightsail.models.IsVpcPeeredResult.apply _)
  }
  final implicit val GetDiskResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Disk]]("disk").map(org.lyranthe.araethura.lightsail.models.GetDiskResult.apply _)
  }
  final implicit val GetDomainRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("domainName").map(org.lyranthe.araethura.lightsail.models.GetDomainRequest.apply _)
  }
  final implicit val DetachDiskResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DetachDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.DetachDiskResult.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.ServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.ServiceException.apply _)
  }
  final implicit val CloseInstancePublicPortsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CloseInstancePublicPortsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.CloseInstancePublicPortsResult.apply _)
  }
  final implicit val CloseInstancePublicPortsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CloseInstancePublicPortsRequest] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.lightsail.models.PortInfo]("portInfo"), o.get[java.lang.String]("instanceName")).mapN(org.lyranthe.araethura.lightsail.models.CloseInstancePublicPortsRequest.apply _)
  }
  final implicit val GetActiveNamesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetActiveNamesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetActiveNamesRequest.apply _)
  }
  final implicit val UnpeerVpcRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.UnpeerVpcRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.lightsail.models.UnpeerVpcRequest)
  final implicit val GetDiskSnapshotsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetDiskSnapshotsRequest.apply _)
  }
  final implicit val OperationDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Operation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("operationDetails"), o.get[scala.Option[java.lang.String]]("errorCode"), o.get[scala.Option[java.lang.String]]("errorDetails"), o.get[scala.Option[scala.Boolean]]("isTerminal"), o.get[scala.Option[java.lang.String]]("resourceName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.time.Instant]]("statusChangedAt"), o.get[scala.Option[java.lang.String]]("operationType"), o.get[scala.Option[java.lang.String]]("status")).mapN(org.lyranthe.araethura.lightsail.models.Operation.apply _)
  }
  final implicit val ReleaseStaticIpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.ReleaseStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(org.lyranthe.araethura.lightsail.models.ReleaseStaticIpRequest.apply _)
  }
  final implicit val IsVpcPeeredRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.IsVpcPeeredRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.lightsail.models.IsVpcPeeredRequest)
  final implicit val GetInstanceSnapshotsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.InstanceSnapshot]]]("instanceSnapshots"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotsResult.apply _)
  }
  final implicit val InstancePortStateDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstancePortState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("fromPort"), o.get[scala.Option[scala.Int]]("toPort"), o.get[scala.Option[java.lang.String]]("protocol"), o.get[scala.Option[java.lang.String]]("state")).mapN(org.lyranthe.araethura.lightsail.models.InstancePortState.apply _)
  }
  final implicit val GetInstancePortStatesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstancePortStatesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.InstancePortState]]]("portStates").map(org.lyranthe.araethura.lightsail.models.GetInstancePortStatesResult.apply _)
  }
  final implicit val GetBlueprintsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetBlueprintsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Blueprint]]]("blueprints"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetBlueprintsResult.apply _)
  }
  final implicit val StaticIpDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.StaticIp] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[scala.Boolean]]("isAttached"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("attachedTo"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("ipAddress")).mapN(org.lyranthe.araethura.lightsail.models.StaticIp.apply _)
  }
  final implicit val InstanceHardwareDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstanceHardware] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("cpuCount"), o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Disk]]]("disks"), o.get[scala.Option[scala.Float]]("ramSizeInGb")).mapN(org.lyranthe.araethura.lightsail.models.InstanceHardware.apply _)
  }
  final implicit val GetInstanceStateRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceStateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(org.lyranthe.araethura.lightsail.models.GetInstanceStateRequest.apply _)
  }
  final implicit val RebootInstanceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.RebootInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(org.lyranthe.araethura.lightsail.models.RebootInstanceRequest.apply _)
  }
  final implicit val GetInstancesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstancesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Instance]]]("instances"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetInstancesResult.apply _)
  }
  final implicit val AvailabilityZoneDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AvailabilityZone] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("zoneName"), o.get[scala.Option[java.lang.String]]("state")).mapN(org.lyranthe.araethura.lightsail.models.AvailabilityZone.apply _)
  }
  final implicit val GetRegionsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetRegionsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Region]]]("regions").map(org.lyranthe.araethura.lightsail.models.GetRegionsResult.apply _)
  }
  final implicit val GetInstanceAccessDetailsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceAccessDetailsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceName"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(org.lyranthe.araethura.lightsail.models.GetInstanceAccessDetailsRequest.apply _)
  }
  final implicit val ImportKeyPairRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.ImportKeyPairRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("keyPairName"), o.get[java.lang.String]("publicKeyBase64")).mapN(org.lyranthe.araethura.lightsail.models.ImportKeyPairRequest.apply _)
  }
  final implicit val CreateDiskSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDiskSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.CreateDiskSnapshotResult.apply _)
  }
  final implicit val InstanceStateDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstanceState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("code"), o.get[scala.Option[java.lang.String]]("name")).mapN(org.lyranthe.araethura.lightsail.models.InstanceState.apply _)
  }
  final implicit val GetInstanceMetricDataResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceMetricDataResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("metricName"), o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.MetricDatapoint]]]("metricData")).mapN(org.lyranthe.araethura.lightsail.models.GetInstanceMetricDataResult.apply _)
  }
  final implicit val GetDiskSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.DiskSnapshot]]("diskSnapshot").map(org.lyranthe.araethura.lightsail.models.GetDiskSnapshotResult.apply _)
  }
  final implicit val CreateInstancesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("instanceNames"), o.get[java.lang.String]("availabilityZone"), o.get[java.lang.String]("blueprintId"), o.get[java.lang.String]("bundleId"), o.get[scala.Option[java.lang.String]]("userData"), o.get[scala.Option[java.lang.String]]("customImageName"), o.get[scala.Option[java.lang.String]]("keyPairName")).mapN(org.lyranthe.araethura.lightsail.models.CreateInstancesRequest.apply _)
  }
  final implicit val GetBundlesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetBundlesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("includeInactive"), o.get[scala.Option[java.lang.String]]("pageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetBundlesRequest.apply _)
  }
  final implicit val DeleteInstanceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.DeleteInstanceResult.apply _)
  }
  final implicit val GetStaticIpsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetStaticIpsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.StaticIp]]]("staticIps"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetStaticIpsResult.apply _)
  }
  final implicit val DeleteDomainEntryRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDomainEntryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domainName"), o.get[org.lyranthe.araethura.lightsail.models.DomainEntry]("domainEntry")).mapN(org.lyranthe.araethura.lightsail.models.DeleteDomainEntryRequest.apply _)
  }
  final implicit val DeleteDomainRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("domainName").map(org.lyranthe.araethura.lightsail.models.DeleteDomainRequest.apply _)
  }
  final implicit val GetInstanceMetricDataRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceMetricDataRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("metricName"), o.get[java.lang.String]("unit"), o.get[scala.List[java.lang.String]]("statistics"), o.get[java.lang.String]("instanceName"), o.get[java.time.Instant]("startTime"), o.get[java.time.Instant]("endTime"), o.get[scala.Int]("period")).mapN(org.lyranthe.araethura.lightsail.models.GetInstanceMetricDataRequest.apply _)
  }
  final implicit val CreateKeyPairResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateKeyPairResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.KeyPair]]("keyPair"), o.get[scala.Option[java.lang.String]]("publicKeyBase64"), o.get[scala.Option[java.lang.String]]("privateKeyBase64"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation")).mapN(org.lyranthe.araethura.lightsail.models.CreateKeyPairResult.apply _)
  }
  final implicit val CreateDomainResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDomainResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.CreateDomainResult.apply _)
  }
  final implicit val RegionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Region] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("continentCode"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.AvailabilityZone]]]("availabilityZones")).mapN(org.lyranthe.araethura.lightsail.models.Region.apply _)
  }
  final implicit val DomainEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DomainEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("options"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("target"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("name")).mapN(org.lyranthe.araethura.lightsail.models.DomainEntry.apply _)
  }
  final implicit val GetActiveNamesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetActiveNamesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("activeNames"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetActiveNamesResult.apply _)
  }
  final implicit val CreateKeyPairRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateKeyPairRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("keyPairName").map(org.lyranthe.araethura.lightsail.models.CreateKeyPairRequest.apply _)
  }
  final implicit val AttachStaticIpResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AttachStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.AttachStaticIpResult.apply _)
  }
  final implicit val GetDisksRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDisksRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetDisksRequest.apply _)
  }
  final implicit val UpdateDomainEntryResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.UpdateDomainEntryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.UpdateDomainEntryResult.apply _)
  }
  final implicit val CreateInstanceSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateInstanceSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.CreateInstanceSnapshotResult.apply _)
  }
  final implicit val CreateInstanceSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateInstanceSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceSnapshotName"), o.get[java.lang.String]("instanceName")).mapN(org.lyranthe.araethura.lightsail.models.CreateInstanceSnapshotRequest.apply _)
  }
  final implicit val DeleteDomainEntryResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDomainEntryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.DeleteDomainEntryResult.apply _)
  }
  final implicit val DeleteDomainResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDomainResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.DeleteDomainResult.apply _)
  }
  final implicit val DeleteInstanceSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceSnapshotName").map(org.lyranthe.araethura.lightsail.models.DeleteInstanceSnapshotRequest.apply _)
  }
  final implicit val AttachDiskResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AttachDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.AttachDiskResult.apply _)
  }
  final implicit val OpenInstancePublicPortsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.OpenInstancePublicPortsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.OpenInstancePublicPortsResult.apply _)
  }
  final implicit val GetInstanceSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.InstanceSnapshot]]("instanceSnapshot").map(org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotResult.apply _)
  }
  final implicit val DownloadDefaultKeyPairRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DownloadDefaultKeyPairRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.lightsail.models.DownloadDefaultKeyPairRequest)
  final implicit val GetKeyPairsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetKeyPairsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.KeyPair]]]("keyPairs"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetKeyPairsResult.apply _)
  }
  final implicit val CreateInstancesFromSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateInstancesFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("bundleId"), o.get[java.lang.String]("availabilityZone"), o.get[scala.List[java.lang.String]]("instanceNames"), o.get[java.lang.String]("instanceSnapshotName"), o.get[scala.Option[java.lang.String]]("userData"), o.get[scala.Option[java.lang.String]]("keyPairName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[org.lyranthe.araethura.lightsail.models.DiskMap]]]]("attachedDiskMapping")).mapN(org.lyranthe.araethura.lightsail.models.CreateInstancesFromSnapshotRequest.apply _)
  }
  final implicit val StartInstanceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.StartInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.StartInstanceResult.apply _)
  }
  final implicit val CreateDomainEntryResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDomainEntryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.CreateDomainEntryResult.apply _)
  }
  final implicit val GetOperationsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetOperationsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetOperationsRequest.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.AccessDeniedException.apply _)
  }
  final implicit val StopInstanceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.StopInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceName"), o.get[scala.Option[scala.Boolean]]("force")).mapN(org.lyranthe.araethura.lightsail.models.StopInstanceRequest.apply _)
  }
  final implicit val ReleaseStaticIpResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.ReleaseStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.ReleaseStaticIpResult.apply _)
  }
  final implicit val DeleteDiskResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.DeleteDiskResult.apply _)
  }
  final implicit val RebootInstanceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.RebootInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.RebootInstanceResult.apply _)
  }
  final implicit val UpdateDomainEntryRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.UpdateDomainEntryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domainName"), o.get[org.lyranthe.araethura.lightsail.models.DomainEntry]("domainEntry")).mapN(org.lyranthe.araethura.lightsail.models.UpdateDomainEntryRequest.apply _)
  }
  final implicit val GetBlueprintsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetBlueprintsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("includeInactive"), o.get[scala.Option[java.lang.String]]("pageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetBlueprintsRequest.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.InvalidInputException.apply _)
  }
  final implicit val GetKeyPairRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetKeyPairRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("keyPairName").map(org.lyranthe.araethura.lightsail.models.GetKeyPairRequest.apply _)
  }
  final implicit val CreateDomainRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("domainName").map(org.lyranthe.araethura.lightsail.models.CreateDomainRequest.apply _)
  }
  final implicit val GetDiskSnapshotsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.DiskSnapshot]]]("diskSnapshots"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetDiskSnapshotsResult.apply _)
  }
  final implicit val GetOperationResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetOperationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.GetOperationResult.apply _)
  }
  final implicit val GetInstanceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Instance]]("instance").map(org.lyranthe.araethura.lightsail.models.GetInstanceResult.apply _)
  }
  final implicit val GetInstancesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstancesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetInstancesRequest.apply _)
  }
  final implicit val CreateDiskRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDiskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("availabilityZone"), o.get[scala.Int]("sizeInGb")).mapN(org.lyranthe.araethura.lightsail.models.CreateDiskRequest.apply _)
  }
  final implicit val CreateDomainEntryRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDomainEntryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domainName"), o.get[org.lyranthe.araethura.lightsail.models.DomainEntry]("domainEntry")).mapN(org.lyranthe.araethura.lightsail.models.CreateDomainEntryRequest.apply _)
  }
  final implicit val CreateDiskResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.CreateDiskResult.apply _)
  }
  final implicit val GetStaticIpsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetStaticIpsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetStaticIpsRequest.apply _)
  }
  final implicit val OpenInstancePublicPortsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.OpenInstancePublicPortsRequest] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.lightsail.models.PortInfo]("portInfo"), o.get[java.lang.String]("instanceName")).mapN(org.lyranthe.araethura.lightsail.models.OpenInstancePublicPortsRequest.apply _)
  }
  final implicit val KeyPairDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.KeyPair] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("fingerprint")).mapN(org.lyranthe.araethura.lightsail.models.KeyPair.apply _)
  }
  final implicit val GetOperationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetOperationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("operationId").map(org.lyranthe.araethura.lightsail.models.GetOperationRequest.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.NotFoundException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.NotFoundException.apply _)
  }
  final implicit val GetOperationsForResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetOperationsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceName"), o.get[scala.Option[java.lang.String]]("pageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetOperationsForResourceRequest.apply _)
  }
  final implicit val UnauthenticatedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.UnauthenticatedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.UnauthenticatedException.apply _)
  }
  final implicit val DeleteInstanceSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteInstanceSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.DeleteInstanceSnapshotResult.apply _)
  }
  final implicit val MonthlyTransferDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.MonthlyTransfer] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("gbPerMonthAllocated").map(org.lyranthe.araethura.lightsail.models.MonthlyTransfer.apply _)
  }
  final implicit val CreateInstancesFromSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateInstancesFromSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.CreateInstancesFromSnapshotResult.apply _)
  }
  final implicit val DownloadDefaultKeyPairResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DownloadDefaultKeyPairResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("publicKeyBase64"), o.get[scala.Option[java.lang.String]]("privateKeyBase64")).mapN(org.lyranthe.araethura.lightsail.models.DownloadDefaultKeyPairResult.apply _)
  }
  final implicit val DeleteDiskRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDiskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskName").map(org.lyranthe.araethura.lightsail.models.DeleteDiskRequest.apply _)
  }
  final implicit val DetachStaticIpResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DetachStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.DetachStaticIpResult.apply _)
  }
  final implicit val InstanceSnapshotDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstanceSnapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("fromInstanceArn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("state"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("progress"), o.get[scala.Option[java.lang.String]]("fromBlueprintId"), o.get[scala.Option[java.lang.String]]("fromBundleId"), o.get[scala.Option[scala.Int]]("sizeInGb"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("fromInstanceName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Disk]]]("fromAttachedDisks")).mapN(org.lyranthe.araethura.lightsail.models.InstanceSnapshot.apply _)
  }
  final implicit val DetachStaticIpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DetachStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(org.lyranthe.araethura.lightsail.models.DetachStaticIpRequest.apply _)
  }
  final implicit val StartInstanceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.StartInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(org.lyranthe.araethura.lightsail.models.StartInstanceRequest.apply _)
  }
  final implicit val GetInstanceSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceSnapshotName").map(org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotRequest.apply _)
  }
  final implicit val AllocateStaticIpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AllocateStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(org.lyranthe.araethura.lightsail.models.AllocateStaticIpRequest.apply _)
  }
  final implicit val PeerVpcRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.PeerVpcRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.lightsail.models.PeerVpcRequest)
  final implicit val PortInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.PortInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("fromPort"), o.get[scala.Option[scala.Int]]("toPort"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(org.lyranthe.araethura.lightsail.models.PortInfo.apply _)
  }
  final implicit val DetachDiskRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DetachDiskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskName").map(org.lyranthe.araethura.lightsail.models.DetachDiskRequest.apply _)
  }
  final implicit val BlueprintDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Blueprint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("blueprintId"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[java.lang.String]]("versionCode"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("productUrl"), o.get[scala.Option[java.lang.String]]("licenseUrl"), o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[scala.Boolean]]("isActive"), o.get[scala.Option[scala.Int]]("minPower"), o.get[scala.Option[java.lang.String]]("name")).mapN(org.lyranthe.araethura.lightsail.models.Blueprint.apply _)
  }
  final implicit val GetDomainsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDomainsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Domain]]]("domains"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetDomainsResult.apply _)
  }
  final implicit val InstancePortInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstancePortInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("fromPort"), o.get[scala.Option[scala.Int]]("toPort"), o.get[scala.Option[java.lang.String]]("accessFrom"), o.get[scala.Option[java.lang.String]]("commonName"), o.get[scala.Option[java.lang.String]]("accessDirection"), o.get[scala.Option[java.lang.String]]("accessType"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(org.lyranthe.araethura.lightsail.models.InstancePortInfo.apply _)
  }
  final implicit val CreateDiskFromSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDiskFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("diskSnapshotName"), o.get[java.lang.String]("availabilityZone"), o.get[scala.Int]("sizeInGb")).mapN(org.lyranthe.araethura.lightsail.models.CreateDiskFromSnapshotRequest.apply _)
  }
  final implicit val GetDomainsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDomainsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetDomainsRequest.apply _)
  }
  final implicit val GetInstanceStateResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceStateResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.InstanceState]]("state").map(org.lyranthe.araethura.lightsail.models.GetInstanceStateResult.apply _)
  }
  final implicit val DeleteKeyPairResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteKeyPairResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.DeleteKeyPairResult.apply _)
  }
  final implicit val PutInstancePublicPortsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.PutInstancePublicPortsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[org.lyranthe.araethura.lightsail.models.PortInfo]]("portInfos"), o.get[java.lang.String]("instanceName")).mapN(org.lyranthe.araethura.lightsail.models.PutInstancePublicPortsRequest.apply _)
  }
  final implicit val AttachDiskRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AttachDiskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("instanceName"), o.get[java.lang.String]("diskPath")).mapN(org.lyranthe.araethura.lightsail.models.AttachDiskRequest.apply _)
  }
  final implicit val BundleDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Bundle] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("price"), o.get[scala.Option[scala.Float]]("ramSizeInGb"), o.get[scala.Option[scala.List[java.lang.String]]]("supportedPlatforms"), o.get[scala.Option[java.lang.String]]("bundleId"), o.get[scala.Option[java.lang.String]]("instanceType"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Boolean]]("isActive"), o.get[scala.Option[scala.Int]]("cpuCount"), o.get[scala.Option[scala.Int]]("diskSizeInGb"), o.get[scala.Option[scala.Int]]("power"), o.get[scala.Option[scala.Int]]("transferPerMonthInGb")).mapN(org.lyranthe.araethura.lightsail.models.Bundle.apply _)
  }
  final implicit val GetBundlesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetBundlesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Bundle]]]("bundles"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetBundlesResult.apply _)
  }
  final implicit val GetInstanceSnapshotsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(org.lyranthe.araethura.lightsail.models.GetInstanceSnapshotsRequest.apply _)
  }
  final implicit val UnpeerVpcResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.UnpeerVpcResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.UnpeerVpcResult.apply _)
  }
  final implicit val CreateInstancesResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateInstancesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.CreateInstancesResult.apply _)
  }
  final implicit val PutInstancePublicPortsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.PutInstancePublicPortsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.PutInstancePublicPortsResult.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.Instance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ipv6Address"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("bundleId"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("username"), o.get[scala.Option[java.lang.String]]("blueprintName"), o.get[scala.Option[java.lang.String]]("blueprintId"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.InstanceHardware]]("hardware"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.InstanceState]]("state"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[scala.Boolean]]("isStaticIp"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("sshKeyName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.InstanceNetworking]]("networking"), o.get[scala.Option[java.lang.String]]("privateIpAddress"), o.get[scala.Option[java.lang.String]]("publicIpAddress")).mapN(org.lyranthe.araethura.lightsail.models.Instance.apply _)
  }
  final implicit val GetOperationsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetOperationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetOperationsResult.apply _)
  }
  final implicit val OperationFailureExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.OperationFailureException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(org.lyranthe.araethura.lightsail.models.OperationFailureException.apply _)
  }
  final implicit val DeleteDiskSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDiskSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.DeleteDiskSnapshotResult.apply _)
  }
  final implicit val GetOperationsForResourceResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetOperationsForResourceResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations"), o.get[scala.Option[java.lang.String]]("nextPageCount"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetOperationsForResourceResult.apply _)
  }
  final implicit val PasswordDataDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.PasswordData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ciphertext"), o.get[scala.Option[java.lang.String]]("keyPairName")).mapN(org.lyranthe.araethura.lightsail.models.PasswordData.apply _)
  }
  final implicit val ImportKeyPairResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.ImportKeyPairResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.ImportKeyPairResult.apply _)
  }
  final implicit val GetKeyPairResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetKeyPairResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.KeyPair]]("keyPair").map(org.lyranthe.araethura.lightsail.models.GetKeyPairResult.apply _)
  }
  final implicit val AllocateStaticIpResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AllocateStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.AllocateStaticIpResult.apply _)
  }
  final implicit val InstanceNetworkingDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstanceNetworking] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.MonthlyTransfer]]("monthlyTransfer"), o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.InstancePortInfo]]]("ports")).mapN(org.lyranthe.araethura.lightsail.models.InstanceNetworking.apply _)
  }
  final implicit val GetDisksResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDisksResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Disk]]]("disks"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(org.lyranthe.araethura.lightsail.models.GetDisksResult.apply _)
  }
  final implicit val MetricDatapointDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.MetricDatapoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("minimum"), o.get[scala.Option[scala.Double]]("average"), o.get[scala.Option[scala.Double]]("sum"), o.get[scala.Option[scala.Double]]("sampleCount"), o.get[scala.Option[scala.Double]]("maximum"), o.get[scala.Option[java.time.Instant]]("timestamp"), o.get[scala.Option[java.lang.String]]("unit")).mapN(org.lyranthe.araethura.lightsail.models.MetricDatapoint.apply _)
  }
  final implicit val AttachStaticIpRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.AttachStaticIpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("staticIpName"), o.get[java.lang.String]("instanceName")).mapN(org.lyranthe.araethura.lightsail.models.AttachStaticIpRequest.apply _)
  }
  final implicit val GetInstanceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(org.lyranthe.araethura.lightsail.models.GetInstanceRequest.apply _)
  }
  final implicit val PeerVpcResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.PeerVpcResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.Operation]]("operation").map(org.lyranthe.araethura.lightsail.models.PeerVpcResult.apply _)
  }
  final implicit val GetDiskRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDiskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskName").map(org.lyranthe.araethura.lightsail.models.GetDiskRequest.apply _)
  }
  final implicit val InstanceAccessDetailsDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.InstanceAccessDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("certKey"), o.get[scala.Option[java.lang.String]]("password"), o.get[scala.Option[java.lang.String]]("privateKey"), o.get[scala.Option[java.lang.String]]("username"), o.get[scala.Option[java.lang.String]]("protocol"), o.get[scala.Option[java.lang.String]]("instanceName"), o.get[scala.Option[java.time.Instant]]("expiresAt"), o.get[scala.Option[org.lyranthe.araethura.lightsail.models.PasswordData]]("passwordData"), o.get[scala.Option[java.lang.String]]("ipAddress")).mapN(org.lyranthe.araethura.lightsail.models.InstanceAccessDetails.apply _)
  }
  final implicit val GetInstanceAccessDetailsResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetInstanceAccessDetailsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.lightsail.models.InstanceAccessDetails]]("accessDetails").map(org.lyranthe.araethura.lightsail.models.GetInstanceAccessDetailsResult.apply _)
  }
  final implicit val DiskSnapshotDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DiskSnapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.lightsail.models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("state"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("fromDiskArn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("progress"), o.get[scala.Option[scala.Int]]("sizeInGb"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("fromDiskName"), o.get[scala.Option[java.time.Instant]]("createdAt")).mapN(org.lyranthe.araethura.lightsail.models.DiskSnapshot.apply _)
  }
  final implicit val DeleteDiskSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.DeleteDiskSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskSnapshotName").map(org.lyranthe.araethura.lightsail.models.DeleteDiskSnapshotRequest.apply _)
  }
  final implicit val CreateDiskFromSnapshotResultDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.CreateDiskFromSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.lightsail.models.Operation]]]("operations").map(org.lyranthe.araethura.lightsail.models.CreateDiskFromSnapshotResult.apply _)
  }
  final implicit val GetDiskSnapshotRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.lightsail.models.GetDiskSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskSnapshotName").map(org.lyranthe.araethura.lightsail.models.GetDiskSnapshotRequest.apply _)
  }
}