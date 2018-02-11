package org.lyranthe.araethura.acm
trait Amazonacm[F[_]] {
  def deleteCertificate(input: models.DeleteCertificateRequest): F[Unit]
  def addTagsToCertificate(input: models.AddTagsToCertificateRequest): F[Unit]
  def listTagsForCertificate(input: models.ListTagsForCertificateRequest): F[models.ListTagsForCertificateResponse]
  def removeTagsFromCertificate(input: models.RemoveTagsFromCertificateRequest): F[Unit]
  def importCertificate(input: models.ImportCertificateRequest): F[models.ImportCertificateResponse]
  def listCertificates(input: models.ListCertificatesRequest): F[models.ListCertificatesResponse]
  def describeCertificate(input: models.DescribeCertificateRequest): F[models.DescribeCertificateResponse]
  def getCertificate(input: models.GetCertificateRequest): F[models.GetCertificateResponse]
  def requestCertificate(input: models.RequestCertificateRequest): F[models.RequestCertificateResponse]
  def resendValidationEmail(input: models.ResendValidationEmailRequest): F[Unit]
}