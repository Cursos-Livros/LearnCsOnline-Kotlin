package practice

/**
 * Declare and implement a function called arrayCount. arrayCount takes two arguments: an array of Ints, and a single Int value.
 * It returns a count (as an Int) of the number of times that the passed Int argument appears in the array.
 */
fun main() {
    println("Enter with the size of array:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    val numberTofind = numberToSearch()

    val result = arrayCount(array, numberTofind)

    println("${result} times")
}

fun numberToSearch(): Int {
    println("Enter with numbers to search:")
    return readlnOrNull()?.toIntOrNull() ?: 0
}

fun arrayCount(array: IntArray, number: Int): Int {
    var count = 0

    for (i in array.indices) {
        if (array[i] == number) {
            count++
        }
    }

    return count
}