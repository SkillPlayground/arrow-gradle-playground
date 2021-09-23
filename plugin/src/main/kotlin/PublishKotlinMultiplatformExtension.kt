package com.javiersc.arrow.gradle

import org.gradle.api.Project
import org.gradle.kotlin.dsl.create
import org.gradle.kotlin.dsl.getByType

interface PublishKotlinMultiplatformExtension {
    var pomName: String
    var pomDescription: String
    var pomUrl: String
    var pomLicenseName: String
    var pomLicenseUrl: String
    var pomDeveloperId: String
    var pomDeveloperName: String
    var pomDeveloperEmail: String
    var pomSmcUrl: String
    var pomSmcConnection: String
    var pomSmcDeveloperConnection: String
}

internal fun Project.createPublishKotlinMultiplatformExtension(): PublishKotlinMultiplatformExtension =
    extensions.create("publishKotlinMultiplatform")

internal val Project.publishKotlinMultiplatformExtension: PublishKotlinMultiplatformExtension
    get() = extensions.getByType()
