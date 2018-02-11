package org.lyranthe.araethura.cloudtrail.models
import org.lyranthe.araethura.cloudtrail.models
case object InvalidTrailNameException
final case class LookupAttribute(attributeKey: java.lang.String, attributeValue: java.lang.String)
final case class DescribeTrailsResponse(trailList: scala.Option[scala.List[models.Trail]] = None)
case object OperationNotPermittedException
final case class StartLoggingRequest(name: java.lang.String)
final case class CreateTrailRequest(name: java.lang.String, s3BucketName: java.lang.String, s3KeyPrefix: scala.Option[java.lang.String] = None, snsTopicName: scala.Option[java.lang.String] = None, kmsKeyId: scala.Option[java.lang.String] = None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = None, isMultiRegionTrail: scala.Option[scala.Boolean] = None, enableLogFileValidation: scala.Option[scala.Boolean] = None)
case object InvalidTimeRangeException
final case class Trail(s3BucketName: scala.Option[java.lang.String] = None, s3KeyPrefix: scala.Option[java.lang.String] = None, snsTopicName: scala.Option[java.lang.String] = None, homeRegion: scala.Option[java.lang.String] = None, kmsKeyId: scala.Option[java.lang.String] = None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, snsTopicARN: scala.Option[java.lang.String] = None, trailARN: scala.Option[java.lang.String] = None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = None, isMultiRegionTrail: scala.Option[scala.Boolean] = None, logFileValidationEnabled: scala.Option[scala.Boolean] = None, hasCustomEventSelectors: scala.Option[scala.Boolean] = None)
case object ResourceTypeNotSupportedException
final case class PutEventSelectorsResponse(trailARN: scala.Option[java.lang.String] = None, eventSelectors: scala.Option[scala.List[models.EventSelector]] = None)
case object TrailNotProvidedException
case object TrailAlreadyExistsException
case object InvalidNextTokenException
case object InsufficientEncryptionPolicyException
case object UnsupportedOperationException
final case class DeleteTrailRequest(name: java.lang.String)
final case class CreateTrailResponse(s3BucketName: scala.Option[java.lang.String] = None, s3KeyPrefix: scala.Option[java.lang.String] = None, snsTopicName: scala.Option[java.lang.String] = None, kmsKeyId: scala.Option[java.lang.String] = None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, snsTopicARN: scala.Option[java.lang.String] = None, trailARN: scala.Option[java.lang.String] = None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = None, isMultiRegionTrail: scala.Option[scala.Boolean] = None, logFileValidationEnabled: scala.Option[scala.Boolean] = None)
final case class PutEventSelectorsRequest(trailName: java.lang.String, eventSelectors: scala.List[models.EventSelector])
case object S3BucketDoesNotExistException
case object CloudWatchLogsDeliveryUnavailableException
case object InvalidTagParameterException
case object InvalidS3PrefixException
case object InvalidHomeRegionException
case object TrailNotFoundException
final case class UpdateTrailResponse(s3BucketName: scala.Option[java.lang.String] = None, s3KeyPrefix: scala.Option[java.lang.String] = None, snsTopicName: scala.Option[java.lang.String] = None, kmsKeyId: scala.Option[java.lang.String] = None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, snsTopicARN: scala.Option[java.lang.String] = None, trailARN: scala.Option[java.lang.String] = None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = None, isMultiRegionTrail: scala.Option[scala.Boolean] = None, logFileValidationEnabled: scala.Option[scala.Boolean] = None)
final case class AddTagsRequest(resourceId: java.lang.String, tagsList: scala.Option[scala.List[models.Tag]] = None)
case object StopLoggingResponse
case object InvalidParameterCombinationException
final case class StopLoggingRequest(name: java.lang.String)
case object KmsException
final case class UpdateTrailRequest(name: java.lang.String, s3BucketName: scala.Option[java.lang.String] = None, s3KeyPrefix: scala.Option[java.lang.String] = None, snsTopicName: scala.Option[java.lang.String] = None, kmsKeyId: scala.Option[java.lang.String] = None, cloudWatchLogsLogGroupArn: scala.Option[java.lang.String] = None, cloudWatchLogsRoleArn: scala.Option[java.lang.String] = None, includeGlobalServiceEvents: scala.Option[scala.Boolean] = None, isMultiRegionTrail: scala.Option[scala.Boolean] = None, enableLogFileValidation: scala.Option[scala.Boolean] = None)
case object InsufficientS3BucketPolicyException
case object InvalidCloudWatchLogsLogGroupArnException
case object DeleteTrailResponse
final case class ResourceTag(resourceId: scala.Option[java.lang.String] = None, tagsList: scala.Option[scala.List[models.Tag]] = None)
case object KmsKeyNotFoundException
final case class ListTagsRequest(resourceIdList: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = None)
final case class LookupEventsRequest(lookupAttributes: scala.Option[scala.List[models.LookupAttribute]] = None, startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
case object InvalidLookupAttributesException
final case class RemoveTagsRequest(resourceId: java.lang.String, tagsList: scala.Option[scala.List[models.Tag]] = None)
case object InvalidMaxResultsException
case object InvalidTokenException
final case class ListTagsResponse(resourceTagList: scala.Option[scala.List[models.ResourceTag]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Event(cloudTrailEvent: scala.Option[java.lang.String] = None, username: scala.Option[java.lang.String] = None, eventSource: scala.Option[java.lang.String] = None, eventName: scala.Option[java.lang.String] = None, eventId: scala.Option[java.lang.String] = None, eventTime: scala.Option[java.time.Instant] = None, resources: scala.Option[scala.List[models.Resource]] = None)
case object InvalidSnsTopicNameException
case object CloudTrailARNInvalidException
case object InsufficientSnsTopicPolicyException
final case class Tag(key: java.lang.String, value: scala.Option[java.lang.String] = None)
case object KmsKeyDisabledException
case object RemoveTagsResponse
case object InvalidCloudWatchLogsRoleArnException
final case class GetTrailStatusResponse(isLogging: scala.Option[scala.Boolean] = None, timeLoggingStarted: scala.Option[java.lang.String] = None, latestDeliveryAttemptSucceeded: scala.Option[java.lang.String] = None, latestDeliveryAttemptTime: scala.Option[java.lang.String] = None, latestNotificationError: scala.Option[java.lang.String] = None, latestNotificationAttemptSucceeded: scala.Option[java.lang.String] = None, latestDeliveryError: scala.Option[java.lang.String] = None, timeLoggingStopped: scala.Option[java.lang.String] = None, latestCloudWatchLogsDeliveryError: scala.Option[java.lang.String] = None, latestNotificationAttemptTime: scala.Option[java.lang.String] = None, latestDigestDeliveryError: scala.Option[java.lang.String] = None, latestCloudWatchLogsDeliveryTime: scala.Option[java.time.Instant] = None, latestDigestDeliveryTime: scala.Option[java.time.Instant] = None, latestNotificationTime: scala.Option[java.time.Instant] = None, latestDeliveryTime: scala.Option[java.time.Instant] = None, stopLoggingTime: scala.Option[java.time.Instant] = None, startLoggingTime: scala.Option[java.time.Instant] = None)
final case class ListPublicKeysRequest(startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeTrailsRequest(trailNameList: scala.Option[scala.List[java.lang.String]] = None, includeShadowTrails: scala.Option[scala.Boolean] = None)
final case class LookupEventsResponse(events: scala.Option[scala.List[models.Event]] = None, nextToken: scala.Option[java.lang.String] = None)
case object AddTagsResponse
final case class PublicKey(value: scala.Option[scala.Array[scala.Byte]] = None, validityStartTime: scala.Option[java.time.Instant] = None, validityEndTime: scala.Option[java.time.Instant] = None, fingerprint: scala.Option[java.lang.String] = None)
case object InvalidKmsKeyIdException
final case class GetTrailStatusRequest(name: java.lang.String)
case object InvalidEventSelectorsException
final case class DataResource(`type`: scala.Option[java.lang.String] = None, values: scala.Option[scala.List[java.lang.String]] = None)
case object StartLoggingResponse
case object InvalidS3BucketNameException
case object TagsLimitExceededException
final case class ListPublicKeysResponse(publicKeyList: scala.Option[scala.List[models.PublicKey]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class EventSelector(readWriteType: scala.Option[java.lang.String] = None, includeManagementEvents: scala.Option[scala.Boolean] = None, dataResources: scala.Option[scala.List[models.DataResource]] = None)
final case class GetEventSelectorsResponse(trailARN: scala.Option[java.lang.String] = None, eventSelectors: scala.Option[scala.List[models.EventSelector]] = None)
case object ResourceNotFoundException
final case class GetEventSelectorsRequest(trailName: java.lang.String)
case object MaximumNumberOfTrailsExceededException
final case class Resource(resourceType: scala.Option[java.lang.String] = None, resourceName: scala.Option[java.lang.String] = None)