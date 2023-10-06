package practice

/**
 * Given an IntArray of length two, return true if it does not contain a 2 or a 3.
 */
fun main() {
    val array = IntArray(2)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println(no23(array))
}

fun no23(array: IntArray): Boolean {
    for (i in array.indices) {
        if (array[i] == 3 || array[i] == 2) {
            return true
        }
    }
    return false
}