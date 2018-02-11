package org.lyranthe.araethura.budgets
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteBudgetRequestEncoder: io.circe.Encoder[models.DeleteBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson)
  }
  final implicit val UpdateBudgetResponseEncoder: io.circe.Encoder[models.UpdateBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotificationEncoder: io.circe.Encoder[models.Notification] = io.circe.Encoder.instance { o => 
    Json.obj("NotificationType" -> o.notificationType.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "Threshold" -> o.threshold.asJson, "ThresholdType" -> o.thresholdType.asJson)
  }
  final implicit val DeleteBudgetResponseEncoder: io.circe.Encoder[models.DeleteBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CostTypesEncoder: io.circe.Encoder[models.CostTypes] = io.circe.Encoder.instance { o => 
    Json.obj("IncludeTax" -> o.includeTax.asJson, "IncludeSubscription" -> o.includeSubscription.asJson, "UseBlended" -> o.useBlended.asJson)
  }
  final implicit val UpdateSubscriberRequestEncoder: io.circe.Encoder[models.UpdateSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "OldSubscriber" -> o.oldSubscriber.asJson, "NewSubscriber" -> o.newSubscriber.asJson)
  }
  final implicit val TimePeriodEncoder: io.circe.Encoder[models.TimePeriod] = io.circe.Encoder.instance { o => 
    Json.obj("Start" -> o.start.asJson, "End" -> o.end.asJson)
  }
  final implicit val DeleteSubscriberRequestEncoder: io.circe.Encoder[models.DeleteSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscriber" -> o.subscriber.asJson)
  }
  final implicit val ExpiredNextTokenExceptionEncoder: io.circe.Encoder[models.ExpiredNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateRecordExceptionEncoder: io.circe.Encoder[models.DuplicateRecordException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val SpendEncoder: io.circe.Encoder[models.Spend] = io.circe.Encoder.instance { o => 
    Json.obj("Amount" -> o.amount.asJson, "Unit" -> o.unit.asJson)
  }
  final implicit val CreateSubscriberResponseEncoder: io.circe.Encoder[models.CreateSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeBudgetsRequestEncoder: io.circe.Encoder[models.DescribeBudgetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteNotificationResponseEncoder: io.circe.Encoder[models.DeleteNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BudgetEncoder: io.circe.Encoder[models.Budget] = io.circe.Encoder.instance { o => 
    Json.obj("CostTypes" -> o.costTypes.asJson, "BudgetType" -> o.budgetType.asJson, "TimePeriod" -> o.timePeriod.asJson, "BudgetLimit" -> o.budgetLimit.asJson, "BudgetName" -> o.budgetName.asJson, "TimeUnit" -> o.timeUnit.asJson, "CostFilters" -> o.costFilters.asJson, "CalculatedSpend" -> o.calculatedSpend.asJson)
  }
  final implicit val CalculatedSpendEncoder: io.circe.Encoder[models.CalculatedSpend] = io.circe.Encoder.instance { o => 
    Json.obj("ActualSpend" -> o.actualSpend.asJson, "ForecastedSpend" -> o.forecastedSpend.asJson)
  }
  final implicit val DeleteNotificationRequestEncoder: io.circe.Encoder[models.DeleteNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson)
  }
  final implicit val DescribeSubscribersForNotificationResponseEncoder: io.circe.Encoder[models.DescribeSubscribersForNotificationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Subscribers" -> o.subscribers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteSubscriberResponseEncoder: io.circe.Encoder[models.DeleteSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeNotificationsForBudgetRequestEncoder: io.circe.Encoder[models.DescribeNotificationsForBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateBudgetRequestEncoder: io.circe.Encoder[models.UpdateBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "NewBudget" -> o.newBudget.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeBudgetResponseEncoder: io.circe.Encoder[models.DescribeBudgetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Budget" -> o.budget.asJson)
  }
  final implicit val UpdateNotificationRequestEncoder: io.circe.Encoder[models.UpdateNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "OldNotification" -> o.oldNotification.asJson, "NewNotification" -> o.newNotification.asJson)
  }
  final implicit val NotificationWithSubscribersEncoder: io.circe.Encoder[models.NotificationWithSubscribers] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "Subscribers" -> o.subscribers.asJson)
  }
  final implicit val CreationLimitExceededExceptionEncoder: io.circe.Encoder[models.CreationLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeBudgetsResponseEncoder: io.circe.Encoder[models.DescribeBudgetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Budgets" -> o.budgets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateNotificationRequestEncoder: io.circe.Encoder[models.CreateNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscribers" -> o.subscribers.asJson)
  }
  final implicit val CreateNotificationResponseEncoder: io.circe.Encoder[models.CreateNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubscribersForNotificationRequestEncoder: io.circe.Encoder[models.DescribeSubscribersForNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "BudgetName" -> o.budgetName.asJson, "AccountId" -> o.accountId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeNotificationsForBudgetResponseEncoder: io.circe.Encoder[models.DescribeNotificationsForBudgetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Notifications" -> o.notifications.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateSubscriberRequestEncoder: io.circe.Encoder[models.CreateSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscriber" -> o.subscriber.asJson)
  }
  final implicit val DescribeBudgetRequestEncoder: io.circe.Encoder[models.DescribeBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson)
  }
  final implicit val CreateBudgetRequestEncoder: io.circe.Encoder[models.CreateBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "Budget" -> o.budget.asJson, "NotificationsWithSubscribers" -> o.notificationsWithSubscribers.asJson)
  }
  final implicit val SubscriberEncoder: io.circe.Encoder[models.Subscriber] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionType" -> o.subscriptionType.asJson, "Address" -> o.address.asJson)
  }
  final implicit val UpdateNotificationResponseEncoder: io.circe.Encoder[models.UpdateNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateSubscriberResponseEncoder: io.circe.Encoder[models.UpdateSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateBudgetResponseEncoder: io.circe.Encoder[models.CreateBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteBudgetRequestDecoder: io.circe.Decoder[models.DeleteBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName")).mapN(models.DeleteBudgetRequest.apply _)
  }
  final implicit val UpdateBudgetResponseDecoder: io.circe.Decoder[models.UpdateBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateBudgetResponse)
  final implicit val NotificationDecoder: io.circe.Decoder[models.Notification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NotificationType"), o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Double]("Threshold"), o.get[scala.Option[java.lang.String]]("ThresholdType")).mapN(models.Notification.apply _)
  }
  final implicit val DeleteBudgetResponseDecoder: io.circe.Decoder[models.DeleteBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteBudgetResponse)
  final implicit val CostTypesDecoder: io.circe.Decoder[models.CostTypes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("IncludeTax"), o.get[scala.Boolean]("IncludeSubscription"), o.get[scala.Boolean]("UseBlended")).mapN(models.CostTypes.apply _)
  }
  final implicit val UpdateSubscriberRequestDecoder: io.circe.Decoder[models.UpdateSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[models.Notification]("Notification"), o.get[models.Subscriber]("OldSubscriber"), o.get[models.Subscriber]("NewSubscriber")).mapN(models.UpdateSubscriberRequest.apply _)
  }
  final implicit val TimePeriodDecoder: io.circe.Decoder[models.TimePeriod] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Start"), o.get[java.time.Instant]("End")).mapN(models.TimePeriod.apply _)
  }
  final implicit val DeleteSubscriberRequestDecoder: io.circe.Decoder[models.DeleteSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[models.Notification]("Notification"), o.get[models.Subscriber]("Subscriber")).mapN(models.DeleteSubscriberRequest.apply _)
  }
  final implicit val ExpiredNextTokenExceptionDecoder: io.circe.Decoder[models.ExpiredNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ExpiredNextTokenException.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InvalidNextTokenException.apply _)
  }
  final implicit val DuplicateRecordExceptionDecoder: io.circe.Decoder[models.DuplicateRecordException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicateRecordException.apply _)
  }
  final implicit val SpendDecoder: io.circe.Decoder[models.Spend] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Amount"), o.get[java.lang.String]("Unit")).mapN(models.Spend.apply _)
  }
  final implicit val CreateSubscriberResponseDecoder: io.circe.Decoder[models.CreateSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateSubscriberResponse)
  final implicit val DescribeBudgetsRequestDecoder: io.circe.Decoder[models.DescribeBudgetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeBudgetsRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InvalidParameterException.apply _)
  }
  final implicit val DeleteNotificationResponseDecoder: io.circe.Decoder[models.DeleteNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteNotificationResponse)
  final implicit val BudgetDecoder: io.circe.Decoder[models.Budget] = io.circe.Decoder.instance { o => 
    (o.get[models.CostTypes]("CostTypes"), o.get[java.lang.String]("BudgetType"), o.get[models.TimePeriod]("TimePeriod"), o.get[models.Spend]("BudgetLimit"), o.get[java.lang.String]("BudgetName"), o.get[java.lang.String]("TimeUnit"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("CostFilters"), o.get[scala.Option[models.CalculatedSpend]]("CalculatedSpend")).mapN(models.Budget.apply _)
  }
  final implicit val CalculatedSpendDecoder: io.circe.Decoder[models.CalculatedSpend] = io.circe.Decoder.instance { o => 
    (o.get[models.Spend]("ActualSpend"), o.get[scala.Option[models.Spend]]("ForecastedSpend")).mapN(models.CalculatedSpend.apply _)
  }
  final implicit val DeleteNotificationRequestDecoder: io.circe.Decoder[models.DeleteNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[models.Notification]("Notification")).mapN(models.DeleteNotificationRequest.apply _)
  }
  final implicit val DescribeSubscribersForNotificationResponseDecoder: io.circe.Decoder[models.DescribeSubscribersForNotificationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Subscriber]]]("Subscribers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeSubscribersForNotificationResponse.apply _)
  }
  final implicit val DeleteSubscriberResponseDecoder: io.circe.Decoder[models.DeleteSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteSubscriberResponse)
  final implicit val DescribeNotificationsForBudgetRequestDecoder: io.circe.Decoder[models.DescribeNotificationsForBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeNotificationsForBudgetRequest.apply _)
  }
  final implicit val UpdateBudgetRequestDecoder: io.circe.Decoder[models.UpdateBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[models.Budget]("NewBudget")).mapN(models.UpdateBudgetRequest.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InternalErrorException.apply _)
  }
  final implicit val DescribeBudgetResponseDecoder: io.circe.Decoder[models.DescribeBudgetResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Budget]]("Budget").map(models.DescribeBudgetResponse.apply _)
  }
  final implicit val UpdateNotificationRequestDecoder: io.circe.Decoder[models.UpdateNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[models.Notification]("OldNotification"), o.get[models.Notification]("NewNotification")).mapN(models.UpdateNotificationRequest.apply _)
  }
  final implicit val NotificationWithSubscribersDecoder: io.circe.Decoder[models.NotificationWithSubscribers] = io.circe.Decoder.instance { o => 
    (o.get[models.Notification]("Notification"), o.get[scala.List[models.Subscriber]]("Subscribers")).mapN(models.NotificationWithSubscribers.apply _)
  }
  final implicit val CreationLimitExceededExceptionDecoder: io.circe.Decoder[models.CreationLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.CreationLimitExceededException.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.NotFoundException.apply _)
  }
  final implicit val DescribeBudgetsResponseDecoder: io.circe.Decoder[models.DescribeBudgetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Budget]]]("Budgets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeBudgetsResponse.apply _)
  }
  final implicit val CreateNotificationRequestDecoder: io.circe.Decoder[models.CreateNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[models.Notification]("Notification"), o.get[scala.List[models.Subscriber]]("Subscribers")).mapN(models.CreateNotificationRequest.apply _)
  }
  final implicit val CreateNotificationResponseDecoder: io.circe.Decoder[models.CreateNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateNotificationResponse)
  final implicit val DescribeSubscribersForNotificationRequestDecoder: io.circe.Decoder[models.DescribeSubscribersForNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[models.Notification]("Notification"), o.get[java.lang.String]("BudgetName"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.DescribeSubscribersForNotificationRequest.apply _)
  }
  final implicit val DescribeNotificationsForBudgetResponseDecoder: io.circe.Decoder[models.DescribeNotificationsForBudgetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Notification]]]("Notifications"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.DescribeNotificationsForBudgetResponse.apply _)
  }
  final implicit val CreateSubscriberRequestDecoder: io.circe.Decoder[models.CreateSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[models.Notification]("Notification"), o.get[models.Subscriber]("Subscriber")).mapN(models.CreateSubscriberRequest.apply _)
  }
  final implicit val DescribeBudgetRequestDecoder: io.circe.Decoder[models.DescribeBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName")).mapN(models.DescribeBudgetRequest.apply _)
  }
  final implicit val CreateBudgetRequestDecoder: io.circe.Decoder[models.CreateBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[models.Budget]("Budget"), o.get[scala.Option[scala.List[models.NotificationWithSubscribers]]]("NotificationsWithSubscribers")).mapN(models.CreateBudgetRequest.apply _)
  }
  final implicit val SubscriberDecoder: io.circe.Decoder[models.Subscriber] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubscriptionType"), o.get[java.lang.String]("Address")).mapN(models.Subscriber.apply _)
  }
  final implicit val UpdateNotificationResponseDecoder: io.circe.Decoder[models.UpdateNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateNotificationResponse)
  final implicit val UpdateSubscriberResponseDecoder: io.circe.Decoder[models.UpdateSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateSubscriberResponse)
  final implicit val CreateBudgetResponseDecoder: io.circe.Decoder[models.CreateBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(models.CreateBudgetResponse)
}