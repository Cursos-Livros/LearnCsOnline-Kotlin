package practice

/**
 * Let's write a method to print a set of letter grades based on numeric scores. Create a method named printLetterGrades that accepts a DoubleArray.
 * If the array is empty, don't print anything.
 *
 * Otherwise, for each value in the array, print a line to the console in the following format:
 *
 * Student 1,B,3.3
 * The first value is in the format "Student N", where N is the index in the array but starting at 1.
 * So the first student is "Student 1", the second "Student 2", and so on. (0-based indexing tends to confuse people who aren't computer scientists.)
 *
 * The second value is the student's letter grade based on the following scale:
 *
 * >= 4.0: A
 * > 3.0 && <= 4.0: B
 * > 2.0 && <= 3.0: C
 * > 1.0 && <= 2.0: D
 * otherwise, F
 * You can assume that values in the array will be between 0.0 and 5.0, inclusive.
 *
 * The third value is the student's raw score.
 *
 * You should also print "--- GRADES START ---" at the beginning and "--- GRADES END ---" at the end, each on their own line.
 */
fun main() {
    println("Letter Grade Printout")

    println("Enter with the size of array:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    while (!correctSizeArray7(sizeArray)) {
        println("The size array must be int the range 1 .. 3")
        println("Enter with the size of array again:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray7(sizeArray)
    }

    val studentsGrade = DoubleArray(sizeArray)

    for (i in studentsGrade.indices) {
        println("Enter with the number:")
        var inputNumber = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        if (checkNote2(inputNumber)) {
            studentsGrade[i] = inputNumber
        } else {
            println("The number is not in range >= 0 and <= 100:")
            while (!checkNote2(inputNumber)) {
                inputNumber = readlnOrNull()?.toDoubleOrNull() ?: 0.0
                checkNote2(inputNumber)
            }
        }
    }

    if (studentsGrade.isNotEmpty()) {
        for (i in studentsGrade.indices) {
            println("Student ${i + 1}, ${letterGrade(studentsGrade[i])} , ${studentsGrade[i]}")
        }
    }
}

fun correctSizeArray7(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun checkNote2(inputNumber: Double): Boolean {
    return inputNumber in 0.0..5.0
}

fun letterGrade(studentsGrade: Double): Char {
    return when (studentsGrade) {
        in 4.1..5.0 -> 'A'
        in 3.1..4.0 -> 'B'
        in 2.1..3.0 -> 'C'
        in 1.1..2.0 -> 'D'
        else -> 'F'
    }
}