import sbt._

import Keys._
import AndroidKeys._

object General {
  val settings = Defaults.defaultSettings ++ Seq (
    name := "GSoC 2012",
    version := "0.1",
    versionCode := 0,
    scalaVersion := "2.10.0-M5",
    platformName in Android := "android-15"
  )

  val proguardSettings = Seq (
    useProguard in Android := true
  )

  lazy val fullAndroidSettings =
    General.settings ++
    AndroidProject.androidSettings ++
    TypedResources.settings ++
    proguardSettings ++
    AndroidManifestGenerator.settings ++
    AndroidMarketPublish.settings ++ Seq (
      keyalias in Android := "change-me"/* ,
      libraryDependencies += "org.scalatest" %% "scalatest" % "1.8.RC1" % "test" */
    )
}

object AndroidBuild extends Build {
  lazy val main = Project (
    "GSoC 2012",
    file("."),
    settings = General.fullAndroidSettings
  )

  lazy val tests = Project (
    "tests",
    file("tests"),
    settings = General.settings ++
               AndroidTest.androidSettings ++
               General.proguardSettings ++ Seq (
      name := "GSoC 2012Tests"
    )
  ) dependsOn main
}
