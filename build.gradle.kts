buildscript {

    extra["minSdkVersion"] = 15
    extra["compileSdkVersion"] = 30
    extra["targetSdkVersion"] = 30

    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")

    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.google.com")
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}