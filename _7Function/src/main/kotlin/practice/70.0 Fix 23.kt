package practice

/**
 *  Given an IntArray with length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 */

fun main() {
    val array = IntArray(3)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println(fix23(array).contentToString())
}

fun fix23(array: IntArray): IntArray {
    for (i in array.indices) {
        if (array[i] == 2 && array[i + 1] == 3) {
            array[i + 1] = 0
        }
    }
    return array
}
