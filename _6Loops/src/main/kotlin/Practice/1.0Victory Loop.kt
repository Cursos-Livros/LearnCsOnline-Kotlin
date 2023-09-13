package Practice

/**
 * Let's get started by writing using a simple loop. Assuming an Int variable named repeat has been declared and initialized to a value
 * larger than or equal to zero, write a loop that prints "Victory!" repeat times on separate lines. You may use any kind of loop you want!
 * But do not modify the value of repeat.
 */
fun main() {
    println("Enter with the limit of range repetition:")
    val input = readLine()?: ""
    var repeat = input.toInt()

    for(i in 1 .. repeat){
        println("Victory!")
    }
}