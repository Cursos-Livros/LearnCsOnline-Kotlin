package Practice

/**
 * Write a method hasDuplicateValues that, given a Map<String, String>,
 * returns true if the map contains duplicate values—meaning that two different keys map to the same value—and false otherwise.
 * Recall that a map can never contain duplicate keys, since the second mapping from the same key overwrites the first.
 *
 * You should use a Set to solve this problem!
 * And as usual, maps, sets, and lists are all built-in to Kotlin and available for you to use to solve this problem.
 */
fun main() {
    val robotData = mapOf(
        "Atom (Astro Boy)" to "Japan",
        "Brau Tenma" to "Austria",
        "Mont Blanc" to "Switzerland",
        "North No. 2" to "Northern Europe",
        "Gesicht" to "Germany",
        "Hercules" to "Greece",
        "Pluto" to "Unknown",
        "Epsilon" to "Unknown",
        "Dr. Roosevelt" to "Unknown",
    )

    println("Has same region: ${robotDataDuplicated(robotData)}")
}

fun robotDataDuplicated(robotData: Map<String, String>): Boolean {
    val listAllRegions = createListRegions(robotData)
    val listSetAllRegions = createSetRegions(listAllRegions)
    println(listAllRegions)
    println(listSetAllRegions)
    return listAllRegions.size != listSetAllRegions.size
}

fun createListRegions(robotList: Map<String, String>): MutableList<String> {
    val listRegion = mutableListOf<String>()
    for ((Key, value) in robotList) {
        listRegion.add(value)
    }
    return listRegion
}

fun createSetRegions(regionList: MutableList<String>): MutableSet<String> {
    val setRegion = mutableSetOf<String>()

    for(region in regionList){
        setRegion.add(region)
    }

    return setRegion
}