package practice

/**
 * Write a method arrayAllPairs that returns whether a passed IntArray is composed entirely of adjacent pairs of the same value.
 * For example, the array {1, 1, 2, 2} and the array {4, 4, -1, -1} are composed of adjacent pairs of the same element,
 * but {2, 1, 1, 2} and {4, 4, -1, 0} are not. To be composed entirely of pairs of the same element, the array must contain an even number of elements.
 * If the passed array is empty, you should return false.
 *
 * You will need to construct your loop carefully to complete this problem! We suggest that you examine the array looking for a counterexample:
 * meaning a pair of adjacent elements that do not have the same value.
 */
fun main() {
    println("Enter with the size of array:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

   while(!checkSize(sizeArray)) {
        println("Enter with the size of array:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
       checkSize(sizeArray)
    }

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println(allPairs(array))
}

fun checkSize(sizeArray: Int): Boolean {
    return sizeArray % 2 == 0
}

fun allPairs(array: IntArray): Boolean {
    for (i in array.indices) {
        if (i <= array.size - 1) {
            if (array[i] != array[i + 1]) {
                return false
            }
        }
    }
    return true
}