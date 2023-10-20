package exercises

/**
 * Let's get some more practice working with Strings: an incredibly useful data type for working with text.
 *
 * Write a function called reverse. It should accept a single String argument and return that String, reversed!
 * There are several ways to approach this problem—have fun!
 * And maybe take a good look at the documentation before you write too much code...
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    println(reverseString(inputWord))
}

fun reverseString(word: String): String {
    return word.reversed()
}