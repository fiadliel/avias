package avias.cloudhsm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ListHsmsResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ListHsmsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmList" -> o.hsmList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.cloudhsm.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ModifyHsmRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ModifyHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson, "SubnetId" -> o.subnetId.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "ExternalId" -> o.externalId.asJson, "EniIp" -> o.eniIp.asJson, "SyslogIp" -> o.syslogIp.asJson)
  }
  final implicit val GetConfigResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.GetConfigResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigType" -> o.configType.asJson, "ConfigFile" -> o.configFile.asJson, "ConfigCred" -> o.configCred.asJson)
  }
  final implicit val DeleteHsmRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.DeleteHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson)
  }
  final implicit val ListHsmsRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ListHsmsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListTagsForResourceResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ListTagsForResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val RemoveTagsFromResourceResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.RemoveTagsFromResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val CreateHsmResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.CreateHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson)
  }
  final implicit val ModifyHapgRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ModifyHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson, "Label" -> o.label.asJson, "PartitionSerialList" -> o.partitionSerialList.asJson)
  }
  final implicit val CreateLunaClientResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.CreateLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson)
  }
  final implicit val DeleteHapgRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.DeleteHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val DescribeHapgRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.DescribeHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val CloudHsmInternalExceptionEncoder: io.circe.Encoder[avias.cloudhsm.models.CloudHsmInternalException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListLunaClientsResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ListLunaClientsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ClientList" -> o.clientList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListAvailableZonesRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ListAvailableZonesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateLunaClientRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.CreateLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "Label" -> o.label.asJson)
  }
  final implicit val DeleteHsmResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.DeleteHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val AddTagsToResourceRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.AddTagsToResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagList" -> o.tagList.asJson)
  }
  final implicit val DescribeHsmRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.DescribeHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson, "HsmSerialNumber" -> o.hsmSerialNumber.asJson)
  }
  final implicit val GetConfigRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.GetConfigRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson, "ClientVersion" -> o.clientVersion.asJson, "HapgList" -> o.hapgList.asJson)
  }
  final implicit val CreateHsmRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.CreateHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetId" -> o.subnetId.asJson, "SshKey" -> o.sshKey.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "SubscriptionType" -> o.subscriptionType.asJson, "ExternalId" -> o.externalId.asJson, "ClientToken" -> o.clientToken.asJson, "EniIp" -> o.eniIp.asJson, "SyslogIp" -> o.syslogIp.asJson)
  }
  final implicit val ModifyLunaClientRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ModifyLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson, "Certificate" -> o.certificate.asJson)
  }
  final implicit val DescribeLunaClientResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.DescribeLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "CertificateFingerprint" -> o.certificateFingerprint.asJson, "Label" -> o.label.asJson, "LastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "ClientArn" -> o.clientArn.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[avias.cloudhsm.models.InvalidRequestException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeHsmResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.DescribeHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EniId" -> o.eniId.asJson, "VpcId" -> o.vpcId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "VendorName" -> o.vendorName.asJson, "ServerCertUri" -> o.serverCertUri.asJson, "SoftwareVersion" -> o.softwareVersion.asJson, "HsmType" -> o.hsmType.asJson, "StatusDetails" -> o.statusDetails.asJson, "SubnetId" -> o.subnetId.asJson, "SerialNumber" -> o.serialNumber.asJson, "SshPublicKey" -> o.sshPublicKey.asJson, "HsmArn" -> o.hsmArn.asJson, "Status" -> o.status.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "SubscriptionType" -> o.subscriptionType.asJson, "Partitions" -> o.partitions.asJson, "SubscriptionStartDate" -> o.subscriptionStartDate.asJson, "SubscriptionEndDate" -> o.subscriptionEndDate.asJson, "SshKeyLastUpdated" -> o.sshKeyLastUpdated.asJson, "ServerCertLastUpdated" -> o.serverCertLastUpdated.asJson, "EniIp" -> o.eniIp.asJson)
  }
  final implicit val ListHapgsResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ListHapgsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HapgList" -> o.hapgList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListLunaClientsRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ListLunaClientsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsToResourceResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.AddTagsToResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val DescribeHapgResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.DescribeHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmsLastActionFailed" -> o.hsmsLastActionFailed.asJson, "HsmsPendingDeletion" -> o.hsmsPendingDeletion.asJson, "HsmsPendingRegistration" -> o.hsmsPendingRegistration.asJson, "HapgSerial" -> o.hapgSerial.asJson, "PartitionSerialList" -> o.partitionSerialList.asJson, "State" -> o.state.asJson, "Label" -> o.label.asJson, "LastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val DeleteHapgResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.DeleteHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val DeleteLunaClientResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.DeleteLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val ModifyHapgResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ModifyHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val ListHapgsRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.ListHapgsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateHapgResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.CreateHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val DeleteLunaClientRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.DeleteLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson)
  }
  final implicit val ListAvailableZonesResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ListAvailableZonesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AZList" -> o.azlist.asJson)
  }
  final implicit val CreateHapgRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.CreateHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Label" -> o.label.asJson)
  }
  final implicit val DescribeLunaClientRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.DescribeLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson, "CertificateFingerprint" -> o.certificateFingerprint.asJson)
  }
  final implicit val CloudHsmServiceExceptionEncoder: io.circe.Encoder[avias.cloudhsm.models.CloudHsmServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "retryable" -> o.retryable.asJson)
  }
  final implicit val ModifyHsmResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ModifyHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson)
  }
  final implicit val ModifyLunaClientResponseEncoder: io.circe.Encoder[avias.cloudhsm.models.ModifyLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson)
  }
  final implicit val RemoveTagsFromResourceRequestEncoder: io.circe.Encoder[avias.cloudhsm.models.RemoveTagsFromResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagKeyList" -> o.tagKeyList.asJson)
  }
  final implicit val ListHsmsResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ListHsmsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("HsmList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cloudhsm.models.ListHsmsResponse.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.cloudhsm.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(avias.cloudhsm.models.Tag.apply _)
  }
  final implicit val ModifyHsmRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ModifyHsmRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HsmArn"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("IamRoleArn"), o.get[scala.Option[java.lang.String]]("ExternalId"), o.get[scala.Option[java.lang.String]]("EniIp"), o.get[scala.Option[java.lang.String]]("SyslogIp")).mapN(avias.cloudhsm.models.ModifyHsmRequest.apply _)
  }
  final implicit val GetConfigResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.GetConfigResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConfigType"), o.get[scala.Option[java.lang.String]]("ConfigFile"), o.get[scala.Option[java.lang.String]]("ConfigCred")).mapN(avias.cloudhsm.models.GetConfigResponse.apply _)
  }
  final implicit val DeleteHsmRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.DeleteHsmRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HsmArn").map(avias.cloudhsm.models.DeleteHsmRequest.apply _)
  }
  final implicit val ListHsmsRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ListHsmsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NextToken").map(avias.cloudhsm.models.ListHsmsRequest.apply _)
  }
  final implicit val ListTagsForResourceResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ListTagsForResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.cloudhsm.models.Tag]]("TagList").map(avias.cloudhsm.models.ListTagsForResourceResponse.apply _)
  }
  final implicit val RemoveTagsFromResourceResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.RemoveTagsFromResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(avias.cloudhsm.models.RemoveTagsFromResourceResponse.apply _)
  }
  final implicit val CreateHsmResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.CreateHsmResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HsmArn").map(avias.cloudhsm.models.CreateHsmResponse.apply _)
  }
  final implicit val ModifyHapgRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ModifyHapgRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HapgArn"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[scala.List[java.lang.String]]]("PartitionSerialList")).mapN(avias.cloudhsm.models.ModifyHapgRequest.apply _)
  }
  final implicit val CreateLunaClientResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.CreateLunaClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ClientArn").map(avias.cloudhsm.models.CreateLunaClientResponse.apply _)
  }
  final implicit val DeleteHapgRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.DeleteHapgRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HapgArn").map(avias.cloudhsm.models.DeleteHapgRequest.apply _)
  }
  final implicit val DescribeHapgRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.DescribeHapgRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HapgArn").map(avias.cloudhsm.models.DescribeHapgRequest.apply _)
  }
  final implicit val CloudHsmInternalExceptionDecoder: io.circe.Decoder[avias.cloudhsm.models.CloudHsmInternalException.type] = io.circe.Decoder.decodeUnit.as(avias.cloudhsm.models.CloudHsmInternalException)
  final implicit val ListLunaClientsResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ListLunaClientsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ClientList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cloudhsm.models.ListLunaClientsResponse.apply _)
  }
  final implicit val ListAvailableZonesRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ListAvailableZonesRequest.type] = io.circe.Decoder.decodeUnit.as(avias.cloudhsm.models.ListAvailableZonesRequest)
  final implicit val CreateLunaClientRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.CreateLunaClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Certificate"), o.get[scala.Option[java.lang.String]]("Label")).mapN(avias.cloudhsm.models.CreateLunaClientRequest.apply _)
  }
  final implicit val DeleteHsmResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.DeleteHsmResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(avias.cloudhsm.models.DeleteHsmResponse.apply _)
  }
  final implicit val AddTagsToResourceRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.AddTagsToResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[avias.cloudhsm.models.Tag]]("TagList")).mapN(avias.cloudhsm.models.AddTagsToResourceRequest.apply _)
  }
  final implicit val DescribeHsmRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.DescribeHsmRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HsmArn"), o.get[scala.Option[java.lang.String]]("HsmSerialNumber")).mapN(avias.cloudhsm.models.DescribeHsmRequest.apply _)
  }
  final implicit val GetConfigRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.GetConfigRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientArn"), o.get[java.lang.String]("ClientVersion"), o.get[scala.List[java.lang.String]]("HapgList")).mapN(avias.cloudhsm.models.GetConfigRequest.apply _)
  }
  final implicit val CreateHsmRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.CreateHsmRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetId"), o.get[java.lang.String]("SshKey"), o.get[java.lang.String]("IamRoleArn"), o.get[java.lang.String]("SubscriptionType"), o.get[scala.Option[java.lang.String]]("ExternalId"), o.get[scala.Option[java.lang.String]]("ClientToken"), o.get[scala.Option[java.lang.String]]("EniIp"), o.get[scala.Option[java.lang.String]]("SyslogIp")).mapN(avias.cloudhsm.models.CreateHsmRequest.apply _)
  }
  final implicit val ModifyLunaClientRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ModifyLunaClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientArn"), o.get[java.lang.String]("Certificate")).mapN(avias.cloudhsm.models.ModifyLunaClientRequest.apply _)
  }
  final implicit val DescribeLunaClientResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.DescribeLunaClientResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Certificate"), o.get[scala.Option[java.lang.String]]("CertificateFingerprint"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[java.lang.String]]("LastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("ClientArn")).mapN(avias.cloudhsm.models.DescribeLunaClientResponse.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[avias.cloudhsm.models.InvalidRequestException.type] = io.circe.Decoder.decodeUnit.as(avias.cloudhsm.models.InvalidRequestException)
  final implicit val DescribeHsmResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.DescribeHsmResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EniId"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("VendorName"), o.get[scala.Option[java.lang.String]]("ServerCertUri"), o.get[scala.Option[java.lang.String]]("SoftwareVersion"), o.get[scala.Option[java.lang.String]]("HsmType"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("SerialNumber"), o.get[scala.Option[java.lang.String]]("SshPublicKey"), o.get[scala.Option[java.lang.String]]("HsmArn"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("IamRoleArn"), o.get[scala.Option[java.lang.String]]("SubscriptionType"), o.get[scala.Option[scala.List[java.lang.String]]]("Partitions"), o.get[scala.Option[java.lang.String]]("SubscriptionStartDate"), o.get[scala.Option[java.lang.String]]("SubscriptionEndDate"), o.get[scala.Option[java.lang.String]]("SshKeyLastUpdated"), o.get[scala.Option[java.lang.String]]("ServerCertLastUpdated"), o.get[scala.Option[java.lang.String]]("EniIp")).mapN(avias.cloudhsm.models.DescribeHsmResponse.apply _)
  }
  final implicit val ListHapgsResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ListHapgsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("HapgList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cloudhsm.models.ListHapgsResponse.apply _)
  }
  final implicit val ListLunaClientsRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ListLunaClientsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NextToken").map(avias.cloudhsm.models.ListLunaClientsRequest.apply _)
  }
  final implicit val AddTagsToResourceResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.AddTagsToResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(avias.cloudhsm.models.AddTagsToResourceResponse.apply _)
  }
  final implicit val DescribeHapgResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.DescribeHapgResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("HsmsLastActionFailed"), o.get[scala.Option[scala.List[java.lang.String]]]("HsmsPendingDeletion"), o.get[scala.Option[scala.List[java.lang.String]]]("HsmsPendingRegistration"), o.get[scala.Option[java.lang.String]]("HapgSerial"), o.get[scala.Option[scala.List[java.lang.String]]]("PartitionSerialList"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[java.lang.String]]("LastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("HapgArn")).mapN(avias.cloudhsm.models.DescribeHapgResponse.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ResourceArn").map(avias.cloudhsm.models.ListTagsForResourceRequest.apply _)
  }
  final implicit val DeleteHapgResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.DeleteHapgResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(avias.cloudhsm.models.DeleteHapgResponse.apply _)
  }
  final implicit val DeleteLunaClientResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.DeleteLunaClientResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(avias.cloudhsm.models.DeleteLunaClientResponse.apply _)
  }
  final implicit val ModifyHapgResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ModifyHapgResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HapgArn").map(avias.cloudhsm.models.ModifyHapgResponse.apply _)
  }
  final implicit val ListHapgsRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.ListHapgsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NextToken").map(avias.cloudhsm.models.ListHapgsRequest.apply _)
  }
  final implicit val CreateHapgResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.CreateHapgResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HapgArn").map(avias.cloudhsm.models.CreateHapgResponse.apply _)
  }
  final implicit val DeleteLunaClientRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.DeleteLunaClientRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ClientArn").map(avias.cloudhsm.models.DeleteLunaClientRequest.apply _)
  }
  final implicit val ListAvailableZonesResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ListAvailableZonesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("AZList").map(avias.cloudhsm.models.ListAvailableZonesResponse.apply _)
  }
  final implicit val CreateHapgRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.CreateHapgRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Label").map(avias.cloudhsm.models.CreateHapgRequest.apply _)
  }
  final implicit val DescribeLunaClientRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.DescribeLunaClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClientArn"), o.get[scala.Option[java.lang.String]]("CertificateFingerprint")).mapN(avias.cloudhsm.models.DescribeLunaClientRequest.apply _)
  }
  final implicit val CloudHsmServiceExceptionDecoder: io.circe.Decoder[avias.cloudhsm.models.CloudHsmServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Boolean]]("retryable")).mapN(avias.cloudhsm.models.CloudHsmServiceException.apply _)
  }
  final implicit val ModifyHsmResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ModifyHsmResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HsmArn").map(avias.cloudhsm.models.ModifyHsmResponse.apply _)
  }
  final implicit val ModifyLunaClientResponseDecoder: io.circe.Decoder[avias.cloudhsm.models.ModifyLunaClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ClientArn").map(avias.cloudhsm.models.ModifyLunaClientResponse.apply _)
  }
  final implicit val RemoveTagsFromResourceRequestDecoder: io.circe.Decoder[avias.cloudhsm.models.RemoveTagsFromResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[java.lang.String]]("TagKeyList")).mapN(avias.cloudhsm.models.RemoveTagsFromResourceRequest.apply _)
  }
}