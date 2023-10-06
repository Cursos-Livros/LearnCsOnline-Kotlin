package practice

/**
 * You have a red lottery ticket showing Ints a, b, and c, each of which is 0, 1, or 2.
 * If they are all the value 2, the result is 10.
 * Otherwise if they are all the same, the result is 5.
 * Otherwise so long as both b and c are different from a, the result is 1.
 * Otherwise the result is 0.
 */
fun main() {
    println("Enter three numbers (0, 1, or 2) for the red lottery ticket:")
    val a = readLine()?.toIntOrNull() ?: 0
    val b = readLine()?.toIntOrNull() ?: 0
    val c = readLine()?.toIntOrNull() ?: 0

    val result = redLotteryTicket(a, b, c)

    println("Result: $result")
}

fun redLotteryTicket(a: Int, b: Int, c: Int): Int {
    if (a == 2 && b == 2 && c == 2) {
        return 10
    } else if (a == b && b == c) {
        return 5
    } else if (a != b && a != c) {
        return 1
    } else {
        return 0
    }
}