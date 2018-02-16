package avias.dynamodb
trait Amazondynamodb[F[_]] {
  def listTables(input: avias.dynamodb.models.ListTablesInput): F[avias.dynamodb.models.ListTablesOutput]
  def scan(input: avias.dynamodb.models.ScanInput): F[avias.dynamodb.models.ScanOutput]
  def batchWriteItem(input: avias.dynamodb.models.BatchWriteItemInput): F[avias.dynamodb.models.BatchWriteItemOutput]
  def putItem(input: avias.dynamodb.models.PutItemInput): F[avias.dynamodb.models.PutItemOutput]
  def deleteItem(input: avias.dynamodb.models.DeleteItemInput): F[avias.dynamodb.models.DeleteItemOutput]
  def untagResource(input: avias.dynamodb.models.UntagResourceInput): F[scala.Unit]
  def createTable(input: avias.dynamodb.models.CreateTableInput): F[avias.dynamodb.models.CreateTableOutput]
  def describeTimeToLive(input: avias.dynamodb.models.DescribeTimeToLiveInput): F[avias.dynamodb.models.DescribeTimeToLiveOutput]
  def deleteTable(input: avias.dynamodb.models.DeleteTableInput): F[avias.dynamodb.models.DeleteTableOutput]
  def getItem(input: avias.dynamodb.models.GetItemInput): F[avias.dynamodb.models.GetItemOutput]
  def updateItem(input: avias.dynamodb.models.UpdateItemInput): F[avias.dynamodb.models.UpdateItemOutput]
  def tagResource(input: avias.dynamodb.models.TagResourceInput): F[scala.Unit]
  def describeLimits: F[avias.dynamodb.models.DescribeLimitsOutput]
  def updateTable(input: avias.dynamodb.models.UpdateTableInput): F[avias.dynamodb.models.UpdateTableOutput]
  def query(input: avias.dynamodb.models.QueryInput): F[avias.dynamodb.models.QueryOutput]
  def listTagsOfResource(input: avias.dynamodb.models.ListTagsOfResourceInput): F[avias.dynamodb.models.ListTagsOfResourceOutput]
  def describeTable(input: avias.dynamodb.models.DescribeTableInput): F[avias.dynamodb.models.DescribeTableOutput]
  def updateTimeToLive(input: avias.dynamodb.models.UpdateTimeToLiveInput): F[avias.dynamodb.models.UpdateTimeToLiveOutput]
  def batchGetItem(input: avias.dynamodb.models.BatchGetItemInput): F[avias.dynamodb.models.BatchGetItemOutput]
}