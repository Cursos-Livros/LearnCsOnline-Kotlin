package exercises

/**
 * Given a String, return a new String made of every other char starting with the first, so "Hello" yields "Helo".
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    println(jumpOneInOne(inputWord))
}

fun jumpOneInOne(word: String): String {
    var newWord = ""
    for (i in word.indices step 2) {
        newWord += word[i]
    }
    return newWord
}