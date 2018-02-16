package org.lyranthe.araethura.common.http4s

object SigningString {
  def stringToSign(algorithm: String,
                   currentTime: CurrentTime,
                   credentialScope: CredentialScope,
                   canonicalRequestHash: String): String = {
    "AWS4-HMAC-" + algorithm + "\n" +
      currentTime.basicTime + "\n" +
      credentialScope + "\n" +
      canonicalRequestHash
  }
}
