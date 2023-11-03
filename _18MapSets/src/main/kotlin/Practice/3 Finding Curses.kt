package Practice

/**
 * Exercise 3: Finding Curses
 *
 * Create a map of locations in "Jujutsu Kaisen" and the curses associated with each location.
 * Allow the user to select a location and list the curses present at that location.
 */
fun main() {
    var inputLocationCurses = ""
    var inputNameCurses = ""
    val mapOfCursesLocations = mutableMapOf<String, String>()

    do {
        println("Enter the location of the curses:")
        inputLocationCurses = readlnOrNull() ?: "Not Exist"
        println("Enter the name of curses:")
        inputNameCurses = readlnOrNull() ?: "Not Exist"

        mapOfCursesLocations[inputLocationCurses] = inputNameCurses

        println("Wish to continue:")
        val inputContinueStatus = readlnOrNull()?.toIntOrNull() ?: 0
    } while (inputContinueStatus != 0)


    println("Region to locate curses:")
    val inputRegion = readlnOrNull() ?: "Not Exist"



    println("Region $inputRegion has ${mapOfCursesLocations[inputRegion]}")

}
