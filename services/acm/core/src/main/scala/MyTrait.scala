package org.lyranthe.araethura.acm
trait Amazonacm[F[_]] {
  def deleteCertificate(input: org.lyranthe.araethura.acm.models.DeleteCertificateRequest): F[scala.Unit]
  def addTagsToCertificate(input: org.lyranthe.araethura.acm.models.AddTagsToCertificateRequest): F[scala.Unit]
  def listTagsForCertificate(input: org.lyranthe.araethura.acm.models.ListTagsForCertificateRequest): F[org.lyranthe.araethura.acm.models.ListTagsForCertificateResponse]
  def removeTagsFromCertificate(input: org.lyranthe.araethura.acm.models.RemoveTagsFromCertificateRequest): F[scala.Unit]
  def importCertificate(input: org.lyranthe.araethura.acm.models.ImportCertificateRequest): F[org.lyranthe.araethura.acm.models.ImportCertificateResponse]
  def listCertificates(input: org.lyranthe.araethura.acm.models.ListCertificatesRequest): F[org.lyranthe.araethura.acm.models.ListCertificatesResponse]
  def describeCertificate(input: org.lyranthe.araethura.acm.models.DescribeCertificateRequest): F[org.lyranthe.araethura.acm.models.DescribeCertificateResponse]
  def getCertificate(input: org.lyranthe.araethura.acm.models.GetCertificateRequest): F[org.lyranthe.araethura.acm.models.GetCertificateResponse]
  def requestCertificate(input: org.lyranthe.araethura.acm.models.RequestCertificateRequest): F[org.lyranthe.araethura.acm.models.RequestCertificateResponse]
  def resendValidationEmail(input: org.lyranthe.araethura.acm.models.ResendValidationEmailRequest): F[scala.Unit]
}