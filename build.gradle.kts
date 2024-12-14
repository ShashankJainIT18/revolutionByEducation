plugins {
	java
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
}

group = "com.rbe"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
	implementation("org.springframework:spring-web:6.2.1")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa:3.4.0")
	compileOnly("org.projectlombok:lombok:1.18.36")
	implementation("com.mysql:mysql-connector-j:9.1.0")

}

tasks.withType<Test> {
	useJUnitPlatform()
}
