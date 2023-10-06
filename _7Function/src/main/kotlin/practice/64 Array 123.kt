package practice

/**
 * Given an IntArray, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
 */

fun main() {
    println("Enter with the size of array:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println(array123(array))
}

fun array123(array: IntArray): Boolean {
    for (i in array.indices) {
        if (array[i] == 1 && array[i + 1] == 2 && array[i + 2] == 3) {
            return true
        }
    }
    return false
}