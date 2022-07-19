fun main() {

    var firstName: String = "Wendy"
    var lastName: String = "Saputra"

    var address: String = """
        >Jalan belum jadi, RT 01 RW 01,
        >Kota Bandung,
        >Jawa barat,
        >Indonesia
        """.trimMargin(">")

    println(firstName)
    println(lastName)
    println(address)

    var fullName: String = "$firstName $lastName"
    println(fullName)

    var desc: String = "$fullName length = ${fullName.length}"
    println(desc)
}