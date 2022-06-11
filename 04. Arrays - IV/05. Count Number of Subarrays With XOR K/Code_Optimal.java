import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer> arr, int x) {
        int xor = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int ele : arr) {
            xor ^= ele;
            if(xor == x)
                count++;
            int y = xor ^ x;
            if(map.containsKey(y))
                count += map.get(y);
            if(!map.containsKey(xor))
                map.put(xor, 1);
            else
                map.put(xor, map.get(xor) + 1);
        }
        return count;
	}
}

// Time Complexity : O(n * log(n))
// Space Complexity : O(n)
