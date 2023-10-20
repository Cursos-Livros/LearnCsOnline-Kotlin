package exercises

/**
 * Write a method name flipHalves that returns a passed String rearranged as follows.
 * You should move the second half of the string to the front, and the first half to the back.
 * So given the String "CS" you would return "SC", and given the String "testme" you would return "tmetes".
 * However, if the length of the String is odd the middle character should remain in place. So given the String "CS124" you would return "241CS".
 * If the passed String is empty, just return the empty String.
 *
 * You will definitely want to review the substring String method, and also spend some time experimenting with it before you begin crafting your solution.
 * You also may want to consider odd and even length Strings separately.
 */
fun main() {
    println("Enter with the word:")
    var inputWord = readlnOrNull() ?: "String"

    val sizeEven = inputWord.length % 2 == 0

    if (sizeEven) {
        println(inverterHalfEven(inputWord))
    } else {
        println(inverterHalfOdd(inputWord))
    }
}

fun inverterHalfEven(word: String): String {
    val firstHalf = word.substring(0..<word.length / 2)
    val secondHalf = word.substring(word.length / 2..<word.length)
    return "$secondHalf$firstHalf"
}

fun inverterHalfOdd(word: String): String {
    val firstHalf = word.substring(0..<word.length / 2)
    val halfElement = word[word.length / 2]
    val secondHalf = word.substring(word.length / 2 + 1..<word.length)
    return "$secondHalf$halfElement$firstHalf"
}