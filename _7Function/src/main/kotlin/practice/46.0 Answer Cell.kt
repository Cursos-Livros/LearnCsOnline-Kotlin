package practice

/**
 * Your cell phone rings. Return true if you should answer it.
 * Normally you answer, except in the morning you only answer if it is your mom calling.
 * In all cases, if you are asleep, you do not answer.
 */

fun main() {
    val isMorning = false
    val isMomCalling = true
    val isAsleep = false

    val shouldAnswer = shouldAnswerPhone(isMorning, isMomCalling, isAsleep)

    if (shouldAnswer) {
        println("You should answer the phone.")
    } else {
        println("You should not answer the phone.")
    }
}

fun shouldAnswerPhone(isMorning: Boolean, isMomCalling: Boolean, isAsleep: Boolean): Boolean {
    if (isAsleep) {
        return false
    }

    if (isMorning) {
        return true
    }

    return true
}






