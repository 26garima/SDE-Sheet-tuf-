class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i = 0; i < m; i++) {
            if(target < matrix[i][n-1]) {
                for(int j = 0; j < n; j++) {
                    if(target == matrix[i][j])
                        return true;
                }
            } else if(target == matrix[i][n-1])
                return true;
        }
        return false;
    }
}

// Time Complexity : O(m + n)
// Space Complexity : O(1)
