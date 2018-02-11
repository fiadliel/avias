package org.lyranthe.araethura.servermigration
trait Amazonservermigration[F[_]] {
  def getReplicationRuns(input: models.GetReplicationRunsRequest): F[models.GetReplicationRunsResponse]
  def updateReplicationJob(input: models.UpdateReplicationJobRequest): F[scala.Unit]
  def getServers(input: models.GetServersRequest): F[models.GetServersResponse]
  def getConnectors(input: models.GetConnectorsRequest): F[models.GetConnectorsResponse]
  def startOnDemandReplicationRun(input: models.StartOnDemandReplicationRunRequest): F[models.StartOnDemandReplicationRunResponse]
  def deleteReplicationJob(input: models.DeleteReplicationJobRequest): F[scala.Unit]
  def disassociateConnector(input: models.DisassociateConnectorRequest): F[scala.Unit]
  def getReplicationJobs(input: models.GetReplicationJobsRequest): F[models.GetReplicationJobsResponse]
  def deleteServerCatalog: F[scala.Unit]
  def importServerCatalog: F[scala.Unit]
  def createReplicationJob(input: models.CreateReplicationJobRequest): F[models.CreateReplicationJobResponse]
}