// Top-level build file where you can add configuration options common to all sub-projects/modules.

plugins {
    `kotlin-dsl`
}
buildscript {

    val kotlinVersion = Versions.kotlinVersion
    val androidPluginVersion = Versions.androidPluginVersion
    val navigationVersion = Versions.navigationVersion

    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${androidPluginVersion}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlinVersion}")
        classpath("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:${navigationVersion}")

        // NOTE: Do not place your application dependencies here; they belong
        // in the individual module build.gradle.kts files
    }
}

allprojects {
    repositories {
        google()
        jcenter()
//        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}

//tasks.register("clean",Delete::class){
//    delete(rootProject.buildDir)
//}

tasks.create("runs every time"){
    println("\nThis is the task that runs every single time, do some awesome stuffs with custom tasks now !!!")
    println ("Running gradle version: ${gradle.gradleVersion}")
}


