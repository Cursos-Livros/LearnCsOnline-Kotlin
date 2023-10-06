package practice

/**
 * Write a method arrayIsAllLarger that, given two Int arrays,
 * returns true if all the values in the first array are larger than
 * or equal to all the values in the same position in the second array.
 * If the first array is longer than the second array, or the second array is longer than the first array,
 * then the extra values can be ignored. If either array is empty, return false.
 *
 * For example, given {1, 2, 4} and {0, 1, 7}, you should return false, since 7 is greater than 4.
 * Given {1, 2, 4} and {0, 1} you should return true, since the first two values of the first array
 * are greater than the first two values of the second array. Given {1, 2, 4} and {0, 1, 3, 8}, you should return true,
 * since the first three values of the first array are greater than the first three values of the second array. Given {1, 2} and {1, 2},
 * you should return true, since all values in the two arrays are equal.
 */
fun main() {
    println("Enter with the size of array:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray5(sizeArray)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray5(sizeArray)
    }

    val array1 = IntArray(sizeArray)

    for (i in array1.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array1[i] = inputNumber
    }

    println("Enter with the size of array:")
    var sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray5(sizeArray2)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray2 = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray5(sizeArray2)
    }

    val array2 = IntArray(sizeArray2)

    for (i in array2.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array2[i] = inputNumber
    }

    val arrayMinSize = checkArrayLarger(array1, array2)

    println("Array is all larger: ${arrayLargeValueCompare(array1, array2, arrayMinSize)}")
}

fun correctSizeArray5(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun checkArrayLarger(array1: IntArray, array2: IntArray): Int {
    if (array1.size < array2.size) {
        return array1.size
    }
    return array2.size
}

fun arrayLargeValueCompare(array1: IntArray, array2: IntArray, arrayMinSize: Int): Boolean {
    for (i in 0..< arrayMinSize) {
        if (array1[i] >= array2[i]) {
            return true
        }
    }
    return false
}