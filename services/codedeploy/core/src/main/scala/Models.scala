package org.lyranthe.araethura.codedeploy.models
case object InvalidInstanceNameException
final case class DeleteDeploymentGroupOutput(hooksNotCleanedUp: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.AutoScalingGroup]] = scala.None)
final case class AutoScalingGroup(name: scala.Option[java.lang.String] = scala.None, hook: scala.Option[java.lang.String] = scala.None)
final case class ListDeploymentsOutput(deployments: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class RevisionInfo(revisionLocation: scala.Option[org.lyranthe.araethura.codedeploy.models.RevisionLocation] = scala.None, genericRevisionInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.GenericRevisionInfo] = scala.None)
case object DeploymentDoesNotExistException
final case class ListOnPremisesInstancesInput(registrationStatus: scala.Option[java.lang.String] = scala.None, tagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TagFilter]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateApplicationInput(applicationName: java.lang.String)
case object InvalidTimeRangeException
final case class InstanceInfo(iamSessionArn: scala.Option[java.lang.String] = scala.None, registerTime: scala.Option[java.time.Instant] = scala.None, deregisterTime: scala.Option[java.time.Instant] = scala.None, instanceArn: scala.Option[java.lang.String] = scala.None, instanceName: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.Tag]] = scala.None, iamUserArn: scala.Option[java.lang.String] = scala.None)
case object InvalidTargetInstancesException
case object BucketNameFilterRequiredException
final case class BatchGetApplicationRevisionsOutput(applicationName: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None, revisions: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.RevisionInfo]] = scala.None)
final case class CreateDeploymentConfigOutput(deploymentConfigId: scala.Option[java.lang.String] = scala.None)
final case class CreateDeploymentGroupInput(applicationName: java.lang.String, serviceRoleArn: java.lang.String, deploymentGroupName: java.lang.String, triggerConfigurations: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TriggerConfig]] = scala.None, onPremisesTagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.OnPremisesTagSet] = scala.None, blueGreenDeploymentConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.BlueGreenDeploymentConfiguration] = scala.None, ec2TagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.EC2TagFilter]] = scala.None, alarmConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AlarmConfiguration] = scala.None, onPremisesInstanceTagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TagFilter]] = scala.None, ec2TagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.EC2TagSet] = scala.None, autoRollbackConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AutoRollbackConfiguration] = scala.None, deploymentConfigName: scala.Option[java.lang.String] = scala.None, autoScalingGroups: scala.Option[scala.List[java.lang.String]] = scala.None, loadBalancerInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.LoadBalancerInfo] = scala.None, deploymentStyle: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentStyle] = scala.None)
case object InvalidTriggerConfigException
final case class DeleteApplicationInput(applicationName: java.lang.String)
final case class GetDeploymentInput(deploymentId: java.lang.String)
final case class OnPremisesTagSet(onPremisesTagSetList: scala.Option[scala.List[scala.List[org.lyranthe.araethura.codedeploy.models.TagFilter]]] = scala.None)
case object DeploymentNotStartedException
case object AlarmsLimitExceededException
case object DeploymentGroupAlreadyExistsException
final case class CreateApplicationOutput(applicationId: scala.Option[java.lang.String] = scala.None)
case object InvalidRevisionException
final case class InstanceSummary(instanceId: scala.Option[java.lang.String] = scala.None, lifecycleEvents: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.LifecycleEvent]] = scala.None, lastUpdatedAt: scala.Option[java.time.Instant] = scala.None, deploymentId: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, instanceType: scala.Option[java.lang.String] = scala.None)
final case class StopDeploymentOutput(status: scala.Option[java.lang.String] = scala.None, statusMessage: scala.Option[java.lang.String] = scala.None)
final case class GetDeploymentInstanceOutput(instanceSummary: scala.Option[org.lyranthe.araethura.codedeploy.models.InstanceSummary] = scala.None)
final case class ListDeploymentInstancesInput(deploymentId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, instanceStatusFilter: scala.Option[scala.List[java.lang.String]] = scala.None, instanceTypeFilter: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class GitHubLocation(repository: scala.Option[java.lang.String] = scala.None, commitId: scala.Option[java.lang.String] = scala.None)
final case class ELBInfo(name: scala.Option[java.lang.String] = scala.None)
case object IamArnRequiredException
case object InvalidDeploymentInstanceTypeException
case object InvalidOperationException
final case class GetDeploymentGroupInput(applicationName: java.lang.String, deploymentGroupName: java.lang.String)
final case class DeploymentOverview(pending: scala.Option[scala.Long] = scala.None, skipped: scala.Option[scala.Long] = scala.None, succeeded: scala.Option[scala.Long] = scala.None, ready: scala.Option[scala.Long] = scala.None, inProgress: scala.Option[scala.Long] = scala.None, failed: scala.Option[scala.Long] = scala.None)
case object InvalidTagFilterException
final case class BlueGreenDeploymentConfiguration(terminateBlueInstancesOnDeploymentSuccess: scala.Option[org.lyranthe.araethura.codedeploy.models.BlueInstanceTerminationOption] = scala.None, deploymentReadyOption: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentReadyOption] = scala.None, greenFleetProvisioningOption: scala.Option[org.lyranthe.araethura.codedeploy.models.GreenFleetProvisioningOption] = scala.None)
final case class GetApplicationInput(applicationName: java.lang.String)
case object DeploymentAlreadyCompletedException
case object InvalidLoadBalancerInfoException
final case class BatchGetDeploymentGroupsOutput(deploymentGroupsInfo: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.DeploymentGroupInfo]] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class CreateDeploymentGroupOutput(deploymentGroupId: scala.Option[java.lang.String] = scala.None)
final case class BlueInstanceTerminationOption(action: scala.Option[java.lang.String] = scala.None, terminationWaitTimeInMinutes: scala.Option[scala.Int] = scala.None)
case object InvalidAutoRollbackConfigException
final case class StopDeploymentInput(deploymentId: java.lang.String, autoRollbackEnabled: scala.Option[scala.Boolean] = scala.None)
case object DeploymentGroupDoesNotExistException
final case class TagFilter(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class DeleteDeploymentGroupInput(applicationName: java.lang.String, deploymentGroupName: java.lang.String)
case object InvalidRoleException
final case class ListDeploymentInstancesOutput(instancesList: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class AddTagsToOnPremisesInstancesInput(tags: scala.List[org.lyranthe.araethura.codedeploy.models.Tag], instanceNames: scala.List[java.lang.String])
case object InvalidDeploymentConfigNameException
case object InvalidMinimumHealthyHostValueException
case object RoleRequiredException
case object InvalidTagException
final case class BatchGetDeploymentInstancesInput(deploymentId: java.lang.String, instanceIds: scala.List[java.lang.String])
final case class RegisterOnPremisesInstanceInput(instanceName: java.lang.String, iamSessionArn: scala.Option[java.lang.String] = scala.None, iamUserArn: scala.Option[java.lang.String] = scala.None)
case object InvalidDeploymentStatusException
final case class GetDeploymentConfigInput(deploymentConfigName: java.lang.String)
case object DeploymentGroupNameRequiredException
case object MultipleIamArnsProvidedException
case object TagSetListLimitExceededException
final case class Alarm(name: scala.Option[java.lang.String] = scala.None)
final case class ListGitHubAccountTokenNamesInput(nextToken: scala.Option[java.lang.String] = scala.None)
final case class Tag(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class TargetInstances(tagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.EC2TagFilter]] = scala.None, autoScalingGroups: scala.Option[scala.List[java.lang.String]] = scala.None, ec2TagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.EC2TagSet] = scala.None)
final case class GenericRevisionInfo(description: scala.Option[java.lang.String] = scala.None, deploymentGroups: scala.Option[scala.List[java.lang.String]] = scala.None, firstUsedTime: scala.Option[java.time.Instant] = scala.None, lastUsedTime: scala.Option[java.time.Instant] = scala.None, registerTime: scala.Option[java.time.Instant] = scala.None)
final case class BatchGetDeploymentGroupsInput(applicationName: java.lang.String, deploymentGroupNames: scala.List[java.lang.String])
case object InvalidAutoScalingGroupException
case object DeploymentConfigLimitExceededException
final case class UpdateDeploymentGroupOutput(hooksNotCleanedUp: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.AutoScalingGroup]] = scala.None)
case object InvalidDeployedStateFilterException
final case class DeploymentConfigInfo(deploymentConfigId: scala.Option[java.lang.String] = scala.None, deploymentConfigName: scala.Option[java.lang.String] = scala.None, minimumHealthyHosts: scala.Option[org.lyranthe.araethura.codedeploy.models.MinimumHealthyHosts] = scala.None, createTime: scala.Option[java.time.Instant] = scala.None)
case object IamSessionArnAlreadyRegisteredException
case object DeploymentConfigInUseException
case object IamUserArnRequiredException
case object BatchLimitExceededException
case object InvalidSortOrderException
case object TagLimitExceededException
final case class UpdateDeploymentGroupInput(applicationName: java.lang.String, currentDeploymentGroupName: java.lang.String, triggerConfigurations: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TriggerConfig]] = scala.None, onPremisesTagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.OnPremisesTagSet] = scala.None, blueGreenDeploymentConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.BlueGreenDeploymentConfiguration] = scala.None, ec2TagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.EC2TagFilter]] = scala.None, alarmConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AlarmConfiguration] = scala.None, onPremisesInstanceTagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TagFilter]] = scala.None, serviceRoleArn: scala.Option[java.lang.String] = scala.None, ec2TagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.EC2TagSet] = scala.None, autoRollbackConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AutoRollbackConfiguration] = scala.None, deploymentConfigName: scala.Option[java.lang.String] = scala.None, autoScalingGroups: scala.Option[scala.List[java.lang.String]] = scala.None, newDeploymentGroupName: scala.Option[java.lang.String] = scala.None, loadBalancerInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.LoadBalancerInfo] = scala.None, deploymentStyle: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentStyle] = scala.None)
final case class Diagnostics(errorCode: scala.Option[java.lang.String] = scala.None, scriptName: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None, logTail: scala.Option[java.lang.String] = scala.None)
case object IamUserArnAlreadyRegisteredException
case object RevisionDoesNotExistException
final case class EC2TagFilter(key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
case object InstanceDoesNotExistException
final case class GetApplicationOutput(application: scala.Option[org.lyranthe.araethura.codedeploy.models.ApplicationInfo] = scala.None)
case object InvalidSortByException
case object TagRequiredException
case object TriggerTargetsLimitExceededException
case object InvalidInstanceStatusException
case object RevisionRequiredException
final case class ListDeploymentConfigsOutput(deploymentConfigsList: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListDeploymentsInput(applicationName: scala.Option[java.lang.String] = scala.None, includeOnlyStatuses: scala.Option[scala.List[java.lang.String]] = scala.None, deploymentGroupName: scala.Option[java.lang.String] = scala.None, createTimeRange: scala.Option[org.lyranthe.araethura.codedeploy.models.TimeRange] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetDeploymentGroupOutput(deploymentGroupInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentGroupInfo] = scala.None)
case object ApplicationLimitExceededException
final case class ListOnPremisesInstancesOutput(instanceNames: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListApplicationRevisionsInput(applicationName: java.lang.String, deployed: scala.Option[java.lang.String] = scala.None, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, sortOrder: scala.Option[java.lang.String] = scala.None, sortBy: scala.Option[java.lang.String] = scala.None, s3Bucket: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class BatchGetApplicationsInput(applicationNames: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class BatchGetApplicationRevisionsInput(applicationName: java.lang.String, revisions: scala.List[org.lyranthe.araethura.codedeploy.models.RevisionLocation])
case object InstanceNameRequiredException
case object DeploymentConfigAlreadyExistsException
case object InstanceLimitExceededException
final case class RollbackInfo(rollbackDeploymentId: scala.Option[java.lang.String] = scala.None, rollbackTriggeringDeploymentId: scala.Option[java.lang.String] = scala.None, rollbackMessage: scala.Option[java.lang.String] = scala.None)
case object DeploymentLimitExceededException
final case class DeploymentInfo(status: scala.Option[java.lang.String] = scala.None, createTime: scala.Option[java.time.Instant] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, completeTime: scala.Option[java.time.Instant] = scala.None, deploymentId: scala.Option[java.lang.String] = scala.None, deploymentOverview: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentOverview] = scala.None, blueGreenDeploymentConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.BlueGreenDeploymentConfiguration] = scala.None, applicationName: scala.Option[java.lang.String] = scala.None, additionalDeploymentStatusInfo: scala.Option[java.lang.String] = scala.None, targetInstances: scala.Option[org.lyranthe.araethura.codedeploy.models.TargetInstances] = scala.None, fileExistsBehavior: scala.Option[java.lang.String] = scala.None, rollbackInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.RollbackInfo] = scala.None, description: scala.Option[java.lang.String] = scala.None, autoRollbackConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AutoRollbackConfiguration] = scala.None, deploymentConfigName: scala.Option[java.lang.String] = scala.None, deploymentGroupName: scala.Option[java.lang.String] = scala.None, loadBalancerInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.LoadBalancerInfo] = scala.None, errorInformation: scala.Option[org.lyranthe.araethura.codedeploy.models.ErrorInformation] = scala.None, ignoreApplicationStopFailures: scala.Option[scala.Boolean] = scala.None, updateOutdatedInstancesOnly: scala.Option[scala.Boolean] = scala.None, instanceTerminationWaitTimeStarted: scala.Option[scala.Boolean] = scala.None, creator: scala.Option[java.lang.String] = scala.None, deploymentStyle: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentStyle] = scala.None, previousRevision: scala.Option[org.lyranthe.araethura.codedeploy.models.RevisionLocation] = scala.None, revision: scala.Option[org.lyranthe.araethura.codedeploy.models.RevisionLocation] = scala.None)
final case class GetOnPremisesInstanceOutput(instanceInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.InstanceInfo] = scala.None)
final case class ListApplicationRevisionsOutput(revisions: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.RevisionLocation]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListDeploymentConfigsInput(nextToken: scala.Option[java.lang.String] = scala.None)
final case class TargetGroupInfo(name: scala.Option[java.lang.String] = scala.None)
case object UnsupportedActionForDeploymentTypeException
case object InvalidFileExistsBehaviorException
final case class SkipWaitTimeForInstanceTerminationInput(deploymentId: scala.Option[java.lang.String] = scala.None)
final case class GetDeploymentInstanceInput(deploymentId: java.lang.String, instanceId: java.lang.String)
final case class S3Location(key: scala.Option[java.lang.String] = scala.None, bundleType: scala.Option[java.lang.String] = scala.None, version: scala.Option[java.lang.String] = scala.None, eTag: scala.Option[java.lang.String] = scala.None, bucket: scala.Option[java.lang.String] = scala.None)
case object InvalidBucketNameFilterException
case object DeploymentConfigNameRequiredException
final case class AlarmConfiguration(enabled: scala.Option[scala.Boolean] = scala.None, ignorePollAlarmFailure: scala.Option[scala.Boolean] = scala.None, alarms: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.Alarm]] = scala.None)
case object DeploymentIsNotInReadyStateException
case object InvalidEC2TagException
case object ResourceValidationException
case object InvalidOnPremisesTagCombinationException
final case class TriggerConfig(triggerName: scala.Option[java.lang.String] = scala.None, triggerTargetArn: scala.Option[java.lang.String] = scala.None, triggerEvents: scala.Option[scala.List[java.lang.String]] = scala.None)
case object InvalidApplicationNameException
final case class EC2TagSet(ec2TagSetList: scala.Option[scala.List[scala.List[org.lyranthe.araethura.codedeploy.models.EC2TagFilter]]] = scala.None)
case object InvalidKeyPrefixFilterException
final case class AutoRollbackConfiguration(enabled: scala.Option[scala.Boolean] = scala.None, events: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class BatchGetDeploymentsOutput(deploymentsInfo: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.DeploymentInfo]] = scala.None)
final case class BatchGetApplicationsOutput(applicationsInfo: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.ApplicationInfo]] = scala.None)
case object InvalidRegistrationStatusException
final case class RegisterApplicationRevisionInput(applicationName: java.lang.String, revision: org.lyranthe.araethura.codedeploy.models.RevisionLocation, description: scala.Option[java.lang.String] = scala.None)
final case class ListApplicationsInput(nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateDeploymentOutput(deploymentId: scala.Option[java.lang.String] = scala.None)
final case class GetApplicationRevisionOutput(applicationName: scala.Option[java.lang.String] = scala.None, revision: scala.Option[org.lyranthe.araethura.codedeploy.models.RevisionLocation] = scala.None, revisionInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.GenericRevisionInfo] = scala.None)
case object InvalidDeploymentIdException
case object InvalidEC2TagCombinationException
final case class ApplicationInfo(createTime: scala.Option[java.time.Instant] = scala.None, applicationName: scala.Option[java.lang.String] = scala.None, applicationId: scala.Option[java.lang.String] = scala.None, gitHubAccountName: scala.Option[java.lang.String] = scala.None, linkedToGitHub: scala.Option[scala.Boolean] = scala.None)
case object InvalidAlarmConfigException
final case class ListGitHubAccountTokenNamesOutput(tokenNameList: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class BatchGetDeploymentInstancesOutput(instancesSummary: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.InstanceSummary]] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class ContinueDeploymentInput(deploymentId: scala.Option[java.lang.String] = scala.None)
final case class ListDeploymentGroupsOutput(applicationName: scala.Option[java.lang.String] = scala.None, deploymentGroups: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidIamUserArnException
case object ApplicationNameRequiredException
final case class DeploymentGroupInfo(triggerConfigurations: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TriggerConfig]] = scala.None, onPremisesTagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.OnPremisesTagSet] = scala.None, blueGreenDeploymentConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.BlueGreenDeploymentConfiguration] = scala.None, applicationName: scala.Option[java.lang.String] = scala.None, ec2TagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.EC2TagFilter]] = scala.None, alarmConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AlarmConfiguration] = scala.None, onPremisesInstanceTagFilters: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TagFilter]] = scala.None, serviceRoleArn: scala.Option[java.lang.String] = scala.None, ec2TagSet: scala.Option[org.lyranthe.araethura.codedeploy.models.EC2TagSet] = scala.None, autoRollbackConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AutoRollbackConfiguration] = scala.None, deploymentConfigName: scala.Option[java.lang.String] = scala.None, deploymentGroupName: scala.Option[java.lang.String] = scala.None, loadBalancerInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.LoadBalancerInfo] = scala.None, deploymentGroupId: scala.Option[java.lang.String] = scala.None, autoScalingGroups: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.AutoScalingGroup]] = scala.None, deploymentStyle: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentStyle] = scala.None, targetRevision: scala.Option[org.lyranthe.araethura.codedeploy.models.RevisionLocation] = scala.None, lastSuccessfulDeployment: scala.Option[org.lyranthe.araethura.codedeploy.models.LastDeploymentInfo] = scala.None, lastAttemptedDeployment: scala.Option[org.lyranthe.araethura.codedeploy.models.LastDeploymentInfo] = scala.None)
final case class BatchGetDeploymentsInput(deploymentIds: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class LoadBalancerInfo(elbInfoList: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.ELBInfo]] = scala.None, targetGroupInfoList: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.TargetGroupInfo]] = scala.None)
case object DeploymentConfigDoesNotExistException
case object InvalidDeploymentStyleException
case object ApplicationAlreadyExistsException
case object LifecycleHookLimitExceededException
final case class GetOnPremisesInstanceInput(instanceName: java.lang.String)
final case class ErrorInformation(code: scala.Option[java.lang.String] = scala.None, message: scala.Option[java.lang.String] = scala.None)
case object InstanceNameAlreadyRegisteredException
final case class GreenFleetProvisioningOption(action: scala.Option[java.lang.String] = scala.None)
final case class BatchGetOnPremisesInstancesInput(instanceNames: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ListDeploymentGroupsInput(applicationName: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateDeploymentInput(applicationName: java.lang.String, targetInstances: scala.Option[org.lyranthe.araethura.codedeploy.models.TargetInstances] = scala.None, fileExistsBehavior: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, autoRollbackConfiguration: scala.Option[org.lyranthe.araethura.codedeploy.models.AutoRollbackConfiguration] = scala.None, deploymentConfigName: scala.Option[java.lang.String] = scala.None, deploymentGroupName: scala.Option[java.lang.String] = scala.None, ignoreApplicationStopFailures: scala.Option[scala.Boolean] = scala.None, updateOutdatedInstancesOnly: scala.Option[scala.Boolean] = scala.None, revision: scala.Option[org.lyranthe.araethura.codedeploy.models.RevisionLocation] = scala.None)
final case class CreateDeploymentConfigInput(deploymentConfigName: java.lang.String, minimumHealthyHosts: org.lyranthe.araethura.codedeploy.models.MinimumHealthyHosts)
case object DeploymentIdRequiredException
final case class DeploymentStyle(deploymentType: scala.Option[java.lang.String] = scala.None, deploymentOption: scala.Option[java.lang.String] = scala.None)
case object InvalidBlueGreenDeploymentConfigurationException
final case class TimeRange(start: scala.Option[java.time.Instant] = scala.None, end: scala.Option[java.time.Instant] = scala.None)
case object DeploymentGroupLimitExceededException
case object InvalidInstanceTypeException
final case class RevisionLocation(revisionType: scala.Option[java.lang.String] = scala.None, s3Location: scala.Option[org.lyranthe.araethura.codedeploy.models.S3Location] = scala.None, gitHubLocation: scala.Option[org.lyranthe.araethura.codedeploy.models.GitHubLocation] = scala.None)
final case class LastDeploymentInfo(deploymentId: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, createTime: scala.Option[java.time.Instant] = scala.None)
case object InvalidNextTokenException
case object GitHubAccountTokenDoesNotExistException
final case class DeregisterOnPremisesInstanceInput(instanceName: java.lang.String)
final case class GetApplicationRevisionInput(applicationName: java.lang.String, revision: org.lyranthe.araethura.codedeploy.models.RevisionLocation)
final case class UpdateApplicationInput(applicationName: scala.Option[java.lang.String] = scala.None, newApplicationName: scala.Option[java.lang.String] = scala.None)
case object ApplicationDoesNotExistException
case object DescriptionTooLongException
final case class MinimumHealthyHosts(value: scala.Option[scala.Int] = scala.None, `type`: scala.Option[java.lang.String] = scala.None)
final case class ListApplicationsOutput(applications: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetDeploymentOutput(deploymentInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentInfo] = scala.None)
case object InstanceIdRequiredException
final case class RemoveTagsFromOnPremisesInstancesInput(tags: scala.List[org.lyranthe.araethura.codedeploy.models.Tag], instanceNames: scala.List[java.lang.String])
case object InvalidIamSessionArnException
final case class GetDeploymentConfigOutput(deploymentConfigInfo: scala.Option[org.lyranthe.araethura.codedeploy.models.DeploymentConfigInfo] = scala.None)
final case class BatchGetOnPremisesInstancesOutput(instanceInfos: scala.Option[scala.List[org.lyranthe.araethura.codedeploy.models.InstanceInfo]] = scala.None)
case object InvalidDeploymentGroupNameException
final case class LifecycleEvent(lifecycleEventName: scala.Option[java.lang.String] = scala.None, diagnostics: scala.Option[org.lyranthe.araethura.codedeploy.models.Diagnostics] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, status: scala.Option[java.lang.String] = scala.None)
final case class DeploymentReadyOption(actionOnTimeout: scala.Option[java.lang.String] = scala.None, waitTimeInMinutes: scala.Option[scala.Int] = scala.None)
final case class DeleteDeploymentConfigInput(deploymentConfigName: java.lang.String)
case object InstanceNotRegisteredException