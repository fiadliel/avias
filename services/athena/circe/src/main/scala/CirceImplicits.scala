package org.lyranthe.araethura.athena
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteNamedQueryInputEncoder: io.circe.Encoder[models.DeleteNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val BatchGetQueryExecutionOutputEncoder: io.circe.Encoder[models.BatchGetQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutions" -> o.queryExecutions.asJson, "UnprocessedQueryExecutionIds" -> o.unprocessedQueryExecutionIds.asJson)
  }
  final implicit val ListNamedQueriesOutputEncoder: io.circe.Encoder[models.ListNamedQueriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryIds" -> o.namedQueryIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EncryptionConfigurationEncoder: io.circe.Encoder[models.EncryptionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionOption" -> o.encryptionOption.asJson, "KmsKey" -> o.kmsKey.asJson)
  }
  final implicit val QueryExecutionEncoder: io.circe.Encoder[models.QueryExecution] = io.circe.Encoder.instance { o => 
    Json.obj("Query" -> o.query.asJson, "QueryExecutionId" -> o.queryExecutionId.asJson, "ResultConfiguration" -> o.resultConfiguration.asJson, "Status" -> o.status.asJson, "QueryExecutionContext" -> o.queryExecutionContext.asJson, "Statistics" -> o.statistics.asJson)
  }
  final implicit val UnprocessedNamedQueryIdEncoder: io.circe.Encoder[models.UnprocessedNamedQueryId] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val DatumEncoder: io.circe.Encoder[models.Datum] = io.circe.Encoder.instance { o => 
    Json.obj("VarCharValue" -> o.varCharValue.asJson)
  }
  final implicit val ListNamedQueriesInputEncoder: io.circe.Encoder[models.ListNamedQueriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ResultConfigurationEncoder: io.circe.Encoder[models.ResultConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("OutputLocation" -> o.outputLocation.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson)
  }
  final implicit val StartQueryExecutionOutputEncoder: io.circe.Encoder[models.StartQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val BatchGetQueryExecutionInputEncoder: io.circe.Encoder[models.BatchGetQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionIds" -> o.queryExecutionIds.asJson)
  }
  final implicit val ListQueryExecutionsInputEncoder: io.circe.Encoder[models.ListQueryExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val UnprocessedQueryExecutionIdEncoder: io.circe.Encoder[models.UnprocessedQueryExecutionId] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResultSetMetadataEncoder: io.circe.Encoder[models.ResultSetMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("ColumnInfo" -> o.columnInfo.asJson)
  }
  final implicit val StopQueryExecutionOutputEncoder: io.circe.Encoder[models.StopQueryExecutionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteNamedQueryOutputEncoder: io.circe.Encoder[models.DeleteNamedQueryOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InternalServerExceptionEncoder: io.circe.Encoder[models.InternalServerException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ColumnInfoEncoder: io.circe.Encoder[models.ColumnInfo] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "SchemaName" -> o.schemaName.asJson, "CatalogName" -> o.catalogName.asJson, "TableName" -> o.tableName.asJson, "Label" -> o.label.asJson, "Precision" -> o.precision.asJson, "Scale" -> o.scale.asJson, "Nullable" -> o.nullable.asJson, "CaseSensitive" -> o.caseSensitive.asJson)
  }
  final implicit val GetQueryExecutionInputEncoder: io.circe.Encoder[models.GetQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val BatchGetNamedQueryInputEncoder: io.circe.Encoder[models.BatchGetNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryIds" -> o.namedQueryIds.asJson)
  }
  final implicit val RowEncoder: io.circe.Encoder[models.Row] = io.circe.Encoder.instance { o => 
    Json.obj("Data" -> o.data.asJson)
  }
  final implicit val ListQueryExecutionsOutputEncoder: io.circe.Encoder[models.ListQueryExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionIds" -> o.queryExecutionIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val QueryExecutionStatusEncoder: io.circe.Encoder[models.QueryExecutionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "SubmissionDateTime" -> o.submissionDateTime.asJson, "CompletionDateTime" -> o.completionDateTime.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("AthenaErrorCode" -> o.athenaErrorCode.asJson, "Message" -> o.message.asJson)
  }
  final implicit val BatchGetNamedQueryOutputEncoder: io.circe.Encoder[models.BatchGetNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueries" -> o.namedQueries.asJson, "UnprocessedNamedQueryIds" -> o.unprocessedNamedQueryIds.asJson)
  }
  final implicit val GetQueryResultsInputEncoder: io.circe.Encoder[models.GetQueryResultsInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val StopQueryExecutionInputEncoder: io.circe.Encoder[models.StopQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val GetQueryExecutionOutputEncoder: io.circe.Encoder[models.GetQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecution" -> o.queryExecution.asJson)
  }
  final implicit val GetNamedQueryInputEncoder: io.circe.Encoder[models.GetNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val StartQueryExecutionInputEncoder: io.circe.Encoder[models.StartQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "ResultConfiguration" -> o.resultConfiguration.asJson, "ClientRequestToken" -> o.clientRequestToken.asJson, "QueryExecutionContext" -> o.queryExecutionContext.asJson)
  }
  final implicit val GetNamedQueryOutputEncoder: io.circe.Encoder[models.GetNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQuery" -> o.namedQuery.asJson)
  }
  final implicit val CreateNamedQueryInputEncoder: io.circe.Encoder[models.CreateNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "Name" -> o.name.asJson, "Database" -> o.database.asJson, "ClientRequestToken" -> o.clientRequestToken.asJson, "Description" -> o.description.asJson)
  }
  final implicit val QueryExecutionContextEncoder: io.circe.Encoder[models.QueryExecutionContext] = io.circe.Encoder.instance { o => 
    Json.obj("Database" -> o.database.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val NamedQueryEncoder: io.circe.Encoder[models.NamedQuery] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "Name" -> o.name.asJson, "Database" -> o.database.asJson, "Description" -> o.description.asJson, "NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val ResultSetEncoder: io.circe.Encoder[models.ResultSet] = io.circe.Encoder.instance { o => 
    Json.obj("Rows" -> o.rows.asJson, "ResultSetMetadata" -> o.resultSetMetadata.asJson)
  }
  final implicit val CreateNamedQueryOutputEncoder: io.circe.Encoder[models.CreateNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val QueryExecutionStatisticsEncoder: io.circe.Encoder[models.QueryExecutionStatistics] = io.circe.Encoder.instance { o => 
    Json.obj("EngineExecutionTimeInMillis" -> o.engineExecutionTimeInMillis.asJson, "DataScannedInBytes" -> o.dataScannedInBytes.asJson)
  }
  final implicit val GetQueryResultsOutputEncoder: io.circe.Encoder[models.GetQueryResultsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResultSet" -> o.resultSet.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteNamedQueryInputDecoder: io.circe.Decoder[models.DeleteNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("NamedQueryId").map(models.DeleteNamedQueryInput.apply _)
  }
  final implicit val BatchGetQueryExecutionOutputDecoder: io.circe.Decoder[models.BatchGetQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.QueryExecution]]]("QueryExecutions"), o.get[scala.Option[scala.List[models.UnprocessedQueryExecutionId]]]("UnprocessedQueryExecutionIds")).mapN(models.BatchGetQueryExecutionOutput.apply _)
  }
  final implicit val ListNamedQueriesOutputDecoder: io.circe.Decoder[models.ListNamedQueriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("NamedQueryIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListNamedQueriesOutput.apply _)
  }
  final implicit val EncryptionConfigurationDecoder: io.circe.Decoder[models.EncryptionConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EncryptionOption"), o.get[scala.Option[java.lang.String]]("KmsKey")).mapN(models.EncryptionConfiguration.apply _)
  }
  final implicit val QueryExecutionDecoder: io.circe.Decoder[models.QueryExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Query"), o.get[scala.Option[java.lang.String]]("QueryExecutionId"), o.get[scala.Option[models.ResultConfiguration]]("ResultConfiguration"), o.get[scala.Option[models.QueryExecutionStatus]]("Status"), o.get[scala.Option[models.QueryExecutionContext]]("QueryExecutionContext"), o.get[scala.Option[models.QueryExecutionStatistics]]("Statistics")).mapN(models.QueryExecution.apply _)
  }
  final implicit val UnprocessedNamedQueryIdDecoder: io.circe.Decoder[models.UnprocessedNamedQueryId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NamedQueryId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(models.UnprocessedNamedQueryId.apply _)
  }
  final implicit val DatumDecoder: io.circe.Decoder[models.Datum] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VarCharValue").map(models.Datum.apply _)
  }
  final implicit val ListNamedQueriesInputDecoder: io.circe.Decoder[models.ListNamedQueriesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListNamedQueriesInput.apply _)
  }
  final implicit val ResultConfigurationDecoder: io.circe.Decoder[models.ResultConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OutputLocation"), o.get[scala.Option[models.EncryptionConfiguration]]("EncryptionConfiguration")).mapN(models.ResultConfiguration.apply _)
  }
  final implicit val StartQueryExecutionOutputDecoder: io.circe.Decoder[models.StartQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("QueryExecutionId").map(models.StartQueryExecutionOutput.apply _)
  }
  final implicit val BatchGetQueryExecutionInputDecoder: io.circe.Decoder[models.BatchGetQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("QueryExecutionIds").map(models.BatchGetQueryExecutionInput.apply _)
  }
  final implicit val ListQueryExecutionsInputDecoder: io.circe.Decoder[models.ListQueryExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListQueryExecutionsInput.apply _)
  }
  final implicit val UnprocessedQueryExecutionIdDecoder: io.circe.Decoder[models.UnprocessedQueryExecutionId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QueryExecutionId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(models.UnprocessedQueryExecutionId.apply _)
  }
  final implicit val ResultSetMetadataDecoder: io.circe.Decoder[models.ResultSetMetadata] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ColumnInfo]]]("ColumnInfo").map(models.ResultSetMetadata.apply _)
  }
  final implicit val StopQueryExecutionOutputDecoder: io.circe.Decoder[models.StopQueryExecutionOutput.type] = io.circe.Decoder.decodeUnit.as(models.StopQueryExecutionOutput)
  final implicit val DeleteNamedQueryOutputDecoder: io.circe.Decoder[models.DeleteNamedQueryOutput.type] = io.circe.Decoder.decodeUnit.as(models.DeleteNamedQueryOutput)
  final implicit val InternalServerExceptionDecoder: io.circe.Decoder[models.InternalServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InternalServerException.apply _)
  }
  final implicit val ColumnInfoDecoder: io.circe.Decoder[models.ColumnInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type"), o.get[scala.Option[java.lang.String]]("SchemaName"), o.get[scala.Option[java.lang.String]]("CatalogName"), o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[scala.Int]]("Precision"), o.get[scala.Option[scala.Int]]("Scale"), o.get[scala.Option[java.lang.String]]("Nullable"), o.get[scala.Option[scala.Boolean]]("CaseSensitive")).mapN(models.ColumnInfo.apply _)
  }
  final implicit val GetQueryExecutionInputDecoder: io.circe.Decoder[models.GetQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QueryExecutionId").map(models.GetQueryExecutionInput.apply _)
  }
  final implicit val BatchGetNamedQueryInputDecoder: io.circe.Decoder[models.BatchGetNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("NamedQueryIds").map(models.BatchGetNamedQueryInput.apply _)
  }
  final implicit val RowDecoder: io.circe.Decoder[models.Row] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Datum]]]("Data").map(models.Row.apply _)
  }
  final implicit val ListQueryExecutionsOutputDecoder: io.circe.Decoder[models.ListQueryExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("QueryExecutionIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListQueryExecutionsOutput.apply _)
  }
  final implicit val QueryExecutionStatusDecoder: io.circe.Decoder[models.QueryExecutionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("StateChangeReason"), o.get[scala.Option[java.time.Instant]]("SubmissionDateTime"), o.get[scala.Option[java.time.Instant]]("CompletionDateTime")).mapN(models.QueryExecutionStatus.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AthenaErrorCode"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.InvalidRequestException.apply _)
  }
  final implicit val BatchGetNamedQueryOutputDecoder: io.circe.Decoder[models.BatchGetNamedQueryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.NamedQuery]]]("NamedQueries"), o.get[scala.Option[scala.List[models.UnprocessedNamedQueryId]]]("UnprocessedNamedQueryIds")).mapN(models.BatchGetNamedQueryOutput.apply _)
  }
  final implicit val GetQueryResultsInputDecoder: io.circe.Decoder[models.GetQueryResultsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryExecutionId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.GetQueryResultsInput.apply _)
  }
  final implicit val StopQueryExecutionInputDecoder: io.circe.Decoder[models.StopQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QueryExecutionId").map(models.StopQueryExecutionInput.apply _)
  }
  final implicit val GetQueryExecutionOutputDecoder: io.circe.Decoder[models.GetQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.QueryExecution]]("QueryExecution").map(models.GetQueryExecutionOutput.apply _)
  }
  final implicit val GetNamedQueryInputDecoder: io.circe.Decoder[models.GetNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("NamedQueryId").map(models.GetNamedQueryInput.apply _)
  }
  final implicit val StartQueryExecutionInputDecoder: io.circe.Decoder[models.StartQueryExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[models.ResultConfiguration]("ResultConfiguration"), o.get[scala.Option[java.lang.String]]("ClientRequestToken"), o.get[scala.Option[models.QueryExecutionContext]]("QueryExecutionContext")).mapN(models.StartQueryExecutionInput.apply _)
  }
  final implicit val GetNamedQueryOutputDecoder: io.circe.Decoder[models.GetNamedQueryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.NamedQuery]]("NamedQuery").map(models.GetNamedQueryOutput.apply _)
  }
  final implicit val CreateNamedQueryInputDecoder: io.circe.Decoder[models.CreateNamedQueryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Database"), o.get[scala.Option[java.lang.String]]("ClientRequestToken"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.CreateNamedQueryInput.apply _)
  }
  final implicit val QueryExecutionContextDecoder: io.circe.Decoder[models.QueryExecutionContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Database").map(models.QueryExecutionContext.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.TooManyRequestsException.apply _)
  }
  final implicit val NamedQueryDecoder: io.circe.Decoder[models.NamedQuery] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Database"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("NamedQueryId")).mapN(models.NamedQuery.apply _)
  }
  final implicit val ResultSetDecoder: io.circe.Decoder[models.ResultSet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Row]]]("Rows"), o.get[scala.Option[models.ResultSetMetadata]]("ResultSetMetadata")).mapN(models.ResultSet.apply _)
  }
  final implicit val CreateNamedQueryOutputDecoder: io.circe.Decoder[models.CreateNamedQueryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NamedQueryId").map(models.CreateNamedQueryOutput.apply _)
  }
  final implicit val QueryExecutionStatisticsDecoder: io.circe.Decoder[models.QueryExecutionStatistics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("EngineExecutionTimeInMillis"), o.get[scala.Option[scala.Long]]("DataScannedInBytes")).mapN(models.QueryExecutionStatistics.apply _)
  }
  final implicit val GetQueryResultsOutputDecoder: io.circe.Decoder[models.GetQueryResultsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.ResultSet]]("ResultSet"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetQueryResultsOutput.apply _)
  }
}