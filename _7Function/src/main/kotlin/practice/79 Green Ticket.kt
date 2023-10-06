package practice

/**
 * You have a green lottery ticket with three numbers.
 * If the numbers are all different from each other, the result is 0.
 * If all the numbers are the same, the result is 20.
 * If two of the numbers are the same, the result is 10.
 */
fun main() {
    println("Enter with the quantity of number of lottery card:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray6(sizeArray)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray6(sizeArray)
    }

    val numbersTicket = IntArray(sizeArray)

    for (i in numbersTicket.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        numbersTicket[i] = inputNumber
    }

    val lotteryResultNumbers = lotteryPrize(numbersTicket)


    println("number of points = $lotteryResultNumbers")

}

fun correctSizeArray6(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun lotteryPrize(numbersTicket: IntArray): Int {
    if (allTheSame(numbersTicket)) {
        return 20
    } else if (twoSame(numbersTicket)) {
        return 10
    }
    return 0
}

fun allTheSame(ticket: IntArray): Boolean {
    val firstElement = ticket[0]
    return ticket.all { it == firstElement }
}

fun twoSame(numbersTicket: IntArray): Boolean {
    for (i in 0..<numbersTicket.size - 1) {
        for (j in i + 1..<numbersTicket.size) {
            if (numbersTicket[i] == numbersTicket[j]) {
                return true
            }
        }
    }
    return false
}