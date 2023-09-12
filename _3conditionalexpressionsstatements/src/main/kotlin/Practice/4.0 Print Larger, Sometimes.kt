package Practice

/**
 * Computer programs can also make more complex decisions based on multiple pieces of data.
 *
 * To illustrate this, let's complete the short snippet of code below. You should assume that three variables are already declared and have their values set: x and y, both Int
 * values, and print, a Boolean. You do not need to declare or modify their values.
 *
 * You should write a snippet of code containing a conditional expression to accomplish the following goal. If the value of x is strictly greater than y, you should print
 * "Larger". Otherwise you should print "Smaller". However, if print is set to false you should not print anything, regardless of the values of x and y.
 */

fun main() {
    val x = 1
    val y = 0
    val print = true

    if (print == true) {
        if (x > y) {
            println("Large")
        } else {
            println("Smaller or Equal")
        }
    }


}