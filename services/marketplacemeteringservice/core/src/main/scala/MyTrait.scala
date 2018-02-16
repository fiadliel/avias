package org.lyranthe.araethura.marketplacemeteringservice
trait Amazonmarketplacemeteringservice[F[_]] {
  def batchMeterUsage(input: org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageRequest): F[org.lyranthe.araethura.marketplacemeteringservice.models.BatchMeterUsageResult]
  def resolveCustomer(input: org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerRequest): F[org.lyranthe.araethura.marketplacemeteringservice.models.ResolveCustomerResult]
  def meterUsage(input: org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageRequest): F[org.lyranthe.araethura.marketplacemeteringservice.models.MeterUsageResult]
}