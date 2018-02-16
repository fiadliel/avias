package org.lyranthe.araethura.storagegateway
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val CreateTapesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateTapesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARNs" -> o.tapeARNs.asJson)
  }
  final implicit val ListVolumesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListVolumesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Marker" -> o.marker.asJson, "VolumeInfos" -> o.volumeInfos.asJson)
  }
  final implicit val DescribeStorediSCSIVolumesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeStorediSCSIVolumesInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARNs" -> o.volumeARNs.asJson)
  }
  final implicit val VolumeInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.VolumeInfo] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayId" -> o.gatewayId.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "VolumeType" -> o.volumeType.asJson, "GatewayARN" -> o.gatewayARN.asJson, "VolumeId" -> o.volumeId.asJson, "VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val ListVolumeInitiatorsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListVolumeInitiatorsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Initiators" -> o.initiators.asJson)
  }
  final implicit val DescribeChapCredentialsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeChapCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ChapCredentials" -> o.chapCredentials.asJson)
  }
  final implicit val RetrieveTapeArchiveInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeArchiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val NFSFileShareDefaultsEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.NFSFileShareDefaults] = io.circe.Encoder.instance { o => 
    Json.obj("FileMode" -> o.fileMode.asJson, "DirectoryMode" -> o.directoryMode.asJson, "GroupId" -> o.groupId.asJson, "OwnerId" -> o.ownerId.asJson)
  }
  final implicit val AddWorkingStorageOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddWorkingStorageOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListTagsForResourceInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListTagsForResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DeviceiSCSIAttributesEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeviceiSCSIAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "NetworkInterfaceId" -> o.networkInterfaceId.asJson, "NetworkInterfacePort" -> o.networkInterfacePort.asJson, "ChapEnabled" -> o.chapEnabled.asJson)
  }
  final implicit val DescribeCachediSCSIVolumesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeCachediSCSIVolumesInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARNs" -> o.volumeARNs.asJson)
  }
  final implicit val ShutdownGatewayInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ShutdownGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeBandwidthRateLimitOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeBandwidthRateLimitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "AverageUploadRateLimitInBitsPerSec" -> o.averageUploadRateLimitInBitsPerSec.asJson, "AverageDownloadRateLimitInBitsPerSec" -> o.averageDownloadRateLimitInBitsPerSec.asJson)
  }
  final implicit val SetLocalConsolePasswordInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.SetLocalConsolePasswordInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "LocalConsolePassword" -> o.localConsolePassword.asJson)
  }
  final implicit val UpdateNFSFileShareInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateNFSFileShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson, "ClientList" -> o.clientList.asJson, "NFSFileShareDefaults" -> o.nfsfileShareDefaults.asJson, "KMSEncrypted" -> o.kmsencrypted.asJson, "ReadOnly" -> o.readOnly.asJson, "DefaultStorageClass" -> o.defaultStorageClass.asJson, "KMSKey" -> o.kmskey.asJson, "Squash" -> o.squash.asJson)
  }
  final implicit val ListGatewaysOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListGatewaysOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Gateways" -> o.gateways.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ListGatewaysInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListGatewaysInput] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val UpdateSnapshotScheduleOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateSnapshotScheduleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val DescribeCachediSCSIVolumesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeCachediSCSIVolumesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CachediSCSIVolumes" -> o.cachediSCSIVolumes.asJson)
  }
  final implicit val TapeInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.TapeInfo] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "TapeStatus" -> o.tapeStatus.asJson, "TapeBarcode" -> o.tapeBarcode.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ShutdownGatewayOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ShutdownGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DeleteFileShareInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteFileShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson, "ForceDelete" -> o.forceDelete.asJson)
  }
  final implicit val DescribeBandwidthRateLimitInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeBandwidthRateLimitInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DeleteSnapshotScheduleInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteSnapshotScheduleInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val DescribeTapeRecoveryPointsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeRecoveryPointsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListTapesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListTapesInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARNs" -> o.tapeARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateTapeWithBarcodeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateTapeWithBarcodeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "TapeBarcode" -> o.tapeBarcode.asJson)
  }
  final implicit val CreateStorediSCSIVolumeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateStorediSCSIVolumeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "TargetARN" -> o.targetARN.asJson)
  }
  final implicit val DisableGatewayOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DisableGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ResetCacheInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ResetCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CancelRetrievalOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CancelRetrievalOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeMaintenanceStartTimeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeMaintenanceStartTimeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CreateNFSFileShareInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateNFSFileShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("Role" -> o.role.asJson, "LocationARN" -> o.locationARN.asJson, "ClientToken" -> o.clientToken.asJson, "GatewayARN" -> o.gatewayARN.asJson, "ClientList" -> o.clientList.asJson, "NFSFileShareDefaults" -> o.nfsfileShareDefaults.asJson, "KMSEncrypted" -> o.kmsencrypted.asJson, "ReadOnly" -> o.readOnly.asJson, "DefaultStorageClass" -> o.defaultStorageClass.asJson, "KMSKey" -> o.kmskey.asJson, "Squash" -> o.squash.asJson)
  }
  final implicit val ActivateGatewayOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ActivateGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CreateSnapshotInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "SnapshotDescription" -> o.snapshotDescription.asJson)
  }
  final implicit val DeleteBandwidthRateLimitOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteBandwidthRateLimitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DisableGatewayInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DisableGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeGatewayInformationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeGatewayInformationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeTapeArchivesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeArchivesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeArchives" -> o.tapeArchives.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ChapInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ChapInfo] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "SecretToAuthenticateInitiator" -> o.secretToAuthenticateInitiator.asJson, "SecretToAuthenticateTarget" -> o.secretToAuthenticateTarget.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotFromVolumeRecoveryPointOutput] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson, "VolumeARN" -> o.volumeARN.asJson, "VolumeRecoveryPointTime" -> o.volumeRecoveryPointTime.asJson)
  }
  final implicit val DeleteGatewayOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CreateTapesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateTapesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClientToken" -> o.clientToken.asJson, "TapeBarcodePrefix" -> o.tapeBarcodePrefix.asJson, "NumTapesToCreate" -> o.numTapesToCreate.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListFileSharesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListFileSharesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "NextMarker" -> o.nextMarker.asJson, "FileShareInfoList" -> o.fileShareInfoList.asJson)
  }
  final implicit val StorediSCSIVolumeEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.StorediSCSIVolume] = io.circe.Encoder.instance { o => 
    Json.obj("SourceSnapshotId" -> o.sourceSnapshotId.asJson, "CreatedDate" -> o.createdDate.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "PreservedExistingData" -> o.preservedExistingData.asJson, "VolumeProgress" -> o.volumeProgress.asJson, "VolumeType" -> o.volumeType.asJson, "VolumeiSCSIAttributes" -> o.volumeiSCSIAttributes.asJson, "VolumeDiskId" -> o.volumeDiskId.asJson, "VolumeStatus" -> o.volumeStatus.asJson, "VolumeId" -> o.volumeId.asJson, "VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val VolumeRecoveryPointInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.VolumeRecoveryPointInfo] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "VolumeUsageInBytes" -> o.volumeUsageInBytes.asJson, "VolumeRecoveryPointTime" -> o.volumeRecoveryPointTime.asJson)
  }
  final implicit val UpdateSnapshotScheduleInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateSnapshotScheduleInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "StartAt" -> o.startAt.asJson, "RecurrenceInHours" -> o.recurrenceInHours.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeGatewayInformationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeGatewayInformationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayId" -> o.gatewayId.asJson, "NextUpdateAvailabilityDate" -> o.nextUpdateAvailabilityDate.asJson, "GatewayType" -> o.gatewayType.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayTimezone" -> o.gatewayTimezone.asJson, "GatewayState" -> o.gatewayState.asJson, "GatewayNetworkInterfaces" -> o.gatewayNetworkInterfaces.asJson, "GatewayARN" -> o.gatewayARN.asJson, "LastSoftwareUpdate" -> o.lastSoftwareUpdate.asJson)
  }
  final implicit val AddTagsToResourceInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddTagsToResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val RetrieveTapeRecoveryPointInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeRecoveryPointInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeMaintenanceStartTimeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeMaintenanceStartTimeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MinuteOfHour" -> o.minuteOfHour.asJson, "Timezone" -> o.timezone.asJson, "GatewayARN" -> o.gatewayARN.asJson, "HourOfDay" -> o.hourOfDay.asJson, "DayOfWeek" -> o.dayOfWeek.asJson)
  }
  final implicit val RefreshCacheOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RefreshCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val DescribeTapesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeTapesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Tapes" -> o.tapes.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteChapCredentialsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteChapCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val DescribeStorediSCSIVolumesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeStorediSCSIVolumesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StorediSCSIVolumes" -> o.storediSCSIVolumes.asJson)
  }
  final implicit val UpdateVTLDeviceTypeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateVTLDeviceTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("VTLDeviceARN" -> o.vtldeviceARN.asJson, "DeviceType" -> o.deviceType.asJson)
  }
  final implicit val DeleteTapeArchiveInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeArchiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DeleteSnapshotScheduleOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteSnapshotScheduleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val DeleteFileShareOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteFileShareOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val NetworkInterfaceEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.NetworkInterface] = io.circe.Encoder.instance { o => 
    Json.obj("Ipv4Address" -> o.ipv4Address.asJson, "MacAddress" -> o.macAddress.asJson, "Ipv6Address" -> o.ipv6Address.asJson)
  }
  final implicit val UpdateGatewaySoftwareNowInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewaySoftwareNowInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val UpdateChapCredentialsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateChapCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val CancelArchivalInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CancelArchivalInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val NFSFileShareInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.NFSFileShareInfo] = io.circe.Encoder.instance { o => 
    Json.obj("ClientList" -> o.clientList.asJson, "NFSFileShareDefaults" -> o.nfsfileShareDefaults.asJson, "FileShareStatus" -> o.fileShareStatus.asJson, "Role" -> o.role.asJson, "ReadOnly" -> o.readOnly.asJson, "LocationARN" -> o.locationARN.asJson, "KMSEncrypted" -> o.kmsencrypted.asJson, "DefaultStorageClass" -> o.defaultStorageClass.asJson, "FileShareARN" -> o.fileShareARN.asJson, "KMSKey" -> o.kmskey.asJson, "Path" -> o.path.asJson, "GatewayARN" -> o.gatewayARN.asJson, "Squash" -> o.squash.asJson, "FileShareId" -> o.fileShareId.asJson)
  }
  final implicit val UpdateBandwidthRateLimitOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateBandwidthRateLimitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListTapesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListTapesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeInfos" -> o.tapeInfos.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ActivateGatewayInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ActivateGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayRegion" -> o.gatewayRegion.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayTimezone" -> o.gatewayTimezone.asJson, "ActivationKey" -> o.activationKey.asJson, "GatewayType" -> o.gatewayType.asJson, "MediumChangerType" -> o.mediumChangerType.asJson, "TapeDriveType" -> o.tapeDriveType.asJson)
  }
  final implicit val StorageGatewayErrorEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.StorageGatewayError] = io.circe.Encoder.instance { o => 
    Json.obj("errorCode" -> o.errorCode.asJson, "errorDetails" -> o.errorDetails.asJson)
  }
  final implicit val SetLocalConsolePasswordOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.SetLocalConsolePasswordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val UpdateChapCredentialsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateChapCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "SecretToAuthenticateInitiator" -> o.secretToAuthenticateInitiator.asJson, "InitiatorName" -> o.initiatorName.asJson, "SecretToAuthenticateTarget" -> o.secretToAuthenticateTarget.asJson)
  }
  final implicit val DeleteChapCredentialsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteChapCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val DescribeChapCredentialsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeChapCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson)
  }
  final implicit val DescribeWorkingStorageOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeWorkingStorageOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson, "WorkingStorageUsedInBytes" -> o.workingStorageUsedInBytes.asJson, "WorkingStorageAllocatedInBytes" -> o.workingStorageAllocatedInBytes.asJson)
  }
  final implicit val RetrieveTapeArchiveOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeArchiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DeleteBandwidthRateLimitInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteBandwidthRateLimitInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "BandwidthType" -> o.bandwidthType.asJson)
  }
  final implicit val CreateNFSFileShareOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateNFSFileShareOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val UpdateMaintenanceStartTimeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateMaintenanceStartTimeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "HourOfDay" -> o.hourOfDay.asJson, "MinuteOfHour" -> o.minuteOfHour.asJson, "DayOfWeek" -> o.dayOfWeek.asJson)
  }
  final implicit val UpdateGatewayInformationOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewayInformationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "GatewayName" -> o.gatewayName.asJson)
  }
  final implicit val UpdateGatewayInformationInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewayInformationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayTimezone" -> o.gatewayTimezone.asJson)
  }
  final implicit val TapeRecoveryPointInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.TapeRecoveryPointInfo] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "TapeRecoveryPointTime" -> o.tapeRecoveryPointTime.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "TapeStatus" -> o.tapeStatus.asJson)
  }
  final implicit val ServiceUnavailableErrorEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ServiceUnavailableError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "error" -> o.error.asJson)
  }
  final implicit val FileShareInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.FileShareInfo] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson, "FileShareId" -> o.fileShareId.asJson, "FileShareStatus" -> o.fileShareStatus.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val AddUploadBufferOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddUploadBufferOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CreateStorediSCSIVolumeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateStorediSCSIVolumeInput] = io.circe.Encoder.instance { o => 
    Json.obj("NetworkInterfaceId" -> o.networkInterfaceId.asJson, "PreserveExistingData" -> o.preserveExistingData.asJson, "GatewayARN" -> o.gatewayARN.asJson, "DiskId" -> o.diskId.asJson, "TargetName" -> o.targetName.asJson, "SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeTapeArchivesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeArchivesInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARNs" -> o.tapeARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val UpdateMaintenanceStartTimeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateMaintenanceStartTimeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeSnapshotScheduleInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeSnapshotScheduleInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val AddCacheOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListLocalDisksInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListLocalDisksInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeWorkingStorageInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeWorkingStorageInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DeleteTapeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val CancelArchivalOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CancelArchivalOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeUploadBufferOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeUploadBufferOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson, "UploadBufferUsedInBytes" -> o.uploadBufferUsedInBytes.asJson, "UploadBufferAllocatedInBytes" -> o.uploadBufferAllocatedInBytes.asJson)
  }
  final implicit val DescribeCacheOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson, "CacheAllocatedInBytes" -> o.cacheAllocatedInBytes.asJson, "CacheUsedPercentage" -> o.cacheUsedPercentage.asJson, "CacheDirtyPercentage" -> o.cacheDirtyPercentage.asJson, "CacheHitPercentage" -> o.cacheHitPercentage.asJson, "CacheMissPercentage" -> o.cacheMissPercentage.asJson)
  }
  final implicit val TapeArchiveEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.TapeArchive] = io.circe.Encoder.instance { o => 
    Json.obj("TapeStatus" -> o.tapeStatus.asJson, "TapeARN" -> o.tapeARN.asJson, "TapeBarcode" -> o.tapeBarcode.asJson, "TapeUsedInBytes" -> o.tapeUsedInBytes.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "RetrievedTo" -> o.retrievedTo.asJson, "TapeCreatedDate" -> o.tapeCreatedDate.asJson, "CompletionTime" -> o.completionTime.asJson)
  }
  final implicit val TapeEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.Tape] = io.circe.Encoder.instance { o => 
    Json.obj("Progress" -> o.progress.asJson, "TapeARN" -> o.tapeARN.asJson, "TapeStatus" -> o.tapeStatus.asJson, "TapeBarcode" -> o.tapeBarcode.asJson, "TapeUsedInBytes" -> o.tapeUsedInBytes.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "VTLDevice" -> o.vtldevice.asJson, "TapeCreatedDate" -> o.tapeCreatedDate.asJson)
  }
  final implicit val StartGatewayOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.StartGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val VolumeiSCSIAttributesEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.VolumeiSCSIAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("NetworkInterfaceId" -> o.networkInterfaceId.asJson, "TargetARN" -> o.targetARN.asJson, "ChapEnabled" -> o.chapEnabled.asJson, "NetworkInterfacePort" -> o.networkInterfacePort.asJson, "LunNumber" -> o.lunNumber.asJson)
  }
  final implicit val ListLocalDisksOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListLocalDisksOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Disks" -> o.disks.asJson)
  }
  final implicit val DescribeTapeRecoveryPointsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeRecoveryPointsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeRecoveryPointInfos" -> o.tapeRecoveryPointInfos.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteTapeArchiveOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeArchiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeNFSFileSharesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeNFSFileSharesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NFSFileShareInfoList" -> o.nfsfileShareInfoList.asJson)
  }
  final implicit val AddWorkingStorageInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddWorkingStorageInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson)
  }
  final implicit val RefreshCacheInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RefreshCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val UpdateVTLDeviceTypeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateVTLDeviceTypeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VTLDeviceARN" -> o.vtldeviceARN.asJson)
  }
  final implicit val DescribeCacheInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeSnapshotScheduleOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeSnapshotScheduleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecurrenceInHours" -> o.recurrenceInHours.asJson, "Timezone" -> o.timezone.asJson, "StartAt" -> o.startAt.asJson, "VolumeARN" -> o.volumeARN.asJson, "Description" -> o.description.asJson)
  }
  final implicit val RetrieveTapeRecoveryPointOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeRecoveryPointOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val AddCacheInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson)
  }
  final implicit val DiskEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.Disk] = io.circe.Encoder.instance { o => 
    Json.obj("DiskId" -> o.diskId.asJson, "DiskPath" -> o.diskPath.asJson, "DiskNode" -> o.diskNode.asJson, "DiskStatus" -> o.diskStatus.asJson, "DiskAllocationResource" -> o.diskAllocationResource.asJson, "DiskSizeInBytes" -> o.diskSizeInBytes.asJson, "DiskAllocationType" -> o.diskAllocationType.asJson)
  }
  final implicit val VTLDeviceEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.VTLDevice] = io.circe.Encoder.instance { o => 
    Json.obj("VTLDeviceProductIdentifier" -> o.vtldeviceProductIdentifier.asJson, "VTLDeviceVendor" -> o.vtldeviceVendor.asJson, "DeviceiSCSIAttributes" -> o.deviceiSCSIAttributes.asJson, "VTLDeviceType" -> o.vtldeviceType.asJson, "VTLDeviceARN" -> o.vtldeviceARN.asJson)
  }
  final implicit val CreateCachediSCSIVolumeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateCachediSCSIVolumeInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "NetworkInterfaceId" -> o.networkInterfaceId.asJson, "ClientToken" -> o.clientToken.asJson, "GatewayARN" -> o.gatewayARN.asJson, "TargetName" -> o.targetName.asJson, "SnapshotId" -> o.snapshotId.asJson, "SourceVolumeARN" -> o.sourceVolumeARN.asJson)
  }
  final implicit val CreateSnapshotOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeNFSFileSharesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeNFSFileSharesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARNList" -> o.fileShareARNList.asJson)
  }
  final implicit val RemoveTagsFromResourceInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RemoveTagsFromResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "error" -> o.error.asJson)
  }
  final implicit val InvalidGatewayRequestExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.InvalidGatewayRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "error" -> o.error.asJson)
  }
  final implicit val DescribeVTLDevicesOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeVTLDevicesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "VTLDevices" -> o.vtldevices.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DescribeUploadBufferInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeUploadBufferInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeTapesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeTapesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARNs" -> o.tapeARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListVolumeRecoveryPointsOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListVolumeRecoveryPointsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "VolumeRecoveryPointInfos" -> o.volumeRecoveryPointInfos.asJson)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotFromVolumeRecoveryPointInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "SnapshotDescription" -> o.snapshotDescription.asJson)
  }
  final implicit val CancelRetrievalInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CancelRetrievalInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeVTLDevicesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DescribeVTLDevicesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "VTLDeviceARNs" -> o.vtldeviceARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListTagsForResourceOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListTagsForResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Marker" -> o.marker.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val UpdateGatewaySoftwareNowOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewaySoftwareNowOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val UpdateNFSFileShareOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateNFSFileShareOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val ListVolumeRecoveryPointsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListVolumeRecoveryPointsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val AddUploadBufferInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddUploadBufferInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson)
  }
  final implicit val DeleteTapeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val CreateCachediSCSIVolumeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateCachediSCSIVolumeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "TargetARN" -> o.targetARN.asJson)
  }
  final implicit val ResetCacheOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ResetCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListFileSharesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListFileSharesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteVolumeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteVolumeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val UpdateBandwidthRateLimitInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.UpdateBandwidthRateLimitInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "AverageUploadRateLimitInBitsPerSec" -> o.averageUploadRateLimitInBitsPerSec.asJson, "AverageDownloadRateLimitInBitsPerSec" -> o.averageDownloadRateLimitInBitsPerSec.asJson)
  }
  final implicit val DeleteGatewayInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val GatewayInfoEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.GatewayInfo] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayId" -> o.gatewayId.asJson, "GatewayOperationalState" -> o.gatewayOperationalState.asJson, "GatewayType" -> o.gatewayType.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val RemoveTagsFromResourceOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.RemoveTagsFromResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson)
  }
  final implicit val CachediSCSIVolumeEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CachediSCSIVolume] = io.circe.Encoder.instance { o => 
    Json.obj("SourceSnapshotId" -> o.sourceSnapshotId.asJson, "CreatedDate" -> o.createdDate.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "VolumeProgress" -> o.volumeProgress.asJson, "VolumeType" -> o.volumeType.asJson, "VolumeiSCSIAttributes" -> o.volumeiSCSIAttributes.asJson, "VolumeStatus" -> o.volumeStatus.asJson, "VolumeId" -> o.volumeId.asJson, "VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val ListVolumeInitiatorsInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListVolumeInitiatorsInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val AddTagsToResourceOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.AddTagsToResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson)
  }
  final implicit val DeleteVolumeInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.DeleteVolumeInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val StartGatewayInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.StartGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListVolumesInputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.ListVolumesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateTapeWithBarcodeOutputEncoder: io.circe.Encoder[org.lyranthe.araethura.storagegateway.models.CreateTapeWithBarcodeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val CreateTapesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateTapesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs").map(org.lyranthe.araethura.storagegateway.models.CreateTapesOutput.apply _)
  }
  final implicit val ListVolumesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListVolumesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.VolumeInfo]]]("VolumeInfos")).mapN(org.lyranthe.araethura.storagegateway.models.ListVolumesOutput.apply _)
  }
  final implicit val DescribeStorediSCSIVolumesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeStorediSCSIVolumesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("VolumeARNs").map(org.lyranthe.araethura.storagegateway.models.DescribeStorediSCSIVolumesInput.apply _)
  }
  final implicit val VolumeInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.VolumeInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayId"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[java.lang.String]]("VolumeARN")).mapN(org.lyranthe.araethura.storagegateway.models.VolumeInfo.apply _)
  }
  final implicit val ListVolumeInitiatorsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListVolumeInitiatorsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("Initiators").map(org.lyranthe.araethura.storagegateway.models.ListVolumeInitiatorsOutput.apply _)
  }
  final implicit val DescribeChapCredentialsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeChapCredentialsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.ChapInfo]]]("ChapCredentials").map(org.lyranthe.araethura.storagegateway.models.DescribeChapCredentialsOutput.apply _)
  }
  final implicit val RetrieveTapeArchiveInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeArchiveInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TapeARN"), o.get[java.lang.String]("GatewayARN")).mapN(org.lyranthe.araethura.storagegateway.models.RetrieveTapeArchiveInput.apply _)
  }
  final implicit val NFSFileShareDefaultsDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.NFSFileShareDefaults] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FileMode"), o.get[scala.Option[java.lang.String]]("DirectoryMode"), o.get[scala.Option[scala.Long]]("GroupId"), o.get[scala.Option[scala.Long]]("OwnerId")).mapN(org.lyranthe.araethura.storagegateway.models.NFSFileShareDefaults.apply _)
  }
  final implicit val AddWorkingStorageOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddWorkingStorageOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.AddWorkingStorageOutput.apply _)
  }
  final implicit val ListTagsForResourceInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListTagsForResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.ListTagsForResourceInput.apply _)
  }
  final implicit val DeviceiSCSIAttributesDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeviceiSCSIAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("NetworkInterfaceId"), o.get[scala.Option[scala.Int]]("NetworkInterfacePort"), o.get[scala.Option[scala.Boolean]]("ChapEnabled")).mapN(org.lyranthe.araethura.storagegateway.models.DeviceiSCSIAttributes.apply _)
  }
  final implicit val DescribeCachediSCSIVolumesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeCachediSCSIVolumesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("VolumeARNs").map(org.lyranthe.araethura.storagegateway.models.DescribeCachediSCSIVolumesInput.apply _)
  }
  final implicit val ShutdownGatewayInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ShutdownGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ShutdownGatewayInput.apply _)
  }
  final implicit val DescribeBandwidthRateLimitOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeBandwidthRateLimitOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.Long]]("AverageUploadRateLimitInBitsPerSec"), o.get[scala.Option[scala.Long]]("AverageDownloadRateLimitInBitsPerSec")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeBandwidthRateLimitOutput.apply _)
  }
  final implicit val SetLocalConsolePasswordInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.SetLocalConsolePasswordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("LocalConsolePassword")).mapN(org.lyranthe.araethura.storagegateway.models.SetLocalConsolePasswordInput.apply _)
  }
  final implicit val UpdateNFSFileShareInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateNFSFileShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FileShareARN"), o.get[scala.Option[scala.List[java.lang.String]]]("ClientList"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.NFSFileShareDefaults]]("NFSFileShareDefaults"), o.get[scala.Option[scala.Boolean]]("KMSEncrypted"), o.get[scala.Option[scala.Boolean]]("ReadOnly"), o.get[scala.Option[java.lang.String]]("DefaultStorageClass"), o.get[scala.Option[java.lang.String]]("KMSKey"), o.get[scala.Option[java.lang.String]]("Squash")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateNFSFileShareInput.apply _)
  }
  final implicit val ListGatewaysOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListGatewaysOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.GatewayInfo]]]("Gateways"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.ListGatewaysOutput.apply _)
  }
  final implicit val ListGatewaysInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListGatewaysInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.ListGatewaysInput.apply _)
  }
  final implicit val UpdateSnapshotScheduleOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateSnapshotScheduleOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.UpdateSnapshotScheduleOutput.apply _)
  }
  final implicit val DescribeCachediSCSIVolumesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeCachediSCSIVolumesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.CachediSCSIVolume]]]("CachediSCSIVolumes").map(org.lyranthe.araethura.storagegateway.models.DescribeCachediSCSIVolumesOutput.apply _)
  }
  final implicit val TapeInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.TapeInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.lang.String]]("TapeStatus"), o.get[scala.Option[java.lang.String]]("TapeBarcode"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("GatewayARN")).mapN(org.lyranthe.araethura.storagegateway.models.TapeInfo.apply _)
  }
  final implicit val ShutdownGatewayOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ShutdownGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ShutdownGatewayOutput.apply _)
  }
  final implicit val DeleteFileShareInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteFileShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FileShareARN"), o.get[scala.Option[scala.Boolean]]("ForceDelete")).mapN(org.lyranthe.araethura.storagegateway.models.DeleteFileShareInput.apply _)
  }
  final implicit val DescribeBandwidthRateLimitInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeBandwidthRateLimitInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DescribeBandwidthRateLimitInput.apply _)
  }
  final implicit val DeleteSnapshotScheduleInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteSnapshotScheduleInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteSnapshotScheduleInput.apply _)
  }
  final implicit val DescribeTapeRecoveryPointsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeRecoveryPointsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeTapeRecoveryPointsInput.apply _)
  }
  final implicit val ListTapesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListTapesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.ListTapesInput.apply _)
  }
  final implicit val CreateTapeWithBarcodeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateTapeWithBarcodeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Long]("TapeSizeInBytes"), o.get[java.lang.String]("TapeBarcode")).mapN(org.lyranthe.araethura.storagegateway.models.CreateTapeWithBarcodeInput.apply _)
  }
  final implicit val CreateStorediSCSIVolumeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateStorediSCSIVolumeOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[java.lang.String]]("TargetARN")).mapN(org.lyranthe.araethura.storagegateway.models.CreateStorediSCSIVolumeOutput.apply _)
  }
  final implicit val DisableGatewayOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DisableGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DisableGatewayOutput.apply _)
  }
  final implicit val ResetCacheInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ResetCacheInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ResetCacheInput.apply _)
  }
  final implicit val CancelRetrievalOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CancelRetrievalOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.CancelRetrievalOutput.apply _)
  }
  final implicit val DescribeMaintenanceStartTimeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeMaintenanceStartTimeInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DescribeMaintenanceStartTimeInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(org.lyranthe.araethura.storagegateway.models.Tag.apply _)
  }
  final implicit val CreateNFSFileShareInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateNFSFileShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Role"), o.get[java.lang.String]("LocationARN"), o.get[java.lang.String]("ClientToken"), o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("ClientList"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.NFSFileShareDefaults]]("NFSFileShareDefaults"), o.get[scala.Option[scala.Boolean]]("KMSEncrypted"), o.get[scala.Option[scala.Boolean]]("ReadOnly"), o.get[scala.Option[java.lang.String]]("DefaultStorageClass"), o.get[scala.Option[java.lang.String]]("KMSKey"), o.get[scala.Option[java.lang.String]]("Squash")).mapN(org.lyranthe.araethura.storagegateway.models.CreateNFSFileShareInput.apply _)
  }
  final implicit val ActivateGatewayOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ActivateGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ActivateGatewayOutput.apply _)
  }
  final implicit val CreateSnapshotInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeARN"), o.get[java.lang.String]("SnapshotDescription")).mapN(org.lyranthe.araethura.storagegateway.models.CreateSnapshotInput.apply _)
  }
  final implicit val DeleteBandwidthRateLimitOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteBandwidthRateLimitOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DeleteBandwidthRateLimitOutput.apply _)
  }
  final implicit val DisableGatewayInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DisableGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DisableGatewayInput.apply _)
  }
  final implicit val DescribeGatewayInformationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeGatewayInformationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DescribeGatewayInformationInput.apply _)
  }
  final implicit val DescribeTapeArchivesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeArchivesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.TapeArchive]]]("TapeArchives"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeTapeArchivesOutput.apply _)
  }
  final implicit val ChapInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ChapInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("SecretToAuthenticateInitiator"), o.get[scala.Option[java.lang.String]]("SecretToAuthenticateTarget"), o.get[scala.Option[java.lang.String]]("InitiatorName")).mapN(org.lyranthe.araethura.storagegateway.models.ChapInfo.apply _)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotFromVolumeRecoveryPointOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("VolumeRecoveryPointTime")).mapN(org.lyranthe.araethura.storagegateway.models.CreateSnapshotFromVolumeRecoveryPointOutput.apply _)
  }
  final implicit val DeleteGatewayOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DeleteGatewayOutput.apply _)
  }
  final implicit val CreateTapesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateTapesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientToken"), o.get[java.lang.String]("TapeBarcodePrefix"), o.get[scala.Int]("NumTapesToCreate"), o.get[scala.Long]("TapeSizeInBytes"), o.get[java.lang.String]("GatewayARN")).mapN(org.lyranthe.araethura.storagegateway.models.CreateTapesInput.apply _)
  }
  final implicit val ListFileSharesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListFileSharesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.FileShareInfo]]]("FileShareInfoList")).mapN(org.lyranthe.araethura.storagegateway.models.ListFileSharesOutput.apply _)
  }
  final implicit val StorediSCSIVolumeDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.StorediSCSIVolume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceSnapshotId"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[scala.Boolean]]("PreservedExistingData"), o.get[scala.Option[scala.Double]]("VolumeProgress"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.VolumeiSCSIAttributes]]("VolumeiSCSIAttributes"), o.get[scala.Option[java.lang.String]]("VolumeDiskId"), o.get[scala.Option[java.lang.String]]("VolumeStatus"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[java.lang.String]]("VolumeARN")).mapN(org.lyranthe.araethura.storagegateway.models.StorediSCSIVolume.apply _)
  }
  final implicit val VolumeRecoveryPointInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.VolumeRecoveryPointInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[scala.Long]]("VolumeUsageInBytes"), o.get[scala.Option[java.lang.String]]("VolumeRecoveryPointTime")).mapN(org.lyranthe.araethura.storagegateway.models.VolumeRecoveryPointInfo.apply _)
  }
  final implicit val UpdateSnapshotScheduleInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateSnapshotScheduleInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeARN"), o.get[scala.Int]("StartAt"), o.get[scala.Int]("RecurrenceInHours"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateSnapshotScheduleInput.apply _)
  }
  final implicit val DescribeGatewayInformationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeGatewayInformationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayId"), o.get[scala.Option[java.lang.String]]("NextUpdateAvailabilityDate"), o.get[scala.Option[java.lang.String]]("GatewayType"), o.get[scala.Option[java.lang.String]]("GatewayName"), o.get[scala.Option[java.lang.String]]("GatewayTimezone"), o.get[scala.Option[java.lang.String]]("GatewayState"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.NetworkInterface]]]("GatewayNetworkInterfaces"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("LastSoftwareUpdate")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeGatewayInformationOutput.apply _)
  }
  final implicit val AddTagsToResourceInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddTagsToResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[scala.List[org.lyranthe.araethura.storagegateway.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.storagegateway.models.AddTagsToResourceInput.apply _)
  }
  final implicit val RetrieveTapeRecoveryPointInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeRecoveryPointInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TapeARN"), o.get[java.lang.String]("GatewayARN")).mapN(org.lyranthe.araethura.storagegateway.models.RetrieveTapeRecoveryPointInput.apply _)
  }
  final implicit val DescribeMaintenanceStartTimeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeMaintenanceStartTimeOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MinuteOfHour"), o.get[scala.Option[java.lang.String]]("Timezone"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.Int]]("HourOfDay"), o.get[scala.Option[scala.Int]]("DayOfWeek")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeMaintenanceStartTimeOutput.apply _)
  }
  final implicit val RefreshCacheOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RefreshCacheOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(org.lyranthe.araethura.storagegateway.models.RefreshCacheOutput.apply _)
  }
  final implicit val DescribeTapesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeTapesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.Tape]]]("Tapes"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeTapesOutput.apply _)
  }
  final implicit val DeleteChapCredentialsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteChapCredentialsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetARN"), o.get[java.lang.String]("InitiatorName")).mapN(org.lyranthe.araethura.storagegateway.models.DeleteChapCredentialsInput.apply _)
  }
  final implicit val DescribeStorediSCSIVolumesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeStorediSCSIVolumesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.StorediSCSIVolume]]]("StorediSCSIVolumes").map(org.lyranthe.araethura.storagegateway.models.DescribeStorediSCSIVolumesOutput.apply _)
  }
  final implicit val UpdateVTLDeviceTypeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateVTLDeviceTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VTLDeviceARN"), o.get[java.lang.String]("DeviceType")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateVTLDeviceTypeInput.apply _)
  }
  final implicit val DeleteTapeArchiveInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeArchiveInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteTapeArchiveInput.apply _)
  }
  final implicit val DeleteSnapshotScheduleOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteSnapshotScheduleOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteSnapshotScheduleOutput.apply _)
  }
  final implicit val DeleteFileShareOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteFileShareOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(org.lyranthe.araethura.storagegateway.models.DeleteFileShareOutput.apply _)
  }
  final implicit val NetworkInterfaceDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.NetworkInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Ipv4Address"), o.get[scala.Option[java.lang.String]]("MacAddress"), o.get[scala.Option[java.lang.String]]("Ipv6Address")).mapN(org.lyranthe.araethura.storagegateway.models.NetworkInterface.apply _)
  }
  final implicit val UpdateGatewaySoftwareNowInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewaySoftwareNowInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.UpdateGatewaySoftwareNowInput.apply _)
  }
  final implicit val UpdateChapCredentialsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateChapCredentialsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("InitiatorName")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateChapCredentialsOutput.apply _)
  }
  final implicit val CancelArchivalInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CancelArchivalInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TapeARN")).mapN(org.lyranthe.araethura.storagegateway.models.CancelArchivalInput.apply _)
  }
  final implicit val NFSFileShareInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.NFSFileShareInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ClientList"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.NFSFileShareDefaults]]("NFSFileShareDefaults"), o.get[scala.Option[java.lang.String]]("FileShareStatus"), o.get[scala.Option[java.lang.String]]("Role"), o.get[scala.Option[scala.Boolean]]("ReadOnly"), o.get[scala.Option[java.lang.String]]("LocationARN"), o.get[scala.Option[scala.Boolean]]("KMSEncrypted"), o.get[scala.Option[java.lang.String]]("DefaultStorageClass"), o.get[scala.Option[java.lang.String]]("FileShareARN"), o.get[scala.Option[java.lang.String]]("KMSKey"), o.get[scala.Option[java.lang.String]]("Path"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Squash"), o.get[scala.Option[java.lang.String]]("FileShareId")).mapN(org.lyranthe.araethura.storagegateway.models.NFSFileShareInfo.apply _)
  }
  final implicit val UpdateBandwidthRateLimitOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateBandwidthRateLimitOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.UpdateBandwidthRateLimitOutput.apply _)
  }
  final implicit val ListTapesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListTapesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.TapeInfo]]]("TapeInfos"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.ListTapesOutput.apply _)
  }
  final implicit val ActivateGatewayInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ActivateGatewayInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayRegion"), o.get[java.lang.String]("GatewayName"), o.get[java.lang.String]("GatewayTimezone"), o.get[java.lang.String]("ActivationKey"), o.get[scala.Option[java.lang.String]]("GatewayType"), o.get[scala.Option[java.lang.String]]("MediumChangerType"), o.get[scala.Option[java.lang.String]]("TapeDriveType")).mapN(org.lyranthe.araethura.storagegateway.models.ActivateGatewayInput.apply _)
  }
  final implicit val StorageGatewayErrorDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.StorageGatewayError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("errorCode"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("errorDetails")).mapN(org.lyranthe.araethura.storagegateway.models.StorageGatewayError.apply _)
  }
  final implicit val SetLocalConsolePasswordOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.SetLocalConsolePasswordOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.SetLocalConsolePasswordOutput.apply _)
  }
  final implicit val UpdateChapCredentialsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateChapCredentialsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetARN"), o.get[java.lang.String]("SecretToAuthenticateInitiator"), o.get[java.lang.String]("InitiatorName"), o.get[scala.Option[java.lang.String]]("SecretToAuthenticateTarget")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateChapCredentialsInput.apply _)
  }
  final implicit val DeleteChapCredentialsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteChapCredentialsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("InitiatorName")).mapN(org.lyranthe.araethura.storagegateway.models.DeleteChapCredentialsOutput.apply _)
  }
  final implicit val DescribeChapCredentialsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeChapCredentialsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TargetARN").map(org.lyranthe.araethura.storagegateway.models.DescribeChapCredentialsInput.apply _)
  }
  final implicit val DescribeWorkingStorageOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeWorkingStorageOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("DiskIds"), o.get[scala.Option[scala.Long]]("WorkingStorageUsedInBytes"), o.get[scala.Option[scala.Long]]("WorkingStorageAllocatedInBytes")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeWorkingStorageOutput.apply _)
  }
  final implicit val RetrieveTapeArchiveOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeArchiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.RetrieveTapeArchiveOutput.apply _)
  }
  final implicit val DeleteBandwidthRateLimitInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteBandwidthRateLimitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("BandwidthType")).mapN(org.lyranthe.araethura.storagegateway.models.DeleteBandwidthRateLimitInput.apply _)
  }
  final implicit val CreateNFSFileShareOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateNFSFileShareOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(org.lyranthe.araethura.storagegateway.models.CreateNFSFileShareOutput.apply _)
  }
  final implicit val UpdateMaintenanceStartTimeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateMaintenanceStartTimeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Int]("HourOfDay"), o.get[scala.Int]("MinuteOfHour"), o.get[scala.Int]("DayOfWeek")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateMaintenanceStartTimeInput.apply _)
  }
  final implicit val UpdateGatewayInformationOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewayInformationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("GatewayName")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateGatewayInformationOutput.apply _)
  }
  final implicit val UpdateGatewayInformationInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewayInformationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[java.lang.String]]("GatewayName"), o.get[scala.Option[java.lang.String]]("GatewayTimezone")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateGatewayInformationInput.apply _)
  }
  final implicit val TapeRecoveryPointInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.TapeRecoveryPointInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.time.Instant]]("TapeRecoveryPointTime"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("TapeStatus")).mapN(org.lyranthe.araethura.storagegateway.models.TapeRecoveryPointInfo.apply _)
  }
  final implicit val ServiceUnavailableErrorDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ServiceUnavailableError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.StorageGatewayError]]("error")).mapN(org.lyranthe.araethura.storagegateway.models.ServiceUnavailableError.apply _)
  }
  final implicit val FileShareInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.FileShareInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FileShareARN"), o.get[scala.Option[java.lang.String]]("FileShareId"), o.get[scala.Option[java.lang.String]]("FileShareStatus"), o.get[scala.Option[java.lang.String]]("GatewayARN")).mapN(org.lyranthe.araethura.storagegateway.models.FileShareInfo.apply _)
  }
  final implicit val AddUploadBufferOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddUploadBufferOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.AddUploadBufferOutput.apply _)
  }
  final implicit val CreateStorediSCSIVolumeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateStorediSCSIVolumeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NetworkInterfaceId"), o.get[scala.Boolean]("PreserveExistingData"), o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("DiskId"), o.get[java.lang.String]("TargetName"), o.get[scala.Option[java.lang.String]]("SnapshotId")).mapN(org.lyranthe.araethura.storagegateway.models.CreateStorediSCSIVolumeInput.apply _)
  }
  final implicit val DescribeTapeArchivesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeArchivesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeTapeArchivesInput.apply _)
  }
  final implicit val UpdateMaintenanceStartTimeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateMaintenanceStartTimeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.UpdateMaintenanceStartTimeOutput.apply _)
  }
  final implicit val DescribeSnapshotScheduleInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeSnapshotScheduleInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.DescribeSnapshotScheduleInput.apply _)
  }
  final implicit val AddCacheOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddCacheOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.AddCacheOutput.apply _)
  }
  final implicit val ListLocalDisksInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListLocalDisksInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ListLocalDisksInput.apply _)
  }
  final implicit val DescribeWorkingStorageInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeWorkingStorageInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DescribeWorkingStorageInput.apply _)
  }
  final implicit val DeleteTapeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TapeARN")).mapN(org.lyranthe.araethura.storagegateway.models.DeleteTapeInput.apply _)
  }
  final implicit val CancelArchivalOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CancelArchivalOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.CancelArchivalOutput.apply _)
  }
  final implicit val DescribeUploadBufferOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeUploadBufferOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("DiskIds"), o.get[scala.Option[scala.Long]]("UploadBufferUsedInBytes"), o.get[scala.Option[scala.Long]]("UploadBufferAllocatedInBytes")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeUploadBufferOutput.apply _)
  }
  final implicit val DescribeCacheOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeCacheOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("DiskIds"), o.get[scala.Option[scala.Long]]("CacheAllocatedInBytes"), o.get[scala.Option[scala.Double]]("CacheUsedPercentage"), o.get[scala.Option[scala.Double]]("CacheDirtyPercentage"), o.get[scala.Option[scala.Double]]("CacheHitPercentage"), o.get[scala.Option[scala.Double]]("CacheMissPercentage")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeCacheOutput.apply _)
  }
  final implicit val TapeArchiveDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.TapeArchive] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TapeStatus"), o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.lang.String]]("TapeBarcode"), o.get[scala.Option[scala.Long]]("TapeUsedInBytes"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("RetrievedTo"), o.get[scala.Option[java.time.Instant]]("TapeCreatedDate"), o.get[scala.Option[java.time.Instant]]("CompletionTime")).mapN(org.lyranthe.araethura.storagegateway.models.TapeArchive.apply _)
  }
  final implicit val TapeDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.Tape] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("Progress"), o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.lang.String]]("TapeStatus"), o.get[scala.Option[java.lang.String]]("TapeBarcode"), o.get[scala.Option[scala.Long]]("TapeUsedInBytes"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("VTLDevice"), o.get[scala.Option[java.time.Instant]]("TapeCreatedDate")).mapN(org.lyranthe.araethura.storagegateway.models.Tape.apply _)
  }
  final implicit val StartGatewayOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.StartGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.StartGatewayOutput.apply _)
  }
  final implicit val VolumeiSCSIAttributesDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.VolumeiSCSIAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NetworkInterfaceId"), o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[scala.Boolean]]("ChapEnabled"), o.get[scala.Option[scala.Int]]("NetworkInterfacePort"), o.get[scala.Option[scala.Int]]("LunNumber")).mapN(org.lyranthe.araethura.storagegateway.models.VolumeiSCSIAttributes.apply _)
  }
  final implicit val ListLocalDisksOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListLocalDisksOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.Disk]]]("Disks")).mapN(org.lyranthe.araethura.storagegateway.models.ListLocalDisksOutput.apply _)
  }
  final implicit val DescribeTapeRecoveryPointsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeTapeRecoveryPointsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.TapeRecoveryPointInfo]]]("TapeRecoveryPointInfos"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeTapeRecoveryPointsOutput.apply _)
  }
  final implicit val DeleteTapeArchiveOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeArchiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteTapeArchiveOutput.apply _)
  }
  final implicit val DescribeNFSFileSharesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeNFSFileSharesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.NFSFileShareInfo]]]("NFSFileShareInfoList").map(org.lyranthe.araethura.storagegateway.models.DescribeNFSFileSharesOutput.apply _)
  }
  final implicit val AddWorkingStorageInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddWorkingStorageInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.List[java.lang.String]]("DiskIds")).mapN(org.lyranthe.araethura.storagegateway.models.AddWorkingStorageInput.apply _)
  }
  final implicit val RefreshCacheInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RefreshCacheInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FileShareARN").map(org.lyranthe.araethura.storagegateway.models.RefreshCacheInput.apply _)
  }
  final implicit val UpdateVTLDeviceTypeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateVTLDeviceTypeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VTLDeviceARN").map(org.lyranthe.araethura.storagegateway.models.UpdateVTLDeviceTypeOutput.apply _)
  }
  final implicit val DescribeCacheInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeCacheInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DescribeCacheInput.apply _)
  }
  final implicit val DescribeSnapshotScheduleOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeSnapshotScheduleOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("RecurrenceInHours"), o.get[scala.Option[java.lang.String]]("Timezone"), o.get[scala.Option[scala.Int]]("StartAt"), o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("Description")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeSnapshotScheduleOutput.apply _)
  }
  final implicit val RetrieveTapeRecoveryPointOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RetrieveTapeRecoveryPointOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.RetrieveTapeRecoveryPointOutput.apply _)
  }
  final implicit val AddCacheInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddCacheInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.List[java.lang.String]]("DiskIds")).mapN(org.lyranthe.araethura.storagegateway.models.AddCacheInput.apply _)
  }
  final implicit val DiskDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.Disk] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DiskId"), o.get[scala.Option[java.lang.String]]("DiskPath"), o.get[scala.Option[java.lang.String]]("DiskNode"), o.get[scala.Option[java.lang.String]]("DiskStatus"), o.get[scala.Option[java.lang.String]]("DiskAllocationResource"), o.get[scala.Option[scala.Long]]("DiskSizeInBytes"), o.get[scala.Option[java.lang.String]]("DiskAllocationType")).mapN(org.lyranthe.araethura.storagegateway.models.Disk.apply _)
  }
  final implicit val VTLDeviceDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.VTLDevice] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VTLDeviceProductIdentifier"), o.get[scala.Option[java.lang.String]]("VTLDeviceVendor"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.DeviceiSCSIAttributes]]("DeviceiSCSIAttributes"), o.get[scala.Option[java.lang.String]]("VTLDeviceType"), o.get[scala.Option[java.lang.String]]("VTLDeviceARN")).mapN(org.lyranthe.araethura.storagegateway.models.VTLDevice.apply _)
  }
  final implicit val CreateCachediSCSIVolumeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateCachediSCSIVolumeInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("VolumeSizeInBytes"), o.get[java.lang.String]("NetworkInterfaceId"), o.get[java.lang.String]("ClientToken"), o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TargetName"), o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("SourceVolumeARN")).mapN(org.lyranthe.araethura.storagegateway.models.CreateCachediSCSIVolumeInput.apply _)
  }
  final implicit val CreateSnapshotOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("SnapshotId")).mapN(org.lyranthe.araethura.storagegateway.models.CreateSnapshotOutput.apply _)
  }
  final implicit val DescribeNFSFileSharesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeNFSFileSharesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("FileShareARNList").map(org.lyranthe.araethura.storagegateway.models.DescribeNFSFileSharesInput.apply _)
  }
  final implicit val RemoveTagsFromResourceInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RemoveTagsFromResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(org.lyranthe.araethura.storagegateway.models.RemoveTagsFromResourceInput.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.InternalServerError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.StorageGatewayError]]("error")).mapN(org.lyranthe.araethura.storagegateway.models.InternalServerError.apply _)
  }
  final implicit val InvalidGatewayRequestExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.InvalidGatewayRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.StorageGatewayError]]("error")).mapN(org.lyranthe.araethura.storagegateway.models.InvalidGatewayRequestException.apply _)
  }
  final implicit val DescribeVTLDevicesOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeVTLDevicesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.VTLDevice]]]("VTLDevices"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeVTLDevicesOutput.apply _)
  }
  final implicit val DescribeUploadBufferInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeUploadBufferInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DescribeUploadBufferInput.apply _)
  }
  final implicit val DescribeTapesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeTapesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeTapesInput.apply _)
  }
  final implicit val ListVolumeRecoveryPointsOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListVolumeRecoveryPointsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.VolumeRecoveryPointInfo]]]("VolumeRecoveryPointInfos")).mapN(org.lyranthe.araethura.storagegateway.models.ListVolumeRecoveryPointsOutput.apply _)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateSnapshotFromVolumeRecoveryPointInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeARN"), o.get[java.lang.String]("SnapshotDescription")).mapN(org.lyranthe.araethura.storagegateway.models.CreateSnapshotFromVolumeRecoveryPointInput.apply _)
  }
  final implicit val CancelRetrievalInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CancelRetrievalInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TapeARN")).mapN(org.lyranthe.araethura.storagegateway.models.CancelRetrievalInput.apply _)
  }
  final implicit val DescribeVTLDevicesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DescribeVTLDevicesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("VTLDeviceARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.DescribeVTLDevicesInput.apply _)
  }
  final implicit val ListTagsForResourceOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListTagsForResourceOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[org.lyranthe.araethura.storagegateway.models.Tag]]]("Tags")).mapN(org.lyranthe.araethura.storagegateway.models.ListTagsForResourceOutput.apply _)
  }
  final implicit val UpdateGatewaySoftwareNowOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateGatewaySoftwareNowOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.UpdateGatewaySoftwareNowOutput.apply _)
  }
  final implicit val UpdateNFSFileShareOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateNFSFileShareOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(org.lyranthe.araethura.storagegateway.models.UpdateNFSFileShareOutput.apply _)
  }
  final implicit val ListVolumeRecoveryPointsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListVolumeRecoveryPointsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ListVolumeRecoveryPointsInput.apply _)
  }
  final implicit val AddUploadBufferInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddUploadBufferInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.List[java.lang.String]]("DiskIds")).mapN(org.lyranthe.araethura.storagegateway.models.AddUploadBufferInput.apply _)
  }
  final implicit val DeleteTapeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteTapeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteTapeOutput.apply _)
  }
  final implicit val CreateCachediSCSIVolumeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateCachediSCSIVolumeOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("TargetARN")).mapN(org.lyranthe.araethura.storagegateway.models.CreateCachediSCSIVolumeOutput.apply _)
  }
  final implicit val ResetCacheOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ResetCacheOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.ResetCacheOutput.apply _)
  }
  final implicit val ListFileSharesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListFileSharesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.storagegateway.models.ListFileSharesInput.apply _)
  }
  final implicit val DeleteVolumeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteVolumeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteVolumeOutput.apply _)
  }
  final implicit val UpdateBandwidthRateLimitInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.UpdateBandwidthRateLimitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.Long]]("AverageUploadRateLimitInBitsPerSec"), o.get[scala.Option[scala.Long]]("AverageDownloadRateLimitInBitsPerSec")).mapN(org.lyranthe.araethura.storagegateway.models.UpdateBandwidthRateLimitInput.apply _)
  }
  final implicit val DeleteGatewayInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.DeleteGatewayInput.apply _)
  }
  final implicit val GatewayInfoDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.GatewayInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayId"), o.get[scala.Option[java.lang.String]]("GatewayOperationalState"), o.get[scala.Option[java.lang.String]]("GatewayType"), o.get[scala.Option[java.lang.String]]("GatewayName"), o.get[scala.Option[java.lang.String]]("GatewayARN")).mapN(org.lyranthe.araethura.storagegateway.models.GatewayInfo.apply _)
  }
  final implicit val RemoveTagsFromResourceOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.RemoveTagsFromResourceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResourceARN").map(org.lyranthe.araethura.storagegateway.models.RemoveTagsFromResourceOutput.apply _)
  }
  final implicit val CachediSCSIVolumeDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CachediSCSIVolume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceSnapshotId"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[scala.Double]]("VolumeProgress"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[org.lyranthe.araethura.storagegateway.models.VolumeiSCSIAttributes]]("VolumeiSCSIAttributes"), o.get[scala.Option[java.lang.String]]("VolumeStatus"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[java.lang.String]]("VolumeARN")).mapN(org.lyranthe.araethura.storagegateway.models.CachediSCSIVolume.apply _)
  }
  final implicit val ListVolumeInitiatorsInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListVolumeInitiatorsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.ListVolumeInitiatorsInput.apply _)
  }
  final implicit val AddTagsToResourceOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.AddTagsToResourceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResourceARN").map(org.lyranthe.araethura.storagegateway.models.AddTagsToResourceOutput.apply _)
  }
  final implicit val DeleteVolumeInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.DeleteVolumeInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(org.lyranthe.araethura.storagegateway.models.DeleteVolumeInput.apply _)
  }
  final implicit val StartGatewayInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.StartGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(org.lyranthe.araethura.storagegateway.models.StartGatewayInput.apply _)
  }
  final implicit val ListVolumesInputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.ListVolumesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(org.lyranthe.araethura.storagegateway.models.ListVolumesInput.apply _)
  }
  final implicit val CreateTapeWithBarcodeOutputDecoder: io.circe.Decoder[org.lyranthe.araethura.storagegateway.models.CreateTapeWithBarcodeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(org.lyranthe.araethura.storagegateway.models.CreateTapeWithBarcodeOutput.apply _)
  }
}