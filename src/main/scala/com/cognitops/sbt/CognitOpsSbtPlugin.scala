package com.cognitops.sbt

import sbt._

object CognitOpsSbtPlugin extends AutoPlugin {

  object autoImport {
    final lazy val catsVersion: String   = "2.10.0"
    final lazy val catsCore:    ModuleID = "org.typelevel" %% "cats-core"   % catsVersion
    final lazy val catsKernel:  ModuleID = "org.typelevel" %% "cats-kernel" % catsVersion
    final lazy val catsMacros:  ModuleID = "org.typelevel" %% "cats-macros" % catsVersion

    final lazy val http4sVersion: String   = "0.23.23"
    final lazy val http4sDsl:     ModuleID = "org.http4s" %% "http4s-dsl"     % http4sVersion
    final lazy val http4sCore:    ModuleID = "org.http4s" %% "http4s-core"    % http4sVersion
    final lazy val http4sCirce:   ModuleID = "org.http4s" %% "http4s-circe"   % http4sVersion
    final lazy val http4sJetty:   ModuleID = "org.http4s" %% "http4s-jetty"   % http4sVersion
    final lazy val http4sServlet: ModuleID = "org.http4s" %% "http4s-servlet" % http4sVersion

    final lazy val circeVersion:       String   = "0.14.6"
    final lazy val circeCore:          ModuleID = "io.circe" %% "circe-core"           % circeVersion
    final lazy val circeGeneric:       ModuleID = "io.circe" %% "circe-generic"        % circeVersion
    final lazy val circeGenericExtras: ModuleID = "io.circe" %% "circe-generic-extras" % circeVersion
    final lazy val circeParser:        ModuleID = "io.circe" %% "circe-parser"         % circeVersion
  }
}
