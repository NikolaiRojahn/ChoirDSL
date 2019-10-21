package choir.dsl

class Member (val choir: Choir, val shortVoice: Boolean,  val firstName: String){
    var lastName = ""
    var email = ""
    var phone = ""
    var voice = Voice.LONG

    fun addVoice(shortVoice: Boolean){
        if (shortVoice){
            voice = Voice.SHORT
        }
    }
}

fun Choir.member(firstName: String, shortVoice: Boolean, build: Member.() -> Unit = {}): Member {
    val member = Member(this, shortVoice, firstName)
    this.add(member)
    member.build()
    member.addVoice(shortVoice)
    return member
}