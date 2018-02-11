package org.lyranthe.araethura.cognitoidentity
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val GetOpenIdTokenForDeveloperIdentityInputEncoder: io.circe.Encoder[models.GetOpenIdTokenForDeveloperIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Logins" -> o.logins.asJson, "IdentityId" -> o.identityId.asJson, "TokenDuration" -> o.tokenDuration.asJson)
  }
  final implicit val InvalidIdentityPoolConfigurationExceptionEncoder: io.circe.Encoder[models.InvalidIdentityPoolConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdInputEncoder: io.circe.Encoder[models.GetIdInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "AccountId" -> o.accountId.asJson, "Logins" -> o.logins.asJson)
  }
  final implicit val LookupDeveloperIdentityInputEncoder: io.circe.Encoder[models.LookupDeveloperIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "DeveloperUserIdentifier" -> o.developerUserIdentifier.asJson, "MaxResults" -> o.maxResults.asJson, "IdentityId" -> o.identityId.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CredentialsEncoder: io.circe.Encoder[models.Credentials] = io.circe.Encoder.instance { o => 
    Json.obj("AccessKeyId" -> o.accessKeyId.asJson, "SecretKey" -> o.secretKey.asJson, "SessionToken" -> o.sessionToken.asJson, "Expiration" -> o.expiration.asJson)
  }
  final implicit val ResourceConflictExceptionEncoder: io.circe.Encoder[models.ResourceConflictException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MergeDeveloperIdentitiesInputEncoder: io.circe.Encoder[models.MergeDeveloperIdentitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("SourceUserIdentifier" -> o.sourceUserIdentifier.asJson, "DestinationUserIdentifier" -> o.destinationUserIdentifier.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val GetIdentityPoolRolesResponseEncoder: io.circe.Encoder[models.GetIdentityPoolRolesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Roles" -> o.roles.asJson, "RoleMappings" -> o.roleMappings.asJson)
  }
  final implicit val RulesConfigurationTypeEncoder: io.circe.Encoder[models.RulesConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("Rules" -> o.rules.asJson)
  }
  final implicit val UnprocessedIdentityIdEncoder: io.circe.Encoder[models.UnprocessedIdentityId] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "ErrorCode" -> o.errorCode.asJson)
  }
  final implicit val MappingRuleEncoder: io.circe.Encoder[models.MappingRule] = io.circe.Encoder.instance { o => 
    Json.obj("Claim" -> o.claim.asJson, "MatchType" -> o.matchType.asJson, "Value" -> o.value.asJson, "RoleARN" -> o.roleARN.asJson)
  }
  final implicit val CreateIdentityPoolInputEncoder: io.circe.Encoder[models.CreateIdentityPoolInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolName" -> o.identityPoolName.asJson, "AllowUnauthenticatedIdentities" -> o.allowUnauthenticatedIdentities.asJson, "OpenIdConnectProviderARNs" -> o.openIdConnectProviderARNs.asJson, "CognitoIdentityProviders" -> o.cognitoIdentityProviders.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "SamlProviderARNs" -> o.samlProviderARNs.asJson, "SupportedLoginProviders" -> o.supportedLoginProviders.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdResponseEncoder: io.circe.Encoder[models.GetIdResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson)
  }
  final implicit val ListIdentitiesResponseEncoder: io.circe.Encoder[models.ListIdentitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Identities" -> o.identities.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteIdentitiesInputEncoder: io.circe.Encoder[models.DeleteIdentitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityIdsToDelete" -> o.identityIdsToDelete.asJson)
  }
  final implicit val RoleMappingEncoder: io.circe.Encoder[models.RoleMapping] = io.circe.Encoder.instance { o => 
    Json.obj("Type" -> o.`type`.asJson, "AmbiguousRoleResolution" -> o.ambiguousRoleResolution.asJson, "RulesConfiguration" -> o.rulesConfiguration.asJson)
  }
  final implicit val UnlinkIdentityInputEncoder: io.circe.Encoder[models.UnlinkIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson, "LoginsToRemove" -> o.loginsToRemove.asJson)
  }
  final implicit val IdentityPoolEncoder: io.circe.Encoder[models.IdentityPool] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolName" -> o.identityPoolName.asJson, "IdentityPoolId" -> o.identityPoolId.asJson, "AllowUnauthenticatedIdentities" -> o.allowUnauthenticatedIdentities.asJson, "OpenIdConnectProviderARNs" -> o.openIdConnectProviderARNs.asJson, "CognitoIdentityProviders" -> o.cognitoIdentityProviders.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "SamlProviderARNs" -> o.samlProviderARNs.asJson, "SupportedLoginProviders" -> o.supportedLoginProviders.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val NotAuthorizedExceptionEncoder: io.circe.Encoder[models.NotAuthorizedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExternalServiceExceptionEncoder: io.circe.Encoder[models.ExternalServiceException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CognitoIdentityProviderEncoder: io.circe.Encoder[models.CognitoIdentityProvider] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "ClientId" -> o.clientId.asJson, "ServerSideTokenCheck" -> o.serverSideTokenCheck.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val IdentityDescriptionEncoder: io.circe.Encoder[models.IdentityDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson, "CreationDate" -> o.creationDate.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson)
  }
  final implicit val DeleteIdentityPoolInputEncoder: io.circe.Encoder[models.DeleteIdentityPoolInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val SetIdentityPoolRolesInputEncoder: io.circe.Encoder[models.SetIdentityPoolRolesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "Roles" -> o.roles.asJson, "RoleMappings" -> o.roleMappings.asJson)
  }
  final implicit val GetOpenIdTokenForDeveloperIdentityResponseEncoder: io.circe.Encoder[models.GetOpenIdTokenForDeveloperIdentityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Token" -> o.token.asJson)
  }
  final implicit val DeveloperUserAlreadyRegisteredExceptionEncoder: io.circe.Encoder[models.DeveloperUserAlreadyRegisteredException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val IdentityPoolShortDescriptionEncoder: io.circe.Encoder[models.IdentityPoolShortDescription] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "IdentityPoolName" -> o.identityPoolName.asJson)
  }
  final implicit val GetCredentialsForIdentityInputEncoder: io.circe.Encoder[models.GetCredentialsForIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson, "CustomRoleArn" -> o.customRoleArn.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeIdentityPoolInputEncoder: io.circe.Encoder[models.DescribeIdentityPoolInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val ListIdentityPoolsInputEncoder: io.circe.Encoder[models.ListIdentityPoolsInput] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ListIdentitiesInputEncoder: io.circe.Encoder[models.ListIdentitiesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson, "HideDisabled" -> o.hideDisabled.asJson)
  }
  final implicit val DescribeIdentityInputEncoder: io.circe.Encoder[models.DescribeIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson)
  }
  final implicit val GetCredentialsForIdentityResponseEncoder: io.circe.Encoder[models.GetCredentialsForIdentityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Credentials" -> o.credentials.asJson)
  }
  final implicit val LookupDeveloperIdentityResponseEncoder: io.circe.Encoder[models.LookupDeveloperIdentityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "DeveloperUserIdentifierList" -> o.developerUserIdentifierList.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UnlinkDeveloperIdentityInputEncoder: io.circe.Encoder[models.UnlinkDeveloperIdentityInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "IdentityPoolId" -> o.identityPoolId.asJson, "DeveloperProviderName" -> o.developerProviderName.asJson, "DeveloperUserIdentifier" -> o.developerUserIdentifier.asJson)
  }
  final implicit val ListIdentityPoolsResponseEncoder: io.circe.Encoder[models.ListIdentityPoolsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPools" -> o.identityPools.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val MergeDeveloperIdentitiesResponseEncoder: io.circe.Encoder[models.MergeDeveloperIdentitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson)
  }
  final implicit val DeleteIdentitiesResponseEncoder: io.circe.Encoder[models.DeleteIdentitiesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UnprocessedIdentityIds" -> o.unprocessedIdentityIds.asJson)
  }
  final implicit val GetOpenIdTokenResponseEncoder: io.circe.Encoder[models.GetOpenIdTokenResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Token" -> o.token.asJson)
  }
  final implicit val GetIdentityPoolRolesInputEncoder: io.circe.Encoder[models.GetIdentityPoolRolesInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityPoolId" -> o.identityPoolId.asJson)
  }
  final implicit val GetOpenIdTokenInputEncoder: io.circe.Encoder[models.GetOpenIdTokenInput] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityId" -> o.identityId.asJson, "Logins" -> o.logins.asJson)
  }
  final implicit val GetOpenIdTokenForDeveloperIdentityInputDecoder: io.circe.Decoder[models.GetOpenIdTokenForDeveloperIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Logins"), o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[scala.Long]]("TokenDuration")).mapN(models.GetOpenIdTokenForDeveloperIdentityInput.apply _)
  }
  final implicit val InvalidIdentityPoolConfigurationExceptionDecoder: io.circe.Decoder[models.InvalidIdentityPoolConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidIdentityPoolConfigurationException.apply _)
  }
  final implicit val GetIdInputDecoder: io.circe.Decoder[models.GetIdInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Option[java.lang.String]]("AccountId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Logins")).mapN(models.GetIdInput.apply _)
  }
  final implicit val LookupDeveloperIdentityInputDecoder: io.circe.Decoder[models.LookupDeveloperIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Option[java.lang.String]]("DeveloperUserIdentifier"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.LookupDeveloperIdentityInput.apply _)
  }
  final implicit val CredentialsDecoder: io.circe.Decoder[models.Credentials] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccessKeyId"), o.get[scala.Option[java.lang.String]]("SecretKey"), o.get[scala.Option[java.lang.String]]("SessionToken"), o.get[scala.Option[java.time.Instant]]("Expiration")).mapN(models.Credentials.apply _)
  }
  final implicit val ResourceConflictExceptionDecoder: io.circe.Decoder[models.ResourceConflictException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceConflictException.apply _)
  }
  final implicit val MergeDeveloperIdentitiesInputDecoder: io.circe.Decoder[models.MergeDeveloperIdentitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SourceUserIdentifier"), o.get[java.lang.String]("DestinationUserIdentifier"), o.get[java.lang.String]("DeveloperProviderName"), o.get[java.lang.String]("IdentityPoolId")).mapN(models.MergeDeveloperIdentitiesInput.apply _)
  }
  final implicit val GetIdentityPoolRolesResponseDecoder: io.circe.Decoder[models.GetIdentityPoolRolesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Roles"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.RoleMapping]]]("RoleMappings")).mapN(models.GetIdentityPoolRolesResponse.apply _)
  }
  final implicit val RulesConfigurationTypeDecoder: io.circe.Decoder[models.RulesConfigurationType] = io.circe.Decoder.instance { o => 
    o.get[scala.List[models.MappingRule]]("Rules").map(models.RulesConfigurationType.apply _)
  }
  final implicit val UnprocessedIdentityIdDecoder: io.circe.Decoder[models.UnprocessedIdentityId] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("ErrorCode")).mapN(models.UnprocessedIdentityId.apply _)
  }
  final implicit val MappingRuleDecoder: io.circe.Decoder[models.MappingRule] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Claim"), o.get[java.lang.String]("MatchType"), o.get[java.lang.String]("Value"), o.get[java.lang.String]("RoleARN")).mapN(models.MappingRule.apply _)
  }
  final implicit val CreateIdentityPoolInputDecoder: io.circe.Decoder[models.CreateIdentityPoolInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolName"), o.get[scala.Boolean]("AllowUnauthenticatedIdentities"), o.get[scala.Option[scala.List[java.lang.String]]]("OpenIdConnectProviderARNs"), o.get[scala.Option[scala.List[models.CognitoIdentityProvider]]]("CognitoIdentityProviders"), o.get[scala.Option[java.lang.String]]("DeveloperProviderName"), o.get[scala.Option[scala.List[java.lang.String]]]("SamlProviderARNs"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("SupportedLoginProviders")).mapN(models.CreateIdentityPoolInput.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InternalErrorException.apply _)
  }
  final implicit val GetIdResponseDecoder: io.circe.Decoder[models.GetIdResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("IdentityId").map(models.GetIdResponse.apply _)
  }
  final implicit val ListIdentitiesResponseDecoder: io.circe.Decoder[models.ListIdentitiesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityPoolId"), o.get[scala.Option[scala.List[models.IdentityDescription]]]("Identities"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListIdentitiesResponse.apply _)
  }
  final implicit val DeleteIdentitiesInputDecoder: io.circe.Decoder[models.DeleteIdentitiesInput] = io.circe.Decoder.instance { o => 
    o.get[scala.List[java.lang.String]]("IdentityIdsToDelete").map(models.DeleteIdentitiesInput.apply _)
  }
  final implicit val RoleMappingDecoder: io.circe.Decoder[models.RoleMapping] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Type"), o.get[scala.Option[java.lang.String]]("AmbiguousRoleResolution"), o.get[scala.Option[models.RulesConfigurationType]]("RulesConfiguration")).mapN(models.RoleMapping.apply _)
  }
  final implicit val UnlinkIdentityInputDecoder: io.circe.Decoder[models.UnlinkIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Logins"), o.get[scala.List[java.lang.String]]("LoginsToRemove")).mapN(models.UnlinkIdentityInput.apply _)
  }
  final implicit val IdentityPoolDecoder: io.circe.Decoder[models.IdentityPool] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolName"), o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Boolean]("AllowUnauthenticatedIdentities"), o.get[scala.Option[scala.List[java.lang.String]]]("OpenIdConnectProviderARNs"), o.get[scala.Option[scala.List[models.CognitoIdentityProvider]]]("CognitoIdentityProviders"), o.get[scala.Option[java.lang.String]]("DeveloperProviderName"), o.get[scala.Option[scala.List[java.lang.String]]]("SamlProviderARNs"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("SupportedLoginProviders")).mapN(models.IdentityPool.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ResourceNotFoundException.apply _)
  }
  final implicit val NotAuthorizedExceptionDecoder: io.circe.Decoder[models.NotAuthorizedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.NotAuthorizedException.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TooManyRequestsException.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ConcurrentModificationException.apply _)
  }
  final implicit val ExternalServiceExceptionDecoder: io.circe.Decoder[models.ExternalServiceException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExternalServiceException.apply _)
  }
  final implicit val CognitoIdentityProviderDecoder: io.circe.Decoder[models.CognitoIdentityProvider] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[scala.Boolean]]("ServerSideTokenCheck")).mapN(models.CognitoIdentityProvider.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidParameterException.apply _)
  }
  final implicit val IdentityDescriptionDecoder: io.circe.Decoder[models.IdentityDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[scala.List[java.lang.String]]]("Logins"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate")).mapN(models.IdentityDescription.apply _)
  }
  final implicit val DeleteIdentityPoolInputDecoder: io.circe.Decoder[models.DeleteIdentityPoolInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityPoolId").map(models.DeleteIdentityPoolInput.apply _)
  }
  final implicit val SetIdentityPoolRolesInputDecoder: io.circe.Decoder[models.SetIdentityPoolRolesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("Roles"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, models.RoleMapping]]]("RoleMappings")).mapN(models.SetIdentityPoolRolesInput.apply _)
  }
  final implicit val GetOpenIdTokenForDeveloperIdentityResponseDecoder: io.circe.Decoder[models.GetOpenIdTokenForDeveloperIdentityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("Token")).mapN(models.GetOpenIdTokenForDeveloperIdentityResponse.apply _)
  }
  final implicit val DeveloperUserAlreadyRegisteredExceptionDecoder: io.circe.Decoder[models.DeveloperUserAlreadyRegisteredException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DeveloperUserAlreadyRegisteredException.apply _)
  }
  final implicit val IdentityPoolShortDescriptionDecoder: io.circe.Decoder[models.IdentityPoolShortDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityPoolId"), o.get[scala.Option[java.lang.String]]("IdentityPoolName")).mapN(models.IdentityPoolShortDescription.apply _)
  }
  final implicit val GetCredentialsForIdentityInputDecoder: io.circe.Decoder[models.GetCredentialsForIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Logins"), o.get[scala.Option[java.lang.String]]("CustomRoleArn")).mapN(models.GetCredentialsForIdentityInput.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LimitExceededException.apply _)
  }
  final implicit val DescribeIdentityPoolInputDecoder: io.circe.Decoder[models.DescribeIdentityPoolInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityPoolId").map(models.DescribeIdentityPoolInput.apply _)
  }
  final implicit val ListIdentityPoolsInputDecoder: io.circe.Decoder[models.ListIdentityPoolsInput] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListIdentityPoolsInput.apply _)
  }
  final implicit val ListIdentitiesInputDecoder: io.circe.Decoder[models.ListIdentitiesInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityPoolId"), o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken"), o.get[scala.Option[scala.Boolean]]("HideDisabled")).mapN(models.ListIdentitiesInput.apply _)
  }
  final implicit val DescribeIdentityInputDecoder: io.circe.Decoder[models.DescribeIdentityInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityId").map(models.DescribeIdentityInput.apply _)
  }
  final implicit val GetCredentialsForIdentityResponseDecoder: io.circe.Decoder[models.GetCredentialsForIdentityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[models.Credentials]]("Credentials")).mapN(models.GetCredentialsForIdentityResponse.apply _)
  }
  final implicit val LookupDeveloperIdentityResponseDecoder: io.circe.Decoder[models.LookupDeveloperIdentityResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[scala.List[java.lang.String]]]("DeveloperUserIdentifierList"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.LookupDeveloperIdentityResponse.apply _)
  }
  final implicit val UnlinkDeveloperIdentityInputDecoder: io.circe.Decoder[models.UnlinkDeveloperIdentityInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[java.lang.String]("IdentityPoolId"), o.get[java.lang.String]("DeveloperProviderName"), o.get[java.lang.String]("DeveloperUserIdentifier")).mapN(models.UnlinkDeveloperIdentityInput.apply _)
  }
  final implicit val ListIdentityPoolsResponseDecoder: io.circe.Decoder[models.ListIdentityPoolsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.IdentityPoolShortDescription]]]("IdentityPools"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(models.ListIdentityPoolsResponse.apply _)
  }
  final implicit val MergeDeveloperIdentitiesResponseDecoder: io.circe.Decoder[models.MergeDeveloperIdentitiesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("IdentityId").map(models.MergeDeveloperIdentitiesResponse.apply _)
  }
  final implicit val DeleteIdentitiesResponseDecoder: io.circe.Decoder[models.DeleteIdentitiesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[models.UnprocessedIdentityId]]]("UnprocessedIdentityIds").map(models.DeleteIdentitiesResponse.apply _)
  }
  final implicit val GetOpenIdTokenResponseDecoder: io.circe.Decoder[models.GetOpenIdTokenResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("IdentityId"), o.get[scala.Option[java.lang.String]]("Token")).mapN(models.GetOpenIdTokenResponse.apply _)
  }
  final implicit val GetIdentityPoolRolesInputDecoder: io.circe.Decoder[models.GetIdentityPoolRolesInput] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("IdentityPoolId").map(models.GetIdentityPoolRolesInput.apply _)
  }
  final implicit val GetOpenIdTokenInputDecoder: io.circe.Decoder[models.GetOpenIdTokenInput] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("IdentityId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("Logins")).mapN(models.GetOpenIdTokenInput.apply _)
  }
}