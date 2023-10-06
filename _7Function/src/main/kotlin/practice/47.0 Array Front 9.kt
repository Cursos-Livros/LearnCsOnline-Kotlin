package practice

/**
 * Given an IntArray, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.
 */

fun main() {
    println("Enter with the size of array: (Please less than 4")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    correctSize(sizeArray)

    while (!correctSize(sizeArray)) {
        println("Enter with the size of array: (Please less than 4")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSize(sizeArray)
    }

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    val result = arrayFront(array)

    println(result)
}

fun correctSize(sizeArray: Int): Boolean {
    return sizeArray <= 4
}

fun arrayFront(array: IntArray): Boolean {
    var count = 0
    for (i in 0..1) {
        if (array[i] == 9) {
            count++
        }
    }
    return count > 0
}