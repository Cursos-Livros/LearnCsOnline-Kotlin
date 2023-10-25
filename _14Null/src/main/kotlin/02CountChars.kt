fun main() {
    //count Characters with null
    fun countCharacters(input: String?, toCount: Char?): Int {
        // Sanitizing our inputs
        if (input == null || toCount == null) {
            return 0
        }
        // Actual algorithm
        var count = 0
        for (character in input.toCharArray()) {
            if (character == toCount) {
                count++
            }
        }
        return count
    }
    println(countCharacters("XX", 'X'))
}