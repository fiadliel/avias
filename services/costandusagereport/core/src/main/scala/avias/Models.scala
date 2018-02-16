package avias.costandusagereport.models
final case class DeleteReportDefinitionRequest(reportName: scala.Option[java.lang.String] = scala.None)
final case class DescribeReportDefinitionsResponse(reportDefinitions: scala.Option[scala.List[avias.costandusagereport.models.ReportDefinition]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object PutReportDefinitionResponse
final case class DeleteReportDefinitionResponse(responseMessage: scala.Option[java.lang.String] = scala.None)
final case class InternalErrorException(message: scala.Option[java.lang.String] = scala.None)
final case class PutReportDefinitionRequest(reportDefinition: avias.costandusagereport.models.ReportDefinition)
final case class ReportDefinition(additionalSchemaElements: scala.List[java.lang.String], format: java.lang.String, compression: java.lang.String, timeUnit: java.lang.String, s3Region: java.lang.String, s3Bucket: java.lang.String, s3Prefix: java.lang.String, reportName: java.lang.String, additionalArtifacts: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class ReportLimitReachedException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeReportDefinitionsRequest(maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ValidationException(message: scala.Option[java.lang.String] = scala.None)
final case class DuplicateReportNameException(message: scala.Option[java.lang.String] = scala.None)