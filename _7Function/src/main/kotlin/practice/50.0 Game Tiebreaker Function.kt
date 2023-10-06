package practice

/**
 * Two players have completed a game. Write a method (or function) named whoWon to determine the winner!
 *
 * whoWon receives three parameters in the following order: the score of the first player as an Int, the score of the second player as an Int,
 * and whether the first player played first as a Boolean.
 *
 * If either player scored more points than the other, they are the winner! However, if both players tie, then the player that played second is the winner.
 *
 * Return the result of the game as an Int. You should return 1 if Player 1 won and 2 if Player 2 won.
 *
 * If you have solved this problem previously without writing a method, you may reuse your old code! However,
 * you may try to eliminate the winner variable that we used previously.
 */
fun main() {
    println("Enter score the player 1:")
    val inputScorePlayer1 = readlnOrNull()?.toIntOrNull() ?: 0
    val score1 = inputScorePlayer1

    println("Enter score the player 2:")
    val inputScorePlayer2 = readlnOrNull()?.toIntOrNull() ?: 0
    val score2 = inputScorePlayer2

    println("Who play first: 1 or 2 please")
    var inputWhoPlayFirst = readlnOrNull()?.toIntOrNull() ?: 0


    while (!whoPalyFirstTest(inputWhoPlayFirst)) {
        println("Who play first: 1 or 2 please")
        inputWhoPlayFirst = readlnOrNull()?.toIntOrNull() ?: 0
        whoPalyFirstTest(inputWhoPlayFirst)
    }

    val result = whoWon(inputScorePlayer1, inputScorePlayer2, inputWhoPlayFirst)

    println("Who won is Player${result}")
}

fun whoPalyFirstTest(inputWhoPlayFirst: Int): Boolean {
    return inputWhoPlayFirst == 1 || inputWhoPlayFirst == 2
}

fun whoWon(scorePlayer1: Int, scorePlayer2: Int, whoPlayFirst: Int): Int {
    if (scorePlayer1 == scorePlayer2) {
        return whoPlayFirst
    }

    return if (scorePlayer1 > scorePlayer2) {
        1
    } else {
        2
    }
}

