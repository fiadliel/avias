package avias.dynamodbstreams
trait Amazondynamodbstreams[F[_]] {
  def getShardIterator(input: avias.dynamodbstreams.models.GetShardIteratorInput): F[avias.dynamodbstreams.models.GetShardIteratorOutput]
  def listStreams(input: avias.dynamodbstreams.models.ListStreamsInput): F[avias.dynamodbstreams.models.ListStreamsOutput]
  def describeStream(input: avias.dynamodbstreams.models.DescribeStreamInput): F[avias.dynamodbstreams.models.DescribeStreamOutput]
  def getRecords(input: avias.dynamodbstreams.models.GetRecordsInput): F[avias.dynamodbstreams.models.GetRecordsOutput]
}