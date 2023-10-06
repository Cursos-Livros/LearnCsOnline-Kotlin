package practice

/**
 * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
 * Given 3 int values, return true if 1 or more of them are teen.
 */
fun main() {
    println("Enter number 1:")
    val inputAge1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputAge2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 3:")
    val inputAge3 = readlnOrNull()?.toIntOrNull() ?: 0

    if (isTeen(inputAge1, inputAge2, inputAge3)) {
        whatIsTeen(inputAge1, inputAge2, inputAge3)
    }
}

fun isTeen(inputAge1: Int, inputAge2: Int, inputAge3: Int): Boolean {
    return inputAge1 in 13..19 || inputAge2 in 13..19 || inputAge3 in 13..19
}

fun whatIsTeen(inputAge1: Int, inputAge2: Int, inputAge3: Int) {
    println("Teen numbers:")
    if (inputAge1 in 13..19) {
        println("Age 1")
    }

    if (inputAge2 in 13..19) {
        println("Age 2")
    }

    if (inputAge3 in 13..19) {
        println("Age 3")
    }
}