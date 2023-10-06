package practice

/**
 * Given an `IntArray, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
 */

fun main() {
    println("Enter with the size of array: (1 .. 3)")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray2(sizeArray)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray2(sizeArray)
    }

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println(double23(array))
}

fun correctSizeArray2(sizeArray: Int): Boolean {
    return sizeArray == 1 || sizeArray == 2 || sizeArray == 3
}

fun double23(array: IntArray): Boolean {
    var count2 = 0
    var count3 = 0

    for (i in array.indices) {
        if (array[i] == 2) {
            count2++
        } else if (array[i] == 3) {
            count3++
        }
    }
    return count2 == 2 || count3 == 3
}