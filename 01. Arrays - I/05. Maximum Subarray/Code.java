class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int result = Integer.MIN_VALUE;
        for(int i : nums) {
            sum += i;
            result = Math.max(result, sum);
            if(sum < 0)
                sum = 0;
        }
        return result;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
