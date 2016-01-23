enablePlugins(ScalaJSPlugin)

name := "phaser-scala-js"

organization := "com.github.dpitkevics"

version := "1.0"

scalaVersion := "2.11.7"

publishMavenStyle := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.1"
)

jsDependencies ++= Seq(
  "org.webjars.bower" % "phaser" % "2.4.4" / "phaser.js" commonJSName "Phaser"
)

scalaJSStage in Global := FastOptStage
