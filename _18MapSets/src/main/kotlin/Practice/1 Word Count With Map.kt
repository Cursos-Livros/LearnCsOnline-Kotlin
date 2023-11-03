package Practice

import java.util.Collections

fun main() {
    var word = "Xyz_Chuchu_Chuchu_Xyz_Ferdie_Jose"

    val wordSplited = splitWord(word)
    val wordCount = countWords(wordSplited)
    val wordCount2 = countWords2(wordSplited)
    println(wordCount2)
}

fun splitWord(word: String): List<String> {
    return word.split('_')
}

fun countWords(wordSplited: List<String>): MutableMap<String, Int> {
    val wordCountList = mutableMapOf<String, Int>()

    for (word in wordSplited) {
        var count = wordCountList[word]
        if (count == null) count = 0
        wordCountList[word] = count + 1
    }
    return wordCountList
}

fun countWords2(wordSplited: List<String>): MutableMap<String, Int> {
    val wordCountList = mutableMapOf<String, Int>()

    for(word in wordSplited){
        wordCountList[word] = (wordCountList[word] ?: 0) + 1
    }
    return wordCountList
}
