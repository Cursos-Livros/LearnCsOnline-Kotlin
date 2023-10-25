fun main() {
    var value = Array(3) { Array(3) { IntArray(3) } }

    var values = Array(8) { Array(4) { IntArray(2) } }
    println(values[4][2][1])
    values[2][2][1] = 10
    println(values[2][2][1])


}