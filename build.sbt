name := "playScalaCustomErrorHandlerTest"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(  
)

routesGenerator := InjectedRoutesGenerator
