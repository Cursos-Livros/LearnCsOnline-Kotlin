package practice

/**
 * Given two non-negative Int values, return true if they have the same last digit, such as with 27 and 57. Note that the % operator computes remainders, so 17 % 10 is 7.
 */
fun main() {
    println("Enter with the number. (the number necessary should be int)")

    println("Enter the number 1")
    val inputInt = readLine()?.toIntOrNull() ?: 0

    println("Enter the number 2")
    val inputInt2 = readLine()?.toIntOrNull() ?: 0

    val result = twoLastDigits(inputInt, inputInt2)

    if(result){
        println("Its same")
    }else{
        println("Its not same")
    }
}

fun twoLastDigits(number1: Int, number2: Int): Boolean {
    val lastDigitNumber1 = number1 % 10
    val lastDigitNumber2 = number2 % 10
    if (lastDigitNumber1 == lastDigitNumber2) {
        return true
    }
    return false
}