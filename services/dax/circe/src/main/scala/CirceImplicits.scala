package org.lyranthe.araethura.dax
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val UntagResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UntagResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val ClusterAlreadyExistsFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ClusterAlreadyExistsFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateClusterRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UpdateClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NotificationTopicArn" -> o.notificationTopicArn.asJson, "ParameterGroupName" -> o.parameterGroupName.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "NotificationTopicStatus" -> o.notificationTopicStatus.asJson, "Description" -> o.description.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson)
  }
  final implicit val DescribeParametersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "Source" -> o.source.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ParameterGroupQuotaExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ParameterGroupQuotaExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDefaultParametersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeDefaultParametersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val IncreaseReplicationFactorResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.IncreaseReplicationFactorResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val CreateParameterGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.CreateParameterGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroup" -> o.parameterGroup.asJson)
  }
  final implicit val InvalidVPCNetworkStateFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidVPCNetworkStateFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ClusterQuotaForCustomerExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ClusterQuotaForCustomerExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SubnetGroupEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetGroup] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson, "Description" -> o.description.asJson, "VpcId" -> o.vpcId.asJson, "Subnets" -> o.subnets.asJson)
  }
  final implicit val DeleteSubnetGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DeleteSubnetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson)
  }
  final implicit val DecreaseReplicationFactorRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DecreaseReplicationFactorRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NewReplicationFactor" -> o.newReplicationFactor.asJson, "AvailabilityZones" -> o.availabilityZones.asJson, "NodeIdsToRemove" -> o.nodeIdsToRemove.asJson)
  }
  final implicit val TagQuotaPerResourceExceededEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.TagQuotaPerResourceExceeded.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Parameter] = io.circe.Encoder.instance { o => 
    Json.obj("ChangeType" -> o.changeType.asJson, "Source" -> o.source.asJson, "DataType" -> o.dataType.asJson, "AllowedValues" -> o.allowedValues.asJson, "ParameterValue" -> o.parameterValue.asJson, "ParameterName" -> o.parameterName.asJson, "Description" -> o.description.asJson, "IsModifiable" -> o.isModifiable.asJson, "NodeTypeSpecificValues" -> o.nodeTypeSpecificValues.asJson, "ParameterType" -> o.parameterType.asJson)
  }
  final implicit val EndpointEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Endpoint] = io.circe.Encoder.instance { o => 
    Json.obj("Address" -> o.address.asJson, "Port" -> o.port.asJson)
  }
  final implicit val SubnetInUseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetInUse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotificationConfigurationEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.NotificationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("TopicArn" -> o.topicArn.asJson, "TopicStatus" -> o.topicStatus.asJson)
  }
  final implicit val CreateClusterResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.CreateClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val CreateParameterGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.CreateParameterGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val NodeQuotaForCustomerExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.NodeQuotaForCustomerExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidARNFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidARNFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NodeEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Node] = io.circe.Encoder.instance { o => 
    Json.obj("NodeId" -> o.nodeId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "NodeStatus" -> o.nodeStatus.asJson, "ParameterGroupStatus" -> o.parameterGroupStatus.asJson, "Endpoint" -> o.endpoint.asJson, "NodeCreateTime" -> o.nodeCreateTime.asJson)
  }
  final implicit val IncreaseReplicationFactorRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.IncreaseReplicationFactorRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NewReplicationFactor" -> o.newReplicationFactor.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val SubnetGroupQuotaExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetGroupQuotaExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateSubnetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.CreateSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroup" -> o.subnetGroup.asJson)
  }
  final implicit val ParameterGroupAlreadyExistsFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ParameterGroupAlreadyExistsFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteSubnetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DeleteSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeletionMessage" -> o.deletionMessage.asJson)
  }
  final implicit val ParameterGroupStatusEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ParameterGroupStatus] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "ParameterApplyStatus" -> o.parameterApplyStatus.asJson, "NodeIdsToReboot" -> o.nodeIdsToReboot.asJson)
  }
  final implicit val InvalidParameterCombinationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidParameterCombinationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeClustersRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterNames" -> o.clusterNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ParameterGroupNotFoundFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ParameterGroupNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteClusterResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DeleteClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val ListTagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ListTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceName" -> o.resourceName.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeClustersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeClustersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Clusters" -> o.clusters.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceName" -> o.resourceName.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val CreateSubnetGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.CreateSubnetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson, "SubnetIds" -> o.subnetIds.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DeleteParameterGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DeleteParameterGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson)
  }
  final implicit val ParameterNameValueEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ParameterNameValue] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterName" -> o.parameterName.asJson, "ParameterValue" -> o.parameterValue.asJson)
  }
  final implicit val DescribeSubnetGroupsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeSubnetGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupNames" -> o.subnetGroupNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InsufficientClusterCapacityFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InsufficientClusterCapacityFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SubnetGroupAlreadyExistsFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetGroupAlreadyExistsFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceName" -> o.resourceName.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val ClusterNotFoundFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ClusterNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterGroupEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ParameterGroup] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "Description" -> o.description.asJson)
  }
  final implicit val ClusterEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Cluster] = io.circe.Encoder.instance { o => 
    Json.obj("NodeIdsToRemove" -> o.nodeIdsToRemove.asJson, "SecurityGroups" -> o.securityGroups.asJson, "SubnetGroup" -> o.subnetGroup.asJson, "Status" -> o.status.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "NodeType" -> o.nodeType.asJson, "ClusterName" -> o.clusterName.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "ClusterArn" -> o.clusterArn.asJson, "Description" -> o.description.asJson, "TotalNodes" -> o.totalNodes.asJson, "ActiveNodes" -> o.activeNodes.asJson, "ClusterDiscoveryEndpoint" -> o.clusterDiscoveryEndpoint.asJson, "NotificationConfiguration" -> o.notificationConfiguration.asJson, "ParameterGroup" -> o.parameterGroup.asJson, "Nodes" -> o.nodes.asJson)
  }
  final implicit val TagNotFoundFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.TagNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagResourceResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.TagResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson)
  }
  final implicit val InvalidParameterValueExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidParameterValueException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RebootNodeResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.RebootNodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val SecurityGroupMembershipEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SecurityGroupMembership] = io.circe.Encoder.instance { o => 
    Json.obj("SecurityGroupIdentifier" -> o.securityGroupIdentifier.asJson, "Status" -> o.status.asJson)
  }
  final implicit val DescribeEventsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Events" -> o.events.asJson)
  }
  final implicit val InvalidParameterGroupStateFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidParameterGroupStateFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DecreaseReplicationFactorResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DecreaseReplicationFactorResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val SubnetGroupInUseFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetGroupInUseFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeEventsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SourceName" -> o.sourceName.asJson, "NextToken" -> o.nextToken.asJson, "SourceType" -> o.sourceType.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Duration" -> o.duration.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val InvalidSubnetEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidSubnet.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateParameterGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UpdateParameterGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroup" -> o.parameterGroup.asJson)
  }
  final implicit val DescribeDefaultParametersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeDefaultParametersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val ListTagsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.ListTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val SubnetEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Subnet] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetIdentifier" -> o.subnetIdentifier.asJson, "SubnetAvailabilityZone" -> o.subnetAvailabilityZone.asJson)
  }
  final implicit val NodeTypeSpecificValueEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.NodeTypeSpecificValue] = io.circe.Encoder.instance { o => 
    Json.obj("NodeType" -> o.nodeType.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CreateClusterRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.CreateClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "NodeType" -> o.nodeType.asJson, "ReplicationFactor" -> o.replicationFactor.asJson, "NotificationTopicArn" -> o.notificationTopicArn.asJson, "SubnetGroupName" -> o.subnetGroupName.asJson, "ParameterGroupName" -> o.parameterGroupName.asJson, "PreferredMaintenanceWindow" -> o.preferredMaintenanceWindow.asJson, "Description" -> o.description.asJson, "Tags" -> o.tags.asJson, "SecurityGroupIds" -> o.securityGroupIds.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("SourceName" -> o.sourceName.asJson, "Message" -> o.message.asJson, "SourceType" -> o.sourceType.asJson, "Date" -> o.date.asJson)
  }
  final implicit val DescribeParameterGroupsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeParameterGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "ParameterGroups" -> o.parameterGroups.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val SubnetQuotaExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetQuotaExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateClusterResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UpdateClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val NodeNotFoundFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.NodeNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteClusterRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DeleteClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson)
  }
  final implicit val UpdateSubnetGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UpdateSubnetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroupName" -> o.subnetGroupName.asJson, "Description" -> o.description.asJson, "SubnetIds" -> o.subnetIds.asJson)
  }
  final implicit val InvalidClusterStateFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.InvalidClusterStateFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeParametersResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeParametersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val NodeQuotaForClusterExceededFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.NodeQuotaForClusterExceededFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SubnetGroupNotFoundFaultEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.SubnetGroupNotFoundFault.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubnetGroupsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeSubnetGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "SubnetGroups" -> o.subnetGroups.asJson)
  }
  final implicit val RebootNodeRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.RebootNodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterName" -> o.clusterName.asJson, "NodeId" -> o.nodeId.asJson)
  }
  final implicit val DescribeParameterGroupsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DescribeParameterGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupNames" -> o.parameterGroupNames.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateSubnetGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UpdateSubnetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetGroup" -> o.subnetGroup.asJson)
  }
  final implicit val UpdateParameterGroupRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.UpdateParameterGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterGroupName" -> o.parameterGroupName.asJson, "ParameterNameValues" -> o.parameterNameValues.asJson)
  }
  final implicit val DeleteParameterGroupResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.dax.models.DeleteParameterGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeletionMessage" -> o.deletionMessage.asJson)
  }
  final implicit val UntagResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UntagResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Tag]]]("Tags").map(org.lyranthe.araethura.dax.models.UntagResourceResponse.apply _)
  }
  final implicit val ClusterAlreadyExistsFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ClusterAlreadyExistsFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.ClusterAlreadyExistsFault)
  final implicit val UpdateClusterRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UpdateClusterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[scala.Option[java.lang.String]]("NotificationTopicArn"), o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("NotificationTopicStatus"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds")).mapN(org.lyranthe.araethura.dax.models.UpdateClusterRequest.apply _)
  }
  final implicit val DescribeParametersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeParametersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("Source"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.dax.models.DescribeParametersRequest.apply _)
  }
  final implicit val ParameterGroupQuotaExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ParameterGroupQuotaExceededFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.ParameterGroupQuotaExceededFault)
  final implicit val DescribeDefaultParametersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeDefaultParametersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.dax.models.DescribeDefaultParametersRequest.apply _)
  }
  final implicit val IncreaseReplicationFactorResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.IncreaseReplicationFactorResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.Cluster]]("Cluster").map(org.lyranthe.araethura.dax.models.IncreaseReplicationFactorResponse.apply _)
  }
  final implicit val CreateParameterGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.CreateParameterGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.ParameterGroup]]("ParameterGroup").map(org.lyranthe.araethura.dax.models.CreateParameterGroupResponse.apply _)
  }
  final implicit val InvalidVPCNetworkStateFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidVPCNetworkStateFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.InvalidVPCNetworkStateFault)
  final implicit val ClusterQuotaForCustomerExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ClusterQuotaForCustomerExceededFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.ClusterQuotaForCustomerExceededFault)
  final implicit val SubnetGroupDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubnetGroupName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Subnet]]]("Subnets")).mapN(org.lyranthe.araethura.dax.models.SubnetGroup.apply _)
  }
  final implicit val DeleteSubnetGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DeleteSubnetGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("SubnetGroupName").map(org.lyranthe.araethura.dax.models.DeleteSubnetGroupRequest.apply _)
  }
  final implicit val DecreaseReplicationFactorRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DecreaseReplicationFactorRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[scala.Int]("NewReplicationFactor"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones"), o.get[scala.Option[scala.List[java.lang.String]]]("NodeIdsToRemove")).mapN(org.lyranthe.araethura.dax.models.DecreaseReplicationFactorRequest.apply _)
  }
  final implicit val TagQuotaPerResourceExceededDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.TagQuotaPerResourceExceeded.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.TagQuotaPerResourceExceeded)
  final implicit val ParameterDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Parameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChangeType"), o.get[scala.Option[java.lang.String]]("Source"), o.get[scala.Option[java.lang.String]]("DataType"), o.get[scala.Option[java.lang.String]]("AllowedValues"), o.get[scala.Option[java.lang.String]]("ParameterValue"), o.get[scala.Option[java.lang.String]]("ParameterName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("IsModifiable"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.NodeTypeSpecificValue]]]("NodeTypeSpecificValues"), o.get[scala.Option[java.lang.String]]("ParameterType")).mapN(org.lyranthe.araethura.dax.models.Parameter.apply _)
  }
  final implicit val EndpointDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Endpoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Address"), o.get[scala.Option[scala.Int]]("Port")).mapN(org.lyranthe.araethura.dax.models.Endpoint.apply _)
  }
  final implicit val SubnetInUseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetInUse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.SubnetInUse)
  final implicit val NotificationConfigurationDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.NotificationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TopicArn"), o.get[scala.Option[java.lang.String]]("TopicStatus")).mapN(org.lyranthe.araethura.dax.models.NotificationConfiguration.apply _)
  }
  final implicit val CreateClusterResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.CreateClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.Cluster]]("Cluster").map(org.lyranthe.araethura.dax.models.CreateClusterResponse.apply _)
  }
  final implicit val CreateParameterGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.CreateParameterGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.dax.models.CreateParameterGroupRequest.apply _)
  }
  final implicit val NodeQuotaForCustomerExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.NodeQuotaForCustomerExceededFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.NodeQuotaForCustomerExceededFault)
  final implicit val InvalidARNFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidARNFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.InvalidARNFault)
  final implicit val NodeDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Node] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("NodeStatus"), o.get[scala.Option[java.lang.String]]("ParameterGroupStatus"), o.get[scala.Option[org.lyranthe.araethura.dax.models.Endpoint]]("Endpoint"), o.get[scala.Option[java.time.Instant]]("NodeCreateTime")).mapN(org.lyranthe.araethura.dax.models.Node.apply _)
  }
  final implicit val IncreaseReplicationFactorRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.IncreaseReplicationFactorRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[scala.Int]("NewReplicationFactor"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(org.lyranthe.araethura.dax.models.IncreaseReplicationFactorRequest.apply _)
  }
  final implicit val SubnetGroupQuotaExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetGroupQuotaExceededFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.SubnetGroupQuotaExceededFault)
  final implicit val CreateSubnetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.CreateSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.SubnetGroup]]("SubnetGroup").map(org.lyranthe.araethura.dax.models.CreateSubnetGroupResponse.apply _)
  }
  final implicit val ParameterGroupAlreadyExistsFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ParameterGroupAlreadyExistsFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.ParameterGroupAlreadyExistsFault)
  final implicit val DeleteSubnetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DeleteSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DeletionMessage").map(org.lyranthe.araethura.dax.models.DeleteSubnetGroupResponse.apply _)
  }
  final implicit val ParameterGroupStatusDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ParameterGroupStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("ParameterApplyStatus"), o.get[scala.Option[scala.List[java.lang.String]]]("NodeIdsToReboot")).mapN(org.lyranthe.araethura.dax.models.ParameterGroupStatus.apply _)
  }
  final implicit val InvalidParameterCombinationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidParameterCombinationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dax.models.InvalidParameterCombinationException.apply _)
  }
  final implicit val DescribeClustersRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeClustersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ClusterNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.dax.models.DescribeClustersRequest.apply _)
  }
  final implicit val ParameterGroupNotFoundFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ParameterGroupNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.ParameterGroupNotFoundFault)
  final implicit val DeleteClusterResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DeleteClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.Cluster]]("Cluster").map(org.lyranthe.araethura.dax.models.DeleteClusterResponse.apply _)
  }
  final implicit val ListTagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ListTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceName"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.dax.models.ListTagsRequest.apply _)
  }
  final implicit val DescribeClustersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeClustersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Cluster]]]("Clusters")).mapN(org.lyranthe.araethura.dax.models.DescribeClustersResponse.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceName"), o.get[scala.List[org.lyranthe.araethura.dax.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.dax.models.TagResourceRequest.apply _)
  }
  final implicit val CreateSubnetGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.CreateSubnetGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetGroupName"), o.get[scala.List[java.lang.String]]("SubnetIds"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.dax.models.CreateSubnetGroupRequest.apply _)
  }
  final implicit val DeleteParameterGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DeleteParameterGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ParameterGroupName").map(org.lyranthe.araethura.dax.models.DeleteParameterGroupRequest.apply _)
  }
  final implicit val ParameterNameValueDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ParameterNameValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ParameterName"), o.get[scala.Option[java.lang.String]]("ParameterValue")).mapN(org.lyranthe.araethura.dax.models.ParameterNameValue.apply _)
  }
  final implicit val DescribeSubnetGroupsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeSubnetGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("SubnetGroupNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.dax.models.DescribeSubnetGroupsRequest.apply _)
  }
  final implicit val InsufficientClusterCapacityFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InsufficientClusterCapacityFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.InsufficientClusterCapacityFault)
  final implicit val SubnetGroupAlreadyExistsFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetGroupAlreadyExistsFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.SubnetGroupAlreadyExistsFault)
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceName"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(org.lyranthe.araethura.dax.models.UntagResourceRequest.apply _)
  }
  final implicit val ClusterNotFoundFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ClusterNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.ClusterNotFoundFault)
  final implicit val ParameterGroupDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ParameterGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.dax.models.ParameterGroup.apply _)
  }
  final implicit val ClusterDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Cluster] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("NodeIdsToRemove"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.SecurityGroupMembership]]]("SecurityGroups"), o.get[scala.Option[java.lang.String]]("SubnetGroup"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("IamRoleArn"), o.get[scala.Option[java.lang.String]]("NodeType"), o.get[scala.Option[java.lang.String]]("ClusterName"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("ClusterArn"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("TotalNodes"), o.get[scala.Option[scala.Int]]("ActiveNodes"), o.get[scala.Option[org.lyranthe.araethura.dax.models.Endpoint]]("ClusterDiscoveryEndpoint"), o.get[scala.Option[org.lyranthe.araethura.dax.models.NotificationConfiguration]]("NotificationConfiguration"), o.get[scala.Option[org.lyranthe.araethura.dax.models.ParameterGroupStatus]]("ParameterGroup"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Node]]]("Nodes")).mapN(org.lyranthe.araethura.dax.models.Cluster.apply _)
  }
  final implicit val TagNotFoundFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.TagNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.TagNotFoundFault)
  final implicit val TagResourceResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.TagResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Tag]]]("Tags").map(org.lyranthe.araethura.dax.models.TagResourceResponse.apply _)
  }
  final implicit val InvalidParameterValueExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidParameterValueException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dax.models.InvalidParameterValueException.apply _)
  }
  final implicit val RebootNodeResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.RebootNodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.Cluster]]("Cluster").map(org.lyranthe.araethura.dax.models.RebootNodeResponse.apply _)
  }
  final implicit val SecurityGroupMembershipDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SecurityGroupMembership] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SecurityGroupIdentifier"), o.get[scala.Option[java.lang.String]]("Status")).mapN(org.lyranthe.araethura.dax.models.SecurityGroupMembership.apply _)
  }
  final implicit val DescribeEventsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Event]]]("Events")).mapN(org.lyranthe.araethura.dax.models.DescribeEventsResponse.apply _)
  }
  final implicit val InvalidParameterGroupStateFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidParameterGroupStateFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.InvalidParameterGroupStateFault)
  final implicit val DecreaseReplicationFactorResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DecreaseReplicationFactorResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.Cluster]]("Cluster").map(org.lyranthe.araethura.dax.models.DecreaseReplicationFactorResponse.apply _)
  }
  final implicit val SubnetGroupInUseFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetGroupInUseFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.SubnetGroupInUseFault)
  final implicit val DescribeEventsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceName"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.Int]]("Duration"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.dax.models.DescribeEventsRequest.apply _)
  }
  final implicit val InvalidSubnetDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidSubnet.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.InvalidSubnet)
  final implicit val UpdateParameterGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UpdateParameterGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.ParameterGroup]]("ParameterGroup").map(org.lyranthe.araethura.dax.models.UpdateParameterGroupResponse.apply _)
  }
  final implicit val DescribeDefaultParametersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeDefaultParametersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Parameter]]]("Parameters")).mapN(org.lyranthe.araethura.dax.models.DescribeDefaultParametersResponse.apply _)
  }
  final implicit val ListTagsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.ListTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.dax.models.ListTagsResponse.apply _)
  }
  final implicit val SubnetDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Subnet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SubnetIdentifier"), o.get[scala.Option[java.lang.String]]("SubnetAvailabilityZone")).mapN(org.lyranthe.araethura.dax.models.Subnet.apply _)
  }
  final implicit val NodeTypeSpecificValueDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.NodeTypeSpecificValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NodeType"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.dax.models.NodeTypeSpecificValue.apply _)
  }
  final implicit val CreateClusterRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.CreateClusterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[java.lang.String]("IamRoleArn"), o.get[java.lang.String]("NodeType"), o.get[scala.Int]("ReplicationFactor"), o.get[scala.Option[java.lang.String]]("NotificationTopicArn"), o.get[scala.Option[java.lang.String]]("SubnetGroupName"), o.get[scala.Option[java.lang.String]]("ParameterGroupName"), o.get[scala.Option[java.lang.String]]("PreferredMaintenanceWindow"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Tag]]]("Tags"), o.get[scala.Option[scala.List[java.lang.String]]]("SecurityGroupIds"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(org.lyranthe.araethura.dax.models.CreateClusterRequest.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceName"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("SourceType"), o.get[scala.Option[java.time.Instant]]("Date")).mapN(org.lyranthe.araethura.dax.models.Event.apply _)
  }
  final implicit val DescribeParameterGroupsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeParameterGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.ParameterGroup]]]("ParameterGroups")).mapN(org.lyranthe.araethura.dax.models.DescribeParameterGroupsResponse.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.dax.models.Tag.apply _)
  }
  final implicit val SubnetQuotaExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetQuotaExceededFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.SubnetQuotaExceededFault)
  final implicit val UpdateClusterResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UpdateClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.Cluster]]("Cluster").map(org.lyranthe.araethura.dax.models.UpdateClusterResponse.apply _)
  }
  final implicit val NodeNotFoundFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.NodeNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.NodeNotFoundFault)
  final implicit val DeleteClusterRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DeleteClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ClusterName").map(org.lyranthe.araethura.dax.models.DeleteClusterRequest.apply _)
  }
  final implicit val UpdateSubnetGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UpdateSubnetGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetGroupName"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.List[java.lang.String]]]("SubnetIds")).mapN(org.lyranthe.araethura.dax.models.UpdateSubnetGroupRequest.apply _)
  }
  final implicit val InvalidClusterStateFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.InvalidClusterStateFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.InvalidClusterStateFault)
  final implicit val DescribeParametersResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeParametersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.Parameter]]]("Parameters")).mapN(org.lyranthe.araethura.dax.models.DescribeParametersResponse.apply _)
  }
  final implicit val NodeQuotaForClusterExceededFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.NodeQuotaForClusterExceededFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.NodeQuotaForClusterExceededFault)
  final implicit val SubnetGroupNotFoundFaultDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.SubnetGroupNotFoundFault.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.dax.models.SubnetGroupNotFoundFault)
  final implicit val DescribeSubnetGroupsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeSubnetGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dax.models.SubnetGroup]]]("SubnetGroups")).mapN(org.lyranthe.araethura.dax.models.DescribeSubnetGroupsResponse.apply _)
  }
  final implicit val RebootNodeRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.RebootNodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterName"), o.get[java.lang.String]("NodeId")).mapN(org.lyranthe.araethura.dax.models.RebootNodeRequest.apply _)
  }
  final implicit val DescribeParameterGroupsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DescribeParameterGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ParameterGroupNames"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.dax.models.DescribeParameterGroupsRequest.apply _)
  }
  final implicit val UpdateSubnetGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UpdateSubnetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dax.models.SubnetGroup]]("SubnetGroup").map(org.lyranthe.araethura.dax.models.UpdateSubnetGroupResponse.apply _)
  }
  final implicit val UpdateParameterGroupRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.UpdateParameterGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterGroupName"), o.get[scala.List[org.lyranthe.araethura.dax.models.ParameterNameValue]]("ParameterNameValues")).mapN(org.lyranthe.araethura.dax.models.UpdateParameterGroupRequest.apply _)
  }
  final implicit val DeleteParameterGroupResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.dax.models.DeleteParameterGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DeletionMessage").map(org.lyranthe.araethura.dax.models.DeleteParameterGroupResponse.apply _)
  }
}