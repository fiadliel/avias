package avias.cognitoidentity
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val GetOpenIdTokenForDeveloperIdentityInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetOpenIdTokenForDeveloperIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Logins" -> o.logins.asJson, "IdentityId" -> o.identityId.asJson, "TokenDuration" -> o.tokenDuration.asJson)
  }
  final implicit val InvalidIdentityPoolConfigurationExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.InvalidIdentityPoolConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetIdInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "AccountId" -> o.accountId.asJson, "Logins" -> o.logins.asJson)
  }
  final implicit val LookupDeveloperIdentityInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.LookupDeveloperIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "DeveloperUserIdentifier" -> o.developerUserIdentifier.asJson, "MaxResults" -> o.maxResults.asJson, "IdentityId" -> o.identityId.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CredentialsEncoder: io.circe.Encoder[avias.cognitoidentity.models.Credentials] = io.circe.Encoder.instance { o => 
    Json.obj("AccessKeyId" -> o.accessKeyId.asJson, "SecretKey" -> o.secretKey.asJson, "SessionToken" -> o.sessionToken.asJson, "Expiration" -> o.expiration.asJson)
  }
  final implicit val ResourceConflictExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.ResourceConflictException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MergeDeveloperIdentitiesInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.MergeDeveloperIdentitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("SourceUserIdentifier" -> o.sourceUserIdentifier.asJson, "DestinationUserIdentifier" -> o.destinationUserIdentifier.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val GetIdentityPoolRolesResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetIdentityPoolRolesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Roles" -> o.roles.asJson, "RoleMappings" -> o.roleMappings.asJson)
  }
  final implicit val RulesConfigurationTypeEncoder: io.circe.Encoder[avias.cognitoidentity.models.RulesConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("Rules" -> o.rules.asJson)
  }
  final implicit val UnprocessedIdentityIdEncoder: io.circe.Encoder[avias.cognitoidentity.models.UnprocessedIdentityId] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "ErrorCode" -> o.errorCode.asJson)
  }
  final implicit val MappingRuleEncoder: io.circe.Encoder[avias.cognitoidentity.models.MappingRule] = io.circe.Encoder.instance { o => 
    Json.obj("Claim" -> o.claim.asJson, "MatchType" -> o.matchType.asJson, "Value" -> o.value.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val CreateIdentityPoolInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.CreateIdentityPoolInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolName" -> o.identityPoolName.asJson, "AllowUnauthenticatedIdentities" -> o.allowUnauthenticatedIdentities.asJson, "OpenIdConnectProviderARNs" -> o.openIdConnectProviderARNs.asJson, "CognitoIdentityProviders" -> o.cognitoIdentityProviders.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "SamlProviderARNs" -> o.samlProviderARNs.asJson, "SupportedLoginProviders" -> o.supportedLoginProviders.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetIdResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson)
  }
  final implicit val ListIdentitiesResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.ListIdentitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Identities" -> o.identities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteIdentitiesInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.DeleteIdentitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityIdsToDelete" -> o.identityIdsToDelete.asJson)
  }
  final implicit val RoleMappingEncoder: io.circe.Encoder[avias.cognitoidentity.models.RoleMapping] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "AmbiguousRoleResolution" -> o.ambiguousRoleResolution.asJson, "RulesConfiguration" -> o.rulesConfiguration.asJson)
  }
  final implicit val UnlinkIdentityInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.UnlinkIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson, "LoginsToRemove" -> o.loginsToRemove.asJson)
  }
  final implicit val IdentityPoolEncoder: io.circe.Encoder[avias.cognitoidentity.models.IdentityPool] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolName" -> o.identityPoolName.asJson, "IdentityPoolId" -> o.identityPoolId.asJson, "AllowUnauthenticatedIdentities" -> o.allowUnauthenticatedIdentities.asJson, "OpenIdConnectProviderARNs" -> o.openIdConnectProviderARNs.asJson, "CognitoIdentityProviders" -> o.cognitoIdentityProviders.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "SamlProviderARNs" -> o.samlProviderARNs.asJson, "SupportedLoginProviders" -> o.supportedLoginProviders.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val NotAuthorizedExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.NotAuthorizedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExternalServiceExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.ExternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CognitoIdentityProviderEncoder: io.circe.Encoder[avias.cognitoidentity.models.CognitoIdentityProvider] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "ClientId" -> o.clientId.asJson, "ServerSideTokenCheck" -> o.serverSideTokenCheck.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val IdentityDescriptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.IdentityDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson, "CreationDate" -> o.creationDate.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson)
  }
  final implicit val DeleteIdentityPoolInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.DeleteIdentityPoolInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val SetIdentityPoolRolesInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.SetIdentityPoolRolesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Roles" -> o.roles.asJson, "RoleMappings" -> o.roleMappings.asJson)
  }
  final implicit val GetOpenIdTokenForDeveloperIdentityResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetOpenIdTokenForDeveloperIdentityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Token" -> o.token.asJson)
  }
  final implicit val DeveloperUserAlreadyRegisteredExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.DeveloperUserAlreadyRegisteredException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val IdentityPoolShortDescriptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.IdentityPoolShortDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "IdentityPoolName" -> o.identityPoolName.asJson)
  }
  final implicit val GetCredentialsForIdentityInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetCredentialsForIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson, "CustomRoleArn" -> o.customRoleArn.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.cognitoidentity.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeIdentityPoolInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.DescribeIdentityPoolInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val ListIdentityPoolsInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.ListIdentityPoolsInput] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListIdentitiesInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.ListIdentitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson, "HideDisabled" -> o.hideDisabled.asJson)
  }
  final implicit val DescribeIdentityInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.DescribeIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson)
  }
  final implicit val GetCredentialsForIdentityResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetCredentialsForIdentityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Credentials" -> o.credentials.asJson)
  }
  final implicit val LookupDeveloperIdentityResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.LookupDeveloperIdentityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "DeveloperUserIdentifierList" -> o.developerUserIdentifierList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UnlinkDeveloperIdentityInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.UnlinkDeveloperIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "IdentityPoolId" -> o.identityPoolId.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "DeveloperUserIdentifier" -> o.developerUserIdentifier.asJson)
  }
  final implicit val ListIdentityPoolsResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.ListIdentityPoolsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPools" -> o.identityPools.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val MergeDeveloperIdentitiesResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.MergeDeveloperIdentitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson)
  }
  final implicit val DeleteIdentitiesResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.DeleteIdentitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UnprocessedIdentityIds" -> o.unprocessedIdentityIds.asJson)
  }
  final implicit val GetOpenIdTokenResponseEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetOpenIdTokenResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Token" -> o.token.asJson)
  }
  final implicit val GetIdentityPoolRolesInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetIdentityPoolRolesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val GetOpenIdTokenInputEncoder: io.circe.Encoder[avias.cognitoidentity.models.GetOpenIdTokenInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson)
  }
  final implicit val GetOpenIdTokenForDeveloperIdentityInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetOpenIdTokenForDeveloperIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Logins"), o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[scala.Long]]("TokenDuration")).mapN(avias.cognitoidentity.models.GetOpenIdTokenForDeveloperIdentityInput.apply _)
  }
  final implicit val InvalidIdentityPoolConfigurationExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.InvalidIdentityPoolConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.InvalidIdentityPoolConfigurationException.apply _)
  }
  final implicit val GetIdInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetIdInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Option[java.lang.String]]("AccountId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Logins")).mapN(avias.cognitoidentity.models.GetIdInput.apply _)
  }
  final implicit val LookupDeveloperIdentityInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.LookupDeveloperIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Option[java.lang.String]]("DeveloperUserIdentifier"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidentity.models.LookupDeveloperIdentityInput.apply _)
  }
  final implicit val CredentialsDecoder: io.circe.Decoder[avias.cognitoidentity.models.Credentials] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccessKeyId"), o.get[scala.Option[java.lang.String]]("SecretKey"), o.get[scala.Option[java.lang.String]]("SessionToken"), o.get[scala.Option[java.time.Instant]]("Expiration")).mapN(avias.cognitoidentity.models.Credentials.apply _)
  }
  final implicit val ResourceConflictExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.ResourceConflictException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.ResourceConflictException.apply _)
  }
  final implicit val MergeDeveloperIdentitiesInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.MergeDeveloperIdentitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SourceUserIdentifier"), o.get[java.lang.String]("DestinationUserIdentifier"), o.get[java.lang.String]("DeveloperProviderName"), o.get[java.lang.String]("IdentityPoolId")).mapN(avias.cognitoidentity.models.MergeDeveloperIdentitiesInput.apply _)
  }
  final implicit val GetIdentityPoolRolesResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetIdentityPoolRolesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Roles"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.cognitoidentity.models.RoleMapping]]]("RoleMappings")).mapN(avias.cognitoidentity.models.GetIdentityPoolRolesResponse.apply _)
  }
  final implicit val RulesConfigurationTypeDecoder: io.circe.Decoder[avias.cognitoidentity.models.RulesConfigurationType] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.cognitoidentity.models.MappingRule]]("Rules").map(avias.cognitoidentity.models.RulesConfigurationType.apply _)
  }
  final implicit val UnprocessedIdentityIdDecoder: io.circe.Decoder[avias.cognitoidentity.models.UnprocessedIdentityId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("ErrorCode")).mapN(avias.cognitoidentity.models.UnprocessedIdentityId.apply _)
  }
  final implicit val MappingRuleDecoder: io.circe.Decoder[avias.cognitoidentity.models.MappingRule] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Claim"), o.get[java.lang.String]("MatchType"), o.get[java.lang.String]("Value"), o.get[java.lang.String]("RoleARN")).mapN(avias.cognitoidentity.models.MappingRule.apply _)
  }
  final implicit val CreateIdentityPoolInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.CreateIdentityPoolInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolName"), o.get[scala.Boolean]("AllowUnauthenticatedIdentities"), o.get[scala.Option[scala.List[java.lang.String]]]("OpenIdConnectProviderARNs"), o.get[scala.Option[scala.List[avias.cognitoidentity.models.CognitoIdentityProvider]]]("CognitoIdentityProviders"), o.get[scala.Option[java.lang.String]]("DeveloperProviderName"), o.get[scala.Option[scala.List[java.lang.String]]]("SamlProviderARNs"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("SupportedLoginProviders")).mapN(avias.cognitoidentity.models.CreateIdentityPoolInput.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.InternalErrorException.apply _)
  }
  final implicit val GetIdResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetIdResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("IdentityId").map(avias.cognitoidentity.models.GetIdResponse.apply _)
  }
  final implicit val ListIdentitiesResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.ListIdentitiesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityPoolId"), o.get[scala.Option[scala.List[avias.cognitoidentity.models.IdentityDescription]]]("Identities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidentity.models.ListIdentitiesResponse.apply _)
  }
  final implicit val DeleteIdentitiesInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.DeleteIdentitiesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("IdentityIdsToDelete").map(avias.cognitoidentity.models.DeleteIdentitiesInput.apply _)
  }
  final implicit val RoleMappingDecoder: io.circe.Decoder[avias.cognitoidentity.models.RoleMapping] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Type"), o.get[scala.Option[java.lang.String]]("AmbiguousRoleResolution"), o.get[scala.Option[avias.cognitoidentity.models.RulesConfigurationType]]("RulesConfiguration")).mapN(avias.cognitoidentity.models.RoleMapping.apply _)
  }
  final implicit val UnlinkIdentityInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.UnlinkIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Logins"), o.get[scala.List[java.lang.String]]("LoginsToRemove")).mapN(avias.cognitoidentity.models.UnlinkIdentityInput.apply _)
  }
  final implicit val IdentityPoolDecoder: io.circe.Decoder[avias.cognitoidentity.models.IdentityPool] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolName"), o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Boolean]("AllowUnauthenticatedIdentities"), o.get[scala.Option[scala.List[java.lang.String]]]("OpenIdConnectProviderARNs"), o.get[scala.Option[scala.List[avias.cognitoidentity.models.CognitoIdentityProvider]]]("CognitoIdentityProviders"), o.get[scala.Option[java.lang.String]]("DeveloperProviderName"), o.get[scala.Option[scala.List[java.lang.String]]]("SamlProviderARNs"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("SupportedLoginProviders")).mapN(avias.cognitoidentity.models.IdentityPool.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.ResourceNotFoundException.apply _)
  }
  final implicit val NotAuthorizedExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.NotAuthorizedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.NotAuthorizedException.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.TooManyRequestsException.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.ConcurrentModificationException.apply _)
  }
  final implicit val ExternalServiceExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.ExternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.ExternalServiceException.apply _)
  }
  final implicit val CognitoIdentityProviderDecoder: io.circe.Decoder[avias.cognitoidentity.models.CognitoIdentityProvider] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[scala.Boolean]]("ServerSideTokenCheck")).mapN(avias.cognitoidentity.models.CognitoIdentityProvider.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.InvalidParameterException.apply _)
  }
  final implicit val IdentityDescriptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.IdentityDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[scala.List[java.lang.String]]]("Logins"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate")).mapN(avias.cognitoidentity.models.IdentityDescription.apply _)
  }
  final implicit val DeleteIdentityPoolInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.DeleteIdentityPoolInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityPoolId").map(avias.cognitoidentity.models.DeleteIdentityPoolInput.apply _)
  }
  final implicit val SetIdentityPoolRolesInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.SetIdentityPoolRolesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Roles"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, avias.cognitoidentity.models.RoleMapping]]]("RoleMappings")).mapN(avias.cognitoidentity.models.SetIdentityPoolRolesInput.apply _)
  }
  final implicit val GetOpenIdTokenForDeveloperIdentityResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetOpenIdTokenForDeveloperIdentityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("Token")).mapN(avias.cognitoidentity.models.GetOpenIdTokenForDeveloperIdentityResponse.apply _)
  }
  final implicit val DeveloperUserAlreadyRegisteredExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.DeveloperUserAlreadyRegisteredException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.DeveloperUserAlreadyRegisteredException.apply _)
  }
  final implicit val IdentityPoolShortDescriptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.IdentityPoolShortDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityPoolId"), o.get[scala.Option[java.lang.String]]("IdentityPoolName")).mapN(avias.cognitoidentity.models.IdentityPoolShortDescription.apply _)
  }
  final implicit val GetCredentialsForIdentityInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetCredentialsForIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Logins"), o.get[scala.Option[java.lang.String]]("CustomRoleArn")).mapN(avias.cognitoidentity.models.GetCredentialsForIdentityInput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.cognitoidentity.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidentity.models.LimitExceededException.apply _)
  }
  final implicit val DescribeIdentityPoolInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.DescribeIdentityPoolInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityPoolId").map(avias.cognitoidentity.models.DescribeIdentityPoolInput.apply _)
  }
  final implicit val ListIdentityPoolsInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.ListIdentityPoolsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidentity.models.ListIdentityPoolsInput.apply _)
  }
  final implicit val ListIdentitiesInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.ListIdentitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Boolean]]("HideDisabled")).mapN(avias.cognitoidentity.models.ListIdentitiesInput.apply _)
  }
  final implicit val DescribeIdentityInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.DescribeIdentityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityId").map(avias.cognitoidentity.models.DescribeIdentityInput.apply _)
  }
  final implicit val GetCredentialsForIdentityResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetCredentialsForIdentityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[avias.cognitoidentity.models.Credentials]]("Credentials")).mapN(avias.cognitoidentity.models.GetCredentialsForIdentityResponse.apply _)
  }
  final implicit val LookupDeveloperIdentityResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.LookupDeveloperIdentityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[scala.List[java.lang.String]]]("DeveloperUserIdentifierList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidentity.models.LookupDeveloperIdentityResponse.apply _)
  }
  final implicit val UnlinkDeveloperIdentityInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.UnlinkDeveloperIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[java.lang.String]("IdentityPoolId"), o.get[java.lang.String]("DeveloperProviderName"), o.get[java.lang.String]("DeveloperUserIdentifier")).mapN(avias.cognitoidentity.models.UnlinkDeveloperIdentityInput.apply _)
  }
  final implicit val ListIdentityPoolsResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.ListIdentityPoolsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidentity.models.IdentityPoolShortDescription]]]("IdentityPools"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidentity.models.ListIdentityPoolsResponse.apply _)
  }
  final implicit val MergeDeveloperIdentitiesResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.MergeDeveloperIdentitiesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("IdentityId").map(avias.cognitoidentity.models.MergeDeveloperIdentitiesResponse.apply _)
  }
  final implicit val DeleteIdentitiesResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.DeleteIdentitiesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.cognitoidentity.models.UnprocessedIdentityId]]]("UnprocessedIdentityIds").map(avias.cognitoidentity.models.DeleteIdentitiesResponse.apply _)
  }
  final implicit val GetOpenIdTokenResponseDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetOpenIdTokenResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("Token")).mapN(avias.cognitoidentity.models.GetOpenIdTokenResponse.apply _)
  }
  final implicit val GetIdentityPoolRolesInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetIdentityPoolRolesInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityPoolId").map(avias.cognitoidentity.models.GetIdentityPoolRolesInput.apply _)
  }
  final implicit val GetOpenIdTokenInputDecoder: io.circe.Decoder[avias.cognitoidentity.models.GetOpenIdTokenInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Logins")).mapN(avias.cognitoidentity.models.GetOpenIdTokenInput.apply _)
  }
}