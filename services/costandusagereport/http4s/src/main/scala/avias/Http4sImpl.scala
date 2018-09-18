package avias.costandusagereport.http4s
import org.http4s.Method._
import avias.costandusagereport.circe._
import avias.costandusagereport.models
import avias.common.http4s.ClientUtils._
class AmazoncostandusagereportClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.costandusagereport.Amazoncostandusagereport[F] {
  private[this] final val ServiceType: String = "cur"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSOrigamiServiceGatewayService")
  override def deleteReportDefinition(input: avias.costandusagereport.models.DeleteReportDefinitionRequest): F[avias.costandusagereport.models.DeleteReportDefinitionResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.costandusagereport.models.DeleteReportDefinitionResponse, avias.costandusagereport.models.DeleteReportDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReportDefinition", POST, "/", input)
  override def putReportDefinition(input: avias.costandusagereport.models.PutReportDefinitionRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.costandusagereport.models.PutReportDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutReportDefinition", POST, "/", input)
  override def describeReportDefinitions(input: avias.costandusagereport.models.DescribeReportDefinitionsRequest): F[avias.costandusagereport.models.DescribeReportDefinitionsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.costandusagereport.models.DescribeReportDefinitionsResponse, avias.costandusagereport.models.DescribeReportDefinitionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReportDefinitions", POST, "/", input)
}