buildscript {

    repositories {
        maven("https://plugins.gradle.org/m2/")
        mavenCentral()
        google()
    }

    dependencies {
        classpath("com.android.tools.build:gradle:4.1.3")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")
    }
}

allprojects {
    repositories {
        maven( "https://jitpack.io")
        mavenCentral()
        google()
    }
}

tasks.register("clean", Delete::class) {
    delete(buildDir)
}