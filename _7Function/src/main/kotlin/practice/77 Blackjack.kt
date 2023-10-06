package practice

/**
 * Given 2 Ints greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both go over.
 */

fun main() {
    println("Enter number 1:")
    var inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkNumber(inputNumber1)) {
        println("The number is less or equal than 0!")
        println("Enter with the number again")
        inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0
        checkNumber(inputNumber1)
    }

    println("Enter number 2:")
    var inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkNumber(inputNumber2)) {
        println("The number is less or equal than 0!")
        println("Enter with the number again")
        inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0
        checkNumber(inputNumber2)
    }

    var result = 0

    if (!testBigger21(inputNumber1, inputNumber2)) {
        result = blackJack(inputNumber1, inputNumber2)
    }

    println("The value nearest to 21 without going over is: $result")
}

fun checkNumber(number: Int): Boolean {
    return number > 0
}

fun testBigger21(number1: Int, number2: Int): Boolean {
    if (number1 > 21 && number2 > 21) {
        return true
    }
    return false
}

fun blackJack(number1: Int, number2: Int): Int {
    val differenceNumber1 = 21 - number1
    val differenceNumber2 = 21 - number2

    return if (differenceNumber1 < differenceNumber2) number1 else number2
}