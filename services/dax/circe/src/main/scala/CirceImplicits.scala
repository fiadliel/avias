package org.lyranthe.araethura.dax
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val UntagResourceResponseEncoder: io.circe.Encoder[models.UntagResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val ClusterAlreadyExistsFaultEncoder: io.circe.Encoder[models.ClusterAlreadyExistsFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateClusterRequestEncoder: io.circe.Encoder[models.UpdateClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NotificationTopicArn" -> o.notificationTopicArn.asJson, "ParameterGroupName" -> o.parameterGroupName.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "NotificationTopicStatus" -> o.notificationTopicStatus.asJson, "Description" -> o.description.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson)
  }
  final implicit val DescribeParametersRequestEncoder: io.circe.Encoder[models.DescribeParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "Source" -> o.source.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ParameterGroupQuotaExceededFaultEncoder: io.circe.Encoder[models.ParameterGroupQuotaExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDefaultParametersRequestEncoder: io.circe.Encoder[models.DescribeDefaultParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val IncreaseReplicationFactorResponseEncoder: io.circe.Encoder[models.IncreaseReplicationFactorResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val CreateParameterGroupResponseEncoder: io.circe.Encoder[models.CreateParameterGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroup" -> o.parameterGroup.asJson)
  }
  final implicit val InvalidVPCNetworkStateFaultEncoder: io.circe.Encoder[models.InvalidVPCNetworkStateFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ClusterQuotaForCustomerExceededFaultEncoder: io.circe.Encoder[models.ClusterQuotaForCustomerExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SubnetGroupEncoder: io.circe.Encoder[models.SubnetGroup] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson, "Description" -> o.description.asJson, "VpcId" -> o.vpcId.asJson, "Subnets" -> o.subnets.asJson)
  }
  final implicit val DeleteSubnetGroupRequestEncoder: io.circe.Encoder[models.DeleteSubnetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson)
  }
  final implicit val DecreaseReplicationFactorRequestEncoder: io.circe.Encoder[models.DecreaseReplicationFactorRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NewReplicationFactor" -> o.newReplicationFactor.asJson, "AvailabilityZones" -> o.availabilityZones.asJson, "NodeIdsToRemove" -> o.nodeIdsToRemove.asJson)
  }
  final implicit val TagQuotaPerResourceExceededEncoder: io.circe.Encoder[models.TagQuotaPerResourceExceeded.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterEncoder: io.circe.Encoder[models.Parameter] = io.circe.Encoder.instance { o => 
    Json.obj("ChangeType" -> o.changeType.asJson, "Source" -> o.source.asJson, "DataType" -> o.dataType.asJson, "AllowedValues" -> o.allowedValues.asJson, "ParameterValue" -> o.parameterValue.asJson, "ParameterName" -> o.parameterName.asJson, "Description" -> o.description.asJson, "IsModifiable" -> o.isModifiable.asJson, "NodeTypeSpecificValues" -> o.nodeTypeSpecificValues.asJson, "ParameterType" -> o.parameterType.asJson)
  }
  final implicit val EndpointEncoder: io.circe.Encoder[models.Endpoint] = io.circe.Encoder.instance { o => 
    Json.obj("Address" -> o.address.asJson, "Port" -> o.port.asJson)
  }
  final implicit val SubnetInUseEncoder: io.circe.Encoder[models.SubnetInUse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotificationConfigurationEncoder: io.circe.Encoder[models.NotificationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("TopicArn" -> o.topicArn.asJson, "TopicStatus" -> o.topicStatus.asJson)
  }
  final implicit val CreateClusterResponseEncoder: io.circe.Encoder[models.CreateClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val CreateParameterGroupRequestEncoder: io.circe.Encoder[models.CreateParameterGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val NodeQuotaForCustomerExceededFaultEncoder: io.circe.Encoder[models.NodeQuotaForCustomerExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidARNFaultEncoder: io.circe.Encoder[models.InvalidARNFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NodeEncoder: io.circe.Encoder[models.Node] = io.circe.Encoder.instance { o => 
    Json.obj("NodeId" -> o.nodeId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "NodeStatus" -> o.nodeStatus.asJson, "ParameterGroupStatus" -> o.parameterGroupStatus.asJson, "Endpoint" -> o.endpoint.asJson, "NodeCreateTime" -> o.nodeCreateTime.asJson)
  }
  final implicit val IncreaseReplicationFactorRequestEncoder: io.circe.Encoder[models.IncreaseReplicationFactorRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NewReplicationFactor" -> o.newReplicationFactor.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val SubnetGroupQuotaExceededFaultEncoder: io.circe.Encoder[models.SubnetGroupQuotaExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateSubnetGroupResponseEncoder: io.circe.Encoder[models.CreateSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroup" -> o.subnetGroup.asJson)
  }
  final implicit val ParameterGroupAlreadyExistsFaultEncoder: io.circe.Encoder[models.ParameterGroupAlreadyExistsFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteSubnetGroupResponseEncoder: io.circe.Encoder[models.DeleteSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeletionMessage" -> o.deletionMessage.asJson)
  }
  final implicit val ParameterGroupStatusEncoder: io.circe.Encoder[models.ParameterGroupStatus] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "ParameterApplyStatus" -> o.parameterApplyStatus.asJson, "NodeIdsToReboot" -> o.nodeIdsToReboot.asJson)
  }
  final implicit val InvalidParameterCombinationExceptionEncoder: io.circe.Encoder[models.InvalidParameterCombinationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeClustersRequestEncoder: io.circe.Encoder[models.DescribeClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterNames" -> o.clusterNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ParameterGroupNotFoundFaultEncoder: io.circe.Encoder[models.ParameterGroupNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteClusterResponseEncoder: io.circe.Encoder[models.DeleteClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val ListTagsRequestEncoder: io.circe.Encoder[models.ListTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceName" -> o.resourceName.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeClustersResponseEncoder: io.circe.Encoder[models.DescribeClustersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Clusters" -> o.clusters.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceName" -> o.resourceName.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val CreateSubnetGroupRequestEncoder: io.circe.Encoder[models.CreateSubnetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson, "SubnetIds" -> o.subnetIds.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DeleteParameterGroupRequestEncoder: io.circe.Encoder[models.DeleteParameterGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson)
  }
  final implicit val ParameterNameValueEncoder: io.circe.Encoder[models.ParameterNameValue] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterName" -> o.parameterName.asJson, "ParameterValue" -> o.parameterValue.asJson)
  }
  final implicit val DescribeSubnetGroupsRequestEncoder: io.circe.Encoder[models.DescribeSubnetGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupNames" -> o.subnetGroupNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InsufficientClusterCapacityFaultEncoder: io.circe.Encoder[models.InsufficientClusterCapacityFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SubnetGroupAlreadyExistsFaultEncoder: io.circe.Encoder[models.SubnetGroupAlreadyExistsFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceName" -> o.resourceName.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val ClusterNotFoundFaultEncoder: io.circe.Encoder[models.ClusterNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterGroupEncoder: io.circe.Encoder[models.ParameterGroup] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ClusterEncoder: io.circe.Encoder[models.Cluster] = io.circe.Encoder.instance { o => 
    Json.obj("NodeIdsToRemove" -> o.nodeIdsToRemove.asJson, "SecurityGroups" -> o.securityGroups.asJson, "SubnetGroup" -> o.subnetGroup.asJson, "Status" -> o.status.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "NodeType" -> o.nodeType.asJson, "ClusterName" -> o.clusterName.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "ClusterArn" -> o.clusterArn.asJson, "Description" -> o.description.asJson, "TotalNodes" -> o.totalNodes.asJson, "ActiveNodes" -> o.activeNodes.asJson, "ClusterDiscoveryEndpoint" -> o.clusterDiscoveryEndpoint.asJson, "NotificationConfiguration" -> o.notificationConfiguration.asJson, "ParameterGroup" -> o.parameterGroup.asJson, "Nodes" -> o.nodes.asJson)
  }
  final implicit val TagNotFoundFaultEncoder: io.circe.Encoder[models.TagNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagResourceResponseEncoder: io.circe.Encoder[models.TagResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val InvalidParameterValueExceptionEncoder: io.circe.Encoder[models.InvalidParameterValueException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RebootNodeResponseEncoder: io.circe.Encoder[models.RebootNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val SecurityGroupMembershipEncoder: io.circe.Encoder[models.SecurityGroupMembership] = io.circe.Encoder.instance { o => 
    Json.obj("SecurityGroupIdentifier" -> o.securityGroupIdentifier.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Events" -> o.events.asJson)
  }
  final implicit val InvalidParameterGroupStateFaultEncoder: io.circe.Encoder[models.InvalidParameterGroupStateFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DecreaseReplicationFactorResponseEncoder: io.circe.Encoder[models.DecreaseReplicationFactorResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val SubnetGroupInUseFaultEncoder: io.circe.Encoder[models.SubnetGroupInUseFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventsRequestEncoder: io.circe.Encoder[models.DescribeEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SourceName" -> o.sourceName.asJson, "NextToken" -> o.nextToken.asJson, "SourceType" -> o.sourceType.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Duration" -> o.duration.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val InvalidSubnetEncoder: io.circe.Encoder[models.InvalidSubnet.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateParameterGroupResponseEncoder: io.circe.Encoder[models.UpdateParameterGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroup" -> o.parameterGroup.asJson)
  }
  final implicit val DescribeDefaultParametersResponseEncoder: io.circe.Encoder[models.DescribeDefaultParametersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val ListTagsResponseEncoder: io.circe.Encoder[models.ListTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val SubnetEncoder: io.circe.Encoder[models.Subnet] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetIdentifier" -> o.subnetIdentifier.asJson, "SubnetAvailabilityZone" -> o.subnetAvailabilityZone.asJson)
  }
  final implicit val NodeTypeSpecificValueEncoder: io.circe.Encoder[models.NodeTypeSpecificValue] = io.circe.Encoder.instance { o => 
    Json.obj("NodeType" -> o.nodeType.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CreateClusterRequestEncoder: io.circe.Encoder[models.CreateClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "NodeType" -> o.nodeType.asJson, "ReplicationFactor" -> o.replicationFactor.asJson, "NotificationTopicArn" -> o.notificationTopicArn.asJson, "SubnetGroupName" -> o.subnetGroupName.asJson, "ParameterGroupName" -> o.parameterGroupName.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "Description" -> o.description.asJson, "Tags" -> o.tags.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("SourceName" -> o.sourceName.asJson, "Message" -> o.message.asJson, "SourceType" -> o.sourceType.asJson, "Date" -> o.date.asJson)
  }
  final implicit val DescribeParameterGroupsResponseEncoder: io.circe.Encoder[models.DescribeParameterGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "ParameterGroups" -> o.parameterGroups.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val SubnetQuotaExceededFaultEncoder: io.circe.Encoder[models.SubnetQuotaExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateClusterResponseEncoder: io.circe.Encoder[models.UpdateClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val NodeNotFoundFaultEncoder: io.circe.Encoder[models.NodeNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteClusterRequestEncoder: io.circe.Encoder[models.DeleteClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson)
  }
  final implicit val UpdateSubnetGroupRequestEncoder: io.circe.Encoder[models.UpdateSubnetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson, "Description" -> o.description.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val InvalidClusterStateFaultEncoder: io.circe.Encoder[models.InvalidClusterStateFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeParametersResponseEncoder: io.circe.Encoder[models.DescribeParametersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val NodeQuotaForClusterExceededFaultEncoder: io.circe.Encoder[models.NodeQuotaForClusterExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SubnetGroupNotFoundFaultEncoder: io.circe.Encoder[models.SubnetGroupNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubnetGroupsResponseEncoder: io.circe.Encoder[models.DescribeSubnetGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "SubnetGroups" -> o.subnetGroups.asJson)
  }
  final implicit val RebootNodeRequestEncoder: io.circe.Encoder[models.RebootNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NodeId" -> o.nodeId.asJson)
  }
  final implicit val DescribeParameterGroupsRequestEncoder: io.circe.Encoder[models.DescribeParameterGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupNames" -> o.parameterGroupNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateSubnetGroupResponseEncoder: io.circe.Encoder[models.UpdateSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroup" -> o.subnetGroup.asJson)
  }
  final implicit val UpdateParameterGroupRequestEncoder: io.circe.Encoder[models.UpdateParameterGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "ParameterNameValues" -> o.parameterNameValues.asJson)
  }
  final implicit val DeleteParameterGroupResponseEncoder: io.circe.Encoder[models.DeleteParameterGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeletionMessage" -> o.deletionMessage.asJson)
  }
  final implicit val UntagResourceResponseDecoder: io.circe.Decoder[models.UntagResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Tag]]]("Tags").map(models.UntagResourceResponse.apply _)
  }
  final implicit val ClusterAlreadyExistsFaultDecoder: io.circe.Decoder[models.ClusterAlreadyExistsFault.type] = io.circe.Decoder.decodeUnit.as(models.ClusterAlreadyExistsFault)
  final implicit val UpdateClusterRequestDecoder: io.circe.Decoder[models.UpdateClusterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[scala.Option[java.lang.String]]("NotificationTopicArn"), o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("NotificationTopicStatus"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds")).mapN(models.UpdateClusterRequest.apply _)
  }
  final implicit val DescribeParametersRequestDecoder: io.circe.Decoder[models.DescribeParametersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("Source"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.DescribeParametersRequest.apply _)
  }
  final implicit val ParameterGroupQuotaExceededFaultDecoder: io.circe.Decoder[models.ParameterGroupQuotaExceededFault.type] = io.circe.Decoder.decodeUnit.as(models.ParameterGroupQuotaExceededFault)
  final implicit val DescribeDefaultParametersRequestDecoder: io.circe.Decoder[models.DescribeDefaultParametersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeDefaultParametersRequest.apply _)
  }
  final implicit val IncreaseReplicationFactorResponseDecoder: io.circe.Decoder[models.IncreaseReplicationFactorResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.IncreaseReplicationFactorResponse.apply _)
  }
  final implicit val CreateParameterGroupResponseDecoder: io.circe.Decoder[models.CreateParameterGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ParameterGroup]]("ParameterGroup").map(models.CreateParameterGroupResponse.apply _)
  }
  final implicit val InvalidVPCNetworkStateFaultDecoder: io.circe.Decoder[models.InvalidVPCNetworkStateFault.type] = io.circe.Decoder.decodeUnit.as(models.InvalidVPCNetworkStateFault)
  final implicit val ClusterQuotaForCustomerExceededFaultDecoder: io.circe.Decoder[models.ClusterQuotaForCustomerExceededFault.type] = io.circe.Decoder.decodeUnit.as(models.ClusterQuotaForCustomerExceededFault)
  final implicit val SubnetGroupDecoder: io.circe.Decoder[models.SubnetGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubnetGroupName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[models.Subnet]]]("Subnets")).mapN(models.SubnetGroup.apply _)
  }
  final implicit val DeleteSubnetGroupRequestDecoder: io.circe.Decoder[models.DeleteSubnetGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SubnetGroupName").map(models.DeleteSubnetGroupRequest.apply _)
  }
  final implicit val DecreaseReplicationFactorRequestDecoder: io.circe.Decoder[models.DecreaseReplicationFactorRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[scala.Int]("NewReplicationFactor"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones"), o.get[scala.Option[scala.List[java.lang.String]]]("NodeIdsToRemove")).mapN(models.DecreaseReplicationFactorRequest.apply _)
  }
  final implicit val TagQuotaPerResourceExceededDecoder: io.circe.Decoder[models.TagQuotaPerResourceExceeded.type] = io.circe.Decoder.decodeUnit.as(models.TagQuotaPerResourceExceeded)
  final implicit val ParameterDecoder: io.circe.Decoder[models.Parameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChangeType"), o.get[scala.Option[java.lang.String]]("Source"), o.get[scala.Option[java.lang.String]]("DataType"), o.get[scala.Option[java.lang.String]]("AllowedValues"), o.get[scala.Option[java.lang.String]]("ParameterValue"), o.get[scala.Option[java.lang.String]]("ParameterName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("IsModifiable"), o.get[scala.Option[scala.List[models.NodeTypeSpecificValue]]]("NodeTypeSpecificValues"), o.get[scala.Option[java.lang.String]]("ParameterType")).mapN(models.Parameter.apply _)
  }
  final implicit val EndpointDecoder: io.circe.Decoder[models.Endpoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Address"), o.get[scala.Option[scala.Int]]("Port")).mapN(models.Endpoint.apply _)
  }
  final implicit val SubnetInUseDecoder: io.circe.Decoder[models.SubnetInUse.type] = io.circe.Decoder.decodeUnit.as(models.SubnetInUse)
  final implicit val NotificationConfigurationDecoder: io.circe.Decoder[models.NotificationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TopicArn"), o.get[scala.Option[java.lang.String]]("TopicStatus")).mapN(models.NotificationConfiguration.apply _)
  }
  final implicit val CreateClusterResponseDecoder: io.circe.Decoder[models.CreateClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.CreateClusterResponse.apply _)
  }
  final implicit val CreateParameterGroupRequestDecoder: io.circe.Decoder[models.CreateParameterGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.CreateParameterGroupRequest.apply _)
  }
  final implicit val NodeQuotaForCustomerExceededFaultDecoder: io.circe.Decoder[models.NodeQuotaForCustomerExceededFault.type] = io.circe.Decoder.decodeUnit.as(models.NodeQuotaForCustomerExceededFault)
  final implicit val InvalidARNFaultDecoder: io.circe.Decoder[models.InvalidARNFault.type] = io.circe.Decoder.decodeUnit.as(models.InvalidARNFault)
  final implicit val NodeDecoder: io.circe.Decoder[models.Node] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("NodeStatus"), o.get[scala.Option[java.lang.String]]("ParameterGroupStatus"), o.get[scala.Option[models.Endpoint]]("Endpoint"), o.get[scala.Option[java.time.Instant]]("NodeCreateTime")).mapN(models.Node.apply _)
  }
  final implicit val IncreaseReplicationFactorRequestDecoder: io.circe.Decoder[models.IncreaseReplicationFactorRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[scala.Int]("NewReplicationFactor"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(models.IncreaseReplicationFactorRequest.apply _)
  }
  final implicit val SubnetGroupQuotaExceededFaultDecoder: io.circe.Decoder[models.SubnetGroupQuotaExceededFault.type] = io.circe.Decoder.decodeUnit.as(models.SubnetGroupQuotaExceededFault)
  final implicit val CreateSubnetGroupResponseDecoder: io.circe.Decoder[models.CreateSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.SubnetGroup]]("SubnetGroup").map(models.CreateSubnetGroupResponse.apply _)
  }
  final implicit val ParameterGroupAlreadyExistsFaultDecoder: io.circe.Decoder[models.ParameterGroupAlreadyExistsFault.type] = io.circe.Decoder.decodeUnit.as(models.ParameterGroupAlreadyExistsFault)
  final implicit val DeleteSubnetGroupResponseDecoder: io.circe.Decoder[models.DeleteSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DeletionMessage").map(models.DeleteSubnetGroupResponse.apply _)
  }
  final implicit val ParameterGroupStatusDecoder: io.circe.Decoder[models.ParameterGroupStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("ParameterApplyStatus"), o.get[scala.Option[scala.List[java.lang.String]]]("NodeIdsToReboot")).mapN(models.ParameterGroupStatus.apply _)
  }
  final implicit val InvalidParameterCombinationExceptionDecoder: io.circe.Decoder[models.InvalidParameterCombinationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterCombinationException.apply _)
  }
  final implicit val DescribeClustersRequestDecoder: io.circe.Decoder[models.DescribeClustersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ClusterNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeClustersRequest.apply _)
  }
  final implicit val ParameterGroupNotFoundFaultDecoder: io.circe.Decoder[models.ParameterGroupNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(models.ParameterGroupNotFoundFault)
  final implicit val DeleteClusterResponseDecoder: io.circe.Decoder[models.DeleteClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.DeleteClusterResponse.apply _)
  }
  final implicit val ListTagsRequestDecoder: io.circe.Decoder[models.ListTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceName"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsRequest.apply _)
  }
  final implicit val DescribeClustersResponseDecoder: io.circe.Decoder[models.DescribeClustersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.Cluster]]]("Clusters")).mapN(models.DescribeClustersResponse.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceName"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.TagResourceRequest.apply _)
  }
  final implicit val CreateSubnetGroupRequestDecoder: io.circe.Decoder[models.CreateSubnetGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetGroupName"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.CreateSubnetGroupRequest.apply _)
  }
  final implicit val DeleteParameterGroupRequestDecoder: io.circe.Decoder[models.DeleteParameterGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ParameterGroupName").map(models.DeleteParameterGroupRequest.apply _)
  }
  final implicit val ParameterNameValueDecoder: io.circe.Decoder[models.ParameterNameValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ParameterName"), o.get[scala.Option[java.lang.String]]("ParameterValue")).mapN(models.ParameterNameValue.apply _)
  }
  final implicit val DescribeSubnetGroupsRequestDecoder: io.circe.Decoder[models.DescribeSubnetGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("SubnetGroupNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeSubnetGroupsRequest.apply _)
  }
  final implicit val InsufficientClusterCapacityFaultDecoder: io.circe.Decoder[models.InsufficientClusterCapacityFault.type] = io.circe.Decoder.decodeUnit.as(models.InsufficientClusterCapacityFault)
  final implicit val SubnetGroupAlreadyExistsFaultDecoder: io.circe.Decoder[models.SubnetGroupAlreadyExistsFault.type] = io.circe.Decoder.decodeUnit.as(models.SubnetGroupAlreadyExistsFault)
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceName"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.UntagResourceRequest.apply _)
  }
  final implicit val ClusterNotFoundFaultDecoder: io.circe.Decoder[models.ClusterNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(models.ClusterNotFoundFault)
  final implicit val ParameterGroupDecoder: io.circe.Decoder[models.ParameterGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.ParameterGroup.apply _)
  }
  final implicit val ClusterDecoder: io.circe.Decoder[models.Cluster] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("NodeIdsToRemove"), o.get[scala.Option[scala.List[models.SecurityGroupMembership]]]("SecurityGroups"), o.get[scala.Option[java.lang.String]]("SubnetGroup"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("IamRoleArn"), o.get[scala.Option[java.lang.String]]("NodeType"), o.get[scala.Option[java.lang.String]]("ClusterName"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("ClusterArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("TotalNodes"), o.get[scala.Option[scala.Int]]("ActiveNodes"), o.get[scala.Option[models.Endpoint]]("ClusterDiscoveryEndpoint"), o.get[scala.Option[models.NotificationConfiguration]]("NotificationConfiguration"), o.get[scala.Option[models.ParameterGroupStatus]]("ParameterGroup"), o.get[scala.Option[scala.List[models.Node]]]("Nodes")).mapN(models.Cluster.apply _)
  }
  final implicit val TagNotFoundFaultDecoder: io.circe.Decoder[models.TagNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(models.TagNotFoundFault)
  final implicit val TagResourceResponseDecoder: io.circe.Decoder[models.TagResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Tag]]]("Tags").map(models.TagResourceResponse.apply _)
  }
  final implicit val InvalidParameterValueExceptionDecoder: io.circe.Decoder[models.InvalidParameterValueException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterValueException.apply _)
  }
  final implicit val RebootNodeResponseDecoder: io.circe.Decoder[models.RebootNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.RebootNodeResponse.apply _)
  }
  final implicit val SecurityGroupMembershipDecoder: io.circe.Decoder[models.SecurityGroupMembership] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SecurityGroupIdentifier"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.SecurityGroupMembership.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.Event]]]("Events")).mapN(models.DescribeEventsResponse.apply _)
  }
  final implicit val InvalidParameterGroupStateFaultDecoder: io.circe.Decoder[models.InvalidParameterGroupStateFault.type] = io.circe.Decoder.decodeUnit.as(models.InvalidParameterGroupStateFault)
  final implicit val DecreaseReplicationFactorResponseDecoder: io.circe.Decoder[models.DecreaseReplicationFactorResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.DecreaseReplicationFactorResponse.apply _)
  }
  final implicit val SubnetGroupInUseFaultDecoder: io.circe.Decoder[models.SubnetGroupInUseFault.type] = io.circe.Decoder.decodeUnit.as(models.SubnetGroupInUseFault)
  final implicit val DescribeEventsRequestDecoder: io.circe.Decoder[models.DescribeEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.DescribeEventsRequest.apply _)
  }
  final implicit val InvalidSubnetDecoder: io.circe.Decoder[models.InvalidSubnet.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSubnet)
  final implicit val UpdateParameterGroupResponseDecoder: io.circe.Decoder[models.UpdateParameterGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ParameterGroup]]("ParameterGroup").map(models.UpdateParameterGroupResponse.apply _)
  }
  final implicit val DescribeDefaultParametersResponseDecoder: io.circe.Decoder[models.DescribeDefaultParametersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.Parameter]]]("Parameters")).mapN(models.DescribeDefaultParametersResponse.apply _)
  }
  final implicit val ListTagsResponseDecoder: io.circe.Decoder[models.ListTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsResponse.apply _)
  }
  final implicit val SubnetDecoder: io.circe.Decoder[models.Subnet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubnetIdentifier"), o.get[scala.Option[java.lang.String]]("SubnetAvailabilityZone")).mapN(models.Subnet.apply _)
  }
  final implicit val NodeTypeSpecificValueDecoder: io.circe.Decoder[models.NodeTypeSpecificValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeType"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.NodeTypeSpecificValue.apply _)
  }
  final implicit val CreateClusterRequestDecoder: io.circe.Decoder[models.CreateClusterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[java.lang.String]("IamRoleArn"), o.get[java.lang.String]("NodeType"), o.get[scala.Int]("ReplicationFactor"), o.get[scala.Option[java.lang.String]]("NotificationTopicArn"), o.get[scala.Option[java.lang.String]]("SubnetGroupName"), o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(models.CreateClusterRequest.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceName"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[java.time.Instant]]("Date")).mapN(models.Event.apply _)
  }
  final implicit val DescribeParameterGroupsResponseDecoder: io.circe.Decoder[models.DescribeParameterGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.ParameterGroup]]]("ParameterGroups")).mapN(models.DescribeParameterGroupsResponse.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val SubnetQuotaExceededFaultDecoder: io.circe.Decoder[models.SubnetQuotaExceededFault.type] = io.circe.Decoder.decodeUnit.as(models.SubnetQuotaExceededFault)
  final implicit val UpdateClusterResponseDecoder: io.circe.Decoder[models.UpdateClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.UpdateClusterResponse.apply _)
  }
  final implicit val NodeNotFoundFaultDecoder: io.circe.Decoder[models.NodeNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(models.NodeNotFoundFault)
  final implicit val DeleteClusterRequestDecoder: io.circe.Decoder[models.DeleteClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ClusterName").map(models.DeleteClusterRequest.apply _)
  }
  final implicit val UpdateSubnetGroupRequestDecoder: io.circe.Decoder[models.UpdateSubnetGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetGroupName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")).mapN(models.UpdateSubnetGroupRequest.apply _)
  }
  final implicit val InvalidClusterStateFaultDecoder: io.circe.Decoder[models.InvalidClusterStateFault.type] = io.circe.Decoder.decodeUnit.as(models.InvalidClusterStateFault)
  final implicit val DescribeParametersResponseDecoder: io.circe.Decoder[models.DescribeParametersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.Parameter]]]("Parameters")).mapN(models.DescribeParametersResponse.apply _)
  }
  final implicit val NodeQuotaForClusterExceededFaultDecoder: io.circe.Decoder[models.NodeQuotaForClusterExceededFault.type] = io.circe.Decoder.decodeUnit.as(models.NodeQuotaForClusterExceededFault)
  final implicit val SubnetGroupNotFoundFaultDecoder: io.circe.Decoder[models.SubnetGroupNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(models.SubnetGroupNotFoundFault)
  final implicit val DescribeSubnetGroupsResponseDecoder: io.circe.Decoder[models.DescribeSubnetGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.SubnetGroup]]]("SubnetGroups")).mapN(models.DescribeSubnetGroupsResponse.apply _)
  }
  final implicit val RebootNodeRequestDecoder: io.circe.Decoder[models.RebootNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[java.lang.String]("NodeId")).mapN(models.RebootNodeRequest.apply _)
  }
  final implicit val DescribeParameterGroupsRequestDecoder: io.circe.Decoder[models.DescribeParameterGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ParameterGroupNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeParameterGroupsRequest.apply _)
  }
  final implicit val UpdateSubnetGroupResponseDecoder: io.circe.Decoder[models.UpdateSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.SubnetGroup]]("SubnetGroup").map(models.UpdateSubnetGroupResponse.apply _)
  }
  final implicit val UpdateParameterGroupRequestDecoder: io.circe.Decoder[models.UpdateParameterGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterGroupName"), o.get[scala.List[models.ParameterNameValue]]("ParameterNameValues")).mapN(models.UpdateParameterGroupRequest.apply _)
  }
  final implicit val DeleteParameterGroupResponseDecoder: io.circe.Decoder[models.DeleteParameterGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DeletionMessage").map(models.DeleteParameterGroupResponse.apply _)
  }
}