package exercises

/**
 * Given a String, return a new String where every character in the original input is doubled. So "The" yields "TThhee".
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (!wordSize21(inputWord) || inputWord.isEmpty()) {
        messageErrorExe21()
        inputWord = readlnOrNull() ?: "String"
        wordSize21(inputWord)
    }

    val newString = doubleChar(inputWord)

    println(newString)
}

fun wordSize21(word: String): Boolean {
    return word.isNotEmpty()
}

fun messageErrorExe21() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun doubleChar(word: String): String {
    var index = 0
    var newWord = ""
    while (index < word.length) { //if the index on the string start in 0, need stop when is last-1
        newWord += word[index].toString() + word[index].toString()
        index++
    }
    return newWord
}