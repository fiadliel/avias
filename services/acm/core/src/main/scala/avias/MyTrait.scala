package avias.acm
trait Amazonacm[F[_]] {
  def deleteCertificate(input: avias.acm.models.DeleteCertificateRequest): F[scala.Unit]
  def addTagsToCertificate(input: avias.acm.models.AddTagsToCertificateRequest): F[scala.Unit]
  def listTagsForCertificate(input: avias.acm.models.ListTagsForCertificateRequest): F[avias.acm.models.ListTagsForCertificateResponse]
  def removeTagsFromCertificate(input: avias.acm.models.RemoveTagsFromCertificateRequest): F[scala.Unit]
  def importCertificate(input: avias.acm.models.ImportCertificateRequest): F[avias.acm.models.ImportCertificateResponse]
  def listCertificates(input: avias.acm.models.ListCertificatesRequest): F[avias.acm.models.ListCertificatesResponse]
  def describeCertificate(input: avias.acm.models.DescribeCertificateRequest): F[avias.acm.models.DescribeCertificateResponse]
  def getCertificate(input: avias.acm.models.GetCertificateRequest): F[avias.acm.models.GetCertificateResponse]
  def requestCertificate(input: avias.acm.models.RequestCertificateRequest): F[avias.acm.models.RequestCertificateResponse]
  def resendValidationEmail(input: avias.acm.models.ResendValidationEmailRequest): F[scala.Unit]
}