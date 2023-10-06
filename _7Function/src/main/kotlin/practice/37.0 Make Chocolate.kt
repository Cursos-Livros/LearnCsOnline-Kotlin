package practice

/**
 * We want make a package of goal kilos of chocolate.
 * We have small bars (1 kilo each) and big bars (5 kilos each).
 * Return the number of small bars to use, assuming we always use big bars before small bars.
 * Return -1 if it can't be done. No loops are needed to solve this problem!
 */

fun main() {
    println("Insert the size of package in KG: Please use integer numbers")
    val inputKgPackage = readlnOrNull()?.toIntOrNull() ?: 0

    println("Small bar requeired: ${makePackage(inputKgPackage)}")
}

fun makePackage(kilogramPackage: Int): Int {
    val maxBigBar = kilogramPackage / 5
    val smallBar = kilogramPackage - maxBigBar * 5

    return smallBar
}