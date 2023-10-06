package practice

/**
 * Given three non-negative Ints return true at least two of them have the same last digit.
 */

fun main() {
    println("Enter with the number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0
    val number1 = inputNumber1

    println("Enter with the number:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0
    val number2 = inputNumber2

    println("Enter with the number:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0
    val number3 = inputNumber3

    println("${threeLastDigits(number1, number2, number3)}")
}

fun threeLastDigits(number1: Int, number2: Int, number3: Int): Boolean {
    val number1 = number1 % 1000
    val number2 = number2 % 1000
    val number3 = number3 % 1000

    return number1 == number2 && number1 == number3
}