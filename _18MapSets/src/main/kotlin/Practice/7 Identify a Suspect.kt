package Practice

/**
 * There was a theft of research hardware on campus last night.
 * Based on eyewitness accounts, they figured out the suspect went through the Siebel Center for Computer Science,
 * the Digital Computing Laboratory, and the Illini Union.
 * Luckily, you have the lists of the people who entered each building from their I-Card ID swipes.
 *
 * You've been given three Set<String>s that represent the lists of people that entered each building yesterday.
 * Your job is to create a function called calculateSuspects that when given these parameters returns the list of suspects as a Set<String>.
 * This list should consist of all the names of all people who are included in at least two of the Sets.
 *
 * You may find reading the documentation for intersect (intersection) helpful.
 *
 * Readings:
 *
 * How a professor uses student-ID card data to help predict dropouts (AZ Central):
 * A University of Arizona researcher is using card swipe data to better understand why dropouts happen,
 * and is raising privacy concerns in the process. (5 minute read)
 * Note that you do not need add any import statements to use sets in Kotlin.
 */
fun main() {
    val listSuspects1 = """Dr. Roosevelt,
                            Epsilon,
                            Hercules,
                            Dr. Abullah,
                            Atom"""

    val listSuspects2 = """Pluto,
                            Dr. Tenma,
                            North No. 2,
                            Brau Tenma,
                            Mont Blanc"""

    val listSuspects3 = """Atom,
                            Epsilon,
                            Pluto,
                            North No. 2,
                            Hercules"""

    val listSuspects1Separated = separatedNames(listSuspects1)
    val listSuspects2Separated = separatedNames(listSuspects2)
    val listSuspects3Separated = separatedNames(listSuspects3)

    val resultList = calculateSuspects(listSuspects1Separated, listSuspects2Separated, listSuspects3Separated)

    println(resultList)
}


fun separatedNames(suspectsNames: String): MutableSet<String> {
    val listSuspects = mutableSetOf<String>()
    for (names in suspectsNames.replace(",", "").split('\n')) {
        val nameTrimmed = names.trim()
        listSuspects.add(nameTrimmed)
    }
    return listSuspects
}

fun calculateSuspects(suspects1: MutableSet<String>, suspects2: MutableSet<String>, suspects3: MutableSet<String>): Set<String> {
    val suspects = suspects1.intersect(suspects2)
        .union(suspects2.intersect(suspects3))
        .union(suspects3.intersect(suspects2))
        .union(suspects1.intersect(suspects3))
    return suspects
}