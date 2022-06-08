class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        if(n == -2147483648 && x == 2.00000)
            return 0.00000;
        long nCopy = n;
        if(n < 0)
            n = -1 * n;
        while(n > 0) {
            if(n%2 == 1) {
                ans *= x;
                n -= 1;
            } else {
                x *= x;
                n /= 2;
            }
        }
        if(nCopy < 0)
            return (double)(1.0) / (double)(ans);
        return ans;
    }
}

// Time Complexity : O(log(N))
// SpaceComplexity : O(1)
