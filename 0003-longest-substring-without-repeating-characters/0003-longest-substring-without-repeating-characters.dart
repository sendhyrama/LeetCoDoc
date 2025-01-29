class Solution {
  int lengthOfLongestSubstring(String s) {
    Map<String, int> charIndexMap = {};
    int maxLength = 0;
    int start = 0;

    for (int end = 0; end < s.length; end++) {
        String currentChar = s[end];

        if (charIndexMap.containsKey(currentChar) && charIndexMap[currentChar] ! >= start ){
            start = charIndexMap[currentChar]!+1;
            
        }
            charIndexMap[currentChar] = end;
            
            maxLength = (end-start+1) > maxLength ? (end-start+1) : maxLength;
    }
    return maxLength;
  }
}