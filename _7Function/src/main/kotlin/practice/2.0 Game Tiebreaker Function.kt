package practice

/**
 * Two players have completed a game. Write a method (or function) named whoWon to determine the winner!
 *
 * whoWon receives three parameters in the following order: the score of the first player as an Int, the score of the second player as an Int, and whether the first player played
 * first as a Boolean.
 *
 * If either player scored more points than the other, they are the winner! However, if both players tie, then the player that played second is the winner.
 *
 * Return the result of the game as an Int. You should return 1 if Player 1 won and 2 if Player 2 won.
 *
 * If you have solved this problem previously without writing a method, you may reuse your old code! However, you may try to eliminate the winner variable that we used previously.
 */
fun main() {
    println("Enter the score of the first player")
    val input = readLine() ?: ""
    val first = input.toInt()

    println("Enter the score of the second player")
    val input2 = readLine() ?: ""
    val second = input2.toInt()

    whoWon(first, second)
}

fun whoWon(scorePlayer1: Int, scorePlayer2: Int) {
    if (scorePlayer1 > scorePlayer2) {
        println("Player 1 win")
    } else if (scorePlayer1 < scorePlayer2) {
        println("Player 2 win")
    } else {
        println("Draw")
    }
}