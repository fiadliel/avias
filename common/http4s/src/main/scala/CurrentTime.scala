package org.lyranthe.araethura.common.http4s

import cats.effect.Sync
import cats.implicits._
import java.time.{Instant, ZonedDateTime, ZoneId}
import java.time.format.DateTimeFormatter

case class CurrentTime(now: ZonedDateTime, basicTime: String, date: String)

object CurrentTime {
      private val basicFormatter: DateTimeFormatter = DateTimeFormatter
    .ofPattern("yyyyMMdd'T'HHmmss'Z'")
  private val dateFormatter: DateTimeFormatter =
    DateTimeFormatter.ofPattern("yyyyMMdd")

    def fromNow[F[_]](implicit F: Sync[F]): F[CurrentTime] = {
        for {
        now <- F.delay(Instant.now.atZone(ZoneId.of("UTC")))
      basicTime = basicFormatter.format(now)
        date = dateFormatter.format(now)
        } yield CurrentTime(now, basicTime, date)
    }
}