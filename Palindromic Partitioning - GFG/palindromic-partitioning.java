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
            String str = in.readLine();
            Solution ob = new Solution();
            System.out.println(ob.palindromicPartition(str));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static int palindromicPartition(String str)
    {
        // code here
        int i=0;
        int j=str.length()-1;
        int n=str.length();
        int[][] dp=new int[n+1][n+1];
        for(int a=0;a<n+1;a++){
            Arrays.fill(dp[a],-1);
        }
        return sol(str,i,j,dp);
    }
    static boolean isPal(String s,int i,int j){
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--)) return false;
            
        }
        return true;
    }
    static int sol(String s,int i,int j,int[][] dp){
        if(dp[i][j]!=-1) return dp[i][j];
        int mn=Integer.MAX_VALUE;
        if(i>=j) return 0;
        if(isPal(s,i,j)) return 0;
        for(int k=i;k<=j-1;k++){
            int t=sol(s,i,k,dp)+sol(s,k+1,j,dp)+1;
            mn=Math.min(mn,t);
        }
        return dp[i][j]=mn;
    }
}