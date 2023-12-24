func merge(nums1 []int, m int, nums2 []int, n int)  {
    // Start merging from the end of the arrays
    index := m + n - 1
    i, j := m-1, n-1

    // Merge until one of the arrays is ended
    for i >= 0 && j >= 0 {
        if nums1[i] > nums2[j] {
            nums1[index] = nums1[i]
            i--
        } else {
            nums1[index] = nums2[j]
            j--
        }
        index--
    }

    // If nums2 has remaining elements, copy to nums1
    for j >= 0 {
        nums1[index] = nums2[j]
        j--
        index--
    }
}