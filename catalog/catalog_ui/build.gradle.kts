plugins {
    alias(plugins.plugins.com.android.library)
    id("com.marmatsan.android")
    id("com.marmatsan.compose")
}

dependencies {
    /* Modules */
    // Core
    implementation(projects.core.coreUi)
    implementation(projects.core.coreDomain)
    // Catalog
    implementation(projects.catalog.catalogDomain)

    /* Libraries */
    implementation(libs.com.github.skydoves)
    implementation(libs.com.google.protobuf)
}