package practice

/**
 * You and your date are trying to get a table at a restaurant. The parameter you is the stylishness of your clothes, in the range 0..10,
 * and date is the stylishness of your date's clothes, also in the same range. The result getting the table is encoded as an Int with 0=no, 1=maybe, 2=yes.
 * If either of you is very stylish, 8 or more, then the result is yes. With the exception that if either of you has style of 2 or less, then the result is no.
 * Otherwise the result is maybe.
 */

fun main() {
    println("Enter the parameter of your stylishness:")
    var inputYourStylishness = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkStylishness(inputYourStylishness)) {
        println("Invalid parameter try again!")
        println("Enter the parameter of your stylishness:")
        inputYourStylishness = readlnOrNull()?.toIntOrNull() ?: 0
        checkStylishness(inputYourStylishness)
    }

    println("Enter the parameter of your partner stylishness:")
    var inputYourPartnerStylishness = readlnOrNull()?.toIntOrNull() ?: 0

    while (!checkStylishness(inputYourPartnerStylishness)) {
        println("Invalid parameter try again!")
        println("Enter the parameter of your stylishness:")
        inputYourPartnerStylishness = readlnOrNull()?.toIntOrNull() ?: 0
        checkStylishness(inputYourPartnerStylishness)
    }

    val resultFashionTable = fashionTable(inputYourStylishness, inputYourPartnerStylishness)
    fashionResponse(resultFashionTable)
}

fun checkStylishness(stylishness: Int): Boolean {
    return stylishness in 0..10
}

fun fashionTable(stylishness: Int, partnerStylishness: Int): Int {
    val veryStylishness = 2
    val poorStylishness = 0

    if (stylishness <= 2 || partnerStylishness <= 2) {
        return poorStylishness
    } else if (stylishness >= 8 || partnerStylishness >= 8) {
        return veryStylishness
    }

return 1
}

fun fashionResponse(fashionTableResult: Int) {
    when (fashionTableResult) {
        0 -> println("no")
        1 -> println("maybe")
        2 -> println("yesssssssssss")
    }
}