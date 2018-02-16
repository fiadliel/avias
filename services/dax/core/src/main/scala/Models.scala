package avias.dax.models
final case class UntagResourceResponse(tags: scala.Option[scala.List[avias.dax.models.Tag]] = scala.None)
case object ClusterAlreadyExistsFault
final case class UpdateClusterRequest(clusterName: java.lang.String, notificationTopicArn: scala.Option[java.lang.String] = scala.None, parameterGroupName: scala.Option[java.lang.String] = scala.None, preferredMaintenanceWindow: scala.Option[java.lang.String] = scala.None, notificationTopicStatus: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, securityGroupIds: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class DescribeParametersRequest(parameterGroupName: java.lang.String, source: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object ParameterGroupQuotaExceededFault
final case class DescribeDefaultParametersRequest(maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class IncreaseReplicationFactorResponse(cluster: scala.Option[avias.dax.models.Cluster] = scala.None)
final case class CreateParameterGroupResponse(parameterGroup: scala.Option[avias.dax.models.ParameterGroup] = scala.None)
case object InvalidVPCNetworkStateFault
case object ClusterQuotaForCustomerExceededFault
final case class SubnetGroup(subnetGroupName: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, vpcId: scala.Option[java.lang.String] = scala.None, subnets: scala.Option[scala.List[avias.dax.models.Subnet]] = scala.None)
final case class DeleteSubnetGroupRequest(subnetGroupName: java.lang.String)
final case class DecreaseReplicationFactorRequest(clusterName: java.lang.String, newReplicationFactor: scala.Int, availabilityZones: scala.Option[scala.List[java.lang.String]] = scala.None, nodeIdsToRemove: scala.Option[scala.List[java.lang.String]] = scala.None)
case object TagQuotaPerResourceExceeded
final case class Parameter(changeType: scala.Option[java.lang.String] = scala.None, source: scala.Option[java.lang.String] = scala.None, dataType: scala.Option[java.lang.String] = scala.None, allowedValues: scala.Option[java.lang.String] = scala.None, parameterValue: scala.Option[java.lang.String] = scala.None, parameterName: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, isModifiable: scala.Option[java.lang.String] = scala.None, nodeTypeSpecificValues: scala.Option[scala.List[avias.dax.models.NodeTypeSpecificValue]] = scala.None, parameterType: scala.Option[java.lang.String] = scala.None)
final case class Endpoint(address: scala.Option[java.lang.String] = scala.None, port: scala.Option[scala.Int] = scala.None)
case object SubnetInUse
final case class NotificationConfiguration(topicArn: scala.Option[java.lang.String] = scala.None, topicStatus: scala.Option[java.lang.String] = scala.None)
final case class CreateClusterResponse(cluster: scala.Option[avias.dax.models.Cluster] = scala.None)
final case class CreateParameterGroupRequest(parameterGroupName: java.lang.String, description: scala.Option[java.lang.String] = scala.None)
case object NodeQuotaForCustomerExceededFault
case object InvalidARNFault
final case class Node(nodeId: scala.Option[java.lang.String] = scala.None, availabilityZone: scala.Option[java.lang.String] = scala.None, nodeStatus: scala.Option[java.lang.String] = scala.None, parameterGroupStatus: scala.Option[java.lang.String] = scala.None, endpoint: scala.Option[avias.dax.models.Endpoint] = scala.None, nodeCreateTime: scala.Option[java.time.Instant] = scala.None)
final case class IncreaseReplicationFactorRequest(clusterName: java.lang.String, newReplicationFactor: scala.Int, availabilityZones: scala.Option[scala.List[java.lang.String]] = scala.None)
case object SubnetGroupQuotaExceededFault
final case class CreateSubnetGroupResponse(subnetGroup: scala.Option[avias.dax.models.SubnetGroup] = scala.None)
case object ParameterGroupAlreadyExistsFault
final case class DeleteSubnetGroupResponse(deletionMessage: scala.Option[java.lang.String] = scala.None)
final case class ParameterGroupStatus(parameterGroupName: scala.Option[java.lang.String] = scala.None, parameterApplyStatus: scala.Option[java.lang.String] = scala.None, nodeIdsToReboot: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class InvalidParameterCombinationException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeClustersRequest(clusterNames: scala.Option[scala.List[java.lang.String]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object ParameterGroupNotFoundFault
final case class DeleteClusterResponse(cluster: scala.Option[avias.dax.models.Cluster] = scala.None)
final case class ListTagsRequest(resourceName: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeClustersResponse(nextToken: scala.Option[java.lang.String] = scala.None, clusters: scala.Option[scala.List[avias.dax.models.Cluster]] = scala.None)
final case class TagResourceRequest(resourceName: java.lang.String, tags: scala.List[avias.dax.models.Tag])
final case class CreateSubnetGroupRequest(subnetGroupName: java.lang.String, subnetIds: scala.List[java.lang.String], description: scala.Option[java.lang.String] = scala.None)
final case class DeleteParameterGroupRequest(parameterGroupName: java.lang.String)
final case class ParameterNameValue(parameterName: scala.Option[java.lang.String] = scala.None, parameterValue: scala.Option[java.lang.String] = scala.None)
final case class DescribeSubnetGroupsRequest(subnetGroupNames: scala.Option[scala.List[java.lang.String]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InsufficientClusterCapacityFault
case object SubnetGroupAlreadyExistsFault
final case class UntagResourceRequest(resourceName: java.lang.String, tagKeys: scala.List[java.lang.String])
case object ClusterNotFoundFault
final case class ParameterGroup(parameterGroupName: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None)
final case class Cluster(nodeIdsToRemove: scala.Option[scala.List[java.lang.String]] = scala.None, securityGroups: scala.Option[scala.List[avias.dax.models.SecurityGroupMembership]] = scala.None, subnetGroup: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, iamRoleArn: scala.Option[java.lang.String] = scala.None, nodeType: scala.Option[java.lang.String] = scala.None, clusterName: scala.Option[java.lang.String] = scala.None, preferredMaintenanceWindow: scala.Option[java.lang.String] = scala.None, clusterArn: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, totalNodes: scala.Option[scala.Int] = scala.None, activeNodes: scala.Option[scala.Int] = scala.None, clusterDiscoveryEndpoint: scala.Option[avias.dax.models.Endpoint] = scala.None, notificationConfiguration: scala.Option[avias.dax.models.NotificationConfiguration] = scala.None, parameterGroup: scala.Option[avias.dax.models.ParameterGroupStatus] = scala.None, nodes: scala.Option[scala.List[avias.dax.models.Node]] = scala.None)
case object TagNotFoundFault
final case class TagResourceResponse(tags: scala.Option[scala.List[avias.dax.models.Tag]] = scala.None)
final case class InvalidParameterValueException(message: scala.Option[java.lang.String] = scala.None)
final case class RebootNodeResponse(cluster: scala.Option[avias.dax.models.Cluster] = scala.None)
final case class SecurityGroupMembership(securityGroupIdentifier: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class DescribeEventsResponse(nextToken: scala.Option[java.lang.String] = scala.None, events: scala.Option[scala.List[avias.dax.models.Event]] = scala.None)
case object InvalidParameterGroupStateFault
final case class DecreaseReplicationFactorResponse(cluster: scala.Option[avias.dax.models.Cluster] = scala.None)
case object SubnetGroupInUseFault
final case class DescribeEventsRequest(sourceName: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, sourceType: scala.Option[java.lang.String] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, duration: scala.Option[scala.Int] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object InvalidSubnet
final case class UpdateParameterGroupResponse(parameterGroup: scala.Option[avias.dax.models.ParameterGroup] = scala.None)
final case class DescribeDefaultParametersResponse(nextToken: scala.Option[java.lang.String] = scala.None, parameters: scala.Option[scala.List[avias.dax.models.Parameter]] = scala.None)
final case class ListTagsResponse(tags: scala.Option[scala.List[avias.dax.models.Tag]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Subnet(subnetIdentifier: scala.Option[java.lang.String] = scala.None, subnetAvailabilityZone: scala.Option[java.lang.String] = scala.None)
final case class NodeTypeSpecificValue(nodeType: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class CreateClusterRequest(clusterName: java.lang.String, iamRoleArn: java.lang.String, nodeType: java.lang.String, replicationFactor: scala.Int, notificationTopicArn: scala.Option[java.lang.String] = scala.None, subnetGroupName: scala.Option[java.lang.String] = scala.None, parameterGroupName: scala.Option[java.lang.String] = scala.None, preferredMaintenanceWindow: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[avias.dax.models.Tag]] = scala.None, securityGroupIds: scala.Option[scala.List[java.lang.String]] = scala.None, availabilityZones: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class Event(sourceName: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, sourceType: scala.Option[java.lang.String] = scala.None, date: scala.Option[java.time.Instant] = scala.None)
final case class DescribeParameterGroupsResponse(nextToken: scala.Option[java.lang.String] = scala.None, parameterGroups: scala.Option[scala.List[avias.dax.models.ParameterGroup]] = scala.None)
final case class Tag(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
case object SubnetQuotaExceededFault
final case class UpdateClusterResponse(cluster: scala.Option[avias.dax.models.Cluster] = scala.None)
case object NodeNotFoundFault
final case class DeleteClusterRequest(clusterName: java.lang.String)
final case class UpdateSubnetGroupRequest(subnetGroupName: java.lang.String, description: scala.Option[java.lang.String] = scala.None, subnetIds: scala.Option[scala.List[java.lang.String]] = scala.None)
case object InvalidClusterStateFault
final case class DescribeParametersResponse(nextToken: scala.Option[java.lang.String] = scala.None, parameters: scala.Option[scala.List[avias.dax.models.Parameter]] = scala.None)
case object NodeQuotaForClusterExceededFault
case object SubnetGroupNotFoundFault
final case class DescribeSubnetGroupsResponse(nextToken: scala.Option[java.lang.String] = scala.None, subnetGroups: scala.Option[scala.List[avias.dax.models.SubnetGroup]] = scala.None)
final case class RebootNodeRequest(clusterName: java.lang.String, nodeId: java.lang.String)
final case class DescribeParameterGroupsRequest(parameterGroupNames: scala.Option[scala.List[java.lang.String]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateSubnetGroupResponse(subnetGroup: scala.Option[avias.dax.models.SubnetGroup] = scala.None)
final case class UpdateParameterGroupRequest(parameterGroupName: java.lang.String, parameterNameValues: scala.List[avias.dax.models.ParameterNameValue])
final case class DeleteParameterGroupResponse(deletionMessage: scala.Option[java.lang.String] = scala.None)