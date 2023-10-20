package exercises

/**
 * Given a String, return true if it ends in "ly".
 */

fun main() {
    println("Enter with the string")
    val inputString = readlnOrNull() ?: "String"

    println(verifyLast2Char(inputString))
}

fun verifyLast2Char(string: String): Boolean {
    return string.contains("ly")
}