package org.lyranthe.araethura.common.http4s

import cats.effect.Sync
import cats.implicits._
import java.time.{Instant, ZonedDateTime, ZoneId}
import java.time.format.DateTimeFormatter

case class CurrentTime(now: ZonedDateTime, basicTime: String, date: String)

object CurrentTime {
  private val utcTimezone = ZoneId.of("UTC")

  private val basicFormatter: DateTimeFormatter = DateTimeFormatter
    .ofPattern("yyyyMMdd'T'HHmmss'Z'")

  private val dateFormatter: DateTimeFormatter =
    DateTimeFormatter.ofPattern("yyyyMMdd")

  def fromNow[F[_]](implicit F: Sync[F]): F[CurrentTime] = {
    F.delay(Instant.now).map(fromInstant)
  }

  private[http4s] def fromInstant(at: Instant): CurrentTime = {
    val inUtc = at.atZone(utcTimezone)
    val basicTime = basicFormatter.format(inUtc)
    val date = dateFormatter.format(inUtc)
    CurrentTime(inUtc, basicTime, date)
  }
}