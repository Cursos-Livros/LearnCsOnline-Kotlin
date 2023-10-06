package practice

/**
 * Given 3 Ints return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
 * So for example, if the second Int is 13, then both it and the third Int do not count.
 */

fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 3:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0

    luckySum(inputNumber1, inputNumber2, inputNumber3)
}

fun luckySum(number1: Int, number2: Int, number3: Int): Int {
    if (number1 == 13) {
        return number3
    }

    if (number2 == 13) {
        return number1
    }

    if (number3 == 13) {
        return number2
    }
    return number1 + number2 + number3
}