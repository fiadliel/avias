package org.lyranthe.araethura.common.http4s

import tsec.messagedigests.core._

object SigningString {
  def stringToSign[H: DigestTag](currentTime: CurrentTime,
                         credentialScope: CredentialScope,
                         canonicalRequestHash: String): String = {
    "AWS4-HMAC-SHA256" + "\n" +
      currentTime.basicTime + "\n" +
      credentialScope + "\n" +
      canonicalRequestHash
  }
}
