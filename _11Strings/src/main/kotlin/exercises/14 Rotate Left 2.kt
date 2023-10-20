package exercises

/**
 * Given a String, return a rotated left 2 version where the first 2 chars are moved to the end. The string length will be at least 2.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (!testNumberSize4(inputWord)) {
        messageError7()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    val result = rotateLeft(inputWord)

    println(result)
}

fun testNumberSize4(word: String): Boolean {
    return word.length >= 2
}

fun messageError7() {
    println("The word is empty!")
    println("Enter the word again!")
}

fun rotateLeft(word: String): String {
    val firstTwo = word.substring(0..1)
    val removeFirstChars = word.substring(2)
    return "$removeFirstChars$firstTwo"
}