package org.lyranthe.araethura.costandusagereport.http4s
import org.http4s.Method._
import org.lyranthe.araethura.costandusagereport.circe._
import org.lyranthe.araethura.costandusagereport.models
class AmazoncostandusagereportClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.costandusagereport.Amazoncostandusagereport[F] {
  private[this] final val ServiceType: String = "cur"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSOrigamiServiceGatewayService")
  override def deleteReportDefinition(input: models.DeleteReportDefinitionRequest): F[models.DeleteReportDefinitionResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DeleteReportDefinitionResponse, models.DeleteReportDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReportDefinition", POST, "/", input)
  override def putReportDefinition(input: models.PutReportDefinitionRequest): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.PutReportDefinitionRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutReportDefinition", POST, "/", input)
  override def describeReportDefinitions(input: models.DescribeReportDefinitionsRequest): F[models.DescribeReportDefinitionsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeReportDefinitionsResponse, models.DescribeReportDefinitionsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeReportDefinitions", POST, "/", input)
}