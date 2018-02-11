val CirceVersion = "0.9.1"

lazy val gen = project.in(file(".")).settings(
  scalaOrganization := "org.typelevel",
  scalaVersion := "2.12.4-bin-typelevel-4",
libraryDependencies += "org.scalameta" %% "scalameta" % "3.2.0",
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-parser",
  "io.circe" %% "circe-generic"
).map(_ % CirceVersion),
libraryDependencies += "org.typelevel" %% "cats-core" % "1.0.1",
  libraryDependencies += "org.typelevel" %% "cats-effect" % "0.8",
  libraryDependencies += "co.fs2" %% "fs2-core" % "0.10.1",
  libraryDependencies += "co.fs2" %% "fs2-io" % "0.10.1",
  libraryDependencies += "io.verizon.quiver" %% "core" % "7.0.18",
//scalacOptions += "-Xstrict-patmat-analysis",
//scalacOptions += "-Xlint:strict-unsealed-patmat",
addSbtPlugin("org.lyranthe.sbt" % "partial-unification" % "1.1.0"),
//libraryDependencies += "ch.epfl.scala" %% "scalafix-core" % "0.5.10",
addCompilerPlugin("io.tryp" % "splain" % "0.2.7" cross CrossVersion.patch)
)
