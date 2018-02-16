package avias.kinesis
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val AddTagsToStreamInputEncoder: io.circe.Encoder[avias.kinesis.models.AddTagsToStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val KMSDisabledExceptionEncoder: io.circe.Encoder[avias.kinesis.models.KMSDisabledException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeStreamSummaryInputEncoder: io.circe.Encoder[avias.kinesis.models.DescribeStreamSummaryInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson)
  }
  final implicit val UpdateShardCountOutputEncoder: io.circe.Encoder[avias.kinesis.models.UpdateShardCountOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "CurrentShardCount" -> o.currentShardCount.asJson, "TargetShardCount" -> o.targetShardCount.asJson)
  }
  final implicit val EnhancedMonitoringOutputEncoder: io.circe.Encoder[avias.kinesis.models.EnhancedMonitoringOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "CurrentShardLevelMetrics" -> o.currentShardLevelMetrics.asJson, "DesiredShardLevelMetrics" -> o.desiredShardLevelMetrics.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.kinesis.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val EnhancedMetricsEncoder: io.circe.Encoder[avias.kinesis.models.EnhancedMetrics] = io.circe.Encoder.instance { o => 
    Json.obj("ShardLevelMetrics" -> o.shardLevelMetrics.asJson)
  }
  final implicit val ListStreamsOutputEncoder: io.circe.Encoder[avias.kinesis.models.ListStreamsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamNames" -> o.streamNames.asJson, "HasMoreStreams" -> o.hasMoreStreams.asJson)
  }
  final implicit val DescribeLimitsInputEncoder: io.circe.Encoder[avias.kinesis.models.DescribeLimitsInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SequenceNumberRangeEncoder: io.circe.Encoder[avias.kinesis.models.SequenceNumberRange] = io.circe.Encoder.instance { o => 
    Json.obj("StartingSequenceNumber" -> o.startingSequenceNumber.asJson, "EndingSequenceNumber" -> o.endingSequenceNumber.asJson)
  }
  final implicit val ListStreamsInputEncoder: io.circe.Encoder[avias.kinesis.models.ListStreamsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "ExclusiveStartStreamName" -> o.exclusiveStartStreamName.asJson)
  }
  final implicit val CreateStreamInputEncoder: io.circe.Encoder[avias.kinesis.models.CreateStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardCount" -> o.shardCount.asJson)
  }
  final implicit val DescribeStreamSummaryOutputEncoder: io.circe.Encoder[avias.kinesis.models.DescribeStreamSummaryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamDescriptionSummary" -> o.streamDescriptionSummary.asJson)
  }
  final implicit val EnableEnhancedMonitoringInputEncoder: io.circe.Encoder[avias.kinesis.models.EnableEnhancedMonitoringInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardLevelMetrics" -> o.shardLevelMetrics.asJson)
  }
  final implicit val ListTagsForStreamInputEncoder: io.circe.Encoder[avias.kinesis.models.ListTagsForStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ExclusiveStartTagKey" -> o.exclusiveStartTagKey.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.kinesis.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val MergeShardsInputEncoder: io.circe.Encoder[avias.kinesis.models.MergeShardsInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardToMerge" -> o.shardToMerge.asJson, "AdjacentShardToMerge" -> o.adjacentShardToMerge.asJson)
  }
  final implicit val DescribeStreamOutputEncoder: io.circe.Encoder[avias.kinesis.models.DescribeStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamDescription" -> o.streamDescription.asJson)
  }
  final implicit val InvalidArgumentExceptionEncoder: io.circe.Encoder[avias.kinesis.models.InvalidArgumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KMSThrottlingExceptionEncoder: io.circe.Encoder[avias.kinesis.models.KMSThrottlingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutRecordsRequestEntryEncoder: io.circe.Encoder[avias.kinesis.models.PutRecordsRequestEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Data" -> o.data.asJson, "PartitionKey" -> o.partitionKey.asJson, "ExplicitHashKey" -> o.explicitHashKey.asJson)
  }
  final implicit val PutRecordInputEncoder: io.circe.Encoder[avias.kinesis.models.PutRecordInput] = io.circe.Encoder.instance { o => 
    Json.obj("PartitionKey" -> o.partitionKey.asJson, "Data" -> o.data.asJson, "StreamName" -> o.streamName.asJson, "ExplicitHashKey" -> o.explicitHashKey.asJson, "SequenceNumberForOrdering" -> o.sequenceNumberForOrdering.asJson)
  }
  final implicit val IncreaseStreamRetentionPeriodInputEncoder: io.circe.Encoder[avias.kinesis.models.IncreaseStreamRetentionPeriodInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson)
  }
  final implicit val PutRecordsInputEncoder: io.circe.Encoder[avias.kinesis.models.PutRecordsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "StreamName" -> o.streamName.asJson)
  }
  final implicit val ListTagsForStreamOutputEncoder: io.circe.Encoder[avias.kinesis.models.ListTagsForStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "HasMoreTags" -> o.hasMoreTags.asJson)
  }
  final implicit val HashKeyRangeEncoder: io.circe.Encoder[avias.kinesis.models.HashKeyRange] = io.circe.Encoder.instance { o => 
    Json.obj("StartingHashKey" -> o.startingHashKey.asJson, "EndingHashKey" -> o.endingHashKey.asJson)
  }
  final implicit val GetShardIteratorOutputEncoder: io.circe.Encoder[avias.kinesis.models.GetShardIteratorOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardIterator" -> o.shardIterator.asJson)
  }
  final implicit val KMSAccessDeniedExceptionEncoder: io.circe.Encoder[avias.kinesis.models.KMSAccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StreamDescriptionEncoder: io.circe.Encoder[avias.kinesis.models.StreamDescription] = io.circe.Encoder.instance { o => 
    Json.obj("StreamCreationTimestamp" -> o.streamCreationTimestamp.asJson, "StreamStatus" -> o.streamStatus.asJson, "HasMoreShards" -> o.hasMoreShards.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson, "StreamARN" -> o.streamARN.asJson, "Shards" -> o.shards.asJson, "StreamName" -> o.streamName.asJson, "EnhancedMonitoring" -> o.enhancedMonitoring.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val DescribeStreamInputEncoder: io.circe.Encoder[avias.kinesis.models.DescribeStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "Limit" -> o.limit.asJson, "ExclusiveStartShardId" -> o.exclusiveStartShardId.asJson)
  }
  final implicit val UpdateShardCountInputEncoder: io.circe.Encoder[avias.kinesis.models.UpdateShardCountInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "TargetShardCount" -> o.targetShardCount.asJson, "ScalingType" -> o.scalingType.asJson)
  }
  final implicit val DisableEnhancedMonitoringInputEncoder: io.circe.Encoder[avias.kinesis.models.DisableEnhancedMonitoringInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardLevelMetrics" -> o.shardLevelMetrics.asJson)
  }
  final implicit val PutRecordsResultEntryEncoder: io.circe.Encoder[avias.kinesis.models.PutRecordsResultEntry] = io.circe.Encoder.instance { o => 
    Json.obj("SequenceNumber" -> o.sequenceNumber.asJson, "ShardId" -> o.shardId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val StartStreamEncryptionInputEncoder: io.circe.Encoder[avias.kinesis.models.StartStreamEncryptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.kinesis.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StreamDescriptionSummaryEncoder: io.circe.Encoder[avias.kinesis.models.StreamDescriptionSummary] = io.circe.Encoder.instance { o => 
    Json.obj("StreamCreationTimestamp" -> o.streamCreationTimestamp.asJson, "StreamStatus" -> o.streamStatus.asJson, "OpenShardCount" -> o.openShardCount.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson, "StreamARN" -> o.streamARN.asJson, "StreamName" -> o.streamName.asJson, "EnhancedMonitoring" -> o.enhancedMonitoring.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val GetRecordsOutputEncoder: io.circe.Encoder[avias.kinesis.models.GetRecordsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "NextShardIterator" -> o.nextShardIterator.asJson, "MillisBehindLatest" -> o.millisBehindLatest.asJson)
  }
  final implicit val SplitShardInputEncoder: io.circe.Encoder[avias.kinesis.models.SplitShardInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "ShardToSplit" -> o.shardToSplit.asJson, "NewStartingHashKey" -> o.newStartingHashKey.asJson)
  }
  final implicit val StopStreamEncryptionInputEncoder: io.circe.Encoder[avias.kinesis.models.StopStreamEncryptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "EncryptionType" -> o.encryptionType.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ShardEncoder: io.circe.Encoder[avias.kinesis.models.Shard] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "HashKeyRange" -> o.hashKeyRange.asJson, "SequenceNumberRange" -> o.sequenceNumberRange.asJson, "ParentShardId" -> o.parentShardId.asJson, "AdjacentParentShardId" -> o.adjacentParentShardId.asJson)
  }
  final implicit val PutRecordOutputEncoder: io.circe.Encoder[avias.kinesis.models.PutRecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "SequenceNumber" -> o.sequenceNumber.asJson, "EncryptionType" -> o.encryptionType.asJson)
  }
  final implicit val PutRecordsOutputEncoder: io.circe.Encoder[avias.kinesis.models.PutRecordsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "FailedRecordCount" -> o.failedRecordCount.asJson, "EncryptionType" -> o.encryptionType.asJson)
  }
  final implicit val KMSOptInRequiredEncoder: io.circe.Encoder[avias.kinesis.models.KMSOptInRequired] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetRecordsInputEncoder: io.circe.Encoder[avias.kinesis.models.GetRecordsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardIterator" -> o.shardIterator.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DecreaseStreamRetentionPeriodInputEncoder: io.circe.Encoder[avias.kinesis.models.DecreaseStreamRetentionPeriodInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "RetentionPeriodHours" -> o.retentionPeriodHours.asJson)
  }
  final implicit val ExpiredIteratorExceptionEncoder: io.circe.Encoder[avias.kinesis.models.ExpiredIteratorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RemoveTagsFromStreamInputEncoder: io.circe.Encoder[avias.kinesis.models.RemoveTagsFromStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetShardIteratorInputEncoder: io.circe.Encoder[avias.kinesis.models.GetShardIteratorInput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "ShardIteratorType" -> o.shardIteratorType.asJson, "StreamName" -> o.streamName.asJson, "Timestamp" -> o.timestamp.asJson, "StartingSequenceNumber" -> o.startingSequenceNumber.asJson)
  }
  final implicit val KMSNotFoundExceptionEncoder: io.circe.Encoder[avias.kinesis.models.KMSNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.kinesis.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteStreamInputEncoder: io.circe.Encoder[avias.kinesis.models.DeleteStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamName" -> o.streamName.asJson)
  }
  final implicit val ProvisionedThroughputExceededExceptionEncoder: io.circe.Encoder[avias.kinesis.models.ProvisionedThroughputExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RecordEncoder: io.circe.Encoder[avias.kinesis.models.Record] = io.circe.Encoder.instance { o => 
    Json.obj("SequenceNumber" -> o.sequenceNumber.asJson, "PartitionKey" -> o.partitionKey.asJson, "Data" -> o.data.asJson, "ApproximateArrivalTimestamp" -> o.approximateArrivalTimestamp.asJson, "EncryptionType" -> o.encryptionType.asJson)
  }
  final implicit val DescribeLimitsOutputEncoder: io.circe.Encoder[avias.kinesis.models.DescribeLimitsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardLimit" -> o.shardLimit.asJson, "OpenShardCount" -> o.openShardCount.asJson)
  }
  final implicit val KMSInvalidStateExceptionEncoder: io.circe.Encoder[avias.kinesis.models.KMSInvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddTagsToStreamInputDecoder: io.circe.Decoder[avias.kinesis.models.AddTagsToStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Tags")).mapN(avias.kinesis.models.AddTagsToStreamInput.apply _)
  }
  final implicit val KMSDisabledExceptionDecoder: io.circe.Decoder[avias.kinesis.models.KMSDisabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.KMSDisabledException.apply _)
  }
  final implicit val DescribeStreamSummaryInputDecoder: io.circe.Decoder[avias.kinesis.models.DescribeStreamSummaryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StreamName").map(avias.kinesis.models.DescribeStreamSummaryInput.apply _)
  }
  final implicit val UpdateShardCountOutputDecoder: io.circe.Decoder[avias.kinesis.models.UpdateShardCountOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamName"), o.get[scala.Option[scala.Int]]("CurrentShardCount"), o.get[scala.Option[scala.Int]]("TargetShardCount")).mapN(avias.kinesis.models.UpdateShardCountOutput.apply _)
  }
  final implicit val EnhancedMonitoringOutputDecoder: io.circe.Decoder[avias.kinesis.models.EnhancedMonitoringOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamName"), o.get[scala.Option[scala.List[java.lang.String]]]("CurrentShardLevelMetrics"), o.get[scala.Option[scala.List[java.lang.String]]]("DesiredShardLevelMetrics")).mapN(avias.kinesis.models.EnhancedMonitoringOutput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.kinesis.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.LimitExceededException.apply _)
  }
  final implicit val EnhancedMetricsDecoder: io.circe.Decoder[avias.kinesis.models.EnhancedMetrics] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("ShardLevelMetrics").map(avias.kinesis.models.EnhancedMetrics.apply _)
  }
  final implicit val ListStreamsOutputDecoder: io.circe.Decoder[avias.kinesis.models.ListStreamsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("StreamNames"), o.get[scala.Boolean]("HasMoreStreams")).mapN(avias.kinesis.models.ListStreamsOutput.apply _)
  }
  final implicit val DescribeLimitsInputDecoder: io.circe.Decoder[avias.kinesis.models.DescribeLimitsInput.type] = io.circe.Decoder.decodeUnit.as(avias.kinesis.models.DescribeLimitsInput)
  final implicit val SequenceNumberRangeDecoder: io.circe.Decoder[avias.kinesis.models.SequenceNumberRange] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StartingSequenceNumber"), o.get[scala.Option[java.lang.String]]("EndingSequenceNumber")).mapN(avias.kinesis.models.SequenceNumberRange.apply _)
  }
  final implicit val ListStreamsInputDecoder: io.circe.Decoder[avias.kinesis.models.ListStreamsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartStreamName")).mapN(avias.kinesis.models.ListStreamsInput.apply _)
  }
  final implicit val CreateStreamInputDecoder: io.circe.Decoder[avias.kinesis.models.CreateStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("ShardCount")).mapN(avias.kinesis.models.CreateStreamInput.apply _)
  }
  final implicit val DescribeStreamSummaryOutputDecoder: io.circe.Decoder[avias.kinesis.models.DescribeStreamSummaryOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesis.models.StreamDescriptionSummary]("StreamDescriptionSummary").map(avias.kinesis.models.DescribeStreamSummaryOutput.apply _)
  }
  final implicit val EnableEnhancedMonitoringInputDecoder: io.circe.Decoder[avias.kinesis.models.EnableEnhancedMonitoringInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.List[java.lang.String]]("ShardLevelMetrics")).mapN(avias.kinesis.models.EnableEnhancedMonitoringInput.apply _)
  }
  final implicit val ListTagsForStreamInputDecoder: io.circe.Decoder[avias.kinesis.models.ListTagsForStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Option[java.lang.String]]("ExclusiveStartTagKey"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.kinesis.models.ListTagsForStreamInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.kinesis.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.kinesis.models.Tag.apply _)
  }
  final implicit val MergeShardsInputDecoder: io.circe.Decoder[avias.kinesis.models.MergeShardsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("ShardToMerge"), o.get[java.lang.String]("AdjacentShardToMerge")).mapN(avias.kinesis.models.MergeShardsInput.apply _)
  }
  final implicit val DescribeStreamOutputDecoder: io.circe.Decoder[avias.kinesis.models.DescribeStreamOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesis.models.StreamDescription]("StreamDescription").map(avias.kinesis.models.DescribeStreamOutput.apply _)
  }
  final implicit val InvalidArgumentExceptionDecoder: io.circe.Decoder[avias.kinesis.models.InvalidArgumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.InvalidArgumentException.apply _)
  }
  final implicit val KMSThrottlingExceptionDecoder: io.circe.Decoder[avias.kinesis.models.KMSThrottlingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.KMSThrottlingException.apply _)
  }
  final implicit val PutRecordsRequestEntryDecoder: io.circe.Decoder[avias.kinesis.models.PutRecordsRequestEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("Data"), o.get[java.lang.String]("PartitionKey"), o.get[scala.Option[java.lang.String]]("ExplicitHashKey")).mapN(avias.kinesis.models.PutRecordsRequestEntry.apply _)
  }
  final implicit val PutRecordInputDecoder: io.circe.Decoder[avias.kinesis.models.PutRecordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PartitionKey"), o.get[scala.Array[scala.Byte]]("Data"), o.get[java.lang.String]("StreamName"), o.get[scala.Option[java.lang.String]]("ExplicitHashKey"), o.get[scala.Option[java.lang.String]]("SequenceNumberForOrdering")).mapN(avias.kinesis.models.PutRecordInput.apply _)
  }
  final implicit val IncreaseStreamRetentionPeriodInputDecoder: io.circe.Decoder[avias.kinesis.models.IncreaseStreamRetentionPeriodInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("RetentionPeriodHours")).mapN(avias.kinesis.models.IncreaseStreamRetentionPeriodInput.apply _)
  }
  final implicit val PutRecordsInputDecoder: io.circe.Decoder[avias.kinesis.models.PutRecordsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.kinesis.models.PutRecordsRequestEntry]]("Records"), o.get[java.lang.String]("StreamName")).mapN(avias.kinesis.models.PutRecordsInput.apply _)
  }
  final implicit val ListTagsForStreamOutputDecoder: io.circe.Decoder[avias.kinesis.models.ListTagsForStreamOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.kinesis.models.Tag]]("Tags"), o.get[scala.Boolean]("HasMoreTags")).mapN(avias.kinesis.models.ListTagsForStreamOutput.apply _)
  }
  final implicit val HashKeyRangeDecoder: io.circe.Decoder[avias.kinesis.models.HashKeyRange] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StartingHashKey"), o.get[java.lang.String]("EndingHashKey")).mapN(avias.kinesis.models.HashKeyRange.apply _)
  }
  final implicit val GetShardIteratorOutputDecoder: io.circe.Decoder[avias.kinesis.models.GetShardIteratorOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ShardIterator").map(avias.kinesis.models.GetShardIteratorOutput.apply _)
  }
  final implicit val KMSAccessDeniedExceptionDecoder: io.circe.Decoder[avias.kinesis.models.KMSAccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.KMSAccessDeniedException.apply _)
  }
  final implicit val StreamDescriptionDecoder: io.circe.Decoder[avias.kinesis.models.StreamDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("StreamCreationTimestamp"), o.get[java.lang.String]("StreamStatus"), o.get[scala.Boolean]("HasMoreShards"), o.get[scala.Int]("RetentionPeriodHours"), o.get[java.lang.String]("StreamARN"), o.get[scala.List[avias.kinesis.models.Shard]]("Shards"), o.get[java.lang.String]("StreamName"), o.get[scala.List[avias.kinesis.models.EnhancedMetrics]]("EnhancedMonitoring"), o.get[scala.Option[java.lang.String]]("EncryptionType"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(avias.kinesis.models.StreamDescription.apply _)
  }
  final implicit val DescribeStreamInputDecoder: io.circe.Decoder[avias.kinesis.models.DescribeStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartShardId")).mapN(avias.kinesis.models.DescribeStreamInput.apply _)
  }
  final implicit val UpdateShardCountInputDecoder: io.circe.Decoder[avias.kinesis.models.UpdateShardCountInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("TargetShardCount"), o.get[java.lang.String]("ScalingType")).mapN(avias.kinesis.models.UpdateShardCountInput.apply _)
  }
  final implicit val DisableEnhancedMonitoringInputDecoder: io.circe.Decoder[avias.kinesis.models.DisableEnhancedMonitoringInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.List[java.lang.String]]("ShardLevelMetrics")).mapN(avias.kinesis.models.DisableEnhancedMonitoringInput.apply _)
  }
  final implicit val PutRecordsResultEntryDecoder: io.circe.Decoder[avias.kinesis.models.PutRecordsResultEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SequenceNumber"), o.get[scala.Option[java.lang.String]]("ShardId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.kinesis.models.PutRecordsResultEntry.apply _)
  }
  final implicit val StartStreamEncryptionInputDecoder: io.circe.Decoder[avias.kinesis.models.StartStreamEncryptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("EncryptionType"), o.get[java.lang.String]("KeyId")).mapN(avias.kinesis.models.StartStreamEncryptionInput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.kinesis.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.ResourceNotFoundException.apply _)
  }
  final implicit val StreamDescriptionSummaryDecoder: io.circe.Decoder[avias.kinesis.models.StreamDescriptionSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("StreamCreationTimestamp"), o.get[java.lang.String]("StreamStatus"), o.get[scala.Int]("OpenShardCount"), o.get[scala.Int]("RetentionPeriodHours"), o.get[java.lang.String]("StreamARN"), o.get[java.lang.String]("StreamName"), o.get[scala.List[avias.kinesis.models.EnhancedMetrics]]("EnhancedMonitoring"), o.get[scala.Option[java.lang.String]]("EncryptionType"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(avias.kinesis.models.StreamDescriptionSummary.apply _)
  }
  final implicit val GetRecordsOutputDecoder: io.circe.Decoder[avias.kinesis.models.GetRecordsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.kinesis.models.Record]]("Records"), o.get[scala.Option[java.lang.String]]("NextShardIterator"), o.get[scala.Option[scala.Long]]("MillisBehindLatest")).mapN(avias.kinesis.models.GetRecordsOutput.apply _)
  }
  final implicit val SplitShardInputDecoder: io.circe.Decoder[avias.kinesis.models.SplitShardInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("ShardToSplit"), o.get[java.lang.String]("NewStartingHashKey")).mapN(avias.kinesis.models.SplitShardInput.apply _)
  }
  final implicit val StopStreamEncryptionInputDecoder: io.circe.Decoder[avias.kinesis.models.StopStreamEncryptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[java.lang.String]("EncryptionType"), o.get[java.lang.String]("KeyId")).mapN(avias.kinesis.models.StopStreamEncryptionInput.apply _)
  }
  final implicit val ShardDecoder: io.circe.Decoder[avias.kinesis.models.Shard] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardId"), o.get[avias.kinesis.models.HashKeyRange]("HashKeyRange"), o.get[avias.kinesis.models.SequenceNumberRange]("SequenceNumberRange"), o.get[scala.Option[java.lang.String]]("ParentShardId"), o.get[scala.Option[java.lang.String]]("AdjacentParentShardId")).mapN(avias.kinesis.models.Shard.apply _)
  }
  final implicit val PutRecordOutputDecoder: io.circe.Decoder[avias.kinesis.models.PutRecordOutput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardId"), o.get[java.lang.String]("SequenceNumber"), o.get[scala.Option[java.lang.String]]("EncryptionType")).mapN(avias.kinesis.models.PutRecordOutput.apply _)
  }
  final implicit val PutRecordsOutputDecoder: io.circe.Decoder[avias.kinesis.models.PutRecordsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.kinesis.models.PutRecordsResultEntry]]("Records"), o.get[scala.Option[scala.Int]]("FailedRecordCount"), o.get[scala.Option[java.lang.String]]("EncryptionType")).mapN(avias.kinesis.models.PutRecordsOutput.apply _)
  }
  final implicit val KMSOptInRequiredDecoder: io.circe.Decoder[avias.kinesis.models.KMSOptInRequired] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.KMSOptInRequired.apply _)
  }
  final implicit val GetRecordsInputDecoder: io.circe.Decoder[avias.kinesis.models.GetRecordsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardIterator"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.kinesis.models.GetRecordsInput.apply _)
  }
  final implicit val DecreaseStreamRetentionPeriodInputDecoder: io.circe.Decoder[avias.kinesis.models.DecreaseStreamRetentionPeriodInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.Int]("RetentionPeriodHours")).mapN(avias.kinesis.models.DecreaseStreamRetentionPeriodInput.apply _)
  }
  final implicit val ExpiredIteratorExceptionDecoder: io.circe.Decoder[avias.kinesis.models.ExpiredIteratorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.ExpiredIteratorException.apply _)
  }
  final implicit val RemoveTagsFromStreamInputDecoder: io.circe.Decoder[avias.kinesis.models.RemoveTagsFromStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamName"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.kinesis.models.RemoveTagsFromStreamInput.apply _)
  }
  final implicit val GetShardIteratorInputDecoder: io.circe.Decoder[avias.kinesis.models.GetShardIteratorInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardId"), o.get[java.lang.String]("ShardIteratorType"), o.get[java.lang.String]("StreamName"), o.get[scala.Option[java.time.Instant]]("Timestamp"), o.get[scala.Option[java.lang.String]]("StartingSequenceNumber")).mapN(avias.kinesis.models.GetShardIteratorInput.apply _)
  }
  final implicit val KMSNotFoundExceptionDecoder: io.circe.Decoder[avias.kinesis.models.KMSNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.KMSNotFoundException.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.kinesis.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.ResourceInUseException.apply _)
  }
  final implicit val DeleteStreamInputDecoder: io.circe.Decoder[avias.kinesis.models.DeleteStreamInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("StreamName").map(avias.kinesis.models.DeleteStreamInput.apply _)
  }
  final implicit val ProvisionedThroughputExceededExceptionDecoder: io.circe.Decoder[avias.kinesis.models.ProvisionedThroughputExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.ProvisionedThroughputExceededException.apply _)
  }
  final implicit val RecordDecoder: io.circe.Decoder[avias.kinesis.models.Record] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SequenceNumber"), o.get[java.lang.String]("PartitionKey"), o.get[scala.Array[scala.Byte]]("Data"), o.get[scala.Option[java.time.Instant]]("ApproximateArrivalTimestamp"), o.get[scala.Option[java.lang.String]]("EncryptionType")).mapN(avias.kinesis.models.Record.apply _)
  }
  final implicit val DescribeLimitsOutputDecoder: io.circe.Decoder[avias.kinesis.models.DescribeLimitsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("ShardLimit"), o.get[scala.Int]("OpenShardCount")).mapN(avias.kinesis.models.DescribeLimitsOutput.apply _)
  }
  final implicit val KMSInvalidStateExceptionDecoder: io.circe.Decoder[avias.kinesis.models.KMSInvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesis.models.KMSInvalidStateException.apply _)
  }
}