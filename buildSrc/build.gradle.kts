plugins {
    `kotlin-dsl`
}

repositories {
    mavenCentral()
    gradlePluginPortal()
    google()
    mavenLocal {
        content {
            includeGroup("com.javiersc.arrow-gradle")
        }
    }
}

dependencies {
    // TODO: remove when the next issue is fixed:
    //  https://github.com/gradle/gradle/issues/15383#issuecomment-779893192
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))

    implementation(libs.kotlin.gradle) // all projects using Kotlin will use the same Kotlin version
    implementation(libs.gradle.pluginPublish) // share Gradle publish plugin version

    if (System.getProperty("idea.sync.active")?.toBoolean() == true) {
        implementation(libs.arrow.gradle.noPluginx)
        implementation(libs.arrow.gradle.precompiled)
        implementation(libs.arrow.gradle.pluginx)
    }
}
