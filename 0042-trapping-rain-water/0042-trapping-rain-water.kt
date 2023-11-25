class Solution {
    fun trap(height: IntArray): Int {
        var left = 0
        var right = height.size - 1
        var leftMax = 0
        var rightMax = 0
        var result = 0
        
        while (left < right) {
            leftMax = maxOf(leftMax, height[left])
            rightMax = maxOf(rightMax, height[right])
            
            if (leftMax < rightMax) {
                result += leftMax - height[left]
                left++
            } else {
                result += rightMax - height[right]
                right--
            }
        }
        
        return result
    }
}