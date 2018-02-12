package org.lyranthe.araethura.common.http4s

import org.scalacheck._
import org.scalacheck.Prop._
import java.time._

object CurrentTimeSuite extends PureTestSuite {
  private[this] val minInstant: Instant = Instant.EPOCH
  private[this] val maxInstant: Instant = Instant.parse("3000-01-01T00:00:00.00Z")
  val genInstant = Gen.choose(minInstant.getEpochSecond, maxInstant.getEpochSecond).map(Instant.ofEpochSecond)

  implicit val arbitraryCurrentTime: Arbitrary[Instant] = Arbitrary(genInstant)

  test("date should be YYYYMMDD in UTC") {
    forAll { (i: Instant) =>
      val z = i.atZone(ZoneId.of("UTC"))
      val c = CurrentTime.fromInstant(i)
      c.date ?= f"${z.getYear}${z.getMonthValue}%02d${z.getDayOfMonth}%02d"
    }
  }
}