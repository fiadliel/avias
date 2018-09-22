package avias.marketplacecommerceanalytics.http4s
import org.http4s.Method._
import avias.marketplacecommerceanalytics.circe._
import avias.marketplacecommerceanalytics.models
import avias.common.http4s.ClientUtils._
class AmazonmarketplacecommerceanalyticsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.marketplacecommerceanalytics.Amazonmarketplacecommerceanalytics[F] {
  private[this] final val ServiceType: String = "marketplacecommerceanalytics"
  private[this] final val ServiceAndPrefix: Option[String] = Some("MarketplaceCommerceAnalytics20150701")
  override def startSupportDataExport(input: avias.marketplacecommerceanalytics.models.StartSupportDataExportRequest): F[avias.marketplacecommerceanalytics.models.StartSupportDataExportResult] = avias.common.http4s.ClientUtils.doRequest[F, avias.marketplacecommerceanalytics.models.StartSupportDataExportResult, avias.marketplacecommerceanalytics.models.StartSupportDataExportRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartSupportDataExport", POST, "/", input)
  override def generateDataSet(input: avias.marketplacecommerceanalytics.models.GenerateDataSetRequest): F[avias.marketplacecommerceanalytics.models.GenerateDataSetResult] = avias.common.http4s.ClientUtils.doRequest[F, avias.marketplacecommerceanalytics.models.GenerateDataSetResult, avias.marketplacecommerceanalytics.models.GenerateDataSetRequest](client, awsData, ServiceType, ServiceAndPrefix, "GenerateDataSet", POST, "/", input)
}