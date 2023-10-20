package exercises

/**
 * Given a non-empty string like "Code" return a string like "CCoCodCode".
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    println(removeLastCharOnyByOne(inputWord))
}

fun removeLastCharOnyByOne(word: String): String {
    val firstChar = word.first()
    var newWord = ""
    for (indexWord in word.indices) {
        newWord += word.substring(0..indexWord)
    }
    return newWord
}


