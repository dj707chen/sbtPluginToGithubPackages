// Run "sbt githubWorkflowGenerate" to generate the GH Workflow scripts
addSbtPlugin("com.github.sbt" % "sbt-github-actions" % "0.18.0")

// show publishTo
//[info] Some(GitHub Package Registry: https://maven.pkg.github.com/antslift-org/sbtPluginLab)
addSbtPlugin("com.codecommit" % "sbt-github-packages" % "0.5.3")
