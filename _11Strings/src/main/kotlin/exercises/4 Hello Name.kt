package exercises

/**
 * Given a string name like Bob", return a greeting of the form "Hello Bob!".
 */
fun main() {
    println("Enter with the string")
    var inputString = readlnOrNull() ?: "String"

    println("${showHello()} $inputString!")
}

fun showHello(): String {
    return "Hello"
}