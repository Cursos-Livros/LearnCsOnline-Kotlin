package exercises

/**
 * Given a non-empty String and an Int, return a new String where the character at that index has been removed.
 * The Int value passed will be a valid index in the original string.
 */
fun main() {
    println("Enter with the word:")
    var inputString = readlnOrNull() ?: "String"

    println("Enter with number index, its not permitted a number more then word:")
    var inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    while (!testNumberSize(inputString, inputNumber)) {
        messageError3()
        inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        testNumberSize(inputString, inputNumber)
    }

    println(removeChar(inputString, inputNumber))
}

fun testNumberSize(word: String, number: Int): Boolean {
    return number > 0 && number <= word.length
}

fun messageError3() {
    println("Wrong word!")
    println("Enter with size 3 string or the size need be odd, like man.")
}

fun removeChar(word: String, number: Int): String {
    return word.removeRange(number, number + 1)
}