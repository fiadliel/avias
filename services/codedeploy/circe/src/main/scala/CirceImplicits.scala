package avias.codedeploy
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val InvalidInstanceNameExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidInstanceNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDeploymentGroupOutputEncoder: io.circe.Encoder[avias.codedeploy.models.DeleteDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("hooksNotCleanedUp" -> o.hooksNotCleanedUp.asJson)
  }
  final implicit val AutoScalingGroupEncoder: io.circe.Encoder[avias.codedeploy.models.AutoScalingGroup] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "hook" -> o.hook.asJson)
  }
  final implicit val ListDeploymentsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deployments" -> o.deployments.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RevisionInfoEncoder: io.circe.Encoder[avias.codedeploy.models.RevisionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("revisionLocation" -> o.revisionLocation.asJson, "genericRevisionInfo" -> o.genericRevisionInfo.asJson)
  }
  final implicit val DeploymentDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListOnPremisesInstancesInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("registrationStatus" -> o.registrationStatus.asJson, "tagFilters" -> o.tagFilters.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateApplicationInputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson)
  }
  final implicit val InvalidTimeRangeExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidTimeRangeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceInfoEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceInfo] = io.circe.Encoder.instance { o => 
    Json.obj("iamSessionArn" -> o.iamSessionArn.asJson, "registerTime" -> o.registerTime.asJson, "deregisterTime" -> o.deregisterTime.asJson, "instanceArn" -> o.instanceArn.asJson, "instanceName" -> o.instanceName.asJson, "tags" -> o.tags.asJson, "iamUserArn" -> o.iamUserArn.asJson)
  }
  final implicit val InvalidTargetInstancesExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidTargetInstancesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BucketNameFilterRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.BucketNameFilterRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetApplicationRevisionsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetApplicationRevisionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "errorMessage" -> o.errorMessage.asJson, "revisions" -> o.revisions.asJson)
  }
  final implicit val CreateDeploymentConfigOutputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateDeploymentConfigOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigId" -> o.deploymentConfigId.asJson)
  }
  final implicit val CreateDeploymentGroupInputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "serviceRoleArn" -> o.serviceRoleArn.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "triggerConfigurations" -> o.triggerConfigurations.asJson, "onPremisesTagSet" -> o.onPremisesTagSet.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "ec2TagFilters" -> o.ec2TagFilters.asJson, "alarmConfiguration" -> o.alarmConfiguration.asJson, "onPremisesInstanceTagFilters" -> o.onPremisesInstanceTagFilters.asJson, "ec2TagSet" -> o.ec2TagSet.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "deploymentStyle" -> o.deploymentStyle.asJson)
  }
  final implicit val InvalidTriggerConfigExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidTriggerConfigException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteApplicationInputEncoder: io.circe.Encoder[avias.codedeploy.models.DeleteApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson)
  }
  final implicit val GetDeploymentInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val OnPremisesTagSetEncoder: io.circe.Encoder[avias.codedeploy.models.OnPremisesTagSet] = io.circe.Encoder.instance { o => 
    Json.obj("onPremisesTagSetList" -> o.onPremisesTagSetList.asJson)
  }
  final implicit val DeploymentNotStartedExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentNotStartedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AlarmsLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.AlarmsLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentGroupAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentGroupAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateApplicationOutputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateApplicationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationId" -> o.applicationId.asJson)
  }
  final implicit val InvalidRevisionExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidRevisionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceSummaryEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceSummary] = io.circe.Encoder.instance { o => 
    Json.obj("instanceId" -> o.instanceId.asJson, "lifecycleEvents" -> o.lifecycleEvents.asJson, "lastUpdatedAt" -> o.lastUpdatedAt.asJson, "deploymentId" -> o.deploymentId.asJson, "status" -> o.status.asJson, "instanceType" -> o.instanceType.asJson)
  }
  final implicit val StopDeploymentOutputEncoder: io.circe.Encoder[avias.codedeploy.models.StopDeploymentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "statusMessage" -> o.statusMessage.asJson)
  }
  final implicit val GetDeploymentInstanceOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentInstanceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceSummary" -> o.instanceSummary.asJson)
  }
  final implicit val ListDeploymentInstancesInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "nextToken" -> o.nextToken.asJson, "instanceStatusFilter" -> o.instanceStatusFilter.asJson, "instanceTypeFilter" -> o.instanceTypeFilter.asJson)
  }
  final implicit val GitHubLocationEncoder: io.circe.Encoder[avias.codedeploy.models.GitHubLocation] = io.circe.Encoder.instance { o => 
    Json.obj("repository" -> o.repository.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val ELBInfoEncoder: io.circe.Encoder[avias.codedeploy.models.ELBInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val IamArnRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.IamArnRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDeploymentInstanceTypeExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeploymentInstanceTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidOperationExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidOperationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeploymentGroupInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson)
  }
  final implicit val DeploymentOverviewEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentOverview] = io.circe.Encoder.instance { o => 
    Json.obj("Pending" -> o.pending.asJson, "Skipped" -> o.skipped.asJson, "Succeeded" -> o.succeeded.asJson, "Ready" -> o.ready.asJson, "InProgress" -> o.inProgress.asJson, "Failed" -> o.failed.asJson)
  }
  final implicit val InvalidTagFilterExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidTagFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BlueGreenDeploymentConfigurationEncoder: io.circe.Encoder[avias.codedeploy.models.BlueGreenDeploymentConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("terminateBlueInstancesOnDeploymentSuccess" -> o.terminateBlueInstancesOnDeploymentSuccess.asJson, "deploymentReadyOption" -> o.deploymentReadyOption.asJson, "greenFleetProvisioningOption" -> o.greenFleetProvisioningOption.asJson)
  }
  final implicit val GetApplicationInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson)
  }
  final implicit val DeploymentAlreadyCompletedExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentAlreadyCompletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidLoadBalancerInfoExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidLoadBalancerInfoException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetDeploymentGroupsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetDeploymentGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentGroupsInfo" -> o.deploymentGroupsInfo.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val CreateDeploymentGroupOutputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentGroupId" -> o.deploymentGroupId.asJson)
  }
  final implicit val BlueInstanceTerminationOptionEncoder: io.circe.Encoder[avias.codedeploy.models.BlueInstanceTerminationOption] = io.circe.Encoder.instance { o => 
    Json.obj("action" -> o.action.asJson, "terminationWaitTimeInMinutes" -> o.terminationWaitTimeInMinutes.asJson)
  }
  final implicit val InvalidAutoRollbackConfigExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidAutoRollbackConfigException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StopDeploymentInputEncoder: io.circe.Encoder[avias.codedeploy.models.StopDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "autoRollbackEnabled" -> o.autoRollbackEnabled.asJson)
  }
  final implicit val DeploymentGroupDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentGroupDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagFilterEncoder: io.circe.Encoder[avias.codedeploy.models.TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val DeleteDeploymentGroupInputEncoder: io.circe.Encoder[avias.codedeploy.models.DeleteDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson)
  }
  final implicit val InvalidRoleExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidRoleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListDeploymentInstancesOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instancesList" -> o.instancesList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsToOnPremisesInstancesInputEncoder: io.circe.Encoder[avias.codedeploy.models.AddTagsToOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson, "instanceNames" -> o.instanceNames.asJson)
  }
  final implicit val InvalidDeploymentConfigNameExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeploymentConfigNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidMinimumHealthyHostValueExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidMinimumHealthyHostValueException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RoleRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.RoleRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTagExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidTagException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetDeploymentInstancesInputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetDeploymentInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "instanceIds" -> o.instanceIds.asJson)
  }
  final implicit val RegisterOnPremisesInstanceInputEncoder: io.circe.Encoder[avias.codedeploy.models.RegisterOnPremisesInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson, "iamSessionArn" -> o.iamSessionArn.asJson, "iamUserArn" -> o.iamUserArn.asJson)
  }
  final implicit val InvalidDeploymentStatusExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeploymentStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeploymentConfigInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentConfigInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigName" -> o.deploymentConfigName.asJson)
  }
  final implicit val DeploymentGroupNameRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentGroupNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MultipleIamArnsProvidedExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.MultipleIamArnsProvidedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagSetListLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.TagSetListLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AlarmEncoder: io.circe.Encoder[avias.codedeploy.models.Alarm] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val ListGitHubAccountTokenNamesInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListGitHubAccountTokenNamesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.codedeploy.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val TargetInstancesEncoder: io.circe.Encoder[avias.codedeploy.models.TargetInstances] = io.circe.Encoder.instance { o => 
    Json.obj("tagFilters" -> o.tagFilters.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "ec2TagSet" -> o.ec2TagSet.asJson)
  }
  final implicit val GenericRevisionInfoEncoder: io.circe.Encoder[avias.codedeploy.models.GenericRevisionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("description" -> o.description.asJson, "deploymentGroups" -> o.deploymentGroups.asJson, "firstUsedTime" -> o.firstUsedTime.asJson, "lastUsedTime" -> o.lastUsedTime.asJson, "registerTime" -> o.registerTime.asJson)
  }
  final implicit val BatchGetDeploymentGroupsInputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetDeploymentGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroupNames" -> o.deploymentGroupNames.asJson)
  }
  final implicit val InvalidAutoScalingGroupExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidAutoScalingGroupException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentConfigLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDeploymentGroupOutputEncoder: io.circe.Encoder[avias.codedeploy.models.UpdateDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("hooksNotCleanedUp" -> o.hooksNotCleanedUp.asJson)
  }
  final implicit val InvalidDeployedStateFilterExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeployedStateFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigInfoEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentConfigInfo] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigId" -> o.deploymentConfigId.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "minimumHealthyHosts" -> o.minimumHealthyHosts.asJson, "createTime" -> o.createTime.asJson)
  }
  final implicit val IamSessionArnAlreadyRegisteredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.IamSessionArnAlreadyRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigInUseExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentConfigInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val IamUserArnRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.IamUserArnRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.BatchLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSortOrderExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidSortOrderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.TagLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDeploymentGroupInputEncoder: io.circe.Encoder[avias.codedeploy.models.UpdateDeploymentGroupInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "currentDeploymentGroupName" -> o.currentDeploymentGroupName.asJson, "triggerConfigurations" -> o.triggerConfigurations.asJson, "onPremisesTagSet" -> o.onPremisesTagSet.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "ec2TagFilters" -> o.ec2TagFilters.asJson, "alarmConfiguration" -> o.alarmConfiguration.asJson, "onPremisesInstanceTagFilters" -> o.onPremisesInstanceTagFilters.asJson, "serviceRoleArn" -> o.serviceRoleArn.asJson, "ec2TagSet" -> o.ec2TagSet.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "newDeploymentGroupName" -> o.newDeploymentGroupName.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "deploymentStyle" -> o.deploymentStyle.asJson)
  }
  final implicit val DiagnosticsEncoder: io.circe.Encoder[avias.codedeploy.models.Diagnostics] = io.circe.Encoder.instance { o => 
    Json.obj("errorCode" -> o.errorCode.asJson, "scriptName" -> o.scriptName.asJson, "message" -> o.message.asJson, "logTail" -> o.logTail.asJson)
  }
  final implicit val IamUserArnAlreadyRegisteredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.IamUserArnAlreadyRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RevisionDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.RevisionDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EC2TagFilterEncoder: io.circe.Encoder[avias.codedeploy.models.EC2TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val InstanceDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetApplicationOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetApplicationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("application" -> o.application.asJson)
  }
  final implicit val InvalidSortByExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidSortByException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.TagRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TriggerTargetsLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.TriggerTargetsLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidInstanceStatusExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidInstanceStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RevisionRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.RevisionRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListDeploymentConfigsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentConfigsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigsList" -> o.deploymentConfigsList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListDeploymentsInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "includeOnlyStatuses" -> o.includeOnlyStatuses.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "createTimeRange" -> o.createTimeRange.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetDeploymentGroupOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentGroupOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentGroupInfo" -> o.deploymentGroupInfo.asJson)
  }
  final implicit val ApplicationLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.ApplicationLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListOnPremisesInstancesOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListOnPremisesInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceNames" -> o.instanceNames.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListApplicationRevisionsInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListApplicationRevisionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deployed" -> o.deployed.asJson, "s3KeyPrefix" -> o.s3KeyPrefix.asJson, "sortOrder" -> o.sortOrder.asJson, "sortBy" -> o.sortBy.asJson, "s3Bucket" -> o.s3Bucket.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BatchGetApplicationsInputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetApplicationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationNames" -> o.applicationNames.asJson)
  }
  final implicit val BatchGetApplicationRevisionsInputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetApplicationRevisionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revisions" -> o.revisions.asJson)
  }
  final implicit val InstanceNameRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentConfigAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InstanceLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RollbackInfoEncoder: io.circe.Encoder[avias.codedeploy.models.RollbackInfo] = io.circe.Encoder.instance { o => 
    Json.obj("rollbackDeploymentId" -> o.rollbackDeploymentId.asJson, "rollbackTriggeringDeploymentId" -> o.rollbackTriggeringDeploymentId.asJson, "rollbackMessage" -> o.rollbackMessage.asJson)
  }
  final implicit val DeploymentLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentInfoEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentInfo] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "createTime" -> o.createTime.asJson, "startTime" -> o.startTime.asJson, "completeTime" -> o.completeTime.asJson, "deploymentId" -> o.deploymentId.asJson, "deploymentOverview" -> o.deploymentOverview.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "applicationName" -> o.applicationName.asJson, "additionalDeploymentStatusInfo" -> o.additionalDeploymentStatusInfo.asJson, "targetInstances" -> o.targetInstances.asJson, "fileExistsBehavior" -> o.fileExistsBehavior.asJson, "rollbackInfo" -> o.rollbackInfo.asJson, "description" -> o.description.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "errorInformation" -> o.errorInformation.asJson, "ignoreApplicationStopFailures" -> o.ignoreApplicationStopFailures.asJson, "updateOutdatedInstancesOnly" -> o.updateOutdatedInstancesOnly.asJson, "instanceTerminationWaitTimeStarted" -> o.instanceTerminationWaitTimeStarted.asJson, "creator" -> o.creator.asJson, "deploymentStyle" -> o.deploymentStyle.asJson, "previousRevision" -> o.previousRevision.asJson, "revision" -> o.revision.asJson)
  }
  final implicit val GetOnPremisesInstanceOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetOnPremisesInstanceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceInfo" -> o.instanceInfo.asJson)
  }
  final implicit val ListApplicationRevisionsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListApplicationRevisionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("revisions" -> o.revisions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListDeploymentConfigsInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentConfigsInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val TargetGroupInfoEncoder: io.circe.Encoder[avias.codedeploy.models.TargetGroupInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson)
  }
  final implicit val UnsupportedActionForDeploymentTypeExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.UnsupportedActionForDeploymentTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidFileExistsBehaviorExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidFileExistsBehaviorException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SkipWaitTimeForInstanceTerminationInputEncoder: io.circe.Encoder[avias.codedeploy.models.SkipWaitTimeForInstanceTerminationInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val GetDeploymentInstanceInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "instanceId" -> o.instanceId.asJson)
  }
  final implicit val S3LocationEncoder: io.circe.Encoder[avias.codedeploy.models.S3Location] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "bundleType" -> o.bundleType.asJson, "version" -> o.version.asJson, "eTag" -> o.eTag.asJson, "bucket" -> o.bucket.asJson)
  }
  final implicit val InvalidBucketNameFilterExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidBucketNameFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentConfigNameRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentConfigNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AlarmConfigurationEncoder: io.circe.Encoder[avias.codedeploy.models.AlarmConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "ignorePollAlarmFailure" -> o.ignorePollAlarmFailure.asJson, "alarms" -> o.alarms.asJson)
  }
  final implicit val DeploymentIsNotInReadyStateExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentIsNotInReadyStateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidEC2TagExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidEC2TagException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceValidationExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.ResourceValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidOnPremisesTagCombinationExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidOnPremisesTagCombinationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TriggerConfigEncoder: io.circe.Encoder[avias.codedeploy.models.TriggerConfig] = io.circe.Encoder.instance { o => 
    Json.obj("triggerName" -> o.triggerName.asJson, "triggerTargetArn" -> o.triggerTargetArn.asJson, "triggerEvents" -> o.triggerEvents.asJson)
  }
  final implicit val InvalidApplicationNameExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidApplicationNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EC2TagSetEncoder: io.circe.Encoder[avias.codedeploy.models.EC2TagSet] = io.circe.Encoder.instance { o => 
    Json.obj("ec2TagSetList" -> o.ec2TagSetList.asJson)
  }
  final implicit val InvalidKeyPrefixFilterExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidKeyPrefixFilterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AutoRollbackConfigurationEncoder: io.circe.Encoder[avias.codedeploy.models.AutoRollbackConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("enabled" -> o.enabled.asJson, "events" -> o.events.asJson)
  }
  final implicit val BatchGetDeploymentsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetDeploymentsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentsInfo" -> o.deploymentsInfo.asJson)
  }
  final implicit val BatchGetApplicationsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetApplicationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationsInfo" -> o.applicationsInfo.asJson)
  }
  final implicit val InvalidRegistrationStatusExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidRegistrationStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RegisterApplicationRevisionInputEncoder: io.circe.Encoder[avias.codedeploy.models.RegisterApplicationRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revision" -> o.revision.asJson, "description" -> o.description.asJson)
  }
  final implicit val ListApplicationsInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListApplicationsInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDeploymentOutputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateDeploymentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val GetApplicationRevisionOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetApplicationRevisionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revision" -> o.revision.asJson, "revisionInfo" -> o.revisionInfo.asJson)
  }
  final implicit val InvalidDeploymentIdExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeploymentIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidEC2TagCombinationExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidEC2TagCombinationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationInfoEncoder: io.circe.Encoder[avias.codedeploy.models.ApplicationInfo] = io.circe.Encoder.instance { o => 
    Json.obj("createTime" -> o.createTime.asJson, "applicationName" -> o.applicationName.asJson, "applicationId" -> o.applicationId.asJson, "gitHubAccountName" -> o.gitHubAccountName.asJson, "linkedToGitHub" -> o.linkedToGitHub.asJson)
  }
  final implicit val InvalidAlarmConfigExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidAlarmConfigException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListGitHubAccountTokenNamesOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListGitHubAccountTokenNamesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("tokenNameList" -> o.tokenNameList.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val BatchGetDeploymentInstancesOutputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetDeploymentInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instancesSummary" -> o.instancesSummary.asJson, "errorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ContinueDeploymentInputEncoder: io.circe.Encoder[avias.codedeploy.models.ContinueDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson)
  }
  final implicit val ListDeploymentGroupsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentGroupsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "deploymentGroups" -> o.deploymentGroups.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidIamUserArnExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidIamUserArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationNameRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.ApplicationNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentGroupInfoEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentGroupInfo] = io.circe.Encoder.instance { o => 
    Json.obj("triggerConfigurations" -> o.triggerConfigurations.asJson, "onPremisesTagSet" -> o.onPremisesTagSet.asJson, "blueGreenDeploymentConfiguration" -> o.blueGreenDeploymentConfiguration.asJson, "applicationName" -> o.applicationName.asJson, "ec2TagFilters" -> o.ec2TagFilters.asJson, "alarmConfiguration" -> o.alarmConfiguration.asJson, "onPremisesInstanceTagFilters" -> o.onPremisesInstanceTagFilters.asJson, "serviceRoleArn" -> o.serviceRoleArn.asJson, "ec2TagSet" -> o.ec2TagSet.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "loadBalancerInfo" -> o.loadBalancerInfo.asJson, "deploymentGroupId" -> o.deploymentGroupId.asJson, "autoScalingGroups" -> o.autoScalingGroups.asJson, "deploymentStyle" -> o.deploymentStyle.asJson, "targetRevision" -> o.targetRevision.asJson, "lastSuccessfulDeployment" -> o.lastSuccessfulDeployment.asJson, "lastAttemptedDeployment" -> o.lastAttemptedDeployment.asJson)
  }
  final implicit val BatchGetDeploymentsInputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetDeploymentsInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentIds" -> o.deploymentIds.asJson)
  }
  final implicit val LoadBalancerInfoEncoder: io.circe.Encoder[avias.codedeploy.models.LoadBalancerInfo] = io.circe.Encoder.instance { o => 
    Json.obj("elbInfoList" -> o.elbInfoList.asJson, "targetGroupInfoList" -> o.targetGroupInfoList.asJson)
  }
  final implicit val DeploymentConfigDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentConfigDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDeploymentStyleExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeploymentStyleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApplicationAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.ApplicationAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LifecycleHookLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.LifecycleHookLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetOnPremisesInstanceInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetOnPremisesInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val ErrorInformationEncoder: io.circe.Encoder[avias.codedeploy.models.ErrorInformation] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "message" -> o.message.asJson)
  }
  final implicit val InstanceNameAlreadyRegisteredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceNameAlreadyRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GreenFleetProvisioningOptionEncoder: io.circe.Encoder[avias.codedeploy.models.GreenFleetProvisioningOption] = io.circe.Encoder.instance { o => 
    Json.obj("action" -> o.action.asJson)
  }
  final implicit val BatchGetOnPremisesInstancesInputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceNames" -> o.instanceNames.asJson)
  }
  final implicit val ListDeploymentGroupsInputEncoder: io.circe.Encoder[avias.codedeploy.models.ListDeploymentGroupsInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateDeploymentInputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateDeploymentInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "targetInstances" -> o.targetInstances.asJson, "fileExistsBehavior" -> o.fileExistsBehavior.asJson, "description" -> o.description.asJson, "autoRollbackConfiguration" -> o.autoRollbackConfiguration.asJson, "deploymentConfigName" -> o.deploymentConfigName.asJson, "deploymentGroupName" -> o.deploymentGroupName.asJson, "ignoreApplicationStopFailures" -> o.ignoreApplicationStopFailures.asJson, "updateOutdatedInstancesOnly" -> o.updateOutdatedInstancesOnly.asJson, "revision" -> o.revision.asJson)
  }
  final implicit val CreateDeploymentConfigInputEncoder: io.circe.Encoder[avias.codedeploy.models.CreateDeploymentConfigInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigName" -> o.deploymentConfigName.asJson, "minimumHealthyHosts" -> o.minimumHealthyHosts.asJson)
  }
  final implicit val DeploymentIdRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeploymentStyleEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentStyle] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentType" -> o.deploymentType.asJson, "deploymentOption" -> o.deploymentOption.asJson)
  }
  final implicit val InvalidBlueGreenDeploymentConfigurationExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidBlueGreenDeploymentConfigurationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TimeRangeEncoder: io.circe.Encoder[avias.codedeploy.models.TimeRange] = io.circe.Encoder.instance { o => 
    Json.obj("start" -> o.start.asJson, "end" -> o.end.asJson)
  }
  final implicit val DeploymentGroupLimitExceededExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentGroupLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidInstanceTypeExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidInstanceTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RevisionLocationEncoder: io.circe.Encoder[avias.codedeploy.models.RevisionLocation] = io.circe.Encoder.instance { o => 
    Json.obj("revisionType" -> o.revisionType.asJson, "s3Location" -> o.s3Location.asJson, "gitHubLocation" -> o.gitHubLocation.asJson)
  }
  final implicit val LastDeploymentInfoEncoder: io.circe.Encoder[avias.codedeploy.models.LastDeploymentInfo] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentId" -> o.deploymentId.asJson, "status" -> o.status.asJson, "endTime" -> o.endTime.asJson, "createTime" -> o.createTime.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GitHubAccountTokenDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.GitHubAccountTokenDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeregisterOnPremisesInstanceInputEncoder: io.circe.Encoder[avias.codedeploy.models.DeregisterOnPremisesInstanceInput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceName" -> o.instanceName.asJson)
  }
  final implicit val GetApplicationRevisionInputEncoder: io.circe.Encoder[avias.codedeploy.models.GetApplicationRevisionInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "revision" -> o.revision.asJson)
  }
  final implicit val UpdateApplicationInputEncoder: io.circe.Encoder[avias.codedeploy.models.UpdateApplicationInput] = io.circe.Encoder.instance { o => 
    Json.obj("applicationName" -> o.applicationName.asJson, "newApplicationName" -> o.newApplicationName.asJson)
  }
  final implicit val ApplicationDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.ApplicationDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescriptionTooLongExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.DescriptionTooLongException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MinimumHealthyHostsEncoder: io.circe.Encoder[avias.codedeploy.models.MinimumHealthyHosts] = io.circe.Encoder.instance { o => 
    Json.obj("value" -> o.value.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val ListApplicationsOutputEncoder: io.circe.Encoder[avias.codedeploy.models.ListApplicationsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("applications" -> o.applications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetDeploymentOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentInfo" -> o.deploymentInfo.asJson)
  }
  final implicit val InstanceIdRequiredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsFromOnPremisesInstancesInputEncoder: io.circe.Encoder[avias.codedeploy.models.RemoveTagsFromOnPremisesInstancesInput] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson, "instanceNames" -> o.instanceNames.asJson)
  }
  final implicit val InvalidIamSessionArnExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidIamSessionArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeploymentConfigOutputEncoder: io.circe.Encoder[avias.codedeploy.models.GetDeploymentConfigOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigInfo" -> o.deploymentConfigInfo.asJson)
  }
  final implicit val BatchGetOnPremisesInstancesOutputEncoder: io.circe.Encoder[avias.codedeploy.models.BatchGetOnPremisesInstancesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("instanceInfos" -> o.instanceInfos.asJson)
  }
  final implicit val InvalidDeploymentGroupNameExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InvalidDeploymentGroupNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LifecycleEventEncoder: io.circe.Encoder[avias.codedeploy.models.LifecycleEvent] = io.circe.Encoder.instance { o => 
    Json.obj("lifecycleEventName" -> o.lifecycleEventName.asJson, "diagnostics" -> o.diagnostics.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "status" -> o.status.asJson)
  }
  final implicit val DeploymentReadyOptionEncoder: io.circe.Encoder[avias.codedeploy.models.DeploymentReadyOption] = io.circe.Encoder.instance { o => 
    Json.obj("actionOnTimeout" -> o.actionOnTimeout.asJson, "waitTimeInMinutes" -> o.waitTimeInMinutes.asJson)
  }
  final implicit val DeleteDeploymentConfigInputEncoder: io.circe.Encoder[avias.codedeploy.models.DeleteDeploymentConfigInput] = io.circe.Encoder.instance { o => 
    Json.obj("deploymentConfigName" -> o.deploymentConfigName.asJson)
  }
  final implicit val InstanceNotRegisteredExceptionEncoder: io.circe.Encoder[avias.codedeploy.models.InstanceNotRegisteredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidInstanceNameExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidInstanceNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidInstanceNameException)
  final implicit val DeleteDeploymentGroupOutputDecoder: io.circe.Decoder[avias.codedeploy.models.DeleteDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codedeploy.models.AutoScalingGroup]]]("hooksNotCleanedUp").map(avias.codedeploy.models.DeleteDeploymentGroupOutput.apply _)
  }
  final implicit val AutoScalingGroupDecoder: io.circe.Decoder[avias.codedeploy.models.AutoScalingGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("hook")).mapN(avias.codedeploy.models.AutoScalingGroup.apply _)
  }
  final implicit val ListDeploymentsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("deployments"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListDeploymentsOutput.apply _)
  }
  final implicit val RevisionInfoDecoder: io.circe.Decoder[avias.codedeploy.models.RevisionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codedeploy.models.RevisionLocation]]("revisionLocation"), o.get[scala.Option[avias.codedeploy.models.GenericRevisionInfo]]("genericRevisionInfo")).mapN(avias.codedeploy.models.RevisionInfo.apply _)
  }
  final implicit val DeploymentDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentDoesNotExistException)
  final implicit val ListOnPremisesInstancesInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registrationStatus"), o.get[scala.Option[scala.List[avias.codedeploy.models.TagFilter]]]("tagFilters"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListOnPremisesInstancesInput.apply _)
  }
  final implicit val CreateApplicationInputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateApplicationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("applicationName").map(avias.codedeploy.models.CreateApplicationInput.apply _)
  }
  final implicit val InvalidTimeRangeExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidTimeRangeException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidTimeRangeException)
  final implicit val InstanceInfoDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("iamSessionArn"), o.get[scala.Option[java.time.Instant]]("registerTime"), o.get[scala.Option[java.time.Instant]]("deregisterTime"), o.get[scala.Option[java.lang.String]]("instanceArn"), o.get[scala.Option[java.lang.String]]("instanceName"), o.get[scala.Option[scala.List[avias.codedeploy.models.Tag]]]("tags"), o.get[scala.Option[java.lang.String]]("iamUserArn")).mapN(avias.codedeploy.models.InstanceInfo.apply _)
  }
  final implicit val InvalidTargetInstancesExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidTargetInstancesException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidTargetInstancesException)
  final implicit val BucketNameFilterRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.BucketNameFilterRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.BucketNameFilterRequiredException)
  final implicit val BatchGetApplicationRevisionsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetApplicationRevisionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[java.lang.String]]("errorMessage"), o.get[scala.Option[scala.List[avias.codedeploy.models.RevisionInfo]]]("revisions")).mapN(avias.codedeploy.models.BatchGetApplicationRevisionsOutput.apply _)
  }
  final implicit val CreateDeploymentConfigOutputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateDeploymentConfigOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentConfigId").map(avias.codedeploy.models.CreateDeploymentConfigOutput.apply _)
  }
  final implicit val CreateDeploymentGroupInputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("serviceRoleArn"), o.get[java.lang.String]("deploymentGroupName"), o.get[scala.Option[scala.List[avias.codedeploy.models.TriggerConfig]]]("triggerConfigurations"), o.get[scala.Option[avias.codedeploy.models.OnPremisesTagSet]]("onPremisesTagSet"), o.get[scala.Option[avias.codedeploy.models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"), o.get[scala.Option[scala.List[avias.codedeploy.models.EC2TagFilter]]]("ec2TagFilters"), o.get[scala.Option[avias.codedeploy.models.AlarmConfiguration]]("alarmConfiguration"), o.get[scala.Option[scala.List[avias.codedeploy.models.TagFilter]]]("onPremisesInstanceTagFilters"), o.get[scala.Option[avias.codedeploy.models.EC2TagSet]]("ec2TagSet"), o.get[scala.Option[avias.codedeploy.models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[avias.codedeploy.models.LoadBalancerInfo]]("loadBalancerInfo"), o.get[scala.Option[avias.codedeploy.models.DeploymentStyle]]("deploymentStyle")).mapN(avias.codedeploy.models.CreateDeploymentGroupInput.apply _)
  }
  final implicit val InvalidTriggerConfigExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidTriggerConfigException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidTriggerConfigException)
  final implicit val DeleteApplicationInputDecoder: io.circe.Decoder[avias.codedeploy.models.DeleteApplicationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("applicationName").map(avias.codedeploy.models.DeleteApplicationInput.apply _)
  }
  final implicit val GetDeploymentInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deploymentId").map(avias.codedeploy.models.GetDeploymentInput.apply _)
  }
  final implicit val OnPremisesTagSetDecoder: io.circe.Decoder[avias.codedeploy.models.OnPremisesTagSet] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[scala.List[avias.codedeploy.models.TagFilter]]]]("onPremisesTagSetList").map(avias.codedeploy.models.OnPremisesTagSet.apply _)
  }
  final implicit val DeploymentNotStartedExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentNotStartedException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentNotStartedException)
  final implicit val AlarmsLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.AlarmsLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.AlarmsLimitExceededException)
  final implicit val DeploymentGroupAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentGroupAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentGroupAlreadyExistsException)
  final implicit val CreateApplicationOutputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateApplicationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("applicationId").map(avias.codedeploy.models.CreateApplicationOutput.apply _)
  }
  final implicit val InvalidRevisionExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidRevisionException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidRevisionException)
  final implicit val InstanceSummaryDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("instanceId"), o.get[scala.Option[scala.List[avias.codedeploy.models.LifecycleEvent]]]("lifecycleEvents"), o.get[scala.Option[java.time.Instant]]("lastUpdatedAt"), o.get[scala.Option[java.lang.String]]("deploymentId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("instanceType")).mapN(avias.codedeploy.models.InstanceSummary.apply _)
  }
  final implicit val StopDeploymentOutputDecoder: io.circe.Decoder[avias.codedeploy.models.StopDeploymentOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("statusMessage")).mapN(avias.codedeploy.models.StopDeploymentOutput.apply _)
  }
  final implicit val GetDeploymentInstanceOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentInstanceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codedeploy.models.InstanceSummary]]("instanceSummary").map(avias.codedeploy.models.GetDeploymentInstanceOutput.apply _)
  }
  final implicit val ListDeploymentInstancesInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.List[java.lang.String]]]("instanceStatusFilter"), o.get[scala.Option[scala.List[java.lang.String]]]("instanceTypeFilter")).mapN(avias.codedeploy.models.ListDeploymentInstancesInput.apply _)
  }
  final implicit val GitHubLocationDecoder: io.circe.Decoder[avias.codedeploy.models.GitHubLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repository"), o.get[scala.Option[java.lang.String]]("commitId")).mapN(avias.codedeploy.models.GitHubLocation.apply _)
  }
  final implicit val ELBInfoDecoder: io.circe.Decoder[avias.codedeploy.models.ELBInfo] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(avias.codedeploy.models.ELBInfo.apply _)
  }
  final implicit val IamArnRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.IamArnRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.IamArnRequiredException)
  final implicit val InvalidDeploymentInstanceTypeExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeploymentInstanceTypeException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeploymentInstanceTypeException)
  final implicit val InvalidOperationExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidOperationException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidOperationException)
  final implicit val GetDeploymentGroupInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("deploymentGroupName")).mapN(avias.codedeploy.models.GetDeploymentGroupInput.apply _)
  }
  final implicit val DeploymentOverviewDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentOverview] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("Pending"), o.get[scala.Option[scala.Long]]("Skipped"), o.get[scala.Option[scala.Long]]("Succeeded"), o.get[scala.Option[scala.Long]]("Ready"), o.get[scala.Option[scala.Long]]("InProgress"), o.get[scala.Option[scala.Long]]("Failed")).mapN(avias.codedeploy.models.DeploymentOverview.apply _)
  }
  final implicit val InvalidTagFilterExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidTagFilterException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidTagFilterException)
  final implicit val BlueGreenDeploymentConfigurationDecoder: io.circe.Decoder[avias.codedeploy.models.BlueGreenDeploymentConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codedeploy.models.BlueInstanceTerminationOption]]("terminateBlueInstancesOnDeploymentSuccess"), o.get[scala.Option[avias.codedeploy.models.DeploymentReadyOption]]("deploymentReadyOption"), o.get[scala.Option[avias.codedeploy.models.GreenFleetProvisioningOption]]("greenFleetProvisioningOption")).mapN(avias.codedeploy.models.BlueGreenDeploymentConfiguration.apply _)
  }
  final implicit val GetApplicationInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetApplicationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("applicationName").map(avias.codedeploy.models.GetApplicationInput.apply _)
  }
  final implicit val DeploymentAlreadyCompletedExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentAlreadyCompletedException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentAlreadyCompletedException)
  final implicit val InvalidLoadBalancerInfoExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidLoadBalancerInfoException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidLoadBalancerInfoException)
  final implicit val BatchGetDeploymentGroupsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetDeploymentGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codedeploy.models.DeploymentGroupInfo]]]("deploymentGroupsInfo"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(avias.codedeploy.models.BatchGetDeploymentGroupsOutput.apply _)
  }
  final implicit val CreateDeploymentGroupOutputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentGroupId").map(avias.codedeploy.models.CreateDeploymentGroupOutput.apply _)
  }
  final implicit val BlueInstanceTerminationOptionDecoder: io.circe.Decoder[avias.codedeploy.models.BlueInstanceTerminationOption] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("action"), o.get[scala.Option[scala.Int]]("terminationWaitTimeInMinutes")).mapN(avias.codedeploy.models.BlueInstanceTerminationOption.apply _)
  }
  final implicit val InvalidAutoRollbackConfigExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidAutoRollbackConfigException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidAutoRollbackConfigException)
  final implicit val StopDeploymentInputDecoder: io.circe.Decoder[avias.codedeploy.models.StopDeploymentInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[scala.Option[scala.Boolean]]("autoRollbackEnabled")).mapN(avias.codedeploy.models.StopDeploymentInput.apply _)
  }
  final implicit val DeploymentGroupDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentGroupDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentGroupDoesNotExistException)
  final implicit val TagFilterDecoder: io.circe.Decoder[avias.codedeploy.models.TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.codedeploy.models.TagFilter.apply _)
  }
  final implicit val DeleteDeploymentGroupInputDecoder: io.circe.Decoder[avias.codedeploy.models.DeleteDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("deploymentGroupName")).mapN(avias.codedeploy.models.DeleteDeploymentGroupInput.apply _)
  }
  final implicit val InvalidRoleExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidRoleException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidRoleException)
  final implicit val ListDeploymentInstancesOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("instancesList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListDeploymentInstancesOutput.apply _)
  }
  final implicit val AddTagsToOnPremisesInstancesInputDecoder: io.circe.Decoder[avias.codedeploy.models.AddTagsToOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.codedeploy.models.Tag]]("tags"), o.get[scala.List[java.lang.String]]("instanceNames")).mapN(avias.codedeploy.models.AddTagsToOnPremisesInstancesInput.apply _)
  }
  final implicit val InvalidDeploymentConfigNameExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeploymentConfigNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeploymentConfigNameException)
  final implicit val InvalidMinimumHealthyHostValueExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidMinimumHealthyHostValueException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidMinimumHealthyHostValueException)
  final implicit val RoleRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.RoleRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.RoleRequiredException)
  final implicit val InvalidTagExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidTagException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidTagException)
  final implicit val BatchGetDeploymentInstancesInputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetDeploymentInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[scala.List[java.lang.String]]("instanceIds")).mapN(avias.codedeploy.models.BatchGetDeploymentInstancesInput.apply _)
  }
  final implicit val RegisterOnPremisesInstanceInputDecoder: io.circe.Decoder[avias.codedeploy.models.RegisterOnPremisesInstanceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("instanceName"), o.get[scala.Option[java.lang.String]]("iamSessionArn"), o.get[scala.Option[java.lang.String]]("iamUserArn")).mapN(avias.codedeploy.models.RegisterOnPremisesInstanceInput.apply _)
  }
  final implicit val InvalidDeploymentStatusExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeploymentStatusException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeploymentStatusException)
  final implicit val GetDeploymentConfigInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentConfigInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deploymentConfigName").map(avias.codedeploy.models.GetDeploymentConfigInput.apply _)
  }
  final implicit val DeploymentGroupNameRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentGroupNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentGroupNameRequiredException)
  final implicit val MultipleIamArnsProvidedExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.MultipleIamArnsProvidedException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.MultipleIamArnsProvidedException)
  final implicit val TagSetListLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.TagSetListLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.TagSetListLimitExceededException)
  final implicit val AlarmDecoder: io.circe.Decoder[avias.codedeploy.models.Alarm] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(avias.codedeploy.models.Alarm.apply _)
  }
  final implicit val ListGitHubAccountTokenNamesInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListGitHubAccountTokenNamesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.codedeploy.models.ListGitHubAccountTokenNamesInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.codedeploy.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.codedeploy.models.Tag.apply _)
  }
  final implicit val TargetInstancesDecoder: io.circe.Decoder[avias.codedeploy.models.TargetInstances] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codedeploy.models.EC2TagFilter]]]("tagFilters"), o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[avias.codedeploy.models.EC2TagSet]]("ec2TagSet")).mapN(avias.codedeploy.models.TargetInstances.apply _)
  }
  final implicit val GenericRevisionInfoDecoder: io.circe.Decoder[avias.codedeploy.models.GenericRevisionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[java.lang.String]]]("deploymentGroups"), o.get[scala.Option[java.time.Instant]]("firstUsedTime"), o.get[scala.Option[java.time.Instant]]("lastUsedTime"), o.get[scala.Option[java.time.Instant]]("registerTime")).mapN(avias.codedeploy.models.GenericRevisionInfo.apply _)
  }
  final implicit val BatchGetDeploymentGroupsInputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetDeploymentGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.List[java.lang.String]]("deploymentGroupNames")).mapN(avias.codedeploy.models.BatchGetDeploymentGroupsInput.apply _)
  }
  final implicit val InvalidAutoScalingGroupExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidAutoScalingGroupException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidAutoScalingGroupException)
  final implicit val DeploymentConfigLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentConfigLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentConfigLimitExceededException)
  final implicit val UpdateDeploymentGroupOutputDecoder: io.circe.Decoder[avias.codedeploy.models.UpdateDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codedeploy.models.AutoScalingGroup]]]("hooksNotCleanedUp").map(avias.codedeploy.models.UpdateDeploymentGroupOutput.apply _)
  }
  final implicit val InvalidDeployedStateFilterExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeployedStateFilterException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeployedStateFilterException)
  final implicit val DeploymentConfigInfoDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentConfigInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("deploymentConfigId"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[avias.codedeploy.models.MinimumHealthyHosts]]("minimumHealthyHosts"), o.get[scala.Option[java.time.Instant]]("createTime")).mapN(avias.codedeploy.models.DeploymentConfigInfo.apply _)
  }
  final implicit val IamSessionArnAlreadyRegisteredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.IamSessionArnAlreadyRegisteredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.IamSessionArnAlreadyRegisteredException)
  final implicit val DeploymentConfigInUseExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentConfigInUseException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentConfigInUseException)
  final implicit val IamUserArnRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.IamUserArnRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.IamUserArnRequiredException)
  final implicit val BatchLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.BatchLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.BatchLimitExceededException)
  final implicit val InvalidSortOrderExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidSortOrderException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidSortOrderException)
  final implicit val TagLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.TagLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.TagLimitExceededException)
  final implicit val UpdateDeploymentGroupInputDecoder: io.circe.Decoder[avias.codedeploy.models.UpdateDeploymentGroupInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[java.lang.String]("currentDeploymentGroupName"), o.get[scala.Option[scala.List[avias.codedeploy.models.TriggerConfig]]]("triggerConfigurations"), o.get[scala.Option[avias.codedeploy.models.OnPremisesTagSet]]("onPremisesTagSet"), o.get[scala.Option[avias.codedeploy.models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"), o.get[scala.Option[scala.List[avias.codedeploy.models.EC2TagFilter]]]("ec2TagFilters"), o.get[scala.Option[avias.codedeploy.models.AlarmConfiguration]]("alarmConfiguration"), o.get[scala.Option[scala.List[avias.codedeploy.models.TagFilter]]]("onPremisesInstanceTagFilters"), o.get[scala.Option[java.lang.String]]("serviceRoleArn"), o.get[scala.Option[avias.codedeploy.models.EC2TagSet]]("ec2TagSet"), o.get[scala.Option[avias.codedeploy.models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[java.lang.String]]("newDeploymentGroupName"), o.get[scala.Option[avias.codedeploy.models.LoadBalancerInfo]]("loadBalancerInfo"), o.get[scala.Option[avias.codedeploy.models.DeploymentStyle]]("deploymentStyle")).mapN(avias.codedeploy.models.UpdateDeploymentGroupInput.apply _)
  }
  final implicit val DiagnosticsDecoder: io.circe.Decoder[avias.codedeploy.models.Diagnostics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("errorCode"), o.get[scala.Option[java.lang.String]]("scriptName"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("logTail")).mapN(avias.codedeploy.models.Diagnostics.apply _)
  }
  final implicit val IamUserArnAlreadyRegisteredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.IamUserArnAlreadyRegisteredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.IamUserArnAlreadyRegisteredException)
  final implicit val RevisionDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.RevisionDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.RevisionDoesNotExistException)
  final implicit val EC2TagFilterDecoder: io.circe.Decoder[avias.codedeploy.models.EC2TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.codedeploy.models.EC2TagFilter.apply _)
  }
  final implicit val InstanceDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InstanceDoesNotExistException)
  final implicit val GetApplicationOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetApplicationOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codedeploy.models.ApplicationInfo]]("application").map(avias.codedeploy.models.GetApplicationOutput.apply _)
  }
  final implicit val InvalidSortByExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidSortByException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidSortByException)
  final implicit val TagRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.TagRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.TagRequiredException)
  final implicit val TriggerTargetsLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.TriggerTargetsLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.TriggerTargetsLimitExceededException)
  final implicit val InvalidInstanceStatusExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidInstanceStatusException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidInstanceStatusException)
  final implicit val RevisionRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.RevisionRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.RevisionRequiredException)
  final implicit val ListDeploymentConfigsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentConfigsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("deploymentConfigsList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListDeploymentConfigsOutput.apply _)
  }
  final implicit val ListDeploymentsInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[scala.List[java.lang.String]]]("includeOnlyStatuses"), o.get[scala.Option[java.lang.String]]("deploymentGroupName"), o.get[scala.Option[avias.codedeploy.models.TimeRange]]("createTimeRange"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListDeploymentsInput.apply _)
  }
  final implicit val GetDeploymentGroupOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentGroupOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codedeploy.models.DeploymentGroupInfo]]("deploymentGroupInfo").map(avias.codedeploy.models.GetDeploymentGroupOutput.apply _)
  }
  final implicit val ApplicationLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.ApplicationLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.ApplicationLimitExceededException)
  final implicit val ListOnPremisesInstancesOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListOnPremisesInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("instanceNames"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListOnPremisesInstancesOutput.apply _)
  }
  final implicit val ListApplicationRevisionsInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListApplicationRevisionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.Option[java.lang.String]]("deployed"), o.get[scala.Option[java.lang.String]]("s3KeyPrefix"), o.get[scala.Option[java.lang.String]]("sortOrder"), o.get[scala.Option[java.lang.String]]("sortBy"), o.get[scala.Option[java.lang.String]]("s3Bucket"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListApplicationRevisionsInput.apply _)
  }
  final implicit val BatchGetApplicationsInputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetApplicationsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("applicationNames").map(avias.codedeploy.models.BatchGetApplicationsInput.apply _)
  }
  final implicit val BatchGetApplicationRevisionsInputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetApplicationRevisionsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.List[avias.codedeploy.models.RevisionLocation]]("revisions")).mapN(avias.codedeploy.models.BatchGetApplicationRevisionsInput.apply _)
  }
  final implicit val InstanceNameRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InstanceNameRequiredException)
  final implicit val DeploymentConfigAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentConfigAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentConfigAlreadyExistsException)
  final implicit val InstanceLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InstanceLimitExceededException)
  final implicit val RollbackInfoDecoder: io.circe.Decoder[avias.codedeploy.models.RollbackInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("rollbackDeploymentId"), o.get[scala.Option[java.lang.String]]("rollbackTriggeringDeploymentId"), o.get[scala.Option[java.lang.String]]("rollbackMessage")).mapN(avias.codedeploy.models.RollbackInfo.apply _)
  }
  final implicit val DeploymentLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentLimitExceededException)
  final implicit val DeploymentInfoDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentInfo] = io.circe.Decoder.instance { o => 
    for (`status` <- o.get[scala.Option[java.lang.String]]("status"); `createTime` <- o.get[scala.Option[java.time.Instant]]("createTime"); `startTime` <- o.get[scala.Option[java.time.Instant]]("startTime"); `completeTime` <- o.get[scala.Option[java.time.Instant]]("completeTime"); `deploymentId` <- o.get[scala.Option[java.lang.String]]("deploymentId"); `deploymentOverview` <- o.get[scala.Option[avias.codedeploy.models.DeploymentOverview]]("deploymentOverview"); `blueGreenDeploymentConfiguration` <- o.get[scala.Option[avias.codedeploy.models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"); `applicationName` <- o.get[scala.Option[java.lang.String]]("applicationName"); `additionalDeploymentStatusInfo` <- o.get[scala.Option[java.lang.String]]("additionalDeploymentStatusInfo"); `targetInstances` <- o.get[scala.Option[avias.codedeploy.models.TargetInstances]]("targetInstances"); `fileExistsBehavior` <- o.get[scala.Option[java.lang.String]]("fileExistsBehavior"); `rollbackInfo` <- o.get[scala.Option[avias.codedeploy.models.RollbackInfo]]("rollbackInfo"); `description` <- o.get[scala.Option[java.lang.String]]("description"); `autoRollbackConfiguration` <- o.get[scala.Option[avias.codedeploy.models.AutoRollbackConfiguration]]("autoRollbackConfiguration"); `deploymentConfigName` <- o.get[scala.Option[java.lang.String]]("deploymentConfigName"); `deploymentGroupName` <- o.get[scala.Option[java.lang.String]]("deploymentGroupName"); `loadBalancerInfo` <- o.get[scala.Option[avias.codedeploy.models.LoadBalancerInfo]]("loadBalancerInfo"); `errorInformation` <- o.get[scala.Option[avias.codedeploy.models.ErrorInformation]]("errorInformation"); `ignoreApplicationStopFailures` <- o.get[scala.Option[scala.Boolean]]("ignoreApplicationStopFailures"); `updateOutdatedInstancesOnly` <- o.get[scala.Option[scala.Boolean]]("updateOutdatedInstancesOnly"); `instanceTerminationWaitTimeStarted` <- o.get[scala.Option[scala.Boolean]]("instanceTerminationWaitTimeStarted"); `creator` <- o.get[scala.Option[java.lang.String]]("creator"); `deploymentStyle` <- o.get[scala.Option[avias.codedeploy.models.DeploymentStyle]]("deploymentStyle"); `previousRevision` <- o.get[scala.Option[avias.codedeploy.models.RevisionLocation]]("previousRevision"); `revision` <- o.get[scala.Option[avias.codedeploy.models.RevisionLocation]]("revision")) yield avias.codedeploy.models.DeploymentInfo(status, createTime, startTime, completeTime, deploymentId, deploymentOverview, blueGreenDeploymentConfiguration, applicationName, additionalDeploymentStatusInfo, targetInstances, fileExistsBehavior, rollbackInfo, description, autoRollbackConfiguration, deploymentConfigName, deploymentGroupName, loadBalancerInfo, errorInformation, ignoreApplicationStopFailures, updateOutdatedInstancesOnly, instanceTerminationWaitTimeStarted, creator, deploymentStyle, previousRevision, revision)
  }
  final implicit val GetOnPremisesInstanceOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetOnPremisesInstanceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codedeploy.models.InstanceInfo]]("instanceInfo").map(avias.codedeploy.models.GetOnPremisesInstanceOutput.apply _)
  }
  final implicit val ListApplicationRevisionsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListApplicationRevisionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codedeploy.models.RevisionLocation]]]("revisions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListApplicationRevisionsOutput.apply _)
  }
  final implicit val ListDeploymentConfigsInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentConfigsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.codedeploy.models.ListDeploymentConfigsInput.apply _)
  }
  final implicit val TargetGroupInfoDecoder: io.circe.Decoder[avias.codedeploy.models.TargetGroupInfo] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("name").map(avias.codedeploy.models.TargetGroupInfo.apply _)
  }
  final implicit val UnsupportedActionForDeploymentTypeExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.UnsupportedActionForDeploymentTypeException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.UnsupportedActionForDeploymentTypeException)
  final implicit val InvalidFileExistsBehaviorExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidFileExistsBehaviorException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidFileExistsBehaviorException)
  final implicit val SkipWaitTimeForInstanceTerminationInputDecoder: io.circe.Decoder[avias.codedeploy.models.SkipWaitTimeForInstanceTerminationInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentId").map(avias.codedeploy.models.SkipWaitTimeForInstanceTerminationInput.apply _)
  }
  final implicit val GetDeploymentInstanceInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentInstanceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentId"), o.get[java.lang.String]("instanceId")).mapN(avias.codedeploy.models.GetDeploymentInstanceInput.apply _)
  }
  final implicit val S3LocationDecoder: io.circe.Decoder[avias.codedeploy.models.S3Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("key"), o.get[scala.Option[java.lang.String]]("bundleType"), o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.lang.String]]("eTag"), o.get[scala.Option[java.lang.String]]("bucket")).mapN(avias.codedeploy.models.S3Location.apply _)
  }
  final implicit val InvalidBucketNameFilterExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidBucketNameFilterException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidBucketNameFilterException)
  final implicit val DeploymentConfigNameRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentConfigNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentConfigNameRequiredException)
  final implicit val AlarmConfigurationDecoder: io.circe.Decoder[avias.codedeploy.models.AlarmConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[scala.Boolean]]("ignorePollAlarmFailure"), o.get[scala.Option[scala.List[avias.codedeploy.models.Alarm]]]("alarms")).mapN(avias.codedeploy.models.AlarmConfiguration.apply _)
  }
  final implicit val DeploymentIsNotInReadyStateExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentIsNotInReadyStateException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentIsNotInReadyStateException)
  final implicit val InvalidEC2TagExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidEC2TagException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidEC2TagException)
  final implicit val ResourceValidationExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.ResourceValidationException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.ResourceValidationException)
  final implicit val InvalidOnPremisesTagCombinationExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidOnPremisesTagCombinationException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidOnPremisesTagCombinationException)
  final implicit val TriggerConfigDecoder: io.circe.Decoder[avias.codedeploy.models.TriggerConfig] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("triggerName"), o.get[scala.Option[java.lang.String]]("triggerTargetArn"), o.get[scala.Option[scala.List[java.lang.String]]]("triggerEvents")).mapN(avias.codedeploy.models.TriggerConfig.apply _)
  }
  final implicit val InvalidApplicationNameExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidApplicationNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidApplicationNameException)
  final implicit val EC2TagSetDecoder: io.circe.Decoder[avias.codedeploy.models.EC2TagSet] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[scala.List[avias.codedeploy.models.EC2TagFilter]]]]("ec2TagSetList").map(avias.codedeploy.models.EC2TagSet.apply _)
  }
  final implicit val InvalidKeyPrefixFilterExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidKeyPrefixFilterException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidKeyPrefixFilterException)
  final implicit val AutoRollbackConfigurationDecoder: io.circe.Decoder[avias.codedeploy.models.AutoRollbackConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("enabled"), o.get[scala.Option[scala.List[java.lang.String]]]("events")).mapN(avias.codedeploy.models.AutoRollbackConfiguration.apply _)
  }
  final implicit val BatchGetDeploymentsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetDeploymentsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codedeploy.models.DeploymentInfo]]]("deploymentsInfo").map(avias.codedeploy.models.BatchGetDeploymentsOutput.apply _)
  }
  final implicit val BatchGetApplicationsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetApplicationsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codedeploy.models.ApplicationInfo]]]("applicationsInfo").map(avias.codedeploy.models.BatchGetApplicationsOutput.apply _)
  }
  final implicit val InvalidRegistrationStatusExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidRegistrationStatusException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidRegistrationStatusException)
  final implicit val RegisterApplicationRevisionInputDecoder: io.circe.Decoder[avias.codedeploy.models.RegisterApplicationRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[avias.codedeploy.models.RevisionLocation]("revision"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.codedeploy.models.RegisterApplicationRevisionInput.apply _)
  }
  final implicit val ListApplicationsInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListApplicationsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.codedeploy.models.ListApplicationsInput.apply _)
  }
  final implicit val CreateDeploymentOutputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateDeploymentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentId").map(avias.codedeploy.models.CreateDeploymentOutput.apply _)
  }
  final implicit val GetApplicationRevisionOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetApplicationRevisionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[avias.codedeploy.models.RevisionLocation]]("revision"), o.get[scala.Option[avias.codedeploy.models.GenericRevisionInfo]]("revisionInfo")).mapN(avias.codedeploy.models.GetApplicationRevisionOutput.apply _)
  }
  final implicit val InvalidDeploymentIdExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeploymentIdException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeploymentIdException)
  final implicit val InvalidEC2TagCombinationExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidEC2TagCombinationException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidEC2TagCombinationException)
  final implicit val ApplicationInfoDecoder: io.circe.Decoder[avias.codedeploy.models.ApplicationInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("createTime"), o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[java.lang.String]]("applicationId"), o.get[scala.Option[java.lang.String]]("gitHubAccountName"), o.get[scala.Option[scala.Boolean]]("linkedToGitHub")).mapN(avias.codedeploy.models.ApplicationInfo.apply _)
  }
  final implicit val InvalidAlarmConfigExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidAlarmConfigException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidAlarmConfigException)
  final implicit val ListGitHubAccountTokenNamesOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListGitHubAccountTokenNamesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("tokenNameList"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListGitHubAccountTokenNamesOutput.apply _)
  }
  final implicit val BatchGetDeploymentInstancesOutputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetDeploymentInstancesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codedeploy.models.InstanceSummary]]]("instancesSummary"), o.get[scala.Option[java.lang.String]]("errorMessage")).mapN(avias.codedeploy.models.BatchGetDeploymentInstancesOutput.apply _)
  }
  final implicit val ContinueDeploymentInputDecoder: io.circe.Decoder[avias.codedeploy.models.ContinueDeploymentInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deploymentId").map(avias.codedeploy.models.ContinueDeploymentInput.apply _)
  }
  final implicit val ListDeploymentGroupsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentGroupsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[scala.List[java.lang.String]]]("deploymentGroups"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListDeploymentGroupsOutput.apply _)
  }
  final implicit val InvalidIamUserArnExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidIamUserArnException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidIamUserArnException)
  final implicit val ApplicationNameRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.ApplicationNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.ApplicationNameRequiredException)
  final implicit val DeploymentGroupInfoDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentGroupInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codedeploy.models.TriggerConfig]]]("triggerConfigurations"), o.get[scala.Option[avias.codedeploy.models.OnPremisesTagSet]]("onPremisesTagSet"), o.get[scala.Option[avias.codedeploy.models.BlueGreenDeploymentConfiguration]]("blueGreenDeploymentConfiguration"), o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[scala.List[avias.codedeploy.models.EC2TagFilter]]]("ec2TagFilters"), o.get[scala.Option[avias.codedeploy.models.AlarmConfiguration]]("alarmConfiguration"), o.get[scala.Option[scala.List[avias.codedeploy.models.TagFilter]]]("onPremisesInstanceTagFilters"), o.get[scala.Option[java.lang.String]]("serviceRoleArn"), o.get[scala.Option[avias.codedeploy.models.EC2TagSet]]("ec2TagSet"), o.get[scala.Option[avias.codedeploy.models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[java.lang.String]]("deploymentGroupName"), o.get[scala.Option[avias.codedeploy.models.LoadBalancerInfo]]("loadBalancerInfo"), o.get[scala.Option[java.lang.String]]("deploymentGroupId"), o.get[scala.Option[scala.List[avias.codedeploy.models.AutoScalingGroup]]]("autoScalingGroups"), o.get[scala.Option[avias.codedeploy.models.DeploymentStyle]]("deploymentStyle"), o.get[scala.Option[avias.codedeploy.models.RevisionLocation]]("targetRevision"), o.get[scala.Option[avias.codedeploy.models.LastDeploymentInfo]]("lastSuccessfulDeployment"), o.get[scala.Option[avias.codedeploy.models.LastDeploymentInfo]]("lastAttemptedDeployment")).mapN(avias.codedeploy.models.DeploymentGroupInfo.apply _)
  }
  final implicit val BatchGetDeploymentsInputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetDeploymentsInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("deploymentIds").map(avias.codedeploy.models.BatchGetDeploymentsInput.apply _)
  }
  final implicit val LoadBalancerInfoDecoder: io.circe.Decoder[avias.codedeploy.models.LoadBalancerInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codedeploy.models.ELBInfo]]]("elbInfoList"), o.get[scala.Option[scala.List[avias.codedeploy.models.TargetGroupInfo]]]("targetGroupInfoList")).mapN(avias.codedeploy.models.LoadBalancerInfo.apply _)
  }
  final implicit val DeploymentConfigDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentConfigDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentConfigDoesNotExistException)
  final implicit val InvalidDeploymentStyleExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeploymentStyleException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeploymentStyleException)
  final implicit val ApplicationAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.ApplicationAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.ApplicationAlreadyExistsException)
  final implicit val LifecycleHookLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.LifecycleHookLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.LifecycleHookLimitExceededException)
  final implicit val GetOnPremisesInstanceInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetOnPremisesInstanceInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(avias.codedeploy.models.GetOnPremisesInstanceInput.apply _)
  }
  final implicit val ErrorInformationDecoder: io.circe.Decoder[avias.codedeploy.models.ErrorInformation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("message")).mapN(avias.codedeploy.models.ErrorInformation.apply _)
  }
  final implicit val InstanceNameAlreadyRegisteredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceNameAlreadyRegisteredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InstanceNameAlreadyRegisteredException)
  final implicit val GreenFleetProvisioningOptionDecoder: io.circe.Decoder[avias.codedeploy.models.GreenFleetProvisioningOption] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("action").map(avias.codedeploy.models.GreenFleetProvisioningOption.apply _)
  }
  final implicit val BatchGetOnPremisesInstancesInputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("instanceNames").map(avias.codedeploy.models.BatchGetOnPremisesInstancesInput.apply _)
  }
  final implicit val ListDeploymentGroupsInputDecoder: io.circe.Decoder[avias.codedeploy.models.ListDeploymentGroupsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListDeploymentGroupsInput.apply _)
  }
  final implicit val CreateDeploymentInputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateDeploymentInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[scala.Option[avias.codedeploy.models.TargetInstances]]("targetInstances"), o.get[scala.Option[java.lang.String]]("fileExistsBehavior"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[avias.codedeploy.models.AutoRollbackConfiguration]]("autoRollbackConfiguration"), o.get[scala.Option[java.lang.String]]("deploymentConfigName"), o.get[scala.Option[java.lang.String]]("deploymentGroupName"), o.get[scala.Option[scala.Boolean]]("ignoreApplicationStopFailures"), o.get[scala.Option[scala.Boolean]]("updateOutdatedInstancesOnly"), o.get[scala.Option[avias.codedeploy.models.RevisionLocation]]("revision")).mapN(avias.codedeploy.models.CreateDeploymentInput.apply _)
  }
  final implicit val CreateDeploymentConfigInputDecoder: io.circe.Decoder[avias.codedeploy.models.CreateDeploymentConfigInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("deploymentConfigName"), o.get[avias.codedeploy.models.MinimumHealthyHosts]("minimumHealthyHosts")).mapN(avias.codedeploy.models.CreateDeploymentConfigInput.apply _)
  }
  final implicit val DeploymentIdRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentIdRequiredException)
  final implicit val DeploymentStyleDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentStyle] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("deploymentType"), o.get[scala.Option[java.lang.String]]("deploymentOption")).mapN(avias.codedeploy.models.DeploymentStyle.apply _)
  }
  final implicit val InvalidBlueGreenDeploymentConfigurationExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidBlueGreenDeploymentConfigurationException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidBlueGreenDeploymentConfigurationException)
  final implicit val TimeRangeDecoder: io.circe.Decoder[avias.codedeploy.models.TimeRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("start"), o.get[scala.Option[java.time.Instant]]("end")).mapN(avias.codedeploy.models.TimeRange.apply _)
  }
  final implicit val DeploymentGroupLimitExceededExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentGroupLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DeploymentGroupLimitExceededException)
  final implicit val InvalidInstanceTypeExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidInstanceTypeException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidInstanceTypeException)
  final implicit val RevisionLocationDecoder: io.circe.Decoder[avias.codedeploy.models.RevisionLocation] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("revisionType"), o.get[scala.Option[avias.codedeploy.models.S3Location]]("s3Location"), o.get[scala.Option[avias.codedeploy.models.GitHubLocation]]("gitHubLocation")).mapN(avias.codedeploy.models.RevisionLocation.apply _)
  }
  final implicit val LastDeploymentInfoDecoder: io.circe.Decoder[avias.codedeploy.models.LastDeploymentInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("deploymentId"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.time.Instant]]("createTime")).mapN(avias.codedeploy.models.LastDeploymentInfo.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidNextTokenException)
  final implicit val GitHubAccountTokenDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.GitHubAccountTokenDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.GitHubAccountTokenDoesNotExistException)
  final implicit val DeregisterOnPremisesInstanceInputDecoder: io.circe.Decoder[avias.codedeploy.models.DeregisterOnPremisesInstanceInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("instanceName").map(avias.codedeploy.models.DeregisterOnPremisesInstanceInput.apply _)
  }
  final implicit val GetApplicationRevisionInputDecoder: io.circe.Decoder[avias.codedeploy.models.GetApplicationRevisionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("applicationName"), o.get[avias.codedeploy.models.RevisionLocation]("revision")).mapN(avias.codedeploy.models.GetApplicationRevisionInput.apply _)
  }
  final implicit val UpdateApplicationInputDecoder: io.circe.Decoder[avias.codedeploy.models.UpdateApplicationInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("applicationName"), o.get[scala.Option[java.lang.String]]("newApplicationName")).mapN(avias.codedeploy.models.UpdateApplicationInput.apply _)
  }
  final implicit val ApplicationDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.ApplicationDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.ApplicationDoesNotExistException)
  final implicit val DescriptionTooLongExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.DescriptionTooLongException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.DescriptionTooLongException)
  final implicit val MinimumHealthyHostsDecoder: io.circe.Decoder[avias.codedeploy.models.MinimumHealthyHosts] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("value"), o.get[scala.Option[java.lang.String]]("type")).mapN(avias.codedeploy.models.MinimumHealthyHosts.apply _)
  }
  final implicit val ListApplicationsOutputDecoder: io.circe.Decoder[avias.codedeploy.models.ListApplicationsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("applications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codedeploy.models.ListApplicationsOutput.apply _)
  }
  final implicit val GetDeploymentOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codedeploy.models.DeploymentInfo]]("deploymentInfo").map(avias.codedeploy.models.GetDeploymentOutput.apply _)
  }
  final implicit val InstanceIdRequiredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InstanceIdRequiredException)
  final implicit val RemoveTagsFromOnPremisesInstancesInputDecoder: io.circe.Decoder[avias.codedeploy.models.RemoveTagsFromOnPremisesInstancesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.codedeploy.models.Tag]]("tags"), o.get[scala.List[java.lang.String]]("instanceNames")).mapN(avias.codedeploy.models.RemoveTagsFromOnPremisesInstancesInput.apply _)
  }
  final implicit val InvalidIamSessionArnExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidIamSessionArnException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidIamSessionArnException)
  final implicit val GetDeploymentConfigOutputDecoder: io.circe.Decoder[avias.codedeploy.models.GetDeploymentConfigOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codedeploy.models.DeploymentConfigInfo]]("deploymentConfigInfo").map(avias.codedeploy.models.GetDeploymentConfigOutput.apply _)
  }
  final implicit val BatchGetOnPremisesInstancesOutputDecoder: io.circe.Decoder[avias.codedeploy.models.BatchGetOnPremisesInstancesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.codedeploy.models.InstanceInfo]]]("instanceInfos").map(avias.codedeploy.models.BatchGetOnPremisesInstancesOutput.apply _)
  }
  final implicit val InvalidDeploymentGroupNameExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InvalidDeploymentGroupNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InvalidDeploymentGroupNameException)
  final implicit val LifecycleEventDecoder: io.circe.Decoder[avias.codedeploy.models.LifecycleEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lifecycleEventName"), o.get[scala.Option[avias.codedeploy.models.Diagnostics]]("diagnostics"), o.get[scala.Option[java.time.Instant]]("startTime"), o.get[scala.Option[java.time.Instant]]("endTime"), o.get[scala.Option[java.lang.String]]("status")).mapN(avias.codedeploy.models.LifecycleEvent.apply _)
  }
  final implicit val DeploymentReadyOptionDecoder: io.circe.Decoder[avias.codedeploy.models.DeploymentReadyOption] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("actionOnTimeout"), o.get[scala.Option[scala.Int]]("waitTimeInMinutes")).mapN(avias.codedeploy.models.DeploymentReadyOption.apply _)
  }
  final implicit val DeleteDeploymentConfigInputDecoder: io.circe.Decoder[avias.codedeploy.models.DeleteDeploymentConfigInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deploymentConfigName").map(avias.codedeploy.models.DeleteDeploymentConfigInput.apply _)
  }
  final implicit val InstanceNotRegisteredExceptionDecoder: io.circe.Decoder[avias.codedeploy.models.InstanceNotRegisteredException.type] = io.circe.Decoder.decodeUnit.as(avias.codedeploy.models.InstanceNotRegisteredException)
}