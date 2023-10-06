package practice

/**
 * The squirrels spend most of their time playing. In particular, they play if the temperature is between 60 and 90, inclusive.
 * Unless it is summer, then the upper limit is 100 instead of 90. Given an int temperature and a boolean isSummer,
 * return true if the squirrels are playing and false otherwise.
 */

fun main() {
    println("Its Summer : y or n please")
    var inputSummerStatus = readln().single()

    while (!summerStatus(inputSummerStatus)) {
        println("It's y or n enter the status again:")
        println("Its Summer : y or n please")
        inputSummerStatus = readln().single()
        summerStatus(inputSummerStatus)
    }

    println("Enter the temperature:")
    val inputTemperature = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val resultTemperature = temperatureStatus(inputTemperature, inputSummerStatus)

    if (resultTemperature) {
        println("The temperature is too low or so high to play:")
    } else {
        println("The squirrel can play!")
    }
}

fun summerStatus(summerStatus: Char): Boolean {
    return summerStatus == 'y' || summerStatus == 'n'
}

fun temperatureStatus(temperature: Double, summerStatus: Char): Boolean {
    if (summerStatus == 'y') {
        return temperature < 0 || (temperature > 55)
    } else if (summerStatus == 'n') {
        return temperature < 0 || (temperature > 45)
    }
    return false
}
