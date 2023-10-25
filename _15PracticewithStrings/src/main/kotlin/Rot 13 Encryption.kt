fun main(args: Array<String>) {
    println(encrypt("test"))
}

fun encrypt(inputString: String): String {
    var characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz "

    var output = ""
    for (character in inputString) {
        var position = characters.indexOf(character)
        position = (position + 1) % characters.length
        output += characters[position]
    }
    return output
}