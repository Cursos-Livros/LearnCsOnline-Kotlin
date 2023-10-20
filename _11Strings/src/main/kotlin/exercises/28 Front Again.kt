package exercises

/**
 * Given a String, return true if the first 2 characters in the String also appear in order at the end, such as with "edited" or "ed".
 */

fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe28()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println(repeatFirst2CharsExe28(inputWord))
}

fun messageErrorExe28() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun repeatFirst2CharsExe28(word: String): Boolean {
    val firstTwoChar = word.substring(0..1)
    val lastTwoChars = word.substring(word.length - 2..<word.length)

    return firstTwoChar == lastTwoChars
}