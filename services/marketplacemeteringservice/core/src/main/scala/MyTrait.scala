package avias.marketplacemeteringservice
trait Amazonmarketplacemeteringservice[F[_]] {
  def batchMeterUsage(input: avias.marketplacemeteringservice.models.BatchMeterUsageRequest): F[avias.marketplacemeteringservice.models.BatchMeterUsageResult]
  def resolveCustomer(input: avias.marketplacemeteringservice.models.ResolveCustomerRequest): F[avias.marketplacemeteringservice.models.ResolveCustomerResult]
  def meterUsage(input: avias.marketplacemeteringservice.models.MeterUsageRequest): F[avias.marketplacemeteringservice.models.MeterUsageResult]
}