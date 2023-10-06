package practice

/**
 * Given three Ints first, second, and third, return true if second is greater than first and third is greater than second.
 * However, if secondOK is true, second does not need to be greater than first.
 */

fun main() {
    println("Enter with the number 1:")
    val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter with the number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter with the number 3:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0

    println(secondOK(inputNumber, inputNumber2, inputNumber3))
}

fun secondOK(inputNumber: Int, inputNumber2: Int, inputNumber3: Int): Boolean {
    if (inputNumber2 > inputNumber && inputNumber3 > inputNumber2) {
        return true
    }
    return false
}