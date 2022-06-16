class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length <= 2)
            return res;
        Arrays.sort(nums);
        
        for(int i = 0; i < nums.length - 2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int j = i+1;
                int k = nums.length-1;
                int sum = 0 - nums[i];
                
                while(j < k) {
                    if(nums[j] + nums[k] == sum) {
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        res.add(li);
                        while(j != nums.length - 1 && nums[j] == nums[j+1])
                            j++;
                        while(k != 0 && nums[k] == nums[k-1])
                            k--;
                        j++;
                        k--;
                    } else if(nums[j] + nums[k] < sum)
                        j++;
                    else
                        k--;
                }
            }
        }
        return res;
    }
}

// Time Complexity : O(n*n)
// Space Complexity: O(1)
