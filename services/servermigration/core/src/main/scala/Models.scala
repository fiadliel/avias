package org.lyranthe.araethura.servermigration.models
final case class ReplicationRun(scheduledStartTime: scala.Option[java.time.Instant] = scala.None, completedTime: scala.Option[java.time.Instant] = scala.None, replicationRunId: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, amiId: scala.Option[java.lang.String] = scala.None, state: scala.Option[java.lang.String] = scala.None, statusMessage: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
case object ImportServerCatalogRequest
final case class StartOnDemandReplicationRunResponse(replicationRunId: scala.Option[java.lang.String] = scala.None)
final case class CreateReplicationJobRequest(seedReplicationTime: java.time.Instant, serverId: java.lang.String, frequency: scala.Int, roleName: scala.Option[java.lang.String] = scala.None, licenseType: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class ReplicationJobNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class MissingRequiredParameterException(message: scala.Option[java.lang.String] = scala.None)
final case class Server(replicationJobTerminated: scala.Option[scala.Boolean] = scala.None, serverType: scala.Option[java.lang.String] = scala.None, replicationJobId: scala.Option[java.lang.String] = scala.None, serverId: scala.Option[java.lang.String] = scala.None, vmServer: scala.Option[org.lyranthe.araethura.servermigration.models.VmServer] = scala.None)
final case class GetServersResponse(lastModifiedOn: scala.Option[java.time.Instant] = scala.None, serverCatalogStatus: scala.Option[java.lang.String] = scala.None, serverList: scala.Option[scala.List[org.lyranthe.araethura.servermigration.models.Server]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class NoConnectorsAvailableException(message: scala.Option[java.lang.String] = scala.None)
final case class UnauthorizedOperationException(message: scala.Option[java.lang.String] = scala.None)
final case class DeleteReplicationJobRequest(replicationJobId: java.lang.String)
final case class GetReplicationRunsResponse(replicationJob: scala.Option[org.lyranthe.araethura.servermigration.models.ReplicationJob] = scala.None, replicationRunList: scala.Option[scala.List[org.lyranthe.araethura.servermigration.models.ReplicationRun]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object DeleteServerCatalogRequest
final case class VmServerAddress(vmManagerId: scala.Option[java.lang.String] = scala.None, vmId: scala.Option[java.lang.String] = scala.None)
final case class ServerCannotBeReplicatedException(message: scala.Option[java.lang.String] = scala.None)
final case class GetConnectorsResponse(connectorList: scala.Option[scala.List[org.lyranthe.araethura.servermigration.models.Connector]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetConnectorsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ReplicationJobAlreadyExistsException(message: scala.Option[java.lang.String] = scala.None)
case object DeleteServerCatalogResponse
case object DisassociateConnectorResponse
final case class ReplicationJob(roleName: scala.Option[java.lang.String] = scala.None, seedReplicationTime: scala.Option[java.time.Instant] = scala.None, nextReplicationRunStartTime: scala.Option[java.time.Instant] = scala.None, state: scala.Option[java.lang.String] = scala.None, serverType: scala.Option[java.lang.String] = scala.None, statusMessage: scala.Option[java.lang.String] = scala.None, latestAmiId: scala.Option[java.lang.String] = scala.None, replicationJobId: scala.Option[java.lang.String] = scala.None, replicationRunList: scala.Option[scala.List[org.lyranthe.araethura.servermigration.models.ReplicationRun]] = scala.None, serverId: scala.Option[java.lang.String] = scala.None, licenseType: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, vmServer: scala.Option[org.lyranthe.araethura.servermigration.models.VmServer] = scala.None, frequency: scala.Option[scala.Int] = scala.None)
final case class StartOnDemandReplicationRunRequest(replicationJobId: java.lang.String, description: scala.Option[java.lang.String] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
case object ImportServerCatalogResponse
final case class GetReplicationJobsRequest(replicationJobId: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object DeleteReplicationJobResponse
final case class Connector(version: scala.Option[java.lang.String] = scala.None, associatedOn: scala.Option[java.time.Instant] = scala.None, vmManagerType: scala.Option[java.lang.String] = scala.None, vmManagerName: scala.Option[java.lang.String] = scala.None, connectorId: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, vmManagerId: scala.Option[java.lang.String] = scala.None, macAddress: scala.Option[java.lang.String] = scala.None, capabilityList: scala.Option[scala.List[java.lang.String]] = scala.None, ipAddress: scala.Option[java.lang.String] = scala.None)
case object UpdateReplicationJobResponse
final case class CreateReplicationJobResponse(replicationJobId: scala.Option[java.lang.String] = scala.None)
final case class GetReplicationJobsResponse(replicationJobList: scala.Option[scala.List[org.lyranthe.araethura.servermigration.models.ReplicationJob]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class InternalError(message: scala.Option[java.lang.String] = scala.None)
final case class GetServersRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class OperationNotPermittedException(message: scala.Option[java.lang.String] = scala.None)
final case class GetReplicationRunsRequest(replicationJobId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ReplicationRunLimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class VmServer(vmManagerType: scala.Option[java.lang.String] = scala.None, vmManagerName: scala.Option[java.lang.String] = scala.None, vmServerAddress: scala.Option[org.lyranthe.araethura.servermigration.models.VmServerAddress] = scala.None, vmName: scala.Option[java.lang.String] = scala.None, vmPath: scala.Option[java.lang.String] = scala.None)
final case class DisassociateConnectorRequest(connectorId: java.lang.String)
final case class UpdateReplicationJobRequest(replicationJobId: java.lang.String, roleName: scala.Option[java.lang.String] = scala.None, nextReplicationRunStartTime: scala.Option[java.time.Instant] = scala.None, licenseType: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, frequency: scala.Option[scala.Int] = scala.None)