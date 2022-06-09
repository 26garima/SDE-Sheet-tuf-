class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int res = 0;
        for(int x : nums) {
            if(count == 0)
                res = x;
            if(x == res)
                count++;
            else
                count--;
        }
        return res;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
