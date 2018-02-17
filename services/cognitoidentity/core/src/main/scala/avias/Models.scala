package avias.cognitoidentity.models
final case class GetOpenIdTokenForDeveloperIdentityInput(identityPoolId: java.lang.String, logins: scala.collection.immutable.Map[java.lang.String, java.lang.String], identityId: scala.Option[java.lang.String] = scala.None, tokenDuration: scala.Option[scala.Long] = scala.None)
final case class InvalidIdentityPoolConfigurationException(message: scala.Option[java.lang.String] = scala.None)
final case class GetIdInput(identityPoolId: java.lang.String, accountId: scala.Option[java.lang.String] = scala.None, logins: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class LookupDeveloperIdentityInput(identityPoolId: java.lang.String, developerUserIdentifier: scala.Option[java.lang.String] = scala.None, maxResults: scala.Option[scala.Int] = scala.None, identityId: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class Credentials(accessKeyId: scala.Option[java.lang.String] = scala.None, secretKey: scala.Option[java.lang.String] = scala.None, sessionToken: scala.Option[java.lang.String] = scala.None, expiration: scala.Option[java.time.Instant] = scala.None)
final case class ResourceConflictException(message: scala.Option[java.lang.String] = scala.None)
final case class MergeDeveloperIdentitiesInput(sourceUserIdentifier: java.lang.String, destinationUserIdentifier: java.lang.String, developerProviderName: java.lang.String, identityPoolId: java.lang.String)
final case class GetIdentityPoolRolesResponse(identityPoolId: scala.Option[java.lang.String] = scala.None, roles: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, roleMappings: scala.Option[scala.collection.immutable.Map[java.lang.String, avias.cognitoidentity.models.RoleMapping]] = scala.None)
final case class RulesConfigurationType(rules: scala.List[avias.cognitoidentity.models.MappingRule])
final case class UnprocessedIdentityId(identityId: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None)
final case class MappingRule(claim: java.lang.String, matchType: java.lang.String, value: java.lang.String, roleARN: java.lang.String)
final case class CreateIdentityPoolInput(identityPoolName: java.lang.String, allowUnauthenticatedIdentities: scala.Boolean, openIdConnectProviderARNs: scala.Option[scala.List[java.lang.String]] = scala.None, cognitoIdentityProviders: scala.Option[scala.List[avias.cognitoidentity.models.CognitoIdentityProvider]] = scala.None, developerProviderName: scala.Option[java.lang.String] = scala.None, samlProviderARNs: scala.Option[scala.List[java.lang.String]] = scala.None, supportedLoginProviders: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class InternalErrorException(message: scala.Option[java.lang.String] = scala.None)
final case class GetIdResponse(identityId: scala.Option[java.lang.String] = scala.None)
final case class ListIdentitiesResponse(identityPoolId: scala.Option[java.lang.String] = scala.None, identities: scala.Option[scala.List[avias.cognitoidentity.models.IdentityDescription]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DeleteIdentitiesInput(identityIdsToDelete: scala.List[java.lang.String])
final case class RoleMapping(`type`: java.lang.String, ambiguousRoleResolution: scala.Option[java.lang.String] = scala.None, rulesConfiguration: scala.Option[avias.cognitoidentity.models.RulesConfigurationType] = scala.None)
final case class UnlinkIdentityInput(identityId: java.lang.String, logins: scala.collection.immutable.Map[java.lang.String, java.lang.String], loginsToRemove: scala.List[java.lang.String])
final case class IdentityPool(identityPoolName: java.lang.String, identityPoolId: java.lang.String, allowUnauthenticatedIdentities: scala.Boolean, openIdConnectProviderARNs: scala.Option[scala.List[java.lang.String]] = scala.None, cognitoIdentityProviders: scala.Option[scala.List[avias.cognitoidentity.models.CognitoIdentityProvider]] = scala.None, developerProviderName: scala.Option[java.lang.String] = scala.None, samlProviderARNs: scala.Option[scala.List[java.lang.String]] = scala.None, supportedLoginProviders: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)
final case class ResourceNotFoundException(message: scala.Option[java.lang.String] = scala.None)
final case class NotAuthorizedException(message: scala.Option[java.lang.String] = scala.None)
final case class TooManyRequestsException(message: scala.Option[java.lang.String] = scala.None)
final case class ConcurrentModificationException(message: scala.Option[java.lang.String] = scala.None)
final case class ExternalServiceException(message: scala.Option[java.lang.String] = scala.None)
final case class CognitoIdentityProvider(providerName: scala.Option[java.lang.String] = scala.None, clientId: scala.Option[java.lang.String] = scala.None, serverSideTokenCheck: scala.Option[scala.Boolean] = scala.None)
final case class InvalidParameterException(message: scala.Option[java.lang.String] = scala.None)
final case class IdentityDescription(identityId: scala.Option[java.lang.String] = scala.None, logins: scala.Option[scala.List[java.lang.String]] = scala.None, creationDate: scala.Option[java.time.Instant] = scala.None, lastModifiedDate: scala.Option[java.time.Instant] = scala.None)
final case class DeleteIdentityPoolInput(identityPoolId: java.lang.String)
final case class SetIdentityPoolRolesInput(identityPoolId: java.lang.String, roles: scala.collection.immutable.Map[java.lang.String, java.lang.String], roleMappings: scala.Option[scala.collection.immutable.Map[java.lang.String, avias.cognitoidentity.models.RoleMapping]] = scala.None)
final case class GetOpenIdTokenForDeveloperIdentityResponse(identityId: scala.Option[java.lang.String] = scala.None, token: scala.Option[java.lang.String] = scala.None)
final case class DeveloperUserAlreadyRegisteredException(message: scala.Option[java.lang.String] = scala.None)
final case class IdentityPoolShortDescription(identityPoolId: scala.Option[java.lang.String] = scala.None, identityPoolName: scala.Option[java.lang.String] = scala.None)
final case class GetCredentialsForIdentityInput(identityId: java.lang.String, logins: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None, customRoleArn: scala.Option[java.lang.String] = scala.None)
final case class LimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeIdentityPoolInput(identityPoolId: java.lang.String)
final case class ListIdentityPoolsInput(maxResults: scala.Int, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ListIdentitiesInput(identityPoolId: java.lang.String, maxResults: scala.Int, nextToken: scala.Option[java.lang.String] = scala.None, hideDisabled: scala.Option[scala.Boolean] = scala.None)
final case class DescribeIdentityInput(identityId: java.lang.String)
final case class GetCredentialsForIdentityResponse(identityId: scala.Option[java.lang.String] = scala.None, credentials: scala.Option[avias.cognitoidentity.models.Credentials] = scala.None)
final case class LookupDeveloperIdentityResponse(identityId: scala.Option[java.lang.String] = scala.None, developerUserIdentifierList: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class UnlinkDeveloperIdentityInput(identityId: java.lang.String, identityPoolId: java.lang.String, developerProviderName: java.lang.String, developerUserIdentifier: java.lang.String)
final case class ListIdentityPoolsResponse(identityPools: scala.Option[scala.List[avias.cognitoidentity.models.IdentityPoolShortDescription]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class MergeDeveloperIdentitiesResponse(identityId: scala.Option[java.lang.String] = scala.None)
final case class DeleteIdentitiesResponse(unprocessedIdentityIds: scala.Option[scala.List[avias.cognitoidentity.models.UnprocessedIdentityId]] = scala.None)
final case class GetOpenIdTokenResponse(identityId: scala.Option[java.lang.String] = scala.None, token: scala.Option[java.lang.String] = scala.None)
final case class GetIdentityPoolRolesInput(identityPoolId: java.lang.String)
final case class GetOpenIdTokenInput(identityId: java.lang.String, logins: scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]] = scala.None)