package Homework

/**
 * Given a UNIX timestamp we can also determine things about what was happening at that time. Let's write a snippet of code that, given a Long timestamp stored in currentTime,
 * prints 00s if its in the 2000-aughts, 10s if its in the 2010s, and 20s if its in the 2020s. (Note that UNIX time is always in the UTC timezone.)
 */
fun main() {
    val currentTime: Long = 968797664

    if (currentTime in 968797664..1252794464) {
        println("00's")
    } else if(currentTime in 1284330464..1568327264){
        println("10's")
    }  else if(currentTime in 1284330464..1568327264){
        println("20's")
    }
}