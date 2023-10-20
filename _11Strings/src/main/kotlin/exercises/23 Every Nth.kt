package exercises

/**
 * Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string.
 * So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
 *
 *
 * everyNth("Miracle", 2) → "Mrce"
 * everyNth("abcdefg", 2) → "aceg"
 * everyNth("abcdefg", 3) → "adg"
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (inputWord.isEmpty()) {
        messageErrorExe23()
        inputWord = readlnOrNull() ?: "String"
        inputWord.isEmpty()
    }

    println("Enter with the index number to remove of the string:")
    var inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkNumberExe23(inputNumber)) {
        messageErrorCheckNumber()
        inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        checkNumberExe23(inputNumber)
    }

    println(removeCharIndex(inputWord, inputNumber))
}

fun messageErrorExe23() {
    println("The word not can be less or equal than 0!")
    println("Enter the word again!")
}

fun checkNumberExe23(number: Int): Boolean {
    return number > 0
}

// Use another think. Instead to remove, create another word with the chars you need
fun removeCharIndex(word: String, index: Int): String {
    var indexToRemove = 0
    var newWord = ""
    while (indexToRemove < word.length) {
        if (indexToRemove % index == 0) {
            newWord += word[indexToRemove]
        }
        indexToRemove++
    }
    return newWord
}