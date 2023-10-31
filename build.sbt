// build.sbt: Based on https://github.com/djspiewak/sbt-github-packages/blob/master/build.sbt
// Refer https://www.scala-sbt.org/1.x/docs/Testing-sbt-plugins.html
// Source: https://softwarecorner.wordpress.com/2020/06/30/a-simple-sbt-plugin-enforcing-consistent-versions-of-third-party-dependencies/

ThisBuild / organization := "com.ghptest.sbt"
ThisBuild / scalaVersion := "2.12.16"
ThisBuild / version := "1.0-SNAPSHOT"

// Use Daniel Spiewak's sbt-github-packages plugin to publish to Github Packages Registry
githubOwner := "dj707chen"
githubRepository := "sbtPluginToGithubPackages"
publishMavenStyle := true

////////////////////////////////////////////////////////////////////////////////////////////////
// Based on the build.sbt of sbt-github-packages plugin
sbtPlugin := true
sbtVersion := "1.9.6"

enablePlugins(SbtPlugin)

scmInfo := Some(
  ScmInfo(
    url("https://github.com/weipingc/sbtPluginToGithubPackages"),
    "scm:git@github.com:weipingc/sbtPluginToGithubPackages.git",
  ),
)

// For plugin testing, passed in when run "sbt scripted"
scriptedLaunchOpts ++= Seq("-Dplugin.version=" + version.value)
scriptedBufferLog := true

////////////////////////////////////////////////////////////////////////////////////////////////
// Refer https://github.com/sbt/sbt-github-actions#jdk-settings
ThisBuild / githubWorkflowJavaVersions += JavaSpec.temurin("17")
ThisBuild / githubWorkflowEnv += "MY_GITHUB_TOKEN" -> "${{ secrets.MY_GITHUB_TOKEN }}"

// Refer https://github.com/sbt/sbt-github-actions#integration-with-sbt-ci-release
ThisBuild / githubWorkflowTargetTags ++= Seq("v*")
ThisBuild / githubWorkflowPublishTargetBranches :=
  Seq(
    RefPredicate.StartsWith(Ref.Tag("v")),
    RefPredicate.Equals(Ref.Branch("main")),
  )
ThisBuild / githubWorkflowPublish := Seq(
  WorkflowStep.Sbt(
    commands = List("publish"),
    name = Some("Publish project"),
  ),
)

////////////////////////////////////////////////////////////////////////////////////////////////
lazy val `blog-sbt-plugin` = project in file(".")

logLevel := Level.Debug
