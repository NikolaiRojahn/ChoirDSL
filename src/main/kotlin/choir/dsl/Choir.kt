package choir.dsl

class Choir (val name: String){
    var root: String = ""
    var description: String? = null
    var membersToWeb: String = ""

    val members = mutableListOf<Member>()

    fun add(member: Member){members.add(member)}

    fun membersToMarkdown(): String{
        var str = ""
        for (member in members){
            str += member.toString()
        }
        return str
    }
}

fun choir(name: String, root: String, build: Choir.() -> Unit = {}): Choir {
    val choir = Choir(name)
    choir.build()
    return choir
}