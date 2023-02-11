//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String S = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.countWays(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   static int[][][] dp;
    static int countWays(int N, String S){
        // code here
           dp = new int[N+1][N+1][2];
      for(int[][] arr2:dp){
           for(int[] arr1:arr2) 
                Arrays.fill(arr1,-1);
      }
        return solve(S,0,N-1,1);
    }
    static int solve(String s,int i,int j,int val){
        if(i>j) return 0;
        if(dp[i][j][val]!=-1) return dp[i][j][val];
        if(i==j){
             int boolVal=s.charAt(i)=='T'?1:0;
            if(val==boolVal) return 1;
            return 0;
        }
        int ans=0;
        for(int k=i+1;k<j;k+=2){
            int lt=solve(s,i,k-1,1);
            int lf=solve(s,i,k-1,0);
            int rt=solve(s,k+1,j,1);
            int rf=solve(s,k+1,j,0);
            if(s.charAt(k)=='|'){
                if(val==1){
                    ans+=lt*rt+lt*rf+lf*rt;
                }
                else{
                    ans+=lf*rf;
                }
            }
            else if(s.charAt(k)=='&'){
                if(val==1){
                    ans+=rt*lt;
                }
                else{
                    ans+=lt*rf+lf*rt+lf*rf;
                }
            }
            else {
                if(val==1){
                    ans+=rt*lf+rf*lt;
                }
                else{
                   ans+=rt*lt+rf*lf; 
                }
            }
        }
      
        return dp[i][j][val]=ans%1003;
    }
}