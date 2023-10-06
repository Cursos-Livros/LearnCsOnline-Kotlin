package practice

/**
 * When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive.
 * Unless it is the weekend, in which case there is no upper bound on the number of cigars.
 * Return true if the party with the given values is successful, or false otherwise
 */

fun main() {

    println("Enter the day of week:")
    val inputDayWeek = readlnOrNull()?.toIntOrNull() ?: 0
    val resultDayOfWeek = dayWeek(inputDayWeek)

    println("Enter with the number of cigars:")
    val inputNumberCigar = readlnOrNull()?.toIntOrNull() ?: 0

    var result: Boolean = true

    if (resultDayOfWeek) {
        result = numberCigarWeek(inputNumberCigar)
    } else {
        result = numberCigar(inputNumberCigar)
    }

    canEnter(result)

}

fun dayWeek(dayWeek: Int): Boolean {
    if (dayWeek in 6..7) {
        return true
    }
    return false
}

fun numberCigar(numberCigar: Int): Boolean {
    if (numberCigar in 40..60) {
        return true
    }
    return false
}

fun numberCigarWeek(numberCigar: Int): Boolean {
    if (numberCigar >= 1) {
        return true
    }
    return false
}

fun canEnter(result: Boolean) {
    if (result) {
        println("Permitted")
    } else {
        println("Not Permitted get out squirrel!")
    }
}