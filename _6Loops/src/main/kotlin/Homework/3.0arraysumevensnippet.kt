package Homework

/**
 * Given an IntArray named array that is already declared and initialized, write a snippet of code (not a method), that prints a line with
 * the sum of the values in array that are even.
 */

fun main() {
    var array = intArrayOf(1, 2, 3, 4, 5)
    var sum = 0

    for (i in 0 until array.size) {
        if (array[i] % 2 == 0) {
            sum += array[i]
        }
    }

    println("Result of sum: $sum")
}