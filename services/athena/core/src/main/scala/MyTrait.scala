package avias.athena
trait Amazonathena[F[_]] {
  def listQueryExecutions(input: avias.athena.models.ListQueryExecutionsInput): F[avias.athena.models.ListQueryExecutionsOutput]
  def getQueryExecution(input: avias.athena.models.GetQueryExecutionInput): F[avias.athena.models.GetQueryExecutionOutput]
  def deleteNamedQuery(input: avias.athena.models.DeleteNamedQueryInput): F[scala.Unit]
  def batchGetQueryExecution(input: avias.athena.models.BatchGetQueryExecutionInput): F[avias.athena.models.BatchGetQueryExecutionOutput]
  def getNamedQuery(input: avias.athena.models.GetNamedQueryInput): F[avias.athena.models.GetNamedQueryOutput]
  def stopQueryExecution(input: avias.athena.models.StopQueryExecutionInput): F[scala.Unit]
  def getQueryResults(input: avias.athena.models.GetQueryResultsInput): F[avias.athena.models.GetQueryResultsOutput]
  def createNamedQuery(input: avias.athena.models.CreateNamedQueryInput): F[avias.athena.models.CreateNamedQueryOutput]
  def startQueryExecution(input: avias.athena.models.StartQueryExecutionInput): F[avias.athena.models.StartQueryExecutionOutput]
  def batchGetNamedQuery(input: avias.athena.models.BatchGetNamedQueryInput): F[avias.athena.models.BatchGetNamedQueryOutput]
  def listNamedQueries(input: avias.athena.models.ListNamedQueriesInput): F[avias.athena.models.ListNamedQueriesOutput]
}