package choir.dsl

class Choir (val name: String){
    var root: String? =null
    var description: String? = null

    val members = mutableListOf<Member>()

    fun add(member: Member){members.add(member)}
}

fun choir(name: String, root: String, build: Choir.() -> Unit = {}): Choir {
    val choir = Choir(name)
    choir.build()
    return choir
}