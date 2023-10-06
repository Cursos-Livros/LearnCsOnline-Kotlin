package practice

/**
 * For this homework you'll write a simple function, a reusable piece of code that allows us to build more complex computer programs.
 *
 * We're going to start simple. Declare and implement a function called addOne. Your function should accept a single Int argument and
 * return the result of adding one to its argument.
 */
fun main() {
    println("Enter a number:")
    val input = readLine() ?: ""
    println("${add(input.toInt())}")
}

fun add(number: Int): Int {
    return number + 1
}