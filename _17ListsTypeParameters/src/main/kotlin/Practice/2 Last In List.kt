package Practice

/**
 * Write a method named lastInList that accepts a single List<*> of items and returns the last element as an Any?.
 * The list will contain at least one element. Don't overthink this! The solution is a single line of code.
 */
fun main() {
    val list1: MutableList<Any?> = mutableListOf(1, "Olga", 22.0) // Any with nulls
    val list2: MutableList<*> = mutableListOf(1, "Olga", 22.0) // Any without nulls
    val list3 = mutableListOf<String?>() // With null types
    println("List before add elements:")
    println(list1)
    for (i in 1..5) {
        println("Enter with number $i:")
        val inputNumber = readlnOrNull()
        list1.add(inputNumber)
    }

    println("List after add elements:")
    println(list1)

    println("Last Element:")
    println(lastInList(list1))
}

fun lastInList(items: List<*>): Any? = items.last()