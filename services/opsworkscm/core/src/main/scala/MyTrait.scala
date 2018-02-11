package org.lyranthe.araethura.opsworkscm
trait Amazonopsworkscm[F[_]] {
  def describeAccountAttributes: F[models.DescribeAccountAttributesResponse]
  def updateServer(input: models.UpdateServerRequest): F[models.UpdateServerResponse]
  def startMaintenance(input: models.StartMaintenanceRequest): F[models.StartMaintenanceResponse]
  def updateServerEngineAttributes(input: models.UpdateServerEngineAttributesRequest): F[models.UpdateServerEngineAttributesResponse]
  def createServer(input: models.CreateServerRequest): F[models.CreateServerResponse]
  def describeServers(input: models.DescribeServersRequest): F[models.DescribeServersResponse]
  def describeNodeAssociationStatus(input: models.DescribeNodeAssociationStatusRequest): F[models.DescribeNodeAssociationStatusResponse]
  def describeBackups(input: models.DescribeBackupsRequest): F[models.DescribeBackupsResponse]
  def describeEvents(input: models.DescribeEventsRequest): F[models.DescribeEventsResponse]
  def createBackup(input: models.CreateBackupRequest): F[models.CreateBackupResponse]
  def deleteServer(input: models.DeleteServerRequest): F[scala.Unit]
  def deleteBackup(input: models.DeleteBackupRequest): F[scala.Unit]
  def associateNode(input: models.AssociateNodeRequest): F[models.AssociateNodeResponse]
  def disassociateNode(input: models.DisassociateNodeRequest): F[models.DisassociateNodeResponse]
  def restoreServer(input: models.RestoreServerRequest): F[scala.Unit]
}