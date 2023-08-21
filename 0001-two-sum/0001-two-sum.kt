class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val numToIndex = mutableMapOf<Int, Int>()
        
        for (i in nums.indices) {
            val complement = target - nums[i]
            
            if (numToIndex.containsKey(complement)) {
                return intArrayOf(numToIndex[complement]!!, i)
            }
            
            numToIndex[nums[i]] = i
        }
        return intArrayOf()
    }
}