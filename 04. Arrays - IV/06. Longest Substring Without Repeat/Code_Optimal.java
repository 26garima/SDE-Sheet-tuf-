class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0, r = 0, res = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        
        while(r < s.length()) {
            if(!map.containsKey(s.charAt(r))) {
                map.put(s.charAt(r), r);
                res = Math.max(res, r-l+1);
                r++;
            } else {
                int ind = map.get(s.charAt(r));
                if(ind >= l && ind <= r) {
                    l = ind + 1;
                    map.remove(s.charAt(r));
                } else {
                    map.remove(s.charAt(r));
                }
            }
        }
        return res;
    }
}

// Time Complexity : O(n)
// Space Complexity : O(n)
