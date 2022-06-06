import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<Long> l1 = new ArrayList<>();
        l1.add((long)(1));
        ArrayList<ArrayList<Long>> res = new ArrayList<>();
        res.add(l1);
        if(n == 1)
            return res;
        
        l1 = new ArrayList<>();
        l1.add((long)(1));
        l1.add((long)(1));
        res.add(l1);
        if(n == 2)
            return res;
     
        int i = 3;
        while(i <= n) {
            ArrayList<Long> curr = new ArrayList<>();
            curr.add((long)(1));
            ArrayList<Long> prev = res.get(i-2);
            for(int j = 1; j <= i-2; j++) {
                curr.add(prev.get(j) + prev.get(j-1));
            }
            curr.add((long)(1));
            res.add(curr);
            i++;
        }
        return res;
    }
}
