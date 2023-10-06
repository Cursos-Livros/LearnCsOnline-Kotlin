package practice

/**
 * Given an IntArray, return true if the array is length 1 or more and the first element and the last element are equal.
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

    val result = sameFirstLetter(array)

    println(result)
}

fun sameFirstLetter(array: IntArray): Boolean {
    return array.size > 1 && array[0] == array[array.size - 1]
}