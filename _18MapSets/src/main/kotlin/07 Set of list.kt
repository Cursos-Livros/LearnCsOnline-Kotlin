fun main() {
    var first = mutableListOf("test", "me")

    var second = mutableListOf<String>()
    second += "test"
    second += "me"
    second += "me"

    var set = mutableSetOf<List<String>>()
    set += first
    println(set)
    set += second
// Because first and second have the same items, adding second does not modify the set
    println(set)
}