package javawebframeworks

import java.io.File


class HtmlGenerator {
    fun generate(entries: Iterable<Entry>): String {
        val template = Thread.currentThread().contextClassLoader.getResourceAsStream("template.html")!!
            .bufferedReader()
            .readText()

        val tableHeader = """
            <table>
                <thead>
                    <th>Name</th>
                    <th>Source</th>
                    <th>Languages</th>
                    <th>Platform</th>
                    <th>Pattern</th>
                </thead>
        """.trimIndent()

        val tableFooter = """
            </table>
        """.trimIndent()


        val entriesHtml = entries.sortedBy { it.name.lowercase() }.map {
            """<tr>
                |<td><a href="${it.dedicatedUrl}">${it.name}</a></td>
                |<td>${if (it.repositoryUrl != null ) """<a href='${it.repositoryUrl}'>source</a>""" else ""}</td>
                |<td>${it.languages.map { it.languageName }.joinToString(", ")}</td>
                |<td>${it.serverSidePlatform ?: ""}</td>
                |<td>${it.pattern ?: ""}</td>
                |</tr>""".trimMargin()
        }.joinToString(" ")

        val tableHtml = """$tableHeader$entriesHtml$tableFooter"""

        val content = template.replace("<div id=\"placeholder\"></div>", tableHtml)
        return content
    }
}

class MarkdownGenerator {
    fun generate(entries: Iterable<Entry>): String {
        val template = Thread.currentThread().contextClassLoader.getResourceAsStream("template.md")!!
            .bufferedReader()
            .readText()

        val tableHeader = """
            | Name | Source | Languages | Platform | Pattern |
            | ---- | ------ | --------- | -------- | ------- |
        """.trimIndent()

        val tableFooter = """
        """.trimIndent()


        val entriesHtml = entries.sortedBy { it.name.lowercase() }.map {
            """| [${it.name}](${it.dedicatedUrl})
               | ${if (it.repositoryUrl != null ) """[source](${it.repositoryUrl})""" else ""}
               | ${it.languages.map { it.languageName }.joinToString(", ")}
               | ${it.serverSidePlatform ?: ""}
               | ${it.pattern ?: ""}
               |""".trimIndent().replace('\n', ' ')
        }.joinToString("\n")

        val tableHtml = "$tableHeader\n$entriesHtml\n$tableFooter"

        val content = template.replace("<<PLACEHOLDER>>", tableHtml)
        return content
    }
}

fun main() {
    File("index.html").writeText(HtmlGenerator().generate(data))
    File("README.md").writeText(MarkdownGenerator().generate(data))
}

