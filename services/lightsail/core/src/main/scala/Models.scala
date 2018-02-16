package avias.lightsail.models
final case class GetStaticIpRequest(staticIpName: java.lang.String)
final case class GetRegionsRequest(includeAvailabilityZones: scala.Option[scala.Boolean] = scala.None)
final case class GetDomainResult(domain: scala.Option[avias.lightsail.models.Domain] = scala.None)
final case class AccountSetupInProgressException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class DiskMap(originalDiskPath: scala.Option[java.lang.String] = scala.None, newDiskName: scala.Option[java.lang.String] = scala.None)
final case class GetInstancePortStatesRequest(instanceName: java.lang.String)
final case class DeleteInstanceRequest(instanceName: java.lang.String)
final case class ResourceLocation(availabilityZone: scala.Option[java.lang.String] = scala.None, regionName: scala.Option[java.lang.String] = scala.None)
final case class Domain(domainEntries: scala.Option[scala.List[avias.lightsail.models.DomainEntry]] = scala.None, location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, arn: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None)
final case class GetKeyPairsRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class CreateDiskSnapshotRequest(diskName: java.lang.String, diskSnapshotName: java.lang.String)
final case class GetStaticIpResult(staticIp: scala.Option[avias.lightsail.models.StaticIp] = scala.None)
final case class DeleteKeyPairRequest(keyPairName: java.lang.String)
final case class StopInstanceResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class Disk(location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, arn: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, path: scala.Option[java.lang.String] = scala.None, attachmentState: scala.Option[java.lang.String] = scala.None, isSystemDisk: scala.Option[scala.Boolean] = scala.None, isAttached: scala.Option[scala.Boolean] = scala.None, sizeInGb: scala.Option[scala.Int] = scala.None, iops: scala.Option[scala.Int] = scala.None, gbInUse: scala.Option[scala.Int] = scala.None, name: scala.Option[java.lang.String] = scala.None, attachedTo: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, state: scala.Option[java.lang.String] = scala.None)
final case class IsVpcPeeredResult(isPeered: scala.Option[scala.Boolean] = scala.None)
final case class GetDiskResult(disk: scala.Option[avias.lightsail.models.Disk] = scala.None)
final case class GetDomainRequest(domainName: java.lang.String)
final case class DetachDiskResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class ServiceException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class CloseInstancePublicPortsResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class CloseInstancePublicPortsRequest(portInfo: avias.lightsail.models.PortInfo, instanceName: java.lang.String)
final case class GetActiveNamesRequest(pageToken: scala.Option[java.lang.String] = scala.None)
case object UnpeerVpcRequest
final case class GetDiskSnapshotsRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class Operation(location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, id: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, operationDetails: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorDetails: scala.Option[java.lang.String] = scala.None, isTerminal: scala.Option[scala.Boolean] = scala.None, resourceName: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, statusChangedAt: scala.Option[java.time.Instant] = scala.None, operationType: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class ReleaseStaticIpRequest(staticIpName: java.lang.String)
case object IsVpcPeeredRequest
final case class GetInstanceSnapshotsResult(instanceSnapshots: scala.Option[scala.List[avias.lightsail.models.InstanceSnapshot]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class InstancePortState(fromPort: scala.Option[scala.Int] = scala.None, toPort: scala.Option[scala.Int] = scala.None, protocol: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None)
final case class GetInstancePortStatesResult(portStates: scala.Option[scala.List[avias.lightsail.models.InstancePortState]] = scala.None)
final case class GetBlueprintsResult(blueprints: scala.Option[scala.List[avias.lightsail.models.Blueprint]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class StaticIp(location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, arn: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, isAttached: scala.Option[scala.Boolean] = scala.None, name: scala.Option[java.lang.String] = scala.None, attachedTo: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, ipAddress: scala.Option[java.lang.String] = scala.None)
final case class InstanceHardware(cpuCount: scala.Option[scala.Int] = scala.None, disks: scala.Option[scala.List[avias.lightsail.models.Disk]] = scala.None, ramSizeInGb: scala.Option[scala.Float] = scala.None)
final case class GetInstanceStateRequest(instanceName: java.lang.String)
final case class RebootInstanceRequest(instanceName: java.lang.String)
final case class GetInstancesResult(instances: scala.Option[scala.List[avias.lightsail.models.Instance]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class AvailabilityZone(zoneName: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None)
final case class GetRegionsResult(regions: scala.Option[scala.List[avias.lightsail.models.Region]] = scala.None)
final case class GetInstanceAccessDetailsRequest(instanceName: java.lang.String, protocol: scala.Option[java.lang.String] = scala.None)
final case class ImportKeyPairRequest(keyPairName: java.lang.String, publicKeyBase64: java.lang.String)
final case class CreateDiskSnapshotResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class InstanceState(code: scala.Option[scala.Int] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class GetInstanceMetricDataResult(metricName: scala.Option[java.lang.String] = scala.None, metricData: scala.Option[scala.List[avias.lightsail.models.MetricDatapoint]] = scala.None)
final case class GetDiskSnapshotResult(diskSnapshot: scala.Option[avias.lightsail.models.DiskSnapshot] = scala.None)
final case class CreateInstancesRequest(instanceNames: scala.List[java.lang.String], availabilityZone: java.lang.String, blueprintId: java.lang.String, bundleId: java.lang.String, userData: scala.Option[java.lang.String] = scala.None, customImageName: scala.Option[java.lang.String] = scala.None, keyPairName: scala.Option[java.lang.String] = scala.None)
final case class GetBundlesRequest(includeInactive: scala.Option[scala.Boolean] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteInstanceResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class GetStaticIpsResult(staticIps: scala.Option[scala.List[avias.lightsail.models.StaticIp]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteDomainEntryRequest(domainName: java.lang.String, domainEntry: avias.lightsail.models.DomainEntry)
final case class DeleteDomainRequest(domainName: java.lang.String)
final case class GetInstanceMetricDataRequest(metricName: java.lang.String, unit: java.lang.String, statistics: scala.List[java.lang.String], instanceName: java.lang.String, startTime: java.time.Instant, endTime: java.time.Instant, period: scala.Int)
final case class CreateKeyPairResult(keyPair: scala.Option[avias.lightsail.models.KeyPair] = scala.None, publicKeyBase64: scala.Option[java.lang.String] = scala.None, privateKeyBase64: scala.Option[java.lang.String] = scala.None, operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class CreateDomainResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class Region(continentCode: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, displayName: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, availabilityZones: scala.Option[scala.List[avias.lightsail.models.AvailabilityZone]] = scala.None)
final case class DomainEntry(options: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, id: scala.Option[java.lang.String] = scala.None, target: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class GetActiveNamesResult(activeNames: scala.Option[scala.List[java.lang.String]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class CreateKeyPairRequest(keyPairName: java.lang.String)
final case class AttachStaticIpResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class GetDisksRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateDomainEntryResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class CreateInstanceSnapshotResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class CreateInstanceSnapshotRequest(instanceSnapshotName: java.lang.String, instanceName: java.lang.String)
final case class DeleteDomainEntryResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class DeleteDomainResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class DeleteInstanceSnapshotRequest(instanceSnapshotName: java.lang.String)
final case class AttachDiskResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class OpenInstancePublicPortsResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class GetInstanceSnapshotResult(instanceSnapshot: scala.Option[avias.lightsail.models.InstanceSnapshot] = scala.None)
case object DownloadDefaultKeyPairRequest
final case class GetKeyPairsResult(keyPairs: scala.Option[scala.List[avias.lightsail.models.KeyPair]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class CreateInstancesFromSnapshotRequest(bundleId: java.lang.String, availabilityZone: java.lang.String, instanceNames: scala.List[java.lang.String], instanceSnapshotName: java.lang.String, userData: scala.Option[java.lang.String] = scala.None, keyPairName: scala.Option[java.lang.String] = scala.None, attachedDiskMapping: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[avias.lightsail.models.DiskMap]]] = scala.None)
final case class StartInstanceResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class CreateDomainEntryResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class GetOperationsRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class AccessDeniedException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class StopInstanceRequest(instanceName: java.lang.String, force: scala.Option[scala.Boolean] = scala.None)
final case class ReleaseStaticIpResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class DeleteDiskResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class RebootInstanceResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class UpdateDomainEntryRequest(domainName: java.lang.String, domainEntry: avias.lightsail.models.DomainEntry)
final case class GetBlueprintsRequest(includeInactive: scala.Option[scala.Boolean] = scala.None, pageToken: scala.Option[java.lang.String] = scala.None)
final case class InvalidInputException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class GetKeyPairRequest(keyPairName: java.lang.String)
final case class CreateDomainRequest(domainName: java.lang.String)
final case class GetDiskSnapshotsResult(diskSnapshots: scala.Option[scala.List[avias.lightsail.models.DiskSnapshot]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class GetOperationResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class GetInstanceResult(instance: scala.Option[avias.lightsail.models.Instance] = scala.None)
final case class GetInstancesRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class CreateDiskRequest(diskName: java.lang.String, availabilityZone: java.lang.String, sizeInGb: scala.Int)
final case class CreateDomainEntryRequest(domainName: java.lang.String, domainEntry: avias.lightsail.models.DomainEntry)
final case class CreateDiskResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class GetStaticIpsRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class OpenInstancePublicPortsRequest(portInfo: avias.lightsail.models.PortInfo, instanceName: java.lang.String)
final case class KeyPair(location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, arn: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, fingerprint: scala.Option[java.lang.String] = scala.None)
final case class GetOperationRequest(operationId: java.lang.String)
final case class NotFoundException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class GetOperationsForResourceRequest(resourceName: java.lang.String, pageToken: scala.Option[java.lang.String] = scala.None)
final case class UnauthenticatedException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class DeleteInstanceSnapshotResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class MonthlyTransfer(gbPerMonthAllocated: scala.Option[scala.Int] = scala.None)
final case class CreateInstancesFromSnapshotResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class DownloadDefaultKeyPairResult(publicKeyBase64: scala.Option[java.lang.String] = scala.None, privateKeyBase64: scala.Option[java.lang.String] = scala.None)
final case class DeleteDiskRequest(diskName: java.lang.String)
final case class DetachStaticIpResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class InstanceSnapshot(location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, arn: scala.Option[java.lang.String] = scala.None, fromInstanceArn: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, progress: scala.Option[java.lang.String] = scala.None, fromBlueprintId: scala.Option[java.lang.String] = scala.None, fromBundleId: scala.Option[java.lang.String] = scala.None, sizeInGb: scala.Option[scala.Int] = scala.None, name: scala.Option[java.lang.String] = scala.None, fromInstanceName: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, fromAttachedDisks: scala.Option[scala.List[avias.lightsail.models.Disk]] = scala.None)
final case class DetachStaticIpRequest(staticIpName: java.lang.String)
final case class StartInstanceRequest(instanceName: java.lang.String)
final case class GetInstanceSnapshotRequest(instanceSnapshotName: java.lang.String)
final case class AllocateStaticIpRequest(staticIpName: java.lang.String)
case object PeerVpcRequest
final case class PortInfo(fromPort: scala.Option[scala.Int] = scala.None, toPort: scala.Option[scala.Int] = scala.None, protocol: scala.Option[java.lang.String] = scala.None)
final case class DetachDiskRequest(diskName: java.lang.String)
final case class Blueprint(`type`: scala.Option[java.lang.String] = scala.None, blueprintId: scala.Option[java.lang.String] = scala.None, group: scala.Option[java.lang.String] = scala.None, versionCode: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, productUrl: scala.Option[java.lang.String] = scala.None, licenseUrl: scala.Option[java.lang.String] = scala.None, version: scala.Option[java.lang.String] = scala.None, platform: scala.Option[java.lang.String] = scala.None, isActive: scala.Option[scala.Boolean] = scala.None, minPower: scala.Option[scala.Int] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class GetDomainsResult(domains: scala.Option[scala.List[avias.lightsail.models.Domain]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class InstancePortInfo(fromPort: scala.Option[scala.Int] = scala.None, toPort: scala.Option[scala.Int] = scala.None, accessFrom: scala.Option[java.lang.String] = scala.None, commonName: scala.Option[java.lang.String] = scala.None, accessDirection: scala.Option[java.lang.String] = scala.None, accessType: scala.Option[java.lang.String] = scala.None, protocol: scala.Option[java.lang.String] = scala.None)
final case class CreateDiskFromSnapshotRequest(diskName: java.lang.String, diskSnapshotName: java.lang.String, availabilityZone: java.lang.String, sizeInGb: scala.Int)
final case class GetDomainsRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class GetInstanceStateResult(state: scala.Option[avias.lightsail.models.InstanceState] = scala.None)
final case class DeleteKeyPairResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class PutInstancePublicPortsRequest(portInfos: scala.List[avias.lightsail.models.PortInfo], instanceName: java.lang.String)
final case class AttachDiskRequest(diskName: java.lang.String, instanceName: java.lang.String, diskPath: java.lang.String)
final case class Bundle(price: scala.Option[scala.Float] = scala.None, ramSizeInGb: scala.Option[scala.Float] = scala.None, supportedPlatforms: scala.Option[scala.List[java.lang.String]] = scala.None, bundleId: scala.Option[java.lang.String] = scala.None, instanceType: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, isActive: scala.Option[scala.Boolean] = scala.None, cpuCount: scala.Option[scala.Int] = scala.None, diskSizeInGb: scala.Option[scala.Int] = scala.None, power: scala.Option[scala.Int] = scala.None, transferPerMonthInGb: scala.Option[scala.Int] = scala.None)
final case class GetBundlesResult(bundles: scala.Option[scala.List[avias.lightsail.models.Bundle]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class GetInstanceSnapshotsRequest(pageToken: scala.Option[java.lang.String] = scala.None)
final case class UnpeerVpcResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class CreateInstancesResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class PutInstancePublicPortsResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class Instance(ipv6Address: scala.Option[java.lang.String] = scala.None, location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, bundleId: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, username: scala.Option[java.lang.String] = scala.None, blueprintName: scala.Option[java.lang.String] = scala.None, blueprintId: scala.Option[java.lang.String] = scala.None, hardware: scala.Option[avias.lightsail.models.InstanceHardware] = scala.None, state: scala.Option[avias.lightsail.models.InstanceState] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, isStaticIp: scala.Option[scala.Boolean] = scala.None, name: scala.Option[java.lang.String] = scala.None, sshKeyName: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None, networking: scala.Option[avias.lightsail.models.InstanceNetworking] = scala.None, privateIpAddress: scala.Option[java.lang.String] = scala.None, publicIpAddress: scala.Option[java.lang.String] = scala.None)
final case class GetOperationsResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class OperationFailureException(code: scala.Option[java.lang.String] = scala.None, docs: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, tip: scala.Option[java.lang.String] = scala.None)
final case class DeleteDiskSnapshotResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class GetOperationsForResourceResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None, nextPageCount: scala.Option[java.lang.String] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class PasswordData(ciphertext: scala.Option[java.lang.String] = scala.None, keyPairName: scala.Option[java.lang.String] = scala.None)
final case class ImportKeyPairResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class GetKeyPairResult(keyPair: scala.Option[avias.lightsail.models.KeyPair] = scala.None)
final case class AllocateStaticIpResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class InstanceNetworking(monthlyTransfer: scala.Option[avias.lightsail.models.MonthlyTransfer] = scala.None, ports: scala.Option[scala.List[avias.lightsail.models.InstancePortInfo]] = scala.None)
final case class GetDisksResult(disks: scala.Option[scala.List[avias.lightsail.models.Disk]] = scala.None, nextPageToken: scala.Option[java.lang.String] = scala.None)
final case class MetricDatapoint(minimum: scala.Option[scala.Double] = scala.None, average: scala.Option[scala.Double] = scala.None, sum: scala.Option[scala.Double] = scala.None, sampleCount: scala.Option[scala.Double] = scala.None, maximum: scala.Option[scala.Double] = scala.None, timestamp: scala.Option[java.time.Instant] = scala.None, unit: scala.Option[java.lang.String] = scala.None)
final case class AttachStaticIpRequest(staticIpName: java.lang.String, instanceName: java.lang.String)
final case class GetInstanceRequest(instanceName: java.lang.String)
final case class PeerVpcResult(operation: scala.Option[avias.lightsail.models.Operation] = scala.None)
final case class GetDiskRequest(diskName: java.lang.String)
final case class InstanceAccessDetails(certKey: scala.Option[java.lang.String] = scala.None, password: scala.Option[java.lang.String] = scala.None, privateKey: scala.Option[java.lang.String] = scala.None, username: scala.Option[java.lang.String] = scala.None, protocol: scala.Option[java.lang.String] = scala.None, instanceName: scala.Option[java.lang.String] = scala.None, expiresAt: scala.Option[java.time.Instant] = scala.None, passwordData: scala.Option[avias.lightsail.models.PasswordData] = scala.None, ipAddress: scala.Option[java.lang.String] = scala.None)
final case class GetInstanceAccessDetailsResult(accessDetails: scala.Option[avias.lightsail.models.InstanceAccessDetails] = scala.None)
final case class DiskSnapshot(location: scala.Option[avias.lightsail.models.ResourceLocation] = scala.None, state: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, fromDiskArn: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, supportCode: scala.Option[java.lang.String] = scala.None, progress: scala.Option[java.lang.String] = scala.None, sizeInGb: scala.Option[scala.Int] = scala.None, name: scala.Option[java.lang.String] = scala.None, fromDiskName: scala.Option[java.lang.String] = scala.None, createdAt: scala.Option[java.time.Instant] = scala.None)
final case class DeleteDiskSnapshotRequest(diskSnapshotName: java.lang.String)
final case class CreateDiskFromSnapshotResult(operations: scala.Option[scala.List[avias.lightsail.models.Operation]] = scala.None)
final case class GetDiskSnapshotRequest(diskSnapshotName: java.lang.String)