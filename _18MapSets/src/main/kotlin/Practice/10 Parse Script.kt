package Practice

/**
 * Write a method called parseScript that accepts a single String and returns a Map<String, MutableList<String>>.
 * The passed String contains a script consisting of lines separated by newlines, each with the following format:
 *
 * Name: Line
 * For example, here's a simple script:
 *
 * Geoffrey: What do you think of this homework problem?
 * Ahmed: it's a bit sus
 * Geoffrey: I bet they'll be able to figure it out!
 * Maaheen: We'll be here to help if they need it.
 * Maaheen: We'll be here to help if they need itiiii.
 * parseScript parses the script and returns a map mapping each character's name to their lines in order.
 * So, for the script above, the map would contain three keys: "Geoffrey", "Ahmed", and "Maaheen".
 * The List<String> for the key "Geoffrey" would contain the Strings "What do you think of this homework problem!"
 * and "I bet they'll be able to figure it out!" The List<String> for the key "Amhed" would contain the String "it's a bit sus".
 *
 * A few hints for approaching this problem.
 *
 * You'll want to use .split to parse the passed String into individual lines. All lines will have the format shown above.
 *
 * You'll also need to use .split to split each line into the name and their line of dialog. You can assume that the character ":"
 * only appears to delimit the name of the rest of the line.
 *
 * The first time you encounter a character, there will not be an entry in your map for them. So you should check for this,
 * and create the list when appropriate.
 *
 * There may be extra whitespace around the name or the line of dialogue, so use .trim appropriately.
 *
 * You should not need to use any import statements to solve this problem. Instead, use mutableMapOf()
 * and mutableListOf() to create mutable maps and lists when needed.
 */
fun main() {
    val script = """ 
        Geoffrey: What do you think of this homework problem?
        Ahmed: it's a bit sus
        Geoffrey: I bet they'll be able to figure it out!
        Maaheen: We'll be here to help if they need it.
        Maaheen: We'll be here to help if they need itiiii.
        """

    val takeLines = script.split('\n')
    val getNames = nameSeparator(takeLines)
    val getScript = scriptSeparator(takeLines)
    val newScript = parseScript(getNames, getScript)

    println(newScript)
}

fun nameSeparator(scriptName: List<String>): MutableList<String> {
    val listName = mutableListOf<String>()
    for (line in scriptName) {
        var name = line.trim().substringBefore(':')
        listName.add(name)
    }
    return listName
}

fun scriptSeparator(scriptPhrases: List<String>): MutableList<String> {
    val listScript = mutableListOf<String>()
    for (line in scriptPhrases) {
        var phrase = line.trim().substringAfter(':')
        listScript.add(phrase)
    }
    return listScript
}

fun parseScript(names: List<String>, scriptPhrases: List<String>): MutableMap<String, MutableList<String>> {
    val mapScript = mutableMapOf<String, MutableList<String>>()

    for (i in names.indices) {
        val name = names[i]
        val phrase = scriptPhrases[i]

        if(name != "") {
            if (name in mapScript) { // The name exist on the mapscript?
                mapScript[name]?.add(phrase)
            } else {
                mapScript[name] = mutableListOf(phrase)
            }
        }
    }

    return mapScript
}

