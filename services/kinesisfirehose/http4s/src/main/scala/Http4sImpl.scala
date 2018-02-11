package org.lyranthe.araethura.kinesisfirehose.http4s
import org.http4s.Method._
import org.lyranthe.araethura.kinesisfirehose.circe._
import org.lyranthe.araethura.kinesisfirehose.models
class AmazonkinesisfirehoseClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.kinesisfirehose.Amazonkinesisfirehose[F] {
  private[this] final val ServiceType: String = "firehose"
  private[this] final val ServiceAndPrefix: Option[String] = Some("Firehose_20150804")
  override def updateDestination(input: models.UpdateDestinationInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.UpdateDestinationInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateDestination", POST, "/", input)
  override def describeDeliveryStream(input: models.DescribeDeliveryStreamInput): F[models.DescribeDeliveryStreamOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeDeliveryStreamOutput, models.DescribeDeliveryStreamInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribeDeliveryStream", POST, "/", input)
  override def putRecord(input: models.PutRecordInput): F[models.PutRecordOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.PutRecordOutput, models.PutRecordInput](client, awsData, ServiceType, ServiceAndPrefix, "PutRecord", POST, "/", input)
  override def listDeliveryStreams(input: models.ListDeliveryStreamsInput): F[models.ListDeliveryStreamsOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ListDeliveryStreamsOutput, models.ListDeliveryStreamsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListDeliveryStreams", POST, "/", input)
  override def createDeliveryStream(input: models.CreateDeliveryStreamInput): F[models.CreateDeliveryStreamOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.CreateDeliveryStreamOutput, models.CreateDeliveryStreamInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateDeliveryStream", POST, "/", input)
  override def deleteDeliveryStream(input: models.DeleteDeliveryStreamInput): F[scala.Unit] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, scala.Unit, models.DeleteDeliveryStreamInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteDeliveryStream", POST, "/", input)
  override def putRecordBatch(input: models.PutRecordBatchInput): F[models.PutRecordBatchOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.PutRecordBatchOutput, models.PutRecordBatchInput](client, awsData, ServiceType, ServiceAndPrefix, "PutRecordBatch", POST, "/", input)
}