package exercises

/**
 * Given a String of even length, return a String made of the middle two characters.
 * So the string "string" yields "ri". The string length will be at least 2.
 */
fun main() {
    println("Enter with the string, the size need be even:")
    var inputString = readlnOrNull() ?: "String"

    while (inputString.isNotEmpty() && !evenLenght2(inputString)) {
        messageError2()
        inputString = readlnOrNull() ?: "String"
        evenLenght2(inputString)
    }

    println(middleTwo(inputString))
}

fun evenLenght2(string: String): Boolean {
    return string.length % 2 == 0
}

fun middleTwo(word: String): String {
    val middleIndex = word.length / 2
    return word.substring(middleIndex, middleIndex + 2)
}