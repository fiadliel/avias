package org.lyranthe.araethura.kinesisfirehose
trait Amazonkinesisfirehose[F[_]] {
  def updateDestination(input: models.UpdateDestinationInput): F[scala.Unit]
  def describeDeliveryStream(input: models.DescribeDeliveryStreamInput): F[models.DescribeDeliveryStreamOutput]
  def putRecord(input: models.PutRecordInput): F[models.PutRecordOutput]
  def listDeliveryStreams(input: models.ListDeliveryStreamsInput): F[models.ListDeliveryStreamsOutput]
  def createDeliveryStream(input: models.CreateDeliveryStreamInput): F[models.CreateDeliveryStreamOutput]
  def deleteDeliveryStream(input: models.DeleteDeliveryStreamInput): F[scala.Unit]
  def putRecordBatch(input: models.PutRecordBatchInput): F[models.PutRecordBatchOutput]
}