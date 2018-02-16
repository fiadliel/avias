package avias.organizations
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val DuplicateOrganizationalUnitExceptionEncoder: io.circe.Encoder[avias.organizations.models.DuplicateOrganizationalUnitException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationalUnitNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.OrganizationalUnitNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CancelHandshakeRequestEncoder: io.circe.Encoder[avias.organizations.models.CancelHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val DescribeCreateAccountStatusResponseEncoder: io.circe.Encoder[avias.organizations.models.DescribeCreateAccountStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatus" -> o.createAccountStatus.asJson)
  }
  final implicit val AccountEncoder: io.circe.Encoder[avias.organizations.models.Account] = io.circe.Encoder.instance { o => 
    Json.obj("JoinedTimestamp" -> o.joinedTimestamp.asJson, "JoinedMethod" -> o.joinedMethod.asJson, "Arn" -> o.arn.asJson, "Status" -> o.status.asJson, "Email" -> o.email.asJson, "Name" -> o.name.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ListTargetsForPolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.ListTargetsForPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DuplicatePolicyAttachmentExceptionEncoder: io.circe.Encoder[avias.organizations.models.DuplicatePolicyAttachmentException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PolicyTargetSummaryEncoder: io.circe.Encoder[avias.organizations.models.PolicyTargetSummary] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val HandshakePartyEncoder: io.circe.Encoder[avias.organizations.models.HandshakeParty] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListTargetsForPolicyResponseEncoder: io.circe.Encoder[avias.organizations.models.ListTargetsForPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Targets" -> o.targets.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val OrganizationalUnitNotEmptyExceptionEncoder: io.circe.Encoder[avias.organizations.models.OrganizationalUnitNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MasterCannotLeaveOrganizationExceptionEncoder: io.circe.Encoder[avias.organizations.models.MasterCannotLeaveOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InviteAccountToOrganizationRequestEncoder: io.circe.Encoder[avias.organizations.models.InviteAccountToOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Target" -> o.target.asJson, "Notes" -> o.notes.asJson)
  }
  final implicit val PolicyTypeNotAvailableForOrganizationExceptionEncoder: io.circe.Encoder[avias.organizations.models.PolicyTypeNotAvailableForOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DescribeAccountRequestEncoder: io.circe.Encoder[avias.organizations.models.DescribeAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson)
  }
  final implicit val PolicySummaryEncoder: io.circe.Encoder[avias.organizations.models.PolicySummary] = io.circe.Encoder.instance { o => 
    Json.obj("AwsManaged" -> o.awsManaged.asJson, "Id" -> o.id.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson, "Arn" -> o.arn.asJson)
  }
  final implicit val AttachPolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.AttachPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "TargetId" -> o.targetId.asJson)
  }
  final implicit val ListParentsResponseEncoder: io.circe.Encoder[avias.organizations.models.ListParentsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Parents" -> o.parents.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribePolicyResponseEncoder: io.circe.Encoder[avias.organizations.models.DescribePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val DescribeOrganizationalUnitRequestEncoder: io.circe.Encoder[avias.organizations.models.DescribeOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson)
  }
  final implicit val DeletePolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.DeletePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson)
  }
  final implicit val ParentNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.ParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationNotEmptyExceptionEncoder: io.circe.Encoder[avias.organizations.models.OrganizationNotEmptyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DeclineHandshakeResponseEncoder: io.circe.Encoder[avias.organizations.models.DeclineHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val HandshakeAlreadyInStateExceptionEncoder: io.circe.Encoder[avias.organizations.models.HandshakeAlreadyInStateException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val MalformedPolicyDocumentExceptionEncoder: io.circe.Encoder[avias.organizations.models.MalformedPolicyDocumentException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateOrganizationalUnitRequestEncoder: io.circe.Encoder[avias.organizations.models.CreateOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DuplicatePolicyExceptionEncoder: io.circe.Encoder[avias.organizations.models.DuplicatePolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val HandshakeFilterEncoder: io.circe.Encoder[avias.organizations.models.HandshakeFilter] = io.circe.Encoder.instance { o => 
    Json.obj("ActionType" -> o.actionType.asJson, "ParentHandshakeId" -> o.parentHandshakeId.asJson)
  }
  final implicit val UpdateOrganizationalUnitRequestEncoder: io.circe.Encoder[avias.organizations.models.UpdateOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DuplicateHandshakeExceptionEncoder: io.circe.Encoder[avias.organizations.models.DuplicateHandshakeException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val InvalidHandshakeTransitionExceptionEncoder: io.circe.Encoder[avias.organizations.models.InvalidHandshakeTransitionException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val UpdatePolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.UpdatePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "Name" -> o.name.asJson, "Description" -> o.description.asJson, "Content" -> o.content.asJson)
  }
  final implicit val ListPoliciesResponseEncoder: io.circe.Encoder[avias.organizations.models.ListPoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policies" -> o.policies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val RootEncoder: io.circe.Encoder[avias.organizations.models.Root] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson, "PolicyTypes" -> o.policyTypes.asJson)
  }
  final implicit val DeleteOrganizationalUnitRequestEncoder: io.circe.Encoder[avias.organizations.models.DeleteOrganizationalUnitRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnitId" -> o.organizationalUnitId.asJson)
  }
  final implicit val ListRootsRequestEncoder: io.circe.Encoder[avias.organizations.models.ListRootsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DescribeCreateAccountStatusRequestEncoder: io.circe.Encoder[avias.organizations.models.DescribeCreateAccountStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountRequestId" -> o.createAccountRequestId.asJson)
  }
  final implicit val HandshakeConstraintViolationExceptionEncoder: io.circe.Encoder[avias.organizations.models.HandshakeConstraintViolationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val PolicyNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.PolicyNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CancelHandshakeResponseEncoder: io.circe.Encoder[avias.organizations.models.CancelHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val SourceParentNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.SourceParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val TargetNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.TargetNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateAccountStatusNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.CreateAccountStatusNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccessDeniedExceptionEncoder: io.circe.Encoder[avias.organizations.models.AccessDeniedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DisablePolicyTypeResponseEncoder: io.circe.Encoder[avias.organizations.models.DisablePolicyTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Root" -> o.root.asJson)
  }
  final implicit val ListOrganizationalUnitsForParentRequestEncoder: io.circe.Encoder[avias.organizations.models.ListOrganizationalUnitsForParentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListAccountsResponseEncoder: io.circe.Encoder[avias.organizations.models.ListAccountsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Accounts" -> o.accounts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListPoliciesRequestEncoder: io.circe.Encoder[avias.organizations.models.ListPoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val EnableAllFeaturesRequestEncoder: io.circe.Encoder[avias.organizations.models.EnableAllFeaturesRequest.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListHandshakesForOrganizationResponseEncoder: io.circe.Encoder[avias.organizations.models.ListHandshakesForOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshakes" -> o.handshakes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val MoveAccountRequestEncoder: io.circe.Encoder[avias.organizations.models.MoveAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson, "SourceParentId" -> o.sourceParentId.asJson, "DestinationParentId" -> o.destinationParentId.asJson)
  }
  final implicit val HandshakeEncoder: io.circe.Encoder[avias.organizations.models.Handshake] = io.circe.Encoder.instance { o => 
    Json.obj("RequestedTimestamp" -> o.requestedTimestamp.asJson, "ExpirationTimestamp" -> o.expirationTimestamp.asJson, "Resources" -> o.resources.asJson, "Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Parties" -> o.parties.asJson, "State" -> o.state.asJson, "Action" -> o.action.asJson)
  }
  final implicit val PolicyTypeSummaryEncoder: io.circe.Encoder[avias.organizations.models.PolicyTypeSummary] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ListAccountsRequestEncoder: io.circe.Encoder[avias.organizations.models.ListAccountsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ChildNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.ChildNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListAccountsForParentResponseEncoder: io.circe.Encoder[avias.organizations.models.ListAccountsForParentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Accounts" -> o.accounts.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val PolicyEncoder: io.circe.Encoder[avias.organizations.models.Policy] = io.circe.Encoder.instance { o => 
    Json.obj("PolicySummary" -> o.policySummary.asJson, "Content" -> o.content.asJson)
  }
  final implicit val DescribeHandshakeRequestEncoder: io.circe.Encoder[avias.organizations.models.DescribeHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val DescribePolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.DescribePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson)
  }
  final implicit val CreateAccountStatusEncoder: io.circe.Encoder[avias.organizations.models.CreateAccountStatus] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "RequestedTimestamp" -> o.requestedTimestamp.asJson, "CompletedTimestamp" -> o.completedTimestamp.asJson, "State" -> o.state.asJson, "AccountName" -> o.accountName.asJson, "AccountId" -> o.accountId.asJson, "FailureReason" -> o.failureReason.asJson)
  }
  final implicit val UpdatePolicyResponseEncoder: io.circe.Encoder[avias.organizations.models.UpdatePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val EnabledServicePrincipalEncoder: io.circe.Encoder[avias.organizations.models.EnabledServicePrincipal] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson, "DateEnabled" -> o.dateEnabled.asJson)
  }
  final implicit val DescribeOrganizationResponseEncoder: io.circe.Encoder[avias.organizations.models.DescribeOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Organization" -> o.organization.asJson)
  }
  final implicit val DescribeHandshakeResponseEncoder: io.circe.Encoder[avias.organizations.models.DescribeHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val DescribeAccountResponseEncoder: io.circe.Encoder[avias.organizations.models.DescribeAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Account" -> o.account.asJson)
  }
  final implicit val DisablePolicyTypeRequestEncoder: io.circe.Encoder[avias.organizations.models.DisablePolicyTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RootId" -> o.rootId.asJson, "PolicyType" -> o.policyType.asJson)
  }
  final implicit val CreateOrganizationalUnitResponseEncoder: io.circe.Encoder[avias.organizations.models.CreateOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val PolicyTypeAlreadyEnabledExceptionEncoder: io.circe.Encoder[avias.organizations.models.PolicyTypeAlreadyEnabledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EnablePolicyTypeRequestEncoder: io.circe.Encoder[avias.organizations.models.EnablePolicyTypeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RootId" -> o.rootId.asJson, "PolicyType" -> o.policyType.asJson)
  }
  final implicit val AWSOrganizationsNotInUseExceptionEncoder: io.circe.Encoder[avias.organizations.models.AWSOrganizationsNotInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val OrganizationalUnitEncoder: io.circe.Encoder[avias.organizations.models.OrganizationalUnit] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Arn" -> o.arn.asJson, "Name" -> o.name.asJson)
  }
  final implicit val ListAWSServiceAccessForOrganizationResponseEncoder: io.circe.Encoder[avias.organizations.models.ListAWSServiceAccessForOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("EnabledServicePrincipals" -> o.enabledServicePrincipals.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AcceptHandshakeResponseEncoder: io.circe.Encoder[avias.organizations.models.AcceptHandshakeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val AlreadyInOrganizationExceptionEncoder: io.circe.Encoder[avias.organizations.models.AlreadyInOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForAccountResponseEncoder: io.circe.Encoder[avias.organizations.models.ListHandshakesForAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshakes" -> o.handshakes.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DetachPolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.DetachPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyId" -> o.policyId.asJson, "TargetId" -> o.targetId.asJson)
  }
  final implicit val ListOrganizationalUnitsForParentResponseEncoder: io.circe.Encoder[avias.organizations.models.ListOrganizationalUnitsForParentResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnits" -> o.organizationalUnits.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InviteAccountToOrganizationResponseEncoder: io.circe.Encoder[avias.organizations.models.InviteAccountToOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val AcceptHandshakeRequestEncoder: io.circe.Encoder[avias.organizations.models.AcceptHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val CreatePolicyResponseEncoder: io.circe.Encoder[avias.organizations.models.CreatePolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val AccountNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.AccountNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListPoliciesForTargetRequestEncoder: io.circe.Encoder[avias.organizations.models.ListPoliciesForTargetRequest] = io.circe.Encoder.instance { o => 
    Json.obj("TargetId" -> o.targetId.asJson, "Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ListPoliciesForTargetResponseEncoder: io.circe.Encoder[avias.organizations.models.ListPoliciesForTargetResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policies" -> o.policies.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[avias.organizations.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "Message" -> o.message.asJson)
  }
  final implicit val ListAccountsForParentRequestEncoder: io.circe.Encoder[avias.organizations.models.ListAccountsForParentRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DeclineHandshakeRequestEncoder: io.circe.Encoder[avias.organizations.models.DeclineHandshakeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("HandshakeId" -> o.handshakeId.asJson)
  }
  final implicit val CreateAccountRequestEncoder: io.circe.Encoder[avias.organizations.models.CreateAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Email" -> o.email.asJson, "AccountName" -> o.accountName.asJson, "RoleName" -> o.roleName.asJson, "IamUserAccessToBilling" -> o.iamUserAccessToBilling.asJson)
  }
  final implicit val ServiceExceptionEncoder: io.circe.Encoder[avias.organizations.models.ServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RootNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.RootNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val PolicyNotAttachedExceptionEncoder: io.circe.Encoder[avias.organizations.models.PolicyNotAttachedException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListCreateAccountStatusResponseEncoder: io.circe.Encoder[avias.organizations.models.ListCreateAccountStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatuses" -> o.createAccountStatuses.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListCreateAccountStatusRequestEncoder: io.circe.Encoder[avias.organizations.models.ListCreateAccountStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("States" -> o.states.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val FinalizingOrganizationExceptionEncoder: io.circe.Encoder[avias.organizations.models.FinalizingOrganizationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val DuplicateAccountExceptionEncoder: io.circe.Encoder[avias.organizations.models.DuplicateAccountException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForAccountRequestEncoder: io.circe.Encoder[avias.organizations.models.ListHandshakesForAccountRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DestinationParentNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.DestinationParentNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val EnableAllFeaturesResponseEncoder: io.circe.Encoder[avias.organizations.models.EnableAllFeaturesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Handshake" -> o.handshake.asJson)
  }
  final implicit val ListRootsResponseEncoder: io.circe.Encoder[avias.organizations.models.ListRootsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Roots" -> o.roots.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateOrganizationResponseEncoder: io.circe.Encoder[avias.organizations.models.CreateOrganizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Organization" -> o.organization.asJson)
  }
  final implicit val CreateOrganizationRequestEncoder: io.circe.Encoder[avias.organizations.models.CreateOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("FeatureSet" -> o.featureSet.asJson)
  }
  final implicit val ListChildrenRequestEncoder: io.circe.Encoder[avias.organizations.models.ListChildrenRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ParentId" -> o.parentId.asJson, "ChildType" -> o.childType.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val CreatePolicyRequestEncoder: io.circe.Encoder[avias.organizations.models.CreatePolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Content" -> o.content.asJson, "Description" -> o.description.asJson, "Name" -> o.name.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val HandshakeResourceEncoder: io.circe.Encoder[avias.organizations.models.HandshakeResource] = io.circe.Encoder.instance { o => 
    Json.obj("Value" -> o.value.asJson, "Type" -> o.`type`.asJson, "Resources" -> o.resources.asJson)
  }
  final implicit val ChildEncoder: io.circe.Encoder[avias.organizations.models.Child] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val ListParentsRequestEncoder: io.circe.Encoder[avias.organizations.models.ListParentsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ChildId" -> o.childId.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val DisableAWSServiceAccessRequestEncoder: io.circe.Encoder[avias.organizations.models.DisableAWSServiceAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson)
  }
  final implicit val InvalidInputExceptionEncoder: io.circe.Encoder[avias.organizations.models.InvalidInputException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val UpdateOrganizationalUnitResponseEncoder: io.circe.Encoder[avias.organizations.models.UpdateOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val HandshakeNotFoundExceptionEncoder: io.circe.Encoder[avias.organizations.models.HandshakeNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val RemoveAccountFromOrganizationRequestEncoder: io.circe.Encoder[avias.organizations.models.RemoveAccountFromOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccountId" -> o.accountId.asJson)
  }
  final implicit val PolicyInUseExceptionEncoder: io.circe.Encoder[avias.organizations.models.PolicyInUseException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val AccessDeniedForDependencyExceptionEncoder: io.circe.Encoder[avias.organizations.models.AccessDeniedForDependencyException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val DescribeOrganizationalUnitResponseEncoder: io.circe.Encoder[avias.organizations.models.DescribeOrganizationalUnitResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OrganizationalUnit" -> o.organizationalUnit.asJson)
  }
  final implicit val ListAWSServiceAccessForOrganizationRequestEncoder: io.circe.Encoder[avias.organizations.models.ListAWSServiceAccessForOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val OrganizationEncoder: io.circe.Encoder[avias.organizations.models.Organization] = io.circe.Encoder.instance { o => 
    Json.obj("Arn" -> o.arn.asJson, "MasterAccountArn" -> o.masterAccountArn.asJson, "FeatureSet" -> o.featureSet.asJson, "MasterAccountEmail" -> o.masterAccountEmail.asJson, "AvailablePolicyTypes" -> o.availablePolicyTypes.asJson, "MasterAccountId" -> o.masterAccountId.asJson, "Id" -> o.id.asJson)
  }
  final implicit val ConstraintViolationExceptionEncoder: io.circe.Encoder[avias.organizations.models.ConstraintViolationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson, "Reason" -> o.reason.asJson)
  }
  final implicit val EnablePolicyTypeResponseEncoder: io.circe.Encoder[avias.organizations.models.EnablePolicyTypeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Root" -> o.root.asJson)
  }
  final implicit val ListChildrenResponseEncoder: io.circe.Encoder[avias.organizations.models.ListChildrenResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Children" -> o.children.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val EnableAWSServiceAccessRequestEncoder: io.circe.Encoder[avias.organizations.models.EnableAWSServiceAccessRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ServicePrincipal" -> o.servicePrincipal.asJson)
  }
  final implicit val PolicyTypeNotEnabledExceptionEncoder: io.circe.Encoder[avias.organizations.models.PolicyTypeNotEnabledException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val ListHandshakesForOrganizationRequestEncoder: io.circe.Encoder[avias.organizations.models.ListHandshakesForOrganizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Filter" -> o.filter.asJson, "NextToken" -> o.nextToken.asJson, "MaxResults" -> o.maxResults.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.organizations.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("Message" -> o.message.asJson)
  }
  final implicit val CreateAccountResponseEncoder: io.circe.Encoder[avias.organizations.models.CreateAccountResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CreateAccountStatus" -> o.createAccountStatus.asJson)
  }
  final implicit val ParentEncoder: io.circe.Encoder[avias.organizations.models.Parent] = io.circe.Encoder.instance { o => 
    Json.obj("Id" -> o.id.asJson, "Type" -> o.`type`.asJson)
  }
  final implicit val DuplicateOrganizationalUnitExceptionDecoder: io.circe.Decoder[avias.organizations.models.DuplicateOrganizationalUnitException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.DuplicateOrganizationalUnitException.apply _)
  }
  final implicit val OrganizationalUnitNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.OrganizationalUnitNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.OrganizationalUnitNotFoundException.apply _)
  }
  final implicit val CancelHandshakeRequestDecoder: io.circe.Decoder[avias.organizations.models.CancelHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(avias.organizations.models.CancelHandshakeRequest.apply _)
  }
  final implicit val DescribeCreateAccountStatusResponseDecoder: io.circe.Decoder[avias.organizations.models.DescribeCreateAccountStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.CreateAccountStatus]]("CreateAccountStatus").map(avias.organizations.models.DescribeCreateAccountStatusResponse.apply _)
  }
  final implicit val AccountDecoder: io.circe.Decoder[avias.organizations.models.Account] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("JoinedTimestamp"), o.get[scala.Option[java.lang.String]]("JoinedMethod"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("Email"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Id")).mapN(avias.organizations.models.Account.apply _)
  }
  final implicit val ListTargetsForPolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.ListTargetsForPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListTargetsForPolicyRequest.apply _)
  }
  final implicit val DuplicatePolicyAttachmentExceptionDecoder: io.circe.Decoder[avias.organizations.models.DuplicatePolicyAttachmentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.DuplicatePolicyAttachmentException.apply _)
  }
  final implicit val PolicyTargetSummaryDecoder: io.circe.Decoder[avias.organizations.models.PolicyTargetSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("TargetId"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.organizations.models.PolicyTargetSummary.apply _)
  }
  final implicit val HandshakePartyDecoder: io.circe.Decoder[avias.organizations.models.HandshakeParty] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Id"), o.get[java.lang.String]("Type")).mapN(avias.organizations.models.HandshakeParty.apply _)
  }
  final implicit val ListTargetsForPolicyResponseDecoder: io.circe.Decoder[avias.organizations.models.ListTargetsForPolicyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.PolicyTargetSummary]]]("Targets"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListTargetsForPolicyResponse.apply _)
  }
  final implicit val OrganizationalUnitNotEmptyExceptionDecoder: io.circe.Decoder[avias.organizations.models.OrganizationalUnitNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.OrganizationalUnitNotEmptyException.apply _)
  }
  final implicit val MasterCannotLeaveOrganizationExceptionDecoder: io.circe.Decoder[avias.organizations.models.MasterCannotLeaveOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.MasterCannotLeaveOrganizationException.apply _)
  }
  final implicit val InviteAccountToOrganizationRequestDecoder: io.circe.Decoder[avias.organizations.models.InviteAccountToOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[avias.organizations.models.HandshakeParty]("Target"), o.get[scala.Option[java.lang.String]]("Notes")).mapN(avias.organizations.models.InviteAccountToOrganizationRequest.apply _)
  }
  final implicit val PolicyTypeNotAvailableForOrganizationExceptionDecoder: io.circe.Decoder[avias.organizations.models.PolicyTypeNotAvailableForOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.PolicyTypeNotAvailableForOrganizationException.apply _)
  }
  final implicit val DescribeAccountRequestDecoder: io.circe.Decoder[avias.organizations.models.DescribeAccountRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccountId").map(avias.organizations.models.DescribeAccountRequest.apply _)
  }
  final implicit val PolicySummaryDecoder: io.circe.Decoder[avias.organizations.models.PolicySummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AwsManaged"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Arn")).mapN(avias.organizations.models.PolicySummary.apply _)
  }
  final implicit val AttachPolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.AttachPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[java.lang.String]("TargetId")).mapN(avias.organizations.models.AttachPolicyRequest.apply _)
  }
  final implicit val ListParentsResponseDecoder: io.circe.Decoder[avias.organizations.models.ListParentsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Parent]]]("Parents"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListParentsResponse.apply _)
  }
  final implicit val DescribePolicyResponseDecoder: io.circe.Decoder[avias.organizations.models.DescribePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Policy]]("Policy").map(avias.organizations.models.DescribePolicyResponse.apply _)
  }
  final implicit val DescribeOrganizationalUnitRequestDecoder: io.circe.Decoder[avias.organizations.models.DescribeOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OrganizationalUnitId").map(avias.organizations.models.DescribeOrganizationalUnitRequest.apply _)
  }
  final implicit val DeletePolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.DeletePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PolicyId").map(avias.organizations.models.DeletePolicyRequest.apply _)
  }
  final implicit val ParentNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.ParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.ParentNotFoundException.apply _)
  }
  final implicit val OrganizationNotEmptyExceptionDecoder: io.circe.Decoder[avias.organizations.models.OrganizationNotEmptyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.OrganizationNotEmptyException.apply _)
  }
  final implicit val DeclineHandshakeResponseDecoder: io.circe.Decoder[avias.organizations.models.DeclineHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Handshake]]("Handshake").map(avias.organizations.models.DeclineHandshakeResponse.apply _)
  }
  final implicit val HandshakeAlreadyInStateExceptionDecoder: io.circe.Decoder[avias.organizations.models.HandshakeAlreadyInStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.HandshakeAlreadyInStateException.apply _)
  }
  final implicit val MalformedPolicyDocumentExceptionDecoder: io.circe.Decoder[avias.organizations.models.MalformedPolicyDocumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.MalformedPolicyDocumentException.apply _)
  }
  final implicit val CreateOrganizationalUnitRequestDecoder: io.circe.Decoder[avias.organizations.models.CreateOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[java.lang.String]("Name")).mapN(avias.organizations.models.CreateOrganizationalUnitRequest.apply _)
  }
  final implicit val DuplicatePolicyExceptionDecoder: io.circe.Decoder[avias.organizations.models.DuplicatePolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.DuplicatePolicyException.apply _)
  }
  final implicit val HandshakeFilterDecoder: io.circe.Decoder[avias.organizations.models.HandshakeFilter] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ActionType"), o.get[scala.Option[java.lang.String]]("ParentHandshakeId")).mapN(avias.organizations.models.HandshakeFilter.apply _)
  }
  final implicit val UpdateOrganizationalUnitRequestDecoder: io.circe.Decoder[avias.organizations.models.UpdateOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OrganizationalUnitId"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.organizations.models.UpdateOrganizationalUnitRequest.apply _)
  }
  final implicit val DuplicateHandshakeExceptionDecoder: io.circe.Decoder[avias.organizations.models.DuplicateHandshakeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.DuplicateHandshakeException.apply _)
  }
  final implicit val InvalidHandshakeTransitionExceptionDecoder: io.circe.Decoder[avias.organizations.models.InvalidHandshakeTransitionException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.InvalidHandshakeTransitionException.apply _)
  }
  final implicit val UpdatePolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.UpdatePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("Content")).mapN(avias.organizations.models.UpdatePolicyRequest.apply _)
  }
  final implicit val ListPoliciesResponseDecoder: io.circe.Decoder[avias.organizations.models.ListPoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.PolicySummary]]]("Policies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListPoliciesResponse.apply _)
  }
  final implicit val RootDecoder: io.circe.Decoder[avias.organizations.models.Root] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[avias.organizations.models.PolicyTypeSummary]]]("PolicyTypes")).mapN(avias.organizations.models.Root.apply _)
  }
  final implicit val DeleteOrganizationalUnitRequestDecoder: io.circe.Decoder[avias.organizations.models.DeleteOrganizationalUnitRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OrganizationalUnitId").map(avias.organizations.models.DeleteOrganizationalUnitRequest.apply _)
  }
  final implicit val ListRootsRequestDecoder: io.circe.Decoder[avias.organizations.models.ListRootsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListRootsRequest.apply _)
  }
  final implicit val DescribeCreateAccountStatusRequestDecoder: io.circe.Decoder[avias.organizations.models.DescribeCreateAccountStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("CreateAccountRequestId").map(avias.organizations.models.DescribeCreateAccountStatusRequest.apply _)
  }
  final implicit val HandshakeConstraintViolationExceptionDecoder: io.circe.Decoder[avias.organizations.models.HandshakeConstraintViolationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.organizations.models.HandshakeConstraintViolationException.apply _)
  }
  final implicit val PolicyNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.PolicyNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.PolicyNotFoundException.apply _)
  }
  final implicit val CancelHandshakeResponseDecoder: io.circe.Decoder[avias.organizations.models.CancelHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Handshake]]("Handshake").map(avias.organizations.models.CancelHandshakeResponse.apply _)
  }
  final implicit val SourceParentNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.SourceParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.SourceParentNotFoundException.apply _)
  }
  final implicit val TargetNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.TargetNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.TargetNotFoundException.apply _)
  }
  final implicit val CreateAccountStatusNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.CreateAccountStatusNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.CreateAccountStatusNotFoundException.apply _)
  }
  final implicit val AccessDeniedExceptionDecoder: io.circe.Decoder[avias.organizations.models.AccessDeniedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.AccessDeniedException.apply _)
  }
  final implicit val DisablePolicyTypeResponseDecoder: io.circe.Decoder[avias.organizations.models.DisablePolicyTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Root]]("Root").map(avias.organizations.models.DisablePolicyTypeResponse.apply _)
  }
  final implicit val ListOrganizationalUnitsForParentRequestDecoder: io.circe.Decoder[avias.organizations.models.ListOrganizationalUnitsForParentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListOrganizationalUnitsForParentRequest.apply _)
  }
  final implicit val ListAccountsResponseDecoder: io.circe.Decoder[avias.organizations.models.ListAccountsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Account]]]("Accounts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListAccountsResponse.apply _)
  }
  final implicit val ListPoliciesRequestDecoder: io.circe.Decoder[avias.organizations.models.ListPoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListPoliciesRequest.apply _)
  }
  final implicit val EnableAllFeaturesRequestDecoder: io.circe.Decoder[avias.organizations.models.EnableAllFeaturesRequest.type] = io.circe.Decoder.decodeUnit.as(avias.organizations.models.EnableAllFeaturesRequest)
  final implicit val ListHandshakesForOrganizationResponseDecoder: io.circe.Decoder[avias.organizations.models.ListHandshakesForOrganizationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Handshake]]]("Handshakes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListHandshakesForOrganizationResponse.apply _)
  }
  final implicit val MoveAccountRequestDecoder: io.circe.Decoder[avias.organizations.models.MoveAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccountId"), o.get[java.lang.String]("SourceParentId"), o.get[java.lang.String]("DestinationParentId")).mapN(avias.organizations.models.MoveAccountRequest.apply _)
  }
  final implicit val HandshakeDecoder: io.circe.Decoder[avias.organizations.models.Handshake] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("RequestedTimestamp"), o.get[scala.Option[java.time.Instant]]("ExpirationTimestamp"), o.get[scala.Option[scala.List[avias.organizations.models.HandshakeResource]]]("Resources"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[scala.List[avias.organizations.models.HandshakeParty]]]("Parties"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("Action")).mapN(avias.organizations.models.Handshake.apply _)
  }
  final implicit val PolicyTypeSummaryDecoder: io.circe.Decoder[avias.organizations.models.PolicyTypeSummary] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.organizations.models.PolicyTypeSummary.apply _)
  }
  final implicit val ListAccountsRequestDecoder: io.circe.Decoder[avias.organizations.models.ListAccountsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListAccountsRequest.apply _)
  }
  final implicit val ChildNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.ChildNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.ChildNotFoundException.apply _)
  }
  final implicit val ListAccountsForParentResponseDecoder: io.circe.Decoder[avias.organizations.models.ListAccountsForParentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Account]]]("Accounts"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListAccountsForParentResponse.apply _)
  }
  final implicit val PolicyDecoder: io.circe.Decoder[avias.organizations.models.Policy] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.organizations.models.PolicySummary]]("PolicySummary"), o.get[scala.Option[java.lang.String]]("Content")).mapN(avias.organizations.models.Policy.apply _)
  }
  final implicit val DescribeHandshakeRequestDecoder: io.circe.Decoder[avias.organizations.models.DescribeHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(avias.organizations.models.DescribeHandshakeRequest.apply _)
  }
  final implicit val DescribePolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.DescribePolicyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("PolicyId").map(avias.organizations.models.DescribePolicyRequest.apply _)
  }
  final implicit val CreateAccountStatusDecoder: io.circe.Decoder[avias.organizations.models.CreateAccountStatus] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.time.Instant]]("RequestedTimestamp"), o.get[scala.Option[java.time.Instant]]("CompletedTimestamp"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("AccountName"), o.get[scala.Option[java.lang.String]]("AccountId"), o.get[scala.Option[java.lang.String]]("FailureReason")).mapN(avias.organizations.models.CreateAccountStatus.apply _)
  }
  final implicit val UpdatePolicyResponseDecoder: io.circe.Decoder[avias.organizations.models.UpdatePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Policy]]("Policy").map(avias.organizations.models.UpdatePolicyResponse.apply _)
  }
  final implicit val EnabledServicePrincipalDecoder: io.circe.Decoder[avias.organizations.models.EnabledServicePrincipal] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ServicePrincipal"), o.get[scala.Option[java.time.Instant]]("DateEnabled")).mapN(avias.organizations.models.EnabledServicePrincipal.apply _)
  }
  final implicit val DescribeOrganizationResponseDecoder: io.circe.Decoder[avias.organizations.models.DescribeOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Organization]]("Organization").map(avias.organizations.models.DescribeOrganizationResponse.apply _)
  }
  final implicit val DescribeHandshakeResponseDecoder: io.circe.Decoder[avias.organizations.models.DescribeHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Handshake]]("Handshake").map(avias.organizations.models.DescribeHandshakeResponse.apply _)
  }
  final implicit val DescribeAccountResponseDecoder: io.circe.Decoder[avias.organizations.models.DescribeAccountResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Account]]("Account").map(avias.organizations.models.DescribeAccountResponse.apply _)
  }
  final implicit val DisablePolicyTypeRequestDecoder: io.circe.Decoder[avias.organizations.models.DisablePolicyTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RootId"), o.get[java.lang.String]("PolicyType")).mapN(avias.organizations.models.DisablePolicyTypeRequest.apply _)
  }
  final implicit val CreateOrganizationalUnitResponseDecoder: io.circe.Decoder[avias.organizations.models.CreateOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.OrganizationalUnit]]("OrganizationalUnit").map(avias.organizations.models.CreateOrganizationalUnitResponse.apply _)
  }
  final implicit val PolicyTypeAlreadyEnabledExceptionDecoder: io.circe.Decoder[avias.organizations.models.PolicyTypeAlreadyEnabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.PolicyTypeAlreadyEnabledException.apply _)
  }
  final implicit val EnablePolicyTypeRequestDecoder: io.circe.Decoder[avias.organizations.models.EnablePolicyTypeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RootId"), o.get[java.lang.String]("PolicyType")).mapN(avias.organizations.models.EnablePolicyTypeRequest.apply _)
  }
  final implicit val AWSOrganizationsNotInUseExceptionDecoder: io.circe.Decoder[avias.organizations.models.AWSOrganizationsNotInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.AWSOrganizationsNotInUseException.apply _)
  }
  final implicit val OrganizationalUnitDecoder: io.circe.Decoder[avias.organizations.models.OrganizationalUnit] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("Name")).mapN(avias.organizations.models.OrganizationalUnit.apply _)
  }
  final implicit val ListAWSServiceAccessForOrganizationResponseDecoder: io.circe.Decoder[avias.organizations.models.ListAWSServiceAccessForOrganizationResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.EnabledServicePrincipal]]]("EnabledServicePrincipals"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListAWSServiceAccessForOrganizationResponse.apply _)
  }
  final implicit val AcceptHandshakeResponseDecoder: io.circe.Decoder[avias.organizations.models.AcceptHandshakeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Handshake]]("Handshake").map(avias.organizations.models.AcceptHandshakeResponse.apply _)
  }
  final implicit val AlreadyInOrganizationExceptionDecoder: io.circe.Decoder[avias.organizations.models.AlreadyInOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.AlreadyInOrganizationException.apply _)
  }
  final implicit val ListHandshakesForAccountResponseDecoder: io.circe.Decoder[avias.organizations.models.ListHandshakesForAccountResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Handshake]]]("Handshakes"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListHandshakesForAccountResponse.apply _)
  }
  final implicit val DetachPolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.DetachPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PolicyId"), o.get[java.lang.String]("TargetId")).mapN(avias.organizations.models.DetachPolicyRequest.apply _)
  }
  final implicit val ListOrganizationalUnitsForParentResponseDecoder: io.circe.Decoder[avias.organizations.models.ListOrganizationalUnitsForParentResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.OrganizationalUnit]]]("OrganizationalUnits"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListOrganizationalUnitsForParentResponse.apply _)
  }
  final implicit val InviteAccountToOrganizationResponseDecoder: io.circe.Decoder[avias.organizations.models.InviteAccountToOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Handshake]]("Handshake").map(avias.organizations.models.InviteAccountToOrganizationResponse.apply _)
  }
  final implicit val AcceptHandshakeRequestDecoder: io.circe.Decoder[avias.organizations.models.AcceptHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(avias.organizations.models.AcceptHandshakeRequest.apply _)
  }
  final implicit val CreatePolicyResponseDecoder: io.circe.Decoder[avias.organizations.models.CreatePolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Policy]]("Policy").map(avias.organizations.models.CreatePolicyResponse.apply _)
  }
  final implicit val AccountNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.AccountNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.AccountNotFoundException.apply _)
  }
  final implicit val ListPoliciesForTargetRequestDecoder: io.circe.Decoder[avias.organizations.models.ListPoliciesForTargetRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TargetId"), o.get[java.lang.String]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListPoliciesForTargetRequest.apply _)
  }
  final implicit val ListPoliciesForTargetResponseDecoder: io.circe.Decoder[avias.organizations.models.ListPoliciesForTargetResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.PolicySummary]]]("Policies"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListPoliciesForTargetResponse.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[avias.organizations.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.organizations.models.TooManyRequestsException.apply _)
  }
  final implicit val ListAccountsForParentRequestDecoder: io.circe.Decoder[avias.organizations.models.ListAccountsForParentRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListAccountsForParentRequest.apply _)
  }
  final implicit val DeclineHandshakeRequestDecoder: io.circe.Decoder[avias.organizations.models.DeclineHandshakeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("HandshakeId").map(avias.organizations.models.DeclineHandshakeRequest.apply _)
  }
  final implicit val CreateAccountRequestDecoder: io.circe.Decoder[avias.organizations.models.CreateAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Email"), o.get[java.lang.String]("AccountName"), o.get[scala.Option[java.lang.String]]("RoleName"), o.get[scala.Option[java.lang.String]]("IamUserAccessToBilling")).mapN(avias.organizations.models.CreateAccountRequest.apply _)
  }
  final implicit val ServiceExceptionDecoder: io.circe.Decoder[avias.organizations.models.ServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.ServiceException.apply _)
  }
  final implicit val RootNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.RootNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.RootNotFoundException.apply _)
  }
  final implicit val PolicyNotAttachedExceptionDecoder: io.circe.Decoder[avias.organizations.models.PolicyNotAttachedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.PolicyNotAttachedException.apply _)
  }
  final implicit val ListCreateAccountStatusResponseDecoder: io.circe.Decoder[avias.organizations.models.ListCreateAccountStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.CreateAccountStatus]]]("CreateAccountStatuses"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListCreateAccountStatusResponse.apply _)
  }
  final implicit val ListCreateAccountStatusRequestDecoder: io.circe.Decoder[avias.organizations.models.ListCreateAccountStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("States"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListCreateAccountStatusRequest.apply _)
  }
  final implicit val FinalizingOrganizationExceptionDecoder: io.circe.Decoder[avias.organizations.models.FinalizingOrganizationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.FinalizingOrganizationException.apply _)
  }
  final implicit val DuplicateAccountExceptionDecoder: io.circe.Decoder[avias.organizations.models.DuplicateAccountException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.DuplicateAccountException.apply _)
  }
  final implicit val ListHandshakesForAccountRequestDecoder: io.circe.Decoder[avias.organizations.models.ListHandshakesForAccountRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.organizations.models.HandshakeFilter]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListHandshakesForAccountRequest.apply _)
  }
  final implicit val DestinationParentNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.DestinationParentNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.DestinationParentNotFoundException.apply _)
  }
  final implicit val EnableAllFeaturesResponseDecoder: io.circe.Decoder[avias.organizations.models.EnableAllFeaturesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Handshake]]("Handshake").map(avias.organizations.models.EnableAllFeaturesResponse.apply _)
  }
  final implicit val ListRootsResponseDecoder: io.circe.Decoder[avias.organizations.models.ListRootsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Root]]]("Roots"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListRootsResponse.apply _)
  }
  final implicit val CreateOrganizationResponseDecoder: io.circe.Decoder[avias.organizations.models.CreateOrganizationResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Organization]]("Organization").map(avias.organizations.models.CreateOrganizationResponse.apply _)
  }
  final implicit val CreateOrganizationRequestDecoder: io.circe.Decoder[avias.organizations.models.CreateOrganizationRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("FeatureSet").map(avias.organizations.models.CreateOrganizationRequest.apply _)
  }
  final implicit val ListChildrenRequestDecoder: io.circe.Decoder[avias.organizations.models.ListChildrenRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ParentId"), o.get[java.lang.String]("ChildType"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListChildrenRequest.apply _)
  }
  final implicit val CreatePolicyRequestDecoder: io.circe.Decoder[avias.organizations.models.CreatePolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Content"), o.get[java.lang.String]("Description"), o.get[java.lang.String]("Name"), o.get[java.lang.String]("Type")).mapN(avias.organizations.models.CreatePolicyRequest.apply _)
  }
  final implicit val HandshakeResourceDecoder: io.circe.Decoder[avias.organizations.models.HandshakeResource] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Value"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[scala.List[avias.organizations.models.HandshakeResource]]]("Resources")).mapN(avias.organizations.models.HandshakeResource.apply _)
  }
  final implicit val ChildDecoder: io.circe.Decoder[avias.organizations.models.Child] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.organizations.models.Child.apply _)
  }
  final implicit val ListParentsRequestDecoder: io.circe.Decoder[avias.organizations.models.ListParentsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ChildId"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListParentsRequest.apply _)
  }
  final implicit val DisableAWSServiceAccessRequestDecoder: io.circe.Decoder[avias.organizations.models.DisableAWSServiceAccessRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServicePrincipal").map(avias.organizations.models.DisableAWSServiceAccessRequest.apply _)
  }
  final implicit val InvalidInputExceptionDecoder: io.circe.Decoder[avias.organizations.models.InvalidInputException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.organizations.models.InvalidInputException.apply _)
  }
  final implicit val UpdateOrganizationalUnitResponseDecoder: io.circe.Decoder[avias.organizations.models.UpdateOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.OrganizationalUnit]]("OrganizationalUnit").map(avias.organizations.models.UpdateOrganizationalUnitResponse.apply _)
  }
  final implicit val HandshakeNotFoundExceptionDecoder: io.circe.Decoder[avias.organizations.models.HandshakeNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.HandshakeNotFoundException.apply _)
  }
  final implicit val RemoveAccountFromOrganizationRequestDecoder: io.circe.Decoder[avias.organizations.models.RemoveAccountFromOrganizationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccountId").map(avias.organizations.models.RemoveAccountFromOrganizationRequest.apply _)
  }
  final implicit val PolicyInUseExceptionDecoder: io.circe.Decoder[avias.organizations.models.PolicyInUseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.PolicyInUseException.apply _)
  }
  final implicit val AccessDeniedForDependencyExceptionDecoder: io.circe.Decoder[avias.organizations.models.AccessDeniedForDependencyException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.organizations.models.AccessDeniedForDependencyException.apply _)
  }
  final implicit val DescribeOrganizationalUnitResponseDecoder: io.circe.Decoder[avias.organizations.models.DescribeOrganizationalUnitResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.OrganizationalUnit]]("OrganizationalUnit").map(avias.organizations.models.DescribeOrganizationalUnitResponse.apply _)
  }
  final implicit val ListAWSServiceAccessForOrganizationRequestDecoder: io.circe.Decoder[avias.organizations.models.ListAWSServiceAccessForOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListAWSServiceAccessForOrganizationRequest.apply _)
  }
  final implicit val OrganizationDecoder: io.circe.Decoder[avias.organizations.models.Organization] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("MasterAccountArn"), o.get[scala.Option[java.lang.String]]("FeatureSet"), o.get[scala.Option[java.lang.String]]("MasterAccountEmail"), o.get[scala.Option[scala.List[avias.organizations.models.PolicyTypeSummary]]]("AvailablePolicyTypes"), o.get[scala.Option[java.lang.String]]("MasterAccountId"), o.get[scala.Option[java.lang.String]]("Id")).mapN(avias.organizations.models.Organization.apply _)
  }
  final implicit val ConstraintViolationExceptionDecoder: io.circe.Decoder[avias.organizations.models.ConstraintViolationException] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Message"), o.get[scala.Option[java.lang.String]]("Reason")).mapN(avias.organizations.models.ConstraintViolationException.apply _)
  }
  final implicit val EnablePolicyTypeResponseDecoder: io.circe.Decoder[avias.organizations.models.EnablePolicyTypeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.Root]]("Root").map(avias.organizations.models.EnablePolicyTypeResponse.apply _)
  }
  final implicit val ListChildrenResponseDecoder: io.circe.Decoder[avias.organizations.models.ListChildrenResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.organizations.models.Child]]]("Children"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.organizations.models.ListChildrenResponse.apply _)
  }
  final implicit val EnableAWSServiceAccessRequestDecoder: io.circe.Decoder[avias.organizations.models.EnableAWSServiceAccessRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("ServicePrincipal").map(avias.organizations.models.EnableAWSServiceAccessRequest.apply _)
  }
  final implicit val PolicyTypeNotEnabledExceptionDecoder: io.circe.Decoder[avias.organizations.models.PolicyTypeNotEnabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.PolicyTypeNotEnabledException.apply _)
  }
  final implicit val ListHandshakesForOrganizationRequestDecoder: io.circe.Decoder[avias.organizations.models.ListHandshakesForOrganizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.organizations.models.HandshakeFilter]]("Filter"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Int]]("MaxResults")).mapN(avias.organizations.models.ListHandshakesForOrganizationRequest.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.organizations.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Message").map(avias.organizations.models.ConcurrentModificationException.apply _)
  }
  final implicit val CreateAccountResponseDecoder: io.circe.Decoder[avias.organizations.models.CreateAccountResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.organizations.models.CreateAccountStatus]]("CreateAccountStatus").map(avias.organizations.models.CreateAccountResponse.apply _)
  }
  final implicit val ParentDecoder: io.circe.Decoder[avias.organizations.models.Parent] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Type")).mapN(avias.organizations.models.Parent.apply _)
  }
}