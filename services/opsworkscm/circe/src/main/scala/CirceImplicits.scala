package org.lyranthe.araethura.opsworkscm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val StartMaintenanceResponseEncoder: io.circe.Encoder[models.StartMaintenanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val UpdateServerEngineAttributesResponseEncoder: io.circe.Encoder[models.UpdateServerEngineAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DisassociateNodeResponseEncoder: io.circe.Encoder[models.DisassociateNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson)
  }
  final implicit val DescribeNodeAssociationStatusRequestEncoder: io.circe.Encoder[models.DescribeNodeAssociationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson, "ServerName" -> o.serverName.asJson)
  }
  final implicit val AssociateNodeResponseEncoder: io.circe.Encoder[models.AssociateNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson)
  }
  final implicit val RestoreServerRequestEncoder: io.circe.Encoder[models.RestoreServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson, "ServerName" -> o.serverName.asJson, "InstanceType" -> o.instanceType.asJson, "KeyPair" -> o.keyPair.asJson)
  }
  final implicit val BackupEncoder: io.circe.Encoder[models.Backup] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "S3LogUrl" -> o.s3LogUrl.asJson, "StatusDescription" -> o.statusDescription.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Engine" -> o.engine.asJson, "BackupArn" -> o.backupArn.asJson, "EngineModel" -> o.engineModel.asJson, "ToolsVersion" -> o.toolsVersion.asJson, "UserArn" -> o.userArn.asJson, "S3DataUrl" -> o.s3DataUrl.asJson, "EngineVersion" -> o.engineVersion.asJson, "KeyPair" -> o.keyPair.asJson, "Description" -> o.description.asJson, "ServerName" -> o.serverName.asJson, "BackupType" -> o.backupType.asJson, "Status" -> o.status.asJson, "S3DataSize" -> o.s3DataSize.asJson, "BackupId" -> o.backupId.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val ServerEventEncoder: io.circe.Encoder[models.ServerEvent] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "ServerName" -> o.serverName.asJson, "Message" -> o.message.asJson, "LogUrl" -> o.logUrl.asJson)
  }
  final implicit val DeleteServerRequestEncoder: io.circe.Encoder[models.DeleteServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson)
  }
  final implicit val DescribeServersRequestEncoder: io.circe.Encoder[models.DescribeServersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DisassociateNodeRequestEncoder: io.circe.Encoder[models.DisassociateNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NodeName" -> o.nodeName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val CreateServerRequestEncoder: io.circe.Encoder[models.CreateServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceType" -> o.instanceType.asJson, "ServerName" -> o.serverName.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "Engine" -> o.engine.asJson, "EngineModel" -> o.engineModel.asJson, "EngineVersion" -> o.engineVersion.asJson, "EngineAttributes" -> o.engineAttributes.asJson, "KeyPair" -> o.keyPair.asJson, "AssociatePublicIpAddress" -> o.associatePublicIpAddress.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "BackupId" -> o.backupId.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccountAttributeEncoder: io.circe.Encoder[models.AccountAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Maximum" -> o.maximum.asJson, "Used" -> o.used.asJson)
  }
  final implicit val RestoreServerResponseEncoder: io.circe.Encoder[models.RestoreServerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeNodeAssociationStatusResponseEncoder: io.circe.Encoder[models.DescribeNodeAssociationStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatus" -> o.nodeAssociationStatus.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val EngineAttributeEncoder: io.circe.Encoder[models.EngineAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateServerEngineAttributesRequestEncoder: io.circe.Encoder[models.UpdateServerEngineAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "AttributeName" -> o.attributeName.asJson, "AttributeValue" -> o.attributeValue.asJson)
  }
  final implicit val DescribeServersResponseEncoder: io.circe.Encoder[models.DescribeServersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Servers" -> o.servers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateServerResponseEncoder: io.circe.Encoder[models.UpdateServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DeleteBackupRequestEncoder: io.circe.Encoder[models.DeleteBackupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ServerEvents" -> o.serverEvents.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateServerRequestEncoder: io.circe.Encoder[models.UpdateServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson)
  }
  final implicit val DescribeBackupsRequestEncoder: io.circe.Encoder[models.DescribeBackupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson, "ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val AssociateNodeRequestEncoder: io.circe.Encoder[models.AssociateNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NodeName" -> o.nodeName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val DescribeEventsRequestEncoder: io.circe.Encoder[models.DescribeEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteServerResponseEncoder: io.circe.Encoder[models.DeleteServerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServerEncoder: io.circe.Encoder[models.Server] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "ServerArn" -> o.serverArn.asJson, "StatusReason" -> o.statusReason.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Engine" -> o.engine.asJson, "CloudFormationStackArn" -> o.cloudFormationStackArn.asJson, "EngineModel" -> o.engineModel.asJson, "ServerName" -> o.serverName.asJson, "EngineVersion" -> o.engineVersion.asJson, "Endpoint" -> o.endpoint.asJson, "KeyPair" -> o.keyPair.asJson, "EngineAttributes" -> o.engineAttributes.asJson, "MaintenanceStatus" -> o.maintenanceStatus.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "AssociatePublicIpAddress" -> o.associatePublicIpAddress.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "Status" -> o.status.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[models.InvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateBackupRequestEncoder: io.circe.Encoder[models.CreateBackupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeAccountAttributesResponseEncoder: io.circe.Encoder[models.DescribeAccountAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson)
  }
  final implicit val DescribeBackupsResponseEncoder: io.circe.Encoder[models.DescribeBackupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Backups" -> o.backups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[models.ResourceAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteBackupResponseEncoder: io.circe.Encoder[models.DeleteBackupResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateServerResponseEncoder: io.circe.Encoder[models.CreateServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DescribeAccountAttributesRequestEncoder: io.circe.Encoder[models.DescribeAccountAttributesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateBackupResponseEncoder: io.circe.Encoder[models.CreateBackupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Backup" -> o.backup.asJson)
  }
  final implicit val StartMaintenanceRequestEncoder: io.circe.Encoder[models.StartMaintenanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val StartMaintenanceResponseDecoder: io.circe.Decoder[models.StartMaintenanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Server]]("Server").map(models.StartMaintenanceResponse.apply _)
  }
  final implicit val UpdateServerEngineAttributesResponseDecoder: io.circe.Decoder[models.UpdateServerEngineAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Server]]("Server").map(models.UpdateServerEngineAttributesResponse.apply _)
  }
  final implicit val DisassociateNodeResponseDecoder: io.circe.Decoder[models.DisassociateNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NodeAssociationStatusToken").map(models.DisassociateNodeResponse.apply _)
  }
  final implicit val DescribeNodeAssociationStatusRequestDecoder: io.circe.Decoder[models.DescribeNodeAssociationStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NodeAssociationStatusToken"), o.get[java.lang.String]("ServerName")).mapN(models.DescribeNodeAssociationStatusRequest.apply _)
  }
  final implicit val AssociateNodeResponseDecoder: io.circe.Decoder[models.AssociateNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NodeAssociationStatusToken").map(models.AssociateNodeResponse.apply _)
  }
  final implicit val RestoreServerRequestDecoder: io.circe.Decoder[models.RestoreServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BackupId"), o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("KeyPair")).mapN(models.RestoreServerRequest.apply _)
  }
  final implicit val BackupDecoder: io.circe.Decoder[models.Backup] = io.circe.Decoder.instance { o => 
    for (`createdAt` <- o.get[scala.Option[java.time.Instant]]("CreatedAt"); `preferredBackupWindow` <- o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"); `preferredMaintenanceWindow` <- o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"); `s3LogUrl` <- o.get[scala.Option[java.lang.String]]("S3LogUrl"); `statusDescription` <- o.get[scala.Option[java.lang.String]]("StatusDescription"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `serviceRoleArn` <- o.get[scala.Option[java.lang.String]]("ServiceRoleArn"); `engine` <- o.get[scala.Option[java.lang.String]]("Engine"); `backupArn` <- o.get[scala.Option[java.lang.String]]("BackupArn"); `engineModel` <- o.get[scala.Option[java.lang.String]]("EngineModel"); `toolsVersion` <- o.get[scala.Option[java.lang.String]]("ToolsVersion"); `userArn` <- o.get[scala.Option[java.lang.String]]("UserArn"); `s3DataUrl` <- o.get[scala.Option[java.lang.String]]("S3DataUrl"); `engineVersion` <- o.get[scala.Option[java.lang.String]]("EngineVersion"); `keyPair` <- o.get[scala.Option[java.lang.String]]("KeyPair"); `description` <- o.get[scala.Option[java.lang.String]]("Description"); `serverName` <- o.get[scala.Option[java.lang.String]]("ServerName"); `backupType` <- o.get[scala.Option[java.lang.String]]("BackupType"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `s3DataSize` <- o.get[scala.Option[scala.Int]]("S3DataSize"); `backupId` <- o.get[scala.Option[java.lang.String]]("BackupId"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `subnetIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")) yield models.Backup(createdAt, preferredBackupWindow, preferredMaintenanceWindow, s3LogUrl, statusDescription, instanceType, instanceProfileArn, serviceRoleArn, engine, backupArn, engineModel, toolsVersion, userArn, s3DataUrl, engineVersion, keyPair, description, serverName, backupType, status, s3DataSize, backupId, securityGroupIds, subnetIds)
  }
  final implicit val ServerEventDecoder: io.circe.Decoder[models.ServerEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("LogUrl")).mapN(models.ServerEvent.apply _)
  }
  final implicit val DeleteServerRequestDecoder: io.circe.Decoder[models.DeleteServerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServerName").map(models.DeleteServerRequest.apply _)
  }
  final implicit val DescribeServersRequestDecoder: io.circe.Decoder[models.DescribeServersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.DescribeServersRequest.apply _)
  }
  final implicit val DisassociateNodeRequestDecoder: io.circe.Decoder[models.DisassociateNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("NodeName"), o.get[scala.Option[scala.List[models.EngineAttribute]]]("EngineAttributes")).mapN(models.DisassociateNodeRequest.apply _)
  }
  final implicit val CreateServerRequestDecoder: io.circe.Decoder[models.CreateServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceType"), o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("ServiceRoleArn"), o.get[java.lang.String]("InstanceProfileArn"), o.get[scala.Option[scala.Int]]("BackupRetentionCount"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"), o.get[scala.Option[java.lang.String]]("Engine"), o.get[scala.Option[java.lang.String]]("EngineModel"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[scala.List[models.EngineAttribute]]]("EngineAttributes"), o.get[scala.Option[java.lang.String]]("KeyPair"), o.get[scala.Option[scala.Boolean]]("AssociatePublicIpAddress"), o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"), o.get[scala.Option[java.lang.String]]("BackupId"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")).mapN(models.CreateServerRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ValidationException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.LimitExceededException.apply _)
  }
  final implicit val AccountAttributeDecoder: io.circe.Decoder[models.AccountAttribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Int]]("Maximum"), o.get[scala.Option[scala.Int]]("Used")).mapN(models.AccountAttribute.apply _)
  }
  final implicit val RestoreServerResponseDecoder: io.circe.Decoder[models.RestoreServerResponse.type] = io.circe.Decoder.decodeUnit.as(models.RestoreServerResponse)
  final implicit val DescribeNodeAssociationStatusResponseDecoder: io.circe.Decoder[models.DescribeNodeAssociationStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeAssociationStatus"), o.get[scala.Option[scala.List[models.EngineAttribute]]]("EngineAttributes")).mapN(models.DescribeNodeAssociationStatusResponse.apply _)
  }
  final implicit val EngineAttributeDecoder: io.circe.Decoder[models.EngineAttribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.EngineAttribute.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InvalidNextTokenException.apply _)
  }
  final implicit val UpdateServerEngineAttributesRequestDecoder: io.circe.Decoder[models.UpdateServerEngineAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("AttributeName"), o.get[scala.Option[java.lang.String]]("AttributeValue")).mapN(models.UpdateServerEngineAttributesRequest.apply _)
  }
  final implicit val DescribeServersResponseDecoder: io.circe.Decoder[models.DescribeServersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Server]]]("Servers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeServersResponse.apply _)
  }
  final implicit val UpdateServerResponseDecoder: io.circe.Decoder[models.UpdateServerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Server]]("Server").map(models.UpdateServerResponse.apply _)
  }
  final implicit val DeleteBackupRequestDecoder: io.circe.Decoder[models.DeleteBackupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BackupId").map(models.DeleteBackupRequest.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ServerEvent]]]("ServerEvents"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeEventsResponse.apply _)
  }
  final implicit val UpdateServerRequestDecoder: io.circe.Decoder[models.UpdateServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"), o.get[scala.Option[scala.Int]]("BackupRetentionCount"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("PreferredBackupWindow")).mapN(models.UpdateServerRequest.apply _)
  }
  final implicit val DescribeBackupsRequestDecoder: io.circe.Decoder[models.DescribeBackupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BackupId"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.DescribeBackupsRequest.apply _)
  }
  final implicit val AssociateNodeRequestDecoder: io.circe.Decoder[models.AssociateNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("NodeName"), o.get[scala.List[models.EngineAttribute]]("EngineAttributes")).mapN(models.AssociateNodeRequest.apply _)
  }
  final implicit val DescribeEventsRequestDecoder: io.circe.Decoder[models.DescribeEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.DescribeEventsRequest.apply _)
  }
  final implicit val DeleteServerResponseDecoder: io.circe.Decoder[models.DeleteServerResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteServerResponse)
  final implicit val ServerDecoder: io.circe.Decoder[models.Server] = io.circe.Decoder.instance { o => 
    for (`createdAt` <- o.get[scala.Option[java.time.Instant]]("CreatedAt"); `preferredMaintenanceWindow` <- o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"); `preferredBackupWindow` <- o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"); `serverArn` <- o.get[scala.Option[java.lang.String]]("ServerArn"); `statusReason` <- o.get[scala.Option[java.lang.String]]("StatusReason"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `serviceRoleArn` <- o.get[scala.Option[java.lang.String]]("ServiceRoleArn"); `engine` <- o.get[scala.Option[java.lang.String]]("Engine"); `cloudFormationStackArn` <- o.get[scala.Option[java.lang.String]]("CloudFormationStackArn"); `engineModel` <- o.get[scala.Option[java.lang.String]]("EngineModel"); `serverName` <- o.get[scala.Option[java.lang.String]]("ServerName"); `engineVersion` <- o.get[scala.Option[java.lang.String]]("EngineVersion"); `endpoint` <- o.get[scala.Option[java.lang.String]]("Endpoint"); `keyPair` <- o.get[scala.Option[java.lang.String]]("KeyPair"); `engineAttributes` <- o.get[scala.Option[scala.List[models.EngineAttribute]]]("EngineAttributes"); `maintenanceStatus` <- o.get[scala.Option[java.lang.String]]("MaintenanceStatus"); `backupRetentionCount` <- o.get[scala.Option[scala.Int]]("BackupRetentionCount"); `associatePublicIpAddress` <- o.get[scala.Option[scala.Boolean]]("AssociatePublicIpAddress"); `disableAutomatedBackup` <- o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `subnetIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")) yield models.Server(createdAt, preferredMaintenanceWindow, preferredBackupWindow, serverArn, statusReason, instanceType, instanceProfileArn, serviceRoleArn, engine, cloudFormationStackArn, engineModel, serverName, engineVersion, endpoint, keyPair, engineAttributes, maintenanceStatus, backupRetentionCount, associatePublicIpAddress, disableAutomatedBackup, status, securityGroupIds, subnetIds)
  }
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[models.InvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InvalidStateException.apply _)
  }
  final implicit val CreateBackupRequestDecoder: io.circe.Decoder[models.CreateBackupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.CreateBackupRequest.apply _)
  }
  final implicit val DescribeAccountAttributesResponseDecoder: io.circe.Decoder[models.DescribeAccountAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.AccountAttribute]]]("Attributes").map(models.DescribeAccountAttributesResponse.apply _)
  }
  final implicit val DescribeBackupsResponseDecoder: io.circe.Decoder[models.DescribeBackupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Backup]]]("Backups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeBackupsResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[models.ResourceAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ResourceAlreadyExistsException.apply _)
  }
  final implicit val DeleteBackupResponseDecoder: io.circe.Decoder[models.DeleteBackupResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteBackupResponse)
  final implicit val CreateServerResponseDecoder: io.circe.Decoder[models.CreateServerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Server]]("Server").map(models.CreateServerResponse.apply _)
  }
  final implicit val DescribeAccountAttributesRequestDecoder: io.circe.Decoder[models.DescribeAccountAttributesRequest.type] = io.circe.Decoder.decodeUnit.as(models.DescribeAccountAttributesRequest)
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val CreateBackupResponseDecoder: io.circe.Decoder[models.CreateBackupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Backup]]("Backup").map(models.CreateBackupResponse.apply _)
  }
  final implicit val StartMaintenanceRequestDecoder: io.circe.Decoder[models.StartMaintenanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[scala.List[models.EngineAttribute]]]("EngineAttributes")).mapN(models.StartMaintenanceRequest.apply _)
  }
}