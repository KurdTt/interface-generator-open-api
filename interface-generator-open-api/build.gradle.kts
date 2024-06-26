/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Gradle plugin project to get you started.
 * For more details on writing Custom Plugins, please refer to https://docs.gradle.org/8.7/userguide/custom_plugins.html in the Gradle documentation.
 */

plugins {
    id("org.jetbrains.kotlin.jvm") version "1.9.23"
    id("maven-publish")
    id("java-gradle-plugin")
}

group = "com.miquido"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.23")
    implementation("org.openapitools:openapi-generator-gradle-plugin:7.4.0")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

kotlin {
    jvmToolchain(21)
}

gradlePlugin {
    plugins {
        create("interfaceGeneratorOpenApi") {
            id = "interface-generator-open-api"
            implementationClass = "com.miquido.plugin.openapi.OpenApiGeneratorPlugin"
        }
    }
}