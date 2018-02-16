package org.lyranthe.araethura.health
trait Amazonhealth[F[_]] {
  def describeEventDetails(input: org.lyranthe.araethura.health.models.DescribeEventDetailsRequest): F[org.lyranthe.araethura.health.models.DescribeEventDetailsResponse]
  def describeEntityAggregates(input: org.lyranthe.araethura.health.models.DescribeEntityAggregatesRequest): F[org.lyranthe.araethura.health.models.DescribeEntityAggregatesResponse]
  def describeEventAggregates(input: org.lyranthe.araethura.health.models.DescribeEventAggregatesRequest): F[org.lyranthe.araethura.health.models.DescribeEventAggregatesResponse]
  def describeAffectedEntities(input: org.lyranthe.araethura.health.models.DescribeAffectedEntitiesRequest): F[org.lyranthe.araethura.health.models.DescribeAffectedEntitiesResponse]
  def describeEventTypes(input: org.lyranthe.araethura.health.models.DescribeEventTypesRequest): F[org.lyranthe.araethura.health.models.DescribeEventTypesResponse]
  def describeEvents(input: org.lyranthe.araethura.health.models.DescribeEventsRequest): F[org.lyranthe.araethura.health.models.DescribeEventsResponse]
}