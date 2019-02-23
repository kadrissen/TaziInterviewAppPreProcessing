name := "PreProcessing"

organization := "com.example"

version := "0.1-" + new java.util.Date().getTime

scalaVersion := "2.12.8"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"

libraryDependencies += "com.example" %% "utilities" % "0.1"

libraryDependencies += "com.example" %% "foo" % "0.1"


//Artifactory repo configuration
//var taziRepository : String = "http://<host>:<port>/artifactory/<repo-key>"
//var userName : String = "user name"
//var password : String = "password"
//resolvers += "Artifactory" at taziRepository

//For releases
//publishTo := Some("Artifactory Realm" at taziRepository)
//credentials += Credentials("Artifactory Realm", "<host>", userName, password)

//For snapshots
//publishTo := Some("Artifactory Realm" at taziRepository +";build.timestamp=" + new java.util.Date().getTime)
//credentials += Credentials("Artifactory Realm", "<host>", userName, password)
