package org.lyranthe.araethura.lightsail
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetStaticIpRequestEncoder: io.circe.Encoder[models.GetStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val GetRegionsRequestEncoder: io.circe.Encoder[models.GetRegionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("includeAvailabilityZones" -> o.includeAvailabilityZones.asJson)
  }
  final implicit val GetDomainResultEncoder: io.circe.Encoder[models.GetDomainResult] = io.circe.Encoder.instance { o => 
    Json.obj("domain" -> o.domain.asJson)
  }
  final implicit val AccountSetupInProgressExceptionEncoder: io.circe.Encoder[models.AccountSetupInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val DiskMapEncoder: io.circe.Encoder[models.DiskMap] = io.circe.Encoder.instance { o => 
    Json.obj("originalDiskPath" -> o.originalDiskPath.asJson, "newDiskName" -> o.newDiskName.asJson)
  }
  final implicit val GetInstancePortStatesRequestEncoder: io.circe.Encoder[models.GetInstancePortStatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val DeleteInstanceRequestEncoder: io.circe.Encoder[models.DeleteInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val ResourceLocationEncoder: io.circe.Encoder[models.ResourceLocation] = io.circe.Encoder.instance { o => 
    Json.obj("availabilityZone" -> o.availabilityZone.asJson, "regionName" -> o.regionName.asJson)
  }
  final implicit val DomainEncoder: io.circe.Encoder[models.Domain] = io.circe.Encoder.instance { o => 
    Json.obj("domainEntries" -> o.domainEntries.asJson, "location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "name" -> o.name.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val GetKeyPairsRequestEncoder: io.circe.Encoder[models.GetKeyPairsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val CreateDiskSnapshotRequestEncoder: io.circe.Encoder[models.CreateDiskSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "diskSnapshotName" -> o.diskSnapshotName.asJson)
  }
  final implicit val GetStaticIpResultEncoder: io.circe.Encoder[models.GetStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("staticIp" -> o.staticIp.asJson)
  }
  final implicit val DeleteKeyPairRequestEncoder: io.circe.Encoder[models.DeleteKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val StopInstanceResultEncoder: io.circe.Encoder[models.StopInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val DiskEncoder: io.circe.Encoder[models.Disk] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "path" -> o.path.asJson, "attachmentState" -> o.attachmentState.asJson, "isSystemDisk" -> o.isSystemDisk.asJson, "isAttached" -> o.isAttached.asJson, "sizeInGb" -> o.sizeInGb.asJson, "iops" -> o.iops.asJson, "gbInUse" -> o.gbInUse.asJson, "name" -> o.name.asJson, "attachedTo" -> o.attachedTo.asJson, "createdAt" -> o.createdAt.asJson, "state" -> o.state.asJson)
  }
  final implicit val IsVpcPeeredResultEncoder: io.circe.Encoder[models.IsVpcPeeredResult] = io.circe.Encoder.instance { o => 
    Json.obj("isPeered" -> o.isPeered.asJson)
  }
  final implicit val GetDiskResultEncoder: io.circe.Encoder[models.GetDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("disk" -> o.disk.asJson)
  }
  final implicit val GetDomainRequestEncoder: io.circe.Encoder[models.GetDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val DetachDiskResultEncoder: io.circe.Encoder[models.DetachDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val CloseInstancePublicPortsResultEncoder: io.circe.Encoder[models.CloseInstancePublicPortsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val CloseInstancePublicPortsRequestEncoder: io.circe.Encoder[models.CloseInstancePublicPortsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("portInfo" -> o.portInfo.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetActiveNamesRequestEncoder: io.circe.Encoder[models.GetActiveNamesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val UnpeerVpcRequestEncoder: io.circe.Encoder[models.UnpeerVpcRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDiskSnapshotsRequestEncoder: io.circe.Encoder[models.GetDiskSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val OperationEncoder: io.circe.Encoder[models.Operation] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "id" -> o.id.asJson, "resourceType" -> o.resourceType.asJson, "operationDetails" -> o.operationDetails.asJson, "errorCode" -> o.errorCode.asJson, "errorDetails" -> o.errorDetails.asJson, "isTerminal" -> o.isTerminal.asJson, "resourceName" -> o.resourceName.asJson, "createdAt" -> o.createdAt.asJson, "statusChangedAt" -> o.statusChangedAt.asJson, "operationType" -> o.operationType.asJson, "status" -> o.status.asJson)
  }
  final implicit val ReleaseStaticIpRequestEncoder: io.circe.Encoder[models.ReleaseStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val IsVpcPeeredRequestEncoder: io.circe.Encoder[models.IsVpcPeeredRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetInstanceSnapshotsResultEncoder: io.circe.Encoder[models.GetInstanceSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshots" -> o.instanceSnapshots.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val InstancePortStateEncoder: io.circe.Encoder[models.InstancePortState] = io.circe.Encoder.instance { o => 
    Json.obj("fromPort" -> o.fromPort.asJson, "toPort" -> o.toPort.asJson, "protocol" -> o.protocol.asJson, "state" -> o.state.asJson)
  }
  final implicit val GetInstancePortStatesResultEncoder: io.circe.Encoder[models.GetInstancePortStatesResult] = io.circe.Encoder.instance { o => 
    Json.obj("portStates" -> o.portStates.asJson)
  }
  final implicit val GetBlueprintsResultEncoder: io.circe.Encoder[models.GetBlueprintsResult] = io.circe.Encoder.instance { o => 
    Json.obj("blueprints" -> o.blueprints.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val StaticIpEncoder: io.circe.Encoder[models.StaticIp] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "isAttached" -> o.isAttached.asJson, "name" -> o.name.asJson, "attachedTo" -> o.attachedTo.asJson, "createdAt" -> o.createdAt.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val InstanceHardwareEncoder: io.circe.Encoder[models.InstanceHardware] = io.circe.Encoder.instance { o => 
    Json.obj("cpuCount" -> o.cpuCount.asJson, "disks" -> o.disks.asJson, "ramSizeInGb" -> o.ramSizeInGb.asJson)
  }
  final implicit val GetInstanceStateRequestEncoder: io.circe.Encoder[models.GetInstanceStateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val RebootInstanceRequestEncoder: io.circe.Encoder[models.RebootInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetInstancesResultEncoder: io.circe.Encoder[models.GetInstancesResult] = io.circe.Encoder.instance { o => 
    Json.obj("instances" -> o.instances.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val AvailabilityZoneEncoder: io.circe.Encoder[models.AvailabilityZone] = io.circe.Encoder.instance { o => 
    Json.obj("zoneName" -> o.zoneName.asJson, "state" -> o.state.asJson)
  }
  final implicit val GetRegionsResultEncoder: io.circe.Encoder[models.GetRegionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("regions" -> o.regions.asJson)
  }
  final implicit val GetInstanceAccessDetailsRequestEncoder: io.circe.Encoder[models.GetInstanceAccessDetailsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val ImportKeyPairRequestEncoder: io.circe.Encoder[models.ImportKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson, "publicKeyBase64" -> o.publicKeyBase64.asJson)
  }
  final implicit val CreateDiskSnapshotResultEncoder: io.circe.Encoder[models.CreateDiskSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val InstanceStateEncoder: io.circe.Encoder[models.InstanceState] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson)
  }
  final implicit val GetInstanceMetricDataResultEncoder: io.circe.Encoder[models.GetInstanceMetricDataResult] = io.circe.Encoder.instance { o => 
    Json.obj("metricName" -> o.metricName.asJson, "metricData" -> o.metricData.asJson)
  }
  final implicit val GetDiskSnapshotResultEncoder: io.circe.Encoder[models.GetDiskSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshot" -> o.diskSnapshot.asJson)
  }
  final implicit val CreateInstancesRequestEncoder: io.circe.Encoder[models.CreateInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceNames" -> o.instanceNames.asJson, "availabilityZone" -> o.availabilityZone.asJson, "blueprintId" -> o.blueprintId.asJson, "bundleId" -> o.bundleId.asJson, "userData" -> o.userData.asJson, "customImageName" -> o.customImageName.asJson, "keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val GetBundlesRequestEncoder: io.circe.Encoder[models.GetBundlesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("includeInactive" -> o.includeInactive.asJson, "pageToken" -> o.pageToken.asJson)
  }
  final implicit val DeleteInstanceResultEncoder: io.circe.Encoder[models.DeleteInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetStaticIpsResultEncoder: io.circe.Encoder[models.GetStaticIpsResult] = io.circe.Encoder.instance { o => 
    Json.obj("staticIps" -> o.staticIps.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val DeleteDomainEntryRequestEncoder: io.circe.Encoder[models.DeleteDomainEntryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "domainEntry" -> o.domainEntry.asJson)
  }
  final implicit val DeleteDomainRequestEncoder: io.circe.Encoder[models.DeleteDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val GetInstanceMetricDataRequestEncoder: io.circe.Encoder[models.GetInstanceMetricDataRequest] = io.circe.Encoder.instance { o => 
    Json.obj("metricName" -> o.metricName.asJson, "unit" -> o.unit.asJson, "statistics" -> o.statistics.asJson, "instanceName" -> o.instanceName.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "period" -> o.period.asJson)
  }
  final implicit val CreateKeyPairResultEncoder: io.circe.Encoder[models.CreateKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("keyPair" -> o.keyPair.asJson, "publicKeyBase64" -> o.publicKeyBase64.asJson, "privateKeyBase64" -> o.privateKeyBase64.asJson, "operation" -> o.operation.asJson)
  }
  final implicit val CreateDomainResultEncoder: io.circe.Encoder[models.CreateDomainResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val RegionEncoder: io.circe.Encoder[models.Region] = io.circe.Encoder.instance { o => 
    Json.obj("continentCode" -> o.continentCode.asJson, "description" -> o.description.asJson, "displayName" -> o.displayName.asJson, "name" -> o.name.asJson, "availabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val DomainEntryEncoder: io.circe.Encoder[models.DomainEntry] = io.circe.Encoder.instance { o => 
    Json.obj("options" -> o.options.asJson, "id" -> o.id.asJson, "target" -> o.target.asJson, "type" -> o.`type`.asJson, "name" -> o.name.asJson)
  }
  final implicit val GetActiveNamesResultEncoder: io.circe.Encoder[models.GetActiveNamesResult] = io.circe.Encoder.instance { o => 
    Json.obj("activeNames" -> o.activeNames.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val CreateKeyPairRequestEncoder: io.circe.Encoder[models.CreateKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val AttachStaticIpResultEncoder: io.circe.Encoder[models.AttachStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetDisksRequestEncoder: io.circe.Encoder[models.GetDisksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val UpdateDomainEntryResultEncoder: io.circe.Encoder[models.UpdateDomainEntryResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val CreateInstanceSnapshotResultEncoder: io.circe.Encoder[models.CreateInstanceSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val CreateInstanceSnapshotRequestEncoder: io.circe.Encoder[models.CreateInstanceSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshotName" -> o.instanceSnapshotName.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val DeleteDomainEntryResultEncoder: io.circe.Encoder[models.DeleteDomainEntryResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val DeleteDomainResultEncoder: io.circe.Encoder[models.DeleteDomainResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val DeleteInstanceSnapshotRequestEncoder: io.circe.Encoder[models.DeleteInstanceSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshotName" -> o.instanceSnapshotName.asJson)
  }
  final implicit val AttachDiskResultEncoder: io.circe.Encoder[models.AttachDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val OpenInstancePublicPortsResultEncoder: io.circe.Encoder[models.OpenInstancePublicPortsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetInstanceSnapshotResultEncoder: io.circe.Encoder[models.GetInstanceSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshot" -> o.instanceSnapshot.asJson)
  }
  final implicit val DownloadDefaultKeyPairRequestEncoder: io.circe.Encoder[models.DownloadDefaultKeyPairRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetKeyPairsResultEncoder: io.circe.Encoder[models.GetKeyPairsResult] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairs" -> o.keyPairs.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val CreateInstancesFromSnapshotRequestEncoder: io.circe.Encoder[models.CreateInstancesFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("bundleId" -> o.bundleId.asJson, "availabilityZone" -> o.availabilityZone.asJson, "instanceNames" -> o.instanceNames.asJson, "instanceSnapshotName" -> o.instanceSnapshotName.asJson, "userData" -> o.userData.asJson, "keyPairName" -> o.keyPairName.asJson, "attachedDiskMapping" -> o.attachedDiskMapping.asJson)
  }
  final implicit val StartInstanceResultEncoder: io.circe.Encoder[models.StartInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val CreateDomainEntryResultEncoder: io.circe.Encoder[models.CreateDomainEntryResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetOperationsRequestEncoder: io.circe.Encoder[models.GetOperationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val StopInstanceRequestEncoder: io.circe.Encoder[models.StopInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson, "force" -> o.force.asJson)
  }
  final implicit val ReleaseStaticIpResultEncoder: io.circe.Encoder[models.ReleaseStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val DeleteDiskResultEncoder: io.circe.Encoder[models.DeleteDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val RebootInstanceResultEncoder: io.circe.Encoder[models.RebootInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val UpdateDomainEntryRequestEncoder: io.circe.Encoder[models.UpdateDomainEntryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "domainEntry" -> o.domainEntry.asJson)
  }
  final implicit val GetBlueprintsRequestEncoder: io.circe.Encoder[models.GetBlueprintsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("includeInactive" -> o.includeInactive.asJson, "pageToken" -> o.pageToken.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val GetKeyPairRequestEncoder: io.circe.Encoder[models.GetKeyPairRequest] = io.circe.Encoder.instance { o => 
    Json.obj("keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val CreateDomainRequestEncoder: io.circe.Encoder[models.CreateDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val GetDiskSnapshotsResultEncoder: io.circe.Encoder[models.GetDiskSnapshotsResult] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshots" -> o.diskSnapshots.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val GetOperationResultEncoder: io.circe.Encoder[models.GetOperationResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetInstanceResultEncoder: io.circe.Encoder[models.GetInstanceResult] = io.circe.Encoder.instance { o => 
    Json.obj("instance" -> o.instance.asJson)
  }
  final implicit val GetInstancesRequestEncoder: io.circe.Encoder[models.GetInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val CreateDiskRequestEncoder: io.circe.Encoder[models.CreateDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "availabilityZone" -> o.availabilityZone.asJson, "sizeInGb" -> o.sizeInGb.asJson)
  }
  final implicit val CreateDomainEntryRequestEncoder: io.circe.Encoder[models.CreateDomainEntryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "domainEntry" -> o.domainEntry.asJson)
  }
  final implicit val CreateDiskResultEncoder: io.circe.Encoder[models.CreateDiskResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetStaticIpsRequestEncoder: io.circe.Encoder[models.GetStaticIpsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val OpenInstancePublicPortsRequestEncoder: io.circe.Encoder[models.OpenInstancePublicPortsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("portInfo" -> o.portInfo.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val KeyPairEncoder: io.circe.Encoder[models.KeyPair] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "name" -> o.name.asJson, "createdAt" -> o.createdAt.asJson, "fingerprint" -> o.fingerprint.asJson)
  }
  final implicit val GetOperationRequestEncoder: io.circe.Encoder[models.GetOperationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("operationId" -> o.operationId.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val GetOperationsForResourceRequestEncoder: io.circe.Encoder[models.GetOperationsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceName" -> o.resourceName.asJson, "pageToken" -> o.pageToken.asJson)
  }
  final implicit val UnauthenticatedExceptionEncoder: io.circe.Encoder[models.UnauthenticatedException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val DeleteInstanceSnapshotResultEncoder: io.circe.Encoder[models.DeleteInstanceSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val MonthlyTransferEncoder: io.circe.Encoder[models.MonthlyTransfer] = io.circe.Encoder.instance { o => 
    Json.obj("gbPerMonthAllocated" -> o.gbPerMonthAllocated.asJson)
  }
  final implicit val CreateInstancesFromSnapshotResultEncoder: io.circe.Encoder[models.CreateInstancesFromSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val DownloadDefaultKeyPairResultEncoder: io.circe.Encoder[models.DownloadDefaultKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("publicKeyBase64" -> o.publicKeyBase64.asJson, "privateKeyBase64" -> o.privateKeyBase64.asJson)
  }
  final implicit val DeleteDiskRequestEncoder: io.circe.Encoder[models.DeleteDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson)
  }
  final implicit val DetachStaticIpResultEncoder: io.circe.Encoder[models.DetachStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val InstanceSnapshotEncoder: io.circe.Encoder[models.InstanceSnapshot] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "arn" -> o.arn.asJson, "fromInstanceArn" -> o.fromInstanceArn.asJson, "resourceType" -> o.resourceType.asJson, "state" -> o.state.asJson, "supportCode" -> o.supportCode.asJson, "progress" -> o.progress.asJson, "fromBlueprintId" -> o.fromBlueprintId.asJson, "fromBundleId" -> o.fromBundleId.asJson, "sizeInGb" -> o.sizeInGb.asJson, "name" -> o.name.asJson, "fromInstanceName" -> o.fromInstanceName.asJson, "createdAt" -> o.createdAt.asJson, "fromAttachedDisks" -> o.fromAttachedDisks.asJson)
  }
  final implicit val DetachStaticIpRequestEncoder: io.circe.Encoder[models.DetachStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val StartInstanceRequestEncoder: io.circe.Encoder[models.StartInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetInstanceSnapshotRequestEncoder: io.circe.Encoder[models.GetInstanceSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSnapshotName" -> o.instanceSnapshotName.asJson)
  }
  final implicit val AllocateStaticIpRequestEncoder: io.circe.Encoder[models.AllocateStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson)
  }
  final implicit val PeerVpcRequestEncoder: io.circe.Encoder[models.PeerVpcRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PortInfoEncoder: io.circe.Encoder[models.PortInfo] = io.circe.Encoder.instance { o => 
    Json.obj("fromPort" -> o.fromPort.asJson, "toPort" -> o.toPort.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val DetachDiskRequestEncoder: io.circe.Encoder[models.DetachDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson)
  }
  final implicit val BlueprintEncoder: io.circe.Encoder[models.Blueprint] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "blueprintId" -> o.blueprintId.asJson, "group" -> o.group.asJson, "versionCode" -> o.versionCode.asJson, "description" -> o.description.asJson, "productUrl" -> o.productUrl.asJson, "licenseUrl" -> o.licenseUrl.asJson, "version" -> o.version.asJson, "platform" -> o.platform.asJson, "isActive" -> o.isActive.asJson, "minPower" -> o.minPower.asJson, "name" -> o.name.asJson)
  }
  final implicit val GetDomainsResultEncoder: io.circe.Encoder[models.GetDomainsResult] = io.circe.Encoder.instance { o => 
    Json.obj("domains" -> o.domains.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val InstancePortInfoEncoder: io.circe.Encoder[models.InstancePortInfo] = io.circe.Encoder.instance { o => 
    Json.obj("fromPort" -> o.fromPort.asJson, "toPort" -> o.toPort.asJson, "accessFrom" -> o.accessFrom.asJson, "commonName" -> o.commonName.asJson, "accessDirection" -> o.accessDirection.asJson, "accessType" -> o.accessType.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val CreateDiskFromSnapshotRequestEncoder: io.circe.Encoder[models.CreateDiskFromSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "diskSnapshotName" -> o.diskSnapshotName.asJson, "availabilityZone" -> o.availabilityZone.asJson, "sizeInGb" -> o.sizeInGb.asJson)
  }
  final implicit val GetDomainsRequestEncoder: io.circe.Encoder[models.GetDomainsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val GetInstanceStateResultEncoder: io.circe.Encoder[models.GetInstanceStateResult] = io.circe.Encoder.instance { o => 
    Json.obj("state" -> o.state.asJson)
  }
  final implicit val DeleteKeyPairResultEncoder: io.circe.Encoder[models.DeleteKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val PutInstancePublicPortsRequestEncoder: io.circe.Encoder[models.PutInstancePublicPortsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("portInfos" -> o.portInfos.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val AttachDiskRequestEncoder: io.circe.Encoder[models.AttachDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson, "instanceName" -> o.instanceName.asJson, "diskPath" -> o.diskPath.asJson)
  }
  final implicit val BundleEncoder: io.circe.Encoder[models.Bundle] = io.circe.Encoder.instance { o => 
    Json.obj("price" -> o.price.asJson, "ramSizeInGb" -> o.ramSizeInGb.asJson, "supportedPlatforms" -> o.supportedPlatforms.asJson, "bundleId" -> o.bundleId.asJson, "instanceType" -> o.instanceType.asJson, "name" -> o.name.asJson, "isActive" -> o.isActive.asJson, "cpuCount" -> o.cpuCount.asJson, "diskSizeInGb" -> o.diskSizeInGb.asJson, "power" -> o.power.asJson, "transferPerMonthInGb" -> o.transferPerMonthInGb.asJson)
  }
  final implicit val GetBundlesResultEncoder: io.circe.Encoder[models.GetBundlesResult] = io.circe.Encoder.instance { o => 
    Json.obj("bundles" -> o.bundles.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val GetInstanceSnapshotsRequestEncoder: io.circe.Encoder[models.GetInstanceSnapshotsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pageToken" -> o.pageToken.asJson)
  }
  final implicit val UnpeerVpcResultEncoder: io.circe.Encoder[models.UnpeerVpcResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val CreateInstancesResultEncoder: io.circe.Encoder[models.CreateInstancesResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val PutInstancePublicPortsResultEncoder: io.circe.Encoder[models.PutInstancePublicPortsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("ipv6Address" -> o.ipv6Address.asJson, "location" -> o.location.asJson, "bundleId" -> o.bundleId.asJson, "arn" -> o.arn.asJson, "username" -> o.username.asJson, "blueprintName" -> o.blueprintName.asJson, "blueprintId" -> o.blueprintId.asJson, "hardware" -> o.hardware.asJson, "state" -> o.state.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "isStaticIp" -> o.isStaticIp.asJson, "name" -> o.name.asJson, "sshKeyName" -> o.sshKeyName.asJson, "createdAt" -> o.createdAt.asJson, "networking" -> o.networking.asJson, "privateIpAddress" -> o.privateIpAddress.asJson, "publicIpAddress" -> o.publicIpAddress.asJson)
  }
  final implicit val GetOperationsResultEncoder: io.circe.Encoder[models.GetOperationsResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val OperationFailureExceptionEncoder: io.circe.Encoder[models.OperationFailureException] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "docs" -> o.docs.asJson, "message" -> o.message.asJson, "tip" -> o.tip.asJson)
  }
  final implicit val DeleteDiskSnapshotResultEncoder: io.circe.Encoder[models.DeleteDiskSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetOperationsForResourceResultEncoder: io.circe.Encoder[models.GetOperationsForResourceResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson, "nextPageCount" -> o.nextPageCount.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val PasswordDataEncoder: io.circe.Encoder[models.PasswordData] = io.circe.Encoder.instance { o => 
    Json.obj("ciphertext" -> o.ciphertext.asJson, "keyPairName" -> o.keyPairName.asJson)
  }
  final implicit val ImportKeyPairResultEncoder: io.circe.Encoder[models.ImportKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetKeyPairResultEncoder: io.circe.Encoder[models.GetKeyPairResult] = io.circe.Encoder.instance { o => 
    Json.obj("keyPair" -> o.keyPair.asJson)
  }
  final implicit val AllocateStaticIpResultEncoder: io.circe.Encoder[models.AllocateStaticIpResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val InstanceNetworkingEncoder: io.circe.Encoder[models.InstanceNetworking] = io.circe.Encoder.instance { o => 
    Json.obj("monthlyTransfer" -> o.monthlyTransfer.asJson, "ports" -> o.ports.asJson)
  }
  final implicit val GetDisksResultEncoder: io.circe.Encoder[models.GetDisksResult] = io.circe.Encoder.instance { o => 
    Json.obj("disks" -> o.disks.asJson, "nextPageToken" -> o.nextPageToken.asJson)
  }
  final implicit val MetricDatapointEncoder: io.circe.Encoder[models.MetricDatapoint] = io.circe.Encoder.instance { o => 
    Json.obj("minimum" -> o.minimum.asJson, "average" -> o.average.asJson, "sum" -> o.sum.asJson, "sampleCount" -> o.sampleCount.asJson, "maximum" -> o.maximum.asJson, "timestamp" -> o.timestamp.asJson, "unit" -> o.unit.asJson)
  }
  final implicit val AttachStaticIpRequestEncoder: io.circe.Encoder[models.AttachStaticIpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("staticIpName" -> o.staticIpName.asJson, "instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetInstanceRequestEncoder: io.circe.Encoder[models.GetInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val PeerVpcResultEncoder: io.circe.Encoder[models.PeerVpcResult] = io.circe.Encoder.instance { o => 
    Json.obj("operation" -> o.operation.asJson)
  }
  final implicit val GetDiskRequestEncoder: io.circe.Encoder[models.GetDiskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskName" -> o.diskName.asJson)
  }
  final implicit val InstanceAccessDetailsEncoder: io.circe.Encoder[models.InstanceAccessDetails] = io.circe.Encoder.instance { o => 
    Json.obj("certKey" -> o.certKey.asJson, "password" -> o.password.asJson, "privateKey" -> o.privateKey.asJson, "username" -> o.username.asJson, "protocol" -> o.protocol.asJson, "instanceName" -> o.instanceName.asJson, "expiresAt" -> o.expiresAt.asJson, "passwordData" -> o.passwordData.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val GetInstanceAccessDetailsResultEncoder: io.circe.Encoder[models.GetInstanceAccessDetailsResult] = io.circe.Encoder.instance { o => 
    Json.obj("accessDetails" -> o.accessDetails.asJson)
  }
  final implicit val DiskSnapshotEncoder: io.circe.Encoder[models.DiskSnapshot] = io.circe.Encoder.instance { o => 
    Json.obj("location" -> o.location.asJson, "state" -> o.state.asJson, "arn" -> o.arn.asJson, "fromDiskArn" -> o.fromDiskArn.asJson, "resourceType" -> o.resourceType.asJson, "supportCode" -> o.supportCode.asJson, "progress" -> o.progress.asJson, "sizeInGb" -> o.sizeInGb.asJson, "name" -> o.name.asJson, "fromDiskName" -> o.fromDiskName.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val DeleteDiskSnapshotRequestEncoder: io.circe.Encoder[models.DeleteDiskSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshotName" -> o.diskSnapshotName.asJson)
  }
  final implicit val CreateDiskFromSnapshotResultEncoder: io.circe.Encoder[models.CreateDiskFromSnapshotResult] = io.circe.Encoder.instance { o => 
    Json.obj("operations" -> o.operations.asJson)
  }
  final implicit val GetDiskSnapshotRequestEncoder: io.circe.Encoder[models.GetDiskSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("diskSnapshotName" -> o.diskSnapshotName.asJson)
  }
  final implicit val GetStaticIpRequestDecoder: io.circe.Decoder[models.GetStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(models.GetStaticIpRequest.apply _)
  }
  final implicit val GetRegionsRequestDecoder: io.circe.Decoder[models.GetRegionsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("includeAvailabilityZones").map(models.GetRegionsRequest.apply _)
  }
  final implicit val GetDomainResultDecoder: io.circe.Decoder[models.GetDomainResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Domain]]("domain").map(models.GetDomainResult.apply _)
  }
  final implicit val AccountSetupInProgressExceptionDecoder: io.circe.Decoder[models.AccountSetupInProgressException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.AccountSetupInProgressException.apply _)
  }
  final implicit val DiskMapDecoder: io.circe.Decoder[models.DiskMap] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("originalDiskPath"), o.get[scala.Option[java.lang.String]]("newDiskName")).mapN(models.DiskMap.apply _)
  }
  final implicit val GetInstancePortStatesRequestDecoder: io.circe.Decoder[models.GetInstancePortStatesRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.GetInstancePortStatesRequest.apply _)
  }
  final implicit val DeleteInstanceRequestDecoder: io.circe.Decoder[models.DeleteInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.DeleteInstanceRequest.apply _)
  }
  final implicit val ResourceLocationDecoder: io.circe.Decoder[models.ResourceLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("availabilityZone"), o.get[scala.Option[java.lang.String]]("regionName")).mapN(models.ResourceLocation.apply _)
  }
  final implicit val DomainDecoder: io.circe.Decoder[models.Domain] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.DomainEntry]]]("domainEntries"), o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.time.Instant]]("createdAt")).mapN(models.Domain.apply _)
  }
  final implicit val GetKeyPairsRequestDecoder: io.circe.Decoder[models.GetKeyPairsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetKeyPairsRequest.apply _)
  }
  final implicit val CreateDiskSnapshotRequestDecoder: io.circe.Decoder[models.CreateDiskSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("diskSnapshotName")).mapN(models.CreateDiskSnapshotRequest.apply _)
  }
  final implicit val GetStaticIpResultDecoder: io.circe.Decoder[models.GetStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.StaticIp]]("staticIp").map(models.GetStaticIpResult.apply _)
  }
  final implicit val DeleteKeyPairRequestDecoder: io.circe.Decoder[models.DeleteKeyPairRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("keyPairName").map(models.DeleteKeyPairRequest.apply _)
  }
  final implicit val StopInstanceResultDecoder: io.circe.Decoder[models.StopInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.StopInstanceResult.apply _)
  }
  final implicit val DiskDecoder: io.circe.Decoder[models.Disk] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("path"), o.get[scala.Option[java.lang.String]]("attachmentState"), o.get[scala.Option[scala.Boolean]]("isSystemDisk"), o.get[scala.Option[scala.Boolean]]("isAttached"), o.get[scala.Option[scala.Int]]("sizeInGb"), o.get[scala.Option[scala.Int]]("iops"), o.get[scala.Option[scala.Int]]("gbInUse"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("attachedTo"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("state")).mapN(models.Disk.apply _)
  }
  final implicit val IsVpcPeeredResultDecoder: io.circe.Decoder[models.IsVpcPeeredResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("isPeered").map(models.IsVpcPeeredResult.apply _)
  }
  final implicit val GetDiskResultDecoder: io.circe.Decoder[models.GetDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Disk]]("disk").map(models.GetDiskResult.apply _)
  }
  final implicit val GetDomainRequestDecoder: io.circe.Decoder[models.GetDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("domainName").map(models.GetDomainRequest.apply _)
  }
  final implicit val DetachDiskResultDecoder: io.circe.Decoder[models.DetachDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.DetachDiskResult.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[models.ServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.ServiceException.apply _)
  }
  final implicit val CloseInstancePublicPortsResultDecoder: io.circe.Decoder[models.CloseInstancePublicPortsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.CloseInstancePublicPortsResult.apply _)
  }
  final implicit val CloseInstancePublicPortsRequestDecoder: io.circe.Decoder[models.CloseInstancePublicPortsRequest] = io.circe.Decoder.instance { o => 
    (o.get[models.PortInfo]("portInfo"), o.get[java.lang.String]("instanceName")).mapN(models.CloseInstancePublicPortsRequest.apply _)
  }
  final implicit val GetActiveNamesRequestDecoder: io.circe.Decoder[models.GetActiveNamesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetActiveNamesRequest.apply _)
  }
  final implicit val UnpeerVpcRequestDecoder: io.circe.Decoder[models.UnpeerVpcRequest.type] = io.circe.Decoder.decodeUnit.as(models.UnpeerVpcRequest)
  final implicit val GetDiskSnapshotsRequestDecoder: io.circe.Decoder[models.GetDiskSnapshotsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetDiskSnapshotsRequest.apply _)
  }
  final implicit val OperationDecoder: io.circe.Decoder[models.Operation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("operationDetails"), o.get[scala.Option[java.lang.String]]("errorCode"), o.get[scala.Option[java.lang.String]]("errorDetails"), o.get[scala.Option[scala.Boolean]]("isTerminal"), o.get[scala.Option[java.lang.String]]("resourceName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.time.Instant]]("statusChangedAt"), o.get[scala.Option[java.lang.String]]("operationType"), o.get[scala.Option[java.lang.String]]("status")).mapN(models.Operation.apply _)
  }
  final implicit val ReleaseStaticIpRequestDecoder: io.circe.Decoder[models.ReleaseStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(models.ReleaseStaticIpRequest.apply _)
  }
  final implicit val IsVpcPeeredRequestDecoder: io.circe.Decoder[models.IsVpcPeeredRequest.type] = io.circe.Decoder.decodeUnit.as(models.IsVpcPeeredRequest)
  final implicit val GetInstanceSnapshotsResultDecoder: io.circe.Decoder[models.GetInstanceSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.InstanceSnapshot]]]("instanceSnapshots"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetInstanceSnapshotsResult.apply _)
  }
  final implicit val InstancePortStateDecoder: io.circe.Decoder[models.InstancePortState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("fromPort"), o.get[scala.Option[scala.Int]]("toPort"), o.get[scala.Option[java.lang.String]]("protocol"), o.get[scala.Option[java.lang.String]]("state")).mapN(models.InstancePortState.apply _)
  }
  final implicit val GetInstancePortStatesResultDecoder: io.circe.Decoder[models.GetInstancePortStatesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.InstancePortState]]]("portStates").map(models.GetInstancePortStatesResult.apply _)
  }
  final implicit val GetBlueprintsResultDecoder: io.circe.Decoder[models.GetBlueprintsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Blueprint]]]("blueprints"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetBlueprintsResult.apply _)
  }
  final implicit val StaticIpDecoder: io.circe.Decoder[models.StaticIp] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[scala.Boolean]]("isAttached"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("attachedTo"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("ipAddress")).mapN(models.StaticIp.apply _)
  }
  final implicit val InstanceHardwareDecoder: io.circe.Decoder[models.InstanceHardware] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("cpuCount"), o.get[scala.Option[scala.List[models.Disk]]]("disks"), o.get[scala.Option[scala.Float]]("ramSizeInGb")).mapN(models.InstanceHardware.apply _)
  }
  final implicit val GetInstanceStateRequestDecoder: io.circe.Decoder[models.GetInstanceStateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.GetInstanceStateRequest.apply _)
  }
  final implicit val RebootInstanceRequestDecoder: io.circe.Decoder[models.RebootInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.RebootInstanceRequest.apply _)
  }
  final implicit val GetInstancesResultDecoder: io.circe.Decoder[models.GetInstancesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Instance]]]("instances"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetInstancesResult.apply _)
  }
  final implicit val AvailabilityZoneDecoder: io.circe.Decoder[models.AvailabilityZone] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("zoneName"), o.get[scala.Option[java.lang.String]]("state")).mapN(models.AvailabilityZone.apply _)
  }
  final implicit val GetRegionsResultDecoder: io.circe.Decoder[models.GetRegionsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Region]]]("regions").map(models.GetRegionsResult.apply _)
  }
  final implicit val GetInstanceAccessDetailsRequestDecoder: io.circe.Decoder[models.GetInstanceAccessDetailsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceName"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(models.GetInstanceAccessDetailsRequest.apply _)
  }
  final implicit val ImportKeyPairRequestDecoder: io.circe.Decoder[models.ImportKeyPairRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("keyPairName"), o.get[java.lang.String]("publicKeyBase64")).mapN(models.ImportKeyPairRequest.apply _)
  }
  final implicit val CreateDiskSnapshotResultDecoder: io.circe.Decoder[models.CreateDiskSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.CreateDiskSnapshotResult.apply _)
  }
  final implicit val InstanceStateDecoder: io.circe.Decoder[models.InstanceState] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("code"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.InstanceState.apply _)
  }
  final implicit val GetInstanceMetricDataResultDecoder: io.circe.Decoder[models.GetInstanceMetricDataResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("metricName"), o.get[scala.Option[scala.List[models.MetricDatapoint]]]("metricData")).mapN(models.GetInstanceMetricDataResult.apply _)
  }
  final implicit val GetDiskSnapshotResultDecoder: io.circe.Decoder[models.GetDiskSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.DiskSnapshot]]("diskSnapshot").map(models.GetDiskSnapshotResult.apply _)
  }
  final implicit val CreateInstancesRequestDecoder: io.circe.Decoder[models.CreateInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("instanceNames"), o.get[java.lang.String]("availabilityZone"), o.get[java.lang.String]("blueprintId"), o.get[java.lang.String]("bundleId"), o.get[scala.Option[java.lang.String]]("userData"), o.get[scala.Option[java.lang.String]]("customImageName"), o.get[scala.Option[java.lang.String]]("keyPairName")).mapN(models.CreateInstancesRequest.apply _)
  }
  final implicit val GetBundlesRequestDecoder: io.circe.Decoder[models.GetBundlesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("includeInactive"), o.get[scala.Option[java.lang.String]]("pageToken")).mapN(models.GetBundlesRequest.apply _)
  }
  final implicit val DeleteInstanceResultDecoder: io.circe.Decoder[models.DeleteInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.DeleteInstanceResult.apply _)
  }
  final implicit val GetStaticIpsResultDecoder: io.circe.Decoder[models.GetStaticIpsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.StaticIp]]]("staticIps"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetStaticIpsResult.apply _)
  }
  final implicit val DeleteDomainEntryRequestDecoder: io.circe.Decoder[models.DeleteDomainEntryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domainName"), o.get[models.DomainEntry]("domainEntry")).mapN(models.DeleteDomainEntryRequest.apply _)
  }
  final implicit val DeleteDomainRequestDecoder: io.circe.Decoder[models.DeleteDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("domainName").map(models.DeleteDomainRequest.apply _)
  }
  final implicit val GetInstanceMetricDataRequestDecoder: io.circe.Decoder[models.GetInstanceMetricDataRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("metricName"), o.get[java.lang.String]("unit"), o.get[scala.List[java.lang.String]]("statistics"), o.get[java.lang.String]("instanceName"), o.get[java.time.Instant]("startTime"), o.get[java.time.Instant]("endTime"), o.get[scala.Int]("period")).mapN(models.GetInstanceMetricDataRequest.apply _)
  }
  final implicit val CreateKeyPairResultDecoder: io.circe.Decoder[models.CreateKeyPairResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.KeyPair]]("keyPair"), o.get[scala.Option[java.lang.String]]("publicKeyBase64"), o.get[scala.Option[java.lang.String]]("privateKeyBase64"), o.get[scala.Option[models.Operation]]("operation")).mapN(models.CreateKeyPairResult.apply _)
  }
  final implicit val CreateDomainResultDecoder: io.circe.Decoder[models.CreateDomainResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.CreateDomainResult.apply _)
  }
  final implicit val RegionDecoder: io.circe.Decoder[models.Region] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("continentCode"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("displayName"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[models.AvailabilityZone]]]("availabilityZones")).mapN(models.Region.apply _)
  }
  final implicit val DomainEntryDecoder: io.circe.Decoder[models.DomainEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("options"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("target"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.DomainEntry.apply _)
  }
  final implicit val GetActiveNamesResultDecoder: io.circe.Decoder[models.GetActiveNamesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("activeNames"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetActiveNamesResult.apply _)
  }
  final implicit val CreateKeyPairRequestDecoder: io.circe.Decoder[models.CreateKeyPairRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("keyPairName").map(models.CreateKeyPairRequest.apply _)
  }
  final implicit val AttachStaticIpResultDecoder: io.circe.Decoder[models.AttachStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.AttachStaticIpResult.apply _)
  }
  final implicit val GetDisksRequestDecoder: io.circe.Decoder[models.GetDisksRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetDisksRequest.apply _)
  }
  final implicit val UpdateDomainEntryResultDecoder: io.circe.Decoder[models.UpdateDomainEntryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.UpdateDomainEntryResult.apply _)
  }
  final implicit val CreateInstanceSnapshotResultDecoder: io.circe.Decoder[models.CreateInstanceSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.CreateInstanceSnapshotResult.apply _)
  }
  final implicit val CreateInstanceSnapshotRequestDecoder: io.circe.Decoder[models.CreateInstanceSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceSnapshotName"), o.get[java.lang.String]("instanceName")).mapN(models.CreateInstanceSnapshotRequest.apply _)
  }
  final implicit val DeleteDomainEntryResultDecoder: io.circe.Decoder[models.DeleteDomainEntryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.DeleteDomainEntryResult.apply _)
  }
  final implicit val DeleteDomainResultDecoder: io.circe.Decoder[models.DeleteDomainResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.DeleteDomainResult.apply _)
  }
  final implicit val DeleteInstanceSnapshotRequestDecoder: io.circe.Decoder[models.DeleteInstanceSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceSnapshotName").map(models.DeleteInstanceSnapshotRequest.apply _)
  }
  final implicit val AttachDiskResultDecoder: io.circe.Decoder[models.AttachDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.AttachDiskResult.apply _)
  }
  final implicit val OpenInstancePublicPortsResultDecoder: io.circe.Decoder[models.OpenInstancePublicPortsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.OpenInstancePublicPortsResult.apply _)
  }
  final implicit val GetInstanceSnapshotResultDecoder: io.circe.Decoder[models.GetInstanceSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.InstanceSnapshot]]("instanceSnapshot").map(models.GetInstanceSnapshotResult.apply _)
  }
  final implicit val DownloadDefaultKeyPairRequestDecoder: io.circe.Decoder[models.DownloadDefaultKeyPairRequest.type] = io.circe.Decoder.decodeUnit.as(models.DownloadDefaultKeyPairRequest)
  final implicit val GetKeyPairsResultDecoder: io.circe.Decoder[models.GetKeyPairsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.KeyPair]]]("keyPairs"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetKeyPairsResult.apply _)
  }
  final implicit val CreateInstancesFromSnapshotRequestDecoder: io.circe.Decoder[models.CreateInstancesFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("bundleId"), o.get[java.lang.String]("availabilityZone"), o.get[scala.List[java.lang.String]]("instanceNames"), o.get[java.lang.String]("instanceSnapshotName"), o.get[scala.Option[java.lang.String]]("userData"), o.get[scala.Option[java.lang.String]]("keyPairName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[models.DiskMap]]]]("attachedDiskMapping")).mapN(models.CreateInstancesFromSnapshotRequest.apply _)
  }
  final implicit val StartInstanceResultDecoder: io.circe.Decoder[models.StartInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.StartInstanceResult.apply _)
  }
  final implicit val CreateDomainEntryResultDecoder: io.circe.Decoder[models.CreateDomainEntryResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.CreateDomainEntryResult.apply _)
  }
  final implicit val GetOperationsRequestDecoder: io.circe.Decoder[models.GetOperationsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetOperationsRequest.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.AccessDeniedException.apply _)
  }
  final implicit val StopInstanceRequestDecoder: io.circe.Decoder[models.StopInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceName"), o.get[scala.Option[scala.Boolean]]("force")).mapN(models.StopInstanceRequest.apply _)
  }
  final implicit val ReleaseStaticIpResultDecoder: io.circe.Decoder[models.ReleaseStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.ReleaseStaticIpResult.apply _)
  }
  final implicit val DeleteDiskResultDecoder: io.circe.Decoder[models.DeleteDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.DeleteDiskResult.apply _)
  }
  final implicit val RebootInstanceResultDecoder: io.circe.Decoder[models.RebootInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.RebootInstanceResult.apply _)
  }
  final implicit val UpdateDomainEntryRequestDecoder: io.circe.Decoder[models.UpdateDomainEntryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domainName"), o.get[models.DomainEntry]("domainEntry")).mapN(models.UpdateDomainEntryRequest.apply _)
  }
  final implicit val GetBlueprintsRequestDecoder: io.circe.Decoder[models.GetBlueprintsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("includeInactive"), o.get[scala.Option[java.lang.String]]("pageToken")).mapN(models.GetBlueprintsRequest.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.InvalidInputException.apply _)
  }
  final implicit val GetKeyPairRequestDecoder: io.circe.Decoder[models.GetKeyPairRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("keyPairName").map(models.GetKeyPairRequest.apply _)
  }
  final implicit val CreateDomainRequestDecoder: io.circe.Decoder[models.CreateDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("domainName").map(models.CreateDomainRequest.apply _)
  }
  final implicit val GetDiskSnapshotsResultDecoder: io.circe.Decoder[models.GetDiskSnapshotsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.DiskSnapshot]]]("diskSnapshots"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetDiskSnapshotsResult.apply _)
  }
  final implicit val GetOperationResultDecoder: io.circe.Decoder[models.GetOperationResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.GetOperationResult.apply _)
  }
  final implicit val GetInstanceResultDecoder: io.circe.Decoder[models.GetInstanceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Instance]]("instance").map(models.GetInstanceResult.apply _)
  }
  final implicit val GetInstancesRequestDecoder: io.circe.Decoder[models.GetInstancesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetInstancesRequest.apply _)
  }
  final implicit val CreateDiskRequestDecoder: io.circe.Decoder[models.CreateDiskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("availabilityZone"), o.get[scala.Int]("sizeInGb")).mapN(models.CreateDiskRequest.apply _)
  }
  final implicit val CreateDomainEntryRequestDecoder: io.circe.Decoder[models.CreateDomainEntryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("domainName"), o.get[models.DomainEntry]("domainEntry")).mapN(models.CreateDomainEntryRequest.apply _)
  }
  final implicit val CreateDiskResultDecoder: io.circe.Decoder[models.CreateDiskResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.CreateDiskResult.apply _)
  }
  final implicit val GetStaticIpsRequestDecoder: io.circe.Decoder[models.GetStaticIpsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetStaticIpsRequest.apply _)
  }
  final implicit val OpenInstancePublicPortsRequestDecoder: io.circe.Decoder[models.OpenInstancePublicPortsRequest] = io.circe.Decoder.instance { o => 
    (o.get[models.PortInfo]("portInfo"), o.get[java.lang.String]("instanceName")).mapN(models.OpenInstancePublicPortsRequest.apply _)
  }
  final implicit val KeyPairDecoder: io.circe.Decoder[models.KeyPair] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("fingerprint")).mapN(models.KeyPair.apply _)
  }
  final implicit val GetOperationRequestDecoder: io.circe.Decoder[models.GetOperationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("operationId").map(models.GetOperationRequest.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[models.NotFoundException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.NotFoundException.apply _)
  }
  final implicit val GetOperationsForResourceRequestDecoder: io.circe.Decoder[models.GetOperationsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceName"), o.get[scala.Option[java.lang.String]]("pageToken")).mapN(models.GetOperationsForResourceRequest.apply _)
  }
  final implicit val UnauthenticatedExceptionDecoder: io.circe.Decoder[models.UnauthenticatedException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.UnauthenticatedException.apply _)
  }
  final implicit val DeleteInstanceSnapshotResultDecoder: io.circe.Decoder[models.DeleteInstanceSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.DeleteInstanceSnapshotResult.apply _)
  }
  final implicit val MonthlyTransferDecoder: io.circe.Decoder[models.MonthlyTransfer] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("gbPerMonthAllocated").map(models.MonthlyTransfer.apply _)
  }
  final implicit val CreateInstancesFromSnapshotResultDecoder: io.circe.Decoder[models.CreateInstancesFromSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.CreateInstancesFromSnapshotResult.apply _)
  }
  final implicit val DownloadDefaultKeyPairResultDecoder: io.circe.Decoder[models.DownloadDefaultKeyPairResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("publicKeyBase64"), o.get[scala.Option[java.lang.String]]("privateKeyBase64")).mapN(models.DownloadDefaultKeyPairResult.apply _)
  }
  final implicit val DeleteDiskRequestDecoder: io.circe.Decoder[models.DeleteDiskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskName").map(models.DeleteDiskRequest.apply _)
  }
  final implicit val DetachStaticIpResultDecoder: io.circe.Decoder[models.DetachStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.DetachStaticIpResult.apply _)
  }
  final implicit val InstanceSnapshotDecoder: io.circe.Decoder[models.InstanceSnapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("fromInstanceArn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("state"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("progress"), o.get[scala.Option[java.lang.String]]("fromBlueprintId"), o.get[scala.Option[java.lang.String]]("fromBundleId"), o.get[scala.Option[scala.Int]]("sizeInGb"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("fromInstanceName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[scala.List[models.Disk]]]("fromAttachedDisks")).mapN(models.InstanceSnapshot.apply _)
  }
  final implicit val DetachStaticIpRequestDecoder: io.circe.Decoder[models.DetachStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(models.DetachStaticIpRequest.apply _)
  }
  final implicit val StartInstanceRequestDecoder: io.circe.Decoder[models.StartInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.StartInstanceRequest.apply _)
  }
  final implicit val GetInstanceSnapshotRequestDecoder: io.circe.Decoder[models.GetInstanceSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceSnapshotName").map(models.GetInstanceSnapshotRequest.apply _)
  }
  final implicit val AllocateStaticIpRequestDecoder: io.circe.Decoder[models.AllocateStaticIpRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("staticIpName").map(models.AllocateStaticIpRequest.apply _)
  }
  final implicit val PeerVpcRequestDecoder: io.circe.Decoder[models.PeerVpcRequest.type] = io.circe.Decoder.decodeUnit.as(models.PeerVpcRequest)
  final implicit val PortInfoDecoder: io.circe.Decoder[models.PortInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("fromPort"), o.get[scala.Option[scala.Int]]("toPort"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(models.PortInfo.apply _)
  }
  final implicit val DetachDiskRequestDecoder: io.circe.Decoder[models.DetachDiskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskName").map(models.DetachDiskRequest.apply _)
  }
  final implicit val BlueprintDecoder: io.circe.Decoder[models.Blueprint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("blueprintId"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[java.lang.String]]("versionCode"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("productUrl"), o.get[scala.Option[java.lang.String]]("licenseUrl"), o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[scala.Boolean]]("isActive"), o.get[scala.Option[scala.Int]]("minPower"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.Blueprint.apply _)
  }
  final implicit val GetDomainsResultDecoder: io.circe.Decoder[models.GetDomainsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Domain]]]("domains"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetDomainsResult.apply _)
  }
  final implicit val InstancePortInfoDecoder: io.circe.Decoder[models.InstancePortInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("fromPort"), o.get[scala.Option[scala.Int]]("toPort"), o.get[scala.Option[java.lang.String]]("accessFrom"), o.get[scala.Option[java.lang.String]]("commonName"), o.get[scala.Option[java.lang.String]]("accessDirection"), o.get[scala.Option[java.lang.String]]("accessType"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(models.InstancePortInfo.apply _)
  }
  final implicit val CreateDiskFromSnapshotRequestDecoder: io.circe.Decoder[models.CreateDiskFromSnapshotRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("diskSnapshotName"), o.get[java.lang.String]("availabilityZone"), o.get[scala.Int]("sizeInGb")).mapN(models.CreateDiskFromSnapshotRequest.apply _)
  }
  final implicit val GetDomainsRequestDecoder: io.circe.Decoder[models.GetDomainsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetDomainsRequest.apply _)
  }
  final implicit val GetInstanceStateResultDecoder: io.circe.Decoder[models.GetInstanceStateResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.InstanceState]]("state").map(models.GetInstanceStateResult.apply _)
  }
  final implicit val DeleteKeyPairResultDecoder: io.circe.Decoder[models.DeleteKeyPairResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.DeleteKeyPairResult.apply _)
  }
  final implicit val PutInstancePublicPortsRequestDecoder: io.circe.Decoder[models.PutInstancePublicPortsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.PortInfo]]("portInfos"), o.get[java.lang.String]("instanceName")).mapN(models.PutInstancePublicPortsRequest.apply _)
  }
  final implicit val AttachDiskRequestDecoder: io.circe.Decoder[models.AttachDiskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("diskName"), o.get[java.lang.String]("instanceName"), o.get[java.lang.String]("diskPath")).mapN(models.AttachDiskRequest.apply _)
  }
  final implicit val BundleDecoder: io.circe.Decoder[models.Bundle] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("price"), o.get[scala.Option[scala.Float]]("ramSizeInGb"), o.get[scala.Option[scala.List[java.lang.String]]]("supportedPlatforms"), o.get[scala.Option[java.lang.String]]("bundleId"), o.get[scala.Option[java.lang.String]]("instanceType"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Boolean]]("isActive"), o.get[scala.Option[scala.Int]]("cpuCount"), o.get[scala.Option[scala.Int]]("diskSizeInGb"), o.get[scala.Option[scala.Int]]("power"), o.get[scala.Option[scala.Int]]("transferPerMonthInGb")).mapN(models.Bundle.apply _)
  }
  final implicit val GetBundlesResultDecoder: io.circe.Decoder[models.GetBundlesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Bundle]]]("bundles"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetBundlesResult.apply _)
  }
  final implicit val GetInstanceSnapshotsRequestDecoder: io.circe.Decoder[models.GetInstanceSnapshotsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pageToken").map(models.GetInstanceSnapshotsRequest.apply _)
  }
  final implicit val UnpeerVpcResultDecoder: io.circe.Decoder[models.UnpeerVpcResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.UnpeerVpcResult.apply _)
  }
  final implicit val CreateInstancesResultDecoder: io.circe.Decoder[models.CreateInstancesResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.CreateInstancesResult.apply _)
  }
  final implicit val PutInstancePublicPortsResultDecoder: io.circe.Decoder[models.PutInstancePublicPortsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.PutInstancePublicPortsResult.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[models.Instance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ipv6Address"), o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("bundleId"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("username"), o.get[scala.Option[java.lang.String]]("blueprintName"), o.get[scala.Option[java.lang.String]]("blueprintId"), o.get[scala.Option[models.InstanceHardware]]("hardware"), o.get[scala.Option[models.InstanceState]]("state"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[scala.Boolean]]("isStaticIp"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("sshKeyName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[models.InstanceNetworking]]("networking"), o.get[scala.Option[java.lang.String]]("privateIpAddress"), o.get[scala.Option[java.lang.String]]("publicIpAddress")).mapN(models.Instance.apply _)
  }
  final implicit val GetOperationsResultDecoder: io.circe.Decoder[models.GetOperationsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Operation]]]("operations"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetOperationsResult.apply _)
  }
  final implicit val OperationFailureExceptionDecoder: io.circe.Decoder[models.OperationFailureException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("docs"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("tip")).mapN(models.OperationFailureException.apply _)
  }
  final implicit val DeleteDiskSnapshotResultDecoder: io.circe.Decoder[models.DeleteDiskSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.DeleteDiskSnapshotResult.apply _)
  }
  final implicit val GetOperationsForResourceResultDecoder: io.circe.Decoder[models.GetOperationsForResourceResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Operation]]]("operations"), o.get[scala.Option[java.lang.String]]("nextPageCount"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetOperationsForResourceResult.apply _)
  }
  final implicit val PasswordDataDecoder: io.circe.Decoder[models.PasswordData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ciphertext"), o.get[scala.Option[java.lang.String]]("keyPairName")).mapN(models.PasswordData.apply _)
  }
  final implicit val ImportKeyPairResultDecoder: io.circe.Decoder[models.ImportKeyPairResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.ImportKeyPairResult.apply _)
  }
  final implicit val GetKeyPairResultDecoder: io.circe.Decoder[models.GetKeyPairResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.KeyPair]]("keyPair").map(models.GetKeyPairResult.apply _)
  }
  final implicit val AllocateStaticIpResultDecoder: io.circe.Decoder[models.AllocateStaticIpResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.AllocateStaticIpResult.apply _)
  }
  final implicit val InstanceNetworkingDecoder: io.circe.Decoder[models.InstanceNetworking] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.MonthlyTransfer]]("monthlyTransfer"), o.get[scala.Option[scala.List[models.InstancePortInfo]]]("ports")).mapN(models.InstanceNetworking.apply _)
  }
  final implicit val GetDisksResultDecoder: io.circe.Decoder[models.GetDisksResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Disk]]]("disks"), o.get[scala.Option[java.lang.String]]("nextPageToken")).mapN(models.GetDisksResult.apply _)
  }
  final implicit val MetricDatapointDecoder: io.circe.Decoder[models.MetricDatapoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("minimum"), o.get[scala.Option[scala.Double]]("average"), o.get[scala.Option[scala.Double]]("sum"), o.get[scala.Option[scala.Double]]("sampleCount"), o.get[scala.Option[scala.Double]]("maximum"), o.get[scala.Option[java.time.Instant]]("timestamp"), o.get[scala.Option[java.lang.String]]("unit")).mapN(models.MetricDatapoint.apply _)
  }
  final implicit val AttachStaticIpRequestDecoder: io.circe.Decoder[models.AttachStaticIpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("staticIpName"), o.get[java.lang.String]("instanceName")).mapN(models.AttachStaticIpRequest.apply _)
  }
  final implicit val GetInstanceRequestDecoder: io.circe.Decoder[models.GetInstanceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.GetInstanceRequest.apply _)
  }
  final implicit val PeerVpcResultDecoder: io.circe.Decoder[models.PeerVpcResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Operation]]("operation").map(models.PeerVpcResult.apply _)
  }
  final implicit val GetDiskRequestDecoder: io.circe.Decoder[models.GetDiskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskName").map(models.GetDiskRequest.apply _)
  }
  final implicit val InstanceAccessDetailsDecoder: io.circe.Decoder[models.InstanceAccessDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("certKey"), o.get[scala.Option[java.lang.String]]("password"), o.get[scala.Option[java.lang.String]]("privateKey"), o.get[scala.Option[java.lang.String]]("username"), o.get[scala.Option[java.lang.String]]("protocol"), o.get[scala.Option[java.lang.String]]("instanceName"), o.get[scala.Option[java.time.Instant]]("expiresAt"), o.get[scala.Option[models.PasswordData]]("passwordData"), o.get[scala.Option[java.lang.String]]("ipAddress")).mapN(models.InstanceAccessDetails.apply _)
  }
  final implicit val GetInstanceAccessDetailsResultDecoder: io.circe.Decoder[models.GetInstanceAccessDetailsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.InstanceAccessDetails]]("accessDetails").map(models.GetInstanceAccessDetailsResult.apply _)
  }
  final implicit val DiskSnapshotDecoder: io.circe.Decoder[models.DiskSnapshot] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResourceLocation]]("location"), o.get[scala.Option[java.lang.String]]("state"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("fromDiskArn"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("supportCode"), o.get[scala.Option[java.lang.String]]("progress"), o.get[scala.Option[scala.Int]]("sizeInGb"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("fromDiskName"), o.get[scala.Option[java.time.Instant]]("createdAt")).mapN(models.DiskSnapshot.apply _)
  }
  final implicit val DeleteDiskSnapshotRequestDecoder: io.circe.Decoder[models.DeleteDiskSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskSnapshotName").map(models.DeleteDiskSnapshotRequest.apply _)
  }
  final implicit val CreateDiskFromSnapshotResultDecoder: io.circe.Decoder[models.CreateDiskFromSnapshotResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Operation]]]("operations").map(models.CreateDiskFromSnapshotResult.apply _)
  }
  final implicit val GetDiskSnapshotRequestDecoder: io.circe.Decoder[models.GetDiskSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("diskSnapshotName").map(models.GetDiskSnapshotRequest.apply _)
  }
}