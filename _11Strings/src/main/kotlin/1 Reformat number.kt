/**
 * Let's get some practice working with Kotlin Strings: an incredibly useful data type for working with text.
 *
 * Write a function called reformatPhoneNumber.
 * It should take a String containing a phone number in the format 111-222-3333 and return it reformatted as (111) 222-3333.
 *
 * You will want to explore the various String methods to help you with this task.
 * In particular, you may find split and substring helpful.
 * There are solutions that use split, others that use substring, and probably others that use neither!
 */

fun main(args: Array<String>) {
    println("Enter with the number: The number need be on 111-222-3333 format")
    var inputNumber: String = readlnOrNull() ?: "111-222-3333"

    while (!numberFormat(inputNumber)) {
        formatNumberError()
        inputNumber = readlnOrNull() ?: "111-222-3333"
        numberFormat(inputNumber)
    }

    println(reformatPhoneNumber(inputNumber))
    println(reformatPhoneNumber2(inputNumber))
}

fun numberFormat(inputNumber: String): Boolean {
    return inputNumber[3] == '-' && inputNumber[7] == '-'
}

fun formatNumberError() {
    println("The number is not on the accepted format! Please try again!")
}

fun reformatPhoneNumber(number: String): String {
    val threeFirstNumber = number.substring(0..2)
    val threeSecondNumber = number.substring(4..6)
    val threeLastNumber = number.substring(8..11)
    return "($threeFirstNumber) $threeSecondNumber $threeLastNumber"
}

fun reformatPhoneNumber2(number: String): String {
    val numberArray = number.split('-')

    return "(${numberArray[0]}) ${numberArray[1]} ${numberArray[2]}"
}


