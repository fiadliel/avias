package org.lyranthe.araethura.cloudtrail.models
case object InvalidTrailNameException
final case class LookupAttribute(attributeKey: java.lang.String, attributeValue: java.lang.String)
final case class DescribeTrailsResponse(trailList: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Trail]] = scala.None)
case object OperationNotPermittedException
final case class StartLoggingRequest(name: java.lang.String)
final case class CreateTrailRequest(name: java.lang.String, s3BucketName: java.lang.String, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, snsTopicName: scala.Option[java.lang.String] = scala.None, kmsKeyId: scala.Option[java.lang.String] = scala.None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = scala.None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = scala.None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = scala.None, isMultiRegionTrail: scala.Option[scala.Boolean] = scala.None, enableLogFileValidation: scala.Option[scala.Boolean] = scala.None)
case object InvalidTimeRangeException
final case class Trail(s3BucketName: scala.Option[java.lang.String] = scala.None, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, snsTopicName: scala.Option[java.lang.String] = scala.None, homeRegion: scala.Option[java.lang.String] = scala.None, kmsKeyId: scala.Option[java.lang.String] = scala.None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = scala.None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, snsTopicARN: scala.Option[java.lang.String] = scala.None, trailARN: scala.Option[java.lang.String] = scala.None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = scala.None, isMultiRegionTrail: scala.Option[scala.Boolean] = scala.None, logFileValidationEnabled: scala.Option[scala.Boolean] = scala.None, hasCustomEventSelectors: scala.Option[scala.Boolean] = scala.None)
case object ResourceTypeNotSupportedException
final case class PutEventSelectorsResponse(trailARN: scala.Option[java.lang.String] = scala.None, eventSelectors: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.EventSelector]] = scala.None)
case object TrailNotProvidedException
case object TrailAlreadyExistsException
case object InvalidNextTokenException
case object InsufficientEncryptionPolicyException
case object UnsupportedOperationException
final case class DeleteTrailRequest(name: java.lang.String)
final case class CreateTrailResponse(s3BucketName: scala.Option[java.lang.String] = scala.None, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, snsTopicName: scala.Option[java.lang.String] = scala.None, kmsKeyId: scala.Option[java.lang.String] = scala.None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = scala.None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, snsTopicARN: scala.Option[java.lang.String] = scala.None, trailARN: scala.Option[java.lang.String] = scala.None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = scala.None, isMultiRegionTrail: scala.Option[scala.Boolean] = scala.None, logFileValidationEnabled: scala.Option[scala.Boolean] = scala.None)
final case class PutEventSelectorsRequest(trailName: java.lang.String, eventSelectors: scala.List[org.lyranthe.araethura.cloudtrail.models.EventSelector])
case object S3BucketDoesNotExistException
case object CloudWatchLogsDeliveryUnavailableException
case object InvalidTagParameterException
case object InvalidS3PrefixException
case object InvalidHomeRegionException
case object TrailNotFoundException
final case class UpdateTrailResponse(s3BucketName: scala.Option[java.lang.String] = scala.None, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, snsTopicName: scala.Option[java.lang.String] = scala.None, kmsKeyId: scala.Option[java.lang.String] = scala.None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = scala.None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, snsTopicARN: scala.Option[java.lang.String] = scala.None, trailARN: scala.Option[java.lang.String] = scala.None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = scala.None, isMultiRegionTrail: scala.Option[scala.Boolean] = scala.None, logFileValidationEnabled: scala.Option[scala.Boolean] = scala.None)
final case class AddTagsRequest(resourceId: java.lang.String, tagsList: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Tag]] = scala.None)
case object StopLoggingResponse
case object InvalidParameterCombinationException
final case class StopLoggingRequest(name: java.lang.String)
case object KmsException
final case class UpdateTrailRequest(name: java.lang.String, s3BucketName: scala.Option[java.lang.String] = scala.None, s3KeyPrefix: scala.Option[java.lang.String] = scala.None, snsTopicName: scala.Option[java.lang.String] = scala.None, kmsKeyId: scala.Option[java.lang.String] = scala.None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = scala.None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = scala.None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = scala.None, isMultiRegionTrail: scala.Option[scala.Boolean] = scala.None, enableLogFileValidation: scala.Option[scala.Boolean] = scala.None)
case object InsufficientS3BucketPolicyException
case object InvalidCloudWatchLogsLogGroupArnException
case object DeleteTrailResponse
final case class ResourceTag(resourceId: scala.Option[java.lang.String] = scala.None, tagsList: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Tag]] = scala.None)
case object KmsKeyNotFoundException
final case class ListTagsRequest(resourceIdList: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class LookupEventsRequest(lookupAttributes: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.LookupAttribute]] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidLookupAttributesException
final case class RemoveTagsRequest(resourceId: java.lang.String, tagsList: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Tag]] = scala.None)
case object InvalidMaxResultsException
case object InvalidTokenException
final case class ListTagsResponse(resourceTagList: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.ResourceTag]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Event(cloudTrailEvent: scala.Option[java.lang.String] = scala.None, username: scala.Option[java.lang.String] = scala.None, eventSource: scala.Option[java.lang.String] = scala.None, eventName: scala.Option[java.lang.String] = scala.None, eventId: scala.Option[java.lang.String] = scala.None, eventTime: scala.Option[java.time.Instant] = scala.None, resources: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Resource]] = scala.None)
case object InvalidSnsTopicNameException
case object CloudTrailARNInvalidException
case object InsufficientSnsTopicPolicyException
final case class Tag(key: java.lang.String, value: scala.Option[java.lang.String] = scala.None)
case object KmsKeyDisabledException
case object RemoveTagsResponse
case object InvalidCloudWatchLogsRoleArnException
final case class GetTrailStatusResponse(isLogging: scala.Option[scala.Boolean] = scala.None, timeLoggingStarted: scala.Option[java.lang.String] = scala.None, latestDeliveryAttemptSucceeded: scala.Option[java.lang.String] = scala.None, latestDeliveryAttemptTime: scala.Option[java.lang.String] = scala.None, latestNotificationError: scala.Option[java.lang.String] = scala.None, latestNotificationAttemptSucceeded: scala.Option[java.lang.String] = scala.None, latestDeliveryError: scala.Option[java.lang.String] = scala.None, timeLoggingStopped: scala.Option[java.lang.String] = scala.None, latestCloudWatchLogsDeliveryError: scala.Option[java.lang.String] = scala.None, latestNotificationAttemptTime: scala.Option[java.lang.String] = scala.None, latestDigestDeliveryError: scala.Option[java.lang.String] = scala.None, latestCloudWatchLogsDeliveryTime: scala.Option[java.time.Instant] = scala.None, latestDigestDeliveryTime: scala.Option[java.time.Instant] = scala.None, latestNotificationTime: scala.Option[java.time.Instant] = scala.None, latestDeliveryTime: scala.Option[java.time.Instant] = scala.None, stopLoggingTime: scala.Option[java.time.Instant] = scala.None, startLoggingTime: scala.Option[java.time.Instant] = scala.None)
final case class ListPublicKeysRequest(startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeTrailsRequest(trailNameList: scala.Option[scala.List[java.lang.String]] = scala.None, includeShadowTrails: scala.Option[scala.Boolean] = scala.None)
final case class LookupEventsResponse(events: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.Event]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object AddTagsResponse
final case class PublicKey(value: scala.Option[scala.Array[scala.Byte]] = scala.None, validityStartTime: scala.Option[java.time.Instant] = scala.None, validityEndTime: scala.Option[java.time.Instant] = scala.None, fingerprint: scala.Option[java.lang.String] = scala.None)
case object InvalidKmsKeyIdException
final case class GetTrailStatusRequest(name: java.lang.String)
case object InvalidEventSelectorsException
final case class DataResource(`type`: scala.Option[java.lang.String] = scala.None, values: scala.Option[scala.List[java.lang.String]] = scala.None)
case object StartLoggingResponse
case object InvalidS3BucketNameException
case object TagsLimitExceededException
final case class ListPublicKeysResponse(publicKeyList: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.PublicKey]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class EventSelector(readWriteType: scala.Option[java.lang.String] = scala.None, includeManagementEvents: scala.Option[scala.Boolean] = scala.None, dataResources: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.DataResource]] = scala.None)
final case class GetEventSelectorsResponse(trailARN: scala.Option[java.lang.String] = scala.None, eventSelectors: scala.Option[scala.List[org.lyranthe.araethura.cloudtrail.models.EventSelector]] = scala.None)
case object ResourceNotFoundException
final case class GetEventSelectorsRequest(trailName: java.lang.String)
case object MaximumNumberOfTrailsExceededException
final case class Resource(resourceType: scala.Option[java.lang.String] = scala.None, resourceName: scala.Option[java.lang.String] = scala.None)