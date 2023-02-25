//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution

{
    
    public int[] LIS(int[] nums){
         int n=nums.length;
        int[] dp=new int[n];
        int ans=1;
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int prev=0;prev<i;prev++){
                if(nums[i]>nums[prev]){
                    if(1+dp[prev]>dp[i]){
                        
                        dp[i]=1+dp[prev];
                        ans=Math.max(ans,dp[i]);
                    }
                }
            }
        }
        return dp;
    }
    
    
    
    public int LongestBitonicSequence(int[] nums)
    {
        // Code here
        int[] dp1=LIS(nums);
       int n=nums.length;
        int dp[]=new int[n];
        Arrays.fill(dp,1);
        for(int i=n-1;i>=0;i--){
            for(int prev=n-1;prev>i;prev--){
                if(nums[i]>nums[prev] && dp[i]<dp[prev]+1) dp[i]=dp[prev]+1;
            }
        }
        int mx=1;
        for(int i=0;i<nums.length;i++){
            mx=Math.max(mx,dp1[i]+dp[i]-1);
        }
        return mx;
    }
}