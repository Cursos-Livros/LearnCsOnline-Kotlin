package practice

/**
 *  Given 2 Ints, return their sum. However, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20.
 */

fun main() {
    println("Enter with the number 1:")
    val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter with the number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("${sortaSum(inputNumber, inputNumber2)}")
}

fun sortaSum(inputNumber: Int, inputNumber2: Int): Int {
    var sum = inputNumber + inputNumber2

    if (sum in 10..19) {
        sum = 20
        return sum
    }

    return sum
}