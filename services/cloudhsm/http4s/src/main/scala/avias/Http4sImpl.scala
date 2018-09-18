package avias.cloudhsm.http4s
import org.http4s.Method._
import avias.cloudhsm.circe._
import avias.cloudhsm.models
import avias.common.http4s.ClientUtils._
class AmazoncloudhsmClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.cloudhsm.Amazoncloudhsm[F] {
  private[this] final val ServiceType: String = "cloudhsm"
  private[this] final val ServiceAndPrefix: Option[String] = Some("CloudHsmFrontendService")
  override def deleteLunaClient(input: avias.cloudhsm.models.DeleteLunaClientRequest): F[avias.cloudhsm.models.DeleteLunaClientResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.DeleteLunaClientResponse, avias.cloudhsm.models.DeleteLunaClientRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteLunaClient", POST, "/", input)
  override def describeHapg(input: avias.cloudhsm.models.DescribeHapgRequest): F[avias.cloudhsm.models.DescribeHapgResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.DescribeHapgResponse, avias.cloudhsm.models.DescribeHapgRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeHapg", POST, "/", input)
  override def describeLunaClient(input: avias.cloudhsm.models.DescribeLunaClientRequest): F[avias.cloudhsm.models.DescribeLunaClientResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.DescribeLunaClientResponse, avias.cloudhsm.models.DescribeLunaClientRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeLunaClient", POST, "/", input)
  override def modifyLunaClient(input: avias.cloudhsm.models.ModifyLunaClientRequest): F[avias.cloudhsm.models.ModifyLunaClientResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ModifyLunaClientResponse, avias.cloudhsm.models.ModifyLunaClientRequest](client, awsData, ServiceType, ServiceAndPrefix, "ModifyLunaClient", POST, "/", input)
  override def createHapg(input: avias.cloudhsm.models.CreateHapgRequest): F[avias.cloudhsm.models.CreateHapgResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.CreateHapgResponse, avias.cloudhsm.models.CreateHapgRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateHapg", POST, "/", input)
  override def addTagsToResource(input: avias.cloudhsm.models.AddTagsToResourceRequest): F[avias.cloudhsm.models.AddTagsToResourceResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.AddTagsToResourceResponse, avias.cloudhsm.models.AddTagsToResourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddTagsToResource", POST, "/", input)
  override def listHapgs(input: avias.cloudhsm.models.ListHapgsRequest): F[avias.cloudhsm.models.ListHapgsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ListHapgsResponse, avias.cloudhsm.models.ListHapgsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListHapgs", POST, "/", input)
  override def listLunaClients(input: avias.cloudhsm.models.ListLunaClientsRequest): F[avias.cloudhsm.models.ListLunaClientsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ListLunaClientsResponse, avias.cloudhsm.models.ListLunaClientsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListLunaClients", POST, "/", input)
  override def deleteHapg(input: avias.cloudhsm.models.DeleteHapgRequest): F[avias.cloudhsm.models.DeleteHapgResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.DeleteHapgResponse, avias.cloudhsm.models.DeleteHapgRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteHapg", POST, "/", input)
  override def getConfig(input: avias.cloudhsm.models.GetConfigRequest): F[avias.cloudhsm.models.GetConfigResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.GetConfigResponse, avias.cloudhsm.models.GetConfigRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetConfig", POST, "/", input)
  override def listTagsForResource(input: avias.cloudhsm.models.ListTagsForResourceRequest): F[avias.cloudhsm.models.ListTagsForResourceResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ListTagsForResourceResponse, avias.cloudhsm.models.ListTagsForResourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTagsForResource", POST, "/", input)
  override def listAvailableZones: F[avias.cloudhsm.models.ListAvailableZonesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ListAvailableZonesResponse, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "ListAvailableZones", POST, "/", ())
  override def modifyHapg(input: avias.cloudhsm.models.ModifyHapgRequest): F[avias.cloudhsm.models.ModifyHapgResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ModifyHapgResponse, avias.cloudhsm.models.ModifyHapgRequest](client, awsData, ServiceType, ServiceAndPrefix, "ModifyHapg", POST, "/", input)
  override def removeTagsFromResource(input: avias.cloudhsm.models.RemoveTagsFromResourceRequest): F[avias.cloudhsm.models.RemoveTagsFromResourceResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.RemoveTagsFromResourceResponse, avias.cloudhsm.models.RemoveTagsFromResourceRequest](client, awsData, ServiceType, ServiceAndPrefix, "RemoveTagsFromResource", POST, "/", input)
  override def listHsms(input: avias.cloudhsm.models.ListHsmsRequest): F[avias.cloudhsm.models.ListHsmsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ListHsmsResponse, avias.cloudhsm.models.ListHsmsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListHsms", POST, "/", input)
  override def deleteHsm(input: avias.cloudhsm.models.DeleteHsmRequest): F[avias.cloudhsm.models.DeleteHsmResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.DeleteHsmResponse, avias.cloudhsm.models.DeleteHsmRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteHsm", POST, "/", input)
  override def createHsm(input: avias.cloudhsm.models.CreateHsmRequest): F[avias.cloudhsm.models.CreateHsmResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.CreateHsmResponse, avias.cloudhsm.models.CreateHsmRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateHsm", POST, "/", input)
  override def createLunaClient(input: avias.cloudhsm.models.CreateLunaClientRequest): F[avias.cloudhsm.models.CreateLunaClientResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.CreateLunaClientResponse, avias.cloudhsm.models.CreateLunaClientRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateLunaClient", POST, "/", input)
  override def describeHsm(input: avias.cloudhsm.models.DescribeHsmRequest): F[avias.cloudhsm.models.DescribeHsmResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.DescribeHsmResponse, avias.cloudhsm.models.DescribeHsmRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeHsm", POST, "/", input)
  override def modifyHsm(input: avias.cloudhsm.models.ModifyHsmRequest): F[avias.cloudhsm.models.ModifyHsmResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudhsm.models.ModifyHsmResponse, avias.cloudhsm.models.ModifyHsmRequest](client, awsData, ServiceType, ServiceAndPrefix, "ModifyHsm", POST, "/", input)
}