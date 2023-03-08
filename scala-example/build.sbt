
scalaVersion := "2.13.10"

name := "sbt-example"
version := "1.0"


libraryDependencies ++= Seq(
  "org.scala-lang.modules" %% "scala-parser-combinators" % "2.1.1",
  "org.scalatest" %% "scalatest" % "3.2.7" % Test

)

val exampleTask = taskKey[Unit]("Task that prints Example of custom tasks")
exampleTask := println("Example of custom task")


