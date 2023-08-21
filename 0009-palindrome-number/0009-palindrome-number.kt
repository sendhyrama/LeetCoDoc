class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
        
        val originalNumber = x
        var reversedNumber = 0
        
        var num = x
        while (num > 0) {
            val digit = num % 10
            reversedNumber = reversedNumber * 10 + digit
            num /= 10
        }
        return originalNumber == reversedNumber
    }
    
    fun main() {
        val x1 = 121
        println(isPalindrome(x1))
        
        val x2 = -121
        println(isPalindrome(x2))
        
        val x3 = 10
        println(isPalindrome(x3))
    }
}