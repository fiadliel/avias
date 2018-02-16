package avias.support
trait Amazonsupport[F[_]] {
  def describeServices(input: avias.support.models.DescribeServicesRequest): F[avias.support.models.DescribeServicesResponse]
  def describeTrustedAdvisorCheckSummaries(input: avias.support.models.DescribeTrustedAdvisorCheckSummariesRequest): F[avias.support.models.DescribeTrustedAdvisorCheckSummariesResponse]
  def describeTrustedAdvisorCheckRefreshStatuses(input: avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest): F[avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse]
  def describeTrustedAdvisorCheckResult(input: avias.support.models.DescribeTrustedAdvisorCheckResultRequest): F[avias.support.models.DescribeTrustedAdvisorCheckResultResponse]
  def addCommunicationToCase(input: avias.support.models.AddCommunicationToCaseRequest): F[avias.support.models.AddCommunicationToCaseResponse]
  def addAttachmentsToSet(input: avias.support.models.AddAttachmentsToSetRequest): F[avias.support.models.AddAttachmentsToSetResponse]
  def refreshTrustedAdvisorCheck(input: avias.support.models.RefreshTrustedAdvisorCheckRequest): F[avias.support.models.RefreshTrustedAdvisorCheckResponse]
  def describeSeverityLevels(input: avias.support.models.DescribeSeverityLevelsRequest): F[avias.support.models.DescribeSeverityLevelsResponse]
  def resolveCase(input: avias.support.models.ResolveCaseRequest): F[avias.support.models.ResolveCaseResponse]
  def describeCommunications(input: avias.support.models.DescribeCommunicationsRequest): F[avias.support.models.DescribeCommunicationsResponse]
  def describeCases(input: avias.support.models.DescribeCasesRequest): F[avias.support.models.DescribeCasesResponse]
  def createCase(input: avias.support.models.CreateCaseRequest): F[avias.support.models.CreateCaseResponse]
  def describeTrustedAdvisorChecks(input: avias.support.models.DescribeTrustedAdvisorChecksRequest): F[avias.support.models.DescribeTrustedAdvisorChecksResponse]
  def describeAttachment(input: avias.support.models.DescribeAttachmentRequest): F[avias.support.models.DescribeAttachmentResponse]
}