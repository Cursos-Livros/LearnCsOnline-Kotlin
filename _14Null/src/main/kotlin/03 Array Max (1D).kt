/**
 * Declare and implement a function called arrayMax.
 * It should accept a nullable DoubleArray as its single argument,
 * and return the maximum value stored in the array.
 * If the array is empty or null, you should return 0.0.
 */
fun main() {
    println("Enter with the size of the array:")
    val inputSizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    if (!correctSize(inputSizeArray)) {
        println("The most be great than 0!")
    }

    val array = IntArray(inputSizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    val maxValue = findMaxValue(array)

    println(maxValue)
}

fun correctSize(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun findMaxValue(array: IntArray): Any {
    val arrayEmpty = arrayEmpty(array)
    val arrayNull = arrayNull(array)

    if (arrayEmpty || arrayNull) {
        return 0.0
    }

    var max = array[0]
    for (index in array.indices) {
        if (array[index] > max) {
            max = array[index]
        }
    }

    return max
}

fun arrayEmpty(array: IntArray): Boolean {
    return array.isEmpty()
}

fun arrayNull(array: IntArray): Boolean {
    for (index in array.indices) {
        if (array[index] == null) {
            return true
        }
    }
    return false
}