package practice

import kotlin.random.Random
import kotlin.random.nextInt

/**
 * Return the sum of two 6-sided dice rolls, each in the range 1..6. However,
 * if noDoubles is true, if the two dice show the same value,
 * increment one die to the next value, wrapping around to 1 if its value was 6.
 */

fun main() {
    val dice1 = IntArray(6)

    for (i in dice1.indices) {
        dice1[i] = Random.nextInt(1..6)
    }
    println("Dice 1:")
    println(dice1.contentToString())

    var dice2 = IntArray(6)

    for (i in dice2.indices) {
        dice2[i] = Random.nextInt(1..6)
    }

    println("Dice 2:")
    println(dice2.contentToString())

    if (noDoubles(dice1, dice2)) {
        dice2 = sum1(dice2)
    }

    val sumdice1 = sumDices(dice1)
    val sumdice2 = sumDices(dice2)

    println("Sum dice 1: $sumdice1")
    println("Sum dice 1: $sumdice2")
}

fun noDoubles(dice1: IntArray, dice2: IntArray): Boolean {
    for (i in dice1.indices) {
        if (dice1[i] == dice2[i]) {
            return true
        }
    }
    return false
}

fun sum1(dice2: IntArray): IntArray {
    for (i in dice2.indices) {
        if (dice2[i] == 6) {
            dice2[i] = 1
        }
    }

    return dice2
}

fun sumDices(dice: IntArray): Int {
    var sumDice: Int = 0

    for (i in dice.indices) {
        sumDice += dice[i]
    }
    return sumDice
}
