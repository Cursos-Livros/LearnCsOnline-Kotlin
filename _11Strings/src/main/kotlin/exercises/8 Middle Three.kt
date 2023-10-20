package exercises

/**
 * Given a String of odd length, return the string length 3 from its middle, so "Candy" yields "and".
 * The string length will be at least 3.
 */
fun main() {
    println("Enter with the string, the size need be odd:")
    var inputString = readlnOrNull() ?: "String"

    while (!oddLenght(inputString)) {
        messageError2()
        inputString = readlnOrNull() ?: "String"
        oddLenght(inputString)
    }

    println(middleThree(inputString))
}

fun oddLenght(word: String): Boolean {
    return word.length % 2 == 1
}

fun messageError2() {
    println("Wrong word!")
    println("Enter with size 3 string or the size need be odd, like man.")
}

fun middleThree(word: String): String {
    val middleIndex = word.length / 2

    return word.substring(middleIndex - 1, middleIndex + 2)
}

