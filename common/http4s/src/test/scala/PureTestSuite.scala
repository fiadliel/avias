package org.lyranthe.araethura.common.http4s

import cats.effect.IO
import org.scalacheck._
import org.scalacheck.util.Pretty
import minitest._
import minitest.api._
import scala.concurrent.ExecutionContext.Implicits.global

trait PureTestSuite extends AbstractTestSuite {
  private[this] val ts = new SimpleTestSuite {}
  lazy val properties = ts.properties
  lazy val config = Test.Parameters.default
  
  def test(name: String)(f: => Prop): Unit = 
    ts.test(name) {
      val result = Test.check(config, f)
      if (!result.passed) Asserts.fail(Pretty.pretty(result))
    }

  def testIO(name: String)(f: => IO[Prop]): Unit = 
    ts.testAsync(name) {
      f.unsafeToFuture.map { res =>
        val result = Test.check(config, res)
        if (!result.passed) Asserts.fail(Pretty.pretty(result))
      }
    }
}
