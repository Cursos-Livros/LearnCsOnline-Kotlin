fun main(args: Array<String>) {
    println("List 1")
    val list = mutableListOf(1, 2, 3)
    println(list)
    println("List 1 after add 7 on the index 0:")
    list[0] = 7
    println(list)

    // Empty list cause error - because its not possible infer the type
    //val list2 = mutableListOf()

    println()

    // Fix the error above:
    val list3 = mutableListOf<Int>()
    println("List3 before append:")
    println(list3)
    list3 += 1 // this is append (ptBr: Acrescentar)
    println("List 3 after append:")
    println(list3)

    println()

    // Appending more numbers
    val list4 = mutableListOf<String>()
    println("List 4 before append:")
    println(list4)
    list4 += "1"
    list4 += "3"
    list4 += "5"
    println("List 4 after append:")
    println(list4)
}