package practice

/**
 * Given two IntArrays of any length, return a new array with the first element of each array, If either array is length 0, ignore that array.
 * If both arrays are non-empty, return the first element of the first array first.
 */

fun main() {
    println("Enter with the size of array: (1 .. 3)")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray3(sizeArray)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray3(sizeArray)
    }

    val array1 = IntArray(sizeArray)

    for (i in array1.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array1[i] = inputNumber
    }

    println("Enter with the size of array: (1 .. 3)")
    var sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray3(sizeArray2)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray3(sizeArray2)
    }

    val array2 = IntArray(sizeArray2)

    for (i in array2.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array2[i] = inputNumber
    }

    val newArray = front11(array1, array2)
    println(newArray.contentToString())
}

fun correctSizeArray3(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun front11(array1: IntArray, array2: IntArray): IntArray {
    val arraySize = array1.size
    val arraySize2 = array2.size
    val newArray = IntArray(2)

    if (arraySize == 0) {
        newArray[1] = array2[0]
        return newArray
    } else if (arraySize2 == 0) {
        newArray[0] = array1[0]
        return newArray
    } else {
        newArray[0] = array1[0]
        newArray[1] = array2[0]
    }

    return newArray
}