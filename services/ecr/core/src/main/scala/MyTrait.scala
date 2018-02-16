package avias.ecr
trait Amazonecr[F[_]] {
  def initiateLayerUpload(input: avias.ecr.models.InitiateLayerUploadRequest): F[avias.ecr.models.InitiateLayerUploadResponse]
  def putImage(input: avias.ecr.models.PutImageRequest): F[avias.ecr.models.PutImageResponse]
  def uploadLayerPart(input: avias.ecr.models.UploadLayerPartRequest): F[avias.ecr.models.UploadLayerPartResponse]
  def setRepositoryPolicy(input: avias.ecr.models.SetRepositoryPolicyRequest): F[avias.ecr.models.SetRepositoryPolicyResponse]
  def putLifecyclePolicy(input: avias.ecr.models.PutLifecyclePolicyRequest): F[avias.ecr.models.PutLifecyclePolicyResponse]
  def batchCheckLayerAvailability(input: avias.ecr.models.BatchCheckLayerAvailabilityRequest): F[avias.ecr.models.BatchCheckLayerAvailabilityResponse]
  def batchDeleteImage(input: avias.ecr.models.BatchDeleteImageRequest): F[avias.ecr.models.BatchDeleteImageResponse]
  def describeImages(input: avias.ecr.models.DescribeImagesRequest): F[avias.ecr.models.DescribeImagesResponse]
  def listImages(input: avias.ecr.models.ListImagesRequest): F[avias.ecr.models.ListImagesResponse]
  def startLifecyclePolicyPreview(input: avias.ecr.models.StartLifecyclePolicyPreviewRequest): F[avias.ecr.models.StartLifecyclePolicyPreviewResponse]
  def completeLayerUpload(input: avias.ecr.models.CompleteLayerUploadRequest): F[avias.ecr.models.CompleteLayerUploadResponse]
  def deleteLifecyclePolicy(input: avias.ecr.models.DeleteLifecyclePolicyRequest): F[avias.ecr.models.DeleteLifecyclePolicyResponse]
  def createRepository(input: avias.ecr.models.CreateRepositoryRequest): F[avias.ecr.models.CreateRepositoryResponse]
  def getLifecyclePolicyPreview(input: avias.ecr.models.GetLifecyclePolicyPreviewRequest): F[avias.ecr.models.GetLifecyclePolicyPreviewResponse]
  def batchGetImage(input: avias.ecr.models.BatchGetImageRequest): F[avias.ecr.models.BatchGetImageResponse]
  def deleteRepository(input: avias.ecr.models.DeleteRepositoryRequest): F[avias.ecr.models.DeleteRepositoryResponse]
  def describeRepositories(input: avias.ecr.models.DescribeRepositoriesRequest): F[avias.ecr.models.DescribeRepositoriesResponse]
  def getDownloadUrlForLayer(input: avias.ecr.models.GetDownloadUrlForLayerRequest): F[avias.ecr.models.GetDownloadUrlForLayerResponse]
  def getLifecyclePolicy(input: avias.ecr.models.GetLifecyclePolicyRequest): F[avias.ecr.models.GetLifecyclePolicyResponse]
  def deleteRepositoryPolicy(input: avias.ecr.models.DeleteRepositoryPolicyRequest): F[avias.ecr.models.DeleteRepositoryPolicyResponse]
  def getAuthorizationToken(input: avias.ecr.models.GetAuthorizationTokenRequest): F[avias.ecr.models.GetAuthorizationTokenResponse]
  def getRepositoryPolicy(input: avias.ecr.models.GetRepositoryPolicyRequest): F[avias.ecr.models.GetRepositoryPolicyResponse]
}