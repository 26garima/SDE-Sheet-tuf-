class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        for(int i = 0; i < n; i++) {
            reverse(matrix[i], 0, n-1);
        }
    }
    
    public void reverse(int arr[], int i, int j) {
        int t;
        while(i <= j) {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
    }
}

// Time Complexity : O(n*n)
// Space Complexity : O(1)
