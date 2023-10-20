package exercises

/**
 * Given a string, return true if the string starts with "hi" and false otherwise.
 */
fun main() {
    println("Enter with the wrd:")
    var inputWord = readlnOrNull() ?: "String"

    while (!testNumberSize5(inputWord)) {
        messageError8()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    val result = startHi(inputWord)

    println(result)
}

fun testNumberSize5(word: String): Boolean {
    return word.length >= 2
}

fun messageError8() {
    println("The word is empty!")
    println("Enter the word again!")
}

fun startHi(word: String): Boolean {
    return word.startsWith("Hi")
}
