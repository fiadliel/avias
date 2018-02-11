package org.lyranthe.araethura.health
trait Amazonhealth[F[_]] {
  def describeEventDetails(input: models.DescribeEventDetailsRequest): F[models.DescribeEventDetailsResponse]
  def describeEntityAggregates(input: models.DescribeEntityAggregatesRequest): F[models.DescribeEntityAggregatesResponse]
  def describeEventAggregates(input: models.DescribeEventAggregatesRequest): F[models.DescribeEventAggregatesResponse]
  def describeAffectedEntities(input: models.DescribeAffectedEntitiesRequest): F[models.DescribeAffectedEntitiesResponse]
  def describeEventTypes(input: models.DescribeEventTypesRequest): F[models.DescribeEventTypesResponse]
  def describeEvents(input: models.DescribeEventsRequest): F[models.DescribeEventsResponse]
}