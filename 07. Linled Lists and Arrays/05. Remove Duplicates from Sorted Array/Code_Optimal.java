class Solution {
    public int removeDuplicates(int[] nums) {
        int l = 1, i = 0, n = nums.length;
    
        while(l < n) {
            if(nums[l] != nums[i]) {
                nums[i+1] = nums[l];
                i++;
            } 
            l++;
        }
        return i+1;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
