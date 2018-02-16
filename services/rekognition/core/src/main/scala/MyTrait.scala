package org.lyranthe.araethura.rekognition
trait Amazonrekognition[F[_]] {
  def detectFaces(input: org.lyranthe.araethura.rekognition.models.DetectFacesRequest): F[org.lyranthe.araethura.rekognition.models.DetectFacesResponse]
  def indexFaces(input: org.lyranthe.araethura.rekognition.models.IndexFacesRequest): F[org.lyranthe.araethura.rekognition.models.IndexFacesResponse]
  def searchFaces(input: org.lyranthe.araethura.rekognition.models.SearchFacesRequest): F[org.lyranthe.araethura.rekognition.models.SearchFacesResponse]
  def recognizeCelebrities(input: org.lyranthe.araethura.rekognition.models.RecognizeCelebritiesRequest): F[org.lyranthe.araethura.rekognition.models.RecognizeCelebritiesResponse]
  def detectLabels(input: org.lyranthe.araethura.rekognition.models.DetectLabelsRequest): F[org.lyranthe.araethura.rekognition.models.DetectLabelsResponse]
  def deleteFaces(input: org.lyranthe.araethura.rekognition.models.DeleteFacesRequest): F[org.lyranthe.araethura.rekognition.models.DeleteFacesResponse]
  def deleteCollection(input: org.lyranthe.araethura.rekognition.models.DeleteCollectionRequest): F[org.lyranthe.araethura.rekognition.models.DeleteCollectionResponse]
  def listCollections(input: org.lyranthe.araethura.rekognition.models.ListCollectionsRequest): F[org.lyranthe.araethura.rekognition.models.ListCollectionsResponse]
  def getCelebrityInfo(input: org.lyranthe.araethura.rekognition.models.GetCelebrityInfoRequest): F[org.lyranthe.araethura.rekognition.models.GetCelebrityInfoResponse]
  def detectModerationLabels(input: org.lyranthe.araethura.rekognition.models.DetectModerationLabelsRequest): F[org.lyranthe.araethura.rekognition.models.DetectModerationLabelsResponse]
  def compareFaces(input: org.lyranthe.araethura.rekognition.models.CompareFacesRequest): F[org.lyranthe.araethura.rekognition.models.CompareFacesResponse]
  def listFaces(input: org.lyranthe.araethura.rekognition.models.ListFacesRequest): F[org.lyranthe.araethura.rekognition.models.ListFacesResponse]
  def searchFacesByImage(input: org.lyranthe.araethura.rekognition.models.SearchFacesByImageRequest): F[org.lyranthe.araethura.rekognition.models.SearchFacesByImageResponse]
  def createCollection(input: org.lyranthe.araethura.rekognition.models.CreateCollectionRequest): F[org.lyranthe.araethura.rekognition.models.CreateCollectionResponse]
}