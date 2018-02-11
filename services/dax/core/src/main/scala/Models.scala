package org.lyranthe.araethura.dax.models
import org.lyranthe.araethura.dax.models
final case class UntagResourceResponse(tags: scala.Option[scala.List[models.Tag]] = None)
case object ClusterAlreadyExistsFault
final case class UpdateClusterRequest(clusterName: java.lang.String, notificationTopicArn: scala.Option[java.lang.String] = None, parameterGroupName: scala.Option[java.lang.String] = None, preferredMaintenanceWindow: scala.Option[java.lang.String] = None, notificationTopicStatus: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, securityGroupIds: scala.Option[scala.List[java.lang.String]] = None)
final case class DescribeParametersRequest(parameterGroupName: java.lang.String, source: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
case object ParameterGroupQuotaExceededFault
final case class DescribeDefaultParametersRequest(maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class IncreaseReplicationFactorResponse(cluster: scala.Option[models.Cluster] = None)
final case class CreateParameterGroupResponse(parameterGroup: scala.Option[models.ParameterGroup] = None)
case object InvalidVPCNetworkStateFault
case object ClusterQuotaForCustomerExceededFault
final case class SubnetGroup(subnetGroupName: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, vpcId: scala.Option[java.lang.String] = None, subnets: scala.Option[scala.List[models.Subnet]] = None)
final case class DeleteSubnetGroupRequest(subnetGroupName: java.lang.String)
final case class DecreaseReplicationFactorRequest(clusterName: java.lang.String, newReplicationFactor: scala.Int, availabilityZones: scala.Option[scala.List[java.lang.String]] = None, nodeIdsToRemove: scala.Option[scala.List[java.lang.String]] = None)
case object TagQuotaPerResourceExceeded
final case class Parameter(changeType: scala.Option[java.lang.String] = None, source: scala.Option[java.lang.String] = None, dataType: scala.Option[java.lang.String] = None, allowedValues: scala.Option[java.lang.String] = None, parameterValue: scala.Option[java.lang.String] = None, parameterName: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, isModifiable: scala.Option[java.lang.String] = None, nodeTypeSpecificValues: scala.Option[scala.List[models.NodeTypeSpecificValue]] = None, parameterType: scala.Option[java.lang.String] = None)
final case class Endpoint(address: scala.Option[java.lang.String] = None, port: scala.Option[scala.Int] = None)
case object SubnetInUse
final case class NotificationConfiguration(topicArn: scala.Option[java.lang.String] = None, topicStatus: scala.Option[java.lang.String] = None)
final case class CreateClusterResponse(cluster: scala.Option[models.Cluster] = None)
final case class CreateParameterGroupRequest(parameterGroupName: java.lang.String, description: scala.Option[java.lang.String] = None)
case object NodeQuotaForCustomerExceededFault
case object InvalidARNFault
final case class Node(nodeId: scala.Option[java.lang.String] = None, availabilityZone: scala.Option[java.lang.String] = None, nodeStatus: scala.Option[java.lang.String] = None, parameterGroupStatus: scala.Option[java.lang.String] = None, endpoint: scala.Option[models.Endpoint] = None, nodeCreateTime: scala.Option[java.time.Instant] = None)
final case class IncreaseReplicationFactorRequest(clusterName: java.lang.String, newReplicationFactor: scala.Int, availabilityZones: scala.Option[scala.List[java.lang.String]] = None)
case object SubnetGroupQuotaExceededFault
final case class CreateSubnetGroupResponse(subnetGroup: scala.Option[models.SubnetGroup] = None)
case object ParameterGroupAlreadyExistsFault
final case class DeleteSubnetGroupResponse(deletionMessage: scala.Option[java.lang.String] = None)
final case class ParameterGroupStatus(parameterGroupName: scala.Option[java.lang.String] = None, parameterApplyStatus: scala.Option[java.lang.String] = None, nodeIdsToReboot: scala.Option[scala.List[java.lang.String]] = None)
final case class InvalidParameterCombinationException(message: scala.Option[java.lang.String] = None)
final case class DescribeClustersRequest(clusterNames: scala.Option[scala.List[java.lang.String]] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
case object ParameterGroupNotFoundFault
final case class DeleteClusterResponse(cluster: scala.Option[models.Cluster] = None)
final case class ListTagsRequest(resourceName: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeClustersResponse(nextToken: scala.Option[java.lang.String] = None, clusters: scala.Option[scala.List[models.Cluster]] = None)
final case class TagResourceRequest(resourceName: java.lang.String, tags: scala.List[models.Tag])
final case class CreateSubnetGroupRequest(subnetGroupName: java.lang.String, subnetIds: scala.List[java.lang.String], description: scala.Option[java.lang.String] = None)
final case class DeleteParameterGroupRequest(parameterGroupName: java.lang.String)
final case class ParameterNameValue(parameterName: scala.Option[java.lang.String] = None, parameterValue: scala.Option[java.lang.String] = None)
final case class DescribeSubnetGroupsRequest(subnetGroupNames: scala.Option[scala.List[java.lang.String]] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
case object InsufficientClusterCapacityFault
case object SubnetGroupAlreadyExistsFault
final case class UntagResourceRequest(resourceName: java.lang.String, tagKeys: scala.List[java.lang.String])
case object ClusterNotFoundFault
final case class ParameterGroup(parameterGroupName: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None)
final case class Cluster(nodeIdsToRemove: scala.Option[scala.List[java.lang.String]] = None, securityGroups: scala.Option[scala.List[models.SecurityGroupMembership]] = None, subnetGroup: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, iamRoleArn: scala.Option[java.lang.String] = None, nodeType: scala.Option[java.lang.String] = None, clusterName: scala.Option[java.lang.String] = None, preferredMaintenanceWindow: scala.Option[java.lang.String] = None, clusterArn: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, totalNodes: scala.Option[scala.Int] = None, activeNodes: scala.Option[scala.Int] = None, clusterDiscoveryEndpoint: scala.Option[models.Endpoint] = None, notificationConfiguration: scala.Option[models.NotificationConfiguration] = None, parameterGroup: scala.Option[models.ParameterGroupStatus] = None, nodes: scala.Option[scala.List[models.Node]] = None)
case object TagNotFoundFault
final case class TagResourceResponse(tags: scala.Option[scala.List[models.Tag]] = None)
final case class InvalidParameterValueException(message: scala.Option[java.lang.String] = None)
final case class RebootNodeResponse(cluster: scala.Option[models.Cluster] = None)
final case class SecurityGroupMembership(securityGroupIdentifier: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None)
final case class DescribeEventsResponse(nextToken: scala.Option[java.lang.String] = None, events: scala.Option[scala.List[models.Event]] = None)
case object InvalidParameterGroupStateFault
final case class DecreaseReplicationFactorResponse(cluster: scala.Option[models.Cluster] = None)
case object SubnetGroupInUseFault
final case class DescribeEventsRequest(sourceName: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, sourceType: scala.Option[java.lang.String] = None, startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, duration: scala.Option[scala.Int] = None, maxResults: scala.Option[scala.Int] = None)
case object InvalidSubnet
final case class UpdateParameterGroupResponse(parameterGroup: scala.Option[models.ParameterGroup] = None)
final case class DescribeDefaultParametersResponse(nextToken: scala.Option[java.lang.String] = None, parameters: scala.Option[scala.List[models.Parameter]] = None)
final case class ListTagsResponse(tags: scala.Option[scala.List[models.Tag]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Subnet(subnetIdentifier: scala.Option[java.lang.String] = None, subnetAvailabilityZone: scala.Option[java.lang.String] = None)
final case class NodeTypeSpecificValue(nodeType: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None)
final case class CreateClusterRequest(clusterName: java.lang.String, iamRoleArn: java.lang.String, nodeType: java.lang.String, replicationFactor: scala.Int, notificationTopicArn: scala.Option[java.lang.String] = None, subnetGroupName: scala.Option[java.lang.String] = None, parameterGroupName: scala.Option[java.lang.String] = None, preferredMaintenanceWindow: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, tags: scala.Option[scala.List[models.Tag]] = None, securityGroupIds: scala.Option[scala.List[java.lang.String]] = None, availabilityZones: scala.Option[scala.List[java.lang.String]] = None)
final case class Event(sourceName: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, sourceType: scala.Option[java.lang.String] = None, date: scala.Option[java.time.Instant] = None)
final case class DescribeParameterGroupsResponse(nextToken: scala.Option[java.lang.String] = None, parameterGroups: scala.Option[scala.List[models.ParameterGroup]] = None)
final case class Tag(key: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None)
case object SubnetQuotaExceededFault
final case class UpdateClusterResponse(cluster: scala.Option[models.Cluster] = None)
case object NodeNotFoundFault
final case class DeleteClusterRequest(clusterName: java.lang.String)
final case class UpdateSubnetGroupRequest(subnetGroupName: java.lang.String, description: scala.Option[java.lang.String] = None, subnetIds: scala.Option[scala.List[java.lang.String]] = None)
case object InvalidClusterStateFault
final case class DescribeParametersResponse(nextToken: scala.Option[java.lang.String] = None, parameters: scala.Option[scala.List[models.Parameter]] = None)
case object NodeQuotaForClusterExceededFault
case object SubnetGroupNotFoundFault
final case class DescribeSubnetGroupsResponse(nextToken: scala.Option[java.lang.String] = None, subnetGroups: scala.Option[scala.List[models.SubnetGroup]] = None)
final case class RebootNodeRequest(clusterName: java.lang.String, nodeId: java.lang.String)
final case class DescribeParameterGroupsRequest(parameterGroupNames: scala.Option[scala.List[java.lang.String]] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class UpdateSubnetGroupResponse(subnetGroup: scala.Option[models.SubnetGroup] = None)
final case class UpdateParameterGroupRequest(parameterGroupName: java.lang.String, parameterNameValues: scala.List[models.ParameterNameValue])
final case class DeleteParameterGroupResponse(deletionMessage: scala.Option[java.lang.String] = None)