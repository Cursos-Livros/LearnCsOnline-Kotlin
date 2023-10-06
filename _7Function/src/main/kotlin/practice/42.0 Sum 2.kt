package practice

/**
 * Given an `IntArray, return the sum of the first 2 elements in the array.
 * If the array length is less than 2, just sum up the elements that exist.
 * Return 0 if the array is length 0.
 */

fun main() {
    println("Enter with the size of array:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    val result = sum2(array)

    println("${result} times")
}

fun sum2(array: IntArray): Int {
    var sum: Int = 0

    if (array.size < 2) {
        sum += array[0]
    }else{
        sum += array[0]
        sum += array[1]
    }

    return sum
}