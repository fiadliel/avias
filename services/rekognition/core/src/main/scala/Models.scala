package org.lyranthe.araethura.rekognition.models
import org.lyranthe.araethura.rekognition.models
final case class Beard(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class Image(bytes: scala.Option[scala.Array[scala.Byte]] = None, s3Object: scala.Option[models.S3Object] = None)
final case class RecognizeCelebritiesRequest(image: models.Image)
case object InvalidImageFormatException
case object ThrottlingException
final case class CompareFacesResponse(sourceImageFace: scala.Option[models.ComparedSourceImageFace] = None, faceMatches: scala.Option[scala.List[models.CompareFacesMatch]] = None, unmatchedFaces: scala.Option[scala.List[models.ComparedFace]] = None, sourceImageOrientationCorrection: scala.Option[java.lang.String] = None, targetImageOrientationCorrection: scala.Option[java.lang.String] = None)
case object ImageTooLargeException
case object InternalServerError
final case class FaceRecord(face: scala.Option[models.Face] = None, faceDetail: scala.Option[models.FaceDetail] = None)
final case class ModerationLabel(confidence: scala.Option[scala.Float] = None, name: scala.Option[java.lang.String] = None, parentName: scala.Option[java.lang.String] = None)
final case class BoundingBox(width: scala.Option[scala.Float] = None, height: scala.Option[scala.Float] = None, left: scala.Option[scala.Float] = None, top: scala.Option[scala.Float] = None)
final case class AgeRange(low: scala.Option[scala.Int] = None, high: scala.Option[scala.Int] = None)
final case class S3Object(bucket: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, version: scala.Option[java.lang.String] = None)
final case class Gender(value: scala.Option[java.lang.String] = None, confidence: scala.Option[scala.Float] = None)
final case class Emotion(`type`: scala.Option[java.lang.String] = None, confidence: scala.Option[scala.Float] = None)
final case class Label(name: scala.Option[java.lang.String] = None, confidence: scala.Option[scala.Float] = None)
final case class Pose(roll: scala.Option[scala.Float] = None, yaw: scala.Option[scala.Float] = None, pitch: scala.Option[scala.Float] = None)
final case class Smile(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class FaceDetail(beard: scala.Option[models.Beard] = None, boundingBox: scala.Option[models.BoundingBox] = None, ageRange: scala.Option[models.AgeRange] = None, confidence: scala.Option[scala.Float] = None, gender: scala.Option[models.Gender] = None, pose: scala.Option[models.Pose] = None, smile: scala.Option[models.Smile] = None, landmarks: scala.Option[scala.List[models.Landmark]] = None, eyeglasses: scala.Option[models.Eyeglasses] = None, sunglasses: scala.Option[models.Sunglasses] = None, eyesOpen: scala.Option[models.EyeOpen] = None, emotions: scala.Option[scala.List[models.Emotion]] = None, mouthOpen: scala.Option[models.MouthOpen] = None, quality: scala.Option[models.ImageQuality] = None, mustache: scala.Option[models.Mustache] = None)
final case class Eyeglasses(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class ListFacesResponse(faces: scala.Option[scala.List[models.Face]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CompareFacesRequest(sourceImage: models.Image, targetImage: models.Image, similarityThreshold: scala.Option[scala.Float] = None)
final case class ListCollectionsResponse(collectionIds: scala.Option[scala.List[java.lang.String]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class Sunglasses(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class ComparedSourceImageFace(boundingBox: scala.Option[models.BoundingBox] = None, confidence: scala.Option[scala.Float] = None)
final case class CreateCollectionResponse(statusCode: scala.Option[scala.Int] = None, collectionArn: scala.Option[java.lang.String] = None)
final case class DetectModerationLabelsRequest(image: models.Image, minConfidence: scala.Option[scala.Float] = None)
final case class IndexFacesRequest(collectionId: java.lang.String, image: models.Image, externalImageId: scala.Option[java.lang.String] = None, detectionAttributes: scala.Option[scala.List[java.lang.String]] = None)
case object InvalidPaginationTokenException
final case class GetCelebrityInfoRequest(id: java.lang.String)
final case class SearchFacesRequest(collectionId: java.lang.String, faceId: java.lang.String, maxFaces: scala.Option[scala.Int] = None, faceMatchThreshold: scala.Option[scala.Float] = None)
final case class EyeOpen(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class GetCelebrityInfoResponse(urls: scala.Option[scala.List[java.lang.String]] = None, name: scala.Option[java.lang.String] = None)
final case class CreateCollectionRequest(collectionId: java.lang.String)
final case class MouthOpen(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class DetectLabelsResponse(labels: scala.Option[scala.List[models.Label]] = None, orientationCorrection: scala.Option[java.lang.String] = None)
final case class CompareFacesMatch(similarity: scala.Option[scala.Float] = None, face: scala.Option[models.ComparedFace] = None)
final case class ListFacesRequest(collectionId: java.lang.String, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class SearchFacesResponse(searchedFaceId: scala.Option[java.lang.String] = None, faceMatches: scala.Option[scala.List[models.FaceMatch]] = None)
final case class Celebrity(name: scala.Option[java.lang.String] = None, matchConfidence: scala.Option[scala.Float] = None, urls: scala.Option[scala.List[java.lang.String]] = None, face: scala.Option[models.ComparedFace] = None, id: scala.Option[java.lang.String] = None)
case object AccessDeniedException
final case class DeleteFacesRequest(collectionId: java.lang.String, faceIds: scala.List[java.lang.String])
final case class IndexFacesResponse(faceRecords: scala.Option[scala.List[models.FaceRecord]] = None, orientationCorrection: scala.Option[java.lang.String] = None)
final case class Landmark(`type`: scala.Option[java.lang.String] = None, x: scala.Option[scala.Float] = None, y: scala.Option[scala.Float] = None)
final case class SearchFacesByImageRequest(collectionId: java.lang.String, image: models.Image, maxFaces: scala.Option[scala.Int] = None, faceMatchThreshold: scala.Option[scala.Float] = None)
final case class ListCollectionsRequest(nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class DetectModerationLabelsResponse(moderationLabels: scala.Option[scala.List[models.ModerationLabel]] = None)
final case class DetectFacesRequest(image: models.Image, attributes: scala.Option[scala.List[java.lang.String]] = None)
final case class DeleteFacesResponse(deletedFaces: scala.Option[scala.List[java.lang.String]] = None)
case object InvalidS3ObjectException
case object InvalidParameterException
final case class DeleteCollectionResponse(statusCode: scala.Option[scala.Int] = None)
final case class SearchFacesByImageResponse(searchedFaceBoundingBox: scala.Option[models.BoundingBox] = None, searchedFaceConfidence: scala.Option[scala.Float] = None, faceMatches: scala.Option[scala.List[models.FaceMatch]] = None)
case object ResourceAlreadyExistsException
final case class Face(boundingBox: scala.Option[models.BoundingBox] = None, confidence: scala.Option[scala.Float] = None, externalImageId: scala.Option[java.lang.String] = None, faceId: scala.Option[java.lang.String] = None, imageId: scala.Option[java.lang.String] = None)
final case class ImageQuality(brightness: scala.Option[scala.Float] = None, sharpness: scala.Option[scala.Float] = None)
case object ResourceNotFoundException
final case class Mustache(value: scala.Option[scala.Boolean] = None, confidence: scala.Option[scala.Float] = None)
final case class DetectLabelsRequest(image: models.Image, maxLabels: scala.Option[scala.Int] = None, minConfidence: scala.Option[scala.Float] = None)
final case class DetectFacesResponse(faceDetails: scala.Option[scala.List[models.FaceDetail]] = None, orientationCorrection: scala.Option[java.lang.String] = None)
final case class DeleteCollectionRequest(collectionId: java.lang.String)
final case class ComparedFace(boundingBox: scala.Option[models.BoundingBox] = None, confidence: scala.Option[scala.Float] = None, pose: scala.Option[models.Pose] = None, landmarks: scala.Option[scala.List[models.Landmark]] = None, quality: scala.Option[models.ImageQuality] = None)
case object ProvisionedThroughputExceededException
final case class FaceMatch(similarity: scala.Option[scala.Float] = None, face: scala.Option[models.Face] = None)
final case class RecognizeCelebritiesResponse(celebrityFaces: scala.Option[scala.List[models.Celebrity]] = None, unrecognizedFaces: scala.Option[scala.List[models.ComparedFace]] = None, orientationCorrection: scala.Option[java.lang.String] = None)