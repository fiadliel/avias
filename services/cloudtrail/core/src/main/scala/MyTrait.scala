package org.lyranthe.araethura.cloudtrail
trait Amazoncloudtrail[F[_]] {
  def addTags(input: org.lyranthe.araethura.cloudtrail.models.AddTagsRequest): F[scala.Unit]
  def listTags(input: org.lyranthe.araethura.cloudtrail.models.ListTagsRequest): F[org.lyranthe.araethura.cloudtrail.models.ListTagsResponse]
  def createTrail(input: org.lyranthe.araethura.cloudtrail.models.CreateTrailRequest): F[org.lyranthe.araethura.cloudtrail.models.CreateTrailResponse]
  def describeTrails(input: org.lyranthe.araethura.cloudtrail.models.DescribeTrailsRequest): F[org.lyranthe.araethura.cloudtrail.models.DescribeTrailsResponse]
  def startLogging(input: org.lyranthe.araethura.cloudtrail.models.StartLoggingRequest): F[scala.Unit]
  def lookupEvents(input: org.lyranthe.araethura.cloudtrail.models.LookupEventsRequest): F[org.lyranthe.araethura.cloudtrail.models.LookupEventsResponse]
  def stopLogging(input: org.lyranthe.araethura.cloudtrail.models.StopLoggingRequest): F[scala.Unit]
  def removeTags(input: org.lyranthe.araethura.cloudtrail.models.RemoveTagsRequest): F[scala.Unit]
  def deleteTrail(input: org.lyranthe.araethura.cloudtrail.models.DeleteTrailRequest): F[scala.Unit]
  def updateTrail(input: org.lyranthe.araethura.cloudtrail.models.UpdateTrailRequest): F[org.lyranthe.araethura.cloudtrail.models.UpdateTrailResponse]
  def putEventSelectors(input: org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsRequest): F[org.lyranthe.araethura.cloudtrail.models.PutEventSelectorsResponse]
  def getEventSelectors(input: org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsRequest): F[org.lyranthe.araethura.cloudtrail.models.GetEventSelectorsResponse]
  def getTrailStatus(input: org.lyranthe.araethura.cloudtrail.models.GetTrailStatusRequest): F[org.lyranthe.araethura.cloudtrail.models.GetTrailStatusResponse]
  def listPublicKeys(input: org.lyranthe.araethura.cloudtrail.models.ListPublicKeysRequest): F[org.lyranthe.araethura.cloudtrail.models.ListPublicKeysResponse]
}