package avias.codecommit
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val GetRepositoryOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetRepositoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryMetadata" -> o.repositoryMetadata.asJson)
  }
  final implicit val ListBranchesInputEncoder: io.circe.Encoder[avias.codecommit.models.ListBranchesInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidRepositoryDescriptionExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryDescriptionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNameRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidContinuationTokenExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidContinuationTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateRepositoryOutputEncoder: io.circe.Encoder[avias.codecommit.models.CreateRepositoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryMetadata" -> o.repositoryMetadata.asJson)
  }
  final implicit val RepositoryNameExistsExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryNameExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestTitleInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdatePullRequestTitleInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "title" -> o.title.asJson)
  }
  final implicit val TargetEncoder: io.circe.Encoder[avias.codecommit.models.Target] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "sourceReference" -> o.sourceReference.asJson, "destinationReference" -> o.destinationReference.asJson)
  }
  final implicit val ListBranchesOutputEncoder: io.circe.Encoder[avias.codecommit.models.ListBranchesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("branches" -> o.branches.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RepositoryTriggerNameRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTriggerNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActorDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.ActorDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentDeletedExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommentDeletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNameIdPairEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryNameIdPair] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "repositoryId" -> o.repositoryId.asJson)
  }
  final implicit val PullRequestStatusChangedEventMetadataEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestStatusChangedEventMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestStatus" -> o.pullRequestStatus.asJson)
  }
  final implicit val InvalidCommentIdExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidCommentIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ClientRequestTokenRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.ClientRequestTokenRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommitInputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommitInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val CommitRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommitRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetRepositoriesInputEncoder: io.circe.Encoder[avias.codecommit.models.BatchGetRepositoriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryNames" -> o.repositoryNames.asJson)
  }
  final implicit val FileTooLargeExceptionEncoder: io.circe.Encoder[avias.codecommit.models.FileTooLargeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UserInfoEncoder: io.circe.Encoder[avias.codecommit.models.UserInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "email" -> o.email.asJson, "date" -> o.date.asJson)
  }
  final implicit val UpdatePullRequestDescriptionOutputEncoder: io.circe.Encoder[avias.codecommit.models.UpdatePullRequestDescriptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val InvalidOrderExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidOrderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentForComparedCommitInputEncoder: io.circe.Encoder[avias.codecommit.models.PostCommentForComparedCommitInput] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "location" -> o.location.asJson)
  }
  final implicit val PullRequestTargetEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestTarget] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "sourceReference" -> o.sourceReference.asJson, "destinationReference" -> o.destinationReference.asJson, "destinationCommit" -> o.destinationCommit.asJson, "sourceCommit" -> o.sourceCommit.asJson, "mergeMetadata" -> o.mergeMetadata.asJson)
  }
  final implicit val InvalidRepositoryNameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TestRepositoryTriggersInputEncoder: io.circe.Encoder[avias.codecommit.models.TestRepositoryTriggersInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "triggers" -> o.triggers.asJson)
  }
  final implicit val IdempotencyParameterMismatchExceptionEncoder: io.circe.Encoder[avias.codecommit.models.IdempotencyParameterMismatchException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PathDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.PathDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentForPullRequestInputEncoder: io.circe.Encoder[avias.codecommit.models.PostCommentForPullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson, "pullRequestId" -> o.pullRequestId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "location" -> o.location.asJson)
  }
  final implicit val EncryptionKeyDisabledExceptionEncoder: io.circe.Encoder[avias.codecommit.models.EncryptionKeyDisabledException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidPullRequestIdExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidPullRequestIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerExecutionFailureEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTriggerExecutionFailure] = io.circe.Encoder.instance { o => 
    Json.obj("trigger" -> o.trigger.asJson, "failureMessage" -> o.failureMessage.asJson)
  }
  final implicit val InvalidCommitIdExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidCommitIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDescriptionExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidDescriptionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommentsForComparedCommitInputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommentsForComparedCommitInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "afterCommitId" -> o.afterCommitId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteBranchInputEncoder: io.circe.Encoder[avias.codecommit.models.DeleteBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "branchName" -> o.branchName.asJson)
  }
  final implicit val InvalidBranchNameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidBranchNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteCommentContentInputEncoder: io.circe.Encoder[avias.codecommit.models.DeleteCommentContentInput] = io.circe.Encoder.instance { o => 
    Json.obj("commentId" -> o.commentId.asJson)
  }
  final implicit val ReferenceDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.ReferenceDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BranchDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.BranchDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRepositoryTriggerBranchNameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryTriggerBranchNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateRepositoryInputEncoder: io.circe.Encoder[avias.codecommit.models.CreateRepositoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "repositoryDescription" -> o.repositoryDescription.asJson)
  }
  final implicit val TipsDivergenceExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.TipsDivergenceExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BlobMetadataEncoder: io.circe.Encoder[avias.codecommit.models.BlobMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("blobId" -> o.blobId.asJson, "path" -> o.path.asJson, "mode" -> o.mode.asJson)
  }
  final implicit val CreatePullRequestInputEncoder: io.circe.Encoder[avias.codecommit.models.CreatePullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("title" -> o.title.asJson, "targets" -> o.targets.asJson, "description" -> o.description.asJson, "clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val GetCommentInputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommentInput] = io.circe.Encoder.instance { o => 
    Json.obj("commentId" -> o.commentId.asJson)
  }
  final implicit val ListPullRequestsInputEncoder: io.circe.Encoder[avias.codecommit.models.ListPullRequestsInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "maxResults" -> o.maxResults.asJson, "authorArn" -> o.authorArn.asJson, "pullRequestStatus" -> o.pullRequestStatus.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteRepositoryInputEncoder: io.circe.Encoder[avias.codecommit.models.DeleteRepositoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val PathRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.PathRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MaximumRepositoryNamesExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.MaximumRepositoryNamesExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidCommitExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidCommitException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentForComparedCommitOutputEncoder: io.circe.Encoder[avias.codecommit.models.PostCommentForComparedCommitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "comment" -> o.comment.asJson, "location" -> o.location.asJson)
  }
  final implicit val MaximumRepositoryTriggersExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.MaximumRepositoryTriggersExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TestRepositoryTriggersOutputEncoder: io.circe.Encoder[avias.codecommit.models.TestRepositoryTriggersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("successfulExecutions" -> o.successfulExecutions.asJson, "failedExecutions" -> o.failedExecutions.asJson)
  }
  final implicit val EncryptionKeyNotFoundExceptionEncoder: io.circe.Encoder[avias.codecommit.models.EncryptionKeyNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDefaultBranchInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdateDefaultBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "defaultBranchName" -> o.defaultBranchName.asJson)
  }
  final implicit val BranchNameExistsExceptionEncoder: io.circe.Encoder[avias.codecommit.models.BranchNameExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommitDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommitDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestSourceReferenceUpdatedEventMetadataEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestSourceReferenceUpdatedEventMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson)
  }
  final implicit val InvalidFileLocationExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidFileLocationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSourceCommitSpecifierExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidSourceCommitSpecifierException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestStatusOutputEncoder: io.circe.Encoder[avias.codecommit.models.UpdatePullRequestStatusOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val GetCommentsForPullRequestInputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommentsForPullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "maxResults" -> o.maxResults.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val PullRequestEncoder: io.circe.Encoder[avias.codecommit.models.PullRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestTargets" -> o.pullRequestTargets.asJson, "authorArn" -> o.authorArn.asJson, "pullRequestId" -> o.pullRequestId.asJson, "lastActivityDate" -> o.lastActivityDate.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "title" -> o.title.asJson, "pullRequestStatus" -> o.pullRequestStatus.asJson, "description" -> o.description.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val GetPullRequestInputEncoder: io.circe.Encoder[avias.codecommit.models.GetPullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson)
  }
  final implicit val MergePullRequestByFastForwardInputEncoder: io.circe.Encoder[avias.codecommit.models.MergePullRequestByFastForwardInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "repositoryName" -> o.repositoryName.asJson, "sourceCommitId" -> o.sourceCommitId.asJson)
  }
  final implicit val MaximumBranchesExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.MaximumBranchesExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerDestinationArnRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTriggerDestinationArnRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestMergedStateChangedEventMetadataEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestMergedStateChangedEventMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "destinationReference" -> o.destinationReference.asJson, "mergeMetadata" -> o.mergeMetadata.asJson)
  }
  final implicit val ListRepositoriesInputEncoder: io.circe.Encoder[avias.codecommit.models.ListRepositoriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "sortBy" -> o.sortBy.asJson, "order" -> o.order.asJson)
  }
  final implicit val PostCommentReplyOutputEncoder: io.circe.Encoder[avias.codecommit.models.PostCommentReplyOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val InvalidMergeOptionExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidMergeOptionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommitIdDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommitIdDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetPullRequestOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetPullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val InvalidRepositoryTriggerNameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryTriggerNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDifferencesOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetDifferencesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("differences" -> o.differences.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetCommentsForPullRequestOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommentsForPullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("commentsForPullRequestData" -> o.commentsForPullRequestData.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreatePullRequestOutputEncoder: io.circe.Encoder[avias.codecommit.models.CreatePullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val EncryptionKeyAccessDeniedExceptionEncoder: io.circe.Encoder[avias.codecommit.models.EncryptionKeyAccessDeniedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidPathExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidPathException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBlobOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetBlobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson)
  }
  final implicit val TitleRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.TitleRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateRepositoryNameInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdateRepositoryNameInput] = io.circe.Encoder.instance { o => 
    Json.obj("oldName" -> o.oldName.asJson, "newName" -> o.newName.asJson)
  }
  final implicit val ListPullRequestsOutputEncoder: io.circe.Encoder[avias.codecommit.models.ListPullRequestsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestIds" -> o.pullRequestIds.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribePullRequestEventsOutputEncoder: io.circe.Encoder[avias.codecommit.models.DescribePullRequestEventsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestEvents" -> o.pullRequestEvents.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val MaximumOpenPullRequestsExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.MaximumOpenPullRequestsExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DifferenceEncoder: io.circe.Encoder[avias.codecommit.models.Difference] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlob" -> o.beforeBlob.asJson, "afterBlob" -> o.afterBlob.asJson, "changeType" -> o.changeType.asJson)
  }
  final implicit val GetCommitOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("commit" -> o.commit.asJson)
  }
  final implicit val RepositoryTriggerEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTrigger] = io.circe.Encoder.instance { o => 
    Json.obj("destinationArn" -> o.destinationArn.asJson, "name" -> o.name.asJson, "events" -> o.events.asJson, "branches" -> o.branches.asJson, "customData" -> o.customData.asJson)
  }
  final implicit val InvalidRepositoryTriggerRegionExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryTriggerRegionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MergeMetadataEncoder: io.circe.Encoder[avias.codecommit.models.MergeMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("isMerged" -> o.isMerged.asJson, "mergedBy" -> o.mergedBy.asJson)
  }
  final implicit val EncryptionIntegrityChecksFailedExceptionEncoder: io.circe.Encoder[avias.codecommit.models.EncryptionIntegrityChecksFailedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerBranchNameListRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTriggerBranchNameListRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReferenceNameRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.ReferenceNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteRepositoryOutputEncoder: io.circe.Encoder[avias.codecommit.models.DeleteRepositoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryId" -> o.repositoryId.asJson)
  }
  final implicit val BranchInfoEncoder: io.circe.Encoder[avias.codecommit.models.BranchInfo] = io.circe.Encoder.instance { o => 
    Json.obj("branchName" -> o.branchName.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val PullRequestIdRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateBranchInputEncoder: io.circe.Encoder[avias.codecommit.models.CreateBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "branchName" -> o.branchName.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val CommentsForPullRequestEncoder: io.circe.Encoder[avias.codecommit.models.CommentsForPullRequest] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "pullRequestId" -> o.pullRequestId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "location" -> o.location.asJson, "comments" -> o.comments.asJson)
  }
  final implicit val GetRepositoryTriggersOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetRepositoryTriggersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson, "triggers" -> o.triggers.asJson)
  }
  final implicit val DeleteCommentContentOutputEncoder: io.circe.Encoder[avias.codecommit.models.DeleteCommentContentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val InvalidTitleExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidTitleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentNotCreatedByCallerExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommentNotCreatedByCallerException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SourceAndDestinationAreSameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.SourceAndDestinationAreSameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetMergeConflictsInputEncoder: io.circe.Encoder[avias.codecommit.models.GetMergeConflictsInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "destinationCommitSpecifier" -> o.destinationCommitSpecifier.asJson, "sourceCommitSpecifier" -> o.sourceCommitSpecifier.asJson, "mergeOption" -> o.mergeOption.asJson)
  }
  final implicit val CommitIdRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommitIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerEventsListRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTriggerEventsListRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentsForComparedCommitEncoder: io.circe.Encoder[avias.codecommit.models.CommentsForComparedCommit] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "location" -> o.location.asJson, "comments" -> o.comments.asJson)
  }
  final implicit val PutRepositoryTriggersOutputEncoder: io.circe.Encoder[avias.codecommit.models.PutRepositoryTriggersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson)
  }
  final implicit val InvalidRepositoryTriggerCustomDataExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryTriggerCustomDataException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBranchInputEncoder: io.circe.Encoder[avias.codecommit.models.GetBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "branchName" -> o.branchName.asJson)
  }
  final implicit val ReferenceTypeNotSupportedExceptionEncoder: io.circe.Encoder[avias.codecommit.models.ReferenceTypeNotSupportedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRepositoryTriggerDestinationArnExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryTriggerDestinationArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRelativeFileVersionEnumExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRelativeFileVersionEnumException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTargetExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidTargetException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidClientRequestTokenExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidClientRequestTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestAlreadyClosedExceptionEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestAlreadyClosedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryLimitExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestDescriptionInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdatePullRequestDescriptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "description" -> o.description.asJson)
  }
  final implicit val GetDifferencesInputEncoder: io.circe.Encoder[avias.codecommit.models.GetDifferencesInput] = io.circe.Encoder.instance { o => 
    Json.obj("afterCommitSpecifier" -> o.afterCommitSpecifier.asJson, "repositoryName" -> o.repositoryName.asJson, "MaxResults" -> o.maxResults.asJson, "beforePath" -> o.beforePath.asJson, "afterPath" -> o.afterPath.asJson, "beforeCommitSpecifier" -> o.beforeCommitSpecifier.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListRepositoriesOutputEncoder: io.circe.Encoder[avias.codecommit.models.ListRepositoriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositories" -> o.repositories.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val MultipleRepositoriesInPullRequestExceptionEncoder: io.circe.Encoder[avias.codecommit.models.MultipleRepositoriesInPullRequestException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRepositoryTriggerEventsExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidRepositoryTriggerEventsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommentOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val RepositoryDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidFilePositionExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidFilePositionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNamesRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryNamesRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidActorArnExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidActorArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetMergeConflictsOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetMergeConflictsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("mergeable" -> o.mergeable.asJson, "destinationCommitId" -> o.destinationCommitId.asJson, "sourceCommitId" -> o.sourceCommitId.asJson)
  }
  final implicit val InvalidMaxResultsExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidMaxResultsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetRepositoriesOutputEncoder: io.circe.Encoder[avias.codecommit.models.BatchGetRepositoriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositories" -> o.repositories.asJson, "repositoriesNotFound" -> o.repositoriesNotFound.asJson)
  }
  final implicit val UpdateCommentOutputEncoder: io.circe.Encoder[avias.codecommit.models.UpdateCommentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val TargetRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.TargetRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentContentSizeLimitExceededExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommentContentSizeLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidPullRequestStatusExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidPullRequestStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribePullRequestEventsInputEncoder: io.circe.Encoder[avias.codecommit.models.DescribePullRequestEventsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "maxResults" -> o.maxResults.asJson, "actorArn" -> o.actorArn.asJson, "pullRequestEventType" -> o.pullRequestEventType.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidDestinationCommitSpecifierExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidDestinationCommitSpecifierException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetRepositoryInputEncoder: io.circe.Encoder[avias.codecommit.models.GetRepositoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val MergeOptionRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.MergeOptionRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestTitleOutputEncoder: io.circe.Encoder[avias.codecommit.models.UpdatePullRequestTitleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val BlobIdDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.BlobIdDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TargetsRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.TargetsRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteBranchOutputEncoder: io.circe.Encoder[avias.codecommit.models.DeleteBranchOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deletedBranch" -> o.deletedBranch.asJson)
  }
  final implicit val InvalidPullRequestStatusUpdateExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidPullRequestStatusUpdateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateCommentInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdateCommentInput] = io.circe.Encoder.instance { o => 
    Json.obj("commentId" -> o.commentId.asJson, "content" -> o.content.asJson)
  }
  final implicit val BlobIdRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.BlobIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSortByExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidSortByException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBranchOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetBranchOutput] = io.circe.Encoder.instance { o => 
    Json.obj("branch" -> o.branch.asJson)
  }
  final implicit val InvalidAuthorArnExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidAuthorArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentEncoder: io.circe.Encoder[avias.codecommit.models.Comment] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson, "deleted" -> o.deleted.asJson, "authorArn" -> o.authorArn.asJson, "commentId" -> o.commentId.asJson, "inReplyTo" -> o.inReplyTo.asJson, "lastModifiedDate" -> o.lastModifiedDate.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val InvalidPullRequestEventTypeExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidPullRequestEventTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBlobInputEncoder: io.circe.Encoder[avias.codecommit.models.GetBlobInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "blobId" -> o.blobId.asJson)
  }
  final implicit val UpdateRepositoryDescriptionInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdateRepositoryDescriptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "repositoryDescription" -> o.repositoryDescription.asJson)
  }
  final implicit val EncryptionKeyUnavailableExceptionEncoder: io.circe.Encoder[avias.codecommit.models.EncryptionKeyUnavailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTargetsExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidTargetsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LocationEncoder: io.circe.Encoder[avias.codecommit.models.Location] = io.circe.Encoder.instance { o => 
    Json.obj("filePath" -> o.filePath.asJson, "filePosition" -> o.filePosition.asJson, "relativeFileVersion" -> o.relativeFileVersion.asJson)
  }
  final implicit val BeforeCommitIdAndAfterCommitIdAreSameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.BeforeCommitIdAndAfterCommitIdAreSameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentReplyInputEncoder: io.circe.Encoder[avias.codecommit.models.PostCommentReplyInput] = io.circe.Encoder.instance { o => 
    Json.obj("inReplyTo" -> o.inReplyTo.asJson, "content" -> o.content.asJson, "clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val UpdatePullRequestStatusInputEncoder: io.circe.Encoder[avias.codecommit.models.UpdatePullRequestStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "pullRequestStatus" -> o.pullRequestStatus.asJson)
  }
  final implicit val CommitEncoder: io.circe.Encoder[avias.codecommit.models.Commit] = io.circe.Encoder.instance { o => 
    Json.obj("author" -> o.author.asJson, "committer" -> o.committer.asJson, "commitId" -> o.commitId.asJson, "treeId" -> o.treeId.asJson, "additionalData" -> o.additionalData.asJson, "parents" -> o.parents.asJson, "message" -> o.message.asJson)
  }
  final implicit val AuthorDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.AuthorDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryMetadataEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "defaultBranch" -> o.defaultBranch.asJson, "repositoryDescription" -> o.repositoryDescription.asJson, "lastModifiedDate" -> o.lastModifiedDate.asJson, "cloneUrlHttp" -> o.cloneUrlHttp.asJson, "repositoryId" -> o.repositoryId.asJson, "repositoryName" -> o.repositoryName.asJson, "cloneUrlSsh" -> o.cloneUrlSsh.asJson, "creationDate" -> o.creationDate.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val PullRequestStatusRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestStatusRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidBlobIdExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidBlobIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MergePullRequestByFastForwardOutputEncoder: io.circe.Encoder[avias.codecommit.models.MergePullRequestByFastForwardOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val RepositoryTriggersListRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryTriggersListRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BranchNameRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.BranchNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidReferenceNameExceptionEncoder: io.circe.Encoder[avias.codecommit.models.InvalidReferenceNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNotAssociatedWithPullRequestExceptionEncoder: io.circe.Encoder[avias.codecommit.models.RepositoryNotAssociatedWithPullRequestException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentDoesNotExistExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommentDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentIdRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommentIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ManualMergeRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.ManualMergeRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TipOfSourceReferenceIsDifferentExceptionEncoder: io.circe.Encoder[avias.codecommit.models.TipOfSourceReferenceIsDifferentException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutRepositoryTriggersInputEncoder: io.circe.Encoder[avias.codecommit.models.PutRepositoryTriggersInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "triggers" -> o.triggers.asJson)
  }
  final implicit val PostCommentForPullRequestOutputEncoder: io.circe.Encoder[avias.codecommit.models.PostCommentForPullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "pullRequestId" -> o.pullRequestId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "comment" -> o.comment.asJson, "location" -> o.location.asJson)
  }
  final implicit val CommentContentRequiredExceptionEncoder: io.circe.Encoder[avias.codecommit.models.CommentContentRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestEventEncoder: io.circe.Encoder[avias.codecommit.models.PullRequestEvent] = io.circe.Encoder.instance { o => 
    Json.obj("eventDate" -> o.eventDate.asJson, "pullRequestStatusChangedEventMetadata" -> o.pullRequestStatusChangedEventMetadata.asJson, "actorArn" -> o.actorArn.asJson, "pullRequestId" -> o.pullRequestId.asJson, "pullRequestSourceReferenceUpdatedEventMetadata" -> o.pullRequestSourceReferenceUpdatedEventMetadata.asJson, "pullRequestMergedStateChangedEventMetadata" -> o.pullRequestMergedStateChangedEventMetadata.asJson, "pullRequestEventType" -> o.pullRequestEventType.asJson)
  }
  final implicit val DefaultBranchCannotBeDeletedExceptionEncoder: io.circe.Encoder[avias.codecommit.models.DefaultBranchCannotBeDeletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetRepositoryTriggersInputEncoder: io.circe.Encoder[avias.codecommit.models.GetRepositoryTriggersInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val GetCommentsForComparedCommitOutputEncoder: io.circe.Encoder[avias.codecommit.models.GetCommentsForComparedCommitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("commentsForComparedCommitData" -> o.commentsForComparedCommitData.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetRepositoryOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetRepositoryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.RepositoryMetadata]]("repositoryMetadata").map(avias.codecommit.models.GetRepositoryOutput.apply _)
  }
  final implicit val ListBranchesInputDecoder: io.circe.Decoder[avias.codecommit.models.ListBranchesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.ListBranchesInput.apply _)
  }
  final implicit val InvalidRepositoryDescriptionExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryDescriptionException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryDescriptionException)
  final implicit val RepositoryNameRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryNameRequiredException)
  final implicit val InvalidContinuationTokenExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidContinuationTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidContinuationTokenException)
  final implicit val CreateRepositoryOutputDecoder: io.circe.Decoder[avias.codecommit.models.CreateRepositoryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.RepositoryMetadata]]("repositoryMetadata").map(avias.codecommit.models.CreateRepositoryOutput.apply _)
  }
  final implicit val RepositoryNameExistsExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryNameExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryNameExistsException)
  final implicit val UpdatePullRequestTitleInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdatePullRequestTitleInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("title")).mapN(avias.codecommit.models.UpdatePullRequestTitleInput.apply _)
  }
  final implicit val TargetDecoder: io.circe.Decoder[avias.codecommit.models.Target] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("sourceReference"), o.get[scala.Option[java.lang.String]]("destinationReference")).mapN(avias.codecommit.models.Target.apply _)
  }
  final implicit val ListBranchesOutputDecoder: io.circe.Decoder[avias.codecommit.models.ListBranchesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("branches"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.ListBranchesOutput.apply _)
  }
  final implicit val RepositoryTriggerNameRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTriggerNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryTriggerNameRequiredException)
  final implicit val ActorDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.ActorDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.ActorDoesNotExistException)
  final implicit val CommentDeletedExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommentDeletedException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommentDeletedException)
  final implicit val RepositoryNameIdPairDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryNameIdPair] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("repositoryId")).mapN(avias.codecommit.models.RepositoryNameIdPair.apply _)
  }
  final implicit val PullRequestStatusChangedEventMetadataDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestStatusChangedEventMetadata] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pullRequestStatus").map(avias.codecommit.models.PullRequestStatusChangedEventMetadata.apply _)
  }
  final implicit val InvalidCommentIdExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidCommentIdException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidCommentIdException)
  final implicit val ClientRequestTokenRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.ClientRequestTokenRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.ClientRequestTokenRequiredException)
  final implicit val GetCommitInputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("commitId")).mapN(avias.codecommit.models.GetCommitInput.apply _)
  }
  final implicit val CommitRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommitRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommitRequiredException)
  final implicit val BatchGetRepositoriesInputDecoder: io.circe.Decoder[avias.codecommit.models.BatchGetRepositoriesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("repositoryNames").map(avias.codecommit.models.BatchGetRepositoriesInput.apply _)
  }
  final implicit val FileTooLargeExceptionDecoder: io.circe.Decoder[avias.codecommit.models.FileTooLargeException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.FileTooLargeException)
  final implicit val UserInfoDecoder: io.circe.Decoder[avias.codecommit.models.UserInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("email"), o.get[scala.Option[java.lang.String]]("date")).mapN(avias.codecommit.models.UserInfo.apply _)
  }
  final implicit val UpdatePullRequestDescriptionOutputDecoder: io.circe.Decoder[avias.codecommit.models.UpdatePullRequestDescriptionOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codecommit.models.PullRequest]("pullRequest").map(avias.codecommit.models.UpdatePullRequestDescriptionOutput.apply _)
  }
  final implicit val InvalidOrderExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidOrderException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidOrderException)
  final implicit val PostCommentForComparedCommitInputDecoder: io.circe.Decoder[avias.codecommit.models.PostCommentForComparedCommitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("content"), o.get[java.lang.String]("afterCommitId"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[avias.codecommit.models.Location]]("location")).mapN(avias.codecommit.models.PostCommentForComparedCommitInput.apply _)
  }
  final implicit val PullRequestTargetDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestTarget] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("sourceReference"), o.get[scala.Option[java.lang.String]]("destinationReference"), o.get[scala.Option[java.lang.String]]("destinationCommit"), o.get[scala.Option[java.lang.String]]("sourceCommit"), o.get[scala.Option[avias.codecommit.models.MergeMetadata]]("mergeMetadata")).mapN(avias.codecommit.models.PullRequestTarget.apply _)
  }
  final implicit val InvalidRepositoryNameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryNameException)
  final implicit val TestRepositoryTriggersInputDecoder: io.circe.Decoder[avias.codecommit.models.TestRepositoryTriggersInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[avias.codecommit.models.RepositoryTrigger]]("triggers")).mapN(avias.codecommit.models.TestRepositoryTriggersInput.apply _)
  }
  final implicit val IdempotencyParameterMismatchExceptionDecoder: io.circe.Decoder[avias.codecommit.models.IdempotencyParameterMismatchException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.IdempotencyParameterMismatchException)
  final implicit val PathDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.PathDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.PathDoesNotExistException)
  final implicit val PostCommentForPullRequestInputDecoder: io.circe.Decoder[avias.codecommit.models.PostCommentForPullRequestInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("content"), o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("beforeCommitId"), o.get[java.lang.String]("afterCommitId"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[avias.codecommit.models.Location]]("location")).mapN(avias.codecommit.models.PostCommentForPullRequestInput.apply _)
  }
  final implicit val EncryptionKeyDisabledExceptionDecoder: io.circe.Decoder[avias.codecommit.models.EncryptionKeyDisabledException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.EncryptionKeyDisabledException)
  final implicit val InvalidPullRequestIdExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidPullRequestIdException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidPullRequestIdException)
  final implicit val RepositoryTriggerExecutionFailureDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTriggerExecutionFailure] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("trigger"), o.get[scala.Option[java.lang.String]]("failureMessage")).mapN(avias.codecommit.models.RepositoryTriggerExecutionFailure.apply _)
  }
  final implicit val InvalidCommitIdExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidCommitIdException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidCommitIdException)
  final implicit val InvalidDescriptionExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidDescriptionException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidDescriptionException)
  final implicit val GetCommentsForComparedCommitInputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommentsForComparedCommitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("afterCommitId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(avias.codecommit.models.GetCommentsForComparedCommitInput.apply _)
  }
  final implicit val DeleteBranchInputDecoder: io.circe.Decoder[avias.codecommit.models.DeleteBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("branchName")).mapN(avias.codecommit.models.DeleteBranchInput.apply _)
  }
  final implicit val InvalidBranchNameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidBranchNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidBranchNameException)
  final implicit val DeleteCommentContentInputDecoder: io.circe.Decoder[avias.codecommit.models.DeleteCommentContentInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("commentId").map(avias.codecommit.models.DeleteCommentContentInput.apply _)
  }
  final implicit val ReferenceDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.ReferenceDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.ReferenceDoesNotExistException)
  final implicit val BranchDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.BranchDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.BranchDoesNotExistException)
  final implicit val InvalidRepositoryTriggerBranchNameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryTriggerBranchNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryTriggerBranchNameException)
  final implicit val CreateRepositoryInputDecoder: io.circe.Decoder[avias.codecommit.models.CreateRepositoryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("repositoryDescription")).mapN(avias.codecommit.models.CreateRepositoryInput.apply _)
  }
  final implicit val TipsDivergenceExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.TipsDivergenceExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.TipsDivergenceExceededException)
  final implicit val BlobMetadataDecoder: io.circe.Decoder[avias.codecommit.models.BlobMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("blobId"), o.get[scala.Option[java.lang.String]]("path"), o.get[scala.Option[java.lang.String]]("mode")).mapN(avias.codecommit.models.BlobMetadata.apply _)
  }
  final implicit val CreatePullRequestInputDecoder: io.circe.Decoder[avias.codecommit.models.CreatePullRequestInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("title"), o.get[scala.List[avias.codecommit.models.Target]]("targets"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("clientRequestToken")).mapN(avias.codecommit.models.CreatePullRequestInput.apply _)
  }
  final implicit val GetCommentInputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommentInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("commentId").map(avias.codecommit.models.GetCommentInput.apply _)
  }
  final implicit val ListPullRequestsInputDecoder: io.circe.Decoder[avias.codecommit.models.ListPullRequestsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("authorArn"), o.get[scala.Option[java.lang.String]]("pullRequestStatus"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.ListPullRequestsInput.apply _)
  }
  final implicit val DeleteRepositoryInputDecoder: io.circe.Decoder[avias.codecommit.models.DeleteRepositoryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(avias.codecommit.models.DeleteRepositoryInput.apply _)
  }
  final implicit val PathRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.PathRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.PathRequiredException)
  final implicit val MaximumRepositoryNamesExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.MaximumRepositoryNamesExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.MaximumRepositoryNamesExceededException)
  final implicit val InvalidCommitExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidCommitException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidCommitException)
  final implicit val PostCommentForComparedCommitOutputDecoder: io.circe.Decoder[avias.codecommit.models.PostCommentForComparedCommitOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[avias.codecommit.models.Comment]]("comment"), o.get[scala.Option[avias.codecommit.models.Location]]("location")).mapN(avias.codecommit.models.PostCommentForComparedCommitOutput.apply _)
  }
  final implicit val MaximumRepositoryTriggersExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.MaximumRepositoryTriggersExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.MaximumRepositoryTriggersExceededException)
  final implicit val TestRepositoryTriggersOutputDecoder: io.circe.Decoder[avias.codecommit.models.TestRepositoryTriggersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("successfulExecutions"), o.get[scala.Option[scala.List[avias.codecommit.models.RepositoryTriggerExecutionFailure]]]("failedExecutions")).mapN(avias.codecommit.models.TestRepositoryTriggersOutput.apply _)
  }
  final implicit val EncryptionKeyNotFoundExceptionDecoder: io.circe.Decoder[avias.codecommit.models.EncryptionKeyNotFoundException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.EncryptionKeyNotFoundException)
  final implicit val UpdateDefaultBranchInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdateDefaultBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("defaultBranchName")).mapN(avias.codecommit.models.UpdateDefaultBranchInput.apply _)
  }
  final implicit val BranchNameExistsExceptionDecoder: io.circe.Decoder[avias.codecommit.models.BranchNameExistsException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.BranchNameExistsException)
  final implicit val CommitDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommitDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommitDoesNotExistException)
  final implicit val PullRequestSourceReferenceUpdatedEventMetadataDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestSourceReferenceUpdatedEventMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId")).mapN(avias.codecommit.models.PullRequestSourceReferenceUpdatedEventMetadata.apply _)
  }
  final implicit val InvalidFileLocationExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidFileLocationException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidFileLocationException)
  final implicit val InvalidSourceCommitSpecifierExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidSourceCommitSpecifierException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidSourceCommitSpecifierException)
  final implicit val UpdatePullRequestStatusOutputDecoder: io.circe.Decoder[avias.codecommit.models.UpdatePullRequestStatusOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codecommit.models.PullRequest]("pullRequest").map(avias.codecommit.models.UpdatePullRequestStatusOutput.apply _)
  }
  final implicit val GetCommentsForPullRequestInputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommentsForPullRequestInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.GetCommentsForPullRequestInput.apply _)
  }
  final implicit val PullRequestDecoder: io.circe.Decoder[avias.codecommit.models.PullRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codecommit.models.PullRequestTarget]]]("pullRequestTargets"), o.get[scala.Option[java.lang.String]]("authorArn"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[java.time.Instant]]("lastActivityDate"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.lang.String]]("title"), o.get[scala.Option[java.lang.String]]("pullRequestStatus"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.time.Instant]]("creationDate")).mapN(avias.codecommit.models.PullRequest.apply _)
  }
  final implicit val GetPullRequestInputDecoder: io.circe.Decoder[avias.codecommit.models.GetPullRequestInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("pullRequestId").map(avias.codecommit.models.GetPullRequestInput.apply _)
  }
  final implicit val MergePullRequestByFastForwardInputDecoder: io.circe.Decoder[avias.codecommit.models.MergePullRequestByFastForwardInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("sourceCommitId")).mapN(avias.codecommit.models.MergePullRequestByFastForwardInput.apply _)
  }
  final implicit val MaximumBranchesExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.MaximumBranchesExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.MaximumBranchesExceededException)
  final implicit val RepositoryTriggerDestinationArnRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTriggerDestinationArnRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryTriggerDestinationArnRequiredException)
  final implicit val PullRequestMergedStateChangedEventMetadataDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestMergedStateChangedEventMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("destinationReference"), o.get[scala.Option[avias.codecommit.models.MergeMetadata]]("mergeMetadata")).mapN(avias.codecommit.models.PullRequestMergedStateChangedEventMetadata.apply _)
  }
  final implicit val ListRepositoriesInputDecoder: io.circe.Decoder[avias.codecommit.models.ListRepositoriesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("sortBy"), o.get[scala.Option[java.lang.String]]("order")).mapN(avias.codecommit.models.ListRepositoriesInput.apply _)
  }
  final implicit val PostCommentReplyOutputDecoder: io.circe.Decoder[avias.codecommit.models.PostCommentReplyOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.Comment]]("comment").map(avias.codecommit.models.PostCommentReplyOutput.apply _)
  }
  final implicit val InvalidMergeOptionExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidMergeOptionException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidMergeOptionException)
  final implicit val CommitIdDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommitIdDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommitIdDoesNotExistException)
  final implicit val GetPullRequestOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetPullRequestOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codecommit.models.PullRequest]("pullRequest").map(avias.codecommit.models.GetPullRequestOutput.apply _)
  }
  final implicit val InvalidRepositoryTriggerNameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryTriggerNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryTriggerNameException)
  final implicit val GetDifferencesOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetDifferencesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codecommit.models.Difference]]]("differences"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.codecommit.models.GetDifferencesOutput.apply _)
  }
  final implicit val GetCommentsForPullRequestOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommentsForPullRequestOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codecommit.models.CommentsForPullRequest]]]("commentsForPullRequestData"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.GetCommentsForPullRequestOutput.apply _)
  }
  final implicit val CreatePullRequestOutputDecoder: io.circe.Decoder[avias.codecommit.models.CreatePullRequestOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codecommit.models.PullRequest]("pullRequest").map(avias.codecommit.models.CreatePullRequestOutput.apply _)
  }
  final implicit val EncryptionKeyAccessDeniedExceptionDecoder: io.circe.Decoder[avias.codecommit.models.EncryptionKeyAccessDeniedException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.EncryptionKeyAccessDeniedException)
  final implicit val InvalidPathExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidPathException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidPathException)
  final implicit val GetBlobOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetBlobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Array[scala.Byte]]("content").map(avias.codecommit.models.GetBlobOutput.apply _)
  }
  final implicit val TitleRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.TitleRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.TitleRequiredException)
  final implicit val UpdateRepositoryNameInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdateRepositoryNameInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("oldName"), o.get[java.lang.String]("newName")).mapN(avias.codecommit.models.UpdateRepositoryNameInput.apply _)
  }
  final implicit val ListPullRequestsOutputDecoder: io.circe.Decoder[avias.codecommit.models.ListPullRequestsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("pullRequestIds"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.ListPullRequestsOutput.apply _)
  }
  final implicit val DescribePullRequestEventsOutputDecoder: io.circe.Decoder[avias.codecommit.models.DescribePullRequestEventsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.codecommit.models.PullRequestEvent]]("pullRequestEvents"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.DescribePullRequestEventsOutput.apply _)
  }
  final implicit val MaximumOpenPullRequestsExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.MaximumOpenPullRequestsExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.MaximumOpenPullRequestsExceededException)
  final implicit val DifferenceDecoder: io.circe.Decoder[avias.codecommit.models.Difference] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codecommit.models.BlobMetadata]]("beforeBlob"), o.get[scala.Option[avias.codecommit.models.BlobMetadata]]("afterBlob"), o.get[scala.Option[java.lang.String]]("changeType")).mapN(avias.codecommit.models.Difference.apply _)
  }
  final implicit val GetCommitOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommitOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codecommit.models.Commit]("commit").map(avias.codecommit.models.GetCommitOutput.apply _)
  }
  final implicit val RepositoryTriggerDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTrigger] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("destinationArn"), o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("events"), o.get[scala.Option[scala.List[java.lang.String]]]("branches"), o.get[scala.Option[java.lang.String]]("customData")).mapN(avias.codecommit.models.RepositoryTrigger.apply _)
  }
  final implicit val InvalidRepositoryTriggerRegionExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryTriggerRegionException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryTriggerRegionException)
  final implicit val MergeMetadataDecoder: io.circe.Decoder[avias.codecommit.models.MergeMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("isMerged"), o.get[scala.Option[java.lang.String]]("mergedBy")).mapN(avias.codecommit.models.MergeMetadata.apply _)
  }
  final implicit val EncryptionIntegrityChecksFailedExceptionDecoder: io.circe.Decoder[avias.codecommit.models.EncryptionIntegrityChecksFailedException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.EncryptionIntegrityChecksFailedException)
  final implicit val RepositoryTriggerBranchNameListRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTriggerBranchNameListRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryTriggerBranchNameListRequiredException)
  final implicit val ReferenceNameRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.ReferenceNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.ReferenceNameRequiredException)
  final implicit val DeleteRepositoryOutputDecoder: io.circe.Decoder[avias.codecommit.models.DeleteRepositoryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("repositoryId").map(avias.codecommit.models.DeleteRepositoryOutput.apply _)
  }
  final implicit val BranchInfoDecoder: io.circe.Decoder[avias.codecommit.models.BranchInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("branchName"), o.get[scala.Option[java.lang.String]]("commitId")).mapN(avias.codecommit.models.BranchInfo.apply _)
  }
  final implicit val PullRequestIdRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.PullRequestIdRequiredException)
  final implicit val CreateBranchInputDecoder: io.circe.Decoder[avias.codecommit.models.CreateBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("branchName"), o.get[java.lang.String]("commitId")).mapN(avias.codecommit.models.CreateBranchInput.apply _)
  }
  final implicit val CommentsForPullRequestDecoder: io.circe.Decoder[avias.codecommit.models.CommentsForPullRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[avias.codecommit.models.Location]]("location"), o.get[scala.Option[scala.List[avias.codecommit.models.Comment]]]("comments")).mapN(avias.codecommit.models.CommentsForPullRequest.apply _)
  }
  final implicit val GetRepositoryTriggersOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetRepositoryTriggersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("configurationId"), o.get[scala.Option[scala.List[avias.codecommit.models.RepositoryTrigger]]]("triggers")).mapN(avias.codecommit.models.GetRepositoryTriggersOutput.apply _)
  }
  final implicit val DeleteCommentContentOutputDecoder: io.circe.Decoder[avias.codecommit.models.DeleteCommentContentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.Comment]]("comment").map(avias.codecommit.models.DeleteCommentContentOutput.apply _)
  }
  final implicit val InvalidTitleExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidTitleException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidTitleException)
  final implicit val CommentNotCreatedByCallerExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommentNotCreatedByCallerException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommentNotCreatedByCallerException)
  final implicit val SourceAndDestinationAreSameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.SourceAndDestinationAreSameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.SourceAndDestinationAreSameException)
  final implicit val GetMergeConflictsInputDecoder: io.circe.Decoder[avias.codecommit.models.GetMergeConflictsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("destinationCommitSpecifier"), o.get[java.lang.String]("sourceCommitSpecifier"), o.get[java.lang.String]("mergeOption")).mapN(avias.codecommit.models.GetMergeConflictsInput.apply _)
  }
  final implicit val CommitIdRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommitIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommitIdRequiredException)
  final implicit val RepositoryTriggerEventsListRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTriggerEventsListRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryTriggerEventsListRequiredException)
  final implicit val CommentsForComparedCommitDecoder: io.circe.Decoder[avias.codecommit.models.CommentsForComparedCommit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[avias.codecommit.models.Location]]("location"), o.get[scala.Option[scala.List[avias.codecommit.models.Comment]]]("comments")).mapN(avias.codecommit.models.CommentsForComparedCommit.apply _)
  }
  final implicit val PutRepositoryTriggersOutputDecoder: io.circe.Decoder[avias.codecommit.models.PutRepositoryTriggersOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("configurationId").map(avias.codecommit.models.PutRepositoryTriggersOutput.apply _)
  }
  final implicit val InvalidRepositoryTriggerCustomDataExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryTriggerCustomDataException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryTriggerCustomDataException)
  final implicit val GetBranchInputDecoder: io.circe.Decoder[avias.codecommit.models.GetBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("branchName")).mapN(avias.codecommit.models.GetBranchInput.apply _)
  }
  final implicit val ReferenceTypeNotSupportedExceptionDecoder: io.circe.Decoder[avias.codecommit.models.ReferenceTypeNotSupportedException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.ReferenceTypeNotSupportedException)
  final implicit val InvalidRepositoryTriggerDestinationArnExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryTriggerDestinationArnException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryTriggerDestinationArnException)
  final implicit val InvalidRelativeFileVersionEnumExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRelativeFileVersionEnumException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRelativeFileVersionEnumException)
  final implicit val InvalidTargetExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidTargetException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidTargetException)
  final implicit val InvalidClientRequestTokenExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidClientRequestTokenException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidClientRequestTokenException)
  final implicit val PullRequestAlreadyClosedExceptionDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestAlreadyClosedException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.PullRequestAlreadyClosedException)
  final implicit val RepositoryLimitExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryLimitExceededException)
  final implicit val UpdatePullRequestDescriptionInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdatePullRequestDescriptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("description")).mapN(avias.codecommit.models.UpdatePullRequestDescriptionInput.apply _)
  }
  final implicit val GetDifferencesInputDecoder: io.circe.Decoder[avias.codecommit.models.GetDifferencesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("afterCommitSpecifier"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("beforePath"), o.get[scala.Option[java.lang.String]]("afterPath"), o.get[scala.Option[java.lang.String]]("beforeCommitSpecifier"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.codecommit.models.GetDifferencesInput.apply _)
  }
  final implicit val ListRepositoriesOutputDecoder: io.circe.Decoder[avias.codecommit.models.ListRepositoriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codecommit.models.RepositoryNameIdPair]]]("repositories"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.ListRepositoriesOutput.apply _)
  }
  final implicit val MultipleRepositoriesInPullRequestExceptionDecoder: io.circe.Decoder[avias.codecommit.models.MultipleRepositoriesInPullRequestException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.MultipleRepositoriesInPullRequestException)
  final implicit val InvalidRepositoryTriggerEventsExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidRepositoryTriggerEventsException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidRepositoryTriggerEventsException)
  final implicit val GetCommentOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.Comment]]("comment").map(avias.codecommit.models.GetCommentOutput.apply _)
  }
  final implicit val RepositoryDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryDoesNotExistException)
  final implicit val InvalidFilePositionExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidFilePositionException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidFilePositionException)
  final implicit val RepositoryNamesRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryNamesRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryNamesRequiredException)
  final implicit val InvalidActorArnExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidActorArnException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidActorArnException)
  final implicit val GetMergeConflictsOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetMergeConflictsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("mergeable"), o.get[java.lang.String]("destinationCommitId"), o.get[java.lang.String]("sourceCommitId")).mapN(avias.codecommit.models.GetMergeConflictsOutput.apply _)
  }
  final implicit val InvalidMaxResultsExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidMaxResultsException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidMaxResultsException)
  final implicit val BatchGetRepositoriesOutputDecoder: io.circe.Decoder[avias.codecommit.models.BatchGetRepositoriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codecommit.models.RepositoryMetadata]]]("repositories"), o.get[scala.Option[scala.List[java.lang.String]]]("repositoriesNotFound")).mapN(avias.codecommit.models.BatchGetRepositoriesOutput.apply _)
  }
  final implicit val UpdateCommentOutputDecoder: io.circe.Decoder[avias.codecommit.models.UpdateCommentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.Comment]]("comment").map(avias.codecommit.models.UpdateCommentOutput.apply _)
  }
  final implicit val TargetRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.TargetRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.TargetRequiredException)
  final implicit val CommentContentSizeLimitExceededExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommentContentSizeLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommentContentSizeLimitExceededException)
  final implicit val InvalidPullRequestStatusExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidPullRequestStatusException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidPullRequestStatusException)
  final implicit val DescribePullRequestEventsInputDecoder: io.circe.Decoder[avias.codecommit.models.DescribePullRequestEventsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("actorArn"), o.get[scala.Option[java.lang.String]]("pullRequestEventType"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.DescribePullRequestEventsInput.apply _)
  }
  final implicit val InvalidDestinationCommitSpecifierExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidDestinationCommitSpecifierException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidDestinationCommitSpecifierException)
  final implicit val GetRepositoryInputDecoder: io.circe.Decoder[avias.codecommit.models.GetRepositoryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(avias.codecommit.models.GetRepositoryInput.apply _)
  }
  final implicit val MergeOptionRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.MergeOptionRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.MergeOptionRequiredException)
  final implicit val UpdatePullRequestTitleOutputDecoder: io.circe.Decoder[avias.codecommit.models.UpdatePullRequestTitleOutput] = io.circe.Decoder.instance { o => 
    o.get[avias.codecommit.models.PullRequest]("pullRequest").map(avias.codecommit.models.UpdatePullRequestTitleOutput.apply _)
  }
  final implicit val BlobIdDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.BlobIdDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.BlobIdDoesNotExistException)
  final implicit val TargetsRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.TargetsRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.TargetsRequiredException)
  final implicit val DeleteBranchOutputDecoder: io.circe.Decoder[avias.codecommit.models.DeleteBranchOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.BranchInfo]]("deletedBranch").map(avias.codecommit.models.DeleteBranchOutput.apply _)
  }
  final implicit val InvalidPullRequestStatusUpdateExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidPullRequestStatusUpdateException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidPullRequestStatusUpdateException)
  final implicit val UpdateCommentInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdateCommentInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("commentId"), o.get[java.lang.String]("content")).mapN(avias.codecommit.models.UpdateCommentInput.apply _)
  }
  final implicit val BlobIdRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.BlobIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.BlobIdRequiredException)
  final implicit val InvalidSortByExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidSortByException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidSortByException)
  final implicit val GetBranchOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetBranchOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.BranchInfo]]("branch").map(avias.codecommit.models.GetBranchOutput.apply _)
  }
  final implicit val InvalidAuthorArnExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidAuthorArnException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidAuthorArnException)
  final implicit val CommentDecoder: io.circe.Decoder[avias.codecommit.models.Comment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("content"), o.get[scala.Option[scala.Boolean]]("deleted"), o.get[scala.Option[java.lang.String]]("authorArn"), o.get[scala.Option[java.lang.String]]("commentId"), o.get[scala.Option[java.lang.String]]("inReplyTo"), o.get[scala.Option[java.time.Instant]]("lastModifiedDate"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.time.Instant]]("creationDate")).mapN(avias.codecommit.models.Comment.apply _)
  }
  final implicit val InvalidPullRequestEventTypeExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidPullRequestEventTypeException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidPullRequestEventTypeException)
  final implicit val GetBlobInputDecoder: io.circe.Decoder[avias.codecommit.models.GetBlobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("blobId")).mapN(avias.codecommit.models.GetBlobInput.apply _)
  }
  final implicit val UpdateRepositoryDescriptionInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdateRepositoryDescriptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("repositoryDescription")).mapN(avias.codecommit.models.UpdateRepositoryDescriptionInput.apply _)
  }
  final implicit val EncryptionKeyUnavailableExceptionDecoder: io.circe.Decoder[avias.codecommit.models.EncryptionKeyUnavailableException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.EncryptionKeyUnavailableException)
  final implicit val InvalidTargetsExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidTargetsException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidTargetsException)
  final implicit val PullRequestDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.PullRequestDoesNotExistException)
  final implicit val LocationDecoder: io.circe.Decoder[avias.codecommit.models.Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("filePath"), o.get[scala.Option[scala.Long]]("filePosition"), o.get[scala.Option[java.lang.String]]("relativeFileVersion")).mapN(avias.codecommit.models.Location.apply _)
  }
  final implicit val BeforeCommitIdAndAfterCommitIdAreSameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.BeforeCommitIdAndAfterCommitIdAreSameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.BeforeCommitIdAndAfterCommitIdAreSameException)
  final implicit val PostCommentReplyInputDecoder: io.circe.Decoder[avias.codecommit.models.PostCommentReplyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("inReplyTo"), o.get[java.lang.String]("content"), o.get[scala.Option[java.lang.String]]("clientRequestToken")).mapN(avias.codecommit.models.PostCommentReplyInput.apply _)
  }
  final implicit val UpdatePullRequestStatusInputDecoder: io.circe.Decoder[avias.codecommit.models.UpdatePullRequestStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("pullRequestStatus")).mapN(avias.codecommit.models.UpdatePullRequestStatusInput.apply _)
  }
  final implicit val CommitDecoder: io.circe.Decoder[avias.codecommit.models.Commit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.codecommit.models.UserInfo]]("author"), o.get[scala.Option[avias.codecommit.models.UserInfo]]("committer"), o.get[scala.Option[java.lang.String]]("commitId"), o.get[scala.Option[java.lang.String]]("treeId"), o.get[scala.Option[java.lang.String]]("additionalData"), o.get[scala.Option[scala.List[java.lang.String]]]("parents"), o.get[scala.Option[java.lang.String]]("message")).mapN(avias.codecommit.models.Commit.apply _)
  }
  final implicit val AuthorDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.AuthorDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.AuthorDoesNotExistException)
  final implicit val RepositoryMetadataDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("defaultBranch"), o.get[scala.Option[java.lang.String]]("repositoryDescription"), o.get[scala.Option[java.time.Instant]]("lastModifiedDate"), o.get[scala.Option[java.lang.String]]("cloneUrlHttp"), o.get[scala.Option[java.lang.String]]("repositoryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("cloneUrlSsh"), o.get[scala.Option[java.time.Instant]]("creationDate"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(avias.codecommit.models.RepositoryMetadata.apply _)
  }
  final implicit val PullRequestStatusRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestStatusRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.PullRequestStatusRequiredException)
  final implicit val InvalidBlobIdExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidBlobIdException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidBlobIdException)
  final implicit val MergePullRequestByFastForwardOutputDecoder: io.circe.Decoder[avias.codecommit.models.MergePullRequestByFastForwardOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.codecommit.models.PullRequest]]("pullRequest").map(avias.codecommit.models.MergePullRequestByFastForwardOutput.apply _)
  }
  final implicit val RepositoryTriggersListRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryTriggersListRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryTriggersListRequiredException)
  final implicit val BranchNameRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.BranchNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.BranchNameRequiredException)
  final implicit val InvalidReferenceNameExceptionDecoder: io.circe.Decoder[avias.codecommit.models.InvalidReferenceNameException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.InvalidReferenceNameException)
  final implicit val RepositoryNotAssociatedWithPullRequestExceptionDecoder: io.circe.Decoder[avias.codecommit.models.RepositoryNotAssociatedWithPullRequestException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.RepositoryNotAssociatedWithPullRequestException)
  final implicit val CommentDoesNotExistExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommentDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommentDoesNotExistException)
  final implicit val CommentIdRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommentIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommentIdRequiredException)
  final implicit val ManualMergeRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.ManualMergeRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.ManualMergeRequiredException)
  final implicit val TipOfSourceReferenceIsDifferentExceptionDecoder: io.circe.Decoder[avias.codecommit.models.TipOfSourceReferenceIsDifferentException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.TipOfSourceReferenceIsDifferentException)
  final implicit val PutRepositoryTriggersInputDecoder: io.circe.Decoder[avias.codecommit.models.PutRepositoryTriggersInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[avias.codecommit.models.RepositoryTrigger]]("triggers")).mapN(avias.codecommit.models.PutRepositoryTriggersInput.apply _)
  }
  final implicit val PostCommentForPullRequestOutputDecoder: io.circe.Decoder[avias.codecommit.models.PostCommentForPullRequestOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[avias.codecommit.models.Comment]]("comment"), o.get[scala.Option[avias.codecommit.models.Location]]("location")).mapN(avias.codecommit.models.PostCommentForPullRequestOutput.apply _)
  }
  final implicit val CommentContentRequiredExceptionDecoder: io.circe.Decoder[avias.codecommit.models.CommentContentRequiredException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.CommentContentRequiredException)
  final implicit val PullRequestEventDecoder: io.circe.Decoder[avias.codecommit.models.PullRequestEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("eventDate"), o.get[scala.Option[avias.codecommit.models.PullRequestStatusChangedEventMetadata]]("pullRequestStatusChangedEventMetadata"), o.get[scala.Option[java.lang.String]]("actorArn"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[avias.codecommit.models.PullRequestSourceReferenceUpdatedEventMetadata]]("pullRequestSourceReferenceUpdatedEventMetadata"), o.get[scala.Option[avias.codecommit.models.PullRequestMergedStateChangedEventMetadata]]("pullRequestMergedStateChangedEventMetadata"), o.get[scala.Option[java.lang.String]]("pullRequestEventType")).mapN(avias.codecommit.models.PullRequestEvent.apply _)
  }
  final implicit val DefaultBranchCannotBeDeletedExceptionDecoder: io.circe.Decoder[avias.codecommit.models.DefaultBranchCannotBeDeletedException.type] = io.circe.Decoder.decodeUnit.as(avias.codecommit.models.DefaultBranchCannotBeDeletedException)
  final implicit val GetRepositoryTriggersInputDecoder: io.circe.Decoder[avias.codecommit.models.GetRepositoryTriggersInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(avias.codecommit.models.GetRepositoryTriggersInput.apply _)
  }
  final implicit val GetCommentsForComparedCommitOutputDecoder: io.circe.Decoder[avias.codecommit.models.GetCommentsForComparedCommitOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.codecommit.models.CommentsForComparedCommit]]]("commentsForComparedCommitData"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.codecommit.models.GetCommentsForComparedCommitOutput.apply _)
  }
}