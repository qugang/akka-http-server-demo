lazy val akkaHttpVersion = "10.0.9"
lazy val akkaVersion    = "2.5.3"


resolvers += Resolver.mavenLocal

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization    := "com.zq.httpServer",
      scalaVersion    := "2.12.2"
    )),
    name := "zq-http-server",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http"         % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-http-xml"     % akkaHttpVersion,
      "com.typesafe.akka" %% "akka-stream"       % akkaVersion,
      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
      "org.scalatest"     %% "scalatest"         % "3.0.1"         % Test,
      "com.typesafe.akka" %% "akka-http-spray-json" % "10.0.9",
      "com.softwaremill.akka-http-session" %% "core" % "0.5.1",
       "com.softwaremill.akka-http-session" %% "jwt"  % "0.5.1", // optional
      "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
      "ch.qos.logback" % "logback-classic" % "1.1.7",
      "com.sicdt" %"sicdt-sdk-java-new" % "0.0.2-SNAPSHOT"
    )
  )