package org.lyranthe.araethura.dynamodbstreams.http4s
import org.http4s.Method._
import org.lyranthe.araethura.dynamodbstreams.circe._
import org.lyranthe.araethura.dynamodbstreams.models
class AmazondynamodbstreamsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.dynamodbstreams.Amazondynamodbstreams[F] {
  private[this] final val ServiceType: String = "streams.dynamodb"
  private[this] final val ServiceAndPrefix: Option[String] = Some("DynamoDBStreams_20120810")
  override def getShardIterator(input: models.GetShardIteratorInput): F[models.GetShardIteratorOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetShardIteratorOutput, models.GetShardIteratorInput](client, awsData, ServiceType, ServiceAndPrefix, "GetShardIterator", POST, "/", input)
  override def listStreams(input: models.ListStreamsInput): F[models.ListStreamsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListStreamsOutput, models.ListStreamsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListStreams", POST, "/", input)
  override def describeStream(input: models.DescribeStreamInput): F[models.DescribeStreamOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeStreamOutput, models.DescribeStreamInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeStream", POST, "/", input)
  override def getRecords(input: models.GetRecordsInput): F[models.GetRecordsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetRecordsOutput, models.GetRecordsInput](client, awsData, ServiceType, ServiceAndPrefix, "GetRecords", POST, "/", input)
}