package practice

/**
 * Given an IntArray of size 3, return the sum of the elements
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
    val resultSum = sumArray(array)

    println(resultSum)
}

fun sumArray(array: IntArray): Int {
    var resultSum = 0
    for (i in array.indices) {
        resultSum += array[i]
    }
    return resultSum
}
