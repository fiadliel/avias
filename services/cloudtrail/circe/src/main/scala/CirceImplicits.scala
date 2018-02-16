package org.lyranthe.araethura.cloudtrail
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val InvalidTrailNameExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidTrailNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LookupAttributeEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.LookupAttribute] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeKey" -> o.attributeKey.asJson, "AttributeValue" -> o.attributeValue.asJson)
  }
  final implicit val DescribeTrailsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.DescribeTrailsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("trailList" -> o.trailList.asJson)
  }
  final implicit val OperationNotPermittedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.OperationNotPermittedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StartLoggingRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.StartLoggingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val CreateTrailRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.CreateTrailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "EnableLogFileValidation" -> o.enableLogFileValidation.asJson)
  }
  final implicit val InvalidTimeRangeExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidTimeRangeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TrailEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.Trail] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "HomeRegion" -> o.homeRegion.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "Name" -> o.name.asJson, "SnsTopicARN" -> o.snsTopicARN.asJson, "TrailARN" -> o.trailARN.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "LogFileValidationEnabled" -> o.logFileValidationEnabled.asJson, "HasCustomEventSelectors" -> o.hasCustomEventSelectors.asJson)
  }
  final implicit val ResourceTypeNotSupportedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ResourceTypeNotSupportedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutEventSelectorsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TrailARN" -> o.trailARN.asJson, "EventSelectors" -> o.eventSelectors.asJson)
  }
  final implicit val TrailNotProvidedExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.TrailNotProvidedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TrailAlreadyExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.TrailAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidNextTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InsufficientEncryptionPolicyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InsufficientEncryptionPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.UnsupportedOperationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteTrailRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.DeleteTrailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val CreateTrailResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.CreateTrailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "Name" -> o.name.asJson, "SnsTopicARN" -> o.snsTopicARN.asJson, "TrailARN" -> o.trailARN.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "LogFileValidationEnabled" -> o.logFileValidationEnabled.asJson)
  }
  final implicit val PutEventSelectorsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrailName" -> o.trailName.asJson, "EventSelectors" -> o.eventSelectors.asJson)
  }
  final implicit val S3BucketDoesNotExistExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.S3BucketDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CloudWatchLogsDeliveryUnavailableExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.CloudWatchLogsDeliveryUnavailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTagParameterExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidTagParameterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidS3PrefixExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidS3PrefixException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidHomeRegionExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidHomeRegionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TrailNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.TrailNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateTrailResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.UpdateTrailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "Name" -> o.name.asJson, "SnsTopicARN" -> o.snsTopicARN.asJson, "TrailARN" -> o.trailARN.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "LogFileValidationEnabled" -> o.logFileValidationEnabled.asJson)
  }
  final implicit val AddTagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.AddTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagsList" -> o.tagsList.asJson)
  }
  final implicit val StopLoggingResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.StopLoggingResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidParameterCombinationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidParameterCombinationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val StopLoggingRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.StopLoggingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val KmsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.KmsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateTrailRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.UpdateTrailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "S3BucketName" -> o.s3BucketName.asJson, "S3KeyPrefix" -> o.s3KeyPrefix.asJson, "SnsTopicName" -> o.snsTopicName.asJson, "KmsKeyId" -> o.kmsKeyId.asJson, "CloudWatchLogsLogGroupArn" -> o.cloudWatchLogsLogGroupArn.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "IncludeGlobalServiceEvents" -> o.includeGlobalServiceEvents.asJson, "IsMultiRegionTrail" -> o.isMultiRegionTrail.asJson, "EnableLogFileValidation" -> o.enableLogFileValidation.asJson)
  }
  final implicit val InsufficientS3BucketPolicyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InsufficientS3BucketPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidCloudWatchLogsLogGroupArnExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidCloudWatchLogsLogGroupArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteTrailResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.DeleteTrailResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceTagEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ResourceTag] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagsList" -> o.tagsList.asJson)
  }
  final implicit val KmsKeyNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.KmsKeyNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListTagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ListTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceIdList" -> o.resourceIdList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val LookupEventsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.LookupEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LookupAttributes" -> o.lookupAttributes.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidLookupAttributesExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidLookupAttributesException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.RemoveTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceId" -> o.resourceId.asJson, "TagsList" -> o.tagsList.asJson)
  }
  final implicit val InvalidMaxResultsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidMaxResultsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListTagsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ListTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceTagList" -> o.resourceTagList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EventEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.Event] = io.circe.Encoder.instance { o => 
    Json.obj("CloudTrailEvent" -> o.cloudTrailEvent.asJson, "Username" -> o.username.asJson, "EventSource" -> o.eventSource.asJson, "EventName" -> o.eventName.asJson, "EventId" -> o.eventId.asJson, "EventTime" -> o.eventTime.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val InvalidSnsTopicNameExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidSnsTopicNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CloudTrailARNInvalidExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.CloudTrailARNInvalidException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InsufficientSnsTopicPolicyExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InsufficientSnsTopicPolicyException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val KmsKeyDisabledExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.KmsKeyDisabledException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RemoveTagsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.RemoveTagsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidCloudWatchLogsRoleArnExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidCloudWatchLogsRoleArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetTrailStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.GetTrailStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IsLogging" -> o.isLogging.asJson, "TimeLoggingStarted" -> o.timeLoggingStarted.asJson, "LatestDeliveryAttemptSucceeded" -> o.latestDeliveryAttemptSucceeded.asJson, "LatestDeliveryAttemptTime" -> o.latestDeliveryAttemptTime.asJson, "LatestNotificationError" -> o.latestNotificationError.asJson, "LatestNotificationAttemptSucceeded" -> o.latestNotificationAttemptSucceeded.asJson, "LatestDeliveryError" -> o.latestDeliveryError.asJson, "TimeLoggingStopped" -> o.timeLoggingStopped.asJson, "LatestCloudWatchLogsDeliveryError" -> o.latestCloudWatchLogsDeliveryError.asJson, "LatestNotificationAttemptTime" -> o.latestNotificationAttemptTime.asJson, "LatestDigestDeliveryError" -> o.latestDigestDeliveryError.asJson, "LatestCloudWatchLogsDeliveryTime" -> o.latestCloudWatchLogsDeliveryTime.asJson, "LatestDigestDeliveryTime" -> o.latestDigestDeliveryTime.asJson, "LatestNotificationTime" -> o.latestNotificationTime.asJson, "LatestDeliveryTime" -> o.latestDeliveryTime.asJson, "StopLoggingTime" -> o.stopLoggingTime.asJson, "StartLoggingTime" -> o.startLoggingTime.asJson)
  }
  final implicit val ListPublicKeysRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ListPublicKeysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTrailsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.DescribeTrailsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("trailNameList" -> o.trailNameList.asJson, "includeShadowTrails" -> o.includeShadowTrails.asJson)
  }
  final implicit val LookupEventsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.LookupEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Events" -> o.events.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.AddTagsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PublicKeyEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.PublicKey] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "ValidityStartTime" -> o.validityStartTime.asJson, "ValidityEndTime" -> o.validityEndTime.asJson, "Fingerprint" -> o.fingerprint.asJson)
  }
  final implicit val InvalidKmsKeyIdExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidKmsKeyIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetTrailStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.GetTrailStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson)
  }
  final implicit val InvalidEventSelectorsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidEventSelectorsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DataResourceEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.DataResource] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Values" -> o.values.asJson)
  }
  final implicit val StartLoggingResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.StartLoggingResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidS3BucketNameExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.InvalidS3BucketNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TagsLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.TagsLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListPublicKeysResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ListPublicKeysResponse] = io.circe.Encoder.instance { o => 
    Json.obj("PublicKeyList" -> o.publicKeyList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EventSelectorEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.EventSelector] = io.circe.Encoder.instance { o => 
    Json.obj("ReadWriteType" -> o.readWriteType.asJson, "IncludeManagementEvents" -> o.includeManagementEvents.asJson, "DataResources" -> o.dataResources.asJson)
  }
  final implicit val GetEventSelectorsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TrailARN" -> o.trailARN.asJson, "EventSelectors" -> o.eventSelectors.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetEventSelectorsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TrailName" -> o.trailName.asJson)
  }
  final implicit val MaximumNumberOfTrailsExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.MaximumNumberOfTrailsExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourceEncoder: io.circe.Encoder[org.lyranthe.araethura.cloudtrail.models.Resource] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceType" -> o.resourceType.asJson, "ResourceName" -> o.resourceName.asJson)
  }
  final implicit val InvalidTrailNameExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidTrailNameException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidTrailNameException)
  final implicit val LookupAttributeDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.LookupAttribute] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeKey"), o.get[java.lang.String]("AttributeValue")).mapN(org.lyranthe.araethura.cloudtrail.models.LookupAttribute.apply _)
  }
  final implicit val DescribeTrailsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.DescribeTrailsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Trail]]]("trailList").map(org.lyranthe.araethura.cloudtrail.models.DescribeTrailsResponse.apply _)
  }
  final implicit val OperationNotPermittedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.OperationNotPermittedException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.OperationNotPermittedException)
  final implicit val StartLoggingRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.StartLoggingRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.cloudtrail.models.StartLoggingRequest.apply _)
  }
  final implicit val CreateTrailRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.CreateTrailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("EnableLogFileValidation")).mapN(org.lyranthe.araethura.cloudtrail.models.CreateTrailRequest.apply _)
  }
  final implicit val InvalidTimeRangeExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidTimeRangeException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidTimeRangeException)
  final implicit val TrailDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.Trail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("HomeRegion"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SnsTopicARN"), o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("LogFileValidationEnabled"), o.get[scala.Option[scala.Boolean]]("HasCustomEventSelectors")).mapN(org.lyranthe.araethura.cloudtrail.models.Trail.apply _)
  }
  final implicit val ResourceTypeNotSupportedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ResourceTypeNotSupportedException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.ResourceTypeNotSupportedException)
  final implicit val PutEventSelectorsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.EventSelector]]]("EventSelectors")).mapN(org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsResponse.apply _)
  }
  final implicit val TrailNotProvidedExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.TrailNotProvidedException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.TrailNotProvidedException)
  final implicit val TrailAlreadyExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.TrailAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.TrailAlreadyExistsException)
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidNextTokenException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidNextTokenException)
  final implicit val InsufficientEncryptionPolicyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InsufficientEncryptionPolicyException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InsufficientEncryptionPolicyException)
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.UnsupportedOperationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.UnsupportedOperationException)
  final implicit val DeleteTrailRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.DeleteTrailRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.cloudtrail.models.DeleteTrailRequest.apply _)
  }
  final implicit val CreateTrailResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.CreateTrailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SnsTopicARN"), o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("LogFileValidationEnabled")).mapN(org.lyranthe.araethura.cloudtrail.models.CreateTrailResponse.apply _)
  }
  final implicit val PutEventSelectorsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TrailName"), o.get[scala.List[org.lyranthe.araethura.cloudtrail.models.EventSelector]]("EventSelectors")).mapN(org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsRequest.apply _)
  }
  final implicit val S3BucketDoesNotExistExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.S3BucketDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.S3BucketDoesNotExistException)
  final implicit val CloudWatchLogsDeliveryUnavailableExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.CloudWatchLogsDeliveryUnavailableException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.CloudWatchLogsDeliveryUnavailableException)
  final implicit val InvalidTagParameterExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidTagParameterException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidTagParameterException)
  final implicit val InvalidS3PrefixExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidS3PrefixException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidS3PrefixException)
  final implicit val InvalidHomeRegionExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidHomeRegionException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidHomeRegionException)
  final implicit val TrailNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.TrailNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.TrailNotFoundException)
  final implicit val UpdateTrailResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.UpdateTrailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("SnsTopicARN"), o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("LogFileValidationEnabled")).mapN(org.lyranthe.araethura.cloudtrail.models.UpdateTrailResponse.apply _)
  }
  final implicit val AddTagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.AddTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Tag]]]("TagsList")).mapN(org.lyranthe.araethura.cloudtrail.models.AddTagsRequest.apply _)
  }
  final implicit val StopLoggingResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.StopLoggingResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.StopLoggingResponse)
  final implicit val InvalidParameterCombinationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidParameterCombinationException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidParameterCombinationException)
  final implicit val StopLoggingRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.StopLoggingRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.cloudtrail.models.StopLoggingRequest.apply _)
  }
  final implicit val KmsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.KmsException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.KmsException)
  final implicit val UpdateTrailRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.UpdateTrailRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("S3BucketName"), o.get[scala.Option[java.lang.String]]("S3KeyPrefix"), o.get[scala.Option[java.lang.String]]("SnsTopicName"), o.get[scala.Option[java.lang.String]]("KmsKeyId"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsLogGroupArn"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[scala.Boolean]]("IncludeGlobalServiceEvents"), o.get[scala.Option[scala.Boolean]]("IsMultiRegionTrail"), o.get[scala.Option[scala.Boolean]]("EnableLogFileValidation")).mapN(org.lyranthe.araethura.cloudtrail.models.UpdateTrailRequest.apply _)
  }
  final implicit val InsufficientS3BucketPolicyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InsufficientS3BucketPolicyException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InsufficientS3BucketPolicyException)
  final implicit val InvalidCloudWatchLogsLogGroupArnExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidCloudWatchLogsLogGroupArnException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidCloudWatchLogsLogGroupArnException)
  final implicit val DeleteTrailResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.DeleteTrailResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.DeleteTrailResponse)
  final implicit val ResourceTagDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ResourceTag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Tag]]]("TagsList")).mapN(org.lyranthe.araethura.cloudtrail.models.ResourceTag.apply _)
  }
  final implicit val KmsKeyNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.KmsKeyNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.KmsKeyNotFoundException)
  final implicit val ListTagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ListTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ResourceIdList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cloudtrail.models.ListTagsRequest.apply _)
  }
  final implicit val LookupEventsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.LookupEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.LookupAttribute]]]("LookupAttributes"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cloudtrail.models.LookupEventsRequest.apply _)
  }
  final implicit val InvalidLookupAttributesExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidLookupAttributesException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidLookupAttributesException)
  final implicit val RemoveTagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.RemoveTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Tag]]]("TagsList")).mapN(org.lyranthe.araethura.cloudtrail.models.RemoveTagsRequest.apply _)
  }
  final implicit val InvalidMaxResultsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidMaxResultsException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidMaxResultsException)
  final implicit val InvalidTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidTokenException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidTokenException)
  final implicit val ListTagsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ListTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.ResourceTag]]]("ResourceTagList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cloudtrail.models.ListTagsResponse.apply _)
  }
  final implicit val EventDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.Event] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("CloudTrailEvent"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[java.lang.String]]("EventSource"), o.get[scala.Option[java.lang.String]]("EventName"), o.get[scala.Option[java.lang.String]]("EventId"), o.get[scala.Option[java.time.Instant]]("EventTime"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Resource]]]("Resources")).mapN(org.lyranthe.araethura.cloudtrail.models.Event.apply _)
  }
  final implicit val InvalidSnsTopicNameExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidSnsTopicNameException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidSnsTopicNameException)
  final implicit val CloudTrailARNInvalidExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.CloudTrailARNInvalidException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.CloudTrailARNInvalidException)
  final implicit val InsufficientSnsTopicPolicyExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InsufficientSnsTopicPolicyException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InsufficientSnsTopicPolicyException)
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(org.lyranthe.araethura.cloudtrail.models.Tag.apply _)
  }
  final implicit val KmsKeyDisabledExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.KmsKeyDisabledException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.KmsKeyDisabledException)
  final implicit val RemoveTagsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.RemoveTagsResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.RemoveTagsResponse)
  final implicit val InvalidCloudWatchLogsRoleArnExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidCloudWatchLogsRoleArnException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidCloudWatchLogsRoleArnException)
  final implicit val GetTrailStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.GetTrailStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("IsLogging"), o.get[scala.Option[java.lang.String]]("TimeLoggingStarted"), o.get[scala.Option[java.lang.String]]("LatestDeliveryAttemptSucceeded"), o.get[scala.Option[java.lang.String]]("LatestDeliveryAttemptTime"), o.get[scala.Option[java.lang.String]]("LatestNotificationError"), o.get[scala.Option[java.lang.String]]("LatestNotificationAttemptSucceeded"), o.get[scala.Option[java.lang.String]]("LatestDeliveryError"), o.get[scala.Option[java.lang.String]]("TimeLoggingStopped"), o.get[scala.Option[java.lang.String]]("LatestCloudWatchLogsDeliveryError"), o.get[scala.Option[java.lang.String]]("LatestNotificationAttemptTime"), o.get[scala.Option[java.lang.String]]("LatestDigestDeliveryError"), o.get[scala.Option[java.time.Instant]]("LatestCloudWatchLogsDeliveryTime"), o.get[scala.Option[java.time.Instant]]("LatestDigestDeliveryTime"), o.get[scala.Option[java.time.Instant]]("LatestNotificationTime"), o.get[scala.Option[java.time.Instant]]("LatestDeliveryTime"), o.get[scala.Option[java.time.Instant]]("StopLoggingTime"), o.get[scala.Option[java.time.Instant]]("StartLoggingTime")).mapN(org.lyranthe.araethura.cloudtrail.models.GetTrailStatusResponse.apply _)
  }
  final implicit val ListPublicKeysRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ListPublicKeysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cloudtrail.models.ListPublicKeysRequest.apply _)
  }
  final implicit val DescribeTrailsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.DescribeTrailsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("trailNameList"), o.get[scala.Option[scala.Boolean]]("includeShadowTrails")).mapN(org.lyranthe.araethura.cloudtrail.models.DescribeTrailsRequest.apply _)
  }
  final implicit val LookupEventsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.LookupEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Event]]]("Events"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cloudtrail.models.LookupEventsResponse.apply _)
  }
  final implicit val AddTagsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.AddTagsResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.AddTagsResponse)
  final implicit val PublicKeyDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.PublicKey] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("Value"), o.get[scala.Option[java.time.Instant]]("ValidityStartTime"), o.get[scala.Option[java.time.Instant]]("ValidityEndTime"), o.get[scala.Option[java.lang.String]]("Fingerprint")).mapN(org.lyranthe.araethura.cloudtrail.models.PublicKey.apply _)
  }
  final implicit val InvalidKmsKeyIdExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidKmsKeyIdException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidKmsKeyIdException)
  final implicit val GetTrailStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.GetTrailStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Name").map(org.lyranthe.araethura.cloudtrail.models.GetTrailStatusRequest.apply _)
  }
  final implicit val InvalidEventSelectorsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidEventSelectorsException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidEventSelectorsException)
  final implicit val DataResourceDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.DataResource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(org.lyranthe.araethura.cloudtrail.models.DataResource.apply _)
  }
  final implicit val StartLoggingResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.StartLoggingResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.StartLoggingResponse)
  final implicit val InvalidS3BucketNameExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.InvalidS3BucketNameException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.InvalidS3BucketNameException)
  final implicit val TagsLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.TagsLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.TagsLimitExceededException)
  final implicit val ListPublicKeysResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ListPublicKeysResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.PublicKey]]]("PublicKeyList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.cloudtrail.models.ListPublicKeysResponse.apply _)
  }
  final implicit val EventSelectorDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.EventSelector] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ReadWriteType"), o.get[scala.Option[scala.Boolean]]("IncludeManagementEvents"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.DataResource]]]("DataResources")).mapN(org.lyranthe.araethura.cloudtrail.models.EventSelector.apply _)
  }
  final implicit val GetEventSelectorsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TrailARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.EventSelector]]]("EventSelectors")).mapN(org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsResponse.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.ResourceNotFoundException)
  final implicit val GetEventSelectorsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TrailName").map(org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsRequest.apply _)
  }
  final implicit val MaximumNumberOfTrailsExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.MaximumNumberOfTrailsExceededException.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.cloudtrail.models.MaximumNumberOfTrailsExceededException)
  final implicit val ResourceDecoder: io.circe.Decoder[org.lyranthe.araethura.cloudtrail.models.Resource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceType"), o.get[scala.Option[java.lang.String]]("ResourceName")).mapN(org.lyranthe.araethura.cloudtrail.models.Resource.apply _)
  }
}