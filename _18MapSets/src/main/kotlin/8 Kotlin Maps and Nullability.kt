fun main() {
    var map = mutableMapOf<String, Int>("test" to 1)
    map["test"] = map["test"]!! + 1
    println(map)
}