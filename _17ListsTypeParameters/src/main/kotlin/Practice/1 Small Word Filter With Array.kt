package Practice

/**
 * Write a method called smallWordFilter that, given a String containing words separated by single spaces (" "),
 * returns all the words in the original String that are 3 characters or shorter in the same order in which they
 * appeared in the original String, as an Array<String>.
 *
 * For example, given the input "Xyz is the very best cat" you would return the Array<String> {"Xyz", "is", "the", "cat"}.
 * We have skipped both "very" and "best" because they are longer than 3 characters.
 *
 * This is a problem that would be much easier to solve using a list,
 * since you don't know exactly how many part of the input String are 3 characters or smaller!
 * But this can be done with an array, if somewhat awkwardly.
 * Here's a solution sketch to help you get started:
 *
 * Split the array based on the single space " "
 * Next, count the number of parts of the String that are 3 characters or smaller
 * Now create your Array<String> of the appropriate size, initialized with empty Strings
 * And then loop again through the array of String parts filling your output array as you go
 * We've provided some starter code to help you get going on this problem.
 */
fun main() {
    val string = "Olga Maria dos Santos Goncalves ama Abby e a Alloy"

    println(smallWordFilter(string))
}

fun smallWordFilter(string: String): MutableList<String> {
    val stringParts = string.split(' ')
    var string = ""
    val listNames = mutableListOf<String>()
    for (words in stringParts) {
        if (words.length >= 4) {
            listNames.add(words)
        }
    }
    return listNames
}