package Practice


import java.text.SimpleDateFormat
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter
import java.util.*


/**
 * Complete the method below formatDate.
 * It should accept a positive Long representing milliseconds since 1970 and return a String containing the ISO-8601 representation of this time.
 * Here is one example for a recent timestamp: given 1602106609897 your function should return "2020-10-07T21:36:49.897Z".
 *
 * Do not overthink this.
 * The solution we are after is a single line of code.
 * We suggest that you explore the various built-in Java libraries for working with dates and times.
 *
 * We have provided starter code so that you can tell where the import statements should go. Ignore the class Question stuff, since we haven't covered that yet.
 */
fun main() {
    val timeStamp = 1602106609897
    println(formatDate(timeStamp))
    println(simpleFormatDate(timeStamp))
}

fun simpleFormatDate(timeStamp: Long): String? {
    return SimpleDateFormat("dd-MM-yyyy'T'HH:mm:ss.SSS'Z'").format(Date(timeStamp))
}

fun formatDate(timestamp: Long): String {
    return Instant.ofEpochMilli(timestamp)
        .atOffset(ZoneOffset.UTC)
        .format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'"))
}