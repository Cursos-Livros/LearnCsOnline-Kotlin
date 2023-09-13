package Homework

/**
 * Let's write a simple loop. Assuming an Int variable named count has been declared and initialized to a value larger than zero,
 * write a loop that prints the numbers between 0 and count - 1, inclusive, one number each line. So if count is 4, you should print:
 *
 * 0
 * 1
 * 2
 * 3
 * You can use any kind of loop you want! But do not modify count.
 */
fun main() {
    println("Enter with the limit of range repetition:")
    val input = readLine() ?: ""
    var count: Int = input.toInt() - 1

    for (i in 1..count) {
        println(i)
    }
}