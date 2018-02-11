package org.lyranthe.araethura.kms
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends org.lyranthe.araethura.common.DefaultCodecs {
  final implicit val ListGrantsResponseEncoder: io.circe.Encoder[models.ListGrantsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Grants" -> o.grants.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val GenerateRandomRequestEncoder: io.circe.Encoder[models.GenerateRandomRequest] = io.circe.Encoder.instance { o => 
    Json.obj("NumberOfBytes" -> o.numberOfBytes.asJson)
  }
  final implicit val InvalidImportTokenExceptionEncoder: io.circe.Encoder[models.InvalidImportTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GenerateDataKeyResponseEncoder: io.circe.Encoder[models.GenerateDataKeyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "Plaintext" -> o.plaintext.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ListAliasesRequestEncoder: io.circe.Encoder[models.ListAliasesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val EncryptRequestEncoder: io.circe.Encoder[models.EncryptRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Plaintext" -> o.plaintext.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val IncorrectKeyMaterialExceptionEncoder: io.circe.Encoder[models.IncorrectKeyMaterialException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GrantConstraintsEncoder: io.circe.Encoder[models.GrantConstraints] = io.circe.Encoder.instance { o => 
    Json.obj("EncryptionContextSubset" -> o.encryptionContextSubset.asJson, "EncryptionContextEquals" -> o.encryptionContextEquals.asJson)
  }
  final implicit val KeyMetadataEncoder: io.circe.Encoder[models.KeyMetadata] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "AWSAccountId" -> o.awsaccountId.asJson, "CreationDate" -> o.creationDate.asJson, "DeletionDate" -> o.deletionDate.asJson, "ValidTo" -> o.validTo.asJson, "ExpirationModel" -> o.expirationModel.asJson, "Origin" -> o.origin.asJson, "Arn" -> o.arn.asJson, "KeyManager" -> o.keyManager.asJson, "Enabled" -> o.enabled.asJson, "KeyState" -> o.keyState.asJson, "Description" -> o.description.asJson, "KeyUsage" -> o.keyUsage.asJson)
  }
  final implicit val NotFoundExceptionEncoder: io.circe.Encoder[models.NotFoundException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val PutKeyPolicyRequestEncoder: io.circe.Encoder[models.PutKeyPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "PolicyName" -> o.policyName.asJson, "Policy" -> o.policy.asJson, "BypassPolicyLockoutSafetyCheck" -> o.bypassPolicyLockoutSafetyCheck.asJson)
  }
  final implicit val DecryptRequestEncoder: io.circe.Encoder[models.DecryptRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val KeyUnavailableExceptionEncoder: io.circe.Encoder[models.KeyUnavailableException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListRetirableGrantsRequestEncoder: io.circe.Encoder[models.ListRetirableGrantsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("RetiringPrincipal" -> o.retiringPrincipal.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val InvalidMarkerExceptionEncoder: io.circe.Encoder[models.InvalidMarkerException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DescribeKeyResponseEncoder: io.circe.Encoder[models.DescribeKeyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyMetadata" -> o.keyMetadata.asJson)
  }
  final implicit val AlreadyExistsExceptionEncoder: io.circe.Encoder[models.AlreadyExistsException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("TagKey" -> o.tagKey.asJson, "TagValue" -> o.tagValue.asJson)
  }
  final implicit val EncryptResponseEncoder: io.circe.Encoder[models.EncryptResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val KeyListEntryEncoder: io.circe.Encoder[models.KeyListEntry] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "KeyArn" -> o.keyArn.asJson)
  }
  final implicit val MalformedPolicyDocumentExceptionEncoder: io.circe.Encoder[models.MalformedPolicyDocumentException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListAliasesResponseEncoder: io.circe.Encoder[models.ListAliasesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Aliases" -> o.aliases.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val AliasListEntryEncoder: io.circe.Encoder[models.AliasListEntry] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson, "AliasArn" -> o.aliasArn.asJson, "TargetKeyId" -> o.targetKeyId.asJson)
  }
  final implicit val KMSInvalidStateExceptionEncoder: io.circe.Encoder[models.KMSInvalidStateException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListResourceTagsResponseEncoder: io.circe.Encoder[models.ListResourceTagsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Tags" -> o.tags.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val DeleteAliasRequestEncoder: io.circe.Encoder[models.DeleteAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson)
  }
  final implicit val TagResourceRequestEncoder: io.circe.Encoder[models.TagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Tags" -> o.tags.asJson)
  }
  final implicit val GetKeyPolicyResponseEncoder: io.circe.Encoder[models.GetKeyPolicyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Policy" -> o.policy.asJson)
  }
  final implicit val GetParametersForImportResponseEncoder: io.circe.Encoder[models.GetParametersForImportResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "ImportToken" -> o.importToken.asJson, "PublicKey" -> o.publicKey.asJson, "ParametersValidTo" -> o.parametersValidTo.asJson)
  }
  final implicit val InvalidArnExceptionEncoder: io.circe.Encoder[models.InvalidArnException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidAliasNameExceptionEncoder: io.circe.Encoder[models.InvalidAliasNameException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetParametersForImportRequestEncoder: io.circe.Encoder[models.GetParametersForImportRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "WrappingAlgorithm" -> o.wrappingAlgorithm.asJson, "WrappingKeySpec" -> o.wrappingKeySpec.asJson)
  }
  final implicit val GenerateDataKeyWithoutPlaintextResponseEncoder: io.circe.Encoder[models.GenerateDataKeyWithoutPlaintextResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val ReEncryptRequestEncoder: io.circe.Encoder[models.ReEncryptRequest] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "DestinationKeyId" -> o.destinationKeyId.asJson, "SourceEncryptionContext" -> o.sourceEncryptionContext.asJson, "DestinationEncryptionContext" -> o.destinationEncryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val CancelKeyDeletionResponseEncoder: io.circe.Encoder[models.CancelKeyDeletionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val RetireGrantRequestEncoder: io.circe.Encoder[models.RetireGrantRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GrantToken" -> o.grantToken.asJson, "KeyId" -> o.keyId.asJson, "GrantId" -> o.grantId.asJson)
  }
  final implicit val EnableKeyRequestEncoder: io.circe.Encoder[models.EnableKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val InvalidCiphertextExceptionEncoder: io.circe.Encoder[models.InvalidCiphertextException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val CreateAliasRequestEncoder: io.circe.Encoder[models.CreateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson, "TargetKeyId" -> o.targetKeyId.asJson)
  }
  final implicit val ListKeysResponseEncoder: io.circe.Encoder[models.ListKeysResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Keys" -> o.keys.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val CreateGrantResponseEncoder: io.circe.Encoder[models.CreateGrantResponse] = io.circe.Encoder.instance { o => 
    Json.obj("GrantToken" -> o.grantToken.asJson, "GrantId" -> o.grantId.asJson)
  }
  final implicit val ReEncryptResponseEncoder: io.circe.Encoder[models.ReEncryptResponse] = io.circe.Encoder.instance { o => 
    Json.obj("CiphertextBlob" -> o.ciphertextBlob.asJson, "SourceKeyId" -> o.sourceKeyId.asJson, "KeyId" -> o.keyId.asJson)
  }
  final implicit val UntagResourceRequestEncoder: io.circe.Encoder[models.UntagResourceRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "TagKeys" -> o.tagKeys.asJson)
  }
  final implicit val GetKeyPolicyRequestEncoder: io.circe.Encoder[models.GetKeyPolicyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "PolicyName" -> o.policyName.asJson)
  }
  final implicit val InvalidKeyUsageExceptionEncoder: io.circe.Encoder[models.InvalidKeyUsageException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListResourceTagsRequestEncoder: io.circe.Encoder[models.ListResourceTagsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val DecryptResponseEncoder: io.circe.Encoder[models.DecryptResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Plaintext" -> o.plaintext.asJson)
  }
  final implicit val ListKeyPoliciesResponseEncoder: io.circe.Encoder[models.ListKeyPoliciesResponse] = io.circe.Encoder.instance { o => 
    Json.obj("PolicyNames" -> o.policyNames.asJson, "NextMarker" -> o.nextMarker.asJson, "Truncated" -> o.truncated.asJson)
  }
  final implicit val CancelKeyDeletionRequestEncoder: io.circe.Encoder[models.CancelKeyDeletionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val GenerateDataKeyWithoutPlaintextRequestEncoder: io.circe.Encoder[models.GenerateDataKeyWithoutPlaintextRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson, "NumberOfBytes" -> o.numberOfBytes.asJson, "KeySpec" -> o.keySpec.asJson)
  }
  final implicit val GrantListEntryEncoder: io.circe.Encoder[models.GrantListEntry] = io.circe.Encoder.instance { o => 
    Json.obj("GrantId" -> o.grantId.asJson, "CreationDate" -> o.creationDate.asJson, "GranteePrincipal" -> o.granteePrincipal.asJson, "RetiringPrincipal" -> o.retiringPrincipal.asJson, "IssuingAccount" -> o.issuingAccount.asJson, "Constraints" -> o.constraints.asJson, "KeyId" -> o.keyId.asJson, "Operations" -> o.operations.asJson, "Name" -> o.name.asJson)
  }
  final implicit val GenerateDataKeyRequestEncoder: io.circe.Encoder[models.GenerateDataKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "EncryptionContext" -> o.encryptionContext.asJson, "GrantTokens" -> o.grantTokens.asJson, "NumberOfBytes" -> o.numberOfBytes.asJson, "KeySpec" -> o.keySpec.asJson)
  }
  final implicit val GetKeyRotationStatusResponseEncoder: io.circe.Encoder[models.GetKeyRotationStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyRotationEnabled" -> o.keyRotationEnabled.asJson)
  }
  final implicit val ListKeyPoliciesRequestEncoder: io.circe.Encoder[models.ListKeyPoliciesRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val CreateKeyRequestEncoder: io.circe.Encoder[models.CreateKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Origin" -> o.origin.asJson, "Tags" -> o.tags.asJson, "Policy" -> o.policy.asJson, "BypassPolicyLockoutSafetyCheck" -> o.bypassPolicyLockoutSafetyCheck.asJson, "Description" -> o.description.asJson, "KeyUsage" -> o.keyUsage.asJson)
  }
  final implicit val ImportKeyMaterialResponseEncoder: io.circe.Encoder[models.ImportKeyMaterialResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val CreateGrantRequestEncoder: io.circe.Encoder[models.CreateGrantRequest] = io.circe.Encoder.instance { o => 
    Json.obj("GranteePrincipal" -> o.granteePrincipal.asJson, "KeyId" -> o.keyId.asJson, "Operations" -> o.operations.asJson, "RetiringPrincipal" -> o.retiringPrincipal.asJson, "Constraints" -> o.constraints.asJson, "GrantTokens" -> o.grantTokens.asJson, "Name" -> o.name.asJson)
  }
  final implicit val DisableKeyRequestEncoder: io.circe.Encoder[models.DisableKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val GetKeyRotationStatusRequestEncoder: io.circe.Encoder[models.GetKeyRotationStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val ListGrantsRequestEncoder: io.circe.Encoder[models.ListGrantsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ListKeysRequestEncoder: io.circe.Encoder[models.ListKeysRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Limit" -> o.limit.asJson, "Marker" -> o.marker.asJson)
  }
  final implicit val ImportKeyMaterialRequestEncoder: io.circe.Encoder[models.ImportKeyMaterialRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "ImportToken" -> o.importToken.asJson, "EncryptedKeyMaterial" -> o.encryptedKeyMaterial.asJson, "ValidTo" -> o.validTo.asJson, "ExpirationModel" -> o.expirationModel.asJson)
  }
  final implicit val RevokeGrantRequestEncoder: io.circe.Encoder[models.RevokeGrantRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "GrantId" -> o.grantId.asJson)
  }
  final implicit val DisabledExceptionEncoder: io.circe.Encoder[models.DisabledException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateKeyDescriptionRequestEncoder: io.circe.Encoder[models.UpdateKeyDescriptionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "Description" -> o.description.asJson)
  }
  final implicit val LimitExceededExceptionEncoder: io.circe.Encoder[models.LimitExceededException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidGrantIdExceptionEncoder: io.circe.Encoder[models.InvalidGrantIdException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ScheduleKeyDeletionResponseEncoder: io.circe.Encoder[models.ScheduleKeyDeletionResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "DeletionDate" -> o.deletionDate.asJson)
  }
  final implicit val DisableKeyRotationRequestEncoder: io.circe.Encoder[models.DisableKeyRotationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val UnsupportedOperationExceptionEncoder: io.circe.Encoder[models.UnsupportedOperationException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ExpiredImportTokenExceptionEncoder: io.circe.Encoder[models.ExpiredImportTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val InvalidGrantTokenExceptionEncoder: io.circe.Encoder[models.InvalidGrantTokenException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GenerateRandomResponseEncoder: io.circe.Encoder[models.GenerateRandomResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Plaintext" -> o.plaintext.asJson)
  }
  final implicit val TagExceptionEncoder: io.circe.Encoder[models.TagException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val KMSInternalExceptionEncoder: io.circe.Encoder[models.KMSInternalException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ScheduleKeyDeletionRequestEncoder: io.circe.Encoder[models.ScheduleKeyDeletionRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "PendingWindowInDays" -> o.pendingWindowInDays.asJson)
  }
  final implicit val UpdateAliasRequestEncoder: io.circe.Encoder[models.UpdateAliasRequest] = io.circe.Encoder.instance { o => 
    Json.obj("AliasName" -> o.aliasName.asJson, "TargetKeyId" -> o.targetKeyId.asJson)
  }
  final implicit val EnableKeyRotationRequestEncoder: io.circe.Encoder[models.EnableKeyRotationRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val CreateKeyResponseEncoder: io.circe.Encoder[models.CreateKeyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("KeyMetadata" -> o.keyMetadata.asJson)
  }
  final implicit val DescribeKeyRequestEncoder: io.circe.Encoder[models.DescribeKeyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson, "GrantTokens" -> o.grantTokens.asJson)
  }
  final implicit val DeleteImportedKeyMaterialRequestEncoder: io.circe.Encoder[models.DeleteImportedKeyMaterialRequest] = io.circe.Encoder.instance { o => 
    Json.obj("KeyId" -> o.keyId.asJson)
  }
  final implicit val DependencyTimeoutExceptionEncoder: io.circe.Encoder[models.DependencyTimeoutException] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val ListGrantsResponseDecoder: io.circe.Decoder[models.ListGrantsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.GrantListEntry]]]("Grants"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(models.ListGrantsResponse.apply _)
  }
  final implicit val GenerateRandomRequestDecoder: io.circe.Decoder[models.GenerateRandomRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Int]]("NumberOfBytes").map(models.GenerateRandomRequest.apply _)
  }
  final implicit val InvalidImportTokenExceptionDecoder: io.circe.Decoder[models.InvalidImportTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidImportTokenException.apply _)
  }
  final implicit val GenerateDataKeyResponseDecoder: io.circe.Decoder[models.GenerateDataKeyResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[scala.Array[scala.Byte]]]("Plaintext"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(models.GenerateDataKeyResponse.apply _)
  }
  final implicit val ListAliasesRequestDecoder: io.circe.Decoder[models.ListAliasesRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListAliasesRequest.apply _)
  }
  final implicit val EncryptRequestDecoder: io.circe.Decoder[models.EncryptRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Array[scala.Byte]]("Plaintext"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(models.EncryptRequest.apply _)
  }
  final implicit val IncorrectKeyMaterialExceptionDecoder: io.circe.Decoder[models.IncorrectKeyMaterialException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.IncorrectKeyMaterialException.apply _)
  }
  final implicit val GrantConstraintsDecoder: io.circe.Decoder[models.GrantConstraints] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContextSubset"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContextEquals")).mapN(models.GrantConstraints.apply _)
  }
  final implicit val KeyMetadataDecoder: io.circe.Decoder[models.KeyMetadata] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[java.lang.String]]("AWSAccountId"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("DeletionDate"), o.get[scala.Option[java.time.Instant]]("ValidTo"), o.get[scala.Option[java.lang.String]]("ExpirationModel"), o.get[scala.Option[java.lang.String]]("Origin"), o.get[scala.Option[java.lang.String]]("Arn"), o.get[scala.Option[java.lang.String]]("KeyManager"), o.get[scala.Option[scala.Boolean]]("Enabled"), o.get[scala.Option[java.lang.String]]("KeyState"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("KeyUsage")).mapN(models.KeyMetadata.apply _)
  }
  final implicit val NotFoundExceptionDecoder: io.circe.Decoder[models.NotFoundException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.NotFoundException.apply _)
  }
  final implicit val PutKeyPolicyRequestDecoder: io.circe.Decoder[models.PutKeyPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("PolicyName"), o.get[java.lang.String]("Policy"), o.get[scala.Option[scala.Boolean]]("BypassPolicyLockoutSafetyCheck")).mapN(models.PutKeyPolicyRequest.apply _)
  }
  final implicit val DecryptRequestDecoder: io.circe.Decoder[models.DecryptRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("CiphertextBlob"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(models.DecryptRequest.apply _)
  }
  final implicit val KeyUnavailableExceptionDecoder: io.circe.Decoder[models.KeyUnavailableException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KeyUnavailableException.apply _)
  }
  final implicit val ListRetirableGrantsRequestDecoder: io.circe.Decoder[models.ListRetirableGrantsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("RetiringPrincipal"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListRetirableGrantsRequest.apply _)
  }
  final implicit val InvalidMarkerExceptionDecoder: io.circe.Decoder[models.InvalidMarkerException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidMarkerException.apply _)
  }
  final implicit val DescribeKeyResponseDecoder: io.circe.Decoder[models.DescribeKeyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.KeyMetadata]]("KeyMetadata").map(models.DescribeKeyResponse.apply _)
  }
  final implicit val AlreadyExistsExceptionDecoder: io.circe.Decoder[models.AlreadyExistsException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.AlreadyExistsException.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("TagKey"), o.get[java.lang.String]("TagValue")).mapN(models.Tag.apply _)
  }
  final implicit val EncryptResponseDecoder: io.circe.Decoder[models.EncryptResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(models.EncryptResponse.apply _)
  }
  final implicit val KeyListEntryDecoder: io.circe.Decoder[models.KeyListEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.lang.String]]("KeyArn")).mapN(models.KeyListEntry.apply _)
  }
  final implicit val MalformedPolicyDocumentExceptionDecoder: io.circe.Decoder[models.MalformedPolicyDocumentException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.MalformedPolicyDocumentException.apply _)
  }
  final implicit val ListAliasesResponseDecoder: io.circe.Decoder[models.ListAliasesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.AliasListEntry]]]("Aliases"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(models.ListAliasesResponse.apply _)
  }
  final implicit val AliasListEntryDecoder: io.circe.Decoder[models.AliasListEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("AliasName"), o.get[scala.Option[java.lang.String]]("AliasArn"), o.get[scala.Option[java.lang.String]]("TargetKeyId")).mapN(models.AliasListEntry.apply _)
  }
  final implicit val KMSInvalidStateExceptionDecoder: io.circe.Decoder[models.KMSInvalidStateException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSInvalidStateException.apply _)
  }
  final implicit val ListResourceTagsResponseDecoder: io.circe.Decoder[models.ListResourceTagsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(models.ListResourceTagsResponse.apply _)
  }
  final implicit val DeleteAliasRequestDecoder: io.circe.Decoder[models.DeleteAliasRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AliasName").map(models.DeleteAliasRequest.apply _)
  }
  final implicit val TagResourceRequestDecoder: io.circe.Decoder[models.TagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.List[models.Tag]]("Tags")).mapN(models.TagResourceRequest.apply _)
  }
  final implicit val GetKeyPolicyResponseDecoder: io.circe.Decoder[models.GetKeyPolicyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Policy").map(models.GetKeyPolicyResponse.apply _)
  }
  final implicit val GetParametersForImportResponseDecoder: io.circe.Decoder[models.GetParametersForImportResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.Array[scala.Byte]]]("ImportToken"), o.get[scala.Option[scala.Array[scala.Byte]]]("PublicKey"), o.get[scala.Option[java.time.Instant]]("ParametersValidTo")).mapN(models.GetParametersForImportResponse.apply _)
  }
  final implicit val InvalidArnExceptionDecoder: io.circe.Decoder[models.InvalidArnException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidArnException.apply _)
  }
  final implicit val InvalidAliasNameExceptionDecoder: io.circe.Decoder[models.InvalidAliasNameException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidAliasNameException.apply _)
  }
  final implicit val GetParametersForImportRequestDecoder: io.circe.Decoder[models.GetParametersForImportRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("WrappingAlgorithm"), o.get[java.lang.String]("WrappingKeySpec")).mapN(models.GetParametersForImportRequest.apply _)
  }
  final implicit val GenerateDataKeyWithoutPlaintextResponseDecoder: io.circe.Decoder[models.GenerateDataKeyWithoutPlaintextResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(models.GenerateDataKeyWithoutPlaintextResponse.apply _)
  }
  final implicit val ReEncryptRequestDecoder: io.circe.Decoder[models.ReEncryptRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Array[scala.Byte]]("CiphertextBlob"), o.get[java.lang.String]("DestinationKeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("SourceEncryptionContext"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("DestinationEncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(models.ReEncryptRequest.apply _)
  }
  final implicit val CancelKeyDeletionResponseDecoder: io.circe.Decoder[models.CancelKeyDeletionResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("KeyId").map(models.CancelKeyDeletionResponse.apply _)
  }
  final implicit val RetireGrantRequestDecoder: io.circe.Decoder[models.RetireGrantRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GrantToken"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.lang.String]]("GrantId")).mapN(models.RetireGrantRequest.apply _)
  }
  final implicit val EnableKeyRequestDecoder: io.circe.Decoder[models.EnableKeyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.EnableKeyRequest.apply _)
  }
  final implicit val InvalidCiphertextExceptionDecoder: io.circe.Decoder[models.InvalidCiphertextException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidCiphertextException.apply _)
  }
  final implicit val CreateAliasRequestDecoder: io.circe.Decoder[models.CreateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AliasName"), o.get[java.lang.String]("TargetKeyId")).mapN(models.CreateAliasRequest.apply _)
  }
  final implicit val ListKeysResponseDecoder: io.circe.Decoder[models.ListKeysResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[models.KeyListEntry]]]("Keys"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(models.ListKeysResponse.apply _)
  }
  final implicit val CreateGrantResponseDecoder: io.circe.Decoder[models.CreateGrantResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GrantToken"), o.get[scala.Option[java.lang.String]]("GrantId")).mapN(models.CreateGrantResponse.apply _)
  }
  final implicit val ReEncryptResponseDecoder: io.circe.Decoder[models.ReEncryptResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Array[scala.Byte]]]("CiphertextBlob"), o.get[scala.Option[java.lang.String]]("SourceKeyId"), o.get[scala.Option[java.lang.String]]("KeyId")).mapN(models.ReEncryptResponse.apply _)
  }
  final implicit val UntagResourceRequestDecoder: io.circe.Decoder[models.UntagResourceRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.List[java.lang.String]]("TagKeys")).mapN(models.UntagResourceRequest.apply _)
  }
  final implicit val GetKeyPolicyRequestDecoder: io.circe.Decoder[models.GetKeyPolicyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("PolicyName")).mapN(models.GetKeyPolicyRequest.apply _)
  }
  final implicit val InvalidKeyUsageExceptionDecoder: io.circe.Decoder[models.InvalidKeyUsageException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidKeyUsageException.apply _)
  }
  final implicit val ListResourceTagsRequestDecoder: io.circe.Decoder[models.ListResourceTagsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListResourceTagsRequest.apply _)
  }
  final implicit val DecryptResponseDecoder: io.circe.Decoder[models.DecryptResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.Array[scala.Byte]]]("Plaintext")).mapN(models.DecryptResponse.apply _)
  }
  final implicit val ListKeyPoliciesResponseDecoder: io.circe.Decoder[models.ListKeyPoliciesResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.List[java.lang.String]]]("PolicyNames"), o.get[scala.Option[java.lang.String]]("NextMarker"), o.get[scala.Option[scala.Boolean]]("Truncated")).mapN(models.ListKeyPoliciesResponse.apply _)
  }
  final implicit val CancelKeyDeletionRequestDecoder: io.circe.Decoder[models.CancelKeyDeletionRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.CancelKeyDeletionRequest.apply _)
  }
  final implicit val GenerateDataKeyWithoutPlaintextRequestDecoder: io.circe.Decoder[models.GenerateDataKeyWithoutPlaintextRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens"), o.get[scala.Option[scala.Int]]("NumberOfBytes"), o.get[scala.Option[java.lang.String]]("KeySpec")).mapN(models.GenerateDataKeyWithoutPlaintextRequest.apply _)
  }
  final implicit val GrantListEntryDecoder: io.circe.Decoder[models.GrantListEntry] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("GrantId"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.lang.String]]("GranteePrincipal"), o.get[scala.Option[java.lang.String]]("RetiringPrincipal"), o.get[scala.Option[java.lang.String]]("IssuingAccount"), o.get[scala.Option[models.GrantConstraints]]("Constraints"), o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[scala.List[java.lang.String]]]("Operations"), o.get[scala.Option[java.lang.String]]("Name")).mapN(models.GrantListEntry.apply _)
  }
  final implicit val GenerateDataKeyRequestDecoder: io.circe.Decoder[models.GenerateDataKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.collection.immutable.Map[java.lang.String, java.lang.String]]]("EncryptionContext"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens"), o.get[scala.Option[scala.Int]]("NumberOfBytes"), o.get[scala.Option[java.lang.String]]("KeySpec")).mapN(models.GenerateDataKeyRequest.apply _)
  }
  final implicit val GetKeyRotationStatusResponseDecoder: io.circe.Decoder[models.GetKeyRotationStatusResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Boolean]]("KeyRotationEnabled").map(models.GetKeyRotationStatusResponse.apply _)
  }
  final implicit val ListKeyPoliciesRequestDecoder: io.circe.Decoder[models.ListKeyPoliciesRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListKeyPoliciesRequest.apply _)
  }
  final implicit val CreateKeyRequestDecoder: io.circe.Decoder[models.CreateKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Origin"), o.get[scala.Option[scala.List[models.Tag]]]("Tags"), o.get[scala.Option[java.lang.String]]("Policy"), o.get[scala.Option[scala.Boolean]]("BypassPolicyLockoutSafetyCheck"), o.get[scala.Option[java.lang.String]]("Description"), o.get[scala.Option[java.lang.String]]("KeyUsage")).mapN(models.CreateKeyRequest.apply _)
  }
  final implicit val ImportKeyMaterialResponseDecoder: io.circe.Decoder[models.ImportKeyMaterialResponse.type] = io.circe.Decoder.decodeUnit.as(models.ImportKeyMaterialResponse)
  final implicit val CreateGrantRequestDecoder: io.circe.Decoder[models.CreateGrantRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("GranteePrincipal"), o.get[java.lang.String]("KeyId"), o.get[scala.List[java.lang.String]]("Operations"), o.get[scala.Option[java.lang.String]]("RetiringPrincipal"), o.get[scala.Option[models.GrantConstraints]]("Constraints"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens"), o.get[scala.Option[java.lang.String]]("Name")).mapN(models.CreateGrantRequest.apply _)
  }
  final implicit val DisableKeyRequestDecoder: io.circe.Decoder[models.DisableKeyRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.DisableKeyRequest.apply _)
  }
  final implicit val GetKeyRotationStatusRequestDecoder: io.circe.Decoder[models.GetKeyRotationStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.GetKeyRotationStatusRequest.apply _)
  }
  final implicit val ListGrantsRequestDecoder: io.circe.Decoder[models.ListGrantsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListGrantsRequest.apply _)
  }
  final implicit val ListKeysRequestDecoder: io.circe.Decoder[models.ListKeysRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[scala.Int]]("Limit"), o.get[scala.Option[java.lang.String]]("Marker")).mapN(models.ListKeysRequest.apply _)
  }
  final implicit val ImportKeyMaterialRequestDecoder: io.circe.Decoder[models.ImportKeyMaterialRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Array[scala.Byte]]("ImportToken"), o.get[scala.Array[scala.Byte]]("EncryptedKeyMaterial"), o.get[scala.Option[java.time.Instant]]("ValidTo"), o.get[scala.Option[java.lang.String]]("ExpirationModel")).mapN(models.ImportKeyMaterialRequest.apply _)
  }
  final implicit val RevokeGrantRequestDecoder: io.circe.Decoder[models.RevokeGrantRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("GrantId")).mapN(models.RevokeGrantRequest.apply _)
  }
  final implicit val DisabledExceptionDecoder: io.circe.Decoder[models.DisabledException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DisabledException.apply _)
  }
  final implicit val UpdateKeyDescriptionRequestDecoder: io.circe.Decoder[models.UpdateKeyDescriptionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[java.lang.String]("Description")).mapN(models.UpdateKeyDescriptionRequest.apply _)
  }
  final implicit val LimitExceededExceptionDecoder: io.circe.Decoder[models.LimitExceededException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.LimitExceededException.apply _)
  }
  final implicit val InvalidGrantIdExceptionDecoder: io.circe.Decoder[models.InvalidGrantIdException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidGrantIdException.apply _)
  }
  final implicit val ScheduleKeyDeletionResponseDecoder: io.circe.Decoder[models.ScheduleKeyDeletionResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("KeyId"), o.get[scala.Option[java.time.Instant]]("DeletionDate")).mapN(models.ScheduleKeyDeletionResponse.apply _)
  }
  final implicit val DisableKeyRotationRequestDecoder: io.circe.Decoder[models.DisableKeyRotationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.DisableKeyRotationRequest.apply _)
  }
  final implicit val UnsupportedOperationExceptionDecoder: io.circe.Decoder[models.UnsupportedOperationException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.UnsupportedOperationException.apply _)
  }
  final implicit val ExpiredImportTokenExceptionDecoder: io.circe.Decoder[models.ExpiredImportTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.ExpiredImportTokenException.apply _)
  }
  final implicit val InvalidGrantTokenExceptionDecoder: io.circe.Decoder[models.InvalidGrantTokenException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.InvalidGrantTokenException.apply _)
  }
  final implicit val GenerateRandomResponseDecoder: io.circe.Decoder[models.GenerateRandomResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.Array[scala.Byte]]]("Plaintext").map(models.GenerateRandomResponse.apply _)
  }
  final implicit val TagExceptionDecoder: io.circe.Decoder[models.TagException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.TagException.apply _)
  }
  final implicit val KMSInternalExceptionDecoder: io.circe.Decoder[models.KMSInternalException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.KMSInternalException.apply _)
  }
  final implicit val ScheduleKeyDeletionRequestDecoder: io.circe.Decoder[models.ScheduleKeyDeletionRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.Int]]("PendingWindowInDays")).mapN(models.ScheduleKeyDeletionRequest.apply _)
  }
  final implicit val UpdateAliasRequestDecoder: io.circe.Decoder[models.UpdateAliasRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("AliasName"), o.get[java.lang.String]("TargetKeyId")).mapN(models.UpdateAliasRequest.apply _)
  }
  final implicit val EnableKeyRotationRequestDecoder: io.circe.Decoder[models.EnableKeyRotationRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.EnableKeyRotationRequest.apply _)
  }
  final implicit val CreateKeyResponseDecoder: io.circe.Decoder[models.CreateKeyResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[models.KeyMetadata]]("KeyMetadata").map(models.CreateKeyResponse.apply _)
  }
  final implicit val DescribeKeyRequestDecoder: io.circe.Decoder[models.DescribeKeyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("KeyId"), o.get[scala.Option[scala.List[java.lang.String]]]("GrantTokens")).mapN(models.DescribeKeyRequest.apply _)
  }
  final implicit val DeleteImportedKeyMaterialRequestDecoder: io.circe.Decoder[models.DeleteImportedKeyMaterialRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("KeyId").map(models.DeleteImportedKeyMaterialRequest.apply _)
  }
  final implicit val DependencyTimeoutExceptionDecoder: io.circe.Decoder[models.DependencyTimeoutException] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(models.DependencyTimeoutException.apply _)
  }
}