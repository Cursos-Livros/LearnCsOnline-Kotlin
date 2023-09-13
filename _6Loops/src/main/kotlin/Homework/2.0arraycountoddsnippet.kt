package Homework

/**
 * Given an IntArray named array that is previously declared and initialized, write a snippet of code (not a method),
 * that prints a line with the count of the number of values in array that are odd.
 */

fun main() {
    var array = intArrayOf(1, 2, 3, 4, 5)
    var count = 0
    for (i in array.indices) {
        if (array[i] % 2 != 0) {
            println(array[i])
            count++
        }
    }

    println("Quantity of odd numbers $count")
}