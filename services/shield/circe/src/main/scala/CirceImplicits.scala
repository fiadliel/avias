package avias.shield
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ListAttacksResponseEncoder: io.circe.Encoder[avias.shield.models.ListAttacksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AttackSummaries" -> o.attackSummaries.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListAttacksRequestEncoder: io.circe.Encoder[avias.shield.models.ListAttacksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArns" -> o.resourceArns.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeSubscriptionRequestEncoder: io.circe.Encoder[avias.shield.models.DescribeSubscriptionRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateSubscriptionResponseEncoder: io.circe.Encoder[avias.shield.models.CreateSubscriptionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.shield.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteSubscriptionResponseEncoder: io.circe.Encoder[avias.shield.models.DeleteSubscriptionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubscriptionResponseEncoder: io.circe.Encoder[avias.shield.models.DescribeSubscriptionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Subscription" -> o.subscription.asJson)
  }
  final implicit val DeleteProtectionRequestEncoder: io.circe.Encoder[avias.shield.models.DeleteProtectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProtectionId" -> o.protectionId.asJson)
  }
  final implicit val CreateProtectionResponseEncoder: io.circe.Encoder[avias.shield.models.CreateProtectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ProtectionId" -> o.protectionId.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.shield.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LockedSubscriptionExceptionEncoder: io.circe.Encoder[avias.shield.models.LockedSubscriptionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListProtectionsResponseEncoder: io.circe.Encoder[avias.shield.models.ListProtectionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Protections" -> o.protections.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateProtectionRequestEncoder: io.circe.Encoder[avias.shield.models.CreateProtectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val ListProtectionsRequestEncoder: io.circe.Encoder[avias.shield.models.ListProtectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val AttackVectorDescriptionEncoder: io.circe.Encoder[avias.shield.models.AttackVectorDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VectorType" -> o.vectorType.asJson)
  }
  final implicit val SummarizedAttackVectorEncoder: io.circe.Encoder[avias.shield.models.SummarizedAttackVector] = io.circe.Encoder.instance { o => 
    Json.obj("VectorType" -> o.vectorType.asJson, "VectorCounters" -> o.vectorCounters.asJson)
  }
  final implicit val MitigationEncoder: io.circe.Encoder[avias.shield.models.Mitigation] = io.circe.Encoder.instance { o => 
    Json.obj("MitigationName" -> o.mitigationName.asJson)
  }
  final implicit val SubResourceSummaryEncoder: io.circe.Encoder[avias.shield.models.SubResourceSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Id" -> o.id.asJson, "AttackVectors" -> o.attackVectors.asJson, "Counters" -> o.counters.asJson)
  }
  final implicit val InvalidResourceExceptionEncoder: io.circe.Encoder[avias.shield.models.InvalidResourceException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidOperationExceptionEncoder: io.circe.Encoder[avias.shield.models.InvalidOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeProtectionRequestEncoder: io.circe.Encoder[avias.shield.models.DescribeProtectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProtectionId" -> o.protectionId.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[avias.shield.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteSubscriptionRequestEncoder: io.circe.Encoder[avias.shield.models.DeleteSubscriptionRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeProtectionResponseEncoder: io.circe.Encoder[avias.shield.models.DescribeProtectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Protection" -> o.protection.asJson)
  }
  final implicit val DeleteProtectionResponseEncoder: io.circe.Encoder[avias.shield.models.DeleteProtectionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitsExceededExceptionEncoder: io.circe.Encoder[avias.shield.models.LimitsExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "Type" -> o.`type`.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val OptimisticLockExceptionEncoder: io.circe.Encoder[avias.shield.models.OptimisticLockException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SummarizedCounterEncoder: io.circe.Encoder[avias.shield.models.SummarizedCounter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Unit" -> o.unit.asJson, "Max" -> o.max.asJson, "Average" -> o.average.asJson, "Sum" -> o.sum.asJson, "N" -> o.n.asJson)
  }
  final implicit val DescribeAttackRequestEncoder: io.circe.Encoder[avias.shield.models.DescribeAttackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AttackId" -> o.attackId.asJson)
  }
  final implicit val AttackDetailEncoder: io.circe.Encoder[avias.shield.models.AttackDetail] = io.circe.Encoder.instance { o => 
    Json.obj("AttackCounters" -> o.attackCounters.asJson, "ResourceArn" -> o.resourceArn.asJson, "AttackId" -> o.attackId.asJson, "SubResources" -> o.subResources.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Mitigations" -> o.mitigations.asJson)
  }
  final implicit val DescribeAttackResponseEncoder: io.circe.Encoder[avias.shield.models.DescribeAttackResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Attack" -> o.attack.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[avias.shield.models.ResourceAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttackSummaryEncoder: io.circe.Encoder[avias.shield.models.AttackSummary] = io.circe.Encoder.instance { o => 
    Json.obj("AttackId" -> o.attackId.asJson, "ResourceArn" -> o.resourceArn.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "AttackVectors" -> o.attackVectors.asJson)
  }
  final implicit val TimeRangeEncoder: io.circe.Encoder[avias.shield.models.TimeRange] = io.circe.Encoder.instance { o => 
    Json.obj("FromInclusive" -> o.fromInclusive.asJson, "ToExclusive" -> o.toExclusive.asJson)
  }
  final implicit val ProtectionEncoder: io.circe.Encoder[avias.shield.models.Protection] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val SubscriptionEncoder: io.circe.Encoder[avias.shield.models.Subscription] = io.circe.Encoder.instance { o => 
    Json.obj("StartTime" -> o.startTime.asJson, "TimeCommitmentInSeconds" -> o.timeCommitmentInSeconds.asJson)
  }
  final implicit val CreateSubscriptionRequestEncoder: io.circe.Encoder[avias.shield.models.CreateSubscriptionRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListAttacksResponseDecoder: io.circe.Decoder[avias.shield.models.ListAttacksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.shield.models.AttackSummary]]]("AttackSummaries"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.shield.models.ListAttacksResponse.apply _)
  }
  final implicit val ListAttacksRequestDecoder: io.circe.Decoder[avias.shield.models.ListAttacksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ResourceArns"), o.get[scala.Option[avias.shield.models.TimeRange]]("StartTime"), o.get[scala.Option[avias.shield.models.TimeRange]]("EndTime"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.shield.models.ListAttacksRequest.apply _)
  }
  final implicit val DescribeSubscriptionRequestDecoder: io.circe.Decoder[avias.shield.models.DescribeSubscriptionRequest.type] = io.circe.Decoder.decodeUnit.as(avias.shield.models.DescribeSubscriptionRequest)
  final implicit val CreateSubscriptionResponseDecoder: io.circe.Decoder[avias.shield.models.CreateSubscriptionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.shield.models.CreateSubscriptionResponse)
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.shield.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.InvalidParameterException.apply _)
  }
  final implicit val DeleteSubscriptionResponseDecoder: io.circe.Decoder[avias.shield.models.DeleteSubscriptionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.shield.models.DeleteSubscriptionResponse)
  final implicit val DescribeSubscriptionResponseDecoder: io.circe.Decoder[avias.shield.models.DescribeSubscriptionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.shield.models.Subscription]]("Subscription").map(avias.shield.models.DescribeSubscriptionResponse.apply _)
  }
  final implicit val DeleteProtectionRequestDecoder: io.circe.Decoder[avias.shield.models.DeleteProtectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ProtectionId").map(avias.shield.models.DeleteProtectionRequest.apply _)
  }
  final implicit val CreateProtectionResponseDecoder: io.circe.Decoder[avias.shield.models.CreateProtectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ProtectionId").map(avias.shield.models.CreateProtectionResponse.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.shield.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.ResourceNotFoundException.apply _)
  }
  final implicit val LockedSubscriptionExceptionDecoder: io.circe.Decoder[avias.shield.models.LockedSubscriptionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.LockedSubscriptionException.apply _)
  }
  final implicit val ListProtectionsResponseDecoder: io.circe.Decoder[avias.shield.models.ListProtectionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.shield.models.Protection]]]("Protections"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.shield.models.ListProtectionsResponse.apply _)
  }
  final implicit val CreateProtectionRequestDecoder: io.circe.Decoder[avias.shield.models.CreateProtectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("ResourceArn")).mapN(avias.shield.models.CreateProtectionRequest.apply _)
  }
  final implicit val ListProtectionsRequestDecoder: io.circe.Decoder[avias.shield.models.ListProtectionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.shield.models.ListProtectionsRequest.apply _)
  }
  final implicit val AttackVectorDescriptionDecoder: io.circe.Decoder[avias.shield.models.AttackVectorDescription] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VectorType").map(avias.shield.models.AttackVectorDescription.apply _)
  }
  final implicit val SummarizedAttackVectorDecoder: io.circe.Decoder[avias.shield.models.SummarizedAttackVector] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VectorType"), o.get[scala.Option[scala.List[avias.shield.models.SummarizedCounter]]]("VectorCounters")).mapN(avias.shield.models.SummarizedAttackVector.apply _)
  }
  final implicit val MitigationDecoder: io.circe.Decoder[avias.shield.models.Mitigation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MitigationName").map(avias.shield.models.Mitigation.apply _)
  }
  final implicit val SubResourceSummaryDecoder: io.circe.Decoder[avias.shield.models.SubResourceSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.List[avias.shield.models.SummarizedAttackVector]]]("AttackVectors"), o.get[scala.Option[scala.List[avias.shield.models.SummarizedCounter]]]("Counters")).mapN(avias.shield.models.SubResourceSummary.apply _)
  }
  final implicit val InvalidResourceExceptionDecoder: io.circe.Decoder[avias.shield.models.InvalidResourceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.InvalidResourceException.apply _)
  }
  final implicit val InvalidOperationExceptionDecoder: io.circe.Decoder[avias.shield.models.InvalidOperationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.InvalidOperationException.apply _)
  }
  final implicit val DescribeProtectionRequestDecoder: io.circe.Decoder[avias.shield.models.DescribeProtectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ProtectionId").map(avias.shield.models.DescribeProtectionRequest.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[avias.shield.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.InternalErrorException.apply _)
  }
  final implicit val DeleteSubscriptionRequestDecoder: io.circe.Decoder[avias.shield.models.DeleteSubscriptionRequest.type] = io.circe.Decoder.decodeUnit.as(avias.shield.models.DeleteSubscriptionRequest)
  final implicit val DescribeProtectionResponseDecoder: io.circe.Decoder[avias.shield.models.DescribeProtectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.shield.models.Protection]]("Protection").map(avias.shield.models.DescribeProtectionResponse.apply _)
  }
  final implicit val DeleteProtectionResponseDecoder: io.circe.Decoder[avias.shield.models.DeleteProtectionResponse.type] = io.circe.Decoder.decodeUnit.as(avias.shield.models.DeleteProtectionResponse)
  final implicit val LimitsExceededExceptionDecoder: io.circe.Decoder[avias.shield.models.LimitsExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.Long]]("Limit")).mapN(avias.shield.models.LimitsExceededException.apply _)
  }
  final implicit val OptimisticLockExceptionDecoder: io.circe.Decoder[avias.shield.models.OptimisticLockException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.OptimisticLockException.apply _)
  }
  final implicit val SummarizedCounterDecoder: io.circe.Decoder[avias.shield.models.SummarizedCounter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Unit"), o.get[scala.Option[scala.Double]]("Max"), o.get[scala.Option[scala.Double]]("Average"), o.get[scala.Option[scala.Double]]("Sum"), o.get[scala.Option[scala.Int]]("N")).mapN(avias.shield.models.SummarizedCounter.apply _)
  }
  final implicit val DescribeAttackRequestDecoder: io.circe.Decoder[avias.shield.models.DescribeAttackRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AttackId").map(avias.shield.models.DescribeAttackRequest.apply _)
  }
  final implicit val AttackDetailDecoder: io.circe.Decoder[avias.shield.models.AttackDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.shield.models.SummarizedCounter]]]("AttackCounters"), o.get[scala.Option[java.lang.String]]("ResourceArn"), o.get[scala.Option[java.lang.String]]("AttackId"), o.get[scala.Option[scala.List[avias.shield.models.SubResourceSummary]]]("SubResources"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.List[avias.shield.models.Mitigation]]]("Mitigations")).mapN(avias.shield.models.AttackDetail.apply _)
  }
  final implicit val DescribeAttackResponseDecoder: io.circe.Decoder[avias.shield.models.DescribeAttackResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.shield.models.AttackDetail]]("Attack").map(avias.shield.models.DescribeAttackResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[avias.shield.models.ResourceAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.shield.models.ResourceAlreadyExistsException.apply _)
  }
  final implicit val AttackSummaryDecoder: io.circe.Decoder[avias.shield.models.AttackSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AttackId"), o.get[scala.Option[java.lang.String]]("ResourceArn"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.List[avias.shield.models.AttackVectorDescription]]]("AttackVectors")).mapN(avias.shield.models.AttackSummary.apply _)
  }
  final implicit val TimeRangeDecoder: io.circe.Decoder[avias.shield.models.TimeRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("FromInclusive"), o.get[scala.Option[java.time.Instant]]("ToExclusive")).mapN(avias.shield.models.TimeRange.apply _)
  }
  final implicit val ProtectionDecoder: io.circe.Decoder[avias.shield.models.Protection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ResourceArn")).mapN(avias.shield.models.Protection.apply _)
  }
  final implicit val SubscriptionDecoder: io.circe.Decoder[avias.shield.models.Subscription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[scala.Long]]("TimeCommitmentInSeconds")).mapN(avias.shield.models.Subscription.apply _)
  }
  final implicit val CreateSubscriptionRequestDecoder: io.circe.Decoder[avias.shield.models.CreateSubscriptionRequest.type] = io.circe.Decoder.decodeUnit.as(avias.shield.models.CreateSubscriptionRequest)
}