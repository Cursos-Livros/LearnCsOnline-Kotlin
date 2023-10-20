package exercises

/**
 * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
 */

fun main() {
    println("Enter with the string")
    var inputString = readlnOrNull() ?: "String"

    while (!evenLenght(inputString)) {
        messageError()
        inputString = readlnOrNull() ?: "String"
        evenLenght(inputString)
    }

    println(firstHalf(inputString))
}

fun evenLenght(string: String): Boolean {
    return string.length % 2 == 0
}

fun messageError() {
    println("Wrong word!")
    println("Enter with size 2 string, like mana.")
}

fun firstHalf(string: String): String {
    val size = string.length / 2
    return string.dropLast(size)
}