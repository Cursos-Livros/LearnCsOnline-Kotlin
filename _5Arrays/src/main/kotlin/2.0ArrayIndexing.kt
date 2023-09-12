fun main() {
    var temperatures = DoubleArray(12)
    println(temperatures[0])
    temperatures[0] = 78.8
    println(temperatures[0])

    var results2 = BooleanArray(4)
    println(results2[0])
    results2[0] = true
    println(results2[0])

    var results3 = BooleanArray(4)
    println(results3[1])
    results3[1] = true
    println(results3[1])

    var results4 = BooleanArray(4)
    println(results4[3])
    results4[3] = true
    println(results4[3])
}