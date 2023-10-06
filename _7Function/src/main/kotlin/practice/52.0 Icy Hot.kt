package practice

/**
 * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
 */

fun main() {
    println("Enter temperature 1:")
    val inputTemperature1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    println("Enter temperature 2:")
    val inputTemperature2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    val result = icyHot(inputTemperature1, inputTemperature2)

    println(result)
}

fun icyHot(inputTemperature1: Double, inputTemperature2: Double): Boolean {
    return inputTemperature1 <= 0 && inputTemperature2 >= 100
}