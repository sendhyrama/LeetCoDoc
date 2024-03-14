func canJump(nums []int) bool {
    maxJump := 0
    n := len(nums)
    for i := 0; i < n; i++ {
        if i > maxJump {
            return false
        }
        maxJump = max(maxJump, i+nums[i])
        if maxJump >= n-1 {
            return true
        }
    }
    return false
}