package com.cognitops.sbt

import sbt._

object CognitOpsSbtPlugin extends AutoPlugin {

  object autoImport {
    val catsVersion = "1.6.1"
    val catsCore =
      "org.typelevel" %% "cats-core" % catsVersion
    val catsKernel =
      "org.typelevel" %% "cats-kernel" % catsVersion
    val catsMacros =
      "org.typelevel" %% "cats-macros" % catsVersion

    val http4sVersion = "0.20.6"
    val http4sDsl =
      "org.http4s" %% "http4s-dsl" % http4sVersion
    val http4sBlazeClient =
      "org.http4s" %% "http4s-blaze-client" % http4sVersion
    val http4sCirce =
      "org.http4s" %% "http4s-circe" % http4sVersion
    val http4sJetty =
      "org.http4s" %% "http4s-jetty" % http4sVersion
    val http4sServlet =
      "org.http4s" %% "http4s-servlet" % http4sVersion

    val circeVersion = "0.11.1"
    val circeCore =
      "io.circe" %% "circe-core" % circeVersion
    val circeGeneric =
      "io.circe" %% "circe-generic" % circeVersion
    val circeGenericExtras =
      "io.circe" %% "circe-generic-extras" % circeVersion
    val circeParser =
      "io.circe" %% "circe-parser" % circeVersion
  }
}
