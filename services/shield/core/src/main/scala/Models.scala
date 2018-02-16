package avias.shield.models
final case class ListAttacksResponse(attackSummaries: scala.Option[scala.List[avias.shield.models.AttackSummary]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListAttacksRequest(resourceArns: scala.Option[scala.List[java.lang.String]] = scala.None, startTime: scala.Option[avias.shield.models.TimeRange] = scala.None, endTime: scala.Option[avias.shield.models.TimeRange] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
case object DescribeSubscriptionRequest
case object CreateSubscriptionResponse
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
case object DeleteSubscriptionResponse
final case class DescribeSubscriptionResponse(subscription: scala.Option[avias.shield.models.Subscription] = scala.None)
final case class DeleteProtectionRequest(protectionId: java.lang.String)
final case class CreateProtectionResponse(protectionId: scala.Option[java.lang.String] = scala.None)
final case class ResourceNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class LockedSubscriptionException(message: scala.Option[java.lang.String] = scala.None)
final case class ListProtectionsResponse(protections: scala.Option[scala.List[avias.shield.models.Protection]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateProtectionRequest(name: java.lang.String, resourceArn: java.lang.String)
final case class ListProtectionsRequest(nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class AttackVectorDescription(vectorType: java.lang.String)
final case class SummarizedAttackVector(vectorType: java.lang.String, vectorCounters: scala.Option[scala.List[avias.shield.models.SummarizedCounter]] = scala.None)
final case class Mitigation(mitigationName: scala.Option[java.lang.String] = scala.None)
final case class SubResourceSummary(`type`: scala.Option[java.lang.String] = scala.None, id: scala.Option[java.lang.String] = scala.None, attackVectors: scala.Option[scala.List[avias.shield.models.SummarizedAttackVector]] = scala.None, counters: scala.Option[scala.List[avias.shield.models.SummarizedCounter]] = scala.None)
final case class InvalidResourceException(message: scala.Option[java.lang.String] = scala.None)
final case class InvalidOperationException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeProtectionRequest(protectionId: java.lang.String)
final case class InternalErrorException(message: scala.Option[java.lang.String] = scala.None)
case object DeleteSubscriptionRequest
final case class DescribeProtectionResponse(protection: scala.Option[avias.shield.models.Protection] = scala.None)
case object DeleteProtectionResponse
final case class LimitsExceededException(message: scala.Option[java.lang.String] = scala.None, `type`: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Long] = scala.None)
final case class OptimisticLockException(message: scala.Option[java.lang.String] = scala.None)
final case class SummarizedCounter(name: scala.Option[java.lang.String] = scala.None, unit: scala.Option[java.lang.String] = scala.None, max: scala.Option[scala.Double] = scala.None, average: scala.Option[scala.Double] = scala.None, sum: scala.Option[scala.Double] = scala.None, n: scala.Option[scala.Int] = scala.None)
final case class DescribeAttackRequest(attackId: java.lang.String)
final case class AttackDetail(attackCounters: scala.Option[scala.List[avias.shield.models.SummarizedCounter]] = scala.None, resourceArn: scala.Option[java.lang.String] = scala.None, attackId: scala.Option[java.lang.String] = scala.None, subResources: scala.Option[scala.List[avias.shield.models.SubResourceSummary]] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, mitigations: scala.Option[scala.List[avias.shield.models.Mitigation]] = scala.None)
final case class DescribeAttackResponse(attack: scala.Option[avias.shield.models.AttackDetail] = scala.None)
final case class ResourceAlreadyExistsException(message: scala.Option[java.lang.String] = scala.None)
final case class AttackSummary(attackId: scala.Option[java.lang.String] = scala.None, resourceArn: scala.Option[java.lang.String] = scala.None, startTime: scala.Option[java.time.Instant] = scala.None, endTime: scala.Option[java.time.Instant] = scala.None, attackVectors: scala.Option[scala.List[avias.shield.models.AttackVectorDescription]] = scala.None)
final case class TimeRange(fromInclusive: scala.Option[java.time.Instant] = scala.None, toExclusive: scala.Option[java.time.Instant] = scala.None)
final case class Protection(id: scala.Option[java.lang.String] = scala.None, name: scala.Option[java.lang.String] = scala.None, resourceArn: scala.Option[java.lang.String] = scala.None)
final case class Subscription(startTime: scala.Option[java.time.Instant] = scala.None, timeCommitmentInSeconds: scala.Option[scala.Long] = scala.None)
case object CreateSubscriptionRequest