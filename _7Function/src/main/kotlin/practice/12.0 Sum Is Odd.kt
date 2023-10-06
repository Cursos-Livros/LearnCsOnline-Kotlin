package practice

/**
 * Declare and implement a function called sumIsOdd. sumIsOdd should accept two Int argument and return true if their sum is odd and false otherwise.
 * You will probably want to consider using the remainder operator (%) to complete this problem.
 */
fun main() {
    var sum = 0

    println("Enter with the number. (the number necessary should be int)")

    for (i in 0 until 2) {
        println("Enter the number ${i + 1}")
        val inputInt = readLine()?.toIntOrNull() ?: 0
        sum += inputInt
    }

    if(sumIsOdd(sum)){
        println("Its odd")
    }else{
        println("Its not odd")
    }
}

fun sumIsOdd(number: Int): Boolean {
    if (number % 2 == 0) {
        return false
    }
    return true
}

