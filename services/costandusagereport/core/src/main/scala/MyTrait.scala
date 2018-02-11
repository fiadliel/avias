package org.lyranthe.araethura.costandusagereport
trait Amazoncostandusagereport[F[_]] {
  def deleteReportDefinition(input: models.DeleteReportDefinitionRequest): F[models.DeleteReportDefinitionResponse]
  def putReportDefinition(input: models.PutReportDefinitionRequest): F[scala.Unit]
  def describeReportDefinitions(input: models.DescribeReportDefinitionsRequest): F[models.DescribeReportDefinitionsResponse]
}