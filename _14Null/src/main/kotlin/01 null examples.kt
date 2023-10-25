fun main(args: Array<String>) {
    // String can contain null has ?
    var value: String? = "Testing"
    println(value)
    value = null
    println(value)

    var value2: Int? = 5
    value = null
    println(value2)

    var first = 3 // Inferred type is Int, non-nullable
    var second: Int? = 5 // Inferred type is Int?, nullable
    //first = null // fails mull problem
    second = null // OK


}