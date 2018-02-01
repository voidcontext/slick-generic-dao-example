name := "slick-generic-dao-example"

organization := "io.github.voidcontext"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.11.7"

resolvers += Resolver.typesafeRepo("releases")

scalacOptions := Seq("-feature", "-deprecation")

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.0.1",
  "com.h2database" % "h2" % "1.4.188",
  "ch.qos.logback" % "logback-classic" % "1.1.3",
  "org.scalatest" %% "scalatest" % "2.2.4" % "test"
)



