package avias.resourcegroupstaggingapi.http4s
import org.http4s.Method._
import avias.resourcegroupstaggingapi.circe._
import avias.resourcegroupstaggingapi.models
import avias.common.http4s.ClientUtils._
class AmazonresourcegroupstaggingapiClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.resourcegroupstaggingapi.Amazonresourcegroupstaggingapi[F] {
  private[this] final val ServiceType: String = "tagging"
  private[this] final val ServiceAndPrefix: Option[String] = Some("ResourceGroupsTaggingAPI_20170126")
  override def getResources(input: avias.resourcegroupstaggingapi.models.GetResourcesInput): F[avias.resourcegroupstaggingapi.models.GetResourcesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.resourcegroupstaggingapi.models.GetResourcesOutput, avias.resourcegroupstaggingapi.models.GetResourcesInput](client, awsData, ServiceType, ServiceAndPrefix, "GetResources", POST, "/", input)
  override def tagResources(input: avias.resourcegroupstaggingapi.models.TagResourcesInput): F[avias.resourcegroupstaggingapi.models.TagResourcesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.resourcegroupstaggingapi.models.TagResourcesOutput, avias.resourcegroupstaggingapi.models.TagResourcesInput](client, awsData, ServiceType, ServiceAndPrefix, "TagResources", POST, "/", input)
  override def getTagValues(input: avias.resourcegroupstaggingapi.models.GetTagValuesInput): F[avias.resourcegroupstaggingapi.models.GetTagValuesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.resourcegroupstaggingapi.models.GetTagValuesOutput, avias.resourcegroupstaggingapi.models.GetTagValuesInput](client, awsData, ServiceType, ServiceAndPrefix, "GetTagValues", POST, "/", input)
  override def getTagKeys(input: avias.resourcegroupstaggingapi.models.GetTagKeysInput): F[avias.resourcegroupstaggingapi.models.GetTagKeysOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.resourcegroupstaggingapi.models.GetTagKeysOutput, avias.resourcegroupstaggingapi.models.GetTagKeysInput](client, awsData, ServiceType, ServiceAndPrefix, "GetTagKeys", POST, "/", input)
  override def untagResources(input: avias.resourcegroupstaggingapi.models.UntagResourcesInput): F[avias.resourcegroupstaggingapi.models.UntagResourcesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.resourcegroupstaggingapi.models.UntagResourcesOutput, avias.resourcegroupstaggingapi.models.UntagResourcesInput](client, awsData, ServiceType, ServiceAndPrefix, "UntagResources", POST, "/", input)
}