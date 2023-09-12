fun main() {
    var temperature = 89.8
    if (temperature > 80) {
        println("It's hot")
        println("Another print statement")
    }
    println("Bottom")

    var distanceInKilometers = 0.501
    if (distanceInKilometers > 0.2) {
        println("In block")
        var distanceInMeters = 1000 * distanceInKilometers
        println(distanceInMeters)
        if (distanceInMeters > 500) {
            println("That's more than half a kilometer!")
        }
    }
    println("Finished")
}