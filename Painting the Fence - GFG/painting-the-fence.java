//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java


class Solution
{
    int mod = (int)1e9 + 7;
    long[] dp = new long[5001];
    long countWays(int n,int k)
    {
        //code here.
        if(n==1) return k;
        else if(n==2) return k*k;
        else {
         if(dp[n]!=0) return dp[n];
         return dp[n] = ((countWays(n-2,k)%mod * (k-1))%mod + (countWays(n-1,k)%mod * (k-1))%mod)%mod;
        }
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main (String[] args) throws IOException{
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while(testcases-- > 0){
            //int n=Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] a2 = line.trim().split("\\s+");
            int n =Integer.parseInt(a2[0]);
            int k =Integer.parseInt(a2[1]);

            Solution ob=new Solution();
            //ArrayList<Long> ans=ob.smallestDifferenceTriplet(a,b,c,n);
            long ans=ob.countWays(n,k);
            System.out.println(ans);
        }
    }
}



// } Driver Code Ends