package org.lyranthe.araethura.costandusagereport
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteReportDefinitionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ReportName" -> o.reportName.asJson)
  }
  final implicit val DescribeReportDefinitionsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ReportDefinitions" -> o.reportDefinitions.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PutReportDefinitionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteReportDefinitionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResponseMessage" -> o.responseMessage.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PutReportDefinitionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ReportDefinition" -> o.reportDefinition.asJson)
  }
  final implicit val ReportDefinitionEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.ReportDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("AdditionalSchemaElements" -> o.additionalSchemaElements.asJson, "Format" -> o.format.asJson, "Compression" -> o.compression.asJson, "TimeUnit" -> o.timeUnit.asJson, "S3Region" -> o.s3Region.asJson, "S3Bucket" -> o.s3Bucket.asJson, "S3Prefix" -> o.s3Prefix.asJson, "ReportName" -> o.reportName.asJson, "AdditionalArtifacts" -> o.additionalArtifacts.asJson)
  }
  final implicit val ReportLimitReachedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.ReportLimitReachedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeReportDefinitionsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ValidationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.ValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateReportNameExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.costandusagereport.models.DuplicateReportNameException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteReportDefinitionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ReportName").map(org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionRequest.apply _)
  }
  final implicit val DescribeReportDefinitionsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.costandusagereport.models.ReportDefinition]]]("ReportDefinitions"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsResponse.apply _)
  }
  final implicit val PutReportDefinitionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionResponse)
  final implicit val DeleteReportDefinitionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResponseMessage").map(org.lyranthe.araethura.costandusagereport.models.DeleteReportDefinitionResponse.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.costandusagereport.models.InternalErrorException.apply _)
  }
  final implicit val PutReportDefinitionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionRequest] = io.circe.Decoder.instance { o => 
    o.get[org.lyranthe.araethura.costandusagereport.models.ReportDefinition]("ReportDefinition").map(org.lyranthe.araethura.costandusagereport.models.PutReportDefinitionRequest.apply _)
  }
  final implicit val ReportDefinitionDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.ReportDefinition] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("AdditionalSchemaElements"), o.get[java.lang.String]("Format"), o.get[java.lang.String]("Compression"), o.get[java.lang.String]("TimeUnit"), o.get[java.lang.String]("S3Region"), o.get[java.lang.String]("S3Bucket"), o.get[java.lang.String]("S3Prefix"), o.get[java.lang.String]("ReportName"), o.get[scala.Option[scala.List[java.lang.String]]]("AdditionalArtifacts")).mapN(org.lyranthe.araethura.costandusagereport.models.ReportDefinition.apply _)
  }
  final implicit val ReportLimitReachedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.ReportLimitReachedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.costandusagereport.models.ReportLimitReachedException.apply _)
  }
  final implicit val DescribeReportDefinitionsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.costandusagereport.models.DescribeReportDefinitionsRequest.apply _)
  }
  final implicit val ValidationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.ValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.costandusagereport.models.ValidationException.apply _)
  }
  final implicit val DuplicateReportNameExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.costandusagereport.models.DuplicateReportNameException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.costandusagereport.models.DuplicateReportNameException.apply _)
  }
}