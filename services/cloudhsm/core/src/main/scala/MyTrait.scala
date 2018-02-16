package avias.cloudhsm
trait Amazoncloudhsm[F[_]] {
  def deleteLunaClient(input: avias.cloudhsm.models.DeleteLunaClientRequest): F[avias.cloudhsm.models.DeleteLunaClientResponse]
  def describeHapg(input: avias.cloudhsm.models.DescribeHapgRequest): F[avias.cloudhsm.models.DescribeHapgResponse]
  def describeLunaClient(input: avias.cloudhsm.models.DescribeLunaClientRequest): F[avias.cloudhsm.models.DescribeLunaClientResponse]
  def modifyLunaClient(input: avias.cloudhsm.models.ModifyLunaClientRequest): F[avias.cloudhsm.models.ModifyLunaClientResponse]
  def createHapg(input: avias.cloudhsm.models.CreateHapgRequest): F[avias.cloudhsm.models.CreateHapgResponse]
  def addTagsToResource(input: avias.cloudhsm.models.AddTagsToResourceRequest): F[avias.cloudhsm.models.AddTagsToResourceResponse]
  def listHapgs(input: avias.cloudhsm.models.ListHapgsRequest): F[avias.cloudhsm.models.ListHapgsResponse]
  def listLunaClients(input: avias.cloudhsm.models.ListLunaClientsRequest): F[avias.cloudhsm.models.ListLunaClientsResponse]
  def deleteHapg(input: avias.cloudhsm.models.DeleteHapgRequest): F[avias.cloudhsm.models.DeleteHapgResponse]
  def getConfig(input: avias.cloudhsm.models.GetConfigRequest): F[avias.cloudhsm.models.GetConfigResponse]
  def listTagsForResource(input: avias.cloudhsm.models.ListTagsForResourceRequest): F[avias.cloudhsm.models.ListTagsForResourceResponse]
  def listAvailableZones: F[avias.cloudhsm.models.ListAvailableZonesResponse]
  def modifyHapg(input: avias.cloudhsm.models.ModifyHapgRequest): F[avias.cloudhsm.models.ModifyHapgResponse]
  def removeTagsFromResource(input: avias.cloudhsm.models.RemoveTagsFromResourceRequest): F[avias.cloudhsm.models.RemoveTagsFromResourceResponse]
  def listHsms(input: avias.cloudhsm.models.ListHsmsRequest): F[avias.cloudhsm.models.ListHsmsResponse]
  def deleteHsm(input: avias.cloudhsm.models.DeleteHsmRequest): F[avias.cloudhsm.models.DeleteHsmResponse]
  def createHsm(input: avias.cloudhsm.models.CreateHsmRequest): F[avias.cloudhsm.models.CreateHsmResponse]
  def createLunaClient(input: avias.cloudhsm.models.CreateLunaClientRequest): F[avias.cloudhsm.models.CreateLunaClientResponse]
  def describeHsm(input: avias.cloudhsm.models.DescribeHsmRequest): F[avias.cloudhsm.models.DescribeHsmResponse]
  def modifyHsm(input: avias.cloudhsm.models.ModifyHsmRequest): F[avias.cloudhsm.models.ModifyHsmResponse]
}