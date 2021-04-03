buildscript {

    extra["minSdkVersion"] = 15
    extra["compileSdkVersion"] = 30
    extra["targetSdkVersion"] = 30

    repositories {
        maven("https://plugins.gradle.org/m2/")
        mavenCentral()
        google()
        gradlePluginPortal()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
    }
}

allprojects {
    repositories {
        maven("https://plugins.gradle.org/m2/")
        maven( "https://jitpack.io")
        mavenCentral()
        google()
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}