package practice

/**
 * Given an IntArray of length 3, return an array with the elements rotated left by one. So {1, 2, 3} yields {2, 3, 1}.
 */

fun main() {
    println("Enter the size of array:")
    val inputSize = readLine()?.toIntOrNull() ?: 0

    val array1 = IntArray(inputSize)

    for (i in array1.indices) {
        println("Enter the number $i:")
        val arrayiItem = readLine()?.toIntOrNull() ?: 0
        array1[i] = arrayiItem
    }

    val newarray = RotateLeft(array1)

    println(newarray.contentToString())
}

fun RotateLeft(array1: IntArray): IntArray {
    val newArray = IntArray(array1.size)

    for (i in newArray.indices) {
        val newIndex = (i + array1.size - 1) % array1.size
        newArray[newIndex] = array1[i]
    }
    return newArray
}