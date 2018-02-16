package org.lyranthe.araethura.resourcegroupstaggingapi
trait Amazonresourcegroupstaggingapi[F[_]] {
  def getResources(input: org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesInput): F[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetResourcesOutput]
  def tagResources(input: org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesInput): F[org.lyranthe.araethura.resourcegroupstaggingapi.models.TagResourcesOutput]
  def getTagValues(input: org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesInput): F[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagValuesOutput]
  def getTagKeys(input: org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysInput): F[org.lyranthe.araethura.resourcegroupstaggingapi.models.GetTagKeysOutput]
  def untagResources(input: org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesInput): F[org.lyranthe.araethura.resourcegroupstaggingapi.models.UntagResourcesOutput]
}