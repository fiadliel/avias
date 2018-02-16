package avias.dynamodbstreams.http4s
import org.http4s.Method._
import avias.dynamodbstreams.circe._
import avias.dynamodbstreams.models
class AmazondynamodbstreamsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.dynamodbstreams.Amazondynamodbstreams[F] {
  private[this] final val ServiceType: String = "streams.dynamodb"
  private[this] final val ServiceAndPrefix: Option[String] = Some("DynamoDBStreams_20120810")
  override def getShardIterator(input: avias.dynamodbstreams.models.GetShardIteratorInput): F[avias.dynamodbstreams.models.GetShardIteratorOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.dynamodbstreams.models.GetShardIteratorOutput, avias.dynamodbstreams.models.GetShardIteratorInput](client, awsData, ServiceType, ServiceAndPrefix, "GetShardIterator", POST, "/", input)
  override def listStreams(input: avias.dynamodbstreams.models.ListStreamsInput): F[avias.dynamodbstreams.models.ListStreamsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.dynamodbstreams.models.ListStreamsOutput, avias.dynamodbstreams.models.ListStreamsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListStreams", POST, "/", input)
  override def describeStream(input: avias.dynamodbstreams.models.DescribeStreamInput): F[avias.dynamodbstreams.models.DescribeStreamOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.dynamodbstreams.models.DescribeStreamOutput, avias.dynamodbstreams.models.DescribeStreamInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeStream", POST, "/", input)
  override def getRecords(input: avias.dynamodbstreams.models.GetRecordsInput): F[avias.dynamodbstreams.models.GetRecordsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.dynamodbstreams.models.GetRecordsOutput, avias.dynamodbstreams.models.GetRecordsInput](client, awsData, ServiceType, ServiceAndPrefix, "GetRecords", POST, "/", input)
}