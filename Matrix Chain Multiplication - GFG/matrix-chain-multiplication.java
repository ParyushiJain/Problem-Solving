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
    static int dp[][];
    static int matrixMultiplication(int N, int arr[])
    {
        // code here
        int i=1;
        int j=N-1;
        dp=new int[N][N];
        for(int a=0;a<N;a++){
            Arrays.fill(dp[a],-1);
        }
        return sol(arr,i,j);
    }
    static int sol(int[] arr,int i,int j){
        if(i>=j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int mn=Integer.MAX_VALUE;
        for(int k=i;k<=j-1;k++){
            int t=sol(arr,i,k)+sol(arr,k+1,j)+(arr[i-1]*arr[k]*arr[j]);
            mn=Math.min(mn,t);
        }
        return dp[i][j]=mn;
    }
}