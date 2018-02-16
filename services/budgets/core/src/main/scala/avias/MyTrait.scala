package avias.budgets
trait Amazonbudgets[F[_]] {
  def describeSubscribersForNotification(input: avias.budgets.models.DescribeSubscribersForNotificationRequest): F[avias.budgets.models.DescribeSubscribersForNotificationResponse]
  def createSubscriber(input: avias.budgets.models.CreateSubscriberRequest): F[scala.Unit]
  def deleteSubscriber(input: avias.budgets.models.DeleteSubscriberRequest): F[scala.Unit]
  def createBudget(input: avias.budgets.models.CreateBudgetRequest): F[scala.Unit]
  def describeBudget(input: avias.budgets.models.DescribeBudgetRequest): F[avias.budgets.models.DescribeBudgetResponse]
  def deleteBudget(input: avias.budgets.models.DeleteBudgetRequest): F[scala.Unit]
  def updateSubscriber(input: avias.budgets.models.UpdateSubscriberRequest): F[scala.Unit]
  def describeNotificationsForBudget(input: avias.budgets.models.DescribeNotificationsForBudgetRequest): F[avias.budgets.models.DescribeNotificationsForBudgetResponse]
  def describeBudgets(input: avias.budgets.models.DescribeBudgetsRequest): F[avias.budgets.models.DescribeBudgetsResponse]
  def updateBudget(input: avias.budgets.models.UpdateBudgetRequest): F[scala.Unit]
  def deleteNotification(input: avias.budgets.models.DeleteNotificationRequest): F[scala.Unit]
  def createNotification(input: avias.budgets.models.CreateNotificationRequest): F[scala.Unit]
  def updateNotification(input: avias.budgets.models.UpdateNotificationRequest): F[scala.Unit]
}