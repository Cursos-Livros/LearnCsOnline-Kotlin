package Practice

/**
In the United States, you are legally an adult once you turn 18 years old. Given an already-declared Int variable age containing a person's age, print "Adult" if they are legally
an adult and "Not Adult" if they are not. However, if an already-declared Boolean variable whisper is true, then don't print anything at all.
 */
fun main() {
    println("Enter the age:")
    val input: String = readLine() ?: ""


    val age = input.toInt()
    if (age >= 18) {
        println("Adult")
    }else{
        println("Not Adult")
    }
}