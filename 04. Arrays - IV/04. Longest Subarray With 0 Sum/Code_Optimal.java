import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

	public static int LongestSubsetWithZeroSum(ArrayList<Integer> arr) {
      HashMap<Integer, Integer> map = new HashMap<>();
      int sum = 0;
      int res = 0;
      for(int i = 0; i < arr.size(); i++) {
          sum += arr.get(i);
          if(sum == 0) {
              res = Math.max(res, i+1);
          } else {
              if(map.containsKey(sum))
                 res = Math.max(res, i - map.get(sum));
              else
                  map.put(sum, i);
          }
      }
      return res;
	}
}

// Time Complexity : O(n * log(n))
// Space Complexity : O(n)

