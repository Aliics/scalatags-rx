addSbtPlugin("com.eed3si9n" % "sbt-projectmatrix" % "0.7.0")
addSbtPlugin("org.scala-js" % "sbt-scalajs" % "1.10.0")
addSbtPlugin("com.rallyhealth.sbt" % "sbt-git-versioning" % "1.6.0")
addSbtPlugin("org.xerial.sbt" % "sbt-sonatype" % "3.9.5")
addSbtPlugin("com.jsuereth" % "sbt-pgp" % "2.1.1")

libraryDependencies += "org.scala-js" %% "scalajs-env-nodejs" % "1.2.1"
libraryDependencies += "org.scala-js" %% "scalajs-env-jsdom-nodejs" % "1.1.0"
