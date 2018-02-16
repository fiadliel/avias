package avias.rekognition
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val BeardEncoder: io.circe.Encoder[avias.rekognition.models.Beard] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val ImageEncoder: io.circe.Encoder[avias.rekognition.models.Image] = io.circe.Encoder.instance { o => 
    Json.obj("Bytes" -> o.bytes.asJson, "S3Object" -> o.s3Object.asJson)
  }
  final implicit val RecognizeCelebritiesRequestEncoder: io.circe.Encoder[avias.rekognition.models.RecognizeCelebritiesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Image" -> o.image.asJson)
  }
  final implicit val InvalidImageFormatExceptionEncoder: io.circe.Encoder[avias.rekognition.models.InvalidImageFormatException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ThrottlingExceptionEncoder: io.circe.Encoder[avias.rekognition.models.ThrottlingException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CompareFacesResponseEncoder: io.circe.Encoder[avias.rekognition.models.CompareFacesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SourceImageFace" -> o.sourceImageFace.asJson, "FaceMatches" -> o.faceMatches.asJson, "UnmatchedFaces" -> o.unmatchedFaces.asJson, "SourceImageOrientationCorrection" -> o.sourceImageOrientationCorrection.asJson, "TargetImageOrientationCorrection" -> o.targetImageOrientationCorrection.asJson)
  }
  final implicit val ImageTooLargeExceptionEncoder: io.circe.Encoder[avias.rekognition.models.ImageTooLargeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[avias.rekognition.models.InternalServerError.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val FaceRecordEncoder: io.circe.Encoder[avias.rekognition.models.FaceRecord] = io.circe.Encoder.instance { o => 
    Json.obj("Face" -> o.face.asJson, "FaceDetail" -> o.faceDetail.asJson)
  }
  final implicit val ModerationLabelEncoder: io.circe.Encoder[avias.rekognition.models.ModerationLabel] = io.circe.Encoder.instance { o => 
    Json.obj("Confidence" -> o.confidence.asJson, "Name" -> o.name.asJson, "ParentName" -> o.parentName.asJson)
  }
  final implicit val BoundingBoxEncoder: io.circe.Encoder[avias.rekognition.models.BoundingBox] = io.circe.Encoder.instance { o => 
    Json.obj("Width" -> o.width.asJson, "Height" -> o.height.asJson, "Left" -> o.left.asJson, "Top" -> o.top.asJson)
  }
  final implicit val AgeRangeEncoder: io.circe.Encoder[avias.rekognition.models.AgeRange] = io.circe.Encoder.instance { o => 
    Json.obj("Low" -> o.low.asJson, "High" -> o.high.asJson)
  }
  final implicit val S3ObjectEncoder: io.circe.Encoder[avias.rekognition.models.S3Object] = io.circe.Encoder.instance { o => 
    Json.obj("Bucket" -> o.bucket.asJson, "Name" -> o.name.asJson, "Version" -> o.version.asJson)
  }
  final implicit val GenderEncoder: io.circe.Encoder[avias.rekognition.models.Gender] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val EmotionEncoder: io.circe.Encoder[avias.rekognition.models.Emotion] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val LabelEncoder: io.circe.Encoder[avias.rekognition.models.Label] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val PoseEncoder: io.circe.Encoder[avias.rekognition.models.Pose] = io.circe.Encoder.instance { o => 
    Json.obj("Roll" -> o.roll.asJson, "Yaw" -> o.yaw.asJson, "Pitch" -> o.pitch.asJson)
  }
  final implicit val SmileEncoder: io.circe.Encoder[avias.rekognition.models.Smile] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val FaceDetailEncoder: io.circe.Encoder[avias.rekognition.models.FaceDetail] = io.circe.Encoder.instance { o => 
    Json.obj("Beard" -> o.beard.asJson, "BoundingBox" -> o.boundingBox.asJson, "AgeRange" -> o.ageRange.asJson, "Confidence" -> o.confidence.asJson, "Gender" -> o.gender.asJson, "Pose" -> o.pose.asJson, "Smile" -> o.smile.asJson, "Landmarks" -> o.landmarks.asJson, "Eyeglasses" -> o.eyeglasses.asJson, "Sunglasses" -> o.sunglasses.asJson, "EyesOpen" -> o.eyesOpen.asJson, "Emotions" -> o.emotions.asJson, "MouthOpen" -> o.mouthOpen.asJson, "Quality" -> o.quality.asJson, "Mustache" -> o.mustache.asJson)
  }
  final implicit val EyeglassesEncoder: io.circe.Encoder[avias.rekognition.models.Eyeglasses] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val ListFacesResponseEncoder: io.circe.Encoder[avias.rekognition.models.ListFacesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Faces" -> o.faces.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CompareFacesRequestEncoder: io.circe.Encoder[avias.rekognition.models.CompareFacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SourceImage" -> o.sourceImage.asJson, "TargetImage" -> o.targetImage.asJson, "SimilarityThreshold" -> o.similarityThreshold.asJson)
  }
  final implicit val ListCollectionsResponseEncoder: io.circe.Encoder[avias.rekognition.models.ListCollectionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionIds" -> o.collectionIds.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val SunglassesEncoder: io.circe.Encoder[avias.rekognition.models.Sunglasses] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val ComparedSourceImageFaceEncoder: io.circe.Encoder[avias.rekognition.models.ComparedSourceImageFace] = io.circe.Encoder.instance { o => 
    Json.obj("BoundingBox" -> o.boundingBox.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val CreateCollectionResponseEncoder: io.circe.Encoder[avias.rekognition.models.CreateCollectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("StatusCode" -> o.statusCode.asJson, "CollectionArn" -> o.collectionArn.asJson)
  }
  final implicit val DetectModerationLabelsRequestEncoder: io.circe.Encoder[avias.rekognition.models.DetectModerationLabelsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Image" -> o.image.asJson, "MinConfidence" -> o.minConfidence.asJson)
  }
  final implicit val IndexFacesRequestEncoder: io.circe.Encoder[avias.rekognition.models.IndexFacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson, "Image" -> o.image.asJson, "ExternalImageId" -> o.externalImageId.asJson, "DetectionAttributes" -> o.detectionAttributes.asJson)
  }
  final implicit val InvalidPaginationTokenExceptionEncoder: io.circe.Encoder[avias.rekognition.models.InvalidPaginationTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCelebrityInfoRequestEncoder: io.circe.Encoder[avias.rekognition.models.GetCelebrityInfoRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson)
  }
  final implicit val SearchFacesRequestEncoder: io.circe.Encoder[avias.rekognition.models.SearchFacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson, "FaceId" -> o.faceId.asJson, "MaxFaces" -> o.maxFaces.asJson, "FaceMatchThreshold" -> o.faceMatchThreshold.asJson)
  }
  final implicit val EyeOpenEncoder: io.circe.Encoder[avias.rekognition.models.EyeOpen] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val GetCelebrityInfoResponseEncoder: io.circe.Encoder[avias.rekognition.models.GetCelebrityInfoResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Urls" -> o.urls.asJson, "Name" -> o.name.asJson)
  }
  final implicit val CreateCollectionRequestEncoder: io.circe.Encoder[avias.rekognition.models.CreateCollectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson)
  }
  final implicit val MouthOpenEncoder: io.circe.Encoder[avias.rekognition.models.MouthOpen] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val DetectLabelsResponseEncoder: io.circe.Encoder[avias.rekognition.models.DetectLabelsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Labels" -> o.labels.asJson, "OrientationCorrection" -> o.orientationCorrection.asJson)
  }
  final implicit val CompareFacesMatchEncoder: io.circe.Encoder[avias.rekognition.models.CompareFacesMatch] = io.circe.Encoder.instance { o => 
    Json.obj("Similarity" -> o.similarity.asJson, "Face" -> o.face.asJson)
  }
  final implicit val ListFacesRequestEncoder: io.circe.Encoder[avias.rekognition.models.ListFacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val SearchFacesResponseEncoder: io.circe.Encoder[avias.rekognition.models.SearchFacesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SearchedFaceId" -> o.searchedFaceId.asJson, "FaceMatches" -> o.faceMatches.asJson)
  }
  final implicit val CelebrityEncoder: io.circe.Encoder[avias.rekognition.models.Celebrity] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "MatchConfidence" -> o.matchConfidence.asJson, "Urls" -> o.urls.asJson, "Face" -> o.face.asJson, "Id" -> o.id.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[avias.rekognition.models.AccessDeniedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteFacesRequestEncoder: io.circe.Encoder[avias.rekognition.models.DeleteFacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson, "FaceIds" -> o.faceIds.asJson)
  }
  final implicit val IndexFacesResponseEncoder: io.circe.Encoder[avias.rekognition.models.IndexFacesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FaceRecords" -> o.faceRecords.asJson, "OrientationCorrection" -> o.orientationCorrection.asJson)
  }
  final implicit val LandmarkEncoder: io.circe.Encoder[avias.rekognition.models.Landmark] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "X" -> o.x.asJson, "Y" -> o.y.asJson)
  }
  final implicit val SearchFacesByImageRequestEncoder: io.circe.Encoder[avias.rekognition.models.SearchFacesByImageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson, "Image" -> o.image.asJson, "MaxFaces" -> o.maxFaces.asJson, "FaceMatchThreshold" -> o.faceMatchThreshold.asJson)
  }
  final implicit val ListCollectionsRequestEncoder: io.circe.Encoder[avias.rekognition.models.ListCollectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DetectModerationLabelsResponseEncoder: io.circe.Encoder[avias.rekognition.models.DetectModerationLabelsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ModerationLabels" -> o.moderationLabels.asJson)
  }
  final implicit val DetectFacesRequestEncoder: io.circe.Encoder[avias.rekognition.models.DetectFacesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Image" -> o.image.asJson, "Attributes" -> o.attributes.asJson)
  }
  final implicit val DeleteFacesResponseEncoder: io.circe.Encoder[avias.rekognition.models.DeleteFacesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DeletedFaces" -> o.deletedFaces.asJson)
  }
  final implicit val InvalidS3ObjectExceptionEncoder: io.circe.Encoder[avias.rekognition.models.InvalidS3ObjectException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.rekognition.models.InvalidParameterException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteCollectionResponseEncoder: io.circe.Encoder[avias.rekognition.models.DeleteCollectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("StatusCode" -> o.statusCode.asJson)
  }
  final implicit val SearchFacesByImageResponseEncoder: io.circe.Encoder[avias.rekognition.models.SearchFacesByImageResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SearchedFaceBoundingBox" -> o.searchedFaceBoundingBox.asJson, "SearchedFaceConfidence" -> o.searchedFaceConfidence.asJson, "FaceMatches" -> o.faceMatches.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.rekognition.models.ResourceAlreadyExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val FaceEncoder: io.circe.Encoder[avias.rekognition.models.Face] = io.circe.Encoder.instance { o => 
    Json.obj("BoundingBox" -> o.boundingBox.asJson, "Confidence" -> o.confidence.asJson, "ExternalImageId" -> o.externalImageId.asJson, "FaceId" -> o.faceId.asJson, "ImageId" -> o.imageId.asJson)
  }
  final implicit val ImageQualityEncoder: io.circe.Encoder[avias.rekognition.models.ImageQuality] = io.circe.Encoder.instance { o => 
    Json.obj("Brightness" -> o.brightness.asJson, "Sharpness" -> o.sharpness.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.rekognition.models.ResourceNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MustacheEncoder: io.circe.Encoder[avias.rekognition.models.Mustache] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Confidence" -> o.confidence.asJson)
  }
  final implicit val DetectLabelsRequestEncoder: io.circe.Encoder[avias.rekognition.models.DetectLabelsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Image" -> o.image.asJson, "MaxLabels" -> o.maxLabels.asJson, "MinConfidence" -> o.minConfidence.asJson)
  }
  final implicit val DetectFacesResponseEncoder: io.circe.Encoder[avias.rekognition.models.DetectFacesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FaceDetails" -> o.faceDetails.asJson, "OrientationCorrection" -> o.orientationCorrection.asJson)
  }
  final implicit val DeleteCollectionRequestEncoder: io.circe.Encoder[avias.rekognition.models.DeleteCollectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CollectionId" -> o.collectionId.asJson)
  }
  final implicit val ComparedFaceEncoder: io.circe.Encoder[avias.rekognition.models.ComparedFace] = io.circe.Encoder.instance { o => 
    Json.obj("BoundingBox" -> o.boundingBox.asJson, "Confidence" -> o.confidence.asJson, "Pose" -> o.pose.asJson, "Landmarks" -> o.landmarks.asJson, "Quality" -> o.quality.asJson)
  }
  final implicit val ProvisionedThroughputExceededExceptionEncoder: io.circe.Encoder[avias.rekognition.models.ProvisionedThroughputExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val FaceMatchEncoder: io.circe.Encoder[avias.rekognition.models.FaceMatch] = io.circe.Encoder.instance { o => 
    Json.obj("Similarity" -> o.similarity.asJson, "Face" -> o.face.asJson)
  }
  final implicit val RecognizeCelebritiesResponseEncoder: io.circe.Encoder[avias.rekognition.models.RecognizeCelebritiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CelebrityFaces" -> o.celebrityFaces.asJson, "UnrecognizedFaces" -> o.unrecognizedFaces.asJson, "OrientationCorrection" -> o.orientationCorrection.asJson)
  }
  final implicit val BeardDecoder: io.circe.Decoder[avias.rekognition.models.Beard] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Beard.apply _)
  }
  final implicit val ImageDecoder: io.circe.Decoder[avias.rekognition.models.Image] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("Bytes"), o.get[scala.Option[avias.rekognition.models.S3Object]]("S3Object")).mapN(avias.rekognition.models.Image.apply _)
  }
  final implicit val RecognizeCelebritiesRequestDecoder: io.circe.Decoder[avias.rekognition.models.RecognizeCelebritiesRequest] = io.circe.Decoder.instance { o => 
    o.get[avias.rekognition.models.Image]("Image").map(avias.rekognition.models.RecognizeCelebritiesRequest.apply _)
  }
  final implicit val InvalidImageFormatExceptionDecoder: io.circe.Decoder[avias.rekognition.models.InvalidImageFormatException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.InvalidImageFormatException)
  final implicit val ThrottlingExceptionDecoder: io.circe.Decoder[avias.rekognition.models.ThrottlingException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.ThrottlingException)
  final implicit val CompareFacesResponseDecoder: io.circe.Decoder[avias.rekognition.models.CompareFacesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.ComparedSourceImageFace]]("SourceImageFace"), o.get[scala.Option[scala.List[avias.rekognition.models.CompareFacesMatch]]]("FaceMatches"), o.get[scala.Option[scala.List[avias.rekognition.models.ComparedFace]]]("UnmatchedFaces"), o.get[scala.Option[java.lang.String]]("SourceImageOrientationCorrection"), o.get[scala.Option[java.lang.String]]("TargetImageOrientationCorrection")).mapN(avias.rekognition.models.CompareFacesResponse.apply _)
  }
  final implicit val ImageTooLargeExceptionDecoder: io.circe.Decoder[avias.rekognition.models.ImageTooLargeException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.ImageTooLargeException)
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[avias.rekognition.models.InternalServerError.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.InternalServerError)
  final implicit val FaceRecordDecoder: io.circe.Decoder[avias.rekognition.models.FaceRecord] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.Face]]("Face"), o.get[scala.Option[avias.rekognition.models.FaceDetail]]("FaceDetail")).mapN(avias.rekognition.models.FaceRecord.apply _)
  }
  final implicit val ModerationLabelDecoder: io.circe.Decoder[avias.rekognition.models.ModerationLabel] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("Confidence"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ParentName")).mapN(avias.rekognition.models.ModerationLabel.apply _)
  }
  final implicit val BoundingBoxDecoder: io.circe.Decoder[avias.rekognition.models.BoundingBox] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("Width"), o.get[scala.Option[scala.Float]]("Height"), o.get[scala.Option[scala.Float]]("Left"), o.get[scala.Option[scala.Float]]("Top")).mapN(avias.rekognition.models.BoundingBox.apply _)
  }
  final implicit val AgeRangeDecoder: io.circe.Decoder[avias.rekognition.models.AgeRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Low"), o.get[scala.Option[scala.Int]]("High")).mapN(avias.rekognition.models.AgeRange.apply _)
  }
  final implicit val S3ObjectDecoder: io.circe.Decoder[avias.rekognition.models.S3Object] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Bucket"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Version")).mapN(avias.rekognition.models.S3Object.apply _)
  }
  final implicit val GenderDecoder: io.circe.Decoder[avias.rekognition.models.Gender] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Gender.apply _)
  }
  final implicit val EmotionDecoder: io.circe.Decoder[avias.rekognition.models.Emotion] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Emotion.apply _)
  }
  final implicit val LabelDecoder: io.circe.Decoder[avias.rekognition.models.Label] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Label.apply _)
  }
  final implicit val PoseDecoder: io.circe.Decoder[avias.rekognition.models.Pose] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("Roll"), o.get[scala.Option[scala.Float]]("Yaw"), o.get[scala.Option[scala.Float]]("Pitch")).mapN(avias.rekognition.models.Pose.apply _)
  }
  final implicit val SmileDecoder: io.circe.Decoder[avias.rekognition.models.Smile] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Smile.apply _)
  }
  final implicit val FaceDetailDecoder: io.circe.Decoder[avias.rekognition.models.FaceDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.Beard]]("Beard"), o.get[scala.Option[avias.rekognition.models.BoundingBox]]("BoundingBox"), o.get[scala.Option[avias.rekognition.models.AgeRange]]("AgeRange"), o.get[scala.Option[scala.Float]]("Confidence"), o.get[scala.Option[avias.rekognition.models.Gender]]("Gender"), o.get[scala.Option[avias.rekognition.models.Pose]]("Pose"), o.get[scala.Option[avias.rekognition.models.Smile]]("Smile"), o.get[scala.Option[scala.List[avias.rekognition.models.Landmark]]]("Landmarks"), o.get[scala.Option[avias.rekognition.models.Eyeglasses]]("Eyeglasses"), o.get[scala.Option[avias.rekognition.models.Sunglasses]]("Sunglasses"), o.get[scala.Option[avias.rekognition.models.EyeOpen]]("EyesOpen"), o.get[scala.Option[scala.List[avias.rekognition.models.Emotion]]]("Emotions"), o.get[scala.Option[avias.rekognition.models.MouthOpen]]("MouthOpen"), o.get[scala.Option[avias.rekognition.models.ImageQuality]]("Quality"), o.get[scala.Option[avias.rekognition.models.Mustache]]("Mustache")).mapN(avias.rekognition.models.FaceDetail.apply _)
  }
  final implicit val EyeglassesDecoder: io.circe.Decoder[avias.rekognition.models.Eyeglasses] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Eyeglasses.apply _)
  }
  final implicit val ListFacesResponseDecoder: io.circe.Decoder[avias.rekognition.models.ListFacesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.rekognition.models.Face]]]("Faces"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.rekognition.models.ListFacesResponse.apply _)
  }
  final implicit val CompareFacesRequestDecoder: io.circe.Decoder[avias.rekognition.models.CompareFacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.rekognition.models.Image]("SourceImage"), o.get[avias.rekognition.models.Image]("TargetImage"), o.get[scala.Option[scala.Float]]("SimilarityThreshold")).mapN(avias.rekognition.models.CompareFacesRequest.apply _)
  }
  final implicit val ListCollectionsResponseDecoder: io.circe.Decoder[avias.rekognition.models.ListCollectionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("CollectionIds"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.rekognition.models.ListCollectionsResponse.apply _)
  }
  final implicit val SunglassesDecoder: io.circe.Decoder[avias.rekognition.models.Sunglasses] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Sunglasses.apply _)
  }
  final implicit val ComparedSourceImageFaceDecoder: io.circe.Decoder[avias.rekognition.models.ComparedSourceImageFace] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.BoundingBox]]("BoundingBox"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.ComparedSourceImageFace.apply _)
  }
  final implicit val CreateCollectionResponseDecoder: io.circe.Decoder[avias.rekognition.models.CreateCollectionResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("StatusCode"), o.get[scala.Option[java.lang.String]]("CollectionArn")).mapN(avias.rekognition.models.CreateCollectionResponse.apply _)
  }
  final implicit val DetectModerationLabelsRequestDecoder: io.circe.Decoder[avias.rekognition.models.DetectModerationLabelsRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.rekognition.models.Image]("Image"), o.get[scala.Option[scala.Float]]("MinConfidence")).mapN(avias.rekognition.models.DetectModerationLabelsRequest.apply _)
  }
  final implicit val IndexFacesRequestDecoder: io.circe.Decoder[avias.rekognition.models.IndexFacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CollectionId"), o.get[avias.rekognition.models.Image]("Image"), o.get[scala.Option[java.lang.String]]("ExternalImageId"), o.get[scala.Option[scala.List[java.lang.String]]]("DetectionAttributes")).mapN(avias.rekognition.models.IndexFacesRequest.apply _)
  }
  final implicit val InvalidPaginationTokenExceptionDecoder: io.circe.Decoder[avias.rekognition.models.InvalidPaginationTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.InvalidPaginationTokenException)
  final implicit val GetCelebrityInfoRequestDecoder: io.circe.Decoder[avias.rekognition.models.GetCelebrityInfoRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Id").map(avias.rekognition.models.GetCelebrityInfoRequest.apply _)
  }
  final implicit val SearchFacesRequestDecoder: io.circe.Decoder[avias.rekognition.models.SearchFacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CollectionId"), o.get[java.lang.String]("FaceId"), o.get[scala.Option[scala.Int]]("MaxFaces"), o.get[scala.Option[scala.Float]]("FaceMatchThreshold")).mapN(avias.rekognition.models.SearchFacesRequest.apply _)
  }
  final implicit val EyeOpenDecoder: io.circe.Decoder[avias.rekognition.models.EyeOpen] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.EyeOpen.apply _)
  }
  final implicit val GetCelebrityInfoResponseDecoder: io.circe.Decoder[avias.rekognition.models.GetCelebrityInfoResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("Urls"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.rekognition.models.GetCelebrityInfoResponse.apply _)
  }
  final implicit val CreateCollectionRequestDecoder: io.circe.Decoder[avias.rekognition.models.CreateCollectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CollectionId").map(avias.rekognition.models.CreateCollectionRequest.apply _)
  }
  final implicit val MouthOpenDecoder: io.circe.Decoder[avias.rekognition.models.MouthOpen] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.MouthOpen.apply _)
  }
  final implicit val DetectLabelsResponseDecoder: io.circe.Decoder[avias.rekognition.models.DetectLabelsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.rekognition.models.Label]]]("Labels"), o.get[scala.Option[java.lang.String]]("OrientationCorrection")).mapN(avias.rekognition.models.DetectLabelsResponse.apply _)
  }
  final implicit val CompareFacesMatchDecoder: io.circe.Decoder[avias.rekognition.models.CompareFacesMatch] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("Similarity"), o.get[scala.Option[avias.rekognition.models.ComparedFace]]("Face")).mapN(avias.rekognition.models.CompareFacesMatch.apply _)
  }
  final implicit val ListFacesRequestDecoder: io.circe.Decoder[avias.rekognition.models.ListFacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CollectionId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.rekognition.models.ListFacesRequest.apply _)
  }
  final implicit val SearchFacesResponseDecoder: io.circe.Decoder[avias.rekognition.models.SearchFacesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SearchedFaceId"), o.get[scala.Option[scala.List[avias.rekognition.models.FaceMatch]]]("FaceMatches")).mapN(avias.rekognition.models.SearchFacesResponse.apply _)
  }
  final implicit val CelebrityDecoder: io.circe.Decoder[avias.rekognition.models.Celebrity] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Float]]("MatchConfidence"), o.get[scala.Option[scala.List[java.lang.String]]]("Urls"), o.get[scala.Option[avias.rekognition.models.ComparedFace]]("Face"), o.get[scala.Option[java.lang.String]]("Id")).mapN(avias.rekognition.models.Celebrity.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[avias.rekognition.models.AccessDeniedException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.AccessDeniedException)
  final implicit val DeleteFacesRequestDecoder: io.circe.Decoder[avias.rekognition.models.DeleteFacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CollectionId"), o.get[scala.List[java.lang.String]]("FaceIds")).mapN(avias.rekognition.models.DeleteFacesRequest.apply _)
  }
  final implicit val IndexFacesResponseDecoder: io.circe.Decoder[avias.rekognition.models.IndexFacesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.rekognition.models.FaceRecord]]]("FaceRecords"), o.get[scala.Option[java.lang.String]]("OrientationCorrection")).mapN(avias.rekognition.models.IndexFacesResponse.apply _)
  }
  final implicit val LandmarkDecoder: io.circe.Decoder[avias.rekognition.models.Landmark] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.Float]]("X"), o.get[scala.Option[scala.Float]]("Y")).mapN(avias.rekognition.models.Landmark.apply _)
  }
  final implicit val SearchFacesByImageRequestDecoder: io.circe.Decoder[avias.rekognition.models.SearchFacesByImageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("CollectionId"), o.get[avias.rekognition.models.Image]("Image"), o.get[scala.Option[scala.Int]]("MaxFaces"), o.get[scala.Option[scala.Float]]("FaceMatchThreshold")).mapN(avias.rekognition.models.SearchFacesByImageRequest.apply _)
  }
  final implicit val ListCollectionsRequestDecoder: io.circe.Decoder[avias.rekognition.models.ListCollectionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.rekognition.models.ListCollectionsRequest.apply _)
  }
  final implicit val DetectModerationLabelsResponseDecoder: io.circe.Decoder[avias.rekognition.models.DetectModerationLabelsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.rekognition.models.ModerationLabel]]]("ModerationLabels").map(avias.rekognition.models.DetectModerationLabelsResponse.apply _)
  }
  final implicit val DetectFacesRequestDecoder: io.circe.Decoder[avias.rekognition.models.DetectFacesRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.rekognition.models.Image]("Image"), o.get[scala.Option[scala.List[java.lang.String]]]("Attributes")).mapN(avias.rekognition.models.DetectFacesRequest.apply _)
  }
  final implicit val DeleteFacesResponseDecoder: io.circe.Decoder[avias.rekognition.models.DeleteFacesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("DeletedFaces").map(avias.rekognition.models.DeleteFacesResponse.apply _)
  }
  final implicit val InvalidS3ObjectExceptionDecoder: io.circe.Decoder[avias.rekognition.models.InvalidS3ObjectException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.InvalidS3ObjectException)
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.rekognition.models.InvalidParameterException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.InvalidParameterException)
  final implicit val DeleteCollectionResponseDecoder: io.circe.Decoder[avias.rekognition.models.DeleteCollectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("StatusCode").map(avias.rekognition.models.DeleteCollectionResponse.apply _)
  }
  final implicit val SearchFacesByImageResponseDecoder: io.circe.Decoder[avias.rekognition.models.SearchFacesByImageResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.BoundingBox]]("SearchedFaceBoundingBox"), o.get[scala.Option[scala.Float]]("SearchedFaceConfidence"), o.get[scala.Option[scala.List[avias.rekognition.models.FaceMatch]]]("FaceMatches")).mapN(avias.rekognition.models.SearchFacesByImageResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.rekognition.models.ResourceAlreadyExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.ResourceAlreadyExistsException)
  final implicit val FaceDecoder: io.circe.Decoder[avias.rekognition.models.Face] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.BoundingBox]]("BoundingBox"), o.get[scala.Option[scala.Float]]("Confidence"), o.get[scala.Option[java.lang.String]]("ExternalImageId"), o.get[scala.Option[java.lang.String]]("FaceId"), o.get[scala.Option[java.lang.String]]("ImageId")).mapN(avias.rekognition.models.Face.apply _)
  }
  final implicit val ImageQualityDecoder: io.circe.Decoder[avias.rekognition.models.ImageQuality] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("Brightness"), o.get[scala.Option[scala.Float]]("Sharpness")).mapN(avias.rekognition.models.ImageQuality.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.rekognition.models.ResourceNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.ResourceNotFoundException)
  final implicit val MustacheDecoder: io.circe.Decoder[avias.rekognition.models.Mustache] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("Value"), o.get[scala.Option[scala.Float]]("Confidence")).mapN(avias.rekognition.models.Mustache.apply _)
  }
  final implicit val DetectLabelsRequestDecoder: io.circe.Decoder[avias.rekognition.models.DetectLabelsRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.rekognition.models.Image]("Image"), o.get[scala.Option[scala.Int]]("MaxLabels"), o.get[scala.Option[scala.Float]]("MinConfidence")).mapN(avias.rekognition.models.DetectLabelsRequest.apply _)
  }
  final implicit val DetectFacesResponseDecoder: io.circe.Decoder[avias.rekognition.models.DetectFacesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.rekognition.models.FaceDetail]]]("FaceDetails"), o.get[scala.Option[java.lang.String]]("OrientationCorrection")).mapN(avias.rekognition.models.DetectFacesResponse.apply _)
  }
  final implicit val DeleteCollectionRequestDecoder: io.circe.Decoder[avias.rekognition.models.DeleteCollectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CollectionId").map(avias.rekognition.models.DeleteCollectionRequest.apply _)
  }
  final implicit val ComparedFaceDecoder: io.circe.Decoder[avias.rekognition.models.ComparedFace] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.rekognition.models.BoundingBox]]("BoundingBox"), o.get[scala.Option[scala.Float]]("Confidence"), o.get[scala.Option[avias.rekognition.models.Pose]]("Pose"), o.get[scala.Option[scala.List[avias.rekognition.models.Landmark]]]("Landmarks"), o.get[scala.Option[avias.rekognition.models.ImageQuality]]("Quality")).mapN(avias.rekognition.models.ComparedFace.apply _)
  }
  final implicit val ProvisionedThroughputExceededExceptionDecoder: io.circe.Decoder[avias.rekognition.models.ProvisionedThroughputExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.rekognition.models.ProvisionedThroughputExceededException)
  final implicit val FaceMatchDecoder: io.circe.Decoder[avias.rekognition.models.FaceMatch] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Float]]("Similarity"), o.get[scala.Option[avias.rekognition.models.Face]]("Face")).mapN(avias.rekognition.models.FaceMatch.apply _)
  }
  final implicit val RecognizeCelebritiesResponseDecoder: io.circe.Decoder[avias.rekognition.models.RecognizeCelebritiesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.rekognition.models.Celebrity]]]("CelebrityFaces"), o.get[scala.Option[scala.List[avias.rekognition.models.ComparedFace]]]("UnrecognizedFaces"), o.get[scala.Option[java.lang.String]]("OrientationCorrection")).mapN(avias.rekognition.models.RecognizeCelebritiesResponse.apply _)
  }
}