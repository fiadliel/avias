package org.lyranthe.araethura.servermigration
trait Amazonservermigration[F[_]] {
  def getReplicationRuns(input: org.lyranthe.araethura.servermigration.models.GetReplicationRunsRequest): F[org.lyranthe.araethura.servermigration.models.GetReplicationRunsResponse]
  def updateReplicationJob(input: org.lyranthe.araethura.servermigration.models.UpdateReplicationJobRequest): F[scala.Unit]
  def getServers(input: org.lyranthe.araethura.servermigration.models.GetServersRequest): F[org.lyranthe.araethura.servermigration.models.GetServersResponse]
  def getConnectors(input: org.lyranthe.araethura.servermigration.models.GetConnectorsRequest): F[org.lyranthe.araethura.servermigration.models.GetConnectorsResponse]
  def startOnDemandReplicationRun(input: org.lyranthe.araethura.servermigration.models.StartOnDemandReplicationRunRequest): F[org.lyranthe.araethura.servermigration.models.StartOnDemandReplicationRunResponse]
  def deleteReplicationJob(input: org.lyranthe.araethura.servermigration.models.DeleteReplicationJobRequest): F[scala.Unit]
  def disassociateConnector(input: org.lyranthe.araethura.servermigration.models.DisassociateConnectorRequest): F[scala.Unit]
  def getReplicationJobs(input: org.lyranthe.araethura.servermigration.models.GetReplicationJobsRequest): F[org.lyranthe.araethura.servermigration.models.GetReplicationJobsResponse]
  def deleteServerCatalog: F[scala.Unit]
  def importServerCatalog: F[scala.Unit]
  def createReplicationJob(input: org.lyranthe.araethura.servermigration.models.CreateReplicationJobRequest): F[org.lyranthe.araethura.servermigration.models.CreateReplicationJobResponse]
}