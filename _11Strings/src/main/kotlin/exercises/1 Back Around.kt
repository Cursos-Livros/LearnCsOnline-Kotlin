package exercises

/**
 * Given a String, take the last char and return a new String with the last character added at the front and back, so "cat" yields "tcatt".
 * The original string will be length 1 or more.
 */

fun main() {
    println("Enter with the string")
    val inputString = readlnOrNull() ?: "String"

    val newString = "${lastChar(inputString)}$inputString${lastChar(inputString)}"

    println(newString)
}

fun lastChar(string: String): Char {
    val size = string.length
    val lastchar = string[size - 1]
    return lastchar
}