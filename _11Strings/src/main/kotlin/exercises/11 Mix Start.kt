package exercises

/**
 * Return true if the given String begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.
 */
fun main() {
    println("Enter with the word:")
    var inputString = readlnOrNull() ?: "String"
    val firstChar = firstChar(inputString)
    println("Start with: ${startWith(inputString, firstChar)}")
}

fun firstChar(word: String): Char? {
    return word.firstOrNull()
}

fun startWith(word: String, char: Char?): Boolean {
    return word.startsWith("${char}ix")
}