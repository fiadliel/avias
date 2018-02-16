package avias.budgets.models
final case class DeleteBudgetRequest(accountId: java.lang.String, budgetName: java.lang.String)
case object UpdateBudgetResponse
final case class Notification(notificationType: java.lang.String, comparisonOperator: java.lang.String, threshold: scala.Double, thresholdType: scala.Option[java.lang.String] = scala.None)
case object DeleteBudgetResponse
final case class CostTypes(includeTax: scala.Boolean, includeSubscription: scala.Boolean, useBlended: scala.Boolean)
final case class UpdateSubscriberRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: avias.budgets.models.Notification, oldSubscriber: avias.budgets.models.Subscriber, newSubscriber: avias.budgets.models.Subscriber)
final case class TimePeriod(start: java.time.Instant, end: java.time.Instant)
final case class DeleteSubscriberRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: avias.budgets.models.Notification, subscriber: avias.budgets.models.Subscriber)
final case class ExpiredNextTokenException(message: scala.Option[java.lang.String] = scala.None)
final case class InvalidNextTokenException(message: scala.Option[java.lang.String] = scala.None)
final case class DuplicateRecordException(message: scala.Option[java.lang.String] = scala.None)
final case class Spend(amount: java.lang.String, unit: java.lang.String)
case object CreateSubscriberResponse
final case class DescribeBudgetsRequest(accountId: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
case object DeleteNotificationResponse
final case class Budget(costTypes: avias.budgets.models.CostTypes, budgetType: java.lang.String, timePeriod: avias.budgets.models.TimePeriod, budgetLimit: avias.budgets.models.Spend, budgetName: java.lang.String, timeUnit: java.lang.String, costFilters: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]] = scala.None, calculatedSpend: scala.Option[avias.budgets.models.CalculatedSpend] = scala.None)
final case class CalculatedSpend(actualSpend: avias.budgets.models.Spend, forecastedSpend: scala.Option[avias.budgets.models.Spend] = scala.None)
final case class DeleteNotificationRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: avias.budgets.models.Notification)
final case class DescribeSubscribersForNotificationResponse(subscribers: scala.Option[scala.List[avias.budgets.models.Subscriber]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object DeleteSubscriberResponse
final case class DescribeNotificationsForBudgetRequest(accountId: java.lang.String, budgetName: java.lang.String, maxResults: scala.Option[scala.Int] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class UpdateBudgetRequest(accountId: java.lang.String, newBudget: avias.budgets.models.Budget)
final case class InternalErrorException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeBudgetResponse(budget: scala.Option[avias.budgets.models.Budget] = scala.None)
final case class UpdateNotificationRequest(accountId: java.lang.String, budgetName: java.lang.String, oldNotification: avias.budgets.models.Notification, newNotification: avias.budgets.models.Notification)
final case class NotificationWithSubscribers(notification: avias.budgets.models.Notification, subscribers: scala.List[avias.budgets.models.Subscriber])
final case class CreationLimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class NotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeBudgetsResponse(budgets: scala.Option[scala.List[avias.budgets.models.Budget]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateNotificationRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: avias.budgets.models.Notification, subscribers: scala.List[avias.budgets.models.Subscriber])
case object CreateNotificationResponse
final case class DescribeSubscribersForNotificationRequest(notification: avias.budgets.models.Notification, budgetName: java.lang.String, accountId: java.lang.String, nextToken: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None)
final case class DescribeNotificationsForBudgetResponse(notifications: scala.Option[scala.List[avias.budgets.models.Notification]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateSubscriberRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: avias.budgets.models.Notification, subscriber: avias.budgets.models.Subscriber)
final case class DescribeBudgetRequest(accountId: java.lang.String, budgetName: java.lang.String)
final case class CreateBudgetRequest(accountId: java.lang.String, budget: avias.budgets.models.Budget, notificationsWithSubscribers: scala.Option[scala.List[avias.budgets.models.NotificationWithSubscribers]] = scala.None)
final case class Subscriber(subscriptionType: java.lang.String, address: java.lang.String)
case object UpdateNotificationResponse
case object UpdateSubscriberResponse
case object CreateBudgetResponse