package exercises

/**
 * Given two non-null Strings, return a string of the form shorter + longer + shorter,
 * with the shorter string on the outside and the longer string on the inside.
 * If the two Strings are the same length, put the first String in the inside.
 */
fun main() {
    println("Enter with the word 1:")
    var inputWord = readlnOrNull() ?: "String"

    while (!wordSize19(inputWord)) {
        messageErrorExe19()
        inputWord = readlnOrNull() ?: "String"
        wordSize19(inputWord)
    }

    println("Enter with the word 2:")
    var inputWord2 = readlnOrNull() ?: "String"

    while (!wordSize19(inputWord2)) {
        messageErrorExe19()
        inputWord2 = readlnOrNull() ?: "String"
        wordSize19(inputWord2)
    }

    if (inputWord.length >= inputWord2.length) {
        println(comboString(inputWord, inputWord2))
    } else {
        println(comboString(inputWord2, inputWord))
    }
}

fun wordSize19(word: String): Boolean {
    return word.isNotEmpty()
}

fun messageErrorExe19() {
    println("The number not can be less or equal than 0!")
    println("Enter the number again!")
}

fun comboString(word1: String, word2: String): String {
    val firstTag = firstTagExe19(word2)
    val secondTag = secondTagExe19(word2)
    return "$firstTag$word1$secondTag"
}

fun firstTagExe19(word: String): String {
    return word
}

fun secondTagExe19(word: String): String {
    return word
}

