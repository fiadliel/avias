package avias.devicefarm
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val ListSamplesRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListSamplesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateRemoteAccessSessionRequestEncoder: io.circe.Encoder[avias.devicefarm.models.CreateRemoteAccessSessionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectArn" -> o.projectArn.asJson, "deviceArn" -> o.deviceArn.asJson, "name" -> o.name.asJson, "configuration" -> o.configuration.asJson, "clientId" -> o.clientId.asJson, "remoteDebugEnabled" -> o.remoteDebugEnabled.asJson, "sshPublicKey" -> o.sshPublicKey.asJson)
  }
  final implicit val DeleteUploadResultEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteUploadResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDeviceResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetDeviceResult] = io.circe.Encoder.instance { o => 
    Json.obj("device" -> o.device.asJson)
  }
  final implicit val OfferingEncoder: io.circe.Encoder[avias.devicefarm.models.Offering] = io.circe.Encoder.instance { o => 
    Json.obj("recurringCharges" -> o.recurringCharges.asJson, "id" -> o.id.asJson, "platform" -> o.platform.asJson, "description" -> o.description.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val CreateUploadRequestEncoder: io.circe.Encoder[avias.devicefarm.models.CreateUploadRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectArn" -> o.projectArn.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "contentType" -> o.contentType.asJson)
  }
  final implicit val StopRunResultEncoder: io.circe.Encoder[avias.devicefarm.models.StopRunResult] = io.circe.Encoder.instance { o => 
    Json.obj("run" -> o.run.asJson)
  }
  final implicit val UploadEncoder: io.circe.Encoder[avias.devicefarm.models.Upload] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "type" -> o.`type`.asJson, "name" -> o.name.asJson, "status" -> o.status.asJson, "message" -> o.message.asJson, "created" -> o.created.asJson, "contentType" -> o.contentType.asJson, "url" -> o.url.asJson, "metadata" -> o.metadata.asJson)
  }
  final implicit val RecurringChargeEncoder: io.circe.Encoder[avias.devicefarm.models.RecurringCharge] = io.circe.Encoder.instance { o => 
    Json.obj("cost" -> o.cost.asJson, "frequency" -> o.frequency.asJson)
  }
  final implicit val ListArtifactsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListArtifactsResult] = io.circe.Encoder.instance { o => 
    Json.obj("artifacts" -> o.artifacts.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListJobsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListJobsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetSuiteResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetSuiteResult] = io.circe.Encoder.instance { o => 
    Json.obj("suite" -> o.suite.asJson)
  }
  final implicit val GetProjectResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val SuiteEncoder: io.circe.Encoder[avias.devicefarm.models.Suite] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "deviceMinutes" -> o.deviceMinutes.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "result" -> o.result.asJson, "message" -> o.message.asJson, "status" -> o.status.asJson, "counters" -> o.counters.asJson, "created" -> o.created.asJson, "started" -> o.started.asJson, "stopped" -> o.stopped.asJson)
  }
  final implicit val GetDevicePoolCompatibilityResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetDevicePoolCompatibilityResult] = io.circe.Encoder.instance { o => 
    Json.obj("compatibleDevices" -> o.compatibleDevices.asJson, "incompatibleDevices" -> o.incompatibleDevices.asJson)
  }
  final implicit val CustomerArtifactPathsEncoder: io.circe.Encoder[avias.devicefarm.models.CustomerArtifactPaths] = io.circe.Encoder.instance { o => 
    Json.obj("iosPaths" -> o.iosPaths.asJson, "androidPaths" -> o.androidPaths.asJson, "deviceHostPaths" -> o.deviceHostPaths.asJson)
  }
  final implicit val ScheduleRunTestEncoder: io.circe.Encoder[avias.devicefarm.models.ScheduleRunTest] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "testPackageArn" -> o.testPackageArn.asJson, "filter" -> o.filter.asJson, "parameters" -> o.parameters.asJson)
  }
  final implicit val ListOfferingTransactionsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListOfferingTransactionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListSamplesResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListSamplesResult] = io.circe.Encoder.instance { o => 
    Json.obj("samples" -> o.samples.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.devicefarm.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeviceMinutesEncoder: io.circe.Encoder[avias.devicefarm.models.DeviceMinutes] = io.circe.Encoder.instance { o => 
    Json.obj("total" -> o.total.asJson, "metered" -> o.metered.asJson, "unmetered" -> o.unmetered.asJson)
  }
  final implicit val RadiosEncoder: io.circe.Encoder[avias.devicefarm.models.Radios] = io.circe.Encoder.instance { o => 
    Json.obj("wifi" -> o.wifi.asJson, "bluetooth" -> o.bluetooth.asJson, "nfc" -> o.nfc.asJson, "gps" -> o.gps.asJson)
  }
  final implicit val UpdateDevicePoolResultEncoder: io.circe.Encoder[avias.devicefarm.models.UpdateDevicePoolResult] = io.circe.Encoder.instance { o => 
    Json.obj("devicePool" -> o.devicePool.asJson)
  }
  final implicit val GetDeviceRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val InstallToRemoteAccessSessionResultEncoder: io.circe.Encoder[avias.devicefarm.models.InstallToRemoteAccessSessionResult] = io.circe.Encoder.instance { o => 
    Json.obj("appUpload" -> o.appUpload.asJson)
  }
  final implicit val ListRunsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListRunsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DevicePoolCompatibilityResultEncoder: io.circe.Encoder[avias.devicefarm.models.DevicePoolCompatibilityResult] = io.circe.Encoder.instance { o => 
    Json.obj("device" -> o.device.asJson, "compatible" -> o.compatible.asJson, "incompatibilityMessages" -> o.incompatibilityMessages.asJson)
  }
  final implicit val RuleEncoder: io.circe.Encoder[avias.devicefarm.models.Rule] = io.circe.Encoder.instance { o => 
    Json.obj("attribute" -> o.attribute.asJson, "operator" -> o.operator.asJson, "value" -> o.value.asJson)
  }
  final implicit val DeviceEncoder: io.circe.Encoder[avias.devicefarm.models.Device] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "heapSize" -> o.heapSize.asJson, "memory" -> o.memory.asJson, "os" -> o.os.asJson, "radio" -> o.radio.asJson, "manufacturer" -> o.manufacturer.asJson, "model" -> o.model.asJson, "image" -> o.image.asJson, "carrier" -> o.carrier.asJson, "fleetType" -> o.fleetType.asJson, "fleetName" -> o.fleetName.asJson, "name" -> o.name.asJson, "platform" -> o.platform.asJson, "resolution" -> o.resolution.asJson, "cpu" -> o.cpu.asJson, "remoteAccessEnabled" -> o.remoteAccessEnabled.asJson, "remoteDebugEnabled" -> o.remoteDebugEnabled.asJson, "formFactor" -> o.formFactor.asJson)
  }
  final implicit val ListUploadsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListUploadsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetNetworkProfileResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetNetworkProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("networkProfile" -> o.networkProfile.asJson)
  }
  final implicit val UpdateNetworkProfileRequestEncoder: io.circe.Encoder[avias.devicefarm.models.UpdateNetworkProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "uplinkLossPercent" -> o.uplinkLossPercent.asJson, "downlinkLossPercent" -> o.downlinkLossPercent.asJson, "type" -> o.`type`.asJson, "uplinkDelayMs" -> o.uplinkDelayMs.asJson, "downlinkJitterMs" -> o.downlinkJitterMs.asJson, "downlinkDelayMs" -> o.downlinkDelayMs.asJson, "uplinkJitterMs" -> o.uplinkJitterMs.asJson, "downlinkBandwidthBits" -> o.downlinkBandwidthBits.asJson, "uplinkBandwidthBits" -> o.uplinkBandwidthBits.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val GetRunResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetRunResult] = io.circe.Encoder.instance { o => 
    Json.obj("run" -> o.run.asJson)
  }
  final implicit val LocationEncoder: io.circe.Encoder[avias.devicefarm.models.Location] = io.circe.Encoder.instance { o => 
    Json.obj("latitude" -> o.latitude.asJson, "longitude" -> o.longitude.asJson)
  }
  final implicit val DeleteUploadRequestEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteUploadRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ListTestsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListTestsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val AccountSettingsEncoder: io.circe.Encoder[avias.devicefarm.models.AccountSettings] = io.circe.Encoder.instance { o => 
    Json.obj("unmeteredDevices" -> o.unmeteredDevices.asJson, "unmeteredRemoteAccessDevices" -> o.unmeteredRemoteAccessDevices.asJson, "maxSlots" -> o.maxSlots.asJson, "trialMinutes" -> o.trialMinutes.asJson, "awsAccountNumber" -> o.awsAccountNumber.asJson, "maxJobTimeoutMinutes" -> o.maxJobTimeoutMinutes.asJson, "defaultJobTimeoutMinutes" -> o.defaultJobTimeoutMinutes.asJson)
  }
  final implicit val CreateRemoteAccessSessionConfigurationEncoder: io.circe.Encoder[avias.devicefarm.models.CreateRemoteAccessSessionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("billingMethod" -> o.billingMethod.asJson)
  }
  final implicit val ListNetworkProfilesRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListNetworkProfilesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "type" -> o.`type`.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListOfferingsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListOfferingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val OfferingStatusEncoder: io.circe.Encoder[avias.devicefarm.models.OfferingStatus] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "offering" -> o.offering.asJson, "quantity" -> o.quantity.asJson, "effectiveOn" -> o.effectiveOn.asJson)
  }
  final implicit val ProblemEncoder: io.circe.Encoder[avias.devicefarm.models.Problem] = io.circe.Encoder.instance { o => 
    Json.obj("run" -> o.run.asJson, "job" -> o.job.asJson, "suite" -> o.suite.asJson, "test" -> o.test.asJson, "device" -> o.device.asJson, "result" -> o.result.asJson, "message" -> o.message.asJson)
  }
  final implicit val GetProjectRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val GetRunRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val GetRemoteAccessSessionRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetRemoteAccessSessionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val CreateNetworkProfileRequestEncoder: io.circe.Encoder[avias.devicefarm.models.CreateNetworkProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectArn" -> o.projectArn.asJson, "name" -> o.name.asJson, "uplinkLossPercent" -> o.uplinkLossPercent.asJson, "downlinkLossPercent" -> o.downlinkLossPercent.asJson, "type" -> o.`type`.asJson, "uplinkDelayMs" -> o.uplinkDelayMs.asJson, "downlinkJitterMs" -> o.downlinkJitterMs.asJson, "downlinkDelayMs" -> o.downlinkDelayMs.asJson, "uplinkJitterMs" -> o.uplinkJitterMs.asJson, "downlinkBandwidthBits" -> o.downlinkBandwidthBits.asJson, "uplinkBandwidthBits" -> o.uplinkBandwidthBits.asJson, "description" -> o.description.asJson)
  }
  final implicit val DeleteRunRequestEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ListProjectsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListProjectsResult] = io.circe.Encoder.instance { o => 
    Json.obj("projects" -> o.projects.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateNetworkProfileResultEncoder: io.circe.Encoder[avias.devicefarm.models.CreateNetworkProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("networkProfile" -> o.networkProfile.asJson)
  }
  final implicit val UpdateNetworkProfileResultEncoder: io.circe.Encoder[avias.devicefarm.models.UpdateNetworkProfileResult] = io.circe.Encoder.instance { o => 
    Json.obj("networkProfile" -> o.networkProfile.asJson)
  }
  final implicit val DeleteNetworkProfileResultEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteNetworkProfileResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ArtifactEncoder: io.circe.Encoder[avias.devicefarm.models.Artifact] = io.circe.Encoder.instance { o => 
    Json.obj("type" -> o.`type`.asJson, "arn" -> o.arn.asJson, "extension" -> o.extension.asJson, "name" -> o.name.asJson, "url" -> o.url.asJson)
  }
  final implicit val OfferingTransactionEncoder: io.circe.Encoder[avias.devicefarm.models.OfferingTransaction] = io.circe.Encoder.instance { o => 
    Json.obj("transactionId" -> o.transactionId.asJson, "offeringStatus" -> o.offeringStatus.asJson, "createdOn" -> o.createdOn.asJson, "offeringPromotionId" -> o.offeringPromotionId.asJson, "cost" -> o.cost.asJson)
  }
  final implicit val ListRunsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListRunsResult] = io.circe.Encoder.instance { o => 
    Json.obj("runs" -> o.runs.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val IdempotencyExceptionEncoder: io.circe.Encoder[avias.devicefarm.models.IdempotencyException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetNetworkProfileRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetNetworkProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ProjectEncoder: io.circe.Encoder[avias.devicefarm.models.Project] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "name" -> o.name.asJson, "defaultJobTimeoutMinutes" -> o.defaultJobTimeoutMinutes.asJson, "created" -> o.created.asJson)
  }
  final implicit val ListJobsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListJobsResult] = io.circe.Encoder.instance { o => 
    Json.obj("jobs" -> o.jobs.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ScheduleRunRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ScheduleRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectArn" -> o.projectArn.asJson, "devicePoolArn" -> o.devicePoolArn.asJson, "test" -> o.test.asJson, "appArn" -> o.appArn.asJson, "name" -> o.name.asJson, "executionConfiguration" -> o.executionConfiguration.asJson, "configuration" -> o.configuration.asJson)
  }
  final implicit val DeleteDevicePoolResultEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteDevicePoolResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateUploadResultEncoder: io.circe.Encoder[avias.devicefarm.models.CreateUploadResult] = io.circe.Encoder.instance { o => 
    Json.obj("upload" -> o.upload.asJson)
  }
  final implicit val ListUniqueProblemsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListUniqueProblemsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val StopRemoteAccessSessionRequestEncoder: io.circe.Encoder[avias.devicefarm.models.StopRemoteAccessSessionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ListOfferingPromotionsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListOfferingPromotionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("offeringPromotions" -> o.offeringPromotions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteDevicePoolRequestEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteDevicePoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val CreateDevicePoolResultEncoder: io.circe.Encoder[avias.devicefarm.models.CreateDevicePoolResult] = io.circe.Encoder.instance { o => 
    Json.obj("devicePool" -> o.devicePool.asJson)
  }
  final implicit val ListOfferingsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListOfferingsResult] = io.circe.Encoder.instance { o => 
    Json.obj("offerings" -> o.offerings.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ScheduleRunResultEncoder: io.circe.Encoder[avias.devicefarm.models.ScheduleRunResult] = io.circe.Encoder.instance { o => 
    Json.obj("run" -> o.run.asJson)
  }
  final implicit val PurchaseOfferingRequestEncoder: io.circe.Encoder[avias.devicefarm.models.PurchaseOfferingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("offeringId" -> o.offeringId.asJson, "quantity" -> o.quantity.asJson, "offeringPromotionId" -> o.offeringPromotionId.asJson)
  }
  final implicit val GetAccountSettingsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetAccountSettingsRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetJobRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val DeleteRemoteAccessSessionRequestEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteRemoteAccessSessionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val GetAccountSettingsResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetAccountSettingsResult] = io.circe.Encoder.instance { o => 
    Json.obj("accountSettings" -> o.accountSettings.asJson)
  }
  final implicit val CountersEncoder: io.circe.Encoder[avias.devicefarm.models.Counters] = io.circe.Encoder.instance { o => 
    Json.obj("passed" -> o.passed.asJson, "total" -> o.total.asJson, "errored" -> o.errored.asJson, "skipped" -> o.skipped.asJson, "warned" -> o.warned.asJson, "failed" -> o.failed.asJson, "stopped" -> o.stopped.asJson)
  }
  final implicit val InstallToRemoteAccessSessionRequestEncoder: io.circe.Encoder[avias.devicefarm.models.InstallToRemoteAccessSessionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("remoteAccessSessionArn" -> o.remoteAccessSessionArn.asJson, "appArn" -> o.appArn.asJson)
  }
  final implicit val ArgumentExceptionEncoder: io.circe.Encoder[avias.devicefarm.models.ArgumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val NotEligibleExceptionEncoder: io.circe.Encoder[avias.devicefarm.models.NotEligibleException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListOfferingTransactionsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListOfferingTransactionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("offeringTransactions" -> o.offeringTransactions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListRemoteAccessSessionsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListRemoteAccessSessionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val JobEncoder: io.circe.Encoder[avias.devicefarm.models.Job] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "deviceMinutes" -> o.deviceMinutes.asJson, "device" -> o.device.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "result" -> o.result.asJson, "message" -> o.message.asJson, "status" -> o.status.asJson, "counters" -> o.counters.asJson, "created" -> o.created.asJson, "started" -> o.started.asJson, "stopped" -> o.stopped.asJson)
  }
  final implicit val DeleteRemoteAccessSessionResultEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteRemoteAccessSessionResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListDevicePoolsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListDevicePoolsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "type" -> o.`type`.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[avias.devicefarm.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RemoteAccessSessionEncoder: io.circe.Encoder[avias.devicefarm.models.RemoteAccessSession] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "hostAddress" -> o.hostAddress.asJson, "deviceMinutes" -> o.deviceMinutes.asJson, "endpoint" -> o.endpoint.asJson, "deviceUdid" -> o.deviceUdid.asJson, "device" -> o.device.asJson, "name" -> o.name.asJson, "result" -> o.result.asJson, "clientId" -> o.clientId.asJson, "message" -> o.message.asJson, "status" -> o.status.asJson, "created" -> o.created.asJson, "started" -> o.started.asJson, "stopped" -> o.stopped.asJson, "billingMethod" -> o.billingMethod.asJson, "remoteDebugEnabled" -> o.remoteDebugEnabled.asJson)
  }
  final implicit val SampleEncoder: io.circe.Encoder[avias.devicefarm.models.Sample] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "type" -> o.`type`.asJson, "url" -> o.url.asJson)
  }
  final implicit val GetOfferingStatusRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetOfferingStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val ServiceAccountExceptionEncoder: io.circe.Encoder[avias.devicefarm.models.ServiceAccountException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateProjectRequestEncoder: io.circe.Encoder[avias.devicefarm.models.CreateProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("name" -> o.name.asJson, "defaultJobTimeoutMinutes" -> o.defaultJobTimeoutMinutes.asJson)
  }
  final implicit val ResolutionEncoder: io.circe.Encoder[avias.devicefarm.models.Resolution] = io.circe.Encoder.instance { o => 
    Json.obj("width" -> o.width.asJson, "height" -> o.height.asJson)
  }
  final implicit val RenewOfferingRequestEncoder: io.circe.Encoder[avias.devicefarm.models.RenewOfferingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("offeringId" -> o.offeringId.asJson, "quantity" -> o.quantity.asJson)
  }
  final implicit val RunEncoder: io.circe.Encoder[avias.devicefarm.models.Run] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "customerArtifactPaths" -> o.customerArtifactPaths.asJson, "deviceMinutes" -> o.deviceMinutes.asJson, "parsingResultUrl" -> o.parsingResultUrl.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "platform" -> o.platform.asJson, "result" -> o.result.asJson, "message" -> o.message.asJson, "status" -> o.status.asJson, "counters" -> o.counters.asJson, "created" -> o.created.asJson, "started" -> o.started.asJson, "stopped" -> o.stopped.asJson, "billingMethod" -> o.billingMethod.asJson, "totalJobs" -> o.totalJobs.asJson, "completedJobs" -> o.completedJobs.asJson, "resultCode" -> o.resultCode.asJson, "networkProfile" -> o.networkProfile.asJson)
  }
  final implicit val CPUEncoder: io.circe.Encoder[avias.devicefarm.models.CPU] = io.circe.Encoder.instance { o => 
    Json.obj("frequency" -> o.frequency.asJson, "architecture" -> o.architecture.asJson, "clock" -> o.clock.asJson)
  }
  final implicit val ListTestsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListTestsResult] = io.circe.Encoder.instance { o => 
    Json.obj("tests" -> o.tests.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteProjectRequestEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val DevicePoolEncoder: io.circe.Encoder[avias.devicefarm.models.DevicePool] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "name" -> o.name.asJson, "rules" -> o.rules.asJson, "description" -> o.description.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val StopRemoteAccessSessionResultEncoder: io.circe.Encoder[avias.devicefarm.models.StopRemoteAccessSessionResult] = io.circe.Encoder.instance { o => 
    Json.obj("remoteAccessSession" -> o.remoteAccessSession.asJson)
  }
  final implicit val GetUploadResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetUploadResult] = io.circe.Encoder.instance { o => 
    Json.obj("upload" -> o.upload.asJson)
  }
  final implicit val ListSuitesResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListSuitesResult] = io.circe.Encoder.instance { o => 
    Json.obj("suites" -> o.suites.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetTestRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetTestRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val GetSuiteRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetSuiteRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ExecutionConfigurationEncoder: io.circe.Encoder[avias.devicefarm.models.ExecutionConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("jobTimeoutMinutes" -> o.jobTimeoutMinutes.asJson, "accountsCleanup" -> o.accountsCleanup.asJson, "appPackagesCleanup" -> o.appPackagesCleanup.asJson)
  }
  final implicit val RenewOfferingResultEncoder: io.circe.Encoder[avias.devicefarm.models.RenewOfferingResult] = io.circe.Encoder.instance { o => 
    Json.obj("offeringTransaction" -> o.offeringTransaction.asJson)
  }
  final implicit val CreateDevicePoolRequestEncoder: io.circe.Encoder[avias.devicefarm.models.CreateDevicePoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("projectArn" -> o.projectArn.asJson, "name" -> o.name.asJson, "rules" -> o.rules.asJson, "description" -> o.description.asJson)
  }
  final implicit val GetOfferingStatusResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetOfferingStatusResult] = io.circe.Encoder.instance { o => 
    Json.obj("current" -> o.current.asJson, "nextPeriod" -> o.nextPeriod.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListUploadsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListUploadsResult] = io.circe.Encoder.instance { o => 
    Json.obj("uploads" -> o.uploads.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListDevicesRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListDevicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ScheduleRunConfigurationEncoder: io.circe.Encoder[avias.devicefarm.models.ScheduleRunConfiguration] = io.circe.Encoder.instance { o => 
    Json.obj("extraDataPackageArn" -> o.extraDataPackageArn.asJson, "networkProfileArn" -> o.networkProfileArn.asJson, "customerArtifactPaths" -> o.customerArtifactPaths.asJson, "radios" -> o.radios.asJson, "locale" -> o.locale.asJson, "location" -> o.location.asJson, "billingMethod" -> o.billingMethod.asJson, "auxiliaryApps" -> o.auxiliaryApps.asJson)
  }
  final implicit val TrialMinutesEncoder: io.circe.Encoder[avias.devicefarm.models.TrialMinutes] = io.circe.Encoder.instance { o => 
    Json.obj("total" -> o.total.asJson, "remaining" -> o.remaining.asJson)
  }
  final implicit val ListDevicesResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListDevicesResult] = io.circe.Encoder.instance { o => 
    Json.obj("devices" -> o.devices.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateProjectRequestEncoder: io.circe.Encoder[avias.devicefarm.models.UpdateProjectRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "name" -> o.name.asJson, "defaultJobTimeoutMinutes" -> o.defaultJobTimeoutMinutes.asJson)
  }
  final implicit val DeleteProjectResultEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteProjectResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetRemoteAccessSessionResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetRemoteAccessSessionResult] = io.circe.Encoder.instance { o => 
    Json.obj("remoteAccessSession" -> o.remoteAccessSession.asJson)
  }
  final implicit val ListDevicePoolsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListDevicePoolsResult] = io.circe.Encoder.instance { o => 
    Json.obj("devicePools" -> o.devicePools.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetJobResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetJobResult] = io.circe.Encoder.instance { o => 
    Json.obj("job" -> o.job.asJson)
  }
  final implicit val ListRemoteAccessSessionsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListRemoteAccessSessionsResult] = io.circe.Encoder.instance { o => 
    Json.obj("remoteAccessSessions" -> o.remoteAccessSessions.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetUploadRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetUploadRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val PurchaseOfferingResultEncoder: io.circe.Encoder[avias.devicefarm.models.PurchaseOfferingResult] = io.circe.Encoder.instance { o => 
    Json.obj("offeringTransaction" -> o.offeringTransaction.asJson)
  }
  final implicit val ListArtifactsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListArtifactsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "type" -> o.`type`.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetDevicePoolCompatibilityRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetDevicePoolCompatibilityRequest] = io.circe.Encoder.instance { o => 
    Json.obj("devicePoolArn" -> o.devicePoolArn.asJson, "appArn" -> o.appArn.asJson, "testType" -> o.testType.asJson, "test" -> o.test.asJson)
  }
  final implicit val UpdateDevicePoolRequestEncoder: io.circe.Encoder[avias.devicefarm.models.UpdateDevicePoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson, "rules" -> o.rules.asJson)
  }
  final implicit val ListSuitesRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListSuitesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val MonetaryAmountEncoder: io.circe.Encoder[avias.devicefarm.models.MonetaryAmount] = io.circe.Encoder.instance { o => 
    Json.obj("amount" -> o.amount.asJson, "currencyCode" -> o.currencyCode.asJson)
  }
  final implicit val TestEncoder: io.circe.Encoder[avias.devicefarm.models.Test] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "deviceMinutes" -> o.deviceMinutes.asJson, "name" -> o.name.asJson, "type" -> o.`type`.asJson, "result" -> o.result.asJson, "message" -> o.message.asJson, "status" -> o.status.asJson, "counters" -> o.counters.asJson, "created" -> o.created.asJson, "started" -> o.started.asJson, "stopped" -> o.stopped.asJson)
  }
  final implicit val DeleteRunResultEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteRunResult.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListOfferingPromotionsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListOfferingPromotionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("nextToken" -> o.nextToken.asJson)
  }
  final implicit val ProblemDetailEncoder: io.circe.Encoder[avias.devicefarm.models.ProblemDetail] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "name" -> o.name.asJson)
  }
  final implicit val CreateRemoteAccessSessionResultEncoder: io.circe.Encoder[avias.devicefarm.models.CreateRemoteAccessSessionResult] = io.circe.Encoder.instance { o => 
    Json.obj("remoteAccessSession" -> o.remoteAccessSession.asJson)
  }
  final implicit val StopRunRequestEncoder: io.circe.Encoder[avias.devicefarm.models.StopRunRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ListUniqueProblemsResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListUniqueProblemsResult] = io.circe.Encoder.instance { o => 
    Json.obj("uniqueProblems" -> o.uniqueProblems.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val ListNetworkProfilesResultEncoder: io.circe.Encoder[avias.devicefarm.models.ListNetworkProfilesResult] = io.circe.Encoder.instance { o => 
    Json.obj("networkProfiles" -> o.networkProfiles.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteNetworkProfileRequestEncoder: io.circe.Encoder[avias.devicefarm.models.DeleteNetworkProfileRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val OfferingPromotionEncoder: io.circe.Encoder[avias.devicefarm.models.OfferingPromotion] = io.circe.Encoder.instance { o => 
    Json.obj("id" -> o.id.asJson, "description" -> o.description.asJson)
  }
  final implicit val IncompatibilityMessageEncoder: io.circe.Encoder[avias.devicefarm.models.IncompatibilityMessage] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "type" -> o.`type`.asJson)
  }
  final implicit val UniqueProblemEncoder: io.circe.Encoder[avias.devicefarm.models.UniqueProblem] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson, "problems" -> o.problems.asJson)
  }
  final implicit val GetTestResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetTestResult] = io.circe.Encoder.instance { o => 
    Json.obj("test" -> o.test.asJson)
  }
  final implicit val GetDevicePoolResultEncoder: io.circe.Encoder[avias.devicefarm.models.GetDevicePoolResult] = io.circe.Encoder.instance { o => 
    Json.obj("devicePool" -> o.devicePool.asJson)
  }
  final implicit val NetworkProfileEncoder: io.circe.Encoder[avias.devicefarm.models.NetworkProfile] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "uplinkLossPercent" -> o.uplinkLossPercent.asJson, "downlinkLossPercent" -> o.downlinkLossPercent.asJson, "type" -> o.`type`.asJson, "uplinkDelayMs" -> o.uplinkDelayMs.asJson, "downlinkJitterMs" -> o.downlinkJitterMs.asJson, "downlinkDelayMs" -> o.downlinkDelayMs.asJson, "uplinkJitterMs" -> o.uplinkJitterMs.asJson, "downlinkBandwidthBits" -> o.downlinkBandwidthBits.asJson, "uplinkBandwidthBits" -> o.uplinkBandwidthBits.asJson, "name" -> o.name.asJson, "description" -> o.description.asJson)
  }
  final implicit val UpdateProjectResultEncoder: io.circe.Encoder[avias.devicefarm.models.UpdateProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val CreateProjectResultEncoder: io.circe.Encoder[avias.devicefarm.models.CreateProjectResult] = io.circe.Encoder.instance { o => 
    Json.obj("project" -> o.project.asJson)
  }
  final implicit val ListProjectsRequestEncoder: io.circe.Encoder[avias.devicefarm.models.ListProjectsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson, "nextToken" -> o.nextToken.asJson)
  }
  final implicit val GetDevicePoolRequestEncoder: io.circe.Encoder[avias.devicefarm.models.GetDevicePoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("arn" -> o.arn.asJson)
  }
  final implicit val ListSamplesRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListSamplesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListSamplesRequest.apply _)
  }
  final implicit val CreateRemoteAccessSessionRequestDecoder: io.circe.Decoder[avias.devicefarm.models.CreateRemoteAccessSessionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectArn"), o.get[java.lang.String]("deviceArn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[avias.devicefarm.models.CreateRemoteAccessSessionConfiguration]]("configuration"), o.get[scala.Option[java.lang.String]]("clientId"), o.get[scala.Option[scala.Boolean]]("remoteDebugEnabled"), o.get[scala.Option[java.lang.String]]("sshPublicKey")).mapN(avias.devicefarm.models.CreateRemoteAccessSessionRequest.apply _)
  }
  final implicit val DeleteUploadResultDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteUploadResult.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.DeleteUploadResult)
  final implicit val GetDeviceResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetDeviceResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Device]]("device").map(avias.devicefarm.models.GetDeviceResult.apply _)
  }
  final implicit val OfferingDecoder: io.circe.Decoder[avias.devicefarm.models.Offering] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.RecurringCharge]]]("recurringCharges"), o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("type")).mapN(avias.devicefarm.models.Offering.apply _)
  }
  final implicit val CreateUploadRequestDecoder: io.circe.Decoder[avias.devicefarm.models.CreateUploadRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectArn"), o.get[java.lang.String]("name"), o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("contentType")).mapN(avias.devicefarm.models.CreateUploadRequest.apply _)
  }
  final implicit val StopRunResultDecoder: io.circe.Decoder[avias.devicefarm.models.StopRunResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Run]]("run").map(avias.devicefarm.models.StopRunResult.apply _)
  }
  final implicit val UploadDecoder: io.circe.Decoder[avias.devicefarm.models.Upload] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.lang.String]]("contentType"), o.get[scala.Option[java.lang.String]]("url"), o.get[scala.Option[java.lang.String]]("metadata")).mapN(avias.devicefarm.models.Upload.apply _)
  }
  final implicit val RecurringChargeDecoder: io.circe.Decoder[avias.devicefarm.models.RecurringCharge] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.devicefarm.models.MonetaryAmount]]("cost"), o.get[scala.Option[java.lang.String]]("frequency")).mapN(avias.devicefarm.models.RecurringCharge.apply _)
  }
  final implicit val ListArtifactsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListArtifactsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Artifact]]]("artifacts"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListArtifactsResult.apply _)
  }
  final implicit val ListJobsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListJobsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListJobsRequest.apply _)
  }
  final implicit val GetSuiteResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetSuiteResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Suite]]("suite").map(avias.devicefarm.models.GetSuiteResult.apply _)
  }
  final implicit val GetProjectResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetProjectResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Project]]("project").map(avias.devicefarm.models.GetProjectResult.apply _)
  }
  final implicit val SuiteDecoder: io.circe.Decoder[avias.devicefarm.models.Suite] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[avias.devicefarm.models.DeviceMinutes]]("deviceMinutes"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("result"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[avias.devicefarm.models.Counters]]("counters"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("started"), o.get[scala.Option[java.time.Instant]]("stopped")).mapN(avias.devicefarm.models.Suite.apply _)
  }
  final implicit val GetDevicePoolCompatibilityResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetDevicePoolCompatibilityResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.DevicePoolCompatibilityResult]]]("compatibleDevices"), o.get[scala.Option[scala.List[avias.devicefarm.models.DevicePoolCompatibilityResult]]]("incompatibleDevices")).mapN(avias.devicefarm.models.GetDevicePoolCompatibilityResult.apply _)
  }
  final implicit val CustomerArtifactPathsDecoder: io.circe.Decoder[avias.devicefarm.models.CustomerArtifactPaths] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("iosPaths"), o.get[scala.Option[scala.List[java.lang.String]]]("androidPaths"), o.get[scala.Option[scala.List[java.lang.String]]]("deviceHostPaths")).mapN(avias.devicefarm.models.CustomerArtifactPaths.apply _)
  }
  final implicit val ScheduleRunTestDecoder: io.circe.Decoder[avias.devicefarm.models.ScheduleRunTest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("testPackageArn"), o.get[scala.Option[java.lang.String]]("filter"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("parameters")).mapN(avias.devicefarm.models.ScheduleRunTest.apply _)
  }
  final implicit val ListOfferingTransactionsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListOfferingTransactionsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.devicefarm.models.ListOfferingTransactionsRequest.apply _)
  }
  final implicit val ListSamplesResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListSamplesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Sample]]]("samples"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListSamplesResult.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.devicefarm.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.devicefarm.models.LimitExceededException.apply _)
  }
  final implicit val DeviceMinutesDecoder: io.circe.Decoder[avias.devicefarm.models.DeviceMinutes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("total"), o.get[scala.Option[scala.Double]]("metered"), o.get[scala.Option[scala.Double]]("unmetered")).mapN(avias.devicefarm.models.DeviceMinutes.apply _)
  }
  final implicit val RadiosDecoder: io.circe.Decoder[avias.devicefarm.models.Radios] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("wifi"), o.get[scala.Option[scala.Boolean]]("bluetooth"), o.get[scala.Option[scala.Boolean]]("nfc"), o.get[scala.Option[scala.Boolean]]("gps")).mapN(avias.devicefarm.models.Radios.apply _)
  }
  final implicit val UpdateDevicePoolResultDecoder: io.circe.Decoder[avias.devicefarm.models.UpdateDevicePoolResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.DevicePool]]("devicePool").map(avias.devicefarm.models.UpdateDevicePoolResult.apply _)
  }
  final implicit val GetDeviceRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetDeviceRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetDeviceRequest.apply _)
  }
  final implicit val InstallToRemoteAccessSessionResultDecoder: io.circe.Decoder[avias.devicefarm.models.InstallToRemoteAccessSessionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Upload]]("appUpload").map(avias.devicefarm.models.InstallToRemoteAccessSessionResult.apply _)
  }
  final implicit val ListRunsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListRunsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListRunsRequest.apply _)
  }
  final implicit val DevicePoolCompatibilityResultDecoder: io.circe.Decoder[avias.devicefarm.models.DevicePoolCompatibilityResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.devicefarm.models.Device]]("device"), o.get[scala.Option[scala.Boolean]]("compatible"), o.get[scala.Option[scala.List[avias.devicefarm.models.IncompatibilityMessage]]]("incompatibilityMessages")).mapN(avias.devicefarm.models.DevicePoolCompatibilityResult.apply _)
  }
  final implicit val RuleDecoder: io.circe.Decoder[avias.devicefarm.models.Rule] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("attribute"), o.get[scala.Option[java.lang.String]]("operator"), o.get[scala.Option[java.lang.String]]("value")).mapN(avias.devicefarm.models.Rule.apply _)
  }
  final implicit val DeviceDecoder: io.circe.Decoder[avias.devicefarm.models.Device] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[scala.Long]]("heapSize"), o.get[scala.Option[scala.Long]]("memory"), o.get[scala.Option[java.lang.String]]("os"), o.get[scala.Option[java.lang.String]]("radio"), o.get[scala.Option[java.lang.String]]("manufacturer"), o.get[scala.Option[java.lang.String]]("model"), o.get[scala.Option[java.lang.String]]("image"), o.get[scala.Option[java.lang.String]]("carrier"), o.get[scala.Option[java.lang.String]]("fleetType"), o.get[scala.Option[java.lang.String]]("fleetName"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[avias.devicefarm.models.Resolution]]("resolution"), o.get[scala.Option[avias.devicefarm.models.CPU]]("cpu"), o.get[scala.Option[scala.Boolean]]("remoteAccessEnabled"), o.get[scala.Option[scala.Boolean]]("remoteDebugEnabled"), o.get[scala.Option[java.lang.String]]("formFactor")).mapN(avias.devicefarm.models.Device.apply _)
  }
  final implicit val ListUploadsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListUploadsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListUploadsRequest.apply _)
  }
  final implicit val GetNetworkProfileResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetNetworkProfileResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.NetworkProfile]]("networkProfile").map(avias.devicefarm.models.GetNetworkProfileResult.apply _)
  }
  final implicit val UpdateNetworkProfileRequestDecoder: io.circe.Decoder[avias.devicefarm.models.UpdateNetworkProfileRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[scala.Int]]("uplinkLossPercent"), o.get[scala.Option[scala.Int]]("downlinkLossPercent"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.Long]]("uplinkDelayMs"), o.get[scala.Option[scala.Long]]("downlinkJitterMs"), o.get[scala.Option[scala.Long]]("downlinkDelayMs"), o.get[scala.Option[scala.Long]]("uplinkJitterMs"), o.get[scala.Option[scala.Long]]("downlinkBandwidthBits"), o.get[scala.Option[scala.Long]]("uplinkBandwidthBits"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.devicefarm.models.UpdateNetworkProfileRequest.apply _)
  }
  final implicit val GetRunResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetRunResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Run]]("run").map(avias.devicefarm.models.GetRunResult.apply _)
  }
  final implicit val LocationDecoder: io.circe.Decoder[avias.devicefarm.models.Location] = io.circe.Decoder.instance { o => 
    (o.get[scala.Double]("latitude"), o.get[scala.Double]("longitude")).mapN(avias.devicefarm.models.Location.apply _)
  }
  final implicit val DeleteUploadRequestDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteUploadRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.DeleteUploadRequest.apply _)
  }
  final implicit val ListTestsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListTestsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListTestsRequest.apply _)
  }
  final implicit val AccountSettingsDecoder: io.circe.Decoder[avias.devicefarm.models.AccountSettings] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("unmeteredDevices"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("unmeteredRemoteAccessDevices"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.Int]]]("maxSlots"), o.get[scala.Option[avias.devicefarm.models.TrialMinutes]]("trialMinutes"), o.get[scala.Option[java.lang.String]]("awsAccountNumber"), o.get[scala.Option[scala.Int]]("maxJobTimeoutMinutes"), o.get[scala.Option[scala.Int]]("defaultJobTimeoutMinutes")).mapN(avias.devicefarm.models.AccountSettings.apply _)
  }
  final implicit val CreateRemoteAccessSessionConfigurationDecoder: io.circe.Decoder[avias.devicefarm.models.CreateRemoteAccessSessionConfiguration] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("billingMethod").map(avias.devicefarm.models.CreateRemoteAccessSessionConfiguration.apply _)
  }
  final implicit val ListNetworkProfilesRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListNetworkProfilesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListNetworkProfilesRequest.apply _)
  }
  final implicit val ListOfferingsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListOfferingsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.devicefarm.models.ListOfferingsRequest.apply _)
  }
  final implicit val OfferingStatusDecoder: io.circe.Decoder[avias.devicefarm.models.OfferingStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[avias.devicefarm.models.Offering]]("offering"), o.get[scala.Option[scala.Int]]("quantity"), o.get[scala.Option[java.time.Instant]]("effectiveOn")).mapN(avias.devicefarm.models.OfferingStatus.apply _)
  }
  final implicit val ProblemDecoder: io.circe.Decoder[avias.devicefarm.models.Problem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.devicefarm.models.ProblemDetail]]("run"), o.get[scala.Option[avias.devicefarm.models.ProblemDetail]]("job"), o.get[scala.Option[avias.devicefarm.models.ProblemDetail]]("suite"), o.get[scala.Option[avias.devicefarm.models.ProblemDetail]]("test"), o.get[scala.Option[avias.devicefarm.models.Device]]("device"), o.get[scala.Option[java.lang.String]]("result"), o.get[scala.Option[java.lang.String]]("message")).mapN(avias.devicefarm.models.Problem.apply _)
  }
  final implicit val GetProjectRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetProjectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetProjectRequest.apply _)
  }
  final implicit val GetRunRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetRunRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetRunRequest.apply _)
  }
  final implicit val GetRemoteAccessSessionRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetRemoteAccessSessionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetRemoteAccessSessionRequest.apply _)
  }
  final implicit val CreateNetworkProfileRequestDecoder: io.circe.Decoder[avias.devicefarm.models.CreateNetworkProfileRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectArn"), o.get[java.lang.String]("name"), o.get[scala.Option[scala.Int]]("uplinkLossPercent"), o.get[scala.Option[scala.Int]]("downlinkLossPercent"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.Long]]("uplinkDelayMs"), o.get[scala.Option[scala.Long]]("downlinkJitterMs"), o.get[scala.Option[scala.Long]]("downlinkDelayMs"), o.get[scala.Option[scala.Long]]("uplinkJitterMs"), o.get[scala.Option[scala.Long]]("downlinkBandwidthBits"), o.get[scala.Option[scala.Long]]("uplinkBandwidthBits"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.devicefarm.models.CreateNetworkProfileRequest.apply _)
  }
  final implicit val DeleteRunRequestDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteRunRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.DeleteRunRequest.apply _)
  }
  final implicit val ListProjectsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListProjectsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Project]]]("projects"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListProjectsResult.apply _)
  }
  final implicit val CreateNetworkProfileResultDecoder: io.circe.Decoder[avias.devicefarm.models.CreateNetworkProfileResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.NetworkProfile]]("networkProfile").map(avias.devicefarm.models.CreateNetworkProfileResult.apply _)
  }
  final implicit val UpdateNetworkProfileResultDecoder: io.circe.Decoder[avias.devicefarm.models.UpdateNetworkProfileResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.NetworkProfile]]("networkProfile").map(avias.devicefarm.models.UpdateNetworkProfileResult.apply _)
  }
  final implicit val DeleteNetworkProfileResultDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteNetworkProfileResult.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.DeleteNetworkProfileResult)
  final implicit val ArtifactDecoder: io.circe.Decoder[avias.devicefarm.models.Artifact] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("extension"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("url")).mapN(avias.devicefarm.models.Artifact.apply _)
  }
  final implicit val OfferingTransactionDecoder: io.circe.Decoder[avias.devicefarm.models.OfferingTransaction] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("transactionId"), o.get[scala.Option[avias.devicefarm.models.OfferingStatus]]("offeringStatus"), o.get[scala.Option[java.time.Instant]]("createdOn"), o.get[scala.Option[java.lang.String]]("offeringPromotionId"), o.get[scala.Option[avias.devicefarm.models.MonetaryAmount]]("cost")).mapN(avias.devicefarm.models.OfferingTransaction.apply _)
  }
  final implicit val ListRunsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListRunsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Run]]]("runs"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListRunsResult.apply _)
  }
  final implicit val IdempotencyExceptionDecoder: io.circe.Decoder[avias.devicefarm.models.IdempotencyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.devicefarm.models.IdempotencyException.apply _)
  }
  final implicit val GetNetworkProfileRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetNetworkProfileRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetNetworkProfileRequest.apply _)
  }
  final implicit val ProjectDecoder: io.circe.Decoder[avias.devicefarm.models.Project] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Int]]("defaultJobTimeoutMinutes"), o.get[scala.Option[java.time.Instant]]("created")).mapN(avias.devicefarm.models.Project.apply _)
  }
  final implicit val ListJobsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListJobsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Job]]]("jobs"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListJobsResult.apply _)
  }
  final implicit val ScheduleRunRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ScheduleRunRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectArn"), o.get[java.lang.String]("devicePoolArn"), o.get[avias.devicefarm.models.ScheduleRunTest]("test"), o.get[scala.Option[java.lang.String]]("appArn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[avias.devicefarm.models.ExecutionConfiguration]]("executionConfiguration"), o.get[scala.Option[avias.devicefarm.models.ScheduleRunConfiguration]]("configuration")).mapN(avias.devicefarm.models.ScheduleRunRequest.apply _)
  }
  final implicit val DeleteDevicePoolResultDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteDevicePoolResult.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.DeleteDevicePoolResult)
  final implicit val CreateUploadResultDecoder: io.circe.Decoder[avias.devicefarm.models.CreateUploadResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Upload]]("upload").map(avias.devicefarm.models.CreateUploadResult.apply _)
  }
  final implicit val ListUniqueProblemsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListUniqueProblemsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListUniqueProblemsRequest.apply _)
  }
  final implicit val StopRemoteAccessSessionRequestDecoder: io.circe.Decoder[avias.devicefarm.models.StopRemoteAccessSessionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.StopRemoteAccessSessionRequest.apply _)
  }
  final implicit val ListOfferingPromotionsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListOfferingPromotionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.OfferingPromotion]]]("offeringPromotions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListOfferingPromotionsResult.apply _)
  }
  final implicit val DeleteDevicePoolRequestDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteDevicePoolRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.DeleteDevicePoolRequest.apply _)
  }
  final implicit val CreateDevicePoolResultDecoder: io.circe.Decoder[avias.devicefarm.models.CreateDevicePoolResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.DevicePool]]("devicePool").map(avias.devicefarm.models.CreateDevicePoolResult.apply _)
  }
  final implicit val ListOfferingsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListOfferingsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Offering]]]("offerings"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListOfferingsResult.apply _)
  }
  final implicit val ScheduleRunResultDecoder: io.circe.Decoder[avias.devicefarm.models.ScheduleRunResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Run]]("run").map(avias.devicefarm.models.ScheduleRunResult.apply _)
  }
  final implicit val PurchaseOfferingRequestDecoder: io.circe.Decoder[avias.devicefarm.models.PurchaseOfferingRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("offeringId"), o.get[scala.Option[scala.Int]]("quantity"), o.get[scala.Option[java.lang.String]]("offeringPromotionId")).mapN(avias.devicefarm.models.PurchaseOfferingRequest.apply _)
  }
  final implicit val GetAccountSettingsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetAccountSettingsRequest.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.GetAccountSettingsRequest)
  final implicit val GetJobRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetJobRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetJobRequest.apply _)
  }
  final implicit val DeleteRemoteAccessSessionRequestDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteRemoteAccessSessionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.DeleteRemoteAccessSessionRequest.apply _)
  }
  final implicit val GetAccountSettingsResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetAccountSettingsResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.AccountSettings]]("accountSettings").map(avias.devicefarm.models.GetAccountSettingsResult.apply _)
  }
  final implicit val CountersDecoder: io.circe.Decoder[avias.devicefarm.models.Counters] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("passed"), o.get[scala.Option[scala.Int]]("total"), o.get[scala.Option[scala.Int]]("errored"), o.get[scala.Option[scala.Int]]("skipped"), o.get[scala.Option[scala.Int]]("warned"), o.get[scala.Option[scala.Int]]("failed"), o.get[scala.Option[scala.Int]]("stopped")).mapN(avias.devicefarm.models.Counters.apply _)
  }
  final implicit val InstallToRemoteAccessSessionRequestDecoder: io.circe.Decoder[avias.devicefarm.models.InstallToRemoteAccessSessionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("remoteAccessSessionArn"), o.get[java.lang.String]("appArn")).mapN(avias.devicefarm.models.InstallToRemoteAccessSessionRequest.apply _)
  }
  final implicit val ArgumentExceptionDecoder: io.circe.Decoder[avias.devicefarm.models.ArgumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.devicefarm.models.ArgumentException.apply _)
  }
  final implicit val NotEligibleExceptionDecoder: io.circe.Decoder[avias.devicefarm.models.NotEligibleException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.devicefarm.models.NotEligibleException.apply _)
  }
  final implicit val ListOfferingTransactionsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListOfferingTransactionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.OfferingTransaction]]]("offeringTransactions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListOfferingTransactionsResult.apply _)
  }
  final implicit val ListRemoteAccessSessionsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListRemoteAccessSessionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListRemoteAccessSessionsRequest.apply _)
  }
  final implicit val JobDecoder: io.circe.Decoder[avias.devicefarm.models.Job] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[avias.devicefarm.models.DeviceMinutes]]("deviceMinutes"), o.get[scala.Option[avias.devicefarm.models.Device]]("device"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("result"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[avias.devicefarm.models.Counters]]("counters"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("started"), o.get[scala.Option[java.time.Instant]]("stopped")).mapN(avias.devicefarm.models.Job.apply _)
  }
  final implicit val DeleteRemoteAccessSessionResultDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteRemoteAccessSessionResult.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.DeleteRemoteAccessSessionResult)
  final implicit val ListDevicePoolsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListDevicePoolsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListDevicePoolsRequest.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[avias.devicefarm.models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.devicefarm.models.NotFoundException.apply _)
  }
  final implicit val RemoteAccessSessionDecoder: io.circe.Decoder[avias.devicefarm.models.RemoteAccessSession] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("hostAddress"), o.get[scala.Option[avias.devicefarm.models.DeviceMinutes]]("deviceMinutes"), o.get[scala.Option[java.lang.String]]("endpoint"), o.get[scala.Option[java.lang.String]]("deviceUdid"), o.get[scala.Option[avias.devicefarm.models.Device]]("device"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("result"), o.get[scala.Option[java.lang.String]]("clientId"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("started"), o.get[scala.Option[java.time.Instant]]("stopped"), o.get[scala.Option[java.lang.String]]("billingMethod"), o.get[scala.Option[scala.Boolean]]("remoteDebugEnabled")).mapN(avias.devicefarm.models.RemoteAccessSession.apply _)
  }
  final implicit val SampleDecoder: io.circe.Decoder[avias.devicefarm.models.Sample] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("url")).mapN(avias.devicefarm.models.Sample.apply _)
  }
  final implicit val GetOfferingStatusRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetOfferingStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.devicefarm.models.GetOfferingStatusRequest.apply _)
  }
  final implicit val ServiceAccountExceptionDecoder: io.circe.Decoder[avias.devicefarm.models.ServiceAccountException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.devicefarm.models.ServiceAccountException.apply _)
  }
  final implicit val CreateProjectRequestDecoder: io.circe.Decoder[avias.devicefarm.models.CreateProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("name"), o.get[scala.Option[scala.Int]]("defaultJobTimeoutMinutes")).mapN(avias.devicefarm.models.CreateProjectRequest.apply _)
  }
  final implicit val ResolutionDecoder: io.circe.Decoder[avias.devicefarm.models.Resolution] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("width"), o.get[scala.Option[scala.Int]]("height")).mapN(avias.devicefarm.models.Resolution.apply _)
  }
  final implicit val RenewOfferingRequestDecoder: io.circe.Decoder[avias.devicefarm.models.RenewOfferingRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("offeringId"), o.get[scala.Option[scala.Int]]("quantity")).mapN(avias.devicefarm.models.RenewOfferingRequest.apply _)
  }
  final implicit val RunDecoder: io.circe.Decoder[avias.devicefarm.models.Run] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[avias.devicefarm.models.CustomerArtifactPaths]]("customerArtifactPaths"), o.get[scala.Option[avias.devicefarm.models.DeviceMinutes]]("deviceMinutes"), o.get[scala.Option[java.lang.String]]("parsingResultUrl"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("platform"), o.get[scala.Option[java.lang.String]]("result"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[avias.devicefarm.models.Counters]]("counters"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("started"), o.get[scala.Option[java.time.Instant]]("stopped"), o.get[scala.Option[java.lang.String]]("billingMethod"), o.get[scala.Option[scala.Int]]("totalJobs"), o.get[scala.Option[scala.Int]]("completedJobs"), o.get[scala.Option[java.lang.String]]("resultCode"), o.get[scala.Option[avias.devicefarm.models.NetworkProfile]]("networkProfile")).mapN(avias.devicefarm.models.Run.apply _)
  }
  final implicit val CPUDecoder: io.circe.Decoder[avias.devicefarm.models.CPU] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("frequency"), o.get[scala.Option[java.lang.String]]("architecture"), o.get[scala.Option[scala.Double]]("clock")).mapN(avias.devicefarm.models.CPU.apply _)
  }
  final implicit val ListTestsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListTestsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Test]]]("tests"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListTestsResult.apply _)
  }
  final implicit val DeleteProjectRequestDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteProjectRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.DeleteProjectRequest.apply _)
  }
  final implicit val DevicePoolDecoder: io.circe.Decoder[avias.devicefarm.models.DevicePool] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.List[avias.devicefarm.models.Rule]]]("rules"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[java.lang.String]]("type")).mapN(avias.devicefarm.models.DevicePool.apply _)
  }
  final implicit val StopRemoteAccessSessionResultDecoder: io.circe.Decoder[avias.devicefarm.models.StopRemoteAccessSessionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.RemoteAccessSession]]("remoteAccessSession").map(avias.devicefarm.models.StopRemoteAccessSessionResult.apply _)
  }
  final implicit val GetUploadResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetUploadResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Upload]]("upload").map(avias.devicefarm.models.GetUploadResult.apply _)
  }
  final implicit val ListSuitesResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListSuitesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Suite]]]("suites"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListSuitesResult.apply _)
  }
  final implicit val GetTestRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetTestRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetTestRequest.apply _)
  }
  final implicit val GetSuiteRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetSuiteRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetSuiteRequest.apply _)
  }
  final implicit val ExecutionConfigurationDecoder: io.circe.Decoder[avias.devicefarm.models.ExecutionConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("jobTimeoutMinutes"), o.get[scala.Option[scala.Boolean]]("accountsCleanup"), o.get[scala.Option[scala.Boolean]]("appPackagesCleanup")).mapN(avias.devicefarm.models.ExecutionConfiguration.apply _)
  }
  final implicit val RenewOfferingResultDecoder: io.circe.Decoder[avias.devicefarm.models.RenewOfferingResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.OfferingTransaction]]("offeringTransaction").map(avias.devicefarm.models.RenewOfferingResult.apply _)
  }
  final implicit val CreateDevicePoolRequestDecoder: io.circe.Decoder[avias.devicefarm.models.CreateDevicePoolRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("projectArn"), o.get[java.lang.String]("name"), o.get[scala.List[avias.devicefarm.models.Rule]]("rules"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.devicefarm.models.CreateDevicePoolRequest.apply _)
  }
  final implicit val GetOfferingStatusResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetOfferingStatusResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.devicefarm.models.OfferingStatus]]]("current"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.devicefarm.models.OfferingStatus]]]("nextPeriod"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.GetOfferingStatusResult.apply _)
  }
  final implicit val ListUploadsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListUploadsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Upload]]]("uploads"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListUploadsResult.apply _)
  }
  final implicit val ListDevicesRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListDevicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListDevicesRequest.apply _)
  }
  final implicit val ScheduleRunConfigurationDecoder: io.circe.Decoder[avias.devicefarm.models.ScheduleRunConfiguration] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("extraDataPackageArn"), o.get[scala.Option[java.lang.String]]("networkProfileArn"), o.get[scala.Option[avias.devicefarm.models.CustomerArtifactPaths]]("customerArtifactPaths"), o.get[scala.Option[avias.devicefarm.models.Radios]]("radios"), o.get[scala.Option[java.lang.String]]("locale"), o.get[scala.Option[avias.devicefarm.models.Location]]("location"), o.get[scala.Option[java.lang.String]]("billingMethod"), o.get[scala.Option[scala.List[java.lang.String]]]("auxiliaryApps")).mapN(avias.devicefarm.models.ScheduleRunConfiguration.apply _)
  }
  final implicit val TrialMinutesDecoder: io.circe.Decoder[avias.devicefarm.models.TrialMinutes] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("total"), o.get[scala.Option[scala.Double]]("remaining")).mapN(avias.devicefarm.models.TrialMinutes.apply _)
  }
  final implicit val ListDevicesResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListDevicesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.Device]]]("devices"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListDevicesResult.apply _)
  }
  final implicit val UpdateProjectRequestDecoder: io.circe.Decoder[avias.devicefarm.models.UpdateProjectRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[scala.Int]]("defaultJobTimeoutMinutes")).mapN(avias.devicefarm.models.UpdateProjectRequest.apply _)
  }
  final implicit val DeleteProjectResultDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteProjectResult.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.DeleteProjectResult)
  final implicit val GetRemoteAccessSessionResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetRemoteAccessSessionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.RemoteAccessSession]]("remoteAccessSession").map(avias.devicefarm.models.GetRemoteAccessSessionResult.apply _)
  }
  final implicit val ListDevicePoolsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListDevicePoolsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.DevicePool]]]("devicePools"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListDevicePoolsResult.apply _)
  }
  final implicit val GetJobResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetJobResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Job]]("job").map(avias.devicefarm.models.GetJobResult.apply _)
  }
  final implicit val ListRemoteAccessSessionsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListRemoteAccessSessionsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.RemoteAccessSession]]]("remoteAccessSessions"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListRemoteAccessSessionsResult.apply _)
  }
  final implicit val GetUploadRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetUploadRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetUploadRequest.apply _)
  }
  final implicit val PurchaseOfferingResultDecoder: io.circe.Decoder[avias.devicefarm.models.PurchaseOfferingResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.OfferingTransaction]]("offeringTransaction").map(avias.devicefarm.models.PurchaseOfferingResult.apply _)
  }
  final implicit val ListArtifactsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListArtifactsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[java.lang.String]("type"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListArtifactsRequest.apply _)
  }
  final implicit val GetDevicePoolCompatibilityRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetDevicePoolCompatibilityRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("devicePoolArn"), o.get[scala.Option[java.lang.String]]("appArn"), o.get[scala.Option[java.lang.String]]("testType"), o.get[scala.Option[avias.devicefarm.models.ScheduleRunTest]]("test")).mapN(avias.devicefarm.models.GetDevicePoolCompatibilityRequest.apply _)
  }
  final implicit val UpdateDevicePoolRequestDecoder: io.circe.Decoder[avias.devicefarm.models.UpdateDevicePoolRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description"), o.get[scala.Option[scala.List[avias.devicefarm.models.Rule]]]("rules")).mapN(avias.devicefarm.models.UpdateDevicePoolRequest.apply _)
  }
  final implicit val ListSuitesRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListSuitesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListSuitesRequest.apply _)
  }
  final implicit val MonetaryAmountDecoder: io.circe.Decoder[avias.devicefarm.models.MonetaryAmount] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Double]]("amount"), o.get[scala.Option[java.lang.String]]("currencyCode")).mapN(avias.devicefarm.models.MonetaryAmount.apply _)
  }
  final implicit val TestDecoder: io.circe.Decoder[avias.devicefarm.models.Test] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[avias.devicefarm.models.DeviceMinutes]]("deviceMinutes"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[java.lang.String]]("result"), o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("status"), o.get[scala.Option[avias.devicefarm.models.Counters]]("counters"), o.get[scala.Option[java.time.Instant]]("created"), o.get[scala.Option[java.time.Instant]]("started"), o.get[scala.Option[java.time.Instant]]("stopped")).mapN(avias.devicefarm.models.Test.apply _)
  }
  final implicit val DeleteRunResultDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteRunResult.type] = io.circe.Decoder.decodeUnit.as(avias.devicefarm.models.DeleteRunResult)
  final implicit val ListOfferingPromotionsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListOfferingPromotionsRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("nextToken").map(avias.devicefarm.models.ListOfferingPromotionsRequest.apply _)
  }
  final implicit val ProblemDetailDecoder: io.circe.Decoder[avias.devicefarm.models.ProblemDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("name")).mapN(avias.devicefarm.models.ProblemDetail.apply _)
  }
  final implicit val CreateRemoteAccessSessionResultDecoder: io.circe.Decoder[avias.devicefarm.models.CreateRemoteAccessSessionResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.RemoteAccessSession]]("remoteAccessSession").map(avias.devicefarm.models.CreateRemoteAccessSessionResult.apply _)
  }
  final implicit val StopRunRequestDecoder: io.circe.Decoder[avias.devicefarm.models.StopRunRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.StopRunRequest.apply _)
  }
  final implicit val ListUniqueProblemsResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListUniqueProblemsResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, scala.List[avias.devicefarm.models.UniqueProblem]]]]("uniqueProblems"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListUniqueProblemsResult.apply _)
  }
  final implicit val ListNetworkProfilesResultDecoder: io.circe.Decoder[avias.devicefarm.models.ListNetworkProfilesResult] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.devicefarm.models.NetworkProfile]]]("networkProfiles"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListNetworkProfilesResult.apply _)
  }
  final implicit val DeleteNetworkProfileRequestDecoder: io.circe.Decoder[avias.devicefarm.models.DeleteNetworkProfileRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.DeleteNetworkProfileRequest.apply _)
  }
  final implicit val OfferingPromotionDecoder: io.circe.Decoder[avias.devicefarm.models.OfferingPromotion] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("id"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.devicefarm.models.OfferingPromotion.apply _)
  }
  final implicit val IncompatibilityMessageDecoder: io.circe.Decoder[avias.devicefarm.models.IncompatibilityMessage] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[java.lang.String]]("type")).mapN(avias.devicefarm.models.IncompatibilityMessage.apply _)
  }
  final implicit val UniqueProblemDecoder: io.circe.Decoder[avias.devicefarm.models.UniqueProblem] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("message"), o.get[scala.Option[scala.List[avias.devicefarm.models.Problem]]]("problems")).mapN(avias.devicefarm.models.UniqueProblem.apply _)
  }
  final implicit val GetTestResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetTestResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Test]]("test").map(avias.devicefarm.models.GetTestResult.apply _)
  }
  final implicit val GetDevicePoolResultDecoder: io.circe.Decoder[avias.devicefarm.models.GetDevicePoolResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.DevicePool]]("devicePool").map(avias.devicefarm.models.GetDevicePoolResult.apply _)
  }
  final implicit val NetworkProfileDecoder: io.circe.Decoder[avias.devicefarm.models.NetworkProfile] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[scala.Int]]("uplinkLossPercent"), o.get[scala.Option[scala.Int]]("downlinkLossPercent"), o.get[scala.Option[java.lang.String]]("type"), o.get[scala.Option[scala.Long]]("uplinkDelayMs"), o.get[scala.Option[scala.Long]]("downlinkJitterMs"), o.get[scala.Option[scala.Long]]("downlinkDelayMs"), o.get[scala.Option[scala.Long]]("uplinkJitterMs"), o.get[scala.Option[scala.Long]]("downlinkBandwidthBits"), o.get[scala.Option[scala.Long]]("uplinkBandwidthBits"), o.get[scala.Option[java.lang.String]]("name"), o.get[scala.Option[java.lang.String]]("description")).mapN(avias.devicefarm.models.NetworkProfile.apply _)
  }
  final implicit val UpdateProjectResultDecoder: io.circe.Decoder[avias.devicefarm.models.UpdateProjectResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Project]]("project").map(avias.devicefarm.models.UpdateProjectResult.apply _)
  }
  final implicit val CreateProjectResultDecoder: io.circe.Decoder[avias.devicefarm.models.CreateProjectResult] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.devicefarm.models.Project]]("project").map(avias.devicefarm.models.CreateProjectResult.apply _)
  }
  final implicit val ListProjectsRequestDecoder: io.circe.Decoder[avias.devicefarm.models.ListProjectsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("arn"), o.get[scala.Option[java.lang.String]]("nextToken")).mapN(avias.devicefarm.models.ListProjectsRequest.apply _)
  }
  final implicit val GetDevicePoolRequestDecoder: io.circe.Decoder[avias.devicefarm.models.GetDevicePoolRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("arn").map(avias.devicefarm.models.GetDevicePoolRequest.apply _)
  }
}