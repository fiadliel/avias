package avias.lightsail
trait Amazonlightsail[F[_]] {
  def deleteInstance(input: avias.lightsail.models.DeleteInstanceRequest): F[avias.lightsail.models.DeleteInstanceResult]
  def deleteDomainEntry(input: avias.lightsail.models.DeleteDomainEntryRequest): F[avias.lightsail.models.DeleteDomainEntryResult]
  def createDomainEntry(input: avias.lightsail.models.CreateDomainEntryRequest): F[avias.lightsail.models.CreateDomainEntryResult]
  def allocateStaticIp(input: avias.lightsail.models.AllocateStaticIpRequest): F[avias.lightsail.models.AllocateStaticIpResult]
  def attachDisk(input: avias.lightsail.models.AttachDiskRequest): F[avias.lightsail.models.AttachDiskResult]
  def createDiskFromSnapshot(input: avias.lightsail.models.CreateDiskFromSnapshotRequest): F[avias.lightsail.models.CreateDiskFromSnapshotResult]
  def createInstancesFromSnapshot(input: avias.lightsail.models.CreateInstancesFromSnapshotRequest): F[avias.lightsail.models.CreateInstancesFromSnapshotResult]
  def getInstanceAccessDetails(input: avias.lightsail.models.GetInstanceAccessDetailsRequest): F[avias.lightsail.models.GetInstanceAccessDetailsResult]
  def getInstances(input: avias.lightsail.models.GetInstancesRequest): F[avias.lightsail.models.GetInstancesResult]
  def getKeyPair(input: avias.lightsail.models.GetKeyPairRequest): F[avias.lightsail.models.GetKeyPairResult]
  def unpeerVpc: F[avias.lightsail.models.UnpeerVpcResult]
  def getDomains(input: avias.lightsail.models.GetDomainsRequest): F[avias.lightsail.models.GetDomainsResult]
  def deleteDiskSnapshot(input: avias.lightsail.models.DeleteDiskSnapshotRequest): F[avias.lightsail.models.DeleteDiskSnapshotResult]
  def closeInstancePublicPorts(input: avias.lightsail.models.CloseInstancePublicPortsRequest): F[avias.lightsail.models.CloseInstancePublicPortsResult]
  def getDisks(input: avias.lightsail.models.GetDisksRequest): F[avias.lightsail.models.GetDisksResult]
  def putInstancePublicPorts(input: avias.lightsail.models.PutInstancePublicPortsRequest): F[avias.lightsail.models.PutInstancePublicPortsResult]
  def createDiskSnapshot(input: avias.lightsail.models.CreateDiskSnapshotRequest): F[avias.lightsail.models.CreateDiskSnapshotResult]
  def getInstanceSnapshot(input: avias.lightsail.models.GetInstanceSnapshotRequest): F[avias.lightsail.models.GetInstanceSnapshotResult]
  def updateDomainEntry(input: avias.lightsail.models.UpdateDomainEntryRequest): F[avias.lightsail.models.UpdateDomainEntryResult]
  def deleteDomain(input: avias.lightsail.models.DeleteDomainRequest): F[avias.lightsail.models.DeleteDomainResult]
  def getOperation(input: avias.lightsail.models.GetOperationRequest): F[avias.lightsail.models.GetOperationResult]
  def openInstancePublicPorts(input: avias.lightsail.models.OpenInstancePublicPortsRequest): F[avias.lightsail.models.OpenInstancePublicPortsResult]
  def getInstancePortStates(input: avias.lightsail.models.GetInstancePortStatesRequest): F[avias.lightsail.models.GetInstancePortStatesResult]
  def getOperationsForResource(input: avias.lightsail.models.GetOperationsForResourceRequest): F[avias.lightsail.models.GetOperationsForResourceResult]
  def peerVpc: F[avias.lightsail.models.PeerVpcResult]
  def createInstances(input: avias.lightsail.models.CreateInstancesRequest): F[avias.lightsail.models.CreateInstancesResult]
  def getOperations(input: avias.lightsail.models.GetOperationsRequest): F[avias.lightsail.models.GetOperationsResult]
  def getStaticIp(input: avias.lightsail.models.GetStaticIpRequest): F[avias.lightsail.models.GetStaticIpResult]
  def detachDisk(input: avias.lightsail.models.DetachDiskRequest): F[avias.lightsail.models.DetachDiskResult]
  def rebootInstance(input: avias.lightsail.models.RebootInstanceRequest): F[avias.lightsail.models.RebootInstanceResult]
  def createInstanceSnapshot(input: avias.lightsail.models.CreateInstanceSnapshotRequest): F[avias.lightsail.models.CreateInstanceSnapshotResult]
  def getDiskSnapshot(input: avias.lightsail.models.GetDiskSnapshotRequest): F[avias.lightsail.models.GetDiskSnapshotResult]
  def getKeyPairs(input: avias.lightsail.models.GetKeyPairsRequest): F[avias.lightsail.models.GetKeyPairsResult]
  def deleteDisk(input: avias.lightsail.models.DeleteDiskRequest): F[avias.lightsail.models.DeleteDiskResult]
  def getRegions(input: avias.lightsail.models.GetRegionsRequest): F[avias.lightsail.models.GetRegionsResult]
  def detachStaticIp(input: avias.lightsail.models.DetachStaticIpRequest): F[avias.lightsail.models.DetachStaticIpResult]
  def createKeyPair(input: avias.lightsail.models.CreateKeyPairRequest): F[avias.lightsail.models.CreateKeyPairResult]
  def isVpcPeered: F[avias.lightsail.models.IsVpcPeeredResult]
  def importKeyPair(input: avias.lightsail.models.ImportKeyPairRequest): F[avias.lightsail.models.ImportKeyPairResult]
  def deleteInstanceSnapshot(input: avias.lightsail.models.DeleteInstanceSnapshotRequest): F[avias.lightsail.models.DeleteInstanceSnapshotResult]
  def deleteKeyPair(input: avias.lightsail.models.DeleteKeyPairRequest): F[avias.lightsail.models.DeleteKeyPairResult]
  def getStaticIps(input: avias.lightsail.models.GetStaticIpsRequest): F[avias.lightsail.models.GetStaticIpsResult]
  def getInstanceState(input: avias.lightsail.models.GetInstanceStateRequest): F[avias.lightsail.models.GetInstanceStateResult]
  def getActiveNames(input: avias.lightsail.models.GetActiveNamesRequest): F[avias.lightsail.models.GetActiveNamesResult]
  def downloadDefaultKeyPair: F[avias.lightsail.models.DownloadDefaultKeyPairResult]
  def createDisk(input: avias.lightsail.models.CreateDiskRequest): F[avias.lightsail.models.CreateDiskResult]
  def getBundles(input: avias.lightsail.models.GetBundlesRequest): F[avias.lightsail.models.GetBundlesResult]
  def releaseStaticIp(input: avias.lightsail.models.ReleaseStaticIpRequest): F[avias.lightsail.models.ReleaseStaticIpResult]
  def getDiskSnapshots(input: avias.lightsail.models.GetDiskSnapshotsRequest): F[avias.lightsail.models.GetDiskSnapshotsResult]
  def getDomain(input: avias.lightsail.models.GetDomainRequest): F[avias.lightsail.models.GetDomainResult]
  def startInstance(input: avias.lightsail.models.StartInstanceRequest): F[avias.lightsail.models.StartInstanceResult]
  def stopInstance(input: avias.lightsail.models.StopInstanceRequest): F[avias.lightsail.models.StopInstanceResult]
  def getDisk(input: avias.lightsail.models.GetDiskRequest): F[avias.lightsail.models.GetDiskResult]
  def getInstanceSnapshots(input: avias.lightsail.models.GetInstanceSnapshotsRequest): F[avias.lightsail.models.GetInstanceSnapshotsResult]
  def createDomain(input: avias.lightsail.models.CreateDomainRequest): F[avias.lightsail.models.CreateDomainResult]
  def getInstanceMetricData(input: avias.lightsail.models.GetInstanceMetricDataRequest): F[avias.lightsail.models.GetInstanceMetricDataResult]
  def attachStaticIp(input: avias.lightsail.models.AttachStaticIpRequest): F[avias.lightsail.models.AttachStaticIpResult]
  def getInstance(input: avias.lightsail.models.GetInstanceRequest): F[avias.lightsail.models.GetInstanceResult]
  def getBlueprints(input: avias.lightsail.models.GetBlueprintsRequest): F[avias.lightsail.models.GetBlueprintsResult]
}