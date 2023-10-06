package practice

/**
 * Given two IntArray, return a new array length 2 containing, as much as will fit, the elements from the first array followed by the elements from the second array.
 * The arrays may be any length, including 0, but there will always be two or more elements available between them.
 */

fun main() {
    println("Enter with the size of array 1:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
    println("Enter with the size of array 2:")
    val sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1

    val array = IntArray(sizeArray)
    val array2 = IntArray(sizeArray2)

    println("Array 1:")
    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println("Array 2:")
    for (i in array2.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array2[i] = inputNumber
    }

    val result = make2(array, array2)

    println(result.contentToString())
}

fun make2(array: IntArray, array2: IntArray): IntArray {
    val newArray = IntArray(2)

    if (array.isNotEmpty()) {
        newArray[0] = array[0]
        if (array.size > 1) {
            newArray[1] = array[1]
        } else {
            newArray[0] = array2[0]
        }
    } else {
        newArray[0] = array2[0]
        newArray[1] = array2[1]
    }
    return newArray
}