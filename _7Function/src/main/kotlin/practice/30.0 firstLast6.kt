package practice

/**
 * Given an IntArray, return true if 6 appears as either the first or last element in the array. The array will have length at least 1.
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

    val result = firstLetter6(array)

    println(result)
}

fun firstLetter6(array: IntArray): Boolean {
    if (array[0] == 6 || array[array.size - 1] == 6){
        return true
    }
    return false
}