class Solution {
    fun isPalindrome(s: String): Boolean {
        
        // remove chars & convert to lowercase
        val cleaned = s.filter { it.isLetterOrDigit() }.toLowerCase()
        
        // palindrome check
        return isPalindromeStr(cleaned)
    }
    
    fun isPalindromeStr(s: String): Boolean {
        val length = s.length
        for (i in 0 until length / 2) {
            if (s[i] != s[length - i - 1]) {
                return false
            }
        }
        return true
    }
}