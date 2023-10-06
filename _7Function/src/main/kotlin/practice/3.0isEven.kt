package practice

/**
 * Let's write another simple function. Declare and implement a function called isEven. isEven should accept a single Int argument and return true if it is even and false otherwise.
 * You will probably want to consider using the remainder operator (%) to complete this problem.
 */
fun main() {
    println("Enter with the number:")
    val input = readLine() ?: ""
    println("${isOdd(input.toInt())}")
}

fun isOdd(number: Int): Boolean {
    val result = number % 2 != 0
    return result
}