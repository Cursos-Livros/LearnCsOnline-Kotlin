package Practice

/**
 * Exercise 2: Character Classification
 *
 * Create a map of "Jujutsu Kaisen" characters and their classifications (e.g., first year, second year, third year, etc.).
 * Allow the user to search for the rating of a specific character.
 */
fun main() {
    var fullListClassification = mutableMapOf<String, String>()

    fullListClassification = nameClassificationList()

    println("Enter with th name you desire find:")
    val inputName = readlnOrNull() ?: "Not Exist"

    println("$inputName YBelongs to: ${fullListClassification[inputName]}")
}

fun nameClassificationList(): MutableMap<String, String> {
    val listNameClassification = mutableMapOf<String, String>()

    do {
        println("Enter with name:")
        val inputName = readlnOrNull() ?: "Not exist"
        println("Enter with classification:")
        val inputClassification = readlnOrNull() ?: "Not exist"
        listNameClassification[inputName] = inputClassification
        println("Continue fill:")
        val inputContinue = readlnOrNull()?.toIntOrNull() ?: 0
    } while (inputContinue != 0)

    return listNameClassification
}