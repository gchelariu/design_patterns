plugins {
    application
}

repositories {
    mavenLocal()
}

dependencies {
    compileOnly("org.projectlombok:lombok:1.18.24")
    annotationProcessor("org.projectlombok:lombok:1.18.24")

    testCompileOnly("org.projectlombok:lombok:1.18.24")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.24")
}

application {
    mainClass.set("Optinals.java")
}

group = "gbrl"
version = "1.0-SNAPSHOT"
description = "design-patterns"
java.sourceCompatibility = JavaVersion.VERSION_17

