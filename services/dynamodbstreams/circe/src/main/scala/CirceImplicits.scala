package org.lyranthe.araethura.dynamodbstreams
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val KeySchemaElementEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.KeySchemaElement] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeName" -> o.attributeName.asJson, "KeyType" -> o.keyType.asJson)
  }
  final implicit val ListStreamsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.ListStreamsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Limit" -> o.limit.asJson, "ExclusiveStartStreamArn" -> o.exclusiveStartStreamArn.asJson)
  }
  final implicit val GetRecordsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.GetRecordsInput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardIterator" -> o.shardIterator.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttributeValueEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.AttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("BS" -> o.bs.asJson, "SS" -> o.ss.asJson, "M" -> o.m.asJson, "NULL" -> o.`null`.asJson, "B" -> o.b.asJson, "S" -> o.s.asJson, "N" -> o.n.asJson, "NS" -> o.ns.asJson, "BOOL" -> o.bool.asJson, "L" -> o.l.asJson)
  }
  final implicit val SequenceNumberRangeEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.SequenceNumberRange] = io.circe.Encoder.instance { o => 
    Json.obj("StartingSequenceNumber" -> o.startingSequenceNumber.asJson, "EndingSequenceNumber" -> o.endingSequenceNumber.asJson)
  }
  final implicit val StreamEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.Stream] = io.circe.Encoder.instance { o => 
    Json.obj("StreamArn" -> o.streamArn.asJson, "TableName" -> o.tableName.asJson, "StreamLabel" -> o.streamLabel.asJson)
  }
  final implicit val RecordEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.Record] = io.circe.Encoder.instance { o => 
    Json.obj("eventID" -> o.eventID.asJson, "eventVersion" -> o.eventVersion.asJson, "eventSource" -> o.eventSource.asJson, "awsRegion" -> o.awsRegion.asJson, "eventName" -> o.eventName.asJson, "dynamodb" -> o.dynamodb.asJson, "userIdentity" -> o.userIdentity.asJson)
  }
  final implicit val GetShardIteratorOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ShardIterator" -> o.shardIterator.asJson)
  }
  final implicit val StreamRecordEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.StreamRecord] = io.circe.Encoder.instance { o => 
    Json.obj("Keys" -> o.keys.asJson, "NewImage" -> o.newImage.asJson, "OldImage" -> o.oldImage.asJson, "SequenceNumber" -> o.sequenceNumber.asJson, "StreamViewType" -> o.streamViewType.asJson, "SizeBytes" -> o.sizeBytes.asJson, "ApproximateCreationDateTime" -> o.approximateCreationDateTime.asJson)
  }
  final implicit val IdentityEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.Identity] = io.circe.Encoder.instance { o => 
    Json.obj("PrincipalId" -> o.principalId.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val DescribeStreamInputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamArn" -> o.streamArn.asJson, "Limit" -> o.limit.asJson, "ExclusiveStartShardId" -> o.exclusiveStartShardId.asJson)
  }
  final implicit val ShardEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.Shard] = io.circe.Encoder.instance { o => 
    Json.obj("ShardId" -> o.shardId.asJson, "ParentShardId" -> o.parentShardId.asJson, "SequenceNumberRange" -> o.sequenceNumberRange.asJson)
  }
  final implicit val StreamDescriptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.StreamDescription] = io.circe.Encoder.instance { o => 
    Json.obj("StreamStatus" -> o.streamStatus.asJson, "TableName" -> o.tableName.asJson, "StreamLabel" -> o.streamLabel.asJson, "StreamArn" -> o.streamArn.asJson, "StreamViewType" -> o.streamViewType.asJson, "LastEvaluatedShardId" -> o.lastEvaluatedShardId.asJson, "KeySchema" -> o.keySchema.asJson, "Shards" -> o.shards.asJson, "CreationRequestDateTime" -> o.creationRequestDateTime.asJson)
  }
  final implicit val TrimmedDataAccessExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.TrimmedDataAccessException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetRecordsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.GetRecordsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Records" -> o.records.asJson, "NextShardIterator" -> o.nextShardIterator.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeStreamOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamDescription" -> o.streamDescription.asJson)
  }
  final implicit val GetShardIteratorInputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorInput] = io.circe.Encoder.instance { o => 
    Json.obj("StreamArn" -> o.streamArn.asJson, "ShardId" -> o.shardId.asJson, "ShardIteratorType" -> o.shardIteratorType.asJson, "SequenceNumber" -> o.sequenceNumber.asJson)
  }
  final implicit val ListStreamsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.ListStreamsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Streams" -> o.streams.asJson, "LastEvaluatedStreamArn" -> o.lastEvaluatedStreamArn.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExpiredIteratorExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.dynamodbstreams.models.ExpiredIteratorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KeySchemaElementDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.KeySchemaElement] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("KeyType")).mapN(org.lyranthe.araethura.dynamodbstreams.models.KeySchemaElement.apply _)
  }
  final implicit val ListStreamsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.ListStreamsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartStreamArn")).mapN(org.lyranthe.araethura.dynamodbstreams.models.ListStreamsInput.apply _)
  }
  final implicit val GetRecordsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.GetRecordsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ShardIterator"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.dynamodbstreams.models.GetRecordsInput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dynamodbstreams.models.LimitExceededException.apply _)
  }
  final implicit val AttributeValueDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.AttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.Array[scala.Byte]]]]("BS"), o.get[scala.Option[scala.List[java.lang.String]]]("SS"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.dynamodbstreams.models.AttributeValue]]]("M"), o.get[scala.Option[scala.Boolean]]("NULL"), o.get[scala.Option[scala.Array[scala.Byte]]]("B"), o.get[scala.Option[java.lang.String]]("S"), o.get[scala.Option[java.lang.String]]("N"), o.get[scala.Option[scala.List[java.lang.String]]]("NS"), o.get[scala.Option[scala.Boolean]]("BOOL"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dynamodbstreams.models.AttributeValue]]]("L")).mapN(org.lyranthe.araethura.dynamodbstreams.models.AttributeValue.apply _)
  }
  final implicit val SequenceNumberRangeDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.SequenceNumberRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StartingSequenceNumber"), o.get[scala.Option[java.lang.String]]("EndingSequenceNumber")).mapN(org.lyranthe.araethura.dynamodbstreams.models.SequenceNumberRange.apply _)
  }
  final implicit val StreamDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.Stream] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamArn"), o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[java.lang.String]]("StreamLabel")).mapN(org.lyranthe.araethura.dynamodbstreams.models.Stream.apply _)
  }
  final implicit val RecordDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.Record] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("eventID"), o.get[scala.Option[java.lang.String]]("eventVersion"), o.get[scala.Option[java.lang.String]]("eventSource"), o.get[scala.Option[java.lang.String]]("awsRegion"), o.get[scala.Option[java.lang.String]]("eventName"), o.get[scala.Option[org.lyranthe.araethura.dynamodbstreams.models.StreamRecord]]("dynamodb"), o.get[scala.Option[org.lyranthe.araethura.dynamodbstreams.models.Identity]]("userIdentity")).mapN(org.lyranthe.araethura.dynamodbstreams.models.Record.apply _)
  }
  final implicit val GetShardIteratorOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ShardIterator").map(org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorOutput.apply _)
  }
  final implicit val StreamRecordDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.StreamRecord] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.dynamodbstreams.models.AttributeValue]]]("Keys"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.dynamodbstreams.models.AttributeValue]]]("NewImage"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, org.lyranthe.araethura.dynamodbstreams.models.AttributeValue]]]("OldImage"), o.get[scala.Option[java.lang.String]]("SequenceNumber"), o.get[scala.Option[java.lang.String]]("StreamViewType"), o.get[scala.Option[scala.Long]]("SizeBytes"), o.get[scala.Option[java.time.Instant]]("ApproximateCreationDateTime")).mapN(org.lyranthe.araethura.dynamodbstreams.models.StreamRecord.apply _)
  }
  final implicit val IdentityDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.Identity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PrincipalId"), o.get[scala.Option[java.lang.String]]("Type")).mapN(org.lyranthe.araethura.dynamodbstreams.models.Identity.apply _)
  }
  final implicit val DescribeStreamInputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamArn"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ExclusiveStartShardId")).mapN(org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamInput.apply _)
  }
  final implicit val ShardDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.Shard] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ShardId"), o.get[scala.Option[java.lang.String]]("ParentShardId"), o.get[scala.Option[org.lyranthe.araethura.dynamodbstreams.models.SequenceNumberRange]]("SequenceNumberRange")).mapN(org.lyranthe.araethura.dynamodbstreams.models.Shard.apply _)
  }
  final implicit val StreamDescriptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.StreamDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("StreamStatus"), o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[java.lang.String]]("StreamLabel"), o.get[scala.Option[java.lang.String]]("StreamArn"), o.get[scala.Option[java.lang.String]]("StreamViewType"), o.get[scala.Option[java.lang.String]]("LastEvaluatedShardId"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dynamodbstreams.models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[scala.List[org.lyranthe.araethura.dynamodbstreams.models.Shard]]]("Shards"), o.get[scala.Option[java.time.Instant]]("CreationRequestDateTime")).mapN(org.lyranthe.araethura.dynamodbstreams.models.StreamDescription.apply _)
  }
  final implicit val TrimmedDataAccessExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.TrimmedDataAccessException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dynamodbstreams.models.TrimmedDataAccessException.apply _)
  }
  final implicit val GetRecordsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.GetRecordsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dynamodbstreams.models.Record]]]("Records"), o.get[scala.Option[java.lang.String]]("NextShardIterator")).mapN(org.lyranthe.araethura.dynamodbstreams.models.GetRecordsOutput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dynamodbstreams.models.ResourceNotFoundException.apply _)
  }
  final implicit val DescribeStreamOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.dynamodbstreams.models.StreamDescription]]("StreamDescription").map(org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamOutput.apply _)
  }
  final implicit val GetShardIteratorInputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("StreamArn"), o.get[java.lang.String]("ShardId"), o.get[java.lang.String]("ShardIteratorType"), o.get[scala.Option[java.lang.String]]("SequenceNumber")).mapN(org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorInput.apply _)
  }
  final implicit val ListStreamsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.ListStreamsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.dynamodbstreams.models.Stream]]]("Streams"), o.get[scala.Option[java.lang.String]]("LastEvaluatedStreamArn")).mapN(org.lyranthe.araethura.dynamodbstreams.models.ListStreamsOutput.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.InternalServerError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dynamodbstreams.models.InternalServerError.apply _)
  }
  final implicit val ExpiredIteratorExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.dynamodbstreams.models.ExpiredIteratorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.dynamodbstreams.models.ExpiredIteratorException.apply _)
  }
}