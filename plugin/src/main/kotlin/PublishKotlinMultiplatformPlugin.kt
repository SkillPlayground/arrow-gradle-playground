package com.javiersc.arrow.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.api.publish.maven.plugins.MavenPublishPlugin
import org.gradle.kotlin.dsl.apply
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType

class PublishKotlinMultiplatformPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        project.createPublishKotlinMultiplatformExtension()

        project.apply<MavenPublishPlugin>()

        project.afterEvaluate {
            project.configure<PublishingExtension> {
                publications {
                    withType(MavenPublication::class) {
                        pom {
                            name.set(project.publishKotlinMultiplatformExtension.pomName)
                            description.set(
                                project.publishKotlinMultiplatformExtension.pomDescription
                            )
                            url.set(project.publishKotlinMultiplatformExtension.pomUrl)

                            licenses {
                                license {
                                    name.set(
                                        project.publishKotlinMultiplatformExtension.pomLicenseName
                                    )
                                    url.set(
                                        project.publishKotlinMultiplatformExtension.pomLicenseUrl
                                    )
                                }
                            }

                            developers {
                                developer {
                                    id.set(
                                        project.publishKotlinMultiplatformExtension.pomDeveloperId
                                    )
                                    name.set(
                                        project.publishKotlinMultiplatformExtension.pomDeveloperName
                                    )
                                    email.set(
                                        project
                                            .publishKotlinMultiplatformExtension
                                            .pomDeveloperEmail
                                    )
                                }
                            }

                            scm {
                                url.set(project.publishKotlinMultiplatformExtension.pomSmcUrl)
                                connection.set(
                                    project.publishKotlinMultiplatformExtension.pomSmcConnection
                                )
                                developerConnection.set(
                                    project
                                        .publishKotlinMultiplatformExtension
                                        .pomSmcDeveloperConnection
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
