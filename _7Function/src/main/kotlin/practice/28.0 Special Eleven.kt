package practice

/**
 * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11. Return true if the
 * given non-negative Int is special.
 */
fun main() {
    println("Enter the number")
    val inputNumber = readlnOrNull()?.toIntOrNull() ?: 1

    val result = specialEleven(inputNumber)
    println(result)
}

fun specialEleven(number: Int): Boolean {
    return number % 11 == 0 || number > 11
}