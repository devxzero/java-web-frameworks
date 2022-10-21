package javawebframeworks

import java.io.File

fun main() {
    val template = Thread.currentThread().contextClassLoader.getResourceAsStream("template.html")!!
        .bufferedReader()
        .readText()


    val tableHeader = """
        <table>
            <thead>
                <th>Name</th>
                <th>Source</th>
                <th>Languages</th>
            </thead>
    """.trimIndent()

    val tableFooter = """
        </table>
    """.trimIndent()


    val entriesHtml = data.sortedBy { it.name.lowercase() }.map {
        """<tr>
            |<td><a href="${it.dedicatedUrl}">${it.name}</a></td>
            |<td>${if (it.repositoryUrl != null ) """<a href='${it.repositoryUrl}'>source</a>""" else ""}</td>
            |<td>${it.languages.map { it.languageName }.joinToString(", ")}</td>
            |</tr>""".trimMargin()
    }.joinToString(" ")

    val tableHtml = """$tableHeader$entriesHtml$tableFooter"""

    val content = template.replace("<div id=\"placeholder\"></div>", tableHtml)
    File("index.html").writeText(content)

}

