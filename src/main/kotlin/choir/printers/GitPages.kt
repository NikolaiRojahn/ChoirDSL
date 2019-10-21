package choir.printers

import choir.dsl.*
import choir.printers.*
import kotlin.reflect.KClass

class GitHubPagesVisitor(val context: Context) : Visitor {

/*  fun resourceHeader(type: KClass<Resource>) = when (type) {
    SlideShowResource::class -> "Slides"
    RepositoryResource::class -> "Repositories"
    ExternalLinkResource::class -> "External links"
    else -> "Other resources"
    }

  fun taxonomiHeader(taxonomi: Taxonomi) = when (taxonomi) {
    Taxonomi.KNOWLEDGE -> "know"
    Taxonomi.COMPREHENSION -> "understand"
    Taxonomi.APPLICATION -> "master"
    Taxonomi.ANALYSIS -> "be able to analyse"
    Taxonomi.SYNTHESIS -> "be able to change"
    Taxonomi.EVALUATION -> "be able to evaluate"
    }

  fun activityHeader(type: ActivityType) = when (type) {
    ActivityType.READ -> "**Read**"
    ActivityType.WRITE -> "**Write**"
    ActivityType.WORK -> "**Do**"
    }

  fun printResources(title: String, list: List<Resource>) {
    if (list.isEmpty()) return
    with (context) {
      printLine("###", title)
      list.forEach { printLine("* [${it.title}](${it.link})",0) }
      printLine()
      }
    }*/

  override fun visit(choir: Choir) {
    val filename = "${choir.root}/test.md"
    with (context) {
      open(filename)
      printLine("# ${choir.name}")
      printLine(choir.description)
      /*course.flows.forEach { visit(it) }

      printLine("## Resources")
      printResources("Slides", course.resources.filter { it is SlideShowResource })
      printResources("Repositories", course.resources.filter { it is RepositoryResource })
      printResources("External links", course.resources.filter { it is ExternalLinkResource })

      printLine("## Assignments and Credits")
      printLine(course.creditable)
      printLine("| Title | Credits |", 0)
      printLine("| :---- | ------: |", 0)
      course.creditables.forEach {
        if (it is Link && it.active) printLine(" | [${it.title}](${it.link}) | ${it.credits} |", 0)
        else printLine("| ${it.title} | ${it.credits} |", 0)
        }
      printLine()
      printLine("## Exam")
      printLine(course.exam)*/
      close()
      }
    }



  }

