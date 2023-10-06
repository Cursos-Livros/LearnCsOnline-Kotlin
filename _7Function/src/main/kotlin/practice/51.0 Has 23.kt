package practice

/**
 * Given an IntArray of length two, return true if it contains a 2 or a 3.
 */

fun main() {
    val array = IntArray(2)

    println("Array 1:")
    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    val result = has23(array)

    println(result)
}

fun has23(array: IntArray): Boolean {
    for (i in array.indices) {
        if (array[i] == 1 || array[i] == 1) {
            return true
        }
    }
    return false
}