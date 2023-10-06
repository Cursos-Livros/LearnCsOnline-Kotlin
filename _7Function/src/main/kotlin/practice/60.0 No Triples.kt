package practice

/**
 * Given an IntArray, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.
 */
fun main() {
    println("Enter with the size of array:")
    var sizeArray = readlnOrNull()?.toIntOrNull() ?: 1

    correctSizeArray(sizeArray)

    while (!correctSizeArray(sizeArray)) {
        println("The size array must be bigger than 0")
        println("Enter with the size of array:")
        sizeArray = readlnOrNull()?.toIntOrNull() ?: 1
        correctSizeArray(sizeArray)
    }

    val array = IntArray(sizeArray)

    for (i in array.indices) {
        println("Enter with the number:")
        val inputNumber = readlnOrNull()?.toIntOrNull() ?: 0
        array[i] = inputNumber
    }

    println("Has Triple:")
    println(noTriples(array))
}

fun correctSizeArray(sizeArray: Int): Boolean {
    return sizeArray > 0
}

fun noTriples(array: IntArray): Boolean {
    val newArray = IntArray(array.size + 1)

    for (i in array.indices) {
        newArray[array[i]]++
    }
    return hasTriple(newArray)
}

fun hasTriple(newArray: IntArray): Boolean {
    for (i in newArray.indices) {
        if (newArray[i] == 3) {
            return true
        }
    }
    return false
}