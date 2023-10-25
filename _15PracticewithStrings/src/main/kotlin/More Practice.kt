/**
 * This problem combines Strings, functions, and arrays. Super fun!
 *
 * Write a function called rotateRight that takes a nullable String as its first argument
 * and a non-negative Int as its second argument and rotates the String by the given number of characters.
 * Here's what we mean by rotate:
 *
 * CS125 rotated right by 1 becomes 5CS12
 * CS125 rotated right by 2 becomes 25CS1
 * CS125 rotated right by 3 becomes 125CS
 * CS125 rotated right by 4 becomes S125C
 * CS125 rotated right by 5 becomes CS125
 * CS125 rotated right by 8 becomes 125CS
 * And so on. Notice how characters rotated off the right end of the String wrap around to the left.
 *
 * This problem is tricky! Here are a few hints:
 *
 * You will want to use the remainder operator to perform modular arithmetic.
 * You will probably want to convert the String to an array of characters before you begin.
 * You can convert an array of characters characters back into a String like this: String(characters).
 * You can also solve this problem quite elegantly using substring.
 * If the passed String argument is null, you should return null. Good luck and have fun!
 */

fun main() {
    println("Enter with the string to rotate")
    val input = readlnOrNull() ?: "string"

    val arraycharInput = convertArray(input)

    println("print number of rotates:")
    val inputNumberRotate = readlnOrNull()?.toIntOrNull() ?: 1

    println(rotate(arraycharInput, inputNumberRotate))
}

fun convertArray(input: String): CharArray {
    return input.toCharArray()
}

fun rotate(charArray: CharArray, numberRotate: Int): String {
    val characterToRotate = numberRotate % charArray.size

    val rotatePart = String(charArray.sliceArray(charArray.size - characterToRotate..<charArray.size))
    val remainingPart= String(charArray.sliceArray(0..<charArray.size - characterToRotate))

    return rotatePart + remainingPart
}