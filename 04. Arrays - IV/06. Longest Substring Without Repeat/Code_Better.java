class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        int l = 0, r = 0;
        HashSet<Character> set = new HashSet<>();
        while(r < s.length()) {
            if(!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                res = Math.max(res, r-l+1);
                r++;
            } else {
                while(s.charAt(l) != s.charAt(r)) {
                    set.remove(s.charAt(l));
                    l++;
                }
                set.remove(s.charAt(l));
                l++;
            }
        }
        return res;
    }
}

// Time Complexity : O(2*n)
// Space Complexity : O(n)
