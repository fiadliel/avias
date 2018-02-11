package org.lyranthe.araethura.mechanicalturkrequester
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetQualificationScoreResponseEncoder: io.circe.Encoder[models.GetQualificationScoreResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Qualification" -> o.qualification.asJson)
  }
  final implicit val ListBonusPaymentsResponseEncoder: io.circe.Encoder[models.ListBonusPaymentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NumResults" -> o.numResults.asJson, "NextToken" -> o.nextToken.asJson, "BonusPayments" -> o.bonusPayments.asJson)
  }
  final implicit val ListBonusPaymentsRequestEncoder: io.circe.Encoder[models.ListBonusPaymentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "AssignmentId" -> o.assignmentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val GetQualificationTypeRequestEncoder: io.circe.Encoder[models.GetQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson)
  }
  final implicit val UpdateQualificationTypeResponseEncoder: io.circe.Encoder[models.UpdateQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationType" -> o.qualificationType.asJson)
  }
  final implicit val CreateWorkerBlockResponseEncoder: io.circe.Encoder[models.CreateWorkerBlockResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReviewActionDetailEncoder: io.circe.Encoder[models.ReviewActionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ActionId" -> o.actionId.asJson, "TargetId" -> o.targetId.asJson, "ActionName" -> o.actionName.asJson, "TargetType" -> o.targetType.asJson, "Result" -> o.result.asJson, "ErrorCode" -> o.errorCode.asJson, "Status" -> o.status.asJson, "CompleteTime" -> o.completeTime.asJson)
  }
  final implicit val HITEncoder: io.circe.Encoder[models.HIT] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "HITTypeId" -> o.hittypeId.asJson, "HITGroupId" -> o.hitgroupId.asJson, "HITLayoutId" -> o.hitlayoutId.asJson, "CreationTime" -> o.creationTime.asJson, "Expiration" -> o.expiration.asJson, "AutoApprovalDelayInSeconds" -> o.autoApprovalDelayInSeconds.asJson, "AssignmentDurationInSeconds" -> o.assignmentDurationInSeconds.asJson, "Keywords" -> o.keywords.asJson, "RequesterAnnotation" -> o.requesterAnnotation.asJson, "Question" -> o.question.asJson, "Title" -> o.title.asJson, "Description" -> o.description.asJson, "HITReviewStatus" -> o.hitreviewStatus.asJson, "HITStatus" -> o.hitstatus.asJson, "MaxAssignments" -> o.maxAssignments.asJson, "NumberOfAssignmentsPending" -> o.numberOfAssignmentsPending.asJson, "NumberOfAssignmentsAvailable" -> o.numberOfAssignmentsAvailable.asJson, "NumberOfAssignmentsCompleted" -> o.numberOfAssignmentsCompleted.asJson, "Reward" -> o.reward.asJson, "QualificationRequirements" -> o.qualificationRequirements.asJson)
  }
  final implicit val RejectAssignmentRequestEncoder: io.circe.Encoder[models.RejectAssignmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson, "RequesterFeedback" -> o.requesterFeedback.asJson)
  }
  final implicit val AssignmentEncoder: io.circe.Encoder[models.Assignment] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "AssignmentId" -> o.assignmentId.asJson, "HITId" -> o.hitid.asJson, "AcceptTime" -> o.acceptTime.asJson, "RejectionTime" -> o.rejectionTime.asJson, "Deadline" -> o.deadline.asJson, "SubmitTime" -> o.submitTime.asJson, "AutoApprovalTime" -> o.autoApprovalTime.asJson, "ApprovalTime" -> o.approvalTime.asJson, "Answer" -> o.answer.asJson, "RequesterFeedback" -> o.requesterFeedback.asJson, "AssignmentStatus" -> o.assignmentStatus.asJson)
  }
  final implicit val DeleteWorkerBlockResponseEncoder: io.circe.Encoder[models.DeleteWorkerBlockResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReviewPolicyEncoder: io.circe.Encoder[models.ReviewPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyName" -> o.policyName.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val ListWorkerBlocksResponseEncoder: io.circe.Encoder[models.ListWorkerBlocksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "WorkerBlocks" -> o.workerBlocks.asJson)
  }
  final implicit val UpdateHITReviewStatusResponseEncoder: io.circe.Encoder[models.UpdateHITReviewStatusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val HITLayoutParameterEncoder: io.circe.Encoder[models.HITLayoutParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ReviewResultDetailEncoder: io.circe.Encoder[models.ReviewResultDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ActionId" -> o.actionId.asJson, "SubjectId" -> o.subjectId.asJson, "QuestionId" -> o.questionId.asJson, "SubjectType" -> o.subjectType.asJson, "Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListHITsForQualificationTypeResponseEncoder: io.circe.Encoder[models.ListHITsForQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "HITs" -> o.hits.asJson)
  }
  final implicit val GetAssignmentRequestEncoder: io.circe.Encoder[models.GetAssignmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson)
  }
  final implicit val CreateQualificationTypeRequestEncoder: io.circe.Encoder[models.CreateQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Description" -> o.description.asJson, "QualificationTypeStatus" -> o.qualificationTypeStatus.asJson, "RetryDelayInSeconds" -> o.retryDelayInSeconds.asJson, "TestDurationInSeconds" -> o.testDurationInSeconds.asJson, "Keywords" -> o.keywords.asJson, "AnswerKey" -> o.answerKey.asJson, "Test" -> o.test.asJson, "AutoGrantedValue" -> o.autoGrantedValue.asJson, "AutoGranted" -> o.autoGranted.asJson)
  }
  final implicit val DisassociateQualificationFromWorkerRequestEncoder: io.circe.Encoder[models.DisassociateQualificationFromWorkerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "QualificationTypeId" -> o.qualificationTypeId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val LocaleEncoder: io.circe.Encoder[models.Locale] = io.circe.Encoder.instance { o => 
    Json.obj("Country" -> o.country.asJson, "Subdivision" -> o.subdivision.asJson)
  }
  final implicit val GetAssignmentResponseEncoder: io.circe.Encoder[models.GetAssignmentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Assignment" -> o.assignment.asJson, "HIT" -> o.hit.asJson)
  }
  final implicit val DeleteQualificationTypeRequestEncoder: io.circe.Encoder[models.DeleteQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson)
  }
  final implicit val CreateHITWithHITTypeRequestEncoder: io.circe.Encoder[models.CreateHITWithHITTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson, "LifetimeInSeconds" -> o.lifetimeInSeconds.asJson, "HITLayoutId" -> o.hitlayoutId.asJson, "AssignmentReviewPolicy" -> o.assignmentReviewPolicy.asJson, "HITReviewPolicy" -> o.hitreviewPolicy.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson, "Question" -> o.question.asJson, "RequesterAnnotation" -> o.requesterAnnotation.asJson, "HITLayoutParameters" -> o.hitlayoutParameters.asJson, "MaxAssignments" -> o.maxAssignments.asJson)
  }
  final implicit val ListAssignmentsForHITResponseEncoder: io.circe.Encoder[models.ListAssignmentsForHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "Assignments" -> o.assignments.asJson)
  }
  final implicit val DisassociateQualificationFromWorkerResponseEncoder: io.circe.Encoder[models.DisassociateQualificationFromWorkerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AssociateQualificationWithWorkerRequestEncoder: io.circe.Encoder[models.AssociateQualificationWithWorkerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "WorkerId" -> o.workerId.asJson, "IntegerValue" -> o.integerValue.asJson, "SendNotification" -> o.sendNotification.asJson)
  }
  final implicit val CreateHITTypeResponseEncoder: io.circe.Encoder[models.CreateHITTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson)
  }
  final implicit val ListWorkersWithQualificationTypeRequestEncoder: io.circe.Encoder[models.ListWorkersWithQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "Status" -> o.status.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ReviewReportEncoder: io.circe.Encoder[models.ReviewReport] = io.circe.Encoder.instance { o => 
    Json.obj("ReviewResults" -> o.reviewResults.asJson, "ReviewActions" -> o.reviewActions.asJson)
  }
  final implicit val CreateHITWithHITTypeResponseEncoder: io.circe.Encoder[models.CreateHITWithHITTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HIT" -> o.hit.asJson)
  }
  final implicit val UpdateHITTypeOfHITRequestEncoder: io.circe.Encoder[models.UpdateHITTypeOfHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "HITTypeId" -> o.hittypeId.asJson)
  }
  final implicit val SendBonusResponseEncoder: io.circe.Encoder[models.SendBonusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterMapEntryEncoder: io.circe.Encoder[models.ParameterMapEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val UpdateNotificationSettingsRequestEncoder: io.circe.Encoder[models.UpdateNotificationSettingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson, "Notification" -> o.notification.asJson, "Active" -> o.active.asJson)
  }
  final implicit val GetFileUploadURLRequestEncoder: io.circe.Encoder[models.GetFileUploadURLRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson, "QuestionIdentifier" -> o.questionIdentifier.asJson)
  }
  final implicit val ListReviewPolicyResultsForHITResponseEncoder: io.circe.Encoder[models.ListReviewPolicyResultsForHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "AssignmentReviewPolicy" -> o.assignmentReviewPolicy.asJson, "HITReviewPolicy" -> o.hitreviewPolicy.asJson, "AssignmentReviewReport" -> o.assignmentReviewReport.asJson, "HITReviewReport" -> o.hitreviewReport.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ApproveAssignmentRequestEncoder: io.circe.Encoder[models.ApproveAssignmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson, "RequesterFeedback" -> o.requesterFeedback.asJson, "OverrideRejection" -> o.overrideRejection.asJson)
  }
  final implicit val WorkerBlockEncoder: io.circe.Encoder[models.WorkerBlock] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val CreateAdditionalAssignmentsForHITRequestEncoder: io.circe.Encoder[models.CreateAdditionalAssignmentsForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "NumberOfAdditionalAssignments" -> o.numberOfAdditionalAssignments.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson)
  }
  final implicit val NotifyWorkersFailureStatusEncoder: io.circe.Encoder[models.NotifyWorkersFailureStatus] = io.circe.Encoder.instance { o => 
    Json.obj("NotifyWorkersFailureCode" -> o.notifyWorkersFailureCode.asJson, "NotifyWorkersFailureMessage" -> o.notifyWorkersFailureMessage.asJson, "WorkerId" -> o.workerId.asJson)
  }
  final implicit val ListReviewableHITsRequestEncoder: io.circe.Encoder[models.ListReviewableHITsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson, "Status" -> o.status.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteHITResponseEncoder: io.circe.Encoder[models.DeleteHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetAccountBalanceRequestEncoder: io.circe.Encoder[models.GetAccountBalanceRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListHITsResponseEncoder: io.circe.Encoder[models.ListHITsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "HITs" -> o.hits.asJson)
  }
  final implicit val UpdateHITTypeOfHITResponseEncoder: io.circe.Encoder[models.UpdateHITTypeOfHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetFileUploadURLResponseEncoder: io.circe.Encoder[models.GetFileUploadURLResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FileUploadURL" -> o.fileUploadURL.asJson)
  }
  final implicit val CreateHITRequestEncoder: io.circe.Encoder[models.CreateHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LifetimeInSeconds" -> o.lifetimeInSeconds.asJson, "AssignmentDurationInSeconds" -> o.assignmentDurationInSeconds.asJson, "Title" -> o.title.asJson, "Description" -> o.description.asJson, "Reward" -> o.reward.asJson, "HITLayoutId" -> o.hitlayoutId.asJson, "AssignmentReviewPolicy" -> o.assignmentReviewPolicy.asJson, "HITReviewPolicy" -> o.hitreviewPolicy.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson, "AutoApprovalDelayInSeconds" -> o.autoApprovalDelayInSeconds.asJson, "Keywords" -> o.keywords.asJson, "RequesterAnnotation" -> o.requesterAnnotation.asJson, "Question" -> o.question.asJson, "HITLayoutParameters" -> o.hitlayoutParameters.asJson, "MaxAssignments" -> o.maxAssignments.asJson, "QualificationRequirements" -> o.qualificationRequirements.asJson)
  }
  final implicit val DeleteQualificationTypeResponseEncoder: io.circe.Encoder[models.DeleteQualificationTypeResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateQualificationTypeRequestEncoder: io.circe.Encoder[models.UpdateQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "TestDurationInSeconds" -> o.testDurationInSeconds.asJson, "RetryDelayInSeconds" -> o.retryDelayInSeconds.asJson, "Description" -> o.description.asJson, "Test" -> o.test.asJson, "AnswerKey" -> o.answerKey.asJson, "QualificationTypeStatus" -> o.qualificationTypeStatus.asJson, "AutoGrantedValue" -> o.autoGrantedValue.asJson, "AutoGranted" -> o.autoGranted.asJson)
  }
  final implicit val QualificationEncoder: io.circe.Encoder[models.Qualification] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "QualificationTypeId" -> o.qualificationTypeId.asJson, "GrantTime" -> o.grantTime.asJson, "LocaleValue" -> o.localeValue.asJson, "Status" -> o.status.asJson, "IntegerValue" -> o.integerValue.asJson)
  }
  final implicit val UpdateExpirationForHITRequestEncoder: io.circe.Encoder[models.UpdateExpirationForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "ExpireAt" -> o.expireAt.asJson)
  }
  final implicit val RejectQualificationRequestRequestEncoder: io.circe.Encoder[models.RejectQualificationRequestRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationRequestId" -> o.qualificationRequestId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateHITReviewStatusRequestEncoder: io.circe.Encoder[models.UpdateHITReviewStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "Revert" -> o.revert.asJson)
  }
  final implicit val ListWorkerBlocksRequestEncoder: io.circe.Encoder[models.ListWorkerBlocksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListWorkersWithQualificationTypeResponseEncoder: io.circe.Encoder[models.ListWorkersWithQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "Qualifications" -> o.qualifications.asJson)
  }
  final implicit val CreateHITResponseEncoder: io.circe.Encoder[models.CreateHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HIT" -> o.hit.asJson)
  }
  final implicit val ListAssignmentsForHITRequestEncoder: io.circe.Encoder[models.ListAssignmentsForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson, "AssignmentStatuses" -> o.assignmentStatuses.asJson)
  }
  final implicit val SendTestEventNotificationRequestEncoder: io.circe.Encoder[models.SendTestEventNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "TestEventType" -> o.testEventType.asJson)
  }
  final implicit val ListQualificationTypesResponseEncoder: io.circe.Encoder[models.ListQualificationTypesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NumResults" -> o.numResults.asJson, "NextToken" -> o.nextToken.asJson, "QualificationTypes" -> o.qualificationTypes.asJson)
  }
  final implicit val CreateHITTypeRequestEncoder: io.circe.Encoder[models.CreateHITTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentDurationInSeconds" -> o.assignmentDurationInSeconds.asJson, "Reward" -> o.reward.asJson, "Title" -> o.title.asJson, "Description" -> o.description.asJson, "AutoApprovalDelayInSeconds" -> o.autoApprovalDelayInSeconds.asJson, "Keywords" -> o.keywords.asJson, "QualificationRequirements" -> o.qualificationRequirements.asJson)
  }
  final implicit val NotifyWorkersResponseEncoder: io.circe.Encoder[models.NotifyWorkersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NotifyWorkersFailureStatuses" -> o.notifyWorkersFailureStatuses.asJson)
  }
  final implicit val PolicyParameterEncoder: io.circe.Encoder[models.PolicyParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson, "MapEntries" -> o.mapEntries.asJson)
  }
  final implicit val ListReviewPolicyResultsForHITRequestEncoder: io.circe.Encoder[models.ListReviewPolicyResultsForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "NextToken" -> o.nextToken.asJson, "RetrieveActions" -> o.retrieveActions.asJson, "RetrieveResults" -> o.retrieveResults.asJson, "PolicyLevels" -> o.policyLevels.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteWorkerBlockRequestEncoder: io.circe.Encoder[models.DeleteWorkerBlockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateNotificationSettingsResponseEncoder: io.circe.Encoder[models.UpdateNotificationSettingsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val QualificationRequirementEncoder: io.circe.Encoder[models.QualificationRequirement] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "Comparator" -> o.comparator.asJson, "LocaleValues" -> o.localeValues.asJson, "RequiredToPreview" -> o.requiredToPreview.asJson, "IntegerValues" -> o.integerValues.asJson)
  }
  final implicit val GetAccountBalanceResponseEncoder: io.circe.Encoder[models.GetAccountBalanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AvailableBalance" -> o.availableBalance.asJson, "OnHoldBalance" -> o.onHoldBalance.asJson)
  }
  final implicit val RejectAssignmentResponseEncoder: io.circe.Encoder[models.RejectAssignmentResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServiceFaultEncoder: io.circe.Encoder[models.ServiceFault] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "TurkErrorCode" -> o.turkErrorCode.asJson)
  }
  final implicit val NotificationSpecificationEncoder: io.circe.Encoder[models.NotificationSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("Destination" -> o.destination.asJson, "Version" -> o.version.asJson, "Transport" -> o.transport.asJson, "EventTypes" -> o.eventTypes.asJson)
  }
  final implicit val AssociateQualificationWithWorkerResponseEncoder: io.circe.Encoder[models.AssociateQualificationWithWorkerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val QualificationRequestEncoder: io.circe.Encoder[models.QualificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationRequestId" -> o.qualificationRequestId.asJson, "Test" -> o.test.asJson, "Answer" -> o.answer.asJson, "QualificationTypeId" -> o.qualificationTypeId.asJson, "WorkerId" -> o.workerId.asJson, "SubmitTime" -> o.submitTime.asJson)
  }
  final implicit val ListHITsRequestEncoder: io.circe.Encoder[models.ListHITsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListReviewableHITsResponseEncoder: io.circe.Encoder[models.ListReviewableHITsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "HITs" -> o.hits.asJson)
  }
  final implicit val NotifyWorkersRequestEncoder: io.circe.Encoder[models.NotifyWorkersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Subject" -> o.subject.asJson, "MessageText" -> o.messageText.asJson, "WorkerIds" -> o.workerIds.asJson)
  }
  final implicit val ListHITsForQualificationTypeRequestEncoder: io.circe.Encoder[models.ListHITsForQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val SendTestEventNotificationResponseEncoder: io.circe.Encoder[models.SendTestEventNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BonusPaymentEncoder: io.circe.Encoder[models.BonusPayment] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "AssignmentId" -> o.assignmentId.asJson, "GrantTime" -> o.grantTime.asJson, "Reason" -> o.reason.asJson, "BonusAmount" -> o.bonusAmount.asJson)
  }
  final implicit val DeleteHITRequestEncoder: io.circe.Encoder[models.DeleteHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson)
  }
  final implicit val QualificationTypeEncoder: io.circe.Encoder[models.QualificationType] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "CreationTime" -> o.creationTime.asJson, "TestDurationInSeconds" -> o.testDurationInSeconds.asJson, "RetryDelayInSeconds" -> o.retryDelayInSeconds.asJson, "Keywords" -> o.keywords.asJson, "AnswerKey" -> o.answerKey.asJson, "Name" -> o.name.asJson, "Test" -> o.test.asJson, "Description" -> o.description.asJson, "QualificationTypeStatus" -> o.qualificationTypeStatus.asJson, "AutoGrantedValue" -> o.autoGrantedValue.asJson, "IsRequestable" -> o.isRequestable.asJson, "AutoGranted" -> o.autoGranted.asJson)
  }
  final implicit val CreateWorkerBlockRequestEncoder: io.circe.Encoder[models.CreateWorkerBlockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val RejectQualificationRequestResponseEncoder: io.circe.Encoder[models.RejectQualificationRequestResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateExpirationForHITResponseEncoder: io.circe.Encoder[models.UpdateExpirationForHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApproveAssignmentResponseEncoder: io.circe.Encoder[models.ApproveAssignmentResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AcceptQualificationRequestRequestEncoder: io.circe.Encoder[models.AcceptQualificationRequestRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationRequestId" -> o.qualificationRequestId.asJson, "IntegerValue" -> o.integerValue.asJson)
  }
  final implicit val ListQualificationTypesRequestEncoder: io.circe.Encoder[models.ListQualificationTypesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MustBeRequestable" -> o.mustBeRequestable.asJson, "MustBeOwnedByCaller" -> o.mustBeOwnedByCaller.asJson, "Query" -> o.query.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val RequestErrorEncoder: io.circe.Encoder[models.RequestError] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "TurkErrorCode" -> o.turkErrorCode.asJson)
  }
  final implicit val ListQualificationRequestsResponseEncoder: io.circe.Encoder[models.ListQualificationRequestsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NumResults" -> o.numResults.asJson, "NextToken" -> o.nextToken.asJson, "QualificationRequests" -> o.qualificationRequests.asJson)
  }
  final implicit val GetHITResponseEncoder: io.circe.Encoder[models.GetHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HIT" -> o.hit.asJson)
  }
  final implicit val SendBonusRequestEncoder: io.circe.Encoder[models.SendBonusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "AssignmentId" -> o.assignmentId.asJson, "Reason" -> o.reason.asJson, "BonusAmount" -> o.bonusAmount.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson)
  }
  final implicit val ListQualificationRequestsRequestEncoder: io.circe.Encoder[models.ListQualificationRequestsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val GetQualificationScoreRequestEncoder: io.circe.Encoder[models.GetQualificationScoreRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "WorkerId" -> o.workerId.asJson)
  }
  final implicit val CreateAdditionalAssignmentsForHITResponseEncoder: io.circe.Encoder[models.CreateAdditionalAssignmentsForHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetHITRequestEncoder: io.circe.Encoder[models.GetHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson)
  }
  final implicit val GetQualificationTypeResponseEncoder: io.circe.Encoder[models.GetQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationType" -> o.qualificationType.asJson)
  }
  final implicit val CreateQualificationTypeResponseEncoder: io.circe.Encoder[models.CreateQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationType" -> o.qualificationType.asJson)
  }
  final implicit val AcceptQualificationRequestResponseEncoder: io.circe.Encoder[models.AcceptQualificationRequestResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetQualificationScoreResponseDecoder: io.circe.Decoder[models.GetQualificationScoreResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Qualification]]("Qualification").map(models.GetQualificationScoreResponse.apply _)
  }
  final implicit val ListBonusPaymentsResponseDecoder: io.circe.Decoder[models.ListBonusPaymentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.BonusPayment]]]("BonusPayments")).mapN(models.ListBonusPaymentsResponse.apply _)
  }
  final implicit val ListBonusPaymentsRequestDecoder: io.circe.Decoder[models.ListBonusPaymentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[java.lang.String]]("AssignmentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListBonusPaymentsRequest.apply _)
  }
  final implicit val GetQualificationTypeRequestDecoder: io.circe.Decoder[models.GetQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QualificationTypeId").map(models.GetQualificationTypeRequest.apply _)
  }
  final implicit val UpdateQualificationTypeResponseDecoder: io.circe.Decoder[models.UpdateQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.QualificationType]]("QualificationType").map(models.UpdateQualificationTypeResponse.apply _)
  }
  final implicit val CreateWorkerBlockResponseDecoder: io.circe.Decoder[models.CreateWorkerBlockResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateWorkerBlockResponse)
  final implicit val ReviewActionDetailDecoder: io.circe.Decoder[models.ReviewActionDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionId"), o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("ActionName"), o.get[scala.Option[java.lang.String]]("TargetType"), o.get[scala.Option[java.lang.String]]("Result"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.time.Instant]]("CompleteTime")).mapN(models.ReviewActionDetail.apply _)
  }
  final implicit val HITDecoder: io.circe.Decoder[models.HIT] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[java.lang.String]]("HITTypeId"), o.get[scala.Option[java.lang.String]]("HITGroupId"), o.get[scala.Option[java.lang.String]]("HITLayoutId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("Expiration"), o.get[scala.Option[scala.Long]]("AutoApprovalDelayInSeconds"), o.get[scala.Option[scala.Long]]("AssignmentDurationInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("RequesterAnnotation"), o.get[scala.Option[java.lang.String]]("Question"), o.get[scala.Option[java.lang.String]]("Title"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("HITReviewStatus"), o.get[scala.Option[java.lang.String]]("HITStatus"), o.get[scala.Option[scala.Int]]("MaxAssignments"), o.get[scala.Option[scala.Int]]("NumberOfAssignmentsPending"), o.get[scala.Option[scala.Int]]("NumberOfAssignmentsAvailable"), o.get[scala.Option[scala.Int]]("NumberOfAssignmentsCompleted"), o.get[scala.Option[java.lang.String]]("Reward"), o.get[scala.Option[scala.List[models.QualificationRequirement]]]("QualificationRequirements")).mapN(models.HIT.apply _)
  }
  final implicit val RejectAssignmentRequestDecoder: io.circe.Decoder[models.RejectAssignmentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssignmentId"), o.get[java.lang.String]("RequesterFeedback")).mapN(models.RejectAssignmentRequest.apply _)
  }
  final implicit val AssignmentDecoder: io.circe.Decoder[models.Assignment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("AssignmentId"), o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[java.time.Instant]]("AcceptTime"), o.get[scala.Option[java.time.Instant]]("RejectionTime"), o.get[scala.Option[java.time.Instant]]("Deadline"), o.get[scala.Option[java.time.Instant]]("SubmitTime"), o.get[scala.Option[java.time.Instant]]("AutoApprovalTime"), o.get[scala.Option[java.time.Instant]]("ApprovalTime"), o.get[scala.Option[java.lang.String]]("Answer"), o.get[scala.Option[java.lang.String]]("RequesterFeedback"), o.get[scala.Option[java.lang.String]]("AssignmentStatus")).mapN(models.Assignment.apply _)
  }
  final implicit val DeleteWorkerBlockResponseDecoder: io.circe.Decoder[models.DeleteWorkerBlockResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteWorkerBlockResponse)
  final implicit val ReviewPolicyDecoder: io.circe.Decoder[models.ReviewPolicy] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyName"), o.get[scala.Option[scala.List[models.PolicyParameter]]]("Parameters")).mapN(models.ReviewPolicy.apply _)
  }
  final implicit val ListWorkerBlocksResponseDecoder: io.circe.Decoder[models.ListWorkerBlocksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[models.WorkerBlock]]]("WorkerBlocks")).mapN(models.ListWorkerBlocksResponse.apply _)
  }
  final implicit val UpdateHITReviewStatusResponseDecoder: io.circe.Decoder[models.UpdateHITReviewStatusResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateHITReviewStatusResponse)
  final implicit val HITLayoutParameterDecoder: io.circe.Decoder[models.HITLayoutParameter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Value")).mapN(models.HITLayoutParameter.apply _)
  }
  final implicit val ReviewResultDetailDecoder: io.circe.Decoder[models.ReviewResultDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionId"), o.get[scala.Option[java.lang.String]]("SubjectId"), o.get[scala.Option[java.lang.String]]("QuestionId"), o.get[scala.Option[java.lang.String]]("SubjectType"), o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.ReviewResultDetail.apply _)
  }
  final implicit val ListHITsForQualificationTypeResponseDecoder: io.circe.Decoder[models.ListHITsForQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[models.HIT]]]("HITs")).mapN(models.ListHITsForQualificationTypeResponse.apply _)
  }
  final implicit val GetAssignmentRequestDecoder: io.circe.Decoder[models.GetAssignmentRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AssignmentId").map(models.GetAssignmentRequest.apply _)
  }
  final implicit val CreateQualificationTypeRequestDecoder: io.circe.Decoder[models.CreateQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("QualificationTypeStatus"), o.get[scala.Option[scala.Long]]("RetryDelayInSeconds"), o.get[scala.Option[scala.Long]]("TestDurationInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("AnswerKey"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[scala.Int]]("AutoGrantedValue"), o.get[scala.Option[scala.Boolean]]("AutoGranted")).mapN(models.CreateQualificationTypeRequest.apply _)
  }
  final implicit val DisassociateQualificationFromWorkerRequestDecoder: io.circe.Decoder[models.DisassociateQualificationFromWorkerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.DisassociateQualificationFromWorkerRequest.apply _)
  }
  final implicit val LocaleDecoder: io.circe.Decoder[models.Locale] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Country"), o.get[scala.Option[java.lang.String]]("Subdivision")).mapN(models.Locale.apply _)
  }
  final implicit val GetAssignmentResponseDecoder: io.circe.Decoder[models.GetAssignmentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.Assignment]]("Assignment"), o.get[scala.Option[models.HIT]]("HIT")).mapN(models.GetAssignmentResponse.apply _)
  }
  final implicit val DeleteQualificationTypeRequestDecoder: io.circe.Decoder[models.DeleteQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QualificationTypeId").map(models.DeleteQualificationTypeRequest.apply _)
  }
  final implicit val CreateHITWithHITTypeRequestDecoder: io.circe.Decoder[models.CreateHITWithHITTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITTypeId"), o.get[scala.Long]("LifetimeInSeconds"), o.get[scala.Option[java.lang.String]]("HITLayoutId"), o.get[scala.Option[models.ReviewPolicy]]("AssignmentReviewPolicy"), o.get[scala.Option[models.ReviewPolicy]]("HITReviewPolicy"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken"), o.get[scala.Option[java.lang.String]]("Question"), o.get[scala.Option[java.lang.String]]("RequesterAnnotation"), o.get[scala.Option[scala.List[models.HITLayoutParameter]]]("HITLayoutParameters"), o.get[scala.Option[scala.Int]]("MaxAssignments")).mapN(models.CreateHITWithHITTypeRequest.apply _)
  }
  final implicit val ListAssignmentsForHITResponseDecoder: io.circe.Decoder[models.ListAssignmentsForHITResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[models.Assignment]]]("Assignments")).mapN(models.ListAssignmentsForHITResponse.apply _)
  }
  final implicit val DisassociateQualificationFromWorkerResponseDecoder: io.circe.Decoder[models.DisassociateQualificationFromWorkerResponse.type] = io.circe.Decoder.decodeUnit.as(models.DisassociateQualificationFromWorkerResponse)
  final implicit val AssociateQualificationWithWorkerRequestDecoder: io.circe.Decoder[models.AssociateQualificationWithWorkerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[java.lang.String]("WorkerId"), o.get[scala.Option[scala.Int]]("IntegerValue"), o.get[scala.Option[scala.Boolean]]("SendNotification")).mapN(models.AssociateQualificationWithWorkerRequest.apply _)
  }
  final implicit val CreateHITTypeResponseDecoder: io.circe.Decoder[models.CreateHITTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HITTypeId").map(models.CreateHITTypeResponse.apply _)
  }
  final implicit val ListWorkersWithQualificationTypeRequestDecoder: io.circe.Decoder[models.ListWorkersWithQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListWorkersWithQualificationTypeRequest.apply _)
  }
  final implicit val ReviewReportDecoder: io.circe.Decoder[models.ReviewReport] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.ReviewResultDetail]]]("ReviewResults"), o.get[scala.Option[scala.List[models.ReviewActionDetail]]]("ReviewActions")).mapN(models.ReviewReport.apply _)
  }
  final implicit val CreateHITWithHITTypeResponseDecoder: io.circe.Decoder[models.CreateHITWithHITTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.HIT]]("HIT").map(models.CreateHITWithHITTypeResponse.apply _)
  }
  final implicit val UpdateHITTypeOfHITRequestDecoder: io.circe.Decoder[models.UpdateHITTypeOfHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[java.lang.String]("HITTypeId")).mapN(models.UpdateHITTypeOfHITRequest.apply _)
  }
  final implicit val SendBonusResponseDecoder: io.circe.Decoder[models.SendBonusResponse.type] = io.circe.Decoder.decodeUnit.as(models.SendBonusResponse)
  final implicit val ParameterMapEntryDecoder: io.circe.Decoder[models.ParameterMapEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(models.ParameterMapEntry.apply _)
  }
  final implicit val UpdateNotificationSettingsRequestDecoder: io.circe.Decoder[models.UpdateNotificationSettingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITTypeId"), o.get[scala.Option[models.NotificationSpecification]]("Notification"), o.get[scala.Option[scala.Boolean]]("Active")).mapN(models.UpdateNotificationSettingsRequest.apply _)
  }
  final implicit val GetFileUploadURLRequestDecoder: io.circe.Decoder[models.GetFileUploadURLRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssignmentId"), o.get[java.lang.String]("QuestionIdentifier")).mapN(models.GetFileUploadURLRequest.apply _)
  }
  final implicit val ListReviewPolicyResultsForHITResponseDecoder: io.circe.Decoder[models.ListReviewPolicyResultsForHITResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[models.ReviewPolicy]]("AssignmentReviewPolicy"), o.get[scala.Option[models.ReviewPolicy]]("HITReviewPolicy"), o.get[scala.Option[models.ReviewReport]]("AssignmentReviewReport"), o.get[scala.Option[models.ReviewReport]]("HITReviewReport"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListReviewPolicyResultsForHITResponse.apply _)
  }
  final implicit val ApproveAssignmentRequestDecoder: io.circe.Decoder[models.ApproveAssignmentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssignmentId"), o.get[scala.Option[java.lang.String]]("RequesterFeedback"), o.get[scala.Option[scala.Boolean]]("OverrideRejection")).mapN(models.ApproveAssignmentRequest.apply _)
  }
  final implicit val WorkerBlockDecoder: io.circe.Decoder[models.WorkerBlock] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.WorkerBlock.apply _)
  }
  final implicit val CreateAdditionalAssignmentsForHITRequestDecoder: io.circe.Decoder[models.CreateAdditionalAssignmentsForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Int]("NumberOfAdditionalAssignments"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken")).mapN(models.CreateAdditionalAssignmentsForHITRequest.apply _)
  }
  final implicit val NotifyWorkersFailureStatusDecoder: io.circe.Decoder[models.NotifyWorkersFailureStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NotifyWorkersFailureCode"), o.get[scala.Option[java.lang.String]]("NotifyWorkersFailureMessage"), o.get[scala.Option[java.lang.String]]("WorkerId")).mapN(models.NotifyWorkersFailureStatus.apply _)
  }
  final implicit val ListReviewableHITsRequestDecoder: io.circe.Decoder[models.ListReviewableHITsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITTypeId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListReviewableHITsRequest.apply _)
  }
  final implicit val DeleteHITResponseDecoder: io.circe.Decoder[models.DeleteHITResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteHITResponse)
  final implicit val GetAccountBalanceRequestDecoder: io.circe.Decoder[models.GetAccountBalanceRequest.type] = io.circe.Decoder.decodeUnit.as(models.GetAccountBalanceRequest)
  final implicit val ListHITsResponseDecoder: io.circe.Decoder[models.ListHITsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[models.HIT]]]("HITs")).mapN(models.ListHITsResponse.apply _)
  }
  final implicit val UpdateHITTypeOfHITResponseDecoder: io.circe.Decoder[models.UpdateHITTypeOfHITResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateHITTypeOfHITResponse)
  final implicit val GetFileUploadURLResponseDecoder: io.circe.Decoder[models.GetFileUploadURLResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileUploadURL").map(models.GetFileUploadURLResponse.apply _)
  }
  final implicit val CreateHITRequestDecoder: io.circe.Decoder[models.CreateHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("LifetimeInSeconds"), o.get[scala.Long]("AssignmentDurationInSeconds"), o.get[java.lang.String]("Title"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("Reward"), o.get[scala.Option[java.lang.String]]("HITLayoutId"), o.get[scala.Option[models.ReviewPolicy]]("AssignmentReviewPolicy"), o.get[scala.Option[models.ReviewPolicy]]("HITReviewPolicy"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken"), o.get[scala.Option[scala.Long]]("AutoApprovalDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("RequesterAnnotation"), o.get[scala.Option[java.lang.String]]("Question"), o.get[scala.Option[scala.List[models.HITLayoutParameter]]]("HITLayoutParameters"), o.get[scala.Option[scala.Int]]("MaxAssignments"), o.get[scala.Option[scala.List[models.QualificationRequirement]]]("QualificationRequirements")).mapN(models.CreateHITRequest.apply _)
  }
  final implicit val DeleteQualificationTypeResponseDecoder: io.circe.Decoder[models.DeleteQualificationTypeResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteQualificationTypeResponse)
  final implicit val UpdateQualificationTypeRequestDecoder: io.circe.Decoder[models.UpdateQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[scala.Long]]("TestDurationInSeconds"), o.get[scala.Option[scala.Long]]("RetryDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[java.lang.String]]("AnswerKey"), o.get[scala.Option[java.lang.String]]("QualificationTypeStatus"), o.get[scala.Option[scala.Int]]("AutoGrantedValue"), o.get[scala.Option[scala.Boolean]]("AutoGranted")).mapN(models.UpdateQualificationTypeRequest.apply _)
  }
  final implicit val QualificationDecoder: io.circe.Decoder[models.Qualification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.time.Instant]]("GrantTime"), o.get[scala.Option[models.Locale]]("LocaleValue"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("IntegerValue")).mapN(models.Qualification.apply _)
  }
  final implicit val UpdateExpirationForHITRequestDecoder: io.circe.Decoder[models.UpdateExpirationForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[java.time.Instant]("ExpireAt")).mapN(models.UpdateExpirationForHITRequest.apply _)
  }
  final implicit val RejectQualificationRequestRequestDecoder: io.circe.Decoder[models.RejectQualificationRequestRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationRequestId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.RejectQualificationRequestRequest.apply _)
  }
  final implicit val UpdateHITReviewStatusRequestDecoder: io.circe.Decoder[models.UpdateHITReviewStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Option[scala.Boolean]]("Revert")).mapN(models.UpdateHITReviewStatusRequest.apply _)
  }
  final implicit val ListWorkerBlocksRequestDecoder: io.circe.Decoder[models.ListWorkerBlocksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListWorkerBlocksRequest.apply _)
  }
  final implicit val ListWorkersWithQualificationTypeResponseDecoder: io.circe.Decoder[models.ListWorkersWithQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[models.Qualification]]]("Qualifications")).mapN(models.ListWorkersWithQualificationTypeResponse.apply _)
  }
  final implicit val CreateHITResponseDecoder: io.circe.Decoder[models.CreateHITResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.HIT]]("HIT").map(models.CreateHITResponse.apply _)
  }
  final implicit val ListAssignmentsForHITRequestDecoder: io.circe.Decoder[models.ListAssignmentsForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[java.lang.String]]]("AssignmentStatuses")).mapN(models.ListAssignmentsForHITRequest.apply _)
  }
  final implicit val SendTestEventNotificationRequestDecoder: io.circe.Decoder[models.SendTestEventNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[models.NotificationSpecification]("Notification"), o.get[java.lang.String]("TestEventType")).mapN(models.SendTestEventNotificationRequest.apply _)
  }
  final implicit val ListQualificationTypesResponseDecoder: io.circe.Decoder[models.ListQualificationTypesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.QualificationType]]]("QualificationTypes")).mapN(models.ListQualificationTypesResponse.apply _)
  }
  final implicit val CreateHITTypeRequestDecoder: io.circe.Decoder[models.CreateHITTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("AssignmentDurationInSeconds"), o.get[java.lang.String]("Reward"), o.get[java.lang.String]("Title"), o.get[java.lang.String]("Description"), o.get[scala.Option[scala.Long]]("AutoApprovalDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[scala.List[models.QualificationRequirement]]]("QualificationRequirements")).mapN(models.CreateHITTypeRequest.apply _)
  }
  final implicit val NotifyWorkersResponseDecoder: io.circe.Decoder[models.NotifyWorkersResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.NotifyWorkersFailureStatus]]]("NotifyWorkersFailureStatuses").map(models.NotifyWorkersResponse.apply _)
  }
  final implicit val PolicyParameterDecoder: io.circe.Decoder[models.PolicyParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values"), o.get[scala.Option[scala.List[models.ParameterMapEntry]]]("MapEntries")).mapN(models.PolicyParameter.apply _)
  }
  final implicit val ListReviewPolicyResultsForHITRequestDecoder: io.circe.Decoder[models.ListReviewPolicyResultsForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Boolean]]("RetrieveActions"), o.get[scala.Option[scala.Boolean]]("RetrieveResults"), o.get[scala.Option[scala.List[java.lang.String]]]("PolicyLevels"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListReviewPolicyResultsForHITRequest.apply _)
  }
  final implicit val DeleteWorkerBlockRequestDecoder: io.circe.Decoder[models.DeleteWorkerBlockRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.DeleteWorkerBlockRequest.apply _)
  }
  final implicit val UpdateNotificationSettingsResponseDecoder: io.circe.Decoder[models.UpdateNotificationSettingsResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateNotificationSettingsResponse)
  final implicit val QualificationRequirementDecoder: io.circe.Decoder[models.QualificationRequirement] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[java.lang.String]("Comparator"), o.get[scala.Option[scala.List[models.Locale]]]("LocaleValues"), o.get[scala.Option[scala.Boolean]]("RequiredToPreview"), o.get[scala.Option[scala.List[scala.Int]]]("IntegerValues")).mapN(models.QualificationRequirement.apply _)
  }
  final implicit val GetAccountBalanceResponseDecoder: io.circe.Decoder[models.GetAccountBalanceResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AvailableBalance"), o.get[scala.Option[java.lang.String]]("OnHoldBalance")).mapN(models.GetAccountBalanceResponse.apply _)
  }
  final implicit val RejectAssignmentResponseDecoder: io.circe.Decoder[models.RejectAssignmentResponse.type] = io.circe.Decoder.decodeUnit.as(models.RejectAssignmentResponse)
  final implicit val ServiceFaultDecoder: io.circe.Decoder[models.ServiceFault] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("TurkErrorCode")).mapN(models.ServiceFault.apply _)
  }
  final implicit val NotificationSpecificationDecoder: io.circe.Decoder[models.NotificationSpecification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Destination"), o.get[java.lang.String]("Version"), o.get[java.lang.String]("Transport"), o.get[scala.List[java.lang.String]]("EventTypes")).mapN(models.NotificationSpecification.apply _)
  }
  final implicit val AssociateQualificationWithWorkerResponseDecoder: io.circe.Decoder[models.AssociateQualificationWithWorkerResponse.type] = io.circe.Decoder.decodeUnit.as(models.AssociateQualificationWithWorkerResponse)
  final implicit val QualificationRequestDecoder: io.circe.Decoder[models.QualificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QualificationRequestId"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[java.lang.String]]("Answer"), o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.time.Instant]]("SubmitTime")).mapN(models.QualificationRequest.apply _)
  }
  final implicit val ListHITsRequestDecoder: io.circe.Decoder[models.ListHITsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListHITsRequest.apply _)
  }
  final implicit val ListReviewableHITsResponseDecoder: io.circe.Decoder[models.ListReviewableHITsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[models.HIT]]]("HITs")).mapN(models.ListReviewableHITsResponse.apply _)
  }
  final implicit val NotifyWorkersRequestDecoder: io.circe.Decoder[models.NotifyWorkersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Subject"), o.get[java.lang.String]("MessageText"), o.get[scala.List[java.lang.String]]("WorkerIds")).mapN(models.NotifyWorkersRequest.apply _)
  }
  final implicit val ListHITsForQualificationTypeRequestDecoder: io.circe.Decoder[models.ListHITsForQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListHITsForQualificationTypeRequest.apply _)
  }
  final implicit val SendTestEventNotificationResponseDecoder: io.circe.Decoder[models.SendTestEventNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(models.SendTestEventNotificationResponse)
  final implicit val BonusPaymentDecoder: io.circe.Decoder[models.BonusPayment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("AssignmentId"), o.get[scala.Option[java.time.Instant]]("GrantTime"), o.get[scala.Option[java.lang.String]]("Reason"), o.get[scala.Option[java.lang.String]]("BonusAmount")).mapN(models.BonusPayment.apply _)
  }
  final implicit val DeleteHITRequestDecoder: io.circe.Decoder[models.DeleteHITRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HITId").map(models.DeleteHITRequest.apply _)
  }
  final implicit val QualificationTypeDecoder: io.circe.Decoder[models.QualificationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[scala.Long]]("TestDurationInSeconds"), o.get[scala.Option[scala.Long]]("RetryDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("AnswerKey"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("QualificationTypeStatus"), o.get[scala.Option[scala.Int]]("AutoGrantedValue"), o.get[scala.Option[scala.Boolean]]("IsRequestable"), o.get[scala.Option[scala.Boolean]]("AutoGranted")).mapN(models.QualificationType.apply _)
  }
  final implicit val CreateWorkerBlockRequestDecoder: io.circe.Decoder[models.CreateWorkerBlockRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[java.lang.String]("Reason")).mapN(models.CreateWorkerBlockRequest.apply _)
  }
  final implicit val RejectQualificationRequestResponseDecoder: io.circe.Decoder[models.RejectQualificationRequestResponse.type] = io.circe.Decoder.decodeUnit.as(models.RejectQualificationRequestResponse)
  final implicit val UpdateExpirationForHITResponseDecoder: io.circe.Decoder[models.UpdateExpirationForHITResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateExpirationForHITResponse)
  final implicit val ApproveAssignmentResponseDecoder: io.circe.Decoder[models.ApproveAssignmentResponse.type] = io.circe.Decoder.decodeUnit.as(models.ApproveAssignmentResponse)
  final implicit val AcceptQualificationRequestRequestDecoder: io.circe.Decoder[models.AcceptQualificationRequestRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationRequestId"), o.get[scala.Option[scala.Int]]("IntegerValue")).mapN(models.AcceptQualificationRequestRequest.apply _)
  }
  final implicit val ListQualificationTypesRequestDecoder: io.circe.Decoder[models.ListQualificationTypesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("MustBeRequestable"), o.get[scala.Option[scala.Boolean]]("MustBeOwnedByCaller"), o.get[scala.Option[java.lang.String]]("Query"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListQualificationTypesRequest.apply _)
  }
  final implicit val RequestErrorDecoder: io.circe.Decoder[models.RequestError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("TurkErrorCode")).mapN(models.RequestError.apply _)
  }
  final implicit val ListQualificationRequestsResponseDecoder: io.circe.Decoder[models.ListQualificationRequestsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[models.QualificationRequest]]]("QualificationRequests")).mapN(models.ListQualificationRequestsResponse.apply _)
  }
  final implicit val GetHITResponseDecoder: io.circe.Decoder[models.GetHITResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.HIT]]("HIT").map(models.GetHITResponse.apply _)
  }
  final implicit val SendBonusRequestDecoder: io.circe.Decoder[models.SendBonusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[java.lang.String]("AssignmentId"), o.get[java.lang.String]("Reason"), o.get[java.lang.String]("BonusAmount"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken")).mapN(models.SendBonusRequest.apply _)
  }
  final implicit val ListQualificationRequestsRequestDecoder: io.circe.Decoder[models.ListQualificationRequestsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListQualificationRequestsRequest.apply _)
  }
  final implicit val GetQualificationScoreRequestDecoder: io.circe.Decoder[models.GetQualificationScoreRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[java.lang.String]("WorkerId")).mapN(models.GetQualificationScoreRequest.apply _)
  }
  final implicit val CreateAdditionalAssignmentsForHITResponseDecoder: io.circe.Decoder[models.CreateAdditionalAssignmentsForHITResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateAdditionalAssignmentsForHITResponse)
  final implicit val GetHITRequestDecoder: io.circe.Decoder[models.GetHITRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HITId").map(models.GetHITRequest.apply _)
  }
  final implicit val GetQualificationTypeResponseDecoder: io.circe.Decoder[models.GetQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.QualificationType]]("QualificationType").map(models.GetQualificationTypeResponse.apply _)
  }
  final implicit val CreateQualificationTypeResponseDecoder: io.circe.Decoder[models.CreateQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.QualificationType]]("QualificationType").map(models.CreateQualificationTypeResponse.apply _)
  }
  final implicit val AcceptQualificationRequestResponseDecoder: io.circe.Decoder[models.AcceptQualificationRequestResponse.type] = io.circe.Decoder.decodeUnit.as(models.AcceptQualificationRequestResponse)
}