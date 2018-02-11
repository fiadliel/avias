package org.lyranthe.araethura.support
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DescribeCommunicationsRequestEncoder: io.circe.Encoder[models.DescribeCommunicationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("caseId" -> o.caseId.asJson, "beforeTime" -> o.beforeTime.asJson, "afterTime" -> o.afterTime.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeServicesResponseEncoder: io.circe.Encoder[models.DescribeServicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("services" -> o.services.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckResultRequestEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorCheckResultRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "language" -> o.language.asJson)
  }
  final implicit val AddCommunicationToCaseResponseEncoder: io.circe.Encoder[models.AddCommunicationToCaseResponse] = io.circe.Encoder.instance { o => 
    Json.obj("result" -> o.result.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesRequestEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorCheckSummariesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkIds" -> o.checkIds.asJson)
  }
  final implicit val DescribeAttachmentResponseEncoder: io.circe.Encoder[models.DescribeAttachmentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attachment" -> o.attachment.asJson)
  }
  final implicit val AttachmentSetIdNotFoundEncoder: io.circe.Encoder[models.AttachmentSetIdNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddAttachmentsToSetResponseEncoder: io.circe.Encoder[models.AddAttachmentsToSetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentSetId" -> o.attachmentSetId.asJson, "expiryTime" -> o.expiryTime.asJson)
  }
  final implicit val TrustedAdvisorCheckRefreshStatusEncoder: io.circe.Encoder[models.TrustedAdvisorCheckRefreshStatus] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "status" -> o.status.asJson, "millisUntilNextRefreshable" -> o.millisUntilNextRefreshable.asJson)
  }
  final implicit val AttachmentLimitExceededEncoder: io.circe.Encoder[models.AttachmentLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeAttachmentRequestEncoder: io.circe.Encoder[models.DescribeAttachmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentId" -> o.attachmentId.asJson)
  }
  final implicit val DescribeSeverityLevelsRequestEncoder: io.circe.Encoder[models.DescribeSeverityLevelsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("language" -> o.language.asJson)
  }
  final implicit val AttachmentDetailsEncoder: io.circe.Encoder[models.AttachmentDetails] = io.circe.Encoder.instance { o => 
    Json.obj("attachmentId" -> o.attachmentId.asJson, "fileName" -> o.fileName.asJson)
  }
  final implicit val TrustedAdvisorResourceDetailEncoder: io.circe.Encoder[models.TrustedAdvisorResourceDetail] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "resourceId" -> o.resourceId.asJson, "metadata" -> o.metadata.asJson, "region" -> o.region.asJson, "isSuppressed" -> o.isSuppressed.asJson)
  }
  final implicit val DescribeCasesRequestEncoder: io.circe.Encoder[models.DescribeCasesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("beforeTime" -> o.beforeTime.asJson, "language" -> o.language.asJson, "caseIdList" -> o.caseIdList.asJson, "includeResolvedCases" -> o.includeResolvedCases.asJson, "afterTime" -> o.afterTime.asJson, "displayId" -> o.displayId.asJson, "maxResults" -> o.maxResults.asJson, "includeCommunications" -> o.includeCommunications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AddCommunicationToCaseRequestEncoder: io.circe.Encoder[models.AddCommunicationToCaseRequest] = io.circe.Encoder.instance { o => 
    Json.obj("communicationBody" -> o.communicationBody.asJson, "caseId" -> o.caseId.asJson, "ccEmailAddresses" -> o.ccEmailAddresses.asJson, "attachmentSetId" -> o.attachmentSetId.asJson)
  }
  final implicit val DescribeSeverityLevelsResponseEncoder: io.circe.Encoder[models.DescribeSeverityLevelsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("severityLevels" -> o.severityLevels.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckResultResponseEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorCheckResultResponse] = io.circe.Encoder.instance { o => 
    Json.obj("result" -> o.result.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesResponseEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorCheckSummariesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("summaries" -> o.summaries.asJson)
  }
  final implicit val RefreshTrustedAdvisorCheckResponseEncoder: io.circe.Encoder[models.RefreshTrustedAdvisorCheckResponse] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson)
  }
  final implicit val RecentCaseCommunicationsEncoder: io.circe.Encoder[models.RecentCaseCommunications] = io.circe.Encoder.instance { o => 
    Json.obj("communications" -> o.communications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CaseIdNotFoundEncoder: io.circe.Encoder[models.CaseIdNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttachmentSetExpiredEncoder: io.circe.Encoder[models.AttachmentSetExpired] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CategoryEncoder: io.circe.Encoder[models.Category] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson)
  }
  final implicit val TrustedAdvisorCheckResultEncoder: io.circe.Encoder[models.TrustedAdvisorCheckResult] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "timestamp" -> o.timestamp.asJson, "status" -> o.status.asJson, "resourcesSummary" -> o.resourcesSummary.asJson, "categorySpecificSummary" -> o.categorySpecificSummary.asJson, "flaggedResources" -> o.flaggedResources.asJson)
  }
  final implicit val TrustedAdvisorResourcesSummaryEncoder: io.circe.Encoder[models.TrustedAdvisorResourcesSummary] = io.circe.Encoder.instance { o => 
    Json.obj("resourcesProcessed" -> o.resourcesProcessed.asJson, "resourcesFlagged" -> o.resourcesFlagged.asJson, "resourcesIgnored" -> o.resourcesIgnored.asJson, "resourcesSuppressed" -> o.resourcesSuppressed.asJson)
  }
  final implicit val DescribeCasesResponseEncoder: io.circe.Encoder[models.DescribeCasesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("cases" -> o.cases.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ResolveCaseRequestEncoder: io.circe.Encoder[models.ResolveCaseRequest] = io.circe.Encoder.instance { o => 
    Json.obj("caseId" -> o.caseId.asJson)
  }
  final implicit val TrustedAdvisorCheckDescriptionEncoder: io.circe.Encoder[models.TrustedAdvisorCheckDescription] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson, "category" -> o.category.asJson, "metadata" -> o.metadata.asJson)
  }
  final implicit val CreateCaseRequestEncoder: io.circe.Encoder[models.CreateCaseRequest] = io.circe.Encoder.instance { o => 
    Json.obj("communicationBody" -> o.communicationBody.asJson, "subject" -> o.subject.asJson, "categoryCode" -> o.categoryCode.asJson, "issueType" -> o.issueType.asJson, "language" -> o.language.asJson, "severityCode" -> o.severityCode.asJson, "serviceCode" -> o.serviceCode.asJson, "ccEmailAddresses" -> o.ccEmailAddresses.asJson, "attachmentSetId" -> o.attachmentSetId.asJson)
  }
  final implicit val AddAttachmentsToSetRequestEncoder: io.circe.Encoder[models.AddAttachmentsToSetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("attachments" -> o.attachments.asJson, "attachmentSetId" -> o.attachmentSetId.asJson)
  }
  final implicit val AttachmentSetSizeLimitExceededEncoder: io.circe.Encoder[models.AttachmentSetSizeLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeServicesRequestEncoder: io.circe.Encoder[models.DescribeServicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("serviceCodeList" -> o.serviceCodeList.asJson, "language" -> o.language.asJson)
  }
  final implicit val CaseDetailsEncoder: io.circe.Encoder[models.CaseDetails] = io.circe.Encoder.instance { o => 
    Json.obj("status" -> o.status.asJson, "categoryCode" -> o.categoryCode.asJson, "language" -> o.language.asJson, "severityCode" -> o.severityCode.asJson, "serviceCode" -> o.serviceCode.asJson, "submittedBy" -> o.submittedBy.asJson, "ccEmailAddresses" -> o.ccEmailAddresses.asJson, "timeCreated" -> o.timeCreated.asJson, "displayId" -> o.displayId.asJson, "recentCommunications" -> o.recentCommunications.asJson, "subject" -> o.subject.asJson, "caseId" -> o.caseId.asJson)
  }
  final implicit val AttachmentIdNotFoundEncoder: io.circe.Encoder[models.AttachmentIdNotFound] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResolveCaseResponseEncoder: io.circe.Encoder[models.ResolveCaseResponse] = io.circe.Encoder.instance { o => 
    Json.obj("initialCaseStatus" -> o.initialCaseStatus.asJson, "finalCaseStatus" -> o.finalCaseStatus.asJson)
  }
  final implicit val DescribeTrustedAdvisorChecksRequestEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorChecksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("language" -> o.language.asJson)
  }
  final implicit val CreateCaseResponseEncoder: io.circe.Encoder[models.CreateCaseResponse] = io.circe.Encoder.instance { o => 
    Json.obj("caseId" -> o.caseId.asJson)
  }
  final implicit val ServiceEncoder: io.circe.Encoder[models.Service] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson, "categories" -> o.categories.asJson)
  }
  final implicit val AttachmentEncoder: io.circe.Encoder[models.Attachment] = io.circe.Encoder.instance { o => 
    Json.obj("fileName" -> o.fileName.asJson, "data" -> o.data.asJson)
  }
  final implicit val TrustedAdvisorCategorySpecificSummaryEncoder: io.circe.Encoder[models.TrustedAdvisorCategorySpecificSummary] = io.circe.Encoder.instance { o => 
    Json.obj("costOptimizing" -> o.costOptimizing.asJson)
  }
  final implicit val RefreshTrustedAdvisorCheckRequestEncoder: io.circe.Encoder[models.RefreshTrustedAdvisorCheckRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson)
  }
  final implicit val SeverityLevelEncoder: io.circe.Encoder[models.SeverityLevel] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "name" -> o.name.asJson)
  }
  final implicit val CommunicationEncoder: io.circe.Encoder[models.Communication] = io.circe.Encoder.instance { o => 
    Json.obj("submittedBy" -> o.submittedBy.asJson, "timeCreated" -> o.timeCreated.asJson, "body" -> o.body.asJson, "attachmentSet" -> o.attachmentSet.asJson, "caseId" -> o.caseId.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesResponseEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorCheckRefreshStatusesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("statuses" -> o.statuses.asJson)
  }
  final implicit val TrustedAdvisorCheckSummaryEncoder: io.circe.Encoder[models.TrustedAdvisorCheckSummary] = io.circe.Encoder.instance { o => 
    Json.obj("checkId" -> o.checkId.asJson, "timestamp" -> o.timestamp.asJson, "status" -> o.status.asJson, "resourcesSummary" -> o.resourcesSummary.asJson, "categorySpecificSummary" -> o.categorySpecificSummary.asJson, "hasFlaggedResources" -> o.hasFlaggedResources.asJson)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesRequestEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorCheckRefreshStatusesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("checkIds" -> o.checkIds.asJson)
  }
  final implicit val DescribeAttachmentLimitExceededEncoder: io.circe.Encoder[models.DescribeAttachmentLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TrustedAdvisorCostOptimizingSummaryEncoder: io.circe.Encoder[models.TrustedAdvisorCostOptimizingSummary] = io.circe.Encoder.instance { o => 
    Json.obj("estimatedMonthlySavings" -> o.estimatedMonthlySavings.asJson, "estimatedPercentMonthlySavings" -> o.estimatedPercentMonthlySavings.asJson)
  }
  final implicit val CaseCreationLimitExceededEncoder: io.circe.Encoder[models.CaseCreationLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeCommunicationsResponseEncoder: io.circe.Encoder[models.DescribeCommunicationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("communications" -> o.communications.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTrustedAdvisorChecksResponseEncoder: io.circe.Encoder[models.DescribeTrustedAdvisorChecksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("checks" -> o.checks.asJson)
  }
  final implicit val DescribeCommunicationsRequestDecoder: io.circe.Decoder[models.DescribeCommunicationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("caseId"), o.get[scala.Option[java.lang.String]]("beforeTime"), o.get[scala.Option[java.lang.String]]("afterTime"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeCommunicationsRequest.apply _)
  }
  final implicit val DescribeServicesResponseDecoder: io.circe.Decoder[models.DescribeServicesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Service]]]("services").map(models.DescribeServicesResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckResultRequestDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorCheckResultRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[scala.Option[java.lang.String]]("language")).mapN(models.DescribeTrustedAdvisorCheckResultRequest.apply _)
  }
  final implicit val AddCommunicationToCaseResponseDecoder: io.circe.Decoder[models.AddCommunicationToCaseResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("result").map(models.AddCommunicationToCaseResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesRequestDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorCheckSummariesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("checkIds").map(models.DescribeTrustedAdvisorCheckSummariesRequest.apply _)
  }
  final implicit val DescribeAttachmentResponseDecoder: io.circe.Decoder[models.DescribeAttachmentResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Attachment]]("attachment").map(models.DescribeAttachmentResponse.apply _)
  }
  final implicit val AttachmentSetIdNotFoundDecoder: io.circe.Decoder[models.AttachmentSetIdNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AttachmentSetIdNotFound.apply _)
  }
  final implicit val AddAttachmentsToSetResponseDecoder: io.circe.Decoder[models.AddAttachmentsToSetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attachmentSetId"), o.get[scala.Option[java.lang.String]]("expiryTime")).mapN(models.AddAttachmentsToSetResponse.apply _)
  }
  final implicit val TrustedAdvisorCheckRefreshStatusDecoder: io.circe.Decoder[models.TrustedAdvisorCheckRefreshStatus] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[java.lang.String]("status"), o.get[scala.Long]("millisUntilNextRefreshable")).mapN(models.TrustedAdvisorCheckRefreshStatus.apply _)
  }
  final implicit val AttachmentLimitExceededDecoder: io.circe.Decoder[models.AttachmentLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AttachmentLimitExceeded.apply _)
  }
  final implicit val DescribeAttachmentRequestDecoder: io.circe.Decoder[models.DescribeAttachmentRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("attachmentId").map(models.DescribeAttachmentRequest.apply _)
  }
  final implicit val DescribeSeverityLevelsRequestDecoder: io.circe.Decoder[models.DescribeSeverityLevelsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("language").map(models.DescribeSeverityLevelsRequest.apply _)
  }
  final implicit val AttachmentDetailsDecoder: io.circe.Decoder[models.AttachmentDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attachmentId"), o.get[scala.Option[java.lang.String]]("fileName")).mapN(models.AttachmentDetails.apply _)
  }
  final implicit val TrustedAdvisorResourceDetailDecoder: io.circe.Decoder[models.TrustedAdvisorResourceDetail] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("status"), o.get[java.lang.String]("resourceId"), o.get[scala.List[java.lang.String]]("metadata"), o.get[scala.Option[java.lang.String]]("region"), o.get[scala.Option[scala.Boolean]]("isSuppressed")).mapN(models.TrustedAdvisorResourceDetail.apply _)
  }
  final implicit val DescribeCasesRequestDecoder: io.circe.Decoder[models.DescribeCasesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeTime"), o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[scala.List[java.lang.String]]]("caseIdList"), o.get[scala.Option[scala.Boolean]]("includeResolvedCases"), o.get[scala.Option[java.lang.String]]("afterTime"), o.get[scala.Option[java.lang.String]]("displayId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.Boolean]]("includeCommunications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeCasesRequest.apply _)
  }
  final implicit val AddCommunicationToCaseRequestDecoder: io.circe.Decoder[models.AddCommunicationToCaseRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("communicationBody"), o.get[scala.Option[java.lang.String]]("caseId"), o.get[scala.Option[scala.List[java.lang.String]]]("ccEmailAddresses"), o.get[scala.Option[java.lang.String]]("attachmentSetId")).mapN(models.AddCommunicationToCaseRequest.apply _)
  }
  final implicit val DescribeSeverityLevelsResponseDecoder: io.circe.Decoder[models.DescribeSeverityLevelsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.SeverityLevel]]]("severityLevels").map(models.DescribeSeverityLevelsResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckResultResponseDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorCheckResultResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TrustedAdvisorCheckResult]]("result").map(models.DescribeTrustedAdvisorCheckResultResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckSummariesResponseDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorCheckSummariesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.TrustedAdvisorCheckSummary]]("summaries").map(models.DescribeTrustedAdvisorCheckSummariesResponse.apply _)
  }
  final implicit val RefreshTrustedAdvisorCheckResponseDecoder: io.circe.Decoder[models.RefreshTrustedAdvisorCheckResponse] = io.circe.Decoder.instance { o => 
    o.get[models.TrustedAdvisorCheckRefreshStatus]("status").map(models.RefreshTrustedAdvisorCheckResponse.apply _)
  }
  final implicit val RecentCaseCommunicationsDecoder: io.circe.Decoder[models.RecentCaseCommunications] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Communication]]]("communications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.RecentCaseCommunications.apply _)
  }
  final implicit val CaseIdNotFoundDecoder: io.circe.Decoder[models.CaseIdNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.CaseIdNotFound.apply _)
  }
  final implicit val AttachmentSetExpiredDecoder: io.circe.Decoder[models.AttachmentSetExpired] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AttachmentSetExpired.apply _)
  }
  final implicit val CategoryDecoder: io.circe.Decoder[models.Category] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.Category.apply _)
  }
  final implicit val TrustedAdvisorCheckResultDecoder: io.circe.Decoder[models.TrustedAdvisorCheckResult] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[java.lang.String]("timestamp"), o.get[java.lang.String]("status"), o.get[models.TrustedAdvisorResourcesSummary]("resourcesSummary"), o.get[models.TrustedAdvisorCategorySpecificSummary]("categorySpecificSummary"), o.get[scala.List[models.TrustedAdvisorResourceDetail]]("flaggedResources")).mapN(models.TrustedAdvisorCheckResult.apply _)
  }
  final implicit val TrustedAdvisorResourcesSummaryDecoder: io.circe.Decoder[models.TrustedAdvisorResourcesSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("resourcesProcessed"), o.get[scala.Long]("resourcesFlagged"), o.get[scala.Long]("resourcesIgnored"), o.get[scala.Long]("resourcesSuppressed")).mapN(models.TrustedAdvisorResourcesSummary.apply _)
  }
  final implicit val DescribeCasesResponseDecoder: io.circe.Decoder[models.DescribeCasesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.CaseDetails]]]("cases"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeCasesResponse.apply _)
  }
  final implicit val ResolveCaseRequestDecoder: io.circe.Decoder[models.ResolveCaseRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("caseId").map(models.ResolveCaseRequest.apply _)
  }
  final implicit val TrustedAdvisorCheckDescriptionDecoder: io.circe.Decoder[models.TrustedAdvisorCheckDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("id"), o.get[java.lang.String]("name"), o.get[java.lang.String]("description"), o.get[java.lang.String]("category"), o.get[scala.List[java.lang.String]]("metadata")).mapN(models.TrustedAdvisorCheckDescription.apply _)
  }
  final implicit val CreateCaseRequestDecoder: io.circe.Decoder[models.CreateCaseRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("communicationBody"), o.get[java.lang.String]("subject"), o.get[scala.Option[java.lang.String]]("categoryCode"), o.get[scala.Option[java.lang.String]]("issueType"), o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[java.lang.String]]("severityCode"), o.get[scala.Option[java.lang.String]]("serviceCode"), o.get[scala.Option[scala.List[java.lang.String]]]("ccEmailAddresses"), o.get[scala.Option[java.lang.String]]("attachmentSetId")).mapN(models.CreateCaseRequest.apply _)
  }
  final implicit val AddAttachmentsToSetRequestDecoder: io.circe.Decoder[models.AddAttachmentsToSetRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Attachment]]("attachments"), o.get[scala.Option[java.lang.String]]("attachmentSetId")).mapN(models.AddAttachmentsToSetRequest.apply _)
  }
  final implicit val AttachmentSetSizeLimitExceededDecoder: io.circe.Decoder[models.AttachmentSetSizeLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AttachmentSetSizeLimitExceeded.apply _)
  }
  final implicit val DescribeServicesRequestDecoder: io.circe.Decoder[models.DescribeServicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("serviceCodeList"), o.get[scala.Option[java.lang.String]]("language")).mapN(models.DescribeServicesRequest.apply _)
  }
  final implicit val CaseDetailsDecoder: io.circe.Decoder[models.CaseDetails] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("categoryCode"), o.get[scala.Option[java.lang.String]]("language"), o.get[scala.Option[java.lang.String]]("severityCode"), o.get[scala.Option[java.lang.String]]("serviceCode"), o.get[scala.Option[java.lang.String]]("submittedBy"), o.get[scala.Option[scala.List[java.lang.String]]]("ccEmailAddresses"), o.get[scala.Option[java.lang.String]]("timeCreated"), o.get[scala.Option[java.lang.String]]("displayId"), o.get[scala.Option[models.RecentCaseCommunications]]("recentCommunications"), o.get[scala.Option[java.lang.String]]("subject"), o.get[scala.Option[java.lang.String]]("caseId")).mapN(models.CaseDetails.apply _)
  }
  final implicit val AttachmentIdNotFoundDecoder: io.circe.Decoder[models.AttachmentIdNotFound] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AttachmentIdNotFound.apply _)
  }
  final implicit val ResolveCaseResponseDecoder: io.circe.Decoder[models.ResolveCaseResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("initialCaseStatus"), o.get[scala.Option[java.lang.String]]("finalCaseStatus")).mapN(models.ResolveCaseResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorChecksRequestDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorChecksRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("language").map(models.DescribeTrustedAdvisorChecksRequest.apply _)
  }
  final implicit val CreateCaseResponseDecoder: io.circe.Decoder[models.CreateCaseResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("caseId").map(models.CreateCaseResponse.apply _)
  }
  final implicit val ServiceDecoder: io.circe.Decoder[models.Service] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[models.Category]]]("categories")).mapN(models.Service.apply _)
  }
  final implicit val AttachmentDecoder: io.circe.Decoder[models.Attachment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("fileName"), o.get[scala.Option[scala.Array[scala.Byte]]]("data")).mapN(models.Attachment.apply _)
  }
  final implicit val TrustedAdvisorCategorySpecificSummaryDecoder: io.circe.Decoder[models.TrustedAdvisorCategorySpecificSummary] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TrustedAdvisorCostOptimizingSummary]]("costOptimizing").map(models.TrustedAdvisorCategorySpecificSummary.apply _)
  }
  final implicit val RefreshTrustedAdvisorCheckRequestDecoder: io.circe.Decoder[models.RefreshTrustedAdvisorCheckRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("checkId").map(models.RefreshTrustedAdvisorCheckRequest.apply _)
  }
  final implicit val SeverityLevelDecoder: io.circe.Decoder[models.SeverityLevel] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("name")).mapN(models.SeverityLevel.apply _)
  }
  final implicit val CommunicationDecoder: io.circe.Decoder[models.Communication] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("submittedBy"), o.get[scala.Option[java.lang.String]]("timeCreated"), o.get[scala.Option[java.lang.String]]("body"), o.get[scala.Option[scala.List[models.AttachmentDetails]]]("attachmentSet"), o.get[scala.Option[java.lang.String]]("caseId")).mapN(models.Communication.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesResponseDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorCheckRefreshStatusesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.TrustedAdvisorCheckRefreshStatus]]("statuses").map(models.DescribeTrustedAdvisorCheckRefreshStatusesResponse.apply _)
  }
  final implicit val TrustedAdvisorCheckSummaryDecoder: io.circe.Decoder[models.TrustedAdvisorCheckSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("checkId"), o.get[java.lang.String]("timestamp"), o.get[java.lang.String]("status"), o.get[models.TrustedAdvisorResourcesSummary]("resourcesSummary"), o.get[models.TrustedAdvisorCategorySpecificSummary]("categorySpecificSummary"), o.get[scala.Option[scala.Boolean]]("hasFlaggedResources")).mapN(models.TrustedAdvisorCheckSummary.apply _)
  }
  final implicit val DescribeTrustedAdvisorCheckRefreshStatusesRequestDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorCheckRefreshStatusesRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("checkIds").map(models.DescribeTrustedAdvisorCheckRefreshStatusesRequest.apply _)
  }
  final implicit val DescribeAttachmentLimitExceededDecoder: io.circe.Decoder[models.DescribeAttachmentLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DescribeAttachmentLimitExceeded.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[models.InternalServerError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalServerError.apply _)
  }
  final implicit val TrustedAdvisorCostOptimizingSummaryDecoder: io.circe.Decoder[models.TrustedAdvisorCostOptimizingSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Double]("estimatedMonthlySavings"), o.get[scala.Double]("estimatedPercentMonthlySavings")).mapN(models.TrustedAdvisorCostOptimizingSummary.apply _)
  }
  final implicit val CaseCreationLimitExceededDecoder: io.circe.Decoder[models.CaseCreationLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.CaseCreationLimitExceeded.apply _)
  }
  final implicit val DescribeCommunicationsResponseDecoder: io.circe.Decoder[models.DescribeCommunicationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Communication]]]("communications"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribeCommunicationsResponse.apply _)
  }
  final implicit val DescribeTrustedAdvisorChecksResponseDecoder: io.circe.Decoder[models.DescribeTrustedAdvisorChecksResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.TrustedAdvisorCheckDescription]]("checks").map(models.DescribeTrustedAdvisorChecksResponse.apply _)
  }
}