package avias.ecs
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ListContainerInstancesRequestEncoder: io.circe.Encoder[avias.ecs.models.ListContainerInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson, "status" -> o.status.asJson)
  }
  final implicit val ClusterNotFoundExceptionEncoder: io.circe.Encoder[avias.ecs.models.ClusterNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RegisterTaskDefinitionRequestEncoder: io.circe.Encoder[avias.ecs.models.RegisterTaskDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("family" -> o.family.asJson, "containerDefinitions" -> o.containerDefinitions.asJson, "volumes" -> o.volumes.asJson, "taskRoleArn" -> o.taskRoleArn.asJson, "placementConstraints" -> o.placementConstraints.asJson, "networkMode" -> o.networkMode.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.ecs.models.InvalidParameterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val VolumeEncoder: io.circe.Encoder[avias.ecs.models.Volume] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "host" -> o.host.asJson)
  }
  final implicit val ListTaskDefinitionsRequestEncoder: io.circe.Encoder[avias.ecs.models.ListTaskDefinitionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("familyPrefix" -> o.familyPrefix.asJson, "nextToken" -> o.nextToken.asJson, "status" -> o.status.asJson, "sort" -> o.sort.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ClientExceptionEncoder: io.circe.Encoder[avias.ecs.models.ClientException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteAttributesRequestEncoder: io.circe.Encoder[avias.ecs.models.DeleteAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val PlacementConstraintEncoder: io.circe.Encoder[avias.ecs.models.PlacementConstraint] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "expression" -> o.expression.asJson)
  }
  final implicit val ListTaskDefinitionFamiliesResponseEncoder: io.circe.Encoder[avias.ecs.models.ListTaskDefinitionFamiliesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("families" -> o.families.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTasksResponseEncoder: io.circe.Encoder[avias.ecs.models.DescribeTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val ServerExceptionEncoder: io.circe.Encoder[avias.ecs.models.ServerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LogConfigurationEncoder: io.circe.Encoder[avias.ecs.models.LogConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("logDriver" -> o.logDriver.asJson, "options" -> o.options.asJson)
  }
  final implicit val DiscoverPollEndpointResponseEncoder: io.circe.Encoder[avias.ecs.models.DiscoverPollEndpointResponse] = io.circe.Encoder.instance { o => 
    Json.obj("endpoint" -> o.endpoint.asJson, "telemetryEndpoint" -> o.telemetryEndpoint.asJson)
  }
  final implicit val PutAttributesRequestEncoder: io.circe.Encoder[avias.ecs.models.PutAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val UpdateContainerAgentRequestEncoder: io.circe.Encoder[avias.ecs.models.UpdateContainerAgentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val ListServicesResponseEncoder: io.circe.Encoder[avias.ecs.models.ListServicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("serviceArns" -> o.serviceArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateClusterResponseEncoder: io.circe.Encoder[avias.ecs.models.CreateClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson)
  }
  final implicit val KernelCapabilitiesEncoder: io.circe.Encoder[avias.ecs.models.KernelCapabilities] = io.circe.Encoder.instance { o => 
    Json.obj("add" -> o.add.asJson, "drop" -> o.drop.asJson)
  }
  final implicit val SubmitTaskStateChangeRequestEncoder: io.circe.Encoder[avias.ecs.models.SubmitTaskStateChangeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "task" -> o.task.asJson, "status" -> o.status.asJson, "reason" -> o.reason.asJson, "containers" -> o.containers.asJson, "attachments" -> o.attachments.asJson)
  }
  final implicit val SubmitContainerStateChangeRequestEncoder: io.circe.Encoder[avias.ecs.models.SubmitContainerStateChangeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "status" -> o.status.asJson, "reason" -> o.reason.asJson, "task" -> o.task.asJson, "containerName" -> o.containerName.asJson, "exitCode" -> o.exitCode.asJson, "networkBindings" -> o.networkBindings.asJson)
  }
  final implicit val ServiceEncoder: io.circe.Encoder[avias.ecs.models.Service] = io.circe.Encoder.instance { o => 
    Json.obj("createdAt" -> o.createdAt.asJson, "serviceArn" -> o.serviceArn.asJson, "serviceName" -> o.serviceName.asJson, "roleArn" -> o.roleArn.asJson, "taskDefinition" -> o.taskDefinition.asJson, "status" -> o.status.asJson, "clusterArn" -> o.clusterArn.asJson, "deployments" -> o.deployments.asJson, "placementConstraints" -> o.placementConstraints.asJson, "placementStrategy" -> o.placementStrategy.asJson, "deploymentConfiguration" -> o.deploymentConfiguration.asJson, "events" -> o.events.asJson, "loadBalancers" -> o.loadBalancers.asJson, "desiredCount" -> o.desiredCount.asJson, "runningCount" -> o.runningCount.asJson, "pendingCount" -> o.pendingCount.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val DeviceEncoder: io.circe.Encoder[avias.ecs.models.Device] = io.circe.Encoder.instance { o => 
    Json.obj("hostPath" -> o.hostPath.asJson, "containerPath" -> o.containerPath.asJson, "permissions" -> o.permissions.asJson)
  }
  final implicit val ListClustersResponseEncoder: io.circe.Encoder[avias.ecs.models.ListClustersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("clusterArns" -> o.clusterArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTaskDefinitionResponseEncoder: io.circe.Encoder[avias.ecs.models.DescribeTaskDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val ClusterContainsContainerInstancesExceptionEncoder: io.circe.Encoder[avias.ecs.models.ClusterContainsContainerInstancesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteServiceRequestEncoder: io.circe.Encoder[avias.ecs.models.DeleteServiceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val LinuxParametersEncoder: io.circe.Encoder[avias.ecs.models.LinuxParameters] = io.circe.Encoder.instance { o => 
    Json.obj("capabilities" -> o.capabilities.asJson, "devices" -> o.devices.asJson, "initProcessEnabled" -> o.initProcessEnabled.asJson)
  }
  final implicit val UpdateContainerAgentResponseEncoder: io.circe.Encoder[avias.ecs.models.UpdateContainerAgentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson)
  }
  final implicit val DescribeClustersRequestEncoder: io.circe.Encoder[avias.ecs.models.DescribeClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("clusters" -> o.clusters.asJson)
  }
  final implicit val ContainerStateChangeEncoder: io.circe.Encoder[avias.ecs.models.ContainerStateChange] = io.circe.Encoder.instance { o => 
    Json.obj("containerName" -> o.containerName.asJson, "reason" -> o.reason.asJson, "status" -> o.status.asJson, "exitCode" -> o.exitCode.asJson, "networkBindings" -> o.networkBindings.asJson)
  }
  final implicit val DeleteClusterResponseEncoder: io.circe.Encoder[avias.ecs.models.DeleteClusterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson)
  }
  final implicit val DescribeClustersResponseEncoder: io.circe.Encoder[avias.ecs.models.DescribeClustersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("clusters" -> o.clusters.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val RegisterTaskDefinitionResponseEncoder: io.circe.Encoder[avias.ecs.models.RegisterTaskDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val DeleteAttributesResponseEncoder: io.circe.Encoder[avias.ecs.models.DeleteAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson)
  }
  final implicit val DeregisterContainerInstanceResponseEncoder: io.circe.Encoder[avias.ecs.models.DeregisterContainerInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson)
  }
  final implicit val UlimitEncoder: io.circe.Encoder[avias.ecs.models.Ulimit] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "softLimit" -> o.softLimit.asJson, "hardLimit" -> o.hardLimit.asJson)
  }
  final implicit val ListTasksResponseEncoder: io.circe.Encoder[avias.ecs.models.ListTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskArns" -> o.taskArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ContainerOverrideEncoder: io.circe.Encoder[avias.ecs.models.ContainerOverride] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "command" -> o.command.asJson, "environment" -> o.environment.asJson, "cpu" -> o.cpu.asJson, "memory" -> o.memory.asJson, "memoryReservation" -> o.memoryReservation.asJson)
  }
  final implicit val ContainerEncoder: io.circe.Encoder[avias.ecs.models.Container] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "reason" -> o.reason.asJson, "taskArn" -> o.taskArn.asJson, "containerArn" -> o.containerArn.asJson, "lastStatus" -> o.lastStatus.asJson, "exitCode" -> o.exitCode.asJson, "networkBindings" -> o.networkBindings.asJson, "networkInterfaces" -> o.networkInterfaces.asJson)
  }
  final implicit val ListAttributesRequestEncoder: io.circe.Encoder[avias.ecs.models.ListAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("targetType" -> o.targetType.asJson, "cluster" -> o.cluster.asJson, "attributeName" -> o.attributeName.asJson, "attributeValue" -> o.attributeValue.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeTasksRequestEncoder: io.circe.Encoder[avias.ecs.models.DescribeTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val VolumeFromEncoder: io.circe.Encoder[avias.ecs.models.VolumeFrom] = io.circe.Encoder.instance { o => 
    Json.obj("sourceContainer" -> o.sourceContainer.asJson, "readOnly" -> o.readOnly.asJson)
  }
  final implicit val PutAttributesResponseEncoder: io.circe.Encoder[avias.ecs.models.PutAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson)
  }
  final implicit val FailureEncoder: io.circe.Encoder[avias.ecs.models.Failure] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val DescribeContainerInstancesRequestEncoder: io.circe.Encoder[avias.ecs.models.DescribeContainerInstancesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val ListAttributesResponseEncoder: io.circe.Encoder[avias.ecs.models.ListAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AwsVpcConfigurationEncoder: io.circe.Encoder[avias.ecs.models.AwsVpcConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("subnets" -> o.subnets.asJson, "securityGroups" -> o.securityGroups.asJson)
  }
  final implicit val StartTaskResponseEncoder: io.circe.Encoder[avias.ecs.models.StartTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val DeregisterContainerInstanceRequestEncoder: io.circe.Encoder[avias.ecs.models.DeregisterContainerInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson, "force" -> o.force.asJson)
  }
  final implicit val NetworkInterfaceEncoder: io.circe.Encoder[avias.ecs.models.NetworkInterface] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentId" -> o.attachmentId.asJson, "privateIpv4Address" -> o.privateIpv4Address.asJson, "ipv6Address" -> o.ipv6Address.asJson)
  }
  final implicit val LoadBalancerEncoder: io.circe.Encoder[avias.ecs.models.LoadBalancer] = io.circe.Encoder.instance { o => 
    Json.obj("targetGroupArn" -> o.targetGroupArn.asJson, "loadBalancerName" -> o.loadBalancerName.asJson, "containerName" -> o.containerName.asJson, "containerPort" -> o.containerPort.asJson)
  }
  final implicit val KeyValuePairEncoder: io.circe.Encoder[avias.ecs.models.KeyValuePair] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "value" -> o.value.asJson)
  }
  final implicit val ClusterContainsServicesExceptionEncoder: io.circe.Encoder[avias.ecs.models.ClusterContainsServicesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListContainerInstancesResponseEncoder: io.circe.Encoder[avias.ecs.models.ListContainerInstancesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstanceArns" -> o.containerInstanceArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AttachmentEncoder: io.circe.Encoder[avias.ecs.models.Attachment] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "type" -> o.`type`.asJson, "status" -> o.status.asJson, "details" -> o.details.asJson)
  }
  final implicit val AttachmentStateChangeEncoder: io.circe.Encoder[avias.ecs.models.AttachmentStateChange] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentArn" -> o.attachmentArn.asJson, "status" -> o.status.asJson)
  }
  final implicit val UpdateContainerInstancesStateRequestEncoder: io.circe.Encoder[avias.ecs.models.UpdateContainerInstancesStateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "status" -> o.status.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val DeregisterTaskDefinitionResponseEncoder: io.circe.Encoder[avias.ecs.models.DeregisterTaskDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val PlacementStrategyEncoder: io.circe.Encoder[avias.ecs.models.PlacementStrategy] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "field" -> o.field.asJson)
  }
  final implicit val ServiceNotFoundExceptionEncoder: io.circe.Encoder[avias.ecs.models.ServiceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RunTaskResponseEncoder: io.circe.Encoder[avias.ecs.models.RunTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tasks" -> o.tasks.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val ResourceEncoder: io.circe.Encoder[avias.ecs.models.Resource] = io.circe.Encoder.instance { o => 
    Json.obj("longValue" -> o.longValue.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "stringSetValue" -> o.stringSetValue.asJson, "integerValue" -> o.integerValue.asJson, "doubleValue" -> o.doubleValue.asJson)
  }
  final implicit val ClusterEncoder: io.circe.Encoder[avias.ecs.models.Cluster] = io.circe.Encoder.instance { o => 
    Json.obj("clusterArn" -> o.clusterArn.asJson, "clusterName" -> o.clusterName.asJson, "status" -> o.status.asJson, "registeredContainerInstancesCount" -> o.registeredContainerInstancesCount.asJson, "runningTasksCount" -> o.runningTasksCount.asJson, "pendingTasksCount" -> o.pendingTasksCount.asJson, "activeServicesCount" -> o.activeServicesCount.asJson)
  }
  final implicit val VersionInfoEncoder: io.circe.Encoder[avias.ecs.models.VersionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("agentVersion" -> o.agentVersion.asJson, "agentHash" -> o.agentHash.asJson, "dockerVersion" -> o.dockerVersion.asJson)
  }
  final implicit val UpdateServiceResponseEncoder: io.circe.Encoder[avias.ecs.models.UpdateServiceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson)
  }
  final implicit val TargetNotFoundExceptionEncoder: io.circe.Encoder[avias.ecs.models.TargetNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServiceEventEncoder: io.circe.Encoder[avias.ecs.models.ServiceEvent] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "message" -> o.message.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val TaskEncoder: io.circe.Encoder[avias.ecs.models.Task] = io.circe.Encoder.instance { o => 
    Json.obj("containers" -> o.containers.asJson, "createdAt" -> o.createdAt.asJson, "startedAt" -> o.startedAt.asJson, "stoppedAt" -> o.stoppedAt.asJson, "version" -> o.version.asJson, "stoppedReason" -> o.stoppedReason.asJson, "group" -> o.group.asJson, "startedBy" -> o.startedBy.asJson, "taskArn" -> o.taskArn.asJson, "taskDefinitionArn" -> o.taskDefinitionArn.asJson, "clusterArn" -> o.clusterArn.asJson, "desiredStatus" -> o.desiredStatus.asJson, "containerInstanceArn" -> o.containerInstanceArn.asJson, "lastStatus" -> o.lastStatus.asJson, "attachments" -> o.attachments.asJson, "overrides" -> o.overrides.asJson)
  }
  final implicit val ServiceNotActiveExceptionEncoder: io.circe.Encoder[avias.ecs.models.ServiceNotActiveException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NetworkBindingEncoder: io.circe.Encoder[avias.ecs.models.NetworkBinding] = io.circe.Encoder.instance { o => 
    Json.obj("bindIP" -> o.bindIP.asJson, "containerPort" -> o.containerPort.asJson, "hostPort" -> o.hostPort.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val SubmitContainerStateChangeResponseEncoder: io.circe.Encoder[avias.ecs.models.SubmitContainerStateChangeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("acknowledgment" -> o.acknowledgment.asJson)
  }
  final implicit val HostEntryEncoder: io.circe.Encoder[avias.ecs.models.HostEntry] = io.circe.Encoder.instance { o => 
    Json.obj("hostname" -> o.hostname.asJson, "ipAddress" -> o.ipAddress.asJson)
  }
  final implicit val AttributeEncoder: io.circe.Encoder[avias.ecs.models.Attribute] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "value" -> o.value.asJson, "targetId" -> o.targetId.asJson, "targetType" -> o.targetType.asJson)
  }
  final implicit val ContainerDefinitionEncoder: io.circe.Encoder[avias.ecs.models.ContainerDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("mountPoints" -> o.mountPoints.asJson, "logConfiguration" -> o.logConfiguration.asJson, "name" -> o.name.asJson, "hostname" -> o.hostname.asJson, "image" -> o.image.asJson, "user" -> o.user.asJson, "workingDirectory" -> o.workingDirectory.asJson, "memory" -> o.memory.asJson, "memoryReservation" -> o.memoryReservation.asJson, "essential" -> o.essential.asJson, "disableNetworking" -> o.disableNetworking.asJson, "privileged" -> o.privileged.asJson, "readonlyRootFilesystem" -> o.readonlyRootFilesystem.asJson, "volumesFrom" -> o.volumesFrom.asJson, "linuxParameters" -> o.linuxParameters.asJson, "ulimits" -> o.ulimits.asJson, "dnsSearchDomains" -> o.dnsSearchDomains.asJson, "dockerSecurityOptions" -> o.dockerSecurityOptions.asJson, "command" -> o.command.asJson, "links" -> o.links.asJson, "dnsServers" -> o.dnsServers.asJson, "entryPoint" -> o.entryPoint.asJson, "dockerLabels" -> o.dockerLabels.asJson, "extraHosts" -> o.extraHosts.asJson, "cpu" -> o.cpu.asJson, "environment" -> o.environment.asJson, "portMappings" -> o.portMappings.asJson)
  }
  final implicit val StopTaskRequestEncoder: io.circe.Encoder[avias.ecs.models.StopTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("task" -> o.task.asJson, "cluster" -> o.cluster.asJson, "reason" -> o.reason.asJson)
  }
  final implicit val RegisterContainerInstanceResponseEncoder: io.circe.Encoder[avias.ecs.models.RegisterContainerInstanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson)
  }
  final implicit val DeploymentConfigurationEncoder: io.circe.Encoder[avias.ecs.models.DeploymentConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("maximumPercent" -> o.maximumPercent.asJson, "minimumHealthyPercent" -> o.minimumHealthyPercent.asJson)
  }
  final implicit val CreateServiceRequestEncoder: io.circe.Encoder[avias.ecs.models.CreateServiceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson, "serviceName" -> o.serviceName.asJson, "desiredCount" -> o.desiredCount.asJson, "clientToken" -> o.clientToken.asJson, "cluster" -> o.cluster.asJson, "role" -> o.role.asJson, "placementConstraints" -> o.placementConstraints.asJson, "placementStrategy" -> o.placementStrategy.asJson, "deploymentConfiguration" -> o.deploymentConfiguration.asJson, "loadBalancers" -> o.loadBalancers.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val PortMappingEncoder: io.circe.Encoder[avias.ecs.models.PortMapping] = io.circe.Encoder.instance { o => 
    Json.obj("containerPort" -> o.containerPort.asJson, "hostPort" -> o.hostPort.asJson, "protocol" -> o.protocol.asJson)
  }
  final implicit val NoUpdateAvailableExceptionEncoder: io.circe.Encoder[avias.ecs.models.NoUpdateAvailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DiscoverPollEndpointRequestEncoder: io.circe.Encoder[avias.ecs.models.DiscoverPollEndpointRequest] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val DescribeContainerInstancesResponseEncoder: io.circe.Encoder[avias.ecs.models.DescribeContainerInstancesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val CreateClusterRequestEncoder: io.circe.Encoder[avias.ecs.models.CreateClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("clusterName" -> o.clusterName.asJson)
  }
  final implicit val MissingVersionExceptionEncoder: io.circe.Encoder[avias.ecs.models.MissingVersionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartTaskRequestEncoder: io.circe.Encoder[avias.ecs.models.StartTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson, "containerInstances" -> o.containerInstances.asJson, "cluster" -> o.cluster.asJson, "startedBy" -> o.startedBy.asJson, "group" -> o.group.asJson, "overrides" -> o.overrides.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val ListTasksRequestEncoder: io.circe.Encoder[avias.ecs.models.ListTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("serviceName" -> o.serviceName.asJson, "startedBy" -> o.startedBy.asJson, "containerInstance" -> o.containerInstance.asJson, "cluster" -> o.cluster.asJson, "nextToken" -> o.nextToken.asJson, "family" -> o.family.asJson, "maxResults" -> o.maxResults.asJson, "desiredStatus" -> o.desiredStatus.asJson)
  }
  final implicit val UpdateServiceRequestEncoder: io.circe.Encoder[avias.ecs.models.UpdateServiceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson, "cluster" -> o.cluster.asJson, "taskDefinition" -> o.taskDefinition.asJson, "desiredCount" -> o.desiredCount.asJson, "deploymentConfiguration" -> o.deploymentConfiguration.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val RegisterContainerInstanceRequestEncoder: io.circe.Encoder[avias.ecs.models.RegisterContainerInstanceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "instanceIdentityDocument" -> o.instanceIdentityDocument.asJson, "instanceIdentityDocumentSignature" -> o.instanceIdentityDocumentSignature.asJson, "containerInstanceArn" -> o.containerInstanceArn.asJson, "totalResources" -> o.totalResources.asJson, "versionInfo" -> o.versionInfo.asJson, "attributes" -> o.attributes.asJson)
  }
  final implicit val DescribeServicesResponseEncoder: io.circe.Encoder[avias.ecs.models.DescribeServicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("services" -> o.services.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val TaskDefinitionEncoder: io.circe.Encoder[avias.ecs.models.TaskDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("volumes" -> o.volumes.asJson, "status" -> o.status.asJson, "taskDefinitionArn" -> o.taskDefinitionArn.asJson, "family" -> o.family.asJson, "taskRoleArn" -> o.taskRoleArn.asJson, "placementConstraints" -> o.placementConstraints.asJson, "requiresAttributes" -> o.requiresAttributes.asJson, "networkMode" -> o.networkMode.asJson, "revision" -> o.revision.asJson, "containerDefinitions" -> o.containerDefinitions.asJson)
  }
  final implicit val ContainerInstanceEncoder: io.circe.Encoder[avias.ecs.models.ContainerInstance] = io.circe.Encoder.instance { o => 
    Json.obj("attributes" -> o.attributes.asJson, "registeredAt" -> o.registeredAt.asJson, "version" -> o.version.asJson, "containerInstanceArn" -> o.containerInstanceArn.asJson, "ec2InstanceId" -> o.ec2InstanceId.asJson, "status" -> o.status.asJson, "versionInfo" -> o.versionInfo.asJson, "remainingResources" -> o.remainingResources.asJson, "registeredResources" -> o.registeredResources.asJson, "runningTasksCount" -> o.runningTasksCount.asJson, "pendingTasksCount" -> o.pendingTasksCount.asJson, "agentConnected" -> o.agentConnected.asJson, "attachments" -> o.attachments.asJson, "agentUpdateStatus" -> o.agentUpdateStatus.asJson)
  }
  final implicit val DeregisterTaskDefinitionRequestEncoder: io.circe.Encoder[avias.ecs.models.DeregisterTaskDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val CreateServiceResponseEncoder: io.circe.Encoder[avias.ecs.models.CreateServiceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson)
  }
  final implicit val ListTaskDefinitionsResponseEncoder: io.circe.Encoder[avias.ecs.models.ListTaskDefinitionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinitionArns" -> o.taskDefinitionArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteServiceResponseEncoder: io.circe.Encoder[avias.ecs.models.DeleteServiceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("service" -> o.service.asJson)
  }
  final implicit val ListTaskDefinitionFamiliesRequestEncoder: io.circe.Encoder[avias.ecs.models.ListTaskDefinitionFamiliesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("familyPrefix" -> o.familyPrefix.asJson, "nextToken" -> o.nextToken.asJson, "status" -> o.status.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeTaskDefinitionRequestEncoder: io.circe.Encoder[avias.ecs.models.DescribeTaskDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson)
  }
  final implicit val DeleteClusterRequestEncoder: io.circe.Encoder[avias.ecs.models.DeleteClusterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson)
  }
  final implicit val ListClustersRequestEncoder: io.circe.Encoder[avias.ecs.models.ListClustersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AttributeLimitExceededExceptionEncoder: io.circe.Encoder[avias.ecs.models.AttributeLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateInProgressExceptionEncoder: io.circe.Encoder[avias.ecs.models.UpdateInProgressException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val HostVolumePropertiesEncoder: io.circe.Encoder[avias.ecs.models.HostVolumeProperties] = io.circe.Encoder.instance { o => 
    Json.obj("sourcePath" -> o.sourcePath.asJson)
  }
  final implicit val ListServicesRequestEncoder: io.circe.Encoder[avias.ecs.models.ListServicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("cluster" -> o.cluster.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeServicesRequestEncoder: io.circe.Encoder[avias.ecs.models.DescribeServicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("services" -> o.services.asJson, "cluster" -> o.cluster.asJson)
  }
  final implicit val SubmitTaskStateChangeResponseEncoder: io.circe.Encoder[avias.ecs.models.SubmitTaskStateChangeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("acknowledgment" -> o.acknowledgment.asJson)
  }
  final implicit val RunTaskRequestEncoder: io.circe.Encoder[avias.ecs.models.RunTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskDefinition" -> o.taskDefinition.asJson, "cluster" -> o.cluster.asJson, "startedBy" -> o.startedBy.asJson, "group" -> o.group.asJson, "count" -> o.count.asJson, "placementConstraints" -> o.placementConstraints.asJson, "placementStrategy" -> o.placementStrategy.asJson, "overrides" -> o.overrides.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val DeploymentEncoder: io.circe.Encoder[avias.ecs.models.Deployment] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "status" -> o.status.asJson, "taskDefinition" -> o.taskDefinition.asJson, "desiredCount" -> o.desiredCount.asJson, "pendingCount" -> o.pendingCount.asJson, "runningCount" -> o.runningCount.asJson, "createdAt" -> o.createdAt.asJson, "updatedAt" -> o.updatedAt.asJson, "networkConfiguration" -> o.networkConfiguration.asJson)
  }
  final implicit val TaskDefinitionPlacementConstraintEncoder: io.circe.Encoder[avias.ecs.models.TaskDefinitionPlacementConstraint] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "expression" -> o.expression.asJson)
  }
  final implicit val StopTaskResponseEncoder: io.circe.Encoder[avias.ecs.models.StopTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("task" -> o.task.asJson)
  }
  final implicit val MountPointEncoder: io.circe.Encoder[avias.ecs.models.MountPoint] = io.circe.Encoder.instance { o => 
    Json.obj("sourceVolume" -> o.sourceVolume.asJson, "containerPath" -> o.containerPath.asJson, "readOnly" -> o.readOnly.asJson)
  }
  final implicit val TaskOverrideEncoder: io.circe.Encoder[avias.ecs.models.TaskOverride] = io.circe.Encoder.instance { o => 
    Json.obj("containerOverrides" -> o.containerOverrides.asJson, "taskRoleArn" -> o.taskRoleArn.asJson)
  }
  final implicit val UpdateContainerInstancesStateResponseEncoder: io.circe.Encoder[avias.ecs.models.UpdateContainerInstancesStateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("containerInstances" -> o.containerInstances.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val NetworkConfigurationEncoder: io.circe.Encoder[avias.ecs.models.NetworkConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("awsvpcConfiguration" -> o.awsvpcConfiguration.asJson)
  }
  final implicit val ListContainerInstancesRequestDecoder: io.circe.Decoder[avias.ecs.models.ListContainerInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("status")).mapN(avias.ecs.models.ListContainerInstancesRequest.apply _)
  }
  final implicit val ClusterNotFoundExceptionDecoder: io.circe.Decoder[avias.ecs.models.ClusterNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.ClusterNotFoundException)
  final implicit val RegisterTaskDefinitionRequestDecoder: io.circe.Decoder[avias.ecs.models.RegisterTaskDefinitionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("family"), o.get[scala.List[avias.ecs.models.ContainerDefinition]]("containerDefinitions"), o.get[scala.Option[scala.List[avias.ecs.models.Volume]]]("volumes"), o.get[scala.Option[java.lang.String]]("taskRoleArn"), o.get[scala.Option[scala.List[avias.ecs.models.TaskDefinitionPlacementConstraint]]]("placementConstraints"), o.get[scala.Option[java.lang.String]]("networkMode")).mapN(avias.ecs.models.RegisterTaskDefinitionRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.ecs.models.InvalidParameterException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.InvalidParameterException)
  final implicit val VolumeDecoder: io.circe.Decoder[avias.ecs.models.Volume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[avias.ecs.models.HostVolumeProperties]]("host")).mapN(avias.ecs.models.Volume.apply _)
  }
  final implicit val ListTaskDefinitionsRequestDecoder: io.circe.Decoder[avias.ecs.models.ListTaskDefinitionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("familyPrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("sort"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.ecs.models.ListTaskDefinitionsRequest.apply _)
  }
  final implicit val ClientExceptionDecoder: io.circe.Decoder[avias.ecs.models.ClientException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecs.models.ClientException.apply _)
  }
  final implicit val DeleteAttributesRequestDecoder: io.circe.Decoder[avias.ecs.models.DeleteAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.ecs.models.Attribute]]("attributes"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.DeleteAttributesRequest.apply _)
  }
  final implicit val PlacementConstraintDecoder: io.circe.Decoder[avias.ecs.models.PlacementConstraint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("expression")).mapN(avias.ecs.models.PlacementConstraint.apply _)
  }
  final implicit val ListTaskDefinitionFamiliesResponseDecoder: io.circe.Decoder[avias.ecs.models.ListTaskDefinitionFamiliesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("families"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListTaskDefinitionFamiliesResponse.apply _)
  }
  final implicit val DescribeTasksResponseDecoder: io.circe.Decoder[avias.ecs.models.DescribeTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Task]]]("tasks"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.DescribeTasksResponse.apply _)
  }
  final implicit val ServerExceptionDecoder: io.circe.Decoder[avias.ecs.models.ServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecs.models.ServerException.apply _)
  }
  final implicit val LogConfigurationDecoder: io.circe.Decoder[avias.ecs.models.LogConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logDriver"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("options")).mapN(avias.ecs.models.LogConfiguration.apply _)
  }
  final implicit val DiscoverPollEndpointResponseDecoder: io.circe.Decoder[avias.ecs.models.DiscoverPollEndpointResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("endpoint"), o.get[scala.Option[java.lang.String]]("telemetryEndpoint")).mapN(avias.ecs.models.DiscoverPollEndpointResponse.apply _)
  }
  final implicit val PutAttributesRequestDecoder: io.circe.Decoder[avias.ecs.models.PutAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.ecs.models.Attribute]]("attributes"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.PutAttributesRequest.apply _)
  }
  final implicit val UpdateContainerAgentRequestDecoder: io.circe.Decoder[avias.ecs.models.UpdateContainerAgentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.UpdateContainerAgentRequest.apply _)
  }
  final implicit val ListServicesResponseDecoder: io.circe.Decoder[avias.ecs.models.ListServicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("serviceArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListServicesResponse.apply _)
  }
  final implicit val CreateClusterResponseDecoder: io.circe.Decoder[avias.ecs.models.CreateClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.Cluster]]("cluster").map(avias.ecs.models.CreateClusterResponse.apply _)
  }
  final implicit val KernelCapabilitiesDecoder: io.circe.Decoder[avias.ecs.models.KernelCapabilities] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("add"), o.get[scala.Option[scala.List[java.lang.String]]]("drop")).mapN(avias.ecs.models.KernelCapabilities.apply _)
  }
  final implicit val SubmitTaskStateChangeRequestDecoder: io.circe.Decoder[avias.ecs.models.SubmitTaskStateChangeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("task"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[scala.List[avias.ecs.models.ContainerStateChange]]]("containers"), o.get[scala.Option[scala.List[avias.ecs.models.AttachmentStateChange]]]("attachments")).mapN(avias.ecs.models.SubmitTaskStateChangeRequest.apply _)
  }
  final implicit val SubmitContainerStateChangeRequestDecoder: io.circe.Decoder[avias.ecs.models.SubmitContainerStateChangeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("task"), o.get[scala.Option[java.lang.String]]("containerName"), o.get[scala.Option[scala.Int]]("exitCode"), o.get[scala.Option[scala.List[avias.ecs.models.NetworkBinding]]]("networkBindings")).mapN(avias.ecs.models.SubmitContainerStateChangeRequest.apply _)
  }
  final implicit val ServiceDecoder: io.circe.Decoder[avias.ecs.models.Service] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("serviceArn"), o.get[scala.Option[java.lang.String]]("serviceName"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("taskDefinition"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("clusterArn"), o.get[scala.Option[scala.List[avias.ecs.models.Deployment]]]("deployments"), o.get[scala.Option[scala.List[avias.ecs.models.PlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[avias.ecs.models.PlacementStrategy]]]("placementStrategy"), o.get[scala.Option[avias.ecs.models.DeploymentConfiguration]]("deploymentConfiguration"), o.get[scala.Option[scala.List[avias.ecs.models.ServiceEvent]]]("events"), o.get[scala.Option[scala.List[avias.ecs.models.LoadBalancer]]]("loadBalancers"), o.get[scala.Option[scala.Int]]("desiredCount"), o.get[scala.Option[scala.Int]]("runningCount"), o.get[scala.Option[scala.Int]]("pendingCount"), o.get[scala.Option[avias.ecs.models.NetworkConfiguration]]("networkConfiguration")).mapN(avias.ecs.models.Service.apply _)
  }
  final implicit val DeviceDecoder: io.circe.Decoder[avias.ecs.models.Device] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("hostPath"), o.get[scala.Option[java.lang.String]]("containerPath"), o.get[scala.Option[scala.List[java.lang.String]]]("permissions")).mapN(avias.ecs.models.Device.apply _)
  }
  final implicit val ListClustersResponseDecoder: io.circe.Decoder[avias.ecs.models.ListClustersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("clusterArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListClustersResponse.apply _)
  }
  final implicit val DescribeTaskDefinitionResponseDecoder: io.circe.Decoder[avias.ecs.models.DescribeTaskDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.TaskDefinition]]("taskDefinition").map(avias.ecs.models.DescribeTaskDefinitionResponse.apply _)
  }
  final implicit val ClusterContainsContainerInstancesExceptionDecoder: io.circe.Decoder[avias.ecs.models.ClusterContainsContainerInstancesException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.ClusterContainsContainerInstancesException)
  final implicit val DeleteServiceRequestDecoder: io.circe.Decoder[avias.ecs.models.DeleteServiceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("service"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.DeleteServiceRequest.apply _)
  }
  final implicit val LinuxParametersDecoder: io.circe.Decoder[avias.ecs.models.LinuxParameters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ecs.models.KernelCapabilities]]("capabilities"), o.get[scala.Option[scala.List[avias.ecs.models.Device]]]("devices"), o.get[scala.Option[scala.Boolean]]("initProcessEnabled")).mapN(avias.ecs.models.LinuxParameters.apply _)
  }
  final implicit val UpdateContainerAgentResponseDecoder: io.circe.Decoder[avias.ecs.models.UpdateContainerAgentResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.ContainerInstance]]("containerInstance").map(avias.ecs.models.UpdateContainerAgentResponse.apply _)
  }
  final implicit val DescribeClustersRequestDecoder: io.circe.Decoder[avias.ecs.models.DescribeClustersRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("clusters").map(avias.ecs.models.DescribeClustersRequest.apply _)
  }
  final implicit val ContainerStateChangeDecoder: io.circe.Decoder[avias.ecs.models.ContainerStateChange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("containerName"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.Int]]("exitCode"), o.get[scala.Option[scala.List[avias.ecs.models.NetworkBinding]]]("networkBindings")).mapN(avias.ecs.models.ContainerStateChange.apply _)
  }
  final implicit val DeleteClusterResponseDecoder: io.circe.Decoder[avias.ecs.models.DeleteClusterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.Cluster]]("cluster").map(avias.ecs.models.DeleteClusterResponse.apply _)
  }
  final implicit val DescribeClustersResponseDecoder: io.circe.Decoder[avias.ecs.models.DescribeClustersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Cluster]]]("clusters"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.DescribeClustersResponse.apply _)
  }
  final implicit val RegisterTaskDefinitionResponseDecoder: io.circe.Decoder[avias.ecs.models.RegisterTaskDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.TaskDefinition]]("taskDefinition").map(avias.ecs.models.RegisterTaskDefinitionResponse.apply _)
  }
  final implicit val DeleteAttributesResponseDecoder: io.circe.Decoder[avias.ecs.models.DeleteAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.ecs.models.Attribute]]]("attributes").map(avias.ecs.models.DeleteAttributesResponse.apply _)
  }
  final implicit val DeregisterContainerInstanceResponseDecoder: io.circe.Decoder[avias.ecs.models.DeregisterContainerInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.ContainerInstance]]("containerInstance").map(avias.ecs.models.DeregisterContainerInstanceResponse.apply _)
  }
  final implicit val UlimitDecoder: io.circe.Decoder[avias.ecs.models.Ulimit] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Int]("softLimit"), o.get[scala.Int]("hardLimit")).mapN(avias.ecs.models.Ulimit.apply _)
  }
  final implicit val ListTasksResponseDecoder: io.circe.Decoder[avias.ecs.models.ListTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("taskArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListTasksResponse.apply _)
  }
  final implicit val ContainerOverrideDecoder: io.circe.Decoder[avias.ecs.models.ContainerOverride] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[java.lang.String]]]("command"), o.get[scala.Option[scala.List[avias.ecs.models.KeyValuePair]]]("environment"), o.get[scala.Option[scala.Int]]("cpu"), o.get[scala.Option[scala.Int]]("memory"), o.get[scala.Option[scala.Int]]("memoryReservation")).mapN(avias.ecs.models.ContainerOverride.apply _)
  }
  final implicit val ContainerDecoder: io.circe.Decoder[avias.ecs.models.Container] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("reason"), o.get[scala.Option[java.lang.String]]("taskArn"), o.get[scala.Option[java.lang.String]]("containerArn"), o.get[scala.Option[java.lang.String]]("lastStatus"), o.get[scala.Option[scala.Int]]("exitCode"), o.get[scala.Option[scala.List[avias.ecs.models.NetworkBinding]]]("networkBindings"), o.get[scala.Option[scala.List[avias.ecs.models.NetworkInterface]]]("networkInterfaces")).mapN(avias.ecs.models.Container.apply _)
  }
  final implicit val ListAttributesRequestDecoder: io.circe.Decoder[avias.ecs.models.ListAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("targetType"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("attributeName"), o.get[scala.Option[java.lang.String]]("attributeValue"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.ecs.models.ListAttributesRequest.apply _)
  }
  final implicit val DescribeTasksRequestDecoder: io.circe.Decoder[avias.ecs.models.DescribeTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("tasks"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.DescribeTasksRequest.apply _)
  }
  final implicit val VolumeFromDecoder: io.circe.Decoder[avias.ecs.models.VolumeFrom] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sourceContainer"), o.get[scala.Option[scala.Boolean]]("readOnly")).mapN(avias.ecs.models.VolumeFrom.apply _)
  }
  final implicit val PutAttributesResponseDecoder: io.circe.Decoder[avias.ecs.models.PutAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.ecs.models.Attribute]]]("attributes").map(avias.ecs.models.PutAttributesResponse.apply _)
  }
  final implicit val FailureDecoder: io.circe.Decoder[avias.ecs.models.Failure] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("reason")).mapN(avias.ecs.models.Failure.apply _)
  }
  final implicit val DescribeContainerInstancesRequestDecoder: io.circe.Decoder[avias.ecs.models.DescribeContainerInstancesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("containerInstances"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.DescribeContainerInstancesRequest.apply _)
  }
  final implicit val ListAttributesResponseDecoder: io.circe.Decoder[avias.ecs.models.ListAttributesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Attribute]]]("attributes"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListAttributesResponse.apply _)
  }
  final implicit val AwsVpcConfigurationDecoder: io.circe.Decoder[avias.ecs.models.AwsVpcConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("subnets"), o.get[scala.Option[scala.List[java.lang.String]]]("securityGroups")).mapN(avias.ecs.models.AwsVpcConfiguration.apply _)
  }
  final implicit val StartTaskResponseDecoder: io.circe.Decoder[avias.ecs.models.StartTaskResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Task]]]("tasks"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.StartTaskResponse.apply _)
  }
  final implicit val DeregisterContainerInstanceRequestDecoder: io.circe.Decoder[avias.ecs.models.DeregisterContainerInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[scala.Boolean]]("force")).mapN(avias.ecs.models.DeregisterContainerInstanceRequest.apply _)
  }
  final implicit val NetworkInterfaceDecoder: io.circe.Decoder[avias.ecs.models.NetworkInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attachmentId"), o.get[scala.Option[java.lang.String]]("privateIpv4Address"), o.get[scala.Option[java.lang.String]]("ipv6Address")).mapN(avias.ecs.models.NetworkInterface.apply _)
  }
  final implicit val LoadBalancerDecoder: io.circe.Decoder[avias.ecs.models.LoadBalancer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("targetGroupArn"), o.get[scala.Option[java.lang.String]]("loadBalancerName"), o.get[scala.Option[java.lang.String]]("containerName"), o.get[scala.Option[scala.Int]]("containerPort")).mapN(avias.ecs.models.LoadBalancer.apply _)
  }
  final implicit val KeyValuePairDecoder: io.circe.Decoder[avias.ecs.models.KeyValuePair] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("value")).mapN(avias.ecs.models.KeyValuePair.apply _)
  }
  final implicit val ClusterContainsServicesExceptionDecoder: io.circe.Decoder[avias.ecs.models.ClusterContainsServicesException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.ClusterContainsServicesException)
  final implicit val ListContainerInstancesResponseDecoder: io.circe.Decoder[avias.ecs.models.ListContainerInstancesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("containerInstanceArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListContainerInstancesResponse.apply _)
  }
  final implicit val AttachmentDecoder: io.circe.Decoder[avias.ecs.models.Attachment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.List[avias.ecs.models.KeyValuePair]]]("details")).mapN(avias.ecs.models.Attachment.apply _)
  }
  final implicit val AttachmentStateChangeDecoder: io.circe.Decoder[avias.ecs.models.AttachmentStateChange] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("attachmentArn"), o.get[java.lang.String]("status")).mapN(avias.ecs.models.AttachmentStateChange.apply _)
  }
  final implicit val UpdateContainerInstancesStateRequestDecoder: io.circe.Decoder[avias.ecs.models.UpdateContainerInstancesStateRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("containerInstances"), o.get[java.lang.String]("status"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.UpdateContainerInstancesStateRequest.apply _)
  }
  final implicit val DeregisterTaskDefinitionResponseDecoder: io.circe.Decoder[avias.ecs.models.DeregisterTaskDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.TaskDefinition]]("taskDefinition").map(avias.ecs.models.DeregisterTaskDefinitionResponse.apply _)
  }
  final implicit val PlacementStrategyDecoder: io.circe.Decoder[avias.ecs.models.PlacementStrategy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("field")).mapN(avias.ecs.models.PlacementStrategy.apply _)
  }
  final implicit val ServiceNotFoundExceptionDecoder: io.circe.Decoder[avias.ecs.models.ServiceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.ServiceNotFoundException)
  final implicit val RunTaskResponseDecoder: io.circe.Decoder[avias.ecs.models.RunTaskResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Task]]]("tasks"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.RunTaskResponse.apply _)
  }
  final implicit val ResourceDecoder: io.circe.Decoder[avias.ecs.models.Resource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("longValue"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.List[java.lang.String]]]("stringSetValue"), o.get[scala.Option[scala.Int]]("integerValue"), o.get[scala.Option[scala.Double]]("doubleValue")).mapN(avias.ecs.models.Resource.apply _)
  }
  final implicit val ClusterDecoder: io.circe.Decoder[avias.ecs.models.Cluster] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("clusterArn"), o.get[scala.Option[java.lang.String]]("clusterName"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.Int]]("registeredContainerInstancesCount"), o.get[scala.Option[scala.Int]]("runningTasksCount"), o.get[scala.Option[scala.Int]]("pendingTasksCount"), o.get[scala.Option[scala.Int]]("activeServicesCount")).mapN(avias.ecs.models.Cluster.apply _)
  }
  final implicit val VersionInfoDecoder: io.circe.Decoder[avias.ecs.models.VersionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("agentVersion"), o.get[scala.Option[java.lang.String]]("agentHash"), o.get[scala.Option[java.lang.String]]("dockerVersion")).mapN(avias.ecs.models.VersionInfo.apply _)
  }
  final implicit val UpdateServiceResponseDecoder: io.circe.Decoder[avias.ecs.models.UpdateServiceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.Service]]("service").map(avias.ecs.models.UpdateServiceResponse.apply _)
  }
  final implicit val TargetNotFoundExceptionDecoder: io.circe.Decoder[avias.ecs.models.TargetNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.TargetNotFoundException)
  final implicit val ServiceEventDecoder: io.circe.Decoder[avias.ecs.models.ServiceEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.time.Instant]]("createdAt")).mapN(avias.ecs.models.ServiceEvent.apply _)
  }
  final implicit val TaskDecoder: io.circe.Decoder[avias.ecs.models.Task] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Container]]]("containers"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.time.Instant]]("startedAt"), o.get[scala.Option[java.time.Instant]]("stoppedAt"), o.get[scala.Option[scala.Long]]("version"), o.get[scala.Option[java.lang.String]]("stoppedReason"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("taskArn"), o.get[scala.Option[java.lang.String]]("taskDefinitionArn"), o.get[scala.Option[java.lang.String]]("clusterArn"), o.get[scala.Option[java.lang.String]]("desiredStatus"), o.get[scala.Option[java.lang.String]]("containerInstanceArn"), o.get[scala.Option[java.lang.String]]("lastStatus"), o.get[scala.Option[scala.List[avias.ecs.models.Attachment]]]("attachments"), o.get[scala.Option[avias.ecs.models.TaskOverride]]("overrides")).mapN(avias.ecs.models.Task.apply _)
  }
  final implicit val ServiceNotActiveExceptionDecoder: io.circe.Decoder[avias.ecs.models.ServiceNotActiveException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.ServiceNotActiveException)
  final implicit val NetworkBindingDecoder: io.circe.Decoder[avias.ecs.models.NetworkBinding] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("bindIP"), o.get[scala.Option[scala.Int]]("containerPort"), o.get[scala.Option[scala.Int]]("hostPort"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(avias.ecs.models.NetworkBinding.apply _)
  }
  final implicit val SubmitContainerStateChangeResponseDecoder: io.circe.Decoder[avias.ecs.models.SubmitContainerStateChangeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("acknowledgment").map(avias.ecs.models.SubmitContainerStateChangeResponse.apply _)
  }
  final implicit val HostEntryDecoder: io.circe.Decoder[avias.ecs.models.HostEntry] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("hostname"), o.get[java.lang.String]("ipAddress")).mapN(avias.ecs.models.HostEntry.apply _)
  }
  final implicit val AttributeDecoder: io.circe.Decoder[avias.ecs.models.Attribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[java.lang.String]]("value"), o.get[scala.Option[java.lang.String]]("targetId"), o.get[scala.Option[java.lang.String]]("targetType")).mapN(avias.ecs.models.Attribute.apply _)
  }
  final implicit val ContainerDefinitionDecoder: io.circe.Decoder[avias.ecs.models.ContainerDefinition] = io.circe.Decoder.instance { o => 
    for (`mountPoints` <- o.get[scala.Option[scala.List[avias.ecs.models.MountPoint]]]("mountPoints"); `logConfiguration` <- o.get[scala.Option[avias.ecs.models.LogConfiguration]]("logConfiguration"); `name` <- o.get[scala.Option[java.lang.String]]("name"); `hostname` <- o.get[scala.Option[java.lang.String]]("hostname"); `image` <- o.get[scala.Option[java.lang.String]]("image"); `user` <- o.get[scala.Option[java.lang.String]]("user"); `workingDirectory` <- o.get[scala.Option[java.lang.String]]("workingDirectory"); `memory` <- o.get[scala.Option[scala.Int]]("memory"); `memoryReservation` <- o.get[scala.Option[scala.Int]]("memoryReservation"); `essential` <- o.get[scala.Option[scala.Boolean]]("essential"); `disableNetworking` <- o.get[scala.Option[scala.Boolean]]("disableNetworking"); `privileged` <- o.get[scala.Option[scala.Boolean]]("privileged"); `readonlyRootFilesystem` <- o.get[scala.Option[scala.Boolean]]("readonlyRootFilesystem"); `volumesFrom` <- o.get[scala.Option[scala.List[avias.ecs.models.VolumeFrom]]]("volumesFrom"); `linuxParameters` <- o.get[scala.Option[avias.ecs.models.LinuxParameters]]("linuxParameters"); `ulimits` <- o.get[scala.Option[scala.List[avias.ecs.models.Ulimit]]]("ulimits"); `dnsSearchDomains` <- o.get[scala.Option[scala.List[java.lang.String]]]("dnsSearchDomains"); `dockerSecurityOptions` <- o.get[scala.Option[scala.List[java.lang.String]]]("dockerSecurityOptions"); `command` <- o.get[scala.Option[scala.List[java.lang.String]]]("command"); `links` <- o.get[scala.Option[scala.List[java.lang.String]]]("links"); `dnsServers` <- o.get[scala.Option[scala.List[java.lang.String]]]("dnsServers"); `entryPoint` <- o.get[scala.Option[scala.List[java.lang.String]]]("entryPoint"); `dockerLabels` <- o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("dockerLabels"); `extraHosts` <- o.get[scala.Option[scala.List[avias.ecs.models.HostEntry]]]("extraHosts"); `cpu` <- o.get[scala.Option[scala.Int]]("cpu"); `environment` <- o.get[scala.Option[scala.List[avias.ecs.models.KeyValuePair]]]("environment"); `portMappings` <- o.get[scala.Option[scala.List[avias.ecs.models.PortMapping]]]("portMappings")) yield avias.ecs.models.ContainerDefinition(mountPoints, logConfiguration, name, hostname, image, user, workingDirectory, memory, memoryReservation, essential, disableNetworking, privileged, readonlyRootFilesystem, volumesFrom, linuxParameters, ulimits, dnsSearchDomains, dockerSecurityOptions, command, links, dnsServers, entryPoint, dockerLabels, extraHosts, cpu, environment, portMappings)
  }
  final implicit val StopTaskRequestDecoder: io.circe.Decoder[avias.ecs.models.StopTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("task"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("reason")).mapN(avias.ecs.models.StopTaskRequest.apply _)
  }
  final implicit val RegisterContainerInstanceResponseDecoder: io.circe.Decoder[avias.ecs.models.RegisterContainerInstanceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.ContainerInstance]]("containerInstance").map(avias.ecs.models.RegisterContainerInstanceResponse.apply _)
  }
  final implicit val DeploymentConfigurationDecoder: io.circe.Decoder[avias.ecs.models.DeploymentConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("maximumPercent"), o.get[scala.Option[scala.Int]]("minimumHealthyPercent")).mapN(avias.ecs.models.DeploymentConfiguration.apply _)
  }
  final implicit val CreateServiceRequestDecoder: io.circe.Decoder[avias.ecs.models.CreateServiceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskDefinition"), o.get[java.lang.String]("serviceName"), o.get[scala.Int]("desiredCount"), o.get[scala.Option[java.lang.String]]("clientToken"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("role"), o.get[scala.Option[scala.List[avias.ecs.models.PlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[avias.ecs.models.PlacementStrategy]]]("placementStrategy"), o.get[scala.Option[avias.ecs.models.DeploymentConfiguration]]("deploymentConfiguration"), o.get[scala.Option[scala.List[avias.ecs.models.LoadBalancer]]]("loadBalancers"), o.get[scala.Option[avias.ecs.models.NetworkConfiguration]]("networkConfiguration")).mapN(avias.ecs.models.CreateServiceRequest.apply _)
  }
  final implicit val PortMappingDecoder: io.circe.Decoder[avias.ecs.models.PortMapping] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("containerPort"), o.get[scala.Option[scala.Int]]("hostPort"), o.get[scala.Option[java.lang.String]]("protocol")).mapN(avias.ecs.models.PortMapping.apply _)
  }
  final implicit val NoUpdateAvailableExceptionDecoder: io.circe.Decoder[avias.ecs.models.NoUpdateAvailableException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.NoUpdateAvailableException)
  final implicit val DiscoverPollEndpointRequestDecoder: io.circe.Decoder[avias.ecs.models.DiscoverPollEndpointRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.DiscoverPollEndpointRequest.apply _)
  }
  final implicit val DescribeContainerInstancesResponseDecoder: io.circe.Decoder[avias.ecs.models.DescribeContainerInstancesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.ContainerInstance]]]("containerInstances"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.DescribeContainerInstancesResponse.apply _)
  }
  final implicit val CreateClusterRequestDecoder: io.circe.Decoder[avias.ecs.models.CreateClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("clusterName").map(avias.ecs.models.CreateClusterRequest.apply _)
  }
  final implicit val MissingVersionExceptionDecoder: io.circe.Decoder[avias.ecs.models.MissingVersionException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.MissingVersionException)
  final implicit val StartTaskRequestDecoder: io.circe.Decoder[avias.ecs.models.StartTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskDefinition"), o.get[scala.List[java.lang.String]]("containerInstances"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[avias.ecs.models.TaskOverride]]("overrides"), o.get[scala.Option[avias.ecs.models.NetworkConfiguration]]("networkConfiguration")).mapN(avias.ecs.models.StartTaskRequest.apply _)
  }
  final implicit val ListTasksRequestDecoder: io.circe.Decoder[avias.ecs.models.ListTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("serviceName"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("containerInstance"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("family"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("desiredStatus")).mapN(avias.ecs.models.ListTasksRequest.apply _)
  }
  final implicit val UpdateServiceRequestDecoder: io.circe.Decoder[avias.ecs.models.UpdateServiceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("service"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("taskDefinition"), o.get[scala.Option[scala.Int]]("desiredCount"), o.get[scala.Option[avias.ecs.models.DeploymentConfiguration]]("deploymentConfiguration"), o.get[scala.Option[avias.ecs.models.NetworkConfiguration]]("networkConfiguration")).mapN(avias.ecs.models.UpdateServiceRequest.apply _)
  }
  final implicit val RegisterContainerInstanceRequestDecoder: io.circe.Decoder[avias.ecs.models.RegisterContainerInstanceRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("instanceIdentityDocument"), o.get[scala.Option[java.lang.String]]("instanceIdentityDocumentSignature"), o.get[scala.Option[java.lang.String]]("containerInstanceArn"), o.get[scala.Option[scala.List[avias.ecs.models.Resource]]]("totalResources"), o.get[scala.Option[avias.ecs.models.VersionInfo]]("versionInfo"), o.get[scala.Option[scala.List[avias.ecs.models.Attribute]]]("attributes")).mapN(avias.ecs.models.RegisterContainerInstanceRequest.apply _)
  }
  final implicit val DescribeServicesResponseDecoder: io.circe.Decoder[avias.ecs.models.DescribeServicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Service]]]("services"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.DescribeServicesResponse.apply _)
  }
  final implicit val TaskDefinitionDecoder: io.circe.Decoder[avias.ecs.models.TaskDefinition] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Volume]]]("volumes"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("taskDefinitionArn"), o.get[scala.Option[java.lang.String]]("family"), o.get[scala.Option[java.lang.String]]("taskRoleArn"), o.get[scala.Option[scala.List[avias.ecs.models.TaskDefinitionPlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[avias.ecs.models.Attribute]]]("requiresAttributes"), o.get[scala.Option[java.lang.String]]("networkMode"), o.get[scala.Option[scala.Int]]("revision"), o.get[scala.Option[scala.List[avias.ecs.models.ContainerDefinition]]]("containerDefinitions")).mapN(avias.ecs.models.TaskDefinition.apply _)
  }
  final implicit val ContainerInstanceDecoder: io.circe.Decoder[avias.ecs.models.ContainerInstance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.Attribute]]]("attributes"), o.get[scala.Option[java.time.Instant]]("registeredAt"), o.get[scala.Option[scala.Long]]("version"), o.get[scala.Option[java.lang.String]]("containerInstanceArn"), o.get[scala.Option[java.lang.String]]("ec2InstanceId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[avias.ecs.models.VersionInfo]]("versionInfo"), o.get[scala.Option[scala.List[avias.ecs.models.Resource]]]("remainingResources"), o.get[scala.Option[scala.List[avias.ecs.models.Resource]]]("registeredResources"), o.get[scala.Option[scala.Int]]("runningTasksCount"), o.get[scala.Option[scala.Int]]("pendingTasksCount"), o.get[scala.Option[scala.Boolean]]("agentConnected"), o.get[scala.Option[scala.List[avias.ecs.models.Attachment]]]("attachments"), o.get[scala.Option[java.lang.String]]("agentUpdateStatus")).mapN(avias.ecs.models.ContainerInstance.apply _)
  }
  final implicit val DeregisterTaskDefinitionRequestDecoder: io.circe.Decoder[avias.ecs.models.DeregisterTaskDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskDefinition").map(avias.ecs.models.DeregisterTaskDefinitionRequest.apply _)
  }
  final implicit val CreateServiceResponseDecoder: io.circe.Decoder[avias.ecs.models.CreateServiceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.Service]]("service").map(avias.ecs.models.CreateServiceResponse.apply _)
  }
  final implicit val ListTaskDefinitionsResponseDecoder: io.circe.Decoder[avias.ecs.models.ListTaskDefinitionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("taskDefinitionArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecs.models.ListTaskDefinitionsResponse.apply _)
  }
  final implicit val DeleteServiceResponseDecoder: io.circe.Decoder[avias.ecs.models.DeleteServiceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.Service]]("service").map(avias.ecs.models.DeleteServiceResponse.apply _)
  }
  final implicit val ListTaskDefinitionFamiliesRequestDecoder: io.circe.Decoder[avias.ecs.models.ListTaskDefinitionFamiliesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("familyPrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.ecs.models.ListTaskDefinitionFamiliesRequest.apply _)
  }
  final implicit val DescribeTaskDefinitionRequestDecoder: io.circe.Decoder[avias.ecs.models.DescribeTaskDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskDefinition").map(avias.ecs.models.DescribeTaskDefinitionRequest.apply _)
  }
  final implicit val DeleteClusterRequestDecoder: io.circe.Decoder[avias.ecs.models.DeleteClusterRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("cluster").map(avias.ecs.models.DeleteClusterRequest.apply _)
  }
  final implicit val ListClustersRequestDecoder: io.circe.Decoder[avias.ecs.models.ListClustersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.ecs.models.ListClustersRequest.apply _)
  }
  final implicit val AttributeLimitExceededExceptionDecoder: io.circe.Decoder[avias.ecs.models.AttributeLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.AttributeLimitExceededException)
  final implicit val UpdateInProgressExceptionDecoder: io.circe.Decoder[avias.ecs.models.UpdateInProgressException.type] = io.circe.Decoder.decodeUnit.as(avias.ecs.models.UpdateInProgressException)
  final implicit val HostVolumePropertiesDecoder: io.circe.Decoder[avias.ecs.models.HostVolumeProperties] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("sourcePath").map(avias.ecs.models.HostVolumeProperties.apply _)
  }
  final implicit val ListServicesRequestDecoder: io.circe.Decoder[avias.ecs.models.ListServicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.ecs.models.ListServicesRequest.apply _)
  }
  final implicit val DescribeServicesRequestDecoder: io.circe.Decoder[avias.ecs.models.DescribeServicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("services"), o.get[scala.Option[java.lang.String]]("cluster")).mapN(avias.ecs.models.DescribeServicesRequest.apply _)
  }
  final implicit val SubmitTaskStateChangeResponseDecoder: io.circe.Decoder[avias.ecs.models.SubmitTaskStateChangeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("acknowledgment").map(avias.ecs.models.SubmitTaskStateChangeResponse.apply _)
  }
  final implicit val RunTaskRequestDecoder: io.circe.Decoder[avias.ecs.models.RunTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("taskDefinition"), o.get[scala.Option[java.lang.String]]("cluster"), o.get[scala.Option[java.lang.String]]("startedBy"), o.get[scala.Option[java.lang.String]]("group"), o.get[scala.Option[scala.Int]]("count"), o.get[scala.Option[scala.List[avias.ecs.models.PlacementConstraint]]]("placementConstraints"), o.get[scala.Option[scala.List[avias.ecs.models.PlacementStrategy]]]("placementStrategy"), o.get[scala.Option[avias.ecs.models.TaskOverride]]("overrides"), o.get[scala.Option[avias.ecs.models.NetworkConfiguration]]("networkConfiguration")).mapN(avias.ecs.models.RunTaskRequest.apply _)
  }
  final implicit val DeploymentDecoder: io.circe.Decoder[avias.ecs.models.Deployment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("taskDefinition"), o.get[scala.Option[scala.Int]]("desiredCount"), o.get[scala.Option[scala.Int]]("pendingCount"), o.get[scala.Option[scala.Int]]("runningCount"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.time.Instant]]("updatedAt"), o.get[scala.Option[avias.ecs.models.NetworkConfiguration]]("networkConfiguration")).mapN(avias.ecs.models.Deployment.apply _)
  }
  final implicit val TaskDefinitionPlacementConstraintDecoder: io.circe.Decoder[avias.ecs.models.TaskDefinitionPlacementConstraint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("expression")).mapN(avias.ecs.models.TaskDefinitionPlacementConstraint.apply _)
  }
  final implicit val StopTaskResponseDecoder: io.circe.Decoder[avias.ecs.models.StopTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.Task]]("task").map(avias.ecs.models.StopTaskResponse.apply _)
  }
  final implicit val MountPointDecoder: io.circe.Decoder[avias.ecs.models.MountPoint] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("sourceVolume"), o.get[scala.Option[java.lang.String]]("containerPath"), o.get[scala.Option[scala.Boolean]]("readOnly")).mapN(avias.ecs.models.MountPoint.apply _)
  }
  final implicit val TaskOverrideDecoder: io.circe.Decoder[avias.ecs.models.TaskOverride] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.ContainerOverride]]]("containerOverrides"), o.get[scala.Option[java.lang.String]]("taskRoleArn")).mapN(avias.ecs.models.TaskOverride.apply _)
  }
  final implicit val UpdateContainerInstancesStateResponseDecoder: io.circe.Decoder[avias.ecs.models.UpdateContainerInstancesStateResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecs.models.ContainerInstance]]]("containerInstances"), o.get[scala.Option[scala.List[avias.ecs.models.Failure]]]("failures")).mapN(avias.ecs.models.UpdateContainerInstancesStateResponse.apply _)
  }
  final implicit val NetworkConfigurationDecoder: io.circe.Decoder[avias.ecs.models.NetworkConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecs.models.AwsVpcConfiguration]]("awsvpcConfiguration").map(avias.ecs.models.NetworkConfiguration.apply _)
  }
}