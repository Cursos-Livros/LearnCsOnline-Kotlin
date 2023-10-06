package practice

/**
 * Given an IntArray of even length at least two, return a new IntArray with length 2 containing the middle two elements from the passed array.
 */
fun main() {
    println("Enter with the range")
    val inputRange = readLine() ?: ""

    val array: IntArray = IntArray(inputRange.toInt())

    for (i in array.indices) {
        println("Enter the number ${i + 1} to the array")
        val inputItemArray = readLine() ?: ""
        array[i] = inputItemArray.toInt()
    }
    val newArray = twoMiddleArray(array)

    println(newArray.contentToString())
}

fun twoMiddleArray(array: IntArray): IntArray {
    val newArray = IntArray(2)

    for (i in array.indices) {
        if (i == (array.size / 2) - 1) {
            newArray[0] = array[i]
        } else if (i == array.size / 2) {
            newArray[1] = array[i]
        }
    }
    return newArray
}