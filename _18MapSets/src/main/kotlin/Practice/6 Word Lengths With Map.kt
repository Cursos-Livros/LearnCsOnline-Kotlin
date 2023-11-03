package Practice

/**
 * Given a String?
 * containing words separated by the " " (space) character, write a method wordLengths that return a Map<String, Int>
 * mapping each word that is contained in the String to its length. require that the passed String? is not null.
 *
 * So, for example, given the String "Wow that is amazing", you would return a map with four mappings:
 * "Wow" to 3, "that" to 4, "is" to 2, and "amazing" to 7.
 *
 * Note that you should not need any import statements, since Lists are built-in to Kotlin and always available.
 */
fun main() {
    println("Enter with a space word:")
    val inputWord = readlnOrNull() ?: "string"

    val wordSeparatedList = separatedWords(inputWord)

    println("List of words separated:")
    println(wordSeparatedList)

    println("Word and Length Map:")
    val wordLength = wordLengths(wordSeparatedList)
    println(wordLength)
}

fun separatedWords(words: String): MutableList<String> {
    val wordList = mutableListOf<String>()
    for (word in words.split(' ')) {
        wordList.add(word)
    }
    return wordList
}

fun wordLengths(wordSeparatedList: List<String>): MutableMap<String, Int> {
    val map = mutableMapOf<String, Int>()
    for (word in wordSeparatedList) {
        map[word] = word.length
    }
    return map
}