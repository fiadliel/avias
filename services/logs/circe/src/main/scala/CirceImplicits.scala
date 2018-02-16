package avias.logs
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DescribeMetricFiltersResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeMetricFiltersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("metricFilters" -> o.metricFilters.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val TestMetricFilterResponseEncoder: io.circe.Encoder[avias.logs.models.TestMetricFilterResponse] = io.circe.Encoder.instance { o => 
    Json.obj("matches" -> o.matches.asJson)
  }
  final implicit val DataAlreadyAcceptedExceptionEncoder: io.circe.Encoder[avias.logs.models.DataAlreadyAcceptedException] = io.circe.Encoder.instance { o => 
    Json.obj("expectedSequenceToken" -> o.expectedSequenceToken.asJson)
  }
  final implicit val PutLogEventsResponseEncoder: io.circe.Encoder[avias.logs.models.PutLogEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("nextSequenceToken" -> o.nextSequenceToken.asJson, "rejectedLogEventsInfo" -> o.rejectedLogEventsInfo.asJson)
  }
  final implicit val TagLogGroupRequestEncoder: io.circe.Encoder[avias.logs.models.TagLogGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.logs.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeDestinationsResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeDestinationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("destinations" -> o.destinations.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DestinationEncoder: io.circe.Encoder[avias.logs.models.Destination] = io.circe.Encoder.instance { o => 
    Json.obj("targetArn" -> o.targetArn.asJson, "arn" -> o.arn.asJson, "accessPolicy" -> o.accessPolicy.asJson, "creationTime" -> o.creationTime.asJson, "roleArn" -> o.roleArn.asJson, "destinationName" -> o.destinationName.asJson)
  }
  final implicit val CreateExportTaskResponseEncoder: io.circe.Encoder[avias.logs.models.CreateExportTaskResponse] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson)
  }
  final implicit val CancelExportTaskRequestEncoder: io.circe.Encoder[avias.logs.models.CancelExportTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson)
  }
  final implicit val ServiceUnavailableExceptionEncoder: io.circe.Encoder[avias.logs.models.ServiceUnavailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ResourcePolicyEncoder: io.circe.Encoder[avias.logs.models.ResourcePolicy] = io.circe.Encoder.instance { o => 
    Json.obj("policyName" -> o.policyName.asJson, "policyDocument" -> o.policyDocument.asJson, "lastUpdatedTime" -> o.lastUpdatedTime.asJson)
  }
  final implicit val PutSubscriptionFilterRequestEncoder: io.circe.Encoder[avias.logs.models.PutSubscriptionFilterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filterPattern" -> o.filterPattern.asJson, "filterName" -> o.filterName.asJson, "logGroupName" -> o.logGroupName.asJson, "destinationArn" -> o.destinationArn.asJson, "roleArn" -> o.roleArn.asJson, "distribution" -> o.distribution.asJson)
  }
  final implicit val PutDestinationPolicyRequestEncoder: io.circe.Encoder[avias.logs.models.PutDestinationPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("destinationName" -> o.destinationName.asJson, "accessPolicy" -> o.accessPolicy.asJson)
  }
  final implicit val PutDestinationResponseEncoder: io.circe.Encoder[avias.logs.models.PutDestinationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("destination" -> o.destination.asJson)
  }
  final implicit val InvalidOperationExceptionEncoder: io.circe.Encoder[avias.logs.models.InvalidOperationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetLogEventsResponseEncoder: io.circe.Encoder[avias.logs.models.GetLogEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "nextForwardToken" -> o.nextForwardToken.asJson, "nextBackwardToken" -> o.nextBackwardToken.asJson)
  }
  final implicit val DeleteRetentionPolicyRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteRetentionPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val UntagLogGroupRequestEncoder: io.circe.Encoder[avias.logs.models.UntagLogGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val ListTagsLogGroupRequestEncoder: io.circe.Encoder[avias.logs.models.ListTagsLogGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val OutputLogEventEncoder: io.circe.Encoder[avias.logs.models.OutputLogEvent] = io.circe.Encoder.instance { o => 
    Json.obj("timestamp" -> o.timestamp.asJson, "ingestionTime" -> o.ingestionTime.asJson, "message" -> o.message.asJson)
  }
  final implicit val DescribeLogGroupsResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeLogGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("logGroups" -> o.logGroups.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeLogStreamsResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeLogStreamsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("logStreams" -> o.logStreams.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val MetricTransformationEncoder: io.circe.Encoder[avias.logs.models.MetricTransformation] = io.circe.Encoder.instance { o => 
    Json.obj("metricName" -> o.metricName.asJson, "metricNamespace" -> o.metricNamespace.asJson, "metricValue" -> o.metricValue.asJson, "defaultValue" -> o.defaultValue.asJson)
  }
  final implicit val SubscriptionFilterEncoder: io.circe.Encoder[avias.logs.models.SubscriptionFilter] = io.circe.Encoder.instance { o => 
    Json.obj("filterPattern" -> o.filterPattern.asJson, "creationTime" -> o.creationTime.asJson, "filterName" -> o.filterName.asJson, "roleArn" -> o.roleArn.asJson, "logGroupName" -> o.logGroupName.asJson, "destinationArn" -> o.destinationArn.asJson, "distribution" -> o.distribution.asJson)
  }
  final implicit val DescribeSubscriptionFiltersResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeSubscriptionFiltersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("subscriptionFilters" -> o.subscriptionFilters.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListTagsLogGroupResponseEncoder: io.circe.Encoder[avias.logs.models.ListTagsLogGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("tags" -> o.tags.asJson)
  }
  final implicit val DeleteLogStreamRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteLogStreamRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "logStreamName" -> o.logStreamName.asJson)
  }
  final implicit val PutResourcePolicyResponseEncoder: io.circe.Encoder[avias.logs.models.PutResourcePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourcePolicy" -> o.resourcePolicy.asJson)
  }
  final implicit val DescribeSubscriptionFiltersRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeSubscriptionFiltersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "filterNamePrefix" -> o.filterNamePrefix.asJson, "nextToken" -> o.nextToken.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val SearchedLogStreamEncoder: io.circe.Encoder[avias.logs.models.SearchedLogStream] = io.circe.Encoder.instance { o => 
    Json.obj("logStreamName" -> o.logStreamName.asJson, "searchedCompletely" -> o.searchedCompletely.asJson)
  }
  final implicit val InvalidSequenceTokenExceptionEncoder: io.circe.Encoder[avias.logs.models.InvalidSequenceTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("expectedSequenceToken" -> o.expectedSequenceToken.asJson)
  }
  final implicit val ExportTaskStatusEncoder: io.circe.Encoder[avias.logs.models.ExportTaskStatus] = io.circe.Encoder.instance { o => 
    Json.obj("code" -> o.code.asJson, "message" -> o.message.asJson)
  }
  final implicit val DeleteMetricFilterRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteMetricFilterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "filterName" -> o.filterName.asJson)
  }
  final implicit val DeleteLogGroupRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteLogGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val OperationAbortedExceptionEncoder: io.circe.Encoder[avias.logs.models.OperationAbortedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.logs.models.LimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val FilterLogEventsRequestEncoder: io.circe.Encoder[avias.logs.models.FilterLogEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "interleaved" -> o.interleaved.asJson, "filterPattern" -> o.filterPattern.asJson, "limit" -> o.limit.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "nextToken" -> o.nextToken.asJson, "logStreamNames" -> o.logStreamNames.asJson)
  }
  final implicit val DisassociateKmsKeyRequestEncoder: io.circe.Encoder[avias.logs.models.DisassociateKmsKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val DeleteSubscriptionFilterRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteSubscriptionFilterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "filterName" -> o.filterName.asJson)
  }
  final implicit val FilterLogEventsResponseEncoder: io.circe.Encoder[avias.logs.models.FilterLogEventsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("events" -> o.events.asJson, "searchedLogStreams" -> o.searchedLogStreams.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val PutResourcePolicyRequestEncoder: io.circe.Encoder[avias.logs.models.PutResourcePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("policyName" -> o.policyName.asJson, "policyDocument" -> o.policyDocument.asJson)
  }
  final implicit val MetricFilterEncoder: io.circe.Encoder[avias.logs.models.MetricFilter] = io.circe.Encoder.instance { o => 
    Json.obj("filterPattern" -> o.filterPattern.asJson, "metricTransformations" -> o.metricTransformations.asJson, "creationTime" -> o.creationTime.asJson, "filterName" -> o.filterName.asJson, "logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val DescribeDestinationsRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeDestinationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DestinationNamePrefix" -> o.destinationNamePrefix.asJson, "nextToken" -> o.nextToken.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val DescribeResourcePoliciesResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeResourcePoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("resourcePolicies" -> o.resourcePolicies.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RejectedLogEventsInfoEncoder: io.circe.Encoder[avias.logs.models.RejectedLogEventsInfo] = io.circe.Encoder.instance { o => 
    Json.obj("tooNewLogEventStartIndex" -> o.tooNewLogEventStartIndex.asJson, "tooOldLogEventEndIndex" -> o.tooOldLogEventEndIndex.asJson, "expiredLogEventEndIndex" -> o.expiredLogEventEndIndex.asJson)
  }
  final implicit val ExportTaskExecutionInfoEncoder: io.circe.Encoder[avias.logs.models.ExportTaskExecutionInfo] = io.circe.Encoder.instance { o => 
    Json.obj("creationTime" -> o.creationTime.asJson, "completionTime" -> o.completionTime.asJson)
  }
  final implicit val DescribeExportTasksResponseEncoder: io.circe.Encoder[avias.logs.models.DescribeExportTasksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("exportTasks" -> o.exportTasks.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeExportTasksRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeExportTasksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("taskId" -> o.taskId.asJson, "statusCode" -> o.statusCode.asJson, "nextToken" -> o.nextToken.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val PutMetricFilterRequestEncoder: io.circe.Encoder[avias.logs.models.PutMetricFilterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "filterName" -> o.filterName.asJson, "filterPattern" -> o.filterPattern.asJson, "metricTransformations" -> o.metricTransformations.asJson)
  }
  final implicit val LogGroupEncoder: io.circe.Encoder[avias.logs.models.LogGroup] = io.circe.Encoder.instance { o => 
    Json.obj("metricFilterCount" -> o.metricFilterCount.asJson, "arn" -> o.arn.asJson, "storedBytes" -> o.storedBytes.asJson, "creationTime" -> o.creationTime.asJson, "kmsKeyId" -> o.kmsKeyId.asJson, "retentionInDays" -> o.retentionInDays.asJson, "logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val PutLogEventsRequestEncoder: io.circe.Encoder[avias.logs.models.PutLogEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "logStreamName" -> o.logStreamName.asJson, "logEvents" -> o.logEvents.asJson, "sequenceToken" -> o.sequenceToken.asJson)
  }
  final implicit val CreateLogStreamRequestEncoder: io.circe.Encoder[avias.logs.models.CreateLogStreamRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "logStreamName" -> o.logStreamName.asJson)
  }
  final implicit val ExportTaskEncoder: io.circe.Encoder[avias.logs.models.ExportTask] = io.circe.Encoder.instance { o => 
    Json.obj("taskName" -> o.taskName.asJson, "status" -> o.status.asJson, "from" -> o.from.asJson, "to" -> o.to.asJson, "executionInfo" -> o.executionInfo.asJson, "taskId" -> o.taskId.asJson, "destination" -> o.destination.asJson, "logGroupName" -> o.logGroupName.asJson, "destinationPrefix" -> o.destinationPrefix.asJson)
  }
  final implicit val DeleteResourcePolicyRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteResourcePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("policyName" -> o.policyName.asJson)
  }
  final implicit val DescribeLogStreamsRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeLogStreamsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "logStreamNamePrefix" -> o.logStreamNamePrefix.asJson, "limit" -> o.limit.asJson, "nextToken" -> o.nextToken.asJson, "descending" -> o.descending.asJson, "orderBy" -> o.orderBy.asJson)
  }
  final implicit val CreateExportTaskRequestEncoder: io.circe.Encoder[avias.logs.models.CreateExportTaskRequest] = io.circe.Encoder.instance { o => 
    Json.obj("from" -> o.from.asJson, "to" -> o.to.asJson, "destination" -> o.destination.asJson, "logGroupName" -> o.logGroupName.asJson, "taskName" -> o.taskName.asJson, "logStreamNamePrefix" -> o.logStreamNamePrefix.asJson, "destinationPrefix" -> o.destinationPrefix.asJson)
  }
  final implicit val DescribeLogGroupsRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeLogGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupNamePrefix" -> o.logGroupNamePrefix.asJson, "nextToken" -> o.nextToken.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val DescribeResourcePoliciesRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeResourcePoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "limit" -> o.limit.asJson)
  }
  final implicit val PutRetentionPolicyRequestEncoder: io.circe.Encoder[avias.logs.models.PutRetentionPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "retentionInDays" -> o.retentionInDays.asJson)
  }
  final implicit val CreateLogGroupRequestEncoder: io.circe.Encoder[avias.logs.models.CreateLogGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "kmsKeyId" -> o.kmsKeyId.asJson, "tags" -> o.tags.asJson)
  }
  final implicit val DeleteDestinationRequestEncoder: io.circe.Encoder[avias.logs.models.DeleteDestinationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("destinationName" -> o.destinationName.asJson)
  }
  final implicit val FilteredLogEventEncoder: io.circe.Encoder[avias.logs.models.FilteredLogEvent] = io.circe.Encoder.instance { o => 
    Json.obj("logStreamName" -> o.logStreamName.asJson, "timestamp" -> o.timestamp.asJson, "ingestionTime" -> o.ingestionTime.asJson, "message" -> o.message.asJson, "eventId" -> o.eventId.asJson)
  }
  final implicit val MetricFilterMatchRecordEncoder: io.circe.Encoder[avias.logs.models.MetricFilterMatchRecord] = io.circe.Encoder.instance { o => 
    Json.obj("eventNumber" -> o.eventNumber.asJson, "eventMessage" -> o.eventMessage.asJson, "extractedValues" -> o.extractedValues.asJson)
  }
  final implicit val LogStreamEncoder: io.circe.Encoder[avias.logs.models.LogStream] = io.circe.Encoder.instance { o => 
    Json.obj("uploadSequenceToken" -> o.uploadSequenceToken.asJson, "arn" -> o.arn.asJson, "storedBytes" -> o.storedBytes.asJson, "logStreamName" -> o.logStreamName.asJson, "creationTime" -> o.creationTime.asJson, "firstEventTimestamp" -> o.firstEventTimestamp.asJson, "lastEventTimestamp" -> o.lastEventTimestamp.asJson, "lastIngestionTime" -> o.lastIngestionTime.asJson)
  }
  final implicit val DescribeMetricFiltersRequestEncoder: io.circe.Encoder[avias.logs.models.DescribeMetricFiltersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("metricNamespace" -> o.metricNamespace.asJson, "metricName" -> o.metricName.asJson, "limit" -> o.limit.asJson, "nextToken" -> o.nextToken.asJson, "filterNamePrefix" -> o.filterNamePrefix.asJson, "logGroupName" -> o.logGroupName.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.logs.models.ResourceAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetLogEventsRequestEncoder: io.circe.Encoder[avias.logs.models.GetLogEventsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logStreamName" -> o.logStreamName.asJson, "logGroupName" -> o.logGroupName.asJson, "limit" -> o.limit.asJson, "startTime" -> o.startTime.asJson, "endTime" -> o.endTime.asJson, "nextToken" -> o.nextToken.asJson, "startFromHead" -> o.startFromHead.asJson)
  }
  final implicit val TestMetricFilterRequestEncoder: io.circe.Encoder[avias.logs.models.TestMetricFilterRequest] = io.circe.Encoder.instance { o => 
    Json.obj("filterPattern" -> o.filterPattern.asJson, "logEventMessages" -> o.logEventMessages.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.logs.models.InvalidParameterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutDestinationRequestEncoder: io.circe.Encoder[avias.logs.models.PutDestinationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("destinationName" -> o.destinationName.asJson, "targetArn" -> o.targetArn.asJson, "roleArn" -> o.roleArn.asJson)
  }
  final implicit val AssociateKmsKeyRequestEncoder: io.circe.Encoder[avias.logs.models.AssociateKmsKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("logGroupName" -> o.logGroupName.asJson, "kmsKeyId" -> o.kmsKeyId.asJson)
  }
  final implicit val InputLogEventEncoder: io.circe.Encoder[avias.logs.models.InputLogEvent] = io.circe.Encoder.instance { o => 
    Json.obj("timestamp" -> o.timestamp.asJson, "message" -> o.message.asJson)
  }
  final implicit val DescribeMetricFiltersResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeMetricFiltersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.MetricFilter]]]("metricFilters"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeMetricFiltersResponse.apply _)
  }
  final implicit val TestMetricFilterResponseDecoder: io.circe.Decoder[avias.logs.models.TestMetricFilterResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.logs.models.MetricFilterMatchRecord]]]("matches").map(avias.logs.models.TestMetricFilterResponse.apply _)
  }
  final implicit val DataAlreadyAcceptedExceptionDecoder: io.circe.Decoder[avias.logs.models.DataAlreadyAcceptedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("expectedSequenceToken").map(avias.logs.models.DataAlreadyAcceptedException.apply _)
  }
  final implicit val PutLogEventsResponseDecoder: io.circe.Decoder[avias.logs.models.PutLogEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextSequenceToken"), o.get[scala.Option[avias.logs.models.RejectedLogEventsInfo]]("rejectedLogEventsInfo")).mapN(avias.logs.models.PutLogEventsResponse.apply _)
  }
  final implicit val TagLogGroupRequestDecoder: io.circe.Decoder[avias.logs.models.TagLogGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("tags")).mapN(avias.logs.models.TagLogGroupRequest.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.logs.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.ResourceNotFoundException)
  final implicit val DescribeDestinationsResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeDestinationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.Destination]]]("destinations"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeDestinationsResponse.apply _)
  }
  final implicit val DestinationDecoder: io.circe.Decoder[avias.logs.models.Destination] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("targetArn"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("accessPolicy"), o.get[scala.Option[scala.Long]]("creationTime"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("destinationName")).mapN(avias.logs.models.Destination.apply _)
  }
  final implicit val CreateExportTaskResponseDecoder: io.circe.Decoder[avias.logs.models.CreateExportTaskResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("taskId").map(avias.logs.models.CreateExportTaskResponse.apply _)
  }
  final implicit val CancelExportTaskRequestDecoder: io.circe.Decoder[avias.logs.models.CancelExportTaskRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("taskId").map(avias.logs.models.CancelExportTaskRequest.apply _)
  }
  final implicit val ServiceUnavailableExceptionDecoder: io.circe.Decoder[avias.logs.models.ServiceUnavailableException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.ServiceUnavailableException)
  final implicit val ResourcePolicyDecoder: io.circe.Decoder[avias.logs.models.ResourcePolicy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("policyName"), o.get[scala.Option[java.lang.String]]("policyDocument"), o.get[scala.Option[scala.Long]]("lastUpdatedTime")).mapN(avias.logs.models.ResourcePolicy.apply _)
  }
  final implicit val PutSubscriptionFilterRequestDecoder: io.circe.Decoder[avias.logs.models.PutSubscriptionFilterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("filterPattern"), o.get[java.lang.String]("filterName"), o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("destinationArn"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("distribution")).mapN(avias.logs.models.PutSubscriptionFilterRequest.apply _)
  }
  final implicit val PutDestinationPolicyRequestDecoder: io.circe.Decoder[avias.logs.models.PutDestinationPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("destinationName"), o.get[java.lang.String]("accessPolicy")).mapN(avias.logs.models.PutDestinationPolicyRequest.apply _)
  }
  final implicit val PutDestinationResponseDecoder: io.circe.Decoder[avias.logs.models.PutDestinationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.logs.models.Destination]]("destination").map(avias.logs.models.PutDestinationResponse.apply _)
  }
  final implicit val InvalidOperationExceptionDecoder: io.circe.Decoder[avias.logs.models.InvalidOperationException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.InvalidOperationException)
  final implicit val GetLogEventsResponseDecoder: io.circe.Decoder[avias.logs.models.GetLogEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.OutputLogEvent]]]("events"), o.get[scala.Option[java.lang.String]]("nextForwardToken"), o.get[scala.Option[java.lang.String]]("nextBackwardToken")).mapN(avias.logs.models.GetLogEventsResponse.apply _)
  }
  final implicit val DeleteRetentionPolicyRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteRetentionPolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("logGroupName").map(avias.logs.models.DeleteRetentionPolicyRequest.apply _)
  }
  final implicit val UntagLogGroupRequestDecoder: io.circe.Decoder[avias.logs.models.UntagLogGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.List[java.lang.String]]("tags")).mapN(avias.logs.models.UntagLogGroupRequest.apply _)
  }
  final implicit val ListTagsLogGroupRequestDecoder: io.circe.Decoder[avias.logs.models.ListTagsLogGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("logGroupName").map(avias.logs.models.ListTagsLogGroupRequest.apply _)
  }
  final implicit val OutputLogEventDecoder: io.circe.Decoder[avias.logs.models.OutputLogEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("timestamp"), o.get[scala.Option[scala.Long]]("ingestionTime"), o.get[scala.Option[java.lang.String]]("message")).mapN(avias.logs.models.OutputLogEvent.apply _)
  }
  final implicit val DescribeLogGroupsResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeLogGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.LogGroup]]]("logGroups"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeLogGroupsResponse.apply _)
  }
  final implicit val DescribeLogStreamsResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeLogStreamsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.LogStream]]]("logStreams"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeLogStreamsResponse.apply _)
  }
  final implicit val MetricTransformationDecoder: io.circe.Decoder[avias.logs.models.MetricTransformation] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("metricName"), o.get[java.lang.String]("metricNamespace"), o.get[java.lang.String]("metricValue"), o.get[scala.Option[scala.Double]]("defaultValue")).mapN(avias.logs.models.MetricTransformation.apply _)
  }
  final implicit val SubscriptionFilterDecoder: io.circe.Decoder[avias.logs.models.SubscriptionFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("filterPattern"), o.get[scala.Option[scala.Long]]("creationTime"), o.get[scala.Option[java.lang.String]]("filterName"), o.get[scala.Option[java.lang.String]]("roleArn"), o.get[scala.Option[java.lang.String]]("logGroupName"), o.get[scala.Option[java.lang.String]]("destinationArn"), o.get[scala.Option[java.lang.String]]("distribution")).mapN(avias.logs.models.SubscriptionFilter.apply _)
  }
  final implicit val DescribeSubscriptionFiltersResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeSubscriptionFiltersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.SubscriptionFilter]]]("subscriptionFilters"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeSubscriptionFiltersResponse.apply _)
  }
  final implicit val ListTagsLogGroupResponseDecoder: io.circe.Decoder[avias.logs.models.ListTagsLogGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("tags").map(avias.logs.models.ListTagsLogGroupResponse.apply _)
  }
  final implicit val DeleteLogStreamRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteLogStreamRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("logStreamName")).mapN(avias.logs.models.DeleteLogStreamRequest.apply _)
  }
  final implicit val PutResourcePolicyResponseDecoder: io.circe.Decoder[avias.logs.models.PutResourcePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.logs.models.ResourcePolicy]]("resourcePolicy").map(avias.logs.models.PutResourcePolicyResponse.apply _)
  }
  final implicit val DescribeSubscriptionFiltersRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeSubscriptionFiltersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.Option[java.lang.String]]("filterNamePrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("limit")).mapN(avias.logs.models.DescribeSubscriptionFiltersRequest.apply _)
  }
  final implicit val SearchedLogStreamDecoder: io.circe.Decoder[avias.logs.models.SearchedLogStream] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("logStreamName"), o.get[scala.Option[scala.Boolean]]("searchedCompletely")).mapN(avias.logs.models.SearchedLogStream.apply _)
  }
  final implicit val InvalidSequenceTokenExceptionDecoder: io.circe.Decoder[avias.logs.models.InvalidSequenceTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("expectedSequenceToken").map(avias.logs.models.InvalidSequenceTokenException.apply _)
  }
  final implicit val ExportTaskStatusDecoder: io.circe.Decoder[avias.logs.models.ExportTaskStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("code"), o.get[scala.Option[java.lang.String]]("message")).mapN(avias.logs.models.ExportTaskStatus.apply _)
  }
  final implicit val DeleteMetricFilterRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteMetricFilterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("filterName")).mapN(avias.logs.models.DeleteMetricFilterRequest.apply _)
  }
  final implicit val DeleteLogGroupRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteLogGroupRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("logGroupName").map(avias.logs.models.DeleteLogGroupRequest.apply _)
  }
  final implicit val OperationAbortedExceptionDecoder: io.circe.Decoder[avias.logs.models.OperationAbortedException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.OperationAbortedException)
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.logs.models.LimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.LimitExceededException)
  final implicit val FilterLogEventsRequestDecoder: io.circe.Decoder[avias.logs.models.FilterLogEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.Option[scala.Boolean]]("interleaved"), o.get[scala.Option[java.lang.String]]("filterPattern"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[scala.Long]]("startTime"), o.get[scala.Option[scala.Long]]("endTime"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.List[java.lang.String]]]("logStreamNames")).mapN(avias.logs.models.FilterLogEventsRequest.apply _)
  }
  final implicit val DisassociateKmsKeyRequestDecoder: io.circe.Decoder[avias.logs.models.DisassociateKmsKeyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("logGroupName").map(avias.logs.models.DisassociateKmsKeyRequest.apply _)
  }
  final implicit val DeleteSubscriptionFilterRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteSubscriptionFilterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("filterName")).mapN(avias.logs.models.DeleteSubscriptionFilterRequest.apply _)
  }
  final implicit val FilterLogEventsResponseDecoder: io.circe.Decoder[avias.logs.models.FilterLogEventsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.FilteredLogEvent]]]("events"), o.get[scala.Option[scala.List[avias.logs.models.SearchedLogStream]]]("searchedLogStreams"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.FilterLogEventsResponse.apply _)
  }
  final implicit val PutResourcePolicyRequestDecoder: io.circe.Decoder[avias.logs.models.PutResourcePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("policyName"), o.get[scala.Option[java.lang.String]]("policyDocument")).mapN(avias.logs.models.PutResourcePolicyRequest.apply _)
  }
  final implicit val MetricFilterDecoder: io.circe.Decoder[avias.logs.models.MetricFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("filterPattern"), o.get[scala.Option[scala.List[avias.logs.models.MetricTransformation]]]("metricTransformations"), o.get[scala.Option[scala.Long]]("creationTime"), o.get[scala.Option[java.lang.String]]("filterName"), o.get[scala.Option[java.lang.String]]("logGroupName")).mapN(avias.logs.models.MetricFilter.apply _)
  }
  final implicit val DescribeDestinationsRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeDestinationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DestinationNamePrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("limit")).mapN(avias.logs.models.DescribeDestinationsRequest.apply _)
  }
  final implicit val DescribeResourcePoliciesResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeResourcePoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.ResourcePolicy]]]("resourcePolicies"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeResourcePoliciesResponse.apply _)
  }
  final implicit val RejectedLogEventsInfoDecoder: io.circe.Decoder[avias.logs.models.RejectedLogEventsInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("tooNewLogEventStartIndex"), o.get[scala.Option[scala.Int]]("tooOldLogEventEndIndex"), o.get[scala.Option[scala.Int]]("expiredLogEventEndIndex")).mapN(avias.logs.models.RejectedLogEventsInfo.apply _)
  }
  final implicit val ExportTaskExecutionInfoDecoder: io.circe.Decoder[avias.logs.models.ExportTaskExecutionInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("creationTime"), o.get[scala.Option[scala.Long]]("completionTime")).mapN(avias.logs.models.ExportTaskExecutionInfo.apply _)
  }
  final implicit val DescribeExportTasksResponseDecoder: io.circe.Decoder[avias.logs.models.DescribeExportTasksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.logs.models.ExportTask]]]("exportTasks"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.logs.models.DescribeExportTasksResponse.apply _)
  }
  final implicit val DescribeExportTasksRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeExportTasksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskId"), o.get[scala.Option[java.lang.String]]("statusCode"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("limit")).mapN(avias.logs.models.DescribeExportTasksRequest.apply _)
  }
  final implicit val PutMetricFilterRequestDecoder: io.circe.Decoder[avias.logs.models.PutMetricFilterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("filterName"), o.get[java.lang.String]("filterPattern"), o.get[scala.List[avias.logs.models.MetricTransformation]]("metricTransformations")).mapN(avias.logs.models.PutMetricFilterRequest.apply _)
  }
  final implicit val LogGroupDecoder: io.circe.Decoder[avias.logs.models.LogGroup] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("metricFilterCount"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[scala.Long]]("storedBytes"), o.get[scala.Option[scala.Long]]("creationTime"), o.get[scala.Option[java.lang.String]]("kmsKeyId"), o.get[scala.Option[scala.Int]]("retentionInDays"), o.get[scala.Option[java.lang.String]]("logGroupName")).mapN(avias.logs.models.LogGroup.apply _)
  }
  final implicit val PutLogEventsRequestDecoder: io.circe.Decoder[avias.logs.models.PutLogEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("logStreamName"), o.get[scala.List[avias.logs.models.InputLogEvent]]("logEvents"), o.get[scala.Option[java.lang.String]]("sequenceToken")).mapN(avias.logs.models.PutLogEventsRequest.apply _)
  }
  final implicit val CreateLogStreamRequestDecoder: io.circe.Decoder[avias.logs.models.CreateLogStreamRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("logStreamName")).mapN(avias.logs.models.CreateLogStreamRequest.apply _)
  }
  final implicit val ExportTaskDecoder: io.circe.Decoder[avias.logs.models.ExportTask] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("taskName"), o.get[scala.Option[avias.logs.models.ExportTaskStatus]]("status"), o.get[scala.Option[scala.Long]]("from"), o.get[scala.Option[scala.Long]]("to"), o.get[scala.Option[avias.logs.models.ExportTaskExecutionInfo]]("executionInfo"), o.get[scala.Option[java.lang.String]]("taskId"), o.get[scala.Option[java.lang.String]]("destination"), o.get[scala.Option[java.lang.String]]("logGroupName"), o.get[scala.Option[java.lang.String]]("destinationPrefix")).mapN(avias.logs.models.ExportTask.apply _)
  }
  final implicit val DeleteResourcePolicyRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteResourcePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("policyName").map(avias.logs.models.DeleteResourcePolicyRequest.apply _)
  }
  final implicit val DescribeLogStreamsRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeLogStreamsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.Option[java.lang.String]]("logStreamNamePrefix"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Boolean]]("descending"), o.get[scala.Option[java.lang.String]]("orderBy")).mapN(avias.logs.models.DescribeLogStreamsRequest.apply _)
  }
  final implicit val CreateExportTaskRequestDecoder: io.circe.Decoder[avias.logs.models.CreateExportTaskRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("from"), o.get[scala.Long]("to"), o.get[java.lang.String]("destination"), o.get[java.lang.String]("logGroupName"), o.get[scala.Option[java.lang.String]]("taskName"), o.get[scala.Option[java.lang.String]]("logStreamNamePrefix"), o.get[scala.Option[java.lang.String]]("destinationPrefix")).mapN(avias.logs.models.CreateExportTaskRequest.apply _)
  }
  final implicit val DescribeLogGroupsRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeLogGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("logGroupNamePrefix"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("limit")).mapN(avias.logs.models.DescribeLogGroupsRequest.apply _)
  }
  final implicit val DescribeResourcePoliciesRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeResourcePoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("limit")).mapN(avias.logs.models.DescribeResourcePoliciesRequest.apply _)
  }
  final implicit val PutRetentionPolicyRequestDecoder: io.circe.Decoder[avias.logs.models.PutRetentionPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.Int]("retentionInDays")).mapN(avias.logs.models.PutRetentionPolicyRequest.apply _)
  }
  final implicit val CreateLogGroupRequestDecoder: io.circe.Decoder[avias.logs.models.CreateLogGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[scala.Option[java.lang.String]]("kmsKeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("tags")).mapN(avias.logs.models.CreateLogGroupRequest.apply _)
  }
  final implicit val DeleteDestinationRequestDecoder: io.circe.Decoder[avias.logs.models.DeleteDestinationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("destinationName").map(avias.logs.models.DeleteDestinationRequest.apply _)
  }
  final implicit val FilteredLogEventDecoder: io.circe.Decoder[avias.logs.models.FilteredLogEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("logStreamName"), o.get[scala.Option[scala.Long]]("timestamp"), o.get[scala.Option[scala.Long]]("ingestionTime"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("eventId")).mapN(avias.logs.models.FilteredLogEvent.apply _)
  }
  final implicit val MetricFilterMatchRecordDecoder: io.circe.Decoder[avias.logs.models.MetricFilterMatchRecord] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("eventNumber"), o.get[scala.Option[java.lang.String]]("eventMessage"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("extractedValues")).mapN(avias.logs.models.MetricFilterMatchRecord.apply _)
  }
  final implicit val LogStreamDecoder: io.circe.Decoder[avias.logs.models.LogStream] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("uploadSequenceToken"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[scala.Long]]("storedBytes"), o.get[scala.Option[java.lang.String]]("logStreamName"), o.get[scala.Option[scala.Long]]("creationTime"), o.get[scala.Option[scala.Long]]("firstEventTimestamp"), o.get[scala.Option[scala.Long]]("lastEventTimestamp"), o.get[scala.Option[scala.Long]]("lastIngestionTime")).mapN(avias.logs.models.LogStream.apply _)
  }
  final implicit val DescribeMetricFiltersRequestDecoder: io.circe.Decoder[avias.logs.models.DescribeMetricFiltersRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("metricNamespace"), o.get[scala.Option[java.lang.String]]("metricName"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("filterNamePrefix"), o.get[scala.Option[java.lang.String]]("logGroupName")).mapN(avias.logs.models.DescribeMetricFiltersRequest.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.logs.models.ResourceAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.ResourceAlreadyExistsException)
  final implicit val GetLogEventsRequestDecoder: io.circe.Decoder[avias.logs.models.GetLogEventsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logStreamName"), o.get[java.lang.String]("logGroupName"), o.get[scala.Option[scala.Int]]("limit"), o.get[scala.Option[scala.Long]]("startTime"), o.get[scala.Option[scala.Long]]("endTime"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Boolean]]("startFromHead")).mapN(avias.logs.models.GetLogEventsRequest.apply _)
  }
  final implicit val TestMetricFilterRequestDecoder: io.circe.Decoder[avias.logs.models.TestMetricFilterRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("filterPattern"), o.get[scala.List[java.lang.String]]("logEventMessages")).mapN(avias.logs.models.TestMetricFilterRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.logs.models.InvalidParameterException.type] = io.circe.Decoder.decodeUnit.as(avias.logs.models.InvalidParameterException)
  final implicit val PutDestinationRequestDecoder: io.circe.Decoder[avias.logs.models.PutDestinationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("destinationName"), o.get[java.lang.String]("targetArn"), o.get[java.lang.String]("roleArn")).mapN(avias.logs.models.PutDestinationRequest.apply _)
  }
  final implicit val AssociateKmsKeyRequestDecoder: io.circe.Decoder[avias.logs.models.AssociateKmsKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("logGroupName"), o.get[java.lang.String]("kmsKeyId")).mapN(avias.logs.models.AssociateKmsKeyRequest.apply _)
  }
  final implicit val InputLogEventDecoder: io.circe.Decoder[avias.logs.models.InputLogEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("timestamp"), o.get[java.lang.String]("message")).mapN(avias.logs.models.InputLogEvent.apply _)
  }
}