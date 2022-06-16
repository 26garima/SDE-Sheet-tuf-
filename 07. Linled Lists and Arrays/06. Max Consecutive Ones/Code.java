class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i : nums) {
            if(i == 0) {
                res = Math.max(res, count);
                count = 0;
            } else {
                count++;
                res = Math.max(res, count);
            }
        }
        return res;
    }
}

// Time Compelxity : O(n)
// Space Complexity : O(1)
