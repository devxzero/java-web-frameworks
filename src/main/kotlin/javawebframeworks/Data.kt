package javawebframeworks

val data = listOf(
    Entry(
        name = "Spring MVC",
        dedicatedUrl = "https://spring.io/projects/spring-framework",
        description = "Part of Spring Framework",
        languages = listOf(Language.JAVA, Language.KOTLIN),
        repositoryUrl = "https://github.com/spring-projects/spring-framework",
        serverSidePlatform = "Servlet",
        pattern = "mvc",
    ),
    Entry(
        name = "Spring Boot",
        dedicatedUrl = "https://spring.io/projects/spring-boot",
        description = "Not directly related to web, but often used with Spring MVC.",
        languages = listOf(Language.JAVA, Language.KOTLIN),
        repositoryUrl = "https://github.com/spring-projects/spring-boot",
        category = "Spring application platform"
    ),
    Entry(
        name = "Tapestry",
        dedicatedUrl = "https://tapestry.apache.org/",
        repositoryUrl = "https://github.com/apache/tapestry-5",
        description = "",
        languages = listOf(Language.JAVA),
        serverSidePlatform = "Servlet",
        category = "web framework",
    ),
    Entry(
        name = "Vaadin",
        dedicatedUrl = "https://vaadin.com/",
        repositoryUrl = "https://github.com/vaadin/framework",
        description = "",
        languages = listOf(Language.JAVA),
        serverSidePlatform = "Servlet, Spring Boot, GWT",
        category = "web framework",
    ),
    Entry(
        name = "Wicket",
        dedicatedUrl = "https://wicket.apache.org/",
        repositoryUrl = "https://github.com/apache/wicket",
        description = "",
        languages = listOf(Language.JAVA),
        serverSidePlatform = "Servlet",
        category = "web framework",
    ),
    Entry(
        name = "Kweb",
        dedicatedUrl = "http://kweb.io/",
        repositoryUrl = "https://github.com/kwebio/kweb-core",
        description = "",
        languages = listOf(Language.KOTLIN),
        serverSidePlatform = "Ktor or Servlet",
        category = "web framework",
    ),
    Entry(
        name = "JavaServer Faces (JSF)",
        dedicatedUrl = "https://jakarta.ee/specifications/faces/",
        description = "",
        languages = listOf(Language.JAVA),
        serverSidePlatform = "Servlet",
        category = "web framework",
    ),
    Entry(
        name = "Play",
        dedicatedUrl = "https://www.playframework.com/",
        repositoryUrl = "https://github.com/playframework/playframework",
        description = "",
        languages = listOf(Language.JAVA, Language.SCALA),
        serverSidePlatform = "Akka or Netty",
        pattern = "mvc",
        category = "web framework",
    ),
    Entry(
        name = "Jooby",
        dedicatedUrl = "https://jooby.io/",
        repositoryUrl = "https://github.com/jooby-project/jooby",
        description = "",
        languages = listOf(Language.JAVA, Language.KOTLIN),
        serverSidePlatform = "Servlet"
    ),
    Entry(
        name = "Struts",
        dedicatedUrl = "https://struts.apache.org/",
        repositoryUrl = "https://github.com/apache/struts",
        description = "",
        languages = listOf(Language.JAVA),
        serverSidePlatform = "Servlet",
        category = "web framework",
    ),
    Entry(
        name = "Grails",
        dedicatedUrl = "https://grails.org/",
        repositoryUrl = "https://github.com/grails/grails-core",
        description = "",
        languages = listOf(Language.GROOVY),
        serverSidePlatform = "Servlet",
        pattern = "mvc",
        category = "web framework",
    ),
    Entry(
        name = "GWT",
        dedicatedUrl = "https://www.gwtproject.org/",
        repositoryUrl = "https://github.com/gwtproject/gwt",
        description = "",
        languages = listOf(Language.JAVA),
        serverSidePlatform = "Servlet",
        category = "web framework, Java-to-JS compiler",
    ),
    Entry(
        name = "Udash",
        dedicatedUrl = "https://udash.io/",
        repositoryUrl = "https://github.com/UdashFramework/udash-core",
        description = "",
        languages = listOf(Language.SCALA)
    ),
    Entry(
        name = "fritz2",
        dedicatedUrl = "https://www.fritz2.dev/",
        repositoryUrl = "https://github.com/jwstegemann/fritz2",
        description = "",
        languages = listOf(Language.KOTLIN),
        serverSidePlatform = "Ktor or Spring Boot or Servlet",
    ),
    Entry(
        name = "Kobweb",
        dedicatedUrl = "https://kobweb.varabyte.com/",
        repositoryUrl = "https://github.com/varabyte/kobweb",
        description = "",
        languages = listOf(Language.KOTLIN),
        serverSidePlatform = "Ktor",
        category = "web framework",
    )
)


data class Entry(
    val name: String,
    val dedicatedUrl: String,
    val repositoryUrl: String? = null,
    val description: String? = null,
    val serverSidePlatform: String? = null,
    val pattern: String? = null,
    val category: String? = null,
    val languages: List<Language>,
)

enum class Language(val languageName: String) {
    JAVA("Java"),
    SCALA("Scala"),
    KOTLIN("Kotlin"),
    GROOVY("Groovy"),
}