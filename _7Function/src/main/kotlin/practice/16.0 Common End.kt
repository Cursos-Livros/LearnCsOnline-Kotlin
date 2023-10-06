package practice

/**
 * Given two IntArrays, return true if they have the same first element or they have the same last element. Both arrays will have length at least one.
 */
fun main() {
    println("Enter the size of the arrays:")
    val inputSizeArrays = readLine()?.toIntOrNull() ?: 0

    val array1 = IntArray(inputSizeArrays)
    for (i in array1.indices) {
        println("Item $i:")
        val inputValueArray = readLine()?.toIntOrNull() ?: 0
        array1[i] = inputValueArray
    }

    println("Array 1 items:")
    println(array1.contentToString())

    val array2 = IntArray(inputSizeArrays)
    for (i in array2.indices) {
        println("Item $i:")
        val inputValueArray = readLine()?.toIntOrNull() ?: 0
        array2[i] = inputValueArray
    }

    println("Array 2 items:")
    println(array2.contentToString())

    val result = commomEnd(array1, array2)

    if (!result) {
        println("Thats not common end.")
    } else {
        println("common end")
    }
}

fun commomEnd(array1: IntArray, array2: IntArray): Boolean {
    val size = array1.size - 1
    if (array1[1] == array2[1] || array1[array1.size - 1] == array2[array1.size - 1]) {
        return true
    }
    return false
}