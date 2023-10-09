fun main() {
    printCount(5)
    printCount(8)
}

fun printCount(count: Int) {
    println("The count is $count")
    if (count % 2 == 0) {
        return
    }
    println("Count is odd")
}