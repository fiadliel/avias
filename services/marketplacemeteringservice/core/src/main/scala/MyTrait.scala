package org.lyranthe.araethura.marketplacemeteringservice
trait Amazonmarketplacemeteringservice[F[_]] {
  def batchMeterUsage(input: models.BatchMeterUsageRequest): F[models.BatchMeterUsageResult]
  def resolveCustomer(input: models.ResolveCustomerRequest): F[models.ResolveCustomerResult]
  def meterUsage(input: models.MeterUsageRequest): F[models.MeterUsageResult]
}