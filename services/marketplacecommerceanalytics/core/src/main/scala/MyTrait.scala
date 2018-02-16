package org.lyranthe.araethura.marketplacecommerceanalytics
trait Amazonmarketplacecommerceanalytics[F[_]] {
  def startSupportDataExport(input: org.lyranthe.araethura.marketplacecommerceanalytics.models.StartSupportDataExportRequest): F[org.lyranthe.araethura.marketplacecommerceanalytics.models.StartSupportDataExportResult]
  def generateDataSet(input: org.lyranthe.araethura.marketplacecommerceanalytics.models.GenerateDataSetRequest): F[org.lyranthe.araethura.marketplacecommerceanalytics.models.GenerateDataSetResult]
}