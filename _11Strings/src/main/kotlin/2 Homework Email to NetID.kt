/**
 * Write a function called emailToNetID.
 * It should take a String containing an @illinois.edu email
 * like hello@illinois.edu and return the NetID, which in this case would be "hello",
 * as a String.
 * You can assume that the passed String will contain a single @ character.
 * And you should require that the passed String ends with @illinois.edu.
 *
 * You will want to explore the various String methods to help you with this task, particularly split.
 */
fun main() {
    println("Enter with the valid email: name@illinois.edu")
    var inputEmail = readlnOrNull() ?: "hello@illinois.edu"


    while (!countArroba(inputEmail)) {
        messageErrorArroba()
        inputEmail = readlnOrNull() ?: "hello@illinois.edu"
        countArroba(inputEmail)
    }

    while (!testFinal(inputEmail)) {
        messageErrorArroba()
        inputEmail = readlnOrNull() ?: "hello@illinois.edu"
        countArroba(inputEmail)
    }

   println("Your NetId: ${returnNetID(inputEmail)}")
}

fun countArroba(email: String): Boolean {
    var count = 0
    for (char in email) {
        if (char == '@') {
            count++
        }
    }
    return justOne(count)
}

fun justOne(count: Int): Boolean {
    return count == 1
}

fun messageErrorArroba() {
    println("Wrong email!")
    println("Enter name @illinois.edu format please")
}

fun testFinal(email: String): Boolean {
    val emailArray = email.split('@')
    return emailArray[1] == "illinois.edu"
}

fun messageErrorFinal(){
    println("Wrong email!")
    println("Enter name @illinois.edu format please")
}

fun returnNetID(email: String): String {
    val netID = email.split('@')
    return netID[0]
}

// Another version

//fun main() {
//    println("Enter a valid email: name@illinois.edu")
//    var inputEmail = readlnOrNull() ?: "hello@illinois.edu"
//
//    while (!isValidEmail(inputEmail)) {
//        println("Invalid email format. Please enter a valid email in the format name@illinois.edu")
//        inputEmail = readlnOrNull() ?: "hello@illinois.edu"
//    }
//
//    println("Your NetId: ${extractNetID(inputEmail)}")
//}
//
//fun isValidEmail(email: String): Boolean {
//    return email.count { it == '@' } == 1 && email.endsWith("@illinois.edu")
//}
//
//fun extractNetID(email: String): String {
//    return email.split('@')[0]
//}