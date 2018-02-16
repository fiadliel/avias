package avias.servermigration
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ReplicationRunEncoder: io.circe.Encoder[avias.servermigration.models.ReplicationRun] = io.circe.Encoder.instance { o => 
    Json.obj("scheduledStartTime" -> o.scheduledStartTime.asJson, "completedTime" -> o.completedTime.asJson, "replicationRunId" -> o.replicationRunId.asJson, "type" -> o.`type`.asJson, "amiId" -> o.amiId.asJson, "state" -> o.state.asJson, "statusMessage" -> o.statusMessage.asJson, "description" -> o.description.asJson)
  }
  final implicit val ImportServerCatalogRequestEncoder: io.circe.Encoder[avias.servermigration.models.ImportServerCatalogRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartOnDemandReplicationRunResponseEncoder: io.circe.Encoder[avias.servermigration.models.StartOnDemandReplicationRunResponse] = io.circe.Encoder.instance { o => 
    Json.obj("replicationRunId" -> o.replicationRunId.asJson)
  }
  final implicit val CreateReplicationJobRequestEncoder: io.circe.Encoder[avias.servermigration.models.CreateReplicationJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("seedReplicationTime" -> o.seedReplicationTime.asJson, "serverId" -> o.serverId.asJson, "frequency" -> o.frequency.asJson, "roleName" -> o.roleName.asJson, "licenseType" -> o.licenseType.asJson, "description" -> o.description.asJson)
  }
  final implicit val ReplicationJobNotFoundExceptionEncoder: io.circe.Encoder[avias.servermigration.models.ReplicationJobNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MissingRequiredParameterExceptionEncoder: io.circe.Encoder[avias.servermigration.models.MissingRequiredParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ServerEncoder: io.circe.Encoder[avias.servermigration.models.Server] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobTerminated" -> o.replicationJobTerminated.asJson, "serverType" -> o.serverType.asJson, "replicationJobId" -> o.replicationJobId.asJson, "serverId" -> o.serverId.asJson, "vmServer" -> o.vmServer.asJson)
  }
  final implicit val GetServersResponseEncoder: io.circe.Encoder[avias.servermigration.models.GetServersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("lastModifiedOn" -> o.lastModifiedOn.asJson, "serverCatalogStatus" -> o.serverCatalogStatus.asJson, "serverList" -> o.serverList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val NoConnectorsAvailableExceptionEncoder: io.circe.Encoder[avias.servermigration.models.NoConnectorsAvailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UnauthorizedOperationExceptionEncoder: io.circe.Encoder[avias.servermigration.models.UnauthorizedOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteReplicationJobRequestEncoder: io.circe.Encoder[avias.servermigration.models.DeleteReplicationJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobId" -> o.replicationJobId.asJson)
  }
  final implicit val GetReplicationRunsResponseEncoder: io.circe.Encoder[avias.servermigration.models.GetReplicationRunsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJob" -> o.replicationJob.asJson, "replicationRunList" -> o.replicationRunList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteServerCatalogRequestEncoder: io.circe.Encoder[avias.servermigration.models.DeleteServerCatalogRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val VmServerAddressEncoder: io.circe.Encoder[avias.servermigration.models.VmServerAddress] = io.circe.Encoder.instance { o => 
    Json.obj("vmManagerId" -> o.vmManagerId.asJson, "vmId" -> o.vmId.asJson)
  }
  final implicit val ServerCannotBeReplicatedExceptionEncoder: io.circe.Encoder[avias.servermigration.models.ServerCannotBeReplicatedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetConnectorsResponseEncoder: io.circe.Encoder[avias.servermigration.models.GetConnectorsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("connectorList" -> o.connectorList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetConnectorsRequestEncoder: io.circe.Encoder[avias.servermigration.models.GetConnectorsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ReplicationJobAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.servermigration.models.ReplicationJobAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteServerCatalogResponseEncoder: io.circe.Encoder[avias.servermigration.models.DeleteServerCatalogResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DisassociateConnectorResponseEncoder: io.circe.Encoder[avias.servermigration.models.DisassociateConnectorResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReplicationJobEncoder: io.circe.Encoder[avias.servermigration.models.ReplicationJob] = io.circe.Encoder.instance { o => 
    Json.obj("roleName" -> o.roleName.asJson, "seedReplicationTime" -> o.seedReplicationTime.asJson, "nextReplicationRunStartTime" -> o.nextReplicationRunStartTime.asJson, "state" -> o.state.asJson, "serverType" -> o.serverType.asJson, "statusMessage" -> o.statusMessage.asJson, "latestAmiId" -> o.latestAmiId.asJson, "replicationJobId" -> o.replicationJobId.asJson, "replicationRunList" -> o.replicationRunList.asJson, "serverId" -> o.serverId.asJson, "licenseType" -> o.licenseType.asJson, "description" -> o.description.asJson, "vmServer" -> o.vmServer.asJson, "frequency" -> o.frequency.asJson)
  }
  final implicit val StartOnDemandReplicationRunRequestEncoder: io.circe.Encoder[avias.servermigration.models.StartOnDemandReplicationRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobId" -> o.replicationJobId.asJson, "description" -> o.description.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.servermigration.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ImportServerCatalogResponseEncoder: io.circe.Encoder[avias.servermigration.models.ImportServerCatalogResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetReplicationJobsRequestEncoder: io.circe.Encoder[avias.servermigration.models.GetReplicationJobsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobId" -> o.replicationJobId.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteReplicationJobResponseEncoder: io.circe.Encoder[avias.servermigration.models.DeleteReplicationJobResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ConnectorEncoder: io.circe.Encoder[avias.servermigration.models.Connector] = io.circe.Encoder.instance { o => 
    Json.obj("version" -> o.version.asJson, "associatedOn" -> o.associatedOn.asJson, "vmManagerType" -> o.vmManagerType.asJson, "vmManagerName" -> o.vmManagerName.asJson, "connectorId" -> o.connectorId.asJson, "status" -> o.status.asJson, "vmManagerId" -> o.vmManagerId.asJson, "macAddress" -> o.macAddress.asJson, "capabilityList" -> o.capabilityList.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val UpdateReplicationJobResponseEncoder: io.circe.Encoder[avias.servermigration.models.UpdateReplicationJobResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateReplicationJobResponseEncoder: io.circe.Encoder[avias.servermigration.models.CreateReplicationJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobId" -> o.replicationJobId.asJson)
  }
  final implicit val GetReplicationJobsResponseEncoder: io.circe.Encoder[avias.servermigration.models.GetReplicationJobsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobList" -> o.replicationJobList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InternalErrorEncoder: io.circe.Encoder[avias.servermigration.models.InternalError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetServersRequestEncoder: io.circe.Encoder[avias.servermigration.models.GetServersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val OperationNotPermittedExceptionEncoder: io.circe.Encoder[avias.servermigration.models.OperationNotPermittedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetReplicationRunsRequestEncoder: io.circe.Encoder[avias.servermigration.models.GetReplicationRunsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobId" -> o.replicationJobId.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ReplicationRunLimitExceededExceptionEncoder: io.circe.Encoder[avias.servermigration.models.ReplicationRunLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val VmServerEncoder: io.circe.Encoder[avias.servermigration.models.VmServer] = io.circe.Encoder.instance { o => 
    Json.obj("vmManagerType" -> o.vmManagerType.asJson, "vmManagerName" -> o.vmManagerName.asJson, "vmServerAddress" -> o.vmServerAddress.asJson, "vmName" -> o.vmName.asJson, "vmPath" -> o.vmPath.asJson)
  }
  final implicit val DisassociateConnectorRequestEncoder: io.circe.Encoder[avias.servermigration.models.DisassociateConnectorRequest] = io.circe.Encoder.instance { o => 
    Json.obj("connectorId" -> o.connectorId.asJson)
  }
  final implicit val UpdateReplicationJobRequestEncoder: io.circe.Encoder[avias.servermigration.models.UpdateReplicationJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("replicationJobId" -> o.replicationJobId.asJson, "roleName" -> o.roleName.asJson, "nextReplicationRunStartTime" -> o.nextReplicationRunStartTime.asJson, "licenseType" -> o.licenseType.asJson, "description" -> o.description.asJson, "frequency" -> o.frequency.asJson)
  }
  final implicit val ReplicationRunDecoder: io.circe.Decoder[avias.servermigration.models.ReplicationRun] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("scheduledStartTime"), o.get[scala.Option[java.time.Instant]]("completedTime"), o.get[scala.Option[java.lang.String]]("replicationRunId"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("amiId"), o.get[scala.Option[java.lang.String]]("state"), o.get[scala.Option[java.lang.String]]("statusMessage"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.servermigration.models.ReplicationRun.apply _)
  }
  final implicit val ImportServerCatalogRequestDecoder: io.circe.Decoder[avias.servermigration.models.ImportServerCatalogRequest.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.ImportServerCatalogRequest)
  final implicit val StartOnDemandReplicationRunResponseDecoder: io.circe.Decoder[avias.servermigration.models.StartOnDemandReplicationRunResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("replicationRunId").map(avias.servermigration.models.StartOnDemandReplicationRunResponse.apply _)
  }
  final implicit val CreateReplicationJobRequestDecoder: io.circe.Decoder[avias.servermigration.models.CreateReplicationJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("seedReplicationTime"), o.get[java.lang.String]("serverId"), o.get[scala.Int]("frequency"), o.get[scala.Option[java.lang.String]]("roleName"), o.get[scala.Option[java.lang.String]]("licenseType"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.servermigration.models.CreateReplicationJobRequest.apply _)
  }
  final implicit val ReplicationJobNotFoundExceptionDecoder: io.circe.Decoder[avias.servermigration.models.ReplicationJobNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.ReplicationJobNotFoundException.apply _)
  }
  final implicit val MissingRequiredParameterExceptionDecoder: io.circe.Decoder[avias.servermigration.models.MissingRequiredParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.MissingRequiredParameterException.apply _)
  }
  final implicit val ServerDecoder: io.circe.Decoder[avias.servermigration.models.Server] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("replicationJobTerminated"), o.get[scala.Option[java.lang.String]]("serverType"), o.get[scala.Option[java.lang.String]]("replicationJobId"), o.get[scala.Option[java.lang.String]]("serverId"), o.get[scala.Option[avias.servermigration.models.VmServer]]("vmServer")).mapN(avias.servermigration.models.Server.apply _)
  }
  final implicit val GetServersResponseDecoder: io.circe.Decoder[avias.servermigration.models.GetServersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("lastModifiedOn"), o.get[scala.Option[java.lang.String]]("serverCatalogStatus"), o.get[scala.Option[scala.List[avias.servermigration.models.Server]]]("serverList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.servermigration.models.GetServersResponse.apply _)
  }
  final implicit val NoConnectorsAvailableExceptionDecoder: io.circe.Decoder[avias.servermigration.models.NoConnectorsAvailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.NoConnectorsAvailableException.apply _)
  }
  final implicit val UnauthorizedOperationExceptionDecoder: io.circe.Decoder[avias.servermigration.models.UnauthorizedOperationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.UnauthorizedOperationException.apply _)
  }
  final implicit val DeleteReplicationJobRequestDecoder: io.circe.Decoder[avias.servermigration.models.DeleteReplicationJobRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("replicationJobId").map(avias.servermigration.models.DeleteReplicationJobRequest.apply _)
  }
  final implicit val GetReplicationRunsResponseDecoder: io.circe.Decoder[avias.servermigration.models.GetReplicationRunsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.servermigration.models.ReplicationJob]]("replicationJob"), o.get[scala.Option[scala.List[avias.servermigration.models.ReplicationRun]]]("replicationRunList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.servermigration.models.GetReplicationRunsResponse.apply _)
  }
  final implicit val DeleteServerCatalogRequestDecoder: io.circe.Decoder[avias.servermigration.models.DeleteServerCatalogRequest.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.DeleteServerCatalogRequest)
  final implicit val VmServerAddressDecoder: io.circe.Decoder[avias.servermigration.models.VmServerAddress] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("vmManagerId"), o.get[scala.Option[java.lang.String]]("vmId")).mapN(avias.servermigration.models.VmServerAddress.apply _)
  }
  final implicit val ServerCannotBeReplicatedExceptionDecoder: io.circe.Decoder[avias.servermigration.models.ServerCannotBeReplicatedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.ServerCannotBeReplicatedException.apply _)
  }
  final implicit val GetConnectorsResponseDecoder: io.circe.Decoder[avias.servermigration.models.GetConnectorsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servermigration.models.Connector]]]("connectorList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.servermigration.models.GetConnectorsResponse.apply _)
  }
  final implicit val GetConnectorsRequestDecoder: io.circe.Decoder[avias.servermigration.models.GetConnectorsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.servermigration.models.GetConnectorsRequest.apply _)
  }
  final implicit val ReplicationJobAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.servermigration.models.ReplicationJobAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.ReplicationJobAlreadyExistsException.apply _)
  }
  final implicit val DeleteServerCatalogResponseDecoder: io.circe.Decoder[avias.servermigration.models.DeleteServerCatalogResponse.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.DeleteServerCatalogResponse)
  final implicit val DisassociateConnectorResponseDecoder: io.circe.Decoder[avias.servermigration.models.DisassociateConnectorResponse.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.DisassociateConnectorResponse)
  final implicit val ReplicationJobDecoder: io.circe.Decoder[avias.servermigration.models.ReplicationJob] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("roleName"), o.get[scala.Option[java.time.Instant]]("seedReplicationTime"), o.get[scala.Option[java.time.Instant]]("nextReplicationRunStartTime"), o.get[scala.Option[java.lang.String]]("state"), o.get[scala.Option[java.lang.String]]("serverType"), o.get[scala.Option[java.lang.String]]("statusMessage"), o.get[scala.Option[java.lang.String]]("latestAmiId"), o.get[scala.Option[java.lang.String]]("replicationJobId"), o.get[scala.Option[scala.List[avias.servermigration.models.ReplicationRun]]]("replicationRunList"), o.get[scala.Option[java.lang.String]]("serverId"), o.get[scala.Option[java.lang.String]]("licenseType"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[avias.servermigration.models.VmServer]]("vmServer"), o.get[scala.Option[scala.Int]]("frequency")).mapN(avias.servermigration.models.ReplicationJob.apply _)
  }
  final implicit val StartOnDemandReplicationRunRequestDecoder: io.circe.Decoder[avias.servermigration.models.StartOnDemandReplicationRunRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("replicationJobId"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.servermigration.models.StartOnDemandReplicationRunRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.servermigration.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.InvalidParameterException.apply _)
  }
  final implicit val ImportServerCatalogResponseDecoder: io.circe.Decoder[avias.servermigration.models.ImportServerCatalogResponse.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.ImportServerCatalogResponse)
  final implicit val GetReplicationJobsRequestDecoder: io.circe.Decoder[avias.servermigration.models.GetReplicationJobsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("replicationJobId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.servermigration.models.GetReplicationJobsRequest.apply _)
  }
  final implicit val DeleteReplicationJobResponseDecoder: io.circe.Decoder[avias.servermigration.models.DeleteReplicationJobResponse.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.DeleteReplicationJobResponse)
  final implicit val ConnectorDecoder: io.circe.Decoder[avias.servermigration.models.Connector] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.time.Instant]]("associatedOn"), o.get[scala.Option[java.lang.String]]("vmManagerType"), o.get[scala.Option[java.lang.String]]("vmManagerName"), o.get[scala.Option[java.lang.String]]("connectorId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("vmManagerId"), o.get[scala.Option[java.lang.String]]("macAddress"), o.get[scala.Option[scala.List[java.lang.String]]]("capabilityList"), o.get[scala.Option[java.lang.String]]("ipAddress")).mapN(avias.servermigration.models.Connector.apply _)
  }
  final implicit val UpdateReplicationJobResponseDecoder: io.circe.Decoder[avias.servermigration.models.UpdateReplicationJobResponse.type] = io.circe.Decoder.decodeUnit.as(avias.servermigration.models.UpdateReplicationJobResponse)
  final implicit val CreateReplicationJobResponseDecoder: io.circe.Decoder[avias.servermigration.models.CreateReplicationJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("replicationJobId").map(avias.servermigration.models.CreateReplicationJobResponse.apply _)
  }
  final implicit val GetReplicationJobsResponseDecoder: io.circe.Decoder[avias.servermigration.models.GetReplicationJobsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.servermigration.models.ReplicationJob]]]("replicationJobList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.servermigration.models.GetReplicationJobsResponse.apply _)
  }
  final implicit val InternalErrorDecoder: io.circe.Decoder[avias.servermigration.models.InternalError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.InternalError.apply _)
  }
  final implicit val GetServersRequestDecoder: io.circe.Decoder[avias.servermigration.models.GetServersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.servermigration.models.GetServersRequest.apply _)
  }
  final implicit val OperationNotPermittedExceptionDecoder: io.circe.Decoder[avias.servermigration.models.OperationNotPermittedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.OperationNotPermittedException.apply _)
  }
  final implicit val GetReplicationRunsRequestDecoder: io.circe.Decoder[avias.servermigration.models.GetReplicationRunsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("replicationJobId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.servermigration.models.GetReplicationRunsRequest.apply _)
  }
  final implicit val ReplicationRunLimitExceededExceptionDecoder: io.circe.Decoder[avias.servermigration.models.ReplicationRunLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.servermigration.models.ReplicationRunLimitExceededException.apply _)
  }
  final implicit val VmServerDecoder: io.circe.Decoder[avias.servermigration.models.VmServer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("vmManagerType"), o.get[scala.Option[java.lang.String]]("vmManagerName"), o.get[scala.Option[avias.servermigration.models.VmServerAddress]]("vmServerAddress"), o.get[scala.Option[java.lang.String]]("vmName"), o.get[scala.Option[java.lang.String]]("vmPath")).mapN(avias.servermigration.models.VmServer.apply _)
  }
  final implicit val DisassociateConnectorRequestDecoder: io.circe.Decoder[avias.servermigration.models.DisassociateConnectorRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("connectorId").map(avias.servermigration.models.DisassociateConnectorRequest.apply _)
  }
  final implicit val UpdateReplicationJobRequestDecoder: io.circe.Decoder[avias.servermigration.models.UpdateReplicationJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("replicationJobId"), o.get[scala.Option[java.lang.String]]("roleName"), o.get[scala.Option[java.time.Instant]]("nextReplicationRunStartTime"), o.get[scala.Option[java.lang.String]]("licenseType"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.Int]]("frequency")).mapN(avias.servermigration.models.UpdateReplicationJobRequest.apply _)
  }
}