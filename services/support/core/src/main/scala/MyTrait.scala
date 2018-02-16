package org.lyranthe.araethura.support
trait Amazonsupport[F[_]] {
  def describeServices(input: org.lyranthe.araethura.support.models.DescribeServicesRequest): F[org.lyranthe.araethura.support.models.DescribeServicesResponse]
  def describeTrustedAdvisorCheckSummaries(input: org.lyranthe.araethura.support.models.DescribeTrustedAdvisorCheckSummariesRequest): F[org.lyranthe.araethura.support.models.DescribeTrustedAdvisorCheckSummariesResponse]
  def describeTrustedAdvisorCheckRefreshStatuses(input: org.lyranthe.araethura.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest): F[org.lyranthe.araethura.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  def describeTrustedAdvisorCheckResult(input: org.lyranthe.araethura.support.models.DescribeTrustedAdvisorCheckResultRequest): F[org.lyranthe.araethura.support.models.DescribeTrustedAdvisorCheckResultResponse]
  def addCommunicationToCase(input: org.lyranthe.araethura.support.models.AddCommunicationToCaseRequest): F[org.lyranthe.araethura.support.models.AddCommunicationToCaseResponse]
  def addAttachmentsToSet(input: org.lyranthe.araethura.support.models.AddAttachmentsToSetRequest): F[org.lyranthe.araethura.support.models.AddAttachmentsToSetResponse]
  def refreshTrustedAdvisorCheck(input: org.lyranthe.araethura.support.models.RefreshTrustedAdvisorCheckRequest): F[org.lyranthe.araethura.support.models.RefreshTrustedAdvisorCheckResponse]
  def describeSeverityLevels(input: org.lyranthe.araethura.support.models.DescribeSeverityLevelsRequest): F[org.lyranthe.araethura.support.models.DescribeSeverityLevelsResponse]
  def resolveCase(input: org.lyranthe.araethura.support.models.ResolveCaseRequest): F[org.lyranthe.araethura.support.models.ResolveCaseResponse]
  def describeCommunications(input: org.lyranthe.araethura.support.models.DescribeCommunicationsRequest): F[org.lyranthe.araethura.support.models.DescribeCommunicationsResponse]
  def describeCases(input: org.lyranthe.araethura.support.models.DescribeCasesRequest): F[org.lyranthe.araethura.support.models.DescribeCasesResponse]
  def createCase(input: org.lyranthe.araethura.support.models.CreateCaseRequest): F[org.lyranthe.araethura.support.models.CreateCaseResponse]
  def describeTrustedAdvisorChecks(input: org.lyranthe.araethura.support.models.DescribeTrustedAdvisorChecksRequest): F[org.lyranthe.araethura.support.models.DescribeTrustedAdvisorChecksResponse]
  def describeAttachment(input: org.lyranthe.araethura.support.models.DescribeAttachmentRequest): F[org.lyranthe.araethura.support.models.DescribeAttachmentResponse]
}