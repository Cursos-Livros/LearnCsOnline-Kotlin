package exercises

/**
 * Given a String of any length, return a new String where the last 2 characters, if present, are swapped, so "coding" yields "codign".
 */

fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe29()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println(lastTwoCharInverter2CharsExe28(inputWord))
}

fun messageErrorExe29() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun lastTwoCharInverter2CharsExe28(word: String): String {
    val firstPartWord = word.substring(0..word.length - 3)
    val lastTwoChars = word.substring(word.length - 2..<word.length).reversed()
    val newWord = firstPartWord + lastTwoChars
    return newWord
}