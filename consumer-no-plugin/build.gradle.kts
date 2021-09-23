plugins {
    kotlin("multiplatform")
    `maven-publish`
}

setupPublishing(
    pomName = "Arrow Gradle",
    pomDescription = "Arrow Gradle playground",
    pomUrl = "https://github.com/JavierSegoviaCordoba/arrow-gradle",
    pomLicenseName = "The Apache License, Version 2.0",
    pomLicenseUrl = "https://www.apache.org/licenses/LICENSE-2.0.txt",
    pomDeveloperId = "JavierSegoviaCordoba",
    pomDeveloperName = "Javier Segovia Cordoba",
    pomDeveloperEmail = "javier@segoviacordoba.com",
    pomSmcUrl = "https://github.com/JavierSegoviaCordoba/arrow-gradles",
    pomSmcConnection = "scm:git:git@github.com:JavierSegoviaCordoba/arrow-gradle.git",
    pomSmcDeveloperConnection = "scm:git:git@github.com:JavierSegoviaCordoba/arrow-gradle.git",
)

kotlin {
    jvm()
}
