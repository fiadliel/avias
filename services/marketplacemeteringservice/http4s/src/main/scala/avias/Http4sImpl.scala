package avias.marketplacemeteringservice.http4s
import org.http4s.Method._
import avias.marketplacemeteringservice.circe._
import avias.marketplacemeteringservice.models
import avias.common.http4s.ClientUtils._
class AmazonmarketplacemeteringserviceClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.marketplacemeteringservice.Amazonmarketplacemeteringservice[F] {
  private[this] final val ServiceType: String = "metering.marketplace"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSMPMeteringService")
  override def batchMeterUsage(input: avias.marketplacemeteringservice.models.BatchMeterUsageRequest): F[avias.marketplacemeteringservice.models.BatchMeterUsageResult] = avias.common.http4s.ClientUtils.doRequest[F, avias.marketplacemeteringservice.models.BatchMeterUsageResult, avias.marketplacemeteringservice.models.BatchMeterUsageRequest](client, awsData, ServiceType, ServiceAndPrefix, "BatchMeterUsage", POST, "/", input)
  override def resolveCustomer(input: avias.marketplacemeteringservice.models.ResolveCustomerRequest): F[avias.marketplacemeteringservice.models.ResolveCustomerResult] = avias.common.http4s.ClientUtils.doRequest[F, avias.marketplacemeteringservice.models.ResolveCustomerResult, avias.marketplacemeteringservice.models.ResolveCustomerRequest](client, awsData, ServiceType, ServiceAndPrefix, "ResolveCustomer", POST, "/", input)
  override def meterUsage(input: avias.marketplacemeteringservice.models.MeterUsageRequest): F[avias.marketplacemeteringservice.models.MeterUsageResult] = avias.common.http4s.ClientUtils.doRequest[F, avias.marketplacemeteringservice.models.MeterUsageResult, avias.marketplacemeteringservice.models.MeterUsageRequest](client, awsData, ServiceType, ServiceAndPrefix, "MeterUsage", POST, "/", input)
}