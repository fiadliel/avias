package avias.config.models
case object InvalidDeliveryChannelNameException
final case class Relationship(resourceType: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, resourceName: scala.Option[java.lang.String] = scala.None, relationshipName: scala.Option[java.lang.String] = scala.None)
final case class GetComplianceDetailsByResourceRequest(resourceType: java.lang.String, resourceId: java.lang.String, complianceTypes: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object ResourceNotDiscoveredException
final case class ComplianceByResource(resourceType: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, compliance: scala.Option[avias.config.models.Compliance] = scala.None)
case object ValidationException
final case class GetDiscoveredResourceCountsRequest(resourceTypes: scala.Option[scala.List[java.lang.String]] = scala.None, limit: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidRoleException
case object InvalidSNSTopicARNException
final case class DescribeDeliveryChannelStatusRequest(deliveryChannelNames: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class DescribeConfigurationRecordersRequest(configurationRecorderNames: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class GetResourceConfigHistoryResponse(configurationItems: scala.Option[scala.List[avias.config.models.ConfigurationItem]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeComplianceByResourceRequest(resourceId: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, complianceTypes: scala.Option[scala.List[java.lang.String]] = scala.None, limit: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ResourceIdentifier(resourceType: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, resourceName: scala.Option[java.lang.String] = scala.None, resourceDeletionTime: scala.Option[java.time.Instant] = scala.None)
final case class DescribeConfigRuleEvaluationStatusResponse(configRulesEvaluationStatus: scala.Option[scala.List[avias.config.models.ConfigRuleEvaluationStatus]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Source(owner: java.lang.String, sourceIdentifier: java.lang.String, sourceDetails: scala.Option[scala.List[avias.config.models.SourceDetail]] = scala.None)
case object NoSuchDeliveryChannelException
case object DeleteEvaluationResultsResponse
final case class ConfigExportDeliveryInfo(lastStatus: scala.Option[java.lang.String] = scala.None, lastErrorCode: scala.Option[java.lang.String] = scala.None, lastErrorMessage: scala.Option[java.lang.String] = scala.None, lastAttemptTime: scala.Option[java.time.Instant] = scala.None, lastSuccessfulTime: scala.Option[java.time.Instant] = scala.None, nextDeliveryTime: scala.Option[java.time.Instant] = scala.None)
final case class DeleteEvaluationResultsRequest(configRuleName: java.lang.String)
final case class PutConfigRuleRequest(configRule: avias.config.models.ConfigRule)
final case class DeleteConfigurationRecorderRequest(configurationRecorderName: java.lang.String)
case object NoSuchConfigRuleException
final case class EvaluationResultIdentifier(evaluationResultQualifier: scala.Option[avias.config.models.EvaluationResultQualifier] = scala.None, orderingTimestamp: scala.Option[java.time.Instant] = scala.None)
final case class PutEvaluationsRequest(resultToken: java.lang.String, evaluations: scala.Option[scala.List[avias.config.models.Evaluation]] = scala.None, testMode: scala.Option[scala.Boolean] = scala.None)
final case class Evaluation(complianceResourceType: java.lang.String, complianceResourceId: java.lang.String, complianceType: java.lang.String, orderingTimestamp: java.time.Instant, annotation: scala.Option[java.lang.String] = scala.None)
final case class DescribeDeliveryChannelsRequest(deliveryChannelNames: scala.Option[scala.List[java.lang.String]] = scala.None)
case object MaxNumberOfConfigurationRecordersExceededException
final case class GetResourceConfigHistoryRequest(resourceId: java.lang.String, resourceType: java.lang.String, laterTime: scala.Option[java.time.Instant] = scala.None, earlierTime: scala.Option[java.time.Instant] = scala.None, chronologicalOrder: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeConfigurationRecordersResponse(configurationRecorders: scala.Option[scala.List[avias.config.models.ConfigurationRecorder]] = scala.None)
case object NoRunningConfigurationRecorderException
final case class ListDiscoveredResourcesRequest(resourceType: java.lang.String, resourceIds: scala.Option[scala.List[java.lang.String]] = scala.None, resourceName: scala.Option[java.lang.String] = scala.None, includeDeletedResources: scala.Option[scala.Boolean] = scala.None, limit: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ConfigurationItem(supplementaryConfiguration: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, tags: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, configurationItemStatus: scala.Option[java.lang.String] = scala.None, availabilityZone: scala.Option[java.lang.String] = scala.None, configurationItemCaptureTime: scala.Option[java.time.Instant] = scala.None, relatedEvents: scala.Option[scala.List[java.lang.String]] = scala.None, resourceName: scala.Option[java.lang.String] = scala.None, awsRegion: scala.Option[java.lang.String] = scala.None, relationships: scala.Option[scala.List[avias.config.models.Relationship]] = scala.None, resourceCreationTime: scala.Option[java.time.Instant] = scala.None, configurationStateId: scala.Option[java.lang.String] = scala.None, configuration: scala.Option[java.lang.String] = scala.None, arn: scala.Option[java.lang.String] = scala.None, version: scala.Option[java.lang.String] = scala.None, accountId: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, configurationItemMD5Hash: scala.Option[java.lang.String] = scala.None)
case object InsufficientDeliveryPolicyException
final case class GetComplianceSummaryByConfigRuleResponse(complianceSummary: scala.Option[avias.config.models.ComplianceSummary] = scala.None)
case object NoSuchConfigurationRecorderException
case object InvalidTimeRangeException
final case class DeliveryChannel(name: scala.Option[java.lang.String] = scala.None, s3BucketName: scala.Option[java.lang.String] = scala.None, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, snsTopicARN: scala.Option[java.lang.String] = scala.None, configSnapshotDeliveryProperties: scala.Option[avias.config.models.ConfigSnapshotDeliveryProperties] = scala.None)
final case class PutConfigurationRecorderRequest(configurationRecorder: avias.config.models.ConfigurationRecorder)
final case class RecordingGroup(allSupported: scala.Option[scala.Boolean] = scala.None, includeGlobalResourceTypes: scala.Option[scala.Boolean] = scala.None, resourceTypes: scala.Option[scala.List[java.lang.String]] = scala.None)
case object LastDeliveryChannelDeleteFailedException
case object MaxNumberOfConfigRulesExceededException
final case class GetComplianceSummaryByResourceTypeRequest(resourceTypes: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class GetComplianceDetailsByResourceResponse(evaluationResults: scala.Option[scala.List[avias.config.models.EvaluationResult]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetComplianceDetailsByConfigRuleRequest(configRuleName: java.lang.String, complianceTypes: scala.Option[scala.List[java.lang.String]] = scala.None, limit: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ConfigurationRecorder(name: scala.Option[java.lang.String] = scala.None, roleARN: scala.Option[java.lang.String] = scala.None, recordingGroup: scala.Option[avias.config.models.RecordingGroup] = scala.None)
final case class ResourceCount(resourceType: scala.Option[java.lang.String] = scala.None, count: scala.Option[scala.Long] = scala.None)
final case class GetComplianceDetailsByConfigRuleResponse(evaluationResults: scala.Option[scala.List[avias.config.models.EvaluationResult]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class PutEvaluationsResponse(failedEvaluations: scala.Option[scala.List[avias.config.models.Evaluation]] = scala.None)
final case class DescribeDeliveryChannelsResponse(deliveryChannels: scala.Option[scala.List[avias.config.models.DeliveryChannel]] = scala.None)
final case class ComplianceSummary(compliantResourceCount: scala.Option[avias.config.models.ComplianceContributorCount] = scala.None, nonCompliantResourceCount: scala.Option[avias.config.models.ComplianceContributorCount] = scala.None, complianceSummaryTimestamp: scala.Option[java.time.Instant] = scala.None)
final case class PutDeliveryChannelRequest(deliveryChannel: avias.config.models.DeliveryChannel)
case object NoSuchBucketException
final case class EvaluationResult(resultToken: scala.Option[java.lang.String] = scala.None, evaluationResultIdentifier: scala.Option[avias.config.models.EvaluationResultIdentifier] = scala.None, complianceType: scala.Option[java.lang.String] = scala.None, annotation: scala.Option[java.lang.String] = scala.None, resultRecordedTime: scala.Option[java.time.Instant] = scala.None, configRuleInvokedTime: scala.Option[java.time.Instant] = scala.None)
final case class DeleteConfigRuleRequest(configRuleName: java.lang.String)
case object InvalidConfigurationRecorderNameException
final case class DescribeConfigurationRecorderStatusRequest(configurationRecorderNames: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class DescribeConfigRuleEvaluationStatusRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Int] = scala.None)
case object MaxNumberOfDeliveryChannelsExceededException
final case class ConfigRule(source: avias.config.models.Source, maximumExecutionFrequency: scala.Option[java.lang.String] = scala.None, inputParameters: scala.Option[java.lang.String] = scala.None, configRuleArn: scala.Option[java.lang.String] = scala.None, configRuleId: scala.Option[java.lang.String] = scala.None, configRuleState: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, configRuleName: scala.Option[java.lang.String] = scala.None, scope: scala.Option[avias.config.models.Scope] = scala.None)
final case class DescribeDeliveryChannelStatusResponse(deliveryChannelsStatus: scala.Option[scala.List[avias.config.models.DeliveryChannelStatus]] = scala.None)
case object ResourceInUseException
case object InsufficientPermissionsException
final case class ComplianceByConfigRule(configRuleName: scala.Option[java.lang.String] = scala.None, compliance: scala.Option[avias.config.models.Compliance] = scala.None)
case object InvalidNextTokenException
final case class SourceDetail(eventSource: scala.Option[java.lang.String] = scala.None, messageType: scala.Option[java.lang.String] = scala.None, maximumExecutionFrequency: scala.Option[java.lang.String] = scala.None)
final case class DeliverConfigSnapshotResponse(configSnapshotId: scala.Option[java.lang.String] = scala.None)
case object NoAvailableConfigurationRecorderException
final case class ComplianceContributorCount(cappedCount: scala.Option[scala.Int] = scala.None, capExceeded: scala.Option[scala.Boolean] = scala.None)
final case class DescribeConfigRulesRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeConfigurationRecorderStatusResponse(configurationRecordersStatus: scala.Option[scala.List[avias.config.models.ConfigurationRecorderStatus]] = scala.None)
final case class ConfigStreamDeliveryInfo(lastStatus: scala.Option[java.lang.String] = scala.None, lastErrorCode: scala.Option[java.lang.String] = scala.None, lastErrorMessage: scala.Option[java.lang.String] = scala.None, lastStatusChangeTime: scala.Option[java.time.Instant] = scala.None)
final case class StartConfigurationRecorderRequest(configurationRecorderName: java.lang.String)
final case class EvaluationResultQualifier(configRuleName: scala.Option[java.lang.String] = scala.None, resourceType: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None)
case object InvalidParameterValueException
final case class Scope(complianceResourceTypes: scala.Option[scala.List[java.lang.String]] = scala.None, tagKey: scala.Option[java.lang.String] = scala.None, tagValue: scala.Option[java.lang.String] = scala.None, complianceResourceId: scala.Option[java.lang.String] = scala.None)
final case class DeliveryChannelStatus(name: scala.Option[java.lang.String] = scala.None, configSnapshotDeliveryInfo: scala.Option[avias.config.models.ConfigExportDeliveryInfo] = scala.None, configHistoryDeliveryInfo: scala.Option[avias.config.models.ConfigExportDeliveryInfo] = scala.None, configStreamDeliveryInfo: scala.Option[avias.config.models.ConfigStreamDeliveryInfo] = scala.None)
final case class ConfigRuleEvaluationStatus(configRuleName: scala.Option[java.lang.String] = scala.None, configRuleArn: scala.Option[java.lang.String] = scala.None, configRuleId: scala.Option[java.lang.String] = scala.None, lastErrorCode: scala.Option[java.lang.String] = scala.None, lastErrorMessage: scala.Option[java.lang.String] = scala.None, firstActivatedTime: scala.Option[java.time.Instant] = scala.None, lastFailedInvocationTime: scala.Option[java.time.Instant] = scala.None, lastSuccessfulEvaluationTime: scala.Option[java.time.Instant] = scala.None, lastFailedEvaluationTime: scala.Option[java.time.Instant] = scala.None, lastSuccessfulInvocationTime: scala.Option[java.time.Instant] = scala.None, firstEvaluationStarted: scala.Option[scala.Boolean] = scala.None)
final case class ListDiscoveredResourcesResponse(resourceIdentifiers: scala.Option[scala.List[avias.config.models.ResourceIdentifier]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidResultTokenException
final case class DescribeComplianceByResourceResponse(complianceByResources: scala.Option[scala.List[avias.config.models.ComplianceByResource]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Compliance(complianceType: scala.Option[java.lang.String] = scala.None, complianceContributorCount: scala.Option[avias.config.models.ComplianceContributorCount] = scala.None)
case object StartConfigRulesEvaluationResponse
final case class DeliverConfigSnapshotRequest(deliveryChannelName: java.lang.String)
final case class DescribeComplianceByConfigRuleRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = scala.None, complianceTypes: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object NoAvailableDeliveryChannelException
case object InvalidRecordingGroupException
case object LimitExceededException
final case class DeleteDeliveryChannelRequest(deliveryChannelName: java.lang.String)
final case class StopConfigurationRecorderRequest(configurationRecorderName: java.lang.String)
final case class ConfigSnapshotDeliveryProperties(deliveryFrequency: scala.Option[java.lang.String] = scala.None)
final case class DescribeComplianceByConfigRuleResponse(complianceByConfigRules: scala.Option[scala.List[avias.config.models.ComplianceByConfigRule]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class StartConfigRulesEvaluationRequest(configRuleNames: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class GetComplianceSummaryByResourceTypeResponse(complianceSummariesByResourceType: scala.Option[scala.List[avias.config.models.ComplianceSummaryByResourceType]] = scala.None)
final case class ConfigurationRecorderStatus(name: scala.Option[java.lang.String] = scala.None, lastErrorCode: scala.Option[java.lang.String] = scala.None, lastErrorMessage: scala.Option[java.lang.String] = scala.None, lastStartTime: scala.Option[java.time.Instant] = scala.None, lastStopTime: scala.Option[java.time.Instant] = scala.None, lastStatusChangeTime: scala.Option[java.time.Instant] = scala.None, recording: scala.Option[scala.Boolean] = scala.None, lastStatus: scala.Option[java.lang.String] = scala.None)
final case class GetDiscoveredResourceCountsResponse(totalDiscoveredResources: scala.Option[scala.Long] = scala.None, resourceCounts: scala.Option[scala.List[avias.config.models.ResourceCount]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeConfigRulesResponse(configRules: scala.Option[scala.List[avias.config.models.ConfigRule]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidLimitException
case object InvalidS3KeyPrefixException
final case class ComplianceSummaryByResourceType(resourceType: scala.Option[java.lang.String] = scala.None, complianceSummary: scala.Option[avias.config.models.ComplianceSummary] = scala.None)