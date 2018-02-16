package org.lyranthe.araethura.resourcegroupstaggingapi
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetTagValuesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesInput] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val InternalServiceExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.InternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val GetTagKeysOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetTagValuesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson, "TagValues" -> o.tagValues.asJson)
  }
  final implicit val GetResourcesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson, "ResourceTagMappingList" -> o.resourceTagMappingList.asJson)
  }
  final implicit val GetTagKeysInputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysInput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val TagResourcesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNList" -> o.resourceARNList.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val UntagResourcesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNList" -> o.resourceARNList.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetResourcesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourcesPerPage" -> o.resourcesPerPage.asJson, "PaginationToken" -> o.paginationToken.asJson, "TagFilters" -> o.tagFilters.asJson, "ResourceTypeFilters" -> o.resourceTypeFilters.asJson, "TagsPerPage" -> o.tagsPerPage.asJson)
  }
  final implicit val TagResourcesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FailedResourcesMap" -> o.failedResourcesMap.asJson)
  }
  final implicit val PaginationTokenExpiredExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.PaginationTokenExpiredException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UntagResourcesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FailedResourcesMap" -> o.failedResourcesMap.asJson)
  }
  final implicit val FailureInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo] = io.circe.Encoder.instance { o => 
    Json.obj("StatusCode" -> o.statusCode.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResourceTagMappingEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.ResourceTagMapping] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ThrottledExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.ThrottledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TagFilterEncoder: io.circe.Encoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val GetTagValuesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesInput.apply _)
  }
  final implicit val InternalServiceExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.InternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.InternalServiceException.apply _)
  }
  final implicit val GetTagKeysOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[java.lang.String]]]("TagKeys")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysOutput.apply _)
  }
  final implicit val GetTagValuesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[java.lang.String]]]("TagValues")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesOutput.apply _)
  }
  final implicit val GetResourcesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.resourcegroupstaggingapi.models.ResourceTagMapping]]]("ResourceTagMappingList")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesOutput.apply _)
  }
  final implicit val GetTagKeysInputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("PaginationToken").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysInput.apply _)
  }
  final implicit val TagResourcesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ResourceARNList"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Tags")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesInput.apply _)
  }
  final implicit val UntagResourcesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ResourceARNList"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesInput.apply _)
  }
  final implicit val GetResourcesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ResourcesPerPage"), o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagFilter]]]("TagFilters"), o.get[scala.Option[scala.List[java.lang.String]]]("ResourceTypeFilters"), o.get[scala.Option[scala.Int]]("TagsPerPage")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesInput.apply _)
  }
  final implicit val TagResourcesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo]]]("FailedResourcesMap").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesOutput.apply _)
  }
  final implicit val PaginationTokenExpiredExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.PaginationTokenExpiredException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.PaginationTokenExpiredException.apply _)
  }
  final implicit val UntagResourcesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo]]]("FailedResourcesMap").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesOutput.apply _)
  }
  final implicit val FailureInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("StatusCode"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.FailureInfo.apply _)
  }
  final implicit val ResourceTagMappingDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.ResourceTagMapping] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.resourcegroupstaggingapi.models.Tag]]]("Tags")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.ResourceTagMapping.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.InvalidParameterException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.Tag.apply _)
  }
  final implicit val ThrottledExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.ThrottledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.resourcegroupstaggingapi.models.ThrottledException.apply _)
  }
  final implicit val TagFilterDecoder: io.circe.Decoder[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(org.lyranthe.araethura.resourcegroupstaggingapi.models.TagFilter.apply _)
  }
}