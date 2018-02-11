package org.lyranthe.araethura.health.http4s
import org.http4s.Method._
import org.lyranthe.araethura.health.circe._
import org.lyranthe.araethura.health.models
class AmazonhealthClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.health.Amazonhealth[F] {
  private[this] final val ServiceType: String = "health"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSHealth_20160804")
  override def describeEventDetails(input: models.DescribeEventDetailsRequest): F[models.DescribeEventDetailsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventDetailsResponse, models.DescribeEventDetailsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventDetails", POST, "/", input)
  override def describeEntityAggregates(input: models.DescribeEntityAggregatesRequest): F[models.DescribeEntityAggregatesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEntityAggregatesResponse, models.DescribeEntityAggregatesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEntityAggregates", POST, "/", input)
  override def describeEventAggregates(input: models.DescribeEventAggregatesRequest): F[models.DescribeEventAggregatesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventAggregatesResponse, models.DescribeEventAggregatesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventAggregates", POST, "/", input)
  override def describeAffectedEntities(input: models.DescribeAffectedEntitiesRequest): F[models.DescribeAffectedEntitiesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeAffectedEntitiesResponse, models.DescribeAffectedEntitiesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAffectedEntities", POST, "/", input)
  override def describeEventTypes(input: models.DescribeEventTypesRequest): F[models.DescribeEventTypesResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventTypesResponse, models.DescribeEventTypesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventTypes", POST, "/", input)
  override def describeEvents(input: models.DescribeEventsRequest): F[models.DescribeEventsResponse] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.DescribeEventsResponse, models.DescribeEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEvents", POST, "/", input)
}