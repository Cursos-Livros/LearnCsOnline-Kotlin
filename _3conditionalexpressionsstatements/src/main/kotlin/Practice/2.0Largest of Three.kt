package Practice

/**
 * Let's use conditionals to perform a common task: finding the largest of, in this case, three numbers.
 *
 * You can imagine using this kind of code in a lot of places. Maybe you're picking the next person for your pickup basketball team and have the heights of three possible
 * teammates. Maybe you're choosing between three medications and want to choose the best based on the results of some study. Or maybe you're choosing a steak to cook for
 * dinner and want the heaviest cut of meat at the same price. In all cases the logic is the same.
 *
 * Assume you are working with three Double variable: first, second, and third. Your code should print the value of the largest of the three. (If two or more values tie for
 * the largest, you can print any of the largest values.)
 */

fun main() {
    println("Enter with a number:")
    var input: String = readLine() ?: ""
    var first: Double = input.toDouble()

    println("Enter with a number:")
    input = readLine() ?: ""
    var second: Double = input.toDouble()

    println("Enter with a number:")
    input = readLine() ?: ""
    var third: Double = input.toDouble()

    var largest = first

    if (second > largest) {
        largest = second
    }
    if (third > largest) {
        largest = third
    }

    println("The largest number is ${largest}")
}