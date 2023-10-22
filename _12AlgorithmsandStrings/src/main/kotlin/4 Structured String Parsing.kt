fun main() {
    var data = """2020-09-02,5402
2020-09-03,12042
2020-09-04,4637
2020-09-05,89054
2020-09-06,2033
2020-09-07,10238
2020-09-08,76452
2020-09-09,8902"""

    var maxDay = ""
    var maxCount = 0
    for (line in data.lines()) {
        var parts = line.split(",")
        var day = parts[0]
        var count = parts[1].toInt()
        if (count > maxCount) {
            maxDay = day
            maxCount = count
        }
    }
    println(maxDay)
}