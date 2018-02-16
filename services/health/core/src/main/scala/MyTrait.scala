package avias.health
trait Amazonhealth[F[_]] {
  def describeEventDetails(input: avias.health.models.DescribeEventDetailsRequest): F[avias.health.models.DescribeEventDetailsResponse]
  def describeEntityAggregates(input: avias.health.models.DescribeEntityAggregatesRequest): F[avias.health.models.DescribeEntityAggregatesResponse]
  def describeEventAggregates(input: avias.health.models.DescribeEventAggregatesRequest): F[avias.health.models.DescribeEventAggregatesResponse]
  def describeAffectedEntities(input: avias.health.models.DescribeAffectedEntitiesRequest): F[avias.health.models.DescribeAffectedEntitiesResponse]
  def describeEventTypes(input: avias.health.models.DescribeEventTypesRequest): F[avias.health.models.DescribeEventTypesResponse]
  def describeEvents(input: avias.health.models.DescribeEventsRequest): F[avias.health.models.DescribeEventsResponse]
}