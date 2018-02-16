package org.lyranthe.araethura.dynamodbstreams
trait Amazondynamodbstreams[F[_]] {
  def getShardIterator(input: org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorInput): F[org.lyranthe.araethura.dynamodbstreams.models.GetShardIteratorOutput]
  def listStreams(input: org.lyranthe.araethura.dynamodbstreams.models.ListStreamsInput): F[org.lyranthe.araethura.dynamodbstreams.models.ListStreamsOutput]
  def describeStream(input: org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamInput): F[org.lyranthe.araethura.dynamodbstreams.models.DescribeStreamOutput]
  def getRecords(input: org.lyranthe.araethura.dynamodbstreams.models.GetRecordsInput): F[org.lyranthe.araethura.dynamodbstreams.models.GetRecordsOutput]
}