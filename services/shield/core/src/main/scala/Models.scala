package org.lyranthe.araethura.shield.models
import org.lyranthe.araethura.shield.models
final case class ListAttacksResponse(attackSummaries: scala.Option[scala.List[models.AttackSummary]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class ListAttacksRequest(resourceArns: scala.Option[scala.List[java.lang.String]] = None, startTime: scala.Option[models.TimeRange] = None, endTime: scala.Option[models.TimeRange] = None, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
case object DescribeSubscriptionRequest
case object CreateSubscriptionResponse
final case class InvalidParameterException(message: scala.Option[java.lang.String] = None)
case object DeleteSubscriptionResponse
final case class DescribeSubscriptionResponse(subscription: scala.Option[models.Subscription] = None)
final case class DeleteProtectionRequest(protectionId: java.lang.String)
final case class CreateProtectionResponse(protectionId: scala.Option[java.lang.String] = None)
final case class ResourceNotFoundException(message: scala.Option[java.lang.String] = None)
final case class LockedSubscriptionException(message: scala.Option[java.lang.String] = None)
final case class ListProtectionsResponse(protections: scala.Option[scala.List[models.Protection]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CreateProtectionRequest(name: java.lang.String, resourceArn: java.lang.String)
final case class ListProtectionsRequest(nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class AttackVectorDescription(vectorType: java.lang.String)
final case class SummarizedAttackVector(vectorType: java.lang.String, vectorCounters: scala.Option[scala.List[models.SummarizedCounter]] = None)
final case class Mitigation(mitigationName: scala.Option[java.lang.String] = None)
final case class SubResourceSummary(`type`: scala.Option[java.lang.String] = None, id: scala.Option[java.lang.String] = None, attackVectors: scala.Option[scala.List[models.SummarizedAttackVector]] = None, counters: scala.Option[scala.List[models.SummarizedCounter]] = None)
final case class InvalidResourceException(message: scala.Option[java.lang.String] = None)
final case class InvalidOperationException(message: scala.Option[java.lang.String] = None)
final case class DescribeProtectionRequest(protectionId: java.lang.String)
final case class InternalErrorException(message: scala.Option[java.lang.String] = None)
case object DeleteSubscriptionRequest
final case class DescribeProtectionResponse(protection: scala.Option[models.Protection] = None)
case object DeleteProtectionResponse
final case class LimitsExceededException(message: scala.Option[java.lang.String] = None, `type`: scala.Option[java.lang.String] = None, limit: scala.Option[scala.Long] = None)
final case class OptimisticLockException(message: scala.Option[java.lang.String] = None)
final case class SummarizedCounter(name: scala.Option[java.lang.String] = None, unit: scala.Option[java.lang.String] = None, max: scala.Option[scala.Double] = None, average: scala.Option[scala.Double] = None, sum: scala.Option[scala.Double] = None, n: scala.Option[scala.Int] = None)
final case class DescribeAttackRequest(attackId: java.lang.String)
final case class AttackDetail(attackCounters: scala.Option[scala.List[models.SummarizedCounter]] = None, resourceArn: scala.Option[java.lang.String] = None, attackId: scala.Option[java.lang.String] = None, subResources: scala.Option[scala.List[models.SubResourceSummary]] = None, startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, mitigations: scala.Option[scala.List[models.Mitigation]] = None)
final case class DescribeAttackResponse(attack: scala.Option[models.AttackDetail] = None)
final case class ResourceAlreadyExistsException(message: scala.Option[java.lang.String] = None)
final case class AttackSummary(attackId: scala.Option[java.lang.String] = None, resourceArn: scala.Option[java.lang.String] = None, startTime: scala.Option[java.time.Instant] = None, endTime: scala.Option[java.time.Instant] = None, attackVectors: scala.Option[scala.List[models.AttackVectorDescription]] = None)
final case class TimeRange(fromInclusive: scala.Option[java.time.Instant] = None, toExclusive: scala.Option[java.time.Instant] = None)
final case class Protection(id: scala.Option[java.lang.String] = None, name: scala.Option[java.lang.String] = None, resourceArn: scala.Option[java.lang.String] = None)
final case class Subscription(startTime: scala.Option[java.time.Instant] = None, timeCommitmentInSeconds: scala.Option[scala.Long] = None)
case object CreateSubscriptionRequest