package avias.costandusagereport
trait Amazoncostandusagereport[F[_]] {
  def deleteReportDefinition(input: avias.costandusagereport.models.DeleteReportDefinitionRequest): F[avias.costandusagereport.models.DeleteReportDefinitionResponse]
  def putReportDefinition(input: avias.costandusagereport.models.PutReportDefinitionRequest): F[scala.Unit]
  def describeReportDefinitions(input: avias.costandusagereport.models.DescribeReportDefinitionsRequest): F[avias.costandusagereport.models.DescribeReportDefinitionsResponse]
}