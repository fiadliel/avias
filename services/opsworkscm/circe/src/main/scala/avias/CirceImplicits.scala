package avias.opsworkscm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val StartMaintenanceResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.StartMaintenanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val UpdateServerEngineAttributesResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.UpdateServerEngineAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DisassociateNodeResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DisassociateNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson)
  }
  final implicit val DescribeNodeAssociationStatusRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeNodeAssociationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson, "ServerName" -> o.serverName.asJson)
  }
  final implicit val AssociateNodeResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.AssociateNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatusToken" -> o.nodeAssociationStatusToken.asJson)
  }
  final implicit val RestoreServerRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.RestoreServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson, "ServerName" -> o.serverName.asJson, "InstanceType" -> o.instanceType.asJson, "KeyPair" -> o.keyPair.asJson)
  }
  final implicit val BackupEncoder: io.circe.Encoder[avias.opsworkscm.models.Backup] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "S3LogUrl" -> o.s3LogUrl.asJson, "StatusDescription" -> o.statusDescription.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Engine" -> o.engine.asJson, "BackupArn" -> o.backupArn.asJson, "EngineModel" -> o.engineModel.asJson, "ToolsVersion" -> o.toolsVersion.asJson, "UserArn" -> o.userArn.asJson, "S3DataUrl" -> o.s3DataUrl.asJson, "EngineVersion" -> o.engineVersion.asJson, "KeyPair" -> o.keyPair.asJson, "Description" -> o.description.asJson, "ServerName" -> o.serverName.asJson, "BackupType" -> o.backupType.asJson, "Status" -> o.status.asJson, "S3DataSize" -> o.s3DataSize.asJson, "BackupId" -> o.backupId.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val ServerEventEncoder: io.circe.Encoder[avias.opsworkscm.models.ServerEvent] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "ServerName" -> o.serverName.asJson, "Message" -> o.message.asJson, "LogUrl" -> o.logUrl.asJson)
  }
  final implicit val DeleteServerRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DeleteServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson)
  }
  final implicit val DescribeServersRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeServersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DisassociateNodeRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DisassociateNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NodeName" -> o.nodeName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val CreateServerRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.CreateServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceType" -> o.instanceType.asJson, "ServerName" -> o.serverName.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "Engine" -> o.engine.asJson, "EngineModel" -> o.engineModel.asJson, "EngineVersion" -> o.engineVersion.asJson, "EngineAttributes" -> o.engineAttributes.asJson, "KeyPair" -> o.keyPair.asJson, "AssociatePublicIpAddress" -> o.associatePublicIpAddress.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "BackupId" -> o.backupId.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[avias.opsworkscm.models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.opsworkscm.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccountAttributeEncoder: io.circe.Encoder[avias.opsworkscm.models.AccountAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Maximum" -> o.maximum.asJson, "Used" -> o.used.asJson)
  }
  final implicit val RestoreServerResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.RestoreServerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeNodeAssociationStatusResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeNodeAssociationStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NodeAssociationStatus" -> o.nodeAssociationStatus.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val EngineAttributeEncoder: io.circe.Encoder[avias.opsworkscm.models.EngineAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[avias.opsworkscm.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdateServerEngineAttributesRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.UpdateServerEngineAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "AttributeName" -> o.attributeName.asJson, "AttributeValue" -> o.attributeValue.asJson)
  }
  final implicit val DescribeServersResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeServersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Servers" -> o.servers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateServerResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.UpdateServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DeleteBackupRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DeleteBackupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ServerEvents" -> o.serverEvents.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateServerRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.UpdateServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson)
  }
  final implicit val DescribeBackupsRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeBackupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("BackupId" -> o.backupId.asJson, "ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val AssociateNodeRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.AssociateNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NodeName" -> o.nodeName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val DescribeEventsRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteServerResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DeleteServerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServerEncoder: io.circe.Encoder[avias.opsworkscm.models.Server] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAt" -> o.createdAt.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "PreferredBackupWindow" -> o.preferredBackupWindow.asJson, "ServerArn" -> o.serverArn.asJson, "StatusReason" -> o.statusReason.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceProfileArn" -> o.instanceProfileArn.asJson, "ServiceRoleArn" -> o.serviceRoleArn.asJson, "Engine" -> o.engine.asJson, "CloudFormationStackArn" -> o.cloudFormationStackArn.asJson, "EngineModel" -> o.engineModel.asJson, "ServerName" -> o.serverName.asJson, "EngineVersion" -> o.engineVersion.asJson, "Endpoint" -> o.endpoint.asJson, "KeyPair" -> o.keyPair.asJson, "EngineAttributes" -> o.engineAttributes.asJson, "MaintenanceStatus" -> o.maintenanceStatus.asJson, "BackupRetentionCount" -> o.backupRetentionCount.asJson, "AssociatePublicIpAddress" -> o.associatePublicIpAddress.asJson, "DisableAutomatedBackup" -> o.disableAutomatedBackup.asJson, "Status" -> o.status.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val InvalidStateExceptionEncoder: io.circe.Encoder[avias.opsworkscm.models.InvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateBackupRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.CreateBackupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeAccountAttributesResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeAccountAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson)
  }
  final implicit val DescribeBackupsResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeBackupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Backups" -> o.backups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.opsworkscm.models.ResourceAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteBackupResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.DeleteBackupResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateServerResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.CreateServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Server" -> o.server.asJson)
  }
  final implicit val DescribeAccountAttributesRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.DescribeAccountAttributesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.opsworkscm.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateBackupResponseEncoder: io.circe.Encoder[avias.opsworkscm.models.CreateBackupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Backup" -> o.backup.asJson)
  }
  final implicit val StartMaintenanceRequestEncoder: io.circe.Encoder[avias.opsworkscm.models.StartMaintenanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServerName" -> o.serverName.asJson, "EngineAttributes" -> o.engineAttributes.asJson)
  }
  final implicit val StartMaintenanceResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.StartMaintenanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworkscm.models.Server]]("Server").map(avias.opsworkscm.models.StartMaintenanceResponse.apply _)
  }
  final implicit val UpdateServerEngineAttributesResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.UpdateServerEngineAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworkscm.models.Server]]("Server").map(avias.opsworkscm.models.UpdateServerEngineAttributesResponse.apply _)
  }
  final implicit val DisassociateNodeResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DisassociateNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NodeAssociationStatusToken").map(avias.opsworkscm.models.DisassociateNodeResponse.apply _)
  }
  final implicit val DescribeNodeAssociationStatusRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeNodeAssociationStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NodeAssociationStatusToken"), o.get[java.lang.String]("ServerName")).mapN(avias.opsworkscm.models.DescribeNodeAssociationStatusRequest.apply _)
  }
  final implicit val AssociateNodeResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.AssociateNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NodeAssociationStatusToken").map(avias.opsworkscm.models.AssociateNodeResponse.apply _)
  }
  final implicit val RestoreServerRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.RestoreServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BackupId"), o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("KeyPair")).mapN(avias.opsworkscm.models.RestoreServerRequest.apply _)
  }
  final implicit val BackupDecoder: io.circe.Decoder[avias.opsworkscm.models.Backup] = io.circe.Decoder.instance { o => 
    for (`createdAt` <- o.get[scala.Option[java.time.Instant]]("CreatedAt"); `preferredBackupWindow` <- o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"); `preferredMaintenanceWindow` <- o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"); `s3LogUrl` <- o.get[scala.Option[java.lang.String]]("S3LogUrl"); `statusDescription` <- o.get[scala.Option[java.lang.String]]("StatusDescription"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `serviceRoleArn` <- o.get[scala.Option[java.lang.String]]("ServiceRoleArn"); `engine` <- o.get[scala.Option[java.lang.String]]("Engine"); `backupArn` <- o.get[scala.Option[java.lang.String]]("BackupArn"); `engineModel` <- o.get[scala.Option[java.lang.String]]("EngineModel"); `toolsVersion` <- o.get[scala.Option[java.lang.String]]("ToolsVersion"); `userArn` <- o.get[scala.Option[java.lang.String]]("UserArn"); `s3DataUrl` <- o.get[scala.Option[java.lang.String]]("S3DataUrl"); `engineVersion` <- o.get[scala.Option[java.lang.String]]("EngineVersion"); `keyPair` <- o.get[scala.Option[java.lang.String]]("KeyPair"); `description` <- o.get[scala.Option[java.lang.String]]("Description"); `serverName` <- o.get[scala.Option[java.lang.String]]("ServerName"); `backupType` <- o.get[scala.Option[java.lang.String]]("BackupType"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `s3DataSize` <- o.get[scala.Option[scala.Int]]("S3DataSize"); `backupId` <- o.get[scala.Option[java.lang.String]]("BackupId"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `subnetIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")) yield avias.opsworkscm.models.Backup(createdAt, preferredBackupWindow, preferredMaintenanceWindow, s3LogUrl, statusDescription, instanceType, instanceProfileArn, serviceRoleArn, engine, backupArn, engineModel, toolsVersion, userArn, s3DataUrl, engineVersion, keyPair, description, serverName, backupType, status, s3DataSize, backupId, securityGroupIds, subnetIds)
  }
  final implicit val ServerEventDecoder: io.circe.Decoder[avias.opsworkscm.models.ServerEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAt"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("LogUrl")).mapN(avias.opsworkscm.models.ServerEvent.apply _)
  }
  final implicit val DeleteServerRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DeleteServerRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServerName").map(avias.opsworkscm.models.DeleteServerRequest.apply _)
  }
  final implicit val DescribeServersRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeServersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.opsworkscm.models.DescribeServersRequest.apply _)
  }
  final implicit val DisassociateNodeRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DisassociateNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("NodeName"), o.get[scala.Option[scala.List[avias.opsworkscm.models.EngineAttribute]]]("EngineAttributes")).mapN(avias.opsworkscm.models.DisassociateNodeRequest.apply _)
  }
  final implicit val CreateServerRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.CreateServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceType"), o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("ServiceRoleArn"), o.get[java.lang.String]("InstanceProfileArn"), o.get[scala.Option[scala.Int]]("BackupRetentionCount"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"), o.get[scala.Option[java.lang.String]]("Engine"), o.get[scala.Option[java.lang.String]]("EngineModel"), o.get[scala.Option[java.lang.String]]("EngineVersion"), o.get[scala.Option[scala.List[avias.opsworkscm.models.EngineAttribute]]]("EngineAttributes"), o.get[scala.Option[java.lang.String]]("KeyPair"), o.get[scala.Option[scala.Boolean]]("AssociatePublicIpAddress"), o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"), o.get[scala.Option[java.lang.String]]("BackupId"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")).mapN(avias.opsworkscm.models.CreateServerRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[avias.opsworkscm.models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.opsworkscm.models.ValidationException.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.opsworkscm.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.opsworkscm.models.LimitExceededException.apply _)
  }
  final implicit val AccountAttributeDecoder: io.circe.Decoder[avias.opsworkscm.models.AccountAttribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Int]]("Maximum"), o.get[scala.Option[scala.Int]]("Used")).mapN(avias.opsworkscm.models.AccountAttribute.apply _)
  }
  final implicit val RestoreServerResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.RestoreServerResponse.type] = io.circe.Decoder.decodeUnit.as(avias.opsworkscm.models.RestoreServerResponse)
  final implicit val DescribeNodeAssociationStatusResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeNodeAssociationStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeAssociationStatus"), o.get[scala.Option[scala.List[avias.opsworkscm.models.EngineAttribute]]]("EngineAttributes")).mapN(avias.opsworkscm.models.DescribeNodeAssociationStatusResponse.apply _)
  }
  final implicit val EngineAttributeDecoder: io.circe.Decoder[avias.opsworkscm.models.EngineAttribute] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.opsworkscm.models.EngineAttribute.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[avias.opsworkscm.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.opsworkscm.models.InvalidNextTokenException.apply _)
  }
  final implicit val UpdateServerEngineAttributesRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.UpdateServerEngineAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("AttributeName"), o.get[scala.Option[java.lang.String]]("AttributeValue")).mapN(avias.opsworkscm.models.UpdateServerEngineAttributesRequest.apply _)
  }
  final implicit val DescribeServersResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeServersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.opsworkscm.models.Server]]]("Servers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.opsworkscm.models.DescribeServersResponse.apply _)
  }
  final implicit val UpdateServerResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.UpdateServerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworkscm.models.Server]]("Server").map(avias.opsworkscm.models.UpdateServerResponse.apply _)
  }
  final implicit val DeleteBackupRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DeleteBackupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("BackupId").map(avias.opsworkscm.models.DeleteBackupRequest.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.opsworkscm.models.ServerEvent]]]("ServerEvents"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.opsworkscm.models.DescribeEventsResponse.apply _)
  }
  final implicit val UpdateServerRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.UpdateServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"), o.get[scala.Option[scala.Int]]("BackupRetentionCount"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("PreferredBackupWindow")).mapN(avias.opsworkscm.models.UpdateServerRequest.apply _)
  }
  final implicit val DescribeBackupsRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeBackupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BackupId"), o.get[scala.Option[java.lang.String]]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.opsworkscm.models.DescribeBackupsRequest.apply _)
  }
  final implicit val AssociateNodeRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.AssociateNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[java.lang.String]("NodeName"), o.get[scala.List[avias.opsworkscm.models.EngineAttribute]]("EngineAttributes")).mapN(avias.opsworkscm.models.AssociateNodeRequest.apply _)
  }
  final implicit val DescribeEventsRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.opsworkscm.models.DescribeEventsRequest.apply _)
  }
  final implicit val DeleteServerResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DeleteServerResponse.type] = io.circe.Decoder.decodeUnit.as(avias.opsworkscm.models.DeleteServerResponse)
  final implicit val ServerDecoder: io.circe.Decoder[avias.opsworkscm.models.Server] = io.circe.Decoder.instance { o => 
    for (`createdAt` <- o.get[scala.Option[java.time.Instant]]("CreatedAt"); `preferredMaintenanceWindow` <- o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"); `preferredBackupWindow` <- o.get[scala.Option[java.lang.String]]("PreferredBackupWindow"); `serverArn` <- o.get[scala.Option[java.lang.String]]("ServerArn"); `statusReason` <- o.get[scala.Option[java.lang.String]]("StatusReason"); `instanceType` <- o.get[scala.Option[java.lang.String]]("InstanceType"); `instanceProfileArn` <- o.get[scala.Option[java.lang.String]]("InstanceProfileArn"); `serviceRoleArn` <- o.get[scala.Option[java.lang.String]]("ServiceRoleArn"); `engine` <- o.get[scala.Option[java.lang.String]]("Engine"); `cloudFormationStackArn` <- o.get[scala.Option[java.lang.String]]("CloudFormationStackArn"); `engineModel` <- o.get[scala.Option[java.lang.String]]("EngineModel"); `serverName` <- o.get[scala.Option[java.lang.String]]("ServerName"); `engineVersion` <- o.get[scala.Option[java.lang.String]]("EngineVersion"); `endpoint` <- o.get[scala.Option[java.lang.String]]("Endpoint"); `keyPair` <- o.get[scala.Option[java.lang.String]]("KeyPair"); `engineAttributes` <- o.get[scala.Option[scala.List[avias.opsworkscm.models.EngineAttribute]]]("EngineAttributes"); `maintenanceStatus` <- o.get[scala.Option[java.lang.String]]("MaintenanceStatus"); `backupRetentionCount` <- o.get[scala.Option[scala.Int]]("BackupRetentionCount"); `associatePublicIpAddress` <- o.get[scala.Option[scala.Boolean]]("AssociatePublicIpAddress"); `disableAutomatedBackup` <- o.get[scala.Option[scala.Boolean]]("DisableAutomatedBackup"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `securityGroupIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"); `subnetIds` <- o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")) yield avias.opsworkscm.models.Server(createdAt, preferredMaintenanceWindow, preferredBackupWindow, serverArn, statusReason, instanceType, instanceProfileArn, serviceRoleArn, engine, cloudFormationStackArn, engineModel, serverName, engineVersion, endpoint, keyPair, engineAttributes, maintenanceStatus, backupRetentionCount, associatePublicIpAddress, disableAutomatedBackup, status, securityGroupIds, subnetIds)
  }
  final implicit val InvalidStateExceptionDecoder: io.circe.Decoder[avias.opsworkscm.models.InvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.opsworkscm.models.InvalidStateException.apply _)
  }
  final implicit val CreateBackupRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.CreateBackupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.opsworkscm.models.CreateBackupRequest.apply _)
  }
  final implicit val DescribeAccountAttributesResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeAccountAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.opsworkscm.models.AccountAttribute]]]("Attributes").map(avias.opsworkscm.models.DescribeAccountAttributesResponse.apply _)
  }
  final implicit val DescribeBackupsResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeBackupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.opsworkscm.models.Backup]]]("Backups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.opsworkscm.models.DescribeBackupsResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.opsworkscm.models.ResourceAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.opsworkscm.models.ResourceAlreadyExistsException.apply _)
  }
  final implicit val DeleteBackupResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.DeleteBackupResponse.type] = io.circe.Decoder.decodeUnit.as(avias.opsworkscm.models.DeleteBackupResponse)
  final implicit val CreateServerResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.CreateServerResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworkscm.models.Server]]("Server").map(avias.opsworkscm.models.CreateServerResponse.apply _)
  }
  final implicit val DescribeAccountAttributesRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.DescribeAccountAttributesRequest.type] = io.circe.Decoder.decodeUnit.as(avias.opsworkscm.models.DescribeAccountAttributesRequest)
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.opsworkscm.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.opsworkscm.models.ResourceNotFoundException.apply _)
  }
  final implicit val CreateBackupResponseDecoder: io.circe.Decoder[avias.opsworkscm.models.CreateBackupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.opsworkscm.models.Backup]]("Backup").map(avias.opsworkscm.models.CreateBackupResponse.apply _)
  }
  final implicit val StartMaintenanceRequestDecoder: io.circe.Decoder[avias.opsworkscm.models.StartMaintenanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ServerName"), o.get[scala.Option[scala.List[avias.opsworkscm.models.EngineAttribute]]]("EngineAttributes")).mapN(avias.opsworkscm.models.StartMaintenanceRequest.apply _)
  }
}