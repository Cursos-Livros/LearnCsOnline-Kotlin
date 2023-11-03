fun main() {
    var values = mutableListOf<MutableMap<String, String>>()
    var entry = mutableMapOf<String, String>()
    entry["test"] = "me"
    values += entry
    println(values)
}