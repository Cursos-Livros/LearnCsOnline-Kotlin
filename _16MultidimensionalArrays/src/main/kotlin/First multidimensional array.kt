fun main(args: Array<String>) {
    // First way
    var values = Array(8) { IntArray(8) }
    println(values[0][0])
    values[0][0] = 1
    println(values[0][0])

    var pixels = Array(32) { IntArray(32) }
    for (i in pixels.indices) {
        for (j in pixels[i].indices) {
            pixels[i][j] = i + j
        }
    }
    println(pixels[8][18])
}