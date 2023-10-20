package exercises

/**
 * Given a String and a Int n, return a String made of n repetitions of the last n characters of the passed string.
 * n will be between 0 and the length of the string, inclusive.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe31()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println("Enter with the index number to repeat of the string:")
    var inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkNumberExe31(inputNumber)) {
        messageErrorCheckNumber()
        inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        checkNumberExe31(inputNumber)
    }

    println(repeatLastTwo(inputWord, inputNumber))

}

fun messageErrorExe31() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun checkNumberExe31(number: Int): Boolean {
    return number > 0
}

fun repeatLastTwo(word: String, index: Int): String {
    val lastTwoChar = word.substring(word.length - index..<word.length)
    var newWord = ""
    for (i in 1..index) {
        newWord += lastTwoChar
    }
    return newWord
}


