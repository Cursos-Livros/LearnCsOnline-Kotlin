package Practice

/**
 * Given a nullable List of Strings, write a method toSet that converts it to a Set of Strings that contains all the same Strings in the original list.
 * So given a List containing "test", "me", and "test", you would return a Set containing "test" and "me".
 * require that the passed List is not null.
 */

fun main() {
    val setWords = mutableSetOf<String>()
    do {
        println("Enter with all word you need: enter with q to finish")
        val inputWords = readlnOrNull() ?: "0"
        if (inputWords != "q") {
            setWords.add(inputWords)
        }
    } while (inputWords != "q")

    println("Original list:")
    println(setWords)
}