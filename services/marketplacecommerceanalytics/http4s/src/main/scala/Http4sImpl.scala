package org.lyranthe.araethura.marketplacecommerceanalytics.http4s
import org.http4s.Method._
import org.lyranthe.araethura.marketplacecommerceanalytics.circe._
import org.lyranthe.araethura.marketplacecommerceanalytics.models
class AmazonmarketplacecommerceanalyticsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.marketplacecommerceanalytics.Amazonmarketplacecommerceanalytics[F] {
  private[this] final val ServiceType: String = "marketplacecommerceanalytics"
  private[this] final val ServiceAndPrefix: Option[String] = Some("MarketplaceCommerceAnalytics20150701")
  override def startSupportDataExport(input: org.lyranthe.araethura.marketplacecommerceanalytics.models.StartSupportDataExportRequest): F[org.lyranthe.araethura.marketplacecommerceanalytics.models.StartSupportDataExportResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.marketplacecommerceanalytics.models.StartSupportDataExportResult, org.lyranthe.araethura.marketplacecommerceanalytics.models.StartSupportDataExportRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartSupportDataExport", POST, "/", input)
  override def generateDataSet(input: org.lyranthe.araethura.marketplacecommerceanalytics.models.GenerateDataSetRequest): F[org.lyranthe.araethura.marketplacecommerceanalytics.models.GenerateDataSetResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, org.lyranthe.araethura.marketplacecommerceanalytics.models.GenerateDataSetResult, org.lyranthe.araethura.marketplacecommerceanalytics.models.GenerateDataSetRequest](client, awsData, ServiceType, ServiceAndPrefix, "GenerateDataSet", POST, "/", input)
}