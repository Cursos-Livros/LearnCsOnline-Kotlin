package practice

/**
 * You are driving a little too fast, and a police officer stops you. Write code to compute the result, encoded as an Int value: 0=no ticket, 1=small ticket, 2=big ticket.
 * If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or more, the result is 2. Unless it is your birthday!
 * On that day, your speed can be 5 higher in all cases.
 */
fun main() {
    val speed = 70
    val isBirthday = false

    val result = caughtSpeed(speed, isBirthday)
}

fun caughtSpeed(speed: Int, isBirthday: Boolean): Int {
    val speedLimit = if (isBirthday) 65 else 60

    when {
        speed <= speedLimit -> return 0
        speed in (speedLimit + 1)..(speedLimit + 20) -> return 1
        else -> return 2
    }
}