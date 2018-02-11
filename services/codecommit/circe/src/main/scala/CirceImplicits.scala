package org.lyranthe.araethura.codecommit
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetRepositoryOutputEncoder: io.circe.Encoder[models.GetRepositoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryMetadata" -> o.repositoryMetadata.asJson)
  }
  final implicit val ListBranchesInputEncoder: io.circe.Encoder[models.ListBranchesInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidRepositoryDescriptionExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryDescriptionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNameRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidContinuationTokenExceptionEncoder: io.circe.Encoder[models.InvalidContinuationTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateRepositoryOutputEncoder: io.circe.Encoder[models.CreateRepositoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryMetadata" -> o.repositoryMetadata.asJson)
  }
  final implicit val RepositoryNameExistsExceptionEncoder: io.circe.Encoder[models.RepositoryNameExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestTitleInputEncoder: io.circe.Encoder[models.UpdatePullRequestTitleInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "title" -> o.title.asJson)
  }
  final implicit val TargetEncoder: io.circe.Encoder[models.Target] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "sourceReference" -> o.sourceReference.asJson, "destinationReference" -> o.destinationReference.asJson)
  }
  final implicit val ListBranchesOutputEncoder: io.circe.Encoder[models.ListBranchesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("branches" -> o.branches.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val RepositoryTriggerNameRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryTriggerNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ActorDoesNotExistExceptionEncoder: io.circe.Encoder[models.ActorDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentDeletedExceptionEncoder: io.circe.Encoder[models.CommentDeletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNameIdPairEncoder: io.circe.Encoder[models.RepositoryNameIdPair] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "repositoryId" -> o.repositoryId.asJson)
  }
  final implicit val PullRequestStatusChangedEventMetadataEncoder: io.circe.Encoder[models.PullRequestStatusChangedEventMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestStatus" -> o.pullRequestStatus.asJson)
  }
  final implicit val InvalidCommentIdExceptionEncoder: io.circe.Encoder[models.InvalidCommentIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ClientRequestTokenRequiredExceptionEncoder: io.circe.Encoder[models.ClientRequestTokenRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommitInputEncoder: io.circe.Encoder[models.GetCommitInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val CommitRequiredExceptionEncoder: io.circe.Encoder[models.CommitRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetRepositoriesInputEncoder: io.circe.Encoder[models.BatchGetRepositoriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryNames" -> o.repositoryNames.asJson)
  }
  final implicit val FileTooLargeExceptionEncoder: io.circe.Encoder[models.FileTooLargeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UserInfoEncoder: io.circe.Encoder[models.UserInfo] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "email" -> o.email.asJson, "date" -> o.date.asJson)
  }
  final implicit val UpdatePullRequestDescriptionOutputEncoder: io.circe.Encoder[models.UpdatePullRequestDescriptionOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val InvalidOrderExceptionEncoder: io.circe.Encoder[models.InvalidOrderException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentForComparedCommitInputEncoder: io.circe.Encoder[models.PostCommentForComparedCommitInput] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "location" -> o.location.asJson)
  }
  final implicit val PullRequestTargetEncoder: io.circe.Encoder[models.PullRequestTarget] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "sourceReference" -> o.sourceReference.asJson, "destinationReference" -> o.destinationReference.asJson, "destinationCommit" -> o.destinationCommit.asJson, "sourceCommit" -> o.sourceCommit.asJson, "mergeMetadata" -> o.mergeMetadata.asJson)
  }
  final implicit val InvalidRepositoryNameExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TestRepositoryTriggersInputEncoder: io.circe.Encoder[models.TestRepositoryTriggersInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "triggers" -> o.triggers.asJson)
  }
  final implicit val IdempotencyParameterMismatchExceptionEncoder: io.circe.Encoder[models.IdempotencyParameterMismatchException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PathDoesNotExistExceptionEncoder: io.circe.Encoder[models.PathDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentForPullRequestInputEncoder: io.circe.Encoder[models.PostCommentForPullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson, "pullRequestId" -> o.pullRequestId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "location" -> o.location.asJson)
  }
  final implicit val EncryptionKeyDisabledExceptionEncoder: io.circe.Encoder[models.EncryptionKeyDisabledException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidPullRequestIdExceptionEncoder: io.circe.Encoder[models.InvalidPullRequestIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerExecutionFailureEncoder: io.circe.Encoder[models.RepositoryTriggerExecutionFailure] = io.circe.Encoder.instance { o => 
    Json.obj("trigger" -> o.trigger.asJson, "failureMessage" -> o.failureMessage.asJson)
  }
  final implicit val InvalidCommitIdExceptionEncoder: io.circe.Encoder[models.InvalidCommitIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidDescriptionExceptionEncoder: io.circe.Encoder[models.InvalidDescriptionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommentsForComparedCommitInputEncoder: io.circe.Encoder[models.GetCommentsForComparedCommitInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "afterCommitId" -> o.afterCommitId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "nextToken" -> o.nextToken.asJson, "maxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteBranchInputEncoder: io.circe.Encoder[models.DeleteBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "branchName" -> o.branchName.asJson)
  }
  final implicit val InvalidBranchNameExceptionEncoder: io.circe.Encoder[models.InvalidBranchNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteCommentContentInputEncoder: io.circe.Encoder[models.DeleteCommentContentInput] = io.circe.Encoder.instance { o => 
    Json.obj("commentId" -> o.commentId.asJson)
  }
  final implicit val ReferenceDoesNotExistExceptionEncoder: io.circe.Encoder[models.ReferenceDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BranchDoesNotExistExceptionEncoder: io.circe.Encoder[models.BranchDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRepositoryTriggerBranchNameExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryTriggerBranchNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateRepositoryInputEncoder: io.circe.Encoder[models.CreateRepositoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "repositoryDescription" -> o.repositoryDescription.asJson)
  }
  final implicit val TipsDivergenceExceededExceptionEncoder: io.circe.Encoder[models.TipsDivergenceExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BlobMetadataEncoder: io.circe.Encoder[models.BlobMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("blobId" -> o.blobId.asJson, "path" -> o.path.asJson, "mode" -> o.mode.asJson)
  }
  final implicit val CreatePullRequestInputEncoder: io.circe.Encoder[models.CreatePullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("title" -> o.title.asJson, "targets" -> o.targets.asJson, "description" -> o.description.asJson, "clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val GetCommentInputEncoder: io.circe.Encoder[models.GetCommentInput] = io.circe.Encoder.instance { o => 
    Json.obj("commentId" -> o.commentId.asJson)
  }
  final implicit val ListPullRequestsInputEncoder: io.circe.Encoder[models.ListPullRequestsInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "maxResults" -> o.maxResults.asJson, "authorArn" -> o.authorArn.asJson, "pullRequestStatus" -> o.pullRequestStatus.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteRepositoryInputEncoder: io.circe.Encoder[models.DeleteRepositoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val PathRequiredExceptionEncoder: io.circe.Encoder[models.PathRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MaximumRepositoryNamesExceededExceptionEncoder: io.circe.Encoder[models.MaximumRepositoryNamesExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidCommitExceptionEncoder: io.circe.Encoder[models.InvalidCommitException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentForComparedCommitOutputEncoder: io.circe.Encoder[models.PostCommentForComparedCommitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "comment" -> o.comment.asJson, "location" -> o.location.asJson)
  }
  final implicit val MaximumRepositoryTriggersExceededExceptionEncoder: io.circe.Encoder[models.MaximumRepositoryTriggersExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TestRepositoryTriggersOutputEncoder: io.circe.Encoder[models.TestRepositoryTriggersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("successfulExecutions" -> o.successfulExecutions.asJson, "failedExecutions" -> o.failedExecutions.asJson)
  }
  final implicit val EncryptionKeyNotFoundExceptionEncoder: io.circe.Encoder[models.EncryptionKeyNotFoundException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateDefaultBranchInputEncoder: io.circe.Encoder[models.UpdateDefaultBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "defaultBranchName" -> o.defaultBranchName.asJson)
  }
  final implicit val BranchNameExistsExceptionEncoder: io.circe.Encoder[models.BranchNameExistsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommitDoesNotExistExceptionEncoder: io.circe.Encoder[models.CommitDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestSourceReferenceUpdatedEventMetadataEncoder: io.circe.Encoder[models.PullRequestSourceReferenceUpdatedEventMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson)
  }
  final implicit val InvalidFileLocationExceptionEncoder: io.circe.Encoder[models.InvalidFileLocationException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSourceCommitSpecifierExceptionEncoder: io.circe.Encoder[models.InvalidSourceCommitSpecifierException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestStatusOutputEncoder: io.circe.Encoder[models.UpdatePullRequestStatusOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val GetCommentsForPullRequestInputEncoder: io.circe.Encoder[models.GetCommentsForPullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "maxResults" -> o.maxResults.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val PullRequestEncoder: io.circe.Encoder[models.PullRequest] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestTargets" -> o.pullRequestTargets.asJson, "authorArn" -> o.authorArn.asJson, "pullRequestId" -> o.pullRequestId.asJson, "lastActivityDate" -> o.lastActivityDate.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "title" -> o.title.asJson, "pullRequestStatus" -> o.pullRequestStatus.asJson, "description" -> o.description.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val GetPullRequestInputEncoder: io.circe.Encoder[models.GetPullRequestInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson)
  }
  final implicit val MergePullRequestByFastForwardInputEncoder: io.circe.Encoder[models.MergePullRequestByFastForwardInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "repositoryName" -> o.repositoryName.asJson, "sourceCommitId" -> o.sourceCommitId.asJson)
  }
  final implicit val MaximumBranchesExceededExceptionEncoder: io.circe.Encoder[models.MaximumBranchesExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerDestinationArnRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryTriggerDestinationArnRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestMergedStateChangedEventMetadataEncoder: io.circe.Encoder[models.PullRequestMergedStateChangedEventMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "destinationReference" -> o.destinationReference.asJson, "mergeMetadata" -> o.mergeMetadata.asJson)
  }
  final implicit val ListRepositoriesInputEncoder: io.circe.Encoder[models.ListRepositoriesInput] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson, "sortBy" -> o.sortBy.asJson, "order" -> o.order.asJson)
  }
  final implicit val PostCommentReplyOutputEncoder: io.circe.Encoder[models.PostCommentReplyOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val InvalidMergeOptionExceptionEncoder: io.circe.Encoder[models.InvalidMergeOptionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommitIdDoesNotExistExceptionEncoder: io.circe.Encoder[models.CommitIdDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetPullRequestOutputEncoder: io.circe.Encoder[models.GetPullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val InvalidRepositoryTriggerNameExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryTriggerNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDifferencesOutputEncoder: io.circe.Encoder[models.GetDifferencesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("differences" -> o.differences.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val GetCommentsForPullRequestOutputEncoder: io.circe.Encoder[models.GetCommentsForPullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("commentsForPullRequestData" -> o.commentsForPullRequestData.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreatePullRequestOutputEncoder: io.circe.Encoder[models.CreatePullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val EncryptionKeyAccessDeniedExceptionEncoder: io.circe.Encoder[models.EncryptionKeyAccessDeniedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidPathExceptionEncoder: io.circe.Encoder[models.InvalidPathException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBlobOutputEncoder: io.circe.Encoder[models.GetBlobOutput] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson)
  }
  final implicit val TitleRequiredExceptionEncoder: io.circe.Encoder[models.TitleRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateRepositoryNameInputEncoder: io.circe.Encoder[models.UpdateRepositoryNameInput] = io.circe.Encoder.instance { o => 
    Json.obj("oldName" -> o.oldName.asJson, "newName" -> o.newName.asJson)
  }
  final implicit val ListPullRequestsOutputEncoder: io.circe.Encoder[models.ListPullRequestsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestIds" -> o.pullRequestIds.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribePullRequestEventsOutputEncoder: io.circe.Encoder[models.DescribePullRequestEventsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestEvents" -> o.pullRequestEvents.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val MaximumOpenPullRequestsExceededExceptionEncoder: io.circe.Encoder[models.MaximumOpenPullRequestsExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DifferenceEncoder: io.circe.Encoder[models.Difference] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlob" -> o.beforeBlob.asJson, "afterBlob" -> o.afterBlob.asJson, "changeType" -> o.changeType.asJson)
  }
  final implicit val GetCommitOutputEncoder: io.circe.Encoder[models.GetCommitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("commit" -> o.commit.asJson)
  }
  final implicit val RepositoryTriggerEncoder: io.circe.Encoder[models.RepositoryTrigger] = io.circe.Encoder.instance { o => 
    Json.obj("destinationArn" -> o.destinationArn.asJson, "name" -> o.name.asJson, "events" -> o.events.asJson, "branches" -> o.branches.asJson, "customData" -> o.customData.asJson)
  }
  final implicit val InvalidRepositoryTriggerRegionExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryTriggerRegionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MergeMetadataEncoder: io.circe.Encoder[models.MergeMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("isMerged" -> o.isMerged.asJson, "mergedBy" -> o.mergedBy.asJson)
  }
  final implicit val EncryptionIntegrityChecksFailedExceptionEncoder: io.circe.Encoder[models.EncryptionIntegrityChecksFailedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerBranchNameListRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryTriggerBranchNameListRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReferenceNameRequiredExceptionEncoder: io.circe.Encoder[models.ReferenceNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteRepositoryOutputEncoder: io.circe.Encoder[models.DeleteRepositoryOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryId" -> o.repositoryId.asJson)
  }
  final implicit val BranchInfoEncoder: io.circe.Encoder[models.BranchInfo] = io.circe.Encoder.instance { o => 
    Json.obj("branchName" -> o.branchName.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val PullRequestIdRequiredExceptionEncoder: io.circe.Encoder[models.PullRequestIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateBranchInputEncoder: io.circe.Encoder[models.CreateBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "branchName" -> o.branchName.asJson, "commitId" -> o.commitId.asJson)
  }
  final implicit val CommentsForPullRequestEncoder: io.circe.Encoder[models.CommentsForPullRequest] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "pullRequestId" -> o.pullRequestId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "location" -> o.location.asJson, "comments" -> o.comments.asJson)
  }
  final implicit val GetRepositoryTriggersOutputEncoder: io.circe.Encoder[models.GetRepositoryTriggersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson, "triggers" -> o.triggers.asJson)
  }
  final implicit val DeleteCommentContentOutputEncoder: io.circe.Encoder[models.DeleteCommentContentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val InvalidTitleExceptionEncoder: io.circe.Encoder[models.InvalidTitleException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentNotCreatedByCallerExceptionEncoder: io.circe.Encoder[models.CommentNotCreatedByCallerException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SourceAndDestinationAreSameExceptionEncoder: io.circe.Encoder[models.SourceAndDestinationAreSameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetMergeConflictsInputEncoder: io.circe.Encoder[models.GetMergeConflictsInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "destinationCommitSpecifier" -> o.destinationCommitSpecifier.asJson, "sourceCommitSpecifier" -> o.sourceCommitSpecifier.asJson, "mergeOption" -> o.mergeOption.asJson)
  }
  final implicit val CommitIdRequiredExceptionEncoder: io.circe.Encoder[models.CommitIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryTriggerEventsListRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryTriggerEventsListRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentsForComparedCommitEncoder: io.circe.Encoder[models.CommentsForComparedCommit] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "location" -> o.location.asJson, "comments" -> o.comments.asJson)
  }
  final implicit val PutRepositoryTriggersOutputEncoder: io.circe.Encoder[models.PutRepositoryTriggersOutput] = io.circe.Encoder.instance { o => 
    Json.obj("configurationId" -> o.configurationId.asJson)
  }
  final implicit val InvalidRepositoryTriggerCustomDataExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryTriggerCustomDataException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBranchInputEncoder: io.circe.Encoder[models.GetBranchInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "branchName" -> o.branchName.asJson)
  }
  final implicit val ReferenceTypeNotSupportedExceptionEncoder: io.circe.Encoder[models.ReferenceTypeNotSupportedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRepositoryTriggerDestinationArnExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryTriggerDestinationArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRelativeFileVersionEnumExceptionEncoder: io.circe.Encoder[models.InvalidRelativeFileVersionEnumException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTargetExceptionEncoder: io.circe.Encoder[models.InvalidTargetException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidClientRequestTokenExceptionEncoder: io.circe.Encoder[models.InvalidClientRequestTokenException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestAlreadyClosedExceptionEncoder: io.circe.Encoder[models.PullRequestAlreadyClosedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryLimitExceededExceptionEncoder: io.circe.Encoder[models.RepositoryLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestDescriptionInputEncoder: io.circe.Encoder[models.UpdatePullRequestDescriptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "description" -> o.description.asJson)
  }
  final implicit val GetDifferencesInputEncoder: io.circe.Encoder[models.GetDifferencesInput] = io.circe.Encoder.instance { o => 
    Json.obj("afterCommitSpecifier" -> o.afterCommitSpecifier.asJson, "repositoryName" -> o.repositoryName.asJson, "MaxResults" -> o.maxResults.asJson, "beforePath" -> o.beforePath.asJson, "afterPath" -> o.afterPath.asJson, "beforeCommitSpecifier" -> o.beforeCommitSpecifier.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListRepositoriesOutputEncoder: io.circe.Encoder[models.ListRepositoriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositories" -> o.repositories.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val MultipleRepositoriesInPullRequestExceptionEncoder: io.circe.Encoder[models.MultipleRepositoriesInPullRequestException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidRepositoryTriggerEventsExceptionEncoder: io.circe.Encoder[models.InvalidRepositoryTriggerEventsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetCommentOutputEncoder: io.circe.Encoder[models.GetCommentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val RepositoryDoesNotExistExceptionEncoder: io.circe.Encoder[models.RepositoryDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidFilePositionExceptionEncoder: io.circe.Encoder[models.InvalidFilePositionException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNamesRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryNamesRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidActorArnExceptionEncoder: io.circe.Encoder[models.InvalidActorArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetMergeConflictsOutputEncoder: io.circe.Encoder[models.GetMergeConflictsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("mergeable" -> o.mergeable.asJson, "destinationCommitId" -> o.destinationCommitId.asJson, "sourceCommitId" -> o.sourceCommitId.asJson)
  }
  final implicit val InvalidMaxResultsExceptionEncoder: io.circe.Encoder[models.InvalidMaxResultsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BatchGetRepositoriesOutputEncoder: io.circe.Encoder[models.BatchGetRepositoriesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("repositories" -> o.repositories.asJson, "repositoriesNotFound" -> o.repositoriesNotFound.asJson)
  }
  final implicit val UpdateCommentOutputEncoder: io.circe.Encoder[models.UpdateCommentOutput] = io.circe.Encoder.instance { o => 
    Json.obj("comment" -> o.comment.asJson)
  }
  final implicit val TargetRequiredExceptionEncoder: io.circe.Encoder[models.TargetRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentContentSizeLimitExceededExceptionEncoder: io.circe.Encoder[models.CommentContentSizeLimitExceededException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidPullRequestStatusExceptionEncoder: io.circe.Encoder[models.InvalidPullRequestStatusException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribePullRequestEventsInputEncoder: io.circe.Encoder[models.DescribePullRequestEventsInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "maxResults" -> o.maxResults.asJson, "actorArn" -> o.actorArn.asJson, "pullRequestEventType" -> o.pullRequestEventType.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidDestinationCommitSpecifierExceptionEncoder: io.circe.Encoder[models.InvalidDestinationCommitSpecifierException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetRepositoryInputEncoder: io.circe.Encoder[models.GetRepositoryInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val MergeOptionRequiredExceptionEncoder: io.circe.Encoder[models.MergeOptionRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdatePullRequestTitleOutputEncoder: io.circe.Encoder[models.UpdatePullRequestTitleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val BlobIdDoesNotExistExceptionEncoder: io.circe.Encoder[models.BlobIdDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TargetsRequiredExceptionEncoder: io.circe.Encoder[models.TargetsRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteBranchOutputEncoder: io.circe.Encoder[models.DeleteBranchOutput] = io.circe.Encoder.instance { o => 
    Json.obj("deletedBranch" -> o.deletedBranch.asJson)
  }
  final implicit val InvalidPullRequestStatusUpdateExceptionEncoder: io.circe.Encoder[models.InvalidPullRequestStatusUpdateException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateCommentInputEncoder: io.circe.Encoder[models.UpdateCommentInput] = io.circe.Encoder.instance { o => 
    Json.obj("commentId" -> o.commentId.asJson, "content" -> o.content.asJson)
  }
  final implicit val BlobIdRequiredExceptionEncoder: io.circe.Encoder[models.BlobIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidSortByExceptionEncoder: io.circe.Encoder[models.InvalidSortByException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBranchOutputEncoder: io.circe.Encoder[models.GetBranchOutput] = io.circe.Encoder.instance { o => 
    Json.obj("branch" -> o.branch.asJson)
  }
  final implicit val InvalidAuthorArnExceptionEncoder: io.circe.Encoder[models.InvalidAuthorArnException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentEncoder: io.circe.Encoder[models.Comment] = io.circe.Encoder.instance { o => 
    Json.obj("content" -> o.content.asJson, "deleted" -> o.deleted.asJson, "authorArn" -> o.authorArn.asJson, "commentId" -> o.commentId.asJson, "inReplyTo" -> o.inReplyTo.asJson, "lastModifiedDate" -> o.lastModifiedDate.asJson, "clientRequestToken" -> o.clientRequestToken.asJson, "creationDate" -> o.creationDate.asJson)
  }
  final implicit val InvalidPullRequestEventTypeExceptionEncoder: io.circe.Encoder[models.InvalidPullRequestEventTypeException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetBlobInputEncoder: io.circe.Encoder[models.GetBlobInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "blobId" -> o.blobId.asJson)
  }
  final implicit val UpdateRepositoryDescriptionInputEncoder: io.circe.Encoder[models.UpdateRepositoryDescriptionInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "repositoryDescription" -> o.repositoryDescription.asJson)
  }
  final implicit val EncryptionKeyUnavailableExceptionEncoder: io.circe.Encoder[models.EncryptionKeyUnavailableException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidTargetsExceptionEncoder: io.circe.Encoder[models.InvalidTargetsException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestDoesNotExistExceptionEncoder: io.circe.Encoder[models.PullRequestDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LocationEncoder: io.circe.Encoder[models.Location] = io.circe.Encoder.instance { o => 
    Json.obj("filePath" -> o.filePath.asJson, "filePosition" -> o.filePosition.asJson, "relativeFileVersion" -> o.relativeFileVersion.asJson)
  }
  final implicit val BeforeCommitIdAndAfterCommitIdAreSameExceptionEncoder: io.circe.Encoder[models.BeforeCommitIdAndAfterCommitIdAreSameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PostCommentReplyInputEncoder: io.circe.Encoder[models.PostCommentReplyInput] = io.circe.Encoder.instance { o => 
    Json.obj("inReplyTo" -> o.inReplyTo.asJson, "content" -> o.content.asJson, "clientRequestToken" -> o.clientRequestToken.asJson)
  }
  final implicit val UpdatePullRequestStatusInputEncoder: io.circe.Encoder[models.UpdatePullRequestStatusInput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequestId" -> o.pullRequestId.asJson, "pullRequestStatus" -> o.pullRequestStatus.asJson)
  }
  final implicit val CommitEncoder: io.circe.Encoder[models.Commit] = io.circe.Encoder.instance { o => 
    Json.obj("author" -> o.author.asJson, "committer" -> o.committer.asJson, "commitId" -> o.commitId.asJson, "treeId" -> o.treeId.asJson, "additionalData" -> o.additionalData.asJson, "parents" -> o.parents.asJson, "message" -> o.message.asJson)
  }
  final implicit val AuthorDoesNotExistExceptionEncoder: io.circe.Encoder[models.AuthorDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryMetadataEncoder: io.circe.Encoder[models.RepositoryMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "defaultBranch" -> o.defaultBranch.asJson, "repositoryDescription" -> o.repositoryDescription.asJson, "lastModifiedDate" -> o.lastModifiedDate.asJson, "cloneUrlHttp" -> o.cloneUrlHttp.asJson, "repositoryId" -> o.repositoryId.asJson, "repositoryName" -> o.repositoryName.asJson, "cloneUrlSsh" -> o.cloneUrlSsh.asJson, "creationDate" -> o.creationDate.asJson, "accountId" -> o.accountId.asJson)
  }
  final implicit val PullRequestStatusRequiredExceptionEncoder: io.circe.Encoder[models.PullRequestStatusRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidBlobIdExceptionEncoder: io.circe.Encoder[models.InvalidBlobIdException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val MergePullRequestByFastForwardOutputEncoder: io.circe.Encoder[models.MergePullRequestByFastForwardOutput] = io.circe.Encoder.instance { o => 
    Json.obj("pullRequest" -> o.pullRequest.asJson)
  }
  final implicit val RepositoryTriggersListRequiredExceptionEncoder: io.circe.Encoder[models.RepositoryTriggersListRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BranchNameRequiredExceptionEncoder: io.circe.Encoder[models.BranchNameRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidReferenceNameExceptionEncoder: io.circe.Encoder[models.InvalidReferenceNameException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RepositoryNotAssociatedWithPullRequestExceptionEncoder: io.circe.Encoder[models.RepositoryNotAssociatedWithPullRequestException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentDoesNotExistExceptionEncoder: io.circe.Encoder[models.CommentDoesNotExistException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CommentIdRequiredExceptionEncoder: io.circe.Encoder[models.CommentIdRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ManualMergeRequiredExceptionEncoder: io.circe.Encoder[models.ManualMergeRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val TipOfSourceReferenceIsDifferentExceptionEncoder: io.circe.Encoder[models.TipOfSourceReferenceIsDifferentException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PutRepositoryTriggersInputEncoder: io.circe.Encoder[models.PutRepositoryTriggersInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson, "triggers" -> o.triggers.asJson)
  }
  final implicit val PostCommentForPullRequestOutputEncoder: io.circe.Encoder[models.PostCommentForPullRequestOutput] = io.circe.Encoder.instance { o => 
    Json.obj("beforeBlobId" -> o.beforeBlobId.asJson, "afterBlobId" -> o.afterBlobId.asJson, "pullRequestId" -> o.pullRequestId.asJson, "beforeCommitId" -> o.beforeCommitId.asJson, "afterCommitId" -> o.afterCommitId.asJson, "repositoryName" -> o.repositoryName.asJson, "comment" -> o.comment.asJson, "location" -> o.location.asJson)
  }
  final implicit val CommentContentRequiredExceptionEncoder: io.circe.Encoder[models.CommentContentRequiredException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val PullRequestEventEncoder: io.circe.Encoder[models.PullRequestEvent] = io.circe.Encoder.instance { o => 
    Json.obj("eventDate" -> o.eventDate.asJson, "pullRequestStatusChangedEventMetadata" -> o.pullRequestStatusChangedEventMetadata.asJson, "actorArn" -> o.actorArn.asJson, "pullRequestId" -> o.pullRequestId.asJson, "pullRequestSourceReferenceUpdatedEventMetadata" -> o.pullRequestSourceReferenceUpdatedEventMetadata.asJson, "pullRequestMergedStateChangedEventMetadata" -> o.pullRequestMergedStateChangedEventMetadata.asJson, "pullRequestEventType" -> o.pullRequestEventType.asJson)
  }
  final implicit val DefaultBranchCannotBeDeletedExceptionEncoder: io.circe.Encoder[models.DefaultBranchCannotBeDeletedException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetRepositoryTriggersInputEncoder: io.circe.Encoder[models.GetRepositoryTriggersInput] = io.circe.Encoder.instance { o => 
    Json.obj("repositoryName" -> o.repositoryName.asJson)
  }
  final implicit val GetCommentsForComparedCommitOutputEncoder: io.circe.Encoder[models.GetCommentsForComparedCommitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("commentsForComparedCommitData" -> o.commentsForComparedCommitData.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetRepositoryOutputDecoder: io.circe.Decoder[models.GetRepositoryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.RepositoryMetadata]]("repositoryMetadata").map(models.GetRepositoryOutput.apply _)
  }
  final implicit val ListBranchesInputDecoder: io.circe.Decoder[models.ListBranchesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListBranchesInput.apply _)
  }
  final implicit val InvalidRepositoryDescriptionExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryDescriptionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryDescriptionException)
  final implicit val RepositoryNameRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryNameRequiredException)
  final implicit val InvalidContinuationTokenExceptionDecoder: io.circe.Decoder[models.InvalidContinuationTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidContinuationTokenException)
  final implicit val CreateRepositoryOutputDecoder: io.circe.Decoder[models.CreateRepositoryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.RepositoryMetadata]]("repositoryMetadata").map(models.CreateRepositoryOutput.apply _)
  }
  final implicit val RepositoryNameExistsExceptionDecoder: io.circe.Decoder[models.RepositoryNameExistsException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryNameExistsException)
  final implicit val UpdatePullRequestTitleInputDecoder: io.circe.Decoder[models.UpdatePullRequestTitleInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("title")).mapN(models.UpdatePullRequestTitleInput.apply _)
  }
  final implicit val TargetDecoder: io.circe.Decoder[models.Target] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("sourceReference"), o.get[scala.Option[java.lang.String]]("destinationReference")).mapN(models.Target.apply _)
  }
  final implicit val ListBranchesOutputDecoder: io.circe.Decoder[models.ListBranchesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("branches"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListBranchesOutput.apply _)
  }
  final implicit val RepositoryTriggerNameRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryTriggerNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryTriggerNameRequiredException)
  final implicit val ActorDoesNotExistExceptionDecoder: io.circe.Decoder[models.ActorDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.ActorDoesNotExistException)
  final implicit val CommentDeletedExceptionDecoder: io.circe.Decoder[models.CommentDeletedException.type] = io.circe.Decoder.decodeUnit.as(models.CommentDeletedException)
  final implicit val RepositoryNameIdPairDecoder: io.circe.Decoder[models.RepositoryNameIdPair] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("repositoryId")).mapN(models.RepositoryNameIdPair.apply _)
  }
  final implicit val PullRequestStatusChangedEventMetadataDecoder: io.circe.Decoder[models.PullRequestStatusChangedEventMetadata] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("pullRequestStatus").map(models.PullRequestStatusChangedEventMetadata.apply _)
  }
  final implicit val InvalidCommentIdExceptionDecoder: io.circe.Decoder[models.InvalidCommentIdException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidCommentIdException)
  final implicit val ClientRequestTokenRequiredExceptionDecoder: io.circe.Decoder[models.ClientRequestTokenRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.ClientRequestTokenRequiredException)
  final implicit val GetCommitInputDecoder: io.circe.Decoder[models.GetCommitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("commitId")).mapN(models.GetCommitInput.apply _)
  }
  final implicit val CommitRequiredExceptionDecoder: io.circe.Decoder[models.CommitRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.CommitRequiredException)
  final implicit val BatchGetRepositoriesInputDecoder: io.circe.Decoder[models.BatchGetRepositoriesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("repositoryNames").map(models.BatchGetRepositoriesInput.apply _)
  }
  final implicit val FileTooLargeExceptionDecoder: io.circe.Decoder[models.FileTooLargeException.type] = io.circe.Decoder.decodeUnit.as(models.FileTooLargeException)
  final implicit val UserInfoDecoder: io.circe.Decoder[models.UserInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("email"), o.get[scala.Option[java.lang.String]]("date")).mapN(models.UserInfo.apply _)
  }
  final implicit val UpdatePullRequestDescriptionOutputDecoder: io.circe.Decoder[models.UpdatePullRequestDescriptionOutput] = io.circe.Decoder.instance { o => 
    o.get[models.PullRequest]("pullRequest").map(models.UpdatePullRequestDescriptionOutput.apply _)
  }
  final implicit val InvalidOrderExceptionDecoder: io.circe.Decoder[models.InvalidOrderException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidOrderException)
  final implicit val PostCommentForComparedCommitInputDecoder: io.circe.Decoder[models.PostCommentForComparedCommitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("content"), o.get[java.lang.String]("afterCommitId"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[models.Location]]("location")).mapN(models.PostCommentForComparedCommitInput.apply _)
  }
  final implicit val PullRequestTargetDecoder: io.circe.Decoder[models.PullRequestTarget] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("sourceReference"), o.get[scala.Option[java.lang.String]]("destinationReference"), o.get[scala.Option[java.lang.String]]("destinationCommit"), o.get[scala.Option[java.lang.String]]("sourceCommit"), o.get[scala.Option[models.MergeMetadata]]("mergeMetadata")).mapN(models.PullRequestTarget.apply _)
  }
  final implicit val InvalidRepositoryNameExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryNameException)
  final implicit val TestRepositoryTriggersInputDecoder: io.circe.Decoder[models.TestRepositoryTriggersInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[models.RepositoryTrigger]]("triggers")).mapN(models.TestRepositoryTriggersInput.apply _)
  }
  final implicit val IdempotencyParameterMismatchExceptionDecoder: io.circe.Decoder[models.IdempotencyParameterMismatchException.type] = io.circe.Decoder.decodeUnit.as(models.IdempotencyParameterMismatchException)
  final implicit val PathDoesNotExistExceptionDecoder: io.circe.Decoder[models.PathDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.PathDoesNotExistException)
  final implicit val PostCommentForPullRequestInputDecoder: io.circe.Decoder[models.PostCommentForPullRequestInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("content"), o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("beforeCommitId"), o.get[java.lang.String]("afterCommitId"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[models.Location]]("location")).mapN(models.PostCommentForPullRequestInput.apply _)
  }
  final implicit val EncryptionKeyDisabledExceptionDecoder: io.circe.Decoder[models.EncryptionKeyDisabledException.type] = io.circe.Decoder.decodeUnit.as(models.EncryptionKeyDisabledException)
  final implicit val InvalidPullRequestIdExceptionDecoder: io.circe.Decoder[models.InvalidPullRequestIdException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidPullRequestIdException)
  final implicit val RepositoryTriggerExecutionFailureDecoder: io.circe.Decoder[models.RepositoryTriggerExecutionFailure] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("trigger"), o.get[scala.Option[java.lang.String]]("failureMessage")).mapN(models.RepositoryTriggerExecutionFailure.apply _)
  }
  final implicit val InvalidCommitIdExceptionDecoder: io.circe.Decoder[models.InvalidCommitIdException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidCommitIdException)
  final implicit val InvalidDescriptionExceptionDecoder: io.circe.Decoder[models.InvalidDescriptionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDescriptionException)
  final implicit val GetCommentsForComparedCommitInputDecoder: io.circe.Decoder[models.GetCommentsForComparedCommitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("afterCommitId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[scala.Int]]("maxResults")).mapN(models.GetCommentsForComparedCommitInput.apply _)
  }
  final implicit val DeleteBranchInputDecoder: io.circe.Decoder[models.DeleteBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("branchName")).mapN(models.DeleteBranchInput.apply _)
  }
  final implicit val InvalidBranchNameExceptionDecoder: io.circe.Decoder[models.InvalidBranchNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidBranchNameException)
  final implicit val DeleteCommentContentInputDecoder: io.circe.Decoder[models.DeleteCommentContentInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("commentId").map(models.DeleteCommentContentInput.apply _)
  }
  final implicit val ReferenceDoesNotExistExceptionDecoder: io.circe.Decoder[models.ReferenceDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.ReferenceDoesNotExistException)
  final implicit val BranchDoesNotExistExceptionDecoder: io.circe.Decoder[models.BranchDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.BranchDoesNotExistException)
  final implicit val InvalidRepositoryTriggerBranchNameExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryTriggerBranchNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryTriggerBranchNameException)
  final implicit val CreateRepositoryInputDecoder: io.circe.Decoder[models.CreateRepositoryInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("repositoryDescription")).mapN(models.CreateRepositoryInput.apply _)
  }
  final implicit val TipsDivergenceExceededExceptionDecoder: io.circe.Decoder[models.TipsDivergenceExceededException.type] = io.circe.Decoder.decodeUnit.as(models.TipsDivergenceExceededException)
  final implicit val BlobMetadataDecoder: io.circe.Decoder[models.BlobMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("blobId"), o.get[scala.Option[java.lang.String]]("path"), o.get[scala.Option[java.lang.String]]("mode")).mapN(models.BlobMetadata.apply _)
  }
  final implicit val CreatePullRequestInputDecoder: io.circe.Decoder[models.CreatePullRequestInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("title"), o.get[scala.List[models.Target]]("targets"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("clientRequestToken")).mapN(models.CreatePullRequestInput.apply _)
  }
  final implicit val GetCommentInputDecoder: io.circe.Decoder[models.GetCommentInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("commentId").map(models.GetCommentInput.apply _)
  }
  final implicit val ListPullRequestsInputDecoder: io.circe.Decoder[models.ListPullRequestsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("authorArn"), o.get[scala.Option[java.lang.String]]("pullRequestStatus"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListPullRequestsInput.apply _)
  }
  final implicit val DeleteRepositoryInputDecoder: io.circe.Decoder[models.DeleteRepositoryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(models.DeleteRepositoryInput.apply _)
  }
  final implicit val PathRequiredExceptionDecoder: io.circe.Decoder[models.PathRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.PathRequiredException)
  final implicit val MaximumRepositoryNamesExceededExceptionDecoder: io.circe.Decoder[models.MaximumRepositoryNamesExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaximumRepositoryNamesExceededException)
  final implicit val InvalidCommitExceptionDecoder: io.circe.Decoder[models.InvalidCommitException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidCommitException)
  final implicit val PostCommentForComparedCommitOutputDecoder: io.circe.Decoder[models.PostCommentForComparedCommitOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[models.Comment]]("comment"), o.get[scala.Option[models.Location]]("location")).mapN(models.PostCommentForComparedCommitOutput.apply _)
  }
  final implicit val MaximumRepositoryTriggersExceededExceptionDecoder: io.circe.Decoder[models.MaximumRepositoryTriggersExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaximumRepositoryTriggersExceededException)
  final implicit val TestRepositoryTriggersOutputDecoder: io.circe.Decoder[models.TestRepositoryTriggersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("successfulExecutions"), o.get[scala.Option[scala.List[models.RepositoryTriggerExecutionFailure]]]("failedExecutions")).mapN(models.TestRepositoryTriggersOutput.apply _)
  }
  final implicit val EncryptionKeyNotFoundExceptionDecoder: io.circe.Decoder[models.EncryptionKeyNotFoundException.type] = io.circe.Decoder.decodeUnit.as(models.EncryptionKeyNotFoundException)
  final implicit val UpdateDefaultBranchInputDecoder: io.circe.Decoder[models.UpdateDefaultBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("defaultBranchName")).mapN(models.UpdateDefaultBranchInput.apply _)
  }
  final implicit val BranchNameExistsExceptionDecoder: io.circe.Decoder[models.BranchNameExistsException.type] = io.circe.Decoder.decodeUnit.as(models.BranchNameExistsException)
  final implicit val CommitDoesNotExistExceptionDecoder: io.circe.Decoder[models.CommitDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.CommitDoesNotExistException)
  final implicit val PullRequestSourceReferenceUpdatedEventMetadataDecoder: io.circe.Decoder[models.PullRequestSourceReferenceUpdatedEventMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId")).mapN(models.PullRequestSourceReferenceUpdatedEventMetadata.apply _)
  }
  final implicit val InvalidFileLocationExceptionDecoder: io.circe.Decoder[models.InvalidFileLocationException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidFileLocationException)
  final implicit val InvalidSourceCommitSpecifierExceptionDecoder: io.circe.Decoder[models.InvalidSourceCommitSpecifierException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSourceCommitSpecifierException)
  final implicit val UpdatePullRequestStatusOutputDecoder: io.circe.Decoder[models.UpdatePullRequestStatusOutput] = io.circe.Decoder.instance { o => 
    o.get[models.PullRequest]("pullRequest").map(models.UpdatePullRequestStatusOutput.apply _)
  }
  final implicit val GetCommentsForPullRequestInputDecoder: io.circe.Decoder[models.GetCommentsForPullRequestInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetCommentsForPullRequestInput.apply _)
  }
  final implicit val PullRequestDecoder: io.circe.Decoder[models.PullRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PullRequestTarget]]]("pullRequestTargets"), o.get[scala.Option[java.lang.String]]("authorArn"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[java.time.Instant]]("lastActivityDate"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.lang.String]]("title"), o.get[scala.Option[java.lang.String]]("pullRequestStatus"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.time.Instant]]("creationDate")).mapN(models.PullRequest.apply _)
  }
  final implicit val GetPullRequestInputDecoder: io.circe.Decoder[models.GetPullRequestInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("pullRequestId").map(models.GetPullRequestInput.apply _)
  }
  final implicit val MergePullRequestByFastForwardInputDecoder: io.circe.Decoder[models.MergePullRequestByFastForwardInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("sourceCommitId")).mapN(models.MergePullRequestByFastForwardInput.apply _)
  }
  final implicit val MaximumBranchesExceededExceptionDecoder: io.circe.Decoder[models.MaximumBranchesExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaximumBranchesExceededException)
  final implicit val RepositoryTriggerDestinationArnRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryTriggerDestinationArnRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryTriggerDestinationArnRequiredException)
  final implicit val PullRequestMergedStateChangedEventMetadataDecoder: io.circe.Decoder[models.PullRequestMergedStateChangedEventMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("destinationReference"), o.get[scala.Option[models.MergeMetadata]]("mergeMetadata")).mapN(models.PullRequestMergedStateChangedEventMetadata.apply _)
  }
  final implicit val ListRepositoriesInputDecoder: io.circe.Decoder[models.ListRepositoriesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("nextToken"), o.get[scala.Option[java.lang.String]]("sortBy"), o.get[scala.Option[java.lang.String]]("order")).mapN(models.ListRepositoriesInput.apply _)
  }
  final implicit val PostCommentReplyOutputDecoder: io.circe.Decoder[models.PostCommentReplyOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Comment]]("comment").map(models.PostCommentReplyOutput.apply _)
  }
  final implicit val InvalidMergeOptionExceptionDecoder: io.circe.Decoder[models.InvalidMergeOptionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidMergeOptionException)
  final implicit val CommitIdDoesNotExistExceptionDecoder: io.circe.Decoder[models.CommitIdDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.CommitIdDoesNotExistException)
  final implicit val GetPullRequestOutputDecoder: io.circe.Decoder[models.GetPullRequestOutput] = io.circe.Decoder.instance { o => 
    o.get[models.PullRequest]("pullRequest").map(models.GetPullRequestOutput.apply _)
  }
  final implicit val InvalidRepositoryTriggerNameExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryTriggerNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryTriggerNameException)
  final implicit val GetDifferencesOutputDecoder: io.circe.Decoder[models.GetDifferencesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Difference]]]("differences"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetDifferencesOutput.apply _)
  }
  final implicit val GetCommentsForPullRequestOutputDecoder: io.circe.Decoder[models.GetCommentsForPullRequestOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.CommentsForPullRequest]]]("commentsForPullRequestData"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetCommentsForPullRequestOutput.apply _)
  }
  final implicit val CreatePullRequestOutputDecoder: io.circe.Decoder[models.CreatePullRequestOutput] = io.circe.Decoder.instance { o => 
    o.get[models.PullRequest]("pullRequest").map(models.CreatePullRequestOutput.apply _)
  }
  final implicit val EncryptionKeyAccessDeniedExceptionDecoder: io.circe.Decoder[models.EncryptionKeyAccessDeniedException.type] = io.circe.Decoder.decodeUnit.as(models.EncryptionKeyAccessDeniedException)
  final implicit val InvalidPathExceptionDecoder: io.circe.Decoder[models.InvalidPathException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidPathException)
  final implicit val GetBlobOutputDecoder: io.circe.Decoder[models.GetBlobOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Array[scala.Byte]]("content").map(models.GetBlobOutput.apply _)
  }
  final implicit val TitleRequiredExceptionDecoder: io.circe.Decoder[models.TitleRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.TitleRequiredException)
  final implicit val UpdateRepositoryNameInputDecoder: io.circe.Decoder[models.UpdateRepositoryNameInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("oldName"), o.get[java.lang.String]("newName")).mapN(models.UpdateRepositoryNameInput.apply _)
  }
  final implicit val ListPullRequestsOutputDecoder: io.circe.Decoder[models.ListPullRequestsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("pullRequestIds"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListPullRequestsOutput.apply _)
  }
  final implicit val DescribePullRequestEventsOutputDecoder: io.circe.Decoder[models.DescribePullRequestEventsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.PullRequestEvent]]("pullRequestEvents"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribePullRequestEventsOutput.apply _)
  }
  final implicit val MaximumOpenPullRequestsExceededExceptionDecoder: io.circe.Decoder[models.MaximumOpenPullRequestsExceededException.type] = io.circe.Decoder.decodeUnit.as(models.MaximumOpenPullRequestsExceededException)
  final implicit val DifferenceDecoder: io.circe.Decoder[models.Difference] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.BlobMetadata]]("beforeBlob"), o.get[scala.Option[models.BlobMetadata]]("afterBlob"), o.get[scala.Option[java.lang.String]]("changeType")).mapN(models.Difference.apply _)
  }
  final implicit val GetCommitOutputDecoder: io.circe.Decoder[models.GetCommitOutput] = io.circe.Decoder.instance { o => 
    o.get[models.Commit]("commit").map(models.GetCommitOutput.apply _)
  }
  final implicit val RepositoryTriggerDecoder: io.circe.Decoder[models.RepositoryTrigger] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("destinationArn"), o.get[java.lang.String]("name"), o.get[scala.List[java.lang.String]]("events"), o.get[scala.Option[scala.List[java.lang.String]]]("branches"), o.get[scala.Option[java.lang.String]]("customData")).mapN(models.RepositoryTrigger.apply _)
  }
  final implicit val InvalidRepositoryTriggerRegionExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryTriggerRegionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryTriggerRegionException)
  final implicit val MergeMetadataDecoder: io.circe.Decoder[models.MergeMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("isMerged"), o.get[scala.Option[java.lang.String]]("mergedBy")).mapN(models.MergeMetadata.apply _)
  }
  final implicit val EncryptionIntegrityChecksFailedExceptionDecoder: io.circe.Decoder[models.EncryptionIntegrityChecksFailedException.type] = io.circe.Decoder.decodeUnit.as(models.EncryptionIntegrityChecksFailedException)
  final implicit val RepositoryTriggerBranchNameListRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryTriggerBranchNameListRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryTriggerBranchNameListRequiredException)
  final implicit val ReferenceNameRequiredExceptionDecoder: io.circe.Decoder[models.ReferenceNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.ReferenceNameRequiredException)
  final implicit val DeleteRepositoryOutputDecoder: io.circe.Decoder[models.DeleteRepositoryOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("repositoryId").map(models.DeleteRepositoryOutput.apply _)
  }
  final implicit val BranchInfoDecoder: io.circe.Decoder[models.BranchInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("branchName"), o.get[scala.Option[java.lang.String]]("commitId")).mapN(models.BranchInfo.apply _)
  }
  final implicit val PullRequestIdRequiredExceptionDecoder: io.circe.Decoder[models.PullRequestIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.PullRequestIdRequiredException)
  final implicit val CreateBranchInputDecoder: io.circe.Decoder[models.CreateBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("branchName"), o.get[java.lang.String]("commitId")).mapN(models.CreateBranchInput.apply _)
  }
  final implicit val CommentsForPullRequestDecoder: io.circe.Decoder[models.CommentsForPullRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[models.Location]]("location"), o.get[scala.Option[scala.List[models.Comment]]]("comments")).mapN(models.CommentsForPullRequest.apply _)
  }
  final implicit val GetRepositoryTriggersOutputDecoder: io.circe.Decoder[models.GetRepositoryTriggersOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("configurationId"), o.get[scala.Option[scala.List[models.RepositoryTrigger]]]("triggers")).mapN(models.GetRepositoryTriggersOutput.apply _)
  }
  final implicit val DeleteCommentContentOutputDecoder: io.circe.Decoder[models.DeleteCommentContentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Comment]]("comment").map(models.DeleteCommentContentOutput.apply _)
  }
  final implicit val InvalidTitleExceptionDecoder: io.circe.Decoder[models.InvalidTitleException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTitleException)
  final implicit val CommentNotCreatedByCallerExceptionDecoder: io.circe.Decoder[models.CommentNotCreatedByCallerException.type] = io.circe.Decoder.decodeUnit.as(models.CommentNotCreatedByCallerException)
  final implicit val SourceAndDestinationAreSameExceptionDecoder: io.circe.Decoder[models.SourceAndDestinationAreSameException.type] = io.circe.Decoder.decodeUnit.as(models.SourceAndDestinationAreSameException)
  final implicit val GetMergeConflictsInputDecoder: io.circe.Decoder[models.GetMergeConflictsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("destinationCommitSpecifier"), o.get[java.lang.String]("sourceCommitSpecifier"), o.get[java.lang.String]("mergeOption")).mapN(models.GetMergeConflictsInput.apply _)
  }
  final implicit val CommitIdRequiredExceptionDecoder: io.circe.Decoder[models.CommitIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.CommitIdRequiredException)
  final implicit val RepositoryTriggerEventsListRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryTriggerEventsListRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryTriggerEventsListRequiredException)
  final implicit val CommentsForComparedCommitDecoder: io.circe.Decoder[models.CommentsForComparedCommit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[models.Location]]("location"), o.get[scala.Option[scala.List[models.Comment]]]("comments")).mapN(models.CommentsForComparedCommit.apply _)
  }
  final implicit val PutRepositoryTriggersOutputDecoder: io.circe.Decoder[models.PutRepositoryTriggersOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("configurationId").map(models.PutRepositoryTriggersOutput.apply _)
  }
  final implicit val InvalidRepositoryTriggerCustomDataExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryTriggerCustomDataException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryTriggerCustomDataException)
  final implicit val GetBranchInputDecoder: io.circe.Decoder[models.GetBranchInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("branchName")).mapN(models.GetBranchInput.apply _)
  }
  final implicit val ReferenceTypeNotSupportedExceptionDecoder: io.circe.Decoder[models.ReferenceTypeNotSupportedException.type] = io.circe.Decoder.decodeUnit.as(models.ReferenceTypeNotSupportedException)
  final implicit val InvalidRepositoryTriggerDestinationArnExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryTriggerDestinationArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryTriggerDestinationArnException)
  final implicit val InvalidRelativeFileVersionEnumExceptionDecoder: io.circe.Decoder[models.InvalidRelativeFileVersionEnumException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRelativeFileVersionEnumException)
  final implicit val InvalidTargetExceptionDecoder: io.circe.Decoder[models.InvalidTargetException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTargetException)
  final implicit val InvalidClientRequestTokenExceptionDecoder: io.circe.Decoder[models.InvalidClientRequestTokenException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidClientRequestTokenException)
  final implicit val PullRequestAlreadyClosedExceptionDecoder: io.circe.Decoder[models.PullRequestAlreadyClosedException.type] = io.circe.Decoder.decodeUnit.as(models.PullRequestAlreadyClosedException)
  final implicit val RepositoryLimitExceededExceptionDecoder: io.circe.Decoder[models.RepositoryLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryLimitExceededException)
  final implicit val UpdatePullRequestDescriptionInputDecoder: io.circe.Decoder[models.UpdatePullRequestDescriptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("description")).mapN(models.UpdatePullRequestDescriptionInput.apply _)
  }
  final implicit val GetDifferencesInputDecoder: io.circe.Decoder[models.GetDifferencesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("afterCommitSpecifier"), o.get[java.lang.String]("repositoryName"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("beforePath"), o.get[scala.Option[java.lang.String]]("afterPath"), o.get[scala.Option[java.lang.String]]("beforeCommitSpecifier"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.GetDifferencesInput.apply _)
  }
  final implicit val ListRepositoriesOutputDecoder: io.circe.Decoder[models.ListRepositoriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.RepositoryNameIdPair]]]("repositories"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.ListRepositoriesOutput.apply _)
  }
  final implicit val MultipleRepositoriesInPullRequestExceptionDecoder: io.circe.Decoder[models.MultipleRepositoriesInPullRequestException.type] = io.circe.Decoder.decodeUnit.as(models.MultipleRepositoriesInPullRequestException)
  final implicit val InvalidRepositoryTriggerEventsExceptionDecoder: io.circe.Decoder[models.InvalidRepositoryTriggerEventsException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRepositoryTriggerEventsException)
  final implicit val GetCommentOutputDecoder: io.circe.Decoder[models.GetCommentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Comment]]("comment").map(models.GetCommentOutput.apply _)
  }
  final implicit val RepositoryDoesNotExistExceptionDecoder: io.circe.Decoder[models.RepositoryDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryDoesNotExistException)
  final implicit val InvalidFilePositionExceptionDecoder: io.circe.Decoder[models.InvalidFilePositionException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidFilePositionException)
  final implicit val RepositoryNamesRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryNamesRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryNamesRequiredException)
  final implicit val InvalidActorArnExceptionDecoder: io.circe.Decoder[models.InvalidActorArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidActorArnException)
  final implicit val GetMergeConflictsOutputDecoder: io.circe.Decoder[models.GetMergeConflictsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("mergeable"), o.get[java.lang.String]("destinationCommitId"), o.get[java.lang.String]("sourceCommitId")).mapN(models.GetMergeConflictsOutput.apply _)
  }
  final implicit val InvalidMaxResultsExceptionDecoder: io.circe.Decoder[models.InvalidMaxResultsException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidMaxResultsException)
  final implicit val BatchGetRepositoriesOutputDecoder: io.circe.Decoder[models.BatchGetRepositoriesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.RepositoryMetadata]]]("repositories"), o.get[scala.Option[scala.List[java.lang.String]]]("repositoriesNotFound")).mapN(models.BatchGetRepositoriesOutput.apply _)
  }
  final implicit val UpdateCommentOutputDecoder: io.circe.Decoder[models.UpdateCommentOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Comment]]("comment").map(models.UpdateCommentOutput.apply _)
  }
  final implicit val TargetRequiredExceptionDecoder: io.circe.Decoder[models.TargetRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.TargetRequiredException)
  final implicit val CommentContentSizeLimitExceededExceptionDecoder: io.circe.Decoder[models.CommentContentSizeLimitExceededException.type] = io.circe.Decoder.decodeUnit.as(models.CommentContentSizeLimitExceededException)
  final implicit val InvalidPullRequestStatusExceptionDecoder: io.circe.Decoder[models.InvalidPullRequestStatusException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidPullRequestStatusException)
  final implicit val DescribePullRequestEventsInputDecoder: io.circe.Decoder[models.DescribePullRequestEventsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[scala.Option[scala.Int]]("maxResults"), o.get[scala.Option[java.lang.String]]("actorArn"), o.get[scala.Option[java.lang.String]]("pullRequestEventType"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.DescribePullRequestEventsInput.apply _)
  }
  final implicit val InvalidDestinationCommitSpecifierExceptionDecoder: io.circe.Decoder[models.InvalidDestinationCommitSpecifierException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidDestinationCommitSpecifierException)
  final implicit val GetRepositoryInputDecoder: io.circe.Decoder[models.GetRepositoryInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(models.GetRepositoryInput.apply _)
  }
  final implicit val MergeOptionRequiredExceptionDecoder: io.circe.Decoder[models.MergeOptionRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.MergeOptionRequiredException)
  final implicit val UpdatePullRequestTitleOutputDecoder: io.circe.Decoder[models.UpdatePullRequestTitleOutput] = io.circe.Decoder.instance { o => 
    o.get[models.PullRequest]("pullRequest").map(models.UpdatePullRequestTitleOutput.apply _)
  }
  final implicit val BlobIdDoesNotExistExceptionDecoder: io.circe.Decoder[models.BlobIdDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.BlobIdDoesNotExistException)
  final implicit val TargetsRequiredExceptionDecoder: io.circe.Decoder[models.TargetsRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.TargetsRequiredException)
  final implicit val DeleteBranchOutputDecoder: io.circe.Decoder[models.DeleteBranchOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.BranchInfo]]("deletedBranch").map(models.DeleteBranchOutput.apply _)
  }
  final implicit val InvalidPullRequestStatusUpdateExceptionDecoder: io.circe.Decoder[models.InvalidPullRequestStatusUpdateException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidPullRequestStatusUpdateException)
  final implicit val UpdateCommentInputDecoder: io.circe.Decoder[models.UpdateCommentInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("commentId"), o.get[java.lang.String]("content")).mapN(models.UpdateCommentInput.apply _)
  }
  final implicit val BlobIdRequiredExceptionDecoder: io.circe.Decoder[models.BlobIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.BlobIdRequiredException)
  final implicit val InvalidSortByExceptionDecoder: io.circe.Decoder[models.InvalidSortByException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidSortByException)
  final implicit val GetBranchOutputDecoder: io.circe.Decoder[models.GetBranchOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.BranchInfo]]("branch").map(models.GetBranchOutput.apply _)
  }
  final implicit val InvalidAuthorArnExceptionDecoder: io.circe.Decoder[models.InvalidAuthorArnException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidAuthorArnException)
  final implicit val CommentDecoder: io.circe.Decoder[models.Comment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("content"), o.get[scala.Option[scala.Boolean]]("deleted"), o.get[scala.Option[java.lang.String]]("authorArn"), o.get[scala.Option[java.lang.String]]("commentId"), o.get[scala.Option[java.lang.String]]("inReplyTo"), o.get[scala.Option[java.time.Instant]]("lastModifiedDate"), o.get[scala.Option[java.lang.String]]("clientRequestToken"), o.get[scala.Option[java.time.Instant]]("creationDate")).mapN(models.Comment.apply _)
  }
  final implicit val InvalidPullRequestEventTypeExceptionDecoder: io.circe.Decoder[models.InvalidPullRequestEventTypeException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidPullRequestEventTypeException)
  final implicit val GetBlobInputDecoder: io.circe.Decoder[models.GetBlobInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[java.lang.String]("blobId")).mapN(models.GetBlobInput.apply _)
  }
  final implicit val UpdateRepositoryDescriptionInputDecoder: io.circe.Decoder[models.UpdateRepositoryDescriptionInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.Option[java.lang.String]]("repositoryDescription")).mapN(models.UpdateRepositoryDescriptionInput.apply _)
  }
  final implicit val EncryptionKeyUnavailableExceptionDecoder: io.circe.Decoder[models.EncryptionKeyUnavailableException.type] = io.circe.Decoder.decodeUnit.as(models.EncryptionKeyUnavailableException)
  final implicit val InvalidTargetsExceptionDecoder: io.circe.Decoder[models.InvalidTargetsException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidTargetsException)
  final implicit val PullRequestDoesNotExistExceptionDecoder: io.circe.Decoder[models.PullRequestDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.PullRequestDoesNotExistException)
  final implicit val LocationDecoder: io.circe.Decoder[models.Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("filePath"), o.get[scala.Option[scala.Long]]("filePosition"), o.get[scala.Option[java.lang.String]]("relativeFileVersion")).mapN(models.Location.apply _)
  }
  final implicit val BeforeCommitIdAndAfterCommitIdAreSameExceptionDecoder: io.circe.Decoder[models.BeforeCommitIdAndAfterCommitIdAreSameException.type] = io.circe.Decoder.decodeUnit.as(models.BeforeCommitIdAndAfterCommitIdAreSameException)
  final implicit val PostCommentReplyInputDecoder: io.circe.Decoder[models.PostCommentReplyInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("inReplyTo"), o.get[java.lang.String]("content"), o.get[scala.Option[java.lang.String]]("clientRequestToken")).mapN(models.PostCommentReplyInput.apply _)
  }
  final implicit val UpdatePullRequestStatusInputDecoder: io.circe.Decoder[models.UpdatePullRequestStatusInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("pullRequestId"), o.get[java.lang.String]("pullRequestStatus")).mapN(models.UpdatePullRequestStatusInput.apply _)
  }
  final implicit val CommitDecoder: io.circe.Decoder[models.Commit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.UserInfo]]("author"), o.get[scala.Option[models.UserInfo]]("committer"), o.get[scala.Option[java.lang.String]]("commitId"), o.get[scala.Option[java.lang.String]]("treeId"), o.get[scala.Option[java.lang.String]]("additionalData"), o.get[scala.Option[scala.List[java.lang.String]]]("parents"), o.get[scala.Option[java.lang.String]]("message")).mapN(models.Commit.apply _)
  }
  final implicit val AuthorDoesNotExistExceptionDecoder: io.circe.Decoder[models.AuthorDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.AuthorDoesNotExistException)
  final implicit val RepositoryMetadataDecoder: io.circe.Decoder[models.RepositoryMetadata] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("defaultBranch"), o.get[scala.Option[java.lang.String]]("repositoryDescription"), o.get[scala.Option[java.time.Instant]]("lastModifiedDate"), o.get[scala.Option[java.lang.String]]("cloneUrlHttp"), o.get[scala.Option[java.lang.String]]("repositoryId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[java.lang.String]]("cloneUrlSsh"), o.get[scala.Option[java.time.Instant]]("creationDate"), o.get[scala.Option[java.lang.String]]("accountId")).mapN(models.RepositoryMetadata.apply _)
  }
  final implicit val PullRequestStatusRequiredExceptionDecoder: io.circe.Decoder[models.PullRequestStatusRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.PullRequestStatusRequiredException)
  final implicit val InvalidBlobIdExceptionDecoder: io.circe.Decoder[models.InvalidBlobIdException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidBlobIdException)
  final implicit val MergePullRequestByFastForwardOutputDecoder: io.circe.Decoder[models.MergePullRequestByFastForwardOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.PullRequest]]("pullRequest").map(models.MergePullRequestByFastForwardOutput.apply _)
  }
  final implicit val RepositoryTriggersListRequiredExceptionDecoder: io.circe.Decoder[models.RepositoryTriggersListRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryTriggersListRequiredException)
  final implicit val BranchNameRequiredExceptionDecoder: io.circe.Decoder[models.BranchNameRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.BranchNameRequiredException)
  final implicit val InvalidReferenceNameExceptionDecoder: io.circe.Decoder[models.InvalidReferenceNameException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidReferenceNameException)
  final implicit val RepositoryNotAssociatedWithPullRequestExceptionDecoder: io.circe.Decoder[models.RepositoryNotAssociatedWithPullRequestException.type] = io.circe.Decoder.decodeUnit.as(models.RepositoryNotAssociatedWithPullRequestException)
  final implicit val CommentDoesNotExistExceptionDecoder: io.circe.Decoder[models.CommentDoesNotExistException.type] = io.circe.Decoder.decodeUnit.as(models.CommentDoesNotExistException)
  final implicit val CommentIdRequiredExceptionDecoder: io.circe.Decoder[models.CommentIdRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.CommentIdRequiredException)
  final implicit val ManualMergeRequiredExceptionDecoder: io.circe.Decoder[models.ManualMergeRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.ManualMergeRequiredException)
  final implicit val TipOfSourceReferenceIsDifferentExceptionDecoder: io.circe.Decoder[models.TipOfSourceReferenceIsDifferentException.type] = io.circe.Decoder.decodeUnit.as(models.TipOfSourceReferenceIsDifferentException)
  final implicit val PutRepositoryTriggersInputDecoder: io.circe.Decoder[models.PutRepositoryTriggersInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("repositoryName"), o.get[scala.List[models.RepositoryTrigger]]("triggers")).mapN(models.PutRepositoryTriggersInput.apply _)
  }
  final implicit val PostCommentForPullRequestOutputDecoder: io.circe.Decoder[models.PostCommentForPullRequestOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("beforeBlobId"), o.get[scala.Option[java.lang.String]]("afterBlobId"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[java.lang.String]]("beforeCommitId"), o.get[scala.Option[java.lang.String]]("afterCommitId"), o.get[scala.Option[java.lang.String]]("repositoryName"), o.get[scala.Option[models.Comment]]("comment"), o.get[scala.Option[models.Location]]("location")).mapN(models.PostCommentForPullRequestOutput.apply _)
  }
  final implicit val CommentContentRequiredExceptionDecoder: io.circe.Decoder[models.CommentContentRequiredException.type] = io.circe.Decoder.decodeUnit.as(models.CommentContentRequiredException)
  final implicit val PullRequestEventDecoder: io.circe.Decoder[models.PullRequestEvent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("eventDate"), o.get[scala.Option[models.PullRequestStatusChangedEventMetadata]]("pullRequestStatusChangedEventMetadata"), o.get[scala.Option[java.lang.String]]("actorArn"), o.get[scala.Option[java.lang.String]]("pullRequestId"), o.get[scala.Option[models.PullRequestSourceReferenceUpdatedEventMetadata]]("pullRequestSourceReferenceUpdatedEventMetadata"), o.get[scala.Option[models.PullRequestMergedStateChangedEventMetadata]]("pullRequestMergedStateChangedEventMetadata"), o.get[scala.Option[java.lang.String]]("pullRequestEventType")).mapN(models.PullRequestEvent.apply _)
  }
  final implicit val DefaultBranchCannotBeDeletedExceptionDecoder: io.circe.Decoder[models.DefaultBranchCannotBeDeletedException.type] = io.circe.Decoder.decodeUnit.as(models.DefaultBranchCannotBeDeletedException)
  final implicit val GetRepositoryTriggersInputDecoder: io.circe.Decoder[models.GetRepositoryTriggersInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("repositoryName").map(models.GetRepositoryTriggersInput.apply _)
  }
  final implicit val GetCommentsForComparedCommitOutputDecoder: io.circe.Decoder[models.GetCommentsForComparedCommitOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.CommentsForComparedCommit]]]("commentsForComparedCommitData"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(models.GetCommentsForComparedCommitOutput.apply _)
  }
}