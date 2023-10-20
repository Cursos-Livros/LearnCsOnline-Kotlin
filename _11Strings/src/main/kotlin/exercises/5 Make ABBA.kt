package exercises

/**
 * Given two Strings, a and b, return the result of putting
 * them together in the order abba: "Hi" and "Bye" returns "HiByeByeHi".
 */
fun main() {
    println("Enter with the string A:")
    val inputStringA = readlnOrNull() ?: "String"

    println("Enter with the string B:")
    val inputStringB = readlnOrNull() ?: "String"

    println(makeABBA(inputStringA, inputStringB))
}

fun makeABBA(stringA: String, stringB: String): String {
    return "$stringA$stringB$stringB$stringA"
}