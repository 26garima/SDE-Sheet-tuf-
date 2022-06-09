class Solution {
    public int uniquePaths(int m, int n) {
        int totalDirections = m + n - 2;
        int rightDirections = n - 1;
        double res = 1;
        
        for(double i = 1; i <= rightDirections; i++) {
            res *= (totalDirections - rightDirections + i) / i;
        }
        return (int)(Math.round(res));
    }
}

// Time Complexity : O(n) OR O(m)
// Space Complexity : O(1)
