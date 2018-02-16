package avias.costandusagereport
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteReportDefinitionRequestEncoder: io.circe.Encoder[avias.costandusagereport.models.DeleteReportDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ReportName" -> o.reportName.asJson)
  }
  final implicit val DescribeReportDefinitionsResponseEncoder: io.circe.Encoder[avias.costandusagereport.models.DescribeReportDefinitionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReportDefinitions" -> o.reportDefinitions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PutReportDefinitionResponseEncoder: io.circe.Encoder[avias.costandusagereport.models.PutReportDefinitionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteReportDefinitionResponseEncoder: io.circe.Encoder[avias.costandusagereport.models.DeleteReportDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResponseMessage" -> o.responseMessage.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[avias.costandusagereport.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PutReportDefinitionRequestEncoder: io.circe.Encoder[avias.costandusagereport.models.PutReportDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ReportDefinition" -> o.reportDefinition.asJson)
  }
  final implicit val ReportDefinitionEncoder: io.circe.Encoder[avias.costandusagereport.models.ReportDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("AdditionalSchemaElements" -> o.additionalSchemaElements.asJson, "Format" -> o.format.asJson, "Compression" -> o.compression.asJson, "TimeUnit" -> o.timeUnit.asJson, "S3Region" -> o.s3Region.asJson, "S3Bucket" -> o.s3Bucket.asJson, "S3Prefix" -> o.s3Prefix.asJson, "ReportName" -> o.reportName.asJson, "AdditionalArtifacts" -> o.additionalArtifacts.asJson)
  }
  final implicit val ReportLimitReachedExceptionEncoder: io.circe.Encoder[avias.costandusagereport.models.ReportLimitReachedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeReportDefinitionsRequestEncoder: io.circe.Encoder[avias.costandusagereport.models.DescribeReportDefinitionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[avias.costandusagereport.models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateReportNameExceptionEncoder: io.circe.Encoder[avias.costandusagereport.models.DuplicateReportNameException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteReportDefinitionRequestDecoder: io.circe.Decoder[avias.costandusagereport.models.DeleteReportDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ReportName").map(avias.costandusagereport.models.DeleteReportDefinitionRequest.apply _)
  }
  final implicit val DescribeReportDefinitionsResponseDecoder: io.circe.Decoder[avias.costandusagereport.models.DescribeReportDefinitionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.costandusagereport.models.ReportDefinition]]]("ReportDefinitions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.costandusagereport.models.DescribeReportDefinitionsResponse.apply _)
  }
  final implicit val PutReportDefinitionResponseDecoder: io.circe.Decoder[avias.costandusagereport.models.PutReportDefinitionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.costandusagereport.models.PutReportDefinitionResponse)
  final implicit val DeleteReportDefinitionResponseDecoder: io.circe.Decoder[avias.costandusagereport.models.DeleteReportDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResponseMessage").map(avias.costandusagereport.models.DeleteReportDefinitionResponse.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[avias.costandusagereport.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.costandusagereport.models.InternalErrorException.apply _)
  }
  final implicit val PutReportDefinitionRequestDecoder: io.circe.Decoder[avias.costandusagereport.models.PutReportDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[avias.costandusagereport.models.ReportDefinition]("ReportDefinition").map(avias.costandusagereport.models.PutReportDefinitionRequest.apply _)
  }
  final implicit val ReportDefinitionDecoder: io.circe.Decoder[avias.costandusagereport.models.ReportDefinition] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("AdditionalSchemaElements"), o.get[java.lang.String]("Format"), o.get[java.lang.String]("Compression"), o.get[java.lang.String]("TimeUnit"), o.get[java.lang.String]("S3Region"), o.get[java.lang.String]("S3Bucket"), o.get[java.lang.String]("S3Prefix"), o.get[java.lang.String]("ReportName"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalArtifacts")).mapN(avias.costandusagereport.models.ReportDefinition.apply _)
  }
  final implicit val ReportLimitReachedExceptionDecoder: io.circe.Decoder[avias.costandusagereport.models.ReportLimitReachedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.costandusagereport.models.ReportLimitReachedException.apply _)
  }
  final implicit val DescribeReportDefinitionsRequestDecoder: io.circe.Decoder[avias.costandusagereport.models.DescribeReportDefinitionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.costandusagereport.models.DescribeReportDefinitionsRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[avias.costandusagereport.models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.costandusagereport.models.ValidationException.apply _)
  }
  final implicit val DuplicateReportNameExceptionDecoder: io.circe.Decoder[avias.costandusagereport.models.DuplicateReportNameException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.costandusagereport.models.DuplicateReportNameException.apply _)
  }
}