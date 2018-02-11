package org.lyranthe.araethura.budgets
trait Amazonbudgets[F[_]] {
  def describeSubscribersForNotification(input: models.DescribeSubscribersForNotificationRequest): F[models.DescribeSubscribersForNotificationResponse]
  def createSubscriber(input: models.CreateSubscriberRequest): F[scala.Unit]
  def deleteSubscriber(input: models.DeleteSubscriberRequest): F[scala.Unit]
  def createBudget(input: models.CreateBudgetRequest): F[scala.Unit]
  def describeBudget(input: models.DescribeBudgetRequest): F[models.DescribeBudgetResponse]
  def deleteBudget(input: models.DeleteBudgetRequest): F[scala.Unit]
  def updateSubscriber(input: models.UpdateSubscriberRequest): F[scala.Unit]
  def describeNotificationsForBudget(input: models.DescribeNotificationsForBudgetRequest): F[models.DescribeNotificationsForBudgetResponse]
  def describeBudgets(input: models.DescribeBudgetsRequest): F[models.DescribeBudgetsResponse]
  def updateBudget(input: models.UpdateBudgetRequest): F[scala.Unit]
  def deleteNotification(input: models.DeleteNotificationRequest): F[scala.Unit]
  def createNotification(input: models.CreateNotificationRequest): F[scala.Unit]
  def updateNotification(input: models.UpdateNotificationRequest): F[scala.Unit]
}