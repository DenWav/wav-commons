plugins {
    java
    id("net.minecrell.licenser") version "0.3"
}

val test: Test by tasks

group = "com.demonwav"
version = "1.0.0-SNAPSHOT"

base {
    archivesBaseName = "wav-commons"
}

repositories {
    mavenCentral()
}

dependencies {
    testCompile("org.junit.jupiter:junit-jupiter-api:5.1.0")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.1.0")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

test.apply {
    useJUnitPlatform {
        includeEngines("junit-jupiter")
    }
}

license {
    header = file("meta/header.txt")
    include("**/*.kt", "**/*.java", "**/*.kts")
}
