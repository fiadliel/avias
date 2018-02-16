package avias.resourcegroupstaggingapi
trait Amazonresourcegroupstaggingapi[F[_]] {
  def getResources(input: avias.resourcegroupstaggingapi.models.GetResourcesInput): F[avias.resourcegroupstaggingapi.models.GetResourcesOutput]
  def tagResources(input: avias.resourcegroupstaggingapi.models.TagResourcesInput): F[avias.resourcegroupstaggingapi.models.TagResourcesOutput]
  def getTagValues(input: avias.resourcegroupstaggingapi.models.GetTagValuesInput): F[avias.resourcegroupstaggingapi.models.GetTagValuesOutput]
  def getTagKeys(input: avias.resourcegroupstaggingapi.models.GetTagKeysInput): F[avias.resourcegroupstaggingapi.models.GetTagKeysOutput]
  def untagResources(input: avias.resourcegroupstaggingapi.models.UntagResourcesInput): F[avias.resourcegroupstaggingapi.models.UntagResourcesOutput]
}