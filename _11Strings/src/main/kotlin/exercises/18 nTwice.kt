package exercises

/**
 * Given a String and an Int n, return a string made of the first and last n chars from the String. The String length will be at least n.
 * nTwice("Hello", 2) → "Helo"
 * nTwice("Chocolate", 3) → "Choate"
 * nTwice("Chocolate", 1) → "Ce"
 */
fun main() {
    println("Enter with the int number:")
    var inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkNumber(inputNumber)) {
        messageErrorCheckNumber()
        inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        checkNumber(inputNumber)
    }

    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    while (!testNumberSize8(inputWord, inputNumber)) {
        messageError11()
        inputWord = readlnOrNull() ?: "String"
        testNumberSize8(inputWord, inputNumber)
    }

    println(nTwice(inputWord, inputNumber))
}

fun checkNumber(number: Int): Boolean {
    return number > 0
}

fun messageErrorCheckNumber() {
    println("The number not can be less or equal than 0!")
    println("Enter the number again!")
}

fun testNumberSize8(word: String, number: Int): Boolean {
    return word.length >= number
}

fun messageError11() {
    println("The word is empty or has size less than or equal the naumber int!")
    println("Enter the word again!")
}

fun nTwice(word: String, number: Int): String {
    val firstString = word.substring(0..<number)
    val lastString = word.substring(word.length - number..<word.length)
    return "$firstString$lastString"
}