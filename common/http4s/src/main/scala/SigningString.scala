package org.lyranthe.araethura.common.http4s

import tsec.messagedigests.core._

object SigningString {
  def sign[H: DigestTag](currentTime: CurrentTime,
                           credentialScope: CredentialScope,
                         signedRequest: String): String = {
    "AWS-HMAC-SHA256" + "\n" +
      currentTime.basicTime + "\n" +
      credentialScope + "\n" +
      signedRequest
  }
}
