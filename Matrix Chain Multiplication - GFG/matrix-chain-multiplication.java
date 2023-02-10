//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.matrixMultiplication(N, arr));
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution{
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        
        int i=1;
        int j=N-1;
        int[][] dp=new int[N+1][N+1];
        for(int a=0;a<N+1;a++){
            Arrays.fill(dp[a],-1);
        }
        return solve(arr,i,j,dp);
    }
    static int solve(int[] arr,int i,int j,int[][] dp){
         int temp=Integer.MAX_VALUE;
         if(i>=j) return 0;
         if(dp[i][j]!=-1) return dp[i][j];
         for(int k=i;k<=j-1;k++){
             int r=solve(arr,i,k,dp)+solve(arr,k+1,j,dp)+(arr[i-1]*arr[k]*arr[j]);
             temp=Math.min(temp,r);
         }
         return dp[i][j]=temp;
    }
}