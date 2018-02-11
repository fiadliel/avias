package org.lyranthe.araethura.mechanicalturkrequester.models
import org.lyranthe.araethura.mechanicalturkrequester.models
final case class GetQualificationScoreResponse(qualification: scala.Option[models.Qualification] = None)
final case class ListBonusPaymentsResponse(numResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None, bonusPayments: scala.Option[scala.List[models.BonusPayment]] = None)
final case class ListBonusPaymentsRequest(hitid: scala.Option[java.lang.String] = None, assignmentId: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class GetQualificationTypeRequest(qualificationTypeId: java.lang.String)
final case class UpdateQualificationTypeResponse(qualificationType: scala.Option[models.QualificationType] = None)
case object CreateWorkerBlockResponse
final case class ReviewActionDetail(actionId: scala.Option[java.lang.String] = None, targetId: scala.Option[java.lang.String] = None, actionName: scala.Option[java.lang.String] = None, targetType: scala.Option[java.lang.String] = None, result: scala.Option[java.lang.String] = None, errorCode: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, completeTime: scala.Option[java.time.Instant] = None)
final case class HIT(hitid: scala.Option[java.lang.String] = None, hittypeId: scala.Option[java.lang.String] = None, hitgroupId: scala.Option[java.lang.String] = None, hitlayoutId: scala.Option[java.lang.String] = None, creationTime: scala.Option[java.time.Instant] = None, expiration: scala.Option[java.time.Instant] = None, autoApprovalDelayInSeconds: scala.Option[scala.Long] = None, assignmentDurationInSeconds: scala.Option[scala.Long] = None, keywords: scala.Option[java.lang.String] = None, requesterAnnotation: scala.Option[java.lang.String] = None, question: scala.Option[java.lang.String] = None, title: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, hitreviewStatus: scala.Option[java.lang.String] = None, hitstatus: scala.Option[java.lang.String] = None, maxAssignments: scala.Option[scala.Int] = None, numberOfAssignmentsPending: scala.Option[scala.Int] = None, numberOfAssignmentsAvailable: scala.Option[scala.Int] = None, numberOfAssignmentsCompleted: scala.Option[scala.Int] = None, reward: scala.Option[java.lang.String] = None, qualificationRequirements: scala.Option[scala.List[models.QualificationRequirement]] = None)
final case class RejectAssignmentRequest(assignmentId: java.lang.String, requesterFeedback: java.lang.String)
final case class Assignment(workerId: scala.Option[java.lang.String] = None, assignmentId: scala.Option[java.lang.String] = None, hitid: scala.Option[java.lang.String] = None, acceptTime: scala.Option[java.time.Instant] = None, rejectionTime: scala.Option[java.time.Instant] = None, deadline: scala.Option[java.time.Instant] = None, submitTime: scala.Option[java.time.Instant] = None, autoApprovalTime: scala.Option[java.time.Instant] = None, approvalTime: scala.Option[java.time.Instant] = None, answer: scala.Option[java.lang.String] = None, requesterFeedback: scala.Option[java.lang.String] = None, assignmentStatus: scala.Option[java.lang.String] = None)
case object DeleteWorkerBlockResponse
final case class ReviewPolicy(policyName: java.lang.String, parameters: scala.Option[scala.List[models.PolicyParameter]] = None)
final case class ListWorkerBlocksResponse(nextToken: scala.Option[java.lang.String] = None, numResults: scala.Option[scala.Int] = None, workerBlocks: scala.Option[scala.List[models.WorkerBlock]] = None)
case object UpdateHITReviewStatusResponse
final case class HITLayoutParameter(name: java.lang.String, value: java.lang.String)
final case class ReviewResultDetail(actionId: scala.Option[java.lang.String] = None, subjectId: scala.Option[java.lang.String] = None, questionId: scala.Option[java.lang.String] = None, subjectType: scala.Option[java.lang.String] = None, key: scala.Option[java.lang.String] = None, value: scala.Option[java.lang.String] = None)
final case class ListHITsForQualificationTypeResponse(nextToken: scala.Option[java.lang.String] = None, numResults: scala.Option[scala.Int] = None, hits: scala.Option[scala.List[models.HIT]] = None)
final case class GetAssignmentRequest(assignmentId: java.lang.String)
final case class CreateQualificationTypeRequest(name: java.lang.String, description: java.lang.String, qualificationTypeStatus: java.lang.String, retryDelayInSeconds: scala.Option[scala.Long] = None, testDurationInSeconds: scala.Option[scala.Long] = None, keywords: scala.Option[java.lang.String] = None, answerKey: scala.Option[java.lang.String] = None, test: scala.Option[java.lang.String] = None, autoGrantedValue: scala.Option[scala.Int] = None, autoGranted: scala.Option[scala.Boolean] = None)
final case class DisassociateQualificationFromWorkerRequest(workerId: java.lang.String, qualificationTypeId: java.lang.String, reason: scala.Option[java.lang.String] = None)
final case class Locale(country: java.lang.String, subdivision: scala.Option[java.lang.String] = None)
final case class GetAssignmentResponse(assignment: scala.Option[models.Assignment] = None, hit: scala.Option[models.HIT] = None)
final case class DeleteQualificationTypeRequest(qualificationTypeId: java.lang.String)
final case class CreateHITWithHITTypeRequest(hittypeId: java.lang.String, lifetimeInSeconds: scala.Long, hitlayoutId: scala.Option[java.lang.String] = None, assignmentReviewPolicy: scala.Option[models.ReviewPolicy] = None, hitreviewPolicy: scala.Option[models.ReviewPolicy] = None, uniqueRequestToken: scala.Option[java.lang.String] = None, question: scala.Option[java.lang.String] = None, requesterAnnotation: scala.Option[java.lang.String] = None, hitlayoutParameters: scala.Option[scala.List[models.HITLayoutParameter]] = None, maxAssignments: scala.Option[scala.Int] = None)
final case class ListAssignmentsForHITResponse(nextToken: scala.Option[java.lang.String] = None, numResults: scala.Option[scala.Int] = None, assignments: scala.Option[scala.List[models.Assignment]] = None)
case object DisassociateQualificationFromWorkerResponse
final case class AssociateQualificationWithWorkerRequest(qualificationTypeId: java.lang.String, workerId: java.lang.String, integerValue: scala.Option[scala.Int] = None, sendNotification: scala.Option[scala.Boolean] = None)
final case class CreateHITTypeResponse(hittypeId: scala.Option[java.lang.String] = None)
final case class ListWorkersWithQualificationTypeRequest(qualificationTypeId: java.lang.String, status: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class ReviewReport(reviewResults: scala.Option[scala.List[models.ReviewResultDetail]] = None, reviewActions: scala.Option[scala.List[models.ReviewActionDetail]] = None)
final case class CreateHITWithHITTypeResponse(hit: scala.Option[models.HIT] = None)
final case class UpdateHITTypeOfHITRequest(hitid: java.lang.String, hittypeId: java.lang.String)
case object SendBonusResponse
final case class ParameterMapEntry(key: scala.Option[java.lang.String] = None, values: scala.Option[scala.List[java.lang.String]] = None)
final case class UpdateNotificationSettingsRequest(hittypeId: java.lang.String, notification: scala.Option[models.NotificationSpecification] = None, active: scala.Option[scala.Boolean] = None)
final case class GetFileUploadURLRequest(assignmentId: java.lang.String, questionIdentifier: java.lang.String)
final case class ListReviewPolicyResultsForHITResponse(hitid: scala.Option[java.lang.String] = None, assignmentReviewPolicy: scala.Option[models.ReviewPolicy] = None, hitreviewPolicy: scala.Option[models.ReviewPolicy] = None, assignmentReviewReport: scala.Option[models.ReviewReport] = None, hitreviewReport: scala.Option[models.ReviewReport] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ApproveAssignmentRequest(assignmentId: java.lang.String, requesterFeedback: scala.Option[java.lang.String] = None, overrideRejection: scala.Option[scala.Boolean] = None)
final case class WorkerBlock(workerId: scala.Option[java.lang.String] = None, reason: scala.Option[java.lang.String] = None)
final case class CreateAdditionalAssignmentsForHITRequest(hitid: java.lang.String, numberOfAdditionalAssignments: scala.Int, uniqueRequestToken: scala.Option[java.lang.String] = None)
final case class NotifyWorkersFailureStatus(notifyWorkersFailureCode: scala.Option[java.lang.String] = None, notifyWorkersFailureMessage: scala.Option[java.lang.String] = None, workerId: scala.Option[java.lang.String] = None)
final case class ListReviewableHITsRequest(hittypeId: scala.Option[java.lang.String] = None, status: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
case object DeleteHITResponse
case object GetAccountBalanceRequest
final case class ListHITsResponse(nextToken: scala.Option[java.lang.String] = None, numResults: scala.Option[scala.Int] = None, hits: scala.Option[scala.List[models.HIT]] = None)
case object UpdateHITTypeOfHITResponse
final case class GetFileUploadURLResponse(fileUploadURL: scala.Option[java.lang.String] = None)
final case class CreateHITRequest(lifetimeInSeconds: scala.Long, assignmentDurationInSeconds: scala.Long, title: java.lang.String, description: java.lang.String, reward: java.lang.String, hitlayoutId: scala.Option[java.lang.String] = None, assignmentReviewPolicy: scala.Option[models.ReviewPolicy] = None, hitreviewPolicy: scala.Option[models.ReviewPolicy] = None, uniqueRequestToken: scala.Option[java.lang.String] = None, autoApprovalDelayInSeconds: scala.Option[scala.Long] = None, keywords: scala.Option[java.lang.String] = None, requesterAnnotation: scala.Option[java.lang.String] = None, question: scala.Option[java.lang.String] = None, hitlayoutParameters: scala.Option[scala.List[models.HITLayoutParameter]] = None, maxAssignments: scala.Option[scala.Int] = None, qualificationRequirements: scala.Option[scala.List[models.QualificationRequirement]] = None)
case object DeleteQualificationTypeResponse
final case class UpdateQualificationTypeRequest(qualificationTypeId: java.lang.String, testDurationInSeconds: scala.Option[scala.Long] = None, retryDelayInSeconds: scala.Option[scala.Long] = None, description: scala.Option[java.lang.String] = None, test: scala.Option[java.lang.String] = None, answerKey: scala.Option[java.lang.String] = None, qualificationTypeStatus: scala.Option[java.lang.String] = None, autoGrantedValue: scala.Option[scala.Int] = None, autoGranted: scala.Option[scala.Boolean] = None)
final case class Qualification(workerId: scala.Option[java.lang.String] = None, qualificationTypeId: scala.Option[java.lang.String] = None, grantTime: scala.Option[java.time.Instant] = None, localeValue: scala.Option[models.Locale] = None, status: scala.Option[java.lang.String] = None, integerValue: scala.Option[scala.Int] = None)
final case class UpdateExpirationForHITRequest(hitid: java.lang.String, expireAt: java.time.Instant)
final case class RejectQualificationRequestRequest(qualificationRequestId: java.lang.String, reason: scala.Option[java.lang.String] = None)
final case class UpdateHITReviewStatusRequest(hitid: java.lang.String, revert: scala.Option[scala.Boolean] = None)
final case class ListWorkerBlocksRequest(nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class ListWorkersWithQualificationTypeResponse(nextToken: scala.Option[java.lang.String] = None, numResults: scala.Option[scala.Int] = None, qualifications: scala.Option[scala.List[models.Qualification]] = None)
final case class CreateHITResponse(hit: scala.Option[models.HIT] = None)
final case class ListAssignmentsForHITRequest(hitid: java.lang.String, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None, assignmentStatuses: scala.Option[scala.List[java.lang.String]] = None)
final case class SendTestEventNotificationRequest(notification: models.NotificationSpecification, testEventType: java.lang.String)
final case class ListQualificationTypesResponse(numResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None, qualificationTypes: scala.Option[scala.List[models.QualificationType]] = None)
final case class CreateHITTypeRequest(assignmentDurationInSeconds: scala.Long, reward: java.lang.String, title: java.lang.String, description: java.lang.String, autoApprovalDelayInSeconds: scala.Option[scala.Long] = None, keywords: scala.Option[java.lang.String] = None, qualificationRequirements: scala.Option[scala.List[models.QualificationRequirement]] = None)
final case class NotifyWorkersResponse(notifyWorkersFailureStatuses: scala.Option[scala.List[models.NotifyWorkersFailureStatus]] = None)
final case class PolicyParameter(key: scala.Option[java.lang.String] = None, values: scala.Option[scala.List[java.lang.String]] = None, mapEntries: scala.Option[scala.List[models.ParameterMapEntry]] = None)
final case class ListReviewPolicyResultsForHITRequest(hitid: java.lang.String, nextToken: scala.Option[java.lang.String] = None, retrieveActions: scala.Option[scala.Boolean] = None, retrieveResults: scala.Option[scala.Boolean] = None, policyLevels: scala.Option[scala.List[java.lang.String]] = None, maxResults: scala.Option[scala.Int] = None)
final case class DeleteWorkerBlockRequest(workerId: java.lang.String, reason: scala.Option[java.lang.String] = None)
case object UpdateNotificationSettingsResponse
final case class QualificationRequirement(qualificationTypeId: java.lang.String, comparator: java.lang.String, localeValues: scala.Option[scala.List[models.Locale]] = None, requiredToPreview: scala.Option[scala.Boolean] = None, integerValues: scala.Option[scala.List[scala.Int]] = None)
final case class GetAccountBalanceResponse(availableBalance: scala.Option[java.lang.String] = None, onHoldBalance: scala.Option[java.lang.String] = None)
case object RejectAssignmentResponse
final case class ServiceFault(message: scala.Option[java.lang.String] = None, turkErrorCode: scala.Option[java.lang.String] = None)
final case class NotificationSpecification(destination: java.lang.String, version: java.lang.String, transport: java.lang.String, eventTypes: scala.List[java.lang.String])
case object AssociateQualificationWithWorkerResponse
final case class QualificationRequest(qualificationRequestId: scala.Option[java.lang.String] = None, test: scala.Option[java.lang.String] = None, answer: scala.Option[java.lang.String] = None, qualificationTypeId: scala.Option[java.lang.String] = None, workerId: scala.Option[java.lang.String] = None, submitTime: scala.Option[java.time.Instant] = None)
final case class ListHITsRequest(nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class ListReviewableHITsResponse(nextToken: scala.Option[java.lang.String] = None, numResults: scala.Option[scala.Int] = None, hits: scala.Option[scala.List[models.HIT]] = None)
final case class NotifyWorkersRequest(subject: java.lang.String, messageText: java.lang.String, workerIds: scala.List[java.lang.String])
final case class ListHITsForQualificationTypeRequest(qualificationTypeId: java.lang.String, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
case object SendTestEventNotificationResponse
final case class BonusPayment(workerId: scala.Option[java.lang.String] = None, assignmentId: scala.Option[java.lang.String] = None, grantTime: scala.Option[java.time.Instant] = None, reason: scala.Option[java.lang.String] = None, bonusAmount: scala.Option[java.lang.String] = None)
final case class DeleteHITRequest(hitid: java.lang.String)
final case class QualificationType(qualificationTypeId: scala.Option[java.lang.String] = None, creationTime: scala.Option[java.time.Instant] = None, testDurationInSeconds: scala.Option[scala.Long] = None, retryDelayInSeconds: scala.Option[scala.Long] = None, keywords: scala.Option[java.lang.String] = None, answerKey: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, test: scala.Option[java.lang.String] = None, description: scala.Option[java.lang.String] = None, qualificationTypeStatus: scala.Option[java.lang.String] = None, autoGrantedValue: scala.Option[scala.Int] = None, isRequestable: scala.Option[scala.Boolean] = None, autoGranted: scala.Option[scala.Boolean] = None)
final case class CreateWorkerBlockRequest(workerId: java.lang.String, reason: java.lang.String)
case object RejectQualificationRequestResponse
case object UpdateExpirationForHITResponse
case object ApproveAssignmentResponse
final case class AcceptQualificationRequestRequest(qualificationRequestId: java.lang.String, integerValue: scala.Option[scala.Int] = None)
final case class ListQualificationTypesRequest(mustBeRequestable: scala.Boolean, mustBeOwnedByCaller: scala.Option[scala.Boolean] = None, query: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class RequestError(message: scala.Option[java.lang.String] = None, turkErrorCode: scala.Option[java.lang.String] = None)
final case class ListQualificationRequestsResponse(numResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None, qualificationRequests: scala.Option[scala.List[models.QualificationRequest]] = None)
final case class GetHITResponse(hit: scala.Option[models.HIT] = None)
final case class SendBonusRequest(workerId: java.lang.String, assignmentId: java.lang.String, reason: java.lang.String, bonusAmount: java.lang.String, uniqueRequestToken: scala.Option[java.lang.String] = None)
final case class ListQualificationRequestsRequest(qualificationTypeId: scala.Option[java.lang.String] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class GetQualificationScoreRequest(qualificationTypeId: java.lang.String, workerId: java.lang.String)
case object CreateAdditionalAssignmentsForHITResponse
final case class GetHITRequest(hitid: java.lang.String)
final case class GetQualificationTypeResponse(qualificationType: scala.Option[models.QualificationType] = None)
final case class CreateQualificationTypeResponse(qualificationType: scala.Option[models.QualificationType] = None)
case object AcceptQualificationRequestResponse