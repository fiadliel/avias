package avias.kinesisfirehose
trait Amazonkinesisfirehose[F[_]] {
  def updateDestination(input: avias.kinesisfirehose.models.UpdateDestinationInput): F[scala.Unit]
  def describeDeliveryStream(input: avias.kinesisfirehose.models.DescribeDeliveryStreamInput): F[avias.kinesisfirehose.models.DescribeDeliveryStreamOutput]
  def putRecord(input: avias.kinesisfirehose.models.PutRecordInput): F[avias.kinesisfirehose.models.PutRecordOutput]
  def listDeliveryStreams(input: avias.kinesisfirehose.models.ListDeliveryStreamsInput): F[avias.kinesisfirehose.models.ListDeliveryStreamsOutput]
  def createDeliveryStream(input: avias.kinesisfirehose.models.CreateDeliveryStreamInput): F[avias.kinesisfirehose.models.CreateDeliveryStreamOutput]
  def deleteDeliveryStream(input: avias.kinesisfirehose.models.DeleteDeliveryStreamInput): F[scala.Unit]
  def putRecordBatch(input: avias.kinesisfirehose.models.PutRecordBatchInput): F[avias.kinesisfirehose.models.PutRecordBatchOutput]
}