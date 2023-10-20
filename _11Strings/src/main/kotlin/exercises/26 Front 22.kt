package exercises

/**
 * Given a String, take the first 2 chars and return the String with the 2 chars added at both the front and back,
 * so "kitten" yields "kikittenki".
 * If the String length is less than 2, use whatever chars are there.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe26()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println(repeatFirst2CharsExe26(inputWord))
}

fun messageErrorExe26() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun repeatFirst2CharsExe26(word: String): String {
    val first2Chars = get2Chars(word)
    return "$first2Chars$word$first2Chars"
}

fun get2Chars(word: String): String {
    return word.substring(0..1)
}