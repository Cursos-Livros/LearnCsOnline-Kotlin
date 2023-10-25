fun main() {
    println("Enter the word 1:")
    val inputWord = readlnOrNull() ?: "String"

    println("Enter the word 2:")
    val inputWord2 = readlnOrNull() ?: "String"

    val anagram = isAnagram(inputWord, inputWord2)

    println("Is anagram $anagram")
}

fun isAnagram(word: String, word2: String): Boolean {
    if (word.length != word2.length) {
        return false
    }

    for (character in word.toCharArray()) {
        var firstCount = countCharacter(word, character)
        var secondCount = countCharacter(word, character)

        if (firstCount != secondCount) {
            return false
        }
    }
    return true
}

fun countCharacter(word: String, characterComparator: Char): Int {
    var count = 0
    for (character in word.toCharArray()) {
        if (character == characterComparator) {
            count++
        }
    }
    return count
}