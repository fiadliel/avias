package org.lyranthe.araethura.athena
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteNamedQueryInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.DeleteNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val BatchGetQueryExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.BatchGetQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutions" -> o.queryExecutions.asJson, "UnprocessedQueryExecutionIds" -> o.unprocessedQueryExecutionIds.asJson)
  }
  final implicit val ListNamedQueriesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ListNamedQueriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryIds" -> o.namedQueryIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EncryptionConfigurationEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.EncryptionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionOption" -> o.encryptionOption.asJson, "KmsKey" -> o.kmsKey.asJson)
  }
  final implicit val QueryExecutionEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.QueryExecution] = io.circe.Encoder.instance { o => 
    Json.obj("Query" -> o.query.asJson, "QueryExecutionId" -> o.queryExecutionId.asJson, "ResultConfiguration" -> o.resultConfiguration.asJson, "Status" -> o.status.asJson, "QueryExecutionContext" -> o.queryExecutionContext.asJson, "Statistics" -> o.statistics.asJson)
  }
  final implicit val UnprocessedNamedQueryIdEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.UnprocessedNamedQueryId] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val DatumEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.Datum] = io.circe.Encoder.instance { o => 
    Json.obj("VarCharValue" -> o.varCharValue.asJson)
  }
  final implicit val ListNamedQueriesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ListNamedQueriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ResultConfigurationEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ResultConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("OutputLocation" -> o.outputLocation.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson)
  }
  final implicit val StartQueryExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.StartQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val BatchGetQueryExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.BatchGetQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionIds" -> o.queryExecutionIds.asJson)
  }
  final implicit val ListQueryExecutionsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ListQueryExecutionsInput] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val UnprocessedQueryExecutionIdEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.UnprocessedQueryExecutionId] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResultSetMetadataEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ResultSetMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("ColumnInfo" -> o.columnInfo.asJson)
  }
  final implicit val StopQueryExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.StopQueryExecutionOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteNamedQueryOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.DeleteNamedQueryOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InternalServerExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.InternalServerException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ColumnInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ColumnInfo] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "SchemaName" -> o.schemaName.asJson, "CatalogName" -> o.catalogName.asJson, "TableName" -> o.tableName.asJson, "Label" -> o.label.asJson, "Precision" -> o.precision.asJson, "Scale" -> o.scale.asJson, "Nullable" -> o.nullable.asJson, "CaseSensitive" -> o.caseSensitive.asJson)
  }
  final implicit val GetQueryExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.GetQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val BatchGetNamedQueryInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.BatchGetNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryIds" -> o.namedQueryIds.asJson)
  }
  final implicit val RowEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.Row] = io.circe.Encoder.instance { o => 
    Json.obj("Data" -> o.data.asJson)
  }
  final implicit val ListQueryExecutionsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ListQueryExecutionsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionIds" -> o.queryExecutionIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val QueryExecutionStatusEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.QueryExecutionStatus] = io.circe.Encoder.instance { o => 
    Json.obj("State" -> o.state.asJson, "StateChangeReason" -> o.stateChangeReason.asJson, "SubmissionDateTime" -> o.submissionDateTime.asJson, "CompletionDateTime" -> o.completionDateTime.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.InvalidRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("AthenaErrorCode" -> o.athenaErrorCode.asJson, "Message" -> o.message.asJson)
  }
  final implicit val BatchGetNamedQueryOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.BatchGetNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueries" -> o.namedQueries.asJson, "UnprocessedNamedQueryIds" -> o.unprocessedNamedQueryIds.asJson)
  }
  final implicit val GetQueryResultsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.GetQueryResultsInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val StopQueryExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.StopQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecutionId" -> o.queryExecutionId.asJson)
  }
  final implicit val GetQueryExecutionOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.GetQueryExecutionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryExecution" -> o.queryExecution.asJson)
  }
  final implicit val GetNamedQueryInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.GetNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val StartQueryExecutionInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.StartQueryExecutionInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "ResultConfiguration" -> o.resultConfiguration.asJson, "ClientRequestToken" -> o.clientRequestToken.asJson, "QueryExecutionContext" -> o.queryExecutionContext.asJson)
  }
  final implicit val GetNamedQueryOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.GetNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQuery" -> o.namedQuery.asJson)
  }
  final implicit val CreateNamedQueryInputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.CreateNamedQueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "Name" -> o.name.asJson, "Database" -> o.database.asJson, "ClientRequestToken" -> o.clientRequestToken.asJson, "Description" -> o.description.asJson)
  }
  final implicit val QueryExecutionContextEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.QueryExecutionContext] = io.circe.Encoder.instance { o => 
    Json.obj("Database" -> o.database.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val NamedQueryEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.NamedQuery] = io.circe.Encoder.instance { o => 
    Json.obj("QueryString" -> o.queryString.asJson, "Name" -> o.name.asJson, "Database" -> o.database.asJson, "Description" -> o.description.asJson, "NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val ResultSetEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.ResultSet] = io.circe.Encoder.instance { o => 
    Json.obj("Rows" -> o.rows.asJson, "ResultSetMetadata" -> o.resultSetMetadata.asJson)
  }
  final implicit val CreateNamedQueryOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.CreateNamedQueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NamedQueryId" -> o.namedQueryId.asJson)
  }
  final implicit val QueryExecutionStatisticsEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.QueryExecutionStatistics] = io.circe.Encoder.instance { o => 
    Json.obj("EngineExecutionTimeInMillis" -> o.engineExecutionTimeInMillis.asJson, "DataScannedInBytes" -> o.dataScannedInBytes.asJson)
  }
  final implicit val GetQueryResultsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.athena.models.GetQueryResultsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResultSet" -> o.resultSet.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteNamedQueryInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.DeleteNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("NamedQueryId").map(org.lyranthe.araethura.athena.models.DeleteNamedQueryInput.apply _)
  }
  final implicit val BatchGetQueryExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.BatchGetQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.QueryExecution]]]("QueryExecutions"), o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.UnprocessedQueryExecutionId]]]("UnprocessedQueryExecutionIds")).mapN(org.lyranthe.araethura.athena.models.BatchGetQueryExecutionOutput.apply _)
  }
  final implicit val ListNamedQueriesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ListNamedQueriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("NamedQueryIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.athena.models.ListNamedQueriesOutput.apply _)
  }
  final implicit val EncryptionConfigurationDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.EncryptionConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("EncryptionOption"), o.get[scala.Option[java.lang.String]]("KmsKey")).mapN(org.lyranthe.araethura.athena.models.EncryptionConfiguration.apply _)
  }
  final implicit val QueryExecutionDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.QueryExecution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Query"), o.get[scala.Option[java.lang.String]]("QueryExecutionId"), o.get[scala.Option[org.lyranthe.araethura.athena.models.ResultConfiguration]]("ResultConfiguration"), o.get[scala.Option[org.lyranthe.araethura.athena.models.QueryExecutionStatus]]("Status"), o.get[scala.Option[org.lyranthe.araethura.athena.models.QueryExecutionContext]]("QueryExecutionContext"), o.get[scala.Option[org.lyranthe.araethura.athena.models.QueryExecutionStatistics]]("Statistics")).mapN(org.lyranthe.araethura.athena.models.QueryExecution.apply _)
  }
  final implicit val UnprocessedNamedQueryIdDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.UnprocessedNamedQueryId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NamedQueryId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(org.lyranthe.araethura.athena.models.UnprocessedNamedQueryId.apply _)
  }
  final implicit val DatumDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.Datum] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VarCharValue").map(org.lyranthe.araethura.athena.models.Datum.apply _)
  }
  final implicit val ListNamedQueriesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ListNamedQueriesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.athena.models.ListNamedQueriesInput.apply _)
  }
  final implicit val ResultConfigurationDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ResultConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OutputLocation"), o.get[scala.Option[org.lyranthe.araethura.athena.models.EncryptionConfiguration]]("EncryptionConfiguration")).mapN(org.lyranthe.araethura.athena.models.ResultConfiguration.apply _)
  }
  final implicit val StartQueryExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.StartQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("QueryExecutionId").map(org.lyranthe.araethura.athena.models.StartQueryExecutionOutput.apply _)
  }
  final implicit val BatchGetQueryExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.BatchGetQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("QueryExecutionIds").map(org.lyranthe.araethura.athena.models.BatchGetQueryExecutionInput.apply _)
  }
  final implicit val ListQueryExecutionsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ListQueryExecutionsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.athena.models.ListQueryExecutionsInput.apply _)
  }
  final implicit val UnprocessedQueryExecutionIdDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.UnprocessedQueryExecutionId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QueryExecutionId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(org.lyranthe.araethura.athena.models.UnprocessedQueryExecutionId.apply _)
  }
  final implicit val ResultSetMetadataDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ResultSetMetadata] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.ColumnInfo]]]("ColumnInfo").map(org.lyranthe.araethura.athena.models.ResultSetMetadata.apply _)
  }
  final implicit val StopQueryExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.StopQueryExecutionOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.athena.models.StopQueryExecutionOutput)
  final implicit val DeleteNamedQueryOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.DeleteNamedQueryOutput.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.athena.models.DeleteNamedQueryOutput)
  final implicit val InternalServerExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.InternalServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.athena.models.InternalServerException.apply _)
  }
  final implicit val ColumnInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ColumnInfo] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type"), o.get[scala.Option[java.lang.String]]("SchemaName"), o.get[scala.Option[java.lang.String]]("CatalogName"), o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[scala.Int]]("Precision"), o.get[scala.Option[scala.Int]]("Scale"), o.get[scala.Option[java.lang.String]]("Nullable"), o.get[scala.Option[scala.Boolean]]("CaseSensitive")).mapN(org.lyranthe.araethura.athena.models.ColumnInfo.apply _)
  }
  final implicit val GetQueryExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.GetQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QueryExecutionId").map(org.lyranthe.araethura.athena.models.GetQueryExecutionInput.apply _)
  }
  final implicit val BatchGetNamedQueryInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.BatchGetNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("NamedQueryIds").map(org.lyranthe.araethura.athena.models.BatchGetNamedQueryInput.apply _)
  }
  final implicit val RowDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.Row] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.Datum]]]("Data").map(org.lyranthe.araethura.athena.models.Row.apply _)
  }
  final implicit val ListQueryExecutionsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ListQueryExecutionsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("QueryExecutionIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.athena.models.ListQueryExecutionsOutput.apply _)
  }
  final implicit val QueryExecutionStatusDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.QueryExecutionStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("StateChangeReason"), o.get[scala.Option[java.time.Instant]]("SubmissionDateTime"), o.get[scala.Option[java.time.Instant]]("CompletionDateTime")).mapN(org.lyranthe.araethura.athena.models.QueryExecutionStatus.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.InvalidRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AthenaErrorCode"), o.get[scala.Option[java.lang.String]]("Message")).mapN(org.lyranthe.araethura.athena.models.InvalidRequestException.apply _)
  }
  final implicit val BatchGetNamedQueryOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.BatchGetNamedQueryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.NamedQuery]]]("NamedQueries"), o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.UnprocessedNamedQueryId]]]("UnprocessedNamedQueryIds")).mapN(org.lyranthe.araethura.athena.models.BatchGetNamedQueryOutput.apply _)
  }
  final implicit val GetQueryResultsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.GetQueryResultsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryExecutionId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.athena.models.GetQueryResultsInput.apply _)
  }
  final implicit val StopQueryExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.StopQueryExecutionInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QueryExecutionId").map(org.lyranthe.araethura.athena.models.StopQueryExecutionInput.apply _)
  }
  final implicit val GetQueryExecutionOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.GetQueryExecutionOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.athena.models.QueryExecution]]("QueryExecution").map(org.lyranthe.araethura.athena.models.GetQueryExecutionOutput.apply _)
  }
  final implicit val GetNamedQueryInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.GetNamedQueryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("NamedQueryId").map(org.lyranthe.araethura.athena.models.GetNamedQueryInput.apply _)
  }
  final implicit val StartQueryExecutionInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.StartQueryExecutionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[org.lyranthe.araethura.athena.models.ResultConfiguration]("ResultConfiguration"), o.get[scala.Option[java.lang.String]]("ClientRequestToken"), o.get[scala.Option[org.lyranthe.araethura.athena.models.QueryExecutionContext]]("QueryExecutionContext")).mapN(org.lyranthe.araethura.athena.models.StartQueryExecutionInput.apply _)
  }
  final implicit val GetNamedQueryOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.GetNamedQueryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.athena.models.NamedQuery]]("NamedQuery").map(org.lyranthe.araethura.athena.models.GetNamedQueryOutput.apply _)
  }
  final implicit val CreateNamedQueryInputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.CreateNamedQueryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Database"), o.get[scala.Option[java.lang.String]]("ClientRequestToken"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.athena.models.CreateNamedQueryInput.apply _)
  }
  final implicit val QueryExecutionContextDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.QueryExecutionContext] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Database").map(org.lyranthe.araethura.athena.models.QueryExecutionContext.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(org.lyranthe.araethura.athena.models.TooManyRequestsException.apply _)
  }
  final implicit val NamedQueryDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.NamedQuery] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QueryString"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Database"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("NamedQueryId")).mapN(org.lyranthe.araethura.athena.models.NamedQuery.apply _)
  }
  final implicit val ResultSetDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.ResultSet] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.athena.models.Row]]]("Rows"), o.get[scala.Option[org.lyranthe.araethura.athena.models.ResultSetMetadata]]("ResultSetMetadata")).mapN(org.lyranthe.araethura.athena.models.ResultSet.apply _)
  }
  final implicit val CreateNamedQueryOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.CreateNamedQueryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NamedQueryId").map(org.lyranthe.araethura.athena.models.CreateNamedQueryOutput.apply _)
  }
  final implicit val QueryExecutionStatisticsDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.QueryExecutionStatistics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("EngineExecutionTimeInMillis"), o.get[scala.Option[scala.Long]]("DataScannedInBytes")).mapN(org.lyranthe.araethura.athena.models.QueryExecutionStatistics.apply _)
  }
  final implicit val GetQueryResultsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.athena.models.GetQueryResultsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[org.lyranthe.araethura.athena.models.ResultSet]]("ResultSet"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.athena.models.GetQueryResultsOutput.apply _)
  }
}