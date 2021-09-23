plugins {
    `maven-publish`
}

val sourcesJar by project.tasks.creating(Jar::class) {
    group = "build"
    description = "Assembles Sources jar file for publishing"
    archiveClassifier.set("sources")
    from((project.properties["sourceSets"] as SourceSetContainer)["main"].allSource)
}

configure<PublishingExtension> {
    publications {
        withType<MavenPublication> {
            pom {
                name.set(property("pom.name").toString())
                description.set(property("pom.description").toString())
                url.set(property("pom.url").toString())

                licenses {
                    license {
                        name.set(property("pom.license.name").toString())
                        url.set(property("pom.license.url").toString())
                    }
                }

                developers {
                    developer {
                        id.set(property("pom.developer.id").toString())
                        name.set(property("pom.developer.name").toString())
                        email.set(property("pom.developer.email").toString())
                    }
                }

                scm {
                    url.set(property("pom.smc.url").toString())
                    connection.set(property("pom.smc.connection").toString())
                    developerConnection.set(property("pom.smc.developerConnection").toString())
                }
            }
            artifact(sourcesJar)
        }
        create<MavenPublication>("maven") { from(components["java"]) }
    }
}
