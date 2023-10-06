package practice

/**
 * Given three Int values, return the largest.
 */

fun main() {
    println("Enter with the number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0
    val number1 = inputNumber1

    println("Enter with the number:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0
    val number2 = inputNumber2

    println("Enter with the number:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0
    val number3 = inputNumber3

    println("${intMax(number1, number2, number3)}")
}

fun intMax(number1: Int, number2: Int, number3: Int): Int {
    var max = number1

    if(number2 > max){
        max = number2
    }

    if(number3 > max){
        max = number3
    }

    return max
}