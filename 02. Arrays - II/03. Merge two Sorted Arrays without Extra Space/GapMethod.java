class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Gap Method
        int i = m;
        for(int x : nums2) 
            nums1[i++] = x;
        
        int gap = (int)(Math.ceil((m+n)/2.0));
        while(gap >= 1) {
            i = 0;
            int j = gap;
            while(j < (m+n)) {
                if(nums1[i] > nums1[j]) 
                    swap(nums1, i, j);
                i++;
                j++;
            }
            if(gap == 1)
                gap = 0;
            else
                gap = (int)(Math.ceil(gap/2.0));
        }
    }
    
    public void swap(int nums[], int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

// Time Complexity : O(n*log(m+n))
// Space Complexity: O(1)
