plugins {
    kotlin("jvm") version "1.6.10"
    war
}

group = "dev.cooeeu"
version = "0.1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { url = uri("https://repo.spring.io/snapshot") }
}

dependencies {
    implementation("org.springframework:spring-webmvc:6.0.0-SNAPSHOT")
    implementation("org.springframework:spring-context-support:6.0.0-SNAPSHOT")
    implementation("org.freemarker:freemarker:2.3.31")
    compileOnly("jakarta.servlet:jakarta.servlet-api:5.0.0")
    implementation("ch.qos.logback:logback-classic:1.2.10")
}