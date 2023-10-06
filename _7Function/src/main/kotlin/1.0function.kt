fun main() {
    println("Start")
    var result = searchArray(intArrayOf(1, 9, 9), 9)
    println("Done")
    println(result)
}

fun searchArray(values: IntArray, lookingFor: Int): Boolean {
    println("Searching")
    println(values.contentToString())
    println(lookingFor)
    for (i in values.indices) {
        if (values[i] == lookingFor) {
            println("Returning at index $i")
            return true
        }
    }
    println("searchArray Done")
    return false
}