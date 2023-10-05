class Solution {
    fun letterCombinations(digits: String): List<String> {
        val letterMap = mapOf (
        '2' to "abc",
        '3' to "def",
        '4' to "ghi",
        '5' to "jkl",
        '6' to "mno",
        '7' to "pqrs",
        '8' to "tuv",
        '9' to "wxyz"
        )
        
        val result = mutableListOf<String>()
        
        fun backtrack(current: String, index: Int) {
        if (index == digits.length) {
            if (current.isNotEmpty()) {
                result.add(current)
            }
            return
        }
        
        val digit = digits[index]
        val letters = letterMap[digit] ?: ""
            
        for (letter in letters) {
            backtrack(current + letter, index + 1)
        }
    }
        
    if (digits.isNotEmpty()) {
        backtrack("", 0)
    }
    
    return result
        
    }
}