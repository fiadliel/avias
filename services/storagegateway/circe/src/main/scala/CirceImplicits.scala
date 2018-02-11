package org.lyranthe.araethura.storagegateway
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val CreateTapesOutputEncoder: io.circe.Encoder[models.CreateTapesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARNs" -> o.tapeARNs.asJson)
  }
  final implicit val ListVolumesOutputEncoder: io.circe.Encoder[models.ListVolumesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Marker" -> o.marker.asJson, "VolumeInfos" -> o.volumeInfos.asJson)
  }
  final implicit val DescribeStorediSCSIVolumesInputEncoder: io.circe.Encoder[models.DescribeStorediSCSIVolumesInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARNs" -> o.volumeARNs.asJson)
  }
  final implicit val VolumeInfoEncoder: io.circe.Encoder[models.VolumeInfo] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayId" -> o.gatewayId.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "VolumeType" -> o.volumeType.asJson, "GatewayARN" -> o.gatewayARN.asJson, "VolumeId" -> o.volumeId.asJson, "VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val ListVolumeInitiatorsOutputEncoder: io.circe.Encoder[models.ListVolumeInitiatorsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Initiators" -> o.initiators.asJson)
  }
  final implicit val DescribeChapCredentialsOutputEncoder: io.circe.Encoder[models.DescribeChapCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ChapCredentials" -> o.chapCredentials.asJson)
  }
  final implicit val RetrieveTapeArchiveInputEncoder: io.circe.Encoder[models.RetrieveTapeArchiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val NFSFileShareDefaultsEncoder: io.circe.Encoder[models.NFSFileShareDefaults] = io.circe.Encoder.instance { o => 
    Json.obj("FileMode" -> o.fileMode.asJson, "DirectoryMode" -> o.directoryMode.asJson, "GroupId" -> o.groupId.asJson, "OwnerId" -> o.ownerId.asJson)
  }
  final implicit val AddWorkingStorageOutputEncoder: io.circe.Encoder[models.AddWorkingStorageOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListTagsForResourceInputEncoder: io.circe.Encoder[models.ListTagsForResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val DeviceiSCSIAttributesEncoder: io.circe.Encoder[models.DeviceiSCSIAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "NetworkInterfaceId" -> o.networkInterfaceId.asJson, "NetworkInterfacePort" -> o.networkInterfacePort.asJson, "ChapEnabled" -> o.chapEnabled.asJson)
  }
  final implicit val DescribeCachediSCSIVolumesInputEncoder: io.circe.Encoder[models.DescribeCachediSCSIVolumesInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARNs" -> o.volumeARNs.asJson)
  }
  final implicit val ShutdownGatewayInputEncoder: io.circe.Encoder[models.ShutdownGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeBandwidthRateLimitOutputEncoder: io.circe.Encoder[models.DescribeBandwidthRateLimitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "AverageUploadRateLimitInBitsPerSec" -> o.averageUploadRateLimitInBitsPerSec.asJson, "AverageDownloadRateLimitInBitsPerSec" -> o.averageDownloadRateLimitInBitsPerSec.asJson)
  }
  final implicit val SetLocalConsolePasswordInputEncoder: io.circe.Encoder[models.SetLocalConsolePasswordInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "LocalConsolePassword" -> o.localConsolePassword.asJson)
  }
  final implicit val UpdateNFSFileShareInputEncoder: io.circe.Encoder[models.UpdateNFSFileShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson, "ClientList" -> o.clientList.asJson, "NFSFileShareDefaults" -> o.nfsfileShareDefaults.asJson, "KMSEncrypted" -> o.kmsencrypted.asJson, "ReadOnly" -> o.readOnly.asJson, "DefaultStorageClass" -> o.defaultStorageClass.asJson, "KMSKey" -> o.kmskey.asJson, "Squash" -> o.squash.asJson)
  }
  final implicit val ListGatewaysOutputEncoder: io.circe.Encoder[models.ListGatewaysOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Gateways" -> o.gateways.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ListGatewaysInputEncoder: io.circe.Encoder[models.ListGatewaysInput] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val UpdateSnapshotScheduleOutputEncoder: io.circe.Encoder[models.UpdateSnapshotScheduleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val DescribeCachediSCSIVolumesOutputEncoder: io.circe.Encoder[models.DescribeCachediSCSIVolumesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("CachediSCSIVolumes" -> o.cachediSCSIVolumes.asJson)
  }
  final implicit val TapeInfoEncoder: io.circe.Encoder[models.TapeInfo] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "TapeStatus" -> o.tapeStatus.asJson, "TapeBarcode" -> o.tapeBarcode.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ShutdownGatewayOutputEncoder: io.circe.Encoder[models.ShutdownGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DeleteFileShareInputEncoder: io.circe.Encoder[models.DeleteFileShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson, "ForceDelete" -> o.forceDelete.asJson)
  }
  final implicit val DescribeBandwidthRateLimitInputEncoder: io.circe.Encoder[models.DescribeBandwidthRateLimitInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DeleteSnapshotScheduleInputEncoder: io.circe.Encoder[models.DeleteSnapshotScheduleInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val DescribeTapeRecoveryPointsInputEncoder: io.circe.Encoder[models.DescribeTapeRecoveryPointsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListTapesInputEncoder: io.circe.Encoder[models.ListTapesInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARNs" -> o.tapeARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateTapeWithBarcodeInputEncoder: io.circe.Encoder[models.CreateTapeWithBarcodeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "TapeBarcode" -> o.tapeBarcode.asJson)
  }
  final implicit val CreateStorediSCSIVolumeOutputEncoder: io.circe.Encoder[models.CreateStorediSCSIVolumeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "TargetARN" -> o.targetARN.asJson)
  }
  final implicit val DisableGatewayOutputEncoder: io.circe.Encoder[models.DisableGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ResetCacheInputEncoder: io.circe.Encoder[models.ResetCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CancelRetrievalOutputEncoder: io.circe.Encoder[models.CancelRetrievalOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeMaintenanceStartTimeInputEncoder: io.circe.Encoder[models.DescribeMaintenanceStartTimeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val CreateNFSFileShareInputEncoder: io.circe.Encoder[models.CreateNFSFileShareInput] = io.circe.Encoder.instance { o => 
    Json.obj("Role" -> o.role.asJson, "LocationARN" -> o.locationARN.asJson, "ClientToken" -> o.clientToken.asJson, "GatewayARN" -> o.gatewayARN.asJson, "ClientList" -> o.clientList.asJson, "NFSFileShareDefaults" -> o.nfsfileShareDefaults.asJson, "KMSEncrypted" -> o.kmsencrypted.asJson, "ReadOnly" -> o.readOnly.asJson, "DefaultStorageClass" -> o.defaultStorageClass.asJson, "KMSKey" -> o.kmskey.asJson, "Squash" -> o.squash.asJson)
  }
  final implicit val ActivateGatewayOutputEncoder: io.circe.Encoder[models.ActivateGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CreateSnapshotInputEncoder: io.circe.Encoder[models.CreateSnapshotInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "SnapshotDescription" -> o.snapshotDescription.asJson)
  }
  final implicit val DeleteBandwidthRateLimitOutputEncoder: io.circe.Encoder[models.DeleteBandwidthRateLimitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DisableGatewayInputEncoder: io.circe.Encoder[models.DisableGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeGatewayInformationInputEncoder: io.circe.Encoder[models.DescribeGatewayInformationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeTapeArchivesOutputEncoder: io.circe.Encoder[models.DescribeTapeArchivesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeArchives" -> o.tapeArchives.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ChapInfoEncoder: io.circe.Encoder[models.ChapInfo] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "SecretToAuthenticateInitiator" -> o.secretToAuthenticateInitiator.asJson, "SecretToAuthenticateTarget" -> o.secretToAuthenticateTarget.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointOutputEncoder: io.circe.Encoder[models.CreateSnapshotFromVolumeRecoveryPointOutput] = io.circe.Encoder.instance { o => 
    Json.obj("SnapshotId" -> o.snapshotId.asJson, "VolumeARN" -> o.volumeARN.asJson, "VolumeRecoveryPointTime" -> o.volumeRecoveryPointTime.asJson)
  }
  final implicit val DeleteGatewayOutputEncoder: io.circe.Encoder[models.DeleteGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CreateTapesInputEncoder: io.circe.Encoder[models.CreateTapesInput] = io.circe.Encoder.instance { o => 
    Json.obj("ClientToken" -> o.clientToken.asJson, "TapeBarcodePrefix" -> o.tapeBarcodePrefix.asJson, "NumTapesToCreate" -> o.numTapesToCreate.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListFileSharesOutputEncoder: io.circe.Encoder[models.ListFileSharesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "NextMarker" -> o.nextMarker.asJson, "FileShareInfoList" -> o.fileShareInfoList.asJson)
  }
  final implicit val StorediSCSIVolumeEncoder: io.circe.Encoder[models.StorediSCSIVolume] = io.circe.Encoder.instance { o => 
    Json.obj("SourceSnapshotId" -> o.sourceSnapshotId.asJson, "CreatedDate" -> o.createdDate.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "PreservedExistingData" -> o.preservedExistingData.asJson, "VolumeProgress" -> o.volumeProgress.asJson, "VolumeType" -> o.volumeType.asJson, "VolumeiSCSIAttributes" -> o.volumeiSCSIAttributes.asJson, "VolumeDiskId" -> o.volumeDiskId.asJson, "VolumeStatus" -> o.volumeStatus.asJson, "VolumeId" -> o.volumeId.asJson, "VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val VolumeRecoveryPointInfoEncoder: io.circe.Encoder[models.VolumeRecoveryPointInfo] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "VolumeUsageInBytes" -> o.volumeUsageInBytes.asJson, "VolumeRecoveryPointTime" -> o.volumeRecoveryPointTime.asJson)
  }
  final implicit val UpdateSnapshotScheduleInputEncoder: io.circe.Encoder[models.UpdateSnapshotScheduleInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "StartAt" -> o.startAt.asJson, "RecurrenceInHours" -> o.recurrenceInHours.asJson, "Description" -> o.description.asJson)
  }
  final implicit val DescribeGatewayInformationOutputEncoder: io.circe.Encoder[models.DescribeGatewayInformationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayId" -> o.gatewayId.asJson, "NextUpdateAvailabilityDate" -> o.nextUpdateAvailabilityDate.asJson, "GatewayType" -> o.gatewayType.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayTimezone" -> o.gatewayTimezone.asJson, "GatewayState" -> o.gatewayState.asJson, "GatewayNetworkInterfaces" -> o.gatewayNetworkInterfaces.asJson, "GatewayARN" -> o.gatewayARN.asJson, "LastSoftwareUpdate" -> o.lastSoftwareUpdate.asJson)
  }
  final implicit val AddTagsToResourceInputEncoder: io.circe.Encoder[models.AddTagsToResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val RetrieveTapeRecoveryPointInputEncoder: io.circe.Encoder[models.RetrieveTapeRecoveryPointInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeMaintenanceStartTimeOutputEncoder: io.circe.Encoder[models.DescribeMaintenanceStartTimeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("MinuteOfHour" -> o.minuteOfHour.asJson, "Timezone" -> o.timezone.asJson, "GatewayARN" -> o.gatewayARN.asJson, "HourOfDay" -> o.hourOfDay.asJson, "DayOfWeek" -> o.dayOfWeek.asJson)
  }
  final implicit val RefreshCacheOutputEncoder: io.circe.Encoder[models.RefreshCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val DescribeTapesOutputEncoder: io.circe.Encoder[models.DescribeTapesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("Tapes" -> o.tapes.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteChapCredentialsInputEncoder: io.circe.Encoder[models.DeleteChapCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val DescribeStorediSCSIVolumesOutputEncoder: io.circe.Encoder[models.DescribeStorediSCSIVolumesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("StorediSCSIVolumes" -> o.storediSCSIVolumes.asJson)
  }
  final implicit val UpdateVTLDeviceTypeInputEncoder: io.circe.Encoder[models.UpdateVTLDeviceTypeInput] = io.circe.Encoder.instance { o => 
    Json.obj("VTLDeviceARN" -> o.vtldeviceARN.asJson, "DeviceType" -> o.deviceType.asJson)
  }
  final implicit val DeleteTapeArchiveInputEncoder: io.circe.Encoder[models.DeleteTapeArchiveInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DeleteSnapshotScheduleOutputEncoder: io.circe.Encoder[models.DeleteSnapshotScheduleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val DeleteFileShareOutputEncoder: io.circe.Encoder[models.DeleteFileShareOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val NetworkInterfaceEncoder: io.circe.Encoder[models.NetworkInterface] = io.circe.Encoder.instance { o => 
    Json.obj("Ipv4Address" -> o.ipv4Address.asJson, "MacAddress" -> o.macAddress.asJson, "Ipv6Address" -> o.ipv6Address.asJson)
  }
  final implicit val UpdateGatewaySoftwareNowInputEncoder: io.circe.Encoder[models.UpdateGatewaySoftwareNowInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val UpdateChapCredentialsOutputEncoder: io.circe.Encoder[models.UpdateChapCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val CancelArchivalInputEncoder: io.circe.Encoder[models.CancelArchivalInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val NFSFileShareInfoEncoder: io.circe.Encoder[models.NFSFileShareInfo] = io.circe.Encoder.instance { o => 
    Json.obj("ClientList" -> o.clientList.asJson, "NFSFileShareDefaults" -> o.nfsfileShareDefaults.asJson, "FileShareStatus" -> o.fileShareStatus.asJson, "Role" -> o.role.asJson, "ReadOnly" -> o.readOnly.asJson, "LocationARN" -> o.locationARN.asJson, "KMSEncrypted" -> o.kmsencrypted.asJson, "DefaultStorageClass" -> o.defaultStorageClass.asJson, "FileShareARN" -> o.fileShareARN.asJson, "KMSKey" -> o.kmskey.asJson, "Path" -> o.path.asJson, "GatewayARN" -> o.gatewayARN.asJson, "Squash" -> o.squash.asJson, "FileShareId" -> o.fileShareId.asJson)
  }
  final implicit val UpdateBandwidthRateLimitOutputEncoder: io.circe.Encoder[models.UpdateBandwidthRateLimitOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListTapesOutputEncoder: io.circe.Encoder[models.ListTapesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeInfos" -> o.tapeInfos.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ActivateGatewayInputEncoder: io.circe.Encoder[models.ActivateGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayRegion" -> o.gatewayRegion.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayTimezone" -> o.gatewayTimezone.asJson, "ActivationKey" -> o.activationKey.asJson, "GatewayType" -> o.gatewayType.asJson, "MediumChangerType" -> o.mediumChangerType.asJson, "TapeDriveType" -> o.tapeDriveType.asJson)
  }
  final implicit val StorageGatewayErrorEncoder: io.circe.Encoder[models.StorageGatewayError] = io.circe.Encoder.instance { o => 
    Json.obj("errorCode" -> o.errorCode.asJson, "errorDetails" -> o.errorDetails.asJson)
  }
  final implicit val SetLocalConsolePasswordOutputEncoder: io.circe.Encoder[models.SetLocalConsolePasswordOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val UpdateChapCredentialsInputEncoder: io.circe.Encoder[models.UpdateChapCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "SecretToAuthenticateInitiator" -> o.secretToAuthenticateInitiator.asJson, "InitiatorName" -> o.initiatorName.asJson, "SecretToAuthenticateTarget" -> o.secretToAuthenticateTarget.asJson)
  }
  final implicit val DeleteChapCredentialsOutputEncoder: io.circe.Encoder[models.DeleteChapCredentialsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson, "InitiatorName" -> o.initiatorName.asJson)
  }
  final implicit val DescribeChapCredentialsInputEncoder: io.circe.Encoder[models.DescribeChapCredentialsInput] = io.circe.Encoder.instance { o => 
    Json.obj("TargetARN" -> o.targetARN.asJson)
  }
  final implicit val DescribeWorkingStorageOutputEncoder: io.circe.Encoder[models.DescribeWorkingStorageOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson, "WorkingStorageUsedInBytes" -> o.workingStorageUsedInBytes.asJson, "WorkingStorageAllocatedInBytes" -> o.workingStorageAllocatedInBytes.asJson)
  }
  final implicit val RetrieveTapeArchiveOutputEncoder: io.circe.Encoder[models.RetrieveTapeArchiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DeleteBandwidthRateLimitInputEncoder: io.circe.Encoder[models.DeleteBandwidthRateLimitInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "BandwidthType" -> o.bandwidthType.asJson)
  }
  final implicit val CreateNFSFileShareOutputEncoder: io.circe.Encoder[models.CreateNFSFileShareOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val UpdateMaintenanceStartTimeInputEncoder: io.circe.Encoder[models.UpdateMaintenanceStartTimeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "HourOfDay" -> o.hourOfDay.asJson, "MinuteOfHour" -> o.minuteOfHour.asJson, "DayOfWeek" -> o.dayOfWeek.asJson)
  }
  final implicit val UpdateGatewayInformationOutputEncoder: io.circe.Encoder[models.UpdateGatewayInformationOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "GatewayName" -> o.gatewayName.asJson)
  }
  final implicit val UpdateGatewayInformationInputEncoder: io.circe.Encoder[models.UpdateGatewayInformationInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayTimezone" -> o.gatewayTimezone.asJson)
  }
  final implicit val TapeRecoveryPointInfoEncoder: io.circe.Encoder[models.TapeRecoveryPointInfo] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson, "TapeRecoveryPointTime" -> o.tapeRecoveryPointTime.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "TapeStatus" -> o.tapeStatus.asJson)
  }
  final implicit val ServiceUnavailableErrorEncoder: io.circe.Encoder[models.ServiceUnavailableError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "error" -> o.error.asJson)
  }
  final implicit val FileShareInfoEncoder: io.circe.Encoder[models.FileShareInfo] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson, "FileShareId" -> o.fileShareId.asJson, "FileShareStatus" -> o.fileShareStatus.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val AddUploadBufferOutputEncoder: io.circe.Encoder[models.AddUploadBufferOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val CreateStorediSCSIVolumeInputEncoder: io.circe.Encoder[models.CreateStorediSCSIVolumeInput] = io.circe.Encoder.instance { o => 
    Json.obj("NetworkInterfaceId" -> o.networkInterfaceId.asJson, "PreserveExistingData" -> o.preserveExistingData.asJson, "GatewayARN" -> o.gatewayARN.asJson, "DiskId" -> o.diskId.asJson, "TargetName" -> o.targetName.asJson, "SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeTapeArchivesInputEncoder: io.circe.Encoder[models.DescribeTapeArchivesInput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARNs" -> o.tapeARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val UpdateMaintenanceStartTimeOutputEncoder: io.circe.Encoder[models.UpdateMaintenanceStartTimeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeSnapshotScheduleInputEncoder: io.circe.Encoder[models.DescribeSnapshotScheduleInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val AddCacheOutputEncoder: io.circe.Encoder[models.AddCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListLocalDisksInputEncoder: io.circe.Encoder[models.ListLocalDisksInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeWorkingStorageInputEncoder: io.circe.Encoder[models.DescribeWorkingStorageInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DeleteTapeInputEncoder: io.circe.Encoder[models.DeleteTapeInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val CancelArchivalOutputEncoder: io.circe.Encoder[models.CancelArchivalOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeUploadBufferOutputEncoder: io.circe.Encoder[models.DescribeUploadBufferOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson, "UploadBufferUsedInBytes" -> o.uploadBufferUsedInBytes.asJson, "UploadBufferAllocatedInBytes" -> o.uploadBufferAllocatedInBytes.asJson)
  }
  final implicit val DescribeCacheOutputEncoder: io.circe.Encoder[models.DescribeCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson, "CacheAllocatedInBytes" -> o.cacheAllocatedInBytes.asJson, "CacheUsedPercentage" -> o.cacheUsedPercentage.asJson, "CacheDirtyPercentage" -> o.cacheDirtyPercentage.asJson, "CacheHitPercentage" -> o.cacheHitPercentage.asJson, "CacheMissPercentage" -> o.cacheMissPercentage.asJson)
  }
  final implicit val TapeArchiveEncoder: io.circe.Encoder[models.TapeArchive] = io.circe.Encoder.instance { o => 
    Json.obj("TapeStatus" -> o.tapeStatus.asJson, "TapeARN" -> o.tapeARN.asJson, "TapeBarcode" -> o.tapeBarcode.asJson, "TapeUsedInBytes" -> o.tapeUsedInBytes.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "RetrievedTo" -> o.retrievedTo.asJson, "TapeCreatedDate" -> o.tapeCreatedDate.asJson, "CompletionTime" -> o.completionTime.asJson)
  }
  final implicit val TapeEncoder: io.circe.Encoder[models.Tape] = io.circe.Encoder.instance { o => 
    Json.obj("Progress" -> o.progress.asJson, "TapeARN" -> o.tapeARN.asJson, "TapeStatus" -> o.tapeStatus.asJson, "TapeBarcode" -> o.tapeBarcode.asJson, "TapeUsedInBytes" -> o.tapeUsedInBytes.asJson, "TapeSizeInBytes" -> o.tapeSizeInBytes.asJson, "VTLDevice" -> o.vtldevice.asJson, "TapeCreatedDate" -> o.tapeCreatedDate.asJson)
  }
  final implicit val StartGatewayOutputEncoder: io.circe.Encoder[models.StartGatewayOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val VolumeiSCSIAttributesEncoder: io.circe.Encoder[models.VolumeiSCSIAttributes] = io.circe.Encoder.instance { o => 
    Json.obj("NetworkInterfaceId" -> o.networkInterfaceId.asJson, "TargetARN" -> o.targetARN.asJson, "ChapEnabled" -> o.chapEnabled.asJson, "NetworkInterfacePort" -> o.networkInterfacePort.asJson, "LunNumber" -> o.lunNumber.asJson)
  }
  final implicit val ListLocalDisksOutputEncoder: io.circe.Encoder[models.ListLocalDisksOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Disks" -> o.disks.asJson)
  }
  final implicit val DescribeTapeRecoveryPointsOutputEncoder: io.circe.Encoder[models.DescribeTapeRecoveryPointsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeRecoveryPointInfos" -> o.tapeRecoveryPointInfos.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteTapeArchiveOutputEncoder: io.circe.Encoder[models.DeleteTapeArchiveOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeNFSFileSharesOutputEncoder: io.circe.Encoder[models.DescribeNFSFileSharesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("NFSFileShareInfoList" -> o.nfsfileShareInfoList.asJson)
  }
  final implicit val AddWorkingStorageInputEncoder: io.circe.Encoder[models.AddWorkingStorageInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson)
  }
  final implicit val RefreshCacheInputEncoder: io.circe.Encoder[models.RefreshCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val UpdateVTLDeviceTypeOutputEncoder: io.circe.Encoder[models.UpdateVTLDeviceTypeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VTLDeviceARN" -> o.vtldeviceARN.asJson)
  }
  final implicit val DescribeCacheInputEncoder: io.circe.Encoder[models.DescribeCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeSnapshotScheduleOutputEncoder: io.circe.Encoder[models.DescribeSnapshotScheduleOutput] = io.circe.Encoder.instance { o => 
    Json.obj("RecurrenceInHours" -> o.recurrenceInHours.asJson, "Timezone" -> o.timezone.asJson, "StartAt" -> o.startAt.asJson, "VolumeARN" -> o.volumeARN.asJson, "Description" -> o.description.asJson)
  }
  final implicit val RetrieveTapeRecoveryPointOutputEncoder: io.circe.Encoder[models.RetrieveTapeRecoveryPointOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val AddCacheInputEncoder: io.circe.Encoder[models.AddCacheInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson)
  }
  final implicit val DiskEncoder: io.circe.Encoder[models.Disk] = io.circe.Encoder.instance { o => 
    Json.obj("DiskId" -> o.diskId.asJson, "DiskPath" -> o.diskPath.asJson, "DiskNode" -> o.diskNode.asJson, "DiskStatus" -> o.diskStatus.asJson, "DiskAllocationResource" -> o.diskAllocationResource.asJson, "DiskSizeInBytes" -> o.diskSizeInBytes.asJson, "DiskAllocationType" -> o.diskAllocationType.asJson)
  }
  final implicit val VTLDeviceEncoder: io.circe.Encoder[models.VTLDevice] = io.circe.Encoder.instance { o => 
    Json.obj("VTLDeviceProductIdentifier" -> o.vtldeviceProductIdentifier.asJson, "VTLDeviceVendor" -> o.vtldeviceVendor.asJson, "DeviceiSCSIAttributes" -> o.deviceiSCSIAttributes.asJson, "VTLDeviceType" -> o.vtldeviceType.asJson, "VTLDeviceARN" -> o.vtldeviceARN.asJson)
  }
  final implicit val CreateCachediSCSIVolumeInputEncoder: io.circe.Encoder[models.CreateCachediSCSIVolumeInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "NetworkInterfaceId" -> o.networkInterfaceId.asJson, "ClientToken" -> o.clientToken.asJson, "GatewayARN" -> o.gatewayARN.asJson, "TargetName" -> o.targetName.asJson, "SnapshotId" -> o.snapshotId.asJson, "SourceVolumeARN" -> o.sourceVolumeARN.asJson)
  }
  final implicit val CreateSnapshotOutputEncoder: io.circe.Encoder[models.CreateSnapshotOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "SnapshotId" -> o.snapshotId.asJson)
  }
  final implicit val DescribeNFSFileSharesInputEncoder: io.circe.Encoder[models.DescribeNFSFileSharesInput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARNList" -> o.fileShareARNList.asJson)
  }
  final implicit val RemoveTagsFromResourceInputEncoder: io.circe.Encoder[models.RemoveTagsFromResourceInput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val InternalServerErrorEncoder: io.circe.Encoder[models.InternalServerError] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "error" -> o.error.asJson)
  }
  final implicit val InvalidGatewayRequestExceptionEncoder: io.circe.Encoder[models.InvalidGatewayRequestException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "error" -> o.error.asJson)
  }
  final implicit val DescribeVTLDevicesOutputEncoder: io.circe.Encoder[models.DescribeVTLDevicesOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "VTLDevices" -> o.vtldevices.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DescribeUploadBufferInputEncoder: io.circe.Encoder[models.DescribeUploadBufferInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val DescribeTapesInputEncoder: io.circe.Encoder[models.DescribeTapesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARNs" -> o.tapeARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListVolumeRecoveryPointsOutputEncoder: io.circe.Encoder[models.ListVolumeRecoveryPointsOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "VolumeRecoveryPointInfos" -> o.volumeRecoveryPointInfos.asJson)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointInputEncoder: io.circe.Encoder[models.CreateSnapshotFromVolumeRecoveryPointInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "SnapshotDescription" -> o.snapshotDescription.asJson)
  }
  final implicit val CancelRetrievalInputEncoder: io.circe.Encoder[models.CancelRetrievalInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val DescribeVTLDevicesInputEncoder: io.circe.Encoder[models.DescribeVTLDevicesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "VTLDeviceARNs" -> o.vtldeviceARNs.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val ListTagsForResourceOutputEncoder: io.circe.Encoder[models.ListTagsForResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson, "Marker" -> o.marker.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val UpdateGatewaySoftwareNowOutputEncoder: io.circe.Encoder[models.UpdateGatewaySoftwareNowOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val UpdateNFSFileShareOutputEncoder: io.circe.Encoder[models.UpdateNFSFileShareOutput] = io.circe.Encoder.instance { o => 
    Json.obj("FileShareARN" -> o.fileShareARN.asJson)
  }
  final implicit val ListVolumeRecoveryPointsInputEncoder: io.circe.Encoder[models.ListVolumeRecoveryPointsInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val AddUploadBufferInputEncoder: io.circe.Encoder[models.AddUploadBufferInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "DiskIds" -> o.diskIds.asJson)
  }
  final implicit val DeleteTapeOutputEncoder: io.circe.Encoder[models.DeleteTapeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val CreateCachediSCSIVolumeOutputEncoder: io.circe.Encoder[models.CreateCachediSCSIVolumeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson, "TargetARN" -> o.targetARN.asJson)
  }
  final implicit val ResetCacheOutputEncoder: io.circe.Encoder[models.ResetCacheOutput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListFileSharesInputEncoder: io.circe.Encoder[models.ListFileSharesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DeleteVolumeOutputEncoder: io.circe.Encoder[models.DeleteVolumeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val UpdateBandwidthRateLimitInputEncoder: io.circe.Encoder[models.UpdateBandwidthRateLimitInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "AverageUploadRateLimitInBitsPerSec" -> o.averageUploadRateLimitInBitsPerSec.asJson, "AverageDownloadRateLimitInBitsPerSec" -> o.averageDownloadRateLimitInBitsPerSec.asJson)
  }
  final implicit val DeleteGatewayInputEncoder: io.circe.Encoder[models.DeleteGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val GatewayInfoEncoder: io.circe.Encoder[models.GatewayInfo] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayId" -> o.gatewayId.asJson, "GatewayOperationalState" -> o.gatewayOperationalState.asJson, "GatewayType" -> o.gatewayType.asJson, "GatewayName" -> o.gatewayName.asJson, "GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val RemoveTagsFromResourceOutputEncoder: io.circe.Encoder[models.RemoveTagsFromResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson)
  }
  final implicit val CachediSCSIVolumeEncoder: io.circe.Encoder[models.CachediSCSIVolume] = io.circe.Encoder.instance { o => 
    Json.obj("SourceSnapshotId" -> o.sourceSnapshotId.asJson, "CreatedDate" -> o.createdDate.asJson, "VolumeSizeInBytes" -> o.volumeSizeInBytes.asJson, "VolumeProgress" -> o.volumeProgress.asJson, "VolumeType" -> o.volumeType.asJson, "VolumeiSCSIAttributes" -> o.volumeiSCSIAttributes.asJson, "VolumeStatus" -> o.volumeStatus.asJson, "VolumeId" -> o.volumeId.asJson, "VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val ListVolumeInitiatorsInputEncoder: io.circe.Encoder[models.ListVolumeInitiatorsInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val AddTagsToResourceOutputEncoder: io.circe.Encoder[models.AddTagsToResourceOutput] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceARN" -> o.resourceARN.asJson)
  }
  final implicit val DeleteVolumeInputEncoder: io.circe.Encoder[models.DeleteVolumeInput] = io.circe.Encoder.instance { o => 
    Json.obj("VolumeARN" -> o.volumeARN.asJson)
  }
  final implicit val StartGatewayInputEncoder: io.circe.Encoder[models.StartGatewayInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson)
  }
  final implicit val ListVolumesInputEncoder: io.circe.Encoder[models.ListVolumesInput] = io.circe.Encoder.instance { o => 
    Json.obj("GatewayARN" -> o.gatewayARN.asJson, "Marker" -> o.marker.asJson, "Limit" -> o.limit.asJson)
  }
  final implicit val CreateTapeWithBarcodeOutputEncoder: io.circe.Encoder[models.CreateTapeWithBarcodeOutput] = io.circe.Encoder.instance { o => 
    Json.obj("TapeARN" -> o.tapeARN.asJson)
  }
  final implicit val CreateTapesOutputDecoder: io.circe.Decoder[models.CreateTapesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs").map(models.CreateTapesOutput.apply _)
  }
  final implicit val ListVolumesOutputDecoder: io.circe.Decoder[models.ListVolumesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[models.VolumeInfo]]]("VolumeInfos")).mapN(models.ListVolumesOutput.apply _)
  }
  final implicit val DescribeStorediSCSIVolumesInputDecoder: io.circe.Decoder[models.DescribeStorediSCSIVolumesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("VolumeARNs").map(models.DescribeStorediSCSIVolumesInput.apply _)
  }
  final implicit val VolumeInfoDecoder: io.circe.Decoder[models.VolumeInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayId"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[java.lang.String]]("VolumeARN")).mapN(models.VolumeInfo.apply _)
  }
  final implicit val ListVolumeInitiatorsOutputDecoder: io.circe.Decoder[models.ListVolumeInitiatorsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[java.lang.String]]]("Initiators").map(models.ListVolumeInitiatorsOutput.apply _)
  }
  final implicit val DescribeChapCredentialsOutputDecoder: io.circe.Decoder[models.DescribeChapCredentialsOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.ChapInfo]]]("ChapCredentials").map(models.DescribeChapCredentialsOutput.apply _)
  }
  final implicit val RetrieveTapeArchiveInputDecoder: io.circe.Decoder[models.RetrieveTapeArchiveInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TapeARN"), o.get[java.lang.String]("GatewayARN")).mapN(models.RetrieveTapeArchiveInput.apply _)
  }
  final implicit val NFSFileShareDefaultsDecoder: io.circe.Decoder[models.NFSFileShareDefaults] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FileMode"), o.get[scala.Option[java.lang.String]]("DirectoryMode"), o.get[scala.Option[scala.Long]]("GroupId"), o.get[scala.Option[scala.Long]]("OwnerId")).mapN(models.NFSFileShareDefaults.apply _)
  }
  final implicit val AddWorkingStorageOutputDecoder: io.circe.Decoder[models.AddWorkingStorageOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.AddWorkingStorageOutput.apply _)
  }
  final implicit val ListTagsForResourceInputDecoder: io.circe.Decoder[models.ListTagsForResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListTagsForResourceInput.apply _)
  }
  final implicit val DeviceiSCSIAttributesDecoder: io.circe.Decoder[models.DeviceiSCSIAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("NetworkInterfaceId"), o.get[scala.Option[scala.Int]]("NetworkInterfacePort"), o.get[scala.Option[scala.Boolean]]("ChapEnabled")).mapN(models.DeviceiSCSIAttributes.apply _)
  }
  final implicit val DescribeCachediSCSIVolumesInputDecoder: io.circe.Decoder[models.DescribeCachediSCSIVolumesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("VolumeARNs").map(models.DescribeCachediSCSIVolumesInput.apply _)
  }
  final implicit val ShutdownGatewayInputDecoder: io.circe.Decoder[models.ShutdownGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.ShutdownGatewayInput.apply _)
  }
  final implicit val DescribeBandwidthRateLimitOutputDecoder: io.circe.Decoder[models.DescribeBandwidthRateLimitOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.Long]]("AverageUploadRateLimitInBitsPerSec"), o.get[scala.Option[scala.Long]]("AverageDownloadRateLimitInBitsPerSec")).mapN(models.DescribeBandwidthRateLimitOutput.apply _)
  }
  final implicit val SetLocalConsolePasswordInputDecoder: io.circe.Decoder[models.SetLocalConsolePasswordInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("LocalConsolePassword")).mapN(models.SetLocalConsolePasswordInput.apply _)
  }
  final implicit val UpdateNFSFileShareInputDecoder: io.circe.Decoder[models.UpdateNFSFileShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FileShareARN"), o.get[scala.Option[scala.List[java.lang.String]]]("ClientList"), o.get[scala.Option[models.NFSFileShareDefaults]]("NFSFileShareDefaults"), o.get[scala.Option[scala.Boolean]]("KMSEncrypted"), o.get[scala.Option[scala.Boolean]]("ReadOnly"), o.get[scala.Option[java.lang.String]]("DefaultStorageClass"), o.get[scala.Option[java.lang.String]]("KMSKey"), o.get[scala.Option[java.lang.String]]("Squash")).mapN(models.UpdateNFSFileShareInput.apply _)
  }
  final implicit val ListGatewaysOutputDecoder: io.circe.Decoder[models.ListGatewaysOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.GatewayInfo]]]("Gateways"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListGatewaysOutput.apply _)
  }
  final implicit val ListGatewaysInputDecoder: io.circe.Decoder[models.ListGatewaysInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListGatewaysInput.apply _)
  }
  final implicit val UpdateSnapshotScheduleOutputDecoder: io.circe.Decoder[models.UpdateSnapshotScheduleOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeARN").map(models.UpdateSnapshotScheduleOutput.apply _)
  }
  final implicit val DescribeCachediSCSIVolumesOutputDecoder: io.circe.Decoder[models.DescribeCachediSCSIVolumesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.CachediSCSIVolume]]]("CachediSCSIVolumes").map(models.DescribeCachediSCSIVolumesOutput.apply _)
  }
  final implicit val TapeInfoDecoder: io.circe.Decoder[models.TapeInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.lang.String]]("TapeStatus"), o.get[scala.Option[java.lang.String]]("TapeBarcode"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("GatewayARN")).mapN(models.TapeInfo.apply _)
  }
  final implicit val ShutdownGatewayOutputDecoder: io.circe.Decoder[models.ShutdownGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.ShutdownGatewayOutput.apply _)
  }
  final implicit val DeleteFileShareInputDecoder: io.circe.Decoder[models.DeleteFileShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("FileShareARN"), o.get[scala.Option[scala.Boolean]]("ForceDelete")).mapN(models.DeleteFileShareInput.apply _)
  }
  final implicit val DescribeBandwidthRateLimitInputDecoder: io.circe.Decoder[models.DescribeBandwidthRateLimitInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DescribeBandwidthRateLimitInput.apply _)
  }
  final implicit val DeleteSnapshotScheduleInputDecoder: io.circe.Decoder[models.DeleteSnapshotScheduleInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(models.DeleteSnapshotScheduleInput.apply _)
  }
  final implicit val DescribeTapeRecoveryPointsInputDecoder: io.circe.Decoder[models.DescribeTapeRecoveryPointsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeTapeRecoveryPointsInput.apply _)
  }
  final implicit val ListTapesInputDecoder: io.circe.Decoder[models.ListTapesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListTapesInput.apply _)
  }
  final implicit val CreateTapeWithBarcodeInputDecoder: io.circe.Decoder[models.CreateTapeWithBarcodeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Long]("TapeSizeInBytes"), o.get[java.lang.String]("TapeBarcode")).mapN(models.CreateTapeWithBarcodeInput.apply _)
  }
  final implicit val CreateStorediSCSIVolumeOutputDecoder: io.circe.Decoder[models.CreateStorediSCSIVolumeOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[java.lang.String]]("TargetARN")).mapN(models.CreateStorediSCSIVolumeOutput.apply _)
  }
  final implicit val DisableGatewayOutputDecoder: io.circe.Decoder[models.DisableGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.DisableGatewayOutput.apply _)
  }
  final implicit val ResetCacheInputDecoder: io.circe.Decoder[models.ResetCacheInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.ResetCacheInput.apply _)
  }
  final implicit val CancelRetrievalOutputDecoder: io.circe.Decoder[models.CancelRetrievalOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.CancelRetrievalOutput.apply _)
  }
  final implicit val DescribeMaintenanceStartTimeInputDecoder: io.circe.Decoder[models.DescribeMaintenanceStartTimeInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DescribeMaintenanceStartTimeInput.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Key"), o.get[java.lang.String]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val CreateNFSFileShareInputDecoder: io.circe.Decoder[models.CreateNFSFileShareInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Role"), o.get[java.lang.String]("LocationARN"), o.get[java.lang.String]("ClientToken"), o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("ClientList"), o.get[scala.Option[models.NFSFileShareDefaults]]("NFSFileShareDefaults"), o.get[scala.Option[scala.Boolean]]("KMSEncrypted"), o.get[scala.Option[scala.Boolean]]("ReadOnly"), o.get[scala.Option[java.lang.String]]("DefaultStorageClass"), o.get[scala.Option[java.lang.String]]("KMSKey"), o.get[scala.Option[java.lang.String]]("Squash")).mapN(models.CreateNFSFileShareInput.apply _)
  }
  final implicit val ActivateGatewayOutputDecoder: io.circe.Decoder[models.ActivateGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.ActivateGatewayOutput.apply _)
  }
  final implicit val CreateSnapshotInputDecoder: io.circe.Decoder[models.CreateSnapshotInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeARN"), o.get[java.lang.String]("SnapshotDescription")).mapN(models.CreateSnapshotInput.apply _)
  }
  final implicit val DeleteBandwidthRateLimitOutputDecoder: io.circe.Decoder[models.DeleteBandwidthRateLimitOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.DeleteBandwidthRateLimitOutput.apply _)
  }
  final implicit val DisableGatewayInputDecoder: io.circe.Decoder[models.DisableGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DisableGatewayInput.apply _)
  }
  final implicit val DescribeGatewayInformationInputDecoder: io.circe.Decoder[models.DescribeGatewayInformationInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DescribeGatewayInformationInput.apply _)
  }
  final implicit val DescribeTapeArchivesOutputDecoder: io.circe.Decoder[models.DescribeTapeArchivesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.TapeArchive]]]("TapeArchives"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.DescribeTapeArchivesOutput.apply _)
  }
  final implicit val ChapInfoDecoder: io.circe.Decoder[models.ChapInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("SecretToAuthenticateInitiator"), o.get[scala.Option[java.lang.String]]("SecretToAuthenticateTarget"), o.get[scala.Option[java.lang.String]]("InitiatorName")).mapN(models.ChapInfo.apply _)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointOutputDecoder: io.circe.Decoder[models.CreateSnapshotFromVolumeRecoveryPointOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("VolumeRecoveryPointTime")).mapN(models.CreateSnapshotFromVolumeRecoveryPointOutput.apply _)
  }
  final implicit val DeleteGatewayOutputDecoder: io.circe.Decoder[models.DeleteGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.DeleteGatewayOutput.apply _)
  }
  final implicit val CreateTapesInputDecoder: io.circe.Decoder[models.CreateTapesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientToken"), o.get[java.lang.String]("TapeBarcodePrefix"), o.get[scala.Int]("NumTapesToCreate"), o.get[scala.Long]("TapeSizeInBytes"), o.get[java.lang.String]("GatewayARN")).mapN(models.CreateTapesInput.apply _)
  }
  final implicit val ListFileSharesOutputDecoder: io.circe.Decoder[models.ListFileSharesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.List[models.FileShareInfo]]]("FileShareInfoList")).mapN(models.ListFileSharesOutput.apply _)
  }
  final implicit val StorediSCSIVolumeDecoder: io.circe.Decoder[models.StorediSCSIVolume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceSnapshotId"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[scala.Boolean]]("PreservedExistingData"), o.get[scala.Option[scala.Double]]("VolumeProgress"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[models.VolumeiSCSIAttributes]]("VolumeiSCSIAttributes"), o.get[scala.Option[java.lang.String]]("VolumeDiskId"), o.get[scala.Option[java.lang.String]]("VolumeStatus"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[java.lang.String]]("VolumeARN")).mapN(models.StorediSCSIVolume.apply _)
  }
  final implicit val VolumeRecoveryPointInfoDecoder: io.circe.Decoder[models.VolumeRecoveryPointInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[scala.Long]]("VolumeUsageInBytes"), o.get[scala.Option[java.lang.String]]("VolumeRecoveryPointTime")).mapN(models.VolumeRecoveryPointInfo.apply _)
  }
  final implicit val UpdateSnapshotScheduleInputDecoder: io.circe.Decoder[models.UpdateSnapshotScheduleInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeARN"), o.get[scala.Int]("StartAt"), o.get[scala.Int]("RecurrenceInHours"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.UpdateSnapshotScheduleInput.apply _)
  }
  final implicit val DescribeGatewayInformationOutputDecoder: io.circe.Decoder[models.DescribeGatewayInformationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayId"), o.get[scala.Option[java.lang.String]]("NextUpdateAvailabilityDate"), o.get[scala.Option[java.lang.String]]("GatewayType"), o.get[scala.Option[java.lang.String]]("GatewayName"), o.get[scala.Option[java.lang.String]]("GatewayTimezone"), o.get[scala.Option[java.lang.String]]("GatewayState"), o.get[scala.Option[scala.List[models.NetworkInterface]]]("GatewayNetworkInterfaces"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("LastSoftwareUpdate")).mapN(models.DescribeGatewayInformationOutput.apply _)
  }
  final implicit val AddTagsToResourceInputDecoder: io.circe.Decoder[models.AddTagsToResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.AddTagsToResourceInput.apply _)
  }
  final implicit val RetrieveTapeRecoveryPointInputDecoder: io.circe.Decoder[models.RetrieveTapeRecoveryPointInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TapeARN"), o.get[java.lang.String]("GatewayARN")).mapN(models.RetrieveTapeRecoveryPointInput.apply _)
  }
  final implicit val DescribeMaintenanceStartTimeOutputDecoder: io.circe.Decoder[models.DescribeMaintenanceStartTimeOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MinuteOfHour"), o.get[scala.Option[java.lang.String]]("Timezone"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.Int]]("HourOfDay"), o.get[scala.Option[scala.Int]]("DayOfWeek")).mapN(models.DescribeMaintenanceStartTimeOutput.apply _)
  }
  final implicit val RefreshCacheOutputDecoder: io.circe.Decoder[models.RefreshCacheOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(models.RefreshCacheOutput.apply _)
  }
  final implicit val DescribeTapesOutputDecoder: io.circe.Decoder[models.DescribeTapesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Tape]]]("Tapes"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.DescribeTapesOutput.apply _)
  }
  final implicit val DeleteChapCredentialsInputDecoder: io.circe.Decoder[models.DeleteChapCredentialsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetARN"), o.get[java.lang.String]("InitiatorName")).mapN(models.DeleteChapCredentialsInput.apply _)
  }
  final implicit val DescribeStorediSCSIVolumesOutputDecoder: io.circe.Decoder[models.DescribeStorediSCSIVolumesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.StorediSCSIVolume]]]("StorediSCSIVolumes").map(models.DescribeStorediSCSIVolumesOutput.apply _)
  }
  final implicit val UpdateVTLDeviceTypeInputDecoder: io.circe.Decoder[models.UpdateVTLDeviceTypeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VTLDeviceARN"), o.get[java.lang.String]("DeviceType")).mapN(models.UpdateVTLDeviceTypeInput.apply _)
  }
  final implicit val DeleteTapeArchiveInputDecoder: io.circe.Decoder[models.DeleteTapeArchiveInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TapeARN").map(models.DeleteTapeArchiveInput.apply _)
  }
  final implicit val DeleteSnapshotScheduleOutputDecoder: io.circe.Decoder[models.DeleteSnapshotScheduleOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeARN").map(models.DeleteSnapshotScheduleOutput.apply _)
  }
  final implicit val DeleteFileShareOutputDecoder: io.circe.Decoder[models.DeleteFileShareOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(models.DeleteFileShareOutput.apply _)
  }
  final implicit val NetworkInterfaceDecoder: io.circe.Decoder[models.NetworkInterface] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Ipv4Address"), o.get[scala.Option[java.lang.String]]("MacAddress"), o.get[scala.Option[java.lang.String]]("Ipv6Address")).mapN(models.NetworkInterface.apply _)
  }
  final implicit val UpdateGatewaySoftwareNowInputDecoder: io.circe.Decoder[models.UpdateGatewaySoftwareNowInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.UpdateGatewaySoftwareNowInput.apply _)
  }
  final implicit val UpdateChapCredentialsOutputDecoder: io.circe.Decoder[models.UpdateChapCredentialsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("InitiatorName")).mapN(models.UpdateChapCredentialsOutput.apply _)
  }
  final implicit val CancelArchivalInputDecoder: io.circe.Decoder[models.CancelArchivalInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TapeARN")).mapN(models.CancelArchivalInput.apply _)
  }
  final implicit val NFSFileShareInfoDecoder: io.circe.Decoder[models.NFSFileShareInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("ClientList"), o.get[scala.Option[models.NFSFileShareDefaults]]("NFSFileShareDefaults"), o.get[scala.Option[java.lang.String]]("FileShareStatus"), o.get[scala.Option[java.lang.String]]("Role"), o.get[scala.Option[scala.Boolean]]("ReadOnly"), o.get[scala.Option[java.lang.String]]("LocationARN"), o.get[scala.Option[scala.Boolean]]("KMSEncrypted"), o.get[scala.Option[java.lang.String]]("DefaultStorageClass"), o.get[scala.Option[java.lang.String]]("FileShareARN"), o.get[scala.Option[java.lang.String]]("KMSKey"), o.get[scala.Option[java.lang.String]]("Path"), o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Squash"), o.get[scala.Option[java.lang.String]]("FileShareId")).mapN(models.NFSFileShareInfo.apply _)
  }
  final implicit val UpdateBandwidthRateLimitOutputDecoder: io.circe.Decoder[models.UpdateBandwidthRateLimitOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.UpdateBandwidthRateLimitOutput.apply _)
  }
  final implicit val ListTapesOutputDecoder: io.circe.Decoder[models.ListTapesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.TapeInfo]]]("TapeInfos"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListTapesOutput.apply _)
  }
  final implicit val ActivateGatewayInputDecoder: io.circe.Decoder[models.ActivateGatewayInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayRegion"), o.get[java.lang.String]("GatewayName"), o.get[java.lang.String]("GatewayTimezone"), o.get[java.lang.String]("ActivationKey"), o.get[scala.Option[java.lang.String]]("GatewayType"), o.get[scala.Option[java.lang.String]]("MediumChangerType"), o.get[scala.Option[java.lang.String]]("TapeDriveType")).mapN(models.ActivateGatewayInput.apply _)
  }
  final implicit val StorageGatewayErrorDecoder: io.circe.Decoder[models.StorageGatewayError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("errorCode"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("errorDetails")).mapN(models.StorageGatewayError.apply _)
  }
  final implicit val SetLocalConsolePasswordOutputDecoder: io.circe.Decoder[models.SetLocalConsolePasswordOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.SetLocalConsolePasswordOutput.apply _)
  }
  final implicit val UpdateChapCredentialsInputDecoder: io.circe.Decoder[models.UpdateChapCredentialsInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetARN"), o.get[java.lang.String]("SecretToAuthenticateInitiator"), o.get[java.lang.String]("InitiatorName"), o.get[scala.Option[java.lang.String]]("SecretToAuthenticateTarget")).mapN(models.UpdateChapCredentialsInput.apply _)
  }
  final implicit val DeleteChapCredentialsOutputDecoder: io.circe.Decoder[models.DeleteChapCredentialsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[java.lang.String]]("InitiatorName")).mapN(models.DeleteChapCredentialsOutput.apply _)
  }
  final implicit val DescribeChapCredentialsInputDecoder: io.circe.Decoder[models.DescribeChapCredentialsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("TargetARN").map(models.DescribeChapCredentialsInput.apply _)
  }
  final implicit val DescribeWorkingStorageOutputDecoder: io.circe.Decoder[models.DescribeWorkingStorageOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("DiskIds"), o.get[scala.Option[scala.Long]]("WorkingStorageUsedInBytes"), o.get[scala.Option[scala.Long]]("WorkingStorageAllocatedInBytes")).mapN(models.DescribeWorkingStorageOutput.apply _)
  }
  final implicit val RetrieveTapeArchiveOutputDecoder: io.circe.Decoder[models.RetrieveTapeArchiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.RetrieveTapeArchiveOutput.apply _)
  }
  final implicit val DeleteBandwidthRateLimitInputDecoder: io.circe.Decoder[models.DeleteBandwidthRateLimitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("BandwidthType")).mapN(models.DeleteBandwidthRateLimitInput.apply _)
  }
  final implicit val CreateNFSFileShareOutputDecoder: io.circe.Decoder[models.CreateNFSFileShareOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(models.CreateNFSFileShareOutput.apply _)
  }
  final implicit val UpdateMaintenanceStartTimeInputDecoder: io.circe.Decoder[models.UpdateMaintenanceStartTimeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Int]("HourOfDay"), o.get[scala.Int]("MinuteOfHour"), o.get[scala.Int]("DayOfWeek")).mapN(models.UpdateMaintenanceStartTimeInput.apply _)
  }
  final implicit val UpdateGatewayInformationOutputDecoder: io.circe.Decoder[models.UpdateGatewayInformationOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("GatewayName")).mapN(models.UpdateGatewayInformationOutput.apply _)
  }
  final implicit val UpdateGatewayInformationInputDecoder: io.circe.Decoder[models.UpdateGatewayInformationInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[java.lang.String]]("GatewayName"), o.get[scala.Option[java.lang.String]]("GatewayTimezone")).mapN(models.UpdateGatewayInformationInput.apply _)
  }
  final implicit val TapeRecoveryPointInfoDecoder: io.circe.Decoder[models.TapeRecoveryPointInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.time.Instant]]("TapeRecoveryPointTime"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("TapeStatus")).mapN(models.TapeRecoveryPointInfo.apply _)
  }
  final implicit val ServiceUnavailableErrorDecoder: io.circe.Decoder[models.ServiceUnavailableError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[models.StorageGatewayError]]("error")).mapN(models.ServiceUnavailableError.apply _)
  }
  final implicit val FileShareInfoDecoder: io.circe.Decoder[models.FileShareInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("FileShareARN"), o.get[scala.Option[java.lang.String]]("FileShareId"), o.get[scala.Option[java.lang.String]]("FileShareStatus"), o.get[scala.Option[java.lang.String]]("GatewayARN")).mapN(models.FileShareInfo.apply _)
  }
  final implicit val AddUploadBufferOutputDecoder: io.circe.Decoder[models.AddUploadBufferOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.AddUploadBufferOutput.apply _)
  }
  final implicit val CreateStorediSCSIVolumeInputDecoder: io.circe.Decoder[models.CreateStorediSCSIVolumeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("NetworkInterfaceId"), o.get[scala.Boolean]("PreserveExistingData"), o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("DiskId"), o.get[java.lang.String]("TargetName"), o.get[scala.Option[java.lang.String]]("SnapshotId")).mapN(models.CreateStorediSCSIVolumeInput.apply _)
  }
  final implicit val DescribeTapeArchivesInputDecoder: io.circe.Decoder[models.DescribeTapeArchivesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeTapeArchivesInput.apply _)
  }
  final implicit val UpdateMaintenanceStartTimeOutputDecoder: io.circe.Decoder[models.UpdateMaintenanceStartTimeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.UpdateMaintenanceStartTimeOutput.apply _)
  }
  final implicit val DescribeSnapshotScheduleInputDecoder: io.circe.Decoder[models.DescribeSnapshotScheduleInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(models.DescribeSnapshotScheduleInput.apply _)
  }
  final implicit val AddCacheOutputDecoder: io.circe.Decoder[models.AddCacheOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.AddCacheOutput.apply _)
  }
  final implicit val ListLocalDisksInputDecoder: io.circe.Decoder[models.ListLocalDisksInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.ListLocalDisksInput.apply _)
  }
  final implicit val DescribeWorkingStorageInputDecoder: io.circe.Decoder[models.DescribeWorkingStorageInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DescribeWorkingStorageInput.apply _)
  }
  final implicit val DeleteTapeInputDecoder: io.circe.Decoder[models.DeleteTapeInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TapeARN")).mapN(models.DeleteTapeInput.apply _)
  }
  final implicit val CancelArchivalOutputDecoder: io.circe.Decoder[models.CancelArchivalOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.CancelArchivalOutput.apply _)
  }
  final implicit val DescribeUploadBufferOutputDecoder: io.circe.Decoder[models.DescribeUploadBufferOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("DiskIds"), o.get[scala.Option[scala.Long]]("UploadBufferUsedInBytes"), o.get[scala.Option[scala.Long]]("UploadBufferAllocatedInBytes")).mapN(models.DescribeUploadBufferOutput.apply _)
  }
  final implicit val DescribeCacheOutputDecoder: io.circe.Decoder[models.DescribeCacheOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("DiskIds"), o.get[scala.Option[scala.Long]]("CacheAllocatedInBytes"), o.get[scala.Option[scala.Double]]("CacheUsedPercentage"), o.get[scala.Option[scala.Double]]("CacheDirtyPercentage"), o.get[scala.Option[scala.Double]]("CacheHitPercentage"), o.get[scala.Option[scala.Double]]("CacheMissPercentage")).mapN(models.DescribeCacheOutput.apply _)
  }
  final implicit val TapeArchiveDecoder: io.circe.Decoder[models.TapeArchive] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TapeStatus"), o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.lang.String]]("TapeBarcode"), o.get[scala.Option[scala.Long]]("TapeUsedInBytes"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("RetrievedTo"), o.get[scala.Option[java.time.Instant]]("TapeCreatedDate"), o.get[scala.Option[java.time.Instant]]("CompletionTime")).mapN(models.TapeArchive.apply _)
  }
  final implicit val TapeDecoder: io.circe.Decoder[models.Tape] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("Progress"), o.get[scala.Option[java.lang.String]]("TapeARN"), o.get[scala.Option[java.lang.String]]("TapeStatus"), o.get[scala.Option[java.lang.String]]("TapeBarcode"), o.get[scala.Option[scala.Long]]("TapeUsedInBytes"), o.get[scala.Option[scala.Long]]("TapeSizeInBytes"), o.get[scala.Option[java.lang.String]]("VTLDevice"), o.get[scala.Option[java.time.Instant]]("TapeCreatedDate")).mapN(models.Tape.apply _)
  }
  final implicit val StartGatewayOutputDecoder: io.circe.Decoder[models.StartGatewayOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.StartGatewayOutput.apply _)
  }
  final implicit val VolumeiSCSIAttributesDecoder: io.circe.Decoder[models.VolumeiSCSIAttributes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NetworkInterfaceId"), o.get[scala.Option[java.lang.String]]("TargetARN"), o.get[scala.Option[scala.Boolean]]("ChapEnabled"), o.get[scala.Option[scala.Int]]("NetworkInterfacePort"), o.get[scala.Option[scala.Int]]("LunNumber")).mapN(models.VolumeiSCSIAttributes.apply _)
  }
  final implicit val ListLocalDisksOutputDecoder: io.circe.Decoder[models.ListLocalDisksOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[models.Disk]]]("Disks")).mapN(models.ListLocalDisksOutput.apply _)
  }
  final implicit val DescribeTapeRecoveryPointsOutputDecoder: io.circe.Decoder[models.DescribeTapeRecoveryPointsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[models.TapeRecoveryPointInfo]]]("TapeRecoveryPointInfos"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.DescribeTapeRecoveryPointsOutput.apply _)
  }
  final implicit val DeleteTapeArchiveOutputDecoder: io.circe.Decoder[models.DeleteTapeArchiveOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.DeleteTapeArchiveOutput.apply _)
  }
  final implicit val DescribeNFSFileSharesOutputDecoder: io.circe.Decoder[models.DescribeNFSFileSharesOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.NFSFileShareInfo]]]("NFSFileShareInfoList").map(models.DescribeNFSFileSharesOutput.apply _)
  }
  final implicit val AddWorkingStorageInputDecoder: io.circe.Decoder[models.AddWorkingStorageInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.List[java.lang.String]]("DiskIds")).mapN(models.AddWorkingStorageInput.apply _)
  }
  final implicit val RefreshCacheInputDecoder: io.circe.Decoder[models.RefreshCacheInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("FileShareARN").map(models.RefreshCacheInput.apply _)
  }
  final implicit val UpdateVTLDeviceTypeOutputDecoder: io.circe.Decoder[models.UpdateVTLDeviceTypeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VTLDeviceARN").map(models.UpdateVTLDeviceTypeOutput.apply _)
  }
  final implicit val DescribeCacheInputDecoder: io.circe.Decoder[models.DescribeCacheInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DescribeCacheInput.apply _)
  }
  final implicit val DescribeSnapshotScheduleOutputDecoder: io.circe.Decoder[models.DescribeSnapshotScheduleOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("RecurrenceInHours"), o.get[scala.Option[java.lang.String]]("Timezone"), o.get[scala.Option[scala.Int]]("StartAt"), o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("Description")).mapN(models.DescribeSnapshotScheduleOutput.apply _)
  }
  final implicit val RetrieveTapeRecoveryPointOutputDecoder: io.circe.Decoder[models.RetrieveTapeRecoveryPointOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.RetrieveTapeRecoveryPointOutput.apply _)
  }
  final implicit val AddCacheInputDecoder: io.circe.Decoder[models.AddCacheInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.List[java.lang.String]]("DiskIds")).mapN(models.AddCacheInput.apply _)
  }
  final implicit val DiskDecoder: io.circe.Decoder[models.Disk] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DiskId"), o.get[scala.Option[java.lang.String]]("DiskPath"), o.get[scala.Option[java.lang.String]]("DiskNode"), o.get[scala.Option[java.lang.String]]("DiskStatus"), o.get[scala.Option[java.lang.String]]("DiskAllocationResource"), o.get[scala.Option[scala.Long]]("DiskSizeInBytes"), o.get[scala.Option[java.lang.String]]("DiskAllocationType")).mapN(models.Disk.apply _)
  }
  final implicit val VTLDeviceDecoder: io.circe.Decoder[models.VTLDevice] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VTLDeviceProductIdentifier"), o.get[scala.Option[java.lang.String]]("VTLDeviceVendor"), o.get[scala.Option[models.DeviceiSCSIAttributes]]("DeviceiSCSIAttributes"), o.get[scala.Option[java.lang.String]]("VTLDeviceType"), o.get[scala.Option[java.lang.String]]("VTLDeviceARN")).mapN(models.VTLDevice.apply _)
  }
  final implicit val CreateCachediSCSIVolumeInputDecoder: io.circe.Decoder[models.CreateCachediSCSIVolumeInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Long]("VolumeSizeInBytes"), o.get[java.lang.String]("NetworkInterfaceId"), o.get[java.lang.String]("ClientToken"), o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TargetName"), o.get[scala.Option[java.lang.String]]("SnapshotId"), o.get[scala.Option[java.lang.String]]("SourceVolumeARN")).mapN(models.CreateCachediSCSIVolumeInput.apply _)
  }
  final implicit val CreateSnapshotOutputDecoder: io.circe.Decoder[models.CreateSnapshotOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("SnapshotId")).mapN(models.CreateSnapshotOutput.apply _)
  }
  final implicit val DescribeNFSFileSharesInputDecoder: io.circe.Decoder[models.DescribeNFSFileSharesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("FileShareARNList").map(models.DescribeNFSFileSharesInput.apply _)
  }
  final implicit val RemoveTagsFromResourceInputDecoder: io.circe.Decoder[models.RemoveTagsFromResourceInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ResourceARN"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.RemoveTagsFromResourceInput.apply _)
  }
  final implicit val InternalServerErrorDecoder: io.circe.Decoder[models.InternalServerError] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[models.StorageGatewayError]]("error")).mapN(models.InternalServerError.apply _)
  }
  final implicit val InvalidGatewayRequestExceptionDecoder: io.circe.Decoder[models.InvalidGatewayRequestException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[models.StorageGatewayError]]("error")).mapN(models.InvalidGatewayRequestException.apply _)
  }
  final implicit val DescribeVTLDevicesOutputDecoder: io.circe.Decoder[models.DescribeVTLDevicesOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[models.VTLDevice]]]("VTLDevices"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.DescribeVTLDevicesOutput.apply _)
  }
  final implicit val DescribeUploadBufferInputDecoder: io.circe.Decoder[models.DescribeUploadBufferInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DescribeUploadBufferInput.apply _)
  }
  final implicit val DescribeTapesInputDecoder: io.circe.Decoder[models.DescribeTapesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("TapeARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeTapesInput.apply _)
  }
  final implicit val ListVolumeRecoveryPointsOutputDecoder: io.circe.Decoder[models.ListVolumeRecoveryPointsOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.List[models.VolumeRecoveryPointInfo]]]("VolumeRecoveryPointInfos")).mapN(models.ListVolumeRecoveryPointsOutput.apply _)
  }
  final implicit val CreateSnapshotFromVolumeRecoveryPointInputDecoder: io.circe.Decoder[models.CreateSnapshotFromVolumeRecoveryPointInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("VolumeARN"), o.get[java.lang.String]("SnapshotDescription")).mapN(models.CreateSnapshotFromVolumeRecoveryPointInput.apply _)
  }
  final implicit val CancelRetrievalInputDecoder: io.circe.Decoder[models.CancelRetrievalInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[java.lang.String]("TapeARN")).mapN(models.CancelRetrievalInput.apply _)
  }
  final implicit val DescribeVTLDevicesInputDecoder: io.circe.Decoder[models.DescribeVTLDevicesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.List[java.lang.String]]]("VTLDeviceARNs"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.DescribeVTLDevicesInput.apply _)
  }
  final implicit val ListTagsForResourceOutputDecoder: io.circe.Decoder[models.ListTagsForResourceOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ResourceARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.List[models.Tag]]]("Tags")).mapN(models.ListTagsForResourceOutput.apply _)
  }
  final implicit val UpdateGatewaySoftwareNowOutputDecoder: io.circe.Decoder[models.UpdateGatewaySoftwareNowOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.UpdateGatewaySoftwareNowOutput.apply _)
  }
  final implicit val UpdateNFSFileShareOutputDecoder: io.circe.Decoder[models.UpdateNFSFileShareOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FileShareARN").map(models.UpdateNFSFileShareOutput.apply _)
  }
  final implicit val ListVolumeRecoveryPointsInputDecoder: io.circe.Decoder[models.ListVolumeRecoveryPointsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.ListVolumeRecoveryPointsInput.apply _)
  }
  final implicit val AddUploadBufferInputDecoder: io.circe.Decoder[models.AddUploadBufferInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.List[java.lang.String]]("DiskIds")).mapN(models.AddUploadBufferInput.apply _)
  }
  final implicit val DeleteTapeOutputDecoder: io.circe.Decoder[models.DeleteTapeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.DeleteTapeOutput.apply _)
  }
  final implicit val CreateCachediSCSIVolumeOutputDecoder: io.circe.Decoder[models.CreateCachediSCSIVolumeOutput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("VolumeARN"), o.get[scala.Option[java.lang.String]]("TargetARN")).mapN(models.CreateCachediSCSIVolumeOutput.apply _)
  }
  final implicit val ResetCacheOutputDecoder: io.circe.Decoder[models.ResetCacheOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("GatewayARN").map(models.ResetCacheOutput.apply _)
  }
  final implicit val ListFileSharesInputDecoder: io.circe.Decoder[models.ListFileSharesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListFileSharesInput.apply _)
  }
  final implicit val DeleteVolumeOutputDecoder: io.circe.Decoder[models.DeleteVolumeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("VolumeARN").map(models.DeleteVolumeOutput.apply _)
  }
  final implicit val UpdateBandwidthRateLimitInputDecoder: io.circe.Decoder[models.UpdateBandwidthRateLimitInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GatewayARN"), o.get[scala.Option[scala.Long]]("AverageUploadRateLimitInBitsPerSec"), o.get[scala.Option[scala.Long]]("AverageDownloadRateLimitInBitsPerSec")).mapN(models.UpdateBandwidthRateLimitInput.apply _)
  }
  final implicit val DeleteGatewayInputDecoder: io.circe.Decoder[models.DeleteGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.DeleteGatewayInput.apply _)
  }
  final implicit val GatewayInfoDecoder: io.circe.Decoder[models.GatewayInfo] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayId"), o.get[scala.Option[java.lang.String]]("GatewayOperationalState"), o.get[scala.Option[java.lang.String]]("GatewayType"), o.get[scala.Option[java.lang.String]]("GatewayName"), o.get[scala.Option[java.lang.String]]("GatewayARN")).mapN(models.GatewayInfo.apply _)
  }
  final implicit val RemoveTagsFromResourceOutputDecoder: io.circe.Decoder[models.RemoveTagsFromResourceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResourceARN").map(models.RemoveTagsFromResourceOutput.apply _)
  }
  final implicit val CachediSCSIVolumeDecoder: io.circe.Decoder[models.CachediSCSIVolume] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceSnapshotId"), o.get[scala.Option[java.time.Instant]]("CreatedDate"), o.get[scala.Option[scala.Long]]("VolumeSizeInBytes"), o.get[scala.Option[scala.Double]]("VolumeProgress"), o.get[scala.Option[java.lang.String]]("VolumeType"), o.get[scala.Option[models.VolumeiSCSIAttributes]]("VolumeiSCSIAttributes"), o.get[scala.Option[java.lang.String]]("VolumeStatus"), o.get[scala.Option[java.lang.String]]("VolumeId"), o.get[scala.Option[java.lang.String]]("VolumeARN")).mapN(models.CachediSCSIVolume.apply _)
  }
  final implicit val ListVolumeInitiatorsInputDecoder: io.circe.Decoder[models.ListVolumeInitiatorsInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(models.ListVolumeInitiatorsInput.apply _)
  }
  final implicit val AddTagsToResourceOutputDecoder: io.circe.Decoder[models.AddTagsToResourceOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("ResourceARN").map(models.AddTagsToResourceOutput.apply _)
  }
  final implicit val DeleteVolumeInputDecoder: io.circe.Decoder[models.DeleteVolumeInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("VolumeARN").map(models.DeleteVolumeInput.apply _)
  }
  final implicit val StartGatewayInputDecoder: io.circe.Decoder[models.StartGatewayInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("GatewayARN").map(models.StartGatewayInput.apply _)
  }
  final implicit val ListVolumesInputDecoder: io.circe.Decoder[models.ListVolumesInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GatewayARN"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("Limit")).mapN(models.ListVolumesInput.apply _)
  }
  final implicit val CreateTapeWithBarcodeOutputDecoder: io.circe.Decoder[models.CreateTapeWithBarcodeOutput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("TapeARN").map(models.CreateTapeWithBarcodeOutput.apply _)
  }
}