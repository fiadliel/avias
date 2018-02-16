package avias.mechanicalturkrequester
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val GetQualificationScoreResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetQualificationScoreResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Qualification" -> o.qualification.asJson)
  }
  final implicit val ListBonusPaymentsResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListBonusPaymentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NumResults" -> o.numResults.asJson, "NextToken" -> o.nextToken.asJson, "BonusPayments" -> o.bonusPayments.asJson)
  }
  final implicit val ListBonusPaymentsRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListBonusPaymentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "AssignmentId" -> o.assignmentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val GetQualificationTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson)
  }
  final implicit val UpdateQualificationTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationType" -> o.qualificationType.asJson)
  }
  final implicit val CreateWorkerBlockResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateWorkerBlockResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReviewActionDetailEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ReviewActionDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ActionId" -> o.actionId.asJson, "TargetId" -> o.targetId.asJson, "ActionName" -> o.actionName.asJson, "TargetType" -> o.targetType.asJson, "Result" -> o.result.asJson, "ErrorCode" -> o.errorCode.asJson, "Status" -> o.status.asJson, "CompleteTime" -> o.completeTime.asJson)
  }
  final implicit val HITEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.HIT] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "HITTypeId" -> o.hittypeId.asJson, "HITGroupId" -> o.hitgroupId.asJson, "HITLayoutId" -> o.hitlayoutId.asJson, "CreationTime" -> o.creationTime.asJson, "Expiration" -> o.expiration.asJson, "AutoApprovalDelayInSeconds" -> o.autoApprovalDelayInSeconds.asJson, "AssignmentDurationInSeconds" -> o.assignmentDurationInSeconds.asJson, "Keywords" -> o.keywords.asJson, "RequesterAnnotation" -> o.requesterAnnotation.asJson, "Question" -> o.question.asJson, "Title" -> o.title.asJson, "Description" -> o.description.asJson, "HITReviewStatus" -> o.hitreviewStatus.asJson, "HITStatus" -> o.hitstatus.asJson, "MaxAssignments" -> o.maxAssignments.asJson, "NumberOfAssignmentsPending" -> o.numberOfAssignmentsPending.asJson, "NumberOfAssignmentsAvailable" -> o.numberOfAssignmentsAvailable.asJson, "NumberOfAssignmentsCompleted" -> o.numberOfAssignmentsCompleted.asJson, "Reward" -> o.reward.asJson, "QualificationRequirements" -> o.qualificationRequirements.asJson)
  }
  final implicit val RejectAssignmentRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.RejectAssignmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson, "RequesterFeedback" -> o.requesterFeedback.asJson)
  }
  final implicit val AssignmentEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.Assignment] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "AssignmentId" -> o.assignmentId.asJson, "HITId" -> o.hitid.asJson, "AcceptTime" -> o.acceptTime.asJson, "RejectionTime" -> o.rejectionTime.asJson, "Deadline" -> o.deadline.asJson, "SubmitTime" -> o.submitTime.asJson, "AutoApprovalTime" -> o.autoApprovalTime.asJson, "ApprovalTime" -> o.approvalTime.asJson, "Answer" -> o.answer.asJson, "RequesterFeedback" -> o.requesterFeedback.asJson, "AssignmentStatus" -> o.assignmentStatus.asJson)
  }
  final implicit val DeleteWorkerBlockResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DeleteWorkerBlockResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ReviewPolicyEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ReviewPolicy] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyName" -> o.policyName.asJson, "Parameters" -> o.parameters.asJson)
  }
  final implicit val ListWorkerBlocksResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListWorkerBlocksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "WorkerBlocks" -> o.workerBlocks.asJson)
  }
  final implicit val UpdateHITReviewStatusResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateHITReviewStatusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val HITLayoutParameterEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.HITLayoutParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ReviewResultDetailEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ReviewResultDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ActionId" -> o.actionId.asJson, "SubjectId" -> o.subjectId.asJson, "QuestionId" -> o.questionId.asJson, "SubjectType" -> o.subjectType.asJson, "Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListHITsForQualificationTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListHITsForQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "HITs" -> o.hits.asJson)
  }
  final implicit val GetAssignmentRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetAssignmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson)
  }
  final implicit val CreateQualificationTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Description" -> o.description.asJson, "QualificationTypeStatus" -> o.qualificationTypeStatus.asJson, "RetryDelayInSeconds" -> o.retryDelayInSeconds.asJson, "TestDurationInSeconds" -> o.testDurationInSeconds.asJson, "Keywords" -> o.keywords.asJson, "AnswerKey" -> o.answerKey.asJson, "Test" -> o.test.asJson, "AutoGrantedValue" -> o.autoGrantedValue.asJson, "AutoGranted" -> o.autoGranted.asJson)
  }
  final implicit val DisassociateQualificationFromWorkerRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DisassociateQualificationFromWorkerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "QualificationTypeId" -> o.qualificationTypeId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val LocaleEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.Locale] = io.circe.Encoder.instance { o => 
    Json.obj("Country" -> o.country.asJson, "Subdivision" -> o.subdivision.asJson)
  }
  final implicit val GetAssignmentResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetAssignmentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Assignment" -> o.assignment.asJson, "HIT" -> o.hit.asJson)
  }
  final implicit val DeleteQualificationTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DeleteQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson)
  }
  final implicit val CreateHITWithHITTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateHITWithHITTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson, "LifetimeInSeconds" -> o.lifetimeInSeconds.asJson, "HITLayoutId" -> o.hitlayoutId.asJson, "AssignmentReviewPolicy" -> o.assignmentReviewPolicy.asJson, "HITReviewPolicy" -> o.hitreviewPolicy.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson, "Question" -> o.question.asJson, "RequesterAnnotation" -> o.requesterAnnotation.asJson, "HITLayoutParameters" -> o.hitlayoutParameters.asJson, "MaxAssignments" -> o.maxAssignments.asJson)
  }
  final implicit val ListAssignmentsForHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListAssignmentsForHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "Assignments" -> o.assignments.asJson)
  }
  final implicit val DisassociateQualificationFromWorkerResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DisassociateQualificationFromWorkerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AssociateQualificationWithWorkerRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.AssociateQualificationWithWorkerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "WorkerId" -> o.workerId.asJson, "IntegerValue" -> o.integerValue.asJson, "SendNotification" -> o.sendNotification.asJson)
  }
  final implicit val CreateHITTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateHITTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson)
  }
  final implicit val ListWorkersWithQualificationTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListWorkersWithQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "Status" -> o.status.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ReviewReportEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ReviewReport] = io.circe.Encoder.instance { o => 
    Json.obj("ReviewResults" -> o.reviewResults.asJson, "ReviewActions" -> o.reviewActions.asJson)
  }
  final implicit val CreateHITWithHITTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateHITWithHITTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HIT" -> o.hit.asJson)
  }
  final implicit val UpdateHITTypeOfHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateHITTypeOfHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "HITTypeId" -> o.hittypeId.asJson)
  }
  final implicit val SendBonusResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.SendBonusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ParameterMapEntryEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ParameterMapEntry] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson)
  }
  final implicit val UpdateNotificationSettingsRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateNotificationSettingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson, "Notification" -> o.notification.asJson, "Active" -> o.active.asJson)
  }
  final implicit val GetFileUploadURLRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetFileUploadURLRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson, "QuestionIdentifier" -> o.questionIdentifier.asJson)
  }
  final implicit val ListReviewPolicyResultsForHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListReviewPolicyResultsForHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "AssignmentReviewPolicy" -> o.assignmentReviewPolicy.asJson, "HITReviewPolicy" -> o.hitreviewPolicy.asJson, "AssignmentReviewReport" -> o.assignmentReviewReport.asJson, "HITReviewReport" -> o.hitreviewReport.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ApproveAssignmentRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ApproveAssignmentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentId" -> o.assignmentId.asJson, "RequesterFeedback" -> o.requesterFeedback.asJson, "OverrideRejection" -> o.overrideRejection.asJson)
  }
  final implicit val WorkerBlockEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.WorkerBlock] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val CreateAdditionalAssignmentsForHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateAdditionalAssignmentsForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "NumberOfAdditionalAssignments" -> o.numberOfAdditionalAssignments.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson)
  }
  final implicit val NotifyWorkersFailureStatusEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.NotifyWorkersFailureStatus] = io.circe.Encoder.instance { o => 
    Json.obj("NotifyWorkersFailureCode" -> o.notifyWorkersFailureCode.asJson, "NotifyWorkersFailureMessage" -> o.notifyWorkersFailureMessage.asJson, "WorkerId" -> o.workerId.asJson)
  }
  final implicit val ListReviewableHITsRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListReviewableHITsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITTypeId" -> o.hittypeId.asJson, "Status" -> o.status.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DeleteHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetAccountBalanceRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetAccountBalanceRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListHITsResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListHITsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "HITs" -> o.hits.asJson)
  }
  final implicit val UpdateHITTypeOfHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateHITTypeOfHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetFileUploadURLResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetFileUploadURLResponse] = io.circe.Encoder.instance { o => 
    Json.obj("FileUploadURL" -> o.fileUploadURL.asJson)
  }
  final implicit val CreateHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("LifetimeInSeconds" -> o.lifetimeInSeconds.asJson, "AssignmentDurationInSeconds" -> o.assignmentDurationInSeconds.asJson, "Title" -> o.title.asJson, "Description" -> o.description.asJson, "Reward" -> o.reward.asJson, "HITLayoutId" -> o.hitlayoutId.asJson, "AssignmentReviewPolicy" -> o.assignmentReviewPolicy.asJson, "HITReviewPolicy" -> o.hitreviewPolicy.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson, "AutoApprovalDelayInSeconds" -> o.autoApprovalDelayInSeconds.asJson, "Keywords" -> o.keywords.asJson, "RequesterAnnotation" -> o.requesterAnnotation.asJson, "Question" -> o.question.asJson, "HITLayoutParameters" -> o.hitlayoutParameters.asJson, "MaxAssignments" -> o.maxAssignments.asJson, "QualificationRequirements" -> o.qualificationRequirements.asJson)
  }
  final implicit val DeleteQualificationTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DeleteQualificationTypeResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateQualificationTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "TestDurationInSeconds" -> o.testDurationInSeconds.asJson, "RetryDelayInSeconds" -> o.retryDelayInSeconds.asJson, "Description" -> o.description.asJson, "Test" -> o.test.asJson, "AnswerKey" -> o.answerKey.asJson, "QualificationTypeStatus" -> o.qualificationTypeStatus.asJson, "AutoGrantedValue" -> o.autoGrantedValue.asJson, "AutoGranted" -> o.autoGranted.asJson)
  }
  final implicit val QualificationEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.Qualification] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "QualificationTypeId" -> o.qualificationTypeId.asJson, "GrantTime" -> o.grantTime.asJson, "LocaleValue" -> o.localeValue.asJson, "Status" -> o.status.asJson, "IntegerValue" -> o.integerValue.asJson)
  }
  final implicit val UpdateExpirationForHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateExpirationForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "ExpireAt" -> o.expireAt.asJson)
  }
  final implicit val RejectQualificationRequestRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.RejectQualificationRequestRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationRequestId" -> o.qualificationRequestId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateHITReviewStatusRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateHITReviewStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "Revert" -> o.revert.asJson)
  }
  final implicit val ListWorkerBlocksRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListWorkerBlocksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListWorkersWithQualificationTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListWorkersWithQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "Qualifications" -> o.qualifications.asJson)
  }
  final implicit val CreateHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HIT" -> o.hit.asJson)
  }
  final implicit val ListAssignmentsForHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListAssignmentsForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson, "AssignmentStatuses" -> o.assignmentStatuses.asJson)
  }
  final implicit val SendTestEventNotificationRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.SendTestEventNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "TestEventType" -> o.testEventType.asJson)
  }
  final implicit val ListQualificationTypesResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListQualificationTypesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NumResults" -> o.numResults.asJson, "NextToken" -> o.nextToken.asJson, "QualificationTypes" -> o.qualificationTypes.asJson)
  }
  final implicit val CreateHITTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateHITTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AssignmentDurationInSeconds" -> o.assignmentDurationInSeconds.asJson, "Reward" -> o.reward.asJson, "Title" -> o.title.asJson, "Description" -> o.description.asJson, "AutoApprovalDelayInSeconds" -> o.autoApprovalDelayInSeconds.asJson, "Keywords" -> o.keywords.asJson, "QualificationRequirements" -> o.qualificationRequirements.asJson)
  }
  final implicit val NotifyWorkersResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.NotifyWorkersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NotifyWorkersFailureStatuses" -> o.notifyWorkersFailureStatuses.asJson)
  }
  final implicit val PolicyParameterEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.PolicyParameter] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Values" -> o.values.asJson, "MapEntries" -> o.mapEntries.asJson)
  }
  final implicit val ListReviewPolicyResultsForHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListReviewPolicyResultsForHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson, "NextToken" -> o.nextToken.asJson, "RetrieveActions" -> o.retrieveActions.asJson, "RetrieveResults" -> o.retrieveResults.asJson, "PolicyLevels" -> o.policyLevels.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeleteWorkerBlockRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DeleteWorkerBlockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateNotificationSettingsResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateNotificationSettingsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val QualificationRequirementEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.QualificationRequirement] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "Comparator" -> o.comparator.asJson, "LocaleValues" -> o.localeValues.asJson, "RequiredToPreview" -> o.requiredToPreview.asJson, "IntegerValues" -> o.integerValues.asJson)
  }
  final implicit val GetAccountBalanceResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetAccountBalanceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AvailableBalance" -> o.availableBalance.asJson, "OnHoldBalance" -> o.onHoldBalance.asJson)
  }
  final implicit val RejectAssignmentResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.RejectAssignmentResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ServiceFaultEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ServiceFault] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "TurkErrorCode" -> o.turkErrorCode.asJson)
  }
  final implicit val NotificationSpecificationEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.NotificationSpecification] = io.circe.Encoder.instance { o => 
    Json.obj("Destination" -> o.destination.asJson, "Version" -> o.version.asJson, "Transport" -> o.transport.asJson, "EventTypes" -> o.eventTypes.asJson)
  }
  final implicit val AssociateQualificationWithWorkerResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.AssociateQualificationWithWorkerResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val QualificationRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.QualificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationRequestId" -> o.qualificationRequestId.asJson, "Test" -> o.test.asJson, "Answer" -> o.answer.asJson, "QualificationTypeId" -> o.qualificationTypeId.asJson, "WorkerId" -> o.workerId.asJson, "SubmitTime" -> o.submitTime.asJson)
  }
  final implicit val ListHITsRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListHITsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListReviewableHITsResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListReviewableHITsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "NumResults" -> o.numResults.asJson, "HITs" -> o.hits.asJson)
  }
  final implicit val NotifyWorkersRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.NotifyWorkersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Subject" -> o.subject.asJson, "MessageText" -> o.messageText.asJson, "WorkerIds" -> o.workerIds.asJson)
  }
  final implicit val ListHITsForQualificationTypeRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListHITsForQualificationTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val SendTestEventNotificationResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.SendTestEventNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BonusPaymentEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.BonusPayment] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "AssignmentId" -> o.assignmentId.asJson, "GrantTime" -> o.grantTime.asJson, "Reason" -> o.reason.asJson, "BonusAmount" -> o.bonusAmount.asJson)
  }
  final implicit val DeleteHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.DeleteHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson)
  }
  final implicit val QualificationTypeEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.QualificationType] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "CreationTime" -> o.creationTime.asJson, "TestDurationInSeconds" -> o.testDurationInSeconds.asJson, "RetryDelayInSeconds" -> o.retryDelayInSeconds.asJson, "Keywords" -> o.keywords.asJson, "AnswerKey" -> o.answerKey.asJson, "Name" -> o.name.asJson, "Test" -> o.test.asJson, "Description" -> o.description.asJson, "QualificationTypeStatus" -> o.qualificationTypeStatus.asJson, "AutoGrantedValue" -> o.autoGrantedValue.asJson, "IsRequestable" -> o.isRequestable.asJson, "AutoGranted" -> o.autoGranted.asJson)
  }
  final implicit val CreateWorkerBlockRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateWorkerBlockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val RejectQualificationRequestResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.RejectQualificationRequestResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateExpirationForHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.UpdateExpirationForHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ApproveAssignmentResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ApproveAssignmentResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AcceptQualificationRequestRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.AcceptQualificationRequestRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationRequestId" -> o.qualificationRequestId.asJson, "IntegerValue" -> o.integerValue.asJson)
  }
  final implicit val ListQualificationTypesRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListQualificationTypesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MustBeRequestable" -> o.mustBeRequestable.asJson, "MustBeOwnedByCaller" -> o.mustBeOwnedByCaller.asJson, "Query" -> o.query.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val RequestErrorEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.RequestError] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "TurkErrorCode" -> o.turkErrorCode.asJson)
  }
  final implicit val ListQualificationRequestsResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListQualificationRequestsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NumResults" -> o.numResults.asJson, "NextToken" -> o.nextToken.asJson, "QualificationRequests" -> o.qualificationRequests.asJson)
  }
  final implicit val GetHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetHITResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HIT" -> o.hit.asJson)
  }
  final implicit val SendBonusRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.SendBonusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("WorkerId" -> o.workerId.asJson, "AssignmentId" -> o.assignmentId.asJson, "Reason" -> o.reason.asJson, "BonusAmount" -> o.bonusAmount.asJson, "UniqueRequestToken" -> o.uniqueRequestToken.asJson)
  }
  final implicit val ListQualificationRequestsRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.ListQualificationRequestsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val GetQualificationScoreRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetQualificationScoreRequest] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationTypeId" -> o.qualificationTypeId.asJson, "WorkerId" -> o.workerId.asJson)
  }
  final implicit val CreateAdditionalAssignmentsForHITResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateAdditionalAssignmentsForHITResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetHITRequestEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetHITRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HITId" -> o.hitid.asJson)
  }
  final implicit val GetQualificationTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.GetQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationType" -> o.qualificationType.asJson)
  }
  final implicit val CreateQualificationTypeResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.CreateQualificationTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("QualificationType" -> o.qualificationType.asJson)
  }
  final implicit val AcceptQualificationRequestResponseEncoder: io.circe.Encoder[avias.mechanicalturkrequester.models.AcceptQualificationRequestResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetQualificationScoreResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetQualificationScoreResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.Qualification]]("Qualification").map(avias.mechanicalturkrequester.models.GetQualificationScoreResponse.apply _)
  }
  final implicit val ListBonusPaymentsResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListBonusPaymentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.BonusPayment]]]("BonusPayments")).mapN(avias.mechanicalturkrequester.models.ListBonusPaymentsResponse.apply _)
  }
  final implicit val ListBonusPaymentsRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListBonusPaymentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[java.lang.String]]("AssignmentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListBonusPaymentsRequest.apply _)
  }
  final implicit val GetQualificationTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QualificationTypeId").map(avias.mechanicalturkrequester.models.GetQualificationTypeRequest.apply _)
  }
  final implicit val UpdateQualificationTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.QualificationType]]("QualificationType").map(avias.mechanicalturkrequester.models.UpdateQualificationTypeResponse.apply _)
  }
  final implicit val CreateWorkerBlockResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateWorkerBlockResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.CreateWorkerBlockResponse)
  final implicit val ReviewActionDetailDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ReviewActionDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionId"), o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("ActionName"), o.get[scala.Option[java.lang.String]]("TargetType"), o.get[scala.Option[java.lang.String]]("Result"), o.get[scala.Option[java.lang.String]]("ErrorCode"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.time.Instant]]("CompleteTime")).mapN(avias.mechanicalturkrequester.models.ReviewActionDetail.apply _)
  }
  final implicit val HITDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.HIT] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[java.lang.String]]("HITTypeId"), o.get[scala.Option[java.lang.String]]("HITGroupId"), o.get[scala.Option[java.lang.String]]("HITLayoutId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[java.time.Instant]]("Expiration"), o.get[scala.Option[scala.Long]]("AutoApprovalDelayInSeconds"), o.get[scala.Option[scala.Long]]("AssignmentDurationInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("RequesterAnnotation"), o.get[scala.Option[java.lang.String]]("Question"), o.get[scala.Option[java.lang.String]]("Title"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("HITReviewStatus"), o.get[scala.Option[java.lang.String]]("HITStatus"), o.get[scala.Option[scala.Int]]("MaxAssignments"), o.get[scala.Option[scala.Int]]("NumberOfAssignmentsPending"), o.get[scala.Option[scala.Int]]("NumberOfAssignmentsAvailable"), o.get[scala.Option[scala.Int]]("NumberOfAssignmentsCompleted"), o.get[scala.Option[java.lang.String]]("Reward"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequirement]]]("QualificationRequirements")).mapN(avias.mechanicalturkrequester.models.HIT.apply _)
  }
  final implicit val RejectAssignmentRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.RejectAssignmentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssignmentId"), o.get[java.lang.String]("RequesterFeedback")).mapN(avias.mechanicalturkrequester.models.RejectAssignmentRequest.apply _)
  }
  final implicit val AssignmentDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.Assignment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("AssignmentId"), o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[java.time.Instant]]("AcceptTime"), o.get[scala.Option[java.time.Instant]]("RejectionTime"), o.get[scala.Option[java.time.Instant]]("Deadline"), o.get[scala.Option[java.time.Instant]]("SubmitTime"), o.get[scala.Option[java.time.Instant]]("AutoApprovalTime"), o.get[scala.Option[java.time.Instant]]("ApprovalTime"), o.get[scala.Option[java.lang.String]]("Answer"), o.get[scala.Option[java.lang.String]]("RequesterFeedback"), o.get[scala.Option[java.lang.String]]("AssignmentStatus")).mapN(avias.mechanicalturkrequester.models.Assignment.apply _)
  }
  final implicit val DeleteWorkerBlockResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DeleteWorkerBlockResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.DeleteWorkerBlockResponse)
  final implicit val ReviewPolicyDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ReviewPolicy] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyName"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.PolicyParameter]]]("Parameters")).mapN(avias.mechanicalturkrequester.models.ReviewPolicy.apply _)
  }
  final implicit val ListWorkerBlocksResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListWorkerBlocksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.WorkerBlock]]]("WorkerBlocks")).mapN(avias.mechanicalturkrequester.models.ListWorkerBlocksResponse.apply _)
  }
  final implicit val UpdateHITReviewStatusResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateHITReviewStatusResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.UpdateHITReviewStatusResponse)
  final implicit val HITLayoutParameterDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.HITLayoutParameter] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Value")).mapN(avias.mechanicalturkrequester.models.HITLayoutParameter.apply _)
  }
  final implicit val ReviewResultDetailDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ReviewResultDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionId"), o.get[scala.Option[java.lang.String]]("SubjectId"), o.get[scala.Option[java.lang.String]]("QuestionId"), o.get[scala.Option[java.lang.String]]("SubjectType"), o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.mechanicalturkrequester.models.ReviewResultDetail.apply _)
  }
  final implicit val ListHITsForQualificationTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListHITsForQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.HIT]]]("HITs")).mapN(avias.mechanicalturkrequester.models.ListHITsForQualificationTypeResponse.apply _)
  }
  final implicit val GetAssignmentRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetAssignmentRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AssignmentId").map(avias.mechanicalturkrequester.models.GetAssignmentRequest.apply _)
  }
  final implicit val CreateQualificationTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("QualificationTypeStatus"), o.get[scala.Option[scala.Long]]("RetryDelayInSeconds"), o.get[scala.Option[scala.Long]]("TestDurationInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("AnswerKey"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[scala.Int]]("AutoGrantedValue"), o.get[scala.Option[scala.Boolean]]("AutoGranted")).mapN(avias.mechanicalturkrequester.models.CreateQualificationTypeRequest.apply _)
  }
  final implicit val DisassociateQualificationFromWorkerRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DisassociateQualificationFromWorkerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.mechanicalturkrequester.models.DisassociateQualificationFromWorkerRequest.apply _)
  }
  final implicit val LocaleDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.Locale] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Country"), o.get[scala.Option[java.lang.String]]("Subdivision")).mapN(avias.mechanicalturkrequester.models.Locale.apply _)
  }
  final implicit val GetAssignmentResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetAssignmentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.mechanicalturkrequester.models.Assignment]]("Assignment"), o.get[scala.Option[avias.mechanicalturkrequester.models.HIT]]("HIT")).mapN(avias.mechanicalturkrequester.models.GetAssignmentResponse.apply _)
  }
  final implicit val DeleteQualificationTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DeleteQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("QualificationTypeId").map(avias.mechanicalturkrequester.models.DeleteQualificationTypeRequest.apply _)
  }
  final implicit val CreateHITWithHITTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateHITWithHITTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITTypeId"), o.get[scala.Long]("LifetimeInSeconds"), o.get[scala.Option[java.lang.String]]("HITLayoutId"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy]]("AssignmentReviewPolicy"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy]]("HITReviewPolicy"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken"), o.get[scala.Option[java.lang.String]]("Question"), o.get[scala.Option[java.lang.String]]("RequesterAnnotation"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.HITLayoutParameter]]]("HITLayoutParameters"), o.get[scala.Option[scala.Int]]("MaxAssignments")).mapN(avias.mechanicalturkrequester.models.CreateHITWithHITTypeRequest.apply _)
  }
  final implicit val ListAssignmentsForHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListAssignmentsForHITResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.Assignment]]]("Assignments")).mapN(avias.mechanicalturkrequester.models.ListAssignmentsForHITResponse.apply _)
  }
  final implicit val DisassociateQualificationFromWorkerResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DisassociateQualificationFromWorkerResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.DisassociateQualificationFromWorkerResponse)
  final implicit val AssociateQualificationWithWorkerRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.AssociateQualificationWithWorkerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[java.lang.String]("WorkerId"), o.get[scala.Option[scala.Int]]("IntegerValue"), o.get[scala.Option[scala.Boolean]]("SendNotification")).mapN(avias.mechanicalturkrequester.models.AssociateQualificationWithWorkerRequest.apply _)
  }
  final implicit val CreateHITTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateHITTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HITTypeId").map(avias.mechanicalturkrequester.models.CreateHITTypeResponse.apply _)
  }
  final implicit val ListWorkersWithQualificationTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListWorkersWithQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListWorkersWithQualificationTypeRequest.apply _)
  }
  final implicit val ReviewReportDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ReviewReport] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.ReviewResultDetail]]]("ReviewResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.ReviewActionDetail]]]("ReviewActions")).mapN(avias.mechanicalturkrequester.models.ReviewReport.apply _)
  }
  final implicit val CreateHITWithHITTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateHITWithHITTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.HIT]]("HIT").map(avias.mechanicalturkrequester.models.CreateHITWithHITTypeResponse.apply _)
  }
  final implicit val UpdateHITTypeOfHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateHITTypeOfHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[java.lang.String]("HITTypeId")).mapN(avias.mechanicalturkrequester.models.UpdateHITTypeOfHITRequest.apply _)
  }
  final implicit val SendBonusResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.SendBonusResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.SendBonusResponse)
  final implicit val ParameterMapEntryDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ParameterMapEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values")).mapN(avias.mechanicalturkrequester.models.ParameterMapEntry.apply _)
  }
  final implicit val UpdateNotificationSettingsRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateNotificationSettingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITTypeId"), o.get[scala.Option[avias.mechanicalturkrequester.models.NotificationSpecification]]("Notification"), o.get[scala.Option[scala.Boolean]]("Active")).mapN(avias.mechanicalturkrequester.models.UpdateNotificationSettingsRequest.apply _)
  }
  final implicit val GetFileUploadURLRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetFileUploadURLRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssignmentId"), o.get[java.lang.String]("QuestionIdentifier")).mapN(avias.mechanicalturkrequester.models.GetFileUploadURLRequest.apply _)
  }
  final implicit val ListReviewPolicyResultsForHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListReviewPolicyResultsForHITResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITId"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy]]("AssignmentReviewPolicy"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy]]("HITReviewPolicy"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewReport]]("AssignmentReviewReport"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewReport]]("HITReviewReport"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.mechanicalturkrequester.models.ListReviewPolicyResultsForHITResponse.apply _)
  }
  final implicit val ApproveAssignmentRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ApproveAssignmentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AssignmentId"), o.get[scala.Option[java.lang.String]]("RequesterFeedback"), o.get[scala.Option[scala.Boolean]]("OverrideRejection")).mapN(avias.mechanicalturkrequester.models.ApproveAssignmentRequest.apply _)
  }
  final implicit val WorkerBlockDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.WorkerBlock] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.mechanicalturkrequester.models.WorkerBlock.apply _)
  }
  final implicit val CreateAdditionalAssignmentsForHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateAdditionalAssignmentsForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Int]("NumberOfAdditionalAssignments"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken")).mapN(avias.mechanicalturkrequester.models.CreateAdditionalAssignmentsForHITRequest.apply _)
  }
  final implicit val NotifyWorkersFailureStatusDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.NotifyWorkersFailureStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NotifyWorkersFailureCode"), o.get[scala.Option[java.lang.String]]("NotifyWorkersFailureMessage"), o.get[scala.Option[java.lang.String]]("WorkerId")).mapN(avias.mechanicalturkrequester.models.NotifyWorkersFailureStatus.apply _)
  }
  final implicit val ListReviewableHITsRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListReviewableHITsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HITTypeId"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListReviewableHITsRequest.apply _)
  }
  final implicit val DeleteHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DeleteHITResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.DeleteHITResponse)
  final implicit val GetAccountBalanceRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetAccountBalanceRequest.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.GetAccountBalanceRequest)
  final implicit val ListHITsResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListHITsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.HIT]]]("HITs")).mapN(avias.mechanicalturkrequester.models.ListHITsResponse.apply _)
  }
  final implicit val UpdateHITTypeOfHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateHITTypeOfHITResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.UpdateHITTypeOfHITResponse)
  final implicit val GetFileUploadURLResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetFileUploadURLResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileUploadURL").map(avias.mechanicalturkrequester.models.GetFileUploadURLResponse.apply _)
  }
  final implicit val CreateHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("LifetimeInSeconds"), o.get[scala.Long]("AssignmentDurationInSeconds"), o.get[java.lang.String]("Title"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("Reward"), o.get[scala.Option[java.lang.String]]("HITLayoutId"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy]]("AssignmentReviewPolicy"), o.get[scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy]]("HITReviewPolicy"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken"), o.get[scala.Option[scala.Long]]("AutoApprovalDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("RequesterAnnotation"), o.get[scala.Option[java.lang.String]]("Question"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.HITLayoutParameter]]]("HITLayoutParameters"), o.get[scala.Option[scala.Int]]("MaxAssignments"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequirement]]]("QualificationRequirements")).mapN(avias.mechanicalturkrequester.models.CreateHITRequest.apply _)
  }
  final implicit val DeleteQualificationTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DeleteQualificationTypeResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.DeleteQualificationTypeResponse)
  final implicit val UpdateQualificationTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[scala.Long]]("TestDurationInSeconds"), o.get[scala.Option[scala.Long]]("RetryDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[java.lang.String]]("AnswerKey"), o.get[scala.Option[java.lang.String]]("QualificationTypeStatus"), o.get[scala.Option[scala.Int]]("AutoGrantedValue"), o.get[scala.Option[scala.Boolean]]("AutoGranted")).mapN(avias.mechanicalturkrequester.models.UpdateQualificationTypeRequest.apply _)
  }
  final implicit val QualificationDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.Qualification] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.time.Instant]]("GrantTime"), o.get[scala.Option[avias.mechanicalturkrequester.models.Locale]]("LocaleValue"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[scala.Int]]("IntegerValue")).mapN(avias.mechanicalturkrequester.models.Qualification.apply _)
  }
  final implicit val UpdateExpirationForHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateExpirationForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[java.time.Instant]("ExpireAt")).mapN(avias.mechanicalturkrequester.models.UpdateExpirationForHITRequest.apply _)
  }
  final implicit val RejectQualificationRequestRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.RejectQualificationRequestRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationRequestId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.mechanicalturkrequester.models.RejectQualificationRequestRequest.apply _)
  }
  final implicit val UpdateHITReviewStatusRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateHITReviewStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Option[scala.Boolean]]("Revert")).mapN(avias.mechanicalturkrequester.models.UpdateHITReviewStatusRequest.apply _)
  }
  final implicit val ListWorkerBlocksRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListWorkerBlocksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListWorkerBlocksRequest.apply _)
  }
  final implicit val ListWorkersWithQualificationTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListWorkersWithQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.Qualification]]]("Qualifications")).mapN(avias.mechanicalturkrequester.models.ListWorkersWithQualificationTypeResponse.apply _)
  }
  final implicit val CreateHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateHITResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.HIT]]("HIT").map(avias.mechanicalturkrequester.models.CreateHITResponse.apply _)
  }
  final implicit val ListAssignmentsForHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListAssignmentsForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[scala.List[java.lang.String]]]("AssignmentStatuses")).mapN(avias.mechanicalturkrequester.models.ListAssignmentsForHITRequest.apply _)
  }
  final implicit val SendTestEventNotificationRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.SendTestEventNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.mechanicalturkrequester.models.NotificationSpecification]("Notification"), o.get[java.lang.String]("TestEventType")).mapN(avias.mechanicalturkrequester.models.SendTestEventNotificationRequest.apply _)
  }
  final implicit val ListQualificationTypesResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListQualificationTypesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationType]]]("QualificationTypes")).mapN(avias.mechanicalturkrequester.models.ListQualificationTypesResponse.apply _)
  }
  final implicit val CreateHITTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateHITTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("AssignmentDurationInSeconds"), o.get[java.lang.String]("Reward"), o.get[java.lang.String]("Title"), o.get[java.lang.String]("Description"), o.get[scala.Option[scala.Long]]("AutoApprovalDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequirement]]]("QualificationRequirements")).mapN(avias.mechanicalturkrequester.models.CreateHITTypeRequest.apply _)
  }
  final implicit val NotifyWorkersResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.NotifyWorkersResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.NotifyWorkersFailureStatus]]]("NotifyWorkersFailureStatuses").map(avias.mechanicalturkrequester.models.NotifyWorkersResponse.apply _)
  }
  final implicit val PolicyParameterDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.PolicyParameter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[scala.List[java.lang.String]]]("Values"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.ParameterMapEntry]]]("MapEntries")).mapN(avias.mechanicalturkrequester.models.PolicyParameter.apply _)
  }
  final implicit val ListReviewPolicyResultsForHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListReviewPolicyResultsForHITRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HITId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Boolean]]("RetrieveActions"), o.get[scala.Option[scala.Boolean]]("RetrieveResults"), o.get[scala.Option[scala.List[java.lang.String]]]("PolicyLevels"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListReviewPolicyResultsForHITRequest.apply _)
  }
  final implicit val DeleteWorkerBlockRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DeleteWorkerBlockRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.mechanicalturkrequester.models.DeleteWorkerBlockRequest.apply _)
  }
  final implicit val UpdateNotificationSettingsResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateNotificationSettingsResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.UpdateNotificationSettingsResponse)
  final implicit val QualificationRequirementDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.QualificationRequirement] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[java.lang.String]("Comparator"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.Locale]]]("LocaleValues"), o.get[scala.Option[scala.Boolean]]("RequiredToPreview"), o.get[scala.Option[scala.List[scala.Int]]]("IntegerValues")).mapN(avias.mechanicalturkrequester.models.QualificationRequirement.apply _)
  }
  final implicit val GetAccountBalanceResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetAccountBalanceResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AvailableBalance"), o.get[scala.Option[java.lang.String]]("OnHoldBalance")).mapN(avias.mechanicalturkrequester.models.GetAccountBalanceResponse.apply _)
  }
  final implicit val RejectAssignmentResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.RejectAssignmentResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.RejectAssignmentResponse)
  final implicit val ServiceFaultDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ServiceFault] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("TurkErrorCode")).mapN(avias.mechanicalturkrequester.models.ServiceFault.apply _)
  }
  final implicit val NotificationSpecificationDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.NotificationSpecification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Destination"), o.get[java.lang.String]("Version"), o.get[java.lang.String]("Transport"), o.get[scala.List[java.lang.String]]("EventTypes")).mapN(avias.mechanicalturkrequester.models.NotificationSpecification.apply _)
  }
  final implicit val AssociateQualificationWithWorkerResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.AssociateQualificationWithWorkerResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.AssociateQualificationWithWorkerResponse)
  final implicit val QualificationRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.QualificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QualificationRequestId"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[java.lang.String]]("Answer"), o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.time.Instant]]("SubmitTime")).mapN(avias.mechanicalturkrequester.models.QualificationRequest.apply _)
  }
  final implicit val ListHITsRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListHITsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListHITsRequest.apply _)
  }
  final implicit val ListReviewableHITsResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListReviewableHITsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.HIT]]]("HITs")).mapN(avias.mechanicalturkrequester.models.ListReviewableHITsResponse.apply _)
  }
  final implicit val NotifyWorkersRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.NotifyWorkersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Subject"), o.get[java.lang.String]("MessageText"), o.get[scala.List[java.lang.String]]("WorkerIds")).mapN(avias.mechanicalturkrequester.models.NotifyWorkersRequest.apply _)
  }
  final implicit val ListHITsForQualificationTypeRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListHITsForQualificationTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListHITsForQualificationTypeRequest.apply _)
  }
  final implicit val SendTestEventNotificationResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.SendTestEventNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.SendTestEventNotificationResponse)
  final implicit val BonusPaymentDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.BonusPayment] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("WorkerId"), o.get[scala.Option[java.lang.String]]("AssignmentId"), o.get[scala.Option[java.time.Instant]]("GrantTime"), o.get[scala.Option[java.lang.String]]("Reason"), o.get[scala.Option[java.lang.String]]("BonusAmount")).mapN(avias.mechanicalturkrequester.models.BonusPayment.apply _)
  }
  final implicit val DeleteHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.DeleteHITRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HITId").map(avias.mechanicalturkrequester.models.DeleteHITRequest.apply _)
  }
  final implicit val QualificationTypeDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.QualificationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.time.Instant]]("CreationTime"), o.get[scala.Option[scala.Long]]("TestDurationInSeconds"), o.get[scala.Option[scala.Long]]("RetryDelayInSeconds"), o.get[scala.Option[java.lang.String]]("Keywords"), o.get[scala.Option[java.lang.String]]("AnswerKey"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Test"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("QualificationTypeStatus"), o.get[scala.Option[scala.Int]]("AutoGrantedValue"), o.get[scala.Option[scala.Boolean]]("IsRequestable"), o.get[scala.Option[scala.Boolean]]("AutoGranted")).mapN(avias.mechanicalturkrequester.models.QualificationType.apply _)
  }
  final implicit val CreateWorkerBlockRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateWorkerBlockRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[java.lang.String]("Reason")).mapN(avias.mechanicalturkrequester.models.CreateWorkerBlockRequest.apply _)
  }
  final implicit val RejectQualificationRequestResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.RejectQualificationRequestResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.RejectQualificationRequestResponse)
  final implicit val UpdateExpirationForHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.UpdateExpirationForHITResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.UpdateExpirationForHITResponse)
  final implicit val ApproveAssignmentResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ApproveAssignmentResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.ApproveAssignmentResponse)
  final implicit val AcceptQualificationRequestRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.AcceptQualificationRequestRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationRequestId"), o.get[scala.Option[scala.Int]]("IntegerValue")).mapN(avias.mechanicalturkrequester.models.AcceptQualificationRequestRequest.apply _)
  }
  final implicit val ListQualificationTypesRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListQualificationTypesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("MustBeRequestable"), o.get[scala.Option[scala.Boolean]]("MustBeOwnedByCaller"), o.get[scala.Option[java.lang.String]]("Query"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListQualificationTypesRequest.apply _)
  }
  final implicit val RequestErrorDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.RequestError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("TurkErrorCode")).mapN(avias.mechanicalturkrequester.models.RequestError.apply _)
  }
  final implicit val ListQualificationRequestsResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListQualificationRequestsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("NumResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequest]]]("QualificationRequests")).mapN(avias.mechanicalturkrequester.models.ListQualificationRequestsResponse.apply _)
  }
  final implicit val GetHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetHITResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.HIT]]("HIT").map(avias.mechanicalturkrequester.models.GetHITResponse.apply _)
  }
  final implicit val SendBonusRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.SendBonusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("WorkerId"), o.get[java.lang.String]("AssignmentId"), o.get[java.lang.String]("Reason"), o.get[java.lang.String]("BonusAmount"), o.get[scala.Option[java.lang.String]]("UniqueRequestToken")).mapN(avias.mechanicalturkrequester.models.SendBonusRequest.apply _)
  }
  final implicit val ListQualificationRequestsRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.ListQualificationRequestsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("QualificationTypeId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.mechanicalturkrequester.models.ListQualificationRequestsRequest.apply _)
  }
  final implicit val GetQualificationScoreRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetQualificationScoreRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("QualificationTypeId"), o.get[java.lang.String]("WorkerId")).mapN(avias.mechanicalturkrequester.models.GetQualificationScoreRequest.apply _)
  }
  final implicit val CreateAdditionalAssignmentsForHITResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateAdditionalAssignmentsForHITResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.CreateAdditionalAssignmentsForHITResponse)
  final implicit val GetHITRequestDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetHITRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HITId").map(avias.mechanicalturkrequester.models.GetHITRequest.apply _)
  }
  final implicit val GetQualificationTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.GetQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.QualificationType]]("QualificationType").map(avias.mechanicalturkrequester.models.GetQualificationTypeResponse.apply _)
  }
  final implicit val CreateQualificationTypeResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.CreateQualificationTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.mechanicalturkrequester.models.QualificationType]]("QualificationType").map(avias.mechanicalturkrequester.models.CreateQualificationTypeResponse.apply _)
  }
  final implicit val AcceptQualificationRequestResponseDecoder: io.circe.Decoder[avias.mechanicalturkrequester.models.AcceptQualificationRequestResponse.type] = io.circe.Decoder.decodeUnit.as(avias.mechanicalturkrequester.models.AcceptQualificationRequestResponse)
}