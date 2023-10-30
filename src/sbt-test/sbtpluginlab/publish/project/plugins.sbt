sys.props.get("plugin.version") match {
  case Some(x) => addSbtPlugin("com.antslift.sbt" % "blog-sbt-plugin" % x)
  case _       => sys.error("""|The system property 'plugin.version' is not defined.
                               |Specify this property using the scriptedLaunchOpts -D.""".stripMargin)
}

addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
