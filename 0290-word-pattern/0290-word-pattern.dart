class Solution {
  bool wordPattern(String pattern, String s) {
    List<String> words = s.split(' ');

    if (pattern.length != words.length) {
        return false;
    }

    Map<String, String> patternMap = {};
    Map<String, String> wordMap = {};

    for (int i = 0; i < pattern.length; i++) {
        String char = pattern[i];
        String word = words[i];

        if (!patternMap.containsKey(char) && !wordMap.containsKey(word)) {
            patternMap[char] = word;
            wordMap[word] = char;
        } else if (patternMap[char] != word || wordMap[word] != char) {
        return false;
        }
    }

  return true;
  }
}