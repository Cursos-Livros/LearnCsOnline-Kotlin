package exercises

/**
 * Given a non-null String, return a version rotated right 2 where the last 2 characters are moved to the start.
 * The String length will be at least 2.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (!testNumberSize3(inputWord)) {
        messageError6()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    val result = right2(inputWord)

    println(result)
}

fun testNumberSize3(word: String): Boolean {
    return word.length >= 2
}

fun messageError6() {
    println("The word is empty!")
    println("Enter the word again!")
}

fun right2(word: String): String {
    val lastTwo = word.substring(word.length - 2)
    val removeLastChars = word.substring(0..word.length - 3)
    return "$lastTwo$removeLastChars"
}

