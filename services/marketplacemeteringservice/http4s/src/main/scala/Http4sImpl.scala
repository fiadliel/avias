package org.lyranthe.araethura.marketplacemeteringservice.http4s
import org.http4s.Method._
import org.lyranthe.araethura.marketplacemeteringservice.circe._
import org.lyranthe.araethura.marketplacemeteringservice.models
class AmazonmarketplacemeteringserviceClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.marketplacemeteringservice.Amazonmarketplacemeteringservice[F] {
  private[this] final val ServiceType: String = "metering.marketplace"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSMPMeteringService")
  override def batchMeterUsage(input: models.BatchMeterUsageRequest): F[models.BatchMeterUsageResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.BatchMeterUsageResult, models.BatchMeterUsageRequest](client, awsData, ServiceType, ServiceAndPrefix, "BatchMeterUsage", POST, "/", input)
  override def resolveCustomer(input: models.ResolveCustomerRequest): F[models.ResolveCustomerResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.ResolveCustomerResult, models.ResolveCustomerRequest](client, awsData, ServiceType, ServiceAndPrefix, "ResolveCustomer", POST, "/", input)
  override def meterUsage(input: models.MeterUsageRequest): F[models.MeterUsageResult] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.MeterUsageResult, models.MeterUsageRequest](client, awsData, ServiceType, ServiceAndPrefix, "MeterUsage", POST, "/", input)
}