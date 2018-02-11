package org.lyranthe.araethura.costandusagereport
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteReportDefinitionRequestEncoder: io.circe.Encoder[models.DeleteReportDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ReportName" -> o.reportName.asJson)
  }
  final implicit val DescribeReportDefinitionsResponseEncoder: io.circe.Encoder[models.DescribeReportDefinitionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReportDefinitions" -> o.reportDefinitions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PutReportDefinitionResponseEncoder: io.circe.Encoder[models.PutReportDefinitionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteReportDefinitionResponseEncoder: io.circe.Encoder[models.DeleteReportDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResponseMessage" -> o.responseMessage.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PutReportDefinitionRequestEncoder: io.circe.Encoder[models.PutReportDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ReportDefinition" -> o.reportDefinition.asJson)
  }
  final implicit val ReportDefinitionEncoder: io.circe.Encoder[models.ReportDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("AdditionalSchemaElements" -> o.additionalSchemaElements.asJson, "Format" -> o.format.asJson, "Compression" -> o.compression.asJson, "TimeUnit" -> o.timeUnit.asJson, "S3Region" -> o.s3Region.asJson, "S3Bucket" -> o.s3Bucket.asJson, "S3Prefix" -> o.s3Prefix.asJson, "ReportName" -> o.reportName.asJson, "AdditionalArtifacts" -> o.additionalArtifacts.asJson)
  }
  final implicit val ReportLimitReachedExceptionEncoder: io.circe.Encoder[models.ReportLimitReachedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeReportDefinitionsRequestEncoder: io.circe.Encoder[models.DescribeReportDefinitionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateReportNameExceptionEncoder: io.circe.Encoder[models.DuplicateReportNameException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteReportDefinitionRequestDecoder: io.circe.Decoder[models.DeleteReportDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ReportName").map(models.DeleteReportDefinitionRequest.apply _)
  }
  final implicit val DescribeReportDefinitionsResponseDecoder: io.circe.Decoder[models.DescribeReportDefinitionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ReportDefinition]]]("ReportDefinitions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeReportDefinitionsResponse.apply _)
  }
  final implicit val PutReportDefinitionResponseDecoder: io.circe.Decoder[models.PutReportDefinitionResponse.type] = io.circe.Decoder.decodeUnit.as(models.PutReportDefinitionResponse)
  final implicit val DeleteReportDefinitionResponseDecoder: io.circe.Decoder[models.DeleteReportDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResponseMessage").map(models.DeleteReportDefinitionResponse.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InternalErrorException.apply _)
  }
  final implicit val PutReportDefinitionRequestDecoder: io.circe.Decoder[models.PutReportDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[models.ReportDefinition]("ReportDefinition").map(models.PutReportDefinitionRequest.apply _)
  }
  final implicit val ReportDefinitionDecoder: io.circe.Decoder[models.ReportDefinition] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("AdditionalSchemaElements"), o.get[java.lang.String]("Format"), o.get[java.lang.String]("Compression"), o.get[java.lang.String]("TimeUnit"), o.get[java.lang.String]("S3Region"), o.get[java.lang.String]("S3Bucket"), o.get[java.lang.String]("S3Prefix"), o.get[java.lang.String]("ReportName"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalArtifacts")).mapN(models.ReportDefinition.apply _)
  }
  final implicit val ReportLimitReachedExceptionDecoder: io.circe.Decoder[models.ReportLimitReachedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ReportLimitReachedException.apply _)
  }
  final implicit val DescribeReportDefinitionsRequestDecoder: io.circe.Decoder[models.DescribeReportDefinitionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeReportDefinitionsRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ValidationException.apply _)
  }
  final implicit val DuplicateReportNameExceptionDecoder: io.circe.Decoder[models.DuplicateReportNameException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicateReportNameException.apply _)
  }
}