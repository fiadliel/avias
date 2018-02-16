package avias.opsworkscm
trait Amazonopsworkscm[F[_]] {
  def describeAccountAttributes: F[avias.opsworkscm.models.DescribeAccountAttributesResponse]
  def updateServer(input: avias.opsworkscm.models.UpdateServerRequest): F[avias.opsworkscm.models.UpdateServerResponse]
  def startMaintenance(input: avias.opsworkscm.models.StartMaintenanceRequest): F[avias.opsworkscm.models.StartMaintenanceResponse]
  def updateServerEngineAttributes(input: avias.opsworkscm.models.UpdateServerEngineAttributesRequest): F[avias.opsworkscm.models.UpdateServerEngineAttributesResponse]
  def createServer(input: avias.opsworkscm.models.CreateServerRequest): F[avias.opsworkscm.models.CreateServerResponse]
  def describeServers(input: avias.opsworkscm.models.DescribeServersRequest): F[avias.opsworkscm.models.DescribeServersResponse]
  def describeNodeAssociationStatus(input: avias.opsworkscm.models.DescribeNodeAssociationStatusRequest): F[avias.opsworkscm.models.DescribeNodeAssociationStatusResponse]
  def describeBackups(input: avias.opsworkscm.models.DescribeBackupsRequest): F[avias.opsworkscm.models.DescribeBackupsResponse]
  def describeEvents(input: avias.opsworkscm.models.DescribeEventsRequest): F[avias.opsworkscm.models.DescribeEventsResponse]
  def createBackup(input: avias.opsworkscm.models.CreateBackupRequest): F[avias.opsworkscm.models.CreateBackupResponse]
  def deleteServer(input: avias.opsworkscm.models.DeleteServerRequest): F[scala.Unit]
  def deleteBackup(input: avias.opsworkscm.models.DeleteBackupRequest): F[scala.Unit]
  def associateNode(input: avias.opsworkscm.models.AssociateNodeRequest): F[avias.opsworkscm.models.AssociateNodeResponse]
  def disassociateNode(input: avias.opsworkscm.models.DisassociateNodeRequest): F[avias.opsworkscm.models.DisassociateNodeResponse]
  def restoreServer(input: avias.opsworkscm.models.RestoreServerRequest): F[scala.Unit]
}