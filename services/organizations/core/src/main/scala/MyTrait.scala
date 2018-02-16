package avias.organizations
trait Amazonorganizations[F[_]] {
  def enablePolicyType(input: avias.organizations.models.EnablePolicyTypeRequest): F[avias.organizations.models.EnablePolicyTypeResponse]
  def deleteOrganizationalUnit(input: avias.organizations.models.DeleteOrganizationalUnitRequest): F[scala.Unit]
  def listAWSServiceAccessForOrganization(input: avias.organizations.models.ListAWSServiceAccessForOrganizationRequest): F[avias.organizations.models.ListAWSServiceAccessForOrganizationResponse]
  def listHandshakesForAccount(input: avias.organizations.models.ListHandshakesForAccountRequest): F[avias.organizations.models.ListHandshakesForAccountResponse]
  def listRoots(input: avias.organizations.models.ListRootsRequest): F[avias.organizations.models.ListRootsResponse]
  def detachPolicy(input: avias.organizations.models.DetachPolicyRequest): F[scala.Unit]
  def createPolicy(input: avias.organizations.models.CreatePolicyRequest): F[avias.organizations.models.CreatePolicyResponse]
  def listAccounts(input: avias.organizations.models.ListAccountsRequest): F[avias.organizations.models.ListAccountsResponse]
  def inviteAccountToOrganization(input: avias.organizations.models.InviteAccountToOrganizationRequest): F[avias.organizations.models.InviteAccountToOrganizationResponse]
  def listPolicies(input: avias.organizations.models.ListPoliciesRequest): F[avias.organizations.models.ListPoliciesResponse]
  def cancelHandshake(input: avias.organizations.models.CancelHandshakeRequest): F[avias.organizations.models.CancelHandshakeResponse]
  def enableAWSServiceAccess(input: avias.organizations.models.EnableAWSServiceAccessRequest): F[scala.Unit]
  def removeAccountFromOrganization(input: avias.organizations.models.RemoveAccountFromOrganizationRequest): F[scala.Unit]
  def attachPolicy(input: avias.organizations.models.AttachPolicyRequest): F[scala.Unit]
  def listOrganizationalUnitsForParent(input: avias.organizations.models.ListOrganizationalUnitsForParentRequest): F[avias.organizations.models.ListOrganizationalUnitsForParentResponse]
  def moveAccount(input: avias.organizations.models.MoveAccountRequest): F[scala.Unit]
  def deletePolicy(input: avias.organizations.models.DeletePolicyRequest): F[scala.Unit]
  def describeOrganizationalUnit(input: avias.organizations.models.DescribeOrganizationalUnitRequest): F[avias.organizations.models.DescribeOrganizationalUnitResponse]
  def updatePolicy(input: avias.organizations.models.UpdatePolicyRequest): F[avias.organizations.models.UpdatePolicyResponse]
  def listChildren(input: avias.organizations.models.ListChildrenRequest): F[avias.organizations.models.ListChildrenResponse]
  def listAccountsForParent(input: avias.organizations.models.ListAccountsForParentRequest): F[avias.organizations.models.ListAccountsForParentResponse]
  def disablePolicyType(input: avias.organizations.models.DisablePolicyTypeRequest): F[avias.organizations.models.DisablePolicyTypeResponse]
  def createOrganization(input: avias.organizations.models.CreateOrganizationRequest): F[avias.organizations.models.CreateOrganizationResponse]
  def deleteOrganization: F[scala.Unit]
  def describeAccount(input: avias.organizations.models.DescribeAccountRequest): F[avias.organizations.models.DescribeAccountResponse]
  def createOrganizationalUnit(input: avias.organizations.models.CreateOrganizationalUnitRequest): F[avias.organizations.models.CreateOrganizationalUnitResponse]
  def createAccount(input: avias.organizations.models.CreateAccountRequest): F[avias.organizations.models.CreateAccountResponse]
  def leaveOrganization: F[scala.Unit]
  def describeHandshake(input: avias.organizations.models.DescribeHandshakeRequest): F[avias.organizations.models.DescribeHandshakeResponse]
  def enableAllFeatures: F[avias.organizations.models.EnableAllFeaturesResponse]
  def listParents(input: avias.organizations.models.ListParentsRequest): F[avias.organizations.models.ListParentsResponse]
  def listPoliciesForTarget(input: avias.organizations.models.ListPoliciesForTargetRequest): F[avias.organizations.models.ListPoliciesForTargetResponse]
  def describeCreateAccountStatus(input: avias.organizations.models.DescribeCreateAccountStatusRequest): F[avias.organizations.models.DescribeCreateAccountStatusResponse]
  def listTargetsForPolicy(input: avias.organizations.models.ListTargetsForPolicyRequest): F[avias.organizations.models.ListTargetsForPolicyResponse]
  def acceptHandshake(input: avias.organizations.models.AcceptHandshakeRequest): F[avias.organizations.models.AcceptHandshakeResponse]
  def declineHandshake(input: avias.organizations.models.DeclineHandshakeRequest): F[avias.organizations.models.DeclineHandshakeResponse]
  def disableAWSServiceAccess(input: avias.organizations.models.DisableAWSServiceAccessRequest): F[scala.Unit]
  def updateOrganizationalUnit(input: avias.organizations.models.UpdateOrganizationalUnitRequest): F[avias.organizations.models.UpdateOrganizationalUnitResponse]
  def listHandshakesForOrganization(input: avias.organizations.models.ListHandshakesForOrganizationRequest): F[avias.organizations.models.ListHandshakesForOrganizationResponse]
  def describePolicy(input: avias.organizations.models.DescribePolicyRequest): F[avias.organizations.models.DescribePolicyResponse]
  def describeOrganization: F[avias.organizations.models.DescribeOrganizationResponse]
  def listCreateAccountStatus(input: avias.organizations.models.ListCreateAccountStatusRequest): F[avias.organizations.models.ListCreateAccountStatusResponse]
}