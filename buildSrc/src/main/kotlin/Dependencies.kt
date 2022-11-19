object Dependencies {

    // kotlin
    const val KOTLIN_REFLECT = "org.jetbrains.kotlin:kotlin-reflect"
    const val KOTLIN_JDK = "org.jetbrains.kotlin:kotlin-stdlib-jdk8"
    const val JACKSON = "com.fasterxml.jackson.module:jackson-module-kotlin:${DependencyVersions.JACKSON_VERSION}"

    // web
    const val SPRING_WEB = "org.springframework.boot:spring-boot-starter-web"

    // validation
    const val SPRING_VALIDATION = "org.springframework.boot:spring-boot-starter-validation"

    // database
    const val SPRING_DATA_JPA = "org.springframework.boot:spring-boot-starter-data-jpa"
    const val MYSQL_CONNECTOR = "mysql:mysql-connector-java"

    // test
    const val SPRING_TEST = "org.springframework.boot:spring-boot-starter-test:${PluginVersions.SPRING_BOOT_VERSION}"
}