package practice

fun main() {
    val board = arrayOf(
        charArrayOf('X', 'O', 'X'),
        charArrayOf('X', 'X', 'O'),
        charArrayOf('X', 'X', 'O')
    )

    val result = gameOver(board)
    println(result)
}

fun gameOver(board: Array<CharArray>): String {
    // Checking Tie
    for (row in board) {
        for (cell in row) {
            if (cell == ' ') {
                return "Not Over!"
            }
        }
    }

    for (i in 0 until 3) {
        // Checking row
        if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != ' ') {
            return "${board[i][0]} wins!"
        }

        // Checking columns
        if (board[0][i] == board[1][i] && board[1][i] == board[2][i] && board[0][i] != ' ') {
            return "${board[0][i]} wins!"
        }

        // Checking diagonal
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
            return "${board[0][0]} wins!"
        }
        if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
            return "${board[0][0]} wins!"
        }
    }

    return "Tie"
}

