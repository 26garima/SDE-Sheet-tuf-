import java.util.* ;
import java.io.*; 
public class Solution 
{
    public static void sort012(int[] arr)
    {
        int i = -1;
        int j = 0;
        int k = arr.length - 1;
        
        while(j <= k) {
            if(arr[j] == 1) 
                j++;
            else if(arr[j] == 2) {
                swap(arr, j ,k);
                k--;
            }
            else {
                swap(arr, i+1, j);
                i++;
                j++;
            }
        }
    }
    
    public static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

// Time Complexity : O(n)
// Sapce Complexity : O(1)
