package practice

/**
 * Given two IntArrays of any length, return how many of the arrays have 1 as their first value.
 */

fun main() {
    println("Enter with the size of array: (1 .. 3)")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray4(sizeArray)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray4(sizeArray)
    }

    val array1 = IntArray(sizeArray)

    for (i in array1.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array1[i] = inputNumber
    }

    println("Enter with the size of array: (1 .. 3)")
    var sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray4(sizeArray2)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray4(sizeArray2)
    }

    val array2 = IntArray(sizeArray2)

    for (i in array2.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array2[i] = inputNumber
    }

    val how = start1(array1, array2)
    println("Have $how arrays with the 1 in first element!")
}

fun correctSizeArray4(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun start1(array1: IntArray, array2: IntArray): Int {
    var count = 0
    if (array1[0] == 1) {
        count++
    }

    if (array2[0] == 1) {
        count++
    }

    return count
}