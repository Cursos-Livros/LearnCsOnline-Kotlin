package practice

/**
 * Given two ints, return whichever value is larger.
 * However if the two values have the same remainder when divided by 5, then the return the smaller value.
 * However, in all cases, if the two values are the same, return 0.
 */
fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    if (test0(inputNumber1, inputNumber2)) {
        println("The 2 numbers is 0!")
    }

    var result = 0

    if (sameRemainder(inputNumber1, inputNumber2)) {
        result = min(inputNumber1, inputNumber2)
    } else {
        result = max(inputNumber1, inputNumber2)
    }

   println(result)
}

fun test0(number1: Int, number2: Int): Boolean {
    return number1 == 0 && number2 == 0
}

fun sameRemainder(number1: Int, number2: Int): Boolean {
    return number1 % 5 == number2 % 5
}

fun min(number1: Int, number2: Int): Int {
    if (number1 < number2) {
        return number1
    }
    return number2
}

fun max(number1: Int, number2: Int): Int {
    if (number1 > number2) {
        return number1
    }
    return number2
}