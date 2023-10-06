package practice

/**
 * Declare and implement a function called reversePrint. You should accept a single array of Char values as your only argument, and print that array backwards,
 * one character on each line. Your function should return the length of the array as an Int.
 */
fun main() {
    println("Enter with the size of array:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    val charArray = CharArray(sizeArray)

    for (i in charArray.indices) {
        println("Enter with the char:")
        val inputChar = readln().single()
        charArray[i] = inputChar as Char
    }

    println(charArray.contentToString())

    val result = reversePrint(charArray)

    println(result.contentToString())

    for (i in result.indices) {
        println(result[i])
        println()
    }
}

fun reversePrint(array: CharArray): CharArray {
    val newCharArray = CharArray(array.size)
    var counterIndexPositive = 0
    var counterIndexNegative = array.size - 1

    while (counterIndexNegative >= 0) {
        newCharArray[counterIndexPositive] = array[counterIndexNegative]
        counterIndexPositive++
        counterIndexNegative--
    }

    return newCharArray
}