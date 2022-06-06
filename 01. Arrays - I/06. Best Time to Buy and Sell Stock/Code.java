class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int result = 0;
        for(int x : prices) {
            min = Math.min(min, x);
            int profit = x - min;
            result = Math.max(result, profit);
        }
        return result;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
