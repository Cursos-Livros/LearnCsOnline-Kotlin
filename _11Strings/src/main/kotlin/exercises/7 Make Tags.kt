package exercises

/**
 * HTML is a markup language that is used by web documents.
 * HTML uses tags to control how text is formatted:
 * like "<i>Yay</i>" which renders "Yay" in italics.
 * In this example, the "i" tag makes <i></i> which surround the word "Yay".
 * Given a tag and word Strings, create the HTML string with tags around the word: such as "<i>Yay</i>".
 */
fun main() {
    println("Enter with the tag:")
    var inputTag = readlnOrNull() ?: "String"

    println("Enter with the string")
    var inputString = readlnOrNull() ?: "String"

    println(makeTag(inputTag, inputString))
}

fun makeTag(tag: String, word: String): String {
    val openTag = firstTag(tag)
    val closeTag = lastTag(tag)
    return "$openTag$word$closeTag"

    // return "<$tag>$word</$tag>"
}

fun firstTag(tag: String): String {
    return "<$tag>"
}

fun lastTag(tag: String): String {
    return "</$tag>"
}