plugins {
    `kotlin-dsl`
    `publish-kotlin-jvm`
}

dependencies {
    implementation(gradleApi())
    implementation(gradleKotlinDsl())
    implementation(libs.kotlin.gradle)
}
