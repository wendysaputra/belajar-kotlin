fun main() {

    val names: Array<String> = arrayOf("Eko", "Joko", "Budi")
    // names.set(0, "Rudi")
    names[0] = "Rudi"
    println(names[0])

    val nilai: Array<Int> = arrayOf(10,9,8)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val members: Array<String?> = arrayOfNulls(5)
    members[0] = "Haji"
    members[1] = "Hikmat"
    members[2] = "Hidayat"
    members[3] = null
    members[4] = "cnn"
    println(members.size)

}