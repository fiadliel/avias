package org.lyranthe.araethura.kinesis
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val AddTagsToStreamInputEncoder: io.circe.Encoder[models.AddTagsToStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val KMSDisabledExceptionEncoder: io.circe.Encoder[models.KMSDisabledException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeStreamSummaryInputEncoder: io.circe.Encoder[models.DescribeStreamSummaryInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson)
  }
  final implicit val UpdateShardCountOutputEncoder: io.circe.Encoder[models.UpdateShardCountOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "CurrentShardCount" -> o.currentShardCount.asJson, "TargetShardCount" -> o.targetShardCount.asJson)
  }
  final implicit val EnhancedMonitoringOutputEncoder: io.circe.Encoder[models.EnhancedMonitoringOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "CurrentShardLevelMetrics" -> o.currentShardLevelMetrics.asJson, "DesiredShardLevelMetrics" -> o.desiredShardLevelMetrics.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val EnhancedMetricsEncoder: io.circe.Encoder[models.EnhancedMetrics] = io.circe.Encoder.instance { o => 
    Json.obj("ShardLevelMetrics" -> o.shardLevelMetrics.asJson)
  }
  final implicit val ListStreamsOutputEncoder: io.circe.Encoder[models.ListStreamsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamNames" -> o.streamNames.asJson, "HasMoreStreams" -> o.hasMoreStreams.asJson)
  }
  final implicit val DescribeLimitsInputEncoder: io.circe.Encoder[models.DescribeLimitsInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SequenceNumberRangeEncoder: io.circe.Encoder[models.SequenceNumberRange] = io.circe.Encoder.instance { o => 
    Json.obj("StartingSequenceNumber" -> o.startingSequenceNumber.asJson, "EndingSequenceNumber" -> o.endingSequenceNumber.asJson)
  }
  final implicit val ListStreamsInputEncoder: io.circe.Encoder[models.ListStreamsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "ExclusiveStartStreamName" -> o.exclusiveStartStreamName.asJson)
  }
  final implicit val CreateStreamInputEncoder: io.circe.Encoder[models.CreateStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardCount" -> o.shardCount.asJson)
  }
  final implicit val DescribeStreamSummaryOutputEncoder: io.circe.Encoder[models.DescribeStreamSummaryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamDescriptionSummary" -> o.streamDescriptionSummary.asJson)
  }
  final implicit val EnableEnhancedMonitoringInputEncoder: io.circe.Encoder[models.EnableEnhancedMonitoringInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardLevelMetrics" -> o.shardLevelMetrics.asJson)
  }
  final implicit val ListTagsForStreamInputEncoder: io.circe.Encoder[models.ListTagsForStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ExclusiveStartTagKey" -> o.exclusiveStartTagKey.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val MergeShardsInputEncoder: io.circe.Encoder[models.MergeShardsInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardToMerge" -> o.shardToMerge.asJson, "AdjacentShardToMerge" -> o.adjacentShardToMerge.asJson)
  }
  final implicit val DescribeStreamOutputEncoder: io.circe.Encoder[models.DescribeStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamDescription" -> o.streamDescription.asJson)
  }
  final implicit val InvalidArgumentExceptionEncoder: io.circe.Encoder[models.InvalidArgumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KMSThrottlingExceptionEncoder: io.circe.Encoder[models.KMSThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutRecordsRequestEntryEncoder: io.circe.Encoder[models.PutRecordsRequestEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Data" -> o.data.asJson, "PartitionKey" -> o.partitionKey.asJson, "ExplicitHashKey" -> o.explicitHashKey.asJson)
  }
  final implicit val PutRecordInputEncoder: io.circe.Encoder[models.PutRecordInput] = io.circe.Encoder.instance { o => 
    Json.obj("PartitionKey" -> o.partitionKey.asJson, "Data" -> o.data.asJson, "StreamName" -> o.streamName.asJson, "ExplicitHashKey" -> o.explicitHashKey.asJson, "SequenceNumberForOrdering" -> o.sequenceNumberForOrdering.asJson)
  }
  final implicit val IncreaseStreamRetentionPeriodInputEncoder: io.circe.Encoder[models.IncreaseStreamRetentionPeriodInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson)
  }
  final implicit val PutRecordsInputEncoder: io.circe.Encoder[models.PutRecordsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "StreamName" -> o.streamName.asJson)
  }
  final implicit val ListTagsForStreamOutputEncoder: io.circe.Encoder[models.ListTagsForStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "HasMoreTags" -> o.hasMoreTags.asJson)
  }
  final implicit val HashKeyRangeEncoder: io.circe.Encoder[models.HashKeyRange] = io.circe.Encoder.instance { o => 
    Json.obj("StartingHashKey" -> o.startingHashKey.asJson, "EndingHashKey" -> o.endingHashKey.asJson)
  }
  final implicit val GetShardIteratorOutputEncoder: io.circe.Encoder[models.GetShardIteratorOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardIterator" -> o.shardIterator.asJson)
  }
  final implicit val KMSAccessDeniedExceptionEncoder: io.circe.Encoder[models.KMSAccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StreamDescriptionEncoder: io.circe.Encoder[models.StreamDescription] = io.circe.Encoder.instance { o => 
    Json.obj("StreamCreationTimestamp" -> o.streamCreationTimestamp.asJson, "StreamStatus" -> o.streamStatus.asJson, "HasMoreShards" -> o.hasMoreShards.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson, "StreamARN" -> o.streamARN.asJson, "Shards" -> o.shards.asJson, "StreamName" -> o.streamName.asJson, "EnhancedMonitoring" -> o.enhancedMonitoring.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val DescribeStreamInputEncoder: io.circe.Encoder[models.DescribeStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "Limit" -> o.limit.asJson, "ExclusiveStartShardId" -> o.exclusiveStartShardId.asJson)
  }
  final implicit val UpdateShardCountInputEncoder: io.circe.Encoder[models.UpdateShardCountInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "TargetShardCount" -> o.targetShardCount.asJson, "ScalingType" -> o.scalingType.asJson)
  }
  final implicit val DisableEnhancedMonitoringInputEncoder: io.circe.Encoder[models.DisableEnhancedMonitoringInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardLevelMetrics" -> o.shardLevelMetrics.asJson)
  }
  final implicit val PutRecordsResultEntryEncoder: io.circe.Encoder[models.PutRecordsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("SequenceNumber" -> o.sequenceNumber.asJson, "ShardId" -> o.shardId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val StartStreamEncryptionInputEncoder: io.circe.Encoder[models.StartStreamEncryptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StreamDescriptionSummaryEncoder: io.circe.Encoder[models.StreamDescriptionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("StreamCreationTimestamp" -> o.streamCreationTimestamp.asJson, "StreamStatus" -> o.streamStatus.asJson, "OpenShardCount" -> o.openShardCount.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson, "StreamARN" -> o.streamARN.asJson, "StreamName" -> o.streamName.asJson, "EnhancedMonitoring" -> o.enhancedMonitoring.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val GetRecordsOutputEncoder: io.circe.Encoder[models.GetRecordsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "NextShardIterator" -> o.nextShardIterator.asJson, "MillisBehindLatest" -> o.millisBehindLatest.asJson)
  }
  final implicit val SplitShardInputEncoder: io.circe.Encoder[models.SplitShardInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardToSplit" -> o.shardToSplit.asJson, "NewStartingHashKey" -> o.newStartingHashKey.asJson)
  }
  final implicit val StopStreamEncryptionInputEncoder: io.circe.Encoder[models.StopStreamEncryptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ShardEncoder: io.circe.Encoder[models.Shard] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "HashKeyRange" -> o.hashKeyRange.asJson, "SequenceNumberRange" -> o.sequenceNumberRange.asJson, "ParentShardId" -> o.parentShardId.asJson, "AdjacentParentShardId" -> o.adjacentParentShardId.asJson)
  }
  final implicit val PutRecordOutputEncoder: io.circe.Encoder[models.PutRecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "SequenceNumber" -> o.sequenceNumber.asJson, "EncryptionType" -> o.encryptionType.asJson)
  }
  final implicit val PutRecordsOutputEncoder: io.circe.Encoder[models.PutRecordsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "FailedRecordCount" -> o.failedRecordCount.asJson, "EncryptionType" -> o.encryptionType.asJson)
  }
  final implicit val KMSOptInRequiredEncoder: io.circe.Encoder[models.KMSOptInRequired] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetRecordsInputEncoder: io.circe.Encoder[models.GetRecordsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardIterator" -> o.shardIterator.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DecreaseStreamRetentionPeriodInputEncoder: io.circe.Encoder[models.DecreaseStreamRetentionPeriodInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson)
  }
  final implicit val ExpiredIteratorExceptionEncoder: io.circe.Encoder[models.ExpiredIteratorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RemoveTagsFromStreamInputEncoder: io.circe.Encoder[models.RemoveTagsFromStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetShardIteratorInputEncoder: io.circe.Encoder[models.GetShardIteratorInput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "ShardIteratorType" -> o.shardIteratorType.asJson, "StreamName" -> o.streamName.asJson, "Timestamp" -> o.timestamp.asJson, "StartingSequenceNumber" -> o.startingSequenceNumber.asJson)
  }
  final implicit val KMSNotFoundExceptionEncoder: io.circe.Encoder[models.KMSNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteStreamInputEncoder: io.circe.Encoder[models.DeleteStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson)
  }
  final implicit val ProvisionedThroughputExceededExceptionEncoder: io.circe.Encoder[models.ProvisionedThroughputExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RecordEncoder: io.circe.Encoder[models.Record] = io.circe.Encoder.instance { o => 
    Json.obj("SequenceNumber" -> o.sequenceNumber.asJson, "PartitionKey" -> o.partitionKey.asJson, "Data" -> o.data.asJson, "ApproximateArrivalTimestamp" -> o.approximateArrivalTimestamp.asJson, "EncryptionType" -> o.encryptionType.asJson)
  }
  final implicit val DescribeLimitsOutputEncoder: io.circe.Encoder[models.DescribeLimitsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardLimit" -> o.shardLimit.asJson, "OpenShardCount" -> o.openShardCount.asJson)
  }
  final implicit val KMSInvalidStateExceptionEncoder: io.circe.Encoder[models.KMSInvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddTagsToStreamInputDecoder: io.circe.Decoder[models.AddTagsToStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Tags")).mapN(models.AddTagsToStreamInput.apply _)
  }
  final implicit val KMSDisabledExceptionDecoder: io.circe.Decoder[models.KMSDisabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSDisabledException.apply _)
  }
  final implicit val DescribeStreamSummaryInputDecoder: io.circe.Decoder[models.DescribeStreamSummaryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StreamName").map(models.DescribeStreamSummaryInput.apply _)
  }
  final implicit val UpdateShardCountOutputDecoder: io.circe.Decoder[models.UpdateShardCountOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamName"), o.get[scala.Option[scala.Int]]("CurrentShardCount"), o.get[scala.Option[scala.Int]]("TargetShardCount")).mapN(models.UpdateShardCountOutput.apply _)
  }
  final implicit val EnhancedMonitoringOutputDecoder: io.circe.Decoder[models.EnhancedMonitoringOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamName"), o.get[scala.Option[scala.List[java.lang.String]]]("CurrentShardLevelMetrics"), o.get[scala.Option[scala.List[java.lang.String]]]("DesiredShardLevelMetrics")).mapN(models.EnhancedMonitoringOutput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LimitExceededException.apply _)
  }
  final implicit val EnhancedMetricsDecoder: io.circe.Decoder[models.EnhancedMetrics] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("ShardLevelMetrics").map(models.EnhancedMetrics.apply _)
  }
  final implicit val ListStreamsOutputDecoder: io.circe.Decoder[models.ListStreamsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("StreamNames"), o.get[scala.Boolean]("HasMoreStreams")).mapN(models.ListStreamsOutput.apply _)
  }
  final implicit val DescribeLimitsInputDecoder: io.circe.Decoder[models.DescribeLimitsInput.type] = io.circe.Decoder.decodeUnit.as(models.DescribeLimitsInput)
  final implicit val SequenceNumberRangeDecoder: io.circe.Decoder[models.SequenceNumberRange] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StartingSequenceNumber"), o.get[scala.Option[java.lang.String]]("EndingSequenceNumber")).mapN(models.SequenceNumberRange.apply _)
  }
  final implicit val ListStreamsInputDecoder: io.circe.Decoder[models.ListStreamsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartStreamName")).mapN(models.ListStreamsInput.apply _)
  }
  final implicit val CreateStreamInputDecoder: io.circe.Decoder[models.CreateStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("ShardCount")).mapN(models.CreateStreamInput.apply _)
  }
  final implicit val DescribeStreamSummaryOutputDecoder: io.circe.Decoder[models.DescribeStreamSummaryOutput] = io.circe.Decoder.instance { o => 
    o.get[models.StreamDescriptionSummary]("StreamDescriptionSummary").map(models.DescribeStreamSummaryOutput.apply _)
  }
  final implicit val EnableEnhancedMonitoringInputDecoder: io.circe.Decoder[models.EnableEnhancedMonitoringInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.List[java.lang.String]]("ShardLevelMetrics")).mapN(models.EnableEnhancedMonitoringInput.apply _)
  }
  final implicit val ListTagsForStreamInputDecoder: io.circe.Decoder[models.ListTagsForStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Option[java.lang.String]]("ExclusiveStartTagKey"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListTagsForStreamInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val MergeShardsInputDecoder: io.circe.Decoder[models.MergeShardsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("ShardToMerge"), o.get[java.lang.String]("AdjacentShardToMerge")).mapN(models.MergeShardsInput.apply _)
  }
  final implicit val DescribeStreamOutputDecoder: io.circe.Decoder[models.DescribeStreamOutput] = io.circe.Decoder.instance { o => 
    o.get[models.StreamDescription]("StreamDescription").map(models.DescribeStreamOutput.apply _)
  }
  final implicit val InvalidArgumentExceptionDecoder: io.circe.Decoder[models.InvalidArgumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidArgumentException.apply _)
  }
  final implicit val KMSThrottlingExceptionDecoder: io.circe.Decoder[models.KMSThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSThrottlingException.apply _)
  }
  final implicit val PutRecordsRequestEntryDecoder: io.circe.Decoder[models.PutRecordsRequestEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("Data"), o.get[java.lang.String]("PartitionKey"), o.get[scala.Option[java.lang.String]]("ExplicitHashKey")).mapN(models.PutRecordsRequestEntry.apply _)
  }
  final implicit val PutRecordInputDecoder: io.circe.Decoder[models.PutRecordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PartitionKey"), o.get[scala.Array[scala.Byte]]("Data"), o.get[java.lang.String]("StreamName"), o.get[scala.Option[java.lang.String]]("ExplicitHashKey"), o.get[scala.Option[java.lang.String]]("SequenceNumberForOrdering")).mapN(models.PutRecordInput.apply _)
  }
  final implicit val IncreaseStreamRetentionPeriodInputDecoder: io.circe.Decoder[models.IncreaseStreamRetentionPeriodInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("RetentionPeriodHours")).mapN(models.IncreaseStreamRetentionPeriodInput.apply _)
  }
  final implicit val PutRecordsInputDecoder: io.circe.Decoder[models.PutRecordsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.PutRecordsRequestEntry]]("Records"), o.get[java.lang.String]("StreamName")).mapN(models.PutRecordsInput.apply _)
  }
  final implicit val ListTagsForStreamOutputDecoder: io.circe.Decoder[models.ListTagsForStreamOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Tag]]("Tags"), o.get[scala.Boolean]("HasMoreTags")).mapN(models.ListTagsForStreamOutput.apply _)
  }
  final implicit val HashKeyRangeDecoder: io.circe.Decoder[models.HashKeyRange] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StartingHashKey"), o.get[java.lang.String]("EndingHashKey")).mapN(models.HashKeyRange.apply _)
  }
  final implicit val GetShardIteratorOutputDecoder: io.circe.Decoder[models.GetShardIteratorOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ShardIterator").map(models.GetShardIteratorOutput.apply _)
  }
  final implicit val KMSAccessDeniedExceptionDecoder: io.circe.Decoder[models.KMSAccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSAccessDeniedException.apply _)
  }
  final implicit val StreamDescriptionDecoder: io.circe.Decoder[models.StreamDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("StreamCreationTimestamp"), o.get[java.lang.String]("StreamStatus"), o.get[scala.Boolean]("HasMoreShards"), o.get[scala.Int]("RetentionPeriodHours"), o.get[java.lang.String]("StreamARN"), o.get[scala.List[models.Shard]]("Shards"), o.get[java.lang.String]("StreamName"), o.get[scala.List[models.EnhancedMetrics]]("EnhancedMonitoring"), o.get[scala.Option[java.lang.String]]("EncryptionType"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(models.StreamDescription.apply _)
  }
  final implicit val DescribeStreamInputDecoder: io.circe.Decoder[models.DescribeStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartShardId")).mapN(models.DescribeStreamInput.apply _)
  }
  final implicit val UpdateShardCountInputDecoder: io.circe.Decoder[models.UpdateShardCountInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("TargetShardCount"), o.get[java.lang.String]("ScalingType")).mapN(models.UpdateShardCountInput.apply _)
  }
  final implicit val DisableEnhancedMonitoringInputDecoder: io.circe.Decoder[models.DisableEnhancedMonitoringInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.List[java.lang.String]]("ShardLevelMetrics")).mapN(models.DisableEnhancedMonitoringInput.apply _)
  }
  final implicit val PutRecordsResultEntryDecoder: io.circe.Decoder[models.PutRecordsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SequenceNumber"), o.get[scala.Option[java.lang.String]]("ShardId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(models.PutRecordsResultEntry.apply _)
  }
  final implicit val StartStreamEncryptionInputDecoder: io.circe.Decoder[models.StartStreamEncryptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("EncryptionType"), o.get[java.lang.String]("KeyId")).mapN(models.StartStreamEncryptionInput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val StreamDescriptionSummaryDecoder: io.circe.Decoder[models.StreamDescriptionSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("StreamCreationTimestamp"), o.get[java.lang.String]("StreamStatus"), o.get[scala.Int]("OpenShardCount"), o.get[scala.Int]("RetentionPeriodHours"), o.get[java.lang.String]("StreamARN"), o.get[java.lang.String]("StreamName"), o.get[scala.List[models.EnhancedMetrics]]("EnhancedMonitoring"), o.get[scala.Option[java.lang.String]]("EncryptionType"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(models.StreamDescriptionSummary.apply _)
  }
  final implicit val GetRecordsOutputDecoder: io.circe.Decoder[models.GetRecordsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.Record]]("Records"), o.get[scala.Option[java.lang.String]]("NextShardIterator"), o.get[scala.Option[scala.Long]]("MillisBehindLatest")).mapN(models.GetRecordsOutput.apply _)
  }
  final implicit val SplitShardInputDecoder: io.circe.Decoder[models.SplitShardInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("ShardToSplit"), o.get[java.lang.String]("NewStartingHashKey")).mapN(models.SplitShardInput.apply _)
  }
  final implicit val StopStreamEncryptionInputDecoder: io.circe.Decoder[models.StopStreamEncryptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("EncryptionType"), o.get[java.lang.String]("KeyId")).mapN(models.StopStreamEncryptionInput.apply _)
  }
  final implicit val ShardDecoder: io.circe.Decoder[models.Shard] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardId"), o.get[models.HashKeyRange]("HashKeyRange"), o.get[models.SequenceNumberRange]("SequenceNumberRange"), o.get[scala.Option[java.lang.String]]("ParentShardId"), o.get[scala.Option[java.lang.String]]("AdjacentParentShardId")).mapN(models.Shard.apply _)
  }
  final implicit val PutRecordOutputDecoder: io.circe.Decoder[models.PutRecordOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardId"), o.get[java.lang.String]("SequenceNumber"), o.get[scala.Option[java.lang.String]]("EncryptionType")).mapN(models.PutRecordOutput.apply _)
  }
  final implicit val PutRecordsOutputDecoder: io.circe.Decoder[models.PutRecordsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.PutRecordsResultEntry]]("Records"), o.get[scala.Option[scala.Int]]("FailedRecordCount"), o.get[scala.Option[java.lang.String]]("EncryptionType")).mapN(models.PutRecordsOutput.apply _)
  }
  final implicit val KMSOptInRequiredDecoder: io.circe.Decoder[models.KMSOptInRequired] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSOptInRequired.apply _)
  }
  final implicit val GetRecordsInputDecoder: io.circe.Decoder[models.GetRecordsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardIterator"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.GetRecordsInput.apply _)
  }
  final implicit val DecreaseStreamRetentionPeriodInputDecoder: io.circe.Decoder[models.DecreaseStreamRetentionPeriodInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("RetentionPeriodHours")).mapN(models.DecreaseStreamRetentionPeriodInput.apply _)
  }
  final implicit val ExpiredIteratorExceptionDecoder: io.circe.Decoder[models.ExpiredIteratorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExpiredIteratorException.apply _)
  }
  final implicit val RemoveTagsFromStreamInputDecoder: io.circe.Decoder[models.RemoveTagsFromStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.RemoveTagsFromStreamInput.apply _)
  }
  final implicit val GetShardIteratorInputDecoder: io.circe.Decoder[models.GetShardIteratorInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardId"), o.get[java.lang.String]("ShardIteratorType"), o.get[java.lang.String]("StreamName"), o.get[scala.Option[java.time.Instant]]("Timestamp"), o.get[scala.Option[java.lang.String]]("StartingSequenceNumber")).mapN(models.GetShardIteratorInput.apply _)
  }
  final implicit val KMSNotFoundExceptionDecoder: io.circe.Decoder[models.KMSNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSNotFoundException.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceInUseException.apply _)
  }
  final implicit val DeleteStreamInputDecoder: io.circe.Decoder[models.DeleteStreamInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StreamName").map(models.DeleteStreamInput.apply _)
  }
  final implicit val ProvisionedThroughputExceededExceptionDecoder: io.circe.Decoder[models.ProvisionedThroughputExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ProvisionedThroughputExceededException.apply _)
  }
  final implicit val RecordDecoder: io.circe.Decoder[models.Record] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SequenceNumber"), o.get[java.lang.String]("PartitionKey"), o.get[scala.Array[scala.Byte]]("Data"), o.get[scala.Option[java.time.Instant]]("ApproximateArrivalTimestamp"), o.get[scala.Option[java.lang.String]]("EncryptionType")).mapN(models.Record.apply _)
  }
  final implicit val DescribeLimitsOutputDecoder: io.circe.Decoder[models.DescribeLimitsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("ShardLimit"), o.get[scala.Int]("OpenShardCount")).mapN(models.DescribeLimitsOutput.apply _)
  }
  final implicit val KMSInvalidStateExceptionDecoder: io.circe.Decoder[models.KMSInvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSInvalidStateException.apply _)
  }
}