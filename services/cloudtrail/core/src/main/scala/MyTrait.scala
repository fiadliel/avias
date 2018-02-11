package org.lyranthe.araethura.cloudtrail
trait Amazoncloudtrail[F[_]] {
  def addTags(input: models.AddTagsRequest): F[scala.Unit]
  def listTags(input: models.ListTagsRequest): F[models.ListTagsResponse]
  def createTrail(input: models.CreateTrailRequest): F[models.CreateTrailResponse]
  def describeTrails(input: models.DescribeTrailsRequest): F[models.DescribeTrailsResponse]
  def startLogging(input: models.StartLoggingRequest): F[scala.Unit]
  def lookupEvents(input: models.LookupEventsRequest): F[models.LookupEventsResponse]
  def stopLogging(input: models.StopLoggingRequest): F[scala.Unit]
  def removeTags(input: models.RemoveTagsRequest): F[scala.Unit]
  def deleteTrail(input: models.DeleteTrailRequest): F[scala.Unit]
  def updateTrail(input: models.UpdateTrailRequest): F[models.UpdateTrailResponse]
  def putEventSelectors(input: models.PutEventSelectorsRequest): F[models.PutEventSelectorsResponse]
  def getEventSelectors(input: models.GetEventSelectorsRequest): F[models.GetEventSelectorsResponse]
  def getTrailStatus(input: models.GetTrailStatusRequest): F[models.GetTrailStatusResponse]
  def listPublicKeys(input: models.ListPublicKeysRequest): F[models.ListPublicKeysResponse]
}