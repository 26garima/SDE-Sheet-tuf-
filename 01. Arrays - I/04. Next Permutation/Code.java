class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1, ind2 = -1;
        int n = nums.length;
        
        for(int i = n-2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                ind1 = i;
                break;
            }
        }
        if(ind1 != -1) {
            for(int i = n-1; i >= 0; i--) {
                if(nums[ind1] < nums[i]) {
                    ind2 = i;
                    break;
                }
            }
            swap(nums, ind1, ind2);
        }
        reverse(nums, ind1 + 1, n-1);
    }
    
    public void swap(int nums[], int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
    
    public void reverse(int nums[], int i, int j) {
        while(i <= j) 
            swap(nums, i++, j--);
    }
}

// Time Complexity : O(n)
// Space Complexity: O(1)
