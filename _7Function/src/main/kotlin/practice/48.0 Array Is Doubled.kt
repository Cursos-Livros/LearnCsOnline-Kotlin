package practice

/**
 * Write a method called arrayIsDoubled that takes two non-empty Int arrays (IntArray) and returns true if they are the same
 * length and if every element of the second array is equal to the element of the first array in the same position, doubled.
 *
 * So given {1, 2, 4} and {2, 4, 8}, you would return true, but given {1, 2, 4} and {2, 4} or {1, 2, 4} and {2, 4, 8, 10} you would return false.
 *
 * We suggest you approach this problem by looking for a counterexample. First, examine the lengths of the two arrays. If they are different,
 * you can return immediately! Otherwise, loop through each element of the array looking for one that is incorrect.
 * As soon as you find one, you can return. And, once the loop concludes, you can also draw a conclusion.
 */

fun main() {
    println("Enter with the size of array 1:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
    println("Enter with the size of array 2:")
    val sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1

    val array = IntArray(sizeArray)
    val array2 = IntArray(sizeArray2)

    println("Array 1:")
    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println("Array 2:")
    for (i in array2.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array2[i] = inputNumber
    }

    val result = arrayDoubled(array, array2)

    println(result)
}

fun arrayDoubled(array: IntArray, array2: IntArray): Boolean {
    if (array.size != array2.size) {
        return false
    }

    for (i in array.indices) {
        if (array2[i] != (array[i] * 2)) {
            return false
        }
    }

    return true
}