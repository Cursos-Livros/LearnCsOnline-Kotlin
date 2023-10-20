package exercises

/**
 * Given a `String``, return a version without the first and last char. So "Hello" yields "ell". The string length will be at least 2.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (!testNumberSize7(inputWord)) {
        messageError10()
        inputWord = readlnOrNull() ?: "String"
        testNumberSize7(inputWord)
    }

    val resultWithoutFirst = removeFirstChar(inputWord)
    val resultWithoutFirstLast = removeLastChar(resultWithoutFirst)

    println( resultWithoutFirstLast)
}

fun testNumberSize7(word: String): Boolean {
    return word.length >= 2
}

fun messageError10() {
    println("The word is empty or has size less than 2!")
    println("Enter the word again!")
}

fun removeFirstChar(word: String): String {
    return word.substring(1)
}

fun removeLastChar(word: String): String {
    return word.substring(0..word.length - 2)
}
