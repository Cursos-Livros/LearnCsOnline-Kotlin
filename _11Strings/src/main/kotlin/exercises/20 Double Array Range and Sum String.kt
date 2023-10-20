package exercises

import kotlin.math.pow
import kotlin.math.round
import kotlin.math.roundToInt

/**
 * Let's compute a few summary statistics on a dataset. Create a method named summarizeValues that accepts a non-empty DoubleArray.
 *
 * Compute the mean and the range of the dataset and return a String in the following format:
 *
 * Mean: <mean>
 * Range: <range>
 * Where <mean> and <range> are the mean and range of the dataset computed by your method.
 *
 * Round the values to 2 decimal points using a method round which accepts a Double value. For example, round(3.33542) would return 3.34.
 *
 * Given the array {1.0, 2.0, 4.0}, your method should return:
 *
 * Mean: 2.33
 * Range: 3.0
 * (Note that Kotlin's multi-line string literal will not work correctly for this problem, so you'll need to insert the newline manually.)
 */
fun main() {
    println("Enter with the size of the array:")
    var inputArraySize = readlnOrNull()?.toIntOrNull() ?: 1


    while (!checkArraySize(inputArraySize)) {
        messageErrorArraySize()
        inputArraySize = readlnOrNull()?.toIntOrNull() ?: 1
        checkArraySize(inputArraySize)
    }

    val array = DoubleArray(inputArraySize)

    for (i in array.indices) {
        println("Enter with the number ${i + 1}:")
        val inputNumber = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        array[i] = inputNumber
    }

    val summarizeValues = doubleArrayRange(array)

    println(summarizeValues)
}

fun checkArraySize(arraySize: Int): Boolean {
    return arraySize > 0
}

fun messageErrorArraySize() {
    println("The array size is less or equal one")
    println("Please enter with the permitted value.")
}

fun doubleArrayRange(array: DoubleArray): String {
    var mean = (calculateMean(array) * 100).roundToInt()
    val range = calculateRange(array)

    return "Mean: $mean \nRange: $range"
}

fun calculateMean(array: DoubleArray): Double {
    var sum = 0.0
    for (values in array) {
        sum += round(values)
    }
    return sum / array.size
}

fun calculateRange(array: DoubleArray): Int {
    return array.size
}