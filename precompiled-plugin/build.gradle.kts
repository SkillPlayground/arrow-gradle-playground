plugins {
    `kotlin-dsl`
    `publish-kotlin-jvm`
    id("com.gradle.plugin-publish")
}

pluginBundle {
    website = property("pom.smc.url").toString()
    vcsUrl = property("pom.smc.connection").toString()
}

gradlePlugin {
    plugins {
        named("com.javiersc.arrow.gradle.publish.kotlin.multiplatform.precompiled") {
            id = "com.javiersc.arrow.gradle.publish.kotlin.multiplatform.precompiled"
            displayName = "Kotlin Multiplatform Publish"
            description = """Kotlin Multiplatform Publish Description"""
        }
    }
}

dependencies {
    implementation(libs.kotlin.gradle)
}
