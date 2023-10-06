package practice

/**
 * Given a non-null IntArray with odd length of at least one, look at the first, last, and middle values in the array and return the largest.
 */

fun main() {
    println("Enter with the size of array:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1


    if (sizeArray > 0) {
        val oddTest = oddTest(sizeArray)
        if (oddTest) {
            val array = IntArray(sizeArray)

            for (i in array.indices) {
                println("Enter with the number:")
                val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
                array[i] = inputNumber
            }

            println("${maxTriple(array)}")
        } else {
            println("The number is even")
        }
    } else {
        println("the number is 0 or less!")
    }
}

fun oddTest(sizeArray: Int): Boolean {
    if (sizeArray % 2 == 1) {
        return true
    }
    return false
}

fun maxTriple(array: IntArray): Int {
    var max = array[0]
    if (array.size == 1) {
        return array[0]
    } else {
        if (array[(array.size - 1) / 2] > max) {
            max = array[(array.size - 1) / 2]
        }
        if (array[array.size - 1] > max) {
            max = array[array.size - 1]
        }
    }
    return max
}