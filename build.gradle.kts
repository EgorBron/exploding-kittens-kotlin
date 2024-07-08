import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName

plugins {
    id("application")
    kotlin("jvm") version "1.9.23"
}

group = "net.blusutils"

repositories {
    mavenCentral()
}

// не работает
application {
    mainClass = "net.blusutils.MainKt"
}

tasks.jar {
    manifest {
        attributes["Main-Class"] = "net.blusutils.MainKt"
    }
    configurations["compileClasspath"].forEach { file: File ->
        from(zipTree(file.absoluteFile))
    }
    duplicatesStrategy = DuplicatesStrategy.INCLUDE
    archivesName = "EK"
}

kotlin {
    jvmToolchain(20)
}