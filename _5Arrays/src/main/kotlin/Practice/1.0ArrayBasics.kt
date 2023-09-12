package Practice

/**
 * Let's get some practice with basic array usage. Below, you have two tasks. First, declare an array of Ints named numbers and initialize it to contain the values 0, 8, 9, 4, and
 * 5, in that order. Second, given an existing array of Doubles named values, print its first value and also change its third value to 1.25.
 */
fun main() {
    val array = IntArray(5)
    val array2 = doubleArrayOf(1.0, 1.20, 1.22, 1.27)
    array2[3] = 1.25
    println(array2[3])
}