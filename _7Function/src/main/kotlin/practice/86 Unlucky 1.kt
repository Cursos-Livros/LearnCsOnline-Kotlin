package practice

/**
 * We'll say that a 1 immediately followed by a 3 in an array is an unlucky 1
 * . Return true if the given IntArray contains an unlucky 1 in the first 2 or last 2 positions in the array.
 * The array may be any size.
 */
fun main() {

    fun main() {
        val array1 = intArrayOf(1, 3, 4, 5)
        val array2 = intArrayOf(2, 1, 3, 4)
        val array3 = intArrayOf(1, 3, 1, 4)
        val array4 = intArrayOf(1, 3)

        println(hasUnlucky1(array1)) // true
        println(hasUnlucky1(array2)) // false
        println(hasUnlucky1(array3)) // true
        println(hasUnlucky1(array4)) // true
    }
}

fun hasUnlucky1(nums: IntArray): Boolean {
    val lastIndex = nums.size - 1

    if (nums.size >= 2 && (nums[0] == 1 && nums[1] == 3)) {
        return true
    }
    
    if (nums.size >= 2 && (nums[lastIndex - 1] == 1 && nums[lastIndex] == 3)) {
        return true
    }

    return false
}