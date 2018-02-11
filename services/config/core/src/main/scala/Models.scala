package org.lyranthe.araethura.config.models
import org.lyranthe.araethura.config.models
case object InvalidDeliveryChannelNameException
final case class Relationship(resourceType: scala.Option[java.lang.String] = None, resourceId: scala.Option[java.lang.String] = None, resourceName: scala.Option[java.lang.String] = None, relationshipName: scala.Option[java.lang.String] = None)
final case class GetComplianceDetailsByResourceRequest(resourceType: java.lang.String, resourceId: java.lang.String, complianceTypes: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
case object ResourceNotDiscoveredException
final case class ComplianceByResource(resourceType: scala.Option[java.lang.String] = None, resourceId: scala.Option[java.lang.String] = None, compliance: scala.Option[models.Compliance] = None)
case object ValidationException
final case class GetDiscoveredResourceCountsRequest(resourceTypes: scala.Option[scala.List[java.lang.String]] = None, limit: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidRoleException
case object InvalidSNSTopicARNException
final case class DescribeDeliveryChannelStatusRequest(deliveryChannelNames: scala.Option[scala.List[java.lang.String]] = None)
final case class DescribeConfigurationRecordersRequest(configurationRecorderNames: scala.Option[scala.List[java.lang.String]] = None)
final case class GetResourceConfigHistoryResponse(configurationItems: scala.Option[scala.List[models.ConfigurationItem]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeComplianceByResourceRequest(resourceId: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, complianceTypes: scala.Option[scala.List[java.lang.String]] = None, limit: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ResourceIdentifier(resourceType: scala.Option[java.lang.String] = None, resourceId: scala.Option[java.lang.String] = None, resourceName: scala.Option[java.lang.String] = None, resourceDeletionTime: scala.Option[java.time.Instant] = None)
final case class DescribeConfigRuleEvaluationStatusResponse(configRulesEvaluationStatus: scala.Option[scala.List[models.ConfigRuleEvaluationStatus]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Source(owner: java.lang.String, sourceIdentifier: java.lang.String, sourceDetails: scala.Option[scala.List[models.SourceDetail]] = None)
case object NoSuchDeliveryChannelException
case object DeleteEvaluationResultsResponse
final case class ConfigExportDeliveryInfo(lastStatus: scala.Option[java.lang.String] = None, lastErrorCode: scala.Option[java.lang.String] = None, lastErrorMessage: scala.Option[java.lang.String] = None, lastAttemptTime: scala.Option[java.time.Instant] = None, lastSuccessfulTime: scala.Option[java.time.Instant] = None, nextDeliveryTime: scala.Option[java.time.Instant] = None)
final case class DeleteEvaluationResultsRequest(configRuleName: java.lang.String)
final case class PutConfigRuleRequest(configRule: models.ConfigRule)
final case class DeleteConfigurationRecorderRequest(configurationRecorderName: java.lang.String)
case object NoSuchConfigRuleException
final case class EvaluationResultIdentifier(evaluationResultQualifier: scala.Option[models.EvaluationResultQualifier] = None, orderingTimestamp: scala.Option[java.time.Instant] = None)
final case class PutEvaluationsRequest(resultToken: java.lang.String, evaluations: scala.Option[scala.List[models.Evaluation]] = None, testMode: scala.Option[scala.Boolean] = None)
final case class Evaluation(complianceResourceType: java.lang.String, complianceResourceId: java.lang.String, complianceType: java.lang.String, orderingTimestamp: java.time.Instant, annotation: scala.Option[java.lang.String] = None)
final case class DescribeDeliveryChannelsRequest(deliveryChannelNames: scala.Option[scala.List[java.lang.String]] = None)
case object MaxNumberOfConfigurationRecordersExceededException
final case class GetResourceConfigHistoryRequest(resourceId: java.lang.String, resourceType: java.lang.String, laterTime: scala.Option[java.time.Instant] = None, earlierTime: scala.Option[java.time.Instant] = None, chronologicalOrder: scala.Option[java.lang.String] = None, limit: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeConfigurationRecordersResponse(configurationRecorders: scala.Option[scala.List[models.ConfigurationRecorder]] = None)
case object NoRunningConfigurationRecorderException
final case class ListDiscoveredResourcesRequest(resourceType: java.lang.String, resourceIds: scala.Option[scala.List[java.lang.String]] = None, resourceName: scala.Option[java.lang.String] = None, includeDeletedResources: scala.Option[scala.Boolean] = None, limit: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ConfigurationItem(supplementaryConfiguration: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None, tags: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = None, configurationItemStatus: scala.Option[java.lang.String] = None, availabilityZone: scala.Option[java.lang.String] = None, configurationItemCaptureTime: scala.Option[java.time.Instant] = None, relatedEvents: scala.Option[scala.List[java.lang.String]] = None, resourceName: scala.Option[java.lang.String] = None, awsRegion: scala.Option[java.lang.String] = None, relationships: scala.Option[scala.List[models.Relationship]] = None, resourceCreationTime: scala.Option[java.time.Instant] = None, configurationStateId: scala.Option[java.lang.String] = None, configuration: scala.Option[java.lang.String] = None, arn: scala.Option[java.lang.String] = None, version: scala.Option[java.lang.String] = None, accountId: scala.Option[java.lang.String] = None, resourceId: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, configurationItemMD5Hash: scala.Option[java.lang.String] = None)
case object InsufficientDeliveryPolicyException
final case class GetComplianceSummaryByConfigRuleResponse(complianceSummary: scala.Option[models.ComplianceSummary] = None)
case object NoSuchConfigurationRecorderException
case object InvalidTimeRangeException
final case class DeliveryChannel(name: scala.Option[java.lang.String] = None, s3BucketName: scala.Option[java.lang.String] = None, s3KeyPrefix: scala.Option[java.lang.String] = None, snsTopicARN: scala.Option[java.lang.String] = None, configSnapshotDeliveryProperties: scala.Option[models.ConfigSnapshotDeliveryProperties] = None)
final case class PutConfigurationRecorderRequest(configurationRecorder: models.ConfigurationRecorder)
final case class RecordingGroup(allSupported: scala.Option[scala.Boolean] = None, includeGlobalResourceTypes: scala.Option[scala.Boolean] = None, resourceTypes: scala.Option[scala.List[java.lang.String]] = None)
case object LastDeliveryChannelDeleteFailedException
case object MaxNumberOfConfigRulesExceededException
final case class GetComplianceSummaryByResourceTypeRequest(resourceTypes: scala.Option[scala.List[java.lang.String]] = None)
final case class GetComplianceDetailsByResourceResponse(evaluationResults: scala.Option[scala.List[models.EvaluationResult]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class GetComplianceDetailsByConfigRuleRequest(configRuleName: java.lang.String, complianceTypes: scala.Option[scala.List[java.lang.String]] = None, limit: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ConfigurationRecorder(name: scala.Option[java.lang.String] = None, roleARN: scala.Option[java.lang.String] = None, recordingGroup: scala.Option[models.RecordingGroup] = None)
final case class ResourceCount(resourceType: scala.Option[java.lang.String] = None, count: scala.Option[scala.Long] = None)
final case class GetComplianceDetailsByConfigRuleResponse(evaluationResults: scala.Option[scala.List[models.EvaluationResult]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class PutEvaluationsResponse(failedEvaluations: scala.Option[scala.List[models.Evaluation]] = None)
final case class DescribeDeliveryChannelsResponse(deliveryChannels: scala.Option[scala.List[models.DeliveryChannel]] = None)
final case class ComplianceSummary(compliantResourceCount: scala.Option[models.ComplianceContributorCount] = None, nonCompliantResourceCount: scala.Option[models.ComplianceContributorCount] = None, complianceSummaryTimestamp: scala.Option[java.time.Instant] = None)
final case class PutDeliveryChannelRequest(deliveryChannel: models.DeliveryChannel)
case object NoSuchBucketException
final case class EvaluationResult(resultToken: scala.Option[java.lang.String] = None, evaluationResultIdentifier: scala.Option[models.EvaluationResultIdentifier] = None, complianceType: scala.Option[java.lang.String] = None, annotation: scala.Option[java.lang.String] = None, resultRecordedTime: scala.Option[java.time.Instant] = None, configRuleInvokedTime: scala.Option[java.time.Instant] = None)
final case class DeleteConfigRuleRequest(configRuleName: java.lang.String)
case object InvalidConfigurationRecorderNameException
final case class DescribeConfigurationRecorderStatusRequest(configurationRecorderNames: scala.Option[scala.List[java.lang.String]] = None)
final case class DescribeConfigRuleEvaluationStatusRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None, limit: scala.Option[scala.Int] = None)
case object MaxNumberOfDeliveryChannelsExceededException
final case class ConfigRule(source: models.Source, maximumExecutionFrequency: scala.Option[java.lang.String] = None, inputParameters: scala.Option[java.lang.String] = None, configRuleArn: scala.Option[java.lang.String] = None, configRuleId: scala.Option[java.lang.String] = None, configRuleState: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, configRuleName: scala.Option[java.lang.String] = None, scope: scala.Option[models.Scope] = None)
final case class DescribeDeliveryChannelStatusResponse(deliveryChannelsStatus: scala.Option[scala.List[models.DeliveryChannelStatus]] = None)
case object ResourceInUseException
case object InsufficientPermissionsException
final case class ComplianceByConfigRule(configRuleName: scala.Option[java.lang.String] = None, compliance: scala.Option[models.Compliance] = None)
case object InvalidNextTokenException
final case class SourceDetail(eventSource: scala.Option[java.lang.String] = None, messageType: scala.Option[java.lang.String] = None, maximumExecutionFrequency: scala.Option[java.lang.String] = None)
final case class DeliverConfigSnapshotResponse(configSnapshotId: scala.Option[java.lang.String] = None)
case object NoAvailableConfigurationRecorderException
final case class ComplianceContributorCount(cappedCount: scala.Option[scala.Int] = None, capExceeded: scala.Option[scala.Boolean] = None)
final case class DescribeConfigRulesRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeConfigurationRecorderStatusResponse(configurationRecordersStatus: scala.Option[scala.List[models.ConfigurationRecorderStatus]] = None)
final case class ConfigStreamDeliveryInfo(lastStatus: scala.Option[java.lang.String] = None, lastErrorCode: scala.Option[java.lang.String] = None, lastErrorMessage: scala.Option[java.lang.String] = None, lastStatusChangeTime: scala.Option[java.time.Instant] = None)
final case class StartConfigurationRecorderRequest(configurationRecorderName: java.lang.String)
final case class EvaluationResultQualifier(configRuleName: scala.Option[java.lang.String] = None, resourceType: scala.Option[java.lang.String] = None, resourceId: scala.Option[java.lang.String] = None)
case object InvalidParameterValueException
final case class Scope(complianceResourceTypes: scala.Option[scala.List[java.lang.String]] = None, tagKey: scala.Option[java.lang.String] = None, tagValue: scala.Option[java.lang.String] = None, complianceResourceId: scala.Option[java.lang.String] = None)
final case class DeliveryChannelStatus(name: scala.Option[java.lang.String] = None, configSnapshotDeliveryInfo: scala.Option[models.ConfigExportDeliveryInfo] = None, configHistoryDeliveryInfo: scala.Option[models.ConfigExportDeliveryInfo] = None, configStreamDeliveryInfo: scala.Option[models.ConfigStreamDeliveryInfo] = None)
final case class ConfigRuleEvaluationStatus(configRuleName: scala.Option[java.lang.String] = None, configRuleArn: scala.Option[java.lang.String] = None, configRuleId: scala.Option[java.lang.String] = None, lastErrorCode: scala.Option[java.lang.String] = None, lastErrorMessage: scala.Option[java.lang.String] = None, firstActivatedTime: scala.Option[java.time.Instant] = None, lastFailedInvocationTime: scala.Option[java.time.Instant] = None, lastSuccessfulEvaluationTime: scala.Option[java.time.Instant] = None, lastFailedEvaluationTime: scala.Option[java.time.Instant] = None, lastSuccessfulInvocationTime: scala.Option[java.time.Instant] = None, firstEvaluationStarted: scala.Option[scala.Boolean] = None)
final case class ListDiscoveredResourcesResponse(resourceIdentifiers: scala.Option[scala.List[models.ResourceIdentifier]] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidResultTokenException
final case class DescribeComplianceByResourceResponse(complianceByResources: scala.Option[scala.List[models.ComplianceByResource]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Compliance(complianceType: scala.Option[java.lang.String] = None, complianceContributorCount: scala.Option[models.ComplianceContributorCount] = None)
case object StartConfigRulesEvaluationResponse
final case class DeliverConfigSnapshotRequest(deliveryChannelName: java.lang.String)
final case class DescribeComplianceByConfigRuleRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = None, complianceTypes: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
case object NoAvailableDeliveryChannelException
case object InvalidRecordingGroupException
case object LimitExceededException
final case class DeleteDeliveryChannelRequest(deliveryChannelName: java.lang.String)
final case class StopConfigurationRecorderRequest(configurationRecorderName: java.lang.String)
final case class ConfigSnapshotDeliveryProperties(deliveryFrequency: scala.Option[java.lang.String] = None)
final case class DescribeComplianceByConfigRuleResponse(complianceByConfigRules: scala.Option[scala.List[models.ComplianceByConfigRule]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class StartConfigRulesEvaluationRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = None)
final case class GetComplianceSummaryByResourceTypeResponse(complianceSummariesByResourceType: scala.Option[scala.List[models.ComplianceSummaryByResourceType]] = None)
final case class ConfigurationRecorderStatus(name: scala.Option[java.lang.String] = None, lastErrorCode: scala.Option[java.lang.String] = None, lastErrorMessage: scala.Option[java.lang.String] = None, lastStartTime: scala.Option[java.time.Instant] = None, lastStopTime: scala.Option[java.time.Instant] = None, lastStatusChangeTime: scala.Option[java.time.Instant] = None, recording: scala.Option[scala.Boolean] = None, lastStatus: scala.Option[java.lang.String] = None)
final case class GetDiscoveredResourceCountsResponse(totalDiscoveredResources: scala.Option[scala.Long] = None, resourceCounts: scala.Option[scala.List[models.ResourceCount]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeConfigRulesResponse(configRules: scala.Option[scala.List[models.ConfigRule]] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidLimitException
case object InvalidS3KeyPrefixException
final case class ComplianceSummaryByResourceType(resourceType: scala.Option[java.lang.String] = None, complianceSummary: scala.Option[models.ComplianceSummary] = None)