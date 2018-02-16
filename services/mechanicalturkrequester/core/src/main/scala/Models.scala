package avias.mechanicalturkrequester.models
final case class GetQualificationScoreResponse(qualification: scala.Option[avias.mechanicalturkrequester.models.Qualification] = scala.None)
final case class ListBonusPaymentsResponse(numResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, bonusPayments: scala.Option[scala.List[avias.mechanicalturkrequester.models.BonusPayment]] = scala.None)
final case class ListBonusPaymentsRequest(hitid: scala.Option[java.lang.String] = scala.None, assignmentId: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class GetQualificationTypeRequest(qualificationTypeId: java.lang.String)
final case class UpdateQualificationTypeResponse(qualificationType: scala.Option[avias.mechanicalturkrequester.models.QualificationType] = scala.None)
case object CreateWorkerBlockResponse
final case class ReviewActionDetail(actionId: scala.Option[java.lang.String] = scala.None, targetId: scala.Option[java.lang.String] = scala.None, actionName: scala.Option[java.lang.String] = scala.None, targetType: scala.Option[java.lang.String] = scala.None, result: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, completeTime: scala.Option[java.time.Instant] = scala.None)
final case class HIT(hitid: scala.Option[java.lang.String] = scala.None, hittypeId: scala.Option[java.lang.String] = scala.None, hitgroupId: scala.Option[java.lang.String] = scala.None, hitlayoutId: scala.Option[java.lang.String] = scala.None, creationTime: scala.Option[java.time.Instant] = scala.None, expiration: scala.Option[java.time.Instant] = scala.None, autoApprovalDelayInSeconds: scala.Option[scala.Long] = scala.None, assignmentDurationInSeconds: scala.Option[scala.Long] = scala.None, keywords: scala.Option[java.lang.String] = scala.None, requesterAnnotation: scala.Option[java.lang.String] = scala.None, question: scala.Option[java.lang.String] = scala.None, title: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, hitreviewStatus: scala.Option[java.lang.String] = scala.None, hitstatus: scala.Option[java.lang.String] = scala.None, maxAssignments: scala.Option[scala.Int] = scala.None, numberOfAssignmentsPending: scala.Option[scala.Int] = scala.None, numberOfAssignmentsAvailable: scala.Option[scala.Int] = scala.None, numberOfAssignmentsCompleted: scala.Option[scala.Int] = scala.None, reward: scala.Option[java.lang.String] = scala.None, qualificationRequirements: scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequirement]] = scala.None)
final case class RejectAssignmentRequest(assignmentId: java.lang.String, requesterFeedback: java.lang.String)
final case class Assignment(workerId: scala.Option[java.lang.String] = scala.None, assignmentId: scala.Option[java.lang.String] = scala.None, hitid: scala.Option[java.lang.String] = scala.None, acceptTime: scala.Option[java.time.Instant] = scala.None, rejectionTime: scala.Option[java.time.Instant] = scala.None, deadline: scala.Option[java.time.Instant] = scala.None, submitTime: scala.Option[java.time.Instant] = scala.None, autoApprovalTime: scala.Option[java.time.Instant] = scala.None, approvalTime: scala.Option[java.time.Instant] = scala.None, answer: scala.Option[java.lang.String] = scala.None, requesterFeedback: scala.Option[java.lang.String] = scala.None, assignmentStatus: scala.Option[java.lang.String] = scala.None)
case object DeleteWorkerBlockResponse
final case class ReviewPolicy(policyName: java.lang.String, parameters: scala.Option[scala.List[avias.mechanicalturkrequester.models.PolicyParameter]] = scala.None)
final case class ListWorkerBlocksResponse(nextToken: scala.Option[java.lang.String] = scala.None, numResults: scala.Option[scala.Int] = scala.None, workerBlocks: scala.Option[scala.List[avias.mechanicalturkrequester.models.WorkerBlock]] = scala.None)
case object UpdateHITReviewStatusResponse
final case class HITLayoutParameter(name: java.lang.String, value: java.lang.String)
final case class ReviewResultDetail(actionId: scala.Option[java.lang.String] = scala.None, subjectId: scala.Option[java.lang.String] = scala.None, questionId: scala.Option[java.lang.String] = scala.None, subjectType: scala.Option[java.lang.String] = scala.None, key: scala.Option[java.lang.String] = scala.None, value: scala.Option[java.lang.String] = scala.None)
final case class ListHITsForQualificationTypeResponse(nextToken: scala.Option[java.lang.String] = scala.None, numResults: scala.Option[scala.Int] = scala.None, hits: scala.Option[scala.List[avias.mechanicalturkrequester.models.HIT]] = scala.None)
final case class GetAssignmentRequest(assignmentId: java.lang.String)
final case class CreateQualificationTypeRequest(name: java.lang.String, description: java.lang.String, qualificationTypeStatus: java.lang.String, retryDelayInSeconds: scala.Option[scala.Long] = scala.None, testDurationInSeconds: scala.Option[scala.Long] = scala.None, keywords: scala.Option[java.lang.String] = scala.None, answerKey: scala.Option[java.lang.String] = scala.None, test: scala.Option[java.lang.String] = scala.None, autoGrantedValue: scala.Option[scala.Int] = scala.None, autoGranted: scala.Option[scala.Boolean] = scala.None)
final case class DisassociateQualificationFromWorkerRequest(workerId: java.lang.String, qualificationTypeId: java.lang.String, reason: scala.Option[java.lang.String] = scala.None)
final case class Locale(country: java.lang.String, subdivision: scala.Option[java.lang.String] = scala.None)
final case class GetAssignmentResponse(assignment: scala.Option[avias.mechanicalturkrequester.models.Assignment] = scala.None, hit: scala.Option[avias.mechanicalturkrequester.models.HIT] = scala.None)
final case class DeleteQualificationTypeRequest(qualificationTypeId: java.lang.String)
final case class CreateHITWithHITTypeRequest(hittypeId: java.lang.String, lifetimeInSeconds: scala.Long, hitlayoutId: scala.Option[java.lang.String] = scala.None, assignmentReviewPolicy: scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy] = scala.None, hitreviewPolicy: scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy] = scala.None, uniqueRequestToken: scala.Option[java.lang.String] = scala.None, question: scala.Option[java.lang.String] = scala.None, requesterAnnotation: scala.Option[java.lang.String] = scala.None, hitlayoutParameters: scala.Option[scala.List[avias.mechanicalturkrequester.models.HITLayoutParameter]] = scala.None, maxAssignments: scala.Option[scala.Int] = scala.None)
final case class ListAssignmentsForHITResponse(nextToken: scala.Option[java.lang.String] = scala.None, numResults: scala.Option[scala.Int] = scala.None, assignments: scala.Option[scala.List[avias.mechanicalturkrequester.models.Assignment]] = scala.None)
case object DisassociateQualificationFromWorkerResponse
final case class AssociateQualificationWithWorkerRequest(qualificationTypeId: java.lang.String, workerId: java.lang.String, integerValue: scala.Option[scala.Int] = scala.None, sendNotification: scala.Option[scala.Boolean] = scala.None)
final case class CreateHITTypeResponse(hittypeId: scala.Option[java.lang.String] = scala.None)
final case class ListWorkersWithQualificationTypeRequest(qualificationTypeId: java.lang.String, status: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ReviewReport(reviewResults: scala.Option[scala.List[avias.mechanicalturkrequester.models.ReviewResultDetail]] = scala.None, reviewActions: scala.Option[scala.List[avias.mechanicalturkrequester.models.ReviewActionDetail]] = scala.None)
final case class CreateHITWithHITTypeResponse(hit: scala.Option[avias.mechanicalturkrequester.models.HIT] = scala.None)
final case class UpdateHITTypeOfHITRequest(hitid: java.lang.String, hittypeId: java.lang.String)
case object SendBonusResponse
final case class ParameterMapEntry(key: scala.Option[java.lang.String] = scala.None, values: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class UpdateNotificationSettingsRequest(hittypeId: java.lang.String, notification: scala.Option[avias.mechanicalturkrequester.models.NotificationSpecification] = scala.None, active: scala.Option[scala.Boolean] = scala.None)
final case class GetFileUploadURLRequest(assignmentId: java.lang.String, questionIdentifier: java.lang.String)
final case class ListReviewPolicyResultsForHITResponse(hitid: scala.Option[java.lang.String] = scala.None, assignmentReviewPolicy: scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy] = scala.None, hitreviewPolicy: scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy] = scala.None, assignmentReviewReport: scala.Option[avias.mechanicalturkrequester.models.ReviewReport] = scala.None, hitreviewReport: scala.Option[avias.mechanicalturkrequester.models.ReviewReport] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ApproveAssignmentRequest(assignmentId: java.lang.String, requesterFeedback: scala.Option[java.lang.String] = scala.None, overrideRejection: scala.Option[scala.Boolean] = scala.None)
final case class WorkerBlock(workerId: scala.Option[java.lang.String] = scala.None, reason: scala.Option[java.lang.String] = scala.None)
final case class CreateAdditionalAssignmentsForHITRequest(hitid: java.lang.String, numberOfAdditionalAssignments: scala.Int, uniqueRequestToken: scala.Option[java.lang.String] = scala.None)
final case class NotifyWorkersFailureStatus(notifyWorkersFailureCode: scala.Option[java.lang.String] = scala.None, notifyWorkersFailureMessage: scala.Option[java.lang.String] = scala.None, workerId: scala.Option[java.lang.String] = scala.None)
final case class ListReviewableHITsRequest(hittypeId: scala.Option[java.lang.String] = scala.None, status: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object DeleteHITResponse
case object GetAccountBalanceRequest
final case class ListHITsResponse(nextToken: scala.Option[java.lang.String] = scala.None, numResults: scala.Option[scala.Int] = scala.None, hits: scala.Option[scala.List[avias.mechanicalturkrequester.models.HIT]] = scala.None)
case object UpdateHITTypeOfHITResponse
final case class GetFileUploadURLResponse(fileUploadURL: scala.Option[java.lang.String] = scala.None)
final case class CreateHITRequest(lifetimeInSeconds: scala.Long, assignmentDurationInSeconds: scala.Long, title: java.lang.String, description: java.lang.String, reward: java.lang.String, hitlayoutId: scala.Option[java.lang.String] = scala.None, assignmentReviewPolicy: scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy] = scala.None, hitreviewPolicy: scala.Option[avias.mechanicalturkrequester.models.ReviewPolicy] = scala.None, uniqueRequestToken: scala.Option[java.lang.String] = scala.None, autoApprovalDelayInSeconds: scala.Option[scala.Long] = scala.None, keywords: scala.Option[java.lang.String] = scala.None, requesterAnnotation: scala.Option[java.lang.String] = scala.None, question: scala.Option[java.lang.String] = scala.None, hitlayoutParameters: scala.Option[scala.List[avias.mechanicalturkrequester.models.HITLayoutParameter]] = scala.None, maxAssignments: scala.Option[scala.Int] = scala.None, qualificationRequirements: scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequirement]] = scala.None)
case object DeleteQualificationTypeResponse
final case class UpdateQualificationTypeRequest(qualificationTypeId: java.lang.String, testDurationInSeconds: scala.Option[scala.Long] = scala.None, retryDelayInSeconds: scala.Option[scala.Long] = scala.None, description: scala.Option[java.lang.String] = scala.None, test: scala.Option[java.lang.String] = scala.None, answerKey: scala.Option[java.lang.String] = scala.None, qualificationTypeStatus: scala.Option[java.lang.String] = scala.None, autoGrantedValue: scala.Option[scala.Int] = scala.None, autoGranted: scala.Option[scala.Boolean] = scala.None)
final case class Qualification(workerId: scala.Option[java.lang.String] = scala.None, qualificationTypeId: scala.Option[java.lang.String] = scala.None, grantTime: scala.Option[java.time.Instant] = scala.None, localeValue: scala.Option[avias.mechanicalturkrequester.models.Locale] = scala.None, status: scala.Option[java.lang.String] = scala.None, integerValue: scala.Option[scala.Int] = scala.None)
final case class UpdateExpirationForHITRequest(hitid: java.lang.String, expireAt: java.time.Instant)
final case class RejectQualificationRequestRequest(qualificationRequestId: java.lang.String, reason: scala.Option[java.lang.String] = scala.None)
final case class UpdateHITReviewStatusRequest(hitid: java.lang.String, revert: scala.Option[scala.Boolean] = scala.None)
final case class ListWorkerBlocksRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ListWorkersWithQualificationTypeResponse(nextToken: scala.Option[java.lang.String] = scala.None, numResults: scala.Option[scala.Int] = scala.None, qualifications: scala.Option[scala.List[avias.mechanicalturkrequester.models.Qualification]] = scala.None)
final case class CreateHITResponse(hit: scala.Option[avias.mechanicalturkrequester.models.HIT] = scala.None)
final case class ListAssignmentsForHITRequest(hitid: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, assignmentStatuses: scala.Option[scala.List[java.lang.String]] = scala.None)
final case class SendTestEventNotificationRequest(notification: avias.mechanicalturkrequester.models.NotificationSpecification, testEventType: java.lang.String)
final case class ListQualificationTypesResponse(numResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, qualificationTypes: scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationType]] = scala.None)
final case class CreateHITTypeRequest(assignmentDurationInSeconds: scala.Long, reward: java.lang.String, title: java.lang.String, description: java.lang.String, autoApprovalDelayInSeconds: scala.Option[scala.Long] = scala.None, keywords: scala.Option[java.lang.String] = scala.None, qualificationRequirements: scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequirement]] = scala.None)
final case class NotifyWorkersResponse(notifyWorkersFailureStatuses: scala.Option[scala.List[avias.mechanicalturkrequester.models.NotifyWorkersFailureStatus]] = scala.None)
final case class PolicyParameter(key: scala.Option[java.lang.String] = scala.None, values: scala.Option[scala.List[java.lang.String]] = scala.None, mapEntries: scala.Option[scala.List[avias.mechanicalturkrequester.models.ParameterMapEntry]] = scala.None)
final case class ListReviewPolicyResultsForHITRequest(hitid: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, retrieveActions: scala.Option[scala.Boolean] = scala.None, retrieveResults: scala.Option[scala.Boolean] = scala.None, policyLevels: scala.Option[scala.List[java.lang.String]] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DeleteWorkerBlockRequest(workerId: java.lang.String, reason: scala.Option[java.lang.String] = scala.None)
case object UpdateNotificationSettingsResponse
final case class QualificationRequirement(qualificationTypeId: java.lang.String, comparator: java.lang.String, localeValues: scala.Option[scala.List[avias.mechanicalturkrequester.models.Locale]] = scala.None, requiredToPreview: scala.Option[scala.Boolean] = scala.None, integerValues: scala.Option[scala.List[scala.Int]] = scala.None)
final case class GetAccountBalanceResponse(availableBalance: scala.Option[java.lang.String] = scala.None, onHoldBalance: scala.Option[java.lang.String] = scala.None)
case object RejectAssignmentResponse
final case class ServiceFault(message: scala.Option[java.lang.String] = scala.None, turkErrorCode: scala.Option[java.lang.String] = scala.None)
final case class NotificationSpecification(destination: java.lang.String, version: java.lang.String, transport: java.lang.String, eventTypes: scala.List[java.lang.String])
case object AssociateQualificationWithWorkerResponse
final case class QualificationRequest(qualificationRequestId: scala.Option[java.lang.String] = scala.None, test: scala.Option[java.lang.String] = scala.None, answer: scala.Option[java.lang.String] = scala.None, qualificationTypeId: scala.Option[java.lang.String] = scala.None, workerId: scala.Option[java.lang.String] = scala.None, submitTime: scala.Option[java.time.Instant] = scala.None)
final case class ListHITsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class ListReviewableHITsResponse(nextToken: scala.Option[java.lang.String] = scala.None, numResults: scala.Option[scala.Int] = scala.None, hits: scala.Option[scala.List[avias.mechanicalturkrequester.models.HIT]] = scala.None)
final case class NotifyWorkersRequest(subject: java.lang.String, messageText: java.lang.String, workerIds: scala.List[java.lang.String])
final case class ListHITsForQualificationTypeRequest(qualificationTypeId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object SendTestEventNotificationResponse
final case class BonusPayment(workerId: scala.Option[java.lang.String] = scala.None, assignmentId: scala.Option[java.lang.String] = scala.None, grantTime: scala.Option[java.time.Instant] = scala.None, reason: scala.Option[java.lang.String] = scala.None, bonusAmount: scala.Option[java.lang.String] = scala.None)
final case class DeleteHITRequest(hitid: java.lang.String)
final case class QualificationType(qualificationTypeId: scala.Option[java.lang.String] = scala.None, creationTime: scala.Option[java.time.Instant] = scala.None, testDurationInSeconds: scala.Option[scala.Long] = scala.None, retryDelayInSeconds: scala.Option[scala.Long] = scala.None, keywords: scala.Option[java.lang.String] = scala.None, answerKey: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, test: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, qualificationTypeStatus: scala.Option[java.lang.String] = scala.None, autoGrantedValue: scala.Option[scala.Int] = scala.None, isRequestable: scala.Option[scala.Boolean] = scala.None, autoGranted: scala.Option[scala.Boolean] = scala.None)
final case class CreateWorkerBlockRequest(workerId: java.lang.String, reason: java.lang.String)
case object RejectQualificationRequestResponse
case object UpdateExpirationForHITResponse
case object ApproveAssignmentResponse
final case class AcceptQualificationRequestRequest(qualificationRequestId: java.lang.String, integerValue: scala.Option[scala.Int] = scala.None)
final case class ListQualificationTypesRequest(mustBeRequestable: scala.Boolean, mustBeOwnedByCaller: scala.Option[scala.Boolean] = scala.None, query: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class RequestError(message: scala.Option[java.lang.String] = scala.None, turkErrorCode: scala.Option[java.lang.String] = scala.None)
final case class ListQualificationRequestsResponse(numResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, qualificationRequests: scala.Option[scala.List[avias.mechanicalturkrequester.models.QualificationRequest]] = scala.None)
final case class GetHITResponse(hit: scala.Option[avias.mechanicalturkrequester.models.HIT] = scala.None)
final case class SendBonusRequest(workerId: java.lang.String, assignmentId: java.lang.String, reason: java.lang.String, bonusAmount: java.lang.String, uniqueRequestToken: scala.Option[java.lang.String] = scala.None)
final case class ListQualificationRequestsRequest(qualificationTypeId: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class GetQualificationScoreRequest(qualificationTypeId: java.lang.String, workerId: java.lang.String)
case object CreateAdditionalAssignmentsForHITResponse
final case class GetHITRequest(hitid: java.lang.String)
final case class GetQualificationTypeResponse(qualificationType: scala.Option[avias.mechanicalturkrequester.models.QualificationType] = scala.None)
final case class CreateQualificationTypeResponse(qualificationType: scala.Option[avias.mechanicalturkrequester.models.QualificationType] = scala.None)
case object AcceptQualificationRequestResponse