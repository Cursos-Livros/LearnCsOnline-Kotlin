package Practice

/**
 * Write a method called sectionListsToMap that, given a List of Strings, parses it into a Map<String, MutableSet<String>> as follows.
 * Each String in the passed list contains a comma-separated list of names of people in a discussion section.
 * The first name is the section leader, and the rest are students.
 * Your map should map each section leader to the set of students in their section.
 * No section leader or student will appear twice in the data set.
 *
 * For example, given the Strings "challen,student1", "ruisong4,student2, student3" and "friendly,student4, student5",
 * your map would have keys "challen", "ruisong4", and "friendly". "challen" would map to a set containing "student1",
 * "ruisong4" would map to a set containing "student2" and "student3", and so on.
 *
 * A few hints for approaching this problem. First, consider how to use .split and .trim appropriately to parse the input String.
 * You should get this part to work before proceeding. Then consider when you need to create the map and each set, and how to populate them.
 *
 * You should not need import statements to solve this problem. Rather, create your maps and sets using mutableMapOf() and mutableSetOf() where appropriate.
 */
fun main() {
    val string = """
                           challen,student1
                           ruisong4,student2, student3
                           friendly,student4, student5
                        """.trimMargin()
    val lineString = separatedLines(string)
    val getName = nameSeparator(lineString)
    val substring = substringSeparator(lineString)
    val sectionListsToMap = joinMapList(getName, substring)
    println(sectionListsToMap)
}

fun separatedLines(string: String): MutableList<String> {
    val listStrings = mutableListOf<String>()
    for (line in string.split("\n")) {
        listStrings.add(line)
    }
    return listStrings
}

fun nameSeparator(lineString: MutableList<String>): MutableList<String> {
    val listName = mutableListOf<String>()
    for (line in lineString) {
        val name = line.substringBefore(',').trim()
        listName.add(name)

    }
    return listName
}

fun substringSeparator(lineString: MutableList<String>): MutableList<String> {
    val listSubstring = mutableListOf<String>()
    for (line in lineString) {
        val phrase = line.substringAfter(',',"")
        listSubstring.add(phrase)
    }
    return listSubstring
}

fun joinMapList(name: MutableList<String>, substring: MutableList<String>): MutableMap<String, MutableSet<String>> {
    val mapList = mutableMapOf<String, MutableSet<String>>()
    for (i in name.indices) {
        val nameIndex = name[i]
        val substringIndex = substring[i]

        if (nameIndex in mapList) {
            mapList[nameIndex]?.add(substringIndex)
        } else {
            mapList[nameIndex] = mutableSetOf(substringIndex)
        }
    }
    return mapList
}

