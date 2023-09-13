fun main() {
    var  i = 0
    while (i < 8) {
        println(i)
        i++
    }

    // Variants
    // Includes the endpoint. Compare with until
    for (i in 0..8) {
        println(i)
    }

    // Starting at 8, ending at 88, up by 10
    for (i in 8 until 88 step 10) {
        println(i)
    }

    // Starting at 16, ending at 0, down by 4
    for (i in 16 downTo 0 step 4) {
        println(i)
    }

    var limit = 16
    for (i in 0 until limit) {
        println(i)
    }
}