package Practice

fun main() {
    var values = Array(8) { IntArray(4) }

    for (i in values.indices) {
        for (j in values[i].indices) {
            println("$i $j")
        }
    }
}