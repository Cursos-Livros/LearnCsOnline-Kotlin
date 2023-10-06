package practice


/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
 */
fun main() {
    println("What day is today? (Just put the number)")
    val inputDayOfWeek = readlnOrNull()?.toIntOrNull() ?: 1

    if (testDay(inputDayOfWeek)) {
        println("You are on vacation? (yes or not)")
        val inputStatusVacation = readlnOrNull() ?: "not"
        if (statusVacation(inputStatusVacation)) {
            println("We can sleep in today")
        }else{
            println("We can not sleep in today")
        }
    } else {
        println("this is not a day of week")
    }
}

fun testDay(dayOfWeek: Int): Boolean {
    return dayOfWeek in 1..7
}

fun statusVacation(statusVacation: String): Boolean {
    return statusVacation == "yes"
}