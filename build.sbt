import scala.collection.Seq

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.4.1"

val oxVersion = "0.0.25"

lazy val root = (project in file("."))
  .settings(
    name := "ox-learning"
  )

libraryDependencies ++= Seq(
  "com.softwaremill.ox" %% "core" % oxVersion
)
