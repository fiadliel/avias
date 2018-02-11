inThisBuild(List(
  scalaOrganization := "org.typelevel",
  version := "0.0.1-SNAPSHOT",
  scalaVersion := "2.12.4-bin-typelevel-4",
  scalacOptions ++= Seq("-Yinduction-heuristics", "-Xstrict-patmat-analysis", "-Xlint:strict-unsealed-patmat"),
  //addCompilerPlugin("io.tryp" % "splain" % "0.2.7" cross CrossVersion.patch),
  libraryDependencies += "io.monix" %% "minitest" % "2.1.0" % "test",
  testFrameworks += new TestFramework("minitest.runner.Framework")
))

enablePlugins(SphinxPlugin, SiteScaladocPlugin, GhpagesPlugin, ScalaUnidocPlugin)

siteSubdirName in ScalaUnidoc := "api"
addMappingsToSiteDir(mappings in (ScalaUnidoc, packageDoc), siteSubdirName in ScalaUnidoc)
git.remoteRepo := "git@github.com:fiadliel/araethura.git"
