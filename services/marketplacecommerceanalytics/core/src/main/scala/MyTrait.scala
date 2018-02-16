package avias.marketplacecommerceanalytics
trait Amazonmarketplacecommerceanalytics[F[_]] {
  def startSupportDataExport(input: avias.marketplacecommerceanalytics.models.StartSupportDataExportRequest): F[avias.marketplacecommerceanalytics.models.StartSupportDataExportResult]
  def generateDataSet(input: avias.marketplacecommerceanalytics.models.GenerateDataSetRequest): F[avias.marketplacecommerceanalytics.models.GenerateDataSetResult]
}