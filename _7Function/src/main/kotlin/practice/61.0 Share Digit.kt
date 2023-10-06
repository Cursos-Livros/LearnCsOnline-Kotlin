package practice

/**
 * Given two ints both in the range 10..99, return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23.
 */

fun main() {
    println("Enter number 1:")
    var inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    testNumberRedLottery(inputNumber1)

    while (!testNumberRedLottery(inputNumber1)) {
        println("Enter number 1 again:")
        inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0
        testNumberRedLottery(inputNumber1)
    }

    println("Enter number 2:")
    var inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    testNumberRedLottery(inputNumber2)

    while (!testNumberRedLottery(inputNumber2)) {
        println("Enter number 1 again:")
        inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0
        testNumberRedLottery(inputNumber2)
    }

    println(shareDigit(inputNumber1, inputNumber2))
}

fun testNumberRedLottery(number1: Int): Boolean {
    return number1 in 10..99
}

fun shareDigit(number1: Int, number2: Int): Boolean {
    val number1LeftDigit: Int = number1 / 10
    val number1RightDigit: Int = number1 % 10
    val number2LeftDigit: Int = number2 / 10
    val number2RightDigit: Int = number2 % 10

    return (number1LeftDigit == number2LeftDigit) || (number1LeftDigit == number2RightDigit) || (number1RightDigit == number2LeftDigit) || (number1RightDigit == number2RightDigit)
}