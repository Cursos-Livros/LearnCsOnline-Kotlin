package practice

/**
 * Create a method named catchupGrading that accepts an array of Double values and implements the following catch-up grading policy.
 * Given a score on Quiz N, if a student does better on the next quiz (Quiz N + 1), then you should replace their score on Quiz N
 * with the average of their score on Quiz N and their score on Quiz N + 1. Otherwise, their score on Quiz N is unchanged.
 * Return the number of times that the student does strictly better on the next quiz than they did on the previous one.
 *
 * Scores are stored in the array in order. So, given an array with the scores {100.0, 80.0, 90.0},
 * you would modify the array to contain {100.0, 85.0, 90.0}, and return 1.
 *
 * A few hints about how to approach this problem. You'll want to use a loop to go through each pair of scores in the array,
 * so in the loop you'll be examining both one quiz and the next. This loop is similar to but a bit different from the one that we're used to writing.
 * Your function should modify the values in the passed array.
 */

fun main() {
    println("Enter with the size of array:")
    val sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    val scoreArray = DoubleArray(sizeArray)

    for (i in scoreArray.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toDoubleOrNull() ?: 0.0
        scoreArray[i] = inputNumber
    }

    val result = catchupGrading(scoreArray)

    println(result.contentToString())
}

fun catchupGrading(scoreArray: DoubleArray): DoubleArray {
    for (i in scoreArray.indices) {
        if (i < scoreArray.size - 1) {
            if (scoreArray[i] < scoreArray[i + 1]) {
                val currentScore = scoreArray[i]
                val nextScore = scoreArray[i + 1]
                scoreArray[i] = (currentScore + nextScore) / 2
            }
        }
    }

    return scoreArray
}