resolvers += "Local Maven Repository" at {
val path = "file://"; Path.userHome.absolutePath + "/.ivy2/local"
println(path)
path
}

addSbtPlugin("org.scala-sbt" % "sbt-android-plugin" % "0.6.2-SNAPSHOT")
