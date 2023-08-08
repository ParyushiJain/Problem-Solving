//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;
class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int sum = sc.nextInt();
            int N = sc.nextInt();
            int coins[] = new int[N];
            for (int i = 0; i < N; i++) coins[i] = sc.nextInt();
            Solution ob = new Solution();
            System.out.println(ob.count(coins, N, sum));
        }
    }
}


// } Driver Code Ends


// User function Template for Java

class Solution {
    long[][] dp;
    long fun(int i, int[] coins, int s) {
        if(s==0) return 1;
        if(i>=coins.length) return 0;
        if(dp[i][s]!=-1) return dp[i][s];
        long v = s>=coins[i] ? fun(i,coins,s-coins[i]) : 0;
        return dp[i][s] = v + fun(i+1,coins,s);
    }
    public long count(int coins[], int N, int sum) {
        // code here.
        dp = new long[coins.length+1][sum+1];
        for(long[] d : dp) Arrays.fill(d,-1);
        return fun(0,coins,sum);
    }
}