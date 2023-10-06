package practice

/**
 * Given 2 Int values, return true if either of them is in the range 10..20 inclusive.
 */

fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    in10to20(inputNumber1, inputNumber2)
}

fun in10to20(number1: Int, number2: Int): Boolean {
    if (number1 in 1..10 && number2 in 1..10) {
        return true
    }
    return false
}