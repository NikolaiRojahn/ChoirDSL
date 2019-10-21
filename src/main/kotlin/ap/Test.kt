package ap

import choir.dsl.*
import choir.printers.FileContext
import choir.printers.Visitor
import choir.printers.GitHubPagesVisitor

fun main(){
    val choir = choir("TEST", "/AP"){
        description = """
            Dette er en test.
        """.trimIndent()
    }

    GitHubPagesVisitor(FileContext("/Users/morte/Documents/Kotlin/Week 2 DSL/pages")).visit(choir)

}