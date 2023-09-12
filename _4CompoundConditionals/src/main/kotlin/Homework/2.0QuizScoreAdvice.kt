package Homework

/**
 * Quizzes are a chance to test what you know and how your understanding of the course content is developing. If you do poorly on a quiz, please approach the course staff for help!
 * We can help get you back on track, but the sooner we know, the better.
 *
 * However, please don't misinterpret your quiz score! Writing code in a proctored environment is difficult, and it's normal to make small mistakes. If you miss one of the
 * programming questions due to a small error that you couldn't fix in time, that's usually OK, and not a sign of trouble. If you miss a programming question because you had no
 * idea how to approach it or the concepts involved, that might be a sign of trouble. Reach out to us!
 *
 * Let's write a snippet of code that, given a quiz score in the int variable quizScore, prints out a suggestion about how to interpret that score:
 *
 * If the score is below 70, print "You should reach out to the course staff".
 * If the score is between 70 and 90, print "Nice job, and you can probably do better next time"
 * If the score is above 90, print "Great job"
 */

fun main() {
    val quizScore = 90

    if (quizScore < 70) {
        println("You should reach out to the course staff")
    } else if (quizScore < 89 && quizScore >= 70) {
        println("Nice job, and you can probably do better next time")
    } else if (quizScore <= 90) {
        println("Great job")
    }
}