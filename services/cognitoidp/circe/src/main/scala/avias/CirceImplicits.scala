package avias.cognitoidp
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val InvalidSmsRoleTrustRelationshipExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidSmsRoleTrustRelationshipException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteUserPoolRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val AdminLinkProviderForUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminLinkProviderForUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val VerifyUserAttributeRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.VerifyUserAttributeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "AttributeName" -> o.attributeName.asJson, "Code" -> o.code.asJson)
  }
  final implicit val NumberAttributeConstraintsTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.NumberAttributeConstraintsType] = io.circe.Encoder.instance { o => 
    Json.obj("MinValue" -> o.minValue.asJson, "MaxValue" -> o.maxValue.asJson)
  }
  final implicit val GetUICustomizationResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetUICustomizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UICustomization" -> o.uicustomization.asJson)
  }
  final implicit val AdminEnableUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminEnableUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val ListResourceServersResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListResourceServersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServers" -> o.resourceServers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidEmailRoleAccessPolicyExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidEmailRoleAccessPolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeUserPoolDomainResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserPoolDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DomainDescription" -> o.domainDescription.asJson)
  }
  final implicit val AdminListGroupsForUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminListGroupsForUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Groups" -> o.groups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UpdateIdentityProviderResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateIdentityProviderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val AdminGetDeviceRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminGetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val CreateUserPoolClientRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientName" -> o.clientName.asJson, "UserPoolId" -> o.userPoolId.asJson, "GenerateSecret" -> o.generateSecret.asJson, "CallbackURLs" -> o.callbackURLs.asJson, "RefreshTokenValidity" -> o.refreshTokenValidity.asJson, "AllowedOAuthFlows" -> o.allowedOAuthFlows.asJson, "ReadAttributes" -> o.readAttributes.asJson, "WriteAttributes" -> o.writeAttributes.asJson, "LogoutURLs" -> o.logoutURLs.asJson, "ExplicitAuthFlows" -> o.explicitAuthFlows.asJson, "AllowedOAuthScopes" -> o.allowedOAuthScopes.asJson, "AllowedOAuthFlowsUserPoolClient" -> o.allowedOAuthFlowsUserPoolClient.asJson, "DefaultRedirectURI" -> o.defaultRedirectURI.asJson, "SupportedIdentityProviders" -> o.supportedIdentityProviders.asJson)
  }
  final implicit val AliasExistsExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.AliasExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateResourceServerResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateResourceServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServer" -> o.resourceServer.asJson)
  }
  final implicit val UserPoolClientDescriptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UserPoolClientDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "UserPoolId" -> o.userPoolId.asJson, "ClientName" -> o.clientName.asJson)
  }
  final implicit val UpdateUserPoolRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "EmailVerificationMessage" -> o.emailVerificationMessage.asJson, "AdminCreateUserConfig" -> o.adminCreateUserConfig.asJson, "SmsConfiguration" -> o.smsConfiguration.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "UserPoolTags" -> o.userPoolTags.asJson, "EmailVerificationSubject" -> o.emailVerificationSubject.asJson, "DeviceConfiguration" -> o.deviceConfiguration.asJson, "AutoVerifiedAttributes" -> o.autoVerifiedAttributes.asJson, "EmailConfiguration" -> o.emailConfiguration.asJson, "SmsVerificationMessage" -> o.smsVerificationMessage.asJson, "SmsAuthenticationMessage" -> o.smsAuthenticationMessage.asJson, "VerificationMessageTemplate" -> o.verificationMessageTemplate.asJson, "MfaConfiguration" -> o.mfaConfiguration.asJson, "Policies" -> o.policies.asJson)
  }
  final implicit val ListUserPoolsRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUserPoolsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UserImportJobTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UserImportJobType] = io.circe.Encoder.instance { o => 
    Json.obj("CreationDate" -> o.creationDate.asJson, "StartDate" -> o.startDate.asJson, "CompletionDate" -> o.completionDate.asJson, "PreSignedUrl" -> o.preSignedUrl.asJson, "Status" -> o.status.asJson, "JobName" -> o.jobName.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson, "ImportedUsers" -> o.importedUsers.asJson, "SkippedUsers" -> o.skippedUsers.asJson, "FailedUsers" -> o.failedUsers.asJson, "UserPoolId" -> o.userPoolId.asJson, "CompletionMessage" -> o.completionMessage.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val GetDeviceResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetDeviceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson)
  }
  final implicit val PasswordPolicyTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.PasswordPolicyType] = io.circe.Encoder.instance { o => 
    Json.obj("MinimumLength" -> o.minimumLength.asJson, "RequireUppercase" -> o.requireUppercase.asJson, "RequireLowercase" -> o.requireLowercase.asJson, "RequireNumbers" -> o.requireNumbers.asJson, "RequireSymbols" -> o.requireSymbols.asJson)
  }
  final implicit val UserPoolClientTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UserPoolClientType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "CallbackURLs" -> o.callbackURLs.asJson, "RefreshTokenValidity" -> o.refreshTokenValidity.asJson, "ClientId" -> o.clientId.asJson, "ClientSecret" -> o.clientSecret.asJson, "ClientName" -> o.clientName.asJson, "AllowedOAuthFlows" -> o.allowedOAuthFlows.asJson, "ReadAttributes" -> o.readAttributes.asJson, "WriteAttributes" -> o.writeAttributes.asJson, "LogoutURLs" -> o.logoutURLs.asJson, "ExplicitAuthFlows" -> o.explicitAuthFlows.asJson, "AllowedOAuthScopes" -> o.allowedOAuthScopes.asJson, "UserPoolId" -> o.userPoolId.asJson, "AllowedOAuthFlowsUserPoolClient" -> o.allowedOAuthFlowsUserPoolClient.asJson, "DefaultRedirectURI" -> o.defaultRedirectURI.asJson, "SupportedIdentityProviders" -> o.supportedIdentityProviders.asJson)
  }
  final implicit val DeviceSecretVerifierConfigTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.DeviceSecretVerifierConfigType] = io.circe.Encoder.instance { o => 
    Json.obj("PasswordVerifier" -> o.passwordVerifier.asJson, "Salt" -> o.salt.asJson)
  }
  final implicit val UICustomizationTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UICustomizationType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "CSS" -> o.css.asJson, "ImageUrl" -> o.imageUrl.asJson, "ClientId" -> o.clientId.asJson, "CSSVersion" -> o.cssversion.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val AdminCreateUserConfigTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminCreateUserConfigType] = io.circe.Encoder.instance { o => 
    Json.obj("AllowAdminCreateUserOnly" -> o.allowAdminCreateUserOnly.asJson, "UnusedAccountValidityDays" -> o.unusedAccountValidityDays.asJson, "InviteMessageTemplate" -> o.inviteMessageTemplate.asJson)
  }
  final implicit val InvalidPasswordExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidPasswordException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDeviceStatusResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateDeviceStatusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson, "Description" -> o.description.asJson, "Precedence" -> o.precedence.asJson, "RoleArn" -> o.roleArn.asJson)
  }
  final implicit val GetUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson)
  }
  final implicit val TooManyFailedAttemptsExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.TooManyFailedAttemptsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SmsConfigurationTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.SmsConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("SnsCallerArn" -> o.snsCallerArn.asJson, "ExternalId" -> o.externalId.asJson)
  }
  final implicit val StopUserImportJobRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.StopUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val GetUICustomizationRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetUICustomizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson)
  }
  final implicit val ForgetDeviceRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ForgetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val DescribeUserImportJobResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val PasswordResetRequiredExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.PasswordResetRequiredException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ForgotPasswordResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ForgotPasswordResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val VerifyUserAttributeResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.VerifyUserAttributeResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListUserPoolClientsResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUserPoolClientsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClients" -> o.userPoolClients.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UnexpectedLambdaExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UnexpectedLambdaException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PreconditionNotMetExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.PreconditionNotMetException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val AdminRemoveUserFromGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminRemoveUserFromGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "GroupName" -> o.groupName.asJson)
  }
  final implicit val ListUserImportJobsRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUserImportJobsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val UpdateGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson, "Description" -> o.description.asJson, "Precedence" -> o.precedence.asJson, "RoleArn" -> o.roleArn.asJson)
  }
  final implicit val MessageTemplateTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.MessageTemplateType] = io.circe.Encoder.instance { o => 
    Json.obj("SMSMessage" -> o.smsmessage.asJson, "EmailMessage" -> o.emailMessage.asJson, "EmailSubject" -> o.emailSubject.asJson)
  }
  final implicit val UpdateGroupResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Group" -> o.group.asJson)
  }
  final implicit val ListResourceServersRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListResourceServersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val ConfirmDeviceRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ConfirmDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "DeviceKey" -> o.deviceKey.asJson, "DeviceSecretVerifierConfig" -> o.deviceSecretVerifierConfig.asJson, "DeviceName" -> o.deviceName.asJson)
  }
  final implicit val AdminDeleteUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDeleteUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val UserNotConfirmedExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UserNotConfirmedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AdminDisableProviderForUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDisableProviderForUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "User" -> o.user.asJson)
  }
  final implicit val AdminResetUserPasswordResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminResetUserPasswordResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ConfirmDeviceResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ConfirmDeviceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserConfirmationNecessary" -> o.userConfirmationNecessary.asJson)
  }
  final implicit val ResourceServerTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.ResourceServerType] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson, "Name" -> o.name.asJson, "Scopes" -> o.scopes.asJson)
  }
  final implicit val SchemaAttributeTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.SchemaAttributeType] = io.circe.Encoder.instance { o => 
    Json.obj("NumberAttributeConstraints" -> o.numberAttributeConstraints.asJson, "StringAttributeConstraints" -> o.stringAttributeConstraints.asJson, "AttributeDataType" -> o.attributeDataType.asJson, "Name" -> o.name.asJson, "DeveloperOnlyAttribute" -> o.developerOnlyAttribute.asJson, "Mutable" -> o.mutable.asJson, "Required" -> o.required.asJson)
  }
  final implicit val CreateIdentityProviderRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderType" -> o.providerType.asJson, "ProviderDetails" -> o.providerDetails.asJson, "ProviderName" -> o.providerName.asJson, "UserPoolId" -> o.userPoolId.asJson, "AttributeMapping" -> o.attributeMapping.asJson, "IdpIdentifiers" -> o.idpIdentifiers.asJson)
  }
  final implicit val LambdaConfigTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.LambdaConfigType] = io.circe.Encoder.instance { o => 
    Json.obj("DefineAuthChallenge" -> o.defineAuthChallenge.asJson, "VerifyAuthChallengeResponse" -> o.verifyAuthChallengeResponse.asJson, "PreSignUp" -> o.preSignUp.asJson, "PostConfirmation" -> o.postConfirmation.asJson, "PreAuthentication" -> o.preAuthentication.asJson, "CreateAuthChallenge" -> o.createAuthChallenge.asJson, "CustomMessage" -> o.customMessage.asJson, "PostAuthentication" -> o.postAuthentication.asJson)
  }
  final implicit val CreateUserPoolRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PoolName" -> o.poolName.asJson, "EmailVerificationMessage" -> o.emailVerificationMessage.asJson, "AdminCreateUserConfig" -> o.adminCreateUserConfig.asJson, "SmsConfiguration" -> o.smsConfiguration.asJson, "UsernameAttributes" -> o.usernameAttributes.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "UserPoolTags" -> o.userPoolTags.asJson, "AliasAttributes" -> o.aliasAttributes.asJson, "EmailVerificationSubject" -> o.emailVerificationSubject.asJson, "Schema" -> o.schema.asJson, "DeviceConfiguration" -> o.deviceConfiguration.asJson, "AutoVerifiedAttributes" -> o.autoVerifiedAttributes.asJson, "EmailConfiguration" -> o.emailConfiguration.asJson, "SmsVerificationMessage" -> o.smsVerificationMessage.asJson, "SmsAuthenticationMessage" -> o.smsAuthenticationMessage.asJson, "VerificationMessageTemplate" -> o.verificationMessageTemplate.asJson, "MfaConfiguration" -> o.mfaConfiguration.asJson, "Policies" -> o.policies.asJson)
  }
  final implicit val ConfirmSignUpRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ConfirmSignUpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "ClientId" -> o.clientId.asJson, "ConfirmationCode" -> o.confirmationCode.asJson, "ForceAliasCreation" -> o.forceAliasCreation.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val ExpiredCodeExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.ExpiredCodeException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RespondToAuthChallengeRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.RespondToAuthChallengeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeResponses" -> o.challengeResponses.asJson)
  }
  final implicit val InitiateAuthRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.InitiateAuthRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AuthFlow" -> o.authFlow.asJson, "ClientId" -> o.clientId.asJson, "AuthParameters" -> o.authParameters.asJson, "ClientMetadata" -> o.clientMetadata.asJson)
  }
  final implicit val AdminCreateUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminCreateUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("User" -> o.user.asJson)
  }
  final implicit val AdminInitiateAuthRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminInitiateAuthRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AuthFlow" -> o.authFlow.asJson, "ClientId" -> o.clientId.asJson, "UserPoolId" -> o.userPoolId.asJson, "AuthParameters" -> o.authParameters.asJson, "ClientMetadata" -> o.clientMetadata.asJson)
  }
  final implicit val AdminForgetDeviceRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminForgetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "DeviceKey" -> o.deviceKey.asJson)
  }
  final implicit val GetGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GroupName" -> o.groupName.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val ListGroupsRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListGroupsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val StringAttributeConstraintsTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.StringAttributeConstraintsType] = io.circe.Encoder.instance { o => 
    Json.obj("MinLength" -> o.minLength.asJson, "MaxLength" -> o.maxLength.asJson)
  }
  final implicit val AdminInitiateAuthResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminInitiateAuthResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val InternalErrorExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InternalErrorException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdentityProviderByIdentifierResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetIdentityProviderByIdentifierResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val AdminUserGlobalSignOutResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminUserGlobalSignOutResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AdminConfirmSignUpResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminConfirmSignUpResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ProviderUserIdentifierTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.ProviderUserIdentifierType] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "ProviderAttributeName" -> o.providerAttributeName.asJson, "ProviderAttributeValue" -> o.providerAttributeValue.asJson)
  }
  final implicit val AdminDeleteUserAttributesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDeleteUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "UserAttributeNames" -> o.userAttributeNames.asJson)
  }
  final implicit val AdminUpdateDeviceStatusRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminUpdateDeviceStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "DeviceKey" -> o.deviceKey.asJson, "DeviceRememberedStatus" -> o.deviceRememberedStatus.asJson)
  }
  final implicit val AdminSetUserSettingsResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminSetUserSettingsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SignUpRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.SignUpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "ClientId" -> o.clientId.asJson, "Password" -> o.password.asJson, "UserAttributes" -> o.userAttributes.asJson, "ValidationData" -> o.validationData.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val ListIdentityProvidersResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListIdentityProvidersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Providers" -> o.providers.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val AdminUserGlobalSignOutRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminUserGlobalSignOutRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val AdminUpdateUserAttributesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminUpdateUserAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetGroupResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Group" -> o.group.asJson)
  }
  final implicit val StartUserImportJobResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.StartUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val ConfirmForgotPasswordResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ConfirmForgotPasswordResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val ListUsersResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUsersResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Users" -> o.users.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val UserPoolTaggingExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UserPoolTaggingException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ConfirmSignUpResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ConfirmSignUpResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NewDeviceMetadataTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.NewDeviceMetadataType] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "DeviceGroupKey" -> o.deviceGroupKey.asJson)
  }
  final implicit val ConfirmForgotPasswordRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ConfirmForgotPasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "ClientId" -> o.clientId.asJson, "Password" -> o.password.asJson, "ConfirmationCode" -> o.confirmationCode.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val CreateGroupResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Group" -> o.group.asJson)
  }
  final implicit val UpdateResourceServerRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson, "Name" -> o.name.asJson, "Scopes" -> o.scopes.asJson)
  }
  final implicit val AdminResetUserPasswordRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminResetUserPasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val AdminListDevicesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminListDevicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "Limit" -> o.limit.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val ResendConfirmationCodeRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ResendConfirmationCodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "Username" -> o.username.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val UpdateUserPoolResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateUserPoolResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SignUpResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.SignUpResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserConfirmed" -> o.userConfirmed.asJson, "UserSub" -> o.userSub.asJson, "CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val AdminDeleteUserAttributesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDeleteUserAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserAttributes" -> o.userAttributes.asJson, "MFAOptions" -> o.mfaoptions.asJson)
  }
  final implicit val AdminGetUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminGetUserResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserCreateDate" -> o.userCreateDate.asJson, "UserLastModifiedDate" -> o.userLastModifiedDate.asJson, "UserAttributes" -> o.userAttributes.asJson, "MFAOptions" -> o.mfaoptions.asJson, "UserStatus" -> o.userStatus.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val UserLambdaValidationExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UserLambdaValidationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateIdentityProviderResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateIdentityProviderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val GetUserAttributeVerificationCodeResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetUserAttributeVerificationCodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val InvalidLambdaResponseExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidLambdaResponseException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeviceConfigurationTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.DeviceConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeRequiredOnNewDevice" -> o.challengeRequiredOnNewDevice.asJson, "DeviceOnlyRememberedOnUserPrompt" -> o.deviceOnlyRememberedOnUserPrompt.asJson)
  }
  final implicit val AdminGetUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminGetUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val InitiateAuthResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.InitiateAuthResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val DescribeResourceServerResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeResourceServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServer" -> o.resourceServer.asJson)
  }
  final implicit val DescribeUserPoolResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserPoolResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPool" -> o.userPool.asJson)
  }
  final implicit val AuthenticationResultTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.AuthenticationResultType] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "RefreshToken" -> o.refreshToken.asJson, "IdToken" -> o.idToken.asJson, "ExpiresIn" -> o.expiresIn.asJson, "TokenType" -> o.tokenType.asJson, "NewDeviceMetadata" -> o.newDeviceMetadata.asJson)
  }
  final implicit val DeleteResourceServerRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson)
  }
  final implicit val ForgotPasswordRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ForgotPasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "Username" -> o.username.asJson, "SecretHash" -> o.secretHash.asJson)
  }
  final implicit val AttributeTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.AttributeType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val AdminSetUserSettingsRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminSetUserSettingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "MFAOptions" -> o.mfaoptions.asJson)
  }
  final implicit val AdminCreateUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminCreateUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserPoolId" -> o.userPoolId.asJson, "ForceAliasCreation" -> o.forceAliasCreation.asJson, "UserAttributes" -> o.userAttributes.asJson, "ValidationData" -> o.validationData.asJson, "MessageAction" -> o.messageAction.asJson, "TemporaryPassword" -> o.temporaryPassword.asJson, "DesiredDeliveryMediums" -> o.desiredDeliveryMediums.asJson)
  }
  final implicit val ChangePasswordResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ChangePasswordResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DescribeUserPoolRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserPoolRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val CodeDeliveryDetailsTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.CodeDeliveryDetailsType] = io.circe.Encoder.instance { o => 
    Json.obj("Destination" -> o.destination.asJson, "DeliveryMedium" -> o.deliveryMedium.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val AdminDisableUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDisableUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val CreateUserPoolClientResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserPoolClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClient" -> o.userPoolClient.asJson)
  }
  final implicit val InvalidParameterExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidParameterException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateUserPoolDomainResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserPoolDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AdminEnableUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminEnableUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val SetUserSettingsResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.SetUserSettingsResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AddCustomAttributesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AddCustomAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DomainDescriptionTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.DomainDescriptionType] = io.circe.Encoder.instance { o => 
    Json.obj("AWSAccountId" -> o.awsaccountId.asJson, "Domain" -> o.domain.asJson, "S3Bucket" -> o.s3Bucket.asJson, "Version" -> o.version.asJson, "CloudFrontDistribution" -> o.cloudFrontDistribution.asJson, "UserPoolId" -> o.userPoolId.asJson, "Status" -> o.status.asJson)
  }
  final implicit val UpdateIdentityProviderRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "UserPoolId" -> o.userPoolId.asJson, "AttributeMapping" -> o.attributeMapping.asJson, "ProviderDetails" -> o.providerDetails.asJson, "IdpIdentifiers" -> o.idpIdentifiers.asJson)
  }
  final implicit val AdminListDevicesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminListDevicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Devices" -> o.devices.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val RespondToAuthChallengeResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.RespondToAuthChallengeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val UserPoolTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UserPoolType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "EmailVerificationMessage" -> o.emailVerificationMessage.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "EstimatedNumberOfUsers" -> o.estimatedNumberOfUsers.asJson, "AdminCreateUserConfig" -> o.adminCreateUserConfig.asJson, "SmsConfiguration" -> o.smsConfiguration.asJson, "SmsConfigurationFailure" -> o.smsConfigurationFailure.asJson, "EmailConfigurationFailure" -> o.emailConfigurationFailure.asJson, "UsernameAttributes" -> o.usernameAttributes.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "UserPoolTags" -> o.userPoolTags.asJson, "AliasAttributes" -> o.aliasAttributes.asJson, "EmailVerificationSubject" -> o.emailVerificationSubject.asJson, "SchemaAttributes" -> o.schemaAttributes.asJson, "DeviceConfiguration" -> o.deviceConfiguration.asJson, "AutoVerifiedAttributes" -> o.autoVerifiedAttributes.asJson, "EmailConfiguration" -> o.emailConfiguration.asJson, "SmsVerificationMessage" -> o.smsVerificationMessage.asJson, "SmsAuthenticationMessage" -> o.smsAuthenticationMessage.asJson, "VerificationMessageTemplate" -> o.verificationMessageTemplate.asJson, "Id" -> o.id.asJson, "Status" -> o.status.asJson, "MfaConfiguration" -> o.mfaConfiguration.asJson, "Policies" -> o.policies.asJson)
  }
  final implicit val AdminConfirmSignUpRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminConfirmSignUpRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson)
  }
  final implicit val GroupTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.GroupType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "Description" -> o.description.asJson, "GroupName" -> o.groupName.asJson, "Precedence" -> o.precedence.asJson, "RoleArn" -> o.roleArn.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val UpdateUserPoolClientRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "UserPoolId" -> o.userPoolId.asJson, "CallbackURLs" -> o.callbackURLs.asJson, "RefreshTokenValidity" -> o.refreshTokenValidity.asJson, "ClientName" -> o.clientName.asJson, "AllowedOAuthFlows" -> o.allowedOAuthFlows.asJson, "ReadAttributes" -> o.readAttributes.asJson, "WriteAttributes" -> o.writeAttributes.asJson, "LogoutURLs" -> o.logoutURLs.asJson, "ExplicitAuthFlows" -> o.explicitAuthFlows.asJson, "AllowedOAuthScopes" -> o.allowedOAuthScopes.asJson, "AllowedOAuthFlowsUserPoolClient" -> o.allowedOAuthFlowsUserPoolClient.asJson, "DefaultRedirectURI" -> o.defaultRedirectURI.asJson, "SupportedIdentityProviders" -> o.supportedIdentityProviders.asJson)
  }
  final implicit val ListUsersInGroupResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUsersInGroupResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Users" -> o.users.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UserImportInProgressExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UserImportInProgressException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeUserPoolClientResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserPoolClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClient" -> o.userPoolClient.asJson)
  }
  final implicit val CreateUserImportJobRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("JobName" -> o.jobName.asJson, "UserPoolId" -> o.userPoolId.asJson, "CloudWatchLogsRoleArn" -> o.cloudWatchLogsRoleArn.asJson)
  }
  final implicit val CreateUserPoolDomainRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserPoolDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val UpdateUserPoolClientResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateUserPoolClientResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolClient" -> o.userPoolClient.asJson)
  }
  final implicit val CreateUserImportJobResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val ListUserPoolClientsRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUserPoolClientsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val CreateUserPoolResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateUserPoolResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPool" -> o.userPool.asJson)
  }
  final implicit val ListIdentityProvidersRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListIdentityProvidersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "MaxResults" -> o.maxResults.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val UsernameExistsExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UsernameExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeResourceServerRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson)
  }
  final implicit val ProviderDescriptionEncoder: io.circe.Encoder[avias.cognitoidp.models.ProviderDescription] = io.circe.Encoder.instance { o => 
    Json.obj("ProviderName" -> o.providerName.asJson, "ProviderType" -> o.providerType.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson)
  }
  final implicit val ListUserImportJobsResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUserImportJobsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJobs" -> o.userImportJobs.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val AdminLinkProviderForUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminLinkProviderForUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "DestinationUser" -> o.destinationUser.asJson, "SourceUser" -> o.sourceUser.asJson)
  }
  final implicit val DeleteUserAttributesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserAttributesResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val DeleteUserPoolClientRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson)
  }
  final implicit val AdminRespondToAuthChallengeResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminRespondToAuthChallengeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ChallengeName" -> o.challengeName.asJson, "Session" -> o.session.asJson, "ChallengeParameters" -> o.challengeParameters.asJson, "AuthenticationResult" -> o.authenticationResult.asJson)
  }
  final implicit val DeviceTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.DeviceType] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "DeviceAttributes" -> o.deviceAttributes.asJson, "DeviceCreateDate" -> o.deviceCreateDate.asJson, "DeviceLastModifiedDate" -> o.deviceLastModifiedDate.asJson, "DeviceLastAuthenticatedDate" -> o.deviceLastAuthenticatedDate.asJson)
  }
  final implicit val AdminDisableUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDisableUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val NotAuthorizedExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.NotAuthorizedException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson)
  }
  final implicit val EmailConfigurationTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.EmailConfigurationType] = io.circe.Encoder.instance { o => 
    Json.obj("SourceArn" -> o.sourceArn.asJson, "ReplyToEmailAddress" -> o.replyToEmailAddress.asJson)
  }
  final implicit val InvalidUserPoolConfigurationExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidUserPoolConfigurationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListDevicesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListDevicesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Devices" -> o.devices.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val TooManyRequestsExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.TooManyRequestsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DuplicateProviderExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.DuplicateProviderException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MFAOptionTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.MFAOptionType] = io.circe.Encoder.instance { o => 
    Json.obj("DeliveryMedium" -> o.deliveryMedium.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val GetCSVHeaderRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetCSVHeaderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val InvalidSmsRoleAccessPolicyExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidSmsRoleAccessPolicyException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CodeDeliveryFailureExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.CodeDeliveryFailureException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeUserImportJobRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val ConcurrentModificationExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.ConcurrentModificationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteUserAttributesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserAttributeNames" -> o.userAttributeNames.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val SetUICustomizationResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.SetUICustomizationResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UICustomization" -> o.uicustomization.asJson)
  }
  final implicit val GetDeviceRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetDeviceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DeviceKey" -> o.deviceKey.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val IdentityProviderTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.IdentityProviderType] = io.circe.Encoder.instance { o => 
    Json.obj("LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "ProviderName" -> o.providerName.asJson, "AttributeMapping" -> o.attributeMapping.asJson, "ProviderType" -> o.providerType.asJson, "ProviderDetails" -> o.providerDetails.asJson, "UserPoolId" -> o.userPoolId.asJson, "IdpIdentifiers" -> o.idpIdentifiers.asJson)
  }
  final implicit val UserPoolDescriptionTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UserPoolDescriptionType] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "LastModifiedDate" -> o.lastModifiedDate.asJson, "CreationDate" -> o.creationDate.asJson, "LambdaConfig" -> o.lambdaConfig.asJson, "Id" -> o.id.asJson, "Status" -> o.status.asJson)
  }
  final implicit val ListUsersInGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUsersInGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "GroupName" -> o.groupName.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DeleteUserPoolDomainRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserPoolDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson, "UserPoolId" -> o.userPoolId.asJson)
  }
  final implicit val UpdateUserAttributesResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateUserAttributesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetailsList" -> o.codeDeliveryDetailsList.asJson)
  }
  final implicit val ListGroupsResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListGroupsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Groups" -> o.groups.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val MFAMethodNotFoundExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.MFAMethodNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val SetUserSettingsRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.SetUserSettingsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "MFAOptions" -> o.mfaoptions.asJson)
  }
  final implicit val ListUserPoolsResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUserPoolsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPools" -> o.userPools.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val DescribeIdentityProviderResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeIdentityProviderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("IdentityProvider" -> o.identityProvider.asJson)
  }
  final implicit val ListUsersRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListUsersRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Limit" -> o.limit.asJson, "AttributesToGet" -> o.attributesToGet.asJson, "Filter" -> o.filter.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val SetUICustomizationRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.SetUICustomizationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson, "CSS" -> o.css.asJson, "ImageFile" -> o.imageFile.asJson)
  }
  final implicit val VerificationMessageTemplateTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.VerificationMessageTemplateType] = io.circe.Encoder.instance { o => 
    Json.obj("EmailMessage" -> o.emailMessage.asJson, "EmailSubjectByLink" -> o.emailSubjectByLink.asJson, "EmailSubject" -> o.emailSubject.asJson, "DefaultEmailOption" -> o.defaultEmailOption.asJson, "EmailMessageByLink" -> o.emailMessageByLink.asJson, "SmsMessage" -> o.smsMessage.asJson)
  }
  final implicit val DeleteUserPoolDomainResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteUserPoolDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UserNotFoundExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UserNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateResourceServerRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateResourceServerRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Identifier" -> o.identifier.asJson, "Name" -> o.name.asJson, "Scopes" -> o.scopes.asJson)
  }
  final implicit val ResourceNotFoundExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.ResourceNotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDeviceStatusRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateDeviceStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "DeviceKey" -> o.deviceKey.asJson, "DeviceRememberedStatus" -> o.deviceRememberedStatus.asJson)
  }
  final implicit val DescribeUserPoolClientRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserPoolClientRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ClientId" -> o.clientId.asJson)
  }
  final implicit val ChangePasswordRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ChangePasswordRequest] = io.circe.Encoder.instance { o => 
    Json.obj("PreviousPassword" -> o.previousPassword.asJson, "ProposedPassword" -> o.proposedPassword.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val GlobalSignOutRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GlobalSignOutRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson)
  }
  final implicit val UpdateUserAttributesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.UpdateUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserAttributes" -> o.userAttributes.asJson, "AccessToken" -> o.accessToken.asJson)
  }
  final implicit val DescribeIdentityProviderRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ProviderName" -> o.providerName.asJson)
  }
  final implicit val ScopeDoesNotExistExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.ScopeDoesNotExistException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DeleteIdentityProviderRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DeleteIdentityProviderRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "ProviderName" -> o.providerName.asJson)
  }
  final implicit val UserTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UserType] = io.circe.Encoder.instance { o => 
    Json.obj("UserCreateDate" -> o.userCreateDate.asJson, "UserLastModifiedDate" -> o.userLastModifiedDate.asJson, "Username" -> o.username.asJson, "Attributes" -> o.attributes.asJson, "MFAOptions" -> o.mfaoptions.asJson, "UserStatus" -> o.userStatus.asJson, "Enabled" -> o.enabled.asJson)
  }
  final implicit val CodeMismatchExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.CodeMismatchException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ResourceServerScopeTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.ResourceServerScopeType] = io.circe.Encoder.instance { o => 
    Json.obj("ScopeName" -> o.scopeName.asJson, "ScopeDescription" -> o.scopeDescription.asJson)
  }
  final implicit val UnsupportedUserStateExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UnsupportedUserStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetIdentityProviderByIdentifierRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetIdentityProviderByIdentifierRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "IdpIdentifier" -> o.idpIdentifier.asJson)
  }
  final implicit val GetCSVHeaderResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GetCSVHeaderResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "CSVHeader" -> o.csvheader.asJson)
  }
  final implicit val AdminUpdateDeviceStatusResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminUpdateDeviceStatusResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GroupExistsExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.GroupExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AddCustomAttributesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AddCustomAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "CustomAttributes" -> o.customAttributes.asJson)
  }
  final implicit val AdminRespondToAuthChallengeRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminRespondToAuthChallengeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("ClientId" -> o.clientId.asJson, "ChallengeName" -> o.challengeName.asJson, "UserPoolId" -> o.userPoolId.asJson, "Session" -> o.session.asJson, "ChallengeResponses" -> o.challengeResponses.asJson)
  }
  final implicit val AdminListGroupsForUserRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminListGroupsForUserRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Username" -> o.username.asJson, "UserPoolId" -> o.userPoolId.asJson, "Limit" -> o.limit.asJson, "NextToken" -> o.nextToken.asJson)
  }
  final implicit val InvalidOAuthFlowExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.InvalidOAuthFlowException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val AdminAddUserToGroupRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminAddUserToGroupRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "GroupName" -> o.groupName.asJson)
  }
  final implicit val CreateResourceServerResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.CreateResourceServerResponse] = io.circe.Encoder.instance { o => 
    Json.obj("ResourceServer" -> o.resourceServer.asJson)
  }
  final implicit val UserPoolPolicyTypeEncoder: io.circe.Encoder[avias.cognitoidp.models.UserPoolPolicyType] = io.circe.Encoder.instance { o => 
    Json.obj("PasswordPolicy" -> o.passwordPolicy.asJson)
  }
  final implicit val GetUserAttributeVerificationCodeRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.GetUserAttributeVerificationCodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "AttributeName" -> o.attributeName.asJson)
  }
  final implicit val AdminGetDeviceResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminGetDeviceResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Device" -> o.device.asJson)
  }
  final implicit val ListDevicesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.ListDevicesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AccessToken" -> o.accessToken.asJson, "Limit" -> o.limit.asJson, "PaginationToken" -> o.paginationToken.asJson)
  }
  final implicit val StopUserImportJobResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.StopUserImportJobResponse] = io.circe.Encoder.instance { o => 
    Json.obj("UserImportJob" -> o.userImportJob.asJson)
  }
  final implicit val ResendConfirmationCodeResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.ResendConfirmationCodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CodeDeliveryDetails" -> o.codeDeliveryDetails.asJson)
  }
  final implicit val GlobalSignOutResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.GlobalSignOutResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val UnsupportedIdentityProviderExceptionEncoder: io.circe.Encoder[avias.cognitoidp.models.UnsupportedIdentityProviderException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val StartUserImportJobRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.StartUserImportJobRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "JobId" -> o.jobId.asJson)
  }
  final implicit val DescribeUserPoolDomainRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.DescribeUserPoolDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Domain" -> o.domain.asJson)
  }
  final implicit val AdminDisableProviderForUserResponseEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminDisableProviderForUserResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val AdminUpdateUserAttributesRequestEncoder: io.circe.Encoder[avias.cognitoidp.models.AdminUpdateUserAttributesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("UserPoolId" -> o.userPoolId.asJson, "Username" -> o.username.asJson, "UserAttributes" -> o.userAttributes.asJson)
  }
  final implicit val InvalidSmsRoleTrustRelationshipExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidSmsRoleTrustRelationshipException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidSmsRoleTrustRelationshipException.apply _)
  }
  final implicit val DeleteUserPoolRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserPoolRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("UserPoolId").map(avias.cognitoidp.models.DeleteUserPoolRequest.apply _)
  }
  final implicit val AdminLinkProviderForUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminLinkProviderForUserResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminLinkProviderForUserResponse)
  final implicit val VerifyUserAttributeRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.VerifyUserAttributeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("AttributeName"), o.get[java.lang.String]("Code")).mapN(avias.cognitoidp.models.VerifyUserAttributeRequest.apply _)
  }
  final implicit val NumberAttributeConstraintsTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.NumberAttributeConstraintsType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MinValue"), o.get[scala.Option[java.lang.String]]("MaxValue")).mapN(avias.cognitoidp.models.NumberAttributeConstraintsType.apply _)
  }
  final implicit val GetUICustomizationResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetUICustomizationResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.UICustomizationType]("UICustomization").map(avias.cognitoidp.models.GetUICustomizationResponse.apply _)
  }
  final implicit val AdminEnableUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminEnableUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminEnableUserRequest.apply _)
  }
  final implicit val ListResourceServersResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListResourceServersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.cognitoidp.models.ResourceServerType]]("ResourceServers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListResourceServersResponse.apply _)
  }
  final implicit val InvalidEmailRoleAccessPolicyExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidEmailRoleAccessPolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidEmailRoleAccessPolicyException.apply _)
  }
  final implicit val DescribeUserPoolDomainResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserPoolDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.DomainDescriptionType]]("DomainDescription").map(avias.cognitoidp.models.DescribeUserPoolDomainResponse.apply _)
  }
  final implicit val AdminListGroupsForUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminListGroupsForUserResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.GroupType]]]("Groups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.AdminListGroupsForUserResponse.apply _)
  }
  final implicit val UpdateIdentityProviderResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateIdentityProviderResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(avias.cognitoidp.models.UpdateIdentityProviderResponse.apply _)
  }
  final implicit val AdminGetDeviceRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminGetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeviceKey"), o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminGetDeviceRequest.apply _)
  }
  final implicit val CreateUserPoolClientRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Boolean]]("GenerateSecret"), o.get[scala.Option[scala.List[java.lang.String]]]("CallbackURLs"), o.get[scala.Option[scala.Int]]("RefreshTokenValidity"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("ReadAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("WriteAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("LogoutURLs"), o.get[scala.Option[scala.List[java.lang.String]]]("ExplicitAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthScopes"), o.get[scala.Option[scala.Boolean]]("AllowedOAuthFlowsUserPoolClient"), o.get[scala.Option[java.lang.String]]("DefaultRedirectURI"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedIdentityProviders")).mapN(avias.cognitoidp.models.CreateUserPoolClientRequest.apply _)
  }
  final implicit val AliasExistsExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.AliasExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.AliasExistsException.apply _)
  }
  final implicit val UpdateResourceServerResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateResourceServerResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.ResourceServerType]("ResourceServer").map(avias.cognitoidp.models.UpdateResourceServerResponse.apply _)
  }
  final implicit val UserPoolClientDescriptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UserPoolClientDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("ClientName")).mapN(avias.cognitoidp.models.UserPoolClientDescription.apply _)
  }
  final implicit val UpdateUserPoolRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateUserPoolRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("EmailVerificationMessage"), o.get[scala.Option[avias.cognitoidp.models.AdminCreateUserConfigType]]("AdminCreateUserConfig"), o.get[scala.Option[avias.cognitoidp.models.SmsConfigurationType]]("SmsConfiguration"), o.get[scala.Option[avias.cognitoidp.models.LambdaConfigType]]("LambdaConfig"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("UserPoolTags"), o.get[scala.Option[java.lang.String]]("EmailVerificationSubject"), o.get[scala.Option[avias.cognitoidp.models.DeviceConfigurationType]]("DeviceConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("AutoVerifiedAttributes"), o.get[scala.Option[avias.cognitoidp.models.EmailConfigurationType]]("EmailConfiguration"), o.get[scala.Option[java.lang.String]]("SmsVerificationMessage"), o.get[scala.Option[java.lang.String]]("SmsAuthenticationMessage"), o.get[scala.Option[avias.cognitoidp.models.VerificationMessageTemplateType]]("VerificationMessageTemplate"), o.get[scala.Option[java.lang.String]]("MfaConfiguration"), o.get[scala.Option[avias.cognitoidp.models.UserPoolPolicyType]]("Policies")).mapN(avias.cognitoidp.models.UpdateUserPoolRequest.apply _)
  }
  final implicit val ListUserPoolsRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUserPoolsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListUserPoolsRequest.apply _)
  }
  final implicit val UserImportJobTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UserImportJobType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("StartDate"), o.get[scala.Option[java.time.Instant]]("CompletionDate"), o.get[scala.Option[java.lang.String]]("PreSignedUrl"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("JobName"), o.get[scala.Option[java.lang.String]]("CloudWatchLogsRoleArn"), o.get[scala.Option[scala.Long]]("ImportedUsers"), o.get[scala.Option[scala.Long]]("SkippedUsers"), o.get[scala.Option[scala.Long]]("FailedUsers"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("CompletionMessage"), o.get[scala.Option[java.lang.String]]("JobId")).mapN(avias.cognitoidp.models.UserImportJobType.apply _)
  }
  final implicit val GetDeviceResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetDeviceResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.DeviceType]("Device").map(avias.cognitoidp.models.GetDeviceResponse.apply _)
  }
  final implicit val PasswordPolicyTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.PasswordPolicyType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("MinimumLength"), o.get[scala.Option[scala.Boolean]]("RequireUppercase"), o.get[scala.Option[scala.Boolean]]("RequireLowercase"), o.get[scala.Option[scala.Boolean]]("RequireNumbers"), o.get[scala.Option[scala.Boolean]]("RequireSymbols")).mapN(avias.cognitoidp.models.PasswordPolicyType.apply _)
  }
  final implicit val UserPoolClientTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UserPoolClientType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[scala.List[java.lang.String]]]("CallbackURLs"), o.get[scala.Option[scala.Int]]("RefreshTokenValidity"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("ClientSecret"), o.get[scala.Option[java.lang.String]]("ClientName"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("ReadAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("WriteAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("LogoutURLs"), o.get[scala.Option[scala.List[java.lang.String]]]("ExplicitAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthScopes"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[scala.Boolean]]("AllowedOAuthFlowsUserPoolClient"), o.get[scala.Option[java.lang.String]]("DefaultRedirectURI"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedIdentityProviders")).mapN(avias.cognitoidp.models.UserPoolClientType.apply _)
  }
  final implicit val DeviceSecretVerifierConfigTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.DeviceSecretVerifierConfigType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("PasswordVerifier"), o.get[scala.Option[java.lang.String]]("Salt")).mapN(avias.cognitoidp.models.DeviceSecretVerifierConfigType.apply _)
  }
  final implicit val UICustomizationTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UICustomizationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("CSS"), o.get[scala.Option[java.lang.String]]("ImageUrl"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("CSSVersion"), o.get[scala.Option[java.lang.String]]("UserPoolId")).mapN(avias.cognitoidp.models.UICustomizationType.apply _)
  }
  final implicit val AdminCreateUserConfigTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminCreateUserConfigType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("AllowAdminCreateUserOnly"), o.get[scala.Option[scala.Int]]("UnusedAccountValidityDays"), o.get[scala.Option[avias.cognitoidp.models.MessageTemplateType]]("InviteMessageTemplate")).mapN(avias.cognitoidp.models.AdminCreateUserConfigType.apply _)
  }
  final implicit val InvalidPasswordExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidPasswordException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidPasswordException.apply _)
  }
  final implicit val UpdateDeviceStatusResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateDeviceStatusResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.UpdateDeviceStatusResponse)
  final implicit val CreateGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("Precedence"), o.get[scala.Option[java.lang.String]]("RoleArn")).mapN(avias.cognitoidp.models.CreateGroupRequest.apply _)
  }
  final implicit val GetUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetUserRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccessToken").map(avias.cognitoidp.models.GetUserRequest.apply _)
  }
  final implicit val TooManyFailedAttemptsExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.TooManyFailedAttemptsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.TooManyFailedAttemptsException.apply _)
  }
  final implicit val SmsConfigurationTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.SmsConfigurationType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("SnsCallerArn"), o.get[scala.Option[java.lang.String]]("ExternalId")).mapN(avias.cognitoidp.models.SmsConfigurationType.apply _)
  }
  final implicit val StopUserImportJobRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.StopUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("JobId")).mapN(avias.cognitoidp.models.StopUserImportJobRequest.apply _)
  }
  final implicit val GetUICustomizationRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetUICustomizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("ClientId")).mapN(avias.cognitoidp.models.GetUICustomizationRequest.apply _)
  }
  final implicit val ForgetDeviceRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ForgetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("AccessToken")).mapN(avias.cognitoidp.models.ForgetDeviceRequest.apply _)
  }
  final implicit val DescribeUserImportJobResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserImportJobType]]("UserImportJob").map(avias.cognitoidp.models.DescribeUserImportJobResponse.apply _)
  }
  final implicit val PasswordResetRequiredExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.PasswordResetRequiredException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.PasswordResetRequiredException.apply _)
  }
  final implicit val ForgotPasswordResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ForgotPasswordResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails").map(avias.cognitoidp.models.ForgotPasswordResponse.apply _)
  }
  final implicit val VerifyUserAttributeResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.VerifyUserAttributeResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.VerifyUserAttributeResponse)
  final implicit val ListUserPoolClientsResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUserPoolClientsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.UserPoolClientDescription]]]("UserPoolClients"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListUserPoolClientsResponse.apply _)
  }
  final implicit val UnexpectedLambdaExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UnexpectedLambdaException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UnexpectedLambdaException.apply _)
  }
  final implicit val PreconditionNotMetExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.PreconditionNotMetException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.PreconditionNotMetException.apply _)
  }
  final implicit val DeleteGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId")).mapN(avias.cognitoidp.models.DeleteGroupRequest.apply _)
  }
  final implicit val AdminRemoveUserFromGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminRemoveUserFromGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("GroupName")).mapN(avias.cognitoidp.models.AdminRemoveUserFromGroupRequest.apply _)
  }
  final implicit val ListUserImportJobsRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUserImportJobsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Int]("MaxResults"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.ListUserImportJobsRequest.apply _)
  }
  final implicit val UpdateGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[scala.Int]]("Precedence"), o.get[scala.Option[java.lang.String]]("RoleArn")).mapN(avias.cognitoidp.models.UpdateGroupRequest.apply _)
  }
  final implicit val MessageTemplateTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.MessageTemplateType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SMSMessage"), o.get[scala.Option[java.lang.String]]("EmailMessage"), o.get[scala.Option[java.lang.String]]("EmailSubject")).mapN(avias.cognitoidp.models.MessageTemplateType.apply _)
  }
  final implicit val UpdateGroupResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.GroupType]]("Group").map(avias.cognitoidp.models.UpdateGroupResponse.apply _)
  }
  final implicit val ListResourceServersRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListResourceServersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListResourceServersRequest.apply _)
  }
  final implicit val ConfirmDeviceRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ConfirmDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[avias.cognitoidp.models.DeviceSecretVerifierConfigType]]("DeviceSecretVerifierConfig"), o.get[scala.Option[java.lang.String]]("DeviceName")).mapN(avias.cognitoidp.models.ConfirmDeviceRequest.apply _)
  }
  final implicit val AdminDeleteUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDeleteUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminDeleteUserRequest.apply _)
  }
  final implicit val UserNotConfirmedExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UserNotConfirmedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UserNotConfirmedException.apply _)
  }
  final implicit val AdminDisableProviderForUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDisableProviderForUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[avias.cognitoidp.models.ProviderUserIdentifierType]("User")).mapN(avias.cognitoidp.models.AdminDisableProviderForUserRequest.apply _)
  }
  final implicit val AdminResetUserPasswordResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminResetUserPasswordResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminResetUserPasswordResponse)
  final implicit val ConfirmDeviceResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ConfirmDeviceResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("UserConfirmationNecessary").map(avias.cognitoidp.models.ConfirmDeviceResponse.apply _)
  }
  final implicit val ResourceServerTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.ResourceServerType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Identifier"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.List[avias.cognitoidp.models.ResourceServerScopeType]]]("Scopes")).mapN(avias.cognitoidp.models.ResourceServerType.apply _)
  }
  final implicit val SchemaAttributeTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.SchemaAttributeType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[avias.cognitoidp.models.NumberAttributeConstraintsType]]("NumberAttributeConstraints"), o.get[scala.Option[avias.cognitoidp.models.StringAttributeConstraintsType]]("StringAttributeConstraints"), o.get[scala.Option[java.lang.String]]("AttributeDataType"), o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[scala.Boolean]]("DeveloperOnlyAttribute"), o.get[scala.Option[scala.Boolean]]("Mutable"), o.get[scala.Option[scala.Boolean]]("Required")).mapN(avias.cognitoidp.models.SchemaAttributeType.apply _)
  }
  final implicit val CreateIdentityProviderRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProviderType"), o.get[scala.collection.immutable.Map[java.lang.String, java.lang.String]]("ProviderDetails"), o.get[java.lang.String]("ProviderName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AttributeMapping"), o.get[scala.Option[scala.List[java.lang.String]]]("IdpIdentifiers")).mapN(avias.cognitoidp.models.CreateIdentityProviderRequest.apply _)
  }
  final implicit val LambdaConfigTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.LambdaConfigType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DefineAuthChallenge"), o.get[scala.Option[java.lang.String]]("VerifyAuthChallengeResponse"), o.get[scala.Option[java.lang.String]]("PreSignUp"), o.get[scala.Option[java.lang.String]]("PostConfirmation"), o.get[scala.Option[java.lang.String]]("PreAuthentication"), o.get[scala.Option[java.lang.String]]("CreateAuthChallenge"), o.get[scala.Option[java.lang.String]]("CustomMessage"), o.get[scala.Option[java.lang.String]]("PostAuthentication")).mapN(avias.cognitoidp.models.LambdaConfigType.apply _)
  }
  final implicit val CreateUserPoolRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserPoolRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PoolName"), o.get[scala.Option[java.lang.String]]("EmailVerificationMessage"), o.get[scala.Option[avias.cognitoidp.models.AdminCreateUserConfigType]]("AdminCreateUserConfig"), o.get[scala.Option[avias.cognitoidp.models.SmsConfigurationType]]("SmsConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("UsernameAttributes"), o.get[scala.Option[avias.cognitoidp.models.LambdaConfigType]]("LambdaConfig"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("UserPoolTags"), o.get[scala.Option[scala.List[java.lang.String]]]("AliasAttributes"), o.get[scala.Option[java.lang.String]]("EmailVerificationSubject"), o.get[scala.Option[scala.List[avias.cognitoidp.models.SchemaAttributeType]]]("Schema"), o.get[scala.Option[avias.cognitoidp.models.DeviceConfigurationType]]("DeviceConfiguration"), o.get[scala.Option[scala.List[java.lang.String]]]("AutoVerifiedAttributes"), o.get[scala.Option[avias.cognitoidp.models.EmailConfigurationType]]("EmailConfiguration"), o.get[scala.Option[java.lang.String]]("SmsVerificationMessage"), o.get[scala.Option[java.lang.String]]("SmsAuthenticationMessage"), o.get[scala.Option[avias.cognitoidp.models.VerificationMessageTemplateType]]("VerificationMessageTemplate"), o.get[scala.Option[java.lang.String]]("MfaConfiguration"), o.get[scala.Option[avias.cognitoidp.models.UserPoolPolicyType]]("Policies")).mapN(avias.cognitoidp.models.CreateUserPoolRequest.apply _)
  }
  final implicit val ConfirmSignUpRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ConfirmSignUpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("ConfirmationCode"), o.get[scala.Option[scala.Boolean]]("ForceAliasCreation"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(avias.cognitoidp.models.ConfirmSignUpRequest.apply _)
  }
  final implicit val ExpiredCodeExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.ExpiredCodeException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.ExpiredCodeException.apply _)
  }
  final implicit val RespondToAuthChallengeRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.RespondToAuthChallengeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeResponses")).mapN(avias.cognitoidp.models.RespondToAuthChallengeRequest.apply _)
  }
  final implicit val InitiateAuthRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.InitiateAuthRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AuthFlow"), o.get[java.lang.String]("ClientId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AuthParameters"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ClientMetadata")).mapN(avias.cognitoidp.models.InitiateAuthRequest.apply _)
  }
  final implicit val AdminCreateUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminCreateUserResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserType]]("User").map(avias.cognitoidp.models.AdminCreateUserResponse.apply _)
  }
  final implicit val AdminInitiateAuthRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminInitiateAuthRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AuthFlow"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AuthParameters"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ClientMetadata")).mapN(avias.cognitoidp.models.AdminInitiateAuthRequest.apply _)
  }
  final implicit val AdminForgetDeviceRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminForgetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("DeviceKey")).mapN(avias.cognitoidp.models.AdminForgetDeviceRequest.apply _)
  }
  final implicit val GetGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GroupName"), o.get[java.lang.String]("UserPoolId")).mapN(avias.cognitoidp.models.GetGroupRequest.apply _)
  }
  final implicit val ListGroupsRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListGroupsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListGroupsRequest.apply _)
  }
  final implicit val StringAttributeConstraintsTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.StringAttributeConstraintsType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("MinLength"), o.get[scala.Option[java.lang.String]]("MaxLength")).mapN(avias.cognitoidp.models.StringAttributeConstraintsType.apply _)
  }
  final implicit val AdminInitiateAuthResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminInitiateAuthResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[avias.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(avias.cognitoidp.models.AdminInitiateAuthResponse.apply _)
  }
  final implicit val InternalErrorExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InternalErrorException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InternalErrorException.apply _)
  }
  final implicit val GetIdentityProviderByIdentifierResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetIdentityProviderByIdentifierResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(avias.cognitoidp.models.GetIdentityProviderByIdentifierResponse.apply _)
  }
  final implicit val AdminUserGlobalSignOutResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminUserGlobalSignOutResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminUserGlobalSignOutResponse)
  final implicit val AdminConfirmSignUpResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminConfirmSignUpResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminConfirmSignUpResponse)
  final implicit val ProviderUserIdentifierTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.ProviderUserIdentifierType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("ProviderAttributeName"), o.get[scala.Option[java.lang.String]]("ProviderAttributeValue")).mapN(avias.cognitoidp.models.ProviderUserIdentifierType.apply _)
  }
  final implicit val AdminDeleteUserAttributesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDeleteUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.List[java.lang.String]]("UserAttributeNames")).mapN(avias.cognitoidp.models.AdminDeleteUserAttributesRequest.apply _)
  }
  final implicit val AdminUpdateDeviceStatusRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminUpdateDeviceStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("DeviceRememberedStatus")).mapN(avias.cognitoidp.models.AdminUpdateDeviceStatusRequest.apply _)
  }
  final implicit val AdminSetUserSettingsResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminSetUserSettingsResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminSetUserSettingsResponse)
  final implicit val SignUpRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.SignUpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Password"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("UserAttributes"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("ValidationData"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(avias.cognitoidp.models.SignUpRequest.apply _)
  }
  final implicit val ListIdentityProvidersResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListIdentityProvidersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.cognitoidp.models.ProviderDescription]]("Providers"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListIdentityProvidersResponse.apply _)
  }
  final implicit val AdminUserGlobalSignOutRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminUserGlobalSignOutRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminUserGlobalSignOutRequest.apply _)
  }
  final implicit val AdminUpdateUserAttributesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminUpdateUserAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminUpdateUserAttributesResponse)
  final implicit val GetGroupResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.GroupType]]("Group").map(avias.cognitoidp.models.GetGroupResponse.apply _)
  }
  final implicit val StartUserImportJobResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.StartUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserImportJobType]]("UserImportJob").map(avias.cognitoidp.models.StartUserImportJobResponse.apply _)
  }
  final implicit val ConfirmForgotPasswordResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ConfirmForgotPasswordResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.ConfirmForgotPasswordResponse)
  final implicit val ListUsersResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUsersResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.UserType]]]("Users"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.ListUsersResponse.apply _)
  }
  final implicit val UserPoolTaggingExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UserPoolTaggingException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UserPoolTaggingException.apply _)
  }
  final implicit val ConfirmSignUpResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ConfirmSignUpResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.ConfirmSignUpResponse)
  final implicit val NewDeviceMetadataTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.NewDeviceMetadataType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeviceKey"), o.get[scala.Option[java.lang.String]]("DeviceGroupKey")).mapN(avias.cognitoidp.models.NewDeviceMetadataType.apply _)
  }
  final implicit val ConfirmForgotPasswordRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ConfirmForgotPasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Password"), o.get[java.lang.String]("ConfirmationCode"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(avias.cognitoidp.models.ConfirmForgotPasswordRequest.apply _)
  }
  final implicit val CreateGroupResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateGroupResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.GroupType]]("Group").map(avias.cognitoidp.models.CreateGroupResponse.apply _)
  }
  final implicit val UpdateResourceServerRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier"), o.get[java.lang.String]("Name"), o.get[scala.Option[scala.List[avias.cognitoidp.models.ResourceServerScopeType]]]("Scopes")).mapN(avias.cognitoidp.models.UpdateResourceServerRequest.apply _)
  }
  final implicit val AdminResetUserPasswordRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminResetUserPasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminResetUserPasswordRequest.apply _)
  }
  final implicit val AdminListDevicesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminListDevicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.AdminListDevicesRequest.apply _)
  }
  final implicit val ResendConfirmationCodeRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ResendConfirmationCodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Username"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(avias.cognitoidp.models.ResendConfirmationCodeRequest.apply _)
  }
  final implicit val UpdateUserPoolResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateUserPoolResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.UpdateUserPoolResponse)
  final implicit val SignUpResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.SignUpResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Boolean]("UserConfirmed"), o.get[java.lang.String]("UserSub"), o.get[scala.Option[avias.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails")).mapN(avias.cognitoidp.models.SignUpResponse.apply _)
  }
  final implicit val AdminDeleteUserAttributesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDeleteUserAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminDeleteUserAttributesResponse)
  final implicit val GetUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetUserResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[scala.List[avias.cognitoidp.models.AttributeType]]("UserAttributes"), o.get[scala.Option[scala.List[avias.cognitoidp.models.MFAOptionType]]]("MFAOptions")).mapN(avias.cognitoidp.models.GetUserResponse.apply _)
  }
  final implicit val AdminGetUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminGetUserResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[scala.Option[java.time.Instant]]("UserCreateDate"), o.get[scala.Option[java.time.Instant]]("UserLastModifiedDate"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("UserAttributes"), o.get[scala.Option[scala.List[avias.cognitoidp.models.MFAOptionType]]]("MFAOptions"), o.get[scala.Option[java.lang.String]]("UserStatus"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(avias.cognitoidp.models.AdminGetUserResponse.apply _)
  }
  final implicit val UserLambdaValidationExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UserLambdaValidationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UserLambdaValidationException.apply _)
  }
  final implicit val CreateIdentityProviderResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateIdentityProviderResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(avias.cognitoidp.models.CreateIdentityProviderResponse.apply _)
  }
  final implicit val GetUserAttributeVerificationCodeResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetUserAttributeVerificationCodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails").map(avias.cognitoidp.models.GetUserAttributeVerificationCodeResponse.apply _)
  }
  final implicit val InvalidLambdaResponseExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidLambdaResponseException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidLambdaResponseException.apply _)
  }
  final implicit val DeviceConfigurationTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.DeviceConfigurationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Boolean]]("ChallengeRequiredOnNewDevice"), o.get[scala.Option[scala.Boolean]]("DeviceOnlyRememberedOnUserPrompt")).mapN(avias.cognitoidp.models.DeviceConfigurationType.apply _)
  }
  final implicit val AdminGetUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminGetUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminGetUserRequest.apply _)
  }
  final implicit val InitiateAuthResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.InitiateAuthResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[avias.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(avias.cognitoidp.models.InitiateAuthResponse.apply _)
  }
  final implicit val DescribeResourceServerResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeResourceServerResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.ResourceServerType]("ResourceServer").map(avias.cognitoidp.models.DescribeResourceServerResponse.apply _)
  }
  final implicit val DescribeUserPoolResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserPoolResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserPoolType]]("UserPool").map(avias.cognitoidp.models.DescribeUserPoolResponse.apply _)
  }
  final implicit val AuthenticationResultTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.AuthenticationResultType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AccessToken"), o.get[scala.Option[java.lang.String]]("RefreshToken"), o.get[scala.Option[java.lang.String]]("IdToken"), o.get[scala.Option[scala.Int]]("ExpiresIn"), o.get[scala.Option[java.lang.String]]("TokenType"), o.get[scala.Option[avias.cognitoidp.models.NewDeviceMetadataType]]("NewDeviceMetadata")).mapN(avias.cognitoidp.models.AuthenticationResultType.apply _)
  }
  final implicit val DeleteResourceServerRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier")).mapN(avias.cognitoidp.models.DeleteResourceServerRequest.apply _)
  }
  final implicit val ForgotPasswordRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ForgotPasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("Username"), o.get[scala.Option[java.lang.String]]("SecretHash")).mapN(avias.cognitoidp.models.ForgotPasswordRequest.apply _)
  }
  final implicit val AttributeTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.AttributeType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.cognitoidp.models.AttributeType.apply _)
  }
  final implicit val AdminSetUserSettingsRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminSetUserSettingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.List[avias.cognitoidp.models.MFAOptionType]]("MFAOptions")).mapN(avias.cognitoidp.models.AdminSetUserSettingsRequest.apply _)
  }
  final implicit val AdminCreateUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminCreateUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Boolean]]("ForceAliasCreation"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("UserAttributes"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("ValidationData"), o.get[scala.Option[java.lang.String]]("MessageAction"), o.get[scala.Option[java.lang.String]]("TemporaryPassword"), o.get[scala.Option[scala.List[java.lang.String]]]("DesiredDeliveryMediums")).mapN(avias.cognitoidp.models.AdminCreateUserRequest.apply _)
  }
  final implicit val ChangePasswordResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ChangePasswordResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.ChangePasswordResponse)
  final implicit val DescribeUserPoolRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserPoolRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("UserPoolId").map(avias.cognitoidp.models.DescribeUserPoolRequest.apply _)
  }
  final implicit val CodeDeliveryDetailsTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.CodeDeliveryDetailsType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Destination"), o.get[scala.Option[java.lang.String]]("DeliveryMedium"), o.get[scala.Option[java.lang.String]]("AttributeName")).mapN(avias.cognitoidp.models.CodeDeliveryDetailsType.apply _)
  }
  final implicit val AdminDisableUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDisableUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminDisableUserRequest.apply _)
  }
  final implicit val CreateUserPoolClientResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserPoolClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserPoolClientType]]("UserPoolClient").map(avias.cognitoidp.models.CreateUserPoolClientResponse.apply _)
  }
  final implicit val InvalidParameterExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidParameterException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidParameterException.apply _)
  }
  final implicit val CreateUserPoolDomainResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserPoolDomainResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.CreateUserPoolDomainResponse)
  final implicit val AdminEnableUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminEnableUserResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminEnableUserResponse)
  final implicit val SetUserSettingsResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.SetUserSettingsResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.SetUserSettingsResponse)
  final implicit val AddCustomAttributesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AddCustomAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AddCustomAttributesResponse)
  final implicit val DomainDescriptionTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.DomainDescriptionType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AWSAccountId"), o.get[scala.Option[java.lang.String]]("Domain"), o.get[scala.Option[java.lang.String]]("S3Bucket"), o.get[scala.Option[java.lang.String]]("Version"), o.get[scala.Option[java.lang.String]]("CloudFrontDistribution"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.cognitoidp.models.DomainDescriptionType.apply _)
  }
  final implicit val UpdateIdentityProviderRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ProviderName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AttributeMapping"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ProviderDetails"), o.get[scala.Option[scala.List[java.lang.String]]]("IdpIdentifiers")).mapN(avias.cognitoidp.models.UpdateIdentityProviderRequest.apply _)
  }
  final implicit val AdminListDevicesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminListDevicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.DeviceType]]]("Devices"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.AdminListDevicesResponse.apply _)
  }
  final implicit val RespondToAuthChallengeResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.RespondToAuthChallengeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[avias.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(avias.cognitoidp.models.RespondToAuthChallengeResponse.apply _)
  }
  final implicit val UserPoolTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UserPoolType] = io.circe.Decoder.instance { o => 
    for (`name` <- o.get[scala.Option[java.lang.String]]("Name"); `emailVerificationMessage` <- o.get[scala.Option[java.lang.String]]("EmailVerificationMessage"); `lastModifiedDate` <- o.get[scala.Option[java.time.Instant]]("LastModifiedDate"); `creationDate` <- o.get[scala.Option[java.time.Instant]]("CreationDate"); `estimatedNumberOfUsers` <- o.get[scala.Option[scala.Int]]("EstimatedNumberOfUsers"); `adminCreateUserConfig` <- o.get[scala.Option[avias.cognitoidp.models.AdminCreateUserConfigType]]("AdminCreateUserConfig"); `smsConfiguration` <- o.get[scala.Option[avias.cognitoidp.models.SmsConfigurationType]]("SmsConfiguration"); `smsConfigurationFailure` <- o.get[scala.Option[java.lang.String]]("SmsConfigurationFailure"); `emailConfigurationFailure` <- o.get[scala.Option[java.lang.String]]("EmailConfigurationFailure"); `usernameAttributes` <- o.get[scala.Option[scala.List[java.lang.String]]]("UsernameAttributes"); `lambdaConfig` <- o.get[scala.Option[avias.cognitoidp.models.LambdaConfigType]]("LambdaConfig"); `userPoolTags` <- o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("UserPoolTags"); `aliasAttributes` <- o.get[scala.Option[scala.List[java.lang.String]]]("AliasAttributes"); `emailVerificationSubject` <- o.get[scala.Option[java.lang.String]]("EmailVerificationSubject"); `schemaAttributes` <- o.get[scala.Option[scala.List[avias.cognitoidp.models.SchemaAttributeType]]]("SchemaAttributes"); `deviceConfiguration` <- o.get[scala.Option[avias.cognitoidp.models.DeviceConfigurationType]]("DeviceConfiguration"); `autoVerifiedAttributes` <- o.get[scala.Option[scala.List[java.lang.String]]]("AutoVerifiedAttributes"); `emailConfiguration` <- o.get[scala.Option[avias.cognitoidp.models.EmailConfigurationType]]("EmailConfiguration"); `smsVerificationMessage` <- o.get[scala.Option[java.lang.String]]("SmsVerificationMessage"); `smsAuthenticationMessage` <- o.get[scala.Option[java.lang.String]]("SmsAuthenticationMessage"); `verificationMessageTemplate` <- o.get[scala.Option[avias.cognitoidp.models.VerificationMessageTemplateType]]("VerificationMessageTemplate"); `id` <- o.get[scala.Option[java.lang.String]]("Id"); `status` <- o.get[scala.Option[java.lang.String]]("Status"); `mfaConfiguration` <- o.get[scala.Option[java.lang.String]]("MfaConfiguration"); `policies` <- o.get[scala.Option[avias.cognitoidp.models.UserPoolPolicyType]]("Policies")) yield avias.cognitoidp.models.UserPoolType(name, emailVerificationMessage, lastModifiedDate, creationDate, estimatedNumberOfUsers, adminCreateUserConfig, smsConfiguration, smsConfigurationFailure, emailConfigurationFailure, usernameAttributes, lambdaConfig, userPoolTags, aliasAttributes, emailVerificationSubject, schemaAttributes, deviceConfiguration, autoVerifiedAttributes, emailConfiguration, smsVerificationMessage, smsAuthenticationMessage, verificationMessageTemplate, id, status, mfaConfiguration, policies)
  }
  final implicit val AdminConfirmSignUpRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminConfirmSignUpRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username")).mapN(avias.cognitoidp.models.AdminConfirmSignUpRequest.apply _)
  }
  final implicit val GroupTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.GroupType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("GroupName"), o.get[scala.Option[scala.Int]]("Precedence"), o.get[scala.Option[java.lang.String]]("RoleArn"), o.get[scala.Option[java.lang.String]]("UserPoolId")).mapN(avias.cognitoidp.models.GroupType.apply _)
  }
  final implicit val UpdateUserPoolClientRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.List[java.lang.String]]]("CallbackURLs"), o.get[scala.Option[scala.Int]]("RefreshTokenValidity"), o.get[scala.Option[java.lang.String]]("ClientName"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("ReadAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("WriteAttributes"), o.get[scala.Option[scala.List[java.lang.String]]]("LogoutURLs"), o.get[scala.Option[scala.List[java.lang.String]]]("ExplicitAuthFlows"), o.get[scala.Option[scala.List[java.lang.String]]]("AllowedOAuthScopes"), o.get[scala.Option[scala.Boolean]]("AllowedOAuthFlowsUserPoolClient"), o.get[scala.Option[java.lang.String]]("DefaultRedirectURI"), o.get[scala.Option[scala.List[java.lang.String]]]("SupportedIdentityProviders")).mapN(avias.cognitoidp.models.UpdateUserPoolClientRequest.apply _)
  }
  final implicit val ListUsersInGroupResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUsersInGroupResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.UserType]]]("Users"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListUsersInGroupResponse.apply _)
  }
  final implicit val UserImportInProgressExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UserImportInProgressException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UserImportInProgressException.apply _)
  }
  final implicit val DescribeUserPoolClientResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserPoolClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserPoolClientType]]("UserPoolClient").map(avias.cognitoidp.models.DescribeUserPoolClientResponse.apply _)
  }
  final implicit val CreateUserImportJobRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("JobName"), o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("CloudWatchLogsRoleArn")).mapN(avias.cognitoidp.models.CreateUserImportJobRequest.apply _)
  }
  final implicit val CreateUserPoolDomainRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserPoolDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Domain"), o.get[java.lang.String]("UserPoolId")).mapN(avias.cognitoidp.models.CreateUserPoolDomainRequest.apply _)
  }
  final implicit val UpdateUserPoolClientResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateUserPoolClientResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserPoolClientType]]("UserPoolClient").map(avias.cognitoidp.models.UpdateUserPoolClientResponse.apply _)
  }
  final implicit val CreateUserImportJobResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserImportJobType]]("UserImportJob").map(avias.cognitoidp.models.CreateUserImportJobResponse.apply _)
  }
  final implicit val ListUserPoolClientsRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUserPoolClientsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListUserPoolClientsRequest.apply _)
  }
  final implicit val CreateUserPoolResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateUserPoolResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserPoolType]]("UserPool").map(avias.cognitoidp.models.CreateUserPoolResponse.apply _)
  }
  final implicit val ListIdentityProvidersRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListIdentityProvidersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("MaxResults"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListIdentityProvidersRequest.apply _)
  }
  final implicit val UsernameExistsExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UsernameExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UsernameExistsException.apply _)
  }
  final implicit val DescribeResourceServerRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier")).mapN(avias.cognitoidp.models.DescribeResourceServerRequest.apply _)
  }
  final implicit val ProviderDescriptionDecoder: io.circe.Decoder[avias.cognitoidp.models.ProviderDescription] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[java.lang.String]]("ProviderType"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate")).mapN(avias.cognitoidp.models.ProviderDescription.apply _)
  }
  final implicit val ListUserImportJobsResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUserImportJobsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.UserImportJobType]]]("UserImportJobs"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.ListUserImportJobsResponse.apply _)
  }
  final implicit val AdminLinkProviderForUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminLinkProviderForUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[avias.cognitoidp.models.ProviderUserIdentifierType]("DestinationUser"), o.get[avias.cognitoidp.models.ProviderUserIdentifierType]("SourceUser")).mapN(avias.cognitoidp.models.AdminLinkProviderForUserRequest.apply _)
  }
  final implicit val DeleteUserAttributesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserAttributesResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.DeleteUserAttributesResponse)
  final implicit val DeleteUserPoolClientRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ClientId")).mapN(avias.cognitoidp.models.DeleteUserPoolClientRequest.apply _)
  }
  final implicit val AdminRespondToAuthChallengeResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminRespondToAuthChallengeResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ChallengeName"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeParameters"), o.get[scala.Option[avias.cognitoidp.models.AuthenticationResultType]]("AuthenticationResult")).mapN(avias.cognitoidp.models.AdminRespondToAuthChallengeResponse.apply _)
  }
  final implicit val DeviceTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.DeviceType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeviceKey"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("DeviceAttributes"), o.get[scala.Option[java.time.Instant]]("DeviceCreateDate"), o.get[scala.Option[java.time.Instant]]("DeviceLastModifiedDate"), o.get[scala.Option[java.time.Instant]]("DeviceLastAuthenticatedDate")).mapN(avias.cognitoidp.models.DeviceType.apply _)
  }
  final implicit val AdminDisableUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDisableUserResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminDisableUserResponse)
  final implicit val NotAuthorizedExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.NotAuthorizedException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.NotAuthorizedException.apply _)
  }
  final implicit val DeleteUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccessToken").map(avias.cognitoidp.models.DeleteUserRequest.apply _)
  }
  final implicit val EmailConfigurationTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.EmailConfigurationType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("SourceArn"), o.get[scala.Option[java.lang.String]]("ReplyToEmailAddress")).mapN(avias.cognitoidp.models.EmailConfigurationType.apply _)
  }
  final implicit val InvalidUserPoolConfigurationExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidUserPoolConfigurationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidUserPoolConfigurationException.apply _)
  }
  final implicit val ListDevicesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListDevicesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.DeviceType]]]("Devices"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.ListDevicesResponse.apply _)
  }
  final implicit val TooManyRequestsExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.TooManyRequestsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.TooManyRequestsException.apply _)
  }
  final implicit val DuplicateProviderExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.DuplicateProviderException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.DuplicateProviderException.apply _)
  }
  final implicit val MFAOptionTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.MFAOptionType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DeliveryMedium"), o.get[scala.Option[java.lang.String]]("AttributeName")).mapN(avias.cognitoidp.models.MFAOptionType.apply _)
  }
  final implicit val GetCSVHeaderRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetCSVHeaderRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("UserPoolId").map(avias.cognitoidp.models.GetCSVHeaderRequest.apply _)
  }
  final implicit val InvalidSmsRoleAccessPolicyExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidSmsRoleAccessPolicyException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidSmsRoleAccessPolicyException.apply _)
  }
  final implicit val CodeDeliveryFailureExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.CodeDeliveryFailureException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.CodeDeliveryFailureException.apply _)
  }
  final implicit val DescribeUserImportJobRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("JobId")).mapN(avias.cognitoidp.models.DescribeUserImportJobRequest.apply _)
  }
  final implicit val ConcurrentModificationExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.ConcurrentModificationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.ConcurrentModificationException.apply _)
  }
  final implicit val DeleteUserAttributesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[java.lang.String]]("UserAttributeNames"), o.get[java.lang.String]("AccessToken")).mapN(avias.cognitoidp.models.DeleteUserAttributesRequest.apply _)
  }
  final implicit val SetUICustomizationResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.SetUICustomizationResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.UICustomizationType]("UICustomization").map(avias.cognitoidp.models.SetUICustomizationResponse.apply _)
  }
  final implicit val GetDeviceRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetDeviceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("AccessToken")).mapN(avias.cognitoidp.models.GetDeviceRequest.apply _)
  }
  final implicit val IdentityProviderTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.IdentityProviderType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("ProviderName"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("AttributeMapping"), o.get[scala.Option[java.lang.String]]("ProviderType"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ProviderDetails"), o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[scala.List[java.lang.String]]]("IdpIdentifiers")).mapN(avias.cognitoidp.models.IdentityProviderType.apply _)
  }
  final implicit val UserPoolDescriptionTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UserPoolDescriptionType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Name"), o.get[scala.Option[java.time.Instant]]("LastModifiedDate"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[avias.cognitoidp.models.LambdaConfigType]]("LambdaConfig"), o.get[scala.Option[java.lang.String]]("Id"), o.get[scala.Option[java.lang.String]]("Status")).mapN(avias.cognitoidp.models.UserPoolDescriptionType.apply _)
  }
  final implicit val ListUsersInGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUsersInGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("GroupName"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListUsersInGroupRequest.apply _)
  }
  final implicit val DeleteUserPoolDomainRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserPoolDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Domain"), o.get[java.lang.String]("UserPoolId")).mapN(avias.cognitoidp.models.DeleteUserPoolDomainRequest.apply _)
  }
  final implicit val UpdateUserAttributesResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateUserAttributesResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.cognitoidp.models.CodeDeliveryDetailsType]]]("CodeDeliveryDetailsList").map(avias.cognitoidp.models.UpdateUserAttributesResponse.apply _)
  }
  final implicit val ListGroupsResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListGroupsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.GroupType]]]("Groups"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListGroupsResponse.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.LimitExceededException.apply _)
  }
  final implicit val MFAMethodNotFoundExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.MFAMethodNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.MFAMethodNotFoundException.apply _)
  }
  final implicit val SetUserSettingsRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.SetUserSettingsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[scala.List[avias.cognitoidp.models.MFAOptionType]]("MFAOptions")).mapN(avias.cognitoidp.models.SetUserSettingsRequest.apply _)
  }
  final implicit val ListUserPoolsResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUserPoolsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[avias.cognitoidp.models.UserPoolDescriptionType]]]("UserPools"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.ListUserPoolsResponse.apply _)
  }
  final implicit val DescribeIdentityProviderResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeIdentityProviderResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.IdentityProviderType]("IdentityProvider").map(avias.cognitoidp.models.DescribeIdentityProviderResponse.apply _)
  }
  final implicit val ListUsersRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListUsersRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[scala.List[java.lang.String]]]("AttributesToGet"), o.get[scala.Option[java.lang.String]]("Filter"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.ListUsersRequest.apply _)
  }
  final implicit val SetUICustomizationRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.SetUICustomizationRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("ClientId"), o.get[scala.Option[java.lang.String]]("CSS"), o.get[scala.Option[scala.Array[scala.Byte]]]("ImageFile")).mapN(avias.cognitoidp.models.SetUICustomizationRequest.apply _)
  }
  final implicit val VerificationMessageTemplateTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.VerificationMessageTemplateType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("EmailMessage"), o.get[scala.Option[java.lang.String]]("EmailSubjectByLink"), o.get[scala.Option[java.lang.String]]("EmailSubject"), o.get[scala.Option[java.lang.String]]("DefaultEmailOption"), o.get[scala.Option[java.lang.String]]("EmailMessageByLink"), o.get[scala.Option[java.lang.String]]("SmsMessage")).mapN(avias.cognitoidp.models.VerificationMessageTemplateType.apply _)
  }
  final implicit val DeleteUserPoolDomainResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteUserPoolDomainResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.DeleteUserPoolDomainResponse)
  final implicit val UserNotFoundExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UserNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UserNotFoundException.apply _)
  }
  final implicit val CreateResourceServerRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateResourceServerRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Identifier"), o.get[java.lang.String]("Name"), o.get[scala.Option[scala.List[avias.cognitoidp.models.ResourceServerScopeType]]]("Scopes")).mapN(avias.cognitoidp.models.CreateResourceServerRequest.apply _)
  }
  final implicit val ResourceNotFoundExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.ResourceNotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.ResourceNotFoundException.apply _)
  }
  final implicit val UpdateDeviceStatusRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateDeviceStatusRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("DeviceKey"), o.get[scala.Option[java.lang.String]]("DeviceRememberedStatus")).mapN(avias.cognitoidp.models.UpdateDeviceStatusRequest.apply _)
  }
  final implicit val DescribeUserPoolClientRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserPoolClientRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ClientId")).mapN(avias.cognitoidp.models.DescribeUserPoolClientRequest.apply _)
  }
  final implicit val ChangePasswordRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ChangePasswordRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("PreviousPassword"), o.get[java.lang.String]("ProposedPassword"), o.get[java.lang.String]("AccessToken")).mapN(avias.cognitoidp.models.ChangePasswordRequest.apply _)
  }
  final implicit val GlobalSignOutRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GlobalSignOutRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AccessToken").map(avias.cognitoidp.models.GlobalSignOutRequest.apply _)
  }
  final implicit val UpdateUserAttributesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.UpdateUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.cognitoidp.models.AttributeType]]("UserAttributes"), o.get[java.lang.String]("AccessToken")).mapN(avias.cognitoidp.models.UpdateUserAttributesRequest.apply _)
  }
  final implicit val DescribeIdentityProviderRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ProviderName")).mapN(avias.cognitoidp.models.DescribeIdentityProviderRequest.apply _)
  }
  final implicit val ScopeDoesNotExistExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.ScopeDoesNotExistException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.ScopeDoesNotExistException.apply _)
  }
  final implicit val DeleteIdentityProviderRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DeleteIdentityProviderRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("ProviderName")).mapN(avias.cognitoidp.models.DeleteIdentityProviderRequest.apply _)
  }
  final implicit val UserTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UserType] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("UserCreateDate"), o.get[scala.Option[java.time.Instant]]("UserLastModifiedDate"), o.get[scala.Option[java.lang.String]]("Username"), o.get[scala.Option[scala.List[avias.cognitoidp.models.AttributeType]]]("Attributes"), o.get[scala.Option[scala.List[avias.cognitoidp.models.MFAOptionType]]]("MFAOptions"), o.get[scala.Option[java.lang.String]]("UserStatus"), o.get[scala.Option[scala.Boolean]]("Enabled")).mapN(avias.cognitoidp.models.UserType.apply _)
  }
  final implicit val CodeMismatchExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.CodeMismatchException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.CodeMismatchException.apply _)
  }
  final implicit val ResourceServerScopeTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.ResourceServerScopeType] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ScopeName"), o.get[java.lang.String]("ScopeDescription")).mapN(avias.cognitoidp.models.ResourceServerScopeType.apply _)
  }
  final implicit val UnsupportedUserStateExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UnsupportedUserStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UnsupportedUserStateException.apply _)
  }
  final implicit val GetIdentityProviderByIdentifierRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetIdentityProviderByIdentifierRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("IdpIdentifier")).mapN(avias.cognitoidp.models.GetIdentityProviderByIdentifierRequest.apply _)
  }
  final implicit val GetCSVHeaderResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GetCSVHeaderResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("UserPoolId"), o.get[scala.Option[scala.List[java.lang.String]]]("CSVHeader")).mapN(avias.cognitoidp.models.GetCSVHeaderResponse.apply _)
  }
  final implicit val AdminUpdateDeviceStatusResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminUpdateDeviceStatusResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminUpdateDeviceStatusResponse)
  final implicit val GroupExistsExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.GroupExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.GroupExistsException.apply _)
  }
  final implicit val AddCustomAttributesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AddCustomAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[scala.List[avias.cognitoidp.models.SchemaAttributeType]]("CustomAttributes")).mapN(avias.cognitoidp.models.AddCustomAttributesRequest.apply _)
  }
  final implicit val AdminRespondToAuthChallengeRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminRespondToAuthChallengeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("ClientId"), o.get[java.lang.String]("ChallengeName"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[java.lang.String]]("Session"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("ChallengeResponses")).mapN(avias.cognitoidp.models.AdminRespondToAuthChallengeRequest.apply _)
  }
  final implicit val AdminListGroupsForUserRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminListGroupsForUserRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Username"), o.get[java.lang.String]("UserPoolId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("NextToken")).mapN(avias.cognitoidp.models.AdminListGroupsForUserRequest.apply _)
  }
  final implicit val InvalidOAuthFlowExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.InvalidOAuthFlowException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.InvalidOAuthFlowException.apply _)
  }
  final implicit val AdminAddUserToGroupRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminAddUserToGroupRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[java.lang.String]("GroupName")).mapN(avias.cognitoidp.models.AdminAddUserToGroupRequest.apply _)
  }
  final implicit val CreateResourceServerResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.CreateResourceServerResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.ResourceServerType]("ResourceServer").map(avias.cognitoidp.models.CreateResourceServerResponse.apply _)
  }
  final implicit val UserPoolPolicyTypeDecoder: io.circe.Decoder[avias.cognitoidp.models.UserPoolPolicyType] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.PasswordPolicyType]]("PasswordPolicy").map(avias.cognitoidp.models.UserPoolPolicyType.apply _)
  }
  final implicit val GetUserAttributeVerificationCodeRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.GetUserAttributeVerificationCodeRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[java.lang.String]("AttributeName")).mapN(avias.cognitoidp.models.GetUserAttributeVerificationCodeRequest.apply _)
  }
  final implicit val AdminGetDeviceResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminGetDeviceResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.cognitoidp.models.DeviceType]("Device").map(avias.cognitoidp.models.AdminGetDeviceResponse.apply _)
  }
  final implicit val ListDevicesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.ListDevicesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AccessToken"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("PaginationToken")).mapN(avias.cognitoidp.models.ListDevicesRequest.apply _)
  }
  final implicit val StopUserImportJobResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.StopUserImportJobResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.UserImportJobType]]("UserImportJob").map(avias.cognitoidp.models.StopUserImportJobResponse.apply _)
  }
  final implicit val ResendConfirmationCodeResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.ResendConfirmationCodeResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[avias.cognitoidp.models.CodeDeliveryDetailsType]]("CodeDeliveryDetails").map(avias.cognitoidp.models.ResendConfirmationCodeResponse.apply _)
  }
  final implicit val GlobalSignOutResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.GlobalSignOutResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.GlobalSignOutResponse)
  final implicit val UnsupportedIdentityProviderExceptionDecoder: io.circe.Decoder[avias.cognitoidp.models.UnsupportedIdentityProviderException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.cognitoidp.models.UnsupportedIdentityProviderException.apply _)
  }
  final implicit val StartUserImportJobRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.StartUserImportJobRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("JobId")).mapN(avias.cognitoidp.models.StartUserImportJobRequest.apply _)
  }
  final implicit val DescribeUserPoolDomainRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.DescribeUserPoolDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Domain").map(avias.cognitoidp.models.DescribeUserPoolDomainRequest.apply _)
  }
  final implicit val AdminDisableProviderForUserResponseDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminDisableProviderForUserResponse.type] = io.circe.Decoder.decodeUnit.as(avias.cognitoidp.models.AdminDisableProviderForUserResponse)
  final implicit val AdminUpdateUserAttributesRequestDecoder: io.circe.Decoder[avias.cognitoidp.models.AdminUpdateUserAttributesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("UserPoolId"), o.get[java.lang.String]("Username"), o.get[scala.List[avias.cognitoidp.models.AttributeType]]("UserAttributes")).mapN(avias.cognitoidp.models.AdminUpdateUserAttributesRequest.apply _)
  }
}