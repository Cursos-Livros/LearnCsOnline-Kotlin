package practice

/**
 * Given 2 Ints, return their sum. However, values in the range 13..19 inclusive are extra lucky. So if either Int is a teen, just return 19.
 */

fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    var result = sum(inputNumber1, inputNumber2)

    if (result in 13..19) {
        result = isTeen()
    }

    println(result)
}

fun sum(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun isTeen(): Int {
    return 19
}


