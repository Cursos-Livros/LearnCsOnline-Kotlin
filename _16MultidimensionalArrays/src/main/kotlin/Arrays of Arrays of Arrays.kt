fun main() {
    var twod = arrayOfNulls<IntArray>(2)
    println(twod[0])
    var oned = IntArray(8)
    println(oned.contentToString())
    twod[1] = oned

    var twod2 = arrayOfNulls<IntArray>(2)
    var oned2 = IntArray(8)
    twod2[1] = oned
    twod2[0] = IntArray(4)
    println(twod2.size)
    println(twod2[0]?.size) // Note the safe call operator here!
    println(twod2[1]?.size)
}