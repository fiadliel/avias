package org.lyranthe.araethura.common.http4s

import org.lyranthe.araethura.common._
import tsec.common._
import tsec.messagedigests._
import tsec.messagedigests.core._
import tsec.messagedigests.imports._

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
