name := "graphql-js"

version := "2018.8.5"

enablePlugins(ScalaJSPlugin)


val scala212 = "2.12.6"

scalaVersion := scala212

crossScalaVersions := Seq(scala212)

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)


//bintray
resolvers += Resolver.jcenterRepo

organization := "scalajs-graphql"

licenses += ("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html"))

bintrayOrganization := Some("scalajs-graphql")

bintrayRepository := "maven"


publishArtifact in Test := false

//Test
resolvers += Resolver.bintrayRepo("scalajs-graphql", "maven")

scalaJSStage in Global := FastOptStage
