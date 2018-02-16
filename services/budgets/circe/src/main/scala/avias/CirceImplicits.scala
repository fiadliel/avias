package avias.budgets
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DeleteBudgetRequestEncoder: io.circe.Encoder[avias.budgets.models.DeleteBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson)
  }
  final implicit val UpdateBudgetResponseEncoder: io.circe.Encoder[avias.budgets.models.UpdateBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotificationEncoder: io.circe.Encoder[avias.budgets.models.Notification] = io.circe.Encoder.instance { o => 
    Json.obj("NotificationType" -> o.notificationType.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "Threshold" -> o.threshold.asJson, "ThresholdType" -> o.thresholdType.asJson)
  }
  final implicit val DeleteBudgetResponseEncoder: io.circe.Encoder[avias.budgets.models.DeleteBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CostTypesEncoder: io.circe.Encoder[avias.budgets.models.CostTypes] = io.circe.Encoder.instance { o => 
    Json.obj("IncludeTax" -> o.includeTax.asJson, "IncludeSubscription" -> o.includeSubscription.asJson, "UseBlended" -> o.useBlended.asJson)
  }
  final implicit val UpdateSubscriberRequestEncoder: io.circe.Encoder[avias.budgets.models.UpdateSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "OldSubscriber" -> o.oldSubscriber.asJson, "NewSubscriber" -> o.newSubscriber.asJson)
  }
  final implicit val TimePeriodEncoder: io.circe.Encoder[avias.budgets.models.TimePeriod] = io.circe.Encoder.instance { o => 
    Json.obj("Start" -> o.start.asJson, "End" -> o.end.asJson)
  }
  final implicit val DeleteSubscriberRequestEncoder: io.circe.Encoder[avias.budgets.models.DeleteSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscriber" -> o.subscriber.asJson)
  }
  final implicit val ExpiredNextTokenExceptionEncoder: io.circe.Encoder[avias.budgets.models.ExpiredNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[avias.budgets.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateRecordExceptionEncoder: io.circe.Encoder[avias.budgets.models.DuplicateRecordException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val SpendEncoder: io.circe.Encoder[avias.budgets.models.Spend] = io.circe.Encoder.instance { o => 
    Json.obj("Amount" -> o.amount.asJson, "Unit" -> o.unit.asJson)
  }
  final implicit val CreateSubscriberResponseEncoder: io.circe.Encoder[avias.budgets.models.CreateSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeBudgetsRequestEncoder: io.circe.Encoder[avias.budgets.models.DescribeBudgetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.budgets.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteNotificationResponseEncoder: io.circe.Encoder[avias.budgets.models.DeleteNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BudgetEncoder: io.circe.Encoder[avias.budgets.models.Budget] = io.circe.Encoder.instance { o => 
    Json.obj("CostTypes" -> o.costTypes.asJson, "BudgetType" -> o.budgetType.asJson, "TimePeriod" -> o.timePeriod.asJson, "BudgetLimit" -> o.budgetLimit.asJson, "BudgetName" -> o.budgetName.asJson, "TimeUnit" -> o.timeUnit.asJson, "CostFilters" -> o.costFilters.asJson, "CalculatedSpend" -> o.calculatedSpend.asJson)
  }
  final implicit val CalculatedSpendEncoder: io.circe.Encoder[avias.budgets.models.CalculatedSpend] = io.circe.Encoder.instance { o => 
    Json.obj("ActualSpend" -> o.actualSpend.asJson, "ForecastedSpend" -> o.forecastedSpend.asJson)
  }
  final implicit val DeleteNotificationRequestEncoder: io.circe.Encoder[avias.budgets.models.DeleteNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson)
  }
  final implicit val DescribeSubscribersForNotificationResponseEncoder: io.circe.Encoder[avias.budgets.models.DescribeSubscribersForNotificationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Subscribers" -> o.subscribers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteSubscriberResponseEncoder: io.circe.Encoder[avias.budgets.models.DeleteSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeNotificationsForBudgetRequestEncoder: io.circe.Encoder[avias.budgets.models.DescribeNotificationsForBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateBudgetRequestEncoder: io.circe.Encoder[avias.budgets.models.UpdateBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "NewBudget" -> o.newBudget.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[avias.budgets.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeBudgetResponseEncoder: io.circe.Encoder[avias.budgets.models.DescribeBudgetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Budget" -> o.budget.asJson)
  }
  final implicit val UpdateNotificationRequestEncoder: io.circe.Encoder[avias.budgets.models.UpdateNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "OldNotification" -> o.oldNotification.asJson, "NewNotification" -> o.newNotification.asJson)
  }
  final implicit val NotificationWithSubscribersEncoder: io.circe.Encoder[avias.budgets.models.NotificationWithSubscribers] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "Subscribers" -> o.subscribers.asJson)
  }
  final implicit val CreationLimitExceededExceptionEncoder: io.circe.Encoder[avias.budgets.models.CreationLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[avias.budgets.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeBudgetsResponseEncoder: io.circe.Encoder[avias.budgets.models.DescribeBudgetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Budgets" -> o.budgets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateNotificationRequestEncoder: io.circe.Encoder[avias.budgets.models.CreateNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscribers" -> o.subscribers.asJson)
  }
  final implicit val CreateNotificationResponseEncoder: io.circe.Encoder[avias.budgets.models.CreateNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubscribersForNotificationRequestEncoder: io.circe.Encoder[avias.budgets.models.DescribeSubscribersForNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "BudgetName" -> o.budgetName.asJson, "AccountId" -> o.accountId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeNotificationsForBudgetResponseEncoder: io.circe.Encoder[avias.budgets.models.DescribeNotificationsForBudgetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Notifications" -> o.notifications.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateSubscriberRequestEncoder: io.circe.Encoder[avias.budgets.models.CreateSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscriber" -> o.subscriber.asJson)
  }
  final implicit val DescribeBudgetRequestEncoder: io.circe.Encoder[avias.budgets.models.DescribeBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson)
  }
  final implicit val CreateBudgetRequestEncoder: io.circe.Encoder[avias.budgets.models.CreateBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "Budget" -> o.budget.asJson, "NotificationsWithSubscribers" -> o.notificationsWithSubscribers.asJson)
  }
  final implicit val SubscriberEncoder: io.circe.Encoder[avias.budgets.models.Subscriber] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionType" -> o.subscriptionType.asJson, "Address" -> o.address.asJson)
  }
  final implicit val UpdateNotificationResponseEncoder: io.circe.Encoder[avias.budgets.models.UpdateNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateSubscriberResponseEncoder: io.circe.Encoder[avias.budgets.models.UpdateSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateBudgetResponseEncoder: io.circe.Encoder[avias.budgets.models.CreateBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteBudgetRequestDecoder: io.circe.Decoder[avias.budgets.models.DeleteBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName")).mapN(avias.budgets.models.DeleteBudgetRequest.apply _)
  }
  final implicit val UpdateBudgetResponseDecoder: io.circe.Decoder[avias.budgets.models.UpdateBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.UpdateBudgetResponse)
  final implicit val NotificationDecoder: io.circe.Decoder[avias.budgets.models.Notification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NotificationType"), o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Double]("Threshold"), o.get[scala.Option[java.lang.String]]("ThresholdType")).mapN(avias.budgets.models.Notification.apply _)
  }
  final implicit val DeleteBudgetResponseDecoder: io.circe.Decoder[avias.budgets.models.DeleteBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.DeleteBudgetResponse)
  final implicit val CostTypesDecoder: io.circe.Decoder[avias.budgets.models.CostTypes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("IncludeTax"), o.get[scala.Boolean]("IncludeSubscription"), o.get[scala.Boolean]("UseBlended")).mapN(avias.budgets.models.CostTypes.apply _)
  }
  final implicit val UpdateSubscriberRequestDecoder: io.circe.Decoder[avias.budgets.models.UpdateSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[avias.budgets.models.Notification]("Notification"), o.get[avias.budgets.models.Subscriber]("OldSubscriber"), o.get[avias.budgets.models.Subscriber]("NewSubscriber")).mapN(avias.budgets.models.UpdateSubscriberRequest.apply _)
  }
  final implicit val TimePeriodDecoder: io.circe.Decoder[avias.budgets.models.TimePeriod] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Start"), o.get[java.time.Instant]("End")).mapN(avias.budgets.models.TimePeriod.apply _)
  }
  final implicit val DeleteSubscriberRequestDecoder: io.circe.Decoder[avias.budgets.models.DeleteSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[avias.budgets.models.Notification]("Notification"), o.get[avias.budgets.models.Subscriber]("Subscriber")).mapN(avias.budgets.models.DeleteSubscriberRequest.apply _)
  }
  final implicit val ExpiredNextTokenExceptionDecoder: io.circe.Decoder[avias.budgets.models.ExpiredNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.ExpiredNextTokenException.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[avias.budgets.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.InvalidNextTokenException.apply _)
  }
  final implicit val DuplicateRecordExceptionDecoder: io.circe.Decoder[avias.budgets.models.DuplicateRecordException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.DuplicateRecordException.apply _)
  }
  final implicit val SpendDecoder: io.circe.Decoder[avias.budgets.models.Spend] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Amount"), o.get[java.lang.String]("Unit")).mapN(avias.budgets.models.Spend.apply _)
  }
  final implicit val CreateSubscriberResponseDecoder: io.circe.Decoder[avias.budgets.models.CreateSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.CreateSubscriberResponse)
  final implicit val DescribeBudgetsRequestDecoder: io.circe.Decoder[avias.budgets.models.DescribeBudgetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.budgets.models.DescribeBudgetsRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.budgets.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.InvalidParameterException.apply _)
  }
  final implicit val DeleteNotificationResponseDecoder: io.circe.Decoder[avias.budgets.models.DeleteNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.DeleteNotificationResponse)
  final implicit val BudgetDecoder: io.circe.Decoder[avias.budgets.models.Budget] = io.circe.Decoder.instance { o => 
    (o.get[avias.budgets.models.CostTypes]("CostTypes"), o.get[java.lang.String]("BudgetType"), o.get[avias.budgets.models.TimePeriod]("TimePeriod"), o.get[avias.budgets.models.Spend]("BudgetLimit"), o.get[java.lang.String]("BudgetName"), o.get[java.lang.String]("TimeUnit"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("CostFilters"), o.get[scala.Option[avias.budgets.models.CalculatedSpend]]("CalculatedSpend")).mapN(avias.budgets.models.Budget.apply _)
  }
  final implicit val CalculatedSpendDecoder: io.circe.Decoder[avias.budgets.models.CalculatedSpend] = io.circe.Decoder.instance { o => 
    (o.get[avias.budgets.models.Spend]("ActualSpend"), o.get[scala.Option[avias.budgets.models.Spend]]("ForecastedSpend")).mapN(avias.budgets.models.CalculatedSpend.apply _)
  }
  final implicit val DeleteNotificationRequestDecoder: io.circe.Decoder[avias.budgets.models.DeleteNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[avias.budgets.models.Notification]("Notification")).mapN(avias.budgets.models.DeleteNotificationRequest.apply _)
  }
  final implicit val DescribeSubscribersForNotificationResponseDecoder: io.circe.Decoder[avias.budgets.models.DescribeSubscribersForNotificationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.budgets.models.Subscriber]]]("Subscribers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.budgets.models.DescribeSubscribersForNotificationResponse.apply _)
  }
  final implicit val DeleteSubscriberResponseDecoder: io.circe.Decoder[avias.budgets.models.DeleteSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.DeleteSubscriberResponse)
  final implicit val DescribeNotificationsForBudgetRequestDecoder: io.circe.Decoder[avias.budgets.models.DescribeNotificationsForBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.budgets.models.DescribeNotificationsForBudgetRequest.apply _)
  }
  final implicit val UpdateBudgetRequestDecoder: io.circe.Decoder[avias.budgets.models.UpdateBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[avias.budgets.models.Budget]("NewBudget")).mapN(avias.budgets.models.UpdateBudgetRequest.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[avias.budgets.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.InternalErrorException.apply _)
  }
  final implicit val DescribeBudgetResponseDecoder: io.circe.Decoder[avias.budgets.models.DescribeBudgetResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.budgets.models.Budget]]("Budget").map(avias.budgets.models.DescribeBudgetResponse.apply _)
  }
  final implicit val UpdateNotificationRequestDecoder: io.circe.Decoder[avias.budgets.models.UpdateNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[avias.budgets.models.Notification]("OldNotification"), o.get[avias.budgets.models.Notification]("NewNotification")).mapN(avias.budgets.models.UpdateNotificationRequest.apply _)
  }
  final implicit val NotificationWithSubscribersDecoder: io.circe.Decoder[avias.budgets.models.NotificationWithSubscribers] = io.circe.Decoder.instance { o => 
    (o.get[avias.budgets.models.Notification]("Notification"), o.get[scala.List[avias.budgets.models.Subscriber]]("Subscribers")).mapN(avias.budgets.models.NotificationWithSubscribers.apply _)
  }
  final implicit val CreationLimitExceededExceptionDecoder: io.circe.Decoder[avias.budgets.models.CreationLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.CreationLimitExceededException.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[avias.budgets.models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.budgets.models.NotFoundException.apply _)
  }
  final implicit val DescribeBudgetsResponseDecoder: io.circe.Decoder[avias.budgets.models.DescribeBudgetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.budgets.models.Budget]]]("Budgets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.budgets.models.DescribeBudgetsResponse.apply _)
  }
  final implicit val CreateNotificationRequestDecoder: io.circe.Decoder[avias.budgets.models.CreateNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[avias.budgets.models.Notification]("Notification"), o.get[scala.List[avias.budgets.models.Subscriber]]("Subscribers")).mapN(avias.budgets.models.CreateNotificationRequest.apply _)
  }
  final implicit val CreateNotificationResponseDecoder: io.circe.Decoder[avias.budgets.models.CreateNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.CreateNotificationResponse)
  final implicit val DescribeSubscribersForNotificationRequestDecoder: io.circe.Decoder[avias.budgets.models.DescribeSubscribersForNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.budgets.models.Notification]("Notification"), o.get[java.lang.String]("BudgetName"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.budgets.models.DescribeSubscribersForNotificationRequest.apply _)
  }
  final implicit val DescribeNotificationsForBudgetResponseDecoder: io.circe.Decoder[avias.budgets.models.DescribeNotificationsForBudgetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.budgets.models.Notification]]]("Notifications"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.budgets.models.DescribeNotificationsForBudgetResponse.apply _)
  }
  final implicit val CreateSubscriberRequestDecoder: io.circe.Decoder[avias.budgets.models.CreateSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[avias.budgets.models.Notification]("Notification"), o.get[avias.budgets.models.Subscriber]("Subscriber")).mapN(avias.budgets.models.CreateSubscriberRequest.apply _)
  }
  final implicit val DescribeBudgetRequestDecoder: io.circe.Decoder[avias.budgets.models.DescribeBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName")).mapN(avias.budgets.models.DescribeBudgetRequest.apply _)
  }
  final implicit val CreateBudgetRequestDecoder: io.circe.Decoder[avias.budgets.models.CreateBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[avias.budgets.models.Budget]("Budget"), o.get[scala.Option[scala.List[avias.budgets.models.NotificationWithSubscribers]]]("NotificationsWithSubscribers")).mapN(avias.budgets.models.CreateBudgetRequest.apply _)
  }
  final implicit val SubscriberDecoder: io.circe.Decoder[avias.budgets.models.Subscriber] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubscriptionType"), o.get[java.lang.String]("Address")).mapN(avias.budgets.models.Subscriber.apply _)
  }
  final implicit val UpdateNotificationResponseDecoder: io.circe.Decoder[avias.budgets.models.UpdateNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.UpdateNotificationResponse)
  final implicit val UpdateSubscriberResponseDecoder: io.circe.Decoder[avias.budgets.models.UpdateSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.UpdateSubscriberResponse)
  final implicit val CreateBudgetResponseDecoder: io.circe.Decoder[avias.budgets.models.CreateBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(avias.budgets.models.CreateBudgetResponse)
}