package org.lyranthe.araethura.rekognition
trait Amazonrekognition[F[_]] {
  def detectFaces(input: models.DetectFacesRequest): F[models.DetectFacesResponse]
  def indexFaces(input: models.IndexFacesRequest): F[models.IndexFacesResponse]
  def searchFaces(input: models.SearchFacesRequest): F[models.SearchFacesResponse]
  def recognizeCelebrities(input: models.RecognizeCelebritiesRequest): F[models.RecognizeCelebritiesResponse]
  def detectLabels(input: models.DetectLabelsRequest): F[models.DetectLabelsResponse]
  def deleteFaces(input: models.DeleteFacesRequest): F[models.DeleteFacesResponse]
  def deleteCollection(input: models.DeleteCollectionRequest): F[models.DeleteCollectionResponse]
  def listCollections(input: models.ListCollectionsRequest): F[models.ListCollectionsResponse]
  def getCelebrityInfo(input: models.GetCelebrityInfoRequest): F[models.GetCelebrityInfoResponse]
  def detectModerationLabels(input: models.DetectModerationLabelsRequest): F[models.DetectModerationLabelsResponse]
  def compareFaces(input: models.CompareFacesRequest): F[models.CompareFacesResponse]
  def listFaces(input: models.ListFacesRequest): F[models.ListFacesResponse]
  def searchFacesByImage(input: models.SearchFacesByImageRequest): F[models.SearchFacesByImageResponse]
  def createCollection(input: models.CreateCollectionRequest): F[models.CreateCollectionResponse]
}