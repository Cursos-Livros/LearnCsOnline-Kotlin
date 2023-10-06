package practice

/**
 * Given an IntArray of any length, return a new array of its first 2 elements.
 * If the array is smaller than length 2, use whatever elements are present.
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

    val result = frontPiece(array)

    println(result.contentToString())
}

fun frontPiece(array: IntArray): IntArray {
    val newArray = IntArray(2)
    for (i in 0..1) {
        newArray[i] = array[i]
    }

    return newArray
}