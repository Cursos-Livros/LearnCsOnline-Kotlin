package practice

/**
 * Let's practice with function overloading. Write two versions of a function called multiply. The first should take two Double arguments and return their product (as a Double).
 * The second should take three Double arguments and return their product (as a Double).
 */
fun main() {
    println("Enter with 2 numbers:")
    val inputNumber = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val inputNumber2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("Enter with 3 numbers:")
    val inputNumber3 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val inputNumber4 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val inputNumber5 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println(multiply(inputNumber, inputNumber2))
    println(multiply(inputNumber3, inputNumber4, inputNumber5))
}

fun multiply(number: Double, number2: Double): Double {
    return number * number2
}

fun multiply(number3: Double, number4: Double, number5: Double): Double {
    return number3 * number4 * number5
}
