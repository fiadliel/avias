package avias.athena
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteNamedQueryInputEncoder: io.circe.Encoder[avias.athena.models.DeleteNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val BatchGetQueryExecutionOutputEncoder: io.circe.Encoder[avias.athena.models.BatchGetQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutions" -> o.queryExecutions.asJson, "UnprocessedQueryExecutionIds" -> o.unprocessedQueryExecutionIds.asJson)
  }
  final implicit val ListNamedQueriesOutputEncoder: io.circe.Encoder[avias.athena.models.ListNamedQueriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryIds" -> o.namedQueryIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EncryptionConfigurationEncoder: io.circe.Encoder[avias.athena.models.EncryptionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionOption" -> o.encryptionOption.asJson, "KmsKey" -> o.kmsKey.asJson)
  }
  final implicit val QueryExecutionEncoder: io.circe.Encoder[avias.athena.models.QueryExecution] = io.circe.Encoder.instance { o => 
    Json.obj("Query" -> o.query.asJson, "QueryExecutionId" -> o.queryExecutionId.asJson, "ResultConfiguration" -> o.resultConfiguration.asJson, "Status" -> o.status.asJson, "QueryExecutionContext" -> o.queryExecutionContext.asJson, "Statistics" -> o.statistics.asJson)
  }
  final implicit val UnprocessedNamedQueryIdEncoder: io.circe.Encoder[avias.athena.models.UnprocessedNamedQueryId] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val DatumEncoder: io.circe.Encoder[avias.athena.models.Datum] = io.circe.Encoder.instance { o => 
    Json.obj("VarCharValue" -> o.varCharValue.asJson)
  }
  final implicit val ListNamedQueriesInputEncoder: io.circe.Encoder[avias.athena.models.ListNamedQueriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ResultConfigurationEncoder: io.circe.Encoder[avias.athena.models.ResultConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("OutputLocation" -> o.outputLocation.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson)
  }
  final implicit val StartQueryExecutionOutputEncoder: io.circe.Encoder[avias.athena.models.StartQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val BatchGetQueryExecutionInputEncoder: io.circe.Encoder[avias.athena.models.BatchGetQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionIds" -> o.queryExecutionIds.asJson)
  }
  final implicit val ListQueryExecutionsInputEncoder: io.circe.Encoder[avias.athena.models.ListQueryExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val UnprocessedQueryExecutionIdEncoder: io.circe.Encoder[avias.athena.models.UnprocessedQueryExecutionId] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResultSetMetadataEncoder: io.circe.Encoder[avias.athena.models.ResultSetMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("ColumnInfo" -> o.columnInfo.asJson)
  }
  final implicit val StopQueryExecutionOutputEncoder: io.circe.Encoder[avias.athena.models.StopQueryExecutionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteNamedQueryOutputEncoder: io.circe.Encoder[avias.athena.models.DeleteNamedQueryOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InternalServerExceptionEncoder: io.circe.Encoder[avias.athena.models.InternalServerException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ColumnInfoEncoder: io.circe.Encoder[avias.athena.models.ColumnInfo] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "SchemaName" -> o.schemaName.asJson, "CatalogName" -> o.catalogName.asJson, "TableName" -> o.tableName.asJson, "Label" -> o.label.asJson, "Precision" -> o.precision.asJson, "Scale" -> o.scale.asJson, "Nullable" -> o.nullable.asJson, "CaseSensitive" -> o.caseSensitive.asJson)
  }
  final implicit val GetQueryExecutionInputEncoder: io.circe.Encoder[avias.athena.models.GetQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val BatchGetNamedQueryInputEncoder: io.circe.Encoder[avias.athena.models.BatchGetNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryIds" -> o.namedQueryIds.asJson)
  }
  final implicit val RowEncoder: io.circe.Encoder[avias.athena.models.Row] = io.circe.Encoder.instance { o => 
    Json.obj("Data" -> o.data.asJson)
  }
  final implicit val ListQueryExecutionsOutputEncoder: io.circe.Encoder[avias.athena.models.ListQueryExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionIds" -> o.queryExecutionIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val QueryExecutionStatusEncoder: io.circe.Encoder[avias.athena.models.QueryExecutionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "SubmissionDateTime" -> o.submissionDateTime.asJson, "CompletionDateTime" -> o.completionDateTime.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[avias.athena.models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("AthenaErrorCode" -> o.athenaErrorCode.asJson, "Message" -> o.message.asJson)
  }
  final implicit val BatchGetNamedQueryOutputEncoder: io.circe.Encoder[avias.athena.models.BatchGetNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueries" -> o.namedQueries.asJson, "UnprocessedNamedQueryIds" -> o.unprocessedNamedQueryIds.asJson)
  }
  final implicit val GetQueryResultsInputEncoder: io.circe.Encoder[avias.athena.models.GetQueryResultsInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val StopQueryExecutionInputEncoder: io.circe.Encoder[avias.athena.models.StopQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val GetQueryExecutionOutputEncoder: io.circe.Encoder[avias.athena.models.GetQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecution" -> o.queryExecution.asJson)
  }
  final implicit val GetNamedQueryInputEncoder: io.circe.Encoder[avias.athena.models.GetNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val StartQueryExecutionInputEncoder: io.circe.Encoder[avias.athena.models.StartQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "ResultConfiguration" -> o.resultConfiguration.asJson, "ClientRequestToken" -> o.clientRequestToken.asJson, "QueryExecutionContext" -> o.queryExecutionContext.asJson)
  }
  final implicit val GetNamedQueryOutputEncoder: io.circe.Encoder[avias.athena.models.GetNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQuery" -> o.namedQuery.asJson)
  }
  final implicit val CreateNamedQueryInputEncoder: io.circe.Encoder[avias.athena.models.CreateNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "Name" -> o.name.asJson, "Database" -> o.database.asJson, "ClientRequestToken" -> o.clientRequestToken.asJson, "Description" -> o.description.asJson)
  }
  final implicit val QueryExecutionContextEncoder: io.circe.Encoder[avias.athena.models.QueryExecutionContext] = io.circe.Encoder.instance { o => 
    Json.obj("Database" -> o.database.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[avias.athena.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val NamedQueryEncoder: io.circe.Encoder[avias.athena.models.NamedQuery] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "Name" -> o.name.asJson, "Database" -> o.database.asJson, "Description" -> o.description.asJson, "NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val ResultSetEncoder: io.circe.Encoder[avias.athena.models.ResultSet] = io.circe.Encoder.instance { o => 
    Json.obj("Rows" -> o.rows.asJson, "ResultSetMetadata" -> o.resultSetMetadata.asJson)
  }
  final implicit val CreateNamedQueryOutputEncoder: io.circe.Encoder[avias.athena.models.CreateNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val QueryExecutionStatisticsEncoder: io.circe.Encoder[avias.athena.models.QueryExecutionStatistics] = io.circe.Encoder.instance { o => 
    Json.obj("EngineExecutionTimeInMillis" -> o.engineExecutionTimeInMillis.asJson, "DataScannedInBytes" -> o.dataScannedInBytes.asJson)
  }
  final implicit val GetQueryResultsOutputEncoder: io.circe.Encoder[avias.athena.models.GetQueryResultsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResultSet" -> o.resultSet.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteNamedQueryInputDecoder: io.circe.Decoder[avias.athena.models.DeleteNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("NamedQueryId").map(avias.athena.models.DeleteNamedQueryInput.apply _)
  }
  final implicit val BatchGetQueryExecutionOutputDecoder: io.circe.Decoder[avias.athena.models.BatchGetQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.athena.models.QueryExecution]]]("QueryExecutions"), o.get[scala.Option[scala.List[avias.athena.models.UnprocessedQueryExecutionId]]]("UnprocessedQueryExecutionIds")).mapN(avias.athena.models.BatchGetQueryExecutionOutput.apply _)
  }
  final implicit val ListNamedQueriesOutputDecoder: io.circe.Decoder[avias.athena.models.ListNamedQueriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("NamedQueryIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.athena.models.ListNamedQueriesOutput.apply _)
  }
  final implicit val EncryptionConfigurationDecoder: io.circe.Decoder[avias.athena.models.EncryptionConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EncryptionOption"), o.get[scala.Option[java.lang.String]]("KmsKey")).mapN(avias.athena.models.EncryptionConfiguration.apply _)
  }
  final implicit val QueryExecutionDecoder: io.circe.Decoder[avias.athena.models.QueryExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Query"), o.get[scala.Option[java.lang.String]]("QueryExecutionId"), o.get[scala.Option[avias.athena.models.ResultConfiguration]]("ResultConfiguration"), o.get[scala.Option[avias.athena.models.QueryExecutionStatus]]("Status"), o.get[scala.Option[avias.athena.models.QueryExecutionContext]]("QueryExecutionContext"), o.get[scala.Option[avias.athena.models.QueryExecutionStatistics]]("Statistics")).mapN(avias.athena.models.QueryExecution.apply _)
  }
  final implicit val UnprocessedNamedQueryIdDecoder: io.circe.Decoder[avias.athena.models.UnprocessedNamedQueryId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NamedQueryId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.athena.models.UnprocessedNamedQueryId.apply _)
  }
  final implicit val DatumDecoder: io.circe.Decoder[avias.athena.models.Datum] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VarCharValue").map(avias.athena.models.Datum.apply _)
  }
  final implicit val ListNamedQueriesInputDecoder: io.circe.Decoder[avias.athena.models.ListNamedQueriesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.athena.models.ListNamedQueriesInput.apply _)
  }
  final implicit val ResultConfigurationDecoder: io.circe.Decoder[avias.athena.models.ResultConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OutputLocation"), o.get[scala.Option[avias.athena.models.EncryptionConfiguration]]("EncryptionConfiguration")).mapN(avias.athena.models.ResultConfiguration.apply _)
  }
  final implicit val StartQueryExecutionOutputDecoder: io.circe.Decoder[avias.athena.models.StartQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("QueryExecutionId").map(avias.athena.models.StartQueryExecutionOutput.apply _)
  }
  final implicit val BatchGetQueryExecutionInputDecoder: io.circe.Decoder[avias.athena.models.BatchGetQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("QueryExecutionIds").map(avias.athena.models.BatchGetQueryExecutionInput.apply _)
  }
  final implicit val ListQueryExecutionsInputDecoder: io.circe.Decoder[avias.athena.models.ListQueryExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.athena.models.ListQueryExecutionsInput.apply _)
  }
  final implicit val UnprocessedQueryExecutionIdDecoder: io.circe.Decoder[avias.athena.models.UnprocessedQueryExecutionId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QueryExecutionId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.athena.models.UnprocessedQueryExecutionId.apply _)
  }
  final implicit val ResultSetMetadataDecoder: io.circe.Decoder[avias.athena.models.ResultSetMetadata] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.athena.models.ColumnInfo]]]("ColumnInfo").map(avias.athena.models.ResultSetMetadata.apply _)
  }
  final implicit val StopQueryExecutionOutputDecoder: io.circe.Decoder[avias.athena.models.StopQueryExecutionOutput.type] = io.circe.Decoder.decodeUnit.as(avias.athena.models.StopQueryExecutionOutput)
  final implicit val DeleteNamedQueryOutputDecoder: io.circe.Decoder[avias.athena.models.DeleteNamedQueryOutput.type] = io.circe.Decoder.decodeUnit.as(avias.athena.models.DeleteNamedQueryOutput)
  final implicit val InternalServerExceptionDecoder: io.circe.Decoder[avias.athena.models.InternalServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.athena.models.InternalServerException.apply _)
  }
  final implicit val ColumnInfoDecoder: io.circe.Decoder[avias.athena.models.ColumnInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type"), o.get[scala.Option[java.lang.String]]("SchemaName"), o.get[scala.Option[java.lang.String]]("CatalogName"), o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[scala.Int]]("Precision"), o.get[scala.Option[scala.Int]]("Scale"), o.get[scala.Option[java.lang.String]]("Nullable"), o.get[scala.Option[scala.Boolean]]("CaseSensitive")).mapN(avias.athena.models.ColumnInfo.apply _)
  }
  final implicit val GetQueryExecutionInputDecoder: io.circe.Decoder[avias.athena.models.GetQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QueryExecutionId").map(avias.athena.models.GetQueryExecutionInput.apply _)
  }
  final implicit val BatchGetNamedQueryInputDecoder: io.circe.Decoder[avias.athena.models.BatchGetNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("NamedQueryIds").map(avias.athena.models.BatchGetNamedQueryInput.apply _)
  }
  final implicit val RowDecoder: io.circe.Decoder[avias.athena.models.Row] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.athena.models.Datum]]]("Data").map(avias.athena.models.Row.apply _)
  }
  final implicit val ListQueryExecutionsOutputDecoder: io.circe.Decoder[avias.athena.models.ListQueryExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("QueryExecutionIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.athena.models.ListQueryExecutionsOutput.apply _)
  }
  final implicit val QueryExecutionStatusDecoder: io.circe.Decoder[avias.athena.models.QueryExecutionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("StateChangeReason"), o.get[scala.Option[java.time.Instant]]("SubmissionDateTime"), o.get[scala.Option[java.time.Instant]]("CompletionDateTime")).mapN(avias.athena.models.QueryExecutionStatus.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[avias.athena.models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AthenaErrorCode"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.athena.models.InvalidRequestException.apply _)
  }
  final implicit val BatchGetNamedQueryOutputDecoder: io.circe.Decoder[avias.athena.models.BatchGetNamedQueryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.athena.models.NamedQuery]]]("NamedQueries"), o.get[scala.Option[scala.List[avias.athena.models.UnprocessedNamedQueryId]]]("UnprocessedNamedQueryIds")).mapN(avias.athena.models.BatchGetNamedQueryOutput.apply _)
  }
  final implicit val GetQueryResultsInputDecoder: io.circe.Decoder[avias.athena.models.GetQueryResultsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryExecutionId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.athena.models.GetQueryResultsInput.apply _)
  }
  final implicit val StopQueryExecutionInputDecoder: io.circe.Decoder[avias.athena.models.StopQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QueryExecutionId").map(avias.athena.models.StopQueryExecutionInput.apply _)
  }
  final implicit val GetQueryExecutionOutputDecoder: io.circe.Decoder[avias.athena.models.GetQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.athena.models.QueryExecution]]("QueryExecution").map(avias.athena.models.GetQueryExecutionOutput.apply _)
  }
  final implicit val GetNamedQueryInputDecoder: io.circe.Decoder[avias.athena.models.GetNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("NamedQueryId").map(avias.athena.models.GetNamedQueryInput.apply _)
  }
  final implicit val StartQueryExecutionInputDecoder: io.circe.Decoder[avias.athena.models.StartQueryExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[avias.athena.models.ResultConfiguration]("ResultConfiguration"), o.get[scala.Option[java.lang.String]]("ClientRequestToken"), o.get[scala.Option[avias.athena.models.QueryExecutionContext]]("QueryExecutionContext")).mapN(avias.athena.models.StartQueryExecutionInput.apply _)
  }
  final implicit val GetNamedQueryOutputDecoder: io.circe.Decoder[avias.athena.models.GetNamedQueryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.athena.models.NamedQuery]]("NamedQuery").map(avias.athena.models.GetNamedQueryOutput.apply _)
  }
  final implicit val CreateNamedQueryInputDecoder: io.circe.Decoder[avias.athena.models.CreateNamedQueryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Database"), o.get[scala.Option[java.lang.String]]("ClientRequestToken"), o.get[scala.Option[java.lang.String]]("Description")).mapN(avias.athena.models.CreateNamedQueryInput.apply _)
  }
  final implicit val QueryExecutionContextDecoder: io.circe.Decoder[avias.athena.models.QueryExecutionContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Database").map(avias.athena.models.QueryExecutionContext.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[avias.athena.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.athena.models.TooManyRequestsException.apply _)
  }
  final implicit val NamedQueryDecoder: io.circe.Decoder[avias.athena.models.NamedQuery] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Database"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("NamedQueryId")).mapN(avias.athena.models.NamedQuery.apply _)
  }
  final implicit val ResultSetDecoder: io.circe.Decoder[avias.athena.models.ResultSet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.athena.models.Row]]]("Rows"), o.get[scala.Option[avias.athena.models.ResultSetMetadata]]("ResultSetMetadata")).mapN(avias.athena.models.ResultSet.apply _)
  }
  final implicit val CreateNamedQueryOutputDecoder: io.circe.Decoder[avias.athena.models.CreateNamedQueryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NamedQueryId").map(avias.athena.models.CreateNamedQueryOutput.apply _)
  }
  final implicit val QueryExecutionStatisticsDecoder: io.circe.Decoder[avias.athena.models.QueryExecutionStatistics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("EngineExecutionTimeInMillis"), o.get[scala.Option[scala.Long]]("DataScannedInBytes")).mapN(avias.athena.models.QueryExecutionStatistics.apply _)
  }
  final implicit val GetQueryResultsOutputDecoder: io.circe.Decoder[avias.athena.models.GetQueryResultsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.athena.models.ResultSet]]("ResultSet"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.athena.models.GetQueryResultsOutput.apply _)
  }
}