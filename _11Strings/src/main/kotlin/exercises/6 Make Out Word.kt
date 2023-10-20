package exercises

/**
 * Given an String out length 4, such as "<<>>", and a String word,
 * return a new String where the word is in the middle of the out String: "<>".
 */
fun main() {
    println("Enter with the string Out")
    var inputStringOut = readlnOrNull() ?: "String"

    while (!evenLenght4(inputStringOut)) {
        messageError()
        inputStringOut = readlnOrNull() ?: "String"
        evenLenght4(inputStringOut)
    }

    println("Enter with the string")
    var inputString = readlnOrNull() ?: "String"

    println(makeOut(inputStringOut, inputString))
}

fun evenLenght4(string: String): Boolean {
    return string.length % 4 == 0
}

fun makeOut(stringOut: String, stringWord: String): String {
    val size = stringOut.length / 2
    val firstPart = stringOut.substring(0..1)
    val lastPart = stringOut.substring(2)

    return "$firstPart$stringWord$lastPart"
}



