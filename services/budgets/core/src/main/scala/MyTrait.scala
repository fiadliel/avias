package org.lyranthe.araethura.budgets
trait Amazonbudgets[F[_]] {
  def describeSubscribersForNotification(input: org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationRequest): F[org.lyranthe.araethura.budgets.models.DescribeSubscribersForNotificationResponse]
  def createSubscriber(input: org.lyranthe.araethura.budgets.models.CreateSubscriberRequest): F[scala.Unit]
  def deleteSubscriber(input: org.lyranthe.araethura.budgets.models.DeleteSubscriberRequest): F[scala.Unit]
  def createBudget(input: org.lyranthe.araethura.budgets.models.CreateBudgetRequest): F[scala.Unit]
  def describeBudget(input: org.lyranthe.araethura.budgets.models.DescribeBudgetRequest): F[org.lyranthe.araethura.budgets.models.DescribeBudgetResponse]
  def deleteBudget(input: org.lyranthe.araethura.budgets.models.DeleteBudgetRequest): F[scala.Unit]
  def updateSubscriber(input: org.lyranthe.araethura.budgets.models.UpdateSubscriberRequest): F[scala.Unit]
  def describeNotificationsForBudget(input: org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetRequest): F[org.lyranthe.araethura.budgets.models.DescribeNotificationsForBudgetResponse]
  def describeBudgets(input: org.lyranthe.araethura.budgets.models.DescribeBudgetsRequest): F[org.lyranthe.araethura.budgets.models.DescribeBudgetsResponse]
  def updateBudget(input: org.lyranthe.araethura.budgets.models.UpdateBudgetRequest): F[scala.Unit]
  def deleteNotification(input: org.lyranthe.araethura.budgets.models.DeleteNotificationRequest): F[scala.Unit]
  def createNotification(input: org.lyranthe.araethura.budgets.models.CreateNotificationRequest): F[scala.Unit]
  def updateNotification(input: org.lyranthe.araethura.budgets.models.UpdateNotificationRequest): F[scala.Unit]
}