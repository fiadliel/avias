package org.lyranthe.araethura.cloudhsm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListHsmsResponseEncoder: io.circe.Encoder[models.ListHsmsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmList" -> o.hsmList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ModifyHsmRequestEncoder: io.circe.Encoder[models.ModifyHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson, "SubnetId" -> o.subnetId.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "ExternalId" -> o.externalId.asJson, "EniIp" -> o.eniIp.asJson, "SyslogIp" -> o.syslogIp.asJson)
  }
  final implicit val GetConfigResponseEncoder: io.circe.Encoder[models.GetConfigResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ConfigType" -> o.configType.asJson, "ConfigFile" -> o.configFile.asJson, "ConfigCred" -> o.configCred.asJson)
  }
  final implicit val DeleteHsmRequestEncoder: io.circe.Encoder[models.DeleteHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson)
  }
  final implicit val ListHsmsRequestEncoder: io.circe.Encoder[models.ListHsmsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListTagsForResourceResponseEncoder: io.circe.Encoder[models.ListTagsForResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val RemoveTagsFromResourceResponseEncoder: io.circe.Encoder[models.RemoveTagsFromResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val CreateHsmResponseEncoder: io.circe.Encoder[models.CreateHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson)
  }
  final implicit val ModifyHapgRequestEncoder: io.circe.Encoder[models.ModifyHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson, "Label" -> o.label.asJson, "PartitionSerialList" -> o.partitionSerialList.asJson)
  }
  final implicit val CreateLunaClientResponseEncoder: io.circe.Encoder[models.CreateLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson)
  }
  final implicit val DeleteHapgRequestEncoder: io.circe.Encoder[models.DeleteHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val DescribeHapgRequestEncoder: io.circe.Encoder[models.DescribeHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val CloudHsmInternalExceptionEncoder: io.circe.Encoder[models.CloudHsmInternalException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListLunaClientsResponseEncoder: io.circe.Encoder[models.ListLunaClientsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ClientList" -> o.clientList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListAvailableZonesRequestEncoder: io.circe.Encoder[models.ListAvailableZonesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateLunaClientRequestEncoder: io.circe.Encoder[models.CreateLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "Label" -> o.label.asJson)
  }
  final implicit val DeleteHsmResponseEncoder: io.circe.Encoder[models.DeleteHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val AddTagsToResourceRequestEncoder: io.circe.Encoder[models.AddTagsToResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagList" -> o.tagList.asJson)
  }
  final implicit val DescribeHsmRequestEncoder: io.circe.Encoder[models.DescribeHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson, "HsmSerialNumber" -> o.hsmSerialNumber.asJson)
  }
  final implicit val GetConfigRequestEncoder: io.circe.Encoder[models.GetConfigRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson, "ClientVersion" -> o.clientVersion.asJson, "HapgList" -> o.hapgList.asJson)
  }
  final implicit val CreateHsmRequestEncoder: io.circe.Encoder[models.CreateHsmRequest] = io.circe.Encoder.instance { o => 
    Json.obj("SubnetId" -> o.subnetId.asJson, "SshKey" -> o.sshKey.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "SubscriptionType" -> o.subscriptionType.asJson, "ExternalId" -> o.externalId.asJson, "ClientToken" -> o.clientToken.asJson, "EniIp" -> o.eniIp.asJson, "SyslogIp" -> o.syslogIp.asJson)
  }
  final implicit val ModifyLunaClientRequestEncoder: io.circe.Encoder[models.ModifyLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson, "Certificate" -> o.certificate.asJson)
  }
  final implicit val DescribeLunaClientResponseEncoder: io.circe.Encoder[models.DescribeLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Certificate" -> o.certificate.asJson, "CertificateFingerprint" -> o.certificateFingerprint.asJson, "Label" -> o.label.asJson, "LastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "ClientArn" -> o.clientArn.asJson)
  }
  final implicit val InvalidRequestExceptionEncoder: io.circe.Encoder[models.InvalidRequestException.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeHsmResponseEncoder: io.circe.Encoder[models.DescribeHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EniId" -> o.eniId.asJson, "VpcId" -> o.vpcId.asJson, "AvailabilityZone" -> o.availabilityZone.asJson, "VendorName" -> o.vendorName.asJson, "ServerCertUri" -> o.serverCertUri.asJson, "SoftwareVersion" -> o.softwareVersion.asJson, "HsmType" -> o.hsmType.asJson, "StatusDetails" -> o.statusDetails.asJson, "SubnetId" -> o.subnetId.asJson, "SerialNumber" -> o.serialNumber.asJson, "SshPublicKey" -> o.sshPublicKey.asJson, "HsmArn" -> o.hsmArn.asJson, "Status" -> o.status.asJson, "IamRoleArn" -> o.iamRoleArn.asJson, "SubscriptionType" -> o.subscriptionType.asJson, "Partitions" -> o.partitions.asJson, "SubscriptionStartDate" -> o.subscriptionStartDate.asJson, "SubscriptionEndDate" -> o.subscriptionEndDate.asJson, "SshKeyLastUpdated" -> o.sshKeyLastUpdated.asJson, "ServerCertLastUpdated" -> o.serverCertLastUpdated.asJson, "EniIp" -> o.eniIp.asJson)
  }
  final implicit val ListHapgsResponseEncoder: io.circe.Encoder[models.ListHapgsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HapgList" -> o.hapgList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListLunaClientsRequestEncoder: io.circe.Encoder[models.ListLunaClientsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson)
  }
  final implicit val AddTagsToResourceResponseEncoder: io.circe.Encoder[models.AddTagsToResourceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val DescribeHapgResponseEncoder: io.circe.Encoder[models.DescribeHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmsLastActionFailed" -> o.hsmsLastActionFailed.asJson, "HsmsPendingDeletion" -> o.hsmsPendingDeletion.asJson, "HsmsPendingRegistration" -> o.hsmsPendingRegistration.asJson, "HapgSerial" -> o.hapgSerial.asJson, "PartitionSerialList" -> o.partitionSerialList.asJson, "State" -> o.state.asJson, "Label" -> o.label.asJson, "LastModifiedTimestamp" -> o.lastModifiedTimestamp.asJson, "HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val ListTagsForResourceRequestEncoder: io.circe.Encoder[models.ListTagsForResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson)
  }
  final implicit val DeleteHapgResponseEncoder: io.circe.Encoder[models.DeleteHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val DeleteLunaClientResponseEncoder: io.circe.Encoder[models.DeleteLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Status" -> o.status.asJson)
  }
  final implicit val ModifyHapgResponseEncoder: io.circe.Encoder[models.ModifyHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val ListHapgsRequestEncoder: io.circe.Encoder[models.ListHapgsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateHapgResponseEncoder: io.circe.Encoder[models.CreateHapgResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HapgArn" -> o.hapgArn.asJson)
  }
  final implicit val DeleteLunaClientRequestEncoder: io.circe.Encoder[models.DeleteLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson)
  }
  final implicit val ListAvailableZonesResponseEncoder: io.circe.Encoder[models.ListAvailableZonesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AZList" -> o.azlist.asJson)
  }
  final implicit val CreateHapgRequestEncoder: io.circe.Encoder[models.CreateHapgRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Label" -> o.label.asJson)
  }
  final implicit val DescribeLunaClientRequestEncoder: io.circe.Encoder[models.DescribeLunaClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson, "CertificateFingerprint" -> o.certificateFingerprint.asJson)
  }
  final implicit val CloudHsmServiceExceptionEncoder: io.circe.Encoder[models.CloudHsmServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "retryable" -> o.retryable.asJson)
  }
  final implicit val ModifyHsmResponseEncoder: io.circe.Encoder[models.ModifyHsmResponse] = io.circe.Encoder.instance { o => 
    Json.obj("HsmArn" -> o.hsmArn.asJson)
  }
  final implicit val ModifyLunaClientResponseEncoder: io.circe.Encoder[models.ModifyLunaClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ClientArn" -> o.clientArn.asJson)
  }
  final implicit val RemoveTagsFromResourceRequestEncoder: io.circe.Encoder[models.RemoveTagsFromResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceArn" -> o.resourceArn.asJson, "TagKeyList" -> o.tagKeyList.asJson)
  }
  final implicit val ListHsmsResponseDecoder: io.circe.Decoder[models.ListHsmsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("HsmList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListHsmsResponse.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val ModifyHsmRequestDecoder: io.circe.Decoder[models.ModifyHsmRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HsmArn"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("IamRoleArn"), o.get[scala.Option[java.lang.String]]("ExternalId"), o.get[scala.Option[java.lang.String]]("EniIp"), o.get[scala.Option[java.lang.String]]("SyslogIp")).mapN(models.ModifyHsmRequest.apply _)
  }
  final implicit val GetConfigResponseDecoder: io.circe.Decoder[models.GetConfigResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ConfigType"), o.get[scala.Option[java.lang.String]]("ConfigFile"), o.get[scala.Option[java.lang.String]]("ConfigCred")).mapN(models.GetConfigResponse.apply _)
  }
  final implicit val DeleteHsmRequestDecoder: io.circe.Decoder[models.DeleteHsmRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HsmArn").map(models.DeleteHsmRequest.apply _)
  }
  final implicit val ListHsmsRequestDecoder: io.circe.Decoder[models.ListHsmsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NextToken").map(models.ListHsmsRequest.apply _)
  }
  final implicit val ListTagsForResourceResponseDecoder: io.circe.Decoder[models.ListTagsForResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.Tag]]("TagList").map(models.ListTagsForResourceResponse.apply _)
  }
  final implicit val RemoveTagsFromResourceResponseDecoder: io.circe.Decoder[models.RemoveTagsFromResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(models.RemoveTagsFromResourceResponse.apply _)
  }
  final implicit val CreateHsmResponseDecoder: io.circe.Decoder[models.CreateHsmResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HsmArn").map(models.CreateHsmResponse.apply _)
  }
  final implicit val ModifyHapgRequestDecoder: io.circe.Decoder[models.ModifyHapgRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("HapgArn"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[scala.List[java.lang.String]]]("PartitionSerialList")).mapN(models.ModifyHapgRequest.apply _)
  }
  final implicit val CreateLunaClientResponseDecoder: io.circe.Decoder[models.CreateLunaClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ClientArn").map(models.CreateLunaClientResponse.apply _)
  }
  final implicit val DeleteHapgRequestDecoder: io.circe.Decoder[models.DeleteHapgRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HapgArn").map(models.DeleteHapgRequest.apply _)
  }
  final implicit val DescribeHapgRequestDecoder: io.circe.Decoder[models.DescribeHapgRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HapgArn").map(models.DescribeHapgRequest.apply _)
  }
  final implicit val CloudHsmInternalExceptionDecoder: io.circe.Decoder[models.CloudHsmInternalException.type] = io.circe.Decoder.decodeUnit.as(models.CloudHsmInternalException)
  final implicit val ListLunaClientsResponseDecoder: io.circe.Decoder[models.ListLunaClientsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("ClientList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListLunaClientsResponse.apply _)
  }
  final implicit val ListAvailableZonesRequestDecoder: io.circe.Decoder[models.ListAvailableZonesRequest.type] = io.circe.Decoder.decodeUnit.as(models.ListAvailableZonesRequest)
  final implicit val CreateLunaClientRequestDecoder: io.circe.Decoder[models.CreateLunaClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Certificate"), o.get[scala.Option[java.lang.String]]("Label")).mapN(models.CreateLunaClientRequest.apply _)
  }
  final implicit val DeleteHsmResponseDecoder: io.circe.Decoder[models.DeleteHsmResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(models.DeleteHsmResponse.apply _)
  }
  final implicit val AddTagsToResourceRequestDecoder: io.circe.Decoder[models.AddTagsToResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[models.Tag]]("TagList")).mapN(models.AddTagsToResourceRequest.apply _)
  }
  final implicit val DescribeHsmRequestDecoder: io.circe.Decoder[models.DescribeHsmRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("HsmArn"), o.get[scala.Option[java.lang.String]]("HsmSerialNumber")).mapN(models.DescribeHsmRequest.apply _)
  }
  final implicit val GetConfigRequestDecoder: io.circe.Decoder[models.GetConfigRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientArn"), o.get[java.lang.String]("ClientVersion"), o.get[scala.List[java.lang.String]]("HapgList")).mapN(models.GetConfigRequest.apply _)
  }
  final implicit val CreateHsmRequestDecoder: io.circe.Decoder[models.CreateHsmRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SubnetId"), o.get[java.lang.String]("SshKey"), o.get[java.lang.String]("IamRoleArn"), o.get[java.lang.String]("SubscriptionType"), o.get[scala.Option[java.lang.String]]("ExternalId"), o.get[scala.Option[java.lang.String]]("ClientToken"), o.get[scala.Option[java.lang.String]]("EniIp"), o.get[scala.Option[java.lang.String]]("SyslogIp")).mapN(models.CreateHsmRequest.apply _)
  }
  final implicit val ModifyLunaClientRequestDecoder: io.circe.Decoder[models.ModifyLunaClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientArn"), o.get[java.lang.String]("Certificate")).mapN(models.ModifyLunaClientRequest.apply _)
  }
  final implicit val DescribeLunaClientResponseDecoder: io.circe.Decoder[models.DescribeLunaClientResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Certificate"), o.get[scala.Option[java.lang.String]]("CertificateFingerprint"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[java.lang.String]]("LastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("ClientArn")).mapN(models.DescribeLunaClientResponse.apply _)
  }
  final implicit val InvalidRequestExceptionDecoder: io.circe.Decoder[models.InvalidRequestException.type] = io.circe.Decoder.decodeUnit.as(models.InvalidRequestException)
  final implicit val DescribeHsmResponseDecoder: io.circe.Decoder[models.DescribeHsmResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EniId"), o.get[scala.Option[java.lang.String]]("VpcId"), o.get[scala.Option[java.lang.String]]("AvailabilityZone"), o.get[scala.Option[java.lang.String]]("VendorName"), o.get[scala.Option[java.lang.String]]("ServerCertUri"), o.get[scala.Option[java.lang.String]]("SoftwareVersion"), o.get[scala.Option[java.lang.String]]("HsmType"), o.get[scala.Option[java.lang.String]]("StatusDetails"), o.get[scala.Option[java.lang.String]]("SubnetId"), o.get[scala.Option[java.lang.String]]("SerialNumber"), o.get[scala.Option[java.lang.String]]("SshPublicKey"), o.get[scala.Option[java.lang.String]]("HsmArn"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("IamRoleArn"), o.get[scala.Option[java.lang.String]]("SubscriptionType"), o.get[scala.Option[scala.List[java.lang.String]]]("Partitions"), o.get[scala.Option[java.lang.String]]("SubscriptionStartDate"), o.get[scala.Option[java.lang.String]]("SubscriptionEndDate"), o.get[scala.Option[java.lang.String]]("SshKeyLastUpdated"), o.get[scala.Option[java.lang.String]]("ServerCertLastUpdated"), o.get[scala.Option[java.lang.String]]("EniIp")).mapN(models.DescribeHsmResponse.apply _)
  }
  final implicit val ListHapgsResponseDecoder: io.circe.Decoder[models.ListHapgsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("HapgList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListHapgsResponse.apply _)
  }
  final implicit val ListLunaClientsRequestDecoder: io.circe.Decoder[models.ListLunaClientsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NextToken").map(models.ListLunaClientsRequest.apply _)
  }
  final implicit val AddTagsToResourceResponseDecoder: io.circe.Decoder[models.AddTagsToResourceResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(models.AddTagsToResourceResponse.apply _)
  }
  final implicit val DescribeHapgResponseDecoder: io.circe.Decoder[models.DescribeHapgResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("HsmsLastActionFailed"), o.get[scala.Option[scala.List[java.lang.String]]]("HsmsPendingDeletion"), o.get[scala.Option[scala.List[java.lang.String]]]("HsmsPendingRegistration"), o.get[scala.Option[java.lang.String]]("HapgSerial"), o.get[scala.Option[scala.List[java.lang.String]]]("PartitionSerialList"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Label"), o.get[scala.Option[java.lang.String]]("LastModifiedTimestamp"), o.get[scala.Option[java.lang.String]]("HapgArn")).mapN(models.DescribeHapgResponse.apply _)
  }
  final implicit val ListTagsForResourceRequestDecoder: io.circe.Decoder[models.ListTagsForResourceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ResourceArn").map(models.ListTagsForResourceRequest.apply _)
  }
  final implicit val DeleteHapgResponseDecoder: io.circe.Decoder[models.DeleteHapgResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(models.DeleteHapgResponse.apply _)
  }
  final implicit val DeleteLunaClientResponseDecoder: io.circe.Decoder[models.DeleteLunaClientResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Status").map(models.DeleteLunaClientResponse.apply _)
  }
  final implicit val ModifyHapgResponseDecoder: io.circe.Decoder[models.ModifyHapgResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HapgArn").map(models.ModifyHapgResponse.apply _)
  }
  final implicit val ListHapgsRequestDecoder: io.circe.Decoder[models.ListHapgsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("NextToken").map(models.ListHapgsRequest.apply _)
  }
  final implicit val CreateHapgResponseDecoder: io.circe.Decoder[models.CreateHapgResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HapgArn").map(models.CreateHapgResponse.apply _)
  }
  final implicit val DeleteLunaClientRequestDecoder: io.circe.Decoder[models.DeleteLunaClientRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ClientArn").map(models.DeleteLunaClientRequest.apply _)
  }
  final implicit val ListAvailableZonesResponseDecoder: io.circe.Decoder[models.ListAvailableZonesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("AZList").map(models.ListAvailableZonesResponse.apply _)
  }
  final implicit val CreateHapgRequestDecoder: io.circe.Decoder[models.CreateHapgRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Label").map(models.CreateHapgRequest.apply _)
  }
  final implicit val DescribeLunaClientRequestDecoder: io.circe.Decoder[models.DescribeLunaClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClientArn"), o.get[scala.Option[java.lang.String]]("CertificateFingerprint")).mapN(models.DescribeLunaClientRequest.apply _)
  }
  final implicit val CloudHsmServiceExceptionDecoder: io.circe.Decoder[models.CloudHsmServiceException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.Boolean]]("retryable")).mapN(models.CloudHsmServiceException.apply _)
  }
  final implicit val ModifyHsmResponseDecoder: io.circe.Decoder[models.ModifyHsmResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("HsmArn").map(models.ModifyHsmResponse.apply _)
  }
  final implicit val ModifyLunaClientResponseDecoder: io.circe.Decoder[models.ModifyLunaClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ClientArn").map(models.ModifyLunaClientResponse.apply _)
  }
  final implicit val RemoveTagsFromResourceRequestDecoder: io.circe.Decoder[models.RemoveTagsFromResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceArn"), o.get[scala.List[java.lang.String]]("TagKeyList")).mapN(models.RemoveTagsFromResourceRequest.apply _)
  }
}