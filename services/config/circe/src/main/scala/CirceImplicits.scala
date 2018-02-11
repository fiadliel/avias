package org.lyranthe.araethura.config
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val InvalidDeliveryChannelNameExceptionEncoder: io.circe.Encoder[models.InvalidDeliveryChannelNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RelationshipEncoder: io.circe.Encoder[models.Relationship] = io.circe.Encoder.instance { o => 
    Json.obj("resourceType" -> o.resourceType.asJson, "resourceId" -> o.resourceId.asJson, "resourceName" -> o.resourceName.asJson, "relationshipName" -> o.relationshipName.asJson)
  }
  final implicit val GetComplianceDetailsByResourceRequestEncoder: io.circe.Encoder[models.GetComplianceDetailsByResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceId" -> o.resourceId.asJson, "ComplianceTypes" -> o.complianceTypes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceNotDiscoveredExceptionEncoder: io.circe.Encoder[models.ResourceNotDiscoveredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComplianceByResourceEncoder: io.circe.Encoder[models.ComplianceByResource] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceId" -> o.resourceId.asJson, "Compliance" -> o.compliance.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[models.ValidationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDiscoveredResourceCountsRequestEncoder: io.circe.Encoder[models.GetDiscoveredResourceCountsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceTypes" -> o.resourceTypes.asJson, "limit" -> o.limit.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidRoleExceptionEncoder: io.circe.Encoder[models.InvalidRoleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSNSTopicARNExceptionEncoder: io.circe.Encoder[models.InvalidSNSTopicARNException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDeliveryChannelStatusRequestEncoder: io.circe.Encoder[models.DescribeDeliveryChannelStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryChannelNames" -> o.deliveryChannelNames.asJson)
  }
  final implicit val DescribeConfigurationRecordersRequestEncoder: io.circe.Encoder[models.DescribeConfigurationRecordersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorderNames" -> o.configurationRecorderNames.asJson)
  }
  final implicit val GetResourceConfigHistoryResponseEncoder: io.circe.Encoder[models.GetResourceConfigHistoryResponse] = io.circe.Encoder.instance { o => 
    Json.obj("configurationItems" -> o.configurationItems.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeComplianceByResourceRequestEncoder: io.circe.Encoder[models.DescribeComplianceByResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "ResourceType" -> o.resourceType.asJson, "ComplianceTypes" -> o.complianceTypes.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceIdentifierEncoder: io.circe.Encoder[models.ResourceIdentifier] = io.circe.Encoder.instance { o => 
    Json.obj("resourceType" -> o.resourceType.asJson, "resourceId" -> o.resourceId.asJson, "resourceName" -> o.resourceName.asJson, "resourceDeletionTime" -> o.resourceDeletionTime.asJson)
  }
  final implicit val DescribeConfigRuleEvaluationStatusResponseEncoder: io.circe.Encoder[models.DescribeConfigRuleEvaluationStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRulesEvaluationStatus" -> o.configRulesEvaluationStatus.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val SourceEncoder: io.circe.Encoder[models.Source] = io.circe.Encoder.instance { o => 
    Json.obj("Owner" -> o.owner.asJson, "SourceIdentifier" -> o.sourceIdentifier.asJson, "SourceDetails" -> o.sourceDetails.asJson)
  }
  final implicit val NoSuchDeliveryChannelExceptionEncoder: io.circe.Encoder[models.NoSuchDeliveryChannelException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteEvaluationResultsResponseEncoder: io.circe.Encoder[models.DeleteEvaluationResultsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ConfigExportDeliveryInfoEncoder: io.circe.Encoder[models.ConfigExportDeliveryInfo] = io.circe.Encoder.instance { o => 
    Json.obj("lastStatus" -> o.lastStatus.asJson, "lastErrorCode" -> o.lastErrorCode.asJson, "lastErrorMessage" -> o.lastErrorMessage.asJson, "lastAttemptTime" -> o.lastAttemptTime.asJson, "lastSuccessfulTime" -> o.lastSuccessfulTime.asJson, "nextDeliveryTime" -> o.nextDeliveryTime.asJson)
  }
  final implicit val DeleteEvaluationResultsRequestEncoder: io.circe.Encoder[models.DeleteEvaluationResultsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleName" -> o.configRuleName.asJson)
  }
  final implicit val PutConfigRuleRequestEncoder: io.circe.Encoder[models.PutConfigRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRule" -> o.configRule.asJson)
  }
  final implicit val DeleteConfigurationRecorderRequestEncoder: io.circe.Encoder[models.DeleteConfigurationRecorderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorderName" -> o.configurationRecorderName.asJson)
  }
  final implicit val NoSuchConfigRuleExceptionEncoder: io.circe.Encoder[models.NoSuchConfigRuleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EvaluationResultIdentifierEncoder: io.circe.Encoder[models.EvaluationResultIdentifier] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationResultQualifier" -> o.evaluationResultQualifier.asJson, "OrderingTimestamp" -> o.orderingTimestamp.asJson)
  }
  final implicit val PutEvaluationsRequestEncoder: io.circe.Encoder[models.PutEvaluationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResultToken" -> o.resultToken.asJson, "Evaluations" -> o.evaluations.asJson, "TestMode" -> o.testMode.asJson)
  }
  final implicit val EvaluationEncoder: io.circe.Encoder[models.Evaluation] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceResourceType" -> o.complianceResourceType.asJson, "ComplianceResourceId" -> o.complianceResourceId.asJson, "ComplianceType" -> o.complianceType.asJson, "OrderingTimestamp" -> o.orderingTimestamp.asJson, "Annotation" -> o.annotation.asJson)
  }
  final implicit val DescribeDeliveryChannelsRequestEncoder: io.circe.Encoder[models.DescribeDeliveryChannelsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryChannelNames" -> o.deliveryChannelNames.asJson)
  }
  final implicit val MaxNumberOfConfigurationRecordersExceededExceptionEncoder: io.circe.Encoder[models.MaxNumberOfConfigurationRecordersExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetResourceConfigHistoryRequestEncoder: io.circe.Encoder[models.GetResourceConfigHistoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceId" -> o.resourceId.asJson, "resourceType" -> o.resourceType.asJson, "laterTime" -> o.laterTime.asJson, "earlierTime" -> o.earlierTime.asJson, "chronologicalOrder" -> o.chronologicalOrder.asJson, "limit" -> o.limit.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeConfigurationRecordersResponseEncoder: io.circe.Encoder[models.DescribeConfigurationRecordersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorders" -> o.configurationRecorders.asJson)
  }
  final implicit val NoRunningConfigurationRecorderExceptionEncoder: io.circe.Encoder[models.NoRunningConfigurationRecorderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListDiscoveredResourcesRequestEncoder: io.circe.Encoder[models.ListDiscoveredResourcesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceType" -> o.resourceType.asJson, "resourceIds" -> o.resourceIds.asJson, "resourceName" -> o.resourceName.asJson, "includeDeletedResources" -> o.includeDeletedResources.asJson, "limit" -> o.limit.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ConfigurationItemEncoder: io.circe.Encoder[models.ConfigurationItem] = io.circe.Encoder.instance { o => 
    Json.obj("supplementaryConfiguration" -> o.supplementaryConfiguration.asJson, "tags" -> o.tags.asJson, "configurationItemStatus" -> o.configurationItemStatus.asJson, "availabilityZone" -> o.availabilityZone.asJson, "configurationItemCaptureTime" -> o.configurationItemCaptureTime.asJson, "relatedEvents" -> o.relatedEvents.asJson, "resourceName" -> o.resourceName.asJson, "awsRegion" -> o.awsRegion.asJson, "relationships" -> o.relationships.asJson, "resourceCreationTime" -> o.resourceCreationTime.asJson, "configurationStateId" -> o.configurationStateId.asJson, "configuration" -> o.configuration.asJson, "arn" -> o.arn.asJson, "version" -> o.version.asJson, "accountId" -> o.accountId.asJson, "resourceId" -> o.resourceId.asJson, "resourceType" -> o.resourceType.asJson, "configurationItemMD5Hash" -> o.configurationItemMD5Hash.asJson)
  }
  final implicit val InsufficientDeliveryPolicyExceptionEncoder: io.circe.Encoder[models.InsufficientDeliveryPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetComplianceSummaryByConfigRuleResponseEncoder: io.circe.Encoder[models.GetComplianceSummaryByConfigRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceSummary" -> o.complianceSummary.asJson)
  }
  final implicit val NoSuchConfigurationRecorderExceptionEncoder: io.circe.Encoder[models.NoSuchConfigurationRecorderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTimeRangeExceptionEncoder: io.circe.Encoder[models.InvalidTimeRangeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeliveryChannelEncoder: io.circe.Encoder[models.DeliveryChannel] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "s3BucketName" -> o.s3BucketName.asJson, "s3KeyPrefix" -> o.s3KeyPrefix.asJson, "snsTopicARN" -> o.snsTopicARN.asJson, "configSnapshotDeliveryProperties" -> o.configSnapshotDeliveryProperties.asJson)
  }
  final implicit val PutConfigurationRecorderRequestEncoder: io.circe.Encoder[models.PutConfigurationRecorderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorder" -> o.configurationRecorder.asJson)
  }
  final implicit val RecordingGroupEncoder: io.circe.Encoder[models.RecordingGroup] = io.circe.Encoder.instance { o => 
    Json.obj("allSupported" -> o.allSupported.asJson, "includeGlobalResourceTypes" -> o.includeGlobalResourceTypes.asJson, "resourceTypes" -> o.resourceTypes.asJson)
  }
  final implicit val LastDeliveryChannelDeleteFailedExceptionEncoder: io.circe.Encoder[models.LastDeliveryChannelDeleteFailedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MaxNumberOfConfigRulesExceededExceptionEncoder: io.circe.Encoder[models.MaxNumberOfConfigRulesExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetComplianceSummaryByResourceTypeRequestEncoder: io.circe.Encoder[models.GetComplianceSummaryByResourceTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceTypes" -> o.resourceTypes.asJson)
  }
  final implicit val GetComplianceDetailsByResourceResponseEncoder: io.circe.Encoder[models.GetComplianceDetailsByResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationResults" -> o.evaluationResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetComplianceDetailsByConfigRuleRequestEncoder: io.circe.Encoder[models.GetComplianceDetailsByConfigRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleName" -> o.configRuleName.asJson, "ComplianceTypes" -> o.complianceTypes.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConfigurationRecorderEncoder: io.circe.Encoder[models.ConfigurationRecorder] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "roleARN" -> o.roleARN.asJson, "recordingGroup" -> o.recordingGroup.asJson)
  }
  final implicit val ResourceCountEncoder: io.circe.Encoder[models.ResourceCount] = io.circe.Encoder.instance { o => 
    Json.obj("resourceType" -> o.resourceType.asJson, "count" -> o.count.asJson)
  }
  final implicit val GetComplianceDetailsByConfigRuleResponseEncoder: io.circe.Encoder[models.GetComplianceDetailsByConfigRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EvaluationResults" -> o.evaluationResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PutEvaluationsResponseEncoder: io.circe.Encoder[models.PutEvaluationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FailedEvaluations" -> o.failedEvaluations.asJson)
  }
  final implicit val DescribeDeliveryChannelsResponseEncoder: io.circe.Encoder[models.DescribeDeliveryChannelsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryChannels" -> o.deliveryChannels.asJson)
  }
  final implicit val ComplianceSummaryEncoder: io.circe.Encoder[models.ComplianceSummary] = io.circe.Encoder.instance { o => 
    Json.obj("CompliantResourceCount" -> o.compliantResourceCount.asJson, "NonCompliantResourceCount" -> o.nonCompliantResourceCount.asJson, "ComplianceSummaryTimestamp" -> o.complianceSummaryTimestamp.asJson)
  }
  final implicit val PutDeliveryChannelRequestEncoder: io.circe.Encoder[models.PutDeliveryChannelRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryChannel" -> o.deliveryChannel.asJson)
  }
  final implicit val NoSuchBucketExceptionEncoder: io.circe.Encoder[models.NoSuchBucketException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EvaluationResultEncoder: io.circe.Encoder[models.EvaluationResult] = io.circe.Encoder.instance { o => 
    Json.obj("ResultToken" -> o.resultToken.asJson, "EvaluationResultIdentifier" -> o.evaluationResultIdentifier.asJson, "ComplianceType" -> o.complianceType.asJson, "Annotation" -> o.annotation.asJson, "ResultRecordedTime" -> o.resultRecordedTime.asJson, "ConfigRuleInvokedTime" -> o.configRuleInvokedTime.asJson)
  }
  final implicit val DeleteConfigRuleRequestEncoder: io.circe.Encoder[models.DeleteConfigRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleName" -> o.configRuleName.asJson)
  }
  final implicit val InvalidConfigurationRecorderNameExceptionEncoder: io.circe.Encoder[models.InvalidConfigurationRecorderNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeConfigurationRecorderStatusRequestEncoder: io.circe.Encoder[models.DescribeConfigurationRecorderStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorderNames" -> o.configurationRecorderNames.asJson)
  }
  final implicit val DescribeConfigRuleEvaluationStatusRequestEncoder: io.circe.Encoder[models.DescribeConfigRuleEvaluationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleNames" -> o.configRuleNames.asJson, "NextToken" -> o.nextToken.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val MaxNumberOfDeliveryChannelsExceededExceptionEncoder: io.circe.Encoder[models.MaxNumberOfDeliveryChannelsExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ConfigRuleEncoder: io.circe.Encoder[models.ConfigRule] = io.circe.Encoder.instance { o => 
    Json.obj("Source" -> o.source.asJson, "MaximumExecutionFrequency" -> o.maximumExecutionFrequency.asJson, "InputParameters" -> o.inputParameters.asJson, "ConfigRuleArn" -> o.configRuleArn.asJson, "ConfigRuleId" -> o.configRuleId.asJson, "ConfigRuleState" -> o.configRuleState.asJson, "Description" -> o.description.asJson, "ConfigRuleName" -> o.configRuleName.asJson, "Scope" -> o.scope.asJson)
  }
  final implicit val DescribeDeliveryChannelStatusResponseEncoder: io.circe.Encoder[models.DescribeDeliveryChannelStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryChannelsStatus" -> o.deliveryChannelsStatus.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[models.ResourceInUseException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InsufficientPermissionsExceptionEncoder: io.circe.Encoder[models.InsufficientPermissionsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComplianceByConfigRuleEncoder: io.circe.Encoder[models.ComplianceByConfigRule] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleName" -> o.configRuleName.asJson, "Compliance" -> o.compliance.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SourceDetailEncoder: io.circe.Encoder[models.SourceDetail] = io.circe.Encoder.instance { o => 
    Json.obj("EventSource" -> o.eventSource.asJson, "MessageType" -> o.messageType.asJson, "MaximumExecutionFrequency" -> o.maximumExecutionFrequency.asJson)
  }
  final implicit val DeliverConfigSnapshotResponseEncoder: io.circe.Encoder[models.DeliverConfigSnapshotResponse] = io.circe.Encoder.instance { o => 
    Json.obj("configSnapshotId" -> o.configSnapshotId.asJson)
  }
  final implicit val NoAvailableConfigurationRecorderExceptionEncoder: io.circe.Encoder[models.NoAvailableConfigurationRecorderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComplianceContributorCountEncoder: io.circe.Encoder[models.ComplianceContributorCount] = io.circe.Encoder.instance { o => 
    Json.obj("CappedCount" -> o.cappedCount.asJson, "CapExceeded" -> o.capExceeded.asJson)
  }
  final implicit val DescribeConfigRulesRequestEncoder: io.circe.Encoder[models.DescribeConfigRulesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleNames" -> o.configRuleNames.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeConfigurationRecorderStatusResponseEncoder: io.circe.Encoder[models.DescribeConfigurationRecorderStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecordersStatus" -> o.configurationRecordersStatus.asJson)
  }
  final implicit val ConfigStreamDeliveryInfoEncoder: io.circe.Encoder[models.ConfigStreamDeliveryInfo] = io.circe.Encoder.instance { o => 
    Json.obj("lastStatus" -> o.lastStatus.asJson, "lastErrorCode" -> o.lastErrorCode.asJson, "lastErrorMessage" -> o.lastErrorMessage.asJson, "lastStatusChangeTime" -> o.lastStatusChangeTime.asJson)
  }
  final implicit val StartConfigurationRecorderRequestEncoder: io.circe.Encoder[models.StartConfigurationRecorderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorderName" -> o.configurationRecorderName.asJson)
  }
  final implicit val EvaluationResultQualifierEncoder: io.circe.Encoder[models.EvaluationResultQualifier] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleName" -> o.configRuleName.asJson, "ResourceType" -> o.resourceType.asJson, "ResourceId" -> o.resourceId.asJson)
  }
  final implicit val InvalidParameterValueExceptionEncoder: io.circe.Encoder[models.InvalidParameterValueException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ScopeEncoder: io.circe.Encoder[models.Scope] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceResourceTypes" -> o.complianceResourceTypes.asJson, "TagKey" -> o.tagKey.asJson, "TagValue" -> o.tagValue.asJson, "ComplianceResourceId" -> o.complianceResourceId.asJson)
  }
  final implicit val DeliveryChannelStatusEncoder: io.circe.Encoder[models.DeliveryChannelStatus] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "configSnapshotDeliveryInfo" -> o.configSnapshotDeliveryInfo.asJson, "configHistoryDeliveryInfo" -> o.configHistoryDeliveryInfo.asJson, "configStreamDeliveryInfo" -> o.configStreamDeliveryInfo.asJson)
  }
  final implicit val ConfigRuleEvaluationStatusEncoder: io.circe.Encoder[models.ConfigRuleEvaluationStatus] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleName" -> o.configRuleName.asJson, "ConfigRuleArn" -> o.configRuleArn.asJson, "ConfigRuleId" -> o.configRuleId.asJson, "LastErrorCode" -> o.lastErrorCode.asJson, "LastErrorMessage" -> o.lastErrorMessage.asJson, "FirstActivatedTime" -> o.firstActivatedTime.asJson, "LastFailedInvocationTime" -> o.lastFailedInvocationTime.asJson, "LastSuccessfulEvaluationTime" -> o.lastSuccessfulEvaluationTime.asJson, "LastFailedEvaluationTime" -> o.lastFailedEvaluationTime.asJson, "LastSuccessfulInvocationTime" -> o.lastSuccessfulInvocationTime.asJson, "FirstEvaluationStarted" -> o.firstEvaluationStarted.asJson)
  }
  final implicit val ListDiscoveredResourcesResponseEncoder: io.circe.Encoder[models.ListDiscoveredResourcesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourceIdentifiers" -> o.resourceIdentifiers.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidResultTokenExceptionEncoder: io.circe.Encoder[models.InvalidResultTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeComplianceByResourceResponseEncoder: io.circe.Encoder[models.DescribeComplianceByResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceByResources" -> o.complianceByResources.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ComplianceEncoder: io.circe.Encoder[models.Compliance] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceType" -> o.complianceType.asJson, "ComplianceContributorCount" -> o.complianceContributorCount.asJson)
  }
  final implicit val StartConfigRulesEvaluationResponseEncoder: io.circe.Encoder[models.StartConfigRulesEvaluationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeliverConfigSnapshotRequestEncoder: io.circe.Encoder[models.DeliverConfigSnapshotRequest] = io.circe.Encoder.instance { o => 
    Json.obj("deliveryChannelName" -> o.deliveryChannelName.asJson)
  }
  final implicit val DescribeComplianceByConfigRuleRequestEncoder: io.circe.Encoder[models.DescribeComplianceByConfigRuleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleNames" -> o.configRuleNames.asJson, "ComplianceTypes" -> o.complianceTypes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val NoAvailableDeliveryChannelExceptionEncoder: io.circe.Encoder[models.NoAvailableDeliveryChannelException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRecordingGroupExceptionEncoder: io.circe.Encoder[models.InvalidRecordingGroupException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteDeliveryChannelRequestEncoder: io.circe.Encoder[models.DeleteDeliveryChannelRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryChannelName" -> o.deliveryChannelName.asJson)
  }
  final implicit val StopConfigurationRecorderRequestEncoder: io.circe.Encoder[models.StopConfigurationRecorderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigurationRecorderName" -> o.configurationRecorderName.asJson)
  }
  final implicit val ConfigSnapshotDeliveryPropertiesEncoder: io.circe.Encoder[models.ConfigSnapshotDeliveryProperties] = io.circe.Encoder.instance { o => 
    Json.obj("deliveryFrequency" -> o.deliveryFrequency.asJson)
  }
  final implicit val DescribeComplianceByConfigRuleResponseEncoder: io.circe.Encoder[models.DescribeComplianceByConfigRuleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceByConfigRules" -> o.complianceByConfigRules.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StartConfigRulesEvaluationRequestEncoder: io.circe.Encoder[models.StartConfigRulesEvaluationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRuleNames" -> o.configRuleNames.asJson)
  }
  final implicit val GetComplianceSummaryByResourceTypeResponseEncoder: io.circe.Encoder[models.GetComplianceSummaryByResourceTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ComplianceSummariesByResourceType" -> o.complianceSummariesByResourceType.asJson)
  }
  final implicit val ConfigurationRecorderStatusEncoder: io.circe.Encoder[models.ConfigurationRecorderStatus] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "lastErrorCode" -> o.lastErrorCode.asJson, "lastErrorMessage" -> o.lastErrorMessage.asJson, "lastStartTime" -> o.lastStartTime.asJson, "lastStopTime" -> o.lastStopTime.asJson, "lastStatusChangeTime" -> o.lastStatusChangeTime.asJson, "recording" -> o.recording.asJson, "lastStatus" -> o.lastStatus.asJson)
  }
  final implicit val GetDiscoveredResourceCountsResponseEncoder: io.circe.Encoder[models.GetDiscoveredResourceCountsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("totalDiscoveredResources" -> o.totalDiscoveredResources.asJson, "resourceCounts" -> o.resourceCounts.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeConfigRulesResponseEncoder: io.circe.Encoder[models.DescribeConfigRulesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigRules" -> o.configRules.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidLimitExceptionEncoder: io.circe.Encoder[models.InvalidLimitException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidS3KeyPrefixExceptionEncoder: io.circe.Encoder[models.InvalidS3KeyPrefixException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ComplianceSummaryByResourceTypeEncoder: io.circe.Encoder[models.ComplianceSummaryByResourceType] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ComplianceSummary" -> o.complianceSummary.asJson)
  }
  final implicit val InvalidDeliveryChannelNameExceptionDecoder: io.circe.Decoder[models.InvalidDeliveryChannelNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDeliveryChannelNameException)
  final implicit val RelationshipDecoder: io.circe.Decoder[models.Relationship] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("resourceId"), o.get[scala.Option[java.lang.String]]("resourceName"), o.get[scala.Option[java.lang.String]]("relationshipName")).mapN(models.Relationship.apply _)
  }
  final implicit val GetComplianceDetailsByResourceRequestDecoder: io.circe.Decoder[models.GetComplianceDetailsByResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceType"), o.get[java.lang.String]("ResourceId"), o.get[scala.Option[scala.List[java.lang.String]]]("ComplianceTypes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetComplianceDetailsByResourceRequest.apply _)
  }
  final implicit val ResourceNotDiscoveredExceptionDecoder: io.circe.Decoder[models.ResourceNotDiscoveredException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceNotDiscoveredException)
  final implicit val ComplianceByResourceDecoder: io.circe.Decoder[models.ComplianceByResource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[models.Compliance]]("Compliance")).mapN(models.ComplianceByResource.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[models.ValidationException.type] = io.circe.Decoder.decodeUnit.as(models.ValidationException)
  final implicit val GetDiscoveredResourceCountsRequestDecoder: io.circe.Decoder[models.GetDiscoveredResourceCountsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("resourceTypes"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetDiscoveredResourceCountsRequest.apply _)
  }
  final implicit val InvalidRoleExceptionDecoder: io.circe.Decoder[models.InvalidRoleException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRoleException)
  final implicit val InvalidSNSTopicARNExceptionDecoder: io.circe.Decoder[models.InvalidSNSTopicARNException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSNSTopicARNException)
  final implicit val DescribeDeliveryChannelStatusRequestDecoder: io.circe.Decoder[models.DescribeDeliveryChannelStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("DeliveryChannelNames").map(models.DescribeDeliveryChannelStatusRequest.apply _)
  }
  final implicit val DescribeConfigurationRecordersRequestDecoder: io.circe.Decoder[models.DescribeConfigurationRecordersRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("ConfigurationRecorderNames").map(models.DescribeConfigurationRecordersRequest.apply _)
  }
  final implicit val GetResourceConfigHistoryResponseDecoder: io.circe.Decoder[models.GetResourceConfigHistoryResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ConfigurationItem]]]("configurationItems"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetResourceConfigHistoryResponse.apply _)
  }
  final implicit val DescribeComplianceByResourceRequestDecoder: io.circe.Decoder[models.DescribeComplianceByResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[scala.List[java.lang.String]]]("ComplianceTypes"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeComplianceByResourceRequest.apply _)
  }
  final implicit val ResourceIdentifierDecoder: io.circe.Decoder[models.ResourceIdentifier] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("resourceId"), o.get[scala.Option[java.lang.String]]("resourceName"), o.get[scala.Option[java.time.Instant]]("resourceDeletionTime")).mapN(models.ResourceIdentifier.apply _)
  }
  final implicit val DescribeConfigRuleEvaluationStatusResponseDecoder: io.circe.Decoder[models.DescribeConfigRuleEvaluationStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ConfigRuleEvaluationStatus]]]("ConfigRulesEvaluationStatus"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeConfigRuleEvaluationStatusResponse.apply _)
  }
  final implicit val SourceDecoder: io.circe.Decoder[models.Source] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Owner"), o.get[java.lang.String]("SourceIdentifier"), o.get[scala.Option[scala.List[models.SourceDetail]]]("SourceDetails")).mapN(models.Source.apply _)
  }
  final implicit val NoSuchDeliveryChannelExceptionDecoder: io.circe.Decoder[models.NoSuchDeliveryChannelException.type] = io.circe.Decoder.decodeUnit.as(models.NoSuchDeliveryChannelException)
  final implicit val DeleteEvaluationResultsResponseDecoder: io.circe.Decoder[models.DeleteEvaluationResultsResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteEvaluationResultsResponse)
  final implicit val ConfigExportDeliveryInfoDecoder: io.circe.Decoder[models.ConfigExportDeliveryInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lastStatus"), o.get[scala.Option[java.lang.String]]("lastErrorCode"), o.get[scala.Option[java.lang.String]]("lastErrorMessage"), o.get[scala.Option[java.time.Instant]]("lastAttemptTime"), o.get[scala.Option[java.time.Instant]]("lastSuccessfulTime"), o.get[scala.Option[java.time.Instant]]("nextDeliveryTime")).mapN(models.ConfigExportDeliveryInfo.apply _)
  }
  final implicit val DeleteEvaluationResultsRequestDecoder: io.circe.Decoder[models.DeleteEvaluationResultsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ConfigRuleName").map(models.DeleteEvaluationResultsRequest.apply _)
  }
  final implicit val PutConfigRuleRequestDecoder: io.circe.Decoder[models.PutConfigRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[models.ConfigRule]("ConfigRule").map(models.PutConfigRuleRequest.apply _)
  }
  final implicit val DeleteConfigurationRecorderRequestDecoder: io.circe.Decoder[models.DeleteConfigurationRecorderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ConfigurationRecorderName").map(models.DeleteConfigurationRecorderRequest.apply _)
  }
  final implicit val NoSuchConfigRuleExceptionDecoder: io.circe.Decoder[models.NoSuchConfigRuleException.type] = io.circe.Decoder.decodeUnit.as(models.NoSuchConfigRuleException)
  final implicit val EvaluationResultIdentifierDecoder: io.circe.Decoder[models.EvaluationResultIdentifier] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.EvaluationResultQualifier]]("EvaluationResultQualifier"), o.get[scala.Option[java.time.Instant]]("OrderingTimestamp")).mapN(models.EvaluationResultIdentifier.apply _)
  }
  final implicit val PutEvaluationsRequestDecoder: io.circe.Decoder[models.PutEvaluationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResultToken"), o.get[scala.Option[scala.List[models.Evaluation]]]("Evaluations"), o.get[scala.Option[scala.Boolean]]("TestMode")).mapN(models.PutEvaluationsRequest.apply _)
  }
  final implicit val EvaluationDecoder: io.circe.Decoder[models.Evaluation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ComplianceResourceType"), o.get[java.lang.String]("ComplianceResourceId"), o.get[java.lang.String]("ComplianceType"), o.get[java.time.Instant]("OrderingTimestamp"), o.get[scala.Option[java.lang.String]]("Annotation")).mapN(models.Evaluation.apply _)
  }
  final implicit val DescribeDeliveryChannelsRequestDecoder: io.circe.Decoder[models.DescribeDeliveryChannelsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("DeliveryChannelNames").map(models.DescribeDeliveryChannelsRequest.apply _)
  }
  final implicit val MaxNumberOfConfigurationRecordersExceededExceptionDecoder: io.circe.Decoder[models.MaxNumberOfConfigurationRecordersExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaxNumberOfConfigurationRecordersExceededException)
  final implicit val GetResourceConfigHistoryRequestDecoder: io.circe.Decoder[models.GetResourceConfigHistoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceId"), o.get[java.lang.String]("resourceType"), o.get[scala.Option[java.time.Instant]]("laterTime"), o.get[scala.Option[java.time.Instant]]("earlierTime"), o.get[scala.Option[java.lang.String]]("chronologicalOrder"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetResourceConfigHistoryRequest.apply _)
  }
  final implicit val DescribeConfigurationRecordersResponseDecoder: io.circe.Decoder[models.DescribeConfigurationRecordersResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ConfigurationRecorder]]]("ConfigurationRecorders").map(models.DescribeConfigurationRecordersResponse.apply _)
  }
  final implicit val NoRunningConfigurationRecorderExceptionDecoder: io.circe.Decoder[models.NoRunningConfigurationRecorderException.type] = io.circe.Decoder.decodeUnit.as(models.NoRunningConfigurationRecorderException)
  final implicit val ListDiscoveredResourcesRequestDecoder: io.circe.Decoder[models.ListDiscoveredResourcesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceType"), o.get[scala.Option[scala.List[java.lang.String]]]("resourceIds"), o.get[scala.Option[java.lang.String]]("resourceName"), o.get[scala.Option[scala.Boolean]]("includeDeletedResources"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDiscoveredResourcesRequest.apply _)
  }
  final implicit val ConfigurationItemDecoder: io.circe.Decoder[models.ConfigurationItem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("supplementaryConfiguration"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("tags"), o.get[scala.Option[java.lang.String]]("configurationItemStatus"), o.get[scala.Option[java.lang.String]]("availabilityZone"), o.get[scala.Option[java.time.Instant]]("configurationItemCaptureTime"), o.get[scala.Option[scala.List[java.lang.String]]]("relatedEvents"), o.get[scala.Option[java.lang.String]]("resourceName"), o.get[scala.Option[java.lang.String]]("awsRegion"), o.get[scala.Option[scala.List[models.Relationship]]]("relationships"), o.get[scala.Option[java.time.Instant]]("resourceCreationTime"), o.get[scala.Option[java.lang.String]]("configurationStateId"), o.get[scala.Option[java.lang.String]]("configuration"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("version"), o.get[scala.Option[java.lang.String]]("accountId"), o.get[scala.Option[java.lang.String]]("resourceId"), o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[java.lang.String]]("configurationItemMD5Hash")).mapN(models.ConfigurationItem.apply _)
  }
  final implicit val InsufficientDeliveryPolicyExceptionDecoder: io.circe.Decoder[models.InsufficientDeliveryPolicyException.type] = io.circe.Decoder.decodeUnit.as(models.InsufficientDeliveryPolicyException)
  final implicit val GetComplianceSummaryByConfigRuleResponseDecoder: io.circe.Decoder[models.GetComplianceSummaryByConfigRuleResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.ComplianceSummary]]("ComplianceSummary").map(models.GetComplianceSummaryByConfigRuleResponse.apply _)
  }
  final implicit val NoSuchConfigurationRecorderExceptionDecoder: io.circe.Decoder[models.NoSuchConfigurationRecorderException.type] = io.circe.Decoder.decodeUnit.as(models.NoSuchConfigurationRecorderException)
  final implicit val InvalidTimeRangeExceptionDecoder: io.circe.Decoder[models.InvalidTimeRangeException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTimeRangeException)
  final implicit val DeliveryChannelDecoder: io.circe.Decoder[models.DeliveryChannel] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("s3BucketName"), o.get[scala.Option[java.lang.String]]("s3KeyPrefix"), o.get[scala.Option[java.lang.String]]("snsTopicARN"), o.get[scala.Option[models.ConfigSnapshotDeliveryProperties]]("configSnapshotDeliveryProperties")).mapN(models.DeliveryChannel.apply _)
  }
  final implicit val PutConfigurationRecorderRequestDecoder: io.circe.Decoder[models.PutConfigurationRecorderRequest] = io.circe.Decoder.instance { o => 
    o.get[models.ConfigurationRecorder]("ConfigurationRecorder").map(models.PutConfigurationRecorderRequest.apply _)
  }
  final implicit val RecordingGroupDecoder: io.circe.Decoder[models.RecordingGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("allSupported"), o.get[scala.Option[scala.Boolean]]("includeGlobalResourceTypes"), o.get[scala.Option[scala.List[java.lang.String]]]("resourceTypes")).mapN(models.RecordingGroup.apply _)
  }
  final implicit val LastDeliveryChannelDeleteFailedExceptionDecoder: io.circe.Decoder[models.LastDeliveryChannelDeleteFailedException.type] = io.circe.Decoder.decodeUnit.as(models.LastDeliveryChannelDeleteFailedException)
  final implicit val MaxNumberOfConfigRulesExceededExceptionDecoder: io.circe.Decoder[models.MaxNumberOfConfigRulesExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaxNumberOfConfigRulesExceededException)
  final implicit val GetComplianceSummaryByResourceTypeRequestDecoder: io.circe.Decoder[models.GetComplianceSummaryByResourceTypeRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("ResourceTypes").map(models.GetComplianceSummaryByResourceTypeRequest.apply _)
  }
  final implicit val GetComplianceDetailsByResourceResponseDecoder: io.circe.Decoder[models.GetComplianceDetailsByResourceResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.EvaluationResult]]]("EvaluationResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetComplianceDetailsByResourceResponse.apply _)
  }
  final implicit val GetComplianceDetailsByConfigRuleRequestDecoder: io.circe.Decoder[models.GetComplianceDetailsByConfigRuleRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ConfigRuleName"), o.get[scala.Option[scala.List[java.lang.String]]]("ComplianceTypes"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetComplianceDetailsByConfigRuleRequest.apply _)
  }
  final implicit val ConfigurationRecorderDecoder: io.circe.Decoder[models.ConfigurationRecorder] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("roleARN"), o.get[scala.Option[models.RecordingGroup]]("recordingGroup")).mapN(models.ConfigurationRecorder.apply _)
  }
  final implicit val ResourceCountDecoder: io.circe.Decoder[models.ResourceCount] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("resourceType"), o.get[scala.Option[scala.Long]]("count")).mapN(models.ResourceCount.apply _)
  }
  final implicit val GetComplianceDetailsByConfigRuleResponseDecoder: io.circe.Decoder[models.GetComplianceDetailsByConfigRuleResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.EvaluationResult]]]("EvaluationResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetComplianceDetailsByConfigRuleResponse.apply _)
  }
  final implicit val PutEvaluationsResponseDecoder: io.circe.Decoder[models.PutEvaluationsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Evaluation]]]("FailedEvaluations").map(models.PutEvaluationsResponse.apply _)
  }
  final implicit val DescribeDeliveryChannelsResponseDecoder: io.circe.Decoder[models.DescribeDeliveryChannelsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.DeliveryChannel]]]("DeliveryChannels").map(models.DescribeDeliveryChannelsResponse.apply _)
  }
  final implicit val ComplianceSummaryDecoder: io.circe.Decoder[models.ComplianceSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ComplianceContributorCount]]("CompliantResourceCount"), o.get[scala.Option[models.ComplianceContributorCount]]("NonCompliantResourceCount"), o.get[scala.Option[java.time.Instant]]("ComplianceSummaryTimestamp")).mapN(models.ComplianceSummary.apply _)
  }
  final implicit val PutDeliveryChannelRequestDecoder: io.circe.Decoder[models.PutDeliveryChannelRequest] = io.circe.Decoder.instance { o => 
    o.get[models.DeliveryChannel]("DeliveryChannel").map(models.PutDeliveryChannelRequest.apply _)
  }
  final implicit val NoSuchBucketExceptionDecoder: io.circe.Decoder[models.NoSuchBucketException.type] = io.circe.Decoder.decodeUnit.as(models.NoSuchBucketException)
  final implicit val EvaluationResultDecoder: io.circe.Decoder[models.EvaluationResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResultToken"), o.get[scala.Option[models.EvaluationResultIdentifier]]("EvaluationResultIdentifier"), o.get[scala.Option[java.lang.String]]("ComplianceType"), o.get[scala.Option[java.lang.String]]("Annotation"), o.get[scala.Option[java.time.Instant]]("ResultRecordedTime"), o.get[scala.Option[java.time.Instant]]("ConfigRuleInvokedTime")).mapN(models.EvaluationResult.apply _)
  }
  final implicit val DeleteConfigRuleRequestDecoder: io.circe.Decoder[models.DeleteConfigRuleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ConfigRuleName").map(models.DeleteConfigRuleRequest.apply _)
  }
  final implicit val InvalidConfigurationRecorderNameExceptionDecoder: io.circe.Decoder[models.InvalidConfigurationRecorderNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidConfigurationRecorderNameException)
  final implicit val DescribeConfigurationRecorderStatusRequestDecoder: io.circe.Decoder[models.DescribeConfigurationRecorderStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("ConfigurationRecorderNames").map(models.DescribeConfigurationRecorderStatusRequest.apply _)
  }
  final implicit val DescribeConfigRuleEvaluationStatusRequestDecoder: io.circe.Decoder[models.DescribeConfigRuleEvaluationStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ConfigRuleNames"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeConfigRuleEvaluationStatusRequest.apply _)
  }
  final implicit val MaxNumberOfDeliveryChannelsExceededExceptionDecoder: io.circe.Decoder[models.MaxNumberOfDeliveryChannelsExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaxNumberOfDeliveryChannelsExceededException)
  final implicit val ConfigRuleDecoder: io.circe.Decoder[models.ConfigRule] = io.circe.Decoder.instance { o => 
    (o.get[models.Source]("Source"), o.get[scala.Option[java.lang.String]]("MaximumExecutionFrequency"), o.get[scala.Option[java.lang.String]]("InputParameters"), o.get[scala.Option[java.lang.String]]("ConfigRuleArn"), o.get[scala.Option[java.lang.String]]("ConfigRuleId"), o.get[scala.Option[java.lang.String]]("ConfigRuleState"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("ConfigRuleName"), o.get[scala.Option[models.Scope]]("Scope")).mapN(models.ConfigRule.apply _)
  }
  final implicit val DescribeDeliveryChannelStatusResponseDecoder: io.circe.Decoder[models.DescribeDeliveryChannelStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.DeliveryChannelStatus]]]("DeliveryChannelsStatus").map(models.DescribeDeliveryChannelStatusResponse.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[models.ResourceInUseException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceInUseException)
  final implicit val InsufficientPermissionsExceptionDecoder: io.circe.Decoder[models.InsufficientPermissionsException.type] = io.circe.Decoder.decodeUnit.as(models.InsufficientPermissionsException)
  final implicit val ComplianceByConfigRuleDecoder: io.circe.Decoder[models.ComplianceByConfigRule] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConfigRuleName"), o.get[scala.Option[models.Compliance]]("Compliance")).mapN(models.ComplianceByConfigRule.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidNextTokenException)
  final implicit val SourceDetailDecoder: io.circe.Decoder[models.SourceDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EventSource"), o.get[scala.Option[java.lang.String]]("MessageType"), o.get[scala.Option[java.lang.String]]("MaximumExecutionFrequency")).mapN(models.SourceDetail.apply _)
  }
  final implicit val DeliverConfigSnapshotResponseDecoder: io.circe.Decoder[models.DeliverConfigSnapshotResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("configSnapshotId").map(models.DeliverConfigSnapshotResponse.apply _)
  }
  final implicit val NoAvailableConfigurationRecorderExceptionDecoder: io.circe.Decoder[models.NoAvailableConfigurationRecorderException.type] = io.circe.Decoder.decodeUnit.as(models.NoAvailableConfigurationRecorderException)
  final implicit val ComplianceContributorCountDecoder: io.circe.Decoder[models.ComplianceContributorCount] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("CappedCount"), o.get[scala.Option[scala.Boolean]]("CapExceeded")).mapN(models.ComplianceContributorCount.apply _)
  }
  final implicit val DescribeConfigRulesRequestDecoder: io.circe.Decoder[models.DescribeConfigRulesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ConfigRuleNames"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeConfigRulesRequest.apply _)
  }
  final implicit val DescribeConfigurationRecorderStatusResponseDecoder: io.circe.Decoder[models.DescribeConfigurationRecorderStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ConfigurationRecorderStatus]]]("ConfigurationRecordersStatus").map(models.DescribeConfigurationRecorderStatusResponse.apply _)
  }
  final implicit val ConfigStreamDeliveryInfoDecoder: io.circe.Decoder[models.ConfigStreamDeliveryInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("lastStatus"), o.get[scala.Option[java.lang.String]]("lastErrorCode"), o.get[scala.Option[java.lang.String]]("lastErrorMessage"), o.get[scala.Option[java.time.Instant]]("lastStatusChangeTime")).mapN(models.ConfigStreamDeliveryInfo.apply _)
  }
  final implicit val StartConfigurationRecorderRequestDecoder: io.circe.Decoder[models.StartConfigurationRecorderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ConfigurationRecorderName").map(models.StartConfigurationRecorderRequest.apply _)
  }
  final implicit val EvaluationResultQualifierDecoder: io.circe.Decoder[models.EvaluationResultQualifier] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConfigRuleName"), o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[java.lang.String]]("ResourceId")).mapN(models.EvaluationResultQualifier.apply _)
  }
  final implicit val InvalidParameterValueExceptionDecoder: io.circe.Decoder[models.InvalidParameterValueException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidParameterValueException)
  final implicit val ScopeDecoder: io.circe.Decoder[models.Scope] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ComplianceResourceTypes"), o.get[scala.Option[java.lang.String]]("TagKey"), o.get[scala.Option[java.lang.String]]("TagValue"), o.get[scala.Option[java.lang.String]]("ComplianceResourceId")).mapN(models.Scope.apply _)
  }
  final implicit val DeliveryChannelStatusDecoder: io.circe.Decoder[models.DeliveryChannelStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[models.ConfigExportDeliveryInfo]]("configSnapshotDeliveryInfo"), o.get[scala.Option[models.ConfigExportDeliveryInfo]]("configHistoryDeliveryInfo"), o.get[scala.Option[models.ConfigStreamDeliveryInfo]]("configStreamDeliveryInfo")).mapN(models.DeliveryChannelStatus.apply _)
  }
  final implicit val ConfigRuleEvaluationStatusDecoder: io.circe.Decoder[models.ConfigRuleEvaluationStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConfigRuleName"), o.get[scala.Option[java.lang.String]]("ConfigRuleArn"), o.get[scala.Option[java.lang.String]]("ConfigRuleId"), o.get[scala.Option[java.lang.String]]("LastErrorCode"), o.get[scala.Option[java.lang.String]]("LastErrorMessage"), o.get[scala.Option[java.time.Instant]]("FirstActivatedTime"), o.get[scala.Option[java.time.Instant]]("LastFailedInvocationTime"), o.get[scala.Option[java.time.Instant]]("LastSuccessfulEvaluationTime"), o.get[scala.Option[java.time.Instant]]("LastFailedEvaluationTime"), o.get[scala.Option[java.time.Instant]]("LastSuccessfulInvocationTime"), o.get[scala.Option[scala.Boolean]]("FirstEvaluationStarted")).mapN(models.ConfigRuleEvaluationStatus.apply _)
  }
  final implicit val ListDiscoveredResourcesResponseDecoder: io.circe.Decoder[models.ListDiscoveredResourcesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ResourceIdentifier]]]("resourceIdentifiers"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListDiscoveredResourcesResponse.apply _)
  }
  final implicit val InvalidResultTokenExceptionDecoder: io.circe.Decoder[models.InvalidResultTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidResultTokenException)
  final implicit val DescribeComplianceByResourceResponseDecoder: io.circe.Decoder[models.DescribeComplianceByResourceResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ComplianceByResource]]]("ComplianceByResources"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeComplianceByResourceResponse.apply _)
  }
  final implicit val ComplianceDecoder: io.circe.Decoder[models.Compliance] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ComplianceType"), o.get[scala.Option[models.ComplianceContributorCount]]("ComplianceContributorCount")).mapN(models.Compliance.apply _)
  }
  final implicit val StartConfigRulesEvaluationResponseDecoder: io.circe.Decoder[models.StartConfigRulesEvaluationResponse.type] = io.circe.Decoder.decodeUnit.as(models.StartConfigRulesEvaluationResponse)
  final implicit val DeliverConfigSnapshotRequestDecoder: io.circe.Decoder[models.DeliverConfigSnapshotRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("deliveryChannelName").map(models.DeliverConfigSnapshotRequest.apply _)
  }
  final implicit val DescribeComplianceByConfigRuleRequestDecoder: io.circe.Decoder[models.DescribeComplianceByConfigRuleRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ConfigRuleNames"), o.get[scala.Option[scala.List[java.lang.String]]]("ComplianceTypes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeComplianceByConfigRuleRequest.apply _)
  }
  final implicit val NoAvailableDeliveryChannelExceptionDecoder: io.circe.Decoder[models.NoAvailableDeliveryChannelException.type] = io.circe.Decoder.decodeUnit.as(models.NoAvailableDeliveryChannelException)
  final implicit val InvalidRecordingGroupExceptionDecoder: io.circe.Decoder[models.InvalidRecordingGroupException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRecordingGroupException)
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.LimitExceededException)
  final implicit val DeleteDeliveryChannelRequestDecoder: io.circe.Decoder[models.DeleteDeliveryChannelRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DeliveryChannelName").map(models.DeleteDeliveryChannelRequest.apply _)
  }
  final implicit val StopConfigurationRecorderRequestDecoder: io.circe.Decoder[models.StopConfigurationRecorderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ConfigurationRecorderName").map(models.StopConfigurationRecorderRequest.apply _)
  }
  final implicit val ConfigSnapshotDeliveryPropertiesDecoder: io.circe.Decoder[models.ConfigSnapshotDeliveryProperties] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("deliveryFrequency").map(models.ConfigSnapshotDeliveryProperties.apply _)
  }
  final implicit val DescribeComplianceByConfigRuleResponseDecoder: io.circe.Decoder[models.DescribeComplianceByConfigRuleResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ComplianceByConfigRule]]]("ComplianceByConfigRules"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeComplianceByConfigRuleResponse.apply _)
  }
  final implicit val StartConfigRulesEvaluationRequestDecoder: io.circe.Decoder[models.StartConfigRulesEvaluationRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("ConfigRuleNames").map(models.StartConfigRulesEvaluationRequest.apply _)
  }
  final implicit val GetComplianceSummaryByResourceTypeResponseDecoder: io.circe.Decoder[models.GetComplianceSummaryByResourceTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ComplianceSummaryByResourceType]]]("ComplianceSummariesByResourceType").map(models.GetComplianceSummaryByResourceTypeResponse.apply _)
  }
  final implicit val ConfigurationRecorderStatusDecoder: io.circe.Decoder[models.ConfigurationRecorderStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("lastErrorCode"), o.get[scala.Option[java.lang.String]]("lastErrorMessage"), o.get[scala.Option[java.time.Instant]]("lastStartTime"), o.get[scala.Option[java.time.Instant]]("lastStopTime"), o.get[scala.Option[java.time.Instant]]("lastStatusChangeTime"), o.get[scala.Option[scala.Boolean]]("recording"), o.get[scala.Option[java.lang.String]]("lastStatus")).mapN(models.ConfigurationRecorderStatus.apply _)
  }
  final implicit val GetDiscoveredResourceCountsResponseDecoder: io.circe.Decoder[models.GetDiscoveredResourceCountsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("totalDiscoveredResources"), o.get[scala.Option[scala.List[models.ResourceCount]]]("resourceCounts"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetDiscoveredResourceCountsResponse.apply _)
  }
  final implicit val DescribeConfigRulesResponseDecoder: io.circe.Decoder[models.DescribeConfigRulesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ConfigRule]]]("ConfigRules"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeConfigRulesResponse.apply _)
  }
  final implicit val InvalidLimitExceptionDecoder: io.circe.Decoder[models.InvalidLimitException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidLimitException)
  final implicit val InvalidS3KeyPrefixExceptionDecoder: io.circe.Decoder[models.InvalidS3KeyPrefixException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidS3KeyPrefixException)
  final implicit val ComplianceSummaryByResourceTypeDecoder: io.circe.Decoder[models.ComplianceSummaryByResourceType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[models.ComplianceSummary]]("ComplianceSummary")).mapN(models.ComplianceSummaryByResourceType.apply _)
  }
}