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
    val filename = "${choir.root}/README.md"
    with (context) {
      open(filename)
      printLine("# ${choir.name}")
      printLine(choir.description)
      printLine("### Members")
      printLine("| Name | Voice |", 0)
      printLine(choir.membersToMarkdown(), 0)
      close()
      }
    }

  }

