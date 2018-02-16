package avias.rekognition
trait Amazonrekognition[F[_]] {
  def detectFaces(input: avias.rekognition.models.DetectFacesRequest): F[avias.rekognition.models.DetectFacesResponse]
  def indexFaces(input: avias.rekognition.models.IndexFacesRequest): F[avias.rekognition.models.IndexFacesResponse]
  def searchFaces(input: avias.rekognition.models.SearchFacesRequest): F[avias.rekognition.models.SearchFacesResponse]
  def recognizeCelebrities(input: avias.rekognition.models.RecognizeCelebritiesRequest): F[avias.rekognition.models.RecognizeCelebritiesResponse]
  def detectLabels(input: avias.rekognition.models.DetectLabelsRequest): F[avias.rekognition.models.DetectLabelsResponse]
  def deleteFaces(input: avias.rekognition.models.DeleteFacesRequest): F[avias.rekognition.models.DeleteFacesResponse]
  def deleteCollection(input: avias.rekognition.models.DeleteCollectionRequest): F[avias.rekognition.models.DeleteCollectionResponse]
  def listCollections(input: avias.rekognition.models.ListCollectionsRequest): F[avias.rekognition.models.ListCollectionsResponse]
  def getCelebrityInfo(input: avias.rekognition.models.GetCelebrityInfoRequest): F[avias.rekognition.models.GetCelebrityInfoResponse]
  def detectModerationLabels(input: avias.rekognition.models.DetectModerationLabelsRequest): F[avias.rekognition.models.DetectModerationLabelsResponse]
  def compareFaces(input: avias.rekognition.models.CompareFacesRequest): F[avias.rekognition.models.CompareFacesResponse]
  def listFaces(input: avias.rekognition.models.ListFacesRequest): F[avias.rekognition.models.ListFacesResponse]
  def searchFacesByImage(input: avias.rekognition.models.SearchFacesByImageRequest): F[avias.rekognition.models.SearchFacesByImageResponse]
  def createCollection(input: avias.rekognition.models.CreateCollectionRequest): F[avias.rekognition.models.CreateCollectionResponse]
}