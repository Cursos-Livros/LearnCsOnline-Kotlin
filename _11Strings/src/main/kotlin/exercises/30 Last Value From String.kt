package exercises

/**
 * Write a method name lastValueFromString that accepts a String containing one or more lines, each containing an integer value, and returns the last value as an Int.
 * The values may have whitespace around them!
 *
 * For example, given the String:
 *
 * 1
 *   2
 * 4
 * You should return 4.
 *
 * You can assume that the passed String contains at least one line, and has no blank lines or lines that do not contain an integer value.
 */
fun main() {
    val input = "1\n   2\n4"
    println(input)
    val lastValue = lastValueFromString(input)
    println(lastValue) // Output: 4
}

fun lastValueFromString(input: String): Int {
    // Split the input string into lines and remove leading/trailing whitespace
    val lines = input.lines().map { it.trim() }

    // Get the last line and convert it to an integer
    val lastLine = lines.last()
    return lastLine.toInt()
}