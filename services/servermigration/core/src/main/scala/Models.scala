package org.lyranthe.araethura.servermigration.models
import org.lyranthe.araethura.servermigration.models
final case class ReplicationRun(scheduledStartTime: scala.Option[java.time.Instant] = None, completedTime: scala.Option[java.time.Instant] = None, replicationRunId: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, amiId: scala.Option[java.lang.String] = None, state: scala.Option[java.lang.String] = None, statusMessage: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
case object ImportServerCatalogRequest
final case class StartOnDemandReplicationRunResponse(replicationRunId: scala.Option[java.lang.String] = None)
final case class CreateReplicationJobRequest(seedReplicationTime: java.time.Instant, serverId: java.lang.String, frequency: scala.Int, roleName: scala.Option[java.lang.String] = None, licenseType: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class ReplicationJobNotFoundException(message: scala.Option[java.lang.String] = None)
final case class MissingRequiredParameterException(message: scala.Option[java.lang.String] = None)
final case class Server(replicationJobTerminated: scala.Option[scala.Boolean] = None, serverType: scala.Option[java.lang.String] = None, replicationJobId: scala.Option[java.lang.String] = None, serverId: scala.Option[java.lang.String] = None, vmServer: scala.Option[models.VmServer] = None)
final case class GetServersResponse(lastModifiedOn: scala.Option[java.time.Instant] = None, serverCatalogStatus: scala.Option[java.lang.String] = None, serverList: scala.Option[scala.List[models.Server]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class NoConnectorsAvailableException(message: scala.Option[java.lang.String] = None)
final case class UnauthorizedOperationException(message: scala.Option[java.lang.String] = None)
final case class DeleteReplicationJobRequest(replicationJobId: java.lang.String)
final case class GetReplicationRunsResponse(replicationJob: scala.Option[models.ReplicationJob] = None, replicationRunList: scala.Option[scala.List[models.ReplicationRun]] = None, nextToken: scala.Option[java.lang.String] = None)
case object DeleteServerCatalogRequest
final case class VmServerAddress(vmManagerId: scala.Option[java.lang.String] = None, vmId: scala.Option[java.lang.String] = None)
final case class ServerCannotBeReplicatedException(message: scala.Option[java.lang.String] = None)
final case class GetConnectorsResponse(connectorList: scala.Option[scala.List[models.Connector]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetConnectorsRequest(nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class ReplicationJobAlreadyExistsException(message: scala.Option[java.lang.String] = None)
case object DeleteServerCatalogResponse
case object DisassociateConnectorResponse
final case class ReplicationJob(roleName: scala.Option[java.lang.String] = None, seedReplicationTime: scala.Option[java.time.Instant] = None, nextReplicationRunStartTime: scala.Option[java.time.Instant] = None, state: scala.Option[java.lang.String] = None, serverType: scala.Option[java.lang.String] = None, statusMessage: scala.Option[java.lang.String] = None, latestAmiId: scala.Option[java.lang.String] = None, replicationJobId: scala.Option[java.lang.String] = None, replicationRunList: scala.Option[scala.List[models.ReplicationRun]] = None, serverId: scala.Option[java.lang.String] = None, licenseType: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, vmServer: scala.Option[models.VmServer] = None, frequency: scala.Option[scala.Int] = None)
final case class StartOnDemandReplicationRunRequest(replicationJobId: java.lang.String, description: scala.Option[java.lang.String] = None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = None)
case object ImportServerCatalogResponse
final case class GetReplicationJobsRequest(replicationJobId: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
case object DeleteReplicationJobResponse
final case class Connector(version: scala.Option[java.lang.String] = None, associatedOn: scala.Option[java.time.Instant] = None, vmManagerType: scala.Option[java.lang.String] = None, vmManagerName: scala.Option[java.lang.String] = None, connectorId: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, vmManagerId: scala.Option[java.lang.String] = None, macAddress: scala.Option[java.lang.String] = None, capabilityList: scala.Option[scala.List[java.lang.String]] = None, ipAddress: scala.Option[java.lang.String] = None)
case object UpdateReplicationJobResponse
final case class CreateReplicationJobResponse(replicationJobId: scala.Option[java.lang.String] = None)
final case class GetReplicationJobsResponse(replicationJobList: scala.Option[scala.List[models.ReplicationJob]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class InternalError(message: scala.Option[java.lang.String] = None)
final case class GetServersRequest(nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class OperationNotPermittedException(message: scala.Option[java.lang.String] = None)
final case class GetReplicationRunsRequest(replicationJobId: java.lang.String, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class ReplicationRunLimitExceededException(message: scala.Option[java.lang.String] = None)
final case class VmServer(vmManagerType: scala.Option[java.lang.String] = None, vmManagerName: scala.Option[java.lang.String] = None, vmServerAddress: scala.Option[models.VmServerAddress] = None, vmName: scala.Option[java.lang.String] = None, vmPath: scala.Option[java.lang.String] = None)
final case class DisassociateConnectorRequest(connectorId: java.lang.String)
final case class UpdateReplicationJobRequest(replicationJobId: java.lang.String, roleName: scala.Option[java.lang.String] = None, nextReplicationRunStartTime: scala.Option[java.time.Instant] = None, licenseType: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, frequency: scala.Option[scala.Int] = None)