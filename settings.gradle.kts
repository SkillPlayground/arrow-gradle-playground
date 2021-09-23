enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
        mavenLocal { content { includeGroup("com.javiersc.arrow-gradle") } }
    }

    versionCatalogs { create("libs") { from(files("gradle/libs.toml")) } }
}

if (System.getProperty("idea.sync.active")?.toBoolean() == true) {
    include(
        ":consumer-no-plugin",
        ":consumer-plugin",
        ":consumer-precompiled-plugin",
    )
}

include(
    ":no-plugin",
    ":plugin",
    ":precompiled-plugin",
)
