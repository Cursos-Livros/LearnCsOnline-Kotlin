package practice

/**
 * Given an IntArray of length three, return a new array with the elements in the reverse order.
 */

fun main() {
    println("Enter the length of array")
    val inputLengthArray = readLine()?.toIntOrNull() ?: 0

    val array1 = IntArray(inputLengthArray)

    for (i in array1.indices) {
        val inputArrayValue = readLine()?.toIntOrNull() ?: 0
        array1[i] = inputArrayValue
    }

    val newArray = reverseThree(array1)
    println(newArray.contentToString())
}

fun reverseThree(array1: IntArray): IntArray {
    val newArray = IntArray(array1.size)
    var count = array1.size - 1

    var index = 0
    while (count >= 0) {
        newArray[count] = array1[index]
        index++
        count--
    }
    return newArray
}