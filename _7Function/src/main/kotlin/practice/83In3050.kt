package practice

/**
 * Given 2 Int values, return true if they are both in the range 30..40 inclusive, or if they are both in the range 40..50 inclusive.
 */

fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println(thirtyFifty(inputNumber1, inputNumber2))
}

fun thirtyFifty(number1: Int, number2: Int): Boolean {
    if ((number1 >= 30 && number1 <= 40) && (number2 >= 40 && number2 <= 50)) {
        return true
    }
    return false
}