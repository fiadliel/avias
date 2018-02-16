package org.lyranthe.araethura.opsworkscm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val StartMaintenanceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.StartMaintenanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val UpdateServerEngineAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DisassociateNodeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DisassociateNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson)
  }
  final implicit val DescribeNodeAssociationStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson, "ServerName" -> o.serverName.asJson)
  }
  final implicit val AssociateNodeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.AssociateNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson)
  }
  final implicit val RestoreServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.RestoreServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson, "ServerName" -> o.serverName.asJson, "InstanceType" -> o.instanceType.asJson, "KeyPair" -> o.keyPair.asJson)
  }
  final implicit val BackupEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.Backup] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "S3LogUrl" -> o.s3LogUrl.asJson, "StatusDescription" -> o.statusDescription.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Engine" -> o.engine.asJson, "BackupArn" -> o.backupArn.asJson, "EngineModel" -> o.engineModel.asJson, "ToolsVersion" -> o.toolsVersion.asJson, "UserArn" -> o.userArn.asJson, "S3DataUrl" -> o.s3DataUrl.asJson, "EngineVersion" -> o.engineVersion.asJson, "KeyPair" -> o.keyPair.asJson, "Description" -> o.description.asJson, "ServerName" -> o.serverName.asJson, "BackupType" -> o.backupType.asJson, "Status" -> o.status.asJson, "S3DataSize" -> o.s3DataSize.asJson, "BackupId" -> o.backupId.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val ServerEventEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.ServerEvent] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "ServerName" -> o.serverName.asJson, "Message" -> o.message.asJson, "LogUrl" -> o.logUrl.asJson)
  }
  final implicit val DeleteServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DeleteServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson)
  }
  final implicit val DescribeServersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeServersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DisassociateNodeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DisassociateNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NodeName" -> o.nodeName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val CreateServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.CreateServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceType" -> o.instanceType.asJson, "ServerName" -> o.serverName.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "Engine" -> o.engine.asJson, "EngineModel" -> o.engineModel.asJson, "EngineVersion" -> o.engineVersion.asJson, "EngineAttributes" -> o.engineAttributes.asJson, "KeyPair" -> o.keyPair.asJson, "AssociatePublicIpAddress" -> o.associatePublicIpAddress.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "BackupId" -> o.backupId.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccountAttributeEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.AccountAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Maximum" -> o.maximum.asJson, "Used" -> o.used.asJson)
  }
  final implicit val RestoreServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.RestoreServerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeNodeAssociationStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatus" -> o.nodeAssociationStatus.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val EngineAttributeEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.EngineAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateServerEngineAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "AttributeName" -> o.attributeName.asJson, "AttributeValue" -> o.attributeValue.asJson)
  }
  final implicit val DescribeServersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeServersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Servers" -> o.servers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DeleteBackupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DeleteBackupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ServerEvents" -> o.serverEvents.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateServerRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson)
  }
  final implicit val DescribeBackupsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeBackupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson, "ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val AssociateNodeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.AssociateNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NodeName" -> o.nodeName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val DescribeEventsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DeleteServerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServerEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.Server] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "ServerArn" -> o.serverArn.asJson, "StatusReason" -> o.statusReason.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Engine" -> o.engine.asJson, "CloudFormationStackArn" -> o.cloudFormationStackArn.asJson, "EngineModel" -> o.engineModel.asJson, "ServerName" -> o.serverName.asJson, "EngineVersion" -> o.engineVersion.asJson, "Endpoint" -> o.endpoint.asJson, "KeyPair" -> o.keyPair.asJson, "EngineAttributes" -> o.engineAttributes.asJson, "MaintenanceStatus" -> o.maintenanceStatus.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "AssociatePublicIpAddress" -> o.associatePublicIpAddress.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "Status" -> o.status.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.InvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateBackupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.CreateBackupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeAccountAttributesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson)
  }
  final implicit val DescribeBackupsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeBackupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Backups" -> o.backups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.ResourceAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteBackupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DeleteBackupResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateServerResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.CreateServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DescribeAccountAttributesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateBackupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.CreateBackupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Backup" -> o.backup.asJson)
  }
  final implicit val StartMaintenanceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.opsworkscm.models.StartMaintenanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val StartMaintenanceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.StartMaintenanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.opsworkscm.models.Server]]("Server").map(org.lyranthe.araethura.opsworkscm.models.StartMaintenanceResponse.apply _)
  }
  final implicit val UpdateServerEngineAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.opsworkscm.models.Server]]("Server").map(org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesResponse.apply _)
  }
  final implicit val DisassociateNodeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DisassociateNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NodeAssociationStatusToken").map(org.lyranthe.araethura.opsworkscm.models.DisassociateNodeResponse.apply _)
  }
  final implicit val DescribeNodeAssociationStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NodeAssociationStatusToken"), o.get[java.lang.String]("ServerName")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusRequest.apply _)
  }
  final implicit val AssociateNodeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.AssociateNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NodeAssociationStatusToken").map(org.lyranthe.araethura.opsworkscm.models.AssociateNodeResponse.apply _)
  }
  final implicit val RestoreServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.RestoreServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BackupId"), o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("KeyPair")).mapN(org.lyranthe.araethura.opsworkscm.models.RestoreServerRequest.apply _)
  }
  final implicit val BackupDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.Backup] = io.circe.Decoder.instance { o => 
    for (`createdAt` <- o.get[scala.Option[java.time.Instant]]("CreatedAt"); `preferredBackupWindow` <- o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"); `preferredMaintenanceWindow` <- o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"); `s3LogUrl` <- o.get[scala.Option[java.lang.String]]("S3LogUrl"); `statusDescription` <- o.get[scala.Option[java.lang.String]]("StatusDescription"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `serviceRoleArn` <- o.get[scala.Option[java.lang.String]]("ServiceRoleArn"); `engine` <- o.get[scala.Option[java.lang.String]]("Engine"); `backupArn` <- o.get[scala.Option[java.lang.String]]("BackupArn"); `engineModel` <- o.get[scala.Option[java.lang.String]]("EngineModel"); `toolsVersion` <- o.get[scala.Option[java.lang.String]]("ToolsVersion"); `userArn` <- o.get[scala.Option[java.lang.String]]("UserArn"); `s3DataUrl` <- o.get[scala.Option[java.lang.String]]("S3DataUrl"); `engineVersion` <- o.get[scala.Option[java.lang.String]]("EngineVersion"); `keyPair` <- o.get[scala.Option[java.lang.String]]("KeyPair"); `description` <- o.get[scala.Option[java.lang.String]]("Description"); `serverName` <- o.get[scala.Option[java.lang.String]]("ServerName"); `backupType` <- o.get[scala.Option[java.lang.String]]("BackupType"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `s3DataSize` <- o.get[scala.Option[scala.Int]]("S3DataSize"); `backupId` <- o.get[scala.Option[java.lang.String]]("BackupId"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `subnetIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")) yield org.lyranthe.araethura.opsworkscm.models.Backup(createdAt, preferredBackupWindow, preferredMaintenanceWindow, s3LogUrl, statusDescription, instanceType, instanceProfileArn, serviceRoleArn, engine, backupArn, engineModel, toolsVersion, userArn, s3DataUrl, engineVersion, keyPair, description, serverName, backupType, status, s3DataSize, backupId, securityGroupIds, subnetIds)
  }
  final implicit val ServerEventDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.ServerEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("LogUrl")).mapN(org.lyranthe.araethura.opsworkscm.models.ServerEvent.apply _)
  }
  final implicit val DeleteServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DeleteServerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServerName").map(org.lyranthe.araethura.opsworkscm.models.DeleteServerRequest.apply _)
  }
  final implicit val DescribeServersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeServersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeServersRequest.apply _)
  }
  final implicit val DisassociateNodeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DisassociateNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("NodeName"), o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.EngineAttribute]]]("EngineAttributes")).mapN(org.lyranthe.araethura.opsworkscm.models.DisassociateNodeRequest.apply _)
  }
  final implicit val CreateServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.CreateServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceType"), o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("ServiceRoleArn"), o.get[java.lang.String]("InstanceProfileArn"), o.get[scala.Option[scala.Int]]("BackupRetentionCount"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"), o.get[scala.Option[java.lang.String]]("Engine"), o.get[scala.Option[java.lang.String]]("EngineModel"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.EngineAttribute]]]("EngineAttributes"), o.get[scala.Option[java.lang.String]]("KeyPair"), o.get[scala.Option[scala.Boolean]]("AssociatePublicIpAddress"), o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"), o.get[scala.Option[java.lang.String]]("BackupId"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")).mapN(org.lyranthe.araethura.opsworkscm.models.CreateServerRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.opsworkscm.models.ValidationException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.opsworkscm.models.LimitExceededException.apply _)
  }
  final implicit val AccountAttributeDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.AccountAttribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Int]]("Maximum"), o.get[scala.Option[scala.Int]]("Used")).mapN(org.lyranthe.araethura.opsworkscm.models.AccountAttribute.apply _)
  }
  final implicit val RestoreServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.RestoreServerResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.opsworkscm.models.RestoreServerResponse)
  final implicit val DescribeNodeAssociationStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeAssociationStatus"), o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.EngineAttribute]]]("EngineAttributes")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeNodeAssociationStatusResponse.apply _)
  }
  final implicit val EngineAttributeDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.EngineAttribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.opsworkscm.models.EngineAttribute.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.opsworkscm.models.InvalidNextTokenException.apply _)
  }
  final implicit val UpdateServerEngineAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("AttributeName"), o.get[scala.Option[java.lang.String]]("AttributeValue")).mapN(org.lyranthe.araethura.opsworkscm.models.UpdateServerEngineAttributesRequest.apply _)
  }
  final implicit val DescribeServersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeServersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.Server]]]("Servers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeServersResponse.apply _)
  }
  final implicit val UpdateServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.opsworkscm.models.Server]]("Server").map(org.lyranthe.araethura.opsworkscm.models.UpdateServerResponse.apply _)
  }
  final implicit val DeleteBackupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DeleteBackupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BackupId").map(org.lyranthe.araethura.opsworkscm.models.DeleteBackupRequest.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.ServerEvent]]]("ServerEvents"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeEventsResponse.apply _)
  }
  final implicit val UpdateServerRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.UpdateServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"), o.get[scala.Option[scala.Int]]("BackupRetentionCount"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("PreferredBackupWindow")).mapN(org.lyranthe.araethura.opsworkscm.models.UpdateServerRequest.apply _)
  }
  final implicit val DescribeBackupsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeBackupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BackupId"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeBackupsRequest.apply _)
  }
  final implicit val AssociateNodeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.AssociateNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("NodeName"), o.get[scala.List[org.lyranthe.araethura.opsworkscm.models.EngineAttribute]]("EngineAttributes")).mapN(org.lyranthe.araethura.opsworkscm.models.AssociateNodeRequest.apply _)
  }
  final implicit val DescribeEventsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeEventsRequest.apply _)
  }
  final implicit val DeleteServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DeleteServerResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.opsworkscm.models.DeleteServerResponse)
  final implicit val ServerDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.Server] = io.circe.Decoder.instance { o => 
    for (`createdAt` <- o.get[scala.Option[java.time.Instant]]("CreatedAt"); `preferredMaintenanceWindow` <- o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"); `preferredBackupWindow` <- o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"); `serverArn` <- o.get[scala.Option[java.lang.String]]("ServerArn"); `statusReason` <- o.get[scala.Option[java.lang.String]]("StatusReason"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `serviceRoleArn` <- o.get[scala.Option[java.lang.String]]("ServiceRoleArn"); `engine` <- o.get[scala.Option[java.lang.String]]("Engine"); `cloudFormationStackArn` <- o.get[scala.Option[java.lang.String]]("CloudFormationStackArn"); `engineModel` <- o.get[scala.Option[java.lang.String]]("EngineModel"); `serverName` <- o.get[scala.Option[java.lang.String]]("ServerName"); `engineVersion` <- o.get[scala.Option[java.lang.String]]("EngineVersion"); `endpoint` <- o.get[scala.Option[java.lang.String]]("Endpoint"); `keyPair` <- o.get[scala.Option[java.lang.String]]("KeyPair"); `engineAttributes` <- o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.EngineAttribute]]]("EngineAttributes"); `maintenanceStatus` <- o.get[scala.Option[java.lang.String]]("MaintenanceStatus"); `backupRetentionCount` <- o.get[scala.Option[scala.Int]]("BackupRetentionCount"); `associatePublicIpAddress` <- o.get[scala.Option[scala.Boolean]]("AssociatePublicIpAddress"); `disableAutomatedBackup` <- o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `subnetIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")) yield org.lyranthe.araethura.opsworkscm.models.Server(createdAt, preferredMaintenanceWindow, preferredBackupWindow, serverArn, statusReason, instanceType, instanceProfileArn, serviceRoleArn, engine, cloudFormationStackArn, engineModel, serverName, engineVersion, endpoint, keyPair, engineAttributes, maintenanceStatus, backupRetentionCount, associatePublicIpAddress, disableAutomatedBackup, status, securityGroupIds, subnetIds)
  }
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.InvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.opsworkscm.models.InvalidStateException.apply _)
  }
  final implicit val CreateBackupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.CreateBackupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.opsworkscm.models.CreateBackupRequest.apply _)
  }
  final implicit val DescribeAccountAttributesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.AccountAttribute]]]("Attributes").map(org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesResponse.apply _)
  }
  final implicit val DescribeBackupsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeBackupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.Backup]]]("Backups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.opsworkscm.models.DescribeBackupsResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.ResourceAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.opsworkscm.models.ResourceAlreadyExistsException.apply _)
  }
  final implicit val DeleteBackupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DeleteBackupResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.opsworkscm.models.DeleteBackupResponse)
  final implicit val CreateServerResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.CreateServerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.opsworkscm.models.Server]]("Server").map(org.lyranthe.araethura.opsworkscm.models.CreateServerResponse.apply _)
  }
  final implicit val DescribeAccountAttributesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesRequest.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.opsworkscm.models.DescribeAccountAttributesRequest)
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.opsworkscm.models.ResourceNotFoundException.apply _)
  }
  final implicit val CreateBackupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.CreateBackupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.opsworkscm.models.Backup]]("Backup").map(org.lyranthe.araethura.opsworkscm.models.CreateBackupResponse.apply _)
  }
  final implicit val StartMaintenanceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.opsworkscm.models.StartMaintenanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[scala.List[org.lyranthe.araethura.opsworkscm.models.EngineAttribute]]]("EngineAttributes")).mapN(org.lyranthe.araethura.opsworkscm.models.StartMaintenanceRequest.apply _)
  }
}