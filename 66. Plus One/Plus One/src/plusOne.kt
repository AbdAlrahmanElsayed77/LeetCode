fun main() {
    fun plusOne(digits: IntArray):IntArray{
        val n = digits.size
        for (i in n - 1 downTo 0) {
            if (digits[i] < 9) {
                digits[i]++
                return digits
            }
            digits[i] = 0
        }
        val result = IntArray(n + 1)
        result[0] = 1
        return result
    }

    val digits1 = intArrayOf(1, 2, 3)
    val result1 = plusOne(digits1)
    println(result1.joinToString(", "))
}