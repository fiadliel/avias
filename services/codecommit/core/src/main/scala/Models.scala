package avias.codecommit.models
final case class GetRepositoryOutput(repositoryMetadata: scala.Option[avias.codecommit.models.RepositoryMetadata] = scala.None)
final case class ListBranchesInput(repositoryName: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidRepositoryDescriptionException
case object RepositoryNameRequiredException
case object InvalidContinuationTokenException
final case class CreateRepositoryOutput(repositoryMetadata: scala.Option[avias.codecommit.models.RepositoryMetadata] = scala.None)
case object RepositoryNameExistsException
final case class UpdatePullRequestTitleInput(pullRequestId: java.lang.String, title: java.lang.String)
final case class Target(repositoryName: java.lang.String, sourceReference: java.lang.String, destinationReference: scala.Option[java.lang.String] = scala.None)
final case class ListBranchesOutput(branches: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object RepositoryTriggerNameRequiredException
case object ActorDoesNotExistException
case object CommentDeletedException
final case class RepositoryNameIdPair(repositoryName: scala.Option[java.lang.String] = scala.None, repositoryId: scala.Option[java.lang.String] = scala.None)
final case class PullRequestStatusChangedEventMetadata(pullRequestStatus: scala.Option[java.lang.String] = scala.None)
case object InvalidCommentIdException
case object ClientRequestTokenRequiredException
final case class GetCommitInput(repositoryName: java.lang.String, commitId: java.lang.String)
case object CommitRequiredException
final case class BatchGetRepositoriesInput(repositoryNames: scala.List[java.lang.String])
case object FileTooLargeException
final case class UserInfo(name: scala.Option[java.lang.String] = scala.None, email: scala.Option[java.lang.String] = scala.None, date: scala.Option[java.lang.String] = scala.None)
final case class UpdatePullRequestDescriptionOutput(pullRequest: avias.codecommit.models.PullRequest)
case object InvalidOrderException
final case class PostCommentForComparedCommitInput(content: java.lang.String, afterCommitId: java.lang.String, repositoryName: java.lang.String, clientRequestToken: scala.Option[java.lang.String] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, location: scala.Option[avias.codecommit.models.Location] = scala.None)
final case class PullRequestTarget(repositoryName: scala.Option[java.lang.String] = scala.None, sourceReference: scala.Option[java.lang.String] = scala.None, destinationReference: scala.Option[java.lang.String] = scala.None, destinationCommit: scala.Option[java.lang.String] = scala.None, sourceCommit: scala.Option[java.lang.String] = scala.None, mergeMetadata: scala.Option[avias.codecommit.models.MergeMetadata] = scala.None)
case object InvalidRepositoryNameException
final case class TestRepositoryTriggersInput(repositoryName: java.lang.String, triggers: scala.List[avias.codecommit.models.RepositoryTrigger])
case object IdempotencyParameterMismatchException
case object PathDoesNotExistException
final case class PostCommentForPullRequestInput(content: java.lang.String, pullRequestId: java.lang.String, beforeCommitId: java.lang.String, afterCommitId: java.lang.String, repositoryName: java.lang.String, clientRequestToken: scala.Option[java.lang.String] = scala.None, location: scala.Option[avias.codecommit.models.Location] = scala.None)
case object EncryptionKeyDisabledException
case object InvalidPullRequestIdException
final case class RepositoryTriggerExecutionFailure(trigger: scala.Option[java.lang.String] = scala.None, failureMessage: scala.Option[java.lang.String] = scala.None)
case object InvalidCommitIdException
case object InvalidDescriptionException
final case class GetCommentsForComparedCommitInput(repositoryName: java.lang.String, afterCommitId: java.lang.String, beforeCommitId: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DeleteBranchInput(repositoryName: java.lang.String, branchName: java.lang.String)
case object InvalidBranchNameException
final case class DeleteCommentContentInput(commentId: java.lang.String)
case object ReferenceDoesNotExistException
case object BranchDoesNotExistException
case object InvalidRepositoryTriggerBranchNameException
final case class CreateRepositoryInput(repositoryName: java.lang.String, repositoryDescription: scala.Option[java.lang.String] = scala.None)
case object TipsDivergenceExceededException
final case class BlobMetadata(blobId: scala.Option[java.lang.String] = scala.None, path: scala.Option[java.lang.String] = scala.None, mode: scala.Option[java.lang.String] = scala.None)
final case class CreatePullRequestInput(title: java.lang.String, targets: scala.List[avias.codecommit.models.Target], description: scala.Option[java.lang.String] = scala.None, clientRequestToken: scala.Option[java.lang.String] = scala.None)
final case class GetCommentInput(commentId: java.lang.String)
final case class ListPullRequestsInput(repositoryName: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, authorArn: scala.Option[java.lang.String] = scala.None, pullRequestStatus: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteRepositoryInput(repositoryName: java.lang.String)
case object PathRequiredException
case object MaximumRepositoryNamesExceededException
case object InvalidCommitException
final case class PostCommentForComparedCommitOutput(beforeBlobId: scala.Option[java.lang.String] = scala.None, afterBlobId: scala.Option[java.lang.String] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, afterCommitId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, comment: scala.Option[avias.codecommit.models.Comment] = scala.None, location: scala.Option[avias.codecommit.models.Location] = scala.None)
case object MaximumRepositoryTriggersExceededException
final case class TestRepositoryTriggersOutput(successfulExecutions: scala.Option[scala.List[java.lang.String]] = scala.None, failedExecutions: scala.Option[scala.List[avias.codecommit.models.RepositoryTriggerExecutionFailure]] = scala.None)
case object EncryptionKeyNotFoundException
final case class UpdateDefaultBranchInput(repositoryName: java.lang.String, defaultBranchName: java.lang.String)
case object BranchNameExistsException
case object CommitDoesNotExistException
final case class PullRequestSourceReferenceUpdatedEventMetadata(repositoryName: scala.Option[java.lang.String] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, afterCommitId: scala.Option[java.lang.String] = scala.None)
case object InvalidFileLocationException
case object InvalidSourceCommitSpecifierException
final case class UpdatePullRequestStatusOutput(pullRequest: avias.codecommit.models.PullRequest)
final case class GetCommentsForPullRequestInput(pullRequestId: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, afterCommitId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class PullRequest(pullRequestTargets: scala.Option[scala.List[avias.codecommit.models.PullRequestTarget]] = scala.None, authorArn: scala.Option[java.lang.String] = scala.None, pullRequestId: scala.Option[java.lang.String] = scala.None, lastActivityDate: scala.Option[java.time.Instant] = scala.None, clientRequestToken: scala.Option[java.lang.String] = scala.None, title: scala.Option[java.lang.String] = scala.None, pullRequestStatus: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, creationDate: scala.Option[java.time.Instant] = scala.None)
final case class GetPullRequestInput(pullRequestId: java.lang.String)
final case class MergePullRequestByFastForwardInput(pullRequestId: java.lang.String, repositoryName: java.lang.String, sourceCommitId: scala.Option[java.lang.String] = scala.None)
case object MaximumBranchesExceededException
case object RepositoryTriggerDestinationArnRequiredException
final case class PullRequestMergedStateChangedEventMetadata(repositoryName: scala.Option[java.lang.String] = scala.None, destinationReference: scala.Option[java.lang.String] = scala.None, mergeMetadata: scala.Option[avias.codecommit.models.MergeMetadata] = scala.None)
final case class ListRepositoriesInput(nextToken: scala.Option[java.lang.String] = scala.None, sortBy: scala.Option[java.lang.String] = scala.None, order: scala.Option[java.lang.String] = scala.None)
final case class PostCommentReplyOutput(comment: scala.Option[avias.codecommit.models.Comment] = scala.None)
case object InvalidMergeOptionException
case object CommitIdDoesNotExistException
final case class GetPullRequestOutput(pullRequest: avias.codecommit.models.PullRequest)
case object InvalidRepositoryTriggerNameException
final case class GetDifferencesOutput(differences: scala.Option[scala.List[avias.codecommit.models.Difference]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class GetCommentsForPullRequestOutput(commentsForPullRequestData: scala.Option[scala.List[avias.codecommit.models.CommentsForPullRequest]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreatePullRequestOutput(pullRequest: avias.codecommit.models.PullRequest)
case object EncryptionKeyAccessDeniedException
case object InvalidPathException
final case class GetBlobOutput(content: scala.Array[scala.Byte])
case object TitleRequiredException
final case class UpdateRepositoryNameInput(oldName: java.lang.String, newName: java.lang.String)
final case class ListPullRequestsOutput(pullRequestIds: scala.List[java.lang.String], nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribePullRequestEventsOutput(pullRequestEvents: scala.List[avias.codecommit.models.PullRequestEvent], nextToken: scala.Option[java.lang.String] = scala.None)
case object MaximumOpenPullRequestsExceededException
final case class Difference(beforeBlob: scala.Option[avias.codecommit.models.BlobMetadata] = scala.None, afterBlob: scala.Option[avias.codecommit.models.BlobMetadata] = scala.None, changeType: scala.Option[java.lang.String] = scala.None)
final case class GetCommitOutput(commit: avias.codecommit.models.Commit)
final case class RepositoryTrigger(destinationArn: java.lang.String, name: java.lang.String, events: scala.List[java.lang.String], branches: scala.Option[scala.List[java.lang.String]] = scala.None, customData: scala.Option[java.lang.String] = scala.None)
case object InvalidRepositoryTriggerRegionException
final case class MergeMetadata(isMerged: scala.Option[scala.Boolean] = scala.None, mergedBy: scala.Option[java.lang.String] = scala.None)
case object EncryptionIntegrityChecksFailedException
case object RepositoryTriggerBranchNameListRequiredException
case object ReferenceNameRequiredException
final case class DeleteRepositoryOutput(repositoryId: scala.Option[java.lang.String] = scala.None)
final case class BranchInfo(branchName: scala.Option[java.lang.String] = scala.None, commitId: scala.Option[java.lang.String] = scala.None)
case object PullRequestIdRequiredException
final case class CreateBranchInput(repositoryName: java.lang.String, branchName: java.lang.String, commitId: java.lang.String)
final case class CommentsForPullRequest(beforeBlobId: scala.Option[java.lang.String] = scala.None, afterBlobId: scala.Option[java.lang.String] = scala.None, pullRequestId: scala.Option[java.lang.String] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, afterCommitId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, location: scala.Option[avias.codecommit.models.Location] = scala.None, comments: scala.Option[scala.List[avias.codecommit.models.Comment]] = scala.None)
final case class GetRepositoryTriggersOutput(configurationId: scala.Option[java.lang.String] = scala.None, triggers: scala.Option[scala.List[avias.codecommit.models.RepositoryTrigger]] = scala.None)
final case class DeleteCommentContentOutput(comment: scala.Option[avias.codecommit.models.Comment] = scala.None)
case object InvalidTitleException
case object CommentNotCreatedByCallerException
case object SourceAndDestinationAreSameException
final case class GetMergeConflictsInput(repositoryName: java.lang.String, destinationCommitSpecifier: java.lang.String, sourceCommitSpecifier: java.lang.String, mergeOption: java.lang.String)
case object CommitIdRequiredException
case object RepositoryTriggerEventsListRequiredException
final case class CommentsForComparedCommit(beforeBlobId: scala.Option[java.lang.String] = scala.None, afterBlobId: scala.Option[java.lang.String] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, afterCommitId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, location: scala.Option[avias.codecommit.models.Location] = scala.None, comments: scala.Option[scala.List[avias.codecommit.models.Comment]] = scala.None)
final case class PutRepositoryTriggersOutput(configurationId: scala.Option[java.lang.String] = scala.None)
case object InvalidRepositoryTriggerCustomDataException
final case class GetBranchInput(repositoryName: scala.Option[java.lang.String] = scala.None, branchName: scala.Option[java.lang.String] = scala.None)
case object ReferenceTypeNotSupportedException
case object InvalidRepositoryTriggerDestinationArnException
case object InvalidRelativeFileVersionEnumException
case object InvalidTargetException
case object InvalidClientRequestTokenException
case object PullRequestAlreadyClosedException
case object RepositoryLimitExceededException
final case class UpdatePullRequestDescriptionInput(pullRequestId: java.lang.String, description: java.lang.String)
final case class GetDifferencesInput(afterCommitSpecifier: java.lang.String, repositoryName: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, beforePath: scala.Option[java.lang.String] = scala.None, afterPath: scala.Option[java.lang.String] = scala.None, beforeCommitSpecifier: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListRepositoriesOutput(repositories: scala.Option[scala.List[avias.codecommit.models.RepositoryNameIdPair]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object MultipleRepositoriesInPullRequestException
case object InvalidRepositoryTriggerEventsException
final case class GetCommentOutput(comment: scala.Option[avias.codecommit.models.Comment] = scala.None)
case object RepositoryDoesNotExistException
case object InvalidFilePositionException
case object RepositoryNamesRequiredException
case object InvalidActorArnException
final case class GetMergeConflictsOutput(mergeable: scala.Boolean, destinationCommitId: java.lang.String, sourceCommitId: java.lang.String)
case object InvalidMaxResultsException
final case class BatchGetRepositoriesOutput(repositories: scala.Option[scala.List[avias.codecommit.models.RepositoryMetadata]] = scala.None, repositoriesNotFound: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class UpdateCommentOutput(comment: scala.Option[avias.codecommit.models.Comment] = scala.None)
case object TargetRequiredException
case object CommentContentSizeLimitExceededException
case object InvalidPullRequestStatusException
final case class DescribePullRequestEventsInput(pullRequestId: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, actorArn: scala.Option[java.lang.String] = scala.None, pullRequestEventType: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object InvalidDestinationCommitSpecifierException
final case class GetRepositoryInput(repositoryName: java.lang.String)
case object MergeOptionRequiredException
final case class UpdatePullRequestTitleOutput(pullRequest: avias.codecommit.models.PullRequest)
case object BlobIdDoesNotExistException
case object TargetsRequiredException
final case class DeleteBranchOutput(deletedBranch: scala.Option[avias.codecommit.models.BranchInfo] = scala.None)
case object InvalidPullRequestStatusUpdateException
final case class UpdateCommentInput(commentId: java.lang.String, content: java.lang.String)
case object BlobIdRequiredException
case object InvalidSortByException
final case class GetBranchOutput(branch: scala.Option[avias.codecommit.models.BranchInfo] = scala.None)
case object InvalidAuthorArnException
final case class Comment(content: scala.Option[java.lang.String] = scala.None, deleted: scala.Option[scala.Boolean] = scala.None, authorArn: scala.Option[java.lang.String] = scala.None, commentId: scala.Option[java.lang.String] = scala.None, inReplyTo: scala.Option[java.lang.String] = scala.None, lastModifiedDate: scala.Option[java.time.Instant] = scala.None, clientRequestToken: scala.Option[java.lang.String] = scala.None, creationDate: scala.Option[java.time.Instant] = scala.None)
case object InvalidPullRequestEventTypeException
final case class GetBlobInput(repositoryName: java.lang.String, blobId: java.lang.String)
final case class UpdateRepositoryDescriptionInput(repositoryName: java.lang.String, repositoryDescription: scala.Option[java.lang.String] = scala.None)
case object EncryptionKeyUnavailableException
case object InvalidTargetsException
case object PullRequestDoesNotExistException
final case class Location(filePath: scala.Option[java.lang.String] = scala.None, filePosition: scala.Option[scala.Long] = scala.None, relativeFileVersion: scala.Option[java.lang.String] = scala.None)
case object BeforeCommitIdAndAfterCommitIdAreSameException
final case class PostCommentReplyInput(inReplyTo: java.lang.String, content: java.lang.String, clientRequestToken: scala.Option[java.lang.String] = scala.None)
final case class UpdatePullRequestStatusInput(pullRequestId: java.lang.String, pullRequestStatus: java.lang.String)
final case class Commit(author: scala.Option[avias.codecommit.models.UserInfo] = scala.None, committer: scala.Option[avias.codecommit.models.UserInfo] = scala.None, commitId: scala.Option[java.lang.String] = scala.None, treeId: scala.Option[java.lang.String] = scala.None, additionalData: scala.Option[java.lang.String] = scala.None, parents: scala.Option[scala.List[java.lang.String]] = scala.None, message: scala.Option[java.lang.String] = scala.None)
case object AuthorDoesNotExistException
final case class RepositoryMetadata(arn: scala.Option[java.lang.String] = scala.None, defaultBranch: scala.Option[java.lang.String] = scala.None, repositoryDescription: scala.Option[java.lang.String] = scala.None, lastModifiedDate: scala.Option[java.time.Instant] = scala.None, cloneUrlHttp: scala.Option[java.lang.String] = scala.None, repositoryId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, cloneUrlSsh: scala.Option[java.lang.String] = scala.None, creationDate: scala.Option[java.time.Instant] = scala.None, accountId: scala.Option[java.lang.String] = scala.None)
case object PullRequestStatusRequiredException
case object InvalidBlobIdException
final case class MergePullRequestByFastForwardOutput(pullRequest: scala.Option[avias.codecommit.models.PullRequest] = scala.None)
case object RepositoryTriggersListRequiredException
case object BranchNameRequiredException
case object InvalidReferenceNameException
case object RepositoryNotAssociatedWithPullRequestException
case object CommentDoesNotExistException
case object CommentIdRequiredException
case object ManualMergeRequiredException
case object TipOfSourceReferenceIsDifferentException
final case class PutRepositoryTriggersInput(repositoryName: java.lang.String, triggers: scala.List[avias.codecommit.models.RepositoryTrigger])
final case class PostCommentForPullRequestOutput(beforeBlobId: scala.Option[java.lang.String] = scala.None, afterBlobId: scala.Option[java.lang.String] = scala.None, pullRequestId: scala.Option[java.lang.String] = scala.None, beforeCommitId: scala.Option[java.lang.String] = scala.None, afterCommitId: scala.Option[java.lang.String] = scala.None, repositoryName: scala.Option[java.lang.String] = scala.None, comment: scala.Option[avias.codecommit.models.Comment] = scala.None, location: scala.Option[avias.codecommit.models.Location] = scala.None)
case object CommentContentRequiredException
final case class PullRequestEvent(eventDate: scala.Option[java.time.Instant] = scala.None, pullRequestStatusChangedEventMetadata: scala.Option[avias.codecommit.models.PullRequestStatusChangedEventMetadata] = scala.None, actorArn: scala.Option[java.lang.String] = scala.None, pullRequestId: scala.Option[java.lang.String] = scala.None, pullRequestSourceReferenceUpdatedEventMetadata: scala.Option[avias.codecommit.models.PullRequestSourceReferenceUpdatedEventMetadata] = scala.None, pullRequestMergedStateChangedEventMetadata: scala.Option[avias.codecommit.models.PullRequestMergedStateChangedEventMetadata] = scala.None, pullRequestEventType: scala.Option[java.lang.String] = scala.None)
case object DefaultBranchCannotBeDeletedException
final case class GetRepositoryTriggersInput(repositoryName: java.lang.String)
final case class GetCommentsForComparedCommitOutput(commentsForComparedCommitData: scala.Option[scala.List[avias.codecommit.models.CommentsForComparedCommit]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)