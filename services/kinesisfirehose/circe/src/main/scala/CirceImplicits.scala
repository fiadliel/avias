package avias.kinesisfirehose
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteDeliveryStreamInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.DeleteDeliveryStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamName" -> o.deliveryStreamName.asJson)
  }
  final implicit val ProcessorParameterEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ProcessorParameter] = io.circe.Encoder.instance { o => 
    Json.obj("ParameterName" -> o.parameterName.asJson, "ParameterValue" -> o.parameterValue.asJson)
  }
  final implicit val S3DestinationUpdateEncoder: io.circe.Encoder[avias.kinesisfirehose.models.S3DestinationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson, "BucketARN" -> o.bucketARN.asJson, "RoleARN" -> o.roleARN.asJson, "CompressionFormat" -> o.compressionFormat.asJson, "BufferingHints" -> o.bufferingHints.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val CreateDeliveryStreamInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.CreateDeliveryStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamName" -> o.deliveryStreamName.asJson, "SplunkDestinationConfiguration" -> o.splunkDestinationConfiguration.asJson, "ExtendedS3DestinationConfiguration" -> o.extendedS3DestinationConfiguration.asJson, "S3DestinationConfiguration" -> o.s3DestinationConfiguration.asJson, "DeliveryStreamType" -> o.deliveryStreamType.asJson, "RedshiftDestinationConfiguration" -> o.redshiftDestinationConfiguration.asJson, "KinesisStreamSourceConfiguration" -> o.kinesisStreamSourceConfiguration.asJson, "ElasticsearchDestinationConfiguration" -> o.elasticsearchDestinationConfiguration.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CloudWatchLoggingOptionsEncoder: io.circe.Encoder[avias.kinesisfirehose.models.CloudWatchLoggingOptions] = io.circe.Encoder.instance { o => 
    Json.obj("Enabled" -> o.enabled.asJson, "LogGroupName" -> o.logGroupName.asJson, "LogStreamName" -> o.logStreamName.asJson)
  }
  final implicit val UpdateDestinationInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.UpdateDestinationInput] = io.circe.Encoder.instance { o => 
    Json.obj("DestinationId" -> o.destinationId.asJson, "DeliveryStreamName" -> o.deliveryStreamName.asJson, "CurrentDeliveryStreamVersionId" -> o.currentDeliveryStreamVersionId.asJson, "S3DestinationUpdate" -> o.s3DestinationUpdate.asJson, "RedshiftDestinationUpdate" -> o.redshiftDestinationUpdate.asJson, "ElasticsearchDestinationUpdate" -> o.elasticsearchDestinationUpdate.asJson, "SplunkDestinationUpdate" -> o.splunkDestinationUpdate.asJson, "ExtendedS3DestinationUpdate" -> o.extendedS3DestinationUpdate.asJson)
  }
  final implicit val S3DestinationDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.S3DestinationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionConfiguration" -> o.encryptionConfiguration.asJson, "BucketARN" -> o.bucketARN.asJson, "RoleARN" -> o.roleARN.asJson, "CompressionFormat" -> o.compressionFormat.asJson, "BufferingHints" -> o.bufferingHints.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val SplunkRetryOptionsEncoder: io.circe.Encoder[avias.kinesisfirehose.models.SplunkRetryOptions] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInSeconds" -> o.durationInSeconds.asJson)
  }
  final implicit val SplunkDestinationConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.SplunkDestinationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("HECEndpointType" -> o.hecendpointType.asJson, "S3Configuration" -> o.s3Configuration.asJson, "HECEndpoint" -> o.hecendpoint.asJson, "HECToken" -> o.hectoken.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "RetryOptions" -> o.retryOptions.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "HECAcknowledgmentTimeoutInSeconds" -> o.hecacknowledgmentTimeoutInSeconds.asJson, "S3BackupMode" -> o.s3BackupMode.asJson)
  }
  final implicit val PutRecordInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.PutRecordInput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamName" -> o.deliveryStreamName.asJson, "Record" -> o.record.asJson)
  }
  final implicit val SplunkDestinationDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.SplunkDestinationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("HECEndpointType" -> o.hecendpointType.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "S3DestinationDescription" -> o.s3DestinationDescription.asJson, "RetryOptions" -> o.retryOptions.asJson, "HECEndpoint" -> o.hecendpoint.asJson, "HECToken" -> o.hectoken.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "HECAcknowledgmentTimeoutInSeconds" -> o.hecacknowledgmentTimeoutInSeconds.asJson, "S3BackupMode" -> o.s3BackupMode.asJson)
  }
  final implicit val ElasticsearchBufferingHintsEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ElasticsearchBufferingHints] = io.circe.Encoder.instance { o => 
    Json.obj("IntervalInSeconds" -> o.intervalInSeconds.asJson, "SizeInMBs" -> o.sizeInMBs.asJson)
  }
  final implicit val DeleteDeliveryStreamOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.DeleteDeliveryStreamOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateDeliveryStreamOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.CreateDeliveryStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamARN" -> o.deliveryStreamARN.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutRecordBatchOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.PutRecordBatchOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FailedPutCount" -> o.failedPutCount.asJson, "RequestResponses" -> o.requestResponses.asJson)
  }
  final implicit val RedshiftDestinationUpdateEncoder: io.circe.Encoder[avias.kinesisfirehose.models.RedshiftDestinationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("S3Update" -> o.s3Update.asJson, "S3BackupUpdate" -> o.s3BackupUpdate.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "Username" -> o.username.asJson, "CopyCommand" -> o.copyCommand.asJson, "Password" -> o.password.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "RoleARN" -> o.roleARN.asJson, "ClusterJDBCURL" -> o.clusterJDBCURL.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "RetryOptions" -> o.retryOptions.asJson)
  }
  final implicit val KMSEncryptionConfigEncoder: io.circe.Encoder[avias.kinesisfirehose.models.KMSEncryptionConfig] = io.circe.Encoder.instance { o => 
    Json.obj("AWSKMSKeyARN" -> o.awskmskeyARN.asJson)
  }
  final implicit val DeliveryStreamDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.DeliveryStreamDescription] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamARN" -> o.deliveryStreamARN.asJson, "Destinations" -> o.destinations.asJson, "DeliveryStreamType" -> o.deliveryStreamType.asJson, "HasMoreDestinations" -> o.hasMoreDestinations.asJson, "DeliveryStreamName" -> o.deliveryStreamName.asJson, "VersionId" -> o.versionId.asJson, "DeliveryStreamStatus" -> o.deliveryStreamStatus.asJson, "CreateTimestamp" -> o.createTimestamp.asJson, "LastUpdateTimestamp" -> o.lastUpdateTimestamp.asJson, "Source" -> o.source.asJson)
  }
  final implicit val RedshiftDestinationDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.RedshiftDestinationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("S3DestinationDescription" -> o.s3DestinationDescription.asJson, "Username" -> o.username.asJson, "CopyCommand" -> o.copyCommand.asJson, "RoleARN" -> o.roleARN.asJson, "ClusterJDBCURL" -> o.clusterJDBCURL.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "S3BackupDescription" -> o.s3BackupDescription.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "RetryOptions" -> o.retryOptions.asJson)
  }
  final implicit val ExtendedS3DestinationConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ExtendedS3DestinationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("BucketARN" -> o.bucketARN.asJson, "RoleARN" -> o.roleARN.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "S3BackupConfiguration" -> o.s3BackupConfiguration.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "CompressionFormat" -> o.compressionFormat.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "BufferingHints" -> o.bufferingHints.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val S3DestinationConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.S3DestinationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("BucketARN" -> o.bucketARN.asJson, "RoleARN" -> o.roleARN.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson, "CompressionFormat" -> o.compressionFormat.asJson, "BufferingHints" -> o.bufferingHints.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val SourceDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.SourceDescription] = io.circe.Encoder.instance { o => 
    Json.obj("KinesisStreamSourceDescription" -> o.kinesisStreamSourceDescription.asJson)
  }
  final implicit val DescribeDeliveryStreamInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.DescribeDeliveryStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamName" -> o.deliveryStreamName.asJson, "Limit" -> o.limit.asJson, "ExclusiveStartDestinationId" -> o.exclusiveStartDestinationId.asJson)
  }
  final implicit val ExtendedS3DestinationDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ExtendedS3DestinationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionConfiguration" -> o.encryptionConfiguration.asJson, "BucketARN" -> o.bucketARN.asJson, "RoleARN" -> o.roleARN.asJson, "CompressionFormat" -> o.compressionFormat.asJson, "BufferingHints" -> o.bufferingHints.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "S3BackupDescription" -> o.s3BackupDescription.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val DescribeDeliveryStreamOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.DescribeDeliveryStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamDescription" -> o.deliveryStreamDescription.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutRecordOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.PutRecordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecordId" -> o.recordId.asJson)
  }
  final implicit val EncryptionConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.EncryptionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("NoEncryptionConfig" -> o.noEncryptionConfig.asJson, "KMSEncryptionConfig" -> o.kmsencryptionConfig.asJson)
  }
  final implicit val DestinationDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.DestinationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("DestinationId" -> o.destinationId.asJson, "S3DestinationDescription" -> o.s3DestinationDescription.asJson, "SplunkDestinationDescription" -> o.splunkDestinationDescription.asJson, "RedshiftDestinationDescription" -> o.redshiftDestinationDescription.asJson, "ExtendedS3DestinationDescription" -> o.extendedS3DestinationDescription.asJson, "ElasticsearchDestinationDescription" -> o.elasticsearchDestinationDescription.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CopyCommandEncoder: io.circe.Encoder[avias.kinesisfirehose.models.CopyCommand] = io.circe.Encoder.instance { o => 
    Json.obj("DataTableName" -> o.dataTableName.asJson, "DataTableColumns" -> o.dataTableColumns.asJson, "CopyOptions" -> o.copyOptions.asJson)
  }
  final implicit val ElasticsearchDestinationDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ElasticsearchDestinationDescription] = io.circe.Encoder.instance { o => 
    Json.obj("CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "S3DestinationDescription" -> o.s3DestinationDescription.asJson, "BufferingHints" -> o.bufferingHints.asJson, "DomainARN" -> o.domainARN.asJson, "TypeName" -> o.typeName.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "RoleARN" -> o.roleARN.asJson, "IndexName" -> o.indexName.asJson, "IndexRotationPeriod" -> o.indexRotationPeriod.asJson, "RetryOptions" -> o.retryOptions.asJson)
  }
  final implicit val KinesisStreamSourceDescriptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.KinesisStreamSourceDescription] = io.circe.Encoder.instance { o => 
    Json.obj("KinesisStreamARN" -> o.kinesisStreamARN.asJson, "RoleARN" -> o.roleARN.asJson, "DeliveryStartTimestamp" -> o.deliveryStartTimestamp.asJson)
  }
  final implicit val ProcessorEncoder: io.circe.Encoder[avias.kinesisfirehose.models.Processor] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val ProcessingConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ProcessingConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("Enabled" -> o.enabled.asJson, "Processors" -> o.processors.asJson)
  }
  final implicit val PutRecordBatchInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.PutRecordBatchInput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamName" -> o.deliveryStreamName.asJson, "Records" -> o.records.asJson)
  }
  final implicit val RedshiftDestinationConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.RedshiftDestinationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "S3Configuration" -> o.s3Configuration.asJson, "CopyCommand" -> o.copyCommand.asJson, "Password" -> o.password.asJson, "RoleARN" -> o.roleARN.asJson, "ClusterJDBCURL" -> o.clusterJDBCURL.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "S3BackupConfiguration" -> o.s3BackupConfiguration.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "RetryOptions" -> o.retryOptions.asJson)
  }
  final implicit val ListDeliveryStreamsInputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ListDeliveryStreamsInput] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "DeliveryStreamType" -> o.deliveryStreamType.asJson, "ExclusiveStartDeliveryStreamName" -> o.exclusiveStartDeliveryStreamName.asJson)
  }
  final implicit val ElasticsearchDestinationUpdateEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ElasticsearchDestinationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("S3Update" -> o.s3Update.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "BufferingHints" -> o.bufferingHints.asJson, "DomainARN" -> o.domainARN.asJson, "TypeName" -> o.typeName.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "RoleARN" -> o.roleARN.asJson, "IndexName" -> o.indexName.asJson, "IndexRotationPeriod" -> o.indexRotationPeriod.asJson, "RetryOptions" -> o.retryOptions.asJson)
  }
  final implicit val PutRecordBatchResponseEntryEncoder: io.circe.Encoder[avias.kinesisfirehose.models.PutRecordBatchResponseEntry] = io.circe.Encoder.instance { o => 
    Json.obj("RecordId" -> o.recordId.asJson, "ErrorCode" -> o.errorCode.asJson, "ErrorMessage" -> o.errorMessage.asJson)
  }
  final implicit val SplunkDestinationUpdateEncoder: io.circe.Encoder[avias.kinesisfirehose.models.SplunkDestinationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("HECEndpointType" -> o.hecendpointType.asJson, "S3Update" -> o.s3Update.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "RetryOptions" -> o.retryOptions.asJson, "HECEndpoint" -> o.hecendpoint.asJson, "HECToken" -> o.hectoken.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "HECAcknowledgmentTimeoutInSeconds" -> o.hecacknowledgmentTimeoutInSeconds.asJson, "S3BackupMode" -> o.s3BackupMode.asJson)
  }
  final implicit val KinesisStreamSourceConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.KinesisStreamSourceConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("KinesisStreamARN" -> o.kinesisStreamARN.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val ExtendedS3DestinationUpdateEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ExtendedS3DestinationUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("S3BackupUpdate" -> o.s3BackupUpdate.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "EncryptionConfiguration" -> o.encryptionConfiguration.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "BucketARN" -> o.bucketARN.asJson, "RoleARN" -> o.roleARN.asJson, "CompressionFormat" -> o.compressionFormat.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "BufferingHints" -> o.bufferingHints.asJson, "Prefix" -> o.prefix.asJson)
  }
  final implicit val ElasticsearchDestinationConfigurationEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ElasticsearchDestinationConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("S3Configuration" -> o.s3Configuration.asJson, "DomainARN" -> o.domainARN.asJson, "TypeName" -> o.typeName.asJson, "RoleARN" -> o.roleARN.asJson, "IndexName" -> o.indexName.asJson, "CloudWatchLoggingOptions" -> o.cloudWatchLoggingOptions.asJson, "BufferingHints" -> o.bufferingHints.asJson, "ProcessingConfiguration" -> o.processingConfiguration.asJson, "S3BackupMode" -> o.s3BackupMode.asJson, "IndexRotationPeriod" -> o.indexRotationPeriod.asJson, "RetryOptions" -> o.retryOptions.asJson)
  }
  final implicit val ListDeliveryStreamsOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ListDeliveryStreamsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryStreamNames" -> o.deliveryStreamNames.asJson, "HasMoreDeliveryStreams" -> o.hasMoreDeliveryStreams.asJson)
  }
  final implicit val RecordEncoder: io.circe.Encoder[avias.kinesisfirehose.models.Record] = io.circe.Encoder.instance { o => 
    Json.obj("Data" -> o.data.asJson)
  }
  final implicit val UpdateDestinationOutputEncoder: io.circe.Encoder[avias.kinesisfirehose.models.UpdateDestinationOutput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServiceUnavailableExceptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ServiceUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidArgumentExceptionEncoder: io.circe.Encoder[avias.kinesisfirehose.models.InvalidArgumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RedshiftRetryOptionsEncoder: io.circe.Encoder[avias.kinesisfirehose.models.RedshiftRetryOptions] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInSeconds" -> o.durationInSeconds.asJson)
  }
  final implicit val BufferingHintsEncoder: io.circe.Encoder[avias.kinesisfirehose.models.BufferingHints] = io.circe.Encoder.instance { o => 
    Json.obj("SizeInMBs" -> o.sizeInMBs.asJson, "IntervalInSeconds" -> o.intervalInSeconds.asJson)
  }
  final implicit val ElasticsearchRetryOptionsEncoder: io.circe.Encoder[avias.kinesisfirehose.models.ElasticsearchRetryOptions] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInSeconds" -> o.durationInSeconds.asJson)
  }
  final implicit val DeleteDeliveryStreamInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.DeleteDeliveryStreamInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DeliveryStreamName").map(avias.kinesisfirehose.models.DeleteDeliveryStreamInput.apply _)
  }
  final implicit val ProcessorParameterDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ProcessorParameter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParameterName"), o.get[java.lang.String]("ParameterValue")).mapN(avias.kinesisfirehose.models.ProcessorParameter.apply _)
  }
  final implicit val S3DestinationUpdateDecoder: io.circe.Decoder[avias.kinesisfirehose.models.S3DestinationUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.EncryptionConfiguration]]("EncryptionConfiguration"), o.get[scala.Option[java.lang.String]]("BucketARN"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("CompressionFormat"), o.get[scala.Option[avias.kinesisfirehose.models.BufferingHints]]("BufferingHints"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.kinesisfirehose.models.S3DestinationUpdate.apply _)
  }
  final implicit val CreateDeliveryStreamInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.CreateDeliveryStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeliveryStreamName"), o.get[scala.Option[avias.kinesisfirehose.models.SplunkDestinationConfiguration]]("SplunkDestinationConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.ExtendedS3DestinationConfiguration]]("ExtendedS3DestinationConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationConfiguration]]("S3DestinationConfiguration"), o.get[scala.Option[java.lang.String]]("DeliveryStreamType"), o.get[scala.Option[avias.kinesisfirehose.models.RedshiftDestinationConfiguration]]("RedshiftDestinationConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.KinesisStreamSourceConfiguration]]("KinesisStreamSourceConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchDestinationConfiguration]]("ElasticsearchDestinationConfiguration")).mapN(avias.kinesisfirehose.models.CreateDeliveryStreamInput.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisfirehose.models.ConcurrentModificationException.apply _)
  }
  final implicit val CloudWatchLoggingOptionsDecoder: io.circe.Decoder[avias.kinesisfirehose.models.CloudWatchLoggingOptions] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[java.lang.String]]("LogGroupName"), o.get[scala.Option[java.lang.String]]("LogStreamName")).mapN(avias.kinesisfirehose.models.CloudWatchLoggingOptions.apply _)
  }
  final implicit val UpdateDestinationInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.UpdateDestinationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DestinationId"), o.get[java.lang.String]("DeliveryStreamName"), o.get[java.lang.String]("CurrentDeliveryStreamVersionId"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationUpdate]]("S3DestinationUpdate"), o.get[scala.Option[avias.kinesisfirehose.models.RedshiftDestinationUpdate]]("RedshiftDestinationUpdate"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchDestinationUpdate]]("ElasticsearchDestinationUpdate"), o.get[scala.Option[avias.kinesisfirehose.models.SplunkDestinationUpdate]]("SplunkDestinationUpdate"), o.get[scala.Option[avias.kinesisfirehose.models.ExtendedS3DestinationUpdate]]("ExtendedS3DestinationUpdate")).mapN(avias.kinesisfirehose.models.UpdateDestinationInput.apply _)
  }
  final implicit val S3DestinationDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.S3DestinationDescription] = io.circe.Decoder.instance { o => 
    (o.get[avias.kinesisfirehose.models.EncryptionConfiguration]("EncryptionConfiguration"), o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("CompressionFormat"), o.get[avias.kinesisfirehose.models.BufferingHints]("BufferingHints"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.kinesisfirehose.models.S3DestinationDescription.apply _)
  }
  final implicit val SplunkRetryOptionsDecoder: io.circe.Decoder[avias.kinesisfirehose.models.SplunkRetryOptions] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("DurationInSeconds").map(avias.kinesisfirehose.models.SplunkRetryOptions.apply _)
  }
  final implicit val SplunkDestinationConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.SplunkDestinationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HECEndpointType"), o.get[avias.kinesisfirehose.models.S3DestinationConfiguration]("S3Configuration"), o.get[java.lang.String]("HECEndpoint"), o.get[java.lang.String]("HECToken"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.SplunkRetryOptions]]("RetryOptions"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[scala.Int]]("HECAcknowledgmentTimeoutInSeconds"), o.get[scala.Option[java.lang.String]]("S3BackupMode")).mapN(avias.kinesisfirehose.models.SplunkDestinationConfiguration.apply _)
  }
  final implicit val PutRecordInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.PutRecordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeliveryStreamName"), o.get[avias.kinesisfirehose.models.Record]("Record")).mapN(avias.kinesisfirehose.models.PutRecordInput.apply _)
  }
  final implicit val SplunkDestinationDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.SplunkDestinationDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HECEndpointType"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationDescription]]("S3DestinationDescription"), o.get[scala.Option[avias.kinesisfirehose.models.SplunkRetryOptions]]("RetryOptions"), o.get[scala.Option[java.lang.String]]("HECEndpoint"), o.get[scala.Option[java.lang.String]]("HECToken"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[scala.Int]]("HECAcknowledgmentTimeoutInSeconds"), o.get[scala.Option[java.lang.String]]("S3BackupMode")).mapN(avias.kinesisfirehose.models.SplunkDestinationDescription.apply _)
  }
  final implicit val ElasticsearchBufferingHintsDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ElasticsearchBufferingHints] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("IntervalInSeconds"), o.get[scala.Option[scala.Int]]("SizeInMBs")).mapN(avias.kinesisfirehose.models.ElasticsearchBufferingHints.apply _)
  }
  final implicit val DeleteDeliveryStreamOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.DeleteDeliveryStreamOutput.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisfirehose.models.DeleteDeliveryStreamOutput)
  final implicit val CreateDeliveryStreamOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.CreateDeliveryStreamOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("DeliveryStreamARN").map(avias.kinesisfirehose.models.CreateDeliveryStreamOutput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisfirehose.models.LimitExceededException.apply _)
  }
  final implicit val PutRecordBatchOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.PutRecordBatchOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("FailedPutCount"), o.get[scala.List[avias.kinesisfirehose.models.PutRecordBatchResponseEntry]]("RequestResponses")).mapN(avias.kinesisfirehose.models.PutRecordBatchOutput.apply _)
  }
  final implicit val RedshiftDestinationUpdateDecoder: io.circe.Decoder[avias.kinesisfirehose.models.RedshiftDestinationUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationUpdate]]("S3Update"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationUpdate]]("S3BackupUpdate"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[avias.kinesisfirehose.models.CopyCommand]]("CopyCommand"), o.get[scala.Option[java.lang.String]]("Password"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("ClusterJDBCURL"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[avias.kinesisfirehose.models.RedshiftRetryOptions]]("RetryOptions")).mapN(avias.kinesisfirehose.models.RedshiftDestinationUpdate.apply _)
  }
  final implicit val KMSEncryptionConfigDecoder: io.circe.Decoder[avias.kinesisfirehose.models.KMSEncryptionConfig] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AWSKMSKeyARN").map(avias.kinesisfirehose.models.KMSEncryptionConfig.apply _)
  }
  final implicit val DeliveryStreamDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.DeliveryStreamDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeliveryStreamARN"), o.get[scala.List[avias.kinesisfirehose.models.DestinationDescription]]("Destinations"), o.get[java.lang.String]("DeliveryStreamType"), o.get[scala.Boolean]("HasMoreDestinations"), o.get[java.lang.String]("DeliveryStreamName"), o.get[java.lang.String]("VersionId"), o.get[java.lang.String]("DeliveryStreamStatus"), o.get[scala.Option[java.time.Instant]]("CreateTimestamp"), o.get[scala.Option[java.time.Instant]]("LastUpdateTimestamp"), o.get[scala.Option[avias.kinesisfirehose.models.SourceDescription]]("Source")).mapN(avias.kinesisfirehose.models.DeliveryStreamDescription.apply _)
  }
  final implicit val RedshiftDestinationDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.RedshiftDestinationDescription] = io.circe.Decoder.instance { o => 
    (o.get[avias.kinesisfirehose.models.S3DestinationDescription]("S3DestinationDescription"), o.get[java.lang.String]("Username"), o.get[avias.kinesisfirehose.models.CopyCommand]("CopyCommand"), o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("ClusterJDBCURL"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationDescription]]("S3BackupDescription"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[avias.kinesisfirehose.models.RedshiftRetryOptions]]("RetryOptions")).mapN(avias.kinesisfirehose.models.RedshiftDestinationDescription.apply _)
  }
  final implicit val ExtendedS3DestinationConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ExtendedS3DestinationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("RoleARN"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationConfiguration]]("S3BackupConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.EncryptionConfiguration]]("EncryptionConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("CompressionFormat"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[avias.kinesisfirehose.models.BufferingHints]]("BufferingHints"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.kinesisfirehose.models.ExtendedS3DestinationConfiguration.apply _)
  }
  final implicit val S3DestinationConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.S3DestinationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("RoleARN"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.EncryptionConfiguration]]("EncryptionConfiguration"), o.get[scala.Option[java.lang.String]]("CompressionFormat"), o.get[scala.Option[avias.kinesisfirehose.models.BufferingHints]]("BufferingHints"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.kinesisfirehose.models.S3DestinationConfiguration.apply _)
  }
  final implicit val SourceDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.SourceDescription] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.kinesisfirehose.models.KinesisStreamSourceDescription]]("KinesisStreamSourceDescription").map(avias.kinesisfirehose.models.SourceDescription.apply _)
  }
  final implicit val DescribeDeliveryStreamInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.DescribeDeliveryStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeliveryStreamName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartDestinationId")).mapN(avias.kinesisfirehose.models.DescribeDeliveryStreamInput.apply _)
  }
  final implicit val ExtendedS3DestinationDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ExtendedS3DestinationDescription] = io.circe.Decoder.instance { o => 
    (o.get[avias.kinesisfirehose.models.EncryptionConfiguration]("EncryptionConfiguration"), o.get[java.lang.String]("BucketARN"), o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("CompressionFormat"), o.get[avias.kinesisfirehose.models.BufferingHints]("BufferingHints"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationDescription]]("S3BackupDescription"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.kinesisfirehose.models.ExtendedS3DestinationDescription.apply _)
  }
  final implicit val DescribeDeliveryStreamOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.DescribeDeliveryStreamOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.kinesisfirehose.models.DeliveryStreamDescription]("DeliveryStreamDescription").map(avias.kinesisfirehose.models.DescribeDeliveryStreamOutput.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisfirehose.models.ResourceInUseException.apply _)
  }
  final implicit val PutRecordOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.PutRecordOutput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("RecordId").map(avias.kinesisfirehose.models.PutRecordOutput.apply _)
  }
  final implicit val EncryptionConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.EncryptionConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NoEncryptionConfig"), o.get[scala.Option[avias.kinesisfirehose.models.KMSEncryptionConfig]]("KMSEncryptionConfig")).mapN(avias.kinesisfirehose.models.EncryptionConfiguration.apply _)
  }
  final implicit val DestinationDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.DestinationDescription] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DestinationId"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationDescription]]("S3DestinationDescription"), o.get[scala.Option[avias.kinesisfirehose.models.SplunkDestinationDescription]]("SplunkDestinationDescription"), o.get[scala.Option[avias.kinesisfirehose.models.RedshiftDestinationDescription]]("RedshiftDestinationDescription"), o.get[scala.Option[avias.kinesisfirehose.models.ExtendedS3DestinationDescription]]("ExtendedS3DestinationDescription"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchDestinationDescription]]("ElasticsearchDestinationDescription")).mapN(avias.kinesisfirehose.models.DestinationDescription.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisfirehose.models.ResourceNotFoundException.apply _)
  }
  final implicit val CopyCommandDecoder: io.circe.Decoder[avias.kinesisfirehose.models.CopyCommand] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DataTableName"), o.get[scala.Option[java.lang.String]]("DataTableColumns"), o.get[scala.Option[java.lang.String]]("CopyOptions")).mapN(avias.kinesisfirehose.models.CopyCommand.apply _)
  }
  final implicit val ElasticsearchDestinationDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ElasticsearchDestinationDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationDescription]]("S3DestinationDescription"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchBufferingHints]]("BufferingHints"), o.get[scala.Option[java.lang.String]]("DomainARN"), o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[java.lang.String]]("IndexRotationPeriod"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchRetryOptions]]("RetryOptions")).mapN(avias.kinesisfirehose.models.ElasticsearchDestinationDescription.apply _)
  }
  final implicit val KinesisStreamSourceDescriptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.KinesisStreamSourceDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KinesisStreamARN"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.time.Instant]]("DeliveryStartTimestamp")).mapN(avias.kinesisfirehose.models.KinesisStreamSourceDescription.apply _)
  }
  final implicit val ProcessorDecoder: io.circe.Decoder[avias.kinesisfirehose.models.Processor] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Type"), o.get[scala.Option[scala.List[avias.kinesisfirehose.models.ProcessorParameter]]]("Parameters")).mapN(avias.kinesisfirehose.models.Processor.apply _)
  }
  final implicit val ProcessingConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ProcessingConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[scala.List[avias.kinesisfirehose.models.Processor]]]("Processors")).mapN(avias.kinesisfirehose.models.ProcessingConfiguration.apply _)
  }
  final implicit val PutRecordBatchInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.PutRecordBatchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeliveryStreamName"), o.get[scala.List[avias.kinesisfirehose.models.Record]]("Records")).mapN(avias.kinesisfirehose.models.PutRecordBatchInput.apply _)
  }
  final implicit val RedshiftDestinationConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.RedshiftDestinationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[avias.kinesisfirehose.models.S3DestinationConfiguration]("S3Configuration"), o.get[avias.kinesisfirehose.models.CopyCommand]("CopyCommand"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("ClusterJDBCURL"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationConfiguration]]("S3BackupConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[avias.kinesisfirehose.models.RedshiftRetryOptions]]("RetryOptions")).mapN(avias.kinesisfirehose.models.RedshiftDestinationConfiguration.apply _)
  }
  final implicit val ListDeliveryStreamsInputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ListDeliveryStreamsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("DeliveryStreamType"), o.get[scala.Option[java.lang.String]]("ExclusiveStartDeliveryStreamName")).mapN(avias.kinesisfirehose.models.ListDeliveryStreamsInput.apply _)
  }
  final implicit val ElasticsearchDestinationUpdateDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ElasticsearchDestinationUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationUpdate]]("S3Update"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchBufferingHints]]("BufferingHints"), o.get[scala.Option[java.lang.String]]("DomainARN"), o.get[scala.Option[java.lang.String]]("TypeName"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[java.lang.String]]("IndexRotationPeriod"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchRetryOptions]]("RetryOptions")).mapN(avias.kinesisfirehose.models.ElasticsearchDestinationUpdate.apply _)
  }
  final implicit val PutRecordBatchResponseEntryDecoder: io.circe.Decoder[avias.kinesisfirehose.models.PutRecordBatchResponseEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("RecordId"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("ErrorMessage")).mapN(avias.kinesisfirehose.models.PutRecordBatchResponseEntry.apply _)
  }
  final implicit val SplunkDestinationUpdateDecoder: io.circe.Decoder[avias.kinesisfirehose.models.SplunkDestinationUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HECEndpointType"), o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationUpdate]]("S3Update"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.SplunkRetryOptions]]("RetryOptions"), o.get[scala.Option[java.lang.String]]("HECEndpoint"), o.get[scala.Option[java.lang.String]]("HECToken"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[scala.Int]]("HECAcknowledgmentTimeoutInSeconds"), o.get[scala.Option[java.lang.String]]("S3BackupMode")).mapN(avias.kinesisfirehose.models.SplunkDestinationUpdate.apply _)
  }
  final implicit val KinesisStreamSourceConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.KinesisStreamSourceConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KinesisStreamARN"), o.get[java.lang.String]("RoleARN")).mapN(avias.kinesisfirehose.models.KinesisStreamSourceConfiguration.apply _)
  }
  final implicit val ExtendedS3DestinationUpdateDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ExtendedS3DestinationUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.kinesisfirehose.models.S3DestinationUpdate]]("S3BackupUpdate"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.EncryptionConfiguration]]("EncryptionConfiguration"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("BucketARN"), o.get[scala.Option[java.lang.String]]("RoleARN"), o.get[scala.Option[java.lang.String]]("CompressionFormat"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[avias.kinesisfirehose.models.BufferingHints]]("BufferingHints"), o.get[scala.Option[java.lang.String]]("Prefix")).mapN(avias.kinesisfirehose.models.ExtendedS3DestinationUpdate.apply _)
  }
  final implicit val ElasticsearchDestinationConfigurationDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ElasticsearchDestinationConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[avias.kinesisfirehose.models.S3DestinationConfiguration]("S3Configuration"), o.get[java.lang.String]("DomainARN"), o.get[java.lang.String]("TypeName"), o.get[java.lang.String]("RoleARN"), o.get[java.lang.String]("IndexName"), o.get[scala.Option[avias.kinesisfirehose.models.CloudWatchLoggingOptions]]("CloudWatchLoggingOptions"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchBufferingHints]]("BufferingHints"), o.get[scala.Option[avias.kinesisfirehose.models.ProcessingConfiguration]]("ProcessingConfiguration"), o.get[scala.Option[java.lang.String]]("S3BackupMode"), o.get[scala.Option[java.lang.String]]("IndexRotationPeriod"), o.get[scala.Option[avias.kinesisfirehose.models.ElasticsearchRetryOptions]]("RetryOptions")).mapN(avias.kinesisfirehose.models.ElasticsearchDestinationConfiguration.apply _)
  }
  final implicit val ListDeliveryStreamsOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ListDeliveryStreamsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("DeliveryStreamNames"), o.get[scala.Boolean]("HasMoreDeliveryStreams")).mapN(avias.kinesisfirehose.models.ListDeliveryStreamsOutput.apply _)
  }
  final implicit val RecordDecoder: io.circe.Decoder[avias.kinesisfirehose.models.Record] = io.circe.Decoder.instance { o => 
    o.get[scala.Array[scala.Byte]]("Data").map(avias.kinesisfirehose.models.Record.apply _)
  }
  final implicit val UpdateDestinationOutputDecoder: io.circe.Decoder[avias.kinesisfirehose.models.UpdateDestinationOutput.type] = io.circe.Decoder.decodeUnit.as(avias.kinesisfirehose.models.UpdateDestinationOutput)
  final implicit val ServiceUnavailableExceptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ServiceUnavailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisfirehose.models.ServiceUnavailableException.apply _)
  }
  final implicit val InvalidArgumentExceptionDecoder: io.circe.Decoder[avias.kinesisfirehose.models.InvalidArgumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.kinesisfirehose.models.InvalidArgumentException.apply _)
  }
  final implicit val RedshiftRetryOptionsDecoder: io.circe.Decoder[avias.kinesisfirehose.models.RedshiftRetryOptions] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("DurationInSeconds").map(avias.kinesisfirehose.models.RedshiftRetryOptions.apply _)
  }
  final implicit val BufferingHintsDecoder: io.circe.Decoder[avias.kinesisfirehose.models.BufferingHints] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("SizeInMBs"), o.get[scala.Option[scala.Int]]("IntervalInSeconds")).mapN(avias.kinesisfirehose.models.BufferingHints.apply _)
  }
  final implicit val ElasticsearchRetryOptionsDecoder: io.circe.Decoder[avias.kinesisfirehose.models.ElasticsearchRetryOptions] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("DurationInSeconds").map(avias.kinesisfirehose.models.ElasticsearchRetryOptions.apply _)
  }
}