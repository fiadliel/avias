package org.lyranthe.araethura.costandusagereport
trait Amazoncostandusagereport[F[_]] {
  def deleteReportDefinition(input: org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionRequest): F[org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionResponse]
  def putReportDefinition(input: org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionRequest): F[scala.Unit]
  def describeReportDefinitions(input: org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsRequest): F[org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsResponse]
}