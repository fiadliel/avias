package org.lyranthe.araethura.support
trait Amazonsupport[F[_]] {
  def describeServices(input: models.DescribeServicesRequest): F[models.DescribeServicesResponse]
  def describeTrustedAdvisorCheckSummaries(input: models.DescribeTrustedAdvisorCheckSummariesRequest): F[models.DescribeTrustedAdvisorCheckSummariesResponse]
  def describeTrustedAdvisorCheckRefreshStatuses(input: models.DescribeTrustedAdvisorCheckRefreshStatusesRequest): F[models.DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  def describeTrustedAdvisorCheckResult(input: models.DescribeTrustedAdvisorCheckResultRequest): F[models.DescribeTrustedAdvisorCheckResultResponse]
  def addCommunicationToCase(input: models.AddCommunicationToCaseRequest): F[models.AddCommunicationToCaseResponse]
  def addAttachmentsToSet(input: models.AddAttachmentsToSetRequest): F[models.AddAttachmentsToSetResponse]
  def refreshTrustedAdvisorCheck(input: models.RefreshTrustedAdvisorCheckRequest): F[models.RefreshTrustedAdvisorCheckResponse]
  def describeSeverityLevels(input: models.DescribeSeverityLevelsRequest): F[models.DescribeSeverityLevelsResponse]
  def resolveCase(input: models.ResolveCaseRequest): F[models.ResolveCaseResponse]
  def describeCommunications(input: models.DescribeCommunicationsRequest): F[models.DescribeCommunicationsResponse]
  def describeCases(input: models.DescribeCasesRequest): F[models.DescribeCasesResponse]
  def createCase(input: models.CreateCaseRequest): F[models.CreateCaseResponse]
  def describeTrustedAdvisorChecks(input: models.DescribeTrustedAdvisorChecksRequest): F[models.DescribeTrustedAdvisorChecksResponse]
  def describeAttachment(input: models.DescribeAttachmentRequest): F[models.DescribeAttachmentResponse]
}