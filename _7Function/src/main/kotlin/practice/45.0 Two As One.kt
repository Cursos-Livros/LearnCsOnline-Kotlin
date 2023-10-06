package practice

/**
 * Given three Ints return true if it is possible to add two of the them to equal the third.
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

    println("${twoAsOne(number1, number2, number3)}")
}

fun twoAsOne(number1: Int, number2: Int, number3: Int): Boolean {
    return ((number1 + number2) == number3)
}