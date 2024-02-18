func strStr(haystack string, needle string) int {
    
    for i := 0; i <= len(haystack)-len(needle); i++ {
        // Check if the substring of haystack starting at index i matches the needle
        if haystack[i:i+len(needle)] == needle {
            // Return the index if found
            return i
        }
    }
    // Return -1 if needle is not part of haystack
    return -1
}