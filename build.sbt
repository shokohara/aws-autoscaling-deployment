name := "aws-autoscaling-deployment"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.github.scopt" %% "scopt" % "3.3.0",
  "org.typelevel" %% "cats" % "0.4.1",
  "org.scalaz" %% "scalaz-core" % "7.2.0",
  "com.github.nscala-time" %% "nscala-time" % "2.0.0",
  "commons-io" % "commons-io" % "2.4",
  "com.github.tototoshi" % "play-json-naming_2.11" % "1.0.0",
  "com.amazonaws" % "aws-java-sdk" % "1.10.11",
  "net.debasishg" %% "redisclient" % "3.0",
  "joda-time" % "joda-time" % "2.4",
  "org.joda" % "joda-convert" % "1.6",
  "org.julienrf" %% "play-json-variants" % "2.0"
)
