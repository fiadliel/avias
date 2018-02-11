package org.lyranthe.araethura.resourcegroupstaggingapi
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetTagValuesInputEncoder: io.circe.Encoder[models.GetTagValuesInput] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val InternalServiceExceptionEncoder: io.circe.Encoder[models.InternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val GetTagKeysOutputEncoder: io.circe.Encoder[models.GetTagKeysOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetTagValuesOutputEncoder: io.circe.Encoder[models.GetTagValuesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson, "TagValues" -> o.tagValues.asJson)
  }
  final implicit val GetResourcesOutputEncoder: io.circe.Encoder[models.GetResourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson, "ResourceTagMappingList" -> o.resourceTagMappingList.asJson)
  }
  final implicit val GetTagKeysInputEncoder: io.circe.Encoder[models.GetTagKeysInput] = io.circe.Encoder.instance { o => 
    Json.obj("PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val TagResourcesInputEncoder: io.circe.Encoder[models.TagResourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNList" -> o.resourceARNList.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val UntagResourcesInputEncoder: io.circe.Encoder[models.UntagResourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARNList" -> o.resourceARNList.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetResourcesInputEncoder: io.circe.Encoder[models.GetResourcesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourcesPerPage" -> o.resourcesPerPage.asJson, "PaginationToken" -> o.paginationToken.asJson, "TagFilters" -> o.tagFilters.asJson, "ResourceTypeFilters" -> o.resourceTypeFilters.asJson, "TagsPerPage" -> o.tagsPerPage.asJson)
  }
  final implicit val TagResourcesOutputEncoder: io.circe.Encoder[models.TagResourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FailedResourcesMap" -> o.failedResourcesMap.asJson)
  }
  final implicit val PaginationTokenExpiredExceptionEncoder: io.circe.Encoder[models.PaginationTokenExpiredException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UntagResourcesOutputEncoder: io.circe.Encoder[models.UntagResourcesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FailedResourcesMap" -> o.failedResourcesMap.asJson)
  }
  final implicit val FailureInfoEncoder: io.circe.Encoder[models.FailureInfo] = io.circe.Encoder.instance { o => 
    Json.obj("StatusCode" -> o.statusCode.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val ResourceTagMappingEncoder: io.circe.Encoder[models.ResourceTagMapping] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ThrottledExceptionEncoder: io.circe.Encoder[models.ThrottledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TagFilterEncoder: io.circe.Encoder[models.TagFilter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val GetTagValuesInputDecoder: io.circe.Decoder[models.GetTagValuesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(models.GetTagValuesInput.apply _)
  }
  final implicit val InternalServiceExceptionDecoder: io.circe.Decoder[models.InternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InternalServiceException.apply _)
  }
  final implicit val GetTagKeysOutputDecoder: io.circe.Decoder[models.GetTagKeysOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[java.lang.String]]]("TagKeys")).mapN(models.GetTagKeysOutput.apply _)
  }
  final implicit val GetTagValuesOutputDecoder: io.circe.Decoder[models.GetTagValuesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[java.lang.String]]]("TagValues")).mapN(models.GetTagValuesOutput.apply _)
  }
  final implicit val GetResourcesOutputDecoder: io.circe.Decoder[models.GetResourcesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[models.ResourceTagMapping]]]("ResourceTagMappingList")).mapN(models.GetResourcesOutput.apply _)
  }
  final implicit val GetTagKeysInputDecoder: io.circe.Decoder[models.GetTagKeysInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("PaginationToken").map(models.GetTagKeysInput.apply _)
  }
  final implicit val TagResourcesInputDecoder: io.circe.Decoder[models.TagResourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ResourceARNList"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Tags")).mapN(models.TagResourcesInput.apply _)
  }
  final implicit val UntagResourcesInputDecoder: io.circe.Decoder[models.UntagResourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ResourceARNList"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.UntagResourcesInput.apply _)
  }
  final implicit val GetResourcesInputDecoder: io.circe.Decoder[models.GetResourcesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("ResourcesPerPage"), o.get[scala.Option[java.lang.String]]("PaginationToken"), o.get[scala.Option[scala.List[models.TagFilter]]]("TagFilters"), o.get[scala.Option[scala.List[java.lang.String]]]("ResourceTypeFilters"), o.get[scala.Option[scala.Int]]("TagsPerPage")).mapN(models.GetResourcesInput.apply _)
  }
  final implicit val TagResourcesOutputDecoder: io.circe.Decoder[models.TagResourcesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.FailureInfo]]]("FailedResourcesMap").map(models.TagResourcesOutput.apply _)
  }
  final implicit val PaginationTokenExpiredExceptionDecoder: io.circe.Decoder[models.PaginationTokenExpiredException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PaginationTokenExpiredException.apply _)
  }
  final implicit val UntagResourcesOutputDecoder: io.circe.Decoder[models.UntagResourcesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.FailureInfo]]]("FailedResourcesMap").map(models.UntagResourcesOutput.apply _)
  }
  final implicit val FailureInfoDecoder: io.circe.Decoder[models.FailureInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("StatusCode"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(models.FailureInfo.apply _)
  }
  final implicit val ResourceTagMappingDecoder: io.circe.Decoder[models.ResourceTagMapping] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[scala.List[models.Tag]]]("Tags")).mapN(models.ResourceTagMapping.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InvalidParameterException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val ThrottledExceptionDecoder: io.circe.Decoder[models.ThrottledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ThrottledException.apply _)
  }
  final implicit val TagFilterDecoder: io.circe.Decoder[models.TagFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(models.TagFilter.apply _)
  }
}