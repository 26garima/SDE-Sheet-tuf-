class Solution {
    public int trap(int[] heights) {
        int n = heights.length;
        if(n <= 2)
            return 0;
        int preMax[] = new int[n];
        int postMax[] = new int[n];
        preMax[0] = heights[0];
        postMax[n-1] = heights[n-1];
        
        for(int i = 1; i < n ; i++) {
            if(preMax[i-1] < heights[i])
                preMax[i] = heights[i];
            else
                preMax[i] = preMax[i-1];
        }
        
        for(int i = n-2; i >= 0; i--) {
            if(postMax[i+1] < heights[i])
                postMax[i] = heights[i];
            else
                postMax[i] = postMax[i+1];
        }
        int res = 0;
        
        for(int i = 1; i < n-1; i++) {
            res += Math.min(preMax[i], postMax[i]) - heights[i];    
        }
        return res;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(N)
