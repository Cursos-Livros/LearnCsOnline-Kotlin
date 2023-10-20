package exercises

/**
 * Given 2 non-negative Ints, return their sum, so long as the sum has the same number of digits as the first int.
 * If the sum has more digits, just return the value of first Int.
 * You may want to convert the Int values to Strings to determine their length.
 */
fun main() {
    println("Enter with non negative number:")
    var inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter with 2 non negative number:")
    var inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    if (!nonNegativeTest(inputNumber) || !nonNegativeTest(inputNumber2)) {
        inputIsNegativeError()
    }

    val sumSameDigits = testSize(inputNumber, inputNumber2)
    val testLessDigits = lessDigits(inputNumber, inputNumber2)
    if (sumSameDigits) {
        println(sum(inputNumber, inputNumber2))
    } else if (testLessDigits) {
        println(inputNumber)
    }
}

fun nonNegativeTest(number: Int): Boolean {
    return number > 0
}

fun inputIsNegativeError() {
    println("One of the number is negative!")
}

fun testSize(number: Int, number2: Int): Boolean {
    val number1Size = number.toString().length
    val numberSum = sum(number, number2).toString().length

    return numberSum == number1Size
}

fun lessDigits(number: Int, number2: Int): Boolean {
    val number1Size = number.toString().length
    val numberSum = sum(number, number2).toString().length

    return numberSum > number1Size
}

fun sum(number: Int, number2: Int): Int {
    return number + number2
}
