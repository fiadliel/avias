package org.lyranthe.araethura.ecs
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListContainerInstancesRequestEncoder: io.circe.Encoder[models.ListContainerInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson, "status" -> o.status.asJson)
  }
  final implicit val ClusterNotFoundExceptionEncoder: io.circe.Encoder[models.ClusterNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RegisterTaskDefinitionRequestEncoder: io.circe.Encoder[models.RegisterTaskDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("family" -> o.family.asJson, "containerDefinitions" -> o.containerDefinitions.asJson, "volumes" -> o.volumes.asJson, "taskRoleArn" -> o.taskRoleArn.asJson, "placementConstraints" -> o.placementConstraints.asJson, "networkMode" -> o.networkMode.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val VolumeEncoder: io.circe.Encoder[models.Volume] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "host" -> o.host.asJson)
  }
  final implicit val ListTaskDefinitionsRequestEncoder: io.circe.Encoder[models.ListTaskDefinitionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("familyPrefix" -> o.familyPrefix.asJson, "nextToken" -> o.nextToken.asJson, "status" -> o.status.asJson, "sort" -> o.sort.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ClientExceptionEncoder: io.circe.Encoder[models.ClientException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteAttributesRequestEncoder: io.circe.Encoder[models.DeleteAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val PlacementConstraintEncoder: io.circe.Encoder[models.PlacementConstraint] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "expression" -> o.expression.asJson)
  }
  final implicit val ListTaskDefinitionFamiliesResponseEncoder: io.circe.Encoder[models.ListTaskDefinitionFamiliesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("families" -> o.families.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTasksResponseEncoder: io.circe.Encoder[models.DescribeTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val ServerExceptionEncoder: io.circe.Encoder[models.ServerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LogConfigurationEncoder: io.circe.Encoder[models.LogConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("logDriver" -> o.logDriver.asJson, "options" -> o.options.asJson)
  }
  final implicit val DiscoverPollEndpointResponseEncoder: io.circe.Encoder[models.DiscoverPollEndpointResponse] = io.circe.Encoder.instance { o => 
    Json.obj("endpoint" -> o.endpoint.asJson, "telemetryEndpoint" -> o.telemetryEndpoint.asJson)
  }
  final implicit val PutAttributesRequestEncoder: io.circe.Encoder[models.PutAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val UpdateContainerAgentRequestEncoder: io.circe.Encoder[models.UpdateContainerAgentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val ListServicesResponseEncoder: io.circe.Encoder[models.ListServicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("serviceArns" -> o.serviceArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateClusterResponseEncoder: io.circe.Encoder[models.CreateClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson)
  }
  final implicit val KernelCapabilitiesEncoder: io.circe.Encoder[models.KernelCapabilities] = io.circe.Encoder.instance { o => 
    Json.obj("add" -> o.add.asJson, "drop" -> o.drop.asJson)
  }
  final implicit val SubmitTaskStateChangeRequestEncoder: io.circe.Encoder[models.SubmitTaskStateChangeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "task" -> o.task.asJson, "status" -> o.status.asJson, "reason" -> o.reason.asJson, "containers" -> o.containers.asJson, "attachments" -> o.attachments.asJson)
  }
  final implicit val SubmitContainerStateChangeRequestEncoder: io.circe.Encoder[models.SubmitContainerStateChangeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "status" -> o.status.asJson, "reason" -> o.reason.asJson, "task" -> o.task.asJson, "containerName" -> o.containerName.asJson, "exitCode" -> o.exitCode.asJson, "networkBindings" -> o.networkBindings.asJson)
  }
  final implicit val ServiceEncoder: io.circe.Encoder[models.Service] = io.circe.Encoder.instance { o => 
    Json.obj("createdAt" -> o.createdAt.asJson, "serviceArn" -> o.serviceArn.asJson, "serviceName" -> o.serviceName.asJson, "roleArn" -> o.roleArn.asJson, "taskDefinition" -> o.taskDefinition.asJson, "status" -> o.status.asJson, "clusterArn" -> o.clusterArn.asJson, "deployments" -> o.deployments.asJson, "placementConstraints" -> o.placementConstraints.asJson, "placementStrategy" -> o.placementStrategy.asJson, "deploymentConfiguration" -> o.deploymentConfiguration.asJson, "events" -> o.events.asJson, "loadBalancers" -> o.loadBalancers.asJson, "desiredCount" -> o.desiredCount.asJson, "runningCount" -> o.runningCount.asJson, "pendingCount" -> o.pendingCount.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val DeviceEncoder: io.circe.Encoder[models.Device] = io.circe.Encoder.instance { o => 
    Json.obj("hostPath" -> o.hostPath.asJson, "containerPath" -> o.containerPath.asJson, "permissions" -> o.permissions.asJson)
  }
  final implicit val ListClustersResponseEncoder: io.circe.Encoder[models.ListClustersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("clusterArns" -> o.clusterArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTaskDefinitionResponseEncoder: io.circe.Encoder[models.DescribeTaskDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val ClusterContainsContainerInstancesExceptionEncoder: io.circe.Encoder[models.ClusterContainsContainerInstancesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteServiceRequestEncoder: io.circe.Encoder[models.DeleteServiceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val LinuxParametersEncoder: io.circe.Encoder[models.LinuxParameters] = io.circe.Encoder.instance { o => 
    Json.obj("capabilities" -> o.capabilities.asJson, "devices" -> o.devices.asJson, "initProcessEnabled" -> o.initProcessEnabled.asJson)
  }
  final implicit val UpdateContainerAgentResponseEncoder: io.circe.Encoder[models.UpdateContainerAgentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson)
  }
  final implicit val DescribeClustersRequestEncoder: io.circe.Encoder[models.DescribeClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("clusters" -> o.clusters.asJson)
  }
  final implicit val ContainerStateChangeEncoder: io.circe.Encoder[models.ContainerStateChange] = io.circe.Encoder.instance { o => 
    Json.obj("containerName" -> o.containerName.asJson, "reason" -> o.reason.asJson, "status" -> o.status.asJson, "exitCode" -> o.exitCode.asJson, "networkBindings" -> o.networkBindings.asJson)
  }
  final implicit val DeleteClusterResponseEncoder: io.circe.Encoder[models.DeleteClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson)
  }
  final implicit val DescribeClustersResponseEncoder: io.circe.Encoder[models.DescribeClustersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("clusters" -> o.clusters.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val RegisterTaskDefinitionResponseEncoder: io.circe.Encoder[models.RegisterTaskDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val DeleteAttributesResponseEncoder: io.circe.Encoder[models.DeleteAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson)
  }
  final implicit val DeregisterContainerInstanceResponseEncoder: io.circe.Encoder[models.DeregisterContainerInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson)
  }
  final implicit val UlimitEncoder: io.circe.Encoder[models.Ulimit] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "softLimit" -> o.softLimit.asJson, "hardLimit" -> o.hardLimit.asJson)
  }
  final implicit val ListTasksResponseEncoder: io.circe.Encoder[models.ListTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskArns" -> o.taskArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ContainerOverrideEncoder: io.circe.Encoder[models.ContainerOverride] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "command" -> o.command.asJson, "environment" -> o.environment.asJson, "cpu" -> o.cpu.asJson, "memory" -> o.memory.asJson, "memoryReservation" -> o.memoryReservation.asJson)
  }
  final implicit val ContainerEncoder: io.circe.Encoder[models.Container] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "reason" -> o.reason.asJson, "taskArn" -> o.taskArn.asJson, "containerArn" -> o.containerArn.asJson, "lastStatus" -> o.lastStatus.asJson, "exitCode" -> o.exitCode.asJson, "networkBindings" -> o.networkBindings.asJson, "networkInterfaces" -> o.networkInterfaces.asJson)
  }
  final implicit val ListAttributesRequestEncoder: io.circe.Encoder[models.ListAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("targetType" -> o.targetType.asJson, "cluster" -> o.cluster.asJson, "attributeName" -> o.attributeName.asJson, "attributeValue" -> o.attributeValue.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeTasksRequestEncoder: io.circe.Encoder[models.DescribeTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val VolumeFromEncoder: io.circe.Encoder[models.VolumeFrom] = io.circe.Encoder.instance { o => 
    Json.obj("sourceContainer" -> o.sourceContainer.asJson, "readOnly" -> o.readOnly.asJson)
  }
  final implicit val PutAttributesResponseEncoder: io.circe.Encoder[models.PutAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson)
  }
  final implicit val FailureEncoder: io.circe.Encoder[models.Failure] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val DescribeContainerInstancesRequestEncoder: io.circe.Encoder[models.DescribeContainerInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val ListAttributesResponseEncoder: io.circe.Encoder[models.ListAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AwsVpcConfigurationEncoder: io.circe.Encoder[models.AwsVpcConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("subnets" -> o.subnets.asJson, "securityGroups" -> o.securityGroups.asJson)
  }
  final implicit val StartTaskResponseEncoder: io.circe.Encoder[models.StartTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val DeregisterContainerInstanceRequestEncoder: io.circe.Encoder[models.DeregisterContainerInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson, "force" -> o.force.asJson)
  }
  final implicit val NetworkInterfaceEncoder: io.circe.Encoder[models.NetworkInterface] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentId" -> o.attachmentId.asJson, "privateIpv4Address" -> o.privateIpv4Address.asJson, "ipv6Address" -> o.ipv6Address.asJson)
  }
  final implicit val LoadBalancerEncoder: io.circe.Encoder[models.LoadBalancer] = io.circe.Encoder.instance { o => 
    Json.obj("targetGroupArn" -> o.targetGroupArn.asJson, "loadBalancerName" -> o.loadBalancerName.asJson, "containerName" -> o.containerName.asJson, "containerPort" -> o.containerPort.asJson)
  }
  final implicit val KeyValuePairEncoder: io.circe.Encoder[models.KeyValuePair] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "value" -> o.value.asJson)
  }
  final implicit val ClusterContainsServicesExceptionEncoder: io.circe.Encoder[models.ClusterContainsServicesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListContainerInstancesResponseEncoder: io.circe.Encoder[models.ListContainerInstancesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstanceArns" -> o.containerInstanceArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AttachmentEncoder: io.circe.Encoder[models.Attachment] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "type" -> o.`type`.asJson, "status" -> o.status.asJson, "details" -> o.details.asJson)
  }
  final implicit val AttachmentStateChangeEncoder: io.circe.Encoder[models.AttachmentStateChange] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentArn" -> o.attachmentArn.asJson, "status" -> o.status.asJson)
  }
  final implicit val UpdateContainerInstancesStateRequestEncoder: io.circe.Encoder[models.UpdateContainerInstancesStateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "status" -> o.status.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val DeregisterTaskDefinitionResponseEncoder: io.circe.Encoder[models.DeregisterTaskDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val PlacementStrategyEncoder: io.circe.Encoder[models.PlacementStrategy] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "field" -> o.field.asJson)
  }
  final implicit val ServiceNotFoundExceptionEncoder: io.circe.Encoder[models.ServiceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RunTaskResponseEncoder: io.circe.Encoder[models.RunTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val ResourceEncoder: io.circe.Encoder[models.Resource] = io.circe.Encoder.instance { o => 
    Json.obj("longValue" -> o.longValue.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "stringSetValue" -> o.stringSetValue.asJson, "integerValue" -> o.integerValue.asJson, "doubleValue" -> o.doubleValue.asJson)
  }
  final implicit val ClusterEncoder: io.circe.Encoder[models.Cluster] = io.circe.Encoder.instance { o => 
    Json.obj("clusterArn" -> o.clusterArn.asJson, "clusterName" -> o.clusterName.asJson, "status" -> o.status.asJson, "registeredContainerInstancesCount" -> o.registeredContainerInstancesCount.asJson, "runningTasksCount" -> o.runningTasksCount.asJson, "pendingTasksCount" -> o.pendingTasksCount.asJson, "activeServicesCount" -> o.activeServicesCount.asJson)
  }
  final implicit val VersionInfoEncoder: io.circe.Encoder[models.VersionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("agentVersion" -> o.agentVersion.asJson, "agentHash" -> o.agentHash.asJson, "dockerVersion" -> o.dockerVersion.asJson)
  }
  final implicit val UpdateServiceResponseEncoder: io.circe.Encoder[models.UpdateServiceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson)
  }
  final implicit val TargetNotFoundExceptionEncoder: io.circe.Encoder[models.TargetNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServiceEventEncoder: io.circe.Encoder[models.ServiceEvent] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "message" -> o.message.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val TaskEncoder: io.circe.Encoder[models.Task] = io.circe.Encoder.instance { o => 
    Json.obj("containers" -> o.containers.asJson, "createdAt" -> o.createdAt.asJson, "startedAt" -> o.startedAt.asJson, "stoppedAt" -> o.stoppedAt.asJson, "version" -> o.version.asJson, "stoppedReason" -> o.stoppedReason.asJson, "group" -> o.group.asJson, "startedBy" -> o.startedBy.asJson, "taskArn" -> o.taskArn.asJson, "taskDefinitionArn" -> o.taskDefinitionArn.asJson, "clusterArn" -> o.clusterArn.asJson, "desiredStatus" -> o.desiredStatus.asJson, "containerInstanceArn" -> o.containerInstanceArn.asJson, "lastStatus" -> o.lastStatus.asJson, "attachments" -> o.attachments.asJson, "overrides" -> o.overrides.asJson)
  }
  final implicit val ServiceNotActiveExceptionEncoder: io.circe.Encoder[models.ServiceNotActiveException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NetworkBindingEncoder: io.circe.Encoder[models.NetworkBinding] = io.circe.Encoder.instance { o => 
    Json.obj("bindIP" -> o.bindIP.asJson, "containerPort" -> o.containerPort.asJson, "hostPort" -> o.hostPort.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val SubmitContainerStateChangeResponseEncoder: io.circe.Encoder[models.SubmitContainerStateChangeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("acknowledgment" -> o.acknowledgment.asJson)
  }
  final implicit val HostEntryEncoder: io.circe.Encoder[models.HostEntry] = io.circe.Encoder.instance { o => 
    Json.obj("hostname" -> o.hostname.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val AttributeEncoder: io.circe.Encoder[models.Attribute] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "value" -> o.value.asJson, "targetId" -> o.targetId.asJson, "targetType" -> o.targetType.asJson)
  }
  final implicit val ContainerDefinitionEncoder: io.circe.Encoder[models.ContainerDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("mountPoints" -> o.mountPoints.asJson, "logConfiguration" -> o.logConfiguration.asJson, "name" -> o.name.asJson, "hostname" -> o.hostname.asJson, "image" -> o.image.asJson, "user" -> o.user.asJson, "workingDirectory" -> o.workingDirectory.asJson, "memory" -> o.memory.asJson, "memoryReservation" -> o.memoryReservation.asJson, "essential" -> o.essential.asJson, "disableNetworking" -> o.disableNetworking.asJson, "privileged" -> o.privileged.asJson, "readonlyRootFilesystem" -> o.readonlyRootFilesystem.asJson, "volumesFrom" -> o.volumesFrom.asJson, "linuxParameters" -> o.linuxParameters.asJson, "ulimits" -> o.ulimits.asJson, "dnsSearchDomains" -> o.dnsSearchDomains.asJson, "dockerSecurityOptions" -> o.dockerSecurityOptions.asJson, "command" -> o.command.asJson, "links" -> o.links.asJson, "dnsServers" -> o.dnsServers.asJson, "entryPoint" -> o.entryPoint.asJson, "dockerLabels" -> o.dockerLabels.asJson, "extraHosts" -> o.extraHosts.asJson, "cpu" -> o.cpu.asJson, "environment" -> o.environment.asJson, "portMappings" -> o.portMappings.asJson)
  }
  final implicit val StopTaskRequestEncoder: io.circe.Encoder[models.StopTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("task" -> o.task.asJson, "cluster" -> o.cluster.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val RegisterContainerInstanceResponseEncoder: io.circe.Encoder[models.RegisterContainerInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson)
  }
  final implicit val DeploymentConfigurationEncoder: io.circe.Encoder[models.DeploymentConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("maximumPercent" -> o.maximumPercent.asJson, "minimumHealthyPercent" -> o.minimumHealthyPercent.asJson)
  }
  final implicit val CreateServiceRequestEncoder: io.circe.Encoder[models.CreateServiceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson, "serviceName" -> o.serviceName.asJson, "desiredCount" -> o.desiredCount.asJson, "clientToken" -> o.clientToken.asJson, "cluster" -> o.cluster.asJson, "role" -> o.role.asJson, "placementConstraints" -> o.placementConstraints.asJson, "placementStrategy" -> o.placementStrategy.asJson, "deploymentConfiguration" -> o.deploymentConfiguration.asJson, "loadBalancers" -> o.loadBalancers.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val PortMappingEncoder: io.circe.Encoder[models.PortMapping] = io.circe.Encoder.instance { o => 
    Json.obj("containerPort" -> o.containerPort.asJson, "hostPort" -> o.hostPort.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val NoUpdateAvailableExceptionEncoder: io.circe.Encoder[models.NoUpdateAvailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DiscoverPollEndpointRequestEncoder: io.circe.Encoder[models.DiscoverPollEndpointRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val DescribeContainerInstancesResponseEncoder: io.circe.Encoder[models.DescribeContainerInstancesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val CreateClusterRequestEncoder: io.circe.Encoder[models.CreateClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("clusterName" -> o.clusterName.asJson)
  }
  final implicit val MissingVersionExceptionEncoder: io.circe.Encoder[models.MissingVersionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartTaskRequestEncoder: io.circe.Encoder[models.StartTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson, "containerInstances" -> o.containerInstances.asJson, "cluster" -> o.cluster.asJson, "startedBy" -> o.startedBy.asJson, "group" -> o.group.asJson, "overrides" -> o.overrides.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val ListTasksRequestEncoder: io.circe.Encoder[models.ListTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("serviceName" -> o.serviceName.asJson, "startedBy" -> o.startedBy.asJson, "containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson, "nextToken" -> o.nextToken.asJson, "family" -> o.family.asJson, "maxResults" -> o.maxResults.asJson, "desiredStatus" -> o.desiredStatus.asJson)
  }
  final implicit val UpdateServiceRequestEncoder: io.circe.Encoder[models.UpdateServiceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson, "cluster" -> o.cluster.asJson, "taskDefinition" -> o.taskDefinition.asJson, "desiredCount" -> o.desiredCount.asJson, "deploymentConfiguration" -> o.deploymentConfiguration.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val RegisterContainerInstanceRequestEncoder: io.circe.Encoder[models.RegisterContainerInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "instanceIdentityDocument" -> o.instanceIdentityDocument.asJson, "instanceIdentityDocumentSignature" -> o.instanceIdentityDocumentSignature.asJson, "containerInstanceArn" -> o.containerInstanceArn.asJson, "totalResources" -> o.totalResources.asJson, "versionInfo" -> o.versionInfo.asJson, "attributes" -> o.attributes.asJson)
  }
  final implicit val DescribeServicesResponseEncoder: io.circe.Encoder[models.DescribeServicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("services" -> o.services.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val TaskDefinitionEncoder: io.circe.Encoder[models.TaskDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("volumes" -> o.volumes.asJson, "status" -> o.status.asJson, "taskDefinitionArn" -> o.taskDefinitionArn.asJson, "family" -> o.family.asJson, "taskRoleArn" -> o.taskRoleArn.asJson, "placementConstraints" -> o.placementConstraints.asJson, "requiresAttributes" -> o.requiresAttributes.asJson, "networkMode" -> o.networkMode.asJson, "revision" -> o.revision.asJson, "containerDefinitions" -> o.containerDefinitions.asJson)
  }
  final implicit val ContainerInstanceEncoder: io.circe.Encoder[models.ContainerInstance] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "registeredAt" -> o.registeredAt.asJson, "version" -> o.version.asJson, "containerInstanceArn" -> o.containerInstanceArn.asJson, "ec2InstanceId" -> o.ec2InstanceId.asJson, "status" -> o.status.asJson, "versionInfo" -> o.versionInfo.asJson, "remainingResources" -> o.remainingResources.asJson, "registeredResources" -> o.registeredResources.asJson, "runningTasksCount" -> o.runningTasksCount.asJson, "pendingTasksCount" -> o.pendingTasksCount.asJson, "agentConnected" -> o.agentConnected.asJson, "attachments" -> o.attachments.asJson, "agentUpdateStatus" -> o.agentUpdateStatus.asJson)
  }
  final implicit val DeregisterTaskDefinitionRequestEncoder: io.circe.Encoder[models.DeregisterTaskDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val CreateServiceResponseEncoder: io.circe.Encoder[models.CreateServiceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson)
  }
  final implicit val ListTaskDefinitionsResponseEncoder: io.circe.Encoder[models.ListTaskDefinitionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinitionArns" -> o.taskDefinitionArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteServiceResponseEncoder: io.circe.Encoder[models.DeleteServiceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson)
  }
  final implicit val ListTaskDefinitionFamiliesRequestEncoder: io.circe.Encoder[models.ListTaskDefinitionFamiliesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("familyPrefix" -> o.familyPrefix.asJson, "nextToken" -> o.nextToken.asJson, "status" -> o.status.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeTaskDefinitionRequestEncoder: io.circe.Encoder[models.DescribeTaskDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val DeleteClusterRequestEncoder: io.circe.Encoder[models.DeleteClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson)
  }
  final implicit val ListClustersRequestEncoder: io.circe.Encoder[models.ListClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AttributeLimitExceededExceptionEncoder: io.circe.Encoder[models.AttributeLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateInProgressExceptionEncoder: io.circe.Encoder[models.UpdateInProgressException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val HostVolumePropertiesEncoder: io.circe.Encoder[models.HostVolumeProperties] = io.circe.Encoder.instance { o => 
    Json.obj("sourcePath" -> o.sourcePath.asJson)
  }
  final implicit val ListServicesRequestEncoder: io.circe.Encoder[models.ListServicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeServicesRequestEncoder: io.circe.Encoder[models.DescribeServicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("services" -> o.services.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val SubmitTaskStateChangeResponseEncoder: io.circe.Encoder[models.SubmitTaskStateChangeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("acknowledgment" -> o.acknowledgment.asJson)
  }
  final implicit val RunTaskRequestEncoder: io.circe.Encoder[models.RunTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson, "cluster" -> o.cluster.asJson, "startedBy" -> o.startedBy.asJson, "group" -> o.group.asJson, "count" -> o.count.asJson, "placementConstraints" -> o.placementConstraints.asJson, "placementStrategy" -> o.placementStrategy.asJson, "overrides" -> o.overrides.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val DeploymentEncoder: io.circe.Encoder[models.Deployment] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "status" -> o.status.asJson, "taskDefinition" -> o.taskDefinition.asJson, "desiredCount" -> o.desiredCount.asJson, "pendingCount" -> o.pendingCount.asJson, "runningCount" -> o.runningCount.asJson, "createdAt" -> o.createdAt.asJson, "updatedAt" -> o.updatedAt.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val TaskDefinitionPlacementConstraintEncoder: io.circe.Encoder[models.TaskDefinitionPlacementConstraint] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "expression" -> o.expression.asJson)
  }
  final implicit val StopTaskResponseEncoder: io.circe.Encoder[models.StopTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("task" -> o.task.asJson)
  }
  final implicit val MountPointEncoder: io.circe.Encoder[models.MountPoint] = io.circe.Encoder.instance { o => 
    Json.obj("sourceVolume" -> o.sourceVolume.asJson, "containerPath" -> o.containerPath.asJson, "readOnly" -> o.readOnly.asJson)
  }
  final implicit val TaskOverrideEncoder: io.circe.Encoder[models.TaskOverride] = io.circe.Encoder.instance { o => 
    Json.obj("containerOverrides" -> o.containerOverrides.asJson, "taskRoleArn" -> o.taskRoleArn.asJson)
  }
  final implicit val UpdateContainerInstancesStateResponseEncoder: io.circe.Encoder[models.UpdateContainerInstancesStateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val NetworkConfigurationEncoder: io.circe.Encoder[models.NetworkConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("awsvpcConfiguration" -> o.awsvpcConfiguration.asJson)
  }
  final implicit val ListContainerInstancesRequestDecoder: io.circe.Decoder[models.ListContainerInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("status")).mapN(models.ListContainerInstancesRequest.apply _)
  }
  final implicit val ClusterNotFoundExceptionDecoder: io.circe.Decoder[models.ClusterNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ClusterNotFoundException)
  final implicit val RegisterTaskDefinitionRequestDecoder: io.circe.Decoder[models.RegisterTaskDefinitionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("family"), o.get[scala.List[models.ContainerDefinition]]("containerDefinitions"), o.get[scala.Option[scala.List[models.Volume]]]("volumes"), o.get[scala.Option[java.lang.String]]("taskRoleArn"), o.get[scala.Option[scala.List[models.TaskDefinitionPlacementConstraint]]]("placementConstraints"), o.get[scala.Option[java.lang.String]]("networkMode")).mapN(models.RegisterTaskDefinitionRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidParameterException)
  final implicit val VolumeDecoder: io.circe.Decoder[models.Volume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[models.HostVolumeProperties]]("host")).mapN(models.Volume.apply _)
  }
  final implicit val ListTaskDefinitionsRequestDecoder: io.circe.Decoder[models.ListTaskDefinitionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("familyPrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("sort"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListTaskDefinitionsRequest.apply _)
  }
  final implicit val ClientExceptionDecoder: io.circe.Decoder[models.ClientException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ClientException.apply _)
  }
  final implicit val DeleteAttributesRequestDecoder: io.circe.Decoder[models.DeleteAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Attribute]]("attributes"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.DeleteAttributesRequest.apply _)
  }
  final implicit val PlacementConstraintDecoder: io.circe.Decoder[models.PlacementConstraint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("expression")).mapN(models.PlacementConstraint.apply _)
  }
  final implicit val ListTaskDefinitionFamiliesResponseDecoder: io.circe.Decoder[models.ListTaskDefinitionFamiliesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("families"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListTaskDefinitionFamiliesResponse.apply _)
  }
  final implicit val DescribeTasksResponseDecoder: io.circe.Decoder[models.DescribeTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Task]]]("tasks"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.DescribeTasksResponse.apply _)
  }
  final implicit val ServerExceptionDecoder: io.circe.Decoder[models.ServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ServerException.apply _)
  }
  final implicit val LogConfigurationDecoder: io.circe.Decoder[models.LogConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logDriver"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("options")).mapN(models.LogConfiguration.apply _)
  }
  final implicit val DiscoverPollEndpointResponseDecoder: io.circe.Decoder[models.DiscoverPollEndpointResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("endpoint"), o.get[scala.Option[java.lang.String]]("telemetryEndpoint")).mapN(models.DiscoverPollEndpointResponse.apply _)
  }
  final implicit val PutAttributesRequestDecoder: io.circe.Decoder[models.PutAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Attribute]]("attributes"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.PutAttributesRequest.apply _)
  }
  final implicit val UpdateContainerAgentRequestDecoder: io.circe.Decoder[models.UpdateContainerAgentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.UpdateContainerAgentRequest.apply _)
  }
  final implicit val ListServicesResponseDecoder: io.circe.Decoder[models.ListServicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("serviceArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListServicesResponse.apply _)
  }
  final implicit val CreateClusterResponseDecoder: io.circe.Decoder[models.CreateClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("cluster").map(models.CreateClusterResponse.apply _)
  }
  final implicit val KernelCapabilitiesDecoder: io.circe.Decoder[models.KernelCapabilities] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("add"), o.get[scala.Option[scala.List[java.lang.String]]]("drop")).mapN(models.KernelCapabilities.apply _)
  }
  final implicit val SubmitTaskStateChangeRequestDecoder: io.circe.Decoder[models.SubmitTaskStateChangeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("task"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[scala.List[models.ContainerStateChange]]]("containers"), o.get[scala.Option[scala.List[models.AttachmentStateChange]]]("attachments")).mapN(models.SubmitTaskStateChangeRequest.apply _)
  }
  final implicit val SubmitContainerStateChangeRequestDecoder: io.circe.Decoder[models.SubmitContainerStateChangeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("task"), o.get[scala.Option[java.lang.String]]("containerName"), o.get[scala.Option[scala.Int]]("exitCode"), o.get[scala.Option[scala.List[models.NetworkBinding]]]("networkBindings")).mapN(models.SubmitContainerStateChangeRequest.apply _)
  }
  final implicit val ServiceDecoder: io.circe.Decoder[models.Service] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("serviceArn"), o.get[scala.Option[java.lang.String]]("serviceName"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("taskDefinition"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("clusterArn"), o.get[scala.Option[scala.List[models.Deployment]]]("deployments"), o.get[scala.Option[scala.List[models.PlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[models.PlacementStrategy]]]("placementStrategy"), o.get[scala.Option[models.DeploymentConfiguration]]("deploymentConfiguration"), o.get[scala.Option[scala.List[models.ServiceEvent]]]("events"), o.get[scala.Option[scala.List[models.LoadBalancer]]]("loadBalancers"), o.get[scala.Option[scala.Int]]("desiredCount"), o.get[scala.Option[scala.Int]]("runningCount"), o.get[scala.Option[scala.Int]]("pendingCount"), o.get[scala.Option[models.NetworkConfiguration]]("networkConfiguration")).mapN(models.Service.apply _)
  }
  final implicit val DeviceDecoder: io.circe.Decoder[models.Device] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("hostPath"), o.get[scala.Option[java.lang.String]]("containerPath"), o.get[scala.Option[scala.List[java.lang.String]]]("permissions")).mapN(models.Device.apply _)
  }
  final implicit val ListClustersResponseDecoder: io.circe.Decoder[models.ListClustersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("clusterArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListClustersResponse.apply _)
  }
  final implicit val DescribeTaskDefinitionResponseDecoder: io.circe.Decoder[models.DescribeTaskDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TaskDefinition]]("taskDefinition").map(models.DescribeTaskDefinitionResponse.apply _)
  }
  final implicit val ClusterContainsContainerInstancesExceptionDecoder: io.circe.Decoder[models.ClusterContainsContainerInstancesException.type] = io.circe.Decoder.decodeUnit.as(models.ClusterContainsContainerInstancesException)
  final implicit val DeleteServiceRequestDecoder: io.circe.Decoder[models.DeleteServiceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("service"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.DeleteServiceRequest.apply _)
  }
  final implicit val LinuxParametersDecoder: io.circe.Decoder[models.LinuxParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.KernelCapabilities]]("capabilities"), o.get[scala.Option[scala.List[models.Device]]]("devices"), o.get[scala.Option[scala.Boolean]]("initProcessEnabled")).mapN(models.LinuxParameters.apply _)
  }
  final implicit val UpdateContainerAgentResponseDecoder: io.circe.Decoder[models.UpdateContainerAgentResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ContainerInstance]]("containerInstance").map(models.UpdateContainerAgentResponse.apply _)
  }
  final implicit val DescribeClustersRequestDecoder: io.circe.Decoder[models.DescribeClustersRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("clusters").map(models.DescribeClustersRequest.apply _)
  }
  final implicit val ContainerStateChangeDecoder: io.circe.Decoder[models.ContainerStateChange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("containerName"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.Int]]("exitCode"), o.get[scala.Option[scala.List[models.NetworkBinding]]]("networkBindings")).mapN(models.ContainerStateChange.apply _)
  }
  final implicit val DeleteClusterResponseDecoder: io.circe.Decoder[models.DeleteClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("cluster").map(models.DeleteClusterResponse.apply _)
  }
  final implicit val DescribeClustersResponseDecoder: io.circe.Decoder[models.DescribeClustersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Cluster]]]("clusters"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.DescribeClustersResponse.apply _)
  }
  final implicit val RegisterTaskDefinitionResponseDecoder: io.circe.Decoder[models.RegisterTaskDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TaskDefinition]]("taskDefinition").map(models.RegisterTaskDefinitionResponse.apply _)
  }
  final implicit val DeleteAttributesResponseDecoder: io.circe.Decoder[models.DeleteAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Attribute]]]("attributes").map(models.DeleteAttributesResponse.apply _)
  }
  final implicit val DeregisterContainerInstanceResponseDecoder: io.circe.Decoder[models.DeregisterContainerInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ContainerInstance]]("containerInstance").map(models.DeregisterContainerInstanceResponse.apply _)
  }
  final implicit val UlimitDecoder: io.circe.Decoder[models.Ulimit] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Int]("softLimit"), o.get[scala.Int]("hardLimit")).mapN(models.Ulimit.apply _)
  }
  final implicit val ListTasksResponseDecoder: io.circe.Decoder[models.ListTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("taskArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListTasksResponse.apply _)
  }
  final implicit val ContainerOverrideDecoder: io.circe.Decoder[models.ContainerOverride] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[java.lang.String]]]("command"), o.get[scala.Option[scala.List[models.KeyValuePair]]]("environment"), o.get[scala.Option[scala.Int]]("cpu"), o.get[scala.Option[scala.Int]]("memory"), o.get[scala.Option[scala.Int]]("memoryReservation")).mapN(models.ContainerOverride.apply _)
  }
  final implicit val ContainerDecoder: io.circe.Decoder[models.Container] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("taskArn"), o.get[scala.Option[java.lang.String]]("containerArn"), o.get[scala.Option[java.lang.String]]("lastStatus"), o.get[scala.Option[scala.Int]]("exitCode"), o.get[scala.Option[scala.List[models.NetworkBinding]]]("networkBindings"), o.get[scala.Option[scala.List[models.NetworkInterface]]]("networkInterfaces")).mapN(models.Container.apply _)
  }
  final implicit val ListAttributesRequestDecoder: io.circe.Decoder[models.ListAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("targetType"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("attributeName"), o.get[scala.Option[java.lang.String]]("attributeValue"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListAttributesRequest.apply _)
  }
  final implicit val DescribeTasksRequestDecoder: io.circe.Decoder[models.DescribeTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("tasks"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.DescribeTasksRequest.apply _)
  }
  final implicit val VolumeFromDecoder: io.circe.Decoder[models.VolumeFrom] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sourceContainer"), o.get[scala.Option[scala.Boolean]]("readOnly")).mapN(models.VolumeFrom.apply _)
  }
  final implicit val PutAttributesResponseDecoder: io.circe.Decoder[models.PutAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Attribute]]]("attributes").map(models.PutAttributesResponse.apply _)
  }
  final implicit val FailureDecoder: io.circe.Decoder[models.Failure] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("reason")).mapN(models.Failure.apply _)
  }
  final implicit val DescribeContainerInstancesRequestDecoder: io.circe.Decoder[models.DescribeContainerInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("containerInstances"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.DescribeContainerInstancesRequest.apply _)
  }
  final implicit val ListAttributesResponseDecoder: io.circe.Decoder[models.ListAttributesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Attribute]]]("attributes"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListAttributesResponse.apply _)
  }
  final implicit val AwsVpcConfigurationDecoder: io.circe.Decoder[models.AwsVpcConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("subnets"), o.get[scala.Option[scala.List[java.lang.String]]]("securityGroups")).mapN(models.AwsVpcConfiguration.apply _)
  }
  final implicit val StartTaskResponseDecoder: io.circe.Decoder[models.StartTaskResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Task]]]("tasks"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.StartTaskResponse.apply _)
  }
  final implicit val DeregisterContainerInstanceRequestDecoder: io.circe.Decoder[models.DeregisterContainerInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[scala.Boolean]]("force")).mapN(models.DeregisterContainerInstanceRequest.apply _)
  }
  final implicit val NetworkInterfaceDecoder: io.circe.Decoder[models.NetworkInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attachmentId"), o.get[scala.Option[java.lang.String]]("privateIpv4Address"), o.get[scala.Option[java.lang.String]]("ipv6Address")).mapN(models.NetworkInterface.apply _)
  }
  final implicit val LoadBalancerDecoder: io.circe.Decoder[models.LoadBalancer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("targetGroupArn"), o.get[scala.Option[java.lang.String]]("loadBalancerName"), o.get[scala.Option[java.lang.String]]("containerName"), o.get[scala.Option[scala.Int]]("containerPort")).mapN(models.LoadBalancer.apply _)
  }
  final implicit val KeyValuePairDecoder: io.circe.Decoder[models.KeyValuePair] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("value")).mapN(models.KeyValuePair.apply _)
  }
  final implicit val ClusterContainsServicesExceptionDecoder: io.circe.Decoder[models.ClusterContainsServicesException.type] = io.circe.Decoder.decodeUnit.as(models.ClusterContainsServicesException)
  final implicit val ListContainerInstancesResponseDecoder: io.circe.Decoder[models.ListContainerInstancesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("containerInstanceArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListContainerInstancesResponse.apply _)
  }
  final implicit val AttachmentDecoder: io.circe.Decoder[models.Attachment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.List[models.KeyValuePair]]]("details")).mapN(models.Attachment.apply _)
  }
  final implicit val AttachmentStateChangeDecoder: io.circe.Decoder[models.AttachmentStateChange] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("attachmentArn"), o.get[java.lang.String]("status")).mapN(models.AttachmentStateChange.apply _)
  }
  final implicit val UpdateContainerInstancesStateRequestDecoder: io.circe.Decoder[models.UpdateContainerInstancesStateRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("containerInstances"), o.get[java.lang.String]("status"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.UpdateContainerInstancesStateRequest.apply _)
  }
  final implicit val DeregisterTaskDefinitionResponseDecoder: io.circe.Decoder[models.DeregisterTaskDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TaskDefinition]]("taskDefinition").map(models.DeregisterTaskDefinitionResponse.apply _)
  }
  final implicit val PlacementStrategyDecoder: io.circe.Decoder[models.PlacementStrategy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("field")).mapN(models.PlacementStrategy.apply _)
  }
  final implicit val ServiceNotFoundExceptionDecoder: io.circe.Decoder[models.ServiceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ServiceNotFoundException)
  final implicit val RunTaskResponseDecoder: io.circe.Decoder[models.RunTaskResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Task]]]("tasks"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.RunTaskResponse.apply _)
  }
  final implicit val ResourceDecoder: io.circe.Decoder[models.Resource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("longValue"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.List[java.lang.String]]]("stringSetValue"), o.get[scala.Option[scala.Int]]("integerValue"), o.get[scala.Option[scala.Double]]("doubleValue")).mapN(models.Resource.apply _)
  }
  final implicit val ClusterDecoder: io.circe.Decoder[models.Cluster] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("clusterArn"), o.get[scala.Option[java.lang.String]]("clusterName"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.Int]]("registeredContainerInstancesCount"), o.get[scala.Option[scala.Int]]("runningTasksCount"), o.get[scala.Option[scala.Int]]("pendingTasksCount"), o.get[scala.Option[scala.Int]]("activeServicesCount")).mapN(models.Cluster.apply _)
  }
  final implicit val VersionInfoDecoder: io.circe.Decoder[models.VersionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("agentVersion"), o.get[scala.Option[java.lang.String]]("agentHash"), o.get[scala.Option[java.lang.String]]("dockerVersion")).mapN(models.VersionInfo.apply _)
  }
  final implicit val UpdateServiceResponseDecoder: io.circe.Decoder[models.UpdateServiceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Service]]("service").map(models.UpdateServiceResponse.apply _)
  }
  final implicit val TargetNotFoundExceptionDecoder: io.circe.Decoder[models.TargetNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.TargetNotFoundException)
  final implicit val ServiceEventDecoder: io.circe.Decoder[models.ServiceEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.time.Instant]]("createdAt")).mapN(models.ServiceEvent.apply _)
  }
  final implicit val TaskDecoder: io.circe.Decoder[models.Task] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Container]]]("containers"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.time.Instant]]("startedAt"), o.get[scala.Option[java.time.Instant]]("stoppedAt"), o.get[scala.Option[scala.Long]]("version"), o.get[scala.Option[java.lang.String]]("stoppedReason"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("taskArn"), o.get[scala.Option[java.lang.String]]("taskDefinitionArn"), o.get[scala.Option[java.lang.String]]("clusterArn"), o.get[scala.Option[java.lang.String]]("desiredStatus"), o.get[scala.Option[java.lang.String]]("containerInstanceArn"), o.get[scala.Option[java.lang.String]]("lastStatus"), o.get[scala.Option[scala.List[models.Attachment]]]("attachments"), o.get[scala.Option[models.TaskOverride]]("overrides")).mapN(models.Task.apply _)
  }
  final implicit val ServiceNotActiveExceptionDecoder: io.circe.Decoder[models.ServiceNotActiveException.type] = io.circe.Decoder.decodeUnit.as(models.ServiceNotActiveException)
  final implicit val NetworkBindingDecoder: io.circe.Decoder[models.NetworkBinding] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("bindIP"), o.get[scala.Option[scala.Int]]("containerPort"), o.get[scala.Option[scala.Int]]("hostPort"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(models.NetworkBinding.apply _)
  }
  final implicit val SubmitContainerStateChangeResponseDecoder: io.circe.Decoder[models.SubmitContainerStateChangeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("acknowledgment").map(models.SubmitContainerStateChangeResponse.apply _)
  }
  final implicit val HostEntryDecoder: io.circe.Decoder[models.HostEntry] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("hostname"), o.get[java.lang.String]("ipAddress")).mapN(models.HostEntry.apply _)
  }
  final implicit val AttributeDecoder: io.circe.Decoder[models.Attribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("value"), o.get[scala.Option[java.lang.String]]("targetId"), o.get[scala.Option[java.lang.String]]("targetType")).mapN(models.Attribute.apply _)
  }
  final implicit val ContainerDefinitionDecoder: io.circe.Decoder[models.ContainerDefinition] = io.circe.Decoder.instance { o => 
    for (`mountPoints` <- o.get[scala.Option[scala.List[models.MountPoint]]]("mountPoints"); `logConfiguration` <- o.get[scala.Option[models.LogConfiguration]]("logConfiguration"); `name` <- o.get[scala.Option[java.lang.String]]("name"); `hostname` <- o.get[scala.Option[java.lang.String]]("hostname"); `image` <- o.get[scala.Option[java.lang.String]]("image"); `user` <- o.get[scala.Option[java.lang.String]]("user"); `workingDirectory` <- o.get[scala.Option[java.lang.String]]("workingDirectory"); `memory` <- o.get[scala.Option[scala.Int]]("memory"); `memoryReservation` <- o.get[scala.Option[scala.Int]]("memoryReservation"); `essential` <- o.get[scala.Option[scala.Boolean]]("essential"); `disableNetworking` <- o.get[scala.Option[scala.Boolean]]("disableNetworking"); `privileged` <- o.get[scala.Option[scala.Boolean]]("privileged"); `readonlyRootFilesystem` <- o.get[scala.Option[scala.Boolean]]("readonlyRootFilesystem"); `volumesFrom` <- o.get[scala.Option[scala.List[models.VolumeFrom]]]("volumesFrom"); `linuxParameters` <- o.get[scala.Option[models.LinuxParameters]]("linuxParameters"); `ulimits` <- o.get[scala.Option[scala.List[models.Ulimit]]]("ulimits"); `dnsSearchDomains` <- o.get[scala.Option[scala.List[java.lang.String]]]("dnsSearchDomains"); `dockerSecurityOptions` <- o.get[scala.Option[scala.List[java.lang.String]]]("dockerSecurityOptions"); `command` <- o.get[scala.Option[scala.List[java.lang.String]]]("command"); `links` <- o.get[scala.Option[scala.List[java.lang.String]]]("links"); `dnsServers` <- o.get[scala.Option[scala.List[java.lang.String]]]("dnsServers"); `entryPoint` <- o.get[scala.Option[scala.List[java.lang.String]]]("entryPoint"); `dockerLabels` <- o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("dockerLabels"); `extraHosts` <- o.get[scala.Option[scala.List[models.HostEntry]]]("extraHosts"); `cpu` <- o.get[scala.Option[scala.Int]]("cpu"); `environment` <- o.get[scala.Option[scala.List[models.KeyValuePair]]]("environment"); `portMappings` <- o.get[scala.Option[scala.List[models.PortMapping]]]("portMappings")) yield models.ContainerDefinition(mountPoints, logConfiguration, name, hostname, image, user, workingDirectory, memory, memoryReservation, essential, disableNetworking, privileged, readonlyRootFilesystem, volumesFrom, linuxParameters, ulimits, dnsSearchDomains, dockerSecurityOptions, command, links, dnsServers, entryPoint, dockerLabels, extraHosts, cpu, environment, portMappings)
  }
  final implicit val StopTaskRequestDecoder: io.circe.Decoder[models.StopTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("task"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("reason")).mapN(models.StopTaskRequest.apply _)
  }
  final implicit val RegisterContainerInstanceResponseDecoder: io.circe.Decoder[models.RegisterContainerInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ContainerInstance]]("containerInstance").map(models.RegisterContainerInstanceResponse.apply _)
  }
  final implicit val DeploymentConfigurationDecoder: io.circe.Decoder[models.DeploymentConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maximumPercent"), o.get[scala.Option[scala.Int]]("minimumHealthyPercent")).mapN(models.DeploymentConfiguration.apply _)
  }
  final implicit val CreateServiceRequestDecoder: io.circe.Decoder[models.CreateServiceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskDefinition"), o.get[java.lang.String]("serviceName"), o.get[scala.Int]("desiredCount"), o.get[scala.Option[java.lang.String]]("clientToken"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("role"), o.get[scala.Option[scala.List[models.PlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[models.PlacementStrategy]]]("placementStrategy"), o.get[scala.Option[models.DeploymentConfiguration]]("deploymentConfiguration"), o.get[scala.Option[scala.List[models.LoadBalancer]]]("loadBalancers"), o.get[scala.Option[models.NetworkConfiguration]]("networkConfiguration")).mapN(models.CreateServiceRequest.apply _)
  }
  final implicit val PortMappingDecoder: io.circe.Decoder[models.PortMapping] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("containerPort"), o.get[scala.Option[scala.Int]]("hostPort"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(models.PortMapping.apply _)
  }
  final implicit val NoUpdateAvailableExceptionDecoder: io.circe.Decoder[models.NoUpdateAvailableException.type] = io.circe.Decoder.decodeUnit.as(models.NoUpdateAvailableException)
  final implicit val DiscoverPollEndpointRequestDecoder: io.circe.Decoder[models.DiscoverPollEndpointRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.DiscoverPollEndpointRequest.apply _)
  }
  final implicit val DescribeContainerInstancesResponseDecoder: io.circe.Decoder[models.DescribeContainerInstancesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ContainerInstance]]]("containerInstances"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.DescribeContainerInstancesResponse.apply _)
  }
  final implicit val CreateClusterRequestDecoder: io.circe.Decoder[models.CreateClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("clusterName").map(models.CreateClusterRequest.apply _)
  }
  final implicit val MissingVersionExceptionDecoder: io.circe.Decoder[models.MissingVersionException.type] = io.circe.Decoder.decodeUnit.as(models.MissingVersionException)
  final implicit val StartTaskRequestDecoder: io.circe.Decoder[models.StartTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskDefinition"), o.get[scala.List[java.lang.String]]("containerInstances"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[models.TaskOverride]]("overrides"), o.get[scala.Option[models.NetworkConfiguration]]("networkConfiguration")).mapN(models.StartTaskRequest.apply _)
  }
  final implicit val ListTasksRequestDecoder: io.circe.Decoder[models.ListTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("serviceName"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("family"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("desiredStatus")).mapN(models.ListTasksRequest.apply _)
  }
  final implicit val UpdateServiceRequestDecoder: io.circe.Decoder[models.UpdateServiceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("service"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("taskDefinition"), o.get[scala.Option[scala.Int]]("desiredCount"), o.get[scala.Option[models.DeploymentConfiguration]]("deploymentConfiguration"), o.get[scala.Option[models.NetworkConfiguration]]("networkConfiguration")).mapN(models.UpdateServiceRequest.apply _)
  }
  final implicit val RegisterContainerInstanceRequestDecoder: io.circe.Decoder[models.RegisterContainerInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("instanceIdentityDocument"), o.get[scala.Option[java.lang.String]]("instanceIdentityDocumentSignature"), o.get[scala.Option[java.lang.String]]("containerInstanceArn"), o.get[scala.Option[scala.List[models.Resource]]]("totalResources"), o.get[scala.Option[models.VersionInfo]]("versionInfo"), o.get[scala.Option[scala.List[models.Attribute]]]("attributes")).mapN(models.RegisterContainerInstanceRequest.apply _)
  }
  final implicit val DescribeServicesResponseDecoder: io.circe.Decoder[models.DescribeServicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Service]]]("services"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.DescribeServicesResponse.apply _)
  }
  final implicit val TaskDefinitionDecoder: io.circe.Decoder[models.TaskDefinition] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Volume]]]("volumes"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("taskDefinitionArn"), o.get[scala.Option[java.lang.String]]("family"), o.get[scala.Option[java.lang.String]]("taskRoleArn"), o.get[scala.Option[scala.List[models.TaskDefinitionPlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[models.Attribute]]]("requiresAttributes"), o.get[scala.Option[java.lang.String]]("networkMode"), o.get[scala.Option[scala.Int]]("revision"), o.get[scala.Option[scala.List[models.ContainerDefinition]]]("containerDefinitions")).mapN(models.TaskDefinition.apply _)
  }
  final implicit val ContainerInstanceDecoder: io.circe.Decoder[models.ContainerInstance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Attribute]]]("attributes"), o.get[scala.Option[java.time.Instant]]("registeredAt"), o.get[scala.Option[scala.Long]]("version"), o.get[scala.Option[java.lang.String]]("containerInstanceArn"), o.get[scala.Option[java.lang.String]]("ec2InstanceId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[models.VersionInfo]]("versionInfo"), o.get[scala.Option[scala.List[models.Resource]]]("remainingResources"), o.get[scala.Option[scala.List[models.Resource]]]("registeredResources"), o.get[scala.Option[scala.Int]]("runningTasksCount"), o.get[scala.Option[scala.Int]]("pendingTasksCount"), o.get[scala.Option[scala.Boolean]]("agentConnected"), o.get[scala.Option[scala.List[models.Attachment]]]("attachments"), o.get[scala.Option[java.lang.String]]("agentUpdateStatus")).mapN(models.ContainerInstance.apply _)
  }
  final implicit val DeregisterTaskDefinitionRequestDecoder: io.circe.Decoder[models.DeregisterTaskDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskDefinition").map(models.DeregisterTaskDefinitionRequest.apply _)
  }
  final implicit val CreateServiceResponseDecoder: io.circe.Decoder[models.CreateServiceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Service]]("service").map(models.CreateServiceResponse.apply _)
  }
  final implicit val ListTaskDefinitionsResponseDecoder: io.circe.Decoder[models.ListTaskDefinitionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("taskDefinitionArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListTaskDefinitionsResponse.apply _)
  }
  final implicit val DeleteServiceResponseDecoder: io.circe.Decoder[models.DeleteServiceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Service]]("service").map(models.DeleteServiceResponse.apply _)
  }
  final implicit val ListTaskDefinitionFamiliesRequestDecoder: io.circe.Decoder[models.ListTaskDefinitionFamiliesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("familyPrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListTaskDefinitionFamiliesRequest.apply _)
  }
  final implicit val DescribeTaskDefinitionRequestDecoder: io.circe.Decoder[models.DescribeTaskDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskDefinition").map(models.DescribeTaskDefinitionRequest.apply _)
  }
  final implicit val DeleteClusterRequestDecoder: io.circe.Decoder[models.DeleteClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("cluster").map(models.DeleteClusterRequest.apply _)
  }
  final implicit val ListClustersRequestDecoder: io.circe.Decoder[models.ListClustersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListClustersRequest.apply _)
  }
  final implicit val AttributeLimitExceededExceptionDecoder: io.circe.Decoder[models.AttributeLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.AttributeLimitExceededException)
  final implicit val UpdateInProgressExceptionDecoder: io.circe.Decoder[models.UpdateInProgressException.type] = io.circe.Decoder.decodeUnit.as(models.UpdateInProgressException)
  final implicit val HostVolumePropertiesDecoder: io.circe.Decoder[models.HostVolumeProperties] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("sourcePath").map(models.HostVolumeProperties.apply _)
  }
  final implicit val ListServicesRequestDecoder: io.circe.Decoder[models.ListServicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListServicesRequest.apply _)
  }
  final implicit val DescribeServicesRequestDecoder: io.circe.Decoder[models.DescribeServicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("services"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(models.DescribeServicesRequest.apply _)
  }
  final implicit val SubmitTaskStateChangeResponseDecoder: io.circe.Decoder[models.SubmitTaskStateChangeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("acknowledgment").map(models.SubmitTaskStateChangeResponse.apply _)
  }
  final implicit val RunTaskRequestDecoder: io.circe.Decoder[models.RunTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskDefinition"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[scala.Int]]("count"), o.get[scala.Option[scala.List[models.PlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[models.PlacementStrategy]]]("placementStrategy"), o.get[scala.Option[models.TaskOverride]]("overrides"), o.get[scala.Option[models.NetworkConfiguration]]("networkConfiguration")).mapN(models.RunTaskRequest.apply _)
  }
  final implicit val DeploymentDecoder: io.circe.Decoder[models.Deployment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("taskDefinition"), o.get[scala.Option[scala.Int]]("desiredCount"), o.get[scala.Option[scala.Int]]("pendingCount"), o.get[scala.Option[scala.Int]]("runningCount"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.time.Instant]]("updatedAt"), o.get[scala.Option[models.NetworkConfiguration]]("networkConfiguration")).mapN(models.Deployment.apply _)
  }
  final implicit val TaskDefinitionPlacementConstraintDecoder: io.circe.Decoder[models.TaskDefinitionPlacementConstraint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("expression")).mapN(models.TaskDefinitionPlacementConstraint.apply _)
  }
  final implicit val StopTaskResponseDecoder: io.circe.Decoder[models.StopTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Task]]("task").map(models.StopTaskResponse.apply _)
  }
  final implicit val MountPointDecoder: io.circe.Decoder[models.MountPoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sourceVolume"), o.get[scala.Option[java.lang.String]]("containerPath"), o.get[scala.Option[scala.Boolean]]("readOnly")).mapN(models.MountPoint.apply _)
  }
  final implicit val TaskOverrideDecoder: io.circe.Decoder[models.TaskOverride] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ContainerOverride]]]("containerOverrides"), o.get[scala.Option[java.lang.String]]("taskRoleArn")).mapN(models.TaskOverride.apply _)
  }
  final implicit val UpdateContainerInstancesStateResponseDecoder: io.circe.Decoder[models.UpdateContainerInstancesStateResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ContainerInstance]]]("containerInstances"), o.get[scala.Option[scala.List[models.Failure]]]("failures")).mapN(models.UpdateContainerInstancesStateResponse.apply _)
  }
  final implicit val NetworkConfigurationDecoder: io.circe.Decoder[models.NetworkConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.AwsVpcConfiguration]]("awsvpcConfiguration").map(models.NetworkConfiguration.apply _)
  }
}