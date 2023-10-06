package practice

/**
 * Given an IntArray, return a new IntArray with double the length with a last element with the same value as the last element of the original array and all other values 0.
 * The original array will be length 1 or more.
 */
fun main() {
    println("Enter with the range")
    val inputRange = readLine() ?: ""

    val array: IntArray = IntArray(inputRange.toInt())

    for (i in array.indices) {
        println("Enter the number ${i + 1} to the array")
        val inputItemArray = readLine() ?: ""
        array[i] = inputItemArray.toInt()
    }

    val newArray = doubleLengthArray(array)

    println(newArray.contentToString())
}

fun doubleLengthArray(array: IntArray): IntArray {
    val newArray = IntArray(array.size * 2)

    for (i in newArray.indices) {
        val lastIndice = newArray.size - 1
        if (i == lastIndice) {
            newArray[i] = array[array.size - 1]
        }
    }
    return newArray
}