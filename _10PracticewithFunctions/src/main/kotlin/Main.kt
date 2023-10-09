fun main(args: Array<String>) {
    var values = intArrayOf(1, 2, 4)

// Indexed for
    var count = 0
    for (i in values.indices) { // Extra variable i
        if (values[i] > 1) { // must use bracket notation
            count++
        }
    }
    println(count)

// for in
    count = 0
    for (value in values) { // No i needed for this problem
        if (value > 1) { // No bracket notation!
            count++;
        }
    }
    println(count)
}