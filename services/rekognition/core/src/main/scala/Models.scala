package avias.rekognition.models
final case class Beard(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class Image(bytes: scala.Option[scala.Array[scala.Byte]] = scala.None, s3Object: scala.Option[avias.rekognition.models.S3Object] = scala.None)
final case class RecognizeCelebritiesRequest(image: avias.rekognition.models.Image)
case object InvalidImageFormatException
case object ThrottlingException
final case class CompareFacesResponse(sourceImageFace: scala.Option[avias.rekognition.models.ComparedSourceImageFace] = scala.None, faceMatches: scala.Option[scala.List[avias.rekognition.models.CompareFacesMatch]] = scala.None, unmatchedFaces: scala.Option[scala.List[avias.rekognition.models.ComparedFace]] = scala.None, sourceImageOrientationCorrection: scala.Option[java.lang.String] = scala.None, targetImageOrientationCorrection: scala.Option[java.lang.String] = scala.None)
case object ImageTooLargeException
case object InternalServerError
final case class FaceRecord(face: scala.Option[avias.rekognition.models.Face] = scala.None, faceDetail: scala.Option[avias.rekognition.models.FaceDetail] = scala.None)
final case class ModerationLabel(confidence: scala.Option[scala.Float] = scala.None, name: scala.Option[java.lang.String] = scala.None, parentName: scala.Option[java.lang.String] = scala.None)
final case class BoundingBox(width: scala.Option[scala.Float] = scala.None, height: scala.Option[scala.Float] = scala.None, left: scala.Option[scala.Float] = scala.None, top: scala.Option[scala.Float] = scala.None)
final case class AgeRange(low: scala.Option[scala.Int] = scala.None, high: scala.Option[scala.Int] = scala.None)
final case class S3Object(bucket: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, version: scala.Option[java.lang.String] = scala.None)
final case class Gender(value: scala.Option[java.lang.String] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class Emotion(`type`: scala.Option[java.lang.String] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class Label(name: scala.Option[java.lang.String] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class Pose(roll: scala.Option[scala.Float] = scala.None, yaw: scala.Option[scala.Float] = scala.None, pitch: scala.Option[scala.Float] = scala.None)
final case class Smile(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class FaceDetail(beard: scala.Option[avias.rekognition.models.Beard] = scala.None, boundingBox: scala.Option[avias.rekognition.models.BoundingBox] = scala.None, ageRange: scala.Option[avias.rekognition.models.AgeRange] = scala.None, confidence: scala.Option[scala.Float] = scala.None, gender: scala.Option[avias.rekognition.models.Gender] = scala.None, pose: scala.Option[avias.rekognition.models.Pose] = scala.None, smile: scala.Option[avias.rekognition.models.Smile] = scala.None, landmarks: scala.Option[scala.List[avias.rekognition.models.Landmark]] = scala.None, eyeglasses: scala.Option[avias.rekognition.models.Eyeglasses] = scala.None, sunglasses: scala.Option[avias.rekognition.models.Sunglasses] = scala.None, eyesOpen: scala.Option[avias.rekognition.models.EyeOpen] = scala.None, emotions: scala.Option[scala.List[avias.rekognition.models.Emotion]] = scala.None, mouthOpen: scala.Option[avias.rekognition.models.MouthOpen] = scala.None, quality: scala.Option[avias.rekognition.models.ImageQuality] = scala.None, mustache: scala.Option[avias.rekognition.models.Mustache] = scala.None)
final case class Eyeglasses(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class ListFacesResponse(faces: scala.Option[scala.List[avias.rekognition.models.Face]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CompareFacesRequest(sourceImage: avias.rekognition.models.Image, targetImage: avias.rekognition.models.Image, similarityThreshold: scala.Option[scala.Float] = scala.None)
final case class ListCollectionsResponse(collectionIds: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Sunglasses(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class ComparedSourceImageFace(boundingBox: scala.Option[avias.rekognition.models.BoundingBox] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class CreateCollectionResponse(statusCode: scala.Option[scala.Int] = scala.None, collectionArn: scala.Option[java.lang.String] = scala.None)
final case class DetectModerationLabelsRequest(image: avias.rekognition.models.Image, minConfidence: scala.Option[scala.Float] = scala.None)
final case class IndexFacesRequest(collectionId: java.lang.String, image: avias.rekognition.models.Image, externalImageId: scala.Option[java.lang.String] = scala.None, detectionAttributes: scala.Option[scala.List[java.lang.String]] = scala.None)
case object InvalidPaginationTokenException
final case class GetCelebrityInfoRequest(id: java.lang.String)
final case class SearchFacesRequest(collectionId: java.lang.String, faceId: java.lang.String, maxFaces: scala.Option[scala.Int] = scala.None, faceMatchThreshold: scala.Option[scala.Float] = scala.None)
final case class EyeOpen(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class GetCelebrityInfoResponse(urls: scala.Option[scala.List[java.lang.String]] = scala.None, name: scala.Option[java.lang.String] = scala.None)
final case class CreateCollectionRequest(collectionId: java.lang.String)
final case class MouthOpen(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class DetectLabelsResponse(labels: scala.Option[scala.List[avias.rekognition.models.Label]] = scala.None, orientationCorrection: scala.Option[java.lang.String] = scala.None)
final case class CompareFacesMatch(similarity: scala.Option[scala.Float] = scala.None, face: scala.Option[avias.rekognition.models.ComparedFace] = scala.None)
final case class ListFacesRequest(collectionId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class SearchFacesResponse(searchedFaceId: scala.Option[java.lang.String] = scala.None, faceMatches: scala.Option[scala.List[avias.rekognition.models.FaceMatch]] = scala.None)
final case class Celebrity(name: scala.Option[java.lang.String] = scala.None, matchConfidence: scala.Option[scala.Float] = scala.None, urls: scala.Option[scala.List[java.lang.String]] = scala.None, face: scala.Option[avias.rekognition.models.ComparedFace] = scala.None, id: scala.Option[java.lang.String] = scala.None)
case object AccessDeniedException
final case class DeleteFacesRequest(collectionId: java.lang.String, faceIds: scala.List[java.lang.String])
final case class IndexFacesResponse(faceRecords: scala.Option[scala.List[avias.rekognition.models.FaceRecord]] = scala.None, orientationCorrection: scala.Option[java.lang.String] = scala.None)
final case class Landmark(`type`: scala.Option[java.lang.String] = scala.None, x: scala.Option[scala.Float] = scala.None, y: scala.Option[scala.Float] = scala.None)
final case class SearchFacesByImageRequest(collectionId: java.lang.String, image: avias.rekognition.models.Image, maxFaces: scala.Option[scala.Int] = scala.None, faceMatchThreshold: scala.Option[scala.Float] = scala.None)
final case class ListCollectionsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DetectModerationLabelsResponse(moderationLabels: scala.Option[scala.List[avias.rekognition.models.ModerationLabel]] = scala.None)
final case class DetectFacesRequest(image: avias.rekognition.models.Image, attributes: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class DeleteFacesResponse(deletedFaces: scala.Option[scala.List[java.lang.String]] = scala.None)
case object InvalidS3ObjectException
case object InvalidParameterException
final case class DeleteCollectionResponse(statusCode: scala.Option[scala.Int] = scala.None)
final case class SearchFacesByImageResponse(searchedFaceBoundingBox: scala.Option[avias.rekognition.models.BoundingBox] = scala.None, searchedFaceConfidence: scala.Option[scala.Float] = scala.None, faceMatches: scala.Option[scala.List[avias.rekognition.models.FaceMatch]] = scala.None)
case object ResourceAlreadyExistsException
final case class Face(boundingBox: scala.Option[avias.rekognition.models.BoundingBox] = scala.None, confidence: scala.Option[scala.Float] = scala.None, externalImageId: scala.Option[java.lang.String] = scala.None, faceId: scala.Option[java.lang.String] = scala.None, imageId: scala.Option[java.lang.String] = scala.None)
final case class ImageQuality(brightness: scala.Option[scala.Float] = scala.None, sharpness: scala.Option[scala.Float] = scala.None)
case object ResourceNotFoundException
final case class Mustache(value: scala.Option[scala.Boolean] = scala.None, confidence: scala.Option[scala.Float] = scala.None)
final case class DetectLabelsRequest(image: avias.rekognition.models.Image, maxLabels: scala.Option[scala.Int] = scala.None, minConfidence: scala.Option[scala.Float] = scala.None)
final case class DetectFacesResponse(faceDetails: scala.Option[scala.List[avias.rekognition.models.FaceDetail]] = scala.None, orientationCorrection: scala.Option[java.lang.String] = scala.None)
final case class DeleteCollectionRequest(collectionId: java.lang.String)
final case class ComparedFace(boundingBox: scala.Option[avias.rekognition.models.BoundingBox] = scala.None, confidence: scala.Option[scala.Float] = scala.None, pose: scala.Option[avias.rekognition.models.Pose] = scala.None, landmarks: scala.Option[scala.List[avias.rekognition.models.Landmark]] = scala.None, quality: scala.Option[avias.rekognition.models.ImageQuality] = scala.None)
case object ProvisionedThroughputExceededException
final case class FaceMatch(similarity: scala.Option[scala.Float] = scala.None, face: scala.Option[avias.rekognition.models.Face] = scala.None)
final case class RecognizeCelebritiesResponse(celebrityFaces: scala.Option[scala.List[avias.rekognition.models.Celebrity]] = scala.None, unrecognizedFaces: scala.Option[scala.List[avias.rekognition.models.ComparedFace]] = scala.None, orientationCorrection: scala.Option[java.lang.String] = scala.None)