package org.lyranthe.araethura.budgets
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DeleteBudgetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DeleteBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson)
  }
  final implicit val UpdateBudgetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.UpdateBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotificationEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.Notification] = io.circe.Encoder.instance { o => 
    Json.obj("NotificationType" -> o.notificationType.asJson, "ComparisonOperator" -> o.comparisonOperator.asJson, "Threshold" -> o.threshold.asJson, "ThresholdType" -> o.thresholdType.asJson)
  }
  final implicit val DeleteBudgetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DeleteBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CostTypesEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CostTypes] = io.circe.Encoder.instance { o => 
    Json.obj("IncludeTax" -> o.includeTax.asJson, "IncludeSubscription" -> o.includeSubscription.asJson, "UseBlended" -> o.useBlended.asJson)
  }
  final implicit val UpdateSubscriberRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.UpdateSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "OldSubscriber" -> o.oldSubscriber.asJson, "NewSubscriber" -> o.newSubscriber.asJson)
  }
  final implicit val TimePeriodEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.TimePeriod] = io.circe.Encoder.instance { o => 
    Json.obj("Start" -> o.start.asJson, "End" -> o.end.asJson)
  }
  final implicit val DeleteSubscriberRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DeleteSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscriber" -> o.subscriber.asJson)
  }
  final implicit val ExpiredNextTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.ExpiredNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidNextTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.InvalidNextTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateRecordExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DuplicateRecordException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val SpendEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.Spend] = io.circe.Encoder.instance { o => 
    Json.obj("Amount" -> o.amount.asJson, "Unit" -> o.unit.asJson)
  }
  final implicit val CreateSubscriberResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreateSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeBudgetsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeBudgetsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeleteNotificationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DeleteNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val BudgetEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.Budget] = io.circe.Encoder.instance { o => 
    Json.obj("CostTypes" -> o.costTypes.asJson, "BudgetType" -> o.budgetType.asJson, "TimePeriod" -> o.timePeriod.asJson, "BudgetLimit" -> o.budgetLimit.asJson, "BudgetName" -> o.budgetName.asJson, "TimeUnit" -> o.timeUnit.asJson, "CostFilters" -> o.costFilters.asJson, "CalculatedSpend" -> o.calculatedSpend.asJson)
  }
  final implicit val CalculatedSpendEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CalculatedSpend] = io.circe.Encoder.instance { o => 
    Json.obj("ActualSpend" -> o.actualSpend.asJson, "ForecastedSpend" -> o.forecastedSpend.asJson)
  }
  final implicit val DeleteNotificationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DeleteNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson)
  }
  final implicit val DescribeSubscribersForNotificationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Subscribers" -> o.subscribers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteSubscriberResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DeleteSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeNotificationsForBudgetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateBudgetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.UpdateBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "NewBudget" -> o.newBudget.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeBudgetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeBudgetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Budget" -> o.budget.asJson)
  }
  final implicit val UpdateNotificationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.UpdateNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "OldNotification" -> o.oldNotification.asJson, "NewNotification" -> o.newNotification.asJson)
  }
  final implicit val NotificationWithSubscribersEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.NotificationWithSubscribers] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "Subscribers" -> o.subscribers.asJson)
  }
  final implicit val CreationLimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreationLimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeBudgetsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeBudgetsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Budgets" -> o.budgets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateNotificationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreateNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscribers" -> o.subscribers.asJson)
  }
  final implicit val CreateNotificationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreateNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeSubscribersForNotificationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Notification" -> o.notification.asJson, "BudgetName" -> o.budgetName.asJson, "AccountId" -> o.accountId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeNotificationsForBudgetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Notifications" -> o.notifications.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateSubscriberRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreateSubscriberRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson, "Notification" -> o.notification.asJson, "Subscriber" -> o.subscriber.asJson)
  }
  final implicit val DescribeBudgetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.DescribeBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "BudgetName" -> o.budgetName.asJson)
  }
  final implicit val CreateBudgetRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreateBudgetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "Budget" -> o.budget.asJson, "NotificationsWithSubscribers" -> o.notificationsWithSubscribers.asJson)
  }
  final implicit val SubscriberEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.Subscriber] = io.circe.Encoder.instance { o => 
    Json.obj("SubscriptionType" -> o.subscriptionType.asJson, "Address" -> o.address.asJson)
  }
  final implicit val UpdateNotificationResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.UpdateNotificationResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UpdateSubscriberResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.UpdateSubscriberResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateBudgetResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.budgets.models.CreateBudgetResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteBudgetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DeleteBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName")).mapN(org.lyranthe.araethura.budgets.models.DeleteBudgetRequest.apply _)
  }
  final implicit val UpdateBudgetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.UpdateBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.UpdateBudgetResponse)
  final implicit val NotificationDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.Notification] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NotificationType"), o.get[java.lang.String]("ComparisonOperator"), o.get[scala.Double]("Threshold"), o.get[scala.Option[java.lang.String]]("ThresholdType")).mapN(org.lyranthe.araethura.budgets.models.Notification.apply _)
  }
  final implicit val DeleteBudgetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DeleteBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.DeleteBudgetResponse)
  final implicit val CostTypesDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CostTypes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("IncludeTax"), o.get[scala.Boolean]("IncludeSubscription"), o.get[scala.Boolean]("UseBlended")).mapN(org.lyranthe.araethura.budgets.models.CostTypes.apply _)
  }
  final implicit val UpdateSubscriberRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.UpdateSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification"), o.get[org.lyranthe.araethura.budgets.models.Subscriber]("OldSubscriber"), o.get[org.lyranthe.araethura.budgets.models.Subscriber]("NewSubscriber")).mapN(org.lyranthe.araethura.budgets.models.UpdateSubscriberRequest.apply _)
  }
  final implicit val TimePeriodDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.TimePeriod] = io.circe.Decoder.instance { o => 
    (o.get[java.time.Instant]("Start"), o.get[java.time.Instant]("End")).mapN(org.lyranthe.araethura.budgets.models.TimePeriod.apply _)
  }
  final implicit val DeleteSubscriberRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DeleteSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification"), o.get[org.lyranthe.araethura.budgets.models.Subscriber]("Subscriber")).mapN(org.lyranthe.araethura.budgets.models.DeleteSubscriberRequest.apply _)
  }
  final implicit val ExpiredNextTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.ExpiredNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.ExpiredNextTokenException.apply _)
  }
  final implicit val InvalidNextTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.InvalidNextTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.InvalidNextTokenException.apply _)
  }
  final implicit val DuplicateRecordExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DuplicateRecordException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.DuplicateRecordException.apply _)
  }
  final implicit val SpendDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.Spend] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Amount"), o.get[java.lang.String]("Unit")).mapN(org.lyranthe.araethura.budgets.models.Spend.apply _)
  }
  final implicit val CreateSubscriberResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreateSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.CreateSubscriberResponse)
  final implicit val DescribeBudgetsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeBudgetsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.budgets.models.DescribeBudgetsRequest.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.InvalidParameterException.apply _)
  }
  final implicit val DeleteNotificationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DeleteNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.DeleteNotificationResponse)
  final implicit val BudgetDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.Budget] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.budgets.models.CostTypes]("CostTypes"), o.get[java.lang.String]("BudgetType"), o.get[org.lyranthe.araethura.budgets.models.TimePeriod]("TimePeriod"), o.get[org.lyranthe.araethura.budgets.models.Spend]("BudgetLimit"), o.get[java.lang.String]("BudgetName"), o.get[java.lang.String]("TimeUnit"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]]]("CostFilters"), o.get[scala.Option[org.lyranthe.araethura.budgets.models.CalculatedSpend]]("CalculatedSpend")).mapN(org.lyranthe.araethura.budgets.models.Budget.apply _)
  }
  final implicit val CalculatedSpendDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CalculatedSpend] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.budgets.models.Spend]("ActualSpend"), o.get[scala.Option[org.lyranthe.araethura.budgets.models.Spend]]("ForecastedSpend")).mapN(org.lyranthe.araethura.budgets.models.CalculatedSpend.apply _)
  }
  final implicit val DeleteNotificationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DeleteNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification")).mapN(org.lyranthe.araethura.budgets.models.DeleteNotificationRequest.apply _)
  }
  final implicit val DescribeSubscribersForNotificationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.budgets.models.Subscriber]]]("Subscribers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationResponse.apply _)
  }
  final implicit val DeleteSubscriberResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DeleteSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.DeleteSubscriberResponse)
  final implicit val DescribeNotificationsForBudgetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetRequest.apply _)
  }
  final implicit val UpdateBudgetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.UpdateBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[org.lyranthe.araethura.budgets.models.Budget]("NewBudget")).mapN(org.lyranthe.araethura.budgets.models.UpdateBudgetRequest.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.InternalErrorException.apply _)
  }
  final implicit val DescribeBudgetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeBudgetResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.budgets.models.Budget]]("Budget").map(org.lyranthe.araethura.budgets.models.DescribeBudgetResponse.apply _)
  }
  final implicit val UpdateNotificationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.UpdateNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[org.lyranthe.araethura.budgets.models.Notification]("OldNotification"), o.get[org.lyranthe.araethura.budgets.models.Notification]("NewNotification")).mapN(org.lyranthe.araethura.budgets.models.UpdateNotificationRequest.apply _)
  }
  final implicit val NotificationWithSubscribersDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.NotificationWithSubscribers] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification"), o.get[scala.List[org.lyranthe.araethura.budgets.models.Subscriber]]("Subscribers")).mapN(org.lyranthe.araethura.budgets.models.NotificationWithSubscribers.apply _)
  }
  final implicit val CreationLimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreationLimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.CreationLimitExceededException.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(org.lyranthe.araethura.budgets.models.NotFoundException.apply _)
  }
  final implicit val DescribeBudgetsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeBudgetsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.budgets.models.Budget]]]("Budgets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.budgets.models.DescribeBudgetsResponse.apply _)
  }
  final implicit val CreateNotificationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreateNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification"), o.get[scala.List[org.lyranthe.araethura.budgets.models.Subscriber]]("Subscribers")).mapN(org.lyranthe.araethura.budgets.models.CreateNotificationRequest.apply _)
  }
  final implicit val CreateNotificationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreateNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.CreateNotificationResponse)
  final implicit val DescribeSubscribersForNotificationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationRequest] = io.circe.Decoder.instance { o => 
    (o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification"), o.get[java.lang.String]("BudgetName"), o.get[java.lang.String]("AccountId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationRequest.apply _)
  }
  final implicit val DescribeNotificationsForBudgetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.budgets.models.Notification]]]("Notifications"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetResponse.apply _)
  }
  final implicit val CreateSubscriberRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreateSubscriberRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName"), o.get[org.lyranthe.araethura.budgets.models.Notification]("Notification"), o.get[org.lyranthe.araethura.budgets.models.Subscriber]("Subscriber")).mapN(org.lyranthe.araethura.budgets.models.CreateSubscriberRequest.apply _)
  }
  final implicit val DescribeBudgetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.DescribeBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("BudgetName")).mapN(org.lyranthe.araethura.budgets.models.DescribeBudgetRequest.apply _)
  }
  final implicit val CreateBudgetRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreateBudgetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[org.lyranthe.araethura.budgets.models.Budget]("Budget"), o.get[scala.Option[scala.List[org.lyranthe.araethura.budgets.models.NotificationWithSubscribers]]]("NotificationsWithSubscribers")).mapN(org.lyranthe.araethura.budgets.models.CreateBudgetRequest.apply _)
  }
  final implicit val SubscriberDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.Subscriber] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubscriptionType"), o.get[java.lang.String]("Address")).mapN(org.lyranthe.araethura.budgets.models.Subscriber.apply _)
  }
  final implicit val UpdateNotificationResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.UpdateNotificationResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.UpdateNotificationResponse)
  final implicit val UpdateSubscriberResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.UpdateSubscriberResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.UpdateSubscriberResponse)
  final implicit val CreateBudgetResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.budgets.models.CreateBudgetResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.budgets.models.CreateBudgetResponse)
}