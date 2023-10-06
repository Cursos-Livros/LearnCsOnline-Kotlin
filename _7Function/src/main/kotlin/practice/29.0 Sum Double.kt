package practice

/**
 * Given two Int values, return their sum. Unless the two values are the same, then return double their sum.
 */
fun main() {
    println("Enter the number")
    val inputNumber = readlnOrNull()?.toIntOrNull() ?: 1

    println("Enter the number 2")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 1

    val result = sumDouble(inputNumber, inputNumber2)

    println(result)
}

fun sumDouble(inputNumber: Int, inputNumber2: Int): Int {
    if (inputNumber == inputNumber2) {
        return (inputNumber + inputNumber2) * 2
    }
    return inputNumber + inputNumber2
}