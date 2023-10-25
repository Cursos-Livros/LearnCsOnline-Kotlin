package Practice

import java.text.SimpleDateFormat
import java.util.Date;

/**
 * Complete the method below called compareDates that, given two Strings containing datetimes in ISO-8601 format,
 * returns -1 if the first time is before the second, 1 if the second is before the first, and 0 if they are equal.
 *
 * When you are done, here is how your method should work:
 *
 * You will want to approach this in two steps. First, convert each String into some kind of datetime representation.
 * We suggest that you explore the various built-in Java libraries for working with dates and times. Don't attempt to do this yourself!
 *
 * Next, use the resulting object to compare the two datetimes.
 * We might suggest that you explore the java.time.Instant class and its parse and other methods.
 * We have provided some starter code so that you can identify where the import statements should go.
 * Ignore the class Question stuff, since we haven't covered that yet.
 */
fun main() {

    println(compareDates("2021-09-15T00:00:00.000Z", "2021-09-16T00:00:00.000Z"))
}

fun compareDates(date: String, date2: String): String {
    val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");

    val date1 = dateFormat.parse(date)
    val date2 = dateFormat.parse(date2)

    val result = date1.compareTo(date2)

    if (result < 0) {
        return "Date 1 is before date 2"
    } else if (result == 0) {
        return "Date 1 is equal date 2"
    } else {
        return "Date 1 is after date 2"
    }
}