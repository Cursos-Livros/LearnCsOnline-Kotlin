package practice

/**
 * Return true if the given non-negative Int is 1 or 2 less than a multiple of 20. So for example 38 and 39 return true, but 40 returns false.
 */
fun main() {
    println("Enter with the multiple:")
    val inputMultiple = readLine()?.toIntOrNull() ?: 0

    println("Enter with the number:")
    val inputnumber = readLine()?.toIntOrNull() ?: 0

    val resultisLess = isMultiple(inputnumber, inputMultiple)

    if (resultisLess == true) {
        println("Is Less")
    } else {
        println("Is not Less")
    }
}

fun isMultiple(number: Int, inputMultiple: Int): Boolean {
    val less1 = number + 1
    val less2 = number + 2

    if (number % inputMultiple == 0) {
        return false
    } else if (less1 % inputMultiple == 0) {
        return true
    } else if (less2 % inputMultiple == 0) {
        return true
    }
    return false
}