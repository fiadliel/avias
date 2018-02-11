package org.lyranthe.araethura.shield
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListAttacksResponseEncoder: io.circe.Encoder[models.ListAttacksResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AttackSummaries" -> o.attackSummaries.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListAttacksRequestEncoder: io.circe.Encoder[models.ListAttacksRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArns" -> o.resourceArns.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeSubscriptionRequestEncoder: io.circe.Encoder[models.DescribeSubscriptionRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateSubscriptionResponseEncoder: io.circe.Encoder[models.CreateSubscriptionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteSubscriptionResponseEncoder: io.circe.Encoder[models.DeleteSubscriptionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubscriptionResponseEncoder: io.circe.Encoder[models.DescribeSubscriptionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Subscription" -> o.subscription.asJson)
  }
  final implicit val DeleteProtectionRequestEncoder: io.circe.Encoder[models.DeleteProtectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProtectionId" -> o.protectionId.asJson)
  }
  final implicit val CreateProtectionResponseEncoder: io.circe.Encoder[models.CreateProtectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ProtectionId" -> o.protectionId.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val LockedSubscriptionExceptionEncoder: io.circe.Encoder[models.LockedSubscriptionException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListProtectionsResponseEncoder: io.circe.Encoder[models.ListProtectionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Protections" -> o.protections.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateProtectionRequestEncoder: io.circe.Encoder[models.CreateProtectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val ListProtectionsRequestEncoder: io.circe.Encoder[models.ListProtectionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val AttackVectorDescriptionEncoder: io.circe.Encoder[models.AttackVectorDescription] = io.circe.Encoder.instance { o => 
    Json.obj("VectorType" -> o.vectorType.asJson)
  }
  final implicit val SummarizedAttackVectorEncoder: io.circe.Encoder[models.SummarizedAttackVector] = io.circe.Encoder.instance { o => 
    Json.obj("VectorType" -> o.vectorType.asJson, "VectorCounters" -> o.vectorCounters.asJson)
  }
  final implicit val MitigationEncoder: io.circe.Encoder[models.Mitigation] = io.circe.Encoder.instance { o => 
    Json.obj("MitigationName" -> o.mitigationName.asJson)
  }
  final implicit val SubResourceSummaryEncoder: io.circe.Encoder[models.SubResourceSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Id" -> o.id.asJson, "AttackVectors" -> o.attackVectors.asJson, "Counters" -> o.counters.asJson)
  }
  final implicit val InvalidResourceExceptionEncoder: io.circe.Encoder[models.InvalidResourceException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidOperationExceptionEncoder: io.circe.Encoder[models.InvalidOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeProtectionRequestEncoder: io.circe.Encoder[models.DescribeProtectionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProtectionId" -> o.protectionId.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteSubscriptionRequestEncoder: io.circe.Encoder[models.DeleteSubscriptionRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeProtectionResponseEncoder: io.circe.Encoder[models.DescribeProtectionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Protection" -> o.protection.asJson)
  }
  final implicit val DeleteProtectionResponseEncoder: io.circe.Encoder[models.DeleteProtectionResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val LimitsExceededExceptionEncoder: io.circe.Encoder[models.LimitsExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "Type" -> o.`type`.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val OptimisticLockExceptionEncoder: io.circe.Encoder[models.OptimisticLockException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SummarizedCounterEncoder: io.circe.Encoder[models.SummarizedCounter] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Unit" -> o.unit.asJson, "Max" -> o.max.asJson, "Average" -> o.average.asJson, "Sum" -> o.sum.asJson, "N" -> o.n.asJson)
  }
  final implicit val DescribeAttackRequestEncoder: io.circe.Encoder[models.DescribeAttackRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AttackId" -> o.attackId.asJson)
  }
  final implicit val AttackDetailEncoder: io.circe.Encoder[models.AttackDetail] = io.circe.Encoder.instance { o => 
    Json.obj("AttackCounters" -> o.attackCounters.asJson, "ResourceArn" -> o.resourceArn.asJson, "AttackId" -> o.attackId.asJson, "SubResources" -> o.subResources.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "Mitigations" -> o.mitigations.asJson)
  }
  final implicit val DescribeAttackResponseEncoder: io.circe.Encoder[models.DescribeAttackResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Attack" -> o.attack.asJson)
  }
  final implicit val ResourceAlreadyExistsExceptionEncoder: io.circe.Encoder[models.ResourceAlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AttackSummaryEncoder: io.circe.Encoder[models.AttackSummary] = io.circe.Encoder.instance { o => 
    Json.obj("AttackId" -> o.attackId.asJson, "ResourceArn" -> o.resourceArn.asJson, "StartTime" -> o.startTime.asJson, "EndTime" -> o.endTime.asJson, "AttackVectors" -> o.attackVectors.asJson)
  }
  final implicit val TimeRangeEncoder: io.circe.Encoder[models.TimeRange] = io.circe.Encoder.instance { o => 
    Json.obj("FromInclusive" -> o.fromInclusive.asJson, "ToExclusive" -> o.toExclusive.asJson)
  }
  final implicit val ProtectionEncoder: io.circe.Encoder[models.Protection] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Name" -> o.name.asJson, "ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val SubscriptionEncoder: io.circe.Encoder[models.Subscription] = io.circe.Encoder.instance { o => 
    Json.obj("StartTime" -> o.startTime.asJson, "TimeCommitmentInSeconds" -> o.timeCommitmentInSeconds.asJson)
  }
  final implicit val CreateSubscriptionRequestEncoder: io.circe.Encoder[models.CreateSubscriptionRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListAttacksResponseDecoder: io.circe.Decoder[models.ListAttacksResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.AttackSummary]]]("AttackSummaries"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListAttacksResponse.apply _)
  }
  final implicit val ListAttacksRequestDecoder: io.circe.Decoder[models.ListAttacksRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ResourceArns"), o.get[scala.Option[models.TimeRange]]("StartTime"), o.get[scala.Option[models.TimeRange]]("EndTime"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListAttacksRequest.apply _)
  }
  final implicit val DescribeSubscriptionRequestDecoder: io.circe.Decoder[models.DescribeSubscriptionRequest.type] = io.circe.Decoder.decodeUnit.as(models.DescribeSubscriptionRequest)
  final implicit val CreateSubscriptionResponseDecoder: io.circe.Decoder[models.CreateSubscriptionResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateSubscriptionResponse)
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterException.apply _)
  }
  final implicit val DeleteSubscriptionResponseDecoder: io.circe.Decoder[models.DeleteSubscriptionResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteSubscriptionResponse)
  final implicit val DescribeSubscriptionResponseDecoder: io.circe.Decoder[models.DescribeSubscriptionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Subscription]]("Subscription").map(models.DescribeSubscriptionResponse.apply _)
  }
  final implicit val DeleteProtectionRequestDecoder: io.circe.Decoder[models.DeleteProtectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ProtectionId").map(models.DeleteProtectionRequest.apply _)
  }
  final implicit val CreateProtectionResponseDecoder: io.circe.Decoder[models.CreateProtectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ProtectionId").map(models.CreateProtectionResponse.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val LockedSubscriptionExceptionDecoder: io.circe.Decoder[models.LockedSubscriptionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LockedSubscriptionException.apply _)
  }
  final implicit val ListProtectionsResponseDecoder: io.circe.Decoder[models.ListProtectionsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Protection]]]("Protections"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListProtectionsResponse.apply _)
  }
  final implicit val CreateProtectionRequestDecoder: io.circe.Decoder[models.CreateProtectionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("ResourceArn")).mapN(models.CreateProtectionRequest.apply _)
  }
  final implicit val ListProtectionsRequestDecoder: io.circe.Decoder[models.ListProtectionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListProtectionsRequest.apply _)
  }
  final implicit val AttackVectorDescriptionDecoder: io.circe.Decoder[models.AttackVectorDescription] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VectorType").map(models.AttackVectorDescription.apply _)
  }
  final implicit val SummarizedAttackVectorDecoder: io.circe.Decoder[models.SummarizedAttackVector] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VectorType"), o.get[scala.Option[scala.List[models.SummarizedCounter]]]("VectorCounters")).mapN(models.SummarizedAttackVector.apply _)
  }
  final implicit val MitigationDecoder: io.circe.Decoder[models.Mitigation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("MitigationName").map(models.Mitigation.apply _)
  }
  final implicit val SubResourceSummaryDecoder: io.circe.Decoder[models.SubResourceSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[scala.List[models.SummarizedAttackVector]]]("AttackVectors"), o.get[scala.Option[scala.List[models.SummarizedCounter]]]("Counters")).mapN(models.SubResourceSummary.apply _)
  }
  final implicit val InvalidResourceExceptionDecoder: io.circe.Decoder[models.InvalidResourceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidResourceException.apply _)
  }
  final implicit val InvalidOperationExceptionDecoder: io.circe.Decoder[models.InvalidOperationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidOperationException.apply _)
  }
  final implicit val DescribeProtectionRequestDecoder: io.circe.Decoder[models.DescribeProtectionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ProtectionId").map(models.DescribeProtectionRequest.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalErrorException.apply _)
  }
  final implicit val DeleteSubscriptionRequestDecoder: io.circe.Decoder[models.DeleteSubscriptionRequest.type] = io.circe.Decoder.decodeUnit.as(models.DeleteSubscriptionRequest)
  final implicit val DescribeProtectionResponseDecoder: io.circe.Decoder[models.DescribeProtectionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Protection]]("Protection").map(models.DescribeProtectionResponse.apply _)
  }
  final implicit val DeleteProtectionResponseDecoder: io.circe.Decoder[models.DeleteProtectionResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteProtectionResponse)
  final implicit val LimitsExceededExceptionDecoder: io.circe.Decoder[models.LimitsExceededException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.Long]]("Limit")).mapN(models.LimitsExceededException.apply _)
  }
  final implicit val OptimisticLockExceptionDecoder: io.circe.Decoder[models.OptimisticLockException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.OptimisticLockException.apply _)
  }
  final implicit val SummarizedCounterDecoder: io.circe.Decoder[models.SummarizedCounter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Unit"), o.get[scala.Option[scala.Double]]("Max"), o.get[scala.Option[scala.Double]]("Average"), o.get[scala.Option[scala.Double]]("Sum"), o.get[scala.Option[scala.Int]]("N")).mapN(models.SummarizedCounter.apply _)
  }
  final implicit val DescribeAttackRequestDecoder: io.circe.Decoder[models.DescribeAttackRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AttackId").map(models.DescribeAttackRequest.apply _)
  }
  final implicit val AttackDetailDecoder: io.circe.Decoder[models.AttackDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.SummarizedCounter]]]("AttackCounters"), o.get[scala.Option[java.lang.String]]("ResourceArn"), o.get[scala.Option[java.lang.String]]("AttackId"), o.get[scala.Option[scala.List[models.SubResourceSummary]]]("SubResources"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.List[models.Mitigation]]]("Mitigations")).mapN(models.AttackDetail.apply _)
  }
  final implicit val DescribeAttackResponseDecoder: io.circe.Decoder[models.DescribeAttackResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.AttackDetail]]("Attack").map(models.DescribeAttackResponse.apply _)
  }
  final implicit val ResourceAlreadyExistsExceptionDecoder: io.circe.Decoder[models.ResourceAlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceAlreadyExistsException.apply _)
  }
  final implicit val AttackSummaryDecoder: io.circe.Decoder[models.AttackSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AttackId"), o.get[scala.Option[java.lang.String]]("ResourceArn"), o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[java.time.Instant]]("EndTime"), o.get[scala.Option[scala.List[models.AttackVectorDescription]]]("AttackVectors")).mapN(models.AttackSummary.apply _)
  }
  final implicit val TimeRangeDecoder: io.circe.Decoder[models.TimeRange] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("FromInclusive"), o.get[scala.Option[java.time.Instant]]("ToExclusive")).mapN(models.TimeRange.apply _)
  }
  final implicit val ProtectionDecoder: io.circe.Decoder[models.Protection] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("ResourceArn")).mapN(models.Protection.apply _)
  }
  final implicit val SubscriptionDecoder: io.circe.Decoder[models.Subscription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("StartTime"), o.get[scala.Option[scala.Long]]("TimeCommitmentInSeconds")).mapN(models.Subscription.apply _)
  }
  final implicit val CreateSubscriptionRequestDecoder: io.circe.Decoder[models.CreateSubscriptionRequest.type] = io.circe.Decoder.decodeUnit.as(models.CreateSubscriptionRequest)
}