class Solution {
    fun romanToInt(s: String): Int {
        val romanValues = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
        
    var total = 0
    var prevValue = 0

    for (symbol in s) {
        val value = romanValues[symbol] ?: 0
        if (value > prevValue) {
            total += value - 2 * prevValue
        } else {
            total += value
        }
        prevValue = value
    }

    return total
    }
}