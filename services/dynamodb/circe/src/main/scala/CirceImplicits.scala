package org.lyranthe.araethura.dynamodb
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val TableDescriptionEncoder: io.circe.Encoder[models.TableDescription] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "TableSizeBytes" -> o.tableSizeBytes.asJson, "ItemCount" -> o.itemCount.asJson, "TableArn" -> o.tableArn.asJson, "LatestStreamLabel" -> o.latestStreamLabel.asJson, "LocalSecondaryIndexes" -> o.localSecondaryIndexes.asJson, "GlobalSecondaryIndexes" -> o.globalSecondaryIndexes.asJson, "LatestStreamArn" -> o.latestStreamArn.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson, "TableStatus" -> o.tableStatus.asJson, "AttributeDefinitions" -> o.attributeDefinitions.asJson, "KeySchema" -> o.keySchema.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "StreamSpecification" -> o.streamSpecification.asJson)
  }
  final implicit val ListTagsOfResourceInputEncoder: io.circe.Encoder[models.ListTagsOfResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ProvisionedThroughputEncoder: io.circe.Encoder[models.ProvisionedThroughput] = io.circe.Encoder.instance { o => 
    Json.obj("ReadCapacityUnits" -> o.readCapacityUnits.asJson, "WriteCapacityUnits" -> o.writeCapacityUnits.asJson)
  }
  final implicit val GlobalSecondaryIndexEncoder: io.circe.Encoder[models.GlobalSecondaryIndex] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson)
  }
  final implicit val ScanInputEncoder: io.circe.Encoder[models.ScanInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Limit" -> o.limit.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConsistentRead" -> o.consistentRead.asJson, "FilterExpression" -> o.filterExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "Select" -> o.select.asJson, "TotalSegments" -> o.totalSegments.asJson, "IndexName" -> o.indexName.asJson, "ExclusiveStartKey" -> o.exclusiveStartKey.asJson, "ScanFilter" -> o.scanFilter.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "Segment" -> o.segment.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val TagResourceInputEncoder: io.circe.Encoder[models.TagResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val DeleteTableOutputEncoder: io.circe.Encoder[models.DeleteTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableDescription" -> o.tableDescription.asJson)
  }
  final implicit val QueryInputEncoder: io.circe.Encoder[models.QueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "KeyConditionExpression" -> o.keyConditionExpression.asJson, "Limit" -> o.limit.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConsistentRead" -> o.consistentRead.asJson, "FilterExpression" -> o.filterExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "Select" -> o.select.asJson, "IndexName" -> o.indexName.asJson, "ExclusiveStartKey" -> o.exclusiveStartKey.asJson, "ScanIndexForward" -> o.scanIndexForward.asJson, "QueryFilter" -> o.queryFilter.asJson, "KeyConditions" -> o.keyConditions.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val ExpectedAttributeValueEncoder: io.circe.Encoder[models.ExpectedAttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Exists" -> o.exists.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "AttributeValueList" -> o.attributeValueList.asJson)
  }
  final implicit val ListTagsOfResourceOutputEncoder: io.circe.Encoder[models.ListTagsOfResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTableInputEncoder: io.circe.Encoder[models.DescribeTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson)
  }
  final implicit val ListTablesInputEncoder: io.circe.Encoder[models.ListTablesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ExclusiveStartTableName" -> o.exclusiveStartTableName.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeTimeToLiveInputEncoder: io.circe.Encoder[models.DescribeTimeToLiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson)
  }
  final implicit val ItemCollectionMetricsEncoder: io.circe.Encoder[models.ItemCollectionMetrics] = io.circe.Encoder.instance { o => 
    Json.obj("ItemCollectionKey" -> o.itemCollectionKey.asJson, "SizeEstimateRangeGB" -> o.sizeEstimateRangeGB.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LocalSecondaryIndexDescriptionEncoder: io.circe.Encoder[models.LocalSecondaryIndexDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IndexSizeBytes" -> o.indexSizeBytes.asJson, "ItemCount" -> o.itemCount.asJson, "IndexArn" -> o.indexArn.asJson, "IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson)
  }
  final implicit val WriteRequestEncoder: io.circe.Encoder[models.WriteRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PutRequest" -> o.putRequest.asJson, "DeleteRequest" -> o.deleteRequest.asJson)
  }
  final implicit val KeySchemaElementEncoder: io.circe.Encoder[models.KeySchemaElement] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeName" -> o.attributeName.asJson, "KeyType" -> o.keyType.asJson)
  }
  final implicit val DeleteItemInputEncoder: io.circe.Encoder[models.DeleteItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Key" -> o.key.asJson, "Expected" -> o.expected.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConditionExpression" -> o.conditionExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson, "ReturnValues" -> o.returnValues.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val CreateGlobalSecondaryIndexActionEncoder: io.circe.Encoder[models.CreateGlobalSecondaryIndexAction] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson)
  }
  final implicit val ProvisionedThroughputDescriptionEncoder: io.circe.Encoder[models.ProvisionedThroughputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("LastIncreaseDateTime" -> o.lastIncreaseDateTime.asJson, "LastDecreaseDateTime" -> o.lastDecreaseDateTime.asJson, "NumberOfDecreasesToday" -> o.numberOfDecreasesToday.asJson, "ReadCapacityUnits" -> o.readCapacityUnits.asJson, "WriteCapacityUnits" -> o.writeCapacityUnits.asJson)
  }
  final implicit val AttributeDefinitionEncoder: io.circe.Encoder[models.AttributeDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeName" -> o.attributeName.asJson, "AttributeType" -> o.attributeType.asJson)
  }
  final implicit val ConditionalCheckFailedExceptionEncoder: io.circe.Encoder[models.ConditionalCheckFailedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeLimitsOutputEncoder: io.circe.Encoder[models.DescribeLimitsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("AccountMaxReadCapacityUnits" -> o.accountMaxReadCapacityUnits.asJson, "AccountMaxWriteCapacityUnits" -> o.accountMaxWriteCapacityUnits.asJson, "TableMaxReadCapacityUnits" -> o.tableMaxReadCapacityUnits.asJson, "TableMaxWriteCapacityUnits" -> o.tableMaxWriteCapacityUnits.asJson)
  }
  final implicit val ListTablesOutputEncoder: io.circe.Encoder[models.ListTablesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableNames" -> o.tableNames.asJson, "LastEvaluatedTableName" -> o.lastEvaluatedTableName.asJson)
  }
  final implicit val LocalSecondaryIndexEncoder: io.circe.Encoder[models.LocalSecondaryIndex] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson)
  }
  final implicit val UpdateItemOutputEncoder: io.circe.Encoder[models.UpdateItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson)
  }
  final implicit val DeleteRequestEncoder: io.circe.Encoder[models.DeleteRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson)
  }
  final implicit val BatchGetItemInputEncoder: io.circe.Encoder[models.BatchGetItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("RequestItems" -> o.requestItems.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson)
  }
  final implicit val UpdateTimeToLiveOutputEncoder: io.circe.Encoder[models.UpdateTimeToLiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TimeToLiveSpecification" -> o.timeToLiveSpecification.asJson)
  }
  final implicit val QueryOutputEncoder: io.circe.Encoder[models.QueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Items" -> o.items.asJson, "Count" -> o.count.asJson, "ScannedCount" -> o.scannedCount.asJson, "LastEvaluatedKey" -> o.lastEvaluatedKey.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val PutRequestEncoder: io.circe.Encoder[models.PutRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Item" -> o.item.asJson)
  }
  final implicit val CreateTableInputEncoder: io.circe.Encoder[models.CreateTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionedThroughput" -> o.provisionedThroughput.asJson, "TableName" -> o.tableName.asJson, "AttributeDefinitions" -> o.attributeDefinitions.asJson, "KeySchema" -> o.keySchema.asJson, "GlobalSecondaryIndexes" -> o.globalSecondaryIndexes.asJson, "LocalSecondaryIndexes" -> o.localSecondaryIndexes.asJson, "StreamSpecification" -> o.streamSpecification.asJson)
  }
  final implicit val DescribeLimitsInputEncoder: io.circe.Encoder[models.DescribeLimitsInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GlobalSecondaryIndexUpdateEncoder: io.circe.Encoder[models.GlobalSecondaryIndexUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("Update" -> o.update.asJson, "Create" -> o.create.asJson, "Delete" -> o.delete.asJson)
  }
  final implicit val KeysAndAttributesEncoder: io.circe.Encoder[models.KeysAndAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("Keys" -> o.keys.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ConsistentRead" -> o.consistentRead.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson)
  }
  final implicit val ConditionEncoder: io.circe.Encoder[models.Condition] = io.circe.Encoder.instance { o => 
    Json.obj("ComparisonOperator" -> o.comparisonOperator.asJson, "AttributeValueList" -> o.attributeValueList.asJson)
  }
  final implicit val PutItemInputEncoder: io.circe.Encoder[models.PutItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("Item" -> o.item.asJson, "TableName" -> o.tableName.asJson, "Expected" -> o.expected.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConditionExpression" -> o.conditionExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson, "ReturnValues" -> o.returnValues.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val ProvisionedThroughputExceededExceptionEncoder: io.circe.Encoder[models.ProvisionedThroughputExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateTableOutputEncoder: io.circe.Encoder[models.UpdateTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableDescription" -> o.tableDescription.asJson)
  }
  final implicit val BatchWriteItemOutputEncoder: io.circe.Encoder[models.BatchWriteItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("UnprocessedItems" -> o.unprocessedItems.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val DescribeTimeToLiveOutputEncoder: io.circe.Encoder[models.DescribeTimeToLiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TimeToLiveDescription" -> o.timeToLiveDescription.asJson)
  }
  final implicit val DeleteItemOutputEncoder: io.circe.Encoder[models.DeleteItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson)
  }
  final implicit val GlobalSecondaryIndexDescriptionEncoder: io.circe.Encoder[models.GlobalSecondaryIndexDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IndexSizeBytes" -> o.indexSizeBytes.asJson, "ItemCount" -> o.itemCount.asJson, "IndexArn" -> o.indexArn.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson, "IndexName" -> o.indexName.asJson, "Backfilling" -> o.backfilling.asJson, "IndexStatus" -> o.indexStatus.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson)
  }
  final implicit val UpdateTableInputEncoder: io.circe.Encoder[models.UpdateTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "GlobalSecondaryIndexUpdates" -> o.globalSecondaryIndexUpdates.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson, "AttributeDefinitions" -> o.attributeDefinitions.asJson, "StreamSpecification" -> o.streamSpecification.asJson)
  }
  final implicit val TimeToLiveSpecificationEncoder: io.circe.Encoder[models.TimeToLiveSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("Enabled" -> o.enabled.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val ProjectionEncoder: io.circe.Encoder[models.Projection] = io.circe.Encoder.instance { o => 
    Json.obj("ProjectionType" -> o.projectionType.asJson, "NonKeyAttributes" -> o.nonKeyAttributes.asJson)
  }
  final implicit val UpdateGlobalSecondaryIndexActionEncoder: io.circe.Encoder[models.UpdateGlobalSecondaryIndexAction] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson)
  }
  final implicit val PutItemOutputEncoder: io.circe.Encoder[models.PutItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson)
  }
  final implicit val DeleteTableInputEncoder: io.circe.Encoder[models.DeleteTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson)
  }
  final implicit val ScanOutputEncoder: io.circe.Encoder[models.ScanOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Items" -> o.items.asJson, "Count" -> o.count.asJson, "ScannedCount" -> o.scannedCount.asJson, "LastEvaluatedKey" -> o.lastEvaluatedKey.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val CreateTableOutputEncoder: io.circe.Encoder[models.CreateTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableDescription" -> o.tableDescription.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val BatchWriteItemInputEncoder: io.circe.Encoder[models.BatchWriteItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("RequestItems" -> o.requestItems.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson)
  }
  final implicit val UpdateTimeToLiveInputEncoder: io.circe.Encoder[models.UpdateTimeToLiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "TimeToLiveSpecification" -> o.timeToLiveSpecification.asJson)
  }
  final implicit val GetItemInputEncoder: io.circe.Encoder[models.GetItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Key" -> o.key.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ConsistentRead" -> o.consistentRead.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ConsumedCapacityEncoder: io.circe.Encoder[models.ConsumedCapacity] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "CapacityUnits" -> o.capacityUnits.asJson, "Table" -> o.table.asJson, "LocalSecondaryIndexes" -> o.localSecondaryIndexes.asJson, "GlobalSecondaryIndexes" -> o.globalSecondaryIndexes.asJson)
  }
  final implicit val DescribeTableOutputEncoder: io.circe.Encoder[models.DescribeTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Table" -> o.table.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttributeValueUpdateEncoder: io.circe.Encoder[models.AttributeValueUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Action" -> o.action.asJson)
  }
  final implicit val DeleteGlobalSecondaryIndexActionEncoder: io.circe.Encoder[models.DeleteGlobalSecondaryIndexAction] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TimeToLiveDescriptionEncoder: io.circe.Encoder[models.TimeToLiveDescription] = io.circe.Encoder.instance { o => 
    Json.obj("TimeToLiveStatus" -> o.timeToLiveStatus.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val UpdateItemInputEncoder: io.circe.Encoder[models.UpdateItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Key" -> o.key.asJson, "Expected" -> o.expected.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConditionExpression" -> o.conditionExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "UpdateExpression" -> o.updateExpression.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson, "ReturnValues" -> o.returnValues.asJson, "AttributeUpdates" -> o.attributeUpdates.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val StreamSpecificationEncoder: io.circe.Encoder[models.StreamSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("StreamEnabled" -> o.streamEnabled.asJson, "StreamViewType" -> o.streamViewType.asJson)
  }
  final implicit val GetItemOutputEncoder: io.circe.Encoder[models.GetItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Item" -> o.item.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val ItemCollectionSizeLimitExceededExceptionEncoder: io.circe.Encoder[models.ItemCollectionSizeLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CapacityEncoder: io.circe.Encoder[models.Capacity] = io.circe.Encoder.instance { o => 
    Json.obj("CapacityUnits" -> o.capacityUnits.asJson)
  }
  final implicit val BatchGetItemOutputEncoder: io.circe.Encoder[models.BatchGetItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Responses" -> o.responses.asJson, "UnprocessedKeys" -> o.unprocessedKeys.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val UntagResourceInputEncoder: io.circe.Encoder[models.UntagResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val AttributeValueEncoder: io.circe.Encoder[models.AttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("BS" -> o.bs.asJson, "SS" -> o.ss.asJson, "M" -> o.m.asJson, "NULL" -> o.`null`.asJson, "B" -> o.b.asJson, "S" -> o.s.asJson, "N" -> o.n.asJson, "NS" -> o.ns.asJson, "BOOL" -> o.bool.asJson, "L" -> o.l.asJson)
  }
  final implicit val TableDescriptionDecoder: io.circe.Decoder[models.TableDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[scala.Long]]("TableSizeBytes"), o.get[scala.Option[scala.Long]]("ItemCount"), o.get[scala.Option[java.lang.String]]("TableArn"), o.get[scala.Option[java.lang.String]]("LatestStreamLabel"), o.get[scala.Option[scala.List[models.LocalSecondaryIndexDescription]]]("LocalSecondaryIndexes"), o.get[scala.Option[scala.List[models.GlobalSecondaryIndexDescription]]]("GlobalSecondaryIndexes"), o.get[scala.Option[java.lang.String]]("LatestStreamArn"), o.get[scala.Option[models.ProvisionedThroughputDescription]]("ProvisionedThroughput"), o.get[scala.Option[java.lang.String]]("TableStatus"), o.get[scala.Option[scala.List[models.AttributeDefinition]]]("AttributeDefinitions"), o.get[scala.Option[scala.List[models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[models.StreamSpecification]]("StreamSpecification")).mapN(models.TableDescription.apply _)
  }
  final implicit val ListTagsOfResourceInputDecoder: io.circe.Decoder[models.ListTagsOfResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsOfResourceInput.apply _)
  }
  final implicit val ProvisionedThroughputDecoder: io.circe.Decoder[models.ProvisionedThroughput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("ReadCapacityUnits"), o.get[scala.Long]("WriteCapacityUnits")).mapN(models.ProvisionedThroughput.apply _)
  }
  final implicit val GlobalSecondaryIndexDecoder: io.circe.Decoder[models.GlobalSecondaryIndex] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[scala.List[models.KeySchemaElement]]("KeySchema"), o.get[models.Projection]("Projection"), o.get[models.ProvisionedThroughput]("ProvisionedThroughput")).mapN(models.GlobalSecondaryIndex.apply _)
  }
  final implicit val ScanInputDecoder: io.circe.Decoder[models.ScanInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[java.lang.String]]("FilterExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("Select"), o.get[scala.Option[scala.Int]]("TotalSegments"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExclusiveStartKey"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.Condition]]]("ScanFilter"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.Int]]("Segment"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(models.ScanInput.apply _)
  }
  final implicit val TagResourceInputDecoder: io.circe.Decoder[models.TagResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.TagResourceInput.apply _)
  }
  final implicit val DeleteTableOutputDecoder: io.circe.Decoder[models.DeleteTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TableDescription]]("TableDescription").map(models.DeleteTableOutput.apply _)
  }
  final implicit val QueryInputDecoder: io.circe.Decoder[models.QueryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.Option[java.lang.String]]("KeyConditionExpression"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[java.lang.String]]("FilterExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("Select"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExclusiveStartKey"), o.get[scala.Option[scala.Boolean]]("ScanIndexForward"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.Condition]]]("QueryFilter"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.Condition]]]("KeyConditions"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(models.QueryInput.apply _)
  }
  final implicit val ExpectedAttributeValueDecoder: io.circe.Decoder[models.ExpectedAttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.AttributeValue]]("Value"), o.get[scala.Option[scala.Boolean]]("Exists"), o.get[scala.Option[java.lang.String]]("ComparisonOperator"), o.get[scala.Option[scala.List[models.AttributeValue]]]("AttributeValueList")).mapN(models.ExpectedAttributeValue.apply _)
  }
  final implicit val ListTagsOfResourceOutputDecoder: io.circe.Decoder[models.ListTagsOfResourceOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTagsOfResourceOutput.apply _)
  }
  final implicit val DescribeTableInputDecoder: io.circe.Decoder[models.DescribeTableInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TableName").map(models.DescribeTableInput.apply _)
  }
  final implicit val ListTablesInputDecoder: io.circe.Decoder[models.ListTablesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ExclusiveStartTableName"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListTablesInput.apply _)
  }
  final implicit val DescribeTimeToLiveInputDecoder: io.circe.Decoder[models.DescribeTimeToLiveInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TableName").map(models.DescribeTimeToLiveInput.apply _)
  }
  final implicit val ItemCollectionMetricsDecoder: io.circe.Decoder[models.ItemCollectionMetrics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ItemCollectionKey"), o.get[scala.Option[scala.List[scala.Double]]]("SizeEstimateRangeGB")).mapN(models.ItemCollectionMetrics.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceInUseException.apply _)
  }
  final implicit val LocalSecondaryIndexDescriptionDecoder: io.circe.Decoder[models.LocalSecondaryIndexDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("IndexSizeBytes"), o.get[scala.Option[scala.Long]]("ItemCount"), o.get[scala.Option[java.lang.String]]("IndexArn"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.List[models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[models.Projection]]("Projection")).mapN(models.LocalSecondaryIndexDescription.apply _)
  }
  final implicit val WriteRequestDecoder: io.circe.Decoder[models.WriteRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.PutRequest]]("PutRequest"), o.get[scala.Option[models.DeleteRequest]]("DeleteRequest")).mapN(models.WriteRequest.apply _)
  }
  final implicit val KeySchemaElementDecoder: io.circe.Decoder[models.KeySchemaElement] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("KeyType")).mapN(models.KeySchemaElement.apply _)
  }
  final implicit val DeleteItemInputDecoder: io.circe.Decoder[models.DeleteItemInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]("Key"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.ExpectedAttributeValue]]]("Expected"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[java.lang.String]]("ConditionExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics"), o.get[scala.Option[java.lang.String]]("ReturnValues"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(models.DeleteItemInput.apply _)
  }
  final implicit val CreateGlobalSecondaryIndexActionDecoder: io.circe.Decoder[models.CreateGlobalSecondaryIndexAction] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[scala.List[models.KeySchemaElement]]("KeySchema"), o.get[models.Projection]("Projection"), o.get[models.ProvisionedThroughput]("ProvisionedThroughput")).mapN(models.CreateGlobalSecondaryIndexAction.apply _)
  }
  final implicit val ProvisionedThroughputDescriptionDecoder: io.circe.Decoder[models.ProvisionedThroughputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastIncreaseDateTime"), o.get[scala.Option[java.time.Instant]]("LastDecreaseDateTime"), o.get[scala.Option[scala.Long]]("NumberOfDecreasesToday"), o.get[scala.Option[scala.Long]]("ReadCapacityUnits"), o.get[scala.Option[scala.Long]]("WriteCapacityUnits")).mapN(models.ProvisionedThroughputDescription.apply _)
  }
  final implicit val AttributeDefinitionDecoder: io.circe.Decoder[models.AttributeDefinition] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("AttributeType")).mapN(models.AttributeDefinition.apply _)
  }
  final implicit val ConditionalCheckFailedExceptionDecoder: io.circe.Decoder[models.ConditionalCheckFailedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ConditionalCheckFailedException.apply _)
  }
  final implicit val DescribeLimitsOutputDecoder: io.circe.Decoder[models.DescribeLimitsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("AccountMaxReadCapacityUnits"), o.get[scala.Option[scala.Long]]("AccountMaxWriteCapacityUnits"), o.get[scala.Option[scala.Long]]("TableMaxReadCapacityUnits"), o.get[scala.Option[scala.Long]]("TableMaxWriteCapacityUnits")).mapN(models.DescribeLimitsOutput.apply _)
  }
  final implicit val ListTablesOutputDecoder: io.circe.Decoder[models.ListTablesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("TableNames"), o.get[scala.Option[java.lang.String]]("LastEvaluatedTableName")).mapN(models.ListTablesOutput.apply _)
  }
  final implicit val LocalSecondaryIndexDecoder: io.circe.Decoder[models.LocalSecondaryIndex] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[scala.List[models.KeySchemaElement]]("KeySchema"), o.get[models.Projection]("Projection")).mapN(models.LocalSecondaryIndex.apply _)
  }
  final implicit val UpdateItemOutputDecoder: io.circe.Decoder[models.UpdateItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("Attributes"), o.get[scala.Option[models.ConsumedCapacity]]("ConsumedCapacity"), o.get[scala.Option[models.ItemCollectionMetrics]]("ItemCollectionMetrics")).mapN(models.UpdateItemOutput.apply _)
  }
  final implicit val DeleteRequestDecoder: io.circe.Decoder[models.DeleteRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]("Key").map(models.DeleteRequest.apply _)
  }
  final implicit val BatchGetItemInputDecoder: io.circe.Decoder[models.BatchGetItemInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, models.KeysAndAttributes]]("RequestItems"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity")).mapN(models.BatchGetItemInput.apply _)
  }
  final implicit val UpdateTimeToLiveOutputDecoder: io.circe.Decoder[models.UpdateTimeToLiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TimeToLiveSpecification]]("TimeToLiveSpecification").map(models.UpdateTimeToLiveOutput.apply _)
  }
  final implicit val QueryOutputDecoder: io.circe.Decoder[models.QueryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]]("Items"), o.get[scala.Option[scala.Int]]("Count"), o.get[scala.Option[scala.Int]]("ScannedCount"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("LastEvaluatedKey"), o.get[scala.Option[models.ConsumedCapacity]]("ConsumedCapacity")).mapN(models.QueryOutput.apply _)
  }
  final implicit val PutRequestDecoder: io.circe.Decoder[models.PutRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]("Item").map(models.PutRequest.apply _)
  }
  final implicit val CreateTableInputDecoder: io.circe.Decoder[models.CreateTableInput] = io.circe.Decoder.instance { o => 
    (o.get[models.ProvisionedThroughput]("ProvisionedThroughput"), o.get[java.lang.String]("TableName"), o.get[scala.List[models.AttributeDefinition]]("AttributeDefinitions"), o.get[scala.List[models.KeySchemaElement]]("KeySchema"), o.get[scala.Option[scala.List[models.GlobalSecondaryIndex]]]("GlobalSecondaryIndexes"), o.get[scala.Option[scala.List[models.LocalSecondaryIndex]]]("LocalSecondaryIndexes"), o.get[scala.Option[models.StreamSpecification]]("StreamSpecification")).mapN(models.CreateTableInput.apply _)
  }
  final implicit val DescribeLimitsInputDecoder: io.circe.Decoder[models.DescribeLimitsInput.type] = io.circe.Decoder.decodeUnit.as(models.DescribeLimitsInput)
  final implicit val GlobalSecondaryIndexUpdateDecoder: io.circe.Decoder[models.GlobalSecondaryIndexUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.UpdateGlobalSecondaryIndexAction]]("Update"), o.get[scala.Option[models.CreateGlobalSecondaryIndexAction]]("Create"), o.get[scala.Option[models.DeleteGlobalSecondaryIndexAction]]("Delete")).mapN(models.GlobalSecondaryIndexUpdate.apply _)
  }
  final implicit val KeysAndAttributesDecoder: io.circe.Decoder[models.KeysAndAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("Keys"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames")).mapN(models.KeysAndAttributes.apply _)
  }
  final implicit val ConditionDecoder: io.circe.Decoder[models.Condition] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Option[scala.List[models.AttributeValue]]]("AttributeValueList")).mapN(models.Condition.apply _)
  }
  final implicit val PutItemInputDecoder: io.circe.Decoder[models.PutItemInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]("Item"), o.get[java.lang.String]("TableName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.ExpectedAttributeValue]]]("Expected"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[java.lang.String]]("ConditionExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics"), o.get[scala.Option[java.lang.String]]("ReturnValues"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(models.PutItemInput.apply _)
  }
  final implicit val ProvisionedThroughputExceededExceptionDecoder: io.circe.Decoder[models.ProvisionedThroughputExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ProvisionedThroughputExceededException.apply _)
  }
  final implicit val UpdateTableOutputDecoder: io.circe.Decoder[models.UpdateTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TableDescription]]("TableDescription").map(models.UpdateTableOutput.apply _)
  }
  final implicit val BatchWriteItemOutputDecoder: io.circe.Decoder[models.BatchWriteItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[models.WriteRequest]]]]("UnprocessedItems"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[models.ItemCollectionMetrics]]]]("ItemCollectionMetrics"), o.get[scala.Option[scala.List[models.ConsumedCapacity]]]("ConsumedCapacity")).mapN(models.BatchWriteItemOutput.apply _)
  }
  final implicit val DescribeTimeToLiveOutputDecoder: io.circe.Decoder[models.DescribeTimeToLiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TimeToLiveDescription]]("TimeToLiveDescription").map(models.DescribeTimeToLiveOutput.apply _)
  }
  final implicit val DeleteItemOutputDecoder: io.circe.Decoder[models.DeleteItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("Attributes"), o.get[scala.Option[models.ConsumedCapacity]]("ConsumedCapacity"), o.get[scala.Option[models.ItemCollectionMetrics]]("ItemCollectionMetrics")).mapN(models.DeleteItemOutput.apply _)
  }
  final implicit val GlobalSecondaryIndexDescriptionDecoder: io.circe.Decoder[models.GlobalSecondaryIndexDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("IndexSizeBytes"), o.get[scala.Option[scala.Long]]("ItemCount"), o.get[scala.Option[java.lang.String]]("IndexArn"), o.get[scala.Option[models.ProvisionedThroughputDescription]]("ProvisionedThroughput"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.Boolean]]("Backfilling"), o.get[scala.Option[java.lang.String]]("IndexStatus"), o.get[scala.Option[scala.List[models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[models.Projection]]("Projection")).mapN(models.GlobalSecondaryIndexDescription.apply _)
  }
  final implicit val UpdateTableInputDecoder: io.circe.Decoder[models.UpdateTableInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.Option[scala.List[models.GlobalSecondaryIndexUpdate]]]("GlobalSecondaryIndexUpdates"), o.get[scala.Option[models.ProvisionedThroughput]]("ProvisionedThroughput"), o.get[scala.Option[scala.List[models.AttributeDefinition]]]("AttributeDefinitions"), o.get[scala.Option[models.StreamSpecification]]("StreamSpecification")).mapN(models.UpdateTableInput.apply _)
  }
  final implicit val TimeToLiveSpecificationDecoder: io.circe.Decoder[models.TimeToLiveSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("Enabled"), o.get[java.lang.String]("AttributeName")).mapN(models.TimeToLiveSpecification.apply _)
  }
  final implicit val ProjectionDecoder: io.circe.Decoder[models.Projection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProjectionType"), o.get[scala.Option[scala.List[java.lang.String]]]("NonKeyAttributes")).mapN(models.Projection.apply _)
  }
  final implicit val UpdateGlobalSecondaryIndexActionDecoder: io.circe.Decoder[models.UpdateGlobalSecondaryIndexAction] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[models.ProvisionedThroughput]("ProvisionedThroughput")).mapN(models.UpdateGlobalSecondaryIndexAction.apply _)
  }
  final implicit val PutItemOutputDecoder: io.circe.Decoder[models.PutItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("Attributes"), o.get[scala.Option[models.ConsumedCapacity]]("ConsumedCapacity"), o.get[scala.Option[models.ItemCollectionMetrics]]("ItemCollectionMetrics")).mapN(models.PutItemOutput.apply _)
  }
  final implicit val DeleteTableInputDecoder: io.circe.Decoder[models.DeleteTableInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TableName").map(models.DeleteTableInput.apply _)
  }
  final implicit val ScanOutputDecoder: io.circe.Decoder[models.ScanOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]]("Items"), o.get[scala.Option[scala.Int]]("Count"), o.get[scala.Option[scala.Int]]("ScannedCount"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("LastEvaluatedKey"), o.get[scala.Option[models.ConsumedCapacity]]("ConsumedCapacity")).mapN(models.ScanOutput.apply _)
  }
  final implicit val CreateTableOutputDecoder: io.circe.Decoder[models.CreateTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TableDescription]]("TableDescription").map(models.CreateTableOutput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val BatchWriteItemInputDecoder: io.circe.Decoder[models.BatchWriteItemInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, scala.List[models.WriteRequest]]]("RequestItems"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics")).mapN(models.BatchWriteItemInput.apply _)
  }
  final implicit val UpdateTimeToLiveInputDecoder: io.circe.Decoder[models.UpdateTimeToLiveInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[models.TimeToLiveSpecification]("TimeToLiveSpecification")).mapN(models.UpdateTimeToLiveInput.apply _)
  }
  final implicit val GetItemInputDecoder: io.circe.Decoder[models.GetItemInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]("Key"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames")).mapN(models.GetItemInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val ConsumedCapacityDecoder: io.circe.Decoder[models.ConsumedCapacity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[scala.Double]]("CapacityUnits"), o.get[scala.Option[models.Capacity]]("Table"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.Capacity]]]("LocalSecondaryIndexes"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.Capacity]]]("GlobalSecondaryIndexes")).mapN(models.ConsumedCapacity.apply _)
  }
  final implicit val DescribeTableOutputDecoder: io.circe.Decoder[models.DescribeTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.TableDescription]]("Table").map(models.DescribeTableOutput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LimitExceededException.apply _)
  }
  final implicit val AttributeValueUpdateDecoder: io.circe.Decoder[models.AttributeValueUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.AttributeValue]]("Value"), o.get[scala.Option[java.lang.String]]("Action")).mapN(models.AttributeValueUpdate.apply _)
  }
  final implicit val DeleteGlobalSecondaryIndexActionDecoder: io.circe.Decoder[models.DeleteGlobalSecondaryIndexAction] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IndexName").map(models.DeleteGlobalSecondaryIndexAction.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[models.InternalServerError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalServerError.apply _)
  }
  final implicit val TimeToLiveDescriptionDecoder: io.circe.Decoder[models.TimeToLiveDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TimeToLiveStatus"), o.get[scala.Option[java.lang.String]]("AttributeName")).mapN(models.TimeToLiveDescription.apply _)
  }
  final implicit val UpdateItemInputDecoder: io.circe.Decoder[models.UpdateItemInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]("Key"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.ExpectedAttributeValue]]]("Expected"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[java.lang.String]]("ConditionExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("UpdateExpression"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics"), o.get[scala.Option[java.lang.String]]("ReturnValues"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValueUpdate]]]("AttributeUpdates"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(models.UpdateItemInput.apply _)
  }
  final implicit val StreamSpecificationDecoder: io.circe.Decoder[models.StreamSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("StreamEnabled"), o.get[scala.Option[java.lang.String]]("StreamViewType")).mapN(models.StreamSpecification.apply _)
  }
  final implicit val GetItemOutputDecoder: io.circe.Decoder[models.GetItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("Item"), o.get[scala.Option[models.ConsumedCapacity]]("ConsumedCapacity")).mapN(models.GetItemOutput.apply _)
  }
  final implicit val ItemCollectionSizeLimitExceededExceptionDecoder: io.circe.Decoder[models.ItemCollectionSizeLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ItemCollectionSizeLimitExceededException.apply _)
  }
  final implicit val CapacityDecoder: io.circe.Decoder[models.Capacity] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Double]]("CapacityUnits").map(models.Capacity.apply _)
  }
  final implicit val BatchGetItemOutputDecoder: io.circe.Decoder[models.BatchGetItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]]]("Responses"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.KeysAndAttributes]]]("UnprocessedKeys"), o.get[scala.Option[scala.List[models.ConsumedCapacity]]]("ConsumedCapacity")).mapN(models.BatchGetItemOutput.apply _)
  }
  final implicit val UntagResourceInputDecoder: io.circe.Decoder[models.UntagResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.UntagResourceInput.apply _)
  }
  final implicit val AttributeValueDecoder: io.circe.Decoder[models.AttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.Array[scala.Byte]]]]("BS"), o.get[scala.Option[scala.List[java.lang.String]]]("SS"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.AttributeValue]]]("M"), o.get[scala.Option[scala.Boolean]]("NULL"), o.get[scala.Option[scala.Array[scala.Byte]]]("B"), o.get[scala.Option[java.lang.String]]("S"), o.get[scala.Option[java.lang.String]]("N"), o.get[scala.Option[scala.List[java.lang.String]]]("NS"), o.get[scala.Option[scala.Boolean]]("BOOL"), o.get[scala.Option[scala.List[models.AttributeValue]]]("L")).mapN(models.AttributeValue.apply _)
  }
}