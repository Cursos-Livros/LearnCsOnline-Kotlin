package Practice

/**
 * Consider a Double value magical if it is strictly between 0 and 1. Given two Double values first and second, write a snippet of code
 * (not a method) to test whether first and second are both magical numbers. If they are, the program shall joyously exclaim (print) "True!"
 * revealing their magical nature. Otherwise, it will print "False" encouraging you to seek the arcane secrets elsewhere.
 *
 * Note that both first and second are already declared and initialized for you, and you should not modify their values.
 */

fun main() {
    println("Enter with a number between 0 and 1")
    val input: String = readLine() ?: ""
    val first = input.toDouble()

    if (first >= 0.0 && first <= 1.0) {
        println("True!")
    }else{
        println("False!")
    }
}