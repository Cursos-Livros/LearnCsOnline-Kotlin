package practice

/**
 * Return true if the given non-negative number is a multiple of 3 or a multiple of 5.
 */
fun main() {
    println("Enter with the number:")
    val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
    val result  = or35(inputNumber)
    println(result)
}

fun or35(number: Int): Boolean {
    return number % 3 == 0 || number % 5 == 0
}