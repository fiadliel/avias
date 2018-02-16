package avias.support
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DescribeCommunicationsRequestEncoder: io.circe.Encoder[avias.support.models.DescribeCommunicationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("caseId" -> o.caseId.asJson, "beforeTime" -> o.beforeTime.asJson, "afterTime" -> o.afterTime.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeServicesResponseEncoder: io.circe.Encoder[avias.support.models.DescribeServicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("services" -> o.services.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckResultRequestEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorCheckResultRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "language" -> o.language.asJson)
  }
  final implicit val AddCommunicationToCaseResponseEncoder: io.circe.Encoder[avias.support.models.AddCommunicationToCaseResponse] = io.circe.Encoder.instance { o => 
    Json.obj("result" -> o.result.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesRequestEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorCheckSummariesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkIds" -> o.checkIds.asJson)
  }
  final implicit val DescribeAttachmentResponseEncoder: io.circe.Encoder[avias.support.models.DescribeAttachmentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attachment" -> o.attachment.asJson)
  }
  final implicit val AttachmentSetIdNotFoundEncoder: io.circe.Encoder[avias.support.models.AttachmentSetIdNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddAttachmentsToSetResponseEncoder: io.circe.Encoder[avias.support.models.AddAttachmentsToSetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentSetId" -> o.attachmentSetId.asJson, "expiryTime" -> o.expiryTime.asJson)
  }
  final implicit val TrustedAdvisorCheckRefreshStatusEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorCheckRefreshStatus] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "status" -> o.status.asJson, "millisUntilNextRefreshable" -> o.millisUntilNextRefreshable.asJson)
  }
  final implicit val AttachmentLimitExceededEncoder: io.circe.Encoder[avias.support.models.AttachmentLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeAttachmentRequestEncoder: io.circe.Encoder[avias.support.models.DescribeAttachmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentId" -> o.attachmentId.asJson)
  }
  final implicit val DescribeSeverityLevelsRequestEncoder: io.circe.Encoder[avias.support.models.DescribeSeverityLevelsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("language" -> o.language.asJson)
  }
  final implicit val AttachmentDetailsEncoder: io.circe.Encoder[avias.support.models.AttachmentDetails] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentId" -> o.attachmentId.asJson, "fileName" -> o.fileName.asJson)
  }
  final implicit val TrustedAdvisorResourceDetailEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorResourceDetail] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "resourceId" -> o.resourceId.asJson, "metadata" -> o.metadata.asJson, "region" -> o.region.asJson, "isSuppressed" -> o.isSuppressed.asJson)
  }
  final implicit val DescribeCasesRequestEncoder: io.circe.Encoder[avias.support.models.DescribeCasesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("beforeTime" -> o.beforeTime.asJson, "language" -> o.language.asJson, "caseIdList" -> o.caseIdList.asJson, "includeResolvedCases" -> o.includeResolvedCases.asJson, "afterTime" -> o.afterTime.asJson, "displayId" -> o.displayId.asJson, "maxResults" -> o.maxResults.asJson, "includeCommunications" -> o.includeCommunications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AddCommunicationToCaseRequestEncoder: io.circe.Encoder[avias.support.models.AddCommunicationToCaseRequest] = io.circe.Encoder.instance { o => 
    Json.obj("communicationBody" -> o.communicationBody.asJson, "caseId" -> o.caseId.asJson, "ccEmailAddresses" -> o.ccEmailAddresses.asJson, "attachmentSetId" -> o.attachmentSetId.asJson)
  }
  final implicit val DescribeSeverityLevelsResponseEncoder: io.circe.Encoder[avias.support.models.DescribeSeverityLevelsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("severityLevels" -> o.severityLevels.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckResultResponseEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorCheckResultResponse] = io.circe.Encoder.instance { o => 
    Json.obj("result" -> o.result.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesResponseEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorCheckSummariesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("summaries" -> o.summaries.asJson)
  }
  final implicit val RefreshTrustedAdvisorCheckResponseEncoder: io.circe.Encoder[avias.support.models.RefreshTrustedAdvisorCheckResponse] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val RecentCaseCommunicationsEncoder: io.circe.Encoder[avias.support.models.RecentCaseCommunications] = io.circe.Encoder.instance { o => 
    Json.obj("communications" -> o.communications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CaseIdNotFoundEncoder: io.circe.Encoder[avias.support.models.CaseIdNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttachmentSetExpiredEncoder: io.circe.Encoder[avias.support.models.AttachmentSetExpired] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CategoryEncoder: io.circe.Encoder[avias.support.models.Category] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson)
  }
  final implicit val TrustedAdvisorCheckResultEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorCheckResult] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "timestamp" -> o.timestamp.asJson, "status" -> o.status.asJson, "resourcesSummary" -> o.resourcesSummary.asJson, "categorySpecificSummary" -> o.categorySpecificSummary.asJson, "flaggedResources" -> o.flaggedResources.asJson)
  }
  final implicit val TrustedAdvisorResourcesSummaryEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorResourcesSummary] = io.circe.Encoder.instance { o => 
    Json.obj("resourcesProcessed" -> o.resourcesProcessed.asJson, "resourcesFlagged" -> o.resourcesFlagged.asJson, "resourcesIgnored" -> o.resourcesIgnored.asJson, "resourcesSuppressed" -> o.resourcesSuppressed.asJson)
  }
  final implicit val DescribeCasesResponseEncoder: io.circe.Encoder[avias.support.models.DescribeCasesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("cases" -> o.cases.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ResolveCaseRequestEncoder: io.circe.Encoder[avias.support.models.ResolveCaseRequest] = io.circe.Encoder.instance { o => 
    Json.obj("caseId" -> o.caseId.asJson)
  }
  final implicit val TrustedAdvisorCheckDescriptionEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorCheckDescription] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson, "category" -> o.category.asJson, "metadata" -> o.metadata.asJson)
  }
  final implicit val CreateCaseRequestEncoder: io.circe.Encoder[avias.support.models.CreateCaseRequest] = io.circe.Encoder.instance { o => 
    Json.obj("communicationBody" -> o.communicationBody.asJson, "subject" -> o.subject.asJson, "categoryCode" -> o.categoryCode.asJson, "issueType" -> o.issueType.asJson, "language" -> o.language.asJson, "severityCode" -> o.severityCode.asJson, "serviceCode" -> o.serviceCode.asJson, "ccEmailAddresses" -> o.ccEmailAddresses.asJson, "attachmentSetId" -> o.attachmentSetId.asJson)
  }
  final implicit val AddAttachmentsToSetRequestEncoder: io.circe.Encoder[avias.support.models.AddAttachmentsToSetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attachments" -> o.attachments.asJson, "attachmentSetId" -> o.attachmentSetId.asJson)
  }
  final implicit val AttachmentSetSizeLimitExceededEncoder: io.circe.Encoder[avias.support.models.AttachmentSetSizeLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeServicesRequestEncoder: io.circe.Encoder[avias.support.models.DescribeServicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("serviceCodeList" -> o.serviceCodeList.asJson, "language" -> o.language.asJson)
  }
  final implicit val CaseDetailsEncoder: io.circe.Encoder[avias.support.models.CaseDetails] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "categoryCode" -> o.categoryCode.asJson, "language" -> o.language.asJson, "severityCode" -> o.severityCode.asJson, "serviceCode" -> o.serviceCode.asJson, "submittedBy" -> o.submittedBy.asJson, "ccEmailAddresses" -> o.ccEmailAddresses.asJson, "timeCreated" -> o.timeCreated.asJson, "displayId" -> o.displayId.asJson, "recentCommunications" -> o.recentCommunications.asJson, "subject" -> o.subject.asJson, "caseId" -> o.caseId.asJson)
  }
  final implicit val AttachmentIdNotFoundEncoder: io.circe.Encoder[avias.support.models.AttachmentIdNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResolveCaseResponseEncoder: io.circe.Encoder[avias.support.models.ResolveCaseResponse] = io.circe.Encoder.instance { o => 
    Json.obj("initialCaseStatus" -> o.initialCaseStatus.asJson, "finalCaseStatus" -> o.finalCaseStatus.asJson)
  }
  final implicit val DescribeTrustedAdvisorChecksRequestEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorChecksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("language" -> o.language.asJson)
  }
  final implicit val CreateCaseResponseEncoder: io.circe.Encoder[avias.support.models.CreateCaseResponse] = io.circe.Encoder.instance { o => 
    Json.obj("caseId" -> o.caseId.asJson)
  }
  final implicit val ServiceEncoder: io.circe.Encoder[avias.support.models.Service] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson, "categories" -> o.categories.asJson)
  }
  final implicit val AttachmentEncoder: io.circe.Encoder[avias.support.models.Attachment] = io.circe.Encoder.instance { o => 
    Json.obj("fileName" -> o.fileName.asJson, "data" -> o.data.asJson)
  }
  final implicit val TrustedAdvisorCategorySpecificSummaryEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorCategorySpecificSummary] = io.circe.Encoder.instance { o => 
    Json.obj("costOptimizing" -> o.costOptimizing.asJson)
  }
  final implicit val RefreshTrustedAdvisorCheckRequestEncoder: io.circe.Encoder[avias.support.models.RefreshTrustedAdvisorCheckRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson)
  }
  final implicit val SeverityLevelEncoder: io.circe.Encoder[avias.support.models.SeverityLevel] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson)
  }
  final implicit val CommunicationEncoder: io.circe.Encoder[avias.support.models.Communication] = io.circe.Encoder.instance { o => 
    Json.obj("submittedBy" -> o.submittedBy.asJson, "timeCreated" -> o.timeCreated.asJson, "body" -> o.body.asJson, "attachmentSet" -> o.attachmentSet.asJson, "caseId" -> o.caseId.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesResponseEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("statuses" -> o.statuses.asJson)
  }
  final implicit val TrustedAdvisorCheckSummaryEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorCheckSummary] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "timestamp" -> o.timestamp.asJson, "status" -> o.status.asJson, "resourcesSummary" -> o.resourcesSummary.asJson, "categorySpecificSummary" -> o.categorySpecificSummary.asJson, "hasFlaggedResources" -> o.hasFlaggedResources.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesRequestEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkIds" -> o.checkIds.asJson)
  }
  final implicit val DescribeAttachmentLimitExceededEncoder: io.circe.Encoder[avias.support.models.DescribeAttachmentLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[avias.support.models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TrustedAdvisorCostOptimizingSummaryEncoder: io.circe.Encoder[avias.support.models.TrustedAdvisorCostOptimizingSummary] = io.circe.Encoder.instance { o => 
    Json.obj("estimatedMonthlySavings" -> o.estimatedMonthlySavings.asJson, "estimatedPercentMonthlySavings" -> o.estimatedPercentMonthlySavings.asJson)
  }
  final implicit val CaseCreationLimitExceededEncoder: io.circe.Encoder[avias.support.models.CaseCreationLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeCommunicationsResponseEncoder: io.circe.Encoder[avias.support.models.DescribeCommunicationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("communications" -> o.communications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTrustedAdvisorChecksResponseEncoder: io.circe.Encoder[avias.support.models.DescribeTrustedAdvisorChecksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("checks" -> o.checks.asJson)
  }
  final implicit val DescribeCommunicationsRequestDecoder: io.circe.Decoder[avias.support.models.DescribeCommunicationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("caseId"), o.get[scala.Option[java.lang.String]]("beforeTime"), o.get[scala.Option[java.lang.String]]("afterTime"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.support.models.DescribeCommunicationsRequest.apply _)
  }
  final implicit val DescribeServicesResponseDecoder: io.circe.Decoder[avias.support.models.DescribeServicesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.support.models.Service]]]("services").map(avias.support.models.DescribeServicesResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckResultRequestDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorCheckResultRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[scala.Option[java.lang.String]]("language")).mapN(avias.support.models.DescribeTrustedAdvisorCheckResultRequest.apply _)
  }
  final implicit val AddCommunicationToCaseResponseDecoder: io.circe.Decoder[avias.support.models.AddCommunicationToCaseResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("result").map(avias.support.models.AddCommunicationToCaseResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesRequestDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorCheckSummariesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("checkIds").map(avias.support.models.DescribeTrustedAdvisorCheckSummariesRequest.apply _)
  }
  final implicit val DescribeAttachmentResponseDecoder: io.circe.Decoder[avias.support.models.DescribeAttachmentResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.support.models.Attachment]]("attachment").map(avias.support.models.DescribeAttachmentResponse.apply _)
  }
  final implicit val AttachmentSetIdNotFoundDecoder: io.circe.Decoder[avias.support.models.AttachmentSetIdNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.AttachmentSetIdNotFound.apply _)
  }
  final implicit val AddAttachmentsToSetResponseDecoder: io.circe.Decoder[avias.support.models.AddAttachmentsToSetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attachmentSetId"), o.get[scala.Option[java.lang.String]]("expiryTime")).mapN(avias.support.models.AddAttachmentsToSetResponse.apply _)
  }
  final implicit val TrustedAdvisorCheckRefreshStatusDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorCheckRefreshStatus] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[java.lang.String]("status"), o.get[scala.Long]("millisUntilNextRefreshable")).mapN(avias.support.models.TrustedAdvisorCheckRefreshStatus.apply _)
  }
  final implicit val AttachmentLimitExceededDecoder: io.circe.Decoder[avias.support.models.AttachmentLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.AttachmentLimitExceeded.apply _)
  }
  final implicit val DescribeAttachmentRequestDecoder: io.circe.Decoder[avias.support.models.DescribeAttachmentRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("attachmentId").map(avias.support.models.DescribeAttachmentRequest.apply _)
  }
  final implicit val DescribeSeverityLevelsRequestDecoder: io.circe.Decoder[avias.support.models.DescribeSeverityLevelsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("language").map(avias.support.models.DescribeSeverityLevelsRequest.apply _)
  }
  final implicit val AttachmentDetailsDecoder: io.circe.Decoder[avias.support.models.AttachmentDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attachmentId"), o.get[scala.Option[java.lang.String]]("fileName")).mapN(avias.support.models.AttachmentDetails.apply _)
  }
  final implicit val TrustedAdvisorResourceDetailDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorResourceDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("status"), o.get[java.lang.String]("resourceId"), o.get[scala.List[java.lang.String]]("metadata"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[scala.Boolean]]("isSuppressed")).mapN(avias.support.models.TrustedAdvisorResourceDetail.apply _)
  }
  final implicit val DescribeCasesRequestDecoder: io.circe.Decoder[avias.support.models.DescribeCasesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeTime"), o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[scala.List[java.lang.String]]]("caseIdList"), o.get[scala.Option[scala.Boolean]]("includeResolvedCases"), o.get[scala.Option[java.lang.String]]("afterTime"), o.get[scala.Option[java.lang.String]]("displayId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.Boolean]]("includeCommunications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.support.models.DescribeCasesRequest.apply _)
  }
  final implicit val AddCommunicationToCaseRequestDecoder: io.circe.Decoder[avias.support.models.AddCommunicationToCaseRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("communicationBody"), o.get[scala.Option[java.lang.String]]("caseId"), o.get[scala.Option[scala.List[java.lang.String]]]("ccEmailAddresses"), o.get[scala.Option[java.lang.String]]("attachmentSetId")).mapN(avias.support.models.AddCommunicationToCaseRequest.apply _)
  }
  final implicit val DescribeSeverityLevelsResponseDecoder: io.circe.Decoder[avias.support.models.DescribeSeverityLevelsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.support.models.SeverityLevel]]]("severityLevels").map(avias.support.models.DescribeSeverityLevelsResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckResultResponseDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorCheckResultResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.support.models.TrustedAdvisorCheckResult]]("result").map(avias.support.models.DescribeTrustedAdvisorCheckResultResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesResponseDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorCheckSummariesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.support.models.TrustedAdvisorCheckSummary]]("summaries").map(avias.support.models.DescribeTrustedAdvisorCheckSummariesResponse.apply _)
  }
  final implicit val RefreshTrustedAdvisorCheckResponseDecoder: io.circe.Decoder[avias.support.models.RefreshTrustedAdvisorCheckResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.support.models.TrustedAdvisorCheckRefreshStatus]("status").map(avias.support.models.RefreshTrustedAdvisorCheckResponse.apply _)
  }
  final implicit val RecentCaseCommunicationsDecoder: io.circe.Decoder[avias.support.models.RecentCaseCommunications] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.support.models.Communication]]]("communications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.support.models.RecentCaseCommunications.apply _)
  }
  final implicit val CaseIdNotFoundDecoder: io.circe.Decoder[avias.support.models.CaseIdNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.CaseIdNotFound.apply _)
  }
  final implicit val AttachmentSetExpiredDecoder: io.circe.Decoder[avias.support.models.AttachmentSetExpired] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.AttachmentSetExpired.apply _)
  }
  final implicit val CategoryDecoder: io.circe.Decoder[avias.support.models.Category] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("name")).mapN(avias.support.models.Category.apply _)
  }
  final implicit val TrustedAdvisorCheckResultDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorCheckResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[java.lang.String]("timestamp"), o.get[java.lang.String]("status"), o.get[avias.support.models.TrustedAdvisorResourcesSummary]("resourcesSummary"), o.get[avias.support.models.TrustedAdvisorCategorySpecificSummary]("categorySpecificSummary"), o.get[scala.List[avias.support.models.TrustedAdvisorResourceDetail]]("flaggedResources")).mapN(avias.support.models.TrustedAdvisorCheckResult.apply _)
  }
  final implicit val TrustedAdvisorResourcesSummaryDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorResourcesSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("resourcesProcessed"), o.get[scala.Long]("resourcesFlagged"), o.get[scala.Long]("resourcesIgnored"), o.get[scala.Long]("resourcesSuppressed")).mapN(avias.support.models.TrustedAdvisorResourcesSummary.apply _)
  }
  final implicit val DescribeCasesResponseDecoder: io.circe.Decoder[avias.support.models.DescribeCasesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.support.models.CaseDetails]]]("cases"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.support.models.DescribeCasesResponse.apply _)
  }
  final implicit val ResolveCaseRequestDecoder: io.circe.Decoder[avias.support.models.ResolveCaseRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("caseId").map(avias.support.models.ResolveCaseRequest.apply _)
  }
  final implicit val TrustedAdvisorCheckDescriptionDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorCheckDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[java.lang.String]("description"), o.get[java.lang.String]("category"), o.get[scala.List[java.lang.String]]("metadata")).mapN(avias.support.models.TrustedAdvisorCheckDescription.apply _)
  }
  final implicit val CreateCaseRequestDecoder: io.circe.Decoder[avias.support.models.CreateCaseRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("communicationBody"), o.get[java.lang.String]("subject"), o.get[scala.Option[java.lang.String]]("categoryCode"), o.get[scala.Option[java.lang.String]]("issueType"), o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[java.lang.String]]("severityCode"), o.get[scala.Option[java.lang.String]]("serviceCode"), o.get[scala.Option[scala.List[java.lang.String]]]("ccEmailAddresses"), o.get[scala.Option[java.lang.String]]("attachmentSetId")).mapN(avias.support.models.CreateCaseRequest.apply _)
  }
  final implicit val AddAttachmentsToSetRequestDecoder: io.circe.Decoder[avias.support.models.AddAttachmentsToSetRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.support.models.Attachment]]("attachments"), o.get[scala.Option[java.lang.String]]("attachmentSetId")).mapN(avias.support.models.AddAttachmentsToSetRequest.apply _)
  }
  final implicit val AttachmentSetSizeLimitExceededDecoder: io.circe.Decoder[avias.support.models.AttachmentSetSizeLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.AttachmentSetSizeLimitExceeded.apply _)
  }
  final implicit val DescribeServicesRequestDecoder: io.circe.Decoder[avias.support.models.DescribeServicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("serviceCodeList"), o.get[scala.Option[java.lang.String]]("language")).mapN(avias.support.models.DescribeServicesRequest.apply _)
  }
  final implicit val CaseDetailsDecoder: io.circe.Decoder[avias.support.models.CaseDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("categoryCode"), o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[java.lang.String]]("severityCode"), o.get[scala.Option[java.lang.String]]("serviceCode"), o.get[scala.Option[java.lang.String]]("submittedBy"), o.get[scala.Option[scala.List[java.lang.String]]]("ccEmailAddresses"), o.get[scala.Option[java.lang.String]]("timeCreated"), o.get[scala.Option[java.lang.String]]("displayId"), o.get[scala.Option[avias.support.models.RecentCaseCommunications]]("recentCommunications"), o.get[scala.Option[java.lang.String]]("subject"), o.get[scala.Option[java.lang.String]]("caseId")).mapN(avias.support.models.CaseDetails.apply _)
  }
  final implicit val AttachmentIdNotFoundDecoder: io.circe.Decoder[avias.support.models.AttachmentIdNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.AttachmentIdNotFound.apply _)
  }
  final implicit val ResolveCaseResponseDecoder: io.circe.Decoder[avias.support.models.ResolveCaseResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("initialCaseStatus"), o.get[scala.Option[java.lang.String]]("finalCaseStatus")).mapN(avias.support.models.ResolveCaseResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorChecksRequestDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorChecksRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("language").map(avias.support.models.DescribeTrustedAdvisorChecksRequest.apply _)
  }
  final implicit val CreateCaseResponseDecoder: io.circe.Decoder[avias.support.models.CreateCaseResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("caseId").map(avias.support.models.CreateCaseResponse.apply _)
  }
  final implicit val ServiceDecoder: io.circe.Decoder[avias.support.models.Service] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[avias.support.models.Category]]]("categories")).mapN(avias.support.models.Service.apply _)
  }
  final implicit val AttachmentDecoder: io.circe.Decoder[avias.support.models.Attachment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("fileName"), o.get[scala.Option[scala.Array[scala.Byte]]]("data")).mapN(avias.support.models.Attachment.apply _)
  }
  final implicit val TrustedAdvisorCategorySpecificSummaryDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorCategorySpecificSummary] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.support.models.TrustedAdvisorCostOptimizingSummary]]("costOptimizing").map(avias.support.models.TrustedAdvisorCategorySpecificSummary.apply _)
  }
  final implicit val RefreshTrustedAdvisorCheckRequestDecoder: io.circe.Decoder[avias.support.models.RefreshTrustedAdvisorCheckRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("checkId").map(avias.support.models.RefreshTrustedAdvisorCheckRequest.apply _)
  }
  final implicit val SeverityLevelDecoder: io.circe.Decoder[avias.support.models.SeverityLevel] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("name")).mapN(avias.support.models.SeverityLevel.apply _)
  }
  final implicit val CommunicationDecoder: io.circe.Decoder[avias.support.models.Communication] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("submittedBy"), o.get[scala.Option[java.lang.String]]("timeCreated"), o.get[scala.Option[java.lang.String]]("body"), o.get[scala.Option[scala.List[avias.support.models.AttachmentDetails]]]("attachmentSet"), o.get[scala.Option[java.lang.String]]("caseId")).mapN(avias.support.models.Communication.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesResponseDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.support.models.TrustedAdvisorCheckRefreshStatus]]("statuses").map(avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse.apply _)
  }
  final implicit val TrustedAdvisorCheckSummaryDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorCheckSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[java.lang.String]("timestamp"), o.get[java.lang.String]("status"), o.get[avias.support.models.TrustedAdvisorResourcesSummary]("resourcesSummary"), o.get[avias.support.models.TrustedAdvisorCategorySpecificSummary]("categorySpecificSummary"), o.get[scala.Option[scala.Boolean]]("hasFlaggedResources")).mapN(avias.support.models.TrustedAdvisorCheckSummary.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesRequestDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("checkIds").map(avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest.apply _)
  }
  final implicit val DescribeAttachmentLimitExceededDecoder: io.circe.Decoder[avias.support.models.DescribeAttachmentLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.DescribeAttachmentLimitExceeded.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[avias.support.models.InternalServerError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.InternalServerError.apply _)
  }
  final implicit val TrustedAdvisorCostOptimizingSummaryDecoder: io.circe.Decoder[avias.support.models.TrustedAdvisorCostOptimizingSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Double]("estimatedMonthlySavings"), o.get[scala.Double]("estimatedPercentMonthlySavings")).mapN(avias.support.models.TrustedAdvisorCostOptimizingSummary.apply _)
  }
  final implicit val CaseCreationLimitExceededDecoder: io.circe.Decoder[avias.support.models.CaseCreationLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.support.models.CaseCreationLimitExceeded.apply _)
  }
  final implicit val DescribeCommunicationsResponseDecoder: io.circe.Decoder[avias.support.models.DescribeCommunicationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.support.models.Communication]]]("communications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.support.models.DescribeCommunicationsResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorChecksResponseDecoder: io.circe.Decoder[avias.support.models.DescribeTrustedAdvisorChecksResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.support.models.TrustedAdvisorCheckDescription]]("checks").map(avias.support.models.DescribeTrustedAdvisorChecksResponse.apply _)
  }
}