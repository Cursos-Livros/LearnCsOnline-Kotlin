package exercises

/**
 * Given a String return the String made of its first two chars. So the String "Hello" yields "He".
 * If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "".
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe25()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println(repeatFirst2CharsExe25(inputWord))
}

fun messageErrorExe25() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun repeatFirst2CharsExe25(word: String): String {
    val firstTwoChar = word.substring(0..1)
    return firstTwoChar
}