package org.lyranthe.araethura.route53domains
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val BillingRecordEncoder: io.circe.Encoder[models.BillingRecord] = io.circe.Encoder.instance { o => 
    Json.obj("BillDate" -> o.billDate.asJson, "Price" -> o.price.asJson, "Operation" -> o.operation.asJson, "DomainName" -> o.domainName.asJson, "InvoiceId" -> o.invoiceId.asJson)
  }
  final implicit val ExtraParamEncoder: io.circe.Encoder[models.ExtraParam] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ViewBillingResponseEncoder: io.circe.Encoder[models.ViewBillingResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextPageMarker" -> o.nextPageMarker.asJson, "BillingRecords" -> o.billingRecords.asJson)
  }
  final implicit val RenewDomainRequestEncoder: io.circe.Encoder[models.RenewDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "CurrentExpiryYear" -> o.currentExpiryYear.asJson, "DurationInYears" -> o.durationInYears.asJson)
  }
  final implicit val UnsupportedTLDEncoder: io.circe.Encoder[models.UnsupportedTLD] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TransferDomainResponseEncoder: io.circe.Encoder[models.TransferDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val GetContactReachabilityStatusRequestEncoder: io.circe.Encoder[models.GetContactReachabilityStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val NameserverEncoder: io.circe.Encoder[models.Nameserver] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "GlueIps" -> o.glueIps.asJson)
  }
  final implicit val ListDomainsRequestEncoder: io.circe.Encoder[models.ListDomainsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val DeleteTagsForDomainRequestEncoder: io.circe.Encoder[models.DeleteTagsForDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "TagsToDelete" -> o.tagsToDelete.asJson)
  }
  final implicit val DomainSuggestionEncoder: io.circe.Encoder[models.DomainSuggestion] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "Availability" -> o.availability.asJson)
  }
  final implicit val ListOperationsRequestEncoder: io.circe.Encoder[models.ListOperationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val ResendContactReachabilityEmailRequestEncoder: io.circe.Encoder[models.ResendContactReachabilityEmailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val CheckDomainAvailabilityRequestEncoder: io.circe.Encoder[models.CheckDomainAvailabilityRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "IdnLangCode" -> o.idnLangCode.asJson)
  }
  final implicit val DuplicateRequestEncoder: io.circe.Encoder[models.DuplicateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetOperationDetailRequestEncoder: io.circe.Encoder[models.GetOperationDetailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val GetDomainSuggestionsRequestEncoder: io.circe.Encoder[models.GetDomainSuggestionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "SuggestionCount" -> o.suggestionCount.asJson, "OnlyAvailable" -> o.onlyAvailable.asJson)
  }
  final implicit val OperationLimitExceededEncoder: io.circe.Encoder[models.OperationLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RegisterDomainResponseEncoder: io.circe.Encoder[models.RegisterDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val UpdateDomainContactPrivacyResponseEncoder: io.circe.Encoder[models.UpdateDomainContactPrivacyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val EnableDomainTransferLockRequestEncoder: io.circe.Encoder[models.EnableDomainTransferLockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val DisableDomainTransferLockRequestEncoder: io.circe.Encoder[models.DisableDomainTransferLockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val UpdateDomainNameserversRequestEncoder: io.circe.Encoder[models.UpdateDomainNameserversRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "Nameservers" -> o.nameservers.asJson, "FIAuthKey" -> o.fiauthKey.asJson)
  }
  final implicit val CheckDomainTransferabilityRequestEncoder: io.circe.Encoder[models.CheckDomainTransferabilityRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AuthCode" -> o.authCode.asJson)
  }
  final implicit val OperationSummaryEncoder: io.circe.Encoder[models.OperationSummary] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "SubmittedDate" -> o.submittedDate.asJson)
  }
  final implicit val RegisterDomainRequestEncoder: io.circe.Encoder[models.RegisterDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInYears" -> o.durationInYears.asJson, "DomainName" -> o.domainName.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson, "IdnLangCode" -> o.idnLangCode.asJson, "AutoRenew" -> o.autoRenew.asJson, "PrivacyProtectAdminContact" -> o.privacyProtectAdminContact.asJson, "PrivacyProtectRegistrantContact" -> o.privacyProtectRegistrantContact.asJson, "PrivacyProtectTechContact" -> o.privacyProtectTechContact.asJson)
  }
  final implicit val DomainSummaryEncoder: io.circe.Encoder[models.DomainSummary] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AutoRenew" -> o.autoRenew.asJson, "TransferLock" -> o.transferLock.asJson, "Expiry" -> o.expiry.asJson)
  }
  final implicit val DeleteTagsForDomainResponseEncoder: io.circe.Encoder[models.DeleteTagsForDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetContactReachabilityStatusResponseEncoder: io.circe.Encoder[models.GetContactReachabilityStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "status" -> o.status.asJson)
  }
  final implicit val RenewDomainResponseEncoder: io.circe.Encoder[models.RenewDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val GetDomainDetailResponseEncoder: io.circe.Encoder[models.GetDomainDetailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "Nameservers" -> o.nameservers.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson, "RegistrarName" -> o.registrarName.asJson, "CreationDate" -> o.creationDate.asJson, "UpdatedDate" -> o.updatedDate.asJson, "ExpirationDate" -> o.expirationDate.asJson, "AbuseContactEmail" -> o.abuseContactEmail.asJson, "StatusList" -> o.statusList.asJson, "WhoIsServer" -> o.whoIsServer.asJson, "AbuseContactPhone" -> o.abuseContactPhone.asJson, "DnsSec" -> o.dnsSec.asJson, "RegistrarUrl" -> o.registrarUrl.asJson, "Reseller" -> o.reseller.asJson, "AutoRenew" -> o.autoRenew.asJson, "AdminPrivacy" -> o.adminPrivacy.asJson, "RegistrantPrivacy" -> o.registrantPrivacy.asJson, "TechPrivacy" -> o.techPrivacy.asJson, "RegistryDomainId" -> o.registryDomainId.asJson)
  }
  final implicit val ViewBillingRequestEncoder: io.circe.Encoder[models.ViewBillingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Start" -> o.start.asJson, "End" -> o.end.asJson, "Marker" -> o.marker.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val CheckDomainTransferabilityResponseEncoder: io.circe.Encoder[models.CheckDomainTransferabilityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Transferability" -> o.transferability.asJson)
  }
  final implicit val UpdateDomainNameserversResponseEncoder: io.circe.Encoder[models.UpdateDomainNameserversResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val RetrieveDomainAuthCodeRequestEncoder: io.circe.Encoder[models.RetrieveDomainAuthCodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val GetDomainSuggestionsResponseEncoder: io.circe.Encoder[models.GetDomainSuggestionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SuggestionsList" -> o.suggestionsList.asJson)
  }
  final implicit val TransferDomainRequestEncoder: io.circe.Encoder[models.TransferDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInYears" -> o.durationInYears.asJson, "DomainName" -> o.domainName.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson, "Nameservers" -> o.nameservers.asJson, "IdnLangCode" -> o.idnLangCode.asJson, "AuthCode" -> o.authCode.asJson, "AutoRenew" -> o.autoRenew.asJson, "PrivacyProtectAdminContact" -> o.privacyProtectAdminContact.asJson, "PrivacyProtectRegistrantContact" -> o.privacyProtectRegistrantContact.asJson, "PrivacyProtectTechContact" -> o.privacyProtectTechContact.asJson)
  }
  final implicit val UpdateTagsForDomainResponseEncoder: io.circe.Encoder[models.UpdateTagsForDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDomainDetailRequestEncoder: io.circe.Encoder[models.GetDomainDetailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val ResendContactReachabilityEmailResponseEncoder: io.circe.Encoder[models.ResendContactReachabilityEmailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "emailAddress" -> o.emailAddress.asJson, "isAlreadyVerified" -> o.isAlreadyVerified.asJson)
  }
  final implicit val ListOperationsResponseEncoder: io.circe.Encoder[models.ListOperationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Operations" -> o.operations.asJson, "NextPageMarker" -> o.nextPageMarker.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListTagsForDomainResponseEncoder: io.circe.Encoder[models.ListTagsForDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val ListDomainsResponseEncoder: io.circe.Encoder[models.ListDomainsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Domains" -> o.domains.asJson, "NextPageMarker" -> o.nextPageMarker.asJson)
  }
  final implicit val DisableDomainTransferLockResponseEncoder: io.circe.Encoder[models.DisableDomainTransferLockResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val ContactDetailEncoder: io.circe.Encoder[models.ContactDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ContactType" -> o.contactType.asJson, "Email" -> o.email.asJson, "PhoneNumber" -> o.phoneNumber.asJson, "Fax" -> o.fax.asJson, "FirstName" -> o.firstName.asJson, "LastName" -> o.lastName.asJson, "OrganizationName" -> o.organizationName.asJson, "ExtraParams" -> o.extraParams.asJson, "State" -> o.state.asJson, "ZipCode" -> o.zipCode.asJson, "CountryCode" -> o.countryCode.asJson, "City" -> o.city.asJson, "AddressLine1" -> o.addressLine1.asJson, "AddressLine2" -> o.addressLine2.asJson)
  }
  final implicit val InvalidInputEncoder: io.circe.Encoder[models.InvalidInput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DomainTransferabilityEncoder: io.circe.Encoder[models.DomainTransferability] = io.circe.Encoder.instance { o => 
    Json.obj("Transferable" -> o.transferable.asJson)
  }
  final implicit val DisableDomainAutoRenewRequestEncoder: io.circe.Encoder[models.DisableDomainAutoRenewRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val DomainLimitExceededEncoder: io.circe.Encoder[models.DomainLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDomainContactResponseEncoder: io.circe.Encoder[models.UpdateDomainContactResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val TLDRulesViolationEncoder: io.circe.Encoder[models.TLDRulesViolation] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDomainContactRequestEncoder: io.circe.Encoder[models.UpdateDomainContactRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson)
  }
  final implicit val EnableDomainTransferLockResponseEncoder: io.circe.Encoder[models.EnableDomainTransferLockResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val UpdateTagsForDomainRequestEncoder: io.circe.Encoder[models.UpdateTagsForDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "TagsToUpdate" -> o.tagsToUpdate.asJson)
  }
  final implicit val CheckDomainAvailabilityResponseEncoder: io.circe.Encoder[models.CheckDomainAvailabilityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Availability" -> o.availability.asJson)
  }
  final implicit val ListTagsForDomainRequestEncoder: io.circe.Encoder[models.ListTagsForDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val EnableDomainAutoRenewResponseEncoder: io.circe.Encoder[models.EnableDomainAutoRenewResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableDomainAutoRenewRequestEncoder: io.circe.Encoder[models.EnableDomainAutoRenewRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val GetOperationDetailResponseEncoder: io.circe.Encoder[models.GetOperationDetailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SubmittedDate" -> o.submittedDate.asJson, "OperationId" -> o.operationId.asJson, "Type" -> o.`type`.asJson, "Status" -> o.status.asJson, "DomainName" -> o.domainName.asJson, "Message" -> o.message.asJson)
  }
  final implicit val UpdateDomainContactPrivacyRequestEncoder: io.circe.Encoder[models.UpdateDomainContactPrivacyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AdminPrivacy" -> o.adminPrivacy.asJson, "RegistrantPrivacy" -> o.registrantPrivacy.asJson, "TechPrivacy" -> o.techPrivacy.asJson)
  }
  final implicit val DisableDomainAutoRenewResponseEncoder: io.circe.Encoder[models.DisableDomainAutoRenewResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RetrieveDomainAuthCodeResponseEncoder: io.circe.Encoder[models.RetrieveDomainAuthCodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AuthCode" -> o.authCode.asJson)
  }
  final implicit val BillingRecordDecoder: io.circe.Decoder[models.BillingRecord] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("BillDate"), o.get[scala.Option[scala.Double]]("Price"), o.get[scala.Option[java.lang.String]]("Operation"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[java.lang.String]]("InvoiceId")).mapN(models.BillingRecord.apply _)
  }
  final implicit val ExtraParamDecoder: io.circe.Decoder[models.ExtraParam] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Value")).mapN(models.ExtraParam.apply _)
  }
  final implicit val ViewBillingResponseDecoder: io.circe.Decoder[models.ViewBillingResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextPageMarker"), o.get[scala.Option[scala.List[models.BillingRecord]]]("BillingRecords")).mapN(models.ViewBillingResponse.apply _)
  }
  final implicit val RenewDomainRequestDecoder: io.circe.Decoder[models.RenewDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Int]("CurrentExpiryYear"), o.get[scala.Option[scala.Int]]("DurationInYears")).mapN(models.RenewDomainRequest.apply _)
  }
  final implicit val UnsupportedTLDDecoder: io.circe.Decoder[models.UnsupportedTLD] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.UnsupportedTLD.apply _)
  }
  final implicit val TransferDomainResponseDecoder: io.circe.Decoder[models.TransferDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.TransferDomainResponse.apply _)
  }
  final implicit val GetContactReachabilityStatusRequestDecoder: io.circe.Decoder[models.GetContactReachabilityStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("domainName").map(models.GetContactReachabilityStatusRequest.apply _)
  }
  final implicit val NameserverDecoder: io.circe.Decoder[models.Nameserver] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.List[java.lang.String]]]("GlueIps")).mapN(models.Nameserver.apply _)
  }
  final implicit val ListDomainsRequestDecoder: io.circe.Decoder[models.ListDomainsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(models.ListDomainsRequest.apply _)
  }
  final implicit val DeleteTagsForDomainRequestDecoder: io.circe.Decoder[models.DeleteTagsForDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.List[java.lang.String]]("TagsToDelete")).mapN(models.DeleteTagsForDomainRequest.apply _)
  }
  final implicit val DomainSuggestionDecoder: io.circe.Decoder[models.DomainSuggestion] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[java.lang.String]]("Availability")).mapN(models.DomainSuggestion.apply _)
  }
  final implicit val ListOperationsRequestDecoder: io.circe.Decoder[models.ListOperationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(models.ListOperationsRequest.apply _)
  }
  final implicit val ResendContactReachabilityEmailRequestDecoder: io.circe.Decoder[models.ResendContactReachabilityEmailRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("domainName").map(models.ResendContactReachabilityEmailRequest.apply _)
  }
  final implicit val CheckDomainAvailabilityRequestDecoder: io.circe.Decoder[models.CheckDomainAvailabilityRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("IdnLangCode")).mapN(models.CheckDomainAvailabilityRequest.apply _)
  }
  final implicit val DuplicateRequestDecoder: io.circe.Decoder[models.DuplicateRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DuplicateRequest.apply _)
  }
  final implicit val GetOperationDetailRequestDecoder: io.circe.Decoder[models.GetOperationDetailRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.GetOperationDetailRequest.apply _)
  }
  final implicit val GetDomainSuggestionsRequestDecoder: io.circe.Decoder[models.GetDomainSuggestionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Int]("SuggestionCount"), o.get[scala.Boolean]("OnlyAvailable")).mapN(models.GetDomainSuggestionsRequest.apply _)
  }
  final implicit val OperationLimitExceededDecoder: io.circe.Decoder[models.OperationLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.OperationLimitExceeded.apply _)
  }
  final implicit val RegisterDomainResponseDecoder: io.circe.Decoder[models.RegisterDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.RegisterDomainResponse.apply _)
  }
  final implicit val UpdateDomainContactPrivacyResponseDecoder: io.circe.Decoder[models.UpdateDomainContactPrivacyResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.UpdateDomainContactPrivacyResponse.apply _)
  }
  final implicit val EnableDomainTransferLockRequestDecoder: io.circe.Decoder[models.EnableDomainTransferLockRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.EnableDomainTransferLockRequest.apply _)
  }
  final implicit val DisableDomainTransferLockRequestDecoder: io.circe.Decoder[models.DisableDomainTransferLockRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.DisableDomainTransferLockRequest.apply _)
  }
  final implicit val UpdateDomainNameserversRequestDecoder: io.circe.Decoder[models.UpdateDomainNameserversRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.List[models.Nameserver]]("Nameservers"), o.get[scala.Option[java.lang.String]]("FIAuthKey")).mapN(models.UpdateDomainNameserversRequest.apply _)
  }
  final implicit val CheckDomainTransferabilityRequestDecoder: io.circe.Decoder[models.CheckDomainTransferabilityRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("AuthCode")).mapN(models.CheckDomainTransferabilityRequest.apply _)
  }
  final implicit val OperationSummaryDecoder: io.circe.Decoder[models.OperationSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OperationId"), o.get[java.lang.String]("Status"), o.get[java.lang.String]("Type"), o.get[java.time.Instant]("SubmittedDate")).mapN(models.OperationSummary.apply _)
  }
  final implicit val RegisterDomainRequestDecoder: io.circe.Decoder[models.RegisterDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("DurationInYears"), o.get[java.lang.String]("DomainName"), o.get[models.ContactDetail]("AdminContact"), o.get[models.ContactDetail]("RegistrantContact"), o.get[models.ContactDetail]("TechContact"), o.get[scala.Option[java.lang.String]]("IdnLangCode"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectAdminContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectRegistrantContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectTechContact")).mapN(models.RegisterDomainRequest.apply _)
  }
  final implicit val DomainSummaryDecoder: io.circe.Decoder[models.DomainSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("TransferLock"), o.get[scala.Option[java.time.Instant]]("Expiry")).mapN(models.DomainSummary.apply _)
  }
  final implicit val DeleteTagsForDomainResponseDecoder: io.circe.Decoder[models.DeleteTagsForDomainResponse.type] = io.circe.Decoder.decodeUnit.as(models.DeleteTagsForDomainResponse)
  final implicit val GetContactReachabilityStatusResponseDecoder: io.circe.Decoder[models.GetContactReachabilityStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("domainName"), o.get[scala.Option[java.lang.String]]("status")).mapN(models.GetContactReachabilityStatusResponse.apply _)
  }
  final implicit val RenewDomainResponseDecoder: io.circe.Decoder[models.RenewDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.RenewDomainResponse.apply _)
  }
  final implicit val GetDomainDetailResponseDecoder: io.circe.Decoder[models.GetDomainDetailResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.List[models.Nameserver]]("Nameservers"), o.get[models.ContactDetail]("AdminContact"), o.get[models.ContactDetail]("RegistrantContact"), o.get[models.ContactDetail]("TechContact"), o.get[scala.Option[java.lang.String]]("RegistrarName"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("UpdatedDate"), o.get[scala.Option[java.time.Instant]]("ExpirationDate"), o.get[scala.Option[java.lang.String]]("AbuseContactEmail"), o.get[scala.Option[scala.List[java.lang.String]]]("StatusList"), o.get[scala.Option[java.lang.String]]("WhoIsServer"), o.get[scala.Option[java.lang.String]]("AbuseContactPhone"), o.get[scala.Option[java.lang.String]]("DnsSec"), o.get[scala.Option[java.lang.String]]("RegistrarUrl"), o.get[scala.Option[java.lang.String]]("Reseller"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("AdminPrivacy"), o.get[scala.Option[scala.Boolean]]("RegistrantPrivacy"), o.get[scala.Option[scala.Boolean]]("TechPrivacy"), o.get[scala.Option[java.lang.String]]("RegistryDomainId")).mapN(models.GetDomainDetailResponse.apply _)
  }
  final implicit val ViewBillingRequestDecoder: io.circe.Decoder[models.ViewBillingRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("Start"), o.get[scala.Option[java.time.Instant]]("End"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(models.ViewBillingRequest.apply _)
  }
  final implicit val CheckDomainTransferabilityResponseDecoder: io.circe.Decoder[models.CheckDomainTransferabilityResponse] = io.circe.Decoder.instance { o => 
    o.get[models.DomainTransferability]("Transferability").map(models.CheckDomainTransferabilityResponse.apply _)
  }
  final implicit val UpdateDomainNameserversResponseDecoder: io.circe.Decoder[models.UpdateDomainNameserversResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.UpdateDomainNameserversResponse.apply _)
  }
  final implicit val RetrieveDomainAuthCodeRequestDecoder: io.circe.Decoder[models.RetrieveDomainAuthCodeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.RetrieveDomainAuthCodeRequest.apply _)
  }
  final implicit val GetDomainSuggestionsResponseDecoder: io.circe.Decoder[models.GetDomainSuggestionsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.DomainSuggestion]]]("SuggestionsList").map(models.GetDomainSuggestionsResponse.apply _)
  }
  final implicit val TransferDomainRequestDecoder: io.circe.Decoder[models.TransferDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("DurationInYears"), o.get[java.lang.String]("DomainName"), o.get[models.ContactDetail]("AdminContact"), o.get[models.ContactDetail]("RegistrantContact"), o.get[models.ContactDetail]("TechContact"), o.get[scala.Option[scala.List[models.Nameserver]]]("Nameservers"), o.get[scala.Option[java.lang.String]]("IdnLangCode"), o.get[scala.Option[java.lang.String]]("AuthCode"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectAdminContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectRegistrantContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectTechContact")).mapN(models.TransferDomainRequest.apply _)
  }
  final implicit val UpdateTagsForDomainResponseDecoder: io.circe.Decoder[models.UpdateTagsForDomainResponse.type] = io.circe.Decoder.decodeUnit.as(models.UpdateTagsForDomainResponse)
  final implicit val GetDomainDetailRequestDecoder: io.circe.Decoder[models.GetDomainDetailRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.GetDomainDetailRequest.apply _)
  }
  final implicit val ResendContactReachabilityEmailResponseDecoder: io.circe.Decoder[models.ResendContactReachabilityEmailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("domainName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[scala.Boolean]]("isAlreadyVerified")).mapN(models.ResendContactReachabilityEmailResponse.apply _)
  }
  final implicit val ListOperationsResponseDecoder: io.circe.Decoder[models.ListOperationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.OperationSummary]]("Operations"), o.get[scala.Option[java.lang.String]]("NextPageMarker")).mapN(models.ListOperationsResponse.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(models.Tag.apply _)
  }
  final implicit val ListTagsForDomainResponseDecoder: io.circe.Decoder[models.ListTagsForDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.Tag]]("TagList").map(models.ListTagsForDomainResponse.apply _)
  }
  final implicit val ListDomainsResponseDecoder: io.circe.Decoder[models.ListDomainsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[models.DomainSummary]]("Domains"), o.get[scala.Option[java.lang.String]]("NextPageMarker")).mapN(models.ListDomainsResponse.apply _)
  }
  final implicit val DisableDomainTransferLockResponseDecoder: io.circe.Decoder[models.DisableDomainTransferLockResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.DisableDomainTransferLockResponse.apply _)
  }
  final implicit val ContactDetailDecoder: io.circe.Decoder[models.ContactDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ContactType"), o.get[scala.Option[java.lang.String]]("Email"), o.get[scala.Option[java.lang.String]]("PhoneNumber"), o.get[scala.Option[java.lang.String]]("Fax"), o.get[scala.Option[java.lang.String]]("FirstName"), o.get[scala.Option[java.lang.String]]("LastName"), o.get[scala.Option[java.lang.String]]("OrganizationName"), o.get[scala.Option[scala.List[models.ExtraParam]]]("ExtraParams"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("ZipCode"), o.get[scala.Option[java.lang.String]]("CountryCode"), o.get[scala.Option[java.lang.String]]("City"), o.get[scala.Option[java.lang.String]]("AddressLine1"), o.get[scala.Option[java.lang.String]]("AddressLine2")).mapN(models.ContactDetail.apply _)
  }
  final implicit val InvalidInputDecoder: io.circe.Decoder[models.InvalidInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidInput.apply _)
  }
  final implicit val DomainTransferabilityDecoder: io.circe.Decoder[models.DomainTransferability] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Transferable").map(models.DomainTransferability.apply _)
  }
  final implicit val DisableDomainAutoRenewRequestDecoder: io.circe.Decoder[models.DisableDomainAutoRenewRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.DisableDomainAutoRenewRequest.apply _)
  }
  final implicit val DomainLimitExceededDecoder: io.circe.Decoder[models.DomainLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DomainLimitExceeded.apply _)
  }
  final implicit val UpdateDomainContactResponseDecoder: io.circe.Decoder[models.UpdateDomainContactResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.UpdateDomainContactResponse.apply _)
  }
  final implicit val TLDRulesViolationDecoder: io.circe.Decoder[models.TLDRulesViolation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TLDRulesViolation.apply _)
  }
  final implicit val UpdateDomainContactRequestDecoder: io.circe.Decoder[models.UpdateDomainContactRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[models.ContactDetail]]("AdminContact"), o.get[scala.Option[models.ContactDetail]]("RegistrantContact"), o.get[scala.Option[models.ContactDetail]]("TechContact")).mapN(models.UpdateDomainContactRequest.apply _)
  }
  final implicit val EnableDomainTransferLockResponseDecoder: io.circe.Decoder[models.EnableDomainTransferLockResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(models.EnableDomainTransferLockResponse.apply _)
  }
  final implicit val UpdateTagsForDomainRequestDecoder: io.circe.Decoder[models.UpdateTagsForDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.List[models.Tag]]]("TagsToUpdate")).mapN(models.UpdateTagsForDomainRequest.apply _)
  }
  final implicit val CheckDomainAvailabilityResponseDecoder: io.circe.Decoder[models.CheckDomainAvailabilityResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Availability").map(models.CheckDomainAvailabilityResponse.apply _)
  }
  final implicit val ListTagsForDomainRequestDecoder: io.circe.Decoder[models.ListTagsForDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.ListTagsForDomainRequest.apply _)
  }
  final implicit val EnableDomainAutoRenewResponseDecoder: io.circe.Decoder[models.EnableDomainAutoRenewResponse.type] = io.circe.Decoder.decodeUnit.as(models.EnableDomainAutoRenewResponse)
  final implicit val EnableDomainAutoRenewRequestDecoder: io.circe.Decoder[models.EnableDomainAutoRenewRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(models.EnableDomainAutoRenewRequest.apply _)
  }
  final implicit val GetOperationDetailResponseDecoder: io.circe.Decoder[models.GetOperationDetailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("SubmittedDate"), o.get[scala.Option[java.lang.String]]("OperationId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.GetOperationDetailResponse.apply _)
  }
  final implicit val UpdateDomainContactPrivacyRequestDecoder: io.circe.Decoder[models.UpdateDomainContactPrivacyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.Boolean]]("AdminPrivacy"), o.get[scala.Option[scala.Boolean]]("RegistrantPrivacy"), o.get[scala.Option[scala.Boolean]]("TechPrivacy")).mapN(models.UpdateDomainContactPrivacyRequest.apply _)
  }
  final implicit val DisableDomainAutoRenewResponseDecoder: io.circe.Decoder[models.DisableDomainAutoRenewResponse.type] = io.circe.Decoder.decodeUnit.as(models.DisableDomainAutoRenewResponse)
  final implicit val RetrieveDomainAuthCodeResponseDecoder: io.circe.Decoder[models.RetrieveDomainAuthCodeResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AuthCode").map(models.RetrieveDomainAuthCodeResponse.apply _)
  }
}