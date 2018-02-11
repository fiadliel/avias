package org.lyranthe.araethura.budgets.models
import org.lyranthe.araethura.budgets.models
final case class DeleteBudgetRequest(accountId: java.lang.String, budgetName: java.lang.String)
case object UpdateBudgetResponse
final case class Notification(notificationType: java.lang.String, comparisonOperator: java.lang.String, threshold: scala.Double, thresholdType: scala.Option[java.lang.String] = None)
case object DeleteBudgetResponse
final case class CostTypes(includeTax: scala.Boolean, includeSubscription: scala.Boolean, useBlended: scala.Boolean)
final case class UpdateSubscriberRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: models.Notification, oldSubscriber: models.Subscriber, newSubscriber: models.Subscriber)
final case class TimePeriod(start: java.time.Instant, end: java.time.Instant)
final case class DeleteSubscriberRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: models.Notification, subscriber: models.Subscriber)
final case class ExpiredNextTokenException(message: scala.Option[java.lang.String] = None)
final case class InvalidNextTokenException(message: scala.Option[java.lang.String] = None)
final case class DuplicateRecordException(message: scala.Option[java.lang.String] = None)
final case class Spend(amount: java.lang.String, unit: java.lang.String)
case object CreateSubscriberResponse
final case class DescribeBudgetsRequest(accountId: java.lang.String, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = None)
case object DeleteNotificationResponse
final case class Budget(costTypes: models.CostTypes, budgetType: java.lang.String, timePeriod: models.TimePeriod, budgetLimit: models.Spend, budgetName: java.lang.String, timeUnit: java.lang.String, costFilters: scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[java.lang.String]]] = None, calculatedSpend: scala.Option[models.CalculatedSpend] = None)
final case class CalculatedSpend(actualSpend: models.Spend, forecastedSpend: scala.Option[models.Spend] = None)
final case class DeleteNotificationRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: models.Notification)
final case class DescribeSubscribersForNotificationResponse(subscribers: scala.Option[scala.List[models.Subscriber]] = None, nextToken: scala.Option[java.lang.String] = None)
case object DeleteSubscriberResponse
final case class DescribeNotificationsForBudgetRequest(accountId: java.lang.String, budgetName: java.lang.String, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class UpdateBudgetRequest(accountId: java.lang.String, newBudget: models.Budget)
final case class InternalErrorException(message: scala.Option[java.lang.String] = None)
final case class DescribeBudgetResponse(budget: scala.Option[models.Budget] = None)
final case class UpdateNotificationRequest(accountId: java.lang.String, budgetName: java.lang.String, oldNotification: models.Notification, newNotification: models.Notification)
final case class NotificationWithSubscribers(notification: models.Notification, subscribers: scala.List[models.Subscriber])
final case class CreationLimitExceededException(message: scala.Option[java.lang.String] = None)
final case class NotFoundException(message: scala.Option[java.lang.String] = None)
final case class DescribeBudgetsResponse(budgets: scala.Option[scala.List[models.Budget]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CreateNotificationRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: models.Notification, subscribers: scala.List[models.Subscriber])
case object CreateNotificationResponse
final case class DescribeSubscribersForNotificationRequest(notification: models.Notification, budgetName: java.lang.String, accountId: java.lang.String, nextToken: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None)
final case class DescribeNotificationsForBudgetResponse(notifications: scala.Option[scala.List[models.Notification]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CreateSubscriberRequest(accountId: java.lang.String, budgetName: java.lang.String, notification: models.Notification, subscriber: models.Subscriber)
final case class DescribeBudgetRequest(accountId: java.lang.String, budgetName: java.lang.String)
final case class CreateBudgetRequest(accountId: java.lang.String, budget: models.Budget, notificationsWithSubscribers: scala.Option[scala.List[models.NotificationWithSubscribers]] = None)
final case class Subscriber(subscriptionType: java.lang.String, address: java.lang.String)
case object UpdateNotificationResponse
case object UpdateSubscriberResponse
case object CreateBudgetResponse