package org.lyranthe.araethura.codedeploy.models
import org.lyranthe.araethura.codedeploy.models
case object InvalidInstanceNameException
final case class DeleteDeploymentGroupOutput(hooksNotCleanedUp: scala.Option[scala.List[models.AutoScalingGroup]] = None)
final case class AutoScalingGroup(name: scala.Option[java.lang.String] = None, hook: scala.Option[java.lang.String] = None)
final case class ListDeploymentsOutput(deployments: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class RevisionInfo(revisionLocation: scala.Option[models.RevisionLocation] = None, genericRevisionInfo: scala.Option[models.GenericRevisionInfo] = None)
case object DeploymentDoesNotExistException
final case class ListOnPremisesInstancesInput(registrationStatus: scala.Option[java.lang.String] = None, tagFilters: scala.Option[scala.List[models.TagFilter]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CreateApplicationInput(applicationName: java.lang.String)
case object InvalidTimeRangeException
final case class InstanceInfo(iamSessionArn: scala.Option[java.lang.String] = None, registerTime: scala.Option[java.time.Instant] = None, deregisterTime: scala.Option[java.time.Instant] = None, instanceArn: scala.Option[java.lang.String] = None, instanceName: scala.Option[java.lang.String] = None, tags: scala.Option[scala.List[models.Tag]] = None, iamUserArn: scala.Option[java.lang.String] = None)
case object InvalidTargetInstancesException
case object BucketNameFilterRequiredException
final case class BatchGetApplicationRevisionsOutput(applicationName: scala.Option[java.lang.String] = None, errorMessage: scala.Option[java.lang.String] = None, revisions: scala.Option[scala.List[models.RevisionInfo]] = None)
final case class CreateDeploymentConfigOutput(deploymentConfigId: scala.Option[java.lang.String] = None)
final case class CreateDeploymentGroupInput(applicationName: java.lang.String, serviceRoleArn: java.lang.String, deploymentGroupName: java.lang.String, triggerConfigurations: scala.Option[scala.List[models.TriggerConfig]] = None, onPremisesTagSet: scala.Option[models.OnPremisesTagSet] = None, blueGreenDeploymentConfiguration: scala.Option[models.BlueGreenDeploymentConfiguration] = None, ec2TagFilters: scala.Option[scala.List[models.EC2TagFilter]] = None, alarmConfiguration: scala.Option[models.AlarmConfiguration] = None, onPremisesInstanceTagFilters: scala.Option[scala.List[models.TagFilter]] = None, ec2TagSet: scala.Option[models.EC2TagSet] = None, autoRollbackConfiguration: scala.Option[models.AutoRollbackConfiguration] = None, deploymentConfigName: scala.Option[java.lang.String] = None, autoScalingGroups: scala.Option[scala.List[java.lang.String]] = None, loadBalancerInfo: scala.Option[models.LoadBalancerInfo] = None, deploymentStyle: scala.Option[models.DeploymentStyle] = None)
case object InvalidTriggerConfigException
final case class DeleteApplicationInput(applicationName: java.lang.String)
final case class GetDeploymentInput(deploymentId: java.lang.String)
final case class OnPremisesTagSet(onPremisesTagSetList: scala.Option[scala.List[scala.List[models.TagFilter]]] = None)
case object DeploymentNotStartedException
case object AlarmsLimitExceededException
case object DeploymentGroupAlreadyExistsException
final case class CreateApplicationOutput(applicationId: scala.Option[java.lang.String] = None)
case object InvalidRevisionException
final case class InstanceSummary(instanceId: scala.Option[java.lang.String] = None, lifecycleEvents: scala.Option[scala.List[models.LifecycleEvent]] = None, lastUpdatedAt: scala.Option[java.time.Instant] = None, deploymentId: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, instanceType: scala.Option[java.lang.String] = None)
final case class StopDeploymentOutput(status: scala.Option[java.lang.String] = None, statusMessage: scala.Option[java.lang.String] = None)
final case class GetDeploymentInstanceOutput(instanceSummary: scala.Option[models.InstanceSummary] = None)
final case class ListDeploymentInstancesInput(deploymentId: java.lang.String, nextToken: scala.Option[java.lang.String] = None, instanceStatusFilter: scala.Option[scala.List[java.lang.String]] = None, instanceTypeFilter: scala.Option[scala.List[java.lang.String]] = None)
final case class GitHubLocation(repository: scala.Option[java.lang.String] = None, commitId: scala.Option[java.lang.String] = None)
final case class ELBInfo(name: scala.Option[java.lang.String] = None)
case object IamArnRequiredException
case object InvalidDeploymentInstanceTypeException
case object InvalidOperationException
final case class GetDeploymentGroupInput(applicationName: java.lang.String, deploymentGroupName: java.lang.String)
final case class DeploymentOverview(pending: scala.Option[scala.Long] = None, skipped: scala.Option[scala.Long] = None, succeeded: scala.Option[scala.Long] = None, ready: scala.Option[scala.Long] = None, inProgress: scala.Option[scala.Long] = None, failed: scala.Option[scala.Long] = None)
case object InvalidTagFilterException
final case class BlueGreenDeploymentConfiguration(terminateBlueInstancesOnDeploymentSuccess: scala.Option[models.BlueInstanceTerminationOption] = None, deploymentReadyOption: scala.Option[models.DeploymentReadyOption] = None, greenFleetProvisioningOption: scala.Option[models.GreenFleetProvisioningOption] = None)
final case class GetApplicationInput(applicationName: java.lang.String)
case object DeploymentAlreadyCompletedException
case object InvalidLoadBalancerInfoException
final case class BatchGetDeploymentGroupsOutput(deploymentGroupsInfo: scala.Option[scala.List[models.DeploymentGroupInfo]] = None, errorMessage: scala.Option[java.lang.String] = None)
final case class CreateDeploymentGroupOutput(deploymentGroupId: scala.Option[java.lang.String] = None)
final case class BlueInstanceTerminationOption(action: scala.Option[java.lang.String] = None, terminationWaitTimeInMinutes: scala.Option[scala.Int] = None)
case object InvalidAutoRollbackConfigException
final case class StopDeploymentInput(deploymentId: java.lang.String, autoRollbackEnabled: scala.Option[scala.Boolean] = None)
case object DeploymentGroupDoesNotExistException
final case class TagFilter(key: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None)
final case class DeleteDeploymentGroupInput(applicationName: java.lang.String, deploymentGroupName: java.lang.String)
case object InvalidRoleException
final case class ListDeploymentInstancesOutput(instancesList: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class AddTagsToOnPremisesInstancesInput(tags: scala.List[models.Tag], instanceNames: scala.List[java.lang.String])
case object InvalidDeploymentConfigNameException
case object InvalidMinimumHealthyHostValueException
case object RoleRequiredException
case object InvalidTagException
final case class BatchGetDeploymentInstancesInput(deploymentId: java.lang.String, instanceIds: scala.List[java.lang.String])
final case class RegisterOnPremisesInstanceInput(instanceName: java.lang.String, iamSessionArn: scala.Option[java.lang.String] = None, iamUserArn: scala.Option[java.lang.String] = None)
case object InvalidDeploymentStatusException
final case class GetDeploymentConfigInput(deploymentConfigName: java.lang.String)
case object DeploymentGroupNameRequiredException
case object MultipleIamArnsProvidedException
case object TagSetListLimitExceededException
final case class Alarm(name: scala.Option[java.lang.String] = None)
final case class ListGitHubAccountTokenNamesInput(nextToken: scala.Option[java.lang.String] = None)
final case class Tag(key: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None)
final case class TargetInstances(tagFilters: scala.Option[scala.List[models.EC2TagFilter]] = None, autoScalingGroups: scala.Option[scala.List[java.lang.String]] = None, ec2TagSet: scala.Option[models.EC2TagSet] = None)
final case class GenericRevisionInfo(description: scala.Option[java.lang.String] = None, deploymentGroups: scala.Option[scala.List[java.lang.String]] = None, firstUsedTime: scala.Option[java.time.Instant] = None, lastUsedTime: scala.Option[java.time.Instant] = None, registerTime: scala.Option[java.time.Instant] = None)
final case class BatchGetDeploymentGroupsInput(applicationName: java.lang.String, deploymentGroupNames: scala.List[java.lang.String])
case object InvalidAutoScalingGroupException
case object DeploymentConfigLimitExceededException
final case class UpdateDeploymentGroupOutput(hooksNotCleanedUp: scala.Option[scala.List[models.AutoScalingGroup]] = None)
case object InvalidDeployedStateFilterException
final case class DeploymentConfigInfo(deploymentConfigId: scala.Option[java.lang.String] = None, deploymentConfigName: scala.Option[java.lang.String] = None, minimumHealthyHosts: scala.Option[models.MinimumHealthyHosts] = None, createTime: scala.Option[java.time.Instant] = None)
case object IamSessionArnAlreadyRegisteredException
case object DeploymentConfigInUseException
case object IamUserArnRequiredException
case object BatchLimitExceededException
case object InvalidSortOrderException
case object TagLimitExceededException
final case class UpdateDeploymentGroupInput(applicationName: java.lang.String, currentDeploymentGroupName: java.lang.String, triggerConfigurations: scala.Option[scala.List[models.TriggerConfig]] = None, onPremisesTagSet: scala.Option[models.OnPremisesTagSet] = None, blueGreenDeploymentConfiguration: scala.Option[models.BlueGreenDeploymentConfiguration] = None, ec2TagFilters: scala.Option[scala.List[models.EC2TagFilter]] = None, alarmConfiguration: scala.Option[models.AlarmConfiguration] = None, onPremisesInstanceTagFilters: scala.Option[scala.List[models.TagFilter]] = None, serviceRoleArn: scala.Option[java.lang.String] = None, ec2TagSet: scala.Option[models.EC2TagSet] = None, autoRollbackConfiguration: scala.Option[models.AutoRollbackConfiguration] = None, deploymentConfigName: scala.Option[java.lang.String] = None, autoScalingGroups: scala.Option[scala.List[java.lang.String]] = None, newDeploymentGroupName: scala.Option[java.lang.String] = None, loadBalancerInfo: scala.Option[models.LoadBalancerInfo] = None, deploymentStyle: scala.Option[models.DeploymentStyle] = None)
final case class Diagnostics(errorCode: scala.Option[java.lang.String] = None, scriptName: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None, logTail: scala.Option[java.lang.String] = None)
case object IamUserArnAlreadyRegisteredException
case object RevisionDoesNotExistException
final case class EC2TagFilter(key: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None)
case object InstanceDoesNotExistException
final case class GetApplicationOutput(application: scala.Option[models.ApplicationInfo] = None)
case object InvalidSortByException
case object TagRequiredException
case object TriggerTargetsLimitExceededException
case object InvalidInstanceStatusException
case object RevisionRequiredException
final case class ListDeploymentConfigsOutput(deploymentConfigsList: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListDeploymentsInput(applicationName: scala.Option[java.lang.String] = None, includeOnlyStatuses: scala.Option[scala.List[java.lang.String]] = None, deploymentGroupName: scala.Option[java.lang.String] = None, createTimeRange: scala.Option[models.TimeRange] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetDeploymentGroupOutput(deploymentGroupInfo: scala.Option[models.DeploymentGroupInfo] = None)
case object ApplicationLimitExceededException
final case class ListOnPremisesInstancesOutput(instanceNames: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListApplicationRevisionsInput(applicationName: java.lang.String, deployed: scala.Option[java.lang.String] = None, s3KeyPrefix: scala.Option[java.lang.String] = None, sortOrder: scala.Option[java.lang.String] = None, sortBy: scala.Option[java.lang.String] = None, s3Bucket: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None)
final case class BatchGetApplicationsInput(applicationNames: scala.Option[scala.List[java.lang.String]] = None)
final case class BatchGetApplicationRevisionsInput(applicationName: java.lang.String, revisions: scala.List[models.RevisionLocation])
case object InstanceNameRequiredException
case object DeploymentConfigAlreadyExistsException
case object InstanceLimitExceededException
final case class RollbackInfo(rollbackDeploymentId: scala.Option[java.lang.String] = None, rollbackTriggeringDeploymentId: scala.Option[java.lang.String] = None, rollbackMessage: scala.Option[java.lang.String] = None)
case object DeploymentLimitExceededException
final case class DeploymentInfo(status: scala.Option[java.lang.String] = None, createTime: scala.Option[java.time.Instant] = None, startTime: scala.Option[java.time.Instant] = None, completeTime: scala.Option[java.time.Instant] = None, deploymentId: scala.Option[java.lang.String] = None, deploymentOverview: scala.Option[models.DeploymentOverview] = None, blueGreenDeploymentConfiguration: scala.Option[models.BlueGreenDeploymentConfiguration] = None, applicationName: scala.Option[java.lang.String] = None, additionalDeploymentStatusInfo: scala.Option[java.lang.String] = None, targetInstances: scala.Option[models.TargetInstances] = None, fileExistsBehavior: scala.Option[java.lang.String] = None, rollbackInfo: scala.Option[models.RollbackInfo] = None, description: scala.Option[java.lang.String] = None, autoRollbackConfiguration: scala.Option[models.AutoRollbackConfiguration] = None, deploymentConfigName: scala.Option[java.lang.String] = None, deploymentGroupName: scala.Option[java.lang.String] = None, loadBalancerInfo: scala.Option[models.LoadBalancerInfo] = None, errorInformation: scala.Option[models.ErrorInformation] = None, ignoreApplicationStopFailures: scala.Option[scala.Boolean] = None, updateOutdatedInstancesOnly: scala.Option[scala.Boolean] = None, instanceTerminationWaitTimeStarted: scala.Option[scala.Boolean] = None, creator: scala.Option[java.lang.String] = None, deploymentStyle: scala.Option[models.DeploymentStyle] = None, previousRevision: scala.Option[models.RevisionLocation] = None, revision: scala.Option[models.RevisionLocation] = None)
final case class GetOnPremisesInstanceOutput(instanceInfo: scala.Option[models.InstanceInfo] = None)
final case class ListApplicationRevisionsOutput(revisions: scala.Option[scala.List[models.RevisionLocation]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListDeploymentConfigsInput(nextToken: scala.Option[java.lang.String] = None)
final case class TargetGroupInfo(name: scala.Option[java.lang.String] = None)
case object UnsupportedActionForDeploymentTypeException
case object InvalidFileExistsBehaviorException
final case class SkipWaitTimeForInstanceTerminationInput(deploymentId: scala.Option[java.lang.String] = None)
final case class GetDeploymentInstanceInput(deploymentId: java.lang.String, instanceId: java.lang.String)
final case class S3Location(key: scala.Option[java.lang.String] = None, bundleType: scala.Option[java.lang.String] = None, version: scala.Option[java.lang.String] = None, eTag: scala.Option[java.lang.String] = None, bucket: scala.Option[java.lang.String] = None)
case object InvalidBucketNameFilterException
case object DeploymentConfigNameRequiredException
final case class AlarmConfiguration(enabled: scala.Option[scala.Boolean] = None, ignorePollAlarmFailure: scala.Option[scala.Boolean] = None, alarms: scala.Option[scala.List[models.Alarm]] = None)
case object DeploymentIsNotInReadyStateException
case object InvalidEC2TagException
case object ResourceValidationException
case object InvalidOnPremisesTagCombinationException
final case class TriggerConfig(triggerName: scala.Option[java.lang.String] = None, triggerTargetArn: scala.Option[java.lang.String] = None, triggerEvents: scala.Option[scala.List[java.lang.String]] = None)
case object InvalidApplicationNameException
final case class EC2TagSet(ec2TagSetList: scala.Option[scala.List[scala.List[models.EC2TagFilter]]] = None)
case object InvalidKeyPrefixFilterException
final case class AutoRollbackConfiguration(enabled: scala.Option[scala.Boolean] = None, events: scala.Option[scala.List[java.lang.String]] = None)
final case class BatchGetDeploymentsOutput(deploymentsInfo: scala.Option[scala.List[models.DeploymentInfo]] = None)
final case class BatchGetApplicationsOutput(applicationsInfo: scala.Option[scala.List[models.ApplicationInfo]] = None)
case object InvalidRegistrationStatusException
final case class RegisterApplicationRevisionInput(applicationName: java.lang.String, revision: models.RevisionLocation, description: scala.Option[java.lang.String] = None)
final case class ListApplicationsInput(nextToken: scala.Option[java.lang.String] = None)
final case class CreateDeploymentOutput(deploymentId: scala.Option[java.lang.String] = None)
final case class GetApplicationRevisionOutput(applicationName: scala.Option[java.lang.String] = None, revision: scala.Option[models.RevisionLocation] = None, revisionInfo: scala.Option[models.GenericRevisionInfo] = None)
case object InvalidDeploymentIdException
case object InvalidEC2TagCombinationException
final case class ApplicationInfo(createTime: scala.Option[java.time.Instant] = None, applicationName: scala.Option[java.lang.String] = None, applicationId: scala.Option[java.lang.String] = None, gitHubAccountName: scala.Option[java.lang.String] = None, linkedToGitHub: scala.Option[scala.Boolean] = None)
case object InvalidAlarmConfigException
final case class ListGitHubAccountTokenNamesOutput(tokenNameList: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class BatchGetDeploymentInstancesOutput(instancesSummary: scala.Option[scala.List[models.InstanceSummary]] = None, errorMessage: scala.Option[java.lang.String] = None)
final case class ContinueDeploymentInput(deploymentId: scala.Option[java.lang.String] = None)
final case class ListDeploymentGroupsOutput(applicationName: scala.Option[java.lang.String] = None, deploymentGroups: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidIamUserArnException
case object ApplicationNameRequiredException
final case class DeploymentGroupInfo(triggerConfigurations: scala.Option[scala.List[models.TriggerConfig]] = None, onPremisesTagSet: scala.Option[models.OnPremisesTagSet] = None, blueGreenDeploymentConfiguration: scala.Option[models.BlueGreenDeploymentConfiguration] = None, applicationName: scala.Option[java.lang.String] = None, ec2TagFilters: scala.Option[scala.List[models.EC2TagFilter]] = None, alarmConfiguration: scala.Option[models.AlarmConfiguration] = None, onPremisesInstanceTagFilters: scala.Option[scala.List[models.TagFilter]] = None, serviceRoleArn: scala.Option[java.lang.String] = None, ec2TagSet: scala.Option[models.EC2TagSet] = None, autoRollbackConfiguration: scala.Option[models.AutoRollbackConfiguration] = None, deploymentConfigName: scala.Option[java.lang.String] = None, deploymentGroupName: scala.Option[java.lang.String] = None, loadBalancerInfo: scala.Option[models.LoadBalancerInfo] = None, deploymentGroupId: scala.Option[java.lang.String] = None, autoScalingGroups: scala.Option[scala.List[models.AutoScalingGroup]] = None, deploymentStyle: scala.Option[models.DeploymentStyle] = None, targetRevision: scala.Option[models.RevisionLocation] = None, lastSuccessfulDeployment: scala.Option[models.LastDeploymentInfo] = None, lastAttemptedDeployment: scala.Option[models.LastDeploymentInfo] = None)
final case class BatchGetDeploymentsInput(deploymentIds: scala.Option[scala.List[java.lang.String]] = None)
final case class LoadBalancerInfo(elbInfoList: scala.Option[scala.List[models.ELBInfo]] = None, targetGroupInfoList: scala.Option[scala.List[models.TargetGroupInfo]] = None)
case object DeploymentConfigDoesNotExistException
case object InvalidDeploymentStyleException
case object ApplicationAlreadyExistsException
case object LifecycleHookLimitExceededException
final case class GetOnPremisesInstanceInput(instanceName: java.lang.String)
final case class ErrorInformation(code: scala.Option[java.lang.String] = None, message: scala.Option[java.lang.String] = None)
case object InstanceNameAlreadyRegisteredException
final case class GreenFleetProvisioningOption(action: scala.Option[java.lang.String] = None)
final case class BatchGetOnPremisesInstancesInput(instanceNames: scala.Option[scala.List[java.lang.String]] = None)
final case class ListDeploymentGroupsInput(applicationName: java.lang.String, nextToken: scala.Option[java.lang.String] = None)
final case class CreateDeploymentInput(applicationName: java.lang.String, targetInstances: scala.Option[models.TargetInstances] = None, fileExistsBehavior: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, autoRollbackConfiguration: scala.Option[models.AutoRollbackConfiguration] = None, deploymentConfigName: scala.Option[java.lang.String] = None, deploymentGroupName: scala.Option[java.lang.String] = None, ignoreApplicationStopFailures: scala.Option[scala.Boolean] = None, updateOutdatedInstancesOnly: scala.Option[scala.Boolean] = None, revision: scala.Option[models.RevisionLocation] = None)
final case class CreateDeploymentConfigInput(deploymentConfigName: java.lang.String, minimumHealthyHosts: models.MinimumHealthyHosts)
case object DeploymentIdRequiredException
final case class DeploymentStyle(deploymentType: scala.Option[java.lang.String] = None, deploymentOption: scala.Option[java.lang.String] = None)
case object InvalidBlueGreenDeploymentConfigurationException
final case class TimeRange(start: scala.Option[java.time.Instant] = None, end: scala.Option[java.time.Instant] = None)
case object DeploymentGroupLimitExceededException
case object InvalidInstanceTypeException
final case class RevisionLocation(revisionType: scala.Option[java.lang.String] = None, s3Location: scala.Option[models.S3Location] = None, gitHubLocation: scala.Option[models.GitHubLocation] = None)
final case class LastDeploymentInfo(deploymentId: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, endTime: scala.Option[java.time.Instant] = None, createTime: scala.Option[java.time.Instant] = None)
case object InvalidNextTokenException
case object GitHubAccountTokenDoesNotExistException
final case class DeregisterOnPremisesInstanceInput(instanceName: java.lang.String)
final case class GetApplicationRevisionInput(applicationName: java.lang.String, revision: models.RevisionLocation)
final case class UpdateApplicationInput(applicationName: scala.Option[java.lang.String] = None, newApplicationName: scala.Option[java.lang.String] = None)
case object ApplicationDoesNotExistException
case object DescriptionTooLongException
final case class MinimumHealthyHosts(value: scala.Option[scala.Int] = None, `type`: scala.Option[java.lang.String] = None)
final case class ListApplicationsOutput(applications: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetDeploymentOutput(deploymentInfo: scala.Option[models.DeploymentInfo] = None)
case object InstanceIdRequiredException
final case class RemoveTagsFromOnPremisesInstancesInput(tags: scala.List[models.Tag], instanceNames: scala.List[java.lang.String])
case object InvalidIamSessionArnException
final case class GetDeploymentConfigOutput(deploymentConfigInfo: scala.Option[models.DeploymentConfigInfo] = None)
final case class BatchGetOnPremisesInstancesOutput(instanceInfos: scala.Option[scala.List[models.InstanceInfo]] = None)
case object InvalidDeploymentGroupNameException
final case class LifecycleEvent(lifecycleEventName: scala.Option[java.lang.String] = None, diagnostics: scala.Option[models.Diagnostics] = None, startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, status: scala.Option[java.lang.String] = None)
final case class DeploymentReadyOption(actionOnTimeout: scala.Option[java.lang.String] = None, waitTimeInMinutes: scala.Option[scala.Int] = None)
final case class DeleteDeploymentConfigInput(deploymentConfigName: java.lang.String)
case object InstanceNotRegisteredException