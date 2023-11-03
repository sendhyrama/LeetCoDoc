class Solution {
    fun permute(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        generatePermutations(nums, 0, result)
        return result
    }
    
    fun generatePermutations(nums: IntArray, start: Int, result: MutableList<List<Int>>) {
        if (start == nums.size) {
            result.add(nums.toList())
            return
        }
        for (i in start until nums.size) {
            swap(nums, start, i)
            generatePermutations(nums, start + 1, result)
            swap(nums, start, i)
        }
    }

    fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}