package org.lyranthe.araethura.emr
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val PutAutoScalingPolicyOutputEncoder: io.circe.Encoder[models.PutAutoScalingPolicyOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson)
  }
  final implicit val SupportedProductConfigEncoder: io.circe.Encoder[models.SupportedProductConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Args" -> o.args.asJson)
  }
  final implicit val InstanceTypeSpecificationEncoder: io.circe.Encoder[models.InstanceTypeSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("BidPrice" -> o.bidPrice.asJson, "InstanceType" -> o.instanceType.asJson, "EbsBlockDevices" -> o.ebsBlockDevices.asJson, "WeightedCapacity" -> o.weightedCapacity.asJson, "BidPriceAsPercentageOfOnDemandPrice" -> o.bidPriceAsPercentageOfOnDemandPrice.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val StepExecutionStatusDetailEncoder: io.circe.Encoder[models.StepExecutionStatusDetail] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "StartDateTime" -> o.startDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson, "LastStateChangeReason" -> o.lastStateChangeReason.asJson)
  }
  final implicit val ListBootstrapActionsInputEncoder: io.circe.Encoder[models.ListBootstrapActionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val CancelStepsInputEncoder: io.circe.Encoder[models.CancelStepsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "StepIds" -> o.stepIds.asJson)
  }
  final implicit val RemoveTagsInputEncoder: io.circe.Encoder[models.RemoveTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val CreateSecurityConfigurationOutputEncoder: io.circe.Encoder[models.CreateSecurityConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "CreationDateTime" -> o.creationDateTime.asJson)
  }
  final implicit val InstanceResizePolicyEncoder: io.circe.Encoder[models.InstanceResizePolicy] = io.circe.Encoder.instance { o => 
    Json.obj("InstancesToTerminate" -> o.instancesToTerminate.asJson, "InstancesToProtect" -> o.instancesToProtect.asJson, "InstanceTerminationTimeout" -> o.instanceTerminationTimeout.asJson)
  }
  final implicit val BootstrapActionDetailEncoder: io.circe.Encoder[models.BootstrapActionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("BootstrapActionConfig" -> o.bootstrapActionConfig.asJson)
  }
  final implicit val CreateSecurityConfigurationInputEncoder: io.circe.Encoder[models.CreateSecurityConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson)
  }
  final implicit val DeleteSecurityConfigurationOutputEncoder: io.circe.Encoder[models.DeleteSecurityConfigurationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ModifyInstanceGroupsInputEncoder: io.circe.Encoder[models.ModifyInstanceGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroups" -> o.instanceGroups.asJson)
  }
  final implicit val ClusterSummaryEncoder: io.circe.Encoder[models.ClusterSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "Status" -> o.status.asJson, "NormalizedInstanceHours" -> o.normalizedInstanceHours.asJson)
  }
  final implicit val AutoScalingPolicyStateChangeReasonEncoder: io.circe.Encoder[models.AutoScalingPolicyStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ListClustersOutputEncoder: io.circe.Encoder[models.ListClustersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Clusters" -> o.clusters.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val AddInstanceGroupsInputEncoder: io.circe.Encoder[models.AddInstanceGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceGroups" -> o.instanceGroups.asJson, "JobFlowId" -> o.jobFlowId.asJson)
  }
  final implicit val ScalingTriggerEncoder: io.circe.Encoder[models.ScalingTrigger] = io.circe.Encoder.instance { o => 
    Json.obj("CloudWatchAlarmDefinition" -> o.cloudWatchAlarmDefinition.asJson)
  }
  final implicit val InstanceTimelineEncoder: io.circe.Encoder[models.InstanceTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val InstanceGroupStatusEncoder: io.circe.Encoder[models.InstanceGroupStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val StepStateChangeReasonEncoder: io.circe.Encoder[models.StepStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ModifyInstanceFleetInputEncoder: io.circe.Encoder[models.ModifyInstanceFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceFleet" -> o.instanceFleet.asJson)
  }
  final implicit val HadoopJarStepConfigEncoder: io.circe.Encoder[models.HadoopJarStepConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Jar" -> o.jar.asJson, "MainClass" -> o.mainClass.asJson, "Properties" -> o.properties.asJson, "Args" -> o.args.asJson)
  }
  final implicit val RemoveAutoScalingPolicyOutputEncoder: io.circe.Encoder[models.RemoveAutoScalingPolicyOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val Ec2InstanceAttributesEncoder: io.circe.Encoder[models.Ec2InstanceAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("IamInstanceProfile" -> o.iamInstanceProfile.asJson, "EmrManagedMasterSecurityGroup" -> o.emrManagedMasterSecurityGroup.asJson, "ServiceAccessSecurityGroup" -> o.serviceAccessSecurityGroup.asJson, "Ec2KeyName" -> o.ec2KeyName.asJson, "Ec2AvailabilityZone" -> o.ec2AvailabilityZone.asJson, "EmrManagedSlaveSecurityGroup" -> o.emrManagedSlaveSecurityGroup.asJson, "Ec2SubnetId" -> o.ec2SubnetId.asJson, "RequestedEc2SubnetIds" -> o.requestedEc2SubnetIds.asJson, "RequestedEc2AvailabilityZones" -> o.requestedEc2AvailabilityZones.asJson, "AdditionalMasterSecurityGroups" -> o.additionalMasterSecurityGroups.asJson, "AdditionalSlaveSecurityGroups" -> o.additionalSlaveSecurityGroups.asJson)
  }
  final implicit val DescribeJobFlowsOutputEncoder: io.circe.Encoder[models.DescribeJobFlowsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlows" -> o.jobFlows.asJson)
  }
  final implicit val ListInstanceGroupsOutputEncoder: io.circe.Encoder[models.ListInstanceGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceGroups" -> o.instanceGroups.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val RunJobFlowOutputEncoder: io.circe.Encoder[models.RunJobFlowOutput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson)
  }
  final implicit val SpotProvisioningSpecificationEncoder: io.circe.Encoder[models.SpotProvisioningSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("TimeoutDurationMinutes" -> o.timeoutDurationMinutes.asJson, "TimeoutAction" -> o.timeoutAction.asJson, "BlockDurationMinutes" -> o.blockDurationMinutes.asJson)
  }
  final implicit val ScalingConstraintsEncoder: io.circe.Encoder[models.ScalingConstraints] = io.circe.Encoder.instance { o => 
    Json.obj("MinCapacity" -> o.minCapacity.asJson, "MaxCapacity" -> o.maxCapacity.asJson)
  }
  final implicit val InstanceFleetTimelineEncoder: io.circe.Encoder[models.InstanceFleetTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val AddInstanceGroupsOutputEncoder: io.circe.Encoder[models.AddInstanceGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson, "InstanceGroupIds" -> o.instanceGroupIds.asJson)
  }
  final implicit val ClusterEncoder: io.circe.Encoder[models.Cluster] = io.circe.Encoder.instance { o => 
    Json.obj("RepoUpgradeOnBoot" -> o.repoUpgradeOnBoot.asJson, "CustomAmiId" -> o.customAmiId.asJson, "Ec2InstanceAttributes" -> o.ec2InstanceAttributes.asJson, "RunningAmiVersion" -> o.runningAmiVersion.asJson, "RequestedAmiVersion" -> o.requestedAmiVersion.asJson, "LogUri" -> o.logUri.asJson, "ServiceRole" -> o.serviceRole.asJson, "ReleaseLabel" -> o.releaseLabel.asJson, "MasterPublicDnsName" -> o.masterPublicDnsName.asJson, "Name" -> o.name.asJson, "ScaleDownBehavior" -> o.scaleDownBehavior.asJson, "Applications" -> o.applications.asJson, "Tags" -> o.tags.asJson, "Status" -> o.status.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson, "AutoScalingRole" -> o.autoScalingRole.asJson, "Id" -> o.id.asJson, "NormalizedInstanceHours" -> o.normalizedInstanceHours.asJson, "EbsRootVolumeSize" -> o.ebsRootVolumeSize.asJson, "AutoTerminate" -> o.autoTerminate.asJson, "TerminationProtected" -> o.terminationProtected.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson, "Configurations" -> o.configurations.asJson, "InstanceCollectionType" -> o.instanceCollectionType.asJson)
  }
  final implicit val InstanceGroupTimelineEncoder: io.circe.Encoder[models.InstanceGroupTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val AutoScalingPolicyEncoder: io.circe.Encoder[models.AutoScalingPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("Constraints" -> o.constraints.asJson, "Rules" -> o.rules.asJson)
  }
  final implicit val InstanceFleetProvisioningSpecificationsEncoder: io.circe.Encoder[models.InstanceFleetProvisioningSpecifications] = io.circe.Encoder.instance { o => 
    Json.obj("SpotSpecification" -> o.spotSpecification.asJson)
  }
  final implicit val JobFlowInstancesDetailEncoder: io.circe.Encoder[models.JobFlowInstancesDetail] = io.circe.Encoder.instance { o => 
    Json.obj("MasterInstanceType" -> o.masterInstanceType.asJson, "SlaveInstanceType" -> o.slaveInstanceType.asJson, "InstanceCount" -> o.instanceCount.asJson, "Ec2KeyName" -> o.ec2KeyName.asJson, "Ec2SubnetId" -> o.ec2SubnetId.asJson, "HadoopVersion" -> o.hadoopVersion.asJson, "InstanceGroups" -> o.instanceGroups.asJson, "Placement" -> o.placement.asJson, "MasterPublicDnsName" -> o.masterPublicDnsName.asJson, "MasterInstanceId" -> o.masterInstanceId.asJson, "NormalizedInstanceHours" -> o.normalizedInstanceHours.asJson, "KeepJobFlowAliveWhenNoSteps" -> o.keepJobFlowAliveWhenNoSteps.asJson, "TerminationProtected" -> o.terminationProtected.asJson)
  }
  final implicit val ShrinkPolicyEncoder: io.circe.Encoder[models.ShrinkPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("DecommissionTimeout" -> o.decommissionTimeout.asJson, "InstanceResizePolicy" -> o.instanceResizePolicy.asJson)
  }
  final implicit val InstanceFleetEncoder: io.circe.Encoder[models.InstanceFleet] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleetType" -> o.instanceFleetType.asJson, "Name" -> o.name.asJson, "LaunchSpecifications" -> o.launchSpecifications.asJson, "InstanceTypeSpecifications" -> o.instanceTypeSpecifications.asJson, "Id" -> o.id.asJson, "TargetOnDemandCapacity" -> o.targetOnDemandCapacity.asJson, "TargetSpotCapacity" -> o.targetSpotCapacity.asJson, "ProvisionedOnDemandCapacity" -> o.provisionedOnDemandCapacity.asJson, "ProvisionedSpotCapacity" -> o.provisionedSpotCapacity.asJson, "Status" -> o.status.asJson)
  }
  final implicit val InstanceGroupStateChangeReasonEncoder: io.circe.Encoder[models.InstanceGroupStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AddTagsOutputEncoder: io.circe.Encoder[models.AddTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StepTimelineEncoder: io.circe.Encoder[models.StepTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "StartDateTime" -> o.startDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val ListSecurityConfigurationsOutputEncoder: io.circe.Encoder[models.ListSecurityConfigurationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("SecurityConfigurations" -> o.securityConfigurations.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InstanceFleetConfigEncoder: io.circe.Encoder[models.InstanceFleetConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleetType" -> o.instanceFleetType.asJson, "InstanceTypeConfigs" -> o.instanceTypeConfigs.asJson, "Name" -> o.name.asJson, "LaunchSpecifications" -> o.launchSpecifications.asJson, "TargetOnDemandCapacity" -> o.targetOnDemandCapacity.asJson, "TargetSpotCapacity" -> o.targetSpotCapacity.asJson)
  }
  final implicit val AddJobFlowStepsOutputEncoder: io.circe.Encoder[models.AddJobFlowStepsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StepIds" -> o.stepIds.asJson)
  }
  final implicit val InstanceGroupEncoder: io.circe.Encoder[models.InstanceGroup] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "InstanceType" -> o.instanceType.asJson, "Name" -> o.name.asJson, "BidPrice" -> o.bidPrice.asJson, "InstanceGroupType" -> o.instanceGroupType.asJson, "ShrinkPolicy" -> o.shrinkPolicy.asJson, "Market" -> o.market.asJson, "Id" -> o.id.asJson, "EbsBlockDevices" -> o.ebsBlockDevices.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson, "EbsOptimized" -> o.ebsOptimized.asJson, "RequestedInstanceCount" -> o.requestedInstanceCount.asJson, "RunningInstanceCount" -> o.runningInstanceCount.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val ListInstancesInputEncoder: io.circe.Encoder[models.ListInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupTypes" -> o.instanceGroupTypes.asJson, "InstanceFleetType" -> o.instanceFleetType.asJson, "InstanceFleetId" -> o.instanceFleetId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "InstanceStates" -> o.instanceStates.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ScalingActionEncoder: io.circe.Encoder[models.ScalingAction] = io.circe.Encoder.instance { o => 
    Json.obj("SimpleScalingPolicyConfiguration" -> o.simpleScalingPolicyConfiguration.asJson, "Market" -> o.market.asJson)
  }
  final implicit val AddInstanceFleetOutputEncoder: io.circe.Encoder[models.AddInstanceFleetOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceFleetId" -> o.instanceFleetId.asJson)
  }
  final implicit val InstanceFleetModifyConfigEncoder: io.circe.Encoder[models.InstanceFleetModifyConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleetId" -> o.instanceFleetId.asJson, "TargetOnDemandCapacity" -> o.targetOnDemandCapacity.asJson, "TargetSpotCapacity" -> o.targetSpotCapacity.asJson)
  }
  final implicit val InstanceGroupConfigEncoder: io.circe.Encoder[models.InstanceGroupConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceRole" -> o.instanceRole.asJson, "InstanceType" -> o.instanceType.asJson, "InstanceCount" -> o.instanceCount.asJson, "Name" -> o.name.asJson, "BidPrice" -> o.bidPrice.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson, "Market" -> o.market.asJson, "EbsConfiguration" -> o.ebsConfiguration.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val CancelStepsInfoEncoder: io.circe.Encoder[models.CancelStepsInfo] = io.circe.Encoder.instance { o => 
    Json.obj("StepId" -> o.stepId.asJson, "Status" -> o.status.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val ClusterStateChangeReasonEncoder: io.circe.Encoder[models.ClusterStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ConfigurationEncoder: io.circe.Encoder[models.Configuration] = io.circe.Encoder.instance { o => 
    Json.obj("Classification" -> o.classification.asJson, "Configurations" -> o.configurations.asJson, "Properties" -> o.properties.asJson)
  }
  final implicit val DescribeStepOutputEncoder: io.circe.Encoder[models.DescribeStepOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Step" -> o.step.asJson)
  }
  final implicit val BootstrapActionConfigEncoder: io.circe.Encoder[models.BootstrapActionConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ScriptBootstrapAction" -> o.scriptBootstrapAction.asJson)
  }
  final implicit val EbsBlockDeviceEncoder: io.circe.Encoder[models.EbsBlockDevice] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeSpecification" -> o.volumeSpecification.asJson, "Device" -> o.device.asJson)
  }
  final implicit val ListInstanceFleetsOutputEncoder: io.circe.Encoder[models.ListInstanceFleetsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceFleets" -> o.instanceFleets.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val AutoScalingPolicyStatusEncoder: io.circe.Encoder[models.AutoScalingPolicyStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson)
  }
  final implicit val TerminateJobFlowsInputEncoder: io.circe.Encoder[models.TerminateJobFlowsInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowIds" -> o.jobFlowIds.asJson)
  }
  final implicit val MetricDimensionEncoder: io.circe.Encoder[models.MetricDimension] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val EbsVolumeEncoder: io.circe.Encoder[models.EbsVolume] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson, "VolumeId" -> o.volumeId.asJson)
  }
  final implicit val AddTagsInputEncoder: io.circe.Encoder[models.AddTagsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val PlacementTypeEncoder: io.circe.Encoder[models.PlacementType] = io.circe.Encoder.instance { o => 
    Json.obj("AvailabilityZone" -> o.availabilityZone.asJson, "AvailabilityZones" -> o.availabilityZones.asJson)
  }
  final implicit val ListStepsInputEncoder: io.circe.Encoder[models.ListStepsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "StepStates" -> o.stepStates.asJson, "StepIds" -> o.stepIds.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val StepSummaryEncoder: io.circe.Encoder[models.StepSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "ActionOnFailure" -> o.actionOnFailure.asJson, "Status" -> o.status.asJson, "Config" -> o.config.asJson)
  }
  final implicit val InstanceStateChangeReasonEncoder: io.circe.Encoder[models.InstanceStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AutoScalingPolicyDescriptionEncoder: io.circe.Encoder[models.AutoScalingPolicyDescription] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson, "Constraints" -> o.constraints.asJson, "Rules" -> o.rules.asJson)
  }
  final implicit val VolumeSpecificationEncoder: io.circe.Encoder[models.VolumeSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeType" -> o.volumeType.asJson, "SizeInGB" -> o.sizeInGB.asJson, "Iops" -> o.iops.asJson)
  }
  final implicit val ClusterStatusEncoder: io.circe.Encoder[models.ClusterStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val DescribeClusterOutputEncoder: io.circe.Encoder[models.DescribeClusterOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Cluster" -> o.cluster.asJson)
  }
  final implicit val JobFlowDetailEncoder: io.circe.Encoder[models.JobFlowDetail] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson, "Name" -> o.name.asJson, "Instances" -> o.instances.asJson, "ExecutionStatusDetail" -> o.executionStatusDetail.asJson, "AmiVersion" -> o.amiVersion.asJson, "ScaleDownBehavior" -> o.scaleDownBehavior.asJson, "BootstrapActions" -> o.bootstrapActions.asJson, "LogUri" -> o.logUri.asJson, "JobFlowRole" -> o.jobFlowRole.asJson, "ServiceRole" -> o.serviceRole.asJson, "AutoScalingRole" -> o.autoScalingRole.asJson, "SupportedProducts" -> o.supportedProducts.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson, "Steps" -> o.steps.asJson)
  }
  final implicit val DescribeStepInputEncoder: io.circe.Encoder[models.DescribeStepInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "StepId" -> o.stepId.asJson)
  }
  final implicit val DescribeClusterInputEncoder: io.circe.Encoder[models.DescribeClusterInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson)
  }
  final implicit val ListStepsOutputEncoder: io.circe.Encoder[models.ListStepsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Steps" -> o.steps.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val JobFlowExecutionStatusDetailEncoder: io.circe.Encoder[models.JobFlowExecutionStatusDetail] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "StartDateTime" -> o.startDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson, "LastStateChangeReason" -> o.lastStateChangeReason.asJson)
  }
  final implicit val RemoveTagsOutputEncoder: io.circe.Encoder[models.RemoveTagsOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceFleetStateChangeReasonEncoder: io.circe.Encoder[models.InstanceFleetStateChangeReason] = io.circe.Encoder.instance { o => 
    Json.obj("Code" -> o.code.asJson, "Message" -> o.message.asJson)
  }
  final implicit val AddJobFlowStepsInputEncoder: io.circe.Encoder[models.AddJobFlowStepsInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowId" -> o.jobFlowId.asJson, "Steps" -> o.steps.asJson)
  }
  final implicit val ListInstanceFleetsInputEncoder: io.circe.Encoder[models.ListInstanceFleetsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val StepEncoder: io.circe.Encoder[models.Step] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "ActionOnFailure" -> o.actionOnFailure.asJson, "Status" -> o.status.asJson, "Config" -> o.config.asJson)
  }
  final implicit val InstanceGroupDetailEncoder: io.circe.Encoder[models.InstanceGroupDetail] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceRole" -> o.instanceRole.asJson, "InstanceType" -> o.instanceType.asJson, "Market" -> o.market.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "State" -> o.state.asJson, "InstanceRequestCount" -> o.instanceRequestCount.asJson, "InstanceRunningCount" -> o.instanceRunningCount.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "Name" -> o.name.asJson, "BidPrice" -> o.bidPrice.asJson, "LastStateChangeReason" -> o.lastStateChangeReason.asJson, "StartDateTime" -> o.startDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val InstanceStatusEncoder: io.circe.Encoder[models.InstanceStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val ListInstancesOutputEncoder: io.circe.Encoder[models.ListInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Instances" -> o.instances.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val SecurityConfigurationSummaryEncoder: io.circe.Encoder[models.SecurityConfigurationSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "CreationDateTime" -> o.creationDateTime.asJson)
  }
  final implicit val DescribeJobFlowsInputEncoder: io.circe.Encoder[models.DescribeJobFlowsInput] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAfter" -> o.createdAfter.asJson, "CreatedBefore" -> o.createdBefore.asJson, "JobFlowIds" -> o.jobFlowIds.asJson, "JobFlowStates" -> o.jobFlowStates.asJson)
  }
  final implicit val CancelStepsOutputEncoder: io.circe.Encoder[models.CancelStepsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CancelStepsInfoList" -> o.cancelStepsInfoList.asJson)
  }
  final implicit val DescribeSecurityConfigurationInputEncoder: io.circe.Encoder[models.DescribeSecurityConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val DescribeSecurityConfigurationOutputEncoder: io.circe.Encoder[models.DescribeSecurityConfigurationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson, "CreationDateTime" -> o.creationDateTime.asJson)
  }
  final implicit val EbsBlockDeviceConfigEncoder: io.circe.Encoder[models.EbsBlockDeviceConfig] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeSpecification" -> o.volumeSpecification.asJson, "VolumesPerInstance" -> o.volumesPerInstance.asJson)
  }
  final implicit val InstanceGroupModifyConfigEncoder: io.circe.Encoder[models.InstanceGroupModifyConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceGroupId" -> o.instanceGroupId.asJson, "InstanceCount" -> o.instanceCount.asJson, "EC2InstanceIdsToTerminate" -> o.ec2InstanceIdsToTerminate.asJson, "ShrinkPolicy" -> o.shrinkPolicy.asJson)
  }
  final implicit val ListInstanceGroupsInputEncoder: io.circe.Encoder[models.ListInstanceGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val SetVisibleToAllUsersInputEncoder: io.circe.Encoder[models.SetVisibleToAllUsersInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowIds" -> o.jobFlowIds.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson)
  }
  final implicit val InstanceFleetStatusEncoder: io.circe.Encoder[models.InstanceFleetStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val ScalingRuleEncoder: io.circe.Encoder[models.ScalingRule] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Action" -> o.action.asJson, "Trigger" -> o.trigger.asJson, "Description" -> o.description.asJson)
  }
  final implicit val StepStatusEncoder: io.circe.Encoder[models.StepStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "FailureDetails" -> o.failureDetails.asJson, "Timeline" -> o.timeline.asJson)
  }
  final implicit val InstanceTypeConfigEncoder: io.circe.Encoder[models.InstanceTypeConfig] = io.circe.Encoder.instance { o => 
    Json.obj("InstanceType" -> o.instanceType.asJson, "BidPrice" -> o.bidPrice.asJson, "WeightedCapacity" -> o.weightedCapacity.asJson, "BidPriceAsPercentageOfOnDemandPrice" -> o.bidPriceAsPercentageOfOnDemandPrice.asJson, "EbsConfiguration" -> o.ebsConfiguration.asJson, "Configurations" -> o.configurations.asJson)
  }
  final implicit val KeyValueEncoder: io.circe.Encoder[models.KeyValue] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ApplicationEncoder: io.circe.Encoder[models.Application] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Version" -> o.version.asJson, "Args" -> o.args.asJson, "AdditionalInfo" -> o.additionalInfo.asJson)
  }
  final implicit val DeleteSecurityConfigurationInputEncoder: io.circe.Encoder[models.DeleteSecurityConfigurationInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val HadoopStepConfigEncoder: io.circe.Encoder[models.HadoopStepConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Jar" -> o.jar.asJson, "MainClass" -> o.mainClass.asJson, "Properties" -> o.properties.asJson, "Args" -> o.args.asJson)
  }
  final implicit val RunJobFlowInputEncoder: io.circe.Encoder[models.RunJobFlowInput] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Instances" -> o.instances.asJson, "RepoUpgradeOnBoot" -> o.repoUpgradeOnBoot.asJson, "AmiVersion" -> o.amiVersion.asJson, "ReleaseLabel" -> o.releaseLabel.asJson, "CustomAmiId" -> o.customAmiId.asJson, "ScaleDownBehavior" -> o.scaleDownBehavior.asJson, "Applications" -> o.applications.asJson, "BootstrapActions" -> o.bootstrapActions.asJson, "Tags" -> o.tags.asJson, "LogUri" -> o.logUri.asJson, "JobFlowRole" -> o.jobFlowRole.asJson, "AutoScalingRole" -> o.autoScalingRole.asJson, "SecurityConfiguration" -> o.securityConfiguration.asJson, "AdditionalInfo" -> o.additionalInfo.asJson, "ServiceRole" -> o.serviceRole.asJson, "EbsRootVolumeSize" -> o.ebsRootVolumeSize.asJson, "SupportedProducts" -> o.supportedProducts.asJson, "VisibleToAllUsers" -> o.visibleToAllUsers.asJson, "Configurations" -> o.configurations.asJson, "Steps" -> o.steps.asJson, "NewSupportedProducts" -> o.newSupportedProducts.asJson)
  }
  final implicit val StepConfigEncoder: io.circe.Encoder[models.StepConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "HadoopJarStep" -> o.hadoopJarStep.asJson, "ActionOnFailure" -> o.actionOnFailure.asJson)
  }
  final implicit val SetTerminationProtectionInputEncoder: io.circe.Encoder[models.SetTerminationProtectionInput] = io.circe.Encoder.instance { o => 
    Json.obj("JobFlowIds" -> o.jobFlowIds.asJson, "TerminationProtected" -> o.terminationProtected.asJson)
  }
  final implicit val EbsConfigurationEncoder: io.circe.Encoder[models.EbsConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("EbsBlockDeviceConfigs" -> o.ebsBlockDeviceConfigs.asJson, "EbsOptimized" -> o.ebsOptimized.asJson)
  }
  final implicit val CommandEncoder: io.circe.Encoder[models.Command] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ScriptPath" -> o.scriptPath.asJson, "Args" -> o.args.asJson)
  }
  final implicit val ListSecurityConfigurationsInputEncoder: io.circe.Encoder[models.ListSecurityConfigurationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[models.InternalServerError.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SimpleScalingPolicyConfigurationEncoder: io.circe.Encoder[models.SimpleScalingPolicyConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("ScalingAdjustment" -> o.scalingAdjustment.asJson, "CoolDown" -> o.coolDown.asJson, "AdjustmentType" -> o.adjustmentType.asJson)
  }
  final implicit val ScriptBootstrapActionConfigEncoder: io.circe.Encoder[models.ScriptBootstrapActionConfig] = io.circe.Encoder.instance { o => 
    Json.obj("Path" -> o.path.asJson, "Args" -> o.args.asJson)
  }
  final implicit val InternalServerExceptionEncoder: io.circe.Encoder[models.InternalServerException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PutAutoScalingPolicyInputEncoder: io.circe.Encoder[models.PutAutoScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "AutoScalingPolicy" -> o.autoScalingPolicy.asJson)
  }
  final implicit val FailureDetailsEncoder: io.circe.Encoder[models.FailureDetails] = io.circe.Encoder.instance { o => 
    Json.obj("Reason" -> o.reason.asJson, "Message" -> o.message.asJson, "LogFile" -> o.logFile.asJson)
  }
  final implicit val AddInstanceFleetInputEncoder: io.circe.Encoder[models.AddInstanceFleetInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceFleet" -> o.instanceFleet.asJson)
  }
  final implicit val ListClustersInputEncoder: io.circe.Encoder[models.ListClustersInput] = io.circe.Encoder.instance { o => 
    Json.obj("CreatedAfter" -> o.createdAfter.asJson, "CreatedBefore" -> o.createdBefore.asJson, "ClusterStates" -> o.clusterStates.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val StepDetailEncoder: io.circe.Encoder[models.StepDetail] = io.circe.Encoder.instance { o => 
    Json.obj("StepConfig" -> o.stepConfig.asJson, "ExecutionStatusDetail" -> o.executionStatusDetail.asJson)
  }
  final implicit val ClusterTimelineEncoder: io.circe.Encoder[models.ClusterTimeline] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDateTime" -> o.creationDateTime.asJson, "ReadyDateTime" -> o.readyDateTime.asJson, "EndDateTime" -> o.endDateTime.asJson)
  }
  final implicit val RemoveAutoScalingPolicyInputEncoder: io.circe.Encoder[models.RemoveAutoScalingPolicyInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClusterId" -> o.clusterId.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson)
  }
  final implicit val ListBootstrapActionsOutputEncoder: io.circe.Encoder[models.ListBootstrapActionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("BootstrapActions" -> o.bootstrapActions.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("ErrorCode" -> o.errorCode.asJson, "Message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val InstanceEncoder: io.circe.Encoder[models.Instance] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Ec2InstanceId" -> o.ec2InstanceId.asJson, "InstanceType" -> o.instanceType.asJson, "PrivateDnsName" -> o.privateDnsName.asJson, "PublicDnsName" -> o.publicDnsName.asJson, "InstanceGroupId" -> o.instanceGroupId.asJson, "PublicIpAddress" -> o.publicIpAddress.asJson, "PrivateIpAddress" -> o.privateIpAddress.asJson, "EbsVolumes" -> o.ebsVolumes.asJson, "Market" -> o.market.asJson, "InstanceFleetId" -> o.instanceFleetId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val CloudWatchAlarmDefinitionEncoder: io.circe.Encoder[models.CloudWatchAlarmDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("MetricName" -> o.metricName.asJson, "Threshold" -> o.threshold.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "Period" -> o.period.asJson, "Namespace" -> o.namespace.asJson, "Statistic" -> o.statistic.asJson, "Dimensions" -> o.dimensions.asJson, "EvaluationPeriods" -> o.evaluationPeriods.asJson, "Unit" -> o.unit.asJson)
  }
  final implicit val JobFlowInstancesConfigEncoder: io.circe.Encoder[models.JobFlowInstancesConfig] = io.circe.Encoder.instance { o => 
    Json.obj("EmrManagedMasterSecurityGroup" -> o.emrManagedMasterSecurityGroup.asJson, "Ec2SubnetId" -> o.ec2SubnetId.asJson, "Ec2KeyName" -> o.ec2KeyName.asJson, "ServiceAccessSecurityGroup" -> o.serviceAccessSecurityGroup.asJson, "HadoopVersion" -> o.hadoopVersion.asJson, "EmrManagedSlaveSecurityGroup" -> o.emrManagedSlaveSecurityGroup.asJson, "InstanceFleets" -> o.instanceFleets.asJson, "MasterInstanceType" -> o.masterInstanceType.asJson, "SlaveInstanceType" -> o.slaveInstanceType.asJson, "Placement" -> o.placement.asJson, "AdditionalMasterSecurityGroups" -> o.additionalMasterSecurityGroups.asJson, "AdditionalSlaveSecurityGroups" -> o.additionalSlaveSecurityGroups.asJson, "InstanceCount" -> o.instanceCount.asJson, "Ec2SubnetIds" -> o.ec2SubnetIds.asJson, "KeepJobFlowAliveWhenNoSteps" -> o.keepJobFlowAliveWhenNoSteps.asJson, "TerminationProtected" -> o.terminationProtected.asJson, "InstanceGroups" -> o.instanceGroups.asJson)
  }
  final implicit val PutAutoScalingPolicyOutputDecoder: io.circe.Decoder[models.PutAutoScalingPolicyOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[models.AutoScalingPolicyDescription]]("AutoScalingPolicy")).mapN(models.PutAutoScalingPolicyOutput.apply _)
  }
  final implicit val SupportedProductConfigDecoder: io.circe.Decoder[models.SupportedProductConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(models.SupportedProductConfig.apply _)
  }
  final implicit val InstanceTypeSpecificationDecoder: io.circe.Decoder[models.InstanceTypeSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[scala.List[models.EbsBlockDevice]]]("EbsBlockDevices"), o.get[scala.Option[scala.Int]]("WeightedCapacity"), o.get[scala.Option[scala.Double]]("BidPriceAsPercentageOfOnDemandPrice"), o.get[scala.Option[scala.Boolean]]("EbsOptimized"), o.get[scala.Option[scala.List[models.Configuration]]]("Configurations")).mapN(models.InstanceTypeSpecification.apply _)
  }
  final implicit val StepExecutionStatusDetailDecoder: io.circe.Decoder[models.StepExecutionStatusDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("State"), o.get[java.time.Instant]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("LastStateChangeReason")).mapN(models.StepExecutionStatusDetail.apply _)
  }
  final implicit val ListBootstrapActionsInputDecoder: io.circe.Decoder[models.ListBootstrapActionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListBootstrapActionsInput.apply _)
  }
  final implicit val CancelStepsInputDecoder: io.circe.Decoder[models.CancelStepsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[scala.List[java.lang.String]]]("StepIds")).mapN(models.CancelStepsInput.apply _)
  }
  final implicit val RemoveTagsInputDecoder: io.circe.Decoder[models.RemoveTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.RemoveTagsInput.apply _)
  }
  final implicit val CreateSecurityConfigurationOutputDecoder: io.circe.Decoder[models.CreateSecurityConfigurationOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.time.Instant]("CreationDateTime")).mapN(models.CreateSecurityConfigurationOutput.apply _)
  }
  final implicit val InstanceResizePolicyDecoder: io.circe.Decoder[models.InstanceResizePolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("InstancesToTerminate"), o.get[scala.Option[scala.List[java.lang.String]]]("InstancesToProtect"), o.get[scala.Option[scala.Int]]("InstanceTerminationTimeout")).mapN(models.InstanceResizePolicy.apply _)
  }
  final implicit val BootstrapActionDetailDecoder: io.circe.Decoder[models.BootstrapActionDetail] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.BootstrapActionConfig]]("BootstrapActionConfig").map(models.BootstrapActionDetail.apply _)
  }
  final implicit val CreateSecurityConfigurationInputDecoder: io.circe.Decoder[models.CreateSecurityConfigurationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("SecurityConfiguration")).mapN(models.CreateSecurityConfigurationInput.apply _)
  }
  final implicit val DeleteSecurityConfigurationOutputDecoder: io.circe.Decoder[models.DeleteSecurityConfigurationOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteSecurityConfigurationOutput)
  final implicit val ModifyInstanceGroupsInputDecoder: io.circe.Decoder[models.ModifyInstanceGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[scala.List[models.InstanceGroupModifyConfig]]]("InstanceGroups")).mapN(models.ModifyInstanceGroupsInput.apply _)
  }
  final implicit val ClusterSummaryDecoder: io.circe.Decoder[models.ClusterSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[models.ClusterStatus]]("Status"), o.get[scala.Option[scala.Int]]("NormalizedInstanceHours")).mapN(models.ClusterSummary.apply _)
  }
  final implicit val AutoScalingPolicyStateChangeReasonDecoder: io.circe.Decoder[models.AutoScalingPolicyStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.AutoScalingPolicyStateChangeReason.apply _)
  }
  final implicit val ListClustersOutputDecoder: io.circe.Decoder[models.ListClustersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ClusterSummary]]]("Clusters"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListClustersOutput.apply _)
  }
  final implicit val AddInstanceGroupsInputDecoder: io.circe.Decoder[models.AddInstanceGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.InstanceGroupConfig]]("InstanceGroups"), o.get[java.lang.String]("JobFlowId")).mapN(models.AddInstanceGroupsInput.apply _)
  }
  final implicit val ScalingTriggerDecoder: io.circe.Decoder[models.ScalingTrigger] = io.circe.Decoder.instance { o => 
    o.get[models.CloudWatchAlarmDefinition]("CloudWatchAlarmDefinition").map(models.ScalingTrigger.apply _)
  }
  final implicit val InstanceTimelineDecoder: io.circe.Decoder[models.InstanceTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(models.InstanceTimeline.apply _)
  }
  final implicit val InstanceGroupStatusDecoder: io.circe.Decoder[models.InstanceGroupStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.InstanceGroupStateChangeReason]]("StateChangeReason"), o.get[scala.Option[models.InstanceGroupTimeline]]("Timeline")).mapN(models.InstanceGroupStatus.apply _)
  }
  final implicit val StepStateChangeReasonDecoder: io.circe.Decoder[models.StepStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.StepStateChangeReason.apply _)
  }
  final implicit val ModifyInstanceFleetInputDecoder: io.circe.Decoder[models.ModifyInstanceFleetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[models.InstanceFleetModifyConfig]("InstanceFleet")).mapN(models.ModifyInstanceFleetInput.apply _)
  }
  final implicit val HadoopJarStepConfigDecoder: io.circe.Decoder[models.HadoopJarStepConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Jar"), o.get[scala.Option[java.lang.String]]("MainClass"), o.get[scala.Option[scala.List[models.KeyValue]]]("Properties"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(models.HadoopJarStepConfig.apply _)
  }
  final implicit val RemoveAutoScalingPolicyOutputDecoder: io.circe.Decoder[models.RemoveAutoScalingPolicyOutput.type] = io.circe.Decoder.decodeUnit.as(models.RemoveAutoScalingPolicyOutput)
  final implicit val Ec2InstanceAttributesDecoder: io.circe.Decoder[models.Ec2InstanceAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IamInstanceProfile"), o.get[scala.Option[java.lang.String]]("EmrManagedMasterSecurityGroup"), o.get[scala.Option[java.lang.String]]("ServiceAccessSecurityGroup"), o.get[scala.Option[java.lang.String]]("Ec2KeyName"), o.get[scala.Option[java.lang.String]]("Ec2AvailabilityZone"), o.get[scala.Option[java.lang.String]]("EmrManagedSlaveSecurityGroup"), o.get[scala.Option[java.lang.String]]("Ec2SubnetId"), o.get[scala.Option[scala.List[java.lang.String]]]("RequestedEc2SubnetIds"), o.get[scala.Option[scala.List[java.lang.String]]]("RequestedEc2AvailabilityZones"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalMasterSecurityGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalSlaveSecurityGroups")).mapN(models.Ec2InstanceAttributes.apply _)
  }
  final implicit val DescribeJobFlowsOutputDecoder: io.circe.Decoder[models.DescribeJobFlowsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.JobFlowDetail]]]("JobFlows").map(models.DescribeJobFlowsOutput.apply _)
  }
  final implicit val ListInstanceGroupsOutputDecoder: io.circe.Decoder[models.ListInstanceGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.InstanceGroup]]]("InstanceGroups"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListInstanceGroupsOutput.apply _)
  }
  final implicit val RunJobFlowOutputDecoder: io.circe.Decoder[models.RunJobFlowOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("JobFlowId").map(models.RunJobFlowOutput.apply _)
  }
  final implicit val SpotProvisioningSpecificationDecoder: io.circe.Decoder[models.SpotProvisioningSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("TimeoutDurationMinutes"), o.get[java.lang.String]("TimeoutAction"), o.get[scala.Option[scala.Int]]("BlockDurationMinutes")).mapN(models.SpotProvisioningSpecification.apply _)
  }
  final implicit val ScalingConstraintsDecoder: io.circe.Decoder[models.ScalingConstraints] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MinCapacity"), o.get[scala.Int]("MaxCapacity")).mapN(models.ScalingConstraints.apply _)
  }
  final implicit val InstanceFleetTimelineDecoder: io.circe.Decoder[models.InstanceFleetTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(models.InstanceFleetTimeline.apply _)
  }
  final implicit val AddInstanceGroupsOutputDecoder: io.circe.Decoder[models.AddInstanceGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("JobFlowId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceGroupIds")).mapN(models.AddInstanceGroupsOutput.apply _)
  }
  final implicit val ClusterDecoder: io.circe.Decoder[models.Cluster] = io.circe.Decoder.instance { o => 
    for (`repoUpgradeOnBoot` <- o.get[scala.Option[java.lang.String]]("RepoUpgradeOnBoot"); `customAmiId` <- o.get[scala.Option[java.lang.String]]("CustomAmiId"); `ec2InstanceAttributes` <- o.get[scala.Option[models.Ec2InstanceAttributes]]("Ec2InstanceAttributes"); `runningAmiVersion` <- o.get[scala.Option[java.lang.String]]("RunningAmiVersion"); `requestedAmiVersion` <- o.get[scala.Option[java.lang.String]]("RequestedAmiVersion"); `logUri` <- o.get[scala.Option[java.lang.String]]("LogUri"); `serviceRole` <- o.get[scala.Option[java.lang.String]]("ServiceRole"); `releaseLabel` <- o.get[scala.Option[java.lang.String]]("ReleaseLabel"); `masterPublicDnsName` <- o.get[scala.Option[java.lang.String]]("MasterPublicDnsName"); `name` <- o.get[scala.Option[java.lang.String]]("Name"); `scaleDownBehavior` <- o.get[scala.Option[java.lang.String]]("ScaleDownBehavior"); `applications` <- o.get[scala.Option[scala.List[models.Application]]]("Applications"); `tags` <- o.get[scala.Option[scala.List[models.Tag]]]("Tags"); `status` <- o.get[scala.Option[models.ClusterStatus]]("Status"); `securityConfiguration` <- o.get[scala.Option[java.lang.String]]("SecurityConfiguration"); `autoScalingRole` <- o.get[scala.Option[java.lang.String]]("AutoScalingRole"); `id` <- o.get[scala.Option[java.lang.String]]("Id"); `normalizedInstanceHours` <- o.get[scala.Option[scala.Int]]("NormalizedInstanceHours"); `ebsRootVolumeSize` <- o.get[scala.Option[scala.Int]]("EbsRootVolumeSize"); `autoTerminate` <- o.get[scala.Option[scala.Boolean]]("AutoTerminate"); `terminationProtected` <- o.get[scala.Option[scala.Boolean]]("TerminationProtected"); `visibleToAllUsers` <- o.get[scala.Option[scala.Boolean]]("VisibleToAllUsers"); `configurations` <- o.get[scala.Option[scala.List[models.Configuration]]]("Configurations"); `instanceCollectionType` <- o.get[scala.Option[java.lang.String]]("InstanceCollectionType")) yield models.Cluster(repoUpgradeOnBoot, customAmiId, ec2InstanceAttributes, runningAmiVersion, requestedAmiVersion, logUri, serviceRole, releaseLabel, masterPublicDnsName, name, scaleDownBehavior, applications, tags, status, securityConfiguration, autoScalingRole, id, normalizedInstanceHours, ebsRootVolumeSize, autoTerminate, terminationProtected, visibleToAllUsers, configurations, instanceCollectionType)
  }
  final implicit val InstanceGroupTimelineDecoder: io.circe.Decoder[models.InstanceGroupTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(models.InstanceGroupTimeline.apply _)
  }
  final implicit val AutoScalingPolicyDecoder: io.circe.Decoder[models.AutoScalingPolicy] = io.circe.Decoder.instance { o => 
    (o.get[models.ScalingConstraints]("Constraints"), o.get[scala.List[models.ScalingRule]]("Rules")).mapN(models.AutoScalingPolicy.apply _)
  }
  final implicit val InstanceFleetProvisioningSpecificationsDecoder: io.circe.Decoder[models.InstanceFleetProvisioningSpecifications] = io.circe.Decoder.instance { o => 
    o.get[models.SpotProvisioningSpecification]("SpotSpecification").map(models.InstanceFleetProvisioningSpecifications.apply _)
  }
  final implicit val JobFlowInstancesDetailDecoder: io.circe.Decoder[models.JobFlowInstancesDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MasterInstanceType"), o.get[java.lang.String]("SlaveInstanceType"), o.get[scala.Int]("InstanceCount"), o.get[scala.Option[java.lang.String]]("Ec2KeyName"), o.get[scala.Option[java.lang.String]]("Ec2SubnetId"), o.get[scala.Option[java.lang.String]]("HadoopVersion"), o.get[scala.Option[scala.List[models.InstanceGroupDetail]]]("InstanceGroups"), o.get[scala.Option[models.PlacementType]]("Placement"), o.get[scala.Option[java.lang.String]]("MasterPublicDnsName"), o.get[scala.Option[java.lang.String]]("MasterInstanceId"), o.get[scala.Option[scala.Int]]("NormalizedInstanceHours"), o.get[scala.Option[scala.Boolean]]("KeepJobFlowAliveWhenNoSteps"), o.get[scala.Option[scala.Boolean]]("TerminationProtected")).mapN(models.JobFlowInstancesDetail.apply _)
  }
  final implicit val ShrinkPolicyDecoder: io.circe.Decoder[models.ShrinkPolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("DecommissionTimeout"), o.get[scala.Option[models.InstanceResizePolicy]]("InstanceResizePolicy")).mapN(models.ShrinkPolicy.apply _)
  }
  final implicit val InstanceFleetDecoder: io.circe.Decoder[models.InstanceFleet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("InstanceFleetType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[models.InstanceFleetProvisioningSpecifications]]("LaunchSpecifications"), o.get[scala.Option[scala.List[models.InstanceTypeSpecification]]]("InstanceTypeSpecifications"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.Int]]("TargetOnDemandCapacity"), o.get[scala.Option[scala.Int]]("TargetSpotCapacity"), o.get[scala.Option[scala.Int]]("ProvisionedOnDemandCapacity"), o.get[scala.Option[scala.Int]]("ProvisionedSpotCapacity"), o.get[scala.Option[models.InstanceFleetStatus]]("Status")).mapN(models.InstanceFleet.apply _)
  }
  final implicit val InstanceGroupStateChangeReasonDecoder: io.circe.Decoder[models.InstanceGroupStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.InstanceGroupStateChangeReason.apply _)
  }
  final implicit val AddTagsOutputDecoder: io.circe.Decoder[models.AddTagsOutput.type] = io.circe.Decoder.decodeUnit.as(models.AddTagsOutput)
  final implicit val StepTimelineDecoder: io.circe.Decoder[models.StepTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(models.StepTimeline.apply _)
  }
  final implicit val ListSecurityConfigurationsOutputDecoder: io.circe.Decoder[models.ListSecurityConfigurationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.SecurityConfigurationSummary]]]("SecurityConfigurations"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListSecurityConfigurationsOutput.apply _)
  }
  final implicit val InstanceFleetConfigDecoder: io.circe.Decoder[models.InstanceFleetConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceFleetType"), o.get[scala.Option[scala.List[models.InstanceTypeConfig]]]("InstanceTypeConfigs"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[models.InstanceFleetProvisioningSpecifications]]("LaunchSpecifications"), o.get[scala.Option[scala.Int]]("TargetOnDemandCapacity"), o.get[scala.Option[scala.Int]]("TargetSpotCapacity")).mapN(models.InstanceFleetConfig.apply _)
  }
  final implicit val AddJobFlowStepsOutputDecoder: io.circe.Decoder[models.AddJobFlowStepsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("StepIds").map(models.AddJobFlowStepsOutput.apply _)
  }
  final implicit val InstanceGroupDecoder: io.circe.Decoder[models.InstanceGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.InstanceGroupStatus]]("Status"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[java.lang.String]]("InstanceGroupType"), o.get[scala.Option[models.ShrinkPolicy]]("ShrinkPolicy"), o.get[scala.Option[java.lang.String]]("Market"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.List[models.EbsBlockDevice]]]("EbsBlockDevices"), o.get[scala.Option[models.AutoScalingPolicyDescription]]("AutoScalingPolicy"), o.get[scala.Option[scala.Boolean]]("EbsOptimized"), o.get[scala.Option[scala.Int]]("RequestedInstanceCount"), o.get[scala.Option[scala.Int]]("RunningInstanceCount"), o.get[scala.Option[scala.List[models.Configuration]]]("Configurations")).mapN(models.InstanceGroup.apply _)
  }
  final implicit val ListInstancesInputDecoder: io.circe.Decoder[models.ListInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceGroupTypes"), o.get[scala.Option[java.lang.String]]("InstanceFleetType"), o.get[scala.Option[java.lang.String]]("InstanceFleetId"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[scala.List[java.lang.String]]]("InstanceStates"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListInstancesInput.apply _)
  }
  final implicit val ScalingActionDecoder: io.circe.Decoder[models.ScalingAction] = io.circe.Decoder.instance { o => 
    (o.get[models.SimpleScalingPolicyConfiguration]("SimpleScalingPolicyConfiguration"), o.get[scala.Option[java.lang.String]]("Market")).mapN(models.ScalingAction.apply _)
  }
  final implicit val AddInstanceFleetOutputDecoder: io.circe.Decoder[models.AddInstanceFleetOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClusterId"), o.get[scala.Option[java.lang.String]]("InstanceFleetId")).mapN(models.AddInstanceFleetOutput.apply _)
  }
  final implicit val InstanceFleetModifyConfigDecoder: io.circe.Decoder[models.InstanceFleetModifyConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceFleetId"), o.get[scala.Option[scala.Int]]("TargetOnDemandCapacity"), o.get[scala.Option[scala.Int]]("TargetSpotCapacity")).mapN(models.InstanceFleetModifyConfig.apply _)
  }
  final implicit val InstanceGroupConfigDecoder: io.circe.Decoder[models.InstanceGroupConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceRole"), o.get[java.lang.String]("InstanceType"), o.get[scala.Int]("InstanceCount"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[models.AutoScalingPolicy]]("AutoScalingPolicy"), o.get[scala.Option[java.lang.String]]("Market"), o.get[scala.Option[models.EbsConfiguration]]("EbsConfiguration"), o.get[scala.Option[scala.List[models.Configuration]]]("Configurations")).mapN(models.InstanceGroupConfig.apply _)
  }
  final implicit val CancelStepsInfoDecoder: io.circe.Decoder[models.CancelStepsInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StepId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.CancelStepsInfo.apply _)
  }
  final implicit val ClusterStateChangeReasonDecoder: io.circe.Decoder[models.ClusterStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.ClusterStateChangeReason.apply _)
  }
  final implicit val ConfigurationDecoder: io.circe.Decoder[models.Configuration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Classification"), o.get[scala.Option[scala.List[models.Configuration]]]("Configurations"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Properties")).mapN(models.Configuration.apply _)
  }
  final implicit val DescribeStepOutputDecoder: io.circe.Decoder[models.DescribeStepOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Step]]("Step").map(models.DescribeStepOutput.apply _)
  }
  final implicit val BootstrapActionConfigDecoder: io.circe.Decoder[models.BootstrapActionConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[models.ScriptBootstrapActionConfig]("ScriptBootstrapAction")).mapN(models.BootstrapActionConfig.apply _)
  }
  final implicit val EbsBlockDeviceDecoder: io.circe.Decoder[models.EbsBlockDevice] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.VolumeSpecification]]("VolumeSpecification"), o.get[scala.Option[java.lang.String]]("Device")).mapN(models.EbsBlockDevice.apply _)
  }
  final implicit val ListInstanceFleetsOutputDecoder: io.circe.Decoder[models.ListInstanceFleetsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.InstanceFleet]]]("InstanceFleets"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListInstanceFleetsOutput.apply _)
  }
  final implicit val AutoScalingPolicyStatusDecoder: io.circe.Decoder[models.AutoScalingPolicyStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.AutoScalingPolicyStateChangeReason]]("StateChangeReason")).mapN(models.AutoScalingPolicyStatus.apply _)
  }
  final implicit val TerminateJobFlowsInputDecoder: io.circe.Decoder[models.TerminateJobFlowsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("JobFlowIds").map(models.TerminateJobFlowsInput.apply _)
  }
  final implicit val MetricDimensionDecoder: io.circe.Decoder[models.MetricDimension] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.MetricDimension.apply _)
  }
  final implicit val EbsVolumeDecoder: io.circe.Decoder[models.EbsVolume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Device"), o.get[scala.Option[java.lang.String]]("VolumeId")).mapN(models.EbsVolume.apply _)
  }
  final implicit val AddTagsInputDecoder: io.circe.Decoder[models.AddTagsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.AddTagsInput.apply _)
  }
  final implicit val PlacementTypeDecoder: io.circe.Decoder[models.PlacementType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[scala.List[java.lang.String]]]("AvailabilityZones")).mapN(models.PlacementType.apply _)
  }
  final implicit val ListStepsInputDecoder: io.circe.Decoder[models.ListStepsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[scala.List[java.lang.String]]]("StepStates"), o.get[scala.Option[scala.List[java.lang.String]]]("StepIds"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListStepsInput.apply _)
  }
  final implicit val StepSummaryDecoder: io.circe.Decoder[models.StepSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ActionOnFailure"), o.get[scala.Option[models.StepStatus]]("Status"), o.get[scala.Option[models.HadoopStepConfig]]("Config")).mapN(models.StepSummary.apply _)
  }
  final implicit val InstanceStateChangeReasonDecoder: io.circe.Decoder[models.InstanceStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.InstanceStateChangeReason.apply _)
  }
  final implicit val AutoScalingPolicyDescriptionDecoder: io.circe.Decoder[models.AutoScalingPolicyDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.AutoScalingPolicyStatus]]("Status"), o.get[scala.Option[models.ScalingConstraints]]("Constraints"), o.get[scala.Option[scala.List[models.ScalingRule]]]("Rules")).mapN(models.AutoScalingPolicyDescription.apply _)
  }
  final implicit val VolumeSpecificationDecoder: io.circe.Decoder[models.VolumeSpecification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeType"), o.get[scala.Int]("SizeInGB"), o.get[scala.Option[scala.Int]]("Iops")).mapN(models.VolumeSpecification.apply _)
  }
  final implicit val ClusterStatusDecoder: io.circe.Decoder[models.ClusterStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.ClusterStateChangeReason]]("StateChangeReason"), o.get[scala.Option[models.ClusterTimeline]]("Timeline")).mapN(models.ClusterStatus.apply _)
  }
  final implicit val DescribeClusterOutputDecoder: io.circe.Decoder[models.DescribeClusterOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Cluster]]("Cluster").map(models.DescribeClusterOutput.apply _)
  }
  final implicit val JobFlowDetailDecoder: io.circe.Decoder[models.JobFlowDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("JobFlowId"), o.get[java.lang.String]("Name"), o.get[models.JobFlowInstancesDetail]("Instances"), o.get[models.JobFlowExecutionStatusDetail]("ExecutionStatusDetail"), o.get[scala.Option[java.lang.String]]("AmiVersion"), o.get[scala.Option[java.lang.String]]("ScaleDownBehavior"), o.get[scala.Option[scala.List[models.BootstrapActionDetail]]]("BootstrapActions"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[java.lang.String]]("JobFlowRole"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[java.lang.String]]("AutoScalingRole"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedProducts"), o.get[scala.Option[scala.Boolean]]("VisibleToAllUsers"), o.get[scala.Option[scala.List[models.StepDetail]]]("Steps")).mapN(models.JobFlowDetail.apply _)
  }
  final implicit val DescribeStepInputDecoder: io.circe.Decoder[models.DescribeStepInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[java.lang.String]("StepId")).mapN(models.DescribeStepInput.apply _)
  }
  final implicit val DescribeClusterInputDecoder: io.circe.Decoder[models.DescribeClusterInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ClusterId").map(models.DescribeClusterInput.apply _)
  }
  final implicit val ListStepsOutputDecoder: io.circe.Decoder[models.ListStepsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.StepSummary]]]("Steps"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListStepsOutput.apply _)
  }
  final implicit val JobFlowExecutionStatusDetailDecoder: io.circe.Decoder[models.JobFlowExecutionStatusDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("State"), o.get[java.time.Instant]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime"), o.get[scala.Option[java.lang.String]]("LastStateChangeReason")).mapN(models.JobFlowExecutionStatusDetail.apply _)
  }
  final implicit val RemoveTagsOutputDecoder: io.circe.Decoder[models.RemoveTagsOutput.type] = io.circe.Decoder.decodeUnit.as(models.RemoveTagsOutput)
  final implicit val InstanceFleetStateChangeReasonDecoder: io.circe.Decoder[models.InstanceFleetStateChangeReason] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Code"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.InstanceFleetStateChangeReason.apply _)
  }
  final implicit val AddJobFlowStepsInputDecoder: io.circe.Decoder[models.AddJobFlowStepsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("JobFlowId"), o.get[scala.List[models.StepConfig]]("Steps")).mapN(models.AddJobFlowStepsInput.apply _)
  }
  final implicit val ListInstanceFleetsInputDecoder: io.circe.Decoder[models.ListInstanceFleetsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListInstanceFleetsInput.apply _)
  }
  final implicit val StepDecoder: io.circe.Decoder[models.Step] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ActionOnFailure"), o.get[scala.Option[models.StepStatus]]("Status"), o.get[scala.Option[models.HadoopStepConfig]]("Config")).mapN(models.Step.apply _)
  }
  final implicit val InstanceGroupDetailDecoder: io.circe.Decoder[models.InstanceGroupDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceRole"), o.get[java.lang.String]("InstanceType"), o.get[java.lang.String]("Market"), o.get[java.time.Instant]("CreationDateTime"), o.get[java.lang.String]("State"), o.get[scala.Int]("InstanceRequestCount"), o.get[scala.Int]("InstanceRunningCount"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[java.lang.String]]("LastStateChangeReason"), o.get[scala.Option[java.time.Instant]]("StartDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(models.InstanceGroupDetail.apply _)
  }
  final implicit val InstanceStatusDecoder: io.circe.Decoder[models.InstanceStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.InstanceStateChangeReason]]("StateChangeReason"), o.get[scala.Option[models.InstanceTimeline]]("Timeline")).mapN(models.InstanceStatus.apply _)
  }
  final implicit val ListInstancesOutputDecoder: io.circe.Decoder[models.ListInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Instance]]]("Instances"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListInstancesOutput.apply _)
  }
  final implicit val SecurityConfigurationSummaryDecoder: io.circe.Decoder[models.SecurityConfigurationSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("CreationDateTime")).mapN(models.SecurityConfigurationSummary.apply _)
  }
  final implicit val DescribeJobFlowsInputDecoder: io.circe.Decoder[models.DescribeJobFlowsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAfter"), o.get[scala.Option[java.time.Instant]]("CreatedBefore"), o.get[scala.Option[scala.List[java.lang.String]]]("JobFlowIds"), o.get[scala.Option[scala.List[java.lang.String]]]("JobFlowStates")).mapN(models.DescribeJobFlowsInput.apply _)
  }
  final implicit val CancelStepsOutputDecoder: io.circe.Decoder[models.CancelStepsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.CancelStepsInfo]]]("CancelStepsInfoList").map(models.CancelStepsOutput.apply _)
  }
  final implicit val DescribeSecurityConfigurationInputDecoder: io.circe.Decoder[models.DescribeSecurityConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(models.DescribeSecurityConfigurationInput.apply _)
  }
  final implicit val DescribeSecurityConfigurationOutputDecoder: io.circe.Decoder[models.DescribeSecurityConfigurationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SecurityConfiguration"), o.get[scala.Option[java.time.Instant]]("CreationDateTime")).mapN(models.DescribeSecurityConfigurationOutput.apply _)
  }
  final implicit val EbsBlockDeviceConfigDecoder: io.circe.Decoder[models.EbsBlockDeviceConfig] = io.circe.Decoder.instance { o => 
    (o.get[models.VolumeSpecification]("VolumeSpecification"), o.get[scala.Option[scala.Int]]("VolumesPerInstance")).mapN(models.EbsBlockDeviceConfig.apply _)
  }
  final implicit val InstanceGroupModifyConfigDecoder: io.circe.Decoder[models.InstanceGroupModifyConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceGroupId"), o.get[scala.Option[scala.Int]]("InstanceCount"), o.get[scala.Option[scala.List[java.lang.String]]]("EC2InstanceIdsToTerminate"), o.get[scala.Option[models.ShrinkPolicy]]("ShrinkPolicy")).mapN(models.InstanceGroupModifyConfig.apply _)
  }
  final implicit val ListInstanceGroupsInputDecoder: io.circe.Decoder[models.ListInstanceGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListInstanceGroupsInput.apply _)
  }
  final implicit val SetVisibleToAllUsersInputDecoder: io.circe.Decoder[models.SetVisibleToAllUsersInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("JobFlowIds"), o.get[scala.Boolean]("VisibleToAllUsers")).mapN(models.SetVisibleToAllUsersInput.apply _)
  }
  final implicit val InstanceFleetStatusDecoder: io.circe.Decoder[models.InstanceFleetStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.InstanceFleetStateChangeReason]]("StateChangeReason"), o.get[scala.Option[models.InstanceFleetTimeline]]("Timeline")).mapN(models.InstanceFleetStatus.apply _)
  }
  final implicit val ScalingRuleDecoder: io.circe.Decoder[models.ScalingRule] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[models.ScalingAction]("Action"), o.get[models.ScalingTrigger]("Trigger"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.ScalingRule.apply _)
  }
  final implicit val StepStatusDecoder: io.circe.Decoder[models.StepStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[models.StepStateChangeReason]]("StateChangeReason"), o.get[scala.Option[models.FailureDetails]]("FailureDetails"), o.get[scala.Option[models.StepTimeline]]("Timeline")).mapN(models.StepStatus.apply _)
  }
  final implicit val InstanceTypeConfigDecoder: io.circe.Decoder[models.InstanceTypeConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("InstanceType"), o.get[scala.Option[java.lang.String]]("BidPrice"), o.get[scala.Option[scala.Int]]("WeightedCapacity"), o.get[scala.Option[scala.Double]]("BidPriceAsPercentageOfOnDemandPrice"), o.get[scala.Option[models.EbsConfiguration]]("EbsConfiguration"), o.get[scala.Option[scala.List[models.Configuration]]]("Configurations")).mapN(models.InstanceTypeConfig.apply _)
  }
  final implicit val KeyValueDecoder: io.circe.Decoder[models.KeyValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.KeyValue.apply _)
  }
  final implicit val ApplicationDecoder: io.circe.Decoder[models.Application] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[scala.List[java.lang.String]]]("Args"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AdditionalInfo")).mapN(models.Application.apply _)
  }
  final implicit val DeleteSecurityConfigurationInputDecoder: io.circe.Decoder[models.DeleteSecurityConfigurationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(models.DeleteSecurityConfigurationInput.apply _)
  }
  final implicit val HadoopStepConfigDecoder: io.circe.Decoder[models.HadoopStepConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Jar"), o.get[scala.Option[java.lang.String]]("MainClass"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Properties"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(models.HadoopStepConfig.apply _)
  }
  final implicit val RunJobFlowInputDecoder: io.circe.Decoder[models.RunJobFlowInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[models.JobFlowInstancesConfig]("Instances"), o.get[scala.Option[java.lang.String]]("RepoUpgradeOnBoot"), o.get[scala.Option[java.lang.String]]("AmiVersion"), o.get[scala.Option[java.lang.String]]("ReleaseLabel"), o.get[scala.Option[java.lang.String]]("CustomAmiId"), o.get[scala.Option[java.lang.String]]("ScaleDownBehavior"), o.get[scala.Option[scala.List[models.Application]]]("Applications"), o.get[scala.Option[scala.List[models.BootstrapActionConfig]]]("BootstrapActions"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("LogUri"), o.get[scala.Option[java.lang.String]]("JobFlowRole"), o.get[scala.Option[java.lang.String]]("AutoScalingRole"), o.get[scala.Option[java.lang.String]]("SecurityConfiguration"), o.get[scala.Option[java.lang.String]]("AdditionalInfo"), o.get[scala.Option[java.lang.String]]("ServiceRole"), o.get[scala.Option[scala.Int]]("EbsRootVolumeSize"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedProducts"), o.get[scala.Option[scala.Boolean]]("VisibleToAllUsers"), o.get[scala.Option[scala.List[models.Configuration]]]("Configurations"), o.get[scala.Option[scala.List[models.StepConfig]]]("Steps"), o.get[scala.Option[scala.List[models.SupportedProductConfig]]]("NewSupportedProducts")).mapN(models.RunJobFlowInput.apply _)
  }
  final implicit val StepConfigDecoder: io.circe.Decoder[models.StepConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[models.HadoopJarStepConfig]("HadoopJarStep"), o.get[scala.Option[java.lang.String]]("ActionOnFailure")).mapN(models.StepConfig.apply _)
  }
  final implicit val SetTerminationProtectionInputDecoder: io.circe.Decoder[models.SetTerminationProtectionInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("JobFlowIds"), o.get[scala.Boolean]("TerminationProtected")).mapN(models.SetTerminationProtectionInput.apply _)
  }
  final implicit val EbsConfigurationDecoder: io.circe.Decoder[models.EbsConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.EbsBlockDeviceConfig]]]("EbsBlockDeviceConfigs"), o.get[scala.Option[scala.Boolean]]("EbsOptimized")).mapN(models.EbsConfiguration.apply _)
  }
  final implicit val CommandDecoder: io.circe.Decoder[models.Command] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ScriptPath"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(models.Command.apply _)
  }
  final implicit val ListSecurityConfigurationsInputDecoder: io.circe.Decoder[models.ListSecurityConfigurationsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Marker").map(models.ListSecurityConfigurationsInput.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[models.InternalServerError.type] = io.circe.Decoder.decodeUnit.as(models.InternalServerError)
  final implicit val SimpleScalingPolicyConfigurationDecoder: io.circe.Decoder[models.SimpleScalingPolicyConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("ScalingAdjustment"), o.get[scala.Option[scala.Int]]("CoolDown"), o.get[scala.Option[java.lang.String]]("AdjustmentType")).mapN(models.SimpleScalingPolicyConfiguration.apply _)
  }
  final implicit val ScriptBootstrapActionConfigDecoder: io.circe.Decoder[models.ScriptBootstrapActionConfig] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Path"), o.get[scala.Option[scala.List[java.lang.String]]]("Args")).mapN(models.ScriptBootstrapActionConfig.apply _)
  }
  final implicit val InternalServerExceptionDecoder: io.circe.Decoder[models.InternalServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InternalServerException.apply _)
  }
  final implicit val PutAutoScalingPolicyInputDecoder: io.circe.Decoder[models.PutAutoScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[java.lang.String]("InstanceGroupId"), o.get[models.AutoScalingPolicy]("AutoScalingPolicy")).mapN(models.PutAutoScalingPolicyInput.apply _)
  }
  final implicit val FailureDetailsDecoder: io.circe.Decoder[models.FailureDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Reason"), o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("LogFile")).mapN(models.FailureDetails.apply _)
  }
  final implicit val AddInstanceFleetInputDecoder: io.circe.Decoder[models.AddInstanceFleetInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[models.InstanceFleetConfig]("InstanceFleet")).mapN(models.AddInstanceFleetInput.apply _)
  }
  final implicit val ListClustersInputDecoder: io.circe.Decoder[models.ListClustersInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreatedAfter"), o.get[scala.Option[java.time.Instant]]("CreatedBefore"), o.get[scala.Option[scala.List[java.lang.String]]]("ClusterStates"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListClustersInput.apply _)
  }
  final implicit val StepDetailDecoder: io.circe.Decoder[models.StepDetail] = io.circe.Decoder.instance { o => 
    (o.get[models.StepConfig]("StepConfig"), o.get[models.StepExecutionStatusDetail]("ExecutionStatusDetail")).mapN(models.StepDetail.apply _)
  }
  final implicit val ClusterTimelineDecoder: io.circe.Decoder[models.ClusterTimeline] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[java.time.Instant]]("ReadyDateTime"), o.get[scala.Option[java.time.Instant]]("EndDateTime")).mapN(models.ClusterTimeline.apply _)
  }
  final implicit val RemoveAutoScalingPolicyInputDecoder: io.circe.Decoder[models.RemoveAutoScalingPolicyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClusterId"), o.get[java.lang.String]("InstanceGroupId")).mapN(models.RemoveAutoScalingPolicyInput.apply _)
  }
  final implicit val ListBootstrapActionsOutputDecoder: io.circe.Decoder[models.ListBootstrapActionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Command]]]("BootstrapActions"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListBootstrapActionsOutput.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.InvalidRequestException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val InstanceDecoder: io.circe.Decoder[models.Instance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Ec2InstanceId"), o.get[scala.Option[java.lang.String]]("InstanceType"), o.get[scala.Option[java.lang.String]]("PrivateDnsName"), o.get[scala.Option[java.lang.String]]("PublicDnsName"), o.get[scala.Option[java.lang.String]]("InstanceGroupId"), o.get[scala.Option[java.lang.String]]("PublicIpAddress"), o.get[scala.Option[java.lang.String]]("PrivateIpAddress"), o.get[scala.Option[scala.List[models.EbsVolume]]]("EbsVolumes"), o.get[scala.Option[java.lang.String]]("Market"), o.get[scala.Option[java.lang.String]]("InstanceFleetId"), o.get[scala.Option[models.InstanceStatus]]("Status")).mapN(models.Instance.apply _)
  }
  final implicit val CloudWatchAlarmDefinitionDecoder: io.circe.Decoder[models.CloudWatchAlarmDefinition] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("MetricName"), o.get[scala.Double]("Threshold"), o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Int]("Period"), o.get[scala.Option[java.lang.String]]("Namespace"), o.get[scala.Option[java.lang.String]]("Statistic"), o.get[scala.Option[scala.List[models.MetricDimension]]]("Dimensions"), o.get[scala.Option[scala.Int]]("EvaluationPeriods"), o.get[scala.Option[java.lang.String]]("Unit")).mapN(models.CloudWatchAlarmDefinition.apply _)
  }
  final implicit val JobFlowInstancesConfigDecoder: io.circe.Decoder[models.JobFlowInstancesConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EmrManagedMasterSecurityGroup"), o.get[scala.Option[java.lang.String]]("Ec2SubnetId"), o.get[scala.Option[java.lang.String]]("Ec2KeyName"), o.get[scala.Option[java.lang.String]]("ServiceAccessSecurityGroup"), o.get[scala.Option[java.lang.String]]("HadoopVersion"), o.get[scala.Option[java.lang.String]]("EmrManagedSlaveSecurityGroup"), o.get[scala.Option[scala.List[models.InstanceFleetConfig]]]("InstanceFleets"), o.get[scala.Option[java.lang.String]]("MasterInstanceType"), o.get[scala.Option[java.lang.String]]("SlaveInstanceType"), o.get[scala.Option[models.PlacementType]]("Placement"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalMasterSecurityGroups"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalSlaveSecurityGroups"), o.get[scala.Option[scala.Int]]("InstanceCount"), o.get[scala.Option[scala.List[java.lang.String]]]("Ec2SubnetIds"), o.get[scala.Option[scala.Boolean]]("KeepJobFlowAliveWhenNoSteps"), o.get[scala.Option[scala.Boolean]]("TerminationProtected"), o.get[scala.Option[scala.List[models.InstanceGroupConfig]]]("InstanceGroups")).mapN(models.JobFlowInstancesConfig.apply _)
  }
}