package avias.cloudtrail
trait Amazoncloudtrail[F[_]] {
  def addTags(input: avias.cloudtrail.models.AddTagsRequest): F[scala.Unit]
  def listTags(input: avias.cloudtrail.models.ListTagsRequest): F[avias.cloudtrail.models.ListTagsResponse]
  def createTrail(input: avias.cloudtrail.models.CreateTrailRequest): F[avias.cloudtrail.models.CreateTrailResponse]
  def describeTrails(input: avias.cloudtrail.models.DescribeTrailsRequest): F[avias.cloudtrail.models.DescribeTrailsResponse]
  def startLogging(input: avias.cloudtrail.models.StartLoggingRequest): F[scala.Unit]
  def lookupEvents(input: avias.cloudtrail.models.LookupEventsRequest): F[avias.cloudtrail.models.LookupEventsResponse]
  def stopLogging(input: avias.cloudtrail.models.StopLoggingRequest): F[scala.Unit]
  def removeTags(input: avias.cloudtrail.models.RemoveTagsRequest): F[scala.Unit]
  def deleteTrail(input: avias.cloudtrail.models.DeleteTrailRequest): F[scala.Unit]
  def updateTrail(input: avias.cloudtrail.models.UpdateTrailRequest): F[avias.cloudtrail.models.UpdateTrailResponse]
  def putEventSelectors(input: avias.cloudtrail.models.PutEventSelectorsRequest): F[avias.cloudtrail.models.PutEventSelectorsResponse]
  def getEventSelectors(input: avias.cloudtrail.models.GetEventSelectorsRequest): F[avias.cloudtrail.models.GetEventSelectorsResponse]
  def getTrailStatus(input: avias.cloudtrail.models.GetTrailStatusRequest): F[avias.cloudtrail.models.GetTrailStatusResponse]
  def listPublicKeys(input: avias.cloudtrail.models.ListPublicKeysRequest): F[avias.cloudtrail.models.ListPublicKeysResponse]
}