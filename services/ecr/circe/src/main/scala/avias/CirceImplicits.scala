package avias.ecr
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val CreateRepositoryRequestEncoder: io.circe.Encoder[avias.ecr.models.CreateRepositoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val BatchDeleteImageResponseEncoder: io.circe.Encoder[avias.ecr.models.BatchDeleteImageResponse] = io.circe.Encoder.instance { o => 
    Json.obj("imageIds" -> o.imageIds.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val BatchGetImageRequestEncoder: io.circe.Encoder[avias.ecr.models.BatchGetImageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "imageIds" -> o.imageIds.asJson, "registryId" -> o.registryId.asJson, "acceptedMediaTypes" -> o.acceptedMediaTypes.asJson)
  }
  final implicit val BatchCheckLayerAvailabilityRequestEncoder: io.circe.Encoder[avias.ecr.models.BatchCheckLayerAvailabilityRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "layerDigests" -> o.layerDigests.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val DeleteRepositoryPolicyRequestEncoder: io.circe.Encoder[avias.ecr.models.DeleteRepositoryPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val UploadNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.UploadNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetLifecyclePolicyPreviewRequestEncoder: io.circe.Encoder[avias.ecr.models.GetLifecyclePolicyPreviewRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson, "filter" -> o.filter.asJson, "maxResults" -> o.maxResults.asJson, "imageIds" -> o.imageIds.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val PutImageRequestEncoder: io.circe.Encoder[avias.ecr.models.PutImageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "imageManifest" -> o.imageManifest.asJson, "registryId" -> o.registryId.asJson, "imageTag" -> o.imageTag.asJson)
  }
  final implicit val DeleteLifecyclePolicyResponseEncoder: io.circe.Encoder[avias.ecr.models.DeleteLifecyclePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson, "lastEvaluatedAt" -> o.lastEvaluatedAt.asJson)
  }
  final implicit val LifecyclePolicyPreviewFilterEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyPreviewFilter] = io.circe.Encoder.instance { o => 
    Json.obj("tagStatus" -> o.tagStatus.asJson)
  }
  final implicit val LifecyclePolicyPreviewSummaryEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyPreviewSummary] = io.circe.Encoder.instance { o => 
    Json.obj("expiringImageTotalCount" -> o.expiringImageTotalCount.asJson)
  }
  final implicit val DeleteRepositoryResponseEncoder: io.circe.Encoder[avias.ecr.models.DeleteRepositoryResponse] = io.circe.Encoder.instance { o => 
    Json.obj("repository" -> o.repository.asJson)
  }
  final implicit val LayerFailureEncoder: io.circe.Encoder[avias.ecr.models.LayerFailure] = io.circe.Encoder.instance { o => 
    Json.obj("layerDigest" -> o.layerDigest.asJson, "failureCode" -> o.failureCode.asJson, "failureReason" -> o.failureReason.asJson)
  }
  final implicit val LifecyclePolicyPreviewNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyPreviewNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val BatchCheckLayerAvailabilityResponseEncoder: io.circe.Encoder[avias.ecr.models.BatchCheckLayerAvailabilityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("layers" -> o.layers.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val ListImagesResponseEncoder: io.circe.Encoder[avias.ecr.models.ListImagesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("imageIds" -> o.imageIds.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StartLifecyclePolicyPreviewResponseEncoder: io.circe.Encoder[avias.ecr.models.StartLifecyclePolicyPreviewResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson, "status" -> o.status.asJson)
  }
  final implicit val CompleteLayerUploadResponseEncoder: io.circe.Encoder[avias.ecr.models.CompleteLayerUploadResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "uploadId" -> o.uploadId.asJson, "layerDigest" -> o.layerDigest.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.ecr.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InitiateLayerUploadRequestEncoder: io.circe.Encoder[avias.ecr.models.InitiateLayerUploadRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val GetLifecyclePolicyPreviewResponseEncoder: io.circe.Encoder[avias.ecr.models.GetLifecyclePolicyPreviewResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "summary" -> o.summary.asJson, "status" -> o.status.asJson, "repositoryName" -> o.repositoryName.asJson, "previewResults" -> o.previewResults.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListImagesFilterEncoder: io.circe.Encoder[avias.ecr.models.ListImagesFilter] = io.circe.Encoder.instance { o => 
    Json.obj("tagStatus" -> o.tagStatus.asJson)
  }
  final implicit val InvalidLayerPartExceptionEncoder: io.circe.Encoder[avias.ecr.models.InvalidLayerPartException] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "lastValidByteReceived" -> o.lastValidByteReceived.asJson, "message" -> o.message.asJson, "repositoryName" -> o.repositoryName.asJson, "uploadId" -> o.uploadId.asJson)
  }
  final implicit val BatchGetImageResponseEncoder: io.circe.Encoder[avias.ecr.models.BatchGetImageResponse] = io.circe.Encoder.instance { o => 
    Json.obj("images" -> o.images.asJson, "failures" -> o.failures.asJson)
  }
  final implicit val RepositoryEncoder: io.circe.Encoder[avias.ecr.models.Repository] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryArn" -> o.repositoryArn.asJson, "repositoryName" -> o.repositoryName.asJson, "createdAt" -> o.createdAt.asJson, "repositoryUri" -> o.repositoryUri.asJson)
  }
  final implicit val SetRepositoryPolicyResponseEncoder: io.circe.Encoder[avias.ecr.models.SetRepositoryPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "policyText" -> o.policyText.asJson)
  }
  final implicit val AuthorizationDataEncoder: io.circe.Encoder[avias.ecr.models.AuthorizationData] = io.circe.Encoder.instance { o => 
    Json.obj("authorizationToken" -> o.authorizationToken.asJson, "expiresAt" -> o.expiresAt.asJson, "proxyEndpoint" -> o.proxyEndpoint.asJson)
  }
  final implicit val EmptyUploadExceptionEncoder: io.circe.Encoder[avias.ecr.models.EmptyUploadException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RepositoryNotEmptyExceptionEncoder: io.circe.Encoder[avias.ecr.models.RepositoryNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteLifecyclePolicyRequestEncoder: io.circe.Encoder[avias.ecr.models.DeleteLifecyclePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val GetLifecyclePolicyRequestEncoder: io.circe.Encoder[avias.ecr.models.GetLifecyclePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val GetRepositoryPolicyRequestEncoder: io.circe.Encoder[avias.ecr.models.GetRepositoryPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val GetAuthorizationTokenResponseEncoder: io.circe.Encoder[avias.ecr.models.GetAuthorizationTokenResponse] = io.circe.Encoder.instance { o => 
    Json.obj("authorizationData" -> o.authorizationData.asJson)
  }
  final implicit val ImageFailureEncoder: io.circe.Encoder[avias.ecr.models.ImageFailure] = io.circe.Encoder.instance { o => 
    Json.obj("imageId" -> o.imageId.asJson, "failureCode" -> o.failureCode.asJson, "failureReason" -> o.failureReason.asJson)
  }
  final implicit val StartLifecyclePolicyPreviewRequestEncoder: io.circe.Encoder[avias.ecr.models.StartLifecyclePolicyPreviewRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson)
  }
  final implicit val DescribeRepositoriesRequestEncoder: io.circe.Encoder[avias.ecr.models.DescribeRepositoriesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryNames" -> o.repositoryNames.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteRepositoryRequestEncoder: io.circe.Encoder[avias.ecr.models.DeleteRepositoryRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson, "force" -> o.force.asJson)
  }
  final implicit val PutImageResponseEncoder: io.circe.Encoder[avias.ecr.models.PutImageResponse] = io.circe.Encoder.instance { o => 
    Json.obj("image" -> o.image.asJson)
  }
  final implicit val ImageAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.ecr.models.ImageAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InitiateLayerUploadResponseEncoder: io.circe.Encoder[avias.ecr.models.InitiateLayerUploadResponse] = io.circe.Encoder.instance { o => 
    Json.obj("uploadId" -> o.uploadId.asJson, "partSize" -> o.partSize.asJson)
  }
  final implicit val CreateRepositoryResponseEncoder: io.circe.Encoder[avias.ecr.models.CreateRepositoryResponse] = io.circe.Encoder.instance { o => 
    Json.obj("repository" -> o.repository.asJson)
  }
  final implicit val ListImagesRequestEncoder: io.circe.Encoder[avias.ecr.models.ListImagesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson, "filter" -> o.filter.asJson, "maxResults" -> o.maxResults.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CompleteLayerUploadRequestEncoder: io.circe.Encoder[avias.ecr.models.CompleteLayerUploadRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "uploadId" -> o.uploadId.asJson, "layerDigests" -> o.layerDigests.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val GetDownloadUrlForLayerRequestEncoder: io.circe.Encoder[avias.ecr.models.GetDownloadUrlForLayerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "layerDigest" -> o.layerDigest.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val LifecyclePolicyPreviewInProgressExceptionEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyPreviewInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LayersNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.LayersNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UploadLayerPartResponseEncoder: io.circe.Encoder[avias.ecr.models.UploadLayerPartResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "uploadId" -> o.uploadId.asJson, "lastByteReceived" -> o.lastByteReceived.asJson)
  }
  final implicit val GetLifecyclePolicyResponseEncoder: io.circe.Encoder[avias.ecr.models.GetLifecyclePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson, "lastEvaluatedAt" -> o.lastEvaluatedAt.asJson)
  }
  final implicit val DescribeImagesResponseEncoder: io.circe.Encoder[avias.ecr.models.DescribeImagesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("imageDetails" -> o.imageDetails.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RepositoryNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.RepositoryNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SetRepositoryPolicyRequestEncoder: io.circe.Encoder[avias.ecr.models.SetRepositoryPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "policyText" -> o.policyText.asJson, "registryId" -> o.registryId.asJson, "force" -> o.force.asJson)
  }
  final implicit val LayerEncoder: io.circe.Encoder[avias.ecr.models.Layer] = io.circe.Encoder.instance { o => 
    Json.obj("layerDigest" -> o.layerDigest.asJson, "layerAvailability" -> o.layerAvailability.asJson, "layerSize" -> o.layerSize.asJson, "mediaType" -> o.mediaType.asJson)
  }
  final implicit val DescribeRepositoriesResponseEncoder: io.circe.Encoder[avias.ecr.models.DescribeRepositoriesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("repositories" -> o.repositories.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeImagesRequestEncoder: io.circe.Encoder[avias.ecr.models.DescribeImagesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "registryId" -> o.registryId.asJson, "maxResults" -> o.maxResults.asJson, "imageIds" -> o.imageIds.asJson, "filter" -> o.filter.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RepositoryAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.ecr.models.RepositoryAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ImageDetailEncoder: io.circe.Encoder[avias.ecr.models.ImageDetail] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "imageDigest" -> o.imageDigest.asJson, "repositoryName" -> o.repositoryName.asJson, "imageSizeInBytes" -> o.imageSizeInBytes.asJson, "imageTags" -> o.imageTags.asJson, "imagePushedAt" -> o.imagePushedAt.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.ecr.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LifecyclePolicyPreviewResultEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyPreviewResult] = io.circe.Encoder.instance { o => 
    Json.obj("imageDigest" -> o.imageDigest.asJson, "imageTags" -> o.imageTags.asJson, "imagePushedAt" -> o.imagePushedAt.asJson, "appliedRulePriority" -> o.appliedRulePriority.asJson, "action" -> o.action.asJson)
  }
  final implicit val RepositoryPolicyNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.RepositoryPolicyNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LayerAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.ecr.models.LayerAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LifecyclePolicyNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LayerInaccessibleExceptionEncoder: io.circe.Encoder[avias.ecr.models.LayerInaccessibleException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetAuthorizationTokenRequestEncoder: io.circe.Encoder[avias.ecr.models.GetAuthorizationTokenRequest] = io.circe.Encoder.instance { o => 
    Json.obj("registryIds" -> o.registryIds.asJson)
  }
  final implicit val PutLifecyclePolicyRequestEncoder: io.circe.Encoder[avias.ecr.models.PutLifecyclePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val PutLifecyclePolicyResponseEncoder: io.circe.Encoder[avias.ecr.models.PutLifecyclePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "lifecyclePolicyText" -> o.lifecyclePolicyText.asJson)
  }
  final implicit val GetDownloadUrlForLayerResponseEncoder: io.circe.Encoder[avias.ecr.models.GetDownloadUrlForLayerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("downloadUrl" -> o.downloadUrl.asJson, "layerDigest" -> o.layerDigest.asJson)
  }
  final implicit val DeleteRepositoryPolicyResponseEncoder: io.circe.Encoder[avias.ecr.models.DeleteRepositoryPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "policyText" -> o.policyText.asJson)
  }
  final implicit val BatchDeleteImageRequestEncoder: io.circe.Encoder[avias.ecr.models.BatchDeleteImageRequest] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "imageIds" -> o.imageIds.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val LayerPartTooSmallExceptionEncoder: io.circe.Encoder[avias.ecr.models.LayerPartTooSmallException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ServerExceptionEncoder: io.circe.Encoder[avias.ecr.models.ServerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetRepositoryPolicyResponseEncoder: io.circe.Encoder[avias.ecr.models.GetRepositoryPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "policyText" -> o.policyText.asJson)
  }
  final implicit val UploadLayerPartRequestEncoder: io.circe.Encoder[avias.ecr.models.UploadLayerPartRequest] = io.circe.Encoder.instance { o => 
    Json.obj("partFirstByte" -> o.partFirstByte.asJson, "partLastByte" -> o.partLastByte.asJson, "layerPartBlob" -> o.layerPartBlob.asJson, "repositoryName" -> o.repositoryName.asJson, "uploadId" -> o.uploadId.asJson, "registryId" -> o.registryId.asJson)
  }
  final implicit val DescribeImagesFilterEncoder: io.circe.Encoder[avias.ecr.models.DescribeImagesFilter] = io.circe.Encoder.instance { o => 
    Json.obj("tagStatus" -> o.tagStatus.asJson)
  }
  final implicit val ImageIdentifierEncoder: io.circe.Encoder[avias.ecr.models.ImageIdentifier] = io.circe.Encoder.instance { o => 
    Json.obj("imageDigest" -> o.imageDigest.asJson, "imageTag" -> o.imageTag.asJson)
  }
  final implicit val InvalidLayerExceptionEncoder: io.circe.Encoder[avias.ecr.models.InvalidLayerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ImageNotFoundExceptionEncoder: io.circe.Encoder[avias.ecr.models.ImageNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ImageEncoder: io.circe.Encoder[avias.ecr.models.Image] = io.circe.Encoder.instance { o => 
    Json.obj("registryId" -> o.registryId.asJson, "repositoryName" -> o.repositoryName.asJson, "imageId" -> o.imageId.asJson, "imageManifest" -> o.imageManifest.asJson)
  }
  final implicit val LifecyclePolicyRuleActionEncoder: io.circe.Encoder[avias.ecr.models.LifecyclePolicyRuleAction] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson)
  }
  final implicit val CreateRepositoryRequestDecoder: io.circe.Decoder[avias.ecr.models.CreateRepositoryRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(avias.ecr.models.CreateRepositoryRequest.apply _)
  }
  final implicit val BatchDeleteImageResponseDecoder: io.circe.Decoder[avias.ecr.models.BatchDeleteImageResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecr.models.ImageIdentifier]]]("imageIds"), o.get[scala.Option[scala.List[avias.ecr.models.ImageFailure]]]("failures")).mapN(avias.ecr.models.BatchDeleteImageResponse.apply _)
  }
  final implicit val BatchGetImageRequestDecoder: io.circe.Decoder[avias.ecr.models.BatchGetImageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[avias.ecr.models.ImageIdentifier]]("imageIds"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[scala.List[java.lang.String]]]("acceptedMediaTypes")).mapN(avias.ecr.models.BatchGetImageRequest.apply _)
  }
  final implicit val BatchCheckLayerAvailabilityRequestDecoder: io.circe.Decoder[avias.ecr.models.BatchCheckLayerAvailabilityRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[java.lang.String]]("layerDigests"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.BatchCheckLayerAvailabilityRequest.apply _)
  }
  final implicit val DeleteRepositoryPolicyRequestDecoder: io.circe.Decoder[avias.ecr.models.DeleteRepositoryPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.DeleteRepositoryPolicyRequest.apply _)
  }
  final implicit val UploadNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.UploadNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.UploadNotFoundException.apply _)
  }
  final implicit val GetLifecyclePolicyPreviewRequestDecoder: io.circe.Decoder[avias.ecr.models.GetLifecyclePolicyPreviewRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[avias.ecr.models.LifecyclePolicyPreviewFilter]]("filter"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.List[avias.ecr.models.ImageIdentifier]]]("imageIds"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.GetLifecyclePolicyPreviewRequest.apply _)
  }
  final implicit val PutImageRequestDecoder: io.circe.Decoder[avias.ecr.models.PutImageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("imageManifest"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("imageTag")).mapN(avias.ecr.models.PutImageRequest.apply _)
  }
  final implicit val DeleteLifecyclePolicyResponseDecoder: io.circe.Decoder[avias.ecr.models.DeleteLifecyclePolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("lifecyclePolicyText"), o.get[scala.Option[java.time.Instant]]("lastEvaluatedAt")).mapN(avias.ecr.models.DeleteLifecyclePolicyResponse.apply _)
  }
  final implicit val LifecyclePolicyPreviewFilterDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyPreviewFilter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("tagStatus").map(avias.ecr.models.LifecyclePolicyPreviewFilter.apply _)
  }
  final implicit val LifecyclePolicyPreviewSummaryDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyPreviewSummary] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("expiringImageTotalCount").map(avias.ecr.models.LifecyclePolicyPreviewSummary.apply _)
  }
  final implicit val DeleteRepositoryResponseDecoder: io.circe.Decoder[avias.ecr.models.DeleteRepositoryResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecr.models.Repository]]("repository").map(avias.ecr.models.DeleteRepositoryResponse.apply _)
  }
  final implicit val LayerFailureDecoder: io.circe.Decoder[avias.ecr.models.LayerFailure] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("layerDigest"), o.get[scala.Option[java.lang.String]]("failureCode"), o.get[scala.Option[java.lang.String]]("failureReason")).mapN(avias.ecr.models.LayerFailure.apply _)
  }
  final implicit val LifecyclePolicyPreviewNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyPreviewNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LifecyclePolicyPreviewNotFoundException.apply _)
  }
  final implicit val BatchCheckLayerAvailabilityResponseDecoder: io.circe.Decoder[avias.ecr.models.BatchCheckLayerAvailabilityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecr.models.Layer]]]("layers"), o.get[scala.Option[scala.List[avias.ecr.models.LayerFailure]]]("failures")).mapN(avias.ecr.models.BatchCheckLayerAvailabilityResponse.apply _)
  }
  final implicit val ListImagesResponseDecoder: io.circe.Decoder[avias.ecr.models.ListImagesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecr.models.ImageIdentifier]]]("imageIds"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.ListImagesResponse.apply _)
  }
  final implicit val StartLifecyclePolicyPreviewResponseDecoder: io.circe.Decoder[avias.ecr.models.StartLifecyclePolicyPreviewResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("lifecyclePolicyText"), o.get[scala.Option[java.lang.String]]("status")).mapN(avias.ecr.models.StartLifecyclePolicyPreviewResponse.apply _)
  }
  final implicit val CompleteLayerUploadResponseDecoder: io.circe.Decoder[avias.ecr.models.CompleteLayerUploadResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("uploadId"), o.get[scala.Option[java.lang.String]]("layerDigest")).mapN(avias.ecr.models.CompleteLayerUploadResponse.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.ecr.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.InvalidParameterException.apply _)
  }
  final implicit val InitiateLayerUploadRequestDecoder: io.circe.Decoder[avias.ecr.models.InitiateLayerUploadRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.InitiateLayerUploadRequest.apply _)
  }
  final implicit val GetLifecyclePolicyPreviewResponseDecoder: io.circe.Decoder[avias.ecr.models.GetLifecyclePolicyPreviewResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[avias.ecr.models.LifecyclePolicyPreviewSummary]]("summary"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[scala.List[avias.ecr.models.LifecyclePolicyPreviewResult]]]("previewResults"), o.get[scala.Option[java.lang.String]]("lifecyclePolicyText"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.GetLifecyclePolicyPreviewResponse.apply _)
  }
  final implicit val ListImagesFilterDecoder: io.circe.Decoder[avias.ecr.models.ListImagesFilter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("tagStatus").map(avias.ecr.models.ListImagesFilter.apply _)
  }
  final implicit val InvalidLayerPartExceptionDecoder: io.circe.Decoder[avias.ecr.models.InvalidLayerPartException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[scala.Long]]("lastValidByteReceived"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("uploadId")).mapN(avias.ecr.models.InvalidLayerPartException.apply _)
  }
  final implicit val BatchGetImageResponseDecoder: io.circe.Decoder[avias.ecr.models.BatchGetImageResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecr.models.Image]]]("images"), o.get[scala.Option[scala.List[avias.ecr.models.ImageFailure]]]("failures")).mapN(avias.ecr.models.BatchGetImageResponse.apply _)
  }
  final implicit val RepositoryDecoder: io.circe.Decoder[avias.ecr.models.Repository] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryArn"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.time.Instant]]("createdAt"), o.get[scala.Option[java.lang.String]]("repositoryUri")).mapN(avias.ecr.models.Repository.apply _)
  }
  final implicit val SetRepositoryPolicyResponseDecoder: io.circe.Decoder[avias.ecr.models.SetRepositoryPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("policyText")).mapN(avias.ecr.models.SetRepositoryPolicyResponse.apply _)
  }
  final implicit val AuthorizationDataDecoder: io.circe.Decoder[avias.ecr.models.AuthorizationData] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("authorizationToken"), o.get[scala.Option[java.time.Instant]]("expiresAt"), o.get[scala.Option[java.lang.String]]("proxyEndpoint")).mapN(avias.ecr.models.AuthorizationData.apply _)
  }
  final implicit val EmptyUploadExceptionDecoder: io.circe.Decoder[avias.ecr.models.EmptyUploadException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.EmptyUploadException.apply _)
  }
  final implicit val RepositoryNotEmptyExceptionDecoder: io.circe.Decoder[avias.ecr.models.RepositoryNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.RepositoryNotEmptyException.apply _)
  }
  final implicit val DeleteLifecyclePolicyRequestDecoder: io.circe.Decoder[avias.ecr.models.DeleteLifecyclePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.DeleteLifecyclePolicyRequest.apply _)
  }
  final implicit val GetLifecyclePolicyRequestDecoder: io.circe.Decoder[avias.ecr.models.GetLifecyclePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.GetLifecyclePolicyRequest.apply _)
  }
  final implicit val GetRepositoryPolicyRequestDecoder: io.circe.Decoder[avias.ecr.models.GetRepositoryPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.GetRepositoryPolicyRequest.apply _)
  }
  final implicit val GetAuthorizationTokenResponseDecoder: io.circe.Decoder[avias.ecr.models.GetAuthorizationTokenResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.ecr.models.AuthorizationData]]]("authorizationData").map(avias.ecr.models.GetAuthorizationTokenResponse.apply _)
  }
  final implicit val ImageFailureDecoder: io.circe.Decoder[avias.ecr.models.ImageFailure] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.ecr.models.ImageIdentifier]]("imageId"), o.get[scala.Option[java.lang.String]]("failureCode"), o.get[scala.Option[java.lang.String]]("failureReason")).mapN(avias.ecr.models.ImageFailure.apply _)
  }
  final implicit val StartLifecyclePolicyPreviewRequestDecoder: io.circe.Decoder[avias.ecr.models.StartLifecyclePolicyPreviewRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("lifecyclePolicyText")).mapN(avias.ecr.models.StartLifecyclePolicyPreviewRequest.apply _)
  }
  final implicit val DescribeRepositoriesRequestDecoder: io.circe.Decoder[avias.ecr.models.DescribeRepositoriesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[scala.List[java.lang.String]]]("repositoryNames"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.ecr.models.DescribeRepositoriesRequest.apply _)
  }
  final implicit val DeleteRepositoryRequestDecoder: io.circe.Decoder[avias.ecr.models.DeleteRepositoryRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[scala.Boolean]]("force")).mapN(avias.ecr.models.DeleteRepositoryRequest.apply _)
  }
  final implicit val PutImageResponseDecoder: io.circe.Decoder[avias.ecr.models.PutImageResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecr.models.Image]]("image").map(avias.ecr.models.PutImageResponse.apply _)
  }
  final implicit val ImageAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.ecr.models.ImageAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.ImageAlreadyExistsException.apply _)
  }
  final implicit val InitiateLayerUploadResponseDecoder: io.circe.Decoder[avias.ecr.models.InitiateLayerUploadResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("uploadId"), o.get[scala.Option[scala.Long]]("partSize")).mapN(avias.ecr.models.InitiateLayerUploadResponse.apply _)
  }
  final implicit val CreateRepositoryResponseDecoder: io.circe.Decoder[avias.ecr.models.CreateRepositoryResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.ecr.models.Repository]]("repository").map(avias.ecr.models.CreateRepositoryResponse.apply _)
  }
  final implicit val ListImagesRequestDecoder: io.circe.Decoder[avias.ecr.models.ListImagesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[avias.ecr.models.ListImagesFilter]]("filter"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.ListImagesRequest.apply _)
  }
  final implicit val CompleteLayerUploadRequestDecoder: io.circe.Decoder[avias.ecr.models.CompleteLayerUploadRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("uploadId"), o.get[scala.List[java.lang.String]]("layerDigests"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.CompleteLayerUploadRequest.apply _)
  }
  final implicit val GetDownloadUrlForLayerRequestDecoder: io.circe.Decoder[avias.ecr.models.GetDownloadUrlForLayerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("layerDigest"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.GetDownloadUrlForLayerRequest.apply _)
  }
  final implicit val LifecyclePolicyPreviewInProgressExceptionDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyPreviewInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LifecyclePolicyPreviewInProgressException.apply _)
  }
  final implicit val LayersNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.LayersNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LayersNotFoundException.apply _)
  }
  final implicit val UploadLayerPartResponseDecoder: io.circe.Decoder[avias.ecr.models.UploadLayerPartResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("uploadId"), o.get[scala.Option[scala.Long]]("lastByteReceived")).mapN(avias.ecr.models.UploadLayerPartResponse.apply _)
  }
  final implicit val GetLifecyclePolicyResponseDecoder: io.circe.Decoder[avias.ecr.models.GetLifecyclePolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("lifecyclePolicyText"), o.get[scala.Option[java.time.Instant]]("lastEvaluatedAt")).mapN(avias.ecr.models.GetLifecyclePolicyResponse.apply _)
  }
  final implicit val DescribeImagesResponseDecoder: io.circe.Decoder[avias.ecr.models.DescribeImagesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecr.models.ImageDetail]]]("imageDetails"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.DescribeImagesResponse.apply _)
  }
  final implicit val RepositoryNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.RepositoryNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.RepositoryNotFoundException.apply _)
  }
  final implicit val SetRepositoryPolicyRequestDecoder: io.circe.Decoder[avias.ecr.models.SetRepositoryPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("policyText"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[scala.Boolean]]("force")).mapN(avias.ecr.models.SetRepositoryPolicyRequest.apply _)
  }
  final implicit val LayerDecoder: io.circe.Decoder[avias.ecr.models.Layer] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("layerDigest"), o.get[scala.Option[java.lang.String]]("layerAvailability"), o.get[scala.Option[scala.Long]]("layerSize"), o.get[scala.Option[java.lang.String]]("mediaType")).mapN(avias.ecr.models.Layer.apply _)
  }
  final implicit val DescribeRepositoriesResponseDecoder: io.circe.Decoder[avias.ecr.models.DescribeRepositoriesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.ecr.models.Repository]]]("repositories"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.DescribeRepositoriesResponse.apply _)
  }
  final implicit val DescribeImagesRequestDecoder: io.circe.Decoder[avias.ecr.models.DescribeImagesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[scala.List[avias.ecr.models.ImageIdentifier]]]("imageIds"), o.get[scala.Option[avias.ecr.models.DescribeImagesFilter]]("filter"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.ecr.models.DescribeImagesRequest.apply _)
  }
  final implicit val RepositoryAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.ecr.models.RepositoryAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.RepositoryAlreadyExistsException.apply _)
  }
  final implicit val ImageDetailDecoder: io.circe.Decoder[avias.ecr.models.ImageDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("imageDigest"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[scala.Long]]("imageSizeInBytes"), o.get[scala.Option[scala.List[java.lang.String]]]("imageTags"), o.get[scala.Option[java.time.Instant]]("imagePushedAt")).mapN(avias.ecr.models.ImageDetail.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.ecr.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LimitExceededException.apply _)
  }
  final implicit val LifecyclePolicyPreviewResultDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyPreviewResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("imageDigest"), o.get[scala.Option[scala.List[java.lang.String]]]("imageTags"), o.get[scala.Option[java.time.Instant]]("imagePushedAt"), o.get[scala.Option[scala.Int]]("appliedRulePriority"), o.get[scala.Option[avias.ecr.models.LifecyclePolicyRuleAction]]("action")).mapN(avias.ecr.models.LifecyclePolicyPreviewResult.apply _)
  }
  final implicit val RepositoryPolicyNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.RepositoryPolicyNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.RepositoryPolicyNotFoundException.apply _)
  }
  final implicit val LayerAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.ecr.models.LayerAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LayerAlreadyExistsException.apply _)
  }
  final implicit val LifecyclePolicyNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LifecyclePolicyNotFoundException.apply _)
  }
  final implicit val LayerInaccessibleExceptionDecoder: io.circe.Decoder[avias.ecr.models.LayerInaccessibleException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LayerInaccessibleException.apply _)
  }
  final implicit val GetAuthorizationTokenRequestDecoder: io.circe.Decoder[avias.ecr.models.GetAuthorizationTokenRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("registryIds").map(avias.ecr.models.GetAuthorizationTokenRequest.apply _)
  }
  final implicit val PutLifecyclePolicyRequestDecoder: io.circe.Decoder[avias.ecr.models.PutLifecyclePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("lifecyclePolicyText"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.PutLifecyclePolicyRequest.apply _)
  }
  final implicit val PutLifecyclePolicyResponseDecoder: io.circe.Decoder[avias.ecr.models.PutLifecyclePolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("lifecyclePolicyText")).mapN(avias.ecr.models.PutLifecyclePolicyResponse.apply _)
  }
  final implicit val GetDownloadUrlForLayerResponseDecoder: io.circe.Decoder[avias.ecr.models.GetDownloadUrlForLayerResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("downloadUrl"), o.get[scala.Option[java.lang.String]]("layerDigest")).mapN(avias.ecr.models.GetDownloadUrlForLayerResponse.apply _)
  }
  final implicit val DeleteRepositoryPolicyResponseDecoder: io.circe.Decoder[avias.ecr.models.DeleteRepositoryPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("policyText")).mapN(avias.ecr.models.DeleteRepositoryPolicyResponse.apply _)
  }
  final implicit val BatchDeleteImageRequestDecoder: io.circe.Decoder[avias.ecr.models.BatchDeleteImageRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[avias.ecr.models.ImageIdentifier]]("imageIds"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.BatchDeleteImageRequest.apply _)
  }
  final implicit val LayerPartTooSmallExceptionDecoder: io.circe.Decoder[avias.ecr.models.LayerPartTooSmallException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.LayerPartTooSmallException.apply _)
  }
  final implicit val ServerExceptionDecoder: io.circe.Decoder[avias.ecr.models.ServerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.ServerException.apply _)
  }
  final implicit val GetRepositoryPolicyResponseDecoder: io.circe.Decoder[avias.ecr.models.GetRepositoryPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("policyText")).mapN(avias.ecr.models.GetRepositoryPolicyResponse.apply _)
  }
  final implicit val UploadLayerPartRequestDecoder: io.circe.Decoder[avias.ecr.models.UploadLayerPartRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("partFirstByte"), o.get[scala.Long]("partLastByte"), o.get[scala.Array[scala.Byte]]("layerPartBlob"), o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("uploadId"), o.get[scala.Option[java.lang.String]]("registryId")).mapN(avias.ecr.models.UploadLayerPartRequest.apply _)
  }
  final implicit val DescribeImagesFilterDecoder: io.circe.Decoder[avias.ecr.models.DescribeImagesFilter] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("tagStatus").map(avias.ecr.models.DescribeImagesFilter.apply _)
  }
  final implicit val ImageIdentifierDecoder: io.circe.Decoder[avias.ecr.models.ImageIdentifier] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("imageDigest"), o.get[scala.Option[java.lang.String]]("imageTag")).mapN(avias.ecr.models.ImageIdentifier.apply _)
  }
  final implicit val InvalidLayerExceptionDecoder: io.circe.Decoder[avias.ecr.models.InvalidLayerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.InvalidLayerException.apply _)
  }
  final implicit val ImageNotFoundExceptionDecoder: io.circe.Decoder[avias.ecr.models.ImageNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.ecr.models.ImageNotFoundException.apply _)
  }
  final implicit val ImageDecoder: io.circe.Decoder[avias.ecr.models.Image] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("registryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[avias.ecr.models.ImageIdentifier]]("imageId"), o.get[scala.Option[java.lang.String]]("imageManifest")).mapN(avias.ecr.models.Image.apply _)
  }
  final implicit val LifecyclePolicyRuleActionDecoder: io.circe.Decoder[avias.ecr.models.LifecyclePolicyRuleAction] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("type").map(avias.ecr.models.LifecyclePolicyRuleAction.apply _)
  }
}