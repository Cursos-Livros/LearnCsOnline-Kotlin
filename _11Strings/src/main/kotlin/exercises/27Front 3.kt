package exercises

/**
 * Given a String, we'll say that the front is the first 3 chars of the string.
 * If the string length is less than 3, the front is whatever is there. Return a new String which is 3 copies of the front.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe27()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println(repeatFirst2CharsExe27(inputWord))
}

fun messageErrorExe27() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun repeatFirst2CharsExe27(word: String): String {
    val firstTwoChar = word.substring(0..2)
    var newWord = ""
    for (i in 1..3) {
        newWord += firstTwoChar
    }
    return newWord
}