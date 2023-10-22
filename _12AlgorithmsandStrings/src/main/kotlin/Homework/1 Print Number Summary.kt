package Homework

import kotlin.math.roundToInt

/**
 * Let's print some fun statistics about some numbers! Write a method named processNumbers that accepts a single String as input.
 * The String will contain, on separate lines, integer values. However, some lines may be blank, and other integers may have whitespace before or after.
 * Here's an example:
 *
 * 1
 *
 *   2
 *  4
 * Process the String line by line, using Kotlin's .toInt() method to convert each line to an Int value.
 * Print a report when you are done in the following format, in this case using the numbers shown above:
 *
 * Count: 3
 * Sum: 7
 * Count Even: 2
 * Count Odd: 1
 * Average: 2.3
 * Note that you should format the average with a single decimal place.
 * You should examine how to use the Kotlin roundToInt method and a bit of cleverness to accomplish this.
 */
fun main() {
    val someNumbers = "1 \n \n 2 \n 4"
    println(someNumbers)

    val count = count(someNumbers)
    val sum = sum(someNumbers)
    val countEven = countEven(someNumbers)
    val countOdd = countOdd(someNumbers)
    val average = average(someNumbers)

    println("Count: $count")
    println("Sum: $sum")
    println("Count Even: $countEven")
    println("Count Odd: $countOdd")
    println("Average: $average")
}

fun count(numbers: String): Int {
    var countNumbers = 0
    for (count in numbers.lines()) {
        countNumbers++
    }
    return countNumbers
}

fun sum(numbers: String): Int {
    var countNumbersSum = 0
    for (line in numbers.lines()) {
        if (line.trim().isNotEmpty()) {
            val numberTrimmed = line.trim().toInt()
            countNumbersSum += numberTrimmed
        }
    }
    return countNumbersSum
}

fun countEven(numbers: String): Int {
    var countEven = 0
    for (line in numbers.lines()) {
        if (line.trim().isNotEmpty()) {
            if (line.trim().toInt() % 2 == 0) {
                countEven++
            }
        }
    }
    return countEven
}

fun countOdd(numbers: String): Int {
    var countOdd = 0
    for (line in numbers.lines()) {
        if (line.trim().isNotEmpty()) {
            if (line.trim().toInt() % 2 == 1) {
                countOdd++
            }
        }
    }
    return countOdd
}

fun average(numbers: String): Int {
    var numbersSum = 0.0
    var count = 0
    for (line in numbers.lines()) {
        if (line.trim().isNotEmpty()) {
            val numberTrimmed = line.trim().toInt()
            numbersSum += numberTrimmed
            count++
        }
    }
    return (numbersSum / count).roundToInt()
}