package avias.dynamodb
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val TableDescriptionEncoder: io.circe.Encoder[avias.dynamodb.models.TableDescription] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "TableSizeBytes" -> o.tableSizeBytes.asJson, "ItemCount" -> o.itemCount.asJson, "TableArn" -> o.tableArn.asJson, "LatestStreamLabel" -> o.latestStreamLabel.asJson, "LocalSecondaryIndexes" -> o.localSecondaryIndexes.asJson, "GlobalSecondaryIndexes" -> o.globalSecondaryIndexes.asJson, "LatestStreamArn" -> o.latestStreamArn.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson, "TableStatus" -> o.tableStatus.asJson, "AttributeDefinitions" -> o.attributeDefinitions.asJson, "KeySchema" -> o.keySchema.asJson, "CreationDateTime" -> o.creationDateTime.asJson, "StreamSpecification" -> o.streamSpecification.asJson)
  }
  final implicit val ListTagsOfResourceInputEncoder: io.circe.Encoder[avias.dynamodb.models.ListTagsOfResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ProvisionedThroughputEncoder: io.circe.Encoder[avias.dynamodb.models.ProvisionedThroughput] = io.circe.Encoder.instance { o => 
    Json.obj("ReadCapacityUnits" -> o.readCapacityUnits.asJson, "WriteCapacityUnits" -> o.writeCapacityUnits.asJson)
  }
  final implicit val GlobalSecondaryIndexEncoder: io.circe.Encoder[avias.dynamodb.models.GlobalSecondaryIndex] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson)
  }
  final implicit val ScanInputEncoder: io.circe.Encoder[avias.dynamodb.models.ScanInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Limit" -> o.limit.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConsistentRead" -> o.consistentRead.asJson, "FilterExpression" -> o.filterExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "Select" -> o.select.asJson, "TotalSegments" -> o.totalSegments.asJson, "IndexName" -> o.indexName.asJson, "ExclusiveStartKey" -> o.exclusiveStartKey.asJson, "ScanFilter" -> o.scanFilter.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "Segment" -> o.segment.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val TagResourceInputEncoder: io.circe.Encoder[avias.dynamodb.models.TagResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val DeleteTableOutputEncoder: io.circe.Encoder[avias.dynamodb.models.DeleteTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableDescription" -> o.tableDescription.asJson)
  }
  final implicit val QueryInputEncoder: io.circe.Encoder[avias.dynamodb.models.QueryInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "KeyConditionExpression" -> o.keyConditionExpression.asJson, "Limit" -> o.limit.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConsistentRead" -> o.consistentRead.asJson, "FilterExpression" -> o.filterExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "Select" -> o.select.asJson, "IndexName" -> o.indexName.asJson, "ExclusiveStartKey" -> o.exclusiveStartKey.asJson, "ScanIndexForward" -> o.scanIndexForward.asJson, "QueryFilter" -> o.queryFilter.asJson, "KeyConditions" -> o.keyConditions.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val ExpectedAttributeValueEncoder: io.circe.Encoder[avias.dynamodb.models.ExpectedAttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Exists" -> o.exists.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "AttributeValueList" -> o.attributeValueList.asJson)
  }
  final implicit val ListTagsOfResourceOutputEncoder: io.circe.Encoder[avias.dynamodb.models.ListTagsOfResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeTableInputEncoder: io.circe.Encoder[avias.dynamodb.models.DescribeTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson)
  }
  final implicit val ListTablesInputEncoder: io.circe.Encoder[avias.dynamodb.models.ListTablesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ExclusiveStartTableName" -> o.exclusiveStartTableName.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DescribeTimeToLiveInputEncoder: io.circe.Encoder[avias.dynamodb.models.DescribeTimeToLiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson)
  }
  final implicit val ItemCollectionMetricsEncoder: io.circe.Encoder[avias.dynamodb.models.ItemCollectionMetrics] = io.circe.Encoder.instance { o => 
    Json.obj("ItemCollectionKey" -> o.itemCollectionKey.asJson, "SizeEstimateRangeGB" -> o.sizeEstimateRangeGB.asJson)
  }
  final implicit val ResourceInUseExceptionEncoder: io.circe.Encoder[avias.dynamodb.models.ResourceInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LocalSecondaryIndexDescriptionEncoder: io.circe.Encoder[avias.dynamodb.models.LocalSecondaryIndexDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IndexSizeBytes" -> o.indexSizeBytes.asJson, "ItemCount" -> o.itemCount.asJson, "IndexArn" -> o.indexArn.asJson, "IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson)
  }
  final implicit val WriteRequestEncoder: io.circe.Encoder[avias.dynamodb.models.WriteRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PutRequest" -> o.putRequest.asJson, "DeleteRequest" -> o.deleteRequest.asJson)
  }
  final implicit val KeySchemaElementEncoder: io.circe.Encoder[avias.dynamodb.models.KeySchemaElement] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeName" -> o.attributeName.asJson, "KeyType" -> o.keyType.asJson)
  }
  final implicit val DeleteItemInputEncoder: io.circe.Encoder[avias.dynamodb.models.DeleteItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Key" -> o.key.asJson, "Expected" -> o.expected.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConditionExpression" -> o.conditionExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson, "ReturnValues" -> o.returnValues.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val CreateGlobalSecondaryIndexActionEncoder: io.circe.Encoder[avias.dynamodb.models.CreateGlobalSecondaryIndexAction] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson)
  }
  final implicit val ProvisionedThroughputDescriptionEncoder: io.circe.Encoder[avias.dynamodb.models.ProvisionedThroughputDescription] = io.circe.Encoder.instance { o => 
    Json.obj("LastIncreaseDateTime" -> o.lastIncreaseDateTime.asJson, "LastDecreaseDateTime" -> o.lastDecreaseDateTime.asJson, "NumberOfDecreasesToday" -> o.numberOfDecreasesToday.asJson, "ReadCapacityUnits" -> o.readCapacityUnits.asJson, "WriteCapacityUnits" -> o.writeCapacityUnits.asJson)
  }
  final implicit val AttributeDefinitionEncoder: io.circe.Encoder[avias.dynamodb.models.AttributeDefinition] = io.circe.Encoder.instance { o => 
    Json.obj("AttributeName" -> o.attributeName.asJson, "AttributeType" -> o.attributeType.asJson)
  }
  final implicit val ConditionalCheckFailedExceptionEncoder: io.circe.Encoder[avias.dynamodb.models.ConditionalCheckFailedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeLimitsOutputEncoder: io.circe.Encoder[avias.dynamodb.models.DescribeLimitsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("AccountMaxReadCapacityUnits" -> o.accountMaxReadCapacityUnits.asJson, "AccountMaxWriteCapacityUnits" -> o.accountMaxWriteCapacityUnits.asJson, "TableMaxReadCapacityUnits" -> o.tableMaxReadCapacityUnits.asJson, "TableMaxWriteCapacityUnits" -> o.tableMaxWriteCapacityUnits.asJson)
  }
  final implicit val ListTablesOutputEncoder: io.circe.Encoder[avias.dynamodb.models.ListTablesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableNames" -> o.tableNames.asJson, "LastEvaluatedTableName" -> o.lastEvaluatedTableName.asJson)
  }
  final implicit val LocalSecondaryIndexEncoder: io.circe.Encoder[avias.dynamodb.models.LocalSecondaryIndex] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson)
  }
  final implicit val UpdateItemOutputEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson)
  }
  final implicit val DeleteRequestEncoder: io.circe.Encoder[avias.dynamodb.models.DeleteRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson)
  }
  final implicit val BatchGetItemInputEncoder: io.circe.Encoder[avias.dynamodb.models.BatchGetItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("RequestItems" -> o.requestItems.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson)
  }
  final implicit val UpdateTimeToLiveOutputEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateTimeToLiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TimeToLiveSpecification" -> o.timeToLiveSpecification.asJson)
  }
  final implicit val QueryOutputEncoder: io.circe.Encoder[avias.dynamodb.models.QueryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Items" -> o.items.asJson, "Count" -> o.count.asJson, "ScannedCount" -> o.scannedCount.asJson, "LastEvaluatedKey" -> o.lastEvaluatedKey.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val PutRequestEncoder: io.circe.Encoder[avias.dynamodb.models.PutRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Item" -> o.item.asJson)
  }
  final implicit val CreateTableInputEncoder: io.circe.Encoder[avias.dynamodb.models.CreateTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("ProvisionedThroughput" -> o.provisionedThroughput.asJson, "TableName" -> o.tableName.asJson, "AttributeDefinitions" -> o.attributeDefinitions.asJson, "KeySchema" -> o.keySchema.asJson, "GlobalSecondaryIndexes" -> o.globalSecondaryIndexes.asJson, "LocalSecondaryIndexes" -> o.localSecondaryIndexes.asJson, "StreamSpecification" -> o.streamSpecification.asJson)
  }
  final implicit val DescribeLimitsInputEncoder: io.circe.Encoder[avias.dynamodb.models.DescribeLimitsInput.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GlobalSecondaryIndexUpdateEncoder: io.circe.Encoder[avias.dynamodb.models.GlobalSecondaryIndexUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("Update" -> o.update.asJson, "Create" -> o.create.asJson, "Delete" -> o.delete.asJson)
  }
  final implicit val KeysAndAttributesEncoder: io.circe.Encoder[avias.dynamodb.models.KeysAndAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("Keys" -> o.keys.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ConsistentRead" -> o.consistentRead.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson)
  }
  final implicit val ConditionEncoder: io.circe.Encoder[avias.dynamodb.models.Condition] = io.circe.Encoder.instance { o => 
    Json.obj("ComparisonOperator" -> o.comparisonOperator.asJson, "AttributeValueList" -> o.attributeValueList.asJson)
  }
  final implicit val PutItemInputEncoder: io.circe.Encoder[avias.dynamodb.models.PutItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("Item" -> o.item.asJson, "TableName" -> o.tableName.asJson, "Expected" -> o.expected.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConditionExpression" -> o.conditionExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson, "ReturnValues" -> o.returnValues.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val ProvisionedThroughputExceededExceptionEncoder: io.circe.Encoder[avias.dynamodb.models.ProvisionedThroughputExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateTableOutputEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableDescription" -> o.tableDescription.asJson)
  }
  final implicit val BatchWriteItemOutputEncoder: io.circe.Encoder[avias.dynamodb.models.BatchWriteItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("UnprocessedItems" -> o.unprocessedItems.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val DescribeTimeToLiveOutputEncoder: io.circe.Encoder[avias.dynamodb.models.DescribeTimeToLiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TimeToLiveDescription" -> o.timeToLiveDescription.asJson)
  }
  final implicit val DeleteItemOutputEncoder: io.circe.Encoder[avias.dynamodb.models.DeleteItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson)
  }
  final implicit val GlobalSecondaryIndexDescriptionEncoder: io.circe.Encoder[avias.dynamodb.models.GlobalSecondaryIndexDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IndexSizeBytes" -> o.indexSizeBytes.asJson, "ItemCount" -> o.itemCount.asJson, "IndexArn" -> o.indexArn.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson, "IndexName" -> o.indexName.asJson, "Backfilling" -> o.backfilling.asJson, "IndexStatus" -> o.indexStatus.asJson, "KeySchema" -> o.keySchema.asJson, "Projection" -> o.projection.asJson)
  }
  final implicit val UpdateTableInputEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "GlobalSecondaryIndexUpdates" -> o.globalSecondaryIndexUpdates.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson, "AttributeDefinitions" -> o.attributeDefinitions.asJson, "StreamSpecification" -> o.streamSpecification.asJson)
  }
  final implicit val TimeToLiveSpecificationEncoder: io.circe.Encoder[avias.dynamodb.models.TimeToLiveSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("Enabled" -> o.enabled.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val ProjectionEncoder: io.circe.Encoder[avias.dynamodb.models.Projection] = io.circe.Encoder.instance { o => 
    Json.obj("ProjectionType" -> o.projectionType.asJson, "NonKeyAttributes" -> o.nonKeyAttributes.asJson)
  }
  final implicit val UpdateGlobalSecondaryIndexActionEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateGlobalSecondaryIndexAction] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson, "ProvisionedThroughput" -> o.provisionedThroughput.asJson)
  }
  final implicit val PutItemOutputEncoder: io.circe.Encoder[avias.dynamodb.models.PutItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Attributes" -> o.attributes.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson, "ItemCollectionMetrics" -> o.itemCollectionMetrics.asJson)
  }
  final implicit val DeleteTableInputEncoder: io.circe.Encoder[avias.dynamodb.models.DeleteTableInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson)
  }
  final implicit val ScanOutputEncoder: io.circe.Encoder[avias.dynamodb.models.ScanOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Items" -> o.items.asJson, "Count" -> o.count.asJson, "ScannedCount" -> o.scannedCount.asJson, "LastEvaluatedKey" -> o.lastEvaluatedKey.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val CreateTableOutputEncoder: io.circe.Encoder[avias.dynamodb.models.CreateTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TableDescription" -> o.tableDescription.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.dynamodb.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val BatchWriteItemInputEncoder: io.circe.Encoder[avias.dynamodb.models.BatchWriteItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("RequestItems" -> o.requestItems.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson)
  }
  final implicit val UpdateTimeToLiveInputEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateTimeToLiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "TimeToLiveSpecification" -> o.timeToLiveSpecification.asJson)
  }
  final implicit val GetItemInputEncoder: io.circe.Encoder[avias.dynamodb.models.GetItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Key" -> o.key.asJson, "ProjectionExpression" -> o.projectionExpression.asJson, "ConsistentRead" -> o.consistentRead.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.dynamodb.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ConsumedCapacityEncoder: io.circe.Encoder[avias.dynamodb.models.ConsumedCapacity] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "CapacityUnits" -> o.capacityUnits.asJson, "Table" -> o.table.asJson, "LocalSecondaryIndexes" -> o.localSecondaryIndexes.asJson, "GlobalSecondaryIndexes" -> o.globalSecondaryIndexes.asJson)
  }
  final implicit val DescribeTableOutputEncoder: io.circe.Encoder[avias.dynamodb.models.DescribeTableOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Table" -> o.table.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.dynamodb.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttributeValueUpdateEncoder: io.circe.Encoder[avias.dynamodb.models.AttributeValueUpdate] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Action" -> o.action.asJson)
  }
  final implicit val DeleteGlobalSecondaryIndexActionEncoder: io.circe.Encoder[avias.dynamodb.models.DeleteGlobalSecondaryIndexAction] = io.circe.Encoder.instance { o => 
    Json.obj("IndexName" -> o.indexName.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[avias.dynamodb.models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TimeToLiveDescriptionEncoder: io.circe.Encoder[avias.dynamodb.models.TimeToLiveDescription] = io.circe.Encoder.instance { o => 
    Json.obj("TimeToLiveStatus" -> o.timeToLiveStatus.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val UpdateItemInputEncoder: io.circe.Encoder[avias.dynamodb.models.UpdateItemInput] = io.circe.Encoder.instance { o => 
    Json.obj("TableName" -> o.tableName.asJson, "Key" -> o.key.asJson, "Expected" -> o.expected.asJson, "ExpressionAttributeValues" -> o.expressionAttributeValues.asJson, "ConditionExpression" -> o.conditionExpression.asJson, "ReturnConsumedCapacity" -> o.returnConsumedCapacity.asJson, "UpdateExpression" -> o.updateExpression.asJson, "ReturnItemCollectionMetrics" -> o.returnItemCollectionMetrics.asJson, "ReturnValues" -> o.returnValues.asJson, "AttributeUpdates" -> o.attributeUpdates.asJson, "ExpressionAttributeNames" -> o.expressionAttributeNames.asJson, "ConditionalOperator" -> o.conditionalOperator.asJson)
  }
  final implicit val StreamSpecificationEncoder: io.circe.Encoder[avias.dynamodb.models.StreamSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("StreamEnabled" -> o.streamEnabled.asJson, "StreamViewType" -> o.streamViewType.asJson)
  }
  final implicit val GetItemOutputEncoder: io.circe.Encoder[avias.dynamodb.models.GetItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Item" -> o.item.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val ItemCollectionSizeLimitExceededExceptionEncoder: io.circe.Encoder[avias.dynamodb.models.ItemCollectionSizeLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CapacityEncoder: io.circe.Encoder[avias.dynamodb.models.Capacity] = io.circe.Encoder.instance { o => 
    Json.obj("CapacityUnits" -> o.capacityUnits.asJson)
  }
  final implicit val BatchGetItemOutputEncoder: io.circe.Encoder[avias.dynamodb.models.BatchGetItemOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Responses" -> o.responses.asJson, "UnprocessedKeys" -> o.unprocessedKeys.asJson, "ConsumedCapacity" -> o.consumedCapacity.asJson)
  }
  final implicit val UntagResourceInputEncoder: io.circe.Encoder[avias.dynamodb.models.UntagResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val AttributeValueEncoder: io.circe.Encoder[avias.dynamodb.models.AttributeValue] = io.circe.Encoder.instance { o => 
    Json.obj("BS" -> o.bs.asJson, "SS" -> o.ss.asJson, "M" -> o.m.asJson, "NULL" -> o.`null`.asJson, "B" -> o.b.asJson, "S" -> o.s.asJson, "N" -> o.n.asJson, "NS" -> o.ns.asJson, "BOOL" -> o.bool.asJson, "L" -> o.l.asJson)
  }
  final implicit val TableDescriptionDecoder: io.circe.Decoder[avias.dynamodb.models.TableDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[scala.Long]]("TableSizeBytes"), o.get[scala.Option[scala.Long]]("ItemCount"), o.get[scala.Option[java.lang.String]]("TableArn"), o.get[scala.Option[java.lang.String]]("LatestStreamLabel"), o.get[scala.Option[scala.List[avias.dynamodb.models.LocalSecondaryIndexDescription]]]("LocalSecondaryIndexes"), o.get[scala.Option[scala.List[avias.dynamodb.models.GlobalSecondaryIndexDescription]]]("GlobalSecondaryIndexes"), o.get[scala.Option[java.lang.String]]("LatestStreamArn"), o.get[scala.Option[avias.dynamodb.models.ProvisionedThroughputDescription]]("ProvisionedThroughput"), o.get[scala.Option[java.lang.String]]("TableStatus"), o.get[scala.Option[scala.List[avias.dynamodb.models.AttributeDefinition]]]("AttributeDefinitions"), o.get[scala.Option[scala.List[avias.dynamodb.models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[java.time.Instant]]("CreationDateTime"), o.get[scala.Option[avias.dynamodb.models.StreamSpecification]]("StreamSpecification")).mapN(avias.dynamodb.models.TableDescription.apply _)
  }
  final implicit val ListTagsOfResourceInputDecoder: io.circe.Decoder[avias.dynamodb.models.ListTagsOfResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.dynamodb.models.ListTagsOfResourceInput.apply _)
  }
  final implicit val ProvisionedThroughputDecoder: io.circe.Decoder[avias.dynamodb.models.ProvisionedThroughput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("ReadCapacityUnits"), o.get[scala.Long]("WriteCapacityUnits")).mapN(avias.dynamodb.models.ProvisionedThroughput.apply _)
  }
  final implicit val GlobalSecondaryIndexDecoder: io.circe.Decoder[avias.dynamodb.models.GlobalSecondaryIndex] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[scala.List[avias.dynamodb.models.KeySchemaElement]]("KeySchema"), o.get[avias.dynamodb.models.Projection]("Projection"), o.get[avias.dynamodb.models.ProvisionedThroughput]("ProvisionedThroughput")).mapN(avias.dynamodb.models.GlobalSecondaryIndex.apply _)
  }
  final implicit val ScanInputDecoder: io.circe.Decoder[avias.dynamodb.models.ScanInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[java.lang.String]]("FilterExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("Select"), o.get[scala.Option[scala.Int]]("TotalSegments"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExclusiveStartKey"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.Condition]]]("ScanFilter"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.Int]]("Segment"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(avias.dynamodb.models.ScanInput.apply _)
  }
  final implicit val TagResourceInputDecoder: io.circe.Decoder[avias.dynamodb.models.TagResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[avias.dynamodb.models.Tag]]("Tags")).mapN(avias.dynamodb.models.TagResourceInput.apply _)
  }
  final implicit val DeleteTableOutputDecoder: io.circe.Decoder[avias.dynamodb.models.DeleteTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.dynamodb.models.TableDescription]]("TableDescription").map(avias.dynamodb.models.DeleteTableOutput.apply _)
  }
  final implicit val QueryInputDecoder: io.circe.Decoder[avias.dynamodb.models.QueryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.Option[java.lang.String]]("KeyConditionExpression"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[java.lang.String]]("FilterExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("Select"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExclusiveStartKey"), o.get[scala.Option[scala.Boolean]]("ScanIndexForward"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.Condition]]]("QueryFilter"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.Condition]]]("KeyConditions"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(avias.dynamodb.models.QueryInput.apply _)
  }
  final implicit val ExpectedAttributeValueDecoder: io.circe.Decoder[avias.dynamodb.models.ExpectedAttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.dynamodb.models.AttributeValue]]("Value"), o.get[scala.Option[scala.Boolean]]("Exists"), o.get[scala.Option[java.lang.String]]("ComparisonOperator"), o.get[scala.Option[scala.List[avias.dynamodb.models.AttributeValue]]]("AttributeValueList")).mapN(avias.dynamodb.models.ExpectedAttributeValue.apply _)
  }
  final implicit val ListTagsOfResourceOutputDecoder: io.circe.Decoder[avias.dynamodb.models.ListTagsOfResourceOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.dynamodb.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.dynamodb.models.ListTagsOfResourceOutput.apply _)
  }
  final implicit val DescribeTableInputDecoder: io.circe.Decoder[avias.dynamodb.models.DescribeTableInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TableName").map(avias.dynamodb.models.DescribeTableInput.apply _)
  }
  final implicit val ListTablesInputDecoder: io.circe.Decoder[avias.dynamodb.models.ListTablesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ExclusiveStartTableName"), o.get[scala.Option[scala.Int]]("Limit")).mapN(avias.dynamodb.models.ListTablesInput.apply _)
  }
  final implicit val DescribeTimeToLiveInputDecoder: io.circe.Decoder[avias.dynamodb.models.DescribeTimeToLiveInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TableName").map(avias.dynamodb.models.DescribeTimeToLiveInput.apply _)
  }
  final implicit val ItemCollectionMetricsDecoder: io.circe.Decoder[avias.dynamodb.models.ItemCollectionMetrics] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ItemCollectionKey"), o.get[scala.Option[scala.List[scala.Double]]]("SizeEstimateRangeGB")).mapN(avias.dynamodb.models.ItemCollectionMetrics.apply _)
  }
  final implicit val ResourceInUseExceptionDecoder: io.circe.Decoder[avias.dynamodb.models.ResourceInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.ResourceInUseException.apply _)
  }
  final implicit val LocalSecondaryIndexDescriptionDecoder: io.circe.Decoder[avias.dynamodb.models.LocalSecondaryIndexDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("IndexSizeBytes"), o.get[scala.Option[scala.Long]]("ItemCount"), o.get[scala.Option[java.lang.String]]("IndexArn"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.List[avias.dynamodb.models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[avias.dynamodb.models.Projection]]("Projection")).mapN(avias.dynamodb.models.LocalSecondaryIndexDescription.apply _)
  }
  final implicit val WriteRequestDecoder: io.circe.Decoder[avias.dynamodb.models.WriteRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.dynamodb.models.PutRequest]]("PutRequest"), o.get[scala.Option[avias.dynamodb.models.DeleteRequest]]("DeleteRequest")).mapN(avias.dynamodb.models.WriteRequest.apply _)
  }
  final implicit val KeySchemaElementDecoder: io.circe.Decoder[avias.dynamodb.models.KeySchemaElement] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("KeyType")).mapN(avias.dynamodb.models.KeySchemaElement.apply _)
  }
  final implicit val DeleteItemInputDecoder: io.circe.Decoder[avias.dynamodb.models.DeleteItemInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]("Key"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.ExpectedAttributeValue]]]("Expected"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[java.lang.String]]("ConditionExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics"), o.get[scala.Option[java.lang.String]]("ReturnValues"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(avias.dynamodb.models.DeleteItemInput.apply _)
  }
  final implicit val CreateGlobalSecondaryIndexActionDecoder: io.circe.Decoder[avias.dynamodb.models.CreateGlobalSecondaryIndexAction] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[scala.List[avias.dynamodb.models.KeySchemaElement]]("KeySchema"), o.get[avias.dynamodb.models.Projection]("Projection"), o.get[avias.dynamodb.models.ProvisionedThroughput]("ProvisionedThroughput")).mapN(avias.dynamodb.models.CreateGlobalSecondaryIndexAction.apply _)
  }
  final implicit val ProvisionedThroughputDescriptionDecoder: io.circe.Decoder[avias.dynamodb.models.ProvisionedThroughputDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastIncreaseDateTime"), o.get[scala.Option[java.time.Instant]]("LastDecreaseDateTime"), o.get[scala.Option[scala.Long]]("NumberOfDecreasesToday"), o.get[scala.Option[scala.Long]]("ReadCapacityUnits"), o.get[scala.Option[scala.Long]]("WriteCapacityUnits")).mapN(avias.dynamodb.models.ProvisionedThroughputDescription.apply _)
  }
  final implicit val AttributeDefinitionDecoder: io.circe.Decoder[avias.dynamodb.models.AttributeDefinition] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("AttributeType")).mapN(avias.dynamodb.models.AttributeDefinition.apply _)
  }
  final implicit val ConditionalCheckFailedExceptionDecoder: io.circe.Decoder[avias.dynamodb.models.ConditionalCheckFailedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.ConditionalCheckFailedException.apply _)
  }
  final implicit val DescribeLimitsOutputDecoder: io.circe.Decoder[avias.dynamodb.models.DescribeLimitsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("AccountMaxReadCapacityUnits"), o.get[scala.Option[scala.Long]]("AccountMaxWriteCapacityUnits"), o.get[scala.Option[scala.Long]]("TableMaxReadCapacityUnits"), o.get[scala.Option[scala.Long]]("TableMaxWriteCapacityUnits")).mapN(avias.dynamodb.models.DescribeLimitsOutput.apply _)
  }
  final implicit val ListTablesOutputDecoder: io.circe.Decoder[avias.dynamodb.models.ListTablesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("TableNames"), o.get[scala.Option[java.lang.String]]("LastEvaluatedTableName")).mapN(avias.dynamodb.models.ListTablesOutput.apply _)
  }
  final implicit val LocalSecondaryIndexDecoder: io.circe.Decoder[avias.dynamodb.models.LocalSecondaryIndex] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[scala.List[avias.dynamodb.models.KeySchemaElement]]("KeySchema"), o.get[avias.dynamodb.models.Projection]("Projection")).mapN(avias.dynamodb.models.LocalSecondaryIndex.apply _)
  }
  final implicit val UpdateItemOutputDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("Attributes"), o.get[scala.Option[avias.dynamodb.models.ConsumedCapacity]]("ConsumedCapacity"), o.get[scala.Option[avias.dynamodb.models.ItemCollectionMetrics]]("ItemCollectionMetrics")).mapN(avias.dynamodb.models.UpdateItemOutput.apply _)
  }
  final implicit val DeleteRequestDecoder: io.circe.Decoder[avias.dynamodb.models.DeleteRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]("Key").map(avias.dynamodb.models.DeleteRequest.apply _)
  }
  final implicit val BatchGetItemInputDecoder: io.circe.Decoder[avias.dynamodb.models.BatchGetItemInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.KeysAndAttributes]]("RequestItems"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity")).mapN(avias.dynamodb.models.BatchGetItemInput.apply _)
  }
  final implicit val UpdateTimeToLiveOutputDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateTimeToLiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.dynamodb.models.TimeToLiveSpecification]]("TimeToLiveSpecification").map(avias.dynamodb.models.UpdateTimeToLiveOutput.apply _)
  }
  final implicit val QueryOutputDecoder: io.circe.Decoder[avias.dynamodb.models.QueryOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]]("Items"), o.get[scala.Option[scala.Int]]("Count"), o.get[scala.Option[scala.Int]]("ScannedCount"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("LastEvaluatedKey"), o.get[scala.Option[avias.dynamodb.models.ConsumedCapacity]]("ConsumedCapacity")).mapN(avias.dynamodb.models.QueryOutput.apply _)
  }
  final implicit val PutRequestDecoder: io.circe.Decoder[avias.dynamodb.models.PutRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]("Item").map(avias.dynamodb.models.PutRequest.apply _)
  }
  final implicit val CreateTableInputDecoder: io.circe.Decoder[avias.dynamodb.models.CreateTableInput] = io.circe.Decoder.instance { o => 
    (o.get[avias.dynamodb.models.ProvisionedThroughput]("ProvisionedThroughput"), o.get[java.lang.String]("TableName"), o.get[scala.List[avias.dynamodb.models.AttributeDefinition]]("AttributeDefinitions"), o.get[scala.List[avias.dynamodb.models.KeySchemaElement]]("KeySchema"), o.get[scala.Option[scala.List[avias.dynamodb.models.GlobalSecondaryIndex]]]("GlobalSecondaryIndexes"), o.get[scala.Option[scala.List[avias.dynamodb.models.LocalSecondaryIndex]]]("LocalSecondaryIndexes"), o.get[scala.Option[avias.dynamodb.models.StreamSpecification]]("StreamSpecification")).mapN(avias.dynamodb.models.CreateTableInput.apply _)
  }
  final implicit val DescribeLimitsInputDecoder: io.circe.Decoder[avias.dynamodb.models.DescribeLimitsInput.type] = io.circe.Decoder.decodeUnit.as(avias.dynamodb.models.DescribeLimitsInput)
  final implicit val GlobalSecondaryIndexUpdateDecoder: io.circe.Decoder[avias.dynamodb.models.GlobalSecondaryIndexUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.dynamodb.models.UpdateGlobalSecondaryIndexAction]]("Update"), o.get[scala.Option[avias.dynamodb.models.CreateGlobalSecondaryIndexAction]]("Create"), o.get[scala.Option[avias.dynamodb.models.DeleteGlobalSecondaryIndexAction]]("Delete")).mapN(avias.dynamodb.models.GlobalSecondaryIndexUpdate.apply _)
  }
  final implicit val KeysAndAttributesDecoder: io.circe.Decoder[avias.dynamodb.models.KeysAndAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("Keys"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames")).mapN(avias.dynamodb.models.KeysAndAttributes.apply _)
  }
  final implicit val ConditionDecoder: io.circe.Decoder[avias.dynamodb.models.Condition] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Option[scala.List[avias.dynamodb.models.AttributeValue]]]("AttributeValueList")).mapN(avias.dynamodb.models.Condition.apply _)
  }
  final implicit val PutItemInputDecoder: io.circe.Decoder[avias.dynamodb.models.PutItemInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]("Item"), o.get[java.lang.String]("TableName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.ExpectedAttributeValue]]]("Expected"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[java.lang.String]]("ConditionExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics"), o.get[scala.Option[java.lang.String]]("ReturnValues"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(avias.dynamodb.models.PutItemInput.apply _)
  }
  final implicit val ProvisionedThroughputExceededExceptionDecoder: io.circe.Decoder[avias.dynamodb.models.ProvisionedThroughputExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.ProvisionedThroughputExceededException.apply _)
  }
  final implicit val UpdateTableOutputDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.dynamodb.models.TableDescription]]("TableDescription").map(avias.dynamodb.models.UpdateTableOutput.apply _)
  }
  final implicit val BatchWriteItemOutputDecoder: io.circe.Decoder[avias.dynamodb.models.BatchWriteItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[avias.dynamodb.models.WriteRequest]]]]("UnprocessedItems"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[avias.dynamodb.models.ItemCollectionMetrics]]]]("ItemCollectionMetrics"), o.get[scala.Option[scala.List[avias.dynamodb.models.ConsumedCapacity]]]("ConsumedCapacity")).mapN(avias.dynamodb.models.BatchWriteItemOutput.apply _)
  }
  final implicit val DescribeTimeToLiveOutputDecoder: io.circe.Decoder[avias.dynamodb.models.DescribeTimeToLiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.dynamodb.models.TimeToLiveDescription]]("TimeToLiveDescription").map(avias.dynamodb.models.DescribeTimeToLiveOutput.apply _)
  }
  final implicit val DeleteItemOutputDecoder: io.circe.Decoder[avias.dynamodb.models.DeleteItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("Attributes"), o.get[scala.Option[avias.dynamodb.models.ConsumedCapacity]]("ConsumedCapacity"), o.get[scala.Option[avias.dynamodb.models.ItemCollectionMetrics]]("ItemCollectionMetrics")).mapN(avias.dynamodb.models.DeleteItemOutput.apply _)
  }
  final implicit val GlobalSecondaryIndexDescriptionDecoder: io.circe.Decoder[avias.dynamodb.models.GlobalSecondaryIndexDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Long]]("IndexSizeBytes"), o.get[scala.Option[scala.Long]]("ItemCount"), o.get[scala.Option[java.lang.String]]("IndexArn"), o.get[scala.Option[avias.dynamodb.models.ProvisionedThroughputDescription]]("ProvisionedThroughput"), o.get[scala.Option[java.lang.String]]("IndexName"), o.get[scala.Option[scala.Boolean]]("Backfilling"), o.get[scala.Option[java.lang.String]]("IndexStatus"), o.get[scala.Option[scala.List[avias.dynamodb.models.KeySchemaElement]]]("KeySchema"), o.get[scala.Option[avias.dynamodb.models.Projection]]("Projection")).mapN(avias.dynamodb.models.GlobalSecondaryIndexDescription.apply _)
  }
  final implicit val UpdateTableInputDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateTableInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.Option[scala.List[avias.dynamodb.models.GlobalSecondaryIndexUpdate]]]("GlobalSecondaryIndexUpdates"), o.get[scala.Option[avias.dynamodb.models.ProvisionedThroughput]]("ProvisionedThroughput"), o.get[scala.Option[scala.List[avias.dynamodb.models.AttributeDefinition]]]("AttributeDefinitions"), o.get[scala.Option[avias.dynamodb.models.StreamSpecification]]("StreamSpecification")).mapN(avias.dynamodb.models.UpdateTableInput.apply _)
  }
  final implicit val TimeToLiveSpecificationDecoder: io.circe.Decoder[avias.dynamodb.models.TimeToLiveSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("Enabled"), o.get[java.lang.String]("AttributeName")).mapN(avias.dynamodb.models.TimeToLiveSpecification.apply _)
  }
  final implicit val ProjectionDecoder: io.circe.Decoder[avias.dynamodb.models.Projection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProjectionType"), o.get[scala.Option[scala.List[java.lang.String]]]("NonKeyAttributes")).mapN(avias.dynamodb.models.Projection.apply _)
  }
  final implicit val UpdateGlobalSecondaryIndexActionDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateGlobalSecondaryIndexAction] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IndexName"), o.get[avias.dynamodb.models.ProvisionedThroughput]("ProvisionedThroughput")).mapN(avias.dynamodb.models.UpdateGlobalSecondaryIndexAction.apply _)
  }
  final implicit val PutItemOutputDecoder: io.circe.Decoder[avias.dynamodb.models.PutItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("Attributes"), o.get[scala.Option[avias.dynamodb.models.ConsumedCapacity]]("ConsumedCapacity"), o.get[scala.Option[avias.dynamodb.models.ItemCollectionMetrics]]("ItemCollectionMetrics")).mapN(avias.dynamodb.models.PutItemOutput.apply _)
  }
  final implicit val DeleteTableInputDecoder: io.circe.Decoder[avias.dynamodb.models.DeleteTableInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TableName").map(avias.dynamodb.models.DeleteTableInput.apply _)
  }
  final implicit val ScanOutputDecoder: io.circe.Decoder[avias.dynamodb.models.ScanOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]]("Items"), o.get[scala.Option[scala.Int]]("Count"), o.get[scala.Option[scala.Int]]("ScannedCount"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("LastEvaluatedKey"), o.get[scala.Option[avias.dynamodb.models.ConsumedCapacity]]("ConsumedCapacity")).mapN(avias.dynamodb.models.ScanOutput.apply _)
  }
  final implicit val CreateTableOutputDecoder: io.circe.Decoder[avias.dynamodb.models.CreateTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.dynamodb.models.TableDescription]]("TableDescription").map(avias.dynamodb.models.CreateTableOutput.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.dynamodb.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.ResourceNotFoundException.apply _)
  }
  final implicit val BatchWriteItemInputDecoder: io.circe.Decoder[avias.dynamodb.models.BatchWriteItemInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.collection.immutable.Map[java.lang.String, scala.List[avias.dynamodb.models.WriteRequest]]]("RequestItems"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics")).mapN(avias.dynamodb.models.BatchWriteItemInput.apply _)
  }
  final implicit val UpdateTimeToLiveInputDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateTimeToLiveInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[avias.dynamodb.models.TimeToLiveSpecification]("TimeToLiveSpecification")).mapN(avias.dynamodb.models.UpdateTimeToLiveInput.apply _)
  }
  final implicit val GetItemInputDecoder: io.circe.Decoder[avias.dynamodb.models.GetItemInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]("Key"), o.get[scala.Option[java.lang.String]]("ProjectionExpression"), o.get[scala.Option[scala.Boolean]]("ConsistentRead"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames")).mapN(avias.dynamodb.models.GetItemInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.dynamodb.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.dynamodb.models.Tag.apply _)
  }
  final implicit val ConsumedCapacityDecoder: io.circe.Decoder[avias.dynamodb.models.ConsumedCapacity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TableName"), o.get[scala.Option[scala.Double]]("CapacityUnits"), o.get[scala.Option[avias.dynamodb.models.Capacity]]("Table"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.Capacity]]]("LocalSecondaryIndexes"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.Capacity]]]("GlobalSecondaryIndexes")).mapN(avias.dynamodb.models.ConsumedCapacity.apply _)
  }
  final implicit val DescribeTableOutputDecoder: io.circe.Decoder[avias.dynamodb.models.DescribeTableOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.dynamodb.models.TableDescription]]("Table").map(avias.dynamodb.models.DescribeTableOutput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.dynamodb.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.LimitExceededException.apply _)
  }
  final implicit val AttributeValueUpdateDecoder: io.circe.Decoder[avias.dynamodb.models.AttributeValueUpdate] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.dynamodb.models.AttributeValue]]("Value"), o.get[scala.Option[java.lang.String]]("Action")).mapN(avias.dynamodb.models.AttributeValueUpdate.apply _)
  }
  final implicit val DeleteGlobalSecondaryIndexActionDecoder: io.circe.Decoder[avias.dynamodb.models.DeleteGlobalSecondaryIndexAction] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IndexName").map(avias.dynamodb.models.DeleteGlobalSecondaryIndexAction.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[avias.dynamodb.models.InternalServerError] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.InternalServerError.apply _)
  }
  final implicit val TimeToLiveDescriptionDecoder: io.circe.Decoder[avias.dynamodb.models.TimeToLiveDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TimeToLiveStatus"), o.get[scala.Option[java.lang.String]]("AttributeName")).mapN(avias.dynamodb.models.TimeToLiveDescription.apply _)
  }
  final implicit val UpdateItemInputDecoder: io.circe.Decoder[avias.dynamodb.models.UpdateItemInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TableName"), o.get[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]("Key"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.ExpectedAttributeValue]]]("Expected"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("ExpressionAttributeValues"), o.get[scala.Option[java.lang.String]]("ConditionExpression"), o.get[scala.Option[java.lang.String]]("ReturnConsumedCapacity"), o.get[scala.Option[java.lang.String]]("UpdateExpression"), o.get[scala.Option[java.lang.String]]("ReturnItemCollectionMetrics"), o.get[scala.Option[java.lang.String]]("ReturnValues"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValueUpdate]]]("AttributeUpdates"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ExpressionAttributeNames"), o.get[scala.Option[java.lang.String]]("ConditionalOperator")).mapN(avias.dynamodb.models.UpdateItemInput.apply _)
  }
  final implicit val StreamSpecificationDecoder: io.circe.Decoder[avias.dynamodb.models.StreamSpecification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("StreamEnabled"), o.get[scala.Option[java.lang.String]]("StreamViewType")).mapN(avias.dynamodb.models.StreamSpecification.apply _)
  }
  final implicit val GetItemOutputDecoder: io.circe.Decoder[avias.dynamodb.models.GetItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("Item"), o.get[scala.Option[avias.dynamodb.models.ConsumedCapacity]]("ConsumedCapacity")).mapN(avias.dynamodb.models.GetItemOutput.apply _)
  }
  final implicit val ItemCollectionSizeLimitExceededExceptionDecoder: io.circe.Decoder[avias.dynamodb.models.ItemCollectionSizeLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.dynamodb.models.ItemCollectionSizeLimitExceededException.apply _)
  }
  final implicit val CapacityDecoder: io.circe.Decoder[avias.dynamodb.models.Capacity] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Double]]("CapacityUnits").map(avias.dynamodb.models.Capacity.apply _)
  }
  final implicit val BatchGetItemOutputDecoder: io.circe.Decoder[avias.dynamodb.models.BatchGetItemOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]]]("Responses"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.KeysAndAttributes]]]("UnprocessedKeys"), o.get[scala.Option[scala.List[avias.dynamodb.models.ConsumedCapacity]]]("ConsumedCapacity")).mapN(avias.dynamodb.models.BatchGetItemOutput.apply _)
  }
  final implicit val UntagResourceInputDecoder: io.circe.Decoder[avias.dynamodb.models.UntagResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(avias.dynamodb.models.UntagResourceInput.apply _)
  }
  final implicit val AttributeValueDecoder: io.circe.Decoder[avias.dynamodb.models.AttributeValue] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[scala.Array[scala.Byte]]]]("BS"), o.get[scala.Option[scala.List[java.lang.String]]]("SS"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.dynamodb.models.AttributeValue]]]("M"), o.get[scala.Option[scala.Boolean]]("NULL"), o.get[scala.Option[scala.Array[scala.Byte]]]("B"), o.get[scala.Option[java.lang.String]]("S"), o.get[scala.Option[java.lang.String]]("N"), o.get[scala.Option[scala.List[java.lang.String]]]("NS"), o.get[scala.Option[scala.Boolean]]("BOOL"), o.get[scala.Option[scala.List[avias.dynamodb.models.AttributeValue]]]("L")).mapN(avias.dynamodb.models.AttributeValue.apply _)
  }
}