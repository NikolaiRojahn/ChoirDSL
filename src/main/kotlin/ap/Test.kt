package ap

import choir.dsl.*
import choir.printers.FileContext
import choir.printers.Visitor
import choir.printers.GitHubPagesVisitor

fun main(){
    val choir = choir("Last Christmas", "/AP"){
        description = """
            This is a choir focusing on christmas songs.
            They will be performing every Sunday.
        """.trimIndent()

        member("Jörg", true)
        member("Morten", false)
        member("Claus", true)
        member("Nikolai", false)

        membersToWeb = """
            ${members.toString()}
        """.trimIndent()
    }

    GitHubPagesVisitor(FileContext("/Users/nr/Documents/NetBeansProjects/4_Semester/Kotlin/Week2/ChoirWebPages/docs")).visit(choir)

}