package exercises

/**
 * Given 2 Strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (!testNumberSize(inputWord)) {
        messageError5()
        inputWord = readlnOrNull() ?: "String"
        testNumberSize(inputWord)
    }

    println("Enter with the word 2:")
    var inputWord2 = readlnOrNull() ?: "String"

    while (!testNumberSize(inputWord2)) {
        messageError5()
        inputWord2 = readlnOrNull() ?: "String"
        testNumberSize(inputWord2)
    }

    val result1 = removeFirtChar(inputWord)
    val result2 = removeFirtChar(inputWord2)

    println("Concatenad string:" + result1 + result2)

}

fun testNumberSize(word: String): Boolean {
    return word.length > 1
}

fun messageError5() {
    println("The word is empty!")
    println("Enter with the word again")
}

fun removeFirtChar(word: String): String {
    return word.substring(1)
}

