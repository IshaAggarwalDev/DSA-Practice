class Solution {
    public static int Solve(int n, int[] dp)
    {
        if(n <= 3) return n ;
        if(dp[n] != -1)
        {
            return dp[n] ;
        }
        int jump1 = Solve(n-1,dp) ;
        int jump2 = Solve(n-2,dp) ;
        return dp[n] =  jump1 + jump2 ;

    }
    public int climbStairs(int n) {
        
        int[] dp = new int[n+1] ;
        for(int i = 0 ; i < n+1 ; i++)
        {
            dp[i] = -1 ;
        }
        return Solve(n,dp) ;
    }
}
