package practice

/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling.
 * Return true if we are in trouble.
 */

fun main() {
    println("The monkey 1 it is smilling : y or n please")
    var inputMonkeyStatus = readln().single()

    while (!testMonkeyStatus(inputMonkeyStatus)) {
        println("The monkey 1 it is smilling : y or n please")
        inputMonkeyStatus = readln().single()
        testMonkeyStatus(inputMonkeyStatus)
    }

    println("The monkey 2 it is smilling : y or n please")
    var inputMonkeyStatus2 = readln().single()

    while (!testMonkeyStatus(inputMonkeyStatus2)) {
        println("The monkey 2 it is smilling : y or n please")
        inputMonkeyStatus2 = readln().single()
        testMonkeyStatus(inputMonkeyStatus2)
    }

    println("We are in trouble:")
    println(makeTrouble(inputMonkeyStatus, inputMonkeyStatus2))
}

fun testMonkeyStatus(monkeyStatus: Char): Boolean {
    return monkeyStatus == 'y' || monkeyStatus == 'n'
}

fun makeTrouble(aSmile: Char, bSmile: Char): Boolean {
    if (aSmile == 'y' && bSmile == 'y') {
        return true
    } else if (aSmile == 'n' && bSmile == 'n') {
        return true
    }
    return false
}