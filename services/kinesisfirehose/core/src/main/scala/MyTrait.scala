package org.lyranthe.araethura.kinesisfirehose
trait Amazonkinesisfirehose[F[_]] {
  def updateDestination(input: org.lyranthe.araethura.kinesisfirehose.models.UpdateDestinationInput): F[scala.Unit]
  def describeDeliveryStream(input: org.lyranthe.araethura.kinesisfirehose.models.DescribeDeliveryStreamInput): F[org.lyranthe.araethura.kinesisfirehose.models.DescribeDeliveryStreamOutput]
  def putRecord(input: org.lyranthe.araethura.kinesisfirehose.models.PutRecordInput): F[org.lyranthe.araethura.kinesisfirehose.models.PutRecordOutput]
  def listDeliveryStreams(input: org.lyranthe.araethura.kinesisfirehose.models.ListDeliveryStreamsInput): F[org.lyranthe.araethura.kinesisfirehose.models.ListDeliveryStreamsOutput]
  def createDeliveryStream(input: org.lyranthe.araethura.kinesisfirehose.models.CreateDeliveryStreamInput): F[org.lyranthe.araethura.kinesisfirehose.models.CreateDeliveryStreamOutput]
  def deleteDeliveryStream(input: org.lyranthe.araethura.kinesisfirehose.models.DeleteDeliveryStreamInput): F[scala.Unit]
  def putRecordBatch(input: org.lyranthe.araethura.kinesisfirehose.models.PutRecordBatchInput): F[org.lyranthe.araethura.kinesisfirehose.models.PutRecordBatchOutput]
}