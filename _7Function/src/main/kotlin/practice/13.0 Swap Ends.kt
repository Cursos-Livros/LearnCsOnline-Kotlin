package practice

/**
 * Given an IntArray of length at least one, swap the first and last elements. Return the modified array.
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
    println("Array Original: ${array.contentToString()}")

    val newarray = swapEnds(array)

    println("Array Swap: ${newarray.contentToString()}")
}

fun swapEnds(array: IntArray): IntArray {
    val valueFirstIndex = array[0]
    val valueLastIndex = array[array.size - 1]

    array[0] = valueLastIndex
    array[array.size - 1] = valueFirstIndex

    return array
}