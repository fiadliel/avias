import sbt._
import sbt.Keys._

object Dependencies {
  val CirceVersion = "0.9.1"
  val Http4sVersion = "0.18.17"
  val TsecVersion = "0.0.1-M7"
  val monocleVersion = "1.5.0-cats"
  val simulacrumVersion = "0.13.0"
  val scalatestVersion = "3.0.5"
  val macroParadiseVersion = "2.1.1"

  val core = Seq(
  libraryDependencies ++= Seq(
  "com.github.julien-truffaut" %%  "monocle-core"  % monocleVersion,
  "com.github.julien-truffaut" %%  "monocle-macro" % monocleVersion,
  "com.github.julien-truffaut" %%  "monocle-law"   % monocleVersion % "test"
    )
  )

  val circe = Seq(
    libraryDependencies ++= Seq(

      "io.circe" %% "circe-core" % CirceVersion,
      "io.circe" %% "circe-generic" % CirceVersion,
      "io.circe" %% "circe-parser" % CirceVersion
    )
  )

  val http4s = Seq(
    resolvers += "jmcardon at bintray" at "https://dl.bintray.com/jmcardon/tsec",
    libraryDependencies ++= Seq(
      "io.github.jmcardon" %% "tsec-mac" % TsecVersion,
      "io.github.jmcardon" %% "tsec-md" % TsecVersion,
      "org.http4s" %% "http4s-client" % Http4sVersion,
      "org.http4s" %% "http4s-circe" % Http4sVersion
    )
  )

  val simulacrum = Seq(
    addCompilerPlugin("org.scalamacros" % "paradise" % macroParadiseVersion cross CrossVersion.patch),
    libraryDependencies ++= Seq(
      "com.github.mpilquist" %% "simulacrum" % simulacrumVersion,
      "org.scalatest" %% "scalatest" % scalatestVersion % Test,
    ),
  )
}
