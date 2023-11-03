fun main() {
    var set = mutableSetOf<Int>()

    set.add(1)
    println("Elements after add:")
    println(set)

    set += 1 //Same as set.add(1)

    println("Elements after add +=1:")
    println(set)

    set += 2

    println("Elements after add +=2:")
    println(set)

    // Contains method
    println(set.contains(2))

    // Set Iteration
    println("Set iteration:")
    for (item in set) {
        println(item)
    }

    println("Removing 1 of the list of set:")
    set.remove(1)
    println(set)

    println("Removing 2 of the list of set:")
    set-=2 //Same as set.remove(2)
    println(set)
}