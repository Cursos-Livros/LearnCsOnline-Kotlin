package practice

/**
 * Given three Int values, return their sum.
 * However, if one of the values is the same as another of the values, it does not count towards the sum.
 */
fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 3:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0

    var result = 0

    if (inputNumber1 == inputNumber2) {
        result = sum4(inputNumber2, inputNumber3)
    } else if (inputNumber2 == inputNumber3) {
        result = sum4(inputNumber1, inputNumber3)
    } else if (inputNumber1 == inputNumber3) {
        result = sum4(inputNumber1, inputNumber2)
    } else {
        result = sum3(inputNumber1, inputNumber2, inputNumber3)
    }

    println(result)
}

fun sum4(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun sum3(number1: Int, number2: Int, number3: Int): Int {
    return number1 + number2 + number3
}