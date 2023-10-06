package practice

/**
 * Given an IntArray, return the number of times that two 6's are next to each other in the array. Also count instances where the second 6 is actually a 7.
 */
fun main() {
    println("Enter with the size of array:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println("Quantity 66: ${array66(array)}")

}

fun array66(array: IntArray): Int {
    var count = 0
    for (i in array.indices) {
        if (i < array.size - 1) {
            if (array[i] == 6 && array[i + 1] == 6) {
                count++
            }
        } else {
            if (array[array.size - 1] == 6 && array[array.size - 2] == 6) {
                count++
            }
        }
    }
    return count
}