package org.lyranthe.araethura.dynamodbstreams
trait Amazondynamodbstreams[F[_]] {
  def getShardIterator(input: models.GetShardIteratorInput): F[models.GetShardIteratorOutput]
  def listStreams(input: models.ListStreamsInput): F[models.ListStreamsOutput]
  def describeStream(input: models.DescribeStreamInput): F[models.DescribeStreamOutput]
  def getRecords(input: models.GetRecordsInput): F[models.GetRecordsOutput]
}