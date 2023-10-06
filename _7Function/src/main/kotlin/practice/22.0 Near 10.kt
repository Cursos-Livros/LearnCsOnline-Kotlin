package practice

fun main() {
    println("Enter the number:")
    val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0

    val result = near10(inputNumber)

    println(result)
}

fun near10(number: Int): Boolean {
    val multiple = 100

    return number % 10 == 0 && number % multiple == 0
}