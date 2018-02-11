package org.lyranthe.araethura.resourcegroupstaggingapi
trait Amazonresourcegroupstaggingapi[F[_]] {
  def getResources(input: models.GetResourcesInput): F[models.GetResourcesOutput]
  def tagResources(input: models.TagResourcesInput): F[models.TagResourcesOutput]
  def getTagValues(input: models.GetTagValuesInput): F[models.GetTagValuesOutput]
  def getTagKeys(input: models.GetTagKeysInput): F[models.GetTagKeysOutput]
  def untagResources(input: models.UntagResourcesInput): F[models.UntagResourcesOutput]
}