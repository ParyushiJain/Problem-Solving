//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

class GfG { 
    
	public static void main (String[] args) throws IOException  {
	    
	    //reading input using BufferedReader class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//reading total testcases
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0){
		    
		    //reading number of eggs and floors
		    String inputLine[] = br.readLine().trim().split(" ");
		    
		    int n = Integer.parseInt(inputLine[0]);
		    int k = Integer.parseInt(inputLine[1]);
		    
		    //calling eggDrop() method of class
		    //EggDrop
		    System.out.println(new Solution().eggDrop(n, k));
		}
	}
}



// } Driver Code Ends


class Solution 
{
    //Function to find minimum number of attempts needed in 
    //order to find the critical floor.
    static int[][] dp;
    static int eggDrop(int k, int n) 
	{
	    // Your code here
	     if(n==0 || n==1) return n;
        if(k==0) return 0;
        if(k==1) return n;
       dp=new int[k+1][n+1];
        
       return sol(k,n);
	    
	}
 static int sol(int k,int n){
        if(n==0 || n==1) return dp[k][n]= n;
        if(k==0) return dp[k][n]= 0;
        if(k==1) return dp[k][n]= n;
         if(dp[k][n]!=0) return dp[k][n];

        int mn=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int t1;
            int t2;
            if(dp[k-1][i-1]!=0) t1=dp[k-1][i-1];
            else t1=sol(k-1,i-1);
            if(dp[k][n-i]!=0) t2=dp[k][n-i];
            else t2=sol(k,n-i);
            int t=1+Math.max(t1,t2);
            mn=Math.min(mn,t);
        }
        return dp[k][n]=mn;
    }
}