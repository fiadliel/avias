package org.lyranthe.araethura.marketplacecommerceanalytics
trait Amazonmarketplacecommerceanalytics[F[_]] {
  def startSupportDataExport(input: models.StartSupportDataExportRequest): F[models.StartSupportDataExportResult]
  def generateDataSet(input: models.GenerateDataSetRequest): F[models.GenerateDataSetResult]
}