package org.lyranthe.araethura.discovery
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExportFilterEncoder: io.circe.Encoder[models.ExportFilter] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "values" -> o.values.asJson, "condition" -> o.condition.asJson)
  }
  final implicit val CustomerConnectorInfoEncoder: io.circe.Encoder[models.CustomerConnectorInfo] = io.circe.Encoder.instance { o => 
    Json.obj("totalConnectors" -> o.totalConnectors.asJson, "activeConnectors" -> o.activeConnectors.asJson, "shutdownConnectors" -> o.shutdownConnectors.asJson, "unknownConnectors" -> o.unknownConnectors.asJson, "unhealthyConnectors" -> o.unhealthyConnectors.asJson, "blackListedConnectors" -> o.blackListedConnectors.asJson, "healthyConnectors" -> o.healthyConnectors.asJson)
  }
  final implicit val AgentNetworkInfoEncoder: io.circe.Encoder[models.AgentNetworkInfo] = io.circe.Encoder.instance { o => 
    Json.obj("ipAddress" -> o.ipAddress.asJson, "macAddress" -> o.macAddress.asJson)
  }
  final implicit val NeighborConnectionDetailEncoder: io.circe.Encoder[models.NeighborConnectionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("sourceServerId" -> o.sourceServerId.asJson, "destinationServerId" -> o.destinationServerId.asJson, "connectionsCount" -> o.connectionsCount.asJson, "destinationPort" -> o.destinationPort.asJson, "transportProtocol" -> o.transportProtocol.asJson)
  }
  final implicit val DisassociateConfigurationItemsFromApplicationResponseEncoder: io.circe.Encoder[models.DisassociateConfigurationItemsFromApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartExportTaskRequestEncoder: io.circe.Encoder[models.StartExportTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("exportDataFormat" -> o.exportDataFormat.asJson, "filters" -> o.filters.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson)
  }
  final implicit val DescribeConfigurationsResponseEncoder: io.circe.Encoder[models.DescribeConfigurationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("configurations" -> o.configurations.asJson)
  }
  final implicit val StartDataCollectionByAgentIdsRequestEncoder: io.circe.Encoder[models.StartDataCollectionByAgentIdsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("agentIds" -> o.agentIds.asJson)
  }
  final implicit val ListConfigurationsResponseEncoder: io.circe.Encoder[models.ListConfigurationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("configurations" -> o.configurations.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CustomerAgentInfoEncoder: io.circe.Encoder[models.CustomerAgentInfo] = io.circe.Encoder.instance { o => 
    Json.obj("totalAgents" -> o.totalAgents.asJson, "blackListedAgents" -> o.blackListedAgents.asJson, "shutdownAgents" -> o.shutdownAgents.asJson, "activeAgents" -> o.activeAgents.asJson, "unhealthyAgents" -> o.unhealthyAgents.asJson, "healthyAgents" -> o.healthyAgents.asJson, "unknownAgents" -> o.unknownAgents.asJson)
  }
  final implicit val DeleteTagsResponseEncoder: io.circe.Encoder[models.DeleteTagsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteTagsRequestEncoder: io.circe.Encoder[models.DeleteTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationIds" -> o.configurationIds.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val CreateTagsResponseEncoder: io.circe.Encoder[models.CreateTagsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteApplicationsRequestEncoder: io.circe.Encoder[models.DeleteApplicationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationIds" -> o.configurationIds.asJson)
  }
  final implicit val AgentConfigurationStatusEncoder: io.circe.Encoder[models.AgentConfigurationStatus] = io.circe.Encoder.instance { o => 
    Json.obj("agentId" -> o.agentId.asJson, "description" -> o.description.asJson, "operationSucceeded" -> o.operationSucceeded.asJson)
  }
  final implicit val ExportConfigurationsResponseEncoder: io.circe.Encoder[models.ExportConfigurationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("exportId" -> o.exportId.asJson)
  }
  final implicit val TagFilterEncoder: io.circe.Encoder[models.TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "values" -> o.values.asJson)
  }
  final implicit val UpdateApplicationRequestEncoder: io.circe.Encoder[models.UpdateApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val GetDiscoverySummaryResponseEncoder: io.circe.Encoder[models.GetDiscoverySummaryResponse] = io.circe.Encoder.instance { o => 
    Json.obj("servers" -> o.servers.asJson, "applications" -> o.applications.asJson, "serversMappedToApplications" -> o.serversMappedToApplications.asJson, "serversMappedtoTags" -> o.serversMappedtoTags.asJson, "agentSummary" -> o.agentSummary.asJson, "connectorSummary" -> o.connectorSummary.asJson)
  }
  final implicit val DescribeConfigurationsRequestEncoder: io.circe.Encoder[models.DescribeConfigurationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationIds" -> o.configurationIds.asJson)
  }
  final implicit val AssociateConfigurationItemsToApplicationResponseEncoder: io.circe.Encoder[models.AssociateConfigurationItemsToApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeAgentsResponseEncoder: io.circe.Encoder[models.DescribeAgentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("agentsInfo" -> o.agentsInfo.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListConfigurationsRequestEncoder: io.circe.Encoder[models.ListConfigurationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationType" -> o.configurationType.asJson, "orderBy" -> o.orderBy.asJson, "filters" -> o.filters.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AssociateConfigurationItemsToApplicationRequestEncoder: io.circe.Encoder[models.AssociateConfigurationItemsToApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("applicationConfigurationId" -> o.applicationConfigurationId.asJson, "configurationIds" -> o.configurationIds.asJson)
  }
  final implicit val DescribeTagsRequestEncoder: io.circe.Encoder[models.DescribeTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filters" -> o.filters.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StartDataCollectionByAgentIdsResponseEncoder: io.circe.Encoder[models.StartDataCollectionByAgentIdsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("agentsConfigurationStatus" -> o.agentsConfigurationStatus.asJson)
  }
  final implicit val DescribeTagsResponseEncoder: io.circe.Encoder[models.DescribeTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val FilterEncoder: io.circe.Encoder[models.Filter] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "values" -> o.values.asJson, "condition" -> o.condition.asJson)
  }
  final implicit val ListServerNeighborsResponseEncoder: io.circe.Encoder[models.ListServerNeighborsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("neighbors" -> o.neighbors.asJson, "nextToken" -> o.nextToken.asJson, "knownDependencyCount" -> o.knownDependencyCount.asJson)
  }
  final implicit val DescribeAgentsRequestEncoder: io.circe.Encoder[models.DescribeAgentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("agentIds" -> o.agentIds.asJson, "filters" -> o.filters.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AuthorizationErrorExceptionEncoder: io.circe.Encoder[models.AuthorizationErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val ServerInternalErrorExceptionEncoder: io.circe.Encoder[models.ServerInternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteApplicationsResponseEncoder: io.circe.Encoder[models.DeleteApplicationsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeExportTasksResponseEncoder: io.circe.Encoder[models.DescribeExportTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("exportsInfo" -> o.exportsInfo.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeExportTasksRequestEncoder: io.circe.Encoder[models.DescribeExportTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("exportIds" -> o.exportIds.asJson, "filters" -> o.filters.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateApplicationResponseEncoder: io.circe.Encoder[models.UpdateApplicationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateTagsRequestEncoder: io.circe.Encoder[models.CreateTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationIds" -> o.configurationIds.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val DescribeExportConfigurationsRequestEncoder: io.circe.Encoder[models.DescribeExportConfigurationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("exportIds" -> o.exportIds.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val OrderByElementEncoder: io.circe.Encoder[models.OrderByElement] = io.circe.Encoder.instance { o => 
    Json.obj("fieldName" -> o.fieldName.asJson, "sortOrder" -> o.sortOrder.asJson)
  }
  final implicit val StopDataCollectionByAgentIdsRequestEncoder: io.circe.Encoder[models.StopDataCollectionByAgentIdsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("agentIds" -> o.agentIds.asJson)
  }
  final implicit val StopDataCollectionByAgentIdsResponseEncoder: io.circe.Encoder[models.StopDataCollectionByAgentIdsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("agentsConfigurationStatus" -> o.agentsConfigurationStatus.asJson)
  }
  final implicit val InvalidParameterValueExceptionEncoder: io.circe.Encoder[models.InvalidParameterValueException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val OperationNotPermittedExceptionEncoder: io.circe.Encoder[models.OperationNotPermittedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateApplicationRequestEncoder: io.circe.Encoder[models.CreateApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val AgentInfoEncoder: io.circe.Encoder[models.AgentInfo] = io.circe.Encoder.instance { o => 
    Json.obj("agentId" -> o.agentId.asJson, "hostName" -> o.hostName.asJson, "lastHealthPingTime" -> o.lastHealthPingTime.asJson, "collectionStatus" -> o.collectionStatus.asJson, "version" -> o.version.asJson, "registeredTime" -> o.registeredTime.asJson, "connectorId" -> o.connectorId.asJson, "agentType" -> o.agentType.asJson, "agentNetworkInfoList" -> o.agentNetworkInfoList.asJson, "health" -> o.health.asJson)
  }
  final implicit val CreateApplicationResponseEncoder: io.circe.Encoder[models.CreateApplicationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson)
  }
  final implicit val ListServerNeighborsRequestEncoder: io.circe.Encoder[models.ListServerNeighborsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson, "neighborConfigurationIds" -> o.neighborConfigurationIds.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson, "portInformationNeeded" -> o.portInformationNeeded.asJson)
  }
  final implicit val DisassociateConfigurationItemsFromApplicationRequestEncoder: io.circe.Encoder[models.DisassociateConfigurationItemsFromApplicationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("applicationConfigurationId" -> o.applicationConfigurationId.asJson, "configurationIds" -> o.configurationIds.asJson)
  }
  final implicit val ConfigurationTagEncoder: io.circe.Encoder[models.ConfigurationTag] = io.circe.Encoder.instance { o => 
    Json.obj("value" -> o.value.asJson, "configurationId" -> o.configurationId.asJson, "configurationType" -> o.configurationType.asJson, "timeOfCreation" -> o.timeOfCreation.asJson, "key" -> o.key.asJson)
  }
  final implicit val DescribeExportConfigurationsResponseEncoder: io.circe.Encoder[models.DescribeExportConfigurationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("exportsInfo" -> o.exportsInfo.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StartExportTaskResponseEncoder: io.circe.Encoder[models.StartExportTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("exportId" -> o.exportId.asJson)
  }
  final implicit val ExportInfoEncoder: io.circe.Encoder[models.ExportInfo] = io.circe.Encoder.instance { o => 
    Json.obj("statusMessage" -> o.statusMessage.asJson, "exportId" -> o.exportId.asJson, "exportStatus" -> o.exportStatus.asJson, "exportRequestTime" -> o.exportRequestTime.asJson, "requestedStartTime" -> o.requestedStartTime.asJson, "requestedEndTime" -> o.requestedEndTime.asJson, "isTruncated" -> o.isTruncated.asJson, "configurationsDownloadUrl" -> o.configurationsDownloadUrl.asJson)
  }
  final implicit val GetDiscoverySummaryRequestEncoder: io.circe.Encoder[models.GetDiscoverySummaryRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val ExportFilterDecoder: io.circe.Decoder[models.ExportFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("values"), o.get[java.lang.String]("condition")).mapN(models.ExportFilter.apply _)
  }
  final implicit val CustomerConnectorInfoDecoder: io.circe.Decoder[models.CustomerConnectorInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("totalConnectors"), o.get[scala.Int]("activeConnectors"), o.get[scala.Int]("shutdownConnectors"), o.get[scala.Int]("unknownConnectors"), o.get[scala.Int]("unhealthyConnectors"), o.get[scala.Int]("blackListedConnectors"), o.get[scala.Int]("healthyConnectors")).mapN(models.CustomerConnectorInfo.apply _)
  }
  final implicit val AgentNetworkInfoDecoder: io.circe.Decoder[models.AgentNetworkInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ipAddress"), o.get[scala.Option[java.lang.String]]("macAddress")).mapN(models.AgentNetworkInfo.apply _)
  }
  final implicit val NeighborConnectionDetailDecoder: io.circe.Decoder[models.NeighborConnectionDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("sourceServerId"), o.get[java.lang.String]("destinationServerId"), o.get[scala.Long]("connectionsCount"), o.get[scala.Option[scala.Int]]("destinationPort"), o.get[scala.Option[java.lang.String]]("transportProtocol")).mapN(models.NeighborConnectionDetail.apply _)
  }
  final implicit val DisassociateConfigurationItemsFromApplicationResponseDecoder: io.circe.Decoder[models.DisassociateConfigurationItemsFromApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(models.DisassociateConfigurationItemsFromApplicationResponse)
  final implicit val StartExportTaskRequestDecoder: io.circe.Decoder[models.StartExportTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("exportDataFormat"), o.get[scala.Option[scala.List[models.ExportFilter]]]("filters"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime")).mapN(models.StartExportTaskRequest.apply _)
  }
  final implicit val DescribeConfigurationsResponseDecoder: io.circe.Decoder[models.DescribeConfigurationsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("configurations").map(models.DescribeConfigurationsResponse.apply _)
  }
  final implicit val StartDataCollectionByAgentIdsRequestDecoder: io.circe.Decoder[models.StartDataCollectionByAgentIdsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("agentIds").map(models.StartDataCollectionByAgentIdsRequest.apply _)
  }
  final implicit val ListConfigurationsResponseDecoder: io.circe.Decoder[models.ListConfigurationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]]("configurations"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListConfigurationsResponse.apply _)
  }
  final implicit val CustomerAgentInfoDecoder: io.circe.Decoder[models.CustomerAgentInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("totalAgents"), o.get[scala.Int]("blackListedAgents"), o.get[scala.Int]("shutdownAgents"), o.get[scala.Int]("activeAgents"), o.get[scala.Int]("unhealthyAgents"), o.get[scala.Int]("healthyAgents"), o.get[scala.Int]("unknownAgents")).mapN(models.CustomerAgentInfo.apply _)
  }
  final implicit val DeleteTagsResponseDecoder: io.circe.Decoder[models.DeleteTagsResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteTagsResponse)
  final implicit val DeleteTagsRequestDecoder: io.circe.Decoder[models.DeleteTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("configurationIds"), o.get[scala.Option[scala.List[models.Tag]]]("tags")).mapN(models.DeleteTagsRequest.apply _)
  }
  final implicit val CreateTagsResponseDecoder: io.circe.Decoder[models.CreateTagsResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateTagsResponse)
  final implicit val DeleteApplicationsRequestDecoder: io.circe.Decoder[models.DeleteApplicationsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("configurationIds").map(models.DeleteApplicationsRequest.apply _)
  }
  final implicit val AgentConfigurationStatusDecoder: io.circe.Decoder[models.AgentConfigurationStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("agentId"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.Boolean]]("operationSucceeded")).mapN(models.AgentConfigurationStatus.apply _)
  }
  final implicit val ExportConfigurationsResponseDecoder: io.circe.Decoder[models.ExportConfigurationsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("exportId").map(models.ExportConfigurationsResponse.apply _)
  }
  final implicit val TagFilterDecoder: io.circe.Decoder[models.TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("values")).mapN(models.TagFilter.apply _)
  }
  final implicit val UpdateApplicationRequestDecoder: io.circe.Decoder[models.UpdateApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("configurationId"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.UpdateApplicationRequest.apply _)
  }
  final implicit val GetDiscoverySummaryResponseDecoder: io.circe.Decoder[models.GetDiscoverySummaryResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("servers"), o.get[scala.Option[scala.Long]]("applications"), o.get[scala.Option[scala.Long]]("serversMappedToApplications"), o.get[scala.Option[scala.Long]]("serversMappedtoTags"), o.get[scala.Option[models.CustomerAgentInfo]]("agentSummary"), o.get[scala.Option[models.CustomerConnectorInfo]]("connectorSummary")).mapN(models.GetDiscoverySummaryResponse.apply _)
  }
  final implicit val DescribeConfigurationsRequestDecoder: io.circe.Decoder[models.DescribeConfigurationsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("configurationIds").map(models.DescribeConfigurationsRequest.apply _)
  }
  final implicit val AssociateConfigurationItemsToApplicationResponseDecoder: io.circe.Decoder[models.AssociateConfigurationItemsToApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(models.AssociateConfigurationItemsToApplicationResponse)
  final implicit val DescribeAgentsResponseDecoder: io.circe.Decoder[models.DescribeAgentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.AgentInfo]]]("agentsInfo"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeAgentsResponse.apply _)
  }
  final implicit val ListConfigurationsRequestDecoder: io.circe.Decoder[models.ListConfigurationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("configurationType"), o.get[scala.Option[scala.List[models.OrderByElement]]]("orderBy"), o.get[scala.Option[scala.List[models.Filter]]]("filters"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListConfigurationsRequest.apply _)
  }
  final implicit val AssociateConfigurationItemsToApplicationRequestDecoder: io.circe.Decoder[models.AssociateConfigurationItemsToApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationConfigurationId"), o.get[scala.List[java.lang.String]]("configurationIds")).mapN(models.AssociateConfigurationItemsToApplicationRequest.apply _)
  }
  final implicit val DescribeTagsRequestDecoder: io.circe.Decoder[models.DescribeTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.TagFilter]]]("filters"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeTagsRequest.apply _)
  }
  final implicit val StartDataCollectionByAgentIdsResponseDecoder: io.circe.Decoder[models.StartDataCollectionByAgentIdsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.AgentConfigurationStatus]]]("agentsConfigurationStatus").map(models.StartDataCollectionByAgentIdsResponse.apply _)
  }
  final implicit val DescribeTagsResponseDecoder: io.circe.Decoder[models.DescribeTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ConfigurationTag]]]("tags"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeTagsResponse.apply _)
  }
  final implicit val FilterDecoder: io.circe.Decoder[models.Filter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("values"), o.get[java.lang.String]("condition")).mapN(models.Filter.apply _)
  }
  final implicit val ListServerNeighborsResponseDecoder: io.circe.Decoder[models.ListServerNeighborsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.NeighborConnectionDetail]]("neighbors"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Long]]("knownDependencyCount")).mapN(models.ListServerNeighborsResponse.apply _)
  }
  final implicit val DescribeAgentsRequestDecoder: io.circe.Decoder[models.DescribeAgentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("agentIds"), o.get[scala.Option[scala.List[models.Filter]]]("filters"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeAgentsRequest.apply _)
  }
  final implicit val AuthorizationErrorExceptionDecoder: io.circe.Decoder[models.AuthorizationErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AuthorizationErrorException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[java.lang.String]("value")).mapN(models.Tag.apply _)
  }
  final implicit val ServerInternalErrorExceptionDecoder: io.circe.Decoder[models.ServerInternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ServerInternalErrorException.apply _)
  }
  final implicit val DeleteApplicationsResponseDecoder: io.circe.Decoder[models.DeleteApplicationsResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteApplicationsResponse)
  final implicit val DescribeExportTasksResponseDecoder: io.circe.Decoder[models.DescribeExportTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ExportInfo]]]("exportsInfo"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeExportTasksResponse.apply _)
  }
  final implicit val DescribeExportTasksRequestDecoder: io.circe.Decoder[models.DescribeExportTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("exportIds"), o.get[scala.Option[scala.List[models.ExportFilter]]]("filters"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeExportTasksRequest.apply _)
  }
  final implicit val UpdateApplicationResponseDecoder: io.circe.Decoder[models.UpdateApplicationResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateApplicationResponse)
  final implicit val CreateTagsRequestDecoder: io.circe.Decoder[models.CreateTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("configurationIds"), o.get[scala.List[models.Tag]]("tags")).mapN(models.CreateTagsRequest.apply _)
  }
  final implicit val DescribeExportConfigurationsRequestDecoder: io.circe.Decoder[models.DescribeExportConfigurationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("exportIds"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeExportConfigurationsRequest.apply _)
  }
  final implicit val OrderByElementDecoder: io.circe.Decoder[models.OrderByElement] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("fieldName"), o.get[scala.Option[java.lang.String]]("sortOrder")).mapN(models.OrderByElement.apply _)
  }
  final implicit val StopDataCollectionByAgentIdsRequestDecoder: io.circe.Decoder[models.StopDataCollectionByAgentIdsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("agentIds").map(models.StopDataCollectionByAgentIdsRequest.apply _)
  }
  final implicit val StopDataCollectionByAgentIdsResponseDecoder: io.circe.Decoder[models.StopDataCollectionByAgentIdsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.AgentConfigurationStatus]]]("agentsConfigurationStatus").map(models.StopDataCollectionByAgentIdsResponse.apply _)
  }
  final implicit val InvalidParameterValueExceptionDecoder: io.circe.Decoder[models.InvalidParameterValueException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterValueException.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterException.apply _)
  }
  final implicit val OperationNotPermittedExceptionDecoder: io.circe.Decoder[models.OperationNotPermittedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.OperationNotPermittedException.apply _)
  }
  final implicit val CreateApplicationRequestDecoder: io.circe.Decoder[models.CreateApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.CreateApplicationRequest.apply _)
  }
  final implicit val AgentInfoDecoder: io.circe.Decoder[models.AgentInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("agentId"), o.get[scala.Option[java.lang.String]]("hostName"), o.get[scala.Option[java.lang.String]]("lastHealthPingTime"), o.get[scala.Option[java.lang.String]]("collectionStatus"), o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.lang.String]]("registeredTime"), o.get[scala.Option[java.lang.String]]("connectorId"), o.get[scala.Option[java.lang.String]]("agentType"), o.get[scala.Option[scala.List[models.AgentNetworkInfo]]]("agentNetworkInfoList"), o.get[scala.Option[java.lang.String]]("health")).mapN(models.AgentInfo.apply _)
  }
  final implicit val CreateApplicationResponseDecoder: io.circe.Decoder[models.CreateApplicationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("configurationId").map(models.CreateApplicationResponse.apply _)
  }
  final implicit val ListServerNeighborsRequestDecoder: io.circe.Decoder[models.ListServerNeighborsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("configurationId"), o.get[scala.Option[scala.List[java.lang.String]]]("neighborConfigurationIds"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.Boolean]]("portInformationNeeded")).mapN(models.ListServerNeighborsRequest.apply _)
  }
  final implicit val DisassociateConfigurationItemsFromApplicationRequestDecoder: io.circe.Decoder[models.DisassociateConfigurationItemsFromApplicationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationConfigurationId"), o.get[scala.List[java.lang.String]]("configurationIds")).mapN(models.DisassociateConfigurationItemsFromApplicationRequest.apply _)
  }
  final implicit val ConfigurationTagDecoder: io.circe.Decoder[models.ConfigurationTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("value"), o.get[scala.Option[java.lang.String]]("configurationId"), o.get[scala.Option[java.lang.String]]("configurationType"), o.get[scala.Option[java.time.Instant]]("timeOfCreation"), o.get[scala.Option[java.lang.String]]("key")).mapN(models.ConfigurationTag.apply _)
  }
  final implicit val DescribeExportConfigurationsResponseDecoder: io.circe.Decoder[models.DescribeExportConfigurationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ExportInfo]]]("exportsInfo"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeExportConfigurationsResponse.apply _)
  }
  final implicit val StartExportTaskResponseDecoder: io.circe.Decoder[models.StartExportTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("exportId").map(models.StartExportTaskResponse.apply _)
  }
  final implicit val ExportInfoDecoder: io.circe.Decoder[models.ExportInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("statusMessage"), o.get[java.lang.String]("exportId"), o.get[java.lang.String]("exportStatus"), o.get[java.time.Instant]("exportRequestTime"), o.get[scala.Option[java.time.Instant]]("requestedStartTime"), o.get[scala.Option[java.time.Instant]]("requestedEndTime"), o.get[scala.Option[scala.Boolean]]("isTruncated"), o.get[scala.Option[java.lang.String]]("configurationsDownloadUrl")).mapN(models.ExportInfo.apply _)
  }
  final implicit val GetDiscoverySummaryRequestDecoder: io.circe.Decoder[models.GetDiscoverySummaryRequest.type] = io.circe.Decoder.decodeUnit.as(models.GetDiscoverySummaryRequest)
}