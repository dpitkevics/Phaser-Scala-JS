//enablePlugins(ScalaJSPlugin)

name := "Phaser Scala JS"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.8.1"
)

jsDependencies ++= Seq(
  "org.webjars.bower" % "phaser" % "2.4.4" / "phaser.js" commonJSName "Phaser"
)

scalaJSStage in Global := FastOptStage
