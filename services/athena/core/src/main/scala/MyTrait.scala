package org.lyranthe.araethura.athena
trait Amazonathena[F[_]] {
  def listQueryExecutions(input: org.lyranthe.araethura.athena.models.ListQueryExecutionsInput): F[org.lyranthe.araethura.athena.models.ListQueryExecutionsOutput]
  def getQueryExecution(input: org.lyranthe.araethura.athena.models.GetQueryExecutionInput): F[org.lyranthe.araethura.athena.models.GetQueryExecutionOutput]
  def deleteNamedQuery(input: org.lyranthe.araethura.athena.models.DeleteNamedQueryInput): F[scala.Unit]
  def batchGetQueryExecution(input: org.lyranthe.araethura.athena.models.BatchGetQueryExecutionInput): F[org.lyranthe.araethura.athena.models.BatchGetQueryExecutionOutput]
  def getNamedQuery(input: org.lyranthe.araethura.athena.models.GetNamedQueryInput): F[org.lyranthe.araethura.athena.models.GetNamedQueryOutput]
  def stopQueryExecution(input: org.lyranthe.araethura.athena.models.StopQueryExecutionInput): F[scala.Unit]
  def getQueryResults(input: org.lyranthe.araethura.athena.models.GetQueryResultsInput): F[org.lyranthe.araethura.athena.models.GetQueryResultsOutput]
  def createNamedQuery(input: org.lyranthe.araethura.athena.models.CreateNamedQueryInput): F[org.lyranthe.araethura.athena.models.CreateNamedQueryOutput]
  def startQueryExecution(input: org.lyranthe.araethura.athena.models.StartQueryExecutionInput): F[org.lyranthe.araethura.athena.models.StartQueryExecutionOutput]
  def batchGetNamedQuery(input: org.lyranthe.araethura.athena.models.BatchGetNamedQueryInput): F[org.lyranthe.araethura.athena.models.BatchGetNamedQueryOutput]
  def listNamedQueries(input: org.lyranthe.araethura.athena.models.ListNamedQueriesInput): F[org.lyranthe.araethura.athena.models.ListNamedQueriesOutput]
}