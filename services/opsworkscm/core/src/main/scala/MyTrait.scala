package org.lyranthe.araethura.opsworkscm
trait Amazonopsworkscm[F[_]] {
  def describeAccountAttributes: F[org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesResponse]
  def updateServer(input: org.lyranthe.araethura.opsworkscm.models.UpdateServerRequest): F[org.lyranthe.araethura.opsworkscm.models.UpdateServerResponse]
  def startMaintenance(input: org.lyranthe.araethura.opsworkscm.models.StartMaintenanceRequest): F[org.lyranthe.araethura.opsworkscm.models.StartMaintenanceResponse]
  def updateServerEngineAttributes(input: org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesRequest): F[org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesResponse]
  def createServer(input: org.lyranthe.araethura.opsworkscm.models.CreateServerRequest): F[org.lyranthe.araethura.opsworkscm.models.CreateServerResponse]
  def describeServers(input: org.lyranthe.araethura.opsworkscm.models.DescribeServersRequest): F[org.lyranthe.araethura.opsworkscm.models.DescribeServersResponse]
  def describeNodeAssociationStatus(input: org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusRequest): F[org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusResponse]
  def describeBackups(input: org.lyranthe.araethura.opsworkscm.models.DescribeBackupsRequest): F[org.lyranthe.araethura.opsworkscm.models.DescribeBackupsResponse]
  def describeEvents(input: org.lyranthe.araethura.opsworkscm.models.DescribeEventsRequest): F[org.lyranthe.araethura.opsworkscm.models.DescribeEventsResponse]
  def createBackup(input: org.lyranthe.araethura.opsworkscm.models.CreateBackupRequest): F[org.lyranthe.araethura.opsworkscm.models.CreateBackupResponse]
  def deleteServer(input: org.lyranthe.araethura.opsworkscm.models.DeleteServerRequest): F[scala.Unit]
  def deleteBackup(input: org.lyranthe.araethura.opsworkscm.models.DeleteBackupRequest): F[scala.Unit]
  def associateNode(input: org.lyranthe.araethura.opsworkscm.models.AssociateNodeRequest): F[org.lyranthe.araethura.opsworkscm.models.AssociateNodeResponse]
  def disassociateNode(input: org.lyranthe.araethura.opsworkscm.models.DisassociateNodeRequest): F[org.lyranthe.araethura.opsworkscm.models.DisassociateNodeResponse]
  def restoreServer(input: org.lyranthe.araethura.opsworkscm.models.RestoreServerRequest): F[scala.Unit]
}