class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int res1 = -1;
        int res2 = -1;
        
        for(int x : nums) {
            if(res1 == x)
                count1++;
            else if(res2 == x)
                count2++;
            else if(count1 == 0) {
                res1 = x;
                count1++;
            } else if(count2 == 0) {
                res2 = x;
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0;
        for(int x : nums) {
            if(x == res1)
                count1++;
            if(x == res2)
                count2++;
        }
        int expectedMinCount = (int)(Math.floor(nums.length/3)) + 1;
        List<Integer> res = new ArrayList<>();
        if(count1 >= expectedMinCount)
            res.add(res1);
        if(res1 != res2) {
            if(count2 >= expectedMinCount)
                res.add(res2);
        }
        return res;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(1)
