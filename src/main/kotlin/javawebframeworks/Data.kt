package javawebframeworks

val data = listOf(
    Entry(
        name = "Spring MVC",
        dedicatedUrl = "https://spring.io/projects/spring-framework",
        description = "Part of Spring Framework",
        languages = listOf(Language.JAVA, Language.KOTLIN),
        repositoryUrl = "https://github.com/spring-projects/spring-framework",
    ),
    Entry(
        name = "Tapestry",
        dedicatedUrl = "https://tapestry.apache.org/",
        repositoryUrl = "https://github.com/apache/tapestry-5",
        description = "",
        languages = listOf(Language.JAVA)
    ),
    Entry(
        name = "Vaadin",
        dedicatedUrl = "https://vaadin.com/",
        repositoryUrl = "https://github.com/vaadin/framework",
        description = "",
        languages = listOf(Language.JAVA)
    ),
    Entry(
        name = "Wicket",
        dedicatedUrl = "https://wicket.apache.org/",
        repositoryUrl = "https://github.com/apache/wicket",
        description = "",
        languages = listOf(Language.JAVA)
    ),
    Entry(
        name = "Kweb",
        dedicatedUrl = "http://kweb.io/",
        repositoryUrl = "https://github.com/kwebio/kweb-core",
        description = "",
        languages = listOf(Language.KOTLIN)
    ),
    Entry(
        name = "JavaServer Faces (JSF)",
        dedicatedUrl = "https://jakarta.ee/specifications/faces/",
        description = "",
        languages = listOf(Language.JAVA)
    ),
    Entry(
        name = "Play",
        dedicatedUrl = "https://www.playframework.com/",
        repositoryUrl = "https://github.com/playframework/playframework",
        description = "",
        languages = listOf(Language.JAVA, Language.SCALA)
    ),
    Entry(
        name = "Jooby",
        dedicatedUrl = "https://jooby.io/",
        repositoryUrl = "https://github.com/jooby-project/jooby",
        description = "",
        languages = listOf(Language.JAVA, Language.KOTLIN)
    ),
    Entry(
        name = "Struts",
        dedicatedUrl = "https://struts.apache.org/",
        repositoryUrl = "https://github.com/apache/struts",
        description = "",
        languages = listOf(Language.JAVA)
    ),
    Entry(
        name = "Grails",
        dedicatedUrl = "https://grails.org/",
        repositoryUrl = "https://github.com/grails/grails-core",
        description = "",
        languages = listOf(Language.GROOVY)
    ),
    Entry(
        name = "GWT",
        dedicatedUrl = "https://www.gwtproject.org/",
        repositoryUrl = "https://github.com/gwtproject/gwt",
        description = "",
        languages = listOf(Language.JAVA)
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
        languages = listOf(Language.KOTLIN)
    ),
    Entry(
        name = "Kobweb",
        dedicatedUrl = "https://kobweb.varabyte.com/",
        repositoryUrl = "https://github.com/varabyte/kobweb",
        description = "",
        languages = listOf(Language.KOTLIN)
    )
)


data class Entry(
    val name: String,
    val dedicatedUrl: String,
    val repositoryUrl: String? = null,
    val description: String,
    val languages: List<Language>,
)

enum class Language(val languageName: String) {
    JAVA("Java"),
    SCALA("Scala"),
    KOTLIN("Kotlin"),
    GROOVY("Groovy"),
}