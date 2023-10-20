package exercises

/**
 * Given a String and an Int n, return a string made of the first n characters of the passed string, followed by the first n - 1 characters, and so on.
 * So the String "Chocolate" with n = 4 yields "ChocChoChC". You may assume that n is between 0 and the length of the string, inclusive.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe32()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println("Enter with the index number to repeat of the string:")
    var inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkNumberExe32(inputNumber, inputWord)) {
        messageErrorCheckNumber()
        inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        checkNumberExe32(inputNumber, inputWord)
    }

    println(removeLastCharOnyByOne(inputWord, inputNumber))
}

fun messageErrorExe32() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun checkNumberExe32(number: Int, word: String): Boolean {
    return number > 0 && number <= word.length
}

fun removeLastCharOnyByOne(word: String, index: Int): String {
    val firstChars = word.substring(0..<index)
    var newWord = ""
    for (indexWord in index - 1 downTo 0) {
        newWord += word.substring(0..indexWord)
    }
    return newWord
}
