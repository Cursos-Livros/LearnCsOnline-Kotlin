package practice

/**
 * Return an IntArray containing the first 3 digits of π: {3, 1, 4}.
 */
fun main() {
    val pi = 3141592653589793

    val result = returnPi(pi)

    println(result.contentToString())
}

fun returnPi(piValue: Long): IntArray {
    var number = piValue
    var count = 16
    var result = 0
    val newarray = IntArray(3)
    while (count != 0) {
        result = (number % 10).toInt()
        number /= 10
        when (count) {
            3 -> newarray[2] = result
            2 -> newarray[1] = result
            1 -> newarray[0] = result
        }
        count--
    }
    return newarray
}


