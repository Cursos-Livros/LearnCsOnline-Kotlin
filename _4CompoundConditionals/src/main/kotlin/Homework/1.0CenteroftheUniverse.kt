package Homework

/**
 * To manipulate data, computers require that it be digitized, or converted into numbers. But humans have been digitizing the world around us long before computers came around.
 *
 * Location is one example. The idea of a geographic coordinate system goes back to the 3rd century B.C. Geographic coordinate systems represent a horizontal position on Earth
 * using two numbers: latitude and longitude. (Representing altitude requires a third number, but let's not worry about that right now.) Representing location numerically has
 * always enabled exploration—from the days of the ancient Greeks, to us wandering but never lost with the help of our smartphone and its navigation apps.
 *
 * To complete the problem below, you should examine the values of two Double variables that have already been declared and set for you: latitude and longitude.
 * If their values indicate that you are at a very special place, you should print "Center of the Universe". Otherwise, print "Somewhere else". Also keep in mind that latitude and
 * longitude values can be positive and negative when digitized, and you may need to consider this when formulating your solution.
 */

fun main() {
    val latitude = 0.0
    val longitude = 0.0

    if(longitude == -51.94765 && latitude == -23.4120142){
        println("Center of the Universe")
    }else{
        println("Somewhere else")
    }
}