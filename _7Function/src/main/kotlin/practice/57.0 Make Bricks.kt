package practice

/**
 * We want to make a row of bricks that is goal inches long.
 * We have a number of small bricks (1 inch each) and big bricks (5 inches each).
 * Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks! Complete the problem without using any loops.
 */

fun main() {
    println("Enter the size of row:")
    val inputSizeRow = readlnOrNull()?.toIntOrNull() ?: 0

    println(makeBricks(inputSizeRow))
}

fun makeBricks(sizeRow: Int): Int {
    val bigBrick = sizeRow / 5
    val smallBrick = sizeRow - bigBrick

    println("Big bricks: ${bigBrick}")
    println("small bricks: ${smallBrick}")

    return bigBrick
}