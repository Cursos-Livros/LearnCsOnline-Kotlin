package Practice

/**
 * Character Count
 * Create a program that allows the user to enter the names of characters from "Jujutsu Kaisen".
 * Record each character's count and, at the end, print the list of characters with their counts.
 */
fun main() {
    val listName = mutableListOf<String>()

    do {
        println("Enter with Jujutsu no Kaisen names of characters, press 0 to stop:")
        val inputName = readlnOrNull() ?: "Yuji"

        if (inputName != "0") {
            listName.add(inputName)
        }
    } while (inputName != "0")

    val listCountName = countNames(listName)

    println(listCountName)
}

fun countNames(names: List<String>): MutableMap<String, Int> {
    val nameCounter = mutableMapOf<String, Int>()

    for (eachName in names) {
        nameCounter[eachName] = (nameCounter[eachName] ?: 0) + 1
    }

    return nameCounter
}


