package org.lyranthe.araethura.athena
trait Amazonathena[F[_]] {
  def listQueryExecutions(input: models.ListQueryExecutionsInput): F[models.ListQueryExecutionsOutput]
  def getQueryExecution(input: models.GetQueryExecutionInput): F[models.GetQueryExecutionOutput]
  def deleteNamedQuery(input: models.DeleteNamedQueryInput): F[scala.Unit]
  def batchGetQueryExecution(input: models.BatchGetQueryExecutionInput): F[models.BatchGetQueryExecutionOutput]
  def getNamedQuery(input: models.GetNamedQueryInput): F[models.GetNamedQueryOutput]
  def stopQueryExecution(input: models.StopQueryExecutionInput): F[scala.Unit]
  def getQueryResults(input: models.GetQueryResultsInput): F[models.GetQueryResultsOutput]
  def createNamedQuery(input: models.CreateNamedQueryInput): F[models.CreateNamedQueryOutput]
  def startQueryExecution(input: models.StartQueryExecutionInput): F[models.StartQueryExecutionOutput]
  def batchGetNamedQuery(input: models.BatchGetNamedQueryInput): F[models.BatchGetNamedQueryOutput]
  def listNamedQueries(input: models.ListNamedQueriesInput): F[models.ListNamedQueriesOutput]
}