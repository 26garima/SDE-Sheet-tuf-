class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int newTarget = target - nums[i] - nums[j];
                int left = j + 1;
                int right = n - 1;
                while(left < right) {
                    if(nums[left] + nums[right] < newTarget)
                        left++;
                    else if(nums[left] + nums[right] > newTarget)
                        right--;
                    else {
                        List<Integer> li = new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[left]);
                        li.add(nums[right]);
                        res.add(li);
                        while(left < right && nums[left] == li.get(2)) {
                                left++;
                        } 
                        while(left < right && nums[right] == li.get(3)) {
                                right--;
                        }
                    }
                }
                while(j+1 < n && nums[j] == nums[j+1]) {
                        j++;
                }
            }
            while(i+1 < n && nums[i] == nums[i+1]) {
                    i++;
            }
        }
        return res;
    }
}

// Time Complexity : O(n * n * n)
// Space Complexity : O(1)
