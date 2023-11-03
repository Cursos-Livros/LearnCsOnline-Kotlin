fun main() {
    var score = """you@illinois.edu,0
                   you@illinois.edu,9
                   me@illinois.edu,0
                   you@illinois.edu,10 
                   you@illinois.edu,1
                   me@illinois.edu,1
                   me@illinois.edu,0
                   you@illinois.edu,0"""

    var map = computeScores(score)
}

fun computeScores(score: String): Map<String, Int> {
    var map = mutableMapOf<String, Int>()

    for (line in score.trim().split('\n')) {
        var parts = line.split(',')
        var email = parts[0]
        var score = parts[1].toInt()
        if (score > (map[email] ?: 0)) {
            map[email] = score
        }
    }
    return map
}