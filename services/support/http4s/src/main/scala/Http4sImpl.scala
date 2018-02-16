package avias.support.http4s
import org.http4s.Method._
import avias.support.circe._
import avias.support.models
class AmazonsupportClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.support.Amazonsupport[F] {
  private[this] final val ServiceType: String = "support"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSSupport_20130415")
  override def describeServices(input: avias.support.models.DescribeServicesRequest): F[avias.support.models.DescribeServicesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeServicesResponse, avias.support.models.DescribeServicesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeServices", POST, "/", input)
  override def describeTrustedAdvisorCheckSummaries(input: avias.support.models.DescribeTrustedAdvisorCheckSummariesRequest): F[avias.support.models.DescribeTrustedAdvisorCheckSummariesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeTrustedAdvisorCheckSummariesResponse, avias.support.models.DescribeTrustedAdvisorCheckSummariesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorCheckSummaries", POST, "/", input)
  override def describeTrustedAdvisorCheckRefreshStatuses(input: avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest): F[avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesResponse, avias.support.models.DescribeTrustedAdvisorCheckRefreshStatusesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorCheckRefreshStatuses", POST, "/", input)
  override def describeTrustedAdvisorCheckResult(input: avias.support.models.DescribeTrustedAdvisorCheckResultRequest): F[avias.support.models.DescribeTrustedAdvisorCheckResultResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeTrustedAdvisorCheckResultResponse, avias.support.models.DescribeTrustedAdvisorCheckResultRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorCheckResult", POST, "/", input)
  override def addCommunicationToCase(input: avias.support.models.AddCommunicationToCaseRequest): F[avias.support.models.AddCommunicationToCaseResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.AddCommunicationToCaseResponse, avias.support.models.AddCommunicationToCaseRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddCommunicationToCase", POST, "/", input)
  override def addAttachmentsToSet(input: avias.support.models.AddAttachmentsToSetRequest): F[avias.support.models.AddAttachmentsToSetResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.AddAttachmentsToSetResponse, avias.support.models.AddAttachmentsToSetRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddAttachmentsToSet", POST, "/", input)
  override def refreshTrustedAdvisorCheck(input: avias.support.models.RefreshTrustedAdvisorCheckRequest): F[avias.support.models.RefreshTrustedAdvisorCheckResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.RefreshTrustedAdvisorCheckResponse, avias.support.models.RefreshTrustedAdvisorCheckRequest](client, awsData, ServiceType, ServiceAndPrefix, "RefreshTrustedAdvisorCheck", POST, "/", input)
  override def describeSeverityLevels(input: avias.support.models.DescribeSeverityLevelsRequest): F[avias.support.models.DescribeSeverityLevelsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeSeverityLevelsResponse, avias.support.models.DescribeSeverityLevelsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSeverityLevels", POST, "/", input)
  override def resolveCase(input: avias.support.models.ResolveCaseRequest): F[avias.support.models.ResolveCaseResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.ResolveCaseResponse, avias.support.models.ResolveCaseRequest](client, awsData, ServiceType, ServiceAndPrefix, "ResolveCase", POST, "/", input)
  override def describeCommunications(input: avias.support.models.DescribeCommunicationsRequest): F[avias.support.models.DescribeCommunicationsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeCommunicationsResponse, avias.support.models.DescribeCommunicationsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCommunications", POST, "/", input)
  override def describeCases(input: avias.support.models.DescribeCasesRequest): F[avias.support.models.DescribeCasesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeCasesResponse, avias.support.models.DescribeCasesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeCases", POST, "/", input)
  override def createCase(input: avias.support.models.CreateCaseRequest): F[avias.support.models.CreateCaseResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.CreateCaseResponse, avias.support.models.CreateCaseRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateCase", POST, "/", input)
  override def describeTrustedAdvisorChecks(input: avias.support.models.DescribeTrustedAdvisorChecksRequest): F[avias.support.models.DescribeTrustedAdvisorChecksResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeTrustedAdvisorChecksResponse, avias.support.models.DescribeTrustedAdvisorChecksRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrustedAdvisorChecks", POST, "/", input)
  override def describeAttachment(input: avias.support.models.DescribeAttachmentRequest): F[avias.support.models.DescribeAttachmentResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.support.models.DescribeAttachmentResponse, avias.support.models.DescribeAttachmentRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAttachment", POST, "/", input)
}