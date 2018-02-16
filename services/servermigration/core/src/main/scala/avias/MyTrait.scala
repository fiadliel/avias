package avias.servermigration
trait Amazonservermigration[F[_]] {
  def getReplicationRuns(input: avias.servermigration.models.GetReplicationRunsRequest): F[avias.servermigration.models.GetReplicationRunsResponse]
  def updateReplicationJob(input: avias.servermigration.models.UpdateReplicationJobRequest): F[scala.Unit]
  def getServers(input: avias.servermigration.models.GetServersRequest): F[avias.servermigration.models.GetServersResponse]
  def getConnectors(input: avias.servermigration.models.GetConnectorsRequest): F[avias.servermigration.models.GetConnectorsResponse]
  def startOnDemandReplicationRun(input: avias.servermigration.models.StartOnDemandReplicationRunRequest): F[avias.servermigration.models.StartOnDemandReplicationRunResponse]
  def deleteReplicationJob(input: avias.servermigration.models.DeleteReplicationJobRequest): F[scala.Unit]
  def disassociateConnector(input: avias.servermigration.models.DisassociateConnectorRequest): F[scala.Unit]
  def getReplicationJobs(input: avias.servermigration.models.GetReplicationJobsRequest): F[avias.servermigration.models.GetReplicationJobsResponse]
  def deleteServerCatalog: F[scala.Unit]
  def importServerCatalog: F[scala.Unit]
  def createReplicationJob(input: avias.servermigration.models.CreateReplicationJobRequest): F[avias.servermigration.models.CreateReplicationJobResponse]
}