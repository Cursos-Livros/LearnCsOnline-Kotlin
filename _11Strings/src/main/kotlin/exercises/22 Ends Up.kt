package exercises

import java.util.*

/**
 * Given a String, return a new String where the last 3 chars are now in upper case.
 * If the string has less than 3 chars, uppercase whatever is there.
 * Note that str.toUpperCase() returns the uppercase version of a string.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe22()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    val stringLess3 = inputWord.length <= 3

    if (!stringLess3) {
        val firstChars = stringWithoutLast3char(inputWord)
        val last3Char = upperCase3LastChar(inputWord)
        println("$firstChars$last3Char")
    } else {
        println(inputWord)
    }
}

fun messageErrorExe22() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun stringWithoutLast3char(word: String): String {
    val lastIndexOfChar = word.length - 1
    val newWord = word.substring(0..lastIndexOfChar - 3)
    return newWord
}

fun upperCase3LastChar(word: String): String {
    return word.takeLast(3).uppercase(Locale.getDefault())
}



