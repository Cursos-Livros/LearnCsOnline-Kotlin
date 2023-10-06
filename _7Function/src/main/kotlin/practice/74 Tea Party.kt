package practice

/**
 * We are having a party with amounts of tea and candy.
 * Return the outcome of the party encoded as as in Int where 0=bad, 1=good, or 2=great.
 * A party is good if both tea and candy are at least 5.
 * However, if either tea or candy is at least double the amount of the other one, the party is great.
 * However, in all cases, if either tea or candy is less than 5, the party is always bad.
 */

fun main() {
    println("Result of Tea and Candy Party:")

    println("Enter grade of Candy:")
    var inputGradeCandy = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (valueGradeTest(inputGradeCandy)) {
        println("The grade of candy is less than 0!")
        println("Enter grade of candy again:")
        inputGradeCandy = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        valueGradeTest(inputGradeCandy)
    }

    println("Enter grade of tea:")
    var inputGradeTea = readlnOrNull()?.toDoubleOrNull() ?: 0.0

    if (valueGradeTest(inputGradeTea)) {
        println("The grade of tea is less than 0!")
        println("Enter grade of tea again:")
        inputGradeTea = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        valueGradeTest(inputGradeTea)
    }

    gradeTable(inputGradeCandy, inputGradeTea)
}

fun valueGradeTest(grade: Double): Boolean {
    return grade < 0
}

fun gradeTable(gradeCandy: Double, gradeTea: Double) {
    if (gradeCandy < 5 && gradeTea < 5) {
        println("Bad Party!")
    }
    if (gradeCandy >= 5 && gradeTea >= 5) {
        println("Good Party!")
    }

    if (gradeCandy == gradeTea * 2) {
        println("Great Party!")
    } else if (gradeTea == gradeCandy * 2) {
        println("Great Party!")
    }
}