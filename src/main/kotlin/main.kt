import java.io.File

/*fun main() {
    val passwords = File(ClassLoader.getSystemResource("content").file).readText().split("\n")
    val splitPasswords = mutableListOf<List<String>>()
    passwords.forEach { splitPasswords.add(it.split(" ")) }
    var validCount = 0
    for (item in splitPasswords) {
        val count = item[2].count { c -> c == item[1][0] }
        val minMax = item[0].split("-").map { it.toInt() }
        if (count >= minMax[0] && count <= minMax[1]) {
            println("$item is valid")
            validCount++
        }
        println(count)
    }
    println(validCount)
}*/

fun main() {
    val splitPasswords = File(ClassLoader.getSystemResource("content").file)
        .readText()
        .split("\n")
        .map { it.split(" ") }
    var validCount = 0
    for (item in splitPasswords) {
        val minMax = item[0].split("-").map { it.toInt() - 1 }
        println(item[1][0])
        if (item[2][minMax[0]] == item[1][0] && item[2][minMax[1]] == item[1][0]) {
            continue
        } else if (item[2][minMax[0]] == item[1][0] || item[2][minMax[1]] == item[1][0]) {
            println("$item is valid")
            validCount++
        }
    }
    println(validCount)
}
