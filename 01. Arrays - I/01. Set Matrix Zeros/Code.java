import java.util.* ;
import java.io.*; 
public class Solution {
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int rowFlag = 0;
        int n = matrix.length;
        int m = matrix[0].length;
        
        for(int i = 0; i < m; i++) {
            if(matrix[0][i] == 0)
                rowFlag = 1;
        }
        
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }
        
        for(int i = n-1; i >= 1; i--) {
            for(int j = m-1; j >= 0; j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) 
                    matrix[i][j] = 0;
            }
        }
        
        if(rowFlag == 1) {
            for(int i = 0; i < m; i++) {
                matrix[0][i] = 0;
            }
        }
    }
}

// Time Complexity : O(m*n)
// Space Complexity : O(1)
