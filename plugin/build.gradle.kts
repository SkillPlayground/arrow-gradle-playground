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
        create("PublishKotlinMultiplatform") {
            id = "com.javiersc.arrow.gradle.publish.kotlin.multiplatform"
            implementationClass = "com.javiersc.arrow.gradle.PublishKotlinMultiplatformPlugin"
            displayName = "Publish Kotlin Multiplatform"
            description = """Publish Kotlin Multiplatform"""
        }
    }
}

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    implementation(libs.kotlin.gradle)
}
