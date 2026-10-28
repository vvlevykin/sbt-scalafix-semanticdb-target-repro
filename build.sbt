ThisBuild / scalaVersion := "3.9.0"
ThisBuild / semanticdbEnabled := true
ThisBuild / scalacOptions += "-Wunused:imports"

lazy val root = (project in file("."))
