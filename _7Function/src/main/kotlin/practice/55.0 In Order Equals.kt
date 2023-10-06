package practice

/**
 * Given three Ints first, second, and third, return true if second is greater than first and third is greater than second.
 * However, if equalsOK is true, equality is allowed, so {5, 5, 5} or {5, 5, 7} would also return true.
 */

fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 3:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0

    println(inOrderEquals(inputNumber1, inputNumber2, inputNumber3))
}

fun inOrderEquals(number1: Int, number2: Int, number3: Int): Boolean {
    if (!isequal(number1, number2, number3)) {
        if (number2 > number1 && number3 > number2) {
            return true
        }
    } else {
        return true
    }
    return false
}

fun isequal(number1: Int, number2: Int, number3: Int): Boolean {
    val number = number1

    if (number2 == number || number3 == number) {
        return true
    } else if (number2 == number3) {
        return true
    }
    return false
}