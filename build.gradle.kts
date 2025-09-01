plugins {
    id("java")
    id("application")
}

group = "dev.project"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.liquibase:liquibase-core:4.33.0")
    implementation("mysql:mysql-connector-java:8.0.33")
    implementation("org.projectlombok:lombok:1.18.38")

    compileOnly("org.projectlombok:lombok:1.18.34")
    annotationProcessor("org.projectlombok:lombok:1.18.34")
    testCompileOnly("org.projectlombok:lombok:1.18.34")
    testAnnotationProcessor("org.projectlombok:lombok:1.18.34")}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass = "dev.project.Main"
}