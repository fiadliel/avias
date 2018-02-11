package org.lyranthe.araethura.cloudtrail
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val InvalidTrailNameExceptionEncoder: io.circe.Encoder[models.InvalidTrailNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LookupAttributeEncoder: io.circe.Encoder[models.LookupAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeKey" -> o.attributeKey.asJson, "AttributeValue" -> o.attributeValue.asJson)
  }
  final implicit val DescribeTrailsResponseEncoder: io.circe.Encoder[models.DescribeTrailsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("trailList" -> o.trailList.asJson)
  }
  final implicit val OperationNotPermittedExceptionEncoder: io.circe.Encoder[models.OperationNotPermittedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartLoggingRequestEncoder: io.circe.Encoder[models.StartLoggingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val CreateTrailRequestEncoder: io.circe.Encoder[models.CreateTrailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "EnableLogFileValidation" -> o.enableLogFileValidation.asJson)
  }
  final implicit val InvalidTimeRangeExceptionEncoder: io.circe.Encoder[models.InvalidTimeRangeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TrailEncoder: io.circe.Encoder[models.Trail] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "HomeRegion" -> o.homeRegion.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "Name" -> o.name.asJson, "SnsTopicARN" -> o.snsTopicARN.asJson, "TrailARN" -> o.trailARN.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "LogFileValidationEnabled" -> o.logFileValidationEnabled.asJson, "HasCustomEventSelectors" -> o.hasCustomEventSelectors.asJson)
  }
  final implicit val ResourceTypeNotSupportedExceptionEncoder: io.circe.Encoder[models.ResourceTypeNotSupportedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutEventSelectorsResponseEncoder: io.circe.Encoder[models.PutEventSelectorsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TrailARN" -> o.trailARN.asJson, "EventSelectors" -> o.eventSelectors.asJson)
  }
  final implicit val TrailNotProvidedExceptionEncoder: io.circe.Encoder[models.TrailNotProvidedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TrailAlreadyExistsExceptionEncoder: io.circe.Encoder[models.TrailAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InsufficientEncryptionPolicyExceptionEncoder: io.circe.Encoder[models.InsufficientEncryptionPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[models.UnsupportedOperationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteTrailRequestEncoder: io.circe.Encoder[models.DeleteTrailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val CreateTrailResponseEncoder: io.circe.Encoder[models.CreateTrailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "Name" -> o.name.asJson, "SnsTopicARN" -> o.snsTopicARN.asJson, "TrailARN" -> o.trailARN.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "LogFileValidationEnabled" -> o.logFileValidationEnabled.asJson)
  }
  final implicit val PutEventSelectorsRequestEncoder: io.circe.Encoder[models.PutEventSelectorsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrailName" -> o.trailName.asJson, "EventSelectors" -> o.eventSelectors.asJson)
  }
  final implicit val S3BucketDoesNotExistExceptionEncoder: io.circe.Encoder[models.S3BucketDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CloudWatchLogsDeliveryUnavailableExceptionEncoder: io.circe.Encoder[models.CloudWatchLogsDeliveryUnavailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTagParameterExceptionEncoder: io.circe.Encoder[models.InvalidTagParameterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidS3PrefixExceptionEncoder: io.circe.Encoder[models.InvalidS3PrefixException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidHomeRegionExceptionEncoder: io.circe.Encoder[models.InvalidHomeRegionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TrailNotFoundExceptionEncoder: io.circe.Encoder[models.TrailNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateTrailResponseEncoder: io.circe.Encoder[models.UpdateTrailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "Name" -> o.name.asJson, "SnsTopicARN" -> o.snsTopicARN.asJson, "TrailARN" -> o.trailARN.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "LogFileValidationEnabled" -> o.logFileValidationEnabled.asJson)
  }
  final implicit val AddTagsRequestEncoder: io.circe.Encoder[models.AddTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagsList" -> o.tagsList.asJson)
  }
  final implicit val StopLoggingResponseEncoder: io.circe.Encoder[models.StopLoggingResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidParameterCombinationExceptionEncoder: io.circe.Encoder[models.InvalidParameterCombinationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StopLoggingRequestEncoder: io.circe.Encoder[models.StopLoggingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val KmsExceptionEncoder: io.circe.Encoder[models.KmsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateTrailRequestEncoder: io.circe.Encoder[models.UpdateTrailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "EnableLogFileValidation" -> o.enableLogFileValidation.asJson)
  }
  final implicit val InsufficientS3BucketPolicyExceptionEncoder: io.circe.Encoder[models.InsufficientS3BucketPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidCloudWatchLogsLogGroupArnExceptionEncoder: io.circe.Encoder[models.InvalidCloudWatchLogsLogGroupArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteTrailResponseEncoder: io.circe.Encoder[models.DeleteTrailResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceTagEncoder: io.circe.Encoder[models.ResourceTag] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagsList" -> o.tagsList.asJson)
  }
  final implicit val KmsKeyNotFoundExceptionEncoder: io.circe.Encoder[models.KmsKeyNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListTagsRequestEncoder: io.circe.Encoder[models.ListTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceIdList" -> o.resourceIdList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val LookupEventsRequestEncoder: io.circe.Encoder[models.LookupEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LookupAttributes" -> o.lookupAttributes.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidLookupAttributesExceptionEncoder: io.circe.Encoder[models.InvalidLookupAttributesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsRequestEncoder: io.circe.Encoder[models.RemoveTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagsList" -> o.tagsList.asJson)
  }
  final implicit val InvalidMaxResultsExceptionEncoder: io.circe.Encoder[models.InvalidMaxResultsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTokenExceptionEncoder: io.circe.Encoder[models.InvalidTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListTagsResponseEncoder: io.circe.Encoder[models.ListTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceTagList" -> o.resourceTagList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("CloudTrailEvent" -> o.cloudTrailEvent.asJson, "Username" -> o.username.asJson, "EventSource" -> o.eventSource.asJson, "EventName" -> o.eventName.asJson, "EventId" -> o.eventId.asJson, "EventTime" -> o.eventTime.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val InvalidSnsTopicNameExceptionEncoder: io.circe.Encoder[models.InvalidSnsTopicNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CloudTrailARNInvalidExceptionEncoder: io.circe.Encoder[models.CloudTrailARNInvalidException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InsufficientSnsTopicPolicyExceptionEncoder: io.circe.Encoder[models.InsufficientSnsTopicPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val KmsKeyDisabledExceptionEncoder: io.circe.Encoder[models.KmsKeyDisabledException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsResponseEncoder: io.circe.Encoder[models.RemoveTagsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidCloudWatchLogsRoleArnExceptionEncoder: io.circe.Encoder[models.InvalidCloudWatchLogsRoleArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetTrailStatusResponseEncoder: io.circe.Encoder[models.GetTrailStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IsLogging" -> o.isLogging.asJson, "TimeLoggingStarted" -> o.timeLoggingStarted.asJson, "LatestDeliveryAttemptSucceeded" -> o.latestDeliveryAttemptSucceeded.asJson, "LatestDeliveryAttemptTime" -> o.latestDeliveryAttemptTime.asJson, "LatestNotificationError" -> o.latestNotificationError.asJson, "LatestNotificationAttemptSucceeded" -> o.latestNotificationAttemptSucceeded.asJson, "LatestDeliveryError" -> o.latestDeliveryError.asJson, "TimeLoggingStopped" -> o.timeLoggingStopped.asJson, "LatestCloudWatchLogsDeliveryError" -> o.latestCloudWatchLogsDeliveryError.asJson, "LatestNotificationAttemptTime" -> o.latestNotificationAttemptTime.asJson, "LatestDigestDeliveryError" -> o.latestDigestDeliveryError.asJson, "LatestCloudWatchLogsDeliveryTime" -> o.latestCloudWatchLogsDeliveryTime.asJson, "LatestDigestDeliveryTime" -> o.latestDigestDeliveryTime.asJson, "LatestNotificationTime" -> o.latestNotificationTime.asJson, "LatestDeliveryTime" -> o.latestDeliveryTime.asJson, "StopLoggingTime" -> o.stopLoggingTime.asJson, "StartLoggingTime" -> o.startLoggingTime.asJson)
  }
  final implicit val ListPublicKeysRequestEncoder: io.circe.Encoder[models.ListPublicKeysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTrailsRequestEncoder: io.circe.Encoder[models.DescribeTrailsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("trailNameList" -> o.trailNameList.asJson, "includeShadowTrails" -> o.includeShadowTrails.asJson)
  }
  final implicit val LookupEventsResponseEncoder: io.circe.Encoder[models.LookupEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Events" -> o.events.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsResponseEncoder: io.circe.Encoder[models.AddTagsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PublicKeyEncoder: io.circe.Encoder[models.PublicKey] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "ValidityStartTime" -> o.validityStartTime.asJson, "ValidityEndTime" -> o.validityEndTime.asJson, "Fingerprint" -> o.fingerprint.asJson)
  }
  final implicit val InvalidKmsKeyIdExceptionEncoder: io.circe.Encoder[models.InvalidKmsKeyIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetTrailStatusRequestEncoder: io.circe.Encoder[models.GetTrailStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val InvalidEventSelectorsExceptionEncoder: io.circe.Encoder[models.InvalidEventSelectorsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DataResourceEncoder: io.circe.Encoder[models.DataResource] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Values" -> o.values.asJson)
  }
  final implicit val StartLoggingResponseEncoder: io.circe.Encoder[models.StartLoggingResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidS3BucketNameExceptionEncoder: io.circe.Encoder[models.InvalidS3BucketNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagsLimitExceededExceptionEncoder: io.circe.Encoder[models.TagsLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListPublicKeysResponseEncoder: io.circe.Encoder[models.ListPublicKeysResponse] = io.circe.Encoder.instance { o => 
    Json.obj("PublicKeyList" -> o.publicKeyList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EventSelectorEncoder: io.circe.Encoder[models.EventSelector] = io.circe.Encoder.instance { o => 
    Json.obj("ReadWriteType" -> o.readWriteType.asJson, "IncludeManagementEvents" -> o.includeManagementEvents.asJson, "DataResources" -> o.dataResources.asJson)
  }
  final implicit val GetEventSelectorsResponseEncoder: io.circe.Encoder[models.GetEventSelectorsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TrailARN" -> o.trailARN.asJson, "EventSelectors" -> o.eventSelectors.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetEventSelectorsRequestEncoder: io.circe.Encoder[models.GetEventSelectorsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrailName" -> o.trailName.asJson)
  }
  final implicit val MaximumNumberOfTrailsExceededExceptionEncoder: io.circe.Encoder[models.MaximumNumberOfTrailsExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceEncoder: io.circe.Encoder[models.Resource] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceName" -> o.resourceName.asJson)
  }
  final implicit val InvalidTrailNameExceptionDecoder: io.circe.Decoder[models.InvalidTrailNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTrailNameException)
  final implicit val LookupAttributeDecoder: io.circe.Decoder[models.LookupAttribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeKey"), o.get[java.lang.String]("AttributeValue")).mapN(models.LookupAttribute.apply _)
  }
  final implicit val DescribeTrailsResponseDecoder: io.circe.Decoder[models.DescribeTrailsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.Trail]]]("trailList").map(models.DescribeTrailsResponse.apply _)
  }
  final implicit val OperationNotPermittedExceptionDecoder: io.circe.Decoder[models.OperationNotPermittedException.type] = io.circe.Decoder.decodeUnit.as(models.OperationNotPermittedException)
  final implicit val StartLoggingRequestDecoder: io.circe.Decoder[models.StartLoggingRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(models.StartLoggingRequest.apply _)
  }
  final implicit val CreateTrailRequestDecoder: io.circe.Decoder[models.CreateTrailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("EnableLogFileValidation")).mapN(models.CreateTrailRequest.apply _)
  }
  final implicit val InvalidTimeRangeExceptionDecoder: io.circe.Decoder[models.InvalidTimeRangeException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTimeRangeException)
  final implicit val TrailDecoder: io.circe.Decoder[models.Trail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("HomeRegion"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SnsTopicARN"), o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("LogFileValidationEnabled"), o.get[scala.Option[scala.Boolean]]("HasCustomEventSelectors")).mapN(models.Trail.apply _)
  }
  final implicit val ResourceTypeNotSupportedExceptionDecoder: io.circe.Decoder[models.ResourceTypeNotSupportedException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceTypeNotSupportedException)
  final implicit val PutEventSelectorsResponseDecoder: io.circe.Decoder[models.PutEventSelectorsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.List[models.EventSelector]]]("EventSelectors")).mapN(models.PutEventSelectorsResponse.apply _)
  }
  final implicit val TrailNotProvidedExceptionDecoder: io.circe.Decoder[models.TrailNotProvidedException.type] = io.circe.Decoder.decodeUnit.as(models.TrailNotProvidedException)
  final implicit val TrailAlreadyExistsExceptionDecoder: io.circe.Decoder[models.TrailAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(models.TrailAlreadyExistsException)
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidNextTokenException)
  final implicit val InsufficientEncryptionPolicyExceptionDecoder: io.circe.Decoder[models.InsufficientEncryptionPolicyException.type] = io.circe.Decoder.decodeUnit.as(models.InsufficientEncryptionPolicyException)
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[models.UnsupportedOperationException.type] = io.circe.Decoder.decodeUnit.as(models.UnsupportedOperationException)
  final implicit val DeleteTrailRequestDecoder: io.circe.Decoder[models.DeleteTrailRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(models.DeleteTrailRequest.apply _)
  }
  final implicit val CreateTrailResponseDecoder: io.circe.Decoder[models.CreateTrailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SnsTopicARN"), o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("LogFileValidationEnabled")).mapN(models.CreateTrailResponse.apply _)
  }
  final implicit val PutEventSelectorsRequestDecoder: io.circe.Decoder[models.PutEventSelectorsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrailName"), o.get[scala.List[models.EventSelector]]("EventSelectors")).mapN(models.PutEventSelectorsRequest.apply _)
  }
  final implicit val S3BucketDoesNotExistExceptionDecoder: io.circe.Decoder[models.S3BucketDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.S3BucketDoesNotExistException)
  final implicit val CloudWatchLogsDeliveryUnavailableExceptionDecoder: io.circe.Decoder[models.CloudWatchLogsDeliveryUnavailableException.type] = io.circe.Decoder.decodeUnit.as(models.CloudWatchLogsDeliveryUnavailableException)
  final implicit val InvalidTagParameterExceptionDecoder: io.circe.Decoder[models.InvalidTagParameterException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTagParameterException)
  final implicit val InvalidS3PrefixExceptionDecoder: io.circe.Decoder[models.InvalidS3PrefixException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidS3PrefixException)
  final implicit val InvalidHomeRegionExceptionDecoder: io.circe.Decoder[models.InvalidHomeRegionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidHomeRegionException)
  final implicit val TrailNotFoundExceptionDecoder: io.circe.Decoder[models.TrailNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.TrailNotFoundException)
  final implicit val UpdateTrailResponseDecoder: io.circe.Decoder[models.UpdateTrailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SnsTopicARN"), o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("LogFileValidationEnabled")).mapN(models.UpdateTrailResponse.apply _)
  }
  final implicit val AddTagsRequestDecoder: io.circe.Decoder[models.AddTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[scala.List[models.Tag]]]("TagsList")).mapN(models.AddTagsRequest.apply _)
  }
  final implicit val StopLoggingResponseDecoder: io.circe.Decoder[models.StopLoggingResponse.type] = io.circe.Decoder.decodeUnit.as(models.StopLoggingResponse)
  final implicit val InvalidParameterCombinationExceptionDecoder: io.circe.Decoder[models.InvalidParameterCombinationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidParameterCombinationException)
  final implicit val StopLoggingRequestDecoder: io.circe.Decoder[models.StopLoggingRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(models.StopLoggingRequest.apply _)
  }
  final implicit val KmsExceptionDecoder: io.circe.Decoder[models.KmsException.type] = io.circe.Decoder.decodeUnit.as(models.KmsException)
  final implicit val UpdateTrailRequestDecoder: io.circe.Decoder[models.UpdateTrailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("EnableLogFileValidation")).mapN(models.UpdateTrailRequest.apply _)
  }
  final implicit val InsufficientS3BucketPolicyExceptionDecoder: io.circe.Decoder[models.InsufficientS3BucketPolicyException.type] = io.circe.Decoder.decodeUnit.as(models.InsufficientS3BucketPolicyException)
  final implicit val InvalidCloudWatchLogsLogGroupArnExceptionDecoder: io.circe.Decoder[models.InvalidCloudWatchLogsLogGroupArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidCloudWatchLogsLogGroupArnException)
  final implicit val DeleteTrailResponseDecoder: io.circe.Decoder[models.DeleteTrailResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteTrailResponse)
  final implicit val ResourceTagDecoder: io.circe.Decoder[models.ResourceTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[scala.List[models.Tag]]]("TagsList")).mapN(models.ResourceTag.apply _)
  }
  final implicit val KmsKeyNotFoundExceptionDecoder: io.circe.Decoder[models.KmsKeyNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.KmsKeyNotFoundException)
  final implicit val ListTagsRequestDecoder: io.circe.Decoder[models.ListTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ResourceIdList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsRequest.apply _)
  }
  final implicit val LookupEventsRequestDecoder: io.circe.Decoder[models.LookupEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.LookupAttribute]]]("LookupAttributes"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.LookupEventsRequest.apply _)
  }
  final implicit val InvalidLookupAttributesExceptionDecoder: io.circe.Decoder[models.InvalidLookupAttributesException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidLookupAttributesException)
  final implicit val RemoveTagsRequestDecoder: io.circe.Decoder[models.RemoveTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[scala.List[models.Tag]]]("TagsList")).mapN(models.RemoveTagsRequest.apply _)
  }
  final implicit val InvalidMaxResultsExceptionDecoder: io.circe.Decoder[models.InvalidMaxResultsException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidMaxResultsException)
  final implicit val InvalidTokenExceptionDecoder: io.circe.Decoder[models.InvalidTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTokenException)
  final implicit val ListTagsResponseDecoder: io.circe.Decoder[models.ListTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ResourceTag]]]("ResourceTagList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsResponse.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CloudTrailEvent"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("EventSource"), o.get[scala.Option[java.lang.String]]("EventName"), o.get[scala.Option[java.lang.String]]("EventId"), o.get[scala.Option[java.time.Instant]]("EventTime"), o.get[scala.Option[scala.List[models.Resource]]]("Resources")).mapN(models.Event.apply _)
  }
  final implicit val InvalidSnsTopicNameExceptionDecoder: io.circe.Decoder[models.InvalidSnsTopicNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSnsTopicNameException)
  final implicit val CloudTrailARNInvalidExceptionDecoder: io.circe.Decoder[models.CloudTrailARNInvalidException.type] = io.circe.Decoder.decodeUnit.as(models.CloudTrailARNInvalidException)
  final implicit val InsufficientSnsTopicPolicyExceptionDecoder: io.circe.Decoder[models.InsufficientSnsTopicPolicyException.type] = io.circe.Decoder.decodeUnit.as(models.InsufficientSnsTopicPolicyException)
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val KmsKeyDisabledExceptionDecoder: io.circe.Decoder[models.KmsKeyDisabledException.type] = io.circe.Decoder.decodeUnit.as(models.KmsKeyDisabledException)
  final implicit val RemoveTagsResponseDecoder: io.circe.Decoder[models.RemoveTagsResponse.type] = io.circe.Decoder.decodeUnit.as(models.RemoveTagsResponse)
  final implicit val InvalidCloudWatchLogsRoleArnExceptionDecoder: io.circe.Decoder[models.InvalidCloudWatchLogsRoleArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidCloudWatchLogsRoleArnException)
  final implicit val GetTrailStatusResponseDecoder: io.circe.Decoder[models.GetTrailStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("IsLogging"), o.get[scala.Option[java.lang.String]]("TimeLoggingStarted"), o.get[scala.Option[java.lang.String]]("LatestDeliveryAttemptSucceeded"), o.get[scala.Option[java.lang.String]]("LatestDeliveryAttemptTime"), o.get[scala.Option[java.lang.String]]("LatestNotificationError"), o.get[scala.Option[java.lang.String]]("LatestNotificationAttemptSucceeded"), o.get[scala.Option[java.lang.String]]("LatestDeliveryError"), o.get[scala.Option[java.lang.String]]("TimeLoggingStopped"), o.get[scala.Option[java.lang.String]]("LatestCloudWatchLogsDeliveryError"), o.get[scala.Option[java.lang.String]]("LatestNotificationAttemptTime"), o.get[scala.Option[java.lang.String]]("LatestDigestDeliveryError"), o.get[scala.Option[java.time.Instant]]("LatestCloudWatchLogsDeliveryTime"), o.get[scala.Option[java.time.Instant]]("LatestDigestDeliveryTime"), o.get[scala.Option[java.time.Instant]]("LatestNotificationTime"), o.get[scala.Option[java.time.Instant]]("LatestDeliveryTime"), o.get[scala.Option[java.time.Instant]]("StopLoggingTime"), o.get[scala.Option[java.time.Instant]]("StartLoggingTime")).mapN(models.GetTrailStatusResponse.apply _)
  }
  final implicit val ListPublicKeysRequestDecoder: io.circe.Decoder[models.ListPublicKeysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListPublicKeysRequest.apply _)
  }
  final implicit val DescribeTrailsRequestDecoder: io.circe.Decoder[models.DescribeTrailsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("trailNameList"), o.get[scala.Option[scala.Boolean]]("includeShadowTrails")).mapN(models.DescribeTrailsRequest.apply _)
  }
  final implicit val LookupEventsResponseDecoder: io.circe.Decoder[models.LookupEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Event]]]("Events"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.LookupEventsResponse.apply _)
  }
  final implicit val AddTagsResponseDecoder: io.circe.Decoder[models.AddTagsResponse.type] = io.circe.Decoder.decodeUnit.as(models.AddTagsResponse)
  final implicit val PublicKeyDecoder: io.circe.Decoder[models.PublicKey] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("Value"), o.get[scala.Option[java.time.Instant]]("ValidityStartTime"), o.get[scala.Option[java.time.Instant]]("ValidityEndTime"), o.get[scala.Option[java.lang.String]]("Fingerprint")).mapN(models.PublicKey.apply _)
  }
  final implicit val InvalidKmsKeyIdExceptionDecoder: io.circe.Decoder[models.InvalidKmsKeyIdException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidKmsKeyIdException)
  final implicit val GetTrailStatusRequestDecoder: io.circe.Decoder[models.GetTrailStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(models.GetTrailStatusRequest.apply _)
  }
  final implicit val InvalidEventSelectorsExceptionDecoder: io.circe.Decoder[models.InvalidEventSelectorsException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidEventSelectorsException)
  final implicit val DataResourceDecoder: io.circe.Decoder[models.DataResource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(models.DataResource.apply _)
  }
  final implicit val StartLoggingResponseDecoder: io.circe.Decoder[models.StartLoggingResponse.type] = io.circe.Decoder.decodeUnit.as(models.StartLoggingResponse)
  final implicit val InvalidS3BucketNameExceptionDecoder: io.circe.Decoder[models.InvalidS3BucketNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidS3BucketNameException)
  final implicit val TagsLimitExceededExceptionDecoder: io.circe.Decoder[models.TagsLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.TagsLimitExceededException)
  final implicit val ListPublicKeysResponseDecoder: io.circe.Decoder[models.ListPublicKeysResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PublicKey]]]("PublicKeyList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListPublicKeysResponse.apply _)
  }
  final implicit val EventSelectorDecoder: io.circe.Decoder[models.EventSelector] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReadWriteType"), o.get[scala.Option[scala.Boolean]]("IncludeManagementEvents"), o.get[scala.Option[scala.List[models.DataResource]]]("DataResources")).mapN(models.EventSelector.apply _)
  }
  final implicit val GetEventSelectorsResponseDecoder: io.circe.Decoder[models.GetEventSelectorsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.List[models.EventSelector]]]("EventSelectors")).mapN(models.GetEventSelectorsResponse.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.ResourceNotFoundException)
  final implicit val GetEventSelectorsRequestDecoder: io.circe.Decoder[models.GetEventSelectorsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TrailName").map(models.GetEventSelectorsRequest.apply _)
  }
  final implicit val MaximumNumberOfTrailsExceededExceptionDecoder: io.circe.Decoder[models.MaximumNumberOfTrailsExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaximumNumberOfTrailsExceededException)
  final implicit val ResourceDecoder: io.circe.Decoder[models.Resource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[java.lang.String]]("ResourceName")).mapN(models.Resource.apply _)
  }
}