package org.lyranthe.araethura.inspector
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteAssessmentRunRequestEncoder: io.circe.Encoder[models.DeleteAssessmentRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson)
  }
  final implicit val SubscriptionEncoder: io.circe.Encoder[models.Subscription] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "topicArn" -> o.topicArn.asJson, "eventSubscriptions" -> o.eventSubscriptions.asJson)
  }
  final implicit val StopAssessmentRunRequestEncoder: io.circe.Encoder[models.StopAssessmentRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson, "stopAction" -> o.stopAction.asJson)
  }
  final implicit val AssetAttributesEncoder: io.circe.Encoder[models.AssetAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("schemaVersion" -> o.schemaVersion.asJson, "ipv4Addresses" -> o.ipv4Addresses.asJson, "hostname" -> o.hostname.asJson, "autoScalingGroup" -> o.autoScalingGroup.asJson, "agentId" -> o.agentId.asJson, "amiId" -> o.amiId.asJson)
  }
  final implicit val DescribeResourceGroupsRequestEncoder: io.circe.Encoder[models.DescribeResourceGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceGroupArns" -> o.resourceGroupArns.asJson)
  }
  final implicit val TelemetryMetadataEncoder: io.circe.Encoder[models.TelemetryMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("messageType" -> o.messageType.asJson, "count" -> o.count.asJson, "dataSize" -> o.dataSize.asJson)
  }
  final implicit val FindingEncoder: io.circe.Encoder[models.Finding] = io.circe.Encoder.instance { o => 
    Json.obj("createdAt" -> o.createdAt.asJson, "updatedAt" -> o.updatedAt.asJson, "arn" -> o.arn.asJson, "userAttributes" -> o.userAttributes.asJson, "attributes" -> o.attributes.asJson, "assetAttributes" -> o.assetAttributes.asJson, "severity" -> o.severity.asJson, "title" -> o.title.asJson, "description" -> o.description.asJson, "recommendation" -> o.recommendation.asJson, "schemaVersion" -> o.schemaVersion.asJson, "confidence" -> o.confidence.asJson, "id" -> o.id.asJson, "service" -> o.service.asJson, "assetType" -> o.assetType.asJson, "numericSeverity" -> o.numericSeverity.asJson, "indicatorOfCompromise" -> o.indicatorOfCompromise.asJson, "serviceAttributes" -> o.serviceAttributes.asJson)
  }
  final implicit val AgentAlreadyRunningAssessmentEncoder: io.circe.Encoder[models.AgentAlreadyRunningAssessment] = io.circe.Encoder.instance { o => 
    Json.obj("agentId" -> o.agentId.asJson, "assessmentRunArn" -> o.assessmentRunArn.asJson)
  }
  final implicit val EventSubscriptionEncoder: io.circe.Encoder[models.EventSubscription] = io.circe.Encoder.instance { o => 
    Json.obj("event" -> o.event.asJson, "subscribedAt" -> o.subscribedAt.asJson)
  }
  final implicit val DurationRangeEncoder: io.circe.Encoder[models.DurationRange] = io.circe.Encoder.instance { o => 
    Json.obj("minSeconds" -> o.minSeconds.asJson, "maxSeconds" -> o.maxSeconds.asJson)
  }
  final implicit val FailedItemDetailsEncoder: io.circe.Encoder[models.FailedItemDetails] = io.circe.Encoder.instance { o => 
    Json.obj("failureCode" -> o.failureCode.asJson, "retryable" -> o.retryable.asJson)
  }
  final implicit val ListTagsForResourceResponseEncoder: io.circe.Encoder[models.ListTagsForResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson)
  }
  final implicit val PreviewAgentsResponseEncoder: io.circe.Encoder[models.PreviewAgentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("agentPreviews" -> o.agentPreviews.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RemoveAttributesFromFindingsRequestEncoder: io.circe.Encoder[models.RemoveAttributesFromFindingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("findingArns" -> o.findingArns.asJson, "attributeKeys" -> o.attributeKeys.asJson)
  }
  final implicit val ListEventSubscriptionsResponseEncoder: io.circe.Encoder[models.ListEventSubscriptionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("subscriptions" -> o.subscriptions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ResourceGroupEncoder: io.circe.Encoder[models.ResourceGroup] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "tags" -> o.tags.asJson, "createdAt" -> o.createdAt.asJson)
  }
  final implicit val AddAttributesToFindingsRequestEncoder: io.circe.Encoder[models.AddAttributesToFindingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("findingArns" -> o.findingArns.asJson, "attributes" -> o.attributes.asJson)
  }
  final implicit val CreateResourceGroupResponseEncoder: io.circe.Encoder[models.CreateResourceGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourceGroupArn" -> o.resourceGroupArn.asJson)
  }
  final implicit val ListFindingsRequestEncoder: io.circe.Encoder[models.ListFindingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArns" -> o.assessmentRunArns.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AssessmentTemplateFilterEncoder: io.circe.Encoder[models.AssessmentTemplateFilter] = io.circe.Encoder.instance { o => 
    Json.obj("namePattern" -> o.namePattern.asJson, "durationRange" -> o.durationRange.asJson, "rulesPackageArns" -> o.rulesPackageArns.asJson)
  }
  final implicit val CreateResourceGroupRequestEncoder: io.circe.Encoder[models.CreateResourceGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceGroupTags" -> o.resourceGroupTags.asJson)
  }
  final implicit val RemoveAttributesFromFindingsResponseEncoder: io.circe.Encoder[models.RemoveAttributesFromFindingsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("failedItems" -> o.failedItems.asJson)
  }
  final implicit val DescribeAssessmentRunsResponseEncoder: io.circe.Encoder[models.DescribeAssessmentRunsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRuns" -> o.assessmentRuns.asJson, "failedItems" -> o.failedItems.asJson)
  }
  final implicit val AgentPreviewEncoder: io.circe.Encoder[models.AgentPreview] = io.circe.Encoder.instance { o => 
    Json.obj("agentId" -> o.agentId.asJson, "autoScalingGroup" -> o.autoScalingGroup.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "errorCode" -> o.errorCode.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val DeleteAssessmentTemplateRequestEncoder: io.circe.Encoder[models.DeleteAssessmentTemplateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplateArn" -> o.assessmentTemplateArn.asJson)
  }
  final implicit val GetTelemetryMetadataRequestEncoder: io.circe.Encoder[models.GetTelemetryMetadataRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson)
  }
  final implicit val TimestampRangeEncoder: io.circe.Encoder[models.TimestampRange] = io.circe.Encoder.instance { o => 
    Json.obj("beginDate" -> o.beginDate.asJson, "endDate" -> o.endDate.asJson)
  }
  final implicit val RulesPackageEncoder: io.circe.Encoder[models.RulesPackage] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "arn" -> o.arn.asJson, "version" -> o.version.asJson, "provider" -> o.provider.asJson, "description" -> o.description.asJson)
  }
  final implicit val DescribeRulesPackagesResponseEncoder: io.circe.Encoder[models.DescribeRulesPackagesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("rulesPackages" -> o.rulesPackages.asJson, "failedItems" -> o.failedItems.asJson)
  }
  final implicit val InternalExceptionEncoder: io.circe.Encoder[models.InternalException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val ListFindingsResponseEncoder: io.circe.Encoder[models.ListFindingsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("findingArns" -> o.findingArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListAssessmentTemplatesRequestEncoder: io.circe.Encoder[models.ListAssessmentTemplatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArns" -> o.assessmentTargetArns.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val DescribeAssessmentTargetsRequestEncoder: io.circe.Encoder[models.DescribeAssessmentTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArns" -> o.assessmentTargetArns.asJson)
  }
  final implicit val GetAssessmentReportResponseEncoder: io.circe.Encoder[models.GetAssessmentReportResponse] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "url" -> o.url.asJson)
  }
  final implicit val AssessmentRunAgentEncoder: io.circe.Encoder[models.AssessmentRunAgent] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson, "agentHealth" -> o.agentHealth.asJson, "telemetryMetadata" -> o.telemetryMetadata.asJson, "agentId" -> o.agentId.asJson, "agentHealthCode" -> o.agentHealthCode.asJson, "agentHealthDetails" -> o.agentHealthDetails.asJson, "autoScalingGroup" -> o.autoScalingGroup.asJson)
  }
  final implicit val RegisterCrossAccountAccessRoleRequestEncoder: io.circe.Encoder[models.RegisterCrossAccountAccessRoleRequest] = io.circe.Encoder.instance { o => 
    Json.obj("roleArn" -> o.roleArn.asJson)
  }
  final implicit val FindingFilterEncoder: io.circe.Encoder[models.FindingFilter] = io.circe.Encoder.instance { o => 
    Json.obj("autoScalingGroups" -> o.autoScalingGroups.asJson, "creationTimeRange" -> o.creationTimeRange.asJson, "severities" -> o.severities.asJson, "attributes" -> o.attributes.asJson, "userAttributes" -> o.userAttributes.asJson, "ruleNames" -> o.ruleNames.asJson, "agentIds" -> o.agentIds.asJson, "rulesPackageArns" -> o.rulesPackageArns.asJson)
  }
  final implicit val ListAssessmentRunsResponseEncoder: io.circe.Encoder[models.ListAssessmentRunsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArns" -> o.assessmentRunArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "errorCode" -> o.errorCode.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val UnsubscribeFromEventRequestEncoder: io.circe.Encoder[models.UnsubscribeFromEventRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "topicArn" -> o.topicArn.asJson, "event" -> o.event.asJson)
  }
  final implicit val DescribeAssessmentTargetsResponseEncoder: io.circe.Encoder[models.DescribeAssessmentTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargets" -> o.assessmentTargets.asJson, "failedItems" -> o.failedItems.asJson)
  }
  final implicit val UnsupportedFeatureExceptionEncoder: io.circe.Encoder[models.UnsupportedFeatureException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val DeleteAssessmentTargetRequestEncoder: io.circe.Encoder[models.DeleteAssessmentTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArn" -> o.assessmentTargetArn.asJson)
  }
  final implicit val StartAssessmentRunRequestEncoder: io.circe.Encoder[models.StartAssessmentRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplateArn" -> o.assessmentTemplateArn.asJson, "assessmentRunName" -> o.assessmentRunName.asJson)
  }
  final implicit val AttributeEncoder: io.circe.Encoder[models.Attribute] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val CreateAssessmentTargetResponseEncoder: io.circe.Encoder[models.CreateAssessmentTargetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArn" -> o.assessmentTargetArn.asJson)
  }
  final implicit val ListRulesPackagesResponseEncoder: io.circe.Encoder[models.ListRulesPackagesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("rulesPackageArns" -> o.rulesPackageArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateAssessmentTemplateResponseEncoder: io.circe.Encoder[models.CreateAssessmentTemplateResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplateArn" -> o.assessmentTemplateArn.asJson)
  }
  final implicit val DescribeAssessmentTemplatesResponseEncoder: io.circe.Encoder[models.DescribeAssessmentTemplatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplates" -> o.assessmentTemplates.asJson, "failedItems" -> o.failedItems.asJson)
  }
  final implicit val InvalidCrossAccountRoleExceptionEncoder: io.circe.Encoder[models.InvalidCrossAccountRoleException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "errorCode" -> o.errorCode.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val SetTagsForResourceRequestEncoder: io.circe.Encoder[models.SetTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ListEventSubscriptionsRequestEncoder: io.circe.Encoder[models.ListEventSubscriptionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AssessmentRunFilterEncoder: io.circe.Encoder[models.AssessmentRunFilter] = io.circe.Encoder.instance { o => 
    Json.obj("durationRange" -> o.durationRange.asJson, "startTimeRange" -> o.startTimeRange.asJson, "completionTimeRange" -> o.completionTimeRange.asJson, "stateChangeTimeRange" -> o.stateChangeTimeRange.asJson, "namePattern" -> o.namePattern.asJson, "rulesPackageArns" -> o.rulesPackageArns.asJson, "states" -> o.states.asJson)
  }
  final implicit val ResourceGroupTagEncoder: io.circe.Encoder[models.ResourceGroupTag] = io.circe.Encoder.instance { o => 
    Json.obj("key" -> o.key.asJson, "value" -> o.value.asJson)
  }
  final implicit val DescribeCrossAccountAccessRoleResponseEncoder: io.circe.Encoder[models.DescribeCrossAccountAccessRoleResponse] = io.circe.Encoder.instance { o => 
    Json.obj("roleArn" -> o.roleArn.asJson, "valid" -> o.valid.asJson, "registeredAt" -> o.registeredAt.asJson)
  }
  final implicit val StartAssessmentRunResponseEncoder: io.circe.Encoder[models.StartAssessmentRunResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "errorCode" -> o.errorCode.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val ListAssessmentRunAgentsRequestEncoder: io.circe.Encoder[models.ListAssessmentRunAgentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val ListAssessmentTargetsResponseEncoder: io.circe.Encoder[models.ListAssessmentTargetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArns" -> o.assessmentTargetArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeAssessmentRunsRequestEncoder: io.circe.Encoder[models.DescribeAssessmentRunsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArns" -> o.assessmentRunArns.asJson)
  }
  final implicit val AssessmentTargetEncoder: io.circe.Encoder[models.AssessmentTarget] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "resourceGroupArn" -> o.resourceGroupArn.asJson, "name" -> o.name.asJson, "createdAt" -> o.createdAt.asJson, "updatedAt" -> o.updatedAt.asJson)
  }
  final implicit val ListRulesPackagesRequestEncoder: io.circe.Encoder[models.ListRulesPackagesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AssessmentRunStateChangeEncoder: io.circe.Encoder[models.AssessmentRunStateChange] = io.circe.Encoder.instance { o => 
    Json.obj("stateChangedAt" -> o.stateChangedAt.asJson, "state" -> o.state.asJson)
  }
  final implicit val DescribeResourceGroupsResponseEncoder: io.circe.Encoder[models.DescribeResourceGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourceGroups" -> o.resourceGroups.asJson, "failedItems" -> o.failedItems.asJson)
  }
  final implicit val GetAssessmentReportRequestEncoder: io.circe.Encoder[models.GetAssessmentReportRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunArn" -> o.assessmentRunArn.asJson, "reportFileFormat" -> o.reportFileFormat.asJson, "reportType" -> o.reportType.asJson)
  }
  final implicit val AgentsAlreadyRunningAssessmentExceptionEncoder: io.circe.Encoder[models.AgentsAlreadyRunningAssessmentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "agents" -> o.agents.asJson, "agentsTruncated" -> o.agentsTruncated.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson)
  }
  final implicit val NoSuchEntityExceptionEncoder: io.circe.Encoder[models.NoSuchEntityException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "errorCode" -> o.errorCode.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val ListAssessmentRunsRequestEncoder: io.circe.Encoder[models.ListAssessmentRunsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplateArns" -> o.assessmentTemplateArns.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AgentFilterEncoder: io.circe.Encoder[models.AgentFilter] = io.circe.Encoder.instance { o => 
    Json.obj("agentHealths" -> o.agentHealths.asJson, "agentHealthCodes" -> o.agentHealthCodes.asJson)
  }
  final implicit val CreateAssessmentTemplateRequestEncoder: io.circe.Encoder[models.CreateAssessmentTemplateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArn" -> o.assessmentTargetArn.asJson, "assessmentTemplateName" -> o.assessmentTemplateName.asJson, "rulesPackageArns" -> o.rulesPackageArns.asJson, "durationInSeconds" -> o.durationInSeconds.asJson, "userAttributesForFindings" -> o.userAttributesForFindings.asJson)
  }
  final implicit val AssessmentRunInProgressExceptionEncoder: io.circe.Encoder[models.AssessmentRunInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "assessmentRunArns" -> o.assessmentRunArns.asJson, "assessmentRunArnsTruncated" -> o.assessmentRunArnsTruncated.asJson, "canRetry" -> o.canRetry.asJson)
  }
  final implicit val AddAttributesToFindingsResponseEncoder: io.circe.Encoder[models.AddAttributesToFindingsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("failedItems" -> o.failedItems.asJson)
  }
  final implicit val SubscribeToEventRequestEncoder: io.circe.Encoder[models.SubscribeToEventRequest] = io.circe.Encoder.instance { o => 
    Json.obj("resourceArn" -> o.resourceArn.asJson, "topicArn" -> o.topicArn.asJson, "event" -> o.event.asJson)
  }
  final implicit val ListAssessmentTemplatesResponseEncoder: io.circe.Encoder[models.ListAssessmentTemplatesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplateArns" -> o.assessmentTemplateArns.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeFindingsResponseEncoder: io.circe.Encoder[models.DescribeFindingsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("findings" -> o.findings.asJson, "failedItems" -> o.failedItems.asJson)
  }
  final implicit val ListAssessmentTargetsRequestEncoder: io.circe.Encoder[models.ListAssessmentTargetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AssessmentRunEncoder: io.circe.Encoder[models.AssessmentRun] = io.circe.Encoder.instance { o => 
    Json.obj("createdAt" -> o.createdAt.asJson, "stateChangedAt" -> o.stateChangedAt.asJson, "arn" -> o.arn.asJson, "assessmentTemplateArn" -> o.assessmentTemplateArn.asJson, "userAttributesForFindings" -> o.userAttributesForFindings.asJson, "name" -> o.name.asJson, "rulesPackageArns" -> o.rulesPackageArns.asJson, "stateChanges" -> o.stateChanges.asJson, "durationInSeconds" -> o.durationInSeconds.asJson, "notifications" -> o.notifications.asJson, "findingCounts" -> o.findingCounts.asJson, "dataCollected" -> o.dataCollected.asJson, "state" -> o.state.asJson, "startedAt" -> o.startedAt.asJson, "completedAt" -> o.completedAt.asJson)
  }
  final implicit val DescribeFindingsRequestEncoder: io.circe.Encoder[models.DescribeFindingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("findingArns" -> o.findingArns.asJson, "locale" -> o.locale.asJson)
  }
  final implicit val DescribeRulesPackagesRequestEncoder: io.circe.Encoder[models.DescribeRulesPackagesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("rulesPackageArns" -> o.rulesPackageArns.asJson, "locale" -> o.locale.asJson)
  }
  final implicit val AssessmentRunNotificationEncoder: io.circe.Encoder[models.AssessmentRunNotification] = io.circe.Encoder.instance { o => 
    Json.obj("date" -> o.date.asJson, "event" -> o.event.asJson, "error" -> o.error.asJson, "snsTopicArn" -> o.snsTopicArn.asJson, "message" -> o.message.asJson, "snsPublishStatusCode" -> o.snsPublishStatusCode.asJson)
  }
  final implicit val PreviewAgentsRequestEncoder: io.circe.Encoder[models.PreviewAgentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("previewAgentsArn" -> o.previewAgentsArn.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val AssessmentTargetFilterEncoder: io.circe.Encoder[models.AssessmentTargetFilter] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetNamePattern" -> o.assessmentTargetNamePattern.asJson)
  }
  final implicit val UpdateAssessmentTargetRequestEncoder: io.circe.Encoder[models.UpdateAssessmentTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetArn" -> o.assessmentTargetArn.asJson, "resourceGroupArn" -> o.resourceGroupArn.asJson, "assessmentTargetName" -> o.assessmentTargetName.asJson)
  }
  final implicit val InspectorServiceAttributesEncoder: io.circe.Encoder[models.InspectorServiceAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("schemaVersion" -> o.schemaVersion.asJson, "assessmentRunArn" -> o.assessmentRunArn.asJson, "rulesPackageArn" -> o.rulesPackageArn.asJson)
  }
  final implicit val AssessmentTemplateEncoder: io.circe.Encoder[models.AssessmentTemplate] = io.circe.Encoder.instance { o => 
    Json.obj("createdAt" -> o.createdAt.asJson, "arn" -> o.arn.asJson, "assessmentTargetArn" -> o.assessmentTargetArn.asJson, "userAttributesForFindings" -> o.userAttributesForFindings.asJson, "name" -> o.name.asJson, "rulesPackageArns" -> o.rulesPackageArns.asJson, "durationInSeconds" -> o.durationInSeconds.asJson)
  }
  final implicit val GetTelemetryMetadataResponseEncoder: io.circe.Encoder[models.GetTelemetryMetadataResponse] = io.circe.Encoder.instance { o => 
    Json.obj("telemetryMetadata" -> o.telemetryMetadata.asJson)
  }
  final implicit val DescribeAssessmentTemplatesRequestEncoder: io.circe.Encoder[models.DescribeAssessmentTemplatesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTemplateArns" -> o.assessmentTemplateArns.asJson)
  }
  final implicit val ListAssessmentRunAgentsResponseEncoder: io.circe.Encoder[models.ListAssessmentRunAgentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentRunAgents" -> o.assessmentRunAgents.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateAssessmentTargetRequestEncoder: io.circe.Encoder[models.CreateAssessmentTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("assessmentTargetName" -> o.assessmentTargetName.asJson, "resourceGroupArn" -> o.resourceGroupArn.asJson)
  }
  final implicit val DeleteAssessmentRunRequestDecoder: io.circe.Decoder[models.DeleteAssessmentRunRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentRunArn").map(models.DeleteAssessmentRunRequest.apply _)
  }
  final implicit val SubscriptionDecoder: io.circe.Decoder[models.Subscription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[java.lang.String]("topicArn"), o.get[scala.List[models.EventSubscription]]("eventSubscriptions")).mapN(models.Subscription.apply _)
  }
  final implicit val StopAssessmentRunRequestDecoder: io.circe.Decoder[models.StopAssessmentRunRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentRunArn"), o.get[scala.Option[java.lang.String]]("stopAction")).mapN(models.StopAssessmentRunRequest.apply _)
  }
  final implicit val AssetAttributesDecoder: io.circe.Decoder[models.AssetAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("schemaVersion"), o.get[scala.Option[scala.List[java.lang.String]]]("ipv4Addresses"), o.get[scala.Option[java.lang.String]]("hostname"), o.get[scala.Option[java.lang.String]]("autoScalingGroup"), o.get[scala.Option[java.lang.String]]("agentId"), o.get[scala.Option[java.lang.String]]("amiId")).mapN(models.AssetAttributes.apply _)
  }
  final implicit val DescribeResourceGroupsRequestDecoder: io.circe.Decoder[models.DescribeResourceGroupsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("resourceGroupArns").map(models.DescribeResourceGroupsRequest.apply _)
  }
  final implicit val TelemetryMetadataDecoder: io.circe.Decoder[models.TelemetryMetadata] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("messageType"), o.get[scala.Long]("count"), o.get[scala.Option[scala.Long]]("dataSize")).mapN(models.TelemetryMetadata.apply _)
  }
  final implicit val FindingDecoder: io.circe.Decoder[models.Finding] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("createdAt"), o.get[java.time.Instant]("updatedAt"), o.get[java.lang.String]("arn"), o.get[scala.List[models.Attribute]]("userAttributes"), o.get[scala.List[models.Attribute]]("attributes"), o.get[scala.Option[models.AssetAttributes]]("assetAttributes"), o.get[scala.Option[java.lang.String]]("severity"), o.get[scala.Option[java.lang.String]]("title"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("recommendation"), o.get[scala.Option[scala.Int]]("schemaVersion"), o.get[scala.Option[scala.Int]]("confidence"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("service"), o.get[scala.Option[java.lang.String]]("assetType"), o.get[scala.Option[scala.Double]]("numericSeverity"), o.get[scala.Option[scala.Boolean]]("indicatorOfCompromise"), o.get[scala.Option[models.InspectorServiceAttributes]]("serviceAttributes")).mapN(models.Finding.apply _)
  }
  final implicit val AgentAlreadyRunningAssessmentDecoder: io.circe.Decoder[models.AgentAlreadyRunningAssessment] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("agentId"), o.get[java.lang.String]("assessmentRunArn")).mapN(models.AgentAlreadyRunningAssessment.apply _)
  }
  final implicit val EventSubscriptionDecoder: io.circe.Decoder[models.EventSubscription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("event"), o.get[java.time.Instant]("subscribedAt")).mapN(models.EventSubscription.apply _)
  }
  final implicit val DurationRangeDecoder: io.circe.Decoder[models.DurationRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("minSeconds"), o.get[scala.Option[scala.Int]]("maxSeconds")).mapN(models.DurationRange.apply _)
  }
  final implicit val FailedItemDetailsDecoder: io.circe.Decoder[models.FailedItemDetails] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("failureCode"), o.get[scala.Boolean]("retryable")).mapN(models.FailedItemDetails.apply _)
  }
  final implicit val ListTagsForResourceResponseDecoder: io.circe.Decoder[models.ListTagsForResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.Tag]]("tags").map(models.ListTagsForResourceResponse.apply _)
  }
  final implicit val PreviewAgentsResponseDecoder: io.circe.Decoder[models.PreviewAgentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.AgentPreview]]("agentPreviews"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.PreviewAgentsResponse.apply _)
  }
  final implicit val RemoveAttributesFromFindingsRequestDecoder: io.circe.Decoder[models.RemoveAttributesFromFindingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("findingArns"), o.get[scala.List[java.lang.String]]("attributeKeys")).mapN(models.RemoveAttributesFromFindingsRequest.apply _)
  }
  final implicit val ListEventSubscriptionsResponseDecoder: io.circe.Decoder[models.ListEventSubscriptionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Subscription]]("subscriptions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListEventSubscriptionsResponse.apply _)
  }
  final implicit val ResourceGroupDecoder: io.circe.Decoder[models.ResourceGroup] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.List[models.ResourceGroupTag]]("tags"), o.get[java.time.Instant]("createdAt")).mapN(models.ResourceGroup.apply _)
  }
  final implicit val AddAttributesToFindingsRequestDecoder: io.circe.Decoder[models.AddAttributesToFindingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("findingArns"), o.get[scala.List[models.Attribute]]("attributes")).mapN(models.AddAttributesToFindingsRequest.apply _)
  }
  final implicit val CreateResourceGroupResponseDecoder: io.circe.Decoder[models.CreateResourceGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("resourceGroupArn").map(models.CreateResourceGroupResponse.apply _)
  }
  final implicit val ListFindingsRequestDecoder: io.circe.Decoder[models.ListFindingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("assessmentRunArns"), o.get[scala.Option[models.FindingFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListFindingsRequest.apply _)
  }
  final implicit val AssessmentTemplateFilterDecoder: io.circe.Decoder[models.AssessmentTemplateFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("namePattern"), o.get[scala.Option[models.DurationRange]]("durationRange"), o.get[scala.Option[scala.List[java.lang.String]]]("rulesPackageArns")).mapN(models.AssessmentTemplateFilter.apply _)
  }
  final implicit val CreateResourceGroupRequestDecoder: io.circe.Decoder[models.CreateResourceGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.ResourceGroupTag]]("resourceGroupTags").map(models.CreateResourceGroupRequest.apply _)
  }
  final implicit val RemoveAttributesFromFindingsResponseDecoder: io.circe.Decoder[models.RemoveAttributesFromFindingsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems").map(models.RemoveAttributesFromFindingsResponse.apply _)
  }
  final implicit val DescribeAssessmentRunsResponseDecoder: io.circe.Decoder[models.DescribeAssessmentRunsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.AssessmentRun]]("assessmentRuns"), o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems")).mapN(models.DescribeAssessmentRunsResponse.apply _)
  }
  final implicit val AgentPreviewDecoder: io.circe.Decoder[models.AgentPreview] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("agentId"), o.get[scala.Option[java.lang.String]]("autoScalingGroup")).mapN(models.AgentPreview.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[java.lang.String]("errorCode"), o.get[scala.Boolean]("canRetry")).mapN(models.AccessDeniedException.apply _)
  }
  final implicit val DeleteAssessmentTemplateRequestDecoder: io.circe.Decoder[models.DeleteAssessmentTemplateRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentTemplateArn").map(models.DeleteAssessmentTemplateRequest.apply _)
  }
  final implicit val GetTelemetryMetadataRequestDecoder: io.circe.Decoder[models.GetTelemetryMetadataRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentRunArn").map(models.GetTelemetryMetadataRequest.apply _)
  }
  final implicit val TimestampRangeDecoder: io.circe.Decoder[models.TimestampRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("beginDate"), o.get[scala.Option[java.time.Instant]]("endDate")).mapN(models.TimestampRange.apply _)
  }
  final implicit val RulesPackageDecoder: io.circe.Decoder[models.RulesPackage] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[java.lang.String]("arn"), o.get[java.lang.String]("version"), o.get[java.lang.String]("provider"), o.get[scala.Option[java.lang.String]]("description")).mapN(models.RulesPackage.apply _)
  }
  final implicit val DescribeRulesPackagesResponseDecoder: io.circe.Decoder[models.DescribeRulesPackagesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.RulesPackage]]("rulesPackages"), o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems")).mapN(models.DescribeRulesPackagesResponse.apply _)
  }
  final implicit val InternalExceptionDecoder: io.circe.Decoder[models.InternalException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[scala.Boolean]("canRetry")).mapN(models.InternalException.apply _)
  }
  final implicit val ListFindingsResponseDecoder: io.circe.Decoder[models.ListFindingsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("findingArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListFindingsResponse.apply _)
  }
  final implicit val ListAssessmentTemplatesRequestDecoder: io.circe.Decoder[models.ListAssessmentTemplatesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("assessmentTargetArns"), o.get[scala.Option[models.AssessmentTemplateFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListAssessmentTemplatesRequest.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(models.Tag.apply _)
  }
  final implicit val DescribeAssessmentTargetsRequestDecoder: io.circe.Decoder[models.DescribeAssessmentTargetsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("assessmentTargetArns").map(models.DescribeAssessmentTargetsRequest.apply _)
  }
  final implicit val GetAssessmentReportResponseDecoder: io.circe.Decoder[models.GetAssessmentReportResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("status"), o.get[scala.Option[java.lang.String]]("url")).mapN(models.GetAssessmentReportResponse.apply _)
  }
  final implicit val AssessmentRunAgentDecoder: io.circe.Decoder[models.AssessmentRunAgent] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentRunArn"), o.get[java.lang.String]("agentHealth"), o.get[scala.List[models.TelemetryMetadata]]("telemetryMetadata"), o.get[java.lang.String]("agentId"), o.get[java.lang.String]("agentHealthCode"), o.get[scala.Option[java.lang.String]]("agentHealthDetails"), o.get[scala.Option[java.lang.String]]("autoScalingGroup")).mapN(models.AssessmentRunAgent.apply _)
  }
  final implicit val RegisterCrossAccountAccessRoleRequestDecoder: io.circe.Decoder[models.RegisterCrossAccountAccessRoleRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("roleArn").map(models.RegisterCrossAccountAccessRoleRequest.apply _)
  }
  final implicit val FindingFilterDecoder: io.circe.Decoder[models.FindingFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("autoScalingGroups"), o.get[scala.Option[models.TimestampRange]]("creationTimeRange"), o.get[scala.Option[scala.List[java.lang.String]]]("severities"), o.get[scala.Option[scala.List[models.Attribute]]]("attributes"), o.get[scala.Option[scala.List[models.Attribute]]]("userAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("ruleNames"), o.get[scala.Option[scala.List[java.lang.String]]]("agentIds"), o.get[scala.Option[scala.List[java.lang.String]]]("rulesPackageArns")).mapN(models.FindingFilter.apply _)
  }
  final implicit val ListAssessmentRunsResponseDecoder: io.circe.Decoder[models.ListAssessmentRunsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("assessmentRunArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListAssessmentRunsResponse.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[java.lang.String]("errorCode"), o.get[scala.Boolean]("canRetry")).mapN(models.InvalidInputException.apply _)
  }
  final implicit val UnsubscribeFromEventRequestDecoder: io.circe.Decoder[models.UnsubscribeFromEventRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[java.lang.String]("topicArn"), o.get[java.lang.String]("event")).mapN(models.UnsubscribeFromEventRequest.apply _)
  }
  final implicit val DescribeAssessmentTargetsResponseDecoder: io.circe.Decoder[models.DescribeAssessmentTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.AssessmentTarget]]("assessmentTargets"), o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems")).mapN(models.DescribeAssessmentTargetsResponse.apply _)
  }
  final implicit val UnsupportedFeatureExceptionDecoder: io.circe.Decoder[models.UnsupportedFeatureException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[scala.Boolean]("canRetry")).mapN(models.UnsupportedFeatureException.apply _)
  }
  final implicit val DeleteAssessmentTargetRequestDecoder: io.circe.Decoder[models.DeleteAssessmentTargetRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentTargetArn").map(models.DeleteAssessmentTargetRequest.apply _)
  }
  final implicit val StartAssessmentRunRequestDecoder: io.circe.Decoder[models.StartAssessmentRunRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentTemplateArn"), o.get[scala.Option[java.lang.String]]("assessmentRunName")).mapN(models.StartAssessmentRunRequest.apply _)
  }
  final implicit val AttributeDecoder: io.circe.Decoder[models.Attribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(models.Attribute.apply _)
  }
  final implicit val CreateAssessmentTargetResponseDecoder: io.circe.Decoder[models.CreateAssessmentTargetResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentTargetArn").map(models.CreateAssessmentTargetResponse.apply _)
  }
  final implicit val ListRulesPackagesResponseDecoder: io.circe.Decoder[models.ListRulesPackagesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("rulesPackageArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListRulesPackagesResponse.apply _)
  }
  final implicit val CreateAssessmentTemplateResponseDecoder: io.circe.Decoder[models.CreateAssessmentTemplateResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentTemplateArn").map(models.CreateAssessmentTemplateResponse.apply _)
  }
  final implicit val DescribeAssessmentTemplatesResponseDecoder: io.circe.Decoder[models.DescribeAssessmentTemplatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.AssessmentTemplate]]("assessmentTemplates"), o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems")).mapN(models.DescribeAssessmentTemplatesResponse.apply _)
  }
  final implicit val InvalidCrossAccountRoleExceptionDecoder: io.circe.Decoder[models.InvalidCrossAccountRoleException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[java.lang.String]("errorCode"), o.get[scala.Boolean]("canRetry")).mapN(models.InvalidCrossAccountRoleException.apply _)
  }
  final implicit val SetTagsForResourceRequestDecoder: io.circe.Decoder[models.SetTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[scala.Option[scala.List[models.Tag]]]("tags")).mapN(models.SetTagsForResourceRequest.apply _)
  }
  final implicit val ListEventSubscriptionsRequestDecoder: io.circe.Decoder[models.ListEventSubscriptionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("resourceArn"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListEventSubscriptionsRequest.apply _)
  }
  final implicit val AssessmentRunFilterDecoder: io.circe.Decoder[models.AssessmentRunFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.DurationRange]]("durationRange"), o.get[scala.Option[models.TimestampRange]]("startTimeRange"), o.get[scala.Option[models.TimestampRange]]("completionTimeRange"), o.get[scala.Option[models.TimestampRange]]("stateChangeTimeRange"), o.get[scala.Option[java.lang.String]]("namePattern"), o.get[scala.Option[scala.List[java.lang.String]]]("rulesPackageArns"), o.get[scala.Option[scala.List[java.lang.String]]]("states")).mapN(models.AssessmentRunFilter.apply _)
  }
  final implicit val ResourceGroupTagDecoder: io.circe.Decoder[models.ResourceGroupTag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("key"), o.get[scala.Option[java.lang.String]]("value")).mapN(models.ResourceGroupTag.apply _)
  }
  final implicit val DescribeCrossAccountAccessRoleResponseDecoder: io.circe.Decoder[models.DescribeCrossAccountAccessRoleResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("roleArn"), o.get[scala.Boolean]("valid"), o.get[java.time.Instant]("registeredAt")).mapN(models.DescribeCrossAccountAccessRoleResponse.apply _)
  }
  final implicit val StartAssessmentRunResponseDecoder: io.circe.Decoder[models.StartAssessmentRunResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("assessmentRunArn").map(models.StartAssessmentRunResponse.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[java.lang.String]("errorCode"), o.get[scala.Boolean]("canRetry")).mapN(models.LimitExceededException.apply _)
  }
  final implicit val ListAssessmentRunAgentsRequestDecoder: io.circe.Decoder[models.ListAssessmentRunAgentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentRunArn"), o.get[scala.Option[models.AgentFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListAssessmentRunAgentsRequest.apply _)
  }
  final implicit val ListAssessmentTargetsResponseDecoder: io.circe.Decoder[models.ListAssessmentTargetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("assessmentTargetArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListAssessmentTargetsResponse.apply _)
  }
  final implicit val DescribeAssessmentRunsRequestDecoder: io.circe.Decoder[models.DescribeAssessmentRunsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("assessmentRunArns").map(models.DescribeAssessmentRunsRequest.apply _)
  }
  final implicit val AssessmentTargetDecoder: io.circe.Decoder[models.AssessmentTarget] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[java.lang.String]("resourceGroupArn"), o.get[java.lang.String]("name"), o.get[java.time.Instant]("createdAt"), o.get[java.time.Instant]("updatedAt")).mapN(models.AssessmentTarget.apply _)
  }
  final implicit val ListRulesPackagesRequestDecoder: io.circe.Decoder[models.ListRulesPackagesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListRulesPackagesRequest.apply _)
  }
  final implicit val AssessmentRunStateChangeDecoder: io.circe.Decoder[models.AssessmentRunStateChange] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("stateChangedAt"), o.get[java.lang.String]("state")).mapN(models.AssessmentRunStateChange.apply _)
  }
  final implicit val DescribeResourceGroupsResponseDecoder: io.circe.Decoder[models.DescribeResourceGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.ResourceGroup]]("resourceGroups"), o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems")).mapN(models.DescribeResourceGroupsResponse.apply _)
  }
  final implicit val GetAssessmentReportRequestDecoder: io.circe.Decoder[models.GetAssessmentReportRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentRunArn"), o.get[java.lang.String]("reportFileFormat"), o.get[java.lang.String]("reportType")).mapN(models.GetAssessmentReportRequest.apply _)
  }
  final implicit val AgentsAlreadyRunningAssessmentExceptionDecoder: io.circe.Decoder[models.AgentsAlreadyRunningAssessmentException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[scala.List[models.AgentAlreadyRunningAssessment]]("agents"), o.get[scala.Boolean]("agentsTruncated"), o.get[scala.Boolean]("canRetry")).mapN(models.AgentsAlreadyRunningAssessmentException.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("resourceArn").map(models.ListTagsForResourceRequest.apply _)
  }
  final implicit val NoSuchEntityExceptionDecoder: io.circe.Decoder[models.NoSuchEntityException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[java.lang.String]("errorCode"), o.get[scala.Boolean]("canRetry")).mapN(models.NoSuchEntityException.apply _)
  }
  final implicit val ListAssessmentRunsRequestDecoder: io.circe.Decoder[models.ListAssessmentRunsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("assessmentTemplateArns"), o.get[scala.Option[models.AssessmentRunFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListAssessmentRunsRequest.apply _)
  }
  final implicit val AgentFilterDecoder: io.circe.Decoder[models.AgentFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("agentHealths"), o.get[scala.List[java.lang.String]]("agentHealthCodes")).mapN(models.AgentFilter.apply _)
  }
  final implicit val CreateAssessmentTemplateRequestDecoder: io.circe.Decoder[models.CreateAssessmentTemplateRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentTargetArn"), o.get[java.lang.String]("assessmentTemplateName"), o.get[scala.List[java.lang.String]]("rulesPackageArns"), o.get[scala.Int]("durationInSeconds"), o.get[scala.Option[scala.List[models.Attribute]]]("userAttributesForFindings")).mapN(models.CreateAssessmentTemplateRequest.apply _)
  }
  final implicit val AssessmentRunInProgressExceptionDecoder: io.circe.Decoder[models.AssessmentRunInProgressException] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("message"), o.get[scala.List[java.lang.String]]("assessmentRunArns"), o.get[scala.Boolean]("assessmentRunArnsTruncated"), o.get[scala.Boolean]("canRetry")).mapN(models.AssessmentRunInProgressException.apply _)
  }
  final implicit val AddAttributesToFindingsResponseDecoder: io.circe.Decoder[models.AddAttributesToFindingsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems").map(models.AddAttributesToFindingsResponse.apply _)
  }
  final implicit val SubscribeToEventRequestDecoder: io.circe.Decoder[models.SubscribeToEventRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("resourceArn"), o.get[java.lang.String]("topicArn"), o.get[java.lang.String]("event")).mapN(models.SubscribeToEventRequest.apply _)
  }
  final implicit val ListAssessmentTemplatesResponseDecoder: io.circe.Decoder[models.ListAssessmentTemplatesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("assessmentTemplateArns"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListAssessmentTemplatesResponse.apply _)
  }
  final implicit val DescribeFindingsResponseDecoder: io.circe.Decoder[models.DescribeFindingsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Finding]]("findings"), o.get[scala.collection.immutable.Map[java.lang.String, models.FailedItemDetails]]("failedItems")).mapN(models.DescribeFindingsResponse.apply _)
  }
  final implicit val ListAssessmentTargetsRequestDecoder: io.circe.Decoder[models.ListAssessmentTargetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.AssessmentTargetFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.ListAssessmentTargetsRequest.apply _)
  }
  final implicit val AssessmentRunDecoder: io.circe.Decoder[models.AssessmentRun] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("createdAt"), o.get[java.time.Instant]("stateChangedAt"), o.get[java.lang.String]("arn"), o.get[java.lang.String]("assessmentTemplateArn"), o.get[scala.List[models.Attribute]]("userAttributesForFindings"), o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("rulesPackageArns"), o.get[scala.List[models.AssessmentRunStateChange]]("stateChanges"), o.get[scala.Int]("durationInSeconds"), o.get[scala.List[models.AssessmentRunNotification]]("notifications"), o.get[scala.collection.immutable.Map[java.lang.String, scala.Int]]("findingCounts"), o.get[scala.Boolean]("dataCollected"), o.get[java.lang.String]("state"), o.get[scala.Option[java.time.Instant]]("startedAt"), o.get[scala.Option[java.time.Instant]]("completedAt")).mapN(models.AssessmentRun.apply _)
  }
  final implicit val DescribeFindingsRequestDecoder: io.circe.Decoder[models.DescribeFindingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("findingArns"), o.get[scala.Option[java.lang.String]]("locale")).mapN(models.DescribeFindingsRequest.apply _)
  }
  final implicit val DescribeRulesPackagesRequestDecoder: io.circe.Decoder[models.DescribeRulesPackagesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("rulesPackageArns"), o.get[scala.Option[java.lang.String]]("locale")).mapN(models.DescribeRulesPackagesRequest.apply _)
  }
  final implicit val AssessmentRunNotificationDecoder: io.circe.Decoder[models.AssessmentRunNotification] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("date"), o.get[java.lang.String]("event"), o.get[scala.Boolean]("error"), o.get[scala.Option[java.lang.String]]("snsTopicArn"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("snsPublishStatusCode")).mapN(models.AssessmentRunNotification.apply _)
  }
  final implicit val PreviewAgentsRequestDecoder: io.circe.Decoder[models.PreviewAgentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("previewAgentsArn"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.PreviewAgentsRequest.apply _)
  }
  final implicit val AssessmentTargetFilterDecoder: io.circe.Decoder[models.AssessmentTargetFilter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("assessmentTargetNamePattern").map(models.AssessmentTargetFilter.apply _)
  }
  final implicit val UpdateAssessmentTargetRequestDecoder: io.circe.Decoder[models.UpdateAssessmentTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentTargetArn"), o.get[java.lang.String]("resourceGroupArn"), o.get[java.lang.String]("assessmentTargetName")).mapN(models.UpdateAssessmentTargetRequest.apply _)
  }
  final implicit val InspectorServiceAttributesDecoder: io.circe.Decoder[models.InspectorServiceAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("schemaVersion"), o.get[scala.Option[java.lang.String]]("assessmentRunArn"), o.get[scala.Option[java.lang.String]]("rulesPackageArn")).mapN(models.InspectorServiceAttributes.apply _)
  }
  final implicit val AssessmentTemplateDecoder: io.circe.Decoder[models.AssessmentTemplate] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("createdAt"), o.get[java.lang.String]("arn"), o.get[java.lang.String]("assessmentTargetArn"), o.get[scala.List[models.Attribute]]("userAttributesForFindings"), o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("rulesPackageArns"), o.get[scala.Int]("durationInSeconds")).mapN(models.AssessmentTemplate.apply _)
  }
  final implicit val GetTelemetryMetadataResponseDecoder: io.circe.Decoder[models.GetTelemetryMetadataResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.TelemetryMetadata]]("telemetryMetadata").map(models.GetTelemetryMetadataResponse.apply _)
  }
  final implicit val DescribeAssessmentTemplatesRequestDecoder: io.circe.Decoder[models.DescribeAssessmentTemplatesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("assessmentTemplateArns").map(models.DescribeAssessmentTemplatesRequest.apply _)
  }
  final implicit val ListAssessmentRunAgentsResponseDecoder: io.circe.Decoder[models.ListAssessmentRunAgentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.AssessmentRunAgent]]("assessmentRunAgents"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListAssessmentRunAgentsResponse.apply _)
  }
  final implicit val CreateAssessmentTargetRequestDecoder: io.circe.Decoder[models.CreateAssessmentTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("assessmentTargetName"), o.get[java.lang.String]("resourceGroupArn")).mapN(models.CreateAssessmentTargetRequest.apply _)
  }
}