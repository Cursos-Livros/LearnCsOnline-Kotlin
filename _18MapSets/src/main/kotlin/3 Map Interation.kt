fun main() {
    var map = mutableMapOf(1 to "one", 2 to "two", 4 to "four")

    for (entry in map) {
        // each entry has a .key and a .value property
        println(entry.key)
        println(entry.value)
    }

// new syntax that we haven't discussed yet
    for ((key, value) in map) {
        println(key)
        println(value)
    }

// map.keys will be a list of all the map keys, similar to .indices
    for (key in map.keys) {
        println(key)
        println(map[key])
    }
}