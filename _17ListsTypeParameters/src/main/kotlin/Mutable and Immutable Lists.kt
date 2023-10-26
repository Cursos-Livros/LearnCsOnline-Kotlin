fun main() {
    println("About Imutable List:")
    println("The first list is imutable because is the type listof():")
    val firstList = listOf(1, 2, 3)
    println(firstList)
    println("first[0] = 0 it will be create a error, don't do that.")

    println("Test a function List")
    val secondList = mutableListOf(1, 2, 3)
    val result = testTypemutableListOf(secondList)
    println("Print the sum of all elements in the list:")
    println(result)
}

fun testTypemutableListOf(list: List<Int>): Int {
    var sum = 0
    for (values in list) {
        sum += values
    }
    return sum
}