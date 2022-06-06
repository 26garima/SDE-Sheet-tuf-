class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        List<List<Integer>> result = new ArrayList<>();
        
        int currStart = intervals[0][0];
        int currEnd = intervals[0][1];
        
        for(int i = 1; i < intervals.length; i++) {
           if(intervals[i][0] <= currEnd) {
               currStart = Math.min(currStart, intervals[i][0]);
               currEnd = Math.max(currEnd, intervals[i][1]);
           } else {
               List<Integer> li = new ArrayList<>();
               li.add(currStart);
               li.add(currEnd);
               result.add(li);
               currStart = intervals[i][0];
               currEnd = intervals[i][1];
           }
        }
        
        List<Integer> li = new ArrayList<>();
        li.add(currStart);
        li.add(currEnd);
        result.add(li);
        
        int arr[][] = new int[result.size()][2];
        int i = 0;
        for(List<Integer> l1 : result) {
            arr[i][0] = l1.get(0);
            arr[i][1] = l1.get(1);
            i++;
        }
        return arr;
    }
}

// Time Complexity : O(n*log(n))
// Space Complexity : O(n)
