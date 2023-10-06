package practice

/**
 * Given an Int, return true if it is in the range 1..10, inclusive.
 * Unless outsideMode is true, in which case return true if the int is less or equal to 1 or greater or equal to 10.
 */

fun main() {
    println("Enter number:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter outside mode: y or n please")
    val inputOutsideMode = readln().single()


    while (!testOutsideMode(inputOutsideMode)) {
        println("Enter outside mode: y or n please")
        val inputOutsideMode = readln().single()
        testOutsideMode(inputOutsideMode)
    }

    println(oneTo10(inputNumber1, inputOutsideMode))
}

fun testOutsideMode(outsideMode: Char): Boolean {
    return outsideMode == 'y' || outsideMode == 'n'
}

fun oneTo10(number1: Int, outsideMode: Char): Boolean {
    if (number1 in 1..10) {
        return true
    } else if (outsideMode == 'y') {
        return true
    }
    return false
}