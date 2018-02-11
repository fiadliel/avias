package org.lyranthe.araethura.resourcegroupstaggingapi.http4s
import org.http4s.Method._
import org.lyranthe.araethura.resourcegroupstaggingapi.circe._
import org.lyranthe.araethura.resourcegroupstaggingapi.models
class AmazonresourcegroupstaggingapiClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: org.lyranthe.araethura.common.AwsData[F]) extends org.lyranthe.araethura.resourcegroupstaggingapi.Amazonresourcegroupstaggingapi[F] {
  private[this] final val ServiceType: String = "tagging"
  private[this] final val ServiceAndPrefix: Option[String] = Some("ResourceGroupsTaggingAPI_20170126")
  override def getResources(input: models.GetResourcesInput): F[models.GetResourcesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetResourcesOutput, models.GetResourcesInput](client, awsData, ServiceType, ServiceAndPrefix, "GetResources", POST, "/", input)
  override def tagResources(input: models.TagResourcesInput): F[models.TagResourcesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.TagResourcesOutput, models.TagResourcesInput](client, awsData, ServiceType, ServiceAndPrefix, "TagResources", POST, "/", input)
  override def getTagValues(input: models.GetTagValuesInput): F[models.GetTagValuesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetTagValuesOutput, models.GetTagValuesInput](client, awsData, ServiceType, ServiceAndPrefix, "GetTagValues", POST, "/", input)
  override def getTagKeys(input: models.GetTagKeysInput): F[models.GetTagKeysOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.GetTagKeysOutput, models.GetTagKeysInput](client, awsData, ServiceType, ServiceAndPrefix, "GetTagKeys", POST, "/", input)
  override def untagResources(input: models.UntagResourcesInput): F[models.UntagResourcesOutput] = org.lyranthe.araethura.common.http4s.ClientUtils.doRequest[F, models.UntagResourcesOutput, models.UntagResourcesInput](client, awsData, ServiceType, ServiceAndPrefix, "UntagResources", POST, "/", input)
}