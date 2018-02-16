package avias.common.http4s

import java.time.Instant
import org.scalacheck.Prop._

object SigningStringSuite extends PureTestSuite {
  test("signing string is correctly calculated") {
    val currentTime = CurrentTime.fromInstant(Instant.parse("2015-08-30T12:36:00Z"))
    val credentialScope = CredentialScope(currentTime, "IAM", "US-EAST-1")
    val canonicalRequestHash = "f536975d06c0309214f805bb90ccff089219ecd68b2577efef23edd43b7e1a59"
    val stringToSign = SigningString.stringToSign("SHA256", currentTime, credentialScope, canonicalRequestHash)
    """AWS4-HMAC-SHA256
      |20150830T123600Z
      |20150830/us-east-1/iam/aws4_request
      |f536975d06c0309214f805bb90ccff089219ecd68b2577efef23edd43b7e1a59""".stripMargin =? stringToSign
  }
}
