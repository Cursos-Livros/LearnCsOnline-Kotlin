package practice

/**
 * Given an IntArray, return a new IntArray of length 2 containing the first and last elements from the original array. The original array will be length 1 or more.
 */
fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5)
    val resultArrayMain = makeEnd(array)
    println(resultArrayMain.contentToString())
}

fun makeEnd(array: IntArray): IntArray {
    var resultArray = IntArray(2)
    for (i in array.indices) {
        if (i == 0) {
            resultArray[i] = array[i]
        } else if (i == array.size - 1) {
            resultArray[1] = array[i]
        }
    }
    return resultArray
}