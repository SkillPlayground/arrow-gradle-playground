import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.withType

fun Project.setupPublishing(
    pomName: String,
    pomDescription: String,
    pomUrl: String,
    pomLicenseName: String,
    pomLicenseUrl: String,
    pomDeveloperId: String,
    pomDeveloperName: String,
    pomDeveloperEmail: String,
    pomSmcUrl: String,
    pomSmcConnection: String,
    pomSmcDeveloperConnection: String,
) {
    project.afterEvaluate {
        project.configure<PublishingExtension> {
            publications {
                withType(MavenPublication::class) {
                    pom {
                        name.set(pomName)
                        description.set(pomDescription)
                        url.set(pomUrl)

                        licenses {
                            license {
                                name.set(pomLicenseName)
                                url.set(pomLicenseUrl)
                            }
                        }

                        developers {
                            developer {
                                id.set(pomDeveloperId)
                                name.set(pomDeveloperName)
                                email.set(pomDeveloperEmail)
                            }
                        }

                        scm {
                            url.set(pomSmcUrl)
                            connection.set(pomSmcConnection)
                            developerConnection.set(pomSmcDeveloperConnection)
                        }
                    }
                }
            }
        }
    }
}
