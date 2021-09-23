enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") { from(files("../gradle/libs.toml")) }
    }
}
