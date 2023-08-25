class Solution {
    fun climbStairs(n: Int): Int {
        if (n <= 2) {
            return n
        }
        
        val cs = IntArray (n+1)
        cs[1] = 1
        cs[2] = 2
        
        for (i in 3..n) {
            cs[i] = cs[i-1] + cs[i-2]
        }
        return cs[n]
    }
}