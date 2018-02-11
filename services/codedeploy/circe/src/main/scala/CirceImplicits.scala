package org.lyranthe.araethura.codedeploy
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val InvalidInstanceNameExceptionEncoder: io.circe.Encoder[models.InvalidInstanceNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDeploymentGroupOutputEncoder: io.circe.Encoder[models.DeleteDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("hooksNotCleanedUp" -> o.hooksNotCleanedUp.asJson)
  }
  final implicit val AutoScalingGroupEncoder: io.circe.Encoder[models.AutoScalingGroup] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "hook" -> o.hook.asJson)
  }
  final implicit val ListDeploymentsOutputEncoder: io.circe.Encoder[models.ListDeploymentsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deployments" -> o.deployments.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RevisionInfoEncoder: io.circe.Encoder[models.RevisionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("revisionLocation" -> o.revisionLocation.asJson, "genericRevisionInfo" -> o.genericRevisionInfo.asJson)
  }
  final implicit val DeploymentDoesNotExistExceptionEncoder: io.circe.Encoder[models.DeploymentDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListOnPremisesInstancesInputEncoder: io.circe.Encoder[models.ListOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("registrationStatus" -> o.registrationStatus.asJson, "tagFilters" -> o.tagFilters.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateApplicationInputEncoder: io.circe.Encoder[models.CreateApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson)
  }
  final implicit val InvalidTimeRangeExceptionEncoder: io.circe.Encoder[models.InvalidTimeRangeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceInfoEncoder: io.circe.Encoder[models.InstanceInfo] = io.circe.Encoder.instance { o => 
    Json.obj("iamSessionArn" -> o.iamSessionArn.asJson, "registerTime" -> o.registerTime.asJson, "deregisterTime" -> o.deregisterTime.asJson, "instanceArn" -> o.instanceArn.asJson, "instanceName" -> o.instanceName.asJson, "tags" -> o.tags.asJson, "iamUserArn" -> o.iamUserArn.asJson)
  }
  final implicit val InvalidTargetInstancesExceptionEncoder: io.circe.Encoder[models.InvalidTargetInstancesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BucketNameFilterRequiredExceptionEncoder: io.circe.Encoder[models.BucketNameFilterRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetApplicationRevisionsOutputEncoder: io.circe.Encoder[models.BatchGetApplicationRevisionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "errorMessage" -> o.errorMessage.asJson, "revisions" -> o.revisions.asJson)
  }
  final implicit val CreateDeploymentConfigOutputEncoder: io.circe.Encoder[models.CreateDeploymentConfigOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigId" -> o.deploymentConfigId.asJson)
  }
  final implicit val CreateDeploymentGroupInputEncoder: io.circe.Encoder[models.CreateDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "serviceRoleArn" -> o.serviceRoleArn.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "triggerConfigurations" -> o.triggerConfigurations.asJson, "onPremisesTagSet" -> o.onPremisesTagSet.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "ec2TagFilters" -> o.ec2TagFilters.asJson, "alarmConfiguration" -> o.alarmConfiguration.asJson, "onPremisesInstanceTagFilters" -> o.onPremisesInstanceTagFilters.asJson, "ec2TagSet" -> o.ec2TagSet.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "deploymentStyle" -> o.deploymentStyle.asJson)
  }
  final implicit val InvalidTriggerConfigExceptionEncoder: io.circe.Encoder[models.InvalidTriggerConfigException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteApplicationInputEncoder: io.circe.Encoder[models.DeleteApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson)
  }
  final implicit val GetDeploymentInputEncoder: io.circe.Encoder[models.GetDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val OnPremisesTagSetEncoder: io.circe.Encoder[models.OnPremisesTagSet] = io.circe.Encoder.instance { o => 
    Json.obj("onPremisesTagSetList" -> o.onPremisesTagSetList.asJson)
  }
  final implicit val DeploymentNotStartedExceptionEncoder: io.circe.Encoder[models.DeploymentNotStartedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AlarmsLimitExceededExceptionEncoder: io.circe.Encoder[models.AlarmsLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentGroupAlreadyExistsExceptionEncoder: io.circe.Encoder[models.DeploymentGroupAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateApplicationOutputEncoder: io.circe.Encoder[models.CreateApplicationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationId" -> o.applicationId.asJson)
  }
  final implicit val InvalidRevisionExceptionEncoder: io.circe.Encoder[models.InvalidRevisionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceSummaryEncoder: io.circe.Encoder[models.InstanceSummary] = io.circe.Encoder.instance { o => 
    Json.obj("instanceId" -> o.instanceId.asJson, "lifecycleEvents" -> o.lifecycleEvents.asJson, "lastUpdatedAt" -> o.lastUpdatedAt.asJson, "deploymentId" -> o.deploymentId.asJson, "status" -> o.status.asJson, "instanceType" -> o.instanceType.asJson)
  }
  final implicit val StopDeploymentOutputEncoder: io.circe.Encoder[models.StopDeploymentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "statusMessage" -> o.statusMessage.asJson)
  }
  final implicit val GetDeploymentInstanceOutputEncoder: io.circe.Encoder[models.GetDeploymentInstanceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSummary" -> o.instanceSummary.asJson)
  }
  final implicit val ListDeploymentInstancesInputEncoder: io.circe.Encoder[models.ListDeploymentInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "nextToken" -> o.nextToken.asJson, "instanceStatusFilter" -> o.instanceStatusFilter.asJson, "instanceTypeFilter" -> o.instanceTypeFilter.asJson)
  }
  final implicit val GitHubLocationEncoder: io.circe.Encoder[models.GitHubLocation] = io.circe.Encoder.instance { o => 
    Json.obj("repository" -> o.repository.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val ELBInfoEncoder: io.circe.Encoder[models.ELBInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val IamArnRequiredExceptionEncoder: io.circe.Encoder[models.IamArnRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDeploymentInstanceTypeExceptionEncoder: io.circe.Encoder[models.InvalidDeploymentInstanceTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidOperationExceptionEncoder: io.circe.Encoder[models.InvalidOperationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeploymentGroupInputEncoder: io.circe.Encoder[models.GetDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson)
  }
  final implicit val DeploymentOverviewEncoder: io.circe.Encoder[models.DeploymentOverview] = io.circe.Encoder.instance { o => 
    Json.obj("Pending" -> o.pending.asJson, "Skipped" -> o.skipped.asJson, "Succeeded" -> o.succeeded.asJson, "Ready" -> o.ready.asJson, "InProgress" -> o.inProgress.asJson, "Failed" -> o.failed.asJson)
  }
  final implicit val InvalidTagFilterExceptionEncoder: io.circe.Encoder[models.InvalidTagFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BlueGreenDeploymentConfigurationEncoder: io.circe.Encoder[models.BlueGreenDeploymentConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("terminateBlueInstancesOnDeploymentSuccess" -> o.terminateBlueInstancesOnDeploymentSuccess.asJson, "deploymentReadyOption" -> o.deploymentReadyOption.asJson, "greenFleetProvisioningOption" -> o.greenFleetProvisioningOption.asJson)
  }
  final implicit val GetApplicationInputEncoder: io.circe.Encoder[models.GetApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson)
  }
  final implicit val DeploymentAlreadyCompletedExceptionEncoder: io.circe.Encoder[models.DeploymentAlreadyCompletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidLoadBalancerInfoExceptionEncoder: io.circe.Encoder[models.InvalidLoadBalancerInfoException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetDeploymentGroupsOutputEncoder: io.circe.Encoder[models.BatchGetDeploymentGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentGroupsInfo" -> o.deploymentGroupsInfo.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val CreateDeploymentGroupOutputEncoder: io.circe.Encoder[models.CreateDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentGroupId" -> o.deploymentGroupId.asJson)
  }
  final implicit val BlueInstanceTerminationOptionEncoder: io.circe.Encoder[models.BlueInstanceTerminationOption] = io.circe.Encoder.instance { o => 
    Json.obj("action" -> o.action.asJson, "terminationWaitTimeInMinutes" -> o.terminationWaitTimeInMinutes.asJson)
  }
  final implicit val InvalidAutoRollbackConfigExceptionEncoder: io.circe.Encoder[models.InvalidAutoRollbackConfigException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StopDeploymentInputEncoder: io.circe.Encoder[models.StopDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "autoRollbackEnabled" -> o.autoRollbackEnabled.asJson)
  }
  final implicit val DeploymentGroupDoesNotExistExceptionEncoder: io.circe.Encoder[models.DeploymentGroupDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagFilterEncoder: io.circe.Encoder[models.TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val DeleteDeploymentGroupInputEncoder: io.circe.Encoder[models.DeleteDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson)
  }
  final implicit val InvalidRoleExceptionEncoder: io.circe.Encoder[models.InvalidRoleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListDeploymentInstancesOutputEncoder: io.circe.Encoder[models.ListDeploymentInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instancesList" -> o.instancesList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsToOnPremisesInstancesInputEncoder: io.circe.Encoder[models.AddTagsToOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson, "instanceNames" -> o.instanceNames.asJson)
  }
  final implicit val InvalidDeploymentConfigNameExceptionEncoder: io.circe.Encoder[models.InvalidDeploymentConfigNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidMinimumHealthyHostValueExceptionEncoder: io.circe.Encoder[models.InvalidMinimumHealthyHostValueException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RoleRequiredExceptionEncoder: io.circe.Encoder[models.RoleRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTagExceptionEncoder: io.circe.Encoder[models.InvalidTagException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetDeploymentInstancesInputEncoder: io.circe.Encoder[models.BatchGetDeploymentInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "instanceIds" -> o.instanceIds.asJson)
  }
  final implicit val RegisterOnPremisesInstanceInputEncoder: io.circe.Encoder[models.RegisterOnPremisesInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson, "iamSessionArn" -> o.iamSessionArn.asJson, "iamUserArn" -> o.iamUserArn.asJson)
  }
  final implicit val InvalidDeploymentStatusExceptionEncoder: io.circe.Encoder[models.InvalidDeploymentStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeploymentConfigInputEncoder: io.circe.Encoder[models.GetDeploymentConfigInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigName" -> o.deploymentConfigName.asJson)
  }
  final implicit val DeploymentGroupNameRequiredExceptionEncoder: io.circe.Encoder[models.DeploymentGroupNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MultipleIamArnsProvidedExceptionEncoder: io.circe.Encoder[models.MultipleIamArnsProvidedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagSetListLimitExceededExceptionEncoder: io.circe.Encoder[models.TagSetListLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AlarmEncoder: io.circe.Encoder[models.Alarm] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val ListGitHubAccountTokenNamesInputEncoder: io.circe.Encoder[models.ListGitHubAccountTokenNamesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val TargetInstancesEncoder: io.circe.Encoder[models.TargetInstances] = io.circe.Encoder.instance { o => 
    Json.obj("tagFilters" -> o.tagFilters.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "ec2TagSet" -> o.ec2TagSet.asJson)
  }
  final implicit val GenericRevisionInfoEncoder: io.circe.Encoder[models.GenericRevisionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("description" -> o.description.asJson, "deploymentGroups" -> o.deploymentGroups.asJson, "firstUsedTime" -> o.firstUsedTime.asJson, "lastUsedTime" -> o.lastUsedTime.asJson, "registerTime" -> o.registerTime.asJson)
  }
  final implicit val BatchGetDeploymentGroupsInputEncoder: io.circe.Encoder[models.BatchGetDeploymentGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroupNames" -> o.deploymentGroupNames.asJson)
  }
  final implicit val InvalidAutoScalingGroupExceptionEncoder: io.circe.Encoder[models.InvalidAutoScalingGroupException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigLimitExceededExceptionEncoder: io.circe.Encoder[models.DeploymentConfigLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDeploymentGroupOutputEncoder: io.circe.Encoder[models.UpdateDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("hooksNotCleanedUp" -> o.hooksNotCleanedUp.asJson)
  }
  final implicit val InvalidDeployedStateFilterExceptionEncoder: io.circe.Encoder[models.InvalidDeployedStateFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigInfoEncoder: io.circe.Encoder[models.DeploymentConfigInfo] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigId" -> o.deploymentConfigId.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "minimumHealthyHosts" -> o.minimumHealthyHosts.asJson, "createTime" -> o.createTime.asJson)
  }
  final implicit val IamSessionArnAlreadyRegisteredExceptionEncoder: io.circe.Encoder[models.IamSessionArnAlreadyRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigInUseExceptionEncoder: io.circe.Encoder[models.DeploymentConfigInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val IamUserArnRequiredExceptionEncoder: io.circe.Encoder[models.IamUserArnRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchLimitExceededExceptionEncoder: io.circe.Encoder[models.BatchLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSortOrderExceptionEncoder: io.circe.Encoder[models.InvalidSortOrderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagLimitExceededExceptionEncoder: io.circe.Encoder[models.TagLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDeploymentGroupInputEncoder: io.circe.Encoder[models.UpdateDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "currentDeploymentGroupName" -> o.currentDeploymentGroupName.asJson, "triggerConfigurations" -> o.triggerConfigurations.asJson, "onPremisesTagSet" -> o.onPremisesTagSet.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "ec2TagFilters" -> o.ec2TagFilters.asJson, "alarmConfiguration" -> o.alarmConfiguration.asJson, "onPremisesInstanceTagFilters" -> o.onPremisesInstanceTagFilters.asJson, "serviceRoleArn" -> o.serviceRoleArn.asJson, "ec2TagSet" -> o.ec2TagSet.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "newDeploymentGroupName" -> o.newDeploymentGroupName.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "deploymentStyle" -> o.deploymentStyle.asJson)
  }
  final implicit val DiagnosticsEncoder: io.circe.Encoder[models.Diagnostics] = io.circe.Encoder.instance { o => 
    Json.obj("errorCode" -> o.errorCode.asJson, "scriptName" -> o.scriptName.asJson, "message" -> o.message.asJson, "logTail" -> o.logTail.asJson)
  }
  final implicit val IamUserArnAlreadyRegisteredExceptionEncoder: io.circe.Encoder[models.IamUserArnAlreadyRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RevisionDoesNotExistExceptionEncoder: io.circe.Encoder[models.RevisionDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EC2TagFilterEncoder: io.circe.Encoder[models.EC2TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val InstanceDoesNotExistExceptionEncoder: io.circe.Encoder[models.InstanceDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetApplicationOutputEncoder: io.circe.Encoder[models.GetApplicationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("application" -> o.application.asJson)
  }
  final implicit val InvalidSortByExceptionEncoder: io.circe.Encoder[models.InvalidSortByException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagRequiredExceptionEncoder: io.circe.Encoder[models.TagRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TriggerTargetsLimitExceededExceptionEncoder: io.circe.Encoder[models.TriggerTargetsLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidInstanceStatusExceptionEncoder: io.circe.Encoder[models.InvalidInstanceStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RevisionRequiredExceptionEncoder: io.circe.Encoder[models.RevisionRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListDeploymentConfigsOutputEncoder: io.circe.Encoder[models.ListDeploymentConfigsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigsList" -> o.deploymentConfigsList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListDeploymentsInputEncoder: io.circe.Encoder[models.ListDeploymentsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "includeOnlyStatuses" -> o.includeOnlyStatuses.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "createTimeRange" -> o.createTimeRange.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetDeploymentGroupOutputEncoder: io.circe.Encoder[models.GetDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentGroupInfo" -> o.deploymentGroupInfo.asJson)
  }
  final implicit val ApplicationLimitExceededExceptionEncoder: io.circe.Encoder[models.ApplicationLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListOnPremisesInstancesOutputEncoder: io.circe.Encoder[models.ListOnPremisesInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceNames" -> o.instanceNames.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListApplicationRevisionsInputEncoder: io.circe.Encoder[models.ListApplicationRevisionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deployed" -> o.deployed.asJson, "s3KeyPrefix" -> o.s3KeyPrefix.asJson, "sortOrder" -> o.sortOrder.asJson, "sortBy" -> o.sortBy.asJson, "s3Bucket" -> o.s3Bucket.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BatchGetApplicationsInputEncoder: io.circe.Encoder[models.BatchGetApplicationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationNames" -> o.applicationNames.asJson)
  }
  final implicit val BatchGetApplicationRevisionsInputEncoder: io.circe.Encoder[models.BatchGetApplicationRevisionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revisions" -> o.revisions.asJson)
  }
  final implicit val InstanceNameRequiredExceptionEncoder: io.circe.Encoder[models.InstanceNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigAlreadyExistsExceptionEncoder: io.circe.Encoder[models.DeploymentConfigAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceLimitExceededExceptionEncoder: io.circe.Encoder[models.InstanceLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RollbackInfoEncoder: io.circe.Encoder[models.RollbackInfo] = io.circe.Encoder.instance { o => 
    Json.obj("rollbackDeploymentId" -> o.rollbackDeploymentId.asJson, "rollbackTriggeringDeploymentId" -> o.rollbackTriggeringDeploymentId.asJson, "rollbackMessage" -> o.rollbackMessage.asJson)
  }
  final implicit val DeploymentLimitExceededExceptionEncoder: io.circe.Encoder[models.DeploymentLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentInfoEncoder: io.circe.Encoder[models.DeploymentInfo] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "createTime" -> o.createTime.asJson, "startTime" -> o.startTime.asJson, "completeTime" -> o.completeTime.asJson, "deploymentId" -> o.deploymentId.asJson, "deploymentOverview" -> o.deploymentOverview.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "applicationName" -> o.applicationName.asJson, "additionalDeploymentStatusInfo" -> o.additionalDeploymentStatusInfo.asJson, "targetInstances" -> o.targetInstances.asJson, "fileExistsBehavior" -> o.fileExistsBehavior.asJson, "rollbackInfo" -> o.rollbackInfo.asJson, "description" -> o.description.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "errorInformation" -> o.errorInformation.asJson, "ignoreApplicationStopFailures" -> o.ignoreApplicationStopFailures.asJson, "updateOutdatedInstancesOnly" -> o.updateOutdatedInstancesOnly.asJson, "instanceTerminationWaitTimeStarted" -> o.instanceTerminationWaitTimeStarted.asJson, "creator" -> o.creator.asJson, "deploymentStyle" -> o.deploymentStyle.asJson, "previousRevision" -> o.previousRevision.asJson, "revision" -> o.revision.asJson)
  }
  final implicit val GetOnPremisesInstanceOutputEncoder: io.circe.Encoder[models.GetOnPremisesInstanceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceInfo" -> o.instanceInfo.asJson)
  }
  final implicit val ListApplicationRevisionsOutputEncoder: io.circe.Encoder[models.ListApplicationRevisionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("revisions" -> o.revisions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListDeploymentConfigsInputEncoder: io.circe.Encoder[models.ListDeploymentConfigsInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val TargetGroupInfoEncoder: io.circe.Encoder[models.TargetGroupInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val UnsupportedActionForDeploymentTypeExceptionEncoder: io.circe.Encoder[models.UnsupportedActionForDeploymentTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidFileExistsBehaviorExceptionEncoder: io.circe.Encoder[models.InvalidFileExistsBehaviorException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SkipWaitTimeForInstanceTerminationInputEncoder: io.circe.Encoder[models.SkipWaitTimeForInstanceTerminationInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val GetDeploymentInstanceInputEncoder: io.circe.Encoder[models.GetDeploymentInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "instanceId" -> o.instanceId.asJson)
  }
  final implicit val S3LocationEncoder: io.circe.Encoder[models.S3Location] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "bundleType" -> o.bundleType.asJson, "version" -> o.version.asJson, "eTag" -> o.eTag.asJson, "bucket" -> o.bucket.asJson)
  }
  final implicit val InvalidBucketNameFilterExceptionEncoder: io.circe.Encoder[models.InvalidBucketNameFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigNameRequiredExceptionEncoder: io.circe.Encoder[models.DeploymentConfigNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AlarmConfigurationEncoder: io.circe.Encoder[models.AlarmConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "ignorePollAlarmFailure" -> o.ignorePollAlarmFailure.asJson, "alarms" -> o.alarms.asJson)
  }
  final implicit val DeploymentIsNotInReadyStateExceptionEncoder: io.circe.Encoder[models.DeploymentIsNotInReadyStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidEC2TagExceptionEncoder: io.circe.Encoder[models.InvalidEC2TagException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceValidationExceptionEncoder: io.circe.Encoder[models.ResourceValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidOnPremisesTagCombinationExceptionEncoder: io.circe.Encoder[models.InvalidOnPremisesTagCombinationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TriggerConfigEncoder: io.circe.Encoder[models.TriggerConfig] = io.circe.Encoder.instance { o => 
    Json.obj("triggerName" -> o.triggerName.asJson, "triggerTargetArn" -> o.triggerTargetArn.asJson, "triggerEvents" -> o.triggerEvents.asJson)
  }
  final implicit val InvalidApplicationNameExceptionEncoder: io.circe.Encoder[models.InvalidApplicationNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EC2TagSetEncoder: io.circe.Encoder[models.EC2TagSet] = io.circe.Encoder.instance { o => 
    Json.obj("ec2TagSetList" -> o.ec2TagSetList.asJson)
  }
  final implicit val InvalidKeyPrefixFilterExceptionEncoder: io.circe.Encoder[models.InvalidKeyPrefixFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AutoRollbackConfigurationEncoder: io.circe.Encoder[models.AutoRollbackConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "events" -> o.events.asJson)
  }
  final implicit val BatchGetDeploymentsOutputEncoder: io.circe.Encoder[models.BatchGetDeploymentsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentsInfo" -> o.deploymentsInfo.asJson)
  }
  final implicit val BatchGetApplicationsOutputEncoder: io.circe.Encoder[models.BatchGetApplicationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationsInfo" -> o.applicationsInfo.asJson)
  }
  final implicit val InvalidRegistrationStatusExceptionEncoder: io.circe.Encoder[models.InvalidRegistrationStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RegisterApplicationRevisionInputEncoder: io.circe.Encoder[models.RegisterApplicationRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revision" -> o.revision.asJson, "description" -> o.description.asJson)
  }
  final implicit val ListApplicationsInputEncoder: io.circe.Encoder[models.ListApplicationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDeploymentOutputEncoder: io.circe.Encoder[models.CreateDeploymentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val GetApplicationRevisionOutputEncoder: io.circe.Encoder[models.GetApplicationRevisionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revision" -> o.revision.asJson, "revisionInfo" -> o.revisionInfo.asJson)
  }
  final implicit val InvalidDeploymentIdExceptionEncoder: io.circe.Encoder[models.InvalidDeploymentIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidEC2TagCombinationExceptionEncoder: io.circe.Encoder[models.InvalidEC2TagCombinationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationInfoEncoder: io.circe.Encoder[models.ApplicationInfo] = io.circe.Encoder.instance { o => 
    Json.obj("createTime" -> o.createTime.asJson, "applicationName" -> o.applicationName.asJson, "applicationId" -> o.applicationId.asJson, "gitHubAccountName" -> o.gitHubAccountName.asJson, "linkedToGitHub" -> o.linkedToGitHub.asJson)
  }
  final implicit val InvalidAlarmConfigExceptionEncoder: io.circe.Encoder[models.InvalidAlarmConfigException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListGitHubAccountTokenNamesOutputEncoder: io.circe.Encoder[models.ListGitHubAccountTokenNamesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("tokenNameList" -> o.tokenNameList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BatchGetDeploymentInstancesOutputEncoder: io.circe.Encoder[models.BatchGetDeploymentInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instancesSummary" -> o.instancesSummary.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ContinueDeploymentInputEncoder: io.circe.Encoder[models.ContinueDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val ListDeploymentGroupsOutputEncoder: io.circe.Encoder[models.ListDeploymentGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroups" -> o.deploymentGroups.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidIamUserArnExceptionEncoder: io.circe.Encoder[models.InvalidIamUserArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationNameRequiredExceptionEncoder: io.circe.Encoder[models.ApplicationNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentGroupInfoEncoder: io.circe.Encoder[models.DeploymentGroupInfo] = io.circe.Encoder.instance { o => 
    Json.obj("triggerConfigurations" -> o.triggerConfigurations.asJson, "onPremisesTagSet" -> o.onPremisesTagSet.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "applicationName" -> o.applicationName.asJson, "ec2TagFilters" -> o.ec2TagFilters.asJson, "alarmConfiguration" -> o.alarmConfiguration.asJson, "onPremisesInstanceTagFilters" -> o.onPremisesInstanceTagFilters.asJson, "serviceRoleArn" -> o.serviceRoleArn.asJson, "ec2TagSet" -> o.ec2TagSet.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "deploymentGroupId" -> o.deploymentGroupId.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "deploymentStyle" -> o.deploymentStyle.asJson, "targetRevision" -> o.targetRevision.asJson, "lastSuccessfulDeployment" -> o.lastSuccessfulDeployment.asJson, "lastAttemptedDeployment" -> o.lastAttemptedDeployment.asJson)
  }
  final implicit val BatchGetDeploymentsInputEncoder: io.circe.Encoder[models.BatchGetDeploymentsInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentIds" -> o.deploymentIds.asJson)
  }
  final implicit val LoadBalancerInfoEncoder: io.circe.Encoder[models.LoadBalancerInfo] = io.circe.Encoder.instance { o => 
    Json.obj("elbInfoList" -> o.elbInfoList.asJson, "targetGroupInfoList" -> o.targetGroupInfoList.asJson)
  }
  final implicit val DeploymentConfigDoesNotExistExceptionEncoder: io.circe.Encoder[models.DeploymentConfigDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDeploymentStyleExceptionEncoder: io.circe.Encoder[models.InvalidDeploymentStyleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationAlreadyExistsExceptionEncoder: io.circe.Encoder[models.ApplicationAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LifecycleHookLimitExceededExceptionEncoder: io.circe.Encoder[models.LifecycleHookLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetOnPremisesInstanceInputEncoder: io.circe.Encoder[models.GetOnPremisesInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val ErrorInformationEncoder: io.circe.Encoder[models.ErrorInformation] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "message" -> o.message.asJson)
  }
  final implicit val InstanceNameAlreadyRegisteredExceptionEncoder: io.circe.Encoder[models.InstanceNameAlreadyRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GreenFleetProvisioningOptionEncoder: io.circe.Encoder[models.GreenFleetProvisioningOption] = io.circe.Encoder.instance { o => 
    Json.obj("action" -> o.action.asJson)
  }
  final implicit val BatchGetOnPremisesInstancesInputEncoder: io.circe.Encoder[models.BatchGetOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceNames" -> o.instanceNames.asJson)
  }
  final implicit val ListDeploymentGroupsInputEncoder: io.circe.Encoder[models.ListDeploymentGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDeploymentInputEncoder: io.circe.Encoder[models.CreateDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "targetInstances" -> o.targetInstances.asJson, "fileExistsBehavior" -> o.fileExistsBehavior.asJson, "description" -> o.description.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "ignoreApplicationStopFailures" -> o.ignoreApplicationStopFailures.asJson, "updateOutdatedInstancesOnly" -> o.updateOutdatedInstancesOnly.asJson, "revision" -> o.revision.asJson)
  }
  final implicit val CreateDeploymentConfigInputEncoder: io.circe.Encoder[models.CreateDeploymentConfigInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigName" -> o.deploymentConfigName.asJson, "minimumHealthyHosts" -> o.minimumHealthyHosts.asJson)
  }
  final implicit val DeploymentIdRequiredExceptionEncoder: io.circe.Encoder[models.DeploymentIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentStyleEncoder: io.circe.Encoder[models.DeploymentStyle] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentType" -> o.deploymentType.asJson, "deploymentOption" -> o.deploymentOption.asJson)
  }
  final implicit val InvalidBlueGreenDeploymentConfigurationExceptionEncoder: io.circe.Encoder[models.InvalidBlueGreenDeploymentConfigurationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TimeRangeEncoder: io.circe.Encoder[models.TimeRange] = io.circe.Encoder.instance { o => 
    Json.obj("start" -> o.start.asJson, "end" -> o.end.asJson)
  }
  final implicit val DeploymentGroupLimitExceededExceptionEncoder: io.circe.Encoder[models.DeploymentGroupLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidInstanceTypeExceptionEncoder: io.circe.Encoder[models.InvalidInstanceTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RevisionLocationEncoder: io.circe.Encoder[models.RevisionLocation] = io.circe.Encoder.instance { o => 
    Json.obj("revisionType" -> o.revisionType.asJson, "s3Location" -> o.s3Location.asJson, "gitHubLocation" -> o.gitHubLocation.asJson)
  }
  final implicit val LastDeploymentInfoEncoder: io.circe.Encoder[models.LastDeploymentInfo] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "status" -> o.status.asJson, "endTime" -> o.endTime.asJson, "createTime" -> o.createTime.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GitHubAccountTokenDoesNotExistExceptionEncoder: io.circe.Encoder[models.GitHubAccountTokenDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeregisterOnPremisesInstanceInputEncoder: io.circe.Encoder[models.DeregisterOnPremisesInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetApplicationRevisionInputEncoder: io.circe.Encoder[models.GetApplicationRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revision" -> o.revision.asJson)
  }
  final implicit val UpdateApplicationInputEncoder: io.circe.Encoder[models.UpdateApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "newApplicationName" -> o.newApplicationName.asJson)
  }
  final implicit val ApplicationDoesNotExistExceptionEncoder: io.circe.Encoder[models.ApplicationDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescriptionTooLongExceptionEncoder: io.circe.Encoder[models.DescriptionTooLongException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MinimumHealthyHostsEncoder: io.circe.Encoder[models.MinimumHealthyHosts] = io.circe.Encoder.instance { o => 
    Json.obj("value" -> o.value.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val ListApplicationsOutputEncoder: io.circe.Encoder[models.ListApplicationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applications" -> o.applications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetDeploymentOutputEncoder: io.circe.Encoder[models.GetDeploymentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentInfo" -> o.deploymentInfo.asJson)
  }
  final implicit val InstanceIdRequiredExceptionEncoder: io.circe.Encoder[models.InstanceIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsFromOnPremisesInstancesInputEncoder: io.circe.Encoder[models.RemoveTagsFromOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson, "instanceNames" -> o.instanceNames.asJson)
  }
  final implicit val InvalidIamSessionArnExceptionEncoder: io.circe.Encoder[models.InvalidIamSessionArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeploymentConfigOutputEncoder: io.circe.Encoder[models.GetDeploymentConfigOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigInfo" -> o.deploymentConfigInfo.asJson)
  }
  final implicit val BatchGetOnPremisesInstancesOutputEncoder: io.circe.Encoder[models.BatchGetOnPremisesInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceInfos" -> o.instanceInfos.asJson)
  }
  final implicit val InvalidDeploymentGroupNameExceptionEncoder: io.circe.Encoder[models.InvalidDeploymentGroupNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LifecycleEventEncoder: io.circe.Encoder[models.LifecycleEvent] = io.circe.Encoder.instance { o => 
    Json.obj("lifecycleEventName" -> o.lifecycleEventName.asJson, "diagnostics" -> o.diagnostics.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "status" -> o.status.asJson)
  }
  final implicit val DeploymentReadyOptionEncoder: io.circe.Encoder[models.DeploymentReadyOption] = io.circe.Encoder.instance { o => 
    Json.obj("actionOnTimeout" -> o.actionOnTimeout.asJson, "waitTimeInMinutes" -> o.waitTimeInMinutes.asJson)
  }
  final implicit val DeleteDeploymentConfigInputEncoder: io.circe.Encoder[models.DeleteDeploymentConfigInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigName" -> o.deploymentConfigName.asJson)
  }
  final implicit val InstanceNotRegisteredExceptionEncoder: io.circe.Encoder[models.InstanceNotRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidInstanceNameExceptionDecoder: io.circe.Decoder[models.InvalidInstanceNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidInstanceNameException)
  final implicit val DeleteDeploymentGroupOutputDecoder: io.circe.Decoder[models.DeleteDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.AutoScalingGroup]]]("hooksNotCleanedUp").map(models.DeleteDeploymentGroupOutput.apply _)
  }
  final implicit val AutoScalingGroupDecoder: io.circe.Decoder[models.AutoScalingGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("hook")).mapN(models.AutoScalingGroup.apply _)
  }
  final implicit val ListDeploymentsOutputDecoder: io.circe.Decoder[models.ListDeploymentsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("deployments"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDeploymentsOutput.apply _)
  }
  final implicit val RevisionInfoDecoder: io.circe.Decoder[models.RevisionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.RevisionLocation]]("revisionLocation"), o.get[scala.Option[models.GenericRevisionInfo]]("genericRevisionInfo")).mapN(models.RevisionInfo.apply _)
  }
  final implicit val DeploymentDoesNotExistExceptionDecoder: io.circe.Decoder[models.DeploymentDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentDoesNotExistException)
  final implicit val ListOnPremisesInstancesInputDecoder: io.circe.Decoder[models.ListOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registrationStatus"), o.get[scala.Option[scala.List[models.TagFilter]]]("tagFilters"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListOnPremisesInstancesInput.apply _)
  }
  final implicit val CreateApplicationInputDecoder: io.circe.Decoder[models.CreateApplicationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("applicationName").map(models.CreateApplicationInput.apply _)
  }
  final implicit val InvalidTimeRangeExceptionDecoder: io.circe.Decoder[models.InvalidTimeRangeException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTimeRangeException)
  final implicit val InstanceInfoDecoder: io.circe.Decoder[models.InstanceInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("iamSessionArn"), o.get[scala.Option[java.time.Instant]]("registerTime"), o.get[scala.Option[java.time.Instant]]("deregisterTime"), o.get[scala.Option[java.lang.String]]("instanceArn"), o.get[scala.Option[java.lang.String]]("instanceName"), o.get[scala.Option[scala.List[models.Tag]]]("tags"), o.get[scala.Option[java.lang.String]]("iamUserArn")).mapN(models.InstanceInfo.apply _)
  }
  final implicit val InvalidTargetInstancesExceptionDecoder: io.circe.Decoder[models.InvalidTargetInstancesException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTargetInstancesException)
  final implicit val BucketNameFilterRequiredExceptionDecoder: io.circe.Decoder[models.BucketNameFilterRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.BucketNameFilterRequiredException)
  final implicit val BatchGetApplicationRevisionsOutputDecoder: io.circe.Decoder[models.BatchGetApplicationRevisionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[java.lang.String]]("errorMessage"), o.get[scala.Option[scala.List[models.RevisionInfo]]]("revisions")).mapN(models.BatchGetApplicationRevisionsOutput.apply _)
  }
  final implicit val CreateDeploymentConfigOutputDecoder: io.circe.Decoder[models.CreateDeploymentConfigOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentConfigId").map(models.CreateDeploymentConfigOutput.apply _)
  }
  final implicit val CreateDeploymentGroupInputDecoder: io.circe.Decoder[models.CreateDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("serviceRoleArn"), o.get[java.lang.String]("deploymentGroupName"), o.get[scala.Option[scala.List[models.TriggerConfig]]]("triggerConfigurations"), o.get[scala.Option[models.OnPremisesTagSet]]("onPremisesTagSet"), o.get[scala.Option[models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"), o.get[scala.Option[scala.List[models.EC2TagFilter]]]("ec2TagFilters"), o.get[scala.Option[models.AlarmConfiguration]]("alarmConfiguration"), o.get[scala.Option[scala.List[models.TagFilter]]]("onPremisesInstanceTagFilters"), o.get[scala.Option[models.EC2TagSet]]("ec2TagSet"), o.get[scala.Option[models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[models.LoadBalancerInfo]]("loadBalancerInfo"), o.get[scala.Option[models.DeploymentStyle]]("deploymentStyle")).mapN(models.CreateDeploymentGroupInput.apply _)
  }
  final implicit val InvalidTriggerConfigExceptionDecoder: io.circe.Decoder[models.InvalidTriggerConfigException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTriggerConfigException)
  final implicit val DeleteApplicationInputDecoder: io.circe.Decoder[models.DeleteApplicationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("applicationName").map(models.DeleteApplicationInput.apply _)
  }
  final implicit val GetDeploymentInputDecoder: io.circe.Decoder[models.GetDeploymentInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deploymentId").map(models.GetDeploymentInput.apply _)
  }
  final implicit val OnPremisesTagSetDecoder: io.circe.Decoder[models.OnPremisesTagSet] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[scala.List[models.TagFilter]]]]("onPremisesTagSetList").map(models.OnPremisesTagSet.apply _)
  }
  final implicit val DeploymentNotStartedExceptionDecoder: io.circe.Decoder[models.DeploymentNotStartedException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentNotStartedException)
  final implicit val AlarmsLimitExceededExceptionDecoder: io.circe.Decoder[models.AlarmsLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.AlarmsLimitExceededException)
  final implicit val DeploymentGroupAlreadyExistsExceptionDecoder: io.circe.Decoder[models.DeploymentGroupAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentGroupAlreadyExistsException)
  final implicit val CreateApplicationOutputDecoder: io.circe.Decoder[models.CreateApplicationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("applicationId").map(models.CreateApplicationOutput.apply _)
  }
  final implicit val InvalidRevisionExceptionDecoder: io.circe.Decoder[models.InvalidRevisionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRevisionException)
  final implicit val InstanceSummaryDecoder: io.circe.Decoder[models.InstanceSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("instanceId"), o.get[scala.Option[scala.List[models.LifecycleEvent]]]("lifecycleEvents"), o.get[scala.Option[java.time.Instant]]("lastUpdatedAt"), o.get[scala.Option[java.lang.String]]("deploymentId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("instanceType")).mapN(models.InstanceSummary.apply _)
  }
  final implicit val StopDeploymentOutputDecoder: io.circe.Decoder[models.StopDeploymentOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("statusMessage")).mapN(models.StopDeploymentOutput.apply _)
  }
  final implicit val GetDeploymentInstanceOutputDecoder: io.circe.Decoder[models.GetDeploymentInstanceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.InstanceSummary]]("instanceSummary").map(models.GetDeploymentInstanceOutput.apply _)
  }
  final implicit val ListDeploymentInstancesInputDecoder: io.circe.Decoder[models.ListDeploymentInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.List[java.lang.String]]]("instanceStatusFilter"), o.get[scala.Option[scala.List[java.lang.String]]]("instanceTypeFilter")).mapN(models.ListDeploymentInstancesInput.apply _)
  }
  final implicit val GitHubLocationDecoder: io.circe.Decoder[models.GitHubLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repository"), o.get[scala.Option[java.lang.String]]("commitId")).mapN(models.GitHubLocation.apply _)
  }
  final implicit val ELBInfoDecoder: io.circe.Decoder[models.ELBInfo] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(models.ELBInfo.apply _)
  }
  final implicit val IamArnRequiredExceptionDecoder: io.circe.Decoder[models.IamArnRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.IamArnRequiredException)
  final implicit val InvalidDeploymentInstanceTypeExceptionDecoder: io.circe.Decoder[models.InvalidDeploymentInstanceTypeException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeploymentInstanceTypeException)
  final implicit val InvalidOperationExceptionDecoder: io.circe.Decoder[models.InvalidOperationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidOperationException)
  final implicit val GetDeploymentGroupInputDecoder: io.circe.Decoder[models.GetDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("deploymentGroupName")).mapN(models.GetDeploymentGroupInput.apply _)
  }
  final implicit val DeploymentOverviewDecoder: io.circe.Decoder[models.DeploymentOverview] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("Pending"), o.get[scala.Option[scala.Long]]("Skipped"), o.get[scala.Option[scala.Long]]("Succeeded"), o.get[scala.Option[scala.Long]]("Ready"), o.get[scala.Option[scala.Long]]("InProgress"), o.get[scala.Option[scala.Long]]("Failed")).mapN(models.DeploymentOverview.apply _)
  }
  final implicit val InvalidTagFilterExceptionDecoder: io.circe.Decoder[models.InvalidTagFilterException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTagFilterException)
  final implicit val BlueGreenDeploymentConfigurationDecoder: io.circe.Decoder[models.BlueGreenDeploymentConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.BlueInstanceTerminationOption]]("terminateBlueInstancesOnDeploymentSuccess"), o.get[scala.Option[models.DeploymentReadyOption]]("deploymentReadyOption"), o.get[scala.Option[models.GreenFleetProvisioningOption]]("greenFleetProvisioningOption")).mapN(models.BlueGreenDeploymentConfiguration.apply _)
  }
  final implicit val GetApplicationInputDecoder: io.circe.Decoder[models.GetApplicationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("applicationName").map(models.GetApplicationInput.apply _)
  }
  final implicit val DeploymentAlreadyCompletedExceptionDecoder: io.circe.Decoder[models.DeploymentAlreadyCompletedException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentAlreadyCompletedException)
  final implicit val InvalidLoadBalancerInfoExceptionDecoder: io.circe.Decoder[models.InvalidLoadBalancerInfoException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidLoadBalancerInfoException)
  final implicit val BatchGetDeploymentGroupsOutputDecoder: io.circe.Decoder[models.BatchGetDeploymentGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.DeploymentGroupInfo]]]("deploymentGroupsInfo"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(models.BatchGetDeploymentGroupsOutput.apply _)
  }
  final implicit val CreateDeploymentGroupOutputDecoder: io.circe.Decoder[models.CreateDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentGroupId").map(models.CreateDeploymentGroupOutput.apply _)
  }
  final implicit val BlueInstanceTerminationOptionDecoder: io.circe.Decoder[models.BlueInstanceTerminationOption] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("action"), o.get[scala.Option[scala.Int]]("terminationWaitTimeInMinutes")).mapN(models.BlueInstanceTerminationOption.apply _)
  }
  final implicit val InvalidAutoRollbackConfigExceptionDecoder: io.circe.Decoder[models.InvalidAutoRollbackConfigException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidAutoRollbackConfigException)
  final implicit val StopDeploymentInputDecoder: io.circe.Decoder[models.StopDeploymentInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[scala.Option[scala.Boolean]]("autoRollbackEnabled")).mapN(models.StopDeploymentInput.apply _)
  }
  final implicit val DeploymentGroupDoesNotExistExceptionDecoder: io.circe.Decoder[models.DeploymentGroupDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentGroupDoesNotExistException)
  final implicit val TagFilterDecoder: io.circe.Decoder[models.TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type")).mapN(models.TagFilter.apply _)
  }
  final implicit val DeleteDeploymentGroupInputDecoder: io.circe.Decoder[models.DeleteDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("deploymentGroupName")).mapN(models.DeleteDeploymentGroupInput.apply _)
  }
  final implicit val InvalidRoleExceptionDecoder: io.circe.Decoder[models.InvalidRoleException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRoleException)
  final implicit val ListDeploymentInstancesOutputDecoder: io.circe.Decoder[models.ListDeploymentInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("instancesList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDeploymentInstancesOutput.apply _)
  }
  final implicit val AddTagsToOnPremisesInstancesInputDecoder: io.circe.Decoder[models.AddTagsToOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Tag]]("tags"), o.get[scala.List[java.lang.String]]("instanceNames")).mapN(models.AddTagsToOnPremisesInstancesInput.apply _)
  }
  final implicit val InvalidDeploymentConfigNameExceptionDecoder: io.circe.Decoder[models.InvalidDeploymentConfigNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeploymentConfigNameException)
  final implicit val InvalidMinimumHealthyHostValueExceptionDecoder: io.circe.Decoder[models.InvalidMinimumHealthyHostValueException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidMinimumHealthyHostValueException)
  final implicit val RoleRequiredExceptionDecoder: io.circe.Decoder[models.RoleRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RoleRequiredException)
  final implicit val InvalidTagExceptionDecoder: io.circe.Decoder[models.InvalidTagException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTagException)
  final implicit val BatchGetDeploymentInstancesInputDecoder: io.circe.Decoder[models.BatchGetDeploymentInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[scala.List[java.lang.String]]("instanceIds")).mapN(models.BatchGetDeploymentInstancesInput.apply _)
  }
  final implicit val RegisterOnPremisesInstanceInputDecoder: io.circe.Decoder[models.RegisterOnPremisesInstanceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceName"), o.get[scala.Option[java.lang.String]]("iamSessionArn"), o.get[scala.Option[java.lang.String]]("iamUserArn")).mapN(models.RegisterOnPremisesInstanceInput.apply _)
  }
  final implicit val InvalidDeploymentStatusExceptionDecoder: io.circe.Decoder[models.InvalidDeploymentStatusException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeploymentStatusException)
  final implicit val GetDeploymentConfigInputDecoder: io.circe.Decoder[models.GetDeploymentConfigInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deploymentConfigName").map(models.GetDeploymentConfigInput.apply _)
  }
  final implicit val DeploymentGroupNameRequiredExceptionDecoder: io.circe.Decoder[models.DeploymentGroupNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentGroupNameRequiredException)
  final implicit val MultipleIamArnsProvidedExceptionDecoder: io.circe.Decoder[models.MultipleIamArnsProvidedException.type] = io.circe.Decoder.decodeUnit.as(models.MultipleIamArnsProvidedException)
  final implicit val TagSetListLimitExceededExceptionDecoder: io.circe.Decoder[models.TagSetListLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.TagSetListLimitExceededException)
  final implicit val AlarmDecoder: io.circe.Decoder[models.Alarm] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(models.Alarm.apply _)
  }
  final implicit val ListGitHubAccountTokenNamesInputDecoder: io.circe.Decoder[models.ListGitHubAccountTokenNamesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(models.ListGitHubAccountTokenNamesInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val TargetInstancesDecoder: io.circe.Decoder[models.TargetInstances] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.EC2TagFilter]]]("tagFilters"), o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[models.EC2TagSet]]("ec2TagSet")).mapN(models.TargetInstances.apply _)
  }
  final implicit val GenericRevisionInfoDecoder: io.circe.Decoder[models.GenericRevisionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[java.lang.String]]]("deploymentGroups"), o.get[scala.Option[java.time.Instant]]("firstUsedTime"), o.get[scala.Option[java.time.Instant]]("lastUsedTime"), o.get[scala.Option[java.time.Instant]]("registerTime")).mapN(models.GenericRevisionInfo.apply _)
  }
  final implicit val BatchGetDeploymentGroupsInputDecoder: io.circe.Decoder[models.BatchGetDeploymentGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.List[java.lang.String]]("deploymentGroupNames")).mapN(models.BatchGetDeploymentGroupsInput.apply _)
  }
  final implicit val InvalidAutoScalingGroupExceptionDecoder: io.circe.Decoder[models.InvalidAutoScalingGroupException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidAutoScalingGroupException)
  final implicit val DeploymentConfigLimitExceededExceptionDecoder: io.circe.Decoder[models.DeploymentConfigLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentConfigLimitExceededException)
  final implicit val UpdateDeploymentGroupOutputDecoder: io.circe.Decoder[models.UpdateDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.AutoScalingGroup]]]("hooksNotCleanedUp").map(models.UpdateDeploymentGroupOutput.apply _)
  }
  final implicit val InvalidDeployedStateFilterExceptionDecoder: io.circe.Decoder[models.InvalidDeployedStateFilterException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeployedStateFilterException)
  final implicit val DeploymentConfigInfoDecoder: io.circe.Decoder[models.DeploymentConfigInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("deploymentConfigId"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[models.MinimumHealthyHosts]]("minimumHealthyHosts"), o.get[scala.Option[java.time.Instant]]("createTime")).mapN(models.DeploymentConfigInfo.apply _)
  }
  final implicit val IamSessionArnAlreadyRegisteredExceptionDecoder: io.circe.Decoder[models.IamSessionArnAlreadyRegisteredException.type] = io.circe.Decoder.decodeUnit.as(models.IamSessionArnAlreadyRegisteredException)
  final implicit val DeploymentConfigInUseExceptionDecoder: io.circe.Decoder[models.DeploymentConfigInUseException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentConfigInUseException)
  final implicit val IamUserArnRequiredExceptionDecoder: io.circe.Decoder[models.IamUserArnRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.IamUserArnRequiredException)
  final implicit val BatchLimitExceededExceptionDecoder: io.circe.Decoder[models.BatchLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.BatchLimitExceededException)
  final implicit val InvalidSortOrderExceptionDecoder: io.circe.Decoder[models.InvalidSortOrderException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSortOrderException)
  final implicit val TagLimitExceededExceptionDecoder: io.circe.Decoder[models.TagLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.TagLimitExceededException)
  final implicit val UpdateDeploymentGroupInputDecoder: io.circe.Decoder[models.UpdateDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("currentDeploymentGroupName"), o.get[scala.Option[scala.List[models.TriggerConfig]]]("triggerConfigurations"), o.get[scala.Option[models.OnPremisesTagSet]]("onPremisesTagSet"), o.get[scala.Option[models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"), o.get[scala.Option[scala.List[models.EC2TagFilter]]]("ec2TagFilters"), o.get[scala.Option[models.AlarmConfiguration]]("alarmConfiguration"), o.get[scala.Option[scala.List[models.TagFilter]]]("onPremisesInstanceTagFilters"), o.get[scala.Option[java.lang.String]]("serviceRoleArn"), o.get[scala.Option[models.EC2TagSet]]("ec2TagSet"), o.get[scala.Option[models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[java.lang.String]]("newDeploymentGroupName"), o.get[scala.Option[models.LoadBalancerInfo]]("loadBalancerInfo"), o.get[scala.Option[models.DeploymentStyle]]("deploymentStyle")).mapN(models.UpdateDeploymentGroupInput.apply _)
  }
  final implicit val DiagnosticsDecoder: io.circe.Decoder[models.Diagnostics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("errorCode"), o.get[scala.Option[java.lang.String]]("scriptName"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("logTail")).mapN(models.Diagnostics.apply _)
  }
  final implicit val IamUserArnAlreadyRegisteredExceptionDecoder: io.circe.Decoder[models.IamUserArnAlreadyRegisteredException.type] = io.circe.Decoder.decodeUnit.as(models.IamUserArnAlreadyRegisteredException)
  final implicit val RevisionDoesNotExistExceptionDecoder: io.circe.Decoder[models.RevisionDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.RevisionDoesNotExistException)
  final implicit val EC2TagFilterDecoder: io.circe.Decoder[models.EC2TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type")).mapN(models.EC2TagFilter.apply _)
  }
  final implicit val InstanceDoesNotExistExceptionDecoder: io.circe.Decoder[models.InstanceDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.InstanceDoesNotExistException)
  final implicit val GetApplicationOutputDecoder: io.circe.Decoder[models.GetApplicationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ApplicationInfo]]("application").map(models.GetApplicationOutput.apply _)
  }
  final implicit val InvalidSortByExceptionDecoder: io.circe.Decoder[models.InvalidSortByException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSortByException)
  final implicit val TagRequiredExceptionDecoder: io.circe.Decoder[models.TagRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.TagRequiredException)
  final implicit val TriggerTargetsLimitExceededExceptionDecoder: io.circe.Decoder[models.TriggerTargetsLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.TriggerTargetsLimitExceededException)
  final implicit val InvalidInstanceStatusExceptionDecoder: io.circe.Decoder[models.InvalidInstanceStatusException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidInstanceStatusException)
  final implicit val RevisionRequiredExceptionDecoder: io.circe.Decoder[models.RevisionRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RevisionRequiredException)
  final implicit val ListDeploymentConfigsOutputDecoder: io.circe.Decoder[models.ListDeploymentConfigsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("deploymentConfigsList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDeploymentConfigsOutput.apply _)
  }
  final implicit val ListDeploymentsInputDecoder: io.circe.Decoder[models.ListDeploymentsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[scala.List[java.lang.String]]]("includeOnlyStatuses"), o.get[scala.Option[java.lang.String]]("deploymentGroupName"), o.get[scala.Option[models.TimeRange]]("createTimeRange"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDeploymentsInput.apply _)
  }
  final implicit val GetDeploymentGroupOutputDecoder: io.circe.Decoder[models.GetDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.DeploymentGroupInfo]]("deploymentGroupInfo").map(models.GetDeploymentGroupOutput.apply _)
  }
  final implicit val ApplicationLimitExceededExceptionDecoder: io.circe.Decoder[models.ApplicationLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.ApplicationLimitExceededException)
  final implicit val ListOnPremisesInstancesOutputDecoder: io.circe.Decoder[models.ListOnPremisesInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("instanceNames"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListOnPremisesInstancesOutput.apply _)
  }
  final implicit val ListApplicationRevisionsInputDecoder: io.circe.Decoder[models.ListApplicationRevisionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.Option[java.lang.String]]("deployed"), o.get[scala.Option[java.lang.String]]("s3KeyPrefix"), o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("sortBy"), o.get[scala.Option[java.lang.String]]("s3Bucket"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListApplicationRevisionsInput.apply _)
  }
  final implicit val BatchGetApplicationsInputDecoder: io.circe.Decoder[models.BatchGetApplicationsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("applicationNames").map(models.BatchGetApplicationsInput.apply _)
  }
  final implicit val BatchGetApplicationRevisionsInputDecoder: io.circe.Decoder[models.BatchGetApplicationRevisionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.List[models.RevisionLocation]]("revisions")).mapN(models.BatchGetApplicationRevisionsInput.apply _)
  }
  final implicit val InstanceNameRequiredExceptionDecoder: io.circe.Decoder[models.InstanceNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.InstanceNameRequiredException)
  final implicit val DeploymentConfigAlreadyExistsExceptionDecoder: io.circe.Decoder[models.DeploymentConfigAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentConfigAlreadyExistsException)
  final implicit val InstanceLimitExceededExceptionDecoder: io.circe.Decoder[models.InstanceLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.InstanceLimitExceededException)
  final implicit val RollbackInfoDecoder: io.circe.Decoder[models.RollbackInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("rollbackDeploymentId"), o.get[scala.Option[java.lang.String]]("rollbackTriggeringDeploymentId"), o.get[scala.Option[java.lang.String]]("rollbackMessage")).mapN(models.RollbackInfo.apply _)
  }
  final implicit val DeploymentLimitExceededExceptionDecoder: io.circe.Decoder[models.DeploymentLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentLimitExceededException)
  final implicit val DeploymentInfoDecoder: io.circe.Decoder[models.DeploymentInfo] = io.circe.Decoder.instance { o => 
    for (`status` <- o.get[scala.Option[java.lang.String]]("status"); `createTime` <- o.get[scala.Option[java.time.Instant]]("createTime"); `startTime` <- o.get[scala.Option[java.time.Instant]]("startTime"); `completeTime` <- o.get[scala.Option[java.time.Instant]]("completeTime"); `deploymentId` <- o.get[scala.Option[java.lang.String]]("deploymentId"); `deploymentOverview` <- o.get[scala.Option[models.DeploymentOverview]]("deploymentOverview"); `blueGreenDeploymentConfiguration` <- o.get[scala.Option[models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"); `applicationName` <- o.get[scala.Option[java.lang.String]]("applicationName"); `additionalDeploymentStatusInfo` <- o.get[scala.Option[java.lang.String]]("additionalDeploymentStatusInfo"); `targetInstances` <- o.get[scala.Option[models.TargetInstances]]("targetInstances"); `fileExistsBehavior` <- o.get[scala.Option[java.lang.String]]("fileExistsBehavior"); `rollbackInfo` <- o.get[scala.Option[models.RollbackInfo]]("rollbackInfo"); `description` <- o.get[scala.Option[java.lang.String]]("description"); `autoRollbackConfiguration` <- o.get[scala.Option[models.AutoRollbackConfiguration]]("autoRollbackConfiguration"); `deploymentConfigName` <- o.get[scala.Option[java.lang.String]]("deploymentConfigName"); `deploymentGroupName` <- o.get[scala.Option[java.lang.String]]("deploymentGroupName"); `loadBalancerInfo` <- o.get[scala.Option[models.LoadBalancerInfo]]("loadBalancerInfo"); `errorInformation` <- o.get[scala.Option[models.ErrorInformation]]("errorInformation"); `ignoreApplicationStopFailures` <- o.get[scala.Option[scala.Boolean]]("ignoreApplicationStopFailures"); `updateOutdatedInstancesOnly` <- o.get[scala.Option[scala.Boolean]]("updateOutdatedInstancesOnly"); `instanceTerminationWaitTimeStarted` <- o.get[scala.Option[scala.Boolean]]("instanceTerminationWaitTimeStarted"); `creator` <- o.get[scala.Option[java.lang.String]]("creator"); `deploymentStyle` <- o.get[scala.Option[models.DeploymentStyle]]("deploymentStyle"); `previousRevision` <- o.get[scala.Option[models.RevisionLocation]]("previousRevision"); `revision` <- o.get[scala.Option[models.RevisionLocation]]("revision")) yield models.DeploymentInfo(status, createTime, startTime, completeTime, deploymentId, deploymentOverview, blueGreenDeploymentConfiguration, applicationName, additionalDeploymentStatusInfo, targetInstances, fileExistsBehavior, rollbackInfo, description, autoRollbackConfiguration, deploymentConfigName, deploymentGroupName, loadBalancerInfo, errorInformation, ignoreApplicationStopFailures, updateOutdatedInstancesOnly, instanceTerminationWaitTimeStarted, creator, deploymentStyle, previousRevision, revision)
  }
  final implicit val GetOnPremisesInstanceOutputDecoder: io.circe.Decoder[models.GetOnPremisesInstanceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.InstanceInfo]]("instanceInfo").map(models.GetOnPremisesInstanceOutput.apply _)
  }
  final implicit val ListApplicationRevisionsOutputDecoder: io.circe.Decoder[models.ListApplicationRevisionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.RevisionLocation]]]("revisions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListApplicationRevisionsOutput.apply _)
  }
  final implicit val ListDeploymentConfigsInputDecoder: io.circe.Decoder[models.ListDeploymentConfigsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(models.ListDeploymentConfigsInput.apply _)
  }
  final implicit val TargetGroupInfoDecoder: io.circe.Decoder[models.TargetGroupInfo] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(models.TargetGroupInfo.apply _)
  }
  final implicit val UnsupportedActionForDeploymentTypeExceptionDecoder: io.circe.Decoder[models.UnsupportedActionForDeploymentTypeException.type] = io.circe.Decoder.decodeUnit.as(models.UnsupportedActionForDeploymentTypeException)
  final implicit val InvalidFileExistsBehaviorExceptionDecoder: io.circe.Decoder[models.InvalidFileExistsBehaviorException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidFileExistsBehaviorException)
  final implicit val SkipWaitTimeForInstanceTerminationInputDecoder: io.circe.Decoder[models.SkipWaitTimeForInstanceTerminationInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentId").map(models.SkipWaitTimeForInstanceTerminationInput.apply _)
  }
  final implicit val GetDeploymentInstanceInputDecoder: io.circe.Decoder[models.GetDeploymentInstanceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[java.lang.String]("instanceId")).mapN(models.GetDeploymentInstanceInput.apply _)
  }
  final implicit val S3LocationDecoder: io.circe.Decoder[models.S3Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("key"), o.get[scala.Option[java.lang.String]]("bundleType"), o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.lang.String]]("eTag"), o.get[scala.Option[java.lang.String]]("bucket")).mapN(models.S3Location.apply _)
  }
  final implicit val InvalidBucketNameFilterExceptionDecoder: io.circe.Decoder[models.InvalidBucketNameFilterException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidBucketNameFilterException)
  final implicit val DeploymentConfigNameRequiredExceptionDecoder: io.circe.Decoder[models.DeploymentConfigNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentConfigNameRequiredException)
  final implicit val AlarmConfigurationDecoder: io.circe.Decoder[models.AlarmConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[scala.Boolean]]("ignorePollAlarmFailure"), o.get[scala.Option[scala.List[models.Alarm]]]("alarms")).mapN(models.AlarmConfiguration.apply _)
  }
  final implicit val DeploymentIsNotInReadyStateExceptionDecoder: io.circe.Decoder[models.DeploymentIsNotInReadyStateException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentIsNotInReadyStateException)
  final implicit val InvalidEC2TagExceptionDecoder: io.circe.Decoder[models.InvalidEC2TagException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidEC2TagException)
  final implicit val ResourceValidationExceptionDecoder: io.circe.Decoder[models.ResourceValidationException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceValidationException)
  final implicit val InvalidOnPremisesTagCombinationExceptionDecoder: io.circe.Decoder[models.InvalidOnPremisesTagCombinationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidOnPremisesTagCombinationException)
  final implicit val TriggerConfigDecoder: io.circe.Decoder[models.TriggerConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("triggerName"), o.get[scala.Option[java.lang.String]]("triggerTargetArn"), o.get[scala.Option[scala.List[java.lang.String]]]("triggerEvents")).mapN(models.TriggerConfig.apply _)
  }
  final implicit val InvalidApplicationNameExceptionDecoder: io.circe.Decoder[models.InvalidApplicationNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidApplicationNameException)
  final implicit val EC2TagSetDecoder: io.circe.Decoder[models.EC2TagSet] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[scala.List[models.EC2TagFilter]]]]("ec2TagSetList").map(models.EC2TagSet.apply _)
  }
  final implicit val InvalidKeyPrefixFilterExceptionDecoder: io.circe.Decoder[models.InvalidKeyPrefixFilterException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidKeyPrefixFilterException)
  final implicit val AutoRollbackConfigurationDecoder: io.circe.Decoder[models.AutoRollbackConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[scala.List[java.lang.String]]]("events")).mapN(models.AutoRollbackConfiguration.apply _)
  }
  final implicit val BatchGetDeploymentsOutputDecoder: io.circe.Decoder[models.BatchGetDeploymentsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.DeploymentInfo]]]("deploymentsInfo").map(models.BatchGetDeploymentsOutput.apply _)
  }
  final implicit val BatchGetApplicationsOutputDecoder: io.circe.Decoder[models.BatchGetApplicationsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ApplicationInfo]]]("applicationsInfo").map(models.BatchGetApplicationsOutput.apply _)
  }
  final implicit val InvalidRegistrationStatusExceptionDecoder: io.circe.Decoder[models.InvalidRegistrationStatusException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRegistrationStatusException)
  final implicit val RegisterApplicationRevisionInputDecoder: io.circe.Decoder[models.RegisterApplicationRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[models.RevisionLocation]("revision"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.RegisterApplicationRevisionInput.apply _)
  }
  final implicit val ListApplicationsInputDecoder: io.circe.Decoder[models.ListApplicationsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(models.ListApplicationsInput.apply _)
  }
  final implicit val CreateDeploymentOutputDecoder: io.circe.Decoder[models.CreateDeploymentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentId").map(models.CreateDeploymentOutput.apply _)
  }
  final implicit val GetApplicationRevisionOutputDecoder: io.circe.Decoder[models.GetApplicationRevisionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[models.RevisionLocation]]("revision"), o.get[scala.Option[models.GenericRevisionInfo]]("revisionInfo")).mapN(models.GetApplicationRevisionOutput.apply _)
  }
  final implicit val InvalidDeploymentIdExceptionDecoder: io.circe.Decoder[models.InvalidDeploymentIdException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeploymentIdException)
  final implicit val InvalidEC2TagCombinationExceptionDecoder: io.circe.Decoder[models.InvalidEC2TagCombinationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidEC2TagCombinationException)
  final implicit val ApplicationInfoDecoder: io.circe.Decoder[models.ApplicationInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("createTime"), o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[java.lang.String]]("applicationId"), o.get[scala.Option[java.lang.String]]("gitHubAccountName"), o.get[scala.Option[scala.Boolean]]("linkedToGitHub")).mapN(models.ApplicationInfo.apply _)
  }
  final implicit val InvalidAlarmConfigExceptionDecoder: io.circe.Decoder[models.InvalidAlarmConfigException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidAlarmConfigException)
  final implicit val ListGitHubAccountTokenNamesOutputDecoder: io.circe.Decoder[models.ListGitHubAccountTokenNamesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("tokenNameList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListGitHubAccountTokenNamesOutput.apply _)
  }
  final implicit val BatchGetDeploymentInstancesOutputDecoder: io.circe.Decoder[models.BatchGetDeploymentInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.InstanceSummary]]]("instancesSummary"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(models.BatchGetDeploymentInstancesOutput.apply _)
  }
  final implicit val ContinueDeploymentInputDecoder: io.circe.Decoder[models.ContinueDeploymentInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentId").map(models.ContinueDeploymentInput.apply _)
  }
  final implicit val ListDeploymentGroupsOutputDecoder: io.circe.Decoder[models.ListDeploymentGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[scala.List[java.lang.String]]]("deploymentGroups"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDeploymentGroupsOutput.apply _)
  }
  final implicit val InvalidIamUserArnExceptionDecoder: io.circe.Decoder[models.InvalidIamUserArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidIamUserArnException)
  final implicit val ApplicationNameRequiredExceptionDecoder: io.circe.Decoder[models.ApplicationNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.ApplicationNameRequiredException)
  final implicit val DeploymentGroupInfoDecoder: io.circe.Decoder[models.DeploymentGroupInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.TriggerConfig]]]("triggerConfigurations"), o.get[scala.Option[models.OnPremisesTagSet]]("onPremisesTagSet"), o.get[scala.Option[models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"), o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[scala.List[models.EC2TagFilter]]]("ec2TagFilters"), o.get[scala.Option[models.AlarmConfiguration]]("alarmConfiguration"), o.get[scala.Option[scala.List[models.TagFilter]]]("onPremisesInstanceTagFilters"), o.get[scala.Option[java.lang.String]]("serviceRoleArn"), o.get[scala.Option[models.EC2TagSet]]("ec2TagSet"), o.get[scala.Option[models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[java.lang.String]]("deploymentGroupName"), o.get[scala.Option[models.LoadBalancerInfo]]("loadBalancerInfo"), o.get[scala.Option[java.lang.String]]("deploymentGroupId"), o.get[scala.Option[scala.List[models.AutoScalingGroup]]]("autoScalingGroups"), o.get[scala.Option[models.DeploymentStyle]]("deploymentStyle"), o.get[scala.Option[models.RevisionLocation]]("targetRevision"), o.get[scala.Option[models.LastDeploymentInfo]]("lastSuccessfulDeployment"), o.get[scala.Option[models.LastDeploymentInfo]]("lastAttemptedDeployment")).mapN(models.DeploymentGroupInfo.apply _)
  }
  final implicit val BatchGetDeploymentsInputDecoder: io.circe.Decoder[models.BatchGetDeploymentsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("deploymentIds").map(models.BatchGetDeploymentsInput.apply _)
  }
  final implicit val LoadBalancerInfoDecoder: io.circe.Decoder[models.LoadBalancerInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ELBInfo]]]("elbInfoList"), o.get[scala.Option[scala.List[models.TargetGroupInfo]]]("targetGroupInfoList")).mapN(models.LoadBalancerInfo.apply _)
  }
  final implicit val DeploymentConfigDoesNotExistExceptionDecoder: io.circe.Decoder[models.DeploymentConfigDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentConfigDoesNotExistException)
  final implicit val InvalidDeploymentStyleExceptionDecoder: io.circe.Decoder[models.InvalidDeploymentStyleException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeploymentStyleException)
  final implicit val ApplicationAlreadyExistsExceptionDecoder: io.circe.Decoder[models.ApplicationAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.ApplicationAlreadyExistsException)
  final implicit val LifecycleHookLimitExceededExceptionDecoder: io.circe.Decoder[models.LifecycleHookLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.LifecycleHookLimitExceededException)
  final implicit val GetOnPremisesInstanceInputDecoder: io.circe.Decoder[models.GetOnPremisesInstanceInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.GetOnPremisesInstanceInput.apply _)
  }
  final implicit val ErrorInformationDecoder: io.circe.Decoder[models.ErrorInformation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("message")).mapN(models.ErrorInformation.apply _)
  }
  final implicit val InstanceNameAlreadyRegisteredExceptionDecoder: io.circe.Decoder[models.InstanceNameAlreadyRegisteredException.type] = io.circe.Decoder.decodeUnit.as(models.InstanceNameAlreadyRegisteredException)
  final implicit val GreenFleetProvisioningOptionDecoder: io.circe.Decoder[models.GreenFleetProvisioningOption] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("action").map(models.GreenFleetProvisioningOption.apply _)
  }
  final implicit val BatchGetOnPremisesInstancesInputDecoder: io.circe.Decoder[models.BatchGetOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("instanceNames").map(models.BatchGetOnPremisesInstancesInput.apply _)
  }
  final implicit val ListDeploymentGroupsInputDecoder: io.circe.Decoder[models.ListDeploymentGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDeploymentGroupsInput.apply _)
  }
  final implicit val CreateDeploymentInputDecoder: io.circe.Decoder[models.CreateDeploymentInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.Option[models.TargetInstances]]("targetInstances"), o.get[scala.Option[java.lang.String]]("fileExistsBehavior"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[java.lang.String]]("deploymentGroupName"), o.get[scala.Option[scala.Boolean]]("ignoreApplicationStopFailures"), o.get[scala.Option[scala.Boolean]]("updateOutdatedInstancesOnly"), o.get[scala.Option[models.RevisionLocation]]("revision")).mapN(models.CreateDeploymentInput.apply _)
  }
  final implicit val CreateDeploymentConfigInputDecoder: io.circe.Decoder[models.CreateDeploymentConfigInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentConfigName"), o.get[models.MinimumHealthyHosts]("minimumHealthyHosts")).mapN(models.CreateDeploymentConfigInput.apply _)
  }
  final implicit val DeploymentIdRequiredExceptionDecoder: io.circe.Decoder[models.DeploymentIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentIdRequiredException)
  final implicit val DeploymentStyleDecoder: io.circe.Decoder[models.DeploymentStyle] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("deploymentType"), o.get[scala.Option[java.lang.String]]("deploymentOption")).mapN(models.DeploymentStyle.apply _)
  }
  final implicit val InvalidBlueGreenDeploymentConfigurationExceptionDecoder: io.circe.Decoder[models.InvalidBlueGreenDeploymentConfigurationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidBlueGreenDeploymentConfigurationException)
  final implicit val TimeRangeDecoder: io.circe.Decoder[models.TimeRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("start"), o.get[scala.Option[java.time.Instant]]("end")).mapN(models.TimeRange.apply _)
  }
  final implicit val DeploymentGroupLimitExceededExceptionDecoder: io.circe.Decoder[models.DeploymentGroupLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.DeploymentGroupLimitExceededException)
  final implicit val InvalidInstanceTypeExceptionDecoder: io.circe.Decoder[models.InvalidInstanceTypeException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidInstanceTypeException)
  final implicit val RevisionLocationDecoder: io.circe.Decoder[models.RevisionLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("revisionType"), o.get[scala.Option[models.S3Location]]("s3Location"), o.get[scala.Option[models.GitHubLocation]]("gitHubLocation")).mapN(models.RevisionLocation.apply _)
  }
  final implicit val LastDeploymentInfoDecoder: io.circe.Decoder[models.LastDeploymentInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("deploymentId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.time.Instant]]("createTime")).mapN(models.LastDeploymentInfo.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidNextTokenException)
  final implicit val GitHubAccountTokenDoesNotExistExceptionDecoder: io.circe.Decoder[models.GitHubAccountTokenDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.GitHubAccountTokenDoesNotExistException)
  final implicit val DeregisterOnPremisesInstanceInputDecoder: io.circe.Decoder[models.DeregisterOnPremisesInstanceInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(models.DeregisterOnPremisesInstanceInput.apply _)
  }
  final implicit val GetApplicationRevisionInputDecoder: io.circe.Decoder[models.GetApplicationRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[models.RevisionLocation]("revision")).mapN(models.GetApplicationRevisionInput.apply _)
  }
  final implicit val UpdateApplicationInputDecoder: io.circe.Decoder[models.UpdateApplicationInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[java.lang.String]]("newApplicationName")).mapN(models.UpdateApplicationInput.apply _)
  }
  final implicit val ApplicationDoesNotExistExceptionDecoder: io.circe.Decoder[models.ApplicationDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.ApplicationDoesNotExistException)
  final implicit val DescriptionTooLongExceptionDecoder: io.circe.Decoder[models.DescriptionTooLongException.type] = io.circe.Decoder.decodeUnit.as(models.DescriptionTooLongException)
  final implicit val MinimumHealthyHostsDecoder: io.circe.Decoder[models.MinimumHealthyHosts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("value"), o.get[scala.Option[java.lang.String]]("type")).mapN(models.MinimumHealthyHosts.apply _)
  }
  final implicit val ListApplicationsOutputDecoder: io.circe.Decoder[models.ListApplicationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("applications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListApplicationsOutput.apply _)
  }
  final implicit val GetDeploymentOutputDecoder: io.circe.Decoder[models.GetDeploymentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.DeploymentInfo]]("deploymentInfo").map(models.GetDeploymentOutput.apply _)
  }
  final implicit val InstanceIdRequiredExceptionDecoder: io.circe.Decoder[models.InstanceIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.InstanceIdRequiredException)
  final implicit val RemoveTagsFromOnPremisesInstancesInputDecoder: io.circe.Decoder[models.RemoveTagsFromOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Tag]]("tags"), o.get[scala.List[java.lang.String]]("instanceNames")).mapN(models.RemoveTagsFromOnPremisesInstancesInput.apply _)
  }
  final implicit val InvalidIamSessionArnExceptionDecoder: io.circe.Decoder[models.InvalidIamSessionArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidIamSessionArnException)
  final implicit val GetDeploymentConfigOutputDecoder: io.circe.Decoder[models.GetDeploymentConfigOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.DeploymentConfigInfo]]("deploymentConfigInfo").map(models.GetDeploymentConfigOutput.apply _)
  }
  final implicit val BatchGetOnPremisesInstancesOutputDecoder: io.circe.Decoder[models.BatchGetOnPremisesInstancesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.InstanceInfo]]]("instanceInfos").map(models.BatchGetOnPremisesInstancesOutput.apply _)
  }
  final implicit val InvalidDeploymentGroupNameExceptionDecoder: io.circe.Decoder[models.InvalidDeploymentGroupNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeploymentGroupNameException)
  final implicit val LifecycleEventDecoder: io.circe.Decoder[models.LifecycleEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lifecycleEventName"), o.get[scala.Option[models.Diagnostics]]("diagnostics"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.lang.String]]("status")).mapN(models.LifecycleEvent.apply _)
  }
  final implicit val DeploymentReadyOptionDecoder: io.circe.Decoder[models.DeploymentReadyOption] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionOnTimeout"), o.get[scala.Option[scala.Int]]("waitTimeInMinutes")).mapN(models.DeploymentReadyOption.apply _)
  }
  final implicit val DeleteDeploymentConfigInputDecoder: io.circe.Decoder[models.DeleteDeploymentConfigInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deploymentConfigName").map(models.DeleteDeploymentConfigInput.apply _)
  }
  final implicit val InstanceNotRegisteredExceptionDecoder: io.circe.Decoder[models.InstanceNotRegisteredException.type] = io.circe.Decoder.decodeUnit.as(models.InstanceNotRegisteredException)
}