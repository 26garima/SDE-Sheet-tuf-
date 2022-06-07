class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        
        if(m == 0) {
            int ind = 0;
            for(int x : nums2) 
                nums1[ind++] = x;
            return;
        } 
        
        if(n == 0)
            return;
        
        while(i < m) {
            if(nums1[i] <= nums2[j])
                i++;
            else {
                int t = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = t;
                i++;
                int k = j;
                while(k < n-1) {
                    if(nums2[k] > nums2[k+1]) {
                        swap(nums2, k, k+1);
                    }
                    k++;
                }                
            }
        }
        
        while(j < n) {
            nums1[i++] = nums2[j++];
        }
    }
    
    public void swap(int nums2[], int i, int j) {
        int t = nums2[i];
        nums2[i] = nums2[j];
        nums2[j] = t;
    }
}

// Time Complexity : O(m*n)
// Space Complexity : O(1)
