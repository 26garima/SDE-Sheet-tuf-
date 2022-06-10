class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int res = 0;
        
        for(int x : nums)
            set.add(x);
        
        for(int x : nums) {
            if(!set.contains(x - 1)) {
                int currentNum = x;
                int currCount = 1;
                while(set.contains(currentNum + 1)) {
                    currentNum += 1;
                    currCount++;
                }
                res = Math.max(res, currCount);
            }
        }
        
        return res;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
