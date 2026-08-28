class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int low = 0; 
        int high = numbers.length - 1;
        
        // Loop safely until pointers meet
        while (low < high) {
            int currentSum = numbers[low] + numbers[high];
            
            if (currentSum == target) {
                // Return 1-indexed positions as required by LeetCode 167
                return new int[]{low + 1, high + 1};
            } 
            // If sum is too small, we need a larger number -> move low right
            else if (currentSum < target) {
                low++;
            } 
            // If sum is too big, we need a smaller number -> move high left
            else {
                high--;
            }
        }
        
        // Return an empty array if no solution is found (fallback)
        return new int[]{-1, -1};
    }
}
