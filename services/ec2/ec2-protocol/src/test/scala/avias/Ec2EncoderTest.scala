package avias

import cats.effect._
import cats.implicits._
import avias.ec2.ec2._
import avias.ec2.models._
import org.http4s._
import org.scalatest.{Filter ⇒ _, _}
import fs2._
import fs2.text

class Ec2EncoderTest extends AsyncFlatSpec with Matchers {
  private val sortedArgumentPipe: Pipe[IO, String, String] = _.map(_.split("&").sorted.mkString("&"))

  "Ec2Encoder" should "correctly encode DescribeInstances example request #2" in {
    // example 2 from https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html#API_DescribeInstances_Examples
    val expected = "Action=DescribeInstances&Filter.1.Name=instance-type&Filter.1.Value.1=m1.small&Filter.1.Value.2=m1.large&Filter.2.Name=block-device-mapping.status&Filter.2.Value.1=attached&Filter.3.Name=block-device-mapping.delete-on-termination&Filter.3.Value.1=true"
    val awsRequest = DescribeInstancesRequest(filter = Option(List(
      Filter(Option("instance-type"), Option(List("m1.small", "m1.large"))),
      Filter(Option("block-device-mapping.status"), Option(List("attached"))),
      Filter(Option("block-device-mapping.delete-on-termination"), Option(List("true"))),
    )))

    val output = for {
      req ← Stream.eval(Request[IO]().withBody(awsRequest))
      body ← req.body.through(text.utf8Decode).through(sortedArgumentPipe)
    } yield body should be(expected)

    output.compile.toList.unsafeToFuture().map(_.head)
  }

  it should "correctly encode DescribeInstances example request #3" in {
    // example 3 from https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html#API_DescribeInstances_Examples
    val expected = "Action=DescribeInstances&Filter.1.Name=vpc-id&Filter.1.Value.1=%2A"
    val awsRequest = DescribeInstancesRequest(filter = Option(List(
      Filter(Option("vpc-id"), Option(List("*"))),
    )))

    val output = for {
      req ← Stream.eval(Request[IO]().withBody(awsRequest))
      body ← req.body.through(text.utf8Decode).through(sortedArgumentPipe)
    } yield body should be(expected)

    output.compile.toList.unsafeToFuture().map(_.head)
  }

  it should "correctly encode DescribeInstances example request #4" in {
    // example 4 from https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html#API_DescribeInstances_Examples
    val expected = "Action=DescribeInstances&Filter.1.Name=tag-key&Filter.1.Value.1=Owner"
    val awsRequest = DescribeInstancesRequest(filter = Option(List(
      Filter(Option("tag-key"), Option(List("Owner"))),
    )))

    val output = for {
      req ← Stream.eval(Request[IO]().withBody(awsRequest))
      body ← req.body.through(text.utf8Decode).through(sortedArgumentPipe)
    } yield body should be(expected)

    output.compile.toList.unsafeToFuture().map(_.head)
  }

  it should "correctly encode DescribeInstances example request #5" in {
    // example 5 from https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeInstances.html#API_DescribeInstances_Examples
    val expected = "Action=DescribeInstances&Filter.1.Name=tag%3AOwner&Filter.1.Value.1=DbAdmin"
    val awsRequest = DescribeInstancesRequest(filter = Option(List(
      Filter(Option("tag:Owner"), Option(List("DbAdmin"))),
    )))

    val output = for {
      req ← Stream.eval(Request[IO]().withBody(awsRequest))
      body ← req.body.through(text.utf8Decode).through(sortedArgumentPipe)
    } yield body should be(expected)

    output.compile.toList.unsafeToFuture().map(_.head)
  }
}
