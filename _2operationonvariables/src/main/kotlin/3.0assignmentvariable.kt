fun main() {
    var i = 1
    i = i + 1
    println(i)

    // 1 method
    var dollars = 0
    // Call parents
    dollars = dollars + 100
    // Phew...
    println(dollars)

    // 2 method
    // Call parents
    dollars += 100
    // Phew...
    println(dollars)

    // 3 method
    // Call parents
    dollars += 1
    // WTF?
    println(dollars)
    // Call parents again
    dollars++
    println(dollars)
    // ...
}