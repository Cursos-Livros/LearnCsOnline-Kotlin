package exercises

/**
 * Given a String, return a new String made of 3 copies of the first 2 chars of the passed String.
 * The String may be any length. If there are fewer than 2 chars, use whatever is there.
 */

fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe24()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println(repeatFirst2Chars(inputWord))
}

fun messageErrorExe24() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun repeatFirst2Chars(word: String): String {
    val firstTwoChar = word.substring(0..1)
    var newWord = ""
    for (i in 1..3) {
        newWord += firstTwoChar
    }
    return newWord
}