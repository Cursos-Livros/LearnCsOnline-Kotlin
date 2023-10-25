package Practice

/**
 * Declare and implement a function called arraySum that receives a nullable two-dimensional double array
 * (Array<DoubleArray>?) values as its only parameter and returns the sum of the values in the array as a Double.
 * If the array is null you should return 0 (as a Double). None of the inner arrays will be null.
 */
fun main() {
    val doubleArray = arrayOfNulls<DoubleArray>(2)
    val array1 = doubleArrayOf(0.1, 0.2, 0.3)
    val array2 = doubleArrayOf(0.1, 0.7, 0.3)

    doubleArray[0] = array1
    doubleArray[1] = array2

    println(doubleArray[0].contentToString())
    println(doubleArray[1].contentToString())

    val result = arraySum(doubleArray)

    println(result)
}

fun arraySum(array: Array<DoubleArray?>): Double {
    var sum = 0.0
    for (inner in array) {
            if (inner != null) {
                for (value in inner) {
                    sum += value
                }
            }
        }
    return sum
}