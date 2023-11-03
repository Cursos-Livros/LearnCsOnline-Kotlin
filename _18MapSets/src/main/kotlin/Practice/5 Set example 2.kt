package Practice

fun main() {
    val attendance =
        """Gojo Satoru 
            Megumi Fushiguro,
            Megumi Fushiguro,
            Nanami Kento,
            Sukuna Ryoumen,
            SUKUNA Ryoumen,
            Satoru GOJO,
            Toji Fushiguro,
            Toji Fushiguro,
            Toge Inumaki"""

    println(computeAttendance(attendance))


}

fun computeAttendance(attendance: String): MutableSet<String> {
    val set = mutableSetOf<String>()

    for (person in attendance.replace(",", "").split('\n')) {
        var name = person.trim().lowercase()
        set += name
    }

    return set
}