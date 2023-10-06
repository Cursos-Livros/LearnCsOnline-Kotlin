package practice

/**
 * We have a loud talking parrot. The hour parameter is the current hour time in the range 0 to 23, inclusive.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20.
 * Return true if we are in trouble.
 */

fun main() {
    println("Enter the hour:")
    val inputHour = readlnOrNull()?.toIntOrNull() ?: 0

    println("are we in trouble: ${parrotrouble(inputHour)}")
}

fun parrotrouble(hour: Int): Boolean {
    return hour < 7 || hour > 20
}