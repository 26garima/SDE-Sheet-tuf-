import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> A, int n) {
        // Write your code here
        int xor = 0;

        // xor all elements
        for(int x : A)
            xor ^= x;
        
        // xor from 1 to n
        for(int i = 1; i <= A.size(); i++) 
            xor ^= i;

        int setBit = xor & (~xor + 1);
        
        int a = 0;
        int b = 0;
        
        for(int x : A) {
            if((setBit & x) != 0)
                a = a ^ x;
            else 
                b = b ^ x;
        }    
        
        for(int i = 1; i <= A.size(); i++) {
            if((setBit & i) != 0)
                a = a ^ i;
            else 
                b = b ^ i;
        }
        
        int repeated = 0;
        int missing = 0;
        for(int x : A) {
            if(x == a)
                repeated = a;
            if(x == b)
                repeated = b;
        }

        if(repeated == a)
            missing = b;
        else    
            missing = a;
        
        int res[] = new int[2];
        res[0] = missing;
        res[1] = repeated;
        return res;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
