class Solution {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        backtrack(candidates, target, 0, mutableListOf(), result)
        return result
    }
    
    fun backtrack(candidates: IntArray, target: Int, start: Int, current: MutableList<Int>, result: MutableList<List<Int>>) {
        if (target == 0) {
            result.add(current.toList())
            return
        }
    
        for (i in start until candidates.size) {
            if (candidates[i] <= target) {
                current.add(candidates[i])
                backtrack(candidates, target - candidates[i], i, current, result)
                current.removeAt(current.size - 1)
            }
        }
    }
}