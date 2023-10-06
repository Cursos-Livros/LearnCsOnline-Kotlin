package practice

/**
 * Given an IntArray array of length 3, figure out which is larger, the first or last element in the array, and set all other elements to that value. Return the changed array.
 */

fun main() {
    println("Enter the size of the array:")
    val inputSizeArray = readLine()?.toIntOrNull() ?: 0

    val array = IntArray(inputSizeArray)

    for (i in array.indices) {
        println("Item $i:")
        val inputValueArray = readLine()?.toIntOrNull() ?: 0
        array[i] = inputValueArray
    }

    val newArray = maxEnd(array)

    println(newArray.contentToString())
}

fun maxEnd(array: IntArray): IntArray {
    val newArray = IntArray(array.size)
    val firstIndex = array[1]
    val lastIndex = array[array.size-1]

    if (firstIndex > lastIndex) {
        for (i in newArray.indices) {
            newArray[i] = firstIndex
        }
    } else {
        for (i in newArray.indices) {
            newArray[i] = lastIndex
        }
    }
    return newArray
}