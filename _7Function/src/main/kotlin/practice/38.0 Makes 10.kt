package practice

/**
 * Given 2 Ints, return true if one if them is 10 or if their sum is 10.
 */

fun main() {
    println("Enter number 1:")
    val number = readlnOrNull()?.toIntOrNull() ?: 1

    println("Enter number 1:")
    val number2 = readlnOrNull()?.toIntOrNull() ?: 1

    println("${makes10(number, number2)}")
}

fun makes10(number: Int, number2: Int): Boolean {
    return (number == 10 || number2 == 10) || (number + number2 == 10)
}