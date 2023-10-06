package practice

/**
 * Given two IntArrays of size 2, return a new array of size four containing the elements from the first array followed by the elements from the second array. So {1, 2}
 * and {3, 4} would yield {1, 2, 3, 4}.
 */

fun main() {
    println("Enter the number of first array:")
    val input = readLine() ?: ""
    val array1 = IntArray(input.toInt())

    println("Enter the number of second array:")
    val input2 = readLine() ?: ""
    val array2 = IntArray(input2.toInt())

    val sum2Arrays = array1.size + array2.size

    val newArray = plusTwo(array1, array2, sum2Arrays)

    println(newArray.contentToString())
}

fun plusTwo(array1: IntArray, array2: IntArray, sum2Array: Int): IntArray {
    val newArray = IntArray(array1.size + array2.size)

    for (i in newArray.indices) {
        if (i < array1.size) {
            newArray[i] = array1[i]
        } else {
            newArray[i] = array2[i - array1.size] // if array2 use i like reference the array will initiate on the position 3 of array
        }
    }
    return newArray
}
