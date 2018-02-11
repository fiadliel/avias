package org.lyranthe.araethura.organizations
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val DuplicateOrganizationalUnitExceptionEncoder: io.circe.Encoder[models.DuplicateOrganizationalUnitException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationalUnitNotFoundExceptionEncoder: io.circe.Encoder[models.OrganizationalUnitNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CancelHandshakeRequestEncoder: io.circe.Encoder[models.CancelHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val DescribeCreateAccountStatusResponseEncoder: io.circe.Encoder[models.DescribeCreateAccountStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatus" -> o.createAccountStatus.asJson)
  }
  final implicit val AccountEncoder: io.circe.Encoder[models.Account] = io.circe.Encoder.instance { o => 
    Json.obj("JoinedTimestamp" -> o.joinedTimestamp.asJson, "JoinedMethod" -> o.joinedMethod.asJson, "Arn" -> o.arn.asJson, "Status" -> o.status.asJson, "Email" -> o.email.asJson, "Name" -> o.name.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ListTargetsForPolicyRequestEncoder: io.circe.Encoder[models.ListTargetsForPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DuplicatePolicyAttachmentExceptionEncoder: io.circe.Encoder[models.DuplicatePolicyAttachmentException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PolicyTargetSummaryEncoder: io.circe.Encoder[models.PolicyTargetSummary] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val HandshakePartyEncoder: io.circe.Encoder[models.HandshakeParty] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListTargetsForPolicyResponseEncoder: io.circe.Encoder[models.ListTargetsForPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val OrganizationalUnitNotEmptyExceptionEncoder: io.circe.Encoder[models.OrganizationalUnitNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MasterCannotLeaveOrganizationExceptionEncoder: io.circe.Encoder[models.MasterCannotLeaveOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InviteAccountToOrganizationRequestEncoder: io.circe.Encoder[models.InviteAccountToOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Target" -> o.target.asJson, "Notes" -> o.notes.asJson)
  }
  final implicit val PolicyTypeNotAvailableForOrganizationExceptionEncoder: io.circe.Encoder[models.PolicyTypeNotAvailableForOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeAccountRequestEncoder: io.circe.Encoder[models.DescribeAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson)
  }
  final implicit val PolicySummaryEncoder: io.circe.Encoder[models.PolicySummary] = io.circe.Encoder.instance { o => 
    Json.obj("AwsManaged" -> o.awsManaged.asJson, "Id" -> o.id.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "Arn" -> o.arn.asJson)
  }
  final implicit val AttachPolicyRequestEncoder: io.circe.Encoder[models.AttachPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "TargetId" -> o.targetId.asJson)
  }
  final implicit val ListParentsResponseEncoder: io.circe.Encoder[models.ListParentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Parents" -> o.parents.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribePolicyResponseEncoder: io.circe.Encoder[models.DescribePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val DescribeOrganizationalUnitRequestEncoder: io.circe.Encoder[models.DescribeOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson)
  }
  final implicit val DeletePolicyRequestEncoder: io.circe.Encoder[models.DeletePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson)
  }
  final implicit val ParentNotFoundExceptionEncoder: io.circe.Encoder[models.ParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationNotEmptyExceptionEncoder: io.circe.Encoder[models.OrganizationNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeclineHandshakeResponseEncoder: io.circe.Encoder[models.DeclineHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val HandshakeAlreadyInStateExceptionEncoder: io.circe.Encoder[models.HandshakeAlreadyInStateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MalformedPolicyDocumentExceptionEncoder: io.circe.Encoder[models.MalformedPolicyDocumentException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateOrganizationalUnitRequestEncoder: io.circe.Encoder[models.CreateOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DuplicatePolicyExceptionEncoder: io.circe.Encoder[models.DuplicatePolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val HandshakeFilterEncoder: io.circe.Encoder[models.HandshakeFilter] = io.circe.Encoder.instance { o => 
    Json.obj("ActionType" -> o.actionType.asJson, "ParentHandshakeId" -> o.parentHandshakeId.asJson)
  }
  final implicit val UpdateOrganizationalUnitRequestEncoder: io.circe.Encoder[models.UpdateOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DuplicateHandshakeExceptionEncoder: io.circe.Encoder[models.DuplicateHandshakeException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidHandshakeTransitionExceptionEncoder: io.circe.Encoder[models.InvalidHandshakeTransitionException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdatePolicyRequestEncoder: io.circe.Encoder[models.UpdatePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Content" -> o.content.asJson)
  }
  final implicit val ListPoliciesResponseEncoder: io.circe.Encoder[models.ListPoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policies" -> o.policies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RootEncoder: io.circe.Encoder[models.Root] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "PolicyTypes" -> o.policyTypes.asJson)
  }
  final implicit val DeleteOrganizationalUnitRequestEncoder: io.circe.Encoder[models.DeleteOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson)
  }
  final implicit val ListRootsRequestEncoder: io.circe.Encoder[models.ListRootsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeCreateAccountStatusRequestEncoder: io.circe.Encoder[models.DescribeCreateAccountStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountRequestId" -> o.createAccountRequestId.asJson)
  }
  final implicit val HandshakeConstraintViolationExceptionEncoder: io.circe.Encoder[models.HandshakeConstraintViolationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val PolicyNotFoundExceptionEncoder: io.circe.Encoder[models.PolicyNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CancelHandshakeResponseEncoder: io.circe.Encoder[models.CancelHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val SourceParentNotFoundExceptionEncoder: io.circe.Encoder[models.SourceParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TargetNotFoundExceptionEncoder: io.circe.Encoder[models.TargetNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateAccountStatusNotFoundExceptionEncoder: io.circe.Encoder[models.CreateAccountStatusNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DisablePolicyTypeResponseEncoder: io.circe.Encoder[models.DisablePolicyTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Root" -> o.root.asJson)
  }
  final implicit val ListOrganizationalUnitsForParentRequestEncoder: io.circe.Encoder[models.ListOrganizationalUnitsForParentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListAccountsResponseEncoder: io.circe.Encoder[models.ListAccountsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Accounts" -> o.accounts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListPoliciesRequestEncoder: io.circe.Encoder[models.ListPoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val EnableAllFeaturesRequestEncoder: io.circe.Encoder[models.EnableAllFeaturesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListHandshakesForOrganizationResponseEncoder: io.circe.Encoder[models.ListHandshakesForOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshakes" -> o.handshakes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val MoveAccountRequestEncoder: io.circe.Encoder[models.MoveAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "SourceParentId" -> o.sourceParentId.asJson, "DestinationParentId" -> o.destinationParentId.asJson)
  }
  final implicit val HandshakeEncoder: io.circe.Encoder[models.Handshake] = io.circe.Encoder.instance { o => 
    Json.obj("RequestedTimestamp" -> o.requestedTimestamp.asJson, "ExpirationTimestamp" -> o.expirationTimestamp.asJson, "Resources" -> o.resources.asJson, "Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Parties" -> o.parties.asJson, "State" -> o.state.asJson, "Action" -> o.action.asJson)
  }
  final implicit val PolicyTypeSummaryEncoder: io.circe.Encoder[models.PolicyTypeSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ListAccountsRequestEncoder: io.circe.Encoder[models.ListAccountsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ChildNotFoundExceptionEncoder: io.circe.Encoder[models.ChildNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListAccountsForParentResponseEncoder: io.circe.Encoder[models.ListAccountsForParentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Accounts" -> o.accounts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PolicyEncoder: io.circe.Encoder[models.Policy] = io.circe.Encoder.instance { o => 
    Json.obj("PolicySummary" -> o.policySummary.asJson, "Content" -> o.content.asJson)
  }
  final implicit val DescribeHandshakeRequestEncoder: io.circe.Encoder[models.DescribeHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val DescribePolicyRequestEncoder: io.circe.Encoder[models.DescribePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson)
  }
  final implicit val CreateAccountStatusEncoder: io.circe.Encoder[models.CreateAccountStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "RequestedTimestamp" -> o.requestedTimestamp.asJson, "CompletedTimestamp" -> o.completedTimestamp.asJson, "State" -> o.state.asJson, "AccountName" -> o.accountName.asJson, "AccountId" -> o.accountId.asJson, "FailureReason" -> o.failureReason.asJson)
  }
  final implicit val UpdatePolicyResponseEncoder: io.circe.Encoder[models.UpdatePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val EnabledServicePrincipalEncoder: io.circe.Encoder[models.EnabledServicePrincipal] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson, "DateEnabled" -> o.dateEnabled.asJson)
  }
  final implicit val DescribeOrganizationResponseEncoder: io.circe.Encoder[models.DescribeOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Organization" -> o.organization.asJson)
  }
  final implicit val DescribeHandshakeResponseEncoder: io.circe.Encoder[models.DescribeHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val DescribeAccountResponseEncoder: io.circe.Encoder[models.DescribeAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Account" -> o.account.asJson)
  }
  final implicit val DisablePolicyTypeRequestEncoder: io.circe.Encoder[models.DisablePolicyTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RootId" -> o.rootId.asJson, "PolicyType" -> o.policyType.asJson)
  }
  final implicit val CreateOrganizationalUnitResponseEncoder: io.circe.Encoder[models.CreateOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val PolicyTypeAlreadyEnabledExceptionEncoder: io.circe.Encoder[models.PolicyTypeAlreadyEnabledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EnablePolicyTypeRequestEncoder: io.circe.Encoder[models.EnablePolicyTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RootId" -> o.rootId.asJson, "PolicyType" -> o.policyType.asJson)
  }
  final implicit val AWSOrganizationsNotInUseExceptionEncoder: io.circe.Encoder[models.AWSOrganizationsNotInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationalUnitEncoder: io.circe.Encoder[models.OrganizationalUnit] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson)
  }
  final implicit val ListAWSServiceAccessForOrganizationResponseEncoder: io.circe.Encoder[models.ListAWSServiceAccessForOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EnabledServicePrincipals" -> o.enabledServicePrincipals.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AcceptHandshakeResponseEncoder: io.circe.Encoder[models.AcceptHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val AlreadyInOrganizationExceptionEncoder: io.circe.Encoder[models.AlreadyInOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForAccountResponseEncoder: io.circe.Encoder[models.ListHandshakesForAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshakes" -> o.handshakes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DetachPolicyRequestEncoder: io.circe.Encoder[models.DetachPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "TargetId" -> o.targetId.asJson)
  }
  final implicit val ListOrganizationalUnitsForParentResponseEncoder: io.circe.Encoder[models.ListOrganizationalUnitsForParentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnits" -> o.organizationalUnits.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InviteAccountToOrganizationResponseEncoder: io.circe.Encoder[models.InviteAccountToOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val AcceptHandshakeRequestEncoder: io.circe.Encoder[models.AcceptHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val CreatePolicyResponseEncoder: io.circe.Encoder[models.CreatePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val AccountNotFoundExceptionEncoder: io.circe.Encoder[models.AccountNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListPoliciesForTargetRequestEncoder: io.circe.Encoder[models.ListPoliciesForTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListPoliciesForTargetResponseEncoder: io.circe.Encoder[models.ListPoliciesForTargetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policies" -> o.policies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ListAccountsForParentRequestEncoder: io.circe.Encoder[models.ListAccountsForParentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeclineHandshakeRequestEncoder: io.circe.Encoder[models.DeclineHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val CreateAccountRequestEncoder: io.circe.Encoder[models.CreateAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Email" -> o.email.asJson, "AccountName" -> o.accountName.asJson, "RoleName" -> o.roleName.asJson, "IamUserAccessToBilling" -> o.iamUserAccessToBilling.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RootNotFoundExceptionEncoder: io.circe.Encoder[models.RootNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PolicyNotAttachedExceptionEncoder: io.circe.Encoder[models.PolicyNotAttachedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListCreateAccountStatusResponseEncoder: io.circe.Encoder[models.ListCreateAccountStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatuses" -> o.createAccountStatuses.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListCreateAccountStatusRequestEncoder: io.circe.Encoder[models.ListCreateAccountStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("States" -> o.states.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val FinalizingOrganizationExceptionEncoder: io.circe.Encoder[models.FinalizingOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateAccountExceptionEncoder: io.circe.Encoder[models.DuplicateAccountException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForAccountRequestEncoder: io.circe.Encoder[models.ListHandshakesForAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DestinationParentNotFoundExceptionEncoder: io.circe.Encoder[models.DestinationParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EnableAllFeaturesResponseEncoder: io.circe.Encoder[models.EnableAllFeaturesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val ListRootsResponseEncoder: io.circe.Encoder[models.ListRootsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Roots" -> o.roots.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateOrganizationResponseEncoder: io.circe.Encoder[models.CreateOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Organization" -> o.organization.asJson)
  }
  final implicit val CreateOrganizationRequestEncoder: io.circe.Encoder[models.CreateOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("FeatureSet" -> o.featureSet.asJson)
  }
  final implicit val ListChildrenRequestEncoder: io.circe.Encoder[models.ListChildrenRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "ChildType" -> o.childType.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val CreatePolicyRequestEncoder: io.circe.Encoder[models.CreatePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Content" -> o.content.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val HandshakeResourceEncoder: io.circe.Encoder[models.HandshakeResource] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Type" -> o.`type`.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val ChildEncoder: io.circe.Encoder[models.Child] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListParentsRequestEncoder: io.circe.Encoder[models.ListParentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ChildId" -> o.childId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DisableAWSServiceAccessRequestEncoder: io.circe.Encoder[models.DisableAWSServiceAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateOrganizationalUnitResponseEncoder: io.circe.Encoder[models.UpdateOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val HandshakeNotFoundExceptionEncoder: io.circe.Encoder[models.HandshakeNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RemoveAccountFromOrganizationRequestEncoder: io.circe.Encoder[models.RemoveAccountFromOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson)
  }
  final implicit val PolicyInUseExceptionEncoder: io.circe.Encoder[models.PolicyInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccessDeniedForDependencyExceptionEncoder: io.circe.Encoder[models.AccessDeniedForDependencyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val DescribeOrganizationalUnitResponseEncoder: io.circe.Encoder[models.DescribeOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val ListAWSServiceAccessForOrganizationRequestEncoder: io.circe.Encoder[models.ListAWSServiceAccessForOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val OrganizationEncoder: io.circe.Encoder[models.Organization] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "MasterAccountArn" -> o.masterAccountArn.asJson, "FeatureSet" -> o.featureSet.asJson, "MasterAccountEmail" -> o.masterAccountEmail.asJson, "AvailablePolicyTypes" -> o.availablePolicyTypes.asJson, "MasterAccountId" -> o.masterAccountId.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ConstraintViolationExceptionEncoder: io.circe.Encoder[models.ConstraintViolationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val EnablePolicyTypeResponseEncoder: io.circe.Encoder[models.EnablePolicyTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Root" -> o.root.asJson)
  }
  final implicit val ListChildrenResponseEncoder: io.circe.Encoder[models.ListChildrenResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Children" -> o.children.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EnableAWSServiceAccessRequestEncoder: io.circe.Encoder[models.EnableAWSServiceAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson)
  }
  final implicit val PolicyTypeNotEnabledExceptionEncoder: io.circe.Encoder[models.PolicyTypeNotEnabledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForOrganizationRequestEncoder: io.circe.Encoder[models.ListHandshakesForOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateAccountResponseEncoder: io.circe.Encoder[models.CreateAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatus" -> o.createAccountStatus.asJson)
  }
  final implicit val ParentEncoder: io.circe.Encoder[models.Parent] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val DuplicateOrganizationalUnitExceptionDecoder: io.circe.Decoder[models.DuplicateOrganizationalUnitException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicateOrganizationalUnitException.apply _)
  }
  final implicit val OrganizationalUnitNotFoundExceptionDecoder: io.circe.Decoder[models.OrganizationalUnitNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.OrganizationalUnitNotFoundException.apply _)
  }
  final implicit val CancelHandshakeRequestDecoder: io.circe.Decoder[models.CancelHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(models.CancelHandshakeRequest.apply _)
  }
  final implicit val DescribeCreateAccountStatusResponseDecoder: io.circe.Decoder[models.DescribeCreateAccountStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.CreateAccountStatus]]("CreateAccountStatus").map(models.DescribeCreateAccountStatusResponse.apply _)
  }
  final implicit val AccountDecoder: io.circe.Decoder[models.Account] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("JoinedTimestamp"), o.get[scala.Option[java.lang.String]]("JoinedMethod"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Email"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Id")).mapN(models.Account.apply _)
  }
  final implicit val ListTargetsForPolicyRequestDecoder: io.circe.Decoder[models.ListTargetsForPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListTargetsForPolicyRequest.apply _)
  }
  final implicit val DuplicatePolicyAttachmentExceptionDecoder: io.circe.Decoder[models.DuplicatePolicyAttachmentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicatePolicyAttachmentException.apply _)
  }
  final implicit val PolicyTargetSummaryDecoder: io.circe.Decoder[models.PolicyTargetSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type")).mapN(models.PolicyTargetSummary.apply _)
  }
  final implicit val HandshakePartyDecoder: io.circe.Decoder[models.HandshakeParty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[java.lang.String]("Type")).mapN(models.HandshakeParty.apply _)
  }
  final implicit val ListTargetsForPolicyResponseDecoder: io.circe.Decoder[models.ListTargetsForPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PolicyTargetSummary]]]("Targets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListTargetsForPolicyResponse.apply _)
  }
  final implicit val OrganizationalUnitNotEmptyExceptionDecoder: io.circe.Decoder[models.OrganizationalUnitNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.OrganizationalUnitNotEmptyException.apply _)
  }
  final implicit val MasterCannotLeaveOrganizationExceptionDecoder: io.circe.Decoder[models.MasterCannotLeaveOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.MasterCannotLeaveOrganizationException.apply _)
  }
  final implicit val InviteAccountToOrganizationRequestDecoder: io.circe.Decoder[models.InviteAccountToOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[models.HandshakeParty]("Target"), o.get[scala.Option[java.lang.String]]("Notes")).mapN(models.InviteAccountToOrganizationRequest.apply _)
  }
  final implicit val PolicyTypeNotAvailableForOrganizationExceptionDecoder: io.circe.Decoder[models.PolicyTypeNotAvailableForOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PolicyTypeNotAvailableForOrganizationException.apply _)
  }
  final implicit val DescribeAccountRequestDecoder: io.circe.Decoder[models.DescribeAccountRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccountId").map(models.DescribeAccountRequest.apply _)
  }
  final implicit val PolicySummaryDecoder: io.circe.Decoder[models.PolicySummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AwsManaged"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Arn")).mapN(models.PolicySummary.apply _)
  }
  final implicit val AttachPolicyRequestDecoder: io.circe.Decoder[models.AttachPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[java.lang.String]("TargetId")).mapN(models.AttachPolicyRequest.apply _)
  }
  final implicit val ListParentsResponseDecoder: io.circe.Decoder[models.ListParentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Parent]]]("Parents"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListParentsResponse.apply _)
  }
  final implicit val DescribePolicyResponseDecoder: io.circe.Decoder[models.DescribePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Policy]]("Policy").map(models.DescribePolicyResponse.apply _)
  }
  final implicit val DescribeOrganizationalUnitRequestDecoder: io.circe.Decoder[models.DescribeOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OrganizationalUnitId").map(models.DescribeOrganizationalUnitRequest.apply _)
  }
  final implicit val DeletePolicyRequestDecoder: io.circe.Decoder[models.DeletePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PolicyId").map(models.DeletePolicyRequest.apply _)
  }
  final implicit val ParentNotFoundExceptionDecoder: io.circe.Decoder[models.ParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ParentNotFoundException.apply _)
  }
  final implicit val OrganizationNotEmptyExceptionDecoder: io.circe.Decoder[models.OrganizationNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.OrganizationNotEmptyException.apply _)
  }
  final implicit val DeclineHandshakeResponseDecoder: io.circe.Decoder[models.DeclineHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Handshake]]("Handshake").map(models.DeclineHandshakeResponse.apply _)
  }
  final implicit val HandshakeAlreadyInStateExceptionDecoder: io.circe.Decoder[models.HandshakeAlreadyInStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.HandshakeAlreadyInStateException.apply _)
  }
  final implicit val MalformedPolicyDocumentExceptionDecoder: io.circe.Decoder[models.MalformedPolicyDocumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.MalformedPolicyDocumentException.apply _)
  }
  final implicit val CreateOrganizationalUnitRequestDecoder: io.circe.Decoder[models.CreateOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[java.lang.String]("Name")).mapN(models.CreateOrganizationalUnitRequest.apply _)
  }
  final implicit val DuplicatePolicyExceptionDecoder: io.circe.Decoder[models.DuplicatePolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicatePolicyException.apply _)
  }
  final implicit val HandshakeFilterDecoder: io.circe.Decoder[models.HandshakeFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionType"), o.get[scala.Option[java.lang.String]]("ParentHandshakeId")).mapN(models.HandshakeFilter.apply _)
  }
  final implicit val UpdateOrganizationalUnitRequestDecoder: io.circe.Decoder[models.UpdateOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OrganizationalUnitId"), o.get[scala.Option[java.lang.String]]("Name")).mapN(models.UpdateOrganizationalUnitRequest.apply _)
  }
  final implicit val DuplicateHandshakeExceptionDecoder: io.circe.Decoder[models.DuplicateHandshakeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicateHandshakeException.apply _)
  }
  final implicit val InvalidHandshakeTransitionExceptionDecoder: io.circe.Decoder[models.InvalidHandshakeTransitionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.InvalidHandshakeTransitionException.apply _)
  }
  final implicit val UpdatePolicyRequestDecoder: io.circe.Decoder[models.UpdatePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Content")).mapN(models.UpdatePolicyRequest.apply _)
  }
  final implicit val ListPoliciesResponseDecoder: io.circe.Decoder[models.ListPoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PolicySummary]]]("Policies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListPoliciesResponse.apply _)
  }
  final implicit val RootDecoder: io.circe.Decoder[models.Root] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[models.PolicyTypeSummary]]]("PolicyTypes")).mapN(models.Root.apply _)
  }
  final implicit val DeleteOrganizationalUnitRequestDecoder: io.circe.Decoder[models.DeleteOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OrganizationalUnitId").map(models.DeleteOrganizationalUnitRequest.apply _)
  }
  final implicit val ListRootsRequestDecoder: io.circe.Decoder[models.ListRootsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListRootsRequest.apply _)
  }
  final implicit val DescribeCreateAccountStatusRequestDecoder: io.circe.Decoder[models.DescribeCreateAccountStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CreateAccountRequestId").map(models.DescribeCreateAccountStatusRequest.apply _)
  }
  final implicit val HandshakeConstraintViolationExceptionDecoder: io.circe.Decoder[models.HandshakeConstraintViolationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.HandshakeConstraintViolationException.apply _)
  }
  final implicit val PolicyNotFoundExceptionDecoder: io.circe.Decoder[models.PolicyNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PolicyNotFoundException.apply _)
  }
  final implicit val CancelHandshakeResponseDecoder: io.circe.Decoder[models.CancelHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Handshake]]("Handshake").map(models.CancelHandshakeResponse.apply _)
  }
  final implicit val SourceParentNotFoundExceptionDecoder: io.circe.Decoder[models.SourceParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.SourceParentNotFoundException.apply _)
  }
  final implicit val TargetNotFoundExceptionDecoder: io.circe.Decoder[models.TargetNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.TargetNotFoundException.apply _)
  }
  final implicit val CreateAccountStatusNotFoundExceptionDecoder: io.circe.Decoder[models.CreateAccountStatusNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.CreateAccountStatusNotFoundException.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.AccessDeniedException.apply _)
  }
  final implicit val DisablePolicyTypeResponseDecoder: io.circe.Decoder[models.DisablePolicyTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Root]]("Root").map(models.DisablePolicyTypeResponse.apply _)
  }
  final implicit val ListOrganizationalUnitsForParentRequestDecoder: io.circe.Decoder[models.ListOrganizationalUnitsForParentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListOrganizationalUnitsForParentRequest.apply _)
  }
  final implicit val ListAccountsResponseDecoder: io.circe.Decoder[models.ListAccountsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Account]]]("Accounts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListAccountsResponse.apply _)
  }
  final implicit val ListPoliciesRequestDecoder: io.circe.Decoder[models.ListPoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListPoliciesRequest.apply _)
  }
  final implicit val EnableAllFeaturesRequestDecoder: io.circe.Decoder[models.EnableAllFeaturesRequest.type] = io.circe.Decoder.decodeUnit.as(models.EnableAllFeaturesRequest)
  final implicit val ListHandshakesForOrganizationResponseDecoder: io.circe.Decoder[models.ListHandshakesForOrganizationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Handshake]]]("Handshakes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListHandshakesForOrganizationResponse.apply _)
  }
  final implicit val MoveAccountRequestDecoder: io.circe.Decoder[models.MoveAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("SourceParentId"), o.get[java.lang.String]("DestinationParentId")).mapN(models.MoveAccountRequest.apply _)
  }
  final implicit val HandshakeDecoder: io.circe.Decoder[models.Handshake] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("RequestedTimestamp"), o.get[scala.Option[java.time.Instant]]("ExpirationTimestamp"), o.get[scala.Option[scala.List[models.HandshakeResource]]]("Resources"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[scala.List[models.HandshakeParty]]]("Parties"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Action")).mapN(models.Handshake.apply _)
  }
  final implicit val PolicyTypeSummaryDecoder: io.circe.Decoder[models.PolicyTypeSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Status")).mapN(models.PolicyTypeSummary.apply _)
  }
  final implicit val ListAccountsRequestDecoder: io.circe.Decoder[models.ListAccountsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListAccountsRequest.apply _)
  }
  final implicit val ChildNotFoundExceptionDecoder: io.circe.Decoder[models.ChildNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ChildNotFoundException.apply _)
  }
  final implicit val ListAccountsForParentResponseDecoder: io.circe.Decoder[models.ListAccountsForParentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Account]]]("Accounts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListAccountsForParentResponse.apply _)
  }
  final implicit val PolicyDecoder: io.circe.Decoder[models.Policy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.PolicySummary]]("PolicySummary"), o.get[scala.Option[java.lang.String]]("Content")).mapN(models.Policy.apply _)
  }
  final implicit val DescribeHandshakeRequestDecoder: io.circe.Decoder[models.DescribeHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(models.DescribeHandshakeRequest.apply _)
  }
  final implicit val DescribePolicyRequestDecoder: io.circe.Decoder[models.DescribePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PolicyId").map(models.DescribePolicyRequest.apply _)
  }
  final implicit val CreateAccountStatusDecoder: io.circe.Decoder[models.CreateAccountStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("RequestedTimestamp"), o.get[scala.Option[java.time.Instant]]("CompletedTimestamp"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("AccountName"), o.get[scala.Option[java.lang.String]]("AccountId"), o.get[scala.Option[java.lang.String]]("FailureReason")).mapN(models.CreateAccountStatus.apply _)
  }
  final implicit val UpdatePolicyResponseDecoder: io.circe.Decoder[models.UpdatePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Policy]]("Policy").map(models.UpdatePolicyResponse.apply _)
  }
  final implicit val EnabledServicePrincipalDecoder: io.circe.Decoder[models.EnabledServicePrincipal] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ServicePrincipal"), o.get[scala.Option[java.time.Instant]]("DateEnabled")).mapN(models.EnabledServicePrincipal.apply _)
  }
  final implicit val DescribeOrganizationResponseDecoder: io.circe.Decoder[models.DescribeOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Organization]]("Organization").map(models.DescribeOrganizationResponse.apply _)
  }
  final implicit val DescribeHandshakeResponseDecoder: io.circe.Decoder[models.DescribeHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Handshake]]("Handshake").map(models.DescribeHandshakeResponse.apply _)
  }
  final implicit val DescribeAccountResponseDecoder: io.circe.Decoder[models.DescribeAccountResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Account]]("Account").map(models.DescribeAccountResponse.apply _)
  }
  final implicit val DisablePolicyTypeRequestDecoder: io.circe.Decoder[models.DisablePolicyTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RootId"), o.get[java.lang.String]("PolicyType")).mapN(models.DisablePolicyTypeRequest.apply _)
  }
  final implicit val CreateOrganizationalUnitResponseDecoder: io.circe.Decoder[models.CreateOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.OrganizationalUnit]]("OrganizationalUnit").map(models.CreateOrganizationalUnitResponse.apply _)
  }
  final implicit val PolicyTypeAlreadyEnabledExceptionDecoder: io.circe.Decoder[models.PolicyTypeAlreadyEnabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PolicyTypeAlreadyEnabledException.apply _)
  }
  final implicit val EnablePolicyTypeRequestDecoder: io.circe.Decoder[models.EnablePolicyTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RootId"), o.get[java.lang.String]("PolicyType")).mapN(models.EnablePolicyTypeRequest.apply _)
  }
  final implicit val AWSOrganizationsNotInUseExceptionDecoder: io.circe.Decoder[models.AWSOrganizationsNotInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.AWSOrganizationsNotInUseException.apply _)
  }
  final implicit val OrganizationalUnitDecoder: io.circe.Decoder[models.OrganizationalUnit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name")).mapN(models.OrganizationalUnit.apply _)
  }
  final implicit val ListAWSServiceAccessForOrganizationResponseDecoder: io.circe.Decoder[models.ListAWSServiceAccessForOrganizationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.EnabledServicePrincipal]]]("EnabledServicePrincipals"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListAWSServiceAccessForOrganizationResponse.apply _)
  }
  final implicit val AcceptHandshakeResponseDecoder: io.circe.Decoder[models.AcceptHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Handshake]]("Handshake").map(models.AcceptHandshakeResponse.apply _)
  }
  final implicit val AlreadyInOrganizationExceptionDecoder: io.circe.Decoder[models.AlreadyInOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.AlreadyInOrganizationException.apply _)
  }
  final implicit val ListHandshakesForAccountResponseDecoder: io.circe.Decoder[models.ListHandshakesForAccountResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Handshake]]]("Handshakes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListHandshakesForAccountResponse.apply _)
  }
  final implicit val DetachPolicyRequestDecoder: io.circe.Decoder[models.DetachPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[java.lang.String]("TargetId")).mapN(models.DetachPolicyRequest.apply _)
  }
  final implicit val ListOrganizationalUnitsForParentResponseDecoder: io.circe.Decoder[models.ListOrganizationalUnitsForParentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.OrganizationalUnit]]]("OrganizationalUnits"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListOrganizationalUnitsForParentResponse.apply _)
  }
  final implicit val InviteAccountToOrganizationResponseDecoder: io.circe.Decoder[models.InviteAccountToOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Handshake]]("Handshake").map(models.InviteAccountToOrganizationResponse.apply _)
  }
  final implicit val AcceptHandshakeRequestDecoder: io.circe.Decoder[models.AcceptHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(models.AcceptHandshakeRequest.apply _)
  }
  final implicit val CreatePolicyResponseDecoder: io.circe.Decoder[models.CreatePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Policy]]("Policy").map(models.CreatePolicyResponse.apply _)
  }
  final implicit val AccountNotFoundExceptionDecoder: io.circe.Decoder[models.AccountNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.AccountNotFoundException.apply _)
  }
  final implicit val ListPoliciesForTargetRequestDecoder: io.circe.Decoder[models.ListPoliciesForTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetId"), o.get[java.lang.String]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListPoliciesForTargetRequest.apply _)
  }
  final implicit val ListPoliciesForTargetResponseDecoder: io.circe.Decoder[models.ListPoliciesForTargetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.PolicySummary]]]("Policies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListPoliciesForTargetResponse.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Message")).mapN(models.TooManyRequestsException.apply _)
  }
  final implicit val ListAccountsForParentRequestDecoder: io.circe.Decoder[models.ListAccountsForParentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListAccountsForParentRequest.apply _)
  }
  final implicit val DeclineHandshakeRequestDecoder: io.circe.Decoder[models.DeclineHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(models.DeclineHandshakeRequest.apply _)
  }
  final implicit val CreateAccountRequestDecoder: io.circe.Decoder[models.CreateAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Email"), o.get[java.lang.String]("AccountName"), o.get[scala.Option[java.lang.String]]("RoleName"), o.get[scala.Option[java.lang.String]]("IamUserAccessToBilling")).mapN(models.CreateAccountRequest.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[models.ServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ServiceException.apply _)
  }
  final implicit val RootNotFoundExceptionDecoder: io.circe.Decoder[models.RootNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.RootNotFoundException.apply _)
  }
  final implicit val PolicyNotAttachedExceptionDecoder: io.circe.Decoder[models.PolicyNotAttachedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PolicyNotAttachedException.apply _)
  }
  final implicit val ListCreateAccountStatusResponseDecoder: io.circe.Decoder[models.ListCreateAccountStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.CreateAccountStatus]]]("CreateAccountStatuses"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListCreateAccountStatusResponse.apply _)
  }
  final implicit val ListCreateAccountStatusRequestDecoder: io.circe.Decoder[models.ListCreateAccountStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("States"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListCreateAccountStatusRequest.apply _)
  }
  final implicit val FinalizingOrganizationExceptionDecoder: io.circe.Decoder[models.FinalizingOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.FinalizingOrganizationException.apply _)
  }
  final implicit val DuplicateAccountExceptionDecoder: io.circe.Decoder[models.DuplicateAccountException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DuplicateAccountException.apply _)
  }
  final implicit val ListHandshakesForAccountRequestDecoder: io.circe.Decoder[models.ListHandshakesForAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.HandshakeFilter]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListHandshakesForAccountRequest.apply _)
  }
  final implicit val DestinationParentNotFoundExceptionDecoder: io.circe.Decoder[models.DestinationParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.DestinationParentNotFoundException.apply _)
  }
  final implicit val EnableAllFeaturesResponseDecoder: io.circe.Decoder[models.EnableAllFeaturesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Handshake]]("Handshake").map(models.EnableAllFeaturesResponse.apply _)
  }
  final implicit val ListRootsResponseDecoder: io.circe.Decoder[models.ListRootsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Root]]]("Roots"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListRootsResponse.apply _)
  }
  final implicit val CreateOrganizationResponseDecoder: io.circe.Decoder[models.CreateOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Organization]]("Organization").map(models.CreateOrganizationResponse.apply _)
  }
  final implicit val CreateOrganizationRequestDecoder: io.circe.Decoder[models.CreateOrganizationRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FeatureSet").map(models.CreateOrganizationRequest.apply _)
  }
  final implicit val ListChildrenRequestDecoder: io.circe.Decoder[models.ListChildrenRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[java.lang.String]("ChildType"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListChildrenRequest.apply _)
  }
  final implicit val CreatePolicyRequestDecoder: io.circe.Decoder[models.CreatePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Content"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type")).mapN(models.CreatePolicyRequest.apply _)
  }
  final implicit val HandshakeResourceDecoder: io.circe.Decoder[models.HandshakeResource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.List[models.HandshakeResource]]]("Resources")).mapN(models.HandshakeResource.apply _)
  }
  final implicit val ChildDecoder: io.circe.Decoder[models.Child] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Type")).mapN(models.Child.apply _)
  }
  final implicit val ListParentsRequestDecoder: io.circe.Decoder[models.ListParentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ChildId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListParentsRequest.apply _)
  }
  final implicit val DisableAWSServiceAccessRequestDecoder: io.circe.Decoder[models.DisableAWSServiceAccessRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServicePrincipal").map(models.DisableAWSServiceAccessRequest.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.InvalidInputException.apply _)
  }
  final implicit val UpdateOrganizationalUnitResponseDecoder: io.circe.Decoder[models.UpdateOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.OrganizationalUnit]]("OrganizationalUnit").map(models.UpdateOrganizationalUnitResponse.apply _)
  }
  final implicit val HandshakeNotFoundExceptionDecoder: io.circe.Decoder[models.HandshakeNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.HandshakeNotFoundException.apply _)
  }
  final implicit val RemoveAccountFromOrganizationRequestDecoder: io.circe.Decoder[models.RemoveAccountFromOrganizationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccountId").map(models.RemoveAccountFromOrganizationRequest.apply _)
  }
  final implicit val PolicyInUseExceptionDecoder: io.circe.Decoder[models.PolicyInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PolicyInUseException.apply _)
  }
  final implicit val AccessDeniedForDependencyExceptionDecoder: io.circe.Decoder[models.AccessDeniedForDependencyException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.AccessDeniedForDependencyException.apply _)
  }
  final implicit val DescribeOrganizationalUnitResponseDecoder: io.circe.Decoder[models.DescribeOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.OrganizationalUnit]]("OrganizationalUnit").map(models.DescribeOrganizationalUnitResponse.apply _)
  }
  final implicit val ListAWSServiceAccessForOrganizationRequestDecoder: io.circe.Decoder[models.ListAWSServiceAccessForOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListAWSServiceAccessForOrganizationRequest.apply _)
  }
  final implicit val OrganizationDecoder: io.circe.Decoder[models.Organization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("MasterAccountArn"), o.get[scala.Option[java.lang.String]]("FeatureSet"), o.get[scala.Option[java.lang.String]]("MasterAccountEmail"), o.get[scala.Option[scala.List[models.PolicyTypeSummary]]]("AvailablePolicyTypes"), o.get[scala.Option[java.lang.String]]("MasterAccountId"), o.get[scala.Option[java.lang.String]]("Id")).mapN(models.Organization.apply _)
  }
  final implicit val ConstraintViolationExceptionDecoder: io.circe.Decoder[models.ConstraintViolationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(models.ConstraintViolationException.apply _)
  }
  final implicit val EnablePolicyTypeResponseDecoder: io.circe.Decoder[models.EnablePolicyTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.Root]]("Root").map(models.EnablePolicyTypeResponse.apply _)
  }
  final implicit val ListChildrenResponseDecoder: io.circe.Decoder[models.ListChildrenResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Child]]]("Children"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListChildrenResponse.apply _)
  }
  final implicit val EnableAWSServiceAccessRequestDecoder: io.circe.Decoder[models.EnableAWSServiceAccessRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServicePrincipal").map(models.EnableAWSServiceAccessRequest.apply _)
  }
  final implicit val PolicyTypeNotEnabledExceptionDecoder: io.circe.Decoder[models.PolicyTypeNotEnabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.PolicyTypeNotEnabledException.apply _)
  }
  final implicit val ListHandshakesForOrganizationRequestDecoder: io.circe.Decoder[models.ListHandshakesForOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[models.HandshakeFilter]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(models.ListHandshakesForOrganizationRequest.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(models.ConcurrentModificationException.apply _)
  }
  final implicit val CreateAccountResponseDecoder: io.circe.Decoder[models.CreateAccountResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.CreateAccountStatus]]("CreateAccountStatus").map(models.CreateAccountResponse.apply _)
  }
  final implicit val ParentDecoder: io.circe.Decoder[models.Parent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Type")).mapN(models.Parent.apply _)
  }
}