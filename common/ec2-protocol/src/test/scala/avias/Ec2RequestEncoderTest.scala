package avias

import org.scalatest.{Filter ⇒ _, _}
import avias.Ec2RequestEncoder._

class Ec2RequestEncoderTest extends FlatSpec with Matchers {

  "Ec2RequestEncoder" should "encode strings" in {
    Ec2RequestEncoder.encode("field", "value") should contain("field" → "value")
  }

  it should "encode boolean values" in {
    Ec2RequestEncoder.encode("field", true) should contain("field" → "true")
    Ec2RequestEncoder.encode("field", false) should contain("field" → "false")
  }

  it should "encode integer values" in {
    Ec2RequestEncoder.encode("field", 42) should contain("field" → "42")
  }

  it should "encode an optional string" in {
    Ec2RequestEncoder.encode("field", Option("hello world")) should contain("field" → "hello world")
    Ec2RequestEncoder.encode("field", None: Option[String]) should be(empty)
  }

  it should "encode a list of strings" in {
    val output = Ec2RequestEncoder.encode("field", List("value1", "value2", "value3"))

    output should contain("field.1" → "value1")
    output should contain("field.2" → "value2")
    output should contain("field.3" → "value3")
  }

}
