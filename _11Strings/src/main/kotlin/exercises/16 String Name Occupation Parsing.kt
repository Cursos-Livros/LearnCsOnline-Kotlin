package exercises

/**
 * Write a method name parseNameOccupation that accepts a single String in the following format:
 *
 * "Aisha, a coder!"
 * "Felip, a doctor!"
 * "Gracie, a dog!"
 * Specifically, the input String has the following format: ", a !".
 * (Gracie's one and only job is being a dog.) Note that the name will always be followed immediately by a comma,
 * and the occupation by an exclamation point.
 *
 * You should return a new String reformatted as follows: "My friend is a great !".
 * So, given "Aisha, a coder!", you would return "My friend Aisha is a great coder!"
 * Note that we have removed the comma but kept the exclamation point.
 *
 * To complete this problem you will probably want to utilize the String methods split and substring.
 */
fun main() {
    println("Enter with the name and job:")
    var inputNameAndJob = readlnOrNull() ?: "String"

    while (!verifyPhrase(inputNameAndJob)) {
        messageError9()
        inputNameAndJob = readlnOrNull() ?: "String"
        verifyPhrase(inputNameAndJob)
    }

    println(stringParsing(inputNameAndJob))
}

fun verifyPhrase(nameJobPhrase: String): Boolean {
    if (nameJobPhrase.last() == '!') {
        val partsBeforeComma = nameJobPhrase.split(',')
        return partsBeforeComma.size == 2
    }
    return false
}

fun messageError9() {
    println("The name or job is wrong!")
    println("Make like" + "Felip, a doctor!" + " for example!")
}

fun stringParsing(nameAndJobPhrase: String): String {
    val phraseParts = nameAndJobPhrase.split(',')
    val name = phraseParts[0]
    val job = phraseParts[1].substring(0, phraseParts[1].length - 1)

    return "My friend $name is a great $job"
}