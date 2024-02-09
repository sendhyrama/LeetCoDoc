class Solution {
  List<String> summaryRanges(List<int> nums) {
    List<String> result = [];
      
    if (nums.isEmpty) {
      return result;
    }
      
    int start = nums[0];
    int end = nums[0];

    String formatRange(int start, int end) {
      return start == end ? '$start' : '$start->$end';
    }

    for (int i = 1; i < nums.length; i++) {
      if (nums[i] == end + 1) {
        // Continue the current range
        end = nums[i];
      } else {
        // End the current range and add to the result
        result.add(formatRange(start, end));
        // Start a new range
        start = nums[i];
        end = nums[i];
      }
    }

    // Add the last range to the result
    result.add(formatRange(start, end));
    return result;
  }
}