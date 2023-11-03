fun main(args: Array<String>) {
    println("First mutable list:")
    var map = mutableMapOf<String, String>()
    println(map)

    println()

    println("Second mutable list with parameter String inferred:")
    var map2 = mutableMapOf(1 to "One", 2 to "two")
    println(map2)

    println()

    println("Third mutable list with parameter:")
    var map3 = mutableMapOf<String, String>()
    map3["Jose"] = "Augusto"
    map3["Olga"] = "Goncalves"
    println(map3)
    println("Test add key to new value:")
    map3["Jose"] = "Valim"
    println(map3)

    println()

    println("Fourth mutable list:")
    val map4 = mutableMapOf<String, String>()
    map4["Olga"] = " A Student"
    map4["Maria"] = " A Student"
    println(map4)

    println()

    println("Fifth mutable list:")
    var map5 = mutableMapOf<String, String>()
    map5["Jose"] = "Augusto"
    map5["Olga"] = "Valim"
    println(map5["Jose"])
    println(map5["student1"])
}