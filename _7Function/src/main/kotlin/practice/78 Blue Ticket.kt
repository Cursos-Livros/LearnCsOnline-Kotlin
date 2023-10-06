package practice

/**
 * You have a blue lottery ticket, with Ints a, b, and c on it.
 * This makes three pairs, which we'll call ab, bc, and ac. Consider the sum of the numbers in each pair.
 * If any pair sums to exactly 10, the result is 10. Otherwise, if the ab sum is exactly 10 more than either bc or ac sums, the result is 5.
 * Otherwise, the result is 0.
 */

fun main() {
    println("Enter number 1:")
    val inputNumber1 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 2:")
    val inputNumber2 = readlnOrNull()?.toIntOrNull() ?: 0

    println("Enter number 3:")
    val inputNumber3 = readlnOrNull()?.toIntOrNull() ?: 0


    val result1 = sum2(inputNumber1, inputNumber2)
    val result2 = sum2(inputNumber2, inputNumber3)
    val result3 = sum2(inputNumber1, inputNumber3)

    var resultPairSums = 0

    if (exactly10(result1) || exactly10(result2) || exactly10(result3)) {
        resultPairSums = 10
        println("The result is $resultPairSums")
    } else if (more10(result1, result2, result3)) {
        resultPairSums = 5
        println("The result is $resultPairSums")
    } else {
        println("The result is $resultPairSums")
    }


}

fun sum2(number1: Int, number2: Int): Int {
    return number1 + number2
}

fun exactly10(resultSum: Int): Boolean {
    return resultSum == 10
}

fun more10(resultSum1: Int, resultSum2: Int, resultSum3: Int): Boolean {
    return resultSum1 == (resultSum2 + 10) || resultSum1 == (resultSum2 + 10)
}