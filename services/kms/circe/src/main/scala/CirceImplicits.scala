package org.lyranthe.araethura.kms
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListGrantsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListGrantsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Grants" -> o.grants.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val GenerateRandomRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GenerateRandomRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NumberOfBytes" -> o.numberOfBytes.asJson)
  }
  final implicit val InvalidImportTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidImportTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GenerateDataKeyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GenerateDataKeyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "Plaintext" -> o.plaintext.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ListAliasesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListAliasesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val EncryptRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.EncryptRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Plaintext" -> o.plaintext.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val IncorrectKeyMaterialExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.IncorrectKeyMaterialException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GrantConstraintsEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GrantConstraints] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionContextSubset" -> o.encryptionContextSubset.asJson, "EncryptionContextEquals" -> o.encryptionContextEquals.asJson)
  }
  final implicit val KeyMetadataEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.KeyMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "AWSAccountId" -> o.awsaccountId.asJson, "CreationDate" -> o.creationDate.asJson, "DeletionDate" -> o.deletionDate.asJson, "ValidTo" -> o.validTo.asJson, "ExpirationModel" -> o.expirationModel.asJson, "Origin" -> o.origin.asJson, "Arn" -> o.arn.asJson, "KeyManager" -> o.keyManager.asJson, "Enabled" -> o.enabled.asJson, "KeyState" -> o.keyState.asJson, "Description" -> o.description.asJson, "KeyUsage" -> o.keyUsage.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutKeyPolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.PutKeyPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "PolicyName" -> o.policyName.asJson, "Policy" -> o.policy.asJson, "BypassPolicyLockoutSafetyCheck" -> o.bypassPolicyLockoutSafetyCheck.asJson)
  }
  final implicit val DecryptRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DecryptRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val KeyUnavailableExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.KeyUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListRetirableGrantsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListRetirableGrantsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RetiringPrincipal" -> o.retiringPrincipal.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InvalidMarkerExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidMarkerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeKeyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DescribeKeyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyMetadata" -> o.keyMetadata.asJson)
  }
  final implicit val AlreadyExistsExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.AlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("TagKey" -> o.tagKey.asJson, "TagValue" -> o.tagValue.asJson)
  }
  final implicit val EncryptResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.EncryptResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val KeyListEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.KeyListEntry] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "KeyArn" -> o.keyArn.asJson)
  }
  final implicit val MalformedPolicyDocumentExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.MalformedPolicyDocumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListAliasesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListAliasesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Aliases" -> o.aliases.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val AliasListEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.AliasListEntry] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson, "AliasArn" -> o.aliasArn.asJson, "TargetKeyId" -> o.targetKeyId.asJson)
  }
  final implicit val KMSInvalidStateExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.KMSInvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListResourceTagsResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListResourceTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val DeleteAliasRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DeleteAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val GetKeyPolicyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GetKeyPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val GetParametersForImportResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GetParametersForImportResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "ImportToken" -> o.importToken.asJson, "PublicKey" -> o.publicKey.asJson, "ParametersValidTo" -> o.parametersValidTo.asJson)
  }
  final implicit val InvalidArnExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidArnException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidAliasNameExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidAliasNameException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetParametersForImportRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GetParametersForImportRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "WrappingAlgorithm" -> o.wrappingAlgorithm.asJson, "WrappingKeySpec" -> o.wrappingKeySpec.asJson)
  }
  final implicit val GenerateDataKeyWithoutPlaintextResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GenerateDataKeyWithoutPlaintextResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ReEncryptRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ReEncryptRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "DestinationKeyId" -> o.destinationKeyId.asJson, "SourceEncryptionContext" -> o.sourceEncryptionContext.asJson, "DestinationEncryptionContext" -> o.destinationEncryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val CancelKeyDeletionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CancelKeyDeletionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val RetireGrantRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.RetireGrantRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GrantToken" -> o.grantToken.asJson, "KeyId" -> o.keyId.asJson, "GrantId" -> o.grantId.asJson)
  }
  final implicit val EnableKeyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.EnableKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val InvalidCiphertextExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidCiphertextException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateAliasRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CreateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson, "TargetKeyId" -> o.targetKeyId.asJson)
  }
  final implicit val ListKeysResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListKeysResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Keys" -> o.keys.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val CreateGrantResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CreateGrantResponse] = io.circe.Encoder.instance { o => 
    Json.obj("GrantToken" -> o.grantToken.asJson, "GrantId" -> o.grantId.asJson)
  }
  final implicit val ReEncryptResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ReEncryptResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "SourceKeyId" -> o.sourceKeyId.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetKeyPolicyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GetKeyPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "PolicyName" -> o.policyName.asJson)
  }
  final implicit val InvalidKeyUsageExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidKeyUsageException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListResourceTagsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListResourceTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DecryptResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DecryptResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Plaintext" -> o.plaintext.asJson)
  }
  final implicit val ListKeyPoliciesResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListKeyPoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyNames" -> o.policyNames.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val CancelKeyDeletionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CancelKeyDeletionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val GenerateDataKeyWithoutPlaintextRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GenerateDataKeyWithoutPlaintextRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson, "NumberOfBytes" -> o.numberOfBytes.asJson, "KeySpec" -> o.keySpec.asJson)
  }
  final implicit val GrantListEntryEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GrantListEntry] = io.circe.Encoder.instance { o => 
    Json.obj("GrantId" -> o.grantId.asJson, "CreationDate" -> o.creationDate.asJson, "GranteePrincipal" -> o.granteePrincipal.asJson, "RetiringPrincipal" -> o.retiringPrincipal.asJson, "IssuingAccount" -> o.issuingAccount.asJson, "Constraints" -> o.constraints.asJson, "KeyId" -> o.keyId.asJson, "Operations" -> o.operations.asJson, "Name" -> o.name.asJson)
  }
  final implicit val GenerateDataKeyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GenerateDataKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson, "NumberOfBytes" -> o.numberOfBytes.asJson, "KeySpec" -> o.keySpec.asJson)
  }
  final implicit val GetKeyRotationStatusResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GetKeyRotationStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyRotationEnabled" -> o.keyRotationEnabled.asJson)
  }
  final implicit val ListKeyPoliciesRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListKeyPoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val CreateKeyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CreateKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Origin" -> o.origin.asJson, "Tags" -> o.tags.asJson, "Policy" -> o.policy.asJson, "BypassPolicyLockoutSafetyCheck" -> o.bypassPolicyLockoutSafetyCheck.asJson, "Description" -> o.description.asJson, "KeyUsage" -> o.keyUsage.asJson)
  }
  final implicit val ImportKeyMaterialResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ImportKeyMaterialResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateGrantRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CreateGrantRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GranteePrincipal" -> o.granteePrincipal.asJson, "KeyId" -> o.keyId.asJson, "Operations" -> o.operations.asJson, "RetiringPrincipal" -> o.retiringPrincipal.asJson, "Constraints" -> o.constraints.asJson, "GrantTokens" -> o.grantTokens.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DisableKeyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DisableKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val GetKeyRotationStatusRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GetKeyRotationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val ListGrantsRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListGrantsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ListKeysRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ListKeysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ImportKeyMaterialRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ImportKeyMaterialRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "ImportToken" -> o.importToken.asJson, "EncryptedKeyMaterial" -> o.encryptedKeyMaterial.asJson, "ValidTo" -> o.validTo.asJson, "ExpirationModel" -> o.expirationModel.asJson)
  }
  final implicit val RevokeGrantRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.RevokeGrantRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "GrantId" -> o.grantId.asJson)
  }
  final implicit val DisabledExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DisabledException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateKeyDescriptionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.UpdateKeyDescriptionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Description" -> o.description.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidGrantIdExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidGrantIdException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ScheduleKeyDeletionResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ScheduleKeyDeletionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "DeletionDate" -> o.deletionDate.asJson)
  }
  final implicit val DisableKeyRotationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DisableKeyRotationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.UnsupportedOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExpiredImportTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ExpiredImportTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidGrantTokenExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.InvalidGrantTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GenerateRandomResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.GenerateRandomResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Plaintext" -> o.plaintext.asJson)
  }
  final implicit val TagExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.TagException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KMSInternalExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.KMSInternalException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ScheduleKeyDeletionRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.ScheduleKeyDeletionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "PendingWindowInDays" -> o.pendingWindowInDays.asJson)
  }
  final implicit val UpdateAliasRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.UpdateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson, "TargetKeyId" -> o.targetKeyId.asJson)
  }
  final implicit val EnableKeyRotationRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.EnableKeyRotationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val CreateKeyResponseEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.CreateKeyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyMetadata" -> o.keyMetadata.asJson)
  }
  final implicit val DescribeKeyRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DescribeKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val DeleteImportedKeyMaterialRequestEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DeleteImportedKeyMaterialRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val DependencyTimeoutExceptionEncoder: io.circe.Encoder[org.lyranthe.araethura.kms.models.DependencyTimeoutException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListGrantsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListGrantsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.kms.models.GrantListEntry]]]("Grants"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(org.lyranthe.araethura.kms.models.ListGrantsResponse.apply _)
  }
  final implicit val GenerateRandomRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GenerateRandomRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("NumberOfBytes").map(org.lyranthe.araethura.kms.models.GenerateRandomRequest.apply _)
  }
  final implicit val InvalidImportTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidImportTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidImportTokenException.apply _)
  }
  final implicit val GenerateDataKeyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GenerateDataKeyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[scala.Array[scala.Byte]]]("Plaintext"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(org.lyranthe.araethura.kms.models.GenerateDataKeyResponse.apply _)
  }
  final implicit val ListAliasesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListAliasesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.kms.models.ListAliasesRequest.apply _)
  }
  final implicit val EncryptRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.EncryptRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Array[scala.Byte]]("Plaintext"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(org.lyranthe.araethura.kms.models.EncryptRequest.apply _)
  }
  final implicit val IncorrectKeyMaterialExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.IncorrectKeyMaterialException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.IncorrectKeyMaterialException.apply _)
  }
  final implicit val GrantConstraintsDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GrantConstraints] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContextSubset"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContextEquals")).mapN(org.lyranthe.araethura.kms.models.GrantConstraints.apply _)
  }
  final implicit val KeyMetadataDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.KeyMetadata] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[java.lang.String]]("AWSAccountId"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("DeletionDate"), o.get[scala.Option[java.time.Instant]]("ValidTo"), o.get[scala.Option[java.lang.String]]("ExpirationModel"), o.get[scala.Option[java.lang.String]]("Origin"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("KeyManager"), o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[java.lang.String]]("KeyState"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("KeyUsage")).mapN(org.lyranthe.araethura.kms.models.KeyMetadata.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.NotFoundException.apply _)
  }
  final implicit val PutKeyPolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.PutKeyPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("PolicyName"), o.get[java.lang.String]("Policy"), o.get[scala.Option[scala.Boolean]]("BypassPolicyLockoutSafetyCheck")).mapN(org.lyranthe.araethura.kms.models.PutKeyPolicyRequest.apply _)
  }
  final implicit val DecryptRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DecryptRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("CiphertextBlob"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(org.lyranthe.araethura.kms.models.DecryptRequest.apply _)
  }
  final implicit val KeyUnavailableExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.KeyUnavailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.KeyUnavailableException.apply _)
  }
  final implicit val ListRetirableGrantsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListRetirableGrantsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RetiringPrincipal"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.kms.models.ListRetirableGrantsRequest.apply _)
  }
  final implicit val InvalidMarkerExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidMarkerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidMarkerException.apply _)
  }
  final implicit val DescribeKeyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DescribeKeyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.kms.models.KeyMetadata]]("KeyMetadata").map(org.lyranthe.araethura.kms.models.DescribeKeyResponse.apply _)
  }
  final implicit val AlreadyExistsExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.AlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.AlreadyExistsException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TagKey"), o.get[java.lang.String]("TagValue")).mapN(org.lyranthe.araethura.kms.models.Tag.apply _)
  }
  final implicit val EncryptResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.EncryptResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(org.lyranthe.araethura.kms.models.EncryptResponse.apply _)
  }
  final implicit val KeyListEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.KeyListEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.lang.String]]("KeyArn")).mapN(org.lyranthe.araethura.kms.models.KeyListEntry.apply _)
  }
  final implicit val MalformedPolicyDocumentExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.MalformedPolicyDocumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.MalformedPolicyDocumentException.apply _)
  }
  final implicit val ListAliasesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListAliasesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.kms.models.AliasListEntry]]]("Aliases"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(org.lyranthe.araethura.kms.models.ListAliasesResponse.apply _)
  }
  final implicit val AliasListEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.AliasListEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AliasName"), o.get[scala.Option[java.lang.String]]("AliasArn"), o.get[scala.Option[java.lang.String]]("TargetKeyId")).mapN(org.lyranthe.araethura.kms.models.AliasListEntry.apply _)
  }
  final implicit val KMSInvalidStateExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.KMSInvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.KMSInvalidStateException.apply _)
  }
  final implicit val ListResourceTagsResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListResourceTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.kms.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(org.lyranthe.araethura.kms.models.ListResourceTagsResponse.apply _)
  }
  final implicit val DeleteAliasRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DeleteAliasRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasName").map(org.lyranthe.araethura.kms.models.DeleteAliasRequest.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.List[org.lyranthe.araethura.kms.models.Tag]]("Tags")).mapN(org.lyranthe.araethura.kms.models.TagResourceRequest.apply _)
  }
  final implicit val GetKeyPolicyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GetKeyPolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Policy").map(org.lyranthe.araethura.kms.models.GetKeyPolicyResponse.apply _)
  }
  final implicit val GetParametersForImportResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GetParametersForImportResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.Array[scala.Byte]]]("ImportToken"), o.get[scala.Option[scala.Array[scala.Byte]]]("PublicKey"), o.get[scala.Option[java.time.Instant]]("ParametersValidTo")).mapN(org.lyranthe.araethura.kms.models.GetParametersForImportResponse.apply _)
  }
  final implicit val InvalidArnExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidArnException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidArnException.apply _)
  }
  final implicit val InvalidAliasNameExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidAliasNameException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidAliasNameException.apply _)
  }
  final implicit val GetParametersForImportRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GetParametersForImportRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("WrappingAlgorithm"), o.get[java.lang.String]("WrappingKeySpec")).mapN(org.lyranthe.araethura.kms.models.GetParametersForImportRequest.apply _)
  }
  final implicit val GenerateDataKeyWithoutPlaintextResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GenerateDataKeyWithoutPlaintextResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(org.lyranthe.araethura.kms.models.GenerateDataKeyWithoutPlaintextResponse.apply _)
  }
  final implicit val ReEncryptRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ReEncryptRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("CiphertextBlob"), o.get[java.lang.String]("DestinationKeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("SourceEncryptionContext"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("DestinationEncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(org.lyranthe.araethura.kms.models.ReEncryptRequest.apply _)
  }
  final implicit val CancelKeyDeletionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CancelKeyDeletionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("KeyId").map(org.lyranthe.araethura.kms.models.CancelKeyDeletionResponse.apply _)
  }
  final implicit val RetireGrantRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.RetireGrantRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GrantToken"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.lang.String]]("GrantId")).mapN(org.lyranthe.araethura.kms.models.RetireGrantRequest.apply _)
  }
  final implicit val EnableKeyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.EnableKeyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.EnableKeyRequest.apply _)
  }
  final implicit val InvalidCiphertextExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidCiphertextException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidCiphertextException.apply _)
  }
  final implicit val CreateAliasRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CreateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AliasName"), o.get[java.lang.String]("TargetKeyId")).mapN(org.lyranthe.araethura.kms.models.CreateAliasRequest.apply _)
  }
  final implicit val ListKeysResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListKeysResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[org.lyranthe.araethura.kms.models.KeyListEntry]]]("Keys"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(org.lyranthe.araethura.kms.models.ListKeysResponse.apply _)
  }
  final implicit val CreateGrantResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CreateGrantResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GrantToken"), o.get[scala.Option[java.lang.String]]("GrantId")).mapN(org.lyranthe.araethura.kms.models.CreateGrantResponse.apply _)
  }
  final implicit val ReEncryptResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ReEncryptResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[java.lang.String]]("SourceKeyId"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(org.lyranthe.araethura.kms.models.ReEncryptResponse.apply _)
  }
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(org.lyranthe.araethura.kms.models.UntagResourceRequest.apply _)
  }
  final implicit val GetKeyPolicyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GetKeyPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("PolicyName")).mapN(org.lyranthe.araethura.kms.models.GetKeyPolicyRequest.apply _)
  }
  final implicit val InvalidKeyUsageExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidKeyUsageException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidKeyUsageException.apply _)
  }
  final implicit val ListResourceTagsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListResourceTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.kms.models.ListResourceTagsRequest.apply _)
  }
  final implicit val DecryptResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DecryptResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.Array[scala.Byte]]]("Plaintext")).mapN(org.lyranthe.araethura.kms.models.DecryptResponse.apply _)
  }
  final implicit val ListKeyPoliciesResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListKeyPoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("PolicyNames"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(org.lyranthe.araethura.kms.models.ListKeyPoliciesResponse.apply _)
  }
  final implicit val CancelKeyDeletionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CancelKeyDeletionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.CancelKeyDeletionRequest.apply _)
  }
  final implicit val GenerateDataKeyWithoutPlaintextRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GenerateDataKeyWithoutPlaintextRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens"), o.get[scala.Option[scala.Int]]("NumberOfBytes"), o.get[scala.Option[java.lang.String]]("KeySpec")).mapN(org.lyranthe.araethura.kms.models.GenerateDataKeyWithoutPlaintextRequest.apply _)
  }
  final implicit val GrantListEntryDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GrantListEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GrantId"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("GranteePrincipal"), o.get[scala.Option[java.lang.String]]("RetiringPrincipal"), o.get[scala.Option[java.lang.String]]("IssuingAccount"), o.get[scala.Option[org.lyranthe.araethura.kms.models.GrantConstraints]]("Constraints"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.List[java.lang.String]]]("Operations"), o.get[scala.Option[java.lang.String]]("Name")).mapN(org.lyranthe.araethura.kms.models.GrantListEntry.apply _)
  }
  final implicit val GenerateDataKeyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GenerateDataKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens"), o.get[scala.Option[scala.Int]]("NumberOfBytes"), o.get[scala.Option[java.lang.String]]("KeySpec")).mapN(org.lyranthe.araethura.kms.models.GenerateDataKeyRequest.apply _)
  }
  final implicit val GetKeyRotationStatusResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GetKeyRotationStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("KeyRotationEnabled").map(org.lyranthe.araethura.kms.models.GetKeyRotationStatusResponse.apply _)
  }
  final implicit val ListKeyPoliciesRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListKeyPoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.kms.models.ListKeyPoliciesRequest.apply _)
  }
  final implicit val CreateKeyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CreateKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Origin"), o.get[scala.Option[scala.List[org.lyranthe.araethura.kms.models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Policy"), o.get[scala.Option[scala.Boolean]]("BypassPolicyLockoutSafetyCheck"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("KeyUsage")).mapN(org.lyranthe.araethura.kms.models.CreateKeyRequest.apply _)
  }
  final implicit val ImportKeyMaterialResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ImportKeyMaterialResponse.type] = io.circe.Decoder.decodeUnit.as(org.lyranthe.araethura.kms.models.ImportKeyMaterialResponse)
  final implicit val CreateGrantRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CreateGrantRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GranteePrincipal"), o.get[java.lang.String]("KeyId"), o.get[scala.List[java.lang.String]]("Operations"), o.get[scala.Option[java.lang.String]]("RetiringPrincipal"), o.get[scala.Option[org.lyranthe.araethura.kms.models.GrantConstraints]]("Constraints"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens"), o.get[scala.Option[java.lang.String]]("Name")).mapN(org.lyranthe.araethura.kms.models.CreateGrantRequest.apply _)
  }
  final implicit val DisableKeyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DisableKeyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.DisableKeyRequest.apply _)
  }
  final implicit val GetKeyRotationStatusRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GetKeyRotationStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.GetKeyRotationStatusRequest.apply _)
  }
  final implicit val ListGrantsRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListGrantsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.kms.models.ListGrantsRequest.apply _)
  }
  final implicit val ListKeysRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ListKeysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(org.lyranthe.araethura.kms.models.ListKeysRequest.apply _)
  }
  final implicit val ImportKeyMaterialRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ImportKeyMaterialRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Array[scala.Byte]]("ImportToken"), o.get[scala.Array[scala.Byte]]("EncryptedKeyMaterial"), o.get[scala.Option[java.time.Instant]]("ValidTo"), o.get[scala.Option[java.lang.String]]("ExpirationModel")).mapN(org.lyranthe.araethura.kms.models.ImportKeyMaterialRequest.apply _)
  }
  final implicit val RevokeGrantRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.RevokeGrantRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("GrantId")).mapN(org.lyranthe.araethura.kms.models.RevokeGrantRequest.apply _)
  }
  final implicit val DisabledExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DisabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.DisabledException.apply _)
  }
  final implicit val UpdateKeyDescriptionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.UpdateKeyDescriptionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("Description")).mapN(org.lyranthe.araethura.kms.models.UpdateKeyDescriptionRequest.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.LimitExceededException.apply _)
  }
  final implicit val InvalidGrantIdExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidGrantIdException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidGrantIdException.apply _)
  }
  final implicit val ScheduleKeyDeletionResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ScheduleKeyDeletionResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.time.Instant]]("DeletionDate")).mapN(org.lyranthe.araethura.kms.models.ScheduleKeyDeletionResponse.apply _)
  }
  final implicit val DisableKeyRotationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DisableKeyRotationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.DisableKeyRotationRequest.apply _)
  }
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.UnsupportedOperationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.UnsupportedOperationException.apply _)
  }
  final implicit val ExpiredImportTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ExpiredImportTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.ExpiredImportTokenException.apply _)
  }
  final implicit val InvalidGrantTokenExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.InvalidGrantTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.InvalidGrantTokenException.apply _)
  }
  final implicit val GenerateRandomResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.GenerateRandomResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Array[scala.Byte]]]("Plaintext").map(org.lyranthe.araethura.kms.models.GenerateRandomResponse.apply _)
  }
  final implicit val TagExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.TagException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.TagException.apply _)
  }
  final implicit val KMSInternalExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.KMSInternalException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.KMSInternalException.apply _)
  }
  final implicit val ScheduleKeyDeletionRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.ScheduleKeyDeletionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("PendingWindowInDays")).mapN(org.lyranthe.araethura.kms.models.ScheduleKeyDeletionRequest.apply _)
  }
  final implicit val UpdateAliasRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.UpdateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AliasName"), o.get[java.lang.String]("TargetKeyId")).mapN(org.lyranthe.araethura.kms.models.UpdateAliasRequest.apply _)
  }
  final implicit val EnableKeyRotationRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.EnableKeyRotationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.EnableKeyRotationRequest.apply _)
  }
  final implicit val CreateKeyResponseDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.CreateKeyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[org.lyranthe.araethura.kms.models.KeyMetadata]]("KeyMetadata").map(org.lyranthe.araethura.kms.models.CreateKeyResponse.apply _)
  }
  final implicit val DescribeKeyRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DescribeKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(org.lyranthe.araethura.kms.models.DescribeKeyRequest.apply _)
  }
  final implicit val DeleteImportedKeyMaterialRequestDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DeleteImportedKeyMaterialRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(org.lyranthe.araethura.kms.models.DeleteImportedKeyMaterialRequest.apply _)
  }
  final implicit val DependencyTimeoutExceptionDecoder: io.circe.Decoder[org.lyranthe.araethura.kms.models.DependencyTimeoutException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(org.lyranthe.araethura.kms.models.DependencyTimeoutException.apply _)
  }
}